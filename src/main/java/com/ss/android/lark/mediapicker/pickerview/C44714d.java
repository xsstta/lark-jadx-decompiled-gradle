package com.ss.android.lark.mediapicker.pickerview;

import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.ss.android.lark.mediapicker.p2241a.AbstractC44616b;
import com.ss.android.lark.mediapicker.p2241a.AbstractC44617c;

/* renamed from: com.ss.android.lark.mediapicker.pickerview.d */
public class C44714d extends Fragment {

    /* renamed from: a */
    private SparseArray<AbstractC44617c> f113286a = new SparseArray<>(2);

    /* renamed from: b */
    private SparseArray<AbstractC44616b> f113287b = new SparseArray<>(2);

    /* renamed from: b */
    private static C44714d m177332b(FragmentActivity fragmentActivity) {
        return (C44714d) fragmentActivity.getSupportFragmentManager().findFragmentByTag("PickerHelperFragment");
    }

    /* renamed from: a */
    static C44714d m177331a(FragmentActivity fragmentActivity) {
        Exception e;
        C44714d dVar;
        boolean z;
        C44714d dVar2;
        try {
            dVar = m177332b(fragmentActivity);
            if (dVar == null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return dVar;
            }
            try {
                dVar2 = new C44714d();
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                return dVar;
            }
            try {
                FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                supportFragmentManager.beginTransaction().add(dVar2, "PickerHelperFragment").commitAllowingStateLoss();
                supportFragmentManager.executePendingTransactions();
                return dVar2;
            } catch (Exception e3) {
                e = e3;
                dVar = dVar2;
                e.printStackTrace();
                return dVar;
            }
        } catch (Exception e4) {
            e = e4;
            dVar = null;
            e.printStackTrace();
            return dVar;
        }
    }

    /* renamed from: a */
    public void mo158385a(Intent intent, int i, AbstractC44617c cVar) {
        this.f113286a.put(i, cVar);
        super.startActivityForResult(intent, i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AbstractC44617c cVar = this.f113286a.get(i);
        if (cVar != null) {
            this.f113286a.remove(i);
            cVar.mo158125a(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        AbstractC44616b bVar = this.f113287b.get(i);
        if (bVar != null) {
            int length = iArr.length;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = true;
                    break;
                } else if (iArr[i2] != 0) {
                    break;
                } else {
                    i2++;
                }
            }
            bVar.mo158124a(z);
            this.f113287b.remove(i);
        }
    }

    /* renamed from: a */
    public void mo158386a(String[] strArr, int i, AbstractC44616b bVar) {
        Context context = getContext();
        boolean z = false;
        if (context != null) {
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = true;
                    break;
                }
                if (ActivityCompat.checkSelfPermission(context.getApplicationContext(), strArr[i2]) != 0) {
                    break;
                }
                i2++;
            }
            if (z) {
                bVar.mo158124a(true);
                return;
            }
            this.f113287b.put(i, bVar);
            requestPermissions(strArr, i);
        } else if (bVar != null) {
            bVar.mo158124a(false);
        }
    }
}
