package com.ss.android.appcenter.business.tab.business.widget;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.AbstractC1583a;
import com.larksuite.component.blockit.entity.BlockEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/widget/BlockDemoAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragment", "Landroidx/fragment/app/Fragment;", "list", "", "Lcom/larksuite/component/blockit/entity/BlockEntity;", "(Landroidx/fragment/app/Fragment;Ljava/util/List;)V", "getList", "()Ljava/util/List;", "createFragment", "position", "", "getItemCount", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.business.tab.business.widget.a */
public final class BlockDemoAdapter extends AbstractC1583a {

    /* renamed from: e */
    private final List<BlockEntity> f69931e;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f69931e.size();
    }

    @Override // androidx.viewpager2.adapter.AbstractC1583a
    /* renamed from: a */
    public Fragment mo8246a(int i) {
        return BlockPageFragment.f69949a.mo99673a(this.f69931e.get(i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.larksuite.component.blockit.entity.BlockEntity> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockDemoAdapter(Fragment fragment, List<? extends BlockEntity> list) {
        super(fragment);
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f69931e = list;
    }
}
