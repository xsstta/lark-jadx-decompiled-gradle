package com.bytedance.ee.bear.onboarding.synchronization;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J@\u0010\u0004\u001a\u00020\u00032 \u0010\u0005\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00030\u0006H&J:\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00062\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00030\u0006H&J:\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00062\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00030\u0006H&¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/onboarding/synchronization/IOnBoardingNetSynchronizer;", "", "dispose", "", "fetchOnBoardings", "onResult", "Lkotlin/Function1;", "", "", "", "onError", "", "syncDoneToRemote", "action", "syncUpdateToRemote", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.onboarding.synchronization.a */
public interface IOnBoardingNetSynchronizer {
    /* renamed from: a */
    void mo39640a();

    /* renamed from: a */
    void mo39641a(String str, Function1<? super Boolean, Unit> function1, Function1<? super Throwable, Unit> function12);

    /* renamed from: a */
    void mo39642a(Function1<? super Map<String, Boolean>, Unit> function1, Function1<? super Throwable, Unit> function12);

    /* renamed from: b */
    void mo39643b(String str, Function1<? super Boolean, Unit> function1, Function1<? super Throwable, Unit> function12);
}
