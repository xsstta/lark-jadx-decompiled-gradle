package com.tt.miniapp.net;

import android.text.TextUtils;
import android.util.SparseArray;
import android.webkit.MimeTypeMap;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12795a;
import com.bytedance.ee.lark.infra.network.p630d.p631a.AbstractC12831a;
import com.bytedance.ee.lark.infra.network.p630d.p631a.p632a.C12832a;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.errorcode.C66015a;
import com.tt.miniapp.net.p3308a.C66498a;
import com.tt.miniapp.net.p3308a.C66500b;
import com.tt.miniapp.p3357x.p3358a.C67404a;
import com.tt.miniapp.util.C67019aa;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.data.C67485a;
import com.tt.refer.common.base.AppType;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.net.b */
public class C66504b {
    /* renamed from: a */
    public static void m259893a(final C66508a aVar, final AbstractC67550j.AbstractC67551a<String> aVar2, IAppContext iAppContext, final TracingCoreSpan tracingCoreSpan) {
        final File file;
        if (aVar == null) {
            AppBrandLogger.m52830i("tma_FileLoadManager", "addUploadTask request is null!");
            return;
        }
        HashMap hashMap = null;
        if (TTFileHelper.m264259a("createUploadTask", iAppContext)) {
            AppBrandLogger.m52830i("tma_FileLoadManager", "use new file sandbox");
            try {
                AbstractC67722a aVar3 = (AbstractC67722a) iAppContext.findServiceByInterface(AbstractC67722a.class);
                TTFile gVar = new TTFile(aVar.f167896d);
                TTFileContext hVar = new TTFileContext(null, "createUploadTask");
                if (aVar3.mo235603a(gVar, hVar)) {
                    if (gVar.mo235653g() || gVar.mo235652f()) {
                        file = aVar3.mo235635i(gVar, hVar);
                    }
                }
                AppBrandLogger.m52829e("tma_FileLoadManager", "file upload fail for upload file can't read!");
                m259892a(aVar, aVar2, 1002, tracingCoreSpan);
                return;
            } catch (TTFileException e) {
                AppBrandLogger.m52829e("tma_FileLoadManager", "file upload fail for upload file can't read!", e);
                m259892a(aVar, aVar2, 1002, tracingCoreSpan);
                return;
            }
        } else {
            file = new File(aVar.f167896d);
            if (!file.exists() || !C67404a.m262266a(iAppContext).mo234080b(file)) {
                AppBrandLogger.m52829e("tma_FileLoadManager", "file upload fail for upload file can't read!");
                m259892a(aVar, aVar2, 1002, tracingCoreSpan);
                return;
            }
        }
        HashMap hashMap2 = new HashMap();
        if (!TextUtils.isEmpty(aVar.f167898f)) {
            try {
                JSONObject jSONObject = new JSONObject(aVar.f167898f);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap2.put(next, jSONObject.optString(next));
                }
            } catch (Exception e2) {
                AppBrandLogger.stacktrace(6, "tma_FileLoadManager", e2.getStackTrace());
            }
        }
        hashMap2.put(aVar.f167897e, file);
        if (!TextUtils.isEmpty(aVar.f167895c)) {
            hashMap = new HashMap();
            try {
                JSONObject jSONObject2 = new JSONObject(aVar.f167895c);
                Iterator<String> keys2 = jSONObject2.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    hashMap.put(next2, jSONObject2.optString(next2));
                }
            } catch (Exception e3) {
                AppBrandLogger.stacktrace(6, "tma_FileLoadManager", e3.getStackTrace());
            }
        }
        AppBrandLogger.m52830i("tma_FileLoadManager", "upLoadFile start ", "file ", file.getAbsolutePath());
        C66500b.m259880a(aVar.f167894b, hashMap, hashMap2, new C66500b.AbstractC66503a<String>() {
            /* class com.tt.miniapp.net.C66504b.C665073 */

            @Override // com.tt.miniapp.net.p3308a.C66500b.AbstractC66503a
            /* renamed from: a */
            public void mo232075a(int i) {
                AppBrandLogger.m52829e("tma_FileLoadManager", "upload file onfailed->file:", file.getAbsolutePath(), "failType:", Integer.valueOf(i));
                C66504b.m259892a(aVar, aVar2, i, tracingCoreSpan);
            }

            @Override // com.tt.miniapp.net.p3308a.C66500b.AbstractC66503a
            /* renamed from: a */
            public void mo232077a(long j, long j2) {
                int i = (int) ((100 * j2) / j);
                AppBrandLogger.m52828d("tma_FileLoadManager", "onProgress ", "total", Long.valueOf(j), "current", Long.valueOf(j2));
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("uploadTaskId", aVar.f167893a);
                    jSONObject.put("state", "progressUpdate");
                    jSONObject.put("totalBytesSent", j2);
                    jSONObject.put("totalBytesExpectedToSend", j);
                    jSONObject.put("progress", i);
                    jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, "onUploadTaskStateChange:ok");
                    AbstractC67550j.AbstractC67551a aVar = aVar2;
                    if (aVar != null) {
                        aVar.onNativeModuleCall(jSONObject.toString());
                    }
                } catch (Exception e) {
                    AppBrandLogger.stacktrace(6, "tma_FileLoadManager", e.getStackTrace());
                }
            }

            @Override // com.tt.miniapp.net.p3308a.C66500b.AbstractC66503a
            /* renamed from: a */
            public void mo232076a(int i, String str, String str2) {
                AppBrandLogger.m52830i("tma_FileLoadManager", "upLoadFile success! ", str);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("uploadTaskId", aVar.f167893a);
                    jSONObject.put("state", "success");
                    jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, i);
                    jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str);
                    jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, "onUploadTaskStateChange:ok");
                    TracingCoreSpan tracingCoreSpan = tracingCoreSpan;
                    if (tracingCoreSpan != null && !TextUtils.isEmpty(tracingCoreSpan.getRequestId())) {
                        jSONObject.put("trace", tracingCoreSpan.getRequestId());
                    }
                    aVar2.onNativeModuleCall(jSONObject.toString());
                } catch (Exception e) {
                    AppBrandLogger.stacktrace(6, "tma_FileLoadManager", e.getStackTrace());
                }
            }
        }, aVar.f167893a, tracingCoreSpan, iAppContext);
    }

    /* renamed from: a */
    private static SparseArray<C12832a> m259885a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234280a().mo234309c();
    }

    /* renamed from: a */
    private static HashMap<String, String> m259888a(JSONObject jSONObject) {
        Iterator<String> keys;
        HashMap<String, String> hashMap = new HashMap<>();
        if (!(jSONObject == null || (keys = jSONObject.keys()) == null)) {
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public static String m259894b(String str) {
        String[] split = str.split("/");
        for (String str2 : split) {
            int indexOf = str2.indexOf("?");
            if (indexOf != -1) {
                return str2.substring(0, indexOf);
            }
        }
        if (split.length > 0) {
            return split[split.length - 1];
        }
        return null;
    }

    /* renamed from: a */
    public static String m259886a(String str) {
        int lastIndexOf;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String replaceAll = str.replaceAll("\"", "");
        int indexOf = replaceAll.indexOf("filename*=");
        if (indexOf != -1) {
            String substring = replaceAll.substring(indexOf + 10);
            int indexOf2 = substring.indexOf("filename=");
            if (!(indexOf2 == -1 || (lastIndexOf = (substring = substring.substring(0, indexOf2)).lastIndexOf(";")) == -1)) {
                substring = substring.substring(0, lastIndexOf);
            }
            if (!substring.startsWith("UTF-8''") && !substring.startsWith("UTF-8''".toLowerCase())) {
                return substring;
            }
            String substring2 = substring.substring(7);
            try {
                return URLDecoder.decode(substring2, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                AppBrandLogger.m52829e("tma_FileLoadManager", e);
                return substring2;
            }
        } else {
            int indexOf3 = replaceAll.indexOf("filename=");
            if (indexOf3 != -1) {
                return replaceAll.substring(indexOf3 + 9);
            }
            return null;
        }
    }

    /* renamed from: b */
    public static void m259895b(int i, IAppContext iAppContext) {
        C66500b.m259876a(i, iAppContext);
    }

    /* renamed from: a */
    public static void m259890a(int i, IAppContext iAppContext) {
        SparseArray<C12832a> a = m259885a(iAppContext);
        C12832a aVar = a.get(i);
        if (aVar != null) {
            aVar.f34288g.mo48356b();
            a.delete(i);
        }
    }

    /* renamed from: a */
    public static String m259887a(Response response, String str, String str2) {
        String a = m259886a(response.header("Content-Disposition"));
        if (TextUtils.isEmpty(a)) {
            String str3 = null;
            if (response.headers() != null) {
                str3 = response.headers().get("Content-Type");
            }
            if (!TextUtils.isEmpty(str3)) {
                String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str3);
                AppBrandLogger.m52830i("tma_FileLoadManager", "suffix:", extensionFromMimeType);
                if (!TextUtils.isEmpty(extensionFromMimeType)) {
                    a = String.format("%s.%s", str2, extensionFromMimeType);
                }
            }
        }
        if (TextUtils.isEmpty(a)) {
            return m259894b(str);
        }
        return a;
    }

    /* renamed from: a */
    public static JSONObject m259889a(int i, TracingCoreSpan tracingCoreSpan, ApiCode apiCode) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("downloadTaskId", i);
        C66015a.m258507a(jSONObject, apiCode);
        jSONObject.put("state", "fail");
        if (tracingCoreSpan != null && !TextUtils.isEmpty(tracingCoreSpan.getRequestId())) {
            jSONObject.put("trace", tracingCoreSpan.getRequestId());
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static void m259896b(final C12832a aVar, final AbstractC12831a aVar2, final TracingCoreSpan tracingCoreSpan, IAppContext iAppContext) {
        String str;
        boolean z;
        final int i = aVar.f34282a;
        final String str2 = aVar.f34283b;
        String str3 = aVar.f34287f;
        AppBrandLogger.m52830i("tma_FileLoadManager", "standardDownload start requestId:" + i + "url:" + C67019aa.m261223a(str2));
        if (aVar.f34286e != null) {
            str = aVar.f34286e.toString();
        } else {
            str = null;
        }
        final AbstractC67722a aVar3 = (AbstractC67722a) iAppContext.findServiceByInterface(AbstractC67722a.class);
        final File file = new File(aVar3.mo235087d(), String.valueOf(System.currentTimeMillis()));
        if (!file.exists() && !file.mkdirs()) {
            AppBrandLogger.m52829e("tma_FileLoadManager", "dir create failed, dir:" + file);
        }
        final TTFile gVar = new TTFile(str3);
        final TTFileContext hVar = new TTFileContext(null, "createDownloadAppTask");
        final String str4 = String.valueOf(System.currentTimeMillis()) + i;
        if (iAppContext.getAppType() == AppType.GadgetAPP || iAppContext.getAppType() == AppType.WebGadgetAPP) {
            z = true;
        } else {
            z = false;
        }
        C66498a.m259871a(str2, m259888a(aVar.f34284c), aVar.f34285d, str, file.getAbsolutePath(), str4, new AbstractC12795a() {
            /* class com.tt.miniapp.net.C66504b.C665051 */

            /* JADX WARNING: Removed duplicated region for block: B:32:0x0133  */
            /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
            @Override // com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12795a, com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12796b
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo48353a(okhttp3.Response r17) {
                /*
                // Method dump skipped, instructions count: 444
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.net.C66504b.C665051.mo48353a(okhttp3.Response):void");
            }

            @Override // com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12795a, com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12796b
            /* renamed from: a */
            public void mo48352a(String str, Throwable th) {
                String str2;
                if (aVar2 != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("downloadTaskId", i);
                        if ("abort".equals(str)) {
                            C66015a.m258507a(jSONObject, ApiCode.DOWNLOADFILE_ABORT);
                        } else {
                            C66015a.m258508a(jSONObject, ApiCode.GENERAL_UNKONW_ERROR, str);
                        }
                        jSONObject.put("state", "fail");
                        TracingCoreSpan tracingCoreSpan = tracingCoreSpan;
                        if (tracingCoreSpan != null && !TextUtils.isEmpty(tracingCoreSpan.getRequestId())) {
                            jSONObject.put("trace", tracingCoreSpan.getRequestId());
                        }
                        aVar2.mo48471a(jSONObject);
                        Object[] objArr = new Object[4];
                        objArr[0] = "file download failed! requestId:";
                        objArr[1] = Integer.valueOf(i);
                        objArr[2] = "errorMsg:";
                        if (th == null) {
                            str2 = "null";
                        } else {
                            str2 = th.getMessage();
                        }
                        objArr[3] = str2;
                        AppBrandLogger.m52830i("AbstractDownloadListener", objArr);
                    } catch (Exception e) {
                        AppBrandLogger.stacktrace(6, "AbstractDownloadListener", e.getStackTrace());
                    }
                }
            }

            @Override // com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12795a, com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12796b
            /* renamed from: a */
            public void mo48351a(int i, long j, long j2) {
                AppBrandLogger.m52828d("AbstractDownloadListener", "downloadProgress ", Integer.valueOf(i));
                if (aVar2 != null && !aVar.f34288g.mo48355a()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("downloadTaskId", i);
                        if (i <= 100) {
                            jSONObject.put("state", "progressUpdate");
                            jSONObject.put("totalBytesWritten", j);
                            jSONObject.put("totalBytesExpectedToWrite", j2);
                            jSONObject.put("progress", i);
                            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, "onDownloadTaskStateChange:ok");
                        }
                        aVar2.mo48471a(jSONObject);
                    } catch (Exception e) {
                        AppBrandLogger.stacktrace(6, "AbstractDownloadListener", e.getStackTrace());
                    }
                }
            }
        }, aVar.f34288g, z, tracingCoreSpan, iAppContext);
    }

    /* renamed from: c */
    private static void m259897c(final C12832a aVar, final AbstractC12831a aVar2, final TracingCoreSpan tracingCoreSpan, IAppContext iAppContext) throws Exception {
        String str;
        boolean z;
        final int i = aVar.f34282a;
        final String str2 = aVar.f34283b;
        final String str3 = aVar.f34287f;
        AppBrandLogger.m52830i("tma_FileLoadManager", "standardDownload start requestId:" + i + "url:" + str2);
        if (aVar.f34286e != null) {
            str = aVar.f34286e.toString();
        } else {
            str = null;
        }
        final AbstractC67722a aVar3 = (AbstractC67722a) iAppContext.findServiceByInterface(AbstractC67722a.class);
        final String absolutePath = new File(aVar3.mo235085c(), "tma/downloadfile/").getAbsolutePath();
        final File file = new File(absolutePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        final String str4 = String.valueOf(System.currentTimeMillis()) + i;
        if (iAppContext.getAppType() == AppType.GadgetAPP || iAppContext.getAppType() == AppType.WebGadgetAPP) {
            z = true;
        } else {
            z = false;
        }
        C66498a.m259871a(str2, m259888a(aVar.f34284c), aVar.f34285d, str, absolutePath, str4, new AbstractC12795a() {
            /* class com.tt.miniapp.net.C66504b.C665062 */

            @Override // com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12795a, com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12796b
            /* renamed from: a */
            public void mo48353a(Response response) {
                try {
                    File file = new File(file, str4);
                    if (aVar.f34288g.mo48355a()) {
                        AppBrandLogger.m52830i("tma_FileLoadManager", "download request cancel");
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("downloadTaskId", i);
                        C66015a.m258507a(jSONObject, ApiCode.DOWNLOADFILE_ABORT);
                        jSONObject.put("state", "fail");
                        TracingCoreSpan tracingCoreSpan = tracingCoreSpan;
                        if (tracingCoreSpan != null && !TextUtils.isEmpty(tracingCoreSpan.getRequestId())) {
                            jSONObject.put("trace", tracingCoreSpan.getRequestId());
                        }
                        aVar2.mo48471a(jSONObject);
                        IOUtils.delete(file);
                        return;
                    }
                    long length = file.length();
                    if (aVar3.mo235092e(str3) && aVar3.mo235079a(length)) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("downloadTaskId", i);
                        C66015a.m258507a(jSONObject2, ApiCode.DOWNLOADFILE_OVER_LIMIT);
                        jSONObject2.put("state", "fail");
                        TracingCoreSpan tracingCoreSpan2 = tracingCoreSpan;
                        if (tracingCoreSpan2 != null && !TextUtils.isEmpty(tracingCoreSpan2.getRequestId())) {
                            jSONObject2.put("trace", tracingCoreSpan.getRequestId());
                        }
                        aVar2.mo48471a(jSONObject2);
                        IOUtils.delete(file);
                        AppBrandLogger.m52830i("tma_FileLoadManager", "user dir Over Limit");
                    } else if (!file.exists()) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("downloadTaskId", i);
                        C66015a.m258507a(jSONObject3, ApiCode.GENERAL_UNKONW_ERROR);
                        jSONObject3.put("state", "fail");
                        TracingCoreSpan tracingCoreSpan3 = tracingCoreSpan;
                        if (tracingCoreSpan3 != null && !TextUtils.isEmpty(tracingCoreSpan3.getRequestId())) {
                            jSONObject3.put("trace", tracingCoreSpan.getRequestId());
                        }
                        aVar2.mo48471a(jSONObject3);
                        AppBrandLogger.m52830i("AbstractDownloadListener", "file download failed! requestId:", Integer.valueOf(i), "errorMsg: file not exists");
                    } else {
                        String a = C66504b.m259886a(response.header("Content-Disposition"));
                        if (TextUtils.isEmpty(a)) {
                            String str = null;
                            if (response.headers() != null) {
                                str = response.headers().get("Content-Type");
                            }
                            if (!TextUtils.isEmpty(str)) {
                                String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
                                AppBrandLogger.m52830i("AbstractDownloadListener", "suffix:", extensionFromMimeType);
                                if (!TextUtils.isEmpty(extensionFromMimeType)) {
                                    a = String.format("%s.%s", str4, extensionFromMimeType);
                                }
                            }
                        }
                        if (TextUtils.isEmpty(a)) {
                            a = C66504b.m259894b(str2);
                        }
                        if (!TextUtils.isEmpty(a)) {
                            File file2 = new File(absolutePath, a);
                            boolean renameTo = file.renameTo(file2);
                            AppBrandLogger.m52830i("AbstractDownloadListener", "rename success :", Boolean.valueOf(renameTo));
                            if (renameTo) {
                                file = file2;
                            }
                        }
                        String path = file.getPath();
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("downloadTaskId", i);
                        jSONObject4.put("state", "success");
                        jSONObject4.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, response.code());
                        jSONObject4.put(ApiHandler.API_CALLBACK_ERRMSG, "onDownloadTaskStateChange:ok");
                        AppBrandLogger.m52830i("AbstractDownloadListener", "tempFilePath" + path + " file length " + file.length());
                        if (!TextUtils.isEmpty(str3)) {
                            if (aVar3.mo235094f(str3)) {
                                IOUtils.copyFile(file, new File(aVar3.mo235082b(str3)), false);
                            } else {
                                aVar3.mo235077a(path, str3, new StringBuilder());
                            }
                            jSONObject4.put("filePath", aVar3.mo235088d(str3));
                            jSONObject4.put("tempFilePath", aVar3.mo235088d(str3));
                        } else {
                            jSONObject4.put("tempFilePath", aVar3.mo235088d(path));
                        }
                        TracingCoreSpan tracingCoreSpan4 = tracingCoreSpan;
                        if (tracingCoreSpan4 != null && !TextUtils.isEmpty(tracingCoreSpan4.getRequestId())) {
                            jSONObject4.put("trace", tracingCoreSpan.getRequestId());
                        }
                        AbstractC12831a aVar = aVar2;
                        if (aVar != null) {
                            aVar.mo48471a(jSONObject4);
                            AppBrandLogger.m52830i("AbstractDownloadListener", "file download success! requestId:", Integer.valueOf(i));
                        }
                    }
                } catch (Exception e) {
                    AppBrandLogger.stacktrace(6, "AbstractDownloadListener", e.getStackTrace());
                    try {
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("downloadTaskId", i);
                        C66015a.m258508a(jSONObject5, ApiCode.GENERAL_UNKONW_ERROR, e.getMessage());
                        jSONObject5.put("state", "fail");
                        TracingCoreSpan tracingCoreSpan5 = tracingCoreSpan;
                        if (tracingCoreSpan5 != null && !TextUtils.isEmpty(tracingCoreSpan5.getRequestId())) {
                            jSONObject5.put("trace", tracingCoreSpan.getRequestId());
                        }
                        aVar2.mo48471a(jSONObject5);
                        AppBrandLogger.m52830i("AbstractDownloadListener", "file download failed! requestId:", Integer.valueOf(i));
                    } catch (JSONException e2) {
                        AppBrandLogger.stacktrace(6, "AbstractDownloadListener", e2.getStackTrace());
                    }
                }
            }

            @Override // com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12795a, com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12796b
            /* renamed from: a */
            public void mo48352a(String str, Throwable th) {
                String str2;
                if (aVar2 != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("downloadTaskId", i);
                        if ("abort".equals(str)) {
                            C66015a.m258507a(jSONObject, ApiCode.DOWNLOADFILE_ABORT);
                        } else {
                            C66015a.m258508a(jSONObject, ApiCode.GENERAL_UNKONW_ERROR, str);
                        }
                        jSONObject.put("state", "fail");
                        TracingCoreSpan tracingCoreSpan = tracingCoreSpan;
                        if (tracingCoreSpan != null && !TextUtils.isEmpty(tracingCoreSpan.getRequestId())) {
                            jSONObject.put("trace", tracingCoreSpan.getRequestId());
                        }
                        aVar2.mo48471a(jSONObject);
                        Object[] objArr = new Object[4];
                        objArr[0] = "file download failed! requestId:";
                        objArr[1] = Integer.valueOf(i);
                        objArr[2] = "errorMsg:";
                        if (th == null) {
                            str2 = "null";
                        } else {
                            str2 = th.getMessage();
                        }
                        objArr[3] = str2;
                        AppBrandLogger.m52830i("AbstractDownloadListener", objArr);
                    } catch (Exception e) {
                        AppBrandLogger.stacktrace(6, "AbstractDownloadListener", e.getStackTrace());
                    }
                }
            }

            @Override // com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12795a, com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12796b
            /* renamed from: a */
            public void mo48351a(int i, long j, long j2) {
                AppBrandLogger.m52828d("AbstractDownloadListener", "downloadProgress ", Integer.valueOf(i));
                if (aVar2 != null && !aVar.f34288g.mo48355a()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("downloadTaskId", i);
                        if (i <= 100) {
                            jSONObject.put("state", "progressUpdate");
                            jSONObject.put("totalBytesWritten", j);
                            jSONObject.put("totalBytesExpectedToWrite", j2);
                            jSONObject.put("progress", i);
                            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, "onDownloadTaskStateChange:ok");
                        }
                        aVar2.mo48471a(jSONObject);
                    } catch (Exception e) {
                        AppBrandLogger.stacktrace(6, "AbstractDownloadListener", e.getStackTrace());
                    }
                }
            }
        }, aVar.f34288g, z, tracingCoreSpan, iAppContext);
    }

    /* renamed from: a */
    public static void m259891a(C12832a aVar, AbstractC12831a aVar2, TracingCoreSpan tracingCoreSpan, IAppContext iAppContext) {
        if (aVar == null) {
            AppBrandLogger.m52829e("tma_FileLoadManager", "addDownloadRequest->downloadRequest is null!");
            return;
        }
        SparseArray<C12832a> a = m259885a(iAppContext);
        if (a.get(aVar.f34282a) != null) {
            AppBrandLogger.m52830i("tma_FileLoadManager", "download task is already exist.requestId:", Integer.valueOf(aVar.f34282a));
            return;
        }
        a.put(aVar.f34282a, aVar);
        try {
            if (TTFileHelper.m264259a("createDownloadTask", iAppContext)) {
                AppBrandLogger.m52830i("tma_FileLoadManager", "use standardDownload");
                m259896b(aVar, aVar2, tracingCoreSpan, iAppContext);
                return;
            }
            m259897c(aVar, aVar2, tracingCoreSpan, iAppContext);
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_FileLoadManager", "doDownload", e);
        }
    }

    /* renamed from: a */
    public static void m259892a(C66508a aVar, AbstractC67550j.AbstractC67551a<String> aVar2, int i, TracingCoreSpan tracingCoreSpan) {
        if (aVar2 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("uploadTaskId", aVar.f167893a);
                jSONObject.put("state", "fail");
                if (tracingCoreSpan != null && !TextUtils.isEmpty(tracingCoreSpan.getRequestId())) {
                    jSONObject.put("trace", tracingCoreSpan.getRequestId());
                }
                if (i == 1002) {
                    C66015a.m258507a(jSONObject, ApiCode.UPLOADFILE_INVALID_FILEPATH);
                } else if (i == 1001) {
                    C66015a.m258507a(jSONObject, ApiCode.UPLOADFILE_ABORT);
                } else {
                    C66015a.m258507a(jSONObject, ApiCode.GENERAL_UNKONW_ERROR);
                }
                aVar2.onNativeModuleCall(jSONObject.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.tt.miniapp.net.b$a */
    public static class C66508a {

        /* renamed from: a */
        public int f167893a;

        /* renamed from: b */
        public String f167894b;

        /* renamed from: c */
        public String f167895c;

        /* renamed from: d */
        public String f167896d;

        /* renamed from: e */
        public String f167897e;

        /* renamed from: f */
        public String f167898f;

        public C66508a(int i, String str, String str2, String str3, String str4, String str5, IAppContext iAppContext) {
            this.f167893a = i;
            this.f167894b = str;
            this.f167895c = str2;
            if (TTFileHelper.m264259a("createUploadTask", iAppContext)) {
                this.f167896d = str3;
            } else {
                this.f167896d = C67404a.m262266a(iAppContext).mo234079b(str3);
            }
            this.f167897e = str4;
            this.f167898f = str5;
        }
    }
}
