package com.ss.android.lark.guide.engine;

import com.ss.android.lark.guide.C38548a;
import com.ss.android.lark.guide.biz.BizGuideKeys;
import com.ss.android.lark.guide.p1911a.AbstractC38549a;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/guide/engine/GuideKeys;", "", "()V", "syncKeys", "", "", "getSyncKeys", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.b.a */
public final class GuideKeys {

    /* renamed from: a */
    public static final GuideKeys f99073a = new GuideKeys();

    /* renamed from: b */
    private static List<String> f99074b;

    private GuideKeys() {
    }

    /* renamed from: a */
    public final synchronized List<String> mo141279a() {
        List<String> list;
        if (f99074b == null) {
            AbstractC38549a a = C38548a.m152027a();
            Intrinsics.checkExpressionValueIsNotNull(a, "GuideModule.getDependency()");
            HashSet hashSet = new HashSet(a.mo141257g());
            hashSet.addAll(BizGuideKeys.f99090a.mo141290a());
            f99074b = CollectionsKt.toList(hashSet);
        }
        list = f99074b;
        if (list == null) {
            Intrinsics.throwNpe();
        }
        return list;
    }
}
