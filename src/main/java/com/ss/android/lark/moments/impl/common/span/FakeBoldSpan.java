package com.ss.android.lark.moments.impl.common.span;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/span/FakeBoldSpan;", "Landroid/text/style/CharacterStyle;", "()V", "updateDrawState", "", "tp", "Landroid/text/TextPaint;", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.a.a */
public final class FakeBoldSpan extends CharacterStyle {

    /* renamed from: a */
    public static final Companion f119246a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/span/FakeBoldSpan$Companion;", "", "()V", "getFakeBoldString", "", "resId", "", "text", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final CharSequence mo166166a(int i) {
            SpannableString spannableString = new SpannableString(UIHelper.getString(i));
            spannableString.setSpan(new FakeBoldSpan(), 0, spannableString.length(), 33);
            return spannableString;
        }

        /* renamed from: a */
        public final CharSequence mo166167a(String str) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new FakeBoldSpan(), 0, spannableString.length(), 33);
            return spannableString;
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkParameterIsNotNull(textPaint, "tp");
        textPaint.setFakeBoldText(true);
    }
}
