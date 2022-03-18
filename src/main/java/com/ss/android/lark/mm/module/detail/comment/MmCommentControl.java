package com.ss.android.lark.mm.module.detail.comment;

import com.bytedance.ee.bear.middleground.comment.Comment;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mm.module.detail.comment.model.MmComment;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingContent;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingParagraph;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSentence;
import com.ss.android.lark.mm.module.detail.subtitles.model.request.AddCommentReq;
import com.ss.android.lark.mm.module.detail.subtitles.model.response.ReplyCommentRes;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.MmBaseControl;
import com.ss.android.lark.mm.module.highlight.model.MmHighlightType;
import com.ss.android.lark.mm.net.api.MmApiService2;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45857i;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.utils.MmRxThrowable;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001BB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u001c\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018JT\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00140\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140$J\u000e\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\nJ,\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018J*\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010)\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00032\u000e\u0010.\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/H\u0002J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\f022\b\b\u0002\u00103\u001a\u000204J\b\u00105\u001a\u00020\u0014H\u0016J*\u00106\u001a\u00020\u00142\"\u00107\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020908j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u000209`:J\u000e\u0010;\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\nJ$\u0010<\u001a\u00020\u00142\u0014\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u000209\u0018\u00010>2\u0006\u0010?\u001a\u00020\u0003J\u001c\u0010@\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\u0010A\u001a\u0004\u0018\u00010\fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\"\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006C"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/comment/MmCommentControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseControl;", "host", "", "token", "(Ljava/lang/String;Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/lark/mm/module/detail/comment/MmCommentControl$IMmCommentChangeListener;", "<set-?>", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment;", "originComment", "getOriginComment", "()Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment;", "getToken", "translateComment", "getTranslateComment", "addComment", "", "addCommentReq", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/request/AddCommentReq;", "callback", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/response/ReplyCommentRes;", "startSelection", "", "endSelection", "quote", "commentContent", "paragraph", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingParagraph;", "onSuccessCallback", "Lkotlin/Function1;", "onFailed", "Lkotlin/Function0;", "addListener", "listener", "deleteComment", "pid", "commentId", "contentId", "findCommentDetailContent", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo$CommentDetail$CommentDetailContent;", "commentContentId", "commentList", "", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo$CommentDetail;", "getComment", "Lio/reactivex/Single;", "translateLang", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "onDestroy", "onPushChangeComment", "commentMap", "Ljava/util/HashMap;", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo;", "Lkotlin/collections/HashMap;", "removeListener", "replaceOldComment", "commentsMap", "", "paraId", "setCommentOriginContent", "originalComment", "IMmCommentChangeListener", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.comment.d */
public final class MmCommentControl extends MmBaseControl {

    /* renamed from: a */
    public final CopyOnWriteArrayList<IMmCommentChangeListener> f115950a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public MmComment f115951b;

    /* renamed from: c */
    public MmComment f115952c;

    /* renamed from: d */
    private final String f115953d;

    /* renamed from: e */
    private final String f115954e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JH\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072&\u0010\t\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/comment/MmCommentControl$IMmCommentChangeListener;", "", "onCommentChange", "", Comment.f24093e, "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment;", "needUpdateParaIds", "", "", "commentMap", "Ljava/util/HashMap;", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo;", "Lkotlin/collections/HashMap;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.d$a */
    public interface IMmCommentChangeListener {
        /* renamed from: a */
        void mo161699a(MmComment mmComment, List<String> list, HashMap<String, MmComment.MmCommentInfo> hashMap);
    }

    /* renamed from: a */
    public final MmComment mo161688a() {
        return this.f115951b;
    }

    /* renamed from: b */
    public final MmComment mo161697b() {
        return this.f115952c;
    }

    /* renamed from: a */
    public final void mo161696a(Map<String, ? extends MmComment.MmCommentInfo> map, String str) {
        Map<String, MmComment.MmCommentInfo> comments;
        MmComment.MmCommentInfo mmCommentInfo;
        Intrinsics.checkParameterIsNotNull(str, "paraId");
        MmComment mmComment = this.f115951b;
        if (mmComment != null && (comments = mmComment.getComments()) != null && map != null && (mmCommentInfo = (MmComment.MmCommentInfo) map.get(str)) != null) {
            comments.put(str, mmCommentInfo);
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseControl
    /* renamed from: k */
    public void mo161235k() {
        this.f115950a.clear();
        super.mo161235k();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.d$g */
    public static final class RunnableC46021g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmCommentControl f115973a;

        /* renamed from: b */
        final /* synthetic */ HashMap f115974b;

        RunnableC46021g(MmCommentControl dVar, HashMap hashMap) {
            this.f115973a = dVar;
            this.f115974b = hashMap;
        }

        /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 106
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.detail.comment.MmCommentControl.RunnableC46021g.run():void");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.d$b */
    public static final class RunnableC46015b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmCommentControl f115955a;

        /* renamed from: b */
        final /* synthetic */ MmMeetingParagraph f115956b;

        /* renamed from: c */
        final /* synthetic */ int f115957c;

        /* renamed from: d */
        final /* synthetic */ int f115958d;

        /* renamed from: e */
        final /* synthetic */ String f115959e;

        /* renamed from: f */
        final /* synthetic */ String f115960f;

        /* renamed from: g */
        final /* synthetic */ Function1 f115961g;

        /* renamed from: h */
        final /* synthetic */ Function0 f115962h;

        RunnableC46015b(MmCommentControl dVar, MmMeetingParagraph mmMeetingParagraph, int i, int i2, String str, String str2, Function1 function1, Function0 function0) {
            this.f115955a = dVar;
            this.f115956b = mmMeetingParagraph;
            this.f115957c = i;
            this.f115958d = i2;
            this.f115959e = str;
            this.f115960f = str2;
            this.f115961g = function1;
            this.f115962h = function0;
        }

        public final void run() {
            int i;
            int i2;
            T t;
            String startTime;
            List<MmMeetingSentence> sentences = this.f115956b.getSentences();
            Intrinsics.checkExpressionValueIsNotNull(sentences, "paragraph.sentences");
            ArrayList<MmMeetingSentence> arrayList = new ArrayList();
            Iterator<T> it = sentences.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                T t2 = next;
                Intrinsics.checkExpressionValueIsNotNull(t2, "it");
                if (t2.getOffsetRangeInPara().mo239400b() >= this.f115957c && t2.getOffsetRangeInPara().mo239399a() <= this.f115958d) {
                    z = true;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            AddCommentReq addCommentReq = new AddCommentReq();
            addCommentReq.setQuote(this.f115959e);
            addCommentReq.setContent(this.f115960f);
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkExpressionValueIsNotNull(uuid, "UUID.randomUUID().toString()");
            for (MmMeetingSentence mmMeetingSentence : arrayList) {
                int i3 = this.f115957c;
                Intrinsics.checkExpressionValueIsNotNull(mmMeetingSentence, "sentence");
                Long l = null;
                if (i3 > mmMeetingSentence.getOffsetRangeInPara().mo239399a()) {
                    List<MmMeetingContent> list = mmMeetingSentence.contents;
                    Intrinsics.checkExpressionValueIsNotNull(list, "sentence.contents");
                    Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it2.next();
                        T t3 = t;
                        Intrinsics.checkExpressionValueIsNotNull(t3, "content");
                        if (t3.getOffsetInParaRange().mo239410a(this.f115957c)) {
                            break;
                        }
                    }
                    T t4 = t;
                    if (!(t4 == null || (startTime = t4.getStartTime()) == null)) {
                        l = Long.valueOf(Long.parseLong(startTime));
                    }
                } else {
                    MmMeetingContent mmMeetingContent = mmMeetingSentence.contents.get(0);
                    Intrinsics.checkExpressionValueIsNotNull(mmMeetingContent, "sentence.contents[0]");
                    String startTime2 = mmMeetingContent.getStartTime();
                    Intrinsics.checkExpressionValueIsNotNull(startTime2, "sentence.contents[0].startTime");
                    l = Long.valueOf(Long.parseLong(startTime2));
                }
                if (l == null) {
                    C45855f.m181666e("MmCommentControl2", "can't find startTime");
                } else {
                    if (this.f115957c > mmMeetingSentence.getOffsetRangeInPara().mo239399a()) {
                        i = this.f115957c - mmMeetingSentence.getOffsetRangeInPara().mo239399a();
                    } else {
                        i = 0;
                    }
                    if (this.f115958d > mmMeetingSentence.getOffsetRangeInPara().mo239400b()) {
                        i2 = mmMeetingSentence.getContentLength() - i;
                    } else {
                        i2 = this.f115958d - Math.max(mmMeetingSentence.getOffsetRangeInPara().mo239399a(), this.f115957c);
                    }
                    AddCommentReq.AddCommentHighlight addCommentHighlight = new AddCommentReq.AddCommentHighlight();
                    addCommentHighlight.setSid(mmMeetingSentence.getSid());
                    AddCommentReq.AddCommentHighlightDetail addCommentHighlightDetail = new AddCommentReq.AddCommentHighlightDetail();
                    addCommentHighlightDetail.setType(MmHighlightType.COMMENT.getType());
                    addCommentHighlightDetail.setOffset(i);
                    addCommentHighlightDetail.setSize(i2);
                    addCommentHighlightDetail.setStartTime(l.longValue());
                    addCommentHighlightDetail.setUuid(uuid);
                    addCommentHighlight.setHighlights(Collections.singletonList(addCommentHighlightDetail));
                    arrayList2.add(addCommentHighlight);
                }
            }
            HashMap hashMap2 = hashMap;
            String pid = this.f115956b.getPid();
            Intrinsics.checkExpressionValueIsNotNull(pid, "paragraph.pid");
            hashMap2.put(pid, arrayList2);
            addCommentReq.setHighlights(hashMap2);
            this.f115955a.mo161693a(addCommentReq, new AbstractC47070c<ReplyCommentRes>(this) {
                /* class com.ss.android.lark.mm.module.detail.comment.MmCommentControl.RunnableC46015b.C460161 */

                /* renamed from: a */
                final /* synthetic */ RunnableC46015b f115963a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f115963a = r1;
                }

                /* renamed from: a */
                public void mo161289a(ReplyCommentRes replyCommentRes) {
                    Intrinsics.checkParameterIsNotNull(replyCommentRes, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    this.f115963a.f115961g.invoke(replyCommentRes);
                }

                @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
                /* renamed from: a */
                public void mo161288a(C47068a aVar) {
                    C45855f.m181666e("MmCommentControl2", "error: " + aVar);
                    this.f115963a.f115962h.invoke();
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.d$d */
    static final class C46018d<T> implements Consumer<MmComment> {

        /* renamed from: a */
        final /* synthetic */ MmCommentControl f115969a;

        /* renamed from: b */
        final /* synthetic */ MmTranslateLangType f115970b;

        C46018d(MmCommentControl dVar, MmTranslateLangType mmTranslateLangType) {
            this.f115969a = dVar;
            this.f115970b = mmTranslateLangType;
        }

        /* renamed from: a */
        public final void accept(MmComment mmComment) {
            if (this.f115970b == MmTranslateLangType.DEFAULT) {
                this.f115969a.f115951b = mmComment;
            } else {
                this.f115969a.f115952c = mmComment;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.d$e */
    static final class C46019e<T> implements Consumer<MmComment> {

        /* renamed from: a */
        final /* synthetic */ MmCommentControl f115971a;

        C46019e(MmCommentControl dVar) {
            this.f115971a = dVar;
        }

        /* renamed from: a */
        public final void accept(MmComment mmComment) {
            MmCommentControl dVar = this.f115971a;
            dVar.mo161692a(dVar.mo161697b(), this.f115971a.mo161688a());
        }
    }

    /* renamed from: a */
    public final void mo161691a(IMmCommentChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f115950a.add(aVar);
    }

    /* renamed from: b */
    public final void mo161698b(IMmCommentChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f115950a.remove(aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/detail/comment/MmCommentControl$deleteComment$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.d$c */
    public static final class C46017c extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ MmCommentControl f115964a;

        /* renamed from: b */
        final /* synthetic */ String f115965b;

        /* renamed from: c */
        final /* synthetic */ String f115966c;

        /* renamed from: d */
        final /* synthetic */ String f115967d;

        /* renamed from: e */
        final /* synthetic */ AbstractC47070c f115968e;

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            C45855f.m181666e("MmCommentControl2", "[deleteComment] error: " + aVar);
        }

        /* renamed from: a */
        public void mo161289a(String str) {
            Map<String, MmComment.MmCommentInfo> comments;
            MmComment.MmCommentInfo mmCommentInfo;
            List<MmComment.MmCommentInfo.CommentDetail> comment_list;
            T t;
            List<MmComment.MmCommentInfo.CommentDetail.CommentDetailContent> comment_content_list;
            MmComment.MmCommentInfo.CommentDetail.CommentDetailContent commentDetailContent;
            Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            MmComment a = this.f115964a.mo161688a();
            if (a != null && (comments = a.getComments()) != null && (mmCommentInfo = comments.get(this.f115965b)) != null && (comment_list = mmCommentInfo.getComment_list()) != null) {
                Iterator<T> it = comment_list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    T t2 = t;
                    Intrinsics.checkExpressionValueIsNotNull(t2, "it");
                    if (Intrinsics.areEqual(t2.getComment_id(), this.f115966c)) {
                        break;
                    }
                }
                T t3 = t;
                if (t3 != null && (comment_content_list = t3.getComment_content_list()) != null) {
                    ListIterator<MmComment.MmCommentInfo.CommentDetail.CommentDetailContent> listIterator = comment_content_list.listIterator(comment_content_list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            commentDetailContent = null;
                            break;
                        }
                        commentDetailContent = listIterator.previous();
                        MmComment.MmCommentInfo.CommentDetail.CommentDetailContent commentDetailContent2 = commentDetailContent;
                        Intrinsics.checkExpressionValueIsNotNull(commentDetailContent2, "it");
                        if (Intrinsics.areEqual(commentDetailContent2.getContent_id(), this.f115967d)) {
                            break;
                        }
                    }
                    MmComment.MmCommentInfo.CommentDetail.CommentDetailContent commentDetailContent3 = commentDetailContent;
                    if (commentDetailContent3 != null) {
                        comment_content_list.remove(commentDetailContent3);
                        mmCommentInfo.setComment_num(mmCommentInfo.getComment_num() - 1);
                    }
                    Iterator<T> it2 = this.f115964a.f115950a.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo161699a(this.f115964a.mo161688a(), CollectionsKt.listOf(this.f115965b), null);
                    }
                    this.f115968e.mo161289a(str);
                }
            }
        }

        C46017c(MmCommentControl dVar, String str, String str2, String str3, AbstractC47070c cVar) {
            this.f115964a = dVar;
            this.f115965b = str;
            this.f115966c = str2;
            this.f115967d = str3;
            this.f115968e = cVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.d$f */
    static final class C46020f<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C46020f f115972a = new C46020f();

        C46020f() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            if (th instanceof MmRxThrowable) {
                MmRxThrowable mmRxThrowable = (MmRxThrowable) th;
                AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.VideoConference, Scene.MinutesDetail, Event.minutes_load_detail_error, ErrorType.Network, ErrorLevel.Exception, mmRxThrowable.getErrorCode(), "comments", null, mmRxThrowable.getErrorMessage(), false, null, null, null, 6144, null));
            }
        }
    }

    /* renamed from: a */
    public final Single<MmComment> mo161689a(MmTranslateLangType mmTranslateLangType) {
        Intrinsics.checkParameterIsNotNull(mmTranslateLangType, "translateLang");
        Single<MmComment> doOnError = MmApiService2.f118430a.mo165284a(this.f115953d, this.f115954e, mmTranslateLangType).onErrorReturnItem(new MmComment()).observeOn(AndroidSchedulers.mainThread()).doOnSuccess(new C46018d(this, mmTranslateLangType)).observeOn(LarkRxSchedulers.computation()).doOnSuccess(new C46019e(this)).doOnError(C46020f.f115972a);
        Intrinsics.checkExpressionValueIsNotNull(doOnError, "MmApiService2.loadCommen…          }\n            }");
        return doOnError;
    }

    /* renamed from: a */
    public final void mo161695a(HashMap<String, MmComment.MmCommentInfo> hashMap) {
        Intrinsics.checkParameterIsNotNull(hashMap, "commentMap");
        C45859k.m181685a(new RunnableC46021g(this, hashMap));
    }

    public MmCommentControl(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "host");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        this.f115953d = str;
        this.f115954e = str2;
    }

    /* renamed from: a */
    public final void mo161693a(AddCommentReq addCommentReq, AbstractC47070c<ReplyCommentRes> cVar) {
        Intrinsics.checkParameterIsNotNull(addCommentReq, "addCommentReq");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        C47057a.m186250a(this.f115953d, this.f115954e, addCommentReq, cVar);
    }

    /* renamed from: a */
    public final void mo161692a(MmComment mmComment, MmComment mmComment2) {
        List<MmComment.MmCommentInfo.CommentDetail> comment_list;
        Map<String, MmComment.MmCommentInfo> comments;
        if (mmComment != null) {
            for (String str : mmComment.getComments().keySet()) {
                MmComment.MmCommentInfo mmCommentInfo = mmComment.getComments().get(str);
                MmComment.MmCommentInfo mmCommentInfo2 = (mmComment2 == null || (comments = mmComment2.getComments()) == null) ? null : comments.get(str);
                if (!(mmCommentInfo == null || (comment_list = mmCommentInfo.getComment_list()) == null)) {
                    for (T t : comment_list) {
                        Intrinsics.checkExpressionValueIsNotNull(t, "item");
                        List<MmComment.MmCommentInfo.CommentDetail.CommentDetailContent> comment_content_list = t.getComment_content_list();
                        if (comment_content_list != null) {
                            for (T t2 : comment_content_list) {
                                String comment_id = t.getComment_id();
                                Intrinsics.checkExpressionValueIsNotNull(comment_id, "item.comment_id");
                                Intrinsics.checkExpressionValueIsNotNull(t2, "item2");
                                String content_id = t2.getContent_id();
                                Intrinsics.checkExpressionValueIsNotNull(content_id, "item2.content_id");
                                MmComment.MmCommentInfo.CommentDetail.CommentDetailContent a = m182320a(comment_id, content_id, mmCommentInfo2 != null ? mmCommentInfo2.getComment_list() : null);
                                t2.setOriginContent(a != null ? a.getContent() : null);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final MmComment.MmCommentInfo.CommentDetail.CommentDetailContent m182320a(String str, String str2, List<? extends MmComment.MmCommentInfo.CommentDetail> list) {
        T t;
        List<MmComment.MmCommentInfo.CommentDetail.CommentDetailContent> comment_content_list;
        T t2 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Intrinsics.areEqual(t.getComment_id(), str)) {
                break;
            }
        }
        T t3 = t;
        if (t3 == null || (comment_content_list = t3.getComment_content_list()) == null) {
            return null;
        }
        Iterator<T> it2 = comment_content_list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            T next = it2.next();
            T t4 = next;
            Intrinsics.checkExpressionValueIsNotNull(t4, "it");
            if (Intrinsics.areEqual(t4.getContent_id(), str2)) {
                t2 = next;
                break;
            }
        }
        return t2;
    }

    /* renamed from: a */
    public final void mo161694a(String str, String str2, String str3, AbstractC47070c<String> cVar) {
        Intrinsics.checkParameterIsNotNull(str, "pid");
        Intrinsics.checkParameterIsNotNull(str2, "commentId");
        Intrinsics.checkParameterIsNotNull(str3, "contentId");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        C47057a.m186274b(this.f115953d, this.f115954e, str3, new C46017c(this, str, str2, str3, cVar));
    }

    /* renamed from: a */
    public final void mo161690a(int i, int i2, String str, String str2, MmMeetingParagraph mmMeetingParagraph, Function1<? super ReplyCommentRes, Unit> function1, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(str2, "commentContent");
        Intrinsics.checkParameterIsNotNull(mmMeetingParagraph, "paragraph");
        Intrinsics.checkParameterIsNotNull(function1, "onSuccessCallback");
        Intrinsics.checkParameterIsNotNull(function0, "onFailed");
        C45857i.m181676a(new RunnableC46015b(this, mmMeetingParagraph, i, i2, str, str2, function1, function0));
    }
}
