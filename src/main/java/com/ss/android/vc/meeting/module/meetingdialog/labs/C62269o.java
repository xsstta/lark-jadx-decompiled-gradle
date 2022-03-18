package com.ss.android.vc.meeting.module.meetingdialog.labs;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.entity.AdminSettings;
import com.ss.android.vc.entity.C60999w;
import com.ss.android.vc.entity.background.MaterialSource;
import com.ss.android.vc.entity.background.MeetingBackground;
import com.ss.android.vc.entity.background.ViewDeviceSetting;
import com.ss.android.vc.entity.background.VirtualBackground;
import com.ss.android.vc.entity.background.VirtualBackgroundInfo;
import com.ss.android.vc.meeting.model.C61371a;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62216c;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.AnimojiEffect;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.BeautifyEffect;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.BeautifyStyleEffect;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.FilterEffect;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.VCSyncGetService;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.o */
public class C62269o implements AbstractC62216c.AbstractC62217a {

    /* renamed from: b */
    public static volatile VirtualBackgroundInfo f156438b = VirtualBackgroundInfo.newDisabled();

    /* renamed from: c */
    private static boolean f156439c;

    /* renamed from: d */
    private static JSONObject f156440d = new JSONObject();

    /* renamed from: a */
    protected LabsUtils.AbstractC62209b f156441a;

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62216c.AbstractC62217a
    /* renamed from: a */
    public void mo215243a(boolean z) {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: g */
    public static VirtualBackgroundInfo m243189g() {
        return f156438b;
    }

    /* renamed from: h */
    private static ViewDeviceSetting m243190h() {
        return VCSyncGetService.getViewDeviceSetting();
    }

    /* renamed from: c */
    public static void m243183c() {
        f156440d.remove("selectedAnimoji");
        f156440d.remove("selectedAnimojiName");
    }

    /* renamed from: d */
    public static void m243186d() {
        f156440d = new JSONObject();
        f156440d = m243179b();
    }

    /* renamed from: f */
    public static void m243188f() {
        m243181b(true, new AbstractC63598b<C62260i>() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.C62269o.C622701 */

            /* renamed from: a */
            public void onSuccess(C62260i iVar) {
                C60700b.m235851b("LabsModel", "[preload]", "succeed");
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("LabsModel", "[preload]", "failed: " + eVar);
            }
        });
    }

    /* renamed from: e */
    public static void m243187e() {
        Object remove = f156440d.remove("selectedAnimoji");
        String jSONObject = f156440d.toString();
        if (remove != null) {
            try {
                f156440d.put("selectedAnimoji", remove);
            } catch (JSONException e) {
                C60700b.m235864f("LabsModel", "[saveEffectData2]", e.getMessage());
            }
        }
        if (f156438b == null) {
            m243177a(jSONObject, false, "");
        } else {
            m243177a(jSONObject, f156438b.isBlur, f156438b.key);
        }
        C60700b.m235851b("LabsModel", "[saveEffectData]", jSONObject);
    }

    /* renamed from: a */
    public static void m243173a() {
        try {
            f156440d.put("selectedAnimoji", "");
            f156440d.put("selectedAnimojiName", "");
            f156440d.put("selectedFilter", "");
            f156440d.put("selectedFilterName", "");
            f156440d.put("selectedBeauty", "");
            f156440d.put("selectedBeautyStyle", EffectModel.BeautifyStyle.ORIGINAL.getValue());
        } catch (JSONException e) {
            C60700b.m235864f("LabsModel", "[disableCacheEffect]", e.getMessage());
        }
    }

    /* renamed from: b */
    public static JSONObject m243179b() {
        ViewDeviceSetting h;
        String str;
        if (!(f156440d.optBoolean("init") || (h = m243190h()) == null || h.video == null)) {
            String str2 = h.video.advancedBeauty;
            try {
                if (TextUtils.isEmpty(str2)) {
                    str = "{}";
                } else {
                    str = str2;
                }
                JSONObject jSONObject = new JSONObject(str);
                f156440d = jSONObject;
                jSONObject.put("init", true);
                m243183c();
                C60700b.m235851b("LabsModel", "[getEffectData]", "settings: [effect]" + str2);
            } catch (JSONException e) {
                C60700b.m235864f("LabsModel", "[getEffectData2]", e.getMessage());
            }
        }
        return f156440d;
    }

    /* renamed from: b */
    public static void m243180b(VirtualBackgroundInfo virtualBackgroundInfo) {
        f156438b = virtualBackgroundInfo;
    }

    public C62269o(LabsUtils.AbstractC62209b bVar) {
        this.f156441a = bVar;
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62216c.AbstractC62217a
    /* renamed from: b */
    public void mo215245b(EffectModel effectModel) {
        m243174a(effectModel, this.f156441a);
    }

    /* renamed from: a */
    private static void m243175a(C62260i iVar) {
        List<VirtualBackgroundInfo> list = iVar.f156427a;
        list.addAll(0, LabsUtils.m242909c());
        iVar.f156427a = list;
    }

    /* renamed from: a */
    private static List<VirtualBackgroundInfo> m243172a(List<VirtualBackground> list) {
        StringBuilder sb = new StringBuilder("background names are: ");
        Iterator<VirtualBackground> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().name + "; ");
        }
        C60700b.m235851b("LabsModel", "[getVcVirtualBackground]", sb.toString());
        return VcBizSender.syncGetVcVirtualBackground(list);
    }

    /* renamed from: b */
    public static synchronized C62260i m243178b(boolean z) {
        boolean z2;
        synchronized (C62269o.class) {
            int i = 0;
            if (z) {
                if (C62261j.f156429a != null && C62261j.f156429a.f156427a.size() > 2) {
                    if (C62261j.f156429a.f156427a != null) {
                        i = C62261j.f156429a.f156427a.size();
                    }
                    C60700b.m235851b("LabsModel", "[syncLoadCloudConfig]", "cloud config found in cache, background count: " + i);
                    return C62261j.f156429a;
                }
            }
            C62260i iVar = new C62260i();
            C62294s setting = LabsUtils.getSetting(z);
            ArrayList arrayList = new ArrayList();
            if (setting.f156524a != null) {
                for (MeetingBackground meetingBackground : setting.f156524a) {
                    String str = meetingBackground.url;
                    String str2 = meetingBackground.portraitUrl;
                    String str3 = meetingBackground.name;
                    if (meetingBackground.backgroundType == MeetingBackground.Type.VIDEO) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    arrayList.add(new VirtualBackground(str, str2, str3, z2, MaterialSource.APP_SETTINGS));
                }
            }
            AdminSettings a = C61371a.m239155a();
            if (a != null && !CollectionUtils.isEmpty(a.meetingBackgroundList)) {
                for (MeetingBackground meetingBackground2 : a.meetingBackgroundList) {
                    if (meetingBackground2.backgroundType == MeetingBackground.Type.IMAGE) {
                        arrayList.add(new VirtualBackground(meetingBackground2.url, meetingBackground2.portraitUrl, meetingBackground2.name, false, MaterialSource.APP_ADMIN));
                    }
                }
            }
            iVar.f156427a = m243172a(arrayList);
            m243175a(iVar);
            C62261j.f156429a = iVar;
            return C62261j.f156429a;
        }
    }

    /* renamed from: c */
    private static C62260i m243182c(boolean z) {
        String str;
        C60700b.m235851b("LabsModel", "[syncLoadConfig]", "syncLoadConfig");
        C62260i b = m243178b(z);
        ViewDeviceSetting h = m243190h();
        synchronized (C62269o.class) {
            if (!f156439c || !z) {
                if (h == null || h.video == null) {
                    C60700b.m235851b("LabsModel", "[syncLoadConfig5]", "load user settings get none");
                    try {
                        f156440d.put("init", true);
                    } catch (JSONException e) {
                        C60700b.m235864f("LabsModel", "[syncLoadConfig6]", e.getMessage());
                    }
                } else {
                    if (!f156440d.optBoolean("init")) {
                        String str2 = h.video.advancedBeauty;
                        try {
                            if (TextUtils.isEmpty(str2)) {
                                str = "{}";
                            } else {
                                str = str2;
                            }
                            JSONObject jSONObject = new JSONObject(str);
                            f156440d = jSONObject;
                            jSONObject.put("init", true);
                            m243183c();
                            C60700b.m235851b("LabsModel", "[syncLoadConfig2]", "load user settings: [effect]" + str2);
                        } catch (JSONException e2) {
                            C60700b.m235864f("LabsModel", "[syncLoadConfig2]", e2.getMessage());
                        }
                    }
                    if (h.video.backgroundBlur) {
                        m243180b(VirtualBackgroundInfo.newBlur());
                        C60700b.m235851b("LabsModel", "[syncLoadConfig3]", "load user settings: [blur]true");
                    } else {
                        String str3 = h.video.virtualBackground;
                        if (TextUtils.isEmpty(str3)) {
                            m243180b(VirtualBackgroundInfo.newDisabled());
                        } else {
                            VirtualBackgroundInfo a = LabsUtils.m242892a(b.f156427a, str3);
                            if (a == null) {
                                m243180b(VirtualBackgroundInfo.newDisabled());
                            } else {
                                m243180b(a);
                            }
                        }
                        C60700b.m235851b("LabsModel", "[syncLoadConfig4]", "load user settings: [background]" + str3);
                    }
                }
                f156439c = true;
            }
        }
        b.f156428b = h;
        return b;
    }

    /* renamed from: c */
    public static void m243184c(VirtualBackgroundInfo virtualBackgroundInfo) {
        boolean z;
        if (virtualBackgroundInfo != null) {
            StringBuilder sb = new StringBuilder("success images are: ");
            StringBuilder sb2 = new StringBuilder("fail images are: ");
            new C60999w(virtualBackgroundInfo).mo210457a();
            File file = new File(virtualBackgroundInfo.trimLandscapePath);
            boolean z2 = true;
            if (!file.exists() || file.length() == 0) {
                z = LabsUtils.m242904a(virtualBackgroundInfo.path, virtualBackgroundInfo.trimLandscapePath, 1280, 720);
            } else {
                z = true;
            }
            if (!z) {
                sb2.append(virtualBackgroundInfo.name);
                sb2.append("; ");
                return;
            }
            File file2 = new File(virtualBackgroundInfo.trimPortraitPath);
            if (!file2.exists() || file2.length() == 0) {
                String str = virtualBackgroundInfo.portraitPath;
                if (TextUtils.isEmpty(str)) {
                    str = virtualBackgroundInfo.path;
                }
                z2 = LabsUtils.m242904a(str, virtualBackgroundInfo.trimPortraitPath, 720, 1280);
            }
            if (z2) {
                sb.append(virtualBackgroundInfo.name);
                sb.append("; ");
            }
            C60700b.m235851b("LabsModel", "[processImages]", sb.toString() + "; " + sb2.toString());
        }
    }

    /* renamed from: c */
    private void m243185c(EffectModel effectModel) {
        try {
            if (effectModel instanceof AnimojiEffect) {
                if (effectModel.isDisabled) {
                    f156440d.put("selectedAnimoji", "");
                    f156440d.put("selectedAnimojiName", "");
                    return;
                }
                f156440d.put("selectedAnimoji", effectModel.getResourceId());
                f156440d.put("selectedAnimojiName", effectModel.getName());
            } else if (effectModel instanceof FilterEffect) {
                if (effectModel.isDisabled) {
                    f156440d.put("selectedFilter", "");
                    f156440d.put("selectedFilterName", "");
                    return;
                }
                f156440d.put("selectedFilter", effectModel.getResourceId());
                f156440d.put("selectedFilterName", effectModel.getName());
                f156440d.put(effectModel.getResourceId(), effectModel.getTagUserValue());
            } else if (effectModel instanceof BeautifyEffect) {
                f156440d.put("selectedBeauty", effectModel.getResourceId());
                f156440d.put(effectModel.getResourceId(), effectModel.getTagUserValue());
            } else if (effectModel instanceof BeautifyStyleEffect) {
                f156440d.put("selectedBeautyStyle", ((BeautifyStyleEffect) effectModel).getBeautyStyle().getValue());
            }
        } catch (Exception e) {
            C60700b.m235864f("LabsModel", "[cacheEffect]", e.getMessage());
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62216c.AbstractC62217a
    /* renamed from: a */
    public void mo215241a(VirtualBackgroundInfo virtualBackgroundInfo) {
        m243180b(virtualBackgroundInfo);
        if (!virtualBackgroundInfo.isPreset()) {
            String path = virtualBackgroundInfo.getPath();
            C60700b.m235851b("LabsModel", "[changeBackground3]", "changeBackground: " + path);
            this.f156441a.mo215198b(path);
        } else if (virtualBackgroundInfo.isDisabled) {
            C60700b.m235851b("LabsModel", "[changeBackground]", "disableBackground");
            this.f156441a.mo215197a(false);
            this.f156441a.mo215198b("");
        } else if (virtualBackgroundInfo.isBlur) {
            C60700b.m235851b("LabsModel", "[changeBackground2]", "enableBackgroundBlur");
            this.f156441a.mo215198b("");
            this.f156441a.mo215197a(true);
        }
        m243177a(f156440d.toString(), virtualBackgroundInfo.isBlur, virtualBackgroundInfo.key);
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62216c.AbstractC62217a
    /* renamed from: a */
    public void mo215242a(EffectModel effectModel) {
        C60700b.m235851b("LabsModel", "[applyEffect]", effectModel.isDisabled + ", " + effectModel.getName() + ", " + effectModel.getTagUserValue() + ", " + effectModel.getResourceId());
        m243185c(effectModel);
        if (effectModel.isDisabled) {
            this.f156441a.mo215195a(effectModel.getPanel());
        } else if (!effectModel.isBeautifyStyle()) {
            m243174a(effectModel, this.f156441a);
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62216c.AbstractC62217a
    /* renamed from: a */
    public void mo215244a(boolean z, AbstractC63598b<C62260i> bVar) {
        m243181b(z, bVar);
    }

    /* renamed from: b */
    public static void m243181b(boolean z, AbstractC63598b<C62260i> bVar) {
        C60735ab.m236018e(new Runnable(z) {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$o$67VDVwydddFPckh4zgQP7U96ZOM */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C62269o.m243176a(AbstractC63598b.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public static int m243171a(EffectModel effectModel, EffectModel.BeautifyStyle beautifyStyle) {
        if (beautifyStyle == EffectModel.BeautifyStyle.AUTO) {
            if (TextUtils.equals(effectModel.getResourceId(), "6920051384008053255")) {
                return 0;
            }
            return 30;
        } else if (beautifyStyle == EffectModel.BeautifyStyle.ORIGINAL) {
            return 0;
        } else {
            return effectModel.getTagUserValue();
        }
    }

    /* renamed from: a */
    public static void m243174a(EffectModel effectModel, LabsUtils.AbstractC62208a aVar) {
        String[] strArr;
        int[] iArr;
        int i;
        C60700b.m235851b("LabsModel", "[applyEffect]", effectModel.getPanel() + " " + effectModel.getCategory() + " " + effectModel.getName());
        int i2 = 0;
        int[] iArr2 = new int[0];
        String[] strArr2 = new String[0];
        int isBeautify = effectModel.isBeautify() ^ 1;
        List<EffectModel.TagModel> tags = effectModel.getTags();
        if (tags == null || tags.isEmpty()) {
            iArr = iArr2;
            strArr = strArr2;
            i = 0;
        } else {
            int size = tags.size();
            int[] iArr3 = new int[size];
            String[] strArr3 = new String[size];
            for (EffectModel.TagModel tagModel : tags) {
                C60700b.m235851b("LabsModel", "[applyEffect2]", tagModel.getTag() + ": " + tagModel.getUserValue());
                iArr3[i2] = tagModel.getUserValue();
                strArr3[i2] = tagModel.getTag();
                i2++;
            }
            i = size;
            iArr = iArr3;
            strArr = strArr3;
        }
        aVar.mo215196a(effectModel.getUnzipPath(), effectModel.getPanel(), effectModel.getCategory(), i, iArr, strArr, isBeautify, "");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m243176a(AbstractC63598b bVar, boolean z) {
        try {
            bVar.onSuccess(m243182c(z));
        } catch (Exception e) {
            bVar.onError(new C63602e(new ErrorResult(e)));
        }
    }

    /* renamed from: a */
    public static void m243177a(String str, boolean z, String str2) {
        ViewDeviceSetting viewDeviceSetting = VCSyncGetService.getViewDeviceSetting();
        if (viewDeviceSetting == null) {
            viewDeviceSetting = new ViewDeviceSetting();
        }
        ViewDeviceSetting.Video video = viewDeviceSetting.video;
        if (video == null) {
            video = new ViewDeviceSetting.Video();
        }
        video.backgroundBlur = z;
        video.virtualBackground = str2;
        video.advancedBeauty = str;
        viewDeviceSetting.video = video;
        VCSyncGetService.setViewDeviceSetting(viewDeviceSetting);
        VcBizSender.m249148a(viewDeviceSetting).mo219896d();
    }
}
