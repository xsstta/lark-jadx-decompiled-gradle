package com.ss.android.socialbase.downloader.p3026c;

import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.socialbase.downloader.constants.C59997c;
import com.ss.android.socialbase.downloader.depend.AbstractC60024b;
import com.ss.android.socialbase.downloader.depend.AbstractC60027e;
import com.ss.android.socialbase.downloader.depend.AbstractC60035m;
import com.ss.android.socialbase.downloader.downloader.AbstractC60065o;
import com.ss.android.socialbase.downloader.downloader.C60046b;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.network.AbstractC60135e;
import com.ss.android.socialbase.downloader.setting.C60148a;
import com.ss.android.socialbase.downloader.utils.C60161d;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.c.a */
public class C59992a {
    /* renamed from: a */
    public static String m232846a(String str) {
        try {
            if (TextUtils.isDigitsOnly(str)) {
                return String.valueOf(Long.valueOf(str).longValue() % 100);
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    private static boolean m232853a(int[] iArr, int i) {
        if (iArr != null && iArr.length > 0) {
            for (int i2 : iArr) {
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m232848a(int i, JSONObject jSONObject, DownloadInfo downloadInfo) throws JSONException {
        String str;
        if (i == -5) {
            str = "download_uncomplete";
        } else if (i == -4) {
            str = "download_cancel";
        } else if (i == -3) {
            double downloadSpeed = downloadInfo.getDownloadSpeed();
            if (downloadSpeed >= 0.0d) {
                jSONObject.put("download_speed", downloadSpeed);
            }
            str = "download_success";
        } else if (i == -2) {
            str = "download_pause";
        } else if (i == 0) {
            str = "download_create";
        } else if (i == 2) {
            str = "download_start";
        } else if (i != 6) {
            str = "";
        } else {
            str = "download_first_start";
        }
        jSONObject.put(UpdateKey.STATUS, str);
    }

    /* renamed from: a */
    public static void m232851a(DownloadTask downloadTask, BaseException baseException, int i) {
        if (downloadTask != null) {
            try {
                DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
                if (downloadInfo != null) {
                    AbstractC60035m monitorDepend = downloadTask.getMonitorDepend();
                    boolean c = C59997c.m232858c(i);
                    if (!c && !(c = m232853a(downloadInfo.getExtraMonitorStatus(), i)) && monitorDepend != null && (monitorDepend instanceof AbstractC60024b)) {
                        c = m232853a(((AbstractC60024b) monitorDepend).mo204504a(), i);
                    }
                    if (c) {
                        try {
                            AbstractC60027e depend = downloadTask.getDepend();
                            if (depend != null) {
                                depend.mo204509a(downloadInfo, baseException, i);
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        m232850a(monitorDepend, downloadInfo, baseException, i);
                        m232849a(C60046b.m232995g(), downloadInfo, baseException, i);
                    }
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m232849a(AbstractC59994c cVar, DownloadInfo downloadInfo, BaseException baseException, int i) {
        if (cVar != null && downloadInfo.isNeedSDKMonitor() && !TextUtils.isEmpty(downloadInfo.getMonitorScene())) {
            try {
                JSONObject a = m232847a(downloadInfo.getMonitorScene(), downloadInfo, baseException, i);
                if (a == null) {
                    a = new JSONObject();
                }
                if (i == -1) {
                    a.put(UpdateKey.STATUS, baseException.getErrorCode());
                    cVar.mo204284a("download_failed", a, null, null);
                    return;
                }
                m232848a(i, a, downloadInfo);
                cVar.mo204284a("download_common", a, null, null);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m232850a(AbstractC60035m mVar, DownloadInfo downloadInfo, BaseException baseException, int i) {
        if (mVar != null) {
            try {
                String b = mVar.mo204517b();
                if (TextUtils.isEmpty(b)) {
                    b = "default";
                }
                JSONObject a = m232847a(b, downloadInfo, baseException, i);
                if (a == null) {
                    a = new JSONObject();
                }
                mVar.mo204516a(a);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static JSONObject m232847a(String str, DownloadInfo downloadInfo, BaseException baseException, int i) {
        JSONException e;
        String str2;
        String str3;
        String str4;
        int i2;
        int i3;
        int i4;
        int i5;
        String str5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        String str6;
        String str7;
        int i12;
        int i13;
        String str8;
        String str9;
        String str10;
        String str11;
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                AbstractC60065o j = C60046b.m233000j();
                String str12 = "";
                int i14 = 0;
                if (j != null) {
                    str4 = j.mo204835b();
                    str3 = m232846a(str4);
                    str2 = j.mo204834a();
                    i2 = j.mo204836c();
                } else {
                    str4 = str12;
                    str3 = str4;
                    str2 = str3;
                    i2 = 0;
                }
                jSONObject2.put("event_page", str);
                jSONObject2.put("app_id", str2);
                jSONObject2.put("device_id", str4);
                jSONObject2.put("device_id_postfix", str3);
                jSONObject2.put(CommonCode.MapKey.UPDATE_VERSION, i2);
                jSONObject2.put("download_status", i);
                jSONObject2.put("setting_tag", C60148a.m233720a(downloadInfo.getId()).mo205476c("setting_tag"));
                if (downloadInfo != null) {
                    jSONObject2.put("download_id", downloadInfo.getId());
                    jSONObject2.put("name", downloadInfo.getName());
                    jSONObject2.put("url", downloadInfo.getUrl());
                    jSONObject2.put("download_time", downloadInfo.getDownloadTime());
                    jSONObject2.put("cur_bytes", downloadInfo.getCurBytes());
                    jSONObject2.put("total_bytes", downloadInfo.getTotalBytes());
                    jSONObject2.put("network_quality", downloadInfo.getNetworkQuality());
                    int i15 = 1;
                    if (downloadInfo.isOnlyWifi()) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    jSONObject2.put("only_wifi", i3);
                    if (downloadInfo.isNeedHttpsToHttpRetry()) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    jSONObject2.put("need_https_degrade", i4);
                    if (downloadInfo.isHttpsToHttpRetryUsed()) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    jSONObject2.put("https_degrade_retry_used", i5);
                    if (downloadInfo.getMd5() == null) {
                        str5 = str12;
                    } else {
                        str5 = downloadInfo.getMd5();
                    }
                    jSONObject2.put("md5", str5);
                    jSONObject2.put("chunk_count", downloadInfo.getChunkCount());
                    if (downloadInfo.isForce()) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    jSONObject2.put("is_force", i6);
                    jSONObject2.put("retry_count", downloadInfo.getRetryCount());
                    jSONObject2.put("cur_retry_time", downloadInfo.getCurRetryTime());
                    if (downloadInfo.isNeedRetryDelay()) {
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    jSONObject2.put("need_retry_delay", i7);
                    if (downloadInfo.isNeedReuseFirstConnection()) {
                        i8 = 1;
                    } else {
                        i8 = 0;
                    }
                    jSONObject2.put("need_reuse_first_connection", i8);
                    if (downloadInfo.isNeedDefaultHttpServiceBackUp()) {
                        i9 = 1;
                    } else {
                        i9 = 0;
                    }
                    jSONObject2.put("default_http_service_backup", i9);
                    jSONObject2.put("retry_delay_status", downloadInfo.getRetryDelayStatus().ordinal());
                    if (downloadInfo.isBackUpUrlUsed()) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    jSONObject2.put("backup_url_used", i10);
                    jSONObject2.put("download_byte_error_retry_status", downloadInfo.getByteInvalidRetryStatus().ordinal());
                    jSONObject2.put("forbidden_handler_status", downloadInfo.getAsyncHandleStatus().ordinal());
                    if (downloadInfo.isNeedIndependentProcess()) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    jSONObject2.put("need_independent_process", i11);
                    if (downloadInfo.getHeadConnectionException() != null) {
                        str6 = downloadInfo.getHeadConnectionException();
                    } else {
                        str6 = str12;
                    }
                    jSONObject2.put("head_connection_error_msg", str6);
                    if (downloadInfo.getExtra() != null) {
                        str7 = downloadInfo.getExtra();
                    } else {
                        str7 = str12;
                    }
                    jSONObject2.put("extra", str7);
                    if (!downloadInfo.isAddListenerToSameTask()) {
                        i15 = 0;
                    }
                    jSONObject2.put("add_listener_to_same_task", i15);
                    if (downloadInfo.getBackUpUrls() != null) {
                        i12 = downloadInfo.getBackUpUrls().size();
                    } else {
                        i12 = 0;
                    }
                    jSONObject2.put("backup_url_count", i12);
                    if (downloadInfo.getBackUpUrls() != null) {
                        i13 = downloadInfo.getCurBackUpUrlIndex();
                    } else {
                        i13 = -1;
                    }
                    jSONObject2.put("cur_backup_url_index", i13);
                    if (downloadInfo.getForbiddenBackupUrls() != null) {
                        str8 = downloadInfo.getForbiddenBackupUrls().toString();
                    } else {
                        str8 = str12;
                    }
                    jSONObject2.put("forbidden_urls", str8);
                    try {
                        String url = downloadInfo.getUrl();
                        if (!TextUtils.isEmpty(url)) {
                            Uri parse = Uri.parse(url);
                            str10 = parse.getHost();
                            str9 = parse.getPath();
                            str11 = parse.getLastPathSegment();
                            if (!TextUtils.isEmpty(str9) && !TextUtils.isEmpty(str11)) {
                                try {
                                    str9 = str9.substring(0, str9.length() - str11.length());
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            }
                        } else {
                            str11 = str12;
                            str10 = str11;
                            str9 = str10;
                        }
                        jSONObject2.put("url_host", str10);
                        jSONObject2.put("url_path", str9);
                        jSONObject2.put("url_last_path_segment", str11);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
                if (baseException != null) {
                    i14 = baseException.getErrorCode();
                }
                jSONObject2.put("error_code", i14);
                if (baseException != null) {
                    str12 = baseException.getErrorMessage();
                }
                jSONObject2.put("error_msg", str12);
                return jSONObject2;
            } catch (JSONException e2) {
                e = e2;
                jSONObject = jSONObject2;
                e.printStackTrace();
                return jSONObject;
            }
        } catch (JSONException e3) {
            e = e3;
            e.printStackTrace();
            return jSONObject;
        }
    }

    /* renamed from: a */
    public static void m232852a(AbstractC60135e eVar, String str, long j, String str2, int i, IOException iOException, DownloadInfo downloadInfo) {
        C60148a a;
        int a2;
        String str3;
        AbstractC59993b I;
        AbstractC59994c g;
        int httpStatusCode;
        if (downloadInfo != null && (a2 = (a = C60148a.m233720a(downloadInfo.getId())).mo205470a("monitor_download_connect", 0)) > 0 && !TextUtils.isEmpty(str)) {
            int i2 = -1;
            if (eVar != null) {
                try {
                    i2 = eVar.mo204945a();
                } catch (Throwable th) {
                    th.printStackTrace();
                    return;
                }
            }
            if (i2 < 200 || i2 >= 400) {
                if (downloadInfo.getCurRetryTime() != 0 && ((httpStatusCode = downloadInfo.getHttpStatusCode()) < 200 || httpStatusCode >= 400)) {
                    return;
                }
                if (iOException != null) {
                    if (!C60161d.m233793b(C60046b.m232945G())) {
                        i2 = 1049;
                    } else {
                        try {
                            C60161d.m233765a((Throwable) iOException, "");
                        } catch (BaseException e) {
                            i2 = e.getErrorCode();
                            str3 = e.getErrorMessage();
                        }
                    }
                }
            }
            str3 = null;
            Uri parse = Uri.parse(str);
            String host = parse.getHost();
            String path = parse.getPath();
            String lastPathSegment = parse.getLastPathSegment();
            if (!TextUtils.isEmpty(path) && !TextUtils.isEmpty(lastPathSegment)) {
                try {
                    path = path.substring(0, path.length() - lastPathSegment.length());
                } catch (Throwable unused) {
                }
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("setting_tag", a.mo205476c("setting_tag"));
                jSONObject.put("url_host", host);
                jSONObject.put("url_path", path);
                jSONObject.put("url_last_path_segment", lastPathSegment);
                jSONObject.put("net_lib", i);
                jSONObject.put("connect_type", str2);
                jSONObject.put("status_code", i2);
                if (str3 != null) {
                    jSONObject.put("err_msg", C60161d.m233747a(str3, a.mo205470a("exception_msg_length", ParticipantRepo.f117150c)));
                }
                jSONObject.put("connect_time", j);
                jSONObject.put("pkg_name", downloadInfo.getPackageName());
                jSONObject.put("name", downloadInfo.getTitle());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            if ((a2 == 1 || a2 == 3) && (g = C60046b.m232995g()) != null) {
                g.mo204284a("download_connect", jSONObject, null, null);
            }
            if ((a2 == 2 || a2 == 3) && (I = C60046b.m232947I()) != null) {
                I.mo204283a(downloadInfo, "download_connect", jSONObject);
            }
        }
    }
}
