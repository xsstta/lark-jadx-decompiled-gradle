package com.bytedance.ee.bear.drive.biz.upload.error;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsMvpActivity;
import com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6905a;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.suite.R;

public class DriveUploadErrorTipsActivity extends DriveAbsMvpActivity<AbstractC6905a> {

    /* renamed from: a */
    private int f18399a;

    /* renamed from: b */
    private AbstractC6759a f18400b;

    /* renamed from: c */
    private Dialog f18401c;

    /* renamed from: d */
    private View f18402d;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsBaseActivity
    /* renamed from: a */
    public int mo25856a() {
        return R.layout.drive_activity_main;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsBaseActivity
    /* renamed from: d */
    public void mo25862d() {
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.LifeCycleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsMvpActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        super.onDestroy();
        Dialog dialog = this.f18401c;
        if (dialog != null && dialog.isShowing()) {
            this.f18401c.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsBaseActivity
    /* renamed from: b */
    public void mo25860b() {
        int intExtra = getIntent().getIntExtra("drive_upload_error", 0);
        this.f18399a = intExtra;
        this.f18400b = C6760b.m26656a(intExtra, getIntent());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsBaseActivity
    /* renamed from: c */
    public void mo25861c() {
        this.f18402d = findViewById(R.id.drive_activity_container);
        if (this.f18400b.mo26595e()) {
            this.f18402d.setBackgroundColor(getResources().getColor(R.color.bg_body));
        }
        if (this.f18400b.mo26596f()) {
            this.f18400b.mo26590a(this);
            return;
        }
        BearUDDialogBuilder a = new BearUDDialogBuilder(mo27141m()).mo45344a(this.f18400b.mo26588a()).mo45356b(R.color.text_title).mo45362d(this.f18400b.mo26591b()).mo45365f(R.color.text_caption).mo45351a(BearUDDialogBuilder.ActionBottomOrientation.VERTICAL).mo45346a(R.id.ud_dialog_btn_primary, this.f18400b.mo26593c(), new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.biz.upload.error.$$Lambda$DriveUploadErrorTipsActivity$4GlsBwSEBdNXvIL3i4cY8kGog_g */

            public final void onClick(DialogInterface dialogInterface, int i) {
                DriveUploadErrorTipsActivity.this.m26629b(dialogInterface, i);
            }
        }).mo45349a(new DialogInterface.OnCancelListener() {
            /* class com.bytedance.ee.bear.drive.biz.upload.error.$$Lambda$DriveUploadErrorTipsActivity$NMnch5Excl79OAMIuOmbchrq7vE */

            public final void onCancel(DialogInterface dialogInterface) {
                DriveUploadErrorTipsActivity.this.m26627a((DriveUploadErrorTipsActivity) dialogInterface);
            }
        });
        if (this.f18400b.mo26594d()) {
            a.mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, new DialogInterface.OnClickListener() {
                /* class com.bytedance.ee.bear.drive.biz.upload.error.$$Lambda$DriveUploadErrorTipsActivity$KgAlc94IPyajJSLm67UpPYdqnpM */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    DriveUploadErrorTipsActivity.this.m26628a(dialogInterface, i);
                }
            });
        }
        UDDialog a2 = a.mo45355a();
        this.f18401c = a2;
        a2.show();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC6905a mo25859b(Context context) {
        return new AbstractC6905a(context) {
            /* class com.bytedance.ee.bear.drive.biz.upload.error.DriveUploadErrorTipsActivity.C67581 */

            @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6908d, com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6905a
            /* renamed from: a */
            public void mo25880a(Bundle bundle, Bundle bundle2) {
                super.mo25880a(bundle, bundle2);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m26627a(DialogInterface dialogInterface) {
        this.f18400b.mo26592b(mo27141m(), ar.m20936a());
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m26629b(DialogInterface dialogInterface, int i) {
        this.f18400b.mo26589a(mo27141m(), ar.m20936a());
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m26628a(DialogInterface dialogInterface, int i) {
        this.f18400b.mo26592b(mo27141m(), mo30076n());
        finish();
    }
}
