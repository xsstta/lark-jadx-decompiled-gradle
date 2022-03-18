package com.ss.android.lark.edu.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.lark.pb.im.v1.Class;
import java.util.Set;

public class ClassInfo implements Parcelable {
    public static final Parcelable.Creator<ClassInfo> CREATOR = new Parcelable.Creator<ClassInfo>() {
        /* class com.ss.android.lark.edu.dto.ClassInfo.C369581 */

        /* renamed from: a */
        public ClassInfo[] newArray(int i) {
            return new ClassInfo[i];
        }

        /* renamed from: a */
        public ClassInfo createFromParcel(Parcel parcel) {
            return new ClassInfo(parcel);
        }
    };

    /* renamed from: a */
    private String f95005a;

    /* renamed from: b */
    private String f95006b;

    /* renamed from: c */
    private boolean f95007c;

    /* renamed from: d */
    private boolean f95008d;

    /* renamed from: e */
    private String f95009e;

    /* renamed from: f */
    private String f95010f;

    public int describeContents() {
        return 0;
    }

    public ClassInfo() {
    }

    /* renamed from: a */
    public String mo136387a() {
        return this.f95005a;
    }

    /* renamed from: b */
    public String mo136390b() {
        return this.f95006b;
    }

    /* renamed from: d */
    public String mo136395d() {
        return this.f95009e;
    }

    /* renamed from: e */
    public String mo136398e() {
        return this.f95010f;
    }

    /* renamed from: f */
    public boolean mo136399f() {
        return this.f95008d;
    }

    /* renamed from: c */
    public boolean mo136394c() {
        return this.f95007c;
    }

    /* renamed from: c */
    public void mo136393c(String str) {
        this.f95009e = str;
    }

    /* renamed from: a */
    public void mo136388a(String str) {
        this.f95005a = str;
    }

    /* renamed from: b */
    public void mo136391b(String str) {
        this.f95006b = str;
    }

    /* renamed from: d */
    public void mo136396d(String str) {
        this.f95010f = str;
    }

    /* renamed from: a */
    public void mo136389a(boolean z) {
        this.f95007c = z;
    }

    /* renamed from: b */
    public void mo136392b(boolean z) {
        this.f95008d = z;
    }

    protected ClassInfo(Parcel parcel) {
        boolean z;
        this.f95005a = parcel.readString();
        this.f95006b = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f95007c = z;
        this.f95009e = parcel.readString();
        this.f95010f = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f95005a);
        parcel.writeString(this.f95006b);
        parcel.writeByte(this.f95007c ? (byte) 1 : 0);
        parcel.writeString(this.f95009e);
        parcel.writeString(this.f95010f);
    }

    /* renamed from: a */
    public static ClassInfo m145876a(Class r2, Set<String> set) {
        ClassInfo classInfo = new ClassInfo();
        classInfo.mo136393c(r2.chat_id);
        classInfo.mo136388a(r2.id);
        classInfo.mo136391b(r2.name);
        classInfo.mo136389a(r2.has_chat.booleanValue());
        classInfo.mo136392b(set.contains(r2.id));
        return classInfo;
    }
}
