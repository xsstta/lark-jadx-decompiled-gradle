package com.ss.android.lark.mm.module.detail.subtitles;

import com.bytedance.ee.bear.middleground.comment.Comment;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.mm.module.detail.comment.model.MmComment;
import com.ss.android.lark.mm.module.detail.search.model.FindResponse;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingParagraph;
import com.ss.android.lark.mm.module.detail.subtitles.model.response.ReplyCommentRes;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.IMmListener;
import com.ss.android.lark.mm.module.share.model.PermissionStatus;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J\u001e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0015\u001a\u00020\u0003H&J\u0012\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0005H&J\u0012\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH&J\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\fH&J\u0018\u0010\"\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\fH&J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&H&JH\u0010'\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\u00122&\u0010+\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020-\u0018\u00010,j\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020-\u0018\u0001`.H&J\u0018\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0005H&J\b\u00103\u001a\u00020\u0003H&J\b\u00104\u001a\u00020\u0003H&J\b\u00105\u001a\u00020\u0003H&J\b\u00106\u001a\u00020\u0003H&J\b\u00107\u001a\u00020\u0003H&J\b\u00108\u001a\u00020\u0003H&J\b\u00109\u001a\u00020\u0003H&J\b\u0010:\u001a\u00020\u0003H&J\u0010\u0010;\u001a\u00020\u00032\u0006\u0010<\u001a\u00020\fH&¨\u0006="}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/IMmMeetingSubtitleListener;", "Lcom/ss/android/lark/mm/module/framework/IMmListener;", "onChangeCurrentFocusComment", "", "adapterPosition", "", "highlightRange", "Lkotlin/ranges/IntRange;", "onChangeKeyword", "content", "", "auto", "", "keyword", "onChangeTranslateLang", "translateLangType", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "", "onCommentDialogDismiss", "onExitOriginTextDialog", "onFindResult", "findResponse", "Lcom/ss/android/lark/mm/module/detail/search/model/FindResponse;", "onFindResultFocusChange", "index", "onMmStatusChange", UpdateKey.STATUS, "Lcom/ss/android/lark/mm/module/share/model/PermissionStatus;", "onPlaying", "timeStamp", "", "isByUser", "onPostCommentDialogDismiss", "isPostSucceed", "onPostCommentSuc", "res", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/response/ReplyCommentRes;", "onPushChangeParaComment", Comment.f24093e, "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment;", "needUpdateParaIds", "commentMap", "Ljava/util/HashMap;", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo;", "Lkotlin/collections/HashMap;", "onPushChangeSubtitlePara", "para", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingParagraph;", "paraPosition", "onReBindSubtitle", "onRefresh", "onSeekManual", "onStartFind", "onStartPlay", "onStopFind", "onStopPlay", "onStopScroll", "onVideoPlayerCompletelyVisibleChange", "isCompletelyVisible", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.subtitles.c */
public interface IMmMeetingSubtitleListener extends IMmListener {
    /* renamed from: a */
    void mo162275a();

    /* renamed from: a */
    void mo162276a(int i);

    /* renamed from: a */
    void mo162277a(int i, ReplyCommentRes replyCommentRes);

    /* renamed from: a */
    void mo162278a(int i, IntRange kVar);

    /* renamed from: a */
    void mo162279a(int i, boolean z);

    /* renamed from: a */
    void mo162280a(long j, boolean z);

    /* renamed from: a */
    void mo162281a(MmComment mmComment, List<String> list, HashMap<String, MmComment.MmCommentInfo> hashMap);

    /* renamed from: a */
    void mo162282a(FindResponse findResponse);

    /* renamed from: a */
    void mo162283a(MmMeetingParagraph mmMeetingParagraph, int i);

    /* renamed from: a */
    void mo162284a(MmTranslateLangType mmTranslateLangType, List<? extends Object> list);

    /* renamed from: a */
    void mo162285a(PermissionStatus permissionStatus);

    /* renamed from: a */
    void mo162286a(boolean z);

    /* renamed from: b */
    void mo162287b();

    /* renamed from: b */
    void mo162288b(int i);

    /* renamed from: f */
    void mo162289f();

    /* renamed from: g */
    void mo162290g();

    /* renamed from: i */
    void mo162291i();

    /* renamed from: j */
    void mo162292j();

    /* renamed from: k */
    void mo162293k();

    /* renamed from: l */
    void mo162294l();

    /* renamed from: m */
    void mo162295m();
}
