package com.bytedance.ee.bear.list.manualoffline;

import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.C8677r;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.offlinecache.ManualOfflineConfig;
import com.bytedance.ee.bear.list.sort.AbstractC8755a;
import com.bytedance.ee.bear.list.sort.FilterType;
import com.bytedance.ee.bear.list.sort.SortType;
import com.bytedance.ee.bear.service.C10917c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.manualoffline.i */
public class C8610i extends AbstractC8755a {
    @Override // com.bytedance.ee.bear.list.sort.AbstractC8765g.AbstractC8766a
    /* renamed from: a */
    public List<SortType> mo32811a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SortType(ManualOfflineSort.DEFAULT.getResId(), ManualOfflineSort.DEFAULT.getRank(), ManualOfflineSort.DEFAULT.getAsc(), ManualOfflineSort.DEFAULT.getReportSort()));
        arrayList.add(new SortType(ManualOfflineSort.MODIFIED.getResId(), ManualOfflineSort.MODIFIED.getRank(), ManualOfflineSort.MODIFIED.getAsc(), ManualOfflineSort.MODIFIED.getReportSort()));
        arrayList.add(new SortType(ManualOfflineSort.CREATED.getResId(), ManualOfflineSort.CREATED.getRank(), ManualOfflineSort.CREATED.getAsc(), ManualOfflineSort.CREATED.getReportSort()));
        return arrayList;
    }

    @Override // com.bytedance.ee.bear.list.sort.AbstractC8765g.AbstractC8766a, com.bytedance.ee.bear.list.sort.AbstractC8755a
    /* renamed from: b */
    public List<FilterType> mo33058b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FilterType.ALL);
        arrayList.add(FilterType.DOC);
        ManualOfflineConfig config = ManualOfflineConfig.getConfig();
        if (config.isSheet_enabled()) {
            arrayList.add(FilterType.SHEET);
        }
        if (C8677r.m36258a().mo33682a(C8275a.f22373f.mo32555b()) && config.isBitable_enabled()) {
            arrayList.add(FilterType.BITABLE);
        }
        if (!this.f23610b.mo20318b(C8275a.f22376i.mo32555b()) && config.isSlide_enabled()) {
            arrayList.add(FilterType.SLIDE);
        }
        if (C8292f.m34174b() && config.isMindnote_enabled()) {
            arrayList.add(FilterType.MINDNOTE);
        }
        if (config.isDrive_enabled()) {
            arrayList.add(FilterType.FILE);
            arrayList.add(FilterType.PHOTO);
        }
        return arrayList;
    }

    public C8610i(C10917c cVar, boolean z) {
        super(cVar, z);
    }
}
