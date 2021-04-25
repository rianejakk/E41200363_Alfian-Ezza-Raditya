package com.clas.tv;

public class Televisi {
    String pembeli;
    String nama_tv;
    String[] channel;
    int jml_channels;

    protected Televisi(String nama_tv, int num_channels, String pembeli) {
        this.nama_tv = nama_tv;
        this.jml_channels = num_channels;
        channel = new String[jml_channels];
        this.pembeli = pembeli;
    }
    public void getDeskripsi() {
        System.out.println(pembeli + " membeli " + nama_tv);
    }
    public void setChannels(String[] channel) {
        if (channel.length > this.jml_channels)
            System.out.println("Jumlah channel melampaui limit.");
        if (channel.length > 0 && channel.length <= this.jml_channels) {
            this.channel = channel;
            System.out.println("Channel TV telah diset.");
        }
    }
    public void getChannels() {
        if (jml_channels == 0)
            System.out.println("Belum ada channel yang diset.");
        if (jml_channels > 0) {
            String channels = "";
            for (String channel : this.channel)
                channels += channel + " ";
            System.out.println("Channel telah diupdate.");
        }
    }

    public void setChannelAktif(int nomer) {
        System.out.println("Channel TV pindah ke acara " + this.channel[nomer-1]);
    }
    public void setVolume(int volume) {
        System.out.println("Volume diset " + volume);
    }
}

