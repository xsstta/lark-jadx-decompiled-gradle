package com.bytedance.ee.bear.basesdk.p250a;

import android.content.Context;
import com.bytedance.ee.bear.assemble.config.OnBoardingMissionConfigs;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.browser.plugin.lazy.PluginMountStrategy;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.document.EditorAbility;
import com.bytedance.ee.bear.document.FullVideoPlugin;
import com.bytedance.ee.bear.document.PermissionPlugin;
import com.bytedance.ee.bear.document.ReportCCMLinkPlugin;
import com.bytedance.ee.bear.document.UpdateNetworkStatePlugin;
import com.bytedance.ee.bear.document.WatermarkPlugin;
import com.bytedance.ee.bear.document.WindowOpenPlugin;
import com.bytedance.ee.bear.document.alert.OopsPlugin;
import com.bytedance.ee.bear.document.back.BackPrePagePlugin;
import com.bytedance.ee.bear.document.bottommenu.BottomMenuPlugin;
import com.bytedance.ee.bear.document.contactservice.ContactServicePlugin;
import com.bytedance.ee.bear.document.create.CreateDocumentPlugin;
import com.bytedance.ee.bear.document.docpageconfig.DocPageConfigPlugin;
import com.bytedance.ee.bear.document.entersuite.EnterSuitePlugin;
import com.bytedance.ee.bear.document.event.EventPlugin;
import com.bytedance.ee.bear.document.fail.FailTipPlugin;
import com.bytedance.ee.bear.document.loading.DocLoadingPlugin;
import com.bytedance.ee.bear.document.magic.MagicPlugin;
import com.bytedance.ee.bear.document.multitask.MultiTaskPlugin;
import com.bytedance.ee.bear.document.offline.base.DocumentOfflineSyncPlugin;
import com.bytedance.ee.bear.document.offline.file.upload.UploadFilePlugin;
import com.bytedance.ee.bear.document.onboarding.OnBoardingPlugin;
import com.bytedance.ee.bear.document.oops.OopsPluginV2;
import com.bytedance.ee.bear.document.orientation.OrientationInfoPlugin;
import com.bytedance.ee.bear.document.orientation.SensorOrientationDetectorPlugin;
import com.bytedance.ee.bear.document.permapply.PermApplyPlugin;
import com.bytedance.ee.bear.document.profile.ShowProfilePlugin;
import com.bytedance.ee.bear.document.reloadwebview.ReloadWebviewPlugin;
import com.bytedance.ee.bear.document.rendergone.RenderGonePlugin;
import com.bytedance.ee.bear.document.route.DocumentRouterPlugin;
import com.bytedance.ee.bear.document.selection.ShowHideMenuPlugin;
import com.bytedance.ee.bear.document.template.TemplatePlugin;
import com.bytedance.ee.bear.document.tips.TipsPlugin;
import com.bytedance.ee.bear.document.toolbar.media.SelectMediaPlugin;
import com.bytedance.ee.bear.drive.biz.docplugin.C6404a;

/* renamed from: com.bytedance.ee.bear.basesdk.a.j */
class C4362j {
    /* renamed from: a */
    static C4946h m18003a(Context context, C4943e eVar) {
        boolean z;
        boolean z2;
        if (((EditorAbility) eVar.mo19551b(EditorAbility.class)).mo24602q().getOpenSource() == DocsOpenSource.vc) {
            z = true;
        } else {
            z = false;
        }
        if (((EditorAbility) eVar.mo19551b(EditorAbility.class)).mo24602q().getOpenSource() == DocsOpenSource.chat_tab) {
            z2 = true;
        } else {
            z2 = false;
        }
        return C4946h.m20451a(C4946h.m20453a(C4946h.m20444a((AbstractC4941c<?>) new DocLoadingPlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new DocumentOfflineSyncPlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new DocumentRouterPlugin(!z), PluginMountStrategy.LoadFinish), C4946h.m20444a((AbstractC4941c<?>) new EventPlugin(), PluginMountStrategy.FirstJSCall), C4946h.m20444a((AbstractC4941c<?>) new TipsPlugin(), PluginMountStrategy.LoadFinish), C4946h.m20444a((AbstractC4941c<?>) new FailTipPlugin(), PluginMountStrategy.FirstJSCall), C4946h.m20444a((AbstractC4941c<?>) new TemplatePlugin(), PluginMountStrategy.LoadFinish), C4946h.m20444a((AbstractC4941c<?>) new ShowHideMenuPlugin(), PluginMountStrategy.FirstJSCall), C4946h.m20444a((AbstractC4941c<?>) new SelectMediaPlugin(), PluginMountStrategy.FirstJSCall), C4946h.m20444a((AbstractC4941c<?>) new OopsPlugin(), PluginMountStrategy.FirstJSCall), C4946h.m20444a((AbstractC4941c<?>) new UpdateNetworkStatePlugin(), PluginMountStrategy.LoadFinish), C4946h.m20444a((AbstractC4941c<?>) new WatermarkPlugin(), PluginMountStrategy.LoadFinish), C4946h.m20444a((AbstractC4941c<?>) new SensorOrientationDetectorPlugin(), PluginMountStrategy.FirstFind), C4946h.m20444a((AbstractC4941c<?>) new OrientationInfoPlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new EnterSuitePlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new ReloadWebviewPlugin(), PluginMountStrategy.Immediate), C4946h.m20450a(new OnBoardingPlugin(OnBoardingMissionConfigs.m17821a(eVar)), !z, PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new ReportCCMLinkPlugin(), PluginMountStrategy.LoadFinish), C4946h.m20444a((AbstractC4941c<?>) new PermissionPlugin(), PluginMountStrategy.FirstJSCall), C4946h.m20444a((AbstractC4941c<?>) new RenderGonePlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new ShowProfilePlugin(), PluginMountStrategy.FirstJSCall), C4946h.m20444a((AbstractC4941c<?>) new MagicPlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new UploadFilePlugin(), PluginMountStrategy.LoadFinish), C4946h.m20444a((AbstractC4941c<?>) new BottomMenuPlugin(), PluginMountStrategy.LoadFinish), C4946h.m20442a(new PermApplyPlugin(), Integer.MAX_VALUE, PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new WindowOpenPlugin(), PluginMountStrategy.LoadFinish), C4946h.m20444a((AbstractC4941c<?>) new FullVideoPlugin(), PluginMountStrategy.LoadFinish), C4946h.m20444a((AbstractC4941c<?>) new MultiTaskPlugin(), PluginMountStrategy.LoadFinish), C4946h.m20444a((AbstractC4941c<?>) new CreateDocumentPlugin(), PluginMountStrategy.LoadFinish), C4946h.m20444a((AbstractC4941c<?>) new ContactServicePlugin(), PluginMountStrategy.LoadFinish), C4946h.m20444a((AbstractC4941c<?>) new OopsPluginV2(), PluginMountStrategy.LoadFinish), C4946h.m20450a(new DocPageConfigPlugin(), z2, PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new BackPrePagePlugin(), PluginMountStrategy.LoadFinish)), C6404a.m25737a());
    }
}
