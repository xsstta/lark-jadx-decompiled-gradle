package androidx.navigation;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.C1254b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/navigation/NavBackStackEntry;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
public final class NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2 extends Lambda implements Function0<C1250f> {
    final /* synthetic */ int $navGraphId;
    final /* synthetic */ Fragment $this_navGraphViewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(Fragment fragment, int i) {
        super(0);
        this.$this_navGraphViewModels = fragment;
        this.$navGraphId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1250f invoke() {
        return C1254b.m5698a(this.$this_navGraphViewModels).mo6342d(this.$navGraphId);
    }
}
