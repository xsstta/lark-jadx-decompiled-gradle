package com.ss.android.lark.mm.module.detail.subtitles;

import android.content.Context;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.comment.model.MmComment;
import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.MmEditStateManager;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingParagraph;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSubtitles;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.IMmDependency;
import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import io.reactivex.Single;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0007H&J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\u0010\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H&J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0015H&J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H&J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0019H&J\b\u0010\u001b\u001a\u00020\u0007H&J\b\u0010\u001c\u001a\u00020\u0010H&J\b\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\u001f\u001a\u00020\u001eH&J\b\u0010 \u001a\u00020\u001eH&J\b\u0010!\u001a\u00020\u001eH&J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH&J\u001c\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u001eH&J:\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00152\u001a\u0010(\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020*\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00030)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030,H&J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0015H&J\b\u0010/\u001a\u00020\u0003H&J\b\u00100\u001a\u00020\u0003H&J\b\u00101\u001a\u00020\u0003H&J\b\u00102\u001a\u00020\u0003H&J\b\u00103\u001a\u00020\u0003H&J\b\u00104\u001a\u00020\u0003H&J\b\u00105\u001a\u00020\u0003H&J0\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u00152\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0007H&J\u0012\u0010=\u001a\u00020\u00032\b\u0010>\u001a\u0004\u0018\u00010\u0015H&J\u0010\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020AH&J\u0010\u0010B\u001a\u00020\u00032\u0006\u0010:\u001a\u00020;H&J\b\u0010C\u001a\u00020\u0003H&J\b\u0010D\u001a\u00020\u0003H&Jx\u0010E\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00152\b\u0010F\u001a\u0004\u0018\u00010\u00152\u0006\u0010G\u001a\u00020*2\u0018\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00030)2:\u0010+\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\bI\u0012\b\bJ\u0012\u0004\b\b(K\u0012\u0015\u0012\u0013\u0018\u00010L¢\u0006\f\bI\u0012\b\bJ\u0012\u0004\b\b(M\u0012\u0004\u0012\u00020\u00030HH&J\b\u0010N\u001a\u00020\u0003H&J8\u0010O\u001a\u00020\u00032\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00072\u0006\u0010P\u001a\u00020\u00072\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0015H&J0\u0010S\u001a\u00020\u00072\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020;0U2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020W0UH&J:\u0010X\u001a\u00020\u00032\u0006\u0010Y\u001a\u00020\u00152\u001a\u0010(\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020*\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00030)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030,H&¨\u0006Z"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/IMmMeetingSubtitleDependency;", "Lcom/ss/android/lark/mm/module/framework/IMmDependency;", "checkIsNeedAutoPlay", "", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getBottomPanelHeight", "", "context", "Landroid/content/Context;", "getBottomPanelY", "getComments", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment;", "getCommentsSingle", "Lio/reactivex/Single;", "translateLangType", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "getEditStateManager", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditStateManager;", "getKeywords", "", "", "getMentionCommentId", "getMentionContentId", "getOriginSubtitles", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSubtitles;", "getSubtitles", "getTopTabLayoutPositionY", "getTranslateType", "isInitialDisplaySubtitle", "", "isMentionFromComments", "isOriginalTextDialogShowing", "isPlaying", "loadBaseInfoSingle", "loadKeywordsSingle", "loadSubtitlesSingle", "isFromNetwork", "loadSuggestedSpeakers", "paraId", "onSuccess", "Lkotlin/Function1;", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "onError", "Lkotlin/Function0;", "notifyChangeEditStatusContent", "content", "notifyDismissCommentsDialog", "notifyEnterEditMode", "notifyExitEditMode", "notifyFinishLoading", "notifyHideVideoView", "notifyOnHideTranslateBar", "notifyOnShowTranslateBar", "notifyPostComment", "start", "end", "quote", "paragraph", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingParagraph;", "adapterPosition", "notifySearchKeyword", "keyword", "notifySeekTo", "ts", "", "notifyShowOriginTextDialog", "notifyShowVideoView", "notifyTopicUpdate", "notifyUpdateSpeaker", "editSession", "speaker", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "denyType", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "error", "notifyUpdateViewDismiss", "notifyViewComment", "locationPosition", "mentionCommentId", "mentionContentId", "replaceOldPara", "subtitles", "", "comments", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo;", "searchSpeakers", "keywords", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.subtitles.a */
public interface IMmMeetingSubtitleDependency extends IMmDependency {
    /* renamed from: a */
    int mo162235a(Context context);

    /* renamed from: a */
    int mo162236a(Map<String, ? extends MmMeetingParagraph> map, Map<String, ? extends MmComment.MmCommentInfo> map2);

    /* renamed from: a */
    MmBaseInfo mo162237a();

    /* renamed from: a */
    Single<List<String>> mo162238a(MmTranslateLangType mmTranslateLangType);

    /* renamed from: a */
    Single<MmMeetingSubtitles> mo162239a(MmTranslateLangType mmTranslateLangType, boolean z);

    /* renamed from: a */
    void mo162240a(int i, int i2, String str, MmMeetingParagraph mmMeetingParagraph, int i3);

    /* renamed from: a */
    void mo162241a(long j);

    /* renamed from: a */
    void mo162242a(MmMeetingParagraph mmMeetingParagraph);

    /* renamed from: a */
    void mo162243a(MmMeetingParagraph mmMeetingParagraph, int i, int i2, String str, String str2);

    /* renamed from: a */
    void mo162244a(String str);

    /* renamed from: a */
    void mo162245a(String str, String str2, MmParticipants.MmParticipantInfo mmParticipantInfo, Function1<? super List<String>, Unit> function1, Function2<? super Integer, ? super C47068a, Unit> kVar);

    /* renamed from: a */
    void mo162246a(String str, Function1<? super List<? extends MmParticipants.MmParticipantInfo>, Unit> function1, Function0<Unit> function0);

    /* renamed from: b */
    Single<MmBaseInfo> mo162247b();

    /* renamed from: b */
    Single<MmComment> mo162248b(MmTranslateLangType mmTranslateLangType);

    /* renamed from: b */
    void mo162249b(String str);

    /* renamed from: b */
    void mo162250b(String str, Function1<? super List<? extends MmParticipants.MmParticipantInfo>, Unit> function1, Function0<Unit> function0);

    /* renamed from: c */
    MmMeetingSubtitles mo162251c();

    /* renamed from: d */
    MmMeetingSubtitles mo162252d();

    /* renamed from: e */
    MmComment mo162253e();

    /* renamed from: f */
    MmEditStateManager mo162254f();

    /* renamed from: g */
    List<String> mo162255g();

    /* renamed from: h */
    int mo162256h();

    /* renamed from: i */
    int mo162257i();

    /* renamed from: j */
    boolean mo162258j();

    /* renamed from: k */
    boolean mo162259k();

    /* renamed from: l */
    String mo162260l();

    /* renamed from: m */
    String mo162261m();

    /* renamed from: n */
    boolean mo162262n();

    /* renamed from: o */
    boolean mo162263o();

    /* renamed from: p */
    MmTranslateLangType mo162264p();

    /* renamed from: q */
    void mo162265q();

    /* renamed from: r */
    void mo162266r();

    /* renamed from: s */
    void mo162267s();

    /* renamed from: t */
    void mo162268t();

    /* renamed from: u */
    void mo162269u();

    /* renamed from: v */
    void mo162270v();

    /* renamed from: w */
    void mo162271w();

    /* renamed from: x */
    void mo162272x();

    /* renamed from: y */
    void mo162273y();

    /* renamed from: z */
    void mo162274z();

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.a$a */
    public static final class C46168a {
        /* renamed from: a */
        public static /* synthetic */ void m182852a(IMmMeetingSubtitleDependency aVar, MmMeetingParagraph mmMeetingParagraph, int i, int i2, String str, String str2, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 8) != 0) {
                    str = null;
                }
                if ((i3 & 16) != 0) {
                    str2 = null;
                }
                aVar.mo162243a(mmMeetingParagraph, i, i2, str, str2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyViewComment");
        }
    }
}
