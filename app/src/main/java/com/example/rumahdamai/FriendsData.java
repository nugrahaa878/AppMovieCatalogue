package com.example.rumahdamai;

import android.media.Image;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FriendsData {
    public static String[][] data = new String[][]{
            {"Gilang", "Ini dia nih, org yg bikin suasana kls jadi heboh dan jadi rame. Gilang, si gilang ini pasti selalu punya hal aneh yg dikerjakan dan pastinya ngakak, gara gara dia, kls jadi gak bisa diam, apalagi ditambah ketawanya si halima waktu si gilang ngelawak. Abis, kelas udh jadi pasar,tapi justru suasana ini yg bikin kita nyaman di kelas. Selain itu, jgn cari gilang di kls kalau hari jumat,dia gak bakal ada di kelas.Cari di kantin", "gilang", "109276", "Kubang Putiah", "Polman"},
            {"Ari", "Ini dia, orang kurang kerjaan yang bikin bot ini. Anggota kelas yang satu ini selalu bahasa soal olimpiade saat jam pelajaran, pelajaran apapun. Akibatnya, saat ulangan selalu menggunakan Kotak Pensil Ajaib dan hp layar super gelap. Tapi ada efek positif nya juga sih, si ari ini lumayan sering dapat juara di olimpiade komputer dan selalu di tagih traktiran nya sama anak kelas", "ari", "131232", "Panorama", "Universitas Indonesia"},
            {"Fikra", "Fikra, orang yang namanya paling sering salah sebut sama guru, namanya ZIL, bukan ZUL. Tapi anak kelas tetap manggil dia zul. Dia paling sering ketawa mendadak, ketawa nya bikin orang kaget dan kalau dia ketawa, semua orang ngeliat ke dia, sambil bilang manga la si fikra ko. Kalau jalan pasti bareng sama ari, bima, nabil, jefri dkk. Nongkrong di belakang mesjid buat makan buah coklat.", "fikra", "182745", "Gaduik", "Universitas Gajah Mada"},
            {"Halima", "Ini dia orang yang juga bikin suasana kelas rame gara gara ledakan ketawanya. Halima, saingan ketawa nya si abe. Kalau si halima sama abe udah ketawa bareng, mungkin suaranya kedengeran sampai gedung ips. Kalau ada orang yang ngelawak,(grin) yang bikin anak kelas ketawa bukan karena lawakannya, tapi orang ketawa gara gara liat si halima ketawa. Kalau dia ketawa, matanya ilang, entah kemana, mungkin di tarok di kantong? Wallahualam", "halima", "172638", "Gaduik", "Universitas Andalas"},
            {"Tia", "Tia, anggota kelas yang punya paling banyak kisah inspiratif. Semua ceritanya didasarkan pada kisah kakaknya yang kuliah di luar negri. Dia selalu punya cerita yang memotivasi kita yang mendengar ceritanya. Tia duduk di sebelah mia di barisan paling depan. Mungkin dia yang paling sabar menghadapi mia, dia selalu bawa nasi dengan kotak nasi unik dan paling gak mau ngasih makanannya ke si ari.", "tia", "182736", "Gulai Bancah", "STAN"},
            {"Rova", "Rova, mungkin dia anggota kelas paling teladan, waktu jam pelajaran dia yg paling fokus memperhatikan guru ngajar, tapi kalau jam kosong, ya dia pindah ke blkng buat duduk2 sambil main football manager di hpnya(cellphone). Dia juga penggemar berat sepak bola(soccerball), semua pertandingan tadi mlm dia tahu, linenya aja isiny berita bola semua. Selain nnxn bola, dia juga hobi main futsal, tiap main futsal dia selalu ada", "rova", "172635", "Garegeh", "Universitas Andalas"},
            {"Cindy", "Nomor absen 9, cindy. Ini nih, ahli debat kita, dia mungkin salah satu ahli debat paling diandalkan di sma kita(clap), setiap dia ikut lomba debat, hampir bisa dipastikan dia menang(crown).Cindy ini juga salah satu pakar matematika(bank) di kelas kita, dan juga mungkin yang paling sehat(smirk) di kelas kita. Karena yang paling kita ingat dari cindy adalah badan nya yang lumayan besar dan tinggi, bima aja kalah(love)", "cindy", "182546", "Panganak", "Universitas Indonesia"},
            {"Bima", "Bima, si ketua kelas kita(clap). Anggota kelas ini adalah murid pindahan asal Kediri, jadi dia punya ciri khas gaya bicara yang unik dan enak di dengar(sparkling eyes). Walaupun ketua kelas, tiap pulang skolah sang Ketua Kelas ini pasti nongkrong(bicycle) di warnet Qat*yo barengan sama nabil, arik, ari. Di warnet, jangan kira bikin tugas, ni orang malah bikin party buat nge DOTA ria, salut buat ketua kelas kita(hahaha)", "bima", "172645", "Simpang Tembok", "Universitas Gajah Mada"},
            {"Jefri", "Jefri, ini dia, cak lontong nya kls kita(shocked). Kalau ngomong sma si jefri, harus dipikirin dulu baik2, direnungkan dulu, baru ngomongin ke dia, susah ngomong sama ini org. Kadang ngeselin juga ngomong sama si jefri ini(sad), jefri juga salah satu murid kesayangan buk it, setiap buk it nanya, pasti manggil jefri dan jefri gak bisa jawab(clap). Tapi, dibalik itu semua, kalau si jefri lagi ngaji pagi, semua org terdiam karena suaranya yang suuper merdu(love)", "jefri", "182736", "Kambiang Tujuah", "Universitas Andalas"},
            {"Farhan", "Ini dia, siswa yang punya jabatan paling tinggi di SMA kita(school), Sang Ketua OSIS. Farhan, anggota kelas yang paling sibuk dan paling jarang masuk kelas, sekali kali nya masuk kelas, pasti dia tidur di belakang(goodnight)(doze off). Kalau dia lagi di kelas, pasti ada aja yang manggil dia keluar, yang adek kelas lah(eyes), yang ibuk leli manggil lah, pokoknya ada aja yang manggil dia keluar, ya namanya juga ketua osis ya(clap)", "farhan", "162547", "Belakang Balok", "Universitas Andalas"},
            {"Vita", "Vita, sosok amak (moon grin)di kelas kita, karena dia adalah perempuan yang paling sering membantu acara ngumpul ngumpul kita(2 hearts)(3 hearts), kalau ada masak masak, pasti vita ada dan dia yang pergi kepasar bareng cewek yang lainnya, dia leader nya(clap). Yang paling kita ingat adalah saat vita berperan jadi amak amak waktu ambil nilai seni, dapet banget gaya nya, calon nih(1 heart)(1 heart)(rose stalk)", "vita", "162538", "Gurun Panjang", "Universitas Indonesia"},
            {"Abe", "Ini dia, baru juga absen 2. Wanita hebat ini bisa kita sebut Juragan (bank)kelas. Karena apa? Setiap ada urusan/keperluan kls yg butuh duit(calculator). Semua anak kls pasti, nyorakin(hahaha) satu kata : Abeeeee. Saking Juragan nya si abe ini, kalau biasanya murid yg pnya hutang ke kls, kalau ini, kls yg pnya hutang ke abe. Selain keJuragannya si abe. Hal yang paling kita ingat juga adlh Ketawa nya menggelegar, kedengeran sampai lantai 1 (clap)", "abe", "182645", "Sungai Pua", "Binus University"}
    };


    public static ArrayList<Friend> getListData(){
        ArrayList<Friend> list = new ArrayList<>();
        for (String[] aData: data){
            Friend friend = new Friend();
            friend.setName(aData[0]);
            friend.setAbout(aData[1]);
            friend.setPhoto((aData[2]));
            friend.setNisn(aData[3]);
            friend.setAlamat(aData[4]);
            friend.setUniversitas(aData[5]);

            list.add(friend);
        }

        return list;

    };
}
