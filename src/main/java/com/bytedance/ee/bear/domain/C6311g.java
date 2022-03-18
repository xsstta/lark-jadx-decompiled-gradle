package com.bytedance.ee.bear.domain;

import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.ttvecamera.p3038g.C60375c;
import com.ss.android.vc.statistics.p3180a.C63690d;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.domain.g */
public class C6311g {

    /* renamed from: a */
    public static final String[] f17495a = {"/space", "/drive", "/blank/", "/space/blank/", "/drive/blank/", "/(doc|docs|sheet|sheets|mindnote|mindnotes|slide|slides|file|bitable|base|folder|wiki|isv|docx)/", "/app/upgrade"};

    /* renamed from: b */
    public static final String[] f17496b = {"docs.bytedance.net", "docs-staging.bytedance.net", "bear-test.bytedance.net", "feishu.cn", "feishu-staging.cn", "feishu-boe.cn", "feishu-pre.cn", "larksuite.com", "larksuite-staging.com", "larksuite-pre.com"};

    /* renamed from: c */
    public static final String[] f17497c = {"internal-api.feishu.cn", "internal-api-space.feishu.cn", "internal-api-space-hl.feishu.cn", "internal-api-space-lf.feishu.cn", "internal-api.larksuite.com", "internal-api-space.larksuite.com", "internal-api-space-hl.larksuite.com", "internal-api-space-lf.larksuite.com"};

    /* renamed from: d */
    public static final Map<String, String> f17498d;

    /* renamed from: e */
    public static final String[] f17499e = {"doc", "docs"};

    /* renamed from: f */
    public static final HashMap<String, String> f17500f;

    /* renamed from: g */
    public static final HashMap<String, String> f17501g;

    /* renamed from: h */
    public static final HashMap<String, String> f17502h;

    /* renamed from: i */
    public static final HashMap<String, String> f17503i;

    static {
        HashMap hashMap = new HashMap();
        f17498d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        f17500f = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        f17501g = hashMap3;
        HashMap<String, String> hashMap4 = new HashMap<>();
        f17502h = hashMap4;
        HashMap<String, String> hashMap5 = new HashMap<>();
        f17503i = hashMap5;
        hashMap2.put("/app/upgrade/", "upgrade");
        hashMap2.put("/folder/", "folder");
        hashMap2.put("/help/", "help");
        hashMap2.put("/help/about-best/", "help");
        hashMap2.put("/help/doc/", "help");
        hashMap2.put("/home/", "recent");
        hashMap2.put("/home/recents/", "recent");
        hashMap2.put("/home/share/files/", "share");
        hashMap2.put("/home/star/", "star");
        hashMap2.put("/native/newyearsurvey/", "newyear_survey");
        hashMap2.put("/share/folders/", "share_root");
        hashMap2.put("/shared/folders/", "share_root");
        hashMap2.put("/space/", "recent");
        hashMap2.put("/space/app/upgrade/", "upgrade");
        hashMap2.put("/space/folder/", "folder");
        hashMap2.put("/space/help/", "help");
        hashMap2.put("/space/help/about-best/", "help");
        hashMap2.put("/space/help/doc/", "help");
        hashMap2.put("/space/home/", "recent");
        hashMap2.put("/space/home/recents/", "recent");
        hashMap2.put("/space/home/share/files/", "share");
        hashMap2.put("/space/home/star/", "star");
        hashMap2.put("/space/native/newyearsurvey/", "newyear_survey");
        hashMap2.put("/space/share/folders/", "share_root");
        hashMap2.put("/space/shared/folders/", "share_root");
        hashMap2.put("/space/wiki/", "wiki_home");
        hashMap2.put("/wiki/", "wiki_home");
        hashMap2.put("/drive/home/", "recent");
        hashMap2.put("/drive/home/recents/", "recent");
        hashMap2.put("/drive/home/share/files/", "share");
        hashMap2.put("/drive/home/star/", "star");
        hashMap2.put("/drive/share/folders/", "share_root");
        hashMap2.put("/drive/shared/folders/", "share_root");
        hashMap2.put("/drive/help/doc/", "help");
        hashMap2.put("/drive/help/", "help");
        hashMap2.put("/drive/app/upgrade/", "upgrade");
        hashMap2.put("/drive/", "recent");
        hashMap2.put("/drive/template_center/", "template_center");
        hashMap2.put("/drive/folder/", "folder");
        hashMap2.put("/drive/sharedfolder/", "history_shared_folder");
        hashMap3.put("blank", "/blank/");
        hashMap3.put("upgrade", "/space/app/upgrade");
        hashMap3.put("default", "/${type}/${token}");
        hashMap3.put("'folder'", "/drive/${type}/${token}");
        hashMap.put("k", "doc");
        hashMap.put(AbstractC60044a.f149675a, "sheet");
        hashMap.put(C63954b.f161494a, "bitable");
        hashMap.put(C60375c.f150914a, "mindnote");
        hashMap.put(C63690d.f160779a, "slide");
        hashMap.put("e", "file");
        hashMap4.put("doc", "docs");
        hashMap4.put("docx", "docx");
        hashMap4.put("sheet", "sheets");
        hashMap4.put("slide", "slides");
        hashMap4.put("mindnote", "mindnotes");
        hashMap4.put("bitable", "base");
        hashMap4.put("file", "file");
        hashMap4.put("folder", "folder");
        hashMap4.put("wiki", "wiki");
        hashMap5.put("base", "bitable");
        hashMap5.put("bitable", "bitable");
        hashMap5.put("doc", "doc");
        hashMap5.put("docs", "doc");
        hashMap5.put("docx", "docx");
        hashMap5.put("file", "file");
        hashMap5.put("folder", "folder");
        hashMap5.put("mindnote", "mindnote");
        hashMap5.put("mindnotes", "mindnote");
        hashMap5.put("sheet", "sheet");
        hashMap5.put("sheets", "sheet");
        hashMap5.put("slide", "slide");
        hashMap5.put("slides", "slide");
        hashMap5.put("wiki", "wiki");
        hashMap5.put("isv", "isv");
    }
}
