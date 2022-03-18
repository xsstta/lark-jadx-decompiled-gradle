package com.bytedance.ee.bear.wikiv2.common.p590a;

import com.bytedance.ee.log.C13479a;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\b\u0004\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\b\u001a!\u0010\u0006\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\b\u0004\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\b\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\t\u001ab\u0010\n\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u0001H\fH\f \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u0001H\fH\f\u0018\u00010\u000b0\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u000b2#\b\u0004\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u0011H\f¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00050\rH\b\u001ab\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u00120\u000b\"\u0004\b\u0000\u0010\f*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u00120\u000b25\b\u0004\u0010\u0003\u001a/\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\f0\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u00120\u000b0\rH\b\u001ab\u0010\u0013\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u0001H\fH\f \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u0001H\fH\f\u0018\u00010\u000b0\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u000b2#\b\u0004\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u0011H\f¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00050\rH\b\u001ab\u0010\u0014\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u0001H\fH\f \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u0001H\fH\f\u0018\u00010\u000b0\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u000b2#\b\u0004\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u0011H\f¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00050\rH\b¨\u0006\u0015"}, d2 = {"postCall", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "consumer", "Lkotlin/Function0;", "", "postCallSerial", "disposeOnClear", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "execute", "Lio/reactivex/Flowable;", "T", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "t", "onOptNoneResumeNext", "Lcom/bytedance/ee/bear/wikiv2/common/util/Opt;", "post", "postSerial", "wiki-implv2_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.common.a.b */
public final class C12239b {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.common.a.b$a */
    public static final class C12240a<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C12240a f32886a = new C12240a();

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a("RxUtils", th);
        }
    }

    /* renamed from: a */
    public static final Disposable m50938a(Disposable disposable, C68289a aVar) {
        Intrinsics.checkParameterIsNotNull(disposable, "$this$disposeOnClear");
        Intrinsics.checkParameterIsNotNull(aVar, "disposables");
        aVar.mo237937a(disposable);
        return disposable;
    }
}
