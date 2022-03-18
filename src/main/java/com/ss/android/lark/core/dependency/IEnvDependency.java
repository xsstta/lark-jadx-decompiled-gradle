package com.ss.android.lark.core.dependency;

import com.bytedance.lark.pb.basic.v1.InitSDKRequest;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IEnvDependency {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ENV_TYPE {
    }

    /* renamed from: a */
    int mo132692a();

    /* renamed from: a */
    void mo132693a(InitSDKRequest.C15029a aVar);

    /* renamed from: b */
    String mo132694b();

    /* renamed from: c */
    String mo132695c();
}
