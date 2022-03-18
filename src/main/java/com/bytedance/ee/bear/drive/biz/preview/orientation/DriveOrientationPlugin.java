package com.bytedance.ee.bear.drive.biz.preview.orientation;

import android.content.Context;
import android.content.res.Configuration;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.deviceinfo.C13653a;
import com.bytedance.ee.util.p709l.AbstractC13688a;
import com.bytedance.ee.util.p709l.C13697e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/orientation/DriveOrientationPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "Lcom/bytedance/ee/bear/facade/common/BackPressHandler;", "()V", "disable", "", "orientationStateChangeHandler", "Lcom/bytedance/ee/bear/drive/biz/preview/orientation/DriveSdkOrientationStateChangeHandler;", "orientationStateDetector", "Lcom/bytedance/ee/util/orientation/IOrientationStateDetector;", "handleOrientation", "", "configuration", "Landroid/content/res/Configuration;", "onAttachPreview", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "onBackPressed", "onConfigurationChanged", "newConfiguration", "onDetachPreview", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveOrientationPlugin extends AbsDrivePlugin implements AbstractC7666d {
    public static final Companion Companion = new Companion(null);
    private boolean disable;
    private C6692a orientationStateChangeHandler;
    private AbstractC13688a orientationStateDetector;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/orientation/DriveOrientationPlugin$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.orientation.DriveOrientationPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J'\u0010\u0006\u001a\u0002H\u0007\"\n\b\u0000\u0010\u0007*\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/orientation/DriveOrientationPlugin$onAttachPreview$1", "Lcom/bytedance/ee/util/orientation/IOrientationStateDetector$IContext;", "provideContext", "Landroid/content/Context;", "provideLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "provideViewModel", "T", "Landroidx/lifecycle/ViewModel;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.orientation.DriveOrientationPlugin$b */
    public static final class C6690b implements AbstractC13688a.AbstractC13689a {

        /* renamed from: a */
        final /* synthetic */ DriveOrientationPlugin f18239a;

        @Override // com.bytedance.ee.util.p709l.AbstractC13688a.AbstractC13689a
        /* renamed from: a */
        public Context mo26372a() {
            Context context = this.f18239a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            return context;
        }

        @Override // com.bytedance.ee.util.p709l.AbstractC13688a.AbstractC13689a
        /* renamed from: b */
        public LifecycleOwner mo26374b() {
            LifecycleOwner lifecycleOwner = this.f18239a.getLifecycleOwner();
            Intrinsics.checkExpressionValueIsNotNull(lifecycleOwner, "lifecycleOwner");
            return lifecycleOwner;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6690b(DriveOrientationPlugin driveOrientationPlugin) {
            this.f18239a = driveOrientationPlugin;
        }

        @Override // com.bytedance.ee.util.p709l.AbstractC13688a.AbstractC13689a
        /* renamed from: a */
        public <T extends AbstractC1142af> T mo26373a(Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "clazz");
            return (T) this.f18239a.viewModel(cls);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        C6692a aVar = this.orientationStateChangeHandler;
        if (aVar == null) {
            return false;
        }
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        return aVar.onBackPressed();
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachPreview() {
        super.onDetachPreview();
        AbstractC13688a aVar = this.orientationStateDetector;
        if (aVar != null) {
            aVar.mo50649a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/orientation/DriveOrientationPlugin$onAttachPreview$2", "Lcom/bytedance/ee/bear/drive/biz/preview/orientation/IOrientationController;", "getRequestedOrientation", "", "setRequestedOrientation", "", "orientation", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.orientation.DriveOrientationPlugin$c */
    public static final class C6691c implements AbstractC6693b {

        /* renamed from: a */
        final /* synthetic */ DriveOrientationPlugin f18240a;

        @Override // com.bytedance.ee.bear.drive.biz.preview.orientation.AbstractC6693b
        /* renamed from: a */
        public int mo26375a() {
            if (this.f18240a.getActivity() == null) {
                return -1;
            }
            FragmentActivity activity = this.f18240a.getActivity();
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
            return activity.getRequestedOrientation();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6691c(DriveOrientationPlugin driveOrientationPlugin) {
            this.f18240a = driveOrientationPlugin;
        }

        @Override // com.bytedance.ee.bear.drive.biz.preview.orientation.AbstractC6693b
        /* renamed from: a */
        public void mo26376a(int i) {
            if (this.f18240a.getActivity() != null) {
                FragmentActivity activity = this.f18240a.getActivity();
                Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
                activity.setRequestedOrientation(i);
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachPreview() {
        super.onAttachPreview();
        if (!this.disable) {
            this.orientationStateDetector = new C13697e(new C6690b(this));
            BaseOpenEntity openEntity = ((DrivePluginHost) getHost()).mo27261l().getOpenEntity();
            Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
            C6692a aVar = new C6692a(openEntity.getFileId(), new C6691c(this));
            this.orientationStateChangeHandler = aVar;
            AbstractC13688a aVar2 = this.orientationStateDetector;
            if (aVar2 != null) {
                aVar2.mo50650a(aVar);
            }
        }
    }

    private final void handleOrientation(Configuration configuration) {
        boolean z;
        if (configuration.orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z || C13653a.m55399c(getContext())) {
            getUIContainer().mo19596c();
            getTitleBar().mo19528h(true);
            return;
        }
        getUIContainer().mo19599d();
        getTitleBar().mo19528h(false);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "newConfiguration");
        super.onConfigurationChanged(configuration);
        if (!this.disable && !((DrivePluginHost) getHost()).mo27261l().isInBlockState()) {
            C13479a.m54764b("DriveOrientationPlugin", "onConfigurationChanged() newConfiguration.orientation=" + configuration.orientation);
            handleOrientation(configuration);
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        if (!aVar.mo27261l().isVCAttachment() && !aVar.mo27261l().isVCFollowMode()) {
            BaseOpenEntity openEntity = aVar.mo27261l().getOpenEntity();
            Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
            if (openEntity.getPreviewType() != 3) {
                z = false;
                this.disable = z;
                C13479a.m54764b("DriveOrientationPlugin", "onAttachToHost() disable=" + this.disable);
            }
        }
        z = true;
        this.disable = z;
        C13479a.m54764b("DriveOrientationPlugin", "onAttachToHost() disable=" + this.disable);
    }
}
