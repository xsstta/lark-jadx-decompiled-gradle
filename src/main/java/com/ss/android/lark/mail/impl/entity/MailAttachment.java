package com.ss.android.lark.mail.impl.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.compose.attachment.LocalAttachment;
import com.ss.android.lark.mail.impl.message.template.C43032aa;
import com.ss.android.lark.mail.impl.utils.C43785p;
import java.util.Objects;

public class MailAttachment implements Parcelable {
    public static final Parcelable.Creator<MailAttachment> CREATOR = new Parcelable.Creator<MailAttachment>() {
        /* class com.ss.android.lark.mail.impl.entity.MailAttachment.C420631 */

        /* renamed from: a */
        public MailAttachment[] newArray(int i) {
            return new MailAttachment[i];
        }

        /* renamed from: a */
        public MailAttachment createFromParcel(Parcel parcel) {
            return new MailAttachment(parcel);
        }
    };

    /* renamed from: a */
    protected String f106785a;

    /* renamed from: b */
    protected String f106786b;

    /* renamed from: c */
    protected long f106787c;

    /* renamed from: d */
    protected String f106788d;

    /* renamed from: e */
    protected int f106789e;

    /* renamed from: f */
    protected String f106790f;

    /* renamed from: g */
    protected int f106791g;

    /* renamed from: h */
    protected long f106792h;

    /* renamed from: i */
    protected boolean f106793i;

    public int describeContents() {
        return 0;
    }

    /* renamed from: p */
    public void mo151240p() {
        this.f106791g = 1;
    }

    /* renamed from: s */
    public String mo151243s() {
        return "email";
    }

    public MailAttachment() {
    }

    /* renamed from: f */
    public String mo151229f() {
        return this.f106785a;
    }

    /* renamed from: g */
    public String mo151230g() {
        return this.f106786b;
    }

    /* renamed from: h */
    public long mo151231h() {
        return this.f106787c;
    }

    /* renamed from: j */
    public String mo151234j() {
        return this.f106788d;
    }

    /* renamed from: k */
    public int mo151235k() {
        return this.f106791g;
    }

    /* renamed from: l */
    public long mo151236l() {
        return this.f106792h;
    }

    /* renamed from: m */
    public boolean mo151237m() {
        return this.f106793i;
    }

    /* renamed from: n */
    public int mo151238n() {
        return this.f106789e;
    }

    /* renamed from: o */
    public boolean mo151239o() {
        if (this.f106789e == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public String mo151242r() {
        return C26311p.m95280b(C43785p.m173544b(this.f106785a));
    }

    /* renamed from: t */
    public String mo151244t() {
        return C41816b.m166115a().mo150139f();
    }

    public int hashCode() {
        return Objects.hash(this.f106785a, this.f106786b, Long.valueOf(this.f106787c), this.f106788d);
    }

    /* renamed from: i */
    public long mo151233i() {
        if (mo151239o() || mo151237m()) {
            return 0;
        }
        return this.f106787c;
    }

    /* renamed from: q */
    public String mo151241q() {
        if (!TextUtils.isEmpty(this.f106790f)) {
            return this.f106790f;
        }
        if (TextUtils.isEmpty(this.f106785a)) {
            return "";
        }
        String d = C43032aa.m171192d(this.f106785a);
        this.f106790f = d;
        return d;
    }

    /* renamed from: a */
    public void mo151218a(long j) {
        this.f106787c = j;
    }

    /* renamed from: b */
    public void mo151220b(int i) {
        this.f106791g = i;
    }

    /* renamed from: c */
    public void mo151223c(int i) {
        this.f106789e = i;
    }

    /* renamed from: d */
    public void mo151226d(String str) {
        this.f106788d = str;
    }

    /* renamed from: b */
    public void mo151221b(long j) {
        this.f106792h = j;
    }

    /* renamed from: c */
    public void mo151224c(String str) {
        this.f106786b = str;
    }

    /* renamed from: b */
    public void mo151222b(String str) {
        this.f106785a = str;
    }

    /* renamed from: c */
    public void mo151225c(boolean z) {
        this.f106793i = z;
    }

    public MailAttachment(Parcel parcel) {
        this.f106785a = parcel.readString();
        this.f106786b = parcel.readString();
        this.f106787c = parcel.readLong();
        this.f106788d = parcel.readString();
        this.f106789e = parcel.readInt();
        this.f106791g = parcel.readInt();
        this.f106792h = parcel.readLong();
        this.f106793i = parcel.readInt() != 1 ? false : true;
    }

    /* renamed from: a */
    public boolean mo151219a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalAttachment)) {
            return false;
        }
        LocalAttachment localAttachment = (LocalAttachment) obj;
        if (this.f106787c != localAttachment.f106787c || !Objects.equals(this.f106785a, localAttachment.f106785a) || !Objects.equals(this.f106786b, localAttachment.f106786b) || !Objects.equals(this.f106788d, localAttachment.f106788d)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return mo151219a(obj);
        }
        MailAttachment mailAttachment = (MailAttachment) obj;
        if (this.f106787c != mailAttachment.f106787c || !Objects.equals(this.f106785a, mailAttachment.f106785a) || !Objects.equals(this.f106786b, mailAttachment.f106786b) || !Objects.equals(this.f106788d, mailAttachment.f106788d)) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f106785a);
        parcel.writeString(this.f106786b);
        parcel.writeLong(this.f106787c);
        parcel.writeString(this.f106788d);
        parcel.writeInt(this.f106789e);
        parcel.writeInt(this.f106791g);
        parcel.writeLong(this.f106792h);
        parcel.writeInt(this.f106793i ? 1 : 0);
    }
}
