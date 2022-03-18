package com.bytedance.ee.bear.contract.darkmode;

import com.bytedance.ee.bear.binder.annotation.NewRemoteService;

@NewRemoteService
/* renamed from: com.bytedance.ee.bear.contract.darkmode.c */
public interface AbstractC5128c {

    /* renamed from: com.bytedance.ee.bear.contract.darkmode.c$a */
    public interface AbstractC5129a {
        void onChanged(int i);
    }

    void addDarkModeListener(BinderIDarkModeChangedListener binderIDarkModeChangedListener);

    void notifyDarkModeChangedListeners(int i);

    void removeDarkModeListener(BinderIDarkModeChangedListener binderIDarkModeChangedListener);
}
