package com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010$\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0015H\u0002J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\tH\u0002J\b\u0010+\u001a\u00020\tH\u0002J\b\u0010,\u001a\u00020\tH\u0002J\b\u0010-\u001a\u00020'H\u0002J\u0010\u0010.\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0014J\u0018\u0010/\u001a\u00020'2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\tH\u0014J\u001c\u00102\u001a\u00020'2\u0006\u00103\u001a\u00020\t2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J \u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020\t2\u0006\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\tH\u0002J\u0018\u00109\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0015H\u0002R\u000e\u0010\u000b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/AvatarView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "DEFAULT_BG_COLOR", "DEFAULT_BOARDER", "DEFAULT_ICON_SIZE", "DEFAULT_NUM_TEXT_BG_COLOR", "DEFAULT_TEXT_COLOR", "DEFAULT_TEXT_SIZE", "ICON_COVER_MARGIN", "ICON_DISPLAY_LIMIT", "mAvatarIconLimit", "mBoarderSize", "", "mDisplayIcons", "", "Landroid/graphics/Bitmap;", "mExtraAvatarSize", "mIconBoarderPaint", "Landroid/graphics/Paint;", "mIconCoverMargin", "mIconPaint", "mIconSize", "mNumBgPaint", "mNumTextPaint", "Landroid/text/TextPaint;", "mSelectedBgBoarderColor", "mTextSize", "dp2px", "dpValue", "drawImage", "", "canvas", "Landroid/graphics/Canvas;", "getContentHeight", "getContentWidth", "getDisplayIconSize", "init", "onDraw", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setSelectedBitmap", "totalAvatarSize", "contents", "setViewSize", "mode", "size", "contentSize", "sp2px", "sp", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AvatarView extends View {

    /* renamed from: a */
    private final int f80896a = 3;

    /* renamed from: b */
    private final int f80897b = 8;

    /* renamed from: c */
    private final int f80898c = 32;

    /* renamed from: d */
    private final int f80899d = 2;

    /* renamed from: e */
    private final int f80900e;

    /* renamed from: f */
    private final int f80901f;

    /* renamed from: g */
    private final int f80902g;

    /* renamed from: h */
    private final int f80903h;

    /* renamed from: i */
    private final int f80904i;

    /* renamed from: j */
    private float f80905j;

    /* renamed from: k */
    private float f80906k;

    /* renamed from: l */
    private float f80907l;

    /* renamed from: m */
    private Paint f80908m;

    /* renamed from: n */
    private Paint f80909n;

    /* renamed from: o */
    private Paint f80910o;

    /* renamed from: p */
    private TextPaint f80911p;

    /* renamed from: q */
    private List<Bitmap> f80912q;

    /* renamed from: r */
    private int f80913r;

    /* renamed from: s */
    private int f80914s;

    /* renamed from: t */
    private float f80915t;

    private final int getContentHeight() {
        if (!CollectionUtils.isEmpty(this.f80912q)) {
            return (int) (this.f80905j + (this.f80907l * ((float) 2)));
        }
        return 0;
    }

    private final int getContentWidth() {
        if (CollectionUtils.isEmpty(this.f80912q) || this.f80913r <= 0) {
            return 0;
        }
        float f = this.f80905j + (this.f80907l * ((float) 2));
        int displayIconSize = getDisplayIconSize();
        return 0 + ((int) ((((float) displayIconSize) * f) - (((float) (displayIconSize - 1)) * this.f80906k)));
    }

    private final int getDisplayIconSize() {
        int i = 0;
        if (CollectionUtils.isEmpty(this.f80912q)) {
            return 0;
        }
        List<Bitmap> list = this.f80912q;
        if (list != null) {
            i = list.size();
        }
        int min = Math.min(i, this.f80896a);
        if (this.f80914s > 0) {
            return min + 1;
        }
        return min;
    }

    /* renamed from: a */
    private final void m120670a() {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        this.f80907l = (float) m120669a(context, (float) this.f80899d);
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        this.f80905j = (float) m120669a(context2, (float) this.f80898c);
        Context context3 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "context");
        this.f80906k = (float) m120669a(context3, (float) this.f80897b);
        this.f80908m.setColor(this.f80904i);
        this.f80908m.setAntiAlias(true);
        this.f80908m.setStyle(Paint.Style.STROKE);
        this.f80908m.setStrokeWidth(this.f80907l);
        this.f80909n.setAntiAlias(true);
        Context context4 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context4, "context");
        this.f80915t = m120672b(context4, (float) this.f80901f);
        this.f80911p.setAntiAlias(true);
        this.f80911p.setTextSize(this.f80915t);
        this.f80911p.setColor(this.f80902g);
        this.f80910o.setAntiAlias(true);
        this.f80910o.setColor(this.f80903h);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.onDraw(canvas);
        m120671a(canvas);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        int color = UIHelper.getColor(R.color.lkui_N00);
        this.f80900e = color;
        this.f80901f = 14;
        this.f80902g = UIHelper.getColor(R.color.lkui_N900);
        this.f80903h = UIHelper.getColor(R.color.lkui_N300);
        this.f80904i = color;
        this.f80908m = new Paint();
        this.f80909n = new Paint();
        this.f80910o = new Paint();
        this.f80911p = new TextPaint();
        this.f80913r = 3;
        m120670a();
    }

    /* renamed from: a */
    private final void m120671a(Canvas canvas) {
        int i;
        String str;
        Bitmap bitmap;
        float f;
        float f2;
        if (!CollectionUtils.isEmpty(this.f80912q)) {
            List<Bitmap> list = this.f80912q;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            int min = Math.min(this.f80896a, i);
            float f3 = BitmapDescriptorFactory.HUE_RED;
            for (int i2 = 0; i2 < min; i2++) {
                int saveLayer = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) canvas.getWidth(), (float) canvas.getHeight(), null, 31);
                List<Bitmap> list2 = this.f80912q;
                if (list2 != null) {
                    bitmap = list2.get(i2);
                } else {
                    bitmap = null;
                }
                if (bitmap == null) {
                    f2 = this.f80905j + (this.f80907l * ((float) 2));
                    f = this.f80906k;
                } else {
                    float f4 = (float) 2;
                    float f5 = this.f80905j + (this.f80907l * f4);
                    float f6 = this.f80907l;
                    RectF rectF = new RectF((f6 / f4) + f3, (f6 / f4) + BitmapDescriptorFactory.HUE_RED, (f3 + f5) - (f6 / f4), (f5 + BitmapDescriptorFactory.HUE_RED) - (f6 / f4));
                    float f7 = this.f80907l;
                    float f8 = BitmapDescriptorFactory.HUE_RED + f7;
                    float f9 = this.f80905j;
                    RectF rectF2 = new RectF(f3 + f7, f8, f3 + f7 + f9, f7 + BitmapDescriptorFactory.HUE_RED + f9);
                    Xfermode xfermode = null;
                    this.f80909n.setXfermode(xfermode);
                    canvas.drawOval(rectF2, this.f80909n);
                    this.f80909n.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, (Rect) null, rectF2, this.f80909n);
                    this.f80909n.setXfermode(xfermode);
                    canvas.restoreToCount(saveLayer);
                    canvas.drawOval(rectF, this.f80908m);
                    f2 = this.f80905j + (this.f80907l * f4);
                    f = this.f80906k;
                }
                f3 += f2 - f;
            }
            int i3 = this.f80914s;
            if (i3 > 0) {
                if (i3 < 100) {
                    StringBuilder sb = new StringBuilder();
                    sb.append('+');
                    sb.append(this.f80914s);
                    str = sb.toString();
                } else {
                    str = "99+";
                }
                int width = canvas.getWidth();
                int height = canvas.getHeight();
                int saveLayer2 = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) width, (float) height, null, 31);
                float f10 = (float) 2;
                float f11 = this.f80905j + (this.f80907l * f10);
                float f12 = this.f80907l;
                RectF rectF3 = new RectF((f12 / f10) + f3, (f12 / f10) + BitmapDescriptorFactory.HUE_RED, (f3 + f11) - (f12 / f10), (f11 + BitmapDescriptorFactory.HUE_RED) - (f12 / f10));
                float f13 = this.f80907l;
                float f14 = BitmapDescriptorFactory.HUE_RED + f13;
                float f15 = this.f80905j;
                canvas.drawOval(new RectF(f3 + f13, f14, f3 + f13 + f15, BitmapDescriptorFactory.HUE_RED + f13 + f15), this.f80910o);
                Paint.FontMetrics fontMetrics = this.f80911p.getFontMetrics();
                float f16 = (((float) (height / 2)) + ((fontMetrics.bottom - fontMetrics.top) / f10)) - fontMetrics.bottom;
                Rect rect = new Rect();
                this.f80911p.getTextBounds(str, 0, str.length(), rect);
                canvas.drawText(str, f3 + this.f80907l + ((this.f80905j - ((float) rect.width())) / f10), f16, this.f80911p);
                canvas.restoreToCount(saveLayer2);
                canvas.drawOval(rectF3, this.f80908m);
            }
        }
    }

    /* renamed from: a */
    private final int m120669a(Context context, float f) {
        return UIUtils.dp2px(context, f);
    }

    /* renamed from: b */
    private final float m120672b(Context context, float f) {
        return UIUtils.sp2px(context, f);
    }

    /* renamed from: a */
    public final void mo115911a(int i, List<Bitmap> list) {
        Intrinsics.checkParameterIsNotNull(list, "contents");
        this.f80914s = i - list.size();
        this.f80912q = list;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int contentWidth = getContentWidth();
        int contentHeight = getContentHeight();
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(m120668a(mode, size, contentWidth), m120668a(View.MeasureSpec.getMode(i2), size2, contentHeight));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        int color = UIHelper.getColor(R.color.lkui_N00);
        this.f80900e = color;
        this.f80901f = 14;
        this.f80902g = UIHelper.getColor(R.color.lkui_N900);
        this.f80903h = UIHelper.getColor(R.color.lkui_N300);
        this.f80904i = color;
        this.f80908m = new Paint();
        this.f80909n = new Paint();
        this.f80910o = new Paint();
        this.f80911p = new TextPaint();
        this.f80913r = 3;
        m120670a();
    }

    /* renamed from: a */
    private final int m120668a(int i, int i2, int i3) {
        if (i != Integer.MIN_VALUE) {
            return i != 0 ? i2 : i3;
        }
        return Math.min(i3, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        int color = UIHelper.getColor(R.color.lkui_N00);
        this.f80900e = color;
        this.f80901f = 14;
        this.f80902g = UIHelper.getColor(R.color.lkui_N900);
        this.f80903h = UIHelper.getColor(R.color.lkui_N300);
        this.f80904i = color;
        this.f80908m = new Paint();
        this.f80909n = new Paint();
        this.f80910o = new Paint();
        this.f80911p = new TextPaint();
        this.f80913r = 3;
        m120670a();
    }
}
