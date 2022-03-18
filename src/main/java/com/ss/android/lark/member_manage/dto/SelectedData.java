package com.ss.android.lark.member_manage.dto;

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
        UNKNOWN(0);
        
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
            if (i != 2) {
                return UNKNOWN;
            }
            return CHAT;
        }

        private DataType(int i) {
            this.value = i;
        }
    }
}
