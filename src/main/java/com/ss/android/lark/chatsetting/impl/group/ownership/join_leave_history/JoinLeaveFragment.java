package com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.JoinLeaveHistoryView;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001a\u001a\u00020\fH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mDependency", "Lcom/ss/android/lark/chatsetting/dependency/IChatSettingModuleDependency;", "kotlin.jvm.PlatformType", "mPresenter", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveHistoryPresenter;", "mViewDependency", "com/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveFragment$mViewDependency$1", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveFragment$mViewDependency$1;", "initMvp", "", "chatId", "", "isThread", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.c */
public final class JoinLeaveFragment extends BaseFragment {

    /* renamed from: a */
    public final AbstractC34461c f89700a = ChatSettingModule.m133639a();

    /* renamed from: b */
    private JoinLeaveHistoryPresenter f89701b;

    /* renamed from: c */
    private final C34726a f89702c = new C34726a(this);

    /* renamed from: d */
    private HashMap f89703d;

    /* renamed from: a */
    public View mo128248a(int i) {
        if (this.f89703d == null) {
            this.f89703d = new HashMap();
        }
        View view = (View) this.f89703d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f89703d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo128249a() {
        HashMap hashMap = this.f89703d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveFragment$mViewDependency$1", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveHistoryView$ViewDependency;", "finish", "", "goToBotProfile", "botId", "", "goToChatProfile", "chatId", "goToUserProfile", "userId", "openChat", "openDocUrl", "url", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.c$a */
    public static final class C34726a implements JoinLeaveHistoryView.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ JoinLeaveFragment f89704a;

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.JoinLeaveHistoryView.ViewDependency
        /* renamed from: a */
        public void mo128250a() {
            this.f89704a.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34726a(JoinLeaveFragment cVar) {
            this.f89704a = cVar;
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.JoinLeaveHistoryView.ViewDependency
        /* renamed from: a */
        public void mo128251a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            AbstractC34461c cVar = this.f89704a.f89700a;
            Intrinsics.checkExpressionValueIsNotNull(cVar, "mDependency");
            cVar.mo127280j().mo127428b(this.f89704a.getActivity(), str);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.JoinLeaveHistoryView.ViewDependency
        /* renamed from: b */
        public void mo128252b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            AbstractC34461c cVar = this.f89704a.f89700a;
            Intrinsics.checkExpressionValueIsNotNull(cVar, "mDependency");
            cVar.mo127280j().mo127429c(this.f89704a.getActivity(), str);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.JoinLeaveHistoryView.ViewDependency
        /* renamed from: c */
        public void mo128253c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            AbstractC34461c cVar = this.f89704a.f89700a;
            Intrinsics.checkExpressionValueIsNotNull(cVar, "mDependency");
            cVar.mo127274d().mo127318a(this.f89704a.getActivity(), str);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.JoinLeaveHistoryView.ViewDependency
        /* renamed from: d */
        public void mo128254d(String str) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            this.f89704a.f89700a.mo127271b(this.f89704a.getActivity(), str);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.JoinLeaveHistoryView.ViewDependency
        /* renamed from: e */
        public void mo128255e(String str) {
            Intrinsics.checkParameterIsNotNull(str, "botId");
            AbstractC34461c cVar = this.f89704a.f89700a;
            Intrinsics.checkExpressionValueIsNotNull(cVar, "mDependency");
            cVar.mo127280j().mo127423a(this.f89704a.getActivity(), str);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        JoinLeaveHistoryPresenter eVar = this.f89701b;
        if (eVar != null) {
            eVar.destroy();
        }
        super.onDestroyView();
        mo128249a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        String str;
        boolean z;
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("param_chat_id")) == null) {
            str = "";
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z = arguments2.getBoolean("param_is_thread");
        } else {
            z = false;
        }
        m135030a(str, z);
    }

    /* renamed from: a */
    private final void m135030a(String str, boolean z) {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
        FragmentActivity fragmentActivity = requireActivity;
        ConstraintLayout constraintLayout = (ConstraintLayout) mo128248a(R.id.mRootView);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "mRootView");
        JoinLeaveHistoryPresenter eVar = new JoinLeaveHistoryPresenter(fragmentActivity, constraintLayout, str, z, this.f89702c);
        this.f89701b = eVar;
        if (eVar != null) {
            eVar.create();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.join_leave_history_layout, viewGroup, false);
    }
}
