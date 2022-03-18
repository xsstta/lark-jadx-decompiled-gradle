package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.mail.impl.entity.MailImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmailSignature implements Parcelable {
    public static final Parcelable.Creator<EmailSignature> CREATOR = new Parcelable.Creator<EmailSignature>() {
        /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.EmailSignature.C435481 */

        /* renamed from: a */
        public EmailSignature[] newArray(int i) {
            return new EmailSignature[i];
        }

        /* renamed from: a */
        public EmailSignature createFromParcel(Parcel parcel) {
            return new EmailSignature(parcel);
        }
    };

    /* renamed from: a */
    private boolean f110525a;

    /* renamed from: b */
    private boolean f110526b;

    /* renamed from: c */
    private boolean f110527c;

    /* renamed from: d */
    private String f110528d;

    /* renamed from: e */
    private String f110529e;

    /* renamed from: f */
    private List<MailImage> f110530f;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public boolean mo155469a() {
        return this.f110525a;
    }

    /* renamed from: b */
    public boolean mo155470b() {
        return this.f110526b;
    }

    /* renamed from: c */
    public boolean mo155471c() {
        return this.f110527c;
    }

    /* renamed from: d */
    public String mo155472d() {
        return this.f110528d;
    }

    /* renamed from: e */
    public List<MailImage> mo155474e() {
        return this.f110530f;
    }

    /* renamed from: f */
    public String mo155476f() {
        return this.f110529e;
    }

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.EmailSignature$a */
    public static class C43549a {

        /* renamed from: a */
        private boolean f110531a;

        /* renamed from: b */
        private String f110532b = "";

        /* renamed from: c */
        private boolean f110533c;

        /* renamed from: d */
        private boolean f110534d;

        /* renamed from: e */
        private String f110535e = "";

        /* renamed from: f */
        private List<MailImage> f110536f = new ArrayList();

        /* renamed from: a */
        public EmailSignature mo155488a() {
            return new EmailSignature(this.f110531a, this.f110532b, this.f110533c, this.f110534d, this.f110535e, this.f110536f);
        }

        /* renamed from: a */
        public C43549a mo155485a(String str) {
            this.f110532b = str;
            return this;
        }

        /* renamed from: b */
        public C43549a mo155489b(String str) {
            this.f110535e = str;
            return this;
        }

        /* renamed from: c */
        public C43549a mo155491c(boolean z) {
            this.f110534d = z;
            return this;
        }

        /* renamed from: a */
        public C43549a mo155487a(boolean z) {
            this.f110533c = z;
            return this;
        }

        /* renamed from: b */
        public C43549a mo155490b(boolean z) {
            this.f110531a = z;
            return this;
        }

        /* renamed from: a */
        public C43549a mo155486a(List<MailImage> list) {
            this.f110536f.clear();
            this.f110536f.addAll(list);
            return this;
        }

        /* renamed from: a */
        public C43549a mo155484a(EmailSignature emailSignature) {
            if (emailSignature != null) {
                mo155490b(emailSignature.mo155470b());
                mo155485a(emailSignature.mo155472d());
                mo155487a(emailSignature.mo155469a());
                mo155491c(emailSignature.mo155471c());
                mo155489b(emailSignature.mo155476f());
                mo155489b(emailSignature.mo155476f());
                mo155486a(emailSignature.mo155474e());
            }
            return this;
        }
    }

    public String toString() {
        return "EmailSignature{mobileEnable=" + this.f110526b + '}';
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f110525a), Boolean.valueOf(this.f110526b), Boolean.valueOf(this.f110527c), this.f110528d, this.f110529e, this.f110530f);
    }

    public EmailSignature(Parcel parcel) {
        boolean z;
        boolean z2;
        this.f110528d = "";
        this.f110529e = "";
        this.f110530f = new ArrayList();
        boolean z3 = false;
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f110525a = z;
        if (parcel.readInt() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f110526b = z2;
        this.f110527c = parcel.readInt() == 1 ? true : z3;
        this.f110528d = parcel.readString();
        this.f110529e = parcel.readString();
        parcel.readTypedList(this.f110530f, MailImage.CREATOR);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EmailSignature emailSignature = (EmailSignature) obj;
        if (this.f110525a != emailSignature.f110525a || this.f110526b != emailSignature.f110526b || this.f110527c != emailSignature.f110527c || !Objects.equals(this.f110528d, emailSignature.f110528d) || !Objects.equals(this.f110529e, emailSignature.f110529e) || !Objects.equals(this.f110530f, emailSignature.f110530f)) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f110525a ? 1 : 0);
        parcel.writeInt(this.f110526b ? 1 : 0);
        parcel.writeInt(this.f110527c ? 1 : 0);
        parcel.writeString(this.f110528d);
        parcel.writeString(this.f110529e);
        parcel.writeTypedList(this.f110530f);
    }

    private EmailSignature(boolean z, String str, boolean z2, boolean z3, String str2, List<MailImage> list) {
        this.f110528d = "";
        this.f110529e = "";
        ArrayList arrayList = new ArrayList();
        this.f110530f = arrayList;
        this.f110525a = z2;
        this.f110526b = z;
        this.f110527c = z3;
        this.f110528d = str;
        this.f110529e = str2;
        arrayList.clear();
        this.f110530f.addAll(list);
    }
}
