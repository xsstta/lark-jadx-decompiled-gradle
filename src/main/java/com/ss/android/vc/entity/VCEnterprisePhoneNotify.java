package com.ss.android.vc.entity;

import java.io.Serializable;

public class VCEnterprisePhoneNotify implements Serializable {
    public Action action;
    public C60926a callerUnreachedToastData;
    public String enterprisePhoneId;

    public enum Action {
        CALLER_RINGING(0),
        CALL_EXCEPTION_TOAST_CALLER_UNREACHED(1);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Action fromValue(int i) {
            if (i == 0) {
                return CALLER_RINGING;
            }
            if (i != 1) {
                return null;
            }
            return CALL_EXCEPTION_TOAST_CALLER_UNREACHED;
        }

        private Action(int i) {
            this.value = i;
        }
    }

    public String toString() {
        return "enterprisePhoneId = " + this.enterprisePhoneId + " action = " + this.action.toString();
    }

    /* renamed from: com.ss.android.vc.entity.VCEnterprisePhoneNotify$a */
    public static class C60926a {

        /* renamed from: a */
        public String f152474a;

        public C60926a(String str) {
            this.f152474a = str;
        }
    }
}
