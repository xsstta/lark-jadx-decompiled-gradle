package com.bytedance.ee.bear.photopicker.photo;

import android.content.Intent;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

/* renamed from: com.bytedance.ee.bear.photopicker.photo.d */
public class C10537d extends Fragment {

    /* renamed from: a */
    private final SparseArray<AbstractC10538a> f28286a = new SparseArray<>(2);

    /* renamed from: com.bytedance.ee.bear.photopicker.photo.d$a */
    public interface AbstractC10538a {
        /* renamed from: a */
        void mo39831a(int i, int i2, Intent intent);
    }

    /* renamed from: b */
    private static C10537d m43635b(FragmentActivity fragmentActivity) {
        return (C10537d) fragmentActivity.getSupportFragmentManager().findFragmentByTag("PickerHelperFragment");
    }

    /* renamed from: a */
    static C10537d m43634a(FragmentActivity fragmentActivity) {
        Exception e;
        C10537d dVar;
        boolean z;
        C10537d dVar2;
        try {
            dVar = m43635b(fragmentActivity);
            if (dVar == null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return dVar;
            }
            try {
                dVar2 = new C10537d();
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
    public void mo39918a(int i, AbstractC10538a aVar) {
        this.f28286a.put(i, aVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AbstractC10538a aVar = this.f28286a.get(i);
        if (aVar != null) {
            aVar.mo39831a(i, i2, intent);
            this.f28286a.remove(i);
        }
    }
}
