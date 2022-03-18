package com.larksuite.component.dynamicresources;

import android.view.View;
import com.larksuite.component.dynamicresources.C24308i;
import java.util.Map;

/* renamed from: com.larksuite.component.dynamicresources.b */
class C24286b extends C24284a {
    /* renamed from: a */
    public static void m88674a(Map<String, C24308i.AbstractC24310a> map) {
        map.put(m88672a("background", "color"), new C24308i.AbstractC24310a() {
            /* class com.larksuite.component.dynamicresources.C24286b.C242871 */

            @Override // com.larksuite.component.dynamicresources.C24308i.AbstractC24310a
            /* renamed from: a */
            public void mo86981a(View view, AbstractC24311j jVar, int i) {
                view.setBackgroundColor(jVar.getColor(i));
            }
        });
        map.put(m88672a("background", "drawable"), new C24308i.AbstractC24310a() {
            /* class com.larksuite.component.dynamicresources.C24286b.C242882 */

            @Override // com.larksuite.component.dynamicresources.C24308i.AbstractC24310a
            /* renamed from: a */
            public void mo86981a(View view, AbstractC24311j jVar, int i) {
                view.setBackground(jVar.getDrawable(i));
            }
        });
    }
}
