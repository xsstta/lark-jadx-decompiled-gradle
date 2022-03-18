package com.ss.android.lark.chat.chatwindow.view.message.plugin.redpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.huawei.hms.location.LocationSettingsStatusCodes;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.chat.view.message.plugin.redpackage.entity.RedPacketContentVO;
import com.ss.android.lark.chat.entity.message.content.RedPacketContent;
import com.ss.android.lark.chat.entity.redpacket.RedPacketCover;
import com.ss.android.lark.chat.export.ui.menu.OpenMenuDataHolder;
import com.ss.android.lark.chat.export.ui.message.IMessageContext;
import com.ss.android.lark.chat.export.ui.message.IOpenCellCallback;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCell;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.export.ui.message.style.C34034b;
import com.ss.android.lark.chat.export.ui.message.style.C34035c;
import com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.export.vo.OpenMessageVO;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.dependency.AbstractC36456ae;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.PassThroughImage;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.statistics.redpacket.RedPacketHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.dialog.CommonLoadingDialog;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u00018B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\u0012\u001a\u0004\u0018\u00010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016J\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016J&\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016J\u001e\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0002J\u0016\u0010(\u001a\u00020\u001f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0002J\u0018\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0016J\"\u0010.\u001a\u00020/2\n\u00100\u001a\u0006\u0012\u0002\b\u0003012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000203H\u0016J,\u00104\u001a\u00020\u001f2\u0014\u00105\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u000101\u0018\u0001062\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000203H\u0016J\u0010\u00107\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0017H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u00069"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/view/message/plugin/redpackage/RedPacketMessageCell;", "Lcom/ss/android/lark/chat/export/ui/message/IOpenMessageCell;", "Lcom/ss/android/lark/chat/chatwindow/chat/view/message/plugin/redpackage/entity/RedPacketContentVO;", "Lcom/ss/android/lark/chat/export/ui/message/style/IOpenBubbleStyleProvider;", "mMessageContext", "Lcom/ss/android/lark/chat/export/ui/message/IMessageContext;", "mOpenCellCallback", "Lcom/ss/android/lark/chat/export/ui/message/IOpenCellCallback;", "(Lcom/ss/android/lark/chat/export/ui/message/IMessageContext;Lcom/ss/android/lark/chat/export/ui/message/IOpenCellCallback;)V", "context", "Landroidx/fragment/app/FragmentActivity;", "moneyModule", "Lcom/ss/android/lark/dependency/IMoneyDependency;", "kotlin.jvm.PlatformType", "getMoneyModule", "()Lcom/ss/android/lark/dependency/IMoneyDependency;", "moneyModule$delegate", "Lkotlin/Lazy;", "getBubbleStyle", "Lcom/ss/android/lark/chat/export/ui/message/style/BubbleStyle;", "messageVO", "Lcom/ss/android/lark/chat/export/vo/OpenMessageVO;", "contentView", "Landroid/view/View;", "getMessageClass", "Ljava/lang/Class;", "getReactionStyle", "Lcom/ss/android/lark/chat/export/ui/message/style/ReactionStyle;", "getReplyStyle", "Lcom/ss/android/lark/chat/export/ui/message/style/ReplyStyle;", "onBindView", "", "itemView", "position", "", "message", "onBindViewHolder", "viewHolder", "Lcom/ss/android/lark/chat/chatwindow/view/message/plugin/redpackage/RedPacketMessageCell$RedPacketMessageViewHolder;", "item", "onCellClicked", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onFilterContextMenu", "", "menuItem", "Lcom/ss/android/lark/chat/export/ui/menu/MenuItem;", "dataHolder", "Lcom/ss/android/lark/chat/export/ui/menu/OpenMenuDataHolder;", "onPrepareContextMenu", "menuItemList", "", "onViewRecycled", "RedPacketMessageViewHolder", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class RedPacketMessageCell implements IOpenMessageCell<RedPacketContentVO>, IOpenBubbleStyleProvider<RedPacketContentVO> {

    /* renamed from: a */
    public final FragmentActivity f87500a;

    /* renamed from: b */
    public final IOpenCellCallback<RedPacketContentVO> f87501b;

    /* renamed from: c */
    private final Lazy f87502c = LazyKt.lazy(C33941a.INSTANCE);

    /* renamed from: d */
    private final IMessageContext f87503d;

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public void mo120410a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    /* renamed from: a */
    public void mo123988a(List<? extends C34029b<?>> list, OpenMenuDataHolder<RedPacketContentVO> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "dataHolder");
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: b */
    public C34035c mo120416b(OpenMessageVO<RedPacketContentVO> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "messageVO");
        return null;
    }

    /* renamed from: b */
    public final AbstractC36456ae mo123990b() {
        return (AbstractC36456ae) this.f87502c.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u00101\u001a\u000202H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001e\u0010\u001a\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001e\u0010\u001d\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020!8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R\u001e\u0010.\u001a\u00020!8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010#\"\u0004\b0\u0010%¨\u00063"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/view/message/plugin/redpackage/RedPacketMessageCell$RedPacketMessageViewHolder;", "", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "companyLogo", "Landroid/widget/ImageView;", "getCompanyLogo", "()Landroid/widget/ImageView;", "setCompanyLogo", "(Landroid/widget/ImageView;)V", "contentLayout", "Landroid/view/ViewGroup;", "getContentLayout", "()Landroid/view/ViewGroup;", "setContentLayout", "(Landroid/view/ViewGroup;)V", "coverIv", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "getCoverIv", "()Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "setCoverIv", "(Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;)V", "coverMaskIv", "getCoverMaskIv", "setCoverMaskIv", "footerIv", "getFooterIv", "setFooterIv", "grabBtn", "getGrabBtn", "setGrabBtn", "redPacketTypeTv", "Landroid/widget/TextView;", "getRedPacketTypeTv", "()Landroid/widget/TextView;", "setRedPacketTypeTv", "(Landroid/widget/TextView;)V", "rootMask", "getRootMask", "setRootMask", "getRootView", "()Landroid/view/View;", "senderTv", "getSenderTv", "setSenderTv", "statusTv", "getStatusTv", "setStatusTv", "initDisplaySize", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class RedPacketMessageViewHolder {

        /* renamed from: a */
        private final View f87504a;
        @BindView(7467)
        public ImageView companyLogo;
        @BindView(8529)
        public ViewGroup contentLayout;
        @BindView(8532)
        public LKUIRoundedImageView2 coverIv;
        @BindView(8530)
        public LKUIRoundedImageView2 coverMaskIv;
        @BindView(8531)
        public LKUIRoundedImageView2 footerIv;
        @BindView(7767)
        public ImageView grabBtn;
        @BindView(8534)
        public TextView redPacketTypeTv;
        @BindView(8598)
        public LKUIRoundedImageView2 rootMask;
        @BindView(8873)
        public TextView senderTv;
        @BindView(LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE)
        public TextView statusTv;

        /* renamed from: k */
        public final View mo124002k() {
            return this.f87504a;
        }

        /* renamed from: a */
        public final LKUIRoundedImageView2 mo123992a() {
            LKUIRoundedImageView2 lKUIRoundedImageView2 = this.rootMask;
            if (lKUIRoundedImageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootMask");
            }
            return lKUIRoundedImageView2;
        }

        /* renamed from: b */
        public final ViewGroup mo123993b() {
            ViewGroup viewGroup = this.contentLayout;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentLayout");
            }
            return viewGroup;
        }

        /* renamed from: c */
        public final TextView mo123994c() {
            TextView textView = this.senderTv;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("senderTv");
            }
            return textView;
        }

        /* renamed from: d */
        public final LKUIRoundedImageView2 mo123995d() {
            LKUIRoundedImageView2 lKUIRoundedImageView2 = this.coverIv;
            if (lKUIRoundedImageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coverIv");
            }
            return lKUIRoundedImageView2;
        }

        /* renamed from: e */
        public final LKUIRoundedImageView2 mo123996e() {
            LKUIRoundedImageView2 lKUIRoundedImageView2 = this.coverMaskIv;
            if (lKUIRoundedImageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coverMaskIv");
            }
            return lKUIRoundedImageView2;
        }

        /* renamed from: f */
        public final LKUIRoundedImageView2 mo123997f() {
            LKUIRoundedImageView2 lKUIRoundedImageView2 = this.footerIv;
            if (lKUIRoundedImageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("footerIv");
            }
            return lKUIRoundedImageView2;
        }

        /* renamed from: g */
        public final TextView mo123998g() {
            TextView textView = this.statusTv;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusTv");
            }
            return textView;
        }

        /* renamed from: h */
        public final ImageView mo123999h() {
            ImageView imageView = this.grabBtn;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("grabBtn");
            }
            return imageView;
        }

        /* renamed from: i */
        public final TextView mo124000i() {
            TextView textView = this.redPacketTypeTv;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("redPacketTypeTv");
            }
            return textView;
        }

        /* renamed from: j */
        public final ImageView mo124001j() {
            ImageView imageView = this.companyLogo;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("companyLogo");
            }
            return imageView;
        }

        /* renamed from: l */
        private final void m131351l() {
            TextView textView = this.senderTv;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("senderTv");
            }
            C25649b.m91857a(textView, LarkFont.BODY1);
            TextView textView2 = this.statusTv;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusTv");
            }
            C25649b.m91857a(textView2, LarkFont.CAPTION1);
        }

        public RedPacketMessageViewHolder(View view) {
            Intrinsics.checkParameterIsNotNull(view, "rootView");
            this.f87504a = view;
            ButterKnife.bind(this, view);
            m131351l();
        }
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public Class<RedPacketContentVO> mo120409a() {
        return RedPacketContentVO.class;
    }

    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo120415a(C34029b bVar, Object obj) {
        return mo123989a((C34029b<?>) bVar, (OpenMenuDataHolder) obj);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/dependency/IMoneyDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.view.message.plugin.redpackage.RedPacketMessageCell$a */
    static final class C33941a extends Lambda implements Function0<AbstractC36456ae> {
        public static final C33941a INSTANCE = new C33941a();

        C33941a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC36456ae invoke() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            return b.mo134598z();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chat/chatwindow/view/message/plugin/redpackage/RedPacketMessageCell$onCellClicked$2", "Lcom/ss/android/lark/dependency/IMoneyDependency$IGetPluginCallback;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onLoading", "onSuccess", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.view.message.plugin.redpackage.RedPacketMessageCell$d */
    public static final class C33944d implements AbstractC36456ae.AbstractC36457a {

        /* renamed from: a */
        final /* synthetic */ RedPacketMessageCell f87514a;

        /* renamed from: b */
        final /* synthetic */ CommonLoadingDialog f87515b;

        /* renamed from: c */
        final /* synthetic */ RedPacketContent f87516c;

        /* renamed from: d */
        final /* synthetic */ OpenMessageVO f87517d;

        /* renamed from: e */
        final /* synthetic */ boolean f87518e;

        /* renamed from: f */
        final /* synthetic */ boolean f87519f;

        @Override // com.ss.android.lark.dependency.AbstractC36456ae.AbstractC36457a
        /* renamed from: b */
        public void mo122737b() {
            if (UIUtils.isActivityRunning(this.f87514a.f87500a)) {
                this.f87515b.show(this.f87514a.f87500a);
            }
        }

        @Override // com.ss.android.lark.dependency.AbstractC36456ae.AbstractC36457a
        /* renamed from: a */
        public void mo122735a() {
            if (UIUtils.isActivityRunning(this.f87514a.f87500a)) {
                this.f87515b.dismiss();
                this.f87514a.mo123990b().mo134424a(this.f87514a.f87500a, this.f87516c.getRedPacketId(), this.f87517d.mo121681a(), this.f87517d.mo121695c(), !this.f87516c.isClicked(), this.f87518e, this.f87519f);
            }
        }

        @Override // com.ss.android.lark.dependency.AbstractC36456ae.AbstractC36457a
        /* renamed from: a */
        public void mo122736a(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            if (UIUtils.isActivityRunning(this.f87514a.f87500a)) {
                this.f87515b.dismiss();
                UDToast.show(this.f87514a.f87500a, (int) R.string.Lark_Legacy_ErrorMessageTip);
            }
        }

        C33944d(RedPacketMessageCell redPacketMessageCell, CommonLoadingDialog commonLoadingDialog, RedPacketContent redPacketContent, OpenMessageVO cVar, boolean z, boolean z2) {
            this.f87514a = redPacketMessageCell;
            this.f87515b = commonLoadingDialog;
            this.f87516c = redPacketContent;
            this.f87517d = cVar;
            this.f87518e = z;
            this.f87519f = z2;
        }
    }

    public final class RedPacketMessageViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private RedPacketMessageViewHolder f87505a;

        @Override // butterknife.Unbinder
        public void unbind() {
            RedPacketMessageViewHolder redPacketMessageViewHolder = this.f87505a;
            if (redPacketMessageViewHolder != null) {
                this.f87505a = null;
                redPacketMessageViewHolder.rootMask = null;
                redPacketMessageViewHolder.contentLayout = null;
                redPacketMessageViewHolder.senderTv = null;
                redPacketMessageViewHolder.coverIv = null;
                redPacketMessageViewHolder.coverMaskIv = null;
                redPacketMessageViewHolder.footerIv = null;
                redPacketMessageViewHolder.statusTv = null;
                redPacketMessageViewHolder.grabBtn = null;
                redPacketMessageViewHolder.redPacketTypeTv = null;
                redPacketMessageViewHolder.companyLogo = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public RedPacketMessageViewHolder_ViewBinding(RedPacketMessageViewHolder redPacketMessageViewHolder, View view) {
            this.f87505a = redPacketMessageViewHolder;
            redPacketMessageViewHolder.rootMask = (LKUIRoundedImageView2) Utils.findRequiredViewAsType(view, R.id.root_mask, "field 'rootMask'", LKUIRoundedImageView2.class);
            redPacketMessageViewHolder.contentLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.red_packet_content_layout, "field 'contentLayout'", ViewGroup.class);
            redPacketMessageViewHolder.senderTv = (TextView) Utils.findRequiredViewAsType(view, R.id.subject_tv, "field 'senderTv'", TextView.class);
            redPacketMessageViewHolder.coverIv = (LKUIRoundedImageView2) Utils.findRequiredViewAsType(view, R.id.red_packet_iv, "field 'coverIv'", LKUIRoundedImageView2.class);
            redPacketMessageViewHolder.coverMaskIv = (LKUIRoundedImageView2) Utils.findRequiredViewAsType(view, R.id.red_packet_cover_mask, "field 'coverMaskIv'", LKUIRoundedImageView2.class);
            redPacketMessageViewHolder.footerIv = (LKUIRoundedImageView2) Utils.findRequiredViewAsType(view, R.id.red_packet_footer_iv, "field 'footerIv'", LKUIRoundedImageView2.class);
            redPacketMessageViewHolder.statusTv = (TextView) Utils.findRequiredViewAsType(view, R.id.receive_tv, "field 'statusTv'", TextView.class);
            redPacketMessageViewHolder.grabBtn = (ImageView) Utils.findRequiredViewAsType(view, R.id.grab_btn, "field 'grabBtn'", ImageView.class);
            redPacketMessageViewHolder.redPacketTypeTv = (TextView) Utils.findRequiredViewAsType(view, R.id.red_packet_type_tv, "field 'redPacketTypeTv'", TextView.class);
            redPacketMessageViewHolder.companyLogo = (ImageView) Utils.findRequiredViewAsType(view, R.id.company_logo, "field 'companyLogo'", ImageView.class);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/chat/chatwindow/view/message/plugin/redpackage/RedPacketMessageCell$onBindViewHolder$1$4"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.view.message.plugin.redpackage.RedPacketMessageCell$b */
    public static final class View$OnClickListenerC33942b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RedPacketMessageCell f87506a;

        /* renamed from: b */
        final /* synthetic */ OpenMessageVO f87507b;

        /* renamed from: c */
        final /* synthetic */ RedPacketContent f87508c;

        /* renamed from: d */
        final /* synthetic */ RedPacketMessageViewHolder f87509d;

        View$OnClickListenerC33942b(RedPacketMessageCell redPacketMessageCell, OpenMessageVO cVar, RedPacketContent redPacketContent, RedPacketMessageViewHolder redPacketMessageViewHolder) {
            this.f87506a = redPacketMessageCell;
            this.f87507b = cVar;
            this.f87508c = redPacketContent;
            this.f87509d = redPacketMessageViewHolder;
        }

        public final void onClick(View view) {
            this.f87506a.mo123991c(this.f87507b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick", "com/ss/android/lark/chat/chatwindow/view/message/plugin/redpackage/RedPacketMessageCell$onBindViewHolder$1$5"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.view.message.plugin.redpackage.RedPacketMessageCell$c */
    public static final class View$OnLongClickListenerC33943c implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ RedPacketMessageCell f87510a;

        /* renamed from: b */
        final /* synthetic */ OpenMessageVO f87511b;

        /* renamed from: c */
        final /* synthetic */ RedPacketContent f87512c;

        /* renamed from: d */
        final /* synthetic */ RedPacketMessageViewHolder f87513d;

        View$OnLongClickListenerC33943c(RedPacketMessageCell redPacketMessageCell, OpenMessageVO cVar, RedPacketContent redPacketContent, RedPacketMessageViewHolder redPacketMessageViewHolder) {
            this.f87510a = redPacketMessageCell;
            this.f87511b = cVar;
            this.f87512c = redPacketContent;
            this.f87513d = redPacketMessageViewHolder;
        }

        public final boolean onLongClick(View view) {
            return this.f87510a.f87501b.mo122833b(this.f87513d.mo124002k(), this.f87511b);
        }
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: a */
    public C34034b mo120408a(OpenMessageVO<RedPacketContentVO> cVar) {
        int i;
        Intrinsics.checkParameterIsNotNull(cVar, "messageVO");
        if (cVar.mo121695c()) {
            i = 3;
        } else {
            i = 2;
        }
        return C34034b.m131984b(i);
    }

    /* renamed from: c */
    public final void mo123991c(OpenMessageVO<RedPacketContentVO> cVar) {
        boolean z;
        boolean z2;
        RedPacketContent redPacketContent = (RedPacketContent) cVar.mo121699g().mo126168z();
        RedPacketHitPoint.Companion aVar = RedPacketHitPoint.f135904a;
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36474h.AbstractC36484j am = b.am();
        AbstractC36474h b2 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36456ae z3 = b2.mo134598z();
        Intrinsics.checkExpressionValueIsNotNull(z3, "ChatModuleInstanceHolder…endency().moneyDependency");
        boolean a = am.mo134626a(z3.mo134423a());
        AbstractC36474h b3 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36474h.AbstractC36484j am2 = b3.am();
        AbstractC36474h b4 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b4, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36456ae z4 = b4.mo134598z();
        Intrinsics.checkExpressionValueIsNotNull(z4, "ChatModuleInstanceHolder…endency().moneyDependency");
        aVar.mo187708c(a, am2.mo134627b(z4.mo134423a()));
        ChatHitPointNew.Companion aVar2 = ChatHitPointNew.f135660c;
        String h = this.f87503d.mo122544h();
        ChatParamUtils dVar = ChatParamUtils.f88665a;
        if (cVar != null) {
            Map<String, ? extends Object> mutableMap = MapsKt.toMutableMap(dVar.mo126912a((ChatMessageVO) cVar));
            String redPacketId = redPacketContent.getRedPacketId();
            if (redPacketId == null) {
                redPacketId = "";
            }
            mutableMap.put("hongbao_id", redPacketId);
            aVar2.mo187388a(h, "hongbao", "none", mutableMap);
            if (redPacketContent.isExpired() || redPacketContent.isGrabbed() || redPacketContent.isGrabbedFinish()) {
                z = true;
            } else {
                z = false;
            }
            if (redPacketContent.getType() == RedPacketContent.Type.COMMERCIAL) {
                z2 = true;
            } else {
                z2 = false;
            }
            mo123990b().mo134427a(new C33944d(this, new CommonLoadingDialog(), redPacketContent, cVar, z, z2));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.vo.ChatMessageVO<*>");
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public View mo120406a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.red_packet_message_cell, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…e_cell, container, false)");
        return inflate;
    }

    public RedPacketMessageCell(IMessageContext aVar, IOpenCellCallback<RedPacketContentVO> bVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "mMessageContext");
        Intrinsics.checkParameterIsNotNull(bVar, "mOpenCellCallback");
        this.f87503d = aVar;
        this.f87501b = bVar;
        this.f87500a = aVar.mo122543g();
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: a */
    public BubbleStyle mo120407a(OpenMessageVO<RedPacketContentVO> cVar, View view) {
        int i;
        Intrinsics.checkParameterIsNotNull(cVar, "messageVO");
        Intrinsics.checkParameterIsNotNull(view, "contentView");
        if (!cVar.ah() || this.f87503d.mo122559w()) {
            i = 9;
        } else if (cVar.mo121695c()) {
            i = 0;
        } else {
            i = 1;
        }
        return BubbleStyle.m131964a(i, (View) null, (!cVar.ah() || this.f87503d.mo122559w()) ? new int[]{0, 0, 0, 0} : new int[]{UIHelper.dp2px(8.0f), UIHelper.dp2px(12.0f), UIHelper.dp2px(8.0f), UIHelper.dp2px(12.0f)});
    }

    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, Object obj) {
        mo123988a((List<? extends C34029b<?>>) list, (OpenMenuDataHolder) obj);
    }

    /* renamed from: a */
    private final void m131337a(RedPacketMessageViewHolder redPacketMessageViewHolder, OpenMessageVO<RedPacketContentVO> cVar) {
        float f;
        int i;
        RedPacketContent redPacketContent = (RedPacketContent) cVar.mo121699g().mo126168z();
        redPacketMessageViewHolder.mo124002k().setClipToOutline(true);
        if (cVar.ah() || this.f87503d.mo122559w()) {
            f = 8.0f;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        redPacketMessageViewHolder.mo123992a().setRadiusInDp(f);
        redPacketMessageViewHolder.mo123995d().setRadiusInDp(f);
        redPacketMessageViewHolder.mo123996e().setRadiusInDp(f);
        redPacketMessageViewHolder.mo123997f().setRadiusInDp(f);
        RedPacketCover cover = redPacketContent.getCover();
        PassThroughImage messageCover = cover != null ? cover.getMessageCover() : null;
        if (messageCover == null) {
            redPacketMessageViewHolder.mo123995d().setImageResource(R.drawable.red_packet_message_cell_content_bg);
            redPacketMessageViewHolder.mo123996e().setVisibility(8);
            TextView c = redPacketMessageViewHolder.mo123994c();
            ViewGroup.LayoutParams layoutParams = redPacketMessageViewHolder.mo123994c().getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = UIHelper.dp2px(36.0f);
                c.setLayoutParams(marginLayoutParams);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        } else {
            ImageLoader.with(this.f87500a).load(messageCover).placeholder(R.drawable.red_packet_message_cell_content_bg).into(redPacketMessageViewHolder.mo123995d());
            redPacketMessageViewHolder.mo123996e().setVisibility(0);
            TextView c2 = redPacketMessageViewHolder.mo123994c();
            ViewGroup.LayoutParams layoutParams2 = redPacketMessageViewHolder.mo123994c().getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = UIHelper.dp2px(28.0f);
                c2.setLayoutParams(marginLayoutParams2);
                for (TextView textView : CollectionsKt.listOf((Object[]) new TextView[]{redPacketMessageViewHolder.mo123994c(), redPacketMessageViewHolder.mo124000i()})) {
                    textView.setShadowLayer(4.0f, BitmapDescriptorFactory.HUE_RED, 2.0f, UDColorUtils.getColor(this.f87500a, R.color.static_black_20));
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        RedPacketCover cover2 = redPacketContent.getCover();
        PassThroughImage companyLogo = cover2 != null ? cover2.getCompanyLogo() : null;
        if (companyLogo == null) {
            redPacketMessageViewHolder.mo124001j().setImageDrawable(null);
        } else {
            ImageLoader.with(this.f87500a).load(companyLogo).into(redPacketMessageViewHolder.mo124001j());
        }
        redPacketMessageViewHolder.mo123994c().setText(redPacketContent.getSubject());
        TextView i2 = redPacketMessageViewHolder.mo124000i();
        RedPacketContent.Type type = redPacketContent.getType();
        if (type != null && C33945a.f87520a[type.ordinal()] == 1) {
            i = R.string.Lark_Legacy_RandomHongbao;
        } else {
            i = R.string.Lark_Legacy_NormalAmount;
        }
        i2.setText(i);
        if (redPacketContent.isGrabbed()) {
            redPacketMessageViewHolder.mo123993b().setAlpha(0.5f);
            redPacketMessageViewHolder.mo123999h().setEnabled(false);
            redPacketMessageViewHolder.mo123998g().setVisibility(0);
            redPacketMessageViewHolder.mo123998g().setText(UIHelper.getString(R.string.Lark_Legacy_HongbaoOpened));
        } else if (redPacketContent.isExpired()) {
            redPacketMessageViewHolder.mo123993b().setAlpha(0.5f);
            redPacketMessageViewHolder.mo123999h().setEnabled(false);
            redPacketMessageViewHolder.mo123998g().setVisibility(0);
            redPacketMessageViewHolder.mo123998g().setText(UIHelper.getString(R.string.Lark_Legacy_HongbaoExpired));
        } else if (redPacketContent.isGrabbedFinish()) {
            redPacketMessageViewHolder.mo123993b().setAlpha(0.5f);
            redPacketMessageViewHolder.mo123999h().setEnabled(false);
            redPacketMessageViewHolder.mo123998g().setVisibility(0);
            redPacketMessageViewHolder.mo123998g().setText(UIHelper.getString(R.string.Lark_Legacy_HongbaoNoneLeft));
        } else {
            redPacketMessageViewHolder.mo123993b().setAlpha(1.0f);
            redPacketMessageViewHolder.mo123999h().setEnabled(true);
            redPacketMessageViewHolder.mo123998g().setVisibility(8);
        }
        redPacketMessageViewHolder.mo124002k().setOnClickListener(new View$OnClickListenerC33942b(this, cVar, redPacketContent, redPacketMessageViewHolder));
        redPacketMessageViewHolder.mo124002k().setOnLongClickListener(new View$OnLongClickListenerC33943c(this, cVar, redPacketContent, redPacketMessageViewHolder));
    }

    /* renamed from: a */
    public boolean mo123989a(C34029b<?> bVar, OpenMenuDataHolder<RedPacketContentVO> cVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "menuItem");
        Intrinsics.checkParameterIsNotNull(cVar, "dataHolder");
        return CollectionsKt.listOf((Object[]) new Integer[]{0, 5, 7, 12, 23, 21, 14}).contains(Integer.valueOf(bVar.f87966a));
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public void mo120411a(View view, int i, OpenMessageVO<RedPacketContentVO> cVar) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(cVar, "message");
        Object tag = view.getTag();
        if (!(tag instanceof RedPacketMessageViewHolder)) {
            tag = null;
        }
        RedPacketMessageViewHolder redPacketMessageViewHolder = (RedPacketMessageViewHolder) tag;
        if (redPacketMessageViewHolder == null) {
            redPacketMessageViewHolder = new RedPacketMessageViewHolder(view);
            view.setTag(redPacketMessageViewHolder);
        }
        m131337a(redPacketMessageViewHolder, cVar);
    }
}
