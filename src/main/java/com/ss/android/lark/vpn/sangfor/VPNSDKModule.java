package com.ss.android.lark.vpn.sangfor;

import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.i18n.claymore.ClaymoreServiceLoader;
import com.ss.android.lark.vpn.p2919a.AbstractC58196a;
import com.ss.android.lark.vpn.p2919a.AbstractC58198b;
import com.ss.android.lark.vpn.p2919a.AbstractC58199c;

@ClaymoreImpl(AbstractC58198b.class)
public class VPNSDKModule implements AbstractC58198b {
    @Override // com.ss.android.lark.vpn.p2919a.AbstractC58198b
    public AbstractC58199c getVPNSDKService() {
        return new C58200a();
    }

    public static AbstractC58196a getDependency() {
        return (AbstractC58196a) ClaymoreServiceLoader.loadFirst(AbstractC58196a.class);
    }
}
