package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.internal.common.HandlerC21912c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

public final class cv extends Fragment implements AbstractC21667e {

    /* renamed from: a */
    private static WeakHashMap<FragmentActivity, WeakReference<cv>> f52849a = new WeakHashMap<>();

    /* renamed from: b */
    private Map<String, LifecycleCallback> f52850b = new ArrayMap();

    /* renamed from: c */
    private int f52851c = 0;

    /* renamed from: d */
    private Bundle f52852d;

    /* renamed from: a */
    public static cv m78720a(FragmentActivity fragmentActivity) {
        cv cvVar;
        WeakReference<cv> weakReference = f52849a.get(fragmentActivity);
        if (weakReference != null && (cvVar = weakReference.get()) != null) {
            return cvVar;
        }
        try {
            cv cvVar2 = (cv) fragmentActivity.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
            if (cvVar2 == null || cvVar2.isRemoving()) {
                cvVar2 = new cv();
                fragmentActivity.getSupportFragmentManager().beginTransaction().add(cvVar2, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
            }
            f52849a.put(fragmentActivity, new WeakReference<>(cvVar2));
            return cvVar2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC21667e
    /* renamed from: a */
    public final <T extends LifecycleCallback> T mo73471a(String str, Class<T> cls) {
        return cls.cast(this.f52850b.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC21667e
    /* renamed from: a */
    public final void mo73472a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f52850b.containsKey(str)) {
            this.f52850b.put(str, lifecycleCallback);
            if (this.f52851c > 0) {
                new HandlerC21912c(Looper.getMainLooper()).post(new cw(this, lifecycleCallback, str));
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

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f52851c = 1;
        this.f52852d = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f52850b.entrySet()) {
            entry.getValue().mo73327a(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f52851c = 2;
        for (LifecycleCallback lifecycleCallback : this.f52850b.values()) {
            lifecycleCallback.mo73329b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f52851c = 3;
        for (LifecycleCallback lifecycleCallback : this.f52850b.values()) {
            lifecycleCallback.mo73331c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.f52850b.values()) {
            lifecycleCallback.mo73326a(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry<String, LifecycleCallback> entry : this.f52850b.entrySet()) {
                Bundle bundle2 = new Bundle();
                entry.getValue().mo73330b(bundle2);
                bundle.putBundle(entry.getKey(), bundle2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f52851c = 4;
        for (LifecycleCallback lifecycleCallback : this.f52850b.values()) {
            lifecycleCallback.mo73332d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f52851c = 5;
        for (LifecycleCallback lifecycleCallback : this.f52850b.values()) {
            lifecycleCallback.mo73333e();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f52850b.values()) {
            lifecycleCallback.mo73328a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC21667e
    /* renamed from: a */
    public final /* synthetic */ Activity mo73470a() {
        return getActivity();
    }
}
