package com.larksuite.component.dynamicresources;

import android.widget.ImageView;
import com.larksuite.component.dynamicresources.C24284a;
import com.larksuite.component.dynamicresources.C24308i;
import java.util.Map;

/* renamed from: com.larksuite.component.dynamicresources.m */
class C24314m extends C24284a {
    /* renamed from: a */
    public static void m88745a(Map<String, Map<String, C24308i.AbstractC24310a>> map) {
        m88673a(map, new C24284a.C24285a("ImageView", "src", "drawable"), new C24308i.AbstractC24310a<ImageView>() {
            /* class com.larksuite.component.dynamicresources.C24314m.C243151 */

            /* renamed from: a */
            public void mo86981a(ImageView imageView, AbstractC24311j jVar, int i) {
                imageView.setImageDrawable(jVar.getDrawable(i));
            }
        });
    }
}
