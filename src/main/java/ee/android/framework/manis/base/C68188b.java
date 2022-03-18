package ee.android.framework.manis.base;

import android.content.Context;
import java.util.HashMap;

/* renamed from: ee.android.framework.manis.base.b */
public class C68188b {
    /* renamed from: a */
    private static Object m264849a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("com.ss.android.lark.mail.impl.mulprocess.webprocess.IMailPush", "mailweb");
        hashMap.put("com.ss.android.lark.appcenter.manis.AppCenterProxy", "");
        hashMap.put("com.ss.android.lark.browser.impl.manis.IBrowserP0Proxy", "p0");
        hashMap.put("com.ss.android.lark.featuregating.service.IFeatureGatingProxy", "");
        hashMap.put("com.ss.android.lark.mail.impl.mulprocess.webprocess.ITranslationService", "mailweb");
        hashMap.put("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent", "");
        hashMap.put("com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote", "");
        hashMap.put("com.ss.android.lark.helpdesk.manis.HelpdeskIpc", "");
        hashMap.put("com.bytedance.ee.webapp.utils.IWebAppHostService", "");
        hashMap.put("com.ss.android.lark.image.service.IImageManisService", "");
        hashMap.put("com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService", "");
        hashMap.put("com.ss.android.lark.guidemgr.manis.IGuideMgrProxy", "");
        hashMap.put("com.ss.android.lark.resource.service.IResourceManisService", "");
        hashMap.put("com.larksuite.component.openplatform.core.container.crossprocess.IP0ProcessHandleEvent", "p0");
        hashMap.put("com.larksuite.component.service.IMetricManisService", "");
        hashMap.put("com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleDefaultPluginContainerEvent", "");
        hashMap.put("com.larksuite.component.blockit.sub_process.IP0SubProcess", "p0");
        hashMap.put("com.ss.android.lark.wschannelprocess.IWschannelProcIPCServer", "wschannel");
        hashMap.put("com.ss.android.lark.integrator.ccm.config.manis.IDocManisService", "");
        hashMap.put("com.ss.android.lark.openplatform.manis.OpenPlatformIpc", "");
        hashMap.put("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAppLifecycleService", "");
        hashMap.put("com.ss.android.lark.opmonitor.process.IOPMonitorHeartBeatIPC", "");
        hashMap.put("com.ss.android.lark.chat.service.IChatManisService", "");
        hashMap.put("com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation", "");
        hashMap.put("com.ss.android.lark.littleapp.mains.LittleAppProxy", "");
        hashMap.put("com.ss.android.lark.browser.manis.AppConfig", "");
        hashMap.put("com.he.jsbinding.snapshot.ISnapshotCreatorHostService", "");
        hashMap.put("com.ss.android.lark.appstrategy.service.IAppStrategyManisService", "");
        hashMap.put("com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess", "p0");
        hashMap.put("com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker1", "miniapp1");
        hashMap.put("com.ss.android.lark.meego.wrapper.manis.IMeegoProxy", "");
        hashMap.put("com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker0", "miniapp0");
        hashMap.put("com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker3", "miniapp3");
        hashMap.put("com.ss.android.lark.profile.service.IProfileManisService", "");
        hashMap.put("com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker2", "miniapp2");
        hashMap.put("com.ss.android.lark.main.interfaces.IMainManisService", "");
        hashMap.put("com.ss.android.lark.magic.manis.IMagicProxy", "");
        hashMap.put("com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker4", "miniapp4");
        hashMap.put("com.ss.android.lark.audit_provider.IDataIPCService", "");
        hashMap.put("com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess", "");
        hashMap.put("com.ss.android.lark.passport.infra.util.storage.IPassportStorageService", "");
        hashMap.put("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting", "");
        hashMap.put("com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy", "");
        hashMap.put("com.ss.android.lark.dynamicconfig.manis.DynamicHostProxy", "");
        hashMap.put("com.ss.android.lark.dynamic_so.ipc_server.IDynamicSoIPCServer", "");
        hashMap.put("com.ss.android.lark.dynamicconfig.interfaces.IDynamicManisService", "");
        hashMap.put("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService", "");
        hashMap.put("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IWebProcessLifecycle", "");
        hashMap.put("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost", "");
        hashMap.put("com.ss.android.lark.wschannelprocess.IMainProcIPCServer", "");
        hashMap.put("com.ss.android.lark.ttwebview.manis.TTWebViewApiProxy", "");
        hashMap.put("com.ss.android.lark.platform.applink.AppLinkProxy", "");
        hashMap.put("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAccountService", "");
        hashMap.put("com.ss.android.lark.mail.impl.mulprocess.mainprocess.ISettingService", "");
        hashMap.put("com.ss.android.lark.stepcount.service.IStepCountManisService", "");
        hashMap.put("com.ss.android.lark.passport.infra.log.ILogMonitorService", "");
        hashMap.put("com.ss.android.lark.integrator.littleapp.manis.GadgetProxy", "");
        hashMap.put("com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginManisService", "");
        hashMap.put("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IEngagementSettingService", "");
        if (hashMap.get(str) != null) {
            return hashMap.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public static String m264850a(Context context, String str) {
        return (String) m264849a(str);
    }
}
