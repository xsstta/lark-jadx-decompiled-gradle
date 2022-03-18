package com.ss.android.lark.moments.impl.detail.viewholder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.lark.pb.basic.v1.Image;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.moments.v1.Comment;
import com.bytedance.lark.pb.moments.v1.IncompatibleAction;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.dependency.idependency.IChatModuleDependency;
import com.ss.android.lark.moments.dependency.idependency.IProfileModuleDependency;
import com.ss.android.lark.moments.impl.common.span.FakeBoldSpan;
import com.ss.android.lark.moments.impl.common.utils.C47282k;
import com.ss.android.lark.moments.impl.common.utils.ImageUtils;
import com.ss.android.lark.moments.impl.common.utils.ReactionUtils;
import com.ss.android.lark.moments.impl.common.utils.VibratorUtils;
import com.ss.android.lark.moments.impl.commonvo.IMomentsUser;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment;
import com.ss.android.lark.moments.impl.feed.IMomentClickListener;
import com.ss.android.lark.moments.impl.feed.nineimage.MomentsDialogMenuClickListener;
import com.ss.android.lark.moments.impl.feed.nineimage.NineImageViewHolder;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitHelper;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPoint;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPointNew;
import com.ss.android.lark.moments.impl.report.MomentsReportActivity;
import com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout;
import com.ss.android.lark.reaction.widget.flowlayout.ReactionFlowLayout;
import com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b;
import com.ss.android.lark.reaction.widget.panel.C53085d;
import com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.EllipsizedEmojiconTextView;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00010B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\b\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\u0006\u0010*\u001a\u00020\u0013J\u0006\u0010+\u001a\u00020\u0013J\u0010\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u0002H\u0002J\u0010\u0010.\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\u0010\u0010/\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u0002H\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u00061"}, d2 = {"Lcom/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailCommentViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsComment;", "Landroid/view/View;", "itemView", "mListener", "Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "(Landroid/view/View;Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;)V", "drawListener", "Landroid/view/ViewTreeObserver$OnDrawListener;", "getDrawListener", "()Landroid/view/ViewTreeObserver$OnDrawListener;", "drawListener$delegate", "Lkotlin/Lazy;", "mContext", "Landroid/content/Context;", "getMListener", "()Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "bindContent", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "bindFooter", "bindImage", "bindListener", "bindReaction", "bindReply", "bindStatus", "bindUnknownArea", "bindUserInfo", "calculateImageSize", "", "imageSet", "Lcom/bytedance/lark/pb/basic/v1/ImageSet;", "clickLikeReaction", "generateMenuItem", "", "Lcom/ss/android/lark/reaction/widget/panel/ReactionPanelMenuItem;", "getSingleMaxWidth", "", "onBind", "onCellLongClicked", "", "onViewRecycled", "setDrawListener", "showDeleteConfirmDialog", Comment.f24093e, "showPopupMenu", "showReportPage", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.detail.a.b */
public final class MomentsDetailCommentViewHolder extends AbstractC58967a<IMomentsComment, View> {

    /* renamed from: b */
    public static final Companion f119500b = new Companion(null);

    /* renamed from: e */
    private static final int f119501e = UIHelper.dp2px(24.0f);

    /* renamed from: f */
    private static final boolean f119502f = MomentsDependencyHolder.f118998b.mo165901b().mo166491c();

    /* renamed from: a */
    public final Context f119503a;

    /* renamed from: c */
    private final Lazy f119504c = LazyKt.lazy(C47350p.INSTANCE);

    /* renamed from: d */
    private final IMomentClickListener f119505d;

    /* renamed from: d */
    private final ViewTreeObserver.OnDrawListener m187729d() {
        return (ViewTreeObserver.OnDrawListener) this.f119504c.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailCommentViewHolder$Companion;", "", "()V", "ANIMATION_JSON_DIR", "", "AVATAR_SIZE", "", "DARK_ANIMATION_JSON_DIR", "KEY_REACTION_LIKE", "LIGHT_ANIMATION_JSON_DIR", "sNewReactionEnabled", "", "create", "Lcom/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailCommentViewHolder;", "parent", "Landroid/view/ViewGroup;", "listener", "Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsDetailCommentViewHolder mo166520a(ViewGroup viewGroup, IMomentClickListener aVar) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            Intrinsics.checkParameterIsNotNull(aVar, "listener");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_moments_comment, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new MomentsDetailCommentViewHolder(inflate, aVar);
        }
    }

    /* renamed from: c */
    public final IMomentClickListener mo166516c() {
        return this.f119505d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/ViewTreeObserver$OnDrawListener;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.b$p */
    static final class C47350p extends Lambda implements Function0<ViewTreeObserver.OnDrawListener> {
        public static final C47350p INSTANCE = new C47350p();

        C47350p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewTreeObserver.OnDrawListener invoke() {
            return ViewTreeObserver$OnDrawListenerC473511.f119529a;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.b$r */
    public static final class C47353r implements C53085d.AbstractC53086a {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailCommentViewHolder f119532a;

        /* renamed from: b */
        final /* synthetic */ IMomentsComment f119533b;

        C47353r(MomentsDetailCommentViewHolder bVar, IMomentsComment aVar) {
            this.f119532a = bVar;
            this.f119533b = aVar;
        }

        @Override // com.ss.android.lark.reaction.widget.panel.C53085d.AbstractC53086a
        public final void onMenuItemClick() {
            this.f119532a.mo166517c(this.f119533b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.b$t */
    public static final class C47355t implements C53085d.AbstractC53086a {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailCommentViewHolder f119536a;

        /* renamed from: b */
        final /* synthetic */ IMomentsComment f119537b;

        C47355t(MomentsDetailCommentViewHolder bVar, IMomentsComment aVar) {
            this.f119536a = bVar;
            this.f119537b = aVar;
        }

        @Override // com.ss.android.lark.reaction.widget.panel.C53085d.AbstractC53086a
        public final void onMenuItemClick() {
            this.f119536a.mo166518d(this.f119537b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.b$q */
    public static final class C47352q implements C53085d.AbstractC53086a {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailCommentViewHolder f119530a;

        /* renamed from: b */
        final /* synthetic */ IMomentsComment f119531b;

        C47352q(MomentsDetailCommentViewHolder bVar, IMomentsComment aVar) {
            this.f119530a = bVar;
            this.f119531b = aVar;
        }

        @Override // com.ss.android.lark.reaction.widget.panel.C53085d.AbstractC53086a
        public final void onMenuItemClick() {
            this.f119531b.mo166380a(this.f119530a.f119503a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.b$s */
    public static final class C47354s implements C53085d.AbstractC53086a {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailCommentViewHolder f119534a;

        /* renamed from: b */
        final /* synthetic */ IMomentsComment f119535b;

        C47354s(MomentsDetailCommentViewHolder bVar, IMomentsComment aVar) {
            this.f119534a = bVar;
            this.f119535b = aVar;
        }

        @Override // com.ss.android.lark.reaction.widget.panel.C53085d.AbstractC53086a
        public final void onMenuItemClick() {
            this.f119534a.mo166516c().mo166625c(this.f119535b.mo166379a(), MomentsHitHelper.f119719r.mo166828p());
        }
    }

    /* renamed from: e */
    private final int m187730e() {
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        return (int) (((float) DeviceUtils.getScreenWidth(view.getContext())) * 0.6f);
    }

    /* renamed from: a */
    public final void mo166512a() {
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        view.getViewTreeObserver().addOnDrawListener(m187729d());
    }

    /* renamed from: b */
    public final void mo166514b() {
        ImageUtils bVar = ImageUtils.f119250a;
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) view.findViewById(R.id.content_image);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "itemView.content_image");
        bVar.mo166200a(lKUIRoundedImageView2);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.b$u */
    public static final class C47356u implements C53085d.AbstractC53086a {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailCommentViewHolder f119538a;

        /* renamed from: b */
        final /* synthetic */ IMomentsComment f119539b;

        /* renamed from: c */
        final /* synthetic */ String f119540c;

        C47356u(MomentsDetailCommentViewHolder bVar, IMomentsComment aVar, String str) {
            this.f119538a = bVar;
            this.f119539b = aVar;
            this.f119540c = str;
        }

        @Override // com.ss.android.lark.reaction.widget.panel.C53085d.AbstractC53086a
        public final void onMenuItemClick() {
            IMomentClickListener c = this.f119538a.mo166516c();
            Context context = this.f119538a.f119503a;
            String a = this.f119539b.mo166379a();
            String str = this.f119540c;
            if (str == null) {
                str = "";
            }
            IMomentClickListener.C47490a.m188215a(c, context, null, a, str, 2, null);
            MomentsHitPointNew.Companion aVar = MomentsHitPointNew.f119721a;
            String str2 = this.f119539b.mo166412w().post_id;
            Intrinsics.checkExpressionValueIsNotNull(str2, "data.comment.post_id");
            aVar.mo166863b(str2, "secret_chat", "moments_secret_chat_confirm_view");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailCommentViewHolder$bindFooter$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.b$f */
    public static final class C47339f extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailCommentViewHolder f119511a;

        /* renamed from: b */
        final /* synthetic */ IMomentsComment f119512b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailCommentViewHolder$bindFooter$1$onSingleClick$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.detail.a.b$f$a */
        public static final class C47340a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C47339f f119513a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C47340a(C47339f fVar) {
                this.f119513a = fVar;
            }

            public void onAnimationCancel(Animator animator) {
                this.f119513a.f119511a.mo166519e(this.f119513a.f119512b);
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                this.f119513a.f119511a.mo166519e(this.f119513a.f119512b);
            }
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            View view2 = this.f119511a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            LKUILottieAnimationView lKUILottieAnimationView = (LKUILottieAnimationView) view2.findViewById(R.id.iv_reaction);
            Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView, "itemView.iv_reaction");
            if (!lKUILottieAnimationView.isAnimating()) {
                View view3 = this.f119511a.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
                LKUILottieAnimationView lKUILottieAnimationView2 = (LKUILottieAnimationView) view3.findViewById(R.id.iv_reaction);
                Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView2, "itemView.iv_reaction");
                if (!lKUILottieAnimationView2.isAnimating()) {
                    if (!this.f119512b.mo166407s()) {
                        View view4 = this.f119511a.itemView;
                        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
                        ((LKUILottieAnimationView) view4.findViewById(R.id.iv_reaction)).playAnimation();
                    } else {
                        MomentsHitHelper.f119719r.mo166794a("btn", Comment.f24093e);
                        this.f119512b.mo166383a("THUMBSUP");
                        return;
                    }
                }
                VibratorUtils.f119257a.mo166220a(this.f119511a.f119503a, 30);
                View view5 = this.f119511a.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
                ((LKUILottieAnimationView) view5.findViewById(R.id.iv_reaction)).addAnimatorListener(new C47340a(this));
            }
        }

        C47339f(MomentsDetailCommentViewHolder bVar, IMomentsComment aVar) {
            this.f119511a = bVar;
            this.f119512b = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailCommentViewHolder$bindContent$1", "Lcom/ss/android/lark/widget/linked_emojicon/widget/LinkEmojiTextView$IPhoneStringClickListener;", "onPhoneClick", "", "view", "Landroid/view/View;", "phoneNumber", "", "onPhoneLongClick", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.b$b */
    public static final class C47335b implements LinkEmojiTextView.AbstractC58524i {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailCommentViewHolder f119506a;

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
        /* renamed from: b */
        public void mo122809b(View view, String str) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47335b(MomentsDetailCommentViewHolder bVar) {
            this.f119506a = bVar;
        }

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
        /* renamed from: a */
        public void mo122808a(View view, String str) {
            MomentsDependencyHolder.f118998b.mo165899a().phoneModuleDependency().mo144726a(this.f119506a.f119503a, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\t\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailCommentViewHolder$bindContent$2", "Lcom/ss/android/lark/widget/linked_emojicon/widget/LinkEmojiTextView$IAtStringClickListenr;", "onAtClick", "", "view", "Landroid/view/View;", "text", "", "userId", "onAtLongClick", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.b$c */
    public static final class C47336c implements LinkEmojiTextView.AbstractC58521f {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailCommentViewHolder f119507a;

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
        /* renamed from: b */
        public boolean mo117507b(View view, String str, String str2) {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47336c(MomentsDetailCommentViewHolder bVar) {
            this.f119507a = bVar;
        }

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
        /* renamed from: c */
        public void mo120297c(View view, String str, String str2) {
            if (str2 != null) {
                MomentsHitPoint.f119720a.mo166849f("detail_page");
                MomentsDependencyHolder.f118998b.mo165899a().profileModuleDependency().mo144727a(this.f119507a.f119503a, str2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\b\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailCommentViewHolder$bindContent$3", "Lcom/ss/android/lark/widget/linked_emojicon/widget/LinkEmojiTextView$IURLStringClickListener;", "onURLClick", "", "view", "Landroid/view/View;", "url", "", "onURLLongClick", "", "text", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.b$d */
    public static final class C47337d implements LinkEmojiTextView.AbstractC58525j {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailCommentViewHolder f119508a;

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
        /* renamed from: b */
        public boolean mo122807b(View view, String str) {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47337d(MomentsDetailCommentViewHolder bVar) {
            this.f119508a = bVar;
        }

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
        /* renamed from: a */
        public void mo122806a(View view, String str) {
            if (str != null) {
                MomentsDependencyHolder.f118998b.mo165899a().browserModuleDependency().mo144693a(this.f119508a.f119503a, str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailCommentViewHolder$showPopupMenu$listener$1", "Lcom/ss/android/lark/reaction/widget/panel/ReactionPanelFacade$ReactionClickListener;", "onReactionClick", "", "reactionKey", "", "reactionResource", "", "onShowLessBtnClick", "onShowMoreBtnClick", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.b$x */
    public static final class C47359x implements ReactionPanelFacade.AbstractC53072b {

        /* renamed from: a */
        final /* synthetic */ IMomentsComment f119543a;

        @Override // com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade.AbstractC53072b
        /* renamed from: a */
        public void mo22763a() {
        }

        @Override // com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade.AbstractC53072b
        /* renamed from: b */
        public void mo22765b() {
        }

        C47359x(IMomentsComment aVar) {
            this.f119543a = aVar;
        }

        @Override // com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade.AbstractC53072b
        /* renamed from: a */
        public void mo22764a(String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "reactionKey");
            MomentsHitHelper.f119719r.mo166794a("long_click", Comment.f24093e);
            this.f119543a.mo166383a(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "reactionKey", "", "kotlin.jvm.PlatformType", "perform"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.b$m */
    public static final class C47347m implements ReactionBaseFlowLayout.AbstractC53047b {

        /* renamed from: a */
        final /* synthetic */ IMomentsComment f119525a;

        C47347m(IMomentsComment aVar) {
            this.f119525a = aVar;
        }

        @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout.AbstractC53047b
        public final void perform(String str) {
            IMomentsComment aVar = this.f119525a;
            Intrinsics.checkExpressionValueIsNotNull(str, "reactionKey");
            aVar.mo166387b(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.b$n */
    public static final class View$OnClickListenerC47348n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ IMomentsComment f119526a;

        View$OnClickListenerC47348n(IMomentsComment aVar) {
            this.f119526a = aVar;
        }

        public final void onClick(View view) {
            if (this.f119526a.mo166406r() == Comment.CreateStatus.FAILED) {
                this.f119526a.mo166411v();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailCommentViewHolder$bindUserInfo$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.b$o */
    public static final class C47349o extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailCommentViewHolder f119527a;

        /* renamed from: b */
        final /* synthetic */ IMomentsUser f119528b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            IMomentsUser cVar = this.f119528b;
            if (cVar != null) {
                cVar.mo166362a(this.f119527a.f119503a);
            }
        }

        C47349o(MomentsDetailCommentViewHolder bVar, IMomentsUser cVar) {
            this.f119527a = bVar;
            this.f119528b = cVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailCommentViewHolder$bindContent$4", "Lcom/ss/android/lark/widget/richtext/RichTextView$RichTextListener;", "onTextClick", "", "textView", "Landroid/widget/TextView;", "onTextLongClick", "text", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.b$e */
    public static final class C47338e implements RichTextView.AbstractC59025c {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailCommentViewHolder f119509a;

        /* renamed from: b */
        final /* synthetic */ IMomentsComment f119510b;

        @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59025c
        /* renamed from: a */
        public void mo124117a(TextView textView) {
            this.f119509a.mo166516c().mo166618a(this.f119510b.mo166379a(), MomentsHitHelper.f119719r.mo166828p());
        }

        C47338e(MomentsDetailCommentViewHolder bVar, IMomentsComment aVar) {
            this.f119509a = bVar;
            this.f119510b = aVar;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59025c
        /* renamed from: a */
        public void mo124118a(String str, TextView textView) {
            this.f119509a.mo166515b(this.f119510b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailCommentViewHolder$bindListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.b$h */
    public static final class C47342h extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailCommentViewHolder f119516a;

        /* renamed from: b */
        final /* synthetic */ IMomentsComment f119517b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f119516a.mo166516c().mo166618a(this.f119517b.mo166379a(), MomentsHitHelper.f119719r.mo166828p());
        }

        C47342h(MomentsDetailCommentViewHolder bVar, IMomentsComment aVar) {
            this.f119516a = bVar;
            this.f119517b = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "userId", "", "kotlin.jvm.PlatformType", "perform"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.b$l */
    public static final class C47346l implements ReactionBaseFlowLayout.AbstractC53046a {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailCommentViewHolder f119524a;

        C47346l(MomentsDetailCommentViewHolder bVar) {
            this.f119524a = bVar;
        }

        @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout.AbstractC53046a
        public final void perform(String str) {
            MomentsHitPoint.f119720a.mo166849f("reaction_page");
            IProfileModuleDependency profileModuleDependency = MomentsDependencyHolder.f118998b.mo165899a().profileModuleDependency();
            Context context = this.f119524a.f119503a;
            Intrinsics.checkExpressionValueIsNotNull(str, "userId");
            profileModuleDependency.mo144727a(context, str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.b$i */
    public static final class View$OnLongClickListenerC47343i implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailCommentViewHolder f119518a;

        /* renamed from: b */
        final /* synthetic */ IMomentsComment f119519b;

        View$OnLongClickListenerC47343i(MomentsDetailCommentViewHolder bVar, IMomentsComment aVar) {
            this.f119518a = bVar;
            this.f119519b = aVar;
        }

        public final boolean onLongClick(View view) {
            MomentsHitPointNew.Companion.m188110a(MomentsHitPointNew.f119721a, this.f119519b.mo166379a(), "reaction_press", "moments_msg_menu_view", MomentsHitHelper.f119719r.mo166828p(), (String) null, 16, (Object) null);
            return this.f119518a.mo166515b(this.f119519b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.b$j */
    public static final class View$OnLongClickListenerC47344j implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailCommentViewHolder f119520a;

        /* renamed from: b */
        final /* synthetic */ IMomentsComment f119521b;

        View$OnLongClickListenerC47344j(MomentsDetailCommentViewHolder bVar, IMomentsComment aVar) {
            this.f119520a = bVar;
            this.f119521b = aVar;
        }

        public final boolean onLongClick(View view) {
            MomentsHitPointNew.Companion.m188110a(MomentsHitPointNew.f119721a, this.f119521b.mo166379a(), "comment_press", "moments_msg_menu_view", MomentsHitHelper.f119719r.mo166828p(), (String) null, 16, (Object) null);
            return this.f119520a.mo166515b(this.f119521b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "reactionKey", "", "kotlin.jvm.PlatformType", "onReactionClicked"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.b$k */
    public static final class C47345k implements ReactionBaseFlowLayout.AbstractC53049d {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailCommentViewHolder f119522a;

        /* renamed from: b */
        final /* synthetic */ IMomentsComment f119523b;

        C47345k(MomentsDetailCommentViewHolder bVar, IMomentsComment aVar) {
            this.f119522a = bVar;
            this.f119523b = aVar;
        }

        @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout.AbstractC53049d
        public final void onReactionClicked(String str) {
            MomentsHitHelper.f119719r.mo166794a("reaction_list", com.bytedance.ee.bear.middleground.comment.Comment.f24093e);
            if (this.f119523b.mo166399k()) {
                IMomentsComment aVar = this.f119523b;
                Intrinsics.checkExpressionValueIsNotNull(str, "reactionKey");
                aVar.mo166383a(str);
                return;
            }
            View view = this.f119522a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            Context context = view.getContext();
            View view2 = this.f119522a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            LKUIToast.show(context, UIUtils.getString(view2.getContext(), R.string.Lark_Moments_ReactionsTurnedOff));
        }
    }

    /* renamed from: h */
    private final void m187733h(IMomentsComment aVar) {
        this.itemView.setOnClickListener(new C47342h(this, aVar));
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        ((LKUILottieAnimationView) view.findViewById(R.id.iv_reaction)).setOnLongClickListener(new View$OnLongClickListenerC47343i(this, aVar));
        this.itemView.setOnLongClickListener(new View$OnLongClickListenerC47344j(this, aVar));
    }

    /* renamed from: a */
    public void mo165944a(IMomentsComment aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        super.mo165944a((Object) aVar);
        m187737l(aVar);
        m187736k(aVar);
        m187738m(aVar);
        m187739n(aVar);
        m187732g(aVar);
        m187740o(aVar);
        m187741p(aVar);
        m187731f(aVar);
        m187733h(aVar);
    }

    /* renamed from: b */
    public final boolean mo166515b(IMomentsComment aVar) {
        this.f119505d.mo166623b(aVar.mo166379a(), MomentsHitHelper.f119719r.mo166828p());
        m187734i(aVar);
        return true;
    }

    /* renamed from: d */
    public final void mo166518d(IMomentsComment aVar) {
        Intent intent = new Intent(this.f119503a, MomentsReportActivity.class);
        intent.putExtra("comment_id", aVar.mo166412w().id);
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        Context context = view.getContext();
        if (context != null) {
            ((Activity) context).startActivity(intent);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    /* renamed from: e */
    public final void mo166519e(IMomentsComment aVar) {
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        ((LKUILottieAnimationView) view.findViewById(R.id.iv_reaction)).removeAllAnimatorListeners();
        MomentsHitHelper.f119719r.mo166794a("btn", com.bytedance.ee.bear.middleground.comment.Comment.f24093e);
        aVar.mo166383a("THUMBSUP");
    }

    /* renamed from: a */
    private final int[] m187728a(ImageSet imageSet) {
        int i;
        int i2;
        Integer num;
        Integer num2;
        Image image = imageSet.origin;
        if (image == null || (num2 = image.width) == null) {
            i = 0;
        } else {
            i = num2.intValue();
        }
        if (image == null || (num = image.height) == null) {
            i2 = 0;
        } else {
            i2 = num.intValue();
        }
        int[] a = com.ss.android.lark.utils.ImageUtils.m224135a(i, i2, m187730e(), m187730e(), NineImageViewHolder.f120005c.mo167104a(), NineImageViewHolder.f120005c.mo167104a());
        a[0] = (int) (((float) a[0]) * 0.75f);
        a[1] = (int) (((float) a[1]) * 0.75f);
        Intrinsics.checkExpressionValueIsNotNull(a, "sizeArray");
        return a;
    }

    /* renamed from: g */
    private final void m187732g(IMomentsComment aVar) {
        String str;
        if (aVar.mo166405q() == null) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(R.id.content_unknown);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.content_unknown");
            textView.setVisibility(8);
            return;
        }
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        TextView textView2 = (TextView) view2.findViewById(R.id.content_unknown);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.content_unknown");
        textView2.setVisibility(0);
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        TextView textView3 = (TextView) view3.findViewById(R.id.content_unknown);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.content_unknown");
        IncompatibleAction q = aVar.mo166405q();
        if (q != null) {
            str = q.hint;
        } else {
            str = null;
        }
        textView3.setText(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailCommentViewHolder$bindImage$1", "Lcom/ss/android/lark/reaction/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.b$g */
    public static final class C47341g extends AbstractView$OnClickListenerC52989b {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailCommentViewHolder f119514a;

        /* renamed from: b */
        final /* synthetic */ ImageSet f119515b;

        @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
        /* renamed from: a */
        public void mo122732a(View view) {
            List<PhotoItem> a = C58659h.m227513a(CollectionsKt.listOf(MomentsDependencyHolder.f118998b.mo165899a().imageDependency().mo144713a(this.f119515b)));
            C58630d.C58631a b = C58630d.m227364a().mo198658a(view).mo198667a(new ArrayList<>(a)).mo198657a(0).mo198674c(false).mo198675d(true).mo198676e(false).mo198678g(false).mo198677f(false).mo198679h(false).mo198682k(true).mo198664a(new MomentsDialogMenuClickListener()).mo198668a(true).mo198659a(Biz.Moments).mo198660a(Scene.Moments).mo198672b(1);
            View view2 = this.f119514a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            Context context = view2.getContext();
            if (context != null) {
                b.mo198669a((Activity) context);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }

        C47341g(MomentsDetailCommentViewHolder bVar, ImageSet imageSet) {
            this.f119514a = bVar;
            this.f119515b = imageSet;
        }
    }

    /* renamed from: i */
    private final void m187734i(IMomentsComment aVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (aVar.mo166399k()) {
            arrayList = MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency().mo144696a();
        } else {
            arrayList = new ArrayList();
        }
        if (aVar.mo166399k()) {
            arrayList2 = MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency().mo144706c();
        } else {
            arrayList2 = new ArrayList();
        }
        C47359x xVar = new C47359x(aVar);
        ReactionPanelFacade.C53071a c = new ReactionPanelFacade.C53071a(this.itemView).mo181315c(m187735j(aVar));
        if (aVar.mo166399k()) {
            c.mo181309a(arrayList).mo181313b(arrayList2).mo181308a(xVar);
        }
        c.mo181310a(true).mo181311a().mo181296a(this.f119505d.mo166614a());
        MomentsHitPointNew.Companion aVar2 = MomentsHitPointNew.f119721a;
        String str = aVar.mo166412w().post_id;
        Intrinsics.checkExpressionValueIsNotNull(str, "data.comment.post_id");
        aVar2.mo166862b(str);
    }

    /* renamed from: l */
    private final void m187737l(IMomentsComment aVar) {
        String str;
        IMomentsUser y = aVar.mo166414y();
        if (y == null) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            ((LKUIRoundedImageView2) view.findViewById(R.id.avatar)).setImageResource(R.drawable.common_chat_window_image_item_holder);
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            TextView textView = (TextView) view2.findViewById(R.id.name);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.name");
            textView.setText("");
        } else {
            String d = y.mo166365d();
            String c = y.mo166364c();
            int i = f119501e;
            IRequestCreator placeholder = ImageLoader.with(this.f119503a).load(AvatarImage.Builder.obtain(d, c, i, i).build()).override(i, i).placeholder(R.drawable.common_chat_window_image_item_holder);
            Intrinsics.checkExpressionValueIsNotNull(placeholder, "ImageLoader.with(mContex…window_image_item_holder)");
            IRequestCreator a = C47282k.m187256a(placeholder, ListenerParams.FromType.AVATAR, i, i, false, null, 24, null);
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            a.into((LKUIRoundedImageView2) view3.findViewById(R.id.avatar));
            if (y.mo166368g() != MomentUser.Type.ANONYMOUS) {
                str = y.mo166361a();
            } else if (Intrinsics.areEqual(y.mo166363b(), "0")) {
                str = UIHelper.getString(R.string.Lark_Community_AnonymousUser);
            } else {
                str = UIHelper.mustacheFormat((int) R.string.Lark_Community_SpectatorNumber, "number", y.mo166363b());
            }
            View view4 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            TextView textView2 = (TextView) view4.findViewById(R.id.name);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.name");
            textView2.setText(FakeBoldSpan.f119246a.mo166167a(str));
        }
        View view5 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
        ((LKUIRoundedImageView2) view5.findViewById(R.id.avatar)).setOnClickListener(new C47349o(this, y));
    }

    /* renamed from: m */
    private final void m187738m(IMomentsComment aVar) {
        RichText b = aVar.mo166386b();
        if (C59035h.m229210a(b)) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            RichTextView richTextView = (RichTextView) view.findViewById(R.id.content);
            Intrinsics.checkExpressionValueIsNotNull(richTextView, "itemView.content");
            richTextView.setVisibility(8);
            return;
        }
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        RichTextView richTextView2 = (RichTextView) view2.findViewById(R.id.content);
        Intrinsics.checkExpressionValueIsNotNull(richTextView2, "itemView.content");
        richTextView2.setVisibility(0);
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        ((RichTextView) view3.findViewById(R.id.content)).setShowMomentsHashtag(true);
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        ((RichTextView) view4.findViewById(R.id.content)).setUrlTextColor(UIHelper.getColor(R.color.text_link_normal));
        View view5 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
        ((RichTextView) view5.findViewById(R.id.content)).setPhoneTextColor(UIHelper.getColor(R.color.text_link_normal));
        View view6 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
        ((RichTextView) view6.findViewById(R.id.content)).setDefaultAtUserColor(C25653b.m91893a(C57582a.m223616d(this.f119503a, R.color.text_link_normal), 1.0f));
        View view7 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
        ((RichTextView) view7.findViewById(R.id.content)).setAtSelfBgColor(R.color.primary_pri_500);
        View view8 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
        ((RichTextView) view8.findViewById(R.id.content)).setPhoneStringClickListener(new C47335b(this));
        View view9 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
        ((RichTextView) view9.findViewById(R.id.content)).setAtStringClickListner(new C47336c(this));
        View view10 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
        ((RichTextView) view10.findViewById(R.id.content)).setUrlStringClickListner(new C47337d(this));
        View view11 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view11, "itemView");
        ((RichTextView) view11.findViewById(R.id.content)).setRichTextListener(new C47338e(this, aVar));
        View view12 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view12, "itemView");
        ((RichTextView) view12.findViewById(R.id.content)).mo200508a(b, aVar.mo166379a());
    }

    /* renamed from: n */
    private final void m187739n(IMomentsComment aVar) {
        ImageSet c = aVar.mo166389c();
        if (c == null || !ImageUtils.f119250a.mo166202a(c)) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) view.findViewById(R.id.content_image);
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "itemView.content_image");
            lKUIRoundedImageView2.setVisibility(8);
            return;
        }
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        LKUIRoundedImageView2 lKUIRoundedImageView22 = (LKUIRoundedImageView2) view2.findViewById(R.id.content_image);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView22, "itemView.content_image");
        lKUIRoundedImageView22.setVisibility(0);
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        ((LKUIRoundedImageView2) view3.findViewById(R.id.content_image)).setBorderColor(C25653b.m91893a(UIHelper.getColor(R.color.ud_N900), 0.15f));
        int[] a = m187728a(c);
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        LKUIRoundedImageView2 lKUIRoundedImageView23 = (LKUIRoundedImageView2) view4.findViewById(R.id.content_image);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView23, "itemView.content_image");
        ViewGroup.LayoutParams layoutParams = lKUIRoundedImageView23.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = a[0];
            marginLayoutParams.height = a[1];
            ImageUtils bVar = ImageUtils.f119250a;
            View view5 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            LKUIRoundedImageView2 lKUIRoundedImageView24 = (LKUIRoundedImageView2) view5.findViewById(R.id.content_image);
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView24, "itemView.content_image");
            ImageUtils.m187225a(bVar, c, lKUIRoundedImageView24, a[0], a[1], null, 16, null);
            View view6 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
            ((LKUIRoundedImageView2) view6.findViewById(R.id.content_image)).setOnClickListener(new C47341g(this, c));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: c */
    public final void mo166517c(IMomentsComment aVar) {
        MomentUser.Type type;
        String str;
        String str2;
        C25639g gVar = new C25639g(this.f119503a);
        if (aVar.mo166403o()) {
            gVar.mo89237b(UIHelper.getString(R.string.Lark_Community_AreYouSureYouWantToDeleteThisComment));
        } else {
            IMomentsUser y = aVar.mo166414y();
            String str3 = null;
            if (y != null) {
                type = y.mo166368g();
            } else {
                type = null;
            }
            if (type == MomentUser.Type.ANONYMOUS) {
                IMomentsUser y2 = aVar.mo166414y();
                if (y2 != null) {
                    str2 = y2.mo166363b();
                } else {
                    str2 = null;
                }
                if (Intrinsics.areEqual(str2, "0")) {
                    str = UIHelper.getString(R.string.Lark_Community_AnonymousUser);
                } else {
                    IMomentsUser y3 = aVar.mo166414y();
                    if (y3 != null) {
                        str3 = y3.mo166363b();
                    }
                    str = UIHelper.mustacheFormat((int) R.string.Lark_Community_SpectatorNumber, "number", str3);
                }
            } else {
                IMomentsUser y4 = aVar.mo166414y();
                if (y4 == null || (str = y4.mo166361a()) == null) {
                    str = "";
                }
            }
            gVar.mo89237b(UIHelper.mustacheFormat((int) R.string.Lark_Community_AreYouSureDeleteComment, "deleteCommentUserName", str));
        }
        gVar.mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_CancelTip, DialogInterface$OnClickListenerC47357v.f119541a);
        gVar.mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Community_DeleteConfirm, new DialogInterface$OnClickListenerC47358w(aVar));
        gVar.mo89239c();
    }

    /* renamed from: f */
    private final void m187731f(IMomentsComment aVar) {
        if (aVar.mo166406r() == Comment.CreateStatus.SUCCESS) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.status_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "itemView.status_container");
            linearLayout.setVisibility(8);
            return;
        }
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        FrameLayout frameLayout = (FrameLayout) view2.findViewById(R.id.reaction_wrapper);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "itemView.reaction_wrapper");
        frameLayout.setVisibility(8);
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        LinearLayout linearLayout2 = (LinearLayout) view3.findViewById(R.id.status_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "itemView.status_container");
        linearLayout2.setVisibility(0);
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        TextView textView = (TextView) view4.findViewById(R.id.time_label);
        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.time_label");
        textView.setVisibility(8);
        View view5 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
        LKUILottieAnimationView lKUILottieAnimationView = (LKUILottieAnimationView) view5.findViewById(R.id.iv_reaction);
        Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView, "itemView.iv_reaction");
        lKUILottieAnimationView.setVisibility(8);
        int i = C47360c.f119544a[aVar.mo166406r().ordinal()];
        if (i == 1) {
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
            TextView textView2 = (TextView) view9.findViewById(R.id.status_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.status_tv");
            textView2.setText(UIUtils.getString(this.f119503a, R.string.Lark_Community_Sending));
        } else if (i == 2) {
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
            Drawable iconDrawable = UDIconUtils.getIconDrawable(this.f119503a, (int) R.drawable.ud_icon_warning_hollow_filled, UIHelper.getColor(R.color.ud_R500));
            View view12 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view12, "itemView");
            ((ImageView) view12.findViewById(R.id.status_iv)).setImageDrawable(iconDrawable);
            View view13 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view13, "itemView");
            ((TextView) view13.findViewById(R.id.status_tv)).setTextColor(UIHelper.getColor(R.color.ud_R500));
            View view14 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view14, "itemView");
            TextView textView3 = (TextView) view14.findViewById(R.id.status_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.status_tv");
            textView3.setText(UIUtils.getString(this.f119503a, R.string.Lark_Community_ClickRetry));
        } else if (i == 3) {
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
            Drawable iconDrawable2 = UDIconUtils.getIconDrawable(this.f119503a, (int) R.drawable.ud_icon_warning_hollow_filled, UIHelper.getColor(R.color.ud_R500));
            View view17 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view17, "itemView");
            ((ImageView) view17.findViewById(R.id.status_iv)).setImageDrawable(iconDrawable2);
            View view18 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view18, "itemView");
            ((TextView) view18.findViewById(R.id.status_tv)).setTextColor(UIHelper.getColor(R.color.ud_R500));
            View view19 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view19, "itemView");
            TextView textView4 = (TextView) view19.findViewById(R.id.status_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.status_tv");
            textView4.setText(aVar.mo166377F());
        }
        View view20 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view20, "itemView");
        ((LinearLayout) view20.findViewById(R.id.status_container)).setOnClickListener(new View$OnClickListenerC47348n(aVar));
    }

    /* renamed from: j */
    private final List<C53085d> m187735j(IMomentsComment aVar) {
        MomentUser.Type type;
        String str;
        ArrayList arrayList = new ArrayList();
        C53085d dVar = new C53085d(UIUtils.getString(this.f119503a, R.string.Lark_Community_Reply), C47282k.m187254a(this.f119503a, (int) R.drawable.ud_icon_reply_cn_outlined, 22.0f, 22.0f, (Integer) null, 8, (Object) null), new C47354s(this, aVar));
        dVar.f131259i = aVar.mo166398j();
        arrayList.add(dVar);
        arrayList.add(new C53085d(UIHelper.getString(R.string.Lark_Community_Copy), C47282k.m187254a(this.f119503a, (int) R.drawable.ud_icon_copy_outlined, 22.0f, 22.0f, (Integer) null, 8, (Object) null), new C47352q(this, aVar)));
        if (aVar.mo166400l()) {
            arrayList.add(new C53085d(UIUtils.getString(this.f119503a, R.string.Lark_Community_Report), C47282k.m187254a(this.f119503a, (int) R.drawable.ud_icon_alarm_outlined, 22.0f, 22.0f, (Integer) null, 8, (Object) null), new C47355t(this, aVar)));
        }
        if (aVar.mo166401m()) {
            arrayList.add(new C53085d(UIUtils.getString(this.f119503a, R.string.Lark_Community_Delete), C47282k.m187254a(this.f119503a, (int) R.drawable.ud_icon_delete_trash_outlined, 22.0f, 22.0f, (Integer) null, 8, (Object) null), new C47353r(this, aVar)));
        }
        if (!aVar.mo166403o() && aVar.mo166394g() && UserGlobalConfigAndSettingsManager.f120180a.mo167306e()) {
            IMomentsUser y = aVar.mo166414y();
            String str2 = null;
            if (y != null) {
                type = y.mo166368g();
            } else {
                type = null;
            }
            if (type == MomentUser.Type.ANONYMOUS) {
                IMomentsUser y2 = aVar.mo166414y();
                if (y2 != null) {
                    str = y2.mo166363b();
                } else {
                    str = null;
                }
                if (Intrinsics.areEqual(str, "0")) {
                    str2 = UIHelper.getString(R.string.Lark_Community_AnonymousUser);
                } else {
                    IMomentsUser y3 = aVar.mo166414y();
                    if (y3 != null) {
                        str2 = y3.mo166363b();
                    }
                    str2 = UIHelper.mustacheFormat((int) R.string.Lark_Community_SpectatorNumber, "number", str2);
                }
            } else {
                IMomentsUser y4 = aVar.mo166414y();
                if (y4 != null) {
                    str2 = y4.mo166361a();
                }
            }
            arrayList.add(new C53085d(UIUtils.getString(this.f119503a, R.string.Lark_Community_SecureChat_Button), C47282k.m187254a(this.f119503a, (int) R.drawable.ud_icon_chat_secret_outlined, 22.0f, 22.0f, (Integer) null, 8, (Object) null), new C47356u(this, aVar, str2)));
        }
        return arrayList;
    }

    /* renamed from: k */
    private final void m187736k(IMomentsComment aVar) {
        String str;
        com.bytedance.lark.pb.basic.v1.RichText richText;
        Integer num;
        Integer num2;
        com.bytedance.lark.pb.moments.v1.Comment D = aVar.mo166375D();
        MomentUser C = aVar.mo166374C();
        Map<String, PreviewHangPoint> E = aVar.mo166376E();
        if (D == null || C == null) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.reply_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "itemView.reply_container");
            linearLayout.setVisibility(8);
            return;
        }
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(R.id.reply_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "itemView.reply_container");
        linearLayout2.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Boolean bool = D.is_deleted;
        Intrinsics.checkExpressionValueIsNotNull(bool, "replyComment.is_deleted");
        if (bool.booleanValue()) {
            spannableStringBuilder.append((CharSequence) UIHelper.getString(R.string.Lark_Community_TheCommentHasBeenDeleted));
        } else {
            ImageSet imageSet = null;
            if (C.type == MomentUser.Type.ANONYMOUS) {
                MomentUser.AnonymousUser anonymousUser = C.anonymous;
                if (anonymousUser != null) {
                    num = anonymousUser.idx;
                } else {
                    num = null;
                }
                if (num != null && num.intValue() == 0) {
                    str = UIHelper.getString(R.string.Lark_Community_AnonymousUser);
                } else {
                    MomentUser.AnonymousUser anonymousUser2 = C.anonymous;
                    if (anonymousUser2 != null) {
                        num2 = anonymousUser2.idx;
                    } else {
                        num2 = null;
                    }
                    str = UIHelper.mustacheFormat((int) R.string.Lark_Community_SpectatorNumber, "number", String.valueOf(num2));
                }
            } else {
                str = C.name;
            }
            spannableStringBuilder.append((CharSequence) str).append((CharSequence) ": ");
            Comment.CommentContent commentContent = D.content;
            if (!(commentContent == null || (richText = commentContent.content) == null)) {
                IChatModuleDependency chatModuleDependency = MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency();
                Intrinsics.checkExpressionValueIsNotNull(richText, "it");
                RichText a = chatModuleDependency.mo144695a(richText);
                MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency().mo144701a(a, E);
                spannableStringBuilder.append(C59035h.m229205a(a, false, false, true, false, true, false, UIHelper.getColor(R.color.text_placeholder)));
            }
            Comment.CommentContent commentContent2 = D.content;
            if (commentContent2 != null) {
                imageSet = commentContent2.image_set;
            }
            if (imageSet != null) {
                spannableStringBuilder.append((CharSequence) UIHelper.getString(R.string.Lark_Legacy_MessagePoPhoto));
            }
        }
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView = (EllipsizedEmojiconTextView) view3.findViewById(R.id.reply_digest);
        Intrinsics.checkExpressionValueIsNotNull(ellipsizedEmojiconTextView, "itemView.reply_digest");
        ellipsizedEmojiconTextView.setText(spannableStringBuilder);
    }

    /* renamed from: o */
    private final void m187740o(IMomentsComment aVar) {
        int i;
        List<ReactionDetailViewModel> z = aVar.mo166415z();
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        ((ReactionFlowLayout) view.findViewById(R.id.reaction_container)).setTagBackgroundColor(0);
        if (CollectionUtils.isEmpty(z)) {
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
            ((ReactionFlowLayout) view4.findViewById(R.id.reaction_container)).setNewReactionEnable(f119502f);
            View view5 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            FrameLayout frameLayout3 = (FrameLayout) view5.findViewById(R.id.reaction_wrapper);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout3, "itemView.reaction_wrapper");
            if (frameLayout3.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                View view6 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
                FrameLayout frameLayout4 = (FrameLayout) view6.findViewById(R.id.reaction_wrapper);
                Intrinsics.checkExpressionValueIsNotNull(frameLayout4, "itemView.reaction_wrapper");
                ViewGroup.LayoutParams layoutParams = frameLayout4.getLayoutParams();
                if (layoutParams != null) {
                    int i2 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + 0;
                    View view7 = this.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
                    FrameLayout frameLayout5 = (FrameLayout) view7.findViewById(R.id.reaction_wrapper);
                    Intrinsics.checkExpressionValueIsNotNull(frameLayout5, "itemView.reaction_wrapper");
                    ViewGroup.LayoutParams layoutParams2 = frameLayout5.getLayoutParams();
                    if (layoutParams2 != null) {
                        i = i2 + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            } else {
                i = 0;
            }
            View view8 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
            ((ReactionFlowLayout) view8.findViewById(R.id.reaction_container)).setReactionMaxWidth(DeviceUtils.getScreenWidth(this.f119503a) - i);
            if (aVar.mo166373B()) {
                View view9 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
                ((ReactionFlowLayout) view9.findViewById(R.id.reaction_container)).mo181184b(ReactionUtils.f119254a.mo166213a(z), false);
            } else {
                View view10 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
                ((ReactionFlowLayout) view10.findViewById(R.id.reaction_container)).mo181183a(ReactionUtils.f119254a.mo166213a(z), false);
            }
        }
        View view11 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view11, "itemView");
        ((ReactionFlowLayout) view11.findViewById(R.id.reaction_container)).setReactionClickListener(new C47345k(this, aVar));
        View view12 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view12, "itemView");
        ((ReactionFlowLayout) view12.findViewById(R.id.reaction_container)).setOnReactionNameTrigger(new C47346l(this));
        View view13 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view13, "itemView");
        ((ReactionFlowLayout) view13.findViewById(R.id.reaction_container)).setOnReactionMoreTrigger(new C47347m(aVar));
    }

    /* renamed from: p */
    private final void m187741p(IMomentsComment aVar) {
        int i;
        int i2;
        String str;
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        TextView textView = (TextView) view.findViewById(R.id.time_label);
        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.time_label");
        int i3 = 0;
        textView.setVisibility(0);
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        TextView textView2 = (TextView) view2.findViewById(R.id.time_label);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.time_label");
        textView2.setText(aVar.mo166393f());
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        LKUILottieAnimationView lKUILottieAnimationView = (LKUILottieAnimationView) view3.findViewById(R.id.iv_reaction);
        Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView, "itemView.iv_reaction");
        boolean z = true;
        if (!Intrinsics.areEqual(lKUILottieAnimationView.getImageAssetsFolder(), "moments/")) {
            View view4 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            LKUILottieAnimationView lKUILottieAnimationView2 = (LKUILottieAnimationView) view4.findViewById(R.id.iv_reaction);
            Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView2, "itemView.iv_reaction");
            lKUILottieAnimationView2.setImageAssetsFolder("moments/");
            View view5 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            Context context = view5.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
            if (UDUiModeUtils.m93319a(context)) {
                View view6 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
                ((LKUILottieAnimationView) view6.findViewById(R.id.iv_reaction)).setAnimation("moments/moments_like_dark_anim.json");
            } else {
                View view7 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
                ((LKUILottieAnimationView) view7.findViewById(R.id.iv_reaction)).setAnimation("moments/moments_like_light_anim.json");
            }
        }
        View view8 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
        LKUILottieAnimationView lKUILottieAnimationView3 = (LKUILottieAnimationView) view8.findViewById(R.id.iv_reaction);
        Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView3, "itemView.iv_reaction");
        if (lKUILottieAnimationView3.getFrame() != 0) {
            View view9 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
            LKUILottieAnimationView lKUILottieAnimationView4 = (LKUILottieAnimationView) view9.findViewById(R.id.iv_reaction);
            Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView4, "itemView.iv_reaction");
            if (!lKUILottieAnimationView4.isAnimating()) {
                View view10 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
                LKUILottieAnimationView lKUILottieAnimationView5 = (LKUILottieAnimationView) view10.findViewById(R.id.iv_reaction);
                Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView5, "itemView.iv_reaction");
                lKUILottieAnimationView5.setFrame(0);
            }
        }
        View view11 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view11, "itemView");
        ((LKUILottieAnimationView) view11.findViewById(R.id.iv_reaction)).setOnClickListener(new C47339f(this, aVar));
        View view12 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view12, "itemView");
        ImageView imageView = (ImageView) view12.findViewById(R.id.iv_disable_reaction);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.iv_disable_reaction");
        ImageView imageView2 = imageView;
        int i4 = 8;
        if (!aVar.mo166399k()) {
            i = 0;
        } else {
            i = 8;
        }
        imageView2.setVisibility(i);
        View view13 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view13, "itemView");
        LKUILottieAnimationView lKUILottieAnimationView6 = (LKUILottieAnimationView) view13.findViewById(R.id.iv_reaction);
        Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView6, "itemView.iv_reaction");
        LKUILottieAnimationView lKUILottieAnimationView7 = lKUILottieAnimationView6;
        if (aVar.mo166399k()) {
            i4 = 0;
        }
        lKUILottieAnimationView7.setVisibility(i4);
        if (!aVar.mo166399k()) {
            Drawable iconDrawable = UDIconUtils.getIconDrawable(this.f119503a, (int) R.drawable.ud_icon_thumbsup_outlined, UIHelper.getColor(R.color.icon_disable));
            View view14 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view14, "itemView");
            ((ImageView) view14.findViewById(R.id.iv_disable_reaction)).setImageDrawable(iconDrawable);
            View view15 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view15, "itemView");
            TextView textView3 = (TextView) view15.findViewById(R.id.tv_reaction);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.tv_reaction");
            TextView textView4 = textView3;
            textView4.setPadding(UIUtils.dp2px(this.f119503a, 4.0f), textView4.getPaddingTop(), textView4.getPaddingRight(), textView4.getPaddingBottom());
        } else {
            View view16 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view16, "itemView");
            TextView textView5 = (TextView) view16.findViewById(R.id.tv_reaction);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "itemView.tv_reaction");
            TextView textView6 = textView5;
            textView6.setPadding(UIUtils.dp2px(this.f119503a, 30.0f), textView6.getPaddingTop(), textView6.getPaddingRight(), textView6.getPaddingBottom());
        }
        View view17 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view17, "itemView");
        TextView textView7 = (TextView) view17.findViewById(R.id.tv_reaction);
        Intrinsics.checkExpressionValueIsNotNull(textView7, "itemView.tv_reaction");
        TextView textView8 = textView7;
        if (aVar.mo166404p() > 0) {
            z = false;
        }
        if (z) {
            i3 = 4;
        }
        textView8.setVisibility(i3);
        View view18 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view18, "itemView");
        TextView textView9 = (TextView) view18.findViewById(R.id.tv_reaction);
        if (aVar.mo166399k()) {
            i2 = R.color.text_placeholder;
        } else {
            i2 = R.color.text_disable;
        }
        textView9.setTextColor(UIHelper.getColor(i2));
        View view19 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view19, "itemView");
        TextView textView10 = (TextView) view19.findViewById(R.id.tv_reaction);
        Intrinsics.checkExpressionValueIsNotNull(textView10, "itemView.tv_reaction");
        if (aVar.mo166404p() > 0) {
            str = String.valueOf(aVar.mo166404p());
        } else {
            str = "";
        }
        textView10.setText(str);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.b$v */
    public static final class DialogInterface$OnClickListenerC47357v implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC47357v f119541a = new DialogInterface$OnClickListenerC47357v();

        DialogInterface$OnClickListenerC47357v() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.b$w */
    public static final class DialogInterface$OnClickListenerC47358w implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ IMomentsComment f119542a;

        DialogInterface$OnClickListenerC47358w(IMomentsComment aVar) {
            this.f119542a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f119542a.mo166410u();
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsDetailCommentViewHolder(View view, IMomentClickListener aVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(aVar, "mListener");
        this.f119505d = aVar;
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        this.f119503a = context;
    }
}
