package com.tt.miniapp.launchaction;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0007\u001a\u00028\u0000H$¢\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u0000H$¢\u0006\u0002\u0010\nJ\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\bJ%\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\rH$¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0001H$¢\u0006\u0002\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/tt/miniapp/launchaction/BasePreloadManager;", "P", "R", "", "()V", "doLoad", "Lio/reactivex/Observable;", "p", "(Ljava/lang/Object;)Lio/reactivex/Observable;", "getDataFromCache", "(Ljava/lang/Object;)Ljava/lang/Object;", "getResult", "isDataResultOk", "", "r", "fromCache", "(Ljava/lang/Object;Ljava/lang/Object;Z)Z", "onGetResultFail", "", "saveData", "(Ljava/lang/Object;Ljava/lang/Object;)V", "NullableResult", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.miniapp.launchaction.b */
public abstract class BasePreloadManager<P, R> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract R mo88591a(P p);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo231698a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo88594a(P p, R r);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo88596a(P p, R r, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Observable<R> mo88598b(P p);

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00018\u0001¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/tt/miniapp/launchaction/BasePreloadManager$NullableResult;", "", "r", "(Lcom/tt/miniapp/launchaction/BasePreloadManager;Ljava/lang/Object;)V", "getR", "()Ljava/lang/Object;", "Ljava/lang/Object;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.miniapp.launchaction.b$a */
    public final class NullableResult {

        /* renamed from: b */
        private final R f167318b;

        /* renamed from: a */
        public final R mo231710a() {
            return this.f167318b;
        }

        public NullableResult(R r) {
            this.f167318b = r;
        }
    }

    /* renamed from: c */
    public Observable<R> mo231709c(P p) {
        Observable<R> flatMap = Observable.just(new NullableResult(mo88591a(p))).flatMap(new C66298b(this, p));
        Intrinsics.checkExpressionValueIsNotNull(flatMap, "Observable.just(Nullable…      }\n                }");
        return flatMap;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00022\u0016\u0010\u0005\u001a\u00120\u0006R\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "R", "kotlin.jvm.PlatformType", "P", "cacheResult", "Lcom/tt/miniapp/launchaction/BasePreloadManager$NullableResult;", "Lcom/tt/miniapp/launchaction/BasePreloadManager;", "apply"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.tt.miniapp.launchaction.b$b */
    static final class C66298b<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ BasePreloadManager f167319a;

        /* renamed from: b */
        final /* synthetic */ Object f167320b;

        C66298b(BasePreloadManager bVar, Object obj) {
            this.f167319a = bVar;
            this.f167320b = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: com.tt.miniapp.launchaction.b */
        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: com.tt.miniapp.launchaction.b */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final Observable<R> apply(BasePreloadManager<P, R>.NullableResult aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "cacheResult");
            if (aVar.mo231710a() == null || !this.f167319a.mo88596a(this.f167320b, aVar.mo231710a(), true)) {
                return this.f167319a.mo88598b(this.f167320b).map(new Function<T, R>(this) {
                    /* class com.tt.miniapp.launchaction.BasePreloadManager.C66298b.C662991 */

                    /* renamed from: a */
                    final /* synthetic */ C66298b f167321a;

                    {
                        this.f167321a = r1;
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.tt.miniapp.launchaction.b */
                    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: com.tt.miniapp.launchaction.b */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // io.reactivex.functions.Function
                    public final R apply(R r) {
                        if (this.f167321a.f167319a.mo88596a(this.f167321a.f167320b, r, false)) {
                            this.f167321a.f167319a.mo88594a(this.f167321a.f167320b, r);
                        } else {
                            this.f167321a.f167319a.mo231698a();
                        }
                        return r;
                    }
                });
            }
            return Observable.just(aVar.mo231710a());
        }
    }
}
