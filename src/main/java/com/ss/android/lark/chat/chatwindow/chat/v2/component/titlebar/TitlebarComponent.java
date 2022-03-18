package com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.C1177w;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.framework.callback.C25969c;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.chatwindow.chat.SecretTagProvider;
import com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33155c;
import com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33187f;
import com.ss.android.lark.chat.chatwindow.chat.banner.BannerController;
import com.ss.android.lark.chat.chatwindow.chat.banner.C33154b;
import com.ss.android.lark.chat.chatwindow.chat.banner.component.C33182a;
import com.ss.android.lark.chat.chatwindow.chat.banner.component.ChatterApplyBanner;
import com.ss.android.lark.chat.chatwindow.chat.banner.component.EduInviteParentBanner;
import com.ss.android.lark.chat.chatwindow.chat.p1612a.C33085b;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponentCallbacks;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.WidgetViewModelKeyManager;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.util.ChatTabFgUtil;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitleTabHolder;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1638a.C33427a;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterCustomStatus;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.entity.chatter.TagInfo;
import com.ss.android.lark.chat.entity.openapp.C34019a;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chat.utils.C34340h;
import com.ss.android.lark.chatwindow.C35247g;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.chatwindow.view.C35266c;
import com.ss.android.lark.chatwindow.view.sidemenu.item.ChatSettingItem;
import com.ss.android.lark.chatwindow.view.widget.TitleBarRedDotView;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.IChatSettingDependency;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.lark.statistics.chat.ChatHitPoint;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor;
import com.ss.android.lark.tab.manager.ChatTabManagerLauncher;
import com.ss.android.lark.tab.space.tab.add.common.AddSpacePageLauncher;
import com.ss.android.lark.tab.statistics.ChatTabHitPoint;
import com.ss.android.lark.ui.C57580a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.statistics.PerfLog;
import com.ss.android.lark.widget.chat_function_view.ChatFunctionBadge;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionController;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionItem;
import com.ss.android.lark.widget.chat_function_view.OnItemUpdateListener;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.status.UserStatusLinearLayout;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 µ\u00012\u00020\u00012\u00020\u0002:\n´\u0001µ\u0001¶\u0001·\u0001¸\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0018\u0010]\u001a\u00020*2\u0006\u0010^\u001a\u00020\u00162\u0006\u0010_\u001a\u00020`H\u0016J\u0010\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020:H\u0016J\u0018\u0010d\u001a\u00020b2\u0006\u0010e\u001a\u00020\u00162\u0006\u0010f\u001a\u00020*H\u0016J\u0010\u0010g\u001a\u00020b2\u0006\u0010c\u001a\u00020\"H\u0016J\u001a\u0010h\u001a\u00020b2\u0006\u0010i\u001a\u00020j2\b\u0010k\u001a\u0004\u0018\u00010lH\u0016J\b\u0010m\u001a\u00020bH\u0016J\u0010\u0010n\u001a\u00020*2\u0006\u0010o\u001a\u00020pH\u0002J(\u0010q\u001a\b\u0012\u0004\u0012\u00020s0r2\u0006\u0010i\u001a\u00020j2\b\u0010k\u001a\u0004\u0018\u00010l2\u0006\u0010t\u001a\u00020lH\u0002J\u0006\u0010u\u001a\u00020pJ\b\u0010v\u001a\u00020\u0016H\u0002J\n\u0010w\u001a\u0004\u0018\u00010*H\u0016J\n\u0010x\u001a\u0004\u0018\u00010*H\u0016J&\u0010y\u001a\u00020b2\u0006\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020\u00162\u0006\u0010}\u001a\u0002082\u0006\u0010~\u001a\u00020\u0016J\b\u0010\u001a\u00020bH\u0016J\t\u0010\u0001\u001a\u00020bH\u0016J\t\u0010\u0001\u001a\u00020bH\u0002J\t\u0010\u0001\u001a\u00020bH\u0016J\t\u0010\u0001\u001a\u00020bH\u0004J\u001a\u0010\u0001\u001a\u00020b2\u0006\u0010i\u001a\u00020j2\u0007\u0010\u0001\u001a\u000208H\u0016J\t\u0010\u0001\u001a\u00020bH\u0016J\t\u0010\u0001\u001a\u00020bH\u0016J\t\u0010\u0001\u001a\u00020bH\u0016J\u0017\u0010\u0001\u001a\u00020b2\f\u0010\u0001\u001a\u0007\u0012\u0002\b\u00030\u0001H\u0016J\t\u0010\u0001\u001a\u00020bH\u0016J\u0011\u0010\u0001\u001a\u00020b2\u0006\u0010c\u001a\u00020:H\u0016J\u0011\u0010\u0001\u001a\u00020b2\u0006\u0010c\u001a\u00020\"H\u0016J\t\u0010\u0001\u001a\u00020bH\u0016J\t\u0010\u0001\u001a\u00020bH\u0016J\u0013\u0010\u0001\u001a\u00020b2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0012\u0010\u0001\u001a\u00020b2\u0007\u0010\u0001\u001a\u000206H\u0016J\u0011\u0010\u0001\u001a\u00020b2\u0006\u0010c\u001a\u00020\u0004H\u0016J#\u0010\u0001\u001a\u00020b2\u0006\u0010i\u001a\u00020j2\b\u0010k\u001a\u0004\u0018\u00010l2\u0006\u0010t\u001a\u00020lH\u0002J(\u0010\u0001\u001a\u00020b2\u0006\u0010i\u001a\u00020j2\u0015\u0010\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0001\u0012\u0004\u0012\u00020b0\u0001H\u0016J\t\u0010\u0001\u001a\u00020bH\u0016J\t\u0010\u0001\u001a\u00020bH\u0016J*\u0010\u0001\u001a\u00020b2\b\u0010\u0001\u001a\u00030 \u00012\u0006\u0010i\u001a\u00020j2\u0007\u0010¡\u0001\u001a\u00020\u00162\u0006\u0010~\u001a\u00020\u0016J!\u0010¢\u0001\u001a\u00020b2\u0006\u0010i\u001a\u00020j2\b\u0010k\u001a\u0004\u0018\u00010l2\u0006\u0010~\u001a\u00020{J)\u0010£\u0001\u001a\u00020b2\t\b\u0001\u0010¤\u0001\u001a\u00020\u00162\u0007\u0010¥\u0001\u001a\u0002082\n\u0010¦\u0001\u001a\u0005\u0018\u00010§\u0001H\u0016J\t\u0010¨\u0001\u001a\u00020bH\u0002J\u0012\u0010©\u0001\u001a\u00020b2\u0007\u0010ª\u0001\u001a\u00020\u0016H\u0016J\u001a\u0010«\u0001\u001a\u00020b2\u0007\u0010¬\u0001\u001a\u00020\u00162\u0006\u0010i\u001a\u00020jH\u0002J\u0012\u0010­\u0001\u001a\u00020b2\u0007\u0010®\u0001\u001a\u00020AH\u0002J)\u0010¯\u0001\u001a\u00020b2\u0007\u0010°\u0001\u001a\u0002082\t\u0010±\u0001\u001a\u0004\u0018\u00010{2\n\u0010²\u0001\u001a\u0005\u0018\u00010³\u0001H\u0016R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8VX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0004@\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X.¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010)\u001a\u00020*8\u0004@\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0010\u0010/\u001a\u0004\u0018\u000100X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0010\u00105\u001a\u0004\u0018\u000106X\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u000e¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010B\u001a\u00020C8BX\u0002¢\u0006\f\n\u0004\bF\u0010\u0010\u001a\u0004\bD\u0010ER\u001e\u0010G\u001a\u00020H8\u0004@\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001e\u0010M\u001a\u00020*8\u0004@\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010,\"\u0004\bO\u0010.R\u001e\u0010P\u001a\u00020Q8\u0004@\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001e\u0010V\u001a\u00020*8\u0004@\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010,\"\u0004\bX\u0010.R\u0010\u0010Y\u001a\u0004\u0018\u00010ZX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000¨\u0006¹\u0001"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent;", "mListener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$OnTitlebarListener;", "dependenceViewModel", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitleDependenceViewModel;", "titleBarComponentDependency", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$ITitleBarComponentDependency;", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$OnTitlebarListener;Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitleDependenceViewModel;Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$ITitleBarComponentDependency;)V", "callbacks", "", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "getCallbacks", "()Ljava/util/List;", "callbacks$delegate", "Lkotlin/Lazy;", "hideAnimator", "Landroid/animation/ValueAnimator;", "hideTitleRunnable", "Ljava/lang/Runnable;", "layoutId", "", "getLayoutId", "()I", "mBannerContainer", "Landroid/widget/LinearLayout;", "getMBannerContainer", "()Landroid/widget/LinearLayout;", "setMBannerContainer", "(Landroid/widget/LinearLayout;)V", "mBannerController", "Lcom/ss/android/lark/chat/chatwindow/chat/banner/BannerController;", "mBannerVisibilityListeners", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent$IBannerVisibilityListener;", "mCancelableUIExecutor", "Lcom/larksuite/framework/callback/CancelableCallbackExecutor;", "mCenterBinder", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$CenterBinder;", "mChatFunctionController", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionController;", "mFloatCancel", "Landroid/view/View;", "getMFloatCancel", "()Landroid/view/View;", "setMFloatCancel", "(Landroid/view/View;)V", "mLeftBinder", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$LeftBinder;", "getMListener", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$OnTitlebarListener;", "setMListener", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$OnTitlebarListener;)V", "mMeetingRoleProvider", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent$MeetingRoleProvider;", "mNeedShowBadge", "", "mOnBannerControllerInitListeners", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent$OnBannerControllerInitListener;", "mOpenAppFeed", "Lcom/ss/android/lark/chat/entity/openapp/OpenAppFeed;", "mSavedActionList", "Lcom/ss/android/lark/ui/IActionTitlebar$Action;", "mSavedTitleBarListener", "mSideMenuActionView", "Lcom/ss/android/lark/chatwindow/view/widget/TitleBarRedDotView;", "mTabHolder", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitleTabHolder;", "getMTabHolder", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitleTabHolder;", "mTabHolder$delegate", "mTitleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "getMTitleBar", "()Lcom/ss/android/lark/ui/CommonTitleBar;", "setMTitleBar", "(Lcom/ss/android/lark/ui/CommonTitleBar;)V", "mTitleBarTabContent", "getMTitleBarTabContent", "setMTitleBarTabContent", "mTitleRoot", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getMTitleRoot", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setMTitleRoot", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "mTitlebarDivider", "getMTitlebarDivider", "setMTitlebarDivider", "mViewModel", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarViewModel;", "showAnimator", "showTitleRunnable", "addAction", "index", "titleBarViewAction", "Lcom/ss/android/lark/ui/IActionTitlebar$BaseAction;", "addBannerControllerListener", "", "listener", "addBannerView", ShareHitPoint.f121869d, "view", "addBannerVisibilityListener", "bindTitlebar", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "p2pChatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "changeToDarkMode", "createTitleRightView", "context", "Landroid/content/Context;", "getChatFunctionItems", "", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionItem;", "selfChatter", "getContext", "getHideSettingItemMask", "getRootView", "getTitleMenuView", "gotoGroupSettingActivity", "chatId", "", "meetingRole", "isOnCall", ShareHitPoint.f121868c, "hideAllTitleBar", "hideTitle", "initBannerViews", "initTitlebar", "initTitlebarAnim", "locateTabIcon", "showManagerTab", "onCreate", "onDestroy", "onStart", "registerBanner", "bannerView", "Lcom/ss/android/lark/chat/chatwindow/chat/banner/IBannerView;", "removeAllActions", "removeBannerControllerListener", "removeBannerVisibilityListener", "restore", "save", "selectTab", "tabId", "", "setMeetingRoleProvider", "provider", "setTitleBarListener", "setupTitleBarRightAction", "setupTitleTabs", "binder", "Lkotlin/Function1;", "Lcom/larksuite/component/universe_design/tab/UDTabLayout;", "showAllTitleBar", "showTitle", "startP2PSetting", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "hideSettingItemMask", "startSettingActivity", "toggleBanner", "bannerType", "visible", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/chat/chatwindow/chat/banner/IBannerData;", "unInitBanners", "unregisterBanner", "key", "updateBadge", "badgeCount", "updateSideMenuTriggerBadge", "titleBarRedDotView", "updateUserStatus", "show", "description", "iconDrawable", "Landroid/graphics/drawable/Drawable;", "CenterBinder", "Companion", "ITitleBarComponentDependency", "LeftBinder", "OnTitlebarListener", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public class TitlebarComponent extends Widget implements ITitlebarComponent {

    /* renamed from: l */
    public static final Companion f86836l = new Companion(null);

    /* renamed from: A */
    private final int f86837A = R.layout.chat_window_component_titlebar;

    /* renamed from: B */
    private OnTitlebarListener f86838B;

    /* renamed from: a */
    public final ValueAnimator f86839a = new ValueAnimator();

    /* renamed from: b */
    public final ValueAnimator f86840b = new ValueAnimator();

    /* renamed from: c */
    public CenterBinder f86841c;

    /* renamed from: d */
    public TitleBarRedDotView f86842d;

    /* renamed from: e */
    public TitlebarViewModel f86843e;

    /* renamed from: g */
    public BannerController f86844g;

    /* renamed from: h */
    public boolean f86845h = true;

    /* renamed from: i */
    public List<ITitlebarComponent.IBannerVisibilityListener> f86846i = new ArrayList();

    /* renamed from: j */
    public final ITitleDependenceViewModel f86847j;

    /* renamed from: k */
    public final ITitleBarComponentDependency f86848k;

    /* renamed from: m */
    private final Lazy f86849m = LazyKt.lazy(new C33721r(this));
    @BindView(7371)
    protected LinearLayout mBannerContainer;
    @BindView(7812)
    protected View mFloatCancel;
    @BindView(9025)
    protected CommonTitleBar mTitleBar;
    @BindView(8896)
    protected View mTitleBarTabContent;
    @BindView(9019)
    protected ConstraintLayout mTitleRoot;
    @BindView(9027)
    protected View mTitlebarDivider;

    /* renamed from: n */
    private final Lazy f86850n = LazyKt.lazy(C33709g.INSTANCE);

    /* renamed from: o */
    private LeftBinder f86851o;

    /* renamed from: p */
    private C25969c f86852p;

    /* renamed from: q */
    private List<IActionTitlebar.Action> f86853q = new ArrayList();

    /* renamed from: t */
    private OnTitlebarListener f86854t;

    /* renamed from: u */
    private IChatFunctionController f86855u;

    /* renamed from: v */
    private C34019a f86856v;

    /* renamed from: w */
    private ITitlebarComponent.MeetingRoleProvider f86857w;

    /* renamed from: x */
    private final List<ITitlebarComponent.OnBannerControllerInitListener> f86858x = new ArrayList();

    /* renamed from: y */
    private final Runnable f86859y = new RunnableC33711i(this);

    /* renamed from: z */
    private final Runnable f86860z = new RunnableC33729w(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0002J\"\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J.\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0015J\u000e\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u001aJ*\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$CenterBinder;", "", "()V", "tagId", "", "titleNameTV", "Landroid/widget/TextView;", "titleSecond", "Landroid/view/View;", "bindGroup", "", "itemView", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "bindP2p", "p2pChatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "isSecret", "", "bindView", "onCenterClick", "Lkotlin/Function0;", "createView", "parent", "Landroid/view/ViewGroup;", "updateP2pTitle", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "updateUserStatus", "show", "description", "", "iconDrawable", "Landroid/graphics/drawable/Drawable;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$a */
    public static final class CenterBinder {

        /* renamed from: a */
        private TextView f86861a;

        /* renamed from: b */
        private View f86862b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$CenterBinder$bindP2p$2", "Lcom/ss/android/lark/widget/linked_emojicon/widget/LinkEmojiTextView$IURLStringClickListener;", "onURLClick", "", "view", "Landroid/view/View;", "text", "", "onURLLongClick", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$a$a */
        public static final class C33704a implements LinkEmojiTextView.AbstractC58525j {
            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
            /* renamed from: b */
            public boolean mo122807b(View view, String str) {
                Intrinsics.checkParameterIsNotNull(view, "view");
                return false;
            }

            C33704a() {
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
            /* renamed from: a */
            public void mo122806a(View view, String str) {
                Intrinsics.checkParameterIsNotNull(view, "view");
                C29990c.m110930b().mo134593u().mo134332b(view.getContext(), str);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$CenterBinder$bindP2p$3", "Lcom/ss/android/lark/widget/linked_emojicon/widget/LinkEmojiTextView$IPhoneStringClickListener;", "onPhoneClick", "", "view", "Landroid/view/View;", "phoneNumber", "", "onPhoneLongClick", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$a$b */
        public static final class C33705b implements LinkEmojiTextView.AbstractC58524i {
            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
            /* renamed from: b */
            public void mo122809b(View view, String str) {
            }

            C33705b() {
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
            /* renamed from: a */
            public void mo122808a(View view, String str) {
                Intrinsics.checkParameterIsNotNull(view, "view");
                C29990c.m110930b().mo134525X().mo134641a(view.getContext(), str);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$a$c */
        public static final class View$OnClickListenerC33706c implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ Function0 f86863a;

            View$OnClickListenerC33706c(Function0 function0) {
                this.f86863a = function0;
            }

            public final void onClick(View view) {
                this.f86863a.invoke();
            }
        }

        /* renamed from: a */
        public final void mo123697a(Chatter chatter) {
            Intrinsics.checkParameterIsNotNull(chatter, "p2pChatter");
            TextView textView = this.f86861a;
            if (textView != null) {
                textView.setText(C34340h.m133174a(chatter, ChatterNameDisplayRule.NICKNAME_WITH_ALIAS));
            }
        }

        /* renamed from: a */
        public final View mo123695a(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View a = C35266c.m137763a(viewGroup.getContext(), false);
            ImageView imageView = (ImageView) a.findViewById(R.id.setting_iv);
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            Intrinsics.checkExpressionValueIsNotNull(a, "view");
            return a;
        }

        /* renamed from: a */
        private final void m130764a(View view, Chat chat) {
            TextView textView = (TextView) view.findViewById(R.id.group_name);
            this.f86861a = textView;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.f86861a;
            if (textView2 != null) {
                textView2.setText(chat.getName());
            }
            View view2 = this.f86862b;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View findViewById = view.findViewById(R.id.group_num);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.group_num)");
            ((TextView) findViewById).setText(UIHelper.getQuantityString(R.plurals.Lark_Group_TitleNumberMembers, chat.getUserCount()));
        }

        /* renamed from: a */
        private final void m130765a(View view, ChatChatter chatChatter, boolean z) {
            ChatterDescription chatterDescription;
            String str;
            String str2;
            TextView textView = (TextView) view.findViewById(R.id.group_name);
            this.f86861a = textView;
            if (textView != null) {
                textView.setText(C34340h.m133174a(chatChatter, ChatterNameDisplayRule.NICKNAME_WITH_ALIAS));
            }
            View findViewById = view.findViewById(R.id.custom_status_iv);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.custom_status_iv)");
            AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById;
            if (chatChatter != null) {
                AbstractC36474h b = C29990c.m110930b();
                ChatterCustomStatus.Companion aVar = ChatterCustomStatus.Companion;
                Chatter chatter = chatChatter.getChatter();
                Intrinsics.checkExpressionValueIsNotNull(chatter, "chatter");
                Chatter.ChatterCustomStatus a = b.mo134529a(aVar.mo124851b(chatter.getCustomStatus()));
                if (a != null) {
                    appCompatImageView.setVisibility(0);
                    C52977a.m205190a().mo180995a(appCompatImageView, a.icon_key);
                } else {
                    appCompatImageView.setVisibility(8);
                }
            }
            View findViewById2 = view.findViewById(R.id.user_status_layout);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(\n … R.id.user_status_layout)");
            UserStatusLinearLayout userStatusLinearLayout = (UserStatusLinearLayout) findViewById2;
            View view2 = this.f86862b;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            if (z) {
                userStatusLinearLayout.setTextColor(UIHelper.getColor(R.color.lkui_N300));
            }
            if (chatChatter != null) {
                chatterDescription = chatChatter.getDescription();
            } else {
                chatterDescription = null;
            }
            if (C35247g.m137630a(chatterDescription)) {
                userStatusLinearLayout.setVisibility(8);
                return;
            }
            userStatusLinearLayout.setVisibility(0);
            userStatusLinearLayout.setNeedToRecognize(true);
            userStatusLinearLayout.setOnURLClickListener(new C33704a());
            userStatusLinearLayout.setOnPhoneClickListener(new C33705b());
            userStatusLinearLayout.setShowArrow(false);
            if (chatterDescription != null) {
                str = chatterDescription.description;
            } else {
                str = null;
            }
            if (chatChatter != null) {
                str2 = chatChatter.getId();
            } else {
                str2 = null;
            }
            userStatusLinearLayout.mo201155a(str, str2, null);
        }

        /* renamed from: a */
        public final void mo123696a(View view, Chat chat, ChatChatter chatChatter, Function0<Unit> function0) {
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Intrinsics.checkParameterIsNotNull(function0, "onCenterClick");
            if (chat.getType() == Chat.Type.P2P) {
                m130765a(view, chatChatter, chat.isSecret());
            } else {
                m130764a(view, chat);
            }
            View findViewById = view.findViewById(R.id.tag_wrapper);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.tag_wrapper)");
            TextView textView = (TextView) findViewById;
            C33085b a = C33085b.m127936a(chat, chatChatter).mo122241a(C29990c.m110930b());
            if (chat.isSecret()) {
                a.mo122240a(new SecretTagProvider());
            }
            LarkNameTag.ChatTagBuilder a2 = a.mo122239a(textView.getContext());
            if (chat.isEdu()) {
                TagInfo.Companion aVar = TagInfo.Companion;
                Intrinsics.checkExpressionValueIsNotNull(a2, "builder");
                TagInfo.Factory a3 = TagInfo.Companion.mo124874a();
                Context context = textView.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "tagWrapper.context");
                TagInfo.Companion.m131782a(aVar, a2, CollectionsKt.listOf(a3.mo124879a(context)), null, 4, null);
                a2.mo90037h(false);
            }
            a2.mo90027e().mo90004a(textView);
            textView.setVisibility(0);
            this.f86862b = view.findViewById(R.id.title_second_line);
            ImageView imageView = (ImageView) view.findViewById(R.id.setting_iv);
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            view.setOnClickListener(new View$OnClickListenerC33706c(function0));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$ITitleBarComponentDependency;", "", "getFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "onBannerHide", "", "onBannerShow", "bannerHeight", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$c */
    public interface ITitleBarComponentDependency {
        /* renamed from: a */
        void mo123144a();

        /* renamed from: a */
        void mo123145a(int i);

        /* renamed from: b */
        BaseFragment mo123146b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$OnTitlebarListener;", "", "onLeftClick", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$e */
    public interface OnTitlebarListener {
        /* renamed from: a */
        void mo123157a();
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent
    /* renamed from: a */
    public List<IComponentCallbacks> mo121968a() {
        return (List) this.f86850n.getValue();
    }

    /* renamed from: x */
    public final TitleTabHolder mo123692x() {
        return (TitleTabHolder) this.f86849m.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$Companion;", "", "()V", "SHOW_MAX_BADGE", "", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\"\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¨\u0006\u0011"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$getChatFunctionItems$1", "Lcom/ss/android/lark/chatwindow/view/sidemenu/item/ChatSettingItem$ChatSettingItemDependency;", "getEventSettingRole", "", "gotoGroupSettingActivity", "", "chatId", "", "meetingRole", "isOnCall", "", "startP2PSetting", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "curChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "hideSettingItemMask", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$h */
    public static final class C33710h implements ChatSettingItem.ChatSettingItemDependency {
        @Override // com.ss.android.lark.chatwindow.view.sidemenu.item.ChatSettingItem.ChatSettingItemDependency
        /* renamed from: a */
        public int mo123537a() {
            return 0;
        }

        @Override // com.ss.android.lark.chatwindow.view.sidemenu.item.ChatSettingItem.ChatSettingItemDependency
        /* renamed from: a */
        public void mo123538a(com.ss.android.lark.chat.entity.chatter.Chatter chatter, Chat chat, int i) {
            Intrinsics.checkParameterIsNotNull(chat, "curChat");
        }

        @Override // com.ss.android.lark.chatwindow.view.sidemenu.item.ChatSettingItem.ChatSettingItemDependency
        /* renamed from: a */
        public void mo123539a(String str, int i, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
        }

        C33710h() {
        }
    }

    /* renamed from: B */
    public final OnTitlebarListener mo123662B() {
        return this.f86838B;
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: d */
    public int mo121986d() {
        return this.f86837A;
    }

    /* renamed from: a */
    public void mo123644a(Chat chat, ChatChatter chatChatter) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        LeftBinder dVar = this.f86851o;
        if (dVar != null) {
            CommonTitleBar commonTitleBar = this.mTitleBar;
            if (commonTitleBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
            }
            View childAt = commonTitleBar.getLeftLayout().getChildAt(0);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "mTitleBar.leftLayout.getChildAt(0)");
            dVar.mo123701a(childAt, chat);
        }
        CenterBinder aVar = this.f86841c;
        if (aVar != null) {
            CommonTitleBar commonTitleBar2 = this.mTitleBar;
            if (commonTitleBar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
            }
            View childAt2 = commonTitleBar2.getCenterLayout().getChildAt(0);
            Intrinsics.checkExpressionValueIsNotNull(childAt2, "mTitleBar.centerLayout.getChildAt(0)");
            aVar.mo123696a(childAt2, chat, chatChatter, new C33708f(this, chat, chatChatter));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent
    /* renamed from: a */
    public void mo123672a(ITitlebarComponent.OnBannerControllerInitListener dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "listener");
        if (this.f86844g == null) {
            this.f86858x.add(dVar);
        } else {
            dVar.mo123718a();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent
    /* renamed from: a */
    public void mo123671a(ITitlebarComponent.MeetingRoleProvider cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "provider");
        this.f86857w = cVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent
    /* renamed from: a */
    public void mo123670a(ITitlebarComponent.IBannerVisibilityListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        List<ITitlebarComponent.IBannerVisibilityListener> list = this.f86846i;
        if (list != null) {
            list.add(bVar);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent
    /* renamed from: a */
    public void mo123675a(Chat chat, Function1<? super UDTabLayout, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Intrinsics.checkParameterIsNotNull(function1, "binder");
        mo123692x().mo123652a().mo123653a(chat, function1);
        if (ChatTabFgUtil.f86815a.mo123637a(chat)) {
            CommonTitleBar commonTitleBar = this.mTitleBar;
            if (commonTitleBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
            }
            commonTitleBar.setBackgroundColor(UIHelper.getColor(R.color.bg_body_overlay));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent
    /* renamed from: a */
    public void mo123676a(Chat chat, boolean z) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        mo123692x().mo123654a(chat, z);
    }

    /* renamed from: a */
    public final void mo123674a(Chat chat, ChatChatter chatChatter, String str) {
        ITitlebarComponent.MeetingRoleProvider cVar;
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
        ChatHitPoint.f135648a.mo187345a();
        ChatHitPoint.f135648a.mo187349a(chat, str);
        PerfChatPerformanceMonitor.m213460a(chat.getId(), chat.getUserCount(), C34339g.m133165a(chat, chatChatter), C34339g.m133167a(chat), chat.isCrossTenant());
        ChatHitPointNew.Companion.m213105a(ChatHitPointNew.f135660c, chat, "setting_sidebar", "im_chat_setting_view", (Map) null, 8, (Object) null);
        int i = !Intrinsics.areEqual(str, "title") ? 1 : 0;
        if (!chat.isP2PChat()) {
            int i2 = 0;
            if (chat.isMeeting() && (cVar = this.f86857w) != null) {
                if (cVar == null) {
                    Intrinsics.throwNpe();
                }
                i2 = cVar.mo123717a();
            }
            String id = chat.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
            mo123679a(id, i2, chat.isOnCall(), i);
            return;
        }
        if (chatChatter == null) {
            Intrinsics.throwNpe();
        }
        mo123677a(chatChatter, chat, m130717E(), i);
    }

    /* renamed from: a */
    public final void mo123673a(Chat chat, ChatChatter chatChatter, ChatChatter chatChatter2) {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        IChatSettingDependency w = b.mo134595w();
        Context y = mo123693y();
        if (y != null) {
            this.f86855u = w.mo134349a((Activity) y, chat, chatChatter, m130719b(chat, chatChatter, chatChatter2));
            View a = m130718a(mo123693y());
            TitleBarRedDotView titleBarRedDotView = (TitleBarRedDotView) a.findViewById(R.id.chat_title_red_dot_view);
            if (titleBarRedDotView != null) {
                this.f86842d = titleBarRedDotView;
                if (titleBarRedDotView != null) {
                    titleBarRedDotView.setPadding(0, 0, UIHelper.dp2px(12.0f), 0);
                }
                TitleBarRedDotView titleBarRedDotView2 = this.f86842d;
                if (titleBarRedDotView2 != null) {
                    titleBarRedDotView2.setIconDrawable(UDIconUtils.getIconDrawable(mo123693y(), (int) R.drawable.ud_icon_more_outlined, UDColorUtils.getColor(mo123693y(), chat.isSecret() ? R.color.static_white : R.color.icon_n1)));
                }
                C33728v vVar = new C33728v(this, chat, chatChatter, a, a);
                if (!DesktopUtil.m144301a(mo123693y())) {
                    mo123663a(10, vVar).setPadding(C57580a.m223598b(), 0, C57580a.m223594a() - UIHelper.dp2px(12.0f), 0);
                }
                TitleBarRedDotView titleBarRedDotView3 = this.f86842d;
                if (titleBarRedDotView3 == null) {
                    Intrinsics.throwNpe();
                }
                mo123678a(titleBarRedDotView3);
                IChatFunctionController cVar = this.f86855u;
                if (cVar != null) {
                    cVar.mo127561a(new C33727u(this));
                    return;
                }
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    /* renamed from: a */
    public final void mo123678a(TitleBarRedDotView titleBarRedDotView) {
        IChatFunctionController cVar = this.f86855u;
        ChatFunctionBadge aVar = null;
        IChatFunctionItem a = cVar != null ? cVar.mo127557a() : null;
        if (a != null) {
            aVar = a.mo127574b();
        }
        if (aVar == null) {
            titleBarRedDotView.mo130004a(false);
            titleBarRedDotView.setPadding(0, 0, UIHelper.dp2px(12.0f), 0);
            return;
        }
        ChatFunctionBadge b = a.mo127574b();
        if (b == null) {
            Intrinsics.throwNpe();
        }
        titleBarRedDotView.setBadgeDrawable(b.mo197611a());
        titleBarRedDotView.mo130005a(true, b.mo197616c());
        titleBarRedDotView.setPadding(UIHelper.dp2px(-13.0f), 0, UIHelper.dp2px(12.0f), 0);
    }

    /* renamed from: a */
    public final void mo123679a(String str, int i, boolean z, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        IChatSettingDependency w = b.mo134595w();
        Context y = mo123693y();
        Object o = mo141195o();
        if (o != null) {
            w.mo134356a(y, (BaseFragment) o, str, i, z, 19, i2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.base.fragment.BaseFragment");
    }

    /* renamed from: a */
    public final void mo123677a(com.ss.android.lark.chat.entity.chatter.Chatter chatter, Chat chat, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(chatter, "chatter");
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Context y = mo123693y();
        if (y == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        } else if (UIUtils.isActivityRunning((Activity) y)) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            IChatSettingDependency w = b.mo134595w();
            Context y2 = mo123693y();
            if (y2 != null) {
                Activity activity = (Activity) y2;
                Object o = mo141195o();
                if (o != null) {
                    w.mo134353a(activity, (BaseFragment) o, chatter, chat, i, 8, i2);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.base.fragment.BaseFragment");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent
    /* renamed from: a */
    public void mo123669a(OnTitlebarListener eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "listener");
        this.f86838B = eVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$m */
    public static final class C33716m extends Lambda implements Function0<Boolean> {
        final /* synthetic */ TitlebarComponent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33716m(TitlebarComponent titlebarComponent) {
            super(0);
            this.this$0 = titlebarComponent;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.this$0.f86845h;
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent
    public View ar_() {
        return this.f86842d;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent
    /* renamed from: h */
    public boolean mo121990h() {
        return ITitlebarComponent.C33731a.m130812a(this);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$f */
    public static final class C33708f extends Lambda implements Function0<Unit> {
        final /* synthetic */ Chat $chat;
        final /* synthetic */ ChatChatter $p2pChatter;
        final /* synthetic */ TitlebarComponent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33708f(TitlebarComponent titlebarComponent, Chat chat, ChatChatter chatChatter) {
            super(0);
            this.this$0 = titlebarComponent;
            this.$chat = chat;
            this.$p2pChatter = chatChatter;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo123674a(this.$chat, this.$p2pChatter, "title");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "Lkotlin/collections/ArrayList;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$g */
    static final class C33709g extends Lambda implements Function0<ArrayList<IComponentCallbacks>> {
        public static final C33709g INSTANCE = new C33709g();

        C33709g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayList<IComponentCallbacks> invoke() {
            return new ArrayList<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$initBannerViews$2$1", "Lcom/ss/android/lark/chat/chatwindow/chat/banner/DefaultBannerListener;", "onClose", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$j */
    public static final class C33712j extends C33154b {

        /* renamed from: a */
        final /* synthetic */ TitlebarComponent f86869a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.banner.C33154b, com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33186e
        /* renamed from: c */
        public void mo122182c() {
            TitleBarRedDotView titleBarRedDotView = this.f86869a.f86842d;
            if (titleBarRedDotView != null) {
                this.f86869a.mo123678a(titleBarRedDotView);
            }
        }

        C33712j(TitlebarComponent titlebarComponent) {
            this.f86869a = titlebarComponent;
        }
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: A */
    public void mo123661A() {
        super.mo123661A();
        IChatFunctionController cVar = this.f86855u;
        if (cVar != null) {
            cVar.mo127562b();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent
    /* renamed from: i */
    public View mo123681i() {
        CommonTitleBar commonTitleBar = this.mTitleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        return commonTitleBar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent
    /* renamed from: j */
    public void mo123682j() {
        ConstraintLayout constraintLayout = this.mTitleRoot;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleRoot");
        }
        constraintLayout.setVisibility(8);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent
    /* renamed from: k */
    public void mo123683k() {
        ConstraintLayout constraintLayout = this.mTitleRoot;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleRoot");
        }
        constraintLayout.setVisibility(0);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent
    /* renamed from: n */
    public void mo123686n() {
        CommonTitleBar commonTitleBar = this.mTitleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar.removeAllActions();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final CommonTitleBar mo123687p() {
        CommonTitleBar commonTitleBar = this.mTitleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        return commonTitleBar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final View mo123688s() {
        View view = this.mFloatCancel;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFloatCancel");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final LinearLayout mo123689t() {
        LinearLayout linearLayout = this.mBannerContainer;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBannerContainer");
        }
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final View mo123690v() {
        View view = this.mTitlebarDivider;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitlebarDivider");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final View mo123691w() {
        View view = this.mTitleBarTabContent;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBarTabContent");
        }
        return view;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$initBannerViews$1", "Lcom/ss/android/lark/chat/chatwindow/chat/banner/BannerController$VisibilityListener;", "onGone", "", "onShow", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$k */
    public static final class C33713k implements BannerController.AbstractC33151a {

        /* renamed from: a */
        final /* synthetic */ TitlebarComponent f86870a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.banner.BannerController.AbstractC33151a
        /* renamed from: a */
        public void mo122342a() {
            this.f86870a.mo123689t().post(new RunnableC33714a(this));
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.banner.BannerController.AbstractC33151a
        /* renamed from: b */
        public void mo122343b() {
            ITitleBarComponentDependency cVar = this.f86870a.f86848k;
            if (cVar != null) {
                cVar.mo123144a();
            }
            List<ITitlebarComponent.IBannerVisibilityListener> list = this.f86870a.f86846i;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    it.next().mo122156a();
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$k$a */
        static final class RunnableC33714a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33713k f86871a;

            RunnableC33714a(C33713k kVar) {
                this.f86871a = kVar;
            }

            public final void run() {
                ITitleBarComponentDependency cVar = this.f86871a.f86870a.f86848k;
                if (cVar != null) {
                    cVar.mo123145a(this.f86871a.f86870a.mo123689t().getHeight());
                }
                List<ITitlebarComponent.IBannerVisibilityListener> list = this.f86871a.f86870a.f86846i;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().mo122157a(this.f86871a.f86870a.mo123689t().getHeight());
                    }
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33713k(TitlebarComponent titlebarComponent) {
            this.f86870a = titlebarComponent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitleTabHolder;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$r */
    static final class C33721r extends Lambda implements Function0<TitleTabHolder> {
        final /* synthetic */ TitlebarComponent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33721r(TitlebarComponent titlebarComponent) {
            super(0);
            this.this$0 = titlebarComponent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TitleTabHolder invoke() {
            return new TitleTabHolder(this.this$0.mo123691w(), new TitleTabHolder.OnTabFuncClickListener(this) {
                /* class com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent.C33721r.C337221 */

                /* renamed from: a */
                final /* synthetic */ C33721r f86876a;

                @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitleTabHolder.OnTabFuncClickListener
                /* renamed from: a */
                public void mo123656a() {
                    String id;
                    Context context;
                    BaseFragment b;
                    Chat b2 = this.f86876a.this$0.f86847j.getChat().mo5927b();
                    if (b2 != null && (id = b2.getId()) != null) {
                        ITitleBarComponentDependency cVar = this.f86876a.this$0.f86848k;
                        if (cVar == null || (b = cVar.mo123146b()) == null) {
                            context = null;
                        } else {
                            context = b.requireContext();
                        }
                        if (context != null) {
                            Intrinsics.checkExpressionValueIsNotNull(id, "this");
                            AddSpacePageLauncher.m214564a(context, id);
                        }
                        ChatHitPointNew.f135660c.mo187388a(id, ChatTabHitPoint.ChatTabExtraParam.Click.ADD_DOC_PAGE_TOP_SIDEBAR.getValue(), ChatTabHitPoint.ChatTabExtraParam.Target.IM_CHAT_DOC_PAGE_ADD_VIEW.getValue(), (Map<String, ? extends Object>) null);
                    }
                }

                @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitleTabHolder.OnTabFuncClickListener
                /* renamed from: b */
                public void mo123657b() {
                    String id;
                    FragmentActivity fragmentActivity;
                    BaseFragment b;
                    Chat b2 = this.f86876a.this$0.f86847j.getChat().mo5927b();
                    if (b2 != null && (id = b2.getId()) != null) {
                        ITitleBarComponentDependency cVar = this.f86876a.this$0.f86848k;
                        if (cVar == null || (b = cVar.mo123146b()) == null) {
                            fragmentActivity = null;
                        } else {
                            fragmentActivity = b.requireActivity();
                        }
                        Intrinsics.checkExpressionValueIsNotNull(id, "this");
                        ChatTabManagerLauncher.m214313a(fragmentActivity, id);
                        ChatHitPointNew.f135660c.mo187388a(id, ChatTabHitPoint.ChatTabExtraParam.Click.DOC_PAGE_MANAGE.getValue(), ChatTabHitPoint.ChatTabExtraParam.Target.IM_CHAT_DOC_PAGE_MANAGE_VIEW.getValue(), (Map<String, ? extends Object>) null);
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f86876a = r1;
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$toggleBanner$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$x */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC33730x implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ TitlebarComponent f86888a;

        /* renamed from: b */
        final /* synthetic */ int f86889b;

        /* renamed from: c */
        final /* synthetic */ AbstractC33155c f86890c;

        public void onGlobalLayout() {
            this.f86888a.mo123687p().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            BannerController bannerController = this.f86888a.f86844g;
            if (bannerController != null) {
                bannerController.mo122335a(this.f86889b, this.f86890c);
            }
        }

        ViewTreeObserver$OnGlobalLayoutListenerC33730x(TitlebarComponent titlebarComponent, int i, AbstractC33155c cVar) {
            this.f86888a = titlebarComponent;
            this.f86889b = i;
            this.f86890c = cVar;
        }
    }

    /* renamed from: D */
    private final void m130716D() {
        BannerController bannerController = this.f86844g;
        if (bannerController != null) {
            bannerController.mo122334a(1);
            bannerController.mo122334a(2);
            bannerController.mo122334a(4);
            bannerController.mo122334a(64);
        }
        this.f86844g = null;
    }

    /* renamed from: f */
    public void mo123646f() {
        C25969c cVar = this.f86852p;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCancelableUIExecutor");
        }
        cVar.mo92350b(this.f86859y);
        C25969c cVar2 = this.f86852p;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCancelableUIExecutor");
        }
        cVar2.mo92346a(this.f86860z, 300);
    }

    /* renamed from: g */
    public void mo123647g() {
        C25969c cVar = this.f86852p;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCancelableUIExecutor");
        }
        cVar.mo92350b(this.f86860z);
        C25969c cVar2 = this.f86852p;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCancelableUIExecutor");
        }
        cVar2.mo92346a(this.f86859y, 100);
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: r */
    public void mo122001r() {
        super.mo122001r();
        m130716D();
        IChatFunctionController cVar = this.f86855u;
        if (cVar != null) {
            cVar.mo127563c();
        }
        this.f86855u = null;
        TitlebarViewModel dVar = this.f86843e;
        if (dVar != null) {
            dVar.destroy();
        }
        this.f86846i = null;
    }

    /* renamed from: y */
    public final Context mo123693y() {
        View K = mo141184K();
        if (K == null) {
            Intrinsics.throwNpe();
        }
        Context context = K.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "contentView!!.context");
        return context;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$i */
    static final class RunnableC33711i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TitlebarComponent f86868a;

        RunnableC33711i(TitlebarComponent titlebarComponent) {
            this.f86868a = titlebarComponent;
        }

        public final void run() {
            this.f86868a.f86840b.cancel();
            float alpha = this.f86868a.mo123687p().getAlpha();
            this.f86868a.f86839a.setFloatValues(alpha, 0.0f);
            this.f86868a.f86839a.setDuration((long) (((float) 100) * alpha));
            this.f86868a.f86839a.start();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$w */
    static final class RunnableC33729w implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TitlebarComponent f86887a;

        RunnableC33729w(TitlebarComponent titlebarComponent) {
            this.f86887a = titlebarComponent;
        }

        public final void run() {
            this.f86887a.f86839a.cancel();
            float alpha = this.f86887a.mo123687p().getAlpha();
            this.f86887a.f86840b.setFloatValues(alpha, 1.0f);
            this.f86887a.f86840b.setDuration((long) (((float) MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL) * (((float) 1) - alpha)));
            this.f86887a.f86840b.start();
        }
    }

    /* renamed from: E */
    private final int m130717E() {
        if (this.f86856v == null) {
            return 0;
        }
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        IChatSettingDependency w = b.mo134595w();
        Intrinsics.checkExpressionValueIsNotNull(w, "chatSettingDependency");
        return w.mo134347a() | w.mo134360b() | w.mo134364c();
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent
    /* renamed from: l */
    public void mo123684l() {
        this.f86853q.clear();
        List<IActionTitlebar.Action> list = this.f86853q;
        CommonTitleBar commonTitleBar = this.mTitleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        List<IActionTitlebar.Action> allActions = commonTitleBar.getAllActions();
        Intrinsics.checkExpressionValueIsNotNull(allActions, "mTitleBar.allActions");
        list.addAll(allActions);
        this.f86854t = this.f86838B;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent
    /* renamed from: m */
    public void mo123685m() {
        CommonTitleBar commonTitleBar = this.mTitleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar.removeAllActions();
        for (T t : this.f86853q) {
            CommonTitleBar commonTitleBar2 = this.mTitleBar;
            if (commonTitleBar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
            }
            commonTitleBar2.addAction(t);
        }
        this.f86853q.clear();
        this.f86838B = this.f86854t;
        this.f86854t = null;
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        PerfLog.start("titlebar_init", "");
        View K = mo141184K();
        if (K == null) {
            Intrinsics.throwNpe();
        }
        ButterKnife.bind(this, K);
        mo123694z();
        mo123645b();
        m130715C();
        TitlebarComponent titlebarComponent = this;
        C33427a.m129533a(this.f86847j.getInitData(), titlebarComponent, new C33723s(this));
        this.f86847j.getChat().mo5923a(titlebarComponent, new C33726t(this));
        PerfLog.end("titlebar_init", "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo123694z() {
        this.f86852p = new C25969c(new Handler(Looper.getMainLooper()));
        this.f86840b.addUpdateListener(new C33717n(this));
        this.f86840b.addListener(new C33718o(this));
        this.f86839a.addUpdateListener(new C33719p(this));
        this.f86839a.addListener(new C33720q(this));
    }

    /* renamed from: C */
    private final void m130715C() {
        LinearLayout linearLayout = this.mBannerContainer;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBannerContainer");
        }
        BannerController bannerController = new BannerController(linearLayout, new C33713k(this));
        bannerController.mo122336a(ChatterApplyBanner.m128183j().mo122355a(1).mo122359b(9).mo122356a(new C33712j(this)).mo122358a());
        bannerController.mo122336a(C33182a.m128201j().mo122355a(6).mo122359b(10).mo122356a(new C33154b()).mo122358a());
        bannerController.mo122336a(EduInviteParentBanner.m128192k().mo122355a(7).mo122359b(66).mo122356a(new C33154b()).mo122358a());
        this.f86844g = bannerController;
        Iterator<T> it = this.f86858x.iterator();
        while (it.hasNext()) {
            it.next().mo123718a();
        }
    }

    /* renamed from: b */
    public void mo123645b() {
        View view;
        CommonTitleBar commonTitleBar = this.mTitleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        LinearLayout leftLayout = commonTitleBar.getLeftLayout();
        LeftBinder dVar = new LeftBinder(new C33715l(this), new C33716m(this));
        this.f86851o = dVar;
        View view2 = null;
        if (dVar != null) {
            Intrinsics.checkExpressionValueIsNotNull(leftLayout, "leftLayout");
            view = dVar.mo123699a(leftLayout);
        } else {
            view = null;
        }
        leftLayout.addView(view);
        this.f86841c = new CenterBinder();
        CommonTitleBar commonTitleBar2 = this.mTitleBar;
        if (commonTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        CenterBinder aVar = this.f86841c;
        if (aVar != null) {
            CommonTitleBar commonTitleBar3 = this.mTitleBar;
            if (commonTitleBar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
            }
            LinearLayout centerLayout = commonTitleBar3.getCenterLayout();
            Intrinsics.checkExpressionValueIsNotNull(centerLayout, "mTitleBar.centerLayout");
            view2 = aVar.mo123695a(centerLayout);
        }
        commonTitleBar2.setCustomTitleView(view2);
        CommonTitleBar commonTitleBar4 = this.mTitleBar;
        if (commonTitleBar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        CommonTitleBar commonTitleBar5 = this.mTitleBar;
        if (commonTitleBar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        Context context = commonTitleBar5.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "mTitleBar.context");
        commonTitleBar4.setBackgroundColor(UDColorUtils.getColor(context, R.color.imtoken_message_bg_chat));
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent
    /* renamed from: c */
    public void mo121985c() {
        int color = UDColorUtils.getColor(mo123693y(), R.color.bg_tips);
        int color2 = UDColorUtils.getColor(mo123693y(), R.color.static_white);
        CommonTitleBar commonTitleBar = this.mTitleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar.setBackgroundColor(color);
        CommonTitleBar commonTitleBar2 = this.mTitleBar;
        if (commonTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar2.setMainTitleColor(color2);
        CommonTitleBar commonTitleBar3 = this.mTitleBar;
        if (commonTitleBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar3.setSubTitleColor(color2);
        CommonTitleBar commonTitleBar4 = this.mTitleBar;
        if (commonTitleBar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        TextView textView = (TextView) commonTitleBar4.findViewById(R.id.group_name);
        if (textView != null) {
            textView.setTextColor(color2);
        }
        CommonTitleBar commonTitleBar5 = this.mTitleBar;
        if (commonTitleBar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        TextView textView2 = (TextView) commonTitleBar5.findViewById(R.id.group_num);
        if (textView2 != null) {
            textView2.setTextColor(color2);
        }
        CommonTitleBar commonTitleBar6 = this.mTitleBar;
        if (commonTitleBar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        ImageView imageView = (ImageView) commonTitleBar6.findViewById(R.id.setting_iv);
        if (imageView != null) {
            CommonTitleBar commonTitleBar7 = this.mTitleBar;
            if (commonTitleBar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
            }
            Context context = commonTitleBar7.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "mTitleBar.context");
            CommonTitleBar commonTitleBar8 = this.mTitleBar;
            if (commonTitleBar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
            }
            Context context2 = commonTitleBar8.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "mTitleBar.context");
            imageView.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_expand_right_filled, UDColorUtils.getColor(context2, R.color.static_white)));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$l */
    public static final class C33715l extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ TitlebarComponent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33715l(TitlebarComponent titlebarComponent) {
            super(1);
            this.this$0 = titlebarComponent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            OnTitlebarListener B = this.this$0.mo123662B();
            if (B != null) {
                B.mo123157a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$initTitlebarAnim$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$o */
    public static final class C33718o extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ TitlebarComponent f86873a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33718o(TitlebarComponent titlebarComponent) {
            this.f86873a = titlebarComponent;
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            super.onAnimationEnd(animator);
            this.f86873a.mo123688s().setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$initTitlebarAnim$4", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$q */
    public static final class C33720q extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ TitlebarComponent f86875a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33720q(TitlebarComponent titlebarComponent) {
            this.f86875a = titlebarComponent;
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            super.onAnimationStart(animator);
            this.f86875a.mo123688s().setVisibility(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$setupTitleBarRightAction$1", "Lcom/ss/android/lark/widget/chat_function_view/OnItemUpdateListener;", "onItemUpdated", "", "menuItem", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionItem;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$u */
    public static final class C33727u implements OnItemUpdateListener {

        /* renamed from: a */
        final /* synthetic */ TitlebarComponent f86882a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33727u(TitlebarComponent titlebarComponent) {
            this.f86882a = titlebarComponent;
        }

        @Override // com.ss.android.lark.widget.chat_function_view.OnItemUpdateListener
        public void onItemUpdated(IChatFunctionItem dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "menuItem");
            TitlebarComponent titlebarComponent = this.f86882a;
            TitleBarRedDotView titleBarRedDotView = titlebarComponent.f86842d;
            if (titleBarRedDotView == null) {
                Intrinsics.throwNpe();
            }
            titlebarComponent.mo123678a(titleBarRedDotView);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent
    /* renamed from: a */
    public void mo123664a(int i) {
        BannerController bannerController = this.f86844g;
        if (bannerController != null) {
            bannerController.mo122334a(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B6\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R)\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$LeftBinder;", "", "onLeftClick", "Lkotlin/Function1;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "v", "", "needShowBadgeProvider", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "mBadgeView", "Landroid/widget/TextView;", "bindBadge", "count", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "bindView", "itemView", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "createView", "parent", "Landroid/view/ViewGroup;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$d */
    public static final class LeftBinder {

        /* renamed from: a */
        public final Function1<View, Unit> f86864a;

        /* renamed from: b */
        private TextView f86865b;

        /* renamed from: c */
        private final Function0<Boolean> f86866c;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$d$a */
        public static final class View$OnClickListenerC33707a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ LeftBinder f86867a;

            View$OnClickListenerC33707a(LeftBinder dVar) {
                this.f86867a = dVar;
            }

            public final void onClick(View view) {
                Function1<View, Unit> function1 = this.f86867a.f86864a;
                Intrinsics.checkExpressionValueIsNotNull(view, "it");
                function1.invoke(view);
            }
        }

        /* renamed from: a */
        public final View mo123699a(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View b = C35266c.m137765b(viewGroup.getContext(), false);
            TextView textView = (TextView) b.findViewById(R.id.new_message_text);
            this.f86865b = textView;
            if (textView != null) {
                textView.setVisibility(8);
            }
            Intrinsics.checkExpressionValueIsNotNull(b, "view");
            return b;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public LeftBinder(Function1<? super View, Unit> function1, Function0<Boolean> function0) {
            Intrinsics.checkParameterIsNotNull(function1, "onLeftClick");
            Intrinsics.checkParameterIsNotNull(function0, "needShowBadgeProvider");
            this.f86864a = function1;
            this.f86866c = function0;
        }

        /* renamed from: a */
        public final void mo123701a(View view, Chat chat) {
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            Intrinsics.checkParameterIsNotNull(chat, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (chat.isSecret()) {
                ((ImageView) view.findViewById(R.id.back)).setImageResource(R.drawable.titlebar_back_white_bg_selector);
                ((ImageView) view.findViewById(R.id.close)).setImageResource(R.drawable.titlebar_close_white_bg_selector);
            } else {
                ((ImageView) view.findViewById(R.id.back)).setImageResource(R.drawable.titlebar_back_bg_selector);
                ((ImageView) view.findViewById(R.id.close)).setImageResource(R.drawable.titlebar_close_bg_selector);
            }
            TextView textView = this.f86865b;
            if (textView != null) {
                textView.setVisibility(0);
            }
            view.setOnClickListener(new View$OnClickListenerC33707a(this));
        }

        /* renamed from: a */
        public final void mo123700a(int i, Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            TextView textView = this.f86865b;
            if (textView == null) {
                return;
            }
            if (i <= 0 || !this.f86866c.invoke().booleanValue()) {
                textView.setText("");
                textView.setBackground(null);
            } else if (i <= 999) {
                textView.setText(String.valueOf(i));
                if (chat.isSecret()) {
                    textView.setBackgroundResource(R.drawable.chat_title_left_count_bg_static_white);
                    Context context = textView.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "it.context");
                    textView.setTextColor(UDColorUtils.getColor(context, R.color.lkui_N900));
                    return;
                }
                textView.setBackgroundResource(R.drawable.common_round11dp_gray_c6_bg);
                Context context2 = textView.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "it.context");
                textView.setTextColor(UDColorUtils.getColor(context2, R.color.text_title));
            } else {
                textView.setText("");
                if (chat.isSecret()) {
                    textView.setBackgroundResource(R.drawable.chat_window_badge_point_static_white);
                } else {
                    textView.setBackgroundResource(R.drawable.chat_window_badge_point);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$t */
    static final class C33726t<T> implements AbstractC1178x<Chat> {

        /* renamed from: a */
        final /* synthetic */ TitlebarComponent f86881a;

        C33726t(TitlebarComponent titlebarComponent) {
            this.f86881a = titlebarComponent;
        }

        /* renamed from: a */
        public final void onChanged(Chat chat) {
            ChatChatter chatChatter;
            TitlebarComponent titlebarComponent = this.f86881a;
            if (chat == null) {
                Intrinsics.throwNpe();
            }
            C35219b b = this.f86881a.f86847j.getInitData().mo5927b();
            if (b != null) {
                chatChatter = b.f90957g;
            } else {
                chatChatter = null;
            }
            titlebarComponent.mo123644a(chat, chatChatter);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$setupTitleBarRightAction$titlebarViewAction$1", "Lcom/ss/android/lark/ui/IActionTitlebar$ViewAction;", "performAction", "", "view", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$v */
    public static final class C33728v extends IActionTitlebar.C57575b {

        /* renamed from: a */
        final /* synthetic */ TitlebarComponent f86883a;

        /* renamed from: b */
        final /* synthetic */ Chat f86884b;

        /* renamed from: c */
        final /* synthetic */ ChatChatter f86885c;

        /* renamed from: d */
        final /* synthetic */ View f86886d;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f86883a.mo123674a(this.f86884b, this.f86885c, "more");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33728v(TitlebarComponent titlebarComponent, Chat chat, ChatChatter chatChatter, View view, View view2) {
            super(view2);
            this.f86883a = titlebarComponent;
            this.f86884b = chat;
            this.f86885c = chatChatter;
            this.f86886d = view;
        }
    }

    /* renamed from: a */
    private final View m130718a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        TitleBarRedDotView titleBarRedDotView = new TitleBarRedDotView(context);
        titleBarRedDotView.setId(R.id.chat_title_red_dot_view);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        titleBarRedDotView.setBadgeSize(UIUtils.dp2px(context, 10.0f));
        frameLayout.addView(titleBarRedDotView, layoutParams);
        return frameLayout;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$n */
    public static final class C33717n implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ TitlebarComponent f86872a;

        C33717n(TitlebarComponent titlebarComponent) {
            this.f86872a = titlebarComponent;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                this.f86872a.mo123687p().setAlpha(floatValue);
                this.f86872a.mo123691w().setAlpha(floatValue);
                this.f86872a.mo123689t().setAlpha(floatValue);
                this.f86872a.mo123688s().setAlpha(((float) 1) - floatValue);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$p */
    public static final class C33719p implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ TitlebarComponent f86874a;

        C33719p(TitlebarComponent titlebarComponent) {
            this.f86874a = titlebarComponent;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                this.f86874a.mo123687p().setAlpha(floatValue);
                this.f86874a.mo123691w().setAlpha(floatValue);
                this.f86874a.mo123689t().setAlpha(floatValue);
                this.f86874a.mo123688s().setAlpha(((float) 1) - floatValue);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent$s */
    public static final class C33723s<T> implements AbstractC1178x<C35219b> {

        /* renamed from: a */
        final /* synthetic */ TitlebarComponent f86877a;

        C33723s(TitlebarComponent titlebarComponent) {
            this.f86877a = titlebarComponent;
        }

        /* renamed from: a */
        public final void onChanged(final C35219b bVar) {
            C1177w<com.ss.android.lark.chat.entity.chatter.Chatter> p2pChatterLiveData;
            C1177w<Integer> badgeCountLiveData;
            PerfLog.start("titlebar_init_with_data", "");
            this.f86877a.f86845h = bVar.f90954d;
            TitlebarComponent titlebarComponent = this.f86877a;
            Chat chat = bVar.f90956f;
            Intrinsics.checkExpressionValueIsNotNull(chat, "it.chat");
            ChatChatter chatChatter = bVar.f90957g;
            ChatChatter chatChatter2 = bVar.f90958h;
            Intrinsics.checkExpressionValueIsNotNull(chatChatter2, "it.self");
            titlebarComponent.mo123673a(chat, chatChatter, chatChatter2);
            TitlebarComponent titlebarComponent2 = this.f86877a;
            Chat chat2 = bVar.f90956f;
            Intrinsics.checkExpressionValueIsNotNull(chat2, "it.chat");
            titlebarComponent2.mo123644a(chat2, bVar.f90957g);
            TitlebarComponent titlebarComponent3 = this.f86877a;
            Chat chat3 = bVar.f90956f;
            Intrinsics.checkExpressionValueIsNotNull(chat3, "it.chat");
            boolean isShowApplyBanner = chat3.isShowApplyBanner();
            String id = bVar.f90956f.getId();
            Chat chat4 = bVar.f90956f;
            Intrinsics.checkExpressionValueIsNotNull(chat4, "it.chat");
            titlebarComponent3.mo123667a(2, isShowApplyBanner, new ChatterApplyBanner.C33176a(id, chat4.getPutChatterApplyCount()));
            if (bVar == null) {
                Intrinsics.throwNpe();
            }
            Chat chat5 = bVar.f90956f;
            Intrinsics.checkExpressionValueIsNotNull(chat5, "it!!.chat");
            TitlebarModelFactory cVar = new TitlebarModelFactory(chat5, bVar.f90957g);
            TitlebarComponent titlebarComponent4 = this.f86877a;
            Object o = titlebarComponent4.mo141195o();
            if (o != null) {
                titlebarComponent4.f86843e = (TitlebarViewModel) new C1144ai((Fragment) o, cVar).mo6006a(WidgetViewModelKeyManager.f86344a.mo123198a(TitlebarViewModel.class), TitlebarViewModel.class);
                TitlebarViewModel dVar = this.f86877a.f86843e;
                if (!(dVar == null || (badgeCountLiveData = dVar.getBadgeCountLiveData()) == null)) {
                    badgeCountLiveData.mo5923a(this.f86877a, new AbstractC1178x<Integer>(this) {
                        /* class com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent.C33723s.C337241 */

                        /* renamed from: a */
                        final /* synthetic */ C33723s f86878a;

                        {
                            this.f86878a = r1;
                        }

                        /* renamed from: a */
                        public final void onChanged(Integer num) {
                            TitlebarComponent titlebarComponent = this.f86878a.f86877a;
                            Intrinsics.checkExpressionValueIsNotNull(num, "badge");
                            int intValue = num.intValue();
                            Chat chat = bVar.f90956f;
                            Intrinsics.checkExpressionValueIsNotNull(chat, "it.chat");
                            titlebarComponent.mo123666a(intValue, chat);
                        }
                    });
                }
                TitlebarViewModel dVar2 = this.f86877a.f86843e;
                if (!(dVar2 == null || (p2pChatterLiveData = dVar2.getP2pChatterLiveData()) == null)) {
                    p2pChatterLiveData.mo5923a(this.f86877a, new AbstractC1178x<com.ss.android.lark.chat.entity.chatter.Chatter>(this) {
                        /* class com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent.C33723s.C337252 */

                        /* renamed from: a */
                        final /* synthetic */ C33723s f86880a;

                        {
                            this.f86880a = r1;
                        }

                        /* renamed from: a */
                        public final void onChanged(com.ss.android.lark.chat.entity.chatter.Chatter chatter) {
                            CenterBinder aVar = this.f86880a.f86877a.f86841c;
                            if (aVar != null) {
                                Intrinsics.checkExpressionValueIsNotNull(chatter, "chatter");
                                aVar.mo123697a(chatter);
                            }
                        }
                    });
                }
                PerfLog.end("titlebar_init_with_data", "");
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent
    /* renamed from: a */
    public void mo123668a(AbstractC33187f<?> fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "bannerView");
        BannerController bannerController = this.f86844g;
        if (bannerController != null) {
            bannerController.mo122336a(fVar);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent
    /* renamed from: a */
    public void mo121971a(IComponentCallbacks gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        ITitlebarComponent.C33731a.m130811a(this, gVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent
    /* renamed from: a */
    public void mo123665a(int i, View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        BannerController bannerController = this.f86844g;
        if (bannerController != null) {
            if (bannerController == null) {
                Intrinsics.throwNpe();
            }
            AbstractC33187f b = bannerController.mo122337b(i);
            if (b != null) {
                b.mo122345a(view, null);
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent
    /* renamed from: a */
    public View mo123663a(int i, IActionTitlebar.BaseAction baseAction) {
        Intrinsics.checkParameterIsNotNull(baseAction, "titleBarViewAction");
        CommonTitleBar commonTitleBar = this.mTitleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        if (commonTitleBar.getActionCount() > i) {
            CommonTitleBar commonTitleBar2 = this.mTitleBar;
            if (commonTitleBar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
            }
            View addAction = commonTitleBar2.addAction(baseAction, i);
            Intrinsics.checkExpressionValueIsNotNull(addAction, "mTitleBar.addAction(titleBarViewAction, index)");
            return addAction;
        }
        CommonTitleBar commonTitleBar3 = this.mTitleBar;
        if (commonTitleBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        View addAction2 = commonTitleBar3.addAction(baseAction);
        Intrinsics.checkExpressionValueIsNotNull(addAction2, "mTitleBar.addAction(titleBarViewAction)");
        return addAction2;
    }

    /* renamed from: a */
    public final void mo123666a(int i, Chat chat) {
        LeftBinder dVar = this.f86851o;
        if (dVar != null) {
            dVar.mo123700a(i, chat);
        }
    }

    /* renamed from: b */
    private final List<IChatFunctionItem> m130719b(Chat chat, ChatChatter chatChatter, ChatChatter chatChatter2) {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        List<IChatFunctionItem> a = b.mo134595w().mo134351a(chatChatter2, chatChatter, chat, true);
        a.add(new ChatSettingItem(chat, chatChatter, this.f86856v, new C33710h()));
        Intrinsics.checkExpressionValueIsNotNull(a, "items");
        return a;
    }

    public TitlebarComponent(OnTitlebarListener eVar, ITitleDependenceViewModel aVar, ITitleBarComponentDependency cVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dependenceViewModel");
        this.f86838B = eVar;
        this.f86847j = aVar;
        this.f86848k = cVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent
    /* renamed from: a */
    public void mo123667a(@BannerController.BannerType int i, boolean z, AbstractC33155c cVar) {
        if (!z) {
            BannerController bannerController = this.f86844g;
            if (bannerController != null) {
                bannerController.mo122338c(i);
                return;
            }
            return;
        }
        CommonTitleBar commonTitleBar = this.mTitleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        if (commonTitleBar.isShown()) {
            BannerController bannerController2 = this.f86844g;
            if (bannerController2 != null) {
                bannerController2.mo122335a(i, cVar);
                return;
            }
            return;
        }
        CommonTitleBar commonTitleBar2 = this.mTitleBar;
        if (commonTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC33730x(this, i, cVar));
    }
}
