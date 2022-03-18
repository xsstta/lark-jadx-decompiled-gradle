package com.ss.android.lark.ai.textcorrection;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.NoCopySpan;
import android.text.style.ReplacementSpan;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJP\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\fH\u0016J4\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010'H\u0016R\u0012\u0010\u0006\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006)"}, d2 = {"Lcom/ss/android/lark/ai/textcorrection/UnderlineSpan;", "Landroid/text/style/ReplacementSpan;", "Landroid/text/NoCopySpan;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "color", "", "lineWidth", "(Landroid/content/Context;II)V", "highlightColorInt", "highlightPaint", "Landroid/graphics/Paint;", "linePaint", "offsetY", "path", "Landroid/graphics/Path;", "showHighlight", "", "getShowHighlight", "()Z", "setShowHighlight", "(Z)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "end", "x", "", "top", "y", "bottom", "paint", "getSize", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "Companion", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ai.e.j */
public class UnderlineSpan extends ReplacementSpan implements NoCopySpan {

    /* renamed from: a */
    public static final Companion f71773a = new Companion(null);

    /* renamed from: b */
    private final Path f71774b = new Path();

    /* renamed from: c */
    private final int f71775c;

    /* renamed from: d */
    private int f71776d;

    /* renamed from: e */
    private int f71777e;

    /* renamed from: f */
    private Paint f71778f;

    /* renamed from: g */
    private final int f71779g;

    /* renamed from: h */
    private Paint f71780h;

    /* renamed from: i */
    private boolean f71781i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ai/textcorrection/UnderlineSpan$Companion;", "", "()V", "TAG", "", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.e.j$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo101664a(boolean z) {
        this.f71781i = z;
    }

    public UnderlineSpan(Context context, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f71775c = UIUtils.dp2px(context, 3.0f);
        this.f71776d = i;
        this.f71777e = i2;
        Paint paint = new Paint();
        this.f71778f = paint;
        paint.setAntiAlias(true);
        this.f71778f.setColor(i);
        this.f71778f.setStyle(Paint.Style.STROKE);
        this.f71778f.setStrokeWidth((float) i2);
        int a = C25653b.m91894a(context, R.color.lkui_R500, 0.2f);
        this.f71779g = a;
        Paint paint2 = new Paint();
        this.f71780h = paint2;
        paint2.setAntiAlias(true);
        this.f71780h.setColor(a);
        this.f71780h.setStyle(Paint.Style.FILL);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        return (int) paint.measureText(charSequence, i, i2);
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(charSequence, "text");
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        float f2 = (float) i4;
        canvas.drawText(charSequence, i, i2, f, f2, paint);
        float measureText = paint.measureText(charSequence, i, i2);
        this.f71774b.reset();
        this.f71774b.moveTo(f, ((float) this.f71775c) + f2);
        float f3 = measureText + f;
        this.f71774b.lineTo(f3, f2 + ((float) this.f71775c));
        canvas.drawPath(this.f71774b, this.f71778f);
        if (this.f71781i) {
            canvas.drawRect(new RectF(f, (float) i3, f3, (float) i5), this.f71780h);
        }
    }
}
