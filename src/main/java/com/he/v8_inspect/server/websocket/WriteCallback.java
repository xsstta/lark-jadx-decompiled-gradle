package com.he.v8_inspect.server.websocket;

import java.io.IOException;

interface WriteCallback {
    void onFailure(IOException iOException);

    void onSuccess();
}
