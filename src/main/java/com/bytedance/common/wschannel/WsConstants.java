package com.bytedance.common.wschannel;

import com.bytedance.common.wschannel.app.OnMessageReceiveListener;
import com.bytedance.common.wschannel.event.ConnectionState;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WsConstants {
    private static OnMessageReceiveListener sListener;
    private static Map<Integer, ConnectionState> sStates = new ConcurrentHashMap();

    public static OnMessageReceiveListener getListener(int i) {
        return sListener;
    }

    static void setOnMessageReceiveListener(OnMessageReceiveListener onMessageReceiveListener) {
        sListener = onMessageReceiveListener;
    }

    static void remove(int i) {
        sStates.remove(Integer.valueOf(i));
    }

    static boolean isWsChannelConnected(int i) {
        if (sStates.get(Integer.valueOf(i)) == ConnectionState.CONNECTED) {
            return true;
        }
        return false;
    }

    public static void setConnectionState(int i, ConnectionState connectionState) {
        sStates.put(Integer.valueOf(i), connectionState);
    }
}
