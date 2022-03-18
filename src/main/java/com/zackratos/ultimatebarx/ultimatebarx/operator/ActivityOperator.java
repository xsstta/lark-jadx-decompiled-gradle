package com.zackratos.ultimatebarx.ultimatebarx.operator;

import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.zackratos.ultimatebarx.ultimatebarx.bean.BarConfig;
import com.zackratos.ultimatebarx.ultimatebarx.p3441b.C68088a;
import com.zackratos.ultimatebarx.ultimatebarx.p3442c.C68098a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/operator/ActivityOperator;", "Lcom/zackratos/ultimatebarx/ultimatebarx/operator/BaseOperator;", "activity", "Landroidx/fragment/app/FragmentActivity;", "config", "Lcom/zackratos/ultimatebarx/ultimatebarx/bean/BarConfig;", "(Landroidx/fragment/app/FragmentActivity;Lcom/zackratos/ultimatebarx/ultimatebarx/bean/BarConfig;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "applyNavigationBar", "", "applyStatusBar", "Companion", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.zackratos.ultimatebarx.ultimatebarx.d.a */
public final class ActivityOperator extends BaseOperator {

    /* renamed from: a */
    public static final Companion f171331a = new Companion(null);

    /* renamed from: b */
    private final FragmentActivity f171332b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/operator/ActivityOperator$Companion;", "", "()V", "newInstance", "Lcom/zackratos/ultimatebarx/ultimatebarx/operator/ActivityOperator;", "activity", "Landroidx/fragment/app/FragmentActivity;", "config", "Lcom/zackratos/ultimatebarx/ultimatebarx/bean/BarConfig;", "newInstance$ultimatebarx_release", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.zackratos.ultimatebarx.ultimatebarx.d.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ActivityOperator mo236997a(FragmentActivity fragmentActivity, BarConfig bVar) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            Intrinsics.checkParameterIsNotNull(bVar, "config");
            return new ActivityOperator(fragmentActivity, bVar, null);
        }

        /* renamed from: a */
        public static /* synthetic */ ActivityOperator m264697a(Companion aVar, FragmentActivity fragmentActivity, BarConfig bVar, int i, Object obj) {
            if ((i & 2) != 0) {
                bVar = BarConfig.f171313a.mo236974a();
            }
            return aVar.mo236997a(fragmentActivity, bVar);
        }
    }

    @Override // com.zackratos.ultimatebarx.ultimatebarx.operator.Operator
    /* renamed from: a */
    public void mo236995a() {
        if (Build.VERSION.SDK_INT >= 19) {
            C68088a.m264642a(this.f171332b);
            C68098a.m264685a(this.f171332b, mo237002e().mo236969d(), mo237000c().mo236992k(this.f171332b).mo236969d());
            C68088a.m264643a(this.f171332b, mo237002e());
            C68088a.m264651c(this.f171332b);
            C68088a.m264644a((LifecycleOwner) this.f171332b);
        }
    }

    @Override // com.zackratos.ultimatebarx.ultimatebarx.operator.Operator
    /* renamed from: b */
    public void mo236996b() {
        if (Build.VERSION.SDK_INT >= 19) {
            C68088a.m264642a(this.f171332b);
            C68098a.m264685a(this.f171332b, mo237000c().mo236991j(this.f171332b).mo236969d(), mo237002e().mo236969d());
            C68088a.m264649b(this.f171332b, mo237002e());
            C68088a.m264648b(this.f171332b);
            C68088a.m264644a((LifecycleOwner) this.f171332b);
        }
    }

    private ActivityOperator(FragmentActivity fragmentActivity, BarConfig bVar) {
        super(bVar);
        this.f171332b = fragmentActivity;
    }

    public /* synthetic */ ActivityOperator(FragmentActivity fragmentActivity, BarConfig bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentActivity, bVar);
    }
}
