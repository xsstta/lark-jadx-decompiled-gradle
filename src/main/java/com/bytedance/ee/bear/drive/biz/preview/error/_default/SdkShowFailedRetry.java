package com.bytedance.ee.bear.drive.biz.preview.error._default;

import com.bytedance.ee.bear.drive.view.preview.retryview.FailedToRetryView;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/error/_default/SdkShowFailedRetry;", "", "()V", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.preview.error._default.b */
public final class SdkShowFailedRetry {

    /* renamed from: a */
    public static final Companion f18065a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/error/_default/SdkShowFailedRetry$Companion;", "", "()V", "showRetry", "", "failedToRetryView", "Lcom/bytedance/ee/bear/drive/view/preview/retryview/FailedToRetryView;", "fileId", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error._default.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo26184a(FailedToRetryView failedToRetryView, String str) {
            Intrinsics.checkParameterIsNotNull(failedToRetryView, "failedToRetryView");
            if (((IAdminPermissionProxy) KoinJavaComponent.m268613a(IAdminPermissionProxy.class, null, null, 6, null)).mo36540a(6, 5, str)) {
                failedToRetryView.mo28996f();
            }
        }
    }
}
