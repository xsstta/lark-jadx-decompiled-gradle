package androidx.core.view;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class KeyEventDispatcher {

    /* renamed from: a */
    private static boolean f3321a;

    /* renamed from: b */
    private static Method f3322b;

    /* renamed from: c */
    private static boolean f3323c;

    /* renamed from: d */
    private static Field f3324d;

    public interface Component {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static DialogInterface.OnKeyListener m4001a(Dialog dialog) {
        if (!f3323c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f3324d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3323c = true;
        }
        Field field = f3324d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m4005a(View view, KeyEvent keyEvent) {
        return ViewCompat.m4053a(view, keyEvent);
    }

    /* renamed from: a */
    private static boolean m4002a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f3321a) {
            try {
                f3322b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f3321a = true;
        }
        Method method = f3322b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, keyEvent)).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m4003a(Activity activity, KeyEvent keyEvent) {
        KeyEvent.DispatcherState dispatcherState;
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m4002a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (ViewCompat.m4061b(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            dispatcherState = decorView.getKeyDispatcherState();
        } else {
            dispatcherState = null;
        }
        return keyEvent.dispatch(activity, dispatcherState, activity);
    }

    /* renamed from: a */
    private static boolean m4004a(Dialog dialog, KeyEvent keyEvent) {
        KeyEvent.DispatcherState dispatcherState;
        DialogInterface.OnKeyListener a = m4001a(dialog);
        if (a != null && a.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (ViewCompat.m4061b(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            dispatcherState = decorView.getKeyDispatcherState();
        } else {
            dispatcherState = null;
        }
        return keyEvent.dispatch(dialog, dispatcherState, dialog);
    }

    /* renamed from: a */
    public static boolean m4006a(Component component, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (component == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return component.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            return m4003a((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m4004a((Dialog) callback, keyEvent);
        }
        if ((view == null || !ViewCompat.m4061b(view, keyEvent)) && !component.superDispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }
}
