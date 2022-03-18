package com.bytedance.ee.bear.drive.view.widget;

import android.net.Uri;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bytedance.ee.bear.drive.view.widget.a */
public class C7568a extends WebChromeClient {

    /* renamed from: a */
    private final ArrayList<C7569b> f20564a = new ArrayList<>();

    /* renamed from: a */
    public void mo29701a(C7569b bVar) {
        this.f20564a.add(bVar);
    }

    public void onCloseWindow(WebView webView) {
        Iterator<C7569b> it = this.f20564a.iterator();
        while (it.hasNext()) {
            it.next().onCloseWindow(webView);
        }
        this.f20564a.clear();
        super.onCloseWindow(webView);
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        if (this.f20564a.isEmpty()) {
            super.onPermissionRequest(permissionRequest);
            return;
        }
        Iterator<C7569b> it = this.f20564a.iterator();
        while (it.hasNext()) {
            it.next().onPermissionRequest(permissionRequest);
        }
    }

    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        if (this.f20564a.isEmpty()) {
            super.onPermissionRequestCanceled(permissionRequest);
            return;
        }
        Iterator<C7569b> it = this.f20564a.iterator();
        while (it.hasNext()) {
            it.next().onPermissionRequestCanceled(permissionRequest);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Iterator<C7569b> it = this.f20564a.iterator();
        while (it.hasNext()) {
            if (it.next().onShowFileChooser(webView, valueCallback, fileChooserParams)) {
                return true;
            }
        }
        return false;
    }
}
