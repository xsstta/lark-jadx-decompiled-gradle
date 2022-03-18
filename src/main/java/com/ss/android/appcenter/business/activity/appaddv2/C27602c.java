package com.ss.android.appcenter.business.activity.appaddv2;

import android.text.TextUtils;
import com.ss.android.appcenter.business.net.tagsandrecent.Tag;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.activity.appaddv2.c */
public class C27602c {
    /* renamed from: a */
    public static boolean m100726a(Tag tag, Tag tag2) {
        if (tag == null || tag2 == null || !TextUtils.equals(tag.getId(), tag2.getId()) || !TextUtils.equals(tag.getName(), tag2.getName())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m100727a(List<Tag> list, List<Tag> list2) {
        int size;
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || (size = list.size()) != list2.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!m100726a(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }
}
