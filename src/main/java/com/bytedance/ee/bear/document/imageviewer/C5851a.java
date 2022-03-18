package com.bytedance.ee.bear.document.imageviewer;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.imageviewer.bean.ImageType;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.document.imageviewer.a */
public class C5851a {

    /* renamed from: a */
    private Map<String, Object> f16388a = new HashMap();

    /* renamed from: b */
    private AbstractC5233x f16389b;

    /* renamed from: c */
    private String f16390c;

    /* renamed from: d */
    private BearUrl f16391d;

    /* renamed from: a */
    public void mo23457a() {
        mo23459a("refresh_image");
    }

    /* renamed from: b */
    public void mo23460b() {
        mo23459a("refresh_comment");
    }

    /* renamed from: c */
    public void mo23462c() {
        mo23459a("enter");
    }

    /* renamed from: d */
    public void mo23464d() {
        mo23459a("quit");
    }

    /* renamed from: e */
    public void mo23466e() {
        mo23459a("icon_download");
    }

    /* renamed from: f */
    public void mo23468f() {
        mo23459a("press_download");
    }

    /* renamed from: g */
    public void mo23469g() {
        mo23459a("press_scan_qrcode");
    }

    /* renamed from: h */
    public void mo23470h() {
        mo23459a("switch");
    }

    /* renamed from: i */
    public void mo23471i() {
        mo23459a("press_send_lark");
    }

    /* renamed from: j */
    public void mo23472j() {
        mo23459a("send_comment");
    }

    /* renamed from: k */
    public void mo23473k() {
        mo23459a("delete_image");
    }

    /* renamed from: l */
    public void mo23474l() {
        mo23459a("delete_image_confirm");
    }

    /* renamed from: e */
    public void mo23467e(String str) {
        m23522f(str);
    }

    /* renamed from: a */
    public void mo23458a(ImageType imageType) {
        if (imageType != null) {
            this.f16390c = imageType.name().toLowerCase();
        }
    }

    /* renamed from: c */
    public void mo23463c(String str) {
        m23520a("download", str);
    }

    /* renamed from: d */
    public void mo23465d(String str) {
        m23520a(Comment.f24093e, str);
    }

    /* renamed from: a */
    public void mo23459a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        m23521a(hashMap);
        AbstractC5233x xVar = this.f16389b;
        if (xVar != null) {
            xVar.mo21079a("client_image_operation", hashMap);
        }
    }

    /* renamed from: f */
    private void m23522f(String str) {
        this.f16388a.put("preview_viable", "1");
        this.f16388a.put("object_id", C13598b.m55197d(str));
        this.f16388a.put("object_file_type", "png");
        AbstractC5233x xVar = this.f16389b;
        if (xVar != null) {
            xVar.mo21084b("ccm_drive_page_view", this.f16388a);
        }
    }

    /* renamed from: b */
    public void mo23461b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(ShareHitPoint.f121868c, str);
        m23521a(hashMap);
        C13479a.m54764b("ImageViewerAnalytic", "reportLandScape(): " + hashMap);
        AbstractC5233x xVar = this.f16389b;
        if (xVar != null) {
            xVar.mo21079a("client_horizontal_screen", hashMap);
        }
    }

    /* renamed from: a */
    private void m23521a(Map<String, String> map) {
        String str;
        BearUrl bearUrl = this.f16391d;
        if (bearUrl != null) {
            String str2 = "ERR";
            if (TextUtils.isEmpty(bearUrl.f17447b)) {
                str = str2;
            } else {
                str = C13598b.m55197d(this.f16391d.f17447b);
            }
            if (!TextUtils.isEmpty(this.f16391d.f17446a)) {
                str2 = this.f16391d.f17446a;
            }
            map.put("file_id", str);
            map.put("file_type", str2);
            map.put("module", str2);
            map.put("block_type", this.f16390c);
        }
    }

    public C5851a(AbstractC5233x xVar, BearUrl bearUrl) {
        this.f16389b = xVar;
        this.f16391d = bearUrl;
        if (xVar != null) {
            HashMap<String, Object> c = xVar.mo21086c("docCommonParams");
            if (!c.isEmpty()) {
                for (Map.Entry<String, Object> entry : c.entrySet()) {
                    this.f16388a.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    /* renamed from: a */
    private void m23520a(String str, String str2) {
        this.f16388a.put("click", str);
        this.f16388a.put("object_id", C13598b.m55197d(str2));
        this.f16388a.put("object_file_type", "png");
        AbstractC5233x xVar = this.f16389b;
        if (xVar != null) {
            xVar.mo21084b("ccm_drive_page_click", this.f16388a);
        }
    }
}
