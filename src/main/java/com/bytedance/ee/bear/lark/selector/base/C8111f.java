package com.bytedance.ee.bear.lark.selector.base;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;

/* renamed from: com.bytedance.ee.bear.lark.selector.base.f */
public class C8111f<Data> implements IGetDataCallback<Data> {

    /* renamed from: a */
    public IGetDataCallback f21672a;

    public C8111f(IGetDataCallback<Data> iGetDataCallback) {
        this.f21672a = iGetDataCallback;
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback
    public final void onError(final ErrorResult errorResult) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.bytedance.ee.bear.lark.selector.base.C8111f.RunnableC81132 */

            public void run() {
                if (C8111f.this.f21672a != null) {
                    C8111f.this.f21672a.onError(errorResult);
                }
            }
        });
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
    public final void onSuccess(final Data data) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.bytedance.ee.bear.lark.selector.base.C8111f.RunnableC81121 */

            /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: com.larksuite.framework.callback.IGetDataCallback */
            /* JADX WARN: Multi-variable type inference failed */
            public void run() {
                if (C8111f.this.f21672a != null) {
                    C8111f.this.f21672a.onSuccess(data);
                }
            }
        });
    }
}
