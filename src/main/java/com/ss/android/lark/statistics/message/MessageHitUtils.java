package com.ss.android.lark.statistics.message;

import android.util.Patterns;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36498n;
import com.ss.android.lark.statistics.message.Conf;
import com.ss.android.lark.widget.richtext.C59031e;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/statistics/message/MessageHitUtils;", "", "()V", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.statistics.n.f */
public final class MessageHitUtils {

    /* renamed from: a */
    public static final AbstractC36498n f135841a;

    /* renamed from: b */
    public static final Companion f135842b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/statistics/message/MessageHitUtils$Companion;", "", "()V", "docDependency", "Lcom/ss/android/lark/dependency/IDocDependency;", "getAllDocUrlFromRichText", "", "Lcom/ss/android/lark/statistics/message/Conf$DocInfo;", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "parseMessageDocInfo", "textContent", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.n.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Conf.DocInfo mo187636a(String str) {
            String[] b;
            Intrinsics.checkParameterIsNotNull(str, "textContent");
            Matcher matcher = Patterns.WEB_URL.matcher(str);
            if (!matcher.find() || (b = MessageHitUtils.f135841a.mo134676b(matcher.group(0))) == null) {
                return null;
            }
            return new Conf.DocInfo(true, b[1], b[0]);
        }

        /* renamed from: a */
        public final List<Conf.DocInfo> mo187637a(RichText richText) {
            Conf.DocInfo aVar;
            List<String> e = C59031e.m229187e(richText);
            Intrinsics.checkExpressionValueIsNotNull(e, "RichTextHelper.getRichTextUrls(richText)");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = e.iterator();
            while (it.hasNext()) {
                String[] b = MessageHitUtils.f135841a.mo134676b((String) it.next());
                if (b != null) {
                    aVar = new Conf.DocInfo(true, b[1], b[0]);
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }
    }

    static {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36498n L = b.mo134513L();
        Intrinsics.checkExpressionValueIsNotNull(L, "ChatModuleInstanceHolder…ependency().docDependency");
        f135841a = L;
    }
}
