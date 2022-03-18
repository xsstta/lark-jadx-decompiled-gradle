package com.bytedance.ee.bear.bitable.fab;

import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.bitable.fab.c */
enum EnumC4785c {
    bitableViewList(0, R.drawable.ud_icon_view_list_outlined, R.color.bg_float, R.color.primary_pri_500),
    bitableManager(0, R.drawable.ud_icon_view_list_outlined, R.color.bg_float, R.color.primary_pri_500),
    kanbanZoomIn(0, R.drawable.ud_icon_zoom_in_outlined, R.color.bg_float, R.color.primary_pri_500),
    kanbanZoomOut(0, R.drawable.ud_icon_zoom_out_outlined, R.color.bg_float, R.color.primary_pri_500),
    createRecord(0, R.drawable.ud_icon_add_outlined, R.color.primary_pri_500, R.color.static_white),
    shareForm(1);
    

    /* renamed from: a */
    private static Map<String, EnumC4785c> f14070a = new HashMap();
    public int colorRes;
    public int imageRes;
    public int imageTintColorRes;
    public int type;

    static {
        EnumC4785c[] values = values();
        for (EnumC4785c cVar : values) {
            f14070a.put(cVar.name(), cVar);
        }
    }

    public static EnumC4785c getEBitableFabByName(String str) {
        EnumC4785c cVar = f14070a.get(str);
        if (cVar == null) {
            return bitableViewList;
        }
        return cVar;
    }

    private EnumC4785c(int i) {
        this(i, 0);
    }

    private EnumC4785c(int i, int i2) {
        this(i, i2, 0);
    }

    private EnumC4785c(int i, int i2, int i3) {
        this(i, i2, i3, 0);
    }

    private EnumC4785c(int i, int i2, int i3, int i4) {
        this.type = i;
        this.imageRes = i2;
        this.colorRes = i3;
        this.imageTintColorRes = i4;
    }
}
