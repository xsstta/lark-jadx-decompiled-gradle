package com.bytedance.ee.bear.middleground.comment.adapter;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.facade.common.widget.C7727a;
import com.bytedance.ee.bear.middleground.comment.C9185d;
import com.bytedance.ee.bear.middleground.comment.control.ICommentFunction;
import com.bytedance.ee.bear.middleground.comment.control.ICommentListeners;
import com.bytedance.ee.bear.middleground.comment.export.ICardAdapter;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.ErrorBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.Reaction;
import com.bytedance.ee.bear.middleground.comment.export.bean.ReactionDetailUserInfo;
import com.bytedance.ee.bear.middleground.comment.p443a.C8969a;
import com.bytedance.ee.bear.middleground.comment.p445c.AbstractC9106c;
import com.bytedance.ee.bear.middleground.comment.translate.CommentTranslate;
import com.bytedance.ee.bear.middleground.comment.uitls.Config;
import com.bytedance.ee.bear.middleground.comment.widget.CommentTextView;
import com.bytedance.ee.bear.middleground.comment.widget.RichTextInjector;
import com.bytedance.ee.bear.p513o.AbstractC10365a;
import com.bytedance.ee.bear.p519p.AbstractC10460a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p717s.C13723a;
import com.bytedance.ee.util.p718t.C13749l;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout;
import com.ss.android.lark.reaction.widget.flowlayout.ReactionFlowLayout;
import com.ss.android.lark.reaction.widget.flowlayout.p2562a.C53061a;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\f\u0018\u0000 M2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002MNBE\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\u0010\u0012J \u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0015H\u0002J\u0010\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020%H\u0002J\u0010\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020+H\u0016J\u001a\u0010,\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010.\u0012\u0006\u0012\u0004\u0018\u00010.\u0018\u00010-H\u0016J\u0010\u0010/\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0015H\u0016J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\b\u00101\u001a\u00020+H\u0016J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u00103\u001a\u00020\u0007H\u0016J\n\u00104\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00022\u0006\u0010*\u001a\u00020+H\u0017J&\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00022\u0006\u0010*\u001a\u00020+2\f\u00107\u001a\b\u0012\u0004\u0012\u00020.0\u0014H\u0016J\u0018\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020:2\u0006\u0010*\u001a\u00020+H\u0016J\u0018\u0010;\u001a\u00020\u00112\u0006\u0010<\u001a\u00020+2\u0006\u0010=\u001a\u00020+H\u0016J\u0018\u0010>\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00152\u0006\u0010?\u001a\u00020%H\u0002J\u0018\u0010@\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0015H\u0002J\u0016\u0010A\u001a\u00020\u00112\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00150CH\u0016J\u0018\u0010D\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0015H\u0002J\u0018\u0010E\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0015H\u0003J\u0018\u0010F\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u0015H\u0002J\u0018\u0010H\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0015H\u0002J\u0018\u0010I\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00152\u0006\u00106\u001a\u00020\u0002H\u0002J\u0018\u0010J\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0015H\u0002J\u0018\u0010K\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0015H\u0002J\u0010\u0010L\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0015H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u000e\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/adapter/CardAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/middleground/comment/adapter/CardAdapter$ViewHolder;", "Lcom/bytedance/ee/bear/middleground/comment/export/ICardAdapter;", "config", "Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;", "language", "", "userId", "commentListeners", "Lcom/bytedance/ee/bear/middleground/comment/control/ICommentListeners;", "actionControl", "Lcom/bytedance/ee/bear/middleground/comment/control/ICommentFunction;", "isEditStatus", "", "clickLink", "Lkotlin/Function0;", "", "(Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/ee/bear/middleground/comment/control/ICommentListeners;Lcom/bytedance/ee/bear/middleground/comment/control/ICommentFunction;ZLkotlin/jvm/functions/Function0;)V", "commentRecord", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail;", "parentToken", "getParentToken", "()Ljava/lang/String;", "setParentToken", "(Ljava/lang/String;)V", "parentType", "getParentType", "setParentType", "quote", "getQuote", "setQuote", "adjustPosition", "textView", "Landroid/widget/TextView;", "tran", "Landroid/view/View;", "item", "adjustTouchArea", "view", "findReplyIdByPosition", "position", "", "getBizParam", "", "", "getCommentId", "getData", "getItemCount", "getLast3Item", "replyId", "getPostion", "onBindViewHolder", "holder", "payloads", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "onItemVisible", "first", "last", "retry", "retryView", "setContent", "setData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "setLoaddingStatus", "setMore", "setReaction", "commentDetail", "setRetryView", "setTime", "setTranslateContent", "setTranslateIcon", "shouldHideDeleteButton", "Companion", "ViewHolder", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CardAdapter extends RecyclerView.Adapter<ViewHolder> implements ICardAdapter {
    public static final Companion Companion = new Companion(null);
    public final ICommentFunction actionControl;
    public final Function0<Unit> clickLink;
    public final ICommentListeners commentListeners;
    private List<CommentBean.CommentDetail> commentRecord;
    public final Config config;
    private final boolean isEditStatus;
    private final String language;
    private String parentToken;
    private String parentType;
    private String quote;
    private final String userId;

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICardAdapter
    public Map<Object, Object> getBizParam() {
        return null;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICardAdapter
    public String getPostion() {
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/adapter/CardAdapter$Companion;", "", "()V", "CONTAINS_VALUE", "", "REACTION", "", "SENDINGSTATUS", "TAG", "TEXT", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0011\u0010 \u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013R\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u000fR\u0011\u0010(\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/adapter/CardAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "commentFailImg", "getCommentFailImg", "()Landroid/view/View;", "commentLoading", "Lcom/airbnb/lottie/LottieAnimationView;", "getCommentLoading", "()Lcom/airbnb/lottie/LottieAnimationView;", "content", "Lcom/bytedance/ee/bear/middleground/comment/widget/CommentTextView;", "getContent", "()Lcom/bytedance/ee/bear/middleground/comment/widget/CommentTextView;", "crateTime", "Landroid/widget/TextView;", "getCrateTime", "()Landroid/widget/TextView;", "deleteComment", "getDeleteComment", "more", "getMore", "name", "getName", "reactionFlowLayout", "Lcom/ss/android/lark/reaction/widget/flowlayout/ReactionFlowLayout;", "getReactionFlowLayout", "()Lcom/ss/android/lark/reaction/widget/flowlayout/ReactionFlowLayout;", "retry", "getRetry", "sendFailTv", "getSendFailTv", "translate", "Lcom/bytedance/ee/bear/facade/common/widget/BearLottieView;", "getTranslate", "()Lcom/bytedance/ee/bear/facade/common/widget/BearLottieView;", "translateContent", "getTranslateContent", "userImg", "Landroid/widget/ImageView;", "getUserImg", "()Landroid/widget/ImageView;", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter$b */
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final CommentTextView f24195a;

        /* renamed from: b */
        private final BearLottieView f24196b;

        /* renamed from: c */
        private final ImageView f24197c;

        /* renamed from: d */
        private final TextView f24198d;

        /* renamed from: e */
        private final TextView f24199e;

        /* renamed from: f */
        private final CommentTextView f24200f;

        /* renamed from: g */
        private final View f24201g;

        /* renamed from: h */
        private final ReactionFlowLayout f24202h;

        /* renamed from: i */
        private final LottieAnimationView f24203i;

        /* renamed from: j */
        private final View f24204j;

        /* renamed from: k */
        private final View f24205k;

        /* renamed from: l */
        private final TextView f24206l;

        /* renamed from: m */
        private final View f24207m;

        /* renamed from: a */
        public final CommentTextView mo34446a() {
            return this.f24195a;
        }

        /* renamed from: b */
        public final BearLottieView mo34447b() {
            return this.f24196b;
        }

        /* renamed from: c */
        public final ImageView mo34448c() {
            return this.f24197c;
        }

        /* renamed from: d */
        public final TextView mo34449d() {
            return this.f24198d;
        }

        /* renamed from: e */
        public final TextView mo34450e() {
            return this.f24199e;
        }

        /* renamed from: f */
        public final CommentTextView mo34451f() {
            return this.f24200f;
        }

        /* renamed from: g */
        public final View mo34452g() {
            return this.f24201g;
        }

        /* renamed from: h */
        public final ReactionFlowLayout mo34453h() {
            return this.f24202h;
        }

        /* renamed from: i */
        public final LottieAnimationView mo34454i() {
            return this.f24203i;
        }

        /* renamed from: j */
        public final View mo34455j() {
            return this.f24204j;
        }

        /* renamed from: k */
        public final View mo34456k() {
            return this.f24205k;
        }

        /* renamed from: l */
        public final TextView mo34457l() {
            return this.f24206l;
        }

        /* renamed from: m */
        public final View mo34458m() {
            return this.f24207m;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            View findViewById = view.findViewById(R.id.tv_content_translate);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.tv_content_translate)");
            this.f24195a = (CommentTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.iv_translate);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.iv_translate)");
            this.f24196b = (BearLottieView) findViewById2;
            View findViewById3 = view.findViewById(R.id.user_msg_image);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.user_msg_image)");
            this.f24197c = (ImageView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tv_name);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.id.tv_name)");
            this.f24198d = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.tv_create_at);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "itemView.findViewById(R.id.tv_create_at)");
            this.f24199e = (TextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.tv_content);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "itemView.findViewById(R.id.tv_content)");
            this.f24200f = (CommentTextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.tv_opt_comment);
            Intrinsics.checkExpressionValueIsNotNull(findViewById7, "itemView.findViewById(R.id.tv_opt_comment)");
            this.f24201g = findViewById7;
            View findViewById8 = view.findViewById(R.id.reaction_layout);
            Intrinsics.checkExpressionValueIsNotNull(findViewById8, "itemView.findViewById(R.id.reaction_layout)");
            this.f24202h = (ReactionFlowLayout) findViewById8;
            View findViewById9 = view.findViewById(R.id.comment_loading);
            Intrinsics.checkExpressionValueIsNotNull(findViewById9, "itemView.findViewById(R.id.comment_loading)");
            this.f24203i = (LottieAnimationView) findViewById9;
            View findViewById10 = view.findViewById(R.id.comment_fail_img);
            Intrinsics.checkExpressionValueIsNotNull(findViewById10, "itemView.findViewById(R.id.comment_fail_img)");
            this.f24204j = findViewById10;
            View findViewById11 = view.findViewById(R.id.comment_retry);
            Intrinsics.checkExpressionValueIsNotNull(findViewById11, "itemView.findViewById(R.id.comment_retry)");
            this.f24205k = findViewById11;
            View findViewById12 = view.findViewById(R.id.comment_send_fail);
            Intrinsics.checkExpressionValueIsNotNull(findViewById12, "itemView.findViewById(R.id.comment_send_fail)");
            this.f24206l = (TextView) findViewById12;
            View findViewById13 = view.findViewById(R.id.delete_comment);
            Intrinsics.checkExpressionValueIsNotNull(findViewById13, "itemView.findViewById(R.id.delete_comment)");
            this.f24207m = findViewById13;
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICardAdapter
    public List<CommentBean.CommentDetail> getData() {
        return this.commentRecord;
    }

    public final String getParentToken() {
        return this.parentToken;
    }

    public final String getParentType() {
        return this.parentType;
    }

    public final String getQuote() {
        return this.quote;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.commentRecord.size();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter$i */
    public static final class RunnableC8987i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CardAdapter f24223a;

        /* renamed from: b */
        final /* synthetic */ ViewHolder f24224b;

        RunnableC8987i(CardAdapter cardAdapter, ViewHolder bVar) {
            this.f24223a = cardAdapter;
            this.f24224b = bVar;
        }

        public final void run() {
            this.f24223a.adjustTouchArea(this.f24224b.mo34447b());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/middleground/comment/adapter/CardAdapter$adjustPosition$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter$c */
    public static final class ViewTreeObserver$OnPreDrawListenerC8981c implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ TextView f24208a;

        /* renamed from: b */
        final /* synthetic */ View f24209b;

        public boolean onPreDraw() {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            this.f24208a.getGlobalVisibleRect(rect);
            this.f24209b.getGlobalVisibleRect(rect2);
            String obj = this.f24208a.getText().toString();
            int lineCount = this.f24208a.getLineCount();
            if (this.f24208a.getLayout() == null) {
                this.f24208a.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
            int i = lineCount - 1;
            int lineStart = this.f24208a.getLayout().getLineStart(i);
            int lineEnd = this.f24208a.getLayout().getLineEnd(i);
            if (obj != null) {
                String substring = obj.substring(lineStart, lineEnd);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                ConstraintLayout.LayoutParams layoutParams = null;
                if (((float) (rect2.left - rect.left)) <= this.f24208a.getPaint().measureText(StringsKt.replace$default(substring, "<doc.at.~#_%=`>", "     ", false, 4, (Object) null))) {
                    View view = this.f24209b;
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (!(layoutParams2 instanceof ConstraintLayout.LayoutParams)) {
                        layoutParams2 = null;
                    }
                    ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
                    if (layoutParams3 != null) {
                        layoutParams3.f2817i = R.id.tv_content_translate;
                        layoutParams3.f2819k = -1;
                        layoutParams = layoutParams3;
                    }
                    view.setLayoutParams(layoutParams);
                } else {
                    View view2 = this.f24209b;
                    ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                    if (!(layoutParams4 instanceof ConstraintLayout.LayoutParams)) {
                        layoutParams4 = null;
                    }
                    ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) layoutParams4;
                    if (layoutParams5 != null) {
                        layoutParams5.f2819k = R.id.tv_content_translate;
                        layoutParams5.f2817i = -1;
                        layoutParams = layoutParams5;
                    }
                    view2.setLayoutParams(layoutParams);
                }
                this.f24208a.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }

        ViewTreeObserver$OnPreDrawListenerC8981c(TextView textView, View view) {
            this.f24208a = textView;
            this.f24209b = view;
        }
    }

    public final void setParentToken(String str) {
        this.parentToken = str;
    }

    public final void setParentType(String str) {
        this.parentType = str;
    }

    public final void setQuote(String str) {
        this.quote = str;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0012\u0010\b\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/middleground/comment/adapter/CardAdapter$setContent$listener$1", "Lcom/bytedance/ee/bear/middleground/comment/cell/LinkClickCell$ClickCallBack;", "click", "", "url", "", "clickProfile", "uuid", "isSameSpace", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter$j */
    public static final class C8988j implements C8969a.AbstractC8970a {

        /* renamed from: a */
        final /* synthetic */ CardAdapter f24225a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8988j(CardAdapter cardAdapter) {
            this.f24225a = cardAdapter;
        }

        @Override // com.bytedance.ee.bear.middleground.comment.p443a.C8969a.AbstractC8970a
        /* renamed from: a */
        public boolean mo34412a(String str) {
            if (str == null || !this.f24225a.commentListeners.mo34277A().invoke(str).booleanValue()) {
                return false;
            }
            return true;
        }

        @Override // com.bytedance.ee.bear.middleground.comment.p443a.C8969a.AbstractC8970a
        /* renamed from: b */
        public void mo34413b(String str) {
            this.f24225a.clickLink.invoke();
            if (str != null) {
                this.f24225a.commentListeners.mo34278B().invoke(str);
            }
        }

        @Override // com.bytedance.ee.bear.middleground.comment.p443a.C8969a.AbstractC8970a
        /* renamed from: c */
        public void mo34414c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "uuid");
            this.f24225a.commentListeners.mo34289M().invoke(str);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICardAdapter
    public String getCommentId(CommentBean.CommentDetail commentDetail) {
        Intrinsics.checkParameterIsNotNull(commentDetail, "item");
        String comment_id = commentDetail.getComment_id();
        if (comment_id != null) {
            return comment_id;
        }
        return "";
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICardAdapter
    public void setData(List<? extends CommentBean.CommentDetail> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.commentRecord = C69121n.m265989f(list);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter$f */
    public static final class View$OnClickListenerC8984f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter f24215a;

        /* renamed from: b */
        final /* synthetic */ CommentBean.CommentDetail f24216b;

        View$OnClickListenerC8984f(CardAdapter cardAdapter, CommentBean.CommentDetail commentDetail) {
            this.f24215a = cardAdapter;
            this.f24216b = commentDetail;
        }

        public final void onClick(View view) {
            ICommentFunction eVar = this.f24215a.actionControl;
            String comment_id = this.f24216b.getComment_id();
            Intrinsics.checkExpressionValueIsNotNull(comment_id, "item.comment_id");
            String reply_id = this.f24216b.getReply_id();
            Intrinsics.checkExpressionValueIsNotNull(reply_id, "item.reply_id");
            eVar.mo34650b(comment_id, reply_id);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter$k */
    public static final class View$OnClickListenerC8989k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter f24226a;

        /* renamed from: b */
        final /* synthetic */ ViewHolder f24227b;

        /* renamed from: c */
        final /* synthetic */ CommentBean.CommentDetail f24228c;

        View$OnClickListenerC8989k(CardAdapter cardAdapter, ViewHolder bVar, CommentBean.CommentDetail commentDetail) {
            this.f24226a = cardAdapter;
            this.f24227b = bVar;
            this.f24228c = commentDetail;
        }

        public final void onClick(View view) {
            ICommentFunction eVar = this.f24226a.actionControl;
            View view2 = this.f24227b.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
            eVar.mo34630a(view2, this.f24228c, this.f24226a, this.f24227b.getAdapterPosition());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onReactionClicked"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter$l */
    public static final class C8990l implements ReactionBaseFlowLayout.AbstractC53049d {

        /* renamed from: a */
        final /* synthetic */ CardAdapter f24229a;

        /* renamed from: b */
        final /* synthetic */ CommentBean.CommentDetail f24230b;

        C8990l(CardAdapter cardAdapter, CommentBean.CommentDetail commentDetail) {
            this.f24229a = cardAdapter;
            this.f24230b = commentDetail;
        }

        @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout.AbstractC53049d
        public final void onReactionClicked(String str) {
            Intrinsics.checkExpressionValueIsNotNull(str, "it");
            this.f24229a.actionControl.mo34638a(this.f24229a, str, this.f24230b, (View) null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "reactionKey", "", "kotlin.jvm.PlatformType", "perform"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter$m */
    public static final class C8991m implements ReactionBaseFlowLayout.AbstractC53047b {

        /* renamed from: a */
        final /* synthetic */ CardAdapter f24231a;

        /* renamed from: b */
        final /* synthetic */ CommentBean.CommentDetail f24232b;

        C8991m(CardAdapter cardAdapter, CommentBean.CommentDetail commentDetail) {
            this.f24231a = cardAdapter;
            this.f24232b = commentDetail;
        }

        @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout.AbstractC53047b
        public final void perform(String str) {
            ICommentFunction eVar = this.f24231a.actionControl;
            FragmentManager supportFragmentManager = this.f24231a.config.mo35279a().getSupportFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "config.activity.supportFragmentManager");
            CommentBean.CommentDetail commentDetail = this.f24232b;
            Intrinsics.checkExpressionValueIsNotNull(str, "reactionKey");
            eVar.mo34633a(supportFragmentManager, commentDetail, str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter$p */
    public static final class View$OnLongClickListenerC8994p implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter f24238a;

        /* renamed from: b */
        final /* synthetic */ CommentBean.CommentDetail f24239b;

        /* renamed from: c */
        final /* synthetic */ ViewHolder f24240c;

        View$OnLongClickListenerC8994p(CardAdapter cardAdapter, CommentBean.CommentDetail commentDetail, ViewHolder bVar) {
            this.f24238a = cardAdapter;
            this.f24239b = commentDetail;
            this.f24240c = bVar;
        }

        public final boolean onLongClick(View view) {
            ICommentFunction eVar = this.f24238a.actionControl;
            Intrinsics.checkExpressionValueIsNotNull(view, "view");
            eVar.mo34630a(view, this.f24239b, this.f24238a, this.f24240c.getAdapterPosition());
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter$q */
    public static final class View$OnClickListenerC8995q implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter f24241a;

        /* renamed from: b */
        final /* synthetic */ CommentBean.CommentDetail f24242b;

        View$OnClickListenerC8995q(CardAdapter cardAdapter, CommentBean.CommentDetail commentDetail) {
            this.f24241a = cardAdapter;
            this.f24242b = commentDetail;
        }

        public final void onClick(View view) {
            ICommentFunction eVar = this.f24241a.actionControl;
            String comment_id = this.f24242b.getComment_id();
            Intrinsics.checkExpressionValueIsNotNull(comment_id, "item.comment_id");
            String reply_id = this.f24242b.getReply_id();
            Intrinsics.checkExpressionValueIsNotNull(reply_id, "item.reply_id");
            eVar.mo34650b(comment_id, reply_id);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICardAdapter
    public String findReplyIdByPosition(int i) {
        if (i >= this.commentRecord.size()) {
            return "";
        }
        String reply_id = this.commentRecord.get(i).getReply_id();
        Intrinsics.checkExpressionValueIsNotNull(reply_id, "commentRecord[position].reply_id");
        return reply_id;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter$d */
    public static final class View$OnClickListenerC8982d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter f24210a;

        /* renamed from: b */
        final /* synthetic */ CommentBean.CommentDetail f24211b;

        View$OnClickListenerC8982d(CardAdapter cardAdapter, CommentBean.CommentDetail commentDetail) {
            this.f24210a = cardAdapter;
            this.f24211b = commentDetail;
        }

        public final void onClick(View view) {
            if (!this.f24211b.isAnonymous()) {
                AbstractC9106c a = C9185d.m37997a();
                Intrinsics.checkExpressionValueIsNotNull(a, "CommentServiceImpl.getCommentService()");
                if (!a.mo34729b()) {
                    this.f24210a.commentListeners.mo34289M().invoke(this.f24211b.getUser_id());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter$o */
    public static final class View$OnLongClickListenerC8993o implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter f24235a;

        /* renamed from: b */
        final /* synthetic */ CommentBean.CommentDetail f24236b;

        /* renamed from: c */
        final /* synthetic */ ViewHolder f24237c;

        View$OnLongClickListenerC8993o(CardAdapter cardAdapter, CommentBean.CommentDetail commentDetail, ViewHolder bVar) {
            this.f24235a = cardAdapter;
            this.f24236b = commentDetail;
            this.f24237c = bVar;
        }

        public final boolean onLongClick(View view) {
            C13479a.m54764b("CardAdapter", "onBindViewHolder:content.setOnLongClickListener");
            ICommentFunction eVar = this.f24235a.actionControl;
            Intrinsics.checkExpressionValueIsNotNull(view, "view");
            eVar.mo34630a(view, this.f24236b, this.f24235a, this.f24237c.getAdapterPosition());
            return true;
        }
    }

    private final boolean shouldHideDeleteButton(CommentBean.CommentDetail commentDetail) {
        if (commentDetail.getError().isSuccess() || Intrinsics.areEqual(commentDetail.getRetryType(), "delete") || Intrinsics.areEqual(commentDetail.getRetryType(), "update")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter$e */
    public static final class View$OnClickListenerC8983e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter f24212a;

        /* renamed from: b */
        final /* synthetic */ boolean f24213b;

        /* renamed from: c */
        final /* synthetic */ CommentBean.CommentDetail f24214c;

        View$OnClickListenerC8983e(CardAdapter cardAdapter, boolean z, CommentBean.CommentDetail commentDetail) {
            this.f24212a = cardAdapter;
            this.f24213b = z;
            this.f24214c = commentDetail;
        }

        public final void onClick(View view) {
            List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list;
            if (this.f24213b) {
                ICommentFunction eVar = this.f24212a.actionControl;
                CommentBean.CommentDetail commentDetail = this.f24214c;
                CardAdapter cardAdapter = this.f24212a;
                eVar.mo34625a(commentDetail, cardAdapter, cardAdapter.getQuote(), 0, this.f24212a.getParentType(), this.f24212a.getParentToken(), null);
                return;
            }
            ICommentFunction eVar2 = this.f24212a.actionControl;
            String content = this.f24214c.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, "item.content");
            CommentBean.CommentDetail.ExtraEntity extra = this.f24214c.getExtra();
            if (extra != null) {
                list = extra.getImage_list();
            } else {
                list = null;
            }
            String quote = this.f24212a.getQuote();
            String comment_id = this.f24214c.getComment_id();
            Intrinsics.checkExpressionValueIsNotNull(comment_id, "item.comment_id");
            String reply_id = this.f24214c.getReply_id();
            Intrinsics.checkExpressionValueIsNotNull(reply_id, "item.reply_id");
            ICommentFunction.C9099a.m37775a(eVar2, content, list, quote, comment_id, reply_id, this.f24212a.getParentType(), this.f24212a.getParentToken(), null, null, null, SmActions.ACTION_ONTHECALL_EXIT, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter$g */
    public static final class View$OnClickListenerC8985g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter f24217a;

        /* renamed from: b */
        final /* synthetic */ boolean f24218b;

        /* renamed from: c */
        final /* synthetic */ CommentBean.CommentDetail f24219c;

        View$OnClickListenerC8985g(CardAdapter cardAdapter, boolean z, CommentBean.CommentDetail commentDetail) {
            this.f24217a = cardAdapter;
            this.f24218b = z;
            this.f24219c = commentDetail;
        }

        public final void onClick(View view) {
            List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list;
            if (this.f24218b) {
                ICommentFunction eVar = this.f24217a.actionControl;
                CommentBean.CommentDetail commentDetail = this.f24219c;
                CardAdapter cardAdapter = this.f24217a;
                eVar.mo34625a(commentDetail, cardAdapter, cardAdapter.getQuote(), 2, this.f24217a.getParentType(), this.f24217a.getParentToken(), null);
                return;
            }
            ICommentFunction eVar2 = this.f24217a.actionControl;
            String content = this.f24219c.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, "item.content");
            CommentBean.CommentDetail.ExtraEntity extra = this.f24219c.getExtra();
            if (extra != null) {
                list = extra.getImage_list();
            } else {
                list = null;
            }
            String comment_id = this.f24219c.getComment_id();
            Intrinsics.checkExpressionValueIsNotNull(comment_id, "item.comment_id");
            String reply_id = this.f24219c.getReply_id();
            Intrinsics.checkExpressionValueIsNotNull(reply_id, "item.reply_id");
            eVar2.mo34643a(content, list, comment_id, reply_id, null, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter$h */
    public static final class View$OnClickListenerC8986h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter f24220a;

        /* renamed from: b */
        final /* synthetic */ boolean f24221b;

        /* renamed from: c */
        final /* synthetic */ CommentBean.CommentDetail f24222c;

        View$OnClickListenerC8986h(CardAdapter cardAdapter, boolean z, CommentBean.CommentDetail commentDetail) {
            this.f24220a = cardAdapter;
            this.f24221b = z;
            this.f24222c = commentDetail;
        }

        public final void onClick(View view) {
            List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list;
            if (this.f24221b) {
                ICommentFunction eVar = this.f24220a.actionControl;
                CommentBean.CommentDetail commentDetail = this.f24222c;
                CardAdapter cardAdapter = this.f24220a;
                eVar.mo34625a(commentDetail, cardAdapter, cardAdapter.getQuote(), 1, this.f24220a.getParentType(), this.f24220a.getParentToken(), null);
                return;
            }
            ICommentFunction eVar2 = this.f24220a.actionControl;
            String content = this.f24222c.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, "item.content");
            CommentBean.CommentDetail.ExtraEntity extra = this.f24222c.getExtra();
            if (extra != null) {
                list = extra.getImage_list();
            } else {
                list = null;
            }
            String comment_id = this.f24222c.getComment_id();
            Intrinsics.checkExpressionValueIsNotNull(comment_id, "item.comment_id");
            String reply_id = this.f24222c.getReply_id();
            Intrinsics.checkExpressionValueIsNotNull(reply_id, "item.reply_id");
            eVar2.mo34643a(content, list, comment_id, reply_id, null, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "userId", "", "kotlin.jvm.PlatformType", "perform"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter$n */
    public static final class C8992n implements ReactionBaseFlowLayout.AbstractC53046a {

        /* renamed from: a */
        final /* synthetic */ CardAdapter f24233a;

        /* renamed from: b */
        final /* synthetic */ CommentBean.CommentDetail f24234b;

        C8992n(CardAdapter cardAdapter, CommentBean.CommentDetail commentDetail) {
            this.f24233a = cardAdapter;
            this.f24234b = commentDetail;
        }

        @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout.AbstractC53046a
        public final void perform(String str) {
            List<ReactionDetailUserInfo> userList;
            boolean z = false;
            try {
                List<Reaction> reaction = this.f24234b.getReaction();
                if (reaction != null) {
                    for (T t : reaction) {
                        ReactionDetailUserInfo reactionDetailUserInfo = null;
                        if (!(t == null || (userList = t.getUserList()) == null)) {
                            Iterator<T> it = userList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                T next = it.next();
                                T t2 = next;
                                if (Intrinsics.areEqual(t2 != null ? t2.getUserId() : null, str)) {
                                    reactionDetailUserInfo = next;
                                    break;
                                }
                            }
                            reactionDetailUserInfo = reactionDetailUserInfo;
                        }
                        if (reactionDetailUserInfo != null) {
                            z = reactionDetailUserInfo.isAnonymous();
                        }
                    }
                }
                if (!z) {
                    AbstractC9106c a = C9185d.m37997a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "CommentServiceImpl.getCommentService()");
                    if (a.mo34729b()) {
                        return;
                    }
                    this.f24233a.commentListeners.mo34289M().invoke(str);
                }
            } catch (Exception e) {
                C13479a.m54761a("CardAdapter", e);
            }
        }
    }

    public final void adjustTouchArea(View view) {
        if (view.getVisibility() != 0) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                ((View) parent).setTouchDelegate(null);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
        Rect rect = new Rect();
        view.getHitRect(rect);
        ViewParent parent2 = view.getParent();
        if (parent2 != null) {
            ((View) parent2).setTouchDelegate(new TouchDelegate(new Rect(rect.left - 200, rect.top - 30, rect.right + LocationRequest.PRIORITY_HD_ACCURACY, rect.bottom + LocationRequest.PRIORITY_HD_ACCURACY), view));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.View");
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICardAdapter
    public List<CommentBean.CommentDetail> getLast3Item(String str) {
        Intrinsics.checkParameterIsNotNull(str, "replyId");
        int i = 0;
        for (T t : this.commentRecord) {
            if (Intrinsics.areEqual(str, t.getReply_id())) {
                t.setEditStatus(true);
                return CollectionsKt.toMutableList((Collection) this.commentRecord).subList(i, Math.min(i + 3, this.commentRecord.size()));
            }
            i++;
        }
        return new ArrayList();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter$r */
    public static final class View$OnClickListenerC8996r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter f24243a;

        /* renamed from: b */
        final /* synthetic */ CommentBean.CommentDetail f24244b;

        /* renamed from: c */
        final /* synthetic */ ViewHolder f24245c;

        View$OnClickListenerC8996r(CardAdapter cardAdapter, CommentBean.CommentDetail commentDetail, ViewHolder bVar) {
            this.f24243a = cardAdapter;
            this.f24244b = commentDetail;
            this.f24245c = bVar;
        }

        public final void onClick(View view) {
            if (this.f24244b.getTranslate_status() == null || Intrinsics.areEqual(this.f24244b.getTranslate_status(), "default")) {
                this.f24244b.setTranslate_status("loading");
                this.f24243a.notifyItemChanged(this.f24245c.getLayoutPosition());
                ICommentFunction eVar = this.f24243a.actionControl;
                String commentId = this.f24243a.getCommentId(this.f24244b);
                String reply_id = this.f24244b.getReply_id();
                Intrinsics.checkExpressionValueIsNotNull(reply_id, "item.reply_id");
                eVar.mo34640a(commentId, reply_id);
            } else if (Intrinsics.areEqual(this.f24244b.getTranslate_status(), "success") || Intrinsics.areEqual(this.f24244b.getTranslate_status(), "error")) {
                CommentTranslate.f24837a.mo35291a().put(this.f24244b.getReply_id(), Boolean.valueOf(!Intrinsics.areEqual((Object) CommentTranslate.f24837a.mo35291a().get(this.f24244b.getReply_id()), (Object) true)));
                this.f24243a.notifyItemChanged(this.f24245c.getLayoutPosition());
            }
        }
    }

    private final void setLoaddingStatus(ViewHolder bVar, CommentBean.CommentDetail commentDetail) {
        if (commentDetail.isSending()) {
            bVar.mo34454i().setVisibility(0);
            bVar.mo34454i().playAnimation();
            return;
        }
        bVar.mo34454i().setVisibility(8);
    }

    private final void setMore(ViewHolder bVar, CommentBean.CommentDetail commentDetail) {
        int i;
        View g = bVar.mo34452g();
        if (!this.isEditStatus && !commentDetail.isSending()) {
            ErrorBean error = commentDetail.getError();
            Intrinsics.checkExpressionValueIsNotNull(error, "item.error");
            if (error.isSuccess()) {
                i = 0;
                g.setVisibility(i);
                bVar.mo34452g().setOnClickListener(new View$OnClickListenerC8989k(this, bVar, commentDetail));
            }
        }
        i = 8;
        g.setVisibility(i);
        bVar.mo34452g().setOnClickListener(new View$OnClickListenerC8989k(this, bVar, commentDetail));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.config.mo35279a()).inflate(R.layout.comment_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "rootView");
        return new ViewHolder(inflate);
    }

    private final void setContent(ViewHolder bVar, CommentBean.CommentDetail commentDetail) {
        AbstractC10460a.AbstractC10461a aVar;
        if (!this.isEditStatus) {
            aVar = this.actionControl.mo34627a(new C8988j(this));
        } else {
            aVar = null;
        }
        RichTextInjector.m38468a(bVar.mo34451f(), this.userId, aVar);
        bVar.mo34451f().setMaxWidth(C13749l.m55736a() - C13749l.m55738a(86));
        bVar.mo34451f().setMovementMethod(C7727a.m30901a());
        if (CommentTranslate.f24837a.mo35292a(this.config.mo35342t(), commentDetail)) {
            bVar.mo34451f().setRawString(commentDetail.getTranslate_content());
        } else {
            bVar.mo34451f().setRawString(commentDetail.getContent());
        }
        adjustPosition(bVar.mo34451f(), bVar.mo34447b(), commentDetail);
        bVar.mo34451f().post(new RunnableC8987i(this, bVar));
    }

    private final void setRetryView(ViewHolder bVar, CommentBean.CommentDetail commentDetail) {
        int i;
        int i2;
        retry(commentDetail, bVar.mo34457l());
        retry(commentDetail, bVar.mo34456k());
        retry(commentDetail, bVar.mo34455j());
        ErrorBean error = commentDetail.getError();
        Intrinsics.checkExpressionValueIsNotNull(error, "item.error");
        if (error.isNetFail()) {
            i = R.string.Doc_Comment_Send_Fail_By_Net;
        } else {
            ErrorBean error2 = commentDetail.getError();
            Intrinsics.checkExpressionValueIsNotNull(error2, "item.error");
            if (error2.isReviewFail()) {
                i = ((AbstractC10365a) KoinJavaComponent.m268613a(AbstractC10365a.class, null, null, 6, null)).mo39495a();
            } else {
                i = R.string.Doc_Comment_CommentSendFailed;
            }
        }
        bVar.mo34457l().setText(this.config.mo35279a().getText(i));
        View m = bVar.mo34458m();
        if (shouldHideDeleteButton(commentDetail)) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        m.setVisibility(i2);
        bVar.mo34458m().setOnClickListener(new View$OnClickListenerC8995q(this, commentDetail));
    }

    private final void setTime(CommentBean.CommentDetail commentDetail, ViewHolder bVar) {
        String str;
        try {
            if (commentDetail.getModify() == 1) {
                long update_timestamp = ((long) commentDetail.getUpdate_timestamp()) * ((long) 1000);
                str = C13723a.m55654a(bVar.mo34450e().getContext(), update_timestamp) + bVar.mo34450e().getResources().getString(R.string.Doc_Comment_Edited);
            } else {
                str = C13723a.m55654a(bVar.mo34448c().getContext(), ((long) commentDetail.getCreate_timestamp()) * ((long) 1000));
            }
            bVar.mo34450e().setText(str);
        } catch (Exception unused) {
            C13479a.m54775e("CardAdapter", "the time isn't right");
            bVar.mo34450e().setText(String.valueOf(commentDetail.getCreate_timestamp()));
        }
    }

    private final void setTranslateContent(ViewHolder bVar, CommentBean.CommentDetail commentDetail) {
        bVar.mo34446a().setMaxWidth(C13749l.m55736a() - C13749l.m55738a(86));
        if (CommentTranslate.f24837a.mo35297f(this.config.mo35342t(), commentDetail)) {
            bVar.mo34446a().setVisibility(0);
            if (CommentTranslate.f24837a.mo35298g(this.config.mo35342t(), commentDetail)) {
                bVar.mo34446a().setRawString(commentDetail.getContent());
            } else {
                bVar.mo34446a().setRawString(commentDetail.getTranslate_content());
            }
        } else {
            bVar.mo34446a().setVisibility(8);
        }
        adjustPosition(bVar.mo34446a(), bVar.mo34447b(), commentDetail);
    }

    private final void setTranslateIcon(ViewHolder bVar, CommentBean.CommentDetail commentDetail) {
        int i;
        BearLottieView b = bVar.mo34447b();
        if (CommentTranslate.f24837a.mo35293b(this.config.mo35342t(), commentDetail)) {
            i = 0;
        } else {
            i = 8;
        }
        b.setVisibility(i);
        if (Intrinsics.areEqual(commentDetail.getTranslate_status(), "loading")) {
            bVar.mo34447b().playAnimation();
        } else {
            bVar.mo34447b().cancelAnimation();
            bVar.mo34447b().setFrame(0);
        }
        bVar.mo34447b().setOnClickListener(new View$OnClickListenerC8996r(this, commentDetail, bVar));
    }

    private final void retry(CommentBean.CommentDetail commentDetail, View view) {
        ErrorBean error = commentDetail.getError();
        Intrinsics.checkExpressionValueIsNotNull(error, "item.error");
        if (error.isSuccess()) {
            view.setVisibility(8);
            view.setOnClickListener(null);
            return;
        }
        view.setVisibility(0);
        boolean a = ((AbstractC10365a) KoinJavaComponent.m268613a(AbstractC10365a.class, null, null, 6, null)).mo39496a(commentDetail.getError().code);
        String retryType = commentDetail.getRetryType();
        if (retryType != null) {
            switch (retryType.hashCode()) {
                case -1335458389:
                    if (retryType.equals("delete")) {
                        view.setOnClickListener(new View$OnClickListenerC8984f(this, commentDetail));
                        return;
                    }
                    break;
                case -838846263:
                    if (retryType.equals("update")) {
                        view.setOnClickListener(new View$OnClickListenerC8986h(this, a, commentDetail));
                        return;
                    }
                    break;
                case 96417:
                    if (retryType.equals("add")) {
                        view.setOnClickListener(new View$OnClickListenerC8983e(this, a, commentDetail));
                        return;
                    }
                    break;
                case 108401386:
                    if (retryType.equals("reply")) {
                        view.setOnClickListener(new View$OnClickListenerC8985g(this, a, commentDetail));
                        return;
                    }
                    break;
            }
        }
        view.setOnClickListener(null);
    }

    private final void setReaction(ViewHolder bVar, CommentBean.CommentDetail commentDetail) {
        List<C53061a> reactionFlowData = commentDetail.getReactionFlowData();
        if (!this.config.mo35341s() || reactionFlowData == null || reactionFlowData.isEmpty()) {
            bVar.mo34453h().setVisibility(8);
            ICommentFunction eVar = this.actionControl;
            String reply_id = commentDetail.getReply_id();
            Intrinsics.checkExpressionValueIsNotNull(reply_id, "commentDetail.reply_id");
            eVar.mo34641a(reply_id, new ArrayList());
        } else {
            C13479a.m54764b("CardAdapter", "setReaction size:" + reactionFlowData.size());
            ICommentFunction eVar2 = this.actionControl;
            String reply_id2 = commentDetail.getReply_id();
            Intrinsics.checkExpressionValueIsNotNull(reply_id2, "commentDetail.reply_id");
            eVar2.mo34641a(reply_id2, reactionFlowData);
            boolean z = false;
            bVar.mo34453h().setVisibility(0);
            bVar.mo34453h().setup(reactionFlowData);
            bVar.mo34453h().setReactionClickListener(new C8990l(this, commentDetail));
            bVar.mo34453h().setOnReactionMoreTrigger(new C8991m(this, commentDetail));
            bVar.mo34453h().setOnReactionNameTrigger(new C8992n(this, commentDetail));
            ReactionFlowLayout h = bVar.mo34453h();
            if (!this.isEditStatus && this.config.mo35335m().mo17184b()) {
                z = true;
            }
            C52990a.m205231a(h, z);
        }
        if (!this.isEditStatus && !commentDetail.isSending()) {
            bVar.mo34451f().setOnLongClickListener(new View$OnLongClickListenerC8993o(this, commentDetail, bVar));
            bVar.itemView.setOnLongClickListener(new View$OnLongClickListenerC8994p(this, commentDetail, bVar));
        }
    }

    public void onBindViewHolder(ViewHolder bVar, int i) {
        int i2;
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        CommentBean.CommentDetail commentDetail = this.commentRecord.get(i);
        if (commentDetail.getReply_id() == null) {
            C13479a.m54758a("CardAdapter", "reply_id is null! comment_id = " + getCommentId(commentDetail));
            return;
        }
        RichTextInjector.m38468a(bVar.mo34451f(), (String) null, (AbstractC10460a.AbstractC10461a) null);
        RichTextInjector.m38468a(bVar.mo34446a(), (String) null, (AbstractC10460a.AbstractC10461a) null);
        if (this.isEditStatus) {
            View view = bVar.itemView;
            if (commentDetail.isEditStatus()) {
                View view2 = bVar.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
                i2 = view2.getResources().getColor(R.color.bg_float_overlay);
            } else {
                View view3 = bVar.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view3, "holder.itemView");
                i2 = view3.getResources().getColor(R.color.space_kit_trans);
            }
            view.setBackgroundColor(i2);
        }
        View view4 = bVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "holder.itemView");
        ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(view4.getContext()).mo10414a(new C13664a(commentDetail.getAvatar_url())).mo11129a(AbstractC2354j.f7813c)).mo11123a(R.drawable.facade_common_avatar_place_holder)).mo10399a(bVar.mo34448c());
        if (!this.isEditStatus) {
            bVar.mo34448c().setOnClickListener(new View$OnClickListenerC8982d(this, commentDetail));
        }
        setTranslateIcon(bVar, commentDetail);
        setContent(bVar, commentDetail);
        bVar.mo34449d().setText(commentDetail.getName());
        setTime(commentDetail, bVar);
        setMore(bVar, commentDetail);
        setReaction(bVar, commentDetail);
        setTranslateContent(bVar, commentDetail);
        setLoaddingStatus(bVar, commentDetail);
        setRetryView(bVar, commentDetail);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICardAdapter
    public void onItemVisible(int i, int i2) {
        int i3;
        C13479a.m54764b("CardAdapter", "onItemVisible, first: " + i + ", last: " + i2);
        if (!this.commentRecord.isEmpty()) {
            if (i >= this.commentRecord.size()) {
                C13479a.m54775e("CardAdapter", "onItemVisible first out of index, first: " + i + ", size: " + this.commentRecord.size());
                i3 = this.commentRecord.size() - 1;
            } else {
                i3 = i;
            }
            if (i2 >= this.commentRecord.size()) {
                C13479a.m54775e("CardAdapter", "onItemVisible last out of index, last: " + i + ", size: " + this.commentRecord.size());
                i2 = this.commentRecord.size() + -1;
            }
            ArrayList arrayList = new ArrayList();
            if (i3 <= i2) {
                while (true) {
                    CommentBean.CommentDetail commentDetail = this.commentRecord.get(i3);
                    if (!TextUtils.isEmpty(commentDetail.getMessageId()) && commentDetail.getReadStatus() == 1) {
                        String messageId = commentDetail.getMessageId();
                        Intrinsics.checkExpressionValueIsNotNull(messageId, "item.messageId");
                        arrayList.add(messageId);
                        commentDetail.setReadStatus(2);
                    }
                    if (i3 == i2) {
                        break;
                    }
                    i3++;
                }
            }
            if (!arrayList.isEmpty()) {
                C13479a.m54764b("CardAdapter", "readMessage: " + arrayList);
                this.actionControl.mo34645a(arrayList);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(ViewHolder bVar, int i, List list) {
        onBindViewHolder(bVar, i, (List<Object>) list);
    }

    private final void adjustPosition(TextView textView, View view, CommentBean.CommentDetail commentDetail) {
        if (textView.getVisibility() == 0 && view.getVisibility() == 0) {
            textView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC8981c(textView, view));
        }
    }

    public void onBindViewHolder(ViewHolder bVar, int i, List<Object> list) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        Intrinsics.checkParameterIsNotNull(list, "payloads");
        if (!list.isEmpty()) {
            Object obj = list.get(0);
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.os.Bundle");
            } else if (!((Bundle) obj).isEmpty()) {
                CommentBean.CommentDetail commentDetail = this.commentRecord.get(i);
                Object obj2 = list.get(0);
                if (obj2 != null) {
                    Bundle bundle = (Bundle) obj2;
                    if (bundle.getInt("TEXT", 0) == 1) {
                        setContent(bVar, commentDetail);
                        setTranslateContent(bVar, commentDetail);
                        setTime(commentDetail, bVar);
                    }
                    if (bundle.getInt("REACTION", 0) == 1) {
                        setReaction(bVar, commentDetail);
                        setMore(bVar, commentDetail);
                    }
                    if (bundle.getInt("SENDINGSTATUS", 0) == 1) {
                        setLoaddingStatus(bVar, commentDetail);
                        setMore(bVar, commentDetail);
                        setRetryView(bVar, commentDetail);
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.os.Bundle");
            }
        }
        onBindViewHolder(bVar, i);
    }

    public CardAdapter(Config fVar, String str, String str2, ICommentListeners fVar2, ICommentFunction eVar, boolean z, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(fVar, "config");
        Intrinsics.checkParameterIsNotNull(str, "language");
        Intrinsics.checkParameterIsNotNull(str2, "userId");
        Intrinsics.checkParameterIsNotNull(fVar2, "commentListeners");
        Intrinsics.checkParameterIsNotNull(eVar, "actionControl");
        Intrinsics.checkParameterIsNotNull(function0, "clickLink");
        this.config = fVar;
        this.language = str;
        this.userId = str2;
        this.commentListeners = fVar2;
        this.actionControl = eVar;
        this.isEditStatus = z;
        this.clickLink = function0;
        this.commentRecord = new ArrayList();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CardAdapter(com.bytedance.ee.bear.middleground.comment.uitls.Config r10, java.lang.String r11, java.lang.String r12, com.bytedance.ee.bear.middleground.comment.control.ICommentListeners r13, com.bytedance.ee.bear.middleground.comment.control.ICommentFunction r14, boolean r15, kotlin.jvm.functions.Function0 r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r9 = this;
            r0 = r17 & 32
            if (r0 == 0) goto L_0x0007
            r0 = 0
            r7 = 0
            goto L_0x0008
        L_0x0007:
            r7 = r15
        L_0x0008:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r8 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter.<init>(com.bytedance.ee.bear.middleground.comment.g.f, java.lang.String, java.lang.String, com.bytedance.ee.bear.middleground.comment.b.f, com.bytedance.ee.bear.middleground.comment.b.e, boolean, kotlin.jvm.functions.Function0, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
