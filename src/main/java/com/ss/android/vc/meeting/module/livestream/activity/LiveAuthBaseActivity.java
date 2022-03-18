package com.ss.android.vc.meeting.module.livestream.activity;

import android.content.BroadcastReceiver;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.p034e.p035a.C0978a;
import com.ss.android.vc.common.base.BaseActivity;
import com.ss.android.vc.meeting.module.livestream.widget.DialogC62111b;
import java.util.List;

public class LiveAuthBaseActivity extends BaseActivity {

    /* renamed from: c */
    protected boolean f155837c = true;

    /* renamed from: d */
    protected DialogC62111b f155838d;

    /* renamed from: e */
    protected C0978a f155839e;

    /* renamed from: f */
    protected BroadcastReceiver f155840f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo214702a() {
    }

    /* renamed from: l */
    public void mo214731l() {
        DialogC62111b bVar = this.f155838d;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onDestroy() {
        mo214731l();
        super.onDestroy();
        this.f155839e.mo4990a(this.f155840f);
    }

    /* renamed from: j */
    public DialogC62111b mo214729j() {
        if (this.f155838d == null) {
            mo214730k();
        }
        if (!this.f155838d.isShowing()) {
            this.f155838d.show();
        }
        return this.f155838d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo214730k() {
        DialogC62111b bVar = new DialogC62111b(this, this.f155837c);
        this.f155838d = bVar;
        bVar.setOnKeyListener(new DialogInterface.OnKeyListener() {
            /* class com.ss.android.vc.meeting.module.livestream.activity.LiveAuthBaseActivity.DialogInterface$OnKeyListenerC620241 */

            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return false;
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f155839e = C0978a.m4782a(this);
        mo214702a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo214728a(List<String> list) {
        if (list != null) {
            for (String str : list) {
                this.f155839e.mo4992a(new Intent(str));
            }
        }
    }
}
