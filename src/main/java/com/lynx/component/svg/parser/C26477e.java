package com.lynx.component.svg.parser;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.bytedance.ee.bear.attachment.filereader.FileReaderUtil;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.component.svg.C26428c;
import com.lynx.component.svg.parser.PreserveAspectRatio;
import com.lynx.component.svg.parser.SVG;
import com.lynx.tasm.base.LLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Stack;

/* access modifiers changed from: package-private */
/* renamed from: com.lynx.component.svg.parser.e */
public class C26477e {

    /* renamed from: a */
    private Canvas f65435a;

    /* renamed from: b */
    private float f65436b;

    /* renamed from: c */
    private float f65437c;

    /* renamed from: d */
    private C26428c f65438d;

    /* renamed from: e */
    private SVG f65439e;

    /* renamed from: f */
    private C26481b f65440f;

    /* renamed from: g */
    private Stack<C26481b> f65441g;

    /* renamed from: h */
    private Stack<SVG.AbstractC26441ad> f65442h;

    /* renamed from: i */
    private Stack<Matrix> f65443i;

    /* renamed from: a */
    private static int m95836a(float f) {
        int i = (int) (f * 256.0f);
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.lynx.component.svg.parser.e$a */
    public static class C26480a implements SVG.AbstractC26466u {

        /* renamed from: a */
        Path f65450a = new Path();

        /* renamed from: b */
        float f65451b;

        /* renamed from: c */
        float f65452c;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Path mo93867a() {
            return this.f65450a;
        }

        @Override // com.lynx.component.svg.parser.SVG.AbstractC26466u
        /* renamed from: b */
        public void mo93851b() {
            this.f65450a.close();
        }

        C26480a(SVG.C26465t tVar) {
            if (tVar != null) {
                tVar.mo93849a(this);
            }
        }

        @Override // com.lynx.component.svg.parser.SVG.AbstractC26466u
        /* renamed from: a */
        public void mo93845a(float f, float f2) {
            this.f65450a.moveTo(f, f2);
            this.f65451b = f;
            this.f65452c = f2;
        }

        @Override // com.lynx.component.svg.parser.SVG.AbstractC26466u
        /* renamed from: b */
        public void mo93852b(float f, float f2) {
            this.f65450a.lineTo(f, f2);
            this.f65451b = f;
            this.f65452c = f2;
        }

        @Override // com.lynx.component.svg.parser.SVG.AbstractC26466u
        /* renamed from: a */
        public void mo93846a(float f, float f2, float f3, float f4) {
            this.f65450a.quadTo(f, f2, f3, f4);
            this.f65451b = f3;
            this.f65452c = f4;
        }

        @Override // com.lynx.component.svg.parser.SVG.AbstractC26466u
        /* renamed from: a */
        public void mo93847a(float f, float f2, float f3, float f4, float f5, float f6) {
            this.f65450a.cubicTo(f, f2, f3, f4, f5, f6);
            this.f65451b = f5;
            this.f65452c = f6;
        }

        @Override // com.lynx.component.svg.parser.SVG.AbstractC26466u
        /* renamed from: a */
        public void mo93848a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            C26477e.m95844a(this.f65451b, this.f65452c, f, f2, f3, z, z2, f4, f5, this);
            this.f65451b = f4;
            this.f65452c = f5;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo93864c() {
        return this.f65437c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo93860a() {
        return this.f65436b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo93863b() {
        return this.f65440f.f65456d.getTextSize();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo93862a(SVG svg, C26476d dVar) {
        Objects.requireNonNull(dVar, "renderOptions shouldn't be null");
        this.f65439e = svg;
        SVG.C26439ab a = svg.mo93818a();
        if (a == null) {
            m95877a("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        SVG.C26437a aVar = a.f65361r;
        PreserveAspectRatio preserveAspectRatio = a.f65355q;
        m95900f();
        m95892b((SVG.C26445ah) a);
        m95901g();
        m95848a(a, new SVG.C26437a(dVar.f65433b), aVar, preserveAspectRatio);
        m95902h();
    }

    /* renamed from: a */
    private void m95856a(SVG.C26445ah ahVar) {
        if (!(ahVar instanceof SVG.AbstractC26462q)) {
            m95901g();
            m95892b(ahVar);
            if (ahVar instanceof SVG.C26439ab) {
                m95846a((SVG.C26439ab) ahVar);
            } else if (ahVar instanceof SVG.an) {
                m95859a((SVG.an) ahVar);
            } else if (ahVar instanceof SVG.C26457l) {
                m95865a((SVG.C26457l) ahVar);
            } else if (ahVar instanceof SVG.C26459n) {
                m95866a((SVG.C26459n) ahVar);
            } else if (ahVar instanceof SVG.C26464s) {
                m95868a((SVG.C26464s) ahVar);
            } else if (ahVar instanceof SVG.C26470y) {
                m95873a((SVG.C26470y) ahVar);
            } else if (ahVar instanceof SVG.C26448c) {
                m95861a((SVG.C26448c) ahVar);
            } else if (ahVar instanceof SVG.C26453h) {
                m95862a((SVG.C26453h) ahVar);
            } else if (ahVar instanceof SVG.C26461p) {
                m95867a((SVG.C26461p) ahVar);
            } else if (ahVar instanceof SVG.C26469x) {
                m95872a((SVG.C26469x) ahVar);
            } else if (ahVar instanceof SVG.C26468w) {
                m95871a((SVG.C26468w) ahVar);
            }
            m95902h();
        }
    }

    /* renamed from: a */
    private void m95850a(SVG.AbstractC26441ad adVar, boolean z) {
        if (z) {
            m95849a(adVar);
        }
        for (SVG.C26445ah ahVar : adVar.mo93831b()) {
            m95856a(ahVar);
        }
        if (z) {
            m95903i();
        }
    }

    /* renamed from: a */
    private void m95849a(SVG.AbstractC26441ad adVar) {
        this.f65442h.push(adVar);
        this.f65443i.push(this.f65435a.getMatrix());
    }

    /* renamed from: a */
    private void m95875a(C26481b bVar, SVG.AbstractC26443af afVar) {
        bVar.f65453a.mo93823a(afVar.f65354p == null);
        if (afVar.f65347m != null) {
            m95874a(bVar, afVar.f65347m);
        }
        if (afVar.f65348n != null) {
            m95874a(bVar, afVar.f65348n);
        }
    }

    /* renamed from: b */
    private void m95892b(SVG.C26445ah ahVar) {
        if (ahVar instanceof SVG.AbstractC26443af) {
            SVG.AbstractC26443af afVar = (SVG.AbstractC26443af) ahVar;
            if (afVar.f65346l != null) {
                this.f65440f.f65460h = afVar.f65346l.booleanValue();
            }
        }
    }

    /* renamed from: a */
    private void m95852a(SVG.AbstractC26442ae aeVar, Path path) {
        if (this.f65440f.f65453a.f65308b instanceof SVG.C26463r) {
            SVG.C26445ah b = this.f65439e.mo93821b(((SVG.C26463r) this.f65440f.f65453a.f65308b).f65404a);
            if (b instanceof SVG.C26467v) {
                m95853a(aeVar, path, (SVG.C26467v) b);
                return;
            }
        }
        this.f65435a.drawPath(path, this.f65440f.f65456d);
    }

    /* renamed from: a */
    private void m95845a(Path path) {
        if (this.f65440f.f65453a.f65305A == SVG.Style.VectorEffect.NonScalingStroke) {
            Matrix matrix = this.f65435a.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            this.f65435a.setMatrix(new Matrix());
            Shader shader = this.f65440f.f65457e.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            this.f65435a.drawPath(path2, this.f65440f.f65457e);
            this.f65435a.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        this.f65435a.drawPath(path, this.f65440f.f65457e);
    }

    /* renamed from: a */
    private static void m95877a(String str, Object... objArr) {
        LLog.m96427d("SVGAndroidRenderer", String.format(str, objArr));
    }

    /* renamed from: a */
    private void m95846a(SVG.C26439ab abVar) {
        m95848a(abVar, m95841a(abVar.f65338a, abVar.f65339b, abVar.f65340c, abVar.f65341d), abVar.f65361r, abVar.f65355q);
    }

    /* renamed from: a */
    private void m95848a(SVG.C26439ab abVar, SVG.C26437a aVar, SVG.C26437a aVar2, PreserveAspectRatio preserveAspectRatio) {
        m95897c("Svg render", new Object[0]);
        if (aVar.f65335c != BitmapDescriptorFactory.HUE_RED && aVar.f65336d != BitmapDescriptorFactory.HUE_RED) {
            if (preserveAspectRatio == null) {
                preserveAspectRatio = abVar.f65355q != null ? abVar.f65355q : new PreserveAspectRatio(PreserveAspectRatio.Alignment.none, PreserveAspectRatio.Scale.meet);
            }
            m95875a(this.f65440f, abVar);
            if (m95906l()) {
                this.f65440f.f65458f = aVar;
                if (!this.f65440f.f65453a.f65321o.booleanValue()) {
                    m95843a(this.f65440f.f65458f.f65333a, this.f65440f.f65458f.f65334b, this.f65440f.f65458f.f65335c, this.f65440f.f65458f.f65336d);
                }
                m95891b(abVar, this.f65440f.f65458f);
                if (aVar2 != null) {
                    this.f65435a.concat(m95839a(this.f65440f.f65458f, aVar2, preserveAspectRatio));
                    this.f65440f.f65459g = abVar.f65361r;
                } else {
                    this.f65435a.translate(this.f65440f.f65458f.f65333a, this.f65440f.f65458f.f65334b);
                }
                boolean j = m95904j();
                m95909o();
                m95850a((SVG.AbstractC26441ad) abVar, true);
                if (j) {
                    m95890b((SVG.AbstractC26442ae) abVar);
                }
                m95851a((SVG.AbstractC26442ae) abVar);
            }
        }
    }

    /* renamed from: a */
    private void m95865a(SVG.C26457l lVar) {
        m95897c(lVar.mo93829a() + " render", new Object[0]);
        m95875a(this.f65440f, lVar);
        if (m95906l()) {
            if (lVar.f65391b != null) {
                this.f65435a.concat(lVar.f65391b);
            }
            m95898d(lVar);
            boolean j = m95904j();
            m95850a((SVG.AbstractC26441ad) lVar, true);
            if (j) {
                m95890b((SVG.AbstractC26442ae) lVar);
            }
            m95851a((SVG.AbstractC26442ae) lVar);
        }
    }

    /* renamed from: a */
    private void m95851a(SVG.AbstractC26442ae aeVar) {
        if (aeVar.f65354p != null && aeVar.f65344j != null) {
            Matrix matrix = new Matrix();
            if (this.f65443i.peek().invert(matrix)) {
                float[] fArr = {aeVar.f65344j.f65333a, aeVar.f65344j.f65334b, aeVar.f65344j.mo93825a(), aeVar.f65344j.f65334b, aeVar.f65344j.mo93825a(), aeVar.f65344j.mo93827b(), aeVar.f65344j.f65333a, aeVar.f65344j.mo93827b()};
                matrix.preConcat(this.f65435a.getMatrix());
                matrix.mapPoints(fArr);
                RectF rectF = new RectF(fArr[0], fArr[1], fArr[0], fArr[1]);
                for (int i = 2; i <= 6; i += 2) {
                    if (fArr[i] < rectF.left) {
                        rectF.left = fArr[i];
                    }
                    if (fArr[i] > rectF.right) {
                        rectF.right = fArr[i];
                    }
                    int i2 = i + 1;
                    if (fArr[i2] < rectF.top) {
                        rectF.top = fArr[i2];
                    }
                    if (fArr[i2] > rectF.bottom) {
                        rectF.bottom = fArr[i2];
                    }
                }
                SVG.AbstractC26442ae aeVar2 = (SVG.AbstractC26442ae) this.f65442h.peek();
                if (aeVar2.f65344j == null) {
                    aeVar2.f65344j = SVG.C26437a.m95762a(rectF.left, rectF.top, rectF.right, rectF.bottom);
                } else {
                    aeVar2.f65344j.mo93826a(SVG.C26437a.m95762a(rectF.left, rectF.top, rectF.right, rectF.bottom));
                }
            }
        }
    }

    /* renamed from: a */
    private void m95859a(SVG.an anVar) {
        m95897c("Use render", new Object[0]);
        if (anVar.f65366e != null && anVar.f65366e.mo93840b()) {
            return;
        }
        if (anVar.f65367f == null || !anVar.f65367f.mo93840b()) {
            m95875a(this.f65440f, anVar);
            if (m95906l()) {
                SVG.C26445ah b = anVar.f65353o.mo93821b(anVar.f65363a);
                if (b == null) {
                    m95893b("Use reference '%s' not found", anVar.f65363a);
                    return;
                }
                if (anVar.f65391b != null) {
                    this.f65435a.concat(anVar.f65391b);
                }
                SVG.C26460o oVar = anVar.f65364c;
                float f = BitmapDescriptorFactory.HUE_RED;
                float a = oVar != null ? anVar.f65364c.mo93837a(this) : BitmapDescriptorFactory.HUE_RED;
                if (anVar.f65365d != null) {
                    f = anVar.f65365d.mo93839b(this);
                }
                this.f65435a.translate(a, f);
                m95898d(anVar);
                boolean j = m95904j();
                m95849a((SVG.AbstractC26441ad) anVar);
                if (b instanceof SVG.C26439ab) {
                    SVG.C26437a a2 = m95841a((SVG.C26460o) null, (SVG.C26460o) null, anVar.f65366e, anVar.f65367f);
                    m95901g();
                    m95847a((SVG.C26439ab) b, a2);
                    m95902h();
                } else {
                    m95856a(b);
                }
                m95903i();
                if (j) {
                    m95890b((SVG.AbstractC26442ae) anVar);
                }
                m95851a((SVG.AbstractC26442ae) anVar);
            }
        }
    }

    /* renamed from: a */
    private void m95868a(SVG.C26464s sVar) {
        m95897c("Path render", new Object[0]);
        if (sVar.f65406a != null) {
            m95875a(this.f65440f, sVar);
            if (!m95906l() || !m95907m()) {
                return;
            }
            if (this.f65440f.f65455c || this.f65440f.f65454b) {
                if (sVar.f65390e != null) {
                    this.f65435a.concat(sVar.f65390e);
                }
                Path a = new C26480a(sVar.f65406a).mo93867a();
                if (sVar.f65344j == null) {
                    sVar.f65344j = m95889b(a);
                }
                m95851a((SVG.AbstractC26442ae) sVar);
                m95896c((SVG.AbstractC26442ae) sVar);
                m95898d(sVar);
                boolean j = m95904j();
                if (this.f65440f.f65454b) {
                    a.setFillType(m95908n());
                    m95852a(sVar, a);
                }
                if (this.f65440f.f65455c) {
                    m95845a(a);
                }
                if (j) {
                    m95890b((SVG.AbstractC26442ae) sVar);
                }
            }
        }
    }

    /* renamed from: a */
    private void m95873a(SVG.C26470y yVar) {
        m95897c("Rect render", new Object[0]);
        if (yVar.f65423c != null && yVar.f65424d != null && !yVar.f65423c.mo93840b() && !yVar.f65424d.mo93840b()) {
            m95875a(this.f65440f, yVar);
            if (m95906l() && m95907m()) {
                if (yVar.f65390e != null) {
                    this.f65435a.concat(yVar.f65390e);
                }
                Path b = m95888b(yVar);
                m95851a((SVG.AbstractC26442ae) yVar);
                m95896c((SVG.AbstractC26442ae) yVar);
                m95898d(yVar);
                boolean j = m95904j();
                if (this.f65440f.f65454b) {
                    m95852a(yVar, b);
                }
                if (this.f65440f.f65455c) {
                    m95845a(b);
                }
                if (j) {
                    m95890b((SVG.AbstractC26442ae) yVar);
                }
            }
        }
    }

    /* renamed from: a */
    private void m95861a(SVG.C26448c cVar) {
        m95897c("Circle render", new Object[0]);
        if (cVar.f65374c != null && !cVar.f65374c.mo93840b()) {
            m95875a(this.f65440f, cVar);
            if (m95906l() && m95907m()) {
                if (cVar.f65390e != null) {
                    this.f65435a.concat(cVar.f65390e);
                }
                Path b = m95884b(cVar);
                m95851a((SVG.AbstractC26442ae) cVar);
                m95896c((SVG.AbstractC26442ae) cVar);
                m95898d(cVar);
                boolean j = m95904j();
                if (this.f65440f.f65454b) {
                    m95852a(cVar, b);
                }
                if (this.f65440f.f65455c) {
                    m95845a(b);
                }
                if (j) {
                    m95890b((SVG.AbstractC26442ae) cVar);
                }
            }
        }
    }

    /* renamed from: a */
    private void m95862a(SVG.C26453h hVar) {
        m95897c("Ellipse render", new Object[0]);
        if (hVar.f65382c != null && hVar.f65383d != null && !hVar.f65382c.mo93840b() && !hVar.f65383d.mo93840b()) {
            m95875a(this.f65440f, hVar);
            if (m95906l() && m95907m()) {
                if (hVar.f65390e != null) {
                    this.f65435a.concat(hVar.f65390e);
                }
                Path b = m95885b(hVar);
                m95851a((SVG.AbstractC26442ae) hVar);
                m95896c((SVG.AbstractC26442ae) hVar);
                m95898d(hVar);
                boolean j = m95904j();
                if (this.f65440f.f65454b) {
                    m95852a(hVar, b);
                }
                if (this.f65440f.f65455c) {
                    m95845a(b);
                }
                if (j) {
                    m95890b((SVG.AbstractC26442ae) hVar);
                }
            }
        }
    }

    /* renamed from: a */
    private void m95867a(SVG.C26461p pVar) {
        m95897c("Line render", new Object[0]);
        m95875a(this.f65440f, pVar);
        if (m95906l() && m95907m() && this.f65440f.f65455c) {
            if (pVar.f65390e != null) {
                this.f65435a.concat(pVar.f65390e);
            }
            Path b = m95886b(pVar);
            m95851a((SVG.AbstractC26442ae) pVar);
            m95896c((SVG.AbstractC26442ae) pVar);
            m95898d(pVar);
            boolean j = m95904j();
            m95845a(b);
            if (j) {
                m95890b((SVG.AbstractC26442ae) pVar);
            }
        }
    }

    /* renamed from: a */
    private void m95871a(SVG.C26468w wVar) {
        m95897c("PolyLine render", new Object[0]);
        m95875a(this.f65440f, wVar);
        if (!m95906l() || !m95907m()) {
            return;
        }
        if (this.f65440f.f65455c || this.f65440f.f65454b) {
            if (wVar.f65390e != null) {
                this.f65435a.concat(wVar.f65390e);
            }
            if (wVar.f65420a.length >= 2) {
                Path b = m95887b(wVar);
                m95851a((SVG.AbstractC26442ae) wVar);
                b.setFillType(m95908n());
                m95896c((SVG.AbstractC26442ae) wVar);
                m95898d(wVar);
                boolean j = m95904j();
                if (this.f65440f.f65454b) {
                    m95852a(wVar, b);
                }
                if (this.f65440f.f65455c) {
                    m95845a(b);
                }
                if (j) {
                    m95890b((SVG.AbstractC26442ae) wVar);
                }
            }
        }
    }

    /* renamed from: a */
    private void m95872a(SVG.C26469x xVar) {
        m95897c("Polygon render", new Object[0]);
        m95875a(this.f65440f, xVar);
        if (!m95906l() || !m95907m()) {
            return;
        }
        if (this.f65440f.f65455c || this.f65440f.f65454b) {
            if (xVar.f65390e != null) {
                this.f65435a.concat(xVar.f65390e);
            }
            if (xVar.f65420a.length >= 2) {
                Path b = m95887b((SVG.C26468w) xVar);
                m95851a((SVG.AbstractC26442ae) xVar);
                m95896c((SVG.AbstractC26442ae) xVar);
                m95898d(xVar);
                boolean j = m95904j();
                if (this.f65440f.f65454b) {
                    m95852a(xVar, b);
                }
                if (this.f65440f.f65455c) {
                    m95845a(b);
                }
                if (j) {
                    m95890b((SVG.AbstractC26442ae) xVar);
                }
            }
        }
    }

    /* renamed from: a */
    private void m95866a(final SVG.C26459n nVar) {
        m95897c("Image render", new Object[0]);
        if (nVar.f65395d != null && !nVar.f65395d.mo93840b() && nVar.f65396e != null && !nVar.f65396e.mo93840b() && nVar.f65392a != null) {
            final PreserveAspectRatio preserveAspectRatio = nVar.f65355q != null ? nVar.f65355q : PreserveAspectRatio.f65290c;
            Bitmap a = m95838a(nVar.f65392a);
            if (a == null) {
                this.f65438d.mo93807a(nVar.f65392a, new C26428c.AbstractC26432a() {
                    /* class com.lynx.component.svg.parser.C26477e.C264781 */

                    @Override // com.lynx.component.svg.C26428c.AbstractC26432a
                    /* renamed from: a */
                    public void mo93810a() {
                    }
                });
            } else {
                mo93861a(nVar, preserveAspectRatio, a);
            }
        }
    }

    /* renamed from: a */
    public void mo93861a(SVG.C26459n nVar, PreserveAspectRatio preserveAspectRatio, Bitmap bitmap) {
        int i = 0;
        if (bitmap == null) {
            m95893b("Could not locate image '%s'", nVar.f65392a);
            return;
        }
        SVG.C26437a aVar = new SVG.C26437a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        m95875a(this.f65440f, nVar);
        if (m95906l() && m95907m()) {
            if (nVar.f65397f != null) {
                this.f65435a.concat(nVar.f65397f);
            }
            this.f65440f.f65458f = new SVG.C26437a(nVar.f65393b != null ? nVar.f65393b.mo93837a(this) : BitmapDescriptorFactory.HUE_RED, nVar.f65394c != null ? nVar.f65394c.mo93839b(this) : BitmapDescriptorFactory.HUE_RED, nVar.f65395d.mo93837a(this), nVar.f65396e.mo93837a(this));
            if (!this.f65440f.f65453a.f65321o.booleanValue()) {
                m95843a(this.f65440f.f65458f.f65333a, this.f65440f.f65458f.f65334b, this.f65440f.f65458f.f65335c, this.f65440f.f65458f.f65336d);
            }
            nVar.f65344j = this.f65440f.f65458f;
            m95851a((SVG.AbstractC26442ae) nVar);
            m95898d(nVar);
            boolean j = m95904j();
            m95909o();
            this.f65435a.save();
            this.f65435a.concat(m95839a(this.f65440f.f65458f, aVar, preserveAspectRatio));
            if (this.f65440f.f65453a.f65306B != SVG.Style.RenderQuality.optimizeSpeed) {
                i = 2;
            }
            this.f65435a.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new Paint(i));
            this.f65435a.restore();
            if (j) {
                m95890b((SVG.AbstractC26442ae) nVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m95882a(SVG.Style style, long j) {
        return (style.f65307a & j) != 0;
    }

    /* renamed from: a */
    private void m95874a(C26481b bVar, SVG.Style style) {
        if (m95882a(style, 4096)) {
            bVar.f65453a.f65320n = style.f65320n;
        }
        if (m95882a(style, 2048)) {
            bVar.f65453a.f65319m = style.f65319m;
        }
        if (m95882a(style, 1)) {
            bVar.f65453a.f65308b = style.f65308b;
            bVar.f65454b = (style.f65308b == null || style.f65308b == SVG.C26450e.f65377c) ? false : true;
        }
        if (m95882a(style, 4)) {
            bVar.f65453a.f65310d = style.f65310d;
        }
        if (m95882a(style, 6149)) {
            m95876a(bVar, true, bVar.f65453a.f65308b);
        }
        if (m95882a(style, 2)) {
            bVar.f65453a.f65309c = style.f65309c;
        }
        if (m95882a(style, 8)) {
            bVar.f65453a.f65311e = style.f65311e;
            bVar.f65455c = (style.f65311e == null || style.f65311e == SVG.C26450e.f65377c) ? false : true;
        }
        if (m95882a(style, 16)) {
            bVar.f65453a.f65312f = style.f65312f;
        }
        if (m95882a(style, 6168)) {
            m95876a(bVar, false, bVar.f65453a.f65311e);
        }
        if (m95882a(style, 34359738368L)) {
            bVar.f65453a.f65305A = style.f65305A;
        }
        if (m95882a(style, 32)) {
            bVar.f65453a.f65313g = style.f65313g;
            bVar.f65457e.setStrokeWidth(bVar.f65453a.f65313g.mo93841c(this));
        }
        if (m95882a(style, 64)) {
            bVar.f65453a.f65314h = style.f65314h;
            int i = C264792.f65448b[style.f65314h.ordinal()];
            if (i == 1) {
                bVar.f65457e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i == 2) {
                bVar.f65457e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i == 3) {
                bVar.f65457e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (m95882a(style, 128)) {
            bVar.f65453a.f65315i = style.f65315i;
            int i2 = C264792.f65449c[style.f65315i.ordinal()];
            if (i2 == 1) {
                bVar.f65457e.setStrokeJoin(Paint.Join.MITER);
            } else if (i2 == 2) {
                bVar.f65457e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i2 == 3) {
                bVar.f65457e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (m95882a(style, 256)) {
            bVar.f65453a.f65316j = style.f65316j;
            bVar.f65457e.setStrokeMiter(style.f65316j.floatValue());
        }
        if (m95882a(style, 512)) {
            bVar.f65453a.f65317k = style.f65317k;
        }
        if (m95882a(style, 1024)) {
            bVar.f65453a.f65318l = style.f65318l;
        }
        if (m95882a(style, 1536)) {
            if (bVar.f65453a.f65317k == null) {
                bVar.f65457e.setPathEffect(null);
            } else {
                int length = bVar.f65453a.f65317k.length;
                int i3 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i3];
                float f = BitmapDescriptorFactory.HUE_RED;
                for (int i4 = 0; i4 < i3; i4++) {
                    fArr[i4] = bVar.f65453a.f65317k[i4 % length].mo93841c(this);
                    f += fArr[i4];
                }
                if (f == BitmapDescriptorFactory.HUE_RED) {
                    bVar.f65457e.setPathEffect(null);
                } else {
                    float c = bVar.f65453a.f65318l.mo93841c(this);
                    if (c < BitmapDescriptorFactory.HUE_RED) {
                        c = (c % f) + f;
                    }
                    bVar.f65457e.setPathEffect(new DashPathEffect(fArr, c));
                }
            }
        }
        if (m95882a(style, 524288)) {
            bVar.f65453a.f65321o = style.f65321o;
        }
        if (m95882a(style, 16777216)) {
            bVar.f65453a.f65323q = style.f65323q;
        }
        if (m95882a(style, 33554432)) {
            bVar.f65453a.f65324r = style.f65324r;
        }
        if (m95882a(style, 1048576)) {
            bVar.f65453a.f65322p = style.f65322p;
        }
        if (m95882a(style, 268435456)) {
            bVar.f65453a.f65327u = style.f65327u;
        }
        if (m95882a(style, 536870912)) {
            bVar.f65453a.f65328v = style.f65328v;
        }
        if (m95882a(style, 67108864)) {
            bVar.f65453a.f65325s = style.f65325s;
        }
        if (m95882a(style, 134217728)) {
            bVar.f65453a.f65326t = style.f65326t;
        }
        if (m95882a(style, 8589934592L)) {
            bVar.f65453a.f65331y = style.f65331y;
        }
        if (m95882a(style, 17179869184L)) {
            bVar.f65453a.f65332z = style.f65332z;
        }
        if (m95882a(style, 137438953472L)) {
            bVar.f65453a.f65306B = style.f65306B;
        }
    }

    /* renamed from: a */
    private void m95876a(C26481b bVar, boolean z, SVG.AbstractC26446ai aiVar) {
        int i;
        SVG.Style style = bVar.f65453a;
        float floatValue = (z ? style.f65310d : style.f65312f).floatValue();
        if (aiVar instanceof SVG.C26450e) {
            i = ((SVG.C26450e) aiVar).f65378a;
        } else if (aiVar instanceof SVG.C26451f) {
            i = bVar.f65453a.f65320n.f65378a;
        } else {
            return;
        }
        int a = m95837a(i, floatValue);
        if (z) {
            bVar.f65456d.setColor(a);
        } else {
            bVar.f65457e.setColor(a);
        }
    }

    /* renamed from: a */
    private void m95843a(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        if (this.f65440f.f65453a.f65322p != null) {
            f += this.f65440f.f65453a.f65322p.f65371d.mo93837a(this);
            f2 += this.f65440f.f65453a.f65322p.f65368a.mo93839b(this);
            f5 -= this.f65440f.f65453a.f65322p.f65369b.mo93837a(this);
            f6 -= this.f65440f.f65453a.f65322p.f65370c.mo93839b(this);
        }
        this.f65435a.clipRect(f, f2, f5, f6);
    }

    /* renamed from: a */
    public static void m95844a(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, SVG.AbstractC26466u uVar) {
        if (!(f == f6 && f2 == f7)) {
            if (f3 == BitmapDescriptorFactory.HUE_RED || f4 == BitmapDescriptorFactory.HUE_RED) {
                uVar.mo93852b(f6, f7);
                return;
            }
            float abs = Math.abs(f3);
            float abs2 = Math.abs(f4);
            double radians = Math.toRadians(((double) f5) % 360.0d);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d = ((double) (f - f6)) / 2.0d;
            double d2 = ((double) (f2 - f7)) / 2.0d;
            double d3 = (cos * d) + (sin * d2);
            double d4 = ((-sin) * d) + (d2 * cos);
            double d5 = (double) (abs * abs);
            double d6 = (double) (abs2 * abs2);
            double d7 = d3 * d3;
            double d8 = d4 * d4;
            double d9 = (d7 / d5) + (d8 / d6);
            if (d9 > 0.99999d) {
                double sqrt = Math.sqrt(d9) * 1.00001d;
                abs = (float) (((double) abs) * sqrt);
                abs2 = (float) (sqrt * ((double) abs2));
                d5 = (double) (abs * abs);
                d6 = (double) (abs2 * abs2);
            }
            double d10 = -1.0d;
            double d11 = z == z2 ? -1.0d : 1.0d;
            double d12 = d5 * d6;
            double d13 = d5 * d8;
            double d14 = d6 * d7;
            double d15 = ((d12 - d13) - d14) / (d13 + d14);
            if (d15 < 0.0d) {
                d15 = 0.0d;
            }
            double sqrt2 = d11 * Math.sqrt(d15);
            double d16 = (double) abs;
            double d17 = (double) abs2;
            double d18 = ((d16 * d4) / d17) * sqrt2;
            double d19 = sqrt2 * (-((d17 * d3) / d16));
            double d20 = (((double) (f + f6)) / 2.0d) + ((cos * d18) - (sin * d19));
            double d21 = (((double) (f2 + f7)) / 2.0d) + (sin * d18) + (cos * d19);
            double d22 = (d3 - d18) / d16;
            double d23 = (d4 - d19) / d17;
            double d24 = ((-d3) - d18) / d16;
            double d25 = ((-d4) - d19) / d17;
            double d26 = (d22 * d22) + (d23 * d23);
            double acos = (d23 < 0.0d ? -1.0d : 1.0d) * Math.acos(d22 / Math.sqrt(d26));
            double sqrt3 = Math.sqrt(d26 * ((d24 * d24) + (d25 * d25)));
            double d27 = (d22 * d24) + (d23 * d25);
            if ((d22 * d25) - (d23 * d24) >= 0.0d) {
                d10 = 1.0d;
            }
            double a = d10 * m95835a(d27 / sqrt3);
            int i = (a > 0.0d ? 1 : (a == 0.0d ? 0 : -1));
            if (i == 0) {
                uVar.mo93852b(f6, f7);
                return;
            }
            if (!z2 && i > 0) {
                a -= 6.283185307179586d;
            } else if (z2 && a < 0.0d) {
                a += 6.283185307179586d;
            }
            float[] a2 = m95883a(acos % 6.283185307179586d, a % 6.283185307179586d);
            Matrix matrix = new Matrix();
            matrix.postScale(abs, abs2);
            matrix.postRotate(f5);
            matrix.postTranslate((float) d20, (float) d21);
            matrix.mapPoints(a2);
            a2[a2.length - 2] = f6;
            a2[a2.length - 1] = f7;
            for (int i2 = 0; i2 < a2.length; i2 += 6) {
                uVar.mo93847a(a2[i2], a2[i2 + 1], a2[i2 + 2], a2[i2 + 3], a2[i2 + 4], a2[i2 + 5]);
            }
        }
    }

    /* renamed from: a */
    private static float[] m95883a(double d, double d2) {
        int ceil = (int) Math.ceil((Math.abs(d2) * 2.0d) / 3.141592653589793d);
        double d3 = d2 / ((double) ceil);
        double d4 = d3 / 2.0d;
        double sin = (Math.sin(d4) * 1.3333333333333333d) / (Math.cos(d4) + 1.0d);
        float[] fArr = new float[(ceil * 6)];
        int i = 0;
        int i2 = 0;
        while (i < ceil) {
            double d5 = d + (((double) i) * d3);
            double cos = Math.cos(d5);
            double sin2 = Math.sin(d5);
            int i3 = i2 + 1;
            fArr[i2] = (float) (cos - (sin * sin2));
            int i4 = i3 + 1;
            fArr[i3] = (float) (sin2 + (cos * sin));
            double d6 = d5 + d3;
            double cos2 = Math.cos(d6);
            double sin3 = Math.sin(d6);
            int i5 = i4 + 1;
            fArr[i4] = (float) ((sin * sin3) + cos2);
            int i6 = i5 + 1;
            fArr[i5] = (float) (sin3 - (sin * cos2));
            int i7 = i6 + 1;
            fArr[i6] = (float) cos2;
            i2 = i7 + 1;
            fArr[i7] = (float) sin3;
            i++;
            d3 = d3;
        }
        return fArr;
    }

    /* renamed from: a */
    private void m95880a(boolean z, SVG.C26437a aVar, SVG.C26463r rVar) {
        SVG.C26445ah b = this.f65439e.mo93821b(rVar.f65404a);
        if (b == null) {
            Object[] objArr = new Object[2];
            objArr[0] = z ? "Fill" : "Stroke";
            objArr[1] = rVar.f65404a;
            m95893b("%s reference '%s' not found", objArr);
            if (rVar.f65405b != null) {
                m95876a(this.f65440f, z, rVar.f65405b);
            } else if (z) {
                this.f65440f.f65454b = false;
            } else {
                this.f65440f.f65455c = false;
            }
        } else if (b instanceof SVG.C26444ag) {
            m95878a(z, aVar, (SVG.C26444ag) b);
        } else if (b instanceof SVG.ak) {
            m95879a(z, aVar, (SVG.ak) b);
        } else if (b instanceof SVG.C26471z) {
            m95881a(z, (SVG.C26471z) b);
        }
    }

    /* renamed from: a */
    private void m95878a(boolean z, SVG.C26437a aVar, SVG.C26444ag agVar) {
        float f;
        float f2;
        float f3;
        float f4;
        if (agVar.f65388e != null) {
            m95863a(agVar, agVar.f65388e);
        }
        int i = 0;
        boolean z2 = agVar.f65385b != null && agVar.f65385b.booleanValue();
        C26481b bVar = this.f65440f;
        Paint paint = z ? bVar.f65456d : bVar.f65457e;
        if (z2) {
            SVG.C26437a e = mo93866e();
            float a = agVar.f65349f != null ? agVar.f65349f.mo93837a(this) : BitmapDescriptorFactory.HUE_RED;
            float b = agVar.f65350g != null ? agVar.f65350g.mo93839b(this) : BitmapDescriptorFactory.HUE_RED;
            f2 = agVar.f65351h != null ? agVar.f65351h.mo93837a(this) : e.f65335c;
            f4 = a;
            f3 = b;
            f = agVar.f65352i != null ? agVar.f65352i.mo93839b(this) : BitmapDescriptorFactory.HUE_RED;
        } else {
            float a2 = agVar.f65349f != null ? agVar.f65349f.mo93838a(this, 1.0f) : BitmapDescriptorFactory.HUE_RED;
            float a3 = agVar.f65350g != null ? agVar.f65350g.mo93838a(this, 1.0f) : BitmapDescriptorFactory.HUE_RED;
            float a4 = agVar.f65351h != null ? agVar.f65351h.mo93838a(this, 1.0f) : 1.0f;
            f4 = a2;
            f = agVar.f65352i != null ? agVar.f65352i.mo93838a(this, 1.0f) : BitmapDescriptorFactory.HUE_RED;
            f3 = a3;
            f2 = a4;
        }
        m95901g();
        this.f65440f = m95895c(agVar);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(aVar.f65333a, aVar.f65334b);
            matrix.preScale(aVar.f65335c, aVar.f65336d);
        }
        if (agVar.f65386c != null) {
            matrix.preConcat(agVar.f65386c);
        }
        int size = agVar.f65384a.size();
        if (size == 0) {
            m95902h();
            if (z) {
                this.f65440f.f65454b = false;
            } else {
                this.f65440f.f65455c = false;
            }
        } else {
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            float f5 = -1.0f;
            for (SVG.C26445ah ahVar : agVar.f65384a) {
                SVG.C26438aa aaVar = (SVG.C26438aa) ahVar;
                float floatValue = aaVar.f65337a != null ? aaVar.f65337a.floatValue() : BitmapDescriptorFactory.HUE_RED;
                if (i == 0 || floatValue >= f5) {
                    fArr[i] = floatValue;
                    f5 = floatValue;
                } else {
                    fArr[i] = f5;
                }
                m95901g();
                m95875a(this.f65440f, aaVar);
                SVG.C26450e eVar = (SVG.C26450e) this.f65440f.f65453a.f65325s;
                if (eVar == null) {
                    eVar = SVG.C26450e.f65376b;
                }
                iArr[i] = m95837a(eVar.f65378a, this.f65440f.f65453a.f65326t.floatValue());
                i++;
                m95902h();
            }
            if ((f4 == f2 && f3 == f) || size == 1) {
                m95902h();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            if (agVar.f65387d != null) {
                if (agVar.f65387d == SVG.EnumC26455j.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (agVar.f65387d == SVG.EnumC26455j.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            m95902h();
            LinearGradient linearGradient = new LinearGradient(f4, f3, f2, f, iArr, fArr, tileMode);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            paint.setAlpha(m95836a(this.f65440f.f65453a.f65310d.floatValue()));
        }
    }

    /* renamed from: a */
    private void m95879a(boolean z, SVG.C26437a aVar, SVG.ak akVar) {
        float f;
        float f2;
        float f3;
        if (akVar.f65388e != null) {
            m95863a(akVar, akVar.f65388e);
        }
        int i = 0;
        boolean z2 = akVar.f65385b != null && akVar.f65385b.booleanValue();
        C26481b bVar = this.f65440f;
        Paint paint = z ? bVar.f65456d : bVar.f65457e;
        if (z2) {
            SVG.C26460o oVar = new SVG.C26460o(50.0f, SVG.am.percent);
            float a = akVar.f65356f != null ? akVar.f65356f.mo93837a(this) : oVar.mo93837a(this);
            float b = akVar.f65357g != null ? akVar.f65357g.mo93839b(this) : oVar.mo93839b(this);
            if (akVar.f65358h != null) {
                oVar = akVar.f65358h;
            }
            f = oVar.mo93841c(this);
            f3 = a;
            f2 = b;
        } else {
            float a2 = akVar.f65356f != null ? akVar.f65356f.mo93838a(this, 1.0f) : 0.5f;
            float a3 = akVar.f65357g != null ? akVar.f65357g.mo93838a(this, 1.0f) : 0.5f;
            f3 = a2;
            f = akVar.f65358h != null ? akVar.f65358h.mo93838a(this, 1.0f) : 0.5f;
            f2 = a3;
        }
        m95901g();
        this.f65440f = m95895c(akVar);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(aVar.f65333a, aVar.f65334b);
            matrix.preScale(aVar.f65335c, aVar.f65336d);
        }
        if (akVar.f65386c != null) {
            matrix.preConcat(akVar.f65386c);
        }
        int size = akVar.f65384a.size();
        if (size == 0) {
            m95902h();
            if (z) {
                this.f65440f.f65454b = false;
            } else {
                this.f65440f.f65455c = false;
            }
        } else {
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            float f4 = -1.0f;
            Iterator it = akVar.f65384a.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                float f5 = BitmapDescriptorFactory.HUE_RED;
                if (!hasNext) {
                    break;
                }
                SVG.C26438aa aaVar = (SVG.C26438aa) ((SVG.C26445ah) it.next());
                if (aaVar.f65337a != null) {
                    f5 = aaVar.f65337a.floatValue();
                }
                if (i == 0 || f5 >= f4) {
                    fArr[i] = f5;
                    f4 = f5;
                } else {
                    fArr[i] = f4;
                }
                m95901g();
                m95875a(this.f65440f, aaVar);
                SVG.C26450e eVar = (SVG.C26450e) this.f65440f.f65453a.f65325s;
                if (eVar == null) {
                    eVar = SVG.C26450e.f65376b;
                }
                iArr[i] = m95837a(eVar.f65378a, this.f65440f.f65453a.f65326t.floatValue());
                i++;
                m95902h();
            }
            if (f == BitmapDescriptorFactory.HUE_RED || size == 1) {
                m95902h();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            if (akVar.f65387d != null) {
                if (akVar.f65387d == SVG.EnumC26455j.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (akVar.f65387d == SVG.EnumC26455j.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            m95902h();
            RadialGradient radialGradient = new RadialGradient(f3, f2, f, iArr, fArr, tileMode);
            radialGradient.setLocalMatrix(matrix);
            paint.setShader(radialGradient);
            paint.setAlpha(m95836a(this.f65440f.f65453a.f65310d.floatValue()));
        }
    }

    /* renamed from: a */
    private void m95863a(SVG.AbstractC26454i iVar, String str) {
        SVG.C26445ah b = iVar.f65353o.mo93821b(str);
        if (b == null) {
            m95877a("Gradient reference '%s' not found", str);
        } else if (!(b instanceof SVG.AbstractC26454i)) {
            m95893b("Gradient href attributes must point to other gradient elements", new Object[0]);
        } else if (b == iVar) {
            m95893b("Circular reference in gradient href attribute '%s'", str);
        } else {
            SVG.AbstractC26454i iVar2 = (SVG.AbstractC26454i) b;
            if (iVar.f65385b == null) {
                iVar.f65385b = iVar2.f65385b;
            }
            if (iVar.f65386c == null) {
                iVar.f65386c = iVar2.f65386c;
            }
            if (iVar.f65387d == null) {
                iVar.f65387d = iVar2.f65387d;
            }
            if (iVar.f65384a.isEmpty()) {
                iVar.f65384a = iVar2.f65384a;
            }
            try {
                if (iVar instanceof SVG.C26444ag) {
                    m95855a((SVG.C26444ag) iVar, (SVG.C26444ag) b);
                } else {
                    m95858a((SVG.ak) iVar, (SVG.ak) b);
                }
            } catch (ClassCastException unused) {
            }
            if (iVar2.f65388e != null) {
                m95863a(iVar, iVar2.f65388e);
            }
        }
    }

    /* renamed from: a */
    private void m95855a(SVG.C26444ag agVar, SVG.C26444ag agVar2) {
        if (agVar.f65349f == null) {
            agVar.f65349f = agVar2.f65349f;
        }
        if (agVar.f65350g == null) {
            agVar.f65350g = agVar2.f65350g;
        }
        if (agVar.f65351h == null) {
            agVar.f65351h = agVar2.f65351h;
        }
        if (agVar.f65352i == null) {
            agVar.f65352i = agVar2.f65352i;
        }
    }

    /* renamed from: a */
    private void m95858a(SVG.ak akVar, SVG.ak akVar2) {
        if (akVar.f65356f == null) {
            akVar.f65356f = akVar2.f65356f;
        }
        if (akVar.f65357g == null) {
            akVar.f65357g = akVar2.f65357g;
        }
        if (akVar.f65358h == null) {
            akVar.f65358h = akVar2.f65358h;
        }
        if (akVar.f65359i == null) {
            akVar.f65359i = akVar2.f65359i;
        }
        if (akVar.f65360j == null) {
            akVar.f65360j = akVar2.f65360j;
        }
    }

    /* renamed from: a */
    private void m95881a(boolean z, SVG.C26471z zVar) {
        boolean z2 = true;
        if (z) {
            if (m95882a(zVar.f65347m, FileReaderUtil.f12880b)) {
                this.f65440f.f65453a.f65308b = zVar.f65347m.f65329w;
                C26481b bVar = this.f65440f;
                if (zVar.f65347m.f65329w == null) {
                    z2 = false;
                }
                bVar.f65454b = z2;
            }
            if (m95882a(zVar.f65347m, 4294967296L)) {
                this.f65440f.f65453a.f65310d = zVar.f65347m.f65330x;
            }
            if (m95882a(zVar.f65347m, 6442450944L)) {
                C26481b bVar2 = this.f65440f;
                m95876a(bVar2, z, bVar2.f65453a.f65308b);
                return;
            }
            return;
        }
        if (m95882a(zVar.f65347m, FileReaderUtil.f12880b)) {
            this.f65440f.f65453a.f65311e = zVar.f65347m.f65329w;
            C26481b bVar3 = this.f65440f;
            if (zVar.f65347m.f65329w == null) {
                z2 = false;
            }
            bVar3.f65455c = z2;
        }
        if (m95882a(zVar.f65347m, 4294967296L)) {
            this.f65440f.f65453a.f65312f = zVar.f65347m.f65330x;
        }
        if (m95882a(zVar.f65347m, 6442450944L)) {
            C26481b bVar4 = this.f65440f;
            m95876a(bVar4, z, bVar4.f65453a.f65311e);
        }
    }

    /* renamed from: a */
    private void m95857a(SVG.C26445ah ahVar, boolean z, Path path, Matrix matrix) {
        if (m95906l()) {
            m95910p();
            if (ahVar instanceof SVG.an) {
                if (z) {
                    m95860a((SVG.an) ahVar, path, matrix);
                } else {
                    m95893b("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
            } else if (ahVar instanceof SVG.C26464s) {
                m95869a((SVG.C26464s) ahVar, path, matrix);
            } else if (ahVar instanceof SVG.AbstractC26456k) {
                m95864a((SVG.AbstractC26456k) ahVar, path, matrix);
            } else {
                m95893b("Invalid %s element found in clipPath definition", ahVar.toString());
            }
            m95911q();
        }
    }

    /* renamed from: a */
    private void m95869a(SVG.C26464s sVar, Path path, Matrix matrix) {
        m95875a(this.f65440f, sVar);
        if (m95906l() && m95907m()) {
            if (sVar.f65390e != null) {
                matrix.preConcat(sVar.f65390e);
            }
            Path a = new C26480a(sVar.f65406a).mo93867a();
            if (sVar.f65344j == null) {
                sVar.f65344j = m95889b(a);
            }
            m95898d(sVar);
            path.setFillType(m95912r());
            path.addPath(a, matrix);
        }
    }

    /* renamed from: a */
    private void m95864a(SVG.AbstractC26456k kVar, Path path, Matrix matrix) {
        Path path2;
        m95875a(this.f65440f, kVar);
        if (m95906l() && m95907m()) {
            if (kVar.f65390e != null) {
                matrix.preConcat(kVar.f65390e);
            }
            if (kVar instanceof SVG.C26470y) {
                path2 = m95888b((SVG.C26470y) kVar);
            } else if (kVar instanceof SVG.C26448c) {
                path2 = m95884b((SVG.C26448c) kVar);
            } else if (kVar instanceof SVG.C26453h) {
                path2 = m95885b((SVG.C26453h) kVar);
            } else if (kVar instanceof SVG.C26468w) {
                path2 = m95887b((SVG.C26468w) kVar);
            } else {
                return;
            }
            m95898d(kVar);
            path.setFillType(m95912r());
            path.addPath(path2, matrix);
        }
    }

    /* renamed from: a */
    private void m95860a(SVG.an anVar, Path path, Matrix matrix) {
        m95875a(this.f65440f, anVar);
        if (m95906l() && m95907m()) {
            if (anVar.f65391b != null) {
                matrix.preConcat(anVar.f65391b);
            }
            SVG.C26445ah b = anVar.f65353o.mo93821b(anVar.f65363a);
            if (b == null) {
                m95893b("Use reference '%s' not found", anVar.f65363a);
                return;
            }
            m95898d(anVar);
            m95857a(b, false, path, matrix);
        }
    }

    /* renamed from: a */
    private void m95853a(SVG.AbstractC26442ae aeVar, Path path, SVG.C26467v vVar) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z = vVar.f65412a != null && vVar.f65412a.booleanValue();
        if (vVar.f65419h != null) {
            m95870a(vVar, vVar.f65419h);
        }
        if (z) {
            f4 = vVar.f65415d != null ? vVar.f65415d.mo93837a(this) : BitmapDescriptorFactory.HUE_RED;
            f3 = vVar.f65416e != null ? vVar.f65416e.mo93839b(this) : BitmapDescriptorFactory.HUE_RED;
            f2 = vVar.f65417f != null ? vVar.f65417f.mo93837a(this) : BitmapDescriptorFactory.HUE_RED;
            f = vVar.f65418g != null ? vVar.f65418g.mo93839b(this) : BitmapDescriptorFactory.HUE_RED;
        } else {
            float a = vVar.f65415d != null ? vVar.f65415d.mo93838a(this, 1.0f) : BitmapDescriptorFactory.HUE_RED;
            float a2 = vVar.f65416e != null ? vVar.f65416e.mo93838a(this, 1.0f) : BitmapDescriptorFactory.HUE_RED;
            float a3 = vVar.f65417f != null ? vVar.f65417f.mo93838a(this, 1.0f) : BitmapDescriptorFactory.HUE_RED;
            float a4 = vVar.f65418g != null ? vVar.f65418g.mo93838a(this, 1.0f) : BitmapDescriptorFactory.HUE_RED;
            f4 = (a * aeVar.f65344j.f65335c) + aeVar.f65344j.f65333a;
            float f6 = (a2 * aeVar.f65344j.f65336d) + aeVar.f65344j.f65334b;
            float f7 = a3 * aeVar.f65344j.f65335c;
            f = a4 * aeVar.f65344j.f65336d;
            f3 = f6;
            f2 = f7;
        }
        if (!(f2 == BitmapDescriptorFactory.HUE_RED || f == BitmapDescriptorFactory.HUE_RED)) {
            PreserveAspectRatio preserveAspectRatio = vVar.f65355q != null ? vVar.f65355q : PreserveAspectRatio.f65290c;
            m95901g();
            this.f65435a.clipPath(path);
            C26481b bVar = new C26481b();
            m95874a(bVar, SVG.Style.m95760a());
            bVar.f65453a.f65321o = false;
            this.f65440f = m95842a(vVar, bVar);
            SVG.C26437a aVar = aeVar.f65344j;
            if (vVar.f65414c != null) {
                this.f65435a.concat(vVar.f65414c);
                Matrix matrix = new Matrix();
                if (vVar.f65414c.invert(matrix)) {
                    float[] fArr = {aeVar.f65344j.f65333a, aeVar.f65344j.f65334b, aeVar.f65344j.mo93825a(), aeVar.f65344j.f65334b, aeVar.f65344j.mo93825a(), aeVar.f65344j.mo93827b(), aeVar.f65344j.f65333a, aeVar.f65344j.mo93827b()};
                    matrix.mapPoints(fArr);
                    RectF rectF = new RectF(fArr[0], fArr[1], fArr[0], fArr[1]);
                    for (int i = 2; i <= 6; i += 2) {
                        if (fArr[i] < rectF.left) {
                            rectF.left = fArr[i];
                        }
                        if (fArr[i] > rectF.right) {
                            rectF.right = fArr[i];
                        }
                        int i2 = i + 1;
                        if (fArr[i2] < rectF.top) {
                            rectF.top = fArr[i2];
                        }
                        if (fArr[i2] > rectF.bottom) {
                            rectF.bottom = fArr[i2];
                        }
                    }
                    aVar = new SVG.C26437a(rectF.left, rectF.top, rectF.right - rectF.left, rectF.bottom - rectF.top);
                }
            }
            float floor = f4 + (((float) Math.floor((double) ((aVar.f65333a - f4) / f2))) * f2);
            float a5 = aVar.mo93825a();
            float b = aVar.mo93827b();
            SVG.C26437a aVar2 = new SVG.C26437a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, f);
            boolean j = m95904j();
            for (float floor2 = f3 + (((float) Math.floor((double) ((aVar.f65334b - f3) / f))) * f); floor2 < b; floor2 += f) {
                float f8 = floor;
                while (f8 < a5) {
                    aVar2.f65333a = f8;
                    aVar2.f65334b = floor2;
                    m95901g();
                    if (!this.f65440f.f65453a.f65321o.booleanValue()) {
                        f5 = floor;
                        m95843a(aVar2.f65333a, aVar2.f65334b, aVar2.f65335c, aVar2.f65336d);
                    } else {
                        f5 = floor;
                    }
                    if (vVar.f65361r != null) {
                        this.f65435a.concat(m95839a(aVar2, vVar.f65361r, preserveAspectRatio));
                    } else {
                        boolean z2 = vVar.f65413b == null || vVar.f65413b.booleanValue();
                        this.f65435a.translate(f8, floor2);
                        if (!z2) {
                            this.f65435a.scale(aeVar.f65344j.f65335c, aeVar.f65344j.f65336d);
                        }
                    }
                    for (SVG.C26445ah ahVar : vVar.f65343i) {
                        m95856a(ahVar);
                    }
                    m95902h();
                    f8 += f2;
                    floor = f5;
                }
            }
            if (j) {
                m95890b((SVG.AbstractC26442ae) vVar);
            }
            m95902h();
        }
    }

    /* renamed from: a */
    private void m95870a(SVG.C26467v vVar, String str) {
        SVG.C26445ah b = vVar.f65353o.mo93821b(str);
        if (b == null) {
            m95877a("Pattern reference '%s' not found", str);
        } else if (!(b instanceof SVG.C26467v)) {
            m95893b("Pattern href attributes must point to other pattern elements", new Object[0]);
        } else if (b == vVar) {
            m95893b("Circular reference in pattern href attribute '%s'", str);
        } else {
            SVG.C26467v vVar2 = (SVG.C26467v) b;
            if (vVar.f65412a == null) {
                vVar.f65412a = vVar2.f65412a;
            }
            if (vVar.f65413b == null) {
                vVar.f65413b = vVar2.f65413b;
            }
            if (vVar.f65414c == null) {
                vVar.f65414c = vVar2.f65414c;
            }
            if (vVar.f65415d == null) {
                vVar.f65415d = vVar2.f65415d;
            }
            if (vVar.f65416e == null) {
                vVar.f65416e = vVar2.f65416e;
            }
            if (vVar.f65417f == null) {
                vVar.f65417f = vVar2.f65417f;
            }
            if (vVar.f65418g == null) {
                vVar.f65418g = vVar2.f65418g;
            }
            if (vVar.f65343i.isEmpty()) {
                vVar.f65343i = vVar2.f65343i;
            }
            if (vVar.f65361r == null) {
                vVar.f65361r = vVar2.f65361r;
            }
            if (vVar.f65355q == null) {
                vVar.f65355q = vVar2.f65355q;
            }
            if (vVar2.f65419h != null) {
                m95870a(vVar, vVar2.f65419h);
            }
        }
    }

    /* renamed from: h */
    private void m95902h() {
        this.f65435a.restore();
        this.f65440f = this.f65441g.pop();
    }

    /* renamed from: i */
    private void m95903i() {
        this.f65442h.pop();
        this.f65443i.pop();
    }

    /* renamed from: q */
    private void m95911q() {
        this.f65435a.restore();
        this.f65440f = this.f65441g.pop();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo93865d() {
        return this.f65440f.f65456d.getTextSize() / 2.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public SVG.C26437a mo93866e() {
        if (this.f65440f.f65459g != null) {
            return this.f65440f.f65459g;
        }
        return this.f65440f.f65458f;
    }

    /* renamed from: g */
    private void m95901g() {
        this.f65435a.save();
        this.f65441g.push(this.f65440f);
        this.f65440f = new C26481b(this.f65440f);
    }

    /* renamed from: k */
    private boolean m95905k() {
        if (this.f65440f.f65453a.f65319m.floatValue() < 1.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private boolean m95906l() {
        if (this.f65440f.f65453a.f65323q != null) {
            return this.f65440f.f65453a.f65323q.booleanValue();
        }
        return true;
    }

    /* renamed from: m */
    private boolean m95907m() {
        if (this.f65440f.f65453a.f65324r != null) {
            return this.f65440f.f65453a.f65324r.booleanValue();
        }
        return true;
    }

    /* renamed from: n */
    private Path.FillType m95908n() {
        if (this.f65440f.f65453a.f65309c == null || this.f65440f.f65453a.f65309c != SVG.Style.FillRule.EvenOdd) {
            return Path.FillType.WINDING;
        }
        return Path.FillType.EVEN_ODD;
    }

    /* renamed from: p */
    private void m95910p() {
        C26474b.m95828a(this.f65435a, C26474b.f65427a);
        this.f65441g.push(this.f65440f);
        this.f65440f = new C26481b(this.f65440f);
    }

    /* renamed from: r */
    private Path.FillType m95912r() {
        if (this.f65440f.f65453a.f65328v == null || this.f65440f.f65453a.f65328v != SVG.Style.FillRule.EvenOdd) {
            return Path.FillType.WINDING;
        }
        return Path.FillType.EVEN_ODD;
    }

    /* renamed from: f */
    private void m95900f() {
        this.f65440f = new C26481b();
        this.f65441g = new Stack<>();
        m95874a(this.f65440f, SVG.Style.m95760a());
        this.f65440f.f65458f = null;
        this.f65440f.f65460h = false;
        this.f65441g.push(new C26481b(this.f65440f));
        this.f65443i = new Stack<>();
        this.f65442h = new Stack<>();
    }

    /* renamed from: j */
    private boolean m95904j() {
        if (!m95905k()) {
            return false;
        }
        this.f65435a.saveLayerAlpha(null, m95836a(this.f65440f.f65453a.f65319m.floatValue()), 31);
        this.f65441g.push(this.f65440f);
        this.f65440f = new C26481b(this.f65440f);
        return true;
    }

    /* renamed from: o */
    private void m95909o() {
        int i;
        if (this.f65440f.f65453a.f65331y instanceof SVG.C26450e) {
            i = ((SVG.C26450e) this.f65440f.f65453a.f65331y).f65378a;
        } else if (this.f65440f.f65453a.f65331y instanceof SVG.C26451f) {
            i = this.f65440f.f65453a.f65320n.f65378a;
        } else {
            return;
        }
        if (this.f65440f.f65453a.f65332z != null) {
            i = m95837a(i, this.f65440f.f65453a.f65332z.floatValue());
        }
        this.f65435a.drawColor(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.parser.e$2 */
    public static /* synthetic */ class C264792 {

        /* renamed from: a */
        static final /* synthetic */ int[] f65447a;

        /* renamed from: b */
        static final /* synthetic */ int[] f65448b;

        /* renamed from: c */
        static final /* synthetic */ int[] f65449c;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0088 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0093 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x009e */
        static {
            /*
            // Method dump skipped, instructions count: 171
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.component.svg.parser.C26477e.C264792.<clinit>():void");
        }
    }

    /* renamed from: b */
    private void m95890b(SVG.AbstractC26442ae aeVar) {
        m95854a(aeVar, aeVar.f65344j);
    }

    /* renamed from: d */
    private void m95898d(SVG.AbstractC26442ae aeVar) {
        m95891b(aeVar, aeVar.f65344j);
    }

    /* renamed from: a */
    private static double m95835a(double d) {
        if (d < -1.0d) {
            return 3.141592653589793d;
        }
        if (d > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d);
    }

    /* renamed from: b */
    private SVG.C26437a m95889b(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new SVG.C26437a(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* renamed from: c */
    private C26481b m95895c(SVG.C26445ah ahVar) {
        C26481b bVar = new C26481b();
        m95874a(bVar, SVG.Style.m95760a());
        return m95842a(ahVar, bVar);
    }

    /* renamed from: b */
    private Path m95887b(SVG.C26468w wVar) {
        Path path = new Path();
        path.moveTo(wVar.f65420a[0], wVar.f65420a[1]);
        for (int i = 2; i < wVar.f65420a.length; i += 2) {
            path.lineTo(wVar.f65420a[i], wVar.f65420a[i + 1]);
        }
        if (wVar instanceof SVG.C26469x) {
            path.close();
        }
        if (wVar.f65344j == null) {
            wVar.f65344j = m95889b(path);
        }
        return path;
    }

    /* renamed from: c */
    private void m95896c(SVG.AbstractC26442ae aeVar) {
        if (this.f65440f.f65453a.f65308b instanceof SVG.C26463r) {
            m95880a(true, aeVar.f65344j, (SVG.C26463r) this.f65440f.f65453a.f65308b);
        }
        if (this.f65440f.f65453a.f65311e instanceof SVG.C26463r) {
            m95880a(false, aeVar.f65344j, (SVG.C26463r) this.f65440f.f65453a.f65311e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.component.svg.parser.e$b */
    public class C26481b {

        /* renamed from: a */
        SVG.Style f65453a;

        /* renamed from: b */
        boolean f65454b;

        /* renamed from: c */
        boolean f65455c;

        /* renamed from: d */
        Paint f65456d;

        /* renamed from: e */
        Paint f65457e;

        /* renamed from: f */
        SVG.C26437a f65458f;

        /* renamed from: g */
        SVG.C26437a f65459g;

        /* renamed from: h */
        boolean f65460h;

        C26481b() {
            Paint paint = new Paint();
            this.f65456d = paint;
            paint.setFlags(193);
            if (Build.VERSION.SDK_INT >= 14) {
                this.f65456d.setHinting(0);
            }
            this.f65456d.setStyle(Paint.Style.FILL);
            this.f65456d.setTypeface(Typeface.DEFAULT);
            Paint paint2 = new Paint();
            this.f65457e = paint2;
            paint2.setFlags(193);
            if (Build.VERSION.SDK_INT >= 14) {
                this.f65457e.setHinting(0);
            }
            this.f65457e.setStyle(Paint.Style.STROKE);
            this.f65457e.setTypeface(Typeface.DEFAULT);
            this.f65453a = SVG.Style.m95760a();
        }

        C26481b(C26481b bVar) {
            this.f65454b = bVar.f65454b;
            this.f65455c = bVar.f65455c;
            this.f65456d = new Paint(bVar.f65456d);
            this.f65457e = new Paint(bVar.f65457e);
            SVG.C26437a aVar = bVar.f65458f;
            if (aVar != null) {
                this.f65458f = new SVG.C26437a(aVar);
            }
            SVG.C26437a aVar2 = bVar.f65459g;
            if (aVar2 != null) {
                this.f65459g = new SVG.C26437a(aVar2);
            }
            this.f65460h = bVar.f65460h;
            try {
                this.f65453a = (SVG.Style) bVar.f65453a.clone();
            } catch (CloneNotSupportedException e) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
                this.f65453a = SVG.Style.m95760a();
            }
        }
    }

    /* renamed from: a */
    private Bitmap m95838a(String str) {
        int indexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (indexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(indexOf - 7, indexOf))) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e) {
            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e);
            return null;
        }
    }

    /* renamed from: b */
    private Path m95884b(SVG.C26448c cVar) {
        float f;
        SVG.C26460o oVar = cVar.f65372a;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (oVar != null) {
            f = cVar.f65372a.mo93837a(this);
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if (cVar.f65373b != null) {
            f2 = cVar.f65373b.mo93839b(this);
        }
        float c = cVar.f65374c.mo93841c(this);
        float f3 = f - c;
        float f4 = f2 - c;
        float f5 = f + c;
        float f6 = f2 + c;
        if (cVar.f65344j == null) {
            float f7 = 2.0f * c;
            cVar.f65344j = new SVG.C26437a(f3, f4, f7, f7);
        }
        float f8 = 0.5522848f * c;
        Path path = new Path();
        path.moveTo(f, f4);
        float f9 = f + f8;
        float f10 = f2 - f8;
        path.cubicTo(f9, f4, f5, f10, f5, f2);
        float f11 = f2 + f8;
        path.cubicTo(f5, f11, f9, f6, f, f6);
        float f12 = f - f8;
        path.cubicTo(f12, f6, f3, f11, f3, f2);
        path.cubicTo(f3, f10, f12, f4, f, f4);
        path.close();
        return path;
    }

    /* renamed from: b */
    private Path m95885b(SVG.C26453h hVar) {
        float f;
        SVG.C26460o oVar = hVar.f65380a;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (oVar != null) {
            f = hVar.f65380a.mo93837a(this);
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if (hVar.f65381b != null) {
            f2 = hVar.f65381b.mo93839b(this);
        }
        float a = hVar.f65382c.mo93837a(this);
        float b = hVar.f65383d.mo93839b(this);
        float f3 = f - a;
        float f4 = f2 - b;
        float f5 = f + a;
        float f6 = f2 + b;
        if (hVar.f65344j == null) {
            hVar.f65344j = new SVG.C26437a(f3, f4, a * 2.0f, 2.0f * b);
        }
        float f7 = a * 0.5522848f;
        float f8 = 0.5522848f * b;
        Path path = new Path();
        path.moveTo(f, f4);
        float f9 = f + f7;
        float f10 = f2 - f8;
        path.cubicTo(f9, f4, f5, f10, f5, f2);
        float f11 = f8 + f2;
        path.cubicTo(f5, f11, f9, f6, f, f6);
        float f12 = f - f7;
        path.cubicTo(f12, f6, f3, f11, f3, f2);
        path.cubicTo(f3, f10, f12, f4, f, f4);
        path.close();
        return path;
    }

    /* renamed from: b */
    private Path m95886b(SVG.C26461p pVar) {
        float f;
        float f2;
        float f3;
        SVG.C26460o oVar = pVar.f65400a;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        if (oVar == null) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = pVar.f65400a.mo93837a(this);
        }
        if (pVar.f65401b == null) {
            f2 = BitmapDescriptorFactory.HUE_RED;
        } else {
            f2 = pVar.f65401b.mo93839b(this);
        }
        if (pVar.f65402c == null) {
            f3 = BitmapDescriptorFactory.HUE_RED;
        } else {
            f3 = pVar.f65402c.mo93837a(this);
        }
        if (pVar.f65403d != null) {
            f4 = pVar.f65403d.mo93839b(this);
        }
        if (pVar.f65344j == null) {
            pVar.f65344j = new SVG.C26437a(Math.min(f, f3), Math.min(f2, f4), Math.abs(f3 - f), Math.abs(f4 - f2));
        }
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    /* renamed from: b */
    private Path m95888b(SVG.C26470y yVar) {
        float f;
        float f2;
        float f3;
        float f4;
        if (yVar.f65425f == null && yVar.f65426g == null) {
            f2 = BitmapDescriptorFactory.HUE_RED;
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            if (yVar.f65425f == null) {
                f2 = yVar.f65426g.mo93839b(this);
            } else if (yVar.f65426g == null) {
                f2 = yVar.f65425f.mo93837a(this);
            } else {
                f2 = yVar.f65425f.mo93837a(this);
                f = yVar.f65426g.mo93839b(this);
            }
            f = f2;
        }
        float min = Math.min(f2, yVar.f65423c.mo93837a(this) / 2.0f);
        float min2 = Math.min(f, yVar.f65424d.mo93839b(this) / 2.0f);
        if (yVar.f65421a != null) {
            f3 = yVar.f65421a.mo93837a(this);
        } else {
            f3 = BitmapDescriptorFactory.HUE_RED;
        }
        if (yVar.f65422b != null) {
            f4 = yVar.f65422b.mo93839b(this);
        } else {
            f4 = BitmapDescriptorFactory.HUE_RED;
        }
        float a = yVar.f65423c.mo93837a(this);
        float b = yVar.f65424d.mo93839b(this);
        if (yVar.f65344j == null) {
            yVar.f65344j = new SVG.C26437a(f3, f4, a, b);
        }
        float f5 = f3 + a;
        float f6 = f4 + b;
        Path path = new Path();
        if (min == BitmapDescriptorFactory.HUE_RED || min2 == BitmapDescriptorFactory.HUE_RED) {
            path.addRect(f3, f4, f5, f6, Path.Direction.CW);
            return path;
        }
        float f7 = min * 0.5522848f;
        float f8 = 0.5522848f * min2;
        float f9 = f4 + min2;
        path.moveTo(f3, f9);
        float f10 = f9 - f8;
        float f11 = f3 + min;
        float f12 = f11 - f7;
        path.cubicTo(f3, f10, f12, f4, f11, f4);
        float f13 = f5 - min;
        path.lineTo(f13, f4);
        float f14 = f13 + f7;
        path.cubicTo(f14, f4, f5, f10, f5, f9);
        float f15 = f6 - min2;
        path.lineTo(f5, f15);
        float f16 = f15 + f8;
        path.cubicTo(f5, f16, f14, f6, f13, f6);
        path.lineTo(f11, f6);
        path.cubicTo(f12, f6, f3, f16, f3, f15);
        path.lineTo(f3, f9);
        path.close();
        return path;
    }

    /* renamed from: a */
    private void m95854a(SVG.AbstractC26442ae aeVar, SVG.C26437a aVar) {
        m95902h();
    }

    /* renamed from: a */
    private void m95847a(SVG.C26439ab abVar, SVG.C26437a aVar) {
        m95848a(abVar, aVar, abVar.f65361r, abVar.f65355q);
    }

    /* renamed from: b */
    private static void m95893b(String str, Object... objArr) {
        LLog.m96429e("SVGAndroidRenderer", String.format(str, objArr));
    }

    /* renamed from: c */
    private static void m95897c(String str, Object... objArr) {
        LLog.m96423b("SVGAndroidRenderer", String.format(str, objArr));
    }

    /* renamed from: a */
    private static int m95837a(int i, float f) {
        int i2 = 255;
        int round = Math.round(((float) ((i >> 24) & 255)) * f);
        if (round < 0) {
            i2 = 0;
        } else if (round <= 255) {
            i2 = round;
        }
        return (i & 16777215) | (i2 << 24);
    }

    /* renamed from: c */
    private Path m95894c(SVG.AbstractC26442ae aeVar, SVG.C26437a aVar) {
        Path a;
        SVG.C26445ah b = aeVar.f65353o.mo93821b(this.f65440f.f65453a.f65327u);
        boolean z = false;
        if (b == null) {
            m95893b("ClipPath reference '%s' not found", this.f65440f.f65453a.f65327u);
            return null;
        }
        SVG.C26449d dVar = (SVG.C26449d) b;
        this.f65441g.push(this.f65440f);
        this.f65440f = m95895c((SVG.C26445ah) dVar);
        if (dVar.f65375a == null || dVar.f65375a.booleanValue()) {
            z = true;
        }
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(aVar.f65333a, aVar.f65334b);
            matrix.preScale(aVar.f65335c, aVar.f65336d);
        }
        if (dVar.f65391b != null) {
            matrix.preConcat(dVar.f65391b);
        }
        Path path = new Path();
        for (SVG.C26445ah ahVar : dVar.f65343i) {
            if ((ahVar instanceof SVG.AbstractC26442ae) && (a = m95840a((SVG.AbstractC26442ae) ahVar, true)) != null) {
                path.op(a, Path.Op.UNION);
            }
        }
        if (this.f65440f.f65453a.f65327u != null) {
            if (dVar.f65344j == null) {
                dVar.f65344j = m95889b(path);
            }
            Path c = m95894c(dVar, dVar.f65344j);
            if (c != null) {
                path.op(c, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f65440f = this.f65441g.pop();
        return path;
    }

    /* renamed from: d */
    private void m95899d(SVG.AbstractC26442ae aeVar, SVG.C26437a aVar) {
        boolean z;
        SVG.C26445ah b = aeVar.f65353o.mo93821b(this.f65440f.f65453a.f65327u);
        if (b == null) {
            m95893b("ClipPath reference '%s' not found", this.f65440f.f65453a.f65327u);
            return;
        }
        SVG.C26449d dVar = (SVG.C26449d) b;
        if (dVar.f65343i.isEmpty()) {
            this.f65435a.clipRect(0, 0, 0, 0);
            return;
        }
        if (dVar.f65375a == null || dVar.f65375a.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        if (!(aeVar instanceof SVG.C26457l) || z) {
            m95910p();
            if (!z) {
                Matrix matrix = new Matrix();
                matrix.preTranslate(aVar.f65333a, aVar.f65334b);
                matrix.preScale(aVar.f65335c, aVar.f65336d);
                this.f65435a.concat(matrix);
            }
            if (dVar.f65391b != null) {
                this.f65435a.concat(dVar.f65391b);
            }
            this.f65440f = m95895c((SVG.C26445ah) dVar);
            m95898d(dVar);
            Path path = new Path();
            for (SVG.C26445ah ahVar : dVar.f65343i) {
                m95857a(ahVar, true, path, new Matrix());
            }
            this.f65435a.clipPath(path);
            m95911q();
            return;
        }
        m95877a("<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)", aeVar.mo93829a());
    }

    /* renamed from: a */
    private Path m95840a(SVG.AbstractC26442ae aeVar, boolean z) {
        Path path;
        Path c;
        this.f65441g.push(this.f65440f);
        C26481b bVar = new C26481b(this.f65440f);
        this.f65440f = bVar;
        m95875a(bVar, aeVar);
        if (!m95906l() || !m95907m()) {
            this.f65440f = this.f65441g.pop();
            return null;
        }
        if (aeVar instanceof SVG.an) {
            if (!z) {
                m95893b("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            SVG.an anVar = (SVG.an) aeVar;
            SVG.C26445ah b = aeVar.f65353o.mo93821b(anVar.f65363a);
            if (b == null) {
                m95893b("Use reference '%s' not found", anVar.f65363a);
                this.f65440f = this.f65441g.pop();
                return null;
            } else if (!(b instanceof SVG.AbstractC26442ae)) {
                this.f65440f = this.f65441g.pop();
                return null;
            } else {
                path = m95840a((SVG.AbstractC26442ae) b, false);
                if (path == null) {
                    return null;
                }
                if (anVar.f65344j == null) {
                    anVar.f65344j = m95889b(path);
                }
                if (anVar.f65391b != null) {
                    path.transform(anVar.f65391b);
                }
            }
        } else if (aeVar instanceof SVG.AbstractC26456k) {
            SVG.AbstractC26456k kVar = (SVG.AbstractC26456k) aeVar;
            if (aeVar instanceof SVG.C26464s) {
                path = new C26480a(((SVG.C26464s) aeVar).f65406a).mo93867a();
                if (aeVar.f65344j == null) {
                    aeVar.f65344j = m95889b(path);
                }
            } else {
                path = aeVar instanceof SVG.C26470y ? m95888b((SVG.C26470y) aeVar) : aeVar instanceof SVG.C26448c ? m95884b((SVG.C26448c) aeVar) : aeVar instanceof SVG.C26453h ? m95885b((SVG.C26453h) aeVar) : aeVar instanceof SVG.C26468w ? m95887b((SVG.C26468w) aeVar) : null;
            }
            if (path == null) {
                return null;
            }
            if (kVar.f65344j == null) {
                kVar.f65344j = m95889b(path);
            }
            if (kVar.f65390e != null) {
                path.transform(kVar.f65390e);
            }
            path.setFillType(m95912r());
        } else {
            m95893b("Invalid %s element found in clipPath definition", aeVar.mo93829a());
            return null;
        }
        if (!(this.f65440f.f65453a.f65327u == null || (c = m95894c(aeVar, aeVar.f65344j)) == null)) {
            path.op(c, Path.Op.INTERSECT);
        }
        this.f65440f = this.f65441g.pop();
        return path;
    }

    /* renamed from: a */
    private C26481b m95842a(SVG.C26445ah ahVar, C26481b bVar) {
        ArrayList<SVG.AbstractC26443af> arrayList = new ArrayList();
        while (true) {
            if (ahVar instanceof SVG.AbstractC26443af) {
                arrayList.add(0, (SVG.AbstractC26443af) ahVar);
            }
            if (ahVar.f65354p == null) {
                break;
            }
            ahVar = (SVG.C26445ah) ahVar.f65354p;
        }
        for (SVG.AbstractC26443af afVar : arrayList) {
            m95875a(bVar, afVar);
        }
        bVar.f65459g = this.f65440f.f65459g;
        bVar.f65458f = this.f65440f.f65458f;
        return bVar;
    }

    /* renamed from: b */
    private void m95891b(SVG.AbstractC26442ae aeVar, SVG.C26437a aVar) {
        if (this.f65440f.f65453a.f65327u != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                Path c = m95894c(aeVar, aVar);
                if (c != null) {
                    this.f65435a.clipPath(c);
                    return;
                }
                return;
            }
            m95899d(aeVar, aVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        if (r11 != 8) goto L_0x0090;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Matrix m95839a(com.lynx.component.svg.parser.SVG.C26437a r9, com.lynx.component.svg.parser.SVG.C26437a r10, com.lynx.component.svg.parser.PreserveAspectRatio r11) {
        /*
        // Method dump skipped, instructions count: 174
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.component.svg.parser.C26477e.m95839a(com.lynx.component.svg.parser.SVG$a, com.lynx.component.svg.parser.SVG$a, com.lynx.component.svg.parser.PreserveAspectRatio):android.graphics.Matrix");
    }

    C26477e(Canvas canvas, float f, float f2, C26428c cVar) {
        this.f65435a = canvas;
        this.f65436b = f;
        this.f65437c = f2;
        this.f65438d = cVar;
    }

    /* renamed from: a */
    private SVG.C26437a m95841a(SVG.C26460o oVar, SVG.C26460o oVar2, SVG.C26460o oVar3, SVG.C26460o oVar4) {
        float f;
        float f2;
        float f3;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        if (oVar != null) {
            f = oVar.mo93837a(this);
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if (oVar2 != null) {
            f4 = oVar2.mo93839b(this);
        }
        SVG.C26437a e = mo93866e();
        if (oVar3 != null) {
            f2 = oVar3.mo93837a(this);
        } else {
            f2 = e.f65335c;
        }
        if (oVar4 != null) {
            f3 = oVar4.mo93839b(this);
        } else {
            f3 = e.f65336d;
        }
        return new SVG.C26437a(f, f4, f2, f3);
    }
}
