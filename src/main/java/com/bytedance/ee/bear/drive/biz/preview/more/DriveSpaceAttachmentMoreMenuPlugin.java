package com.bytedance.ee.bear.drive.biz.preview.more;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.MenuItem;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.drive.biz.permission.DriveSpaceAttachmentMGPermissionVM;
import com.bytedance.ee.bear.drive.biz.permission.model.C6522b;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.util.p702e.C13657b;
import io.reactivex.disposables.C68289a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/more/DriveSpaceAttachmentMoreMenuPlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/more/AbsDriveMoreMenuPlugin;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "enableMore", "", "showMore", "initMenuActions", "", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "onDetachFromUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveSpaceAttachmentMoreMenuPlugin extends AbsDriveMoreMenuPlugin {
    public final C68289a compositeDisposable = new C68289a();
    public boolean enableMore;
    public boolean showMore;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceAttachmentMoreMenuPlugin$a */
    public static final class RunnableC6626a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceAttachmentMoreMenuPlugin f18126a;

        RunnableC6626a(DriveSpaceAttachmentMoreMenuPlugin driveSpaceAttachmentMoreMenuPlugin) {
            this.f18126a = driveSpaceAttachmentMoreMenuPlugin;
        }

        public final void run() {
            FragmentActivity activity = this.f18126a.getActivity();
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
            new DriveAttachmentMoreMenuCreator(activity, ((DrivePluginHost) this.f18126a.getHost()).mo27261l(), this.f18126a.compositeDisposable).mo26310d().mo26306a().mo26308b().mo26309c().mo26311e().mo26312f();
        }
    }

    public final void initMenuActions() {
        if (isUIContainerAttached()) {
            ArrayList arrayList = new ArrayList();
            if (Intrinsics.areEqual((Object) titleBarViewModel().getOutlineEnable().mo5927b(), (Object) true)) {
                arrayList.add(createOutlineMenuItem());
            }
            if (this.showMore) {
                MenuItem createMoreMenuItem = createMoreMenuItem(new RunnableC6626a(this));
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
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceAttachmentMoreMenuPlugin$d */
    public static final class C6629d<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceAttachmentMoreMenuPlugin f18130a;

        C6629d(DriveSpaceAttachmentMoreMenuPlugin driveSpaceAttachmentMoreMenuPlugin) {
            this.f18130a = driveSpaceAttachmentMoreMenuPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f18130a.initMenuActions();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceAttachmentMoreMenuPlugin$b */
    public static final class C6627b<T> implements AbstractC1178x<ConnectionService.NetworkState> {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceAttachmentMoreMenuPlugin f18127a;

        /* renamed from: b */
        final /* synthetic */ DriveSpaceAttachmentMGPermissionVM f18128b;

        C6627b(DriveSpaceAttachmentMoreMenuPlugin driveSpaceAttachmentMoreMenuPlugin, DriveSpaceAttachmentMGPermissionVM cVar) {
            this.f18127a = driveSpaceAttachmentMoreMenuPlugin;
            this.f18128b = cVar;
        }

        /* renamed from: a */
        public final void onChanged(ConnectionService.NetworkState networkState) {
            boolean z;
            DriveSpaceAttachmentMoreMenuPlugin driveSpaceAttachmentMoreMenuPlugin = this.f18127a;
            C6522b b = this.f18128b.livePerm().mo5927b();
            boolean z2 = false;
            if (b == null || !b.mo26059e()) {
                z = false;
            } else {
                z = true;
            }
            driveSpaceAttachmentMoreMenuPlugin.showMore = z;
            DriveSpaceAttachmentMoreMenuPlugin driveSpaceAttachmentMoreMenuPlugin2 = this.f18127a;
            if (networkState != null && networkState.mo20041b()) {
                z2 = true;
            }
            driveSpaceAttachmentMoreMenuPlugin2.enableMore = z2;
            this.f18127a.initMenuActions();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/drive/biz/permission/model/DrivePermissionInfo;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceAttachmentMoreMenuPlugin$c */
    public static final class C6628c<T> implements AbstractC1178x<C6522b> {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceAttachmentMoreMenuPlugin f18129a;

        C6628c(DriveSpaceAttachmentMoreMenuPlugin driveSpaceAttachmentMoreMenuPlugin) {
            this.f18129a = driveSpaceAttachmentMoreMenuPlugin;
        }

        /* renamed from: a */
        public final void onChanged(C6522b bVar) {
            boolean z;
            ConnectionService.NetworkState b;
            DriveSpaceAttachmentMoreMenuPlugin driveSpaceAttachmentMoreMenuPlugin = this.f18129a;
            boolean z2 = false;
            if (bVar == null || !bVar.mo26059e()) {
                z = false;
            } else {
                z = true;
            }
            driveSpaceAttachmentMoreMenuPlugin.showMore = z;
            DriveSpaceAttachmentMoreMenuPlugin driveSpaceAttachmentMoreMenuPlugin2 = this.f18129a;
            ConnectionService d = C5084ad.m20847d();
            if (!(d == null || (b = d.mo20038b()) == null || !b.mo20041b())) {
                z2 = true;
            }
            driveSpaceAttachmentMoreMenuPlugin2.enableMore = z2;
            this.f18129a.initMenuActions();
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        DriveSpaceAttachmentMGPermissionVM cVar = (DriveSpaceAttachmentMGPermissionVM) viewModel(DriveSpaceAttachmentMGPermissionVM.class);
        C6891a.m27232a(this, new C6627b(this, cVar));
        cVar.livePerm().mo5923a(getLifecycleOwner(), new C6628c(this));
        titleBarViewModel().getOutlineEnable().mo5923a(getLifecycleOwner(), new C6629d(this));
    }

    public void onDetachFromUIContainer(DrivePluginHost aVar, AbstractC4958n nVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        Intrinsics.checkParameterIsNotNull(nVar, "uiContainer");
        super.onDetachFromUIContainer((C4943e) aVar, nVar);
        this.compositeDisposable.mo237935a();
    }
}
