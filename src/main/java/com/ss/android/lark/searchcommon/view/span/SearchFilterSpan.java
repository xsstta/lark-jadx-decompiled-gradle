package com.ss.android.lark.searchcommon.view.span;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.larksuite.suite.R;
import com.ss.android.lark.searchcommon.dto.info.SearchOpenSearchInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JT\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005J6\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u000e\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/searchcommon/view/span/SearchFilterSpan;", "Landroid/text/style/ReplacementSpan;", "mContext", "Landroid/content/Context;", "info", "Lcom/ss/android/lark/searchcommon/dto/info/SearchOpenSearchInfo;", "(Landroid/content/Context;Lcom/ss/android/lark/searchcommon/dto/info/SearchOpenSearchInfo;)V", "mDisplayColor", "", "mTitle", "", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "end", "x", "", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "getFilterInfo", "getSize", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "setDisplayColor", "displayColor", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.b.a */
public final class SearchFilterSpan extends ReplacementSpan {

    /* renamed from: a */
    private int f133562a;

    /* renamed from: b */
    private String f133563b;

    /* renamed from: c */
    private final Context f133564c;

    /* renamed from: d */
    private final SearchOpenSearchInfo f133565d;

    public SearchFilterSpan(Context context, SearchOpenSearchInfo searchOpenSearchInfo) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(searchOpenSearchInfo, "info");
        this.f133564c = context;
        this.f133565d = searchOpenSearchInfo;
        this.f133563b = searchOpenSearchInfo.getTitle() + ' ';
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        Intrinsics.checkParameterIsNotNull(charSequence, "text");
        return (int) paint.measureText(this.f133563b);
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(charSequence, "text");
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        int i6 = this.f133562a;
        if (i6 != 0) {
            paint.setColor(i6);
        } else {
            paint.setColor(this.f133564c.getResources().getColor(R.color.ud_B700));
        }
        canvas.drawText(this.f133563b, f, (float) i4, paint);
    }
}
