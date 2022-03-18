package com.bytedance.ies.xbridge.base.runtime.depend;

import android.app.Activity;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\f"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/depend/IHostPermissionDepend;", "", "hasPermission", "", "activity", "Landroid/app/Activity;", "permission", "", "requestPermission", "", "callback", "Lcom/bytedance/ies/xbridge/base/runtime/depend/OnPermissionGrantCallback;", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface IHostPermissionDepend {
    boolean hasPermission(Activity activity, String str);

    void requestPermission(Activity activity, OnPermissionGrantCallback onPermissionGrantCallback, String str);
}
