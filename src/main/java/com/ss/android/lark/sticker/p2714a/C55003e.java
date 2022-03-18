package com.ss.android.lark.sticker.p2714a;

import com.ss.android.lark.sticker.dto.Sticker;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.a.e */
public class C55003e {
    /* renamed from: a */
    public static List<Sticker> m213652a(List<String> list, long j) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Sticker sticker = new Sticker();
            sticker.setKey(list.get(i));
            sticker.setPosition(i);
            sticker.setUpdateTime(j);
            arrayList.add(sticker);
        }
        return arrayList;
    }
}
