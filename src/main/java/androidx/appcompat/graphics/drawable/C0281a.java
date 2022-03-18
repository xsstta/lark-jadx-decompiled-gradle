package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.graphics.drawable.C0289b;
import androidx.appcompat.graphics.drawable.C0294d;
import androidx.appcompat.widget.C0472v;
import androidx.collection.C0516c;
import androidx.collection.C0525g;
import androidx.core.content.res.C0767f;
import androidx.core.graphics.drawable.AbstractC0780f;
import androidx.p042i.p043a.p044a.C1096c;
import androidx.p042i.p043a.p044a.C1106i;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.appcompat.graphics.drawable.a */
public class C0281a extends C0294d implements AbstractC0780f {

    /* renamed from: a */
    private static final String f803a = "a";

    /* renamed from: b */
    private C0284b f804b;

    /* renamed from: c */
    private AbstractC0288f f805c;

    /* renamed from: d */
    private int f806d;

    /* renamed from: e */
    private int f807e;

    /* renamed from: f */
    private boolean f808f;

    @Override // androidx.appcompat.graphics.drawable.C0294d, androidx.appcompat.graphics.drawable.C0289b
    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.graphics.drawable.a$d */
    public static class C0286d extends AbstractC0288f {

        /* renamed from: a */
        private final ObjectAnimator f813a;

        /* renamed from: b */
        private final boolean f814b;

        @Override // androidx.appcompat.graphics.drawable.C0281a.AbstractC0288f
        /* renamed from: c */
        public boolean mo1062c() {
            return this.f814b;
        }

        @Override // androidx.appcompat.graphics.drawable.C0281a.AbstractC0288f
        /* renamed from: a */
        public void mo1050a() {
            this.f813a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.C0281a.AbstractC0288f
        /* renamed from: b */
        public void mo1051b() {
            this.f813a.cancel();
        }

        @Override // androidx.appcompat.graphics.drawable.C0281a.AbstractC0288f
        /* renamed from: d */
        public void mo1063d() {
            this.f813a.reverse();
        }

        C0286d(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int i;
            int i2;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z) {
                i = numberOfFrames - 1;
            } else {
                i = 0;
            }
            if (z) {
                i2 = 0;
            } else {
                i2 = numberOfFrames - 1;
            }
            C0287e eVar = new C0287e(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) eVar.mo1064a());
            ofInt.setInterpolator(eVar);
            this.f814b = z2;
            this.f813a = ofInt;
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.a$e */
    private static class C0287e implements TimeInterpolator {

        /* renamed from: a */
        private int[] f815a;

        /* renamed from: b */
        private int f816b;

        /* renamed from: c */
        private int f817c;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo1064a() {
            return this.f817c;
        }

        public float getInterpolation(float f) {
            float f2;
            int i = (int) ((f * ((float) this.f817c)) + 0.5f);
            int i2 = this.f816b;
            int[] iArr = this.f815a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            if (i3 < i2) {
                f2 = ((float) i) / ((float) this.f817c);
            } else {
                f2 = BitmapDescriptorFactory.HUE_RED;
            }
            return (((float) i3) / ((float) i2)) + f2;
        }

        C0287e(AnimationDrawable animationDrawable, boolean z) {
            mo1065a(animationDrawable, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo1065a(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f816b = numberOfFrames;
            int[] iArr = this.f815a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f815a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f815a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f817c = i;
            return i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.graphics.drawable.a$f */
    public static abstract class AbstractC0288f {
        /* renamed from: a */
        public abstract void mo1050a();

        /* renamed from: b */
        public abstract void mo1051b();

        /* renamed from: c */
        public boolean mo1062c() {
            return false;
        }

        /* renamed from: d */
        public void mo1063d() {
        }

        private AbstractC0288f() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.graphics.drawable.a$a */
    public static class C0283a extends AbstractC0288f {

        /* renamed from: a */
        private final Animatable f809a;

        @Override // androidx.appcompat.graphics.drawable.C0281a.AbstractC0288f
        /* renamed from: a */
        public void mo1050a() {
            this.f809a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.C0281a.AbstractC0288f
        /* renamed from: b */
        public void mo1051b() {
            this.f809a.stop();
        }

        C0283a(Animatable animatable) {
            super();
            this.f809a = animatable;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.graphics.drawable.a$b */
    public static class C0284b extends C0294d.C0295a {

        /* renamed from: a */
        C0516c<Long> f810a;

        /* renamed from: b */
        C0525g<Integer> f811b;

        /* renamed from: f */
        private static long m1079f(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        @Override // androidx.appcompat.graphics.drawable.C0294d.C0295a
        public Drawable newDrawable() {
            return new C0281a(this, null);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.appcompat.graphics.drawable.C0289b.AbstractC0292b, androidx.appcompat.graphics.drawable.C0294d.C0295a
        /* renamed from: a */
        public void mo1057a() {
            this.f810a = this.f810a.clone();
            this.f811b = this.f811b.clone();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo1055a(int[] iArr) {
            int b = super.mo1141b(iArr);
            if (b >= 0) {
                return b;
            }
            return super.mo1141b(StateSet.WILD_CARD);
        }

        @Override // androidx.appcompat.graphics.drawable.C0294d.C0295a
        public Drawable newDrawable(Resources resources) {
            return new C0281a(this, resources);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo1052a(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f811b.mo3048a(i, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo1053a(int i, int i2) {
            return (int) this.f810a.mo2960a(m1079f(i, i2), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo1058b(int i, int i2) {
            if ((this.f810a.mo2960a(m1079f(i, i2), -1L).longValue() & 4294967296L) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo1059c(int i, int i2) {
            if ((this.f810a.mo2960a(m1079f(i, i2), -1L).longValue() & 8589934592L) != 0) {
                return true;
            }
            return false;
        }

        C0284b(C0284b bVar, C0281a aVar, Resources resources) {
            super(bVar, aVar, resources);
            if (bVar != null) {
                this.f810a = bVar.f810a;
                this.f811b = bVar.f811b;
                return;
            }
            this.f810a = new C0516c<>();
            this.f811b = new C0525g<>();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo1056a(int[] iArr, Drawable drawable, int i) {
            int a = super.mo1140a(iArr, drawable);
            this.f811b.mo3051b(a, Integer.valueOf(i));
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo1054a(int i, int i2, Drawable drawable, boolean z) {
            long j;
            int a = super.mo1080a(drawable);
            long f = m1079f(i, i2);
            if (z) {
                j = 8589934592L;
            } else {
                j = 0;
            }
            long j2 = (long) a;
            this.f810a.mo2968c(f, Long.valueOf(j2 | j));
            if (z) {
                this.f810a.mo2968c(m1079f(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.graphics.drawable.a$c */
    public static class C0285c extends AbstractC0288f {

        /* renamed from: a */
        private final C1096c f812a;

        @Override // androidx.appcompat.graphics.drawable.C0281a.AbstractC0288f
        /* renamed from: a */
        public void mo1050a() {
            this.f812a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.C0281a.AbstractC0288f
        /* renamed from: b */
        public void mo1051b() {
            this.f812a.stop();
        }

        C0285c(C1096c cVar) {
            super();
            this.f812a = cVar;
        }
    }

    public C0281a() {
        this(null, null);
    }

    /* renamed from: e */
    private void m1071e() {
        onStateChange(getState());
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0284b mo1018c() {
        return new C0284b(this.f804b, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC0288f fVar = this.f805c;
        if (fVar != null) {
            fVar.mo1051b();
            this.f805c = null;
            mo1069a(this.f806d);
            this.f806d = -1;
            this.f807e = -1;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.C0294d, androidx.appcompat.graphics.drawable.C0289b
    public Drawable mutate() {
        if (!this.f808f && super.mutate() == this) {
            this.f804b.mo1057a();
            this.f808f = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.C0294d, androidx.appcompat.graphics.drawable.C0289b
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b, androidx.core.graphics.drawable.AbstractC0780f
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b, androidx.core.graphics.drawable.AbstractC0780f
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.C0294d, androidx.appcompat.graphics.drawable.C0289b
    /* renamed from: a */
    public void mo1014a(C0289b.AbstractC0292b bVar) {
        super.mo1014a(bVar);
        if (bVar instanceof C0284b) {
            this.f804b = (C0284b) bVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.graphics.drawable.C0294d, androidx.appcompat.graphics.drawable.C0289b
    public boolean onStateChange(int[] iArr) {
        boolean z;
        int a = this.f804b.mo1055a(iArr);
        if (a == mo1070d() || (!m1067b(a) && !mo1069a(a))) {
            z = false;
        } else {
            z = true;
        }
        Drawable current = getCurrent();
        if (current != null) {
            return z | current.setState(iArr);
        }
        return z;
    }

    /* renamed from: a */
    private void m1066a(TypedArray typedArray) {
        C0284b bVar = this.f804b;
        if (Build.VERSION.SDK_INT >= 21) {
            bVar.f846f |= typedArray.getChangingConfigurations();
        }
        bVar.mo1083a(typedArray.getBoolean(2, bVar.f851k));
        bVar.mo1086b(typedArray.getBoolean(3, bVar.f854n));
        bVar.mo1088c(typedArray.getInt(4, bVar.f834C));
        bVar.mo1091d(typedArray.getInt(5, bVar.f835D));
        setDither(typedArray.getBoolean(0, bVar.f866z));
    }

    /* renamed from: b */
    private boolean m1067b(int i) {
        int i2;
        int a;
        AbstractC0288f fVar;
        AbstractC0288f fVar2 = this.f805c;
        if (fVar2 == null) {
            i2 = mo1070d();
        } else if (i == this.f806d) {
            return true;
        } else {
            if (i != this.f807e || !fVar2.mo1062c()) {
                i2 = this.f806d;
                fVar2.mo1051b();
            } else {
                fVar2.mo1063d();
                this.f806d = this.f807e;
                this.f807e = i;
                return true;
            }
        }
        this.f805c = null;
        this.f807e = -1;
        this.f806d = -1;
        C0284b bVar = this.f804b;
        int a2 = bVar.mo1052a(i2);
        int a3 = bVar.mo1052a(i);
        if (a3 == 0 || a2 == 0 || (a = bVar.mo1053a(a2, a3)) < 0) {
            return false;
        }
        boolean c = bVar.mo1059c(a2, a3);
        mo1069a(a);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            fVar = new C0286d((AnimationDrawable) current, bVar.mo1058b(a2, a3), c);
        } else if (current instanceof C1096c) {
            fVar = new C0285c((C1096c) current);
        } else {
            if (current instanceof Animatable) {
                fVar = new C0283a((Animatable) current);
            }
            return false;
        }
        fVar.mo1050a();
        this.f805c = fVar;
        this.f807e = i2;
        this.f806d = i;
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    C0281a(C0284b bVar, Resources resources) {
        super(null);
        this.f806d = -1;
        this.f807e = -1;
        mo1014a(new C0284b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AbstractC0288f fVar = this.f805c;
        if (fVar != null && (visible || z2)) {
            if (z) {
                fVar.mo1050a();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static C0281a m1065a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C0281a aVar = new C0281a();
            aVar.mo1017b(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: c */
    private void m1068c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        m1070e(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m1069d(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // androidx.appcompat.graphics.drawable.C0294d
    /* renamed from: b */
    public void mo1017b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray a = C0767f.m3696a(resources, theme, attributeSet, new int[]{16843036, 16843156, 16843157, 16843158, 16843532, 16843533});
        setVisible(a.getBoolean(1, true), true);
        m1066a(a);
        mo1067a(resources);
        a.recycle();
        m1068c(context, resources, xmlPullParser, attributeSet, theme);
        m1071e();
    }

    /* renamed from: d */
    private int m1069d(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable;
        int next;
        TypedArray a = C0767f.m3696a(resources, theme, attributeSet, new int[]{16843161, 16843849, 16843850, 16843851});
        int resourceId = a.getResourceId(2, -1);
        int resourceId2 = a.getResourceId(1, -1);
        int resourceId3 = a.getResourceId(0, -1);
        if (resourceId3 > 0) {
            drawable = C0472v.m2105a().mo2683a(context, resourceId3);
        } else {
            drawable = null;
        }
        boolean z = a.getBoolean(3, false);
        a.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                drawable = C1096c.m5205a(context, resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (drawable == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f804b.mo1054a(resourceId, resourceId2, drawable, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    /* renamed from: e */
    private int m1070e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable;
        int next;
        TypedArray a = C0767f.m3696a(resources, theme, attributeSet, new int[]{16842960, 16843161});
        int resourceId = a.getResourceId(0, 0);
        int resourceId2 = a.getResourceId(1, -1);
        if (resourceId2 > 0) {
            drawable = C0472v.m2105a().mo2683a(context, resourceId2);
        } else {
            drawable = null;
        }
        a.recycle();
        int[] a2 = mo1139a(attributeSet);
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("vector")) {
                drawable = C1106i.m5239a(resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (drawable != null) {
            return this.f804b.mo1056a(a2, drawable, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }
}
