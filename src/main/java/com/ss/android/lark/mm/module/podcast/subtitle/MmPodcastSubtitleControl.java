package com.ss.android.lark.mm.module.podcast.subtitle;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.module.framework.MmBaseControl;
import com.ss.android.lark.mm.module.player.core.subtitle.MmSubtitles;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.appreciable.MmAppreciablePodcastDetailTracker;
import com.ss.android.lark.mm.utils.MmRxThrowable;
import com.ss.android.lark.mm.utils.UrlUtil;
import io.reactivex.AbstractC69011s;
import io.reactivex.AbstractC69013u;
import io.reactivex.Single;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J4\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00150\u00172\u0018\b\u0002\u0010\u0018\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0017J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u001bR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u0004R$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u0004¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/mm/module/podcast/subtitle/MmPodcastSubtitleControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseControl;", "url", "", "(Ljava/lang/String;)V", "cacheDataMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/ss/android/lark/mm/module/player/core/subtitle/MmSubtitles;", "getCacheDataMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "host", "getHost", "()Ljava/lang/String;", "setHost", "token", "getToken", "setToken", "value", "getUrl", "setUrl", "loadPodcastSubtitles", "", "onLoadSuccess", "Lkotlin/Function1;", "onLoadError", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "loadPodcastSubtitlesRx", "Lio/reactivex/Single;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.f */
public final class MmPodcastSubtitleControl extends MmBaseControl {

    /* renamed from: a */
    private String f117770a;

    /* renamed from: b */
    private String f117771b;

    /* renamed from: c */
    private String f117772c;

    /* renamed from: d */
    private final ConcurrentHashMap<String, MmSubtitles> f117773d = new ConcurrentHashMap<>();

    /* renamed from: a */
    public final String mo164425a() {
        return this.f117771b;
    }

    /* renamed from: b */
    public final ConcurrentHashMap<String, MmSubtitles> mo164428b() {
        return this.f117773d;
    }

    /* renamed from: c */
    public final Single<MmSubtitles> mo164429c() {
        Single<MmSubtitles> create = Single.create(new C46791b(this));
        Intrinsics.checkExpressionValueIsNotNull(create, "Single.create { emitter …\n            })\n        }");
        return create;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/SingleEmitter;", "Lcom/ss/android/lark/mm/module/player/core/subtitle/MmSubtitles;", "kotlin.jvm.PlatformType", "subscribe"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.f$b */
    static final class C46791b<T> implements AbstractC69013u<T> {

        /* renamed from: a */
        final /* synthetic */ MmPodcastSubtitleControl f117777a;

        C46791b(MmPodcastSubtitleControl fVar) {
            this.f117777a = fVar;
        }

        @Override // io.reactivex.AbstractC69013u
        public final void subscribe(final AbstractC69011s<MmSubtitles> sVar) {
            Intrinsics.checkParameterIsNotNull(sVar, "emitter");
            this.f117777a.mo164427a(new Function1<MmSubtitles, Unit>() {
                /* class com.ss.android.lark.mm.module.podcast.subtitle.MmPodcastSubtitleControl.C46791b.C467921 */

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MmSubtitles mmSubtitles) {
                    invoke(mmSubtitles);
                    return Unit.INSTANCE;
                }

                public final void invoke(MmSubtitles mmSubtitles) {
                    Intrinsics.checkParameterIsNotNull(mmSubtitles, "it");
                    sVar.onSuccess(mmSubtitles);
                }
            }, new Function1<C47068a, Unit>() {
                /* class com.ss.android.lark.mm.module.podcast.subtitle.MmPodcastSubtitleControl.C46791b.C467932 */

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C47068a aVar) {
                    invoke(aVar);
                    return Unit.INSTANCE;
                }

                public final void invoke(C47068a aVar) {
                    MmRxThrowable mmRxThrowable;
                    MmRxThrowable d;
                    AbstractC69011s sVar = sVar;
                    if (aVar == null || (d = aVar.mo165309d()) == null) {
                        mmRxThrowable = new Throwable();
                    } else {
                        mmRxThrowable = d;
                    }
                    sVar.onError(mmRxThrowable);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo164426a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        this.f117772c = str;
        this.f117770a = UrlUtil.f118671a.mo165518b(this.f117772c);
        this.f117771b = UrlUtil.f118671a.mo165517a(this.f117772c);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/podcast/subtitle/MmPodcastSubtitleControl$loadPodcastSubtitles$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/player/core/subtitle/MmSubtitles;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.f$a */
    public static final class C46790a extends AbstractC47070c<MmSubtitles> {

        /* renamed from: a */
        final /* synthetic */ MmPodcastSubtitleControl f117774a;

        /* renamed from: b */
        final /* synthetic */ Function1 f117775b;

        /* renamed from: c */
        final /* synthetic */ Function1 f117776c;

        /* renamed from: a */
        public void mo161289a(MmSubtitles mmSubtitles) {
            MmAppreciablePodcastDetailTracker.f118531a.mo165393c();
            if (mmSubtitles != null) {
                int size = mmSubtitles.subtitles.size();
                for (int i = 0; i < size; i++) {
                    mmSubtitles.subtitles.get(i).index = i;
                }
                this.f117774a.mo164428b().put(this.f117774a.mo164425a(), mmSubtitles);
                MmAppreciablePodcastDetailTracker.f118531a.mo165394d();
                this.f117775b.invoke(mmSubtitles);
            }
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            C45855f.m181666e("MmPodcastSubtitleControl", "[subtitleMobile] error:" + aVar + ' ');
            Function1 function1 = this.f117776c;
            if (function1 != null) {
                Unit unit = (Unit) function1.invoke(aVar);
            }
        }

        C46790a(MmPodcastSubtitleControl fVar, Function1 function1, Function1 function12) {
            this.f117774a = fVar;
            this.f117775b = function1;
            this.f117776c = function12;
        }
    }

    public MmPodcastSubtitleControl(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        this.f117770a = UrlUtil.f118671a.mo165518b(str);
        this.f117771b = UrlUtil.f118671a.mo165517a(str);
        this.f117772c = str;
    }

    /* renamed from: a */
    public final void mo164427a(Function1<? super MmSubtitles, Unit> function1, Function1<? super C47068a, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(function1, "onLoadSuccess");
        MmSubtitles mmSubtitles = this.f117773d.get(this.f117771b);
        if (mmSubtitles == null) {
            C47057a.m186278c(this.f117770a, this.f117771b).mo165338a(new C46790a(this, function1, function12), true);
        } else {
            function1.invoke(mmSubtitles);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mm.module.podcast.subtitle.f */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m185448a(MmPodcastSubtitleControl fVar, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 2) != 0) {
            function12 = null;
        }
        fVar.mo164427a(function1, function12);
    }
}
