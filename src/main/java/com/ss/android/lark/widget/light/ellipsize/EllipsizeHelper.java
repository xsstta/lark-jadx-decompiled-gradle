package com.ss.android.lark.widget.light.ellipsize;

import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/widget/light/ellipsize/EllipsizeHelper;", "", "()V", "Companion", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.light.a.a */
public final class EllipsizeHelper {

    /* renamed from: a */
    public static final TextPaint f144128a = new TextPaint();

    /* renamed from: b */
    public static final Companion f144129b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/widget/light/ellipsize/EllipsizeHelper$Companion;", "", "()V", "sPaint", "Landroid/text/TextPaint;", "ellipsize", "", "content", "totalWidth", "", "textSizeInPx", "where", "Landroid/text/TextUtils$TruncateAt;", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.light.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final CharSequence mo198108a(CharSequence charSequence, float f, float f2, TextUtils.TruncateAt truncateAt) {
            Intrinsics.checkParameterIsNotNull(charSequence, "content");
            Intrinsics.checkParameterIsNotNull(truncateAt, "where");
            EllipsizeHelper.f144128a.setTextSize(f2);
            CharSequence ellipsize = TextUtils.ellipsize(charSequence, EllipsizeHelper.f144128a, f, truncateAt);
            Intrinsics.checkExpressionValueIsNotNull(ellipsize, "TextUtils.ellipsize(cont…Paint, totalWidth, where)");
            return ellipsize;
        }
    }
}
