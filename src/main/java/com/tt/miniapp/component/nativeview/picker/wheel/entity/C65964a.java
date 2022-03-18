package com.tt.miniapp.component.nativeview.picker.wheel.entity;

import com.tt.miniapp.component.nativeview.picker.wheel.C65949b;
import com.tt.miniapphost.data.ContextSingletonInstance;
import java.lang.ref.WeakReference;

/* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.entity.a */
public class C65964a {

    /* renamed from: a */
    private WeakReference<C65949b> f166492a;

    /* renamed from: a */
    public static C65964a m258366a() {
        return ContextSingletonInstance.getInstance().multiPickerManager;
    }

    /* renamed from: b */
    public C65949b mo230926b() {
        WeakReference<C65949b> weakReference = this.f166492a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public void mo230925a(C65949b bVar) {
        this.f166492a = new WeakReference<>(bVar);
    }
}
