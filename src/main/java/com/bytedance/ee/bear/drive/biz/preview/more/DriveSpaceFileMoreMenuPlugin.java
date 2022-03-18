package com.bytedance.ee.bear.drive.biz.preview.more;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.BasePlugin;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.MenuItem;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceFileOpenEntity;
import com.bytedance.ee.bear.document.titlebar.badge.TitleBarBadgeStrategyManger;
import com.bytedance.ee.bear.drive.biz.cache.CacheUtils;
import com.bytedance.ee.bear.drive.biz.extra_info.C6438a;
import com.bytedance.ee.bear.drive.biz.extra_info.meta.DriveMetaInfoVM;
import com.bytedance.ee.bear.drive.biz.feed.DriveFeedVM;
import com.bytedance.ee.bear.drive.biz.permission.DriveMGPermissionVM;
import com.bytedance.ee.bear.drive.biz.permission.model.C6521a;
import com.bytedance.ee.bear.drive.biz.permission.model.C6522b;
import com.bytedance.ee.bear.drive.biz.preview.more.menu.C6671a;
import com.bytedance.ee.bear.drive.biz.preview.more.menu.DriveMoreMenuViewModel;
import com.bytedance.ee.bear.drive.biz.preview.more.menu.find.FindItemV2;
import com.bytedance.ee.bear.drive.biz.preview.more.menu.rename.RenameItemV2;
import com.bytedance.ee.bear.drive.biz.preview.titlebar.ImportFileMoreBadgeStrategy;
import com.bytedance.ee.bear.drive.biz.preview.vc.DriveVCFollowVM;
import com.bytedance.ee.bear.drive.common.C6892d;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.model.AbstractC6947b;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/more/DriveSpaceFileMoreMenuPlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/more/AbsDriveMoreMenuPlugin;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "mIsGuestMode", "", "mMoreRouteCompatAction", "Lcom/bytedance/ee/bear/drive/biz/preview/more/menu/DriveMoreRouteCompatAction;", "mTitleBarBadgeStrategyManger", "Lcom/bytedance/ee/bear/document/titlebar/badge/TitleBarBadgeStrategyManger;", "getReportExtras", "Landroid/os/Bundle;", "initMenuActions", "", "instanceFeedItem", "Lcom/bytedance/ee/bear/browser/plugin/MenuItem;", "instanceMoreItem", "instancePresentationItem", "instanceShareItem", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "onDetachFromHost", "onDetachFromUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveSpaceFileMoreMenuPlugin extends AbsDriveMoreMenuPlugin {
    private final C68289a compositeDisposable = new C68289a();
    public boolean mIsGuestMode;
    public C6671a mMoreRouteCompatAction;
    public final TitleBarBadgeStrategyManger mTitleBarBadgeStrategyManger = new TitleBarBadgeStrategyManger();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/more/DriveSpaceFileMoreMenuPlugin$instanceMoreItem$1", "Ljava/lang/Runnable;", "run", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceFileMoreMenuPlugin$a */
    public static final class RunnableC6630a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceFileMoreMenuPlugin f18131a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/more/DriveSpaceFileMoreMenuPlugin$instanceMoreItem$1$run$1", "Lcom/bytedance/ee/bear/drive/biz/preview/more/menu/DriveMoreRouteCompatAction$DriveMoreActonCallback;", "getFindCallback", "Lcom/bytedance/ee/bear/drive/biz/preview/more/menu/find/FindItemV2$FindCallback;", "getRenameCallback", "Lcom/bytedance/ee/bear/drive/biz/preview/more/menu/rename/RenameItemV2$IRenameCallback;", "setMoreBadge", "", "show", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceFileMoreMenuPlugin$a$a */
        public static final class C6631a implements C6671a.AbstractC6675a {

            /* renamed from: a */
            final /* synthetic */ RunnableC6630a f18132a;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onFindClick"}, mo238835k = 3, mv = {1, 1, 15})
            /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceFileMoreMenuPlugin$a$a$a */
            static final class C6632a implements FindItemV2.AbstractC6679a {

                /* renamed from: a */
                public static final C6632a f18133a = new C6632a();

                C6632a() {
                }

                @Override // com.bytedance.ee.bear.drive.biz.preview.more.menu.find.FindItemV2.AbstractC6679a
                /* renamed from: a */
                public final void mo26287a() {
                }
            }

            @Override // com.bytedance.ee.bear.drive.biz.preview.more.menu.C6671a.AbstractC6675a
            /* renamed from: a */
            public void mo26285a(boolean z) {
            }

            @Override // com.bytedance.ee.bear.drive.biz.preview.more.menu.C6671a.AbstractC6675a
            /* renamed from: a */
            public RenameItemV2.AbstractC6683a mo26284a() {
                return new C6633b(this);
            }

            @Override // com.bytedance.ee.bear.drive.biz.preview.more.menu.C6671a.AbstractC6675a
            /* renamed from: b */
            public FindItemV2.AbstractC6679a mo26286b() {
                return C6632a.f18133a;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/more/DriveSpaceFileMoreMenuPlugin$instanceMoreItem$1$run$1$getRenameCallback$1", "Lcom/bytedance/ee/bear/drive/biz/preview/more/menu/rename/RenameItemV2$IRenameCallback;", "onFileRenamed", "", "newName", "", "needRefresh", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
            /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceFileMoreMenuPlugin$a$a$b */
            public static final class C6633b implements RenameItemV2.AbstractC6683a {

                /* renamed from: a */
                final /* synthetic */ C6631a f18134a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                C6633b(C6631a aVar) {
                    this.f18134a = aVar;
                }

                @Override // com.bytedance.ee.bear.drive.biz.preview.more.menu.rename.RenameItemV2.AbstractC6683a
                /* renamed from: a */
                public void mo26288a(String str, boolean z) {
                    C7086a.C7087a x;
                    AbstractC6947b.C6948a j;
                    if (!this.f18134a.f18132a.f18131a.isUIContainerDetached()) {
                        C6521a b = ((DriveMetaInfoVM) this.f18134a.f18132a.f18131a.viewModel(DriveMetaInfoVM.class)).getLiveMetaInfo().mo5927b();
                        if (b != null) {
                            b.mo26043a(str);
                        }
                        ((AbstractC8149a) KoinJavaComponent.m268613a(AbstractC8149a.class, null, null, 6, null)).mo31504a(C6891a.m27230a((BasePlugin<DrivePluginHost>) this.f18134a.f18132a.f18131a), str);
                        if (!z) {
                            C7086a aVar = (C7086a) ((DrivePluginHost) this.f18134a.f18132a.f18131a.getHost()).mo27261l().getFileModel();
                            if (!(aVar == null || (x = aVar.mo27322a()) == null || (j = x.mo27367j()) == null)) {
                                j.mo27370a(str);
                            }
                            ((DrivePluginHost) this.f18134a.f18132a.f18131a.getHost()).mo27261l().setFileName(str);
                            DrivePluginHost aVar2 = (DrivePluginHost) this.f18134a.f18132a.f18131a.getHost();
                            Intrinsics.checkExpressionValueIsNotNull(aVar2, "host");
                            C6891a.m27236d(aVar2).liveInnerFileNameChanged().mo5926a(str);
                            return;
                        }
                        C13479a.m54764b("DriveComponent", "onFileRenamed() needRefresh, startLoad");
                        CacheUtils.Companion.m25412a(CacheUtils.f17530a, ((DrivePluginHost) this.f18134a.f18132a.f18131a.getHost()).mo27261l(), null, 2, null);
                        ((DrivePluginHost) this.f18134a.f18132a.f18131a.getHost()).mo27262m().mo27298b();
                    }
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C6631a(RunnableC6630a aVar) {
                this.f18132a = aVar;
            }
        }

        public void run() {
            AbstractC4958n uIContainer = this.f18131a.getUIContainer();
            Intrinsics.checkExpressionValueIsNotNull(uIContainer, "uiContainer");
            C10548d.m43697a(uIContainer.mo19601f());
            boolean e = this.f18131a.mTitleBarBadgeStrategyManger.mo25040e();
            this.f18131a.mTitleBarBadgeStrategyManger.mo25041f();
            C6671a aVar = this.f18131a.mMoreRouteCompatAction;
            if (aVar == null || !aVar.mo26352b()) {
                DriveSpaceFileMoreMenuPlugin driveSpaceFileMoreMenuPlugin = this.f18131a;
                DrivePluginHost aVar2 = (DrivePluginHost) driveSpaceFileMoreMenuPlugin.getHost();
                LifecycleOwner lifecycleOwner = this.f18131a.getLifecycleOwner();
                FragmentActivity activity = this.f18131a.getActivity();
                C10917c cVar = ar.f14811a;
                C6937b l = ((DrivePluginHost) this.f18131a.getHost()).mo27261l();
                DriveMGPermissionVM aVar3 = (DriveMGPermissionVM) this.f18131a.viewModel(DriveMGPermissionVM.class);
                DriveMetaInfoVM aVar4 = (DriveMetaInfoVM) this.f18131a.viewModel(DriveMetaInfoVM.class);
                DriveMoreMenuViewModel init = ((DriveMoreMenuViewModel) this.f18131a.viewModel(DriveMoreMenuViewModel.class)).init((DriveMetaInfoVM) this.f18131a.viewModel(DriveMetaInfoVM.class));
                C6920b f = C6920b.m27342f();
                Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
                driveSpaceFileMoreMenuPlugin.mMoreRouteCompatAction = new C6671a(aVar2, lifecycleOwner, activity, cVar, l, aVar3, aVar4, init, f.mo27166a(), new C6438a(), ((DrivePluginHost) this.f18131a.getHost()).mo27261l().isVCFollowMode(), this.f18131a.getReportExtras(), new C6631a(this));
                C6671a aVar5 = this.f18131a.mMoreRouteCompatAction;
                if (aVar5 != null) {
                    aVar5.mo26351a();
                }
                if (e) {
                    this.f18131a.initMenuActions();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC6630a(DriveSpaceFileMoreMenuPlugin driveSpaceFileMoreMenuPlugin) {
            this.f18131a = driveSpaceFileMoreMenuPlugin;
        }
    }

    private final MenuItem instanceMoreItem() {
        return createMoreMenuItem(new RunnableC6630a(this));
    }

    private final MenuItem instanceFeedItem() {
        Drawable a = C13747j.m55724a(getContext(), (int) R.drawable.ud_icon_bell_outlined, (int) R.color.facade_selector_icon_n1);
        return new DriveSpaceFileMoreMenuPlugin$instanceFeedItem$1(this, a, "ccm_drive_feed_menu", a, "");
    }

    private final MenuItem instancePresentationItem() {
        Drawable a = C13747j.m55724a(getContext(), (int) R.drawable.ud_icon_presentation_outlined, (int) R.color.facade_selector_icon_n1);
        return new DriveSpaceFileMoreMenuPlugin$instancePresentationItem$1(this, a, "ccm_drive_guest_presentation_menu", a, "");
    }

    private final MenuItem instanceShareItem() {
        Drawable a = C13747j.m55724a(getContext(), (int) R.drawable.ud_icon_share_label_outlined, (int) R.color.facade_selector_icon_n1);
        return new DriveSpaceFileMoreMenuPlugin$instanceShareItem$1(this, a, "ccm_drive_share_menu", a, "");
    }

    public DriveSpaceFileMoreMenuPlugin() {
        al d = C4511g.m18594d();
        Intrinsics.checkExpressionValueIsNotNull(d, "InfoProvideServiceImp.getInstance()");
        this.mIsGuestMode = d.mo17353N();
    }

    public final Bundle getReportExtras() {
        BaseOpenEntity openEntity = ((DrivePluginHost) getHost()).mo27261l().getOpenEntity();
        if (openEntity != null) {
            Bundle extras = ((SpaceFileOpenEntity) openEntity).getExtras();
            if (extras != null && !TextUtils.isEmpty(extras.getString("module"))) {
                return extras;
            }
            Bundle bundle = new Bundle();
            BaseOpenEntity openEntity2 = ((DrivePluginHost) getHost()).mo27261l().getOpenEntity();
            Intrinsics.checkExpressionValueIsNotNull(openEntity2, "host.driveViewModel.openEntity");
            bundle.putString("module", C7130c.m28589b(C6892d.m27241a(openEntity2.getPreviewFrom()), "main", ""));
            return bundle;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceFileOpenEntity");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void initMenuActions() {
        /*
        // Method dump skipped, instructions count: 365
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceFileMoreMenuPlugin.initMenuActions():void");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceFileMoreMenuPlugin$b */
    public static final class C6634b<T> implements AbstractC1178x<ConnectionService.NetworkState> {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceFileMoreMenuPlugin f18135a;

        C6634b(DriveSpaceFileMoreMenuPlugin driveSpaceFileMoreMenuPlugin) {
            this.f18135a = driveSpaceFileMoreMenuPlugin;
        }

        /* renamed from: a */
        public final void onChanged(ConnectionService.NetworkState networkState) {
            this.f18135a.initMenuActions();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/drive/biz/permission/model/DrivePermissionInfo;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceFileMoreMenuPlugin$c */
    public static final class C6635c<T> implements AbstractC1178x<C6522b> {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceFileMoreMenuPlugin f18136a;

        C6635c(DriveSpaceFileMoreMenuPlugin driveSpaceFileMoreMenuPlugin) {
            this.f18136a = driveSpaceFileMoreMenuPlugin;
        }

        /* renamed from: a */
        public final void onChanged(C6522b bVar) {
            this.f18136a.initMenuActions();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceFileMoreMenuPlugin$d */
    public static final class C6636d<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceFileMoreMenuPlugin f18137a;

        C6636d(DriveSpaceFileMoreMenuPlugin driveSpaceFileMoreMenuPlugin) {
            this.f18137a = driveSpaceFileMoreMenuPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            this.f18137a.initMenuActions();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceFileMoreMenuPlugin$e */
    public static final class C6637e<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceFileMoreMenuPlugin f18138a;

        C6637e(DriveSpaceFileMoreMenuPlugin driveSpaceFileMoreMenuPlugin) {
            this.f18138a = driveSpaceFileMoreMenuPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f18138a.initMenuActions();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceFileMoreMenuPlugin$g */
    public static final class C6639g<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceFileMoreMenuPlugin f18140a;

        C6639g(DriveSpaceFileMoreMenuPlugin driveSpaceFileMoreMenuPlugin) {
            this.f18140a = driveSpaceFileMoreMenuPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f18140a.initMenuActions();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceFileMoreMenuPlugin$h */
    public static final class C6640h<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceFileMoreMenuPlugin f18141a;

        C6640h(DriveSpaceFileMoreMenuPlugin driveSpaceFileMoreMenuPlugin) {
            this.f18141a = driveSpaceFileMoreMenuPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f18141a.initMenuActions();
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachFromHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onDetachFromHost(aVar);
        C6671a aVar2 = this.mMoreRouteCompatAction;
        if (aVar2 != null) {
            aVar2.mo26353c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceFileMoreMenuPlugin$f */
    public static final class C6638f<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceFileMoreMenuPlugin f18139a;

        C6638f(DriveSpaceFileMoreMenuPlugin driveSpaceFileMoreMenuPlugin) {
            this.f18139a = driveSpaceFileMoreMenuPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            DriveSpaceFileMoreMenuPlugin driveSpaceFileMoreMenuPlugin = this.f18139a;
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            driveSpaceFileMoreMenuPlugin.mIsGuestMode = bool.booleanValue();
            this.f18139a.initMenuActions();
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        this.mTitleBarBadgeStrategyManger.mo25037c(new ImportFileMoreBadgeStrategy((DriveMGPermissionVM) viewModel(DriveMGPermissionVM.class), aVar.mo27261l()));
        C6891a.m27232a(this, new C6634b(this));
        ((DriveMGPermissionVM) viewModel(DriveMGPermissionVM.class)).livePerm().mo5923a(getLifecycleOwner(), new C6635c(this));
        ((DriveFeedVM) viewModel(DriveFeedVM.class)).getFeedCount().mo5923a(getLifecycleOwner(), new C6636d(this));
        aVar.mo27261l().liveHistoryMode().mo5923a(getLifecycleOwner(), new C6637e(this));
        ((DriveVCFollowVM) viewModel(DriveVCFollowVM.class)).getLiveIsGuest().mo5923a(getLifecycleOwner(), new C6638f(this));
        C6891a.m27236d(aVar).liveInnerShowPresentationAction().mo5923a(getLifecycleOwner(), new C6639g(this));
        titleBarViewModel().getOutlineEnable().mo5923a(getLifecycleOwner(), new C6640h(this));
    }

    public void onDetachFromUIContainer(DrivePluginHost aVar, AbstractC4958n nVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        Intrinsics.checkParameterIsNotNull(nVar, "uiContainer");
        super.onDetachFromUIContainer((C4943e) aVar, nVar);
        this.compositeDisposable.mo237935a();
    }
}
