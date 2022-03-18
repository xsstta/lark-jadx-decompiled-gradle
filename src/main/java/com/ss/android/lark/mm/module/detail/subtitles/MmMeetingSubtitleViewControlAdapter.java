package com.ss.android.lark.mm.module.detail.subtitles;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl;
import com.ss.android.lark.mm.module.detail.comment.IMmCommentListener;
import com.ss.android.lark.mm.module.detail.comment.MmCommentControl;
import com.ss.android.lark.mm.module.detail.comment.model.MmComment;
import com.ss.android.lark.mm.module.detail.main.IMmDetailInquirer;
import com.ss.android.lark.mm.module.detail.main.IMmDetailListener;
import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.detail.search.IMmDetailSearchInquirer;
import com.ss.android.lark.mm.module.detail.search.IMmDetailSearchListener;
import com.ss.android.lark.mm.module.detail.startup.IMmDetailStartUpListener;
import com.ss.android.lark.mm.module.detail.subtitles.MmMeetingSubtitleControl;
import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.MmEditStateManager;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingContent;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingParagraph;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSentence;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSubtitles;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmPlaySettingInfo;
import com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarInquirer;
import com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarListener;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.module.mention.MmMentionUrlUtils;
import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import com.ss.android.lark.mm.module.player.MmVideoControl;
import com.ss.android.lark.mm.module.player.core.AbstractC46597d;
import com.ss.android.lark.mm.module.player.core.C46602i;
import com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarInquirer;
import com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarListener;
import com.ss.android.lark.mm.module.share.model.PermissionStatus;
import com.ss.android.lark.mm.module.translate.IMmTranslateInquirer;
import com.ss.android.lark.mm.module.translate.IMmTranslateListener;
import com.ss.android.lark.mm.module.translate.MmTranslateControl;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45859k;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p3457e.C68294a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0017\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/MmMeetingSubtitleViewControlAdapter;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "Lcom/ss/android/lark/mm/module/detail/subtitles/IMmMeetingSubtitleListener;", "Lcom/ss/android/lark/mm/module/detail/subtitles/IMmMeetingSubtitleDependency;", "Lcom/ss/android/lark/mm/module/detail/subtitles/MmMeetingSubtitleControl$IMmPushChangeSubtitle;", "viewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "controlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "control", "Lcom/ss/android/lark/mm/module/detail/subtitles/MmMeetingSubtitleControl;", "(Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;Lcom/ss/android/lark/mm/module/detail/subtitles/MmMeetingSubtitleControl;)V", "getControl", "()Lcom/ss/android/lark/mm/module/detail/subtitles/MmMeetingSubtitleControl;", "getControlRegister", "()Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "mentionCommentId", "", "mentionContentId", "mmBaseControl", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmMeetingBaseInfoControl;", "getViewControlRegister", "()Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "getDependency", "onCreate", "", "onDestroy", "onPushChangeSubtitlePara", "para", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingParagraph;", "position", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.subtitles.f */
public final class MmMeetingSubtitleViewControlAdapter extends MmBaseViewControlAdapter<IMmMeetingSubtitleListener, IMmMeetingSubtitleDependency> implements MmMeetingSubtitleControl.IMmPushChangeSubtitle {

    /* renamed from: a */
    public final MmMeetingBaseInfoControl f116536a;

    /* renamed from: b */
    public String f116537b = "";

    /* renamed from: c */
    public String f116538c = "";

    /* renamed from: d */
    private final MmViewControlRegister f116539d;

    /* renamed from: e */
    private final MmControlRegister f116540e;

    /* renamed from: f */
    private final MmMeetingSubtitleControl f116541f;

    /* renamed from: e */
    public final MmViewControlRegister mo162487e() {
        return this.f116539d;
    }

    /* renamed from: f */
    public final MmControlRegister mo162488f() {
        return this.f116540e;
    }

    /* renamed from: g */
    public final MmMeetingSubtitleControl mo162489g() {
        return this.f116541f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\b\u0010\u001c\u001a\u00020\u0010H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020\u001eH\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0016J\u001c\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u001eH\u0016J:\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00152\u001a\u0010(\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020*\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00030)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030,H\u0016J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0015H\u0016J\b\u0010/\u001a\u00020\u0003H\u0016J\b\u00100\u001a\u00020\u0003H\u0016J\b\u00101\u001a\u00020\u0003H\u0016J\b\u00102\u001a\u00020\u0003H\u0016J\b\u00103\u001a\u00020\u0003H\u0016J\b\u00104\u001a\u00020\u0003H\u0016J\b\u00105\u001a\u00020\u0003H\u0016J0\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u00152\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0007H\u0016J\u0012\u0010=\u001a\u00020\u00032\b\u0010>\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010B\u001a\u00020\u00032\u0006\u0010:\u001a\u00020;H\u0016J\b\u0010C\u001a\u00020\u0003H\u0016J\b\u0010D\u001a\u00020\u0003H\u0016Jx\u0010E\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00152\b\u0010F\u001a\u0004\u0018\u00010\u00152\u0006\u0010G\u001a\u00020*2\u0018\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00030)2:\u0010+\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\bI\u0012\b\bJ\u0012\u0004\b\b(K\u0012\u0015\u0012\u0013\u0018\u00010L¢\u0006\f\bI\u0012\b\bJ\u0012\u0004\b\b(M\u0012\u0004\u0012\u00020\u00030HH\u0016J\b\u0010N\u001a\u00020\u0003H\u0016J4\u0010O\u001a\u00020\u00032\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00072\u0006\u0010P\u001a\u00020\u00072\b\u0010Q\u001a\u0004\u0018\u00010\u00152\b\u0010R\u001a\u0004\u0018\u00010\u0015H\u0016J0\u0010S\u001a\u00020\u00072\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020;0U2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020W0UH\u0016J:\u0010X\u001a\u00020\u00032\u0006\u0010Y\u001a\u00020\u00152\u001a\u0010(\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020*\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00030)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030,H\u0016¨\u0006Z"}, d2 = {"com/ss/android/lark/mm/module/detail/subtitles/MmMeetingSubtitleViewControlAdapter$getDependency$1", "Lcom/ss/android/lark/mm/module/detail/subtitles/IMmMeetingSubtitleDependency;", "checkIsNeedAutoPlay", "", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getBottomPanelHeight", "", "context", "Landroid/content/Context;", "getBottomPanelY", "getComments", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment;", "getCommentsSingle", "Lio/reactivex/Single;", "translateLangType", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "getEditStateManager", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditStateManager;", "getKeywords", "", "", "getMentionCommentId", "getMentionContentId", "getOriginSubtitles", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSubtitles;", "getSubtitles", "getTopTabLayoutPositionY", "getTranslateType", "isInitialDisplaySubtitle", "", "isMentionFromComments", "isOriginalTextDialogShowing", "isPlaying", "loadBaseInfoSingle", "loadKeywordsSingle", "loadSubtitlesSingle", "isFromNetwork", "loadSuggestedSpeakers", "paraId", "onSuccess", "Lkotlin/Function1;", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "onError", "Lkotlin/Function0;", "notifyChangeEditStatusContent", "content", "notifyDismissCommentsDialog", "notifyEnterEditMode", "notifyExitEditMode", "notifyFinishLoading", "notifyHideVideoView", "notifyOnHideTranslateBar", "notifyOnShowTranslateBar", "notifyPostComment", "start", "end", "quote", "paragraph", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingParagraph;", "adapterPosition", "notifySearchKeyword", "keyword", "notifySeekTo", "ts", "", "notifyShowOriginTextDialog", "notifyShowVideoView", "notifyTopicUpdate", "notifyUpdateSpeaker", "editSession", "speaker", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "denyType", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "error", "notifyUpdateViewDismiss", "notifyViewComment", "locationPosition", "mentionCommentId", "mentionContentId", "replaceOldPara", "subtitles", "", "comments", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo;", "searchSpeakers", "keywords", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.f$a */
    public static final class C46250a implements IMmMeetingSubtitleDependency {

        /* renamed from: a */
        final /* synthetic */ MmMeetingSubtitleViewControlAdapter f116542a;

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: a */
        public void mo162244a(String str) {
            IMmDetailSearchListener dVar = (IMmDetailSearchListener) this.f116542a.mo162487e().mo161266d(IMmDetailSearchListener.class);
            if (dVar != null) {
                dVar.mo162038a(str);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: a */
        public void mo162243a(MmMeetingParagraph mmMeetingParagraph, int i, int i2, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(mmMeetingParagraph, "paragraph");
            IMmCommentListener cVar = (IMmCommentListener) this.f116542a.mo162487e().mo161266d(IMmCommentListener.class);
            if (cVar != null) {
                cVar.mo161686a(mmMeetingParagraph, i, i2, str, str2);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: a */
        public void mo162246a(String str, Function1<? super List<? extends MmParticipants.MmParticipantInfo>, Unit> function1, Function0<Unit> function0) {
            Intrinsics.checkParameterIsNotNull(str, "paraId");
            Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
            Intrinsics.checkParameterIsNotNull(function0, "onError");
            this.f116542a.mo162489g().mo162302a(str, function1, function0);
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: a */
        public void mo162245a(String str, String str2, MmParticipants.MmParticipantInfo mmParticipantInfo, Function1<? super List<String>, Unit> function1, Function2<? super Integer, ? super C47068a, Unit> kVar) {
            Intrinsics.checkParameterIsNotNull(str, "paraId");
            Intrinsics.checkParameterIsNotNull(mmParticipantInfo, "speaker");
            Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
            Intrinsics.checkParameterIsNotNull(kVar, "onError");
            String str3 = str2;
            if (!(str3 == null || str3.length() == 0)) {
                this.f116542a.mo162489g().mo162301a(str, str2, mmParticipantInfo, new C46251a(this, function1), kVar);
                return;
            }
            kVar.invoke(null, null);
            C45855f.m181666e("MmMeetingSubtitleViewControlAdapter", "[notifyUpdateSpeaker] failed editSession is nullOrEmpty");
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: a */
        public MmBaseInfo mo162237a() {
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl = this.f116542a.f116536a;
            if (mmMeetingBaseInfoControl != null) {
                return mmMeetingBaseInfoControl.mo161581b();
            }
            return null;
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: d */
        public MmMeetingSubtitles mo162252d() {
            return this.f116542a.mo162489g().mo162296a();
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: g */
        public List<String> mo162255g() {
            return this.f116542a.mo162489g().mo162307c();
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: e */
        public MmComment mo162253e() {
            MmCommentControl dVar = (MmCommentControl) this.f116542a.mo162488f().mo161912a(MmCommentControl.class);
            if (dVar != null) {
                return dVar.mo161688a();
            }
            return null;
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: f */
        public MmEditStateManager mo162254f() {
            IMmDetailTitleBarInquirer bVar = (IMmDetailTitleBarInquirer) this.f116542a.mo162487e().mo161259a(IMmDetailTitleBarInquirer.class);
            if (bVar != null) {
                return bVar.mo162723b();
            }
            return null;
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: h */
        public int mo162256h() {
            IMmVideoToolbarInquirer bVar = (IMmVideoToolbarInquirer) this.f116542a.mo162487e().mo161259a(IMmVideoToolbarInquirer.class);
            if (bVar != null) {
                return bVar.mo164205a();
            }
            return 0;
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: i */
        public int mo162257i() {
            IMmDetailInquirer bVar = (IMmDetailInquirer) this.f116542a.mo162487e().mo161259a(IMmDetailInquirer.class);
            if (bVar != null) {
                return bVar.mo161898a();
            }
            return 0;
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: j */
        public boolean mo162258j() {
            MmVideoControl eVar = (MmVideoControl) this.f116542a.mo162488f().mo161912a(MmVideoControl.class);
            if (eVar != null) {
                return eVar.mo164035i();
            }
            return false;
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: k */
        public boolean mo162259k() {
            return MmMentionUrlUtils.f117052a.mo163363a(this.f116542a.mo162489g().mo162313i());
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: n */
        public boolean mo162262n() {
            IMmDetailInquirer bVar = (IMmDetailInquirer) this.f116542a.mo162487e().mo161259a(IMmDetailInquirer.class);
            if (bVar == null || bVar.mo161899b() != 0) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: o */
        public boolean mo162263o() {
            IMmTranslateInquirer bVar = (IMmTranslateInquirer) this.f116542a.mo162487e().mo161259a(IMmTranslateInquirer.class);
            if (bVar != null) {
                return bVar.mo161274a();
            }
            return false;
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: p */
        public MmTranslateLangType mo162264p() {
            MmTranslateLangType a;
            MmTranslateControl dVar = (MmTranslateControl) this.f116542a.mo162488f().mo161912a(MmTranslateControl.class);
            if (dVar == null || (a = dVar.mo161280a()) == null) {
                return MmTranslateLangType.DEFAULT;
            }
            return a;
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: q */
        public void mo162265q() {
            IMmDetailListener cVar = (IMmDetailListener) this.f116542a.mo162487e().mo161266d(IMmDetailListener.class);
            if (cVar != null) {
                cVar.mo161904f();
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: r */
        public void mo162266r() {
            IMmDetailStartUpListener cVar = (IMmDetailStartUpListener) this.f116542a.mo162487e().mo161266d(IMmDetailStartUpListener.class);
            if (cVar != null) {
                cVar.mo161411a();
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: s */
        public void mo162267s() {
            IMmTranslateListener cVar = (IMmTranslateListener) this.f116542a.mo162487e().mo161266d(IMmTranslateListener.class);
            if (cVar != null) {
                cVar.mo161278g();
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: t */
        public void mo162268t() {
            IMmTranslateListener cVar = (IMmTranslateListener) this.f116542a.mo162487e().mo161266d(IMmTranslateListener.class);
            if (cVar != null) {
                cVar.mo161279i();
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: v */
        public void mo162270v() {
            IMmDetailListener cVar = (IMmDetailListener) this.f116542a.mo162487e().mo161266d(IMmDetailListener.class);
            if (cVar != null) {
                cVar.mo161907j();
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: w */
        public void mo162271w() {
            IMmCommentListener cVar = (IMmCommentListener) this.f116542a.mo162487e().mo161266d(IMmCommentListener.class);
            if (cVar != null) {
                cVar.mo161684a();
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: z */
        public void mo162274z() {
            String str;
            IMmDetailListener cVar = (IMmDetailListener) this.f116542a.mo162487e().mo161266d(IMmDetailListener.class);
            if (cVar != null) {
                MmBaseInfo a = mo162237a();
                if (a != null) {
                    str = a.getTopic();
                } else {
                    str = null;
                }
                cVar.mo161901a(str);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: b */
        public Single<MmBaseInfo> mo162247b() {
            Single<MmBaseInfo> a;
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.f116542a.mo162488f().mo161912a(MmMeetingBaseInfoControl.class);
            if (mmMeetingBaseInfoControl != null && (a = mmMeetingBaseInfoControl.mo161571a(true)) != null) {
                return a;
            }
            Single<MmBaseInfo> just = Single.just(new MmBaseInfo());
            Intrinsics.checkExpressionValueIsNotNull(just, "Single.just(MmBaseInfo())");
            return just;
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: c */
        public MmMeetingSubtitles mo162251c() {
            MmTranslateLangType mmTranslateLangType;
            MmTranslateControl dVar = (MmTranslateControl) this.f116542a.mo162488f().mo161912a(MmTranslateControl.class);
            if (dVar != null) {
                mmTranslateLangType = dVar.mo161280a();
            } else {
                mmTranslateLangType = null;
            }
            if (mmTranslateLangType == MmTranslateLangType.DEFAULT) {
                return this.f116542a.mo162489g().mo162296a();
            }
            return this.f116542a.mo162489g().mo162304b();
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: l */
        public String mo162260l() {
            boolean z;
            String str = this.f116542a.f116537b;
            if (str == null || StringsKt.isBlank(str)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f116542a.f116537b = MmMentionUrlUtils.f117052a.mo163364b(this.f116542a.mo162489g().mo162313i());
            }
            return this.f116542a.f116537b;
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: m */
        public String mo162261m() {
            boolean z;
            String str = this.f116542a.f116538c;
            if (str == null || StringsKt.isBlank(str)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f116542a.f116538c = MmMentionUrlUtils.f117052a.mo163365c(this.f116542a.mo162489g().mo162313i());
            }
            return this.f116542a.f116538c;
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: u */
        public void mo162269u() {
            MmPlaySettingInfo s;
            MmVideoControl eVar;
            C46602i h;
            AbstractC46597d b;
            MmVideoControl eVar2 = (MmVideoControl) this.f116542a.mo162488f().mo161912a(MmVideoControl.class);
            if (eVar2 != null && (s = eVar2.mo164039s()) != null && s.isAutoPlay() && (eVar = (MmVideoControl) this.f116542a.mo162488f().mo161912a(MmVideoControl.class)) != null && (h = eVar.mo164034h()) != null && (b = h.mo163686b()) != null) {
                b.mo163706b();
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: x */
        public void mo162272x() {
            MmVideoControl eVar = (MmVideoControl) this.f116542a.mo162488f().mo161912a(MmVideoControl.class);
            if (eVar != null) {
                eVar.mo164027b(true);
            }
            IMmDetailTitleBarListener cVar = (IMmDetailTitleBarListener) this.f116542a.mo162487e().mo161266d(IMmDetailTitleBarListener.class);
            if (cVar != null) {
                cVar.mo162726g();
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: y */
        public void mo162273y() {
            MmVideoControl eVar = (MmVideoControl) this.f116542a.mo162488f().mo161912a(MmVideoControl.class);
            if (eVar != null) {
                eVar.mo164027b(false);
            }
            IMmDetailTitleBarListener cVar = (IMmDetailTitleBarListener) this.f116542a.mo162487e().mo161266d(IMmDetailTitleBarListener.class);
            if (cVar != null) {
                cVar.bg_();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.f$a$a */
        static final class C46251a extends Lambda implements Function1<List<? extends String>, Unit> {
            final /* synthetic */ Function1 $onSuccess;
            final /* synthetic */ C46250a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46251a(C46250a aVar, Function1 function1) {
                super(1);
                this.this$0 = aVar;
                this.$onSuccess = function1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
                invoke((List<String>) list);
                return Unit.INSTANCE;
            }

            public final void invoke(List<String> list) {
                Intrinsics.checkParameterIsNotNull(list, "it");
                IMmMeetingSubtitleDependency b = this.this$0.f116542a.mo161230c();
                String string = C45851c.m181646a().getString(R.string.MMWeb_G_Saving);
                Intrinsics.checkExpressionValueIsNotNull(string, "MmContext.getContext().g…(R.string.MMWeb_G_Saving)");
                b.mo162249b(string);
                this.$onSuccess.invoke(list);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46250a(MmMeetingSubtitleViewControlAdapter fVar) {
            this.f116542a = fVar;
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: a */
        public Single<List<String>> mo162238a(MmTranslateLangType mmTranslateLangType) {
            Intrinsics.checkParameterIsNotNull(mmTranslateLangType, "translateLangType");
            return MmMeetingSubtitleControl.m182874a(this.f116542a.mo162489g(), mmTranslateLangType, false, 2, (Object) null);
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: b */
        public void mo162249b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            IMmDetailTitleBarListener cVar = (IMmDetailTitleBarListener) this.f116542a.mo162487e().mo161266d(IMmDetailTitleBarListener.class);
            if (cVar != null) {
                cVar.mo162720a(str);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: a */
        public int mo162235a(Context context) {
            Boolean bool;
            Intrinsics.checkParameterIsNotNull(context, "context");
            IMmDetailSearchInquirer cVar = (IMmDetailSearchInquirer) this.f116542a.mo162487e().mo161259a(IMmDetailSearchInquirer.class);
            if (cVar != null) {
                bool = cVar.mo162037b();
            } else {
                bool = null;
            }
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                IMmDetailSearchInquirer cVar2 = (IMmDetailSearchInquirer) this.f116542a.mo162487e().mo161259a(IMmDetailSearchInquirer.class);
                if (cVar2 != null) {
                    return cVar2.mo162036a();
                }
                return 0;
            }
            IMmVideoToolbarInquirer bVar = (IMmVideoToolbarInquirer) this.f116542a.mo162487e().mo161259a(IMmVideoToolbarInquirer.class);
            if (bVar != null) {
                return bVar.mo164206b();
            }
            return 0;
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: b */
        public Single<MmComment> mo162248b(MmTranslateLangType mmTranslateLangType) {
            Single<MmComment> a;
            Intrinsics.checkParameterIsNotNull(mmTranslateLangType, "translateLangType");
            MmCommentControl dVar = (MmCommentControl) this.f116542a.mo162488f().mo161912a(MmCommentControl.class);
            if (dVar != null && (a = dVar.mo161689a(mmTranslateLangType)) != null) {
                return a;
            }
            Single<MmComment> error = Single.error(new IllegalStateException("MmCommentControl is null"));
            Intrinsics.checkExpressionValueIsNotNull(error, "Single.error(IllegalStat…CommentControl is null\"))");
            return error;
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: a */
        public void mo162241a(long j) {
            IMmVideoToolbarListener cVar = (IMmVideoToolbarListener) this.f116542a.mo162487e().mo161266d(IMmVideoToolbarListener.class);
            if (cVar != null) {
                cVar.mo164210a(j, false);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: a */
        public void mo162242a(MmMeetingParagraph mmMeetingParagraph) {
            Intrinsics.checkParameterIsNotNull(mmMeetingParagraph, "paragraph");
            StringBuilder sb = new StringBuilder();
            List<MmMeetingSentence> sentences = mmMeetingParagraph.getSentences();
            Intrinsics.checkExpressionValueIsNotNull(sentences, "paragraph.sentences");
            Iterator<T> it = sentences.iterator();
            while (it.hasNext()) {
                List<MmMeetingContent> list = it.next().contents;
                Intrinsics.checkExpressionValueIsNotNull(list, "it.contents");
                for (T t : list) {
                    Intrinsics.checkExpressionValueIsNotNull(t, "it");
                    sb.append(t.getContent());
                }
            }
            IMmTranslateListener cVar = (IMmTranslateListener) this.f116542a.mo162487e().mo161266d(IMmTranslateListener.class);
            if (cVar != null) {
                String sb2 = sb.toString();
                Intrinsics.checkExpressionValueIsNotNull(sb2, "stringBuilder.toString()");
                cVar.mo161275a(sb2);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: a */
        public int mo162236a(Map<String, ? extends MmMeetingParagraph> map, Map<String, ? extends MmComment.MmCommentInfo> map2) {
            Intrinsics.checkParameterIsNotNull(map, "subtitles");
            Intrinsics.checkParameterIsNotNull(map2, "comments");
            Pair<Integer, String> a = this.f116542a.mo162489g().mo162299a(map);
            if (a == null) {
                return -1;
            }
            MmCommentControl dVar = (MmCommentControl) this.f116542a.mo162488f().mo161912a(MmCommentControl.class);
            if (dVar != null) {
                dVar.mo161696a(map2, a.getSecond());
            }
            return a.getFirst().intValue();
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: a */
        public Single<MmMeetingSubtitles> mo162239a(MmTranslateLangType mmTranslateLangType, boolean z) {
            Intrinsics.checkParameterIsNotNull(mmTranslateLangType, "translateLangType");
            return MmMeetingSubtitleControl.m182875a(this.f116542a.mo162489g(), mmTranslateLangType, z, null, 4, null);
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: b */
        public void mo162250b(String str, Function1<? super List<? extends MmParticipants.MmParticipantInfo>, Unit> function1, Function0<Unit> function0) {
            Intrinsics.checkParameterIsNotNull(str, "keywords");
            Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
            Intrinsics.checkParameterIsNotNull(function0, "onError");
            this.f116542a.mo162489g().mo162306b(str, function1, function0);
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency
        /* renamed from: a */
        public void mo162240a(int i, int i2, String str, MmMeetingParagraph mmMeetingParagraph, int i3) {
            Intrinsics.checkParameterIsNotNull(str, "quote");
            Intrinsics.checkParameterIsNotNull(mmMeetingParagraph, "paragraph");
            IMmCommentListener cVar = (IMmCommentListener) this.f116542a.mo162487e().mo161266d(IMmCommentListener.class);
            if (cVar != null) {
                cVar.mo161685a(i, i2, str, mmMeetingParagraph, i3);
            }
        }
    }

    /* renamed from: b */
    public IMmMeetingSubtitleDependency mo161230c() {
        return new C46250a(this);
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter
    /* renamed from: d */
    public void mo161256d() {
        super.mo161256d();
        this.f116541f.mo162305b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.f$c */
    static final class RunnableC46253c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmMeetingSubtitleViewControlAdapter f116544a;

        /* renamed from: b */
        final /* synthetic */ MmMeetingParagraph f116545b;

        /* renamed from: c */
        final /* synthetic */ int f116546c;

        RunnableC46253c(MmMeetingSubtitleViewControlAdapter fVar, MmMeetingParagraph mmMeetingParagraph, int i) {
            this.f116544a = fVar;
            this.f116545b = mmMeetingParagraph;
            this.f116546c = i;
        }

        public final void run() {
            MmTranslateLangType mmTranslateLangType;
            IMmMeetingSubtitleListener cVar;
            MmTranslateControl dVar = (MmTranslateControl) this.f116544a.mo162488f().mo161912a(MmTranslateControl.class);
            if (dVar != null) {
                mmTranslateLangType = dVar.mo161280a();
            } else {
                mmTranslateLangType = null;
            }
            if (mmTranslateLangType == MmTranslateLangType.DEFAULT && (cVar = (IMmMeetingSubtitleListener) this.f116544a.mo162487e().mo161266d(IMmMeetingSubtitleListener.class)) != null) {
                cVar.mo162283a(this.f116545b, this.f116546c);
            }
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter
    /* renamed from: a */
    public void mo161251a() {
        C68294a<PermissionStatus> d;
        Disposable subscribe;
        super.mo161251a();
        MmMeetingBaseInfoControl mmMeetingBaseInfoControl = this.f116536a;
        if (!(mmMeetingBaseInfoControl == null || (d = mmMeetingBaseInfoControl.mo161586d()) == null || (subscribe = d.subscribe(new C46252b(this))) == null)) {
            mo161257h().mo237937a(subscribe);
        }
        this.f116541f.mo162300a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/share/model/PermissionStatus;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.f$b */
    static final class C46252b<T> implements Consumer<PermissionStatus> {

        /* renamed from: a */
        final /* synthetic */ MmMeetingSubtitleViewControlAdapter f116543a;

        C46252b(MmMeetingSubtitleViewControlAdapter fVar) {
            this.f116543a = fVar;
        }

        /* renamed from: a */
        public final void accept(PermissionStatus permissionStatus) {
            IMmMeetingSubtitleListener cVar = (IMmMeetingSubtitleListener) this.f116543a.mo162487e().mo161266d(IMmMeetingSubtitleListener.class);
            if (cVar != null) {
                cVar.mo162285a(permissionStatus);
            }
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.MmMeetingSubtitleControl.IMmPushChangeSubtitle
    /* renamed from: a */
    public void mo162315a(MmMeetingParagraph mmMeetingParagraph, int i) {
        Intrinsics.checkParameterIsNotNull(mmMeetingParagraph, "para");
        C45859k.m181685a(new RunnableC46253c(this, mmMeetingParagraph, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmMeetingSubtitleViewControlAdapter(MmViewControlRegister kVar, MmControlRegister eVar, MmMeetingSubtitleControl dVar) {
        super(kVar, eVar, dVar);
        Intrinsics.checkParameterIsNotNull(kVar, "viewControlRegister");
        Intrinsics.checkParameterIsNotNull(eVar, "controlRegister");
        Intrinsics.checkParameterIsNotNull(dVar, "control");
        this.f116539d = kVar;
        this.f116540e = eVar;
        this.f116541f = dVar;
        this.f116536a = (MmMeetingBaseInfoControl) eVar.mo161912a(MmMeetingBaseInfoControl.class);
    }
}
