package com.ss.android.lark.mail.impl.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.lark.mail.impl.validator.C43861a;
import java.util.Objects;

public class MailAddress implements Parcelable {
    public static final Parcelable.Creator<MailAddress> CREATOR = new Parcelable.Creator<MailAddress>() {
        /* class com.ss.android.lark.mail.impl.entity.MailAddress.C420611 */

        /* renamed from: a */
        public MailAddress[] newArray(int i) {
            return new MailAddress[i];
        }

        /* renamed from: a */
        public MailAddress createFromParcel(Parcel parcel) {
            return new MailAddress(parcel);
        }
    };

    /* renamed from: a */
    protected String f106763a;

    /* renamed from: b */
    protected String f106764b;

    /* renamed from: c */
    protected String f106765c;

    /* renamed from: d */
    protected AddressType f106766d;

    /* renamed from: e */
    protected String f106767e;

    /* renamed from: f */
    protected String f106768f;

    /* renamed from: g */
    protected String f106769g;

    /* renamed from: h */
    protected String f106770h;

    /* renamed from: i */
    int f106771i;

    /* renamed from: j */
    MailSharedMailboxOperator f106772j;

    /* renamed from: k */
    private int f106773k;

    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public String mo151184f() {
        return this.f106770h;
    }

    /* renamed from: k */
    public AddressType mo151190k() {
        return this.f106766d;
    }

    /* renamed from: m */
    public String mo151192m() {
        return this.f106767e;
    }

    /* renamed from: n */
    public int mo151193n() {
        return this.f106773k;
    }

    /* renamed from: o */
    public MailSharedMailboxOperator mo151194o() {
        return this.f106772j;
    }

    /* renamed from: p */
    public String mo151195p() {
        return this.f106768f;
    }

    /* renamed from: q */
    public String mo151196q() {
        return this.f106769g;
    }

    /* renamed from: b */
    public String mo151177b() {
        String str = this.f106763a;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: e */
    public String mo151182e() {
        String str = this.f106764b;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: a */
    public String mo151176a() {
        if (!TextUtils.isEmpty(this.f106770h)) {
            return this.f106770h;
        }
        return mo151177b();
    }

    /* renamed from: j */
    public String mo151189j() {
        if (mo151188i()) {
            return "";
        }
        return this.f106765c;
    }

    /* renamed from: c */
    public String mo151179c() {
        if (TextUtils.isEmpty(this.f106763a)) {
            return mo151182e();
        }
        return mo151176a();
    }

    /* renamed from: h */
    public boolean mo151186h() {
        if (!TextUtils.isEmpty(this.f106764b) || (TextUtils.isEmpty(this.f106764b) && !mo151188i())) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo151188i() {
        if (TextUtils.isEmpty(this.f106765c) || "0".equals(this.f106765c)) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean mo151191l() {
        if (this.f106766d == AddressType.GROUP || this.f106766d == AddressType.ENTERPRISE_MAIL_GROUP) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (!TextUtils.isEmpty(this.f106764b)) {
            return this.f106764b;
        }
        String str = this.f106763a;
        if (str != null) {
            return str;
        }
        return "";
    }

    /* renamed from: com.ss.android.lark.mail.impl.entity.MailAddress$a */
    public static class C42062a {

        /* renamed from: a */
        public String f106774a;

        /* renamed from: b */
        public String f106775b;

        /* renamed from: c */
        public String f106776c;

        /* renamed from: d */
        public AddressType f106777d;

        /* renamed from: e */
        public String f106778e;

        /* renamed from: f */
        public String f106779f;

        /* renamed from: g */
        public String f106780g;

        /* renamed from: h */
        public int f106781h;

        /* renamed from: i */
        MailSharedMailboxOperator f106782i;

        /* renamed from: j */
        public int f106783j = 1;

        /* renamed from: k */
        public String f106784k;

        /* renamed from: a */
        public MailAddress mo151210a() {
            return new MailAddress(this.f106774a, this.f106775b, this.f106776c, this.f106779f, this.f106783j, this.f106782i, this.f106780g, this.f106777d, this.f106778e, this.f106781h, this.f106784k);
        }

        /* renamed from: a */
        public C42062a mo151206a(int i) {
            this.f106781h = i;
            return this;
        }

        /* renamed from: b */
        public C42062a mo151211b(int i) {
            this.f106783j = i;
            return this;
        }

        /* renamed from: d */
        public C42062a mo151214d(String str) {
            this.f106778e = str;
            return this;
        }

        /* renamed from: e */
        public C42062a mo151215e(String str) {
            this.f106779f = str;
            return this;
        }

        /* renamed from: g */
        public C42062a mo151217g(String str) {
            this.f106784k = str;
            return this;
        }

        /* renamed from: a */
        public C42062a mo151207a(AddressType addressType) {
            this.f106777d = addressType;
            return this;
        }

        /* renamed from: b */
        public C42062a mo151212b(String str) {
            this.f106775b = str;
            return this;
        }

        /* renamed from: a */
        public C42062a mo151208a(MailSharedMailboxOperator mailSharedMailboxOperator) {
            this.f106782i = mailSharedMailboxOperator;
            return this;
        }

        /* renamed from: c */
        public C42062a mo151213c(String str) {
            if ("0".equals(str)) {
                str = "";
            }
            this.f106776c = str;
            return this;
        }

        /* renamed from: f */
        public C42062a mo151216f(String str) {
            if ("0".equals(str)) {
                str = "";
            }
            this.f106780g = str;
            return this;
        }

        /* renamed from: a */
        public C42062a mo151209a(String str) {
            this.f106774a = str;
            return this;
        }
    }

    /* renamed from: d */
    public String mo151180d() {
        if (TextUtils.isEmpty(this.f106764b)) {
            return mo151176a();
        }
        return mo151182e();
    }

    /* renamed from: g */
    public boolean mo151185g() {
        int i = 1;
        if (TextUtils.isEmpty(this.f106764b)) {
            return !mo151188i();
        }
        int i2 = this.f106771i;
        if (i2 == 1) {
            return true;
        }
        if (i2 != 0) {
            return false;
        }
        boolean d = m167323d(this.f106764b);
        if (!d) {
            i = -1;
        }
        this.f106771i = i;
        return d;
    }

    public int hashCode() {
        if (!mo151182e().isEmpty()) {
            return mo151182e().hashCode();
        }
        if (!mo151189j().isEmpty()) {
            return mo151189j().hashCode();
        }
        return mo151177b().hashCode();
    }

    /* renamed from: t */
    public C42062a mo151199t() {
        C42062a aVar = new C42062a();
        aVar.mo151209a(this.f106763a);
        aVar.mo151212b(this.f106764b);
        aVar.mo151213c(this.f106765c);
        aVar.mo151207a(this.f106766d);
        aVar.mo151214d(this.f106768f);
        aVar.mo151215e(this.f106767e);
        aVar.mo151216f(this.f106769g);
        aVar.mo151211b(this.f106773k);
        aVar.mo151208a(this.f106772j);
        aVar.mo151206a(this.f106771i);
        aVar.mo151217g(this.f106770h);
        return aVar;
    }

    /* renamed from: r */
    public String mo151197r() {
        if (TextUtils.isEmpty(this.f106763a)) {
            if (!TextUtils.isEmpty(this.f106764b)) {
                return this.f106764b;
            }
            return mo151189j();
        } else if (TextUtils.isEmpty(this.f106764b)) {
            return this.f106763a;
        } else {
            return this.f106763a + "<" + this.f106764b + ">";
        }
    }

    /* renamed from: s */
    public String mo151198s() {
        if (TextUtils.isEmpty(this.f106763a)) {
            if (!TextUtils.isEmpty(this.f106764b)) {
                return this.f106764b;
            }
            return String.valueOf(mo151189j().hashCode());
        } else if (!TextUtils.isEmpty(this.f106764b)) {
            return "\"" + this.f106763a + "\"<" + this.f106764b + ">";
        } else {
            return "\"" + this.f106763a + "\"";
        }
    }

    /* renamed from: b */
    public void mo151178b(String str) {
        this.f106767e = str;
    }

    protected MailAddress(C42062a aVar) {
        this(aVar.f106774a, aVar.f106775b, aVar.f106776c, aVar.f106779f, aVar.f106783j, aVar.f106782i, aVar.f106780g, aVar.f106777d, aVar.f106778e, aVar.f106781h, aVar.f106784k);
    }

    /* renamed from: d */
    private static boolean m167323d(String str) {
        if (str != null && !str.trim().isEmpty()) {
            try {
                return new C43861a().mo156232a(str);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: c */
    public static String m167322c(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            return str.substring(1, str.length() - 1);
        }
        if (!str.startsWith("'") || !str.endsWith("'")) {
            return str;
        }
        return str.substring(1, str.length() - 1);
    }

    public MailAddress(Parcel parcel) {
        this.f106773k = 1;
        this.f106763a = parcel.readString();
        this.f106764b = parcel.readString();
        this.f106765c = parcel.readString();
        this.f106767e = parcel.readString();
        this.f106773k = parcel.readInt();
        this.f106766d = AddressType.fromValue(parcel.readInt());
        this.f106771i = parcel.readInt();
        this.f106772j = (MailSharedMailboxOperator) parcel.readParcelable(MailSharedMailboxOperator.class.getClassLoader());
        this.f106768f = parcel.readString();
        this.f106769g = parcel.readString();
        this.f106770h = parcel.readString();
    }

    /* renamed from: a */
    public static MailAddress m167321a(String str) {
        C42062a aVar = new C42062a();
        if (!TextUtils.isEmpty(str)) {
            try {
                C43861a aVar2 = new C43861a();
                if (aVar2.mo156232a(str)) {
                    aVar.mo151209a(aVar2.mo156231a().mo156299a()).mo151212b(aVar2.mo156231a().mo156305d()).mo151206a(1);
                } else {
                    aVar.mo151209a(m167322c(str)).mo151206a(-1);
                }
            } catch (Exception unused) {
            }
        }
        return aVar.mo151210a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MailAddress)) {
            return false;
        }
        MailAddress mailAddress = (MailAddress) obj;
        if (!mo151182e().isEmpty()) {
            return Objects.equals(mo151182e(), mailAddress.mo151182e());
        }
        if (!mo151189j().isEmpty()) {
            return Objects.equals(mo151189j(), mailAddress.mo151189j());
        }
        return Objects.equals(mo151177b(), mailAddress.mo151177b());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f106763a);
        parcel.writeString(this.f106764b);
        parcel.writeString(mo151189j());
        parcel.writeString(this.f106767e);
        parcel.writeInt(this.f106773k);
        AddressType addressType = this.f106766d;
        if (addressType == null) {
            addressType = AddressType.UNKNOWN;
        }
        parcel.writeInt(addressType.getValue());
        parcel.writeInt(this.f106771i);
        parcel.writeParcelable(this.f106772j, i);
        parcel.writeString(this.f106768f);
        parcel.writeString(this.f106769g);
        parcel.writeString(this.f106770h);
    }

    protected MailAddress(String str, String str2, String str3, String str4, int i, MailSharedMailboxOperator mailSharedMailboxOperator, String str5, AddressType addressType, String str6, int i2, String str7) {
        this.f106773k = 1;
        this.f106763a = str;
        this.f106764b = str2;
        this.f106765c = str3;
        this.f106767e = str4;
        this.f106773k = i;
        this.f106771i = i2;
        this.f106772j = mailSharedMailboxOperator;
        this.f106769g = "0".equals(str5) ? "" : str5;
        this.f106766d = addressType;
        this.f106768f = str6;
        this.f106770h = str7;
    }
}
