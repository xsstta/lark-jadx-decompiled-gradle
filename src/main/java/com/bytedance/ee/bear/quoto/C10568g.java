package com.bytedance.ee.bear.quoto;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import com.bytedance.ee.bear.bizwidget.at.AtUserSupportTextView;
import com.bytedance.ee.bear.bizwidget.at.C4863a;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.quoto.AbstractC10573j;
import com.bytedance.ee.bear.quoto.QuotaInfoResult;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.suite.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.quoto.g */
public class C10568g implements AbstractC10573j {

    /* renamed from: a */
    public final DialogInterface$OnCancelListenerC1021b f28350a;

    /* renamed from: b */
    public boolean f28351b;

    /* renamed from: c */
    private final View f28352c;

    /* renamed from: d */
    private final Context f28353d;

    /* renamed from: e */
    private AtUserSupportTextView f28354e;

    /* renamed from: f */
    private final boolean f28355f;

    /* renamed from: g */
    private boolean f28356g;

    /* renamed from: h */
    private boolean f28357h;

    /* renamed from: i */
    private C10917c f28358i;

    /* renamed from: a */
    public void setViewDelegate(AbstractC10573j.AbstractC10574a aVar) {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m43788b();
        m43789c();
    }

    /* renamed from: b */
    private void m43788b() {
        this.f28358i = new C10917c(new C10929e());
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        String str;
        AbstractC5233x b = C5234y.m21391b();
        boolean z = this.f28356g;
        boolean z2 = this.f28357h;
        boolean z3 = this.f28355f;
        if (this.f28351b) {
            str = "confirm";
        } else {
            str = "close";
        }
        C10560b.m43766a(b, z, z2, z3, str, "none");
    }

    /* renamed from: c */
    private void m43789c() {
        this.f28354e = (AtUserSupportTextView) this.f28352c.findViewById(R.id.subTitle);
        ((Button) this.f28352c.findViewById(R.id.done)).setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.quoto.C10568g.C105691 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C10568g.this.f28351b = true;
                C10568g.this.f28350a.mo5513b();
            }
        });
    }

    @Override // com.bytedance.ee.bear.quoto.AbstractC10573j
    /* renamed from: a */
    public void mo40018a() {
        this.f28356g = false;
        this.f28357h = true;
        this.f28354e.setText(R.string.CreationMobile_Common_storage_full_toast);
        this.f28352c.setVisibility(0);
        C10560b.m43765a(C5234y.m21391b(), this.f28356g, this.f28357h, this.f28355f);
    }

    /* renamed from: a */
    private C4863a.AbstractC4864a m43785a(boolean z) {
        return new C4863a.AbstractC4864a(z) {
            /* class com.bytedance.ee.bear.quoto.$$Lambda$g$waadVzUl9Jod0kXZtGnlLoO22A */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.bear.bizwidget.at.C4863a.AbstractC4864a
            public final void onClick(View view, String str) {
                C10568g.this.m43787a((C10568g) this.f$1, (boolean) view, (View) str);
            }
        };
    }

    /* renamed from: a */
    private String m43786a(float f) {
        return new DecimalFormat("#.##").format((double) (((f / 1024.0f) / 1024.0f) / 1024.0f));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m43787a(boolean z, View view, String str) {
        String str2;
        ((AbstractC5586d) KoinJavaComponent.m268610a(AbstractC5586d.class)).mo22257a(str, "");
        AbstractC5233x b = C5234y.m21391b();
        boolean z2 = this.f28356g;
        boolean z3 = this.f28357h;
        boolean z4 = this.f28355f;
        if (z) {
            str2 = "admin";
        } else {
            str2 = "owner";
        }
        C10560b.m43766a(b, z2, z3, z4, str2, "im_chat_main_view");
    }

    @Override // com.bytedance.ee.bear.quoto.AbstractC10573j
    /* renamed from: a */
    public void mo40020a(QuotaInfoResult.DataDTO.ContactsDTO contactsDTO, long j, long j2) {
        this.f28356g = false;
        this.f28357h = false;
        HashMap hashMap = new HashMap(3);
        hashMap.put("usage", m43786a((float) j));
        hashMap.put("limited", m43786a((float) j2));
        hashMap.put("owner", "@" + contactsDTO.getName());
        ArrayList arrayList = new ArrayList();
        C4863a aVar = new C4863a(this.f28353d, contactsDTO.getUid(), contactsDTO.getName(), m43785a(false));
        C4863a aVar2 = new C4863a(this.f28353d, contactsDTO.getUid(), contactsDTO.getName(), m43785a(false));
        arrayList.add(aVar);
        arrayList.add(aVar2);
        this.f28354e.mo19033a(C10539a.m43640a(this.f28353d, R.string.CreationMobile_Common_storage_other_full_toast, hashMap), arrayList);
        this.f28352c.setVisibility(0);
        C10560b.m43765a(C5234y.m21391b(), this.f28356g, this.f28357h, this.f28355f);
    }

    @Override // com.bytedance.ee.bear.quoto.AbstractC10573j
    /* renamed from: a */
    public void mo40019a(long j, long j2, List<QuotaInfoResult.DataDTO.ContactsDTO> list) {
        this.f28356g = true;
        this.f28357h = false;
        HashMap hashMap = new HashMap();
        hashMap.put("usage", m43786a((float) j));
        hashMap.put("limited", m43786a((float) j2));
        hashMap.put("admins", "default_name");
        StringBuilder sb = new StringBuilder();
        sb.append(C10539a.m43640a(this.f28353d, R.string.CreationMobile_Common_storage_me_full_toast, hashMap));
        ArrayList arrayList = new ArrayList();
        int indexOf = sb.indexOf("default_name");
        if (list.size() == 1) {
            sb.replace(indexOf, indexOf + 12, "@" + list.get(0).getName());
            arrayList.add(new C4863a(this.f28353d, list.get(0).getUid(), list.get(0).getName(), m43785a(true)));
        } else if (list.size() == 2) {
            sb.replace(indexOf, indexOf + 12, "@" + list.get(0).getName() + "、@" + list.get(1).getName());
            C4863a aVar = new C4863a(this.f28353d, list.get(0).getUid(), list.get(0).getName(), m43785a(true));
            C4863a aVar2 = new C4863a(this.f28353d, list.get(1).getUid(), list.get(1).getName(), m43785a(true));
            arrayList.add(aVar);
            arrayList.add(aVar2);
        } else {
            sb.replace(indexOf, indexOf + 12, "@" + list.get(0).getName() + "、@" + list.get(1).getName() + "、@" + list.get(2).getName());
            C4863a aVar3 = new C4863a(this.f28353d, list.get(0).getUid(), list.get(0).getName(), m43785a(true));
            C4863a aVar4 = new C4863a(this.f28353d, list.get(1).getUid(), list.get(1).getName(), m43785a(true));
            C4863a aVar5 = new C4863a(this.f28353d, list.get(2).getUid(), list.get(2).getName(), m43785a(true));
            arrayList.add(aVar3);
            arrayList.add(aVar4);
            arrayList.add(aVar5);
        }
        this.f28354e.mo19033a(sb.toString(), arrayList);
        this.f28352c.setVisibility(0);
        C10560b.m43765a(C5234y.m21391b(), this.f28356g, this.f28357h, this.f28355f);
    }

    C10568g(View view, DialogInterface$OnCancelListenerC1021b bVar, Context context, boolean z) {
        this.f28352c = view;
        this.f28350a = bVar;
        this.f28353d = context;
        this.f28355f = z;
    }
}
