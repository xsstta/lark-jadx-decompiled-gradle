package com.ss.android.lark.passport_api;

import com.bytedance.lark.pb.basic.v1.InitSDKRequest;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IEnv {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ENV_TYPE {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface UNIT_TYPE {
    }

    /* renamed from: a */
    void mo145136a(InitSDKRequest.C15029a aVar);

    /* renamed from: d */
    int mo145139d();

    /* renamed from: e */
    String mo145140e();

    /* renamed from: f */
    String mo145141f();
}
