package com.ss.android.lark.dynamicconfig.p1819a;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.InitSDKRequest;

/* renamed from: com.ss.android.lark.dynamicconfig.a.a */
public interface AbstractC36883a {
    Context getContext();

    int getEnv2Type();

    InitSDKRequest.EnvType getEnvType();

    String getUserUnit();

    boolean isLogin();
}
