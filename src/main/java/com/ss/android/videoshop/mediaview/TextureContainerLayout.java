package com.ss.android.videoshop.mediaview;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.UIUtils;
import com.ss.android.videoshop.p3199e.C64159a;
import com.ss.android.videoshop.widget.C64193b;
import com.ss.android.videoshop.widget.TextureVideoView;

public class TextureContainerLayout extends FrameLayout {

    /* renamed from: a */
    private TextureVideoView f162215a;

    /* renamed from: b */
    private View f162216b;

    /* renamed from: c */
    private int f162217c;

    /* renamed from: d */
    private int f162218d;

    /* renamed from: e */
    private int f162219e;

    public View getBlackCoverView() {
        return this.f162216b;
    }

    public int getTextureLayout() {
        return this.f162219e;
    }

    public TextureVideoView getTextureVideoView() {
        return this.f162215a;
    }

    /* renamed from: a */
    private void m252356a() {
        if (Build.VERSION.SDK_INT == 29 && (Build.MODEL.equals("TAH-AN00") || Build.MODEL.equals("TAH-N29") || Build.MODEL.equals("RLI-AN00") || Build.MODEL.equals("RLI-N29") || Build.MODEL.equals("TAH-AN00m") || Build.MODEL.equals("RHA-AN00m") || Build.MODEL.equals("MRX-AL09") || Build.MODEL.equals("MRX-AL19") || Build.MODEL.equals("MRX-AN19") || Build.MODEL.equals("MRX-W09") || Build.MODEL.equals("IN2010") || Build.MODEL.equals("MRX-W19"))) {
            this.f162215a.setAlpha(1.0f);
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.f162215a.setAlpha(0.99f);
        }
    }

    public TextureContainerLayout(Context context) {
        super(context);
        m252357a(context);
    }

    public void setTextureLayout(int i) {
        mo222463a(i, (C64193b) null);
    }

    /* renamed from: a */
    private void m252357a(Context context) {
        setClipChildren(false);
        this.f162215a = new TextureVideoView(context);
        m252356a();
        setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.f162215a, layoutParams);
        UIUtils.setViewVisibility(this.f162215a, 8);
        View view = new View(context);
        this.f162216b = view;
        view.setBackgroundColor(-16777216);
        addView(this.f162216b, new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public void mo222464a(TextureVideoView textureVideoView) {
        if (textureVideoView != null) {
            UIUtils.detachFromParent(textureVideoView);
            UIUtils.detachFromParent(this.f162215a);
            this.f162215a = textureVideoView;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            addView(textureVideoView, 0, layoutParams);
            m252356a();
            this.f162218d = 0;
            this.f162217c = 0;
        }
    }

    public TextureContainerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m252357a(context);
    }

    /* renamed from: a */
    public void mo222463a(int i, C64193b bVar) {
        this.f162219e = i;
        TextureVideoView textureVideoView = this.f162215a;
        if (textureVideoView != null) {
            textureVideoView.mo222532a(i, bVar);
        }
    }

    /* renamed from: a */
    public void mo222462a(int i, int i2) {
        if (this.f162217c != i || this.f162218d != i2) {
            this.f162217c = i;
            this.f162218d = i2;
            C64159a.m252083b("TextureContainerLayout", "setVideoSize videoWidth:" + i + " videoHeight:" + i2);
            TextureVideoView textureVideoView = this.f162215a;
            if (textureVideoView != null) {
                textureVideoView.mo222531a(i, i2);
            }
        }
    }

    public TextureContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m252357a(context);
    }
}
