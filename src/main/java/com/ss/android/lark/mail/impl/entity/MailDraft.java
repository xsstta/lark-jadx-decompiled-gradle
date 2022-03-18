package com.ss.android.lark.mail.impl.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.service.C43362e;
import com.ss.android.lark.mail.impl.utils.C43766i;
import com.ss.android.lark.mail.impl.utils.C43783o;
import com.ss.android.lark.mail.impl.utils.C43785p;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MailDraft implements Parcelable {
    public static final Parcelable.Creator<MailDraft> CREATOR = new Parcelable.Creator<MailDraft>() {
        /* class com.ss.android.lark.mail.impl.entity.MailDraft.C420681 */

        /* renamed from: a */
        public MailDraft[] newArray(int i) {
            return new MailDraft[i];
        }

        /* renamed from: a */
        public MailDraft createFromParcel(Parcel parcel) {
            return new MailDraft(parcel);
        }
    };

    /* renamed from: a */
    private String f106818a;

    /* renamed from: b */
    private MailAddress f106819b;

    /* renamed from: c */
    private List<MailAddress> f106820c = new ArrayList();

    /* renamed from: d */
    private List<MailAddress> f106821d = new ArrayList();

    /* renamed from: e */
    private List<MailAddress> f106822e = new ArrayList();

    /* renamed from: f */
    private String f106823f;

    /* renamed from: g */
    private String f106824g;

    /* renamed from: h */
    private List<MailAttachment> f106825h = new ArrayList();

    /* renamed from: i */
    private long f106826i;

    /* renamed from: j */
    private long f106827j;

    /* renamed from: k */
    private List<MailImage> f106828k = new ArrayList();

    /* renamed from: l */
    private String f106829l;

    /* renamed from: m */
    private String f106830m;

    /* renamed from: n */
    private String f106831n;

    /* renamed from: o */
    private List<MailDocsPermissionConfig> f106832o = new ArrayList();

    /* renamed from: p */
    private String f106833p;

    /* renamed from: q */
    private EmailAliasList f106834q = new EmailAliasList();

    /* renamed from: r */
    private int f106835r;

    /* renamed from: s */
    private String f106836s;

    /* renamed from: t */
    private long f106837t;

    /* renamed from: u */
    private String f106838u;

    /* renamed from: v */
    private boolean f106839v;

    public int describeContents() {
        return 0;
    }

    /* renamed from: B */
    public int mo151317B() {
        return this.f106835r;
    }

    /* renamed from: C */
    public String mo151318C() {
        return this.f106836s;
    }

    /* renamed from: D */
    public long mo151319D() {
        return this.f106837t;
    }

    /* renamed from: a */
    public String mo151321a() {
        return this.f106818a;
    }

    /* renamed from: b */
    public MailAddress mo151331b() {
        return this.f106819b;
    }

    /* renamed from: d */
    public List<MailAddress> mo151339d() {
        return this.f106820c;
    }

    /* renamed from: e */
    public List<MailAddress> mo151343e() {
        return this.f106821d;
    }

    /* renamed from: f */
    public List<MailAddress> mo151347f() {
        return this.f106822e;
    }

    /* renamed from: g */
    public String mo151350g() {
        return this.f106823f;
    }

    /* renamed from: h */
    public String mo151352h() {
        return this.f106824g;
    }

    /* renamed from: i */
    public List<MailAttachment> mo151355i() {
        return this.f106825h;
    }

    /* renamed from: j */
    public long mo151357j() {
        return this.f106826i;
    }

    /* renamed from: k */
    public List<MailImage> mo151358k() {
        return this.f106828k;
    }

    /* renamed from: l */
    public String mo151359l() {
        return this.f106829l;
    }

    /* renamed from: m */
    public long mo151360m() {
        return this.f106827j;
    }

    /* renamed from: n */
    public String mo151361n() {
        return this.f106830m;
    }

    /* renamed from: o */
    public String mo151362o() {
        return this.f106831n;
    }

    /* renamed from: p */
    public List<MailDocsPermissionConfig> mo151363p() {
        return this.f106832o;
    }

    /* renamed from: r */
    public String mo151365r() {
        return this.f106833p;
    }

    /* renamed from: s */
    public boolean mo151366s() {
        return this.f106839v;
    }

    /* renamed from: c */
    public String mo151335c() {
        MailAddress mailAddress = this.f106819b;
        if (mailAddress == null) {
            return "";
        }
        return mailAddress.mo151182e();
    }

    /* renamed from: v */
    public int mo151370v() {
        String str = this.f106824g;
        if (str != null) {
            return str.length();
        }
        return 0;
    }

    public String toString() {
        return "MailDraft{id='" + this.f106818a + '\'' + '}';
    }

    public MailDraft() {
    }

    /* renamed from: A */
    public boolean mo151316A() {
        List<MailAttachment> list = this.f106825h;
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (MailAttachment mailAttachment : this.f106825h) {
            if (mailAttachment != null && mailAttachment.mo151237m()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public void mo151320E() {
        ArrayList arrayList = new ArrayList();
        List<MailAttachment> list = this.f106825h;
        if (!(list == null || list.isEmpty())) {
            for (MailAttachment mailAttachment : this.f106825h) {
                if (!C43766i.m173487b(C26311p.m95284d(mailAttachment.mo151229f()))) {
                    arrayList.add(mailAttachment);
                }
            }
            this.f106825h = arrayList;
        }
    }

    /* renamed from: q */
    public EmailAliasList mo151364q() {
        if (!this.f106834q.mo151122d().isEmpty()) {
            return this.f106834q;
        }
        if (C43277a.m171921a().mo154951o()) {
            return C43350d.m172098a().mo155044j();
        }
        return new EmailAliasList();
    }

    /* renamed from: u */
    public long mo151369u() {
        long g = m167438g(mo151358k()) + 0 + m167439h(mo151355i());
        Log.m165389i("MailDraft", "calMailDraftSize: " + g);
        return g;
    }

    /* renamed from: w */
    public boolean mo151371w() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(mo151339d());
        arrayList.addAll(mo151343e());
        arrayList.addAll(mo151347f());
        return C43785p.m173542a(C43362e.m172201a().mo155096k(), arrayList);
    }

    /* renamed from: x */
    public boolean mo151373x() {
        List<MailAttachment> list = this.f106825h;
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (MailAttachment mailAttachment : this.f106825h) {
            if (mailAttachment != null && mailAttachment.mo151239o() && mailAttachment.mo151236l() == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public int mo151374y() {
        List<MailAttachment> list = this.f106825h;
        int i = 0;
        if (list != null && !list.isEmpty()) {
            for (MailAttachment mailAttachment : this.f106825h) {
                if (mailAttachment != null && mailAttachment.mo151239o()) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: z */
    public boolean mo151375z() {
        List<MailAttachment> list = this.f106825h;
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (MailAttachment mailAttachment : this.f106825h) {
            if (mailAttachment != null && mailAttachment.mo151239o() && mailAttachment.mo151236l() != 0 && mailAttachment.mo151236l() < System.currentTimeMillis()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f106818a, mo151335c(), this.f106820c, this.f106821d, this.f106822e, this.f106823f, this.f106833p, this.f106832o, this.f106825h, this.f106828k, Boolean.valueOf(this.f106839v));
    }

    /* renamed from: t */
    public boolean mo151367t() {
        List<MailAddress> list;
        List<MailAddress> list2;
        List<MailAddress> list3;
        List<MailAttachment> list4;
        List<MailImage> list5;
        String str;
        List<MailDocsPermissionConfig> list6;
        if (TextUtils.isEmpty(this.f106818a) || (((list = this.f106820c) == null || list.isEmpty()) && (((list2 = this.f106821d) == null || list2.isEmpty()) && (((list3 = this.f106822e) == null || list3.isEmpty()) && (((list4 = this.f106825h) == null || list4.isEmpty()) && (((list5 = this.f106828k) == null || list5.isEmpty()) && (((str = this.f106833p) == null || str.isEmpty()) && (((list6 = this.f106832o) == null || list6.isEmpty()) && TextUtils.isEmpty(this.f106823f) && TextUtils.isEmpty(this.f106829l))))))))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo151336c(long j) {
        this.f106837t = j;
    }

    /* renamed from: a */
    public void mo151322a(int i) {
        this.f106835r = i;
    }

    /* renamed from: b */
    public void mo151332b(long j) {
        this.f106827j = j;
    }

    /* renamed from: c */
    public void mo151337c(String str) {
        this.f106824g = str;
    }

    /* renamed from: d */
    public void mo151340d(String str) {
        this.f106829l = str;
    }

    /* renamed from: e */
    public void mo151344e(String str) {
        this.f106830m = str;
    }

    /* renamed from: f */
    public void mo151348f(String str) {
        this.f106831n = str;
    }

    /* renamed from: g */
    public void mo151351g(String str) {
        this.f106833p = str;
    }

    /* renamed from: h */
    public void mo151353h(String str) {
        this.f106838u = str;
    }

    /* renamed from: i */
    public void mo151356i(String str) {
        this.f106836s = str;
    }

    /* renamed from: a */
    public void mo151323a(long j) {
        this.f106826i = j;
    }

    /* renamed from: b */
    public void mo151333b(String str) {
        this.f106823f = str;
    }

    /* renamed from: d */
    public void mo151341d(List<MailAttachment> list) {
        this.f106825h = list;
    }

    /* renamed from: e */
    public void mo151345e(List<MailImage> list) {
        this.f106828k = list;
    }

    /* renamed from: f */
    public void mo151349f(List<MailDocsPermissionConfig> list) {
        this.f106832o = list;
    }

    /* renamed from: g */
    private long m167438g(List<MailImage> list) {
        long j = 0;
        if (list != null) {
            for (MailImage mailImage : list) {
                j += mailImage.mo151482h();
            }
        }
        return j;
    }

    /* renamed from: h */
    private long m167439h(List<MailAttachment> list) {
        long j = 0;
        if (list != null) {
            for (MailAttachment mailAttachment : list) {
                j += mailAttachment.mo151233i();
            }
        }
        return j;
    }

    /* renamed from: a */
    public void mo151324a(EmailAliasList emailAliasList) {
        this.f106834q = emailAliasList;
    }

    /* renamed from: b */
    public void mo151334b(List<MailAddress> list) {
        this.f106821d = list;
    }

    /* renamed from: c */
    public void mo151338c(List<MailAddress> list) {
        this.f106822e = list;
    }

    /* renamed from: a */
    public void mo151325a(MailAddress mailAddress) {
        this.f106819b = mailAddress;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MailDraft mailDraft = (MailDraft) obj;
        if (!mo151330a(mailDraft) || !TextUtils.equals(this.f106833p, mailDraft.f106833p) || !Objects.equals(this.f106832o, mailDraft.f106832o) || !Objects.equals(this.f106828k, mailDraft.f106828k)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo151326a(C43783o oVar) {
        this.f106820c = oVar.mo155944a();
        this.f106821d = oVar.mo155946c();
        this.f106822e = oVar.mo155947d();
        if (!TextUtils.isEmpty(oVar.mo155948e())) {
            this.f106823f = oVar.mo155948e();
        }
        if (!TextUtils.isEmpty(oVar.mo155949f())) {
            this.f106824g = oVar.mo155949f();
        }
        if (!TextUtils.isEmpty(oVar.mo155950g())) {
            this.f106829l = oVar.mo155949f();
        }
    }

    public MailDraft(Parcel parcel) {
        this.f106818a = parcel.readString();
        this.f106819b = (MailAddress) parcel.readParcelable(MailAddress.class.getClassLoader());
        this.f106820c = new ArrayList();
        this.f106821d = new ArrayList();
        this.f106822e = new ArrayList();
        this.f106825h = new ArrayList();
        this.f106828k = new ArrayList();
        this.f106832o = new ArrayList();
        parcel.readTypedList(this.f106820c, MailAddress.CREATOR);
        parcel.readTypedList(this.f106821d, MailAddress.CREATOR);
        parcel.readTypedList(this.f106822e, MailAddress.CREATOR);
        this.f106823f = parcel.readString();
        this.f106824g = parcel.readString();
        parcel.readTypedList(this.f106825h, MailAttachment.CREATOR);
        this.f106826i = parcel.readLong();
        this.f106827j = parcel.readLong();
        parcel.readTypedList(this.f106828k, MailImage.CREATOR);
        this.f106829l = parcel.readString();
        this.f106830m = parcel.readString();
        this.f106831n = parcel.readString();
        parcel.readTypedList(this.f106832o, MailDocsPermissionConfig.CREATOR);
        this.f106833p = parcel.readString();
        this.f106834q = (EmailAliasList) parcel.readParcelable(EmailAliasList.class.getClassLoader());
        this.f106835r = parcel.readInt();
        this.f106836s = parcel.readString();
        this.f106837t = parcel.readLong();
        this.f106839v = parcel.readInt() != 1 ? false : true;
    }

    /* renamed from: a */
    public void mo151327a(String str) {
        this.f106818a = str;
    }

    /* renamed from: a */
    public void mo151328a(List<MailAddress> list) {
        this.f106820c = list;
    }

    /* renamed from: a */
    public void mo151329a(boolean z) {
        this.f106839v = z;
    }

    /* renamed from: a */
    public boolean mo151330a(MailDraft mailDraft) {
        String str;
        if (this == mailDraft) {
            return true;
        }
        if (mailDraft != null && (str = this.f106818a) != null && str.equals(mailDraft.f106818a) && Objects.equals(mo151335c(), mailDraft.mo151335c()) && Objects.equals(this.f106820c, mailDraft.f106820c) && Objects.equals(this.f106821d, mailDraft.f106821d) && Objects.equals(this.f106822e, mailDraft.f106822e) && TextUtils.equals(this.f106823f, mailDraft.f106823f) && Objects.equals(this.f106825h, mailDraft.f106825h) && Objects.equals(Boolean.valueOf(this.f106839v), Boolean.valueOf(mailDraft.f106839v))) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f106818a);
        parcel.writeParcelable(this.f106819b, i);
        parcel.writeTypedList(this.f106820c);
        parcel.writeTypedList(this.f106821d);
        parcel.writeTypedList(this.f106822e);
        parcel.writeString(this.f106823f);
        parcel.writeString(this.f106824g);
        parcel.writeTypedList(this.f106825h);
        parcel.writeLong(this.f106826i);
        parcel.writeLong(this.f106827j);
        parcel.writeTypedList(this.f106828k);
        parcel.writeString(this.f106829l);
        parcel.writeString(this.f106830m);
        parcel.writeString(this.f106831n);
        parcel.writeTypedList(this.f106832o);
        parcel.writeString(this.f106833p);
        parcel.writeParcelable(this.f106834q, i);
        parcel.writeInt(this.f106835r);
        parcel.writeString(this.f106836s);
        parcel.writeLong(this.f106837t);
        parcel.writeInt(this.f106839v ? 1 : 0);
    }
}
