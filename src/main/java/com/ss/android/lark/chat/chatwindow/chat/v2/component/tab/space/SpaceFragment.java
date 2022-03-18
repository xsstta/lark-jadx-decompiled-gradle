package com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.space;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponentCallbacks;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IDependencyViewModel;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ChatTabFragment;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.CommonTabDependency;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.space.ISpaceChatWindow;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.spacelist.SpaceListFragment;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.util.ChatTabFgUtil;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.util.InputModeLifecycleHelper;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.page.DocPageConfig;
import com.ss.android.lark.chat.entity.page.IDocPageLoader;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 H2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002HIB\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001eH\u0016J#\u0010\u001f\u001a\u0004\u0018\u0001H \"\u0004\b\u0000\u0010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H 0\"H\u0016¢\u0006\u0002\u0010#J/\u0010$\u001a\u0004\u0018\u0001H \"\u0010\b\u0000\u0010 *\n\u0012\u0006\b\u0001\u0012\u00020&0%2\f\u0010'\u001a\b\u0012\u0004\u0012\u0002H 0\"H\u0016¢\u0006\u0002\u0010(J\u001c\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020\u000fH\u0016J\b\u00100\u001a\u00020\u0017H\u0002J\u0010\u00101\u001a\u00020\u00172\b\u00102\u001a\u0004\u0018\u00010\u0013J\"\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002052\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0010\u00109\u001a\u00020\u00172\u0006\u0010:\u001a\u00020;H\u0016J\u0012\u0010<\u001a\u00020\u00172\b\u0010=\u001a\u0004\u0018\u00010*H\u0014J\b\u0010>\u001a\u00020\u0017H\u0016J\u0010\u0010?\u001a\u00020\u00172\u0006\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u00020\u0017H\u0016J\b\u0010C\u001a\u00020\u0017H\u0016J\b\u0010D\u001a\u00020\u0017H\u0016J\u0010\u0010E\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010F\u001a\u00020\u00172\b\u0010G\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078VX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/space/SpaceFragment;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ChatTabFragment;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/space/SpaceFragment$SpaceDependency;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/space/ISpaceChatWindow;", "Lcom/ss/android/lark/base/activity/ILifeCycleExtension;", "()V", "inputModeLifecycleHelper", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/util/InputModeLifecycleHelper;", "getInputModeLifecycleHelper", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/util/InputModeLifecycleHelper;", "inputModeLifecycleHelper$delegate", "Lkotlin/Lazy;", "mContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mDocFragmentInit", "", "mDocInnerFragment", "Landroidx/fragment/app/Fragment;", "mDocUrl", "", "mTitleStateChangeListener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$OnTitleStateChangeListener;", "addExtension", "", "delegate", "Lcom/ss/android/lark/base/activity/ActivityExtension;", "dispatchKeyEvent", "event", "Landroid/view/KeyEvent;", "dispatchTouchEvent", "Landroid/view/MotionEvent;", "findExtension", "T", ShareHitPoint.f121869d, "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "getComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "clazz", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "getContentView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "handleBack", "installDocFragment", "loadDocUrl", "url", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onContentViewCreated", "root", "onDestroyView", "onNewIntent", "bundle", "Lcom/ss/android/lark/biz/im/api/ChatBundle;", "onPageSelect", "onPageUnSelect", "onStop", "removeExtension", "setTitleStateChangeListener", "listener", "Companion", "SpaceDependency", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.b.c */
public final class SpaceFragment extends ChatTabFragment<SpaceDependency> implements ISpaceChatWindow {

    /* renamed from: c */
    public static final Companion f86770c = new Companion(null);

    /* renamed from: b */
    public boolean f86771b;

    /* renamed from: d */
    private ConstraintLayout f86772d;

    /* renamed from: e */
    private IChatTabPageSpec.OnTitleStateChangeListener f86773e;

    /* renamed from: f */
    private String f86774f;

    /* renamed from: g */
    private Fragment f86775g;

    /* renamed from: h */
    private final Lazy f86776h = LazyKt.lazy(new C33688c(this));

    /* renamed from: i */
    private HashMap f86777i;

    /* Return type fixed from 'T extends com.ss.android.lark.chat.chatwindow.chat.v2.component.f<? extends com.ss.android.lark.chat.chatwindow.chat.v2.component.g>' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Class<T extends com.ss.android.lark.chat.chatwindow.chat.v2.component.f<? extends com.ss.android.lark.chat.chatwindow.chat.v2.component.g>>] */
    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow
    /* renamed from: a */
    public <T extends IComponent<? extends IComponentCallbacks>> SpaceListFragment mo123550a(Class<SpaceListFragment> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        return null;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ChatTabFragment
    /* renamed from: c */
    public InputModeLifecycleHelper mo123606c() {
        return (InputModeLifecycleHelper) this.f86776h.getValue();
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ChatTabFragment, com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabLazyLoadFragment
    /* renamed from: f */
    public void mo123585f() {
        HashMap hashMap = this.f86777i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/space/SpaceFragment$Companion;", "", "()V", "TAB_TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.b.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J%\u0010\b\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\fH\u0016¢\u0006\u0002\u0010\rJ/\u0010\u000e\u001a\u0004\u0018\u0001H\t\"\u0010\b\u0000\u0010\t*\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\fH\u0016¢\u0006\u0002\u0010\u0011J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/space/SpaceFragment$SpaceDependency;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/CommonTabDependency;", "commonTabDependency", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/CommonTabDependency;)V", "closePage", "", "getActivity", "Landroidx/appcompat/app/AppCompatActivity;", "getChatWindowViewModel", "T", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IDependencyViewModel;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IDependencyViewModel;", "getComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "getDocPageProvider", "Lcom/ss/android/lark/chat/entity/page/IDocPageLoader;", "getRootView", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.b.c$b */
    public static abstract class SpaceDependency implements CommonTabDependency {

        /* renamed from: a */
        private final CommonTabDependency f86778a;

        /* renamed from: b */
        public abstract IDocPageLoader mo123566b();

        /* renamed from: c */
        public abstract AppCompatActivity mo123567c();

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.CommonTabDependency
        /* renamed from: a */
        public void mo123569a() {
            this.f86778a.mo123569a();
        }

        public SpaceDependency(CommonTabDependency dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "commonTabDependency");
            this.f86778a = dVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.CommonTabDependency
        /* renamed from: a */
        public <T extends IComponent<? extends IComponentCallbacks>> T mo123568a(Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "clazz");
            return (T) this.f86778a.mo123568a(cls);
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.CommonTabDependency
        /* renamed from: b */
        public <T extends IDependencyViewModel> T mo123570b(Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "clazz");
            return (T) this.f86778a.mo123570b(cls);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ChatTabFragment
    /* renamed from: d */
    public void mo123607d() {
        super.mo123607d();
        Fragment fragment = this.f86775g;
        if (fragment != null) {
            fragment.setUserVisibleHint(true);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ChatTabFragment
    /* renamed from: e */
    public void mo123608e() {
        super.mo123608e();
        Fragment fragment = this.f86775g;
        if (fragment != null) {
            fragment.setUserVisibleHint(false);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ChatTabFragment, com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabLazyLoadFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f86771b = false;
        this.f86775g = null;
        mo123585f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/util/InputModeLifecycleHelper;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.b.c$c */
    static final class C33688c extends Lambda implements Function0<InputModeLifecycleHelper> {
        final /* synthetic */ SpaceFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33688c(SpaceFragment cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final InputModeLifecycleHelper invoke() {
            Window window;
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                window = activity.getWindow();
            } else {
                window = null;
            }
            return new InputModeLifecycleHelper(window, InputModeLifecycleHelper.Mode.ADJUST_NOTHING);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow
    /* renamed from: h */
    public boolean mo121990h() {
        IDocPageLoader b;
        SpaceDependency bVar = (SpaceDependency) mo123605b();
        if (bVar == null || (b = bVar.mo123566b()) == null) {
            return false;
        }
        return b.mo124917b();
    }

    /* renamed from: j */
    public final void mo123611j() {
        Context context;
        IDocPageLoader b;
        if (this.f86774f != null) {
            try {
                DocPageConfig aVar = new DocPageConfig(true, true, true, false, false, false, false);
                ConstraintLayout constraintLayout = this.f86772d;
                if (constraintLayout != null && (context = constraintLayout.getContext()) != null) {
                    SpaceDependency bVar = (SpaceDependency) mo123605b();
                    Fragment fragment = null;
                    if (!(bVar == null || (b = bVar.mo123566b()) == null)) {
                        String str = this.f86774f;
                        if (str == null) {
                            Intrinsics.throwNpe();
                        }
                        Fragment a = b.mo124910a(context, str, aVar);
                        if (a != null) {
                            FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
                            Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "this@SpaceFragment.child…anager.beginTransaction()");
                            beginTransaction.replace(R.id.chat_window_list_container_id, a, (String) null);
                            beginTransaction.commitAllowingStateLoss();
                            IChatTabPageSpec.ContentViewCreatedCallback a2 = mo123601a();
                            if (a2 != null) {
                                a2.mo123178a();
                            }
                            this.f86771b = true;
                            fragment = a;
                        }
                    }
                    this.f86775g = fragment;
                }
            } catch (Exception e) {
                Log.m165383e("SpaceFragment", e.getMessage());
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow
    /* renamed from: a */
    public void mo123554a(IChatTabPageSpec.OnTitleStateChangeListener dVar) {
        this.f86773e = dVar;
    }

    /* renamed from: b */
    public final void mo123610b(String str) {
        this.f86774f = str;
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        IDocPageLoader b;
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        SpaceDependency bVar = (SpaceDependency) mo123605b();
        if (!(bVar == null || (b = bVar.mo123566b()) == null)) {
            b.mo124914a(configuration);
        }
        super.onConfigurationChanged(configuration);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.b.c$d */
    static final class C33689d<T> implements AbstractC1178x<Chat> {

        /* renamed from: a */
        final /* synthetic */ SpaceFragment f86779a;

        C33689d(SpaceFragment cVar) {
            this.f86779a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(Chat chat) {
            AppCompatActivity c;
            SpaceDependency bVar;
            IDocPageLoader b;
            ChatTabFgUtil aVar = ChatTabFgUtil.f86815a;
            Intrinsics.checkExpressionValueIsNotNull(chat, "chat");
            if (aVar.mo123640c(chat)) {
                if (!this.f86779a.f86771b) {
                    this.f86779a.mo123611j();
                }
                SpaceDependency bVar2 = (SpaceDependency) this.f86779a.mo123605b();
                if (bVar2 != null && (c = bVar2.mo123567c()) != null && (bVar = (SpaceDependency) this.f86779a.mo123605b()) != null && (b = bVar.mo123566b()) != null) {
                    b.mo124915a(c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabLazyLoadFragment
    /* renamed from: a */
    public void mo123609a(View view) {
        ISpaceDependencyViewModel bVar;
        C1177w<Chat> chat;
        super.mo123609a(view);
        SpaceDependency bVar2 = (SpaceDependency) mo123605b();
        if (bVar2 != null) {
            bVar = (ISpaceDependencyViewModel) bVar2.mo123570b(ISpaceDependencyViewModel.class);
        } else {
            bVar = null;
        }
        if (bVar != null && (chat = bVar.getChat()) != null) {
            chat.mo5923a(this, new C33689d(this));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow
    /* renamed from: a */
    public boolean mo123557a(KeyEvent keyEvent) {
        boolean z;
        IDocPageLoader b;
        Intrinsics.checkParameterIsNotNull(keyEvent, "event");
        SpaceDependency bVar = (SpaceDependency) mo123605b();
        if (bVar == null || (b = bVar.mo123566b()) == null) {
            z = false;
        } else {
            z = b.mo124916a(keyEvent);
        }
        if (z) {
            return true;
        }
        return ISpaceChatWindow.C33687a.m130584a(this, keyEvent);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabLazyLoadFragment
    /* renamed from: a */
    public View mo123584a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        ConstraintLayout constraintLayout = new ConstraintLayout(requireContext());
        constraintLayout.setId(R.id.chat_window_list_container_id);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, 0);
        layoutParams.f2825q = 0;
        layoutParams.f2827s = 0;
        layoutParams.f2816h = 0;
        layoutParams.f2819k = 0;
        constraintLayout.setLayoutParams(layoutParams);
        constraintLayout.setPadding(0, UIHelper.dp2px((float) 50) + StatusBarUtil.getStatusBarHeight(this.mContext), 0, 0);
        this.f86772d = constraintLayout;
        return constraintLayout;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IDocPageLoader b;
        super.onActivityResult(i, i2, intent);
        SpaceDependency bVar = (SpaceDependency) mo123605b();
        if (bVar != null && (b = bVar.mo123566b()) != null) {
            b.mo124912a(i, i2, intent);
        }
    }
}
