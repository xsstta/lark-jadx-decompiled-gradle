package com.ss.android.lark.mail.impl.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.utils.C43761d;
import com.ss.android.lark.mail.impl.utils.C43769k;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MailLabelEntity implements Parcelable {
    public static final Parcelable.Creator<MailLabelEntity> CREATOR = new Parcelable.Creator<MailLabelEntity>() {
        /* class com.ss.android.lark.mail.impl.entity.MailLabelEntity.C420751 */

        /* renamed from: a */
        public MailLabelEntity[] newArray(int i) {
            return new MailLabelEntity[i];
        }

        /* renamed from: a */
        public MailLabelEntity createFromParcel(Parcel parcel) {
            return new MailLabelEntity(parcel);
        }
    };

    /* renamed from: A */
    private int f106881A = 1;

    /* renamed from: B */
    private int f106882B;

    /* renamed from: C */
    private int f106883C;

    /* renamed from: a */
    private String f106884a;

    /* renamed from: b */
    private int f106885b;

    /* renamed from: c */
    private String f106886c;

    /* renamed from: d */
    private boolean f106887d;

    /* renamed from: e */
    private int f106888e;

    /* renamed from: f */
    private int f106889f;

    /* renamed from: g */
    private String f106890g;

    /* renamed from: h */
    private String f106891h;

    /* renamed from: i */
    private Pair<Integer, Integer> f106892i;

    /* renamed from: j */
    private Pair<Integer, Integer> f106893j;

    /* renamed from: k */
    private String f106894k;

    /* renamed from: l */
    private List<String> f106895l;

    /* renamed from: m */
    private String f106896m;

    /* renamed from: n */
    private String f106897n;

    /* renamed from: o */
    private int f106898o;

    /* renamed from: p */
    private boolean f106899p;

    /* renamed from: q */
    private long f106900q;

    /* renamed from: r */
    private long f106901r;

    /* renamed from: s */
    private boolean f106902s;

    /* renamed from: t */
    private long f106903t;

    /* renamed from: u */
    private int f106904u;

    /* renamed from: v */
    private int f106905v;

    /* renamed from: w */
    private boolean f106906w = true;

    /* renamed from: x */
    private boolean f106907x;

    /* renamed from: y */
    private boolean f106908y = true;

    /* renamed from: z */
    private int f106909z = 1;

    public int describeContents() {
        return 0;
    }

    /* renamed from: w */
    public boolean mo151539w() {
        return true;
    }

    /* renamed from: A */
    public String mo151492A() {
        return this.f106894k;
    }

    /* renamed from: B */
    public List<String> mo151493B() {
        return this.f106895l;
    }

    /* renamed from: a */
    public int mo151494a() {
        return this.f106882B;
    }

    /* renamed from: b */
    public int mo151500b() {
        return this.f106885b;
    }

    /* renamed from: d */
    public int mo151510d() {
        return this.f106904u;
    }

    /* renamed from: f */
    public String mo151518f() {
        return this.f106890g;
    }

    /* renamed from: j */
    public String mo151526j() {
        return this.f106891h;
    }

    /* renamed from: k */
    public String mo151527k() {
        return this.f106884a;
    }

    /* renamed from: l */
    public String mo151528l() {
        return this.f106886c;
    }

    /* renamed from: m */
    public boolean mo151529m() {
        return this.f106887d;
    }

    /* renamed from: n */
    public long mo151530n() {
        return this.f106900q;
    }

    /* renamed from: o */
    public long mo151531o() {
        return this.f106901r;
    }

    /* renamed from: p */
    public boolean mo151532p() {
        return this.f106902s;
    }

    /* renamed from: q */
    public long mo151533q() {
        return this.f106903t;
    }

    /* renamed from: r */
    public boolean mo151534r() {
        return this.f106906w;
    }

    /* renamed from: s */
    public int mo151535s() {
        return this.f106909z;
    }

    /* renamed from: t */
    public int mo151536t() {
        return this.f106881A;
    }

    /* renamed from: u */
    public int mo151537u() {
        return this.f106883C;
    }

    /* renamed from: v */
    public int mo151538v() {
        return this.f106905v;
    }

    /* renamed from: x */
    public String mo151541x() {
        return this.f106896m;
    }

    /* renamed from: y */
    public String mo151542y() {
        return this.f106897n;
    }

    /* renamed from: z */
    public int mo151543z() {
        return this.f106898o;
    }

    /* renamed from: c */
    public int mo151505c() {
        return mo151515e();
    }

    public MailLabelEntity() {
    }

    /* renamed from: g */
    public int mo151521g() {
        m167585D();
        return ((Integer) this.f106892i.first).intValue();
    }

    /* renamed from: i */
    public int mo151525i() {
        m167585D();
        return ((Integer) this.f106892i.second).intValue();
    }

    /* renamed from: e */
    public int mo151515e() {
        m167584C();
        if (UDUiModeUtils.m93319a(C41816b.m166115a().mo150132b())) {
            return ((Integer) this.f106893j.first).intValue();
        }
        return ((Integer) this.f106892i.first).intValue();
    }

    /* renamed from: h */
    public int mo151523h() {
        m167584C();
        if (UDUiModeUtils.m93319a(C41816b.m166115a().mo150132b())) {
            return ((Integer) this.f106893j.second).intValue();
        }
        return ((Integer) this.f106892i.second).intValue();
    }

    /* renamed from: C */
    private void m167584C() {
        if (this.f106887d) {
            if (UDUiModeUtils.m93319a(C41816b.m166115a().mo150132b())) {
                if (this.f106893j == null) {
                    this.f106893j = new Pair<>(Integer.valueOf(UIHelper.getColor(R.color.udtoken_tag_neutral_text_normal)), Integer.valueOf(UIHelper.getColor(R.color.udtoken_tag_neutral_bg_normal)));
                }
            } else if (this.f106892i == null) {
                this.f106892i = new Pair<>(Integer.valueOf(UIHelper.getColor(R.color.udtoken_tag_neutral_text_normal)), Integer.valueOf(UIHelper.getColor(R.color.udtoken_tag_neutral_bg_normal)));
            }
        } else if (UDUiModeUtils.m93319a(C41816b.m166115a().mo150132b())) {
            if (this.f106893j == null) {
                this.f106893j = C43769k.m173496a(this.f106891h);
            }
        } else if (this.f106892i == null) {
            this.f106892i = C43769k.m173496a(this.f106891h);
        }
    }

    /* renamed from: D */
    private void m167585D() {
        if (this.f106892i == null) {
            if (UDUiModeUtils.m93319a(C41816b.m166115a().mo150132b())) {
                Pair<Integer, Integer> b = C43769k.m173500b(this.f106891h);
                this.f106892i = new Pair<>(Integer.valueOf(C43761d.m173473d(((Integer) b.first).intValue())), Integer.valueOf(C43761d.m173473d(((Integer) b.second).intValue())));
                return;
            }
            this.f106892i = C43769k.m173496a(this.f106891h);
        }
    }

    public int hashCode() {
        return Objects.hash(mo151527k(), Integer.valueOf(mo151494a()), Integer.valueOf(mo151500b()), mo151528l(), Boolean.valueOf(mo151529m()), Integer.valueOf(mo151515e()), Integer.valueOf(mo151523h()), mo151492A(), mo151493B(), mo151541x(), mo151542y(), Integer.valueOf(mo151543z()), Boolean.valueOf(this.f106899p), Long.valueOf(mo151530n()), Long.valueOf(mo151531o()), Boolean.valueOf(mo151532p()), Long.valueOf(mo151533q()), Integer.valueOf(mo151510d()), Integer.valueOf(mo151538v()), Boolean.valueOf(mo151534r()), Boolean.valueOf(this.f106907x), Boolean.valueOf(this.f106908y), Integer.valueOf(this.f106909z), Integer.valueOf(this.f106881A), Integer.valueOf(mo151537u()));
    }

    /* renamed from: c */
    public void mo151506c(int i) {
        this.f106904u = i;
    }

    /* renamed from: e */
    public void mo151516e(int i) {
        this.f106881A = i;
    }

    /* renamed from: g */
    public void mo151522g(int i) {
        this.f106905v = i;
    }

    /* renamed from: a */
    public void mo151495a(int i) {
        this.f106882B = i;
    }

    /* renamed from: b */
    public void mo151501b(int i) {
        this.f106885b = i;
    }

    /* renamed from: d */
    public void mo151511d(int i) {
        this.f106909z = i;
    }

    /* renamed from: f */
    public void mo151519f(int i) {
        this.f106883C = i;
    }

    /* renamed from: a */
    public void mo151496a(long j) {
        this.f106900q = j;
    }

    /* renamed from: b */
    public void mo151502b(long j) {
        this.f106901r = j;
    }

    /* renamed from: c */
    public void mo151507c(long j) {
        this.f106903t = j;
    }

    /* renamed from: d */
    public void mo151512d(String str) {
        this.f106886c = str;
    }

    /* renamed from: f */
    public void mo151520f(String str) {
        this.f106894k = str;
    }

    /* renamed from: e */
    public static boolean m167586e(String str) {
        if (TextUtils.equals(str, "OUTBOX") || TextUtils.equals(str, "SHARE")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo151497a(String str) {
        this.f106890g = str;
    }

    /* renamed from: b */
    public void mo151503b(String str) {
        this.f106891h = str;
    }

    /* renamed from: c */
    public void mo151508c(String str) {
        this.f106884a = str;
    }

    /* renamed from: d */
    public void mo151513d(boolean z) {
        this.f106908y = z;
    }

    /* renamed from: a */
    public void mo151498a(List<String> list) {
        this.f106895l = list;
    }

    /* renamed from: b */
    public void mo151504b(boolean z) {
        this.f106902s = z;
    }

    /* renamed from: c */
    public void mo151509c(boolean z) {
        this.f106906w = z;
    }

    /* renamed from: a */
    public void mo151499a(boolean z) {
        this.f106887d = z;
    }

    public MailLabelEntity(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = true;
        this.f106884a = parcel.readString();
        this.f106885b = parcel.readInt();
        this.f106886c = parcel.readString();
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f106887d = z;
        this.f106888e = parcel.readInt();
        this.f106889f = parcel.readInt();
        this.f106894k = parcel.readString();
        ArrayList arrayList = new ArrayList(parcel.readInt());
        this.f106895l = arrayList;
        parcel.readStringList(arrayList);
        this.f106896m = parcel.readString();
        this.f106897n = parcel.readString();
        this.f106898o = parcel.readInt();
        if (parcel.readInt() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f106899p = z2;
        this.f106900q = parcel.readLong();
        this.f106901r = parcel.readLong();
        if (parcel.readInt() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f106902s = z3;
        this.f106903t = parcel.readLong();
        this.f106904u = parcel.readInt();
        this.f106905v = parcel.readInt();
        if (parcel.readInt() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f106906w = z4;
        if (parcel.readInt() == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f106907x = z5;
        this.f106908y = parcel.readInt() != 1 ? false : z6;
        this.f106909z = parcel.readInt();
        this.f106881A = parcel.readInt();
        this.f106882B = parcel.readInt();
        this.f106883C = parcel.readInt();
        this.f106890g = parcel.readString();
        this.f106891h = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MailLabelEntity mailLabelEntity = (MailLabelEntity) obj;
        if (mo151500b() == mailLabelEntity.mo151500b() && mo151529m() == mailLabelEntity.mo151529m() && mo151515e() == mailLabelEntity.mo151515e() && mo151523h() == mailLabelEntity.mo151523h() && mo151543z() == mailLabelEntity.mo151543z() && this.f106899p == mailLabelEntity.f106899p && mo151530n() == mailLabelEntity.mo151530n() && mo151531o() == mailLabelEntity.mo151531o() && mo151532p() == mailLabelEntity.mo151532p() && mo151533q() == mailLabelEntity.mo151533q() && mo151510d() == mailLabelEntity.mo151510d() && mo151538v() == mailLabelEntity.mo151538v() && mo151534r() == mailLabelEntity.mo151534r() && this.f106907x == mailLabelEntity.f106907x && this.f106908y == mailLabelEntity.f106908y && this.f106909z == mailLabelEntity.f106909z && this.f106881A == mailLabelEntity.f106881A && Objects.equals(mo151527k(), mailLabelEntity.mo151527k()) && Objects.equals(mo151528l(), mailLabelEntity.mo151528l()) && Objects.equals(mo151492A(), mailLabelEntity.mo151492A()) && Objects.equals(mo151493B(), mailLabelEntity.mo151493B()) && Objects.equals(mo151541x(), mailLabelEntity.mo151541x()) && Objects.equals(mo151542y(), mailLabelEntity.mo151542y()) && mo151494a() == mailLabelEntity.mo151494a() && mo151537u() == mailLabelEntity.mo151537u()) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f106884a);
        parcel.writeInt(this.f106885b);
        parcel.writeString(this.f106886c);
        parcel.writeInt(this.f106887d ? 1 : 0);
        parcel.writeInt(this.f106888e);
        parcel.writeInt(this.f106889f);
        parcel.writeString(this.f106894k);
        parcel.writeInt(this.f106895l.size());
        parcel.writeStringList(this.f106895l);
        parcel.writeString(this.f106896m);
        parcel.writeString(this.f106897n);
        parcel.writeInt(this.f106898o);
        parcel.writeInt(this.f106899p ? 1 : 0);
        parcel.writeLong(this.f106900q);
        parcel.writeLong(this.f106901r);
        parcel.writeInt(this.f106902s ? 1 : 0);
        parcel.writeLong(this.f106903t);
        parcel.writeInt(this.f106904u);
        parcel.writeInt(this.f106905v);
        parcel.writeInt(this.f106906w ? 1 : 0);
        parcel.writeInt(this.f106907x ? 1 : 0);
        parcel.writeInt(this.f106908y ? 1 : 0);
        parcel.writeInt(this.f106909z);
        parcel.writeInt(this.f106881A);
        parcel.writeInt(this.f106882B);
        parcel.writeInt(this.f106883C);
        parcel.writeString(this.f106890g);
        parcel.writeString(this.f106891h);
    }
}
