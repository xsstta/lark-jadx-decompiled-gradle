package com.ss.android.lark.mm.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.ResultReceiver;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.p2288b.C45855f;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J \u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0002J\u0012\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0019\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0019\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\bJ\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/mm/utils/SoftKeyboardUtil;", "", "()V", "adjustLayout", "", "context", "Landroid/content/Context;", "rootView", "Landroid/view/View;", "bottomView", "getNavigationBarHeight", "", "getRealMetricsHeight", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "Landroid/view/Display;", "metrics", "Landroid/util/DisplayMetrics;", "defHeight", "getSoftButtonsBarHeight", "view", "hideKeyboard", "isKeyBoardShowing", "", "activity", "Landroid/app/Activity;", "showKeyboard", "resultReceiver", "Landroid/os/ResultReceiver;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.utils.u */
public final class SoftKeyboardUtil {

    /* renamed from: a */
    public static final SoftKeyboardUtil f118667a = new SoftKeyboardUtil();

    private SoftKeyboardUtil() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onGlobalLayout"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.utils.u$a */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC47120a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ View f118668a;

        /* renamed from: b */
        final /* synthetic */ int f118669b;

        /* renamed from: c */
        final /* synthetic */ View f118670c;

        ViewTreeObserver$OnGlobalLayoutListenerC47120a(View view, int i, View view2) {
            this.f118668a = view;
            this.f118669b = i;
            this.f118670c = view2;
        }

        public final void onGlobalLayout() {
            Rect rect = new Rect();
            this.f118668a.getWindowVisibleDisplayFrame(rect);
            View rootView = this.f118668a.getRootView();
            Intrinsics.checkExpressionValueIsNotNull(rootView, "rootView.rootView");
            if (rootView.getHeight() - rect.bottom > this.f118669b) {
                int[] iArr = new int[2];
                this.f118670c.getLocationInWindow(iArr);
                int height = (iArr[1] + this.f118670c.getHeight()) - rect.bottom;
                if (this.f118668a.getScrollY() != 0) {
                    height += this.f118668a.getScrollY();
                }
                this.f118668a.scrollTo(0, height);
                return;
            }
            this.f118668a.scrollTo(0, 0);
        }
    }

    /* renamed from: b */
    public final void mo165514b(View view) {
        mo165513a(view, null);
    }

    /* renamed from: b */
    private final int m186591b(Context context) {
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    /* renamed from: d */
    private final int m186592d(View view) {
        if (view != null) {
            Object systemService = view.getContext().getSystemService("window");
            if (systemService != null) {
                WindowManager windowManager = (WindowManager) systemService;
                DisplayMetrics displayMetrics = new DisplayMetrics();
                if (windowManager != null) {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    defaultDisplay.getMetrics(displayMetrics);
                    int i = displayMetrics.heightPixels;
                    Intrinsics.checkExpressionValueIsNotNull(defaultDisplay, Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
                    int a = m186590a(defaultDisplay, displayMetrics, i);
                    if (a > i) {
                        return a - i;
                    }
                    return 0;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo165510a(Context context) {
        if (!(context instanceof Activity)) {
            C45855f.m181666e("SoftKeyboardUtil", "hideKeyboard view null");
            return;
        }
        Window window = ((Activity) context).getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "context.window");
        mo165512a(window.getDecorView());
    }

    /* renamed from: c */
    public final boolean mo165515c(View view) {
        if (view != null) {
            Object systemService = view.getContext().getSystemService("window");
            if (systemService != null) {
                WindowManager windowManager = (WindowManager) systemService;
                DisplayMetrics displayMetrics = new DisplayMetrics();
                if (windowManager != null) {
                    windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                    int i = displayMetrics.heightPixels;
                    Rect rect = new Rect();
                    view.getWindowVisibleDisplayFrame(rect);
                    if ((i - rect.bottom) - m186592d(view) > 0) {
                        return true;
                    }
                    return false;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo165512a(View view) {
        if (view == null) {
            C45855f.m181666e("SoftKeyboardUtil", "hideKeyboard view null");
            return;
        }
        Object systemService = view.getContext().getSystemService("input_method");
        if (systemService != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (inputMethodManager.isActive()) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    /* renamed from: a */
    public final void mo165513a(View view, ResultReceiver resultReceiver) {
        if (view == null) {
            C45855f.m181666e("SoftKeyboardUtil", "showKeyboard view null");
            return;
        }
        Object systemService = view.getContext().getSystemService("input_method");
        if (systemService != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (!view.requestFocus()) {
                view.setFocusableInTouchMode(true);
                view.setFocusable(true);
                view.requestFocus();
            }
            inputMethodManager.showSoftInput(view, 1, resultReceiver);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    /* renamed from: a */
    private final int m186590a(Display display, DisplayMetrics displayMetrics, int i) {
        try {
            display.getClass().getDeclaredMethod("getRealMetrics", displayMetrics.getClass()).invoke(display, displayMetrics);
            return displayMetrics.heightPixels;
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: a */
    public final void mo165511a(Context context, View view, View view2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(view2, "bottomView");
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC47120a(view, m186591b(context), view2));
    }
}
