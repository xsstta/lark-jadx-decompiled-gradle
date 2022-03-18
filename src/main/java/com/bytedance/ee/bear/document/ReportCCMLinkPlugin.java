package com.bytedance.ee.bear.document;

import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.AnalyticConstant;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.route.RouteReport;

public class ReportCCMLinkPlugin extends DocumentPlugin {
    private WebViewClient mWebViewClient;

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        if (this.mWebViewClient == null) {
            this.mWebViewClient = new WebViewClient() {
                /* class com.bytedance.ee.bear.document.ReportCCMLinkPlugin.C56191 */

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    String str2;
                    String str3;
                    DocViewModel docViewModel = ReportCCMLinkPlugin.this.getDocViewModel();
                    AbstractC5233x b = C5234y.m21391b();
                    if (docViewModel.isAnnounceDoc()) {
                        str3 = AnalyticConstant.LinkScene.MESSENGER.getScene();
                        str2 = AnalyticConstant.LinkLocation.MESSENGER_GROUP_ANNOUNCEMENT.getLocation();
                    } else if (docViewModel.isType(C8275a.f22377j)) {
                        str3 = AnalyticConstant.LinkScene.CCM.getScene();
                        str2 = AnalyticConstant.LinkLocation.CCM_WIKI.getLocation();
                    } else if (docViewModel.isOpenFromLarkFeed()) {
                        str3 = AnalyticConstant.LinkScene.MESSENGER.getScene();
                        str2 = AnalyticConstant.LinkLocation.MESSENGER_LARK_FEED.getLocation();
                    } else if (docViewModel.isConferenceRecords()) {
                        str3 = AnalyticConstant.LinkScene.CCM.getScene();
                        str2 = AnalyticConstant.LinkLocation.OPENDOC_CONFERENCE_RECORDS.getLocation();
                    } else if (TextUtils.equals(docViewModel.getDocumentType(), C8275a.f22372e.mo32553a())) {
                        str3 = AnalyticConstant.LinkScene.CCM.getScene();
                        str2 = AnalyticConstant.LinkLocation.CCM_SHEET.getLocation();
                    } else if (TextUtils.equals(docViewModel.getDocumentType(), C8275a.f22376i.mo32553a())) {
                        str3 = AnalyticConstant.LinkScene.CCM.getScene();
                        str2 = AnalyticConstant.LinkLocation.CCM_SLIDE.getLocation();
                    } else if (TextUtils.equals(docViewModel.getDocumentType(), C8275a.f22374g.mo32553a())) {
                        str3 = AnalyticConstant.LinkScene.CCM.getScene();
                        str2 = AnalyticConstant.LinkLocation.CCM_MINDNOTE.getLocation();
                    } else {
                        str3 = AnalyticConstant.LinkScene.CCM.getScene();
                        str2 = AnalyticConstant.LinkLocation.CCM_DOCS.getLocation();
                    }
                    RouteReport.m44506a(b, str3, str2);
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            };
        }
        getWeb().mo19425a(this.mWebViewClient);
    }

    public void onDetachFromHost(C6095s sVar) {
        super.onDetachFromHost((C4943e) sVar);
        if (this.mWebViewClient != null) {
            getWeb().mo19438b(this.mWebViewClient);
            this.mWebViewClient = null;
        }
    }
}
