package com.bytedance.ee.bear.sheet.panel.oppanel;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.sheet.borderline.BorderLineData;
import com.bytedance.ee.bear.sheet.borderline.C11060a;
import com.bytedance.ee.bear.sheet.borderline.C11061b;
import com.bytedance.ee.bear.sheet.panel.SheetItem;
import com.bytedance.ee.bear.sheet.panel.oppanel.C11274c;
import com.bytedance.ee.bear.sheet.panel.panelcell.AbstractC11286a;
import com.bytedance.ee.bear.sheet.selectcolor.C11303a;
import com.bytedance.ee.bear.sheet.selectcolor.C11304b;
import com.bytedance.ee.bear.sheet.selectcolor.SheetSelectColorData;
import com.larksuite.suite.R;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.sheet.panel.oppanel.f */
public class C11280f extends AbstractC11270a {

    /* renamed from: b */
    private C11061b f30326b;

    /* renamed from: c */
    private C11304b f30327c;

    /* renamed from: d */
    private C11274c f30328d = new C11274c();

    /* renamed from: e */
    private String f30329e;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.panel.AbstractC11257a
    /* renamed from: c */
    public String mo42711c() {
        return SubPanelEnum.style.name();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m46869f(String str) {
        mo43166a(this.f30329e, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ boolean m46868e(String str) {
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
        this.f30328d.mo43219a((SheetItem[]) arrayList.toArray(new SheetItem[arrayList.size()]));
    }

    @Override // com.bytedance.ee.bear.sheet.panel.oppanel.AbstractC11270a, com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C11061b bVar = (C11061b) C4950k.m20474a(this, C11061b.class);
        this.f30326b = bVar;
        bVar.setCallback(new C11061b.AbstractC11062a() {
            /* class com.bytedance.ee.bear.sheet.panel.oppanel.C11280f.C112811 */

            @Override // com.bytedance.ee.bear.sheet.borderline.C11061b.AbstractC11062a
            /* renamed from: a */
            public <V> void mo42146a(V v) {
                C11280f.this.f30312a.clickItem("borderLine", v);
            }
        });
        C11304b bVar2 = (C11304b) C4950k.m20474a(this, C11304b.class);
        this.f30327c = bVar2;
        bVar2.setCallback(new C11304b.AbstractC11305a() {
            /* class com.bytedance.ee.bear.sheet.panel.oppanel.$$Lambda$f$bqFiCdErcWl1f9Q6eB2eIbspFU */

            @Override // com.bytedance.ee.bear.sheet.selectcolor.C11304b.AbstractC11305a
            public final void onColorSelected(String str) {
                C11280f.this.m46869f(str);
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.panel.AbstractC11257a
    /* renamed from: a */
    public void mo42708a(SheetItem sheetItem) {
        super.mo42708a(sheetItem);
        String id = sheetItem.getId();
        if (OperationEnum.borderLine.name().equals(id)) {
            if (sheetItem.getList() != null && sheetItem.getList().length > 0) {
                this.f30326b.getBorderLineData().mo5929b(new BorderLineData(id, sheetItem.getTitle(), sheetItem.getList()[0]));
            }
        } else if (OperationEnum.foreColor.name().equals(id) || OperationEnum.backColor.name().equals(id)) {
            this.f30327c.getSelectColorData(id).mo5929b(new SheetSelectColorData(sheetItem.getTitle(), sheetItem.getValue(), sheetItem.getList()));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.panel.AbstractC11257a
    /* renamed from: a */
    public boolean mo43168a(String str) {
        if (OperationEnum.borderLine.name().equals(str)) {
            this.f30312a.openChildFragment(C11060a.class);
            return true;
        } else if (!OperationEnum.foreColor.name().equals(str) && !OperationEnum.backColor.name().equals(str)) {
            return false;
        } else {
            this.f30329e = str;
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            this.f30312a.openChildFragment(C11303a.class, bundle);
            return true;
        }
    }

    @Override // com.bytedance.ee.bear.sheet.panel.AbstractC11257a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.style_list);
        C11274c cVar = new C11274c();
        this.f30328d = cVar;
        cVar.mo43218a(new AbstractC11286a.AbstractC11287a() {
            /* class com.bytedance.ee.bear.sheet.panel.oppanel.$$Lambda$wE0sEnRtWpKy3GnNIjKzbuAfW7M */

            @Override // com.bytedance.ee.bear.sheet.panel.panelcell.AbstractC11286a.AbstractC11287a
            public final void clickItem(String str, String str2) {
                C11280f.this.mo43166a(str, str2);
            }
        });
        this.f30328d.mo43217a(new C11274c.AbstractC11276b() {
            /* class com.bytedance.ee.bear.sheet.panel.oppanel.$$Lambda$f$mY8QexbOwudUDliRRs9OY_jVucs */

            @Override // com.bytedance.ee.bear.sheet.panel.oppanel.C11274c.AbstractC11276b
            public final boolean showBadge(String str) {
                return C11280f.this.m46868e(str);
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        recyclerView.setAdapter(this.f30328d);
    }

    @Override // com.bytedance.ee.bear.sheet.panel.AbstractC11257a
    /* renamed from: a */
    public void mo43166a(String str, String str2) {
        if (OperationEnum.borderLine.name().equals(str) && TextUtils.isEmpty(str2)) {
            mo42710b().clickItem("borderLineEnter", str2);
        } else if (OperationEnum.foreColor.name().equals(str) && TextUtils.isEmpty(str2)) {
            mo42710b().clickItem("foreColorBar", str2);
        } else if (!OperationEnum.backColor.name().equals(str) || !TextUtils.isEmpty(str2)) {
            mo42710b().clickItem(str, str2);
        } else {
            mo42710b().clickItem("backColorBar", str2);
        }
        if (mo43169b(str) && mo43168a(str)) {
            mo43172e();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.sheet_oppanel_style_fragment, viewGroup, false);
    }
}
