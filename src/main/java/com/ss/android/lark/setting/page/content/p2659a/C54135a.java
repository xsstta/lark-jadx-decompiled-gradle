package com.ss.android.lark.setting.page.content.p2659a;

import android.content.Context;
import android.view.View;
import com.ss.android.lark.setting.DividerItemView;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.setting.export.AbstractC54126b;
import com.ss.android.lark.setting.export.SystemSettingComponentType;

/* renamed from: com.ss.android.lark.setting.page.content.a.a */
public class C54135a implements AbstractC54125a {

    /* renamed from: a */
    private Context f134019a;

    /* renamed from: b */
    private int f134020b;

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: a */
    public /* synthetic */ void mo132391a() {
        AbstractC54126b.CC.$default$a(this);
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    public /* synthetic */ void aA_() {
        AbstractC54126b.CC.$default$aA_(this);
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: d */
    public void mo132396d() {
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: e */
    public void mo132397e() {
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: f */
    public /* synthetic */ boolean mo132398f() {
        return AbstractC54125a.CC.$default$f(this);
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: g */
    public /* synthetic */ void mo132399g() {
        AbstractC54126b.CC.$default$g(this);
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: c */
    public String mo132395c() {
        return SystemSettingComponentType.DIVIDER.getValue();
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    public View az_() {
        return new DividerItemView.C54110a(this.f134019a).mo185185a(this.f134020b).mo185186a(false).mo185187a();
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: b */
    public View mo132394b() {
        return new DividerItemView.C54110a(this.f134019a).mo185185a(this.f134020b).mo185186a(false).mo185187a();
    }

    public C54135a(Context context, int i) {
        this.f134019a = context;
        this.f134020b = i;
    }
}
