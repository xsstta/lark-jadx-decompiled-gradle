package com.ss.android.lark.meego.wrapper.manis;

import android.content.Context;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import com.ss.android.lark.meego.wrapper.MeegoModule;
import com.ss.android.lark.meego.wrapper.debug.C44864a;
import com.ss.android.lark.meego.wrapper.p2250e.C44866a;
import com.ss.android.lark.meego.wrapper.p2251f.C44869a;

@RemoteServiceImpl(service = IMeegoProxy.class)
public class MeegoProxyImpl implements IMeegoProxy {
    private Context mContext;

    @Override // com.ss.android.lark.meego.wrapper.manis.IMeegoProxy
    public String getRpcPersistDyecpFd() {
        return C44864a.m177875e().f113643b;
    }

    @Override // com.ss.android.lark.meego.wrapper.manis.IMeegoProxy
    public String getTtFeatureEnv() {
        return C44864a.m177875e().f113642a;
    }

    @Override // com.ss.android.lark.meego.wrapper.manis.IMeegoProxy
    public String getMeegoSignature() {
        return C44869a.m177889a().mo158761b();
    }

    @Override // com.ss.android.lark.meego.wrapper.manis.IMeegoProxy
    public void installPlugin(AbstractC44874a aVar) {
        C44866a.m177883a(aVar);
    }

    public MeegoProxyImpl(Context context) {
        this.mContext = context;
    }

    @Override // com.ss.android.lark.meego.wrapper.manis.IMeegoProxy
    public void openWebUrl(String str) {
        MeegoModule.m177824d().getBrowserDependency().mo144527a(str);
    }
}
