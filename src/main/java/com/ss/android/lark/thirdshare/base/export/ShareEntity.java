package com.ss.android.lark.thirdshare.base.export;

import android.app.Application;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.apm.ApmAgent;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.thirdshare.base.C55680a;
import com.ss.android.lark.thirdshare.base.export.OnShareCallback;
import com.ss.android.lark.thirdshare.base.export.p2739a.AbstractC55699a;
import com.ss.android.lark.thirdshare.base.export.p2739a.AbstractC55700b;
import com.ss.android.lark.thirdshare.base.export.p2742d.C55720a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.PackageChannelManager;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.aj;
import java.io.File;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class ShareEntity implements Serializable {
    private Map<ShareActionType, String> answerTypes;
    private String appId;
    private String appPath;
    private transient OnShareCallback callback;
    private String content;
    private String contentType;
    private File coverFile;
    private ShareActionType curActionType;
    private String downgradeContent;
    private SerRunnable imageDebugRunnable;
    private ImageDowngradePanel imageDowngradePanel;
    private File imageFile;
    private Class<? extends OnShareCallback> ipcShareCallbackClass;
    private int miniProgramType;
    private ArrayList<ShareActionType> shareActionTypes;
    private ArrayList<OnShareCallback.ShareError> shareErrors;
    private String targetUrl;
    private SerRunnable textDebugRunnable;
    private TextDowngradePanel textDowngradePanel;
    private String title;
    private String traceId;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ContentType {
    }

    public static class ImageDowngradePanel implements Serializable {
        private String downgradePanelTitle;
        private boolean isNeedSave2Album;

        public String getDowngradePanelTitle() {
            return this.downgradePanelTitle;
        }

        public boolean isNeedSave2Album() {
            return this.isNeedSave2Album;
        }

        public ImageDowngradePanel(String str, boolean z) {
            this.downgradePanelTitle = str;
            this.isNeedSave2Album = z;
        }
    }

    public static class TextDowngradePanel implements Serializable {
        private String downgradePanelCopyContent;
        private String downgradePanelTitle;

        public String getDowngradePanelCopyContent() {
            return this.downgradePanelCopyContent;
        }

        public String getDowngradePanelTitle() {
            return this.downgradePanelTitle;
        }

        public TextDowngradePanel(String str, String str2) {
            this.downgradePanelTitle = str;
            this.downgradePanelCopyContent = str2;
        }
    }

    public Map<ShareActionType, String> getAnswerTypes() {
        return this.answerTypes;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppPath() {
        return this.appPath;
    }

    public OnShareCallback getCallback() {
        return this.callback;
    }

    public String getContent() {
        return this.content;
    }

    public String getContentType() {
        return this.contentType;
    }

    public File getCoverFile() {
        return this.coverFile;
    }

    public String getDowngradeContent() {
        return this.downgradeContent;
    }

    public Runnable getImageDebugRunnable() {
        return this.imageDebugRunnable;
    }

    public ImageDowngradePanel getImageDowngradePanel() {
        return this.imageDowngradePanel;
    }

    public File getImageFile() {
        return this.imageFile;
    }

    public int getMiniProgramType() {
        return this.miniProgramType;
    }

    public String getTargetUrl() {
        return this.targetUrl;
    }

    public Runnable getTextDebugRunnable() {
        return this.textDebugRunnable;
    }

    public TextDowngradePanel getTextDowngradePanel() {
        return this.textDowngradePanel;
    }

    public String getTitle() {
        return this.title;
    }

    /* renamed from: com.ss.android.lark.thirdshare.base.export.ShareEntity$a */
    public static class C55696a {

        /* renamed from: a */
        public String f137370a;

        /* renamed from: b */
        public String f137371b;

        /* renamed from: c */
        public File f137372c;

        /* renamed from: d */
        public String f137373d;

        /* renamed from: e */
        public String f137374e;

        /* renamed from: f */
        public String f137375f;

        /* renamed from: g */
        public String f137376g;

        /* renamed from: h */
        public File f137377h;

        /* renamed from: i */
        public String f137378i;

        /* renamed from: j */
        public String f137379j;

        /* renamed from: k */
        public int f137380k;

        /* renamed from: l */
        public OnShareCallback f137381l;

        /* renamed from: m */
        public ArrayList<ShareActionType> f137382m;

        /* renamed from: n */
        public Map<ShareActionType, String> f137383n;

        /* renamed from: o */
        public Class<? extends OnShareCallback> f137384o;

        /* renamed from: p */
        public ArrayList<OnShareCallback.ShareError> f137385p;

        /* renamed from: q */
        public TextDowngradePanel f137386q;

        /* renamed from: r */
        public ImageDowngradePanel f137387r;

        public C55696a(String str, String str2, String str3, String str4, Bitmap bitmap) {
            this.f137382m = new ArrayList<>();
            this.f137385p = new ArrayList<>();
            mo189774a(str, str2, str3, str4, bitmap);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo189774a(String str, String str2, String str3, String str4, Bitmap bitmap) {
            if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str3)) {
                this.f137370a = "web_url";
                this.f137373d = str;
                this.f137374e = str2;
                this.f137375f = str3;
                this.f137376g = str4;
                if (bitmap == null) {
                    return;
                }
                if (bitmap.isRecycled()) {
                    C55720a.m215798a("cover is recycled.");
                } else {
                    this.f137377h = C55680a.m215697a(bitmap, C57881t.m224649u(aj.m224263a()));
                }
            } else {
                C55720a.m215799b("title and targetUrl is illegal");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo189773a(String str) {
            if (TextUtils.isEmpty(str)) {
                C55720a.m215799b("content is illegal");
                return;
            }
            this.f137370a = "text";
            this.f137374e = str;
            this.f137376g = str;
        }

        /* renamed from: c */
        private String m215720c() {
            Application a = aj.m224263a();
            if (PackageChannelManager.isKABuildPackage(a)) {
                return PackageChannelManager.getBuildPackageChannel(a);
            }
            return "Release";
        }

        /* renamed from: b */
        public void mo189777b() {
            if (this.f137381l != null) {
                ShareActionType shareActionType = ShareActionType.UNKNOWN;
                if (this.f137382m.size() == 1) {
                    shareActionType = this.f137382m.get(0);
                }
                Iterator<OnShareCallback.ShareError> it = this.f137385p.iterator();
                while (it.hasNext()) {
                    this.f137381l.onFailed(shareActionType, it.next());
                }
            }
        }

        /* renamed from: d */
        private void m215723d() {
            if (this.f137382m.contains(ShareActionType.SAVE) && !"image".equals(this.f137370a)) {
                C55720a.m215799b(OnShareCallback.ILLEGAL_CONFIG_PARAM.toString("only ContentType is image support save."));
                this.f137385p.add(OnShareCallback.ILLEGAL_CONFIG_PARAM);
                this.f137382m.remove(ShareActionType.SAVE);
            }
            if (this.f137382m.contains(ShareActionType.COPY) && !"text".equals(this.f137370a) && !"web_url".equals(this.f137370a)) {
                C55720a.m215799b(OnShareCallback.ILLEGAL_CONFIG_PARAM.toString("only ContentType is text or webUrl support copy."));
                this.f137385p.add(OnShareCallback.ILLEGAL_CONFIG_PARAM);
                this.f137382m.remove(ShareActionType.COPY);
            }
            if ("image".equals(this.f137370a) && this.f137387r == null) {
                this.f137387r = new ImageDowngradePanel(UIHelper.getString(R.string.Lark_Invitation_ShareViaWeChat_ImageCreatedAndSaved), true);
            }
            if (("text".equals(this.f137370a) || "web_url".equals(this.f137370a)) && this.f137386q == null) {
                this.f137386q = new TextDowngradePanel(UIHelper.getString(R.string.Lark_Invitation_InviteViaWeChat_General_Title), this.f137374e);
            }
        }

        /* renamed from: a */
        public ShareEntity mo189769a() {
            if (aj.m224263a().getPackageName().contains("com.larksuite.suite")) {
                mo189768a(Collections.singletonList(ShareActionType.SYS));
                this.f137371b = "unknown";
                return new ShareEntity(this);
            }
            if (!TextUtils.isEmpty(this.f137371b)) {
                AbstractC55700b dep = ((AbstractC55699a) ApiUtils.getApi(AbstractC55699a.class)).getDep();
                if (dep != null) {
                    Map<String, ShareRemoteConfig> b = dep.mo189816b();
                    if (b != null) {
                        Log.m165389i("ThirdShare", "share remote config is: " + b.toString());
                        ShareRemoteConfig shareRemoteConfig = b.get(this.f137371b + "." + m215720c());
                        if (shareRemoteConfig == null) {
                            shareRemoteConfig = b.get(this.f137371b);
                        }
                        if (shareRemoteConfig != null) {
                            Log.m165389i("ThirdShare", shareRemoteConfig.toString());
                            m215721c(shareRemoteConfig);
                        } else {
                            this.f137385p.add(OnShareCallback.ILLEGAL_CONFIG_PARAM);
                            OnShareCallback.ShareError shareError = OnShareCallback.ILLEGAL_CONFIG_PARAM;
                            C55720a.m215799b(shareError.toString(this.f137371b + " not found"));
                        }
                    } else {
                        this.f137385p.add(OnShareCallback.FETCH_REMOTE_CONFIG_FAILED);
                        C55720a.m215799b(OnShareCallback.FETCH_REMOTE_CONFIG_FAILED.toString());
                    }
                } else {
                    Log.m165389i("ThirdShare", "share base dep is null.");
                }
            }
            m215723d();
            mo189777b();
            return new ShareEntity(this);
        }

        /* renamed from: a */
        public C55696a mo189764a(OnShareCallback onShareCallback) {
            this.f137381l = onShareCallback;
            return this;
        }

        /* renamed from: a */
        public C55696a mo189765a(ImageDowngradePanel imageDowngradePanel) {
            this.f137387r = imageDowngradePanel;
            return this;
        }

        /* renamed from: c */
        private void m215721c(ShareRemoteConfig shareRemoteConfig) {
            this.f137382m = mo189770a(shareRemoteConfig);
            this.f137383n = mo189776b(shareRemoteConfig);
        }

        /* renamed from: a */
        public C55696a mo189766a(TextDowngradePanel textDowngradePanel) {
            this.f137386q = textDowngradePanel;
            return this;
        }

        public C55696a(Bitmap bitmap) {
            this.f137382m = new ArrayList<>();
            this.f137385p = new ArrayList<>();
            mo189771a(bitmap);
        }

        /* renamed from: a */
        public C55696a mo189768a(List<ShareActionType> list) {
            if (list != null) {
                this.f137382m = new ArrayList<>(list);
            } else {
                this.f137382m = new ArrayList<>();
            }
            return this;
        }

        public C55696a(File file) {
            this.f137382m = new ArrayList<>();
            this.f137385p = new ArrayList<>();
            mo189772a(file);
        }

        /* renamed from: c */
        private static boolean m215722c(String str) {
            if (!"ban".equals(str) && !"downgrade_to_system_share".equals(str) && !"downgrade_to_wakeup_by_tip".equals(str) && !"downgrade_to_system_share_by_specific_app".equals(str)) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public C55696a mo189775b(String str) {
            if (TextUtils.isEmpty(str)) {
                C55720a.m215799b("traceId is illegal");
                return this;
            }
            Log.m165389i("ThirdShare", "traceId: " + str);
            this.f137371b = str;
            return this;
        }

        public C55696a(String str) {
            this.f137382m = new ArrayList<>();
            this.f137385p = new ArrayList<>();
            mo189773a(str);
        }

        /* renamed from: a */
        public C55696a mo189767a(Class<? extends OnShareCallback> cls) {
            if (cls == null) {
                C55720a.m215799b("shareCallbackClass is null");
                return this;
            } else if (OnShareCallback.class.equals(cls)) {
                C55720a.m215799b("shareCallbackClass is illegal");
                return this;
            } else {
                this.f137384o = cls;
                try {
                    mo189764a((OnShareCallback) cls.newInstance());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e2) {
                    e2.printStackTrace();
                }
                if (this.f137381l == null) {
                    C55720a.m215799b("ipcShareCallbackClass newInstance failed");
                }
                return this;
            }
        }

        /* renamed from: b */
        public Map<ShareActionType, String> mo189776b(ShareRemoteConfig shareRemoteConfig) {
            HashMap hashMap = new HashMap();
            mo189770a(shareRemoteConfig);
            for (Map.Entry<String, String> entry : shareRemoteConfig.getAnswerTypes().entrySet()) {
                String key = entry.getKey();
                ShareActionType shareActionType = ShareActionType.getShareActionType(key, false);
                if (ShareActionType.UNKNOWN.equals(shareActionType)) {
                    this.f137385p.add(OnShareCallback.ILLEGAL_CONFIG_PARAM);
                    C55720a.m215799b(OnShareCallback.ILLEGAL_CONFIG_PARAM.toString(key + " is unknown ShareActionType."));
                } else if (!shareActionType.isThirdAppShareType()) {
                    this.f137385p.add(OnShareCallback.ILLEGAL_CONFIG_PARAM);
                    C55720a.m215799b(OnShareCallback.ILLEGAL_CONFIG_PARAM.toString(key + " is not support downgrade."));
                } else {
                    String value = entry.getValue();
                    if (TextUtils.isEmpty(value)) {
                        this.f137385p.add(OnShareCallback.ILLEGAL_CONFIG_PARAM);
                        C55720a.m215799b(OnShareCallback.ILLEGAL_CONFIG_PARAM.toString(value + " is empty."));
                    } else {
                        String[] split = value.split("\\|");
                        boolean z = true;
                        for (String str : split) {
                            if (m215722c(str)) {
                                this.f137385p.add(OnShareCallback.ILLEGAL_CONFIG_PARAM);
                                C55720a.m215799b(OnShareCallback.ILLEGAL_CONFIG_PARAM.toString(str + " is unknown ShareAnswerType."));
                                z = false;
                            }
                        }
                        if (z) {
                            hashMap.put(shareActionType, split[0]);
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: a */
        public ArrayList<ShareActionType> mo189770a(ShareRemoteConfig shareRemoteConfig) {
            ArrayList<ShareActionType> arrayList = new ArrayList<>();
            for (String str : shareRemoteConfig.getItems()) {
                if ("ban".equals(shareRemoteConfig.getAnswerTypes().get(str))) {
                    Log.m165389i("ThirdShare", str + " was banned");
                } else {
                    ShareActionType shareActionType = ShareActionType.getShareActionType(str, false);
                    if (ShareActionType.UNKNOWN.equals(shareActionType)) {
                        this.f137385p.add(OnShareCallback.ILLEGAL_CONFIG_PARAM);
                        OnShareCallback.ShareError shareError = OnShareCallback.ILLEGAL_CONFIG_PARAM;
                        C55720a.m215799b(shareError.toString(shareActionType + " is unknown ShareActionType."));
                    } else {
                        arrayList.add(shareActionType);
                    }
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo189771a(Bitmap bitmap) {
            if (bitmap == null || bitmap.isRecycled()) {
                C55720a.m215799b("image is illegal");
            } else {
                mo189772a(C55680a.m215697a(bitmap, C57881t.m224649u(aj.m224263a())));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo189772a(File file) {
            if (file == null || !file.exists()) {
                C55720a.m215799b("imageFile is illegal");
                return;
            }
            this.f137370a = "image";
            this.f137372c = file;
        }

        public C55696a(String str, String str2, String str3) {
            this.f137382m = new ArrayList<>();
            this.f137385p = new ArrayList<>();
            mo189774a(str, str2, str3, str2, null);
        }

        public C55696a(String str, String str2, String str3, String str4) {
            this.f137382m = new ArrayList<>();
            this.f137385p = new ArrayList<>();
            mo189774a(str, str2, str3, str4, null);
        }

        public C55696a(String str, String str2, String str3, File file, String str4) {
            this(str, str2, 0, str3, file, str4);
        }

        public C55696a(String str, String str2, String str3, Bitmap bitmap, String str4) {
            this(str, str2, str3, C55680a.m215697a(bitmap, C57881t.m224649u(aj.m224263a())), str4);
        }

        /* renamed from: a */
        private void m215719a(String str, String str2, int i, String str3, File file, String str4) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || file == null || !file.exists() || TextUtils.isEmpty(str4)) {
                C55720a.m215799b("mini app share param is illegal");
                return;
            }
            this.f137378i = str;
            this.f137379j = str2;
            this.f137380k = i;
            this.f137373d = str3;
            this.f137372c = file;
            this.f137375f = str4;
            this.f137370a = "mini_app";
        }

        public C55696a(String str, String str2, int i, String str3, File file, String str4) {
            this.f137382m = new ArrayList<>();
            this.f137385p = new ArrayList<>();
            m215719a(str, str2, i, str3, file, str4);
        }
    }

    public ShareActionType getCurActionType() {
        ShareActionType shareActionType = this.curActionType;
        if (shareActionType == null) {
            return ShareActionType.UNKNOWN;
        }
        return shareActionType;
    }

    public boolean isCrossProcess() {
        if (this.ipcShareCallbackClass != null) {
            return true;
        }
        return false;
    }

    public String getTraceId() {
        if (TextUtils.isEmpty(this.traceId)) {
            return "unknown";
        }
        return this.traceId;
    }

    public boolean isImageShare() {
        return "image".equals(this.contentType);
    }

    public boolean isMiniAppShare() {
        return "mini_app".equals(this.contentType);
    }

    public ArrayList<ShareActionType> getShareActionTypes() {
        ArrayList<ShareActionType> arrayList = this.shareActionTypes;
        if (arrayList != null && !arrayList.isEmpty()) {
            return new ArrayList<>(this.shareActionTypes);
        }
        ArrayList<ShareActionType> arrayList2 = new ArrayList<>();
        arrayList2.add(ShareActionType.SYS);
        return arrayList2;
    }

    public boolean isTextShare() {
        if ("text".equals(this.contentType) || "web_url".equals(this.contentType)) {
            return true;
        }
        return false;
    }

    public void processIpcShareCallback() {
        Class<? extends OnShareCallback> cls = this.ipcShareCallbackClass;
        if (cls == null) {
            Log.m165383e("ThirdShare", "ipcShareCallbackClass is null");
            return;
        }
        try {
            this.callback = (OnShareCallback) cls.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e2) {
            e2.printStackTrace();
        }
        if (this.callback == null) {
            C55720a.m215799b("ipcShareCallbackClass newInstance failed");
        } else {
            this.ipcShareCallbackClass = null;
        }
    }

    public void setCurActionType(ShareActionType shareActionType) {
        this.curActionType = shareActionType;
    }

    public void setImageDebugRunnable(SerRunnable serRunnable) {
        this.imageDebugRunnable = serRunnable;
    }

    public void setTextDebugRunnable(SerRunnable serRunnable) {
        this.textDebugRunnable = serRunnable;
    }

    public static abstract class SerRunnable implements Serializable, Runnable {
        public ShareEntity shareEntity;

        public SerRunnable(ShareEntity shareEntity2) {
            this.shareEntity = shareEntity2;
        }
    }

    public void setCallback(final OnShareCallback onShareCallback) {
        this.callback = new OnShareCallback() {
            /* class com.ss.android.lark.thirdshare.base.export.ShareEntity.C556951 */

            @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
            public void onSuccess(ShareActionType shareActionType) {
                OnShareCallback onShareCallback = onShareCallback;
                if (onShareCallback != null) {
                    onShareCallback.onSuccess(shareActionType);
                }
                try {
                    ApmAgent.monitorEvent("ug_share_component", new JSONObject().put("trace_id", ShareEntity.this.getTraceId()).put("succeed", true).put(ShareHitPoint.f121869d, ShareEntity.this.getContentType()).put("item", shareActionType.name()), null, null);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
            public void onFailed(ShareActionType shareActionType, OnShareCallback.ShareError shareError) {
                if (shareError == INTERCEPT_DOWNGRADE) {
                    Log.m165389i("ThirdShare", shareActionType.name() + ": " + shareError.getMsg());
                    return;
                }
                OnShareCallback onShareCallback = onShareCallback;
                if (onShareCallback != null) {
                    onShareCallback.onFailed(shareActionType, shareError);
                }
                try {
                    ApmAgent.monitorEvent("ug_share_component", new JSONObject().put("trace_id", ShareEntity.this.getTraceId()).put("succeed", false).put(ShareHitPoint.f121869d, ShareEntity.this.getContentType()).put("item", shareActionType.name()).put("error_code", shareError.getCode()), null, new JSONObject().put("error_msg", shareError.getMsg()));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    private ShareEntity(C55696a aVar) {
        this.traceId = aVar.f137371b;
        this.contentType = aVar.f137370a;
        this.imageFile = aVar.f137372c;
        this.title = aVar.f137373d;
        this.content = aVar.f137374e;
        this.targetUrl = aVar.f137375f;
        this.downgradeContent = aVar.f137376g;
        this.coverFile = aVar.f137377h;
        this.appId = aVar.f137378i;
        this.appPath = aVar.f137379j;
        this.miniProgramType = aVar.f137380k;
        setCallback(aVar.f137381l);
        this.shareActionTypes = aVar.f137382m;
        this.ipcShareCallbackClass = aVar.f137384o;
        this.answerTypes = aVar.f137383n;
        this.shareErrors = aVar.f137385p;
        this.textDowngradePanel = aVar.f137386q;
        this.imageDowngradePanel = aVar.f137387r;
    }
}
