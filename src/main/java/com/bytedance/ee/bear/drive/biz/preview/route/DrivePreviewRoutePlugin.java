package com.bytedance.ee.bear.drive.biz.preview.route;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/route/DrivePreviewRoutePlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "Landroidx/lifecycle/Observer;", "", "()V", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "onChanged", "url", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DrivePreviewRoutePlugin extends AbsDrivePlugin implements AbstractC1178x<String> {
    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        C6891a.m27236d(aVar).liveInnerRoute().mo5923a(getLifecycleOwner(), this);
    }

    public void onChanged(String str) {
        if (!TextUtils.isEmpty(str)) {
            ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17292a(str);
        } else {
            C13479a.m54758a("DriveSdk", "liveInnerRoute() url is empty");
        }
    }
}
