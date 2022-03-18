package com.he.v8_inspect;

import android.content.Context;
import com.he.v8_inspect.server.LocalSocketServer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InspectorHelper {
    private static final Map<Long, Inspector> INSPECTOR_MAP = new ConcurrentHashMap();
    private static boolean sIsDebugEnable = false;
    private static volatile boolean sIsRunning = false;
    private static LocalSocketServer sSocketServer;

    public static boolean isDebugEnable() {
        return sIsDebugEnable;
    }

    public static void setDebugEnable(boolean z) {
        sIsDebugEnable = z;
    }

    public static synchronized void removeInspector(Inspector inspector) {
        synchronized (InspectorHelper.class) {
            INSPECTOR_MAP.remove(Long.valueOf(inspector.getVm()));
            sSocketServer.removeInspect(inspector);
        }
    }

    private static void start(Context context) {
        if (!sIsRunning) {
            sIsRunning = true;
            LocalSocketServer localSocketServer = new LocalSocketServer(context);
            sSocketServer = localSocketServer;
            localSocketServer.start();
        }
    }

    public static synchronized Inspector createInspector(Context context, long j) {
        Inspector inspector;
        synchronized (InspectorHelper.class) {
            Map<Long, Inspector> map = INSPECTOR_MAP;
            inspector = map.get(Long.valueOf(j));
            if (inspector == null) {
                if (!sIsRunning) {
                    start(context);
                }
                inspector = new Inspector(j);
                map.put(Long.valueOf(j), inspector);
                sSocketServer.addInspect(inspector);
            }
        }
        return inspector;
    }
}
