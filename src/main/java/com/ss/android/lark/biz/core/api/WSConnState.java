package com.ss.android.lark.biz.core.api;

public class WSConnState {

    public enum ConnState {
        ConnectUnknown,
        Connecting,
        ConnectFailed,
        ConnectClosed,
        Connected
    }

    /* renamed from: com.ss.android.lark.biz.core.api.WSConnState$a */
    public interface AbstractC29537a {
        /* renamed from: a */
        void mo102563a(ConnState connState);
    }
}
