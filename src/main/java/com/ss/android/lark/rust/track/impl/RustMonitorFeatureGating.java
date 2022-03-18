package com.ss.android.lark.rust.track.impl;

import com.ss.android.lark.rust.track.C53165b;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/rust/track/impl/RustMonitorFeatureGating;", "", "()V", "FEATURE_KEY_PUSH_MONITOR_ENABLE", "", "isPushMonitorEnable", "", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.rust.track.impl.d */
public final class RustMonitorFeatureGating {

    /* renamed from: a */
    public static final RustMonitorFeatureGating f131484a = new RustMonitorFeatureGating();

    private RustMonitorFeatureGating() {
    }

    /* renamed from: a */
    public final boolean mo181599a() {
        return C53165b.m205769a().mo178123a("messenger.large.chat.push.optimize", false);
    }
}
