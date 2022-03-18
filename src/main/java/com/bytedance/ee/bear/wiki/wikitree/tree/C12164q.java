package com.bytedance.ee.bear.wiki.wikitree.tree;

import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.wiki.common.widget.InterceptableRecyclerView;
import com.bytedance.ee.bear.wiki.wikitree.bean.HomePage;
import com.bytedance.ee.bear.wiki.wikitree.bean.TreeNode;
import com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12144f;
import com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a;
import com.bytedance.ee.bear.wiki.wikitree.tree.p586a.C12136e;
import com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13721c;
import com.bytedance.ee.util.p718t.C13748k;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.q */
public final class C12164q extends C12141c implements AbstractC12144f {

    /* renamed from: b */
    AbstractC12148g f32736b;

    /* renamed from: c */
    WikiTreeType f32737c;

    /* renamed from: d */
    AbstractC12144f.AbstractC12147c f32738d;

    /* renamed from: e */
    AbstractC12144f.AbstractC12146b f32739e;

    /* renamed from: f */
    AbstractC12144f.AbstractC12145a f32740f;

    /* renamed from: g */
    private C12166a f32741g;

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12141c, com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12131a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo46344a() {
        super.mo46344a();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12141c, com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12131a
    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo46348d() {
        super.mo46348d();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12141c, com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: o */
    public /* bridge */ /* synthetic */ void mo46465o() {
        super.mo46465o();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12141c, com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: p */
    public /* bridge */ /* synthetic */ void mo46466p() {
        super.mo46466p();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12141c, com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: q */
    public /* bridge */ /* synthetic */ void mo46467q() {
        super.mo46467q();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12141c, com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: r */
    public /* bridge */ /* synthetic */ void mo46468r() {
        super.mo46468r();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12141c, com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: s */
    public /* bridge */ /* synthetic */ void mo46469s() {
        super.mo46469s();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12141c, com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: t */
    public /* bridge */ /* synthetic */ void mo46470t() {
        super.mo46470t();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12141c, com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo46460a(String str, String str2) {
        super.mo46460a(str, str2);
    }

    /* renamed from: a */
    public void mo46503a(boolean z) {
        mo46350f().setSearchVisible(z);
    }

    /* renamed from: A */
    public void mo46494A() {
        mo46350f().mo46573d();
    }

    /* renamed from: B */
    public void mo46495B() {
        mo46350f().mo46576e();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12131a
    /* renamed from: f */
    public /* bridge */ /* synthetic */ AbstractC12177b mo46350f() {
        return super.getView();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12131a
    /* renamed from: g */
    public /* bridge */ /* synthetic */ AbstractC12132a mo46351g() {
        return super.getModel();
    }

    /* renamed from: y */
    public void mo46517y() {
        mo46350f().mo46577f();
    }

    /* renamed from: z */
    public void mo46518z() {
        mo46350f().mo46578g();
    }

    /* renamed from: C */
    public C12136e mo46496C() {
        return mo46351g().mo46382g();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12141c, com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12131a
    /* renamed from: b */
    public void mo46346b() {
        super.mo46346b();
        C13748k.m55732a(new Runnable() {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.$$Lambda$q$YhAxgfjou9t6WKjb5cwdmxWtm4M */

            public final void run() {
                C12164q.this.m50540D();
            }
        });
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12141c, com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12131a
    /* renamed from: e */
    public /* bridge */ /* synthetic */ boolean mo46349e() {
        return super.mo46349e();
    }

    /* renamed from: u */
    public boolean mo46513u() {
        return !TextUtils.isEmpty(mo46514v());
    }

    /* renamed from: v */
    public String mo46514v() {
        return ((C12151j) mo46458a(0)).mo46478u();
    }

    /* renamed from: w */
    public HomePage mo46515w() {
        return mo46351g().mo46371b();
    }

    /* renamed from: x */
    public String mo46516x() {
        return mo46351g().mo46374c();
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m50540D() {
        LiveData<ConnectionService.NetworkState> a = C5084ad.m20847d().mo20037a();
        LifecycleOwner l = mo46356l();
        C12166a aVar = new C12166a();
        this.f32741g = aVar;
        a.mo5923a(l, aVar);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12141c, com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12131a
    /* renamed from: c */
    public void mo46347c() {
        super.mo46347c();
        if (this.f32741g != null) {
            C5084ad.m20847d().mo20037a().mo5928b(this.f32741g);
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12141c, com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    public /* bridge */ /* synthetic */ void a_(String str) {
        super.a_(str);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12141c, com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo46446b(TreeNode treeNode) {
        super.mo46446b(treeNode);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12141c, com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo46449c(TreeNode treeNode) {
        super.mo46449c(treeNode);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12141c, com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: e */
    public /* bridge */ /* synthetic */ void mo46463e(TreeNode treeNode) {
        super.mo46463e(treeNode);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.q$a */
    public class C12166a implements AbstractC1178x<ConnectionService.NetworkState> {
        private C12166a() {
        }

        /* renamed from: a */
        public void onChanged(ConnectionService.NetworkState networkState) {
            String str = C12164q.this.f32679a;
            C13479a.m54764b(str, "WikiTreePresenter.networkChanged, networkState: " + networkState);
            if (networkState != null && C12164q.this.mo46352h() && C12164q.this.mo46350f() != null) {
                C12164q.this.mo46350f().setEnableMenuItemClick(networkState.mo20041b());
            }
        }
    }

    /* renamed from: b */
    public void mo46504b(int i) {
        mo46350f().setSearchNoResultViewPosition(i);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12141c, com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo46462d(TreeNode treeNode) {
        super.mo46462d(treeNode);
    }

    /* renamed from: e */
    public void mo46510e(String str) {
        mo46350f().mo46569b(str);
    }

    /* renamed from: a */
    public void mo46497a(RecyclerView.AbstractC1337f fVar) {
        mo46350f().setWikiTreeFlingListener(fVar);
    }

    /* renamed from: c */
    public String mo46508c(String str) {
        TreeNode f = mo46351g().mo46380f(str);
        if (f != null) {
            return f.area_id;
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo46509d(String str) {
        return mo46351g().mo46379e(str);
    }

    /* renamed from: f */
    public void mo46511f(String str) {
        mo46350f().mo46572c(str);
    }

    /* renamed from: g */
    public List<Integer> mo46512g(String str) {
        return mo46350f().mo46575e(str);
    }

    /* renamed from: a */
    public void mo46498a(InterceptableRecyclerView.AbstractC11939a aVar) {
        mo46350f().setTouchInterceptor(aVar);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12141c, com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo46439a(TreeNode treeNode) {
        super.mo46439a(treeNode);
    }

    /* renamed from: b */
    public void mo46505b(String str) {
        C13479a.m54764b(this.f32679a, String.format("WikiTreePresenter.focusTo, wikiToken: %s", C13721c.m55650d(str)));
        if (mo46351g().mo46385h()) {
            mo46351g().mo46367a(mo46351g().mo46374c(), str, true);
            ((C12151j) mo46458a(0)).mo46476f(str);
        }
    }

    /* renamed from: b */
    public void mo46507b(boolean z) {
        mo46350f().setWikiTreeVisible(z);
    }

    /* renamed from: a */
    public void mo46500a(AbstractC12144f.AbstractC12145a aVar) {
        this.f32740f = aVar;
    }

    /* renamed from: a */
    public void mo46501a(AbstractC12144f.AbstractC12146b bVar) {
        this.f32739e = bVar;
    }

    /* renamed from: a */
    public void mo46502a(AbstractC12144f.AbstractC12147c cVar) {
        this.f32738d = cVar;
    }

    /* renamed from: b */
    public void mo46506b(String str, String str2) {
        mo46351g().mo46366a(str, str2);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12141c, com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo46440a(TreeNode treeNode, int i) {
        super.mo46440a(treeNode, i);
    }

    /* renamed from: a */
    public void mo46499a(C12136e eVar, String str) {
        boolean z;
        String str2 = this.f32679a;
        Object[] objArr = new Object[2];
        if (eVar != null) {
            z = true;
        } else {
            z = false;
        }
        objArr[0] = String.valueOf(z);
        objArr[1] = C13721c.m55650d(str);
        C13479a.m54764b(str2, String.format("WikiTreePresenter.restoreThenFocusTo, spaceCore: %s, wikiToken: %s", objArr));
        if (mo46351g().mo46385h()) {
            mo46351g().mo46363a(eVar, str, true);
            ((C12151j) mo46458a(0)).mo46476f(str);
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12141c, com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12131a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo46345a(int i, int i2, Intent intent) {
        super.mo46345a(i, i2, intent);
    }

    public C12164q(FragmentActivity fragmentActivity, C10917c cVar, LifecycleOwner lifecycleOwner, AbstractC12177b bVar, AbstractC12132a aVar, AbstractC12148g gVar, WikiTreeType wikiTreeType) {
        super(fragmentActivity, cVar, lifecycleOwner, bVar, aVar);
        this.f32736b = gVar;
        this.f32737c = wikiTreeType;
        this.f32679a = String.format("%s_%s_%s", this.f32679a, getClass().getSimpleName(), this.f32737c.name());
        mo46350f().mo46561a(mo46355k(), mo46357m(), this.f32737c);
        mo46350f().setTagSuffix(this.f32737c.name());
        mo46351g().mo46384h(this.f32737c.name());
        WikiTreeType wikiTreeType2 = this.f32737c;
        mo46459a(C12154k.m50485a(wikiTreeType2, this, wikiTreeType2.name()));
        mo46459a(new C12159o(this, this.f32737c.name()));
    }
}
