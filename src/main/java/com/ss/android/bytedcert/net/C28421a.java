package com.ss.android.bytedcert.net;

/* renamed from: com.ss.android.bytedcert.net.a */
public class C28421a {

    /* renamed from: a */
    private final String f71480a;

    /* renamed from: b */
    private final String f71481b;

    /* renamed from: a */
    public String mo101199a() {
        return this.f71480a;
    }

    public int hashCode() {
        int i;
        String str = this.f71480a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.f71481b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f71480a;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        sb.append(str);
        sb.append(": ");
        String str3 = this.f71481b;
        if (str3 != null) {
            str2 = str3;
        }
        sb.append(str2);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C28421a aVar = (C28421a) obj;
        String str = this.f71480a;
        if (str == null ? aVar.f71480a != null : !str.equals(aVar.f71480a)) {
            return false;
        }
        String str2 = this.f71481b;
        String str3 = aVar.f71481b;
        if (str2 == null ? str3 == null : str2.equals(str3)) {
            return true;
        }
        return false;
    }

    public C28421a(String str, String str2) {
        this.f71480a = str;
        this.f71481b = str2;
    }
}
