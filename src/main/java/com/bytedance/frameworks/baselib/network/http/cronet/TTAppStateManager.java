package com.bytedance.frameworks.baselib.network.http.cronet;

public class TTAppStateManager {

    /* renamed from: a */
    private static final String f36561a = "TTAppStateManager";

    /* renamed from: b */
    private static volatile AppStartState f36562b = AppStartState.NormalStart;

    /* renamed from: c */
    private static volatile AppStartState f36563c = AppStartState.Default;

    public enum AppStartState {
        NormalStart(-1),
        ColdStart(0),
        HotStart(1),
        WarmStart(2),
        WeakNet(3),
        Default(4);
        
        final int state;

        public int getValue() {
            return this.state;
        }

        private AppStartState(int i) {
            this.state = i;
        }
    }

    /* renamed from: b */
    public static AppStartState m56571b() {
        return f36563c;
    }

    /* renamed from: a */
    public static int m56569a() {
        return f36562b.state;
    }

    /* renamed from: a */
    public static void m56570a(AppStartState appStartState) {
        f36563c = appStartState;
    }
}
