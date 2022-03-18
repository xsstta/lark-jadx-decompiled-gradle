package com.he.v8_inspect;

import com.he.v8_inspect.server.websocket.SimpleSession;

public interface IInspectorSession {
    void onClose(SimpleSession simpleSession);

    void onOpen(SimpleSession simpleSession);

    void onProtocolMessage(SimpleSession simpleSession, String str);
}
