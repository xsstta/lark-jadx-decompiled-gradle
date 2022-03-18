package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.cr;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"JOB_KEY", "", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/lifecycle/ViewModel;", "getViewModelScope", "(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;", "lifecycle-viewmodel-ktx_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: androidx.lifecycle.ag */
public final class C1143ag {
    /* renamed from: a */
    public static final CoroutineScope m5356a(AbstractC1142af afVar) {
        Intrinsics.checkParameterIsNotNull(afVar, "$this$viewModelScope");
        CoroutineScope ahVar = (CoroutineScope) afVar.getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (ahVar != null) {
            return ahVar;
        }
        Object tagIfAbsent = afVar.setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new CloseableCoroutineScope(cr.m266795a(null, 1, null).plus(Dispatchers.m266324b().mo242660a())));
        Intrinsics.checkExpressionValueIsNotNull(tagIfAbsent, "setTagIfAbsent(JOB_KEY,\n…patchers.Main.immediate))");
        return (CoroutineScope) tagIfAbsent;
    }
}
