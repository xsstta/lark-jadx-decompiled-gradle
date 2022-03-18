package com.ss.android.lark.chat.chatwindow.chat.v2.component.tab;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.C1177w;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.tab.UDTab;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator2;
import com.larksuite.framework.callback.C25969c;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponentCallbacks;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IDependencyViewModel;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.WidgetViewModelKeyManager;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist.IMessageListChatWindow;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist.MessageListFragment;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist.MessageListTabSpecCreator;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.space.SpaceFragment;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.space.SpaceTabSpecCreator;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.spacelist.SpaceListFragment;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.spacelist.SpaceListTabSpecCreator;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.view.ViewPager2FixLayout;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.IMessageSender;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1638a.C33427a;
import com.ss.android.lark.chat.entity.page.IDocPageLoader;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.tab.service.entity.ChatTab;
import com.ss.android.lark.tab.space.tab.entity.DocTabPayload;
import com.ss.android.lark.tab.statistics.ChatTabHitPoint;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.lark.utils.statistics.PerfLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 \u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0001\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0016J\u0010\u0010D\u001a\u00020A2\u0006\u0010B\u001a\u00020EH\u0016J\u0012\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020IH\u0016J\u0010\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020MH\u0016J\u0010\u0010N\u001a\u00020K2\u0006\u0010L\u001a\u00020OH\u0016J/\u0010P\u001a\u0004\u0018\u0001HQ\"\u0010\b\u0000\u0010Q*\n\u0012\u0006\b\u0001\u0012\u00020S0R2\f\u0010T\u001a\b\u0012\u0004\u0012\u0002HQ0UH\u0016¢\u0006\u0002\u0010VJ\u0012\u0010W\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010XH\u0002J\b\u0010Y\u001a\u00020\u001dH\u0016J\n\u0010Z\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010[\u001a\u00020\\H\u0016J\b\u0010]\u001a\u00020KH\u0016J\b\u0010^\u001a\u00020AH\u0002J\b\u0010_\u001a\u00020AH\u0002J\b\u0010`\u001a\u00020AH\u0002J\u0010\u0010a\u001a\u00020A2\u0006\u0010b\u001a\u00020KH\u0016J\"\u0010c\u001a\u00020A2\u0006\u0010d\u001a\u00020\u00172\u0006\u0010e\u001a\u00020\u00172\b\u0010f\u001a\u0004\u0018\u00010gH\u0016J\b\u0010h\u001a\u00020AH\u0016J\u0010\u0010i\u001a\u00020A2\u0006\u0010j\u001a\u00020\u0017H\u0016J\b\u0010k\u001a\u00020AH\u0016J\b\u0010l\u001a\u00020AH\u0016J\u0010\u0010m\u001a\u00020A2\u0006\u0010n\u001a\u00020oH\u0016J\b\u0010p\u001a\u00020AH\u0016J\u0010\u0010q\u001a\u00020A2\u0006\u0010r\u001a\u000209H\u0016J\u0010\u0010s\u001a\u00020A2\u0006\u0010t\u001a\u00020=H\u0016J\u0010\u0010u\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0016J\u0010\u0010v\u001a\u00020A2\u0006\u0010B\u001a\u00020EH\u0016J\b\u0010w\u001a\u00020AH\u0016J\u0012\u0010x\u001a\u00020A2\b\u0010y\u001a\u0004\u0018\u00010zH\u0002J\u0010\u0010{\u001a\u00020A2\u0006\u0010|\u001a\u00020\u001dH\u0016J\u0012\u0010}\u001a\u00020A2\b\u0010r\u001a\u0004\u0018\u000107H\u0016J\u0010\u0010~\u001a\u00020A2\u0006\u0010r\u001a\u000209H\u0016J\u0010\u0010\u001a\u00020A2\u0006\u0010t\u001a\u00020=H\u0016J\u0019\u0010\u0001\u001a\u00020A2\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020z0\u0001H\u0016R!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020+X.¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010.\u001a\u00020/8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u000e\u00104\u001a\u000205X\u0004¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u000e¢\u0006\u0002\n\u0000R!\u00108\u001a\b\u0012\u0004\u0012\u0002090\u000e8FX\u0002¢\u0006\f\n\u0004\b;\u0010\u0013\u001a\u0004\b:\u0010\u0011R!\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u000e8FX\u0002¢\u0006\f\n\u0004\b?\u0010\u0013\u001a\u0004\b>\u0010\u0011¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/TabComponent;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/IMessageListChatWindow;", "mContext", "Landroid/content/Context;", "hostVM", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabDependeceViewModel;", "mDependency", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/TabComponent$ITabComponentDependency;", "firstPageLoadCallback", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$ContentViewCreatedCallback;", "(Landroid/content/Context;Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabDependeceViewModel;Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/TabComponent$ITabComponentDependency;Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$ContentViewCreatedCallback;)V", "callbacks", "", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabComponent$ITabComponentCallback;", "getCallbacks", "()Ljava/util/List;", "callbacks$delegate", "Lkotlin/Lazy;", "docPageLoader", "Lcom/ss/android/lark/chat/entity/page/IDocPageLoader;", "layoutId", "", "getLayoutId", "()I", "mCancelableExecutor", "Lcom/larksuite/framework/callback/CancelableCallbackExecutor;", "mCurrentTabId", "", "mPageAdapter", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ChatTabPageAdapter;", "getMPageAdapter", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ChatTabPageAdapter;", "setMPageAdapter", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ChatTabPageAdapter;)V", "mRoot", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/view/ViewPager2FixLayout;", "getMRoot", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/view/ViewPager2FixLayout;", "setMRoot", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/view/ViewPager2FixLayout;)V", "mTabController", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ChatPageSpecController;", "mViewModel", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/TabViewModel;", "mViewPager", "Landroidx/viewpager2/widget/ViewPager2;", "getMViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", "setMViewPager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "onPageChangeListener", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onTitleStateChangeListener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$OnTitleStateChangeListener;", "tabSwitchListeners", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabComponent$OnTabSwitchListener;", "getTabSwitchListeners", "tabSwitchListeners$delegate", "tabViewChangeObsevers", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabComponent$OnTabViewChangeObserver;", "getTabViewChangeObsevers", "tabViewChangeObsevers$delegate", "addActivityResultHandler", "", "handle", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$IActivityResultHandler;", "addShowSmartReplyHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$IShowSmartReplyHandler;", "bindTabLayout", "Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator2;", "tabLayout", "Lcom/larksuite/component/universe_design/tab/UDTabLayout;", "dispatchKeyEvent", "", "event", "Landroid/view/KeyEvent;", "dispatchTouchEvent", "Landroid/view/MotionEvent;", "getComponent", "T", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "getCurrentPageSpec", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec;", "getCurrentTabId", "getMessagePage", "getMessageSender", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/IMessageSender;", "handleBack", "initTabController", "initViewModel", "initViewPager", "lockTab", "lock", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBannerHide", "onBannerShow", "bannerHeight", "onCreate", "onDestroy", "onNewIntent", "bundle", "Lcom/ss/android/lark/biz/im/api/ChatBundle;", "onStop", "registerTabSwitchListener", "listener", "registerTabViewChangeObserver", "observer", "removeActivityResultHandler", "removeShowSmartReplyHandler", "replaceComponentForSecret", "reportTabSwitchHitPoint", "tab", "Lcom/ss/android/lark/tab/service/entity/ChatTab;", "setCurrentTab", "id", "setTitleStateChangeListener", "unRegisterTabSwitchListener", "unRegisterTabViewChangeObserver", "updateChatTabs", "chatTabs", "", "Companion", "ITabComponentDependency", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class TabComponent extends Widget implements IMessageListChatWindow, ITabComponent {

    /* renamed from: j */
    public static final Companion f86687j = new Companion(null);

    /* renamed from: a */
    public IChatTabPageSpec.OnTitleStateChangeListener f86688a;

    /* renamed from: b */
    public IDocPageLoader f86689b;

    /* renamed from: c */
    public ChatPageSpecController f86690c;

    /* renamed from: d */
    public TabViewModel f86691d;

    /* renamed from: e */
    public long f86692e = -1;

    /* renamed from: g */
    public C25969c f86693g;

    /* renamed from: h */
    public Context f86694h;

    /* renamed from: i */
    public ITabComponentDependency f86695i;

    /* renamed from: k */
    private final Lazy f86696k = LazyKt.lazy(C33654d.INSTANCE);

    /* renamed from: l */
    private final Lazy f86697l = LazyKt.lazy(C33668o.INSTANCE);

    /* renamed from: m */
    private final Lazy f86698m = LazyKt.lazy(C33667n.INSTANCE);
    @BindView(8596)
    public ViewPager2FixLayout mRoot;
    @BindView(9291)
    public ViewPager2 mViewPager;

    /* renamed from: n */
    private ChatTabPageAdapter f86699n;

    /* renamed from: o */
    private final ViewPager2.AbstractC1603e f86700o = new C33666m(this);

    /* renamed from: p */
    private ITabDependeceViewModel f86701p;

    /* renamed from: q */
    private IChatTabPageSpec.ContentViewCreatedCallback f86702q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J%\u0010\u0006\u001a\u0002H\u0007\"\b\b\u0000\u0010\u0007*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH&¢\u0006\u0002\u0010\u000bJ/\u0010\f\u001a\u0004\u0018\u0001H\u0007\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH&¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H&J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/TabComponent$ITabComponentDependency;", "", "closePage", "", "getBaseFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "getChatWindowViewModel", "T", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IDependencyViewModel;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IDependencyViewModel;", "getComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "getFragmentManager", "Landroidx/fragment/app/FragmentManager;", "getRootView", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabComponent$b */
    public interface ITabComponentDependency {
        /* renamed from: a */
        BaseFragment mo123174a();

        /* renamed from: a */
        <T extends IComponent<? extends IComponentCallbacks>> T mo123175a(Class<T> cls);

        /* renamed from: b */
        <T extends IDependencyViewModel> T mo123176b(Class<T> cls);

        /* renamed from: b */
        void mo123177b();
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent
    /* renamed from: a */
    public List<ITabComponent.ITabComponentCallback> mo121968a() {
        return (List) this.f86696k.getValue();
    }

    /* renamed from: b */
    public final List<ITabComponent.OnTabViewChangeObserver> mo123558b() {
        return (List) this.f86697l.getValue();
    }

    /* renamed from: c */
    public final List<ITabComponent.OnTabSwitchListener> mo121985c() {
        return (List) this.f86698m.getValue();
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: d */
    public int mo121986d() {
        return R.layout.chat_window_component_tab;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/TabComponent$Companion;", "", "()V", "DOC_PRELOAD_DELAY_TIME", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabComponent$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: i */
    public final ChatTabPageAdapter mo123561i() {
        return this.f86699n;
    }

    /* renamed from: m */
    public long mo123565m() {
        return this.f86692e;
    }

    /* renamed from: a */
    public void mo121971a(ITabComponent.ITabComponentCallback bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "callback");
        ITabComponent.C33696a.m130676a(this, bVar);
    }

    /* renamed from: a */
    public final void mo123556a(ChatTab chatTab) {
        C35219b b;
        String str;
        if (chatTab != null && (b = this.f86701p.getInitData().mo5927b()) != null && (str = b.f90955e) != null) {
            String str2 = null;
            if (chatTab.getType() == ChatTab.ChatTabType.DOC) {
                String payloadString = chatTab.getPayloadString();
                String str3 = "none";
                if (payloadString != null) {
                    DocTabPayload a = DocTabPayload.Companion.mo188718a(payloadString);
                    if (a != null) {
                        str2 = a.getKey();
                    }
                    String c = C57859q.m224567c(str2);
                    if (c != null) {
                        str3 = c;
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("file_id", str3);
                ChatHitPointNew.f135660c.mo187388a(str, ChatTabHitPoint.ChatTabExtraParam.Click.DOC_PAGE_TAB.getValue(), ChatTabHitPoint.ChatTabExtraParam.Target.CCM_DOCS_PAGE_VIEW.getValue(), hashMap);
            } else if (chatTab.getType() == ChatTab.ChatTabType.DOC_SPACE) {
                ChatHitPointNew.f135660c.mo187388a(str, ChatTabHitPoint.ChatTabExtraParam.Click.DOC_LIST_TAB.getValue(), ChatTabHitPoint.ChatTabExtraParam.Target.IM_CHAT_DOC_LIST_VIEW.getValue(), (Map<String, ? extends Object>) null);
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabComponent
    /* renamed from: a */
    public void mo123546a(List<ChatTab> list) {
        C1177w<List<ChatTab>> chatTabListLiveData;
        Intrinsics.checkParameterIsNotNull(list, "chatTabs");
        TabViewModel jVar = this.f86691d;
        if (jVar != null && (chatTabListLiveData = jVar.getChatTabListLiveData()) != null) {
            chatTabListLiveData.mo5926a(list);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabComponent
    /* renamed from: a */
    public void mo123547a(boolean z) {
        ViewPager2 viewPager2 = this.mViewPager;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        viewPager2.setUserInputEnabled(false);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabComponent
    /* renamed from: a */
    public void mo123545a(ITabComponent.OnTabViewChangeObserver dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "observer");
        mo123558b().add(dVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabComponent
    /* renamed from: a */
    public void mo123544a(ITabComponent.OnTabSwitchListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        mo121985c().add(cVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow
    /* renamed from: a */
    public boolean mo123557a(KeyEvent keyEvent) {
        Intrinsics.checkParameterIsNotNull(keyEvent, "event");
        IChatTabPageSpec<?, ?> v = m130439v();
        if (v != null) {
            return v.mo123557a(keyEvent);
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/tab/TabComponent$initTabController$3", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/space/SpaceFragment$SpaceDependency;", "getActivity", "Landroidx/appcompat/app/AppCompatActivity;", "getDocPageProvider", "Lcom/ss/android/lark/chat/entity/page/IDocPageLoader;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabComponent$g */
    public static final class C33657g extends SpaceFragment.SpaceDependency {

        /* renamed from: a */
        final /* synthetic */ TabComponent f86706a;

        /* renamed from: b */
        final /* synthetic */ C33658h f86707b;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.space.SpaceFragment.SpaceDependency
        /* renamed from: b */
        public IDocPageLoader mo123566b() {
            return this.f86706a.f86689b;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.space.SpaceFragment.SpaceDependency
        /* renamed from: c */
        public AppCompatActivity mo123567c() {
            return (AppCompatActivity) this.f86706a.f86695i.mo123174a().getActivity();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33657g(TabComponent tabComponent, C33658h hVar, CommonTabDependency dVar) {
            super(dVar);
            this.f86706a = tabComponent;
            this.f86707b = hVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J%\u0010\u0004\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\bH\u0016¢\u0006\u0002\u0010\tJ/\u0010\n\u001a\u0004\u0018\u0001H\u0005\"\u0010\b\u0000\u0010\u0005*\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\bH\u0016¢\u0006\u0002\u0010\rJ\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u0010"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/tab/TabComponent$initTabController$commonTabDependency$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/CommonTabDependency;", "closePage", "", "getChatWindowViewModel", "T", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IDependencyViewModel;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IDependencyViewModel;", "getComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "getRootView", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabComponent$h */
    public static final class C33658h implements CommonTabDependency {

        /* renamed from: a */
        final /* synthetic */ TabComponent f86708a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.CommonTabDependency
        /* renamed from: a */
        public void mo123569a() {
            this.f86708a.f86695i.mo123177b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33658h(TabComponent tabComponent) {
            this.f86708a = tabComponent;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.CommonTabDependency
        /* renamed from: a */
        public <T extends IComponent<? extends IComponentCallbacks>> T mo123568a(Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "clazz");
            return (T) this.f86708a.f86695i.mo123175a(cls);
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.CommonTabDependency
        /* renamed from: b */
        public <T extends IDependencyViewModel> T mo123570b(Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "clazz");
            return (T) this.f86708a.f86695i.mo123176b(cls);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabComponent$ITabComponentCallback;", "Lkotlin/collections/ArrayList;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabComponent$d */
    static final class C33654d extends Lambda implements Function0<ArrayList<ITabComponent.ITabComponentCallback>> {
        public static final C33654d INSTANCE = new C33654d();

        C33654d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayList<ITabComponent.ITabComponentCallback> invoke() {
            return new ArrayList<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabComponent$OnTabSwitchListener;", "Lkotlin/collections/ArrayList;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabComponent$n */
    static final class C33667n extends Lambda implements Function0<ArrayList<ITabComponent.OnTabSwitchListener>> {
        public static final C33667n INSTANCE = new C33667n();

        C33667n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayList<ITabComponent.OnTabSwitchListener> invoke() {
            return new ArrayList<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabComponent$OnTabViewChangeObserver;", "Lkotlin/collections/ArrayList;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabComponent$o */
    static final class C33668o extends Lambda implements Function0<ArrayList<ITabComponent.OnTabViewChangeObserver>> {
        public static final C33668o INSTANCE = new C33668o();

        C33668o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayList<ITabComponent.OnTabViewChangeObserver> invoke() {
            return new ArrayList<>();
        }
    }

    /* renamed from: f */
    public final ViewPager2 mo123559f() {
        ViewPager2 viewPager2 = this.mViewPager;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        return viewPager2;
    }

    /* renamed from: g */
    public final ViewPager2FixLayout mo123560g() {
        ViewPager2FixLayout viewPager2FixLayout = this.mRoot;
        if (viewPager2FixLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoot");
        }
        return viewPager2FixLayout;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow, com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent
    /* renamed from: h */
    public boolean mo121990h() {
        IChatTabPageSpec<?, ?> v = m130439v();
        if (v != null) {
            return v.mo121990h();
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist.IMessageListChatWindow
    /* renamed from: j */
    public void mo123562j() {
        IMessageListChatWindow t = m130438t();
        if (t != null) {
            t.mo123562j();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist.IMessageListChatWindow
    /* renamed from: l */
    public void mo123564l() {
        IMessageListChatWindow t = m130438t();
        if (t != null) {
            t.mo123564l();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow, com.ss.android.lark.framework.larkwidget.Widget
    public void onStop() {
        super.onStop();
        IChatTabPageSpec<?, ?> v = m130439v();
        if (v != null) {
            v.onStop();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist.IMessageListChatWindow
    /* renamed from: k */
    public IMessageSender mo123563k() {
        IMessageListChatWindow t = m130438t();
        if (t != null) {
            return t.mo123563k();
        }
        throw new IllegalStateException("tab is not init yet");
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: r */
    public void mo122001r() {
        ViewPager2 viewPager2 = this.mViewPager;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        viewPager2.unregisterOnPageChangeCallback(this.f86700o);
        C25969c cVar = this.f86693g;
        if (cVar != null) {
            cVar.mo92349b();
        }
        IDocPageLoader cVar2 = this.f86689b;
        if (cVar2 != null) {
            cVar2.mo124911a();
        }
        super.mo122001r();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/tab/TabComponent$initViewPager$3", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "onChanged", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabComponent$l */
    public static final class C33664l extends RecyclerView.AdapterDataObserver {

        /* renamed from: a */
        final /* synthetic */ TabComponent f86716a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabComponent$l$a */
        static final class RunnableC33665a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33664l f86717a;

            RunnableC33665a(C33664l lVar) {
                this.f86717a = lVar;
            }

            public final void run() {
                List<ChatTab> list;
                C1177w<List<ChatTab>> chatTabListLiveData;
                for (T t : this.f86717a.f86716a.mo123558b()) {
                    TabViewModel jVar = this.f86717a.f86716a.f86691d;
                    if (jVar == null || (chatTabListLiveData = jVar.getChatTabListLiveData()) == null) {
                        list = null;
                    } else {
                        list = chatTabListLiveData.mo5927b();
                    }
                    t.mo123627a(list);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            List<IChatTabPageSpec<?, ?>> d;
            super.onChanged();
            ChatTabPageAdapter i = this.f86716a.mo123561i();
            if (!(i == null || (d = i.mo123620d()) == null)) {
                Iterator<T> it = d.iterator();
                while (it.hasNext()) {
                    it.next().mo123554a(this.f86716a.f86688a);
                }
            }
            this.f86716a.mo123559f().post(new RunnableC33665a(this));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33664l(TabComponent tabComponent) {
            this.f86716a = tabComponent;
        }
    }

    /* renamed from: t */
    private final IMessageListChatWindow m130438t() {
        List<IChatTabPageSpec<?, ?>> d;
        ChatTabPageAdapter cVar = this.f86699n;
        if (cVar == null || (d = cVar.mo123620d()) == null) {
            return null;
        }
        for (T t : d) {
            if (t instanceof IMessageListChatWindow) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: v */
    private final IChatTabPageSpec<?, ?> m130439v() {
        int i;
        ChatTabPageAdapter cVar;
        List<IChatTabPageSpec<?, ?>> d;
        ChatTabPageAdapter cVar2 = this.f86699n;
        if (cVar2 != null) {
            i = cVar2.mo123618b(this.f86692e);
        } else {
            i = -1;
        }
        if (i == -1 || (cVar = this.f86699n) == null || (d = cVar.mo123620d()) == null) {
            return null;
        }
        return d.get(i);
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        PerfLog.start("tab_init", "");
        View K = mo141184K();
        if (K != null) {
            ButterKnife.bind(this, K);
            m130436p();
            try {
                m130435n();
                PerfLog.end("tab_init", "");
            } catch (Exception e) {
                Exception exc = e;
                Log.m165385e("ChatWindowLog", "init tab crash", exc, true);
                throw exc;
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: n */
    private final void m130435n() {
        Object o = mo141195o();
        if (o != null) {
            TabViewModel jVar = (TabViewModel) new C1144ai((Fragment) o).mo6006a(WidgetViewModelKeyManager.f86344a.mo123198a(TabViewModel.class), TabViewModel.class);
            TabComponent tabComponent = this;
            jVar.getChatTabListLiveData().mo5923a(tabComponent, new C33659i(this));
            this.f86691d = jVar;
            C33427a.m129533a(this.f86701p.getInitData(), tabComponent, new C33661j(this));
            m130437s();
            ChatPageSpecController aVar = this.f86690c;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabController");
            }
            mo123546a(aVar.mo123579a());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
    }

    /* renamed from: p */
    private final void m130436p() {
        ViewPager2FixLayout viewPager2FixLayout = this.mRoot;
        if (viewPager2FixLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoot");
        }
        viewPager2FixLayout.setViewPagerControl(new C33663k(this));
        ChatTabPageAdapter cVar = new ChatTabPageAdapter(this.f86695i.mo123174a());
        ViewPager2 viewPager2 = this.mViewPager;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        viewPager2.setAdapter(cVar);
        this.f86699n = cVar;
        ViewPager2 viewPager22 = this.mViewPager;
        if (viewPager22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        viewPager22.setOffscreenPageLimit(1);
        ViewPager2 viewPager23 = this.mViewPager;
        if (viewPager23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        viewPager23.registerOnPageChangeCallback(this.f86700o);
        ViewPager2 viewPager24 = this.mViewPager;
        if (viewPager24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        View childAt = viewPager24.getChildAt(0);
        if (childAt instanceof RecyclerView) {
            ((RecyclerView) childAt).setOverScrollMode(2);
        }
        ChatTabPageAdapter cVar2 = this.f86699n;
        if (cVar2 != null) {
            cVar2.registerAdapterDataObserver(new C33664l(this));
        }
    }

    /* renamed from: s */
    private final void m130437s() {
        ChatPageSpecController aVar = new ChatPageSpecController(this.f86694h, this.f86701p);
        this.f86690c = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabController");
        }
        aVar.mo123581a(this.f86702q);
        C33658h hVar = new C33658h(this);
        ChatPageSpecController aVar2 = this.f86690c;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabController");
        }
        C33658h hVar2 = hVar;
        aVar2.mo123582a(ChatTab.ChatTabType.MESSAGE, new MessageListTabSpecCreator(new C33655e(hVar, hVar2)));
        ChatPageSpecController aVar3 = this.f86690c;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabController");
        }
        aVar3.mo123582a(ChatTab.ChatTabType.DOC_SPACE, new SpaceListTabSpecCreator(new C33656f(hVar, hVar2)));
        ChatPageSpecController aVar4 = this.f86690c;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabController");
        }
        aVar4.mo123582a(ChatTab.ChatTabType.DOC, new SpaceTabSpecCreator(new C33657g(this, hVar, hVar2)));
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow
    /* renamed from: a */
    public void mo123554a(IChatTabPageSpec.OnTitleStateChangeListener dVar) {
        this.f86688a = dVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/tab/TabComponent$bindTabLayout$1", "Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator2$UDTabConfiguration;", "onConfigureTab", "", "position", "", "tab", "Lcom/larksuite/component/universe_design/tab/UDTab;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabComponent$c */
    public static final class C33653c implements UDTabLayoutCoordinator2.UDTabConfiguration {

        /* renamed from: a */
        final /* synthetic */ TabComponent f86703a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33653c(TabComponent tabComponent) {
            this.f86703a = tabComponent;
        }

        @Override // com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator2.UDTabConfiguration
        /* renamed from: a */
        public void mo91356a(int i, UDTab bVar) {
            IChatTabPageSpec<?, ?> b;
            Intrinsics.checkParameterIsNotNull(bVar, "tab");
            ChatTabPageAdapter i2 = this.f86703a.mo123561i();
            if (i2 != null && (b = i2.mo123619b(i)) != null) {
                bVar.mo91335a((CharSequence) b.mo123592b());
                bVar.mo91336a(Long.valueOf(b.mo123591a()));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/tab/TabComponent$initViewPager$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/view/ViewPager2FixLayout$IViewPagerControl;", "enableViewPagerHorizontalScroll", "", "enable", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabComponent$k */
    public static final class C33663k implements ViewPager2FixLayout.IViewPagerControl {

        /* renamed from: a */
        final /* synthetic */ TabComponent f86715a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33663k(TabComponent tabComponent) {
            this.f86715a = tabComponent;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.view.ViewPager2FixLayout.IViewPagerControl
        /* renamed from: a */
        public void mo123575a(boolean z) {
            this.f86715a.mo123559f().setUserInputEnabled(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/tab/TabComponent$onPageChangeListener$1", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onPageSelected", "", "position", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabComponent$m */
    public static final class C33666m extends ViewPager2.AbstractC1603e {

        /* renamed from: a */
        final /* synthetic */ TabComponent f86718a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33666m(TabComponent tabComponent) {
            this.f86718a = tabComponent;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1603e
        public void onPageSelected(int i) {
            List<IChatTabPageSpec<?, ?>> d;
            super.onPageSelected(i);
            ChatTabPageAdapter i2 = this.f86718a.mo123561i();
            ChatTab chatTab = null;
            IChatTabPageSpec<?, ?> b = i2 != null ? i2.mo123619b(i) : null;
            if (b != null) {
                b.mo123595e();
            }
            long a = b != null ? b.mo123591a() : -1;
            if (a != this.f86718a.f86692e) {
                KeyboardUtils.hideKeyboard(this.f86718a.f86694h, this.f86718a.mo123560g());
            }
            this.f86718a.f86692e = a;
            ChatTabPageAdapter i3 = this.f86718a.mo123561i();
            if (!(i3 == null || (d = i3.mo123620d()) == null)) {
                for (T t : d) {
                    long a2 = t.mo123591a();
                    if (b == null || a2 != b.mo123591a()) {
                        t.mo123596f();
                    }
                }
            }
            for (T t2 : this.f86718a.mo121985c()) {
                t2.mo123626a(b != null ? b.mo123591a() : -1);
            }
            TabComponent tabComponent = this.f86718a;
            if (b != null) {
                chatTab = b.mo123594d();
            }
            tabComponent.mo123556a(chatTab);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ChatPageSpecController m130434a(TabComponent tabComponent) {
        ChatPageSpecController aVar = tabComponent.f86690c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabController");
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "chatTabs", "", "Lcom/ss/android/lark/tab/service/entity/ChatTab;", "kotlin.jvm.PlatformType", "onChanged", "com/ss/android/lark/chat/chatwindow/chat/v2/component/tab/TabComponent$initViewModel$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabComponent$i */
    public static final class C33659i<T> implements AbstractC1178x<List<? extends ChatTab>> {

        /* renamed from: a */
        final /* synthetic */ TabComponent f86709a;

        C33659i(TabComponent tabComponent) {
            this.f86709a = tabComponent;
        }

        /* renamed from: a */
        public final void onChanged(final List<ChatTab> list) {
            this.f86709a.mo123559f().post(new Runnable(this) {
                /* class com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabComponent.C33659i.RunnableC336601 */

                /* renamed from: a */
                final /* synthetic */ C33659i f86710a;

                {
                    this.f86710a = r1;
                }

                public final void run() {
                    ChatTabPageAdapter i = this.f86710a.f86709a.mo123561i();
                    if (i != null) {
                        ChatPageSpecController a = TabComponent.m130434a(this.f86710a.f86709a);
                        List<ChatTab> list = list;
                        Intrinsics.checkExpressionValueIsNotNull(list, "chatTabs");
                        i.mo123617a(a.mo123580a(list));
                    }
                }
            });
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabComponent
    /* renamed from: a */
    public UDTabLayoutCoordinator2 mo123541a(UDTabLayout uDTabLayout) {
        Intrinsics.checkParameterIsNotNull(uDTabLayout, "tabLayout");
        ViewPager2 viewPager2 = this.mViewPager;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        return new UDTabLayoutCoordinator2(uDTabLayout, viewPager2, new C33653c(this));
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabComponent
    /* renamed from: b */
    public void mo123548b(ITabComponent.OnTabSwitchListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        mo121985c().remove(cVar);
    }

    /* Return type fixed from 'T extends com.ss.android.lark.chat.chatwindow.chat.v2.component.f<? extends com.ss.android.lark.chat.chatwindow.chat.v2.component.g>' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Class<T extends com.ss.android.lark.chat.chatwindow.chat.v2.component.f<? extends com.ss.android.lark.chat.chatwindow.chat.v2.component.g>>] */
    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow
    /* renamed from: a */
    public <T extends IComponent<? extends IComponentCallbacks>> MessageListFragment mo123550a(Class<MessageListFragment> cls) {
        List<IChatTabPageSpec<?, ?>> d;
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        ChatTabPageAdapter cVar = this.f86699n;
        if (cVar == null || (d = cVar.mo123620d()) == null) {
            return null;
        }
        Iterator<T> it = d.iterator();
        while (it.hasNext()) {
            T t = (T) it.next().mo123550a(cls);
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabComponent
    /* renamed from: b */
    public void mo123549b(ITabComponent.OnTabViewChangeObserver dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "observer");
        mo123558b().remove(dVar);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabComponent$j */
    public static final class C33661j<T> implements AbstractC1178x<C35219b> {

        /* renamed from: a */
        final /* synthetic */ TabComponent f86712a;

        C33661j(TabComponent tabComponent) {
            this.f86712a = tabComponent;
        }

        /* renamed from: a */
        public final void onChanged(final C35219b bVar) {
            long j;
            PerfLog.start("tab_init_with_data", "");
            TabComponent tabComponent = this.f86712a;
            Long l = bVar.f90965o;
            Intrinsics.checkExpressionValueIsNotNull(l, "it.tabId");
            tabComponent.mo123542a(l.longValue());
            if (bVar.f90964n) {
                j = 5000;
            } else {
                j = 0;
            }
            this.f86712a.f86693g = new C25969c(new Handler(Looper.getMainLooper()));
            C25969c cVar = this.f86712a.f86693g;
            if (cVar != null) {
                cVar.mo92346a(new Runnable(this) {
                    /* class com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabComponent.C33661j.RunnableC336621 */

                    /* renamed from: a */
                    final /* synthetic */ C33661j f86713a;

                    {
                        this.f86713a = r1;
                    }

                    public final void run() {
                        TabComponent tabComponent = this.f86713a.f86712a;
                        AbstractC36474h b = C29990c.m110930b();
                        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                        tabComponent.f86689b = b.mo134513L().mo134669a(bVar.f90955e);
                        IDocPageLoader cVar = this.f86713a.f86712a.f86689b;
                        if (cVar != null) {
                            cVar.mo124913a(this.f86713a.f86712a.f86694h);
                        }
                    }
                }, j);
            }
            PerfLog.end("tab_init_with_data", "");
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist.IMessageListChatWindow
    /* renamed from: a */
    public void mo123551a(int i) {
        IMessageListChatWindow t = m130438t();
        if (t != null) {
            t.mo123551a(i);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabComponent
    /* renamed from: a */
    public void mo123542a(long j) {
        int i;
        ChatTabPageAdapter cVar = this.f86699n;
        if (cVar != null) {
            i = cVar.mo123618b(j);
        } else {
            i = -1;
        }
        if (i >= 0) {
            this.f86692e = j;
            ViewPager2 viewPager2 = this.mViewPager;
            if (viewPager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            }
            viewPager2.setCurrentItem(i, true);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist.IMessageListChatWindow
    /* renamed from: a */
    public void mo123552a(IChatWindowApp.IActivityResultHandler aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "handle");
        IMessageListChatWindow t = m130438t();
        if (t != null) {
            t.mo123552a(aVar);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist.IMessageListChatWindow
    /* renamed from: a */
    public void mo123553a(IChatWindowApp.IShowSmartReplyHandler dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "handle");
        IMessageListChatWindow t = m130438t();
        if (t != null) {
            t.mo123553a(dVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/tab/TabComponent$initTabController$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListFragment$MessageListDependency;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabComponent$e */
    public static final class C33655e extends MessageListFragment.MessageListDependency {

        /* renamed from: a */
        final /* synthetic */ C33658h f86704a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33655e(C33658h hVar, CommonTabDependency dVar) {
            super(dVar);
            this.f86704a = hVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/tab/TabComponent$initTabController$2", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/spacelist/SpaceListFragment$SpaceListDependency;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabComponent$f */
    public static final class C33656f extends SpaceListFragment.SpaceListDependency {

        /* renamed from: a */
        final /* synthetic */ C33658h f86705a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33656f(C33658h hVar, CommonTabDependency dVar) {
            super(dVar);
            this.f86705a = hVar;
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow, com.ss.android.lark.framework.larkwidget.Widget
    public void onActivityResult(int i, int i2, Intent intent) {
        List<IChatTabPageSpec<?, ?>> d;
        super.onActivityResult(i, i2, intent);
        IChatTabPageSpec<?, ?> v = m130439v();
        if (v != null) {
            v.onActivityResult(i, i2, intent);
        }
        ChatTabPageAdapter cVar = this.f86699n;
        if (!(cVar == null || (d = cVar.mo123620d()) == null)) {
            for (T t : d) {
                if (t.mo123591a() != this.f86692e) {
                    t.onActivityResult(i, i2, intent);
                } else {
                    return;
                }
            }
        }
    }

    public TabComponent(Context context, ITabDependeceViewModel hVar, ITabComponentDependency bVar, IChatTabPageSpec.ContentViewCreatedCallback aVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(hVar, "hostVM");
        Intrinsics.checkParameterIsNotNull(bVar, "mDependency");
        this.f86694h = context;
        this.f86701p = hVar;
        this.f86695i = bVar;
        this.f86702q = aVar;
    }
}
