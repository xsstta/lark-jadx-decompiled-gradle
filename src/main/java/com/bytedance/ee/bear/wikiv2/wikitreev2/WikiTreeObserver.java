package com.bytedance.ee.bear.wikiv2.wikitreev2;

import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.C12504l;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00128FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/WikiTreeObserver;", "", "()V", "doFavorite", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/NonStickyMutableLiveData;", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/DoFavoriteEvent;", "getDoFavorite", "()Lcom/bytedance/ee/bear/wikiv2/wikitreev2/NonStickyMutableLiveData;", "doMakeCopy", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/DoMakeCopyEvent;", "getDoMakeCopy", "focusChange", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/FocusChangeEvent;", "getFocusChange", "titleChange", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/TitleChangeEvent;", "getTitleChange", "tmpWorkspace", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/Workspace;", "getTmpWorkspace", "()Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/Workspace;", "setTmpWorkspace", "(Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/Workspace;)V", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.f */
public final class WikiTreeObserver {

    /* renamed from: a */
    public static final WikiTreeObserver f33320a = new WikiTreeObserver();

    /* renamed from: b */
    private static C12504l f33321b;

    /* renamed from: c */
    private static final NonStickyMutableLiveData<FocusChangeEvent> f33322c = new NonStickyMutableLiveData<>();

    /* renamed from: d */
    private static final NonStickyMutableLiveData<DoMakeCopyEvent> f33323d = new NonStickyMutableLiveData<>();

    /* renamed from: e */
    private static final NonStickyMutableLiveData<DoFavoriteEvent> f33324e = new NonStickyMutableLiveData<>();

    /* renamed from: f */
    private static final NonStickyMutableLiveData<TitleChangeEvent> f33325f = new NonStickyMutableLiveData<>();

    private WikiTreeObserver() {
    }

    /* renamed from: b */
    public final NonStickyMutableLiveData<FocusChangeEvent> mo47310b() {
        return f33322c;
    }

    /* renamed from: c */
    public final NonStickyMutableLiveData<DoMakeCopyEvent> mo47311c() {
        return f33323d;
    }

    /* renamed from: d */
    public final NonStickyMutableLiveData<DoFavoriteEvent> mo47312d() {
        return f33324e;
    }

    /* renamed from: e */
    public final NonStickyMutableLiveData<TitleChangeEvent> mo47313e() {
        return f33325f;
    }

    /* renamed from: a */
    public final C12504l mo47308a() {
        C12504l lVar = f33321b;
        f33321b = null;
        return lVar;
    }

    /* renamed from: a */
    public final void mo47309a(C12504l lVar) {
        f33321b = lVar;
    }
}
