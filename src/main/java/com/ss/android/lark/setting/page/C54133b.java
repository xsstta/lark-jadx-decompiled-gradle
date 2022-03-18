package com.ss.android.lark.setting.page;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.C36529b;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.page.v1.mvp.C54571b;
import com.ss.android.lark.setting.page.v2.C54595b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.setting.page.b */
public class C54133b implements AbstractC36553a, AbstractC44552i, AbstractC44552i.AbstractC44555c {

    /* renamed from: a */
    private Context f134015a;

    /* renamed from: b */
    private C36516a f134016b;

    /* renamed from: c */
    private int f134017c = 1;

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: a */
    public void mo31309a(Bundle bundle) {
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a, com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: b */
    public String mo31311b() {
        return "system_setting";
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: c */
    public <T extends View> T mo31312c() {
        return null;
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
    /* renamed from: j */
    public <T extends View> T mo31319j() {
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
        this.f134016b = null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: d */
    public int mo31313d() {
        return this.f134017c;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: l */
    public AbstractC44552i.AbstractC44553a mo31321l() {
        return new AbstractC44552i.AbstractC44553a() {
            /* class com.ss.android.lark.setting.page.C54133b.C541341 */

            @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
            /* renamed from: a */
            public void mo31324a(String str, String str2) {
            }

            @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
            /* renamed from: b */
            public void mo31325b(String str, String str2) {
            }
        };
    }

    /* renamed from: a */
    private C36529b m210153a() {
        C36529b bVar = new C36529b();
        Bundle arguments = bVar.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("holder", R.drawable.empty_default_icon);
        bVar.setArguments(arguments);
        return bVar;
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a
    /* renamed from: r */
    public Map<ContainerType, C36516a> mo103433r() {
        if (this.f134016b == null) {
            if (C54115c.m210080a().mo178291e().mo178337a("android.setting.v2")) {
                Log.m165389i("system_setting", "desktop use system setting v2");
                this.f134016b = new C54595b();
            } else {
                Log.m165389i("system_setting", "desktop use system setting v1");
                this.f134016b = new C54571b();
            }
        }
        return m210154a(this.f134016b, m210153a());
    }

    public C54133b(Context context) {
        this.f134015a = context;
    }

    /* renamed from: a */
    private Map<ContainerType, C36516a> m210154a(C36516a aVar, C36516a aVar2) {
        HashMap hashMap = new HashMap();
        aVar.setFragmentParams(new MainWindowParams.C36570a(ContainerType.Left).mo134958a(mo31311b()).mo134930b());
        hashMap.put(aVar.getFragmentParams().getContainerType(), aVar);
        aVar2.setFragmentParams(new MainWindowParams.C36570a(ContainerType.Right).mo134958a(mo31311b()).mo134930b());
        hashMap.put(aVar2.getFragmentParams().getContainerType(), aVar2);
        return hashMap;
    }
}
