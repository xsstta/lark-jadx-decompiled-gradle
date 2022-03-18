package com.huawei.hms.site;

import android.view.View;
import com.huawei.hms.site.C23771v;
import com.huawei.hms.site.widget.SearchActivity;

/* renamed from: com.huawei.hms.site.u */
public class View$OnClickListenerC23770u implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f58844a;

    /* renamed from: b */
    public final /* synthetic */ C23771v f58845b;

    public View$OnClickListenerC23770u(C23771v vVar, int i) {
        this.f58845b = vVar;
        this.f58844a = i;
    }

    public void onClick(View view) {
        C23771v vVar = this.f58845b;
        C23771v.AbstractC23772a aVar = vVar.f58847b;
        if (aVar != null) {
            String siteId = vVar.f58846a.get(this.f58844a).getSiteId();
            SearchActivity searchActivity = ((C23768s) aVar).f58843a;
            if (searchActivity.f58851b == null) {
                C23761m.m86935b("SearchActivity", "textSearch API key is null. Search service is null.");
            } else {
                searchActivity.mo85184a(siteId);
            }
        }
    }
}
