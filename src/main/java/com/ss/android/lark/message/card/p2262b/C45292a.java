package com.ss.android.lark.message.card.p2262b;

/* renamed from: com.ss.android.lark.message.card.b.a */
public class C45292a {

    /* renamed from: a */
    private String f114657a;

    /* renamed from: b */
    private String f114658b;

    /* renamed from: c */
    private String f114659c;

    /* renamed from: d */
    private boolean f114660d;

    /* renamed from: e */
    private boolean f114661e;

    /* renamed from: f */
    private String f114662f;

    /* renamed from: g */
    private String f114663g;

    /* renamed from: h */
    private int f114664h;

    /* renamed from: i */
    private int f114665i;

    /* renamed from: a */
    public String mo160000a() {
        return this.f114657a;
    }

    /* renamed from: b */
    public String mo160004b() {
        return this.f114658b;
    }

    /* renamed from: c */
    public String mo160008c() {
        return this.f114659c;
    }

    /* renamed from: f */
    public String mo160015f() {
        return this.f114662f;
    }

    /* renamed from: g */
    public String mo160016g() {
        return this.f114663g;
    }

    /* renamed from: h */
    public int mo160017h() {
        return this.f114664h;
    }

    /* renamed from: i */
    public int mo160019i() {
        return this.f114665i;
    }

    /* renamed from: d */
    public boolean mo160011d() {
        return this.f114660d;
    }

    /* renamed from: e */
    public boolean mo160013e() {
        return this.f114661e;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f114657a;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str2 = this.f114658b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str3 = this.f114659c;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (((((i7 + i3) * 31) + (this.f114660d ? 1 : 0)) * 31) + (this.f114661e ? 1 : 0)) * 31;
        String str4 = this.f114662f;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str5 = this.f114663g;
        if (str5 != null) {
            i5 = str5.hashCode();
        }
        return ((((i9 + i5) * 31) + this.f114664h) * 31) + this.f114665i;
    }

    /* renamed from: d */
    public void mo160010d(String str) {
        this.f114662f = str;
    }

    /* renamed from: e */
    public void mo160012e(String str) {
        this.f114663g = str;
    }

    /* renamed from: a */
    public void mo160001a(int i) {
        this.f114664h = i;
    }

    /* renamed from: b */
    public void mo160005b(int i) {
        this.f114665i = i;
    }

    /* renamed from: c */
    public void mo160009c(String str) {
        this.f114659c = str;
    }

    /* renamed from: a */
    public void mo160002a(String str) {
        this.f114657a = str;
    }

    /* renamed from: b */
    public void mo160006b(String str) {
        this.f114658b = str;
    }

    /* renamed from: a */
    public void mo160003a(boolean z) {
        this.f114660d = z;
    }

    /* renamed from: b */
    public void mo160007b(boolean z) {
        this.f114661e = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C45292a aVar = (C45292a) obj;
        if (this.f114660d != aVar.f114660d || this.f114661e != aVar.f114661e || this.f114664h != aVar.f114664h || this.f114665i != aVar.f114665i) {
            return false;
        }
        String str = this.f114657a;
        if (str == null ? aVar.f114657a != null : !str.equals(aVar.f114657a)) {
            return false;
        }
        String str2 = this.f114658b;
        if (str2 == null ? aVar.f114658b != null : !str2.equals(aVar.f114658b)) {
            return false;
        }
        String str3 = this.f114659c;
        if (str3 == null ? aVar.f114659c != null : !str3.equals(aVar.f114659c)) {
            return false;
        }
        String str4 = this.f114662f;
        if (str4 == null ? aVar.f114662f != null : !str4.equals(aVar.f114662f)) {
            return false;
        }
        String str5 = this.f114663g;
        String str6 = aVar.f114663g;
        if (str5 != null) {
            return str5.equals(str6);
        }
        if (str6 == null) {
            return true;
        }
        return false;
    }
}
