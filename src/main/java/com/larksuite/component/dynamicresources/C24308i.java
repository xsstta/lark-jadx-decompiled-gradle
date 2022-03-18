package com.larksuite.component.dynamicresources;

import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.larksuite.component.dynamicresources.i */
class C24308i {

    /* renamed from: a */
    private static Map<String, Map<String, AbstractC24310a>> f59986a = new HashMap();

    /* renamed from: b */
    private static Map<String, AbstractC24310a> f59987b;

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.dynamicresources.i$a */
    public interface AbstractC24310a<T extends View> {
        /* renamed from: a */
        void mo86981a(T t, AbstractC24311j jVar, int i);
    }

    static {
        HashMap hashMap = new HashMap();
        f59987b = hashMap;
        C24286b.m88674a(hashMap);
        C24316n.m88748a(f59986a);
        C24314m.m88745a(f59986a);
    }

    /* renamed from: a */
    private static Map<String, AbstractC24310a> m88737a(View view) {
        if (view instanceof TextView) {
            return f59986a.get("TextView");
        }
        if (view instanceof ImageView) {
            return f59986a.get("ImageView");
        }
        return new ArrayMap();
    }

    /* renamed from: a */
    private static String m88736a(String str, String str2) {
        return str + "-" + str2;
    }

    /* renamed from: a */
    static AbstractC24313l<View> m88735a(View view, Map<String, Pair<String, Integer>> map) {
        final ArrayList arrayList = new ArrayList();
        Map<String, AbstractC24310a> a = m88737a(view);
        for (Map.Entry<String, Pair<String, Integer>> entry : map.entrySet()) {
            String a2 = m88736a(entry.getKey(), (String) entry.getValue().first);
            AbstractC24310a aVar = f59987b.get(a2);
            if (aVar != null) {
                arrayList.add(new Pair(aVar, entry.getValue().second));
            }
            AbstractC24310a aVar2 = a.get(a2);
            if (aVar2 != null) {
                arrayList.add(new Pair(aVar2, entry.getValue().second));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new AbstractC24313l<View>() {
            /* class com.larksuite.component.dynamicresources.C24308i.C243091 */

            @Override // com.larksuite.component.dynamicresources.AbstractC24313l
            /* renamed from: a */
            public boolean mo87007a() {
                return false;
            }

            @Override // com.larksuite.component.dynamicresources.AbstractC24313l
            /* renamed from: a */
            public void mo87006a(View view, AbstractC24311j jVar) {
                for (Pair pair : arrayList) {
                    ((AbstractC24310a) pair.first).mo86981a(view, jVar, ((Integer) pair.second).intValue());
                }
            }
        };
    }
}
