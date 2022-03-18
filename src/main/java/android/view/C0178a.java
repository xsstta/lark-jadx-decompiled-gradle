package android.view;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Field;

/* renamed from: android.view.a */
public class C0178a extends View {
    public C0178a(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static void m580a(View view) {
        view.onFinishInflate();
    }

    /* renamed from: a */
    public static void m581a(View view, int i) {
        ((TextView) view).setMinWidth(i);
    }

    /* renamed from: b */
    public static void m583b(View view, int i) {
        ((TextView) view).setMinHeight(i);
    }

    /* renamed from: a */
    public static ViewGroup.MarginLayoutParams m579a(ViewGroup viewGroup, int i, int i2) {
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(i, i2);
        }
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(i, i2);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(i, i2);
        }
        if (viewGroup instanceof ConstraintLayout) {
            return new ConstraintLayout.LayoutParams(i, i2);
        }
        return new ViewGroup.MarginLayoutParams(i, i2);
    }

    /* renamed from: a */
    public static void m582a(Class cls, String str, Object obj, Object obj2) throws Exception {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }
}
