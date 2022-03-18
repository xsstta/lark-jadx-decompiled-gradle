package com.bytedance.ee.bear.list.dto;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Objects;

public class Document implements Parcelable {
    public static final Parcelable.Creator<Document> CREATOR = new Parcelable.Creator<Document>() {
        /* class com.bytedance.ee.bear.list.dto.Document.C82721 */

        /* renamed from: a */
        public Document[] newArray(int i) {
            return new Document[i];
        }

        /* renamed from: a */
        public Document createFromParcel(Parcel parcel) {
            return new Document(parcel);
        }
    };

    /* renamed from: A */
    private String f22313A;

    /* renamed from: B */
    private String f22314B;

    /* renamed from: C */
    private String f22315C;

    /* renamed from: D */
    private String f22316D;

    /* renamed from: E */
    private String f22317E;

    /* renamed from: F */
    private String f22318F;

    /* renamed from: G */
    private String f22319G;

    /* renamed from: H */
    private int f22320H;

    /* renamed from: I */
    private boolean f22321I;

    /* renamed from: J */
    private String f22322J;

    /* renamed from: K */
    private String f22323K;

    /* renamed from: L */
    private String f22324L;

    /* renamed from: M */
    private String f22325M = "";

    /* renamed from: N */
    private String f22326N = "";

    /* renamed from: O */
    private boolean f22327O;

    /* renamed from: P */
    private int f22328P;

    /* renamed from: Q */
    private int f22329Q;

    /* renamed from: R */
    private String f22330R;

    /* renamed from: S */
    private String f22331S = "0";

    /* renamed from: T */
    private boolean f22332T;

    /* renamed from: U */
    private boolean f22333U;

    /* renamed from: V */
    private int f22334V;

    /* renamed from: W */
    private boolean f22335W;

    /* renamed from: X */
    private boolean f22336X;

    /* renamed from: Y */
    private String f22337Y;

    /* renamed from: Z */
    private String f22338Z;

    /* renamed from: a */
    private String f22339a;
    private String aa;
    private int ab;
    private DocumentIcon ac = new DocumentIcon();
    private boolean ad;
    private boolean ae;
    private String af;
    private int ag;
    private String ah;

    /* renamed from: ai  reason: collision with root package name */
    private int f175420ai;
    private int aj;
    private boolean ak;
    private boolean al;
    private String am;
    private String an;

    /* renamed from: b */
    private int f22340b;

    /* renamed from: c */
    private String f22341c;

    /* renamed from: d */
    private String f22342d;

    /* renamed from: e */
    private String f22343e;

    /* renamed from: f */
    private String f22344f = "";

    /* renamed from: g */
    private String f22345g;

    /* renamed from: h */
    private String f22346h;

    /* renamed from: i */
    private String f22347i;

    /* renamed from: j */
    private String f22348j;

    /* renamed from: k */
    private String f22349k;

    /* renamed from: l */
    private String f22350l;

    /* renamed from: m */
    private String f22351m;

    /* renamed from: n */
    private boolean f22352n;

    /* renamed from: o */
    private String f22353o;

    /* renamed from: p */
    private String f22354p;

    /* renamed from: q */
    private String f22355q;

    /* renamed from: r */
    private String f22356r = "";

    /* renamed from: s */
    private String f22357s = "";

    /* renamed from: t */
    private String f22358t;

    /* renamed from: u */
    private String f22359u;

    /* renamed from: v */
    private int f22360v;

    /* renamed from: w */
    private boolean f22361w;

    /* renamed from: x */
    private boolean f22362x;

    /* renamed from: y */
    private boolean f22363y;

    /* renamed from: z */
    private boolean f22364z;

    public int describeContents() {
        return 0;
    }

    public static class DocumentIcon implements Parcelable {
        public static final Parcelable.Creator<DocumentIcon> CREATOR = new Parcelable.Creator<DocumentIcon>() {
            /* class com.bytedance.ee.bear.list.dto.Document.DocumentIcon.C82731 */

            /* renamed from: a */
            public DocumentIcon[] newArray(int i) {
                return new DocumentIcon[i];
            }

            /* renamed from: a */
            public DocumentIcon createFromParcel(Parcel parcel) {
                return new DocumentIcon(parcel);
            }
        };

        /* renamed from: a */
        private String f22365a;

        /* renamed from: b */
        private int f22366b = -1;

        /* renamed from: c */
        private String f22367c;

        public int describeContents() {
            return 0;
        }

        /* renamed from: a */
        public String mo32502a() {
            return this.f22365a;
        }

        /* renamed from: b */
        public int mo32505b() {
            return this.f22366b;
        }

        /* renamed from: c */
        public String mo32507c() {
            return this.f22367c;
        }

        public DocumentIcon() {
        }

        public String toString() {
            return "DocumentIcon{iconKey='" + this.f22365a + '\'' + ", iconType=" + this.f22366b + ", iconFsunit='" + this.f22367c + '\'' + '}';
        }

        /* renamed from: a */
        public void mo32503a(int i) {
            this.f22366b = i;
        }

        /* renamed from: b */
        public void mo32506b(String str) {
            this.f22367c = str;
        }

        /* renamed from: a */
        public void mo32504a(String str) {
            this.f22365a = str;
        }

        protected DocumentIcon(Parcel parcel) {
            this.f22365a = parcel.readString();
            this.f22366b = parcel.readInt();
            this.f22367c = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f22365a);
            parcel.writeInt(this.f22366b);
            parcel.writeString(this.f22367c);
        }
    }

    /* renamed from: A */
    public String mo32373A() {
        return this.f22348j;
    }

    /* renamed from: B */
    public String mo32375B() {
        return this.f22359u;
    }

    /* renamed from: C */
    public String mo32377C() {
        return this.f22316D;
    }

    /* renamed from: D */
    public String mo32379D() {
        return this.f22317E;
    }

    /* renamed from: E */
    public String mo32381E() {
        return this.f22318F;
    }

    /* renamed from: F */
    public String mo32383F() {
        return this.f22319G;
    }

    /* renamed from: G */
    public int mo32385G() {
        return this.f22320H;
    }

    /* renamed from: H */
    public String mo32387H() {
        return this.f22324L;
    }

    /* renamed from: I */
    public String mo32389I() {
        return this.f22322J;
    }

    /* renamed from: J */
    public String mo32391J() {
        return this.f22323K;
    }

    /* renamed from: K */
    public String mo32393K() {
        return this.f22325M;
    }

    /* renamed from: L */
    public String mo32395L() {
        return this.f22326N;
    }

    /* renamed from: M */
    public int mo32397M() {
        return this.f22328P;
    }

    /* renamed from: N */
    public int mo32398N() {
        return this.f22329Q;
    }

    /* renamed from: O */
    public String mo32399O() {
        return this.f22351m;
    }

    /* renamed from: P */
    public boolean mo32400P() {
        return this.f22362x;
    }

    /* renamed from: Q */
    public String mo32401Q() {
        return this.f22344f;
    }

    /* renamed from: R */
    public boolean mo32402R() {
        return this.f22352n;
    }

    /* renamed from: S */
    public String mo32403S() {
        return this.f22355q;
    }

    /* renamed from: T */
    public boolean mo32404T() {
        return this.f22321I;
    }

    /* renamed from: U */
    public boolean mo32405U() {
        return this.f22327O;
    }

    /* renamed from: V */
    public String mo32406V() {
        return this.f22330R;
    }

    /* renamed from: W */
    public String mo32407W() {
        return this.f22331S;
    }

    /* renamed from: X */
    public boolean mo32408X() {
        return this.f22332T;
    }

    /* renamed from: Y */
    public boolean mo32409Y() {
        return this.f22333U;
    }

    /* renamed from: Z */
    public int mo32410Z() {
        return this.f22334V;
    }

    public boolean aa() {
        return this.f22335W;
    }

    public boolean ab() {
        return this.f22336X;
    }

    public String ac() {
        return this.f22337Y;
    }

    public String ad() {
        return this.f22338Z;
    }

    public String ae() {
        return this.aa;
    }

    public int af() {
        return this.ab;
    }

    public DocumentIcon ag() {
        return this.ac;
    }

    public boolean ah() {
        return this.ad;
    }

    public boolean ai() {
        return this.ae;
    }

    public String aj() {
        return this.af;
    }

    public int ak() {
        return this.ag;
    }

    public boolean am() {
        return this.f22364z;
    }

    public int an() {
        return this.f175420ai;
    }

    public int ao() {
        return this.aj;
    }

    public boolean ap() {
        return this.ak;
    }

    public boolean aq() {
        return this.al;
    }

    public String ar() {
        return this.am;
    }

    /* renamed from: i */
    public String mo32449i() {
        return this.an;
    }

    /* renamed from: k */
    public String mo32457k() {
        return this.f22343e;
    }

    /* renamed from: m */
    public String mo32465m() {
        return this.f22314B;
    }

    /* renamed from: n */
    public String mo32469n() {
        return this.f22339a;
    }

    /* renamed from: o */
    public String mo32472o() {
        return this.f22342d;
    }

    /* renamed from: p */
    public String mo32475p() {
        return this.f22341c;
    }

    /* renamed from: q */
    public String mo32477q() {
        return this.f22345g;
    }

    /* renamed from: r */
    public String mo32479r() {
        return this.f22347i;
    }

    /* renamed from: s */
    public String mo32481s() {
        return this.f22354p;
    }

    /* renamed from: t */
    public int mo32483t() {
        return this.f22340b;
    }

    /* renamed from: u */
    public int mo32486u() {
        return this.f22360v;
    }

    /* renamed from: v */
    public String mo32488v() {
        return this.f22356r;
    }

    /* renamed from: w */
    public String mo32490w() {
        return this.f22357s;
    }

    /* renamed from: x */
    public String mo32492x() {
        return this.f22350l;
    }

    /* renamed from: y */
    public String mo32494y() {
        return this.f22353o;
    }

    /* renamed from: z */
    public String mo32496z() {
        return this.f22358t;
    }

    public String al() {
        String str = this.ah;
        if (str != null) {
            return str;
        }
        return "";
    }

    public Document() {
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f22340b), this.f22342d, this.f22359u);
    }

    /* renamed from: j */
    public boolean mo32456j() {
        return this.f22363y;
    }

    /* renamed from: l */
    public boolean mo32464l() {
        return this.f22361w;
    }

    public String toString() {
        return "Document{, type=" + this.f22340b + ", token='" + '\'' + ", objToken='" + '\'' + ", linkToken='" + '\'' + ", editTime='" + this.f22347i + '\'' + ", createTime='" + this.f22348j + '\'' + ", expireTime='" + this.f22349k + '\'' + ", openTime='" + this.f22350l + '\'' + ", spaceId='" + this.f22351m + '\'' + ", url='" + '\'' + ", path='" + '\'' + ", fakeToken='" + this.f22359u + '\'' + ", syncState=" + this.f22360v + ", hasDataCached=" + this.f22361w + ", documentIcon=" + this.ac + ", isExternal=" + this.f22362x + ", hasPermission=" + this.ad + ", showExternalHint=" + this.ae + ", appId=" + this.af + ", ownerType=" + this.f175420ai + '}';
    }

    /* renamed from: a */
    public void mo32411a(DocumentIcon documentIcon) {
        this.ac = documentIcon;
    }

    /* renamed from: b */
    public void mo32431b(boolean z) {
        this.f22361w = z;
    }

    /* renamed from: c */
    public void mo32432c(boolean z) {
        this.f22362x = z;
    }

    /* renamed from: d */
    public void mo32433d(int i) {
        this.f22340b = i;
    }

    /* renamed from: e */
    public void mo32436e(int i) {
        this.f22360v = i;
    }

    /* renamed from: f */
    public void mo32439f(int i) {
        this.f22320H = i;
    }

    /* renamed from: g */
    public void mo32442g(int i) {
        this.f22328P = i;
    }

    /* renamed from: h */
    public void mo32445h(int i) {
        this.f22329Q = i;
    }

    /* renamed from: j */
    public void mo32453j(int i) {
        this.ab = i;
    }

    /* renamed from: l */
    public void mo32461l(int i) {
        this.f175420ai = i;
    }

    /* renamed from: A */
    public void mo32374A(String str) {
        this.f22323K = str;
    }

    /* renamed from: B */
    public void mo32376B(String str) {
        this.f22351m = str;
    }

    /* renamed from: C */
    public void mo32378C(String str) {
        this.f22344f = str;
    }

    /* renamed from: D */
    public void mo32380D(String str) {
        this.f22355q = str;
    }

    /* renamed from: E */
    public void mo32382E(String str) {
        this.f22330R = str;
    }

    /* renamed from: F */
    public void mo32384F(String str) {
        this.f22331S = str;
    }

    /* renamed from: G */
    public void mo32386G(String str) {
        this.f22337Y = str;
    }

    /* renamed from: H */
    public void mo32388H(String str) {
        this.f22338Z = str;
    }

    /* renamed from: I */
    public void mo32390I(String str) {
        this.aa = str;
    }

    /* renamed from: J */
    public void mo32392J(String str) {
        this.af = str;
    }

    /* renamed from: K */
    public void mo32394K(String str) {
        this.ah = str;
    }

    /* renamed from: L */
    public void mo32396L(String str) {
        this.am = str;
    }

    /* renamed from: a */
    public void mo32412a(boolean z) {
        this.f22363y = z;
    }

    /* renamed from: d */
    public void mo32434d(String str) {
        this.f22343e = str;
    }

    /* renamed from: e */
    public void mo32437e(String str) {
        this.f22313A = str;
    }

    /* renamed from: f */
    public void mo32440f(String str) {
        this.f22314B = str;
    }

    /* renamed from: g */
    public void mo32443g(String str) {
        this.f22339a = str;
    }

    /* renamed from: h */
    public void mo32446h(String str) {
        this.f22346h = str;
    }

    /* renamed from: i */
    public void mo32450i(int i) {
        this.f22334V = i;
    }

    /* renamed from: j */
    public void mo32454j(String str) {
        this.f22341c = str;
    }

    /* renamed from: k */
    public void mo32458k(int i) {
        this.ag = i;
    }

    /* renamed from: l */
    public void mo32462l(String str) {
        this.f22347i = str;
    }

    /* renamed from: m */
    public void mo32466m(int i) {
        this.aj = i;
    }

    /* renamed from: n */
    public void mo32470n(String str) {
        this.f22356r = str;
    }

    /* renamed from: o */
    public void mo32473o(String str) {
        this.f22357s = str;
    }

    /* renamed from: p */
    public void mo32476p(String str) {
        this.f22350l = str;
    }

    /* renamed from: q */
    public void mo32478q(String str) {
        this.f22353o = str;
    }

    /* renamed from: r */
    public void mo32480r(String str) {
        this.f22358t = str;
    }

    /* renamed from: s */
    public void mo32482s(String str) {
        this.f22348j = str;
    }

    /* renamed from: t */
    public void mo32484t(String str) {
        this.f22359u = str;
    }

    /* renamed from: u */
    public void mo32487u(String str) {
        this.f22316D = str;
    }

    /* renamed from: v */
    public void mo32489v(String str) {
        this.f22317E = str;
    }

    /* renamed from: w */
    public void mo32491w(String str) {
        this.f22318F = str;
    }

    /* renamed from: x */
    public void mo32493x(String str) {
        this.f22319G = str;
    }

    /* renamed from: y */
    public void mo32495y(String str) {
        this.f22324L = str;
    }

    /* renamed from: z */
    public void mo32497z(String str) {
        this.f22322J = str;
    }

    /* renamed from: d */
    public void mo32435d(boolean z) {
        this.f22352n = z;
    }

    /* renamed from: e */
    public void mo32438e(boolean z) {
        this.f22321I = z;
    }

    /* renamed from: f */
    public void mo32441f(boolean z) {
        this.f22327O = z;
    }

    /* renamed from: g */
    public void mo32444g(boolean z) {
        this.f22332T = z;
    }

    /* renamed from: h */
    public void mo32447h(boolean z) {
        this.f22333U = z;
    }

    /* renamed from: i */
    public void mo32451i(String str) {
        this.f22342d = str;
    }

    /* renamed from: j */
    public void mo32455j(boolean z) {
        this.f22336X = z;
    }

    /* renamed from: k */
    public void mo32459k(String str) {
        this.f22345g = str;
    }

    /* renamed from: l */
    public void mo32463l(boolean z) {
        this.ae = z;
    }

    /* renamed from: m */
    public void mo32467m(String str) {
        this.f22354p = str;
    }

    /* renamed from: n */
    public void mo32471n(boolean z) {
        this.ak = z;
    }

    /* renamed from: o */
    public void mo32474o(boolean z) {
        this.al = z;
    }

    /* renamed from: M */
    public static boolean m33924M(String str) {
        if (TextUtils.isEmpty(str) || !str.toLowerCase().startsWith("fake_")) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public void mo32452i(boolean z) {
        this.f22335W = z;
    }

    /* renamed from: k */
    public void mo32460k(boolean z) {
        this.ad = z;
    }

    /* renamed from: m */
    public void mo32468m(boolean z) {
        this.f22364z = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Document document = (Document) obj;
            if (!TextUtils.isEmpty(this.f22342d) && !TextUtils.isEmpty(document.f22342d) && !m33924M(this.f22342d) && !m33924M(document.f22342d)) {
                return TextUtils.equals(this.f22342d, document.f22342d);
            }
            if (!TextUtils.isEmpty(this.f22359u) && !TextUtils.isEmpty(document.f22359u)) {
                return TextUtils.equals(this.f22359u, document.f22359u);
            }
        }
        return false;
    }

    protected Document(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        this.f22339a = parcel.readString();
        this.f22340b = parcel.readInt();
        this.f22341c = parcel.readString();
        this.f22342d = parcel.readString();
        this.f22343e = parcel.readString();
        this.f22344f = parcel.readString();
        this.f22345g = parcel.readString();
        this.f22346h = parcel.readString();
        this.f22347i = parcel.readString();
        this.f22348j = parcel.readString();
        this.f22349k = parcel.readString();
        this.f22350l = parcel.readString();
        this.f22351m = parcel.readString();
        boolean z15 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f22352n = z;
        this.f22353o = parcel.readString();
        this.f22354p = parcel.readString();
        this.f22355q = parcel.readString();
        this.f22356r = parcel.readString();
        this.f22357s = parcel.readString();
        this.f22358t = parcel.readString();
        this.f22359u = parcel.readString();
        this.f22360v = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f22361w = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f22362x = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f22363y = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f22364z = z5;
        this.f22313A = parcel.readString();
        this.f22314B = parcel.readString();
        this.f22315C = parcel.readString();
        this.f22316D = parcel.readString();
        this.f22317E = parcel.readString();
        this.f22318F = parcel.readString();
        this.f22319G = parcel.readString();
        this.f22320H = parcel.readInt();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f22321I = z6;
        this.f22322J = parcel.readString();
        this.f22323K = parcel.readString();
        this.f22324L = parcel.readString();
        this.f22325M = parcel.readString();
        this.f22326N = parcel.readString();
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f22327O = z7;
        this.f22328P = parcel.readInt();
        this.f22329Q = parcel.readInt();
        this.f22330R = parcel.readString();
        this.f22331S = parcel.readString();
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f22332T = z8;
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f22333U = z9;
        this.f22334V = parcel.readInt();
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f22335W = z10;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f22336X = z11;
        this.f22337Y = parcel.readString();
        this.f22338Z = parcel.readString();
        this.aa = parcel.readString();
        this.ab = parcel.readInt();
        this.ac = (DocumentIcon) parcel.readParcelable(DocumentIcon.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.ad = z12;
        if (parcel.readByte() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.ae = z13;
        this.af = parcel.readString();
        this.ag = parcel.readInt();
        this.aj = parcel.readInt();
        if (parcel.readByte() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.ak = z14;
        this.al = parcel.readByte() == 0 ? false : z15;
        this.am = parcel.readString();
        this.ah = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f22339a);
        parcel.writeInt(this.f22340b);
        parcel.writeString(this.f22341c);
        parcel.writeString(this.f22342d);
        parcel.writeString(this.f22343e);
        parcel.writeString(this.f22344f);
        parcel.writeString(this.f22345g);
        parcel.writeString(this.f22346h);
        parcel.writeString(this.f22347i);
        parcel.writeString(this.f22348j);
        parcel.writeString(this.f22349k);
        parcel.writeString(this.f22350l);
        parcel.writeString(this.f22351m);
        parcel.writeByte(this.f22352n ? (byte) 1 : 0);
        parcel.writeString(this.f22353o);
        parcel.writeString(this.f22354p);
        parcel.writeString(this.f22355q);
        parcel.writeString(this.f22356r);
        parcel.writeString(this.f22357s);
        parcel.writeString(this.f22358t);
        parcel.writeString(this.f22359u);
        parcel.writeInt(this.f22360v);
        parcel.writeByte(this.f22361w ? (byte) 1 : 0);
        parcel.writeByte(this.f22362x ? (byte) 1 : 0);
        parcel.writeByte(this.f22363y ? (byte) 1 : 0);
        parcel.writeByte(this.f22364z ? (byte) 1 : 0);
        parcel.writeString(this.f22313A);
        parcel.writeString(this.f22314B);
        parcel.writeString(this.f22315C);
        parcel.writeString(this.f22316D);
        parcel.writeString(this.f22317E);
        parcel.writeString(this.f22318F);
        parcel.writeString(this.f22319G);
        parcel.writeInt(this.f22320H);
        parcel.writeByte(this.f22321I ? (byte) 1 : 0);
        parcel.writeString(this.f22322J);
        parcel.writeString(this.f22323K);
        parcel.writeString(this.f22324L);
        parcel.writeString(this.f22325M);
        parcel.writeString(this.f22326N);
        parcel.writeByte(this.f22327O ? (byte) 1 : 0);
        parcel.writeInt(this.f22328P);
        parcel.writeInt(this.f22329Q);
        parcel.writeString(this.f22330R);
        parcel.writeString(this.f22331S);
        parcel.writeByte(this.f22332T ? (byte) 1 : 0);
        parcel.writeByte(this.f22333U ? (byte) 1 : 0);
        parcel.writeInt(this.f22334V);
        parcel.writeByte(this.f22335W ? (byte) 1 : 0);
        parcel.writeByte(this.f22336X ? (byte) 1 : 0);
        parcel.writeString(this.f22337Y);
        parcel.writeString(this.f22338Z);
        parcel.writeString(this.aa);
        parcel.writeInt(this.ab);
        parcel.writeParcelable(this.ac, i);
        parcel.writeByte(this.ad ? (byte) 1 : 0);
        parcel.writeByte(this.ae ? (byte) 1 : 0);
        parcel.writeString(this.af);
        parcel.writeInt(this.ag);
        parcel.writeInt(this.aj);
        parcel.writeByte(this.ak ? (byte) 1 : 0);
        parcel.writeByte(this.al ? (byte) 1 : 0);
        parcel.writeString(this.am);
        parcel.writeString(this.ah);
    }
}
