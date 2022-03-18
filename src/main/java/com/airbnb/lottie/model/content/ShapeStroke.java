package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC1852a;
import com.airbnb.lottie.model.p073a.C1819a;
import com.airbnb.lottie.model.p073a.C1820b;
import com.airbnb.lottie.model.p073a.C1822d;
import com.airbnb.lottie.p067a.p068a.AbstractC1739c;
import com.airbnb.lottie.p067a.p068a.C1756r;
import java.util.List;

public class ShapeStroke implements AbstractC1837b {

    /* renamed from: a */
    private final String f6296a;

    /* renamed from: b */
    private final C1820b f6297b;

    /* renamed from: c */
    private final List<C1820b> f6298c;

    /* renamed from: d */
    private final C1819a f6299d;

    /* renamed from: e */
    private final C1822d f6300e;

    /* renamed from: f */
    private final C1820b f6301f;

    /* renamed from: g */
    private final LineCapType f6302g;

    /* renamed from: h */
    private final LineJoinType f6303h;

    /* renamed from: i */
    private final float f6304i;

    /* renamed from: j */
    private final boolean f6305j;

    /* renamed from: a */
    public String mo9175a() {
        return this.f6296a;
    }

    /* renamed from: b */
    public C1819a mo9176b() {
        return this.f6299d;
    }

    /* renamed from: c */
    public C1822d mo9177c() {
        return this.f6300e;
    }

    /* renamed from: d */
    public C1820b mo9178d() {
        return this.f6301f;
    }

    /* renamed from: e */
    public List<C1820b> mo9179e() {
        return this.f6298c;
    }

    /* renamed from: f */
    public C1820b mo9180f() {
        return this.f6297b;
    }

    /* renamed from: g */
    public LineCapType mo9181g() {
        return this.f6302g;
    }

    /* renamed from: h */
    public LineJoinType mo9182h() {
        return this.f6303h;
    }

    /* renamed from: i */
    public float mo9183i() {
        return this.f6304i;
    }

    /* renamed from: j */
    public boolean mo9184j() {
        return this.f6305j;
    }

    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i = C18351.f6306a[ordinal()];
            if (i == 1) {
                return Paint.Cap.BUTT;
            }
            if (i != 2) {
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }
    }

    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i = C18351.f6307b[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    /* renamed from: com.airbnb.lottie.model.content.ShapeStroke$1 */
    static /* synthetic */ class C18351 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6306a;

        /* renamed from: b */
        static final /* synthetic */ int[] f6307b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.airbnb.lottie.model.content.ShapeStroke$LineJoinType[] r0 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.airbnb.lottie.model.content.ShapeStroke.C18351.f6307b = r0
                r1 = 1
                com.airbnb.lottie.model.content.ShapeStroke$LineJoinType r2 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.BEVEL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.airbnb.lottie.model.content.ShapeStroke.C18351.f6307b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.content.ShapeStroke$LineJoinType r3 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.MITER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = com.airbnb.lottie.model.content.ShapeStroke.C18351.f6307b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.model.content.ShapeStroke$LineJoinType r4 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.ROUND     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.airbnb.lottie.model.content.ShapeStroke$LineCapType[] r3 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.airbnb.lottie.model.content.ShapeStroke.C18351.f6306a = r3
                com.airbnb.lottie.model.content.ShapeStroke$LineCapType r4 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.BUTT     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = com.airbnb.lottie.model.content.ShapeStroke.C18351.f6306a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.airbnb.lottie.model.content.ShapeStroke$LineCapType r3 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.ROUND     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = com.airbnb.lottie.model.content.ShapeStroke.C18351.f6306a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.airbnb.lottie.model.content.ShapeStroke$LineCapType r1 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.content.ShapeStroke.C18351.<clinit>():void");
        }
    }

    @Override // com.airbnb.lottie.model.content.AbstractC1837b
    /* renamed from: a */
    public AbstractC1739c mo9140a(LottieDrawable lottieDrawable, AbstractC1852a aVar) {
        return new C1756r(lottieDrawable, aVar, this);
    }

    public ShapeStroke(String str, C1820b bVar, List<C1820b> list, C1819a aVar, C1822d dVar, C1820b bVar2, LineCapType lineCapType, LineJoinType lineJoinType, float f, boolean z) {
        this.f6296a = str;
        this.f6297b = bVar;
        this.f6298c = list;
        this.f6299d = aVar;
        this.f6300e = dVar;
        this.f6301f = bVar2;
        this.f6302g = lineCapType;
        this.f6303h = lineJoinType;
        this.f6304i = f;
        this.f6305j = z;
    }
}
