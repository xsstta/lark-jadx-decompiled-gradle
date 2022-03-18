package com.ss.android.lark.mail.impl.utils.tokenautocomplete;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView;

/* renamed from: com.ss.android.lark.mail.impl.utils.tokenautocomplete.d */
public class C43845d {

    /* renamed from: com.ss.android.lark.mail.impl.utils.tokenautocomplete.d$a */
    public static class C43846a implements TextUtils.EllipsizeCallback {

        /* renamed from: a */
        public int f111272a;

        /* renamed from: b */
        public int f111273b;

        public void ellipsized(int i, int i2) {
            this.f111272a = i;
            this.f111273b = i2;
        }
    }

    /* renamed from: a */
    static Spanned m173818a(CharSequence charSequence, C43842a aVar, int i, TextPaint textPaint, CharSequence charSequence2, float f) {
        int i2;
        float f2;
        if (aVar == null || i <= 1) {
            f2 = BitmapDescriptorFactory.HUE_RED;
            i2 = 0;
        } else {
            aVar.mo156209a(i);
            f2 = aVar.mo156207a(textPaint);
            i2 = (int) textPaint.measureText("...");
        }
        C43846a aVar2 = new C43846a();
        CharSequence ellipsize = TextUtils.ellipsize(charSequence2, textPaint, (f - f2) + ((float) i2), TextUtils.TruncateAt.END, false, aVar2);
        if (!(ellipsize instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) ellipsize;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spanned);
        TextUtils.copySpansFrom(spanned, 0, spanned.length(), Object.class, spannableStringBuilder, 0);
        if (charSequence != null && charSequence.length() > aVar2.f111272a) {
            spannableStringBuilder.replace(0, aVar2.f111272a, charSequence);
            aVar2.f111273b = (aVar2.f111273b + charSequence.length()) - aVar2.f111272a;
            aVar2.f111272a = charSequence.length();
        }
        if (aVar2.f111272a == aVar2.f111273b) {
            return null;
        }
        if (aVar != null) {
            aVar.mo156209a(i - ((TokenCompleteTextView.C43837c[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), TokenCompleteTextView.C43837c.class)).length);
            spannableStringBuilder.replace(aVar2.f111272a, spannableStringBuilder.length(), (CharSequence) aVar.mo156208a());
            spannableStringBuilder.setSpan(aVar, aVar2.f111272a, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }
}
