package com.larksuite.component.webview.container.impl.inject;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.larksuite.component.webview.container.dto.AbstractC25831b;
import com.larksuite.component.webview.container.dto.IWebContainerContract;
import com.larksuite.framework.callback.IGetDataCallback;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

/* renamed from: com.larksuite.component.webview.container.impl.inject.d */
public interface AbstractC25867d extends AbstractC25831b {
    /* renamed from: a */
    C25863b mo92008a(Bundle bundle);

    /* renamed from: a */
    C25863b mo92009a(String str);

    /* renamed from: a */
    Future mo92010a(Bundle bundle, IGetDataCallback<C25863b> iGetDataCallback);

    /* renamed from: a */
    void mo92011a(C25862a aVar, Activity activity, Fragment fragment, ConcurrentHashMap<String, Object> concurrentHashMap, IWebContainerContract.IWebContainerView iWebContainerView, IWebContainerContract.AbstractC25826a aVar2);

    /* renamed from: a */
    void mo92012a(boolean z, Bundle bundle, Bundle bundle2);

    /* renamed from: b */
    C25863b mo92013b(String str);

    /* renamed from: b */
    void mo92014b(Bundle bundle);
}
