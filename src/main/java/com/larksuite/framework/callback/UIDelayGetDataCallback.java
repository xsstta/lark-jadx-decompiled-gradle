package com.larksuite.framework.callback;

import com.larksuite.framework.callback.Entity.ErrorResult;

public class UIDelayGetDataCallback<Data> extends AbstractC25968b<IGetDataCallback<Data>> implements IGetDataCallback<Data> {
    private int mDelayTime;
    private long mStartTime = System.currentTimeMillis();

    @Override // com.larksuite.framework.callback.IGetDataCallback
    public void onError(final ErrorResult errorResult) {
        UICallbackExecutor.executeDelayed(new Runnable() {
            /* class com.larksuite.framework.callback.UIDelayGetDataCallback.RunnableC259642 */

            public void run() {
                if (UIDelayGetDataCallback.this.callback != null) {
                    ((IGetDataCallback) UIDelayGetDataCallback.this.callback).onError(errorResult);
                    UIDelayGetDataCallback.this.cancel();
                }
            }
        }, Math.max(((long) this.mDelayTime) - (System.currentTimeMillis() - this.mStartTime), 0L));
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
    public void onSuccess(final Data data) {
        UICallbackExecutor.executeDelayed(new Runnable() {
            /* class com.larksuite.framework.callback.UIDelayGetDataCallback.RunnableC259631 */

            /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.larksuite.framework.callback.IGetDataCallback */
            /* JADX WARN: Multi-variable type inference failed */
            public void run() {
                if (UIDelayGetDataCallback.this.callback != null) {
                    ((IGetDataCallback) UIDelayGetDataCallback.this.callback).onSuccess(data);
                    UIDelayGetDataCallback.this.cancel();
                }
            }
        }, Math.max(((long) this.mDelayTime) - (System.currentTimeMillis() - this.mStartTime), 0L));
    }

    public UIDelayGetDataCallback(IGetDataCallback<Data> iGetDataCallback, int i) {
        super(iGetDataCallback);
        this.mDelayTime = i;
    }
}
