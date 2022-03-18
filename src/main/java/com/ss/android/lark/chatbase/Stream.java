package com.ss.android.lark.chatbase;

import com.huawei.hms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\t\u001a\u00020\n2\u0016\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chatbase/Stream;", "E", "", "filter", "Lkotlin/Function1;", "", SearchIntents.EXTRA_QUERY, "key", "", "reduce", "", "operation", "toList", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatbase.d */
public interface Stream<E> {
    /* renamed from: a */
    Stream<E> mo127142a(String str);

    /* renamed from: a */
    Stream<E> mo127143a(Function1<? super E, Boolean> function1);

    /* renamed from: b */
    void mo127146b(Function1<? super E, ? extends E> function1);
}
