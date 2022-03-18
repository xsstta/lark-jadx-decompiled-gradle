package com.ss.android.vesdk;

import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.ttve.monitor.C60227g;
import java.util.HashMap;

public class VESensService implements Runnable {
    public static String SENS_SERVICE_TYPE_CAMERA = "camera";
    public static String SENS_SERVICE_TYPE_MIC = "mic";
    private static VESensService mSensService = new VESensService();
    private int lastObjectID = 0;
    private int mCheckIntervalMs = 1000;
    private Thread mCheckThread = null;
    private boolean mInit = false;
    private HashMap<Integer, C63938ai> mObjectMap = new HashMap<>();
    private AbstractC63906a mStatusChangeHander = null;

    /* renamed from: com.ss.android.vesdk.VESensService$a */
    public interface AbstractC63906a {
    }

    public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    public enum ACTION_TYPE {
        ACTION_TYPE_CRASH(1),
        ACTION_TYPE_ALOG(2),
        ACTION_TYPE_CRASH_ALOG(3),
        ACTION_TYPE_SLARDAR(4),
        ACTION_TYPE_SLARDAR_CRASH(5),
        ACTION_TYPE_SLARDAR_ALOG(6),
        ACTION_TYPE_SLARDAR_ALOG_CRASH(7);
        
        public int value;

        public int getActionType() {
            return this.value;
        }

        private ACTION_TYPE(int i) {
            this.value = i;
        }
    }

    public enum PRIVACY_STATUS {
        PRIVACY_STATUS_RELEASE(0),
        PRIVACY_STATUS_USING(1);
        
        private int value;

        public int getStatus() {
            return this.value;
        }

        private PRIVACY_STATUS(int i) {
            this.value = i;
        }
    }

    public static VESensService getInstance() {
        return mSensService;
    }

    private int allocateObjectID() {
        int i;
        synchronized (this) {
            i = this.lastObjectID;
            this.lastObjectID = i + 1;
        }
        return i;
    }

    public void uninit() {
        this.mInit = false;
        try {
            this.mCheckThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private VESensService() {
    }

    public boolean init() {
        if (this.mInit) {
            return true;
        }
        Thread new_insert_after_java_lang_Thread_by_knot = new_insert_after_java_lang_Thread_by_knot(new Thread(this));
        this.mCheckThread = new_insert_after_java_lang_Thread_by_knot;
        this.mInit = true;
        new_insert_after_java_lang_Thread_by_knot.start();
        return true;
    }

    public void run() {
        long j = 0;
        while (this.mInit) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j < ((long) this.mCheckIntervalMs)) {
                try {
                    Thread.sleep(30);
                } catch (InterruptedException unused) {
                }
            } else {
                synchronized (this) {
                    for (C63938ai aiVar : this.mObjectMap.values()) {
                        if (aiVar.mo221163c() != aiVar.mo221164d() && currentTimeMillis - aiVar.mo221165e() > ((long) aiVar.mo221166f())) {
                            String str = "Check Object Status illegal, name: " + aiVar.mo221161b() + ", expect status:" + aiVar.mo221164d() + ", status:" + aiVar.mo221163c();
                            if (aiVar.mo221163c() != PRIVACY_STATUS.PRIVACY_STATUS_RELEASE && !aiVar.mo221169i()) {
                                aiVar.mo221168h();
                                if ((aiVar.mo221167g().value & ACTION_TYPE.ACTION_TYPE_ALOG.value) != 0) {
                                    C63929ab.m250980d("VESensService", str);
                                }
                                if ((aiVar.mo221167g().value & ACTION_TYPE.ACTION_TYPE_SLARDAR.value) != 0) {
                                    C60227g.m234084a(new VESensException(str));
                                }
                                if ((aiVar.mo221167g().value & ACTION_TYPE.ACTION_TYPE_CRASH.value) != 0) {
                                    throw new RuntimeException(str);
                                }
                            }
                        }
                    }
                }
                j = currentTimeMillis;
            }
        }
    }

    public void setObjectStatusCheckInterval(int i) {
        this.mCheckIntervalMs = i;
    }

    public void unregisterSensCheckObject(int i) {
        synchronized (this) {
            this.mObjectMap.remove(Integer.valueOf(i));
        }
    }

    public int getIDWithName(String str) {
        for (C63938ai aiVar : this.mObjectMap.values()) {
            if (str.equals(aiVar.mo221161b())) {
                return aiVar.mo221157a();
            }
        }
        return -1;
    }

    public int registerSensCheckObject(String str) {
        Integer.valueOf(0);
        synchronized (this) {
            for (C63938ai aiVar : this.mObjectMap.values()) {
                if (str.equals(aiVar.mo221161b())) {
                    return aiVar.mo221157a();
                }
            }
            Integer valueOf = Integer.valueOf(allocateObjectID());
            this.mObjectMap.put(valueOf, new C63938ai(valueOf.intValue(), str));
            return valueOf.intValue();
        }
    }

    public void registerSensObjectStatusChangedHandler(int i, AbstractC63906a aVar) {
        this.mStatusChangeHander = aVar;
    }

    public void setObjectStatusCheckThreshold(int i, int i2) {
        synchronized (this) {
            C63938ai aiVar = this.mObjectMap.get(Integer.valueOf(i));
            if (aiVar != null) {
                aiVar.mo221158a(i2);
            }
        }
    }

    public void setSensCheckObjExpectStatus(int i, PRIVACY_STATUS privacy_status) {
        synchronized (this) {
            C63938ai aiVar = this.mObjectMap.get(Integer.valueOf(i));
            if (aiVar != null) {
                aiVar.mo221162b(privacy_status);
            }
        }
    }

    public void setSensCheckObjStatus(int i, PRIVACY_STATUS privacy_status) {
        synchronized (this) {
            C63938ai aiVar = this.mObjectMap.get(Integer.valueOf(i));
            if (aiVar != null) {
                aiVar.mo221160a(privacy_status);
            }
        }
    }

    public void setStatusAbnormalAction(int i, ACTION_TYPE action_type) {
        synchronized (this) {
            C63938ai aiVar = this.mObjectMap.get(Integer.valueOf(i));
            if (aiVar != null) {
                aiVar.mo221159a(action_type);
            }
        }
    }
}
