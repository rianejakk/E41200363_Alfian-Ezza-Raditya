package com.clas.tv2;

import com.clas.tv.Televisi;

public class TelevisiModern extends Televisi {
    String setdm;
    String kaset = "";
    static String TELETEXT = "TELETEXT";
    static String TV    = "TV";

    public TelevisiModern(String name_tv, int max_channels, String buyer) {
        super (name_tv, max_channels, buyer);
    }

    public void setModusTampilan(String displaymode) {
        this.TELETEXT = displaymode;
        System.out.println("Modus Tampilan : " + displaymode);
    }
    public void setHalamanTeletext(int page) {
        System.out.println("Halaman berpindah ke " + page);
    }
    public void playCD() {
        if (kaset.equals(""))
            System.out.println("Tidak ada CD");
        if (!kaset.equals(""))
            System.out.println("Memutar " + kaset + "...");
    }

    public void setDiscTray(String kaset) {
        this.kaset = kaset;
    }

}
