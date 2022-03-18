package com.huawei.hmf.tasks.p1012a;

import android.app.Activity;
import android.app.Fragment;
import com.huawei.hmf.tasks.AbstractC23428b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: com.huawei.hmf.tasks.a.g */
public final class FragmentC23427g extends Fragment {

    /* renamed from: b */
    private static final WeakHashMap<Activity, WeakReference<FragmentC23427g>> f57759b = new WeakHashMap<>();

    /* renamed from: a */
    private final List<WeakReference<AbstractC23428b<?>>> f57760a = new ArrayList();

    public final void onStop() {
        super.onStop();
        synchronized (this.f57760a) {
            for (WeakReference<AbstractC23428b<?>> weakReference : this.f57760a) {
                AbstractC23428b<?> bVar = weakReference.get();
                if (bVar != null) {
                    bVar.mo81821a();
                }
            }
            this.f57760a.clear();
        }
    }
}
