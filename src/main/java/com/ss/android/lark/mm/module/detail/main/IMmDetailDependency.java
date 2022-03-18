package com.ss.android.lark.mm.module.detail.main;

import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.framework.IMmDependency;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0005H&J\u001c\u0010\u000f\u001a\u00020\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0011H&¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/main/IMmDetailDependency;", "Lcom/ss/android/lark/mm/module/framework/IMmDependency;", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "isEditMode", "", "isMentionFromSummary", "isSearching", "notifyRefresh", "", "notifyStopScroll", "notifyVideoPlayerCompletelyVisible", "isCompletelyVisible", "notifyVideoPlayerVisibilityChange", "isVisible", "sendReviewAppeal", "onData", "Lkotlin/Function1;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.main.a */
public interface IMmDetailDependency extends IMmDependency {
    /* renamed from: a */
    void mo161889a();

    /* renamed from: a */
    void mo161890a(Function1<? super Boolean, Unit> function1);

    /* renamed from: a */
    void mo161891a(boolean z);

    /* renamed from: b */
    MmBaseInfo mo161892b();

    /* renamed from: b */
    void mo161893b(boolean z);

    /* renamed from: c */
    void mo161894c();

    /* renamed from: d */
    boolean mo161895d();

    /* renamed from: e */
    boolean mo161896e();

    /* renamed from: f */
    boolean mo161897f();
}
