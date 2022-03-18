package com.ss.android.lark.contact.impl.setting.one_way_contact.block_list;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.PrivacyBlockListView;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mPresenter", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListPresenter;", "mRootView", "Landroid/view/View;", "mViewDependency", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListView$ViewDependency;", "initMVP", "", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.a */
public final class PrivacyBlockListFragment extends BaseFragment {

    /* renamed from: a */
    public static final Companion f93120a = new Companion(null);

    /* renamed from: b */
    private View f93121b;

    /* renamed from: c */
    private PrivacyBlockListPresenter f93122c;

    /* renamed from: d */
    private final PrivacyBlockListView.ViewDependency f93123d = new C36029b(this);

    /* renamed from: e */
    private HashMap f93124e;

    /* renamed from: a */
    public void mo132500a() {
        HashMap hashMap = this.f93124e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo132500a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListFragment$Companion;", "", "()V", "TAG", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListFragment$mViewDependency$1", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListView$ViewDependency;", "finishPage", "", "onItemClick", "userId", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.a$b */
    public static final class C36029b implements PrivacyBlockListView.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ PrivacyBlockListFragment f93125a;

        @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.PrivacyBlockListView.ViewDependency
        /* renamed from: a */
        public void mo132501a() {
            this.f93125a.setResult(-1);
            this.f93125a.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36029b(PrivacyBlockListFragment aVar) {
            this.f93125a = aVar;
        }

        @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.PrivacyBlockListView.ViewDependency
        /* renamed from: a */
        public void mo132502a(String str) {
            AbstractC35361b a = C35358a.m138143a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ContactModule.getDependency()");
            a.mo130168m().mo130244a(this.f93125a.mContext, str, this.f93125a, UpdateDialogStatusCode.DISMISS);
        }
    }

    /* renamed from: b */
    private final void m141278b() {
        PrivacyBlockListModel bVar = new PrivacyBlockListModel();
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "this.mContext");
        View view = this.f93121b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        PrivacyBlockListPresenter cVar = new PrivacyBlockListPresenter(bVar, new PrivacyBlockListView(context, view, this.f93123d));
        this.f93122c = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        cVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        m141278b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        PrivacyBlockListPresenter cVar = this.f93122c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        cVar.mo132504a(i, i2);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.activity_privacy_contact_list, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…t_list, container, false)");
        this.f93121b = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return inflate;
    }
}
