package androidx.transition;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import java.lang.reflect.Field;

/* renamed from: androidx.transition.k */
class C1544k {

    /* renamed from: a */
    private static boolean f5416a = true;

    /* renamed from: b */
    private static Field f5417b;

    /* renamed from: c */
    private static boolean f5418c;

    /* renamed from: a */
    private static void m7103a() {
        if (!f5418c) {
            try {
                Field declaredField = ImageView.class.getDeclaredField("mDrawMatrix");
                f5417b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f5418c = true;
        }
    }

    /* renamed from: b */
    private static void m7105b(ImageView imageView, Matrix matrix) {
        if (f5416a) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                f5416a = false;
            }
        }
    }

    /* renamed from: a */
    static void m7104a(ImageView imageView, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
        } else if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            m7105b(imageView, matrix);
        } else {
            Drawable drawable2 = imageView.getDrawable();
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                Matrix matrix2 = null;
                m7103a();
                Field field = f5417b;
                if (field != null) {
                    try {
                        Matrix matrix3 = (Matrix) field.get(imageView);
                        if (matrix3 == null) {
                            try {
                                matrix2 = new Matrix();
                                f5417b.set(imageView, matrix2);
                            } catch (IllegalAccessException unused) {
                            }
                        }
                        matrix2 = matrix3;
                    } catch (IllegalAccessException unused2) {
                    }
                }
                if (matrix2 != null) {
                    matrix2.set(matrix);
                }
                imageView.invalidate();
            }
        }
    }
}
