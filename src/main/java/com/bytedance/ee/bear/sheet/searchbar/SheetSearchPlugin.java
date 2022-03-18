package com.bytedance.ee.bear.sheet.searchbar;

import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;
import com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.document.search.SearchPlugin;
import com.bytedance.ee.bear.sheet.common.C11090b;

public class SheetSearchPlugin extends SearchPlugin implements AbstractC6054a {
    @Override // com.bytedance.ee.bear.document.orientation.AbstractC6054a
    public boolean shouldDisableLandscape() {
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.sheet.searchbar.SheetSearchPlugin$a */
    public class C11300a extends SearchPlugin.C6100d {
        @Override // com.bytedance.ee.bear.document.search.C6106b.AbstractC6108b, com.bytedance.ee.bear.document.search.SearchPlugin.C6100d
        /* renamed from: a */
        public void mo24618a() {
            super.mo24618a();
        }

        private C11300a() {
            super();
        }

        @Override // com.bytedance.ee.bear.document.search.C6106b.AbstractC6108b, com.bytedance.ee.bear.document.search.SearchPlugin.C6100d
        /* renamed from: a */
        public void mo24619a(int i) {
            super.mo24619a(i);
            C11090b.m46144a("change_button");
        }

        @Override // com.bytedance.ee.bear.document.search.C6106b.AbstractC6108b, com.bytedance.ee.bear.document.search.SearchPlugin.C6100d
        /* renamed from: a */
        public void mo24620a(String str, boolean z) {
            String str2;
            super.mo24620a(str, z);
            if (z) {
                str2 = "return";
            } else {
                str2 = "edit";
            }
            C11090b.m46144a(str2);
        }
    }

    @Override // com.bytedance.ee.bear.document.search.SearchPlugin
    public Class<C11302b> getModelClass() {
        return C11302b.class;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.search.SearchPlugin
    public void ensureSearchFragment() {
        getUIContainer().mo19589a(this, instantiateFragment(C11301a.class));
        C11090b.m46143a();
    }

    public /* synthetic */ void lambda$onAttachToHost$0$SheetSearchPlugin(Boolean bool) {
        UnspecifiedOrientationPlugin unspecifiedOrientationPlugin = (UnspecifiedOrientationPlugin) findPlugin(UnspecifiedOrientationPlugin.class);
        if (Boolean.TRUE.equals(bool)) {
            if (unspecifiedOrientationPlugin != null) {
                unspecifiedOrientationPlugin.onOrientationSupportPanelShowing(this);
            }
        } else if (unspecifiedOrientationPlugin != null) {
            unspecifiedOrientationPlugin.onOrientationSupportPanelDismiss(this);
        }
    }

    @Override // com.bytedance.ee.bear.document.search.SearchPlugin
    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost(sVar);
        this.searchViewModel.getActive().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.searchbar.$$Lambda$SheetSearchPlugin$szfm4No7a3pyXGgHUDwVOol36E */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                SheetSearchPlugin.this.lambda$onAttachToHost$0$SheetSearchPlugin((Boolean) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.document.search.SearchPlugin
    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer(sVar, nVar);
        this.searchViewModel.setDelegate(new C11300a());
    }
}
