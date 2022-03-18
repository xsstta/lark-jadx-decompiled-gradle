package com.bytedance.ee.bear.document.rendergone;

import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.AbstractC6277u;
import com.bytedance.ee.bear.document.C5869m;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.aj;
import com.bytedance.ee.log.C13479a;

public class RenderGonePlugin extends DocumentPlugin {
    private AbstractC6088b mRenderGoneListener;

    public void replaceDocumentFragment() {
        C13479a.m54764b("RenderGonePlugin", "replaceDocumentFragment()...");
        aj l = ((C6095s) getHost()).mo24597l();
        String originUrl = getDocViewModel().getOriginUrl();
        if (l == null || TextUtils.isEmpty(originUrl)) {
            C13479a.m54775e("RenderGonePlugin", "the documentFragment or its origin url is null");
            return;
        }
        FragmentManager fragmentManager = l.getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.beginTransaction().replace(l.getId(), C5869m.m23602a(originUrl, l.getArguments())).commitAllowingStateLoss();
        }
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        this.mRenderGoneListener = new AbstractC6088b() {
            /* class com.bytedance.ee.bear.document.rendergone.RenderGonePlugin.C60861 */

            @Override // com.bytedance.ee.bear.document.rendergone.AbstractC6088b
            /* renamed from: a */
            public void mo22588a(boolean z, int i) {
                C13479a.m54764b("RenderGonePlugin", "onRenderProcessGone====== : ");
                if (!C6087a.m24612a()) {
                    RenderGonePlugin.this.replaceDocumentFragment();
                }
            }
        };
        AbstractC4931i web = getWeb();
        if (web instanceof AbstractC6277u) {
            ((AbstractC6277u) web).mo22565a(this.mRenderGoneListener);
        }
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        AbstractC6088b bVar;
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        AbstractC4931i web = getWeb();
        if ((web instanceof AbstractC6277u) && (bVar = this.mRenderGoneListener) != null) {
            ((AbstractC6277u) web).mo22567b(bVar);
        }
    }
}
