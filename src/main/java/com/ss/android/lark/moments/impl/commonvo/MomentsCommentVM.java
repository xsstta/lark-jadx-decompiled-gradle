package com.ss.android.lark.moments.impl.commonvo;

import android.content.Context;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.moments.v1.Comment;
import com.bytedance.lark.pb.moments.v1.EntityType;
import com.bytedance.lark.pb.moments.v1.IncompatibleAction;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.bytedance.lark.pb.moments.v1.ReactionSet;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.impl.common.utils.C47281d;
import com.ss.android.lark.moments.impl.common.utils.CopyUtils;
import com.ss.android.lark.moments.impl.common.utils.ReactionUtils;
import com.ss.android.lark.moments.impl.common.utils.TimeLabelUtils;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u0000 |2\u00020\u0001:\u0001|B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u0016J\u0010\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\u000bH\u0016J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0017\u0010d\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u000eHÂ\u0003J\t\u0010f\u001a\u00020\u0010HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010i\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003J\u0001\u0010j\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\b\u0010k\u001a\u00020^H\u0016J\u0010\u0010l\u001a\u00020^2\u0006\u0010m\u001a\u00020nH\u0016J\u0013\u0010o\u001a\u00020\u00102\b\u0010p\u001a\u0004\u0018\u00010qHÖ\u0003J\b\u0010r\u001a\u00020XH\u0016J\t\u0010s\u001a\u00020XHÖ\u0001J\u0012\u0010t\u001a\u00020\u00102\b\u0010u\u001a\u0004\u0018\u00010vH\u0016J\u0012\u0010w\u001a\u00020\u00102\b\u0010u\u001a\u0004\u0018\u00010vH\u0016J\u0010\u0010x\u001a\u00020^2\u0006\u0010_\u001a\u00020\u000bH\u0016J\n\u0010y\u001a\u0004\u0018\u00010#H\u0002J\b\u0010z\u001a\u00020^H\u0016J\t\u0010{\u001a\u00020\u000bHÖ\u0001R\u0014\u0010\u0017\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\"\u001a\u0004\u0018\u00010#X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020'X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0019R\u0014\u0010.\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0016\u00100\u001a\u0004\u0018\u000101X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u00104\u001a\u0004\u0018\u000105X\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0019R\u0014\u00109\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0019R\u0014\u0010:\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0019R\u0014\u0010;\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0019R\u0014\u0010<\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0019R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0004¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010'X\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\bB\u0010CR\u0014\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\u0019R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010!\"\u0004\bI\u0010JR(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010>\"\u0004\bL\u0010@R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020RX\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010+R\u0014\u0010W\u001a\u00020XX\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\¨\u0006}"}, d2 = {"Lcom/ss/android/lark/moments/impl/commonvo/MomentsCommentVM;", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsComment;", Comment.f24093e, "Lcom/bytedance/lark/pb/moments/v1/Comment;", "user", "Lcom/ss/android/lark/moments/impl/commonvo/MomentsUserVM;", "reactionList", "", "Lcom/ss/android/lark/reaction/widget/detailwindow/bean/ReactionDetailViewModel;", "previews", "", "", "Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;", "model", "Lcom/ss/android/lark/moments/impl/commonvo/IMomentsCommentModel;", "reactionAnonymous", "", "replyCommentSender", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "replyComment", "replyCommentPreview", "errorMessage", "(Lcom/bytedance/lark/pb/moments/v1/Comment;Lcom/ss/android/lark/moments/impl/commonvo/MomentsUserVM;Ljava/util/List;Ljava/util/Map;Lcom/ss/android/lark/moments/impl/commonvo/IMomentsCommentModel;ZLcom/bytedance/lark/pb/moments/v1/MomentUser;Lcom/bytedance/lark/pb/moments/v1/Comment;Ljava/util/Map;Ljava/lang/String;)V", "canComment", "getCanComment", "()Z", "canDelete", "getCanDelete", "canReaction", "getCanReaction", "canReport", "getCanReport", "getComment", "()Lcom/bytedance/lark/pb/moments/v1/Comment;", "content", "Lcom/ss/android/lark/widget/richtext/RichText;", "getContent", "()Lcom/ss/android/lark/widget/richtext/RichText;", "createTimeMillis", "", "getCreateTimeMillis", "()J", "getErrorMessage", "()Ljava/lang/String;", "hasLikeReaction", "getHasLikeReaction", "id", "getId", "imageSet", "Lcom/bytedance/lark/pb/basic/v1/ImageSet;", "getImageSet", "()Lcom/bytedance/lark/pb/basic/v1/ImageSet;", "incompatibleAction", "Lcom/bytedance/lark/pb/moments/v1/IncompatibleAction;", "getIncompatibleAction", "()Lcom/bytedance/lark/pb/moments/v1/IncompatibleAction;", "isAnonymous", "isDeleted", "isHot", "isSelfOwner", "isUnderReview", "getPreviews", "()Ljava/util/Map;", "setPreviews", "(Ljava/util/Map;)V", "publishTimeMillis", "getPublishTimeMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getReactionAnonymous", "getReactionList", "()Ljava/util/List;", "getReplyComment", "setReplyComment", "(Lcom/bytedance/lark/pb/moments/v1/Comment;)V", "getReplyCommentPreview", "setReplyCommentPreview", "getReplyCommentSender", "()Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "setReplyCommentSender", "(Lcom/bytedance/lark/pb/moments/v1/MomentUser;)V", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/moments/v1/Comment$CreateStatus;", "getStatus", "()Lcom/bytedance/lark/pb/moments/v1/Comment$CreateStatus;", "timeLabelText", "getTimeLabelText", "totalReactionCount", "", "getTotalReactionCount", "()I", "getUser", "()Lcom/ss/android/lark/moments/impl/commonvo/MomentsUserVM;", "clickReaction", "", "reactionKey", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "delete", "doCopy", "context", "Landroid/content/Context;", "equals", "other", "", "getItemType", "hashCode", "isContentSame", "diffable", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "isItemSame", "openReactionDetail", "parserRichText", "resend", "toString", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.commonvo.e */
public final class MomentsCommentVM implements IMomentsComment {

    /* renamed from: a */
    public static final Companion f119399a = new Companion(null);

    /* renamed from: A */
    private MomentUser f119400A;

    /* renamed from: B */
    private com.bytedance.lark.pb.moments.v1.Comment f119401B;

    /* renamed from: C */
    private Map<String, PreviewHangPoint> f119402C;

    /* renamed from: D */
    private final String f119403D;

    /* renamed from: b */
    private final String f119404b;

    /* renamed from: c */
    private final RichText f119405c;

    /* renamed from: d */
    private final ImageSet f119406d;

    /* renamed from: e */
    private final Long f119407e;

    /* renamed from: f */
    private final long f119408f;

    /* renamed from: g */
    private final String f119409g;

    /* renamed from: h */
    private final boolean f119410h;

    /* renamed from: i */
    private final boolean f119411i;

    /* renamed from: j */
    private final boolean f119412j;

    /* renamed from: k */
    private final boolean f119413k;

    /* renamed from: l */
    private final boolean f119414l;

    /* renamed from: m */
    private final boolean f119415m;

    /* renamed from: n */
    private final boolean f119416n;

    /* renamed from: o */
    private final boolean f119417o;

    /* renamed from: p */
    private final boolean f119418p;

    /* renamed from: q */
    private final int f119419q;

    /* renamed from: r */
    private final IncompatibleAction f119420r;

    /* renamed from: s */
    private final Comment.CreateStatus f119421s;

    /* renamed from: t */
    private final boolean f119422t;

    /* renamed from: u */
    private final com.bytedance.lark.pb.moments.v1.Comment f119423u;

    /* renamed from: v */
    private final MomentsUserVM f119424v;

    /* renamed from: w */
    private final List<ReactionDetailViewModel> f119425w;

    /* renamed from: x */
    private Map<String, PreviewHangPoint> f119426x;

    /* renamed from: y */
    private final IMomentsCommentModel f119427y;

    /* renamed from: z */
    private final boolean f119428z;

    /* renamed from: a */
    public static /* synthetic */ MomentsCommentVM m187494a(MomentsCommentVM eVar, com.bytedance.lark.pb.moments.v1.Comment comment, MomentsUserVM gVar, List list, Map map, IMomentsCommentModel aVar, boolean z, MomentUser momentUser, com.bytedance.lark.pb.moments.v1.Comment comment2, Map map2, String str, int i, Object obj) {
        return eVar.mo166378a((i & 1) != 0 ? eVar.mo166412w() : comment, (i & 2) != 0 ? eVar.mo166414y() : gVar, (i & 4) != 0 ? eVar.mo166415z() : list, (i & 8) != 0 ? eVar.mo166372A() : map, (i & 16) != 0 ? eVar.f119427y : aVar, (i & 32) != 0 ? eVar.mo166373B() : z, (i & 64) != 0 ? eVar.mo166374C() : momentUser, (i & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? eVar.mo166375D() : comment2, (i & DynamicModule.f58006b) != 0 ? eVar.mo166376E() : map2, (i & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0 ? eVar.mo166377F() : str);
    }

    /* renamed from: a */
    public final MomentsCommentVM mo166378a(com.bytedance.lark.pb.moments.v1.Comment comment, MomentsUserVM gVar, List<? extends ReactionDetailViewModel> list, Map<String, PreviewHangPoint> map, IMomentsCommentModel aVar, boolean z, MomentUser momentUser, com.bytedance.lark.pb.moments.v1.Comment comment2, Map<String, PreviewHangPoint> map2, String str) {
        Intrinsics.checkParameterIsNotNull(comment, com.bytedance.ee.bear.middleground.comment.Comment.f24093e);
        Intrinsics.checkParameterIsNotNull(list, "reactionList");
        return new MomentsCommentVM(comment, gVar, list, map, aVar, z, momentUser, comment2, map2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MomentsCommentVM)) {
            return false;
        }
        MomentsCommentVM eVar = (MomentsCommentVM) obj;
        return Intrinsics.areEqual(mo166412w(), eVar.mo166412w()) && Intrinsics.areEqual(mo166414y(), eVar.mo166414y()) && Intrinsics.areEqual(mo166415z(), eVar.mo166415z()) && Intrinsics.areEqual(mo166372A(), eVar.mo166372A()) && Intrinsics.areEqual(this.f119427y, eVar.f119427y) && mo166373B() == eVar.mo166373B() && Intrinsics.areEqual(mo166374C(), eVar.mo166374C()) && Intrinsics.areEqual(mo166375D(), eVar.mo166375D()) && Intrinsics.areEqual(mo166376E(), eVar.mo166376E()) && Intrinsics.areEqual(mo166377F(), eVar.mo166377F());
    }

    public int hashCode() {
        com.bytedance.lark.pb.moments.v1.Comment w = mo166412w();
        int i = 0;
        int hashCode = (w != null ? w.hashCode() : 0) * 31;
        MomentsUserVM x = mo166414y();
        int hashCode2 = (hashCode + (x != null ? x.hashCode() : 0)) * 31;
        List<ReactionDetailViewModel> z = mo166415z();
        int hashCode3 = (hashCode2 + (z != null ? z.hashCode() : 0)) * 31;
        Map<String, PreviewHangPoint> A = mo166372A();
        int hashCode4 = (hashCode3 + (A != null ? A.hashCode() : 0)) * 31;
        IMomentsCommentModel aVar = this.f119427y;
        int hashCode5 = (hashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        boolean B = mo166373B();
        if (B) {
            B = true;
        }
        int i2 = B ? 1 : 0;
        int i3 = B ? 1 : 0;
        int i4 = B ? 1 : 0;
        int i5 = (hashCode5 + i2) * 31;
        MomentUser C = mo166374C();
        int hashCode6 = (i5 + (C != null ? C.hashCode() : 0)) * 31;
        com.bytedance.lark.pb.moments.v1.Comment D = mo166375D();
        int hashCode7 = (hashCode6 + (D != null ? D.hashCode() : 0)) * 31;
        Map<String, PreviewHangPoint> E = mo166376E();
        int hashCode8 = (hashCode7 + (E != null ? E.hashCode() : 0)) * 31;
        String F = mo166377F();
        if (F != null) {
            i = F.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        return "MomentsCommentVM(comment=" + mo166412w() + ", user=" + mo166414y() + ", reactionList=" + mo166415z() + ", previews=" + mo166372A() + ", model=" + this.f119427y + ", reactionAnonymous=" + mo166373B() + ", replyCommentSender=" + mo166374C() + ", replyComment=" + mo166375D() + ", replyCommentPreview=" + mo166376E() + ", errorMessage=" + mo166377F() + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/moments/impl/commonvo/MomentsCommentVM$Companion;", "", "()V", "KEY_REACTION_LIKE", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.commonvo.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: A */
    public Map<String, PreviewHangPoint> mo166372A() {
        return this.f119426x;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: B */
    public boolean mo166373B() {
        return this.f119428z;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: C */
    public MomentUser mo166374C() {
        return this.f119400A;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: D */
    public com.bytedance.lark.pb.moments.v1.Comment mo166375D() {
        return this.f119401B;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: E */
    public Map<String, PreviewHangPoint> mo166376E() {
        return this.f119402C;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: F */
    public String mo166377F() {
        return this.f119403D;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase
    /* renamed from: a */
    public String mo166379a() {
        return this.f119404b;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: b */
    public RichText mo166386b() {
        return this.f119405c;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: c */
    public ImageSet mo166389c() {
        return this.f119406d;
    }

    /* renamed from: d */
    public Long mo166390d() {
        return this.f119407e;
    }

    /* renamed from: e */
    public long mo166391e() {
        return this.f119408f;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: f */
    public String mo166393f() {
        return this.f119409g;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: g */
    public boolean mo166394g() {
        return this.f119410h;
    }

    /* renamed from: h */
    public boolean mo166395h() {
        return this.f119411i;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: i */
    public boolean mo166397i() {
        return this.f119412j;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: j */
    public boolean mo166398j() {
        return this.f119413k;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: k */
    public boolean mo166399k() {
        return this.f119414l;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: l */
    public boolean mo166400l() {
        return this.f119415m;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: m */
    public boolean mo166401m() {
        return this.f119416n;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: n */
    public boolean mo166402n() {
        return this.f119417o;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: o */
    public boolean mo166403o() {
        return this.f119418p;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: p */
    public int mo166404p() {
        return this.f119419q;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: q */
    public IncompatibleAction mo166405q() {
        return this.f119420r;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: r */
    public Comment.CreateStatus mo166406r() {
        return this.f119421s;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: s */
    public boolean mo166407s() {
        return this.f119422t;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: w */
    public com.bytedance.lark.pb.moments.v1.Comment mo166412w() {
        return this.f119423u;
    }

    /* renamed from: x */
    public MomentsUserVM mo166414y() {
        return this.f119424v;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: z */
    public List<ReactionDetailViewModel> mo166415z() {
        return this.f119425w;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase
    /* renamed from: t */
    public int mo166408t() {
        return IMomentsItemBase.ItemType.ITEM_TYPE_DETAIL_COMMENT.ordinal();
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: u */
    public void mo166410u() {
        IMomentsCommentModel aVar = this.f119427y;
        if (aVar != null) {
            aVar.deleteComment(mo166379a());
        }
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: v */
    public void mo166411v() {
        IMomentsCommentModel aVar = this.f119427y;
        if (aVar != null) {
            aVar.resendComment(mo166379a());
        }
    }

    /* renamed from: G */
    private final RichText m187493G() {
        com.bytedance.lark.pb.basic.v1.RichText richText;
        Comment.CommentContent commentContent = mo166412w().content;
        if (commentContent == null || (richText = commentContent.content) == null) {
            return null;
        }
        Intrinsics.checkExpressionValueIsNotNull(richText, "comment.content?.content ?: return null");
        RichText a = MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency().mo144695a(richText);
        MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency().mo144701a(a, mo166372A());
        return a;
    }

    /* renamed from: a */
    public void mo166381a(com.bytedance.lark.pb.moments.v1.Comment comment) {
        this.f119401B = comment;
    }

    /* renamed from: a */
    public void mo166382a(MomentUser momentUser) {
        this.f119400A = momentUser;
    }

    /* renamed from: a */
    public void mo166384a(Map<String, PreviewHangPoint> map) {
        this.f119402C = map;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: b */
    public void mo166387b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        IMomentsCommentModel aVar = this.f119427y;
        if (aVar != null) {
            aVar.openReactionDetail(mo166379a(), str, mo166415z());
        }
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: a */
    public void mo166380a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (CopyUtils.f119249a.mo166199a(context, C59035h.m229202a(mo166386b(), false, false, false, false).toString())) {
            LKUIToast.show(context, (int) R.string.Lark_Legacy_CopyReady);
        }
    }

    /* renamed from: b */
    public boolean isContentSame(IMomentsItemBase iMomentsItemBase) {
        if (!(iMomentsItemBase instanceof MomentsCommentVM)) {
            return false;
        }
        MomentsCommentVM eVar = (MomentsCommentVM) iMomentsItemBase;
        if (Intrinsics.areEqual(mo166386b(), eVar.mo166386b()) && C47281d.m187233a(mo166389c(), eVar.mo166389c()) && C26247a.m94983b(mo166414y(), eVar.mo166414y()) && Intrinsics.areEqual(mo166393f(), eVar.mo166393f()) && Intrinsics.areEqual(mo166415z(), eVar.mo166415z()) && mo166394g() == eVar.mo166394g() && mo166395h() == eVar.mo166395h() && mo166397i() == eVar.mo166397i() && mo166398j() == eVar.mo166398j() && mo166399k() == eVar.mo166399k() && mo166400l() == eVar.mo166400l() && mo166401m() == eVar.mo166401m() && mo166406r() == eVar.mo166406r() && mo166402n() == eVar.mo166402n() && Intrinsics.areEqual(mo166375D(), eVar.mo166375D())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment
    /* renamed from: a */
    public void mo166383a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        ReactionSet reactionSet = mo166412w().reaction_set;
        if (reactionSet == null) {
            reactionSet = new ReactionSet.C18530a().mo63931a((Integer) 0).mo63932a(CollectionsKt.emptyList()).build();
        }
        IMomentsCommentModel aVar = this.f119427y;
        if (aVar != null) {
            String a = mo166379a();
            EntityType entityType = EntityType.COMMENT;
            Intrinsics.checkExpressionValueIsNotNull(reactionSet, "reactionSet");
            aVar.triggerReaction(a, entityType, str, reactionSet, mo166373B());
        }
    }

    /* renamed from: a */
    public boolean isItemSame(IMomentsItemBase iMomentsItemBase) {
        String str;
        if (iMomentsItemBase != null && (iMomentsItemBase instanceof MomentsCommentVM)) {
            if (!Intrinsics.areEqual(iMomentsItemBase.mo166379a(), mo166379a())) {
                if (mo166406r() == Comment.CreateStatus.SENDING) {
                    MomentsCommentVM eVar = (MomentsCommentVM) iMomentsItemBase;
                    if (Intrinsics.areEqual(mo166386b(), eVar.mo166386b())) {
                        ImageSet c = mo166389c();
                        String str2 = null;
                        if (c != null) {
                            str = c.key;
                        } else {
                            str = null;
                        }
                        ImageSet c2 = eVar.mo166389c();
                        if (c2 != null) {
                            str2 = c2.key;
                        }
                        if (!Intrinsics.areEqual(str, str2) || !C26247a.m94983b(mo166414y(), eVar.mo166414y()) || mo166394g() != eVar.mo166394g() || !Intrinsics.areEqual(mo166375D(), eVar.mo166375D())) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel> */
    /* JADX WARN: Multi-variable type inference failed */
    public MomentsCommentVM(com.bytedance.lark.pb.moments.v1.Comment comment, MomentsUserVM gVar, List<? extends ReactionDetailViewModel> list, Map<String, PreviewHangPoint> map, IMomentsCommentModel aVar, boolean z, MomentUser momentUser, com.bytedance.lark.pb.moments.v1.Comment comment2, Map<String, PreviewHangPoint> map2, String str) {
        ImageSet imageSet;
        String str2;
        int i;
        Integer num;
        Long d;
        Intrinsics.checkParameterIsNotNull(comment, com.bytedance.ee.bear.middleground.comment.Comment.f24093e);
        Intrinsics.checkParameterIsNotNull(list, "reactionList");
        this.f119423u = comment;
        this.f119424v = gVar;
        this.f119425w = list;
        this.f119426x = map;
        this.f119427y = aVar;
        this.f119428z = z;
        this.f119400A = momentUser;
        this.f119401B = comment2;
        this.f119402C = map2;
        this.f119403D = str;
        String str3 = mo166412w().id;
        Intrinsics.checkExpressionValueIsNotNull(str3, "comment.id");
        this.f119404b = str3;
        this.f119405c = m187493G();
        Comment.CommentContent commentContent = mo166412w().content;
        if (commentContent != null) {
            imageSet = commentContent.image_set;
        } else {
            imageSet = null;
        }
        this.f119406d = imageSet;
        this.f119407e = mo166412w().publish_time_msec;
        Long l = mo166412w().create_time_msec;
        Intrinsics.checkExpressionValueIsNotNull(l, "comment.create_time_msec");
        this.f119408f = l.longValue();
        if (mo166390d() == null || ((d = mo166390d()) != null && d.longValue() == 0)) {
            str2 = TimeLabelUtils.f119256a.mo166217a(mo166391e());
        } else {
            str2 = TimeLabelUtils.f119256a.mo166217a(mo166390d().longValue());
        }
        this.f119409g = str2;
        Boolean bool = mo166412w().is_anonymous;
        Intrinsics.checkExpressionValueIsNotNull(bool, "comment.is_anonymous");
        this.f119410h = bool.booleanValue();
        Boolean bool2 = mo166412w().is_under_review;
        Intrinsics.checkExpressionValueIsNotNull(bool2, "comment.is_under_review");
        this.f119411i = bool2.booleanValue();
        Boolean bool3 = mo166412w().is_hot;
        Intrinsics.checkExpressionValueIsNotNull(bool3, "comment.is_hot");
        this.f119412j = bool3.booleanValue();
        Boolean bool4 = mo166412w().can_comment;
        Intrinsics.checkExpressionValueIsNotNull(bool4, "comment.can_comment");
        this.f119413k = bool4.booleanValue();
        Boolean bool5 = mo166412w().can_reaction;
        Intrinsics.checkExpressionValueIsNotNull(bool5, "comment.can_reaction");
        this.f119414l = bool5.booleanValue();
        Boolean bool6 = mo166412w().can_report;
        Intrinsics.checkExpressionValueIsNotNull(bool6, "comment.can_report");
        this.f119415m = bool6.booleanValue();
        Boolean bool7 = mo166412w().can_delete;
        Intrinsics.checkExpressionValueIsNotNull(bool7, "comment.can_delete");
        this.f119416n = bool7.booleanValue();
        Boolean bool8 = mo166412w().is_deleted;
        Intrinsics.checkExpressionValueIsNotNull(bool8, "comment.is_deleted");
        this.f119417o = bool8.booleanValue();
        Boolean bool9 = mo166412w().is_self_owner;
        Intrinsics.checkExpressionValueIsNotNull(bool9, "comment.is_self_owner");
        this.f119418p = bool9.booleanValue();
        ReactionSet reactionSet = mo166412w().reaction_set;
        if (reactionSet == null || (num = reactionSet.total_count) == null) {
            i = 0;
        } else {
            i = num.intValue();
        }
        this.f119419q = i;
        this.f119420r = mo166412w().incompatible_action;
        Comment.CreateStatus createStatus = mo166412w().local_status;
        Intrinsics.checkExpressionValueIsNotNull(createStatus, "comment.local_status");
        this.f119421s = createStatus;
        this.f119422t = ReactionUtils.f119254a.mo166214a(mo166412w().reaction_set, "THUMBSUP");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MomentsCommentVM(com.bytedance.lark.pb.moments.v1.Comment r15, com.ss.android.lark.moments.impl.commonvo.MomentsUserVM r16, java.util.List r17, java.util.Map r18, com.ss.android.lark.moments.impl.commonvo.IMomentsCommentModel r19, boolean r20, com.bytedance.lark.pb.moments.v1.MomentUser r21, com.bytedance.lark.pb.moments.v1.Comment r22, java.util.Map r23, java.lang.String r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x000c
            r1 = r2
            com.bytedance.lark.pb.moments.v1.MomentUser r1 = (com.bytedance.lark.pb.moments.v1.MomentUser) r1
            r10 = r1
            goto L_0x000e
        L_0x000c:
            r10 = r21
        L_0x000e:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0017
            r1 = r2
            com.bytedance.lark.pb.moments.v1.Comment r1 = (com.bytedance.lark.pb.moments.v1.Comment) r1
            r11 = r1
            goto L_0x0019
        L_0x0017:
            r11 = r22
        L_0x0019:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0022
            r1 = r2
            java.util.Map r1 = (java.util.Map) r1
            r12 = r1
            goto L_0x0024
        L_0x0022:
            r12 = r23
        L_0x0024:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x002d
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0
            r13 = r0
            goto L_0x002f
        L_0x002d:
            r13 = r24
        L_0x002f:
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.commonvo.MomentsCommentVM.<init>(com.bytedance.lark.pb.moments.v1.Comment, com.ss.android.lark.moments.impl.commonvo.g, java.util.List, java.util.Map, com.ss.android.lark.moments.impl.commonvo.a, boolean, com.bytedance.lark.pb.moments.v1.MomentUser, com.bytedance.lark.pb.moments.v1.Comment, java.util.Map, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
