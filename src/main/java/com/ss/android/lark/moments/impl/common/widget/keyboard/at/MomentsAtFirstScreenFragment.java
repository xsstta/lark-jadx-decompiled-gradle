package com.ss.android.lark.moments.impl.common.widget.keyboard.at;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1067t;
import androidx.lifecycle.AbstractC1178x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.moments.impl.common.widget.keyboard.at.MomentsAtAdapter;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u000e\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\nR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsAtFirstScreenFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mAdapter", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsAtAdapter;", "getMAdapter", "()Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsAtAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mSelectListener", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsAtAdapter$IAtUserClickListener;", "mViewModel", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsAtFirstScreenViewModel;", "getMViewModel", "()Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsAtFirstScreenViewModel;", "mViewModel$delegate", "initRecyclerView", "", "initViewModel", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setSelectListener", "listener", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.at.d */
public final class MomentsAtFirstScreenFragment extends BaseFragment {

    /* renamed from: a */
    public MomentsAtAdapter.IAtUserClickListener f119320a;

    /* renamed from: b */
    private final Lazy f119321b = C1067t.m5172a(this, Reflection.getOrCreateKotlinClass(MomentsAtFirstScreenViewModel.class), new MomentsAtFirstScreenFragment$$special$$inlined$viewModels$2(new MomentsAtFirstScreenFragment$$special$$inlined$viewModels$1(this)), null);

    /* renamed from: c */
    private final Lazy f119322c = LazyKt.lazy(new C47306b(this));

    /* renamed from: d */
    private HashMap f119323d;

    /* renamed from: c */
    private final MomentsAtFirstScreenViewModel m187362c() {
        return (MomentsAtFirstScreenViewModel) this.f119321b.getValue();
    }

    /* renamed from: a */
    public View mo166281a(int i) {
        if (this.f119323d == null) {
            this.f119323d = new HashMap();
        }
        View view = (View) this.f119323d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f119323d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final MomentsAtAdapter mo166282a() {
        return (MomentsAtAdapter) this.f119322c.getValue();
    }

    /* renamed from: b */
    public void mo166284b() {
        HashMap hashMap = this.f119323d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo166284b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsAtAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.at.d$b */
    static final class C47306b extends Lambda implements Function0<MomentsAtAdapter> {
        final /* synthetic */ MomentsAtFirstScreenFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47306b(MomentsAtFirstScreenFragment dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsAtAdapter invoke() {
            Context context = this.this$0.mContext;
            Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
            return new MomentsAtAdapter(context, new MomentsAtAdapter.IAtUserClickListener(this) {
                /* class com.ss.android.lark.moments.impl.common.widget.keyboard.at.MomentsAtFirstScreenFragment.C47306b.C473071 */

                /* renamed from: a */
                final /* synthetic */ C47306b f119325a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f119325a = r1;
                }

                @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.at.MomentsAtAdapter.IAtUserClickListener
                /* renamed from: a */
                public void mo166280a(String str, String str2) {
                    Intrinsics.checkParameterIsNotNull(str, "userId");
                    Intrinsics.checkParameterIsNotNull(str2, "userName");
                    MomentsAtAdapter.IAtUserClickListener aVar = this.f119325a.this$0.f119320a;
                    if (aVar != null) {
                        aVar.mo166280a(str, str2);
                    }
                }
            });
        }
    }

    /* renamed from: e */
    private final void m187364e() {
        m187362c().getDataList().mo5923a(getViewLifecycleOwner(), new C47305a(this));
        m187362c().loadRecommendUserList();
    }

    /* renamed from: d */
    private final void m187363d() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.mContext, 1, false);
        linearLayoutManager.setRecycleChildrenOnDetach(true);
        RecyclerView recyclerView = (RecyclerView) mo166281a(R.id.recycler);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recycler");
        recyclerView.setItemAnimator(null);
        RecyclerView recyclerView2 = (RecyclerView) mo166281a(R.id.recycler);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "recycler");
        recyclerView2.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView3 = (RecyclerView) mo166281a(R.id.recycler);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "recycler");
        recyclerView3.setAdapter(mo166282a());
    }

    /* renamed from: a */
    public final void mo166283a(MomentsAtAdapter.IAtUserClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f119320a = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dataList", "", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.at.d$a */
    public static final class C47305a<T> implements AbstractC1178x<List<? extends MomentUser>> {

        /* renamed from: a */
        final /* synthetic */ MomentsAtFirstScreenFragment f119324a;

        C47305a(MomentsAtFirstScreenFragment dVar) {
            this.f119324a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(List<MomentUser> list) {
            MomentsAtAdapter a = this.f119324a.mo166282a();
            Intrinsics.checkExpressionValueIsNotNull(list, "dataList");
            a.mo166279a(list);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m187363d();
        m187364e();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.moments_fragment_at_first_screen, viewGroup, false);
    }
}
