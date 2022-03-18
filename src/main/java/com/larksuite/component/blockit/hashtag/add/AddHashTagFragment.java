package com.larksuite.component.blockit.hashtag.add;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.hashtag.add.AddHashTagView;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\"\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0006\u0010\u0010\u001a\u00020\u0011J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/larksuite/component/blockit/hashtag/add/AddHashTagFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mPresenter", "Lcom/larksuite/component/blockit/hashtag/add/AddHashTagPresenter;", "initMVP", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Dependency", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.blockit.hashtag.add.a */
public final class AddHashTagFragment extends BaseFragment {

    /* renamed from: a */
    private AddHashTagPresenter f59521a;

    /* renamed from: b */
    private HashMap f59522b;

    /* renamed from: b */
    public void mo86447b() {
        HashMap hashMap = this.f59522b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo86447b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/larksuite/component/blockit/hashtag/add/AddHashTagFragment$Dependency;", "Lcom/larksuite/component/blockit/hashtag/add/AddHashTagView$ViewDependency;", "(Lcom/larksuite/component/blockit/hashtag/add/AddHashTagFragment;)V", "getActivity", "Landroidx/fragment/app/FragmentActivity;", "getFragmentManager", "Landroidx/fragment/app/FragmentManager;", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.add.a$a */
    public final class Dependency implements AddHashTagView.ViewDependency {
        @Override // com.larksuite.component.blockit.hashtag.add.AddHashTagView.ViewDependency
        /* renamed from: a */
        public FragmentActivity mo86448a() {
            return AddHashTagFragment.this.getActivity();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public Dependency() {
        }
    }

    /* renamed from: a */
    public final boolean mo86446a() {
        AddHashTagPresenter cVar = this.f59521a;
        if (cVar != null) {
            return cVar.mo86460b();
        }
        return false;
    }

    /* renamed from: c */
    private final void m87961c() {
        Serializable serializable;
        String str;
        String str2;
        HashMap hashMap;
        View view = getView();
        if (view != null) {
            Bundle arguments = getArguments();
            Object obj = null;
            if (arguments != null) {
                serializable = arguments.getSerializable("extra.block.entity");
            } else {
                serializable = null;
            }
            if (!(serializable instanceof BlockEntity)) {
                serializable = null;
            }
            BlockEntity blockEntity = (BlockEntity) serializable;
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                str = arguments2.getString("extra.context.json");
            } else {
                str = null;
            }
            Bundle arguments3 = getArguments();
            boolean z = true;
            if (arguments3 != null) {
                z = arguments3.getBoolean("extra.is.add.hash.tag", true);
            }
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                str2 = arguments4.getString("extra.user.id");
            } else {
                str2 = null;
            }
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                obj = arguments5.get("extra.hit_point.params");
            }
            Map map = (Map) obj;
            if (map != null) {
                hashMap = map;
            } else {
                hashMap = new HashMap();
            }
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            AddHashTagPresenter cVar = new AddHashTagPresenter(view, new Dependency(), blockEntity, z, str, str2, hashMap);
            this.f59521a = cVar;
            if (cVar != null) {
                cVar.create();
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m87961c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AddHashTagPresenter cVar = this.f59521a;
        if (cVar != null) {
            cVar.mo86459a(i, i2, intent);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_add_hash_tag, viewGroup, false);
    }
}
