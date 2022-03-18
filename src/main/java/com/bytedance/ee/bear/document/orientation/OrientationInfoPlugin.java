package com.bytedance.ee.bear.document.orientation;

import android.content.res.Configuration;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7944c;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;

public class OrientationInfoPlugin extends DocumentPlugin {
    private C6051a mJSBinder;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.orientation.OrientationInfoPlugin$a */
    public class C6051a implements AbstractC7944c {
        private C6051a() {
        }

        /* renamed from: b */
        private JSONObject m24517b(Configuration configuration) {
            boolean z;
            OrientationEnum orientationEnum;
            if (configuration.orientation == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                orientationEnum = OrientationEnum.LANDSCAPE;
            } else {
                orientationEnum = OrientationEnum.PORTRAIT;
            }
            return orientationEnum.toJsonObject();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo24437a(Configuration configuration) {
            AbstractC4931i web = OrientationInfoPlugin.this.getWeb();
            if (web != null) {
                web.mo19428a("window.lark.biz.orientation.onSwitch", m24517b(configuration));
            }
        }

        @Override // com.bytedance.ee.bear.jsbridge.AbstractC7948j
        public void handle(Object obj, AbstractC7947h hVar) {
            hVar.mo17188a(m24517b(OrientationInfoPlugin.this.getResources().getConfiguration()));
        }
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        this.mJSBinder = new C6051a();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mJSBinder.mo24437a(configuration);
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        bindBridgeHandler("biz.orientation.getStatus", this.mJSBinder);
    }
}
