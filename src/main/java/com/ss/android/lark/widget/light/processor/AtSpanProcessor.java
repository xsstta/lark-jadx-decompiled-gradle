package com.ss.android.lark.widget.light.processor;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.light.SpannableStringExtraParams;
import com.ss.android.lark.widget.light.span.AtClickSpan;
import com.ss.android.lark.widget.light.span.CustomForegroundColorSpan;
import com.ss.android.lark.widget.linked_emojicon.C58512f;
import com.ss.android.lark.widget.linked_emojicon.C58513g;
import com.ss.android.lark.widget.linked_emojicon.C58514h;
import com.ss.android.lark.widget.linked_emojicon.p2942b.C58499a;
import com.ss.android.lark.widget.linked_emojicon.p2942b.C58500b;
import com.ss.android.lark.widget.span.AtInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J4\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/widget/light/processor/AtSpanProcessor;", "Lcom/ss/android/lark/widget/light/processor/ISpanProcessor;", "Lcom/ss/android/lark/widget/span/AtInfo;", "()V", "checkUserIsBot", "", "params", "Lcom/ss/android/lark/widget/light/SpannableStringExtraParams;", "userId", "", "getAtSpanMap", "", "", "context", "Landroid/content/Context;", "text", "atInfo", "isRead", "process", "", "spanBuilder", "Lcom/ss/android/lark/widget/linked_emojicon/SpannableStringBuilderAllVer;", "spanInfo", "shouldShowAtDot", "Companion", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.light.d.b */
public final class AtSpanProcessor implements ISpanProcessor<AtInfo> {

    /* renamed from: a */
    public static final Companion f144157a = new Companion(null);

    /* renamed from: c */
    private static final int f144158c = 15;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/widget/light/processor/AtSpanProcessor$Companion;", "", "()V", "MAX_SPAN_LENGTH", "", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.light.d.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    private final boolean m226830c(SpannableStringExtraParams aVar, String str) {
        return aVar.mo198052a().contains(str);
    }

    /* renamed from: b */
    private final boolean m226829b(SpannableStringExtraParams aVar, String str) {
        if (CollectionUtils.isEmpty(aVar.mo198053b())) {
            return false;
        }
        return aVar.mo198053b().contains(str);
    }

    /* renamed from: a */
    private final boolean m226828a(SpannableStringExtraParams aVar, String str) {
        boolean z;
        if (!aVar.mo198054c()) {
            return false;
        }
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !(!Intrinsics.areEqual(str, "all")) || !(!Intrinsics.areEqual(aVar.mo198055d(), str)) || m226829b(aVar, str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo198129a(Context context, C58513g gVar, AtInfo atInfo, SpannableStringExtraParams aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(gVar, "spanBuilder");
        Intrinsics.checkParameterIsNotNull(atInfo, "spanInfo");
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        String str = atInfo.text;
        Intrinsics.checkExpressionValueIsNotNull(str, "spanText");
        gVar.mo198348a((CharSequence) str, m226827a(context, str, atInfo, aVar), 33);
        gVar.setSpan(new C58514h(atInfo), gVar.length() - str.length(), gVar.length(), 33);
    }

    /* renamed from: a */
    private final Map<String, Object> m226827a(Context context, String str, AtInfo atInfo, SpannableStringExtraParams aVar) {
        int i;
        boolean z;
        int i2;
        Paint.Style style;
        String str2 = atInfo.userId;
        boolean z2 = atInfo.isAnonymous;
        ArrayMap arrayMap = new ArrayMap();
        int k = aVar.mo198062k();
        if (!z2 || !TextUtils.isEmpty(aVar.mo198056e())) {
            boolean z3 = atInfo.isOutChatUser;
            int j = aVar.mo198061j();
            if (z3) {
                i = j;
            } else {
                i = UIUtils.getColor(context, R.color.imtoken_message_text_bubbles_blue);
            }
            Intrinsics.checkExpressionValueIsNotNull(str2, "userId");
            AtClickSpan bVar = new AtClickSpan(str, str2, i);
            if (!z2) {
                arrayMap.put(AtClickSpan.class.getSimpleName(), bVar);
            }
            if (z3) {
                arrayMap.put(CustomForegroundColorSpan.class.getSimpleName(), new CustomForegroundColorSpan(j));
            } else {
                String str3 = str2;
                boolean z4 = true;
                if (str3.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (Intrinsics.areEqual(aVar.mo198055d(), str2) || Intrinsics.areEqual(aVar.mo198056e(), str2))) {
                    arrayMap.put(C58499a.class.getSimpleName(), C58500b.m226945a(context, aVar.mo198058g(), atInfo.textStyle, aVar.mo198058g(), aVar.mo198063l(), aVar.mo198064m()));
                } else if (m226828a(aVar, str2)) {
                    int n = aVar.mo198065n();
                    boolean c = m226830c(aVar, str2);
                    if (c) {
                        i2 = aVar.mo198066o();
                    } else {
                        i2 = aVar.mo198067p();
                    }
                    if (c) {
                        style = Paint.Style.FILL;
                    } else {
                        style = Paint.Style.STROKE;
                    }
                    C58512f fVar = new C58512f(i2, n, style);
                    ArrayMap arrayMap2 = arrayMap;
                    arrayMap2.put(C58512f.class.getSimpleName(), fVar);
                    arrayMap2.put(CustomForegroundColorSpan.class.getSimpleName(), new CustomForegroundColorSpan(n));
                } else {
                    if (str3.length() <= 0) {
                        z4 = false;
                    }
                    if (!z4 || !Intrinsics.areEqual(aVar.mo198057f(), str2)) {
                        int n2 = aVar.mo198065n();
                        arrayMap.put(CustomForegroundColorSpan.class.getSimpleName(), new CustomForegroundColorSpan(n2));
                        bVar.mo198172a(n2);
                    } else {
                        arrayMap.put(C58499a.class.getSimpleName(), C58500b.m226945a(context, aVar.mo198058g(), atInfo.textStyle, aVar.mo198058g(), aVar.mo198068q(), aVar.mo198069r()));
                    }
                }
            }
            return arrayMap;
        }
        ArrayMap arrayMap3 = arrayMap;
        arrayMap3.put(CustomForegroundColorSpan.class.getSimpleName(), new CustomForegroundColorSpan(k));
        return arrayMap3;
    }
}
