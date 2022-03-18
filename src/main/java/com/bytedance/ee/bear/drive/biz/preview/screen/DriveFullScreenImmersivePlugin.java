package com.bytedance.ee.bear.drive.biz.preview.screen;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.drive.biz.comment.DriveCommentVM;
import com.bytedance.ee.bear.drive.biz.preview.DrivePreviewContentPlugin;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6947b;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.model.InfoCode;
import com.bytedance.ee.bear.drive.mimetype.C7094b;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.drive.view.preview.wrapper.FooterBehavior;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/screen/DriveFullScreenImmersivePlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "Lcom/bytedance/ee/bear/facade/common/BackPressHandler;", "()V", "mDriveFullScreenManager", "Lcom/bytedance/ee/bear/drive/biz/preview/screen/DriveFullScreenManager;", "mLoadListener", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$LoadListener;", "getViewType", "", "fileModel", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/PreviewFileModel;", "initFullScreen", "", "previewFileModel", "forceTitleInTop", "", "onAttachPreview", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "onBackPressed", "onDetachFromHost", "onDetachPreview", "switchFullScreenImpl", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveFullScreenImmersivePlugin extends AbsDrivePlugin implements AbstractC7666d {
    public static final Companion Companion = new Companion(null);
    public C6706a mDriveFullScreenManager;
    private IFileLoader.LoadListener mLoadListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/screen/DriveFullScreenImmersivePlugin$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.screen.DriveFullScreenImmersivePlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/screen/DriveFullScreenImmersivePlugin$onAttachPreview$1$1", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/FooterBehavior$FullScreenManager;", "isFullScreenMode", "", "switchFullScreen", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.screen.DriveFullScreenImmersivePlugin$b */
    public static final class C6695b implements FooterBehavior.AbstractC7534a {

        /* renamed from: a */
        final /* synthetic */ DriveFullScreenImmersivePlugin f18255a;

        @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.FooterBehavior.AbstractC7534a
        /* renamed from: b */
        public void mo26406b() {
            this.f18255a.switchFullScreenImpl();
        }

        @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.FooterBehavior.AbstractC7534a
        /* renamed from: a */
        public boolean mo26405a() {
            C6706a aVar = this.f18255a.mDriveFullScreenManager;
            if (aVar == null || !aVar.mo26423a()) {
                return false;
            }
            return true;
        }

        C6695b(DriveFullScreenImmersivePlugin driveFullScreenImmersivePlugin) {
            this.f18255a = driveFullScreenImmersivePlugin;
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachPreview() {
        super.onDetachPreview();
        C6706a aVar = this.mDriveFullScreenManager;
        if (aVar != null) {
            aVar.mo26427d();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        Boolean bool;
        AbstractC7549a currentPreviewView;
        if (!((DrivePluginHost) getHost()).mo27261l().fromBlockPreview() || ((DrivePluginHost) getHost()).mo27261l().isInBlockFullScreenState()) {
            DrivePreviewContentPlugin drivePreviewContentPlugin = (DrivePreviewContentPlugin) findPlugin(DrivePreviewContentPlugin.class);
            if (drivePreviewContentPlugin == null || (currentPreviewView = drivePreviewContentPlugin.currentPreviewView()) == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(currentPreviewView.onBackPressed());
            }
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                C13479a.m54764b("DriveSdkImmersivePlugin", "onBackPressed() previewHandled true");
                return true;
            }
            C6706a aVar = this.mDriveFullScreenManager;
            if (aVar == null || !aVar.mo26423a()) {
                return false;
            }
            C13479a.m54764b("DriveSdkImmersivePlugin", "onBackPressed() mDriveFullScreenManager handle true,current is fullscreen");
            switchFullScreenImpl();
            return true;
        }
        C13479a.m54764b("DriveSdkImmersivePlugin", "onBackPressed() not isInBlockFullScreenState ignore handle");
        return false;
    }

    public final void switchFullScreenImpl() {
        String str;
        AbstractC6949c iFileModel = ((DrivePluginHost) getHost()).mo27261l().getIFileModel();
        if (iFileModel != null) {
            if (!TextUtils.isEmpty(iFileModel.mo27380j())) {
                str = iFileModel.mo27380j();
            } else {
                AbstractC6946a a = iFileModel.mo27371a();
                Intrinsics.checkExpressionValueIsNotNull(a, "fileModel.details");
                AbstractC6947b a2 = a.mo27322a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "fileModel.details.meta");
                str = a2.mo27364g();
            }
            C6706a aVar = this.mDriveFullScreenManager;
            if (aVar != null) {
                aVar.mo26420a(str);
            }
            C6920b f = C6920b.m27342f();
            Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
            C7130c a3 = f.mo27166a();
            AbstractC6946a a4 = iFileModel.mo27371a();
            C6706a aVar2 = this.mDriveFullScreenManager;
            boolean z = true;
            if (aVar2 == null || !aVar2.mo26423a()) {
                z = false;
            }
            a3.mo27912a(a4, z);
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachPreview() {
        super.onAttachPreview();
        View findViewById = findViewById(R.id.drive_sdk_main_title_bar_root_fl);
        View findViewById2 = findViewById(R.id.main_page_holder_view);
        View findViewById3 = findViewById(R.id.drive_sdk_preview_viewpager);
        View findViewById4 = findViewById(R.id.drive_extra_fileinfo);
        C6920b f = C6920b.m27342f();
        Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
        this.mDriveFullScreenManager = new C6706a(f.mo27169d(), findViewById, findViewById4, findViewById3, ((DrivePluginHost) getHost()).mo27261l().isVCFollowMode(), getActivity());
        AbstractC1142af a = new C1144ai(getActivity()).mo6005a(DriveFullScreenVM.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProvider(activi…FullScreenVM::class.java)");
        DriveFullScreenVM bVar = (DriveFullScreenVM) a;
        if (bVar.getOriginNavigationBarColor() == 0) {
            FragmentActivity activity = getActivity();
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
            Window window = activity.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
            bVar.setOriginStatusBarColor(window.getStatusBarColor());
            FragmentActivity activity2 = getActivity();
            Intrinsics.checkExpressionValueIsNotNull(activity2, "activity");
            Window window2 = activity2.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window2, "activity.window");
            bVar.setOriginNavigationBarColor(window2.getNavigationBarColor());
        }
        if (findViewById2 != null) {
            ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
            if (layoutParams != null) {
                ((CoordinatorLayout.LayoutParams) layoutParams).setBehavior(new FooterBehavior(new C6695b(this)));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.screen.DriveFullScreenImmersivePlugin$c */
    public static final class C6696c<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DrivePluginHost f18256a;

        C6696c(DrivePluginHost aVar) {
            this.f18256a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            C6891a.m27236d(this.f18256a).liveOuterFullScreenSate().mo5926a(bool);
        }
    }

    private final int getViewType(C7553d dVar) {
        if (dVar.mo29497p() == 2) {
            return 1;
        }
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0004H\u0016¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/screen/DriveFullScreenImmersivePlugin$onAttachToHost$2", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$SimpleLoadListener;", "onInfo", "", "T", "code", "Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;Ljava/lang/Object;)V", "onSuccess", "previewFileModel", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/PreviewFileModel;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.screen.DriveFullScreenImmersivePlugin$e */
    public static final class C6698e extends IFileLoader.SimpleLoadListener {

        /* renamed from: a */
        final /* synthetic */ DriveFullScreenImmersivePlugin f18259a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f18260b;

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public void mo25512a(C7553d dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "previewFileModel");
            this.f18259a.initFullScreen(dVar, this.f18260b.mo27261l().isInBlockState());
        }

        C6698e(DriveFullScreenImmersivePlugin driveFullScreenImmersivePlugin, DrivePluginHost aVar) {
            this.f18259a = driveFullScreenImmersivePlugin;
            this.f18260b = aVar;
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public <T> void mo25427a(InfoCode infoCode, T t) {
            Intrinsics.checkParameterIsNotNull(infoCode, "code");
            if (infoCode == InfoCode.HitCache && (t instanceof AbstractC6946a)) {
                DriveFullScreenImmersivePlugin driveFullScreenImmersivePlugin = this.f18259a;
                C7553d v = t.mo27356v();
                Intrinsics.checkExpressionValueIsNotNull(v, "data.toPreviewFileModel()");
                driveFullScreenImmersivePlugin.initFullScreen(v, this.f18260b.mo27261l().isInBlockState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.screen.DriveFullScreenImmersivePlugin$h */
    public static final class C6701h<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ DriveFullScreenImmersivePlugin f18265a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f18266b;

        C6701h(DriveFullScreenImmersivePlugin driveFullScreenImmersivePlugin, DrivePluginHost aVar) {
            this.f18265a = driveFullScreenImmersivePlugin;
            this.f18266b = aVar;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            if (!this.f18266b.mo27261l().isInBlockState()) {
                this.f18265a.switchFullScreenImpl();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.screen.DriveFullScreenImmersivePlugin$j */
    public static final class C6703j<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveFullScreenImmersivePlugin f18269a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f18270b;

        C6703j(DriveFullScreenImmersivePlugin driveFullScreenImmersivePlugin, DrivePluginHost aVar) {
            this.f18269a = driveFullScreenImmersivePlugin;
            this.f18270b = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            C6706a aVar;
            if (!this.f18270b.mo27261l().isInBlockState() && (aVar = this.f18269a.mDriveFullScreenManager) != null) {
                aVar.mo26421a(Intrinsics.areEqual((Object) bool, (Object) true));
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachFromHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onDetachFromHost(aVar);
        IFileLoader.LoadListener aVar2 = this.mLoadListener;
        if (aVar2 != null) {
            aVar.mo27262m().mo27299b(aVar2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.screen.DriveFullScreenImmersivePlugin$f */
    public static final class C6699f<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ DriveFullScreenImmersivePlugin f18261a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f18262b;

        C6699f(DriveFullScreenImmersivePlugin driveFullScreenImmersivePlugin, DrivePluginHost aVar) {
            this.f18261a = driveFullScreenImmersivePlugin;
            this.f18262b = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            AbstractC6946a fileModel = this.f18262b.mo27261l().getFileModel();
            if (fileModel != null) {
                DriveFullScreenImmersivePlugin driveFullScreenImmersivePlugin = this.f18261a;
                C7553d v = fileModel.mo27356v();
                Intrinsics.checkExpressionValueIsNotNull(v, "it.toPreviewFileModel()");
                driveFullScreenImmersivePlugin.initFullScreen(v, this.f18262b.mo27261l().isInBlockState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.screen.DriveFullScreenImmersivePlugin$i */
    public static final class C6702i<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveFullScreenImmersivePlugin f18267a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f18268b;

        C6702i(DriveFullScreenImmersivePlugin driveFullScreenImmersivePlugin, DrivePluginHost aVar) {
            this.f18267a = driveFullScreenImmersivePlugin;
            this.f18268b = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            if (!this.f18268b.mo27261l().isInBlockState()) {
                if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                    C6706a aVar = this.f18267a.mDriveFullScreenManager;
                    if (aVar == null || !aVar.mo26423a()) {
                        this.f18267a.switchFullScreenImpl();
                        return;
                    }
                    return;
                }
                C6706a aVar2 = this.f18267a.mDriveFullScreenManager;
                if (aVar2 != null && aVar2.mo26423a()) {
                    this.f18267a.switchFullScreenImpl();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.screen.DriveFullScreenImmersivePlugin$k */
    public static final class C6704k<T> implements AbstractC1178x<Void> {

        /* renamed from: a */
        final /* synthetic */ DriveFullScreenImmersivePlugin f18271a;

        /* renamed from: b */
        final /* synthetic */ DriveCommentVM f18272b;

        /* renamed from: c */
        final /* synthetic */ DrivePluginHost f18273c;

        C6704k(DriveFullScreenImmersivePlugin driveFullScreenImmersivePlugin, DriveCommentVM gVar, DrivePluginHost aVar) {
            this.f18271a = driveFullScreenImmersivePlugin;
            this.f18272b = gVar;
            this.f18273c = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Void r2) {
            if (!Intrinsics.areEqual((Object) this.f18272b.getCommentPanelShowing().mo5927b(), (Object) true) && !this.f18273c.mo27261l().isInBlockState()) {
                this.f18271a.switchFullScreenImpl();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isFullScreen", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.screen.DriveFullScreenImmersivePlugin$d */
    public static final class C6697d<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveFullScreenImmersivePlugin f18257a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f18258b;

        C6697d(DriveFullScreenImmersivePlugin driveFullScreenImmersivePlugin, DrivePluginHost aVar) {
            this.f18257a = driveFullScreenImmersivePlugin;
            this.f18258b = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            View findViewById;
            int i;
            if (this.f18258b.mo27261l().getFileModel() != null && !this.f18258b.mo27261l().isInBlockState() && (findViewById = this.f18257a.findViewById(R.id.drive_sdk_preview_viewpager)) != null) {
                Intrinsics.checkExpressionValueIsNotNull(bool, "isFullScreen");
                if (bool.booleanValue()) {
                    i = 0;
                } else {
                    i = this.f18257a.getResources().getDimensionPixelSize(R.dimen.drive_main_page_title_bar_height);
                }
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                if (layoutParams != null) {
                    findViewById.setPadding(0, i, 0, 0);
                    ((RelativeLayout.LayoutParams) layoutParams).removeRule(3);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "fullscreen", "", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.screen.DriveFullScreenImmersivePlugin$g */
    public static final class C6700g<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveFullScreenImmersivePlugin f18263a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f18264b;

        C6700g(DriveFullScreenImmersivePlugin driveFullScreenImmersivePlugin, DrivePluginHost aVar) {
            this.f18263a = driveFullScreenImmersivePlugin;
            this.f18264b = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            String str;
            String str2;
            if (bool != null && !this.f18264b.mo27261l().isInBlockState()) {
                LiveData<Integer> livePreviewType = this.f18264b.mo27261l().livePreviewType();
                Intrinsics.checkExpressionValueIsNotNull(livePreviewType, "host.driveViewModel.livePreviewType()");
                Integer b = livePreviewType.mo5927b();
                if (b != null && b.intValue() == 4) {
                    str = "preview";
                } else {
                    str = "card";
                }
                if (bool.booleanValue()) {
                    str2 = "landscape";
                } else {
                    str2 = "portrait";
                }
                C6891a.m27229a(this.f18264b).mo27910a(this.f18264b.mo27261l().getFileModel(), "media_rotate", str, str2);
                C6706a aVar = this.f18263a.mDriveFullScreenManager;
                if (aVar != null) {
                    aVar.mo26417a(this.f18263a.getActivity(), bool.booleanValue());
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        ((DriveFullScreenVM) new C1144ai(getActivity()).mo6005a(DriveFullScreenVM.class)).getLiveFullScreen().mo5923a(getLifecycleOwner(), new C6696c(aVar));
        IFileLoader m = aVar.mo27262m();
        C6698e eVar = new C6698e(this, aVar);
        this.mLoadListener = eVar;
        m.mo27297a(eVar);
        aVar.mo27261l().livePreviewType().mo5923a(getLifecycleOwner(), new C6699f(this, aVar));
        C7555f d = C6891a.m27236d(aVar);
        d.liveInnerVideoFullScreen().mo5923a(getLifecycleOwner(), new C6700g(this, aVar));
        d.liveInnerToggleFullScreen().mo5923a(getLifecycleOwner(), new C6701h(this, aVar));
        d.liveInnerForceFullScreen().mo5923a(getLifecycleOwner(), new C6702i(this, aVar));
        d.liveInnerForceImgFullScreen().mo5923a(getLifecycleOwner(), new C6703j(this, aVar));
        d.liveInnerSingleTap().mo5923a(getLifecycleOwner(), new C6704k(this, (DriveCommentVM) viewModel(DriveCommentVM.class), aVar));
        ((DriveViewFullScreenVM) viewModel(DriveViewFullScreenVM.class)).getImmersiveTitleTopState().mo5923a(getLifecycleOwner(), new C6697d(this, aVar));
    }

    public final void initFullScreen(C7553d dVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(dVar, "previewFileModel");
        C6920b f = C6920b.m27342f();
        Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
        C7094b a = f.mo27169d().mo27711a(dVar.mo29483d(), null);
        Intrinsics.checkExpressionValueIsNotNull(a, "mMimeTypeManager.getMime…leModel.previewExt, null)");
        String d = dVar.mo29483d();
        if (TextUtils.isEmpty(d)) {
            d = dVar.mo29494m();
        }
        C6706a aVar = this.mDriveFullScreenManager;
        if (aVar != null) {
            aVar.mo26419a(a.mo27726a(), d, getViewType(dVar), false);
        }
    }
}
