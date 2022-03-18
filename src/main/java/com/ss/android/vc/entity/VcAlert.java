package com.ss.android.vc.entity;

import java.io.Serializable;

public class VcAlert implements Serializable {
    public Text body;
    public C60927Button footer;
    public C60927Button footer2;
    public Text title;

    /* renamed from: com.ss.android.vc.entity.VcAlert$Button */
    public static class C60927Button implements Serializable {
        public ButtonColor buttonColor;
        public Text text;
        public int wait_time;

        /* renamed from: com.ss.android.vc.entity.VcAlert$Button$ButtonColor */
        public enum ButtonColor {
            BLACK(0),
            RED(1),
            BLUE(2),
            GREY(3);
            
            private int value;

            public int getNumber() {
                return this.value;
            }

            public static ButtonColor forNumber(int i) {
                if (i == 0) {
                    return BLACK;
                }
                if (i == 1) {
                    return RED;
                }
                if (i == 2) {
                    return BLUE;
                }
                if (i != 3) {
                    return BLACK;
                }
                return GREY;
            }

            private ButtonColor(int i) {
                this.value = i;
            }
        }

        public C60927Button() {
        }

        public C60927Button(Text text2, int i) {
            this.text = text2;
            this.wait_time = i;
        }

        public C60927Button(Text text2, int i, int i2) {
            this.text = text2;
            this.wait_time = i;
        }
    }

    public static class Text implements Serializable {
        public String i18n_key;

        public Text() {
        }

        public Text(String str) {
            this.i18n_key = str;
        }
    }
}
