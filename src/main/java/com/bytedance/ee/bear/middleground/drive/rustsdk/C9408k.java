package com.bytedance.ee.bear.middleground.drive.rustsdk;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.drive.AbstractC5138b;
import com.bytedance.ee.bear.middleground.drive.export.DownloadCallback;
import com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.bytedance.ee.bear.middleground.drive.export.DrivePriority;
import com.bytedance.ee.bear.middleground.drive.export.UploadCallback;
import com.bytedance.ee.bear.middleground.drive.export.UploadRequestInfo;
import com.bytedance.ee.util.p701d.C13615c;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.C57788ai;

/* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.k */
public class C9408k implements AbstractC5138b {
    /* renamed from: a */
    private boolean m38887a() {
        boolean z = C57744a.m224104a().getBoolean("android_file_upload_file_descriptor_config", true);
        boolean a = C4211a.m17514a().mo16536a("spacekit.mobile.path_to_uri_enabled", false);
        Log.i("DriveUploadDownProxyImp", "isFdEnable: " + z + " pathToUriEnable: " + a);
        if (!z || !a) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private DownloadCallback m38885a(final AbstractC5138b.AbstractC5139a aVar) {
        return new DownloadCallback() {
            /* class com.bytedance.ee.bear.middleground.drive.rustsdk.C9408k.C94091 */

            @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadCallback
            public boolean onFailed(String str, int i) {
                AbstractC5138b.AbstractC5139a aVar = aVar;
                if (aVar == null) {
                    return false;
                }
                aVar.mo20426a(str, i);
                return false;
            }

            @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadCallback
            public boolean updateProgress(String str, DriveFile.Status status, long j, long j2, String str2) {
                AbstractC5138b.AbstractC5139a aVar = aVar;
                if (aVar == null) {
                    return false;
                }
                aVar.mo20427a(str, status.value(), j, j2);
                return false;
            }
        };
    }

    /* renamed from: a */
    private UploadCallback m38886a(final AbstractC5138b.AbstractC5140b bVar) {
        return new UploadCallback() {
            /* class com.bytedance.ee.bear.middleground.drive.rustsdk.C9408k.C94102 */

            @Override // com.bytedance.ee.bear.middleground.drive.export.UploadCallback
            public boolean onFailed(String str, int i, String str2, long j) {
                AbstractC5138b.AbstractC5140b bVar = bVar;
                if (bVar == null) {
                    return false;
                }
                bVar.mo20428a(str, i);
                return false;
            }

            @Override // com.bytedance.ee.bear.middleground.drive.export.UploadCallback
            public boolean updateProgress(String str, DriveFile.Status status, long j, long j2, String str2, String str3, String str4, String str5, String str6, String str7) {
                AbstractC5138b.AbstractC5140b bVar = bVar;
                if (bVar == null) {
                    return false;
                }
                bVar.mo20429a(str, status.value(), j, j2, str2, str3);
                return false;
            }
        };
    }

    @Override // com.bytedance.ee.bear.contract.drive.AbstractC5138b
    /* renamed from: b */
    public int mo20425b(String[] strArr) {
        return C9379g.m38738a().mo35798b(strArr);
    }

    @Override // com.bytedance.ee.bear.contract.drive.AbstractC5138b
    /* renamed from: a */
    public int mo20420a(String[] strArr) {
        C9379g.m38738a().mo35788a(strArr);
        return 0;
    }

    @Override // com.bytedance.ee.bear.contract.drive.AbstractC5138b
    /* renamed from: a */
    public String mo20421a(Uri uri, String str, String str2, String str3, AbstractC5138b.AbstractC5140b bVar) {
        return mo35864a(uri, str, str2, str3, DrivePriority.UploadPriority.DEFAULT.getPriority(), bVar);
    }

    @Override // com.bytedance.ee.bear.contract.drive.AbstractC5138b
    /* renamed from: a */
    public String mo20422a(String str, String str2, int i, boolean z, AbstractC5138b.AbstractC5139a aVar) {
        return C9379g.m38738a().mo35799b(new DownloadRequestInfo.C9355a().mo35671f(str).mo35662a(str2).mo35656a(i).mo35663a(z).mo35658a(m38885a(aVar)).mo35664a());
    }

    @Override // com.bytedance.ee.bear.contract.drive.AbstractC5138b
    /* renamed from: a */
    public String mo20424a(String str, String str2, String str3, String str4, AbstractC5138b.AbstractC5140b bVar) {
        return mo35865a(str, str2, str3, str4, DrivePriority.UploadPriority.DEFAULT.getPriority(), bVar);
    }

    /* renamed from: a */
    public String mo35864a(Uri uri, String str, String str2, String str3, int i, AbstractC5138b.AbstractC5140b bVar) {
        UploadRequestInfo.C9359a aVar = new UploadRequestInfo.C9359a();
        if (m38887a()) {
            aVar.mo35742b(uri.toString());
        } else if (C13615c.f35773a == null) {
            Log.w("DriveUploadDownProxyImp", "ContextUtils.baseApplication is null.");
            return "";
        } else {
            String a = C57788ai.m224257a(C13615c.f35773a, uri);
            if (TextUtils.isEmpty(a)) {
                Log.w("DriveUploadDownProxyImp", "driveUpload getUriPath is null!!");
                return "";
            }
            aVar.mo35739a(a);
        }
        return C9379g.m38738a().mo35790a(aVar.mo35744c(str).mo35745d(str2).mo35746e(str3).mo35735a(i).mo35737a(m38886a(bVar)).mo35741a());
    }

    @Override // com.bytedance.ee.bear.contract.drive.AbstractC5138b
    /* renamed from: a */
    public String mo20423a(String str, String str2, String str3, String str4, int i, AbstractC5138b.AbstractC5139a aVar) {
        return C9379g.m38738a().mo35789a(new DownloadRequestInfo.C9355a().mo35662a(str).mo35666b(str2).mo35668c(str3).mo35669d(str4).mo35656a(i).mo35658a(m38885a(aVar)).mo35664a());
    }

    /* renamed from: a */
    public String mo35865a(String str, String str2, String str3, String str4, int i, AbstractC5138b.AbstractC5140b bVar) {
        return C9379g.m38738a().mo35790a(new UploadRequestInfo.C9359a().mo35739a(str).mo35744c(str2).mo35745d(str3).mo35746e(str4).mo35735a(i).mo35737a(m38886a(bVar)).mo35741a());
    }
}
