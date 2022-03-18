package com.ss.android.vc.meeting.module.meetingdialog.labs.page;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62216c;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62300w;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62260i;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62293r;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.page.d */
public abstract class AbstractC62283d implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: h */
    protected C62293r f156489h;

    /* renamed from: i */
    protected AbstractC62300w f156490i;

    /* renamed from: j */
    protected boolean f156491j;

    /* renamed from: k */
    protected AbstractC62216c.AbstractC62218b.AbstractC62220b f156492k;

    /* renamed from: a */
    public abstract String mo215377a(Context context);

    /* renamed from: a */
    public abstract void mo215389a(ViewGroup viewGroup);

    /* renamed from: a */
    public abstract void mo215391a(C62260i iVar);

    /* renamed from: a */
    public abstract void mo215393a(boolean z);

    /* renamed from: b */
    public abstract void mo215395b(ViewGroup viewGroup);

    public void bO_() {
        this.f156491j = true;
    }

    public abstract void bP_();

    /* renamed from: c */
    public boolean mo215385c() {
        return false;
    }

    /* renamed from: e */
    public abstract void mo215396e();

    /* renamed from: g */
    public abstract View mo215398g();

    /* renamed from: k */
    public void mo215408k() {
        this.f156491j = false;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    /* renamed from: a */
    public void mo215407a(C62293r rVar, AbstractC62216c.AbstractC62218b.AbstractC62220b bVar) {
        this.f156489h = rVar;
        this.f156492k = bVar;
    }

    public AbstractC62283d(C62293r rVar, AbstractC62216c.AbstractC62218b.AbstractC62220b bVar, AbstractC62300w wVar) {
        this.f156489h = rVar;
        this.f156492k = bVar;
        this.f156490i = wVar;
    }
}
