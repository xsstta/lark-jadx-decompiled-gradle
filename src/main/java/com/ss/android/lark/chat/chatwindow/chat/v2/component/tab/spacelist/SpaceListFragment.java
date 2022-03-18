package com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.spacelist;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponentCallbacks;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IDependencyViewModel;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ChatTabFragment;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.CommonTabDependency;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.spacelist.ISpaceListChatWindow;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.tab.space.list.CommonListTabFragment;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001 B\u0005¢\u0006\u0002\u0010\u0004J/\u0010\u000b\u001a\u0004\u0018\u0001H\f\"\u0010\b\u0000\u0010\f*\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\f0\u0010H\u0016¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u001d\u001a\u00020\u001bH\u0014J\u0012\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/spacelist/SpaceListFragment;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ChatTabFragment;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/spacelist/SpaceListFragment$SpaceListDependency;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/spacelist/ISpaceListChatWindow;", "()V", "mContainer", "Landroid/widget/FrameLayout;", "mSpaceFragment", "Lcom/ss/android/lark/tab/space/list/CommonListTabFragment;", "mTitleStateChangeListener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$OnTitleStateChangeListener;", "getComponent", "T", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "getContentView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "handleBack", "", "onContentViewCreated", "", "root", "onPageShow", "setTitleStateChangeListener", "listener", "SpaceListDependency", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.c.c */
public final class SpaceListFragment extends ChatTabFragment<SpaceListDependency> implements ISpaceListChatWindow {

    /* renamed from: b */
    public IChatTabPageSpec.OnTitleStateChangeListener f86789b;

    /* renamed from: c */
    private FrameLayout f86790c;

    /* renamed from: d */
    private CommonListTabFragment f86791d;

    /* renamed from: e */
    private HashMap f86792e;

    /* Return type fixed from 'T extends com.ss.android.lark.chat.chatwindow.chat.v2.component.f<? extends com.ss.android.lark.chat.chatwindow.chat.v2.component.g>' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Class<T extends com.ss.android.lark.chat.chatwindow.chat.v2.component.f<? extends com.ss.android.lark.chat.chatwindow.chat.v2.component.g>>] */
    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow
    /* renamed from: a */
    public <T extends IComponent<? extends IComponentCallbacks>> SpaceListFragment mo123550a(Class<SpaceListFragment> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        return null;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ChatTabFragment, com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabLazyLoadFragment
    /* renamed from: f */
    public void mo123585f() {
        HashMap hashMap = this.f86792e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow
    /* renamed from: h */
    public boolean mo121990h() {
        return false;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ChatTabFragment, com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabLazyLoadFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo123585f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J%\u0010\u0006\u001a\u0002H\u0007\"\b\b\u0000\u0010\u0007*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0016¢\u0006\u0002\u0010\u000bJ/\u0010\f\u001a\u0004\u0018\u0001H\u0007\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0016¢\u0006\u0002\u0010\u000fJ\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/spacelist/SpaceListFragment$SpaceListDependency;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/CommonTabDependency;", "commonTabDependency", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/CommonTabDependency;)V", "closePage", "", "getChatWindowViewModel", "T", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IDependencyViewModel;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IDependencyViewModel;", "getComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "getRootView", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.c.c$a */
    public static abstract class SpaceListDependency implements CommonTabDependency {

        /* renamed from: a */
        private final CommonTabDependency f86793a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.CommonTabDependency
        /* renamed from: a */
        public void mo123569a() {
            this.f86793a.mo123569a();
        }

        public SpaceListDependency(CommonTabDependency dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "commonTabDependency");
            this.f86793a = dVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.CommonTabDependency
        /* renamed from: a */
        public <T extends IComponent<? extends IComponentCallbacks>> T mo123568a(Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "clazz");
            return (T) this.f86793a.mo123568a(cls);
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.CommonTabDependency
        /* renamed from: b */
        public <T extends IDependencyViewModel> T mo123570b(Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "clazz");
            return (T) this.f86793a.mo123570b(cls);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabLazyLoadFragment
    /* renamed from: m */
    public void mo123586m() {
        super.mo123586m();
        CommonListTabFragment commonListTabFragment = this.f86791d;
        if (commonListTabFragment != null) {
            commonListTabFragment.mo188430a();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow
    /* renamed from: a */
    public void mo123554a(IChatTabPageSpec.OnTitleStateChangeListener dVar) {
        this.f86789b = dVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/tab/spacelist/SpaceListFragment$onContentViewCreated$3", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.c.c$b */
    public static final class C33693b extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ SpaceListFragment f86794a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33693b(SpaceListFragment cVar) {
            this.f86794a = cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0) {
                IChatTabPageSpec.OnTitleStateChangeListener dVar = this.f86794a.f86789b;
                if (dVar != null) {
                    dVar.mo123179a(true);
                    return;
                }
                return;
            }
            IChatTabPageSpec.OnTitleStateChangeListener dVar2 = this.f86794a.f86789b;
            if (dVar2 != null) {
                dVar2.mo123179a(false);
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow
    /* renamed from: a */
    public boolean mo123557a(KeyEvent keyEvent) {
        Intrinsics.checkParameterIsNotNull(keyEvent, "event");
        return ISpaceListChatWindow.C33692a.m130624a(this, keyEvent);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabLazyLoadFragment
    /* renamed from: a */
    public void mo123609a(View view) {
        String str;
        ISpaceListDependencyViewModel bVar;
        super.mo123609a(view);
        CommonListTabFragment commonListTabFragment = new CommonListTabFragment();
        SpaceListDependency aVar = (SpaceListDependency) mo123605b();
        if (aVar == null || (bVar = (ISpaceListDependencyViewModel) aVar.mo123570b(ISpaceListDependencyViewModel.class)) == null) {
            str = null;
        } else {
            str = bVar.getChatId();
        }
        Bundle bundle = new Bundle();
        bundle.putString("key_chat_id", str);
        bundle.putInt(ShareHitPoint.f121869d, 1);
        commonListTabFragment.setArguments(bundle);
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "this@SpaceListFragment.c…anager.beginTransaction()");
        beginTransaction.replace(R.id.chat_window_list_container_id, commonListTabFragment, (String) null);
        beginTransaction.commitAllowingStateLoss();
        IChatTabPageSpec.ContentViewCreatedCallback a = mo123601a();
        if (a != null) {
            a.mo123178a();
        }
        this.f86791d = commonListTabFragment;
        if (commonListTabFragment != null) {
            commonListTabFragment.mo188431a(new C33693b(this));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabLazyLoadFragment
    /* renamed from: a */
    public View mo123584a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setId(R.id.chat_window_list_container_id);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f86790c = frameLayout;
        return frameLayout;
    }
}
