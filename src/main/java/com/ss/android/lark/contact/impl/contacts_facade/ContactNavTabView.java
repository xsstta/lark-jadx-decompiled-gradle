package com.ss.android.lark.contact.impl.contacts_facade;

import android.content.Context;
import android.util.AttributeSet;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.impl.contacts_facade.C35571a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.tab.C59204a;
import com.ss.android.lark.widget.tab.NavigationTabItemView;

public class ContactNavTabView extends NavigationTabItemView {

    /* renamed from: a */
    private C35571a f91998a;

    /* renamed from: a */
    private void m139249a() {
        C35571a aVar = this.f91998a;
        if (aVar != null) {
            aVar.mo131197a();
        }
    }

    /* renamed from: b */
    private void m139251b() {
        C35571a aVar = this.f91998a;
        if (aVar != null) {
            aVar.mo131199b();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m139249a();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        m139251b();
        super.onDetachedFromWindow();
    }

    public ContactNavTabView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m139250a(Context context) {
        setTabIcon(UDIconUtils.getIconDrawable(getContext(), (int) R.drawable.ud_icon_tab_contacts_filled, UIHelper.getColor(R.color.ud_Y500)));
        setTabTitle(getContext().getString(R.string.Lark_Contacts_Contacts));
        setId(R.id.contact_tab);
        C35571a aVar = new C35571a(new C35571a.AbstractC35575a() {
            /* class com.ss.android.lark.contact.impl.contacts_facade.ContactNavTabView.C355681 */

            @Override // com.ss.android.lark.contact.impl.contacts_facade.C35571a.AbstractC35575a
            /* renamed from: a */
            public void mo131193a(int i) {
                ContactNavTabView.this.mo201263a(i);
            }

            @Override // com.ss.android.lark.contact.impl.contacts_facade.C35571a.AbstractC35575a
            /* renamed from: a */
            public void mo131194a(C59204a aVar) {
                ContactNavTabView.this.setRedDotView(aVar);
            }
        });
        this.f91998a = aVar;
        aVar.mo131198a(context);
    }

    public ContactNavTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContactNavTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m139250a(context);
    }
}
