package com.bytedance.ee.bear.middleground.calendar.editor;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.middleground.calendar.toolbar.C8929a;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

public class WebEditorToolbar extends LinearLayout implements Handler.Callback, View.OnTouchListener {

    /* renamed from: a */
    private C8929a f24073a = new C8929a();

    /* renamed from: b */
    private WebView f24074b;

    /* renamed from: c */
    private Handler f24075c = new Handler(Looper.getMainLooper(), this);

    /* renamed from: d */
    private int f24076d;

    /* renamed from: e */
    private boolean f24077e = false;

    /* renamed from: f */
    private boolean f24078f = false;

    public C8929a getToolbarAdapter() {
        return this.f24073a;
    }

    /* renamed from: e */
    private void m37365e() {
        m37366f();
        Message.obtain(this.f24075c, 1).sendToTarget();
    }

    /* renamed from: f */
    private void m37366f() {
        this.f24075c.removeMessages(0);
        this.f24075c.removeMessages(1);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WebView webView = this.f24074b;
        if (webView != null) {
            webView.setOnTouchListener(null);
        }
        m37366f();
    }

    /* renamed from: d */
    private void m37364d() {
        m37366f();
        Message message = new Message();
        message.what = 0;
        this.f24075c.sendMessageDelayed(message, 450);
    }

    /* renamed from: g */
    private void m37367g() {
        if (m37368h()) {
            this.f24078f = true;
            this.f24074b.scrollBy(0, getHeight());
        }
    }

    /* renamed from: i */
    private void m37369i() {
        if (this.f24078f) {
            this.f24078f = false;
            this.f24074b.scrollBy(0, getHeight() * -1);
        }
    }

    /* renamed from: a */
    public void mo34212a() {
        if (getVisibility() != 0) {
            C13479a.m54772d("DocEditorToolbar", "showFormatBar: ");
            setVisibility(0);
        }
    }

    /* renamed from: b */
    public void mo34214b() {
        if (getVisibility() != 8) {
            C13479a.m54772d("DocEditorToolbar", "hideFormatBar: ");
            setVisibility(8);
        }
    }

    /* renamed from: h */
    private boolean m37368h() {
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        if (this.f24074b == null || getVisibility() != 0 || this.f24076d <= rect.bottom - getHeight()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m37363c() {
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        mo34214b();
        setBackgroundColor(getResources().getColor(R.color.bg_body));
        setOrientation(1);
        View view = new View(getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
        view.setBackgroundColor(getResources().getColor(R.color.line_border_component));
        View view2 = new View(getContext());
        view2.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
        view2.setBackgroundColor(getResources().getColor(R.color.line_border_component));
        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(view);
        addView(recyclerView);
        addView(view2);
        m37362a(recyclerView);
    }

    public void setCurrentWebView(WebView webView) {
        this.f24074b = webView;
        webView.setOnTouchListener(this);
    }

    public WebEditorToolbar(Context context) {
        super(context);
        m37363c();
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m37367g();
            return false;
        } else if (message.what != 1) {
            return false;
        } else {
            m37369i();
            return false;
        }
    }

    /* renamed from: a */
    private void m37362a(RecyclerView recyclerView) {
        recyclerView.setAdapter(this.f24073a);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        recyclerView.addItemDecoration(new RecyclerView.AbstractC1335d() {
            /* class com.bytedance.ee.bear.middleground.calendar.editor.WebEditorToolbar.C89191 */

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                int i;
                int i2;
                if (recyclerView.getChildLayoutPosition(view) == 0) {
                    i = WebEditorToolbar.this.getResources().getDimensionPixelSize(R.dimen.calendar_toolbar_edge_padding);
                } else {
                    i = 0;
                }
                int dimensionPixelSize = WebEditorToolbar.this.getResources().getDimensionPixelSize(R.dimen.calendar_toolbar_padding);
                if (state.getItemCount() - 1 == recyclerView.getChildLayoutPosition(view)) {
                    i2 = WebEditorToolbar.this.getResources().getDimensionPixelSize(R.dimen.calendar_toolbar_edge_padding);
                } else {
                    i2 = WebEditorToolbar.this.getResources().getDimensionPixelOffset(R.dimen.calendar_toolbar_item_gap);
                }
                rect.set(i, dimensionPixelSize, i2, WebEditorToolbar.this.getResources().getDimensionPixelSize(R.dimen.calendar_toolbar_padding));
            }
        });
        recyclerView.setOverScrollMode(2);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.bytedance.ee.bear.middleground.calendar.editor.WebEditorToolbar.ViewTreeObserver$OnGlobalLayoutListenerC89202 */

            public void onGlobalLayout() {
                boolean c = C10548d.m43704c(WebEditorToolbar.this);
                C13479a.m54772d("DocEditorToolbar", "isKeyboardShowing: " + c);
                if (c) {
                    C13479a.m54772d("DocEditorToolbar", "show bottom format tools");
                    WebEditorToolbar.this.mo34212a();
                } else {
                    C13479a.m54772d("DocEditorToolbar", "hide bottom format tools");
                    WebEditorToolbar.this.mo34214b();
                }
                WebEditorToolbar.this.mo34213a(c);
            }
        });
    }

    /* renamed from: a */
    public void mo34213a(boolean z) {
        boolean z2 = this.f24077e;
        if (!z2 && z) {
            m37364d();
        } else if (!z && z2) {
            m37365e();
        }
        this.f24077e = z;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f24076d = (int) motionEvent.getRawY();
        return false;
    }

    public WebEditorToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m37363c();
    }

    public WebEditorToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m37363c();
    }
}
