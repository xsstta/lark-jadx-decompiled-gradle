package com.bytedance.ee.bear.wiki.wikitree.tree;

import android.content.DialogInterface;
import android.content.Intent;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.wiki.wikitree.C12127k;
import com.bytedance.ee.bear.wiki.wikitree.bean.C12075a;
import com.bytedance.ee.bear.wiki.wikitree.bean.HomePage;
import com.bytedance.ee.bear.wiki.wikitree.bean.TreeNode;
import com.bytedance.ee.bear.wiki.wikitree.tree.p586a.C12138g;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.d */
public final class C12142d extends C12151j implements AbstractC12143e {

    /* renamed from: c */
    private C12156l f32716c = new C12156l();

    /* renamed from: d */
    private C12157m f32717d;

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12143e
    /* renamed from: b */
    public void mo46447b(String str) {
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12143e
    /* renamed from: a */
    public void mo46444a(boolean z) {
        C13479a.m54764b(this.f32719a, "FullScreenTreeExtension.onPushCancelSingleTreeRootPerm. ");
        if (((C12164q) mo46473k()).mo46353i()) {
            mo46475m().mo46566b();
            $$Lambda$d$4Z36n1NWNUjWJeF7ug0VOUmAUU r0 = new DialogInterface.OnDismissListener() {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.$$Lambda$d$4Z36n1NWNUjWJeF7ug0VOUmAUU */

                public final void onDismiss(DialogInterface dialogInterface) {
                    C12142d.m270080lambda$4Z36n1NWNUjWJeF7ug0VOUmAUU(C12142d.this, dialogInterface);
                }
            };
            if (z) {
                this.f32716c.mo46481a(((C12164q) mo46473k()).mo46355k(), r0);
            } else {
                this.f32716c.mo46488f(((C12164q) mo46473k()).mo46355k(), r0);
            }
        } else {
            m50409w();
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12143e
    /* renamed from: d */
    public void mo46451d() {
        C13479a.m54764b(this.f32719a, "FullScreenTreeExtension.onActiveDelSingleTreeRoot. ");
        m50409w();
    }

    /* renamed from: v */
    private void m50408v() {
        if (mo46474l().mo46371b() != null) {
            mo46474l().mo46369a(mo46474l().mo46371b().getWikiToken(), true);
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12150i, com.bytedance.ee.bear.wiki.wikitree.tree.C12151j
    /* renamed from: c */
    public void mo46448c() {
        mo46474l().mo46362a().mo5928b(this.f32717d);
        C12127k.m50124b().mo46307a();
        super.mo46448c();
    }

    /* renamed from: w */
    private void m50409w() {
        boolean z;
        if (!mo46474l().mo46378e() || mo46474l().mo46381f()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            ((C12164q) mo46473k()).mo46354j();
        } else {
            m50408v();
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12150i, com.bytedance.ee.bear.wiki.wikitree.tree.C12151j
    /* renamed from: a */
    public void mo46437a() {
        super.mo46437a();
        mo46474l().mo46370a(true);
        LiveData<C12138g> a = mo46474l().mo46362a();
        LifecycleOwner l = ((C12164q) mo46473k()).mo46356l();
        C12157m mVar = new C12157m(this, this, this.f32720b);
        this.f32717d = mVar;
        a.mo5923a(l, mVar);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12143e
    /* renamed from: e */
    public void mo46453e() {
        C13479a.m54764b(this.f32719a, "FullScreenTreeExtension.onPushCancelSpacePerm. ");
        if (((C12164q) mo46473k()).mo46353i()) {
            mo46475m().mo46566b();
            this.f32716c.mo46483b(((C12164q) mo46473k()).mo46355k(), new DialogInterface.OnDismissListener() {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.$$Lambda$d$HDGTce45FtSsjYFE0jWMTElRTE */

                public final void onDismiss(DialogInterface dialogInterface) {
                    C12142d.m270081lambda$HDGTce45FtSsjYFE0jWMTElRTE(C12142d.this, dialogInterface);
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12143e
    /* renamed from: f */
    public void mo46455f() {
        C13479a.m54764b(this.f32719a, "FullScreenTreeExtension.onPushDelSingleTreeRoot. ");
        if (((C12164q) mo46473k()).mo46353i()) {
            mo46475m().mo46566b();
            this.f32716c.mo46488f(((C12164q) mo46473k()).mo46355k(), new DialogInterface.OnDismissListener() {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.$$Lambda$d$dhoLrfoIJSmD8wLDw4zGO3tiU */

                public final void onDismiss(DialogInterface dialogInterface) {
                    C12142d.m270084lambda$dhoLrfoIJSmD8wLDw4zGO3tiU(C12142d.this, dialogInterface);
                }
            });
            return;
        }
        m50409w();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12143e
    /* renamed from: g */
    public void mo46456g() {
        C13479a.m54764b(this.f32719a, "FullScreenTreeExtension.onPushMemberToAdmin. ");
        if (((C12164q) mo46473k()).mo46353i()) {
            mo46475m().mo46566b();
            this.f32716c.mo46485c(((C12164q) mo46473k()).mo46355k(), new DialogInterface.OnDismissListener() {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.$$Lambda$d$QLFRN1PLFM44FXhUp7YknvM1zo */

                public final void onDismiss(DialogInterface dialogInterface) {
                    C12142d.m270083lambda$QLFRN1PLFM44FXhUp7YknvM1zo(C12142d.this, dialogInterface);
                }
            });
            return;
        }
        m50408v();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12143e
    /* renamed from: h */
    public void mo46457h() {
        C13479a.m54764b(this.f32719a, "FullScreenTreeExtension.onPushAdminToMember. ");
        if (((C12164q) mo46473k()).mo46353i()) {
            mo46475m().mo46566b();
            this.f32716c.mo46486d(((C12164q) mo46473k()).mo46355k(), new DialogInterface.OnDismissListener() {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.$$Lambda$d$HY5q0TXHsGP4Y8N5Ogq_aLRJvQ */

                public final void onDismiss(DialogInterface dialogInterface) {
                    C12142d.m270082lambda$HY5q0TXHsGP4Y8N5Ogq_aLRJvQ(C12142d.this, dialogInterface);
                }
            });
            return;
        }
        m50408v();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50402a(DialogInterface dialogInterface) {
        m50408v();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m50404b(DialogInterface dialogInterface) {
        m50408v();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m50405c(DialogInterface dialogInterface) {
        m50409w();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m50406d(DialogInterface dialogInterface) {
        m50409w();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m50407e(DialogInterface dialogInterface) {
        ((C12164q) mo46473k()).mo46354j();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a, com.bytedance.ee.bear.wiki.wikitree.tree.C12151j
    /* renamed from: b */
    public void mo46446b(TreeNode treeNode) {
        mo46474l().mo46375c(treeNode.wiki_token);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12143e
    /* renamed from: d */
    public void mo46452d(String str) {
        C13479a.m54764b(this.f32719a, "FullScreenTreeExtension.onPushUde. ");
        mo46475m().mo46563a(str);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a, com.bytedance.ee.bear.wiki.wikitree.tree.C12151j
    /* renamed from: c */
    public void mo46449c(TreeNode treeNode) {
        HomePage b = mo46474l().mo46371b();
        C12127k.m50124b().mo46307a();
        C12127k.m50124b().mo46308a(b.getSpaceId(), mo46474l().mo46382g());
        C12158n.m50509a(((C12164q) mo46473k()).mo46357m(), b, treeNode.wiki_token, treeNode.area_id, mo46474l().mo46383g(treeNode.wiki_token));
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12143e
    /* renamed from: c */
    public void mo46450c(String str) {
        C13479a.m54764b(this.f32719a, "FullScreenTreeExtension.onPushDelFocusItem. ");
        if (((C12164q) mo46473k()).mo46353i()) {
            mo46475m().mo46566b();
            this.f32716c.mo46482a(((C12164q) mo46473k()).mo46355k(), null, R.string.Doc_Wiki_Known);
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12143e
    /* renamed from: e */
    public void mo46454e(String str) {
        C13479a.m54764b(this.f32719a, "FullScreenTreeExtension.onPushMovFocusOutOfSingleTree. ");
        if (((C12164q) mo46473k()).mo46353i()) {
            mo46475m().mo46566b();
            this.f32716c.mo46488f(((C12164q) mo46473k()).mo46355k(), (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a, com.bytedance.ee.bear.wiki.wikitree.tree.C12151j
    /* renamed from: a */
    public void mo46439a(TreeNode treeNode) {
        super.mo46439a(treeNode);
        C12158n.m50510a(((C12164q) mo46473k()).mo46357m(), mo46474l().mo46374c(), treeNode.wiki_token, mo46474l().mo46371b(), false);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12151j
    /* renamed from: a */
    public void mo46441a(C12138g gVar) {
        boolean z;
        C12075a d = mo46474l().mo46376d();
        boolean z2 = false;
        if (!mo46474l().mo46381f() || d == null) {
            mo46475m().setEnableSwipeMenu(false);
        } else {
            boolean d2 = d.mo46251d();
            boolean e = d.mo46252e();
            boolean f = d.mo46254f();
            if (e || f) {
                z = true;
            } else {
                z = false;
            }
            if (d2 || z) {
                z2 = true;
            }
            mo46475m().setEnableActionRemove(e);
            mo46475m().setEnableActionMove(f);
            mo46475m().setEnableMenuItemAdd(d2);
            mo46475m().setEnableMenuItemMore(z);
            mo46475m().setEnableSwipeMenu(z2);
        }
        mo46475m().setEnableHomeSwipe(!mo46474l().mo46378e());
        mo46475m().setFocusItem(mo46478u());
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12143e
    /* renamed from: a */
    public void mo46442a(String str) {
        mo46476f(str);
        C12158n.m50510a(((C12164q) mo46473k()).mo46357m(), mo46474l().mo46374c(), str, (HomePage) null, false);
    }

    public C12142d(C12164q qVar, String str) {
        super(qVar, str);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a, com.bytedance.ee.bear.wiki.wikitree.tree.C12151j
    /* renamed from: a */
    public void mo46440a(TreeNode treeNode, int i) {
        mo46474l().mo46365a(treeNode.wiki_token, i, true);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12143e
    /* renamed from: a */
    public void mo46443a(String str, boolean z) {
        C13479a.m54764b(this.f32719a, "FullScreenTreeExtension.onPushCancelFocusAreaPerm. ");
        if (((C12164q) mo46473k()).mo46353i()) {
            mo46475m().mo46566b();
            if (z) {
                this.f32716c.mo46484b(((C12164q) mo46473k()).mo46355k(), null, R.string.Doc_Wiki_Known);
            } else {
                this.f32716c.mo46481a(((C12164q) mo46473k()).mo46355k(), (DialogInterface.OnDismissListener) null);
            }
        }
    }

    /* renamed from: a */
    private void m50403a(String str, String str2, boolean z) {
        boolean z2;
        if (mo46478u() == null || !mo46474l().mo46373b(str, mo46478u())) {
            z2 = false;
        } else {
            z2 = true;
        }
        mo46474l().mo46368a(str, str2, z, z2);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12150i
    /* renamed from: a */
    public void mo46438a(int i, int i2, Intent intent) {
        super.mo46438a(i, i2, intent);
        String[] a = C12158n.m50512a(i, i2, intent);
        if (a == null || a.length < 3) {
            C13479a.m54758a(this.f32719a, "FullScreenTreeExtension.onResult, extractMovToResult return null. ");
        } else {
            m50403a(a[0], a[1], Boolean.valueOf(a[2]).booleanValue());
        }
    }
}
