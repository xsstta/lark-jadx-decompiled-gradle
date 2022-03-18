package androidx.core.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C0859a;
import androidx.core.view.p029a.AbstractC0873g;
import androidx.core.view.p029a.C0864d;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ViewCompat {

    /* renamed from: a */
    private static final AtomicInteger f3325a = new AtomicInteger(1);

    /* renamed from: b */
    private static Field f3326b;

    /* renamed from: c */
    private static boolean f3327c;

    /* renamed from: d */
    private static Field f3328d;

    /* renamed from: e */
    private static boolean f3329e;

    /* renamed from: f */
    private static WeakHashMap<View, String> f3330f;

    /* renamed from: g */
    private static WeakHashMap<View, C0924x> f3331g = null;

    /* renamed from: h */
    private static Method f3332h;

    /* renamed from: i */
    private static Field f3333i;

    /* renamed from: j */
    private static boolean f3334j = false;

    /* renamed from: k */
    private static ThreadLocal<Rect> f3335k;

    /* renamed from: l */
    private static final int[] f3336l = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: m */
    private static View$OnAttachStateChangeListenerC0852a f3337m = new View$OnAttachStateChangeListenerC0852a();

    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusRealDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusRelativeDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface NestedScrollType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollAxis {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollIndicators {
    }

    /* renamed from: androidx.core.view.ViewCompat$f */
    public interface AbstractC0857f {
        /* renamed from: a */
        boolean mo4528a(View view, KeyEvent keyEvent);
    }

    /* renamed from: androidx.core.view.ViewCompat$g */
    static class C0858g {

        /* renamed from: a */
        private static final ArrayList<WeakReference<View>> f3343a = new ArrayList<>();

        /* renamed from: b */
        private WeakHashMap<View, Boolean> f3344b;

        /* renamed from: c */
        private SparseArray<WeakReference<View>> f3345c;

        /* renamed from: d */
        private WeakReference<KeyEvent> f3346d;

        C0858g() {
        }

        /* renamed from: a */
        private SparseArray<WeakReference<View>> m4144a() {
            if (this.f3345c == null) {
                this.f3345c = new SparseArray<>();
            }
            return this.f3345c;
        }

        /* renamed from: b */
        private void m4147b() {
            WeakHashMap<View, Boolean> weakHashMap = this.f3344b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f3343a;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f3344b == null) {
                        this.f3344b = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f3343a;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f3344b.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f3344b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        static C0858g m4145a(View view) {
            C0858g gVar = (C0858g) view.getTag(R.id.tag_unhandled_key_event_manager);
            if (gVar != null) {
                return gVar;
            }
            C0858g gVar2 = new C0858g();
            view.setTag(R.id.tag_unhandled_key_event_manager, gVar2);
            return gVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4529a(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f3346d;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f3346d = new WeakReference<>(keyEvent);
            WeakReference<View> weakReference2 = null;
            SparseArray<WeakReference<View>> a = m4144a();
            if (keyEvent.getAction() == 1 && (indexOfKey = a.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = a.valueAt(indexOfKey);
                a.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = a.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = weakReference2.get();
            if (view != null && ViewCompat.m4015I(view)) {
                m4148c(view, keyEvent);
            }
            return true;
        }

        /* renamed from: b */
        private View m4146b(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f3344b;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View b = m4146b(viewGroup.getChildAt(childCount), keyEvent);
                        if (b != null) {
                            return b;
                        }
                    }
                }
                if (m4148c(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: c */
        private boolean m4148c(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((AbstractC0857f) arrayList.get(size)).mo4528a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4530a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m4147b();
            }
            View b = m4146b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (b != null && !KeyEvent.isModifierKey(keyCode)) {
                    m4144a().put(keyCode, new WeakReference<>(b));
                }
            }
            if (b != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m4051a(View view, int i) {
        return view.canScrollHorizontally(i);
    }

    /* renamed from: a */
    public static void m4042a(View view, C0864d dVar) {
        view.onInitializeAccessibilityNodeInfo(dVar.mo4551a());
    }

    /* renamed from: a */
    public static void m4043a(View view, C0859a aVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (aVar == null && (m4021O(view) instanceof C0859a.C0860a)) {
            aVar = new C0859a();
        }
        if (aVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = aVar.mo4531a();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    /* renamed from: a */
    public static void m4049a(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* renamed from: a */
    public static void m4046a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: a */
    public static void m4047a(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: a */
    public static boolean m4052a(View view, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    /* renamed from: a */
    public static void m4041a(View view, C0864d.C0865a aVar, CharSequence charSequence, AbstractC0873g gVar) {
        if (gVar == null && charSequence == null) {
            m4075e(view, aVar.mo4623a());
        } else {
            m4040a(view, aVar.mo4624a(charSequence, gVar));
        }
    }

    /* renamed from: a */
    private static void m4040a(View view, C0864d.C0865a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            m4063c(view);
            m4029a(aVar.mo4623a(), view);
            m4023Q(view).add(aVar);
            m4093k(view, 0);
        }
    }

    /* renamed from: a */
    public static void m4036a(View view, Paint paint) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setLayerPaint(paint);
            return;
        }
        view.setLayerType(view.getLayerType(), paint);
        view.invalidate();
    }

    /* renamed from: a */
    public static void m4048a(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f3330f == null) {
            f3330f = new WeakHashMap<>();
        }
        f3330f.put(view, str);
    }

    /* renamed from: a */
    public static void m4050a(ViewGroup viewGroup, boolean z) {
        if (f3332h == null) {
            try {
                f3332h = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e) {
                Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", e);
            }
            f3332h.setAccessible(true);
        }
        try {
            f3332h.invoke(viewGroup, Boolean.valueOf(z));
        } catch (IllegalAccessException e2) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e2);
        } catch (IllegalArgumentException e3) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e3);
        } catch (InvocationTargetException e4) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e4);
        }
    }

    /* renamed from: a */
    public static void m4044a(View view, final AbstractC0912n nVar) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (nVar == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                /* class androidx.core.view.ViewCompat.View$OnApplyWindowInsetsListenerC08481 */

                public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return AbstractC0912n.this.onApplyWindowInsets(view, C0883ab.m4271a(windowInsets)).mo4660o();
                }
            });
        }
    }

    /* renamed from: a */
    public static void m4039a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: a */
    public static void m4035a(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof AbstractC0915q) {
            ((AbstractC0915q) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m4037a(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof AbstractC0915q) {
            ((AbstractC0915q) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m4038a(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: a */
    public static void m4045a(View view, C0914p pVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (pVar != null ? pVar.mo4716a() : null));
        }
    }

    /* renamed from: a */
    static boolean m4053a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0858g.m4145a(view).mo4529a(keyEvent);
    }

    /* renamed from: androidx.core.view.ViewCompat$a */
    static class View$OnAttachStateChangeListenerC0852a implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f3339a = new WeakHashMap<>();

        public void onViewDetachedFromWindow(View view) {
        }

        View$OnAttachStateChangeListenerC0852a() {
        }

        public void onGlobalLayout() {
            for (Map.Entry<View, Boolean> entry : this.f3339a.entrySet()) {
                m4131a(entry.getKey(), entry.getValue().booleanValue());
            }
        }

        public void onViewAttachedToWindow(View view) {
            m4130a(view);
        }

        /* renamed from: a */
        private void m4130a(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        /* renamed from: a */
        private void m4131a(View view, boolean z) {
            boolean z2;
            if (view.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                if (z2) {
                    ViewCompat.m4093k(view, 16);
                }
                this.f3339a.put(view, Boolean.valueOf(z2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.ViewCompat$b */
    public static abstract class AbstractC0853b<T> {

        /* renamed from: a */
        private final int f3340a;

        /* renamed from: b */
        private final Class<T> f3341b;

        /* renamed from: c */
        private final int f3342c;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo4512a(View view, T t);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract T mo4515b(View view);

        /* renamed from: a */
        private boolean m4132a() {
            if (Build.VERSION.SDK_INT >= this.f3342c) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        private boolean m4133b() {
            if (Build.VERSION.SDK_INT >= 19) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public T mo4527c(View view) {
            if (m4132a()) {
                return mo4515b(view);
            }
            if (!m4133b()) {
                return null;
            }
            T t = (T) view.getTag(this.f3340a);
            if (this.f3341b.isInstance(t)) {
                return t;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4514a(T t, T t2) {
            return !t2.equals(t);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo4526b(Boolean bool, Boolean bool2) {
            boolean z;
            boolean z2;
            if (bool == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            if (bool2 == null) {
                z2 = false;
            } else {
                z2 = bool2.booleanValue();
            }
            if (z == z2) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4525b(View view, T t) {
            if (m4132a()) {
                mo4512a(view, (Object) t);
            } else if (m4133b() && mo4514a((Object) mo4527c(view), (Object) t)) {
                ViewCompat.m4063c(view);
                view.setTag(this.f3340a, t);
                ViewCompat.m4093k(view, 0);
            }
        }

        AbstractC0853b(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        AbstractC0853b(int i, Class<T> cls, int i2, int i3) {
            this.f3340a = i;
            this.f3341b = cls;
            this.f3342c = i3;
        }
    }

    /* renamed from: c */
    private static AbstractC0853b<Boolean> m4062c() {
        return new AbstractC0853b<Boolean>(R.id.tag_screen_reader_focusable, Boolean.class, 28) {
            /* class androidx.core.view.ViewCompat.C08492 */

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public Boolean mo4515b(View view) {
                return Boolean.valueOf(view.isScreenReaderFocusable());
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo4512a(View view, Boolean bool) {
                view.setScreenReaderFocusable(bool.booleanValue());
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public boolean mo4514a(Boolean bool, Boolean bool2) {
                return !mo4526b(bool, bool2);
            }
        };
    }

    /* renamed from: d */
    private static AbstractC0853b<CharSequence> m4067d() {
        return new AbstractC0853b<CharSequence>(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28) {
            /* class androidx.core.view.ViewCompat.C08503 */

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public CharSequence mo4515b(View view) {
                return view.getAccessibilityPaneTitle();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo4512a(View view, CharSequence charSequence) {
                view.setAccessibilityPaneTitle(charSequence);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public boolean mo4514a(CharSequence charSequence, CharSequence charSequence2) {
                return !TextUtils.equals(charSequence, charSequence2);
            }
        };
    }

    /* renamed from: e */
    private static AbstractC0853b<Boolean> m4072e() {
        return new AbstractC0853b<Boolean>(R.id.tag_accessibility_heading, Boolean.class, 28) {
            /* class androidx.core.view.ViewCompat.C08514 */

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public Boolean mo4515b(View view) {
                return Boolean.valueOf(view.isAccessibilityHeading());
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo4512a(View view, Boolean bool) {
                view.setAccessibilityHeading(bool.booleanValue());
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public boolean mo4514a(Boolean bool, Boolean bool2) {
                return !mo4526b(bool, bool2);
            }
        };
    }

    /* renamed from: a */
    public static int m4025a() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            atomicInteger = f3325a;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    /* renamed from: b */
    private static Rect m4054b() {
        if (f3335k == null) {
            f3335k = new ThreadLocal<>();
        }
        Rect rect = f3335k.get();
        if (rect == null) {
            rect = new Rect();
            f3335k.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.core.view.ViewCompat$d */
    public static class C0855d {
        /* renamed from: a */
        public static WindowInsets m4141a(View view) {
            return view.getRootWindowInsets();
        }
    }

    /* renamed from: g */
    public static float m4079g(View view) {
        return view.getAlpha();
    }

    /* renamed from: j */
    public static boolean m4090j(View view) {
        return view.isOpaque();
    }

    /* renamed from: n */
    public static float m4099n(View view) {
        return view.getTranslationX();
    }

    /* renamed from: o */
    public static float m4100o(View view) {
        return view.getTranslationY();
    }

    /* renamed from: A */
    public static boolean m4007A(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    /* renamed from: G */
    public static float m4013G(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: H */
    public static Rect m4014H(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: J */
    public static boolean m4016J(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: M */
    public static CharSequence m4019M(View view) {
        return m4067d().mo4527c(view);
    }

    /* renamed from: O */
    private static View.AccessibilityDelegate m4021O(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        return m4022P(view);
    }

    /* renamed from: R */
    private static void m4024R(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: a */
    public static int m4026a(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: f */
    public static int m4076f(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    /* renamed from: h */
    public static int m4082h(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: i */
    public static ViewParent m4085i(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getParentForAccessibility();
        }
        return view.getParent();
    }

    /* renamed from: k */
    public static int m4091k(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* renamed from: l */
    public static int m4094l(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    /* renamed from: m */
    public static int m4097m(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    /* renamed from: s */
    public static float m4104s(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: t */
    public static float m4105t(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTranslationZ();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: v */
    public static int m4107v(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: x */
    public static boolean m4109x(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: z */
    public static boolean m4111z(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: B */
    public static ColorStateList m4008B(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof AbstractC0915q) {
            return ((AbstractC0915q) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: C */
    public static PorterDuff.Mode m4009C(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof AbstractC0915q) {
            return ((AbstractC0915q) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: D */
    public static boolean m4010D(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof NestedScrollingChild) {
            return ((NestedScrollingChild) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: E */
    public static void m4011E(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof NestedScrollingChild) {
            ((NestedScrollingChild) view).stopNestedScroll();
        }
    }

    /* renamed from: F */
    public static boolean m4012F(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    public static boolean m4015I(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        if (view.getWindowToken() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public static boolean m4018L(View view) {
        Boolean c = m4062c().mo4527c(view);
        if (c == null) {
            return false;
        }
        return c.booleanValue();
    }

    /* renamed from: N */
    public static boolean m4020N(View view) {
        Boolean c = m4072e().mo4527c(view);
        if (c == null) {
            return false;
        }
        return c.booleanValue();
    }

    /* renamed from: Q */
    private static List<C0864d.C0865a> m4023Q(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* renamed from: b */
    public static C0859a m4055b(View view) {
        View.AccessibilityDelegate O = m4021O(view);
        if (O == null) {
            return null;
        }
        if (O instanceof C0859a.C0860a) {
            return ((C0859a.C0860a) O).f3350a;
        }
        return new C0859a(O);
    }

    /* renamed from: c */
    static C0859a m4063c(View view) {
        C0859a b = m4055b(view);
        if (b == null) {
            b = new C0859a();
        }
        m4043a(view, b);
        return b;
    }

    /* renamed from: e */
    public static void m4073e(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: r */
    public static C0924x m4103r(View view) {
        if (f3331g == null) {
            f3331g = new WeakHashMap<>();
        }
        C0924x xVar = f3331g.get(view);
        if (xVar != null) {
            return xVar;
        }
        C0924x xVar2 = new C0924x(view);
        f3331g.put(view, xVar2);
        return xVar2;
    }

    /* renamed from: u */
    public static String m4106u(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f3330f;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* renamed from: w */
    public static void m4108w(View view) {
        if (Build.VERSION.SDK_INT >= 20) {
            view.requestApplyInsets();
        } else if (Build.VERSION.SDK_INT >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: y */
    public static C0883ab m4110y(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0883ab.m4271a(C0855d.m4141a(view));
        }
        return null;
    }

    /* renamed from: K */
    public static Display m4017K(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m4015I(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: P */
    private static View.AccessibilityDelegate m4022P(View view) {
        if (f3334j) {
            return null;
        }
        if (f3333i == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3333i = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3334j = true;
                return null;
            }
        }
        try {
            Object obj = f3333i.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f3334j = true;
            return null;
        }
    }

    /* renamed from: p */
    public static int m4101p(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f3327c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f3326b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3327c = true;
        }
        Field field = f3326b;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: q */
    public static int m4102q(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f3329e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f3328d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3329e = true;
        }
        Field field = f3328d;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: d */
    public static boolean m4071d(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    /* renamed from: a */
    public static void m4030a(View view, float f) {
        view.setTranslationX(f);
    }

    /* renamed from: b */
    public static void m4057b(View view, float f) {
        view.setTranslationY(f);
    }

    /* renamed from: c */
    public static void m4064c(View view, float f) {
        view.setAlpha(f);
    }

    /* renamed from: d */
    public static void m4068d(View view, float f) {
        view.setRotation(f);
    }

    /* renamed from: e */
    public static void m4074e(View view, float f) {
        view.setRotationX(f);
    }

    /* renamed from: f */
    public static void m4077f(View view, float f) {
        view.setRotationY(f);
    }

    /* renamed from: g */
    public static void m4081g(View view, float f) {
        view.setScaleX(f);
    }

    /* renamed from: h */
    public static void m4083h(View view, float f) {
        view.setScaleY(f);
    }

    /* renamed from: i */
    public static void m4086i(View view, float f) {
        view.setPivotX(f);
    }

    /* renamed from: j */
    public static void m4088j(View view, float f) {
        view.setPivotY(f);
    }

    /* renamed from: b */
    public static void m4059b(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: d */
    public static void m4069d(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setImportantForAccessibility(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            if (i == 4) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }
    }

    /* renamed from: f */
    public static void m4078f(View view, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setLayoutDirection(i);
        }
    }

    /* renamed from: g */
    public static <T extends View> T m4080g(View view, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) view.requireViewById(i);
        }
        T t = (T) view.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    /* renamed from: h */
    public static void m4084h(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    /* renamed from: k */
    public static void m4092k(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: l */
    public static void m4095l(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTranslationZ(f);
        }
    }

    /* renamed from: m */
    private static void m4098m(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m4024R(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m4024R((View) parent);
            }
        }
    }

    /* renamed from: a */
    public static C0883ab m4027a(View view, C0883ab abVar) {
        WindowInsets o;
        if (Build.VERSION.SDK_INT >= 21 && (o = abVar.mo4660o()) != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(o);
            if (!onApplyWindowInsets.equals(o)) {
                return C0883ab.m4271a(onApplyWindowInsets);
            }
        }
        return abVar;
    }

    /* renamed from: c */
    public static void m4065c(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }

    /* renamed from: d */
    public static void m4070d(View view, boolean z) {
        m4072e().mo4525b(view, Boolean.valueOf(z));
    }

    /* renamed from: e */
    public static void m4075e(View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            m4029a(i, view);
            m4093k(view, 0);
        }
    }

    /* renamed from: l */
    private static void m4096l(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m4024R(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m4024R((View) parent);
            }
        }
    }

    /* renamed from: b */
    public static C0883ab m4056b(View view, C0883ab abVar) {
        WindowInsets o;
        if (Build.VERSION.SDK_INT < 21 || (o = abVar.mo4660o()) == null || view.dispatchApplyWindowInsets(o).equals(o)) {
            return abVar;
        }
        return C0883ab.m4271a(o);
    }

    /* renamed from: c */
    public static void m4066c(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setNestedScrollingEnabled(z);
        } else if (view instanceof NestedScrollingChild) {
            ((NestedScrollingChild) view).setNestedScrollingEnabled(z);
        }
    }

    /* renamed from: i */
    public static void m4087i(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
        } else if (Build.VERSION.SDK_INT >= 21) {
            Rect b = m4054b();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m4096l(view, i);
            if (z && b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b);
            }
        } else {
            m4096l(view, i);
        }
    }

    /* renamed from: j */
    public static void m4089j(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
        } else if (Build.VERSION.SDK_INT >= 21) {
            Rect b = m4054b();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m4098m(view, i);
            if (z && b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b);
            }
        } else {
            m4098m(view, i);
        }
    }

    /* renamed from: k */
    static void m4093k(View view, int i) {
        boolean z;
        int i2;
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            if (m4019M(view) != null) {
                z = true;
            } else {
                z = false;
            }
            if (m4091k(view) != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (z) {
                    i2 = 32;
                } else {
                    i2 = 2048;
                }
                obtain.setEventType(i2);
                obtain.setContentChangeTypes(i);
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m4029a(int i, View view) {
        List<C0864d.C0865a> Q = m4023Q(view);
        for (int i2 = 0; i2 < Q.size(); i2++) {
            if (Q.get(i2).mo4623a() == i) {
                Q.remove(i2);
                return;
            }
        }
    }

    /* renamed from: b */
    public static boolean m4060b(View view, int i) {
        return view.canScrollVertically(i);
    }

    /* renamed from: b */
    static boolean m4061b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0858g.m4145a(view).mo4530a(view, keyEvent);
    }

    /* renamed from: a */
    public static void m4033a(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    /* renamed from: androidx.core.view.ViewCompat$c */
    private static class C0854c {
        /* renamed from: a */
        static C0883ab m4140a(View view, C0883ab abVar, Rect rect) {
            WindowInsets o = abVar.mo4660o();
            if (o != null) {
                return C0883ab.m4271a(view.computeSystemWindowInsets(o, rect));
            }
            rect.setEmpty();
            return abVar;
        }
    }

    /* renamed from: a */
    public static C0883ab m4028a(View view, C0883ab abVar, Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0854c.m4140a(view, abVar, rect);
        }
        return abVar;
    }

    /* renamed from: a */
    public static void m4031a(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: b */
    public static void m4058b(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m4032a(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        } else {
            view.postInvalidate(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.core.view.ViewCompat$e */
    public static class C0856e {
        /* renamed from: a */
        static void m4142a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: a */
    public static void m4034a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C0856e.m4142a(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }
}
