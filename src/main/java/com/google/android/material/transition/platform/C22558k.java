package com.google.android.material.transition.platform;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.shape.AbstractC22389c;
import com.google.android.material.shape.C22387a;
import com.google.android.material.shape.C22396j;
import com.google.android.material.shape.C22398l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.transition.platform.k */
public class C22558k {

    /* renamed from: a */
    private static final RectF f55602a = new RectF();

    /* renamed from: com.google.android.material.transition.platform.k$a */
    interface AbstractC22561a {
        /* renamed from: a */
        void mo78636a(Canvas canvas);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transition.platform.k$b */
    public interface AbstractC22562b {
        /* renamed from: a */
        AbstractC22389c mo78653a(AbstractC22389c cVar, AbstractC22389c cVar2);
    }

    /* renamed from: a */
    static float m81853a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    static <T> T m81864a(T t, T t2) {
        return t != null ? t : t2;
    }

    /* renamed from: a */
    static C22398l m81863a(C22398l lVar, C22398l lVar2, RectF rectF, AbstractC22562b bVar) {
        return (m81868b(lVar, rectF) ? lVar : lVar2).mo78017n().mo78021a(bVar.mo78653a(lVar.mo78009f(), lVar2.mo78009f())).mo78027b(bVar.mo78653a(lVar.mo78010g(), lVar2.mo78010g())).mo78036d(bVar.mo78653a(lVar.mo78012i(), lVar2.mo78012i())).mo78032c(bVar.mo78653a(lVar.mo78011h(), lVar2.mo78011h())).mo78024a();
    }

    /* renamed from: a */
    static C22398l m81862a(C22398l lVar, C22398l lVar2, final RectF rectF, final RectF rectF2, final float f, final float f2, final float f3) {
        if (f3 < f) {
            return lVar;
        }
        return f3 > f2 ? lVar2 : m81863a(lVar, lVar2, rectF, new AbstractC22562b() {
            /* class com.google.android.material.transition.platform.C22558k.C225602 */

            @Override // com.google.android.material.transition.platform.C22558k.AbstractC22562b
            /* renamed from: a */
            public AbstractC22389c mo78653a(AbstractC22389c cVar, AbstractC22389c cVar2) {
                return new C22387a(C22558k.m81854a(cVar.mo77991a(rectF), cVar2.mo77991a(rectF2), f, f2, f3));
            }
        });
    }

    /* renamed from: a */
    static void m81865a(Canvas canvas, Rect rect, float f, float f2, float f3, int i, AbstractC22561a aVar) {
        if (i > 0) {
            int save = canvas.save();
            canvas.translate(f, f2);
            canvas.scale(f3, f3);
            if (i < 255) {
                m81857a(canvas, rect, i);
            }
            aVar.mo78636a(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: a */
    static float m81855a(RectF rectF) {
        return rectF.width() * rectF.height();
    }

    /* renamed from: b */
    static RectF m81866b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new RectF((float) i, (float) i2, (float) (view.getWidth() + i), (float) (view.getHeight() + i2));
    }

    /* renamed from: a */
    static RectF m81858a(View view) {
        return new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
    }

    /* renamed from: a */
    static Shader m81859a(int i) {
        return new LinearGradient((float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, i, i, Shader.TileMode.CLAMP);
    }

    /* renamed from: b */
    static View m81867b(View view, int i) {
        String resourceName = view.getResources().getResourceName(i);
        while (view != null) {
            if (view.getId() != i) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(resourceName + " is not a valid ancestor");
    }

    /* renamed from: b */
    private static boolean m81868b(C22398l lVar, RectF rectF) {
        if (lVar.mo78009f().mo77991a(rectF) == BitmapDescriptorFactory.HUE_RED && lVar.mo78010g().mo77991a(rectF) == BitmapDescriptorFactory.HUE_RED && lVar.mo78011h().mo77991a(rectF) == BitmapDescriptorFactory.HUE_RED && lVar.mo78012i().mo77991a(rectF) == BitmapDescriptorFactory.HUE_RED) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static View m81860a(View view, int i) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        return m81867b(view, i);
    }

    /* renamed from: a */
    static C22398l m81861a(C22398l lVar, final RectF rectF) {
        return lVar.mo78003a(new C22398l.AbstractC22401b() {
            /* class com.google.android.material.transition.platform.C22558k.C225591 */

            @Override // com.google.android.material.shape.C22398l.AbstractC22401b
            /* renamed from: a */
            public AbstractC22389c mo77988a(AbstractC22389c cVar) {
                if (cVar instanceof C22396j) {
                    return cVar;
                }
                return new C22396j(cVar.mo77991a(rectF) / rectF.height());
            }
        });
    }

    /* renamed from: a */
    private static int m81857a(Canvas canvas, Rect rect, int i) {
        RectF rectF = f55602a;
        rectF.set(rect);
        if (Build.VERSION.SDK_INT >= 21) {
            return canvas.saveLayerAlpha(rectF, i);
        }
        return canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, i, 31);
    }

    /* renamed from: a */
    static float m81854a(float f, float f2, float f3, float f4, float f5) {
        if (f5 < f3) {
            return f;
        }
        if (f5 > f4) {
            return f2;
        }
        return m81853a(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* renamed from: a */
    static int m81856a(int i, int i2, float f, float f2, float f3) {
        if (f3 < f) {
            return i;
        }
        if (f3 > f2) {
            return i2;
        }
        return (int) m81853a((float) i, (float) i2, (f3 - f) / (f2 - f));
    }
}
