package com.ss.android.vc.meeting.model.p3108b;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.module.floatingwindow.GeneralFloatingWindow;
import com.ss.android.vc.meeting.module.floatingwindow.MeetingFloatWindow;
import com.ss.android.vc.meeting.module.multi.presenter.InMeetingPresenter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.model.b.b */
public class C61377b {
    /* renamed from: a */
    public static <T> void m239188a(T t, List<T> list) {
        if (list != null && list.size() >= 1) {
            ArrayList<Object> arrayList = null;
            for (T t2 : list) {
                if ((t instanceof InMeetingPresenter) && ((t2 instanceof MeetingFloatWindow) || (t2 instanceof GeneralFloatingWindow))) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(t2);
                    C60700b.m235864f("SingleDataListenerUtil", "[checkMeetingDataListeners]", "remove listener = " + t2.getClass().getSimpleName());
                }
            }
            if (arrayList != null && arrayList.size() >= 1) {
                for (Object obj : arrayList) {
                    list.remove(obj);
                }
            }
        }
    }
}
