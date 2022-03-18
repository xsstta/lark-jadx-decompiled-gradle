package com.zackratos.ultimatebarx.ultimatebarx;

import android.content.Context;
import androidx.startup.AbstractC1453b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\t0\bH\u0016¨\u0006\n"}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/UltimateBarXInitializer;", "Landroidx/startup/Initializer;", "", "()V", "create", "context", "Landroid/content/Context;", "dependencies", "", "Ljava/lang/Class;", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UltimateBarXInitializer implements AbstractC1453b<Unit> {
    @Override // androidx.startup.AbstractC1453b
    /* renamed from: a */
    public List<Class<? extends AbstractC1453b<?>>> mo7692a() {
        return new ArrayList();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // androidx.startup.AbstractC1453b
    /* renamed from: a */
    public /* synthetic */ Unit mo7691a(Context context) {
        mo236946b(context);
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public void mo236946b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        UltimateBarXManager.f171319b.mo236993a().mo236976a(context);
    }
}
