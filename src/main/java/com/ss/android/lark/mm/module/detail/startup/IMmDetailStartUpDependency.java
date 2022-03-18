package com.ss.android.lark.mm.module.detail.startup;

import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSubtitles;
import com.ss.android.lark.mm.module.framework.IMmDependency;
import com.ss.android.lark.mm.module.share.model.ApplyInfo;
import io.reactivex.Single;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00030\u0005H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\tH&J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\n\u001a\u00020\tH&J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00130\b2\u0006\u0010\n\u001a\u00020\tH&J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\u0006\u0010\n\u001a\u00020\tH&J\b\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0003H&J\b\u0010\u0018\u001a\u00020\u0003H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u000eH&¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/startup/IMmDetailStartUpDependency;", "Lcom/ss/android/lark/mm/module/framework/IMmDependency;", "applyInfo", "", "onData", "Lkotlin/Function1;", "Lcom/ss/android/lark/mm/module/share/model/ApplyInfo;", "checkHasSummary", "Lio/reactivex/Single;", "", "isRefresh", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getRequestId", "", "getUrl", "isBaseInfoLoaded", "loadBaseInfo", "loadKeywords", "", "loadSubtitles", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSubtitles;", "notifyChangeSummaryTabVisible", "notifyFragmentRefresh", "refresh", "sendApply", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.b.a */
public interface IMmDetailStartUpDependency extends IMmDependency {
    /* renamed from: a */
    Single<MmBaseInfo> mo161401a(boolean z);

    /* renamed from: a */
    void mo161402a();

    /* renamed from: a */
    void mo161403a(String str);

    /* renamed from: a */
    void mo161404a(Function1<? super ApplyInfo, Unit> function1);

    /* renamed from: b */
    MmBaseInfo mo161405b();

    /* renamed from: b */
    Single<MmMeetingSubtitles> mo161406b(boolean z);

    /* renamed from: c */
    Single<Boolean> mo161407c(boolean z);

    /* renamed from: c */
    void mo161408c();

    /* renamed from: d */
    Single<List<String>> mo161409d(boolean z);

    /* renamed from: d */
    void mo161410d();
}
