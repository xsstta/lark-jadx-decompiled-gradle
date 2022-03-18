package com.bytedance.ee.bear.drive.view.preview.loadingview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.thread.C11678b;
import com.larksuite.suite.R;
import io.reactivex.Observable;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.AbstractC68309a;
import java.util.concurrent.TimeUnit;

public class LoadingAnimView extends RelativeLayout {

    /* renamed from: a */
    public BearLottieView f19900a;

    /* renamed from: b */
    private C68289a f19901b = new C68289a();

    /* renamed from: c */
    private TextView f19902c;

    /* renamed from: a */
    public void mo28899a() {
        this.f19901b.mo237935a();
        this.f19900a.cancelAnimation();
        setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f19900a.cancelAnimation();
        this.f19901b.mo237935a();
        super.onDetachedFromWindow();
    }

    public void setTipText(String str) {
        this.f19902c.setText(str);
    }

    public LoadingAnimView(Context context) {
        super(context);
        mo28901a(context);
    }

    /* renamed from: a */
    public void mo28900a(long j) {
        setVisibility(8);
        this.f19901b.mo237937a(Observable.timer(j, TimeUnit.MILLISECONDS).observeOn(C11678b.m48481e()).doOnComplete(new AbstractC68309a() {
            /* class com.bytedance.ee.bear.drive.view.preview.loadingview.LoadingAnimView.C74011 */

            @Override // io.reactivex.functions.AbstractC68309a
            public void run() throws Exception {
                LoadingAnimView.this.setVisibility(0);
                LoadingAnimView.this.f19900a.playAnimation();
            }
        }).subscribe());
    }

    /* renamed from: a */
    public void mo28901a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.drive_loading_anim_view, this);
        this.f19900a = (BearLottieView) findViewById(R.id.loading_anim_view);
        this.f19902c = (TextView) findViewById(R.id.loading_text);
    }

    public LoadingAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo28901a(context);
    }

    public LoadingAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo28901a(context);
    }
}
