package com.ss.android.lark.mm.module.record.detail.titlebar;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.framework.MmBaseControl;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45852d;
import com.ss.android.lark.mm.p2288b.C45855f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/titlebar/MmRecordTitleBarControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseControl;", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "(Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;)V", "getBaseInfo", "()Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "changeTitle", "", "title", "", "onSuccess", "Lkotlin/Function0;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.detail.titlebar.d */
public final class MmRecordTitleBarControl extends MmBaseControl {

    /* renamed from: a */
    private final MmBaseInfo f118119a;

    /* renamed from: a */
    public final MmBaseInfo mo164756a() {
        return this.f118119a;
    }

    public MmRecordTitleBarControl(MmBaseInfo mmBaseInfo) {
        Intrinsics.checkParameterIsNotNull(mmBaseInfo, "baseInfo");
        this.f118119a = mmBaseInfo;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/record/detail/titlebar/MmRecordTitleBarControl$changeTitle$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.titlebar.d$a */
    public static final class C46918a extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ MmRecordTitleBarControl f118120a;

        /* renamed from: b */
        final /* synthetic */ String f118121b;

        /* renamed from: c */
        final /* synthetic */ Function0 f118122c;

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            C45855f.m181666e("MmRecordTitleBarControl", "[changeTitle] failed: " + aVar);
        }

        /* renamed from: a */
        public void mo161289a(String str) {
            this.f118120a.mo164756a().setTopic(this.f118121b);
            C45852d.m181651a().mo161150a(this.f118120a.mo164756a().getObjectToken()).mo164521a(this.f118121b);
            this.f118122c.invoke();
        }

        C46918a(MmRecordTitleBarControl dVar, String str, Function0 function0) {
            this.f118120a = dVar;
            this.f118121b = str;
            this.f118122c = function0;
        }
    }

    /* renamed from: a */
    public final void mo164757a(String str, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(function0, "onSuccess");
        C47057a.m186291h(this.f118119a.getObjectToken(), str, new C46918a(this, str, function0));
    }
}
