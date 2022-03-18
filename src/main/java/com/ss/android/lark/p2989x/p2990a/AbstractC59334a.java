package com.ss.android.lark.p2989x.p2990a;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.basic.v1.InitSDKRequest;
import com.larksuite.framework.callback.Entity.ErrorResult;

/* renamed from: com.ss.android.lark.x.a.a */
public interface AbstractC59334a {

    /* renamed from: com.ss.android.lark.x.a.a$a */
    public interface AbstractC59335a {
        boolean isGuest(String str);
    }

    /* renamed from: com.ss.android.lark.x.a.a$b */
    public interface AbstractC59336b {
        /* renamed from: a */
        void mo178419a();

        /* renamed from: a */
        void mo178420a(ErrorResult errorResult);

        /* renamed from: a */
        void mo178421a(String str, String str2);

        /* renamed from: b */
        void mo178422b(String str, String str2);

        /* renamed from: c */
        void mo178423c(String str, String str2);
    }

    /* renamed from: a */
    Context mo178414a();

    /* renamed from: a */
    void mo178415a(InitSDKRequest.EnvType envType, String str, DomainSettings domainSettings);

    /* renamed from: b */
    AbstractC59336b mo178416b();

    /* renamed from: c */
    int mo178417c();

    /* renamed from: d */
    AbstractC59335a mo178418d();
}
