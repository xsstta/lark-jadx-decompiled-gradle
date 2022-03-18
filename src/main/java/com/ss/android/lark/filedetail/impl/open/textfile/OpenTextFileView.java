package com.ss.android.lark.filedetail.impl.open.textfile;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.filedetail.impl.open.C38292b;
import com.ss.android.lark.filedetail.impl.open.C38303c;
import com.ss.android.lark.filedetail.impl.open.OpenFileInfo;
import com.ss.android.lark.filedetail.impl.open.textfile.AbstractC38323a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.widget.p2932c.C58333b;
import com.ss.android.lark.widget.p2932c.C58339d;
import java.io.File;

public class OpenTextFileView implements AbstractC38323a.AbstractC38326b {

    /* renamed from: a */
    public AbstractC38322a f98396a;

    /* renamed from: b */
    public long f98397b;

    /* renamed from: c */
    private AbstractC38323a.AbstractC38326b.AbstractC38327a f98398c;

    /* renamed from: d */
    private Activity f98399d;

    /* renamed from: e */
    private Handler f98400e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private OpenFileInfo f98401f;

    /* renamed from: g */
    private LKUIStatus f98402g;

    /* renamed from: h */
    private boolean f98403h;
    protected FrameLayout mContentContainer;
    protected CommonTitleBar mTitleBar;
    protected WebView mWebView;

    /* renamed from: com.ss.android.lark.filedetail.impl.open.textfile.OpenTextFileView$a */
    public interface AbstractC38322a {
        /* renamed from: a */
        void mo140123a();

        /* renamed from: a */
        void mo140124a(OpenTextFileView openTextFileView);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f98396a = null;
        this.f98398c = null;
    }

    /* renamed from: b */
    public void mo140116b() {
        if (!this.f98403h) {
            this.f98402g.mo89838a(500);
            this.f98403h = true;
        }
    }

    /* renamed from: d */
    private void m150776d() {
        this.mWebView.setWebViewClient(new WebViewClient() {
            /* class com.ss.android.lark.filedetail.impl.open.textfile.OpenTextFileView.C383202 */

            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
            }

            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                OpenTextFileView.this.mo140116b();
            }

            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                OpenTextFileView.this.mo140111a();
            }
        });
        this.mWebView.setWebChromeClient(new WebChromeClient() {
            /* class com.ss.android.lark.filedetail.impl.open.textfile.OpenTextFileView.C383213 */

            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (i == 100 && System.currentTimeMillis() - OpenTextFileView.this.f98397b >= 1000) {
                    OpenTextFileView.this.f98397b = System.currentTimeMillis();
                    OpenTextFileView.this.mo140117c();
                }
            }
        });
    }

    /* renamed from: c */
    public void mo140117c() {
        this.f98403h = false;
        this.f98402g.mo89847d();
        WebBackForwardList copyBackForwardList = this.mWebView.copyBackForwardList();
        if (copyBackForwardList == null || copyBackForwardList.getSize() < 1) {
            mo140111a();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f98396a.mo140124a(this);
        this.f98402g = new LKUIStatus.C25680a(this.mContentContainer).mo89859a();
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.filedetail.impl.open.textfile.OpenTextFileView.View$OnClickListenerC383191 */

            public void onClick(View view) {
                OpenTextFileView.this.f98396a.mo140123a();
            }
        });
        m150776d();
    }

    /* renamed from: a */
    public void mo140111a() {
        new C25639g(this.f98399d).mo89248g(R.string.Lark_Legacy_Hint).mo89238b(true).mo89254m(R.string.Lark_Legacy_UnsupportedFormatPleaseTryToUseOtherApp).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_OpenInAnotherAppShorthand, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.filedetail.impl.open.textfile.$$Lambda$OpenTextFileView$vWTs8OhU0gPJ1A0MzAyE6caQQ */

            public final void onClick(DialogInterface dialogInterface, int i) {
                OpenTextFileView.m270542lambda$vWTs8OhU0gPJ1A0MzAyE6caQQ(OpenTextFileView.this, dialogInterface, i);
            }
        }).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_CancelOpen, (DialogInterface.OnClickListener) null).mo89239c();
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC38323a.AbstractC38326b.AbstractC38327a aVar) {
        this.f98398c = aVar;
    }

    @Override // com.ss.android.lark.filedetail.impl.open.textfile.AbstractC38323a.AbstractC38326b
    /* renamed from: a */
    public void mo140115a(String str) {
        if (!DesktopUtil.m144301a((Context) this.f98399d) && !TextUtils.isEmpty(str)) {
            this.mTitleBar.setTitle(str);
        }
    }

    @Override // com.ss.android.lark.filedetail.impl.open.textfile.AbstractC38323a.AbstractC38326b
    /* renamed from: a */
    public void mo140113a(OpenFileInfo openFileInfo) {
        String str;
        this.f98401f = openFileInfo;
        if (openFileInfo.mFileContent == null) {
            str = "";
        } else {
            str = openFileInfo.mFileContent.getFilePath();
        }
        if (TextUtils.isEmpty(str)) {
            Activity activity = this.f98399d;
            LKUIToast.show(activity, "文件地址错误：" + str);
            return;
        }
        this.mWebView.loadUrl("file://" + str);
    }

    public OpenTextFileView(AbstractC38322a aVar, Activity activity) {
        this.f98396a = aVar;
        this.f98399d = activity;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m150775a(DialogInterface dialogInterface, int i) {
        C38303c.m150712a(this.f98399d, new File(C57881t.m224631d(this.f98401f.mFileContent.getFilePath(), this.f98401f.mFileContent.getName())), this.f98401f.mFileContent.getMime(), this.f98401f.mFileContent.getKey());
        dialogInterface.dismiss();
    }

    @Override // com.ss.android.lark.filedetail.impl.open.textfile.AbstractC38323a.AbstractC38326b
    /* renamed from: a */
    public void mo140112a(View view, OpenFileInfo openFileInfo) {
        if (openFileInfo != null && openFileInfo.mFileContent != null) {
            C38292b bVar = new C38292b(this.f98399d, openFileInfo);
            if (!DesktopUtil.m144301a((Context) this.f98399d)) {
                C58339d.m226195a(this.f98399d, bVar.mo140069a());
            } else if (bVar.mo140069a().size() > 1) {
                C58333b.m226183a(this.f98399d, view, bVar.mo140069a().subList(0, bVar.mo140069a().size() - 1));
            }
        }
    }
}
