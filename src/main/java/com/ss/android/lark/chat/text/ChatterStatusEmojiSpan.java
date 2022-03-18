package com.ss.android.lark.chat.text;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ReplacementSpan;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.newemoji.EmojiMapManager;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJR\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J4\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/chat/text/ChatterStatusEmojiSpan;", "Landroid/text/style/ReplacementSpan;", "mDrawable", "Landroid/graphics/drawable/Drawable;", "mLeftMargin", "", "mRightMargin", "mIntrinsicWidth", "mIntrinsicHeight", "(Landroid/graphics/drawable/Drawable;IIII)V", "mRatio", "", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "end", "x", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "getSize", "fmi", "Landroid/graphics/Paint$FontMetricsInt;", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.d.a */
public final class ChatterStatusEmojiSpan extends ReplacementSpan {

    /* renamed from: a */
    public static final Companion f87587a = new Companion(null);

    /* renamed from: b */
    private final float f87588b;

    /* renamed from: c */
    private final Drawable f87589c;

    /* renamed from: d */
    private final int f87590d;

    /* renamed from: e */
    private final int f87591e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chat/text/ChatterStatusEmojiSpan$Companion;", "", "()V", "LEFT_MARGIN_DP", "", "RIGHT_MARGIN_DP", "TAG", "", "appendChatterStatusIcon", "", "Landroid/text/SpannableStringBuilder;", "context", "Landroid/content/Context;", "iconKey", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.d.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo124137a(SpannableStringBuilder spannableStringBuilder, Context context, String str) {
            Intrinsics.checkParameterIsNotNull(spannableStringBuilder, "$this$appendChatterStatusIcon");
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "iconKey");
            Bitmap b = EmojiMapManager.f136337c.mo188269b(str, false);
            if (b == null) {
                Log.m165389i("ChatterStatusEmojiSpan", "getEmojiBitmapSimple null icon key: " + str);
                return;
            }
            Resources resources = context.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, b);
            bitmapDrawable.setAlpha(SmActions.ACTION_ONTHECALL_EXIT);
            String str2 = str;
            spannableStringBuilder.append(str2, new ChatterStatusEmojiSpan(bitmapDrawable, UIUtils.dp2px(context, (float) 6), UIUtils.dp2px(context, (float) 2), b.getWidth(), b.getHeight()), 33);
            Log.m165389i("ChatterStatusEmojiSpan", "getP2PKeyboardHint append");
        }
    }

    public ChatterStatusEmojiSpan(Drawable drawable, int i, int i2, int i3, int i4) {
        Intrinsics.checkParameterIsNotNull(drawable, "mDrawable");
        this.f87589c = drawable;
        this.f87590d = i;
        this.f87591e = i2;
        this.f87588b = ((float) i3) / ((float) i4);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        int i3 = (int) (fontMetrics.descent - fontMetrics.ascent);
        int i4 = (int) (((float) i3) * this.f87588b);
        this.f87589c.setBounds(0, 0, i4, i3);
        return this.f87590d + i4 + this.f87591e;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        float height = (((float) i3) + (((float) (i5 - i3)) / 2.0f)) - (((float) this.f87589c.getBounds().height()) / 2.0f);
        float f2 = f + ((float) this.f87590d);
        int save = canvas.save();
        canvas.translate(f2, height);
        try {
            this.f87589c.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
