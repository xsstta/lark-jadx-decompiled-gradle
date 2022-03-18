package com.ss.android.lark.magic.provider;

import com.ss.android.lark.magic.provider.impl.FeelGoodMagicProvider;
import com.ss.android.lark.magic.provider.impl.GlobalOpener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/magic/provider/MagicProviderFactory;", "", "()V", "createOpener", "Lcom/ss/android/lark/magic/provider/IOpener;", "createProvider", "Lcom/ss/android/lark/magic/provider/IMagicProvider;", "core_magic_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.magic.d.d */
public final class MagicProviderFactory {

    /* renamed from: a */
    public static final MagicProviderFactory f105951a = new MagicProviderFactory();

    private MagicProviderFactory() {
    }

    /* renamed from: a */
    public final IMagicProvider mo150033a() {
        return FeelGoodMagicProvider.f105933b.mo150026a();
    }

    /* renamed from: b */
    public final IOpener mo150034b() {
        return GlobalOpener.f105949a;
    }
}
