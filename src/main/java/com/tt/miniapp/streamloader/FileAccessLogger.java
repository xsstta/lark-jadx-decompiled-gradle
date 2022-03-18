package com.tt.miniapp.streamloader;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandServiceManager;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapphost.entity.AppInfoEntity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FileAccessLogger extends AppbrandServiceManager.ServiceBase implements Handler.Callback {
    private Set<String> mAccessedFiles = new HashSet();
    private Handler mHandler;
    private List<C66861a> mRecentAccessedFile = new ArrayList();
    private long mStartTime = System.currentTimeMillis();
    private String mUniqueId = (UUID.randomUUID().toString().substring(0, 6) + System.currentTimeMillis());

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.streamloader.FileAccessLogger$a */
    public class C66861a {

        /* renamed from: a */
        public int f168648a;

        /* renamed from: b */
        public String f168649b;

        /* renamed from: a */
        public JSONObject mo232804a() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("index", this.f168648a);
            jSONObject.put("name", this.f168649b);
            return jSONObject;
        }

        private C66861a() {
        }
    }

    private void collectAndReport() {
        this.mHandler.removeMessages(5000);
        try {
            if (!this.mRecentAccessedFile.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (C66861a aVar : this.mRecentAccessedFile) {
                    jSONArray.put(aVar.mo232804a());
                }
                this.mRecentAccessedFile.clear();
                AppInfoEntity appInfo = this.mApp.getAppInfo();
                if (appInfo == null) {
                    AppBrandLogger.m52829e("tma_FileAccessLogger", "AppInfo is null!", new Throwable());
                    return;
                }
                C66020b.m258530a("mp_stream_load_files_index", this.mApp.getiAppContext()).mo231090a("app_id", appInfo.appId).mo231090a(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, appInfo.version).mo231090a("version_type", appInfo.versionType).mo231090a("version_code", Long.valueOf(appInfo.versionCode)).mo231090a("unique_id", this.mUniqueId).mo231090a("files", jSONArray.toString()).mo231092a();
                return;
            }
            AppBrandLogger.m52831w("tma_FileAccessLogger", "RecentAccessedFile is empty!");
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("tma_FileAccessLogger", "collectAndReport", e);
        }
    }

    public void logFileAccess(String str) {
        logFileAccess(str, System.currentTimeMillis());
    }

    private FileAccessLogger(AppbrandApplicationImpl appbrandApplicationImpl) {
        super(appbrandApplicationImpl);
    }

    public boolean handleMessage(Message message) {
        if (message.what == 5000) {
            collectAndReport();
            return true;
        } else if (message.what != 5001) {
            return false;
        } else {
            String str = (String) message.obj;
            int i = message.arg1;
            if (this.mAccessedFiles.contains(str)) {
                return true;
            }
            C66861a aVar = new C66861a();
            aVar.f168649b = str;
            aVar.f168648a = i;
            this.mAccessedFiles.add(aVar.f168649b);
            this.mRecentAccessedFile.add(aVar);
            if (this.mRecentAccessedFile.size() >= 30) {
                this.mHandler.sendEmptyMessage(5000);
            } else {
                this.mHandler.sendEmptyMessageDelayed(5000, 3000);
            }
            return true;
        }
    }

    public void logFileAccess(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("tma_FileAccessLogger", "FileName is null!", new Throwable());
        } else if (!this.mAccessedFiles.contains(str)) {
            if (this.mHandler == null) {
                synchronized (this) {
                    if (this.mHandler == null) {
                        HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("FileAccessHandlerThread");
                        new_android_os_HandlerThread_by_knot.start();
                        this.mHandler = new Handler(new_android_os_HandlerThread_by_knot.getLooper(), this);
                    }
                }
            }
            this.mHandler.obtainMessage(5001, (int) (j - this.mStartTime), 0, str).sendToTarget();
        }
    }
}
