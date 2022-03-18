package com.bytedance.ee.bear.doc.toolbar;

import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.toolbar.C6218f;
import com.bytedance.ee.bear.document.toolbar.NavBarBottomInsetCompatEntity;

public class DocToolbarPlugin extends DocumentToolbarPlugin {
    @Override // com.bytedance.ee.bear.document.toolbar.BaseToolbarPlugin
    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost(sVar);
        C6218f.m25065a().mo25153a(getActivity(), (NavBarBottomInsetCompatEntity) C4211a.m17514a().mo16532a("doc_toolbar_android_compat", NavBarBottomInsetCompatEntity.class, new NavBarBottomInsetCompatEntity()));
    }
}
