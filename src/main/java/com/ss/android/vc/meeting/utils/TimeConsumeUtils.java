package com.ss.android.vc.meeting.utils;

import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.p3457e.C68296b;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/vc/meeting/utils/TimeConsumeUtils;", "", "()V", "TAG", "", "calculateEnd", "", "subject", "Lio/reactivex/subjects/PublishSubject;", "", "calculateStart", "logTag", "calculateTimeConsumption", "", "runnable", "Ljava/lang/Runnable;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.utils.o */
public final class TimeConsumeUtils {

    /* renamed from: a */
    public static final TimeConsumeUtils f160486a = new TimeConsumeUtils();

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.o$a */
    public static final class C63523a<T> implements Consumer<Boolean> {

        /* renamed from: a */
        public static final C63523a f160487a = new C63523a();

        C63523a() {
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
        }
    }

    private TimeConsumeUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m248928a(C68296b<Boolean> bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "subject");
        bVar.onNext(true);
        bVar.onComplete();
    }

    @JvmStatic
    /* renamed from: a */
    public static final C68296b<Boolean> m248927a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "logTag");
        System.currentTimeMillis();
        C68296b<Boolean> a = C68296b.m265052a();
        Intrinsics.checkExpressionValueIsNotNull(a, "PublishSubject.create<Boolean>()");
        a.subscribeOn(LarkRxSchedulers.computation()).observeOn(LarkRxSchedulers.computation()).subscribe(C63523a.f160487a);
        return a;
    }
}
