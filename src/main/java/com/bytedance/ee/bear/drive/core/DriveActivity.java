package com.bytedance.ee.bear.drive.core;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1144ai;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.biz.multitask.DriveActivityTaskWrapper;
import com.bytedance.ee.bear.drive.biz.multitask.DriveMultiTaskVM;
import com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveRootActivity;
import com.bytedance.ee.bear.drive.core.fragment.DriveMainFragment;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import com.larksuite.suite.R;
import com.ss.android.lark.multitask.MultitaskHelper;
import java.util.ArrayList;
import java.util.Iterator;

public class DriveActivity extends DriveRootActivity {

    /* renamed from: a */
    private MultitaskHelper f18724a;

    /* renamed from: b */
    private ArrayList<BaseOpenEntity> f18725b;

    /* renamed from: c */
    private int f18726c;

    /* renamed from: a */
    public MultitaskHelper mo27251a() {
        return this.f18724a;
    }

    /* renamed from: b */
    private boolean mo27254b() {
        ArrayList<BaseOpenEntity> arrayList = this.f18725b;
        if (arrayList == null) {
            return false;
        }
        Iterator<BaseOpenEntity> it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().getBizType() != 2) {
                return false;
            }
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ C6937b mo27257d() {
        if (!C13726a.m55676b(this)) {
            C13479a.m54758a("DriveComponent", "DriveActivity is finished in DriveActivityTaskWrapper");
            return null;
        }
        DriveMultiTaskVM bVar = (DriveMultiTaskVM) new C1144ai(this).mo6005a(DriveMultiTaskVM.class);
        if (bVar.getCurrentDriveViewModel() != null) {
            return bVar.getCurrentDriveViewModel();
        }
        C13479a.m54758a("DriveComponent", "currentPreviewFragment == null");
        return null;
    }

    /* renamed from: c */
    private void mo27255c() {
        int i;
        try {
            this.f18725b = getIntent().getParcelableArrayListExtra("extra_drive_sdk_open_entity");
            this.f18726c = getIntent().getIntExtra("extra_drive_sdk_open_index", 0);
            StringBuilder sb = new StringBuilder();
            sb.append("readExtra() mOpenEntities size=");
            if (this.f18725b == null) {
                i = 0;
            } else {
                i = this.f18725b.size() + " index=" + this.f18726c;
            }
            sb.append(i);
            C13479a.m54764b("DriveComponent", sb.toString());
        } catch (Exception e) {
            C13479a.m54761a("DriveComponent", e);
        }
    }

    /* renamed from: a */
    private DriveActivityTaskWrapper m27452a(Intent intent) {
        if (intent == null) {
            intent = new Intent();
        }
        return new DriveActivityTaskWrapper(this, intent, new DriveActivityTaskWrapper.MultiTaskWrapperDelegate() {
            /* class com.bytedance.ee.bear.drive.core.$$Lambda$DriveActivity$MtYPfuKOXZxLCvARwcBU0qmHdQ */

            @Override // com.bytedance.ee.bear.drive.biz.multitask.DriveActivityTaskWrapper.MultiTaskWrapperDelegate
            public final C6937b getDriveViewModel() {
                return DriveActivity.this.mo27257d();
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (mo27254b()) {
            this.f18724a = MultitaskHelper.m190623b(m27452a(getIntent()));
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        mo27255c();
        ArrayList<BaseOpenEntity> arrayList = this.f18725b;
        if (arrayList == null) {
            C13479a.m54758a("DriveComponent", "null open data, finish page...");
            finish();
            return;
        }
        m27454a(arrayList, this.f18726c, null);
        if (this.f18724a != null && mo27254b()) {
            this.f18724a = this.f18724a.mo169042a(m27452a(intent));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        setContentView(R.layout.drive_activity_main);
        mo27255c();
        ArrayList<BaseOpenEntity> arrayList = this.f18725b;
        if (arrayList == null) {
            C13479a.m54758a("DriveComponent", "null open data, finish page...");
            finish();
            return;
        }
        m27454a(arrayList, this.f18726c, bundle);
    }

    /* renamed from: a */
    private void m27453a(ArrayList<BaseOpenEntity> arrayList, int i) {
        DriveMainFragment bVar = new DriveMainFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("extra_drive_sdk_open_entity", arrayList);
        bundle.putInt("extra_drive_sdk_open_index", i);
        bVar.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.drive_activity_container, bVar, DriveMainFragment.f18746c.mo27294a()).commitAllowingStateLoss();
    }

    /* renamed from: a */
    private void m27454a(ArrayList<BaseOpenEntity> arrayList, int i, Bundle bundle) {
        if (bundle == null) {
            C13479a.m54764b("DriveComponent", "setUpPreview: default");
            m27453a(arrayList, i);
            return;
        }
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(DriveMainFragment.f18746c.mo27294a());
        if (findFragmentByTag == null) {
            C13479a.m54764b("DriveComponent", "setUpPreview: restore not found Any fragment");
            m27453a(arrayList, i);
        } else if (!(findFragmentByTag instanceof DriveMainFragment)) {
            C13479a.m54764b("DriveComponent", "setUpPreview: restore not found DriveMainFragment");
            m27453a(arrayList, i);
        } else {
            C13479a.m54764b("DriveComponent", "setUpPreview: restore DriveMainFragment");
        }
    }
}
