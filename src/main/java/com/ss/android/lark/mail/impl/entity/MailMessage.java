package com.ss.android.lark.mail.impl.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.lark.pb.email.client.v1.RedirectType;
import com.bytedance.lark.pb.email.client.v1.ReportType;
import com.bytedance.lark.pb.email.client.v1.ThreadSecurityLevel;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.message.template.C43032aa;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.utils.C43762e;
import com.ss.android.lark.mail.impl.utils.C43785p;
import com.ss.android.lark.mail.impl.utils.C43853v;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;

public class MailMessage implements Parcelable {
    public static final Parcelable.Creator<MailMessage> CREATOR = new Parcelable.Creator<MailMessage>() {
        /* class com.ss.android.lark.mail.impl.entity.MailMessage.C420761 */

        /* renamed from: a */
        public MailMessage[] newArray(int i) {
            return new MailMessage[i];
        }

        /* renamed from: a */
        public MailMessage createFromParcel(Parcel parcel) {
            return new MailMessage(parcel);
        }
    };

    /* renamed from: A */
    private String f106910A;

    /* renamed from: B */
    private List<String> f106911B;

    /* renamed from: C */
    private ThreadSecurityLevel f106912C;

    /* renamed from: D */
    private C42098k f106913D;

    /* renamed from: E */
    private long f106914E;

    /* renamed from: F */
    private boolean f106915F;

    /* renamed from: G */
    private ReportType f106916G;

    /* renamed from: H */
    private boolean f106917H;

    /* renamed from: I */
    private RedirectType f106918I;

    /* renamed from: J */
    private SendState f106919J;

    /* renamed from: a */
    private final String f106920a;

    /* renamed from: b */
    private String f106921b;

    /* renamed from: c */
    private MailAddress f106922c;

    /* renamed from: d */
    private List<MailAddress> f106923d;

    /* renamed from: e */
    private List<MailAddress> f106924e;

    /* renamed from: f */
    private List<MailAddress> f106925f;

    /* renamed from: g */
    private String f106926g;

    /* renamed from: h */
    private String f106927h;

    /* renamed from: i */
    private String f106928i;

    /* renamed from: j */
    private List<MailAttachment> f106929j;

    /* renamed from: k */
    private List<MailImage> f106930k;

    /* renamed from: l */
    private MailThreadStatus f106931l;

    /* renamed from: m */
    private MailMessageDeliveryState f106932m;

    /* renamed from: n */
    private long f106933n;

    /* renamed from: o */
    private long f106934o;

    /* renamed from: p */
    private boolean f106935p;

    /* renamed from: q */
    private long f106936q;

    /* renamed from: r */
    private String f106937r;

    /* renamed from: s */
    private boolean f106938s;

    /* renamed from: t */
    private String f106939t;

    /* renamed from: u */
    private MailCalendar f106940u;

    /* renamed from: v */
    private boolean f106941v;

    /* renamed from: w */
    private MailMessageRecallState f106942w;

    /* renamed from: x */
    private String f106943x;

    /* renamed from: y */
    private boolean f106944y;

    /* renamed from: z */
    private String f106945z;

    public int describeContents() {
        return 0;
    }

    /* renamed from: A */
    public MailCalendar mo151548A() {
        return this.f106940u;
    }

    /* renamed from: C */
    public boolean mo151550C() {
        return this.f106941v;
    }

    /* renamed from: D */
    public MailMessageRecallState mo151551D() {
        return this.f106942w;
    }

    /* renamed from: E */
    public boolean mo151552E() {
        return this.f106944y;
    }

    /* renamed from: F */
    public List<String> mo151553F() {
        return this.f106911B;
    }

    /* renamed from: H */
    public String mo151555H() {
        return this.f106945z;
    }

    /* renamed from: I */
    public String mo151556I() {
        return this.f106910A;
    }

    /* renamed from: J */
    public C42098k mo151557J() {
        return this.f106913D;
    }

    /* renamed from: L */
    public long mo151559L() {
        return this.f106914E;
    }

    /* renamed from: M */
    public boolean mo151560M() {
        return this.f106915F;
    }

    /* renamed from: N */
    public SendState mo151561N() {
        return this.f106919J;
    }

    /* renamed from: O */
    public ReportType mo151562O() {
        return this.f106916G;
    }

    /* renamed from: P */
    public boolean mo151563P() {
        return this.f106917H;
    }

    /* renamed from: Q */
    public RedirectType mo151564Q() {
        return this.f106918I;
    }

    /* renamed from: a */
    public ThreadSecurityLevel mo151565a() {
        return this.f106912C;
    }

    /* renamed from: b */
    public String mo151581b() {
        return this.f106921b;
    }

    /* renamed from: c */
    public MailAddress mo151586c() {
        return this.f106922c;
    }

    /* renamed from: d */
    public List<MailAddress> mo151591d() {
        return this.f106923d;
    }

    /* renamed from: e */
    public List<MailAddress> mo151598e() {
        return this.f106924e;
    }

    /* renamed from: f */
    public List<MailAddress> mo151601f() {
        return this.f106925f;
    }

    /* renamed from: g */
    public String mo151604g() {
        return this.f106926g;
    }

    /* renamed from: h */
    public String mo151606h() {
        return this.f106927h;
    }

    /* renamed from: i */
    public String mo151608i() {
        return this.f106928i;
    }

    /* renamed from: j */
    public List<MailAttachment> mo151610j() {
        return this.f106929j;
    }

    /* renamed from: k */
    public List<MailImage> mo151611k() {
        return this.f106930k;
    }

    /* renamed from: l */
    public MailThreadStatus mo151612l() {
        return this.f106931l;
    }

    /* renamed from: m */
    public MailMessageDeliveryState mo151613m() {
        return this.f106932m;
    }

    /* renamed from: n */
    public long mo151614n() {
        return this.f106933n;
    }

    /* renamed from: o */
    public long mo151615o() {
        return this.f106934o;
    }

    /* renamed from: p */
    public boolean mo151616p() {
        return this.f106935p;
    }

    /* renamed from: q */
    public long mo151617q() {
        return this.f106936q;
    }

    /* renamed from: w */
    public boolean mo151623w() {
        return this.f106938s;
    }

    /* renamed from: z */
    public String mo151627z() {
        return this.f106937r;
    }

    /* renamed from: a */
    public void mo151578a(String str) {
        this.f106921b = str;
    }

    /* renamed from: a */
    public void mo151579a(List<MailAddress> list) {
        this.f106923d = list;
    }

    /* renamed from: a */
    public void mo151575a(MailThreadStatus mailThreadStatus) {
        this.f106931l = mailThreadStatus;
    }

    /* renamed from: a */
    public void mo151580a(boolean z) {
        this.f106935p = z;
    }

    /* renamed from: a */
    public void mo151577a(C42098k kVar) {
        this.f106913D = kVar;
    }

    /* renamed from: a */
    public void mo151576a(SendState sendState) {
        this.f106919J = sendState;
    }

    public MailMessage() {
        this.f106920a = "MailMessage";
        this.f106938s = true;
    }

    /* renamed from: B */
    public boolean mo151549B() {
        MailCalendar mailCalendar = this.f106940u;
        if (mailCalendar == null || !mailCalendar.mo151276i()) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    public boolean mo151558K() {
        if (this.f106913D.mo151969a() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public boolean mo151618r() {
        List<MailAddress> list = this.f106923d;
        if (list == null || list.size() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public boolean mo151619s() {
        List<MailAddress> list = this.f106924e;
        if (list == null || list.size() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public boolean mo151620t() {
        List<MailAddress> list = this.f106925f;
        if (list == null || list.size() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public boolean mo151622v() {
        List<MailAttachment> list = this.f106929j;
        if (list == null || list.size() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public int mo151625x() {
        if (mo151622v()) {
            return this.f106929j.size();
        }
        return 0;
    }

    /* renamed from: G */
    public String mo151554G() {
        List<String> list = this.f106911B;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.f106911B.get(0);
    }

    /* renamed from: y */
    public Long mo151626y() {
        long j = 0;
        if (!mo151622v()) {
            return 0L;
        }
        for (MailAttachment mailAttachment : this.f106929j) {
            j += mailAttachment.mo151231h();
        }
        return Long.valueOf(j);
    }

    /* renamed from: u */
    public boolean mo151621u() {
        if (TextUtils.equals(C43350d.m172098a().mo155011C(), this.f106922c.mo151189j())) {
            return true;
        }
        List<MailAddress> d = C43350d.m172098a().mo155044j().mo151122d();
        if (C13657b.m55421a(d)) {
            return false;
        }
        for (MailAddress mailAddress : d) {
            if (TextUtils.equals(this.f106922c.mo151182e(), mailAddress.mo151182e())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo151567a(long j) {
        this.f106933n = j;
    }

    /* renamed from: b */
    public void mo151582b(long j) {
        this.f106934o = j;
    }

    /* renamed from: c */
    public void mo151587c(long j) {
        this.f106936q = j;
    }

    /* renamed from: d */
    public void mo151592d(long j) {
        this.f106914E = j;
    }

    /* renamed from: e */
    public void mo151599e(List<MailImage> list) {
        this.f106930k = list;
    }

    /* renamed from: f */
    public void mo151602f(String str) {
        this.f106937r = str;
    }

    /* renamed from: g */
    public void mo151605g(String str) {
        this.f106939t = str;
    }

    /* renamed from: h */
    public void mo151607h(String str) {
        this.f106910A = str;
    }

    /* renamed from: a */
    public void mo151568a(RedirectType redirectType) {
        this.f106918I = redirectType;
    }

    /* renamed from: b */
    public void mo151583b(String str) {
        this.f106926g = str;
    }

    /* renamed from: c */
    public void mo151588c(String str) {
        this.f106927h = str;
    }

    /* renamed from: d */
    public void mo151593d(String str) {
        this.f106928i = str;
    }

    /* renamed from: e */
    public void mo151600e(boolean z) {
        this.f106915F = z;
    }

    /* renamed from: f */
    public void mo151603f(boolean z) {
        this.f106917H = z;
    }

    /* renamed from: b */
    public void mo151584b(List<MailAddress> list) {
        this.f106924e = list;
    }

    /* renamed from: c */
    public void mo151589c(List<MailAddress> list) {
        this.f106925f = list;
    }

    /* renamed from: d */
    public void mo151594d(List<MailAttachment> list) {
        this.f106929j = list;
    }

    /* renamed from: a */
    public void mo151569a(ReportType reportType) {
        this.f106916G = reportType;
    }

    /* renamed from: b */
    public void mo151585b(boolean z) {
        this.f106938s = z;
    }

    /* renamed from: c */
    public void mo151590c(boolean z) {
        this.f106941v = z;
    }

    /* renamed from: d */
    public void mo151595d(boolean z) {
        this.f106944y = z;
    }

    /* renamed from: e */
    public String mo151597e(String str) {
        StringBuilder sb = new StringBuilder();
        for (MailAddress mailAddress : this.f106923d) {
            m167637a(mailAddress, sb);
        }
        for (MailAddress mailAddress2 : this.f106924e) {
            m167637a(mailAddress2, sb);
        }
        if (mo151621u() || "EML".equals(str)) {
            for (MailAddress mailAddress3 : this.f106925f) {
                m167637a(mailAddress3, sb);
            }
        }
        if (sb.length() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }
        return sb.toString();
    }

    /* renamed from: i */
    public void mo151609i(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f106945z = C43853v.f111297a;
        } else {
            this.f106945z = str;
        }
        try {
            JSONArray jSONArray = new JSONArray(this.f106945z);
            int length = jSONArray.length();
            if (length > 0) {
                this.f106911B = new ArrayList();
                for (int i = 0; i < length; i++) {
                    String optString = jSONArray.optString(i);
                    if (TextUtils.isEmpty(optString)) {
                        this.f106911B.add("unknown");
                    } else {
                        this.f106911B.add(optString);
                    }
                }
            }
        } catch (Exception e) {
            Log.m165384e("MailMessage", "setLanguageIdentifier", e);
            this.f106911B = null;
        }
    }

    /* renamed from: a */
    public void mo151570a(ThreadSecurityLevel threadSecurityLevel) {
        this.f106912C = threadSecurityLevel;
    }

    public MailMessage(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.f106920a = "MailMessage";
        boolean z5 = true;
        this.f106938s = true;
        this.f106923d = new ArrayList();
        this.f106924e = new ArrayList();
        this.f106925f = new ArrayList();
        this.f106929j = new ArrayList();
        this.f106930k = new ArrayList();
        this.f106921b = parcel.readString();
        this.f106922c = (MailAddress) parcel.readParcelable(MailAddress.class.getClassLoader());
        parcel.readTypedList(this.f106923d, MailAddress.CREATOR);
        parcel.readTypedList(this.f106924e, MailAddress.CREATOR);
        parcel.readTypedList(this.f106925f, MailAddress.CREATOR);
        this.f106926g = parcel.readString();
        this.f106927h = parcel.readString();
        this.f106928i = parcel.readString();
        parcel.readTypedList(this.f106929j, MailAttachment.CREATOR);
        parcel.readTypedList(this.f106930k, MailImage.CREATOR);
        this.f106931l = (MailThreadStatus) parcel.readParcelable(MailThreadStatus.class.getClassLoader());
        this.f106932m = (MailMessageDeliveryState) parcel.readParcelable(MailMessageDeliveryState.class.getClassLoader());
        this.f106933n = parcel.readLong();
        this.f106934o = parcel.readLong();
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f106935p = z;
        this.f106936q = parcel.readLong();
        this.f106937r = parcel.readString();
        if (parcel.readInt() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f106938s = z2;
        this.f106939t = parcel.readString();
        this.f106940u = (MailCalendar) parcel.readParcelable(MailCalendar.class.getClassLoader());
        if (parcel.readInt() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f106941v = z3;
        MailMessageRecallState mailMessageRecallState = new MailMessageRecallState();
        this.f106942w = mailMessageRecallState;
        mailMessageRecallState.mo151641a(parcel.readInt());
        this.f106943x = parcel.readString();
        if (parcel.readInt() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f106944y = z4;
        mo151609i(parcel.readString());
        this.f106912C = ThreadSecurityLevel.values()[parcel.readInt()];
        C42098k kVar = new C42098k();
        this.f106913D = kVar;
        kVar.mo151970a(parcel.readInt());
        this.f106913D.mo151971a(parcel.readString());
        this.f106914E = parcel.readLong();
        this.f106915F = parcel.readInt() != 1 ? false : z5;
        this.f106910A = parcel.readString();
        this.f106919J = SendState.fromValue(parcel.readInt());
    }

    /* renamed from: a */
    public void mo151571a(MailAddress mailAddress) {
        this.f106922c = mailAddress;
    }

    /* renamed from: a */
    public void mo151572a(MailCalendar mailCalendar) {
        this.f106940u = mailCalendar;
    }

    /* renamed from: a */
    public void mo151573a(MailMessageDeliveryState mailMessageDeliveryState) {
        this.f106932m = mailMessageDeliveryState;
    }

    /* renamed from: a */
    public void mo151574a(MailMessageRecallState mailMessageRecallState) {
        this.f106942w = mailMessageRecallState;
    }

    /* renamed from: a */
    public String mo151566a(boolean z, boolean z2) {
        if (TextUtils.isEmpty(this.f106943x)) {
            this.f106943x = C43762e.m173475a(new Date(this.f106934o), z);
        }
        return this.f106943x;
    }

    /* renamed from: a */
    private void m167637a(MailAddress mailAddress, StringBuilder sb) {
        if (C43350d.m172098a().mo155037b(mailAddress.mo151182e())) {
            sb.append(C41816b.m166115a().mo150132b().getString(R.string.Mail_ThreadList_Me));
            sb.append(", ");
            return;
        }
        if (mailAddress.mo151191l()) {
            sb.append(C43785p.m173537a(mailAddress.mo151190k()));
        }
        if (TextUtils.isEmpty(mailAddress.mo151176a())) {
            sb.append(C43032aa.m171192d(mailAddress.mo151182e()));
        } else {
            sb.append(C43032aa.m171192d(mailAddress.mo151176a()));
        }
        sb.append(", ");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        String str;
        int i3;
        parcel.writeString(this.f106921b);
        parcel.writeParcelable(this.f106922c, i);
        parcel.writeTypedList(this.f106923d);
        parcel.writeTypedList(this.f106924e);
        parcel.writeTypedList(this.f106925f);
        parcel.writeString(this.f106926g);
        parcel.writeString(this.f106927h);
        parcel.writeString(this.f106928i);
        parcel.writeTypedList(this.f106929j);
        parcel.writeTypedList(this.f106930k);
        parcel.writeParcelable(this.f106931l, i);
        parcel.writeParcelable(this.f106932m, i);
        parcel.writeLong(this.f106933n);
        parcel.writeLong(this.f106934o);
        parcel.writeInt(this.f106935p ? 1 : 0);
        parcel.writeLong(this.f106936q);
        parcel.writeString(this.f106937r);
        parcel.writeInt(this.f106938s ? 1 : 0);
        parcel.writeString(this.f106939t);
        parcel.writeParcelable(this.f106940u, i);
        parcel.writeInt(this.f106941v ? 1 : 0);
        parcel.writeInt(this.f106942w.mo151640a());
        parcel.writeString(this.f106943x);
        parcel.writeInt(this.f106944y ? 1 : 0);
        parcel.writeString(this.f106945z);
        ThreadSecurityLevel threadSecurityLevel = this.f106912C;
        int i4 = 0;
        if (threadSecurityLevel == null) {
            i2 = 0;
        } else {
            i2 = threadSecurityLevel.ordinal();
        }
        parcel.writeInt(i2);
        C42098k kVar = this.f106913D;
        if (kVar != null) {
            i4 = kVar.mo151969a();
        }
        parcel.writeInt(i4);
        C42098k kVar2 = this.f106913D;
        if (kVar2 == null) {
            str = "";
        } else {
            str = kVar2.mo151972b();
        }
        parcel.writeString(str);
        parcel.writeLong(this.f106914E);
        parcel.writeInt(this.f106915F ? 1 : 0);
        parcel.writeString(this.f106910A);
        SendState sendState = this.f106919J;
        if (sendState == null) {
            i3 = -1;
        } else {
            i3 = sendState.getValue();
        }
        parcel.writeInt(i3);
    }
}
