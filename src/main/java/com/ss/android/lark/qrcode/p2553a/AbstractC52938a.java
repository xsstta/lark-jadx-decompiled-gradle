package com.ss.android.lark.qrcode.p2553a;

import android.content.Context;
import com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler;
import java.util.List;

/* renamed from: com.ss.android.lark.qrcode.a.a */
public interface AbstractC52938a {

    /* renamed from: com.ss.android.lark.qrcode.a.a$a */
    public interface AbstractC52939a {
        /* renamed from: a */
        void mo180848a(int i);

        /* renamed from: a */
        void mo180849a(String str);
    }

    /* renamed from: a */
    void mo178100a();

    /* renamed from: a */
    void mo178101a(Context context);

    /* renamed from: a */
    void mo178102a(Context context, AbstractC52939a aVar);

    /* renamed from: a */
    boolean mo178103a(String str);

    /* renamed from: a */
    boolean mo178104a(String str, Context context, int i);

    /* renamed from: b */
    List<IQRCodeScanResultHandler> mo178105b();

    /* renamed from: b */
    void mo178106b(Context context);

    /* renamed from: b */
    boolean mo178107b(String str);

    /* renamed from: c */
    List<IQRCodeScanResultHandler> mo178108c();

    /* renamed from: c */
    boolean mo178109c(String str);

    /* renamed from: d */
    boolean mo178110d();

    /* renamed from: e */
    long mo178111e();
}
