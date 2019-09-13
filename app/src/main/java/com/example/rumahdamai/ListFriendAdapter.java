package com.example.rumahdamai;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import static android.widget.Toast.LENGTH_SHORT;

public class ListFriendAdapter extends RecyclerView.Adapter<ListFriendAdapter.ListViewHolder> {
    private ArrayList<Friend> listFriend;

    public ListFriendAdapter(ArrayList<Friend> list) {

        this.listFriend = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_friend, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        final Friend friend = listFriend.get(position);


        Context ctx = holder.itemView.getContext();
        Glide.with(ctx)
                .load(ctx.getResources().getIdentifier(friend.getPhoto(), "drawable", ctx.getPackageName()))
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);

        holder.tvName.setText(friend.getName());
        holder.tvAbout.setText(friend.getAbout());

        holder.parentLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.itemView.getContext(), "Share" + listFriend.get(holder.getAdapterPosition()).getName(), LENGTH_SHORT).show();

                Intent intent = new Intent(holder.itemView.getContext(), FriendDetail.class);
                intent.putExtra("image_url", friend.getPhoto());
                intent.putExtra("nama", friend.getName());
                intent.putExtra("about", friend.getAbout());
                intent.putExtra("alamat", friend.getAlamat());
                intent.putExtra("nisn", friend.getNisn());
                intent.putExtra("universitas", friend.getUniversitas());

                holder.itemView.getContext().startActivity(intent);

            }

        });
    }

    @Override
    public int getItemCount() {
        return listFriend.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvAbout;
        RelativeLayout parentLayout;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvAbout = itemView.findViewById(R.id.tv_item_about);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}
