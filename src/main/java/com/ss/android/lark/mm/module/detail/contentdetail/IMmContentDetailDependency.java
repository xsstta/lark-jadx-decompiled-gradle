package com.ss.android.lark.mm.module.detail.contentdetail;

import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.framework.IMmDependency;
import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00060\nH&J,\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\nH&J\u001c\u0010\u0011\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\nH&J\b\u0010\u0013\u001a\u00020\u0006H&J\b\u0010\u0014\u001a\u00020\u0006H&¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/contentdetail/IMmContentDetailDependency;", "Lcom/ss/android/lark/mm/module/framework/IMmDependency;", "getHost", "", "getToken", "loadBaseInfo", "", "isFromNetwork", "", "onSuccess", "Lkotlin/Function1;", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "loadParticipants", "offset", "", "size", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants;", "loadShareFiles", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo$File;", "notifyTopicUpdated", "notifyUpdateViewDismiss", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.a.a */
public interface IMmContentDetailDependency extends IMmDependency {
    /* renamed from: a */
    String mo161342a();

    /* renamed from: a */
    void mo161343a(int i, int i2, Function1<? super MmParticipants, Unit> function1);

    /* renamed from: a */
    void mo161344a(Function1<? super MmBaseInfo.File, Unit> function1);

    /* renamed from: a */
    void mo161345a(boolean z, Function1<? super MmBaseInfo, Unit> function1);

    /* renamed from: b */
    String mo161346b();

    /* renamed from: c */
    void mo161347c();

    /* renamed from: d */
    void mo161348d();
}
