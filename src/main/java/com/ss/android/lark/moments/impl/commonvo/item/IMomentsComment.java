package com.ss.android.lark.moments.impl.commonvo.item;

import android.content.Context;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.moments.v1.Comment;
import com.bytedance.lark.pb.moments.v1.IncompatibleAction;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.moments.impl.commonvo.IMomentsUser;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u0019H&J\b\u0010Z\u001a\u00020XH&J\u0010\u0010[\u001a\u00020X2\u0006\u0010\\\u001a\u00020]H&J\u0010\u0010^\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u0019H&J\b\u0010_\u001a\u00020XH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0005R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001fX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u0004\u0018\u00010#X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0012\u0010&\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0005R\u0012\u0010'\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0005R\u0012\u0010(\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0005R\u0012\u0010)\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0005R\u0012\u0010*\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0005R&\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020-\u0018\u00010,X¦\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00102\u001a\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0012\u00105\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0005R\u0018\u00107\u001a\b\u0012\u0004\u0012\u00020908X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001a\u0010<\u001a\u0004\u0018\u00010\rX¦\u000e¢\u0006\f\u001a\u0004\b=\u0010\u000f\"\u0004\b>\u0010?R&\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020-\u0018\u00010,X¦\u000e¢\u0006\f\u001a\u0004\bA\u0010/\"\u0004\bB\u00101R\u001a\u0010C\u001a\u0004\u0018\u00010DX¦\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0012\u0010I\u001a\u00020JX¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0012\u0010M\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\u001bR\u0012\u0010O\u001a\u00020PX¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010S\u001a\u0004\u0018\u00010TX¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006`"}, d2 = {"Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsComment;", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "canComment", "", "getCanComment", "()Z", "canDelete", "getCanDelete", "canReaction", "getCanReaction", "canReport", "getCanReport", Comment.f24093e, "Lcom/bytedance/lark/pb/moments/v1/Comment;", "getComment", "()Lcom/bytedance/lark/pb/moments/v1/Comment;", "content", "Lcom/ss/android/lark/widget/richtext/RichText;", "getContent", "()Lcom/ss/android/lark/widget/richtext/RichText;", "createTimeMillis", "", "getCreateTimeMillis", "()J", "errorMessage", "", "getErrorMessage", "()Ljava/lang/String;", "hasLikeReaction", "getHasLikeReaction", "imageSet", "Lcom/bytedance/lark/pb/basic/v1/ImageSet;", "getImageSet", "()Lcom/bytedance/lark/pb/basic/v1/ImageSet;", "incompatibleAction", "Lcom/bytedance/lark/pb/moments/v1/IncompatibleAction;", "getIncompatibleAction", "()Lcom/bytedance/lark/pb/moments/v1/IncompatibleAction;", "isAnonymous", "isDeleted", "isHot", "isSelfOwner", "isUnderReview", "previews", "", "Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;", "getPreviews", "()Ljava/util/Map;", "setPreviews", "(Ljava/util/Map;)V", "publishTimeMillis", "getPublishTimeMillis", "()Ljava/lang/Long;", "reactionAnonymous", "getReactionAnonymous", "reactionList", "", "Lcom/ss/android/lark/reaction/widget/detailwindow/bean/ReactionDetailViewModel;", "getReactionList", "()Ljava/util/List;", "replyComment", "getReplyComment", "setReplyComment", "(Lcom/bytedance/lark/pb/moments/v1/Comment;)V", "replyCommentPreview", "getReplyCommentPreview", "setReplyCommentPreview", "replyCommentSender", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "getReplyCommentSender", "()Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "setReplyCommentSender", "(Lcom/bytedance/lark/pb/moments/v1/MomentUser;)V", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/moments/v1/Comment$CreateStatus;", "getStatus", "()Lcom/bytedance/lark/pb/moments/v1/Comment$CreateStatus;", "timeLabelText", "getTimeLabelText", "totalReactionCount", "", "getTotalReactionCount", "()I", "user", "Lcom/ss/android/lark/moments/impl/commonvo/IMomentsUser;", "getUser", "()Lcom/ss/android/lark/moments/impl/commonvo/IMomentsUser;", "clickReaction", "", "reactionKey", "delete", "doCopy", "context", "Landroid/content/Context;", "openReactionDetail", "resend", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.commonvo.item.a */
public interface IMomentsComment extends IMomentsItemBase {
    /* renamed from: A */
    Map<String, PreviewHangPoint> mo166372A();

    /* renamed from: B */
    boolean mo166373B();

    /* renamed from: C */
    MomentUser mo166374C();

    /* renamed from: D */
    com.bytedance.lark.pb.moments.v1.Comment mo166375D();

    /* renamed from: E */
    Map<String, PreviewHangPoint> mo166376E();

    /* renamed from: F */
    String mo166377F();

    /* renamed from: a */
    void mo166380a(Context context);

    /* renamed from: a */
    void mo166383a(String str);

    /* renamed from: b */
    RichText mo166386b();

    /* renamed from: b */
    void mo166387b(String str);

    /* renamed from: c */
    ImageSet mo166389c();

    /* renamed from: f */
    String mo166393f();

    /* renamed from: g */
    boolean mo166394g();

    /* renamed from: i */
    boolean mo166397i();

    /* renamed from: j */
    boolean mo166398j();

    /* renamed from: k */
    boolean mo166399k();

    /* renamed from: l */
    boolean mo166400l();

    /* renamed from: m */
    boolean mo166401m();

    /* renamed from: n */
    boolean mo166402n();

    /* renamed from: o */
    boolean mo166403o();

    /* renamed from: p */
    int mo166404p();

    /* renamed from: q */
    IncompatibleAction mo166405q();

    /* renamed from: r */
    Comment.CreateStatus mo166406r();

    /* renamed from: s */
    boolean mo166407s();

    /* renamed from: u */
    void mo166410u();

    /* renamed from: v */
    void mo166411v();

    /* renamed from: w */
    com.bytedance.lark.pb.moments.v1.Comment mo166412w();

    /* renamed from: y */
    IMomentsUser mo166414y();

    /* renamed from: z */
    List<ReactionDetailViewModel> mo166415z();
}
