package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.C22353j;
import com.google.android.material.internal.C22358l;
import com.google.android.material.p988i.C22313c;
import com.google.android.material.p988i.C22314d;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

public class BadgeDrawable extends Drawable implements C22353j.AbstractC22355a {

    /* renamed from: a */
    private static final int f53866a = 2131887331;

    /* renamed from: b */
    private static final int f53867b = 2130968718;

    /* renamed from: c */
    private final WeakReference<Context> f53868c;

    /* renamed from: d */
    private final MaterialShapeDrawable f53869d = new MaterialShapeDrawable();

    /* renamed from: e */
    private final C22353j f53870e;

    /* renamed from: f */
    private final Rect f53871f = new Rect();

    /* renamed from: g */
    private final float f53872g;

    /* renamed from: h */
    private final float f53873h;

    /* renamed from: i */
    private final float f53874i;

    /* renamed from: j */
    private final SavedState f53875j;

    /* renamed from: k */
    private float f53876k;

    /* renamed from: l */
    private float f53877l;

    /* renamed from: m */
    private int f53878m;

    /* renamed from: n */
    private float f53879n;

    /* renamed from: o */
    private float f53880o;

    /* renamed from: p */
    private float f53881p;

    /* renamed from: q */
    private WeakReference<View> f53882q;

    /* renamed from: r */
    private WeakReference<ViewGroup> f53883r;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeGravity {
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        return false;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: a */
    public SavedState mo76486a() {
        return this.f53875j;
    }

    @Override // com.google.android.material.internal.C22353j.AbstractC22355a
    /* renamed from: e */
    public void mo76496e() {
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo76488a(View view, ViewGroup viewGroup) {
        this.f53882q = new WeakReference<>(view);
        this.f53883r = new WeakReference<>(viewGroup);
        m79806g();
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo76487a(int i) {
        this.f53875j.f53884a = i;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (this.f53869d.mo77948M() != valueOf) {
            this.f53869d.mo77973g(valueOf);
            invalidateSelf();
        }
    }

    /* renamed from: d */
    public int mo76493d() {
        return this.f53875j.f53888e;
    }

    public int getAlpha() {
        return this.f53875j.f53886c;
    }

    public int getIntrinsicHeight() {
        return this.f53871f.height();
    }

    public int getIntrinsicWidth() {
        return this.f53871f.width();
    }

    /* renamed from: b */
    public boolean mo76490b() {
        if (this.f53875j.f53887d != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public int mo76491c() {
        if (!mo76490b()) {
            return 0;
        }
        return this.f53875j.f53887d;
    }

    /* renamed from: i */
    private void m79809i() {
        this.f53878m = ((int) Math.pow(10.0d, ((double) mo76493d()) - 1.0d)) - 1;
    }

    /* renamed from: h */
    private String m79807h() {
        if (mo76491c() <= this.f53878m) {
            return Integer.toString(mo76491c());
        }
        Context context = this.f53868c.get();
        if (context == null) {
            return "";
        }
        return context.getString(R.string.mtrl_exceed_max_badge_number_suffix, Integer.valueOf(this.f53878m), "+");
    }

    /* renamed from: g */
    private void m79806g() {
        View view;
        Context context = this.f53868c.get();
        WeakReference<View> weakReference = this.f53882q;
        ViewGroup viewGroup = null;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f53871f);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<ViewGroup> weakReference2 = this.f53883r;
            if (weakReference2 != null) {
                viewGroup = weakReference2.get();
            }
            if (viewGroup != null || C22143a.f53895a) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            m79801a(context, rect2, view);
            C22143a.m79828a(this.f53871f, this.f53876k, this.f53877l, this.f53880o, this.f53881p);
            this.f53869d.mo77982o(this.f53879n);
            if (!rect.equals(this.f53871f)) {
                this.f53869d.setBounds(this.f53871f);
            }
        }
    }

    /* renamed from: f */
    public CharSequence mo76498f() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!mo76490b()) {
            return this.f53875j.f53889f;
        }
        if (this.f53875j.f53890g <= 0 || (context = this.f53868c.get()) == null) {
            return null;
        }
        if (mo76491c() <= this.f53878m) {
            return context.getResources().getQuantityString(this.f53875j.f53890g, mo76491c(), Integer.valueOf(mo76491c()));
        }
        return context.getString(this.f53875j.f53891h, Integer.valueOf(this.f53878m));
    }

    /* renamed from: f */
    public void mo76499f(int i) {
        this.f53875j.f53893j = i;
        m79806g();
    }

    /* renamed from: g */
    public void mo76500g(int i) {
        this.f53875j.f53894k = i;
        m79806g();
    }

    @Override // com.google.android.material.internal.C22353j.AbstractC22355a
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: a */
    public static BadgeDrawable m79798a(Context context) {
        return m79799a(context, null, f53867b, f53866a);
    }

    /* renamed from: h */
    private void m79808h(int i) {
        Context context = this.f53868c.get();
        if (context != null) {
            m79804a(new C22314d(context, i));
        }
    }

    /* renamed from: b */
    public void mo76489b(int i) {
        this.f53875j.f53885b = i;
        if (this.f53870e.mo77856a().getColor() != i) {
            this.f53870e.mo77856a().setColor(i);
            invalidateSelf();
        }
    }

    /* renamed from: c */
    public void mo76492c(int i) {
        int max = Math.max(0, i);
        if (this.f53875j.f53887d != max) {
            this.f53875j.f53887d = max;
            this.f53870e.mo77860a(true);
            m79806g();
            invalidateSelf();
        }
    }

    /* renamed from: d */
    public void mo76494d(int i) {
        if (this.f53875j.f53888e != i) {
            this.f53875j.f53888e = i;
            m79809i();
            this.f53870e.mo77860a(true);
            m79806g();
            invalidateSelf();
        }
    }

    public void setAlpha(int i) {
        this.f53875j.f53886c = i;
        this.f53870e.mo77856a().setAlpha(i);
        invalidateSelf();
    }

    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.google.android.material.badge.BadgeDrawable.SavedState.C221421 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        public int f53884a;

        /* renamed from: b */
        public int f53885b;

        /* renamed from: c */
        public int f53886c = 255;

        /* renamed from: d */
        public int f53887d = -1;

        /* renamed from: e */
        public int f53888e;

        /* renamed from: f */
        public CharSequence f53889f;

        /* renamed from: g */
        public int f53890g;

        /* renamed from: h */
        public int f53891h;

        /* renamed from: i */
        public int f53892i;

        /* renamed from: j */
        public int f53893j;

        /* renamed from: k */
        public int f53894k;

        public int describeContents() {
            return 0;
        }

        public SavedState(Context context) {
            this.f53885b = new C22314d(context, 2131886896).f54594b.getDefaultColor();
            this.f53889f = context.getString(R.string.mtrl_badge_numberless_content_description);
            this.f53890g = R.plurals.mtrl_badge_content_description;
            this.f53891h = R.string.mtrl_exceed_max_badge_number_content_description;
        }

        protected SavedState(Parcel parcel) {
            this.f53884a = parcel.readInt();
            this.f53885b = parcel.readInt();
            this.f53886c = parcel.readInt();
            this.f53887d = parcel.readInt();
            this.f53888e = parcel.readInt();
            this.f53889f = parcel.readString();
            this.f53890g = parcel.readInt();
            this.f53892i = parcel.readInt();
            this.f53893j = parcel.readInt();
            this.f53894k = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f53884a);
            parcel.writeInt(this.f53885b);
            parcel.writeInt(this.f53886c);
            parcel.writeInt(this.f53887d);
            parcel.writeInt(this.f53888e);
            parcel.writeString(this.f53889f.toString());
            parcel.writeInt(this.f53890g);
            parcel.writeInt(this.f53892i);
            parcel.writeInt(this.f53893j);
            parcel.writeInt(this.f53894k);
        }
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f53869d.draw(canvas);
            if (mo76490b()) {
                m79802a(canvas);
            }
        }
    }

    /* renamed from: e */
    public void mo76497e(int i) {
        ViewGroup viewGroup;
        if (this.f53875j.f53892i != i) {
            this.f53875j.f53892i = i;
            WeakReference<View> weakReference = this.f53882q;
            if (weakReference != null && weakReference.get() != null) {
                View view = this.f53882q.get();
                WeakReference<ViewGroup> weakReference2 = this.f53883r;
                if (weakReference2 != null) {
                    viewGroup = weakReference2.get();
                } else {
                    viewGroup = null;
                }
                mo76488a(view, viewGroup);
            }
        }
    }

    private BadgeDrawable(Context context) {
        this.f53868c = new WeakReference<>(context);
        C22358l.m81005b(context);
        Resources resources = context.getResources();
        this.f53872g = (float) resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius);
        this.f53874i = (float) resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding);
        this.f53873h = (float) resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius);
        C22353j jVar = new C22353j(this);
        this.f53870e = jVar;
        jVar.mo77856a().setTextAlign(Paint.Align.CENTER);
        this.f53875j = new SavedState(context);
        m79808h(2131886896);
    }

    /* renamed from: a */
    private void m79802a(Canvas canvas) {
        Rect rect = new Rect();
        String h = m79807h();
        this.f53870e.mo77856a().getTextBounds(h, 0, h.length(), rect);
        canvas.drawText(h, this.f53876k, this.f53877l + ((float) (rect.height() / 2)), this.f53870e.mo77856a());
    }

    /* renamed from: a */
    private void m79803a(SavedState savedState) {
        mo76494d(savedState.f53888e);
        if (savedState.f53887d != -1) {
            mo76492c(savedState.f53887d);
        }
        mo76487a(savedState.f53884a);
        mo76489b(savedState.f53885b);
        mo76497e(savedState.f53892i);
        mo76499f(savedState.f53893j);
        mo76500g(savedState.f53894k);
    }

    /* renamed from: a */
    private void m79804a(C22314d dVar) {
        Context context;
        if (this.f53870e.mo77861b() != dVar && (context = this.f53868c.get()) != null) {
            this.f53870e.mo77858a(dVar, context);
            m79806g();
        }
    }

    /* renamed from: a */
    static BadgeDrawable m79800a(Context context, SavedState savedState) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.m79803a(savedState);
        return badgeDrawable;
    }

    /* renamed from: a */
    private static int m79797a(Context context, TypedArray typedArray, int i) {
        return C22313c.m80795a(context, typedArray, i).getDefaultColor();
    }

    /* renamed from: a */
    private void m79801a(Context context, Rect rect, View view) {
        int i;
        float f;
        float f2;
        float f3;
        int i2 = this.f53875j.f53892i;
        if (i2 == 8388691 || i2 == 8388693) {
            this.f53877l = (float) (rect.bottom - this.f53875j.f53894k);
        } else {
            this.f53877l = (float) (rect.top + this.f53875j.f53894k);
        }
        if (mo76491c() <= 9) {
            if (!mo76490b()) {
                f3 = this.f53872g;
            } else {
                f3 = this.f53873h;
            }
            this.f53879n = f3;
            this.f53881p = f3;
            this.f53880o = f3;
        } else {
            float f4 = this.f53873h;
            this.f53879n = f4;
            this.f53881p = f4;
            this.f53880o = (this.f53870e.mo77855a(m79807h()) / 2.0f) + this.f53874i;
        }
        Resources resources = context.getResources();
        if (mo76490b()) {
            i = R.dimen.mtrl_badge_text_horizontal_edge_offset;
        } else {
            i = R.dimen.mtrl_badge_horizontal_edge_offset;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        int i3 = this.f53875j.f53892i;
        if (i3 == 8388659 || i3 == 8388691) {
            if (ViewCompat.m4082h(view) == 0) {
                f = (((float) rect.left) - this.f53880o) + ((float) dimensionPixelSize) + ((float) this.f53875j.f53893j);
            } else {
                f = ((((float) rect.right) + this.f53880o) - ((float) dimensionPixelSize)) - ((float) this.f53875j.f53893j);
            }
            this.f53876k = f;
            return;
        }
        if (ViewCompat.m4082h(view) == 0) {
            f2 = ((((float) rect.right) + this.f53880o) - ((float) dimensionPixelSize)) - ((float) this.f53875j.f53893j);
        } else {
            f2 = (((float) rect.left) - this.f53880o) + ((float) dimensionPixelSize) + ((float) this.f53875j.f53893j);
        }
        this.f53876k = f2;
    }

    /* renamed from: a */
    private static BadgeDrawable m79799a(Context context, AttributeSet attributeSet, int i, int i2) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.m79805b(context, attributeSet, i, i2);
        return badgeDrawable;
    }

    /* renamed from: b */
    private void m79805b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray a = C22358l.m80999a(context, attributeSet, new int[]{R.attr.backgroundColor, R.attr.badgeGravity, R.attr.badgeTextColor, R.attr.horizontalOffset, R.attr.maxCharacterCount, R.attr.number, R.attr.verticalOffset}, i, i2, new int[0]);
        mo76494d(a.getInt(4, 4));
        if (a.hasValue(5)) {
            mo76492c(a.getInt(5, 0));
        }
        mo76487a(m79797a(context, a, 0));
        if (a.hasValue(2)) {
            mo76489b(m79797a(context, a, 2));
        }
        mo76497e(a.getInt(1, 8388661));
        mo76499f(a.getDimensionPixelOffset(3, 0));
        mo76500g(a.getDimensionPixelOffset(6, 0));
        a.recycle();
    }
}
