package com.he.v8_inspect;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.he.v8_inspect.server.websocket.SimpleEndpoint;
import com.he.v8_inspect.server.websocket.SimpleSession;

public class ChromeDevtoolsServer implements SimpleEndpoint {
    private final IInspectorSession mInspectorSession;

    public ChromeDevtoolsServer(IInspectorSession iInspectorSession) {
        this.mInspectorSession = iInspectorSession;
    }

    @Override // com.he.v8_inspect.server.websocket.SimpleEndpoint
    public void onOpen(SimpleSession simpleSession) {
        AppBrandLogger.m52828d("ChromeDevtoolsServer", "onOpen: ");
        this.mInspectorSession.onOpen(simpleSession);
    }

    @Override // com.he.v8_inspect.server.websocket.SimpleEndpoint
    public void onMessage(SimpleSession simpleSession, String str) {
        this.mInspectorSession.onProtocolMessage(simpleSession, str);
    }

    @Override // com.he.v8_inspect.server.websocket.SimpleEndpoint
    public void onError(SimpleSession simpleSession, Throwable th) {
        AppBrandLogger.m52829e("ChromeDevtoolsServer", th);
        this.mInspectorSession.onClose(simpleSession);
    }

    @Override // com.he.v8_inspect.server.websocket.SimpleEndpoint
    public void onMessage(SimpleSession simpleSession, byte[] bArr, int i) {
        AppBrandLogger.m52829e("ChromeDevtoolsServer", "onMessage: byte");
    }

    @Override // com.he.v8_inspect.server.websocket.SimpleEndpoint
    public void onClose(SimpleSession simpleSession, int i, String str) {
        AppBrandLogger.m52831w("ChromeDevtoolsServer", "onClose: " + str);
        this.mInspectorSession.onClose(simpleSession);
    }
}
