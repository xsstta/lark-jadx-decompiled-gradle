package org.chromium.diagnosis;

import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.frameworks.baselib.network.http.cronet.p743a.AbstractC13987a;
import com.ttnet.org.chromium.net.CronetEngine;
import com.ttnet.org.chromium.net.TTNetDiagnosisRequest;
import java.util.List;
import org.chromium.CronetClient;

public class CronetDiagnosisRequestImpl implements AbstractC13987a {
    private static final String TAG = "CronetDiagnosisRequestImpl";
    private static CronetEngine sCronetEngine;
    public AbstractC13987a.AbstractC13988a mCallback;
    private C70012a mCronetCallback = new C70012a();
    private TTNetDiagnosisRequest mRequest;

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.p743a.AbstractC13987a
    public void cancel() {
        TTNetDiagnosisRequest tTNetDiagnosisRequest = this.mRequest;
        if (tTNetDiagnosisRequest != null) {
            tTNetDiagnosisRequest.cancel();
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.p743a.AbstractC13987a
    public void start() {
        TTNetDiagnosisRequest tTNetDiagnosisRequest = this.mRequest;
        if (tTNetDiagnosisRequest != null) {
            tTNetDiagnosisRequest.start();
        }
    }

    private CronetEngine getCronetEngine() {
        Logger.m15167d(TAG, "Init cronet engine");
        try {
            loadCronetKernel();
        } catch (Throwable th) {
            th.printStackTrace();
            Logger.m15167d(TAG, "TTNet init failed, cronet engine is null.");
        }
        return CronetClient.getCronetEngine();
    }

    private static void loadCronetKernel() throws Exception {
        Reflect.on(Class.forName("com.bytedance.ttnet.TTNetInit").newInstance()).call("preInitCronetKernel");
    }

    /* renamed from: org.chromium.diagnosis.CronetDiagnosisRequestImpl$a */
    class C70012a implements TTNetDiagnosisRequest.Callback {
        C70012a() {
        }

        @Override // com.ttnet.org.chromium.net.TTNetDiagnosisRequest.Callback
        public void onNetDiagnosisRequestComplete(TTNetDiagnosisRequest tTNetDiagnosisRequest, String str) {
            CronetDiagnosisRequestImpl.this.mCallback.mo51516a(str);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.p743a.AbstractC13987a
    public void doExtraCommand(String str, String str2) {
        TTNetDiagnosisRequest tTNetDiagnosisRequest = this.mRequest;
        if (tTNetDiagnosisRequest != null) {
            tTNetDiagnosisRequest.doExtraCommand(str, str2);
        }
    }

    public CronetDiagnosisRequestImpl(AbstractC13987a.AbstractC13988a aVar, int i, List<String> list, int i2, int i3) throws Exception {
        this.mCallback = aVar;
        if (sCronetEngine == null) {
            sCronetEngine = getCronetEngine();
        }
        CronetEngine cronetEngine = sCronetEngine;
        if (cronetEngine == null) {
            throw new UnsupportedOperationException("Can not get cronet engine.");
        } else if (cronetEngine != null) {
            TTNetDiagnosisRequest.Builder newNetDiagnosisRequestBuilder = cronetEngine.newNetDiagnosisRequestBuilder(this.mCronetCallback, null);
            newNetDiagnosisRequestBuilder.setRequestType(i).setTargets(list).setNetDetectType(i2).setTimeout(i3);
            this.mRequest = newNetDiagnosisRequestBuilder.build();
        }
    }
}
