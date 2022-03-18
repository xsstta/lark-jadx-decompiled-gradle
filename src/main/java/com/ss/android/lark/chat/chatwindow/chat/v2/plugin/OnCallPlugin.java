package com.ss.android.lark.chat.chatwindow.chat.v2.plugin;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.core.view.C0922v;
import androidx.lifecycle.Lifecycle;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.ExtendType;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardExtendData;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardExtendListener;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardTopExtend;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardTopExtendComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatChatterPushHandler;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.helpdesk.KbTopExtendControl;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36510y;
import com.ss.android.lark.dependency.AbstractC36511z;
import com.ss.android.lark.dependency.IHelpdeskDependency;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.uploadlog.IUploadLogDependency;
import com.ss.android.lark.keyboard.plugin.tool.uploadlog.UploadLogKBPlugin;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.widget.dialog.CommonLoadingDialog;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 02\u00020\u00012\u00020\u00022\u00020\u0003:\u000201B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010 \u001a\u00020\u001aH\u0016J\u0018\u0010!\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u001aH\u0016J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020'H\u0016J\u0018\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0016J\u0010\u0010+\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020\u001aH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/OnCallPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/BaseChatPlugin;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatChatterPushHandler$IChatterPushListener;", "Lcom/ss/android/lark/chat/entity/helpdesk/KbTopExtendControl;", "()V", "TAG", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "chatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "chatterPushHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatChatterPushHandler;", "helpdeskDependency", "Lcom/ss/android/lark/dependency/IHelpdeskDependency;", "keyboardTopExtendComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardTopExtendComponent;", "mLoadingDialog", "Lcom/ss/android/lark/widget/dialog/CommonLoadingDialog;", "onCallTicketIV", "Landroid/view/View;", "selfChatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "titlebarComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent;", "addKbTopLifeCycleObserver", "", "addLifeCycleObserver", "addOnCallTicketBtn", "chatId", "getUploadLogPlugin", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "hide", "onCreate", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "onDestroy", "onPushUpdatedChatter", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "onPushUpdatedNickname", BottomDialog.f17198f, "nickname", "onUpdateSelfInfo", "resetOnCallTicketBtn", "isOnCallDuty", "", "show", "Companion", "OnCallKbExtend", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.j */
public final class OnCallPlugin extends BaseChatPlugin implements ChatChatterPushHandler.IChatterPushListener, KbTopExtendControl {

    /* renamed from: l */
    public static final Companion f87049l = new Companion(null);

    /* renamed from: a */
    public final String f87050a = "OnCallPlugin";

    /* renamed from: b */
    public IHelpdeskDependency f87051b;

    /* renamed from: c */
    public IChatWindowApp f87052c;

    /* renamed from: d */
    public IKeyboardTopExtendComponent f87053d;

    /* renamed from: e */
    public ChatChatter f87054e;

    /* renamed from: f */
    public Chat f87055f;

    /* renamed from: g */
    public ChatChatterPushHandler f87056g;

    /* renamed from: h */
    public CommonLoadingDialog f87057h = new CommonLoadingDialog();

    /* renamed from: m */
    private ITitlebarComponent f87058m;

    /* renamed from: n */
    private View f87059n;

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatChatterPushHandler.IChatterPushListener
    public void onPushUpdatedNickname(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        Intrinsics.checkParameterIsNotNull(str2, "nickname");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatChatterPushHandler.IChatterPushListener
    public void onUpdateSelfInfo(Chatter chatter) {
        Intrinsics.checkParameterIsNotNull(chatter, "chatter");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/OnCallPlugin$Companion;", "", "()V", "isMissingOnCallRole", "", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.j$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo123820a(ChatChatter chatChatter) {
            if (chatChatter.getOnCallRole() == 0) {
                return true;
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0010H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010#\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/OnCallPlugin$OnCallKbExtend;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardTopExtend;", "chatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "iHelpdeskDependency", "Lcom/ss/android/lark/dependency/IHelpdeskDependency;", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;Lcom/ss/android/lark/dependency/IHelpdeskDependency;)V", "getChatApp", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "getIHelpdeskDependency", "()Lcom/ss/android/lark/dependency/IHelpdeskDependency;", "initTime", "", "getInitTime", "()J", "isShowing", "", "recycleView", "Landroid/view/View;", "getRecycleView", "()Landroid/view/View;", "setRecycleView", "(Landroid/view/View;)V", "create", "context", "Landroid/content/Context;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardExtendData;", "getListener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardExtendListener;", "getType", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/ExtendType;", "isEnable", "setShowing", "", "update", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.j$b */
    public static final class OnCallKbExtend implements IKeyboardTopExtend {

        /* renamed from: a */
        public View f87060a;

        /* renamed from: b */
        private final long f87061b = System.currentTimeMillis();

        /* renamed from: c */
        private boolean f87062c = true;

        /* renamed from: d */
        private final IChatWindowApp f87063d;

        /* renamed from: e */
        private final IHelpdeskDependency f87064e;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardTopExtend
        /* renamed from: a */
        public void mo123283a(IKeyboardExtendData aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardTopExtend
        /* renamed from: b */
        public boolean mo123286b() {
            return true;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardTopExtend
        /* renamed from: a */
        public ExtendType mo123282a() {
            return ExtendType.ON_CALL;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardTopExtend
        /* renamed from: c */
        public boolean mo123287c() {
            return this.f87062c;
        }

        /* renamed from: e */
        public final long mo123821e() {
            return this.f87061b;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardTopExtend
        /* renamed from: d */
        public IKeyboardExtendListener mo123288d() {
            return new C33788a(this);
        }

        /* renamed from: f */
        public final View mo123822f() {
            View view = this.f87060a;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recycleView");
            }
            return view;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/OnCallPlugin$OnCallKbExtend$getListener$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardExtendListener;", "onHide", "", "onReplaced", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/ExtendType;", "onShown", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.j$b$a */
        public static final class C33788a implements IKeyboardExtendListener {

            /* renamed from: a */
            final /* synthetic */ OnCallKbExtend f87065a;

            @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardExtendListener
            /* renamed from: a */
            public void mo123279a(ExtendType extendType) {
                Intrinsics.checkParameterIsNotNull(extendType, ShareHitPoint.f121869d);
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardExtendListener
            /* renamed from: b */
            public void mo123280b() {
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardExtendListener
            /* renamed from: a */
            public void mo123278a() {
                if (System.currentTimeMillis() > this.f87065a.mo123821e() + ((long) 5000)) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f87065a.mo123822f().getContext(), R.anim.animation_slide_buttom);
                    Intrinsics.checkExpressionValueIsNotNull(loadAnimation, "AnimationUtils.loadAnima…                        )");
                    loadAnimation.setStartOffset(0);
                    this.f87065a.mo123822f().startAnimation(loadAnimation);
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C33788a(OnCallKbExtend bVar) {
                this.f87065a = bVar;
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardTopExtend
        /* renamed from: a */
        public void mo123284a(boolean z) {
            this.f87062c = z;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardTopExtend
        /* renamed from: a */
        public boolean mo123285a(ExtendType extendType) {
            Intrinsics.checkParameterIsNotNull(extendType, ShareHitPoint.f121869d);
            return IKeyboardTopExtend.C33552a.m130036a(this, extendType);
        }

        public OnCallKbExtend(IChatWindowApp dVar, IHelpdeskDependency wVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
            this.f87063d = dVar;
            this.f87064e = wVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardTopExtend
        /* renamed from: a */
        public View mo123281a(Context context, IKeyboardExtendData aVar) {
            View view;
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            IHelpdeskDependency wVar = this.f87064e;
            if (wVar == null || (view = wVar.mo134725a(context)) == null) {
                view = new View(context);
            }
            this.f87060a = view;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recycleView");
            }
            return view;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/OnCallPlugin$onCreate$1", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$IKeyboardComponentCallbacks;", "onKeyboardReady", "", "keyboard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.j$f */
    public static final class C33793f implements IKeyboardComponent.IKeyboardComponentCallbacks {

        /* renamed from: a */
        final /* synthetic */ OnCallPlugin f87073a;

        /* renamed from: b */
        final /* synthetic */ IKeyboardComponent f87074b;

        /* renamed from: c */
        final /* synthetic */ IChatWindowApp f87075c;

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: a */
        public void mo122065a() {
            IKeyboardComponent.IKeyboardComponentCallbacks.C33036a.m127734a(this);
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: b */
        public void mo122067b() {
            IKeyboardComponent.IKeyboardComponentCallbacks.C33036a.m127736b(this);
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: a */
        public void mo122066a(KeyBoard fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "keyboard");
            this.f87074b.mo121978a("uploadLog", this.f87073a.mo123814a(this.f87075c));
        }

        C33793f(OnCallPlugin jVar, IKeyboardComponent cVar, IChatWindowApp dVar) {
            this.f87073a = jVar;
            this.f87074b = cVar;
            this.f87075c = dVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.j$e */
    static final class RunnableC33792e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ OnCallPlugin f87072a;

        RunnableC33792e(OnCallPlugin jVar) {
            this.f87072a = jVar;
        }

        public final void run() {
            IKeyboardTopExtendComponent eVar = this.f87072a.f87053d;
            if (eVar != null) {
                eVar.mo123269a(ExtendType.ON_CALL);
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    public void as_() {
        super.as_();
        ChatChatterPushHandler cVar = this.f87056g;
        if (cVar != null) {
            cVar.mo123056b();
        }
        this.f87056g = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.j$i */
    static final class RunnableC33796i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ OnCallPlugin f87078a;

        RunnableC33796i(OnCallPlugin jVar) {
            this.f87078a = jVar;
        }

        public final void run() {
            IKeyboardTopExtendComponent eVar = this.f87078a.f87053d;
            if (eVar != null) {
                eVar.mo123270a(ExtendType.ON_CALL, new IKeyboardExtendData() {
                    /* class com.ss.android.lark.chat.chatwindow.chat.v2.plugin.OnCallPlugin.RunnableC33796i.C337971 */
                });
            }
        }
    }

    /* renamed from: b */
    public final void mo123817b() {
        ITitlebarComponent bVar = this.f87058m;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titlebarComponent");
        }
        bVar.getLifecycle().addObserver(new OnCallPlugin$addLifeCycleObserver$1(this));
    }

    @Override // com.ss.android.lark.chat.entity.helpdesk.KbTopExtendControl
    /* renamed from: c */
    public void mo123818c() {
        Log.m165389i(this.f87050a, "show openBanner");
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getUIExecutor().execute(new RunnableC33796i(this));
    }

    @Override // com.ss.android.lark.chat.entity.helpdesk.KbTopExtendControl
    /* renamed from: d */
    public void mo123819d() {
        Log.m165389i(this.f87050a, "hide openBanner");
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getUIExecutor().execute(new RunnableC33792e(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/OnCallPlugin$getUploadLogPlugin$1", "Lcom/ss/android/lark/keyboard/plugin/tool/uploadlog/IUploadLogDependency;", "uploadLog", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.j$d */
    public static final class C33790d implements IUploadLogDependency {

        /* renamed from: a */
        final /* synthetic */ OnCallPlugin f87069a;

        /* renamed from: b */
        final /* synthetic */ IChatWindowApp f87070b;

        @Override // com.ss.android.lark.keyboard.plugin.tool.uploadlog.IUploadLogDependency
        /* renamed from: a */
        public void mo123823a() {
            this.f87069a.f87057h.show(this.f87069a.mo122128i());
            this.f87070b.mo123136g().mo123007a(new UIGetDataCallback(new C33791a(this)));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0017\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/OnCallPlugin$getUploadLogPlugin$1$uploadLog$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lkotlin/Unit;)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.j$d$a */
        public static final class C33791a implements IGetDataCallback<Unit> {

            /* renamed from: a */
            final /* synthetic */ C33790d f87071a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C33791a(C33790d dVar) {
                this.f87071a = dVar;
            }

            /* renamed from: a */
            public void onSuccess(Unit unit) {
                this.f87071a.f87069a.f87057h.dismiss();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                this.f87071a.f87069a.f87057h.dismiss();
            }
        }

        C33790d(OnCallPlugin jVar, IChatWindowApp dVar) {
            this.f87069a = jVar;
            this.f87070b = dVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.j$h */
    static final class RunnableC33795h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ OnCallPlugin f87077a;

        RunnableC33795h(OnCallPlugin jVar) {
            this.f87077a = jVar;
        }

        public final void run() {
            if (OnCallPlugin.m130950a(this.f87077a).getOnCallRole() != 4) {
                OnCallPlugin.m130950a(this.f87077a).getOnCallRole();
            }
            OnCallPlugin jVar = this.f87077a;
            jVar.mo123816a(OnCallPlugin.m130950a(jVar).isOncallDuty());
        }
    }

    /* renamed from: e */
    private final void m130953e() {
        Lifecycle lifecycle;
        IKeyboardTopExtendComponent eVar = this.f87053d;
        if (eVar == null) {
            String str = this.f87050a;
            StringBuilder sb = new StringBuilder();
            sb.append("keyboardTopExtendComponent is null chatId：");
            Chat chat = this.f87055f;
            if (chat == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chat");
            }
            sb.append(chat.getId());
            sb.append(" onCallId:");
            Chat chat2 = this.f87055f;
            if (chat2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chat");
            }
            sb.append(chat2.getOnCallId());
            Log.m165383e(str, sb.toString());
        } else if (eVar != null && (lifecycle = eVar.getLifecycle()) != null) {
            lifecycle.addObserver(new OnCallPlugin$addKbTopLifeCycleObserver$1(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/OnCallPlugin$onCreate$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.j$g */
    public static final class C33794g implements IGetDataCallback<Map<String, ? extends ChatChatter>> {

        /* renamed from: a */
        final /* synthetic */ OnCallPlugin f87076a;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33794g(OnCallPlugin jVar) {
            this.f87076a = jVar;
        }

        /* renamed from: a */
        public void onSuccess(Map<String, ? extends ChatChatter> map) {
            ChatChatter chatChatter;
            if (map != null && (chatChatter = (ChatChatter) map.get(OnCallPlugin.m130950a(this.f87076a).getId())) != null) {
                this.f87076a.f87054e = chatChatter;
                if (OnCallPlugin.m130950a(this.f87076a).isOncallDuty()) {
                    this.f87076a.mo123817b();
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ChatChatter m130950a(OnCallPlugin jVar) {
        ChatChatter chatChatter = jVar.f87054e;
        if (chatChatter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selfChatter");
        }
        return chatChatter;
    }

    /* renamed from: b */
    public static final /* synthetic */ Chat m130951b(OnCallPlugin jVar) {
        Chat chat = jVar.f87055f;
        if (chat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chat");
        }
        return chat;
    }

    /* renamed from: c */
    public static final /* synthetic */ IChatWindowApp m130952c(OnCallPlugin jVar) {
        IChatWindowApp dVar = jVar.f87052c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatApp");
        }
        return dVar;
    }

    /* renamed from: a */
    public final IKeyBoardPlugin mo123814a(IChatWindowApp dVar) {
        return new UploadLogKBPlugin(new C33790d(this, dVar));
    }

    /* renamed from: a */
    public final void mo123816a(boolean z) {
        boolean z2;
        View view = this.f87059n;
        if (view != null) {
            Chat chat = this.f87055f;
            if (chat == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chat");
            }
            if (!chat.isOnCall() || !z) {
                z2 = false;
            } else {
                z2 = true;
            }
            C0922v.m4415a(view, z2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/OnCallPlugin$addOnCallTicketBtn$titleBarViewAction$1", "Lcom/ss/android/lark/ui/IActionTitlebar$ViewAction;", "performAction", "", "view", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.j$c */
    public static final class C33789c extends IActionTitlebar.C57575b {

        /* renamed from: a */
        final /* synthetic */ OnCallPlugin f87066a;

        /* renamed from: b */
        final /* synthetic */ String f87067b;

        /* renamed from: c */
        final /* synthetic */ ImageView f87068c;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36511z p = b.mo134588p();
            Context f = OnCallPlugin.m130952c(this.f87066a).mo123135f();
            String str = this.f87067b;
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36510y o = b2.mo134587o();
            Intrinsics.checkExpressionValueIsNotNull(o, "ChatModuleInstanceHolder…ency().languageDependency");
            Locale d = o.mo134745d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ChatModuleInstanceHolder…ependency.languageSetting");
            String language = d.getLanguage();
            Intrinsics.checkExpressionValueIsNotNull(language, "ChatModuleInstanceHolder….languageSetting.language");
            Locale locale = Locale.ROOT;
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ROOT");
            if (language != null) {
                String lowerCase = language.toLowerCase(locale);
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                p.mo134749a(f, str, lowerCase);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33789c(OnCallPlugin jVar, String str, ImageView imageView, View view) {
            super(view);
            this.f87066a = jVar;
            this.f87067b = str;
            this.f87068c = imageView;
        }
    }

    /* renamed from: a */
    public final void mo123815a(String str) {
        IChatWindowApp dVar = this.f87052c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatApp");
        }
        ImageView imageView = new ImageView(dVar.mo123135f());
        ImageView imageView2 = imageView;
        this.f87059n = imageView2;
        imageView.setId(R.id.title_bar_ticket_iv);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        IChatWindowApp dVar2 = this.f87052c;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatApp");
        }
        Context f = dVar2.mo123135f();
        IChatWindowApp dVar3 = this.f87052c;
        if (dVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatApp");
        }
        imageView.setImageDrawable(UDIconUtils.getIconDrawable(f, (int) R.drawable.ud_icon_workorder_outlined, UIUtils.getColor(dVar3.mo123135f(), R.color.icon_n1)));
        imageView.setLayoutParams(layoutParams);
        C33789c cVar = new C33789c(this, str, imageView, imageView2);
        ITitlebarComponent bVar = this.f87058m;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titlebarComponent");
        }
        bVar.mo123663a(0, cVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatChatterPushHandler.IChatterPushListener
    public void onPushUpdatedChatter(Chatter chatter) {
        Intrinsics.checkParameterIsNotNull(chatter, "chatter");
        Chat chat = this.f87055f;
        if (chat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chat");
        }
        if (chat.isOnCall()) {
            ChatChatter chatChatter = this.f87054e;
            if (chatChatter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("selfChatter");
            }
            if (Intrinsics.areEqual(chatter, chatChatter) && (chatter instanceof ChatChatter)) {
                ChatChatter chatChatter2 = this.f87054e;
                if (chatChatter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("selfChatter");
                }
                chatChatter2.setOnCallRole(((ChatChatter) chatter).getOnCallRole());
                UICallbackExecutor.execute(new RunnableC33795h(this));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo122114a(com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp r8, com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b r9) {
        /*
        // Method dump skipped, instructions count: 306
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.OnCallPlugin.mo122114a(com.ss.android.lark.chat.chatwindow.chat.v2.component.d, com.ss.android.lark.chatwindow.a.a.b):void");
    }
}
