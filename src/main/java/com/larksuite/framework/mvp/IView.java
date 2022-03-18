package com.larksuite.framework.mvp;

import com.larksuite.framework.mvp.IView.IViewDelegate;

public interface IView<VD extends IViewDelegate> extends ILifecycle {

    public interface IViewDelegate {
    }

    void setViewDelegate(VD vd);
}
