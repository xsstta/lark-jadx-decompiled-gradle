package com.larksuite.component.webview.container.impl.inject;

import android.content.Context;
import com.larksuite.component.webview.container.impl.jsapi.InjectJSApiWrapper;
import com.larksuite.component.webview.container.impl.mvp.InjectWebViewDelegateWrapper;
import com.larksuite.component.webview.container.impl.queryapi.InjectQueryApiWrapper;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;

@RemoteServiceImpl(service = IBrowserSubProcess.class)
public class BrowserSubProcessImpl implements IBrowserSubProcess {
    private Context mContext;

    public BrowserSubProcessImpl(Context context) {
        this.mContext = context;
    }

    @Override // com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess
    public void finishInjection(String str) {
        ((AbstractC25867d) C25864c.m93607a()).mo92009a(str).mo92001a();
    }

    @Override // com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess
    public void startInjection(String str) {
        ((AbstractC25867d) C25864c.m93607a()).mo92009a(str);
    }

    @Override // com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess
    public void registerWebViewDelegate(String str, InjectWebViewDelegateWrapper injectWebViewDelegateWrapper) {
        C25863b b = ((AbstractC25867d) C25864c.m93607a()).mo92013b(str);
        if (b != null && injectWebViewDelegateWrapper != null) {
            b.mo92002a(injectWebViewDelegateWrapper.f64002a);
        }
    }

    @Override // com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess
    public void registerJSApiHandler(String str, ArrayList<InjectJSApiWrapper> arrayList) {
        C25863b b = ((AbstractC25867d) C25864c.m93607a()).mo92013b(str);
        if (b != null && !CollectionUtils.isEmpty(arrayList)) {
            Iterator<InjectJSApiWrapper> it = arrayList.iterator();
            while (it.hasNext()) {
                b.mo92003a(it.next());
            }
        }
    }

    @Override // com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess
    public void registerQueryApiHandler(String str, ArrayList<InjectQueryApiWrapper> arrayList) {
        C25863b b = ((AbstractC25867d) C25864c.m93607a()).mo92013b(str);
        if (b != null && !CollectionUtils.isEmpty(arrayList)) {
            Iterator<InjectQueryApiWrapper> it = arrayList.iterator();
            while (it.hasNext()) {
                b.mo92004a(it.next());
            }
        }
    }
}
