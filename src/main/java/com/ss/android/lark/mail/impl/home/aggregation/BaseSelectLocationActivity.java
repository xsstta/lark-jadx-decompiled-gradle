package com.ss.android.lark.mail.impl.home.aggregation;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.home.aggregation.p2179a.C42403b;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity;
import java.util.Iterator;
import java.util.List;

public abstract class BaseSelectLocationActivity extends BaseMailFragmentActivity {

    /* renamed from: a */
    protected ListView f107918a;

    /* renamed from: b */
    protected C42403b f107919b;

    /* renamed from: c */
    protected String f107920c;

    /* renamed from: d */
    protected String f107921d;

    /* renamed from: e */
    private final String f107922e = "BaseSelectLocationActivity";

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public boolean aL_() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract AbstractC42401a mo152604d();

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onResume() {
        super.onResume();
        mo152602a(this.f107920c);
    }

    /* renamed from: f */
    private void mo152668f() {
        String str;
        MailLabelEntity a = this.f107919b.mo152623a();
        Intent intent = new Intent();
        if (a != null) {
            str = a.mo151527k();
        } else {
            str = "";
        }
        intent.putExtra("select_node_id", str);
        setResult(1, intent);
        finish();
    }

    /* renamed from: e */
    private void mo150716e() {
        findViewById(R.id.mail_aggregation_close).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.BaseSelectLocationActivity.View$OnClickListenerC423961 */

            public void onClick(View view) {
                BaseSelectLocationActivity.this.finish();
            }
        });
        ((TextView) findViewById(R.id.mail_aggregation_title_name_tv)).setText(mo152604d().mo152616a(R.string.Mail_Folder_TabNamePlaceMobile, new Pair[0]));
        ListView listView = (ListView) findViewById(R.id.mail_folder_list);
        this.f107918a = listView;
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.BaseSelectLocationActivity.C423972 */

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                MailLabelEntity a = BaseSelectLocationActivity.this.f107919b.getItem(i);
                if (a != null) {
                    BaseSelectLocationActivity.this.mo152601a(a, i);
                }
            }
        });
        C42403b bVar = new C42403b(this, 2, null, null);
        this.f107919b = bVar;
        this.f107918a.setAdapter((ListAdapter) bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo152602a(String str) {
        String str2;
        MailLabelEntity a = mo152604d().mo152615a(str);
        if (a != null) {
            str2 = C43374f.m172262c(a.mo151493B());
        } else {
            str2 = null;
        }
        mo152604d().mo152619b().mo5923a(this, new AbstractC1178x(str2) {
            /* class com.ss.android.lark.mail.impl.home.aggregation.$$Lambda$BaseSelectLocationActivity$if5mgMJXaBDfX9mT_PtlH6R1w */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                BaseSelectLocationActivity.m270754lambda$if5mgMJXaBDfX9mT_PtlH6R1w(BaseSelectLocationActivity.this, this.f$1, (List) obj);
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mail_aggregation_select_location_layout);
        mo150716e();
        this.f107920c = getIntent().getStringExtra("target_node_id");
        this.f107921d = getIntent().getStringExtra("selected_node_id");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo152603a(List<MailLabelEntity> list) {
        if (list != null) {
            Iterator<MailLabelEntity> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                MailLabelEntity next = it.next();
                if (TextUtils.equals(this.f107921d, next.mo151527k())) {
                    this.f107919b.mo152625a(next);
                    break;
                }
            }
        }
        this.f107919b.mo152626a(list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo152601a(MailLabelEntity mailLabelEntity, int i) {
        this.f107919b.mo152625a(mailLabelEntity);
        mo152668f();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r3.startsWith(r8 + "/") != false) goto L_0x0049;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m169221a(java.lang.String r8, java.util.List r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r9 != 0) goto L_0x0008
            return
        L_0x0008:
            r1 = 0
        L_0x0009:
            int r2 = r9.size()
            if (r1 >= r2) goto L_0x0057
            java.lang.Object r2 = r9.get(r1)
            com.ss.android.lark.mail.impl.entity.MailLabelEntity r2 = (com.ss.android.lark.mail.impl.entity.MailLabelEntity) r2
            boolean r3 = r2.mo151529m()
            r4 = 1
            if (r3 == 0) goto L_0x0020
            r2.mo151511d(r4)
            goto L_0x0054
        L_0x0020:
            java.util.List r3 = r2.mo151493B()
            java.lang.String r3 = com.ss.android.lark.mail.impl.service.C43374f.m172262c(r3)
            if (r3 == 0) goto L_0x004e
            if (r8 == 0) goto L_0x004e
            boolean r5 = r3.equals(r8)
            if (r5 != 0) goto L_0x0049
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = "/"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            boolean r3 = r3.startsWith(r5)
            if (r3 == 0) goto L_0x004e
        L_0x0049:
            r3 = 4
            r2.mo151511d(r3)
            goto L_0x0051
        L_0x004e:
            r2.mo151511d(r4)
        L_0x0051:
            r0.add(r2)
        L_0x0054:
            int r1 = r1 + 1
            goto L_0x0009
        L_0x0057:
            r7.mo152603a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.home.aggregation.BaseSelectLocationActivity.m169221a(java.lang.String, java.util.List):void");
    }
}
