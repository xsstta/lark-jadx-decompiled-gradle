package com.ss.android.lark.mm.module.detail.main;

import com.ss.android.lark.mm.module.framework.MmBaseControl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/main/MmDetailControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseControl;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.main.f */
public final class MmDetailControl extends MmBaseControl {

    /* renamed from: a */
    private final String f116123a;

    /* renamed from: a */
    public final String mo161922a() {
        return this.f116123a;
    }

    public MmDetailControl(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        this.f116123a = str;
    }
}
