package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
public class ap {

    /* renamed from: a */
    private static Method f5369a;

    /* renamed from: b */
    private static boolean f5370b;

    /* renamed from: c */
    private static Field f5371c;

    /* renamed from: d */
    private static boolean f5372d;

    /* renamed from: e */
    private float[] f5373e;

    ap() {
    }

    /* renamed from: a */
    private void m7026a() {
        if (!f5370b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                f5369a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e);
            }
            f5370b = true;
        }
    }

    /* renamed from: c */
    public void mo7983c(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(R.id.save_non_transition_alpha, null);
        }
    }

    /* renamed from: a */
    public float mo7980a(View view) {
        Float f = (Float) view.getTag(R.id.save_non_transition_alpha);
        if (f != null) {
            return view.getAlpha() / f.floatValue();
        }
        return view.getAlpha();
    }

    /* renamed from: b */
    public void mo7982b(View view) {
        if (view.getTag(R.id.save_non_transition_alpha) == null) {
            view.setTag(R.id.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: a */
    public void mo7981a(View view, float f) {
        Float f2 = (Float) view.getTag(R.id.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: b */
    public void mo7985b(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo7985b(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) (-view.getLeft()), (float) (-view.getTop()));
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }

    /* renamed from: a */
    public void mo7988a(View view, int i) {
        if (!f5372d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f5371c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f5372d = true;
        }
        Field field = f5371c;
        if (field != null) {
            try {
                f5371c.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: c */
    public void mo7986c(View view, Matrix matrix) {
        int i;
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX((float) (view.getWidth() / 2));
            view.setPivotY((float) (view.getHeight() / 2));
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(BitmapDescriptorFactory.HUE_RED);
            return;
        }
        float[] fArr = this.f5373e;
        if (fArr == null) {
            fArr = new float[9];
            this.f5373e = fArr;
        }
        matrix.getValues(fArr);
        float f = fArr[3];
        float sqrt = (float) Math.sqrt((double) (1.0f - (f * f)));
        if (fArr[0] < BitmapDescriptorFactory.HUE_RED) {
            i = -1;
        } else {
            i = 1;
        }
        float f2 = sqrt * ((float) i);
        float degrees = (float) Math.toDegrees(Math.atan2((double) f, (double) f2));
        float f3 = fArr[0] / f2;
        float f4 = fArr[4] / f2;
        float f5 = fArr[2];
        float f6 = fArr[5];
        view.setPivotX(BitmapDescriptorFactory.HUE_RED);
        view.setPivotY(BitmapDescriptorFactory.HUE_RED);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        view.setRotation(degrees);
        view.setScaleX(f3);
        view.setScaleY(f4);
    }

    /* renamed from: a */
    public void mo7984a(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo7984a(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: a */
    public void mo7987a(View view, int i, int i2, int i3, int i4) {
        m7026a();
        Method method = f5369a;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
