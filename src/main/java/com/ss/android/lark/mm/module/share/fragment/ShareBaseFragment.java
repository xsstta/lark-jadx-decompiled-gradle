package com.ss.android.lark.mm.module.share.fragment;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mm.base.IFragmentManager;
import com.ss.android.lark.mm.module.share.MmShareBaseFragment;
import com.ss.android.lark.mm.module.share.adapter.UserListAdapter;
import com.ss.android.lark.mm.module.share.model.SharePermission;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u001d\u001a\u00020\u001eH\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/mm/module/share/fragment/ShareBaseFragment;", "Lcom/ss/android/lark/mm/module/share/MmShareBaseFragment;", "repoId", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/mm/module/share/fragment/FragmentType;", "allowExternalShare", "", "canTransfer", "selfPermission", "Lcom/ss/android/lark/mm/module/share/model/SharePermission;", "manager", "Lcom/ss/android/lark/mm/base/IFragmentManager;", "fromSource", "", "(Ljava/lang/String;Lcom/ss/android/lark/mm/module/share/fragment/FragmentType;ZZLcom/ss/android/lark/mm/module/share/model/SharePermission;Lcom/ss/android/lark/mm/base/IFragmentManager;I)V", "getAllowExternalShare", "()Z", "getCanTransfer", "getSelfPermission", "()Lcom/ss/android/lark/mm/module/share/model/SharePermission;", "getType", "()Lcom/ss/android/lark/mm/module/share/fragment/FragmentType;", "userAdapter", "Lcom/ss/android/lark/mm/module/share/adapter/UserListAdapter;", "getUserAdapter", "()Lcom/ss/android/lark/mm/module/share/adapter/UserListAdapter;", "setUserAdapter", "(Lcom/ss/android/lark/mm/module/share/adapter/UserListAdapter;)V", "init", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.share.fragment.d */
public class ShareBaseFragment extends MmShareBaseFragment {

    /* renamed from: a */
    private final FragmentType f118295a;

    /* renamed from: b */
    protected UserListAdapter f118296b;

    /* renamed from: c */
    private final boolean f118297c;

    /* renamed from: d */
    private final boolean f118298d;

    /* renamed from: e */
    private final SharePermission f118299e;

    /* renamed from: f */
    private HashMap f118300f;

    @Override // com.ss.android.lark.mm.base.BaseFragment, com.ss.android.lark.mm.module.share.MmShareBaseFragment
    /* renamed from: a */
    public View mo161166a(int i) {
        if (this.f118300f == null) {
            this.f118300f = new HashMap();
        }
        View view = (View) this.f118300f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f118300f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.base.BaseFragment, com.ss.android.lark.mm.module.share.MmShareBaseFragment
    /* renamed from: c */
    public void mo161170c() {
        HashMap hashMap = this.f118300f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment, com.ss.android.lark.mm.module.share.MmShareBaseFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo161170c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final UserListAdapter mo164991f() {
        UserListAdapter bVar = this.f118296b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userAdapter");
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mm.module.share.MmShareBaseFragment
    /* renamed from: e */
    public void mo163508e() {
        boolean z;
        RecyclerView recyclerView = (RecyclerView) mo161166a(R.id.rvUserList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvUserList");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView2 = (RecyclerView) mo161166a(R.id.rvUserList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rvUserList");
        recyclerView2.setItemAnimator(null);
        if (this.f118295a == FragmentType.Search) {
            z = true;
        } else {
            z = false;
        }
        this.f118296b = new UserListAdapter(mo164952i(), z, this.f118297c, this.f118298d, this.f118299e);
        RecyclerView recyclerView3 = (RecyclerView) mo161166a(R.id.rvUserList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "rvUserList");
        UserListAdapter bVar = this.f118296b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userAdapter");
        }
        recyclerView3.setAdapter(bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareBaseFragment(String str, FragmentType fragmentType, boolean z, boolean z2, SharePermission sharePermission, IFragmentManager bVar, int i) {
        super(str, bVar, i);
        Intrinsics.checkParameterIsNotNull(str, "repoId");
        Intrinsics.checkParameterIsNotNull(fragmentType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(sharePermission, "selfPermission");
        Intrinsics.checkParameterIsNotNull(bVar, "manager");
        this.f118295a = fragmentType;
        this.f118297c = z;
        this.f118298d = z2;
        this.f118299e = sharePermission;
    }
}
