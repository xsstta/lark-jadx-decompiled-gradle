package com.ss.android.vc.common.lifecycle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.vc.meeting.framework.meeting.C61303k;

public abstract class BaseFragmentLifeCycleObserver implements DefaultLifecycleObserver {

    /* renamed from: a */
    public Fragment f151992a;

    /* renamed from: b */
    public C61303k f151993b;

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        DefaultLifecycleObserver.CC.$default$onCreate(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        DefaultLifecycleObserver.CC.$default$onDestroy(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        DefaultLifecycleObserver.CC.$default$onPause(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        DefaultLifecycleObserver.CC.$default$onResume(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        DefaultLifecycleObserver.CC.$default$onStart(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        DefaultLifecycleObserver.CC.$default$onStop(this, lifecycleOwner);
    }

    public BaseFragmentLifeCycleObserver(Fragment fragment, C61303k kVar) {
        this.f151992a = fragment;
        this.f151993b = kVar;
    }
}
