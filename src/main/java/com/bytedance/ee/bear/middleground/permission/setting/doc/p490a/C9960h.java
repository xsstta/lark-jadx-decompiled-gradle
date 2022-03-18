package com.bytedance.ee.bear.middleground.permission.setting.doc.p490a;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground.permission.setting.SelectItemView;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.a.h */
public class C9960h extends C9951e {
    /* renamed from: a */
    private int m41443a(boolean z) {
        return z ? R.string.CreationMobile_Wiki_DocsMigration_page_NoPermission_ContactAdmin_tips : R.string.CreationMobile_Wiki_DocsMigration_page_NoPermission_ContactOwner_tips;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.C9951e
    /* renamed from: c */
    public void mo38146c() {
        super.mo38146c();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.C9951e, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.C9951e
    /* renamed from: d */
    public void mo38147d() {
        super.mo38147d();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.C9951e
    /* renamed from: b */
    public void mo38145b(IDocPublicPermission iDocPublicPermission) {
        super.mo38145b(iDocPublicPermission);
        if (!this.f26900c.mo38839l()) {
            m41444a(this.f26913p, m41443a(this.f26900c.mo38841n()));
            m41444a(this.f26914q, m41443a(this.f26900c.mo38841n()));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.C9951e
    /* renamed from: a */
    public void mo38141a(IDocPublicPermission iDocPublicPermission) {
        super.mo38141a(iDocPublicPermission);
        if (this.f26900c != null && !this.f26900c.mo38840m()) {
            m41444a(this.f26906i, m41443a(this.f26900c.mo38842o()));
            m41444a(this.f26907j, m41443a(this.f26900c.mo38842o()));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.C9951e
    /* renamed from: a */
    public void mo38143a(boolean z, boolean z2) {
        this.f26904g.setVisibility(8);
    }

    /* renamed from: a */
    private void m41444a(SelectItemView selectItemView, final int i) {
        selectItemView.getCheckBox().setEnabled(false);
        selectItemView.setTextColor(this.f26898a.getResources().getColor(R.color.text_disable));
        selectItemView.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.C9960h.C99611 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                Toast.showText(C9960h.this.f26898a, C9960h.this.f26898a.getString(i));
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.C9951e
    /* renamed from: a */
    public void mo38142a(IDocPublicPermission iDocPublicPermission, boolean z, boolean z2, boolean z3) {
        this.f26911n.setVisibility(8);
        this.f26909l.setVisibility(8);
        this.f26910m.setVisibility(8);
        this.f26912o.setVisibility(8);
        this.f26908k.setVisibility(8);
        this.f26903f.setVisibility(8);
    }

    public C9960h(Context context, Fragment fragment, C10917c cVar, DocPermSetInfo docPermSetInfo, String str, View view) {
        super(context, fragment, cVar, docPermSetInfo, str, view);
    }
}
