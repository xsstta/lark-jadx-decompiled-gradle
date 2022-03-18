package com.bytedance.ee.bear.drive.view.preview.loadingview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.universedesign.SpaceLoadingImage;
import com.larksuite.suite.R;
import io.reactivex.Observable;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.AbstractC68309a;
import java.util.concurrent.TimeUnit;

public class BlockLoadingView extends FrameLayout {

    /* renamed from: a */
    private C68289a f19891a = new C68289a();

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f19891a.mo237935a();
        super.onDetachedFromWindow();
    }

    public BlockLoadingView(Context context) {
        super(context);
        mo28892a(context);
    }

    /* renamed from: a */
    public void mo28892a(Context context) {
        setBackgroundDrawable(context.getResources().getDrawable(R.drawable.drive_bg_file_block_loading_bg));
        addView(new SpaceLoadingImage(context));
    }

    /* renamed from: a */
    public void mo28891a(long j) {
        setVisibility(8);
        this.f19891a.mo237937a(Observable.timer(j, TimeUnit.MILLISECONDS).observeOn(C11678b.m48481e()).doOnComplete(new AbstractC68309a() {
            /* class com.bytedance.ee.bear.drive.view.preview.loadingview.BlockLoadingView.C74001 */

            @Override // io.reactivex.functions.AbstractC68309a
            public void run() throws Exception {
                BlockLoadingView.this.setVisibility(0);
            }
        }).subscribe());
    }

    public BlockLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo28892a(context);
    }

    public BlockLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo28892a(context);
    }
}
