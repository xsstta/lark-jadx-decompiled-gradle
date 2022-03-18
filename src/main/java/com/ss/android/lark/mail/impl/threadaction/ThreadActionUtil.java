package com.ss.android.lark.mail.impl.threadaction;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.entity.SearchRet;
import com.ss.android.lark.mail.impl.service.C43277a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ThreadActionUtil {
    public static boolean containsOtherSender(List<MailThread> list) {
        if (CollectionUtils.isEmpty(list)) {
            Log.m165383e("ThreadActionUtil", "containsOtherSender empty list");
            return false;
        }
        for (MailThread mailThread : list) {
            if (mailThread != null && mailThread.mo151674A()) {
                return true;
            }
        }
        return false;
    }

    public static Map<String, Boolean> getActionMap(List<String> list) {
        HashMap hashMap = new HashMap();
        if (CollectionUtils.isEmpty(list)) {
            return hashMap;
        }
        for (String str : list) {
            if (str != null) {
                hashMap.put(str, true);
            }
        }
        return hashMap;
    }

    public static boolean containsOtherAddress(List<MailAddress> list) {
        if (CollectionUtils.isEmpty(list)) {
            Log.m165383e("ThreadActionUtil", "containsOtherAddress empty list");
            return false;
        }
        String e = C43277a.m171921a().mo154947k().mo151182e();
        if (TextUtils.isEmpty(e)) {
            Log.m165383e("ThreadActionUtil", "containsOtherAddress invalid address");
            return false;
        }
        for (MailAddress mailAddress : list) {
            if (!(mailAddress == null || TextUtils.isEmpty(mailAddress.mo151182e()) || mailAddress.mo151182e().equals(e))) {
                return true;
            }
        }
        return false;
    }

    public static Map<String, Boolean> containsLabelsForSearchResult(ArrayList<String> arrayList, List<MailThread> list) {
        HashMap hashMap = new HashMap();
        if (!CollectionUtils.isEmpty(arrayList) && !CollectionUtils.isEmpty(list)) {
            ArrayList<SearchRet> arrayList2 = new ArrayList();
            for (MailThread mailThread : list) {
                if (mailThread != null && (mailThread instanceof SearchRet)) {
                    arrayList2.add((SearchRet) mailThread);
                }
            }
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next != null) {
                    hashMap.put(next, false);
                }
            }
            int size = hashMap.size();
            for (SearchRet searchRet : arrayList2) {
                if (size == 0) {
                    break;
                } else if (searchRet != null && !CollectionUtils.isEmpty(searchRet.mo151755G())) {
                    for (String str : searchRet.mo151755G()) {
                        if (!TextUtils.isEmpty(str)) {
                            if (hashMap.get(str) == Boolean.FALSE) {
                                hashMap.put(str, true);
                                size--;
                            }
                            if (size == 0) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        return hashMap;
    }
}
