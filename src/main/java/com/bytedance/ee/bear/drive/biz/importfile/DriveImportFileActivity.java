package com.bytedance.ee.bear.drive.biz.importfile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.drive.biz.importfile.p327a.C6472a;
import com.bytedance.ee.bear.drive.biz.importfile.p329c.AbstractC6478a;
import com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsMvpActivity;
import com.bytedance.ee.bear.drive.importfile.ImportFileEntity;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

public class DriveImportFileActivity extends DriveAbsMvpActivity<C6472a> implements AbstractC6478a {

    /* renamed from: a */
    private ImportFileEntity f17863a;

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

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsBaseActivity
    /* renamed from: b */
    public void mo25860b() {
        mo25866e();
    }

    /* renamed from: e */
    private void mo25866e() {
        this.f17863a = m25958a(getIntent());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsBaseActivity
    /* renamed from: c */
    public void mo25861c() {
        ((C6472a) mo27140l()).mo25881a(this.f17863a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6472a mo25859b(Context context) {
        return new C6472a(context);
    }

    /* renamed from: a */
    public static ImportFileEntity m25958a(Intent intent) {
        ImportFileEntity importFileEntity = (ImportFileEntity) intent.getParcelableExtra("extra_drive_file_open_entity");
        if (importFileEntity == null) {
            return new ImportFileEntity("", "");
        }
        return importFileEntity;
    }

    /* renamed from: a */
    private void m25959a(ImportFileEntity importFileEntity) {
        C6470a aVar = new C6470a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_drive_file_open_entity", importFileEntity);
        aVar.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.drive_activity_container, aVar, C6470a.class.getSimpleName()).commitAllowingStateLoss();
    }

    @Override // com.bytedance.ee.bear.drive.biz.importfile.p329c.AbstractC6478a
    /* renamed from: a */
    public void mo25858a(ImportFileEntity importFileEntity, Bundle bundle) {
        if (bundle == null) {
            C13479a.m54764b("DriveImportFileActivity", "setUpPreview: default");
            m25959a(importFileEntity);
            return;
        }
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(C6470a.class.getSimpleName());
        if (findFragmentByTag == null) {
            C13479a.m54764b("DriveImportFileActivity", "setUpPreview: restore no found Any fragment");
            m25959a(importFileEntity);
        } else if (!(findFragmentByTag instanceof C6470a)) {
            C13479a.m54764b("DriveImportFileActivity", "setUpPreview: restore no found DriveImportFileFragment");
            m25959a(importFileEntity);
        } else {
            C13479a.m54764b("DriveImportFileActivity", "setUpPreview: restore DriveImportFileFragment");
        }
    }
}
