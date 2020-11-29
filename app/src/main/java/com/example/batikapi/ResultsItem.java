package com.example.batikapi;

import com.google.gson.annotations.SerializedName;

public class ResultsItem {
    @SerializedName("id")
    Integer id;

    @SerializedName("nama_batik")
    String namaBatik;

    @SerializedName("daerah_batik")
    String daerahBatik;

    @SerializedName("makna_batik")
    String maknaBatik;

    @SerializedName("harga_rendah")
    Integer hargaRendah;

    @SerializedName("harga_tinggi")
    Integer hargaTinggi;

    @SerializedName("hitung_view")
    Integer hitungView;

    @SerializedName("link_batik")
    String linkBatik;

    public ResultsItem(String namaBatik, String daerahBatik){
        this.namaBatik = namaBatik;
        this.daerahBatik = daerahBatik;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public void setNamaBatik(String namaBatik){
        this.namaBatik = namaBatik;
    }

    public String getNamaBatik(){
        return namaBatik;
    }

    public void setDaerahBatik(String daerahBatik){
        this.daerahBatik = daerahBatik;
    }

    public String getDaerahBatik(){
        return daerahBatik;
    }

    public void setMaknaBatik(String maknaBatik){
        this.maknaBatik = maknaBatik;
    }

    public String getMaknaBatik(){
        return maknaBatik;
    }


    public void setHargaRendah(Integer hargaRendah){
        this.hargaRendah = hargaRendah;
    }

    public Integer getHargaRendah(){
        return hargaRendah;
    }

    public void setHargaTinggi(Integer hargaTinggi){
        this.hargaTinggi = hargaTinggi;
    }

    public Integer getHargaTinggi(){
        return hargaTinggi;
    }

    public void setHitungView(Integer hitungView){
        this.hitungView = hitungView;
    }

    public Integer getHitungView(){
        return hitungView;
    }

    public void setLinkBatik(String linkBatik){
        this.linkBatik = linkBatik;
    }

    public String getLinkBatik(){
        return linkBatik;
    }
}