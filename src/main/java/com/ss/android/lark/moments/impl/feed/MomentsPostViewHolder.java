package com.ss.android.lark.moments.impl.feed;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.moments.v1.Category;
import com.bytedance.lark.pb.moments.v1.IncompatibleAction;
import com.bytedance.lark.pb.moments.v1.Media;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.bytedance.lark.pb.moments.v1.Post;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.ui.AlignParentWidthRelativeLayout;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.dependency.idependency.IProfileModuleDependency;
import com.ss.android.lark.moments.impl.abtest.MomentsExperimentConfig;
import com.ss.android.lark.moments.impl.applink.AppLinkUtils;
import com.ss.android.lark.moments.impl.categorydetail.MomentsCategoryDetailActivity;
import com.ss.android.lark.moments.impl.common.span.FakeBoldSpan;
import com.ss.android.lark.moments.impl.common.utils.C47282k;
import com.ss.android.lark.moments.impl.common.utils.CopyUtils;
import com.ss.android.lark.moments.impl.common.utils.NumberUtils;
import com.ss.android.lark.moments.impl.common.utils.ReactionUtils;
import com.ss.android.lark.moments.impl.common.utils.VibratorUtils;
import com.ss.android.lark.moments.impl.common.widget.MomentsFollowButton;
import com.ss.android.lark.moments.impl.commonvo.IMomentsUser;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost;
import com.ss.android.lark.moments.impl.detail.MomentsDetailLauncher;
import com.ss.android.lark.moments.impl.feed.IMomentClickListener;
import com.ss.android.lark.moments.impl.feed.hotcomment.FeedHotCommentAdapter;
import com.ss.android.lark.moments.impl.feed.nineimage.NineImageAdapter;
import com.ss.android.lark.moments.impl.feed.nineimage.NineImageBean;
import com.ss.android.lark.moments.impl.feed.nineimage.NineImageDataParser;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitHelper;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPoint;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPointNew;
import com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager;
import com.ss.android.lark.reaction.p2557b.C52986b;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout;
import com.ss.android.lark.reaction.widget.flowlayout.ReactionFlowLayout;
import com.ss.android.lark.reaction.widget.flowlayout.p2562a.C53061a;
import com.ss.android.lark.reaction.widget.panel.C53085d;
import com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.p2905b.C57810a;
import com.ss.android.lark.utils.p2905b.C57811b;
import com.ss.android.lark.widget.light.listener.IMomentsHashTagSpanClickListener;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextView;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0016\u0018\u0000 Z2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001ZB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u0002H\u0002J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002J\u0010\u0010*\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0010\u0010+\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002J\u0010\u0010,\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0002J\u0010\u00100\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002J\u0016\u00101\u001a\b\u0012\u0004\u0012\u000203022\u0006\u0010\u001e\u001a\u00020\u0002H\u0002J\u001e\u00104\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u00022\f\u00105\u001a\b\u0012\u0004\u0012\u00020602H\u0016J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020.H\u0002J\b\u0010:\u001a\u00020.H\u0016J\u0010\u0010;\u001a\u00020<2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002J\u0010\u0010=\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0010\u0010>\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0004J\u0010\u0010?\u001a\u00020<2\u0006\u0010\u001e\u001a\u00020\u0002H\u0004J\u0018\u0010@\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020BH\u0016J\u0010\u0010D\u001a\u00020<2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002J\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020F022\f\u0010G\u001a\b\u0012\u0004\u0012\u00020H02H\u0016J\u0010\u0010I\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0010\u0010J\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0010\u0010K\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0010\u0010L\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0010\u0010M\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0006\u0010N\u001a\u00020\u001bJ\u0010\u0010O\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0016\u0010P\u001a\u00020\u001b2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020&02H\u0002J\u0010\u0010R\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u0002H\u0002J\u001e\u0010S\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020B2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020&02H\u0002J\u0018\u0010T\u001a\u00020\u001b2\u0006\u0010U\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0002H\u0002J\u0010\u0010V\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002J\u0010\u0010W\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u0002H\u0002J\u0010\u0010X\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u0002H\u0002J\u0012\u0010Y\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006["}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/MomentsPostViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsPost;", "Landroid/view/View;", "itemView", "mListener", "Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "(Landroid/view/View;Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;)V", "drawListener", "Landroid/view/ViewTreeObserver$OnDrawListener;", "getDrawListener", "()Landroid/view/ViewTreeObserver$OnDrawListener;", "drawListener$delegate", "Lkotlin/Lazy;", "imageAdapter", "Lcom/ss/android/lark/moments/impl/feed/nineimage/NineImageAdapter;", "imageLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "getImageLayoutManager", "()Landroidx/recyclerview/widget/GridLayoutManager;", "imageLayoutManager$delegate", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "viewModel", "bindAvatarClickListener", "", "sender", "Lcom/ss/android/lark/moments/impl/commonvo/IMomentsUser;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "bindComment", "bindContent", "bindFooter", "bindFrom", "bindHeader", "bindHotCommentReaction", "firstComment", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsComment;", "bindImage", "post", "bindListener", "bindReaction", "bindStatus", "bindUnKnownArea", "calSpanCount", "", "imageCount", "clickLikeReaction", "generateMenuItem", "", "Lcom/ss/android/lark/reaction/widget/panel/ReactionPanelMenuItem;", "getNineImageAdapter", "images", "Lcom/ss/android/lark/moments/impl/feed/nineimage/NineImageBean;", "getOperationMenuIcon", "Landroid/graphics/drawable/Drawable;", "iconId", "getReactionWrapperMargin", "isNormalStatus", "", "onBind", "onCellClicked", "onCellLongClicked", "onClickCategoryFromLabel", "postId", "", "categoryId", "onLongClicked", "provideReactionList", "Lcom/ss/android/lark/reaction/widget/flowlayout/bean/ReactionFlowLayoutViewModel;", "reactionList", "Lcom/ss/android/lark/reaction/widget/detailwindow/bean/ReactionDetailViewModel;", "sendCLickMoreEvent", "sendClickReactionEvent", "sendClickUserEvent", "sendPostPressHitPoint", "sendReactionPressEvent", "setDrawListener", "setUpEllipsize", "showCommentList", "commentList", "showDeleteConfirmDialog", "showHotComment", "showOperationMenu", "view", "showReactionPopupMenu", "showUnsetBroadcastConfirmDialog", "showVisibilityConfirmDialog", "updateUserFollowInfo", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.d */
public class MomentsPostViewHolder extends AbstractC58967a<IMomentsPost, View> {

    /* renamed from: d */
    public static final Companion f119829d = new Companion(null);

    /* renamed from: h */
    private static final int f119830h = UIHelper.dp2px(40.0f);

    /* renamed from: i */
    private static final boolean f119831i = MomentsDependencyHolder.f118998b.mo165901b().mo166491c();

    /* renamed from: a */
    private final Context f119832a;

    /* renamed from: b */
    public IMomentsPost f119833b;

    /* renamed from: c */
    public IMomentClickListener f119834c;

    /* renamed from: e */
    private final Lazy f119835e = LazyKt.lazy(new C47499ab(this));

    /* renamed from: f */
    private NineImageAdapter f119836f;

    /* renamed from: g */
    private final Lazy f119837g = LazyKt.lazy(C47535z.INSTANCE);

    /* renamed from: a */
    private final int m188263a(int i) {
        return i <= 3 ? i : i == 4 ? 2 : 3;
    }

    /* renamed from: d */
    private final GridLayoutManager m188267d() {
        return (GridLayoutManager) this.f119835e.getValue();
    }

    /* renamed from: e */
    private final ViewTreeObserver.OnDrawListener m188268e() {
        return (ViewTreeObserver.OnDrawListener) this.f119837g.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$Companion;", "", "()V", "ANIMATION_JSON_DIR", "", "AVATAR_SIZE", "", "DARK_ANIMATION_JSON_DIR", "KEY_REACTION_LIKE", "LIGHT_ANIMATION_JSON_DIR", "LOG_TAG", "MAX_LINE", "sNewReactionEnabled", "", "create", "Lcom/ss/android/lark/moments/impl/feed/MomentsPostViewHolder;", "parent", "Landroid/view/ViewGroup;", "listener", "Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsPostViewHolder mo166973a(ViewGroup viewGroup, IMomentClickListener aVar) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_moments_post, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new MomentsPostViewHolder(inflate, aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Context mo166962b() {
        return this.f119832a;
    }

    /* renamed from: a */
    public void mo166543a(IMomentsPost bVar) {
        String str;
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        IMomentsUser H = bVar.mo166423H();
        if (H == null) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            ((LKUIRoundedImageView2) view.findViewById(R.id.avatar)).setImageResource(R.drawable.common_chat_window_image_item_holder);
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            TextView textView = (TextView) view2.findViewById(R.id.name);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.name");
            textView.setText("");
        } else {
            String d = H.mo166365d();
            String c = H.mo166364c();
            int i = f119830h;
            IRequestCreator override = ImageLoader.with(this.f119832a).load(AvatarImage.Builder.obtain(d, c, i, i).build()).placeholder(R.drawable.common_chat_window_image_item_holder).override(i, i);
            Intrinsics.checkExpressionValueIsNotNull(override, "ImageLoader.with(mContex…AVATAR_SIZE, AVATAR_SIZE)");
            IRequestCreator a = C47282k.m187256a(override, ListenerParams.FromType.AVATAR, i, i, false, null, 24, null);
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            a.into((LKUIRoundedImageView2) view3.findViewById(R.id.avatar));
            Log.m165389i("moments_post_holder", "bindUserInfo, id is:" + bVar.mo166379a() + ", userInfo is:" + H);
            FakeBoldSpan.Companion aVar = FakeBoldSpan.f119246a;
            if (H.mo166368g() == MomentUser.Type.ANONYMOUS) {
                str = UIHelper.getString(R.string.Lark_Community_AnonymousUser);
            } else {
                str = H.mo166361a();
            }
            CharSequence a2 = aVar.mo166167a(str);
            View view4 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            TextView textView2 = (TextView) view4.findViewById(R.id.name);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.name");
            textView2.setText(a2);
        }
        View view5 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
        TextView textView3 = (TextView) view5.findViewById(R.id.time_label);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.time_label");
        textView3.setText(bVar.mo166448h());
        mo166961a(H, bVar);
        View view6 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
        MomentsFollowButton momentsFollowButton = (MomentsFollowButton) view6.findViewById(R.id.tv_follow);
        Intrinsics.checkExpressionValueIsNotNull(momentsFollowButton, "itemView.tv_follow");
        momentsFollowButton.setVisibility(8);
        mo166960a(H);
        View view7 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
        ((MomentsFollowButton) view7.findViewById(R.id.tv_follow)).setOnClickListener(new C47522n(this, H, bVar));
    }

    /* renamed from: a */
    public void mo166961a(IMomentsUser cVar, IMomentsPost bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        ((LKUIRoundedImageView2) view.findViewById(R.id.avatar)).setOnClickListener(new C47509b(this, cVar, bVar));
    }

    /* renamed from: a */
    public void mo166544a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        Intrinsics.checkParameterIsNotNull(str2, "categoryId");
        MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "from_category", "moments_feed_page_view", str, (String) null, (Integer) null, 24, (Object) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/ViewTreeObserver$OnDrawListener;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$z */
    static final class C47535z extends Lambda implements Function0<ViewTreeObserver.OnDrawListener> {
        public static final C47535z INSTANCE = new C47535z();

        C47535z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewTreeObserver.OnDrawListener invoke() {
            return ViewTreeObserver$OnDrawListenerC475361.f119924a;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$aa */
    public static final class C47498aa implements C53085d.AbstractC53086a {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119838a;

        /* renamed from: b */
        final /* synthetic */ IMomentsPost f119839b;

        C47498aa(MomentsPostViewHolder dVar, IMomentsPost bVar) {
            this.f119838a = dVar;
            this.f119839b = bVar;
        }

        @Override // com.ss.android.lark.reaction.widget.panel.C53085d.AbstractC53086a
        public final void onMenuItemClick() {
            this.f119839b.mo166433a(this.f119838a.mo166962b());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/GridLayoutManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$ab */
    static final class C47499ab extends Lambda implements Function0<GridLayoutManager> {
        final /* synthetic */ MomentsPostViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47499ab(MomentsPostViewHolder dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final GridLayoutManager invoke() {
            return new GridLayoutManager(this.this$0.mo166962b(), 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$bindHeader$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$n */
    public static final class C47522n extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119902a;

        /* renamed from: b */
        final /* synthetic */ IMomentsUser f119903b;

        /* renamed from: c */
        final /* synthetic */ IMomentsPost f119904c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.feed.d$n$a */
        static final class RunnableC47523a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C47522n f119905a;

            RunnableC47523a(C47522n nVar) {
                this.f119905a = nVar;
            }

            public final void run() {
                IMomentsUser cVar;
                MomentsPostViewHolder dVar = this.f119905a.f119902a;
                IMomentsPost bVar = this.f119905a.f119902a.f119833b;
                if (bVar != null) {
                    cVar = bVar.mo166423H();
                } else {
                    cVar = null;
                }
                dVar.mo166960a(cVar);
            }
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            String str;
            String str2;
            IMomentsUser cVar = this.f119903b;
            if (cVar != null) {
                MomentsHitPoint.f119720a.mo166839a("detail_page", !cVar.mo166366e(), cVar.mo166364c());
                String a = C57859q.m224565a(this.f119903b.mo166364c());
                if (cVar.mo166366e()) {
                    MomentsHitPointNew.Companion aVar = MomentsHitPointNew.f119721a;
                    String a2 = this.f119904c.mo166379a();
                    Category L = this.f119904c.mo166427L();
                    if (L != null) {
                        str2 = L.category_id;
                    } else {
                        str2 = null;
                    }
                    aVar.mo166857a(a2, "follow_cancel", "none", str2, a);
                } else {
                    MomentsHitPointNew.Companion aVar2 = MomentsHitPointNew.f119721a;
                    String a3 = this.f119904c.mo166379a();
                    Category L2 = this.f119904c.mo166427L();
                    if (L2 != null) {
                        str = L2.category_id;
                    } else {
                        str = null;
                    }
                    aVar2.mo166857a(a3, "follow", "none", str, a);
                }
            }
            IMomentsUser cVar2 = this.f119903b;
            if (cVar2 != null) {
                cVar2.mo166369h();
            }
            this.f119902a.itemView.postDelayed(new RunnableC47523a(this), 500);
        }

        C47522n(MomentsPostViewHolder dVar, IMomentsUser cVar, IMomentsPost bVar) {
            this.f119902a = dVar;
            this.f119903b = cVar;
            this.f119904c = bVar;
        }
    }

    /* renamed from: c */
    public final void mo166963c() {
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        view.getViewTreeObserver().addOnDrawListener(m188268e());
    }

    /* renamed from: a */
    public int mo166541a() {
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.reaction_wrapper);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "itemView.reaction_wrapper");
        if (!(frameLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        FrameLayout frameLayout2 = (FrameLayout) view2.findViewById(R.id.reaction_wrapper);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "itemView.reaction_wrapper");
        ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
        if (layoutParams != null) {
            int i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + 0;
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            FrameLayout frameLayout3 = (FrameLayout) view3.findViewById(R.id.reaction_wrapper);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout3, "itemView.reaction_wrapper");
            ViewGroup.LayoutParams layoutParams2 = frameLayout3.getLayoutParams();
            if (layoutParams2 != null) {
                return i + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$bindFooter$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$h */
    public static final class C47515h extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119889a;

        /* renamed from: b */
        final /* synthetic */ IMomentsPost f119890b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$bindFooter$1$onSingleClick$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.feed.d$h$a */
        public static final class C47516a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C47515h f119891a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C47516a(C47515h hVar) {
                this.f119891a = hVar;
            }

            public void onAnimationCancel(Animator animator) {
                this.f119891a.f119889a.mo166969r(this.f119891a.f119890b);
            }

            public void onAnimationEnd(Animator animator) {
                this.f119891a.f119889a.mo166969r(this.f119891a.f119890b);
            }
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f119889a.mo166553j(this.f119890b);
            View view2 = this.f119889a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            LKUILottieAnimationView lKUILottieAnimationView = (LKUILottieAnimationView) view2.findViewById(R.id.iv_reaction);
            Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView, "itemView.iv_reaction");
            if (!lKUILottieAnimationView.isAnimating()) {
                View view3 = this.f119889a.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
                LKUILottieAnimationView lKUILottieAnimationView2 = (LKUILottieAnimationView) view3.findViewById(R.id.iv_reaction);
                Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView2, "itemView.iv_reaction");
                if (!lKUILottieAnimationView2.isAnimating()) {
                    if (!this.f119890b.mo166416A()) {
                        View view4 = this.f119889a.itemView;
                        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
                        ((LKUILottieAnimationView) view4.findViewById(R.id.iv_reaction)).playAnimation();
                    } else {
                        MomentsHitHelper.f119719r.mo166794a("btn", "post");
                        this.f119890b.mo166436a("THUMBSUP");
                        return;
                    }
                }
                VibratorUtils.f119257a.mo166220a(this.f119889a.mo166962b(), 30);
                View view5 = this.f119889a.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
                ((LKUILottieAnimationView) view5.findViewById(R.id.iv_reaction)).addAnimatorListener(new C47516a(this));
            }
        }

        C47515h(MomentsPostViewHolder dVar, IMomentsPost bVar) {
            this.f119889a = dVar;
            this.f119890b = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$showReactionPopupMenu$listener$1", "Lcom/ss/android/lark/reaction/widget/panel/ReactionPanelFacade$ReactionClickListener;", "onReactionClick", "", "reactionKey", "", "reactionSource", "", "onShowLessBtnClick", "onShowMoreBtnClick", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$ap */
    public static final class ap implements ReactionPanelFacade.AbstractC53072b {

        /* renamed from: a */
        final /* synthetic */ IMomentsPost f119874a;

        @Override // com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade.AbstractC53072b
        /* renamed from: a */
        public void mo22763a() {
        }

        @Override // com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade.AbstractC53072b
        /* renamed from: b */
        public void mo22765b() {
        }

        ap(IMomentsPost bVar) {
            this.f119874a = bVar;
        }

        @Override // com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade.AbstractC53072b
        /* renamed from: a */
        public void mo22764a(String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "reactionKey");
            MomentsHitHelper.f119719r.mo166794a("long_click", "post");
            this.f119874a.mo166436a(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$bindContent$2", "Lcom/ss/android/lark/widget/richtext/RichTextView$RichTextListener;", "onTextClick", "", "textView", "Landroid/widget/TextView;", "onTextLongClick", "text", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$d */
    public static final class C47511d implements RichTextView.AbstractC59025c {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119884a;

        /* renamed from: b */
        final /* synthetic */ IMomentsPost f119885b;

        @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59025c
        /* renamed from: a */
        public void mo124117a(TextView textView) {
            this.f119884a.mo166966o(this.f119885b);
        }

        C47511d(MomentsPostViewHolder dVar, IMomentsPost bVar) {
            this.f119884a = dVar;
            this.f119885b = bVar;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59025c
        /* renamed from: a */
        public void mo124118a(String str, TextView textView) {
            this.f119884a.mo166967p(this.f119885b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$bindContent$3", "Lcom/ss/android/lark/widget/linked_emojicon/widget/LinkEmojiTextView$IPhoneStringClickListener;", "onPhoneClick", "", "view", "Landroid/view/View;", "phoneNumber", "", "onPhoneLongClick", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$e */
    public static final class C47512e implements LinkEmojiTextView.AbstractC58524i {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119886a;

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
        /* renamed from: b */
        public void mo122809b(View view, String str) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47512e(MomentsPostViewHolder dVar) {
            this.f119886a = dVar;
        }

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
        /* renamed from: a */
        public void mo122808a(View view, String str) {
            MomentsDependencyHolder.f118998b.mo165899a().phoneModuleDependency().mo144726a(this.f119886a.mo166962b(), str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\t\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$bindContent$4", "Lcom/ss/android/lark/widget/linked_emojicon/widget/LinkEmojiTextView$IAtStringClickListenr;", "onAtClick", "", "view", "Landroid/view/View;", "text", "", "userId", "onAtLongClick", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$f */
    public static final class C47513f implements LinkEmojiTextView.AbstractC58521f {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119887a;

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
        /* renamed from: b */
        public boolean mo117507b(View view, String str, String str2) {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47513f(MomentsPostViewHolder dVar) {
            this.f119887a = dVar;
        }

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
        /* renamed from: c */
        public void mo120297c(View view, String str, String str2) {
            if (str2 != null) {
                MomentsHitPoint.f119720a.mo166849f(MomentsHitHelper.f119719r.mo166802c());
                MomentsDependencyHolder.f118998b.mo165899a().profileModuleDependency().mo144727a(this.f119887a.mo166962b(), str2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\b\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$bindContent$5", "Lcom/ss/android/lark/widget/linked_emojicon/widget/LinkEmojiTextView$IURLStringClickListener;", "onURLClick", "", "view", "Landroid/view/View;", "url", "", "onURLLongClick", "", "text", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$g */
    public static final class C47514g implements LinkEmojiTextView.AbstractC58525j {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119888a;

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
        /* renamed from: b */
        public boolean mo122807b(View view, String str) {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47514g(MomentsPostViewHolder dVar) {
            this.f119888a = dVar;
        }

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
        /* renamed from: a */
        public void mo122806a(View view, String str) {
            if (str != null) {
                MomentsDependencyHolder.f118998b.mo165899a().browserModuleDependency().mo144693a(this.f119888a.mo166962b(), str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$bindFrom$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$l */
    public static final class C47520l extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119898a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47520l(MomentsPostViewHolder dVar) {
            this.f119898a = dVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            LKUIToast.show(this.f119898a.mo166962b(), (int) R.string.Moments_Category_MomentPushByAdminNoEditPermission);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$bindListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$o */
    public static final class C47524o extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119906a;

        /* renamed from: b */
        final /* synthetic */ IMomentsPost f119907b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f119906a.mo166966o(this.f119907b);
        }

        C47524o(MomentsPostViewHolder dVar, IMomentsPost bVar) {
            this.f119906a = dVar;
            this.f119907b = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$u */
    public static final class View$OnClickListenerC47530u implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119916a;

        /* renamed from: b */
        final /* synthetic */ IMomentsPost f119917b;

        View$OnClickListenerC47530u(MomentsPostViewHolder dVar, IMomentsPost bVar) {
            this.f119916a = dVar;
            this.f119917b = bVar;
        }

        public final void onClick(View view) {
            this.f119916a.mo166966o(this.f119917b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/ss/android/lark/moments/impl/common/utils/UIUtilsKt$onSingleClickListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release", "com/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$$special$$inlined$onSingleClickListener$2"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$ai */
    public static final class C47507ai extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119853a;

        /* renamed from: b */
        final /* synthetic */ IMomentsPost f119854b;

        /* renamed from: c */
        final /* synthetic */ Dialog f119855c;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f119853a.mo166970s(this.f119854b);
            this.f119855c.dismiss();
        }

        public C47507ai(MomentsPostViewHolder dVar, IMomentsPost bVar, Dialog dialog) {
            this.f119853a = dVar;
            this.f119854b = bVar;
            this.f119855c = dialog;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/ss/android/lark/moments/impl/common/utils/UIUtilsKt$onSingleClickListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release", "com/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$$special$$inlined$onSingleClickListener$5"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$al */
    public static final class al extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119862a;

        /* renamed from: b */
        final /* synthetic */ IMomentsPost f119863b;

        /* renamed from: c */
        final /* synthetic */ Dialog f119864c;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f119862a.mo166971t(this.f119863b);
            this.f119864c.dismiss();
        }

        public al(MomentsPostViewHolder dVar, IMomentsPost bVar, Dialog dialog) {
            this.f119862a = dVar;
            this.f119863b = bVar;
            this.f119864c = dialog;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/ss/android/lark/moments/impl/common/utils/UIUtilsKt$onSingleClickListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release", "com/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$$special$$inlined$onSingleClickListener$6"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$am */
    public static final class am extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119865a;

        /* renamed from: b */
        final /* synthetic */ IMomentsPost f119866b;

        /* renamed from: c */
        final /* synthetic */ Dialog f119867c;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f119865a.mo166972u(this.f119866b);
            this.f119867c.dismiss();
        }

        public am(MomentsPostViewHolder dVar, IMomentsPost bVar, Dialog dialog) {
            this.f119865a = dVar;
            this.f119866b = bVar;
            this.f119867c = dialog;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$p */
    public static final class View$OnLongClickListenerC47525p implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119908a;

        /* renamed from: b */
        final /* synthetic */ IMomentsPost f119909b;

        View$OnLongClickListenerC47525p(MomentsPostViewHolder dVar, IMomentsPost bVar) {
            this.f119908a = dVar;
            this.f119909b = bVar;
        }

        public final boolean onLongClick(View view) {
            this.f119908a.mo166552i(this.f119909b);
            return this.f119908a.mo166968q(this.f119909b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$q */
    public static final class View$OnLongClickListenerC47526q implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119910a;

        /* renamed from: b */
        final /* synthetic */ IMomentsPost f119911b;

        View$OnLongClickListenerC47526q(MomentsPostViewHolder dVar, IMomentsPost bVar) {
            this.f119910a = dVar;
            this.f119911b = bVar;
        }

        public final boolean onLongClick(View view) {
            return this.f119910a.mo166967p(this.f119911b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "reactionKey", "", "kotlin.jvm.PlatformType", "perform"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$t */
    public static final class C47529t implements ReactionBaseFlowLayout.AbstractC53047b {

        /* renamed from: a */
        final /* synthetic */ IMomentsPost f119915a;

        C47529t(IMomentsPost bVar) {
            this.f119915a = bVar;
        }

        @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout.AbstractC53047b
        public final void perform(String str) {
            IMomentsPost bVar = this.f119915a;
            Intrinsics.checkExpressionValueIsNotNull(str, "reactionKey");
            bVar.mo166440b(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$v */
    public static final class View$OnLongClickListenerC47531v implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119918a;

        /* renamed from: b */
        final /* synthetic */ IMomentsPost f119919b;

        View$OnLongClickListenerC47531v(MomentsPostViewHolder dVar, IMomentsPost bVar) {
            this.f119918a = dVar;
            this.f119919b = bVar;
        }

        public final boolean onLongClick(View view) {
            return this.f119918a.mo166967p(this.f119919b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$w */
    public static final class View$OnClickListenerC47532w implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ IMomentsPost f119920a;

        View$OnClickListenerC47532w(IMomentsPost bVar) {
            this.f119920a = bVar;
        }

        public final void onClick(View view) {
            if (this.f119920a.mo166455n() == Post.CreateStatus.FAILED) {
                this.f119920a.mo166419D();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$x */
    public static final class View$OnClickListenerC47533x implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ IMomentsPost f119921a;

        View$OnClickListenerC47533x(IMomentsPost bVar) {
            this.f119921a = bVar;
        }

        public final void onClick(View view) {
            if (this.f119921a.mo166455n() == Post.CreateStatus.FAILED) {
                this.f119921a.mo166419D();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$y */
    public static final class View$OnClickListenerC47534y implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119922a;

        /* renamed from: b */
        final /* synthetic */ IMomentsPost f119923b;

        View$OnClickListenerC47534y(MomentsPostViewHolder dVar, IMomentsPost bVar) {
            this.f119922a = dVar;
            this.f119923b = bVar;
        }

        public final void onClick(View view) {
            MomentsPostViewHolder dVar = this.f119922a;
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            dVar.mo166959a(view, this.f119923b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo166967p(IMomentsPost bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        mo166555l(bVar);
        return mo166968q(bVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/ss/android/lark/moments/impl/common/utils/UIUtilsKt$onSingleClickListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release", "com/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$$special$$inlined$onSingleClickListener$1"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$ah */
    public static final class C47506ah extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ LinearLayout f119849a;

        /* renamed from: b */
        final /* synthetic */ MomentsPostViewHolder f119850b;

        /* renamed from: c */
        final /* synthetic */ IMomentsPost f119851c;

        /* renamed from: d */
        final /* synthetic */ Dialog f119852d;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            IMomentsPost bVar = this.f119851c;
            Context context = this.f119849a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            bVar.mo166434a(context, this.f119851c, false);
            this.f119852d.dismiss();
        }

        public C47506ah(LinearLayout linearLayout, MomentsPostViewHolder dVar, IMomentsPost bVar, Dialog dialog) {
            this.f119849a = linearLayout;
            this.f119850b = dVar;
            this.f119851c = bVar;
            this.f119852d = dialog;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/ss/android/lark/moments/impl/common/utils/UIUtilsKt$onSingleClickListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release", "com/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$$special$$inlined$onSingleClickListener$3"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$aj */
    public static final class aj extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119856a;

        /* renamed from: b */
        final /* synthetic */ IMomentsPost f119857b;

        /* renamed from: c */
        final /* synthetic */ Dialog f119858c;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f119857b.mo166434a(this.f119856a.mo166962b(), this.f119857b, true);
            this.f119858c.dismiss();
        }

        public aj(MomentsPostViewHolder dVar, IMomentsPost bVar, Dialog dialog) {
            this.f119856a = dVar;
            this.f119857b = bVar;
            this.f119858c = dialog;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/ss/android/lark/moments/impl/common/utils/UIUtilsKt$onSingleClickListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release", "com/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$$special$$inlined$onSingleClickListener$7"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$an */
    public static final class an extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119868a;

        /* renamed from: b */
        final /* synthetic */ IMomentsPost f119869b;

        /* renamed from: c */
        final /* synthetic */ Dialog f119870c;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            IMomentClickListener aVar = this.f119868a.f119834c;
            if (aVar != null) {
                aVar.mo166616a(this.f119869b.mo166379a());
            }
            this.f119870c.dismiss();
        }

        public an(MomentsPostViewHolder dVar, IMomentsPost bVar, Dialog dialog) {
            this.f119868a = dVar;
            this.f119869b = bVar;
            this.f119870c = dialog;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$bindAvatarClickListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$b */
    public static final class C47509b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119879a;

        /* renamed from: b */
        final /* synthetic */ IMomentsUser f119880b;

        /* renamed from: c */
        final /* synthetic */ IMomentsPost f119881c;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            if (this.f119880b != null) {
                this.f119879a.mo166551h(this.f119881c);
                this.f119880b.mo166362a(this.f119879a.mo166962b());
            }
        }

        C47509b(MomentsPostViewHolder dVar, IMomentsUser cVar, IMomentsPost bVar) {
            this.f119879a = dVar;
            this.f119880b = cVar;
            this.f119881c = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$bindFooter$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$i */
    public static final class C47517i extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119892a;

        /* renamed from: b */
        final /* synthetic */ IMomentsPost f119893b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f119892a.mo166554k(this.f119893b);
            this.f119892a.mo166959a(view, this.f119893b);
        }

        C47517i(MomentsPostViewHolder dVar, IMomentsPost bVar) {
            this.f119892a = dVar;
            this.f119893b = bVar;
        }
    }

    /* renamed from: A */
    private final boolean m188262A(IMomentsPost bVar) {
        if (bVar.mo166455n() != Post.CreateStatus.SUCCESS || bVar.mo166453l()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public void mo166551h(IMomentsPost bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "other_profile", "profile_main_view", bVar.mo166379a(), (String) null, (Integer) null, 24, (Object) null);
    }

    /* renamed from: i */
    public void mo166552i(IMomentsPost bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "reaction_press", "moments_msg_menu_view", bVar.mo166379a(), (String) null, (Integer) null, 24, (Object) null);
    }

    /* renamed from: j */
    public void mo166553j(IMomentsPost bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "reaction", "none", bVar.mo166379a(), (String) null, (Integer) null, 24, (Object) null);
    }

    /* renamed from: l */
    public void mo166555l(IMomentsPost bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "post_press", "moments_msg_menu_view", bVar.mo166379a(), (String) null, (Integer) null, 24, (Object) null);
    }

    /* renamed from: q */
    public final boolean mo166968q(IMomentsPost bVar) {
        String str;
        IMomentClickListener aVar = this.f119834c;
        if (aVar != null) {
            String a = bVar.mo166379a();
            Category L = bVar.mo166427L();
            if (L != null) {
                str = L.category_id;
            } else {
                str = null;
            }
            aVar.mo166623b(a, str);
        }
        if (!m188262A(bVar)) {
            return true;
        }
        m188270w(bVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "ellipsized", "", "onEllipsized"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$ad */
    public static final class C47501ad implements RichTextView.AbstractC59023a {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119841a;

        C47501ad(MomentsPostViewHolder dVar) {
            this.f119841a = dVar;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59023a
        /* renamed from: a */
        public final void mo136816a(final boolean z) {
            Log.m165379d("moments_post_holder", "ellipsized:" + z);
            View view = this.f119841a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            ((RichTextView) view.findViewById(R.id.post_content)).post(new Runnable(this) {
                /* class com.ss.android.lark.moments.impl.feed.MomentsPostViewHolder.C47501ad.RunnableC475021 */

                /* renamed from: a */
                final /* synthetic */ C47501ad f119842a;

                {
                    this.f119842a = r1;
                }

                public final void run() {
                    int i;
                    View view = this.f119842a.f119841a.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                    TextView textView = (TextView) view.findViewById(R.id.show_more);
                    Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.show_more");
                    if (z) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    textView.setVisibility(i);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$showHotComment$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$ag */
    public static final class C47505ag extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119846a;

        /* renamed from: b */
        final /* synthetic */ String f119847b;

        /* renamed from: c */
        final /* synthetic */ IMomentsComment f119848c;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            MomentsDetailLauncher eVar = MomentsDetailLauncher.f119660a;
            View view2 = this.f119846a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            Context context = view2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
            MomentsDetailLauncher.m187945a(eVar, context, this.f119847b, false, this.f119848c.mo166379a(), "feed_page", false, false, 96, (Object) null);
        }

        C47505ag(MomentsPostViewHolder dVar, String str, IMomentsComment aVar) {
            this.f119846a = dVar;
            this.f119847b = str;
            this.f119848c = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/ss/android/lark/moments/impl/common/utils/UIUtilsKt$onSingleClickListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release", "com/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$$special$$inlined$onSingleClickListener$4"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$ak */
    public static final class ak extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119859a;

        /* renamed from: b */
        final /* synthetic */ IMomentsPost f119860b;

        /* renamed from: c */
        final /* synthetic */ Dialog f119861c;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            if (CopyUtils.f119249a.mo166199a(this.f119859a.mo166962b(), AppLinkUtils.f119003a.mo165904a(this.f119860b.mo166379a()))) {
                LKUIToast.show(this.f119859a.mo166962b(), (int) R.string.Lark_Community_LinkCopiedToast);
            } else {
                LKUIToast.show(this.f119859a.mo166962b(), (int) R.string.Lark_Community_UnableToCopyLinkToast);
            }
            this.f119861c.dismiss();
        }

        public ak(MomentsPostViewHolder dVar, IMomentsPost bVar, Dialog dialog) {
            this.f119859a = dVar;
            this.f119860b = bVar;
            this.f119861c = dialog;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$bindFooter$replyListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$k */
    public static final class C47519k extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119896a;

        /* renamed from: b */
        final /* synthetic */ IMomentsPost f119897b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            String str;
            MomentsHitHelper.f119719r.mo166800b("btn", "feed_page");
            IMomentClickListener aVar = this.f119896a.f119834c;
            if (aVar != null) {
                String a = this.f119897b.mo166379a();
                Category L = this.f119897b.mo166427L();
                if (L != null) {
                    str = L.category_id;
                } else {
                    str = null;
                }
                aVar.mo166625c(a, str);
            }
        }

        C47519k(MomentsPostViewHolder dVar, IMomentsPost bVar) {
            this.f119896a = dVar;
            this.f119897b = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$bindFrom$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$m */
    public static final class C47521m extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119899a;

        /* renamed from: b */
        final /* synthetic */ Category f119900b;

        /* renamed from: c */
        final /* synthetic */ IMomentsPost f119901c;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            MomentsCategoryDetailActivity.Companion aVar = MomentsCategoryDetailActivity.f119067d;
            View view2 = this.f119899a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            Context context = view2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
            aVar.mo165973a(context, this.f119900b);
            MomentsPostViewHolder dVar = this.f119899a;
            String a = this.f119901c.mo166379a();
            String str = this.f119900b.category_id;
            Intrinsics.checkExpressionValueIsNotNull(str, "category.category_id");
            dVar.mo166544a(a, str);
        }

        C47521m(MomentsPostViewHolder dVar, Category category, IMomentsPost bVar) {
            this.f119899a = dVar;
            this.f119900b = category;
            this.f119901c = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "reactionKey", "", "kotlin.jvm.PlatformType", "onReactionClicked"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$r */
    public static final class C47527r implements ReactionBaseFlowLayout.AbstractC53049d {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119912a;

        /* renamed from: b */
        final /* synthetic */ IMomentsPost f119913b;

        C47527r(MomentsPostViewHolder dVar, IMomentsPost bVar) {
            this.f119912a = dVar;
            this.f119913b = bVar;
        }

        @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout.AbstractC53049d
        public final void onReactionClicked(String str) {
            MomentsHitHelper.f119719r.mo166794a("reaction_list", "post");
            if (this.f119913b.mo166457p()) {
                IMomentsPost bVar = this.f119913b;
                Intrinsics.checkExpressionValueIsNotNull(str, "reactionKey");
                bVar.mo166436a(str);
                return;
            }
            View view = this.f119912a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            Context context = view.getContext();
            View view2 = this.f119912a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            LKUIToast.show(context, UIUtils.getString(view2.getContext(), R.string.Lark_Moments_ReactionsTurnedOff));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "userId", "", "kotlin.jvm.PlatformType", "perform"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$s */
    public static final class C47528s implements ReactionBaseFlowLayout.AbstractC53046a {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119914a;

        C47528s(MomentsPostViewHolder dVar) {
            this.f119914a = dVar;
        }

        @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout.AbstractC53046a
        public final void perform(String str) {
            MomentsHitPoint.f119720a.mo166849f(MomentsHitHelper.f119719r.mo166802c());
            IProfileModuleDependency profileModuleDependency = MomentsDependencyHolder.f118998b.mo165899a().profileModuleDependency();
            Context b = this.f119914a.mo166962b();
            Intrinsics.checkExpressionValueIsNotNull(str, "userId");
            profileModuleDependency.mo144727a(b, str);
        }
    }

    /* renamed from: v */
    private final void m188269v(IMomentsPost bVar) {
        this.itemView.setOnClickListener(new C47524o(this, bVar));
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        ((LKUILottieAnimationView) view.findViewById(R.id.iv_reaction)).setOnLongClickListener(new View$OnLongClickListenerC47525p(this, bVar));
        this.itemView.setOnLongClickListener(new View$OnLongClickListenerC47526q(this, bVar));
    }

    /* renamed from: x */
    private final List<C53085d> m188271x(IMomentsPost bVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C53085d(UIHelper.getString(R.string.Lark_Community_Copy), C47282k.m187254a(this.f119832a, (int) R.drawable.ud_icon_copy_outlined, 22.0f, 22.0f, (Integer) null, 8, (Object) null), new C47498aa(this, bVar)));
        return arrayList;
    }

    /* renamed from: a */
    public final void mo166960a(IMomentsUser cVar) {
        if (cVar != null) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            ((MomentsFollowButton) view.findViewById(R.id.tv_follow)).mo166233a(cVar.mo166366e(), cVar.mo166367f());
        }
    }

    /* renamed from: k */
    public void mo166554k(IMomentsPost bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "more", "moments_post_more_view", bVar.mo166379a(), (String) null, (Integer) null, 24, (Object) null);
        MomentsHitPointNew.Companion aVar = MomentsHitPointNew.f119721a;
        String str = bVar.mo166421F().id;
        Intrinsics.checkExpressionValueIsNotNull(str, "data.post.id");
        aVar.mo166852a(str);
    }

    /* renamed from: m */
    public void mo165944a(IMomentsPost bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f119833b = bVar;
        mo166543a(bVar);
        mo166545b(bVar);
        mo166546c(bVar);
        m188272y(bVar);
        mo166550g(bVar);
        mo166965n(bVar);
        mo166547d(bVar);
        mo166549f(bVar);
        m188273z(bVar);
        m188269v(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo166966o(IMomentsPost bVar) {
        IMomentClickListener aVar;
        String str;
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (m188262A(bVar) && (aVar = this.f119834c) != null) {
            String a = bVar.mo166379a();
            Category L = bVar.mo166427L();
            if (L != null) {
                str = L.category_id;
            } else {
                str = null;
            }
            aVar.mo166618a(a, str);
        }
    }

    /* renamed from: r */
    public final void mo166969r(IMomentsPost bVar) {
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        ((LKUILottieAnimationView) view.findViewById(R.id.iv_reaction)).removeAllAnimatorListeners();
        MomentsHitHelper.f119719r.mo166794a("btn", "post");
        bVar.mo166436a("THUMBSUP");
    }

    /* renamed from: s */
    public final void mo166970s(IMomentsPost bVar) {
        C25639g gVar = new C25639g(this.f119832a);
        gVar.mo89237b(UIHelper.getString(R.string.Lark_Moments_RemoveFromTrending_PopupTitle));
        gVar.mo89242c(UIHelper.getString(R.string.Lark_Moments_RemoveFromTrending_PopupText));
        gVar.mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Community_Cancel, aq.f119875a);
        gVar.mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmTip, new ar(bVar));
        gVar.mo89239c();
    }

    /* renamed from: u */
    public final void mo166972u(IMomentsPost bVar) {
        C25639g gVar = new C25639g(this.f119832a);
        gVar.mo89237b(UIHelper.getString(R.string.Lark_Community_OnlyAuthorCanView));
        gVar.mo89242c(UIHelper.getString(R.string.Lark_Community_OnlyAuthorCanViewDesc));
        gVar.mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Community_Cancel, as.f119877a);
        gVar.mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Community_Confirm, new DialogInterface$OnClickListenerC47508at(bVar));
        gVar.mo89239c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/ss/android/lark/moments/impl/common/utils/UIUtilsKt$onSingleClickListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release", "com/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$$special$$inlined$onSingleClickListener$8"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$ao */
    public static final class ao extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119871a;

        /* renamed from: b */
        final /* synthetic */ IMomentsPost f119872b;

        /* renamed from: c */
        final /* synthetic */ Dialog f119873c;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            MomentUser.Type type;
            IMomentsUser H = this.f119872b.mo166423H();
            String str = null;
            if (H != null) {
                type = H.mo166368g();
            } else {
                type = null;
            }
            if (type == MomentUser.Type.ANONYMOUS) {
                str = UIHelper.getString(R.string.Lark_Community_AnonymousUser);
            } else {
                IMomentsUser H2 = this.f119872b.mo166423H();
                if (H2 != null) {
                    str = H2.mo166361a();
                }
            }
            IMomentClickListener aVar = this.f119871a.f119834c;
            if (aVar != null) {
                Context b = this.f119871a.mo166962b();
                String str2 = this.f119872b.mo166421F().id;
                if (str == null) {
                    str = "";
                }
                IMomentClickListener.C47490a.m188215a(aVar, b, str2, null, str, 4, null);
            }
            this.f119873c.dismiss();
            MomentsHitPointNew.f119721a.mo166854a(this.f119872b.mo166379a(), "secret_chat", "moments_secret_chat_confirm_view");
        }

        public ao(MomentsPostViewHolder dVar, IMomentsPost bVar, Dialog dialog) {
            this.f119871a = dVar;
            this.f119872b = bVar;
            this.f119873c = dialog;
        }
    }

    /* renamed from: a */
    private final void m188264a(IMomentsComment aVar) {
        List<ReactionDetailViewModel> z = aVar.mo166415z();
        if (CollectionUtils.isNotEmpty(z)) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.hot_comment_reaction_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "itemView.hot_comment_reaction_container");
            linearLayout.setVisibility(0);
            for (int i = 0; i < 3; i++) {
                View view2 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                View childAt = ((LinearLayout) view2.findViewById(R.id.hot_comment_reaction_container)).getChildAt(i);
                if (childAt != null) {
                    ImageView imageView = (ImageView) childAt;
                    if (i < z.size()) {
                        imageView.setVisibility(0);
                        int a = C52986b.m205215a(z.get(i).getReactionKey());
                        if (a == 0) {
                            a = R.drawable.icon_default_reaction;
                        }
                        imageView.setImageResource(a);
                    } else {
                        imageView.setVisibility(8);
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
                }
            }
            return;
        }
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        LinearLayout linearLayout2 = (LinearLayout) view3.findViewById(R.id.hot_comment_reaction_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "itemView.hot_comment_reaction_container");
        linearLayout2.setVisibility(8);
    }

    /* renamed from: e */
    public void mo166548e(IMomentsPost bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        TextView textView = (TextView) view.findViewById(R.id.show_more);
        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.show_more");
        textView.setVisibility(8);
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        ((RichTextView) view2.findViewById(R.id.post_content)).setMaxLines(8);
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        ((RichTextView) view3.findViewById(R.id.post_content)).setOnEllipsizeListener(new C47501ad(this));
    }

    /* renamed from: g */
    public void mo166550g(IMomentsPost bVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        List<IMomentsComment> I = bVar.mo166424I();
        List<IMomentsComment> list = I;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.comment_container);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "itemView.comment_container");
            constraintLayout.setVisibility(8);
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.expose_comment_container);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "itemView.expose_comment_container");
            recyclerView.setVisibility(8);
        } else if (MomentsExperimentConfig.f119001b.mo165902a()) {
            m188266b(I);
        } else {
            m188265a(bVar.mo166379a(), I);
        }
    }

    /* renamed from: n */
    public void mo166965n(IMomentsPost bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        IncompatibleAction y = bVar.mo166466y();
        if (y == null) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(R.id.unknown_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.unknown_tv");
            textView.setVisibility(8);
            return;
        }
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        TextView textView2 = (TextView) view2.findViewById(R.id.unknown_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.unknown_tv");
        textView2.setVisibility(0);
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        TextView textView3 = (TextView) view3.findViewById(R.id.unknown_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.unknown_tv");
        textView3.setText(y.hint);
    }

    /* renamed from: t */
    public final void mo166971t(IMomentsPost bVar) {
        MomentUser.Type type;
        C25639g gVar = new C25639g(this.f119832a);
        if (bVar.mo166464w()) {
            gVar.mo89237b(UIHelper.getString(R.string.Lark_Community_AreYouSureYouWantToDeleteThisPost));
        } else {
            IMomentsUser H = bVar.mo166423H();
            String str = null;
            if (H != null) {
                type = H.mo166368g();
            } else {
                type = null;
            }
            if (type == MomentUser.Type.ANONYMOUS) {
                str = UIHelper.getString(R.string.Lark_Community_AnonymousUser);
            } else {
                IMomentsUser H2 = bVar.mo166423H();
                if (H2 != null) {
                    str = H2.mo166361a();
                }
            }
            gVar.mo89237b(UIHelper.mustacheFormat((int) R.string.Lark_Community_AreYouSureDeleteMoment, "deletePostUserName", str));
        }
        gVar.mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Community_Cancel, DialogInterface$OnClickListenerC47503ae.f119844a);
        gVar.mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Community_DeleteConfirm, new DialogInterface$OnClickListenerC47504af(bVar));
        gVar.mo89239c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$bindFooter$forwardListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$j */
    public static final class C47518j extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119894a;

        /* renamed from: b */
        final /* synthetic */ IMomentsPost f119895b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            int i;
            String str;
            String c = C59035h.m229212c(this.f119895b.mo166442c());
            List<ImageSet> d = this.f119895b.mo166443d();
            if (d != null) {
                i = d.size();
            } else {
                i = 0;
            }
            Intrinsics.checkExpressionValueIsNotNull(c, "richText");
            if (!(!StringsKt.isBlank(c))) {
                if (i > 0) {
                    StringBuilder sb = new StringBuilder(UIHelper.getString(R.string.Lark_Community_Image));
                    int i2 = i - 1;
                    for (int i3 = 0; i3 < i2; i3++) {
                        sb.append("、");
                        sb.append(UIHelper.getString(R.string.Lark_Community_Image));
                    }
                    c = sb.toString();
                } else {
                    c = UIHelper.getString(R.string.Lark_Community_Video);
                }
            }
            MomentsHitPoint.f119720a.mo166847d(MomentsHitHelper.f119719r.mo166802c(), this.f119895b.mo166379a());
            IMomentClickListener aVar = this.f119894a.f119834c;
            if (aVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(c, "content");
                String a = this.f119895b.mo166379a();
                int v = this.f119895b.mo166463v();
                Category L = this.f119895b.mo166427L();
                if (L != null) {
                    str = L.category_id;
                } else {
                    str = null;
                }
                aVar.mo166619a(c, a, v, str);
            }
        }

        C47518j(MomentsPostViewHolder dVar, IMomentsPost bVar) {
            this.f119894a = dVar;
            this.f119895b = bVar;
        }
    }

    /* renamed from: b */
    private final void m188266b(List<? extends IMomentsComment> list) {
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.expose_comment_container);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "itemView.expose_comment_container");
        recyclerView.setVisibility(0);
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.comment_container);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "itemView.comment_container");
        constraintLayout.setVisibility(8);
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        FrameLayout frameLayout = (FrameLayout) view3.findViewById(R.id.reaction_wrapper);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "itemView.reaction_wrapper");
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.LayoutParams)) {
            layoutParams = null;
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.f2817i = R.id.expose_comment_container;
        }
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        RecyclerView recyclerView2 = (RecyclerView) view4.findViewById(R.id.expose_comment_container);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "itemView.expose_comment_container");
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.f119832a, 1, false));
        View view5 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
        RecyclerView recyclerView3 = (RecyclerView) view5.findViewById(R.id.expose_comment_container);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "itemView.expose_comment_container");
        recyclerView3.setNestedScrollingEnabled(false);
        View view6 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
        RecyclerView recyclerView4 = (RecyclerView) view6.findViewById(R.id.expose_comment_container);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView4, "itemView.expose_comment_container");
        recyclerView4.setAdapter(new FeedHotCommentAdapter(list, true));
    }

    /* renamed from: w */
    private final void m188270w(IMomentsPost bVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (bVar.mo166457p()) {
            arrayList = MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency().mo144696a();
        } else {
            arrayList = new ArrayList();
        }
        if (bVar.mo166457p()) {
            arrayList2 = MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency().mo144706c();
        } else {
            arrayList2 = new ArrayList();
        }
        ap apVar = new ap(bVar);
        ReactionPanelFacade.C53071a c = new ReactionPanelFacade.C53071a(this.itemView).mo181315c(m188271x(bVar));
        if (bVar.mo166457p()) {
            c.mo181309a(arrayList).mo181313b(arrayList2).mo181308a(apVar);
        }
        ReactionPanelFacade a = c.mo181310a(true).mo181311a();
        IMomentClickListener aVar = this.f119834c;
        if (aVar == null || a.mo181296a(aVar.mo166614a()) == null) {
            a.mo181298a(this.itemView);
        }
        MomentsHitPointNew.f119721a.mo166862b(bVar.mo166379a());
    }

    /* renamed from: y */
    private final void m188272y(IMomentsPost bVar) {
        int i;
        Boolean bool;
        List<ImageSet> d = bVar.mo166443d();
        Media e = bVar.mo166444e();
        if (d != null) {
            i = d.size();
        } else {
            i = 1;
        }
        int a = m188263a(RangesKt.coerceAtLeast(i, 1));
        List<NineImageBean> a2 = NineImageDataParser.f120002a.mo167100a(d, e, a);
        if (CollectionUtils.isEmpty(a2)) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.image_grid_rv);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "itemView.image_grid_rv");
            recyclerView.setVisibility(8);
            return;
        }
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        RecyclerView recyclerView2 = (RecyclerView) view2.findViewById(R.id.image_grid_rv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "itemView.image_grid_rv");
        recyclerView2.setVisibility(0);
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        RecyclerView recyclerView3 = (RecyclerView) view3.findViewById(R.id.image_grid_rv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "itemView.image_grid_rv");
        recyclerView3.setNestedScrollingEnabled(false);
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        RecyclerView recyclerView4 = (RecyclerView) view4.findViewById(R.id.image_grid_rv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView4, "itemView.image_grid_rv");
        GridLayoutManager d2 = m188267d();
        d2.mo6500a(a);
        recyclerView4.setLayoutManager(d2);
        if (this.f119836f == null) {
            this.f119836f = mo166958a(bVar, a2);
        }
        NineImageAdapter aVar = this.f119836f;
        if (aVar != null) {
            bool = aVar.mo167096b(bVar);
        } else {
            bool = null;
        }
        if (Intrinsics.areEqual((Object) bool, (Object) true)) {
            aVar.mo167095a(a2);
        } else {
            aVar = mo166958a(bVar, a2);
            this.f119836f = aVar;
        }
        View view5 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
        RecyclerView recyclerView5 = (RecyclerView) view5.findViewById(R.id.image_grid_rv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView5, "itemView.image_grid_rv");
        recyclerView5.setAdapter(aVar);
    }

    /* renamed from: b */
    public void mo166545b(IMomentsPost bVar) {
        String str;
        boolean z;
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Category L = bVar.mo166427L();
        if (L != null) {
            str = L.name;
        } else {
            str = null;
        }
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (z || !bVar.mo166428M()) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            CardView cardView = (CardView) view.findViewById(R.id.from_label);
            Intrinsics.checkExpressionValueIsNotNull(cardView, "itemView.from_label");
            cardView.setVisibility(8);
            return;
        }
        int dp2px = UIHelper.dp2px(24.0f);
        AvatarImage build = AvatarImage.Builder.obtain(L.icon_key, L.category_id, dp2px, dp2px).build();
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        IRequestCreator override = ImageLoader.with(view2.getContext()).load(build).placeholder(new ColorDrawable(UIHelper.getColor(R.color.ud_N200))).override(dp2px, dp2px);
        Intrinsics.checkExpressionValueIsNotNull(override, "ImageLoader.with(itemVie…onSize, categoryIconSize)");
        IRequestCreator a = C47282k.m187256a(override, ListenerParams.FromType.AVATAR, dp2px, dp2px, false, null, 24, null);
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        a.into((ImageView) view3.findViewById(R.id.iv_from));
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        CardView cardView2 = (CardView) view4.findViewById(R.id.from_label);
        Intrinsics.checkExpressionValueIsNotNull(cardView2, "itemView.from_label");
        cardView2.setVisibility(0);
        View view5 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
        TextView textView = (TextView) view5.findViewById(R.id.tv_from);
        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.tv_from");
        FakeBoldSpan.Companion aVar = FakeBoldSpan.f119246a;
        StringBuilder sb = new StringBuilder();
        View view6 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
        sb.append(UIUtils.getString(view6.getContext(), R.string.Lark_Community_From));
        sb.append(str);
        textView.setText(aVar.mo166167a(sb.toString()));
        if (!L.can_read.booleanValue()) {
            View view7 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
            ((TextView) view7.findViewById(R.id.tv_from)).setTextColor(UIUtils.getColor(this.f119832a, R.color.text_placeholder));
            View view8 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
            ImageView imageView = (ImageView) view8.findViewById(R.id.icRight);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.icRight");
            imageView.setVisibility(8);
            View view9 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
            ((ConstraintLayout) view9.findViewById(R.id.from_layout)).setOnClickListener(new C47520l(this));
            return;
        }
        View view10 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
        ((TextView) view10.findViewById(R.id.tv_from)).setTextColor(UIUtils.getColor(this.f119832a, R.color.ud_N700));
        View view11 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view11, "itemView");
        Context context = view11.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        Drawable iconDrawable = UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_expand_right_filled, UIHelper.getColor(R.color.icon_n2));
        View view12 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view12, "itemView");
        ((ImageView) view12.findViewById(R.id.icRight)).setImageDrawable(iconDrawable);
        View view13 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view13, "itemView");
        ((ConstraintLayout) view13.findViewById(R.id.from_layout)).setOnClickListener(new C47521m(this, L, bVar));
    }

    /* renamed from: c */
    public void mo166546c(IMomentsPost bVar) {
        boolean z;
        float f;
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        RichText c = bVar.mo166442c();
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        CardView cardView = (CardView) view.findViewById(R.id.from_label);
        Intrinsics.checkExpressionValueIsNotNull(cardView, "itemView.from_label");
        if (cardView.getVisibility() == 8) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = 4.0f;
        } else {
            f = 8.0f;
        }
        int dp2px = UIHelper.dp2px(f);
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.content_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "itemView.content_container");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = dp2px;
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            ((RichTextView) view3.findViewById(R.id.post_content)).setTextSize((float) UIHelper.dp2px(17.0f));
            View view4 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            ((RichTextView) view4.findViewById(R.id.post_content)).setDefaultAtUserColor(C25653b.m91893a(C57582a.m223616d(this.f119832a, R.color.text_link_normal), 1.0f));
            View view5 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            ((RichTextView) view5.findViewById(R.id.post_content)).setUrlTextColor(UIUtils.getColor(this.f119832a, R.color.text_link_normal));
            View view6 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
            ((RichTextView) view6.findViewById(R.id.post_content)).setPhoneTextColor(UIUtils.getColor(this.f119832a, R.color.text_link_normal));
            View view7 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
            ((RichTextView) view7.findViewById(R.id.post_content)).setAtSelfBgColor(R.color.primary_pri_500);
            View view8 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
            ((RichTextView) view8.findViewById(R.id.post_content)).setMomentsHashTagListener(new C47510c(this, bVar));
            mo166548e(bVar);
            View view9 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
            ((RichTextView) view9.findViewById(R.id.post_content)).setShowMomentsHashtag(true);
            View view10 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
            ((RichTextView) view10.findViewById(R.id.post_content)).setRichTextListener(new C47511d(this, bVar));
            View view11 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view11, "itemView");
            ((RichTextView) view11.findViewById(R.id.post_content)).setPhoneStringClickListener(new C47512e(this));
            View view12 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view12, "itemView");
            ((RichTextView) view12.findViewById(R.id.post_content)).setAtStringClickListner(new C47513f(this));
            View view13 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view13, "itemView");
            ((RichTextView) view13.findViewById(R.id.post_content)).setUrlStringClickListner(new C47514g(this));
            View view14 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view14, "itemView");
            ((RichTextView) view14.findViewById(R.id.post_content)).mo200508a(c, bVar.mo166379a());
            View view15 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view15, "itemView");
            View findViewById = view15.findViewById(R.id.divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.divider");
            findViewById.setVisibility(0);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: d */
    public void mo166547d(IMomentsPost bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        List<ReactionDetailViewModel> J = bVar.mo166425J();
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        ((ReactionFlowLayout) view.findViewById(R.id.reaction_container)).setTagBackgroundColor(0);
        if (CollectionUtils.isEmpty(J)) {
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            FrameLayout frameLayout = (FrameLayout) view2.findViewById(R.id.reaction_wrapper);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "itemView.reaction_wrapper");
            frameLayout.setVisibility(8);
        } else {
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            FrameLayout frameLayout2 = (FrameLayout) view3.findViewById(R.id.reaction_wrapper);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "itemView.reaction_wrapper");
            frameLayout2.setVisibility(0);
            View view4 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            ((ReactionFlowLayout) view4.findViewById(R.id.reaction_container)).setNewReactionEnable(f119831i);
            View view5 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            ((ReactionFlowLayout) view5.findViewById(R.id.reaction_container)).setReactionMaxWidth(DeviceUtils.getScreenWidth(this.f119832a) - mo166541a());
            IMomentsPost bVar2 = this.f119833b;
            if (bVar2 == null || !bVar2.mo166450i()) {
                View view6 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
                ((ReactionFlowLayout) view6.findViewById(R.id.reaction_container)).mo181183a(mo166542a((List<? extends ReactionDetailViewModel>) J), false);
            } else {
                View view7 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
                ((ReactionFlowLayout) view7.findViewById(R.id.reaction_container)).mo181184b(mo166542a((List<? extends ReactionDetailViewModel>) J), false);
            }
        }
        View view8 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
        ((ReactionFlowLayout) view8.findViewById(R.id.reaction_container)).setReactionClickListener(new C47527r(this, bVar));
        View view9 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
        ((ReactionFlowLayout) view9.findViewById(R.id.reaction_container)).setOnReactionNameTrigger(new C47528s(this));
        View view10 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
        ((ReactionFlowLayout) view10.findViewById(R.id.reaction_container)).setOnReactionMoreTrigger(new C47529t(bVar));
        View view11 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view11, "itemView");
        ((FrameLayout) view11.findViewById(R.id.reaction_wrapper)).setOnClickListener(new View$OnClickListenerC47530u(this, bVar));
        View view12 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view12, "itemView");
        ((FrameLayout) view12.findViewById(R.id.reaction_wrapper)).setOnLongClickListener(new View$OnLongClickListenerC47531v(this, bVar));
    }

    /* renamed from: z */
    private final void m188273z(IMomentsPost bVar) {
        if (m188262A(bVar)) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.status_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "itemView.status_container");
            relativeLayout.setVisibility(8);
            return;
        }
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        RelativeLayout relativeLayout2 = (RelativeLayout) view2.findViewById(R.id.status_container);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "itemView.status_container");
        relativeLayout2.setVisibility(0);
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        ConstraintLayout constraintLayout = (ConstraintLayout) view3.findViewById(R.id.footer_container);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "itemView.footer_container");
        constraintLayout.setVisibility(8);
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        FrameLayout frameLayout = (FrameLayout) view4.findViewById(R.id.reaction_wrapper);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "itemView.reaction_wrapper");
        frameLayout.setVisibility(8);
        View view5 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view5.findViewById(R.id.comment_container);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "itemView.comment_container");
        constraintLayout2.setVisibility(8);
        if (bVar.mo166455n() == Post.CreateStatus.SENDING) {
            View view6 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
            ProgressBar progressBar = (ProgressBar) view6.findViewById(R.id.status_sending);
            Intrinsics.checkExpressionValueIsNotNull(progressBar, "itemView.status_sending");
            progressBar.setVisibility(0);
            View view7 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
            ImageView imageView = (ImageView) view7.findViewById(R.id.status_iv);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.status_iv");
            imageView.setVisibility(8);
            View view8 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
            ((TextView) view8.findViewById(R.id.status_tv)).setTextColor(UIHelper.getColor(R.color.primary_pri_500));
            View view9 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
            TextView textView = (TextView) view9.findViewById(R.id.status_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.status_tv");
            textView.setText(UIUtils.getString(this.f119832a, R.string.Lark_Community_Sending));
        } else if (bVar.mo166455n() == Post.CreateStatus.FAILED) {
            View view10 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
            ProgressBar progressBar2 = (ProgressBar) view10.findViewById(R.id.status_sending);
            Intrinsics.checkExpressionValueIsNotNull(progressBar2, "itemView.status_sending");
            progressBar2.setVisibility(8);
            View view11 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view11, "itemView");
            ImageView imageView2 = (ImageView) view11.findViewById(R.id.status_iv);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "itemView.status_iv");
            imageView2.setVisibility(0);
            Drawable iconDrawable = UDIconUtils.getIconDrawable(this.f119832a, (int) R.drawable.ud_icon_warning_hollow_filled, UIHelper.getColor(R.color.ud_R500));
            View view12 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view12, "itemView");
            ((ImageView) view12.findViewById(R.id.status_iv)).setImageDrawable(iconDrawable);
            View view13 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view13, "itemView");
            ((TextView) view13.findViewById(R.id.status_tv)).setTextColor(UIHelper.getColor(R.color.ud_R500));
            View view14 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view14, "itemView");
            TextView textView2 = (TextView) view14.findViewById(R.id.status_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.status_tv");
            textView2.setText(UIUtils.getString(this.f119832a, R.string.Lark_Community_ClickRetry));
        } else if (bVar.mo166455n() == Post.CreateStatus.ERROR) {
            View view15 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view15, "itemView");
            ProgressBar progressBar3 = (ProgressBar) view15.findViewById(R.id.status_sending);
            Intrinsics.checkExpressionValueIsNotNull(progressBar3, "itemView.status_sending");
            progressBar3.setVisibility(8);
            View view16 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view16, "itemView");
            ImageView imageView3 = (ImageView) view16.findViewById(R.id.status_iv);
            Intrinsics.checkExpressionValueIsNotNull(imageView3, "itemView.status_iv");
            imageView3.setVisibility(0);
            Drawable iconDrawable2 = UDIconUtils.getIconDrawable(this.f119832a, (int) R.drawable.ud_icon_warning_hollow_filled, UIHelper.getColor(R.color.ud_R500));
            View view17 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view17, "itemView");
            ((ImageView) view17.findViewById(R.id.status_iv)).setImageDrawable(iconDrawable2);
            View view18 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view18, "itemView");
            ((TextView) view18.findViewById(R.id.status_tv)).setTextColor(UIHelper.getColor(R.color.ud_R500));
            if (bVar.mo166429N() != null) {
                View view19 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view19, "itemView");
                TextView textView3 = (TextView) view19.findViewById(R.id.status_tv);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.status_tv");
                textView3.setText(bVar.mo166429N());
            }
        } else if (bVar.mo166453l()) {
            View view20 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view20, "itemView");
            ProgressBar progressBar4 = (ProgressBar) view20.findViewById(R.id.status_sending);
            Intrinsics.checkExpressionValueIsNotNull(progressBar4, "itemView.status_sending");
            progressBar4.setVisibility(8);
            View view21 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view21, "itemView");
            ImageView imageView4 = (ImageView) view21.findViewById(R.id.status_iv);
            Intrinsics.checkExpressionValueIsNotNull(imageView4, "itemView.status_iv");
            imageView4.setVisibility(0);
            Drawable iconDrawable3 = UDIconUtils.getIconDrawable(this.f119832a, (int) R.drawable.ud_icon_info_hollow_filled, UIHelper.getColor(R.color.text_placeholder));
            View view22 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view22, "itemView");
            ((ImageView) view22.findViewById(R.id.status_iv)).setImageDrawable(iconDrawable3);
            View view23 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view23, "itemView");
            ((TextView) view23.findViewById(R.id.status_tv)).setTextColor(UIHelper.getColor(R.color.text_placeholder));
            View view24 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view24, "itemView");
            TextView textView4 = (TextView) view24.findViewById(R.id.status_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.status_tv");
            textView4.setText(UIUtils.getString(this.f119832a, R.string.Lark_Community_Pending));
        }
        View view25 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view25, "itemView");
        ((TextView) view25.findViewById(R.id.status_tv)).setOnClickListener(new View$OnClickListenerC47532w(bVar));
        View view26 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view26, "itemView");
        ((ImageView) view26.findViewById(R.id.status_iv)).setOnClickListener(new View$OnClickListenerC47533x(bVar));
        Drawable iconDrawable4 = UDIconUtils.getIconDrawable(this.f119832a, (int) R.drawable.ud_icon_more_outlined, UIHelper.getColor(R.color.icon_n3));
        View view27 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view27, "itemView");
        ((ImageView) view27.findViewById(R.id.status_operation)).setImageDrawable(iconDrawable4);
        View view28 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view28, "itemView");
        ((ImageView) view28.findViewById(R.id.status_operation)).setOnClickListener(new View$OnClickListenerC47534y(this, bVar));
    }

    /* renamed from: a */
    public List<C53061a> mo166542a(List<? extends ReactionDetailViewModel> list) {
        Intrinsics.checkParameterIsNotNull(list, "reactionList");
        ArrayList arrayList = new ArrayList();
        for (ReactionDetailViewModel reactionDetailViewModel : CollectionsKt.sortedWith(list, C47500ac.f119840a)) {
            if (arrayList.size() < 5) {
                arrayList.add(reactionDetailViewModel);
            } else if (reactionDetailViewModel.isSelfInvoke()) {
                arrayList.add(reactionDetailViewModel);
            }
        }
        return ReactionUtils.f119254a.mo166213a(arrayList);
    }

    /* renamed from: f */
    public void mo166549f(IMomentsPost bVar) {
        int i;
        int i2;
        int i3;
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.footer_container);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "itemView.footer_container");
        constraintLayout.setVisibility(0);
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        LKUILottieAnimationView lKUILottieAnimationView = (LKUILottieAnimationView) view2.findViewById(R.id.iv_reaction);
        Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView, "itemView.iv_reaction");
        LKUILottieAnimationView lKUILottieAnimationView2 = lKUILottieAnimationView;
        int i4 = 8;
        if (bVar.mo166457p()) {
            i = 0;
        } else {
            i = 8;
        }
        lKUILottieAnimationView2.setVisibility(i);
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        ImageView imageView = (ImageView) view3.findViewById(R.id.iv_disable_reaction);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.iv_disable_reaction");
        ImageView imageView2 = imageView;
        if (!bVar.mo166457p()) {
            i4 = 0;
        }
        imageView2.setVisibility(i4);
        Context context = this.f119832a;
        boolean p = bVar.mo166457p();
        int i5 = R.color.icon_disable;
        if (p) {
            i2 = R.color.icon_n3;
        } else {
            i2 = R.color.icon_disable;
        }
        Drawable iconDrawable = UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_thumbsup_outlined, UIHelper.getColor(i2));
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        ((ImageView) view4.findViewById(R.id.iv_disable_reaction)).setImageDrawable(iconDrawable);
        View view5 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
        LKUILottieAnimationView lKUILottieAnimationView3 = (LKUILottieAnimationView) view5.findViewById(R.id.iv_reaction);
        Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView3, "itemView.iv_reaction");
        if (!Intrinsics.areEqual(lKUILottieAnimationView3.getImageAssetsFolder(), "moments/")) {
            View view6 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
            LKUILottieAnimationView lKUILottieAnimationView4 = (LKUILottieAnimationView) view6.findViewById(R.id.iv_reaction);
            Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView4, "itemView.iv_reaction");
            lKUILottieAnimationView4.setImageAssetsFolder("moments/");
            View view7 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
            Context context2 = view7.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "itemView.context");
            if (UDUiModeUtils.m93319a(context2)) {
                View view8 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
                ((LKUILottieAnimationView) view8.findViewById(R.id.iv_reaction)).setAnimation("moments/moments_like_dark_anim.json");
            } else {
                View view9 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
                ((LKUILottieAnimationView) view9.findViewById(R.id.iv_reaction)).setAnimation("moments/moments_like_light_anim.json");
            }
        }
        View view10 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
        LKUILottieAnimationView lKUILottieAnimationView5 = (LKUILottieAnimationView) view10.findViewById(R.id.iv_reaction);
        Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView5, "itemView.iv_reaction");
        if (lKUILottieAnimationView5.getFrame() != 0) {
            View view11 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view11, "itemView");
            LKUILottieAnimationView lKUILottieAnimationView6 = (LKUILottieAnimationView) view11.findViewById(R.id.iv_reaction);
            Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView6, "itemView.iv_reaction");
            if (!lKUILottieAnimationView6.isAnimating()) {
                View view12 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view12, "itemView");
                LKUILottieAnimationView lKUILottieAnimationView7 = (LKUILottieAnimationView) view12.findViewById(R.id.iv_reaction);
                Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView7, "itemView.iv_reaction");
                lKUILottieAnimationView7.setFrame(0);
            }
        }
        View view13 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view13, "itemView");
        ((LKUILottieAnimationView) view13.findViewById(R.id.iv_reaction)).setOnClickListener(new C47515h(this, bVar));
        View view14 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view14, "itemView");
        TextView textView = (TextView) view14.findViewById(R.id.tv_reaction);
        boolean p2 = bVar.mo166457p();
        int i6 = R.color.text_placeholder;
        if (p2) {
            i3 = R.color.text_placeholder;
        } else {
            i3 = R.color.text_disable;
        }
        textView.setTextColor(UIHelper.getColor(i3));
        int u = bVar.mo166462u();
        if (u <= 0) {
            View view15 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view15, "itemView");
            TextView textView2 = (TextView) view15.findViewById(R.id.tv_reaction);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.tv_reaction");
            textView2.setVisibility(4);
        } else {
            View view16 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view16, "itemView");
            TextView textView3 = (TextView) view16.findViewById(R.id.tv_reaction);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.tv_reaction");
            textView3.setVisibility(0);
            View view17 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view17, "itemView");
            TextView textView4 = (TextView) view17.findViewById(R.id.tv_reaction);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.tv_reaction");
            textView4.setText(NumberUtils.f119252a.mo166209a(u));
        }
        int m = bVar.mo166454m();
        if (m <= 0) {
            View view18 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view18, "itemView");
            TextView textView5 = (TextView) view18.findViewById(R.id.tv_reply);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "itemView.tv_reply");
            textView5.setVisibility(4);
        } else {
            View view19 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view19, "itemView");
            TextView textView6 = (TextView) view19.findViewById(R.id.tv_reply);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "itemView.tv_reply");
            textView6.setVisibility(0);
            View view20 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view20, "itemView");
            TextView textView7 = (TextView) view20.findViewById(R.id.tv_reply);
            Intrinsics.checkExpressionValueIsNotNull(textView7, "itemView.tv_reply");
            textView7.setText(NumberUtils.f119252a.mo166209a(m));
        }
        C47519k kVar = new C47519k(this, bVar);
        Context context3 = this.f119832a;
        if (bVar.mo166456o()) {
            i5 = R.color.icon_n3;
        }
        Drawable iconDrawable2 = UDIconUtils.getIconDrawable(context3, (int) R.drawable.ud_icon_reply_cn_outlined, UIHelper.getColor(i5));
        View view21 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view21, "itemView");
        ((ImageView) view21.findViewById(R.id.iv_reply)).setImageDrawable(iconDrawable2);
        View view22 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view22, "itemView");
        TextView textView8 = (TextView) view22.findViewById(R.id.tv_reply);
        if (!bVar.mo166456o()) {
            i6 = R.color.text_disable;
        }
        textView8.setTextColor(UIHelper.getColor(i6));
        View view23 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view23, "itemView");
        C47519k kVar2 = kVar;
        ((FrameLayout) view23.findViewById(R.id.reply_container)).setOnClickListener(kVar2);
        View view24 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view24, "itemView");
        ((TextView) view24.findViewById(R.id.tv_reply)).setOnClickListener(kVar2);
        View view25 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view25, "itemView");
        TextView textView9 = (TextView) view25.findViewById(R.id.tv_forward);
        Intrinsics.checkExpressionValueIsNotNull(textView9, "itemView.tv_forward");
        textView9.setVisibility(4);
        C47518j jVar = new C47518j(this, bVar);
        Drawable iconDrawable3 = UDIconUtils.getIconDrawable(this.f119832a, (int) R.drawable.ud_icon_share_outlined, UIHelper.getColor(R.color.icon_n3));
        View view26 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view26, "itemView");
        ((ImageView) view26.findViewById(R.id.iv_forward)).setImageDrawable(iconDrawable3);
        View view27 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view27, "itemView");
        C47518j jVar2 = jVar;
        ((FrameLayout) view27.findViewById(R.id.forward_container)).setOnClickListener(jVar2);
        View view28 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view28, "itemView");
        ((TextView) view28.findViewById(R.id.tv_forward)).setOnClickListener(jVar2);
        Drawable iconDrawable4 = UDIconUtils.getIconDrawable(this.f119832a, (int) R.drawable.ud_icon_more_outlined, UIHelper.getColor(R.color.icon_n3));
        View view29 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view29, "itemView");
        ((ImageView) view29.findViewById(R.id.operation_menu)).setImageDrawable(iconDrawable4);
        View view30 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view30, "itemView");
        ((FrameLayout) view30.findViewById(R.id.operation_container)).setOnClickListener(new C47517i(this, bVar));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$ae */
    public static final class DialogInterface$OnClickListenerC47503ae implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC47503ae f119844a = new DialogInterface$OnClickListenerC47503ae();

        DialogInterface$OnClickListenerC47503ae() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$aq */
    public static final class aq implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final aq f119875a = new aq();

        aq() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$as */
    public static final class as implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final as f119877a = new as();

        as() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J \u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/moments/impl/feed/MomentsPostViewHolder$bindContent$1", "Lcom/ss/android/lark/widget/light/listener/IMomentsHashTagSpanClickListener;", "onHashTagClick", "", "view", "Landroid/view/View;", "id", "", "name", "onHashTagLongClick", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$c */
    public static final class C47510c implements IMomentsHashTagSpanClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPostViewHolder f119882a;

        /* renamed from: b */
        final /* synthetic */ IMomentsPost f119883b;

        @Override // com.ss.android.lark.widget.light.listener.IMomentsHashTagSpanClickListener
        public boolean b_(View view, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(str, "id");
            Intrinsics.checkParameterIsNotNull(str2, "name");
            return false;
        }

        C47510c(MomentsPostViewHolder dVar, IMomentsPost bVar) {
            this.f119882a = dVar;
            this.f119883b = bVar;
        }

        @Override // com.ss.android.lark.widget.light.listener.IMomentsHashTagSpanClickListener
        public void a_(View view, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(str, "id");
            Intrinsics.checkParameterIsNotNull(str2, "name");
            IMomentClickListener aVar = this.f119882a.f119834c;
            if (aVar != null) {
                String str3 = this.f119883b.mo166421F().id;
                Intrinsics.checkExpressionValueIsNotNull(str3, "data.post.id");
                aVar.mo166620a(str, str2, str3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$af */
    public static final class DialogInterface$OnClickListenerC47504af implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ IMomentsPost f119845a;

        DialogInterface$OnClickListenerC47504af(IMomentsPost bVar) {
            this.f119845a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f119845a.mo166417B();
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$ar */
    public static final class ar implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ IMomentsPost f119876a;

        ar(IMomentsPost bVar) {
            this.f119876a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f119876a.mo166418C();
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$at */
    public static final class DialogInterface$OnClickListenerC47508at implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ IMomentsPost f119878a;

        DialogInterface$OnClickListenerC47508at(IMomentsPost bVar) {
            this.f119878a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f119878a.mo166420E();
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/reaction/widget/detailwindow/bean/ReactionDetailViewModel;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.d$ac */
    public static final class C47500ac<T> implements Comparator<ReactionDetailViewModel> {

        /* renamed from: a */
        public static final C47500ac f119840a = new C47500ac();

        C47500ac() {
        }

        /* renamed from: a */
        public final int compare(ReactionDetailViewModel reactionDetailViewModel, ReactionDetailViewModel reactionDetailViewModel2) {
            Intrinsics.checkExpressionValueIsNotNull(reactionDetailViewModel2, "o2");
            int totalCount = reactionDetailViewModel2.getTotalCount();
            Intrinsics.checkExpressionValueIsNotNull(reactionDetailViewModel, "o1");
            return totalCount - reactionDetailViewModel.getTotalCount();
        }
    }

    /* renamed from: a */
    public NineImageAdapter mo166958a(IMomentsPost bVar, List<NineImageBean> list) {
        Intrinsics.checkParameterIsNotNull(bVar, "post");
        Intrinsics.checkParameterIsNotNull(list, "images");
        NineImageAdapter aVar = new NineImageAdapter(this.f119832a);
        aVar.mo167092a(bVar);
        aVar.mo167095a(list);
        return aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsPostViewHolder(View view, IMomentClickListener aVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.f119834c = aVar;
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        this.f119832a = context;
    }

    /* renamed from: a */
    private final void m188265a(String str, List<? extends IMomentsComment> list) {
        T t;
        boolean z;
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.expose_comment_container);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "itemView.expose_comment_container");
        recyclerView.setVisibility(8);
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        FrameLayout frameLayout = (FrameLayout) view2.findViewById(R.id.reaction_wrapper);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "itemView.reaction_wrapper");
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.LayoutParams)) {
            layoutParams = null;
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.f2817i = R.id.comment_container;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            T t2 = t;
            if (!t2.mo166397i() || t2.mo166402n()) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        T t3 = t;
        if (t3 != null) {
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            ConstraintLayout constraintLayout = (ConstraintLayout) view3.findViewById(R.id.comment_container);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "itemView.comment_container");
            constraintLayout.setVisibility(0);
            View view4 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            FrameLayout frameLayout2 = (FrameLayout) view4.findViewById(R.id.hot_comment_label_container);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "itemView.hot_comment_label_container");
            frameLayout2.setVisibility(0);
            CharSequence a = FakeBoldSpan.f119246a.mo166166a(R.string.Lark_Community_HotComments);
            View view5 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            TextView textView = (TextView) view5.findViewById(R.id.hot_comment_label);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.hot_comment_label");
            textView.setText(a);
            View view6 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
            TextView textView2 = (TextView) view6.findViewById(R.id.hot_comment_count_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.hot_comment_count_tv");
            textView2.setVisibility(0);
            if (t3.mo166404p() > 0) {
                View view7 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
                TextView textView3 = (TextView) view7.findViewById(R.id.hot_comment_count_tv);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.hot_comment_count_tv");
                textView3.setVisibility(0);
                View view8 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
                TextView textView4 = (TextView) view8.findViewById(R.id.hot_comment_count_tv);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.hot_comment_count_tv");
                textView4.setText(UIHelper.getQuantityString(R.plurals.Lark_Community_CommentreactionnumberResponses, t3.mo166404p()));
            } else {
                View view9 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
                TextView textView5 = (TextView) view9.findViewById(R.id.hot_comment_count_tv);
                Intrinsics.checkExpressionValueIsNotNull(textView5, "itemView.hot_comment_count_tv");
                textView5.setVisibility(8);
            }
            m188264a((IMomentsComment) t3);
            View view10 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
            ((ConstraintLayout) view10.findViewById(R.id.comment_container)).setOnClickListener(new C47505ag(this, str, t3));
            View view11 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view11, "itemView");
            RecyclerView recyclerView2 = (RecyclerView) view11.findViewById(R.id.comment_rv);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "itemView.comment_rv");
            recyclerView2.setLayoutManager(new LinearLayoutManager(this.f119832a, 1, false));
            View view12 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view12, "itemView");
            RecyclerView recyclerView3 = (RecyclerView) view12.findViewById(R.id.comment_rv);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "itemView.comment_rv");
            recyclerView3.setNestedScrollingEnabled(false);
            ArrayList arrayListOf = CollectionsKt.arrayListOf(t3);
            View view13 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view13, "itemView");
            RecyclerView recyclerView4 = (RecyclerView) view13.findViewById(R.id.comment_rv);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView4, "itemView.comment_rv");
            recyclerView4.setAdapter(new FeedHotCommentAdapter(arrayListOf, false, 2, null));
            return;
        }
        View view14 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view14, "itemView");
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view14.findViewById(R.id.comment_container);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "itemView.comment_container");
        constraintLayout2.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo166959a(View view, IMomentsPost bVar) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        int i6;
        boolean z6;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        View inflate = LayoutInflater.from(this.f119832a).inflate(R.layout.layout_moments_operation_menu, (ViewGroup) null);
        Dialog a = C57811b.m224342a(this.f119832a, inflate, (int) R.style.feedPlusDialog, true);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.btn_broadcast);
        LinearLayout linearLayout2 = linearLayout;
        if (!m188262A(bVar) || !bVar.mo166460s() || bVar.mo166452k()) {
            z = false;
        } else {
            z = true;
        }
        int i7 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        linearLayout2.setOnClickListener(new C47506ah(linearLayout, this, bVar, a));
        LinearLayout linearLayout3 = (LinearLayout) inflate.findViewById(R.id.btn_unset_broadcast);
        if (!m188262A(bVar) || !bVar.mo166460s() || !bVar.mo166452k()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        linearLayout3.setVisibility(i2);
        linearLayout3.setOnClickListener(new C47507ai(this, bVar, a));
        LinearLayout linearLayout4 = (LinearLayout) inflate.findViewById(R.id.btn_edit_broadcast);
        if (!m188262A(bVar) || !bVar.mo166460s() || !bVar.mo166452k()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        linearLayout4.setVisibility(i3);
        linearLayout4.setOnClickListener(new aj(this, bVar, a));
        LinearLayout linearLayout5 = (LinearLayout) inflate.findViewById(R.id.btn_copy_link);
        linearLayout5.setVisibility(0);
        linearLayout5.setOnClickListener(new ak(this, bVar, a));
        LinearLayout linearLayout6 = (LinearLayout) inflate.findViewById(R.id.btn_delete);
        if (bVar.mo166459r() || !m188262A(bVar)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        linearLayout6.setVisibility(i4);
        linearLayout6.setOnClickListener(new al(this, bVar, a));
        LinearLayout linearLayout7 = (LinearLayout) inflate.findViewById(R.id.btn_visibility);
        if (!m188262A(bVar) || !bVar.mo166460s() || bVar.mo166467z() == Post.PostDistributionType.NOT_DISTRIBUTION) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z5) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        linearLayout7.setVisibility(i5);
        linearLayout7.setOnClickListener(new am(this, bVar, a));
        LinearLayout linearLayout8 = (LinearLayout) inflate.findViewById(R.id.btn_report);
        if (bVar.mo166458q()) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        linearLayout8.setVisibility(i6);
        linearLayout8.setOnClickListener(new an(this, bVar, a));
        LinearLayout linearLayout9 = (LinearLayout) inflate.findViewById(R.id.btn_private_chat);
        if (bVar.mo166464w() || !bVar.mo166450i() || !UserGlobalConfigAndSettingsManager.f120180a.mo167306e()) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z6) {
            i7 = 0;
        }
        linearLayout9.setVisibility(i7);
        linearLayout9.setOnClickListener(new ao(this, bVar, a));
        int height = UIUtils.getHeight(inflate);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "contentView");
        int height2 = (height - UIUtils.getHeight((AlignParentWidthRelativeLayout) inflate.findViewById(R.id.pop_window))) / 2;
        int height3 = ((iArr[1] - UIUtils.getHeight((AlignParentWidthRelativeLayout) inflate.findViewById(R.id.pop_window))) - DeviceUtils.getStatusHeight(this.f119832a)) - height2;
        if (height3 < 0) {
            height3 = ((iArr[1] + view.getHeight()) - DeviceUtils.getStatusHeight(this.f119832a)) - height2;
        }
        C57810a.m224339c(this.f119832a, a, new float[]{16.0f - ((float) height2), (float) UIHelper.px2dp((float) height3)});
    }
}
