package com.ss.android.lark.widget.light.processor;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.style.ForegroundColorSpan;
import androidx.core.content.ContextCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.avatar.IconKeyDrawable;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.SpannableStringExtraParams;
import com.ss.android.lark.widget.light.span.UrlClickSpan;
import com.ss.android.lark.widget.linked_emojicon.C58508e;
import com.ss.android.lark.widget.linked_emojicon.C58513g;
import com.ss.android.lark.widget.linked_emojicon.C58514h;
import com.ss.android.lark.widget.span.KeyIconUrlInfo;
import com.ss.android.lark.widget.span.RichUrlInfo;
import com.ss.android.lark.widget.span.SpanInfo;
import com.ss.android.lark.widget.span.UrlInfo;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J(\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rH\u0002J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\rH\u0002J(\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/widget/light/processor/UrlSpanProcessor;", "Lcom/ss/android/lark/widget/light/processor/ISpanProcessor;", "Lcom/ss/android/lark/widget/span/UrlInfo;", "()V", "applyKeyIconUrlSpan", "", "context", "Landroid/content/Context;", "spanBuilder", "Lcom/ss/android/lark/widget/linked_emojicon/SpannableStringBuilderAllVer;", "keyIconUrlInfo", "Lcom/ss/android/lark/widget/span/KeyIconUrlInfo;", "params", "Lcom/ss/android/lark/widget/light/SpannableStringExtraParams;", "applyRichUrlSpan", "richUrlInfo", "Lcom/ss/android/lark/widget/span/RichUrlInfo;", "getUrlSpan", "Lcom/ss/android/lark/widget/light/span/UrlClickSpan;", "spanInfo", "Lcom/ss/android/lark/widget/span/SpanInfo;", "process", "Companion", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.light.d.n */
public final class UrlSpanProcessor implements ISpanProcessor<UrlInfo> {

    /* renamed from: a */
    public static final Companion f144163a = new Companion(null);

    /* renamed from: c */
    private static final int f144164c = 14;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/widget/light/processor/UrlSpanProcessor$Companion;", "", "()V", "DOC_ICON_SIZE_DP", "", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.light.d.n$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final UrlClickSpan m226856a(Context context, SpanInfo spanInfo, SpannableStringExtraParams aVar) {
        if (spanInfo != null) {
            String str = ((UrlInfo) spanInfo).href;
            Intrinsics.checkExpressionValueIsNotNull(str, "urlInfo.href");
            return new UrlClickSpan(str, aVar.mo198060i(), context);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.widget.span.UrlInfo");
    }

    /* renamed from: a */
    public void mo198129a(Context context, C58513g gVar, UrlInfo urlInfo, SpannableStringExtraParams aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(gVar, "spanBuilder");
        Intrinsics.checkParameterIsNotNull(urlInfo, "spanInfo");
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        String str = urlInfo.text;
        if (urlInfo instanceof KeyIconUrlInfo) {
            m226857a(context, gVar, (KeyIconUrlInfo) urlInfo, aVar);
        } else if (urlInfo instanceof RichUrlInfo) {
            m226858a(context, gVar, (RichUrlInfo) urlInfo, aVar);
        } else {
            gVar.append(str, m226856a(context, urlInfo, aVar), 33);
            gVar.setSpan(new C58514h(urlInfo), gVar.length() - str.length(), gVar.length(), 33);
        }
    }

    /* renamed from: a */
    private final void m226857a(Context context, C58513g gVar, KeyIconUrlInfo keyIconUrlInfo, SpannableStringExtraParams aVar) {
        Drawable drawable;
        int length = gVar.length();
        if (keyIconUrlInfo.placeHolderRes != 0) {
            drawable = ContextCompat.getDrawable(context, keyIconUrlInfo.placeHolderRes);
        } else {
            drawable = null;
        }
        IconKeyDrawable oVar = new IconKeyDrawable(context);
        int color = UIUtils.getColor(context, R.color.text_link_normal);
        String str = keyIconUrlInfo.iconKey;
        int i = f144164c;
        oVar.mo89035a(str, null, UIHelper.dp2px((float) i), UIHelper.dp2px((float) i), drawable, !keyIconUrlInfo.isUrlPreview, Integer.valueOf(color));
        C58508e a = new C58508e.C58510a(context, new C58508e.C58511b(keyIconUrlInfo.href)).mo198336a("").mo198338b(aVar.mo198058g()).mo198335a(oVar).mo198337a();
        String str2 = keyIconUrlInfo.text;
        Intrinsics.checkExpressionValueIsNotNull(str2, "keyIconUrlInfo.text");
        if (str2 != null) {
            String substring = str2.substring(0, 1);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            gVar.append(substring, a, 33);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(color);
            String str3 = keyIconUrlInfo.text;
            Intrinsics.checkExpressionValueIsNotNull(str3, "keyIconUrlInfo.text");
            if (str3 != null) {
                String substring2 = str3.substring(1);
                Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.String).substring(startIndex)");
                gVar.append(substring2, foregroundColorSpan, 33);
                String str4 = keyIconUrlInfo.href;
                Intrinsics.checkExpressionValueIsNotNull(str4, "keyIconUrlInfo.href");
                gVar.setSpan(new UrlClickSpan(str4, aVar.mo198060i(), context), length, keyIconUrlInfo.text.length() + length, 33);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    private final void m226858a(Context context, C58513g gVar, RichUrlInfo richUrlInfo, SpannableStringExtraParams aVar) {
        int length = gVar.length();
        Bitmap a = C57820d.m224428a(context, richUrlInfo.mLocalImageResId);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(UIUtils.getColor(context, R.color.text_link_normal), PorterDuff.Mode.SRC_IN));
        Intrinsics.checkExpressionValueIsNotNull(a, "iconResBitmap");
        Bitmap createBitmap = Bitmap.createBitmap(a.getWidth(), a.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(a, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        C58508e.C58510a b = new C58508e.C58510a(context, new C58508e.C58511b(richUrlInfo.href)).mo198336a("").mo198338b(aVar.mo198058g());
        if (createBitmap != null) {
            a = createBitmap;
        }
        C58508e a2 = b.mo198334a(a).mo198337a();
        String str = richUrlInfo.text;
        Intrinsics.checkExpressionValueIsNotNull(str, "richUrlInfo.text");
        if (str != null) {
            String substring = str.substring(0, 1);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            gVar.append(substring, a2, 33);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(UIUtils.getColor(context, R.color.text_link_normal));
            String str2 = richUrlInfo.text;
            Intrinsics.checkExpressionValueIsNotNull(str2, "richUrlInfo.text");
            if (str2 != null) {
                String substring2 = str2.substring(1);
                Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.String).substring(startIndex)");
                gVar.append(substring2, foregroundColorSpan, 33);
                String str3 = richUrlInfo.href;
                Intrinsics.checkExpressionValueIsNotNull(str3, "richUrlInfo.href");
                gVar.setSpan(new UrlClickSpan(str3, aVar.mo198060i(), context), length, richUrlInfo.text.length() + length, 33);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
