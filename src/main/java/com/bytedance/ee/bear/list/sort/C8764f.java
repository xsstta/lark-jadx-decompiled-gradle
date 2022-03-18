package com.bytedance.ee.bear.list.sort;

import android.text.TextUtils;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.util.io.AbstractC13673d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.sort.f */
public class C8764f {
    /* renamed from: a */
    public static ArrayList<Document> m36799a(FolderSortStrategy folderSortStrategy, List<Document> list) {
        ArrayList<Document> arrayList = new ArrayList<>();
        if (!(list == null || list.size() == 0)) {
            if (folderSortStrategy == null) {
                return (ArrayList) list;
            }
            if (folderSortStrategy.mo31554d() != FilterType.ALL.getType()) {
                for (Document document : list) {
                    if (folderSortStrategy.mo31554d() == C8275a.f22375h.mo32555b() && document.mo32483t() == C8275a.f22375h.mo32555b()) {
                        if (TextUtils.equals(folderSortStrategy.mo31560f(), FilterType.PHOTO.getFileType()) && Arrays.asList(AbstractC13673d.f35862a).contains(document.mo32377C().toLowerCase())) {
                            arrayList.add(document);
                        }
                        if (TextUtils.equals(folderSortStrategy.mo31561g(), FilterType.FILE.getForbiddenFileType()) && !Arrays.asList(AbstractC13673d.f35862a).contains(document.mo32377C().toLowerCase())) {
                            arrayList.add(document);
                        }
                    } else if (folderSortStrategy.mo31554d() == C8275a.f22371d.mo32555b()) {
                        if (document.mo32483t() == C8275a.f22371d.mo32555b() || document.mo32483t() == C8275a.f22378k.mo32555b()) {
                            arrayList.add(document);
                        }
                    } else if (document.mo32483t() == folderSortStrategy.mo31554d()) {
                        arrayList.add(document);
                    }
                }
            } else {
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }
}
