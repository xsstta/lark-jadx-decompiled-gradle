package com.lynx.component.svg.parser;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.component.svg.C26428c;
import com.lynx.tasm.utils.C26960n;
import com.ss.ttm.player.MediaPlayer;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SVG {

    /* renamed from: a */
    private C26439ab f65299a;

    /* renamed from: b */
    private String f65300b = "";

    /* renamed from: c */
    private float f65301c = 96.0f;

    /* renamed from: d */
    private Map<String, AbstractC26443af> f65302d = new HashMap();

    /* renamed from: e */
    private C26476d f65303e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.parser.SVG$ad */
    public interface AbstractC26441ad {
        /* renamed from: a */
        void mo93830a(C26445ah ahVar) throws SVGParseException;

        /* renamed from: b */
        List<C26445ah> mo93831b();
    }

    /* access modifiers changed from: package-private */
    public enum am {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent,
        rpx,
        rem
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$j */
    enum EnumC26455j {
        pad,
        reflect,
        repeat
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$m */
    interface AbstractC26458m {
        /* renamed from: a */
        void mo93834a(Matrix matrix);
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$q */
    interface AbstractC26462q {
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$u */
    interface AbstractC26466u {
        /* renamed from: a */
        void mo93845a(float f, float f2);

        /* renamed from: a */
        void mo93846a(float f, float f2, float f3, float f4);

        /* renamed from: a */
        void mo93847a(float f, float f2, float f3, float f4, float f5, float f6);

        /* renamed from: a */
        void mo93848a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);

        /* renamed from: b */
        void mo93851b();

        /* renamed from: b */
        void mo93852b(float f, float f2);
    }

    static class Style implements Cloneable {

        /* renamed from: A */
        VectorEffect f65305A;

        /* renamed from: B */
        RenderQuality f65306B;

        /* renamed from: a */
        long f65307a;

        /* renamed from: b */
        AbstractC26446ai f65308b;

        /* renamed from: c */
        FillRule f65309c;

        /* renamed from: d */
        Float f65310d;

        /* renamed from: e */
        AbstractC26446ai f65311e;

        /* renamed from: f */
        Float f65312f;

        /* renamed from: g */
        C26460o f65313g;

        /* renamed from: h */
        LineCap f65314h;

        /* renamed from: i */
        LineJoin f65315i;

        /* renamed from: j */
        Float f65316j;

        /* renamed from: k */
        C26460o[] f65317k;

        /* renamed from: l */
        C26460o f65318l;

        /* renamed from: m */
        Float f65319m;

        /* renamed from: n */
        C26450e f65320n;

        /* renamed from: o */
        Boolean f65321o;

        /* renamed from: p */
        C26447b f65322p;

        /* renamed from: q */
        Boolean f65323q;

        /* renamed from: r */
        Boolean f65324r;

        /* renamed from: s */
        AbstractC26446ai f65325s;

        /* renamed from: t */
        Float f65326t;

        /* renamed from: u */
        String f65327u;

        /* renamed from: v */
        FillRule f65328v;

        /* renamed from: w */
        AbstractC26446ai f65329w;

        /* renamed from: x */
        Float f65330x;

        /* renamed from: y */
        AbstractC26446ai f65331y;

        /* renamed from: z */
        Float f65332z;

        public enum FillRule {
            NonZero,
            EvenOdd
        }

        public enum LineCap {
            Butt,
            Round,
            Square
        }

        public enum LineJoin {
            Miter,
            Round,
            Bevel
        }

        public enum RenderQuality {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        public enum VectorEffect {
            None,
            NonScalingStroke
        }

        Style() {
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            Style style = (Style) super.clone();
            C26460o[] oVarArr = this.f65317k;
            if (oVarArr != null) {
                style.f65317k = (C26460o[]) oVarArr.clone();
            }
            return style;
        }

        /* renamed from: a */
        static Style m95760a() {
            Style style = new Style();
            style.f65307a = -1;
            style.f65308b = C26450e.f65376b;
            style.f65309c = FillRule.NonZero;
            Float valueOf = Float.valueOf(1.0f);
            style.f65310d = valueOf;
            style.f65311e = null;
            style.f65312f = valueOf;
            style.f65313g = new C26460o(BitmapDescriptorFactory.HUE_RED);
            style.f65314h = LineCap.Butt;
            style.f65315i = LineJoin.Miter;
            style.f65316j = Float.valueOf(4.0f);
            style.f65317k = null;
            style.f65318l = new C26460o(BitmapDescriptorFactory.HUE_RED);
            style.f65319m = valueOf;
            style.f65320n = C26450e.f65376b;
            style.f65321o = true;
            style.f65322p = null;
            style.f65323q = Boolean.TRUE;
            style.f65324r = Boolean.TRUE;
            style.f65325s = C26450e.f65376b;
            style.f65326t = valueOf;
            style.f65327u = null;
            style.f65328v = FillRule.NonZero;
            style.f65329w = null;
            style.f65330x = valueOf;
            style.f65331y = null;
            style.f65332z = valueOf;
            style.f65305A = VectorEffect.None;
            style.f65306B = RenderQuality.auto;
            return style;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo93823a(boolean z) {
            Boolean bool;
            this.f65323q = Boolean.TRUE;
            if (z) {
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            this.f65321o = bool;
            this.f65322p = null;
            this.f65327u = null;
            this.f65319m = Float.valueOf(1.0f);
            this.f65325s = C26450e.f65376b;
            this.f65326t = Float.valueOf(1.0f);
            this.f65329w = null;
            this.f65330x = Float.valueOf(1.0f);
            this.f65331y = null;
            this.f65332z = Float.valueOf(1.0f);
            this.f65305A = VectorEffect.None;
        }
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$aa */
    static class C26438aa extends AbstractC26443af implements AbstractC26441ad {

        /* renamed from: a */
        Float f65337a;

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.parser.SVG.C26445ah
        /* renamed from: a */
        public String mo93829a() {
            return "stop";
        }

        @Override // com.lynx.component.svg.parser.SVG.AbstractC26441ad
        /* renamed from: a */
        public void mo93830a(C26445ah ahVar) {
        }

        C26438aa() {
        }

        @Override // com.lynx.component.svg.parser.SVG.AbstractC26441ad
        /* renamed from: b */
        public List<C26445ah> mo93831b() {
            return Collections.emptyList();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.parser.SVG$ab */
    public static class C26439ab extends al {

        /* renamed from: a */
        C26460o f65338a;

        /* renamed from: b */
        C26460o f65339b;

        /* renamed from: c */
        C26460o f65340c;

        /* renamed from: d */
        C26460o f65341d;

        /* renamed from: e */
        public String f65342e;

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.parser.SVG.C26445ah
        /* renamed from: a */
        public String mo93829a() {
            return "svg";
        }

        C26439ab() {
        }
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$ac */
    static abstract class AbstractC26440ac extends AbstractC26442ae implements AbstractC26441ad {

        /* renamed from: i */
        List<C26445ah> f65343i = new ArrayList();

        @Override // com.lynx.component.svg.parser.SVG.AbstractC26441ad
        /* renamed from: b */
        public List<C26445ah> mo93831b() {
            return this.f65343i;
        }

        AbstractC26440ac() {
        }

        @Override // com.lynx.component.svg.parser.SVG.AbstractC26441ad
        /* renamed from: a */
        public void mo93830a(C26445ah ahVar) throws SVGParseException {
            this.f65343i.add(ahVar);
        }
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$ae */
    static abstract class AbstractC26442ae extends AbstractC26443af {

        /* renamed from: j */
        C26437a f65344j;

        AbstractC26442ae() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.parser.SVG$af */
    public static abstract class AbstractC26443af extends C26445ah {

        /* renamed from: k */
        String f65345k;

        /* renamed from: l */
        Boolean f65346l;

        /* renamed from: m */
        Style f65347m;

        /* renamed from: n */
        Style f65348n;

        AbstractC26443af() {
        }

        public String toString() {
            return mo93829a();
        }
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$ag */
    static class C26444ag extends AbstractC26454i {

        /* renamed from: f */
        C26460o f65349f;

        /* renamed from: g */
        C26460o f65350g;

        /* renamed from: h */
        C26460o f65351h;

        /* renamed from: i */
        C26460o f65352i;

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.parser.SVG.C26445ah
        /* renamed from: a */
        public String mo93829a() {
            return "linearGradient";
        }

        C26444ag() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.parser.SVG$ah */
    public static class C26445ah {

        /* renamed from: o */
        SVG f65353o;

        /* renamed from: p */
        AbstractC26441ad f65354p;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo93829a() {
            return "";
        }

        C26445ah() {
        }
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$ai */
    static abstract class AbstractC26446ai implements Cloneable {
        AbstractC26446ai() {
        }
    }

    static abstract class aj extends AbstractC26440ac {

        /* renamed from: q */
        PreserveAspectRatio f65355q;

        aj() {
        }
    }

    static class ak extends AbstractC26454i {

        /* renamed from: f */
        C26460o f65356f;

        /* renamed from: g */
        C26460o f65357g;

        /* renamed from: h */
        C26460o f65358h;

        /* renamed from: i */
        C26460o f65359i;

        /* renamed from: j */
        C26460o f65360j;

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.parser.SVG.C26445ah
        /* renamed from: a */
        public String mo93829a() {
            return "radialGradient";
        }

        ak() {
        }
    }

    static abstract class al extends aj {

        /* renamed from: r */
        C26437a f65361r;

        al() {
        }
    }

    static class an extends C26457l {

        /* renamed from: a */
        String f65363a;

        /* renamed from: c */
        C26460o f65364c;

        /* renamed from: d */
        C26460o f65365d;

        /* renamed from: e */
        C26460o f65366e;

        /* renamed from: f */
        C26460o f65367f;

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.parser.SVG.C26457l, com.lynx.component.svg.parser.SVG.C26445ah
        /* renamed from: a */
        public String mo93829a() {
            return "use";
        }

        an() {
        }
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$c */
    static class C26448c extends AbstractC26456k {

        /* renamed from: a */
        C26460o f65372a;

        /* renamed from: b */
        C26460o f65373b;

        /* renamed from: c */
        C26460o f65374c;

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.parser.SVG.C26445ah
        /* renamed from: a */
        public String mo93829a() {
            return "circle";
        }

        C26448c() {
        }
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$d */
    static class C26449d extends C26457l implements AbstractC26462q {

        /* renamed from: a */
        Boolean f65375a;

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.parser.SVG.C26457l, com.lynx.component.svg.parser.SVG.C26445ah
        /* renamed from: a */
        public String mo93829a() {
            return "clipPath";
        }

        C26449d() {
        }
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$f */
    static class C26451f extends AbstractC26446ai {

        /* renamed from: a */
        private static C26451f f65379a = new C26451f();

        private C26451f() {
        }

        /* renamed from: a */
        static C26451f m95780a() {
            return f65379a;
        }
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$g */
    static class C26452g extends C26457l implements AbstractC26462q {
        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.parser.SVG.C26457l, com.lynx.component.svg.parser.SVG.C26445ah
        /* renamed from: a */
        public String mo93829a() {
            return "defs";
        }

        C26452g() {
        }
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$h */
    static class C26453h extends AbstractC26456k {

        /* renamed from: a */
        C26460o f65380a;

        /* renamed from: b */
        C26460o f65381b;

        /* renamed from: c */
        C26460o f65382c;

        /* renamed from: d */
        C26460o f65383d;

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.parser.SVG.C26445ah
        /* renamed from: a */
        public String mo93829a() {
            return "ellipse";
        }

        C26453h() {
        }
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$i */
    static abstract class AbstractC26454i extends AbstractC26443af implements AbstractC26441ad {

        /* renamed from: a */
        List<C26445ah> f65384a = new ArrayList();

        /* renamed from: b */
        Boolean f65385b;

        /* renamed from: c */
        Matrix f65386c;

        /* renamed from: d */
        EnumC26455j f65387d;

        /* renamed from: e */
        String f65388e;

        @Override // com.lynx.component.svg.parser.SVG.AbstractC26441ad
        /* renamed from: b */
        public List<C26445ah> mo93831b() {
            return this.f65384a;
        }

        AbstractC26454i() {
        }

        @Override // com.lynx.component.svg.parser.SVG.AbstractC26441ad
        /* renamed from: a */
        public void mo93830a(C26445ah ahVar) throws SVGParseException {
            if (ahVar instanceof C26438aa) {
                this.f65384a.add(ahVar);
                return;
            }
            throw new SVGParseException("Gradient elements cannot contain " + ahVar + " elements.");
        }
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$k */
    static abstract class AbstractC26456k extends AbstractC26442ae implements AbstractC26458m {

        /* renamed from: e */
        Matrix f65390e;

        AbstractC26456k() {
        }

        @Override // com.lynx.component.svg.parser.SVG.AbstractC26458m
        /* renamed from: a */
        public void mo93834a(Matrix matrix) {
            this.f65390e = matrix;
        }
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$l */
    static class C26457l extends AbstractC26440ac implements AbstractC26458m {

        /* renamed from: b */
        Matrix f65391b;

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.parser.SVG.C26445ah
        /* renamed from: a */
        public String mo93829a() {
            return "group";
        }

        C26457l() {
        }

        @Override // com.lynx.component.svg.parser.SVG.AbstractC26458m
        /* renamed from: a */
        public void mo93834a(Matrix matrix) {
            this.f65391b = matrix;
        }
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$n */
    static class C26459n extends aj implements AbstractC26458m {

        /* renamed from: a */
        String f65392a;

        /* renamed from: b */
        C26460o f65393b;

        /* renamed from: c */
        C26460o f65394c;

        /* renamed from: d */
        C26460o f65395d;

        /* renamed from: e */
        C26460o f65396e;

        /* renamed from: f */
        Matrix f65397f;

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.parser.SVG.C26445ah
        /* renamed from: a */
        public String mo93829a() {
            return "image";
        }

        C26459n() {
        }

        @Override // com.lynx.component.svg.parser.SVG.AbstractC26458m
        /* renamed from: a */
        public void mo93834a(Matrix matrix) {
            this.f65397f = matrix;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.parser.SVG$o */
    public static class C26460o implements Cloneable {

        /* renamed from: a */
        float f65398a;

        /* renamed from: b */
        am f65399b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public float mo93835a() {
            return this.f65398a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo93840b() {
            if (this.f65398a == BitmapDescriptorFactory.HUE_RED) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo93842c() {
            if (this.f65398a < BitmapDescriptorFactory.HUE_RED) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.valueOf(this.f65398a) + this.f65399b;
        }

        C26460o(float f) {
            this.f65398a = f;
            this.f65399b = am.px;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public float mo93839b(C26477e eVar) {
            if (this.f65399b != am.percent) {
                return mo93837a(eVar);
            }
            C26437a e = eVar.mo93866e();
            if (e == null) {
                return this.f65398a;
            }
            return (this.f65398a * e.f65336d) / 100.0f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public float mo93841c(C26477e eVar) {
            if (this.f65399b != am.percent) {
                return mo93837a(eVar);
            }
            C26437a e = eVar.mo93866e();
            if (e == null) {
                return this.f65398a;
            }
            float f = e.f65335c;
            float f2 = e.f65336d;
            if (f == f2) {
                return (this.f65398a * f) / 100.0f;
            }
            return (this.f65398a * ((float) (Math.sqrt((double) ((f * f) + (f2 * f2))) / 1.414213562373095d))) / 100.0f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public float mo93837a(C26477e eVar) {
            switch (C264361.f65304a[this.f65399b.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return C26960n.m97976a(this.f65398a + this.f65399b.toString(), eVar.mo93864c(), eVar.mo93863b(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                case 4:
                    return this.f65398a * eVar.mo93865d();
                case 5:
                    return this.f65398a * eVar.mo93860a();
                case 6:
                    return (this.f65398a * eVar.mo93860a()) / 2.54f;
                case 7:
                    return (this.f65398a * eVar.mo93860a()) / 25.4f;
                case 8:
                    return (this.f65398a * eVar.mo93860a()) / 72.0f;
                case 9:
                    return (this.f65398a * eVar.mo93860a()) / 6.0f;
                case 10:
                    C26437a e = eVar.mo93866e();
                    if (e == null) {
                        return this.f65398a;
                    }
                    return (this.f65398a * e.f65335c) / 100.0f;
                default:
                    return this.f65398a;
            }
        }

        C26460o(float f, am amVar) {
            this.f65398a = f;
            this.f65399b = amVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public float mo93838a(C26477e eVar, float f) {
            if (this.f65399b == am.percent) {
                return (this.f65398a * f) / 100.0f;
            }
            return mo93837a(eVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public float mo93836a(float f, float f2) {
            switch (this.f65399b) {
                case rem:
                case rpx:
                    return C26960n.m97976a(this.f65398a + this.f65399b.toString(), f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                case ex:
                default:
                    return this.f65398a;
                case in:
                    return this.f65398a * f;
                case cm:
                    return (this.f65398a * f) / 2.54f;
                case mm:
                    return (this.f65398a * f) / 25.4f;
                case pt:
                    return (this.f65398a * f) / 72.0f;
                case pc:
                    return (this.f65398a * f) / 6.0f;
            }
        }
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$p */
    static class C26461p extends AbstractC26456k {

        /* renamed from: a */
        C26460o f65400a;

        /* renamed from: b */
        C26460o f65401b;

        /* renamed from: c */
        C26460o f65402c;

        /* renamed from: d */
        C26460o f65403d;

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.parser.SVG.C26445ah
        /* renamed from: a */
        public String mo93829a() {
            return "line";
        }

        C26461p() {
        }
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$s */
    static class C26464s extends AbstractC26456k {

        /* renamed from: a */
        C26465t f65406a;

        /* renamed from: b */
        Float f65407b;

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.parser.SVG.C26445ah
        /* renamed from: a */
        public String mo93829a() {
            return "path";
        }

        C26464s() {
        }
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$v */
    static class C26467v extends al implements AbstractC26462q {

        /* renamed from: a */
        Boolean f65412a;

        /* renamed from: b */
        Boolean f65413b;

        /* renamed from: c */
        Matrix f65414c;

        /* renamed from: d */
        C26460o f65415d;

        /* renamed from: e */
        C26460o f65416e;

        /* renamed from: f */
        C26460o f65417f;

        /* renamed from: g */
        C26460o f65418g;

        /* renamed from: h */
        String f65419h;

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.parser.SVG.C26445ah
        /* renamed from: a */
        public String mo93829a() {
            return "pattern";
        }

        C26467v() {
        }
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$w */
    static class C26468w extends AbstractC26456k {

        /* renamed from: a */
        float[] f65420a;

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.parser.SVG.C26445ah
        /* renamed from: a */
        public String mo93829a() {
            return "polyline";
        }

        C26468w() {
        }
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$x */
    static class C26469x extends C26468w {
        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.parser.SVG.C26468w, com.lynx.component.svg.parser.SVG.C26445ah
        /* renamed from: a */
        public String mo93829a() {
            return "polygon";
        }

        C26469x() {
        }
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$y */
    static class C26470y extends AbstractC26456k {

        /* renamed from: a */
        C26460o f65421a;

        /* renamed from: b */
        C26460o f65422b;

        /* renamed from: c */
        C26460o f65423c;

        /* renamed from: d */
        C26460o f65424d;

        /* renamed from: f */
        C26460o f65425f;

        /* renamed from: g */
        C26460o f65426g;

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.parser.SVG.C26445ah
        /* renamed from: a */
        public String mo93829a() {
            return "rect";
        }

        C26470y() {
        }
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$z */
    static class C26471z extends AbstractC26443af implements AbstractC26441ad {
        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.parser.SVG.C26445ah
        /* renamed from: a */
        public String mo93829a() {
            return "solidColor";
        }

        @Override // com.lynx.component.svg.parser.SVG.AbstractC26441ad
        /* renamed from: a */
        public void mo93830a(C26445ah ahVar) {
        }

        C26471z() {
        }

        @Override // com.lynx.component.svg.parser.SVG.AbstractC26441ad
        /* renamed from: b */
        public List<C26445ah> mo93831b() {
            return Collections.emptyList();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C26439ab mo93818a() {
        return this.f65299a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.parser.SVG$a */
    public static class C26437a {

        /* renamed from: a */
        float f65333a;

        /* renamed from: b */
        float f65334b;

        /* renamed from: c */
        float f65335c;

        /* renamed from: d */
        float f65336d;

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public float mo93827b() {
            return this.f65334b + this.f65336d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public float mo93825a() {
            return this.f65333a + this.f65335c;
        }

        public String toString() {
            return "[" + this.f65333a + " " + this.f65334b + " " + this.f65335c + " " + this.f65336d + "]";
        }

        C26437a(C26437a aVar) {
            this.f65333a = aVar.f65333a;
            this.f65334b = aVar.f65334b;
            this.f65335c = aVar.f65335c;
            this.f65336d = aVar.f65336d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo93826a(C26437a aVar) {
            float f = aVar.f65333a;
            if (f < this.f65333a) {
                this.f65333a = f;
            }
            float f2 = aVar.f65334b;
            if (f2 < this.f65334b) {
                this.f65334b = f2;
            }
            if (aVar.mo93825a() > mo93825a()) {
                this.f65335c = aVar.mo93825a() - this.f65333a;
            }
            if (aVar.mo93827b() > mo93827b()) {
                this.f65336d = aVar.mo93827b() - this.f65334b;
            }
        }

        /* renamed from: a */
        static C26437a m95762a(float f, float f2, float f3, float f4) {
            return new C26437a(f, f2, f3 - f, f4 - f2);
        }

        C26437a(float f, float f2, float f3, float f4) {
            this.f65333a = f;
            this.f65334b = f2;
            this.f65335c = f3;
            this.f65336d = f4;
        }
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$t */
    static class C26465t implements AbstractC26466u {

        /* renamed from: a */
        private byte[] f65408a = new byte[8];

        /* renamed from: b */
        private int f65409b;

        /* renamed from: c */
        private float[] f65410c = new float[16];

        /* renamed from: d */
        private int f65411d;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo93850a() {
            if (this.f65409b == 0) {
                return true;
            }
            return false;
        }

        @Override // com.lynx.component.svg.parser.SVG.AbstractC26466u
        /* renamed from: b */
        public void mo93851b() {
            m95801a((byte) 8);
        }

        C26465t() {
        }

        /* renamed from: a */
        private void m95801a(byte b) {
            int i = this.f65409b;
            byte[] bArr = this.f65408a;
            if (i == bArr.length) {
                byte[] bArr2 = new byte[(bArr.length * 2)];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f65408a = bArr2;
            }
            byte[] bArr3 = this.f65408a;
            int i2 = this.f65409b;
            this.f65409b = i2 + 1;
            bArr3[i2] = b;
        }

        /* renamed from: a */
        private void m95802a(int i) {
            float[] fArr = this.f65410c;
            if (fArr.length < this.f65411d + i) {
                float[] fArr2 = new float[(fArr.length * 2)];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f65410c = fArr2;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo93849a(AbstractC26466u uVar) {
            int i;
            boolean z;
            boolean z2;
            int i2 = 0;
            for (int i3 = 0; i3 < this.f65409b; i3++) {
                byte b = this.f65408a[i3];
                if (b == 0) {
                    float[] fArr = this.f65410c;
                    int i4 = i2 + 1;
                    i = i4 + 1;
                    uVar.mo93845a(fArr[i2], fArr[i4]);
                } else if (b != 1) {
                    if (b == 2) {
                        float[] fArr2 = this.f65410c;
                        int i5 = i2 + 1;
                        float f = fArr2[i2];
                        int i6 = i5 + 1;
                        float f2 = fArr2[i5];
                        int i7 = i6 + 1;
                        float f3 = fArr2[i6];
                        int i8 = i7 + 1;
                        float f4 = fArr2[i7];
                        int i9 = i8 + 1;
                        float f5 = fArr2[i8];
                        i2 = i9 + 1;
                        uVar.mo93847a(f, f2, f3, f4, f5, fArr2[i9]);
                    } else if (b == 3) {
                        float[] fArr3 = this.f65410c;
                        int i10 = i2 + 1;
                        int i11 = i10 + 1;
                        int i12 = i11 + 1;
                        uVar.mo93846a(fArr3[i2], fArr3[i10], fArr3[i11], fArr3[i12]);
                        i2 = i12 + 1;
                    } else if (b != 8) {
                        if ((b & 2) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if ((b & 1) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        float[] fArr4 = this.f65410c;
                        int i13 = i2 + 1;
                        float f6 = fArr4[i2];
                        int i14 = i13 + 1;
                        float f7 = fArr4[i13];
                        int i15 = i14 + 1;
                        float f8 = fArr4[i14];
                        int i16 = i15 + 1;
                        uVar.mo93848a(f6, f7, f8, z, z2, fArr4[i15], fArr4[i16]);
                        i2 = i16 + 1;
                    } else {
                        uVar.mo93851b();
                    }
                } else {
                    float[] fArr5 = this.f65410c;
                    int i17 = i2 + 1;
                    i = i17 + 1;
                    uVar.mo93852b(fArr5[i2], fArr5[i17]);
                }
                i2 = i;
            }
        }

        @Override // com.lynx.component.svg.parser.SVG.AbstractC26466u
        /* renamed from: b */
        public void mo93852b(float f, float f2) {
            m95801a((byte) 1);
            m95802a(2);
            float[] fArr = this.f65410c;
            int i = this.f65411d;
            int i2 = i + 1;
            this.f65411d = i2;
            fArr[i] = f;
            this.f65411d = i2 + 1;
            fArr[i2] = f2;
        }

        @Override // com.lynx.component.svg.parser.SVG.AbstractC26466u
        /* renamed from: a */
        public void mo93845a(float f, float f2) {
            m95801a((byte) 0);
            m95802a(2);
            float[] fArr = this.f65410c;
            int i = this.f65411d;
            int i2 = i + 1;
            this.f65411d = i2;
            fArr[i] = f;
            this.f65411d = i2 + 1;
            fArr[i2] = f2;
        }

        @Override // com.lynx.component.svg.parser.SVG.AbstractC26466u
        /* renamed from: a */
        public void mo93846a(float f, float f2, float f3, float f4) {
            m95801a((byte) 3);
            m95802a(4);
            float[] fArr = this.f65410c;
            int i = this.f65411d;
            int i2 = i + 1;
            this.f65411d = i2;
            fArr[i] = f;
            int i3 = i2 + 1;
            this.f65411d = i3;
            fArr[i2] = f2;
            int i4 = i3 + 1;
            this.f65411d = i4;
            fArr[i3] = f3;
            this.f65411d = i4 + 1;
            fArr[i4] = f4;
        }

        @Override // com.lynx.component.svg.parser.SVG.AbstractC26466u
        /* renamed from: a */
        public void mo93847a(float f, float f2, float f3, float f4, float f5, float f6) {
            m95801a((byte) 2);
            m95802a(6);
            float[] fArr = this.f65410c;
            int i = this.f65411d;
            int i2 = i + 1;
            this.f65411d = i2;
            fArr[i] = f;
            int i3 = i2 + 1;
            this.f65411d = i3;
            fArr[i2] = f2;
            int i4 = i3 + 1;
            this.f65411d = i4;
            fArr[i3] = f3;
            int i5 = i4 + 1;
            this.f65411d = i5;
            fArr[i4] = f4;
            int i6 = i5 + 1;
            this.f65411d = i6;
            fArr[i5] = f5;
            this.f65411d = i6 + 1;
            fArr[i6] = f6;
        }

        @Override // com.lynx.component.svg.parser.SVG.AbstractC26466u
        /* renamed from: a */
        public void mo93848a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            int i;
            if (z) {
                i = 2;
            } else {
                i = 0;
            }
            m95801a((byte) (i | 4 | (z2 ? 1 : 0)));
            m95802a(5);
            float[] fArr = this.f65410c;
            int i2 = this.f65411d;
            int i3 = i2 + 1;
            this.f65411d = i3;
            fArr[i2] = f;
            int i4 = i3 + 1;
            this.f65411d = i4;
            fArr[i3] = f2;
            int i5 = i4 + 1;
            this.f65411d = i5;
            fArr[i4] = f3;
            int i6 = i5 + 1;
            this.f65411d = i6;
            fArr[i5] = f4;
            this.f65411d = i6 + 1;
            fArr[i6] = f5;
        }
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$e */
    static class C26450e extends AbstractC26446ai {

        /* renamed from: b */
        static final C26450e f65376b = new C26450e(-16777216);

        /* renamed from: c */
        static final C26450e f65377c = new C26450e(0);

        /* renamed from: a */
        int f65378a;

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.f65378a));
        }

        C26450e(int i) {
            this.f65378a = i;
        }
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$r */
    static class C26463r extends AbstractC26446ai {

        /* renamed from: a */
        String f65404a;

        /* renamed from: b */
        AbstractC26446ai f65405b;

        public String toString() {
            return this.f65404a + " " + this.f65405b;
        }

        C26463r(String str, AbstractC26446ai aiVar) {
            this.f65404a = str;
            this.f65405b = aiVar;
        }
    }

    SVG() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo93820a(C26439ab abVar) {
        this.f65299a = abVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C26445ah mo93821b(String str) {
        if (str == null) {
            return null;
        }
        String d = m95752d(str);
        if (d.length() <= 1 || !d.startsWith("#")) {
            return null;
        }
        return mo93822c(d.substring(1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public AbstractC26443af mo93822c(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f65299a.f65345k)) {
            return this.f65299a;
        }
        if (this.f65302d.containsKey(str)) {
            return this.f65302d.get(str);
        }
        AbstractC26443af a = m95748a(this.f65299a, str);
        this.f65302d.put(str, a);
        return a;
    }

    /* renamed from: a */
    public static SVG m95751a(String str) throws SVGParseException {
        return new C26482f().mo93868a(new ByteArrayInputStream(str.getBytes()));
    }

    /* renamed from: d */
    private String m95752d(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    /* renamed from: a */
    public static SVG m95749a(Context context, int i) throws SVGParseException {
        return m95750a(context.getResources(), i);
    }

    /* renamed from: a */
    public static SVG m95750a(Resources resources, int i) throws SVGParseException {
        C26482f fVar = new C26482f();
        InputStream openRawResource = resources.openRawResource(i);
        try {
            return fVar.mo93868a(openRawResource);
        } finally {
            try {
                openRawResource.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    private AbstractC26443af m95748a(AbstractC26441ad adVar, String str) {
        AbstractC26443af a;
        AbstractC26443af afVar = (AbstractC26443af) adVar;
        if (str.equals(afVar.f65345k)) {
            return afVar;
        }
        for (C26445ah ahVar : adVar.mo93831b()) {
            if (ahVar instanceof AbstractC26443af) {
                AbstractC26443af afVar2 = (AbstractC26443af) ahVar;
                if (str.equals(afVar2.f65345k)) {
                    return afVar2;
                }
                if ((ahVar instanceof AbstractC26441ad) && (a = m95748a((AbstractC26441ad) ahVar, str)) != null) {
                    return a;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public Picture mo93817a(C26476d dVar, C26428c cVar) {
        this.f65303e = dVar;
        C26437a aVar = this.f65299a.f65361r;
        if (dVar != null && dVar.mo93858a()) {
            return mo93816a((int) Math.ceil((double) dVar.f65433b.mo93825a()), (int) Math.ceil((double) dVar.f65433b.mo93827b()), dVar, cVar);
        } else if (this.f65299a.f65340c != null && this.f65299a.f65340c.f65399b != am.percent && this.f65299a.f65341d != null && this.f65299a.f65341d.f65399b != am.percent) {
            return mo93816a((int) Math.ceil((double) this.f65299a.f65340c.mo93836a(this.f65301c, dVar.mo93859b())), (int) Math.ceil((double) this.f65299a.f65341d.mo93836a(this.f65301c, dVar.mo93859b())), dVar, cVar);
        } else if (this.f65299a.f65340c != null && aVar != null) {
            float a = this.f65299a.f65340c.mo93836a(this.f65301c, dVar.mo93859b());
            return mo93816a((int) Math.ceil((double) a), (int) Math.ceil((double) ((aVar.f65336d * a) / aVar.f65335c)), dVar, cVar);
        } else if (this.f65299a.f65341d == null || aVar == null) {
            return mo93816a(MediaPlayer.MEDIA_PLAYER_OPTION_APPID, MediaPlayer.MEDIA_PLAYER_OPTION_APPID, dVar, cVar);
        } else {
            float a2 = this.f65299a.f65341d.mo93836a(this.f65301c, dVar.mo93859b());
            return mo93816a((int) Math.ceil((double) ((aVar.f65335c * a2) / aVar.f65336d)), (int) Math.ceil((double) a2), dVar, cVar);
        }
    }

    /* renamed from: a */
    public void mo93819a(Canvas canvas, C26476d dVar, C26428c cVar) {
        if (dVar == null) {
            dVar = new C26476d(14.0f);
        }
        this.f65303e = dVar;
        if (!dVar.mo93858a()) {
            dVar.mo93857a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) canvas.getWidth(), (float) canvas.getHeight());
        }
        new C26477e(canvas, this.f65301c, dVar.mo93859b(), cVar).mo93862a(this, dVar);
    }

    /* renamed from: com.lynx.component.svg.parser.SVG$b */
    static class C26447b {

        /* renamed from: a */
        C26460o f65368a;

        /* renamed from: b */
        C26460o f65369b;

        /* renamed from: c */
        C26460o f65370c;

        /* renamed from: d */
        C26460o f65371d;

        C26447b(C26460o oVar, C26460o oVar2, C26460o oVar3, C26460o oVar4) {
            this.f65368a = oVar;
            this.f65369b = oVar2;
            this.f65370c = oVar3;
            this.f65371d = oVar4;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Picture mo93816a(int i, int i2, C26476d dVar, C26428c cVar) {
        this.f65303e = dVar;
        Picture picture = new Picture();
        Canvas beginRecording = picture.beginRecording(i, i2);
        if (dVar == null || dVar.f65433b == null) {
            if (dVar == null) {
                dVar = new C26476d(14.0f);
            } else {
                dVar = new C26476d(dVar);
            }
            dVar.mo93857a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) i, (float) i2);
        }
        new C26477e(beginRecording, this.f65301c, dVar.mo93859b(), cVar).mo93862a(this, dVar);
        picture.endRecording();
        return picture;
    }
}
