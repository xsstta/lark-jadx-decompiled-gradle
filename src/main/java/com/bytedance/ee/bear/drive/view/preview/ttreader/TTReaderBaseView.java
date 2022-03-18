package com.bytedance.ee.bear.drive.view.preview.ttreader;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.drive.biz.comment.area.CommentRectF;
import com.bytedance.ee.bear.drive.biz.preview.show.C6712a;
import com.bytedance.ee.bear.drive.report.C7128a;
import com.bytedance.ee.bear.drive.view.preview.AbstractC7216a;
import com.bytedance.ee.bear.drive.view.preview.AbstractC7254b;
import com.bytedance.ee.bear.drive.view.preview.AbstractC7256c;
import com.bytedance.ee.bear.drive.view.preview.ttreader.C7437a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7557g;
import com.bytedance.ee.bear.drive.view.preview.wrapper.ViewOwner;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.RequestPasswordView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.plugin.common.ttreader.ITTReaderViewWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

public abstract class TTReaderBaseView extends FrameLayout implements AbstractC7216a, AbstractC7254b, AbstractC7549a {

    /* renamed from: a */
    protected ITTReaderViewWrapper f20014a;

    /* renamed from: b */
    protected C7437a f20015b;

    /* renamed from: c */
    protected C7553d f20016c;

    /* renamed from: d */
    protected C7555f f20017d;

    /* renamed from: e */
    private RequestPasswordView f20018e;

    /* renamed from: f */
    private AbstractC7256c f20019f;

    /* renamed from: g */
    private boolean f20020g;

    /* renamed from: h */
    private AbstractC7216a.AbstractC7217a f20021h;

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    /* renamed from: a */
    public /* synthetic */ void mo28370a(Configuration configuration) {
        AbstractC7549a.CC.$default$a(this, configuration);
    }

    /* renamed from: d */
    public abstract void mo29013d(String str);

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public String getCommentQuote() {
        return null;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public View getView() {
        return this;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public CommentRectF hideCreateComment() {
        return null;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onAreaClick() {
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onBackPressed() {
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void onCommentInputPanelClose() {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void onCommentListPanelClose() {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void showSelectedComment(String str) {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void showThumbnailPreview() {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void updateComment(ArrayList<CommentRectF> arrayList) {
    }

    /* renamed from: b */
    private void mo29017b() {
        this.f20015b = new C7437a();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C7555f fVar = this.f20017d;
        if (fVar == null || !fVar.isBlockViewChanging()) {
            super.onDetachedFromWindow();
            ITTReaderViewWrapper iTTReaderViewWrapper = this.f20014a;
            if (iTTReaderViewWrapper != null) {
                iTTReaderViewWrapper.closeBook();
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void show() {
        AbstractC7256c cVar = this.f20019f;
        if (cVar != null) {
            cVar.mo26117a();
        }
        C6712a.m26463a(this.f20017d, this);
        mo29013d(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29006a() {
        if (this.f20018e == null) {
            RequestPasswordView requestPasswordView = new RequestPasswordView(getContext());
            this.f20018e = requestPasswordView;
            requestPasswordView.setVisibility(0);
            this.f20018e.setOnInputPasswordListener(new RequestPasswordView.AbstractC10044a() {
                /* class com.bytedance.ee.bear.drive.view.preview.ttreader.$$Lambda$8AkKsa0YQVBY5c3r9tRFIKchvnw */

                @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.RequestPasswordView.AbstractC10044a
                public final void onActionDone(String str) {
                    TTReaderBaseView.this.mo29013d(str);
                }
            });
            this.f20018e.setTag("REQUEST_PASSWORD_VIEW_TAG");
        }
        if (findViewWithTag("REQUEST_PASSWORD_VIEW_TAG") == null) {
            addView(this.f20018e, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        this.f20018e.mo38370b();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7216a
    public void setClickLinkCallback(AbstractC7216a.AbstractC7217a aVar) {
        this.f20021h = aVar;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7262d
    public void setOnShowViewTrackEventCallback(AbstractC7256c cVar) {
        this.f20019f = cVar;
    }

    public TTReaderBaseView(Context context) {
        super(context);
        mo29017b();
    }

    public void setFullScreenManager(C7437a.AbstractC7440b bVar) {
        this.f20015b.mo29031a(bVar);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7254b
    /* renamed from: a */
    public void mo28333a(boolean z) {
        this.f20020g = z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f20015b.mo29029a(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void onSetup(ViewOwner viewOwner) {
        this.f20017d = (C7555f) viewOwner.viewModel(C7555f.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo29012c(String str) {
        if (TextUtils.isEmpty(str)) {
            C13479a.m54758a("TTReaderBaseView", "onClickLink link is empty");
            return;
        }
        AbstractC7216a.AbstractC7217a aVar = this.f20021h;
        if (aVar != null) {
            aVar.onClickLink(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29011b(String str) {
        RequestPasswordView requestPasswordView;
        if (!(findViewWithTag("REQUEST_PASSWORD_VIEW_TAG") == null || (requestPasswordView = this.f20018e) == null)) {
            requestPasswordView.clearFocus();
            removeView(this.f20018e);
        }
        AbstractC7256c cVar = this.f20019f;
        if (cVar != null) {
            cVar.mo26118a(str);
        }
        C6712a.m26464b(this.f20017d, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29008a(String str) {
        C13479a.m54764b("TTReaderBaseView", "trackOpenDowngradeSuccess, openType: " + str);
        if (this.f20017d != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("open_type", str);
            hashMap.put("source_type", String.valueOf(3));
            this.f20017d.liveInnerReportMsg().mo28018a(C7557g.m30301a(22, hashMap));
        }
    }

    /* renamed from: a */
    public void mo29007a(C7553d dVar, C7555f fVar) {
        this.f20016c = dVar;
        this.f20017d = fVar;
    }

    public TTReaderBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo29017b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29009a(String str, Throwable th) {
        C13479a.m54773d("TTReaderBaseView", "trackOpenDowngradeFail, openType: " + str, th);
        if (this.f20017d != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("open_type", str);
            hashMap.put("source_type", String.valueOf(3));
            hashMap.put("error_message", C7128a.m28540a(th));
            this.f20017d.liveInnerReportMsg().mo28018a(C7557g.m30301a(21, hashMap));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29010a(String str, JSONObject jSONObject) {
        C13479a.m54772d("TTReaderBaseView", "reportEvent: " + str + "  jsonObject: " + jSONObject);
        C5234y.m21391b().mo21080a(str, jSONObject);
    }

    public TTReaderBaseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo29017b();
    }
}
