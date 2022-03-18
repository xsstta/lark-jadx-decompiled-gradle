package com.ss.android.lark.banner.common;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.banner.export.AbstractC29478a;
import com.ss.android.lark.banner.export.entity.C29489b;
import com.ss.android.lark.banner.statistics.BannerApm;
import com.ss.android.lark.log.Log;
import io.reactivex.AbstractC69009q;
import io.reactivex.Emitter;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p3456d.C68279a;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0003J$\u0010\r\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/banner/common/BannerPriorityDecision;", "", "bannerFetcher", "Lcom/ss/android/lark/banner/common/BannerFetcher;", "(Lcom/ss/android/lark/banner/common/BannerFetcher;)V", "getFirstEnableBanner", "", "emitter", "Lio/reactivex/Emitter;", "Lcom/ss/android/lark/banner/export/Banner;", "bannerInfoList", "", "Lcom/ss/android/lark/banner/export/entity/BannerInfo;", "run", "banners", "result", "Lcom/ss/android/lark/banner/common/DecisionResult;", "Companion", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.banner.b.b */
public final class BannerPriorityDecision {

    /* renamed from: a */
    public static final Companion f73572a = new Companion(null);

    /* renamed from: b */
    private final AbstractC29458a f73573b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/banner/common/BannerPriorityDecision$Companion;", "", "()V", "TAG", "", "TIMEOUT", "", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"com/ss/android/lark/banner/common/BannerPriorityDecision$run$3", "Lio/reactivex/Observer;", "Lcom/ss/android/lark/banner/export/Banner;", "banner", "onComplete", "", "onError", "error", "", "onNext", "onSubscribe", "disposable", "Lio/reactivex/disposables/Disposable;", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.b.b$f */
    public static final class C29463f implements AbstractC69009q<AbstractC29478a> {

        /* renamed from: a */
        final /* synthetic */ DecisionResult f73585a;

        /* renamed from: b */
        private AbstractC29478a f73586b;

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            Intrinsics.checkParameterIsNotNull(disposable, "disposable");
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f73585a.mo104344a(this.f73586b);
        }

        C29463f(DecisionResult eVar) {
            this.f73585a = eVar;
        }

        /* renamed from: a */
        public void onNext(AbstractC29478a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "banner");
            this.f73586b = aVar;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "error");
            Log.m165386e("BannerPriorityDecision", th);
            this.f73585a.mo104344a(null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "Lcom/ss/android/lark/banner/export/Banner;", "kotlin.jvm.PlatformType", "subscribe"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.b.b$e */
    public static final class C29462e<T> implements ObservableOnSubscribe<AbstractC29478a> {

        /* renamed from: a */
        final /* synthetic */ BannerPriorityDecision f73583a;

        /* renamed from: b */
        final /* synthetic */ List f73584b;

        C29462e(BannerPriorityDecision bVar, List list) {
            this.f73583a = bVar;
            this.f73584b = list;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public final void subscribe(ObservableEmitter<AbstractC29478a> observableEmitter) {
            Intrinsics.checkParameterIsNotNull(observableEmitter, "emitter");
            this.f73583a.mo104329a(observableEmitter, this.f73584b);
        }
    }

    public BannerPriorityDecision(AbstractC29458a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "bannerFetcher");
        this.f73573b = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.b.b$c */
    public static final class C29460c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BannerPriorityDecision f73578a;

        /* renamed from: b */
        final /* synthetic */ C29489b f73579b;

        /* renamed from: c */
        final /* synthetic */ Emitter f73580c;

        /* renamed from: d */
        final /* synthetic */ List f73581d;

        C29460c(BannerPriorityDecision bVar, C29489b bVar2, Emitter emitter, List list) {
            this.f73578a = bVar;
            this.f73579b = bVar2;
            this.f73580c = emitter;
            this.f73581d = list;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            BannerApm.f73689a.mo104460a(this.f73579b.mo104445c(), th.toString());
            this.f73578a.mo104329a(this.f73580c, CollectionsKt.drop(this.f73581d, 1));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isEnable", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.b.b$b */
    public static final class C29459b<T> implements Consumer<Boolean> {

        /* renamed from: a */
        final /* synthetic */ BannerPriorityDecision f73574a;

        /* renamed from: b */
        final /* synthetic */ Emitter f73575b;

        /* renamed from: c */
        final /* synthetic */ AbstractC29478a f73576c;

        /* renamed from: d */
        final /* synthetic */ List f73577d;

        C29459b(BannerPriorityDecision bVar, Emitter emitter, AbstractC29478a aVar, List list) {
            this.f73574a = bVar;
            this.f73575b = emitter;
            this.f73576c = aVar;
            this.f73577d = list;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: io.reactivex.Emitter */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void accept(Boolean bool) {
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                this.f73575b.onNext(this.f73576c);
                this.f73575b.onComplete();
                return;
            }
            this.f73574a.mo104329a(this.f73575b, CollectionsKt.drop(this.f73577d, 1));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/banner/export/entity/BannerInfo;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.b.b$d */
    public static final class C29461d<T> implements Comparator<C29489b> {

        /* renamed from: a */
        public static final C29461d f73582a = new C29461d();

        C29461d() {
        }

        /* renamed from: a */
        public final int compare(C29489b bVar, C29489b bVar2) {
            int i;
            int i2 = 0;
            if (bVar != null) {
                i = bVar.mo104444b();
            } else {
                i = 0;
            }
            if (bVar2 != null) {
                i2 = bVar2.mo104444b();
            }
            return i2 - i;
        }
    }

    /* renamed from: a */
    public final void mo104329a(Emitter<AbstractC29478a> emitter, List<? extends C29489b> list) {
        C29489b bVar = (C29489b) CollectionsKt.firstOrNull((List) list);
        if (bVar != null) {
            AbstractC29478a a = this.f73573b.mo104328a(bVar.mo104445c());
            if (a != null) {
                a.mo104442c(bVar);
                a.mo104366a().timeout(3000, TimeUnit.MILLISECONDS).subscribe(new C29459b(this, emitter, a, list), new C29460c(this, bVar, emitter, list));
                return;
            }
            mo104329a(emitter, CollectionsKt.drop(list, 1));
            return;
        }
        emitter.onComplete();
    }

    /* renamed from: a */
    public final void mo104330a(List<? extends C29489b> list, DecisionResult<AbstractC29478a> eVar) {
        Intrinsics.checkParameterIsNotNull(list, "banners");
        Intrinsics.checkParameterIsNotNull(eVar, "result");
        if (list.isEmpty()) {
            eVar.mo104344a(null);
            return;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        CollectionsKt.sortWith(mutableList, C29461d.f73582a);
        Observable create = Observable.create(new C29462e(this, mutableList));
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        Observable subscribeOn = create.subscribeOn(C68279a.m265022a(coreThreadPool.getCachedThreadPool()));
        CoreThreadPool coreThreadPool2 = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool2, "CoreThreadPool.getDefault()");
        subscribeOn.observeOn(C68279a.m265022a(coreThreadPool2.getCachedThreadPool())).subscribe(new C29463f(eVar));
    }
}
