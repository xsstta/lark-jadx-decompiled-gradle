package com.bytedance.ee.bear.rn;

import org.koin.core.qualifier.Qualifier;

public interface RnPushProtocol {

    /* renamed from: com.bytedance.ee.bear.rn.RnPushProtocol$a */
    public interface AbstractC10622a {
        void didReceivePush(String str);
    }

    /* renamed from: a */
    void mo40241a();

    /* renamed from: a */
    void mo40242a(AbstractC10622a aVar);

    public enum VersionQualifier implements Qualifier {
        Specify,
        Default;

        @Override // org.koin.core.qualifier.Qualifier
        public String getValue() {
            return name();
        }
    }
}
