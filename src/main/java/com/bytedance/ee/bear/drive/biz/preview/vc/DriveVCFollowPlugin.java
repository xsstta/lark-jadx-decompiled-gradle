package com.bytedance.ee.bear.drive.biz.preview.vc;

import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.doc.follow.AbstractC5431f;
import com.bytedance.ee.bear.doc.follow.p296b.AbstractC5421a;
import com.bytedance.ee.bear.doc.follow.p296b.AbstractC5422b;
import com.bytedance.ee.bear.doc.follow.p296b.AbstractC5424c;
import com.bytedance.ee.bear.doc.follow.p296b.C5425d;
import com.bytedance.ee.bear.document.titlebar.AbstractC6196a;
import com.bytedance.ee.bear.drive.biz.docplugin.AbstractBinderC6405b;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.loader.download.DownLoadState;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.loader.model.InfoCode;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0003J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/vc/DriveVCFollowPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "Lcom/bytedance/ee/bear/facade/common/BackPressHandler;", "()V", "mCallback", "Lcom/bytedance/ee/bear/drive/biz/docplugin/ICallback;", "mIsVCFollowRefresh", "", "Ljava/lang/Boolean;", "mMeetingId", "", "mVCFollowManager", "Lcom/bytedance/ee/bear/drive/biz/preview/vc/VCFollowManager;", "getVcManager", "onAttachPreview", "", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "onBackPressed", "onDetachPreview", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveVCFollowPlugin extends AbsDrivePlugin implements AbstractC7666d {
    public static final Companion Companion = new Companion(null);
    private AbstractBinderC6405b mCallback;
    private Boolean mIsVCFollowRefresh;
    private String mMeetingId;
    public C6738g mVCFollowManager;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/doc/follow/state/DocFollowState;", "kotlin.jvm.PlatformType", "onIntercept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.vc.DriveVCFollowPlugin$d */
    static final class C6720d implements AbstractC5422b.AbstractC5423a {

        /* renamed from: a */
        public static final C6720d f18306a = new C6720d();

        C6720d() {
        }

        @Override // com.bytedance.ee.bear.doc.follow.p296b.AbstractC5422b.AbstractC5423a
        public final boolean onIntercept(AbstractC5421a aVar) {
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/vc/DriveVCFollowPlugin$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.vc.DriveVCFollowPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C6738g getVcManager() {
        return this.mVCFollowManager;
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachPreview() {
        super.onDetachPreview();
        C6738g gVar = this.mVCFollowManager;
        if (gVar != null) {
            gVar.mo26520h();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        AbstractBinderC6405b bVar = this.mCallback;
        if (bVar == null) {
            return false;
        }
        if (bVar != null) {
            bVar.mo25711b(new AbstractBinderC6405b.C6406a(100));
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/vc/DriveVCFollowPlugin$onAttachPreview$2", "Lcom/bytedance/ee/bear/doc/follow/state/DocFollowStateController;", "getTitleBarView", "Landroid/view/View;", "onStateChanged", "", "state", "Lcom/bytedance/ee/bear/doc/follow/state/DocFollowState;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.vc.DriveVCFollowPlugin$c */
    public static final class C6719c extends AbstractC5422b {

        /* renamed from: a */
        final /* synthetic */ DriveVCFollowPlugin f18305a;

        @Override // com.bytedance.ee.bear.doc.follow.p296b.AbstractC5422b
        /* renamed from: a */
        public View mo21679a() {
            View findViewById = this.f18305a.findViewById(R.id.drive_sdk_main_title_bar_root_fl);
            if (findViewById != null) {
                return findViewById;
            }
            TitleBar titleBar = this.f18305a.getTitleBar();
            Intrinsics.checkExpressionValueIsNotNull(titleBar, "titleBar");
            BaseTitleBar a = titleBar.mo19508a();
            Intrinsics.checkExpressionValueIsNotNull(a, "titleBar.titleBarLayout");
            return a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6719c(DriveVCFollowPlugin driveVCFollowPlugin) {
            this.f18305a = driveVCFollowPlugin;
        }

        @Override // com.bytedance.ee.bear.doc.follow.p296b.AbstractC5424c, com.bytedance.ee.bear.doc.follow.p296b.AbstractC5422b
        /* renamed from: a */
        public void mo21680a(AbstractC5421a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "state");
            if (aVar instanceof C5425d) {
                StringBuilder sb = new StringBuilder();
                sb.append("isGuest=");
                C5425d dVar = (C5425d) aVar;
                sb.append(dVar.f15477b);
                C13479a.m54764b("DriveVCPlugin", sb.toString());
                super.mo21680a(aVar);
                if (dVar.f15477b && !this.f18305a.isUIContainerDetached()) {
                    ((DriveVCFollowVM) this.f18305a.viewModel(DriveVCFollowVM.class)).getLiveIsGuest().mo5926a((Boolean) true);
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachPreview() {
        AbstractC5424c cVar;
        super.onAttachPreview();
        TitleBar titleBar = getTitleBar();
        Intrinsics.checkExpressionValueIsNotNull(titleBar, "titleBar");
        titleBar.mo19508a().setLeftClickListener(new View$OnClickListenerC6718b(this));
        C6738g gVar = new C6738g();
        this.mVCFollowManager = gVar;
        gVar.mo26510a(new C6719c(this));
        C6738g gVar2 = this.mVCFollowManager;
        boolean z = true;
        if (gVar2 != null) {
            gVar2.mo26513a(true, this.mMeetingId);
        }
        C6738g gVar3 = this.mVCFollowManager;
        if (gVar3 != null) {
            LifecycleOwner lifecycleOwner = getLifecycleOwner();
            if (lifecycleOwner != null) {
                BaseOpenEntity openEntity = ((DrivePluginHost) getHost()).mo27261l().getOpenEntity();
                Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
                gVar3.mo26511a(AbstractC5431f.m22018a((Fragment) lifecycleOwner, openEntity.getFileId()));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
            }
        }
        C6738g gVar4 = this.mVCFollowManager;
        if (gVar4 != null) {
            gVar4.mo26512a(Intrinsics.areEqual((Object) this.mIsVCFollowRefresh, (Object) true));
        }
        DrivePluginHost aVar = (DrivePluginHost) getHost();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
        C7555f d = C6891a.m27236d(aVar);
        C6738g gVar5 = this.mVCFollowManager;
        if (gVar5 == null || !gVar5.mo26517e()) {
            z = false;
        }
        d.setVCFollowMode(z);
        AbstractC5424c cVar2 = null;
        if (((AbstractC6196a) KoinJavaComponent.m268613a(AbstractC6196a.class, null, null, 6, null)).mo25028a()) {
            TitleBar titleBar2 = getTitleBar();
            Intrinsics.checkExpressionValueIsNotNull(titleBar2, "titleBar");
            BaseTitleBar a = titleBar2.mo19508a();
            Intrinsics.checkExpressionValueIsNotNull(a, "titleBar.titleBarLayout");
            a.setVisibility(8);
            C6738g gVar6 = this.mVCFollowManager;
            if (gVar6 != null) {
                cVar = gVar6.mo26514b();
            } else {
                cVar = null;
            }
            if (cVar instanceof AbstractC5422b) {
                C6738g gVar7 = this.mVCFollowManager;
                if (gVar7 != null) {
                    cVar2 = gVar7.mo26514b();
                }
                if (cVar2 != null) {
                    AbstractC5422b bVar = (AbstractC5422b) cVar2;
                    if (bVar != null) {
                        bVar.mo21681a(C6720d.f18306a);
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.doc.follow.state.DocFollowStateController");
            }
            return;
        }
        getTitleBar().mo19525e(false);
        getTitleBar().mo19515a(false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.vc.DriveVCFollowPlugin$b */
    static final class View$OnClickListenerC6718b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DriveVCFollowPlugin f18304a;

        View$OnClickListenerC6718b(DriveVCFollowPlugin driveVCFollowPlugin) {
            this.f18304a = driveVCFollowPlugin;
        }

        public final void onClick(View view) {
            this.f18304a.onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J%\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0004\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u0001H\u0007H\u0016¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/vc/DriveVCFollowPlugin$onAttachToHost$1", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$SimpleLoadListener;", "onFailed", "", "code", "Lcom/bytedance/ee/bear/drive/loader/model/ErrCode;", "onInfo", "T", "Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;Ljava/lang/Object;)V", "onProgress", "percent", "", "onSuccess", "previewFileModel", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/PreviewFileModel;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.vc.DriveVCFollowPlugin$e */
    public static final class C6721e extends IFileLoader.SimpleLoadListener {

        /* renamed from: a */
        final /* synthetic */ DriveVCFollowPlugin f18307a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6721e(DriveVCFollowPlugin driveVCFollowPlugin) {
            this.f18307a = driveVCFollowPlugin;
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public void mo25760a(int i) {
            C6732e c;
            C6738g gVar = this.f18307a.mVCFollowManager;
            if (gVar != null && (c = gVar.mo26515c()) != null) {
                c.mo26500a(DownLoadState.Loading);
            }
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public void mo25511a(ErrCode errCode) {
            C6732e c;
            Intrinsics.checkParameterIsNotNull(errCode, "code");
            C6738g gVar = this.f18307a.mVCFollowManager;
            if (gVar != null && (c = gVar.mo26515c()) != null) {
                c.mo26500a(DownLoadState.LoadFail);
            }
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public void mo25512a(C7553d dVar) {
            C6732e c;
            Intrinsics.checkParameterIsNotNull(dVar, "previewFileModel");
            C6738g gVar = this.f18307a.mVCFollowManager;
            if (gVar != null && (c = gVar.mo26515c()) != null) {
                c.mo26500a(DownLoadState.LoadSuccess);
            }
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public <T> void mo25427a(InfoCode infoCode, T t) {
            C6738g gVar;
            C6732e c;
            Intrinsics.checkParameterIsNotNull(infoCode, "code");
            if (infoCode == InfoCode.HitCache && (gVar = this.f18307a.mVCFollowManager) != null && (c = gVar.mo26515c()) != null) {
                c.mo26500a(DownLoadState.LoadSuccess);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.vc.DriveVCFollowPlugin$f */
    public static final class C6722f<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ DriveVCFollowPlugin f18308a;

        C6722f(DriveVCFollowPlugin driveVCFollowPlugin) {
            this.f18308a = driveVCFollowPlugin;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            C6732e c;
            C6738g gVar = this.f18308a.mVCFollowManager;
            if (gVar != null && (c = gVar.mo26515c()) != null) {
                c.mo26501a(str);
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        View findViewById;
        String str;
        Boolean bool;
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        try {
            Bundle args = aVar.mo27261l().getArgs();
            IBinder iBinder = null;
            if (args != null) {
                str = args.getString("vc_follow_meeting_id", "");
            } else {
                str = null;
            }
            this.mMeetingId = str;
            Bundle args2 = aVar.mo27261l().getArgs();
            if (args2 != null) {
                bool = Boolean.valueOf(args2.getBoolean("vc_follow_refresh", false));
            } else {
                bool = null;
            }
            this.mIsVCFollowRefresh = bool;
            Bundle args3 = aVar.mo27261l().getArgs();
            if (args3 != null) {
                iBinder = args3.getBinder("drive_uistate_callback");
            }
            this.mCallback = (AbstractBinderC6405b) iBinder;
        } catch (Exception e) {
            C13479a.m54761a("DriveComponent", e);
        }
        if (aVar.mo27261l().isVCFollowMode() && (findViewById = findViewById(R.id.main_page_root)) != null) {
            findViewById.setBackgroundColor(getResources().getColor(R.color.static_white));
        }
        aVar.mo27262m().mo27297a(new C6721e(this));
        aVar.mo27261l().liveFileName().mo5923a(getLifecycleOwner(), new C6722f(this));
    }
}
