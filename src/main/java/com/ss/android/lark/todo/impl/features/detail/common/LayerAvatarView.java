package com.ss.android.lark.todo.impl.features.detail.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.ttve.utils.C60275a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 A2\u00020\u0001:\u0001AB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0002J\u0012\u00103\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u000102H\u0002J\u0012\u00104\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u000102H\u0002J\b\u00105\u001a\u00020\tH\u0002J\b\u00106\u001a\u00020\tH\u0002J\u0012\u00107\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u000102H\u0014J\u0018\u00108\u001a\u00020.2\u0006\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020\tH\u0014J \u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\tH\u0002J\u0014\u0010?\u001a\u00020.2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013R\u000e\u0010\u000b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001a\u0010\u001e\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\u0011R\u001a\u0010'\u001a\u00020(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006B"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/common/LayerAvatarView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mBgBorderColor", "mBoarderSize", "", "getMBoarderSize", "()F", "setMBoarderSize", "(F)V", "mDisplayIcons", "", "Landroid/graphics/Bitmap;", "getMDisplayIcons", "()Ljava/util/List;", "setMDisplayIcons", "(Ljava/util/List;)V", "mIconBoarderPaint", "Landroid/graphics/Paint;", "mIconCoverMargin", "getMIconCoverMargin", "setMIconCoverMargin", "mIconLimit", "getMIconLimit", "()I", "setMIconLimit", "(I)V", "mIconPaint", "mIconSize", "getMIconSize", "setMIconSize", "mPaddingRect", "Landroid/graphics/Rect;", "getMPaddingRect", "()Landroid/graphics/Rect;", "setMPaddingRect", "(Landroid/graphics/Rect;)V", "drawImage", "", "leftTop", "", "canvas", "Landroid/graphics/Canvas;", "drawImageLeftTop", "drawImageRightTop", "getContentHeight", "getContentWidth", "onDraw", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setViewSize", "mode", "size", "contentSize", "updateData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LayerAvatarView extends View {

    /* renamed from: a */
    public static final Companion f139911a = new Companion(null);

    /* renamed from: k */
    private static final Rect f139912k = new Rect(10, 6, 10, 6);

    /* renamed from: b */
    private final Paint f139913b;

    /* renamed from: c */
    private final Paint f139914c;

    /* renamed from: d */
    private float f139915d;

    /* renamed from: e */
    private float f139916e;

    /* renamed from: f */
    private float f139917f;

    /* renamed from: g */
    private List<Bitmap> f139918g;

    /* renamed from: h */
    private int f139919h;

    /* renamed from: i */
    private final int f139920i;

    /* renamed from: j */
    private Rect f139921j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/common/LayerAvatarView$Companion;", "", "()V", "DEFAULT_BOARDER", "", "DEFAULT_ICON_SIZE", "DEFAULT_PADDING", "Landroid/graphics/Rect;", "ICON_COVER_MARGIN", "ICON_DISPLAY_LIMIT", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.common.LayerAvatarView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final float getMBoarderSize() {
        return this.f139917f;
    }

    public final List<Bitmap> getMDisplayIcons() {
        return this.f139918g;
    }

    public final float getMIconCoverMargin() {
        return this.f139916e;
    }

    public final int getMIconLimit() {
        return this.f139919h;
    }

    public final float getMIconSize() {
        return this.f139915d;
    }

    public final Rect getMPaddingRect() {
        return this.f139921j;
    }

    private final int getContentHeight() {
        int i = this.f139921j.top + 0 + this.f139921j.bottom;
        boolean isEmpty = CollectionUtils.isEmpty(this.f139918g);
        float f = BitmapDescriptorFactory.HUE_RED;
        if (!isEmpty) {
            f = Math.max((float) BitmapDescriptorFactory.HUE_RED, this.f139915d + (this.f139917f * ((float) 2)));
        }
        return i + ((int) f);
    }

    private final int getContentWidth() {
        int i;
        int i2 = this.f139921j.left + 0 + this.f139921j.right;
        if (CollectionUtils.isEmpty(this.f139918g) || (i = this.f139919h) <= 0) {
            return i2;
        }
        int min = Math.min(i, this.f139918g.size());
        return i2 + ((int) (((this.f139915d + (this.f139917f * ((float) 2))) * ((float) min)) - (this.f139916e * ((float) (min - 1)))));
    }

    public final void setMBoarderSize(float f) {
        this.f139917f = f;
    }

    public final void setMIconCoverMargin(float f) {
        this.f139916e = f;
    }

    public final void setMIconLimit(int i) {
        this.f139919h = i;
    }

    public final void setMIconSize(float f) {
        this.f139915d = f;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m220372a(false, canvas);
    }

    public final void setMDisplayIcons(List<Bitmap> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f139918g = list;
    }

    public final void setMPaddingRect(Rect rect) {
        Intrinsics.checkParameterIsNotNull(rect, "<set-?>");
        this.f139921j = rect;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LayerAvatarView(Context context) {
        this(context, null, -1);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo192511a(List<Bitmap> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f139918g = list;
        requestLayout();
    }

    /* renamed from: a */
    private final void m220371a(Canvas canvas) {
        float f;
        float f2;
        if (!CollectionUtils.isEmpty(this.f139918g) && canvas != null) {
            float f3 = (float) 2;
            float height = ((float) (canvas.getHeight() / 2)) - ((this.f139915d + this.f139917f) / f3);
            float width = (((float) (canvas.getWidth() - this.f139921j.right)) - this.f139915d) - (this.f139917f * f3);
            for (int min = Math.min(this.f139918g.size(), 3) - 1; min >= 0; min--) {
                int saveLayer = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) canvas.getWidth(), (float) canvas.getHeight(), null, 31);
                Bitmap bitmap = this.f139918g.get(min);
                if (bitmap == null) {
                    f2 = this.f139915d + (this.f139917f * f3);
                    f = this.f139916e;
                } else {
                    float f4 = this.f139915d + (this.f139917f * f3);
                    RectF rectF = new RectF(width, height, width + f4, f4 + height);
                    Xfermode xfermode = null;
                    this.f139914c.setXfermode(xfermode);
                    canvas.drawOval(rectF, this.f139914c);
                    this.f139914c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, (Rect) null, rectF, this.f139914c);
                    this.f139914c.setXfermode(xfermode);
                    canvas.restoreToCount(saveLayer);
                    canvas.drawOval(rectF, this.f139913b);
                    f2 = this.f139915d + (this.f139917f * f3);
                    f = this.f139916e;
                }
                width -= f2 - f;
            }
        }
    }

    /* renamed from: b */
    private final void m220373b(Canvas canvas) {
        float f;
        float f2;
        if (!CollectionUtils.isEmpty(this.f139918g) && canvas != null) {
            float f3 = (float) 2;
            float height = ((float) (canvas.getHeight() / 2)) - ((this.f139915d + this.f139917f) / f3);
            float f4 = -((((float) (-this.f139921j.right)) - this.f139915d) - (this.f139917f * f3));
            int min = Math.min(this.f139918g.size(), 3) - 1;
            int i = 0;
            if (min >= 0) {
                while (true) {
                    int saveLayer = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) canvas.getWidth(), (float) canvas.getHeight(), null, 31);
                    Bitmap bitmap = this.f139918g.get(i);
                    if (bitmap == null) {
                        f2 = this.f139915d + (this.f139917f * f3);
                        f = this.f139916e;
                    } else {
                        float f5 = this.f139915d + (this.f139917f * f3);
                        RectF rectF = new RectF(f4 - f5, height, f4, f5 + height);
                        Xfermode xfermode = null;
                        this.f139914c.setXfermode(xfermode);
                        canvas.drawOval(rectF, this.f139914c);
                        this.f139914c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        canvas.drawBitmap(bitmap, (Rect) null, rectF, this.f139914c);
                        this.f139914c.setXfermode(xfermode);
                        canvas.restoreToCount(saveLayer);
                        canvas.drawOval(rectF, this.f139913b);
                        f2 = this.f139915d + (this.f139917f * f3);
                        f = this.f139916e;
                    }
                    f4 += f2 - f;
                    if (i != min) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LayerAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m220372a(boolean z, Canvas canvas) {
        if (z) {
            m220371a(canvas);
        } else {
            m220373b(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int contentWidth = getContentWidth();
        int contentHeight = getContentHeight();
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(m220370a(mode, size, contentWidth), m220370a(View.MeasureSpec.getMode(i2), size2, contentHeight));
    }

    /* renamed from: a */
    private final int m220370a(int i, int i2, int i3) {
        if (i != Integer.MIN_VALUE) {
            return i != 0 ? i2 : i3;
        }
        return Math.min(i3, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayerAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f139918g = new ArrayList();
        this.f139919h = 3;
        int color = UIHelper.getColor(R.color.bg_body);
        this.f139920i = color;
        this.f139915d = C60275a.m234185a(context, 18.0f);
        this.f139916e = C60275a.m234185a(context, 5.0f);
        this.f139917f = C60275a.m234185a(context, 1.0f);
        Rect rect = f139912k;
        this.f139921j = new Rect(UIHelper.dp2px((float) rect.left), UIHelper.dp2px((float) rect.top), UIHelper.dp2px((float) rect.right), UIHelper.dp2px((float) rect.bottom));
        Paint paint = new Paint();
        this.f139914c = paint;
        Paint paint2 = new Paint();
        this.f139913b = paint2;
        paint2.setColor(color);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(this.f139917f);
        paint.setAntiAlias(true);
    }
}
