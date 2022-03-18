package com.bytedance.ee.bear.list.docstate;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.suite.R;

public class SyncStateView extends LKUIRoundedImageView2 {

    /* renamed from: a */
    public boolean f22309a;

    /* renamed from: b */
    private RotateAnimation f22310b;

    /* renamed from: c */
    private final Runnable f22311c = new Runnable() {
        /* class com.bytedance.ee.bear.list.docstate.SyncStateView.RunnableC82711 */

        public void run() {
            if (SyncStateView.this.f22309a) {
                SyncStateView.this.setSyncState(7);
            } else {
                SyncStateView.this.setSyncState(0);
            }
        }
    };

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f22311c);
        RotateAnimation rotateAnimation = this.f22310b;
        if (rotateAnimation != null) {
            rotateAnimation.cancel();
        }
    }

    /* renamed from: a */
    public void mo32364a() {
        setBorderColor(getContext().getResources().getColor(R.color.space_kit_n00));
    }

    /* renamed from: b */
    private void m33919b() {
        setVisibility(8);
        setBorderWidthInDp(1.0f);
        setRadiusInDp(6.0f);
        setBorderColor(getContext().getResources().getColor(R.color.space_kit_trans));
    }

    /* renamed from: c */
    private void m33920c() {
        if (this.f22310b == null) {
            this.f22310b = new RotateAnimation(BitmapDescriptorFactory.HUE_RED, 360.0f, 1, 0.5f, 1, 0.5f);
        }
        this.f22310b.reset();
        this.f22310b.setDuration(800);
        this.f22310b.setInterpolator(new LinearInterpolator());
        this.f22310b.setRepeatCount(-1);
        setAnimation(this.f22310b);
        this.f22310b.startNow();
    }

    public void setManualOffline(boolean z) {
        this.f22309a = z;
    }

    public SyncStateView(Context context) {
        super(context);
        m33919b();
    }

    public void setSyncState(int i) {
        C13479a.m54764b("SyncStateView", "setSyncState()...state = " + i + ", isManualOffline = " + this.f22309a);
        setVisibility(8);
        clearAnimation();
        switch (i) {
            case 1:
                setImageResource(R.drawable.ic_icon_tool_waituploading);
                setVisibility(0);
                return;
            case 2:
            case 6:
                setImageResource(R.drawable.ic_icon_tool_synching);
                setVisibility(0);
                m33920c();
                return;
            case 3:
                setImageResource(R.drawable.ic_icon_tool_uploading);
                setVisibility(0);
                removeCallbacks(this.f22311c);
                postDelayed(this.f22311c, 1000);
                return;
            case 4:
            case 8:
                setImageResource(R.drawable.ic_icon_tool_offlinefail);
                setVisibility(0);
                return;
            case 5:
                setImageResource(R.drawable.ic_icon_tool_waitdownload);
                setVisibility(0);
                return;
            case 7:
                setImageResource(R.drawable.ic_icon_tool_offlinesuccess);
                setVisibility(0);
                return;
            default:
                return;
        }
    }

    public SyncStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m33919b();
    }

    public SyncStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m33919b();
    }
}
