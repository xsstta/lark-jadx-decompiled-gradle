package com.ss.android.lark.filedetail;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.basesdk.api.AbstractC4385i;
import com.bytedance.ee.bear.quoto.FullQuotoConfig;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.C29407b;
import com.ss.android.lark.auditsdk.C29385a;
import com.ss.android.lark.auditsdk.IAuditService;
import com.ss.android.lark.auditsdk.authorization.IAuthorizationService;
import com.ss.android.lark.biz.core.api.AbstractC29572q;
import com.ss.android.lark.biz.core.api.AbstractC29575r;
import com.ss.android.lark.biz.core.api.C29556e;
import com.ss.android.lark.biz.core.api.FavoriteForwardData;
import com.ss.android.lark.biz.core.api.FileState;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.NetworkType;
import com.ss.android.lark.biz.im.api.AbstractC29625q;
import com.ss.android.lark.biz.im.api.C29598aa;
import com.ss.android.lark.biz.im.api.C29604ae;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.favorite.C37081c;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.filedetail.FileDetailModule;
import com.ss.android.lark.filedetail.dto.AbstractC38215b;
import com.ss.android.lark.filedetail.dto.C38212a;
import com.ss.android.lark.filedetail.impl.detail.listener.IPushMessageListener;
import com.ss.android.lark.filedetail.p1885a.AbstractC38197a;
import com.ss.android.lark.integrator.im.audit.AuditModuleProvider;
import com.ss.android.lark.integrator.im.chat.AbstractC39484a;
import com.ss.android.lark.integrator.im.p2028h.AbstractC39636b;
import com.ss.android.lark.listener.DefaultChatRelationPushListener;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ClaymoreImpl(AbstractC38197a.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u001bH\u0016J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u000209H\u0016J\u0012\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u000109H\u0016J\u0012\u0010=\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u000109H\u0016J\b\u0010>\u001a\u00020;H\u0016J\u0010\u0010?\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010@\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\u001c\u0010A\u001a\u00020\u001b2\b\u0010B\u001a\u0004\u0018\u00010C2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016R\"\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u000b0\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00110\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017X\u0004¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/ss/android/lark/filedetail/FileDetailModuleDependency;", "Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency;", "()V", "mCCMApi", "Lcom/ss/android/lark/ccm_api/ICCMApi;", "kotlin.jvm.PlatformType", "getMCCMApi", "()Lcom/ss/android/lark/ccm_api/ICCMApi;", "setMCCMApi", "(Lcom/ss/android/lark/ccm_api/ICCMApi;)V", "mCoreApi", "Lcom/ss/android/lark/biz/core/api/ICoreApi;", "getMCoreApi", "()Lcom/ss/android/lark/biz/core/api/ICoreApi;", "setMCoreApi", "(Lcom/ss/android/lark/biz/core/api/ICoreApi;)V", "mPassportApi", "Lcom/ss/android/lark/passport_api/IPassportApi;", "getMPassportApi", "()Lcom/ss/android/lark/passport_api/IPassportApi;", "setMPassportApi", "(Lcom/ss/android/lark/passport_api/IPassportApi;)V", "sNetworkStateListenerMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/ss/android/lark/filedetail/dto/NetworkTypeListener;", "Lcom/ss/android/lark/biz/core/api/IDownloadFileNetworkMonitor$NetworkTypeListener;", "addListenerToDriveSaveStateEventPush", "", "listener", "Lcom/ss/android/lark/biz/im/api/IPushDriveSaveStateListener;", "addListenerToNetworkTypeDispatcher", "checkAndInitDoc", "getAuditDependency", "Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency$IAuditDependency;", "getChatDependency", "Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency$IChatDependency;", "getContext", "Landroid/content/Context;", "getDownloadDependency", "Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency$IDownloadDependency;", "getDownloadFileMonitorDependency", "Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency$IDownloadFileMonitorDependency;", "getDriveDependency", "Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency$IDriveDependency;", "getDriveSdkWrapper", "Lcom/bytedance/ee/bear/basesdk/api/IDriveSdk;", "getFavoriteDependency", "Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency$IFavoriteDependency;", "getFeatureConfigDependency", "Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency$IFeatureConfigDependency;", "getForwardDependency", "Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency$IForwardDependency;", "getPushDependency", "Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency$IPushDependency;", "getSearchDependency", "Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency$ISearchDependency;", "getUserId", "", "isFeatureGatingCurrentEnable", "", "featureName", "isFeatureGatingEnable", "isOverseaTenant", "removeListenerToDriveSaveStateEventPush", "removeListenerToNetworkTypeDispatcher", "showFullQuotoDialog", "activity", "Landroidx/fragment/app/FragmentActivity;", "config", "Lcom/bytedance/ee/bear/quoto/FullQuotoConfig;", "im_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class FileDetailModuleDependency implements AbstractC38197a {
    private ICCMApi mCCMApi = ((ICCMApi) ApiUtils.getApi(ICCMApi.class));
    private ICoreApi mCoreApi = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));
    private IPassportApi mPassportApi = ((IPassportApi) ApiUtils.getApi(IPassportApi.class));
    private final ConcurrentHashMap<AbstractC38215b, AbstractC29572q.AbstractC29574b> sNetworkStateListenerMap = new ConcurrentHashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u0015"}, d2 = {"com/ss/android/lark/filedetail/FileDetailModuleDependency$getAuditDependency$1", "Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency$IAuditDependency;", "auditFileDownload", "", "originKey", "", "auditFileOpenBy3rdApp", "checkFileOpenBy3rdAppAuthorization", "", "defaultPassed", "checkFileSavedToDriveAuthorization", "getAuditDisplayMsg", "actionResId", "", "onCheckedAuthorizationFailed", "context", "Landroid/content/Context;", "displayMsg", "onDismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "onCheckedAuthorizationFailedToast", "im_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.FileDetailModuleDependency$b */
    public static final class C38184b implements AbstractC38197a.AbstractC38198a {
        C38184b() {
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38198a
        /* renamed from: a */
        public String mo139593a(int i) {
            IAuthorizationService e;
            String a;
            C29385a a2 = AuditModuleProvider.f100784c.mo143320a();
            if (a2 == null || (e = a2.mo104057e()) == null || (a = e.mo104068a(i)) == null) {
                return "";
            }
            return a;
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38198a
        /* renamed from: b */
        public void mo139598b(String str) {
            C29385a a;
            IAuditService d;
            if (str != null && (a = AuditModuleProvider.f100784c.mo143320a()) != null && (d = a.mo104056d()) != null) {
                d.mo104133e(str);
            }
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38198a
        /* renamed from: a */
        public void mo139596a(String str) {
            C29385a a;
            IAuditService d;
            if (str != null && (a = AuditModuleProvider.f100784c.mo143320a()) != null && (d = a.mo104056d()) != null) {
                d.mo104132d(str);
            }
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38198a
        /* renamed from: a */
        public void mo139594a(Context context, int i) {
            IAuthorizationService e;
            Intrinsics.checkParameterIsNotNull(context, "context");
            C29385a a = AuditModuleProvider.f100784c.mo143320a();
            if (a != null && (e = a.mo104057e()) != null) {
                e.mo104069a(context, i);
            }
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38198a
        /* renamed from: a */
        public boolean mo139597a(String str, boolean z) {
            C29385a a;
            IAuthorizationService e;
            if (str == null || (a = AuditModuleProvider.f100784c.mo143320a()) == null || (e = a.mo104057e()) == null) {
                return z;
            }
            return e.mo104078d(str, z);
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38198a
        /* renamed from: a */
        public void mo139595a(Context context, String str, DialogInterface.OnDismissListener onDismissListener) {
            IAuthorizationService e;
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "displayMsg");
            Intrinsics.checkParameterIsNotNull(onDismissListener, "onDismissListener");
            C29385a a = AuditModuleProvider.f100784c.mo143320a();
            if (a != null && (e = a.mo104057e()) != null) {
                e.mo104071a(context, str, onDismissListener);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/filedetail/FileDetailModuleDependency$getPushDependency$1", "Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency$IPushDependency;", "registerPushChatRelationListener", "", "key", "", "chatId", "listener", "Lcom/ss/android/lark/filedetail/impl/detail/listener/IPushMessageListener;", "unregisterPushChatRelationListener", "im_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.FileDetailModuleDependency$j */
    public static final class C38194j implements AbstractC38197a.AbstractC38206i {
        C38194j() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/filedetail/FileDetailModuleDependency$getPushDependency$1$registerPushChatRelationListener$1", "Lcom/ss/android/lark/listener/DefaultChatRelationPushListener;", "onPushMessage", "", "pushMessageDTO", "Lcom/ss/android/lark/biz/im/api/PushMessageDTO;", "im_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.filedetail.FileDetailModuleDependency$j$a */
        public static final class C38195a extends DefaultChatRelationPushListener {

            /* renamed from: a */
            final /* synthetic */ IPushMessageListener f97897a;

            C38195a(IPushMessageListener aVar) {
                this.f97897a = aVar;
            }

            @Override // com.ss.android.lark.chat.service.IPushChatRelationListener, com.ss.android.lark.listener.DefaultChatRelationPushListener
            /* renamed from: a */
            public void mo126573a(C29598aa aaVar) {
                Intrinsics.checkParameterIsNotNull(aaVar, "pushMessageDTO");
                Chat b = aaVar.mo106645b();
                IPushMessageListener aVar = this.f97897a;
                if (aVar != null && b != null) {
                    MessageInfo a = aaVar.mo106644a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "pushMessageDTO.messageInfo");
                    aVar.onPushMessage(a);
                }
            }
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38206i
        /* renamed from: b */
        public void mo139629b(String str, String str2, IPushMessageListener aVar) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(str2, "chatId");
            Intrinsics.checkParameterIsNotNull(aVar, "listener");
            C29407b a = AbstractC39484a.m156004a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatModuleProvider.getModule()");
            a.mo104266q().mo126544a(str, str2);
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38206i
        /* renamed from: a */
        public void mo139628a(String str, String str2, IPushMessageListener aVar) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(str2, "chatId");
            C29407b a = AbstractC39484a.m156004a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatModuleProvider.getModule()");
            a.mo104266q().mo126545a(str, str2, new C38195a(aVar));
        }
    }

    public final ICCMApi getMCCMApi() {
        return this.mCCMApi;
    }

    public final ICoreApi getMCoreApi() {
        return this.mCoreApi;
    }

    public final IPassportApi getMPassportApi() {
        return this.mPassportApi;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"com/ss/android/lark/filedetail/FileDetailModuleDependency$getFeatureConfigDependency$1", "Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency$IFeatureConfigDependency;", "FEATURE_ENABLE_ALL_DRIVE_SDK", "", "getFEATURE_ENABLE_ALL_DRIVE_SDK", "()Ljava/lang/String;", "isDriveSdkEnableForAll", "", "isFileDownloadEnable", "im_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.FileDetailModuleDependency$h */
    public static final class C38192h implements AbstractC38197a.AbstractC38204g {

        /* renamed from: a */
        private final String f97895a = "spacekit.mobile.drive.use_drivesdk_im";

        C38192h() {
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38204g
        /* renamed from: a */
        public boolean mo139623a() {
            return C37239a.m146648b().mo136951a("suite_file_download");
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38204g
        /* renamed from: b */
        public boolean mo139624b() {
            return C37239a.m146648b().mo136951a(this.f97895a);
        }
    }

    @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a
    public void checkAndInitDoc() {
        this.mCCMApi.checkAndInit();
    }

    @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a
    public AbstractC38197a.AbstractC38198a getAuditDependency() {
        return new C38184b();
    }

    @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a
    public AbstractC38197a.AbstractC38200c getDownloadDependency() {
        return new C38186d(this);
    }

    @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a
    public AbstractC38197a.AbstractC38201d getDownloadFileMonitorDependency() {
        return new C38189e(this);
    }

    @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a
    public AbstractC38197a.AbstractC38202e getDriveDependency() {
        return new C38190f(this);
    }

    @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a
    public AbstractC38197a.AbstractC38203f getFavoriteDependency() {
        return C38191g.f97894a;
    }

    @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a
    public AbstractC38197a.AbstractC38204g getFeatureConfigDependency() {
        return new C38192h();
    }

    @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a
    public AbstractC38197a.AbstractC38205h getForwardDependency() {
        return new C38193i(this);
    }

    @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a
    public AbstractC38197a.AbstractC38206i getPushDependency() {
        return new C38194j();
    }

    @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a
    public AbstractC38197a.AbstractC38207j getSearchDependency() {
        return new C38196k(this);
    }

    @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a
    public boolean isOverseaTenant() {
        return this.mPassportApi.isOverseaTenantBrand();
    }

    @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a
    public AbstractC38197a.AbstractC38199b getChatDependency() {
        return new C38185c(this, AbstractC39484a.m156004a());
    }

    @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a
    public Context getContext() {
        Application application = LarkContext.getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "LarkContext.getApplication()");
        return application;
    }

    @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a
    public AbstractC4385i getDriveSdkWrapper() {
        ICCMApi iCCMApi = this.mCCMApi;
        Intrinsics.checkExpressionValueIsNotNull(iCCMApi, "mCCMApi");
        AbstractC4385i driveSdkWrapper = iCCMApi.getDriveSdkWrapper();
        Intrinsics.checkExpressionValueIsNotNull(driveSdkWrapper, "mCCMApi.driveSdkWrapper");
        return driveSdkWrapper;
    }

    @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a
    public String getUserId() {
        IPassportApi iPassportApi = this.mPassportApi;
        Intrinsics.checkExpressionValueIsNotNull(iPassportApi, "mPassportApi");
        AbstractC49389b accountManager = iPassportApi.getAccountManager();
        Intrinsics.checkExpressionValueIsNotNull(accountManager, "mPassportApi.accountManager");
        String c = accountManager.mo172422c();
        Intrinsics.checkExpressionValueIsNotNull(c, "mPassportApi.accountManager.userId");
        return c;
    }

    public final void setMCCMApi(ICCMApi iCCMApi) {
        this.mCCMApi = iCCMApi;
    }

    public final void setMCoreApi(ICoreApi iCoreApi) {
        this.mCoreApi = iCoreApi;
    }

    public final void setMPassportApi(IPassportApi iPassportApi) {
        this.mPassportApi = iPassportApi;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000Q\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J,\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016J(\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J>\u0010\u000f\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016J2\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\rH\u0016J:\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\rH\u0016J`\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016JX\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J@\u0010 \u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010#\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\nH\u0016R\u0016\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006$"}, d2 = {"com/ss/android/lark/filedetail/FileDetailModuleDependency$getDownloadDependency$1", "Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency$IDownloadDependency;", "downloadService", "Lcom/ss/android/lark/biz/core/api/IDownloadService;", "Lorg/jetbrains/annotations/NotNull;", "getDownloadService", "()Lcom/ss/android/lark/biz/core/api/IDownloadService;", "cancelDownloadMailAttachment", "", "messageId", "", "fileKey", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "cancelDownloadMessageFile", "key", "sourceId", "messageSourceType", "", "checkFileState", "messageSourceId", "Lcom/ss/android/lark/filedetail/dto/FileState;", "downloadFileScene", "downLoadMessageFile", "context", "Landroid/content/Context;", "chatId", "downloadFileScope", "downloadPath", "progressListener", "Lcom/larksuite/framework/callback/OnUpdateProgressListener;", "downloadMailAttachment", "fileContentKey", "getDownloadFilePath", "getDownloadFileProgress", "im_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.FileDetailModuleDependency$d */
    public static final class C38186d implements AbstractC38197a.AbstractC38200c {

        /* renamed from: a */
        final /* synthetic */ FileDetailModuleDependency f97887a;

        /* renamed from: b */
        private final AbstractC29575r f97888b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/filedetail/FileDetailModuleDependency$getDownloadDependency$1$checkFileState$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/biz/core/api/FileState;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.filedetail.FileDetailModuleDependency$d$a */
        public static final class C38187a implements IGetDataCallback<FileState> {

            /* renamed from: a */
            final /* synthetic */ IGetDataCallback f97889a;

            C38187a(IGetDataCallback iGetDataCallback) {
                this.f97889a = iGetDataCallback;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                IGetDataCallback iGetDataCallback = this.f97889a;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(FileState fileState) {
                Intrinsics.checkParameterIsNotNull(fileState, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                IGetDataCallback iGetDataCallback = this.f97889a;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(com.ss.android.lark.filedetail.dto.FileState.forNumber(fileState.getNumber()));
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/filedetail/FileDetailModuleDependency$getDownloadDependency$1$checkFileState$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/biz/core/api/FileState;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.filedetail.FileDetailModuleDependency$d$b */
        public static final class C38188b implements IGetDataCallback<FileState> {

            /* renamed from: a */
            final /* synthetic */ IGetDataCallback f97890a;

            C38188b(IGetDataCallback iGetDataCallback) {
                this.f97890a = iGetDataCallback;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                IGetDataCallback iGetDataCallback = this.f97890a;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(FileState fileState) {
                Intrinsics.checkParameterIsNotNull(fileState, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                IGetDataCallback iGetDataCallback = this.f97890a;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(com.ss.android.lark.filedetail.dto.FileState.forNumber(fileState.getNumber()));
                }
            }
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38200c
        /* renamed from: a */
        public int mo139605a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            return this.f97888b.mo105826a(str);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38186d(FileDetailModuleDependency fileDetailModuleDependency) {
            this.f97887a = fileDetailModuleDependency;
            ICoreApi mCoreApi = fileDetailModuleDependency.getMCoreApi();
            Intrinsics.checkExpressionValueIsNotNull(mCoreApi, "mCoreApi");
            AbstractC29575r downloadService = mCoreApi.getDownloadService();
            Intrinsics.checkExpressionValueIsNotNull(downloadService, "mCoreApi.downloadService");
            this.f97888b = downloadService;
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38200c
        /* renamed from: b */
        public String mo139614b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            String b = this.f97888b.mo105836b(str);
            Intrinsics.checkExpressionValueIsNotNull(b, "downloadService.getDownloadFilePath(key)");
            return b;
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38200c
        /* renamed from: a */
        public void mo139608a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "messageId");
            Intrinsics.checkParameterIsNotNull(str2, "fileKey");
            this.f97888b.mo105830a(str, str2);
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38200c
        /* renamed from: a */
        public void mo139611a(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback) {
            this.f97888b.mo105833a(str, str2, iGetDataCallback);
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38200c
        /* renamed from: a */
        public void mo139610a(String str, String str2, int i, IGetDataCallback<com.ss.android.lark.filedetail.dto.FileState> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "messageId");
            this.f97888b.mo105832a(str, str2, i, new C38187a(iGetDataCallback));
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38200c
        /* renamed from: a */
        public void mo139612a(String str, String str2, String str3, int i) {
            Intrinsics.checkParameterIsNotNull(str, "messageId");
            Intrinsics.checkParameterIsNotNull(str2, "key");
            Intrinsics.checkParameterIsNotNull(str3, "sourceId");
            this.f97888b.mo105834a(str, str2, str3, i);
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38200c
        /* renamed from: a */
        public void mo139609a(String str, String str2, int i, int i2, IGetDataCallback<com.ss.android.lark.filedetail.dto.FileState> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "messageId");
            this.f97888b.mo105831a(str, str2, i, i2, new C38188b(iGetDataCallback));
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38200c
        /* renamed from: a */
        public void mo139613a(String str, String str2, String str3, int i, IGetDataCallback<Boolean> iGetDataCallback) {
            this.f97888b.mo105835a(str, str2, str3, i, iGetDataCallback);
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38200c
        /* renamed from: a */
        public void mo139607a(Context context, String str, String str2, String str3, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "messageId");
            Intrinsics.checkParameterIsNotNull(str2, "fileContentKey");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            Intrinsics.checkParameterIsNotNull(hVar, "progressListener");
            this.f97888b.mo105829a(context, str, str2, str3, iGetDataCallback, hVar);
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38200c
        /* renamed from: a */
        public void mo139606a(Context context, String str, String str2, String str3, int i, int i2, String str4, String str5, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "messageId");
            Intrinsics.checkParameterIsNotNull(str2, "messageSourceId");
            Intrinsics.checkParameterIsNotNull(str3, "chatId");
            Intrinsics.checkParameterIsNotNull(str4, "fileKey");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            Intrinsics.checkParameterIsNotNull(hVar, "progressListener");
            this.f97888b.mo105827a(context, str, str2, str3, i, i2, str4, str5, iGetDataCallback, hVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/filedetail/FileDetailModuleDependency$getDriveDependency$1", "Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency$IDriveDependency;", "saveToNutStore", "", "fileKey", "", "messageId", "sourceId", "sourceType", "Lcom/ss/android/lark/chat/entity/message/Message$SourceType;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "im_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.FileDetailModuleDependency$f */
    public static final class C38190f implements AbstractC38197a.AbstractC38202e {

        /* renamed from: a */
        final /* synthetic */ FileDetailModuleDependency f97893a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38190f(FileDetailModuleDependency fileDetailModuleDependency) {
            this.f97893a = fileDetailModuleDependency;
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38202e
        /* renamed from: a */
        public void mo139621a(String str, String str2, String str3, Message.SourceType sourceType, IGetDataCallback<String> iGetDataCallback) {
            int i;
            Intrinsics.checkParameterIsNotNull(str, "fileKey");
            Intrinsics.checkParameterIsNotNull(str2, "messageId");
            Intrinsics.checkParameterIsNotNull(str3, "sourceId");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            if (sourceType == null) {
                i = Message.SourceType.TYPE_FROM_MESSAGE.getNumber();
            } else {
                i = sourceType.getNumber();
            }
            this.f97893a.getMCCMApi().saveToNutStore(str, str2, str3, i, iGetDataCallback);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J \u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J@\u0010\u0010\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u0018"}, d2 = {"com/ss/android/lark/filedetail/FileDetailModuleDependency$getForwardDependency$1", "Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency$IForwardDependency;", "goChatForwardSelectPage", "", "mContext", "Landroid/content/Context;", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "originMergeForwardId", "", "goForwardFavoriteSelectPage", "context", "favoriteMessageInfo", "Lcom/ss/android/lark/chat/entity/favorite/FavoriteMessageInfo;", "requestCode", "", "goShareFileCopySelectPage", "fileKey", "fileName", "size", "", "isFolder", "", "messageId", "im_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.FileDetailModuleDependency$i */
    public static final class C38193i implements AbstractC38197a.AbstractC38205h {

        /* renamed from: a */
        final /* synthetic */ FileDetailModuleDependency f97896a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38193i(FileDetailModuleDependency fileDetailModuleDependency) {
            this.f97896a = fileDetailModuleDependency;
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38205h
        /* renamed from: a */
        public void mo139626a(Context context, Message message, String str) {
            Intrinsics.checkParameterIsNotNull(context, "mContext");
            Intrinsics.checkParameterIsNotNull(message, "message");
            this.f97896a.getMCoreApi().goChatForwardSelectPage(this.f97896a.getContext(), message, 11, str);
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38205h
        /* renamed from: a */
        public void mo139625a(Context context, FavoriteMessageInfo favoriteMessageInfo, int i) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(favoriteMessageInfo, "favoriteMessageInfo");
            FavoriteForwardData favoriteForwardData = new FavoriteForwardData();
            favoriteForwardData.setId(favoriteMessageInfo.getId());
            favoriteForwardData.setSourceMessage(favoriteMessageInfo.getSourceMessage());
            this.f97896a.getMCoreApi().goChatForwardSelectPage(context, favoriteForwardData, 7, i);
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38205h
        /* renamed from: a */
        public void mo139627a(Context context, String str, String str2, long j, boolean z, String str3) {
            this.f97896a.getMCoreApi().goShareFileCopySelectPage(context, str, str2, j, z, str3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/filedetail/FileDetailModuleDependency$getSearchDependency$1", "Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency$ISearchDependency;", "goToSearch", "", "context", "Landroid/content/Context;", "chatId", "", "im_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.FileDetailModuleDependency$k */
    public static final class C38196k implements AbstractC38197a.AbstractC38207j {

        /* renamed from: a */
        final /* synthetic */ FileDetailModuleDependency f97898a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38196k(FileDetailModuleDependency fileDetailModuleDependency) {
            this.f97898a = fileDetailModuleDependency;
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38207j
        /* renamed from: a */
        public void mo139630a(Context context, String str) {
            this.f97898a.getMCoreApi().goToFolderInsideSearchPage(context, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "networkType", "", "currentNetworkType"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.FileDetailModuleDependency$a */
    static final class C38183a implements AbstractC29572q.AbstractC29574b {

        /* renamed from: a */
        final /* synthetic */ AbstractC38215b f97884a;

        C38183a(AbstractC38215b bVar) {
            this.f97884a = bVar;
        }

        @Override // com.ss.android.lark.biz.core.api.AbstractC29572q.AbstractC29574b
        /* renamed from: a */
        public final void mo105825a(int i) {
            this.f97884a.mo139738a(FileDetailModule.NetworkType.Companion.mo139563a(i));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000M\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016J*\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\u000fH\u0016J(\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J \u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\bH\u0016¨\u0006\u001e"}, d2 = {"com/ss/android/lark/filedetail/FileDetailModuleDependency$getChatDependency$1", "Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency$IChatDependency;", "getChatById", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "chatId", "", "getLocalChat", "getLocalMessage", "Lcom/ss/android/lark/chat/entity/message/Message;", "messageId", "getMessagesByIds", "", "ids", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "openChat", "context", "Landroid/content/Context;", "fromTag", "position", "", "openThread", "threadId", "threadPosition", "readMessageCompletely", "msg", "isSuperGroup", "", "sendMessageRead", "im_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.FileDetailModuleDependency$c */
    public static final class C38185c implements AbstractC38197a.AbstractC38199b {

        /* renamed from: a */
        final /* synthetic */ FileDetailModuleDependency f97885a;

        /* renamed from: b */
        final /* synthetic */ C29407b f97886b;

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38199b
        /* renamed from: a */
        public Chat mo139599a(String str) {
            C29407b bVar = this.f97886b;
            Intrinsics.checkExpressionValueIsNotNull(bVar, "mChatModule");
            return bVar.mo104251d().mo120985a(str);
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38199b
        /* renamed from: b */
        public Message mo139603b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "messageId");
            C29407b bVar = this.f97886b;
            Intrinsics.checkExpressionValueIsNotNull(bVar, "mChatModule");
            return bVar.mo104258i().mo121080a(str);
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38199b
        /* renamed from: c */
        public Chat mo139604c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            C29407b bVar = this.f97886b;
            Intrinsics.checkExpressionValueIsNotNull(bVar, "mChatModule");
            return bVar.mo104251d().mo121056e(str);
        }

        C38185c(FileDetailModuleDependency fileDetailModuleDependency, C29407b bVar) {
            this.f97885a = fileDetailModuleDependency;
            this.f97886b = bVar;
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38199b
        /* renamed from: a */
        public void mo139602a(List<String> list, IGetDataCallback<List<Message>> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(list, "ids");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            C29407b bVar = this.f97886b;
            Intrinsics.checkExpressionValueIsNotNull(bVar, "mChatModule");
            bVar.mo104258i().mo121102a(list, iGetDataCallback);
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38199b
        /* renamed from: a */
        public void mo139600a(Context context, String str, int i) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "threadId");
            AbstractC39484a.m156004a().mo104207a(context, new C29604ae.C29606a().mo106670b(str).mo106662a(i).mo106671b(true).mo106674d("others").mo106679h(DesktopUtil.m144307b()).mo106668a());
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38199b
        /* renamed from: a */
        public void mo139601a(Context context, String str, String str2, int i) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(str2, "fromTag");
            AbstractC39484a.m156004a().mo104206a(context, ChatBundle.m109259a().mo105927a(str).mo105923a(ChatBundle.SourceType.SEARCH).mo105933c(str2).mo105920a(i).mo105929a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u0012\u001a\u00020\fH\u0016J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016R\u0016\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"com/ss/android/lark/filedetail/FileDetailModuleDependency$getDownloadFileMonitorDependency$1", "Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency$IDownloadFileMonitorDependency;", "mFileNetworkMonitor", "Lcom/ss/android/lark/biz/core/api/IDownloadFileNetworkMonitor;", "Lorg/jetbrains/annotations/NotNull;", "getMFileNetworkMonitor", "()Lcom/ss/android/lark/biz/core/api/IDownloadFileNetworkMonitor;", "addTask", "", "task", "Lcom/ss/android/lark/filedetail/dto/DownloadTaskDTO;", "getCurrentNetworkType", "", "context", "Landroid/content/Context;", "getDownloadTask", "Lcom/ss/android/lark/biz/core/api/DownloadTask;", "downloadTask", "getMaxAutoDownloadSize", "removeTask", "key", "", "msgId", "im_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.FileDetailModuleDependency$e */
    public static final class C38189e implements AbstractC38197a.AbstractC38201d {

        /* renamed from: a */
        final /* synthetic */ FileDetailModuleDependency f97891a;

        /* renamed from: b */
        private final AbstractC29572q f97892b;

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38201d
        /* renamed from: a */
        public int mo139617a() {
            return 104857600;
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38201d
        /* renamed from: a */
        public void mo139619a(C38212a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "task");
            this.f97892b.mo105816a(m150110b(aVar));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38189e(FileDetailModuleDependency fileDetailModuleDependency) {
            this.f97891a = fileDetailModuleDependency;
            ICoreApi mCoreApi = fileDetailModuleDependency.getMCoreApi();
            Intrinsics.checkExpressionValueIsNotNull(mCoreApi, "mCoreApi");
            AbstractC29572q networkMonitor = mCoreApi.getNetworkMonitor();
            Intrinsics.checkExpressionValueIsNotNull(networkMonitor, "mCoreApi.networkMonitor");
            this.f97892b = networkMonitor;
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38201d
        /* renamed from: a */
        public int mo139618a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            NetworkType a = this.f97892b.mo105815a(context);
            Intrinsics.checkExpressionValueIsNotNull(a, "mFileNetworkMonitor.getCurrentNetworkType(context)");
            return a.getNumber();
        }

        /* renamed from: b */
        private final C29556e m150110b(C38212a aVar) {
            C29556e eVar = null;
            if (aVar != null) {
                return C29556e.m109058a().mo105728a(aVar.mo139727h()).mo105732c(aVar.mo139725f()).mo105727a(aVar.mo139721b()).mo105733d(aVar.mo139724e()).mo105726a(aVar.mo139726g()).mo105730b(aVar.mo139722c()).mo105725a(aVar.mo139723d()).mo105731b(aVar.mo139728i()).mo105729a();
            }
            return eVar;
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38201d
        /* renamed from: a */
        public void mo139620a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(str2, "msgId");
            this.f97892b.mo105819a(str, str2);
        }
    }

    @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a
    public void addListenerToDriveSaveStateEventPush(AbstractC29625q qVar) {
        Intrinsics.checkParameterIsNotNull(qVar, "listener");
        this.mCCMApi.addListenerToDriveSaveStateEventPush(qVar);
    }

    @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a
    public boolean isFeatureGatingCurrentEnable(String str) {
        return C37239a.m146648b().mo136954b(str);
    }

    @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a
    public boolean isFeatureGatingEnable(String str) {
        return C37239a.m146648b().mo136951a(str);
    }

    @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a
    public void removeListenerToDriveSaveStateEventPush(AbstractC29625q qVar) {
        Intrinsics.checkParameterIsNotNull(qVar, "listener");
        this.mCCMApi.removeListenerToDriveSaveStateEventPush(qVar);
    }

    @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a
    public void addListenerToNetworkTypeDispatcher(AbstractC38215b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        C38183a aVar = new C38183a(bVar);
        this.sNetworkStateListenerMap.put(bVar, aVar);
        this.mCoreApi.registerNetworkStateListener(aVar);
    }

    @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a
    public void removeListenerToNetworkTypeDispatcher(AbstractC38215b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        AbstractC29572q.AbstractC29574b bVar2 = this.sNetworkStateListenerMap.get(bVar);
        this.sNetworkStateListenerMap.remove(bVar);
        if (bVar2 != null) {
            this.mCoreApi.unRegisterNetworkStateListener(bVar2);
        }
    }

    @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a
    public void showFullQuotoDialog(FragmentActivity fragmentActivity, FullQuotoConfig fullQuotoConfig) {
        this.mCCMApi.apiGroups().mo17150q().mo17077a(fragmentActivity, fullQuotoConfig);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u00032b\u0010\u0007\u001a^\u0012(\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\t0\t \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\t0\t\u0018\u00010\u00060\u0003 \u0005*.\u0012(\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\t0\t \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\t0\t\u0018\u00010\u00060\u0003\u0018\u00010\b0\bH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "messageIds", "", "", "kotlin.jvm.PlatformType", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/favorite/FavoriteMessageInfo;", "putFavoriteItems"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.FileDetailModuleDependency$g */
    static final class C38191g implements AbstractC38197a.AbstractC38203f {

        /* renamed from: a */
        public static final C38191g f97894a = new C38191g();

        C38191g() {
        }

        @Override // com.ss.android.lark.filedetail.p1885a.AbstractC38197a.AbstractC38203f
        /* renamed from: a */
        public final void mo139622a(List<String> list, IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback) {
            C37081c a = AbstractC39636b.m157290a();
            Intrinsics.checkExpressionValueIsNotNull(a, "FavoriteModuleProvider.getModule()");
            a.mo136709b().mo136714a(list, "", iGetDataCallback);
        }
    }
}
