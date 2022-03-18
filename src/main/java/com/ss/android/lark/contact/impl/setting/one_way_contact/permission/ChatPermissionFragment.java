package com.ss.android.lark.contact.impl.setting.one_way_contact.permission;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.contact.impl.setting.one_way_contact.permission.ChatPermissionView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\u001a\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/ChatPermissionFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mPresenter", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/ChatPermissionPresenter;", "mRootView", "Landroid/view/View;", "mViewDependency", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/ChatPermissionView$ViewDependency;", "initMVP", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.permission.a */
public final class ChatPermissionFragment extends BaseFragment {

    /* renamed from: a */
    private View f93148a;

    /* renamed from: b */
    private ChatPermissionPresenter f93149b;

    /* renamed from: c */
    private final ChatPermissionView.ViewDependency f93150c = new C36038a(this);

    /* renamed from: d */
    private HashMap f93151d;

    /* renamed from: a */
    public void mo132536a() {
        HashMap hashMap = this.f93151d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo132536a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/contact/impl/setting/one_way_contact/permission/ChatPermissionFragment$mViewDependency$1", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/ChatPermissionView$ViewDependency;", "finishPage", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.permission.a$a */
    public static final class C36038a implements ChatPermissionView.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ ChatPermissionFragment f93152a;

        @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.permission.ChatPermissionView.ViewDependency
        /* renamed from: a */
        public void mo132537a() {
            this.f93152a.setResult(-1);
            this.f93152a.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36038a(ChatPermissionFragment aVar) {
            this.f93152a = aVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        ChatPermissionPresenter cVar = this.f93149b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        cVar.destroy();
        super.onDestroy();
    }

    /* renamed from: b */
    private final void m141326b() {
        ChatPermissionModel bVar = new ChatPermissionModel();
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "this.mContext");
        View view = this.f93148a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        ChatPermissionPresenter cVar = new ChatPermissionPresenter(bVar, new ChatPermissionView(context, view, this.f93150c));
        this.f93149b = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        cVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m141326b();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.activity_chat_permission, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…ission, container, false)");
        this.f93148a = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return inflate;
    }
}
