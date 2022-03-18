package com.bytedance.ee.bear.drive.biz.preview.screen;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.log.C13479a;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/screen/DriveScreenStatePlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveScreenStatePlugin extends AbsDrivePlugin {
    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        C6891a.m27236d(aVar).liveInnerKeepScreenOn().mo5923a(getLifecycleOwner(), new C6705a(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.screen.DriveScreenStatePlugin$a */
    public static final class C6705a<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveScreenStatePlugin f18274a;

        C6705a(DriveScreenStatePlugin driveScreenStatePlugin) {
            this.f18274a = driveScreenStatePlugin;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            C13479a.m54764b("DriveComponent", "liveInnerKeepScreenOn() on=" + bool);
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                FragmentActivity activity = this.f18274a.getActivity();
                Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
                activity.getWindow().addFlags(SmActions.ACTION_ONTHECALL_EXIT);
                return;
            }
            FragmentActivity activity2 = this.f18274a.getActivity();
            Intrinsics.checkExpressionValueIsNotNull(activity2, "activity");
            activity2.getWindow().clearFlags(SmActions.ACTION_ONTHECALL_EXIT);
        }
    }
}
