package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;

/* renamed from: androidx.core.view.s */
public final class C0917s {

    /* renamed from: a */
    private static Method f3469a;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f3469a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    /* renamed from: a */
    public static int m4406a(ViewConfiguration viewConfiguration) {
        if (Build.VERSION.SDK_INT >= 28) {
            return viewConfiguration.getScaledHoverSlop();
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }

    /* renamed from: a */
    public static float m4405a(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }
        return m4409d(viewConfiguration, context);
    }

    /* renamed from: b */
    public static float m4407b(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
        return m4409d(viewConfiguration, context);
    }

    /* renamed from: c */
    public static boolean m4408c(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        if (identifier == 0 || !resources.getBoolean(identifier)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static float m4409d(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f3469a) != null) {
            try {
                return (float) ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return BitmapDescriptorFactory.HUE_RED;
    }
}
