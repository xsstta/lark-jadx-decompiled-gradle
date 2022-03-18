package com.ss.android.lark.tab.space.tab.add.list;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.aj;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.framework.larkwidget.WidgetManager;
import com.ss.android.lark.tab.space.tab.add.common.AddSpacePageLauncher;
import com.ss.android.lark.tab.space.tab.add.list.AddSpaceListView;
import com.ss.android.lark.tab.space.tab.add.list.entity.SpaceSelectViewData;
import com.ss.android.lark.tab.statistics.ChatTabHitPoint;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceTabListFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mModel", "Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceListModel;", "mRootView", "Landroid/view/View;", "mView", "Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceListView;", "viewModelProvider", "Landroidx/lifecycle/ViewModelProvider;", "getViewModelProvider", "()Landroidx/lifecycle/ViewModelProvider;", "viewModelProvider$delegate", "Lkotlin/Lazy;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.space.tab.add.list.c */
public final class AddSpaceTabListFragment extends BaseFragment {

    /* renamed from: a */
    private View f136571a;

    /* renamed from: b */
    private final Lazy f136572b = LazyKt.lazy(new C55342b(this));

    /* renamed from: c */
    private AddSpaceListView f136573c;

    /* renamed from: d */
    private AddSpaceListModel f136574d;

    /* renamed from: e */
    private HashMap f136575e;

    /* renamed from: b */
    private final C1144ai m214634b() {
        return (C1144ai) this.f136572b.getValue();
    }

    /* renamed from: a */
    public void mo188616a() {
        HashMap hashMap = this.f136575e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo188616a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/tab/space/tab/add/list/AddSpaceTabListFragment$onViewCreated$1", "Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceListView$ViewDependency;", "finish", "", "onItemClick", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectViewData;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.c$a */
    public static final class C55341a implements AddSpaceListView.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ AddSpaceTabListFragment f136576a;

        /* renamed from: b */
        final /* synthetic */ String f136577b;

        @Override // com.ss.android.lark.tab.space.tab.add.list.AddSpaceListView.ViewDependency
        /* renamed from: a */
        public void mo188584a() {
            FragmentActivity activity = this.f136576a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }

        @Override // com.ss.android.lark.tab.space.tab.add.list.AddSpaceListView.ViewDependency
        /* renamed from: a */
        public void mo188585a(SpaceSelectViewData spaceSelectViewData) {
            Intrinsics.checkParameterIsNotNull(spaceSelectViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Context context = this.f136576a.getContext();
            if (context == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
            AddSpacePageLauncher.m214565a(context, this.f136577b, spaceSelectViewData);
        }

        C55341a(AddSpaceTabListFragment cVar, String str) {
            this.f136576a = cVar;
            this.f136577b = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.c$b */
    static final class C55342b extends Lambda implements Function0<C1144ai> {
        final /* synthetic */ AddSpaceTabListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55342b(AddSpaceTabListFragment cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C1144ai invoke() {
            return aj.m5365a(this.this$0, new C1144ai.AbstractC1146b() {
                /* class com.ss.android.lark.tab.space.tab.add.list.AddSpaceTabListFragment.C55342b.C553431 */

                @Override // androidx.lifecycle.C1144ai.AbstractC1146b
                public <T extends AbstractC1142af> T create(Class<T> cls) {
                    Intrinsics.checkParameterIsNotNull(cls, "modelClass");
                    return new AddSpaceListViewModel();
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object obj;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        AbstractC1142af a = m214634b().mo6005a(AddSpaceListViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "viewModelProvider.get(Ad…istViewModel::class.java)");
        AddSpaceListViewModel bVar = (AddSpaceListViewModel) a;
        Bundle arguments = getArguments();
        if (arguments != null) {
            obj = arguments.get("key_chat_id");
        } else {
            obj = null;
        }
        String str = (String) obj;
        if (getContext() == null) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        } else if (this.f136571a == null || str == null) {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        } else {
            Context context = getContext();
            if (context == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
            View view2 = this.f136571a;
            if (view2 == null) {
                Intrinsics.throwNpe();
            }
            this.f136573c = new AddSpaceListView(context, view2, bVar, new C55341a(this, str));
            this.f136574d = new AddSpaceListModel(bVar);
            WidgetManager a2 = WidgetManager.Companion.m151976a(WidgetManager.f99047e, this, null, 2, null);
            AddSpaceListView addSpaceListView = this.f136573c;
            if (addSpaceListView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mView");
            }
            WidgetManager a3 = a2.mo141214a(addSpaceListView);
            AddSpaceListModel addSpaceListModel = this.f136574d;
            if (addSpaceListModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mModel");
            }
            a3.mo141214a(addSpaceListModel);
            AddSpaceListModel addSpaceListModel2 = this.f136574d;
            if (addSpaceListModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mModel");
            }
            addSpaceListModel2.mo188564a();
            ChatTabHitPoint.f136619a.mo188720a();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_chat_tab_space_add_list, viewGroup, false);
        this.f136571a = inflate;
        return inflate;
    }
}
