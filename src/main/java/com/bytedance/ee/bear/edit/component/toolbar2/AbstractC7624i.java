package com.bytedance.ee.bear.edit.component.toolbar2;

import com.bytedance.ee.bear.browser.plugin.C4943e;

/* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.i */
public interface AbstractC7624i {

    /* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.i$a */
    public interface AbstractC7625a {
        /* renamed from: a */
        boolean mo22155a();

        /* renamed from: a */
        boolean mo22156a(String str);

        /* renamed from: b */
        void mo22157b();

        /* renamed from: b */
        boolean mo22158b(String str);

        /* renamed from: c */
        void mo22159c();

        /* renamed from: d */
        void mo22160d();
    }

    /* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.i$b */
    public interface AbstractC7626b {
        boolean s_();
    }

    void attach(C4943e eVar, AbstractC7625a aVar);

    void detach(C4943e eVar);

    void forceClearToolbar();

    boolean hasShowingPanel();

    boolean isShowingFunctionPanel();

    boolean onKeyboardToolbarItemClick();

    void onToolbarChanged();

    void onToolbarItemClick(String str);
}
