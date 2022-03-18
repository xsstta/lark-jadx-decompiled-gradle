package com.bytedance.ee.bear.drive.view.preview.loadingview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.ee.bear.thread.C11678b;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import io.reactivex.Observable;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.AbstractC68309a;
import java.util.concurrent.TimeUnit;

public class FileLoadingView extends FrameLayout {

    /* renamed from: a */
    private ViewGroup f19894a;

    /* renamed from: b */
    private ProgressBar f19895b;

    /* renamed from: c */
    private ImageView f19896c;

    /* renamed from: d */
    private TextView f19897d;

    /* renamed from: e */
    private C68289a f19898e = new C68289a();

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19898e.mo237935a();
    }

    /* renamed from: a */
    public void mo28894a() {
        int a = C57582a.m223600a(42);
        this.f19896c.getLayoutParams().width = a;
        this.f19896c.getLayoutParams().height = a;
        this.f19895b.getLayoutParams().width = C57582a.m223600a(188);
        this.f19894a.setPadding(0, 0, 0, 0);
        requestLayout();
    }

    /* renamed from: b */
    private void m29590b() {
        LayoutInflater.from(getContext()).inflate(R.layout.drive_loading_view, this);
        this.f19894a = (ViewGroup) findViewById(R.id.loading_root);
        this.f19895b = (ProgressBar) findViewById(R.id.progress_bar);
        this.f19896c = (ImageView) findViewById(R.id.placeholder);
        this.f19897d = (TextView) findViewById(R.id.text);
        this.f19895b.setMax(100);
        this.f19895b.setProgress(0);
        setVisibility(4);
    }

    /* renamed from: a */
    public void mo28895a(int i) {
        mo28896a(400, i);
    }

    public FileLoadingView(Context context) {
        super(context);
        m29590b();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m29591b(int i) throws Exception {
        setVisibility(0);
        this.f19896c.setImageDrawable(getResources().getDrawable(i, null));
    }

    public void setProgress(int i) {
        if (i <= 0) {
            this.f19895b.setProgress(0);
        } else if (i >= 100) {
            this.f19895b.setProgress(100);
        } else {
            this.f19895b.setProgress(i);
        }
    }

    public FileLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m29590b();
    }

    /* renamed from: a */
    public void mo28896a(long j, int i) {
        this.f19898e.mo237937a(Observable.timer(j, TimeUnit.MILLISECONDS).observeOn(C11678b.m48481e()).doOnComplete(new AbstractC68309a(i) {
            /* class com.bytedance.ee.bear.drive.view.preview.loadingview.$$Lambda$FileLoadingView$3YSESUCQozPsknyb71lncDKbnQ0 */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.AbstractC68309a
            public final void run() {
                FileLoadingView.this.m29591b(this.f$1);
            }
        }).subscribe());
    }

    public FileLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m29590b();
    }
}
