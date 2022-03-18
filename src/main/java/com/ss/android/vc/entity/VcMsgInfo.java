package com.ss.android.vc.entity;

import java.io.Serializable;
import java.util.Map;

public class VcMsgInfo implements Serializable {
    private static final long serialVersionUID = 1;
    public VcAlert alert;
    public int cmd;
    public int expire = 2000;
    public Map<String, String> extra;
    public boolean isUiShown;
    public boolean is_override;
    public boolean is_show;
    public String meetingId;
    public String message;
    public VcI18nKeyInfo msg_i18n_key;
    public VcI18nKeyInfo msg_title_i18n_key;
    public int timeout;
    public Type type = Type.UNKNOWN;

    public String toString() {
        return "VcMsgInfo{type=" + this.type + ", expire=" + this.expire + '\'' + ", meetingId='" + this.meetingId + '\'' + ", timeout=" + this.timeout + ", cmd=" + this.cmd + ", is_show=" + this.is_show + ", is_override=" + this.is_override + ", extra=" + this.extra + ", isUiShown=" + this.isUiShown + ", alert=" + this.alert + '}';
    }

    public enum Type {
        UNKNOWN(0),
        TIPS(1),
        TOAST(2),
        POPUP(3),
        ALERT(4),
        BROADCAST(5);
        
        private final int value;

        public static Type valueOf(int i) {
            Type type = TIPS;
            if (type.value == i) {
                return type;
            }
            Type type2 = TOAST;
            if (type2.value == i) {
                return type2;
            }
            Type type3 = POPUP;
            if (type3.value == i) {
                return type3;
            }
            Type type4 = ALERT;
            if (type4.value == i) {
                return type4;
            }
            Type type5 = BROADCAST;
            if (type5.value == i) {
                return type5;
            }
            return UNKNOWN;
        }

        private Type(int i) {
            this.value = i;
        }
    }
}
