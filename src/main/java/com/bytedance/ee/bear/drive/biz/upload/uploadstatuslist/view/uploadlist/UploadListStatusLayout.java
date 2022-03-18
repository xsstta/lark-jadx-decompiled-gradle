package com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.uploadlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.p337a.C6802b;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.progress.UDProgress;
import com.larksuite.suite.R;

public class UploadListStatusLayout extends FrameLayout {

    /* renamed from: a */
    public TextView f18553a;

    /* renamed from: b */
    private LottieAnimationView f18554b;

    /* renamed from: c */
    private ImageView f18555c;

    /* renamed from: d */
    private UDProgress f18556d;

    /* renamed from: com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.uploadlist.UploadListStatusLayout$a */
    public interface AbstractC6823a {
        void onRetryClick(View view, int i, C6802b bVar);
    }

    /* renamed from: a */
    private void m26944a() {
        this.f18554b.setVisibility(0);
        this.f18554b.setAnimation("drive_lottie_file_upload_done.json");
        this.f18554b.setRepeatCount(0);
        this.f18554b.playAnimation();
    }

    /* renamed from: b */
    private void m26946b() {
        C13479a.m54764b("UpdateListTAG", "close lottie image");
        this.f18555c.setVisibility(0);
        this.f18555c.setImageResource(R.drawable.drive_upload_finish_image);
    }

    public UploadListStatusLayout(Context context) {
        super(context);
    }

    public UploadListStatusLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26945a(context, attributeSet);
    }

    /* renamed from: a */
    private void m26945a(Context context, AttributeSet attributeSet) {
        inflate(context, R.layout.drive_uploadlist_state, this);
        this.f18554b = (LottieAnimationView) findViewById(R.id.uploadlist_lottie);
        this.f18553a = (TextView) findViewById(R.id.retry_text_view);
        this.f18556d = (UDProgress) findViewById(R.id.upload_item_progress_bar);
        this.f18555c = (ImageView) findViewById(R.id.upload_finish_image);
    }

    public UploadListStatusLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26945a(context, attributeSet);
    }

    /* renamed from: a */
    public void mo26866a(int i, int i2, boolean z) {
        if (i == 1) {
            this.f18556d.setVisibility(8);
            this.f18553a.setVisibility(0);
            this.f18553a.setClickable(true);
            this.f18556d.setProgress(0);
            this.f18554b.setVisibility(8);
            this.f18555c.setVisibility(8);
        } else if (i == 2) {
            this.f18553a.setClickable(false);
            this.f18553a.setVisibility(8);
            this.f18556d.setVisibility(8);
            this.f18556d.setProgress(0);
            this.f18554b.setVisibility(8);
            this.f18555c.setVisibility(8);
        } else if (i == 3) {
            this.f18553a.setClickable(false);
            this.f18553a.setVisibility(8);
            this.f18556d.setVisibility(0);
            this.f18556d.setProgress(i2);
            this.f18554b.setVisibility(8);
            this.f18555c.setVisibility(8);
        } else if (i != 4) {
            this.f18553a.setClickable(false);
            this.f18553a.setVisibility(8);
            this.f18556d.setVisibility(0);
            this.f18556d.setProgress(0);
            this.f18554b.setVisibility(8);
            this.f18555c.setVisibility(8);
        } else {
            this.f18553a.setClickable(false);
            this.f18553a.setVisibility(8);
            this.f18556d.setProgress(i2);
            this.f18556d.setVisibility(8);
            this.f18554b.setVisibility(8);
            this.f18555c.setVisibility(8);
            if (z) {
                m26944a();
            } else {
                m26946b();
            }
        }
    }
}
