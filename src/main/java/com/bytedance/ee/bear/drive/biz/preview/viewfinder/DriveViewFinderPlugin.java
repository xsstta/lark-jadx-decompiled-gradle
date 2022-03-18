package com.bytedance.ee.bear.drive.biz.preview.viewfinder;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.drive.common.DriveViewUtils;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/viewfinder/DriveViewFinderPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveViewFinderPlugin extends AbsDrivePlugin {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/viewfinder/DriveViewFinderPlugin$onAttachToHost$1", "Lcom/bytedance/ee/bear/drive/biz/preview/viewfinder/IViewFinder;", "findViewById", "T", "Landroid/view/View;", "idRes", "", "(I)Landroid/view/View;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.viewfinder.DriveViewFinderPlugin$a */
    public static final class C6739a implements IViewFinder {

        /* renamed from: a */
        final /* synthetic */ DriveViewFinderPlugin f18348a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6739a(DriveViewFinderPlugin driveViewFinderPlugin) {
            this.f18348a = driveViewFinderPlugin;
        }

        @Override // com.bytedance.ee.bear.drive.biz.preview.viewfinder.IViewFinder
        /* renamed from: a */
        public <T extends View> T mo26521a(int i) {
            return (T) DriveViewUtils.f18671a.mo27134a(i, (Fragment) this.f18348a.getLifecycleOwner());
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        ((DriveViewFinderVM) viewModel(DriveViewFinderVM.class)).setFinder$drive_impl_release(new C6739a(this));
    }
}
