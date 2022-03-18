package com.bytedance.ee.bear.middleground.permission.setting.doc.v2;

import android.content.Context;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPublicPermErrorHandler;", "", "()V", "showFailedToast", "", "context", "Landroid/content/Context;", "throwable", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.g */
public final class DocPublicPermErrorHandler {

    /* renamed from: a */
    public static final DocPublicPermErrorHandler f27060a = new DocPublicPermErrorHandler();

    private DocPublicPermErrorHandler() {
    }

    /* renamed from: a */
    public final void mo38256a(Context context, Throwable th) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (C5203d.m21235a(th, 10040)) {
            Toast.showFailureText(context, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
        } else if (C5203d.m21235a(th, 10011)) {
            Toast.showFailureText(context, (int) R.string.CreationMobile_Wiki_SharePanel_InheritSettings);
        } else {
            Toast.showFailureText(context, (int) R.string.Doc_Share_ModifyFailed);
        }
    }
}
