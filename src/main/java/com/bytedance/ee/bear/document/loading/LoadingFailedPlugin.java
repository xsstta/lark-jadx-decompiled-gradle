package com.bytedance.ee.bear.document.loading;

import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C5869m;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocReport;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.aj;
import com.bytedance.ee.bear.document.loading.LoadingLayout;
import com.bytedance.ee.log.C13479a;

public class LoadingFailedPlugin extends DocumentPlugin implements LoadingLayout.AbstractC5864a {
    /* access modifiers changed from: protected */
    public void replaceDocumentFragment() {
        C13479a.m54764b("LoadingFailedPlugin", "replaceDocumentFragment()...");
        aj l = ((C6095s) getHost()).mo24597l();
        String originUrl = getDocViewModel().getOriginUrl();
        if (l == null || TextUtils.isEmpty(originUrl)) {
            C13479a.m54775e("LoadingFailedPlugin", "the documentFragment or its origin url is null");
            return;
        }
        FragmentManager fragmentManager = l.getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.beginTransaction().replace(l.getId(), C5869m.m23602a(originUrl, l.getArguments())).commitAllowingStateLoss();
        }
    }

    @Override // com.bytedance.ee.bear.document.loading.LoadingLayout.AbstractC5864a
    public void onFailedRetry(int i) {
        C13479a.m54764b("LoadingFailedPlugin", "onFailedRetry()... errCode = " + i);
        if (i == DocReport.ErrCode.f16163a.mo23029b() || i == DocReport.ErrCode.f16163a.mo23039l() || i == DocReport.ErrCode.f16163a.mo23032e()) {
            replaceDocumentFragment();
        } else {
            ((C6095s) getHost()).mo24600o().mo23795a();
        }
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        DocLoadingPlugin docLoadingPlugin = (DocLoadingPlugin) findPlugin(DocLoadingPlugin.class);
        if (docLoadingPlugin != null) {
            docLoadingPlugin.setOnRetryListener(this);
        }
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        DocLoadingPlugin docLoadingPlugin = (DocLoadingPlugin) findPlugin(DocLoadingPlugin.class);
        if (docLoadingPlugin != null) {
            docLoadingPlugin.setOnRetryListener(null);
        }
    }
}
