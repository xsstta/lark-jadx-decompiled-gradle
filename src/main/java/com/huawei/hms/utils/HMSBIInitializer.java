package com.huawei.hms.utils;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.huawei.hianalytics.process.HiAnalyticsConfig;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hms.framework.network.grs.IQueryUrlCallBack;
import com.huawei.hms.hatool.HmsHiAnalyticsUtils;
import com.huawei.hms.stats.C23781a;
import com.huawei.hms.stats.C23783c;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.log.HMSLog;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

public class HMSBIInitializer {

    /* renamed from: d */
    public static final Object f58956d = new Object();

    /* renamed from: e */
    public static HMSBIInitializer f58957e;

    /* renamed from: f */
    public static HiAnalyticsInstance f58958f;

    /* renamed from: a */
    public final Context f58959a;

    /* renamed from: b */
    public AtomicBoolean f58960b = new AtomicBoolean(false);

    /* renamed from: c */
    public boolean f58961c;

    public HiAnalyticsInstance getAnalyticsInstance() {
        return f58958f;
    }

    public boolean isInit() {
        if (!this.f58961c) {
            return HmsHiAnalyticsUtils.getInitFlag();
        }
        return HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
    }

    public void initBI() {
        boolean z;
        if (!this.f58961c) {
            z = HmsHiAnalyticsUtils.getInitFlag();
        } else {
            z = HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
        }
        HMSLog.m86966i("HMSBIInitializer", "Builder->biInitFlag :" + z);
        if (!z && !C23781a.m86954c(this.f58959a) && this.f58960b.compareAndSet(false, true)) {
            String issueCountryCode = GrsApp.getInstance().getIssueCountryCode(this.f58959a);
            if (!TextUtils.isEmpty(issueCountryCode)) {
                issueCountryCode = issueCountryCode.toUpperCase(Locale.ENGLISH);
            }
            if (GrsBaseInfo.CountryCodeSource.UNKNOWN.equalsIgnoreCase(issueCountryCode) || TextUtils.isEmpty(issueCountryCode)) {
                HMSLog.m86964e("HMSBIInitializer", "Failed to get device issue country");
                this.f58960b.set(false);
                return;
            }
            new AsyncTaskC23802b(this, null).execute(issueCountryCode);
        }
    }

    /* renamed from: com.huawei.hms.utils.HMSBIInitializer$a */
    public class C23801a implements IQueryUrlCallBack {
        public C23801a() {
        }

        @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
        public void onCallBackFail(int i) {
            HMSLog.m86964e("HMSBIInitializer", "get grs failed, the errorcode is " + i);
            HMSBIInitializer.this.f58960b.set(false);
        }

        @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
        public void onCallBackSuccess(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (!HMSBIInitializer.this.f58961c) {
                    HmsHiAnalyticsUtils.init(HMSBIInitializer.this.f58959a, false, false, false, str, "com.huawei.hwid");
                } else {
                    HiAnalyticsConfig build = new HiAnalyticsConfig.Builder().setEnableImei(false).setEnableUDID(false).setEnableSN(false).setCollectURL(str).build();
                    HiAnalyticsInstance unused = HMSBIInitializer.f58958f = new HiAnalyticsInstance.Builder(HMSBIInitializer.this.f58959a).setOperConf(build).setMaintConf(new HiAnalyticsConfig.Builder().setEnableImei(false).setEnableUDID(false).setEnableSN(false).setCollectURL(str).build()).create(HiAnalyticsConstant.HA_SERVICE_TAG);
                    HMSBIInitializer.f58958f.setAppid("com.huawei.hwid");
                }
                HMSLog.m86966i("HMSBIInitializer", "BI URL acquired successfully");
            }
            HMSBIInitializer.this.f58960b.set(false);
        }
    }

    /* renamed from: com.huawei.hms.utils.HMSBIInitializer$b */
    public class AsyncTaskC23802b extends AsyncTask<String, Integer, Void> {
        public AsyncTaskC23802b() {
        }

        /* renamed from: a */
        public Void doInBackground(String... strArr) {
            HMSBIInitializer.this.mo85502a((HMSBIInitializer) strArr[0]);
            return null;
        }

        public /* synthetic */ AsyncTaskC23802b(HMSBIInitializer hMSBIInitializer, C23801a aVar) {
            this();
        }
    }

    public HMSBIInitializer(Context context) {
        this.f58959a = context;
        this.f58961c = C23783c.m86959a();
    }

    public static HMSBIInitializer getInstance(Context context) {
        synchronized (f58956d) {
            if (f58957e == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    f58957e = new HMSBIInitializer(applicationContext);
                } else {
                    f58957e = new HMSBIInitializer(context);
                }
            }
        }
        return f58957e;
    }

    /* renamed from: a */
    public final void mo85502a(String str) {
        HMSLog.m86966i("HMSBIInitializer", "Start to query GRS");
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        grsBaseInfo.setIssueCountry(str);
        new GrsClient(this.f58959a, grsBaseInfo).ayncGetGrsUrl("com.huawei.cloud.opensdkhianalytics", "ROOT", new C23801a());
    }
}
