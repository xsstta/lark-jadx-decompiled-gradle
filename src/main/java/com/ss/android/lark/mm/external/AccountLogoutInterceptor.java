package com.ss.android.lark.mm.external;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import com.ss.android.lark.mm.module.record.audiorecorder.MmAudioRecordService;
import com.ss.android.lark.mm.module.record.upload.MmAudioUploadCenter;
import com.ss.android.lark.mm.utils.ResString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/mm/external/AccountLogoutInterceptor;", "Lcom/ss/android/lark/mm/depend/IMmDepend$ILoginDepend$IMmAccountInterceptor;", "()V", "getDetail", "Lcom/ss/android/lark/mm/depend/IMmDepend$ILoginDepend$MmAccountInterceptorBean;", "interceptOnCancel", "", "interceptOnConfirm", "needIntercept", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.b.a */
public final class AccountLogoutInterceptor implements IMmDepend.ILoginDepend.IMmAccountInterceptor {
    @Override // com.ss.android.lark.mm.depend.IMmDepend.ILoginDepend.IMmAccountInterceptor
    /* renamed from: d */
    public int mo161149d() {
        return 0;
    }

    @Override // com.ss.android.lark.mm.depend.IMmDepend.ILoginDepend.IMmAccountInterceptor
    /* renamed from: a */
    public boolean mo161146a() {
        return MmRecordManager.f117918g.mo164549a();
    }

    @Override // com.ss.android.lark.mm.depend.IMmDepend.ILoginDepend.IMmAccountInterceptor
    /* renamed from: c */
    public int mo161148c() {
        MmRecordManager.f117918g.mo164552c();
        MmAudioRecordService.Companion aVar = MmAudioRecordService.f117956f;
        Context a = C45851c.m181646a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmContext.getContext()");
        aVar.mo164590c(a);
        MmAudioUploadCenter.m185966c();
        return 1;
    }

    @Override // com.ss.android.lark.mm.depend.IMmDepend.ILoginDepend.IMmAccountInterceptor
    /* renamed from: b */
    public IMmDepend.ILoginDepend.C45868b mo161147b() {
        return new IMmDepend.ILoginDepend.C45868b(null, ResString.f118656a.mo165504a(R.string.MMWeb_G_RecordingStopIfSwitch), ResString.f118656a.mo165504a(R.string.MMWeb_G_Switch), ResString.f118656a.mo165504a(R.string.MMWeb_G_Cancel));
    }
}
