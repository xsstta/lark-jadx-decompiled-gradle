package com.ss.android.lark.filedetail.impl.open.diver;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.basesdk.api.AbstractC4385i;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.OnlineOpenEntity;
import com.bytedance.ee.bear.drivesdk.action.ShowErrorPageAction;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.DownloadMenu;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.ForwardMenu;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.LookOverChatMenu;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.OpenExternalMenu;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.SaveToSpaceMenu;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.ICallback;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.FileState;
import com.ss.android.lark.filedetail.FileDetailModule;
import com.ss.android.lark.filedetail.dto.AbstractC38215b;
import com.ss.android.lark.filedetail.dto.C38212a;
import com.ss.android.lark.filedetail.dto.FileDetailLaunchParams;
import com.ss.android.lark.filedetail.impl.DownloadFileUtils;
import com.ss.android.lark.filedetail.impl.FileOpenDialogUtils;
import com.ss.android.lark.filedetail.impl.detail.listener.IPushMessageListener;
import com.ss.android.lark.filedetail.impl.detail.menu.FileMenuActionFactory;
import com.ss.android.lark.filedetail.impl.detail.menu.IFileMenuClickDependency;
import com.ss.android.lark.filedetail.impl.open.C38303c;
import com.ss.android.lark.filedetail.impl.open.OpenFileInfo;
import com.ss.android.lark.filedetail.p1885a.AbstractC38197a;
import com.ss.android.lark.filedetail.p1886b.C38210b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57881t;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000«\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011*\u0001'\u0018\u0000 R2\u00020\u0001:\u0001RB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010!H\u0002J\b\u0010,\u001a\u00020*H\u0002J \u0010-\u001a\u00020.2\u0016\u0010/\u001a\u0012\u0012\u0004\u0012\u00020100j\b\u0012\u0004\u0012\u000201`2H\u0002J\b\u00103\u001a\u00020*H\u0002J\b\u00104\u001a\u00020#H\u0002J\b\u00105\u001a\u00020*H\u0002J\n\u00106\u001a\u0004\u0018\u00010\rH\u0002J\b\u00107\u001a\u00020\rH\u0002J\b\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u00020;H\u0002J\u0018\u0010<\u001a\u0012\u0012\u0004\u0012\u00020100j\b\u0012\u0004\u0012\u000201`2H\u0002J\b\u0010=\u001a\u00020\u001bH\u0002J\b\u0010>\u001a\u00020?H\u0002J\u0010\u0010@\u001a\u00020*2\u0006\u0010A\u001a\u00020BH\u0002J\b\u0010C\u001a\u00020#H\u0002J\b\u0010D\u001a\u00020*H\u0002J\u0006\u0010E\u001a\u00020*J\b\u0010F\u001a\u00020*H\u0002J\b\u0010G\u001a\u00020*H\u0002J\b\u0010H\u001a\u00020*H\u0002J\u001c\u0010I\u001a\u00020*2\b\u0010J\u001a\u0004\u0018\u00010!2\b\b\u0001\u0010K\u001a\u00020\u001fH\u0002J\u0018\u0010L\u001a\u00020*2\u0006\u0010M\u001a\u00020\r2\u0006\u0010N\u001a\u00020#H\u0002J\b\u0010O\u001a\u00020*H\u0002J\u0010\u0010P\u001a\u00020*2\u0006\u0010Q\u001a\u00020!H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u00020'X\u0004¢\u0006\u0004\n\u0002\u0010(¨\u0006S"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/open/diver/PreviewTask;", "", "mDriverSdk", "Lcom/bytedance/ee/bear/basesdk/api/IDriveSdk;", "mParams", "Lcom/ss/android/lark/filedetail/dto/FileDetailLaunchParams;", "(Lcom/bytedance/ee/bear/basesdk/api/IDriveSdk;Lcom/ss/android/lark/filedetail/dto/FileDetailLaunchParams;)V", "mCallbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "mContext", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "mDownloadMenu", "Lcom/bytedance/ee/bear/drivesdk/plugin/model/menu/DownloadMenu;", "mDownloadService", "Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency$IDownloadDependency;", "mLifecycleCallback", "Lcom/ss/android/lark/filedetail/impl/open/diver/IPreviewLifecycleCallback;", "getMLifecycleCallback", "()Lcom/ss/android/lark/filedetail/impl/open/diver/IPreviewLifecycleCallback;", "setMLifecycleCallback", "(Lcom/ss/android/lark/filedetail/impl/open/diver/IPreviewLifecycleCallback;)V", "mMenuClickDependency", "Lcom/ss/android/lark/filedetail/impl/detail/menu/IFileMenuClickDependency;", "mNetworkTypeListener", "Lcom/ss/android/lark/filedetail/impl/open/diver/NetworkTypeListenerWrapper;", "mOpenExternalMenu", "Lcom/bytedance/ee/bear/drivesdk/plugin/model/menu/OpenExternalMenu;", "getMParams", "()Lcom/ss/android/lark/filedetail/dto/FileDetailLaunchParams;", "mState", "", "mUniqueId", "", "mViewClosed", "", "pushMergeMessageListener", "Lcom/ss/android/lark/filedetail/impl/detail/listener/IPushMessageListener;", "pushMessageListener", "com/ss/android/lark/filedetail/impl/open/diver/PreviewTask$pushMessageListener$1", "Lcom/ss/android/lark/filedetail/impl/open/diver/PreviewTask$pushMessageListener$1;", "addDownloadStateMonitor", "", "downloadPath", "addNetworkStateListener", "buildOpenEntity", "Lcom/bytedance/ee/bear/contract/drive/sdk/entity/open/OnlineOpenEntity;", "items", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/contract/drive/sdk/entity/menu/BaseMoreMenuAction;", "Lkotlin/collections/ArrayList;", "cancelDownload", "checkDownloadComplete", "finishTask", "getCurrentDownloadMenu", "getDownloadMenuItem", "getForwardMenuItem", "Lcom/bytedance/ee/bear/drivesdk/plugin/model/menu/ForwardMenu;", "getJump2ChatMenuItem", "Lcom/bytedance/ee/bear/drivesdk/plugin/model/menu/LookOverChatMenu;", "getMenuItems", "getOpenByOtherAppMenuItem", "getSaveToDriverMenuItem", "Lcom/bytedance/ee/bear/drivesdk/plugin/model/menu/SaveToSpaceMenu;", "handleDeleteMessage", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "isDownloading", "openFileByOtherApp", "previewFile", "registerPushMessage", "removeNetworkStateListener", "restoreDownloadProgress", "showErrorPage", "text", "errorIconId", "startDownload", "downloadMenu", "isOpenByOtherApp", "unregisterPushMessage", "updateFileContent", "filePath", "Companion", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.open.diver.f */
public final class PreviewTask {

    /* renamed from: i */
    public static final Companion f98362i = new Companion(null);

    /* renamed from: a */
    public final AbstractC38197a.AbstractC38200c f98363a;

    /* renamed from: b */
    public final WeakReference<Context> f98364b;

    /* renamed from: c */
    public OpenExternalMenu f98365c;

    /* renamed from: d */
    public DownloadMenu f98366d;

    /* renamed from: e */
    public String f98367e;

    /* renamed from: f */
    public int f98368f;

    /* renamed from: g */
    public boolean f98369g;

    /* renamed from: h */
    public IFileMenuClickDependency f98370h;

    /* renamed from: j */
    private IPreviewLifecycleCallback f98371j;

    /* renamed from: k */
    private final CallbackManager f98372k;

    /* renamed from: l */
    private final C38311d f98373l;

    /* renamed from: m */
    private IPushMessageListener f98374m;

    /* renamed from: n */
    private NetworkTypeListenerWrapper f98375n;

    /* renamed from: o */
    private final AbstractC4385i f98376o;

    /* renamed from: p */
    private final FileDetailLaunchParams f98377p;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/open/diver/PreviewTask$Companion;", "", "()V", "CHAT_ID_KEY", "", "MESSAGE_ID_KEY", "SOURCE_RESOURCE_CLEARED_10006", "", "STATIC_RESOURCE_IS_DELETED_BY_ADMIN", "STATIC_RESOURCE_IS_FROZEN_BY_ADMIN", "TAG", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.open.diver.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final IPreviewLifecycleCallback mo140085a() {
        return this.f98371j;
    }

    /* renamed from: h */
    public final FileDetailLaunchParams mo140097h() {
        return this.f98377p;
    }

    /* renamed from: m */
    private final ForwardMenu m150737m() {
        return new ForwardMenu(new PreviewTask$getForwardMenuItem$1(this));
    }

    /* renamed from: n */
    private final SaveToSpaceMenu m150738n() {
        SaveToSpaceMenu saveToSpaceMenu = new SaveToSpaceMenu();
        saveToSpaceMenu.mo29769a(new PreviewTask$getSaveToDriverMenuItem$1(this));
        return saveToSpaceMenu;
    }

    /* renamed from: q */
    private final LookOverChatMenu m150741q() {
        return new LookOverChatMenu(new PreviewTask$getJump2ChatMenuItem$1(this));
    }

    /* renamed from: t */
    private final void m150744t() {
        AbstractC38197a a = FileDetailModule.f97880b.mo139564a();
        if (a != null) {
            a.removeListenerToNetworkTypeDispatcher(this.f98375n);
        }
    }

    /* renamed from: c */
    public final boolean mo140092c() {
        int i = this.f98368f;
        if (i == 1 || i == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private final OpenExternalMenu m150739o() {
        OpenExternalMenu openExternalMenu = new OpenExternalMenu((BinderMenuAction) null);
        openExternalMenu.mo29734a(new PreviewTask$getOpenByOtherAppMenuItem$1(this, openExternalMenu), new PreviewTask$getOpenByOtherAppMenuItem$2(this));
        return openExternalMenu;
    }

    /* renamed from: p */
    private final DownloadMenu m150740p() {
        DownloadMenu downloadMenu = new DownloadMenu();
        downloadMenu.mo29734a(new PreviewTask$getDownloadMenuItem$1(this, downloadMenu), new PreviewTask$getDownloadMenuItem$2(this));
        return downloadMenu;
    }

    /* renamed from: d */
    public final void mo140093d() {
        IPreviewLifecycleCallback dVar = this.f98371j;
        if (dVar != null) {
            dVar.mo140083a();
        }
        this.f98372k.cancelCallbacks();
        m150744t();
        m150734j();
    }

    /* renamed from: f */
    public final DownloadMenu mo140095f() {
        int i = this.f98368f;
        if (i == 1 || i == 2) {
            return this.f98366d;
        }
        if (i == 5 || i == 6) {
            return this.f98365c;
        }
        return null;
    }

    /* renamed from: g */
    public final void mo140096g() {
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(new RunnableC38310c(this));
    }

    /* renamed from: r */
    private final boolean m150742r() {
        if (this.f98377p.getFileContent().getFileState() != FileState.DONE || TextUtils.isEmpty(this.f98377p.getFileContent().getFilePath())) {
            return false;
        }
        return new File(this.f98377p.getFileContent().getFilePath()).exists();
    }

    /* renamed from: s */
    private final void m150743s() {
        NetworkTypeListenerWrapper eVar = new NetworkTypeListenerWrapper(new C38309b(this));
        this.f98375n = eVar;
        this.f98372k.addCancelableCallback(eVar);
        AbstractC38197a a = FileDetailModule.f97880b.mo139564a();
        if (a != null) {
            a.addListenerToNetworkTypeDispatcher(this.f98375n);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.open.diver.f$c */
    public static final class RunnableC38310c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PreviewTask f98379a;

        RunnableC38310c(PreviewTask fVar) {
            this.f98379a = fVar;
        }

        public final void run() {
            File file = new File(C57881t.m224631d(C38303c.m150711a(this.f98379a.mo140097h().getFileContent().getFilePath()), this.f98379a.mo140097h().getFileContent().getName()));
            Context context = this.f98379a.f98364b.get();
            if (context != null) {
                C38303c.m150712a(context, file, this.f98379a.mo140097h().getFileContent().getMime(), this.f98379a.mo140097h().getFileContent().getKey());
            }
        }
    }

    /* renamed from: j */
    private final void m150734j() {
        AbstractC38197a a;
        AbstractC38197a.AbstractC38206i pushDependency;
        AbstractC38197a.AbstractC38206i pushDependency2;
        String str;
        if (!this.f98377p.isFromFolderManage() && this.f98377p.getFrom() != ((long) 6)) {
            AbstractC38197a a2 = FileDetailModule.f97880b.mo139564a();
            if (!(a2 == null || (pushDependency2 = a2.getPushDependency()) == null)) {
                String valueOf = String.valueOf(hashCode());
                Message message = this.f98377p.getMessage();
                if (message == null || (str = message.getChatId()) == null) {
                    str = this.f98377p.getChatId();
                }
                pushDependency2.mo139629b(valueOf, str, this.f98373l);
            }
            IPushMessageListener aVar = this.f98374m;
            if (aVar != null && (a = FileDetailModule.f97880b.mo139564a()) != null && (pushDependency = a.getPushDependency()) != null) {
                pushDependency.mo139628a(String.valueOf(this.f98377p.getMergeMsgId().hashCode()), this.f98377p.getMergeMsgChatId(), aVar);
            }
        }
    }

    /* renamed from: k */
    private final void m150735k() {
        int i;
        OpenExternalMenu openExternalMenu;
        AbstractC38197a.AbstractC38200c downloadDependency;
        if (mo140092c()) {
            AbstractC38197a a = FileDetailModule.f97880b.mo139564a();
            if (a == null || (downloadDependency = a.getDownloadDependency()) == null) {
                i = 0;
            } else {
                i = downloadDependency.mo139605a(this.f98377p.getFileContent().getKey());
            }
            if (this.f98368f == 5) {
                openExternalMenu = this.f98365c;
            } else {
                openExternalMenu = this.f98366d;
            }
            if (openExternalMenu != null) {
                Log.m165389i("PreviewTask", "restore progress:" + i);
                openExternalMenu.mo29736a(this.f98367e);
                openExternalMenu.mo29737a(this.f98367e, i);
            }
        }
    }

    /* renamed from: l */
    private final ArrayList<BaseMoreMenuAction> m150736l() {
        ArrayList<BaseMoreMenuAction> arrayList = new ArrayList<>();
        OpenExternalMenu o = m150739o();
        this.f98365c = o;
        if (o != null) {
            arrayList.add(o);
        }
        if (!this.f98377p.getFileContent().isFromDrive() && (this.f98377p.getMenuFlag() & 1) > 0) {
            arrayList.add(m150738n());
        }
        DownloadMenu p = m150740p();
        this.f98366d = p;
        if (p != null) {
            arrayList.add(p);
        }
        if ((this.f98377p.getMenuFlag() & 2) > 0) {
            arrayList.add(m150737m());
        }
        if (this.f98377p.getJumpPosition() != -1) {
            arrayList.add(m150741q());
        }
        return arrayList;
    }

    /* renamed from: e */
    public final void mo140094e() {
        Log.m165389i("PreviewTask", "cancel download");
        this.f98368f = 4;
        DownloadMenu downloadMenu = this.f98366d;
        if (downloadMenu != null) {
            downloadMenu.mo29739b(this.f98367e);
        }
        OpenExternalMenu openExternalMenu = this.f98365c;
        if (openExternalMenu != null) {
            openExternalMenu.mo29739b(this.f98367e);
        }
        if (this.f98377p.getMessage() != null) {
            AbstractC38197a.AbstractC38200c cVar = this.f98363a;
            if (cVar != null) {
                String messageId = this.f98377p.getMessageId();
                String key = this.f98377p.getFileContent().getKey();
                String sourceId = this.f98377p.getMessage().getSourceId();
                Message.SourceType sourceType = this.f98377p.getMessage().getSourceType();
                Intrinsics.checkExpressionValueIsNotNull(sourceType, "mParams.message.sourceType");
                cVar.mo139612a(messageId, key, sourceId, sourceType.getNumber());
                return;
            }
            return;
        }
        AbstractC38197a.AbstractC38200c cVar2 = this.f98363a;
        if (cVar2 != null) {
            cVar2.mo139608a(this.f98377p.getMessageId(), this.f98377p.getFileContent().getKey());
        }
    }

    /* renamed from: i */
    private final void m150733i() {
        AbstractC38197a.AbstractC38206i pushDependency;
        AbstractC38197a.AbstractC38206i pushDependency2;
        String str;
        if (!this.f98377p.isFromFolderManage() && this.f98377p.getFrom() != ((long) 6)) {
            AbstractC38197a a = FileDetailModule.f97880b.mo139564a();
            if (!(a == null || (pushDependency2 = a.getPushDependency()) == null)) {
                String valueOf = String.valueOf(hashCode());
                Message message = this.f98377p.getMessage();
                if (message == null || (str = message.getChatId()) == null) {
                    str = this.f98377p.getChatId();
                }
                pushDependency2.mo139628a(valueOf, str, this.f98373l);
            }
            if (!TextUtils.isEmpty(this.f98377p.getMergeMsgId())) {
                this.f98374m = new C38312e(this);
                Log.m165389i("PreviewTask", "register merge msg chat listener");
                AbstractC38197a a2 = FileDetailModule.f97880b.mo139564a();
                if (a2 != null && (pushDependency = a2.getPushDependency()) != null) {
                    pushDependency.mo139628a(String.valueOf(this.f98377p.getMergeMsgId().hashCode()), this.f98377p.getMergeMsgChatId(), this.f98374m);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo140091b() {
        AbstractC38197a.AbstractC38200c downloadDependency;
        String str;
        Message.SourceType sourceType;
        IFileMenuClickDependency bVar;
        if (!this.f98369g) {
            Log.m165389i("PreviewTask", "new preview file!");
        } else {
            Log.m165389i("PreviewTask", "view reopened!");
        }
        int i = 0;
        this.f98369g = false;
        OpenFileInfo a = new OpenFileInfo.C38278a().mo140017a(this.f98377p.getFileContent()).mo140018a(this.f98377p.getMessageId()).mo140020b(this.f98377p.getChatId()).mo140021c(this.f98377p.getThreadId()).mo140015a(this.f98377p.getJumpPosition()).mo140016a(this.f98377p.getFavoriteMessage()).mo140022d(this.f98377p.getOriginMergeForwardId()).mo140019a();
        Context context = this.f98364b.get();
        if (context != null) {
            if (this.f98377p.isFromFolderManage()) {
                FileMenuActionFactory aVar = FileMenuActionFactory.f98063a;
                Intrinsics.checkExpressionValueIsNotNull(context, "it");
                Intrinsics.checkExpressionValueIsNotNull(a, "menuParams");
                bVar = aVar.mo139826b(context, a);
            } else {
                FileMenuActionFactory aVar2 = FileMenuActionFactory.f98063a;
                Intrinsics.checkExpressionValueIsNotNull(context, "it");
                Intrinsics.checkExpressionValueIsNotNull(a, "menuParams");
                bVar = aVar2.mo139824a(context, a);
            }
            this.f98370h = bVar;
        }
        this.f98376o.mo17059a(m150731a(m150736l()));
        m150735k();
        AbstractC38197a a2 = FileDetailModule.f97880b.mo139564a();
        if (a2 != null && (downloadDependency = a2.getDownloadDependency()) != null) {
            String messageId = this.f98377p.getMessageId();
            Message message = this.f98377p.getMessage();
            if (message != null) {
                str = message.getSourceId();
            } else {
                str = null;
            }
            Message message2 = this.f98377p.getMessage();
            if (!(message2 == null || (sourceType = message2.getSourceType()) == null)) {
                i = sourceType.getNumber();
            }
            downloadDependency.mo139610a(messageId, str, i, (IGetDataCallback<com.ss.android.lark.filedetail.dto.FileState>) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/filedetail/impl/open/diver/PreviewTask$pushMessageListener$1", "Lcom/ss/android/lark/filedetail/impl/detail/listener/IPushMessageListener;", "onPushMessage", "", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.open.diver.f$d */
    public static final class C38311d implements IPushMessageListener {

        /* renamed from: a */
        final /* synthetic */ PreviewTask f98380a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38311d(PreviewTask fVar) {
            this.f98380a = fVar;
        }

        @Override // com.ss.android.lark.filedetail.impl.detail.listener.IPushMessageListener
        public void onPushMessage(MessageInfo messageInfo) {
            Intrinsics.checkParameterIsNotNull(messageInfo, "messageInfo");
            this.f98380a.mo140087a(messageInfo);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/filedetail/impl/open/diver/PreviewTask$registerPushMessage$1", "Lcom/ss/android/lark/filedetail/impl/detail/listener/IPushMessageListener;", "onPushMessage", "", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.open.diver.f$e */
    public static final class C38312e implements IPushMessageListener {

        /* renamed from: a */
        final /* synthetic */ PreviewTask f98381a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38312e(PreviewTask fVar) {
            this.f98381a = fVar;
        }

        @Override // com.ss.android.lark.filedetail.impl.detail.listener.IPushMessageListener
        public void onPushMessage(MessageInfo messageInfo) {
            Intrinsics.checkParameterIsNotNull(messageInfo, "messageInfo");
            this.f98381a.mo140087a(messageInfo);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/filedetail/impl/open/diver/PreviewTask$startDownload$downloadCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.open.diver.f$h */
    public static final class C38315h implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ UIGetDataCallback f98390a;

        C38315h(UIGetDataCallback uIGetDataCallback) {
            this.f98390a = uIGetDataCallback;
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            boolean z;
            Log.m165389i("PreviewTask", "download callback success, path:" + str);
            String a = C38303c.m150711a(str);
            String str2 = a;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f98390a.onSuccess(str);
            } else {
                this.f98390a.onSuccess(a);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("PreviewTask", "download callback fail, error:" + errorResult.getDebugMsg());
            this.f98390a.onError(errorResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/filedetail/impl/open/diver/PreviewTask$startDownload$progressCallback$1", "Lcom/ss/android/lark/filedetail/impl/open/diver/IDownloadProgressCallback;", "onUpdateProgress", "", "total", "", "curPos", "", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.open.diver.f$i */
    public static final class C38316i implements IDownloadProgressCallback {

        /* renamed from: a */
        final /* synthetic */ PreviewTask f98391a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38316i(PreviewTask fVar) {
            this.f98391a = fVar;
        }

        @Override // com.ss.android.lark.filedetail.impl.open.diver.IDownloadProgressCallback
        /* renamed from: a */
        public void mo140075a(long j, int i) {
            if (!this.f98391a.f98369g && j > 0) {
                int i2 = (int) ((((long) i) * 100) / j);
                this.f98391a.mo140097h().getFileContent().setProgress(i2);
                DownloadMenu f = this.f98391a.mo140095f();
                if (f != null) {
                    f.mo29736a(this.f98391a.f98367e);
                    f.mo29737a(this.f98391a.f98367e, i2);
                }
                Log.m165389i("PreviewTask", "progress:" + i2);
            }
        }
    }

    /* renamed from: a */
    public final void mo140088a(IPreviewLifecycleCallback dVar) {
        this.f98371j = dVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/filedetail/FileDetailModule$NetworkType;", "kotlin.jvm.PlatformType", "currentNetworkType"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.open.diver.f$b */
    public static final class C38309b implements AbstractC38215b {

        /* renamed from: a */
        final /* synthetic */ PreviewTask f98378a;

        C38309b(PreviewTask fVar) {
            this.f98378a = fVar;
        }

        @Override // com.ss.android.lark.filedetail.dto.AbstractC38215b
        /* renamed from: a */
        public final void mo139738a(FileDetailModule.NetworkType networkType) {
            OpenExternalMenu openExternalMenu;
            boolean z;
            if (networkType == FileDetailModule.NetworkType.NO_INTERNET_CONNECTION) {
                return;
            }
            if (this.f98378a.f98368f == 2 || this.f98378a.f98368f == 6) {
                if (this.f98378a.f98368f == 2) {
                    openExternalMenu = this.f98378a.f98366d;
                } else {
                    openExternalMenu = this.f98378a.f98365c;
                }
                if (openExternalMenu != null) {
                    PreviewTask fVar = this.f98378a;
                    if (fVar.f98368f == 6) {
                        z = true;
                    } else {
                        z = false;
                    }
                    fVar.mo140086a(openExternalMenu, z);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/filedetail/impl/open/diver/PreviewTask$startDownload$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.open.diver.f$g */
    public static final class C38314g implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ PreviewTask f98386a;

        /* renamed from: b */
        final /* synthetic */ String f98387b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f98388c;

        /* renamed from: d */
        final /* synthetic */ AbstractC25974h f98389d;

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            this.f98386a.f98363a.mo139607a(this.f98386a.f98364b.get(), this.f98386a.mo140097h().getMessageId(), this.f98386a.mo140097h().getFileContent().getKey(), this.f98387b, this.f98388c, this.f98389d);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("PreviewTask", "cancel download fail:" + errorResult.getDebugMsg());
            this.f98386a.f98363a.mo139607a(this.f98386a.f98364b.get(), this.f98386a.mo140097h().getMessageId(), this.f98386a.mo140097h().getFileContent().getKey(), this.f98387b, this.f98388c, this.f98389d);
        }

        C38314g(PreviewTask fVar, String str, IGetDataCallback iGetDataCallback, AbstractC25974h hVar) {
            this.f98386a = fVar;
            this.f98387b = str;
            this.f98388c = iGetDataCallback;
            this.f98389d = hVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/filedetail/impl/open/diver/PreviewTask$startDownload$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.open.diver.f$f */
    public static final class C38313f implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ PreviewTask f98382a;

        /* renamed from: b */
        final /* synthetic */ String f98383b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f98384c;

        /* renamed from: d */
        final /* synthetic */ AbstractC25974h f98385d;

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            AbstractC38197a.AbstractC38200c cVar = this.f98382a.f98363a;
            Context context = this.f98382a.f98364b.get();
            String messageId = this.f98382a.mo140097h().getMessageId();
            String sourceId = this.f98382a.mo140097h().getMessage().getSourceId();
            String chatId = this.f98382a.mo140097h().getMessage().getChatId();
            Message.SourceType sourceType = this.f98382a.mo140097h().getMessage().getSourceType();
            Intrinsics.checkExpressionValueIsNotNull(sourceType, "mParams.message.sourceType");
            cVar.mo139606a(context, messageId, sourceId, chatId, sourceType.getNumber(), this.f98382a.mo140097h().getDownloadFileScene(), this.f98382a.mo140097h().getFileContent().getKey(), this.f98383b, this.f98384c, this.f98385d);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("PreviewTask", "cancel download fail:" + errorResult.getDebugMsg());
            AbstractC38197a.AbstractC38200c cVar = this.f98382a.f98363a;
            Context context = this.f98382a.f98364b.get();
            String messageId = this.f98382a.mo140097h().getMessageId();
            String sourceId = this.f98382a.mo140097h().getMessage().getSourceId();
            String chatId = this.f98382a.mo140097h().getMessage().getChatId();
            Message.SourceType sourceType = this.f98382a.mo140097h().getMessage().getSourceType();
            Intrinsics.checkExpressionValueIsNotNull(sourceType, "mParams.message.sourceType");
            cVar.mo139606a(context, messageId, sourceId, chatId, sourceType.getNumber(), this.f98382a.mo140097h().getDownloadFileScene(), this.f98382a.mo140097h().getFileContent().getKey(), this.f98383b, this.f98384c, this.f98385d);
        }

        C38313f(PreviewTask fVar, String str, IGetDataCallback iGetDataCallback, AbstractC25974h hVar) {
            this.f98382a = fVar;
            this.f98383b = str;
            this.f98384c = iGetDataCallback;
            this.f98385d = hVar;
        }
    }

    /* renamed from: a */
    private final OnlineOpenEntity m150731a(ArrayList<BaseMoreMenuAction> arrayList) {
        String str;
        if (TextUtils.isEmpty(this.f98377p.getMergeMsgId())) {
            str = this.f98377p.getMessageId();
        } else {
            str = this.f98377p.getMergeMsgId();
        }
        String jSONObject = new JSONObject().put("msg_id", str).put("chat_id", this.f98377p.getChatId()).toString();
        Intrinsics.checkExpressionValueIsNotNull(jSONObject, "JSONObject()\n           …)\n            .toString()");
        OnlineOpenEntity onlineOpenEntity = new OnlineOpenEntity("1001", this.f98377p.getFileContent().getName(), this.f98367e, arrayList, this.f98377p.getFileContent().getKey(), jSONObject, false);
        onlineOpenEntity.setBinderOpenLifecycle(new PreviewTask$buildOpenEntity$1(this));
        return onlineOpenEntity;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/filedetail/impl/open/diver/PreviewTask$startDownload$uiDownloadCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "filePath", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.open.diver.f$k */
    public static final class C38318k implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ PreviewTask f98393a;

        /* renamed from: b */
        final /* synthetic */ boolean f98394b;

        /* renamed from: a */
        public void onSuccess(String str) {
            int i;
            OpenExternalMenu openExternalMenu;
            Intrinsics.checkParameterIsNotNull(str, "filePath");
            this.f98393a.mo140089a(str);
            PreviewTask fVar = this.f98393a;
            String str2 = str;
            if (TextUtils.isEmpty(str2)) {
                i = 0;
            } else {
                i = 3;
            }
            fVar.f98368f = i;
            if (this.f98393a.f98369g) {
                Log.m165389i("PreviewTask", "download success,preview closed! finish task");
                this.f98393a.mo140093d();
                return;
            }
            if (this.f98394b) {
                openExternalMenu = this.f98393a.f98365c;
            } else {
                openExternalMenu = this.f98393a.f98366d;
            }
            if (TextUtils.isEmpty(str2)) {
                Log.m165389i("PreviewTask", "reset progress to zero");
                if (openExternalMenu != null) {
                    openExternalMenu.mo29737a(this.f98393a.f98367e, 0);
                }
            } else if (new File(str).exists()) {
                Log.m165389i("PreviewTask", "download success!");
                if (openExternalMenu != null) {
                    openExternalMenu.mo29737a(this.f98393a.f98367e, 100);
                    openExternalMenu.mo29739b(this.f98393a.f98367e);
                } else {
                    Log.m165397w("PreviewTask", "menu is null");
                }
                if (this.f98394b) {
                    Log.m165389i("PreviewTask", "open file by other app");
                    this.f98393a.mo140096g();
                    return;
                }
                Log.m165389i("PreviewTask", "show toast!");
                LKUIToast.enableToast();
                if (this.f98393a.f98364b.get() != null) {
                    LKUIToast.show(this.f98393a.f98364b.get(), UIUtils.getString(this.f98393a.f98364b.get(), R.string.Lark_File_DownloadSuccessInPreview));
                } else {
                    Log.m165397w("PreviewTask", "not showing toast due to context is null");
                }
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            int i;
            String str;
            Context context;
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165386e("PreviewTask", errorResult);
            this.f98393a.mo140089a("");
            if (this.f98393a.f98368f == 4) {
                Log.m165389i("PreviewTask", "cancel download failed!");
                return;
            }
            PreviewTask fVar = this.f98393a;
            if (this.f98394b) {
                i = 6;
            } else {
                i = 2;
            }
            fVar.f98368f = i;
            if (this.f98393a.f98369g) {
                Log.m165383e("PreviewTask", "download error, preview closed!! finish task");
                this.f98393a.mo140093d();
                return;
            }
            DownloadMenu f = this.f98393a.mo140095f();
            Context context2 = this.f98393a.f98364b.get();
            String str2 = null;
            if (context2 != null) {
                str = C57582a.m223604a(context2, (int) R.string.Lark_Legacy_FileDownloadFail);
            } else {
                str = null;
            }
            if (errorResult.getErrorCode() == 410 || errorResult.getErrorCode() == 10006) {
                Message message = this.f98393a.mo140097h().getMessage();
                if (message != null) {
                    message.setSourceFileDelete(true);
                }
                Context context3 = this.f98393a.f98364b.get();
                if (context3 != null) {
                    str2 = C57582a.m223604a(context3, (int) R.string.Lark_Legacy_FileHasBeenRecalledCanNotDownload);
                }
                C38210b.m150165a(this.f98393a.mo140097h().getMessage());
                this.f98393a.mo140090a(str2, R.drawable.icon_common_loading_failed);
                str = str2;
            } else if (errorResult.getErrorCode() == 5601) {
                Context context4 = this.f98393a.f98364b.get();
                if (context4 != null) {
                    Intrinsics.checkExpressionValueIsNotNull(context4, "it");
                    FileOpenDialogUtils.m150338a(context4, false);
                }
            } else if (errorResult.getErrorCode() == 5602 && (context = this.f98393a.f98364b.get()) != null) {
                Intrinsics.checkExpressionValueIsNotNull(context, "it");
                FileOpenDialogUtils.m150338a(context, true);
            }
            if (f != null) {
                f.mo29738a(this.f98393a.f98367e, str);
            }
        }

        C38318k(PreviewTask fVar, boolean z) {
            this.f98393a = fVar;
            this.f98394b = z;
        }
    }

    /* renamed from: b */
    private final void m150732b(String str) {
        String str2;
        Message.SourceType sourceType;
        boolean z;
        AbstractC38197a.AbstractC38201d downloadFileMonitorDependency;
        Message message = this.f98377p.getMessage();
        if (message == null || (str2 = message.getSourceId()) == null) {
            str2 = "";
        }
        Message message2 = this.f98377p.getMessage();
        if (message2 != null) {
            sourceType = message2.getSourceType();
        } else {
            sourceType = null;
        }
        if (this.f98377p.isSecret()) {
            str = null;
        }
        C38212a.C38214a a = C38212a.m150238a();
        int i = 0;
        if (this.f98377p.getMessage() != null) {
            z = true;
        } else {
            z = false;
        }
        C38212a.C38214a b = a.mo139732a(z).mo139736c(this.f98377p.getFileContent().getKey()).mo139731a(this.f98377p.getMessageId()).mo139737d(str).mo139730a(this.f98377p.getFileContent().getSize()).mo139734b(str2);
        if (sourceType != null) {
            i = sourceType.getNumber();
        }
        C38212a a2 = b.mo139729a(i).mo139735b(true).mo139733a();
        AbstractC38197a a3 = FileDetailModule.f97880b.mo139564a();
        if (a3 != null && (downloadFileMonitorDependency = a3.getDownloadFileMonitorDependency()) != null) {
            downloadFileMonitorDependency.mo139619a(a2);
        }
    }

    /* renamed from: a */
    public final void mo140087a(MessageInfo messageInfo) {
        Message message = messageInfo.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
        Log.m165379d("PreviewTask", "push message id:" + message.getId() + " current message id:" + this.f98377p.getMessageId() + " mergeMsgId:" + this.f98377p.getMergeMsgId());
        if (TextUtils.equals(this.f98377p.getMessageId(), message.getId()) || TextUtils.equals(this.f98377p.getMergeMsgId(), message.getId())) {
            Log.m165389i("PreviewTask", "push message status:" + message.getStatus() + " isStaticResourceMessageRecalled:" + message.isSourceFileDelete());
            if (message.getStatus() == Message.Status.DELETED || message.isSourceFileDelete()) {
                mo140094e();
                Context context = this.f98364b.get();
                if (context != null) {
                    mo140090a(C57582a.m223604a(context, (int) R.string.Lark_Legacy_FileHasBeenRecalledCanNotDownload), R.drawable.illustration_placeholder_common_load_failed);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo140089a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f98377p.getFileContent().setFileState(FileState.DOWNLOAD);
        } else if (new File(str).exists()) {
            Log.m165389i("PreviewTask", "update FileContent to Done, path:" + str);
            this.f98377p.getFileContent().setProgress(100);
            this.f98377p.getFileContent().setFilePath(str);
            this.f98377p.getFileContent().setFileState(FileState.DONE);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "total", "", "curPos", "", "onUpdateProgress"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.open.diver.f$j */
    public static final class C38317j implements AbstractC25974h {

        /* renamed from: a */
        final /* synthetic */ DownloadProgressCallbackWrap f98392a;

        C38317j(DownloadProgressCallbackWrap aVar) {
            this.f98392a = aVar;
        }

        @Override // com.larksuite.framework.callback.AbstractC25974h
        public final void onUpdateProgress(long j, int i) {
            this.f98392a.mo140075a(j, i);
        }
    }

    /* renamed from: a */
    public final void mo140090a(String str, int i) {
        ShowErrorPageAction showErrorPageAction = new ShowErrorPageAction(str, i, true);
        showErrorPageAction.mo29723a(true);
        this.f98376o.mo17060a(this.f98367e, showErrorPageAction);
    }

    public PreviewTask(AbstractC4385i iVar, FileDetailLaunchParams fileDetailLaunchParams) {
        AbstractC38197a.AbstractC38200c cVar;
        Intrinsics.checkParameterIsNotNull(iVar, "mDriverSdk");
        Intrinsics.checkParameterIsNotNull(fileDetailLaunchParams, "mParams");
        this.f98376o = iVar;
        this.f98377p = fileDetailLaunchParams;
        AbstractC38197a a = FileDetailModule.f97880b.mo139564a();
        Context context = null;
        if (a != null) {
            cVar = a.getDownloadDependency();
        } else {
            cVar = null;
        }
        this.f98363a = cVar;
        AbstractC38197a a2 = FileDetailModule.f97880b.mo139564a();
        this.f98364b = new WeakReference<>(a2 != null ? a2.getContext() : context);
        this.f98372k = new CallbackManager();
        this.f98373l = new C38311d(this);
        m150733i();
        this.f98367e = fileDetailLaunchParams.getFileContent().getKey();
        m150743s();
    }

    /* renamed from: a */
    public final void mo140086a(DownloadMenu downloadMenu, boolean z) {
        int i;
        Context context;
        if (mo140092c()) {
            Log.m165389i("PreviewTask", "already downloading");
        } else if (!m150742r() || !z) {
            String str = null;
            if (!this.f98377p.isSecret() && (context = this.f98364b.get()) != null) {
                str = DownloadFileUtils.m150309a(context, this.f98377p.getFileContent().getName());
            }
            Log.m165389i("PreviewTask", "download path given to sdk: " + str);
            UIGetDataCallback wrapAndAddGetDataCallback = this.f98372k.wrapAndAddGetDataCallback(new C38318k(this, z));
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "mCallbackManager.wrapAnd…\n            }\n        })");
            ICallback wrapAndAddCallback = this.f98372k.wrapAndAddCallback(new C38315h(wrapAndAddGetDataCallback));
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddCallback, "mCallbackManager.wrapAnd…\n            }\n        })");
            IGetDataCallback iGetDataCallback = (IGetDataCallback) wrapAndAddCallback;
            DownloadProgressCallbackWrap aVar = new DownloadProgressCallbackWrap(new C38316i(this));
            this.f98372k.addCancelableCallback(aVar);
            C38317j jVar = new C38317j(aVar);
            if (this.f98377p.getMessage() != null) {
                AbstractC38197a.AbstractC38200c cVar = this.f98363a;
                if (cVar != null) {
                    String messageId = this.f98377p.getMessageId();
                    String key = this.f98377p.getFileContent().getKey();
                    String sourceId = this.f98377p.getMessage().getSourceId();
                    Message.SourceType sourceType = this.f98377p.getMessage().getSourceType();
                    Intrinsics.checkExpressionValueIsNotNull(sourceType, "mParams.message.sourceType");
                    cVar.mo139613a(messageId, key, sourceId, sourceType.getNumber(), (IGetDataCallback) this.f98372k.wrapAndAddCallback(new C38313f(this, str, iGetDataCallback, jVar)));
                }
            } else {
                AbstractC38197a.AbstractC38200c cVar2 = this.f98363a;
                if (cVar2 != null) {
                    cVar2.mo139611a(this.f98377p.getMessageId(), this.f98377p.getFileContent().getKey(), (IGetDataCallback) this.f98372k.wrapAndAddCallback(new C38314g(this, str, iGetDataCallback, jVar)));
                }
            }
            Log.m165389i("PreviewTask", "startDownload!");
            if (z) {
                i = 5;
            } else {
                i = 1;
            }
            this.f98368f = i;
            this.f98377p.getFileContent().setFileState(FileState.DOWNLOADING);
            m150732b(str);
            downloadMenu.mo29736a(this.f98367e);
        } else {
            mo140096g();
        }
    }
}
