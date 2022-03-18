package com.bytedance.retrofit2;

import com.bytedance.retrofit2.CallAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.retrofit2.c */
public final class C20589c extends CallAdapter.Factory {

    /* renamed from: a */
    static final CallAdapter.Factory f50174a = new C20589c();

    C20589c() {
    }

    @Override // com.bytedance.retrofit2.CallAdapter.Factory
    public CallAdapter<?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (getRawType(type) != Call.class) {
            return null;
        }
        final Type e = C20653o.m75113e(type);
        return new CallAdapter<Call<?>>() {
            /* class com.bytedance.retrofit2.C20589c.C205901 */

            /* renamed from: b */
            public <R> Call<R> mo69250a(Call<R> call) {
                return call;
            }

            @Override // com.bytedance.retrofit2.CallAdapter
            /* renamed from: a */
            public Type mo69251a() {
                return e;
            }
        };
    }
}
