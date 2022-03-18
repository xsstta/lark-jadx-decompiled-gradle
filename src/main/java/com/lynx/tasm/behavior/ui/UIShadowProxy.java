package com.lynx.tasm.behavior.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.animation.p1218b.C26575c;
import com.lynx.tasm.animation.p1219c.C26585a;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.ui.utils.BorderRadius;
import com.lynx.tasm.behavior.ui.utils.BorderStyle;
import com.lynx.tasm.behavior.ui.utils.C26834g;
import com.lynx.tasm.behavior.ui.view.C26840a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class UIShadowProxy extends UIGroup<C26745c> {

    /* renamed from: a */
    public LynxBaseUI f66275a;

    /* renamed from: b */
    public C26834g f66276b;

    /* renamed from: c */
    private List<C26748b> f66277c;

    /* renamed from: d */
    private C26743a f66278d;

    /* renamed from: e */
    private Boolean f66279e;

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: N */
    public Rect mo94931N() {
        return null;
    }

    /* renamed from: d */
    public LynxBaseUI mo53300d() {
        return this.f66275a;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: S */
    public Rect mo94936S() {
        return this.f66275a.mo94936S();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: T */
    public int mo94937T() {
        return this.f66275a.mo94937T();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: U */
    public int mo94938U() {
        return this.f66275a.mo94938U();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: V */
    public int mo94939V() {
        return this.f66275a.mo94939V();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: W */
    public int mo94940W() {
        return this.f66275a.mo94940W();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public C26585a aj() {
        return this.f66275a.aj();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean ak() {
        return this.f66275a.ak();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public C26575c al() {
        return this.f66275a.al();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void U_() {
        LynxBaseUI lynxBaseUI = this.f66275a;
        if (lynxBaseUI != null) {
            lynxBaseUI.U_();
        }
        super.U_();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void ah() {
        LynxBaseUI lynxBaseUI = this.f66275a;
        if (lynxBaseUI instanceof LynxUI) {
            ((LynxUI) lynxBaseUI).ah();
        }
    }

    private C26743a aI() {
        if (this.f66278d == null) {
            this.f66278d = new C26743a();
            if (this.f66253Z != null) {
                ((C26745c) this.f66253Z).mo95145a(this.f66278d);
            }
        }
        return this.f66278d;
    }

    /* renamed from: i */
    public void mo53305i() {
        boolean z;
        this.f66276b = null;
        if (this.f66275a.ae() != null) {
            z = true;
        } else {
            z = false;
        }
        this.f66279e = Boolean.valueOf(z);
    }

    public Rect aH() {
        return new Rect(this.f66275a.mo94940W(), this.f66275a.mo94939V(), this.f66275a.mo94940W() + this.f66275a.mo94937T(), this.f66275a.mo94939V() + this.f66275a.mo94938U());
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    /* renamed from: j */
    public void mo53306j() {
        super.mo53306j();
        View view = (View) ((C26745c) this.f66253Z).getParent();
        if (view != null) {
            ((C26745c) this.f66253Z).layout(0, 0, view.getWidth(), view.getHeight());
            LynxBaseUI lynxBaseUI = this.f66275a;
            if (lynxBaseUI instanceof LynxUI) {
                ((LynxUI) lynxBaseUI).mo53306j();
            }
            aJ();
        }
    }

    private void aJ() {
        float[] fArr;
        BorderRadius e = this.f66275a.mo94918A().mo95538e();
        if (e != null) {
            fArr = e.mo95508b();
        } else {
            fArr = null;
        }
        if (this.f66275a.mo94937T() > 0 && this.f66275a.mo94938U() > 0) {
            Rect aH = aH();
            C26743a aVar = this.f66278d;
            if (aVar != null) {
                aVar.f66283d = aH;
            }
            ((C26745c) this.f66253Z).mo95145a(this.f66278d);
            ((C26745c) this.f66253Z).mo95146a(this.f66277c, aH, fArr);
        }
        ((C26745c) this.f66253Z).invalidate();
    }

    /* renamed from: k */
    public void mo53307k() {
        if (this.f66276b == null && this.f66279e.booleanValue()) {
            this.f66279e = false;
            if (this.f66275a.f66210P == null) {
                this.f66276b = null;
                return;
            }
            Rect aH = aH();
            this.f66276b = C26834g.m97548a(this.f66275a.f66210P, this.f66239t.mo94692n().ad(), ad(), (float) this.f66239t.mo94692n().mo94937T(), (float) this.f66239t.mo94692n().mo94938U(), (float) aH.width(), (float) aH.height());
        }
    }

    /* renamed from: com.lynx.tasm.behavior.ui.UIShadowProxy$b */
    public static class C26744b {

        /* renamed from: w */
        static double[] f66286w = {1.0d, 0.8027415617602307d, 0.6443940149772542d, 0.5172818579717866d, 0.41524364653850576d, 0.3333333333333333d, 0.2075805205867436d, 0.1147980049924181d, 0.0424272859905955d, 0.0d};

        /* renamed from: a */
        Paint f66287a = new Paint(5);

        /* renamed from: b */
        Paint f66288b;

        /* renamed from: c */
        Paint f66289c;

        /* renamed from: d */
        Paint f66290d;

        /* renamed from: e */
        Paint f66291e;

        /* renamed from: f */
        Paint f66292f;

        /* renamed from: g */
        final RectF f66293g;

        /* renamed from: h */
        final RectF f66294h;

        /* renamed from: i */
        float[] f66295i;

        /* renamed from: j */
        float[] f66296j;

        /* renamed from: k */
        C26748b f66297k;

        /* renamed from: l */
        final Path f66298l = new Path();

        /* renamed from: m */
        final Path f66299m = new Path();

        /* renamed from: n */
        final Path f66300n = new Path();

        /* renamed from: o */
        final Path f66301o = new Path();

        /* renamed from: p */
        final Path f66302p = new Path();

        /* renamed from: q */
        final Path f66303q = new Path();

        /* renamed from: r */
        final Path f66304r = new Path();

        /* renamed from: s */
        final Path f66305s = new Path();

        /* renamed from: t */
        final Path f66306t = new Path();

        /* renamed from: u */
        final Path f66307u = new Path();

        /* renamed from: v */
        boolean f66308v = false;

        public C26744b() {
            Paint paint = new Paint(5);
            this.f66288b = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f66288b.setDither(true);
            this.f66289c = new Paint(this.f66288b);
            this.f66290d = new Paint(this.f66288b);
            this.f66291e = new Paint(this.f66288b);
            this.f66293g = new RectF();
            this.f66294h = new RectF();
            this.f66292f = new Paint(this.f66288b);
            this.f66295i = new float[8];
            this.f66296j = new float[8];
        }

        /* renamed from: b */
        private void m97105b() {
            float f = this.f66297k.f66317f;
            int[] iArr = {Color.alpha(this.f66297k.f66312a), Color.red(this.f66297k.f66312a), Color.green(this.f66297k.f66312a), Color.blue(this.f66297k.f66312a)};
            this.f66287a.setColor(this.f66297k.f66312a);
            int[] iArr2 = new int[f66286w.length];
            int i = 0;
            while (true) {
                double[] dArr = f66286w;
                if (i >= dArr.length) {
                    break;
                }
                iArr2[i] = Color.argb((int) (((double) iArr[0]) * dArr[i]), iArr[1], iArr[2], iArr[3]);
                i++;
            }
            Paint paint = this.f66292f;
            if (!this.f66297k.mo95150a()) {
                f = -f;
            }
            paint.setShader(new LinearGradient((float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, f, iArr2, (float[]) null, Shader.TileMode.CLAMP));
            float[] fArr = this.f66295i;
            m97102a(this.f66288b, iArr, fArr[0], fArr[1]);
            m97102a(this.f66289c, iArr, fArr[2], fArr[3]);
            m97102a(this.f66291e, iArr, fArr[4], fArr[5]);
            m97102a(this.f66290d, iArr, fArr[6], fArr[7]);
        }

        /* renamed from: a */
        private void m97101a() {
            float f;
            Path.Op op;
            Path.Op op2;
            Path.Op op3;
            Path path = new Path();
            Path path2 = new Path();
            Path path3 = new Path();
            Path path4 = new Path();
            this.f66298l.reset();
            this.f66299m.reset();
            float f2 = this.f66297k.f66316e;
            float f3 = this.f66297k.f66315d;
            this.f66298l.addRoundRect(this.f66293g, this.f66295i, Path.Direction.CW);
            this.f66299m.addRoundRect(this.f66294h, this.f66296j, Path.Direction.CW);
            if (Build.VERSION.SDK_INT == 21 || Build.VERSION.SDK_INT == 22) {
                if (this.f66293g.left < this.f66294h.left || this.f66293g.top < this.f66293g.top || this.f66293g.right > this.f66294h.right || this.f66293g.bottom > this.f66294h.bottom) {
                    this.f66308v = false;
                } else {
                    this.f66308v = true;
                }
            } else if (Build.VERSION.SDK_INT >= 19) {
                if (this.f66297k.mo95150a()) {
                    op3 = Path.Op.REVERSE_DIFFERENCE;
                } else {
                    op3 = Path.Op.DIFFERENCE;
                }
                this.f66298l.op(this.f66299m, op3);
            }
            this.f66287a.setColor(this.f66297k.f66312a);
            path.reset();
            path.set(this.f66299m);
            path.offset(-this.f66293g.left, -this.f66293g.top);
            Matrix matrix = new Matrix();
            path2.reset();
            path2.set(this.f66299m);
            matrix.reset();
            matrix.preRotate(-180.0f);
            matrix.preTranslate(-this.f66293g.right, -this.f66293g.bottom);
            path2.transform(matrix);
            path3.reset();
            path3.set(this.f66299m);
            matrix.reset();
            matrix.preRotate(-270.0f);
            matrix.preTranslate(-this.f66293g.left, -this.f66293g.bottom);
            path3.transform(matrix);
            path4.reset();
            path4.set(this.f66299m);
            matrix.reset();
            matrix.preRotate(-90.0f);
            matrix.preTranslate(-this.f66293g.right, -this.f66293g.top);
            path4.transform(matrix);
            if (Build.VERSION.SDK_INT >= 19) {
                if (this.f66297k.mo95150a()) {
                    op2 = Path.Op.INTERSECT;
                } else {
                    op2 = Path.Op.DIFFERENCE;
                }
                this.f66300n.op(path, op2);
                this.f66301o.op(path2, op2);
                this.f66302p.op(path3, op2);
                this.f66303q.op(path4, op2);
            }
            this.f66304r.reset();
            this.f66305s.reset();
            this.f66306t.reset();
            this.f66307u.reset();
            float[] fArr = this.f66295i;
            boolean a = this.f66297k.mo95150a();
            float f4 = BitmapDescriptorFactory.HUE_RED;
            if (a) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = -this.f66297k.f66317f;
            }
            if (this.f66297k.mo95150a()) {
                f4 = this.f66297k.f66317f;
            }
            this.f66304r.addRect(fArr[0], f, this.f66293g.width() - fArr[2], f4, Path.Direction.CW);
            this.f66305s.addRect(fArr[4], f, this.f66293g.width() - fArr[6], f4, Path.Direction.CW);
            this.f66306t.addRect(fArr[7], f, this.f66293g.height() - fArr[1], f4, Path.Direction.CW);
            this.f66307u.addRect(fArr[3], f, this.f66293g.height() - fArr[5], f4, Path.Direction.CW);
            if (Build.VERSION.SDK_INT >= 19) {
                if (this.f66297k.mo95150a()) {
                    op = Path.Op.INTERSECT;
                } else {
                    op = Path.Op.DIFFERENCE;
                }
                this.f66304r.op(path, op);
                this.f66305s.op(path2, op);
                this.f66306t.op(path3, op);
                this.f66307u.op(path4, op);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo95143a(Canvas canvas) {
            if (this.f66297k != null) {
                int save = canvas.save();
                if (!this.f66308v) {
                    canvas.drawPath(this.f66298l, this.f66287a);
                }
                m97106b(canvas);
                canvas.restoreToCount(save);
            }
        }

        /* renamed from: b */
        private void m97106b(Canvas canvas) {
            if (this.f66297k != null) {
                if (this.f66308v) {
                    canvas.clipPath(this.f66299m, Region.Op.DIFFERENCE);
                }
                int save = canvas.save();
                canvas.translate(this.f66293g.left, this.f66293g.top);
                canvas.drawPath(this.f66300n, this.f66288b);
                canvas.drawPath(this.f66304r, this.f66292f);
                canvas.restoreToCount(save);
                int save2 = canvas.save();
                canvas.translate(this.f66293g.right, this.f66293g.bottom);
                canvas.rotate(180.0f);
                canvas.drawPath(this.f66301o, this.f66291e);
                canvas.drawPath(this.f66305s, this.f66292f);
                canvas.restoreToCount(save2);
                int save3 = canvas.save();
                canvas.translate(this.f66293g.left, this.f66293g.bottom);
                canvas.rotate(270.0f);
                canvas.drawPath(this.f66302p, this.f66290d);
                canvas.drawPath(this.f66306t, this.f66292f);
                canvas.restoreToCount(save3);
                int save4 = canvas.save();
                canvas.translate(this.f66293g.right, this.f66293g.top);
                canvas.rotate(90.0f);
                canvas.drawPath(this.f66303q, this.f66289c);
                canvas.drawPath(this.f66307u, this.f66292f);
                canvas.restoreToCount(save4);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
            if (r1 < 1.0f) goto L_0x0039;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m97104a(android.graphics.RectF r8, float[] r9) {
            /*
            // Method dump skipped, instructions count: 165
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.UIShadowProxy.C26744b.m97104a(android.graphics.RectF, float[]):void");
        }

        /* renamed from: a */
        private void m97103a(Path path, float f, float f2) {
            float f3;
            path.reset();
            if (this.f66297k.mo95150a()) {
                f3 = this.f66297k.f66317f;
            } else {
                f3 = -this.f66297k.f66317f;
            }
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f * 2.0f, f2 * 2.0f);
            RectF rectF2 = new RectF(rectF);
            if (f3 > BitmapDescriptorFactory.HUE_RED) {
                float min = Math.min(rectF2.width(), rectF2.height()) / 2.0f;
                if (f3 > min) {
                    f3 = min;
                }
            }
            rectF2.inset(f3, f3);
            path.setFillType(Path.FillType.EVEN_ODD);
            path.moveTo(BitmapDescriptorFactory.HUE_RED, f2);
            path.rLineTo(f3, BitmapDescriptorFactory.HUE_RED);
            path.arcTo(rectF2, 180.0f, 90.0f, false);
            path.arcTo(rectF, 270.0f, -90.0f, false);
            path.close();
        }

        /* renamed from: a */
        public void mo95144a(C26748b bVar, Rect rect, float[] fArr) {
            int i;
            this.f66297k = bVar;
            if (fArr == null || fArr.length != 8) {
                Arrays.fill(this.f66296j, (float) BitmapDescriptorFactory.HUE_RED);
            } else {
                System.arraycopy(fArr, 0, this.f66296j, 0, 8);
            }
            System.arraycopy(this.f66296j, 0, this.f66295i, 0, 8);
            this.f66293g.set(rect);
            this.f66294h.set(rect);
            C26748b bVar2 = this.f66297k;
            if (bVar2 != null) {
                float f = bVar2.f66316e - (this.f66297k.f66315d / 2.0f);
                if (this.f66297k.mo95150a()) {
                    i = 1;
                } else {
                    i = -1;
                }
                float f2 = f * ((float) i);
                if (f2 > BitmapDescriptorFactory.HUE_RED) {
                    float min = Math.min(this.f66293g.width(), this.f66293g.height()) / 2.0f;
                    if (f2 > min) {
                        f2 = min;
                    }
                }
                this.f66293g.inset(f2, f2);
                this.f66293g.offset(this.f66297k.f66313b, this.f66297k.f66314c);
                for (int i2 = 0; i2 < 8; i2++) {
                    float[] fArr2 = this.f66295i;
                    fArr2[i2] = Math.max(fArr2[i2] - f2, (float) BitmapDescriptorFactory.HUE_RED);
                }
                m97104a(this.f66293g, this.f66295i);
            }
            if (this.f66297k != null) {
                float[] fArr3 = this.f66295i;
                m97103a(this.f66300n, fArr3[0], fArr3[1]);
                m97103a(this.f66303q, fArr3[2], fArr3[3]);
                m97103a(this.f66301o, fArr3[4], fArr3[5]);
                m97103a(this.f66302p, fArr3[6], fArr3[7]);
                m97105b();
                m97101a();
            }
        }

        /* renamed from: a */
        private void m97102a(Paint paint, int[] iArr, float f, float f2) {
            float f3 = this.f66297k.f66317f;
            float f4 = (f + f2) / 2.0f;
            int length = f66286w.length;
            boolean a = this.f66297k.mo95150a();
            float f5 = 1.0f;
            float f6 = BitmapDescriptorFactory.HUE_RED;
            char c = 2;
            if (!a) {
                float f7 = f3 + f4;
                if (((double) f7) <= 1.0E-6d) {
                    paint.setShader(null);
                    return;
                }
                float f8 = f4 / f7;
                int i = length + 1;
                float[] fArr = new float[i];
                int[] iArr2 = new int[i];
                fArr[0] = 0.0f;
                fArr[1] = f8;
                iArr2[0] = this.f66297k.f66312a;
                iArr2[1] = this.f66297k.f66312a;
                for (int i2 = 2; i2 <= length; i2++) {
                    int i3 = i2 - 1;
                    fArr[i2] = (((1.0f - f8) * ((float) i3)) / ((float) (length - 1))) + f8;
                    iArr2[i2] = Color.argb((int) (((double) iArr[0]) * f66286w[i3]), iArr[1], iArr[2], iArr[3]);
                }
                paint.setShader(new RadialGradient(f, f2, f7, iArr2, fArr, Shader.TileMode.CLAMP));
            } else if (((double) f4) <= 1.0E-6d) {
                paint.setShader(null);
            } else {
                float f9 = f3 / f4;
                int i4 = length + 1;
                float[] fArr2 = new float[i4];
                int[] iArr3 = new int[i4];
                fArr2[length] = 1.0f;
                iArr3[length] = this.f66297k.f66312a;
                int i5 = 1;
                while (i5 < length) {
                    int i6 = length - i5;
                    fArr2[i6] = Math.max(f5 - ((((float) i5) * f9) / ((float) (length - 1))), f6);
                    iArr3[i6] = Color.argb((int) (((double) iArr[0]) * f66286w[i5]), iArr[1], iArr[c], iArr[3]);
                    i5++;
                    f5 = 1.0f;
                    f6 = BitmapDescriptorFactory.HUE_RED;
                    c = 2;
                }
                fArr2[0] = 0.0f;
                iArr3[0] = Color.argb(0, iArr[1], iArr[2], iArr[3]);
                paint.setShader(new RadialGradient(f, f2, f4, iArr3, fArr2, Shader.TileMode.CLAMP));
            }
        }
    }

    /* renamed from: com.lynx.tasm.behavior.ui.UIShadowProxy$c */
    public static class C26745c extends C26840a {

        /* renamed from: a */
        private ArrayList<C26744b> f66309a;

        /* renamed from: b */
        private C26743a f66310b;

        /* renamed from: c */
        private WeakReference<UIShadowProxy> f66311c;

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.ui.view.C26840a
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* renamed from: a */
        public void mo95145a(C26743a aVar) {
            this.f66310b = aVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.ui.view.C26840a
        public void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            ArrayList<C26744b> arrayList = this.f66309a;
            if ((arrayList != null && !arrayList.isEmpty()) || this.f66310b != null) {
                canvas.save();
                UIShadowProxy uIShadowProxy = this.f66311c.get();
                if (uIShadowProxy != null) {
                    uIShadowProxy.mo53307k();
                    if (uIShadowProxy.f66276b != null) {
                        Rect aH = uIShadowProxy.aH();
                        canvas.concat(uIShadowProxy.f66276b.mo95554a((float) aH.centerX(), (float) aH.centerY()));
                    }
                    if (uIShadowProxy.f66275a.f66213S != null) {
                        canvas.translate(uIShadowProxy.f66275a.f66213S.f66246a, uIShadowProxy.f66275a.f66213S.f66247b);
                    }
                }
                ArrayList<C26744b> arrayList2 = this.f66309a;
                if (arrayList2 != null) {
                    Iterator<C26744b> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().mo95143a(canvas);
                    }
                }
                C26743a aVar = this.f66310b;
                if (aVar != null) {
                    aVar.mo95142a(canvas);
                }
                canvas.restore();
            }
        }

        public C26745c(UIShadowProxy uIShadowProxy, Context context) {
            super(context);
            this.f66311c = new WeakReference<>(uIShadowProxy);
            setWillNotDraw(false);
        }

        /* renamed from: a */
        public void mo95146a(List<C26748b> list, Rect rect, float[] fArr) {
            this.f66309a = null;
            if (!(list == null || list.isEmpty())) {
                this.f66309a = new ArrayList<>();
                for (C26748b bVar : list) {
                    C26744b bVar2 = new C26744b();
                    bVar2.mo95144a(bVar, rect, fArr);
                    this.f66309a.add(bVar2);
                }
                invalidate();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C26745c mo33942b(Context context) {
        return new C26745c(this, context);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setOutlineWidth(float f) {
        aI().f66282c = f;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    /* renamed from: a */
    public void mo33939a(LynxBaseUI lynxBaseUI) {
        LynxBaseUI lynxBaseUI2 = this.f66275a;
        if (lynxBaseUI2 instanceof UIGroup) {
            ((UIGroup) lynxBaseUI2).mo33939a(lynxBaseUI);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    /* renamed from: b */
    public void mo53261b(LynxBaseUI lynxBaseUI) {
        LynxBaseUI lynxBaseUI2 = this.f66275a;
        if (lynxBaseUI2 instanceof UIGroup) {
            ((UIGroup) lynxBaseUI2).mo53261b(lynxBaseUI);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setOutlineColor(int i) {
        aI().f66281b = Integer.valueOf(i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setBoxShadow(ReadableArray readableArray) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f66277c = C26748b.m97118a(readableArray);
            aJ();
        }
    }

    /* renamed from: com.lynx.tasm.behavior.ui.UIShadowProxy$a */
    public static class C26743a {

        /* renamed from: a */
        public BorderStyle f66280a = BorderStyle.NONE;

        /* renamed from: b */
        public Integer f66281b = -16777216;

        /* renamed from: c */
        public float f66282c;

        /* renamed from: d */
        public Rect f66283d;

        /* renamed from: e */
        private Paint f66284e;

        /* renamed from: f */
        private Path f66285f;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo95142a(Canvas canvas) {
            Rect rect;
            BorderStyle borderStyle = this.f66280a;
            if (borderStyle != null && !borderStyle.equals(BorderStyle.NONE) && !this.f66280a.equals(BorderStyle.HIDDEN) && ((double) this.f66282c) >= 0.001d && (rect = this.f66283d) != null && rect.width() >= 1 && this.f66283d.height() >= 1) {
                int save = canvas.save();
                m97099b(canvas);
                canvas.restoreToCount(save);
            }
        }

        /* renamed from: b */
        private void m97099b(Canvas canvas) {
            int i;
            int i2;
            Rect rect = this.f66283d;
            int i3 = rect.left;
            int i4 = rect.top;
            int width = rect.width();
            int height = rect.height();
            float f = this.f66282c;
            if (f < 1.0f) {
                i = 1;
            } else {
                i = Math.round(f);
            }
            Paint paint = new Paint();
            this.f66284e = paint;
            paint.setAntiAlias(false);
            this.f66284e.setStyle(Paint.Style.STROKE);
            Integer num = this.f66281b;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = -16777216;
            }
            float f2 = (float) i3;
            float f3 = (float) i4;
            float f4 = (float) (i3 - i);
            float f5 = (float) (i4 - i);
            int i5 = i3 + width;
            float f6 = (float) (i5 + i);
            float f7 = (float) i5;
            float f8 = (float) i;
            float f9 = f8 * 0.5f;
            float f10 = f3 - f9;
            canvas.save();
            m97098a(canvas, f2, f3, f4, f5, f6, f5, f7, f3);
            int i6 = i * 2;
            float f11 = (float) (width + i6);
            this.f66280a.strokeBorderLine(canvas, this.f66284e, 1, this.f66282c, i2, f4, f10, f6, f10, f11, f8);
            canvas.restore();
            int i7 = i4 + height;
            float f12 = (float) i7;
            float f13 = (float) (i7 + i);
            float f14 = f7 + f9;
            canvas.save();
            m97098a(canvas, f7, f3, f7, f12, f6, f13, f6, f5);
            float f15 = (float) (height + i6);
            this.f66280a.strokeBorderLine(canvas, this.f66284e, 2, this.f66282c, i2, f14, f5, f14, f13, f15, f8);
            canvas.restore();
            float f16 = f12 + f9;
            canvas.save();
            m97098a(canvas, f2, f12, f7, f12, f6, f13, f4, f13);
            this.f66280a.strokeBorderLine(canvas, this.f66284e, 3, this.f66282c, i2, f6, f16, f4, f16, f11, f8);
            canvas.restore();
            float f17 = f2 - f9;
            canvas.save();
            m97098a(canvas, f2, f3, f4, f5, f4, f13, f2, f12);
            this.f66280a.strokeBorderLine(canvas, this.f66284e, 0, this.f66282c, i2, f17, f13, f17, f5, f15, f8);
            canvas.restore();
            this.f66284e.setAntiAlias(true);
        }

        /* renamed from: a */
        private void m97098a(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            if (this.f66285f == null) {
                this.f66285f = new Path();
            }
            this.f66285f.reset();
            this.f66285f.moveTo(f, f2);
            this.f66285f.lineTo(f3, f4);
            this.f66285f.lineTo(f5, f6);
            this.f66285f.lineTo(f7, f8);
            this.f66285f.lineTo(f, f2);
            canvas.clipPath(this.f66285f);
        }
    }

    /* renamed from: a */
    public void mo95140a(BorderStyle borderStyle) {
        aI().f66280a = borderStyle;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo94958a(Object obj) {
        this.f66275a.mo94958a(obj);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo94961a(float[] fArr) {
        this.f66275a.mo94961a(fArr);
        mo95041w();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    /* renamed from: a */
    public void mo33940a(LynxBaseUI lynxBaseUI, int i) {
        LynxBaseUI lynxBaseUI2 = this.f66275a;
        if (lynxBaseUI2 instanceof UIGroup) {
            ((UIGroup) lynxBaseUI2).mo33940a(lynxBaseUI, i);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: b */
    public void mo53262b(LynxBaseUI lynxBaseUI, int i) {
        LynxBaseUI lynxBaseUI2 = this.f66275a;
        if (lynxBaseUI2 instanceof UIGroup) {
            ((UIGroup) lynxBaseUI2).mo53262b(lynxBaseUI, i);
        }
    }

    public UIShadowProxy(AbstractC26684l lVar, LynxBaseUI lynxBaseUI) {
        super(lVar);
        this.f66207M = 3;
        this.f66275a = lynxBaseUI;
        lynxBaseUI.mo94956a((AbstractC26757c) this);
        mo94950a(lynxBaseUI.mo94576q(), lynxBaseUI.mo94919B());
        mo95044z();
        if (this.f66239t.mo94671a()) {
            super.mo53262b(this.f66275a, 0);
        } else {
            super.mo33940a(this.f66275a, 0);
        }
        mo53305i();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: b */
    public boolean mo94992b(int i, int i2) {
        boolean b = this.f66275a.mo94992b(i, i2);
        if (b) {
            mo95041w();
        }
        return b;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53590a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        this.f66275a.mo53590a(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }
}
