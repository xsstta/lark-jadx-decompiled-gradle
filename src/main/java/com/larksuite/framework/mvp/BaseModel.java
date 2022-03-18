package com.larksuite.framework.mvp;

import com.larksuite.framework.callback.CallbackManager;

public class BaseModel implements IModel {
    private CallbackManager mCallbackManager = new CallbackManager();

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    public CallbackManager getCallbackManager() {
        return this.mCallbackManager;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.mCallbackManager.cancelCallbacks();
    }
}
