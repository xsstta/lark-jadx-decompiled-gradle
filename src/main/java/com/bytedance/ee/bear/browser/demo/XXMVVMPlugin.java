package com.bytedance.ee.bear.browser.demo;

import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.BaseWebPlugin;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.larksuite.suite.R;

public class XXMVVMPlugin extends BaseWebPlugin<C4933k> {
    public C4925b xxViewModel;

    private void ensureXXFragment() {
        if (getUIContainer().mo19586a((AbstractC4941c) this) == null) {
            getUIContainer().mo19589a(this, instantiateFragment(C4924a.class));
        }
    }

    private void ensureXXView() {
        AbstractC4958n uIContainer = getUIContainer();
        if (uIContainer.mo19583a(R.id.pop_content) == null) {
            uIContainer.mo19584a(this, R.layout.bottom_pop_layout);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.browser.demo.XXMVVMPlugin$a */
    public class C4923a implements AbstractC7945d<WebData> {
        private C4923a() {
        }

        /* renamed from: a */
        public void handle(WebData webData, AbstractC7947h hVar) {
            XXMVVMPlugin.this.xxViewModel.updateWebData(webData);
        }
    }

    public /* synthetic */ void lambda$onAttachToHost$0$XXMVVMPlugin(WebData webData) {
        if (WebData.validate(webData)) {
            ensureXXView();
            ensureXXFragment();
        }
    }

    public void onAttachToHost(C4933k kVar) {
        super.onAttachToHost((C4943e) kVar);
        C4925b bVar = (C4925b) viewModel(C4925b.class);
        this.xxViewModel = bVar;
        bVar.getWebData().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.browser.demo.$$Lambda$XXMVVMPlugin$W2NzjwcrnMC_JR5IQvx15oS4tU */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                XXMVVMPlugin.this.lambda$onAttachToHost$0$XXMVVMPlugin((WebData) obj);
            }
        });
        bindBridgeHandler("xxJS", new C4923a());
    }

    public void onAttachToUIContainer(C4933k kVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) kVar, nVar);
    }
}
