package com.bytedance.retrofit2;

import com.bytedance.retrofit2.CallAdapter;
import com.bytedance.retrofit2.client.Request;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.retrofit2.f */
public final class C20598f extends CallAdapter.Factory {

    /* renamed from: a */
    final Executor f50193a;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.f$a */
    public static final class C20600a<T> implements Call<T>, IMetricsCollect {

        /* renamed from: a */
        final Executor f50196a;

        /* renamed from: b */
        final Call<T> f50197b;

        @Override // com.bytedance.retrofit2.Call
        public void cancel() {
            this.f50197b.cancel();
        }

        @Override // com.bytedance.retrofit2.Call
        public SsResponse execute() throws Exception {
            return this.f50197b.execute();
        }

        @Override // com.bytedance.retrofit2.Call
        public boolean isCanceled() {
            return this.f50197b.isCanceled();
        }

        @Override // com.bytedance.retrofit2.Call
        public boolean isExecuted() {
            return this.f50197b.isExecuted();
        }

        @Override // com.bytedance.retrofit2.Call
        public Request request() {
            return this.f50197b.request();
        }

        @Override // com.bytedance.retrofit2.Call, java.lang.Object
        public Call<T> clone() {
            return new C20600a(this.f50196a, this.f50197b.clone());
        }

        @Override // com.bytedance.retrofit2.IMetricsCollect
        public void doCollect() {
            Call<T> call = this.f50197b;
            if (call instanceof IMetricsCollect) {
                ((IMetricsCollect) call).doCollect();
            }
        }

        @Override // com.bytedance.retrofit2.Call
        public void enqueue(final Callback<T> callback) {
            Objects.requireNonNull(callback, "callback == null");
            this.f50197b.enqueue(new ExpandCallback<T>() {
                /* class com.bytedance.retrofit2.C20598f.C20600a.C206011 */

                @Override // com.bytedance.retrofit2.ExpandCallback
                public void onAsyncPreRequest(RequestBuilder requestBuilder) {
                    Callback callback = callback;
                    if (callback instanceof ExpandCallback) {
                        ((ExpandCallback) callback).onAsyncPreRequest(requestBuilder);
                    }
                }

                @Override // com.bytedance.retrofit2.ExpandCallback
                public void onAsyncResponse(Call<T> call, SsResponse<T> ssResponse) {
                    Callback callback = callback;
                    if (callback instanceof ExpandCallback) {
                        ((ExpandCallback) callback).onAsyncResponse(call, ssResponse);
                    }
                }

                @Override // com.bytedance.retrofit2.Callback
                public void onFailure(Call<T> call, final Throwable th) {
                    C20600a.this.f50196a.execute(new Runnable() {
                        /* class com.bytedance.retrofit2.C20598f.C20600a.C206011.RunnableC206032 */

                        public void run() {
                            callback.onFailure(C20600a.this, th);
                        }
                    });
                }

                @Override // com.bytedance.retrofit2.Callback
                public void onResponse(Call<T> call, final SsResponse<T> ssResponse) {
                    C20600a.this.f50196a.execute(new Runnable() {
                        /* class com.bytedance.retrofit2.C20598f.C20600a.C206011.RunnableC206021 */

                        public void run() {
                            if (C20600a.this.f50197b.isCanceled()) {
                                callback.onFailure(C20600a.this, new IOException("Canceled"));
                            } else {
                                callback.onResponse(C20600a.this, ssResponse);
                            }
                        }
                    });
                }
            });
        }

        C20600a(Executor executor, Call<T> call) {
            this.f50196a = executor;
            this.f50197b = call;
        }
    }

    C20598f(Executor executor) {
        this.f50193a = executor;
    }

    @Override // com.bytedance.retrofit2.CallAdapter.Factory
    public CallAdapter<Call<?>> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (getRawType(type) != Call.class) {
            return null;
        }
        final Type e = C20653o.m75113e(type);
        return new CallAdapter<Call<?>>() {
            /* class com.bytedance.retrofit2.C20598f.C205991 */

            @Override // com.bytedance.retrofit2.CallAdapter
            /* renamed from: a */
            public Type mo69251a() {
                return e;
            }

            /* renamed from: b */
            public <R> Call<R> mo69250a(Call<R> call) {
                return new C20600a(C20598f.this.f50193a, call);
            }
        };
    }
}
