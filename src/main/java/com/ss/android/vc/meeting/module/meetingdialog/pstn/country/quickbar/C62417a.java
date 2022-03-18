package com.ss.android.vc.meeting.module.meetingdialog.pstn.country.quickbar;

import com.ss.android.vc.meeting.module.meetingdialog.pstn.country.CountryInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.pstn.country.quickbar.a */
public class C62417a {

    /* renamed from: a */
    private static HashMap<String, Integer> f157003a = new HashMap<>();

    /* renamed from: a */
    public static Map<String, Integer> m243950a() {
        return f157003a;
    }

    /* renamed from: a */
    public static List<String> m243949a(Collection<CountryInfo> collection) {
        f157003a.clear();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (CountryInfo countryInfo : collection) {
            String upperCase = countryInfo.getHeadIndex().toUpperCase();
            if (countryInfo.getHeadIndex().equals("-1")) {
                upperCase = "#";
            }
            if (!f157003a.containsKey(upperCase.toUpperCase())) {
                f157003a.put(upperCase.toUpperCase(), Integer.valueOf(i));
                arrayList.add(upperCase.toUpperCase());
            } else if (!arrayList.contains(upperCase.toUpperCase())) {
                arrayList.add(upperCase.toUpperCase());
            }
            i++;
        }
        return arrayList;
    }
}
