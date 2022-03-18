package com.ss.android.lark.mm.module.player.speed.repo;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u00040\b¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/mm/module/player/speed/repo/SpeedRepo;", "", "()V", "getSilenceList", "", "objectToken", "", "onResult", "Lkotlin/Function1;", "Lcom/ss/android/lark/mm/module/player/speed/repo/SilenceResponse;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.player.speed.repo.a */
public final class SpeedRepo {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/player/speed/repo/SpeedRepo$getSilenceList$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/player/speed/repo/SilenceResponse;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.speed.repo.a$a */
    public static final class C46720a extends AbstractC47070c<SilenceResponse> {

        /* renamed from: a */
        final /* synthetic */ Function1 f117531a;

        C46720a(Function1 function1) {
            this.f117531a = function1;
        }

        /* renamed from: a */
        public void mo161289a(SilenceResponse silenceResponse) {
            this.f117531a.invoke(silenceResponse);
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            this.f117531a.invoke(null);
        }
    }

    /* renamed from: a */
    public final void mo164105a(String str, Function1<? super SilenceResponse, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(str, "objectToken");
        Intrinsics.checkParameterIsNotNull(function1, "onResult");
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45882j languageDependency = a.getLanguageDependency();
        Intrinsics.checkExpressionValueIsNotNull(languageDependency, "MmDepend.impl().languageDependency");
        Locale b = languageDependency.mo144666b();
        Intrinsics.checkExpressionValueIsNotNull(b, "MmDepend.impl().languageDependency.languageSetting");
        C47057a.m186293i(str, b.getLanguage(), new C46720a(function1));
    }
}
