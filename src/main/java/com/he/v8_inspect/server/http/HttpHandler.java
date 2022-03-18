package com.he.v8_inspect.server.http;

import com.he.v8_inspect.server.SocketLike;
import java.io.IOException;

public interface HttpHandler {
    boolean handleRequest(SocketLike socketLike, LightHttpRequest lightHttpRequest, LightHttpResponse lightHttpResponse) throws IOException;
}
