package com.bytedance.lynx.webview.glue.sdk111;

import com.bytedance.lynx.webview.glue.TextSelectedEventListener;

public abstract class ITTWebViewSettingssdk111 {
    public abstract void addActionModeMenuItem(String str, TextSelectedEventListener textSelectedEventListener);

    public abstract void addActionModeMenuItem(String str, TextSelectedEventListener textSelectedEventListener, int i);

    public abstract void addActionModeMenuItem(String str, Object obj, int i);

    public abstract void setDisabledActionModeMenuItems(int i);
}
