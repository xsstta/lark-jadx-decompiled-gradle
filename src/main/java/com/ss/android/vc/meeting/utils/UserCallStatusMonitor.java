package com.ss.android.vc.meeting.utils;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class UserCallStatusMonitor {

    /* renamed from: a */
    private static CopyOnWriteArrayList<AbstractC63478a> f160348a = new CopyOnWriteArrayList<>();

    @Retention(RetentionPolicy.SOURCE)
    public @interface CallType {
    }

    /* renamed from: com.ss.android.vc.meeting.utils.UserCallStatusMonitor$a */
    public interface AbstractC63478a {
        void onEnterOnCall(int i);
    }

    /* renamed from: a */
    public static void m248760a() {
        Iterator<AbstractC63478a> it = f160348a.iterator();
        while (it.hasNext()) {
            it.next().onEnterOnCall(0);
        }
    }

    /* renamed from: a */
    public static void m248762a(AbstractC63478a aVar) {
        if (aVar != null) {
            f160348a.add(aVar);
        }
    }

    /* renamed from: b */
    public static void m248763b(AbstractC63478a aVar) {
        if (aVar != null) {
            f160348a.remove(aVar);
        }
    }

    /* renamed from: a */
    public static void m248761a(int i) {
        Iterator<AbstractC63478a> it = f160348a.iterator();
        while (it.hasNext()) {
            it.next().onEnterOnCall(i);
        }
    }
}
