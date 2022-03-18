package com.larksuite.framework.mvp;

import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.larksuite.framework.mvp.IView.IViewDelegate;

public abstract class BasePresenter<M extends IModel, V extends IView<VD>, VD extends IView.IViewDelegate> implements AbstractC26035c<M, V> {
    private M model;
    public V view;

    /* access modifiers changed from: protected */
    public abstract VD createViewDelegate();

    public BasePresenter() {
    }

    public M getModel() {
        return this.model;
    }

    public V getView() {
        return this.view;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.view.create();
        this.model.create();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.model.destroy();
        UICallbackExecutor.post(new Runnable() {
            /* class com.larksuite.framework.mvp.BasePresenter.RunnableC260321 */

            public void run() {
                BasePresenter.this.view.destroy();
            }
        });
    }

    public void setModel(M m) {
        this.model = m;
    }

    public void setView(V v) {
        this.view = v;
    }

    public BasePresenter(M m, V v) {
        this.view = v;
        this.model = m;
        v.setViewDelegate(createViewDelegate());
    }
}
