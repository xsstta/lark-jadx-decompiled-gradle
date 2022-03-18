package com.ss.android.lark.contact.impl.contacts_facade;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.impl.contacts_home.C35660a;
import com.ss.android.lark.desktopmode.C36529b;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.LeftWindowParams;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.widget.tab.NavigationTabItemView;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.contact.impl.contacts_facade.b */
public class C35576b implements AbstractC36553a, AbstractC44552i, AbstractC44552i.AbstractC44555c {

    /* renamed from: a */
    public C35660a f92012a;

    /* renamed from: b */
    public ContactTabView f92013b;

    /* renamed from: c */
    private Context f92014c;

    /* renamed from: d */
    private int f92015d = 1;

    /* renamed from: e */
    private NavigationTabItemView f92016e;

    /* renamed from: f */
    private AbstractC44548e f92017f;

    /* renamed from: g */
    private ITitleController f92018g;

    /* renamed from: h */
    private AbstractC44552i.AbstractC44553a f92019h = new AbstractC44552i.AbstractC44553a() {
        /* class com.ss.android.lark.contact.impl.contacts_facade.C35576b.C355771 */

        @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
        /* renamed from: b */
        public void mo31325b(String str, String str2) {
        }

        @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
        /* renamed from: a */
        public void mo31324a(String str, String str2) {
            boolean equals = TextUtils.equals("contact", str);
            boolean equals2 = TextUtils.equals("contact", str2);
            if (equals2) {
                C35576b.this.mo31318i();
                if (!TextUtils.equals(str, str2)) {
                    C35576b.this.f92012a.mo131399a();
                    C35576b.m139268a();
                }
            }
            if (C35576b.this.f92013b != null) {
                if (equals && !equals2) {
                    C35576b.this.f92013b.mo110683b();
                }
                if (!equals && equals2) {
                    C35576b.this.f92013b.mo110677a();
                }
            }
        }
    };

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: a */
    public void mo31309a(Bundle bundle) {
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a, com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: b */
    public String mo31311b() {
        return "contact";
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: e */
    public boolean mo31314e() {
        return false;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: f */
    public void mo31315f() {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: g */
    public void mo31316g() {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: h */
    public int mo31317h() {
        return 1;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: m */
    public AbstractC44552i.AbstractC44554b mo31322m() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44555c
    /* renamed from: s */
    public void mo103434s() {
        this.f92012a = null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: d */
    public int mo31313d() {
        return this.f92015d;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: l */
    public AbstractC44552i.AbstractC44553a mo31321l() {
        return this.f92019h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public ContactTabView mo131202o() {
        return new ContactTabView(this.f92014c);
    }

    /* renamed from: a */
    public static void m139268a() {
        try {
            Statistics.sendEvent("contact_home_view");
        } catch (Throwable th) {
            Log.m165382e(th.getMessage());
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: c */
    public <T extends View> T mo31312c() {
        if (this.f92013b == null) {
            this.f92013b = mo131202o();
        }
        return this.f92013b;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: j */
    public <T extends View> T mo31319j() {
        if (this.f92016e == null) {
            this.f92016e = new ContactNavTabView(this.f92014c);
        }
        return this.f92016e;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: k */
    public ITitleInfo mo31320k() {
        C35660a aVar = this.f92012a;
        if (aVar != null) {
            return aVar.mo131404c();
        }
        return null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: n */
    public void mo31323n() {
        C35660a aVar = this.f92012a;
        if (aVar == null) {
            mo31318i();
        } else {
            aVar.mo131403b();
        }
    }

    /* renamed from: p */
    public C35660a mo31318i() {
        if (this.f92012a == null) {
            this.f92012a = C35660a.m139582a(false, false, false, this.f92018g);
        }
        return this.f92012a;
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a
    /* renamed from: r */
    public Map<ContainerType, C36516a> mo103433r() {
        HashMap hashMap = new HashMap();
        mo31318i().setFragmentParams(new LeftWindowParams.C36569a().mo134958a(mo31311b()).mo134930b());
        C36529b bVar = new C36529b();
        bVar.setFragmentParams(new MainWindowParams.C36570a(ContainerType.Right).mo134958a(mo31311b()).mo134930b());
        Bundle arguments = bVar.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("holder", R.drawable.empty_default_icon);
        bVar.setArguments(arguments);
        hashMap.put(ContainerType.Left, mo31318i());
        hashMap.put(bVar.getFragmentParams().getContainerType(), bVar);
        return hashMap;
    }

    public C35576b(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        this.f92014c = context;
        this.f92017f = eVar;
        this.f92018g = iTitleController;
    }
}
