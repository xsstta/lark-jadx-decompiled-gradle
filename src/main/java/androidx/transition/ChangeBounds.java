package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.C0767f;
import androidx.core.view.ViewCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

public class ChangeBounds extends Transition {

    /* renamed from: a */
    private static final String[] f5169a = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: i */
    private static final Property<Drawable, PointF> f5170i = new Property<Drawable, PointF>(PointF.class, "boundsOrigin") {
        /* class androidx.transition.ChangeBounds.C14681 */

        /* renamed from: a */
        private Rect f5180a = new Rect();

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f5180a);
            return new PointF((float) this.f5180a.left, (float) this.f5180a.top);
        }

        /* renamed from: a */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f5180a);
            this.f5180a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f5180a);
        }
    };

    /* renamed from: j */
    private static final Property<C1477a, PointF> f5171j = new Property<C1477a, PointF>(PointF.class, "topLeft") {
        /* class androidx.transition.ChangeBounds.C14703 */

        /* renamed from: a */
        public PointF get(C1477a aVar) {
            return null;
        }

        /* renamed from: a */
        public void set(C1477a aVar, PointF pointF) {
            aVar.mo7842a(pointF);
        }
    };

    /* renamed from: k */
    private static final Property<C1477a, PointF> f5172k = new Property<C1477a, PointF>(PointF.class, "bottomRight") {
        /* class androidx.transition.ChangeBounds.C14714 */

        /* renamed from: a */
        public PointF get(C1477a aVar) {
            return null;
        }

        /* renamed from: a */
        public void set(C1477a aVar, PointF pointF) {
            aVar.mo7843b(pointF);
        }
    };

    /* renamed from: l */
    private static final Property<View, PointF> f5173l = new Property<View, PointF>(PointF.class, "bottomRight") {
        /* class androidx.transition.ChangeBounds.C14725 */

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            aj.m6998a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    };

    /* renamed from: m */
    private static final Property<View, PointF> f5174m = new Property<View, PointF>(PointF.class, "topLeft") {
        /* class androidx.transition.ChangeBounds.C14736 */

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            aj.m6998a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    };

    /* renamed from: n */
    private static final Property<View, PointF> f5175n = new Property<View, PointF>(PointF.class, "position") {
        /* class androidx.transition.ChangeBounds.C14747 */

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            aj.m6998a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    };

    /* renamed from: r */
    private static C1550p f5176r = new C1550p();

    /* renamed from: o */
    private int[] f5177o;

    /* renamed from: p */
    private boolean f5178p;

    /* renamed from: q */
    private boolean f5179q;

    public ChangeBounds() {
        this.f5177o = new int[2];
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public String[] mo7809a() {
        return f5169a;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.transition.ChangeBounds$a */
    public static class C1477a {

        /* renamed from: a */
        private int f5199a;

        /* renamed from: b */
        private int f5200b;

        /* renamed from: c */
        private int f5201c;

        /* renamed from: d */
        private int f5202d;

        /* renamed from: e */
        private View f5203e;

        /* renamed from: f */
        private int f5204f;

        /* renamed from: g */
        private int f5205g;

        /* renamed from: a */
        private void m6725a() {
            aj.m6998a(this.f5203e, this.f5199a, this.f5200b, this.f5201c, this.f5202d);
            this.f5204f = 0;
            this.f5205g = 0;
        }

        C1477a(View view) {
            this.f5203e = view;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo7843b(PointF pointF) {
            this.f5201c = Math.round(pointF.x);
            this.f5202d = Math.round(pointF.y);
            int i = this.f5205g + 1;
            this.f5205g = i;
            if (this.f5204f == i) {
                m6725a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7842a(PointF pointF) {
            this.f5199a = Math.round(pointF.x);
            this.f5200b = Math.round(pointF.y);
            int i = this.f5204f + 1;
            this.f5204f = i;
            if (i == this.f5205g) {
                m6725a();
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public void mo7807a(C1562y yVar) {
        m6703d(yVar);
    }

    @Override // androidx.transition.Transition
    /* renamed from: b */
    public void mo7810b(C1562y yVar) {
        m6703d(yVar);
    }

    /* renamed from: a */
    public void mo7808a(boolean z) {
        this.f5178p = z;
    }

    /* renamed from: d */
    private void m6703d(C1562y yVar) {
        View view = yVar.f5459b;
        if (ViewCompat.m4012F(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            yVar.f5458a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            yVar.f5458a.put("android:changeBounds:parent", yVar.f5459b.getParent());
            if (this.f5179q) {
                yVar.f5459b.getLocationInWindow(this.f5177o);
                yVar.f5458a.put("android:changeBounds:windowX", Integer.valueOf(this.f5177o[0]));
                yVar.f5458a.put("android:changeBounds:windowY", Integer.valueOf(this.f5177o[1]));
            }
            if (this.f5178p) {
                yVar.f5458a.put("android:changeBounds:clip", ViewCompat.m4014H(view));
            }
        }
    }

    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5177o = new int[2];
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1553s.f5434d);
        boolean a = C0767f.m3699a(obtainStyledAttributes, (XmlPullParser) ((XmlResourceParser) attributeSet), "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        mo7808a(a);
    }

    /* renamed from: a */
    private boolean m6702a(View view, View view2) {
        if (!this.f5179q) {
            return true;
        }
        C1562y b = mo7899b(view, true);
        if (b == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == b.f5459b) {
            return true;
        }
        return false;
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public Animator mo7806a(final ViewGroup viewGroup, C1562y yVar, C1562y yVar2) {
        int i;
        final View view;
        Animator animator;
        ObjectAnimator objectAnimator;
        int i2;
        Rect rect;
        Rect rect2;
        ObjectAnimator objectAnimator2;
        if (yVar == null || yVar2 == null) {
            return null;
        }
        Map<String, Object> map = yVar.f5458a;
        Map<String, Object> map2 = yVar2.f5458a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        final View view2 = yVar2.f5459b;
        if (m6702a(viewGroup2, viewGroup3)) {
            Rect rect3 = (Rect) yVar.f5458a.get("android:changeBounds:bounds");
            Rect rect4 = (Rect) yVar2.f5458a.get("android:changeBounds:bounds");
            int i3 = rect3.left;
            final int i4 = rect4.left;
            int i5 = rect3.top;
            final int i6 = rect4.top;
            int i7 = rect3.right;
            final int i8 = rect4.right;
            int i9 = rect3.bottom;
            final int i10 = rect4.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            Rect rect5 = (Rect) yVar.f5458a.get("android:changeBounds:clip");
            final Rect rect6 = (Rect) yVar2.f5458a.get("android:changeBounds:clip");
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                if (i3 == i4 && i5 == i6) {
                    i = 0;
                } else {
                    i = 1;
                }
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect5 != null && !rect5.equals(rect6)) || (rect5 == null && rect6 != null)) {
                i++;
            }
            if (i <= 0) {
                return null;
            }
            if (!this.f5178p) {
                view = view2;
                aj.m6998a(view, i3, i5, i7, i9);
                if (i == 2) {
                    if (i11 == i13 && i12 == i14) {
                        animator = C1547m.m7107a(view, f5175n, mo7920m().mo7802a((float) i3, (float) i5, (float) i4, (float) i6));
                    } else {
                        C1477a aVar = new C1477a(view);
                        ObjectAnimator a = C1547m.m7107a(aVar, f5171j, mo7920m().mo7802a((float) i3, (float) i5, (float) i4, (float) i6));
                        ObjectAnimator a2 = C1547m.m7107a(aVar, f5172k, mo7920m().mo7802a((float) i7, (float) i9, (float) i8, (float) i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(a, a2);
                        animatorSet.addListener(new AnimatorListenerAdapter(aVar) {
                            /* class androidx.transition.ChangeBounds.C14758 */

                            /* renamed from: a */
                            final /* synthetic */ C1477a f5189a;
                            private C1477a mViewBounds;

                            {
                                this.f5189a = r2;
                                this.mViewBounds = r2;
                            }
                        });
                        animator = animatorSet;
                    }
                } else if (i3 == i4 && i5 == i6) {
                    animator = C1547m.m7107a(view, f5173l, mo7920m().mo7802a((float) i7, (float) i9, (float) i8, (float) i10));
                } else {
                    animator = C1547m.m7107a(view, f5174m, mo7920m().mo7802a((float) i3, (float) i5, (float) i4, (float) i6));
                }
            } else {
                view = view2;
                aj.m6998a(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                if (i3 == i4 && i5 == i6) {
                    objectAnimator = null;
                } else {
                    objectAnimator = C1547m.m7107a(view, f5175n, mo7920m().mo7802a((float) i3, (float) i5, (float) i4, (float) i6));
                }
                if (rect5 == null) {
                    i2 = 0;
                    rect = new Rect(0, 0, i11, i12);
                } else {
                    i2 = 0;
                    rect = rect5;
                }
                if (rect6 == null) {
                    rect2 = new Rect(i2, i2, i13, i14);
                } else {
                    rect2 = rect6;
                }
                if (!rect.equals(rect2)) {
                    ViewCompat.m4038a(view, rect);
                    C1550p pVar = f5176r;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect;
                    objArr[1] = rect2;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", pVar, objArr);
                    ofObject.addListener(new AnimatorListenerAdapter() {
                        /* class androidx.transition.ChangeBounds.C14769 */

                        /* renamed from: h */
                        private boolean f5198h;

                        public void onAnimationCancel(Animator animator) {
                            this.f5198h = true;
                        }

                        public void onAnimationEnd(Animator animator) {
                            if (!this.f5198h) {
                                ViewCompat.m4038a(view, rect6);
                                aj.m6998a(view, i4, i6, i8, i10);
                            }
                        }
                    });
                    objectAnimator2 = ofObject;
                } else {
                    objectAnimator2 = null;
                }
                animator = C1560x.m7140a(objectAnimator, objectAnimator2);
            }
            if (view.getParent() instanceof ViewGroup) {
                final ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                C1518ae.m6976a(viewGroup4, true);
                mo7880a(new C1555u() {
                    /* class androidx.transition.ChangeBounds.AnonymousClass10 */

                    /* renamed from: a */
                    boolean f5181a;

                    @Override // androidx.transition.C1555u, androidx.transition.Transition.AbstractC1505d
                    /* renamed from: c */
                    public void mo7817c(Transition transition) {
                        C1518ae.m6976a(viewGroup4, false);
                    }

                    @Override // androidx.transition.C1555u, androidx.transition.Transition.AbstractC1505d
                    /* renamed from: d */
                    public void mo7818d(Transition transition) {
                        C1518ae.m6976a(viewGroup4, true);
                    }

                    @Override // androidx.transition.C1555u, androidx.transition.Transition.AbstractC1505d
                    /* renamed from: a */
                    public void mo7815a(Transition transition) {
                        C1518ae.m6976a(viewGroup4, false);
                        this.f5181a = true;
                    }

                    @Override // androidx.transition.C1555u, androidx.transition.Transition.AbstractC1505d
                    /* renamed from: b */
                    public void mo7816b(Transition transition) {
                        if (!this.f5181a) {
                            C1518ae.m6976a(viewGroup4, false);
                        }
                        transition.mo7898b(this);
                    }
                });
            }
            return animator;
        }
        int intValue = ((Integer) yVar.f5458a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) yVar.f5458a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) yVar2.f5458a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) yVar2.f5458a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f5177o);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        final BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        final float c = aj.m7002c(view2);
        aj.m6996a(view2, (float) BitmapDescriptorFactory.HUE_RED);
        aj.m6995a(viewGroup).mo7959a(bitmapDrawable);
        PathMotion m = mo7920m();
        int[] iArr = this.f5177o;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, C1549o.m7110a(f5170i, m.mo7802a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1]))));
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() {
            /* class androidx.transition.ChangeBounds.C14692 */

            public void onAnimationEnd(Animator animator) {
                aj.m6995a(viewGroup).mo7960b(bitmapDrawable);
                aj.m6996a(view2, c);
            }
        });
        return ofPropertyValuesHolder;
    }
}
