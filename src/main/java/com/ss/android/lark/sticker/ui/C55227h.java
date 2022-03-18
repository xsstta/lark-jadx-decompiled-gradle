package com.ss.android.lark.sticker.ui;

import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.sticker.dto.UISticker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.ui.h */
public class C55227h {
    /* renamed from: a */
    public static List<UISticker> m214223a(List<UISticker> list) {
        ArrayList arrayList = new ArrayList();
        for (UISticker uISticker : list) {
            if (uISticker.isSelected()) {
                arrayList.add(uISticker);
            }
        }
        Collections.sort(arrayList, new Comparator<UISticker>() {
            /* class com.ss.android.lark.sticker.ui.C55227h.C552281 */

            /* renamed from: a */
            public int compare(UISticker uISticker, UISticker uISticker2) {
                if (uISticker.getSelected() > uISticker2.getSelected()) {
                    return 1;
                }
                if (uISticker.getSelected() < uISticker2.getSelected()) {
                    return -1;
                }
                return 0;
            }
        });
        return arrayList;
    }

    /* renamed from: b */
    public static List<UISticker> m214224b(List<UISticker> list) {
        List<UISticker> a = m214223a(list);
        ArrayList arrayList = new ArrayList();
        int i = 1;
        for (UISticker uISticker : a) {
            if (uISticker.getSelected() != i) {
                uISticker.setSelected(i);
                arrayList.add(uISticker);
            }
            i++;
        }
        return arrayList;
    }

    /* renamed from: c */
    public static List<Sticker> m214225c(List<UISticker> list) {
        ArrayList arrayList = new ArrayList();
        for (UISticker uISticker : m214223a(list)) {
            arrayList.add(uISticker.getSticker());
        }
        return arrayList;
    }
}
