package com.ss.android.lark.keyboard.plugin.tool.face;

import java.io.Serializable;

public class Sticker implements Serializable {
    public final String filePath;
    public final String key;

    public Sticker() {
        this.key = "";
        this.filePath = "";
    }

    public Sticker(String str, String str2) {
        this.key = str;
        this.filePath = str2;
    }
}
