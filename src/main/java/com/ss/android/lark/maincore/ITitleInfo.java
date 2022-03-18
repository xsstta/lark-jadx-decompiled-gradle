package com.ss.android.lark.maincore;

import java.util.List;

public interface ITitleInfo {

    /* renamed from: com.ss.android.lark.maincore.ITitleInfo$a */
    public interface AbstractC44542a {
        /* renamed from: a */
        void mo99210a();
    }

    /* renamed from: a */
    boolean mo33255a();

    /* renamed from: b */
    String mo33256b();

    /* renamed from: c */
    IconStyle mo33257c();

    /* renamed from: d */
    List<AbstractC44545b> mo33258d();

    /* renamed from: e */
    Status mo33259e();

    /* renamed from: f */
    AbstractC44542a mo33260f();

    /* renamed from: g */
    C44543b mo33261g();

    public enum IconStyle {
        Hide(0),
        Up(1),
        Down(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static IconStyle valueOf(int i) {
            return forNumber(i);
        }

        public static IconStyle forNumber(int i) {
            if (i == 0) {
                return Hide;
            }
            if (i == 1) {
                return Up;
            }
            if (i != 2) {
                return null;
            }
            return Down;
        }

        private IconStyle(int i) {
            this.value = i;
        }
    }

    public enum Status {
        Normal(0),
        Loading(1);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Status valueOf(int i) {
            return forNumber(i);
        }

        public static Status forNumber(int i) {
            if (i == 0) {
                return Normal;
            }
            if (i != 1) {
                return null;
            }
            return Loading;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.maincore.ITitleInfo$b */
    public static class C44543b {

        /* renamed from: a */
        String f112936a;

        /* renamed from: a */
        public String mo158046a() {
            return this.f112936a;
        }
    }
}
