package com.ss.android.lark.moments.impl.commonvo;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.moments.v1.Category;
import com.bytedance.lark.pb.moments.v1.CommentSet;
import com.bytedance.lark.pb.moments.v1.EntityType;
import com.bytedance.lark.pb.moments.v1.IncompatibleAction;
import com.bytedance.lark.pb.moments.v1.Media;
import com.bytedance.lark.pb.moments.v1.Post;
import com.bytedance.lark.pb.moments.v1.ReactionSet;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.impl.common.utils.C47281d;
import com.ss.android.lark.moments.impl.common.utils.CopyUtils;
import com.ss.android.lark.moments.impl.common.utils.ReactionUtils;
import com.ss.android.lark.moments.impl.common.utils.TimeLabelUtils;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\b\u0018\u0000 \u00012\u00020\u0001:\u0002\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0018J\u0010\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020\rH\u0016J\t\u0010t\u001a\u00020\u0003HÆ\u0003J\u0010\u0010u\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010CJ\u0010\u0010v\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010CJ\u000b\u0010w\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010x\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000f\u0010y\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\u0017\u0010z\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003J\t\u0010{\u001a\u00020\u0010HÂ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010}\u001a\u00020\u0014HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\rHÆ\u0003J£\u0001\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0003\u0010\u0001J\t\u0010\u0001\u001a\u00020rH\u0016J\u0013\u0010\u0001\u001a\u00020r2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0016\u0010\u0001\u001a\u00020\u00142\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0001\u001a\u00020dH\u0016J\n\u0010\u0001\u001a\u00020dHÖ\u0001J\u0015\u0010\u0001\u001a\u00020\u00142\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J\u0015\u0010\u0001\u001a\u00020\u00142\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J\t\u0010\u0001\u001a\u00020rH\u0016J\u0011\u0010\u0001\u001a\u00020r2\u0006\u0010s\u001a\u00020\rH\u0016J\u000b\u0010\u0001\u001a\u0004\u0018\u00010)H\u0002J\t\u0010\u0001\u001a\u00020rH\u0016J\t\u0010\u0001\u001a\u00020rH\u0016J$\u0010\u0001\u001a\u00020r2\b\u0010\u0001\u001a\u00030\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0007\u0010\u0001\u001a\u00020\u0014H\u0016J\n\u0010\u0001\u001a\u00020\rHÖ\u0001J\t\u0010\u0001\u001a\u00020rH\u0016R\u0014\u0010\u0019\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0014\u0010 \u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0014\u0010\"\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010(\u001a\u0004\u0018\u00010)X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020-X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u000201X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001bR\u0014\u00108\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u00105R\u001c\u0010:\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010'R\u0016\u0010=\u001a\u0004\u0018\u00010>X\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u001bR\u0014\u0010B\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u001bR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0010\n\u0002\u0010F\u001a\u0004\b\u0016\u0010C\"\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010\u001bR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0010\n\u0002\u0010F\u001a\u0004\b\u0017\u0010C\"\u0004\bH\u0010ER\u0014\u0010I\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010\u001bR\u0014\u0010J\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u001bR\u0016\u0010K\u001a\u0004\u0018\u00010LX\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010\u001bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0016\u0010R\u001a\u0004\u0018\u00010SX\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0018\u0010X\u001a\u0004\u0018\u00010-X\u0004¢\u0006\n\n\u0002\u0010[\u001a\u0004\bY\u0010ZR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010'R\u0014\u0010]\u001a\u00020^X\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0014\u0010a\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u00105R\u0014\u0010c\u001a\u00020dX\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0014\u0010g\u001a\u00020dX\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010fR\u0014\u0010i\u001a\u00020dX\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010fR\u0014\u0010k\u001a\u00020lX\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010p¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/moments/impl/commonvo/MomentsPostVM;", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsPost;", "post", "Lcom/bytedance/lark/pb/moments/v1/Post;", "user", "Lcom/ss/android/lark/moments/impl/commonvo/MomentsUserVM;", "commentList", "", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsComment;", "reactionList", "Lcom/ss/android/lark/reaction/widget/detailwindow/bean/ReactionDetailViewModel;", "previews", "", "", "Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;", "model", "Lcom/ss/android/lark/moments/impl/commonvo/IMomentsPostModel;", "category", "Lcom/bytedance/lark/pb/moments/v1/Category;", "needShowFrom", "", "errorMessage", "isFirstItem", "isLastItem", "(Lcom/bytedance/lark/pb/moments/v1/Post;Lcom/ss/android/lark/moments/impl/commonvo/MomentsUserVM;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/ss/android/lark/moments/impl/commonvo/IMomentsPostModel;Lcom/bytedance/lark/pb/moments/v1/Category;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "canAdministrate", "getCanAdministrate", "()Z", "canComment", "getCanComment", "canDelete", "getCanDelete", "canReaction", "getCanReaction", "canReport", "getCanReport", "getCategory", "()Lcom/bytedance/lark/pb/moments/v1/Category;", "getCommentList", "()Ljava/util/List;", "content", "Lcom/ss/android/lark/widget/richtext/RichText;", "getContent", "()Lcom/ss/android/lark/widget/richtext/RichText;", "createTimeMillis", "", "getCreateTimeMillis", "()J", "distributionType", "Lcom/bytedance/lark/pb/moments/v1/Post$PostDistributionType;", "getDistributionType", "()Lcom/bytedance/lark/pb/moments/v1/Post$PostDistributionType;", "getErrorMessage", "()Ljava/lang/String;", "hasLikeReaction", "getHasLikeReaction", "id", "getId", "imageList", "Lcom/bytedance/lark/pb/basic/v1/ImageSet;", "getImageList", "incompatibleAction", "Lcom/bytedance/lark/pb/moments/v1/IncompatibleAction;", "getIncompatibleAction", "()Lcom/bytedance/lark/pb/moments/v1/IncompatibleAction;", "isAnonymous", "isBroadcast", "()Ljava/lang/Boolean;", "setFirstItem", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isHighLight", "setLastItem", "isSelfOwner", "isUnderReview", "media", "Lcom/bytedance/lark/pb/moments/v1/Media;", "getMedia", "()Lcom/bytedance/lark/pb/moments/v1/Media;", "getNeedShowFrom", "getPost", "()Lcom/bytedance/lark/pb/moments/v1/Post;", "postContent", "Lcom/bytedance/lark/pb/moments/v1/Post$PostContent;", "getPostContent", "()Lcom/bytedance/lark/pb/moments/v1/Post$PostContent;", "getPreviews", "()Ljava/util/Map;", "publishTimeMillis", "getPublishTimeMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getReactionList", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/moments/v1/Post$CreateStatus;", "getStatus", "()Lcom/bytedance/lark/pb/moments/v1/Post$CreateStatus;", "timeLabelText", "getTimeLabelText", "totalCommentCount", "", "getTotalCommentCount", "()I", "totalReactionCount", "getTotalReactionCount", "totalShareCount", "getTotalShareCount", ShareHitPoint.f121869d, "Lcom/bytedance/lark/pb/moments/v1/Post$Type;", "getType", "()Lcom/bytedance/lark/pb/moments/v1/Post$Type;", "getUser", "()Lcom/ss/android/lark/moments/impl/commonvo/MomentsUserVM;", "clickReaction", "", "reactionKey", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/bytedance/lark/pb/moments/v1/Post;Lcom/ss/android/lark/moments/impl/commonvo/MomentsUserVM;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/ss/android/lark/moments/impl/commonvo/IMomentsPostModel;Lcom/bytedance/lark/pb/moments/v1/Category;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/ss/android/lark/moments/impl/commonvo/MomentsPostVM;", "delete", "doCopy", "context", "Landroid/content/Context;", "equals", "other", "", "getItemType", "hashCode", "isContentSame", "diffable", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "isItemSame", "markHighlight", "openReactionDetail", "parserRichText", "resend", "setNotDistributionType", "startBroadcastEditActivity", "isReEdit", "toString", "unsetBroadcast", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.commonvo.f */
public final class MomentsPostVM implements IMomentsPost {

    /* renamed from: a */
    public static final Companion f119429a = new Companion(null);

    /* renamed from: A */
    private final boolean f119430A;

    /* renamed from: B */
    private final Post f119431B;

    /* renamed from: C */
    private final MomentsUserVM f119432C;

    /* renamed from: D */
    private final List<IMomentsComment> f119433D;

    /* renamed from: E */
    private final List<ReactionDetailViewModel> f119434E;

    /* renamed from: F */
    private final Map<String, PreviewHangPoint> f119435F;

    /* renamed from: G */
    private final IMomentsPostModel f119436G;

    /* renamed from: H */
    private final Category f119437H;

    /* renamed from: I */
    private final boolean f119438I;

    /* renamed from: J */
    private final String f119439J;

    /* renamed from: K */
    private Boolean f119440K;

    /* renamed from: L */
    private Boolean f119441L;

    /* renamed from: b */
    private final String f119442b;

    /* renamed from: c */
    private final Post.PostContent f119443c;

    /* renamed from: d */
    private final RichText f119444d;

    /* renamed from: e */
    private final List<ImageSet> f119445e;

    /* renamed from: f */
    private final Media f119446f;

    /* renamed from: g */
    private final Long f119447g;

    /* renamed from: h */
    private final long f119448h;

    /* renamed from: i */
    private final String f119449i;

    /* renamed from: j */
    private final boolean f119450j;

    /* renamed from: k */
    private final boolean f119451k;

    /* renamed from: l */
    private final boolean f119452l;

    /* renamed from: m */
    private final boolean f119453m;

    /* renamed from: n */
    private final int f119454n;

    /* renamed from: o */
    private final Post.CreateStatus f119455o;

    /* renamed from: p */
    private final boolean f119456p;

    /* renamed from: q */
    private final boolean f119457q;

    /* renamed from: r */
    private final boolean f119458r;

    /* renamed from: s */
    private final boolean f119459s;

    /* renamed from: t */
    private final boolean f119460t;

    /* renamed from: u */
    private final int f119461u;

    /* renamed from: v */
    private final int f119462v;

    /* renamed from: w */
    private final boolean f119463w;

    /* renamed from: x */
    private final Post.Type f119464x;

    /* renamed from: y */
    private final IncompatibleAction f119465y;

    /* renamed from: z */
    private final Post.PostDistributionType f119466z;

    /* renamed from: a */
    public static /* synthetic */ MomentsPostVM m187537a(MomentsPostVM fVar, Post post, MomentsUserVM gVar, List list, List list2, Map map, IMomentsPostModel bVar, Category category, boolean z, String str, Boolean bool, Boolean bool2, int i, Object obj) {
        return fVar.mo166432a((i & 1) != 0 ? fVar.mo166421F() : post, (i & 2) != 0 ? fVar.mo166423H() : gVar, (i & 4) != 0 ? fVar.mo166424I() : list, (i & 8) != 0 ? fVar.mo166425J() : list2, (i & 16) != 0 ? fVar.mo166426K() : map, (i & 32) != 0 ? fVar.f119436G : bVar, (i & 64) != 0 ? fVar.mo166427L() : category, (i & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? fVar.mo166428M() : z, (i & DynamicModule.f58006b) != 0 ? fVar.mo166429N() : str, (i & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0 ? fVar.mo166430O() : bool, (i & 1024) != 0 ? fVar.mo166431P() : bool2);
    }

    /* renamed from: a */
    public final MomentsPostVM mo166432a(Post post, MomentsUserVM gVar, List<? extends IMomentsComment> list, List<? extends ReactionDetailViewModel> list2, Map<String, PreviewHangPoint> map, IMomentsPostModel bVar, Category category, boolean z, String str, Boolean bool, Boolean bool2) {
        Intrinsics.checkParameterIsNotNull(post, "post");
        Intrinsics.checkParameterIsNotNull(list2, "reactionList");
        Intrinsics.checkParameterIsNotNull(bVar, "model");
        return new MomentsPostVM(post, gVar, list, list2, map, bVar, category, z, str, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MomentsPostVM)) {
            return false;
        }
        MomentsPostVM fVar = (MomentsPostVM) obj;
        return Intrinsics.areEqual(mo166421F(), fVar.mo166421F()) && Intrinsics.areEqual(mo166423H(), fVar.mo166423H()) && Intrinsics.areEqual(mo166424I(), fVar.mo166424I()) && Intrinsics.areEqual(mo166425J(), fVar.mo166425J()) && Intrinsics.areEqual(mo166426K(), fVar.mo166426K()) && Intrinsics.areEqual(this.f119436G, fVar.f119436G) && Intrinsics.areEqual(mo166427L(), fVar.mo166427L()) && mo166428M() == fVar.mo166428M() && Intrinsics.areEqual(mo166429N(), fVar.mo166429N()) && Intrinsics.areEqual(mo166430O(), fVar.mo166430O()) && Intrinsics.areEqual(mo166431P(), fVar.mo166431P());
    }

    public int hashCode() {
        Post F = mo166421F();
        int i = 0;
        int hashCode = (F != null ? F.hashCode() : 0) * 31;
        MomentsUserVM G = mo166423H();
        int hashCode2 = (hashCode + (G != null ? G.hashCode() : 0)) * 31;
        List<IMomentsComment> I = mo166424I();
        int hashCode3 = (hashCode2 + (I != null ? I.hashCode() : 0)) * 31;
        List<ReactionDetailViewModel> J = mo166425J();
        int hashCode4 = (hashCode3 + (J != null ? J.hashCode() : 0)) * 31;
        Map<String, PreviewHangPoint> K = mo166426K();
        int hashCode5 = (hashCode4 + (K != null ? K.hashCode() : 0)) * 31;
        IMomentsPostModel bVar = this.f119436G;
        int hashCode6 = (hashCode5 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        Category L = mo166427L();
        int hashCode7 = (hashCode6 + (L != null ? L.hashCode() : 0)) * 31;
        boolean M = mo166428M();
        if (M) {
            M = true;
        }
        int i2 = M ? 1 : 0;
        int i3 = M ? 1 : 0;
        int i4 = M ? 1 : 0;
        int i5 = (hashCode7 + i2) * 31;
        String N = mo166429N();
        int hashCode8 = (i5 + (N != null ? N.hashCode() : 0)) * 31;
        Boolean O = mo166430O();
        int hashCode9 = (hashCode8 + (O != null ? O.hashCode() : 0)) * 31;
        Boolean P = mo166431P();
        if (P != null) {
            i = P.hashCode();
        }
        return hashCode9 + i;
    }

    public String toString() {
        return "MomentsPostVM(post=" + mo166421F() + ", user=" + mo166423H() + ", commentList=" + mo166424I() + ", reactionList=" + mo166425J() + ", previews=" + mo166426K() + ", model=" + this.f119436G + ", category=" + mo166427L() + ", needShowFrom=" + mo166428M() + ", errorMessage=" + mo166429N() + ", isFirstItem=" + mo166430O() + ", isLastItem=" + mo166431P() + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/moments/impl/commonvo/MomentsPostVM$Companion;", "", "()V", "KEY_REACTION_LIKE", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.commonvo.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: A */
    public boolean mo166416A() {
        return this.f119430A;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: F */
    public Post mo166421F() {
        return this.f119431B;
    }

    /* renamed from: G */
    public MomentsUserVM mo166423H() {
        return this.f119432C;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: I */
    public List<IMomentsComment> mo166424I() {
        return this.f119433D;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: J */
    public List<ReactionDetailViewModel> mo166425J() {
        return this.f119434E;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: K */
    public Map<String, PreviewHangPoint> mo166426K() {
        return this.f119435F;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: L */
    public Category mo166427L() {
        return this.f119437H;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: M */
    public boolean mo166428M() {
        return this.f119438I;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: N */
    public String mo166429N() {
        return this.f119439J;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: O */
    public Boolean mo166430O() {
        return this.f119440K;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: P */
    public Boolean mo166431P() {
        return this.f119441L;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase
    /* renamed from: a */
    public String mo166379a() {
        return this.f119442b;
    }

    /* renamed from: b */
    public Post.PostContent mo166438b() {
        return this.f119443c;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: c */
    public RichText mo166442c() {
        return this.f119444d;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: d */
    public List<ImageSet> mo166443d() {
        return this.f119445e;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: e */
    public Media mo166444e() {
        return this.f119446f;
    }

    /* renamed from: f */
    public Long mo166446f() {
        return this.f119447g;
    }

    /* renamed from: g */
    public long mo166447g() {
        return this.f119448h;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: h */
    public String mo166448h() {
        return this.f119449i;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: i */
    public boolean mo166450i() {
        return this.f119450j;
    }

    /* renamed from: j */
    public boolean mo166451j() {
        return this.f119451k;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: k */
    public boolean mo166452k() {
        return this.f119452l;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: l */
    public boolean mo166453l() {
        return this.f119453m;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: m */
    public int mo166454m() {
        return this.f119454n;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: n */
    public Post.CreateStatus mo166455n() {
        return this.f119455o;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: o */
    public boolean mo166456o() {
        return this.f119456p;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: p */
    public boolean mo166457p() {
        return this.f119457q;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: q */
    public boolean mo166458q() {
        return this.f119458r;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: r */
    public boolean mo166459r() {
        return this.f119459s;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: s */
    public boolean mo166460s() {
        return this.f119460t;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: u */
    public int mo166462u() {
        return this.f119461u;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: v */
    public int mo166463v() {
        return this.f119462v;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: w */
    public boolean mo166464w() {
        return this.f119463w;
    }

    /* renamed from: x */
    public Post.Type mo166465x() {
        return this.f119464x;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: y */
    public IncompatibleAction mo166466y() {
        return this.f119465y;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: z */
    public Post.PostDistributionType mo166467z() {
        return this.f119466z;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: B */
    public void mo166417B() {
        this.f119436G.deletePost(mo166379a());
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: C */
    public void mo166418C() {
        this.f119436G.unsetBroadcastPost(mo166379a());
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: D */
    public void mo166419D() {
        this.f119436G.resendPost(mo166379a());
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: E */
    public void mo166420E() {
        this.f119436G.setDistribution(mo166379a(), Post.PostDistributionType.NOT_DISTRIBUTION);
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase
    /* renamed from: t */
    public int mo166408t() {
        if (mo166430O() == null || mo166431P() == null) {
            return IMomentsItemBase.ItemType.ITEM_TYPE_POST.ordinal();
        }
        return IMomentsItemBase.ItemType.ITEM_TYPE_PROFILE_POST.ordinal();
    }

    /* renamed from: Q */
    private final RichText m187536Q() {
        com.bytedance.lark.pb.basic.v1.RichText richText;
        Post.PostContent b = mo166438b();
        if (b == null || (richText = b.content) == null) {
            return null;
        }
        Intrinsics.checkExpressionValueIsNotNull(richText, "postContent?.content ?: return null");
        RichText a = MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency().mo144695a(richText);
        MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency().mo144701a(a, mo166426K());
        return a;
    }

    /* renamed from: a */
    public void mo166435a(Boolean bool) {
        this.f119440K = bool;
    }

    /* renamed from: b */
    public void mo166439b(Boolean bool) {
        this.f119441L = bool;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: b */
    public void mo166440b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        this.f119436G.openReactionDetail(mo166379a(), str, mo166425J());
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: a */
    public void mo166433a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (CopyUtils.f119249a.mo166199a(context, C59035h.m229202a(mo166442c(), false, false, false, false).toString())) {
            LKUIToast.show(context, (int) R.string.Lark_Legacy_CopyReady);
        }
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: a */
    public void mo166436a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        ReactionSet reactionSet = mo166421F().reaction_set;
        if (reactionSet == null) {
            reactionSet = new ReactionSet.C18530a().mo63931a((Integer) 0).mo63932a(CollectionsKt.emptyList()).build();
        }
        IMomentsPostModel bVar = this.f119436G;
        String a = mo166379a();
        EntityType entityType = EntityType.POST;
        Intrinsics.checkExpressionValueIsNotNull(reactionSet, "reactionSet");
        Boolean bool = mo166421F().is_anonymous;
        Intrinsics.checkExpressionValueIsNotNull(bool, "post.is_anonymous");
        bVar.triggerReaction(a, entityType, str, reactionSet, bool.booleanValue());
    }

    /* renamed from: b */
    public boolean isContentSame(IMomentsItemBase iMomentsItemBase) {
        Integer num;
        Integer num2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Boolean bool;
        IncompatibleAction.Type type;
        IncompatibleAction.Type type2;
        if (!(iMomentsItemBase instanceof MomentsPostVM)) {
            return false;
        }
        MomentsPostVM fVar = (MomentsPostVM) iMomentsItemBase;
        if (!Intrinsics.areEqual(mo166442c(), fVar.mo166442c()) || !C47281d.m187236b(mo166443d(), fVar.mo166443d()) || !C47281d.m187234a(mo166444e(), fVar.mo166444e()) || !Intrinsics.areEqual(mo166448h(), fVar.mo166448h()) || mo166450i() != fVar.mo166450i() || mo166451j() != fVar.mo166451j() || mo166452k() != fVar.mo166452k() || mo166453l() != fVar.mo166453l() || mo166454m() != fVar.mo166454m() || !C26247a.m94983b(mo166423H(), fVar.mo166423H()) || !C26247a.m94982a((List) mo166424I(), (List) fVar.mo166424I()) || !Intrinsics.areEqual(mo166425J(), fVar.mo166425J()) || mo166456o() != fVar.mo166456o() || mo166457p() != fVar.mo166457p() || mo166458q() != fVar.mo166458q() || mo166459r() != fVar.mo166459r() || mo166460s() != fVar.mo166460s() || mo166455n() != fVar.mo166455n() || mo166462u() != fVar.mo166462u() || mo166467z() != fVar.mo166467z() || mo166463v() != fVar.mo166463v()) {
            return false;
        }
        IncompatibleAction y = mo166466y();
        Boolean bool2 = null;
        if (y == null || (type2 = y.type) == null) {
            num = null;
        } else {
            num = Integer.valueOf(type2.ordinal());
        }
        IncompatibleAction y2 = fVar.mo166466y();
        if (y2 == null || (type = y2.type) == null) {
            num2 = null;
        } else {
            num2 = Integer.valueOf(type.ordinal());
        }
        if (!Intrinsics.areEqual(num, num2)) {
            return false;
        }
        IncompatibleAction y3 = mo166466y();
        if (y3 != null) {
            str = y3.hint;
        } else {
            str = null;
        }
        IncompatibleAction y4 = fVar.mo166466y();
        if (y4 != null) {
            str2 = y4.hint;
        } else {
            str2 = null;
        }
        if (!Intrinsics.areEqual(str, str2) || !Intrinsics.areEqual(mo166430O(), fVar.mo166430O()) || !Intrinsics.areEqual(mo166431P(), fVar.mo166431P())) {
            return false;
        }
        Category L = mo166427L();
        if (L != null) {
            str3 = L.name;
        } else {
            str3 = null;
        }
        Category L2 = fVar.mo166427L();
        if (L2 != null) {
            str4 = L2.name;
        } else {
            str4 = null;
        }
        if (!Intrinsics.areEqual(str3, str4)) {
            return false;
        }
        Category L3 = mo166427L();
        if (L3 != null) {
            str5 = L3.icon_key;
        } else {
            str5 = null;
        }
        Category L4 = fVar.mo166427L();
        if (L4 != null) {
            str6 = L4.icon_key;
        } else {
            str6 = null;
        }
        if (!Intrinsics.areEqual(str5, str6)) {
            return false;
        }
        Category L5 = mo166427L();
        if (L5 != null) {
            bool = L5.can_read;
        } else {
            bool = null;
        }
        Category L6 = fVar.mo166427L();
        if (L6 != null) {
            bool2 = L6.can_read;
        }
        if (Intrinsics.areEqual(bool, bool2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean isItemSame(IMomentsItemBase iMomentsItemBase) {
        if (iMomentsItemBase != null && (iMomentsItemBase instanceof MomentsPostVM)) {
            if (!Intrinsics.areEqual(iMomentsItemBase.mo166379a(), mo166379a())) {
                if (mo166455n() == Post.CreateStatus.SENDING) {
                    MomentsPostVM fVar = (MomentsPostVM) iMomentsItemBase;
                    if (!Intrinsics.areEqual(mo166442c(), fVar.mo166442c()) || !C47281d.m187235a(mo166443d(), fVar.mo166443d()) || !C26247a.m94983b(mo166423H(), fVar.mo166423H()) || mo166450i() != fVar.mo166450i() || mo166465x() != fVar.mo166465x()) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost
    /* renamed from: a */
    public void mo166434a(Context context, IMomentsPost bVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "post");
        this.f119436G.startBroadcastEditActivity(context, bVar, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.lark.moments.impl.commonvo.item.a> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel> */
    /* JADX WARN: Multi-variable type inference failed */
    public MomentsPostVM(Post post, MomentsUserVM gVar, List<? extends IMomentsComment> list, List<? extends ReactionDetailViewModel> list2, Map<String, PreviewHangPoint> map, IMomentsPostModel bVar, Category category, boolean z, String str, Boolean bool, Boolean bool2) {
        List<ImageSet> list3;
        String str2;
        int i;
        Integer num;
        Integer num2;
        Long f;
        Intrinsics.checkParameterIsNotNull(post, "post");
        Intrinsics.checkParameterIsNotNull(list2, "reactionList");
        Intrinsics.checkParameterIsNotNull(bVar, "model");
        this.f119431B = post;
        this.f119432C = gVar;
        this.f119433D = list;
        this.f119434E = list2;
        this.f119435F = map;
        this.f119436G = bVar;
        this.f119437H = category;
        this.f119438I = z;
        this.f119439J = str;
        this.f119440K = bool;
        this.f119441L = bool2;
        String str3 = mo166421F().id;
        Intrinsics.checkExpressionValueIsNotNull(str3, "post.id");
        this.f119442b = str3;
        this.f119443c = mo166421F().post_content;
        this.f119444d = m187536Q();
        Post.PostContent b = mo166438b();
        Media media = null;
        if (b != null) {
            list3 = b.image_set_list;
        } else {
            list3 = null;
        }
        this.f119445e = list3;
        Post.PostContent b2 = mo166438b();
        this.f119446f = b2 != null ? b2.media : media;
        this.f119447g = mo166421F().publish_time_msec;
        Long l = mo166421F().create_time_msec;
        Intrinsics.checkExpressionValueIsNotNull(l, "post.create_time_msec");
        this.f119448h = l.longValue();
        if (mo166446f() == null || ((f = mo166446f()) != null && f.longValue() == 0)) {
            str2 = TimeLabelUtils.f119256a.mo166217a(mo166447g());
        } else {
            str2 = TimeLabelUtils.f119256a.mo166217a(mo166446f().longValue());
        }
        this.f119449i = str2;
        Boolean bool3 = mo166421F().is_anonymous;
        Intrinsics.checkExpressionValueIsNotNull(bool3, "post.is_anonymous");
        this.f119450j = bool3.booleanValue();
        Boolean bool4 = mo166421F().is_highlight;
        Intrinsics.checkExpressionValueIsNotNull(bool4, "post.is_highlight");
        this.f119451k = bool4.booleanValue();
        Boolean bool5 = mo166421F().is_broadcast;
        Intrinsics.checkExpressionValueIsNotNull(bool5, "post.is_broadcast");
        this.f119452l = bool5.booleanValue();
        Boolean bool6 = mo166421F().is_under_review;
        Intrinsics.checkExpressionValueIsNotNull(bool6, "post.is_under_review");
        this.f119453m = bool6.booleanValue();
        CommentSet commentSet = mo166421F().comment_set;
        int i2 = 0;
        if (commentSet == null || (num2 = commentSet.total_count) == null) {
            i = 0;
        } else {
            i = num2.intValue();
        }
        this.f119454n = i;
        Post.CreateStatus createStatus = mo166421F().local_status;
        Intrinsics.checkExpressionValueIsNotNull(createStatus, "post.local_status");
        this.f119455o = createStatus;
        Boolean bool7 = mo166421F().can_comment;
        Intrinsics.checkExpressionValueIsNotNull(bool7, "post.can_comment");
        this.f119456p = bool7.booleanValue();
        Boolean bool8 = mo166421F().can_reaction;
        Intrinsics.checkExpressionValueIsNotNull(bool8, "post.can_reaction");
        this.f119457q = bool8.booleanValue();
        Boolean bool9 = mo166421F().can_report;
        Intrinsics.checkExpressionValueIsNotNull(bool9, "post.can_report");
        this.f119458r = bool9.booleanValue();
        Boolean bool10 = mo166421F().can_delete;
        Intrinsics.checkExpressionValueIsNotNull(bool10, "post.can_delete");
        this.f119459s = bool10.booleanValue();
        Boolean bool11 = mo166421F().can_administrate;
        Intrinsics.checkExpressionValueIsNotNull(bool11, "post.can_administrate");
        this.f119460t = bool11.booleanValue();
        ReactionSet reactionSet = mo166421F().reaction_set;
        if (!(reactionSet == null || (num = reactionSet.total_count) == null)) {
            i2 = num.intValue();
        }
        this.f119461u = i2;
        Integer num3 = mo166421F().share_count;
        Intrinsics.checkExpressionValueIsNotNull(num3, "post.share_count");
        this.f119462v = num3.intValue();
        Boolean bool12 = mo166421F().is_self_owner;
        Intrinsics.checkExpressionValueIsNotNull(bool12, "post.is_self_owner");
        this.f119463w = bool12.booleanValue();
        Post.Type type = mo166421F().type;
        Intrinsics.checkExpressionValueIsNotNull(type, "post.type");
        this.f119464x = type;
        this.f119465y = mo166421F().incompatible_action;
        Post.PostDistributionType postDistributionType = mo166421F().distribution_type;
        Intrinsics.checkExpressionValueIsNotNull(postDistributionType, "post.distribution_type");
        this.f119466z = postDistributionType;
        this.f119430A = ReactionUtils.f119254a.mo166214a(mo166421F().reaction_set, "THUMBSUP");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MomentsPostVM(com.bytedance.lark.pb.moments.v1.Post r16, com.ss.android.lark.moments.impl.commonvo.MomentsUserVM r17, java.util.List r18, java.util.List r19, java.util.Map r20, com.ss.android.lark.moments.impl.commonvo.IMomentsPostModel r21, com.bytedance.lark.pb.moments.v1.Category r22, boolean r23, java.lang.String r24, java.lang.Boolean r25, java.lang.Boolean r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r15 = this;
            r0 = r27
            r1 = r0 & 256(0x100, float:3.59E-43)
            r2 = 0
            if (r1 == 0) goto L_0x000c
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1
            r12 = r1
            goto L_0x000e
        L_0x000c:
            r12 = r24
        L_0x000e:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0017
            r1 = r2
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r13 = r1
            goto L_0x0019
        L_0x0017:
            r13 = r25
        L_0x0019:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0022
            r0 = r2
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r14 = r0
            goto L_0x0024
        L_0x0022:
            r14 = r26
        L_0x0024:
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.commonvo.MomentsPostVM.<init>(com.bytedance.lark.pb.moments.v1.Post, com.ss.android.lark.moments.impl.commonvo.g, java.util.List, java.util.List, java.util.Map, com.ss.android.lark.moments.impl.commonvo.b, com.bytedance.lark.pb.moments.v1.Category, boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
