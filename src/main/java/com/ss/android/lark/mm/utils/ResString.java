package com.ss.android.lark.mm.utils;

import android.content.Context;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/utils/ResString;", "", "()V", "TAG", "", "get", "resId", "", "Editor", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.utils.s */
public final class ResString {

    /* renamed from: a */
    public static final ResString f118656a = new ResString();

    /* renamed from: b */
    private static final String f118657b = f118657b;

    private ResString() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003J\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`\bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/mm/utils/ResString$Editor;", "", "resId", "", "(I)V", "map", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getResId", "()I", "commit", "replace", "key", "value", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.utils.s$a */
    public static final class Editor {

        /* renamed from: a */
        private final HashMap<String, String> f118658a;

        /* renamed from: b */
        private final int f118659b;

        /* renamed from: a */
        public final String mo165507a() {
            String mustacheFormat = UIHelper.mustacheFormat(this.f118659b, this.f118658a);
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(resId, map)");
            return mustacheFormat;
        }

        public Editor(int i) {
            this.f118659b = i;
            HashMap<String, String> hashMap = new HashMap<>();
            this.f118658a = hashMap;
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            IMmDepend.AbstractC45879g hostDepend = a.getHostDepend();
            Intrinsics.checkExpressionValueIsNotNull(hostDepend, "MmDepend.impl().hostDepend");
            String g = hostDepend.mo144639g();
            Intrinsics.checkExpressionValueIsNotNull(g, "MmDepend.impl().hostDepend.appName");
            hashMap.put("appName", g);
        }

        /* renamed from: a */
        public final Editor mo165506a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            if (str2 != null) {
                this.f118658a.put(str, str2);
            }
            return this;
        }

        /* renamed from: a */
        public final Editor mo165505a(String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            if (i > 0) {
                this.f118658a.put(str, ResString.f118656a.mo165504a(i));
            }
            return this;
        }
    }

    /* renamed from: a */
    public final String mo165504a(int i) {
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45871b contextDepend = a.getContextDepend();
        Intrinsics.checkExpressionValueIsNotNull(contextDepend, "MmDepend.impl().contextDepend");
        Context a2 = contextDepend.mo144557a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl().contextDepend.context");
        String string = a2.getResources().getString(i);
        Intrinsics.checkExpressionValueIsNotNull(string, "MmDepend.impl().contextD…esources.getString(resId)");
        return string;
    }
}
