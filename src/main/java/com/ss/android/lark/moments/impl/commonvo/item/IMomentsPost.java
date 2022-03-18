package com.ss.android.lark.moments.impl.commonvo.item;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.moments.v1.Category;
import com.bytedance.lark.pb.moments.v1.IncompatibleAction;
import com.bytedance.lark.pb.moments.v1.Media;
import com.bytedance.lark.pb.moments.v1.Post;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.moments.impl.commonvo.IMomentsUser;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0010\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020$H&J\b\u0010m\u001a\u00020kH&J\u0010\u0010n\u001a\u00020k2\u0006\u0010o\u001a\u00020pH&J\b\u0010q\u001a\u00020kH&J\u0010\u0010r\u001a\u00020k2\u0006\u0010l\u001a\u00020$H&J\b\u0010s\u001a\u00020kH&J\b\u0010t\u001a\u00020kH&J \u0010u\u001a\u00020k2\u0006\u0010o\u001a\u00020p2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010v\u001a\u00020\u0003H&J\b\u0010w\u001a\u00020kH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0012\u0010\u001f\u001a\u00020 X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u0004\u0018\u00010$X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0012\u0010'\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0005R\u001a\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0016R\u0014\u0010,\u001a\u0004\u0018\u00010-X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0012\u00100\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0005R\u0012\u00101\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0005R\u001a\u00102\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0012\u00106\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0005R\u001a\u00107\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b7\u00103\"\u0004\b8\u00105R\u0012\u00109\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0005R\u0012\u0010:\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0005R\u0014\u0010;\u001a\u0004\u0018\u00010<X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0012\u0010?\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u0005R\u0012\u0010A\u001a\u00020BX¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010E\u001a\u0004\u0018\u00010FX¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR \u0010I\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020K\u0018\u00010JX¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010N\u001a\u0004\u0018\u00010\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0018\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010\u0016R\u0012\u0010T\u001a\u00020UX¦\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0012\u0010X\u001a\u00020$X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010&R\u0012\u0010Z\u001a\u00020[X¦\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0012\u0010^\u001a\u00020[X¦\u0004¢\u0006\u0006\u001a\u0004\b_\u0010]R\u0012\u0010`\u001a\u00020[X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010]R\u0012\u0010b\u001a\u00020cX¦\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010f\u001a\u0004\u0018\u00010gX¦\u0004¢\u0006\u0006\u001a\u0004\bh\u0010i¨\u0006x"}, d2 = {"Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsPost;", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "canAdministrate", "", "getCanAdministrate", "()Z", "canComment", "getCanComment", "canDelete", "getCanDelete", "canReaction", "getCanReaction", "canReport", "getCanReport", "category", "Lcom/bytedance/lark/pb/moments/v1/Category;", "getCategory", "()Lcom/bytedance/lark/pb/moments/v1/Category;", "commentList", "", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsComment;", "getCommentList", "()Ljava/util/List;", "content", "Lcom/ss/android/lark/widget/richtext/RichText;", "getContent", "()Lcom/ss/android/lark/widget/richtext/RichText;", "createTimeMillis", "", "getCreateTimeMillis", "()J", "distributionType", "Lcom/bytedance/lark/pb/moments/v1/Post$PostDistributionType;", "getDistributionType", "()Lcom/bytedance/lark/pb/moments/v1/Post$PostDistributionType;", "errorMessage", "", "getErrorMessage", "()Ljava/lang/String;", "hasLikeReaction", "getHasLikeReaction", "imageList", "Lcom/bytedance/lark/pb/basic/v1/ImageSet;", "getImageList", "incompatibleAction", "Lcom/bytedance/lark/pb/moments/v1/IncompatibleAction;", "getIncompatibleAction", "()Lcom/bytedance/lark/pb/moments/v1/IncompatibleAction;", "isAnonymous", "isBroadcast", "isFirstItem", "()Ljava/lang/Boolean;", "setFirstItem", "(Ljava/lang/Boolean;)V", "isHighLight", "isLastItem", "setLastItem", "isSelfOwner", "isUnderReview", "media", "Lcom/bytedance/lark/pb/moments/v1/Media;", "getMedia", "()Lcom/bytedance/lark/pb/moments/v1/Media;", "needShowFrom", "getNeedShowFrom", "post", "Lcom/bytedance/lark/pb/moments/v1/Post;", "getPost", "()Lcom/bytedance/lark/pb/moments/v1/Post;", "postContent", "Lcom/bytedance/lark/pb/moments/v1/Post$PostContent;", "getPostContent", "()Lcom/bytedance/lark/pb/moments/v1/Post$PostContent;", "previews", "", "Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;", "getPreviews", "()Ljava/util/Map;", "publishTimeMillis", "getPublishTimeMillis", "()Ljava/lang/Long;", "reactionList", "Lcom/ss/android/lark/reaction/widget/detailwindow/bean/ReactionDetailViewModel;", "getReactionList", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/moments/v1/Post$CreateStatus;", "getStatus", "()Lcom/bytedance/lark/pb/moments/v1/Post$CreateStatus;", "timeLabelText", "getTimeLabelText", "totalCommentCount", "", "getTotalCommentCount", "()I", "totalReactionCount", "getTotalReactionCount", "totalShareCount", "getTotalShareCount", ShareHitPoint.f121869d, "Lcom/bytedance/lark/pb/moments/v1/Post$Type;", "getType", "()Lcom/bytedance/lark/pb/moments/v1/Post$Type;", "user", "Lcom/ss/android/lark/moments/impl/commonvo/IMomentsUser;", "getUser", "()Lcom/ss/android/lark/moments/impl/commonvo/IMomentsUser;", "clickReaction", "", "reactionKey", "delete", "doCopy", "context", "Landroid/content/Context;", "markHighlight", "openReactionDetail", "resend", "setNotDistributionType", "startBroadcastEditActivity", "isReEdit", "unsetBroadcast", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.commonvo.item.b */
public interface IMomentsPost extends IMomentsItemBase {
    /* renamed from: A */
    boolean mo166416A();

    /* renamed from: B */
    void mo166417B();

    /* renamed from: C */
    void mo166418C();

    /* renamed from: D */
    void mo166419D();

    /* renamed from: E */
    void mo166420E();

    /* renamed from: F */
    Post mo166421F();

    /* renamed from: H */
    IMomentsUser mo166423H();

    /* renamed from: I */
    List<IMomentsComment> mo166424I();

    /* renamed from: J */
    List<ReactionDetailViewModel> mo166425J();

    /* renamed from: K */
    Map<String, PreviewHangPoint> mo166426K();

    /* renamed from: L */
    Category mo166427L();

    /* renamed from: M */
    boolean mo166428M();

    /* renamed from: N */
    String mo166429N();

    /* renamed from: O */
    Boolean mo166430O();

    /* renamed from: P */
    Boolean mo166431P();

    /* renamed from: a */
    void mo166433a(Context context);

    /* renamed from: a */
    void mo166434a(Context context, IMomentsPost bVar, boolean z);

    /* renamed from: a */
    void mo166436a(String str);

    /* renamed from: b */
    void mo166440b(String str);

    /* renamed from: c */
    RichText mo166442c();

    /* renamed from: d */
    List<ImageSet> mo166443d();

    /* renamed from: e */
    Media mo166444e();

    /* renamed from: h */
    String mo166448h();

    /* renamed from: i */
    boolean mo166450i();

    /* renamed from: k */
    boolean mo166452k();

    /* renamed from: l */
    boolean mo166453l();

    /* renamed from: m */
    int mo166454m();

    /* renamed from: n */
    Post.CreateStatus mo166455n();

    /* renamed from: o */
    boolean mo166456o();

    /* renamed from: p */
    boolean mo166457p();

    /* renamed from: q */
    boolean mo166458q();

    /* renamed from: r */
    boolean mo166459r();

    /* renamed from: s */
    boolean mo166460s();

    /* renamed from: u */
    int mo166462u();

    /* renamed from: v */
    int mo166463v();

    /* renamed from: w */
    boolean mo166464w();

    /* renamed from: y */
    IncompatibleAction mo166466y();

    /* renamed from: z */
    Post.PostDistributionType mo166467z();
}
