package com.bytedance.ee.bear.contract.route.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public class DocOperateBean implements Parcelable {
    public static final Parcelable.Creator<DocOperateBean> CREATOR = new Parcelable.Creator<DocOperateBean>() {
        /* class com.bytedance.ee.bear.contract.route.parcelable.DocOperateBean.C52211 */

        /* renamed from: a */
        public DocOperateBean[] newArray(int i) {
            return new DocOperateBean[i];
        }

        /* renamed from: a */
        public DocOperateBean createFromParcel(Parcel parcel) {
            return new DocOperateBean(parcel);
        }
    };

    /* renamed from: a */
    private int f14944a;

    /* renamed from: b */
    private String f14945b;

    /* renamed from: c */
    private String f14946c;

    /* renamed from: d */
    private String f14947d;

    /* renamed from: e */
    private String f14948e;

    /* renamed from: f */
    private int f14949f;

    /* renamed from: g */
    private boolean f14950g;

    /* renamed from: h */
    private boolean f14951h;

    /* renamed from: i */
    private boolean f14952i;

    /* renamed from: j */
    private boolean f14953j;

    /* renamed from: k */
    private String f14954k;

    /* renamed from: l */
    private String f14955l;

    /* renamed from: m */
    private String f14956m;

    /* renamed from: n */
    private String f14957n;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public int mo20971a() {
        return this.f14944a;
    }

    /* renamed from: b */
    public String mo20975b() {
        return this.f14945b;
    }

    /* renamed from: d */
    public int mo20977d() {
        return this.f14949f;
    }

    /* renamed from: e */
    public String mo20979e() {
        return this.f14955l;
    }

    /* renamed from: f */
    public String mo20980f() {
        return this.f14956m;
    }

    /* renamed from: g */
    public String mo20981g() {
        return this.f14957n;
    }

    /* renamed from: h */
    public boolean mo20982h() {
        return this.f14950g;
    }

    /* renamed from: i */
    public boolean mo20983i() {
        return this.f14951h;
    }

    /* renamed from: n */
    public String mo20988n() {
        return this.f14954k;
    }

    /* renamed from: o */
    public boolean mo20989o() {
        return this.f14952i;
    }

    /* renamed from: p */
    public boolean mo20990p() {
        return this.f14953j;
    }

    /* renamed from: l */
    public boolean mo20986l() {
        if (this.f14944a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public String mo20976c() {
        if (TextUtils.isEmpty(this.f14946c)) {
            return "";
        }
        return this.f14946c;
    }

    /* renamed from: k */
    public boolean mo20985k() {
        if (this.f14944a == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean mo20987m() {
        if (this.f14944a == 4) {
            return true;
        }
        return false;
    }

    public DocOperateBean() {
        this.f14945b = "";
        this.f14946c = "";
        this.f14947d = "";
        this.f14948e = "";
        this.f14954k = "";
        this.f14955l = "";
        this.f14956m = "";
        this.f14957n = "";
    }

    /* renamed from: j */
    public String mo20984j() {
        if (mo20985k()) {
            return "search_docs_filter";
        }
        if (mo20986l()) {
            return "search_move";
        }
        return "search_add";
    }

    /* renamed from: a */
    public void mo20972a(int i) {
        this.f14944a = i;
    }

    /* renamed from: a */
    public void mo20973a(String str) {
        this.f14954k = str;
    }

    /* renamed from: a */
    public void mo20974a(boolean z) {
        this.f14953j = z;
    }

    protected DocOperateBean(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f14945b = "";
        this.f14946c = "";
        this.f14947d = "";
        this.f14948e = "";
        this.f14954k = "";
        this.f14955l = "";
        this.f14956m = "";
        this.f14957n = "";
        this.f14944a = parcel.readInt();
        this.f14945b = parcel.readString();
        this.f14946c = parcel.readString();
        this.f14947d = parcel.readString();
        this.f14948e = parcel.readString();
        this.f14949f = parcel.readInt();
        this.f14955l = parcel.readString();
        this.f14956m = parcel.readString();
        this.f14957n = parcel.readString();
        boolean z4 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f14951h = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f14950g = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f14952i = z3;
        this.f14953j = parcel.readByte() == 0 ? false : z4;
        this.f14954k = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14944a);
        parcel.writeString(this.f14945b);
        parcel.writeString(this.f14946c);
        parcel.writeString(this.f14947d);
        parcel.writeString(this.f14948e);
        parcel.writeInt(this.f14949f);
        parcel.writeString(this.f14955l);
        parcel.writeString(this.f14956m);
        parcel.writeString(this.f14957n);
        parcel.writeByte(this.f14951h ? (byte) 1 : 0);
        parcel.writeByte(this.f14950g ? (byte) 1 : 0);
        parcel.writeByte(this.f14952i ? (byte) 1 : 0);
        parcel.writeByte(this.f14953j ? (byte) 1 : 0);
        parcel.writeString(this.f14954k);
    }

    public DocOperateBean(int i, String str, String str2, String str3, String str4, int i2, String str5, String str6, String str7, boolean z, boolean z2, boolean z3) {
        this(i, str, str2, str3, str4, i2, str5, str6, str7, z, z2, "", z3);
    }

    public DocOperateBean(int i, String str, String str2, String str3, String str4, int i2, String str5, String str6, String str7, boolean z, boolean z2, String str8, boolean z3) {
        this.f14945b = "";
        this.f14946c = "";
        this.f14947d = "";
        this.f14948e = "";
        this.f14954k = "";
        this.f14955l = "";
        this.f14956m = "";
        this.f14957n = "";
        this.f14944a = i;
        this.f14945b = str;
        this.f14946c = str2;
        this.f14947d = str3;
        this.f14948e = str4;
        this.f14949f = i2;
        this.f14955l = str5;
        this.f14956m = str6;
        this.f14957n = str7;
        this.f14951h = z;
        this.f14950g = z2;
        this.f14954k = str8;
        this.f14952i = z3;
    }
}
