package com.ss.android.lark.mail.impl.home.aggregation;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.home.aggregation.p2179a.C42402a;
import com.ss.android.lark.mail.impl.home.aggregation.p2179a.C42403b;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class BaseSelectActivity extends BaseMailFragmentActivity {

    /* renamed from: a */
    protected C42402a f107906a;

    /* renamed from: b */
    protected UDButton f107907b;

    /* renamed from: c */
    protected C42403b f107908c;

    /* renamed from: d */
    protected ListView f107909d;

    /* renamed from: e */
    protected ArrayList<String> f107910e = new ArrayList<>();

    /* renamed from: f */
    protected String f107911f;

    /* renamed from: g */
    protected String f107912g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<MailLabelEntity> mo152586a(List<MailLabelEntity> list) {
        return list;
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public boolean aL_() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract AbstractC42401a mo150716e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo152591f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract String mo152592g();

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        Watchers.m167209b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo152595j() {
        this.f107907b.setVisibility(8);
        this.f107906a.mo152621a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo152590d() {
        this.f107912g = this.f107911f;
        mo150716e().mo152619b().mo5923a(this, new AbstractC1178x() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.$$Lambda$BaseSelectActivity$SsGvLzmvAlRg2yBmSd6r0KcvZpI */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                BaseSelectActivity.lambda$SsGvLzmvAlRg2yBmSd6r0KcvZpI(BaseSelectActivity.this, (List) obj);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo152596k() {
        int i;
        UDButton uDButton = this.f107907b;
        if (mo152591f()) {
            i = 0;
        } else {
            i = 8;
        }
        uDButton.setVisibility(i);
        this.f107906a.mo152622b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo152594i() {
        MailLabelEntity a = this.f107908c.mo152623a();
        if (a != null) {
            if (TextUtils.equals(this.f107912g, a.mo151527k())) {
                finish();
            } else {
                mo152588a(a.mo151527k());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo152593h() {
        int i;
        int i2;
        setContentView(R.layout.mail_aggregation_select_layout);
        if (getIntent() != null) {
            this.f107910e = getIntent().getStringArrayListExtra("select_thread_list");
            String stringExtra = getIntent().getStringExtra("from_label_id");
            this.f107911f = stringExtra;
            if (stringExtra == null) {
                this.f107911f = C43374f.m172264f().mo155129q();
            }
        }
        ((TextView) findViewById(R.id.mail_title_tv)).setText(mo152592g());
        this.f107906a = new C42402a(this, mo150716e(), findViewById(R.id.mail_aggregation_empty_panel));
        if (mo152591f()) {
            i = 3;
        } else {
            i = 2;
        }
        this.f107908c = new C42403b(this, i, null, null);
        ListView listView = (ListView) findViewById(R.id.label_listview);
        listView.setAdapter((ListAdapter) this.f107908c);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.BaseSelectActivity.C423921 */

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                BaseSelectActivity baseSelectActivity = BaseSelectActivity.this;
                baseSelectActivity.mo152587a(baseSelectActivity.f107908c.getItem(i));
                if (!BaseSelectActivity.this.mo152591f()) {
                    BaseSelectActivity.this.mo152594i();
                }
            }
        });
        this.f107909d = listView;
        findViewById(R.id.mail_label_close).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.BaseSelectActivity.View$OnClickListenerC423932 */

            public void onClick(View view) {
                BaseSelectActivity.this.finish();
            }
        });
        ((TextView) findViewById(R.id.mail_aggregation_create_tv)).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.BaseSelectActivity.View$OnClickListenerC423943 */

            public void onClick(View view) {
                BaseSelectActivity.this.mo150716e().mo152617a(BaseSelectActivity.this, 1);
            }
        });
        UDButton uDButton = (UDButton) findViewById(R.id.mail_aggregation_save_button);
        this.f107907b = uDButton;
        uDButton.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.$$Lambda$BaseSelectActivity$n9ZOpo9Mrujbj10c_GDxC95nHAE */

            public final void onClick(View view) {
                BaseSelectActivity.lambda$n9ZOpo9Mrujbj10c_GDxC95nHAE(BaseSelectActivity.this, view);
            }
        });
        UDButton uDButton2 = this.f107907b;
        if (mo152591f()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        uDButton2.setVisibility(i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m169206a(View view) {
        mo152594i();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m169208d(List list) {
        List<MailLabelEntity> list2;
        if (list != null) {
            list2 = mo152586a(list);
        } else {
            list2 = null;
        }
        mo152589b(list2);
    }

    /* renamed from: a */
    public void mo152587a(MailLabelEntity mailLabelEntity) {
        this.f107908c.mo152625a(mailLabelEntity);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo152593h();
        Watchers.m167206a(this);
        BaseEditActivity.f107874j = null;
        mo152590d();
    }

    /* renamed from: c */
    private MailLabelEntity m169207c(List<MailLabelEntity> list) {
        if (BaseEditActivity.f107874j == null) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            MailLabelEntity mailLabelEntity = list.get(i);
            if (mailLabelEntity.mo151527k().equals(BaseEditActivity.f107874j)) {
                BaseEditActivity.f107874j = null;
                return mailLabelEntity;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo152588a(String str) {
        Log.m165388i("doMoveToAct toLabel:" + str);
        String str2 = this.f107911f;
        if ("OTHER".equals(str2) || "IMPORTANT".equals(str2)) {
            str2 = "INBOX";
        }
        if ("SPAM".equals(str)) {
            C42330c.m169071c(C42330c.C42333b.f107647K);
        }
        if (!TextUtils.equals(str2, str)) {
            mo150716e().mo152618a(this.f107910e, str2, str);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo152589b(List<MailLabelEntity> list) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("updateData");
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        sb.append(i);
        Log.m165389i("BaseSelectActivity", sb.toString());
        if (CollectionUtils.isEmpty(list)) {
            mo152595j();
            return;
        }
        mo152596k();
        final MailLabelEntity c = m169207c(list);
        if (c != null) {
            Log.m165389i("BaseSelectActivity", "found new entity, select it");
            mo152587a(c);
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.home.aggregation.BaseSelectActivity.RunnableC423954 */

                public void run() {
                    int c = BaseSelectActivity.this.f107908c.mo152629c(c);
                    if (c >= 0) {
                        BaseSelectActivity.this.f107909d.smoothScrollToPosition(c);
                    }
                }
            });
        } else if (!mo152591f()) {
            if (this.f107908c.mo152623a() == null) {
                Iterator<MailLabelEntity> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    MailLabelEntity next = it.next();
                    if (TextUtils.equals(this.f107912g, next.mo151527k())) {
                        mo152587a(next);
                        break;
                    }
                }
            } else {
                boolean z = true;
                Iterator<MailLabelEntity> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (TextUtils.equals(this.f107908c.mo152623a().mo151527k(), it2.next().mo151527k())) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    MailToast.m173700a(mo150716e().mo152616a(R.string.Mail_Folder_EditFolderLabelDeleted, new Pair[0]));
                    mo152587a((MailLabelEntity) null);
                }
            }
        }
        this.f107908c.mo152626a(list);
    }
}
