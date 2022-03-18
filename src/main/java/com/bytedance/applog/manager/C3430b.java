package com.bytedance.applog.manager;

import com.bytedance.applog.p201e.AbstractC3402b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/* renamed from: com.bytedance.applog.manager.b */
public class C3430b {

    /* renamed from: a */
    private static final LinkedList<AbstractC3402b> f10903a = new LinkedList<>();

    /* renamed from: b */
    private static final LinkedList<String> f10904b = new LinkedList<>();

    /* renamed from: a */
    public static String[] m14432a() {
        LinkedList<String> linkedList = f10904b;
        int size = linkedList.size();
        if (size <= 0) {
            return null;
        }
        String[] strArr = new String[size];
        linkedList.toArray(strArr);
        linkedList.clear();
        return strArr;
    }

    /* renamed from: a */
    public static int m14429a(ArrayList<AbstractC3402b> arrayList) {
        int size;
        LinkedList<AbstractC3402b> linkedList = f10903a;
        synchronized (linkedList) {
            size = linkedList.size();
            arrayList.addAll(linkedList);
            linkedList.clear();
        }
        return size;
    }

    /* renamed from: a */
    public static void m14430a(AbstractC3402b bVar) {
        LinkedList<AbstractC3402b> linkedList = f10903a;
        synchronized (linkedList) {
            if (linkedList.size() > 300) {
                linkedList.poll();
            }
            linkedList.add(bVar);
        }
    }

    /* renamed from: a */
    public static void m14431a(String[] strArr) {
        LinkedList<String> linkedList = f10904b;
        synchronized (linkedList) {
            if (linkedList.size() > 300) {
                linkedList.poll();
            }
            linkedList.addAll(Arrays.asList(strArr));
        }
    }
}
