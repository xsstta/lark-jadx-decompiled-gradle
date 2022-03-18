package com.ss.android.lark.mail.impl.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.bytedance.lark.pb.email.client.v1.ThreadAction;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.mail.impl.home.p2182b.AbstractC42436a;
import com.ss.android.lark.mail.impl.service.C43374f;
import java.util.ArrayList;
import java.util.List;

public class MailThread implements Parcelable, AbstractC42436a {
    public static final Parcelable.Creator<MailThread> CREATOR = new Parcelable.Creator<MailThread>() {
        /* class com.ss.android.lark.mail.impl.entity.MailThread.C420801 */

        /* renamed from: a */
        public MailThread[] newArray(int i) {
            return new MailThread[i];
        }

        /* renamed from: a */
        public MailThread createFromParcel(Parcel parcel) {
            return new MailThread(parcel);
        }
    };

    /* renamed from: A */
    private List<ThreadAction> f106959A;

    /* renamed from: B */
    private PermissionCode f106960B;

    /* renamed from: C */
    private boolean f106961C;

    /* renamed from: a */
    private String f106962a;

    /* renamed from: b */
    private long f106963b;

    /* renamed from: c */
    private MailThreadStatus f106964c;

    /* renamed from: d */
    private List<MailAddress> f106965d;

    /* renamed from: e */
    private String f106966e;

    /* renamed from: f */
    private String f106967f;

    /* renamed from: g */
    private String f106968g;

    /* renamed from: h */
    private long f106969h;

    /* renamed from: i */
    private boolean f106970i;

    /* renamed from: j */
    private boolean f106971j;

    /* renamed from: k */
    private long f106972k;

    /* renamed from: l */
    private List<String> f106973l;

    /* renamed from: m */
    private List<MailLabelEntity> f106974m;

    /* renamed from: n */
    private String f106975n;

    /* renamed from: o */
    private String f106976o;

    /* renamed from: p */
    private boolean f106977p;

    /* renamed from: q */
    private String f106978q;

    /* renamed from: r */
    private boolean f106979r;

    /* renamed from: s */
    private boolean f106980s;

    /* renamed from: t */
    private boolean f106981t;

    /* renamed from: u */
    private int f106982u;

    /* renamed from: v */
    private boolean f106983v;

    /* renamed from: w */
    private long f106984w;

    /* renamed from: x */
    private long f106985x;

    /* renamed from: y */
    private List<MailAddress> f106986y;

    /* renamed from: z */
    private boolean f106987z;

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public boolean mo151706e(String str) {
        return true;
    }

    /* renamed from: A */
    public boolean mo151674A() {
        return this.f106961C;
    }

    /* renamed from: B */
    public boolean mo151675B() {
        return this.f106987z;
    }

    /* renamed from: a */
    public String mo151676a() {
        return this.f106962a;
    }

    /* renamed from: b */
    public long mo151686b() {
        return this.f106963b;
    }

    /* renamed from: c */
    public MailThreadStatus mo151691c() {
        return this.f106964c;
    }

    /* renamed from: d */
    public List<MailAddress> mo151696d() {
        return this.f106965d;
    }

    /* renamed from: e */
    public String mo151702e() {
        return this.f106966e;
    }

    /* renamed from: f */
    public String mo151707f() {
        return this.f106967f;
    }

    /* renamed from: g */
    public String mo151710g() {
        return this.f106968g;
    }

    /* renamed from: h */
    public String mo151712h() {
        return this.f106976o;
    }

    /* renamed from: i */
    public String mo151714i() {
        return this.f106975n;
    }

    /* renamed from: j */
    public boolean mo151715j() {
        return this.f106970i;
    }

    /* renamed from: k */
    public boolean mo151716k() {
        return this.f106971j;
    }

    /* renamed from: l */
    public long mo151717l() {
        return this.f106969h;
    }

    /* renamed from: n */
    public long mo151719n() {
        return this.f106972k;
    }

    /* renamed from: o */
    public List<MailAddress> mo151720o() {
        return this.f106986y;
    }

    /* renamed from: p */
    public List<ThreadAction> mo151721p() {
        return this.f106959A;
    }

    /* renamed from: q */
    public List<String> mo151722q() {
        return this.f106973l;
    }

    /* renamed from: s */
    public boolean mo151724s() {
        return this.f106977p;
    }

    /* renamed from: t */
    public PermissionCode mo151725t() {
        return this.f106960B;
    }

    /* renamed from: u */
    public boolean mo151726u() {
        return this.f106980s;
    }

    /* renamed from: v */
    public boolean mo151727v() {
        return this.f106981t;
    }

    /* renamed from: w */
    public int mo151728w() {
        return this.f106982u;
    }

    /* renamed from: x */
    public boolean mo151730x() {
        return this.f106983v;
    }

    /* renamed from: y */
    public long mo151731y() {
        return this.f106984w;
    }

    /* renamed from: z */
    public long mo151732z() {
        return this.f106985x;
    }

    public MailThread() {
        this.f106974m = new ArrayList();
        this.f106987z = false;
    }

    /* renamed from: m */
    public String mo151718m() {
        long j = this.f106963b;
        if (j < 0) {
            return "";
        }
        if (j > 100) {
            return "99+";
        }
        return String.valueOf(j);
    }

    /* renamed from: r */
    public List<MailLabelEntity> mo151723r() {
        List<MailLabelEntity> list;
        List<String> list2 = this.f106973l;
        if (list2 != null && ((list = this.f106974m) == null || !(list == null || list2.size() == this.f106974m.size()))) {
            ArrayList arrayList = new ArrayList();
            for (String str : list2) {
                MailLabelEntity c = C43374f.m172264f().mo155117c(str);
                if (c != null) {
                    arrayList.add(c);
                }
            }
            mo151704e(arrayList);
        }
        return this.f106974m;
    }

    /* renamed from: a */
    public void mo151677a(int i) {
        this.f106982u = i;
    }

    /* renamed from: b */
    public void mo151687b(long j) {
        this.f106969h = j;
    }

    /* renamed from: c */
    public void mo151692c(long j) {
        this.f106972k = j;
    }

    /* renamed from: d */
    public void mo151697d(long j) {
        this.f106984w = j;
    }

    /* renamed from: e */
    public void mo151703e(long j) {
        this.f106985x = j;
    }

    /* renamed from: f */
    public void mo151708f(String str) {
        this.f106978q = str;
    }

    /* renamed from: g */
    public void mo151711g(boolean z) {
        this.f106961C = z;
    }

    /* renamed from: h */
    public void mo151713h(boolean z) {
        this.f106987z = z;
    }

    /* renamed from: a */
    public void mo151678a(long j) {
        this.f106963b = j;
    }

    /* renamed from: b */
    public void mo151688b(String str) {
        this.f106966e = str;
    }

    /* renamed from: c */
    public void mo151694c(List<ThreadAction> list) {
        this.f106959A = list;
    }

    /* renamed from: d */
    public void mo151699d(List<String> list) {
        this.f106973l = list;
    }

    /* renamed from: e */
    public void mo151704e(List<MailLabelEntity> list) {
        this.f106974m = list;
    }

    /* renamed from: f */
    public void mo151709f(boolean z) {
        this.f106983v = z;
    }

    /* renamed from: a */
    public void mo151679a(PermissionCode permissionCode) {
        this.f106960B = permissionCode;
    }

    /* renamed from: b */
    public void mo151689b(List<MailAddress> list) {
        this.f106986y = list;
    }

    /* renamed from: c */
    public void mo151693c(String str) {
        this.f106967f = str;
        if (str == null || str.length() <= 100) {
            this.f106976o = str;
        } else {
            this.f106976o = str.substring(0, 100);
        }
    }

    /* renamed from: d */
    public void mo151698d(String str) {
        this.f106968g = str;
        if (str == null || str.length() <= 100) {
            this.f106975n = str;
        } else {
            this.f106975n = str.substring(0, 100);
        }
    }

    /* renamed from: e */
    public void mo151705e(boolean z) {
        this.f106981t = z;
    }

    /* renamed from: a */
    public void mo151680a(MailDraft mailDraft) {
        if (mailDraft != null) {
            this.f106966e = mailDraft.mo151350g();
            this.f106968g = mailDraft.mo151359l();
            this.f106970i = !CollectionUtils.isEmpty(mailDraft.mo151355i());
            if (mailDraft.mo151357j() > mo151719n()) {
                mo151692c(mailDraft.mo151357j());
            }
        }
    }

    /* renamed from: b */
    public void mo151690b(boolean z) {
        this.f106971j = z;
    }

    /* renamed from: c */
    public void mo151695c(boolean z) {
        this.f106977p = z;
    }

    /* renamed from: d */
    public void mo151700d(boolean z) {
        this.f106980s = z;
    }

    /* renamed from: a */
    public void mo151681a(MailThreadStatus mailThreadStatus) {
        this.f106964c = mailThreadStatus;
    }

    /* renamed from: a */
    public void mo151682a(String str) {
        this.f106962a = str;
    }

    public MailThread(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        this.f106974m = new ArrayList();
        boolean z8 = false;
        this.f106987z = false;
        this.f106962a = parcel.readString();
        this.f106963b = parcel.readLong();
        this.f106964c = (MailThreadStatus) parcel.readParcelable(MailThreadStatus.class.getClassLoader());
        if (parcel.readInt() > 0) {
            parcel.readTypedList(this.f106965d, MailAddress.CREATOR);
        }
        this.f106966e = parcel.readString();
        this.f106967f = parcel.readString();
        this.f106968g = parcel.readString();
        this.f106969h = parcel.readLong();
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f106970i = z;
        if (parcel.readInt() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f106971j = z2;
        this.f106972k = parcel.readLong();
        if (parcel.readInt() > 0) {
            parcel.readTypedList(this.f106974m, MailLabelEntity.CREATOR);
        }
        this.f106975n = parcel.readString();
        this.f106976o = parcel.readString();
        if (parcel.readInt() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f106977p = z3;
        this.f106978q = parcel.readString();
        if (parcel.readInt() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f106979r = z4;
        if (parcel.readInt() == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f106980s = z5;
        if (parcel.readInt() == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f106981t = z6;
        this.f106982u = parcel.readInt();
        int readInt = parcel.readInt();
        this.f106959A = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f106959A.add(ThreadAction.fromValue(parcel.readInt()));
        }
        this.f106960B = PermissionCode.fromValue(parcel.readInt());
        if (parcel.readInt() == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f106983v = z7;
        this.f106984w = parcel.readLong();
        this.f106985x = parcel.readLong();
        if (parcel.readInt() > 0) {
            parcel.readTypedList(this.f106986y, MailAddress.CREATOR);
        }
        this.f106961C = parcel.readInt() == 1 ? true : z8;
    }

    /* renamed from: a */
    public void mo151683a(List<MailAddress> list) {
        this.f106965d = list;
    }

    /* renamed from: a */
    public void mo151684a(boolean z) {
        this.f106970i = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f106962a);
        parcel.writeLong(this.f106963b);
        parcel.writeParcelable(this.f106964c, i);
        List<MailAddress> list = this.f106965d;
        if (list != null) {
            parcel.writeInt(list.size());
            parcel.writeTypedList(this.f106965d);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f106966e);
        parcel.writeString(this.f106967f);
        parcel.writeString(this.f106968g);
        parcel.writeLong(this.f106969h);
        parcel.writeInt(this.f106970i ? 1 : 0);
        parcel.writeInt(this.f106971j ? 1 : 0);
        parcel.writeLong(this.f106972k);
        List<MailLabelEntity> list2 = this.f106974m;
        if (list2 != null) {
            parcel.writeInt(list2.size());
            parcel.writeTypedList(this.f106974m);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f106975n);
        parcel.writeString(this.f106976o);
        parcel.writeInt(this.f106977p ? 1 : 0);
        parcel.writeString(this.f106978q);
        parcel.writeInt(this.f106979r ? 1 : 0);
        parcel.writeInt(this.f106980s ? 1 : 0);
        parcel.writeInt(this.f106981t ? 1 : 0);
        parcel.writeInt(this.f106982u);
        List<ThreadAction> list3 = this.f106959A;
        if (list3 != null) {
            parcel.writeInt(list3.size());
            for (int i2 = 0; i2 < this.f106959A.size(); i2++) {
                parcel.writeInt(this.f106959A.get(i2).getValue());
            }
        } else {
            parcel.writeInt(0);
        }
        PermissionCode permissionCode = this.f106960B;
        if (permissionCode != null) {
            parcel.writeInt(permissionCode.getValue());
        } else {
            parcel.writeInt(PermissionCode.NONE.getValue());
        }
        parcel.writeInt(this.f106983v ? 1 : 0);
        parcel.writeLong(this.f106984w);
        parcel.writeLong(this.f106985x);
        List<MailAddress> list4 = this.f106986y;
        if (list4 != null) {
            parcel.writeInt(list4.size());
            parcel.writeTypedList(this.f106986y);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f106961C ? 1 : 0);
    }

    /* renamed from: a */
    public boolean mo151685a(MailLabelEntity mailLabelEntity, boolean z) {
        if (mailLabelEntity == null) {
            return false;
        }
        if (z) {
            this.f106973l.remove(mailLabelEntity.mo151527k());
        }
        for (int i = 0; i < this.f106974m.size(); i++) {
            if (TextUtils.equals(this.f106974m.get(i).mo151527k(), mailLabelEntity.mo151527k())) {
                if (z) {
                    this.f106974m.remove(i);
                    return true;
                } else {
                    this.f106974m.set(i, mailLabelEntity);
                    return true;
                }
            }
        }
        return false;
    }
}
