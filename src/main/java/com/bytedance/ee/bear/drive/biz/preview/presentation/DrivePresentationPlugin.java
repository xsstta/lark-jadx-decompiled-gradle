package com.bytedance.ee.bear.drive.biz.preview.presentation;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/presentation/DrivePresentationPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "isCurrentLandscape", "", "current", "", "isCurrentPortrait", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "onDetachFromHost", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DrivePresentationPlugin extends AbsDrivePlugin {
    public static final Companion Companion = new Companion(null);

    public final boolean isCurrentLandscape(int i) {
        return i == 0 || i == 8;
    }

    public final boolean isCurrentPortrait(int i) {
        return i == 1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/presentation/DrivePresentationPlugin$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.presentation.DrivePresentationPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachFromHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onDetachFromHost(aVar);
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        C6891a.m27236d(aVar).liveInnerIsPresentationMode().mo5923a(getLifecycleOwner(), new C6694b(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.presentation.DrivePresentationPlugin$b */
    public static final class C6694b<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DrivePresentationPlugin f18254a;

        C6694b(DrivePresentationPlugin drivePresentationPlugin) {
            this.f18254a = drivePresentationPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            if (this.f18254a.getActivity() == null) {
                C13479a.m54764b("DrivePresentationPlugin", "liveInnerIsPresentationMode activity is null");
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                DrivePresentationPlugin drivePresentationPlugin = this.f18254a;
                FragmentActivity activity = drivePresentationPlugin.getActivity();
                Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
                if (drivePresentationPlugin.isCurrentPortrait(activity.getRequestedOrientation())) {
                    FragmentActivity activity2 = this.f18254a.getActivity();
                    Intrinsics.checkExpressionValueIsNotNull(activity2, "activity");
                    activity2.setRequestedOrientation(0);
                    return;
                }
            }
            if (!bool.booleanValue()) {
                DrivePresentationPlugin drivePresentationPlugin2 = this.f18254a;
                FragmentActivity activity3 = drivePresentationPlugin2.getActivity();
                Intrinsics.checkExpressionValueIsNotNull(activity3, "activity");
                if (drivePresentationPlugin2.isCurrentLandscape(activity3.getRequestedOrientation())) {
                    FragmentActivity activity4 = this.f18254a.getActivity();
                    Intrinsics.checkExpressionValueIsNotNull(activity4, "activity");
                    activity4.setRequestedOrientation(1);
                }
            }
        }
    }
}
