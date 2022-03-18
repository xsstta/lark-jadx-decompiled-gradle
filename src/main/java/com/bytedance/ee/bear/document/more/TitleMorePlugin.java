package com.bytedance.ee.bear.document.more;

import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.more.C5881a;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;
import com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.edit.component.toolbar2.DocToolbarV2Compat;
import com.bytedance.ee.bear.facade.common.AbstractC7664b;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.log.C13479a;
import java.util.Map;

public class TitleMorePlugin extends DocumentPlugin implements AbstractC6054a, AbstractC7664b {
    public C5881a mMoreRouteCompatAction;

    @Override // com.bytedance.ee.bear.document.orientation.AbstractC6054a
    public boolean shouldDisableLandscape() {
        return true;
    }

    public void notifyPanelDismiss() {
        UnspecifiedOrientationPlugin unspecifiedOrientationPlugin = (UnspecifiedOrientationPlugin) findPlugin(UnspecifiedOrientationPlugin.class);
        if (unspecifiedOrientationPlugin != null) {
            unspecifiedOrientationPlugin.onOrientationSupportPanelDismiss(this);
        }
    }

    public void notifyPanelShowing() {
        UnspecifiedOrientationPlugin unspecifiedOrientationPlugin = (UnspecifiedOrientationPlugin) findPlugin(UnspecifiedOrientationPlugin.class);
        if (unspecifiedOrientationPlugin != null) {
            unspecifiedOrientationPlugin.onOrientationSupportPanelShowing(this);
        }
    }

    public void notifyFrontedToCompute() {
        if (getDocViewModel().isType(C8275a.f22371d) || getDocViewModel().isType(C8275a.f22378k) || getDocViewModel().isType(C8275a.f22377j)) {
            execJS("javascript:lark.biz.content.requestFileInfo", new JSONObject());
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.more.TitleMorePlugin$a */
    private class C5879a implements AbstractC7945d<MoreModel> {
        private C5879a() {
        }

        /* renamed from: a */
        public void handle(MoreModel moreModel, AbstractC7947h hVar) {
            C13479a.m54764b("TitleMorePlugin", "show more");
            if (TitleMorePlugin.this.mMoreRouteCompatAction == null || !TitleMorePlugin.this.mMoreRouteCompatAction.mo23761b()) {
                if (TitleMorePlugin.this.mMoreRouteCompatAction == null) {
                    C58801 r5 = new C5881a.AbstractC5884a() {
                        /* class com.bytedance.ee.bear.document.more.TitleMorePlugin.C5879a.C58801 */

                        @Override // com.bytedance.ee.bear.document.more.C5881a.AbstractC5884a
                        /* renamed from: a */
                        public void mo23755a() {
                            TitleMorePlugin.this.notifyPanelShowing();
                        }

                        @Override // com.bytedance.ee.bear.document.more.C5881a.AbstractC5884a
                        /* renamed from: b */
                        public void mo23756b() {
                            TitleMorePlugin.this.notifyPanelDismiss();
                        }

                        @Override // com.bytedance.ee.bear.document.more.C5881a.AbstractC5884a
                        /* renamed from: c */
                        public void mo23757c() {
                            TitleMorePlugin.this.notifyFrontedToCompute();
                        }
                    };
                    TitleMorePlugin titleMorePlugin = TitleMorePlugin.this;
                    titleMorePlugin.mMoreRouteCompatAction = new C5881a((C6095s) titleMorePlugin.getHost(), r5);
                }
                TitleMorePlugin.this.mMoreRouteCompatAction.mo23760a(moreModel);
                DocToolbarV2Compat.of(TitleMorePlugin.this.getActivity()).forceClearToolbar();
                return;
            }
            C13479a.m54764b("TitleMorePlugin", "more is showing, return");
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.util.more", new C5879a());
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        C5881a aVar = this.mMoreRouteCompatAction;
        if (aVar != null) {
            aVar.mo23758a();
            this.mMoreRouteCompatAction = null;
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7664b
    public void onActivityResult(int i, int i2, Intent intent) {
        notifyPanelDismiss();
    }
}
