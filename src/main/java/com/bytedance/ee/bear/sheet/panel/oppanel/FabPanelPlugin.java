package com.bytedance.ee.bear.sheet.panel.oppanel;

import android.content.res.Configuration;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1178x;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4957m;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.sheet.common.SheetPanelRouter;
import com.bytedance.ee.bear.sheet.orientation.SheetUnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.sheet.panel.AbstractC11261b;
import com.bytedance.ee.bear.sheet.panel.oppanel.C11271b;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.Map;

public class FabPanelPlugin extends DocumentPlugin implements AbstractC6054a {
    public C11271b mFabPanelViewModel;

    @Override // com.bytedance.ee.bear.document.orientation.AbstractC6054a
    public boolean shouldDisableLandscape() {
        return true;
    }

    public /* synthetic */ void lambda$onAttachToHost$1$FabPanelPlugin() {
        getUIContainer().mo19597c(this);
    }

    /* renamed from: com.bytedance.ee.bear.sheet.panel.oppanel.FabPanelPlugin$a */
    private class C11268a implements AbstractC7945d<FabPanelItem> {
        private C11268a() {
        }

        /* renamed from: a */
        public void handle(FabPanelItem fabPanelItem, final AbstractC7947h hVar) {
            C13479a.m54772d("FabPanelPlugin", "handle: FabPanelItem = " + fabPanelItem);
            if (fabPanelItem == null || fabPanelItem.getData() == null || fabPanelItem.getData().length == 0) {
                FabPanelPlugin.this.mFabPanelViewModel.setActive(false);
                return;
            }
            FabPanelPlugin.this.mFabPanelViewModel.setBadges(fabPanelItem.getBadges());
            FabPanelPlugin.this.mFabPanelViewModel.updateItems(fabPanelItem.getData());
            FabPanelPlugin.this.mFabPanelViewModel.showKeyboardFab().mo5929b(Boolean.valueOf(fabPanelItem.isShowEditButton()));
            if (fabPanelItem.isForceOpen()) {
                FabPanelPlugin.this.mFabPanelViewModel.setActive(true);
            }
            SheetPanelRouter.f29786a.mo42308a(fabPanelItem.isForceOpen(), fabPanelItem.getUri());
            FabPanelPlugin.this.mFabPanelViewModel.setDelegate(new AbstractC11261b.AbstractC11262a() {
                /* class com.bytedance.ee.bear.sheet.panel.oppanel.FabPanelPlugin.C11268a.C112691 */

                @Override // com.bytedance.ee.bear.sheet.panel.AbstractC11261b.AbstractC11262a
                /* renamed from: a */
                public <V> void mo43183a(String str, V v) {
                    if (hVar != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", (Object) str);
                        jSONObject.put("value", (Object) v);
                        hVar.mo17188a(jSONObject);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.sheet.operationPanel", new C11268a());
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onConfigurationChanged(Configuration configuration) {
        boolean z;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.mFabPanelViewModel.setActive(false);
        }
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        C11271b bVar = (C11271b) viewModel(C11271b.class);
        this.mFabPanelViewModel = bVar;
        bVar.getActive().mo5923a(getLifecycleOwner(), new AbstractC1178x((SheetUnspecifiedOrientationPlugin) findPlugin(SheetUnspecifiedOrientationPlugin.class)) {
            /* class com.bytedance.ee.bear.sheet.panel.oppanel.$$Lambda$FabPanelPlugin$g3YVMejvQIlLmIsDelFFgjV7EbM */
            public final /* synthetic */ SheetUnspecifiedOrientationPlugin f$1;

            {
                this.f$1 = r2;
            }

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                FabPanelPlugin.this.lambda$onAttachToHost$0$FabPanelPlugin(this.f$1, (Boolean) obj);
            }
        });
        this.mFabPanelViewModel.setFabPanelDelegate2(new C11271b.AbstractC11273b() {
            /* class com.bytedance.ee.bear.sheet.panel.oppanel.$$Lambda$FabPanelPlugin$V0h8izZPsw2vn4AACIN18UHqRMg */

            @Override // com.bytedance.ee.bear.sheet.panel.oppanel.C11271b.AbstractC11273b
            public final void removeFragment() {
                FabPanelPlugin.this.lambda$onAttachToHost$1$FabPanelPlugin();
            }
        });
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        sVar.mo24599n().registerEditPanel(getLifecycleOwner(), this.mFabPanelViewModel);
        this.mFabPanelViewModel.onAttachToUI(getActivity(), getWeb());
    }

    public /* synthetic */ void lambda$onAttachToHost$0$FabPanelPlugin(SheetUnspecifiedOrientationPlugin sheetUnspecifiedOrientationPlugin, Boolean bool) {
        C13479a.m54772d("FabPanelPlugin", "BaseCellPanelViewModel, active = " + bool);
        if (Boolean.TRUE.equals(bool)) {
            addOrReplaceFragment(FabPanelFragment.class, new Bundle(), C4957m.m20520a(R.anim.panel_enter, R.anim.panel_exit));
            if (sheetUnspecifiedOrientationPlugin != null) {
                sheetUnspecifiedOrientationPlugin.onOrientationSupportPanelShowing(this);
                return;
            }
            return;
        }
        getUIContainer().mo19597c(this);
        if (sheetUnspecifiedOrientationPlugin != null) {
            sheetUnspecifiedOrientationPlugin.onOrientationSupportPanelDismiss(this);
        }
    }
}
