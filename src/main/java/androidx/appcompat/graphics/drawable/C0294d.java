package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.graphics.drawable.C0289b;
import androidx.appcompat.widget.C0472v;
import androidx.core.content.res.C0767f;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.appcompat.graphics.drawable.d */
class C0294d extends C0289b {

    /* renamed from: a */
    private C0295a f868a;

    /* renamed from: b */
    private boolean f869b;

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.graphics.drawable.d$a */
    public static class C0295a extends C0289b.AbstractC0292b {

        /* renamed from: L */
        int[][] f870L;

        public Drawable newDrawable() {
            return new C0294d(this, null);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.appcompat.graphics.drawable.C0289b.AbstractC0292b
        /* renamed from: a */
        public void mo1057a() {
            int[] iArr;
            int[][] iArr2 = this.f870L;
            int[][] iArr3 = new int[iArr2.length][];
            for (int length = iArr2.length - 1; length >= 0; length--) {
                int[][] iArr4 = this.f870L;
                if (iArr4[length] != null) {
                    iArr = (int[]) iArr4[length].clone();
                } else {
                    iArr = null;
                }
                iArr3[length] = iArr;
            }
            this.f870L = iArr3;
        }

        public Drawable newDrawable(Resources resources) {
            return new C0294d(this, resources);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo1141b(int[] iArr) {
            int[][] iArr2 = this.f870L;
            int d = mo1090d();
            for (int i = 0; i < d; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo1140a(int[] iArr, Drawable drawable) {
            int a = mo1080a(drawable);
            this.f870L[a] = iArr;
            return a;
        }

        @Override // androidx.appcompat.graphics.drawable.C0289b.AbstractC0292b
        /* renamed from: e */
        public void mo1094e(int i, int i2) {
            super.mo1094e(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f870L, 0, iArr, 0, i);
            this.f870L = iArr;
        }

        C0295a(C0295a aVar, C0294d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.f870L = aVar.f870L;
            } else {
                this.f870L = new int[mo1087c()][];
            }
        }
    }

    C0294d() {
        this(null, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0295a mo1018c() {
        return new C0295a(this.f868a, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public Drawable mutate() {
        if (!this.f869b && super.mutate() == this) {
            this.f868a.mo1057a();
            this.f869b = true;
        }
        return this;
    }

    C0294d(C0295a aVar) {
        if (aVar != null) {
            mo1014a(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.C0289b
    /* renamed from: a */
    public void mo1014a(C0289b.AbstractC0292b bVar) {
        super.mo1014a(bVar);
        if (bVar instanceof C0295a) {
            this.f868a = (C0295a) bVar;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.C0289b
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* renamed from: a */
    private void m1140a(TypedArray typedArray) {
        C0295a aVar = this.f868a;
        if (Build.VERSION.SDK_INT >= 21) {
            aVar.f846f |= typedArray.getChangingConfigurations();
        }
        aVar.f851k = typedArray.getBoolean(2, aVar.f851k);
        aVar.f854n = typedArray.getBoolean(3, aVar.f854n);
        aVar.f834C = typedArray.getInt(4, aVar.f834C);
        aVar.f835D = typedArray.getInt(5, aVar.f835D);
        aVar.f866z = typedArray.getBoolean(0, aVar.f866z);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.graphics.drawable.C0289b
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int b = this.f868a.mo1141b(iArr);
        if (b < 0) {
            b = this.f868a.mo1141b(StateSet.WILD_CARD);
        }
        if (mo1069a(b) || onStateChange) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] mo1139a(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    C0294d(C0295a aVar, Resources resources) {
        mo1014a(new C0295a(aVar, this, resources));
        onStateChange(getState());
    }

    /* renamed from: b */
    public void mo1017b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray a = C0767f.m3696a(resources, theme, attributeSet, new int[]{16843036, 16843156, 16843157, 16843158, 16843532, 16843533});
        setVisible(a.getBoolean(1, true), true);
        m1140a(a);
        mo1067a(resources);
        a.recycle();
        m1139a(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    /* renamed from: a */
    private void m1139a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        C0295a aVar = this.f868a;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next2 == 3) {
                    return;
                }
                if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                    TypedArray a = C0767f.m3696a(resources, theme, attributeSet, new int[]{16843161});
                    Drawable drawable = null;
                    int resourceId = a.getResourceId(0, -1);
                    if (resourceId > 0) {
                        drawable = C0472v.m2105a().mo2683a(context, resourceId);
                    }
                    a.recycle();
                    int[] a2 = mo1139a(attributeSet);
                    if (drawable == null) {
                        do {
                            next = xmlPullParser.next();
                        } while (next == 4);
                        if (next != 2) {
                            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        } else if (Build.VERSION.SDK_INT >= 21) {
                            drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                        } else {
                            drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                        }
                    }
                    aVar.mo1140a(a2, drawable);
                }
            } else {
                return;
            }
        }
    }
}
