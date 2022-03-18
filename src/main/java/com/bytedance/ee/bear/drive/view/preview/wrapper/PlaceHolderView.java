package com.bytedance.ee.bear.drive.view.preview.wrapper;

import android.content.Context;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.drive.view.preview.block.DriveBlockPreviewVM;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.util.io.C13672c;
import com.larksuite.suite.R;

public class PlaceHolderView extends FrameLayout {

    /* renamed from: a */
    private ViewGroup f20376a;

    /* renamed from: b */
    private SpaceEmptyState f20377b;

    /* renamed from: c */
    private BearLottieView f20378c;

    /* renamed from: d */
    private SpaceEmptyState f20379d;

    /* renamed from: e */
    private SpaceEmptyState f20380e;

    /* renamed from: f */
    private AbstractC7541a f20381f;

    /* renamed from: g */
    private final long f20382g = 800;

    /* renamed from: h */
    private long f20383h;

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.wrapper.PlaceHolderView$a */
    public interface AbstractC7541a {
        void onClick();
    }

    /* renamed from: b */
    public void mo29437b() {
        setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20378c.cancelAnimation();
    }

    /* renamed from: c */
    private boolean m30205c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f20383h < 800) {
            return false;
        }
        this.f20383h = uptimeMillis;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29435a() {
        LayoutInflater.from(getContext()).inflate(R.layout.drive_preview_unsupport_view, this);
        this.f20376a = (ViewGroup) findViewById(R.id.drive_place_holder_container);
        this.f20377b = (SpaceEmptyState) findViewById(R.id.drive_place_holder_icon);
        this.f20378c = (BearLottieView) findViewById(R.id.drive_place_holder_lottie_view);
        this.f20379d = (SpaceEmptyState) findViewById(R.id.drive_place_holder_message);
        SpaceEmptyState spaceEmptyState = (SpaceEmptyState) findViewById(R.id.drive_place_holder_open_external);
        this.f20380e = spaceEmptyState;
        spaceEmptyState.setTag(R.id.drive_preview_block_fun_location_tag, true);
        this.f20380e.setPrimaryClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.view.preview.wrapper.$$Lambda$PlaceHolderView$xUmJciyiu0FmJ1wFHsYDDPxmmaU */

            public final void onClick(View view) {
                PlaceHolderView.this.m30204a((PlaceHolderView) view);
            }
        });
    }

    public void setOnBtnOpenExternalClickListener(AbstractC7541a aVar) {
        this.f20381f = aVar;
    }

    public void setBtnEnable(boolean z) {
        this.f20380e.setPrimaryActionEnabled(z);
    }

    public void setBtnOpenExternalEnable(boolean z) {
        this.f20380e.setPrimaryActionEnabled(z);
    }

    public void setBtnText(String str) {
        this.f20380e.setPrimaryText(str);
    }

    public void setNoExportPermissionTips(String str) {
        this.f20380e.setDesc(str);
    }

    public void setNoExportPermissionTipsVisibility(boolean z) {
        this.f20380e.mo90951c(z);
    }

    public void setTipsText(SpannableString spannableString) {
        this.f20379d.setTitle(spannableString);
    }

    public PlaceHolderView(Context context) {
        super(context);
        mo29435a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30204a(View view) {
        AbstractC7541a aVar;
        if (m30205c() && (aVar = this.f20381f) != null) {
            aVar.onClick();
        }
    }

    public void setBtnOpenExternalVisibility(boolean z) {
        this.f20380e.mo90951c(!z);
        this.f20380e.mo90952d(z);
    }

    public void setTipsText(String str) {
        this.f20379d.setTitle(str);
    }

    public void setImagePlaceHolder(int i) {
        this.f20378c.setVisibility(8);
        this.f20377b.setImageRes(Integer.valueOf(i));
    }

    public void setLottiePlaceHolder(int i) {
        this.f20378c.setVisibility(0);
        this.f20377b.getImageView().setVisibility(8);
        this.f20378c.setAnimation(i);
        this.f20378c.playAnimation();
    }

    public void setSizeInBytes(long j) {
        String str;
        if (j > 0) {
            str = C13672c.m55479a(getContext(), j);
        } else {
            str = null;
        }
        this.f20379d.setDesc(str);
    }

    /* renamed from: a */
    public void mo29436a(DriveBlockPreviewVM.BlockState blockState) {
        if (blockState == DriveBlockPreviewVM.BlockState.BLOCK) {
            this.f20376a.setScaleX(0.7f);
            this.f20376a.setScaleY(0.7f);
            this.f20379d.setScaleX(0.85f);
            this.f20379d.setScaleY(0.85f);
            this.f20380e.setVisibility(8);
        } else if (blockState == DriveBlockPreviewVM.BlockState.FULLSCREEN) {
            this.f20380e.setVisibility(0);
            this.f20380e.setScaleX(0.9f);
            this.f20380e.setScaleY(0.9f);
        }
    }

    public PlaceHolderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo29435a();
    }

    public PlaceHolderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo29435a();
    }
}
