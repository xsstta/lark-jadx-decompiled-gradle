package com.tt.option.p3381b;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;

/* renamed from: com.tt.option.b.b */
public interface AbstractC67599b {
    void clearFocusWhenHideSoftKeyboard(IAppContext iAppContext);

    void convertMouseEvent(WebView webView);

    int getScreenHeightForDesktop(Context context, int i, IAppContext iAppContext);

    int getScreenWidthForDesktop(Context context, IAppContext iAppContext);

    String interceptRpx2Px(String str);

    byte[] interceptRpx2Px(byte[] bArr);

    boolean interceptSetTitleBarMargin(Context context, View view);

    void interceptStatusBarToImmersed(View view, View view2, int i);

    boolean isDesktop();

    boolean shouldInterceptRpx2Px(String str);

    void triggerSoftKeyBoardShowEvent(int i, int i2, IAppContext iAppContext);
}
