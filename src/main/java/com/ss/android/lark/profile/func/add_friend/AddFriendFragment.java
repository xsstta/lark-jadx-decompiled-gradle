package com.ss.android.lark.profile.func.add_friend;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.profile.func.add_friend.AddFriendView;
import com.ss.android.lark.profile.statistics.UserProfileHitPointV3;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/profile/func/add_friend/AddFriendFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mPresenter", "Lcom/ss/android/lark/profile/func/add_friend/AddFriendPresenter;", "getViewDependency", "Lcom/ss/android/lark/profile/func/add_friend/AddFriendView$IAddFriendViewDependency;", "initMVP", "", "rootView", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.add_friend.a */
public final class AddFriendFragment extends BaseFragment {

    /* renamed from: a */
    public static final Companion f129612a = new Companion(null);

    /* renamed from: b */
    private AddFriendPresenter f129613b;

    /* renamed from: c */
    private HashMap f129614c;

    /* renamed from: a */
    public void mo179052a() {
        HashMap hashMap = this.f129614c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo179052a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/profile/func/add_friend/AddFriendFragment$Companion;", "", "()V", "TAG", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.add_friend.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/profile/func/add_friend/AddFriendFragment$getViewDependency$1", "Lcom/ss/android/lark/profile/func/add_friend/AddFriendView$IAddFriendViewDependency;", "finishForResult", "", "alias", "", "finishFragment", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.add_friend.a$b */
    public static final class C52262b implements AddFriendView.IAddFriendViewDependency {

        /* renamed from: a */
        final /* synthetic */ AddFriendFragment f129615a;

        @Override // com.ss.android.lark.profile.func.add_friend.AddFriendView.IAddFriendViewDependency
        /* renamed from: a */
        public void mo179053a() {
            this.f129615a.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52262b(AddFriendFragment aVar) {
            this.f129615a = aVar;
        }

        @Override // com.ss.android.lark.profile.func.add_friend.AddFriendView.IAddFriendViewDependency
        /* renamed from: a */
        public void mo179054a(String str) {
            Intent intent = new Intent();
            intent.putExtra("key_result_alias", str);
            this.f129615a.setResult(-1, intent);
            this.f129615a.finish();
        }
    }

    /* renamed from: b */
    private final AddFriendView.IAddFriendViewDependency m202799b() {
        return new C52262b(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        AddFriendPresenter cVar = this.f129613b;
        if (cVar != null) {
            cVar.destroy();
        }
        super.onDestroy();
    }

    /* renamed from: a */
    private final void m202798a(View view) {
        String str;
        String str2;
        String str3;
        Serializable serializable;
        boolean z;
        boolean z2;
        Bundle arguments = getArguments();
        String str4 = null;
        if (arguments != null) {
            str = arguments.getString("param_key_user_id");
        } else {
            str = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("param_key_token");
        } else {
            str2 = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str3 = arguments3.getString("param_key_chat_id");
        } else {
            str3 = null;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            serializable = arguments4.getSerializable("param_key_source");
        } else {
            serializable = null;
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            str4 = arguments5.getString("param_key_user_name");
        }
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            z = arguments6.getBoolean("param_key_is_has_tenant_certification");
        } else {
            z = false;
        }
        Bundle arguments7 = getArguments();
        if (arguments7 != null) {
            z2 = arguments7.getBoolean("param_key_is_tenant_certification");
        } else {
            z2 = false;
        }
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                if (serializable != null) {
                    Intrinsics.checkExpressionValueIsNotNull(activity, "it");
                    AddFriendPresenter cVar = new AddFriendPresenter(new AddFriendModel(str, str2, str3, (ContactSource) serializable, str4, z, z2), new AddFriendView(activity, view, m202799b()));
                    this.f129613b = cVar;
                    if (cVar != null) {
                        cVar.create();
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.biz.core.api.ContactSource");
                }
            }
            UserProfileHitPointV3.f130746c.mo180579c(z, z2);
            return;
        }
        Log.m165383e(this.TAG, "userId and token are null");
        finish();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        C48211b.m190251a().mo168689b("onCreateView");
        View inflate = layoutInflater.inflate(R.layout.activity_add_friend, viewGroup, false);
        C48211b.m190251a().mo168691c("onCreateView");
        C48211b.m190251a().mo168689b("initMVP");
        Intrinsics.checkExpressionValueIsNotNull(inflate, "rootView");
        m202798a(inflate);
        C48211b.m190251a().mo168691c("initMVP");
        return inflate;
    }
}
