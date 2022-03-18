package com.bytedance.ee.bear.drive.test;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.contract.drive.DriveCache;
import com.bytedance.ee.bear.drive.biz.plugin.C6534c;
import com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsMvpActivity;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.test.item.DrivePreloadVideoTestItem;
import com.bytedance.ee.bear.drive.test.p360a.C7202b;
import com.bytedance.ee.bear.drive.test.p361b.AbstractC7206b;
import com.bytedance.ee.bear.drive.test.p361b.C7203a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.util.io.C13672c;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class DriveTestActivity extends DriveAbsMvpActivity<C7199a> {

    /* renamed from: a */
    private RecyclerView f19318a;

    /* renamed from: b */
    private C7203a f19319b;

    /* renamed from: c */
    private ArrayList<AbstractC7206b> f19320c;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsBaseActivity
    /* renamed from: a */
    public int mo25856a() {
        return R.layout.drive_activity_test_business;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsBaseActivity
    /* renamed from: d */
    public void mo25862d() {
        this.f19318a.setAdapter(this.f19319b);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsBaseActivity
    /* renamed from: c */
    public void mo25861c() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.drive_test_recycler_view);
        this.f19318a = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.f19319b = new C7203a(this, this.f19320c);
    }

    /* renamed from: e */
    private void mo28192e() {
        AbstractC68307f.m265099b((Callable) new Callable() {
            /* class com.bytedance.ee.bear.drive.test.$$Lambda$DriveTestActivity$rQicoxGuDcsessyuNq7ba_5_UXU */

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DriveTestActivity.this.mo28193g();
            }
        }).mo238004b(C11678b.m48479c()).mo237985a(C11678b.m48478b()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.drive.test.$$Lambda$DriveTestActivity$xt5XWnEujJx29DmDrQ2MgvJ7esQ */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DriveTestActivity.this.m28830a((DriveTestActivity) ((Map) obj));
            }
        }, $$Lambda$DriveTestActivity$u5NlN51f6iGNaM4nuRpszPYOylw.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ Map mo28193g() throws Exception {
        HashMap hashMap = new HashMap();
        List<DriveCache> f = C6920b.m27342f().mo27170e().mo27094f();
        long j = 0;
        if (f != null) {
            for (DriveCache driveCache : f) {
                j += driveCache.mo20339h();
            }
        }
        hashMap.put("cacheSize", C13672c.m55479a(mo27141m(), j));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsBaseActivity
    /* renamed from: b */
    public void mo25860b() {
        ArrayList<AbstractC7206b> arrayList = new ArrayList<>();
        this.f19320c = arrayList;
        arrayList.add(new C7202b(this, mo30076n()));
        this.f19320c.add(new DrivePreloadVideoTestItem());
        mo28192e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7199a mo25859b(Context context) {
        return new C7199a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28830a(Map map) throws Exception {
        ((TextView) findViewById(R.id.drive_test_activity_info_tv)).setText((("已缓存文件总大小：" + map.get("cacheSize")) + "\n 插件信息 ttoffice: \n" + C6534c.m26230a("com.bytedance.ee.plugin.ttoffice")) + "\n 插件信息 archive: \n" + C6534c.m26230a("com.bytedance.ee.bear.libarchive"));
    }
}
