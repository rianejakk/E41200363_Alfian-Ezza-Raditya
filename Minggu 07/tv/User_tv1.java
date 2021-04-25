package com.clas.tv;

public class User_tv1 {
    public static void main(String[] args) {
        Televisi tv = new Televisi("TV Tempoe Doeloe, 14 inches", 10, "Fian");
        String[] semua_channel = {"RCTI", "SCTV", "INDOSIAR", "LA TV", "Metro TV", "Trans TV", "TPI", "TV 7", "TVRI", "TV G", "ANTV"};
        String[] channel_favorit = {"RCTI", "SCTV", "INDOSIAR", "LA TV", "Metro TV", "Trans TV", "TPI", "Trans 7", "Nat Geo Wild"};

        tv.getDeskripsi();
        tv.getChannels();
        tv.setChannels(semua_channel);
        tv.setChannels(channel_favorit);

        tv.setChannelAktif(3);
        tv.setVolume(10);
        tv.setChannelAktif(1);
        tv.setChannelAktif(9);
    }
}

