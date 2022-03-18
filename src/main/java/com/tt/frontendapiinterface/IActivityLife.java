package com.tt.frontendapiinterface;

public interface IActivityLife {
    int getCurrentPageSize();

    void goback();

    boolean isTabFragment();

    void registerBackPressedListener(IBackPressedListener iBackPressedListener);

    void registerKeyboardListener(IKeyboardObserver iKeyboardObserver);

    void setKeepScreenOn(boolean z);

    void unRegisterBackPressedLinstener(IBackPressedListener iBackPressedListener);

    void unRegisterKeyboardListener(IKeyboardObserver iKeyboardObserver);
}
