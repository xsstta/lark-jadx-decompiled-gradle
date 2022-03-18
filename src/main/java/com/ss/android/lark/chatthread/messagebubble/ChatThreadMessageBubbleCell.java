package com.ss.android.lark.chatthread.messagebubble;

import android.content.Context;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33290a;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33308b;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.block.C33323b;
import com.ss.android.lark.chat.chatwindow.chat.message.block.MessageStatusBlock;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33297g;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33307q;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33353b;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33097aa;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.export.ui.message.style.C34034b;
import com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.open.message.AbstractC34072a;
import com.ss.android.lark.chat.utils.MessageCellUtils;
import com.ss.android.lark.chat.utils.MsgBubbleUtil;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatthread.view.ChatThreadCellClickHandler;
import com.ss.android.lark.chatthread.view.callback.ChatThreadMessageCallbackHub;
import com.ss.android.lark.chatwindow.C35247g;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59012g;
import com.ss.android.lark.widget.recyclerview.hive.C59008d;
import com.ss.android.lark.widget.recyclerview.hive.ICellHoverHandler;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 *2\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004)*+,B)\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002J \u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0002J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\u001e\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00032\f\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J\u001a\u0010\"\u001a\u00020\u000f2\u0012\u0010#\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0018\u00010\fJ\u0010\u0010$\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u001c\u0010%\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002J\u001c\u0010&\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002J\u001e\u0010'\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00032\f\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0002J\u001c\u0010(\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/lark/chatthread/messagebubble/ChatThreadMessageBubbleCell;", "Lcom/ss/android/lark/chat/chatwindow/chat/message/BaseMessageGroupCell;", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "Lcom/ss/android/lark/chatthread/messagebubble/ChatThreadMessageBubbleCell$ThreadMessageHolder;", "chatContext", "Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "mainMessageCell", "Lcom/ss/android/lark/chat/chatwindow/chat/message/BaseMessageCell;", "messageCallBacks", "Lcom/ss/android/lark/chatthread/view/callback/ChatThreadMessageCallbackHub;", "(Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;Lcom/ss/android/lark/chat/chatwindow/chat/message/BaseMessageCell;Lcom/ss/android/lark/chatthread/view/callback/ChatThreadMessageCallbackHub;)V", "openCellBubbleProvider", "Lcom/ss/android/lark/chat/open/message/IBubbleStyleProvider;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "bindSelf", "", "holder", "messageInfo", "changeHoverItemSelectedStatus", "unSelectedAll", "", "selectedItemType", "", "initCommonBlocks", "initHoverStubIfNeed", "isHoverOnView", "view", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "layoutId", "onBindGroupViewHolder", "viewHolder", "item", "setBubbleStyleProvider", "provider", "setCellWidthMatchParent", "setHeaderView", "setMoreIcon", "setupBubbleStyleIfNeed", "setupHoverIfNeed", "Builder", "Companion", "ThreadMessageGeneralCallbacks", "ThreadMessageHolder", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatthread.b.a */
public final class ChatThreadMessageBubbleCell extends AbstractC33308b<ChatMessageVO<?>, ThreadMessageHolder> {

    /* renamed from: c */
    public static final Companion f90545c = new Companion(null);

    /* renamed from: g */
    private AbstractC34072a<ContentVO<?>> f90546g;

    /* renamed from: h */
    private final AbstractC33342d f90547h;

    /* renamed from: i */
    private final ChatThreadMessageCallbackHub f90548i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/chatthread/messagebubble/ChatThreadMessageBubbleCell$ThreadMessageGeneralCallbacks;", "Lcom/ss/android/lark/chat/chatwindow/chat/message/callbacks/OnTranslateListener;", "Lcom/ss/android/lark/chat/chatwindow/chat/message/block/MessageStatusBlock$StatusChangeCallback;", "Lcom/ss/android/lark/chat/chatwindow/chat/message/callbacks/OnAvatarClickListener;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.b.a$c */
    public interface ThreadMessageGeneralCallbacks extends AbstractC33297g, AbstractC33307q, MessageStatusBlock.AbstractC33313a {
    }

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.item_post_detail2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatthread/messagebubble/ChatThreadMessageBubbleCell$Companion;", "", "()V", "LOG_TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.b.a$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chatthread/messagebubble/ChatThreadMessageBubbleCell$initCommonBlocks$1", "Lcom/ss/android/lark/chat/chatwindow/chat/message/style/bubble/DefaultBubbleStyleProvider;", "getReactionStyle", "Lcom/ss/android/lark/chat/export/ui/message/style/ReactionStyle;", "messageVO", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.b.a$e */
    public static final class C35081e extends C33353b {
        C35081e() {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33353b, com.ss.android.lark.chat.open.message.AbstractC34072a
        /* renamed from: a */
        public C34034b mo122836a(AbsMessageVO<? extends ContentVO<?>> aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "messageVO");
            C34034b bVar = C34034b.f87997a;
            bVar.mo126153a(2);
            Intrinsics.checkExpressionValueIsNotNull(bVar, "ReactionStyle.DEFAULT.ap…RAY\n                    }");
            return bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00103\u001a\u000204J\u0012\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0013H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\u0013X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u0013X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001a\u0010!\u001a\u00020\u0013X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001a\u0010$\u001a\u00020%X.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020+X.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\f\"\u0004\b2\u0010\u000e¨\u00068"}, d2 = {"Lcom/ss/android/lark/chatthread/messagebubble/ChatThreadMessageBubbleCell$ThreadMessageHolder;", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupHolder;", "()V", "contentWrapper", "Lcom/larksuite/component/ui/layout/LKUIRoundableLayout;", "getContentWrapper", "()Lcom/larksuite/component/ui/layout/LKUIRoundableLayout;", "setContentWrapper", "(Lcom/larksuite/component/ui/layout/LKUIRoundableLayout;)V", "deskTopHoverReactionIV", "Landroid/widget/ImageView;", "getDeskTopHoverReactionIV", "()Landroid/widget/ImageView;", "setDeskTopHoverReactionIV", "(Landroid/widget/ImageView;)V", "deskTopHoverReplyIV", "getDeskTopHoverReplyIV", "setDeskTopHoverReplyIV", "deskTopHoverWrapperLayout", "Landroid/view/View;", "getDeskTopHoverWrapperLayout", "()Landroid/view/View;", "setDeskTopHoverWrapperLayout", "(Landroid/view/View;)V", "desktopHoverMoreIV", "getDesktopHoverMoreIV", "setDesktopHoverMoreIV", "desktopHoverMoreWrapper", "getDesktopHoverMoreWrapper", "setDesktopHoverMoreWrapper", "desktopHoverReactionWrapper", "getDesktopHoverReactionWrapper", "setDesktopHoverReactionWrapper", "desktopHoverReplyWrapper", "getDesktopHoverReplyWrapper", "setDesktopHoverReplyWrapper", "desktopHoverStub", "Landroid/view/ViewStub;", "getDesktopHoverStub", "()Landroid/view/ViewStub;", "setDesktopHoverStub", "(Landroid/view/ViewStub;)V", "headTitleView", "Landroid/widget/TextView;", "getHeadTitleView", "()Landroid/widget/TextView;", "setHeadTitleView", "(Landroid/widget/TextView;)V", "more", "getMore", "setMore", "isDeskTopHoverWrapperInitialized", "", "onBindView", "", "itemView", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.b.a$d */
    public static final class ThreadMessageHolder extends C59008d {

        /* renamed from: a */
        public LKUIRoundableLayout f90555a;

        /* renamed from: b */
        public ImageView f90556b;

        /* renamed from: c */
        public TextView f90557c;

        /* renamed from: d */
        public ViewStub f90558d;

        /* renamed from: e */
        public View f90559e;

        /* renamed from: f */
        public View f90560f;

        /* renamed from: g */
        public View f90561g;

        /* renamed from: h */
        public View f90562h;

        /* renamed from: i */
        public ImageView f90563i;

        /* renamed from: j */
        public ImageView f90564j;

        /* renamed from: k */
        public ImageView f90565k;

        /* renamed from: a */
        public final LKUIRoundableLayout mo129352a() {
            LKUIRoundableLayout lKUIRoundableLayout = this.f90555a;
            if (lKUIRoundableLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentWrapper");
            }
            return lKUIRoundableLayout;
        }

        /* renamed from: b */
        public final ImageView mo129354b() {
            ImageView imageView = this.f90556b;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("more");
            }
            return imageView;
        }

        /* renamed from: c */
        public final TextView mo129357c() {
            TextView textView = this.f90557c;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headTitleView");
            }
            return textView;
        }

        /* renamed from: d */
        public final ViewStub mo129360d() {
            ViewStub viewStub = this.f90558d;
            if (viewStub == null) {
                Intrinsics.throwUninitializedPropertyAccessException("desktopHoverStub");
            }
            return viewStub;
        }

        /* renamed from: e */
        public final View mo129362e() {
            View view = this.f90559e;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deskTopHoverWrapperLayout");
            }
            return view;
        }

        /* renamed from: f */
        public final View mo129364f() {
            View view = this.f90560f;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("desktopHoverReactionWrapper");
            }
            return view;
        }

        /* renamed from: g */
        public final View mo129365g() {
            View view = this.f90561g;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("desktopHoverReplyWrapper");
            }
            return view;
        }

        /* renamed from: h */
        public final View mo129366h() {
            View view = this.f90562h;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("desktopHoverMoreWrapper");
            }
            return view;
        }

        /* renamed from: i */
        public final ImageView mo129367i() {
            ImageView imageView = this.f90563i;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deskTopHoverReactionIV");
            }
            return imageView;
        }

        /* renamed from: j */
        public final ImageView mo129368j() {
            ImageView imageView = this.f90565k;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("desktopHoverMoreIV");
            }
            return imageView;
        }

        /* renamed from: k */
        public final boolean mo129369k() {
            if (this.f90559e != null) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo129353a(ImageView imageView) {
            Intrinsics.checkParameterIsNotNull(imageView, "<set-?>");
            this.f90563i = imageView;
        }

        /* renamed from: b */
        public final void mo129355b(View view) {
            Intrinsics.checkParameterIsNotNull(view, "<set-?>");
            this.f90559e = view;
        }

        /* renamed from: c */
        public final void mo129358c(View view) {
            Intrinsics.checkParameterIsNotNull(view, "<set-?>");
            this.f90560f = view;
        }

        /* renamed from: d */
        public final void mo129361d(View view) {
            Intrinsics.checkParameterIsNotNull(view, "<set-?>");
            this.f90561g = view;
        }

        /* renamed from: e */
        public final void mo129363e(View view) {
            Intrinsics.checkParameterIsNotNull(view, "<set-?>");
            this.f90562h = view;
        }

        /* renamed from: b */
        public final void mo129356b(ImageView imageView) {
            Intrinsics.checkParameterIsNotNull(imageView, "<set-?>");
            this.f90564j = imageView;
        }

        /* renamed from: c */
        public final void mo129359c(ImageView imageView) {
            Intrinsics.checkParameterIsNotNull(imageView, "<set-?>");
            this.f90565k = imageView;
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.C59008d, com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            super.mo122652a(view);
            if (view != null) {
                View findViewById = view.findViewById(R.id.content);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.content)");
                this.f90555a = (LKUIRoundableLayout) findViewById;
                View findViewById2 = view.findViewById(R.id.more);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.more)");
                this.f90556b = (ImageView) findViewById2;
                View findViewById3 = view.findViewById(R.id.tv_post_title);
                Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.tv_post_title)");
                this.f90557c = (TextView) findViewById3;
                View findViewById4 = view.findViewById(R.id.chat_hover_item_stub);
                Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.id.chat_hover_item_stub)");
                this.f90558d = (ViewStub) findViewById4;
            }
        }
    }

    /* renamed from: d */
    private final void m136836d() {
        mo200138a(R.id.thread_footer_wrapper, new ChatThreadMessageFooterBlock(this.f90547h, this.f90548i));
        mo200138a(R.id.view_reaction, new C33323b(this.f90547h, new C33097aa(this.f90547h.mo122543g(), this.f90547h.mo122544h(), this.f90547h), new C35081e()));
        mo200138a(R.id.user_info_block, new ChatThreadMessageUserInfoBlock(this.f90547h, this.f90548i));
        mo200138a(R.id.chat_thread_item_view, new ChatThreadMessageStatusBlock(this.f90547h, this.f90548i));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0011\u001a\u00020\u00002\u0012\u0010\u0012\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0018\u00010\u0004J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\u00002\u000e\u0010\u000b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fJ\u0012\u0010\r\u001a\u00020\u00002\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0016\u001a\u00020\u00002\u0010\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/chatthread/messagebubble/ChatThreadMessageBubbleCell$Builder;", "", "()V", "bubbleCellStyleProvider", "Lcom/ss/android/lark/chat/open/message/IBubbleStyleProvider;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "cellClickListener", "Lcom/ss/android/lark/widget/recyclerview/hive/OnCellClickListener;", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "chatContext", "Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "contentCell", "Lcom/ss/android/lark/chat/chatwindow/chat/message/BaseMessageCell;", "contextMenuHandler", "Lcom/ss/android/lark/chat/export/ui/menu/IContextMenuHandler;", "messageCallBacks", "Lcom/ss/android/lark/chatthread/view/callback/ChatThreadMessageCallbackHub;", "bubbleStyleProvider", "provider", "build", "Lcom/ss/android/lark/chatthread/messagebubble/ChatThreadMessageBubbleCell;", "messageGeneralCallbacks", "onCellClickListener", "clickListener", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.b.a$a */
    public static final class Builder {

        /* renamed from: a */
        private AbstractC34072a<ContentVO<?>> f90549a;

        /* renamed from: b */
        private AbstractC33342d f90550b;

        /* renamed from: c */
        private AbstractC33290a<?, ?> f90551c;

        /* renamed from: d */
        private ChatThreadMessageCallbackHub f90552d;

        /* renamed from: e */
        private AbstractC59012g<ChatMessageVO<?>> f90553e;

        /* renamed from: f */
        private AbstractC34028a<?> f90554f;

        /* renamed from: a */
        public final ChatThreadMessageBubbleCell mo129351a() {
            AbstractC33342d dVar = this.f90550b;
            if (dVar == null) {
                Intrinsics.throwNpe();
            }
            AbstractC33290a<?, ?> aVar = this.f90551c;
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            ChatThreadMessageCallbackHub aVar2 = this.f90552d;
            if (aVar2 == null) {
                Intrinsics.throwNpe();
            }
            ChatThreadMessageBubbleCell aVar3 = new ChatThreadMessageBubbleCell(dVar, aVar, aVar2, null);
            aVar3.mo122781a(this.f90554f);
            aVar3.mo200134a(this.f90553e);
            aVar3.mo129341a(this.f90549a);
            return aVar3;
        }

        /* renamed from: a */
        public final Builder mo129348a(AbstractC34072a<ContentVO<?>> aVar) {
            Builder aVar2 = this;
            aVar2.f90549a = aVar;
            return aVar2;
        }

        /* renamed from: a */
        public final Builder mo129345a(AbstractC33290a<?, ?> aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "contentCell");
            Builder aVar2 = this;
            aVar2.f90551c = aVar;
            return aVar2;
        }

        /* renamed from: a */
        public final Builder mo129346a(AbstractC33342d dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "chatContext");
            Builder aVar = this;
            aVar.f90550b = dVar;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo129347a(AbstractC34028a<?> aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "contextMenuHandler");
            Builder aVar2 = this;
            aVar2.f90554f = aVar;
            return aVar2;
        }

        /* renamed from: a */
        public final Builder mo129349a(ChatThreadMessageCallbackHub aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "messageCallBacks");
            Builder aVar2 = this;
            aVar2.f90552d = aVar;
            return aVar2;
        }

        /* renamed from: a */
        public final Builder mo129350a(AbstractC59012g<ChatMessageVO<?>> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "clickListener");
            Builder aVar = this;
            aVar.f90553e = gVar;
            return aVar;
        }
    }

    /* renamed from: a */
    public final void mo129341a(AbstractC34072a<ContentVO<?>> aVar) {
        this.f90546g = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.b.a$f */
    public static final class View$OnClickListenerC35082f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatThreadMessageBubbleCell f90566a;

        /* renamed from: b */
        final /* synthetic */ AbstractC59012g f90567b;

        /* renamed from: c */
        final /* synthetic */ ThreadMessageHolder f90568c;

        /* renamed from: d */
        final /* synthetic */ ChatMessageVO f90569d;

        View$OnClickListenerC35082f(ChatThreadMessageBubbleCell aVar, AbstractC59012g gVar, ThreadMessageHolder dVar, ChatMessageVO cVar) {
            this.f90566a = aVar;
            this.f90567b = gVar;
            this.f90568c = dVar;
            this.f90569d = cVar;
        }

        public final void onClick(View view) {
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            ((ChatThreadCellClickHandler) this.f90567b).mo129632d(view, this.f90566a, this.f90568c, this.f90569d);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.b.a$h */
    public static final class View$OnClickListenerC35085h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatThreadMessageBubbleCell f90575a;

        /* renamed from: b */
        final /* synthetic */ ICellHoverHandler f90576b;

        /* renamed from: c */
        final /* synthetic */ ThreadMessageHolder f90577c;

        /* renamed from: d */
        final /* synthetic */ ChatMessageVO f90578d;

        View$OnClickListenerC35085h(ChatThreadMessageBubbleCell aVar, ICellHoverHandler iCellHoverHandler, ThreadMessageHolder dVar, ChatMessageVO cVar) {
            this.f90575a = aVar;
            this.f90576b = iCellHoverHandler;
            this.f90577c = dVar;
            this.f90578d = cVar;
        }

        public final void onClick(View view) {
            this.f90576b.mo122232c(this.f90577c.mo129364f(), this.f90575a, this.f90577c, this.f90578d);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.b.a$i */
    public static final class View$OnClickListenerC35086i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatThreadMessageBubbleCell f90579a;

        /* renamed from: b */
        final /* synthetic */ ICellHoverHandler f90580b;

        /* renamed from: c */
        final /* synthetic */ ThreadMessageHolder f90581c;

        /* renamed from: d */
        final /* synthetic */ ChatMessageVO f90582d;

        View$OnClickListenerC35086i(ChatThreadMessageBubbleCell aVar, ICellHoverHandler iCellHoverHandler, ThreadMessageHolder dVar, ChatMessageVO cVar) {
            this.f90579a = aVar;
            this.f90580b = iCellHoverHandler;
            this.f90581c = dVar;
            this.f90582d = cVar;
        }

        public final void onClick(View view) {
            this.f90580b.mo122222a(this.f90581c.mo129366h(), this.f90579a, this.f90581c, this.f90582d);
        }
    }

    /* renamed from: a */
    private final void m136832a(ThreadMessageHolder dVar) {
        ViewGroup.LayoutParams layoutParams = dVar.mo129352a().getLayoutParams();
        layoutParams.width = -1;
        dVar.mo129352a().setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    private final void m136833b(ThreadMessageHolder dVar) {
        if (!dVar.mo129369k()) {
            dVar.mo129360d().inflate();
            View findViewById = dVar.f146209n.findViewById(R.id.desktop_hover_wrapper);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "holder.itemView.findView…id.desktop_hover_wrapper)");
            dVar.mo129355b(findViewById);
            View findViewById2 = dVar.f146209n.findViewById(R.id.desktop_hover_reaction_wrapper);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "holder.itemView.findView…p_hover_reaction_wrapper)");
            dVar.mo129358c(findViewById2);
            View findViewById3 = dVar.f146209n.findViewById(R.id.desktop_hover_reaction);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "holder.itemView.findView…d.desktop_hover_reaction)");
            dVar.mo129353a((ImageView) findViewById3);
            View findViewById4 = dVar.f146209n.findViewById(R.id.desktop_hover_reply_wrapper);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "holder.itemView.findView…ktop_hover_reply_wrapper)");
            dVar.mo129361d(findViewById4);
            View findViewById5 = dVar.f146209n.findViewById(R.id.desktop_hover_reply);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "holder.itemView.findView…R.id.desktop_hover_reply)");
            dVar.mo129356b((ImageView) findViewById5);
            View findViewById6 = dVar.f146209n.findViewById(R.id.desktop_hover_more_operation_wrapper);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "holder.itemView.findView…r_more_operation_wrapper)");
            dVar.mo129363e(findViewById6);
            View findViewById7 = dVar.f146209n.findViewById(R.id.desktop_hover_more_operation);
            Intrinsics.checkExpressionValueIsNotNull(findViewById7, "holder.itemView.findView…top_hover_more_operation)");
            dVar.mo129359c((ImageView) findViewById7);
        }
    }

    /* renamed from: b */
    private final void m136834b(ThreadMessageHolder dVar, ChatMessageVO<?> cVar) {
        m136835c(dVar, cVar);
        m136838e(dVar, cVar);
        m136839f(dVar, cVar);
    }

    /* renamed from: a */
    public void mo122718b(ThreadMessageHolder dVar, ChatMessageVO<?> cVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "viewHolder");
        if (cVar != null) {
            m136837d(dVar, cVar);
            m136834b(dVar, cVar);
        }
    }

    /* renamed from: e */
    private final void m136838e(ThreadMessageHolder dVar, ChatMessageVO<?> cVar) {
        FragmentActivity g = this.f90547h.mo122543g();
        AbstractC59012g gVar = this.f146200f;
        if (gVar instanceof ChatThreadCellClickHandler) {
            dVar.mo129354b().setOnClickListener(new View$OnClickListenerC35082f(this, gVar, dVar, cVar));
            if (cVar.ai() || !cVar.mo124242O() || DesktopUtil.m144301a((Context) g)) {
                dVar.mo129354b().setVisibility(8);
            } else {
                dVar.mo129354b().setVisibility(0);
            }
        }
    }

    /* renamed from: f */
    private final void m136839f(ThreadMessageHolder dVar, ChatMessageVO<?> cVar) {
        if (!DesktopUtil.m144301a((Context) this.f90547h.mo122543g()) || cVar.ai() || !cVar.mo124242O() || !(this.f146200f instanceof ICellHoverHandler)) {
            Log.m165379d("ThreadMessageBubbleCell", "Do not satisfy hover conditions return.");
            return;
        }
        AbstractC59012g gVar = this.f146200f;
        if (gVar != null) {
            ICellHoverHandler iCellHoverHandler = (ICellHoverHandler) gVar;
            m136833b(dVar);
            dVar.mo129365g().setVisibility(8);
            dVar.mo129364f().setVisibility(0);
            dVar.mo129366h().setVisibility(0);
            dVar.f146209n.setOnHoverListener(new View$OnHoverListenerC35083g(this, dVar, iCellHoverHandler, cVar));
            dVar.mo129364f().setOnClickListener(new View$OnClickListenerC35085h(this, iCellHoverHandler, dVar, cVar));
            dVar.mo129366h().setOnClickListener(new View$OnClickListenerC35086i(this, iCellHoverHandler, dVar, cVar));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.widget.recyclerview.hive.ICellHoverHandler<com.ss.android.lark.chat.vo.ChatMessageVO<*>>");
    }

    /* renamed from: a */
    public final boolean mo129344a(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF((float) iArr[0], (float) iArr[1], (float) (iArr[0] + view.getWidth()), (float) (iArr[1] + view.getHeight())).contains(motionEvent.getRawX(), motionEvent.getRawY());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "onHover"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.b.a$g */
    public static final class View$OnHoverListenerC35083g implements View.OnHoverListener {

        /* renamed from: a */
        final /* synthetic */ ChatThreadMessageBubbleCell f90570a;

        /* renamed from: b */
        final /* synthetic */ ThreadMessageHolder f90571b;

        /* renamed from: c */
        final /* synthetic */ ICellHoverHandler f90572c;

        /* renamed from: d */
        final /* synthetic */ ChatMessageVO f90573d;

        View$OnHoverListenerC35083g(ChatThreadMessageBubbleCell aVar, ThreadMessageHolder dVar, ICellHoverHandler iCellHoverHandler, ChatMessageVO cVar) {
            this.f90570a = aVar;
            this.f90571b = dVar;
            this.f90572c = iCellHoverHandler;
            this.f90573d = cVar;
        }

        public final boolean onHover(View view, MotionEvent motionEvent) {
            Intrinsics.checkParameterIsNotNull(motionEvent, "event");
            int action = motionEvent.getAction();
            if (action == 7) {
                boolean a = this.f90570a.mo129344a(this.f90571b.mo129364f(), motionEvent);
                boolean a2 = this.f90570a.mo129344a(this.f90571b.mo129366h(), motionEvent);
                if (a) {
                    if (!this.f90571b.mo129367i().isSelected()) {
                        this.f90572c.mo122224a(this.f90571b.mo129364f(), this.f90570a, this.f90571b, this.f90573d, motionEvent, 0);
                        this.f90570a.mo129343a(this.f90571b, false, 0);
                    }
                } else if (a2) {
                    this.f90572c.mo122224a(this.f90571b.mo129366h(), this.f90570a, this.f90571b, this.f90573d, motionEvent, 2);
                    this.f90570a.mo129343a(this.f90571b, false, 2);
                } else {
                    motionEvent.setAction(10);
                    this.f90572c.mo122224a(this.f90571b.mo129364f(), this.f90570a, this.f90571b, this.f90573d, motionEvent, 0);
                    this.f90570a.mo129343a(this.f90571b, true, 0);
                }
            } else if (action == 9) {
                this.f90571b.mo129362e().setVisibility(0);
            } else if (action == 10) {
                this.f90571b.mo129362e().post(new Runnable(this) {
                    /* class com.ss.android.lark.chatthread.messagebubble.ChatThreadMessageBubbleCell.View$OnHoverListenerC35083g.RunnableC350841 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnHoverListenerC35083g f90574a;

                    {
                        this.f90574a = r1;
                    }

                    public final void run() {
                        this.f90574a.f90571b.mo129362e().setVisibility(4);
                    }
                });
                this.f90572c.mo122224a(this.f90571b.mo129364f(), this.f90570a, this.f90571b, this.f90573d, motionEvent, 0);
                this.f90570a.mo129343a(this.f90571b, true, 0);
            }
            return true;
        }
    }

    /* renamed from: c */
    private final void m136835c(ThreadMessageHolder dVar, ChatMessageVO<?> cVar) {
        boolean z;
        boolean z2;
        boolean z3;
        dVar.mo129357c().setVisibility(8);
        boolean z4 = true;
        if (!TextUtils.isEmpty(cVar.mo121700h()) || !TextUtils.isEmpty(cVar.mo121701i())) {
            z = false;
        } else {
            z = true;
        }
        if (!z || cVar.mo121710r() != Message.Type.POST) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            ContentVO g = cVar.mo121699g();
            if (g != null) {
                PostContentVO iVar = (PostContentVO) g;
                boolean z5 = !C35247g.m137634b((TranslatableContentVO) iVar);
                if (iVar.mo121929x() == 3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z5 && !z3) {
                    z4 = false;
                }
                if (!z4) {
                    TranslatableContentVO y = iVar.mo121930y();
                    if (y != null) {
                        iVar = (PostContentVO) y;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.base.view.vo.message.PostContentVO");
                    }
                }
                String a = iVar.mo121877a(this.f90547h.mo122543g());
                if (!TextUtils.isEmpty(a) && !iVar.mo121882n()) {
                    dVar.mo129357c().setText(a);
                    dVar.mo129357c().setVisibility(0);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.base.view.vo.message.PostContentVO");
        }
    }

    /* renamed from: d */
    private final void m136837d(ThreadMessageHolder dVar, ChatMessageVO<?> cVar) {
        BubbleStyle a;
        if (cVar != null && this.f90546g != null) {
            LKUIRoundableLayout a2 = dVar.mo129352a();
            ChatMessageVO<?> cVar2 = cVar;
            float[] a3 = MessageCellUtils.m133198a(cVar2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 6, null);
            a2.mo89662a(a3[0], a3[1], a3[2], a3[3]);
            AbstractC34072a<ContentVO<?>> aVar = this.f90546g;
            if (aVar != null && (a = aVar.mo122835a(cVar, dVar.mo129352a())) != null) {
                Intrinsics.checkExpressionValueIsNotNull(a, "openCellBubbleProvider?.…er)\n            ?: return");
                int[] b = a.mo126147b();
                Intrinsics.checkExpressionValueIsNotNull(b, "style.padding");
                a2.setPadding(b[0], b[1], b[2], b[3]);
                if (a.mo126152f()) {
                    m136832a(dVar);
                }
                int m = cVar.mo121705m();
                cVar.mo124274d(false);
                MsgBubbleUtil.m133103a(dVar.mo129352a(), a.mo126148c(), a.mo126151e(), m, a.mo126150d(), MessageCellUtils.m133199b(cVar2));
            }
        }
    }

    private ChatThreadMessageBubbleCell(AbstractC33342d dVar, AbstractC33290a<?, ?> aVar, ChatThreadMessageCallbackHub aVar2) {
        super(dVar);
        this.f90547h = dVar;
        this.f90548i = aVar2;
        mo200138a(R.id.content, aVar);
        m136836d();
    }

    /* renamed from: a */
    public final void mo129343a(ThreadMessageHolder dVar, boolean z, int i) {
        boolean[] zArr = new boolean[2];
        if (i == 0) {
            zArr[0] = true;
        } else if (i == 2) {
            zArr[1] = true;
        }
        if (z) {
            zArr = new boolean[2];
        }
        dVar.mo129367i().setSelected(zArr[0]);
        dVar.mo129368j().setSelected(zArr[1]);
    }

    public /* synthetic */ ChatThreadMessageBubbleCell(AbstractC33342d dVar, AbstractC33290a aVar, ChatThreadMessageCallbackHub aVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, aVar, aVar2);
    }
}
