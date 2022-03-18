package com.bytedance.ee.bear.wiki.wikitree.tree;

import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.wiki.wikitree.bean.TreeNode;
import com.bytedance.ee.bear.wiki.wikitree.tree.p586a.C12138g;
import com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b;
import com.huawei.hms.support.api.entity.core.CommonCode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.j */
public class C12151j extends C12150i<C12164q> implements AbstractC12177b.AbstractC12178a {

    /* renamed from: c */
    private AbstractC1178x<C12138g> f32722c = new C12153a();

    /* renamed from: d */
    private String f32723d;

    /* renamed from: e */
    private C12161p f32724e = C12161p.m50531a();

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: a */
    public void mo46440a(TreeNode treeNode, int i) {
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: a */
    public void mo46460a(String str, String str2) {
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    public void a_(String str) {
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: b */
    public void mo46446b(TreeNode treeNode) {
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: c */
    public void mo46449c(TreeNode treeNode) {
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: q */
    public void mo46467q() {
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: r */
    public void mo46468r() {
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: s */
    public void mo46469s() {
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: t */
    public void mo46470t() {
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12150i
    /* renamed from: i */
    public void mo46471i() {
        super.mo46471i();
    }

    /* renamed from: n */
    public C12161p mo46477n() {
        return this.f32724e;
    }

    /* renamed from: u */
    public String mo46478u() {
        return this.f32723d;
    }

    /* renamed from: d */
    private void mo46451d() {
        if (((C12164q) mo46473k()).f32740f != null) {
            ((C12164q) mo46473k()).f32740f.onFocusChange(this.f32723d);
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12150i
    /* renamed from: c */
    public void mo46448c() {
        mo46474l().mo46362a().mo5928b(this.f32722c);
        super.mo46448c();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: p */
    public void mo46466p() {
        mo46474l().mo46367a(((C12164q) mo46473k()).f32736b.getSpaceId(), "", true);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12150i
    /* renamed from: a */
    public void mo46437a() {
        super.mo46437a();
        ((C12164q) mo46473k()).mo46351g().mo46370a(false);
        mo46474l().mo46362a().mo5923a(((C12164q) mo46473k()).mo46356l(), this.f32722c);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12150i
    /* renamed from: b */
    public void mo46445b() {
        super.mo46445b();
        mo46474l().mo46367a(((C12164q) mo46473k()).f32736b.getSpaceId(), ((C12164q) mo46473k()).f32736b.getWikiToken(), true);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: o */
    public void mo46465o() {
        mo46474l().mo46367a(((C12164q) mo46473k()).f32736b.getSpaceId(), ((C12164q) mo46473k()).f32736b.getWikiToken(), true);
    }

    /* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.j$a */
    private class C12153a implements AbstractC1178x<C12138g> {
        private C12153a() {
        }

        /* renamed from: a */
        private void m50481a(boolean z) {
            if (((C12164q) C12151j.this.mo46473k()).f32738d != null) {
                ((C12164q) C12151j.this.mo46473k()).f32738d.onSpaceInit(z);
            }
        }

        /* renamed from: a */
        public void onChanged(C12138g gVar) {
            if (gVar != null) {
                switch (gVar.f32697b) {
                    case CommonCode.StatusCode.API_CLIENT_EXPIRED /*{ENCODED_INT: 1001}*/:
                    case 1002:
                        m50482b(gVar);
                        return;
                    case 1003:
                    case 1004:
                        m50483c(gVar);
                        return;
                    default:
                        return;
                }
            }
        }

        /* renamed from: b */
        private void m50482b(C12138g gVar) {
            C12151j.this.mo46475m().mo46567b(C12151j.this.mo46477n().mo46493b(gVar.f32696a, gVar.f32698c));
            int i = gVar.f32696a;
            if (i == 1002) {
                C12151j.this.mo46441a(gVar);
                String str = (String) gVar.mo46434a("LOAD_TOKEN");
                ((C12164q) C12151j.this.mo46473k()).f32736b.setWikiToken(str);
                C12151j.this.mo46475m().mo46565a(gVar.f32700e);
                C12151j.this.mo46475m().setSearchVisible(true);
                C12151j.this.mo46475m().setSearchEnabled(true);
                C12151j.this.mo46475m().mo46574d(str);
                m50481a(true);
            } else if (i == 1003) {
                m50481a(false);
            }
        }

        /* renamed from: c */
        private void m50483c(C12138g gVar) {
            C12151j.this.mo46475m().mo46564a((String) gVar.mo46434a("EXPAND_TOKEN"), false);
            switch (gVar.f32696a) {
                case CommonCode.StatusCode.API_CLIENT_EXPIRED /*{ENCODED_INT: 1001}*/:
                    C12151j.this.mo46475m().mo46564a((String) gVar.mo46434a("EXPAND_TOKEN"), true);
                    return;
                case 1002:
                    C12151j.this.mo46475m().mo46565a(gVar.f32700e);
                    return;
                case 1003:
                    C12151j.this.mo46475m().mo46568b(C12151j.this.mo46477n().mo46491a(gVar.f32697b, gVar.f32698c), 0);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: a */
    public void mo46439a(TreeNode treeNode) {
        if (treeNode != null) {
            mo46476f(treeNode.wiki_token);
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: d */
    public void mo46462d(TreeNode treeNode) {
        mo46474l().mo46364a(treeNode.wiki_token);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: e */
    public void mo46463e(TreeNode treeNode) {
        mo46474l().mo46372b(treeNode.wiki_token);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo46441a(C12138g gVar) {
        mo46475m().setEnableSwipeMenu(false);
        mo46475m().setFocusItem(mo46478u());
    }

    /* renamed from: f */
    public void mo46476f(String str) {
        this.f32723d = str;
        mo46475m().setFocusItem(str);
        mo46474l().mo46377d(str);
        ((C12164q) mo46473k()).f32736b.setWikiToken(str);
        mo46451d();
    }

    public C12151j(C12164q qVar, String str) {
        super(qVar, str);
    }
}
