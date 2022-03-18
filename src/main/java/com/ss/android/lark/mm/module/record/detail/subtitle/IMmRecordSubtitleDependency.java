package com.ss.android.lark.mm.module.record.detail.subtitle;

import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.framework.IMmDependency;
import com.ss.android.lark.mm.module.record.model.MmRecordPara;
import io.reactivex.AbstractC68259a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&J\b\u0010\b\u001a\u00020\tH&J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/subtitle/IMmRecordSubtitleDependency;", "Lcom/ss/android/lark/mm/module/framework/IMmDependency;", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getParas", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/ss/android/lark/mm/module/record/model/MmRecordPara;", "getRecordingDuration", "", "loadPara", "", "pid", "onSuccess", "Lkotlin/Function1;", "loadSubtitles", "Lio/reactivex/Completable;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.detail.a.a */
public interface IMmRecordSubtitleDependency extends IMmDependency {
    /* renamed from: a */
    ConcurrentHashMap<String, MmRecordPara> mo164656a();

    /* renamed from: a */
    void mo164657a(String str, Function1<? super MmRecordPara, Unit> function1);

    /* renamed from: b */
    AbstractC68259a mo164658b();

    /* renamed from: c */
    MmBaseInfo mo164659c();

    /* renamed from: d */
    long mo164660d();
}
