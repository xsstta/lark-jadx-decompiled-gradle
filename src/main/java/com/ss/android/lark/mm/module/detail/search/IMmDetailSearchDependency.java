package com.ss.android.lark.mm.module.detail.search;

import com.huawei.hms.actions.SearchIntents;
import com.ss.android.lark.mm.module.detail.search.model.FindResponse;
import com.ss.android.lark.mm.module.framework.IMmDependency;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\bf\u0018\u00002\u00020\u0001JR\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000728\u0010\b\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00030\tH&J\b\u0010\u0010\u001a\u00020\u000eH&J\b\u0010\u0011\u001a\u00020\u0005H&J\b\u0010\u0012\u001a\u00020\u0005H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000eH&J \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H&J\u0012\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\nH&J\b\u0010\u001b\u001a\u00020\u0003H&J\b\u0010\u001c\u001a\u00020\u0003H&J\b\u0010\u001d\u001a\u00020\u0003H&¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/search/IMmDetailSearchDependency;", "Lcom/ss/android/lark/mm/module/framework/IMmDependency;", "find", "", SearchIntents.EXTRA_QUERY, "", "findKeyword", "", "onResponse", "Lkotlin/Function2;", "Lcom/ss/android/lark/mm/module/detail/search/model/FindResponse;", "Lkotlin/ParameterName;", "name", "res", "", "total", "getBottomPanelHeight", "getToken", "getTranslateLang", "notifyChangeFindResultFocus", "index", "notifyChangeKeyword", "content", "isAuto", "isKeyword", "notifyFindResult", "findResponse", "notifyPausePlay", "notifyStartFind", "notifyStopFind", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.search.b */
public interface IMmDetailSearchDependency extends IMmDependency {
    /* renamed from: a */
    String mo162028a();

    /* renamed from: a */
    void mo162029a(int i);

    /* renamed from: a */
    void mo162030a(FindResponse findResponse);

    /* renamed from: a */
    void mo162031a(String str, boolean z, Function2<? super FindResponse, ? super Integer, Unit> kVar);

    /* renamed from: b */
    void mo162032b();

    /* renamed from: c */
    void mo162033c();

    /* renamed from: d */
    void mo162034d();

    /* renamed from: e */
    String mo162035e();
}
