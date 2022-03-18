package com.ss.android.vc.meeting.module.follow.base;

import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.VideoChatUser;

/* renamed from: com.ss.android.vc.meeting.module.follow.base.-$$Lambda$BaseFollowRuntime$i8VI5JFNWnp6Bx_x4XYBDtIruu8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$BaseFollowRuntime$i8VI5JFNWnp6Bx_x4XYBDtIruu8 implements GetUserInfoListener {
    public static final /* synthetic */ $$Lambda$BaseFollowRuntime$i8VI5JFNWnp6Bx_x4XYBDtIruu8 INSTANCE = new $$Lambda$BaseFollowRuntime$i8VI5JFNWnp6Bx_x4XYBDtIruu8();

    private /* synthetic */ $$Lambda$BaseFollowRuntime$i8VI5JFNWnp6Bx_x4XYBDtIruu8() {
    }

    @Override // com.ss.android.vc.net.service.GetUserInfoListener
    public final void onGetUserInfo(VideoChatUser videoChatUser) {
        BaseFollowRuntime.m241317a(videoChatUser);
    }
}
