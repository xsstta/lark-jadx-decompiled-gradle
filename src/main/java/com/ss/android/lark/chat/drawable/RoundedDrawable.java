package com.ss.android.lark.chat.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 O2\u00020\u0001:\u0001OB1\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB;\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fBK\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0002\u0010\u0010BU\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\b\b\u0001\u0010\u0017\u001a\u00020\b\u0012\b\b\u0001\u0010\u0018\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b¢\u0006\u0002\u0010\u001aJ\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0002J(\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0003H\u0002J\b\u00107\u001a\u00020\u001cH\u0002J\b\u00108\u001a\u00020'H\u0002J\b\u00109\u001a\u00020\bH\u0016J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001e0;H\u0002J.\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001e0;2\u0006\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u0003H\u0002J\b\u0010A\u001a\u00020.H\u0002J\u0010\u0010B\u001a\u00020.2\u0006\u0010C\u001a\u00020\bH\u0016J\u0010\u0010D\u001a\u00020.2\u0006\u0010E\u001a\u00020FH\u0016J(\u0010D\u001a\u00020.2\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\b2\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u00020\bH\u0016J\u0012\u0010G\u001a\u00020.2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J,\u0010J\u001a\u00020.*\u00020\u001e2\u0006\u0010K\u001a\u00020\u00032\u0006\u0010L\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\bH\u0002R\u000e\u0010\u0015\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u000e\u0010$\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020)X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010,X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006P"}, d2 = {"Lcom/ss/android/lark/chat/drawable/RoundedDrawable;", "Landroid/graphics/drawable/Drawable;", "leftTopRadius", "", "leftBottomRadius", "rightTopRadius", "rightBottomRadius", "solidColor", "", "(FFFFI)V", "solidStartColor", "solidEndColor", "(FFFFII)V", "borderColor", "borderWidth", "excludeLine", "(FFFFIIII)V", "mLeftTopRadius", "mLeftBottomRadius", "mRightTopRadius", "mRightBottomRadius", "mBorderColor", "mBorderWidth", "mSolidStartColor", "mSolidEndColor", "mExcludeLine", "(FFFFIIIII)V", "mBorderPaint", "Landroid/graphics/Paint;", "mBorderPath", "Landroid/graphics/Path;", "mClearPaint", "getMClearPaint", "()Landroid/graphics/Paint;", "mClearPaint$delegate", "Lkotlin/Lazy;", "mClearPath", "mGradientPaint", "mGradientShader", "Landroid/graphics/LinearGradient;", "mNeedAdaptBorderWidth", "", "mNeedClip", "mPathExcludeSpecLineList", "", "draw", "", "canvas", "Landroid/graphics/Canvas;", "drawBorderPath", "getClipPath", "left", "top", "right", "bottom", "getGradientPaint", "getGradientShader", "getOpacity", "getPathExcludeSpecLine", "", "getSplitPaths", "x1", "y1", "x2", "y2", "resetDrawCache", "setAlpha", "alpha", "setBounds", "bounds", "Landroid/graphics/Rect;", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "arcTo", "x", "y", "radius", "rotations", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.b.b */
public final class RoundedDrawable extends Drawable {

    /* renamed from: a */
    public static final Companion f84569a = new Companion(null);

    /* renamed from: b */
    private List<Path> f84570b;

    /* renamed from: c */
    private Paint f84571c;

    /* renamed from: d */
    private Path f84572d;

    /* renamed from: e */
    private LinearGradient f84573e;

    /* renamed from: f */
    private Paint f84574f;

    /* renamed from: g */
    private boolean f84575g;

    /* renamed from: h */
    private boolean f84576h;

    /* renamed from: i */
    private final Path f84577i;

    /* renamed from: j */
    private final Lazy f84578j;

    /* renamed from: k */
    private final float f84579k;

    /* renamed from: l */
    private final float f84580l;

    /* renamed from: m */
    private final float f84581m;

    /* renamed from: n */
    private final float f84582n;

    /* renamed from: o */
    private final int f84583o;

    /* renamed from: p */
    private final int f84584p;

    /* renamed from: q */
    private final int f84585q;

    /* renamed from: r */
    private final int f84586r;

    /* renamed from: s */
    private final int f84587s;

    /* renamed from: a */
    private final Paint m126752a() {
        return (Paint) this.f84578j.getValue();
    }

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/chat/drawable/RoundedDrawable$Companion;", "", "()V", "EXCLUDE_BOTTOM", "", "EXCLUDE_LEFT", "EXCLUDE_NONE", "EXCLUDE_RIGHT", "EXCLUDE_TOP", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.b.b$b */
    static final class C32914b extends Lambda implements Function0<Paint> {
        public static final C32914b INSTANCE = new C32914b();

        C32914b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Paint invoke() {
            Paint paint = new Paint(1);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            return paint;
        }
    }

    /* renamed from: b */
    private final Paint m126756b() {
        Paint paint = this.f84574f;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        paint2.setShader(m126758c());
        paint2.setAntiAlias(true);
        this.f84574f = paint2;
        return paint2;
    }

    /* renamed from: c */
    private final LinearGradient m126758c() {
        LinearGradient linearGradient = this.f84573e;
        if (linearGradient != null) {
            return linearGradient;
        }
        LinearGradient linearGradient2 = new LinearGradient((float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, (float) getBounds().width(), (float) BitmapDescriptorFactory.HUE_RED, this.f84585q, this.f84586r, Shader.TileMode.MIRROR);
        this.f84573e = linearGradient2;
        return linearGradient2;
    }

    /* renamed from: d */
    private final void m126759d() {
        this.f84570b = null;
        this.f84572d = null;
        this.f84574f = null;
        this.f84573e = null;
    }

    /* renamed from: e */
    private final List<Path> m126760e() {
        List<Path> list = this.f84570b;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.f84570b = arrayList;
        int i = this.f84587s;
        if (i == 1) {
            arrayList.addAll(m126757b((float) getBounds().width(), this.f84581m, (float) getBounds().width(), ((float) getBounds().height()) - this.f84582n));
            Path path = new Path();
            path.moveTo((float) getBounds().width(), ((float) getBounds().height()) - this.f84582n);
            float f = this.f84582n;
            m126755a(path, ((float) getBounds().width()) - this.f84582n, ((float) getBounds().height()) - f, f, 0);
            path.lineTo(this.f84580l, (float) getBounds().height());
            float f2 = this.f84580l;
            float f3 = this.f84580l;
            m126755a(path, f2, ((float) getBounds().height()) - f3, f3, 1);
            arrayList.add(path);
            arrayList.addAll(m126757b(BitmapDescriptorFactory.HUE_RED, ((float) getBounds().height()) - this.f84580l, BitmapDescriptorFactory.HUE_RED, this.f84579k));
        } else if (i == 2) {
            arrayList.addAll(m126757b(BitmapDescriptorFactory.HUE_RED, ((float) getBounds().height()) - this.f84580l, BitmapDescriptorFactory.HUE_RED, this.f84579k));
            Path path2 = new Path();
            path2.moveTo(BitmapDescriptorFactory.HUE_RED, this.f84579k);
            float f4 = this.f84579k;
            m126755a(path2, f4, f4, f4, 2);
            path2.lineTo(((float) getBounds().width()) - this.f84581m, BitmapDescriptorFactory.HUE_RED);
            float f5 = this.f84581m;
            m126755a(path2, ((float) getBounds().width()) - f5, f5, f5, 3);
            arrayList.add(path2);
            arrayList.addAll(m126757b((float) getBounds().width(), this.f84581m, (float) getBounds().width(), ((float) getBounds().height()) - this.f84582n));
        } else if (i == 3) {
            Path path3 = new Path();
            path3.moveTo(this.f84579k, BitmapDescriptorFactory.HUE_RED);
            path3.lineTo(((float) getBounds().width()) - this.f84581m, BitmapDescriptorFactory.HUE_RED);
            float f6 = this.f84581m;
            m126755a(path3, ((float) getBounds().width()) - f6, f6, f6, -1);
            arrayList.add(path3);
            arrayList.addAll(m126757b((float) getBounds().width(), this.f84581m, (float) getBounds().width(), ((float) getBounds().height()) - this.f84582n));
            Path path4 = new Path();
            path4.moveTo((float) getBounds().width(), ((float) getBounds().height()) - this.f84582n);
            float f7 = this.f84582n;
            m126755a(path4, ((float) getBounds().width()) - this.f84582n, ((float) getBounds().height()) - f7, f7, 0);
            path4.lineTo(this.f84580l, (float) getBounds().height());
            arrayList.add(path4);
        } else if (i != 4) {
            arrayList.addAll(m126757b((float) getBounds().width(), this.f84581m, (float) getBounds().width(), ((float) getBounds().height()) - this.f84582n));
            Path path5 = new Path();
            path5.moveTo((float) getBounds().width(), ((float) getBounds().height()) - this.f84582n);
            float f8 = this.f84582n;
            m126755a(path5, ((float) getBounds().width()) - this.f84582n, ((float) getBounds().height()) - f8, f8, 0);
            path5.lineTo(this.f84580l, (float) getBounds().height());
            float f9 = this.f84580l;
            float f10 = this.f84580l;
            m126755a(path5, f9, ((float) getBounds().height()) - f10, f10, 1);
            arrayList.add(path5);
            arrayList.addAll(m126757b(BitmapDescriptorFactory.HUE_RED, ((float) getBounds().height()) - this.f84580l, BitmapDescriptorFactory.HUE_RED, this.f84579k));
            Path path6 = new Path();
            path6.moveTo(BitmapDescriptorFactory.HUE_RED, this.f84579k);
            float f11 = this.f84579k;
            m126755a(path6, f11, f11, f11, 2);
            path6.lineTo(((float) getBounds().width()) - this.f84581m, BitmapDescriptorFactory.HUE_RED);
            float f12 = this.f84581m;
            m126755a(path6, ((float) getBounds().width()) - f12, f12, this.f84582n, 3);
            arrayList.add(path6);
        } else {
            Path path7 = new Path();
            path7.moveTo(((float) getBounds().width()) - this.f84582n, (float) getBounds().height());
            path7.lineTo(this.f84580l, (float) getBounds().height());
            float f13 = this.f84580l;
            float f14 = this.f84580l;
            m126755a(path7, f13, ((float) getBounds().height()) - f14, f14, 1);
            arrayList.add(path7);
            arrayList.addAll(m126757b(BitmapDescriptorFactory.HUE_RED, ((float) getBounds().height()) - this.f84580l, BitmapDescriptorFactory.HUE_RED, this.f84579k));
            Path path8 = new Path();
            path8.moveTo(BitmapDescriptorFactory.HUE_RED, this.f84579k);
            float f15 = this.f84579k;
            m126755a(path8, f15, f15, f15, 2);
            path8.lineTo(((float) getBounds().width()) - this.f84581m, BitmapDescriptorFactory.HUE_RED);
            arrayList.add(path8);
        }
        return arrayList;
    }

    public void setBounds(Rect rect) {
        Intrinsics.checkParameterIsNotNull(rect, "bounds");
        if (!Intrinsics.areEqual(rect, getBounds())) {
            m126759d();
        }
        super.setBounds(rect);
    }

    /* renamed from: a */
    private final void m126754a(Canvas canvas) {
        if (this.f84584p > 0) {
            Paint paint = this.f84571c;
            if (paint == null) {
                paint = new Paint();
                paint.setStyle(Paint.Style.STROKE);
                paint.setAntiAlias(true);
                paint.setStrokeWidth((float) this.f84584p);
                if (this.f84576h) {
                    paint.setStrokeWidth(paint.getStrokeWidth() * ((float) 2));
                }
                this.f84571c = paint;
            }
            paint.setColor(this.f84583o);
            for (Path path : m126760e()) {
                canvas.drawPath(path, paint);
            }
        }
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        if (this.f84575g) {
            int saveLayer = canvas.saveLayer((float) getBounds().left, (float) getBounds().top, (float) getBounds().right, (float) getBounds().bottom, null);
            canvas.clipRect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
            canvas.drawPaint(m126756b());
            m126754a(canvas);
            this.f84577i.reset();
            this.f84577i.set(m126753a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getBounds().width(), (float) getBounds().height()));
            this.f84577i.toggleInverseFillType();
            canvas.drawPath(this.f84577i, m126752a());
            canvas.restoreToCount(saveLayer);
            return;
        }
        int save = canvas.save();
        canvas.clipRect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        canvas.drawPaint(m126756b());
        m126754a(canvas);
        canvas.restoreToCount(save);
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        if (!(i == getBounds().left && i3 == getBounds().right && i2 == getBounds().top && i4 == getBounds().bottom)) {
            m126759d();
        }
        super.setBounds(i, i2, i3, i4);
    }

    /* renamed from: a */
    private final Path m126753a(float f, float f2, float f3, float f4) {
        Path path = this.f84572d;
        if (path != null) {
            return path;
        }
        Path path2 = new Path();
        this.f84572d = path2;
        float f5 = this.f84579k;
        float f6 = this.f84581m;
        float f7 = this.f84582n;
        float f8 = this.f84580l;
        path2.reset();
        float f9 = f + f5;
        path2.moveTo(f9, f2);
        float f10 = f3 - f6;
        path2.lineTo(f10, f2);
        m126755a(path2, f10, f2 + f6, f6, -1);
        float f11 = f4 - f7;
        path2.lineTo(f3, f11);
        m126755a(path2, f3 - f7, f11, f7, 0);
        float f12 = f + f8;
        path2.lineTo(f12, f4);
        m126755a(path2, f12, f4 - f8, f8, 1);
        float f13 = f2 + f5;
        path2.lineTo(f, f13);
        m126755a(path2, f9, f13, f5, 2);
        path2.lineTo(f9, f2);
        path2.close();
        return path2;
    }

    /* renamed from: b */
    private final List<Path> m126757b(float f, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        float f5 = f3 - f;
        float f6 = f4 - f2;
        int max = (int) (Math.max(Math.abs(f5), Math.abs(f6)) / ((float) 100));
        if (max == 0) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            arrayList.add(path);
            return arrayList;
        }
        if (1 <= max) {
            int i = 1;
            while (true) {
                Path path2 = new Path();
                path2.moveTo(f, f2);
                float f7 = (float) 1;
                float f8 = (float) max;
                f += (f5 * f7) / f8;
                f2 += (f7 * f6) / f8;
                path2.lineTo(f, f2);
                arrayList.add(path2);
                if (i == max) {
                    break;
                }
                i++;
            }
        }
        Path path3 = new Path();
        path3.moveTo(f, f2);
        path3.lineTo(f3, f4);
        arrayList.add(path3);
        return arrayList;
    }

    public RoundedDrawable(float f, float f2, float f3, float f4, int i) {
        this(f, f2, f3, f4, 0, 0, i, i, 0);
    }

    /* renamed from: a */
    private final void m126755a(Path path, float f, float f2, float f3, int i) {
        path.arcTo(f - f3, f2 - f3, f + f3, f2 + f3, ((float) i) * 90.0f, 90.0f, false);
    }

    public RoundedDrawable(float f, float f2, float f3, float f4, int i, int i2) {
        this(f, f2, f3, f4, 0, 0, i, i2, 0);
    }

    public RoundedDrawable(float f, float f2, float f3, float f4, int i, int i2, int i3, int i4) {
        this(f, f2, f3, f4, i, i2, i3, i3, i4);
    }

    public RoundedDrawable(float f, float f2, float f3, float f4, int i, int i2, int i3, int i4, int i5) {
        this.f84579k = f;
        this.f84580l = f2;
        this.f84581m = f3;
        this.f84582n = f4;
        this.f84583o = i;
        this.f84584p = i2;
        this.f84585q = i3;
        this.f84586r = i4;
        this.f84587s = i5;
        this.f84576h = true;
        this.f84577i = new Path();
        this.f84578j = LazyKt.lazy(C32914b.INSTANCE);
    }
}
