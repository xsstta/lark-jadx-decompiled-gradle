package com.bytedance.ee.bear.drive.biz.preview.more;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.BasePlugin;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.LocalOpenEntity;
import com.bytedance.ee.bear.drive.common.C6892d;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.OpenExternalMenu;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.SaveToLocalMenuV2;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.middleground_permission_export.model.IAuditApi;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13671b;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p718t.C13748k;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57788ai;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/more/DriveLocalFileMoreMenuPlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/more/AbsDriveMoreMenuPlugin;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "initExportVisible", "", "initMenuActions", "onAttachPreview", "onDetachPreview", "openExternal", "saveToLocalDefault", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveLocalFileMoreMenuPlugin extends AbsDriveMoreMenuPlugin {
    public final C68289a compositeDisposable = new C68289a();

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "accept", "(Lkotlin/Unit;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveLocalFileMoreMenuPlugin$d */
    public static final class C6623d<T> implements Consumer<Unit> {

        /* renamed from: a */
        public static final C6623d f18123a = new C6623d();

        C6623d() {
        }

        /* renamed from: a */
        public final void accept(Unit unit) {
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachPreview() {
        super.onDetachPreview();
        this.compositeDisposable.mo237935a();
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachPreview() {
        super.onAttachPreview();
        initExportVisible();
        initMenuActions();
        titleBarViewModel().getOutlineEnable().mo5923a(getLifecycleOwner(), new C6620b(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveLocalFileMoreMenuPlugin$a */
    public static final class RunnableC6616a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DriveLocalFileMoreMenuPlugin f18115a;

        RunnableC6616a(DriveLocalFileMoreMenuPlugin driveLocalFileMoreMenuPlugin) {
            this.f18115a = driveLocalFileMoreMenuPlugin;
        }

        public final void run() {
            FragmentActivity activity = this.f18115a.getActivity();
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
            new DriveAttachmentMoreMenuCreator(activity, ((DrivePluginHost) this.f18115a.getHost()).mo27261l(), this.f18115a.compositeDisposable).mo26311e().mo26307a(OpenExternalMenu.class, new Action(this) {
                /* class com.bytedance.ee.bear.drive.biz.preview.more.DriveLocalFileMoreMenuPlugin.RunnableC6616a.C66171 */

                /* renamed from: a */
                final /* synthetic */ RunnableC6616a f18116a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f18116a = r1;
                }

                @Override // com.bytedance.ee.bear.drive.biz.preview.more.Action
                /* renamed from: a */
                public <T extends BaseMoreMenuAction> void mo26262a(T t) {
                    Intrinsics.checkParameterIsNotNull(t, "t");
                    this.f18116a.f18115a.openExternal();
                }
            }).mo26307a(SaveToLocalMenuV2.class, new Action(this) {
                /* class com.bytedance.ee.bear.drive.biz.preview.more.DriveLocalFileMoreMenuPlugin.RunnableC6616a.C66182 */

                /* renamed from: a */
                final /* synthetic */ RunnableC6616a f18117a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f18117a = r1;
                }

                @Override // com.bytedance.ee.bear.drive.biz.preview.more.Action
                /* renamed from: a */
                public <T extends BaseMoreMenuAction> void mo26262a(T t) {
                    Intrinsics.checkParameterIsNotNull(t, "t");
                    this.f18117a.f18115a.saveToLocalDefault();
                }
            }).mo26312f().mo45216a(new DialogInterface.OnCancelListener(this) {
                /* class com.bytedance.ee.bear.drive.biz.preview.more.DriveLocalFileMoreMenuPlugin.RunnableC6616a.DialogInterface$OnCancelListenerC66193 */

                /* renamed from: a */
                final /* synthetic */ RunnableC6616a f18118a;

                {
                    this.f18118a = r1;
                }

                public final void onCancel(DialogInterface dialogInterface) {
                    C6920b f = C6920b.m27342f();
                    Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
                    f.mo27166a().mo27931b(((DrivePluginHost) this.f18118a.f18115a.getHost()).mo27261l().getFileModel(), "cancel", "none");
                }
            });
        }
    }

    public final void initMenuActions() {
        boolean z;
        if (isUIContainerAttached()) {
            BaseOpenEntity openEntity = ((DrivePluginHost) getHost()).mo27261l().getOpenEntity();
            if (openEntity != null) {
                LocalOpenEntity localOpenEntity = (LocalOpenEntity) openEntity;
                ArrayList arrayList = new ArrayList();
                if (titleBarViewModel().getOutlineEnable().mo5927b() == Boolean.TRUE) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(createOutlineMenuItem());
                }
                if (!C13657b.m55421a(localOpenEntity.getMoreMenuActions())) {
                    arrayList.add(createMoreMenuItem(new RunnableC6616a(this)));
                }
                if (C13657b.m55421a(arrayList)) {
                    getTitleBar().mo19528h(false);
                } else {
                    showRightMenu(arrayList);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.contract.drive.sdk.entity.open.LocalOpenEntity");
            }
        }
    }

    public final void openExternal() {
        if (!isUIContainerDetached()) {
            BaseOpenEntity openEntity = ((DrivePluginHost) getHost()).mo27261l().getOpenEntity();
            if (openEntity != null) {
                LocalOpenEntity localOpenEntity = (LocalOpenEntity) openEntity;
                if (!TextUtils.isEmpty(localOpenEntity.getFileId())) {
                    String appId = localOpenEntity.getAppId();
                    String fileId = localOpenEntity.getFileId();
                    Intrinsics.checkExpressionValueIsNotNull(fileId, "openEntity.fileId");
                    ((IAuditApi) KoinJavaComponent.m268613a(IAuditApi.class, null, null, 6, null)).mo37702a(16, 13, appId, fileId, (Boolean) true, localOpenEntity.getThirdPartyAppID());
                }
                C13675f.m55495a(getContext(), new File(localOpenEntity.getLocalFilePath()), "");
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.contract.drive.sdk.entity.open.LocalOpenEntity");
        }
    }

    public final void saveToLocalDefault() {
        if (!isUIContainerDetached()) {
            C8275a aVar = C8275a.f22375h;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FILE");
            if (!((IAdminPermissionProxy) KoinJavaComponent.m268613a(IAdminPermissionProxy.class, null, null, 6, null)).mo36543b(aVar.mo32555b(), C6891a.m27230a((BasePlugin<DrivePluginHost>) this))) {
                Toast.showText(C13615c.f35773a, (int) R.string.CreationMobile_ECM_AdminDisableToast);
            } else {
                this.compositeDisposable.mo237937a(AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d(new C6621c(this)).mo237985a(C11678b.m48481e()).mo238001b(C6623d.f18123a, new C6624e(this)));
            }
        }
    }

    private final void initExportVisible() {
        BaseOpenEntity openEntity = ((DrivePluginHost) getHost()).mo27261l().getOpenEntity();
        Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
        Bundle extras = openEntity.getExtras();
        boolean z = false;
        if (extras == null || !extras.getBoolean("archive_inner_file")) {
            BaseOpenEntity openEntity2 = ((DrivePluginHost) getHost()).mo27261l().getOpenEntity();
            Intrinsics.checkExpressionValueIsNotNull(openEntity2, "host.driveViewModel.openEntity");
            Iterator<BaseMoreMenuAction> it = openEntity2.getMoreMenuActions().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof OpenExternalMenu) {
                    z = true;
                }
            }
            DrivePluginHost aVar = (DrivePluginHost) getHost();
            Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
            C6891a.m27236d(aVar).liveOuterExportVisible().mo5926a(Boolean.valueOf(z));
            return;
        }
        DrivePluginHost aVar2 = (DrivePluginHost) getHost();
        Intrinsics.checkExpressionValueIsNotNull(aVar2, "host");
        C6891a.m27236d(aVar2).liveOuterExportVisible().mo5926a((Boolean) false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveLocalFileMoreMenuPlugin$b */
    static final class C6620b<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveLocalFileMoreMenuPlugin f18119a;

        C6620b(DriveLocalFileMoreMenuPlugin driveLocalFileMoreMenuPlugin) {
            this.f18119a = driveLocalFileMoreMenuPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f18119a.initMenuActions();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveLocalFileMoreMenuPlugin$c */
    public static final class C6621c<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ DriveLocalFileMoreMenuPlugin f18120a;

        C6621c(DriveLocalFileMoreMenuPlugin driveLocalFileMoreMenuPlugin) {
            this.f18120a = driveLocalFileMoreMenuPlugin;
        }

        @Override // io.reactivex.functions.Function
        public /* synthetic */ Object apply(Object obj) {
            mo26269a((String) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo26269a(String str) {
            String str2;
            boolean z;
            String str3;
            T t;
            Intrinsics.checkParameterIsNotNull(str, "it");
            ((IAuditApi) KoinJavaComponent.m268613a(IAuditApi.class, null, null, 6, null)).mo37701a(3, 7, C6891a.m27230a((BasePlugin<DrivePluginHost>) this.f18120a));
            BaseOpenEntity openEntity = ((DrivePluginHost) this.f18120a.getHost()).mo27261l().getOpenEntity();
            if (openEntity != null) {
                File file = new File(((LocalOpenEntity) openEntity).getLocalFilePath());
                AbstractC6946a fileModel = ((DrivePluginHost) this.f18120a.getHost()).mo27261l().getFileModel();
                if (fileModel == null || (str2 = fileModel.mo27333d()) == null) {
                    str2 = "";
                }
                boolean h = C6892d.m27250h(str2);
                boolean i = C6892d.m27251i(str2);
                if (h || i) {
                    z = true;
                } else {
                    z = false;
                }
                AbstractC6946a fileModel2 = ((DrivePluginHost) this.f18120a.getHost()).mo27261l().getFileModel();
                if (fileModel2 == null || (str3 = fileModel2.mo27351r()) == null) {
                    str3 = "";
                }
                Uri a = C13671b.m55462a(this.f18120a.getContext(), file.getName(), str3, "");
                C13675f.m55506a(this.f18120a.getContext(), file, a);
                if (z) {
                    C13671b.m55476e(this.f18120a.getContext(), a);
                } else {
                    C13671b.m55477f(this.f18120a.getContext(), a);
                }
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                if (z) {
                    t = (T) this.f18120a.getContext().getString(R.string.CreationMobile_ECM_SaveToLocal_toAlbum_toast);
                } else {
                    t = (T) (this.f18120a.getContext().getString(R.string.CreationMobile_ECM_SaveToLocal_saved_toast) + C57788ai.m224257a(this.f18120a.getContext(), a));
                }
                Intrinsics.checkExpressionValueIsNotNull(t, "if (isMedia) context.get…UriPath(context, saveUri)");
                objectRef.element = t;
                C13748k.m55732a(new Runnable(this) {
                    /* class com.bytedance.ee.bear.drive.biz.preview.more.DriveLocalFileMoreMenuPlugin.C6621c.RunnableC66221 */

                    /* renamed from: a */
                    final /* synthetic */ C6621c f18121a;

                    {
                        this.f18121a = r1;
                    }

                    public final void run() {
                        Toast.showSuccessText(this.f18121a.f18120a.getContext(), objectRef.element, 1);
                    }
                });
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.contract.drive.sdk.entity.open.LocalOpenEntity");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveLocalFileMoreMenuPlugin$e */
    public static final class C6624e<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ DriveLocalFileMoreMenuPlugin f18124a;

        C6624e(DriveLocalFileMoreMenuPlugin driveLocalFileMoreMenuPlugin) {
            this.f18124a = driveLocalFileMoreMenuPlugin;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13748k.m55732a(new Runnable(this) {
                /* class com.bytedance.ee.bear.drive.biz.preview.more.DriveLocalFileMoreMenuPlugin.C6624e.RunnableC66251 */

                /* renamed from: a */
                final /* synthetic */ C6624e f18125a;

                {
                    this.f18125a = r1;
                }

                public final void run() {
                    Toast.showText(this.f18125a.f18124a.getContext(), (int) R.string.Drive_Drive_OpenFile_Fail);
                }
            });
            C13479a.m54761a("AbsDriveMoreMenuPlugin", th);
        }
    }
}
