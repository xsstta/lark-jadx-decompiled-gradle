package com.bytedance.ee.bear.drive.biz.permission.model;

import com.bytedance.ee.bear.DocMetaInfo;
import com.bytedance.ee.bear.DocObjInfo;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.DocVersion;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.WikiMoreInfo;
import com.bytedance.ee.bear.share.export.OwnerInfo;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.biz.permission.model.b */
public class C6522b {

    /* renamed from: a */
    private String f17966a;

    /* renamed from: b */
    private DocPermission f17967b;

    /* renamed from: a */
    private static String m26159a(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: a */
    public String mo26055a() {
        return this.f17966a;
    }

    /* renamed from: l */
    public DocPermission mo26066l() {
        return this.f17967b;
    }

    public C6522b() {
        this.f17966a = "";
        this.f17967b = new DocPermission();
    }

    /* renamed from: b */
    public int mo26056b() {
        return this.f17967b.mo38591a().getPermissions();
    }

    /* renamed from: c */
    public String mo26057c() {
        return this.f17967b.mo38591a().getReportJson();
    }

    /* renamed from: d */
    public boolean mo26058d() {
        return this.f17967b.mo38591a().canCopy();
    }

    /* renamed from: e */
    public boolean mo26059e() {
        return this.f17967b.mo38591a().canExport();
    }

    /* renamed from: f */
    public boolean mo26060f() {
        return this.f17967b.mo38591a().canComment();
    }

    /* renamed from: g */
    public boolean mo26061g() {
        return this.f17967b.mo38594b().isOwner();
    }

    /* renamed from: h */
    public OwnerInfo mo26062h() {
        return this.f17967b.mo38591a().getOwnerInfo();
    }

    /* renamed from: i */
    public boolean mo26063i() {
        return this.f17967b.mo38591a().canRead();
    }

    /* renamed from: j */
    public boolean mo26064j() {
        return this.f17967b.mo38591a().canEdit();
    }

    /* renamed from: k */
    public int mo26065k() {
        return this.f17967b.mo38591a().getPermissionStatusCode();
    }

    /* renamed from: m */
    public String mo26067m() {
        return this.f17967b.mo38594b().getReportJson();
    }

    public C6522b(String str, DocPermission docPermission) {
        this.f17966a = str;
        this.f17967b = docPermission;
    }

    /* renamed from: a */
    public static DocMoreInfo m26158a(C6937b bVar, C6521a aVar, C6522b bVar2, C7086a aVar2, String str, DocVersion docVersion, boolean z, DrivePluginHost aVar3) {
        String str2;
        if (aVar2 == null) {
            str2 = "";
        } else {
            str2 = m26159a(aVar2.mo27322a().mo27364g());
        }
        DocMetaInfo docMetaInfo = new DocMetaInfo(m26159a(aVar.mo26042a()), m26159a(aVar.mo26045b()), m26159a(aVar.mo26049e()), m26159a(aVar.mo26050f()), m26159a(aVar.mo26047c()), m26159a(aVar.mo26053i()), m26159a(aVar.mo26048d()), str2, aVar.mo26051g(), aVar.mo26052h(), "", "", false, "", -1);
        if (bVar.isTypeWiki()) {
            return new WikiMoreInfo(C8275a.f22375h.mo32555b(), str, m26159a(bVar2.mo26055a()), "", false, false, docMetaInfo, new DocObjInfo(), bVar2.mo26066l(), docVersion, bVar.getWikiInfo().getWikiToken(), z, ((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21071c(aVar3));
        }
        return new DocMoreInfo(C8275a.f22375h.mo32555b(), str, m26159a(bVar2.mo26055a()), "", false, false, docMetaInfo, new DocObjInfo(), bVar2.mo26066l(), docVersion, z, false);
    }
}
