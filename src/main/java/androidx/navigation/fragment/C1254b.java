package androidx.navigation.fragment;

import androidx.fragment.app.Fragment;
import androidx.navigation.C1259g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"findNavController", "Landroidx/navigation/NavController;", "Landroidx/fragment/app/Fragment;", "navigation-fragment-ktx_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: androidx.navigation.fragment.b */
public final class C1254b {
    /* renamed from: a */
    public static final C1259g m5698a(Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(fragment, "$this$findNavController");
        C1259g a = NavHostFragment.m5682a(fragment);
        Intrinsics.checkExpressionValueIsNotNull(a, "NavHostFragment.findNavController(this)");
        return a;
    }
}
