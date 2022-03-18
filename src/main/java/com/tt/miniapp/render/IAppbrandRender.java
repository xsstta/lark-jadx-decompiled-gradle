package com.tt.miniapp.render;

import android.content.Context;
import android.view.View;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.IKeyBoardStateChange;
import com.tt.miniapp.component.nativeview.NativeViewManager;
import com.tt.option.ext.WebEventCallback;

public interface IAppbrandRender {
    void addNativeView(int i, String str, String str2, WebEventCallback webEventCallback);

    View getNativeView(int i);

    NativeViewManager getNativeViewManager();

    Object getRealRenderView();

    int getRenderHeight();

    int getRenderViewId();

    TracingCoreSpan getRenderViewTracingCoreSpan();

    int getRenderWidth();

    void hideConfirmBar();

    void initHost(IAppbrandRenderHost iAppbrandRenderHost);

    void initPopMenuConfig(AppConfig.Window window);

    boolean isRenderInBrowserEnabled();

    boolean isTemplateReady();

    void onActivityRequestPermissionsResult(int i, String[] strArr, int[] iArr);

    void onAnimationEnd(boolean z);

    void onAppInstallSuccess();

    void onAppStartLaunching();

    void onAttach(Context context);

    void onCreateView();

    void onDOMReady();

    void onDestroy();

    void onDestroyView();

    void onDetach();

    void onDetermineRenderContainerSize(int i, int i2);

    void onPageExit(int i);

    void onPause();

    void onPkgDownloadDone(boolean z);

    void onPostResume();

    void onStart();

    void onSubAppInstallSuccess();

    void onTrimMemory(int i);

    void onUserLeaveHint();

    void reLaunchForSSB();

    void registerKeyBoardStateChange(IKeyBoardStateChange iKeyBoardStateChange);

    void reloadWebUrl();

    void removeNativeView(int i, WebEventCallback webEventCallback);

    void sendOnAppRoute();

    void setDisableScroll(boolean z);

    void setOpenType(String str);

    void showConfirmBar();

    void showKeyboard(int i);

    void unregisterKeyBoardStateChange(IKeyBoardStateChange iKeyBoardStateChange);

    void updateArgument(String str, String str2, String str3, String str4);

    void updateBackgroundColor(int i);

    void updateNativeView(int i, String str, WebEventCallback webEventCallback);
}
