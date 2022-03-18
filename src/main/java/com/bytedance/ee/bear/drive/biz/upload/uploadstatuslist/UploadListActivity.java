package com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.C6818b;
import com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsMvpActivity;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

public class UploadListActivity extends DriveAbsMvpActivity<C6800a> implements AbstractC6805b {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsBaseActivity
    /* renamed from: a */
    public int mo25856a() {
        return R.layout.drive_upload_list_activity;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsBaseActivity
    /* renamed from: b */
    public void mo25860b() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsBaseActivity
    /* renamed from: c */
    public void mo25861c() {
        ((C6800a) mo27140l()).mo26779a();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.LifeCycleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsMvpActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        super.onDestroy();
        C6920b.m27342f().mo27166a().mo27959f();
    }

    /* renamed from: e */
    private void mo26775e() {
        getSupportFragmentManager().beginTransaction().replace(R.id.drive_upload_list_frame, C6818b.m26907a(getIntent().getStringExtra("mount_node_token"), getIntent().getStringExtra("mount_point"), getIntent().getStringExtra("space_id")), C6818b.class.getSimpleName()).commitAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsBaseActivity
    /* renamed from: d */
    public void mo25862d() {
        C6920b.m27342f().mo27166a().mo27953e();
        C6920b.m27342f().mo27166a().mo27918a(getIntent().getStringExtra("space_id"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6800a mo25859b(Context context) {
        return new C6800a(context);
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.AbstractC6805b
    public void a_(Bundle bundle) {
        if (bundle == null) {
            C13479a.m54764b("UploadListActivity", "setUpUploadList: default");
            mo26775e();
            return;
        }
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(C6818b.class.getSimpleName());
        if (findFragmentByTag == null) {
            C13479a.m54764b("UploadListActivity", "setUpUploadList: restore no found Any fragment");
            mo26775e();
        } else if (!(findFragmentByTag instanceof C6818b)) {
            C13479a.m54764b("UploadListActivity", "setUpUploadList: restore no found UploadListFragment");
            mo26775e();
        } else {
            C13479a.m54764b("UploadListActivity", "setUpUploadList: restore UploadListFragment");
        }
    }
}
