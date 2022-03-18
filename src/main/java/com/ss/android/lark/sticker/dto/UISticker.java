package com.ss.android.lark.sticker.dto;

import com.ss.android.lark.chat.entity.sticker.Sticker;
import java.io.Serializable;

public class UISticker implements Serializable {
    private String filePath = "";
    private int selected = -1;
    private Sticker sticker;

    public String getFilePath() {
        return this.filePath;
    }

    public int getSelected() {
        return this.selected;
    }

    public Sticker getSticker() {
        return this.sticker;
    }

    public boolean isSelected() {
        if (this.selected > -1) {
            return true;
        }
        return false;
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    public void setSelected(int i) {
        this.selected = i;
    }

    public void setSticker(Sticker sticker2) {
        this.sticker = sticker2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UISticker uISticker = (UISticker) obj;
        Sticker sticker2 = this.sticker;
        if (sticker2 != null) {
            if (sticker2.equals(uISticker.sticker) || this.sticker.getImageKey().equals(uISticker.sticker.getImageKey())) {
                return true;
            }
        } else if (uISticker.sticker == null) {
            return true;
        }
        return false;
    }

    public boolean isExactlySame(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UISticker uISticker = (UISticker) obj;
        if (this.selected != uISticker.selected) {
            return false;
        }
        Sticker sticker2 = this.sticker;
        Sticker sticker3 = uISticker.sticker;
        if (sticker2 != null) {
            return sticker2.equals(sticker3);
        }
        if (sticker3 == null) {
            return true;
        }
        return false;
    }
}
