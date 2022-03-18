package com.bytedance.ee.bear.document.alert;

import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;
import com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;

public class OopsPlugin extends DocumentPlugin implements AbstractC6054a {
    private OopsPopWindow oopsPopWindow;

    @Override // com.bytedance.ee.bear.document.orientation.AbstractC6054a
    public boolean shouldDisableLandscape() {
        return true;
    }

    /* renamed from: com.bytedance.ee.bear.document.alert.OopsPlugin$a */
    private class C5644a implements AbstractC7945d<AlertModel> {
        private C5644a() {
        }

        /* renamed from: a */
        public void handle(AlertModel alertModel, AbstractC7947h hVar) {
            OopsPlugin.this.showOops(alertModel, hVar);
            ((C6095s) OopsPlugin.this.getHost()).mo24599n().requestNotFocus(OopsPlugin.this.getActivity());
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.util.showAlert", new C5644a());
    }

    public /* synthetic */ Unit lambda$showOops$0$OopsPlugin(AlertModel alertModel) {
        UnspecifiedOrientationPlugin unspecifiedOrientationPlugin;
        if (!(alertModel.getInput() == null || (unspecifiedOrientationPlugin = (UnspecifiedOrientationPlugin) findPlugin(UnspecifiedOrientationPlugin.class)) == null)) {
            unspecifiedOrientationPlugin.onOrientationSupportPanelShowing(this);
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ Unit lambda$showOops$1$OopsPlugin(AlertModel alertModel) {
        UnspecifiedOrientationPlugin unspecifiedOrientationPlugin;
        if (!(alertModel.getInput() == null || (unspecifiedOrientationPlugin = (UnspecifiedOrientationPlugin) findPlugin(UnspecifiedOrientationPlugin.class)) == null)) {
            unspecifiedOrientationPlugin.onOrientationSupportPanelDismiss(this);
        }
        return Unit.INSTANCE;
    }

    public void showOops(AlertModel alertModel, AbstractC7947h hVar) {
        if (this.oopsPopWindow == null) {
            this.oopsPopWindow = new OopsPopWindow(getActivity());
        }
        this.oopsPopWindow.mo22632a(new Function0(alertModel) {
            /* class com.bytedance.ee.bear.document.alert.$$Lambda$OopsPlugin$nvfJ2tOwEe9u5ETTUGvclWd867w */
            public final /* synthetic */ AlertModel f$1;

            {
                this.f$1 = r2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OopsPlugin.this.lambda$showOops$0$OopsPlugin(this.f$1);
            }
        });
        this.oopsPopWindow.mo22633b(new Function0(alertModel) {
            /* class com.bytedance.ee.bear.document.alert.$$Lambda$OopsPlugin$u1X1lMO4aSiLtjip_NuETDhxMs */
            public final /* synthetic */ AlertModel f$1;

            {
                this.f$1 = r2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OopsPlugin.this.lambda$showOops$1$OopsPlugin(this.f$1);
            }
        });
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40644a(this.oopsPopWindow.mo22629a(alertModel, hVar));
    }
}
