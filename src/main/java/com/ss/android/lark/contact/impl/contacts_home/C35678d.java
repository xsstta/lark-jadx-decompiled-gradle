package com.ss.android.lark.contact.impl.contacts_home;

import com.larksuite.suite.R;
import com.ss.android.lark.maincore.AbstractC44545b;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.contacts_home.d */
public class C35678d implements ITitleInfo {

    /* renamed from: a */
    boolean f92290a = true;

    /* renamed from: b */
    private List<AbstractC44545b> f92291b = new ArrayList();

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: f */
    public ITitleInfo.AbstractC44542a mo33260f() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: g */
    public ITitleInfo.C44543b mo33261g() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: c */
    public ITitleInfo.IconStyle mo33257c() {
        return ITitleInfo.IconStyle.Hide;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: d */
    public List<AbstractC44545b> mo33258d() {
        return this.f92291b;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: e */
    public ITitleInfo.Status mo33259e() {
        return ITitleInfo.Status.Normal;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: a */
    public boolean mo33255a() {
        return this.f92290a;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: b */
    public String mo33256b() {
        return UIHelper.getString(R.string.Lark_Contacts_Contacts);
    }

    /* renamed from: a */
    public void mo131443a(boolean z) {
        this.f92290a = z;
    }

    /* renamed from: a */
    public void mo131442a(AbstractC44545b bVar) {
        if (!this.f92291b.contains(bVar)) {
            this.f92291b.add(bVar);
        }
    }

    /* renamed from: b */
    public void mo131444b(AbstractC44545b bVar) {
        this.f92291b.remove(bVar);
    }
}
