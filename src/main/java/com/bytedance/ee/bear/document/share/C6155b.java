package com.bytedance.ee.bear.document.share;

import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.bizwidget.shareview.ShareType;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.document.share.SharePlugin;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.share.export.AbstractC11003a;
import com.bytedance.ee.bear.share.export.ShareParams;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.share.b */
public class C6155b extends C6154a implements AbstractC7945d<ShareItem> {

    /* renamed from: b */
    private C6095s f17148b;

    /* renamed from: c */
    private C6156c f17149c;

    /* renamed from: d */
    private SharePlugin.AbstractC6153a f17150d;

    /* renamed from: e */
    private long f17151e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo24847a() {
        return "";
    }

    /* renamed from: b */
    private boolean m24868b() {
        return C5084ad.m20847d().mo20038b().mo20041b();
    }

    /* renamed from: c */
    private boolean m24869c() {
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - this.f17151e) < 1500) {
            return true;
        }
        this.f17151e = currentTimeMillis;
        return false;
    }

    public C6155b(C6095s sVar) {
        this(sVar, null);
    }

    @Override // com.bytedance.ee.bear.document.share.C6154a
    /* renamed from: a */
    public void mo24844a(ShareItem shareItem) {
        C13479a.m54764b("ShareHandler", "share is called.");
        if (!m24868b()) {
            C13479a.m54764b("ShareHandler", "WebViewFragment.share: 468 no network");
            FragmentActivity f = this.f17148b.mo19564f();
            Toast.showFailureText(f, f.getResources().getText(R.string.Doc_Facade_Offline), 0);
        } else if (shareItem == null) {
            C13479a.m54764b("ShareHandler", "share content is empty");
            mo24849a((C6156c) null);
        } else if (TextUtils.isEmpty(shareItem.getUrl())) {
            C13479a.m54758a("ShareHandler", "share data.getUrl == null");
            FragmentActivity f2 = this.f17148b.mo19564f();
            Toast.showFailureText(f2, f2.getString(R.string.Doc_Doc_NetException), 0);
        } else if (shareItem.isEnable()) {
            C6156c cVar = new C6156c();
            cVar.mo24852a(shareItem.getTitle());
            cVar.mo24855b(shareItem.getUrl());
            cVar.mo24858c(shareItem.getContent());
            cVar.mo24860d(shareItem.getTopic());
            cVar.mo24851a(this);
            cVar.mo24853a(shareItem.getDisabledShareTypes());
            cVar.mo24856b(shareItem.getBadgeShareTypes());
            mo24849a(cVar);
        } else {
            C13479a.m54772d("ShareHandler", "ShareHandler.handleShareData: disable share. do nothing ");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo24849a(C6156c cVar) {
        this.f17149c = cVar;
        if (!m24869c()) {
            DocViewModel m = this.f17148b.mo24598m();
            String docFeedId = m.getDocFeedId();
            BearUrl g = C6313i.m25327a().mo25399g(m.getUrl());
            ((AbstractC11003a) KoinJavaComponent.m268610a(AbstractC11003a.class)).mo41761a(new ShareParams.ShareParamsBuilder(this.f17148b.mo19564f()).source(2).type(C8275a.m34051b(g.f17446a)).docName(this.f17149c.mo24850a()).token(g.f17447b).url(this.f17149c.mo24854b()).originUrl(this.f17149c.mo24854b()).isOwner(m.isOwner()).module(g.f17446a).isWiki(m.isType(C8275a.f22377j)).docContent(this.f17149c.mo24857c()).docTopic(this.f17149c.mo24859d()).mindnoteViewType(mo24847a()).feedId(docFeedId).disabledShareTypes(this.f17149c.mo24862f()).badgeShareTypes(this.f17149c.mo24863g()).isWikiVersionV2(((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21071c(this.f17148b)).build(), m.getRemindBinder());
            SharePlugin.AbstractC6153a aVar = this.f17150d;
            if (aVar != null) {
                aVar.mo24842a();
                if (cVar.mo24863g() != null && cVar.mo24863g().contains(Integer.valueOf(ShareType.ExportImage.ordinal()))) {
                    this.f17150d.mo24843a("shareImage");
                }
            }
            m24867a(m.isType(C8275a.f22377j), g, cVar.mo24854b());
        }
    }

    public C6155b(C6095s sVar, SharePlugin.AbstractC6153a aVar) {
        this.f17148b = sVar;
        this.f17150d = aVar;
    }

    /* renamed from: a */
    private void m24867a(boolean z, BearUrl bearUrl, String str) {
        String str2;
        String str3;
        if (z) {
            str3 = C6313i.m25327a().mo25399g(str).f17447b;
            str2 = "wiki";
        } else {
            String str4 = bearUrl.f17446a;
            String str5 = bearUrl.f17447b;
            str2 = str4;
            str3 = str5;
        }
        ((AbstractC11003a) KoinJavaComponent.m268610a(AbstractC11003a.class)).mo41764a(str2, str3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo24848a(int i, int i2, Intent intent) {
        C6156c cVar;
        if (i == 0 && (cVar = this.f17149c) != null) {
            String str = null;
            if (i2 == 201) {
                str = "share_to_lark";
            } else if (i2 == 202) {
                str = "share_to_toutiao";
            } else if (i2 == 203) {
                str = "copy_link";
            }
            if (!(cVar.mo24861e() == null || str == null)) {
                this.f17149c.mo24861e().mo24846a(str);
            }
            C13479a.m54764b("ShareHandler", "share content " + this.f17149c.toString());
        }
    }
}
