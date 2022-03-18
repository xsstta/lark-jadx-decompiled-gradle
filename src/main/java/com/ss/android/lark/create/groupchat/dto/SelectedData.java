package com.ss.android.lark.create.groupchat.dto;

import java.io.Serializable;

public class SelectedData implements Serializable {
    public String avatarKey;
    public DataType dataType;
    public String description;
    public int descriptionDrawable;
    public String id;
    public boolean isRegistered = true;
    public boolean isShowDescription;
    public String name;

    public enum DataType {
        CHATTER(1),
        CHAT(2),
        UNKNOWN(0),
        DEPARTMENT(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static DataType valueOf(int i) {
            return forNumber(i);
        }

        public static DataType forNumber(int i) {
            if (i == 1) {
                return CHATTER;
            }
            if (i == 2) {
                return CHAT;
            }
            if (i != 3) {
                return UNKNOWN;
            }
            return DEPARTMENT;
        }

        private DataType(int i) {
            this.value = i;
        }
    }

    public SelectedData() {
    }

    public SelectedData(DataType dataType2, String str, String str2, String str3, boolean z, boolean z2, String str4, int i) {
        this.dataType = dataType2;
        this.id = str;
        this.name = str2;
        this.avatarKey = str3;
        this.isRegistered = z;
        this.isShowDescription = z2;
        this.description = str4;
        this.descriptionDrawable = i;
    }
}
