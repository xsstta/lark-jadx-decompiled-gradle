package androidx.p042i.p043a.p044a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.collection.ArrayMap;
import androidx.core.content.res.C0756b;
import androidx.core.content.res.C0767f;
import androidx.core.graphics.C0770c;
import androidx.core.graphics.drawable.C0774a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.i.a.a.i */
public class C1106i extends AbstractC1105h {

    /* renamed from: a */
    static final PorterDuff.Mode f4106a = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private C1114g f4107c;

    /* renamed from: d */
    private PorterDuffColorFilter f4108d;

    /* renamed from: e */
    private ColorFilter f4109e;

    /* renamed from: f */
    private boolean f4110f;

    /* renamed from: g */
    private boolean f4111g;

    /* renamed from: h */
    private Drawable.ConstantState f4112h;

    /* renamed from: i */
    private final float[] f4113i;

    /* renamed from: j */
    private final Matrix f4114j;

    /* renamed from: k */
    private final Rect f4115k;

    /* access modifiers changed from: private */
    /* renamed from: androidx.i.a.a.i$a */
    public static class C1108a extends AbstractC1112e {
        @Override // androidx.p042i.p043a.p044a.C1106i.AbstractC1112e
        /* renamed from: a */
        public boolean mo5826a() {
            return true;
        }

        C1108a() {
        }

        C1108a(C1108a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        private void m5246a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f4142m = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f4141l = C0770c.m3729b(string2);
            }
            this.f4143n = C0767f.m3693a(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        /* renamed from: a */
        public void mo5825a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C0767f.m3700a(xmlPullParser, "pathData")) {
                TypedArray a = C0767f.m3696a(resources, theme, attributeSet, C1093a.f4081d);
                m5246a(a, xmlPullParser);
                a.recycle();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.i.a.a.i$b */
    public static class C1109b extends AbstractC1112e {

        /* renamed from: a */
        C0756b f4116a;

        /* renamed from: b */
        float f4117b;

        /* renamed from: c */
        C0756b f4118c;

        /* renamed from: d */
        float f4119d = 1.0f;

        /* renamed from: e */
        float f4120e = 1.0f;

        /* renamed from: f */
        float f4121f;

        /* renamed from: g */
        float f4122g = 1.0f;

        /* renamed from: h */
        float f4123h;

        /* renamed from: i */
        Paint.Cap f4124i = Paint.Cap.BUTT;

        /* renamed from: j */
        Paint.Join f4125j = Paint.Join.MITER;

        /* renamed from: k */
        float f4126k = 4.0f;

        /* renamed from: p */
        private int[] f4127p;

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f4120e;
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f4119d;
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f4117b;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f4122g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f4123h;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f4121f;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f4118c.mo4281b();
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f4116a.mo4281b();
        }

        C1109b() {
        }

        @Override // androidx.p042i.p043a.p044a.C1106i.AbstractC1111d
        /* renamed from: b */
        public boolean mo5829b() {
            if (this.f4118c.mo4284d() || this.f4116a.mo4284d()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f) {
            this.f4120e = f;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f) {
            this.f4119d = f;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f) {
            this.f4117b = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f) {
            this.f4122g = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f) {
            this.f4123h = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f) {
            this.f4121f = f;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i) {
            this.f4118c.mo4282b(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i) {
            this.f4116a.mo4282b(i);
        }

        C1109b(C1109b bVar) {
            super(bVar);
            this.f4127p = bVar.f4127p;
            this.f4116a = bVar.f4116a;
            this.f4117b = bVar.f4117b;
            this.f4119d = bVar.f4119d;
            this.f4118c = bVar.f4118c;
            this.f4143n = bVar.f4143n;
            this.f4120e = bVar.f4120e;
            this.f4121f = bVar.f4121f;
            this.f4122g = bVar.f4122g;
            this.f4123h = bVar.f4123h;
            this.f4124i = bVar.f4124i;
            this.f4125j = bVar.f4125j;
            this.f4126k = bVar.f4126k;
        }

        @Override // androidx.p042i.p043a.p044a.C1106i.AbstractC1111d
        /* renamed from: a */
        public boolean mo5828a(int[] iArr) {
            return this.f4116a.mo4280a(iArr) | this.f4118c.mo4280a(iArr);
        }

        /* renamed from: a */
        private Paint.Cap m5249a(int i, Paint.Cap cap) {
            if (i == 0) {
                return Paint.Cap.BUTT;
            }
            if (i == 1) {
                return Paint.Cap.ROUND;
            }
            if (i != 2) {
                return cap;
            }
            return Paint.Cap.SQUARE;
        }

        /* renamed from: a */
        private Paint.Join m5250a(int i, Paint.Join join) {
            if (i == 0) {
                return Paint.Join.MITER;
            }
            if (i == 1) {
                return Paint.Join.ROUND;
            }
            if (i != 2) {
                return join;
            }
            return Paint.Join.BEVEL;
        }

        /* renamed from: a */
        private void m5251a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f4127p = null;
            if (C0767f.m3700a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f4142m = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f4141l = C0770c.m3729b(string2);
                }
                this.f4118c = C0767f.m3697a(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f4120e = C0767f.m3692a(typedArray, xmlPullParser, "fillAlpha", 12, this.f4120e);
                this.f4124i = m5249a(C0767f.m3693a(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f4124i);
                this.f4125j = m5250a(C0767f.m3693a(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f4125j);
                this.f4126k = C0767f.m3692a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f4126k);
                this.f4116a = C0767f.m3697a(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f4119d = C0767f.m3692a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f4119d);
                this.f4117b = C0767f.m3692a(typedArray, xmlPullParser, "strokeWidth", 4, this.f4117b);
                this.f4122g = C0767f.m3692a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f4122g);
                this.f4123h = C0767f.m3692a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f4123h);
                this.f4121f = C0767f.m3692a(typedArray, xmlPullParser, "trimPathStart", 5, this.f4121f);
                this.f4143n = C0767f.m3693a(typedArray, xmlPullParser, "fillType", 13, this.f4143n);
            }
        }

        /* renamed from: a */
        public void mo5827a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0767f.m3696a(resources, theme, attributeSet, C1093a.f4080c);
            m5251a(a, xmlPullParser, theme);
            a.recycle();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.i.a.a.i$c */
    public static class C1110c extends AbstractC1111d {

        /* renamed from: a */
        final Matrix f4128a;

        /* renamed from: b */
        final ArrayList<AbstractC1111d> f4129b;

        /* renamed from: c */
        float f4130c;

        /* renamed from: d */
        final Matrix f4131d;

        /* renamed from: e */
        int f4132e;

        /* renamed from: f */
        private float f4133f;

        /* renamed from: g */
        private float f4134g;

        /* renamed from: h */
        private float f4135h;

        /* renamed from: i */
        private float f4136i;

        /* renamed from: j */
        private float f4137j;

        /* renamed from: k */
        private float f4138k;

        /* renamed from: l */
        private int[] f4139l;

        /* renamed from: m */
        private String f4140m;

        public String getGroupName() {
            return this.f4140m;
        }

        public Matrix getLocalMatrix() {
            return this.f4131d;
        }

        public float getPivotX() {
            return this.f4133f;
        }

        public float getPivotY() {
            return this.f4134g;
        }

        public float getRotation() {
            return this.f4130c;
        }

        public float getScaleX() {
            return this.f4135h;
        }

        public float getScaleY() {
            return this.f4136i;
        }

        public float getTranslateX() {
            return this.f4137j;
        }

        public float getTranslateY() {
            return this.f4138k;
        }

        @Override // androidx.p042i.p043a.p044a.C1106i.AbstractC1111d
        /* renamed from: b */
        public boolean mo5829b() {
            for (int i = 0; i < this.f4129b.size(); i++) {
                if (this.f4129b.get(i).mo5829b()) {
                    return true;
                }
            }
            return false;
        }

        public C1110c() {
            super();
            this.f4128a = new Matrix();
            this.f4129b = new ArrayList<>();
            this.f4130c = BitmapDescriptorFactory.HUE_RED;
            this.f4133f = BitmapDescriptorFactory.HUE_RED;
            this.f4134g = BitmapDescriptorFactory.HUE_RED;
            this.f4135h = 1.0f;
            this.f4136i = 1.0f;
            this.f4137j = BitmapDescriptorFactory.HUE_RED;
            this.f4138k = BitmapDescriptorFactory.HUE_RED;
            this.f4131d = new Matrix();
            this.f4140m = null;
        }

        /* renamed from: a */
        private void m5255a() {
            this.f4131d.reset();
            this.f4131d.postTranslate(-this.f4133f, -this.f4134g);
            this.f4131d.postScale(this.f4135h, this.f4136i);
            this.f4131d.postRotate(this.f4130c, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            this.f4131d.postTranslate(this.f4137j + this.f4133f, this.f4138k + this.f4134g);
        }

        public void setPivotX(float f) {
            if (f != this.f4133f) {
                this.f4133f = f;
                m5255a();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f4134g) {
                this.f4134g = f;
                m5255a();
            }
        }

        public void setRotation(float f) {
            if (f != this.f4130c) {
                this.f4130c = f;
                m5255a();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f4135h) {
                this.f4135h = f;
                m5255a();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f4136i) {
                this.f4136i = f;
                m5255a();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f4137j) {
                this.f4137j = f;
                m5255a();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f4138k) {
                this.f4138k = f;
                m5255a();
            }
        }

        @Override // androidx.p042i.p043a.p044a.C1106i.AbstractC1111d
        /* renamed from: a */
        public boolean mo5828a(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f4129b.size(); i++) {
                z |= this.f4129b.get(i).mo5828a(iArr);
            }
            return z;
        }

        /* renamed from: a */
        private void m5256a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f4139l = null;
            this.f4130c = C0767f.m3692a(typedArray, xmlPullParser, "rotation", 5, this.f4130c);
            this.f4133f = typedArray.getFloat(1, this.f4133f);
            this.f4134g = typedArray.getFloat(2, this.f4134g);
            this.f4135h = C0767f.m3692a(typedArray, xmlPullParser, "scaleX", 3, this.f4135h);
            this.f4136i = C0767f.m3692a(typedArray, xmlPullParser, "scaleY", 4, this.f4136i);
            this.f4137j = C0767f.m3692a(typedArray, xmlPullParser, "translateX", 6, this.f4137j);
            this.f4138k = C0767f.m3692a(typedArray, xmlPullParser, "translateY", 7, this.f4138k);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f4140m = string;
            }
            m5255a();
        }

        public C1110c(C1110c cVar, ArrayMap<String, Object> arrayMap) {
            super();
            AbstractC1112e eVar;
            this.f4128a = new Matrix();
            this.f4129b = new ArrayList<>();
            this.f4130c = BitmapDescriptorFactory.HUE_RED;
            this.f4133f = BitmapDescriptorFactory.HUE_RED;
            this.f4134g = BitmapDescriptorFactory.HUE_RED;
            this.f4135h = 1.0f;
            this.f4136i = 1.0f;
            this.f4137j = BitmapDescriptorFactory.HUE_RED;
            this.f4138k = BitmapDescriptorFactory.HUE_RED;
            Matrix matrix = new Matrix();
            this.f4131d = matrix;
            this.f4140m = null;
            this.f4130c = cVar.f4130c;
            this.f4133f = cVar.f4133f;
            this.f4134g = cVar.f4134g;
            this.f4135h = cVar.f4135h;
            this.f4136i = cVar.f4136i;
            this.f4137j = cVar.f4137j;
            this.f4138k = cVar.f4138k;
            this.f4139l = cVar.f4139l;
            String str = cVar.f4140m;
            this.f4140m = str;
            this.f4132e = cVar.f4132e;
            if (str != null) {
                arrayMap.put(str, this);
            }
            matrix.set(cVar.f4131d);
            ArrayList<AbstractC1111d> arrayList = cVar.f4129b;
            for (int i = 0; i < arrayList.size(); i++) {
                AbstractC1111d dVar = arrayList.get(i);
                if (dVar instanceof C1110c) {
                    this.f4129b.add(new C1110c((C1110c) dVar, arrayMap));
                } else {
                    if (dVar instanceof C1109b) {
                        eVar = new C1109b((C1109b) dVar);
                    } else if (dVar instanceof C1108a) {
                        eVar = new C1108a((C1108a) dVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f4129b.add(eVar);
                    if (eVar.f4142m != null) {
                        arrayMap.put(eVar.f4142m, eVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo5846a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0767f.m3696a(resources, theme, attributeSet, C1093a.f4079b);
            m5256a(a, xmlPullParser);
            a.recycle();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.i.a.a.i$d */
    public static abstract class AbstractC1111d {
        /* renamed from: a */
        public boolean mo5828a(int[] iArr) {
            return false;
        }

        /* renamed from: b */
        public boolean mo5829b() {
            return false;
        }

        private AbstractC1111d() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.i.a.a.i$e */
    public static abstract class AbstractC1112e extends AbstractC1111d {

        /* renamed from: l */
        protected C0770c.C0772b[] f4141l;

        /* renamed from: m */
        String f4142m;

        /* renamed from: n */
        int f4143n;

        /* renamed from: o */
        int f4144o;

        /* renamed from: a */
        public boolean mo5826a() {
            return false;
        }

        public C0770c.C0772b[] getPathData() {
            return this.f4141l;
        }

        public String getPathName() {
            return this.f4142m;
        }

        public AbstractC1112e() {
            super();
        }

        /* renamed from: a */
        public void mo5863a(Path path) {
            path.reset();
            C0770c.C0772b[] bVarArr = this.f4141l;
            if (bVarArr != null) {
                C0770c.C0772b.m3734a(bVarArr, path);
            }
        }

        public AbstractC1112e(AbstractC1112e eVar) {
            super();
            this.f4142m = eVar.f4142m;
            this.f4144o = eVar.f4144o;
            this.f4141l = C0770c.m3727a(eVar.f4141l);
        }

        public void setPathData(C0770c.C0772b[] bVarArr) {
            if (!C0770c.m3725a(this.f4141l, bVarArr)) {
                this.f4141l = C0770c.m3727a(bVarArr);
            } else {
                C0770c.m3728b(this.f4141l, bVarArr);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.i.a.a.i$f */
    public static class C1113f {

        /* renamed from: n */
        private static final Matrix f4145n = new Matrix();

        /* renamed from: a */
        Paint f4146a;

        /* renamed from: b */
        Paint f4147b;

        /* renamed from: c */
        final C1110c f4148c;

        /* renamed from: d */
        float f4149d;

        /* renamed from: e */
        float f4150e;

        /* renamed from: f */
        float f4151f;

        /* renamed from: g */
        float f4152g;

        /* renamed from: h */
        int f4153h;

        /* renamed from: i */
        String f4154i;

        /* renamed from: j */
        Boolean f4155j;

        /* renamed from: k */
        final ArrayMap<String, Object> f4156k;

        /* renamed from: l */
        private final Path f4157l;

        /* renamed from: m */
        private final Path f4158m;

        /* renamed from: o */
        private final Matrix f4159o;

        /* renamed from: p */
        private PathMeasure f4160p;

        /* renamed from: q */
        private int f4161q;

        /* renamed from: a */
        private static float m5264a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public int getRootAlpha() {
            return this.f4153h;
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        /* renamed from: a */
        public boolean mo5868a() {
            if (this.f4155j == null) {
                this.f4155j = Boolean.valueOf(this.f4148c.mo5829b());
            }
            return this.f4155j.booleanValue();
        }

        public C1113f() {
            this.f4159o = new Matrix();
            this.f4149d = BitmapDescriptorFactory.HUE_RED;
            this.f4150e = BitmapDescriptorFactory.HUE_RED;
            this.f4151f = BitmapDescriptorFactory.HUE_RED;
            this.f4152g = BitmapDescriptorFactory.HUE_RED;
            this.f4153h = 255;
            this.f4154i = null;
            this.f4155j = null;
            this.f4156k = new ArrayMap<>();
            this.f4148c = new C1110c();
            this.f4157l = new Path();
            this.f4158m = new Path();
        }

        public void setRootAlpha(int i) {
            this.f4153h = i;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        /* renamed from: a */
        public boolean mo5869a(int[] iArr) {
            return this.f4148c.mo5828a(iArr);
        }

        public C1113f(C1113f fVar) {
            this.f4159o = new Matrix();
            this.f4149d = BitmapDescriptorFactory.HUE_RED;
            this.f4150e = BitmapDescriptorFactory.HUE_RED;
            this.f4151f = BitmapDescriptorFactory.HUE_RED;
            this.f4152g = BitmapDescriptorFactory.HUE_RED;
            this.f4153h = 255;
            this.f4154i = null;
            this.f4155j = null;
            ArrayMap<String, Object> arrayMap = new ArrayMap<>();
            this.f4156k = arrayMap;
            this.f4148c = new C1110c(fVar.f4148c, arrayMap);
            this.f4157l = new Path(fVar.f4157l);
            this.f4158m = new Path(fVar.f4158m);
            this.f4149d = fVar.f4149d;
            this.f4150e = fVar.f4150e;
            this.f4151f = fVar.f4151f;
            this.f4152g = fVar.f4152g;
            this.f4161q = fVar.f4161q;
            this.f4153h = fVar.f4153h;
            this.f4154i = fVar.f4154i;
            String str = fVar.f4154i;
            if (str != null) {
                arrayMap.put(str, this);
            }
            this.f4155j = fVar.f4155j;
        }

        /* renamed from: a */
        private float m5265a(Matrix matrix) {
            float[] fArr = {BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED};
            matrix.mapVectors(fArr);
            float a = m5264a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > BitmapDescriptorFactory.HUE_RED) {
                return Math.abs(a) / max;
            }
            return BitmapDescriptorFactory.HUE_RED;
        }

        /* renamed from: a */
        public void mo5867a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m5266a(this.f4148c, f4145n, canvas, i, i2, colorFilter);
        }

        /* renamed from: a */
        private void m5266a(C1110c cVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            cVar.f4128a.set(matrix);
            cVar.f4128a.preConcat(cVar.f4131d);
            canvas.save();
            for (int i3 = 0; i3 < cVar.f4129b.size(); i3++) {
                AbstractC1111d dVar = cVar.f4129b.get(i3);
                if (dVar instanceof C1110c) {
                    m5266a((C1110c) dVar, cVar.f4128a, canvas, i, i2, colorFilter);
                } else if (dVar instanceof AbstractC1112e) {
                    m5267a(cVar, (AbstractC1112e) dVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: a */
        private void m5267a(C1110c cVar, AbstractC1112e eVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            Path.FillType fillType;
            Path.FillType fillType2;
            float f = ((float) i) / this.f4151f;
            float f2 = ((float) i2) / this.f4152g;
            float min = Math.min(f, f2);
            Matrix matrix = cVar.f4128a;
            this.f4159o.set(matrix);
            this.f4159o.postScale(f, f2);
            float a = m5265a(matrix);
            if (a != BitmapDescriptorFactory.HUE_RED) {
                eVar.mo5863a(this.f4157l);
                Path path = this.f4157l;
                this.f4158m.reset();
                if (eVar.mo5826a()) {
                    Path path2 = this.f4158m;
                    if (eVar.f4143n == 0) {
                        fillType2 = Path.FillType.WINDING;
                    } else {
                        fillType2 = Path.FillType.EVEN_ODD;
                    }
                    path2.setFillType(fillType2);
                    this.f4158m.addPath(path, this.f4159o);
                    canvas.clipPath(this.f4158m);
                    return;
                }
                C1109b bVar = (C1109b) eVar;
                if (!(bVar.f4121f == BitmapDescriptorFactory.HUE_RED && bVar.f4122g == 1.0f)) {
                    float f3 = (bVar.f4121f + bVar.f4123h) % 1.0f;
                    float f4 = (bVar.f4122g + bVar.f4123h) % 1.0f;
                    if (this.f4160p == null) {
                        this.f4160p = new PathMeasure();
                    }
                    this.f4160p.setPath(this.f4157l, false);
                    float length = this.f4160p.getLength();
                    float f5 = f3 * length;
                    float f6 = f4 * length;
                    path.reset();
                    if (f5 > f6) {
                        this.f4160p.getSegment(f5, length, path, true);
                        this.f4160p.getSegment(BitmapDescriptorFactory.HUE_RED, f6, path, true);
                    } else {
                        this.f4160p.getSegment(f5, f6, path, true);
                    }
                    path.rLineTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
                this.f4158m.addPath(path, this.f4159o);
                if (bVar.f4118c.mo4285e()) {
                    C0756b bVar2 = bVar.f4118c;
                    if (this.f4147b == null) {
                        Paint paint = new Paint(1);
                        this.f4147b = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f4147b;
                    if (bVar2.mo4283c()) {
                        Shader a2 = bVar2.mo4279a();
                        a2.setLocalMatrix(this.f4159o);
                        paint2.setShader(a2);
                        paint2.setAlpha(Math.round(bVar.f4120e * 255.0f));
                    } else {
                        paint2.setShader(null);
                        paint2.setAlpha(255);
                        paint2.setColor(C1106i.m5236a(bVar2.mo4281b(), bVar.f4120e));
                    }
                    paint2.setColorFilter(colorFilter);
                    Path path3 = this.f4158m;
                    if (bVar.f4143n == 0) {
                        fillType = Path.FillType.WINDING;
                    } else {
                        fillType = Path.FillType.EVEN_ODD;
                    }
                    path3.setFillType(fillType);
                    canvas.drawPath(this.f4158m, paint2);
                }
                if (bVar.f4116a.mo4285e()) {
                    C0756b bVar3 = bVar.f4116a;
                    if (this.f4146a == null) {
                        Paint paint3 = new Paint(1);
                        this.f4146a = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f4146a;
                    if (bVar.f4125j != null) {
                        paint4.setStrokeJoin(bVar.f4125j);
                    }
                    if (bVar.f4124i != null) {
                        paint4.setStrokeCap(bVar.f4124i);
                    }
                    paint4.setStrokeMiter(bVar.f4126k);
                    if (bVar3.mo4283c()) {
                        Shader a3 = bVar3.mo4279a();
                        a3.setLocalMatrix(this.f4159o);
                        paint4.setShader(a3);
                        paint4.setAlpha(Math.round(bVar.f4119d * 255.0f));
                    } else {
                        paint4.setShader(null);
                        paint4.setAlpha(255);
                        paint4.setColor(C1106i.m5236a(bVar3.mo4281b(), bVar.f4119d));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(bVar.f4117b * min * a);
                    canvas.drawPath(this.f4158m, paint4);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.i.a.a.i$g */
    public static class C1114g extends Drawable.ConstantState {

        /* renamed from: a */
        int f4162a;

        /* renamed from: b */
        C1113f f4163b;

        /* renamed from: c */
        ColorStateList f4164c;

        /* renamed from: d */
        PorterDuff.Mode f4165d;

        /* renamed from: e */
        boolean f4166e;

        /* renamed from: f */
        Bitmap f4167f;

        /* renamed from: g */
        ColorStateList f4168g;

        /* renamed from: h */
        PorterDuff.Mode f4169h;

        /* renamed from: i */
        int f4170i;

        /* renamed from: j */
        boolean f4171j;

        /* renamed from: k */
        boolean f4172k;

        /* renamed from: l */
        Paint f4173l;

        public int getChangingConfigurations() {
            return this.f4162a;
        }

        /* renamed from: d */
        public boolean mo5883d() {
            return this.f4163b.mo5868a();
        }

        public Drawable newDrawable() {
            return new C1106i(this);
        }

        public C1114g() {
            this.f4165d = C1106i.f4106a;
            this.f4163b = new C1113f();
        }

        /* renamed from: c */
        public void mo5881c() {
            this.f4168g = this.f4164c;
            this.f4169h = this.f4165d;
            this.f4170i = this.f4163b.getRootAlpha();
            this.f4171j = this.f4166e;
            this.f4172k = false;
        }

        /* renamed from: b */
        public boolean mo5880b() {
            if (!this.f4172k && this.f4168g == this.f4164c && this.f4169h == this.f4165d && this.f4171j == this.f4166e && this.f4170i == this.f4163b.getRootAlpha()) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo5877a() {
            if (this.f4163b.getRootAlpha() < 255) {
                return true;
            }
            return false;
        }

        public Drawable newDrawable(Resources resources) {
            return new C1106i(this);
        }

        /* renamed from: a */
        public Paint mo5874a(ColorFilter colorFilter) {
            if (!mo5877a() && colorFilter == null) {
                return null;
            }
            if (this.f4173l == null) {
                Paint paint = new Paint();
                this.f4173l = paint;
                paint.setFilterBitmap(true);
            }
            this.f4173l.setAlpha(this.f4163b.getRootAlpha());
            this.f4173l.setColorFilter(colorFilter);
            return this.f4173l;
        }

        public C1114g(C1114g gVar) {
            this.f4165d = C1106i.f4106a;
            if (gVar != null) {
                this.f4162a = gVar.f4162a;
                this.f4163b = new C1113f(gVar.f4163b);
                if (gVar.f4163b.f4147b != null) {
                    this.f4163b.f4147b = new Paint(gVar.f4163b.f4147b);
                }
                if (gVar.f4163b.f4146a != null) {
                    this.f4163b.f4146a = new Paint(gVar.f4163b.f4146a);
                }
                this.f4164c = gVar.f4164c;
                this.f4165d = gVar.f4165d;
                this.f4166e = gVar.f4166e;
            }
        }

        /* renamed from: a */
        public boolean mo5878a(int[] iArr) {
            boolean a = this.f4163b.mo5869a(iArr);
            this.f4172k |= a;
            return a;
        }

        /* renamed from: a */
        public void mo5875a(int i, int i2) {
            this.f4167f.eraseColor(0);
            this.f4163b.mo5867a(new Canvas(this.f4167f), i, i2, (ColorFilter) null);
        }

        /* renamed from: b */
        public void mo5879b(int i, int i2) {
            if (this.f4167f == null || !mo5882c(i, i2)) {
                this.f4167f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f4172k = true;
            }
        }

        /* renamed from: c */
        public boolean mo5882c(int i, int i2) {
            if (i == this.f4167f.getWidth() && i2 == this.f4167f.getHeight()) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public void mo5876a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f4167f, (Rect) null, rect, mo5874a(colorFilter));
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

    /* access modifiers changed from: private */
    /* renamed from: androidx.i.a.a.i$h */
    public static class C1115h extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f4174a;

        public boolean canApplyTheme() {
            return this.f4174a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f4174a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C1106i iVar = new C1106i();
            iVar.f4105b = (VectorDrawable) this.f4174a.newDrawable();
            return iVar;
        }

        public C1115h(Drawable.ConstantState constantState) {
            this.f4174a = constantState;
        }

        public Drawable newDrawable(Resources resources) {
            C1106i iVar = new C1106i();
            iVar.f4105b = (VectorDrawable) this.f4174a.newDrawable(resources);
            return iVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1106i iVar = new C1106i();
            iVar.f4105b = (VectorDrawable) this.f4174a.newDrawable(resources, theme);
            return iVar;
        }
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
        if (this.f4105b == null) {
            return false;
        }
        C0774a.m3776d(this.f4105b);
        return false;
    }

    public ColorFilter getColorFilter() {
        if (this.f4105b != null) {
            return C0774a.m3777e(this.f4105b);
        }
        return this.f4109e;
    }

    public int getOpacity() {
        if (this.f4105b != null) {
            return this.f4105b.getOpacity();
        }
        return -3;
    }

    public void invalidateSelf() {
        if (this.f4105b != null) {
            this.f4105b.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        if (this.f4105b != null) {
            return C0774a.m3773b(this.f4105b);
        }
        return this.f4107c.f4166e;
    }

    public int getAlpha() {
        if (this.f4105b != null) {
            return C0774a.m3775c(this.f4105b);
        }
        return this.f4107c.f4163b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        if (this.f4105b != null) {
            return this.f4105b.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f4107c.getChangingConfigurations();
    }

    public int getIntrinsicHeight() {
        if (this.f4105b != null) {
            return this.f4105b.getIntrinsicHeight();
        }
        return (int) this.f4107c.f4163b.f4150e;
    }

    public int getIntrinsicWidth() {
        if (this.f4105b != null) {
            return this.f4105b.getIntrinsicWidth();
        }
        return (int) this.f4107c.f4163b.f4149d;
    }

    C1106i() {
        this.f4111g = true;
        this.f4113i = new float[9];
        this.f4114j = new Matrix();
        this.f4115k = new Rect();
        this.f4107c = new C1114g();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f4105b != null && Build.VERSION.SDK_INT >= 24) {
            return new C1115h(this.f4105b.getConstantState());
        }
        this.f4107c.f4162a = getChangingConfigurations();
        return this.f4107c;
    }

    public boolean isStateful() {
        C1114g gVar;
        if (this.f4105b != null) {
            return this.f4105b.isStateful();
        }
        if (super.isStateful() || ((gVar = this.f4107c) != null && (gVar.mo5883d() || (this.f4107c.f4164c != null && this.f4107c.f4164c.isStateful())))) {
            return true;
        }
        return false;
    }

    public Drawable mutate() {
        if (this.f4105b != null) {
            this.f4105b.mutate();
            return this;
        }
        if (!this.f4110f && super.mutate() == this) {
            this.f4107c = new C1114g(this.f4107c);
            this.f4110f = true;
        }
        return this;
    }

    /* renamed from: a */
    private boolean m5241a() {
        if (Build.VERSION.SDK_INT < 17 || !isAutoMirrored() || C0774a.m3781i(this) != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5802a(boolean z) {
        this.f4111g = z;
    }

    @Override // androidx.p042i.p043a.p044a.AbstractC1105h
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
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

    /* access modifiers changed from: protected */
    @Override // androidx.p042i.p043a.p044a.AbstractC1105h
    public void onBoundsChange(Rect rect) {
        if (this.f4105b != null) {
            this.f4105b.setBounds(rect);
        }
    }

    public void setAutoMirrored(boolean z) {
        if (this.f4105b != null) {
            C0774a.m3772a(this.f4105b, z);
        } else {
            this.f4107c.f4166e = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f4105b != null) {
            this.f4105b.setColorFilter(colorFilter);
            return;
        }
        this.f4109e = colorFilter;
        invalidateSelf();
    }

    public void unscheduleSelf(Runnable runnable) {
        if (this.f4105b != null) {
            this.f4105b.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public void setAlpha(int i) {
        if (this.f4105b != null) {
            this.f4105b.setAlpha(i);
        } else if (this.f4107c.f4163b.getRootAlpha() != i) {
            this.f4107c.f4163b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // androidx.core.graphics.drawable.AbstractC0780f
    public void setTint(int i) {
        if (this.f4105b != null) {
            C0774a.m3766a(this.f4105b, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // androidx.core.graphics.drawable.AbstractC0780f
    public void setTintList(ColorStateList colorStateList) {
        if (this.f4105b != null) {
            C0774a.m3768a(this.f4105b, colorStateList);
            return;
        }
        C1114g gVar = this.f4107c;
        if (gVar.f4164c != colorStateList) {
            gVar.f4164c = colorStateList;
            this.f4108d = mo5800a(this.f4108d, colorStateList, gVar.f4165d);
            invalidateSelf();
        }
    }

    @Override // androidx.core.graphics.drawable.AbstractC0780f
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f4105b != null) {
            C0774a.m3771a(this.f4105b, mode);
            return;
        }
        C1114g gVar = this.f4107c;
        if (gVar.f4165d != mode) {
            gVar.f4165d = mode;
            this.f4108d = mo5800a(this.f4108d, gVar.f4164c, mode);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.f4105b != null) {
            return this.f4105b.setState(iArr);
        }
        boolean z = false;
        C1114g gVar = this.f4107c;
        if (!(gVar.f4164c == null || gVar.f4165d == null)) {
            this.f4108d = mo5800a(this.f4108d, gVar.f4164c, gVar.f4165d);
            invalidateSelf();
            z = true;
        }
        if (!gVar.mo5883d() || !gVar.mo5878a(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    C1106i(C1114g gVar) {
        this.f4111g = true;
        this.f4113i = new float[9];
        this.f4114j = new Matrix();
        this.f4115k = new Rect();
        this.f4107c = gVar;
        this.f4108d = mo5800a(this.f4108d, gVar.f4164c, gVar.f4165d);
    }

    public void draw(Canvas canvas) {
        if (this.f4105b != null) {
            this.f4105b.draw(canvas);
            return;
        }
        copyBounds(this.f4115k);
        if (this.f4115k.width() > 0 && this.f4115k.height() > 0) {
            ColorFilter colorFilter = this.f4109e;
            if (colorFilter == null) {
                colorFilter = this.f4108d;
            }
            canvas.getMatrix(this.f4114j);
            this.f4114j.getValues(this.f4113i);
            float abs = Math.abs(this.f4113i[0]);
            float abs2 = Math.abs(this.f4113i[4]);
            float abs3 = Math.abs(this.f4113i[1]);
            float abs4 = Math.abs(this.f4113i[3]);
            if (!(abs3 == BitmapDescriptorFactory.HUE_RED && abs4 == BitmapDescriptorFactory.HUE_RED)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f4115k.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f4115k.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate((float) this.f4115k.left, (float) this.f4115k.top);
                if (m5241a()) {
                    canvas.translate((float) this.f4115k.width(), BitmapDescriptorFactory.HUE_RED);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f4115k.offsetTo(0, 0);
                this.f4107c.mo5879b(min, min2);
                if (!this.f4111g) {
                    this.f4107c.mo5875a(min, min2);
                } else if (!this.f4107c.mo5880b()) {
                    this.f4107c.mo5875a(min, min2);
                    this.f4107c.mo5881c();
                }
                this.f4107c.mo5876a(canvas, colorFilter, this.f4115k);
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo5801a(String str) {
        return this.f4107c.f4163b.f4156k.get(str);
    }

    @Override // androidx.p042i.p043a.p044a.AbstractC1105h
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // androidx.p042i.p043a.p044a.AbstractC1105h
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    /* renamed from: a */
    static int m5236a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    public void scheduleSelf(Runnable runnable, long j) {
        if (this.f4105b != null) {
            this.f4105b.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.f4105b != null) {
            return this.f4105b.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    /* renamed from: a */
    private static PorterDuff.Mode m5237a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        if (this.f4105b != null) {
            this.f4105b.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038 A[Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.p042i.p043a.p044a.C1106i m5238a(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0023
            androidx.i.a.a.i r0 = new androidx.i.a.a.i
            r0.<init>()
            android.graphics.drawable.Drawable r6 = androidx.core.content.res.C0760e.m3682a(r6, r7, r8)
            r0.f4105b = r6
            androidx.i.a.a.i$h r6 = new androidx.i.a.a.i$h
            android.graphics.drawable.Drawable r7 = r0.f4105b
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            r0.f4112h = r6
            return r0
        L_0x0023:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
        L_0x002b:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            r4 = 2
            if (r3 == r4) goto L_0x0036
            r5 = 1
            if (r3 == r5) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            if (r3 != r4) goto L_0x003d
            androidx.i.a.a.i r6 = m5239a(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            return r6
        L_0x003d:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            throw r6     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
        L_0x0045:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            goto L_0x004e
        L_0x004a:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
        L_0x004e:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p042i.p043a.p044a.C1106i.m5238a(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.i.a.a.i");
    }

    /* renamed from: a */
    private void m5240a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C1114g gVar = this.f4107c;
        C1113f fVar = gVar.f4163b;
        gVar.f4165d = m5237a(C0767f.m3693a(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList a = C0767f.m3694a(typedArray, xmlPullParser, theme, "tint", 1);
        if (a != null) {
            gVar.f4164c = a;
        }
        gVar.f4166e = C0767f.m3699a(typedArray, xmlPullParser, "autoMirrored", 5, gVar.f4166e);
        fVar.f4151f = C0767f.m3692a(typedArray, xmlPullParser, "viewportWidth", 7, fVar.f4151f);
        fVar.f4152g = C0767f.m3692a(typedArray, xmlPullParser, "viewportHeight", 8, fVar.f4152g);
        if (fVar.f4151f <= BitmapDescriptorFactory.HUE_RED) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (fVar.f4152g > BitmapDescriptorFactory.HUE_RED) {
            fVar.f4149d = typedArray.getDimension(3, fVar.f4149d);
            fVar.f4150e = typedArray.getDimension(2, fVar.f4150e);
            if (fVar.f4149d <= BitmapDescriptorFactory.HUE_RED) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (fVar.f4150e > BitmapDescriptorFactory.HUE_RED) {
                fVar.setAlpha(C0767f.m3692a(typedArray, xmlPullParser, "alpha", 4, fVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    fVar.f4154i = string;
                    fVar.f4156k.put(string, fVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public PorterDuffColorFilter mo5800a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // androidx.p042i.p043a.p044a.AbstractC1105h
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static C1106i m5239a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C1106i iVar = new C1106i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        if (this.f4105b != null) {
            C0774a.m3770a(this.f4105b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C1114g gVar = this.f4107c;
        gVar.f4163b = new C1113f();
        TypedArray a = C0767f.m3696a(resources, theme, attributeSet, C1093a.f4078a);
        m5240a(a, xmlPullParser, theme);
        a.recycle();
        gVar.f4162a = getChangingConfigurations();
        gVar.f4172k = true;
        m5242b(resources, xmlPullParser, attributeSet, theme);
        this.f4108d = mo5800a(this.f4108d, gVar.f4164c, gVar.f4165d);
    }

    /* renamed from: b */
    private void m5242b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C1114g gVar = this.f4107c;
        C1113f fVar = gVar.f4163b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(fVar.f4148c);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C1110c cVar = (C1110c) arrayDeque.peek();
                if ("path".equals(name)) {
                    C1109b bVar = new C1109b();
                    bVar.mo5827a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f4129b.add(bVar);
                    if (bVar.getPathName() != null) {
                        fVar.f4156k.put(bVar.getPathName(), bVar);
                    }
                    z = false;
                    gVar.f4162a = bVar.f4144o | gVar.f4162a;
                } else if ("clip-path".equals(name)) {
                    C1108a aVar = new C1108a();
                    aVar.mo5825a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f4129b.add(aVar);
                    if (aVar.getPathName() != null) {
                        fVar.f4156k.put(aVar.getPathName(), aVar);
                    }
                    gVar.f4162a = aVar.f4144o | gVar.f4162a;
                } else if ("group".equals(name)) {
                    C1110c cVar2 = new C1110c();
                    cVar2.mo5846a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f4129b.add(cVar2);
                    arrayDeque.push(cVar2);
                    if (cVar2.getGroupName() != null) {
                        fVar.f4156k.put(cVar2.getGroupName(), cVar2);
                    }
                    gVar.f4162a = cVar2.f4132e | gVar.f4162a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }
}
