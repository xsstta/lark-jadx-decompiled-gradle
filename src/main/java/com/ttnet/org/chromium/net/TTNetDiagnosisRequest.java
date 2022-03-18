package com.ttnet.org.chromium.net;

import java.util.List;

public abstract class TTNetDiagnosisRequest {

    public static abstract class Builder {
        public abstract TTNetDiagnosisRequest build();

        public abstract Builder setNetDetectType(int i);

        public abstract Builder setRequestType(int i);

        public abstract Builder setTargets(List<String> list);

        public abstract Builder setTimeout(int i);
    }

    public interface Callback {
        void onNetDiagnosisRequestComplete(TTNetDiagnosisRequest tTNetDiagnosisRequest, String str);
    }

    public abstract void cancel();

    public abstract void doExtraCommand(String str, String str2);

    public abstract void start();
}
