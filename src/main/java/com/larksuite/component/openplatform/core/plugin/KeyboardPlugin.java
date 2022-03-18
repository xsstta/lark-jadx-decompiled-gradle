package com.larksuite.component.openplatform.core.plugin;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.component.nativeview.NativeViewManager;
import com.tt.miniapp.view.keyboard.KeyboardInputView;
import com.tt.miniapp.view.keyboard.KeyboardLayout;

public class KeyboardPlugin extends OPPlugin {
    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    /* access modifiers changed from: private */
    public static class KeyboardResponse extends C25921b {
        private KeyboardResponse() {
        }
    }

    private View getContentView(Activity activity) {
        return activity.findViewById(16908290);
    }

    private KeyboardInputView findKeyboardInputView(Activity activity) {
        View contentView = getContentView(activity);
        if (contentView instanceof ViewGroup) {
            return (KeyboardInputView) findViewByClass((ViewGroup) contentView, KeyboardInputView.class);
        }
        return null;
    }

    private boolean isKeyBoardClosed(Activity activity) {
        View findViewByClass = findViewByClass(getContentView(activity), KeyboardLayout.class);
        if (findViewByClass == null || !(findViewByClass instanceof KeyboardLayout)) {
            return false;
        }
        KeyboardLayout keyboardLayout = (KeyboardLayout) findViewByClass;
        keyboardLayout.setActivity(activity);
        if (!keyboardLayout.mo233589a()) {
            return true;
        }
        return false;
    }

    @LKPluginFunction(async = true, eventName = {"hideKeyboard"})
    public void hideKeyboard(LKEvent lKEvent, AbstractC25897h<KeyboardResponse> hVar) {
        keyboard(hVar, lKEvent);
    }

    private boolean closeKeyboard(View view, Activity activity) {
        if (isKeyBoardClosed(activity)) {
            AppBrandLogger.m52830i("KeyboardPlugin", "close keyboard is closed");
            return true;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (view != null && inputMethodManager != null) {
            return inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        AppBrandLogger.m52829e("KeyboardPlugin", "close keyboard is fail");
        return false;
    }

    private View findViewByClass(View view, Class cls) {
        if (view == null) {
            return null;
        }
        if (TextUtils.equals(view.getClass().getName(), cls.getName())) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View findViewByClass = findViewByClass(viewGroup.getChildAt(i), cls);
            if (findViewByClass != null) {
                return findViewByClass;
            }
        }
        return null;
    }

    private void keyboard(AbstractC25897h<KeyboardResponse> hVar, LKEvent lKEvent) {
        AppBrandLogger.m52830i("KeyboardPlugin", "ApiKeyboardCtrl ", lKEvent.mo92146m(), ",", lKEvent.mo92147n());
        KeyboardResponse keyboardResponse = new KeyboardResponse();
        if (!(lKEvent.mo92145l() instanceof Activity)) {
            keyboardResponse.mErrorMessage = "activity is null";
            hVar.callback(keyboardResponse);
            return;
        }
        try {
            handleKeyboardForApp((Activity) lKEvent.mo92145l(), lKEvent, hVar);
        } catch (Throwable th) {
            keyboardResponse.mErrorMessage = th.getMessage();
            hVar.callback(keyboardResponse);
        }
    }

    private void handleKeyboardForApp(Activity activity, LKEvent lKEvent, AbstractC25897h<KeyboardResponse> hVar) {
        KeyboardResponse keyboardResponse = new KeyboardResponse();
        if (TextUtils.equals(lKEvent.mo92146m(), "hideKeyboard")) {
            RenderViewManager.IRender currentIRender = AppbrandApplicationImpl.getInst(getEventContext(lKEvent)).getRenderViewManager().getCurrentIRender();
            if (currentIRender != null) {
                NativeViewManager nativeViewManager = currentIRender.getNativeViewManager();
                if (nativeViewManager != null) {
                    View focusedInput = nativeViewManager.getFocusedInput();
                    if (focusedInput == null) {
                        keyboardResponse.mErrorMessage = "focused input is null";
                        hVar.callback(keyboardResponse);
                    } else if (closeKeyboard(focusedInput, activity)) {
                        hVar.callback(keyboardResponse);
                    } else {
                        keyboardResponse.mErrorMessage = "close keyboard fail";
                        hVar.callback(keyboardResponse);
                    }
                } else {
                    keyboardResponse.mErrorMessage = "native view manager is null";
                    hVar.callback(keyboardResponse);
                }
            } else {
                keyboardResponse.mErrorMessage = "current render is null";
                hVar.callback(keyboardResponse);
            }
        }
    }
}
