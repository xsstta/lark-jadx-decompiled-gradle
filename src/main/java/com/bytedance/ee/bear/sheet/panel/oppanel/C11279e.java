package com.bytedance.ee.bear.sheet.panel.oppanel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.sheet.filter.FilterFragment;
import com.bytedance.ee.bear.sheet.panel.SheetItem;
import com.bytedance.ee.bear.sheet.panel.oppanel.C11274c;
import com.bytedance.ee.bear.sheet.panel.p547a.C11259a;
import com.bytedance.ee.bear.sheet.panel.panelcell.AbstractC11286a;
import com.larksuite.suite.R;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.sheet.panel.oppanel.e */
public class C11279e extends AbstractC11270a {

    /* renamed from: b */
    private C11274c f30325b = new C11274c();

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.panel.AbstractC11257a
    /* renamed from: c */
    public String mo42711c() {
        return SubPanelEnum.operation.name();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ boolean m46864e(String str) {
        return mo42710b().showBadges(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.panel.AbstractC11257a
    /* renamed from: a */
    public void mo43167a(SheetItem[] sheetItemArr) {
        super.mo43167a(sheetItemArr);
        ArrayList arrayList = new ArrayList();
        for (SheetItem sheetItem : sheetItemArr) {
            if (sheetItem != null && mo43171d(sheetItem.getId()) == null) {
                arrayList.add(sheetItem);
            }
        }
        this.f30325b.mo43219a((SheetItem[]) arrayList.toArray(new SheetItem[arrayList.size()]));
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.panel.AbstractC11257a
    /* renamed from: a */
    public boolean mo43168a(String str) {
        if (OperationEnum.freezeSheet.name().equals(str)) {
            this.f30312a.openChildFragment(C11259a.class);
            return true;
        } else if (!OperationEnum.filter.name().equals(str)) {
            return false;
        } else {
            this.f30312a.openChildFragment(FilterFragment.class);
            return true;
        }
    }

    @Override // com.bytedance.ee.bear.sheet.panel.AbstractC11257a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.operation_list);
        C11274c cVar = new C11274c();
        this.f30325b = cVar;
        cVar.mo43218a(new AbstractC11286a.AbstractC11287a() {
            /* class com.bytedance.ee.bear.sheet.panel.oppanel.$$Lambda$myC7YasXFOLJGtaaRgIToiwGsQ */

            @Override // com.bytedance.ee.bear.sheet.panel.panelcell.AbstractC11286a.AbstractC11287a
            public final void clickItem(String str, String str2) {
                C11279e.this.mo43166a(str, str2);
            }
        });
        this.f30325b.mo43217a(new C11274c.AbstractC11276b() {
            /* class com.bytedance.ee.bear.sheet.panel.oppanel.$$Lambda$e$QFX8iP1_YT7dn2UX4XCHWLUrMA0 */

            @Override // com.bytedance.ee.bear.sheet.panel.oppanel.C11274c.AbstractC11276b
            public final boolean showBadge(String str) {
                return C11279e.this.m46864e(str);
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        recyclerView.setAdapter(this.f30325b);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.sheet_oppanel_operation_fragment, viewGroup, false);
    }
}
