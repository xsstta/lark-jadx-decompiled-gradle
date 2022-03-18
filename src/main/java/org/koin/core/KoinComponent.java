package org.koin.core;

import kotlin.Metadata;
import org.koin.core.context.KoinContextHandler;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"Lorg/koin/core/KoinComponent;", "", "getKoin", "Lorg/koin/core/Koin;", "koin-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: org.koin.core.c */
public interface KoinComponent {
    /* renamed from: a */
    Koin mo246610a();

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: org.koin.core.c$a */
    public static final class C70037a {
        /* renamed from: a */
        public static Koin m268649a(KoinComponent cVar) {
            return KoinContextHandler.f175011a.mo246622a();
        }
    }
}
