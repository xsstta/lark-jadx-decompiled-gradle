package com.ss.android.vc.entity;

public class LangDetectInfo {

    /* renamed from: a */
    public Type f152443a;

    /* renamed from: b */
    public String f152444b;

    /* renamed from: c */
    public String f152445c;

    /* renamed from: d */
    public String f152446d;

    /* renamed from: e */
    public String f152447e;

    public enum Type {
        UNKNOWN(0),
        MISMATCH(1),
        UNSUPPORTED(2);
        
        int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return MISMATCH;
            }
            if (i == 2) {
                return UNSUPPORTED;
            }
            return UNKNOWN;
        }

        private Type(int i) {
            this.value = i;
        }
    }
}
