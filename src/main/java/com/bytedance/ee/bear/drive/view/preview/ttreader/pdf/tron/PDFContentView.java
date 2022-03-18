package com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.RequestPasswordView;
import com.bytedance.ee.log.C13479a;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFContentView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "passwordView", "Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/linkpassword/RequestPasswordView;", "viewDelegate", "Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFContentView$ViewDelegate;", "getViewDelegate", "()Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFContentView$ViewDelegate;", "setViewDelegate", "(Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFContentView$ViewDelegate;)V", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "setVisible", "", "visible", "showPasswordView", UpdateKey.STATUS, "", "showRenderView", "renderView", "Landroid/view/View;", "Companion", "ViewDelegate", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class PDFContentView extends FrameLayout {

    /* renamed from: a */
    public static final Companion f20052a = new Companion(null);

    /* renamed from: b */
    private RequestPasswordView f20053b;

    /* renamed from: c */
    private ViewDelegate f20054c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFContentView$ViewDelegate;", "", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "onPasswordInput", "password", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFContentView$b */
    public interface ViewDelegate {
        /* renamed from: a */
        void mo29045a(MotionEvent motionEvent);

        /* renamed from: a */
        void mo29046a(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFContentView$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFContentView$a */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final ViewDelegate getViewDelegate() {
        return this.f20054c;
    }

    public final void setViewDelegate(ViewDelegate bVar) {
        this.f20054c = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "password", "", "onActionDone"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFContentView$c */
    static final class C7441c implements RequestPasswordView.AbstractC10044a {

        /* renamed from: a */
        final /* synthetic */ PDFContentView f20055a;

        C7441c(PDFContentView pDFContentView) {
            this.f20055a = pDFContentView;
        }

        @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.RequestPasswordView.AbstractC10044a
        public final void onActionDone(String str) {
            ViewDelegate viewDelegate = this.f20055a.getViewDelegate();
            if (viewDelegate != null) {
                viewDelegate.mo29046a(str);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewDelegate bVar = this.f20054c;
        if (bVar != null) {
            bVar.mo29045a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setVisible(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
    }

    /* renamed from: a */
    public final void mo29040a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "renderView");
        C13479a.m54764b("PDFContentView", "showRenderView. ");
        ((ViewGroup) findViewById(R.id.view_content)).addView(view, 0, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public final void mo29039a(int i) {
        ViewParent viewParent;
        C13479a.m54764b("PDFContentView", "showPasswordView, status: " + i);
        if (this.f20053b == null) {
            RequestPasswordView requestPasswordView = new RequestPasswordView(getContext());
            this.f20053b = requestPasswordView;
            if (requestPasswordView != null) {
                requestPasswordView.setVisibility(0);
            }
            RequestPasswordView requestPasswordView2 = this.f20053b;
            if (requestPasswordView2 != null) {
                requestPasswordView2.setTips(R.string.Drive_Drive_FileNeedPassword);
            }
            RequestPasswordView requestPasswordView3 = this.f20053b;
            if (requestPasswordView3 != null) {
                requestPasswordView3.setOnInputPasswordListener(new C7441c(this));
            }
            RequestPasswordView requestPasswordView4 = this.f20053b;
            if (requestPasswordView4 != null) {
                requestPasswordView4.setTag("REQUEST_PASSWORD_VIEW_TAG");
            }
        }
        if (i == 1) {
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.view_content);
            if (viewGroup != null) {
                viewGroup.removeView(this.f20053b);
                return;
            }
            return;
        }
        RequestPasswordView requestPasswordView5 = this.f20053b;
        if (requestPasswordView5 != null) {
            viewParent = requestPasswordView5.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent == null) {
            ((ViewGroup) findViewById(R.id.view_content)).addView(this.f20053b, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        RequestPasswordView requestPasswordView6 = this.f20053b;
        if (requestPasswordView6 != null) {
            requestPasswordView6.mo38370b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PDFContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.drive_ttreader_pdf_view, (ViewGroup) this, true);
    }
}
