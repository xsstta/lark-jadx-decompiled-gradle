package com.larksuite.framework.callback;

import com.larksuite.framework.callback.ICallback;

/* renamed from: com.larksuite.framework.callback.b */
public abstract class AbstractC25968b<T extends ICallback> implements AbstractC25972f {
    public T callback;
    private boolean isCanceled;

    public AbstractC25968b() {
    }

    @Override // com.larksuite.framework.callback.AbstractC25971e
    public boolean isCanceled() {
        return this.isCanceled;
    }

    @Override // com.larksuite.framework.callback.AbstractC25971e
    public void cancel() {
        this.isCanceled = true;
        this.callback = null;
    }

    public AbstractC25968b(T t) {
        this.callback = t;
    }
}
