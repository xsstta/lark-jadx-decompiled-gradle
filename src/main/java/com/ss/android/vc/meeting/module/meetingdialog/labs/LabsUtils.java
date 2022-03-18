package com.ss.android.vc.meeting.module.meetingdialog.labs;

import android.app.ActivityManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import androidx.p034e.p035a.C0978a;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60781t;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.dependency.AbstractC60888d;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.FeaturePerfConfig;
import com.ss.android.vc.entity.background.BeautyConfig;
import com.ss.android.vc.entity.background.C60935a;
import com.ss.android.vc.entity.background.FileStatus;
import com.ss.android.vc.entity.background.MaterialSource;
import com.ss.android.vc.entity.background.MeetingBackground;
import com.ss.android.vc.entity.background.VirtualBackgroundInfo;
import com.ss.android.vc.entity.response.SetVcVirtualBackgroundEntity;
import com.ss.android.vc.irtc.RtcDevicePerfInfo;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.admin.VideoChatAdminSettings;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.VCSettingsService;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.service.VideoChatManager;
import com.ss.android.vc.statistics.event.C63732ac;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@XClass(isStatic = true)
public class LabsUtils {

    /* renamed from: a */
    public static C62294s f156285a = null;

    /* renamed from: b */
    static Boolean f156286b = null;

    /* renamed from: c */
    static final Object f156287c = new Object();

    /* renamed from: d */
    private static int f156288d = -1;

    /* renamed from: e */
    private static long f156289e = System.currentTimeMillis();

    /* renamed from: f */
    private static final String[] f156290f = {".jpg", ".jpeg", ".png"};

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils$a */
    public interface AbstractC62208a {
        /* renamed from: a */
        void mo215195a(String str);

        /* renamed from: a */
        void mo215196a(String str, String str2, String str3, int i, int[] iArr, String[] strArr, int i2, String str4);
    }

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils$b */
    public interface AbstractC62209b extends AbstractC62208a {
        /* renamed from: a */
        void mo215197a(boolean z);

        /* renamed from: b */
        void mo215198b(String str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m242896a(DialogInterface dialogInterface, int i) {
    }

    /* renamed from: a */
    public static boolean m242901a() {
        int i;
        if (!m242914f() || (i = f156288d) == 1) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        boolean z = C57744a.m224104a().getBoolean("vc_labs_guide_dismissed", false);
        f156288d = z ? 1 : 0;
        return !z ? 1 : 0;
    }

    /* renamed from: a */
    public static boolean m242902a(LabsScene labsScene) {
        return labsScene == LabsScene.LABS_SETTING_PAGE && C63634c.m249496b("byteview.meeting.android.background_decorate") && VideoChatAdminSettings.m239424g() && VideoChatAdminSettings.m239431j();
    }

    /* renamed from: a */
    public static boolean m242903a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : f156290f) {
            if (str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m242904a(String str, String str2, int i, int i2) {
        C60700b.m235851b("LabsUtils", "[trimImage]", "[src]" + str + "  [dst]" + str2 + "  [width]" + i + "  [height]" + i2);
        Bitmap a = m242891a(str, i, i2);
        if (a == null) {
            C60700b.m235864f("LabsUtils", "[trimImage2]", "load src image failed");
            return false;
        }
        try {
            a.compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(str2));
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: d */
    public static String m242912d() {
        String a = C60781t.m236220a();
        new File(a).mkdirs();
        return a;
    }

    /* renamed from: j */
    public static boolean m242918j() {
        AbstractC60888d appEnvDependency = VideoChatModuleDependency.getAppEnvDependency();
        if (appEnvDependency != null) {
            return appEnvDependency.mo196332b();
        }
        return false;
    }

    /* renamed from: b */
    public static void m242906b() {
        f156288d = 1;
        C57744a.m224104a().putBoolean("vc_labs_guide_dismissed", true);
    }

    /* renamed from: c */
    public static List<VirtualBackgroundInfo> m242909c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VirtualBackgroundInfo.newDisabled());
        arrayList.add(VirtualBackgroundInfo.newBlur());
        return arrayList;
    }

    /* renamed from: g */
    public static boolean m242915g() {
        boolean b = C63634c.m249496b("byteview.meeting.android.touchup");
        C60700b.m235858d("LabsUtils", "[isTouchUpEnable]", "touchup fg: " + b);
        return b;
    }

    /* renamed from: h */
    public static boolean m242916h() {
        boolean b = C63634c.m249496b("byteview.meeting.android.filter");
        C60700b.m235858d("LabsUtils", "[isFilterEnable]", "filter fg: " + b);
        return b;
    }

    /* renamed from: l */
    public static void m242920l() {
        if (m242919k()) {
            C62269o.m243188f();
        } else {
            C62269o.m243179b();
        }
        C62228c.m243019c();
    }

    /* renamed from: f */
    public static boolean m242914f() {
        boolean b = C63634c.m249496b("byteview.meeting.android.vc_labs");
        C60700b.m235858d("LabsUtils", "[isLabsEnable]", "labs fg: " + b);
        if (!b || (!m242919k() && !m242917i() && !m242916h() && !m242915g())) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m242917i() {
        boolean b = C63634c.m249496b("byteview.meeting.android.animoji");
        boolean j = m242918j();
        boolean h = VideoChatAdminSettings.m239426h();
        C60700b.m235858d("LabsUtils", "[isAnimojiEnable]", "animoji fg: " + b + ", isGooglePlayApk: " + j + ", admin: " + h);
        if (!b || j || !h) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m242919k() {
        boolean b = C63634c.m249496b("byteview.meeting.android.virtual_background");
        boolean f = VideoChatAdminSettings.m239420f();
        C60700b.m235858d("LabsUtils", "isVirtualBackgroundEnable", "background fg: " + b + ", admin: " + f);
        if (!b || !f) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static String m242921m() {
        VcISVSettingConfig parse = VcISVSettingConfig.parse(VCSettingsService.getSettings("vc_isv_lingchan_appid"));
        if (VideoChatModuleDependency.getAppEnvDependency().mo196333c()) {
            if (parse == null || TextUtils.isEmpty(parse.appLinkOversea)) {
                return "";
            }
            return parse.appLinkOversea;
        } else if (parse == null || TextUtils.isEmpty(parse.appLink)) {
            return "";
        } else {
            return parse.appLink;
        }
    }

    /* renamed from: e */
    public static boolean m242913e() {
        C60700b.m235851b("LabsUtils", "[isMeetEffectPerfConfig]", String.valueOf(f156286b));
        Boolean bool = f156286b;
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (f156287c) {
            Boolean bool2 = f156286b;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            FeaturePerfConfig b = VideoChatManager.m249444a().mo220133k().mo211941b();
            RtcDevicePerfInfo rtcDevicePerfInfo = null;
            try {
                rtcDevicePerfInfo = C61237h.m238223a().mo210484D();
            } catch (UnsatisfiedLinkError e) {
                C60700b.m235864f("LabsUtils", "[isMeetEffectPerfConfig2]", e.getMessage());
            }
            C60700b.m235851b("LabsUtils", "[isMeetEffectPerfConfig3]", "isMeetEffectPerfConfig " + b + " " + rtcDevicePerfInfo);
            if (b == null || !b.isValid() || rtcDevicePerfInfo == null) {
                f156286b = false;
                return false;
            }
            if (rtcDevicePerfInfo.memory < 0.001f) {
                ActivityManager activityManager = (ActivityManager) ar.m236694a().getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                try {
                    activityManager.getMemoryInfo(memoryInfo);
                } catch (Exception e2) {
                    C60700b.m235864f("LabsUtils", "[isMeetEffectPerfConfig]", e2.getMessage());
                }
                rtcDevicePerfInfo.memory = (float) ((int) Math.ceil(((double) memoryInfo.totalMem) / 1.073741824E9d));
                C60700b.m235851b("LabsUtils", "[isMeetEffectPerfConfig4]", "memory-" + rtcDevicePerfInfo.memory);
            }
            for (FeaturePerfConfig.Effect effect : b.sstatic.effect) {
                if (rtcDevicePerfInfo.cpuCores >= effect.cpuCores && rtcDevicePerfInfo.cpuFrequency >= effect.cpuFrequency && rtcDevicePerfInfo.memory >= ((float) effect.memory) && rtcDevicePerfInfo.cpuThreads >= effect.cpuThreads) {
                    f156286b = true;
                    return true;
                }
            }
            f156286b = false;
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m242908b(LabsScene labsScene) {
        return VideoChatAdminSettings.m239424g();
    }

    /* renamed from: b */
    public static String m242905b(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: a */
    public static void m242895a(Context context) {
        C60735ab.m236001a(new Runnable(context) {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$LabsUtils$XeJJ4YsDde0q9dw6CcTySgg_c */
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                LabsUtils.m242907b(this.f$0);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m242907b(Context context) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("context is null:");
        if (context == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C60700b.m235851b("LabsUtils", "[showOversizeDialog]", sb.toString());
        VCDialogUtils.m236189a(context, UIHelper.mustacheFormat((int) R.string.View_VM_UnableToAddLargeFiles, "number", Integer.toString(15)), 2, (int) R.string.View_G_ConfirmButton, (DialogInterface.OnClickListener) $$Lambda$LabsUtils$wdiIh1tO4Fh_mtOguoFMqElNGWQ.INSTANCE, false);
    }

    /* renamed from: c */
    public static boolean m242910c(String str) {
        long d = (m242911d(str) / 1024) / 1024;
        C60700b.m235851b("LabsUtils", "[isOverSize]", " size = " + d + "MB");
        if (d >= 15) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static long m242911d(String str) {
        File file = new File(str);
        if (file.exists()) {
            try {
                return (long) new FileInputStream(file).available();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } else {
            C60700b.m235861e("LabsUtils", "[getFileSize]", "file not exist, path = " + str);
            return 0;
        }
    }

    /* renamed from: a */
    public static void m242897a(Intent intent) {
        if (intent == null) {
            C60700b.m235851b("LabsUtils", "[sendUploadVirtualBg]", "data is null");
            return;
        }
        C60700b.m235851b("LabsUtils", "[sendUploadVirtualBg2]", "data is not null");
        Intent intent2 = new Intent("upload_virtual_background");
        String photoPickerKeySelectedPhotos = VideoChatModule.getDependency().getPhotoPickerKeySelectedPhotos();
        intent2.putExtra(photoPickerKeySelectedPhotos, intent.getStringArrayListExtra(photoPickerKeySelectedPhotos));
        C0978a.m4782a(ar.m236694a()).mo4992a(intent2);
    }

    @XMethod
    public static synchronized C62294s getSetting(boolean z) {
        synchronized (LabsUtils.class) {
            C60700b.m235851b("LabsUtils", "[getSettings]", "getSettings");
            C62294s sVar = f156285a;
            if (sVar != null && z) {
                return sVar;
            }
            f156285a = new C62294s();
            String settings = VCSettingsService.getSettings("vc_virtual_background_images");
            if (TextUtils.isEmpty(settings)) {
                settings = "";
            }
            String settings2 = VCSettingsService.getSettings("vc_lab_default_values_config");
            if (TextUtils.isEmpty(settings2)) {
                settings2 = "";
            }
            C60700b.m235843a("LabsUtils", "[getSettings2]", "background config: " + settings + ", beauty config: " + settings2);
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(settings)) {
                try {
                    JSONArray jSONArray = new JSONArray(settings);
                    StringBuilder sb = new StringBuilder("images are: ");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        String optString = jSONObject.optString("name");
                        String optString2 = jSONObject.optString("url");
                        String optString3 = jSONObject.optString("portraitUrl");
                        sb.append(optString);
                        sb.append("; ");
                        if (m242903a(optString2)) {
                            arrayList.add(new MeetingBackground(MeetingBackground.Type.IMAGE, optString, optString2, optString3, MaterialSource.APP_SETTINGS));
                        }
                    }
                    C60700b.m235851b("LabsUtils", "[getSettings3]", "get images from settings, " + sb.toString());
                } catch (JSONException unused) {
                    C60700b.m235864f("LabsUtils", "[getSettings4]", "parse background json error!!! config = " + settings);
                }
            }
            f156285a.f156524a = arrayList;
            if (!TextUtils.isEmpty(settings2)) {
                try {
                    int i2 = new JSONObject(settings2).getJSONObject("mobileFaceBeauty").getInt("coefficient");
                    f156285a.f156525b = new BeautyConfig();
                    f156285a.f156525b.mobileFaceBeauty = new BeautyConfig.C60934a();
                    f156285a.f156525b.mobileFaceBeauty.f152481a = i2;
                } catch (JSONException unused2) {
                    C60700b.m235864f("LabsUtils", "[getSettings5]", "parse beauty config json error!!! config = " + settings);
                }
            }
            return f156285a;
        }
    }

    /* renamed from: a */
    public static void m242899a(C61303k kVar) {
        C60700b.m235851b("LabsUtils", "[unload]", "meeting = " + kVar);
        C62269o.m243183c();
        if (kVar == null) {
            C61237h.m238223a().mo210528b("default");
        }
    }

    /* renamed from: a */
    public static void m242900a(boolean z) {
        C62228c.m243013a(z);
        final boolean k = m242919k();
        C60700b.m235851b("LabsUtils", "[initLabEffects]", "[byAccountChanged]" + z + "  [background]" + k + "  [meet]");
        if (!k) {
            C61237h.m238223a().mo210549h(false);
            C61237h.m238223a().mo210542f("");
        }
        if (k) {
            C62269o.m243181b(!z, new AbstractC63598b<C62260i>() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils.C622072 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("LabsUtils", "[initLabsEffect5]", " error: " + eVar);
                }

                /* renamed from: a */
                public void onSuccess(C62260i iVar) {
                    String str;
                    boolean z;
                    List<VirtualBackgroundInfo> list;
                    VirtualBackgroundInfo virtualBackgroundInfo = null;
                    if (iVar == null || iVar.f156428b == null || iVar.f156428b.video == null) {
                        str = null;
                        z = false;
                    } else {
                        z = iVar.f156428b.video.backgroundBlur;
                        str = iVar.f156428b.video.virtualBackground;
                    }
                    C60700b.m235851b("LabsUtils", "[initLabsEffects2]", " load succeed:  [blur]" + z + "  [background]" + str);
                    if (!k) {
                        return;
                    }
                    if (z) {
                        C61237h.m238223a().mo210549h(true);
                    } else if (!TextUtils.isEmpty(str)) {
                        if (iVar == null) {
                            list = null;
                        } else {
                            list = iVar.f156427a;
                        }
                        if (!CollectionUtils.isEmpty(list)) {
                            Iterator<VirtualBackgroundInfo> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                VirtualBackgroundInfo next = it.next();
                                if (!next.isPreset() && TextUtils.equals(next.key, str)) {
                                    virtualBackgroundInfo = next;
                                    break;
                                }
                            }
                        }
                        if (virtualBackgroundInfo != null) {
                            String path = virtualBackgroundInfo.getPath();
                            File parentFile = new File(path).getParentFile();
                            if (parentFile == null || !parentFile.isDirectory() || parentFile.list() == null || parentFile.list().length <= 0) {
                                C60700b.m235851b("LabsUtils", "[initLabsEffects4]", "virtual background path. parentFile is empty.");
                                C61237h.m238223a().mo210542f("");
                                C62269o.m243178b(false);
                                return;
                            }
                            C61237h.m238223a().mo210542f(path);
                            C60700b.m235851b("LabsUtils", "[initLabsEffects3]", "virtual background path: " + path);
                            return;
                        }
                        C61237h.m238223a().mo210542f("");
                    } else {
                        C61237h.m238223a().mo210542f("");
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m242894a(int i, Intent intent) {
        if (i == VideoChatModule.getDependency().getPhotoPickerReqCode()) {
            m242897a(intent);
        }
    }

    /* renamed from: a */
    public static VirtualBackgroundInfo m242892a(List<VirtualBackgroundInfo> list, String str) {
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        for (VirtualBackgroundInfo virtualBackgroundInfo : list) {
            if (!virtualBackgroundInfo.isPreset() && TextUtils.equals(virtualBackgroundInfo.key, str)) {
                return virtualBackgroundInfo;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Bitmap m242891a(String str, int i, int i2) {
        C60700b.m235851b("LabsUtils", "[loadBitmap]", "[path]" + str + "  [width]" + i + "  [height]" + i2);
        try {
            return (Bitmap) ((C2124f) ComponentCallbacks2C2115c.m9151c(ar.m236694a()).mo10430i().mo10396a(str).mo11150h()).mo10400a(i, i2).get();
        } catch (Throwable th) {
            th.printStackTrace();
            C60700b.m235864f("LabsUtils", "[loadBitmap2]", "failed: " + th);
            return null;
        }
    }

    /* renamed from: a */
    public static void m242898a(Intent intent, final Context context, final AbstractC63598b<SetVcVirtualBackgroundEntity> bVar) {
        if (intent == null) {
            C60700b.m235851b("LabsUtils", "[handleSelectedPhoto]", "data is null");
        } else if (System.currentTimeMillis() - f156289e < 500) {
            C60700b.m235844a("LabsUtils", "[handleSelectedPhoto2]", "time limit", 200);
        } else {
            f156289e = System.currentTimeMillis();
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra(VideoChatModule.getDependency().getPhotoPickerKeySelectedPhotos());
            if (CollectionUtils.isEmpty(stringArrayListExtra)) {
                C60700b.m235851b("LabsUtils", "[handleSelectedPhoto3]", " photos is empty");
                return;
            }
            final String str = stringArrayListExtra.get(0);
            C60700b.m235851b("LabsUtils", "[handleSelectedPhoto4]", " photoStr = " + str);
            C60735ab.m236018e(new Runnable() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils.RunnableC622051 */

                public void run() {
                    if (LabsUtils.m242910c(str)) {
                        C63732ac.m249951a((C61303k) null, FileStatus.FileSizeLimit);
                        LabsUtils.m242895a(context);
                        return;
                    }
                    C60700b.m235851b("LabsUtils", "[handleSelectedPhoto5]", "before decodeFile");
                    Bitmap decodeFile = BitmapFactory.decodeFile(str);
                    C60700b.m235851b("LabsUtils", "[handleSelectedPhoto6]", "after decodeFile");
                    if (decodeFile != null) {
                        String a = LabsUtils.m242893a(decodeFile, context, 3072, 15360);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new C60935a(a, String.valueOf(System.currentTimeMillis()), MaterialSource.APP_ANDROID));
                        VcBizSender.m249282g(arrayList).mo219889a(new AbstractC63598b<SetVcVirtualBackgroundEntity>() {
                            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils.RunnableC622051.C622061 */

                            /* renamed from: a */
                            public void onSuccess(SetVcVirtualBackgroundEntity setVcVirtualBackgroundEntity) {
                                bVar.onSuccess(setVcVirtualBackgroundEntity);
                            }

                            @Override // com.ss.android.vc.net.request.AbstractC63598b
                            public void onError(C63602e eVar) {
                                bVar.onError(eVar);
                            }
                        });
                        decodeFile.recycle();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static String m242893a(Bitmap bitmap, Context context, long j, long j2) {
        if (bitmap == null) {
            return null;
        }
        C60700b.m235843a("LabsUtils", "[bitmap2Png]", "===compress start===");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        int i = 90;
        long length = (long) (byteArrayOutputStream.toByteArray().length / 1024);
        C60700b.m235851b("LabsUtils", "[bitmap2Png2]", "fileSize size = " + length + "KB, upperSize = " + j2 + "KB");
        long j3 = length / j;
        if (j3 > 5) {
            i = 20;
        } else if (j3 > 4) {
            i = 25;
        } else if (j3 > 3) {
            i = 30;
        } else if (j3 > 2) {
            i = 50;
        }
        while (length > j && i > 0) {
            byteArrayOutputStream.reset();
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            C60700b.m235843a("LabsUtils", "[bitmap2Png3]", "=compress to origin=" + i + "%");
            i += -10;
            length = (long) (byteArrayOutputStream.toByteArray().length / 1024);
        }
        C60700b.m235843a("LabsUtils", "[bitmap2Png4]", "===compress end===");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        File externalFilesDir = ar.m236694a().getExternalFilesDir(null);
        File file = new File(externalFilesDir, System.currentTimeMillis() + ".png");
        if (!file.exists() && file.mkdir()) {
            C60700b.m235843a("LabsUtils", "[bitmap2Png5]", file.getName() + ", mkdir success");
        }
        File file2 = new File(file, System.currentTimeMillis() + ".jpg");
        try {
            C60700b.m235843a("LabsUtils", "[bitmap2Png6]", "==save at SD==");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            int available = byteArrayInputStream.available();
            byte[] bArr = new byte[byteArrayInputStream.available()];
            while (true) {
                int read = byteArrayInputStream.read(bArr, 0, available);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            byteArrayInputStream.close();
            C60700b.m235843a("LabsUtils", "[bitmap2Png7]", "==save at SD success==");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file2.getAbsolutePath();
    }
}
