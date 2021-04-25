package com.clas.tv2;

public class User_tvmodern {
    public static void main(String[] args) {
        TelevisiModern tv = new TelevisiModern("TV Modern, 29 inches", 100, "Fian");
        String[] semuaChannel = {"RCTI", "SCTV", "INDOSIAR", "LA TV", "Metro TV", "Trans TV", "TPI", "TV 7", "TVRI", "TV G", "ANTV"};

        tv.getDeskripsi();
        tv.getChannels();
        tv.setChannels(semuaChannel);

        tv.setChannelAktif(3);
        tv.setVolume(10);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
        tv.setModusTampilan(TelevisiModern.TELETEXT);
        tv.setHalamanTeletext(250);
        tv.setModusTampilan(TelevisiModern.TV);
        tv.playCD();
        tv.setDiscTray("The Conjuring");
        tv.playCD();

    }
}
