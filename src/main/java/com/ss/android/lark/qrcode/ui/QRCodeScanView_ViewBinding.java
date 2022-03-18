package com.ss.android.lark.qrcode.ui;

import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class QRCodeScanView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private QRCodeScanView f130810a;

    @Override // butterknife.Unbinder
    public void unbind() {
        QRCodeScanView qRCodeScanView = this.f130810a;
        if (qRCodeScanView != null) {
            this.f130810a = null;
            qRCodeScanView.mMyTitleBar = null;
            qRCodeScanView.mCustomViewContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public QRCodeScanView_ViewBinding(QRCodeScanView qRCodeScanView, View view) {
        this.f130810a = qRCodeScanView;
        qRCodeScanView.mMyTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mMyTitleBar'", CommonTitleBar.class);
        qRCodeScanView.mCustomViewContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.custom_view_container, "field 'mCustomViewContainer'", FrameLayout.class);
    }
}
