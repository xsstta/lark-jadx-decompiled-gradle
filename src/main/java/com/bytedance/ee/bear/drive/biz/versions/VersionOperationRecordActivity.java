package com.bytedance.ee.bear.drive.biz.versions;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ee.bear.AbstractC5239d;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceFileOpenEntity;
import com.bytedance.ee.bear.drive.biz.permission.DriveMGPermissionVM;
import com.bytedance.ee.bear.drive.biz.permission.model.C6522b;
import com.bytedance.ee.bear.drive.biz.permission.push.DriveSpaceFilePermissionPush;
import com.bytedance.ee.bear.drive.biz.versions.model.DriveVersionHistoryRecord;
import com.bytedance.ee.bear.drive.biz.versions.model.VersionPayLoadData;
import com.bytedance.ee.bear.drive.biz.versions.p339a.C6836a;
import com.bytedance.ee.bear.drive.biz.versions.push.DriveMultiVersionPush;
import com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsMvpActivity;
import com.bytedance.ee.bear.facade.common.empty.EmptyView;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LoadMoreFooter;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LoadRefreshHeader;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p717s.C13723a;
import com.bytedance.ee.util.p718t.C13726a;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27125d;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27126e;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27139c;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

public class VersionOperationRecordActivity extends DriveAbsMvpActivity<C6840b> implements AbstractC6835a, C6836a.AbstractC6838a {

    /* renamed from: a */
    public SmartRefreshLayout f18578a;

    /* renamed from: b */
    public C6836a f18579b;

    /* renamed from: c */
    public String f18580c;

    /* renamed from: d */
    private BaseTitleBar f18581d;

    /* renamed from: e */
    private RecyclerView f18582e;

    /* renamed from: f */
    private EmptyView f18583f;

    /* renamed from: g */
    private String f18584g;

    /* renamed from: h */
    private DriveMultiVersionPush f18585h;

    /* renamed from: i */
    private DriveSpaceFilePermissionPush f18586i;

    /* renamed from: j */
    private final long f18587j = 800;

    /* renamed from: k */
    private long f18588k;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsBaseActivity
    /* renamed from: a */
    public int mo25856a() {
        return R.layout.drive_activity_version_operation_record;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsBaseActivity
    /* renamed from: c */
    public void mo25861c() {
        mo26893i();
        m26971p();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsBaseActivity
    public void q_() {
        super.q_();
        mo26892h();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsBaseActivity
    /* renamed from: d */
    public void mo25862d() {
        ((C6840b) mo27140l()).mo26900a(this.f18580c, true);
    }

    @Override // com.bytedance.ee.bear.drive.biz.versions.AbstractC6835a
    /* renamed from: e */
    public void mo26882e() {
        this.f18583f.mo30125a();
        this.f18583f.mo30129c();
    }

    /* renamed from: g */
    private void mo26890g() {
        this.f18580c = getIntent().getStringExtra("extra_obj_token");
        this.f18584g = getIntent().getStringExtra("extra_launch_version");
    }

    /* renamed from: q */
    private boolean m26972q() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f18588k < 800) {
            return false;
        }
        this.f18588k = uptimeMillis;
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.LifeCycleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsMvpActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        super.onDestroy();
        DriveMultiVersionPush aVar = this.f18585h;
        if (aVar != null) {
            aVar.mo27011c();
        }
        DriveSpaceFilePermissionPush aVar2 = this.f18586i;
        if (aVar2 != null) {
            aVar2.mo26069b();
        }
    }

    /* renamed from: h */
    private void mo26892h() {
        this.f18581d = (BaseTitleBar) findViewById(R.id.common_title_bar);
        this.f18578a = (SmartRefreshLayout) findViewById(R.id.list_refresh_layout);
        this.f18582e = (RecyclerView) findViewById(R.id.record_recy_view);
        this.f18583f = (EmptyView) findViewById(R.id.list_no_data_tip);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsBaseActivity
    /* renamed from: b */
    public void mo25860b() {
        mo26890g();
        if (TextUtils.isEmpty(this.f18580c)) {
            mo27139k();
            finish();
        }
        DriveMultiVersionPush aVar = new DriveMultiVersionPush(this.f18580c);
        this.f18585h = aVar;
        aVar.mo27009a();
        this.f18586i = new DriveSpaceFilePermissionPush(this.f18580c, (DriveMGPermissionVM) new C1144ai(this).mo6005a(DriveMGPermissionVM.class));
    }

    /* renamed from: i */
    private void mo26893i() {
        this.f18581d.setTitle(R.string.Drive_Drive_HistoryRecordPageTitle);
        this.f18578a.mo96345a((AbstractC27126e) new LoadRefreshHeader(this));
        LoadMoreFooter loadMoreFooter = new LoadMoreFooter(this);
        loadMoreFooter.setBackgroundColor(getResources().getColor(R.color.bg_base));
        this.f18578a.mo96367b((AbstractC27125d) loadMoreFooter);
        this.f18582e.setLayoutManager(new LinearLayoutManager(this));
        C6836a aVar = new C6836a(this);
        this.f18579b = aVar;
        this.f18582e.setAdapter(aVar);
        this.f18579b.mo26896a(this);
    }

    /* renamed from: p */
    private void m26971p() {
        this.f18583f.setOnRetryListener(new EmptyView.AbstractC7668a() {
            /* class com.bytedance.ee.bear.drive.biz.versions.VersionOperationRecordActivity.C68311 */

            @Override // com.bytedance.ee.bear.facade.common.empty.EmptyView.AbstractC7668a
            public void onFailedRetry() {
                ((C6840b) VersionOperationRecordActivity.this.mo27140l()).mo26900a(VersionOperationRecordActivity.this.f18580c, true);
            }
        });
        this.f18578a.mo96369b(new AbstractC27139c() {
            /* class com.bytedance.ee.bear.drive.biz.versions.VersionOperationRecordActivity.C68322 */

            @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27139c
            public void onRefresh(AbstractC27129h hVar) {
                ((C6840b) VersionOperationRecordActivity.this.mo27140l()).mo26900a(VersionOperationRecordActivity.this.f18580c, false);
            }
        });
        this.f18578a.mo96368b(new AbstractC27137a() {
            /* class com.bytedance.ee.bear.drive.biz.versions.VersionOperationRecordActivity.C68333 */

            @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
            public void onLoadmore(AbstractC27129h hVar) {
                ((C6840b) VersionOperationRecordActivity.this.mo27140l()).mo26899a(VersionOperationRecordActivity.this.f18580c, VersionOperationRecordActivity.this.f18579b.mo26895a());
            }
        });
        if (C13726a.m55676b(this)) {
            ((DriveMGPermissionVM) new C1144ai(this).mo6005a(DriveMGPermissionVM.class)).livePerm().mo5923a(this, new AbstractC1178x() {
                /* class com.bytedance.ee.bear.drive.biz.versions.$$Lambda$VersionOperationRecordActivity$ZRxgUDvUaj4vGV2bxEDgDU3EnOA */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    VersionOperationRecordActivity.this.m26967a((VersionOperationRecordActivity) ((C6522b) obj));
                }
            });
            DriveMultiVersionPush aVar = this.f18585h;
            if (aVar != null) {
                aVar.mo27010b().mo5923a(this, new AbstractC1178x<VersionPayLoadData>() {
                    /* class com.bytedance.ee.bear.drive.biz.versions.VersionOperationRecordActivity.C68344 */

                    /* renamed from: a */
                    public void onChanged(VersionPayLoadData versionPayLoadData) {
                        if (versionPayLoadData != null) {
                            if (versionPayLoadData.getOperation() == 101 || versionPayLoadData.getOperation() == 102) {
                                VersionOperationRecordActivity.this.f18578a.mo96429s();
                            }
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6840b mo25859b(Context context) {
        return new C6840b(context, mo30076n());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m26967a(C6522b bVar) {
        if (bVar != null && !bVar.mo26064j()) {
            Toast.showFailureText(getApplicationContext(), getResources().getString(R.string.Drive_Drive_NoAccessPermission), 1);
            finish();
        }
    }

    @Override // com.bytedance.ee.bear.drive.biz.versions.AbstractC6835a
    /* renamed from: a */
    public void mo26879a(Throwable th) {
        this.f18578a.mo96408j(0);
        this.f18583f.mo30125a();
        this.f18583f.mo30127a(th);
    }

    @Override // com.bytedance.ee.bear.drive.biz.versions.p339a.C6836a.AbstractC6838a
    /* renamed from: a */
    public void mo26878a(DriveVersionHistoryRecord.RecordBean recordBean) {
        if (!m26972q()) {
            C13479a.m54775e("VersionOperationRecordActivity", "unValidClick in version item");
        } else if (TextUtils.equals(this.f18584g, recordBean.getVersion())) {
            finish();
        } else {
            SpaceFileOpenEntity spaceFileOpenEntity = new SpaceFileOpenEntity(this.f18580c, "");
            spaceFileOpenEntity.setPreviewFrom("history");
            spaceFileOpenEntity.setVersion(recordBean.getVersion());
            spaceFileOpenEntity.setDataVersion(recordBean.getDataVersion());
            Bundle bundle = new Bundle();
            bundle.putString("extra_history_date", C13723a.m55654a(this, recordBean.getEditTime()));
            bundle.putBoolean("history", true);
            spaceFileOpenEntity.setExtras(bundle);
            ((AbstractC5239d) KoinJavaComponent.m268610a(AbstractC5239d.class)).mo21092a(this, spaceFileOpenEntity);
        }
    }

    @Override // com.bytedance.ee.bear.drive.biz.versions.AbstractC6835a
    /* renamed from: b */
    public void mo26881b(boolean z, List<DriveVersionHistoryRecord.RecordBean> list, Map<String, DriveVersionHistoryRecord.UserBean> map) {
        this.f18578a.mo96405i(0);
        if (!CollectionUtils.isEmpty(list)) {
            this.f18579b.mo26898b(list, map);
            this.f18578a.mo96415m(z);
        }
    }

    @Override // com.bytedance.ee.bear.drive.biz.versions.AbstractC6835a
    /* renamed from: a */
    public void mo26880a(boolean z, List<DriveVersionHistoryRecord.RecordBean> list, Map<String, DriveVersionHistoryRecord.UserBean> map) {
        this.f18578a.mo96408j(0);
        if (CollectionUtils.isEmpty(list)) {
            this.f18581d.setDividerVisible(true);
            this.f18583f.mo30125a();
            this.f18583f.mo30132f();
        } else {
            this.f18583f.mo30128b();
            this.f18581d.setDividerVisible(false);
            this.f18579b.mo26897a(list, map);
        }
        this.f18578a.mo96415m(z);
    }
}
