package com.ss.android.lark.mail.impl.message.pageroute.intantinfo;

import android.os.Parcel;
import android.os.Parcelable;

public class MessageListIntenInfo implements Parcelable {
    public static final Parcelable.Creator<MessageListIntenInfo> CREATOR = new Parcelable.Creator<MessageListIntenInfo>() {
        /* class com.ss.android.lark.mail.impl.message.pageroute.intantinfo.MessageListIntenInfo.C429521 */

        /* renamed from: a */
        public MessageListIntenInfo[] newArray(int i) {
            return new MessageListIntenInfo[0];
        }

        /* renamed from: a */
        public MessageListIntenInfo createFromParcel(Parcel parcel) {
            return new MessageListIntenInfo(parcel);
        }
    };

    /* renamed from: a */
    private String f109379a;

    /* renamed from: b */
    private String f109380b;

    /* renamed from: c */
    private String f109381c;

    /* renamed from: d */
    private String f109382d;

    /* renamed from: e */
    private int f109383e;

    /* renamed from: f */
    private int f109384f = 1;

    /* renamed from: g */
    private int f109385g;

    /* renamed from: h */
    private int f109386h;

    /* renamed from: i */
    private boolean f109387i;

    public int describeContents() {
        return 0;
    }

    /* renamed from: c */
    public String mo154050c() {
        return this.f109380b;
    }

    /* renamed from: d */
    public String mo154052d() {
        return this.f109379a;
    }

    /* renamed from: e */
    public int mo154054e() {
        return this.f109383e;
    }

    /* renamed from: f */
    public String mo154055f() {
        return this.f109381c;
    }

    /* renamed from: h */
    public boolean mo154057h() {
        return this.f109387i;
    }

    /* renamed from: j */
    public String mo154059j() {
        return this.f109382d;
    }

    /* renamed from: g */
    public boolean mo154056g() {
        if (this.f109384f == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo154058i() {
        if (this.f109386h == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo154049b(boolean z) {
        this.f109387i = z;
    }

    /* renamed from: c */
    public void mo154051c(boolean z) {
        this.f109386h = z ? 1 : 0;
    }

    /* renamed from: a */
    public void mo154048a(boolean z) {
        if (z) {
            this.f109384f = 1;
        } else {
            this.f109384f = 0;
        }
    }

    public MessageListIntenInfo(Parcel parcel) {
        boolean z = true;
        this.f109379a = parcel.readString();
        this.f109380b = parcel.readString();
        this.f109381c = parcel.readString();
        this.f109383e = parcel.readInt();
        this.f109384f = parcel.readInt();
        this.f109385g = parcel.readInt();
        this.f109387i = parcel.readInt() != 1 ? false : z;
        this.f109382d = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f109379a);
        parcel.writeString(this.f109380b);
        parcel.writeString(this.f109381c);
        parcel.writeInt(this.f109383e);
        parcel.writeInt(this.f109384f);
        parcel.writeInt(this.f109385g);
        parcel.writeInt(this.f109387i ? 1 : 0);
        parcel.writeString(this.f109382d);
    }

    public MessageListIntenInfo(String str, String str2, String str3, int i, String str4) {
        this.f109379a = str;
        this.f109380b = str2;
        this.f109381c = str3;
        this.f109383e = i;
        this.f109382d = str4;
    }
}
