package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.C0769b;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.view.C0859a;
import androidx.core.view.C0883ab;
import androidx.core.view.C0904f;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.AbstractC0873g;
import androidx.core.view.p029a.C0864d;
import androidx.customview.p030a.C0959c;
import androidx.customview.view.AbsSavedState;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup {

    /* renamed from: O */
    private static boolean f3621O;

    /* renamed from: a */
    static final int[] f3622a = {16842931};

    /* renamed from: b */
    static final boolean f3623b;

    /* renamed from: c */
    private static final int[] f3624c = {16843828};

    /* renamed from: d */
    private static final boolean f3625d;

    /* renamed from: A */
    private Drawable f3626A;

    /* renamed from: B */
    private Drawable f3627B;

    /* renamed from: C */
    private Drawable f3628C;

    /* renamed from: D */
    private CharSequence f3629D;

    /* renamed from: E */
    private CharSequence f3630E;

    /* renamed from: F */
    private Object f3631F;

    /* renamed from: G */
    private boolean f3632G;

    /* renamed from: H */
    private Drawable f3633H;

    /* renamed from: I */
    private Drawable f3634I;

    /* renamed from: J */
    private Drawable f3635J;

    /* renamed from: K */
    private Drawable f3636K;

    /* renamed from: L */
    private final ArrayList<View> f3637L;

    /* renamed from: M */
    private Rect f3638M;

    /* renamed from: N */
    private Matrix f3639N;

    /* renamed from: P */
    private final AbstractC0873g f3640P;

    /* renamed from: e */
    private final C0973b f3641e;

    /* renamed from: f */
    private float f3642f;

    /* renamed from: g */
    private int f3643g;

    /* renamed from: h */
    private int f3644h;

    /* renamed from: i */
    private float f3645i;

    /* renamed from: j */
    private Paint f3646j;

    /* renamed from: k */
    private final C0959c f3647k;

    /* renamed from: l */
    private final C0959c f3648l;

    /* renamed from: m */
    private final C0976e f3649m;

    /* renamed from: n */
    private final C0976e f3650n;

    /* renamed from: o */
    private int f3651o;

    /* renamed from: p */
    private boolean f3652p;

    /* renamed from: q */
    private boolean f3653q;

    /* renamed from: r */
    private int f3654r;

    /* renamed from: s */
    private int f3655s;

    /* renamed from: t */
    private int f3656t;

    /* renamed from: u */
    private int f3657u;

    /* renamed from: v */
    private boolean f3658v;

    /* renamed from: w */
    private AbstractC0974c f3659w;

    /* renamed from: x */
    private List<AbstractC0974c> f3660x;

    /* renamed from: y */
    private float f3661y;

    /* renamed from: z */
    private float f3662z;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    public interface AbstractC0974c {
        /* renamed from: a */
        void mo719a(int i);

        /* renamed from: a */
        void mo720a(View view);

        /* renamed from: a */
        void mo721a(View view, float f);

        /* renamed from: b */
        void mo723b(View view);
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    public static abstract class AbstractC0975d implements AbstractC0974c {
        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c
        /* renamed from: a */
        public void mo719a(int i) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c
        /* renamed from: a */
        public void mo720a(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c
        /* renamed from: a */
        public void mo721a(View view, float f) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c
        /* renamed from: b */
        public void mo723b(View view) {
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    static final class C0973b extends C0859a {
        C0973b() {
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: a */
        public void mo4535a(View view, C0864d dVar) {
            super.mo4535a(view, dVar);
            if (!DrawerLayout.m4712l(view)) {
                dVar.mo4579d((View) null);
            }
        }
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f3626A;
    }

    /* renamed from: a */
    public void mo4919a(Object obj, boolean z) {
        this.f3631F = obj;
        this.f3632G = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    /* renamed from: a */
    public void mo4918a(AbstractC0974c cVar) {
        if (cVar != null) {
            if (this.f3660x == null) {
                this.f3660x = new ArrayList();
            }
            this.f3660x.add(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4916a(View view, float f) {
        List<AbstractC0974c> list = this.f3660x;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3660x.get(size).mo721a(view, f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4920a(View view, int i) {
        return (mo4942e(view) & i) == i;
    }

    /* renamed from: a */
    public void mo4917a(View view, boolean z) {
        if (mo4947g(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f3653q) {
                layoutParams.f3666b = 1.0f;
                layoutParams.f3668d = 1;
                m4705c(view, true);
                m4713m(view);
            } else if (z) {
                layoutParams.f3668d |= 2;
                if (mo4920a(view, 3)) {
                    this.f3647k.mo4868a(view, 0, view.getTop());
                } else {
                    this.f3648l.mo4868a(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                mo4934c(view, 1.0f);
                mo4914a(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    public class C0976e extends C0959c.AbstractC0962a {

        /* renamed from: b */
        private final int f3677b;

        /* renamed from: c */
        private C0959c f3678c;

        /* renamed from: d */
        private final Runnable f3679d = new Runnable() {
            /* class androidx.drawerlayout.widget.DrawerLayout.C0976e.RunnableC09771 */

            public void run() {
                C0976e.this.mo4987b();
            }
        };

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: b */
        public boolean mo4899b(int i) {
            return false;
        }

        /* renamed from: a */
        public void mo4985a() {
            DrawerLayout.this.removeCallbacks(this.f3679d);
        }

        /* renamed from: c */
        private void m4767c() {
            int i = 3;
            if (this.f3677b == 3) {
                i = 5;
            }
            View c = DrawerLayout.this.mo4932c(i);
            if (c != null) {
                DrawerLayout.this.mo4954i(c);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4987b() {
            boolean z;
            View view;
            int i;
            int c = this.f3678c.mo4876c();
            int i2 = 0;
            if (this.f3677b == 3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                view = DrawerLayout.this.mo4932c(3);
                if (view != null) {
                    i2 = -view.getWidth();
                }
                i = i2 + c;
            } else {
                view = DrawerLayout.this.mo4932c(5);
                i = DrawerLayout.this.getWidth() - c;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.b_(view) == 0) {
                this.f3678c.mo4868a(view, i, view.getTop());
                ((LayoutParams) view.getLayoutParams()).f3667c = true;
                DrawerLayout.this.invalidate();
                m4767c();
                DrawerLayout.this.mo4938d();
            }
        }

        /* renamed from: a */
        public void mo4986a(C0959c cVar) {
            this.f3678c = cVar;
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public int mo4889a(View view) {
            if (DrawerLayout.this.mo4947g(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4891a(int i) {
            DrawerLayout.this.mo4914a(i, this.f3678c.mo4882e());
        }

        C0976e(int i) {
            this.f3677b = i;
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: b */
        public boolean mo4900b(View view, int i) {
            if (!DrawerLayout.this.mo4947g(view) || !DrawerLayout.this.mo4920a(view, this.f3677b) || DrawerLayout.this.b_(view) != 0) {
                return false;
            }
            return true;
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: b */
        public void mo4898b(int i, int i2) {
            View view;
            if ((i & 1) == 1) {
                view = DrawerLayout.this.mo4932c(3);
            } else {
                view = DrawerLayout.this.mo4932c(5);
            }
            if (view != null && DrawerLayout.this.b_(view) == 0) {
                this.f3678c.mo4865a(view, i2);
            }
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4892a(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f3679d, 160);
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4894a(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).f3667c = false;
            m4767c();
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: b */
        public int mo4897b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public int mo4890a(View view, int i, int i2) {
            if (DrawerLayout.this.mo4920a(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4893a(View view, float f, float f2) {
            int i;
            float d = DrawerLayout.this.mo4937d(view);
            int width = view.getWidth();
            if (DrawerLayout.this.mo4920a(view, 3)) {
                int i2 = (f > BitmapDescriptorFactory.HUE_RED ? 1 : (f == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                if (i2 > 0 || (i2 == 0 && d > 0.5f)) {
                    i = 0;
                } else {
                    i = -width;
                }
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < BitmapDescriptorFactory.HUE_RED || (f == BitmapDescriptorFactory.HUE_RED && d > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f3678c.mo4866a(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4895a(View view, int i, int i2, int i3, int i4) {
            float f;
            int i5;
            int width = view.getWidth();
            if (DrawerLayout.this.mo4920a(view, 3)) {
                f = (float) (i + width);
            } else {
                f = (float) (DrawerLayout.this.getWidth() - i);
            }
            float f2 = f / ((float) width);
            DrawerLayout.this.mo4927b(view, f2);
            if (f2 == BitmapDescriptorFactory.HUE_RED) {
                i5 = 4;
            } else {
                i5 = 0;
            }
            view.setVisibility(i5);
            DrawerLayout.this.invalidate();
        }
    }

    /* renamed from: b */
    public void mo4924b() {
        d_(false);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3653q = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3653q = true;
    }

    public void requestLayout() {
        if (!this.f3652p) {
            super.requestLayout();
        }
    }

    /* renamed from: i */
    private boolean mo157771i() {
        if (mo4931c() != null) {
            return true;
        }
        return false;
    }

    public float getDrawerElevation() {
        if (f3625d) {
            return this.f3642f;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: e */
    private void mo157767e() {
        if (!f3625d) {
            this.f3627B = mo157768f();
            this.f3628C = mo157769g();
        }
    }

    /* renamed from: f */
    private Drawable mo157768f() {
        int h = ViewCompat.m4082h(this);
        if (h == 0) {
            Drawable drawable = this.f3633H;
            if (drawable != null) {
                m4701a(drawable, h);
                return this.f3633H;
            }
        } else {
            Drawable drawable2 = this.f3634I;
            if (drawable2 != null) {
                m4701a(drawable2, h);
                return this.f3634I;
            }
        }
        return this.f3635J;
    }

    /* renamed from: g */
    private Drawable mo157769g() {
        int h = ViewCompat.m4082h(this);
        if (h == 0) {
            Drawable drawable = this.f3634I;
            if (drawable != null) {
                m4701a(drawable, h);
                return this.f3634I;
            }
        } else {
            Drawable drawable2 = this.f3633H;
            if (drawable2 != null) {
                m4701a(drawable2, h);
                return this.f3633H;
            }
        }
        return this.f3636K;
    }

    /* renamed from: h */
    private boolean mo157770h() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).f3667c) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public View mo4931c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (mo4947g(childAt) && mo4956k(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    static {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (Build.VERSION.SDK_INT >= 19) {
            z = true;
        } else {
            z = false;
        }
        f3623b = z;
        if (Build.VERSION.SDK_INT >= 21) {
            z2 = true;
        } else {
            z2 = false;
        }
        f3625d = z2;
        if (Build.VERSION.SDK_INT < 29) {
            z3 = false;
        }
        f3621O = z3;
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((LayoutParams) getChildAt(i).getLayoutParams()).f3666b);
        }
        this.f3645i = f;
        boolean a = this.f3647k.mo4869a(true);
        boolean a2 = this.f3648l.mo4869a(true);
        if (a || a2) {
            ViewCompat.m4073e(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4938d() {
        if (!this.f3658v) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f3658v = true;
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            boolean z2 = true;
            if (layoutParams.f3668d == 1) {
                z = true;
            } else {
                z = false;
            }
            if (layoutParams.f3668d != 2) {
                z2 = false;
            }
            if (z || z2) {
                savedState.f3669a = layoutParams.f3665a;
            } else {
                i++;
            }
        }
        savedState.f3670b = this.f3654r;
        savedState.f3671d = this.f3655s;
        savedState.f3672e = this.f3656t;
        savedState.f3673f = this.f3657u;
        return savedState;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo4912a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).f3668d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class androidx.drawerlayout.widget.DrawerLayout.SavedState.C09711 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        int f3669a;

        /* renamed from: b */
        int f3670b;

        /* renamed from: d */
        int f3671d;

        /* renamed from: e */
        int f3672e;

        /* renamed from: f */
        int f3673f;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3669a);
            parcel.writeInt(this.f3670b);
            parcel.writeInt(this.f3671d);
            parcel.writeInt(this.f3672e);
            parcel.writeInt(this.f3673f);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3669a = parcel.readInt();
            this.f3670b = parcel.readInt();
            this.f3671d = parcel.readInt();
            this.f3672e = parcel.readInt();
            this.f3673f = parcel.readInt();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        mo157767e();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f3665a;

        /* renamed from: b */
        float f3666b;

        /* renamed from: c */
        boolean f3667c;

        /* renamed from: d */
        int f3668d;

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f3665a = layoutParams.f3665a;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f3622a);
            this.f3665a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    /* renamed from: e */
    public void mo4943e(int i) {
        mo4915a(i, true);
    }

    /* renamed from: f */
    public void mo4944f(int i) {
        mo4925b(i, true);
    }

    /* renamed from: h */
    public void mo4953h(View view) {
        mo4917a(view, true);
    }

    /* renamed from: i */
    public void mo4954i(View view) {
        mo4928b(view, true);
    }

    public void setScrimColor(int i) {
        this.f3644h = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f3626A = drawable;
        invalidate();
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    class C0972a extends C0859a {

        /* renamed from: b */
        private final Rect f3675b = new Rect();

        C0972a() {
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: d */
        public void mo4540d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo4540d(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        /* renamed from: a */
        private void m4752a(C0864d dVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m4712l(childAt)) {
                    dVar.mo4573c(childAt);
                }
            }
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: b */
        public boolean mo4538b(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence b;
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo4538b(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View c = DrawerLayout.this.mo4931c();
            if (c == null || (b = DrawerLayout.this.mo4923b(DrawerLayout.this.mo4942e(c))) == null) {
                return true;
            }
            text.add(b);
            return true;
        }

        /* renamed from: a */
        private void m4753a(C0864d dVar, C0864d dVar2) {
            Rect rect = this.f3675b;
            dVar2.mo4572c(rect);
            dVar.mo4578d(rect);
            dVar.mo4583e(dVar2.mo4599j());
            dVar.mo4557a(dVar2.mo4613r());
            dVar.mo4566b(dVar2.mo4614s());
            dVar.mo4582e(dVar2.mo4617u());
            dVar.mo4598j(dVar2.mo4609o());
            dVar.mo4580d(dVar2.mo4597i());
            dVar.mo4586f(dVar2.mo4601k());
            dVar.mo4589g(dVar2.mo4603l());
            dVar.mo4552a(dVar2.mo4577d());
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: a */
        public void mo4535a(View view, C0864d dVar) {
            if (DrawerLayout.f3623b) {
                super.mo4535a(view, dVar);
            } else {
                C0864d a = C0864d.m4172a(dVar);
                super.mo4535a(view, a);
                dVar.mo4564b(view);
                ViewParent i = ViewCompat.m4085i(view);
                if (i instanceof View) {
                    dVar.mo4579d((View) i);
                }
                m4753a(dVar, a);
                a.mo4618v();
                m4752a(dVar, (ViewGroup) view);
            }
            dVar.mo4566b("androidx.drawerlayout.widget.DrawerLayout");
            dVar.mo4576c(false);
            dVar.mo4580d(false);
            dVar.mo4569b(C0864d.C0865a.f3369a);
            dVar.mo4569b(C0864d.C0865a.f3370b);
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: a */
        public boolean mo4537a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f3623b || DrawerLayout.m4712l(view)) {
                return super.mo4537a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* renamed from: n */
    private static boolean m4714n(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo4929b(AbstractC0974c cVar) {
        List<AbstractC0974c> list;
        if (cVar != null && (list = this.f3660x) != null) {
            list.remove(cVar);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo4937d(View view) {
        return ((LayoutParams) view.getLayoutParams()).f3666b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo4945f(View view) {
        if (((LayoutParams) view.getLayoutParams()).f3665a == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo4946g(int i) {
        View c = mo4932c(i);
        if (c != null) {
            return mo4955j(c);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            d_(true);
        }
    }

    public void setDrawerListener(AbstractC0974c cVar) {
        AbstractC0974c cVar2 = this.f3659w;
        if (cVar2 != null) {
            mo4929b(cVar2);
        }
        if (cVar != null) {
            mo4918a(cVar);
        }
        this.f3659w = cVar;
    }

    public void setDrawerLockMode(int i) {
        mo4913a(i, 3);
        mo4913a(i, 5);
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f3626A = new ColorDrawable(i);
        invalidate();
    }

    /* renamed from: d */
    static String m4706d(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        if ((i & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i);
    }

    /* renamed from: l */
    static boolean m4712l(View view) {
        if (ViewCompat.m4076f(view) == 4 || ViewCompat.m4076f(view) == 2) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private void m4713m(View view) {
        ViewCompat.m4075e(view, C0864d.C0865a.f3389u.mo4623a());
        if (mo4955j(view) && b_(view) != 2) {
            ViewCompat.m4041a(view, C0864d.C0865a.f3389u, null, this.f3640P);
        }
    }

    /* renamed from: b */
    public CharSequence mo4923b(int i) {
        int a = C0904f.m4351a(i, ViewCompat.m4082h(this));
        if (a == 3) {
            return this.f3629D;
        }
        if (a == 5) {
            return this.f3630E;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public void setDrawerElevation(float f) {
        this.f3642f = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (mo4947g(childAt)) {
                ViewCompat.m4092k(childAt, this.f3642f);
            }
        }
    }

    public void setStatusBarBackground(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = ContextCompat.getDrawable(getContext(), i);
        } else {
            drawable = null;
        }
        this.f3626A = drawable;
        invalidate();
    }

    public int b_(View view) {
        if (mo4947g(view)) {
            return mo4911a(((LayoutParams) view.getLayoutParams()).f3665a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo4942e(View view) {
        return C0904f.m4351a(((LayoutParams) view.getLayoutParams()).f3665a, ViewCompat.m4082h(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo4947g(View view) {
        int a = C0904f.m4351a(((LayoutParams) view.getLayoutParams()).f3665a, ViewCompat.m4082h(view));
        if ((a & 3) == 0 && (a & 5) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public boolean mo4955j(View view) {
        if (!mo4947g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        } else if ((((LayoutParams) view.getLayoutParams()).f3668d & 1) == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: k */
    public boolean mo4956k(View view) {
        if (!mo4947g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        } else if (((LayoutParams) view.getLayoutParams()).f3666b > BitmapDescriptorFactory.HUE_RED) {
            return true;
        } else {
            return false;
        }
    }

    public void onDraw(Canvas canvas) {
        int i;
        Object obj;
        super.onDraw(canvas);
        if (this.f3632G && this.f3626A != null) {
            if (Build.VERSION.SDK_INT < 21 || (obj = this.f3631F) == null) {
                i = 0;
            } else {
                i = ((WindowInsets) obj).getSystemWindowInsetTop();
            }
            if (i > 0) {
                this.f3626A.setBounds(0, 0, getWidth(), i);
                this.f3626A.draw(canvas);
            }
        }
    }

    /* renamed from: a */
    public int mo4911a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int h = ViewCompat.m4082h(this);
        if (i == 3) {
            int i6 = this.f3654r;
            if (i6 != 3) {
                return i6;
            }
            if (h == 0) {
                i2 = this.f3656t;
            } else {
                i2 = this.f3657u;
            }
            if (i2 != 3) {
                return i2;
            }
            return 0;
        } else if (i == 5) {
            int i7 = this.f3655s;
            if (i7 != 3) {
                return i7;
            }
            if (h == 0) {
                i3 = this.f3657u;
            } else {
                i3 = this.f3656t;
            }
            if (i3 != 3) {
                return i3;
            }
            return 0;
        } else if (i == 8388611) {
            int i8 = this.f3656t;
            if (i8 != 3) {
                return i8;
            }
            if (h == 0) {
                i4 = this.f3654r;
            } else {
                i4 = this.f3655s;
            }
            if (i4 != 3) {
                return i4;
            }
            return 0;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i9 = this.f3657u;
            if (i9 != 3) {
                return i9;
            }
            if (h == 0) {
                i5 = this.f3655s;
            } else {
                i5 = this.f3654r;
            }
            if (i5 != 3) {
                return i5;
            }
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public View mo4932c(int i) {
        int a = C0904f.m4351a(i, ViewCompat.m4082h(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((mo4942e(childAt) & 7) == a) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void d_(boolean z) {
        boolean z2;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (mo4947g(childAt) && (!z || layoutParams.f3667c)) {
                int width = childAt.getWidth();
                if (mo4920a(childAt, 3)) {
                    z2 = this.f3647k.mo4868a(childAt, -width, childAt.getTop());
                } else {
                    z2 = this.f3648l.mo4868a(childAt, getWidth(), childAt.getTop());
                }
                z3 |= z2;
                layoutParams.f3667c = false;
            }
        }
        this.f3649m.mo4985a();
        this.f3650n.mo4985a();
        if (z3) {
            invalidate();
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f3645i <= BitmapDescriptorFactory.HUE_RED) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (m4702a(x, y, childAt) && !mo4945f(childAt) && m4703a(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View c;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo4902a());
        if (!(savedState.f3669a == 0 || (c = mo4932c(savedState.f3669a)) == null)) {
            mo4953h(c);
        }
        if (savedState.f3670b != 3) {
            mo4913a(savedState.f3670b, 3);
        }
        if (savedState.f3671d != 3) {
            mo4913a(savedState.f3671d, 5);
        }
        if (savedState.f3672e != 3) {
            mo4913a(savedState.f3672e, 8388611);
        }
        if (savedState.f3673f != 3) {
            mo4913a(savedState.f3673f, 8388613);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        if (b_(r7) != 2) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4926b(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f3668d & 1) == 1) {
            layoutParams.f3668d = 0;
            List<AbstractC0974c> list = this.f3660x;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f3660x.get(size).mo723b(view);
                }
            }
            m4705c(view, false);
            m4713m(view);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4933c(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f3668d & 1) == 0) {
            layoutParams.f3668d = 1;
            List<AbstractC0974c> list = this.f3660x;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f3660x.get(size).mo720a(view);
                }
            }
            m4705c(view, true);
            m4713m(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.drawerLayoutStyle);
    }

    /* renamed from: a */
    private void m4701a(Drawable drawable, int i) {
        if (drawable != null && C0774a.m3773b(drawable)) {
            C0774a.m3774b(drawable, i);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !mo157771i()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View c = mo4931c();
        if (c != null && b_(c) == 0) {
            mo4924b();
        }
        if (c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m4703a(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent b = m4704b(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(b);
            b.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    /* renamed from: b */
    private MotionEvent m4704b(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f3639N == null) {
                this.f3639N = new Matrix();
            }
            matrix.invert(this.f3639N);
            obtain.transform(this.f3639N);
        }
        return obtain;
    }

    /* renamed from: c */
    private void m4705c(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || mo4947g(childAt)) && (!z || childAt != view)) {
                ViewCompat.m4069d(childAt, 4);
            } else {
                ViewCompat.m4069d(childAt, 1);
            }
        }
    }

    /* renamed from: b */
    public void mo4925b(int i, boolean z) {
        View c = mo4932c(i);
        if (c != null) {
            mo4928b(c, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m4706d(i));
    }

    /* renamed from: a */
    public void mo4913a(int i, int i2) {
        View c;
        C0959c cVar;
        int a = C0904f.m4351a(i2, ViewCompat.m4082h(this));
        if (i2 == 3) {
            this.f3654r = i;
        } else if (i2 == 5) {
            this.f3655s = i;
        } else if (i2 == 8388611) {
            this.f3656t = i;
        } else if (i2 == 8388613) {
            this.f3657u = i;
        }
        if (i != 0) {
            if (a == 3) {
                cVar = this.f3647k;
            } else {
                cVar = this.f3648l;
            }
            cVar.mo4885g();
        }
        if (i == 1) {
            View c2 = mo4932c(a);
            if (c2 != null) {
                mo4954i(c2);
            }
        } else if (i == 2 && (c = mo4932c(a)) != null) {
            mo4953h(c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4927b(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f != layoutParams.f3666b) {
            layoutParams.f3666b = f;
            mo4916a(view, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4934c(View view, float f) {
        float d = mo4937d(view);
        float width = (float) view.getWidth();
        int i = ((int) (width * f)) - ((int) (d * width));
        if (!mo4920a(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        mo4927b(view, f);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode == 0) {
                    size = LocationRequest.PRIORITY_INDOOR;
                }
                if (mode2 == 0) {
                    size2 = LocationRequest.PRIORITY_INDOOR;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        if (this.f3631F == null || !ViewCompat.m4109x(this)) {
            z = false;
        } else {
            z = true;
        }
        int h = ViewCompat.m4082h(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int a = C0904f.m4351a(layoutParams.f3665a, h);
                    if (ViewCompat.m4109x(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.f3631F;
                            if (a == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (a == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.f3631F;
                        if (a == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (a == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        layoutParams.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        layoutParams.topMargin = windowInsets2.getSystemWindowInsetTop();
                        layoutParams.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        layoutParams.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (mo4945f(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - layoutParams.topMargin) - layoutParams.bottomMargin, 1073741824));
                } else if (mo4947g(childAt)) {
                    if (f3625d) {
                        float s = ViewCompat.m4104s(childAt);
                        float f = this.f3642f;
                        if (s != f) {
                            ViewCompat.m4092k(childAt, f);
                        }
                    }
                    int e = mo4942e(childAt) & 7;
                    if (e == 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((!z2 || !z3) && (z2 || !z4)) {
                        if (z2) {
                            z3 = true;
                        } else {
                            z4 = true;
                        }
                        childAt.measure(getChildMeasureSpec(i, this.f3643g + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), getChildMeasureSpec(i2, layoutParams.topMargin + layoutParams.bottomMargin, layoutParams.height));
                        i4++;
                        i3 = 0;
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m4706d(e) + " but this " + "DrawerLayout" + " already has a drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            i4++;
            i3 = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4914a(int i, View view) {
        int b = this.f3647k.mo4870b();
        int b2 = this.f3648l.mo4870b();
        int i2 = 2;
        if (b == 1 || b2 == 1) {
            i2 = 1;
        } else if (!(b == 2 || b2 == 2)) {
            i2 = 0;
        }
        if (view != null && i == 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams.f3666b == BitmapDescriptorFactory.HUE_RED) {
                mo4926b(view);
            } else if (layoutParams.f3666b == 1.0f) {
                mo4933c(view);
            }
        }
        if (i2 != this.f3651o) {
            this.f3651o = i2;
            List<AbstractC0974c> list = this.f3660x;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f3660x.get(size).mo719a(i2);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo4928b(View view, boolean z) {
        if (mo4947g(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f3653q) {
                layoutParams.f3666b = BitmapDescriptorFactory.HUE_RED;
                layoutParams.f3668d = 0;
            } else if (z) {
                layoutParams.f3668d |= 4;
                if (mo4920a(view, 3)) {
                    this.f3647k.mo4868a(view, -view.getWidth(), view.getTop());
                } else {
                    this.f3648l.mo4868a(view, getWidth(), view.getTop());
                }
            } else {
                mo4934c(view, BitmapDescriptorFactory.HUE_RED);
                mo4914a(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: a */
    public void mo4915a(int i, boolean z) {
        View c = mo4932c(i);
        if (c != null) {
            mo4917a(c, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m4706d(i));
    }

    /* renamed from: a */
    private boolean m4702a(float f, float f2, View view) {
        if (this.f3638M == null) {
            this.f3638M = new Rect();
        }
        view.getHitRect(this.f3638M);
        return this.f3638M.contains((int) f, (int) f2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (mo4912a() != null || mo4947g(view)) {
            ViewCompat.m4069d(view, 4);
        } else {
            ViewCompat.m4069d(view, 1);
        }
        if (!f3623b) {
            ViewCompat.m4043a(view, this.f3641e);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!mo4947g(childAt)) {
                    this.f3637L.add(childAt);
                } else if (mo4955j(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.f3637L.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.f3637L.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f3637L.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3641e = new C0973b();
        this.f3644h = -1728053248;
        this.f3646j = new Paint();
        this.f3653q = true;
        this.f3654r = 3;
        this.f3655s = 3;
        this.f3656t = 3;
        this.f3657u = 3;
        this.f3633H = null;
        this.f3634I = null;
        this.f3635J = null;
        this.f3636K = null;
        this.f3640P = new AbstractC0873g() {
            /* class androidx.drawerlayout.widget.DrawerLayout.C09691 */

            @Override // androidx.core.view.p029a.AbstractC0873g
            /* renamed from: a */
            public boolean mo4640a(View view, AbstractC0873g.AbstractC0874a aVar) {
                if (!DrawerLayout.this.mo4955j(view) || DrawerLayout.this.b_(view) == 2) {
                    return false;
                }
                DrawerLayout.this.mo4954i(view);
                return true;
            }
        };
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f3643g = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        C0976e eVar = new C0976e(3);
        this.f3649m = eVar;
        C0976e eVar2 = new C0976e(5);
        this.f3650n = eVar2;
        C0959c a = C0959c.m4641a(this, 1.0f, eVar);
        this.f3647k = a;
        a.mo4864a(1);
        a.mo4863a(f2);
        eVar.mo4986a(a);
        C0959c a2 = C0959c.m4641a(this, 1.0f, eVar2);
        this.f3648l = a2;
        a2.mo4864a(2);
        a2.mo4863a(f2);
        eVar2.mo4986a(a2);
        setFocusableInTouchMode(true);
        ViewCompat.m4069d((View) this, 1);
        ViewCompat.m4043a(this, new C0972a());
        setMotionEventSplittingEnabled(false);
        if (ViewCompat.m4109x(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                    /* class androidx.drawerlayout.widget.DrawerLayout.View$OnApplyWindowInsetsListenerC09702 */

                    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        boolean z;
                        DrawerLayout drawerLayout = (DrawerLayout) view;
                        if (windowInsets.getSystemWindowInsetTop() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        drawerLayout.mo4919a(windowInsets, z);
                        return windowInsets.consumeSystemWindowInsets();
                    }
                });
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f3624c);
                try {
                    this.f3626A = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f3626A = null;
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.elevation}, i, 0);
        try {
            if (obtainStyledAttributes2.hasValue(0)) {
                this.f3642f = obtainStyledAttributes2.getDimension(0, BitmapDescriptorFactory.HUE_RED);
            } else {
                this.f3642f = getResources().getDimension(R.dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.f3637L = new ArrayList<>();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        int height = getHeight();
        boolean f = mo4945f(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (f) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && m4714n(childAt) && mo4947g(childAt) && childAt.getHeight() >= height) {
                    if (mo4920a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f2 = this.f3645i;
        if (f2 > BitmapDescriptorFactory.HUE_RED && f) {
            int i4 = this.f3644h;
            this.f3646j.setColor((i4 & 16777215) | (((int) (((float) ((-16777216 & i4) >>> 24)) * f2)) << 24));
            canvas.drawRect((float) i, BitmapDescriptorFactory.HUE_RED, (float) width, (float) getHeight(), this.f3646j);
        } else if (this.f3627B != null && mo4920a(view, 3)) {
            int intrinsicWidth = this.f3627B.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max((float) BitmapDescriptorFactory.HUE_RED, Math.min(((float) right2) / ((float) this.f3647k.mo4876c()), 1.0f));
            this.f3627B.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f3627B.setAlpha((int) (max * 255.0f));
            this.f3627B.draw(canvas);
        } else if (this.f3628C != null && mo4920a(view, 5)) {
            int intrinsicWidth2 = this.f3628C.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max((float) BitmapDescriptorFactory.HUE_RED, Math.min(((float) (getWidth() - left2)) / ((float) this.f3648l.mo4876c()), 1.0f));
            this.f3628C.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f3628C.setAlpha((int) (max2 * 255.0f));
            this.f3628C.draw(canvas);
        }
        return drawChild;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        boolean z2;
        int i6;
        this.f3652p = true;
        int i7 = i3 - i;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (mo4945f(childAt)) {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (mo4920a(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (layoutParams.f3666b * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i9 = i7 - ((int) (layoutParams.f3666b * f3));
                        f = ((float) (i7 - i9)) / f3;
                        i5 = i9;
                    }
                    if (f != layoutParams.f3666b) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i10 = layoutParams.f3665a & SmEvents.EVENT_NE_RR;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        if (i12 < layoutParams.topMargin) {
                            i12 = layoutParams.topMargin;
                        } else if (i12 + measuredHeight > i11 - layoutParams.bottomMargin) {
                            i12 = (i11 - layoutParams.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i5, i12, measuredWidth + i5, measuredHeight + i12);
                    } else if (i10 != 80) {
                        childAt.layout(i5, layoutParams.topMargin, measuredWidth + i5, layoutParams.topMargin + measuredHeight);
                    } else {
                        int i13 = i4 - i2;
                        childAt.layout(i5, (i13 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i13 - layoutParams.bottomMargin);
                    }
                    if (z2) {
                        mo4927b(childAt, f);
                    }
                    if (layoutParams.f3666b > BitmapDescriptorFactory.HUE_RED) {
                        i6 = 0;
                    } else {
                        i6 = 4;
                    }
                    if (childAt.getVisibility() != i6) {
                        childAt.setVisibility(i6);
                    }
                }
            }
        }
        if (f3621O && (rootWindowInsets = getRootWindowInsets()) != null) {
            C0769b n = C0883ab.m4271a(rootWindowInsets).mo4659n();
            C0959c cVar = this.f3647k;
            cVar.mo4871b(Math.max(cVar.mo4879d(), n.f3131b));
            C0959c cVar2 = this.f3648l;
            cVar2.mo4871b(Math.max(cVar2.mo4879d(), n.f3133d));
        }
        this.f3652p = false;
        this.f3653q = false;
    }
}
