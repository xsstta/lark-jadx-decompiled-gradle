package com.larksuite.framework.callback;

import com.larksuite.framework.callback.Entity.ErrorResult;

/* renamed from: com.larksuite.framework.callback.i */
public final class C25975i<Data> extends AbstractC25968b<IGetDataCallback<Data>> implements IGetDataCallback<Data> {
    public C25975i(IGetDataCallback<Data> iGetDataCallback) {
        super(iGetDataCallback);
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback
    public void onError(final ErrorResult errorResult) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.larksuite.framework.callback.C25975i.RunnableC259772 */

            public void run() {
                if (C25975i.this.callback != null) {
                    ((IGetDataCallback) C25975i.this.callback).onError(errorResult);
                }
            }
        });
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
    public void onSuccess(final Data data) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.larksuite.framework.callback.C25975i.RunnableC259761 */

            /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.larksuite.framework.callback.IGetDataCallback */
            /* JADX WARN: Multi-variable type inference failed */
            public void run() {
                if (C25975i.this.callback != null) {
                    ((IGetDataCallback) C25975i.this.callback).onSuccess(data);
                }
            }
        });
    }
}
