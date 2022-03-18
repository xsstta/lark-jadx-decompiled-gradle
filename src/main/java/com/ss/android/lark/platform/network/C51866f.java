package com.ss.android.lark.platform.network;

import com.bytedance.lark.pb.basic.v1.InitSDKRequest;
import com.ss.android.lark.core.C36083a;

/* renamed from: com.ss.android.lark.platform.network.f */
public class C51866f {
    /* renamed from: a */
    public static int m201151a() {
        if (C36083a.m141487b().isUsPackage()) {
            return InitSDKRequest.PackageId.LARK.getValue();
        }
        return InitSDKRequest.PackageId.FEISHU.getValue();
    }
}
