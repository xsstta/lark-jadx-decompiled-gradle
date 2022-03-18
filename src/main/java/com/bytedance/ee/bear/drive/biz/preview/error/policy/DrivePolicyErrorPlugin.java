package com.bytedance.ee.bear.drive.biz.preview.error.policy;

import android.view.View;
import com.bytedance.ee.bear.drive.biz.cache.CacheUtils;
import com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.view.preview.p367c.C7260d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/error/policy/DrivePolicyErrorPlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/AbsDrivePreviewPlugin;", "()V", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DrivePolicyErrorPlugin extends AbsDrivePreviewPlugin {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.policy.DrivePolicyErrorPlugin$a */
    public static final class RunnableC6603a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DrivePolicyErrorPlugin f18098a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f18099b;

        RunnableC6603a(DrivePolicyErrorPlugin drivePolicyErrorPlugin, DrivePluginHost aVar) {
            this.f18098a = drivePolicyErrorPlugin;
            this.f18099b = aVar;
        }

        public final void run() {
            CacheUtils.Companion.m25412a(CacheUtils.f17530a, this.f18099b.mo27261l(), null, 2, null);
            DrivePolicyErrorPlugin drivePolicyErrorPlugin = this.f18098a;
            View a = new C7260d(drivePolicyErrorPlugin.getActivity()).mo28362a();
            Intrinsics.checkExpressionValueIsNotNull(a, "PolicyDeniedViewManager(activity).policyDeniedView");
            drivePolicyErrorPlugin.removeAndAddPreviewView(a);
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        addErrorHandler(new RunnableC6603a(this, aVar), ErrCode.POLICY_DENIED);
    }
}
