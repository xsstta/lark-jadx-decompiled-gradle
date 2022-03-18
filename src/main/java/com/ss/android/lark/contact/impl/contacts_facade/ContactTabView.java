package com.ss.android.lark.contact.impl.contacts_facade;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.impl.contacts_facade.C35571a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.tab.C59204a;
import com.ss.android.lark.widget.tab.MainTabItemView;

public class ContactTabView extends MainTabItemView {

    /* renamed from: a */
    private C35571a f92000a;

    /* renamed from: d */
    private void m139255d() {
        C35571a aVar = this.f92000a;
        if (aVar != null) {
            aVar.mo131197a();
        }
    }

    /* renamed from: e */
    private void m139256e() {
        C35571a aVar = this.f92000a;
        if (aVar != null) {
            aVar.mo131199b();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m139255d();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        m139256e();
        super.onDetachedFromWindow();
    }

    /* renamed from: c */
    private void m139254c() {
        int i;
        final int i2;
        setId(R.id.contact_tab);
        C35571a aVar = new C35571a(new C35571a.AbstractC35575a() {
            /* class com.ss.android.lark.contact.impl.contacts_facade.ContactTabView.C355691 */

            @Override // com.ss.android.lark.contact.impl.contacts_facade.C35571a.AbstractC35575a
            /* renamed from: a */
            public void mo131193a(int i) {
                ContactTabView.this.mo201233a(i);
            }

            @Override // com.ss.android.lark.contact.impl.contacts_facade.C35571a.AbstractC35575a
            /* renamed from: a */
            public void mo131194a(C59204a aVar) {
                ContactTabView.this.setRedDotView(aVar);
            }
        });
        this.f92000a = aVar;
        aVar.mo131198a(getContext());
        if (DesktopUtil.m144301a(getContext())) {
            i = R.drawable.ic_tab_contacts_normal_desktop;
        } else {
            i = R.drawable.ud_icon_tab_contacts_filled;
        }
        if (DesktopUtil.m144301a(getContext())) {
            i2 = R.drawable.ic_tab_contacts_checked_desktop;
        } else {
            i2 = R.drawable.ud_icon_tab_contacts_colorful;
        }
        mo201235a(UDIconUtils.getIconDrawable(getContext(), i, getResources().getColor(R.color.ud_N500)), new MainTabItemView.AbstractC59196a() {
            /* class com.ss.android.lark.contact.impl.contacts_facade.ContactTabView.C355702 */

            @Override // com.ss.android.lark.widget.tab.MainTabItemView.AbstractC59196a
            public Drawable getDrawable() {
                return UDIconUtils.getIconDrawable(ContactTabView.this.getContext(), i2);
            }
        });
        setTabTitle(UIHelper.getString(R.string.Lark_Contacts_Contacts));
    }

    public ContactTabView(Context context) {
        this(context, null);
    }

    public ContactTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContactTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m139254c();
    }
}
