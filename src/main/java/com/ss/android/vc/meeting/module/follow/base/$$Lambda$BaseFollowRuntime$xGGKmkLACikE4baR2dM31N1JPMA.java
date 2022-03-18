package com.ss.android.vc.meeting.module.follow.base;

import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.VideoChatUser;

/* renamed from: com.ss.android.vc.meeting.module.follow.base.-$$Lambda$BaseFollowRuntime$xGGKmkLACikE4baR2dM31N1JPMA  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$BaseFollowRuntime$xGGKmkLACikE4baR2dM31N1JPMA implements GetUserInfoListener {
    public static final /* synthetic */ $$Lambda$BaseFollowRuntime$xGGKmkLACikE4baR2dM31N1JPMA INSTANCE = new $$Lambda$BaseFollowRuntime$xGGKmkLACikE4baR2dM31N1JPMA();

    private /* synthetic */ $$Lambda$BaseFollowRuntime$xGGKmkLACikE4baR2dM31N1JPMA() {
    }

    @Override // com.ss.android.vc.net.service.GetUserInfoListener
    public final void onGetUserInfo(VideoChatUser videoChatUser) {
        BaseFollowRuntime.m241320c(videoChatUser);
    }
}
