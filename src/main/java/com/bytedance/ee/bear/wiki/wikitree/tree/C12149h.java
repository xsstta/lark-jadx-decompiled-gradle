package com.bytedance.ee.bear.wiki.wikitree.tree;

import android.text.TextUtils;
import com.bytedance.ee.bear.wiki.wikitree.C12127k;
import com.bytedance.ee.bear.wiki.wikitree.bean.TreeNode;
import com.bytedance.ee.bear.wiki.wikitree.tree.p586a.C12136e;
import com.bytedance.ee.bear.wiki.wikitree.tree.p586a.C12138g;
import com.bytedance.ee.log.C13479a;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.h */
public final class C12149h extends C12151j {

    /* renamed from: c */
    private String f32718c = "";

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12150i, com.bytedance.ee.bear.wiki.wikitree.tree.C12151j
    /* renamed from: c */
    public void mo46448c() {
        super.mo46448c();
        C12127k.m50124b().mo46307a();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12150i, com.bytedance.ee.bear.wiki.wikitree.tree.C12151j
    /* renamed from: a */
    public void mo46437a() {
        super.mo46437a();
        this.f32718c = ((C12164q) mo46473k()).f32736b.getWikiToken();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12150i, com.bytedance.ee.bear.wiki.wikitree.tree.C12151j
    /* renamed from: b */
    public void mo46445b() {
        boolean z;
        String wikiToken = ((C12164q) mo46473k()).f32736b.getWikiToken();
        String spaceId = ((C12164q) mo46473k()).f32736b.getSpaceId();
        C12136e a = C12127k.m50124b().mo46306a(((C12164q) mo46473k()).f32736b.getSpaceId());
        String str = this.f32719a;
        StringBuilder sb = new StringBuilder();
        sb.append("spaceCore is null: ");
        if (a == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C13479a.m54764b(str, sb.toString());
        if (a != null) {
            mo46474l().mo46363a(a, wikiToken, false);
        } else {
            mo46474l().mo46367a(spaceId, wikiToken, false);
        }
    }

    /* renamed from: f */
    private boolean m50444f(TreeNode treeNode) {
        if (treeNode == null || !TextUtils.equals(treeNode.wiki_token, this.f32718c)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a, com.bytedance.ee.bear.wiki.wikitree.tree.C12151j
    /* renamed from: a */
    public void mo46439a(TreeNode treeNode) {
        if (!m50444f(treeNode)) {
            super.mo46439a(treeNode);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12151j
    /* renamed from: a */
    public void mo46441a(C12138g gVar) {
        super.mo46441a(gVar);
        mo46475m().setDisableItem(this.f32718c);
    }

    public C12149h(C12164q qVar, String str) {
        super(qVar, str);
    }
}
