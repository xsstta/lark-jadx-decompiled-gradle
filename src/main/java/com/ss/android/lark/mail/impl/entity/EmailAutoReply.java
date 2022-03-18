package com.ss.android.lark.mail.impl.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.mail.impl.C41816b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmailAutoReply implements Parcelable {
    public static final Parcelable.Creator<EmailAutoReply> CREATOR = new Parcelable.Creator<EmailAutoReply>() {
        /* class com.ss.android.lark.mail.impl.entity.EmailAutoReply.C420581 */

        /* renamed from: a */
        public EmailAutoReply[] newArray(int i) {
            return new EmailAutoReply[i];
        }

        /* renamed from: a */
        public EmailAutoReply createFromParcel(Parcel parcel) {
            return new EmailAutoReply(parcel);
        }
    };

    /* renamed from: a */
    public boolean f106743a;

    /* renamed from: b */
    public long f106744b;

    /* renamed from: c */
    public long f106745c;

    /* renamed from: d */
    public String f106746d;

    /* renamed from: e */
    public String f106747e;

    /* renamed from: f */
    public boolean f106748f;

    /* renamed from: g */
    public String f106749g;

    /* renamed from: h */
    public List<MailImage> f106750h;

    /* renamed from: i */
    public String f106751i;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public boolean mo151132a() {
        return this.f106743a;
    }

    /* renamed from: b */
    public long mo151133b() {
        return this.f106744b;
    }

    /* renamed from: c */
    public long mo151134c() {
        return this.f106745c;
    }

    /* renamed from: d */
    public String mo151135d() {
        return this.f106746d;
    }

    /* renamed from: e */
    public String mo151137e() {
        return this.f106747e;
    }

    /* renamed from: f */
    public boolean mo151139f() {
        return this.f106748f;
    }

    /* renamed from: g */
    public String mo151140g() {
        return this.f106749g;
    }

    /* renamed from: h */
    public List<MailImage> mo151141h() {
        return this.f106750h;
    }

    /* renamed from: i */
    public String mo151143i() {
        return this.f106751i;
    }

    /* renamed from: com.ss.android.lark.mail.impl.entity.EmailAutoReply$a */
    public static class C42059a {

        /* renamed from: a */
        private boolean f106752a;

        /* renamed from: b */
        private long f106753b;

        /* renamed from: c */
        private long f106754c;

        /* renamed from: d */
        private String f106755d;

        /* renamed from: e */
        private String f106756e = "";

        /* renamed from: f */
        private boolean f106757f = true;

        /* renamed from: g */
        private String f106758g = "";

        /* renamed from: h */
        private List<MailImage> f106759h = new ArrayList();

        /* renamed from: i */
        private String f106760i = "";

        /* renamed from: a */
        public EmailAutoReply mo151154a() {
            return new EmailAutoReply(this.f106752a, this.f106753b, this.f106754c, this.f106755d, this.f106756e, this.f106757f, this.f106758g, this.f106759h, this.f106760i);
        }

        /* renamed from: a */
        public C42059a mo151150a(long j) {
            this.f106753b = j;
            return this;
        }

        /* renamed from: b */
        public C42059a mo151155b(long j) {
            this.f106754c = j;
            return this;
        }

        /* renamed from: c */
        public C42059a mo151158c(String str) {
            this.f106758g = str;
            return this;
        }

        /* renamed from: d */
        public C42059a mo151159d(String str) {
            this.f106760i = str;
            return this;
        }

        /* renamed from: a */
        public C42059a mo151151a(String str) {
            this.f106755d = str;
            return this;
        }

        /* renamed from: b */
        public C42059a mo151156b(String str) {
            this.f106756e = str;
            return this;
        }

        /* renamed from: a */
        public C42059a mo151152a(List<MailImage> list) {
            this.f106759h = list;
            return this;
        }

        /* renamed from: b */
        public C42059a mo151157b(boolean z) {
            this.f106757f = z;
            return this;
        }

        /* renamed from: a */
        public C42059a mo151153a(boolean z) {
            this.f106752a = z;
            return this;
        }

        public C42059a(EmailAutoReply emailAutoReply) {
            if (emailAutoReply != null) {
                mo151153a(emailAutoReply.f106743a);
                mo151150a(emailAutoReply.f106744b);
                mo151155b(emailAutoReply.f106745c);
                mo151151a(emailAutoReply.f106746d);
                mo151156b(emailAutoReply.f106747e);
                mo151157b(emailAutoReply.f106748f);
                mo151158c(emailAutoReply.f106749g);
                mo151152a(emailAutoReply.f106750h);
                mo151159d(emailAutoReply.f106751i);
            }
        }

        public C42059a(boolean z, long j, long j2, String str) {
            this.f106752a = z;
            this.f106753b = j;
            this.f106754c = j2;
            this.f106755d = str;
        }
    }

    public String toString() {
        if (!C41816b.m166115a().mo150143j()) {
            return super.toString();
        }
        return "EmailAutoReply{mEnable=" + this.f106743a + '}';
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f106743a), Long.valueOf(this.f106744b), Long.valueOf(this.f106745c), this.f106746d, this.f106747e, Boolean.valueOf(this.f106748f), this.f106749g, this.f106750h, this.f106751i);
    }

    public EmailAutoReply(Parcel parcel) {
        boolean z;
        this.f106747e = "";
        boolean z2 = true;
        this.f106748f = true;
        this.f106749g = "";
        this.f106750h = new ArrayList();
        this.f106751i = "";
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f106743a = z;
        this.f106744b = parcel.readLong();
        this.f106745c = parcel.readLong();
        this.f106746d = parcel.readString();
        this.f106747e = parcel.readString();
        this.f106748f = parcel.readInt() != 1 ? false : z2;
        this.f106749g = parcel.readString();
        parcel.readTypedList(this.f106750h, MailImage.CREATOR);
        this.f106751i = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EmailAutoReply emailAutoReply = (EmailAutoReply) obj;
        if (this.f106743a != emailAutoReply.f106743a || this.f106745c != emailAutoReply.f106745c || this.f106748f != emailAutoReply.f106748f || !Objects.equals(this.f106746d, emailAutoReply.f106746d) || !Objects.equals(this.f106747e, emailAutoReply.f106747e) || !Objects.equals(this.f106749g, emailAutoReply.f106749g) || !Objects.equals(this.f106750h, emailAutoReply.f106750h) || !Objects.equals(this.f106751i, emailAutoReply.f106751i)) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f106743a ? 1 : 0);
        parcel.writeLong(this.f106744b);
        parcel.writeLong(this.f106745c);
        parcel.writeString(this.f106746d);
        parcel.writeString(this.f106747e);
        parcel.writeInt(this.f106748f ? 1 : 0);
        parcel.writeString(this.f106749g);
        parcel.writeTypedList(this.f106750h);
        parcel.writeString(this.f106751i);
    }

    public EmailAutoReply(boolean z, long j, long j2, String str, String str2, boolean z2, String str3, List<MailImage> list, String str4) {
        this.f106747e = "";
        this.f106748f = true;
        this.f106749g = "";
        this.f106750h = new ArrayList();
        this.f106751i = "";
        this.f106743a = z;
        this.f106744b = j;
        this.f106745c = j2;
        this.f106746d = str;
        this.f106747e = str2;
        this.f106748f = z2;
        this.f106749g = str3;
        this.f106750h = list;
        this.f106751i = str4;
    }
}
