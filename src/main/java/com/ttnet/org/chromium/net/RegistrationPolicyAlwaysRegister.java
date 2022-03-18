package com.ttnet.org.chromium.net;

import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;

public class RegistrationPolicyAlwaysRegister extends NetworkChangeNotifierAutoDetect.RegistrationPolicy {
    /* access modifiers changed from: protected */
    @Override // com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.RegistrationPolicy
    public void destroy() {
    }

    /* access modifiers changed from: protected */
    @Override // com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.RegistrationPolicy
    public void init(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        super.init(networkChangeNotifierAutoDetect);
        register();
    }
}
