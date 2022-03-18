package com.ss.android.lark.mail.impl.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.mail.impl.utils.C43819s;
import java.util.Objects;

public class MailImage implements Parcelable {
    public static final Parcelable.Creator<MailImage> CREATOR = new Parcelable.Creator<MailImage>() {
        /* class com.ss.android.lark.mail.impl.entity.MailImage.C420741 */

        /* renamed from: a */
        public MailImage[] newArray(int i) {
            return new MailImage[i];
        }

        /* renamed from: a */
        public MailImage createFromParcel(Parcel parcel) {
            return new MailImage(parcel);
        }
    };

    /* renamed from: a */
    private String f106873a;

    /* renamed from: b */
    private String f106874b;

    /* renamed from: c */
    private String f106875c;

    /* renamed from: d */
    private String f106876d;

    /* renamed from: e */
    private long f106877e;

    /* renamed from: f */
    private int f106878f;

    /* renamed from: g */
    private int f106879g;

    /* renamed from: h */
    private String f106880h;

    public int describeContents() {
        return 0;
    }

    public MailImage() {
    }

    /* renamed from: d */
    public String mo151474d() {
        return this.f106873a;
    }

    /* renamed from: e */
    public String mo151477e() {
        return this.f106874b;
    }

    /* renamed from: f */
    public String mo151480f() {
        return this.f106875c;
    }

    /* renamed from: g */
    public String mo151481g() {
        return this.f106876d;
    }

    /* renamed from: h */
    public long mo151482h() {
        return this.f106877e;
    }

    /* renamed from: i */
    public int mo151484i() {
        return this.f106878f;
    }

    /* renamed from: j */
    public int mo151485j() {
        return this.f106879g;
    }

    /* renamed from: k */
    public String mo151486k() {
        return this.f106880h;
    }

    public int hashCode() {
        return Objects.hash(this.f106875c, this.f106876d, this.f106873a);
    }

    /* renamed from: a */
    public void mo151468a(int i) {
        this.f106878f = i;
    }

    /* renamed from: b */
    public void mo151471b(int i) {
        this.f106879g = i;
    }

    /* renamed from: c */
    public void mo151473c(String str) {
        this.f106875c = str;
    }

    /* renamed from: a */
    public void mo151469a(long j) {
        this.f106877e = j;
    }

    /* renamed from: b */
    public void mo151472b(String str) {
        this.f106874b = str;
    }

    /* renamed from: d */
    public void mo151475d(String str) {
        this.f106876d = str;
    }

    /* renamed from: e */
    public void mo151478e(String str) {
        this.f106880h = str;
    }

    /* renamed from: a */
    public void mo151470a(String str) {
        this.f106873a = str;
    }

    /* renamed from: f */
    private boolean m167565f(String str) {
        if (!C43819s.m173689a(this.f106873a) || !C43819s.m173689a(str)) {
            return this.f106873a.equals(str);
        }
        return true;
    }

    public MailImage(Parcel parcel) {
        this.f106873a = parcel.readString();
        this.f106874b = parcel.readString();
        this.f106875c = parcel.readString();
        this.f106876d = parcel.readString();
        this.f106877e = parcel.readLong();
        this.f106878f = parcel.readInt();
        this.f106879g = parcel.readInt();
        this.f106880h = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MailImage mailImage = (MailImage) obj;
        if (!Objects.equals(this.f106875c, mailImage.f106875c) || !m167565f(mailImage.f106873a) || !Objects.equals(this.f106876d, mailImage.f106876d)) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f106873a);
        parcel.writeString(this.f106874b);
        parcel.writeString(this.f106875c);
        parcel.writeString(this.f106876d);
        parcel.writeLong(this.f106877e);
        parcel.writeInt(this.f106878f);
        parcel.writeInt(this.f106879g);
        parcel.writeString(this.f106880h);
    }
}
