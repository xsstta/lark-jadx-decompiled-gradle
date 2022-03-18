package com.ss.android.lark.favorite;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a;
import com.ss.android.lark.favorite.list.C37217b;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleInfo;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.favorite.a */
public class C37076a implements AbstractC36553a, AbstractC44552i, AbstractC44552i.AbstractC44555c {

    /* renamed from: a */
    public C37217b f95301a;

    /* renamed from: b */
    private Context f95302b;

    /* renamed from: c */
    private int f95303c = 1;

    /* renamed from: d */
    private FavouriteTabView f95304d;

    /* renamed from: e */
    private FavouriteNavTabView f95305e;

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: a */
    public void mo31309a(Bundle bundle) {
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a, com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: b */
    public String mo31311b() {
        return "favorite";
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
    /* renamed from: i */
    public Fragment mo31318i() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: k */
    public ITitleInfo mo31320k() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: m */
    public AbstractC44552i.AbstractC44554b mo31322m() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: n */
    public void mo31323n() {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44555c
    /* renamed from: s */
    public void mo103434s() {
        this.f95301a = null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: d */
    public int mo31313d() {
        return this.f95303c;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: l */
    public AbstractC44552i.AbstractC44553a mo31321l() {
        return new AbstractC44552i.AbstractC44553a() {
            /* class com.ss.android.lark.favorite.C37076a.C370771 */

            @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
            /* renamed from: b */
            public void mo31325b(String str, String str2) {
            }

            @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
            /* renamed from: a */
            public void mo31324a(String str, String str2) {
                if (C37076a.this.f95301a != null && str2.equals(C37076a.this.mo31311b())) {
                    C37076a.this.f95301a.mo136900a();
                }
            }
        };
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: c */
    public <T extends View> T mo31312c() {
        if (this.f95304d == null) {
            this.f95304d = new FavouriteTabView(this.f95302b);
        }
        return this.f95304d;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: j */
    public <T extends View> T mo31319j() {
        if (this.f95305e == null) {
            this.f95305e = new FavouriteNavTabView(this.f95302b);
        }
        return this.f95305e;
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a
    /* renamed from: r */
    public Map<ContainerType, C36516a> mo103433r() {
        if (this.f95301a == null) {
            this.f95301a = new C37217b();
        }
        return m146249a(this.f95301a);
    }

    public C37076a(Context context) {
        this.f95302b = context;
    }

    /* renamed from: a */
    private Map<ContainerType, C36516a> m146249a(C36516a aVar) {
        HashMap hashMap = new HashMap();
        aVar.setFragmentParams(new MainWindowParams.C36570a(ContainerType.ALL).mo134958a(mo31311b()).mo134930b());
        hashMap.put(aVar.getFragmentParams().getContainerType(), aVar);
        return hashMap;
    }
}
