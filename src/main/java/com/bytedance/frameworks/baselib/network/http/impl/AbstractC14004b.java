package com.bytedance.frameworks.baselib.network.http.impl;

import java.net.URI;

/* renamed from: com.bytedance.frameworks.baselib.network.http.impl.b */
public interface AbstractC14004b {

    /* renamed from: a */
    public static final AbstractC14004b f36699a = new AbstractC14004b() {
        /* class com.bytedance.frameworks.baselib.network.http.impl.AbstractC14004b.C140051 */

        @Override // com.bytedance.frameworks.baselib.network.http.impl.AbstractC14004b
        /* renamed from: a */
        public boolean mo51582a(URI uri, C14010e eVar) {
            return true;
        }
    };

    /* renamed from: b */
    public static final AbstractC14004b f36700b = new AbstractC14004b() {
        /* class com.bytedance.frameworks.baselib.network.http.impl.AbstractC14004b.C140062 */

        @Override // com.bytedance.frameworks.baselib.network.http.impl.AbstractC14004b
        /* renamed from: a */
        public boolean mo51582a(URI uri, C14010e eVar) {
            return false;
        }
    };

    /* renamed from: c */
    public static final AbstractC14004b f36701c = new AbstractC14004b() {
        /* class com.bytedance.frameworks.baselib.network.http.impl.AbstractC14004b.C140073 */

        @Override // com.bytedance.frameworks.baselib.network.http.impl.AbstractC14004b
        /* renamed from: a */
        public boolean mo51582a(URI uri, C14010e eVar) {
            return C14010e.m56699a(eVar.mo51597d(), uri.getHost());
        }
    };

    /* renamed from: a */
    boolean mo51582a(URI uri, C14010e eVar);
}
