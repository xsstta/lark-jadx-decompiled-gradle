package com.ss.android.vc.meeting.module.follow;

import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.VideoChatUser;

/* renamed from: com.ss.android.vc.meeting.module.follow.-$$Lambda$FollowControl$SyS2ammaFssAy6Ch7qeeG2nbE3s  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$FollowControl$SyS2ammaFssAy6Ch7qeeG2nbE3s implements GetUserInfoListener {
    public static final /* synthetic */ $$Lambda$FollowControl$SyS2ammaFssAy6Ch7qeeG2nbE3s INSTANCE = new $$Lambda$FollowControl$SyS2ammaFssAy6Ch7qeeG2nbE3s();

    private /* synthetic */ $$Lambda$FollowControl$SyS2ammaFssAy6Ch7qeeG2nbE3s() {
    }

    @Override // com.ss.android.vc.net.service.GetUserInfoListener
    public final void onGetUserInfo(VideoChatUser videoChatUser) {
        FollowControl.m241019a(videoChatUser);
    }
}
