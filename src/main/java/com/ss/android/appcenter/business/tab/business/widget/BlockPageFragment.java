package com.ss.android.appcenter.business.tab.business.widget;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.net.dto.BlockitInfo;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.tab.business.blockit.BlockitView;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/widget/BlockPageFragment;", "Landroidx/fragment/app/Fragment;", "()V", "block", "Lcom/larksuite/component/blockit/entity/BlockEntity;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.business.tab.business.widget.e */
public final class BlockPageFragment extends Fragment {

    /* renamed from: a */
    public static final Companion f69949a = new Companion(null);

    /* renamed from: b */
    private BlockEntity f69950b;

    /* renamed from: c */
    private HashMap f69951c;

    /* renamed from: a */
    public void mo99672a() {
        HashMap hashMap = this.f69951c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo99672a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/widget/BlockPageFragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/appcenter/business/tab/business/widget/BlockPageFragment;", "blockEntity", "Lcom/larksuite/component/blockit/entity/BlockEntity;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.widget.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final BlockPageFragment mo99673a(BlockEntity blockEntity) {
            Intrinsics.checkParameterIsNotNull(blockEntity, "blockEntity");
            BlockPageFragment eVar = new BlockPageFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("block", blockEntity);
            eVar.setArguments(bundle);
            return eVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.widget.e$b */
    static final class RunnableC27956b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BlockitView f69952a;

        /* renamed from: b */
        final /* synthetic */ ItemInfo f69953b;

        /* renamed from: c */
        final /* synthetic */ SizeChangedFrameLayout f69954c;

        RunnableC27956b(BlockitView blockitView, ItemInfo itemInfo, SizeChangedFrameLayout sizeChangedFrameLayout) {
            this.f69952a = blockitView;
            this.f69953b = itemInfo;
            this.f69954c = sizeChangedFrameLayout;
        }

        public final void run() {
            BlockitView blockitView = this.f69952a;
            ItemInfo itemInfo = this.f69953b;
            SizeChangedFrameLayout sizeChangedFrameLayout = this.f69954c;
            Intrinsics.checkExpressionValueIsNotNull(sizeChangedFrameLayout, "rootView");
            blockitView.mo99220a(itemInfo, sizeChangedFrameLayout.getHeight(), false, null, null, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("block");
            if (serializable != null) {
                this.f69950b = (BlockEntity) serializable;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.blockit.entity.BlockEntity");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        BlockEntity blockEntity = this.f69950b;
        if (blockEntity != null) {
            BlockitView blockitView = (BlockitView) view.findViewById(R.id.blockit_view);
            SizeChangedFrameLayout sizeChangedFrameLayout = (SizeChangedFrameLayout) view.findViewById(R.id.root_view);
            blockitView.setDemoMode(true);
            ItemInfo itemInfo = new ItemInfo("123", "456");
            BlockitInfo blockitInfo = new BlockitInfo();
            blockitInfo.blockTypeId = blockEntity.getBlockTypeID();
            blockitInfo.blockId = "   ";
            blockitInfo.sourceData = blockEntity.getSourceData();
            itemInfo.setAppId(blockEntity.getAppID());
            itemInfo.setBlock(blockitInfo);
            sizeChangedFrameLayout.post(new RunnableC27956b(blockitView, itemInfo, sizeChangedFrameLayout));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_block_page, viewGroup, false);
    }
}
