package com.google.android.play.core.splitinstall;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: com.google.android.play.core.splitinstall.w */
public final class EnumC22725w extends Enum<EnumC22725w> implements AbstractC22726x {

    /* renamed from: a */
    public static final EnumC22725w f56241a = new EnumC22725w("INSTANCE");

    /* renamed from: b */
    private static final AtomicReference<AbstractC22727y> f56242b = new AtomicReference<>(null);

    private EnumC22725w(String str) {
    }

    @Override // com.google.android.play.core.splitinstall.AbstractC22726x
    /* renamed from: a */
    public final AbstractC22727y mo79066a() {
        return f56242b.get();
    }

    /* renamed from: a */
    public final void mo79067a(AbstractC22727y yVar) {
        f56242b.set(yVar);
    }
}
