package com.bytedance.ee.bear.doc.follow;

import com.bytedance.ee.bear.doc.follow.event.AbstractC5430a;
import com.bytedance.ee.bear.doc.follow.impl.rn.AbstractC5440a;

/* renamed from: com.bytedance.ee.bear.doc.follow.b */
public interface AbstractC5419b {

    /* renamed from: com.bytedance.ee.bear.doc.follow.b$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$registerRNEventHandler(AbstractC5419b bVar, String str, AbstractC5440a aVar) {
        }

        public static void $default$unregisterRNEventHandler(AbstractC5419b bVar, String str) {
        }
    }

    /* renamed from: com.bytedance.ee.bear.doc.follow.b$a */
    public interface AbstractC5420a {
        /* renamed from: a */
        void mo21678a(String[] strArr);
    }

    void getStates(AbstractC5420a aVar);

    void registerRNEventHandler(String str, AbstractC5440a aVar);

    void setContentEventHandler(AbstractC5430a aVar);

    void setStates(String[] strArr, String str);

    void startRecord(AbstractC5420a aVar, String[] strArr);

    void startReplay();

    void stopRecord();

    void stopReplay();

    void unregisterRNEventHandler(String str);

    void updateOptions(String str);
}
