package com.bytedance.ee.bear.document.share;

import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.AbstractC5089af;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.export.ExportPlugin;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;
import com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.facade.common.AbstractC7664b;
import com.bytedance.ee.log.C13479a;
import org.koin.java.KoinJavaComponent;

public class SharePlugin extends DocumentPlugin implements AbstractC5089af.AbstractC5090a, AbstractC6054a, AbstractC7664b {
    private C6155b mShareHandler;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.document.share.SharePlugin$a */
    public interface AbstractC6153a {
        /* renamed from: a */
        void mo24842a();

        /* renamed from: a */
        void mo24843a(String str);
    }

    @Override // com.bytedance.ee.bear.document.orientation.AbstractC6054a
    public boolean shouldDisableLandscape() {
        return true;
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5090a
    public void onRequestExport() {
        if (this.mShareHandler != null) {
            C13479a.m54764b("SharePlugin", "onRequestExport.");
            this.mShareHandler.mo24846a("shareImage");
        }
    }

    /* access modifiers changed from: package-private */
    public void startShare() {
        if (isUIContainerDetached()) {
            C13479a.m54775e("SharePlugin", "startShare when not active !");
        } else {
            execJS("javascript:window.lark.biz.sheet.clickShare", new JSONObject());
        }
    }

    /* access modifiers changed from: protected */
    public C6155b createHandler(C6095s sVar) {
        return new C6155b(sVar, new AbstractC6153a() {
            /* class com.bytedance.ee.bear.document.share.SharePlugin.C61521 */

            @Override // com.bytedance.ee.bear.document.share.SharePlugin.AbstractC6153a
            /* renamed from: a */
            public void mo24842a() {
                UnspecifiedOrientationPlugin unspecifiedOrientationPlugin = (UnspecifiedOrientationPlugin) SharePlugin.this.findPlugin(UnspecifiedOrientationPlugin.class);
                if (unspecifiedOrientationPlugin != null) {
                    unspecifiedOrientationPlugin.onOrientationSupportPanelShowing(SharePlugin.this);
                }
            }

            @Override // com.bytedance.ee.bear.document.share.SharePlugin.AbstractC6153a
            /* renamed from: a */
            public void mo24843a(String str) {
                ExportPlugin exportPlugin = (ExportPlugin) SharePlugin.this.findPlugin(ExportPlugin.class);
                if (exportPlugin != null) {
                    exportPlugin.onShowExportBadges("share_panel", str);
                }
            }
        });
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        C6155b createHandler = createHandler(sVar);
        this.mShareHandler = createHandler;
        bindBridgeHandler("biz.util.share", createHandler);
        ((AbstractC5089af) KoinJavaComponent.m268610a(AbstractC5089af.class)).mo20193b(this);
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        ((AbstractC5089af) KoinJavaComponent.m268610a(AbstractC5089af.class)).mo20185a(this);
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7664b
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mShareHandler.mo24848a(i, i2, intent);
        UnspecifiedOrientationPlugin unspecifiedOrientationPlugin = (UnspecifiedOrientationPlugin) findPlugin(UnspecifiedOrientationPlugin.class);
        if (unspecifiedOrientationPlugin != null) {
            unspecifiedOrientationPlugin.onOrientationSupportPanelDismiss(this);
        }
    }
}
