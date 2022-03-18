package com.bytedance.ee.bear.list.cache;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.list.sort.FilterType;
import java.util.Objects;

public class FolderSortStrategy implements Parcelable {
    public static final Parcelable.Creator<FolderSortStrategy> CREATOR = new Parcelable.Creator<FolderSortStrategy>() {
        /* class com.bytedance.ee.bear.list.cache.FolderSortStrategy.C81521 */

        /* renamed from: a */
        public FolderSortStrategy[] newArray(int i) {
            return new FolderSortStrategy[i];
        }

        /* renamed from: a */
        public FolderSortStrategy createFromParcel(Parcel parcel) {
            return new FolderSortStrategy(parcel);
        }
    };

    /* renamed from: a */
    private String f21751a;

    /* renamed from: b */
    private int f21752b;

    /* renamed from: c */
    private String f21753c;

    /* renamed from: d */
    private String f21754d;

    /* renamed from: e */
    private int f21755e;

    /* renamed from: f */
    private boolean f21756f;

    /* renamed from: g */
    private String f21757g;

    /* renamed from: h */
    private String f21758h;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String mo31545a() {
        return this.f21751a;
    }

    /* renamed from: b */
    public int mo31549b() {
        return this.f21755e;
    }

    /* renamed from: c */
    public String mo31552c() {
        return this.f21757g;
    }

    /* renamed from: d */
    public int mo31554d() {
        return this.f21752b;
    }

    /* renamed from: f */
    public String mo31560f() {
        return this.f21753c;
    }

    /* renamed from: g */
    public String mo31561g() {
        return this.f21754d;
    }

    /* renamed from: h */
    public String mo31562h() {
        return this.f21758h;
    }

    /* renamed from: e */
    public boolean mo31558e() {
        return this.f21756f;
    }

    public FolderSortStrategy() {
        this.f21752b = FilterType.ALL.getType();
        this.f21755e = -1;
    }

    public int hashCode() {
        return Objects.hash(this.f21751a, Integer.valueOf(this.f21752b), this.f21753c, this.f21754d, Integer.valueOf(this.f21755e), Boolean.valueOf(this.f21756f));
    }

    public String toString() {
        return "FolderSortStrategy{, type=" + this.f21752b + ", file_type='" + this.f21753c + '\'' + ", forbidden_file_type='" + this.f21754d + '\'' + ", strategy=" + this.f21755e + ", is_asc=" + this.f21756f + ", update_time='" + this.f21757g + '\'' + '}';
    }

    /* renamed from: e */
    public void mo31557e(String str) {
        this.f21758h = str;
    }

    /* renamed from: a */
    public void mo31546a(int i) {
        this.f21755e = i;
    }

    /* renamed from: b */
    public void mo31550b(int i) {
        this.f21752b = i;
    }

    /* renamed from: c */
    public void mo31553c(String str) {
        this.f21753c = str;
    }

    /* renamed from: d */
    public void mo31555d(String str) {
        this.f21754d = str;
    }

    /* renamed from: a */
    public void mo31547a(String str) {
        this.f21751a = str;
    }

    /* renamed from: b */
    public void mo31551b(String str) {
        this.f21757g = str;
    }

    /* renamed from: a */
    public void mo31548a(boolean z) {
        this.f21756f = z;
    }

    protected FolderSortStrategy(Parcel parcel) {
        boolean z;
        this.f21751a = parcel.readString();
        this.f21752b = parcel.readInt();
        this.f21753c = parcel.readString();
        this.f21754d = parcel.readString();
        this.f21755e = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f21756f = z;
        this.f21757g = parcel.readString();
        this.f21758h = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FolderSortStrategy folderSortStrategy = (FolderSortStrategy) obj;
        if (this.f21752b != folderSortStrategy.f21752b || this.f21755e != folderSortStrategy.f21755e || this.f21756f != folderSortStrategy.f21756f || !this.f21751a.equals(folderSortStrategy.f21751a) || !Objects.equals(this.f21753c, folderSortStrategy.f21753c) || !Objects.equals(this.f21754d, folderSortStrategy.f21754d)) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f21751a);
        parcel.writeInt(this.f21752b);
        parcel.writeString(this.f21753c);
        parcel.writeString(this.f21754d);
        parcel.writeInt(this.f21755e);
        parcel.writeByte(this.f21756f ? (byte) 1 : 0);
        parcel.writeString(this.f21757g);
        parcel.writeString(this.f21758h);
    }

    public FolderSortStrategy(String str, int i, String str2, String str3, int i2, boolean z) {
        this.f21751a = str;
        this.f21752b = i;
        this.f21753c = str2;
        this.f21754d = str3;
        this.f21755e = i2;
        this.f21756f = z;
        this.f21757g = String.valueOf(System.currentTimeMillis());
    }
}
