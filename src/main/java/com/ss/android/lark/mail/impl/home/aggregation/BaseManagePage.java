package com.ss.android.lark.mail.impl.home.aggregation;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.AbstractC1178x;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.home.aggregation.p2179a.C42402a;
import com.ss.android.lark.mail.impl.home.aggregation.p2179a.C42403b;
import com.ss.android.lark.mail.impl.utils.C43752b;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.view.dialog.DialogC43910a;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseManagePage extends FrameLayout implements C42403b.AbstractC42408b<MailLabelEntity>, DialogC43910a.AbstractC43914a {

    /* renamed from: a */
    public Activity f107896a;

    /* renamed from: b */
    protected final ArrayList<MailLabelEntity> f107897b = new ArrayList<>();

    /* renamed from: c */
    public DialogC43910a f107898c;

    /* renamed from: d */
    C42402a f107899d;

    /* renamed from: e */
    UDButton f107900e;

    /* renamed from: f */
    private final String f107901f = "BaseManagePage";

    /* renamed from: g */
    private C42403b f107902g;

    /* renamed from: h */
    private int f107903h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo152580a(UDButton uDButton);

    /* renamed from: b */
    public void mo152583b() {
    }

    /* access modifiers changed from: protected */
    public abstract AbstractC42401a getModel();

    @Override // com.ss.android.lark.mail.impl.view.dialog.DialogC43910a.AbstractC43914a
    /* renamed from: i */
    public void mo152566i() {
        Log.m165389i("BaseManagePage", "onBackPressedInLoadingDialog");
        C43752b.m173435a(this.f107896a);
    }

    /* renamed from: c */
    private void m169196c() {
        if (!CollectionUtils.isEmpty(this.f107897b)) {
            m169198e();
        } else if (this.f107903h == 2) {
            C43752b.m173435a(this.f107896a);
        } else {
            m169197d();
        }
    }

    /* renamed from: d */
    private void m169197d() {
        findViewById(R.id.label_listview).setVisibility(4);
        this.f107899d.mo152621a();
    }

    /* renamed from: e */
    private void m169198e() {
        findViewById(R.id.label_listview).setVisibility(0);
        this.f107899d.mo152622b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo152578a() {
        UIHelper.inflate(R.layout.mail_aggregation_page_layout, this);
        this.f107899d = new C42402a(getContext(), getModel(), findViewById(R.id.mail_aggregation_empty_panel));
        UDButton uDButton = (UDButton) findViewById(R.id.mail_aggregation_create_button);
        this.f107900e = uDButton;
        mo152580a(uDButton);
        this.f107902g = new C42403b(this.f107896a, 1, this.f107897b, this);
        ((ListView) findViewById(R.id.label_listview)).setAdapter((ListAdapter) this.f107902g);
        m169196c();
    }

    public BaseManagePage(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo152582a(final boolean z) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.BaseManagePage.RunnableC423911 */

            public void run() {
                if (BaseManagePage.this.f107898c == null) {
                    BaseManagePage.this.f107898c = new DialogC43910a(BaseManagePage.this.f107896a);
                    BaseManagePage.this.f107898c.mo156330a(BaseManagePage.this);
                }
                if (z) {
                    BaseManagePage.this.f107898c.mo156331a(C43819s.m173684a((int) R.string.Mail_Normal_Loading));
                } else if (BaseManagePage.this.f107898c.isShowing()) {
                    BaseManagePage.this.f107898c.dismiss();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo152579a(Activity activity) {
        this.f107896a = activity;
        mo152578a();
        getModel().mo152619b().mo5923a((ComponentActivity) activity, new AbstractC1178x() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.$$Lambda$BaseManagePage$vJe6gNc43BUzFjSaZiSLlbPBwLc */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                BaseManagePage.lambda$vJe6gNc43BUzFjSaZiSLlbPBwLc(BaseManagePage.this, (List) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m169195b(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                MailLabelEntity mailLabelEntity = (MailLabelEntity) list.get(i);
                if (!mailLabelEntity.mo151529m() && mailLabelEntity.mo151539w()) {
                    arrayList.add(mailLabelEntity);
                }
            }
            mo152581a((List<MailLabelEntity>) arrayList);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo152581a(List<MailLabelEntity> list) {
        this.f107897b.clear();
        this.f107897b.addAll(list);
        this.f107902g.mo152626a(this.f107897b);
        m169196c();
    }

    public BaseManagePage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseManagePage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
