package androidx.fragment.app;

import androidx.lifecycle.C1144ai;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
public final class FragmentViewModelLazyKt$activityViewModels$2 extends Lambda implements Function0<C1144ai.AbstractC1146b> {
    final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$activityViewModels$2(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1144ai.AbstractC1146b invoke() {
        FragmentActivity requireActivity = this.$this_activityViewModels.requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
        C1144ai.AbstractC1146b defaultViewModelProviderFactory = requireActivity.getDefaultViewModelProviderFactory();
        Intrinsics.checkExpressionValueIsNotNull(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
        return defaultViewModelProviderFactory;
    }
}
