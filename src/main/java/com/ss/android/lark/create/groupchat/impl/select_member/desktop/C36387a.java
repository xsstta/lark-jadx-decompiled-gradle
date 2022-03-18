package com.ss.android.lark.create.groupchat.impl.select_member.desktop;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleInfo;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.create.groupchat.impl.select_member.desktop.a */
public class C36387a implements AbstractC36553a, AbstractC44552i, AbstractC44552i.AbstractC44555c {

    /* renamed from: a */
    public C36389b f93873a;

    /* renamed from: b */
    private Context f93874b;

    /* renamed from: c */
    private int f93875c = 1;

    @Override // com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a, com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: b */
    public String mo31311b() {
        return "create_group";
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
        this.f93873a = null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: d */
    public int mo31313d() {
        return this.f93875c;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: l */
    public AbstractC44552i.AbstractC44553a mo31321l() {
        return new AbstractC44552i.AbstractC44553a() {
            /* class com.ss.android.lark.create.groupchat.impl.select_member.desktop.C36387a.C363881 */

            @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
            /* renamed from: b */
            public void mo31325b(String str, String str2) {
            }

            @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
            /* renamed from: a */
            public void mo31324a(String str, String str2) {
                if (str.equals("create_group") && C36387a.this.f93873a != null) {
                    C36512a.m144041a().mo134778d("create_group");
                    C36387a.this.f93873a = null;
                }
            }
        };
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a
    /* renamed from: r */
    public Map<ContainerType, C36516a> mo103433r() {
        if (this.f93873a == null) {
            this.f93873a = new C36389b();
        }
        return m143417a(this.f93873a);
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: a */
    public void mo31309a(Bundle bundle) {
        C36389b bVar = this.f93873a;
        if (bVar != null) {
            bVar.onNewArguments(bundle);
        }
    }

    public C36387a(Context context) {
        this.f93874b = context;
    }

    /* renamed from: a */
    private Map<ContainerType, C36516a> m143417a(C36516a aVar) {
        HashMap hashMap = new HashMap();
        aVar.setFragmentParams(new MainWindowParams.C36570a(ContainerType.ALL).mo134958a(mo31311b()).mo134930b());
        hashMap.put(aVar.getFragmentParams().getContainerType(), aVar);
        return hashMap;
    }
}
