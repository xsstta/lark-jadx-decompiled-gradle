package com.ss.android.lark.integrator.p2020g;

import android.webkit.ClientCertRequest;
import com.bytedance.ee.webapp.AbstractC13794f;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

/* renamed from: com.ss.android.lark.integrator.g.a */
public class C39418a implements AbstractC13794f.AbstractC13798d {

    /* renamed from: a */
    private PrivateKey f100766a;

    /* renamed from: b */
    private X509Certificate[] f100767b;

    /* renamed from: c */
    private ICoreApi f100768c = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

    /* renamed from: d */
    private IPassportApi f100769d = ((IPassportApi) ApiUtils.getApi(IPassportApi.class));

    @Override // com.bytedance.ee.webapp.AbstractC13794f.AbstractC13798d
    /* renamed from: a */
    public void mo50856a(ClientCertRequest clientCertRequest) {
        X509Certificate[] x509CertificateArr;
        if (!C37239a.m146648b().mo136951a("lark.browser.security.sealcert")) {
            Log.m165389i("TenantCertDependencyImpl", "onReceivedClientCertRequest fg is off");
            return;
        }
        if (this.f100766a == null && this.f100767b == null) {
            String tenantId = this.f100769d.getTenantId();
            this.f100766a = this.f100768c.getTenantCertPrivateKey(tenantId);
            this.f100767b = this.f100768c.getTenantCertCertificate(tenantId);
        }
        PrivateKey privateKey = this.f100766a;
        if (privateKey != null && (x509CertificateArr = this.f100767b) != null) {
            try {
                clientCertRequest.proceed(privateKey, x509CertificateArr);
            } catch (Exception e) {
                Log.m165398w("TenantCertDependencyImpl", "onReceivedClientCertRequest failed", e);
            }
        }
    }
}
