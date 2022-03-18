package com.bytedance.ee.bear.wiki.wikitree.tree;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.wiki.wikitree.C12076c;
import com.bytedance.ee.bear.wiki.wikitree.C12127k;
import com.bytedance.ee.bear.wiki.wikitree.bean.C12075a;
import com.bytedance.ee.bear.wiki.wikitree.bean.HomePage;
import com.bytedance.ee.bear.wiki.wikitree.bean.TreeNode;
import com.bytedance.ee.bear.wiki.wikitree.tree.p586a.C12138g;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.b */
public final class C12140b extends C12151j implements AbstractC12143e {

    /* renamed from: c */
    private C12156l f32713c = new C12156l();

    /* renamed from: d */
    private C12157m f32714d;

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12143e
    /* renamed from: a */
    public void mo46444a(boolean z) {
        C13479a.m54764b(this.f32719a, "DragPanelTreeExtension.onPushCancelSingleTreeRootPerm. ");
        if (C13726a.m55676b(((C12164q) mo46473k()).mo46355k())) {
            mo46475m().mo46566b();
            $$Lambda$b$zUS0YtPYWsJTwwekuT5Provess r0 = new DialogInterface.OnDismissListener() {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.$$Lambda$b$zUS0YtPYWsJTwwekuT5Provess */

                public final void onDismiss(DialogInterface dialogInterface) {
                    C12140b.m270079lambda$zUS0YtPYWsJTwwekuT5Provess(C12140b.this, dialogInterface);
                }
            };
            if (z) {
                this.f32713c.mo46481a(((C12164q) mo46473k()).mo46355k(), r0);
            } else {
                this.f32713c.mo46488f(((C12164q) mo46473k()).mo46355k(), r0);
            }
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12143e
    /* renamed from: d */
    public void mo46451d() {
        C13479a.m54764b(this.f32719a, "DragPanelTreeExtension.onActiveDelSingleTreeRoot. ");
        m50358w();
    }

    /* renamed from: v */
    private void m50357v() {
        if (mo46474l().mo46371b() != null) {
            mo46474l().mo46369a(mo46474l().mo46371b().getWikiToken(), true);
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12150i, com.bytedance.ee.bear.wiki.wikitree.tree.C12151j
    /* renamed from: b */
    public void mo46445b() {
        super.mo46445b();
        mo46476f(((C12164q) mo46473k()).f32736b.getWikiToken());
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12150i, com.bytedance.ee.bear.wiki.wikitree.tree.C12151j
    /* renamed from: c */
    public void mo46448c() {
        mo46474l().mo46362a().mo5928b(this.f32714d);
        C12127k.m50124b().mo46307a();
        super.mo46448c();
    }

    /* renamed from: w */
    private void m50358w() {
        boolean z;
        if (!mo46474l().mo46378e() || mo46474l().mo46381f()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            ((C12164q) mo46473k()).mo46354j();
        } else {
            m50357v();
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
        this.f32714d = mVar;
        a.mo5923a(l, mVar);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12143e
    /* renamed from: e */
    public void mo46453e() {
        C13479a.m54764b(this.f32719a, "DragPanelTreeExtension.onPushCancelSpacePerm. ");
        if (C13726a.m55676b(((C12164q) mo46473k()).mo46355k())) {
            mo46475m().mo46566b();
            this.f32713c.mo46483b(((C12164q) mo46473k()).mo46355k(), new DialogInterface.OnDismissListener() {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.$$Lambda$b$cHTVMFvBFTPa0NIPHRwOb_ZLkk */

                public final void onDismiss(DialogInterface dialogInterface) {
                    C12140b.m270074lambda$cHTVMFvBFTPa0NIPHRwOb_ZLkk(C12140b.this, dialogInterface);
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12143e
    /* renamed from: f */
    public void mo46455f() {
        C13479a.m54764b(this.f32719a, "DragPanelTreeExtension.onPushDelSingleTreeRoot. ");
        if (C13726a.m55676b(((C12164q) mo46473k()).mo46355k())) {
            mo46475m().mo46566b();
            this.f32713c.mo46488f(((C12164q) mo46473k()).mo46355k(), new DialogInterface.OnDismissListener() {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.$$Lambda$b$kiPL993YuYEGHD78ylW26fXiSA */

                public final void onDismiss(DialogInterface dialogInterface) {
                    C12140b.m270076lambda$kiPL993YuYEGHD78ylW26fXiSA(C12140b.this, dialogInterface);
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12143e
    /* renamed from: g */
    public void mo46456g() {
        C13479a.m54764b(this.f32719a, "DragPanelTreeExtension.onPushMemberToAdmin. ");
        if (C13726a.m55676b(((C12164q) mo46473k()).mo46355k())) {
            mo46475m().mo46566b();
            this.f32713c.mo46485c(((C12164q) mo46473k()).mo46355k(), new DialogInterface.OnDismissListener() {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.$$Lambda$b$_MCf8LKzfAL85Kz5hFRVE_0IBdg */

                public final void onDismiss(DialogInterface dialogInterface) {
                    C12140b.lambda$_MCf8LKzfAL85Kz5hFRVE_0IBdg(C12140b.this, dialogInterface);
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12143e
    /* renamed from: h */
    public void mo46457h() {
        C13479a.m54764b(this.f32719a, "DragPanelTreeExtension.onPushAdminToMember. ");
        if (C13726a.m55676b(((C12164q) mo46473k()).mo46355k())) {
            mo46475m().mo46566b();
            this.f32713c.mo46486d(((C12164q) mo46473k()).mo46355k(), new DialogInterface.OnDismissListener() {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.$$Lambda$b$vfRhsHMlpvXI4oVWy695AdsB88 */

                public final void onDismiss(DialogInterface dialogInterface) {
                    C12140b.m270078lambda$vfRhsHMlpvXI4oVWy695AdsB88(C12140b.this, dialogInterface);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50346a(DialogInterface dialogInterface) {
        m50357v();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m50349b(DialogInterface dialogInterface) {
        m50357v();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m50352c(DialogInterface dialogInterface) {
        m50358w();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m50354d(DialogInterface dialogInterface) {
        m50358w();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a, com.bytedance.ee.bear.wiki.wikitree.tree.C12151j
    /* renamed from: b */
    public void mo46446b(TreeNode treeNode) {
        mo46474l().mo46375c(treeNode.wiki_token);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m50355e(DialogInterface dialogInterface) {
        ((C12164q) mo46473k()).mo46354j();
        C12076c.m50001b(((C12164q) mo46473k()).mo46355k().getApplicationContext());
    }

    /* renamed from: g */
    private void m50356g(String str) {
        if (mo46474l().mo46379e(str)) {
            mo46439a(mo46474l().mo46380f(str));
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12143e
    /* renamed from: d */
    public void mo46452d(String str) {
        C13479a.m54764b(this.f32719a, "DragPanelTreeExtension.onPushUde. ");
        mo46475m().mo46563a(str);
    }

    /* renamed from: b */
    private void m50350b(C12138g gVar) {
        TreeNode f;
        String str = (String) gVar.mo46434a("LOAD_TOKEN");
        if ((gVar.f32697b == 1002 || !TextUtils.equals(str, ((C12164q) mo46473k()).f32736b.getWikiToken())) && (f = mo46474l().mo46380f(str)) != null) {
            C13479a.m54764b(this.f32719a, "DragPanelTreeExtension.checkRedirect, redirect required. ");
            mo46439a(f);
        }
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
    /* renamed from: b */
    public void mo46447b(String str) {
        C13479a.m54764b(this.f32719a, "DragPanelTreeExtension.onActiveDelFocusItem. ");
        mo46439a(mo46474l().mo46380f(str));
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12143e
    /* renamed from: c */
    public void mo46450c(String str) {
        C13479a.m54764b(this.f32719a, "DragPanelTreeExtension.onPushDelFocusItem. ");
        if (C13726a.m55676b(((C12164q) mo46473k()).mo46355k())) {
            mo46475m().mo46566b();
            this.f32713c.mo46487e(((C12164q) mo46473k()).mo46355k(), new DialogInterface.OnDismissListener(str) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.$$Lambda$b$aGshcw0o83XqEI53v5c0U0Ov9E */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void onDismiss(DialogInterface dialogInterface) {
                    C12140b.m270075lambda$aGshcw0o83XqEI53v5c0U0Ov9E(C12140b.this, this.f$1, dialogInterface);
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12143e
    /* renamed from: e */
    public void mo46454e(String str) {
        C13479a.m54764b(this.f32719a, "DragPanelTreeExtension.onPushMovFocusOutOfSingleTree. ");
        if (C13726a.m55676b(((C12164q) mo46473k()).mo46355k())) {
            mo46475m().mo46566b();
            this.f32713c.mo46488f(((C12164q) mo46473k()).mo46355k(), new DialogInterface.OnDismissListener(str) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.$$Lambda$b$v_fuBaHbnSgzq5WRniiPfh5rL4 */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void onDismiss(DialogInterface dialogInterface) {
                    C12140b.m270077lambda$v_fuBaHbnSgzq5WRniiPfh5rL4(C12140b.this, this.f$1, dialogInterface);
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a, com.bytedance.ee.bear.wiki.wikitree.tree.C12151j
    /* renamed from: a */
    public void mo46439a(TreeNode treeNode) {
        super.mo46439a(treeNode);
        Bundle bundle = new Bundle();
        bundle.putBoolean("popLastDocument", true);
        C12158n.m50511a(((C12164q) mo46473k()).mo46357m(), mo46474l().mo46374c(), treeNode.wiki_token, mo46474l().mo46371b(), false, bundle);
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
        m50350b(gVar);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12143e
    /* renamed from: a */
    public void mo46442a(String str) {
        C13479a.m54764b(this.f32719a, "DragPanelTreeExtension.onActiveAdd. ");
        mo46476f(str);
        mo46439a(mo46474l().mo46380f(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50347a(String str, DialogInterface dialogInterface) {
        m50356g(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m50351b(String str, DialogInterface dialogInterface) {
        m50356g(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m50353c(String str, DialogInterface dialogInterface) {
        m50356g(str);
    }

    public C12140b(C12164q qVar, String str) {
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
        C13479a.m54764b(this.f32719a, "DragPanelTreeExtension.onPushCancelFocusAreaPerm. ");
        if (C13726a.m55676b(((C12164q) mo46473k()).mo46355k())) {
            mo46475m().mo46566b();
            $$Lambda$b$M6kMBmkVIquJZ7Ws0cmtS2Mgbmw r0 = new DialogInterface.OnDismissListener(str) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.$$Lambda$b$M6kMBmkVIquJZ7Ws0cmtS2Mgbmw */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void onDismiss(DialogInterface dialogInterface) {
                    C12140b.lambda$M6kMBmkVIquJZ7Ws0cmtS2Mgbmw(C12140b.this, this.f$1, dialogInterface);
                }
            };
            if (z) {
                this.f32713c.mo46488f(((C12164q) mo46473k()).mo46355k(), r0);
            } else {
                this.f32713c.mo46481a(((C12164q) mo46473k()).mo46355k(), r0);
            }
        }
    }

    /* renamed from: a */
    private void m50348a(String str, String str2, boolean z) {
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
            C13479a.m54758a(this.f32719a, "DragPanelTreeExtension.onResult, extractMovToResult return null. ");
        } else {
            m50348a(a[0], a[1], Boolean.valueOf(a[2]).booleanValue());
        }
    }
}
