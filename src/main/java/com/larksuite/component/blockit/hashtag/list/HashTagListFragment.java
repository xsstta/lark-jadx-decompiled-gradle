package com.larksuite.component.blockit.hashtag.list;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.hashtag.add.AddHashTagActivity;
import com.larksuite.component.blockit.hashtag.list.HashTagListView;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\"\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u0012J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/larksuite/component/blockit/hashtag/list/HashTagListFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mAddTagRequestCode", "", "mPresenter", "Lcom/larksuite/component/blockit/hashtag/list/HashTagListPresenter;", "initMVP", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Dependency", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.blockit.hashtag.list.a */
public final class HashTagListFragment extends BaseFragment {

    /* renamed from: a */
    public final int f59577a = 1;

    /* renamed from: b */
    private HashTagListPresenter f59578b;

    /* renamed from: c */
    private HashMap f59579c;

    /* renamed from: b */
    public void mo86510b() {
        HashMap hashMap = this.f59579c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo86510b();
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/larksuite/component/blockit/hashtag/list/HashTagListFragment$Dependency;", "Lcom/larksuite/component/blockit/hashtag/list/HashTagListView$ViewDependency;", "(Lcom/larksuite/component/blockit/hashtag/list/HashTagListFragment;)V", "getActivityContext", "Landroidx/fragment/app/FragmentActivity;", "startAddHashTagActivity", "", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.list.a$a */
    public final class Dependency implements HashTagListView.ViewDependency {
        @Override // com.larksuite.component.blockit.hashtag.list.HashTagListView.ViewDependency
        /* renamed from: a */
        public FragmentActivity mo86511a() {
            return HashTagListFragment.this.getActivity();
        }

        @Override // com.larksuite.component.blockit.hashtag.list.HashTagListView.ViewDependency
        /* renamed from: b */
        public void mo86512b() {
            Serializable serializable;
            String str;
            if (HashTagListFragment.this.getActivity() != null) {
                Bundle arguments = HashTagListFragment.this.getArguments();
                Serializable serializable2 = null;
                if (arguments != null) {
                    serializable = arguments.getSerializable("extra.block.entity");
                } else {
                    serializable = null;
                }
                if (serializable != null) {
                    BlockEntity blockEntity = (BlockEntity) serializable;
                    Bundle arguments2 = HashTagListFragment.this.getArguments();
                    if (arguments2 != null) {
                        str = arguments2.getString("extra.context.json");
                    } else {
                        str = null;
                    }
                    Bundle arguments3 = HashTagListFragment.this.getArguments();
                    if (arguments3 != null) {
                        serializable2 = arguments3.getSerializable("extra.hit_point.params");
                    }
                    if (blockEntity != null) {
                        Intent putExtra = new Intent(HashTagListFragment.this.getContext(), AddHashTagActivity.class).putExtra("extra.block.entity", blockEntity).putExtra("extra.context.json", str).putExtra("extra.hit_point.params", serializable2);
                        Intrinsics.checkExpressionValueIsNotNull(putExtra, "Intent(context, AddHashT…T_PARAMS, hitPointParams)");
                        HashTagListFragment aVar = HashTagListFragment.this;
                        aVar.startActivityForResult(putExtra, aVar.f59577a);
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.blockit.entity.BlockEntity");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public Dependency() {
        }
    }

    /* renamed from: a */
    public final boolean mo86509a() {
        HashTagListPresenter cVar = this.f59578b;
        if (cVar != null) {
            return cVar.mo86521b();
        }
        return false;
    }

    /* renamed from: c */
    private final void m88034c() {
        Serializable serializable;
        String str;
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
            if (serializable != null) {
                BlockEntity blockEntity = (BlockEntity) serializable;
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    str = arguments2.getString("extra.context.json");
                } else {
                    str = null;
                }
                Bundle arguments3 = getArguments();
                if (arguments3 != null) {
                    obj = arguments3.get("extra.hit_point.params");
                }
                Map map = (Map) obj;
                if (map != null) {
                    hashMap = map;
                } else {
                    hashMap = new HashMap();
                }
                if (blockEntity != null) {
                    Intrinsics.checkExpressionValueIsNotNull(view, "it");
                    HashTagListPresenter cVar = new HashTagListPresenter(view, new Dependency(), blockEntity, str, hashMap);
                    this.f59578b = cVar;
                    if (cVar != null) {
                        cVar.create();
                        return;
                    }
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.blockit.entity.BlockEntity");
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m88034c();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_hash_tag_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        HashTagListPresenter cVar;
        super.onActivityResult(i, i2, intent);
        if (i == this.f59577a && i2 == -1 && (cVar = this.f59578b) != null) {
            cVar.mo86519a(i, i2, intent);
        }
    }
}
