package com.lynx.component.svg.parser;

import com.lynx.component.svg.parser.C26482f;

/* renamed from: com.lynx.component.svg.parser.a */
class C26472a {

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.parser.a$a */
    public static class C26473a extends C26482f.C26487d {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo93853a() {
            int p = m95824p();
            if (p == this.f65479b) {
                return null;
            }
            String substring = this.f65478a.substring(this.f65479b, p);
            this.f65479b = p;
            return substring;
        }

        /* renamed from: p */
        private int m95824p() {
            if (mo93877c()) {
                return this.f65479b;
            }
            int i = this.f65479b;
            int i2 = this.f65479b;
            int charAt = this.f65478a.charAt(this.f65479b);
            if (charAt == 45) {
                charAt = mo93885k();
            }
            if ((charAt >= 65 && charAt <= 90) || ((charAt >= 97 && charAt <= 122) || charAt == 95)) {
                int k = mo93885k();
                while (true) {
                    if ((k < 65 || k > 90) && ((k < 97 || k > 122) && !((k >= 48 && k <= 57) || k == 45 || k == 95))) {
                        break;
                    }
                    k = mo93885k();
                }
                i2 = this.f65479b;
            }
            this.f65479b = i;
            return i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo93854b() {
            if (mo93877c()) {
                return null;
            }
            int i = this.f65479b;
            int i2 = this.f65479b;
            int charAt = this.f65478a.charAt(this.f65479b);
            while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33 && !mo93876b(charAt)) {
                if (!mo93874a(charAt)) {
                    i2 = this.f65479b + 1;
                }
                charAt = mo93885k();
            }
            if (this.f65479b > i) {
                return this.f65478a.substring(i, i2);
            }
            this.f65479b = i;
            return null;
        }

        C26473a(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }
    }
}
