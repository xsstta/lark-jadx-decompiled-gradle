package com.ss.android.lark.permission.rxPermission;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import com.ss.android.lark.permission.C51325d;
import io.reactivex.p3457e.C68296b;
import java.util.HashMap;
import java.util.Map;

public class RxPermissionsFragment extends Fragment {

    /* renamed from: a */
    private Map<String, C68296b<C51325d>> f127830a = new HashMap();

    /* renamed from: b */
    private boolean f127831b;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo176909a(String[] strArr) {
        requestPermissions(strArr, 42);
    }

    /* renamed from: d */
    public boolean mo176914d(String str) {
        return this.f127830a.containsKey(str);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    /* renamed from: c */
    public C68296b<C51325d> mo176913c(String str) {
        return this.f127830a.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo176915e(String str) {
        if (this.f127831b) {
            Log.d("RxPermissions", str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo176911a(String str) {
        if (getActivity().checkSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo176912b(String str) {
        return getActivity().getPackageManager().isPermissionRevokedByPolicy(str, getActivity().getPackageName());
    }

    /* renamed from: a */
    public C68296b<C51325d> mo176908a(String str, C68296b<C51325d> bVar) {
        return this.f127830a.put(str, bVar);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 42) {
            boolean[] zArr = new boolean[strArr.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                zArr[i2] = shouldShowRequestPermissionRationale(strArr[i2]);
            }
            mo176910a(strArr, iArr, zArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo176910a(String[] strArr, int[] iArr, boolean[] zArr) {
        boolean z;
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            mo176915e("onRequestPermissionsResult  " + strArr[i]);
            C68296b<C51325d> bVar = this.f127830a.get(strArr[i]);
            if (bVar == null) {
                Log.e("RxPermissions", "RxPermissions.onRequestPermissionsResult invoked but didn't find the corresponding permission request.");
                return;
            }
            this.f127830a.remove(strArr[i]);
            if (iArr[i] == 0) {
                z = true;
            } else {
                z = false;
            }
            bVar.onNext(new C51325d(strArr[i], z, zArr[i]));
            bVar.onComplete();
        }
    }
}
