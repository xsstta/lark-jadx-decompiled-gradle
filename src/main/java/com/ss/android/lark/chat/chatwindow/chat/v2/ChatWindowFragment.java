package com.ss.android.lark.chat.chatwindow.chat.v2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.base.p1400a.C29520a;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowAppV2;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowAppExtend;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.WidgetViewModelKeyManager;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.util.ChatTabFgUtil;
import com.ss.android.lark.chatwindow.view.WindowDialogManager;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.C36529b;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.framework.larkwidget.WidgetManager;
import com.ss.android.lark.keyboard.plugin.tool.voice.statistics.AppreciablePerformance;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.statistics.PerfLog;
import com.ss.android.lark.widget.ILifeCycleEventObserve;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0011J\u001a\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\"\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010#\u001a\u00020\bH\u0016J\u0012\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010&\u001a\u00020\bH\u0016J\b\u0010'\u001a\u00020\bH\u0016J\u001a\u0010(\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010)\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u001bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/ChatWindowFragment;", "Lcom/ss/android/lark/base/frame/FrameFragment;", "()V", "chatWindowApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowAppExtend;", "rootView", "Landroid/view/View;", "closePageDesktop", "", "context", "Landroid/content/Context;", "dispatchTouchEvent", "", "event", "Landroid/view/MotionEvent;", "handleBack", "handleKeyEvent", "Landroid/view/KeyEvent;", "initChatApp", "view", "argument", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onFragmentBringToFront", "onNewIntent", "intent", "onResume", "onStop", "onViewCreated", "reload", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.a */
public final class ChatWindowFragment extends C29520a {

    /* renamed from: c */
    public static final Companion f86129c = new Companion(null);

    /* renamed from: b */
    public View f86130b;

    /* renamed from: d */
    private IChatWindowAppExtend f86131d;

    /* renamed from: e */
    private HashMap f86132e;

    /* renamed from: e */
    public void mo122996e() {
        HashMap hashMap = this.f86132e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo122996e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/ChatWindowFragment$Companion;", "", "()V", "instance", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/ChatWindowFragment;", "bundle", "Landroid/os/Bundle;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ChatWindowFragment mo122998a(Bundle bundle) {
            ChatWindowFragment aVar = new ChatWindowFragment();
            if (bundle == null) {
                bundle = new Bundle();
            }
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J,\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0012"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/ChatWindowFragment$initChatApp$viewDependence$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$IViewDependence;", "closePage", "", "getBaseFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "getFragmentManager", "Landroidx/fragment/app/FragmentManager;", "openNewChat", "chatId", "", "contactsToApply", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/contact/entity/Contact;", "Lkotlin/collections/ArrayList;", "triggerEventChanged", "eventName", "Lcom/ss/android/lark/widget/ILifeCycleEventObserve$Event;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.a$b */
    public static final class C33425b implements ChatWindowApp.IViewDependence {

        /* renamed from: a */
        final /* synthetic */ ChatWindowFragment f86133a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp.IViewDependence
        /* renamed from: b */
        public BaseFragment mo123001b() {
            return this.f86133a;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp.IViewDependence
        /* renamed from: a */
        public FragmentManager mo122999a() {
            FragmentManager childFragmentManager = this.f86133a.getChildFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(childFragmentManager, "childFragmentManager");
            return childFragmentManager;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.a$b$a */
        static final class RunnableC33426a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33425b f86134a;

            /* renamed from: b */
            final /* synthetic */ Activity f86135b;

            RunnableC33426a(C33425b bVar, Activity activity) {
                this.f86134a = bVar;
                this.f86135b = activity;
            }

            public final void run() {
                Activity activity = this.f86135b;
                if (activity != null) {
                    activity.onBackPressed();
                }
                this.f86134a.f86133a.mo122994a(this.f86134a.f86133a.getContext());
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp.IViewDependence
        /* renamed from: c */
        public void mo123002c() {
            FragmentActivity activity = this.f86133a.getActivity();
            if (activity != null && KeyboardUtils.isSoftShowing(activity)) {
                KeyboardUtils.hideKeyboard(activity);
            }
            ChatWindowFragment.m129518a(this.f86133a).postDelayed(new RunnableC33426a(this, activity), 50);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33425b(ChatWindowFragment aVar) {
            this.f86133a = aVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp.IViewDependence
        /* renamed from: a */
        public void mo123000a(ILifeCycleEventObserve.Event event) {
            Intrinsics.checkParameterIsNotNull(event, "eventName");
            FragmentActivity activity = this.f86133a.getActivity();
            if (activity instanceof ILifeCycleEventObserve.AbstractC58308a) {
                ((ILifeCycleEventObserve.AbstractC58308a) activity).mo103142a(event);
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a
    public void onFragmentBringToFront() {
        super.onFragmentBringToFront();
        IChatWindowAppExtend eVar = this.f86131d;
        if (eVar != null) {
            eVar.mo123141l();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        AppreciablePerformance.f104480a.mo147948f();
    }

    @Override // com.ss.android.lark.base.p1400a.C29520a
    /* renamed from: a */
    public boolean mo104599a() {
        IChatWindowAppExtend eVar = this.f86131d;
        if (eVar != null) {
            return eVar.mo123139j();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134577e().mo120980k();
        PerfLog.end("showChatFragment", "");
        AbstractC36474h b2 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
        b2.ad().mo134633b();
    }

    /* renamed from: a */
    public static final /* synthetic */ View m129518a(ChatWindowFragment aVar) {
        View view = aVar.f86130b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return view;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WidgetViewModelKeyManager.f86344a.mo123199a();
    }

    /* renamed from: b */
    public final boolean mo122995b(KeyEvent keyEvent) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(keyEvent, "event");
        IChatWindowAppExtend eVar = this.f86131d;
        if (eVar != null) {
            z = eVar.mo123132a(keyEvent);
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.base.p1400a.C29520a
    /* renamed from: a */
    public boolean mo104600a(MotionEvent motionEvent) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        IChatWindowAppExtend eVar = this.f86131d;
        if (eVar != null) {
            z = eVar.mo123133a(motionEvent);
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return super.mo104600a(motionEvent);
    }

    /* renamed from: b */
    private final void m129520b(Intent intent) {
        Log.m165389i("ChatWindowLog", "reload complete");
        IChatWindowAppExtend eVar = this.f86131d;
        Bundle bundle = null;
        if (eVar != null) {
            eVar.mo122001r();
            WidgetManager a = WidgetManager.Companion.m151976a(WidgetManager.f99047e, this, null, 2, null);
            if (eVar != null) {
                a.mo141217b((Widget) eVar);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.framework.larkwidget.Widget");
            }
        }
        WindowDialogManager.f91123a.mo129818a();
        WidgetViewModelKeyManager.f86344a.mo123200b();
        View view = this.f86130b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        if (intent != null) {
            bundle = intent.getExtras();
        }
        m129519a(view, bundle);
    }

    /* renamed from: a */
    public final void mo122994a(Context context) {
        if (context != null && DesktopUtil.m144301a(context)) {
            C36529b bVar = new C36529b();
            Bundle bundle = new Bundle();
            bundle.putInt("holder", R.drawable.empty_default_icon);
            bVar.setArguments(bundle);
            C36512a.m144041a().mo134763a(bVar, new MainWindowParams.C36570a(ContainerType.Right).mo134958a("conversation").mo134930b());
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134512K().mo134687a(this.mContext, (String) null);
        }
    }

    @Override // com.ss.android.lark.base.p1400a.C29520a
    /* renamed from: a */
    public void mo104596a(Intent intent) {
        Integer num;
        Bundle extras;
        super.mo104596a(intent);
        Log.m165389i("ChatWindowLog", "onNewIntent");
        IChatWindowAppExtend eVar = this.f86131d;
        if (eVar != null) {
            num = Integer.valueOf(eVar.mo123120a(intent));
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 3) {
            if (intent != null && (extras = intent.getExtras()) != null) {
                ChatBundle a = ChatBundle.m109260a(extras);
                IChatWindowAppExtend eVar2 = this.f86131d;
                if (eVar2 != null) {
                    Intrinsics.checkExpressionValueIsNotNull(a, "chatBundle");
                    eVar2.mo123124a(a);
                }
            }
        } else if (num != null && num.intValue() == 2) {
            m129520b(intent);
        } else if (num != null && num.intValue() == 1) {
            Log.m165389i("ChatWindowLog", "onNewIntent purpose unknown");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m129519a(view, getArguments());
    }

    /* renamed from: a */
    private final void m129519a(View view, Bundle bundle) {
        ChatWindowAppV2 chatWindowAppV2;
        C33425b bVar = new C33425b(this);
        if (bundle != null) {
            ChatBundle a = ChatBundle.m109260a(bundle);
            if (!ChatTabFgUtil.f86815a.mo123638a(a.f74037k)) {
                Intrinsics.checkExpressionValueIsNotNull(a, "chatBundle");
                ChatWindowApp chatWindowApp = new ChatWindowApp(a, bVar);
                WidgetManager.Companion aVar = WidgetManager.f99047e;
                ChatWindowFragment aVar2 = this;
                View view2 = this.f86130b;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rootView");
                }
                aVar.mo141218a(aVar2, view2).mo141213a(R.id.chat_window_root_container, (Widget) chatWindowApp, false);
                chatWindowAppV2 = chatWindowApp;
            } else {
                Intrinsics.checkExpressionValueIsNotNull(a, "chatBundle");
                ChatWindowAppV2 chatWindowAppV22 = new ChatWindowAppV2(a, bVar);
                WidgetManager.Companion aVar3 = WidgetManager.f99047e;
                ChatWindowFragment aVar4 = this;
                View view3 = this.f86130b;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rootView");
                }
                aVar3.mo141218a(aVar4, view3).mo141213a(R.id.chat_window_root_container, (Widget) chatWindowAppV22, false);
                chatWindowAppV2 = chatWindowAppV22;
            }
            this.f86131d = chatWindowAppV2;
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134512K().mo134687a(this.mContext, a.f74027a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        IChatWindowAppExtend eVar = this.f86131d;
        if (eVar != null) {
            eVar.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        PerfLog.start("chat_fragment_inflate", "");
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setId(R.id.chat_window_root_container);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f86130b = frameLayout;
        PerfLog.end("chat_fragment_inflate", "");
        View view = this.f86130b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return view;
    }
}
