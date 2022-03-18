package com.zackratos.ultimatebarx.ultimatebarx.operator;

import com.zackratos.ultimatebarx.ultimatebarx.bean.BarConfig;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0006H\u0016J\u0010\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0004J\b\u0010!\u001a\u00020\u0001H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/operator/DoubleOperator;", "Lcom/zackratos/ultimatebarx/ultimatebarx/operator/Operator;", "()V", "navOperator", "Lcom/zackratos/ultimatebarx/ultimatebarx/operator/BaseOperator;", "newNavConfig", "Lcom/zackratos/ultimatebarx/ultimatebarx/bean/BarConfig;", "getNewNavConfig", "()Lcom/zackratos/ultimatebarx/ultimatebarx/bean/BarConfig;", "newNavConfig$delegate", "Lkotlin/Lazy;", "newStaConfig", "getNewStaConfig", "newStaConfig$delegate", "staOperator", "applyNavigationBar", "", "applyStatusBar", "background", "Lcom/zackratos/ultimatebarx/ultimatebarx/bean/BarBackground;", "color", "", "colorRes", "config", "drawableRes", "fitWindow", "", "light", "lvLightBackground", "lvLightColor", "lvLightColorRes", "lvLightDrawableRes", "operator", "transparent", "Companion", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.zackratos.ultimatebarx.ultimatebarx.d.c */
public final class DoubleOperator implements Operator {

    /* renamed from: c */
    public static final Companion f171335c = new Companion(null);

    /* renamed from: a */
    public BaseOperator f171336a;

    /* renamed from: b */
    public BaseOperator f171337b;

    /* renamed from: d */
    private final Lazy f171338d;

    /* renamed from: e */
    private final Lazy f171339e;

    /* renamed from: c */
    private final BarConfig m264704c() {
        return (BarConfig) this.f171338d.getValue();
    }

    /* renamed from: e */
    private final BarConfig m264705e() {
        return (BarConfig) this.f171339e.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/operator/DoubleOperator$Companion;", "", "()V", "newInstance", "Lcom/zackratos/ultimatebarx/ultimatebarx/operator/DoubleOperator;", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.zackratos.ultimatebarx.ultimatebarx.d.c$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final DoubleOperator mo237005a() {
            return new DoubleOperator(null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/zackratos/ultimatebarx/ultimatebarx/bean/BarConfig;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.zackratos.ultimatebarx.ultimatebarx.d.c$b */
    static final class C68102b extends Lambda implements Function0<BarConfig> {
        final /* synthetic */ DoubleOperator this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68102b(DoubleOperator cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final BarConfig invoke() {
            BarConfig a = BarConfig.f171313a.mo236974a();
            BaseOperator bVar = this.this$0.f171337b;
            if (bVar != null) {
                a.mo236964a(bVar.mo237002e());
            }
            return a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/zackratos/ultimatebarx/ultimatebarx/bean/BarConfig;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.zackratos.ultimatebarx.ultimatebarx.d.c$c */
    static final class C68103c extends Lambda implements Function0<BarConfig> {
        final /* synthetic */ DoubleOperator this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68103c(DoubleOperator cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final BarConfig invoke() {
            BarConfig a = BarConfig.f171313a.mo236974a();
            BaseOperator bVar = this.this$0.f171336a;
            if (bVar != null) {
                a.mo236964a(bVar.mo237002e());
            }
            return a;
        }
    }

    private DoubleOperator() {
        this.f171338d = LazyKt.lazy(new C68103c(this));
        this.f171339e = LazyKt.lazy(new C68102b(this));
    }

    @Override // com.zackratos.ultimatebarx.ultimatebarx.operator.Operator
    /* renamed from: b */
    public void mo236996b() {
        BaseOperator bVar = this.f171337b;
        if (bVar != null) {
            bVar.mo236998a(m264705e());
        }
        BaseOperator bVar2 = this.f171337b;
        if (bVar2 != null) {
            bVar2.mo236996b();
        }
    }

    @Override // com.zackratos.ultimatebarx.ultimatebarx.operator.Operator
    /* renamed from: d */
    public Operator mo237001d() {
        m264704c().mo236962a();
        m264705e().mo236962a();
        return this;
    }

    @Override // com.zackratos.ultimatebarx.ultimatebarx.operator.Operator
    /* renamed from: a */
    public void mo236995a() {
        BaseOperator bVar = this.f171336a;
        if (bVar != null) {
            bVar.mo236998a(m264704c());
        }
        BaseOperator bVar2 = this.f171336a;
        if (bVar2 != null) {
            bVar2.mo236995a();
        }
    }

    public /* synthetic */ DoubleOperator(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final DoubleOperator mo237003a(BaseOperator bVar) {
        this.f171336a = bVar;
        return this;
    }

    /* renamed from: b */
    public final DoubleOperator mo237004b(BaseOperator bVar) {
        this.f171337b = bVar;
        return this;
    }

    @Override // com.zackratos.ultimatebarx.ultimatebarx.operator.Operator
    /* renamed from: a */
    public Operator mo236999a(boolean z) {
        m264704c().mo236963a(z);
        m264705e().mo236963a(z);
        return this;
    }
}
