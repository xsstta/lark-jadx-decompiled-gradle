package com.ss.android.lark.ttwebview.manis;

import android.content.Context;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = TTWebViewApiProxy.class)
public class TTWebViewApiProxyImpl implements TTWebViewApiProxy {
    private Context mContext;

    @Override // com.ss.android.lark.ttwebview.manis.TTWebViewApiProxy
    public void fetchWebViewCore(boolean z) {
    }

    @Override // com.ss.android.lark.ttwebview.manis.TTWebViewApiProxy
    public String getLoadSoVersion() {
        return null;
    }

    @Override // com.ss.android.lark.ttwebview.manis.TTWebViewApiProxy
    public String getLocalSoVersion() {
        return null;
    }

    public TTWebViewApiProxyImpl(Context context) {
        this.mContext = context;
    }
}
