package com.bytedance.ee.bear.drive.biz.preview.more;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.MenuItem;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderSaveCallback;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseSpaceOpenEntity;
import com.bytedance.ee.bear.drive.biz.external.C6414b;
import com.bytedance.ee.bear.drive.biz.external.C6418d;
import com.bytedance.ee.bear.drive.biz.permission.DriveThirdPartyPermissionVM;
import com.bytedance.ee.bear.drive.biz.permission.model.ThirdPartyAttachmentPermission;
import com.bytedance.ee.bear.drive.biz.preview.more.download.spacefile.SpaceFileDownloadManager;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6947b;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.SaveToLocalMenu;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.SaveToLocalMenuV2;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.util.io.C13671b;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p718t.C13748k;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/more/DriveSpaceThirdPartyAttachmentMoreMenuPlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/more/AbsDriveMoreMenuPlugin;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "enableMore", "", "showMore", "handleSaveToLocalMenu", "", "saveToLocalMenu", "Lcom/bytedance/ee/bear/drivesdk/plugin/model/menu/SaveToLocalMenu;", "initMenuActions", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "onDetachFromHost", "onDetachFromUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveSpaceThirdPartyAttachmentMoreMenuPlugin extends AbsDriveMoreMenuPlugin {
    public final C68289a compositeDisposable = new C68289a();
    public boolean enableMore;
    public boolean showMore;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceThirdPartyAttachmentMoreMenuPlugin$b */
    public static final class RunnableC6643b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceThirdPartyAttachmentMoreMenuPlugin f18145a;

        RunnableC6643b(DriveSpaceThirdPartyAttachmentMoreMenuPlugin driveSpaceThirdPartyAttachmentMoreMenuPlugin) {
            this.f18145a = driveSpaceThirdPartyAttachmentMoreMenuPlugin;
        }

        public final void run() {
            FragmentActivity activity = this.f18145a.getActivity();
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
            new DriveAttachmentMoreMenuCreator(activity, ((DrivePluginHost) this.f18145a.getHost()).mo27261l(), this.f18145a.compositeDisposable).mo26306a().mo26308b().mo26307a(SaveToLocalMenu.class, new Action(this) {
                /* class com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceThirdPartyAttachmentMoreMenuPlugin.RunnableC6643b.C66441 */

                /* renamed from: a */
                final /* synthetic */ RunnableC6643b f18146a;

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/bytedance/ee/bear/contract/drive/sdk/entity/menu/BaseMoreMenuAction;", "run"}, mo238835k = 3, mv = {1, 1, 15})
                /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceThirdPartyAttachmentMoreMenuPlugin$b$1$a */
                static final class RunnableC6645a implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ C66441 f18147a;

                    /* renamed from: b */
                    final /* synthetic */ BaseMoreMenuAction f18148b;

                    RunnableC6645a(C66441 r1, BaseMoreMenuAction baseMoreMenuAction) {
                        this.f18147a = r1;
                        this.f18148b = baseMoreMenuAction;
                    }

                    public final void run() {
                        DriveSpaceThirdPartyAttachmentMoreMenuPlugin driveSpaceThirdPartyAttachmentMoreMenuPlugin = this.f18147a.f18146a.f18145a;
                        BaseMoreMenuAction baseMoreMenuAction = this.f18148b;
                        if (baseMoreMenuAction != null) {
                            driveSpaceThirdPartyAttachmentMoreMenuPlugin.handleSaveToLocalMenu((SaveToLocalMenu) baseMoreMenuAction);
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.drivesdk.plugin.model.menu.SaveToLocalMenu");
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f18146a = r1;
                }

                @Override // com.bytedance.ee.bear.drive.biz.preview.more.Action
                /* renamed from: a */
                public <T extends BaseMoreMenuAction> void mo26262a(T t) {
                    Intrinsics.checkParameterIsNotNull(t, "t");
                    C13748k.m55732a(new RunnableC6645a(this, t));
                }
            }).mo26307a(SaveToLocalMenuV2.class, new Action(this) {
                /* class com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceThirdPartyAttachmentMoreMenuPlugin.RunnableC6643b.C66462 */

                /* renamed from: a */
                final /* synthetic */ RunnableC6643b f18149a;

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/bytedance/ee/bear/contract/drive/sdk/entity/menu/BaseMoreMenuAction;", "run"}, mo238835k = 3, mv = {1, 1, 15})
                /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceThirdPartyAttachmentMoreMenuPlugin$b$2$a */
                static final class RunnableC6647a implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ C66462 f18150a;

                    RunnableC6647a(C66462 r1) {
                        this.f18150a = r1;
                    }

                    public final void run() {
                        Context context = this.f18150a.f18149a.f18145a.getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context, "context");
                        BaseOpenEntity openEntity = ((DrivePluginHost) this.f18150a.f18149a.f18145a.getHost()).mo27261l().getOpenEntity();
                        if (openEntity != null) {
                            new SpaceFileDownloadManager(context, (BaseSpaceOpenEntity) openEntity, ((DrivePluginHost) this.f18150a.f18149a.f18145a.getHost()).mo27261l().getFileModel()).mo26339a();
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseSpaceOpenEntity");
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f18149a = r1;
                }

                @Override // com.bytedance.ee.bear.drive.biz.preview.more.Action
                /* renamed from: a */
                public <T extends BaseMoreMenuAction> void mo26262a(T t) {
                    Intrinsics.checkParameterIsNotNull(t, "t");
                    C13748k.m55732a(new RunnableC6647a(this));
                }
            }).mo26311e().mo26312f();
        }
    }

    public final void initMenuActions() {
        if (isUIContainerAttached()) {
            ArrayList arrayList = new ArrayList();
            if (Intrinsics.areEqual((Object) titleBarViewModel().getOutlineEnable().mo5927b(), (Object) true)) {
                arrayList.add(createOutlineMenuItem());
            }
            if (this.showMore) {
                MenuItem createMoreMenuItem = createMoreMenuItem(new RunnableC6643b(this));
                createMoreMenuItem.setEnable(this.enableMore);
                arrayList.add(createMoreMenuItem);
            }
            if (C13657b.m55421a(arrayList)) {
                getTitleBar().mo19528h(false);
                return;
            }
            getTitleBar().mo19528h(true);
            showRightMenu(arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceThirdPartyAttachmentMoreMenuPlugin$e */
    public static final class C6650e<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceThirdPartyAttachmentMoreMenuPlugin f18154a;

        C6650e(DriveSpaceThirdPartyAttachmentMoreMenuPlugin driveSpaceThirdPartyAttachmentMoreMenuPlugin) {
            this.f18154a = driveSpaceThirdPartyAttachmentMoreMenuPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f18154a.initMenuActions();
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachFromHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onDetachFromHost(aVar);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceThirdPartyAttachmentMoreMenuPlugin$c */
    public static final class C6648c<T> implements AbstractC1178x<ConnectionService.NetworkState> {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceThirdPartyAttachmentMoreMenuPlugin f18151a;

        /* renamed from: b */
        final /* synthetic */ LiveData f18152b;

        C6648c(DriveSpaceThirdPartyAttachmentMoreMenuPlugin driveSpaceThirdPartyAttachmentMoreMenuPlugin, LiveData liveData) {
            this.f18151a = driveSpaceThirdPartyAttachmentMoreMenuPlugin;
            this.f18152b = liveData;
        }

        /* renamed from: a */
        public final void onChanged(ConnectionService.NetworkState networkState) {
            boolean z;
            ThirdPartyAttachmentPermission thirdPartyAttachmentPermission;
            DriveSpaceThirdPartyAttachmentMoreMenuPlugin driveSpaceThirdPartyAttachmentMoreMenuPlugin = this.f18151a;
            ThirdPartyAttachmentPermission thirdPartyAttachmentPermission2 = (ThirdPartyAttachmentPermission) this.f18152b.mo5927b();
            boolean z2 = false;
            if (thirdPartyAttachmentPermission2 == null || thirdPartyAttachmentPermission2.getCopy() != 1 || (thirdPartyAttachmentPermission = (ThirdPartyAttachmentPermission) this.f18152b.mo5927b()) == null || thirdPartyAttachmentPermission.getExport() != 1) {
                z = false;
            } else {
                z = true;
            }
            driveSpaceThirdPartyAttachmentMoreMenuPlugin.showMore = z;
            DriveSpaceThirdPartyAttachmentMoreMenuPlugin driveSpaceThirdPartyAttachmentMoreMenuPlugin2 = this.f18151a;
            if (networkState != null && networkState.mo20041b()) {
                z2 = true;
            }
            driveSpaceThirdPartyAttachmentMoreMenuPlugin2.enableMore = z2;
            this.f18151a.initMenuActions();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/drive/biz/permission/model/ThirdPartyAttachmentPermission;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceThirdPartyAttachmentMoreMenuPlugin$d */
    public static final class C6649d<T> implements AbstractC1178x<ThirdPartyAttachmentPermission> {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceThirdPartyAttachmentMoreMenuPlugin f18153a;

        C6649d(DriveSpaceThirdPartyAttachmentMoreMenuPlugin driveSpaceThirdPartyAttachmentMoreMenuPlugin) {
            this.f18153a = driveSpaceThirdPartyAttachmentMoreMenuPlugin;
        }

        /* renamed from: a */
        public final void onChanged(ThirdPartyAttachmentPermission thirdPartyAttachmentPermission) {
            boolean z;
            ConnectionService.NetworkState b;
            DriveSpaceThirdPartyAttachmentMoreMenuPlugin driveSpaceThirdPartyAttachmentMoreMenuPlugin = this.f18153a;
            boolean z2 = false;
            if (thirdPartyAttachmentPermission != null && thirdPartyAttachmentPermission.getCopy() == 1 && thirdPartyAttachmentPermission.getExport() == 1) {
                z = true;
            } else {
                z = false;
            }
            driveSpaceThirdPartyAttachmentMoreMenuPlugin.showMore = z;
            DriveSpaceThirdPartyAttachmentMoreMenuPlugin driveSpaceThirdPartyAttachmentMoreMenuPlugin2 = this.f18153a;
            ConnectionService d = C5084ad.m20847d();
            if (!(d == null || (b = d.mo20038b()) == null || !b.mo20041b())) {
                z2 = true;
            }
            driveSpaceThirdPartyAttachmentMoreMenuPlugin2.enableMore = z2;
            this.f18153a.initMenuActions();
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        LiveData<ThirdPartyAttachmentPermission> livePerm = ((DriveThirdPartyPermissionVM) viewModel(DriveThirdPartyPermissionVM.class)).livePerm();
        C6891a.m27232a(this, new C6648c(this, livePerm));
        livePerm.mo5923a(getLifecycleOwner(), new C6649d(this));
        titleBarViewModel().getOutlineEnable().mo5923a(getLifecycleOwner(), new C6650e(this));
    }

    public final void handleSaveToLocalMenu(SaveToLocalMenu saveToLocalMenu) {
        long j;
        AbstractC6946a a;
        AbstractC6947b a2;
        if (!isUIContainerDetached()) {
            Long l = null;
            C8275a aVar = C8275a.f22375h;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FILE");
            int b = aVar.mo32555b();
            BaseOpenEntity openEntity = ((DrivePluginHost) getHost()).mo27261l().getOpenEntity();
            Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
            if (!((IAdminPermissionProxy) KoinJavaComponent.m268613a(IAdminPermissionProxy.class, null, null, 6, null)).mo36543b(b, openEntity.getFileId())) {
                Toast.showText(C13615c.f35773a, (int) R.string.CreationMobile_ECM_AdminDisableToast);
                BinderSaveCallback k = saveToLocalMenu.mo29760k();
                if (k != null) {
                    k.onSaved(false);
                    return;
                }
                return;
            }
            C6418d a3 = C6418d.m25763a(((DrivePluginHost) getHost()).mo27261l().getBizType(), getContext(), ar.f14811a);
            AbstractC6949c iFileModel = ((DrivePluginHost) getHost()).mo27261l().getIFileModel();
            if (!(iFileModel == null || (a = iFileModel.mo27371a()) == null || (a2 = a.mo27322a()) == null)) {
                l = Long.valueOf(a2.f18787c);
            }
            C6414b bVar = new C6414b(true, new C6641a(this, saveToLocalMenu));
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            BaseOpenEntity openEntity2 = ((DrivePluginHost) getHost()).mo27261l().getOpenEntity();
            Intrinsics.checkExpressionValueIsNotNull(openEntity2, "host.driveViewModel.openEntity");
            String fileId = openEntity2.getFileId();
            BaseOpenEntity openEntity3 = ((DrivePluginHost) getHost()).mo27261l().getOpenEntity();
            Intrinsics.checkExpressionValueIsNotNull(openEntity3, "host.driveViewModel.openEntity");
            String apiExtra = openEntity3.getApiExtra();
            BaseOpenEntity openEntity4 = ((DrivePluginHost) getHost()).mo27261l().getOpenEntity();
            Intrinsics.checkExpressionValueIsNotNull(openEntity4, "host.driveViewModel.openEntity");
            a3.mo25745a(j, fileId, apiExtra, openEntity4.getMountPoint(), bVar);
        }
    }

    public void onDetachFromUIContainer(DrivePluginHost aVar, AbstractC4958n nVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        Intrinsics.checkParameterIsNotNull(nVar, "uiContainer");
        super.onDetachFromUIContainer((C4943e) aVar, nVar);
        this.compositeDisposable.mo237935a();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "isSuccess", "", "saveUri", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "onOpen"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceThirdPartyAttachmentMoreMenuPlugin$a */
    public static final class C6641a implements C6414b.AbstractC6415a {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceThirdPartyAttachmentMoreMenuPlugin f18142a;

        /* renamed from: b */
        final /* synthetic */ SaveToLocalMenu f18143b;

        C6641a(DriveSpaceThirdPartyAttachmentMoreMenuPlugin driveSpaceThirdPartyAttachmentMoreMenuPlugin, SaveToLocalMenu saveToLocalMenu) {
            this.f18142a = driveSpaceThirdPartyAttachmentMoreMenuPlugin;
            this.f18143b = saveToLocalMenu;
        }

        @Override // com.bytedance.ee.bear.drive.biz.external.C6414b.AbstractC6415a
        /* renamed from: a */
        public final void mo25737a(boolean z, Uri uri) {
            if (!(!z || this.f18142a.getContext() == null || uri == null)) {
                C13748k.m55732a(new Runnable(this) {
                    /* class com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceThirdPartyAttachmentMoreMenuPlugin.C6641a.RunnableC66421 */

                    /* renamed from: a */
                    final /* synthetic */ C6641a f18144a;

                    {
                        this.f18144a = r1;
                    }

                    public final void run() {
                        Toast.showSuccessText(this.f18144a.f18142a.getContext(), this.f18144a.f18142a.getContext().getString(R.string.Drive_Drive_SaveSuccess), 0);
                    }
                });
                if (this.f18143b.mo29759j()) {
                    C13671b.m55476e(this.f18142a.getContext(), uri);
                } else {
                    C13671b.m55477f(this.f18142a.getContext(), uri);
                }
            }
            BinderSaveCallback k = this.f18143b.mo29760k();
            if (k != null) {
                k.onSaved(z);
            }
        }
    }
}
