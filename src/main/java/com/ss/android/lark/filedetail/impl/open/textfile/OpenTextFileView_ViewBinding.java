package com.ss.android.lark.filedetail.impl.open.textfile;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class OpenTextFileView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private OpenTextFileView f98407a;

    @Override // butterknife.Unbinder
    public void unbind() {
        OpenTextFileView openTextFileView = this.f98407a;
        if (openTextFileView != null) {
            this.f98407a = null;
            openTextFileView.mWebView = null;
            openTextFileView.mTitleBar = null;
            openTextFileView.mContentContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public OpenTextFileView_ViewBinding(OpenTextFileView openTextFileView, View view) {
        this.f98407a = openTextFileView;
        openTextFileView.mWebView = (WebView) Utils.findRequiredViewAsType(view, R.id.webview, "field 'mWebView'", WebView.class);
        openTextFileView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        openTextFileView.mContentContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.content_container, "field 'mContentContainer'", FrameLayout.class);
    }
}
