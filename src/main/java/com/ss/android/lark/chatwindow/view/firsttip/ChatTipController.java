package com.ss.android.lark.chatwindow.view.firsttip;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.chat.data.content.MessageContentResolver;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33103ae;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chatwindow.C35212a;
import com.ss.android.lark.chatwindow.view.p1726c.C35267a;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.guide.ui.GuideComponent;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.ButtonBubbleConfig;
import com.ss.android.lark.guide.ui.config.ButtonConfig;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.guide.ui.config.ImageConfig;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.guide.ui.config.TextBubbleConfig;
import com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38708a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.LKUILightTextView;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\bH\u0002J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0013H\u0002J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J \u0010\u001d\u001a\u00020\u001e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010$\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&J\u0012\u0010'\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/lark/chatwindow/view/firsttip/ChatTipController;", "", "()V", "ALL_ADD_PIN", "", "ALL_AUTO_TRANSLATION_SETTING", "ALL_VIEW_PIN", "MENTION_MASK_SIZE_IN_DP", "", "MOBILE_MENTION_STATUS", "MOBILE_READ_STATUS", "READ_MASK_SIZE_IN_DP", "SHOW_TIP_DELAY_IN_MILLS", "", "TAG", "THREAD_FOLLOW_GUIDE", "getActivity", "Landroid/app/Activity;", "anchorView", "Landroid/view/View;", "getLastRecyclerViewItem", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "id", "showAddPinTip", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "showMessageMentionTip", "view", "showMessageReadTip", "showMessageTip", "", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "contentResolver", "Lcom/ss/android/lark/chat/chatwindow/chat/data/content/MessageContentResolver;", "showThreadFollowTips", "showTranslateSettingTip", "translateHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/menu/handler/TranslateModelHandler;", "showViewPinTip", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatwindow.view.firsttip.b */
public final class ChatTipController {

    /* renamed from: a */
    public static final ChatTipController f91138a = new ChatTipController();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chatwindow/view/firsttip/ChatTipController$showAddPinTip$guideConfig$1", "Lcom/ss/android/lark/guidemgr/engine/callback/IGuideTaskLifecycle;", "onGuideDidAppear", "", "guideKey", "", "onGuideDidClose", "onGuideWillAppear", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.firsttip.b$a */
    public static final class C35276a implements AbstractC38707a {
        C35276a() {
        }

        @Override // com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a
        /* renamed from: a */
        public void mo129837a(String str) {
            Log.m165379d("ChatTipController", "onGuideDidClose:" + str);
        }

        @Override // com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a
        /* renamed from: b */
        public void mo129838b(String str) {
            Log.m165379d("ChatTipController", "onGuideWillAppear:" + str);
        }

        @Override // com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a
        /* renamed from: c */
        public void mo129839c(String str) {
            Log.m165379d("ChatTipController", "onGuideDidAppear:" + str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chatwindow/view/firsttip/ChatTipController$showMessageMentionTip$rightBtn$1", "Lcom/ss/android/lark/guide/ui/config/ButtonConfig$ButtonAction;", "onClick", "", "view", "Landroid/view/View;", "delegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.firsttip.b$b */
    public static final class C35277b implements ButtonConfig.ButtonAction {
        C35277b() {
        }

        @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
        public void onClick(View view, GuideDelegate gVar) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(gVar, "delegate");
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134583k().mo134720a("mobile_mention_status");
            gVar.mo141659b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chatwindow/view/firsttip/ChatTipController$showMessageReadTip$rightBtn$1", "Lcom/ss/android/lark/guide/ui/config/ButtonConfig$ButtonAction;", "onClick", "", "view", "Landroid/view/View;", "delegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.firsttip.b$c */
    public static final class C35278c implements ButtonConfig.ButtonAction {
        C35278c() {
        }

        @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
        public void onClick(View view, GuideDelegate gVar) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(gVar, "delegate");
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134583k().mo134720a("mobile_read_status");
            gVar.mo141659b();
        }
    }

    private ChatTipController() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.firsttip.b$d */
    static final class RunnableC35279d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Ref.ObjectRef f91139a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView f91140b;

        RunnableC35279d(Ref.ObjectRef objectRef, RecyclerView recyclerView) {
            this.f91139a = objectRef;
            this.f91140b = recyclerView;
        }

        public final void run() {
            this.f91139a.element = (T) ChatTipController.f91138a.mo129830a(this.f91140b, R.id.unread_member_count);
            ChatTipController.f91138a.mo129833b(this.f91139a.element);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.firsttip.b$e */
    static final class RunnableC35280e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Ref.ObjectRef f91141a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView f91142b;

        RunnableC35280e(Ref.ObjectRef objectRef, RecyclerView recyclerView) {
            this.f91141a = objectRef;
            this.f91142b = recyclerView;
        }

        public final void run() {
            this.f91141a.element = (T) ChatTipController.f91138a.mo129830a(this.f91142b, R.id.bubble_content_container);
            ChatTipController.f91138a.mo129834c(this.f91141a.element);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.firsttip.b$f */
    static final class RunnableC35281f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Ref.ObjectRef f91143a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView f91144b;

        RunnableC35281f(Ref.ObjectRef objectRef, RecyclerView recyclerView) {
            this.f91143a = objectRef;
            this.f91144b = recyclerView;
        }

        public final void run() {
            this.f91143a.element = (T) ChatTipController.f91138a.mo129830a(this.f91144b, R.id.bubble_content_container);
            ChatTipController.f91138a.mo129835d(this.f91143a.element);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.firsttip.b$g */
    static final class RunnableC35282g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f91145a;

        /* renamed from: b */
        final /* synthetic */ TextBubbleConfig f91146b;

        RunnableC35282g(View view, TextBubbleConfig kVar) {
            this.f91145a = view;
            this.f91146b = kVar;
        }

        public final void run() {
            if (this.f91145a.isShown()) {
                GuideComponent.f99382a.mo141642a(ChatTipController.f91138a.mo129829a(this.f91145a), this.f91146b);
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                b.mo134583k().mo134720a("mobile_group_group_topic_subscribe");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"com/ss/android/lark/chatwindow/view/firsttip/ChatTipController$showTranslateSettingTip$1", "Lcom/ss/android/lark/chatwindow/view/translate/AutoTranslateSettingWindow$OnOptionClickListener;", "checkedIndex", "", "getCheckedIndex", "()I", "setCheckedIndex", "(I)V", "onCancel", "", "onConfirm", "onSelectOption", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.firsttip.b$h */
    public static final class C35283h implements C35267a.AbstractC35269a {

        /* renamed from: a */
        final /* synthetic */ LinkedHashMap f91147a;

        /* renamed from: b */
        final /* synthetic */ C33103ae f91148b;

        /* renamed from: c */
        final /* synthetic */ View f91149c;

        /* renamed from: d */
        final /* synthetic */ Ref.ObjectRef f91150d;

        /* renamed from: e */
        final /* synthetic */ String f91151e;

        /* renamed from: f */
        private int f91152f;

        @Override // com.ss.android.lark.chatwindow.view.p1726c.C35267a.AbstractC35269a
        /* renamed from: b */
        public void mo129816b() {
        }

        @Override // com.ss.android.lark.chatwindow.view.p1726c.C35267a.AbstractC35269a
        /* renamed from: c */
        public void mo129817c() {
            Collection values = this.f91147a.values();
            Intrinsics.checkExpressionValueIsNotNull(values, "optionMap.values");
            Object[] array = values.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                C35212a.m137536a(this.f91149c.getContext(), strArr, this.f91152f, new C35285b(this, strArr));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        @Override // com.ss.android.lark.chatwindow.view.p1726c.C35267a.AbstractC35269a
        /* renamed from: a */
        public void mo129815a() {
            int i;
            Set keySet = this.f91147a.keySet();
            Intrinsics.checkExpressionValueIsNotNull(keySet, "optionMap.keys");
            boolean z = false;
            Object[] array = keySet.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                if (strArr.length == 0) {
                    z = true;
                }
                if (z || (i = this.f91152f) < 0 || i >= strArr.length) {
                    Log.m165383e("ChatTipController", "showTranslateSettingTip key is null!");
                } else {
                    this.f91148b.setAutoTranslate(strArr[i], true, new C35284a(this));
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }

        /* renamed from: a */
        public final void mo129844a(int i) {
            this.f91152f = i;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatwindow/view/firsttip/ChatTipController$showTranslateSettingTip$1$onConfirm$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "aBoolean", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatwindow.view.firsttip.b$h$a */
        public static final class C35284a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C35283h f91153a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C35284a(C35283h hVar) {
                this.f91153a = hVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public /* synthetic */ void onSuccess(Boolean bool) {
                mo129845a(bool.booleanValue());
            }

            /* renamed from: a */
            public void mo129845a(boolean z) {
                LKUIToast.show(this.f91153a.f91149c.getContext(), UIUtils.getString(this.f91153a.f91149c.getContext(), R.string.Lark_Chat_OpenAutoTranslationSuccess));
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                LKUIToast.show(this.f91153a.f91149c.getContext(), errorResult.getDisplayMsg());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "index", "", "onChecked"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatwindow.view.firsttip.b$h$b */
        static final class C35285b implements C35212a.AbstractC35217c {

            /* renamed from: a */
            final /* synthetic */ C35283h f91154a;

            /* renamed from: b */
            final /* synthetic */ String[] f91155b;

            C35285b(C35283h hVar, String[] strArr) {
                this.f91154a = hVar;
                this.f91155b = strArr;
            }

            @Override // com.ss.android.lark.chatwindow.C35212a.AbstractC35217c
            public final void onChecked(int i) {
                this.f91154a.mo129844a(i);
                T t = this.f91154a.f91150d.element;
                if (t != null) {
                    t.mo129813a(this.f91155b[i]);
                }
            }
        }

        C35283h(LinkedHashMap linkedHashMap, C33103ae aeVar, View view, Ref.ObjectRef objectRef, String str) {
            this.f91147a = linkedHashMap;
            this.f91148b = aeVar;
            this.f91149c = view;
            this.f91150d = objectRef;
            this.f91151e = str;
            Set keySet = linkedHashMap.keySet();
            Intrinsics.checkExpressionValueIsNotNull(keySet, "optionMap.keys");
            this.f91152f = CollectionsKt.indexOf(keySet, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.firsttip.b$i */
    static final class RunnableC35286i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f91156a;

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef f91157b;

        RunnableC35286i(View view, Ref.ObjectRef objectRef) {
            this.f91156a = view;
            this.f91157b = objectRef;
        }

        public final void run() {
            if (this.f91156a.isShown()) {
                this.f91157b.element.mo100027a(this.f91156a);
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                b.mo134583k().mo134720a("all_auto_translation_setting");
            }
        }
    }

    /* renamed from: a */
    public final Activity mo129829a(View view) {
        if (view.getContext() instanceof Activity) {
            Context context = view.getContext();
            if (context != null) {
                return (Activity) context;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        Context context2 = view.getContext();
        if (context2 != null) {
            Context baseContext = ((MutableContextWrapper) context2).getBaseContext();
            if (baseContext != null) {
                return (Activity) baseContext;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.content.MutableContextWrapper");
    }

    /* renamed from: d */
    public final GuideDelegate mo129835d(View view) {
        if (view != null) {
            AnchorConfig anchorConfig = new AnchorConfig(view, AnchorConfig.AnchorGravity.TOP, null, 4, null);
            String a = C57582a.m223604a(view.getContext(), (int) R.string.Lark_Pin_PinGuideTips);
            Intrinsics.checkExpressionValueIsNotNull(a, "detail");
            TextBubbleConfig kVar = new TextBubbleConfig(anchorConfig, null, null, a);
            new C38708a(mo129829a(view), new C35276a(), kVar);
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            if (b.mo134583k().mo134722b("all_add_pin")) {
                GuideDelegate a2 = GuideComponent.f99382a.mo141642a(mo129829a(view), kVar);
                AbstractC36474h b2 = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
                b2.mo134583k().mo134720a("all_add_pin");
                return a2;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void mo129836e(View view) {
        Intrinsics.checkParameterIsNotNull(view, "anchorView");
        AnchorConfig anchorConfig = new AnchorConfig(view, AnchorConfig.AnchorGravity.BOTTOM, new Point(-UIHelper.dp2px(2.5f), 0));
        MaskConfig maskConfig = new MaskConfig(0, BitmapDescriptorFactory.HUE_RED, null, null, null, 31, null);
        String a = C57582a.m223604a(view.getContext(), (int) R.string.Lark_Groups_UnsubscribeGuide);
        Intrinsics.checkExpressionValueIsNotNull(a, "detail");
        TextBubbleConfig kVar = new TextBubbleConfig(anchorConfig, maskConfig, null, a);
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        if (b.mo134583k().mo134722b("mobile_group_group_topic_subscribe")) {
            UICallbackExecutor.executeDelayed(new RunnableC35282g(view, kVar), 500);
        }
    }

    /* renamed from: b */
    public final GuideDelegate mo129833b(View view) {
        if (view == null) {
            return null;
        }
        AnchorConfig anchorConfig = new AnchorConfig(view, AnchorConfig.AnchorGravity.TOP, null, 4, null);
        MaskConfig maskConfig = new MaskConfig(76, BitmapDescriptorFactory.HUE_RED, MaskConfig.ShapeType.CIRCLE, null, new Size(32, 32), 10, null);
        String string = UIUtils.getString(view.getContext(), R.string.Lark_Legacy_HintIHadKnow);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(anchor…Lark_Legacy_HintIHadKnow)");
        ButtonConfig eVar = new ButtonConfig(string, new C35278c());
        ImageConfig hVar = new ImageConfig(new BitmapDrawable(view.getResources(), C57820d.m224432a(LayoutInflater.from(view.getContext()).inflate(R.layout.read_state_guide_layout, (ViewGroup) null))));
        String a = C57582a.m223604a(view.getContext(), (int) R.string.Lark_Legacy_HintFetchMore);
        Intrinsics.checkExpressionValueIsNotNull(a, "UiUtils.getString(anchor…ark_Legacy_HintFetchMore)");
        ButtonBubbleConfig dVar = new ButtonBubbleConfig(anchorConfig, maskConfig, null, a, hVar, null, eVar);
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        if (!b.mo134583k().mo134722b("mobile_read_status")) {
            return null;
        }
        GuideDelegate b2 = GuideComponent.f99382a.mo141645b(mo129829a(view), dVar);
        AbstractC36474h b3 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
        b3.mo134583k().mo134720a("mobile_read_status");
        return b2;
    }

    /* renamed from: c */
    public final GuideDelegate mo129834c(View view) {
        if (view == null) {
            return null;
        }
        View findViewById = view.findViewById(R.id.content);
        if (findViewById == null) {
            return null;
        }
        View findViewById2 = findViewById.findViewById(R.id.message);
        if (!(findViewById2 instanceof LKUILightTextView)) {
            return null;
        }
        LKUILightTextView lKUILightTextView = (LKUILightTextView) findViewById2;
        int[] firstAtSpanLoc = lKUILightTextView.getFirstAtSpanLoc();
        if (firstAtSpanLoc[0] == -1 && firstAtSpanLoc[1] == -1) {
            Log.m165383e("TipPopupWindow", "Fail to show at tips, at dot is -1");
            return null;
        }
        int[] iArr = new int[2];
        findViewById2.getLocationInWindow(iArr);
        int i = iArr[0] + firstAtSpanLoc[0];
        int i2 = iArr[1] + firstAtSpanLoc[1];
        int dp2px = UIUtils.dp2px(view.getContext(), 7.0f);
        int dp2px2 = i2 + UIUtils.dp2px(view.getContext(), 2.5f);
        Rect rect = new Rect(i - dp2px, dp2px2, i, dp2px + dp2px2);
        AnchorConfig anchorConfig = new AnchorConfig(findViewById2, AnchorConfig.AnchorGravity.TOP, new Point(firstAtSpanLoc[0] - (lKUILightTextView.getMeasuredWidth() / 2), firstAtSpanLoc[1]));
        MaskConfig maskConfig = new MaskConfig(76, BitmapDescriptorFactory.HUE_RED, MaskConfig.ShapeType.CIRCLE, rect, null, 16, null);
        String string = UIUtils.getString(lKUILightTextView.getContext(), R.string.Lark_Legacy_HintIHadKnow);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(anchor…Lark_Legacy_HintIHadKnow)");
        ButtonBubbleConfig dVar = new ButtonBubbleConfig(anchorConfig, maskConfig, null, "", new ImageConfig(new BitmapDrawable(lKUILightTextView.getResources(), C57820d.m224432a(LayoutInflater.from(lKUILightTextView.getContext()).inflate(R.layout.read_dot_guide_layout, (ViewGroup) null)))), null, new ButtonConfig(string, new C35277b()));
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        if (!b.mo134583k().mo134722b("mobile_mention_status")) {
            return null;
        }
        GuideDelegate b2 = GuideComponent.f99382a.mo141645b(mo129829a(findViewById2), dVar);
        AbstractC36474h b3 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
        b3.mo134583k().mo134720a("mobile_mention_status");
        return b2;
    }

    /* renamed from: a */
    public final View mo129830a(RecyclerView recyclerView, int i) {
        View childAt;
        View findViewById;
        if (recyclerView == null || (childAt = recyclerView.getChildAt(recyclerView.getChildCount() - 1)) == null || (findViewById = childAt.findViewById(i)) == null || findViewById.getVisibility() == 8) {
            return null;
        }
        return findViewById;
    }

    /* renamed from: a */
    public final GuideDelegate mo129831a(View view, C33103ae aeVar) {
        Intrinsics.checkParameterIsNotNull(view, "anchorView");
        Intrinsics.checkParameterIsNotNull(aeVar, "translateHandler");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) null;
        String targetTranslateKey = aeVar.getTargetTranslateKey();
        Intrinsics.checkExpressionValueIsNotNull(targetTranslateKey, "translateHandler.targetTranslateKey");
        Map<String, String> translateOptions = aeVar.getTranslateOptions();
        if (translateOptions != null) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) translateOptions;
            objectRef.element = (T) new C35267a(mo129829a(view), new C35283h(linkedHashMap, aeVar, view, objectRef, targetTranslateKey));
            objectRef.element.mo129813a((String) linkedHashMap.get(targetTranslateKey));
            objectRef.element.setOutsideTouchable(false);
            objectRef.element.setFocusable(false);
            objectRef.element.setWidth((int) (((double) DeviceUtils.getScreenWidth(view.getContext())) * 0.8d));
            UICallbackExecutor.executeDelayed(new RunnableC35286i(view, objectRef), 1000);
            return null;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.LinkedHashMap<kotlin.String, kotlin.String> /* = java.util.LinkedHashMap<kotlin.String, kotlin.String> */");
    }

    /* renamed from: a */
    public final void mo129832a(RecyclerView recyclerView, MessageInfo messageInfo, MessageContentResolver messageContentResolver) {
        Intrinsics.checkParameterIsNotNull(messageInfo, "messageInfo");
        Intrinsics.checkParameterIsNotNull(messageContentResolver, "contentResolver");
        if (recyclerView != null) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            boolean b2 = b.mo134583k().mo134722b("mobile_read_status");
            AbstractC36474h b3 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
            boolean b4 = b3.mo134583k().mo134722b("mobile_mention_status");
            AbstractC36474h b5 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b5, "ChatModuleInstanceHolder.getDependency()");
            boolean b6 = b5.mo134583k().mo134722b("all_add_pin");
            Message message = messageInfo.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
            int d = messageContentResolver.mo122523d(message);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            if (b2 && d == 0) {
                KeyboardUtils.hideKeyboard(recyclerView.getContext());
                UICallbackExecutor.executeDelayed(new RunnableC35279d(objectRef, recyclerView), 500);
                Log.m165379d("ChatTipController", "showMessageReadTip");
            } else if (b4 && d == 2) {
                KeyboardUtils.hideKeyboard(recyclerView.getContext());
                UICallbackExecutor.executeDelayed(new RunnableC35280e(objectRef, recyclerView), 500);
                Log.m165379d("ChatTipController", "showMessageMentionTip");
            } else if (b6 && d == 1) {
                KeyboardUtils.hideKeyboard(recyclerView.getContext());
                UICallbackExecutor.executeDelayed(new RunnableC35281f(objectRef, recyclerView), 500);
                Log.m165379d("ChatTipController", "showAddPinTip");
            }
        }
    }
}
