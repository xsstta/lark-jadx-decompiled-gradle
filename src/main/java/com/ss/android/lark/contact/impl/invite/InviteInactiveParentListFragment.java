package com.ss.android.lark.contact.impl.invite;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.contact.impl.invite.InviteInactiveParentListView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/contact/impl/invite/InviteInactiveParentListFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mPresenter", "Lcom/ss/android/lark/contact/impl/invite/InviteInactiveParentListPresenter;", "mRootView", "Landroid/view/View;", "mViewDependency", "Lcom/ss/android/lark/contact/impl/invite/InviteInactiveParentListView$ViewDependency;", "initMVP", "", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.invite.b */
public final class InviteInactiveParentListFragment extends BaseFragment {

    /* renamed from: a */
    public static final Companion f92937a = new Companion(null);

    /* renamed from: b */
    private View f92938b;

    /* renamed from: c */
    private InviteInactiveParentListPresenter f92939c;

    /* renamed from: d */
    private final InviteInactiveParentListView.ViewDependency f92940d = new C35943b(this);

    /* renamed from: e */
    private HashMap f92941e;

    /* renamed from: a */
    public void mo132270a() {
        HashMap hashMap = this.f92941e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo132270a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/contact/impl/invite/InviteInactiveParentListFragment$Companion;", "", "()V", "TAG", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.invite.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/contact/impl/invite/InviteInactiveParentListFragment$mViewDependency$1", "Lcom/ss/android/lark/contact/impl/invite/InviteInactiveParentListView$ViewDependency;", "finishPage", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.invite.b$b */
    public static final class C35943b implements InviteInactiveParentListView.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ InviteInactiveParentListFragment f92942a;

        @Override // com.ss.android.lark.contact.impl.invite.InviteInactiveParentListView.ViewDependency
        /* renamed from: a */
        public void mo132271a() {
            this.f92942a.setResult(-1);
            this.f92942a.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35943b(InviteInactiveParentListFragment bVar) {
            this.f92942a = bVar;
        }
    }

    /* renamed from: b */
    private final void m140904b() {
        String str;
        String str2;
        String str3;
        Intent intent;
        Intent intent2;
        Intent intent3;
        Intent intent4;
        FragmentActivity activity = getActivity();
        Integer num = null;
        if (activity == null || (intent4 = activity.getIntent()) == null) {
            str = null;
        } else {
            str = intent4.getStringExtra("key_department_id");
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 == null || (intent3 = activity2.getIntent()) == null) {
            str2 = null;
        } else {
            str2 = intent3.getStringExtra("key_chatter_id");
        }
        FragmentActivity activity3 = getActivity();
        if (activity3 == null || (intent2 = activity3.getIntent()) == null) {
            str3 = null;
        } else {
            str3 = intent2.getStringExtra("key_sub_title");
        }
        FragmentActivity activity4 = getActivity();
        if (!(activity4 == null || (intent = activity4.getIntent()) == null)) {
            num = Integer.valueOf(intent.getIntExtra("key_inactiveParentCount", 0));
        }
        InviteInactiveParentListModel cVar = new InviteInactiveParentListModel();
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "this.mContext");
        View view = this.f92938b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        InviteInactiveParentListPresenter dVar = new InviteInactiveParentListPresenter(str, str2, cVar, new InviteInactiveParentListView(context, view, str, str2, str3, num, this.f92940d));
        this.f92939c = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        dVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        m140904b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InviteInactiveParentListPresenter dVar = this.f92939c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        dVar.mo132273a(i, i2);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.activity_invite_inactive_parent_list, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…t_list, container, false)");
        this.f92938b = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return inflate;
    }
}
