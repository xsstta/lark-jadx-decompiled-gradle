package com.bytedance.ee.bear.document;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.lifecycle.aj;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.toolbar.editpanels.C6215b;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.log.C13479a;

public class EditPanelsPlugin extends DocumentPluginV2 {
    private C6215b panelsViewModel;

    /* renamed from: com.bytedance.ee.bear.document.EditPanelsPlugin$a */
    private class C5613a implements AbstractC7945d<Void> {
        private C5613a() {
        }

        /* renamed from: a */
        public void handle(Void r1, AbstractC7947h hVar) {
            C13479a.m54772d("EditPanelsPlugin", "js hide keyboard");
            C10548d.m43697a(EditPanelsPlugin.this.getActivity().getWindow().getDecorView());
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.EditPanelsPlugin$b */
    private class C5614b implements AbstractC7945d<Void> {
        private C5614b() {
        }

        /* renamed from: a */
        public void handle(Void r3, AbstractC7947h hVar) {
            C13479a.m54772d("EditPanelsPlugin", "js show keyboard");
            C10548d.m43698a(EditPanelsPlugin.this.getEditorAbility().mo24603r(), new MyResultReceiver(null, hVar));
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToHost(C4943e eVar) {
        super.onAttachToHost(eVar);
        this.panelsViewModel = (C6215b) aj.m5366a(getActivity()).mo6005a(C6215b.class);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        C13479a.m54772d("EditPanelsPlugin", "isVisibleToUser = " + z);
        if (z) {
            this.panelsViewModel.attachBridge(getBridge());
        } else {
            this.panelsViewModel.detachBridge(getBridge());
        }
    }

    /* access modifiers changed from: private */
    public static class MyResultReceiver extends ResultReceiver {

        /* renamed from: a */
        private AbstractC7947h f15921a;

        public MyResultReceiver(Handler handler, AbstractC7947h hVar) {
            super(handler);
            this.f15921a = hVar;
        }

        /* access modifiers changed from: protected */
        public void onReceiveResult(int i, Bundle bundle) {
            AbstractC7947h hVar;
            super.onReceiveResult(i, bundle);
            if (i == 2 && (hVar = this.f15921a) != null) {
                hVar.mo17188a(new JSONObject());
            }
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer(eVar, nVar);
        AbstractC10550f.AbstractC10551a.m43717b(eVar.mo19564f()).mo39928b(this.panelsViewModel);
        this.panelsViewModel.detachBridge(getBridge());
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer(eVar, nVar);
        this.panelsViewModel.setContentView(getEditorAbility().mo24603r());
        this.panelsViewModel.attachBridge(getBridge());
        AbstractC10550f.AbstractC10551a.m43717b(eVar.mo19564f()).mo39924a(this.panelsViewModel);
        getBridge().mo19349a("biz.util.showKeyBoard", new C5614b());
        getBridge().mo19349a("biz.util.hideKeyBoard", new C5613a());
    }
}
