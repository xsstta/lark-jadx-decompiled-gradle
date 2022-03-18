package com.ss.android.lark.chat.chatwindow.chat.v2.component;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.C1177w;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.bytedance.monitor.collector.C20128c;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.component.ui.layout.ILKUILayout;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26254af;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.ai.smartreply.dto.SmartReplyItem;
import com.ss.android.lark.ai.smartreply.inter.AbstractC28621d;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.OpenApp;
import com.ss.android.lark.biz.im.extension.ChatContext;
import com.ss.android.lark.biz.im.extension.ChatWindowObserver;
import com.ss.android.lark.biz.im.extension.ExtensionCallback;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.ComponentCreator;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardComponentDependency;
import com.ss.android.lark.chat.chatwindow.biz.plugin.SkeletonPlugin;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.ChatPluginManager;
import com.ss.android.lark.chat.chatwindow.chat.C33247j;
import com.ss.android.lark.chat.chatwindow.chat.C33255l;
import com.ss.android.lark.chat.chatwindow.chat.data.content.ChatMessageContentResolver;
import com.ss.android.lark.chat.chatwindow.chat.data.content.MessageContentResolver;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowViewModel;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowAppExtend;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.ExtendType;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardTopExtendComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.KeyboardExtendsManager;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.KeyboardTopExtendComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.sidebar.ISideMenuComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.sidebar.SideMenuComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.MockTabComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.DesktopTitlebarComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.IMessageSender;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.MessageSender;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1638a.C33427a;
import com.ss.android.lark.chat.chatwindow.secretchat.data.content.SecretChatMessageContentResolver;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.SendStatus;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;
import com.ss.android.lark.chatbase.view.LarkPlayModeTip;
import com.ss.android.lark.chatwindow.C35212a;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35221d;
import com.ss.android.lark.chatwindow.view.firsttip.ChatTipController;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.framework.larkwidget.WidgetManager;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.keyboard.IKeyBoardStatusListener;
import com.ss.android.lark.keyboard.base.NestScrollFrameLayout;
import com.ss.android.lark.keyboard.plugin.tool.at.AtKBPlugin;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.lark.threadwindow.p2760a.p2764d.C56035f;
import com.ss.android.lark.tour.block.ActionBlockManager;
import com.ss.android.lark.utils.statistics.PerfLog;
import com.ss.android.lark.widget.ILifeCycleEventObserve;
import com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0002\u00187\u0018\u0000 \u00012\u00020\u00012\u00020\u0002:\u0004\u0001\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\nH\u0016J\u0010\u0010D\u001a\u00020B2\u0006\u0010C\u001a\u00020\rH\u0016J\u0010\u0010E\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0014H\u0016J\u0010\u0010F\u001a\u00020B2\u0006\u0010C\u001a\u000205H\u0016J\u0010\u0010G\u001a\u00020B2\u0006\u0010C\u001a\u00020:H\u0016J\b\u0010H\u001a\u00020IH\u0002J\b\u0010J\u001a\u00020BH\u0002J\u0012\u0010K\u001a\u00020<2\b\u0010L\u001a\u0004\u0018\u00010MH\u0002J\b\u0010N\u001a\u00020BH\u0016J-\u0010O\u001a\u0002HP\"\u0010\b\u0000\u0010P*\n\u0012\u0006\b\u0001\u0012\u00020R0Q2\f\u0010S\u001a\b\u0012\u0004\u0012\u0002HP0TH\u0016¢\u0006\u0002\u0010UJ\b\u0010V\u001a\u00020WH\u0016J\b\u0010X\u001a\u00020\u0004H\u0016J\b\u0010Y\u001a\u00020ZH\u0016J\b\u0010,\u001a\u00020[H\u0016J%\u0010\\\u001a\u0002HP\"\b\b\u0000\u0010P*\u00020]2\f\u0010S\u001a\b\u0012\u0004\u0012\u0002HP0TH\u0016¢\u0006\u0002\u0010^J\b\u0010_\u001a\u00020IH\u0016J\u0012\u0010`\u001a\u00020B2\b\u0010a\u001a\u0004\u0018\u00010bH\u0002J\b\u0010c\u001a\u00020BH\u0002J\b\u0010d\u001a\u00020BH\u0002J\b\u0010e\u001a\u00020BH\u0002J\b\u0010f\u001a\u00020BH\u0002J\b\u0010g\u001a\u00020BH\u0002J\b\u0010h\u001a\u00020BH\u0002J\"\u0010i\u001a\u00020B2\u0006\u0010j\u001a\u00020\u001f2\u0006\u0010k\u001a\u00020\u001f2\b\u0010l\u001a\u0004\u0018\u00010mH\u0016J\b\u0010n\u001a\u00020BH\u0016J\b\u0010o\u001a\u00020BH\u0016J\b\u0010p\u001a\u00020BH\u0016J\u0010\u0010q\u001a\u00020B2\u0006\u0010r\u001a\u00020\u0004H\u0016J,\u0010s\u001a\u00020B2\u0006\u0010a\u001a\u00020b2\u001a\u0010t\u001a\u0016\u0012\u0004\u0012\u00020u\u0018\u00010\tj\n\u0012\u0004\u0012\u00020u\u0018\u0001`\u000bH\u0016J\u0012\u0010v\u001a\u00020\u001f2\b\u0010w\u001a\u0004\u0018\u00010mH\u0016J\b\u0010x\u001a\u00020BH\u0002J\u0010\u0010y\u001a\u00020B2\u0006\u0010C\u001a\u00020\nH\u0016J\u0010\u0010z\u001a\u00020B2\u0006\u0010C\u001a\u00020\rH\u0016J\u0010\u0010{\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0014H\u0016J\u0010\u0010|\u001a\u00020B2\u0006\u0010C\u001a\u000205H\u0016J\u0010\u0010}\u001a\u00020B2\u0006\u0010C\u001a\u00020:H\u0016J\u0011\u0010~\u001a\u00020B2\u0007\u0010\u001a\u00030\u0001H\u0002J\u0013\u0010\u0001\u001a\u00020B2\b\u0010\u0001\u001a\u00030\u0001H\u0002R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\r0\tj\b\u0012\u0004\u0012\u00020\r`\u000bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00140\tj\b\u0012\u0004\u0012\u00020\u0014`\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0004\n\u0002\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001f8VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020+X.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0010\u00100\u001a\u0004\u0018\u000101X\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u000e¢\u0006\u0002\n\u0000R\u001e\u00104\u001a\u0012\u0012\u0004\u0012\u0002050\tj\b\u0012\u0004\u0012\u000205`\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u000207X\u0004¢\u0006\u0004\n\u0002\u00108R\u001e\u00109\u001a\u0012\u0012\u0004\u0012\u00020:0\tj\b\u0012\u0004\u0012\u00020:`\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0010\u0010?\u001a\u0004\u0018\u00010@X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowAppExtend;", "chatBundle", "Lcom/ss/android/lark/biz/im/api/ChatBundle;", "viewDependency", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$IViewDependence;", "(Lcom/ss/android/lark/biz/im/api/ChatBundle;Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$IViewDependence;)V", "activityResultHandlers", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$IActivityResultHandler;", "Lkotlin/collections/ArrayList;", "backPressHandlers", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$IBackPressHandler;", "getChatBundle", "()Lcom/ss/android/lark/biz/im/api/ChatBundle;", "chatWindowObserverList", "", "Lcom/ss/android/lark/biz/im/extension/ChatWindowObserver;", "closeChatHandlers", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$ICloseChatHandler;", "keyboardComponent", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent;", "keyboardComponentDependency", "com/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$keyboardComponentDependency$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$keyboardComponentDependency$1;", "keyboardExtendComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/KeyboardTopExtendComponent;", "keyboardStatusListener", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$OnKeyboardControlStatusChangeListener;", "layoutId", "", "getLayoutId", "()I", "mRootView", "Landroid/widget/FrameLayout;", "getMRootView", "()Landroid/widget/FrameLayout;", "setMRootView", "(Landroid/widget/FrameLayout;)V", "messageListComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent;", "messageSender", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender;", "getMessageSender", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender;", "setMessageSender", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender;)V", "pluginManager", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/ChatPluginManager;", "sideMenuComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/sidebar/SideMenuComponent;", "smartReplyShowHandlers", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$IShowSmartReplyHandler;", "statusListener", "com/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$statusListener$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$statusListener$1;", "titleStateChangeHandlers", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$OnTitleStateChangeListener;", "titlebarComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent;", "getViewDependency", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$IViewDependence;", "viewModel", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowViewModel;", "addActivityResultHandler", "", "handle", "addBackPressHandler", "addCloseHandler", "addShowSmartReplyHandler", "addTitleStateChangeHandler", "canHideTitleBar", "", "createComponents", "createTitleBarComponent", "titleBarDependency", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$ITitleBarComponentDependency;", "exitChat", "getComponent", "T", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "getContext", "Landroid/content/Context;", "getExtras", "getHostRootView", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/IMessageSender;", "getViewModel", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IDependencyViewModel;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IDependencyViewModel;", "handleBack", "hideFeedCard", "chatId", "", "initApp", "initChatWindowObserver", "initMessageSender", "initPlugin", "initSkeleton", "initViewModel", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "onDestroy", "onFragmentBringToFront", "onNewIntent", "bundle", "openNewChat", "contactsToApply", "Lcom/ss/android/lark/contact/entity/Contact;", "parseNewIntentPurpose", "intent", "reloadComponent", "removeActivityResultHandler", "removeBackPressHandler", "removeCloseHandler", "removeShowSmartReplyHandler", "removeTitleStateChangeHandler", "reportEnterChatHitPoint", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "showOpenChatError", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "Companion", "IViewDependence", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChatWindowApp extends Widget implements IChatWindowAppExtend {

    /* renamed from: j */
    public static boolean f86265j;

    /* renamed from: k */
    public static final Companion f86266k = new Companion(null);

    /* renamed from: x */
    private static boolean f86267x;

    /* renamed from: a */
    public ChatWindowViewModel f86268a;

    /* renamed from: b */
    public TitlebarComponent f86269b;

    /* renamed from: c */
    public IKeyboardComponent f86270c;

    /* renamed from: d */
    public MessageListComponent f86271d;

    /* renamed from: e */
    public KeyboardTopExtendComponent f86272e;

    /* renamed from: f */
    public MessageSender f86273f;

    /* renamed from: g */
    public ChatPluginManager f86274g;

    /* renamed from: h */
    public final ArrayList<IChatWindowApp.IShowSmartReplyHandler> f86275h = new ArrayList<>();

    /* renamed from: i */
    public final ArrayList<IChatTabPageSpec.OnTitleStateChangeListener> f86276i = new ArrayList<>();

    /* renamed from: l */
    private SideMenuComponent f86277l;

    /* renamed from: m */
    private IKeyboardComponent.OnKeyboardControlStatusChangeListener f86278m = new C33486r(this);
    @BindView(8599)
    public FrameLayout mRootView;

    /* renamed from: n */
    private final C33485q f86279n = new C33485q(this);

    /* renamed from: o */
    private final C33490u f86280o = new C33490u(this);

    /* renamed from: p */
    private final ArrayList<IChatWindowApp.IBackPressHandler> f86281p = new ArrayList<>();

    /* renamed from: q */
    private final ArrayList<IChatWindowApp.ICloseChatHandler> f86282q = new ArrayList<>();

    /* renamed from: t */
    private final ArrayList<IChatWindowApp.IActivityResultHandler> f86283t = new ArrayList<>();

    /* renamed from: u */
    private List<? extends ChatWindowObserver> f86284u;

    /* renamed from: v */
    private final ChatBundle f86285v;

    /* renamed from: w */
    private final IViewDependence f86286w;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J.\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$IViewDependence;", "", "closePage", "", "getBaseFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "getFragmentManager", "Landroidx/fragment/app/FragmentManager;", "openNewChat", "chatId", "", "contactsToApply", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/contact/entity/Contact;", "Lkotlin/collections/ArrayList;", "triggerEventChanged", "eventName", "Lcom/ss/android/lark/widget/ILifeCycleEventObserve$Event;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp$b */
    public interface IViewDependence {
        /* renamed from: a */
        FragmentManager mo122999a();

        /* renamed from: a */
        void mo123000a(ILifeCycleEventObserve.Event event);

        /* renamed from: b */
        BaseFragment mo123001b();

        /* renamed from: c */
        void mo123002c();
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowAppExtend
    /* renamed from: a */
    public int mo123120a(Intent intent) {
        return 2;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowAppExtend
    /* renamed from: a */
    public void mo123124a(ChatBundle chatBundle) {
        Intrinsics.checkParameterIsNotNull(chatBundle, "bundle");
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: d */
    public int mo121986d() {
        return R.layout.activity_chat_window_v2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$Companion;", "", "()V", "LOG_TAG", "", "doFrameInited", "", "enableBooster", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$createComponents$3", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/KeyboardTopExtendComponent$KeyboardExtendComponentDependency;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp$e */
    public static final class C33470e implements KeyboardTopExtendComponent.KeyboardExtendComponentDependency {
        C33470e() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$initApp$3", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$IListComponentCallbacks;", "onChatUpdate", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onP2pChatterUpdate", "chatChatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp$i */
    public static final class C33474i implements IMessageListComponent.IListComponentCallbacks {

        /* renamed from: a */
        final /* synthetic */ ChatWindowApp f86292a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.IListComponentCallbacks
        /* renamed from: a */
        public void mo122152a() {
            IMessageListComponent.IListComponentCallbacks.C33556a.m130094a(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33474i(ChatWindowApp chatWindowApp) {
            this.f86292a = chatWindowApp;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.IListComponentCallbacks
        /* renamed from: a */
        public void mo122154a(ChatChatter chatChatter) {
            Intrinsics.checkParameterIsNotNull(chatChatter, "chatChatter");
            this.f86292a.mo123121a().mo123024a(chatChatter);
            ChatParamUtils.m133140a(chatChatter);
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.IListComponentCallbacks
        /* renamed from: a */
        public void mo122153a(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            this.f86292a.mo123121a().mo123023a(chat);
            ChatWindowViewModel bVar = this.f86292a.f86268a;
            if (bVar == null) {
                Intrinsics.throwNpe();
            }
            bVar.getChat().mo5926a(chat);
            ChatParamUtils.m133138a(chat);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp
    /* renamed from: b */
    public ChatBundle mo123134b() {
        return this.f86285v;
    }

    /* renamed from: m */
    public final ChatBundle mo123142m() {
        return this.f86285v;
    }

    /* renamed from: n */
    public final IViewDependence mo123143n() {
        return this.f86286w;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowAppExtend
    /* renamed from: a */
    public boolean mo123132a(KeyEvent keyEvent) {
        Intrinsics.checkParameterIsNotNull(keyEvent, "event");
        return IChatWindowAppExtend.C33504a.m129837a(this, keyEvent);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowAppExtend
    /* renamed from: a */
    public boolean mo123133a(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        return IChatWindowAppExtend.C33504a.m129838a(this, motionEvent);
    }

    /* renamed from: a */
    public final void mo123131a(String str) {
        if (!TextUtils.isEmpty(str)) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134512K().mo134688a(new Channel(Channel.Type.CHAT, str));
        }
        Log.m165379d("ChatWindowLog", "hideFeedCard:" + str);
    }

    /* renamed from: a */
    public final void mo123130a(C35219b bVar) {
        ChatHitPointNew.Companion aVar = ChatHitPointNew.f135660c;
        Chat chat = bVar.f90956f;
        Intrinsics.checkExpressionValueIsNotNull(chat, "initData.chat");
        OpenApp openApp = bVar.f90960j;
        ChatHitPointNew.Companion.m213104a(aVar, chat, openApp != null ? openApp.getBotId() : null, bVar.f90957g, (List) null, 8, (Object) null);
        CoreThreadPool.getSerialTaskHandler().post(new RunnableC33487s(bVar));
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp
    /* renamed from: a */
    public void mo123129a(IChatTabPageSpec.OnTitleStateChangeListener dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "handle");
        this.f86276i.add(dVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$initChatWindowObserver$chatContext$1", "Lcom/ss/android/lark/biz/im/extension/ChatContext;", "getChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getContext", "Landroid/content/Context;", "showTodoSmartReply", "", "drawable", "Landroid/graphics/drawable/Drawable;", "label", "", "callback", "Lcom/ss/android/lark/biz/im/extension/ExtensionCallback;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp$m */
    public static final class C33478m implements ChatContext {

        /* renamed from: a */
        final /* synthetic */ ChatWindowApp f86296a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onAlertClicked"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp$m$a */
        static final class C33479a implements AbstractC28621d.AbstractC28622a {

            /* renamed from: a */
            final /* synthetic */ ExtensionCallback f86297a;

            C33479a(ExtensionCallback dVar) {
                this.f86297a = dVar;
            }

            @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28621d.AbstractC28622a
            /* renamed from: a */
            public final void mo101869a() {
                this.f86297a.mo106813a(Unit.INSTANCE);
            }
        }

        @Override // com.ss.android.lark.biz.im.extension.ChatContext
        /* renamed from: a */
        public Context mo106810a() {
            return this.f86296a.mo123135f();
        }

        @Override // com.ss.android.lark.biz.im.extension.ChatContext
        /* renamed from: b */
        public Chat mo106812b() {
            ChatWindowViewModel bVar = this.f86296a.f86268a;
            if (bVar == null) {
                Intrinsics.throwNpe();
            }
            return bVar.getChat().mo5927b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33478m(ChatWindowApp chatWindowApp) {
            this.f86296a = chatWindowApp;
        }

        @Override // com.ss.android.lark.biz.im.extension.ChatContext
        /* renamed from: a */
        public void mo106811a(Drawable drawable, String str, ExtensionCallback<Unit> dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "callback");
            if (str == null) {
                str = "";
            }
            SmartReplyItem smartReplyItem = new SmartReplyItem(str, SmartReplyItem.Type.TODO);
            smartReplyItem.mo101839a(drawable);
            smartReplyItem.mo101840a(new SmartReplyItem.C28615c(new C33479a(dVar)));
            Iterator<T> it = this.f86296a.f86275h.iterator();
            while (it.hasNext()) {
                it.next().mo123197a(CollectionsKt.mutableListOf(smartReplyItem));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J \u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0013H\u0016J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH\u0016¨\u0006 "}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$createComponents$2", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$MessageListComponentDependency;", "appendText", "", "text", "Lcom/ss/android/lark/widget/richtext/RichText;", "title", "", "postText", "closePage", "getCurrentFragment", "Landroidx/fragment/app/Fragment;", "getGuideAnchorView", "Landroid/view/View;", "getKeyboardInfo", "Lcom/ss/android/lark/chatwindow/model/data/ReplyInfo;", "getMessageSender", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/IMessageSender;", "insertAtInfoInEditor", "", BottomDialog.f17198f, "name", "isOutChat", "onEnterReplyMode", "replyInfo", "isReEdit", "resetOnStart", "toggleKeyboardTipShown", "shown", "triggerEventChanged", "eventName", "Lcom/ss/android/lark/widget/ILifeCycleEventObserve$Event;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp$d */
    public static final class C33469d implements IMessageListComponent.MessageListComponentDependency {

        /* renamed from: a */
        final /* synthetic */ ChatWindowApp f86288a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.MessageListComponentDependency
        /* renamed from: d */
        public void mo123155d() {
            this.f86288a.mo123138i();
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.MessageListComponentDependency
        /* renamed from: b */
        public View mo123153b() {
            TitlebarComponent titlebarComponent = this.f86288a.f86269b;
            if (titlebarComponent != null) {
                return titlebarComponent.ar_();
            }
            return null;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.MessageListComponentDependency
        /* renamed from: c */
        public IMessageSender mo123154c() {
            return this.f86288a.mo123121a();
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.MessageListComponentDependency
        /* renamed from: e */
        public Fragment mo123156e() {
            return this.f86288a.mo123143n().mo123001b();
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.MessageListComponentDependency
        /* renamed from: a */
        public C35221d mo123147a() {
            String str;
            C35221d dVar = new C35221d();
            IKeyboardComponent cVar = this.f86288a.f86270c;
            String str2 = null;
            if (cVar != null) {
                str = cVar.mo121994l();
            } else {
                str = null;
            }
            dVar.f90970b = str;
            IKeyboardComponent cVar2 = this.f86288a.f86270c;
            if (cVar2 != null) {
                str2 = cVar2.mo121993k();
            }
            dVar.f90969a = str2;
            return dVar;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33469d(ChatWindowApp chatWindowApp) {
            this.f86288a = chatWindowApp;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.MessageListComponentDependency
        /* renamed from: a */
        public void mo123149a(ILifeCycleEventObserve.Event event) {
            Intrinsics.checkParameterIsNotNull(event, "eventName");
            this.f86288a.mo123143n().mo123000a(event);
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.MessageListComponentDependency
        /* renamed from: a */
        public void mo123151a(boolean z) {
            IKeyboardComponent cVar = this.f86288a.f86270c;
            if (cVar != null) {
                cVar.mo121980a(z);
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.MessageListComponentDependency
        /* renamed from: a */
        public void mo123148a(C35221d dVar, boolean z, boolean z2) {
            Intrinsics.checkParameterIsNotNull(dVar, "replyInfo");
            IKeyboardComponent cVar = this.f86288a.f86270c;
            if (cVar != null) {
                cVar.mo122063a(dVar, z, z2);
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.MessageListComponentDependency
        /* renamed from: a */
        public void mo123150a(RichText richText, String str, RichText richText2) {
            IKeyboardComponent cVar = this.f86288a.f86270c;
            if (cVar != null) {
                cVar.mo122064a(richText, str, richText2);
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.MessageListComponentDependency
        /* renamed from: a */
        public boolean mo123152a(String str, String str2, boolean z) {
            AtKBPlugin aVar;
            Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
            Intrinsics.checkParameterIsNotNull(str2, "name");
            IKeyboardComponent cVar = this.f86288a.f86270c;
            if (cVar == null || (aVar = (AtKBPlugin) cVar.mo121967a("at")) == null) {
                return false;
            }
            return aVar.mo147384a(str, str2, z, false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$createTitleBarComponent$listener$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$OnTitlebarListener;", "onLeftClick", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp$f */
    public static final class C33471f implements TitlebarComponent.OnTitlebarListener {

        /* renamed from: a */
        final /* synthetic */ ChatWindowApp f86289a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent.OnTitlebarListener
        /* renamed from: a */
        public void mo123157a() {
            this.f86289a.mo123138i();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33471f(ChatWindowApp chatWindowApp) {
            this.f86289a = chatWindowApp;
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp
    /* renamed from: i */
    public void mo123138i() {
        this.f86286w.mo123002c();
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowAppExtend
    /* renamed from: l */
    public void mo123141l() {
        SideMenuComponent sideMenuComponent = this.f86277l;
        if (sideMenuComponent != null) {
            sideMenuComponent.mo123536b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J$\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¨\u0006\u0012"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$initMessageSender$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender$IMessageSendListener;", "onAuditedFailed", "", "msg", "", "onMsgUpdate", "key", "Lcom/ss/android/lark/chatbase/BasePageStore$ItemTwoKey;", "updater", "Lcom/ss/android/lark/chatbase/model/PageStore$IItemPatch;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "onPendingSendMsg", "onSendMsgFailed", "preMsg", "Lcom/ss/android/lark/chat/entity/message/Message;", "onSendMsgSuccess", "messageId", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp$n */
    public static final class C33480n implements MessageSender.IMessageSendListener {

        /* renamed from: a */
        final /* synthetic */ ChatWindowApp f86298a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp$n$a */
        public static final class RunnableC33481a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33480n f86299a;

            /* renamed from: b */
            final /* synthetic */ String f86300b;

            /* renamed from: c */
            final /* synthetic */ Message f86301c;

            RunnableC33481a(C33480n nVar, String str, Message message) {
                this.f86299a = nVar;
                this.f86300b = str;
                this.f86301c = message;
            }

            public final void run() {
                ActionBlockManager.f141152c.mo194392a(new Function0<Unit>(this) {
                    /* class com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp.C33480n.RunnableC33481a.C334821 */
                    final /* synthetic */ RunnableC33481a this$0;

                    {
                        this.this$0 = r1;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final void invoke() {
                        MessageContentResolver messageContentResolver;
                        MessageListComponent messageListComponent = this.this$0.f86299a.f86298a.f86271d;
                        if (messageListComponent != null) {
                            AbstractC34006a t = messageListComponent.mo123331t(this.this$0.f86300b);
                            if (t == null) {
                                String str = this.this$0.f86301c.getcId();
                                Intrinsics.checkExpressionValueIsNotNull(str, "preMsg.getcId()");
                                t = messageListComponent.mo123331t(str);
                            }
                            if (t != null) {
                                ChatTipController bVar = ChatTipController.f91138a;
                                PointRecoderRecyclerView p = messageListComponent.mo123358p();
                                MessageInfo messageInfo = (MessageInfo) t;
                                if (this.this$0.f86299a.f86298a.mo123142m().f74037k) {
                                    messageContentResolver = SecretChatMessageContentResolver.f87377a;
                                } else {
                                    messageContentResolver = ChatMessageContentResolver.f85521a;
                                }
                                bVar.mo129832a(p, messageInfo, messageContentResolver);
                            }
                        }
                    }
                });
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.model.MessageSender.IMessageSendListener
        /* renamed from: a */
        public void mo123028a() {
            MessageListComponent messageListComponent = this.f86298a.f86271d;
            if (messageListComponent != null) {
                messageListComponent.mo123334B();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33480n(ChatWindowApp chatWindowApp) {
            this.f86298a = chatWindowApp;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.model.MessageSender.IMessageSendListener
        /* renamed from: a */
        public void mo123029a(Message message) {
            Intrinsics.checkParameterIsNotNull(message, "preMsg");
            MessageListComponent messageListComponent = this.f86298a.f86271d;
            if (messageListComponent != null) {
                messageListComponent.mo123314a(new AbstractC34417b.C34425g(message.getcId()), new C56035f(SendStatus.FAIL));
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.model.MessageSender.IMessageSendListener
        /* renamed from: a */
        public void mo123032a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "msg");
            MessageListComponent messageListComponent = this.f86298a.f86271d;
            if (messageListComponent != null) {
                messageListComponent.mo123368x(str);
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.model.MessageSender.IMessageSendListener
        /* renamed from: a */
        public void mo123031a(AbstractC34417b.AbstractC34421c<String> cVar, AbstractC34432b.AbstractC34434b<AbstractC34006a> bVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "key");
            Intrinsics.checkParameterIsNotNull(bVar, "updater");
            MessageListComponent messageListComponent = this.f86298a.f86271d;
            if (messageListComponent != null) {
                messageListComponent.mo123314a(cVar, bVar);
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.model.MessageSender.IMessageSendListener
        /* renamed from: a */
        public void mo123030a(Message message, String str) {
            Intrinsics.checkParameterIsNotNull(message, "preMsg");
            Intrinsics.checkParameterIsNotNull(str, "messageId");
            Log.m165389i("ChatWindowLog", "send msg success:" + str + ", " + message);
            MessageListComponent messageListComponent = this.f86298a.f86271d;
            if (messageListComponent != null) {
                messageListComponent.mo123314a(new AbstractC34417b.C34425g(message.getcId()), new C56035f(SendStatus.SUCCESS));
            }
            UICallbackExecutor.execute(new RunnableC33481a(this, str, message));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$createComponents$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$ITitleBarComponentDependency;", "getFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "onBannerHide", "", "onBannerShow", "bannerHeight", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp$c */
    public static final class C33468c implements TitlebarComponent.ITitleBarComponentDependency {

        /* renamed from: a */
        final /* synthetic */ ChatWindowApp f86287a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent.ITitleBarComponentDependency
        /* renamed from: a */
        public void mo123144a() {
            MessageListComponent messageListComponent = this.f86287a.f86271d;
            if (messageListComponent != null) {
                messageListComponent.mo123335C();
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent.ITitleBarComponentDependency
        /* renamed from: b */
        public BaseFragment mo123146b() {
            return this.f86287a.mo123143n().mo123001b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33468c(ChatWindowApp chatWindowApp) {
            this.f86287a = chatWindowApp;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent.ITitleBarComponentDependency
        /* renamed from: a */
        public void mo123145a(int i) {
            MessageListComponent messageListComponent = this.f86287a.f86271d;
            if (messageListComponent != null) {
                messageListComponent.mo123356e(i);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\f\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$keyboardComponentDependency$1", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardComponentDependency;", "getBaseFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "getFragmentManager", "Landroidx/fragment/app/FragmentManager;", "getListScroller", "Lcom/ss/android/lark/chat/chatwindow/chat/MessageListScroller;", "getMessageSender", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/IMessageSender;", "getRootView", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp$q */
    public static final class C33485q implements KeyboardComponentDependency {

        /* renamed from: a */
        final /* synthetic */ ChatWindowApp f86304a;

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardComponentDependency
        /* renamed from: a */
        public FragmentManager mo122090a() {
            return this.f86304a.mo123143n().mo122999a();
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardComponentDependency
        /* renamed from: b */
        public BaseFragment mo122092b() {
            return this.f86304a.mo123143n().mo123001b();
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardComponentDependency
        /* renamed from: c */
        public IMessageSender mo122093c() {
            return this.f86304a.mo123121a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33485q(ChatWindowApp chatWindowApp) {
            this.f86304a = chatWindowApp;
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardComponentDependency
        /* renamed from: a */
        public void mo122091a(NestScrollFrameLayout nestScrollFrameLayout) {
            Intrinsics.checkParameterIsNotNull(nestScrollFrameLayout, "nestScrollFrameLayout");
            KeyboardComponentDependency.C33038a.m127762a(this, nestScrollFrameLayout);
        }
    }

    /* renamed from: x */
    private final void m129692x() {
        this.f86273f = new MessageSender(new C33480n(this));
    }

    /* renamed from: a */
    public final MessageSender mo123121a() {
        MessageSender bVar = this.f86273f;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageSender");
        }
        return bVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp
    /* renamed from: g */
    public IMessageSender mo123136g() {
        MessageSender bVar = this.f86273f;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageSender");
        }
        return bVar;
    }

    /* renamed from: y */
    private final void m129693y() {
        SkeletonPlugin gVar;
        ChatPluginManager bVar = this.f86274g;
        if (bVar != null && (gVar = (SkeletonPlugin) bVar.mo122131a(SkeletonPlugin.class)) != null) {
            gVar.mo122201a(this, this.f86285v.f74037k);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp
    /* renamed from: f */
    public Context mo123135f() {
        View K = mo141184K();
        if (K == null) {
            Intrinsics.throwNpe();
        }
        Context context = K.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "contentView!!.context");
        return context;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp
    /* renamed from: k */
    public ILKUILayout mo123140k() {
        FrameLayout frameLayout = this.mRootView;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        if (frameLayout != null) {
            return (ILKUILayout) frameLayout;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.ui.layout.ILKUILayout");
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget, com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowAppExtend
    /* renamed from: r */
    public void mo122001r() {
        IKeyboardComponent cVar;
        super.mo122001r();
        IKeyboardComponent.OnKeyboardControlStatusChangeListener cVar2 = this.f86278m;
        if (!(cVar2 == null || (cVar = this.f86270c) == null)) {
            cVar.mo121983b(cVar2);
        }
        ChatPluginManager bVar = this.f86274g;
        if (bVar != null) {
            bVar.mo122132a();
        }
        ChatParamUtils.m133150c();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp$g */
    public static final class RunnableC33472g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Ref.ObjectRef f86290a;

        RunnableC33472g(Ref.ObjectRef objectRef) {
            this.f86290a = objectRef;
        }

        public final void run() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            ChatWindowApp.f86265j = b.mo134586n().mo134685a("lark.android.chat.do_frame_boost");
            if (ChatWindowApp.f86265j) {
                C20128c.m73465a(this.f86290a.element);
            }
        }
    }

    /* renamed from: p */
    private final void m129687p() {
        ChatWindowViewModelFactory cVar = new ChatWindowViewModelFactory(this.f86285v);
        Object o = mo141195o();
        if (o != null) {
            this.f86268a = (ChatWindowViewModel) new C1144ai((Fragment) o, cVar).mo6006a(WidgetViewModelKeyManager.f86344a.mo123198a(ChatWindowViewModel.class), ChatWindowViewModel.class);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
    }

    /* renamed from: v */
    private final void m129690v() {
        ChatWindowViewModel bVar = this.f86268a;
        if (bVar == null) {
            Intrinsics.throwNpe();
        }
        ChatWindowApp chatWindowApp = this;
        C33427a.m129533a(bVar.getPluginInitData(), chatWindowApp, new C33483o(this));
        ChatWindowViewModel bVar2 = this.f86268a;
        if (bVar2 == null) {
            Intrinsics.throwNpe();
        }
        bVar2.getInitErrorInfo().mo5923a(chatWindowApp, new C33484p(this));
    }

    /* renamed from: w */
    private final void m129691w() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        List<ChatWindowObserver> a = b.ap().mo134656a(new C33478m(this));
        this.f86284u = a;
        if (a != null) {
            Iterator<T> it = a.iterator();
            while (it.hasNext()) {
                getLifecycle().addObserver(it.next());
            }
        }
    }

    /* renamed from: h */
    public final boolean mo123137h() {
        MessageListComponent messageListComponent = this.f86271d;
        if (messageListComponent == null) {
            Intrinsics.throwNpe();
        }
        if (messageListComponent.mo123327k().size() > 15) {
            MessageListComponent messageListComponent2 = this.f86271d;
            if (messageListComponent2 == null) {
                Intrinsics.throwNpe();
            }
            if (!messageListComponent2.mo123323f()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp, com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowAppExtend
    /* renamed from: j */
    public boolean mo123139j() {
        Iterator<IChatWindowApp.IBackPressHandler> it = this.f86281p.iterator();
        while (it.hasNext()) {
            if (it.next().mo123195a()) {
                return true;
            }
        }
        IKeyboardComponent cVar = this.f86270c;
        if (cVar != null && cVar.mo121990h()) {
            return true;
        }
        Iterator<IChatWindowApp.ICloseChatHandler> it2 = this.f86282q.iterator();
        while (it2.hasNext()) {
            it2.next().mo123196a();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp$s */
    public static final class RunnableC33487s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C35219b f86306a;

        RunnableC33487s(C35219b bVar) {
            this.f86306a = bVar;
        }

        public final void run() {
            boolean z;
            Chat chat = this.f86306a.f90956f;
            ChatChatter chatChatter = this.f86306a.f90957g;
            ChatTypeStateKeeper.Companion aVar = ChatTypeStateKeeper.f135671f;
            ChatTypeStateKeeper.EnterChatParams.Builder b = new ChatTypeStateKeeper.EnterChatParams.Builder().mo187428a(chat.getId()).mo187431b(this.f86306a.f90952b);
            Intrinsics.checkExpressionValueIsNotNull(chat, "chat");
            ChatTypeStateKeeper.EnterChatParams.Builder a = b.mo187429a(chat.isRemind());
            boolean z2 = true;
            if (C34339g.m133171e(chat) == Chat.MessagePosition.RECENT_LEFT) {
                z = true;
            } else {
                z = false;
            }
            ChatTypeStateKeeper.EnterChatParams.Builder g = a.mo187441f(z).mo187437d(chat.isGroup()).mo187443g(chat.isSecret());
            if (chatChatter == null || !chatChatter.isBot()) {
                z2 = false;
            }
            aVar.mo187406a(g.mo187439e(z2).mo187432b(chat.isMeeting()).mo187451n());
            ChatTypeStateKeeper.f135671f.mo187412c("main");
        }
    }

    /* renamed from: c */
    public final void mo121985c() {
        ComponentCreator bVar = ComponentCreator.f85048a;
        ComponentCreator bVar2 = ComponentCreator.f85048a;
        ComponentCreator bVar3 = ComponentCreator.f85048a;
        Context f = mo123135f();
        if (f != null) {
            Activity activity = (Activity) f;
            ChatWindowViewModel bVar4 = this.f86268a;
            if (bVar4 == null) {
                Intrinsics.throwNpe();
            }
            IKeyboardComponent a = bVar.mo122060a(bVar2.mo122061a(bVar3.mo122062a(true, activity, bVar4, this.f86279n), this.f86280o), this.f86278m);
            WidgetManager a2 = WidgetManager.f99047e.mo141220a(this);
            IKeyboardComponent cVar = this.f86270c;
            if (cVar != null) {
                Widget widget = (Widget) cVar;
                if (a != null) {
                    a2.mo141215a(widget, (Widget) a);
                    this.f86270c = a;
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.framework.larkwidget.Widget");
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.framework.larkwidget.Widget");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        View K = mo141184K();
        if (K == null) {
            Intrinsics.throwNpe();
        }
        ButterKnife.bind(this, K);
        String str = this.f86285v.f74027a;
        if (str != null) {
            Intrinsics.checkExpressionValueIsNotNull(str, "it");
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36450aa N = b.mo134515N();
            Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
            String a = N.mo134394a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatModuleInstanceHolder…().loginDependency.userId");
            ChatParamUtils.m133144a(str, a, (Chat) null, 4, (Object) null);
        }
        m129687p();
        m129690v();
        m129691w();
        m129688s();
        m129689t();
        m129693y();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp$t */
    public static final class RunnableC33488t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ChatWindowApp f86307a;

        /* renamed from: b */
        final /* synthetic */ ErrorResult f86308b;

        RunnableC33488t(ChatWindowApp chatWindowApp, ErrorResult errorResult) {
            this.f86307a = chatWindowApp;
            this.f86308b = errorResult;
        }

        public final void run() {
            Chat chat;
            ChatChatter chatChatter;
            boolean z;
            C1177w<Chat> chat2;
            Chat b;
            C1177w<C35219b> initData;
            C35219b b2;
            C1177w<Chat> chat3;
            if (!ChatErrorInterceptor.m129809a(this.f86308b.getErrorCode())) {
                this.f86307a.mo123138i();
                return;
            }
            C35212a.m137528a(this.f86307a.mo123135f(), this.f86308b, new DialogInterface.OnClickListener(this) {
                /* class com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp.RunnableC33488t.DialogInterface$OnClickListenerC334891 */

                /* renamed from: a */
                final /* synthetic */ RunnableC33488t f86309a;

                {
                    this.f86309a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f86309a.f86307a.mo123138i();
                }
            });
            ChatWindowViewModel bVar = this.f86307a.f86268a;
            String str = null;
            if (bVar == null || (chat3 = bVar.getChat()) == null) {
                chat = null;
            } else {
                chat = chat3.mo5927b();
            }
            ChatWindowViewModel bVar2 = this.f86307a.f86268a;
            if (bVar2 == null || (initData = bVar2.getInitData()) == null || (b2 = initData.mo5927b()) == null) {
                chatChatter = null;
            } else {
                chatChatter = b2.f90957g;
            }
            ChatBundle.ChatType a = C34339g.m133165a(chat, chatChatter);
            ChatWindowViewModel bVar3 = this.f86307a.f86268a;
            if (bVar3 == null || (chat2 = bVar3.getChat()) == null || (b = chat2.mo5927b()) == null) {
                z = false;
            } else {
                z = b.isCrossTenant();
            }
            C35212a.m137538a(a, z, this.f86308b);
            if (ChatErrorInterceptor.m129810b(this.f86308b.getErrorCode())) {
                ChatWindowApp chatWindowApp = this.f86307a;
                ChatWindowViewModel bVar4 = chatWindowApp.f86268a;
                if (bVar4 != null) {
                    str = bVar4.getChatId();
                }
                chatWindowApp.mo123131a(str);
            }
        }
    }

    /* renamed from: t */
    private final void m129689t() {
        m129692x();
        if (!f86267x) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            T t = (T) Choreographer.getInstance();
            Intrinsics.checkExpressionValueIsNotNull(t, "Choreographer.getInstance()");
            objectRef.element = t;
            C20128c.m73466a(false);
            C20128c.m73464a(1);
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getFixedThreadPool().execute(new RunnableC33472g(objectRef));
            f86267x = true;
        }
        MessageListComponent messageListComponent = this.f86271d;
        if (messageListComponent != null) {
            messageListComponent.mo123345a(new C33473h(this));
        }
        MessageListComponent messageListComponent2 = this.f86271d;
        if (messageListComponent2 != null) {
            messageListComponent2.mo121971a((IComponentCallbacks) new C33474i(this));
        }
        MessageListComponent messageListComponent3 = this.f86271d;
        if (messageListComponent3 != null) {
            messageListComponent3.mo123347a(new C33475j(this));
        }
        KeyboardTopExtendComponent keyboardTopExtendComponent = this.f86272e;
        if (keyboardTopExtendComponent != null) {
            keyboardTopExtendComponent.mo123273a(new C33476k(this));
        }
        ChatWindowViewModel bVar = this.f86268a;
        if (bVar == null) {
            Intrinsics.throwNpe();
        }
        bVar.loadChatInitData(new C33477l(this));
    }

    /* renamed from: s */
    private final void m129688s() {
        this.f86269b = m129686a(new C33468c(this));
        ComponentCreator bVar = ComponentCreator.f85048a;
        ComponentCreator bVar2 = ComponentCreator.f85048a;
        ComponentCreator bVar3 = ComponentCreator.f85048a;
        Context f = mo123135f();
        if (f != null) {
            Activity activity = (Activity) f;
            ChatWindowViewModel bVar4 = this.f86268a;
            if (bVar4 == null) {
                Intrinsics.throwNpe();
            }
            this.f86270c = bVar.mo122060a(bVar2.mo122061a(bVar3.mo122062a(false, activity, bVar4, this.f86279n), this.f86280o), this.f86278m);
            Context f2 = mo123135f();
            if (f2 != null) {
                FragmentActivity fragmentActivity = (FragmentActivity) f2;
                ChatWindowViewModel bVar5 = this.f86268a;
                if (bVar5 == null) {
                    Intrinsics.throwNpe();
                }
                this.f86271d = new MessageListComponent(fragmentActivity, bVar5, new C33469d(this));
                Context f3 = mo123135f();
                if (f3 != null) {
                    FragmentActivity fragmentActivity2 = (FragmentActivity) f3;
                    ChatWindowViewModel bVar6 = this.f86268a;
                    if (bVar6 == null) {
                        Intrinsics.throwNpe();
                    }
                    this.f86272e = new KeyboardTopExtendComponent(fragmentActivity2, bVar6, new C33470e());
                    try {
                        PerfLog.start("chat_app_load_component", "");
                        WidgetManager a = WidgetManager.f99047e.mo141220a(this);
                        MessageListComponent messageListComponent = this.f86271d;
                        if (messageListComponent == null) {
                            Intrinsics.throwNpe();
                        }
                        WidgetManager a2 = a.mo141213a(R.id.chat_message_list_container, (Widget) messageListComponent, false);
                        TitlebarComponent titlebarComponent = this.f86269b;
                        if (titlebarComponent == null) {
                            Intrinsics.throwNpe();
                        }
                        WidgetManager a3 = a2.mo141213a(R.id.chat_titlebar_container, (Widget) titlebarComponent, false);
                        IKeyboardComponent cVar = this.f86270c;
                        if (cVar != null) {
                            WidgetManager a4 = a3.mo141213a(R.id.chat_keyboard_container, (Widget) cVar, false);
                            KeyboardTopExtendComponent keyboardTopExtendComponent = this.f86272e;
                            if (keyboardTopExtendComponent == null) {
                                Intrinsics.throwNpe();
                            }
                            a4.mo141213a(R.id.chat_keyboard_extend_container, (Widget) keyboardTopExtendComponent, false);
                            if (DesktopUtil.m144301a(mo123135f())) {
                                ChatWindowViewModel bVar7 = this.f86268a;
                                if (bVar7 == null) {
                                    Intrinsics.throwNpe();
                                }
                                this.f86277l = new SideMenuComponent(bVar7);
                                WidgetManager a5 = WidgetManager.f99047e.mo141220a(this);
                                SideMenuComponent sideMenuComponent = this.f86277l;
                                if (sideMenuComponent == null) {
                                    Intrinsics.throwNpe();
                                }
                                a5.mo141214a(sideMenuComponent);
                            }
                            PerfLog.end("chat_app_load_component", "");
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.framework.larkwidget.Widget");
                    } catch (IllegalArgumentException e) {
                        Log.m165387e("current fragment:" + this.f86286w.mo123001b() + ", current fragment active:" + this.f86286w.mo123001b().isActive() + ", widget is destroy:" + C26254af.m95008b(this, "isDestroyed"), (Throwable) e, true);
                        mo123138i();
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$initApp$2", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp$h */
    public static final class C33473h extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ ChatWindowApp f86291a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33473h(ChatWindowApp chatWindowApp) {
            this.f86291a = chatWindowApp;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IKeyboardComponent cVar;
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            if (i == 1 && (cVar = this.f86291a.f86270c) != null) {
                cVar.mo121999p();
            }
            if (DesktopUtil.m144301a(this.f86291a.mo123135f())) {
                return;
            }
            if (i != 0) {
                if (this.f86291a.mo123137h()) {
                    TitlebarComponent titlebarComponent = this.f86291a.f86269b;
                    if (titlebarComponent != null) {
                        titlebarComponent.mo123647g();
                    }
                    Iterator<T> it = this.f86291a.f86276i.iterator();
                    while (it.hasNext()) {
                        it.next().mo123179a(true);
                    }
                }
                if (ChatWindowApp.f86265j) {
                    C20128c.m73466a(true);
                    return;
                }
                return;
            }
            TitlebarComponent titlebarComponent2 = this.f86291a.f86269b;
            if (titlebarComponent2 != null) {
                titlebarComponent2.mo123646f();
            }
            Iterator<T> it2 = this.f86291a.f86276i.iterator();
            while (it2.hasNext()) {
                it2.next().mo123179a(false);
            }
            C20128c.m73466a(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$initApp$4", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$OnAudioPlayerModeListener;", "onAudioPlayerModeChanged", "", "isSpeakerMode", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp$j */
    public static final class C33475j implements IMessageListComponent.OnAudioPlayerModeListener {

        /* renamed from: a */
        final /* synthetic */ ChatWindowApp f86293a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33475j(ChatWindowApp chatWindowApp) {
            this.f86293a = chatWindowApp;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.OnAudioPlayerModeListener
        /* renamed from: a */
        public void mo123159a(boolean z) {
            if (z) {
                LarkPlayModeTip a = LarkPlayModeTip.f88953b.mo127188a();
                TitlebarComponent titlebarComponent = this.f86293a.f86269b;
                if (titlebarComponent == null) {
                    Intrinsics.throwNpe();
                }
                a.mo127186a(titlebarComponent.mo123681i());
                return;
            }
            LarkPlayModeTip a2 = LarkPlayModeTip.f88953b.mo127188a();
            TitlebarComponent titlebarComponent2 = this.f86293a.f86269b;
            if (titlebarComponent2 == null) {
                Intrinsics.throwNpe();
            }
            a2.mo127187b(titlebarComponent2.mo123681i());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$initApp$5", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/KeyboardExtendsManager$OnExtendStatusChangeListener;", "onExtendHide", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/ExtendType;", "onExtendShow", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp$k */
    public static final class C33476k implements KeyboardExtendsManager.OnExtendStatusChangeListener {

        /* renamed from: a */
        final /* synthetic */ ChatWindowApp f86294a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33476k(ChatWindowApp chatWindowApp) {
            this.f86294a = chatWindowApp;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.KeyboardExtendsManager.OnExtendStatusChangeListener
        /* renamed from: a */
        public void mo123160a(ExtendType extendType) {
            Intrinsics.checkParameterIsNotNull(extendType, ShareHitPoint.f121869d);
            MessageListComponent messageListComponent = this.f86294a.f86271d;
            if (messageListComponent != null) {
                messageListComponent.mo123365w();
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.KeyboardExtendsManager.OnExtendStatusChangeListener
        /* renamed from: b */
        public void mo123161b(ExtendType extendType) {
            Intrinsics.checkParameterIsNotNull(extendType, ShareHitPoint.f121869d);
            MessageListComponent messageListComponent = this.f86294a.f86271d;
            if (messageListComponent != null) {
                messageListComponent.mo123365w();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$initApp$6", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowViewModel$ISecretComponentReplaceCallback;", "onComponentReplace", "", "needReplace", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp$l */
    public static final class C33477l implements ChatWindowViewModel.ISecretComponentReplaceCallback {

        /* renamed from: a */
        final /* synthetic */ ChatWindowApp f86295a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33477l(ChatWindowApp chatWindowApp) {
            this.f86295a = chatWindowApp;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowViewModel.ISecretComponentReplaceCallback
        /* renamed from: a */
        public void mo123162a(boolean z) {
            if (z) {
                this.f86295a.mo121985c();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$keyboardStatusListener$1", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$OnKeyboardControlStatusChangeListener;", "onKeyboardControlStatusChange", "", "show", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp$r */
    public static final class C33486r implements IKeyboardComponent.OnKeyboardControlStatusChangeListener {

        /* renamed from: a */
        final /* synthetic */ ChatWindowApp f86305a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33486r(ChatWindowApp chatWindowApp) {
            this.f86305a = chatWindowApp;
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.OnKeyboardControlStatusChangeListener
        /* renamed from: a */
        public void mo122068a(boolean z) {
            if (z) {
                KeyboardTopExtendComponent keyboardTopExtendComponent = this.f86305a.f86272e;
                if (keyboardTopExtendComponent != null) {
                    keyboardTopExtendComponent.mo123275f();
                    return;
                }
                return;
            }
            KeyboardTopExtendComponent keyboardTopExtendComponent2 = this.f86305a.f86272e;
            if (keyboardTopExtendComponent2 != null) {
                keyboardTopExtendComponent2.mo123276g();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\"\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$statusListener$1", "Lcom/ss/android/lark/keyboard/IKeyBoardStatusListener;", "onHeightChanged", "", "toolBoxHeight", "", "onStateChanged", "isShow", "", "replyMsgId", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp$u */
    public static final class C33490u implements IKeyBoardStatusListener {

        /* renamed from: a */
        final /* synthetic */ ChatWindowApp f86310a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33490u(ChatWindowApp chatWindowApp) {
            this.f86310a = chatWindowApp;
        }

        @Override // com.ss.android.lark.keyboard.IKeyBoardStatusListener
        /* renamed from: a */
        public void mo122008a(int i) {
            KeyboardTopExtendComponent keyboardTopExtendComponent = this.f86310a.f86272e;
            if (keyboardTopExtendComponent != null) {
                keyboardTopExtendComponent.mo123268a(i);
            }
            MessageListComponent messageListComponent = this.f86310a.f86271d;
            if (messageListComponent != null) {
                messageListComponent.mo123365w();
            }
            MessageListComponent messageListComponent2 = this.f86310a.f86271d;
            if (messageListComponent2 != null) {
                messageListComponent2.mo123340H();
            }
        }

        @Override // com.ss.android.lark.keyboard.IKeyBoardStatusListener
        /* renamed from: a */
        public void mo122009a(boolean z, int i, String str) {
            MessageListComponent messageListComponent;
            C33247j<?> i2;
            KeyboardTopExtendComponent keyboardTopExtendComponent = this.f86310a.f86272e;
            if (keyboardTopExtendComponent != null) {
                keyboardTopExtendComponent.mo123268a(i);
            }
            MessageListComponent messageListComponent2 = this.f86310a.f86271d;
            if (messageListComponent2 != null) {
                messageListComponent2.mo123340H();
            }
            if (z && (messageListComponent = this.f86310a.f86271d) != null && (i2 = messageListComponent.mo123325i()) != null) {
                if (TextUtils.isEmpty(str)) {
                    i2.mo122593a(100, false);
                } else {
                    i2.mo122596a(new C33247j.C33250b().mo122605a(new C33255l(str)).mo122604a(80).mo122607a(true).mo122609b(LocationRequest.PRIORITY_INDOOR).mo122608a());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp$p */
    public static final class C33484p<T> implements AbstractC1178x<ErrorResult> {

        /* renamed from: a */
        final /* synthetic */ ChatWindowApp f86303a;

        C33484p(ChatWindowApp chatWindowApp) {
            this.f86303a = chatWindowApp;
        }

        /* renamed from: a */
        public final void onChanged(ErrorResult errorResult) {
            Log.m165386e("ChatWindowLog", errorResult);
            ChatWindowApp chatWindowApp = this.f86303a;
            Intrinsics.checkExpressionValueIsNotNull(errorResult, "it");
            chatWindowApp.mo123123a(errorResult);
        }
    }

    /* renamed from: a */
    public final void mo123123a(ErrorResult errorResult) {
        UICallbackExecutor.execute(new RunnableC33488t(this, errorResult));
    }

    /* renamed from: a */
    private final TitlebarComponent m129686a(TitlebarComponent.ITitleBarComponentDependency cVar) {
        C33471f fVar = new C33471f(this);
        if (DesktopUtil.m144301a(mo123135f())) {
            C33471f fVar2 = fVar;
            ChatWindowViewModel bVar = this.f86268a;
            if (bVar == null) {
                Intrinsics.throwNpe();
            }
            return new DesktopTitlebarComponent(fVar2, bVar, cVar);
        }
        C33471f fVar3 = fVar;
        ChatWindowViewModel bVar2 = this.f86268a;
        if (bVar2 == null) {
            Intrinsics.throwNpe();
        }
        return new TitlebarComponent(fVar3, bVar2, cVar);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp$o */
    public static final class C33483o<T> implements AbstractC1178x<C35219b> {

        /* renamed from: a */
        final /* synthetic */ ChatWindowApp f86302a;

        C33483o(ChatWindowApp chatWindowApp) {
            this.f86302a = chatWindowApp;
        }

        /* renamed from: a */
        public final void onChanged(C35219b bVar) {
            Intrinsics.checkExpressionValueIsNotNull(bVar, "it");
            if (bVar.mo129685a()) {
                ChatWindowApp chatWindowApp = this.f86302a;
                ChatPluginManager bVar2 = new ChatPluginManager();
                ChatWindowApp chatWindowApp2 = this.f86302a;
                ChatWindowApp chatWindowApp3 = chatWindowApp2;
                Object o = chatWindowApp2.mo141195o();
                if (o != null) {
                    FragmentActivity requireActivity = ((Fragment) o).requireActivity();
                    Intrinsics.checkExpressionValueIsNotNull(requireActivity, "(getHost() as Fragment).requireActivity()");
                    bVar2.mo122134a(chatWindowApp3, bVar, requireActivity);
                    chatWindowApp.f86274g = bVar2;
                    ChatParamUtils.m133139a(bVar.f90956f, bVar.f90957g);
                    this.f86302a.mo123130a(bVar);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
            }
            Log.m165383e("ChatWindowLog", "ChatWindowInitData is invalid");
            this.f86302a.mo123123a(new ErrorResult(1, "ChatWindowInitData is invalid"));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp
    /* renamed from: a */
    public void mo123125a(IChatWindowApp.IActivityResultHandler aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "handle");
        this.f86283t.add(aVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp
    /* renamed from: a */
    public <T extends IComponent<? extends IComponentCallbacks>> T mo123122a(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        if (Intrinsics.areEqual(cls, ITitlebarComponent.class)) {
            TitlebarComponent titlebarComponent = this.f86269b;
            if (titlebarComponent != null) {
                return titlebarComponent;
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        } else if (Intrinsics.areEqual(cls, IMessageListComponent.class)) {
            MessageListComponent messageListComponent = this.f86271d;
            if (messageListComponent != null) {
                return messageListComponent;
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        } else if (Intrinsics.areEqual(cls, IKeyboardComponent.class)) {
            IKeyboardComponent cVar = this.f86270c;
            if (cVar != null) {
                return cVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        } else if (Intrinsics.areEqual(cls, IKeyboardTopExtendComponent.class)) {
            KeyboardTopExtendComponent keyboardTopExtendComponent = this.f86272e;
            if (keyboardTopExtendComponent != null) {
                return keyboardTopExtendComponent;
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        } else if (Intrinsics.areEqual(cls, ISideMenuComponent.class)) {
            SideMenuComponent sideMenuComponent = this.f86277l;
            if (sideMenuComponent != null) {
                return sideMenuComponent;
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        } else if (Intrinsics.areEqual(cls, ITabComponent.class)) {
            return new MockTabComponent();
        } else {
            throw new IllegalAccessException("component not found");
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp
    /* renamed from: a */
    public void mo123126a(IChatWindowApp.IBackPressHandler bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "handle");
        this.f86281p.add(bVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp
    /* renamed from: a */
    public void mo123127a(IChatWindowApp.ICloseChatHandler cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "handle");
        this.f86282q.add(cVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp
    /* renamed from: a */
    public void mo123128a(IChatWindowApp.IShowSmartReplyHandler dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "handle");
        this.f86275h.add(dVar);
    }

    public ChatWindowApp(ChatBundle chatBundle, IViewDependence bVar) {
        Intrinsics.checkParameterIsNotNull(chatBundle, "chatBundle");
        Intrinsics.checkParameterIsNotNull(bVar, "viewDependency");
        this.f86285v = chatBundle;
        this.f86286w = bVar;
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget, com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowAppExtend
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator<IChatWindowApp.IActivityResultHandler> it = this.f86283t.iterator();
        while (it.hasNext()) {
            if (it.next().mo123194a(i, i2, intent)) {
                return;
            }
        }
        List<? extends ChatWindowObserver> list = this.f86284u;
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().mo106795a(i, i2, intent)) {
                    return;
                }
            }
        }
        IKeyboardComponent cVar = this.f86270c;
        if (cVar != null) {
            ((Widget) cVar).onActivityResult(i, i2, intent);
            MessageListComponent messageListComponent = this.f86271d;
            if (messageListComponent != null) {
                messageListComponent.onActivityResult(i, i2, intent);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.framework.larkwidget.Widget");
    }
}
