package com.ss.android.lark.chat.chatwindow.biz.component.keyboard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.OpenApp;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardCreator;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.WidgetViewModelKeyManager;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardViewModel;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1638a.C33427a;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chatbase.p1688b.p1689a.C34431a;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35221d;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.keyboard.IKeyBoardDependency;
import com.ss.android.lark.keyboard.IKeyBoardStatusListener;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.base.NestScrollFrameLayout;
import com.ss.android.lark.keyboard.plugin.input.InputPluginController;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.focus.InputAreaHitPoint;
import com.ss.android.lark.tour.spotlight.C57298a;
import com.ss.android.lark.utils.statistics.PerfLog;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020.H\u0016J\u0010\u0010<\u001a\u00020:2\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u00020:H\u0016J\n\u0010@\u001a\u0004\u0018\u00010\u001cH\u0002J\u0010\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020CH&J!\u0010D\u001a\u0004\u0018\u0001HE\"\b\b\u0000\u0010E*\u00020F2\u0006\u0010G\u001a\u00020HH\u0016¢\u0006\u0002\u0010IJ\n\u0010J\u001a\u0004\u0018\u00010HH\u0016J\n\u0010K\u001a\u0004\u0018\u00010HH\u0016J\b\u0010L\u001a\u00020MH\u0016J\b\u0010N\u001a\u000202H\u0016J\b\u0010O\u001a\u00020:H\u0016J\u0018\u0010P\u001a\u00020*2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u000202H\u0002J\b\u0010S\u001a\u00020:H\u0002J\b\u0010T\u001a\u000202H\u0002J\b\u0010U\u001a\u000202H\u0016J\b\u0010V\u001a\u000202H\u0016J\b\u0010W\u001a\u000202H\u0002J\"\u0010X\u001a\u00020:2\u0006\u0010Y\u001a\u00020\u00122\u0006\u0010Z\u001a\u00020\u00122\b\u0010[\u001a\u0004\u0018\u00010\\H\u0016J\b\u0010]\u001a\u00020:H\u0016J\b\u0010^\u001a\u00020:H\u0016J\b\u0010_\u001a\u00020:H\u0016J\b\u0010`\u001a\u00020:H\u0016J\u0018\u0010a\u001a\u00020:2\u0006\u0010G\u001a\u00020H2\u0006\u0010b\u001a\u00020cH\u0016J\u0010\u0010d\u001a\u00020:2\u0006\u0010;\u001a\u00020eH\u0016J\u0018\u0010f\u001a\u00020:2\u0006\u0010G\u001a\u00020H2\u0006\u0010b\u001a\u00020FH\u0016J\u0010\u0010g\u001a\u00020:2\u0006\u0010;\u001a\u00020(H\u0016J\u001e\u0010h\u001a\u00020:2\u0006\u0010G\u001a\u00020H2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020j0iH\u0016J\u0010\u0010k\u001a\u00020:2\u0006\u0010=\u001a\u00020>H\u0002J\u001a\u0010l\u001a\u00020:2\u0006\u0010m\u001a\u00020\u00162\b\u0010n\u001a\u0004\u0018\u00010\u0018H&J\b\u0010o\u001a\u00020:H\u0016J\u0010\u0010p\u001a\u00020:2\u0006\u0010q\u001a\u000202H\u0016J\u0010\u0010r\u001a\u00020:2\u0006\u0010;\u001a\u00020eH\u0016J\u0010\u0010s\u001a\u00020:2\u0006\u0010;\u001a\u00020(H\u0016J0\u0010t\u001a\u00020:2\u0012\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020j0i0v2\u0012\u0010w\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020j0i0vH\u0016R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8VX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u000e¢\u0006\u0002\n\u0000R\u001c\u00103\u001a\u0004\u0018\u000104X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006x"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/BaseKeyboardComponentV2;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent;", "mContext", "Landroid/app/Activity;", "hostVM", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardDependenceViewModel;", "mDependency", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardComponentDependency;", "(Landroid/app/Activity;Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardDependenceViewModel;Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardComponentDependency;)V", "callbacks", "", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$IKeyboardComponentCallbacks;", "getCallbacks", "()Ljava/util/List;", "callbacks$delegate", "Lkotlin/Lazy;", "layoutId", "", "getLayoutId", "()I", "mCurrentChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "mCurrentChatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "mDelayLoadRunnable", "Ljava/lang/Runnable;", "mKeyBoard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "getMKeyBoard", "()Lcom/ss/android/lark/keyboard/KeyBoard;", "setMKeyBoard", "(Lcom/ss/android/lark/keyboard/KeyBoard;)V", "mKeyboardContainer", "Landroid/widget/FrameLayout;", "getMKeyboardContainer", "()Landroid/widget/FrameLayout;", "setMKeyboardContainer", "(Landroid/widget/FrameLayout;)V", "mKeyboardControlStatusListeners", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$OnKeyboardControlStatusChangeListener;", "mKeyboardCreator", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator;", "mKeyboardPluginFactory", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IKeyboardPluginFactory;", "mKeyboardStatusListeners", "Lcom/ss/android/lark/keyboard/IKeyBoardStatusListener;", "mOpenApp", "Lcom/ss/android/lark/biz/im/api/OpenApp;", "mShowKeyboardTip", "", "mViewModel", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardViewModel;", "getMViewModel", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardViewModel;", "setMViewModel", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardViewModel;)V", "addKeyboardStatusListener", "", "listener", "attachKeyboardPlugin", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "closePanelAndSysKeyboard", "createKeyboard", "createKeyboardPluginFactory", "pluginContext", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "getKBPlugin", "T", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "name", "", "(Ljava/lang/String;)Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "getReplyParentMsgId", "getReplyRootMsgId", "getRootView", "Landroid/view/View;", "handleBack", "hideKeyboard", "initKeyboardBuilder", "context", "enableLateInit", "initKeyboardListener", "isEnableLateInit", "isKeyboardShown", "isKeyboardTipShown", "needHideKeyBoard", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "onDestroy", "onPause", "onStop", "registerIInputPlugin", "plugin", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "registerInputChangeListener", "Lcom/ss/android/lark/keyboard/plugin/input/InputPluginController$InputSupportPluginChangeListener;", "registerKBPlugin", "registerKeyboardControlStatusChangeListener", "registerPlusItem", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "selectDefaultPlugin", "setupKeyboardEnable", "chat", "chatChatter", "showKeyboard", "toggleKeyboardTipShown", "shown", "unRegisterInputChangeListener", "unRegisterKeyboardControlStatusChangeListener", "updatePlusItems", "removed", "", "added", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class BaseKeyboardComponentV2 extends Widget implements IKeyboardComponent {

    /* renamed from: a */
    public List<IKeyBoardStatusListener> f84974a = new ArrayList();

    /* renamed from: b */
    public Chat f84975b;

    /* renamed from: c */
    public ChatChatter f84976c;

    /* renamed from: d */
    public OpenApp f84977d;

    /* renamed from: e */
    public KeyboardComponentDependency f84978e;

    /* renamed from: g */
    private final Lazy f84979g = LazyKt.lazy(C33018a.INSTANCE);

    /* renamed from: h */
    private KeyBoard f84980h;

    /* renamed from: i */
    private IKeyboardCreator f84981i;

    /* renamed from: j */
    private IKeyboardCreator.IKeyboardPluginFactory f84982j;

    /* renamed from: k */
    private KeyboardViewModel f84983k;

    /* renamed from: l */
    private List<IKeyboardComponent.OnKeyboardControlStatusChangeListener> f84984l = new ArrayList();

    /* renamed from: m */
    private boolean f84985m;
    @BindView(7405)
    public FrameLayout mKeyboardContainer;

    /* renamed from: n */
    private Runnable f84986n;

    /* renamed from: o */
    private Activity f84987o;

    /* renamed from: p */
    private IKeyboardDependenceViewModel f84988p;

    /* renamed from: a */
    public abstract IKeyboardCreator.IKeyboardPluginFactory mo121966a(IKeyboardCreator.PluginContext cVar);

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent
    /* renamed from: a */
    public List<IKeyboardComponent.IKeyboardComponentCallbacks> mo121968a() {
        return (List) this.f84979g.getValue();
    }

    /* renamed from: a */
    public abstract void mo121973a(Chat chat, ChatChatter chatChatter);

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: d */
    public int mo121986d() {
        return R.layout.chat_window_component_keyboard;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J8\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0007H\u0016¨\u0006\u0014"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/component/keyboard/BaseKeyboardComponentV2$initKeyboardBuilder$1", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardCreator$IKeyboardBuildDependency;", "attachNestRoot", "", "nestScrollFrameLayout", "Lcom/ss/android/lark/keyboard/base/NestScrollFrameLayout;", "enableLateInit", "", "resetDraft", "resetOnStart", "callback", "Lcom/ss/android/lark/keyboard/IKeyBoardDependency$IResetDraftCallback;", "saveDraft", "parentId", "", "messageRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "postTitle", "postRichText", "saveDraftOnStop", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.BaseKeyboardComponentV2$b */
    public static final class C33019b implements KeyboardCreator.IKeyboardBuildDependency {

        /* renamed from: a */
        final /* synthetic */ BaseKeyboardComponentV2 f84989a;

        /* renamed from: b */
        final /* synthetic */ boolean f84990b;

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardCreator.IKeyboardBuildDependency
        /* renamed from: a */
        public boolean mo122005a() {
            return this.f84990b;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/component/keyboard/BaseKeyboardComponentV2$initKeyboardBuilder$1$resetDraft$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardViewModel$IResetDraftCallback;", "onFetchDraftSuccess", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/chatbase/model/data/ComposeDrafts;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.BaseKeyboardComponentV2$b$a */
        public static final class C33020a implements KeyboardViewModel.IResetDraftCallback {

            /* renamed from: a */
            final /* synthetic */ C33019b f84991a;

            /* renamed from: b */
            final /* synthetic */ boolean f84992b;

            /* renamed from: c */
            final /* synthetic */ IKeyBoardDependency.IResetDraftCallback f84993c;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "queueIdle"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.BaseKeyboardComponentV2$b$a$a */
            static final class C33021a implements MessageQueue.IdleHandler {

                /* renamed from: a */
                final /* synthetic */ C33020a f84994a;

                /* renamed from: b */
                final /* synthetic */ C34431a f84995b;

                C33021a(C33020a aVar, C34431a aVar2) {
                    this.f84994a = aVar;
                    this.f84995b = aVar2;
                }

                public final boolean queueIdle() {
                    IKeyBoardDependency.IResetDraftCallback.C40677a.m160773a(this.f84994a.f84993c, this.f84995b.f88903a, this.f84995b.f88905c, this.f84995b.f88904b, null, 8, null);
                    return false;
                }
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardViewModel.IResetDraftCallback
            /* renamed from: a */
            public void mo122006a(C34431a aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (this.f84992b && !TextUtils.isEmpty(aVar.f88906d)) {
                    C35221d dVar = new C35221d();
                    dVar.f90975g = aVar.f88903a;
                    dVar.f90971c = aVar.f88908f;
                    dVar.f90970b = aVar.f88906d;
                    dVar.f90969a = aVar.f88907e;
                    dVar.f90977i = aVar.f88905c;
                    dVar.f90976h = aVar.f88904b;
                    this.f84991a.f84989a.mo122063a(dVar, false, true);
                }
                if (this.f84992b) {
                    Looper.myQueue().addIdleHandler(new C33021a(this, aVar));
                } else {
                    IKeyBoardDependency.IResetDraftCallback.C40677a.m160773a(this.f84993c, aVar.f88903a, aVar.f88905c, aVar.f88904b, null, 8, null);
                }
            }

            C33020a(C33019b bVar, boolean z, IKeyBoardDependency.IResetDraftCallback bVar2) {
                this.f84991a = bVar;
                this.f84992b = z;
                this.f84993c = bVar2;
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardCreator.IKeyboardBuildDependency
        /* renamed from: a */
        public void mo122002a(NestScrollFrameLayout nestScrollFrameLayout) {
            Intrinsics.checkParameterIsNotNull(nestScrollFrameLayout, "nestScrollFrameLayout");
            this.f84989a.f84978e.mo122091a(nestScrollFrameLayout);
        }

        C33019b(BaseKeyboardComponentV2 baseKeyboardComponentV2, boolean z) {
            this.f84989a = baseKeyboardComponentV2;
            this.f84990b = z;
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardCreator.IKeyboardBuildDependency
        /* renamed from: a */
        public void mo122004a(boolean z, IKeyBoardDependency.IResetDraftCallback bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "callback");
            KeyboardViewModel c = this.f84989a.mo121985c();
            if (c != null) {
                c.resetChatDraft(z, new C33020a(this, z, bVar));
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardCreator.IKeyboardBuildDependency
        /* renamed from: a */
        public void mo122003a(String str, RichText richText, String str2, RichText richText2, boolean z) {
            String str3;
            KeyboardViewModel c = this.f84989a.mo121985c();
            if (c != null) {
                Chat chat = this.f84989a.f84975b;
                if (chat != null) {
                    str3 = chat.getId();
                } else {
                    str3 = null;
                }
                c.saveAllDraft(str, str3, richText, str2, richText2, z);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/component/keyboard/BaseKeyboardComponentV2$registerKBPlugin$1", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "getName", "", "getPlugin", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.BaseKeyboardComponentV2$f */
    public static final class C33025f implements IKeyboardCreator.IPlugin<IKeyBoardPlugin> {

        /* renamed from: a */
        final /* synthetic */ String f84999a;

        /* renamed from: b */
        final /* synthetic */ IKeyBoardPlugin f85000b;

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
        /* renamed from: a */
        public String mo122012a() {
            return this.f84999a;
        }

        /* renamed from: b */
        public IKeyBoardPlugin mo122014c() {
            return this.f85000b;
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
        /* renamed from: d */
        public boolean mo122015d() {
            return IKeyboardCreator.IPlugin.C33037a.m127748a(this);
        }

        C33025f(String str, IKeyBoardPlugin bVar) {
            this.f84999a = str;
            this.f85000b = bVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final KeyBoard mo121982b() {
        return this.f84980h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final KeyboardViewModel mo121985c() {
        return this.f84983k;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: j */
    public boolean mo121992j() {
        return this.f84985m;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: a */
    public void mo121980a(boolean z) {
        this.f84985m = z;
        if (z) {
            mo121995m();
        } else {
            mo121996n();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: a */
    public void mo121976a(InputPluginController.InputSupportPluginChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        KeyBoard fVar = this.f84980h;
        if (fVar != null) {
            fVar.mo146798a(aVar);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: a */
    public void mo121978a(String str, IKeyBoardPlugin bVar) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(bVar, "plugin");
        IKeyboardCreator.IKeyboardPluginFactory aVar = this.f84982j;
        if (aVar != null) {
            aVar.mo122073a(str, new C33025f(str, bVar));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: a */
    public void mo121977a(String str, IKeyboardCreator.IPlugin<IPlusItem> bVar) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(bVar, "plugin");
        IKeyboardCreator.IKeyboardPluginFactory aVar = this.f84982j;
        if (aVar != null) {
            aVar.mo122075b(str, bVar);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: a */
    public void mo121979a(List<? extends IKeyboardCreator.IPlugin<IPlusItem>> list, List<? extends IKeyboardCreator.IPlugin<IPlusItem>> list2) {
        Intrinsics.checkParameterIsNotNull(list, "removed");
        Intrinsics.checkParameterIsNotNull(list2, "added");
        IKeyboardCreator.IKeyboardPluginFactory aVar = this.f84982j;
        if (aVar != null) {
            aVar.mo122074a(list, list2);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: p */
    public void mo121999p() {
        KeyBoard fVar = this.f84980h;
        if (fVar != null) {
            fVar.mo146820c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$IKeyboardComponentCallbacks;", "Lkotlin/collections/ArrayList;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.BaseKeyboardComponentV2$a */
    static final class C33018a extends Lambda implements Function0<ArrayList<IKeyboardComponent.IKeyboardComponentCallbacks>> {
        public static final C33018a INSTANCE = new C33018a();

        C33018a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayList<IKeyboardComponent.IKeyboardComponentCallbacks> invoke() {
            return new ArrayList<>();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    public boolean an_() {
        KeyBoard fVar = this.f84980h;
        if (fVar != null) {
            return fVar.mo146828i();
        }
        return false;
    }

    /* renamed from: f */
    public final void mo121988f() {
        KeyBoard fVar = this.f84980h;
        if (fVar != null) {
            fVar.mo146796a(new C33022c(this));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent
    /* renamed from: h */
    public boolean mo121990h() {
        KeyBoard fVar = this.f84980h;
        if (fVar == null || !fVar.mo146824e()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: i */
    public View mo121991i() {
        FrameLayout frameLayout = this.mKeyboardContainer;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyboardContainer");
        }
        return frameLayout;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: k */
    public String mo121993k() {
        KeyBoard fVar = this.f84980h;
        if (fVar != null) {
            return fVar.mo146836q();
        }
        return null;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: l */
    public String mo121994l() {
        KeyBoard fVar = this.f84980h;
        if (fVar != null) {
            return fVar.mo146837r();
        }
        return null;
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    public void onStop() {
        super.onStop();
        KeyBoard fVar = this.f84980h;
        if (fVar != null) {
            fVar.mo146839t();
        }
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: q */
    public void mo122000q() {
        super.mo122000q();
        KeyBoard fVar = this.f84980h;
        if (fVar != null) {
            fVar.mo146843x();
        }
    }

    /* renamed from: t */
    private final boolean m127587t() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        return b.mo134586n().mo134685a("chat.laterinflate.keyboard");
    }

    /* renamed from: g */
    public final boolean mo121989g() {
        if (KeyboardHideJudge.f85065a.mo122099a(this.f84975b, this.f84976c, this.f84977d) || mo121992j()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: m */
    public void mo121995m() {
        KeyBoard fVar = this.f84980h;
        if (fVar != null) {
            fVar.mo146833n();
        }
        Iterator<T> it = this.f84984l.iterator();
        while (it.hasNext()) {
            it.next().mo122068a(false);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: n */
    public void mo121996n() {
        if (!mo121989g()) {
            KeyBoard fVar = this.f84980h;
            if (fVar != null) {
                fVar.mo146834o();
            }
            Iterator<T> it = this.f84984l.iterator();
            while (it.hasNext()) {
                it.next().mo122068a(true);
            }
        }
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: r */
    public void mo122001r() {
        super.mo122001r();
        Runnable runnable = this.f84986n;
        if (runnable != null) {
            FrameLayout frameLayout = this.mKeyboardContainer;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyboardContainer");
            }
            frameLayout.removeCallbacks(runnable);
        }
        KeyboardViewModel cVar = this.f84983k;
        if (cVar != null) {
            cVar.onDestroy();
        }
        KeyBoard fVar = this.f84980h;
        if (fVar != null) {
            fVar.mo146838s();
        }
        this.f84980h = null;
    }

    /* renamed from: s */
    private final KeyBoard m127586s() {
        boolean t = m127587t();
        Log.m165389i("ChatWindowLog", "keyboard inflate later enable = " + t);
        View K = mo141184K();
        if (K == null) {
            Intrinsics.throwNpe();
        }
        Context context = K.getContext();
        if (context != null) {
            IKeyboardCreator a = m127584a((Activity) context, t);
            this.f84981i = a;
            if (a == null) {
                return null;
            }
            FrameLayout frameLayout = this.mKeyboardContainer;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyboardContainer");
            }
            return a.mo122071a(frameLayout);
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        PerfLog.start("keyboard_init", "");
        View K = mo141184K();
        if (K == null) {
            Intrinsics.throwNpe();
        }
        ButterKnife.bind(this, K);
        this.f84980h = m127586s();
        BaseKeyboardComponentV2 baseKeyboardComponentV2 = this;
        C33427a.m129533a(this.f84988p.getInitData(), baseKeyboardComponentV2, new C33023d(this));
        this.f84988p.getChat().mo5923a(baseKeyboardComponentV2, new C33024e(this));
        PerfLog.end("keyboard_init", "");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\"\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/component/keyboard/BaseKeyboardComponentV2$initKeyboardListener$1", "Lcom/ss/android/lark/keyboard/IKeyBoardStatusListener;", "onHeightChanged", "", "toolBoxHeight", "", "onStateChanged", "isShow", "", "replyMsgId", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.BaseKeyboardComponentV2$c */
    public static final class C33022c implements IKeyBoardStatusListener {

        /* renamed from: a */
        final /* synthetic */ BaseKeyboardComponentV2 f84996a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33022c(BaseKeyboardComponentV2 baseKeyboardComponentV2) {
            this.f84996a = baseKeyboardComponentV2;
        }

        @Override // com.ss.android.lark.keyboard.IKeyBoardStatusListener
        /* renamed from: a */
        public void mo122008a(int i) {
            KeyBoard b = this.f84996a.mo121982b();
            if (!(b == null || b.mo146818b("input_richtext_expand") || b.mo146818b("post"))) {
                for (IKeyBoardStatusListener eVar : this.f84996a.f84974a) {
                    eVar.mo122008a(i);
                }
            }
        }

        @Override // com.ss.android.lark.keyboard.IKeyBoardStatusListener
        /* renamed from: a */
        public void mo122009a(boolean z, int i, String str) {
            if (this.f84996a.mo121982b() != null) {
                KeyBoard b = this.f84996a.mo121982b();
                if (b == null) {
                    Intrinsics.throwNpe();
                }
                if (!b.mo146818b("input_richtext_expand")) {
                    KeyBoard b2 = this.f84996a.mo121982b();
                    if (b2 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (!b2.mo146818b("post")) {
                        for (IKeyBoardStatusListener eVar : this.f84996a.f84974a) {
                            eVar.mo122009a(z, i, str);
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: a */
    public <T extends IKeyBoardPlugin> T mo121967a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        KeyBoard fVar = this.f84980h;
        if (fVar != null) {
            return (T) fVar.mo146819c(str);
        }
        return null;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: b */
    public void mo121983b(IKeyboardComponent.OnKeyboardControlStatusChangeListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f84984l.remove(cVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.BaseKeyboardComponentV2$e */
    static final class C33024e<T> implements AbstractC1178x<Chat> {

        /* renamed from: a */
        final /* synthetic */ BaseKeyboardComponentV2 f84998a;

        C33024e(BaseKeyboardComponentV2 baseKeyboardComponentV2) {
            this.f84998a = baseKeyboardComponentV2;
        }

        /* renamed from: a */
        public final void onChanged(Chat chat) {
            if (chat != null) {
                KeyboardViewModel c = this.f84998a.mo121985c();
                if (c != null) {
                    c.updateChat(chat);
                }
                BaseKeyboardComponentV2 baseKeyboardComponentV2 = this.f84998a;
                baseKeyboardComponentV2.mo121973a(chat, baseKeyboardComponentV2.f84976c);
            }
        }
    }

    /* renamed from: b */
    private final void m127585b(C35219b bVar) {
        KeyBoard fVar;
        if (TextUtils.equals(bVar.f90952b, "sticker_set_activity") && (fVar = this.f84980h) != null) {
            fVar.mo146844y();
            fVar.mo146823e("face");
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: b */
    public void mo121984b(InputPluginController.InputSupportPluginChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        KeyBoard fVar = this.f84980h;
        if (fVar != null) {
            fVar.mo146815b(aVar);
        }
    }

    /* renamed from: a */
    public void mo121971a(IKeyboardComponent.IKeyboardComponentCallbacks bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "callback");
        IKeyboardComponent.C33035a.m127730a(this, bVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.BaseKeyboardComponentV2$d */
    static final class C33023d<T> implements AbstractC1178x<C35219b> {

        /* renamed from: a */
        final /* synthetic */ BaseKeyboardComponentV2 f84997a;

        C33023d(BaseKeyboardComponentV2 baseKeyboardComponentV2) {
            this.f84997a = baseKeyboardComponentV2;
        }

        /* renamed from: a */
        public final void onChanged(C35219b bVar) {
            PerfLog.start("keyboard_init_with_data", "");
            if (bVar != null) {
                this.f84997a.f84975b = bVar.f90956f;
                this.f84997a.f84976c = bVar.f90957g;
                this.f84997a.f84977d = bVar.f90960j;
                Chat chat = bVar.f90956f;
                Intrinsics.checkExpressionValueIsNotNull(chat, "it.chat");
                KeyboardModelFactory iVar = new KeyboardModelFactory(chat, this.f84997a.f84978e);
                BaseKeyboardComponentV2 baseKeyboardComponentV2 = this.f84997a;
                Object o = baseKeyboardComponentV2.mo141195o();
                if (o != null) {
                    baseKeyboardComponentV2.mo121972a((KeyboardViewModel) new C1144ai((Fragment) o, iVar).mo6006a(WidgetViewModelKeyManager.f86344a.mo123198a(KeyboardViewModel.class), KeyboardViewModel.class));
                    this.f84997a.mo121974a(bVar);
                    this.f84997a.mo121988f();
                    if (this.f84997a.mo121989g()) {
                        this.f84997a.mo121995m();
                    }
                    BaseKeyboardComponentV2 baseKeyboardComponentV22 = this.f84997a;
                    Chat chat2 = bVar.f90956f;
                    Intrinsics.checkExpressionValueIsNotNull(chat2, "it.chat");
                    baseKeyboardComponentV22.mo121973a(chat2, bVar.f90957g);
                    PerfLog.end("keyboard_init_with_data", "");
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: a */
    public void mo121970a(IKeyboardComponent.OnKeyboardControlStatusChangeListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f84984l.add(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo121972a(KeyboardViewModel cVar) {
        this.f84983k = cVar;
    }

    /* renamed from: a */
    public final void mo121974a(C35219b bVar) {
        Object o = mo141195o();
        if (o != null) {
            Fragment fragment = (Fragment) o;
            Chat chat = bVar.f90956f;
            if (chat == null) {
                Intrinsics.throwNpe();
            }
            IKeyboardCreator.IKeyboardPluginFactory a = mo121966a(new IKeyboardCreator.PluginContext.Builder(fragment, chat).mo122085a(bVar.f90957g).mo122086a(this.f84980h).mo122084a(this.f84983k).mo122087a());
            this.f84982j = a;
            IKeyboardCreator dVar = this.f84981i;
            if (dVar != null) {
                if (a == null) {
                    Intrinsics.throwNpe();
                }
                IKeyboardCreator a2 = dVar.mo122069a(a);
                if (a2 != null) {
                    a2.mo122070a();
                }
            }
            m127585b(bVar);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: a */
    public synchronized void mo121975a(IKeyBoardStatusListener eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "listener");
        this.f84974a.add(eVar);
    }

    /* renamed from: a */
    private final IKeyboardCreator m127584a(Activity activity, boolean z) {
        FrameLayout frameLayout = this.mKeyboardContainer;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyboardContainer");
        }
        C57298a.m222016a("keyboard_container", frameLayout);
        InputAreaHitPoint.f135709c.mo187481a("message_input");
        return new KeyboardCreator(activity, new C33019b(this, z));
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        KeyBoard fVar = this.f84980h;
        if (fVar != null) {
            fVar.mo146812a(i, i2, intent);
        }
    }

    public BaseKeyboardComponentV2(Activity activity, IKeyboardDependenceViewModel eVar, KeyboardComponentDependency fVar) {
        Intrinsics.checkParameterIsNotNull(activity, "mContext");
        Intrinsics.checkParameterIsNotNull(eVar, "hostVM");
        Intrinsics.checkParameterIsNotNull(fVar, "mDependency");
        this.f84987o = activity;
        this.f84988p = eVar;
        this.f84978e = fVar;
    }
}
