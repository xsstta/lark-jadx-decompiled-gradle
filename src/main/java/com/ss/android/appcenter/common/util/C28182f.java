package com.ss.android.appcenter.common.util;

import com.google.gson.JsonArray;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.appcenter.common.util.f */
public class C28182f {
    /* renamed from: b */
    public static List m103237b(List list) {
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    public static int m103234a(List list) {
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: c */
    public static boolean m103238c(List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static JsonArray m103239d(List<ItemInfo> list) {
        JsonArray jsonArray = new JsonArray();
        for (ItemInfo itemInfo : list) {
            jsonArray.add(itemInfo.getItemId());
        }
        return jsonArray;
    }

    /* renamed from: a */
    public static boolean m103236a(int i, List list) {
        if (list == null || list.size() - 1 != i) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static <T> T m103235a(List<T> list, int i, T t) {
        if (!m103238c(list) && i >= 0 && i < list.size()) {
            return list.get(i);
        }
        return t;
    }
}
