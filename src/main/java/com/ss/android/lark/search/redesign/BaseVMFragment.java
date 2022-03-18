package com.ss.android.lark.search.redesign;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import com.ss.android.lark.base.fragment.BaseFragment;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J)\u0010\u0006\u001a\u0004\u0018\u0001H\u0007\"\n\b\u0000\u0010\u0007*\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0004¢\u0006\u0002\u0010\u000bJ'\u0010\f\u001a\u0002H\u0007\"\n\b\u0000\u0010\u0007*\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0004¢\u0006\u0002\u0010\u000bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/search/redesign/BaseVMFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mActivityProvider", "Landroidx/lifecycle/ViewModelProvider;", "mFragmentProvider", "getActivityScopeViewModel", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "getFragmentScopeViewModel", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.d */
public class BaseVMFragment extends BaseFragment {

    /* renamed from: a */
    private C1144ai f132664a;

    /* renamed from: b */
    private C1144ai f132665b;

    /* renamed from: c */
    private HashMap f132666c;

    /* renamed from: g */
    public void mo183084g() {
        HashMap hashMap = this.f132666c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo183084g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T extends AbstractC1142af> T mo183296a(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "modelClass");
        if (this.f132664a == null) {
            this.f132664a = new C1144ai(this);
        }
        C1144ai aiVar = this.f132664a;
        if (aiVar == null) {
            Intrinsics.throwNpe();
        }
        return (T) aiVar.mo6005a(cls);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final <T extends AbstractC1142af> T mo183297b(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "modelClass");
        if (this.f132665b == null) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                return null;
            }
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity ?: return null");
            this.f132665b = new C1144ai(activity);
        }
        C1144ai aiVar = this.f132665b;
        if (aiVar == null) {
            Intrinsics.throwNpe();
        }
        return (T) aiVar.mo6005a(cls);
    }
}
