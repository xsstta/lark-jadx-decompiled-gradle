package com.bytedance.ies.xbridge.base.runtime.permission;

import android.app.Fragment;
import android.os.Bundle;
import com.bytedance.ies.xbridge.base.runtime.permission.Permissions;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0017J+\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¢\u0006\u0002\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/permission/PermissionFragment;", "Landroid/app/Fragment;", "()V", "mCallback", "Lcom/bytedance/ies/xbridge/base/runtime/permission/Permissions$Callback;", "getMCallback", "()Lcom/bytedance/ies/xbridge/base/runtime/permission/Permissions$Callback;", "setMCallback", "(Lcom/bytedance/ies/xbridge/base/runtime/permission/Permissions$Callback;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PermissionFragment extends Fragment {

    /* renamed from: a */
    private Permissions.Callback f37997a;

    /* renamed from: b */
    private HashMap f37998b;

    /* renamed from: a */
    public void mo53059a() {
        HashMap hashMap = this.f37998b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo53059a();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String[] stringArray = getArguments().getStringArray("permissions");
        if (stringArray == null) {
            Intrinsics.throwNpe();
        }
        requestPermissions(stringArray, 1);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Intrinsics.checkParameterIsNotNull(strArr, "permissions");
        Intrinsics.checkParameterIsNotNull(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        Permissions.Callback bVar = this.f37997a;
        if (bVar != null) {
            bVar.mo53063a(iArr);
        }
        getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }
}
