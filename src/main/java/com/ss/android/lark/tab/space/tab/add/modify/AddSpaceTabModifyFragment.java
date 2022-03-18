package com.ss.android.lark.tab.space.tab.add.modify;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.aj;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chatwindow.C35228b;
import com.ss.android.lark.framework.larkwidget.WidgetManager;
import com.ss.android.lark.tab.space.tab.add.list.entity.SpaceSelectViewData;
import com.ss.android.lark.tab.space.tab.add.modify.AddSpaceTabModifyView;
import com.ss.android.lark.tab.statistics.ChatTabHitPoint;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/modify/AddSpaceTabModifyFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mChatId", "", "mRootView", "Landroid/view/View;", "mSelectViewData", "Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectViewData;", "checkArguments", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.space.tab.add.modify.b */
public final class AddSpaceTabModifyFragment extends BaseFragment {

    /* renamed from: a */
    public SpaceSelectViewData f136613a;

    /* renamed from: b */
    public String f136614b;

    /* renamed from: c */
    private View f136615c;

    /* renamed from: d */
    private HashMap f136616d;

    /* renamed from: a */
    public void mo188706a() {
        HashMap hashMap = this.f136616d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo188706a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/tab/space/tab/add/modify/AddSpaceTabModifyFragment$onViewCreated$mView$1", "Lcom/ss/android/lark/tab/space/tab/add/modify/AddSpaceTabModifyView$ViewDependency;", "finish", "", "finishToChat", "id", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.modify.b$a */
    public static final class C55353a implements AddSpaceTabModifyView.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ AddSpaceTabModifyFragment f136617a;

        @Override // com.ss.android.lark.tab.space.tab.add.modify.AddSpaceTabModifyView.ViewDependency
        /* renamed from: a */
        public void mo188690a() {
            FragmentActivity activity = this.f136617a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55353a(AddSpaceTabModifyFragment bVar) {
            this.f136617a = bVar;
        }

        @Override // com.ss.android.lark.tab.space.tab.add.modify.AddSpaceTabModifyView.ViewDependency
        /* renamed from: a */
        public void mo188691a(long j) {
            C35228b.m137564a().mo121114a(this.f136617a.requireContext(), ChatBundle.m109259a().mo105927a(this.f136617a.f136614b).mo105921a(j).mo105943j(true).mo105929a());
        }
    }

    /* renamed from: b */
    private final boolean m214691b() {
        Object obj;
        Bundle arguments = getArguments();
        Object obj2 = null;
        if (arguments != null) {
            obj = arguments.get("key_select_doc");
        } else {
            obj = null;
        }
        this.f136613a = (SpaceSelectViewData) obj;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            obj2 = arguments2.get("key_chat_id");
        }
        String str = (String) obj2;
        this.f136614b = str;
        if (this.f136613a == null || str == null) {
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u0002H\u0003\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"com/ss/android/lark/tab/space/tab/add/modify/AddSpaceTabModifyFragment$onViewCreated$viewModel$1", "Landroidx/lifecycle/ViewModelProvider$Factory;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.modify.b$b */
    public static final class C55354b implements C1144ai.AbstractC1146b {

        /* renamed from: a */
        final /* synthetic */ AddSpaceTabModifyFragment f136618a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55354b(AddSpaceTabModifyFragment bVar) {
            this.f136618a = bVar;
        }

        @Override // androidx.lifecycle.C1144ai.AbstractC1146b
        public <T extends AbstractC1142af> T create(Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "modelClass");
            String str = this.f136618a.f136614b;
            if (str == null) {
                Intrinsics.throwNpe();
            }
            SpaceSelectViewData spaceSelectViewData = this.f136618a.f136613a;
            if (spaceSelectViewData == null) {
                Intrinsics.throwNpe();
            }
            return new AddSpaceModifyViewModel(str, spaceSelectViewData);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (m214691b()) {
            if (getContext() == null || this.f136615c == null) {
                finish();
                return;
            }
            AddSpaceTabModifyFragment bVar = this;
            AbstractC1142af a = aj.m5365a(bVar, new C55354b(this)).mo6005a(AddSpaceModifyViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(th…ifyViewModel::class.java)");
            AddSpaceModifyViewModel aVar = (AddSpaceModifyViewModel) a;
            Context requireContext = requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            View view2 = this.f136615c;
            if (view2 == null) {
                Intrinsics.throwNpe();
            }
            AddSpaceTabModifyView addSpaceTabModifyView = new AddSpaceTabModifyView(requireContext, view2, aVar, new C55353a(this));
            WidgetManager.f99047e.mo141218a(bVar, this.f136615c).mo141214a(addSpaceTabModifyView).mo141214a(new AddSpaceTabModifyModel(aVar));
            ChatTabHitPoint.f136619a.mo188724b();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_chat_tab_space_add_modify, viewGroup, false);
        this.f136615c = inflate;
        return inflate;
    }
}
