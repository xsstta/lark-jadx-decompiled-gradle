package com.tt.frontendapiinterface;

import android.app.Activity;
import android.view.View;
import com.tt.option.ext.WebEventCallback;
import java.util.List;

public interface IBaseRender {
    void addNativeView(int i, String str, String str2, WebEventCallback webEventCallback);

    List<IBackPressedListener> getBackPressedListener();

    Activity getCurrentActivity();

    View getNativeView(int i);

    String getPage();

    Object getRealRenderView();

    int getRenderHeight();

    int getRenderViewId();

    int getRenderWidth();

    int getTitleBarHeight();

    boolean hasNativeView(int i);

    void hideConfirmBar();

    void onStartPullDownRefresh();

    void onStopPullDownRefresh();

    boolean pullDownRefreshEnabled();

    void registerBackPressedListener(IBackPressedListener iBackPressedListener);

    void removeNativeView(int i, WebEventCallback webEventCallback);

    void setNavigationBarColor(String str, String str2);

    void setNavigationBarTitle(String str);

    void showConfirmBar();

    void showKeyboard(int i);

    void unregisterBackPressedListener(IBackPressedListener iBackPressedListener);

    void updateNativeView(int i, String str, WebEventCallback webEventCallback);
}
