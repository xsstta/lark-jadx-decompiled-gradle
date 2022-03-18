package com.ss.android.lark.widget.crumbs;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.larksuite.component.universe_design.breadcrumb.OnBreadcrumbItemClickListener;
import com.larksuite.component.universe_design.breadcrumb.UDBreadcrumb;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import java.util.ArrayList;

public class DepartmentBreadcrumbsView extends UDBreadcrumb {

    /* renamed from: a */
    private static int f143610a = 2;

    /* renamed from: b */
    private final ArrayList<C58375a> f143611b;

    public int getBaseLengthPrefix() {
        return f143610a;
    }

    public ArrayList<C58375a> getItems() {
        return this.f143611b;
    }

    /* renamed from: b */
    private boolean m226278b() {
        if (getItemCount() != 0) {
            return true;
        }
        return false;
    }

    public C58375a getTopItem() {
        if (this.f143611b.isEmpty()) {
            return null;
        }
        ArrayList<C58375a> arrayList = this.f143611b;
        return arrayList.get(arrayList.size() - 1);
    }

    public DepartmentBreadcrumbsView(Context context) {
        this(context, null);
    }

    public void setCallback(AbstractC58376b bVar) {
        setOnItemClickListener(new OnBreadcrumbItemClickListener(bVar) {
            /* class com.ss.android.lark.widget.crumbs.$$Lambda$DepartmentBreadcrumbsView$qGurevpmpNBj3wpvxWhOBRcyEQE */
            public final /* synthetic */ AbstractC58376b f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.larksuite.component.universe_design.breadcrumb.OnBreadcrumbItemClickListener
            public final void onItemClick(int i) {
                DepartmentBreadcrumbsView.this.m226276a((DepartmentBreadcrumbsView) this.f$1, (AbstractC58376b) i);
            }
        });
    }

    /* renamed from: c */
    public void mo197622c(int i) {
        mo90283a(i);
        ArrayList<C58375a> arrayList = this.f143611b;
        this.f143611b.removeAll(arrayList.subList(i, arrayList.size()));
    }

    public DepartmentBreadcrumbsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m226276a(AbstractC58376b bVar, int i) {
        bVar.onItemClick(this.f143611b.get(i), i);
    }

    /* renamed from: a */
    public void mo197619a(String str, String str2) {
        mo90284a(str2);
        this.f143611b.add(new C58375a(str, str2));
    }

    /* renamed from: a */
    public void mo197620a(String str, String str2, boolean z) {
        m226277a(str, str2, R.string.Lark_Contacts_Contacts, z);
    }

    public DepartmentBreadcrumbsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f143611b = new ArrayList<>();
    }

    /* renamed from: b */
    public void mo197621b(String str, String str2, boolean z) {
        if (!m226278b()) {
            mo197620a(str, str2, z);
            return;
        }
        ArrayList<C58375a> arrayList = this.f143611b;
        for (int i = 0; i < arrayList.size(); i++) {
            C58375a aVar = arrayList.get(i);
            if (TextUtils.equals(aVar.mo197629b(), str)) {
                aVar.mo197628a(str2);
                return;
            }
        }
        mo197619a(str, str2);
    }

    /* renamed from: a */
    private void m226277a(String str, String str2, int i, boolean z) {
        int i2;
        this.f143611b.clear();
        if (z) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        f143610a = i2;
        if (z) {
            String string = UIUtils.getString(getContext(), i);
            mo90284a(string);
            this.f143611b.add(new C58375a("-1", string));
        }
        mo90284a(str2);
        this.f143611b.add(new C58375a(str, str2));
    }
}
