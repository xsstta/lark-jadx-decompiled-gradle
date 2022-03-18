package com.bytedance.ee.bear.contract.drive;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

public class DriveCache implements Parcelable {
    public static final Parcelable.Creator<DriveCache> CREATOR = new Parcelable.Creator<DriveCache>() {
        /* class com.bytedance.ee.bear.contract.drive.DriveCache.C51321 */

        /* renamed from: a */
        public DriveCache[] newArray(int i) {
            return new DriveCache[i];
        }

        /* renamed from: a */
        public DriveCache createFromParcel(Parcel parcel) {
            return new DriveCache(parcel);
        }
    };

    /* renamed from: a */
    private String f14851a = "";

    /* renamed from: b */
    private File f14852b;

    /* renamed from: c */
    private String f14853c = "";

    /* renamed from: d */
    private String f14854d = "";

    /* renamed from: e */
    private String f14855e = "";

    /* renamed from: f */
    private String f14856f = "";

    /* renamed from: g */
    private int f14857g = -1;

    /* renamed from: h */
    private String f14858h = "";

    /* renamed from: i */
    private String f14859i = "";

    /* renamed from: j */
    private long f14860j;

    /* renamed from: k */
    private String f14861k;

    /* renamed from: l */
    private int f14862l;

    /* renamed from: m */
    private String f14863m;

    /* renamed from: n */
    private String f14864n;

    /* renamed from: o */
    private String f14865o;

    /* renamed from: p */
    private boolean f14866p;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String mo20319a() {
        return this.f14851a;
    }

    /* renamed from: b */
    public File mo20325b() {
        return this.f14852b;
    }

    /* renamed from: c */
    public String mo20328c() {
        return this.f14853c;
    }

    /* renamed from: d */
    public String mo20330d() {
        return this.f14854d;
    }

    /* renamed from: e */
    public int mo20333e() {
        return this.f14857g;
    }

    /* renamed from: f */
    public String mo20335f() {
        return this.f14858h;
    }

    /* renamed from: g */
    public String mo20337g() {
        return this.f14859i;
    }

    /* renamed from: l */
    public String mo20347l() {
        return this.f14861k;
    }

    /* renamed from: m */
    public String mo20348m() {
        return this.f14865o;
    }

    /* renamed from: j */
    public boolean mo20344j() {
        return this.f14866p;
    }

    /* renamed from: h */
    public long mo20339h() {
        File file = this.f14852b;
        if (file != null) {
            return file.length();
        }
        return 0;
    }

    /* renamed from: i */
    public long mo20341i() {
        File file = this.f14852b;
        if (file != null) {
            return file.length();
        }
        return 0;
    }

    public DriveCache() {
    }

    /* renamed from: k */
    public boolean mo20346k() {
        if (!mo20344j() || mo20325b().exists()) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "DriveCache{key='" + this.f14851a + '\'' + ", file=" + this.f14852b + ", previewExt='" + this.f14853c + '\'' + ", dataVersion='" + this.f14854d + '\'' + ", sourceFrom='" + this.f14855e + '\'' + ", sourceExt='" + this.f14856f + '\'' + ", type=" + this.f14857g + ", fileName='" + this.f14858h + '\'' + ", objToken='" + this.f14859i + '\'' + ", modificationTime=" + this.f14860j + ", previewExtra=" + this.f14861k + ", cacheHost='" + this.f14862l + '\'' + ", sdkExtra=" + this.f14863m + ", sdkAppId=" + this.f14864n + ", mimeType=" + this.f14865o + ", webOffice=" + this.f14866p + '}';
    }

    /* renamed from: h */
    public void mo20340h(String str) {
        this.f14863m = str;
    }

    /* renamed from: i */
    public void mo20342i(String str) {
        this.f14861k = str;
    }

    /* renamed from: j */
    public void mo20343j(String str) {
        this.f14864n = str;
    }

    /* renamed from: k */
    public void mo20345k(String str) {
        this.f14865o = str;
    }

    /* renamed from: a */
    public void mo20320a(int i) {
        this.f14857g = i;
    }

    /* renamed from: b */
    public void mo20326b(int i) {
        this.f14862l = i;
    }

    /* renamed from: c */
    public void mo20329c(String str) {
        this.f14854d = str;
    }

    /* renamed from: d */
    public void mo20331d(String str) {
        this.f14855e = str;
    }

    /* renamed from: e */
    public void mo20334e(String str) {
        this.f14856f = str;
    }

    /* renamed from: f */
    public void mo20336f(String str) {
        this.f14858h = str;
    }

    /* renamed from: g */
    public void mo20338g(String str) {
        this.f14859i = str;
    }

    /* renamed from: a */
    public void mo20321a(long j) {
        this.f14860j = j;
    }

    /* renamed from: b */
    public void mo20327b(String str) {
        this.f14853c = str;
    }

    /* renamed from: a */
    public void mo20322a(File file) {
        this.f14852b = file;
    }

    /* renamed from: a */
    public void mo20323a(String str) {
        this.f14851a = str;
    }

    protected DriveCache(Parcel parcel) {
        this.f14851a = parcel.readString();
        this.f14852b = (File) parcel.readSerializable();
        this.f14853c = parcel.readString();
        this.f14854d = parcel.readString();
        this.f14855e = parcel.readString();
        this.f14856f = parcel.readString();
        this.f14857g = parcel.readInt();
        this.f14858h = parcel.readString();
        this.f14859i = parcel.readString();
        this.f14860j = parcel.readLong();
        this.f14861k = parcel.readString();
        this.f14862l = parcel.readInt();
        this.f14863m = parcel.readString();
        this.f14864n = parcel.readString();
        this.f14866p = parcel.readInt() != 1 ? false : true;
    }

    /* renamed from: a */
    public void mo20324a(boolean z) {
        this.f14866p = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14851a);
        parcel.writeSerializable(this.f14852b);
        parcel.writeString(this.f14853c);
        parcel.writeString(this.f14854d);
        parcel.writeString(this.f14855e);
        parcel.writeString(this.f14856f);
        parcel.writeInt(this.f14857g);
        parcel.writeString(this.f14858h);
        parcel.writeString(this.f14859i);
        parcel.writeLong(this.f14860j);
        parcel.writeString(this.f14861k);
        parcel.writeInt(this.f14862l);
        parcel.writeString(this.f14863m);
        parcel.writeString(this.f14864n);
        parcel.writeInt(this.f14866p ? 1 : 0);
    }
}
