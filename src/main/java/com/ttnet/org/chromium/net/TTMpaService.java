package com.ttnet.org.chromium.net;

import java.util.List;

public abstract class TTMpaService {

    public interface ICallback {
        void onFinish(boolean z, String str);
    }

    public abstract void command(String str, String str2);

    public abstract void init(ICallback iCallback);

    public abstract void setAccAddress(List<String> list, ICallback iCallback);

    public abstract void start();

    public abstract void stop();
}
