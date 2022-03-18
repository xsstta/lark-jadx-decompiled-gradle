package com.ss.android.ugc.effectmanager.common.p3053h;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.C60499b;
import com.ss.android.ugc.effectmanager.common.cache.EffectCacheManager;
import com.ss.android.ugc.effectmanager.common.cache.EffectDiskLruCache;
import com.ss.android.ugc.effectmanager.common.download.DownloadListener;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.monitor.EPMonitor;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.common.p3051f.C60515a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.common.h.j */
public class C60531j {
    /* renamed from: a */
    public static boolean m235268a(Effect effect) {
        if (effect == null) {
            return false;
        }
        return !m235267a(effect.getFileUrl());
    }

    /* renamed from: a */
    public static boolean m235267a(UrlModel urlModel) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static List<String> m235269b(UrlModel urlModel) {
        if (urlModel == null || m235267a(urlModel)) {
            return new ArrayList();
        }
        return urlModel.getUrlList();
    }

    /* renamed from: a */
    public static String m235261a(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (!(c == '_' || c == '-' || ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')))) {
                charArray[i] = '_';
            }
        }
        return new String(charArray);
    }

    /* renamed from: b */
    public static boolean m235270b(Effect effect) {
        if (effect == null || C60525c.m235234a((List) effect.getRequirements_sec())) {
            return false;
        }
        int i = 0;
        for (String str : effect.getRequirements_sec()) {
            if (!TextUtils.isEmpty(str) && str.trim().length() > 0) {
                i++;
            }
        }
        int i2 = 0;
        for (String str2 : effect.getRequirements()) {
            if (!TextUtils.isEmpty(str2) && str2.trim().length() > 0) {
                i2++;
            }
        }
        if (i == 0 || i2 == i) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static List<String> m235262a(List<String> list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next() + str);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m235264a(Effect effect, MonitorTrace bVar) throws Exception {
        EPMonitor.m235192a(bVar, "EffectUtils#unZipEffect::from " + effect.getZipPath() + " to " + effect.getUnzipPath());
        String c = FileUtils.f151342a.mo207256c(effect.getUnzipPath(), "_tmp");
        try {
            FileUtils.f151342a.mo207259d(c);
            FileUtils.f151342a.mo207253b(effect.getZipPath(), c);
            FileUtils.f151342a.mo207250a(c, effect.getUnzipPath(), true, true);
            FileUtils.f151342a.mo207254b(effect.getZipPath());
            EPMonitor.m235192a(bVar, "EffectUtils#unZipEffect::success!!");
        } catch (Exception e) {
            EPLog.m235180c("EffectUtils", "unzip effect fail without disklrucache: " + e.getMessage());
            FileUtils.f151342a.mo207259d(c);
            FileUtils.f151342a.mo207259d(effect.getUnzipPath());
            EPMonitor.m235192a(bVar, "EffectUtils#unZipEffect::failed, cause=" + e.getMessage());
            throw e;
        }
    }

    /* renamed from: a */
    public static void m235266a(List<String> list, List<Effect> list2) {
        if (list2 != null) {
            for (Effect effect : list2) {
                effect.getFileUrl().setUrlList(m235262a(list, effect.getFileUrl().getUri()));
                effect.getIconUrl().setUrlList(m235262a(list, effect.getIconUrl().getUri()));
                if (effect.getHintIcon().isValid()) {
                    effect.getHintIcon().setUrlList(m235262a(list, effect.getHintIcon().getUri()));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0060 A[SYNTHETIC, Splitter:B:36:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x006a A[SYNTHETIC, Splitter:B:41:0x006a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File m235260a(java.io.InputStream r9, java.lang.String r10, long r11, com.ss.android.ugc.effectmanager.common.download.DownloadListener r13) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.p3053h.C60531j.m235260a(java.io.InputStream, java.lang.String, long, com.ss.android.ugc.effectmanager.common.download.a):java.io.File");
    }

    /* renamed from: a */
    public static void m235265a(String str, String str2, String str3, List<Effect> list) {
        if (list != null) {
            for (Effect effect : list) {
                effect.setZipPath(str + File.separator + effect.getId() + ".zip");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(File.separator);
                sb.append(effect.getId());
                effect.setUnzipPath(sb.toString());
                effect.setPanel(str2);
                if (!TextUtils.isEmpty(str3)) {
                    effect.setRecId(str3);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m235263a(C60515a aVar, String str, Effect effect, MonitorTrace bVar, DownloadListener aVar2) throws Exception {
        try {
            EPMonitor.m235192a(bVar, "EffectUtils#download::net request begin.");
            C60499b bVar2 = new C60499b("GET", str, false);
            InputStream a = aVar.mo207213a(bVar2);
            EPMonitor.m235192a(bVar, "EffectUtils#download::net request success.");
            String parent = new File(effect.getZipPath()).getParent();
            EPMonitor.m235192a(bVar, "EffectUtils#download::write disk begin.");
            if (EffectCacheManager.f151232b.mo207127a().mo207125a(parent) instanceof EffectDiskLruCache) {
                ((EffectDiskLruCache) EffectCacheManager.f151232b.mo207127a().mo207125a(parent)).mo207132a(effect, a, effect.getFileUrl().getUri(), bVar2.mo207152f(), aVar2);
            } else {
                m235260a(a, effect.getZipPath(), bVar2.mo207152f(), aVar2);
            }
            EPMonitor.m235192a(bVar, "EffectUtils#download::write disk success.");
            C60524b.m235232a(a);
        } catch (IOException e) {
            EPMonitor.m235192a(bVar, "EffectUtils#download::fail cause::" + e.getMessage());
            e.printStackTrace();
            throw e;
        } catch (Throwable th) {
            C60524b.m235232a(null);
            throw th;
        }
    }
}
