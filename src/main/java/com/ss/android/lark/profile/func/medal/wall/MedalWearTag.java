package com.ss.android.lark.profile.func.medal.wall;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0002J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J(\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0013\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001a\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/wall/MedalWearTag;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bgPaint", "Landroid/graphics/Paint;", "endColor", "linePath", "Landroid/graphics/Path;", "getLinePath", "()Landroid/graphics/Path;", "linePath$delegate", "Lkotlin/Lazy;", "path", "getPath", "path$delegate", "shapeDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "getShapeDrawable", "()Landroid/graphics/drawable/ShapeDrawable;", "shapeDrawable$delegate", "startColor", "tagText", "", "textPaint", "initBgPaint", "paint", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "w", C14002h.f36692e, "oldw", "oldh", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MedalWearTag extends View {

    /* renamed from: c */
    public static final Companion f129830c = new Companion(null);

    /* renamed from: a */
    public String f129831a;

    /* renamed from: b */
    public final Paint f129832b;

    /* renamed from: d */
    private final int f129833d;

    /* renamed from: e */
    private final int f129834e;

    /* renamed from: f */
    private final Lazy f129835f;

    /* renamed from: g */
    private final Lazy f129836g;

    /* renamed from: h */
    private final Lazy f129837h;

    /* renamed from: i */
    private final Paint f129838i;

    public MedalWearTag(Context context) {
        this(context, null, 0, 6, null);
    }

    public MedalWearTag(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final Path getLinePath() {
        return (Path) this.f129836g.getValue();
    }

    private final ShapeDrawable getShapeDrawable() {
        return (ShapeDrawable) this.f129837h.getValue();
    }

    public final Path getPath() {
        return (Path) this.f129835f.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/wall/MedalWearTag$Companion;", "", "()V", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.MedalWearTag$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Path;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.MedalWearTag$b */
    static final class C52390b extends Lambda implements Function0<Path> {
        final /* synthetic */ MedalWearTag this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52390b(MedalWearTag medalWearTag) {
            super(0);
            this.this$0 = medalWearTag;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Path invoke() {
            Path path = new Path();
            float measureText = this.this$0.f129832b.measureText(this.this$0.f129831a);
            double d = ((double) (measureText / ((float) 2))) * 0.7d;
            path.moveTo((float) (((double) (this.this$0.getMeasuredWidth() / 2)) - d), (float) (((double) (this.this$0.getMeasuredHeight() / 2)) + d));
            path.lineTo((float) this.this$0.getMeasuredWidth(), BitmapDescriptorFactory.HUE_RED);
            return path;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/ShapeDrawable;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.MedalWearTag$d */
    static final class C52392d extends Lambda implements Function0<ShapeDrawable> {
        final /* synthetic */ MedalWearTag this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52392d(MedalWearTag medalWearTag) {
            super(0);
            this.this$0 = medalWearTag;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ShapeDrawable invoke() {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new PathShape(this.this$0.getPath(), (float) this.this$0.getMeasuredWidth(), (float) this.this$0.getMeasuredHeight()));
            MedalWearTag medalWearTag = this.this$0;
            Paint paint = shapeDrawable.getPaint();
            Intrinsics.checkExpressionValueIsNotNull(paint, "paint");
            medalWearTag.mo179325a(paint);
            return shapeDrawable;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Path;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.MedalWearTag$c */
    static final class C52391c extends Lambda implements Function0<Path> {
        final /* synthetic */ MedalWearTag this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52391c(MedalWearTag medalWearTag) {
            super(0);
            this.this$0 = medalWearTag;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Path invoke() {
            Path path = new Path();
            path.moveTo(BitmapDescriptorFactory.HUE_RED, (float) (this.this$0.getMeasuredHeight() / 2));
            path.lineTo((float) (this.this$0.getMeasuredWidth() / 2), BitmapDescriptorFactory.HUE_RED);
            path.lineTo((float) this.this$0.getMeasuredWidth(), BitmapDescriptorFactory.HUE_RED);
            path.lineTo(BitmapDescriptorFactory.HUE_RED, (float) this.this$0.getMeasuredHeight());
            path.lineTo(BitmapDescriptorFactory.HUE_RED, (float) (this.this$0.getMeasuredHeight() / 2));
            path.close();
            return path;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (canvas != null) {
            getShapeDrawable().draw(canvas);
            canvas.drawTextOnPath(this.f129831a, getLinePath(), BitmapDescriptorFactory.HUE_RED, -((float) UIHelper.dp2px(3.0f)), this.f129832b);
        }
    }

    /* renamed from: a */
    public final Paint mo179325a(Paint paint) {
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(1.0f);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        paint.setColor(UDColorUtils.getColor(context, R.color.ud_G400));
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setShader(new LinearGradient((float) (getMeasuredWidth() / 2), (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, (float) getMeasuredHeight(), this.f129833d, this.f129834e, Shader.TileMode.CLAMP));
        return paint;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MedalWearTag(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = "";
        this.f129831a = str;
        this.f129833d = UDColorUtils.getColor(context, R.color.ud_G500);
        this.f129834e = UDColorUtils.getColor(context, R.color.ud_G400);
        this.f129835f = LazyKt.lazy(new C52391c(this));
        this.f129836g = LazyKt.lazy(new C52390b(this));
        this.f129837h = LazyKt.lazy(new C52392d(this));
        this.f129838i = mo179325a(new Paint());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.tag_text}, 0, 0);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr…eable.MedalWearTag, 0, 0)");
        String string = obtainStyledAttributes.getString(0);
        this.f129831a = string != null ? string : str;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(5.0f);
        paint.setColor(UDColorUtils.getColor(context, R.color.static_white));
        paint.setTextSize((float) UIHelper.dp2px(12.0f));
        this.f129832b = paint;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        getShapeDrawable().setBounds(0, 0, i, i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MedalWearTag(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
