package com.zackratos.ultimatebarx.ultimatebarx.operator;

import com.zackratos.ultimatebarx.ultimatebarx.UltimateBarXManager;
import com.zackratos.ultimatebarx.ultimatebarx.bean.BarConfig;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u0001H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8DX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/operator/BaseOperator;", "Lcom/zackratos/ultimatebarx/ultimatebarx/operator/Operator;", "config", "Lcom/zackratos/ultimatebarx/ultimatebarx/bean/BarConfig;", "(Lcom/zackratos/ultimatebarx/ultimatebarx/bean/BarConfig;)V", "getConfig", "()Lcom/zackratos/ultimatebarx/ultimatebarx/bean/BarConfig;", "manager", "Lcom/zackratos/ultimatebarx/ultimatebarx/UltimateBarXManager;", "getManager", "()Lcom/zackratos/ultimatebarx/ultimatebarx/UltimateBarXManager;", "manager$delegate", "Lkotlin/Lazy;", "background", "Lcom/zackratos/ultimatebarx/ultimatebarx/bean/BarBackground;", "color", "", "colorRes", "drawableRes", "fitWindow", "", "light", "lvLightBackground", "lvLightColor", "lvLightColorRes", "lvLightDrawableRes", "transparent", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.zackratos.ultimatebarx.ultimatebarx.d.b */
public abstract class BaseOperator implements Operator {

    /* renamed from: a */
    private final Lazy f171333a;

    /* renamed from: b */
    private final BarConfig f171334b;

    public BaseOperator() {
        this(null, 1, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final UltimateBarXManager mo237000c() {
        return (UltimateBarXManager) this.f171333a.getValue();
    }

    /* renamed from: e */
    public final BarConfig mo237002e() {
        return this.f171334b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/zackratos/ultimatebarx/ultimatebarx/UltimateBarXManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.zackratos.ultimatebarx.ultimatebarx.d.b$a */
    static final class C68101a extends Lambda implements Function0<UltimateBarXManager> {
        public static final C68101a INSTANCE = new C68101a();

        C68101a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final UltimateBarXManager invoke() {
            return UltimateBarXManager.f171319b.mo236993a();
        }
    }

    @Override // com.zackratos.ultimatebarx.ultimatebarx.operator.Operator
    /* renamed from: d */
    public Operator mo237001d() {
        this.f171334b.mo236962a();
        return this;
    }

    /* renamed from: a */
    public Operator mo236998a(BarConfig bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "config");
        this.f171334b.mo236964a(bVar);
        return this;
    }

    public BaseOperator(BarConfig bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "config");
        this.f171334b = bVar;
        this.f171333a = LazyKt.lazy(C68101a.INSTANCE);
    }

    @Override // com.zackratos.ultimatebarx.ultimatebarx.operator.Operator
    /* renamed from: a */
    public Operator mo236999a(boolean z) {
        this.f171334b.mo236963a(z);
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseOperator(BarConfig bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BarConfig.f171313a.mo236974a() : bVar);
    }
}
