package com.ss.android.lark.rust.track;

import android.content.ComponentCallbacks2;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0015J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\tH&J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H&¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/rust/track/IRustTrackModuleDependency;", "", "getContext", "Landroid/content/Context;", "getPushMonitorConfig", "", "initCPUMonitor", "", "isAppFront", "", "isFeatureGatingEnable", "key", "defaultValue", "registerAppStateListener", "listener", "Lcom/ss/android/lark/rust/track/IRustTrackModuleDependency$AppStateChangeListener;", "registerComponentCallbacks", "callback", "Landroid/content/ComponentCallbacks2;", "unRegisterAppStateListener", "unRegisterComponentCallbacks", "AppStateChangeListener", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.rust.track.a */
public interface IRustTrackModuleDependency {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/rust/track/IRustTrackModuleDependency$AppStateChangeListener;", "", "onAppStateChange", "", "isAppFront", "", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.rust.track.a$a */
    public interface AppStateChangeListener {
        /* renamed from: a */
        void mo181561a(boolean z);
    }

    /* renamed from: a */
    void mo178120a();

    /* renamed from: a */
    void mo178121a(ComponentCallbacks2 componentCallbacks2);

    /* renamed from: a */
    void mo178122a(AppStateChangeListener aVar);

    /* renamed from: a */
    boolean mo178123a(String str, boolean z);

    /* renamed from: b */
    String mo178124b();

    /* renamed from: b */
    void mo178125b(ComponentCallbacks2 componentCallbacks2);

    /* renamed from: b */
    void mo178126b(AppStateChangeListener aVar);

    /* renamed from: c */
    boolean mo178127c();
}
