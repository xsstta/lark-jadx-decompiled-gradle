package com.ss.android.lark.inv.export.util;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.aj;
import com.ss.ttm.player.MediaPlayer;

/* renamed from: com.ss.android.lark.inv.export.util.q */
public class C40129q {

    /* renamed from: a */
    private static int f101972a;

    /* renamed from: com.ss.android.lark.inv.export.util.q$a */
    public interface AbstractC40131a {
        void onSoftInputChanged(int i);
    }

    /* renamed from: a */
    public static void m159106a() {
        InputMethodManager inputMethodManager = (InputMethodManager) aj.m224263a().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.toggleSoftInput(0, 0);
        }
    }

    /* renamed from: b */
    private static int m159113b() {
        Resources resources = aj.m224263a().getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier != 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: c */
    private static int m159116c() {
        Resources resources = aj.m224263a().getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* renamed from: a */
    public static void m159107a(Activity activity) {
        if (activity != null) {
            m159111a(activity.getWindow());
        }
    }

    /* renamed from: a */
    public static void m159109a(View view) {
        if (view != null) {
            m159110a(view, 0);
        }
    }

    /* renamed from: b */
    public static void m159115b(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) aj.m224263a().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: b */
    public static int m159114b(Window window) {
        View decorView = window.getDecorView();
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        Log.m165379d("InvKeyboardUtils", "getDecorViewInvisibleHeight: " + (decorView.getBottom() - rect.bottom));
        int abs = Math.abs(decorView.getBottom() - rect.bottom);
        if (abs > m159113b() + m159116c()) {
            return abs - f101972a;
        }
        f101972a = abs;
        return 0;
    }

    /* renamed from: a */
    public static void m159111a(Window window) {
        if (window != null) {
            View currentFocus = window.getCurrentFocus();
            if (currentFocus == null) {
                View decorView = window.getDecorView();
                View findViewWithTag = decorView.findViewWithTag("keyboardTagView");
                if (findViewWithTag == null) {
                    findViewWithTag = new EditText(window.getContext());
                    findViewWithTag.setTag("keyboardTagView");
                    ((ViewGroup) decorView).addView(findViewWithTag, 0, 0);
                }
                currentFocus = findViewWithTag;
                currentFocus.requestFocus();
            }
            m159115b(currentFocus);
        }
    }

    /* renamed from: a */
    public static void m159108a(Activity activity, AbstractC40131a aVar) {
        m159112a(activity.getWindow(), aVar);
    }

    /* renamed from: a */
    public static void m159110a(View view, int i) {
        InputMethodManager inputMethodManager = (InputMethodManager) aj.m224263a().getSystemService("input_method");
        if (inputMethodManager != null) {
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            inputMethodManager.showSoftInput(view, i, new InvKeyboardUtils$1(new Handler()));
            inputMethodManager.toggleSoftInput(2, 1);
        }
    }

    /* renamed from: a */
    public static void m159112a(final Window window, final AbstractC40131a aVar) {
        if ((window.getAttributes().flags & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0) {
            window.clearFlags(MediaPlayer.MEDIA_PLAYER_OPTION_APPID);
        }
        FrameLayout frameLayout = (FrameLayout) window.findViewById(16908290);
        final int[] iArr = {m159114b(window)};
        ViewTreeObserver$OnGlobalLayoutListenerC401301 r2 = new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.lark.inv.export.util.C40129q.ViewTreeObserver$OnGlobalLayoutListenerC401301 */

            public void onGlobalLayout() {
                int b = C40129q.m159114b(window);
                if (iArr[0] != b) {
                    aVar.onSoftInputChanged(b);
                    iArr[0] = b;
                }
            }
        };
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(r2);
        frameLayout.setTag(-8, r2);
    }
}
