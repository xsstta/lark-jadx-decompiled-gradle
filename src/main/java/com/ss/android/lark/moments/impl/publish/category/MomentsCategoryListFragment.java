package com.ss.android.lark.moments.impl.publish.category;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.moments.impl.publish.MomentsPublishActivity;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J&\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\u001a\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001e\u0010\u0017\u001a\u00020\n2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/category/MomentsCategoryListFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "categoryAdapter", "Lcom/ss/android/lark/moments/impl/publish/category/CategoryListAdapter;", "getCategoryAdapter", "()Lcom/ss/android/lark/moments/impl/publish/category/CategoryListAdapter;", "categoryAdapter$delegate", "Lkotlin/Lazy;", "initRecyclerView", "", "initTitleBar", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onViewCreated", "view", "setCategoryList", "categoryList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/moments/impl/publish/category/CategoryTag;", "Lkotlin/collections/ArrayList;", "Companion", "OnClickedCategoryItemListener", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.publish.category.c */
public final class MomentsCategoryListFragment extends BaseFragment {

    /* renamed from: a */
    public static final Companion f120709a = new Companion(null);

    /* renamed from: b */
    private final Lazy f120710b = LazyKt.lazy(new C47953c(this));

    /* renamed from: c */
    private HashMap f120711c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/category/MomentsCategoryListFragment$OnClickedCategoryItemListener;", "", "finishListPage", "", "onClickedCategoryItem", "selectedId", "", "needPutFirst", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.category.c$b */
    public interface OnClickedCategoryItemListener {
        /* renamed from: a */
        void mo167920a();

        /* renamed from: a */
        void mo167921a(String str, boolean z);
    }

    /* renamed from: a */
    public View mo167916a(int i) {
        if (this.f120711c == null) {
            this.f120711c = new HashMap();
        }
        View view = (View) this.f120711c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f120711c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final CategoryListAdapter mo167917a() {
        return (CategoryListAdapter) this.f120710b.getValue();
    }

    /* renamed from: b */
    public void mo167919b() {
        HashMap hashMap = this.f120711c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo167919b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/category/MomentsCategoryListFragment$Companion;", "", "()V", "ARGUMENTS_ENABLE_INVERT", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.category.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/moments/impl/publish/category/CategoryListAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.category.c$c */
    static final class C47953c extends Lambda implements Function0<CategoryListAdapter> {
        final /* synthetic */ MomentsCategoryListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47953c(MomentsCategoryListFragment cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CategoryListAdapter invoke() {
            return new CategoryListAdapter(new OnClickedCategoryItemListener(this) {
                /* class com.ss.android.lark.moments.impl.publish.category.MomentsCategoryListFragment.C47953c.C479541 */

                /* renamed from: a */
                final /* synthetic */ C47953c f120712a;

                @Override // com.ss.android.lark.moments.impl.publish.category.MomentsCategoryListFragment.OnClickedCategoryItemListener
                /* renamed from: a */
                public void mo167920a() {
                    FragmentActivity activity = this.f120712a.this$0.getActivity();
                    if (!(activity instanceof MomentsPublishActivity)) {
                        activity = null;
                    }
                    MomentsPublishActivity momentsPublishActivity = (MomentsPublishActivity) activity;
                    if (momentsPublishActivity != null) {
                        momentsPublishActivity.mo167806b(this.f120712a.this$0);
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f120712a = r1;
                }

                @Override // com.ss.android.lark.moments.impl.publish.category.MomentsCategoryListFragment.OnClickedCategoryItemListener
                /* renamed from: a */
                public void mo167921a(String str, boolean z) {
                    Intrinsics.checkParameterIsNotNull(str, "selectedId");
                    FragmentActivity activity = this.f120712a.this$0.getActivity();
                    MomentsPublishActivity momentsPublishActivity = null;
                    if (!(activity instanceof MomentsPublishActivity)) {
                        activity = null;
                    }
                    MomentsPublishActivity momentsPublishActivity2 = (MomentsPublishActivity) activity;
                    if (momentsPublishActivity2 != null) {
                        momentsPublishActivity2.mo167806b(this.f120712a.this$0);
                    }
                    ArrayList<CategoryTag> arrayList = new ArrayList<>();
                    if (z) {
                        for (T t : this.f120712a.this$0.mo167917a().mo167906a()) {
                            if (Intrinsics.areEqual(t.getId(), str)) {
                                arrayList.add(0, t);
                            } else {
                                arrayList.add(t);
                            }
                        }
                    } else {
                        arrayList.addAll(this.f120712a.this$0.mo167917a().mo167906a());
                    }
                    FragmentActivity activity2 = this.f120712a.this$0.getActivity();
                    if (activity2 instanceof MomentsPublishActivity) {
                        momentsPublishActivity = activity2;
                    }
                    MomentsPublishActivity momentsPublishActivity3 = momentsPublishActivity;
                    if (momentsPublishActivity3 != null) {
                        momentsPublishActivity3.mo167803a(arrayList);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    private final void m189305c() {
        ((CommonTitleBar) mo167916a(R.id.titleBar)).setTitle(UIHelper.getString(R.string.Lark_Community_PostInTitle));
        ((CommonTitleBar) mo167916a(R.id.titleBar)).setLeftClickListener(new View$OnClickListenerC47955d(this));
        ((CommonTitleBar) mo167916a(R.id.titleBar)).setLeftText(CommonTitleBarConstants.Lark_Legacy_Cancel);
        ((CommonTitleBar) mo167916a(R.id.titleBar)).setLeftImageDrawable(null);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        RecyclerView recyclerView = (RecyclerView) mo167916a(R.id.rvCategory);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvCategory");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            Intrinsics.checkExpressionValueIsNotNull(layoutManager, "rvCategory.layoutManager ?: return");
            if (mo167917a().getItemCount() > 0) {
                layoutManager.scrollToPosition(0);
            }
        }
    }

    /* renamed from: d */
    private final void m189306d() {
        boolean z = false;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.mContext, 1, false);
        linearLayoutManager.setRecycleChildrenOnDetach(true);
        linearLayoutManager.setStackFromEnd(false);
        RecyclerView recyclerView = (RecyclerView) mo167916a(R.id.rvCategory);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvCategory");
        recyclerView.setItemAnimator(null);
        RecyclerView recyclerView2 = (RecyclerView) mo167916a(R.id.rvCategory);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rvCategory");
        recyclerView2.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView3 = (RecyclerView) mo167916a(R.id.rvCategory);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "rvCategory");
        recyclerView3.setAdapter(mo167917a());
        CategoryListAdapter a = mo167917a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("arguments_enable_invert");
        }
        a.mo167910a(z);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.category.c$d */
    public static final class View$OnClickListenerC47955d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsCategoryListFragment f120713a;

        View$OnClickListenerC47955d(MomentsCategoryListFragment cVar) {
            this.f120713a = cVar;
        }

        public final void onClick(View view) {
            FragmentActivity activity = this.f120713a.getActivity();
            if (!(activity instanceof MomentsPublishActivity)) {
                activity = null;
            }
            MomentsPublishActivity momentsPublishActivity = (MomentsPublishActivity) activity;
            if (momentsPublishActivity != null) {
                momentsPublishActivity.mo167806b(this.f120713a);
            }
        }
    }

    /* renamed from: a */
    public final void mo167918a(ArrayList<CategoryTag> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "categoryList");
        mo167917a().mo167909a(arrayList);
        mo167917a().notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m189305c();
        m189306d();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.moments_fragment_category_list, viewGroup, false);
    }
}
