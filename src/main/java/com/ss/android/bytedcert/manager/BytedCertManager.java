package com.ss.android.bytedcert.manager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.bytedcert.activities.FaceLivePreActivity;
import com.ss.android.bytedcert.activities.SDKWebActivity;
import com.ss.android.bytedcert.activities.WebFailedActivity;
import com.ss.android.bytedcert.callback.AbstractC28330a;
import com.ss.android.bytedcert.callback.AbstractC28331b;
import com.ss.android.bytedcert.callback.AbstractC28332c;
import com.ss.android.bytedcert.callback.AbstractC28333d;
import com.ss.android.bytedcert.callback.AbstractC28334e;
import com.ss.android.bytedcert.callback.AbstractC28336g;
import com.ss.android.bytedcert.callback.AbstractC28339h;
import com.ss.android.bytedcert.callback.SDKCallBack;
import com.ss.android.bytedcert.config.AbstractC28341a;
import com.ss.android.bytedcert.config.AbstractC28343c;
import com.ss.android.bytedcert.config.AbstractC28344d;
import com.ss.android.bytedcert.config.AbstractC28346e;
import com.ss.android.bytedcert.config.C28347f;
import com.ss.android.bytedcert.config.INetWork;
import com.ss.android.bytedcert.net.BDResponse;
import com.ss.android.bytedcert.p1304b.C28317a;
import com.ss.android.bytedcert.p1304b.C28320c;
import com.ss.android.bytedcert.p1305c.AbstractC28322b;
import com.ss.android.bytedcert.p1305c.C28325d;
import com.ss.android.bytedcert.p1306d.C28349b;
import com.ss.android.bytedcert.p1308f.p1309a.p1313d.C28374a;
import com.ss.android.bytedcert.p1314g.C28379a;
import com.ss.android.bytedcert.p1314g.C28380b;
import com.ss.android.bytedcert.p1314g.C28382d;
import com.ss.android.bytedcert.p1315h.RunnableC28384a;
import com.ss.android.bytedcert.utils.C28432b;
import com.ss.android.bytedcert.utils.C28433c;
import com.ss.android.bytedcert.utils.C28440f;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public class BytedCertManager {
    private static boolean sGLPause = false;
    private static boolean sHttpAllow = true;
    private static int sLiveSDKRunning = 1;
    private Context appContext;
    public boolean hasDownload;
    private boolean isLoadRender;
    private boolean isLoadSmash;
    public C28379a mActionInfo;
    private int mCameraStartType;
    private AbstractC28341a mCertConfig;
    public AbstractC28330a mCertConflictCallback;
    public C28380b mCertInfo;
    private AbstractC28343c mCertMonitorConfig;
    private boolean mDebugEnable;
    private AbstractC28344d mDownloadConfig;
    private AbstractC28333d mExceptionCallback;
    public long mFaceInitTime;
    private SDKCallBack.FaceLiveCallback mFaceLiveCallback;
    public AbstractC28331b mFaceLiveInterruptListener;
    public long mFaceLiveTime;
    public long mFaceStartTime;
    public AbstractC28332c mH5CallBack;
    private Handler mHandler;
    public long mImgTime1;
    public long mImgTime2;
    public long mImgTimeDelta;
    public String mImgType;
    public boolean mIsCertStart;
    public boolean mIsFaceFromInternal;
    private C28382d mLiveInfo;
    private String mModulePath;
    private INetWork mNetWork;
    public AbstractC28336g.AbstractC28337a mPickCallbackImp;
    public AbstractC28339h mProgressCallback;
    private AbstractC28346e mThemeConfig;
    private AbstractC28334e mWebEventCallback;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.bytedcert.manager.BytedCertManager$a */
    public static class C28395a {

        /* renamed from: a */
        static final BytedCertManager f71407a = new BytedCertManager();
    }

    public String getVersionCode() {
        return "4.1.0";
    }

    public static boolean getGLPause() {
        return sGLPause;
    }

    public static boolean getHttpAllow() {
        return sHttpAllow;
    }

    public static BytedCertManager getInstance() {
        return C28395a.f71407a;
    }

    public C28379a getActionInfo() {
        return this.mActionInfo;
    }

    public Context getAppContext() {
        return this.appContext;
    }

    public int getCameraStartType() {
        return this.mCameraStartType;
    }

    public C28380b getCertInfo() {
        return this.mCertInfo;
    }

    public AbstractC28343c getCertMonitorConfig() {
        return this.mCertMonitorConfig;
    }

    public boolean getDebugEnable() {
        return this.mDebugEnable;
    }

    public AbstractC28344d getDownloadConfig() {
        return this.mDownloadConfig;
    }

    public AbstractC28333d getExceptionCallback() {
        return this.mExceptionCallback;
    }

    public SDKCallBack.FaceLiveCallback getFaceLiveCallback() {
        return this.mFaceLiveCallback;
    }

    public C28382d getLiveInfo() {
        return this.mLiveInfo;
    }

    public INetWork getNetWork() {
        return this.mNetWork;
    }

    public int getSDKRunningFlag() {
        return sLiveSDKRunning;
    }

    public AbstractC28334e getWebEventCallback() {
        return this.mWebEventCallback;
    }

    public boolean isLoadRender() {
        return this.isLoadRender;
    }

    public boolean isLoadSmash() {
        return this.isLoadSmash;
    }

    public AbstractC28341a getCertConfig() {
        AbstractC28341a aVar = this.mCertConfig;
        if (aVar == null) {
            return AbstractC28341a.f71176a;
        }
        return aVar;
    }

    public String getDebugH5Url() {
        return C28320c.m103909a();
    }

    public AbstractC28346e getThemeConfig() {
        AbstractC28346e eVar = this.mThemeConfig;
        if (eVar == null) {
            return AbstractC28346e.f71177a;
        }
        return eVar;
    }

    public void resetStatus() {
        this.mIsCertStart = false;
        this.mIsFaceFromInternal = false;
    }

    private BytedCertManager() {
        this.mHandler = new Handler(Looper.getMainLooper());
        injectAdapter();
    }

    public String getModulePath() {
        if (TextUtils.isEmpty(this.mModulePath)) {
            this.mModulePath = this.mDownloadConfig.mo100821a();
        }
        return this.mModulePath;
    }

    private void injectAdapter() {
        try {
            Object newInstance = Class.forName("com.ss.android.bytedcert.adapter.monitor.CertMonitorAdapter").newInstance();
            if (newInstance instanceof AbstractC28343c) {
                this.mCertMonitorConfig = (AbstractC28343c) newInstance;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Object newInstance2 = Class.forName("com.ss.android.bytedcert.adapter.network.NetWorkAdapter").newInstance();
            if (newInstance2 instanceof INetWork) {
                this.mNetWork = (INetWork) newInstance2;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            Object newInstance3 = Class.forName("com.ss.android.bytedcert.a.a.a").newInstance();
            if (newInstance3 instanceof AbstractC28344d) {
                this.mDownloadConfig = (AbstractC28344d) newInstance3;
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public BDResponse checkModelAvailable() {
        String[] strArr = C28374a.f71310e;
        String a = this.mDownloadConfig.mo100821a();
        this.mModulePath = a;
        if (TextUtils.isEmpty(a)) {
            BDResponse bDResponse = new BDResponse(C28317a.C28318a.f71159w);
            bDResponse.errorMsg = "module path is empty";
            return bDResponse;
        }
        File file = new File(this.mModulePath);
        if (!file.exists() || file.list().length <= 0) {
            BDResponse bDResponse2 = new BDResponse(C28317a.C28318a.f71159w);
            bDResponse2.errorMsg = "module path =" + this.mModulePath + " no contains file";
            if (file.list().length <= 0) {
                this.mDownloadConfig.mo100827b();
            }
            return bDResponse2;
        }
        for (String str : strArr) {
            String a2 = C28433c.m104212a(getInstance().getModulePath(), str);
            if (TextUtils.isEmpty(a2)) {
                this.mDownloadConfig.mo100827b();
                return new BDResponse(C28317a.C28318a.f71160x);
            }
            String b = C28433c.m104218b(new File(a2 + ".txt"));
            if (TextUtils.isEmpty(b)) {
                this.mDownloadConfig.mo100827b();
                return new BDResponse(C28317a.C28318a.f71161y);
            } else if (!C28433c.m104211a(new File(a2)).equals(b.trim())) {
                this.mDownloadConfig.mo100827b();
                return new BDResponse(C28317a.C28318a.f71161y);
            }
        }
        return new BDResponse(true);
    }

    public static void setGLPause(boolean z) {
        sGLPause = z;
    }

    public static void setHttpAllow(boolean z) {
        sHttpAllow = z;
    }

    public static void setSDKRunningFlag(int i) {
        sLiveSDKRunning = i;
    }

    public void config(AbstractC28341a aVar) {
        this.mCertConfig = aVar;
    }

    public void setCameraStartType(int i) {
        this.mCameraStartType = i;
    }

    public void setCertConflictCallback(AbstractC28330a aVar) {
        this.mCertConflictCallback = aVar;
    }

    public void setCertMonitorConfig(AbstractC28343c cVar) {
        this.mCertMonitorConfig = cVar;
    }

    public void setDebugEnable(boolean z) {
        this.mDebugEnable = z;
    }

    public void setDebugH5Url(String str) {
        C28320c.m103914c(str);
    }

    public void setDownloadConfig(AbstractC28344d dVar) {
        this.mDownloadConfig = dVar;
    }

    public void setExceptionCallback(AbstractC28333d dVar) {
        this.mExceptionCallback = dVar;
    }

    public void setExecutorService(ExecutorService executorService) {
        RunnableC28384a.m104102a(executorService);
    }

    public void setFaceLiveCallback(SDKCallBack.FaceLiveCallback faceLiveCallback) {
        this.mFaceLiveCallback = faceLiveCallback;
    }

    public void setFaceLiveInterruptListener(AbstractC28331b bVar) {
        this.mFaceLiveInterruptListener = bVar;
    }

    public void setH5CallBack(AbstractC28332c cVar) {
        this.mH5CallBack = cVar;
    }

    public void setHost(String str) {
        C28320c.m103912b(str);
    }

    public void setLiveInfo(C28382d dVar) {
        this.mLiveInfo = dVar;
    }

    public void setLoadRender(boolean z) {
        this.isLoadRender = z;
    }

    public void setLoadSmash(boolean z) {
        this.isLoadSmash = z;
    }

    public void setNetWork(INetWork iNetWork) {
        this.mNetWork = iNetWork;
    }

    public void setPickPhotoImp(AbstractC28336g.AbstractC28337a aVar) {
        this.mPickCallbackImp = aVar;
    }

    public void setProgressCallback(AbstractC28339h hVar) {
        this.mProgressCallback = hVar;
    }

    public void setTheme(AbstractC28346e eVar) {
        this.mThemeConfig = eVar;
    }

    public void setWebEventCallback(AbstractC28334e eVar) {
        this.mWebEventCallback = eVar;
    }

    public void startBytedCert(Activity activity) {
        initSDK(activity);
    }

    public void executeInMainThread(Runnable runnable) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public int setTheme(final HashMap<String, Integer> hashMap) {
        setTheme(new AbstractC28346e() {
            /* class com.ss.android.bytedcert.manager.BytedCertManager.C283884 */

            /* renamed from: d */
            private AbstractC28346e f71382d = new C28347f();

            @Override // com.ss.android.bytedcert.config.AbstractC28346e
            /* renamed from: i */
            public Drawable mo100962i() {
                return this.f71382d.mo100962i();
            }

            @Override // com.ss.android.bytedcert.config.AbstractC28346e
            /* renamed from: j */
            public int mo100963j() {
                return this.f71382d.mo100963j();
            }

            @Override // com.ss.android.bytedcert.config.AbstractC28346e
            /* renamed from: a */
            public int mo100953a() {
                if (hashMap.get("PROGRESS_COLOR") != null) {
                    return ((Integer) hashMap.get("PROGRESS_COLOR")).intValue();
                }
                return this.f71382d.mo100955b();
            }

            @Override // com.ss.android.bytedcert.config.AbstractC28346e
            /* renamed from: b */
            public int mo100955b() {
                if (hashMap.get("PROGRESS_BG_COLOR") != null) {
                    return ((Integer) hashMap.get("PROGRESS_BG_COLOR")).intValue();
                }
                return this.f71382d.mo100955b();
            }

            @Override // com.ss.android.bytedcert.config.AbstractC28346e
            /* renamed from: c */
            public float mo100956c() {
                if (hashMap.get("PROGRESS_WIDTH") != null) {
                    return (float) ((Integer) hashMap.get("PROGRESS_WIDTH")).intValue();
                }
                return this.f71382d.mo100956c();
            }

            @Override // com.ss.android.bytedcert.config.AbstractC28346e
            /* renamed from: d */
            public float mo100957d() {
                if (hashMap.get("PROGRESS_GAP") != null) {
                    return (float) ((Integer) hashMap.get("PROGRESS_GAP")).intValue();
                }
                return this.f71382d.mo100957d();
            }

            @Override // com.ss.android.bytedcert.config.AbstractC28346e
            /* renamed from: e */
            public int mo100958e() {
                if (hashMap.get("SCREEN_COLOR") != null) {
                    return ((Integer) hashMap.get("SCREEN_COLOR")).intValue();
                }
                return this.f71382d.mo100958e();
            }

            @Override // com.ss.android.bytedcert.config.AbstractC28346e
            /* renamed from: f */
            public int mo100959f() {
                if (hashMap.get("TEXT_COLOR") != null) {
                    return ((Integer) hashMap.get("TEXT_COLOR")).intValue();
                }
                return this.f71382d.mo100959f();
            }

            @Override // com.ss.android.bytedcert.config.AbstractC28346e
            /* renamed from: g */
            public int mo100960g() {
                if (hashMap.get("NAV_BAR_COLOR") != null) {
                    return ((Integer) hashMap.get("NAV_BAR_COLOR")).intValue();
                }
                return this.f71382d.mo100960g();
            }

            @Override // com.ss.android.bytedcert.config.AbstractC28346e
            /* renamed from: h */
            public boolean mo100961h() {
                if (hashMap.get("RETURN_STYPE") == null) {
                    return this.f71382d.mo100961h();
                }
                if (((Integer) hashMap.get("RETURN_STYPE")).intValue() == 1) {
                    return true;
                }
                return false;
            }

            @Override // com.ss.android.bytedcert.config.AbstractC28346e
            /* renamed from: a */
            public void mo100954a(int i) {
                this.f71382d.mo100954a(i);
            }
        });
        return 0;
    }

    public void onWebReqEvent(boolean z) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str = "web_req_success";
            } else {
                str = "web_req_fail";
            }
            jSONObject.put("web_req_result", str);
            C28432b.m104209a("face_detection_start_web_req", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void startFaceLive(Context context) {
        if (context != null) {
            Intent intent = new Intent(context, FaceLivePreActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return;
        }
        resetStatus();
    }

    public void startWebFailActivity(Context context) {
        Intent intent = new Intent(context, WebFailedActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    private void initSDK(final Activity activity) {
        if (activity != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            final C28325d dVar = null;
            try {
                dVar = C28325d.m103926a(activity, activity.getApplication().getString(R.string.byted_loading_text));
                dVar.mo100921a();
            } catch (Exception e) {
                e.printStackTrace();
            }
            doSDKInit(activity, new SDKCallBack.AbstractC28328a() {
                /* class com.ss.android.bytedcert.manager.BytedCertManager.C283895 */

                @Override // com.ss.android.bytedcert.callback.SDKCallBack.AbstractC28328a
                /* renamed from: a */
                public void mo100863a(BDResponse bDResponse) {
                    C28325d dVar = dVar;
                    if (dVar != null) {
                        dVar.mo100922b();
                    }
                    C28432b.m104206a("cert_start_byted_cert", bDResponse, Integer.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)), null);
                    if (bDResponse != null && bDResponse.success) {
                        BytedCertManager.this.mActionInfo = new C28379a(bDResponse);
                        JSONObject jSONObject = bDResponse.jsonData;
                        if (jSONObject != null) {
                            String optString = jSONObject.optString("entry_page_address");
                            String optString2 = jSONObject.optString("ticket");
                            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                                if (BytedCertManager.this.mCertInfo != null) {
                                    BytedCertManager.this.mCertInfo.f71352b = optString2;
                                }
                                Intent intent = new Intent(activity, SDKWebActivity.class);
                                intent.putExtra("web_url", optString);
                                activity.startActivity(intent);
                                return;
                            }
                        }
                    }
                    BytedCertManager.this.mIsCertStart = false;
                    BytedCertManager.this.startWebFailActivity(activity);
                }
            });
        }
    }

    public void reportFaceLiveTime(BDResponse bDResponse) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            if (!this.mIsFaceFromInternal) {
                jSONObject.put("during_query_init", this.mFaceInitTime);
            }
            jSONObject.put("during_query_live", this.mFaceLiveTime);
            if (this.mIsFaceFromInternal) {
                str = "cert_start_face_live_internal";
            } else {
                str = "cert_start_face_live";
            }
            C28432b.m104206a(str, bDResponse, null, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setCertInfo(HashMap<String, String> hashMap) {
        if (hashMap != null && !this.mIsCertStart) {
            this.mCertInfo = new C28380b();
            if (hashMap.containsKey("scene")) {
                this.mCertInfo.f71351a = hashMap.get("scene");
            }
            if (hashMap.containsKey("ticket")) {
                this.mCertInfo.f71352b = hashMap.get("ticket");
            }
            if (hashMap.containsKey("mode")) {
                this.mCertInfo.f71353c = hashMap.get("mode");
            }
            if (hashMap.containsKey("cert_app_id")) {
                this.mCertInfo.f71356f = hashMap.get("cert_app_id");
            } else if (hashMap.containsKey("aid")) {
                this.mCertInfo.f71356f = hashMap.get("aid");
            } else if (hashMap.containsKey("app_id")) {
                this.mCertInfo.f71356f = hashMap.get("app_id");
            }
            if (hashMap.containsKey("action_num")) {
                this.mCertInfo.f71357g = Integer.parseInt(hashMap.get("action_num"));
            }
        }
    }

    private void initError(Context context) {
        Integer valueOf = Integer.valueOf((int) IByteRtcError.BRERR_INVALID_TOKEN);
        C28317a.C28318a.f71137a = new Pair<>(valueOf, context.getString(R.string.byted_error_network_error));
        C28317a.C28318a.f71137a = new Pair<>(valueOf, context.getString(R.string.byted_error_network_error));
        C28317a.C28318a.f71138b = new Pair<>(Integer.valueOf((int) IByteRtcError.BRERR_JOIN_ROOM_ERROR), context.getString(R.string.byted_error_network_error));
        C28317a.C28318a.f71139c = new Pair<>(Integer.valueOf((int) IByteRtcError.BRERR_NO_PUBLISH_PERMISSION), context.getString(R.string.byted_error_network_error));
        C28317a.C28318a.f71140d = new Pair<>(Integer.valueOf((int) IByteRtcError.BRERR_NO_SUBSCRIBE_PERMISSION), context.getString(R.string.byted_error_face_live_fail));
        C28317a.C28318a.f71141e = new Pair<>(Integer.valueOf((int) IByteRtcError.BRRERR_DUPLICATE_LOGIN), context.getString(R.string.byted_error_network_error));
        C28317a.C28318a.f71142f = new Pair<>(Integer.valueOf((int) IByteRtcError.BRERR_GET_ROOM_INVALID_RESPONSE), context.getString(R.string.byted_error_network_error));
        C28317a.C28318a.f71143g = new Pair<>(-1006, "");
        C28317a.C28318a.f71144h = new Pair<>(-1007, "");
        C28317a.C28318a.f71147k = new Pair<>(-3000, context.getString(R.string.byted_error_permission_error));
        C28317a.C28318a.f71148l = new Pair<>(-3001, context.getString(R.string.byted_error_network_error));
        C28317a.C28318a.f71149m = new Pair<>(-3002, context.getString(R.string.byted_error_multi_window));
        C28317a.C28318a.f71150n = new Pair<>(-3003, context.getString(R.string.byted_error_permission_error));
        C28317a.C28318a.f71151o = new Pair<>(-3004, context.getString(R.string.byted_error_network_error));
        C28317a.C28318a.f71152p = new Pair<>(-3006, context.getString(R.string.byted_error_pick_photo_error));
        C28317a.C28318a.f71153q = new Pair<>(-3007, context.getString(R.string.byted_error_take_photo_error));
        C28317a.C28318a.f71156t = new Pair<>(-4003, context.getString(R.string.byted_error_cert_is_start));
    }

    public Intent getOCRIntent(Activity activity, String str) {
        return C28349b.m103984a(activity, str);
    }

    public void setPreloadParams(Context context, HashMap<String, String> hashMap) {
        this.mDownloadConfig.mo100823a(context, hashMap);
    }

    public void doFaceCompareAuthentication(Map<String, String> map, SDKCallBack.AbstractC28328a aVar) {
        C28399b.m104133a().mo101182a(aVar, C28320c.m103919h(), map);
    }

    public void doFaceCompareVerification(Map<String, String> map, SDKCallBack.AbstractC28328a aVar) {
        C28399b.m104133a().mo101182a(aVar, C28320c.m103918g(), map);
    }

    public void checkLoadStatus(Context context, final SDKCallBack.AbstractC28329b bVar) {
        this.hasDownload = false;
        BDResponse checkModelAvailable = checkModelAvailable();
        if (checkModelAvailable == null || checkModelAvailable.success) {
            this.mDownloadConfig.mo100822a(context, new AbstractC28344d.AbstractC28345a() {
                /* class com.ss.android.bytedcert.manager.BytedCertManager.C283851 */

                @Override // com.ss.android.bytedcert.config.AbstractC28344d.AbstractC28345a
                /* renamed from: a */
                public void mo100951a(boolean z) {
                    bVar.mo100933a(new BDResponse(!z));
                }

                @Override // com.ss.android.bytedcert.config.AbstractC28344d.AbstractC28345a
                /* renamed from: a */
                public void mo100952a(boolean z, Throwable th) {
                    BytedCertManager.this.hasDownload = z;
                }
            });
        } else {
            bVar.mo100933a(checkModelAvailable);
        }
    }

    public void startBytedCert(final Context context, final AbstractC28322b bVar) {
        final long currentTimeMillis = System.currentTimeMillis();
        if (bVar != null) {
            try {
                bVar.mo100921a();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (context != null) {
            doSDKInit(context, new SDKCallBack.AbstractC28328a() {
                /* class com.ss.android.bytedcert.manager.BytedCertManager.C283906 */

                @Override // com.ss.android.bytedcert.callback.SDKCallBack.AbstractC28328a
                /* renamed from: a */
                public void mo100863a(BDResponse bDResponse) {
                    AbstractC28322b bVar = bVar;
                    if (bVar != null) {
                        bVar.mo100922b();
                    }
                    C28432b.m104206a("cert_start_byted_cert", bDResponse, Integer.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)), null);
                    if (bDResponse != null && bDResponse.success) {
                        BytedCertManager.this.mActionInfo = new C28379a(bDResponse);
                        JSONObject jSONObject = bDResponse.jsonData;
                        if (jSONObject != null) {
                            String optString = jSONObject.optString("entry_page_address");
                            String optString2 = jSONObject.optString("ticket");
                            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                                if (BytedCertManager.this.mCertInfo != null) {
                                    BytedCertManager.this.mCertInfo.f71352b = optString2;
                                }
                                Intent intent = new Intent(context, SDKWebActivity.class);
                                if (!(context instanceof Activity)) {
                                    intent.addFlags(268435456);
                                }
                                intent.putExtra("web_url", optString);
                                context.startActivity(intent);
                                return;
                            }
                        }
                    }
                    BytedCertManager.this.mIsCertStart = false;
                    BytedCertManager.this.startWebFailActivity(context);
                }
            });
        }
    }

    public void onPreloadEvent(Boolean bool, Throwable th) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            if (bool.booleanValue()) {
                jSONObject.put("result", "1");
            } else {
                if (th != null) {
                    str = "0";
                } else {
                    str = "2";
                }
                jSONObject.put("result", str);
            }
            if (th != null) {
                jSONObject.put("error_msg", Log.getStackTraceString(th));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        C28432b.m104209a("cert_model_preload", jSONObject);
    }

    public void preload(Context context, final SDKCallBack.AbstractC28329b bVar) {
        C28432b.m104209a("cert_model_preload_start", new JSONObject());
        if (this.hasDownload) {
            bVar.mo100933a(new BDResponse(true));
            this.hasDownload = false;
            return;
        }
        this.mDownloadConfig.mo100822a(context, new AbstractC28344d.AbstractC28345a() {
            /* class com.ss.android.bytedcert.manager.BytedCertManager.C283862 */

            @Override // com.ss.android.bytedcert.config.AbstractC28344d.AbstractC28345a
            /* renamed from: a */
            public void mo100951a(boolean z) {
            }

            @Override // com.ss.android.bytedcert.config.AbstractC28344d.AbstractC28345a
            /* renamed from: a */
            public void mo100952a(boolean z, Throwable th) {
                BytedCertManager.this.onPreloadEvent(Boolean.valueOf(z), th);
                BDResponse bDResponse = new BDResponse(z);
                if (th != null) {
                    bDResponse = new BDResponse(C28317a.C28318a.f71157u);
                    bDResponse.detailErrorMsg = th.getMessage();
                } else if (!z) {
                    bDResponse = new BDResponse(C28317a.C28318a.f71158v);
                    bDResponse.success = true;
                }
                bVar.mo100933a(bDResponse);
                BytedCertManager.this.hasDownload = false;
            }
        });
    }

    public void doSDKInit(Context context, SDKCallBack.AbstractC28328a aVar) {
        if (context != null) {
            initError(context);
        }
        if (this.mCertMonitorConfig == null) {
            aVar.mo100863a(new BDResponse(C28317a.C28318a.f71155s));
        } else if (this.mNetWork == null) {
            aVar.mo100863a(new BDResponse(C28317a.C28318a.f71154r));
        } else if (this.mIsCertStart) {
            aVar.mo100863a(new BDResponse(C28317a.C28318a.f71156t));
        } else {
            this.mIsCertStart = true;
            this.appContext = context.getApplicationContext();
            C28399b.m104133a().mo101180a(aVar, "POST", C28320c.m103913c(), (Map<String, String>) null);
        }
    }

    public void doFaceCompare(Map<String, String> map, String str, SDKCallBack.AbstractC28328a aVar) {
        C28399b.m104133a().mo101182a(aVar, str, map);
    }

    public void keepUriPhoto(Context context, String str, Uri uri) {
        this.mImgType = "from_album";
        C28349b.m103988a(context, str, uri);
    }

    public void doOfflineFaceLive(final Context context, final Bitmap bitmap, final SDKCallBack.FaceLiveCallback faceLiveCallback) {
        getInstance().executeInMainThread(new Runnable() {
            /* class com.ss.android.bytedcert.manager.BytedCertManager.RunnableC283873 */

            public void run() {
                if (context == null || bitmap == null) {
                    faceLiveCallback.onFaceLiveFinish(new BDResponse(C28317a.C28318a.f71138b));
                    return;
                }
                BDResponse checkModelAvailable = BytedCertManager.this.checkModelAvailable();
                if (checkModelAvailable == null || checkModelAvailable.success) {
                    BytedCertManager.setGLPause(false);
                    BytedCertManager.setSDKRunningFlag(1);
                    BytedCertManager.setHttpAllow(true);
                    C28382d dVar = new C28382d();
                    dVar.f71364e = true;
                    dVar.f71365f = 5;
                    dVar.f71366g = bitmap;
                    if (BytedCertManager.this.mCertInfo != null) {
                        dVar.mo101088a(BytedCertManager.this.mCertInfo.f71357g);
                    }
                    BytedCertManager.this.setFaceLiveCallback(faceLiveCallback);
                    BytedCertManager.this.setLiveInfo(dVar);
                    BytedCertManager.this.startFaceLive(context);
                    return;
                }
                faceLiveCallback.onFaceLiveFinish(checkModelAvailable);
            }
        });
    }

    public void doOCRInternal(String str, int i, Map<String, String> map, SDKCallBack.AbstractC28328a aVar) {
        C28399b.m104133a().mo101177a(aVar, str, i, map);
    }

    public void doRequest(String str, String str2, JSONObject jSONObject, SDKCallBack.AbstractC28328a aVar) {
        C28399b.m104133a().mo101181a(aVar, str, str2, jSONObject);
    }

    public void doOCR(final String str, final int i, final Map<String, String> map, final SDKCallBack.AbstractC28328a aVar) {
        doSDKInit(null, new SDKCallBack.AbstractC28328a() {
            /* class com.ss.android.bytedcert.manager.BytedCertManager.C283939 */

            @Override // com.ss.android.bytedcert.callback.SDKCallBack.AbstractC28328a
            /* renamed from: a */
            public void mo100863a(BDResponse bDResponse) {
                if (bDResponse != null && bDResponse.success) {
                    BytedCertManager.this.mActionInfo = new C28379a(bDResponse);
                    JSONObject jSONObject = bDResponse.jsonData;
                    if (jSONObject != null) {
                        String optString = jSONObject.optString("ticket");
                        if (!TextUtils.isEmpty(optString)) {
                            if (BytedCertManager.this.mCertInfo != null) {
                                BytedCertManager.this.mCertInfo.f71352b = optString;
                            }
                            C28399b.m104133a().mo101177a(aVar, str, i, map);
                            return;
                        }
                    }
                }
                BytedCertManager.this.resetStatus();
                BytedCertManager.getInstance().executeInMainThread(new Runnable() {
                    /* class com.ss.android.bytedcert.manager.BytedCertManager.C283939.RunnableC283941 */

                    public void run() {
                        aVar.mo100863a(new BDResponse(C28317a.C28318a.f71138b));
                    }
                });
            }
        });
    }

    public void doFaceLive(Activity activity, String str, String str2, SDKCallBack.FaceLiveCallback faceLiveCallback) {
        C28325d dVar;
        try {
            dVar = C28325d.m103926a(activity, activity.getApplication().getString(R.string.byted_loading_text));
        } catch (Exception e) {
            e.printStackTrace();
            dVar = null;
        }
        doFaceLive(activity, dVar, str, str2, faceLiveCallback);
    }

    public void doFaceLiveInternal(Context context, String str, String str2, SDKCallBack.FaceLiveCallback faceLiveCallback) {
        if (!this.mIsCertStart || !this.mIsFaceFromInternal) {
            this.mIsCertStart = true;
            this.mIsFaceFromInternal = true;
            this.mFaceStartTime = System.currentTimeMillis();
            doFaceLiveInternal(context, null, str, str2, faceLiveCallback);
            return;
        }
        faceLiveCallback.onFaceLiveFinish(new BDResponse(C28317a.C28318a.f71156t));
    }

    public void doFaceLive(final Context context, final AbstractC28322b bVar, final String str, final String str2, final SDKCallBack.FaceLiveCallback faceLiveCallback) {
        this.mIsFaceFromInternal = false;
        this.mFaceStartTime = System.currentTimeMillis();
        if (bVar != null) {
            try {
                bVar.mo100921a();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        doSDKInit(context, new SDKCallBack.AbstractC28328a() {
            /* class com.ss.android.bytedcert.manager.BytedCertManager.C283917 */

            @Override // com.ss.android.bytedcert.callback.SDKCallBack.AbstractC28328a
            /* renamed from: a */
            public void mo100863a(BDResponse bDResponse) {
                BytedCertManager.this.mFaceInitTime = System.currentTimeMillis() - BytedCertManager.this.mFaceStartTime;
                if (bDResponse != null && bDResponse.success) {
                    BytedCertManager.this.mActionInfo = new C28379a(bDResponse);
                    JSONObject jSONObject = bDResponse.jsonData;
                    if (jSONObject != null) {
                        String optString = jSONObject.optString("ticket");
                        if (!TextUtils.isEmpty(optString) && context != null) {
                            if (BytedCertManager.this.mCertInfo != null) {
                                BytedCertManager.this.mCertInfo.f71352b = optString;
                            }
                            BytedCertManager.this.doFaceLiveInternal(context, bVar, str, str2, faceLiveCallback);
                            return;
                        }
                    }
                }
                BytedCertManager.this.mIsCertStart = false;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("during_query_init", BytedCertManager.this.mFaceInitTime);
                    C28432b.m104206a("cert_start_face_live", bDResponse, null, jSONObject2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                AbstractC28322b bVar = bVar;
                if (bVar != null) {
                    bVar.mo100922b();
                }
                if (bDResponse == null) {
                    faceLiveCallback.onFaceLiveFinish(new BDResponse(C28317a.C28318a.f71138b));
                } else {
                    faceLiveCallback.onFaceLiveFinish(bDResponse);
                }
            }
        });
    }

    public JSONObject convertOCRData(Context context, int i, String str, int i2, int i3) {
        try {
            String a = C28349b.m103985a(str, i2, i3);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("status_code", i);
            jSONObject.put("message", "");
            if (context != null) {
                jSONObject2.put("camera_valid", C28440f.m104232a(context));
            }
            if (i == 0) {
                BytedCertManager instance = getInstance();
                jSONObject2.put("image_b64", a);
                jSONObject2.put("stay_inner_time", instance.mImgTimeDelta + "");
                jSONObject2.put("upload_type", instance.mImgType);
            }
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void doFaceLiveInternal(final Context context, final AbstractC28322b bVar, String str, String str2, final SDKCallBack.FaceLiveCallback faceLiveCallback) {
        if (context == null) {
            resetStatus();
            faceLiveCallback.onFaceLiveFinish(new BDResponse(C28317a.C28318a.f71138b));
            return;
        }
        setGLPause(false);
        setSDKRunningFlag(1);
        setHttpAllow(true);
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            this.mCertInfo.f71354d = str;
            hashMap.put("identity_code", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.mCertInfo.f71355e = str2;
            hashMap.put("identity_name", str2);
        }
        C28399b.m104133a().mo101180a(new SDKCallBack.AbstractC28328a() {
            /* class com.ss.android.bytedcert.manager.BytedCertManager.C283928 */

            @Override // com.ss.android.bytedcert.callback.SDKCallBack.AbstractC28328a
            /* renamed from: a */
            public void mo100863a(BDResponse bDResponse) {
                BytedCertManager.this.mFaceLiveTime = System.currentTimeMillis() - BytedCertManager.this.mFaceStartTime;
                AbstractC28322b bVar = bVar;
                if (bVar != null) {
                    bVar.mo100922b();
                }
                if (BytedCertManager.this.mFaceLiveInterruptListener != null && BytedCertManager.this.mFaceLiveInterruptListener.mo100935a()) {
                    BytedCertManager.this.reportFaceLiveTime(bDResponse);
                    BytedCertManager.this.resetStatus();
                    faceLiveCallback.onFaceLiveFinish(new BDResponse(C28317a.C28318a.f71139c));
                } else if (bDResponse.success) {
                    BytedCertManager.this.onWebReqEvent(true);
                    C28382d dVar = new C28382d(bDResponse);
                    BytedCertManager.this.setFaceLiveCallback(faceLiveCallback);
                    BytedCertManager.this.setLiveInfo(dVar);
                    BytedCertManager.this.startFaceLive(context);
                } else {
                    BytedCertManager.this.reportFaceLiveTime(bDResponse);
                    BytedCertManager.this.onWebReqEvent(false);
                    BytedCertManager.this.resetStatus();
                    faceLiveCallback.onFaceLiveFinish(bDResponse);
                }
            }
        }, "GET", C28320c.m103917f(), hashMap);
    }

    public void doManualCheck(String str, String str2, String str3, int i, Map<String, String> map, SDKCallBack.AbstractC28328a aVar) {
        C28399b.m104133a().mo101179a(aVar, str, str2, str3, i, map);
    }
}
