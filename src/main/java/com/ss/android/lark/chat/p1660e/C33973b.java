package com.ss.android.lark.chat.p1660e;

import android.text.TextUtils;
import com.larksuite.framework.utils.C26325y;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.ss.android.lark.chat.entity.chatter.AvatarMedal;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterCustomStatus;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.entity.chatter.TagInfo;
import com.ss.android.lark.chat.entity.chatter.WorkStatus;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.e.b */
public class C33973b implements AbstractC26248b<C33973b> {

    /* renamed from: a */
    private final String f87615a;

    /* renamed from: b */
    private String f87616b;

    /* renamed from: c */
    private String f87617c;

    /* renamed from: d */
    private String f87618d;

    /* renamed from: e */
    private String f87619e;

    /* renamed from: f */
    private Chatter.ChatterType f87620f;

    /* renamed from: g */
    private String f87621g;

    /* renamed from: h */
    private WorkStatus f87622h;

    /* renamed from: i */
    private boolean f87623i;

    /* renamed from: j */
    private long f87624j;

    /* renamed from: k */
    private ChatterDescription f87625k;

    /* renamed from: l */
    private boolean f87626l;

    /* renamed from: m */
    private boolean f87627m;

    /* renamed from: n */
    private String f87628n;

    /* renamed from: o */
    private String f87629o;

    /* renamed from: p */
    private String f87630p;

    /* renamed from: q */
    private String f87631q;

    /* renamed from: r */
    private boolean f87632r;

    /* renamed from: s */
    private boolean f87633s;

    /* renamed from: t */
    private List<TagInfo> f87634t;

    /* renamed from: u */
    private AvatarMedal f87635u;

    /* renamed from: v */
    private ChatterCustomStatus f87636v;

    /* renamed from: w */
    private String f87637w;

    /* renamed from: a */
    public String mo124187a() {
        return this.f87631q;
    }

    /* renamed from: b */
    public String mo124198b() {
        return this.f87630p;
    }

    /* renamed from: c */
    public String mo124202c() {
        return this.f87615a;
    }

    /* renamed from: d */
    public String mo124205d() {
        return this.f87616b;
    }

    /* renamed from: e */
    public String mo124208e() {
        return this.f87617c;
    }

    /* renamed from: f */
    public String mo124212f() {
        return this.f87618d;
    }

    /* renamed from: g */
    public String mo124214g() {
        return this.f87619e;
    }

    /* renamed from: h */
    public String mo124216h() {
        return this.f87621g;
    }

    /* renamed from: i */
    public WorkStatus mo124219i() {
        return this.f87622h;
    }

    /* renamed from: k */
    public ChatterDescription mo124223k() {
        return this.f87625k;
    }

    /* renamed from: l */
    public boolean mo124224l() {
        return this.f87626l;
    }

    /* renamed from: n */
    public boolean mo124226n() {
        return this.f87627m;
    }

    /* renamed from: o */
    public String mo124227o() {
        return this.f87628n;
    }

    /* renamed from: q */
    public long mo124229q() {
        return this.f87624j;
    }

    /* renamed from: r */
    public boolean mo124230r() {
        return this.f87633s;
    }

    /* renamed from: s */
    public AvatarMedal mo124231s() {
        return this.f87635u;
    }

    /* renamed from: t */
    public List<TagInfo> mo124232t() {
        return this.f87634t;
    }

    /* renamed from: u */
    public ChatterCustomStatus mo124233u() {
        return this.f87636v;
    }

    /* renamed from: a */
    public boolean isItemSame(C33973b bVar) {
        return bVar != null && (this == bVar || TextUtils.equals(this.f87615a, bVar.f87615a));
    }

    /* renamed from: j */
    public boolean mo124222j() {
        return this.f87623i;
    }

    public int hashCode() {
        String str = this.f87615a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* renamed from: m */
    public boolean mo124225m() {
        if (this.f87620f == Chatter.ChatterType.BOT) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public boolean mo124228p() {
        if (this.f87620f != Chatter.ChatterType.BOT || !"bot".equals(mo124227o())) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public void mo124221j(String str) {
        this.f87628n = str;
    }

    public C33973b(String str) {
        this.f87615a = str;
    }

    /* renamed from: a */
    public void mo124188a(long j) {
        this.f87624j = j;
    }

    /* renamed from: b */
    public void mo124199b(String str) {
        this.f87631q = str;
    }

    /* renamed from: c */
    public void mo124203c(String str) {
        this.f87630p = str;
    }

    /* renamed from: d */
    public void mo124206d(String str) {
        this.f87629o = str;
    }

    /* renamed from: e */
    public void mo124209e(String str) {
        this.f87616b = str;
    }

    /* renamed from: f */
    public void mo124213f(String str) {
        this.f87617c = str;
    }

    /* renamed from: g */
    public void mo124215g(String str) {
        this.f87618d = str;
    }

    /* renamed from: h */
    public void mo124217h(String str) {
        this.f87619e = str;
    }

    /* renamed from: i */
    public void mo124220i(String str) {
        this.f87621g = str;
    }

    /* renamed from: a */
    public void mo124189a(AvatarMedal avatarMedal) {
        this.f87635u = avatarMedal;
    }

    /* renamed from: b */
    public void mo124200b(boolean z) {
        this.f87623i = z;
    }

    /* renamed from: c */
    public void mo124204c(boolean z) {
        this.f87626l = z;
    }

    /* renamed from: d */
    public void mo124207d(boolean z) {
        this.f87627m = z;
    }

    /* renamed from: e */
    public void mo124210e(boolean z) {
        this.f87633s = z;
    }

    /* renamed from: a */
    public void mo124190a(Chatter.ChatterType chatterType) {
        this.f87620f = chatterType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return isContentSame((C33973b) obj);
    }

    /* renamed from: b */
    private boolean m131525b(List<TagInfo> list) {
        List<TagInfo> list2 = this.f87634t;
        if (list2.size() != list.size()) {
            return false;
        }
        for (int i = 0; i < list2.size(); i++) {
            if (!list2.get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo124191a(ChatterCustomStatus chatterCustomStatus) {
        this.f87636v = chatterCustomStatus;
    }

    /* renamed from: a */
    public void mo124192a(ChatterDescription chatterDescription) {
        this.f87625k = chatterDescription;
    }

    /* renamed from: a */
    public void mo124193a(WorkStatus workStatus) {
        this.f87622h = workStatus;
    }

    /* renamed from: b */
    public boolean isContentSame(C33973b bVar) {
        if (!isItemSame(bVar) || !TextUtils.equals(this.f87616b, bVar.f87616b) || !TextUtils.equals(this.f87617c, bVar.f87617c) || !TextUtils.equals(this.f87618d, bVar.f87618d) || !TextUtils.equals(this.f87619e, bVar.f87619e) || !TextUtils.equals(this.f87628n, bVar.f87628n) || !TextUtils.equals(this.f87619e, bVar.f87619e) || !TextUtils.equals(this.f87621g, bVar.f87621g) || this.f87624j != bVar.f87624j || !C26325y.m95335a(Boolean.valueOf(this.f87626l), Boolean.valueOf(bVar.f87626l)) || !C26325y.m95335a(this.f87622h, bVar.f87622h) || !C26325y.m95335a(this.f87635u, bVar.f87635u) || !m131525b(bVar.f87634t) || !C26325y.m95335a(this.f87636v, bVar.f87636v)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo124194a(String str) {
        this.f87637w = str;
    }

    /* renamed from: a */
    public void mo124195a(List<TagInfo> list) {
        this.f87634t = list;
    }

    /* renamed from: a */
    public void mo124196a(boolean z) {
        this.f87632r = z;
    }
}
