package com.larksuite.component.webview.container.impl.inject;

import com.larksuite.component.webview.container.impl.jsapi.InjectJSApiWrapper;
import com.larksuite.component.webview.container.impl.mvp.InjectWebViewDelegateWrapper;
import com.larksuite.component.webview.container.impl.queryapi.InjectQueryApiWrapper;
import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;
import java.util.ArrayList;

@RemoteService(hostProcess = "p0")
public interface IBrowserSubProcess extends IHookInterface {
    void finishInjection(String str);

    void registerJSApiHandler(String str, ArrayList<InjectJSApiWrapper> arrayList);

    void registerQueryApiHandler(String str, ArrayList<InjectQueryApiWrapper> arrayList);

    void registerWebViewDelegate(String str, InjectWebViewDelegateWrapper injectWebViewDelegateWrapper);

    void startInjection(String str);
}
