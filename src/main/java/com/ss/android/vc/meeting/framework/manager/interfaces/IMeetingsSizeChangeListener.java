package com.ss.android.vc.meeting.framework.manager.interfaces;

import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vcxp.annotation.XClass;
import java.util.List;

@XClass
public interface IMeetingsSizeChangeListener {

    /* renamed from: com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        /* JADX WARN: Incorrect args count in method signature: (Ljava/util/List<Lcom/ss/android/vc/meeting/framework/meeting/b;>;)V */
        public static void $default$a(IMeetingsSizeChangeListener iMeetingsSizeChangeListener, List list) {
        }

        public static void $default$onMeetingsBegin(IMeetingsSizeChangeListener iMeetingsSizeChangeListener, boolean z) {
        }

        public static void $default$onMeetingsEnd(IMeetingsSizeChangeListener iMeetingsSizeChangeListener) {
        }
    }

    /* renamed from: a */
    void mo208172a(List<AbstractC61294b> list);

    void onMeetingsBegin(boolean z);

    void onMeetingsEnd();
}
