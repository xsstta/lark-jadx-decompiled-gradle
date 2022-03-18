package com.ss.android.lark.mm.module.detail.subtitles;

import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.data.MmEditDenyType;
import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.data.MmParticipantsSearchRes;
import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.data.MmSuggestSpeakerResponse;
import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.data.MmUpdateSpeakerDenyRes;
import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.data.MmUpdateSpeakerRes;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingParagraph;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSentence;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSubtitles;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmSubtitleDataAdapter;
import com.ss.android.lark.mm.module.detail.subtitles.model.response.MmKeywordRes;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.MmBaseControl;
import com.ss.android.lark.mm.module.highlight.model.MmHighlightInfo;
import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import com.ss.android.lark.mm.net.api.MmApiService2;
import com.ss.android.lark.mm.net.error.IHttpLocalErrorHandler;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.AbstractC47071d;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import io.reactivex.AbstractC69011s;
import io.reactivex.AbstractC69013u;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001LB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0011J$\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0%2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)J\u0012\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0%J*\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00170%2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-J\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00170%J8\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020\u00032\u001a\u00101\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u000203\u0018\u00010\u000b\u0012\u0004\u0012\u00020\"022\f\u00104\u001a\b\u0012\u0004\u0012\u00020\"05J\b\u00106\u001a\u00020\"H\u0016J*\u00107\u001a\u00020\"2\"\u00108\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020:09j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020:`;J\u000e\u0010<\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0011J*\u0010=\u001a\u0010\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u0003\u0018\u00010>2\u0014\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020:\u0018\u00010@J8\u0010A\u001a\u00020\"2\u0006\u0010B\u001a\u00020\u00032\u001a\u00101\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u000203\u0018\u00010\u000b\u0012\u0004\u0012\u00020\"022\f\u00104\u001a\b\u0012\u0004\u0012\u00020\"05Jt\u0010C\u001a\u00020\"2\u0006\u00100\u001a\u00020\u00032\u0006\u0010D\u001a\u00020\u00032\u0006\u0010E\u001a\u0002032\u0018\u00101\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0004\u0012\u00020\"022:\u00104\u001a6\u0012\u0015\u0012\u0013\u0018\u00010?¢\u0006\f\bG\u0012\b\bH\u0012\u0004\b\b(I\u0012\u0015\u0012\u0013\u0018\u00010J¢\u0006\f\bG\u0012\b\bH\u0012\u0004\b\b(K\u0012\u0004\u0012\u00020\"0FR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR.\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\tR\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\n\u001a\u0004\u0018\u00010\u0017@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\tR.\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000eR\"\u0010\u001e\u001a\u0004\u0018\u00010\u00172\b\u0010\n\u001a\u0004\u0018\u00010\u0017@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\t¨\u0006M"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/MmMeetingSubtitleControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseControl;", "host", "", "token", "url", "requestId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "<set-?>", "", "keyword", "getKeyword", "()Ljava/util/List;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/lark/mm/module/detail/subtitles/MmMeetingSubtitleControl$IMmPushChangeSubtitle;", "getRequestId", "", "subtitleContentSize", "getSubtitleContentSize", "()J", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSubtitles;", "subtitles", "getSubtitles", "()Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSubtitles;", "getToken", "translateKeyword", "getTranslateKeyword", "translateSubtitles", "getTranslateSubtitles", "getUrl", "addListener", "", "listener", "loadKeywords", "Lio/reactivex/Single;", "translateLang", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "isFromNetwork", "", "loadKeywordsForStartUp", "loadSubtitles", "localErrorHandler", "Lcom/ss/android/lark/mm/net/error/IHttpLocalErrorHandler;", "loadSubtitlesForStartUp", "loadSuggestedSpeakers", "paraId", "onSuccess", "Lkotlin/Function1;", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "onError", "Lkotlin/Function0;", "onDestroy", "onPushChangeSubtitle", "paragraphMap", "Ljava/util/HashMap;", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingParagraph;", "Lkotlin/collections/HashMap;", "removeListener", "replaceOldPara", "Lkotlin/Pair;", "", "", "searchSpeakers", "keywords", "updateSpeaker", "editSession", "speaker", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "denyType", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "error", "IMmPushChangeSubtitle", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.subtitles.d */
public final class MmMeetingSubtitleControl extends MmBaseControl {

    /* renamed from: a */
    public MmMeetingSubtitles f116357a;

    /* renamed from: b */
    public MmMeetingSubtitles f116358b;

    /* renamed from: c */
    public List<String> f116359c;

    /* renamed from: d */
    public List<String> f116360d;

    /* renamed from: e */
    public long f116361e;

    /* renamed from: f */
    private final CopyOnWriteArrayList<IMmPushChangeSubtitle> f116362f = new CopyOnWriteArrayList<>();

    /* renamed from: g */
    private final String f116363g;

    /* renamed from: h */
    private final String f116364h;

    /* renamed from: i */
    private final String f116365i;

    /* renamed from: j */
    private final String f116366j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/MmMeetingSubtitleControl$IMmPushChangeSubtitle;", "", "onPushChangeSubtitlePara", "", "para", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingParagraph;", "paraPosition", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.d$a */
    public interface IMmPushChangeSubtitle {
        /* renamed from: a */
        void mo162315a(MmMeetingParagraph mmMeetingParagraph, int i);
    }

    /* renamed from: a */
    public final MmMeetingSubtitles mo162296a() {
        return this.f116357a;
    }

    /* renamed from: b */
    public final MmMeetingSubtitles mo162304b() {
        return this.f116358b;
    }

    /* renamed from: c */
    public final List<String> mo162307c() {
        return this.f116359c;
    }

    /* renamed from: d */
    public final long mo162308d() {
        return this.f116361e;
    }

    /* renamed from: g */
    public final String mo162311g() {
        return this.f116363g;
    }

    /* renamed from: h */
    public final String mo162312h() {
        return this.f116364h;
    }

    /* renamed from: i */
    public final String mo162313i() {
        return this.f116365i;
    }

    /* renamed from: j */
    public final String mo162314j() {
        return this.f116366j;
    }

    /* renamed from: a */
    public final void mo162303a(HashMap<String, MmMeetingParagraph> hashMap) {
        MmMeetingSubtitles mmMeetingSubtitles;
        List<MmMeetingParagraph> paragraphs;
        MmMeetingParagraph mmMeetingParagraph;
        Intrinsics.checkParameterIsNotNull(hashMap, "paragraphMap");
        Pair<Integer, String> a = mo162299a((Map<String, ? extends MmMeetingParagraph>) hashMap);
        if (a != null && (mmMeetingSubtitles = this.f116357a) != null && (paragraphs = mmMeetingSubtitles.getParagraphs()) != null && (mmMeetingParagraph = paragraphs.get(a.getFirst().intValue())) != null) {
            Iterator<T> it = this.f116362f.iterator();
            while (it.hasNext()) {
                it.next().mo162315a(mmMeetingParagraph, a.getFirst().intValue());
            }
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseControl
    /* renamed from: k */
    public void mo161235k() {
        super.mo161235k();
        this.f116362f.clear();
    }

    /* renamed from: e */
    public final Single<MmMeetingSubtitles> mo162309e() {
        Single<MmMeetingSubtitles> create = Single.create(new C46173e(this));
        Intrinsics.checkExpressionValueIsNotNull(create, "Single.create {\n        …\n            })\n        }");
        return create;
    }

    /* renamed from: f */
    public final Single<List<String>> mo162310f() {
        Single<List<String>> create = Single.create(new C46170c(this));
        Intrinsics.checkExpressionValueIsNotNull(create, "Single.create<List<Strin…             })\n        }");
        return create;
    }

    /* renamed from: b */
    public final void mo162305b(IMmPushChangeSubtitle aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f116362f.remove(aVar);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "it", "apply"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.d$b */
    public static final class C46169b<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ MmMeetingSubtitleControl f116367a;

        /* renamed from: b */
        final /* synthetic */ MmTranslateLangType f116368b;

        C46169b(MmMeetingSubtitleControl dVar, MmTranslateLangType mmTranslateLangType) {
            this.f116367a = dVar;
            this.f116368b = mmTranslateLangType;
        }

        /* renamed from: a */
        public final List<String> apply(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "it");
            if (this.f116368b == MmTranslateLangType.DEFAULT) {
                this.f116367a.f116359c = list;
            } else {
                this.f116367a.f116360d = list;
            }
            return list;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/detail/subtitles/MmMeetingSubtitleControl$loadSuggestedSpeakers$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/data/MmSuggestSpeakerResponse;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.d$f */
    public static final class C46175f extends AbstractC47070c<MmSuggestSpeakerResponse> {

        /* renamed from: a */
        final /* synthetic */ Function1 f116377a;

        /* renamed from: b */
        final /* synthetic */ Function0 f116378b;

        /* renamed from: a */
        public void mo161289a(MmSuggestSpeakerResponse mmSuggestSpeakerResponse) {
            Intrinsics.checkParameterIsNotNull(mmSuggestSpeakerResponse, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            C45855f.m181664c("MmMeetingSubtitleControl", "loadSuggestedSpeakers success");
            this.f116377a.invoke(mmSuggestSpeakerResponse.getList());
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            C45855f.m181666e("MmMeetingSubtitleControl", "loadSuggestedSpeakers error:" + aVar);
            this.f116378b.invoke();
        }

        C46175f(Function1 function1, Function0 function0) {
            this.f116377a = function1;
            this.f116378b = function0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/detail/subtitles/MmMeetingSubtitleControl$searchSpeakers$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/data/MmParticipantsSearchRes;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.d$g */
    public static final class C46176g extends AbstractC47070c<MmParticipantsSearchRes> {

        /* renamed from: a */
        final /* synthetic */ Function1 f116379a;

        /* renamed from: b */
        final /* synthetic */ Function0 f116380b;

        /* renamed from: a */
        public void mo161289a(MmParticipantsSearchRes mmParticipantsSearchRes) {
            List<MmParticipants.MmParticipantInfo> list;
            C45855f.m181664c("MmMeetingSubtitleControl", "searchSpeakers success");
            Function1 function1 = this.f116379a;
            if (mmParticipantsSearchRes != null) {
                list = mmParticipantsSearchRes.getList();
            } else {
                list = null;
            }
            function1.invoke(list);
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            C45855f.m181664c("MmMeetingSubtitleControl", "searchSpeakers error:" + aVar);
            this.f116380b.invoke();
        }

        C46176g(Function1 function1, Function0 function0) {
            this.f116379a = function1;
            this.f116380b = function0;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012 \u0010\u0002\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/SingleEmitter;", "", "", "kotlin.jvm.PlatformType", "subscribe"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.d$c */
    public static final class C46170c<T> implements AbstractC69013u<T> {

        /* renamed from: a */
        final /* synthetic */ MmMeetingSubtitleControl f116369a;

        C46170c(MmMeetingSubtitleControl dVar) {
            this.f116369a = dVar;
        }

        @Override // io.reactivex.AbstractC69013u
        public final void subscribe(final AbstractC69011s<List<String>> sVar) {
            Intrinsics.checkParameterIsNotNull(sVar, "it");
            C47057a.m186239a(this.f116369a.mo162311g(), this.f116369a.mo162312h(), MmTranslateLangType.DEFAULT.getValue(), this.f116369a.mo162314j()).mo165343c(new AbstractC47071d<MmKeywordRes.MmKeywordResp>(this) {
                /* class com.ss.android.lark.mm.module.detail.subtitles.MmMeetingSubtitleControl.C46170c.C461711 */

                /* renamed from: a */
                final /* synthetic */ C46170c f116370a;

                /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: io.reactivex.s */
                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: a */
                public void mo161289a(MmKeywordRes.MmKeywordResp mmKeywordResp) {
                    Intrinsics.checkParameterIsNotNull(mmKeywordResp, "res");
                    MmMeetingSubtitleControl dVar = this.f116370a.f116369a;
                    Object obj = mmKeywordResp.data;
                    Intrinsics.checkExpressionValueIsNotNull(obj, "res.data");
                    dVar.f116359c = ((MmKeywordRes) obj).getKeywords();
                    AbstractC69011s sVar = sVar;
                    Object obj2 = mmKeywordResp.data;
                    Intrinsics.checkExpressionValueIsNotNull(obj2, "res.data");
                    sVar.onSuccess(((MmKeywordRes) obj2).getKeywords());
                }

                /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: io.reactivex.s */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
                /* renamed from: a */
                public void mo161288a(C47068a aVar) {
                    Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
                    C45855f.m181666e("MmMeetingSubtitleControl", "loadKeywordsForStartUp error: " + aVar);
                    sVar.onSuccess(Collections.emptyList());
                }

                {
                    this.f116370a = r1;
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSubtitles;", "it", "apply"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.d$d */
    public static final class C46172d<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ MmMeetingSubtitleControl f116372a;

        /* renamed from: b */
        final /* synthetic */ MmTranslateLangType f116373b;

        C46172d(MmMeetingSubtitleControl dVar, MmTranslateLangType mmTranslateLangType) {
            this.f116372a = dVar;
            this.f116373b = mmTranslateLangType;
        }

        /* renamed from: a */
        public final MmMeetingSubtitles apply(MmMeetingSubtitles mmMeetingSubtitles) {
            Intrinsics.checkParameterIsNotNull(mmMeetingSubtitles, "it");
            MmSubtitleDataAdapter.f116552a.mo162570a(mmMeetingSubtitles);
            this.f116372a.f116361e = mmMeetingSubtitles.getTotalContentSize();
            if (this.f116373b == MmTranslateLangType.DEFAULT) {
                this.f116372a.f116357a = mmMeetingSubtitles;
            } else {
                this.f116372a.f116358b = mmMeetingSubtitles;
            }
            return mmMeetingSubtitles;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/SingleEmitter;", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSubtitles;", "kotlin.jvm.PlatformType", "subscribe"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.d$e */
    public static final class C46173e<T> implements AbstractC69013u<T> {

        /* renamed from: a */
        final /* synthetic */ MmMeetingSubtitleControl f116374a;

        C46173e(MmMeetingSubtitleControl dVar) {
            this.f116374a = dVar;
        }

        @Override // io.reactivex.AbstractC69013u
        public final void subscribe(final AbstractC69011s<MmMeetingSubtitles> sVar) {
            Intrinsics.checkParameterIsNotNull(sVar, "it");
            C47057a.m186240a(this.f116374a.mo162311g(), this.f116374a.mo162312h(), this.f116374a.mo162314j(), MmTranslateLangType.DEFAULT.getValue(), (IHttpLocalErrorHandler) null).mo165343c(new AbstractC47071d<MmMeetingSubtitles.MmMeetingSubtitlesResp>(this) {
                /* class com.ss.android.lark.mm.module.detail.subtitles.MmMeetingSubtitleControl.C46173e.C461741 */

                /* renamed from: a */
                final /* synthetic */ C46173e f116375a;

                @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
                /* renamed from: a */
                public void mo161288a(C47068a aVar) {
                    Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
                    AbstractC69011s sVar = sVar;
                    Intrinsics.checkExpressionValueIsNotNull(sVar, "it");
                    if (!sVar.isDisposed()) {
                        sVar.onError(aVar.mo165309d());
                    }
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: io.reactivex.s */
                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: a */
                public void mo161289a(MmMeetingSubtitles.MmMeetingSubtitlesResp mmMeetingSubtitlesResp) {
                    Intrinsics.checkParameterIsNotNull(mmMeetingSubtitlesResp, "res");
                    MmMeetingSubtitles mmMeetingSubtitles = (MmMeetingSubtitles) mmMeetingSubtitlesResp.data;
                    MmSubtitleDataAdapter aVar = MmSubtitleDataAdapter.f116552a;
                    Intrinsics.checkExpressionValueIsNotNull(mmMeetingSubtitles, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    aVar.mo162570a(mmMeetingSubtitles);
                    this.f116375a.f116374a.f116361e = mmMeetingSubtitles.getTotalContentSize();
                    this.f116375a.f116374a.f116357a = mmMeetingSubtitles;
                    sVar.onSuccess(mmMeetingSubtitles);
                }

                {
                    this.f116375a = r1;
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo162300a(IMmPushChangeSubtitle aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f116362f.add(aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/detail/subtitles/MmMeetingSubtitleControl$updateSpeaker$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/data/MmUpdateSpeakerRes;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.d$h */
    public static final class C46177h extends AbstractC47070c<MmUpdateSpeakerRes> {

        /* renamed from: a */
        final /* synthetic */ MmMeetingSubtitleControl f116381a;

        /* renamed from: b */
        final /* synthetic */ Function1 f116382b;

        /* renamed from: c */
        final /* synthetic */ Function2 f116383c;

        /* renamed from: d */
        final /* synthetic */ MmParticipants.MmParticipantInfo f116384d;

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
            C45855f.m181666e("MmMeetingSubtitleControl", "updateSpeaker failed, :" + aVar);
            this.f116383c.invoke(null, aVar);
            AppreciableKit a = AppreciableKit.f73094h.mo103524a();
            Biz biz = Biz.VideoConference;
            Scene scene = Scene.MinutesDetail;
            Event event = Event.minutes_edit_detail_error;
            ErrorType errorType = ErrorType.Network;
            ErrorLevel errorLevel = ErrorLevel.Exception;
            int a2 = aVar.mo165306a();
            String c = aVar.mo165308c();
            Pair[] pairArr = new Pair[2];
            pairArr[0] = TuplesKt.to("objecttoken", this.f116381a.mo162312h());
            String userId = this.f116384d.getUserId();
            if (userId == null) {
                userId = "";
            }
            pairArr[1] = TuplesKt.to("Userid", userId);
            a.mo103514a(new ErrorParams(biz, scene, event, errorType, errorLevel, a2, "editSpeaker", null, c, false, MapsKt.mapOf(pairArr), null, null, 6144, null));
        }

        /* renamed from: a */
        public void mo161289a(MmUpdateSpeakerRes mmUpdateSpeakerRes) {
            List<String> paragraph_ids;
            List<MmMeetingParagraph> paragraphs;
            T t;
            List<MmMeetingParagraph> paragraphs2;
            T t2;
            if ((mmUpdateSpeakerRes != null ? mmUpdateSpeakerRes.getUser() : null) != null) {
                C45855f.m181664c("MmMeetingSubtitleControl", "updateSpeaker success");
                MmParticipants.MmParticipantInfo user = mmUpdateSpeakerRes.getUser();
                if (!(user == null || (paragraph_ids = user.getParagraph_ids()) == null)) {
                    for (T t3 : paragraph_ids) {
                        MmMeetingSubtitles a = this.f116381a.mo162296a();
                        if (!(a == null || (paragraphs2 = a.getParagraphs()) == null)) {
                            Iterator<T> it = paragraphs2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t2 = null;
                                    break;
                                }
                                t2 = it.next();
                                T t4 = t2;
                                Intrinsics.checkExpressionValueIsNotNull(t4, "it");
                                if (Intrinsics.areEqual(t4.getPid(), t3)) {
                                    break;
                                }
                            }
                            T t5 = t2;
                            if (t5 != null) {
                                t5.setSpeaker(mmUpdateSpeakerRes.getUser());
                            }
                        }
                        MmMeetingSubtitles b = this.f116381a.mo162304b();
                        if (!(b == null || (paragraphs = b.getParagraphs()) == null)) {
                            Iterator<T> it2 = paragraphs.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    t = null;
                                    break;
                                }
                                t = it2.next();
                                T t6 = t;
                                Intrinsics.checkExpressionValueIsNotNull(t6, "it");
                                if (Intrinsics.areEqual(t6.getPid(), t3)) {
                                    break;
                                }
                            }
                            T t7 = t;
                            if (t7 != null) {
                                t7.setSpeaker(mmUpdateSpeakerRes.getUser());
                            }
                        }
                    }
                }
                Function1 function1 = this.f116382b;
                MmParticipants.MmParticipantInfo user2 = mmUpdateSpeakerRes.getUser();
                Intrinsics.checkExpressionValueIsNotNull(user2, "data.user");
                List<String> paragraph_ids2 = user2.getParagraph_ids();
                Intrinsics.checkExpressionValueIsNotNull(paragraph_ids2, "data.user.paragraph_ids");
                function1.invoke(paragraph_ids2);
                return;
            }
            if ((mmUpdateSpeakerRes != null ? mmUpdateSpeakerRes.getError() : null) != null) {
                MmUpdateSpeakerDenyRes error = mmUpdateSpeakerRes.getError();
                Integer valueOf = error != null ? Integer.valueOf(error.getDeny_type()) : null;
                C45855f.m181664c("MmMeetingSubtitleControl", "updateSpeaker failed, denyType: " + valueOf);
                if (Intrinsics.areEqual(valueOf != null ? String.valueOf(valueOf.intValue()) : null, MmEditDenyType.USED_BY_OTHERS.getValue())) {
                    C45858j.m181677a((int) R.string.MMWeb_G_EditOnOtherDeviceQuitEdit_Toast);
                    this.f116383c.invoke(valueOf, null);
                    return;
                }
                if (Intrinsics.areEqual(valueOf != null ? String.valueOf(valueOf.intValue()) : null, MmEditDenyType.OFFLINE.getValue())) {
                    C45858j.m181677a((int) R.string.MMWeb_G_NoActionForLongQuitEdit_Toast);
                    this.f116383c.invoke(valueOf, null);
                }
            }
        }

        C46177h(MmMeetingSubtitleControl dVar, Function1 function1, Function2 kVar, MmParticipants.MmParticipantInfo mmParticipantInfo) {
            this.f116381a = dVar;
            this.f116382b = function1;
            this.f116383c = kVar;
            this.f116384d = mmParticipantInfo;
        }
    }

    /* renamed from: a */
    public final Pair<Integer, String> mo162299a(Map<String, ? extends MmMeetingParagraph> map) {
        List<MmMeetingParagraph> paragraphs;
        T t;
        MmMeetingSubtitles mmMeetingSubtitles;
        List<MmMeetingParagraph> paragraphs2;
        MmMeetingParagraph mmMeetingParagraph;
        List<MmMeetingParagraph> paragraphs3;
        List<MmHighlightInfo> highlight;
        MmMeetingParagraph mmMeetingParagraph2;
        boolean z;
        MmMeetingSubtitles mmMeetingSubtitles2 = this.f116357a;
        if (!(mmMeetingSubtitles2 == null || (paragraphs = mmMeetingSubtitles2.getParagraphs()) == null)) {
            Iterator<T> it = paragraphs.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                T t2 = t;
                if (map != null) {
                    Intrinsics.checkExpressionValueIsNotNull(t2, "it");
                    mmMeetingParagraph2 = (MmMeetingParagraph) map.get(t2.getPid());
                } else {
                    mmMeetingParagraph2 = null;
                }
                if (mmMeetingParagraph2 != null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            T t3 = t;
            if (!(t3 == null || (mmMeetingSubtitles = this.f116357a) == null || (paragraphs2 = mmMeetingSubtitles.getParagraphs()) == null)) {
                int indexOf = paragraphs2.indexOf(t3);
                if (!(map == null || (mmMeetingParagraph = (MmMeetingParagraph) map.get(t3.getPid())) == null)) {
                    MmSubtitleDataAdapter.f116552a.mo162568a(mmMeetingParagraph);
                    ArrayList arrayList = new ArrayList();
                    List<MmMeetingSentence> sentences = mmMeetingParagraph.getSentences();
                    if (sentences != null) {
                        for (T t4 : sentences) {
                            if (!(t4 == null || (highlight = t4.getHighlight()) == null)) {
                                arrayList.addAll(highlight);
                            }
                        }
                    }
                    MmSubtitleDataAdapter.f116552a.mo162569a(mmMeetingParagraph, arrayList);
                    MmMeetingSubtitles mmMeetingSubtitles3 = this.f116357a;
                    if (!(mmMeetingSubtitles3 == null || (paragraphs3 = mmMeetingSubtitles3.getParagraphs()) == null)) {
                        paragraphs3.set(indexOf, mmMeetingParagraph);
                    }
                    return TuplesKt.to(Integer.valueOf(indexOf), t3.getPid());
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final Single<List<String>> mo162297a(MmTranslateLangType mmTranslateLangType, boolean z) {
        boolean z2;
        Intrinsics.checkParameterIsNotNull(mmTranslateLangType, "translateLang");
        if (!z) {
            List<String> list = this.f116359c;
            if (list == null || list.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && mmTranslateLangType == MmTranslateLangType.DEFAULT) {
                Single<List<String>> just = Single.just(this.f116359c);
                Intrinsics.checkExpressionValueIsNotNull(just, "Single.just(keyword)");
                return just;
            }
        }
        Single<R> map = MmApiService2.f118430a.mo165286a(this.f116363g, this.f116364h, mmTranslateLangType.getValue(), this.f116366j).map(new C46169b(this, mmTranslateLangType));
        Intrinsics.checkExpressionValueIsNotNull(map, "MmApiService2.loadKeywor…         it\n            }");
        return map;
    }

    /* renamed from: b */
    public final void mo162306b(String str, Function1<? super List<? extends MmParticipants.MmParticipantInfo>, Unit> function1, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(str, "keywords");
        Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
        Intrinsics.checkParameterIsNotNull(function0, "onError");
        C45855f.m181664c("MmMeetingSubtitleControl", "searchSpeakers");
        C47057a.m186275b(this.f116363g, this.f116364h, str, (String) null, new C46176g(function1, function0));
    }

    /* renamed from: a */
    public final Single<MmMeetingSubtitles> mo162298a(MmTranslateLangType mmTranslateLangType, boolean z, IHttpLocalErrorHandler aVar) {
        Intrinsics.checkParameterIsNotNull(mmTranslateLangType, "translateLang");
        if (z || this.f116357a == null || mmTranslateLangType != MmTranslateLangType.DEFAULT) {
            Single<MmMeetingSubtitles> map = MmApiService2.m186296a(MmApiService2.f118430a, this.f116363g, this.f116364h, mmTranslateLangType, null, aVar, 8, null).observeOn(LarkRxSchedulers.computation()).map(new C46172d(this, mmTranslateLangType));
            Intrinsics.checkExpressionValueIsNotNull(map, "MmApiService2.loadSubtit…     it\n                }");
            return map;
        }
        Single<MmMeetingSubtitles> just = Single.just(this.f116357a);
        Intrinsics.checkExpressionValueIsNotNull(just, "Single.just(subtitles)");
        return just;
    }

    /* renamed from: a */
    public final void mo162302a(String str, Function1<? super List<? extends MmParticipants.MmParticipantInfo>, Unit> function1, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(str, "paraId");
        Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
        Intrinsics.checkParameterIsNotNull(function0, "onError");
        C45855f.m181664c("MmMeetingSubtitleControl", "loadSuggestedSpeakers");
        C47057a.m186292h(this.f116363g, this.f116364h, str, new C46175f(function1, function0));
    }

    public MmMeetingSubtitleControl(String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "host");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        Intrinsics.checkParameterIsNotNull(str3, "url");
        Intrinsics.checkParameterIsNotNull(str4, "requestId");
        this.f116363g = str;
        this.f116364h = str2;
        this.f116365i = str3;
        this.f116366j = str4;
    }

    /* renamed from: a */
    public static /* synthetic */ Single m182874a(MmMeetingSubtitleControl dVar, MmTranslateLangType mmTranslateLangType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return dVar.mo162297a(mmTranslateLangType, z);
    }

    /* renamed from: a */
    public final void mo162301a(String str, String str2, MmParticipants.MmParticipantInfo mmParticipantInfo, Function1<? super List<String>, Unit> function1, Function2<? super Integer, ? super C47068a, Unit> kVar) {
        Intrinsics.checkParameterIsNotNull(str, "paraId");
        Intrinsics.checkParameterIsNotNull(str2, "editSession");
        Intrinsics.checkParameterIsNotNull(mmParticipantInfo, "speaker");
        Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
        Intrinsics.checkParameterIsNotNull(kVar, "onError");
        C45855f.m181664c("MmMeetingSubtitleControl", "updateSpeaker");
        C47057a.m186256a(this.f116363g, this.f116364h, str, str2, mmParticipantInfo, new C46177h(this, function1, kVar, mmParticipantInfo));
    }

    /* renamed from: a */
    public static /* synthetic */ Single m182875a(MmMeetingSubtitleControl dVar, MmTranslateLangType mmTranslateLangType, boolean z, IHttpLocalErrorHandler aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            aVar = null;
        }
        return dVar.mo162298a(mmTranslateLangType, z, aVar);
    }
}
