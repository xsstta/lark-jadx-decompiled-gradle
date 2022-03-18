package com.ss.android.lark.guide.biz.onboarding.tour.entity;

import com.bytedance.lark.pb.onboarding.v1.PutTrustedMailRequest;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class TrustedMailRequestParam {

    /* renamed from: a */
    private String f99177a;

    /* renamed from: b */
    private int f99178b;

    @Target({ElementType.PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ProcessType {
    }

    /* renamed from: a */
    public String mo141378a() {
        return this.f99177a;
    }

    /* renamed from: b */
    public PutTrustedMailRequest.ProcessType mo141379b() {
        return PutTrustedMailRequest.ProcessType.fromValue(this.f99178b);
    }

    private TrustedMailRequestParam(String str, int i) {
        this.f99177a = str;
        this.f99178b = i;
    }

    /* renamed from: a */
    public static TrustedMailRequestParam m152259a(String str, int i) {
        return new TrustedMailRequestParam(str, i);
    }
}
