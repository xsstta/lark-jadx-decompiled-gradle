package androidx.p042i.p043a.p044a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.collection.ArrayMap;
import androidx.core.content.res.C0767f;
import androidx.core.graphics.drawable.C0774a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.i.a.a.c */
public class C1096c extends AbstractC1105h implements AbstractC1094b {

    /* renamed from: a */
    final Drawable.Callback f4090a;

    /* renamed from: c */
    private C1098a f4091c;

    /* renamed from: d */
    private Context f4092d;

    /* renamed from: e */
    private ArgbEvaluator f4093e;

    /* access modifiers changed from: private */
    /* renamed from: androidx.i.a.a.c$a */
    public static class C1098a extends Drawable.ConstantState {

        /* renamed from: a */
        int f4095a;

        /* renamed from: b */
        C1106i f4096b;

        /* renamed from: c */
        AnimatorSet f4097c;

        /* renamed from: d */
        ArrayList<Animator> f4098d;

        /* renamed from: e */
        ArrayMap<Animator, String> f4099e;

        public int getChangingConfigurations() {
            return this.f4095a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        /* renamed from: a */
        public void mo5787a() {
            if (this.f4097c == null) {
                this.f4097c = new AnimatorSet();
            }
            this.f4097c.playTogether(this.f4098d);
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public C1098a(Context context, C1098a aVar, Drawable.Callback callback, Resources resources) {
            if (aVar != null) {
                this.f4095a = aVar.f4095a;
                C1106i iVar = aVar.f4096b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    if (resources != null) {
                        this.f4096b = (C1106i) constantState.newDrawable(resources);
                    } else {
                        this.f4096b = (C1106i) constantState.newDrawable();
                    }
                    C1106i iVar2 = (C1106i) this.f4096b.mutate();
                    this.f4096b = iVar2;
                    iVar2.setCallback(callback);
                    this.f4096b.setBounds(aVar.f4096b.getBounds());
                    this.f4096b.mo5802a(false);
                }
                ArrayList<Animator> arrayList = aVar.f4098d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f4098d = new ArrayList<>(size);
                    this.f4099e = new ArrayMap<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = aVar.f4098d.get(i);
                        Animator clone = animator.clone();
                        String str = aVar.f4099e.get(animator);
                        clone.setTarget(this.f4096b.mo5801a(str));
                        this.f4098d.add(clone);
                        this.f4099e.put(clone, str);
                    }
                    mo5787a();
                }
            }
        }
    }

    @Override // androidx.p042i.p043a.p044a.AbstractC1105h
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // androidx.p042i.p043a.p044a.AbstractC1105h
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    /* renamed from: androidx.i.a.a.c$b */
    private static class C1099b extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f4100a;

        public boolean canApplyTheme() {
            return this.f4100a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f4100a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C1096c cVar = new C1096c();
            cVar.f4105b = this.f4100a.newDrawable();
            cVar.f4105b.setCallback(cVar.f4090a);
            return cVar;
        }

        public C1099b(Drawable.ConstantState constantState) {
            this.f4100a = constantState;
        }

        public Drawable newDrawable(Resources resources) {
            C1096c cVar = new C1096c();
            cVar.f4105b = this.f4100a.newDrawable(resources);
            cVar.f4105b.setCallback(cVar.f4090a);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1096c cVar = new C1096c();
            cVar.f4105b = this.f4100a.newDrawable(resources, theme);
            cVar.f4105b.setCallback(cVar.f4090a);
            return cVar;
        }
    }

    C1096c() {
        this(null, null, null);
    }

    @Override // androidx.p042i.p043a.p044a.AbstractC1105h
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // androidx.p042i.p043a.p044a.AbstractC1105h
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.p042i.p043a.p044a.AbstractC1105h
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // androidx.p042i.p043a.p044a.AbstractC1105h
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.p042i.p043a.p044a.AbstractC1105h
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public boolean canApplyTheme() {
        if (this.f4105b != null) {
            return C0774a.m3776d(this.f4105b);
        }
        return false;
    }

    public Drawable mutate() {
        if (this.f4105b != null) {
            this.f4105b.mutate();
        }
        return this;
    }

    public int getAlpha() {
        if (this.f4105b != null) {
            return C0774a.m3775c(this.f4105b);
        }
        return this.f4091c.f4096b.getAlpha();
    }

    public int getChangingConfigurations() {
        if (this.f4105b != null) {
            return this.f4105b.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f4091c.f4095a;
    }

    public ColorFilter getColorFilter() {
        if (this.f4105b != null) {
            return C0774a.m3777e(this.f4105b);
        }
        return this.f4091c.f4096b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f4105b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C1099b(this.f4105b.getConstantState());
    }

    public int getIntrinsicHeight() {
        if (this.f4105b != null) {
            return this.f4105b.getIntrinsicHeight();
        }
        return this.f4091c.f4096b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        if (this.f4105b != null) {
            return this.f4105b.getIntrinsicWidth();
        }
        return this.f4091c.f4096b.getIntrinsicWidth();
    }

    public int getOpacity() {
        if (this.f4105b != null) {
            return this.f4105b.getOpacity();
        }
        return this.f4091c.f4096b.getOpacity();
    }

    public boolean isAutoMirrored() {
        if (this.f4105b != null) {
            return C0774a.m3773b(this.f4105b);
        }
        return this.f4091c.f4096b.isAutoMirrored();
    }

    public boolean isRunning() {
        if (this.f4105b != null) {
            return ((AnimatedVectorDrawable) this.f4105b).isRunning();
        }
        return this.f4091c.f4097c.isRunning();
    }

    public boolean isStateful() {
        if (this.f4105b != null) {
            return this.f4105b.isStateful();
        }
        return this.f4091c.f4096b.isStateful();
    }

    public void stop() {
        if (this.f4105b != null) {
            ((AnimatedVectorDrawable) this.f4105b).stop();
        } else {
            this.f4091c.f4097c.end();
        }
    }

    public void start() {
        if (this.f4105b != null) {
            ((AnimatedVectorDrawable) this.f4105b).start();
        } else if (!this.f4091c.f4097c.isStarted()) {
            this.f4091c.f4097c.start();
            invalidateSelf();
        }
    }

    @Override // androidx.p042i.p043a.p044a.AbstractC1105h
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // androidx.p042i.p043a.p044a.AbstractC1105h
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // androidx.p042i.p043a.p044a.AbstractC1105h
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.p042i.p043a.p044a.AbstractC1105h
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    private C1096c(Context context) {
        this(context, null, null);
    }

    @Override // androidx.p042i.p043a.p044a.AbstractC1105h
    public void applyTheme(Resources.Theme theme) {
        if (this.f4105b != null) {
            C0774a.m3769a(this.f4105b, theme);
        }
    }

    public void draw(Canvas canvas) {
        if (this.f4105b != null) {
            this.f4105b.draw(canvas);
            return;
        }
        this.f4091c.f4096b.draw(canvas);
        if (this.f4091c.f4097c.isStarted()) {
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.p042i.p043a.p044a.AbstractC1105h
    public void onBoundsChange(Rect rect) {
        if (this.f4105b != null) {
            this.f4105b.setBounds(rect);
        } else {
            this.f4091c.f4096b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.p042i.p043a.p044a.AbstractC1105h
    public boolean onLevelChange(int i) {
        if (this.f4105b != null) {
            return this.f4105b.setLevel(i);
        }
        return this.f4091c.f4096b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.f4105b != null) {
            return this.f4105b.setState(iArr);
        }
        return this.f4091c.f4096b.setState(iArr);
    }

    public void setAlpha(int i) {
        if (this.f4105b != null) {
            this.f4105b.setAlpha(i);
        } else {
            this.f4091c.f4096b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        if (this.f4105b != null) {
            C0774a.m3772a(this.f4105b, z);
        } else {
            this.f4091c.f4096b.setAutoMirrored(z);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f4105b != null) {
            this.f4105b.setColorFilter(colorFilter);
        } else {
            this.f4091c.f4096b.setColorFilter(colorFilter);
        }
    }

    @Override // androidx.core.graphics.drawable.AbstractC0780f
    public void setTint(int i) {
        if (this.f4105b != null) {
            C0774a.m3766a(this.f4105b, i);
        } else {
            this.f4091c.f4096b.setTint(i);
        }
    }

    @Override // androidx.core.graphics.drawable.AbstractC0780f
    public void setTintList(ColorStateList colorStateList) {
        if (this.f4105b != null) {
            C0774a.m3768a(this.f4105b, colorStateList);
        } else {
            this.f4091c.f4096b.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.AbstractC0780f
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f4105b != null) {
            C0774a.m3771a(this.f4105b, mode);
        } else {
            this.f4091c.f4096b.setTintMode(mode);
        }
    }

    /* renamed from: a */
    private void m5206a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m5206a(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f4093e == null) {
                    this.f4093e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f4093e);
            }
        }
    }

    @Override // androidx.p042i.p043a.p044a.AbstractC1105h
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // androidx.p042i.p043a.p044a.AbstractC1105h
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.f4105b != null) {
            return this.f4105b.setVisible(z, z2);
        }
        this.f4091c.f4096b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    /* renamed from: a */
    private void m5207a(String str, Animator animator) {
        animator.setTarget(this.f4091c.f4096b.mo5801a(str));
        if (Build.VERSION.SDK_INT < 21) {
            m5206a(animator);
        }
        if (this.f4091c.f4098d == null) {
            this.f4091c.f4098d = new ArrayList<>();
            this.f4091c.f4099e = new ArrayMap<>();
        }
        this.f4091c.f4098d.add(animator);
        this.f4091c.f4099e.put(animator, str);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    private C1096c(Context context, C1098a aVar, Resources resources) {
        C10971 r0 = new Drawable.Callback() {
            /* class androidx.p042i.p043a.p044a.C1096c.C10971 */

            public void invalidateDrawable(Drawable drawable) {
                C1096c.this.invalidateSelf();
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                C1096c.this.unscheduleSelf(runnable);
            }

            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                C1096c.this.scheduleSelf(runnable, j);
            }
        };
        this.f4090a = r0;
        this.f4092d = context;
        if (aVar != null) {
            this.f4091c = aVar;
        } else {
            this.f4091c = new C1098a(context, aVar, r0, resources);
        }
    }

    @Override // androidx.p042i.p043a.p044a.AbstractC1105h
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        if (this.f4105b != null) {
            C0774a.m3770a(this.f4105b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray a = C0767f.m3696a(resources, theme, attributeSet, C1093a.f4082e);
                    int resourceId = a.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C1106i a2 = C1106i.m5238a(resources, resourceId, theme);
                        a2.mo5802a(false);
                        a2.setCallback(this.f4090a);
                        if (this.f4091c.f4096b != null) {
                            this.f4091c.f4096b.setCallback(null);
                        }
                        this.f4091c.f4096b = a2;
                    }
                    a.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C1093a.f4083f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f4092d;
                        if (context != null) {
                            m5207a(string, C1101e.m5213a(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f4091c.mo5787a();
    }

    /* renamed from: a */
    public static C1096c m5205a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C1096c cVar = new C1096c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }
}
