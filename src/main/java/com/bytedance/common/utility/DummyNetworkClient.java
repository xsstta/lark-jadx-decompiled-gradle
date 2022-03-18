package com.bytedance.common.utility;

import android.util.Pair;
import com.bytedance.common.utility.NetworkClient;
import java.io.IOException;
import java.util.List;
import java.util.Map;

class DummyNetworkClient extends NetworkClient {
    DummyNetworkClient() {
    }

    @Override // com.bytedance.common.utility.NetworkClient
    public String get(String str, Map<String, String> map, NetworkClient.ReqContext reqContext) throws Exception {
        throw new IOException("not implemented");
    }

    @Override // com.bytedance.common.utility.NetworkClient
    public String post(String str, List<Pair<String, String>> list, Map<String, String> map, NetworkClient.ReqContext reqContext) throws CommonHttpException {
        throw new CommonHttpException(0, "not implemented");
    }

    @Override // com.bytedance.common.utility.NetworkClient
    public String post(String str, byte[] bArr, Map<String, String> map, NetworkClient.ReqContext reqContext) throws CommonHttpException {
        throw new CommonHttpException(0, "not implemented");
    }
}
