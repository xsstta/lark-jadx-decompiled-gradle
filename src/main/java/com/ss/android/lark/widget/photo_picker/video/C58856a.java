package com.ss.android.lark.widget.photo_picker.video;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.C1556v;
import com.larksuite.suite.R;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a;
import com.ss.android.lark.player.p2515d.AbstractC52127b;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;

/* renamed from: com.ss.android.lark.widget.photo_picker.video.a */
public class C58856a extends AbstractView$OnAttachStateChangeListenerC52070a implements AbstractC52127b {

    /* renamed from: a */
    private final IRequestCreator f145591a;

    /* renamed from: b */
    private final PhotoItem f145592b;

    /* renamed from: c */
    private ViewGroup f145593c;

    /* renamed from: d */
    private View f145594d;

    /* renamed from: e */
    private ImageView f145595e;

    @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
    /* renamed from: a */
    public void mo127016a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
    }

    @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
    /* renamed from: b */
    public void mo127022b(MotionEvent motionEvent) {
    }

    @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
    /* renamed from: c */
    public void mo127026c(MotionEvent motionEvent) {
    }

    @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
    /* renamed from: d */
    public void mo127027d() {
    }

    @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
    /* renamed from: d */
    public void mo127028d(MotionEvent motionEvent) {
    }

    /* renamed from: n */
    private boolean m228308n() {
        if (this.f145594d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo199454c() {
        mo178424a((Bundle) null);
        this.f145594d.setVisibility(0);
    }

    /* renamed from: m */
    private void m228307m() {
        if (m228308n()) {
            mo178426b((Bundle) null);
            this.f145594d.setVisibility(8);
            return;
        }
        mo178424a((Bundle) null);
        this.f145594d.setVisibility(0);
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h
    /* renamed from: a */
    public void mo127010a() {
        mo178430f();
        this.f145594d = this.f145593c.findViewById(R.id.play_label);
        this.f145595e = (ImageView) this.f145593c.findViewById(R.id.video_cover);
        this.f145591a.load(this.f145592b.getPhoto().getPath()).placeholder(R.drawable.__picker_ic_photo_black_48dp).error(R.drawable.__picker_ic_broken_image_black_48dp).into(this.f145595e);
    }

    @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
    /* renamed from: a */
    public void mo127015a(MotionEvent motionEvent) {
        m228307m();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a
    /* renamed from: a */
    public View mo127009a(Context context) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.local_controller_cover, (ViewGroup) null);
        this.f145593c = viewGroup;
        return viewGroup;
    }

    /* renamed from: a */
    public void mo199453a(float f) {
        if (m228308n()) {
            return;
        }
        if (f > 0.05f || f < 0.95f) {
            m228307m();
        }
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h, com.ss.android.lark.player.p2511a.AbstractC52071b
    /* renamed from: b */
    public void mo127021b(int i, Bundle bundle) {
        switch (i) {
            case -66018:
                mo178425b(0);
                return;
            case -66017:
                mo178425b(8);
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h, com.ss.android.lark.player.p2511a.AbstractC52071b
    /* renamed from: a */
    public void mo127014a(int i, Bundle bundle) {
        switch (i) {
            case -99016:
                m228307m();
                return;
            case -99015:
                C1556v.m7130a(this.f145593c);
                this.f145595e.setVisibility(8);
                C1556v.m7132b(this.f145593c);
                return;
            default:
                return;
        }
    }

    public C58856a(Context context, IRequestCreator iRequestCreator, PhotoItem photoItem) {
        super(context);
        this.f145591a = iRequestCreator;
        this.f145592b = photoItem;
    }
}
