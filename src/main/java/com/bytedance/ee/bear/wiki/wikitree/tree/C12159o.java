package com.bytedance.ee.bear.wiki.wikitree.tree;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.wiki.search.C12033c;
import com.bytedance.ee.bear.wiki.search.C12040e;
import com.bytedance.ee.bear.wiki.search.C12041f;
import com.bytedance.ee.bear.wiki.wikitree.bean.HomePage;
import com.bytedance.ee.bear.wiki.wikitree.bean.TreeNode;
import com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.utils.CollectionUtils;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.o */
public final class C12159o extends C12150i<C12164q> implements AbstractC12177b.AbstractC12178a {

    /* renamed from: c */
    private C12040e f32731c;

    /* renamed from: d */
    private boolean f32732d;

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: a */
    public void mo46439a(TreeNode treeNode) {
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: a */
    public void mo46440a(TreeNode treeNode, int i) {
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
    /* renamed from: d */
    public void mo46462d(TreeNode treeNode) {
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: e */
    public void mo46463e(TreeNode treeNode) {
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: o */
    public void mo46465o() {
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: p */
    public void mo46466p() {
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12150i
    /* renamed from: a */
    public void mo46437a() {
        super.mo46437a();
        m50514d();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: r */
    public void mo46468r() {
        this.f32731c.cancelSearch();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: t */
    public void mo46470t() {
        this.f32731c.loadNextPage();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12150i
    /* renamed from: i */
    public void mo46471i() {
        super.mo46471i();
        mo46475m().mo46579h();
        mo46475m().setWikiTreeVisible(true);
        this.f32732d = false;
    }

    /* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.o$1 */
    static /* synthetic */ class C121601 {

        /* renamed from: a */
        static final /* synthetic */ int[] f32733a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType[] r0 = com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.wiki.wikitree.tree.C12159o.C121601.f32733a = r0
                com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType r1 = com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType.NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.wiki.wikitree.tree.C12159o.C121601.f32733a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType r1 = com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType.PANEL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.wiki.wikitree.tree.C12159o.C121601.f32733a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType r1 = com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType.MOV_TO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.wiki.wikitree.tree.C12159o.C121601.f32733a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType r1 = com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType.NEW_TO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.wiki.wikitree.tree.C12159o.C121601.<clinit>():void");
        }
    }

    /* renamed from: d */
    private void m50514d() {
        C12040e a = C12041f.m49867a(((C12164q) mo46473k()).mo46355k(), ((C12164q) mo46473k()).mo46357m());
        this.f32731c = a;
        a.getWikiTreeSearchResult().mo5923a(((C12164q) mo46473k()).mo46356l(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.$$Lambda$o$c3ujUJFqWsCEW3tVZ7mogMIIO00 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C12159o.lambda$c3ujUJFqWsCEW3tVZ7mogMIIO00(C12159o.this, (List) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: q */
    public void mo46467q() {
        mo46475m().mo46571c();
        mo46475m().setWikiTreeVisible(false);
        this.f32732d = true;
        if (((C12164q) mo46473k()).f32739e == null || !((C12164q) mo46473k()).f32739e.mo46263a(true)) {
            mo46475m().mo46573d();
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: s */
    public void mo46469s() {
        mo46475m().setWikiTreeVisible(true);
        this.f32731c.cancelSearch();
        this.f32732d = false;
        if (((C12164q) mo46473k()).f32739e == null || !((C12164q) mo46473k()).f32739e.mo46263a(false)) {
            mo46475m().mo46576e();
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.C12150i
    /* renamed from: j */
    public boolean mo46472j() {
        if (!this.f32732d) {
            return super.mo46472j();
        }
        this.f32731c.cancelSearch();
        mo46475m().setWikiTreeVisible(true);
        mo46475m().mo46579h();
        mo46475m().mo46576e();
        mo46475m().mo46580i();
        this.f32732d = false;
        if (((C12164q) mo46473k()).f32739e != null) {
            ((C12164q) mo46473k()).f32739e.mo46263a(false);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50513a(List list) {
        mo46475m().mo46581j();
        if (!CollectionUtils.isEmpty(list)) {
            boolean e = ((C12033c) list.get(0)).mo46048e();
            String str = this.f32719a;
            C13479a.m54764b(str, "WikiSearchExtension.searchResultChanged, set enable load more = " + e);
            mo46475m().setRefreshLayoutEnableLoadMore(e);
        }
        mo46475m().mo46570b(list);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    public void a_(String str) {
        if (TextUtils.isEmpty(str)) {
            C13479a.m54758a(this.f32719a, "WikiSearchExtension.onInputSearchKey, empty query key. return. ");
        } else if (!TextUtils.isEmpty(mo46474l().mo46374c())) {
            this.f32731c.wikiSearch(str, mo46474l().mo46374c(), 1, 1);
        }
    }

    public C12159o(C12164q qVar, String str) {
        super(qVar, str);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: a */
    public void mo46460a(String str, String str2) {
        if (((C12164q) mo46473k()).f32739e != null) {
            ((C12164q) mo46473k()).f32739e.mo46262a();
        }
        int i = C121601.f32733a[((C12164q) mo46473k()).f32737c.ordinal()];
        if (i == 1 || i == 2) {
            C13479a.m54764b(this.f32719a, "WikiSearchExtension.onSearchItemClick, navigate to detail page. ");
            C12158n.m50510a(((C12164q) mo46473k()).mo46357m(), str, str2, (HomePage) null, false);
        } else if (i == 3 || i == 4) {
            C13479a.m54764b(this.f32719a, "WikiSearchExtension.onSearchItemClick, back to wiki tree. ");
            mo46475m().mo46582k();
            mo46475m().setWikiTreeVisible(true);
            this.f32732d = false;
            ((C12164q) mo46473k()).mo46505b(str2);
        }
    }
}
