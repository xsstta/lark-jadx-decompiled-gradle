package com.ss.android.lark.maincore;

import android.graphics.Bitmap;

public interface ITitleController {
    /* renamed from: a */
    int mo99189a();

    /* renamed from: a */
    void mo99191a(ITitleInfo iTitleInfo);

    /* renamed from: a */
    void mo99192a(boolean z);

    /* renamed from: b */
    Style mo99193b();

    /* renamed from: b */
    void mo99194b(boolean z);

    /* renamed from: c */
    Bitmap mo99195c();

    public enum Style {
        Old(0),
        New(1);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Style valueOf(int i) {
            return forNumber(i);
        }

        public static Style forNumber(int i) {
            if (i == 0) {
                return Old;
            }
            if (i != 1) {
                return null;
            }
            return New;
        }

        private Style(int i) {
            this.value = i;
        }
    }
}
