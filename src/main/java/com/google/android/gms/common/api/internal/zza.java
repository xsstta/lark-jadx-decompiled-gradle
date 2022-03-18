package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.common.HandlerC21912c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

public final class zza extends Fragment implements AbstractC21667e {

    /* renamed from: a */
    private static WeakHashMap<Activity, WeakReference<zza>> f52911a = new WeakHashMap<>();

    /* renamed from: b */
    private Map<String, LifecycleCallback> f52912b = new ArrayMap();

    /* renamed from: c */
    private int f52913c = 0;

    /* renamed from: d */
    private Bundle f52914d;

    /* renamed from: a */
    public static zza m78839a(Activity activity) {
        zza zza;
        WeakReference<zza> weakReference = f52911a.get(activity);
        if (weakReference != null && (zza = weakReference.get()) != null) {
            return zza;
        }
        try {
            zza zza2 = (zza) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (zza2 == null || zza2.isRemoving()) {
                zza2 = new zza();
                activity.getFragmentManager().beginTransaction().add(zza2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            f52911a.put(activity, new WeakReference<>(zza2));
            return zza2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC21667e
    /* renamed from: a */
    public final <T extends LifecycleCallback> T mo73471a(String str, Class<T> cls) {
        return cls.cast(this.f52912b.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC21667e
    /* renamed from: a */
    public final void mo73472a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f52912b.containsKey(str)) {
            this.f52912b.put(str, lifecycleCallback);
            if (this.f52913c > 0) {
                new HandlerC21912c(Looper.getMainLooper()).post(new cu(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC21667e
    /* renamed from: a */
    public final Activity mo73470a() {
        return getActivity();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f52913c = 1;
        this.f52914d = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f52912b.entrySet()) {
            entry.getValue().mo73327a(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    public final void onStart() {
        super.onStart();
        this.f52913c = 2;
        for (LifecycleCallback lifecycleCallback : this.f52912b.values()) {
            lifecycleCallback.mo73329b();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f52913c = 3;
        for (LifecycleCallback lifecycleCallback : this.f52912b.values()) {
            lifecycleCallback.mo73331c();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.f52912b.values()) {
            lifecycleCallback.mo73326a(i, i2, intent);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry<String, LifecycleCallback> entry : this.f52912b.entrySet()) {
                Bundle bundle2 = new Bundle();
                entry.getValue().mo73330b(bundle2);
                bundle.putBundle(entry.getKey(), bundle2);
            }
        }
    }

    public final void onStop() {
        super.onStop();
        this.f52913c = 4;
        for (LifecycleCallback lifecycleCallback : this.f52912b.values()) {
            lifecycleCallback.mo73332d();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f52913c = 5;
        for (LifecycleCallback lifecycleCallback : this.f52912b.values()) {
            lifecycleCallback.mo73333e();
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f52912b.values()) {
            lifecycleCallback.mo73328a(str, fileDescriptor, printWriter, strArr);
        }
    }
}
