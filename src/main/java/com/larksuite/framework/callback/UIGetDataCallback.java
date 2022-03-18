package com.larksuite.framework.callback;

import com.larksuite.framework.callback.Entity.ErrorResult;

public class UIGetDataCallback<Data> extends AbstractC25968b<IGetDataCallback<Data>> implements IGetDataCallback<Data> {
    public void onErrored(ErrorResult errorResult) {
    }

    public void onSuccessed(Data data) {
    }

    public UIGetDataCallback() {
    }

    public UIGetDataCallback(IGetDataCallback<Data> iGetDataCallback) {
        super(iGetDataCallback);
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback
    public final void onError(final ErrorResult errorResult) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.larksuite.framework.callback.UIGetDataCallback.RunnableC259662 */

            public void run() {
                if (!UIGetDataCallback.this.isCanceled()) {
                    if (UIGetDataCallback.this.callback != null) {
                        ((IGetDataCallback) UIGetDataCallback.this.callback).onError(errorResult);
                    } else {
                        UIGetDataCallback.this.onErrored(errorResult);
                    }
                    UIGetDataCallback.this.cancel();
                }
            }
        });
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
    public final void onSuccess(final Data data) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.larksuite.framework.callback.UIGetDataCallback.RunnableC259651 */

            /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: com.larksuite.framework.callback.UIGetDataCallback */
            /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: com.larksuite.framework.callback.IGetDataCallback */
            /* JADX WARN: Multi-variable type inference failed */
            public void run() {
                if (!UIGetDataCallback.this.isCanceled()) {
                    if (UIGetDataCallback.this.callback != null) {
                        ((IGetDataCallback) UIGetDataCallback.this.callback).onSuccess(data);
                    } else {
                        UIGetDataCallback.this.onSuccessed(data);
                    }
                    UIGetDataCallback.this.cancel();
                }
            }
        });
    }
}
