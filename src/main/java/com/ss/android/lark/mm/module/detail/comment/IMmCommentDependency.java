package com.ss.android.lark.mm.module.detail.comment;

import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.comment.model.MmComment;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingParagraph;
import com.ss.android.lark.mm.module.detail.subtitles.model.request.AddCommentReq;
import com.ss.android.lark.mm.module.detail.subtitles.model.response.ReplyCommentRes;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.IMmDependency;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J.\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007H&J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H'J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0016H&JV\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\"H&J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0019H&J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u0016H&J\u0010\u0010)\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0019H&J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\bH&¨\u0006,"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/comment/IMmCommentDependency;", "Lcom/ss/android/lark/mm/module/framework/IMmDependency;", "addComment", "", "addCommentReq", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/request/AddCommentReq;", "callback", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/response/ReplyCommentRes;", "deleteComment", "pid", "", "commentId", "contentId", "dataCallback", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getMmComment", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment;", "getTranslateType", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "isOnwer", "", "newComment", "startSelection", "", "endSelection", "quote", "commentContent", "paragraph", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingParagraph;", "onSuccessCallback", "Lkotlin/Function1;", "onFailed", "Lkotlin/Function0;", "notifyChangeCurrentFocusComment", "highlightRange", "Lkotlin/ranges/IntRange;", "adapterPosition", "notifyDismissPostCommentDialog", "isPostSucceed", "notifyDismissViewCommentDialog", "notifyPostCommentSuc", "res", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.comment.a */
public interface IMmCommentDependency extends IMmDependency {
    /* renamed from: a */
    MmBaseInfo mo161673a();

    /* renamed from: a */
    void mo161674a(int i);

    /* renamed from: a */
    void mo161675a(int i, int i2, String str, String str2, MmMeetingParagraph mmMeetingParagraph, Function1<? super ReplyCommentRes, Unit> function1, Function0<Unit> function0);

    /* renamed from: a */
    void mo161676a(int i, ReplyCommentRes replyCommentRes);

    /* renamed from: a */
    void mo161677a(int i, boolean z);

    /* renamed from: a */
    void mo161678a(AddCommentReq addCommentReq, AbstractC47070c<ReplyCommentRes> cVar);

    /* renamed from: a */
    void mo161679a(String str, String str2, String str3, AbstractC47070c<String> cVar);

    /* renamed from: a */
    void mo161680a(IntRange kVar, int i);

    /* renamed from: b */
    MmComment mo161681b();

    /* renamed from: c */
    MmTranslateLangType mo161682c();

    /* renamed from: d */
    boolean mo161683d();
}
