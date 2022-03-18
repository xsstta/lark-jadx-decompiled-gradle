package com.ss.android.lark.mm.module.record.detail.subtitle;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingParagraph;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSubtitles;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.MmBaseControl;
import com.ss.android.lark.mm.module.record.model.MmRecordPara;
import com.ss.android.lark.mm.module.record.model.MmRecordSentence;
import com.ss.android.lark.mm.module.record.model.MmRecordWord;
import com.ss.android.lark.mm.net.api.MmApiService2;
import com.ss.android.lark.mm.net.error.IHttpLocalErrorHandler;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45857i;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.push.IPushRecordSubtitleListener;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import io.reactivex.AbstractC68259a;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001&B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fJ*\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u0018J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0010H\u0016J\u0010\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020#H\u0016J\u000e\u0010$\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ\u0010\u0010%\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020#H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/subtitle/MmRecordSubtitleControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseControl;", "Lcom/ss/android/lark/mm/push/IPushRecordSubtitleListener;", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "(Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;)V", "getBaseInfo", "()Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/lark/mm/module/record/detail/subtitle/MmRecordSubtitleControl$IMmRecordSubtitleControlListener;", "mRecordPara", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/ss/android/lark/mm/module/record/model/MmRecordPara;", "addListener", "", "listener", "getParas", "loadPara", "pid", "translateLangType", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "onSuccess", "Lkotlin/Function1;", "loadSubtitles", "Lio/reactivex/Completable;", "localErrorHandler", "Lcom/ss/android/lark/mm/net/error/IHttpLocalErrorHandler;", "mapMeetingParaToRecord", "para", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingParagraph;", "onDestroy", "onPushRecordSubtitle", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/record/model/MmRecordSentence;", "removeListener", "setSentenceContent", "IMmRecordSubtitleControlListener", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.detail.a.e */
public final class MmRecordSubtitleControl extends MmBaseControl implements IPushRecordSubtitleListener {

    /* renamed from: a */
    public final ConcurrentHashMap<String, MmRecordPara> f118041a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final CopyOnWriteArrayList<IMmRecordSubtitleControlListener> f118042b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private final MmBaseInfo f118043c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/subtitle/MmRecordSubtitleControl$IMmRecordSubtitleControlListener;", "", "onPushRecordSubtitle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/record/model/MmRecordSentence;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.a.e$a */
    public interface IMmRecordSubtitleControlListener {
        /* renamed from: a */
        void mo164674a(MmRecordSentence mmRecordSentence);
    }

    /* renamed from: a */
    public final ConcurrentHashMap<String, MmRecordPara> mo164669a() {
        return this.f118041a;
    }

    /* renamed from: b */
    public final MmBaseInfo mo164672b() {
        return this.f118043c;
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseControl
    /* renamed from: k */
    public void mo161235k() {
        super.mo161235k();
        this.f118042b.clear();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/record/detail/subtitle/MmRecordSubtitleControl$loadPara$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSubtitles;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.a.e$b */
    public static final class C46877b extends AbstractC47070c<MmMeetingSubtitles> {

        /* renamed from: a */
        final /* synthetic */ MmRecordSubtitleControl f118044a;

        /* renamed from: b */
        final /* synthetic */ String f118045b;

        /* renamed from: c */
        final /* synthetic */ Function1 f118046c;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.record.detail.a.e$b$a */
        public static final class RunnableC46878a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C46877b f118047a;

            /* renamed from: b */
            final /* synthetic */ MmMeetingSubtitles f118048b;

            RunnableC46878a(C46877b bVar, MmMeetingSubtitles mmMeetingSubtitles) {
                this.f118047a = bVar;
                this.f118048b = mmMeetingSubtitles;
            }

            public final void run() {
                List<MmMeetingParagraph> paragraphs;
                T t;
                MmMeetingSubtitles mmMeetingSubtitles = this.f118048b;
                if (mmMeetingSubtitles != null && (paragraphs = mmMeetingSubtitles.getParagraphs()) != null) {
                    Iterator<T> it = paragraphs.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        T t2 = t;
                        Intrinsics.checkExpressionValueIsNotNull(t2, "it");
                        if (Intrinsics.areEqual(t2.getPid(), this.f118047a.f118045b)) {
                            break;
                        }
                    }
                    T t3 = t;
                    if (t3 != null) {
                        final MmRecordPara a = this.f118047a.f118044a.mo164667a((MmMeetingParagraph) t3);
                        C45859k.m181685a(new Runnable(this) {
                            /* class com.ss.android.lark.mm.module.record.detail.subtitle.MmRecordSubtitleControl.C46877b.RunnableC46878a.RunnableC468791 */

                            /* renamed from: a */
                            final /* synthetic */ RunnableC46878a f118049a;

                            {
                                this.f118049a = r1;
                            }

                            public final void run() {
                                this.f118049a.f118047a.f118046c.invoke(a);
                            }
                        });
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo161289a(MmMeetingSubtitles mmMeetingSubtitles) {
            C45857i.m181676a(new RunnableC46878a(this, mmMeetingSubtitles));
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            C45855f.m181666e("MmRecordSubtitleControl", "[loadPara] error: " + aVar);
        }

        C46877b(MmRecordSubtitleControl eVar, String str, Function1 function1) {
            this.f118044a = eVar;
            this.f118045b = str;
            this.f118046c = function1;
        }
    }

    /* renamed from: b */
    public final void mo164673b(IMmRecordSubtitleControlListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f118042b.remove(aVar);
    }

    public MmRecordSubtitleControl(MmBaseInfo mmBaseInfo) {
        Intrinsics.checkParameterIsNotNull(mmBaseInfo, "baseInfo");
        this.f118043c = mmBaseInfo;
    }

    /* renamed from: a */
    public final void mo164670a(IMmRecordSubtitleControlListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f118042b.add(aVar);
    }

    /* renamed from: b */
    private final void m185730b(MmRecordSentence mmRecordSentence) {
        StringBuilder sb = new StringBuilder();
        List<MmRecordWord> words = mmRecordSentence.getWords();
        Intrinsics.checkExpressionValueIsNotNull(words, "data.words");
        for (T t : words) {
            Intrinsics.checkExpressionValueIsNotNull(t, "it");
            sb.append(t.getContent());
        }
        mmRecordSentence.setSentences(sb.toString());
    }

    /* renamed from: a */
    public final MmRecordPara mo164667a(MmMeetingParagraph mmMeetingParagraph) {
        MmRecordPara mmRecordPara = MmRecordPara.toMmRecordPara(mmMeetingParagraph);
        Intrinsics.checkExpressionValueIsNotNull(mmRecordPara, "recordPara");
        List<MmRecordSentence> sentences = mmRecordPara.getSentences();
        Intrinsics.checkExpressionValueIsNotNull(sentences, "recordPara.sentences");
        for (T t : sentences) {
            Intrinsics.checkExpressionValueIsNotNull(t, "it");
            m185730b((MmRecordSentence) t);
        }
        return mmRecordPara;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/ss/android/lark/mm/module/record/model/MmRecordPara;", "it", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSubtitles;", "apply"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.a.e$c */
    public static final class C46880c<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ MmRecordSubtitleControl f118051a;

        C46880c(MmRecordSubtitleControl eVar) {
            this.f118051a = eVar;
        }

        /* renamed from: a */
        public final ConcurrentHashMap<String, MmRecordPara> apply(MmMeetingSubtitles mmMeetingSubtitles) {
            Intrinsics.checkParameterIsNotNull(mmMeetingSubtitles, "it");
            this.f118051a.f118041a.clear();
            List<MmMeetingParagraph> paragraphs = mmMeetingSubtitles.getParagraphs();
            if (paragraphs != null) {
                for (T t : paragraphs) {
                    Intrinsics.checkExpressionValueIsNotNull(t, "it");
                    String pid = t.getPid();
                    Intrinsics.checkExpressionValueIsNotNull(pid, "it.pid");
                    this.f118051a.f118041a.put(pid, this.f118051a.mo164667a((MmMeetingParagraph) t));
                }
            }
            return this.f118051a.f118041a;
        }
    }

    @Override // com.ss.android.lark.mm.push.IPushRecordSubtitleListener
    /* renamed from: a */
    public void mo161192a(MmRecordSentence mmRecordSentence) {
        Intrinsics.checkParameterIsNotNull(mmRecordSentence, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        m185730b(mmRecordSentence);
        Iterator<T> it = this.f118042b.iterator();
        while (it.hasNext()) {
            it.next().mo164674a(mmRecordSentence);
        }
    }

    /* renamed from: a */
    public final AbstractC68259a mo164668a(MmTranslateLangType mmTranslateLangType, IHttpLocalErrorHandler aVar) {
        Intrinsics.checkParameterIsNotNull(mmTranslateLangType, "translateLangType");
        C45855f.m181664c("MmRecordSubtitleControl", "loadSubtitles");
        MmApiService2 bVar = MmApiService2.f118430a;
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45875c domainDepend = a.getDomainDepend();
        Intrinsics.checkExpressionValueIsNotNull(domainDepend, "MmDepend.impl().domainDepend");
        String a2 = domainDepend.mo144616a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl().domainDepend.host");
        String objectToken = this.f118043c.getObjectToken();
        Intrinsics.checkExpressionValueIsNotNull(objectToken, "baseInfo.objectToken");
        AbstractC68259a ignoreElement = MmApiService2.m186296a(bVar, a2, objectToken, mmTranslateLangType, null, aVar, 8, null).observeOn(LarkRxSchedulers.computation()).map(new C46880c(this)).ignoreElement();
        Intrinsics.checkExpressionValueIsNotNull(ignoreElement, "MmApiService2.loadSubtit…         .ignoreElement()");
        return ignoreElement;
    }

    /* renamed from: a */
    public final void mo164671a(String str, MmTranslateLangType mmTranslateLangType, Function1<? super MmRecordPara, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(str, "pid");
        Intrinsics.checkParameterIsNotNull(mmTranslateLangType, "translateLangType");
        Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45875c domainDepend = a.getDomainDepend();
        Intrinsics.checkExpressionValueIsNotNull(domainDepend, "MmDepend.impl().domainDepend");
        C47057a.m186257a(domainDepend.mo144616a(), this.f118043c.getObjectToken(), str, mmTranslateLangType.getValue(), new C46877b(this, str, function1));
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC68259a m185729a(MmRecordSubtitleControl eVar, MmTranslateLangType mmTranslateLangType, IHttpLocalErrorHandler aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar = null;
        }
        return eVar.mo164668a(mmTranslateLangType, aVar);
    }
}
