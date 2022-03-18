package com.ss.android.lark.passport.infra.widget.quick_sidebar;

import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.passport.infra.widget.quick_sidebar.a */
public class C49274a {

    /* renamed from: a */
    private static final HashMap<String, Integer> f123698a = new HashMap<>();

    /* renamed from: a */
    public static Map<String, Integer> m194167a() {
        return f123698a;
    }

    /* renamed from: a */
    public static List<String> m194166a(Collection<CountryBean> collection) {
        f123698a.clear();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (CountryBean countryBean : collection) {
            String upperCase = countryBean.getHeadIndex().toUpperCase();
            if (countryBean.getHeadIndex().equals("-1")) {
                upperCase = "#";
            }
            HashMap<String, Integer> hashMap = f123698a;
            if (!hashMap.containsKey(upperCase.toUpperCase())) {
                hashMap.put(upperCase.toUpperCase(), Integer.valueOf(i));
                arrayList.add(upperCase.toUpperCase());
            } else if (!arrayList.contains(upperCase.toUpperCase())) {
                arrayList.add(upperCase.toUpperCase());
            }
            i++;
        }
        return arrayList;
    }
}
