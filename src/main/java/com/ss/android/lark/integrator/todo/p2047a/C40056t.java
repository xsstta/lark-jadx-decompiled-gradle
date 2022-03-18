package com.ss.android.lark.integrator.todo.p2047a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.integrator.todo.TodoModuleProvider;
import com.ss.android.lark.setting.IndicatorItemView;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.setting.export.AbstractC54126b;
import com.ss.android.lark.setting.export.C54127c;
import com.ss.android.lark.setting.export.SystemSettingComponentType;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.integrator.todo.a.t */
public class C40056t extends C54127c implements AbstractC54125a {

    /* renamed from: a */
    public Activity f101804a;

    /* renamed from: b */
    private View f101805b;

    /* renamed from: c */
    private View f101806c;

    /* renamed from: d */
    private View.OnClickListener f101807d = new View.OnClickListener() {
        /* class com.ss.android.lark.integrator.todo.p2047a.C40056t.View$OnClickListenerC400571 */

        public void onClick(View view) {
            if (DesktopUtil.m144301a((Context) C40056t.this.f101804a)) {
                C40056t.this.mo185301a(view, true);
            }
            TodoModuleProvider.m158690a().mo191653a(C40056t.this.f101804a);
        }
    };

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

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: g */
    public /* synthetic */ void mo132399g() {
        AbstractC54126b.CC.$default$g(this);
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: c */
    public String mo132395c() {
        return SystemSettingComponentType.TODO.getValue();
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: f */
    public boolean mo132398f() {
        return TodoModuleProvider.m158690a().mo191669i();
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    public View az_() {
        if (this.f101805b == null) {
            this.f101805b = new IndicatorItemView.C54112a(this.f101804a).mo185193c(UIHelper.getString(R.string.Todo_Task_Tasks)).mo185191a(this.f101807d).mo185176a(true).mo185179b(true).mo185177a();
        }
        return this.f101805b;
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: b */
    public View mo132394b() {
        if (this.f101806c == null) {
            this.f101806c = new IndicatorItemView.C54112a(this.f101804a).mo185193c(UIHelper.getString(R.string.Todo_Task_Tasks)).mo185191a(this.f101807d).mo185176a(true).mo185179b(true).mo185177a();
        }
        return this.f101806c;
    }

    public C40056t(Activity activity) {
        this.f101804a = activity;
    }
}
