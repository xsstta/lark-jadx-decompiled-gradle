package com.bytedance.ee.bear.document.feed;

import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.document.C5628ac;
import com.bytedance.ee.bear.document.aj;
import com.bytedance.ee.bear.document.comment.C5713b;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g;
import com.bytedance.ee.bear.middleground.feed.export.bean.MessageBean;
import com.bytedance.ee.bear.middleground.feed.export.bean.MessageResultBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.util.p718t.C13749l;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.feed.b */
public class C5798b implements AbstractC9494g {

    /* renamed from: a */
    private final C5713b f16303a = new C5713b();

    /* renamed from: b */
    private aj f16304b;

    /* renamed from: c */
    private C5797a f16305c;

    /* renamed from: d */
    private AbstractC5800b f16306d;

    /* renamed from: e */
    private AbstractC5799a f16307e;

    /* renamed from: f */
    private String f16308f;

    /* renamed from: g */
    private int f16309g;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.document.feed.b$a */
    public interface AbstractC5799a {
        /* renamed from: a */
        void mo23298a(MessageResultBean messageResultBean);

        /* renamed from: a */
        void mo23299a(String str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.document.feed.b$b */
    public interface AbstractC5800b {
        void showChange(boolean z);
    }

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
    /* renamed from: a */
    public void mo23346a(List<String> list) {
    }

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
    /* renamed from: b */
    public void mo23348b(int i) {
    }

    /* renamed from: a */
    private AbstractC4931i m23370a() {
        return this.f16304b.mo19446f().mo19448b();
    }

    /* renamed from: a */
    public void mo23340a(AbstractC5799a aVar) {
        this.f16307e = aVar;
    }

    /* renamed from: a */
    public void mo23341a(AbstractC5800b bVar) {
        this.f16306d = bVar;
    }

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
    /* renamed from: b */
    public boolean mo23349b(String str) {
        return C5628ac.m22844a(str, this.f16304b.mo19446f());
    }

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
    /* renamed from: a */
    public void mo23339a(int i) {
        this.f16305c.setPanelHeight(i);
        this.f16303a.mo22807a(m23370a(), C13749l.m55749b(i));
    }

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
    /* renamed from: a */
    public void mo23342a(MessageBean messageBean) {
        boolean z;
        C5797a aVar = this.f16305c;
        if (messageBean.getIs_whole() == 1) {
            z = true;
        } else {
            z = false;
        }
        aVar.setWhole(z);
        if ("like".equals(messageBean.getSubType())) {
            this.f16305c.setFeedPanel(null);
            this.f16303a.mo22808a(m23370a(), this.f16308f, this.f16309g);
        } else if ("MESSAGE_DOC_MENTION".equals(messageBean.getType())) {
            this.f16303a.mo22810a(m23370a(), messageBean.getMentionId(), messageBean.getReply_id(), false);
        } else if (messageBean.getIs_whole() == 1) {
            this.f16303a.mo22812a(m23370a(), true, messageBean.getComment_id(), messageBean.getReply_id());
        } else {
            this.f16303a.mo22809a(m23370a(), messageBean.getComment_id(), messageBean.getReply_id(), "feed");
        }
    }

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
    /* renamed from: a */
    public void mo23344a(String str) {
        AbstractC5799a aVar = this.f16307e;
        if (aVar != null) {
            aVar.mo23299a(str);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
    /* renamed from: a */
    public void mo23343a(MessageResultBean messageResultBean, String str) {
        AbstractC5799a aVar = this.f16307e;
        if (aVar != null) {
            aVar.mo23298a(messageResultBean);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
    /* renamed from: a */
    public void mo23345a(String str, C10917c cVar) {
        CharSequence charSequence;
        if (this.f16304b.mo19446f() == null || this.f16304b.mo19446f().mo24598m() == null || this.f16304b.mo19446f().mo24598m().getTitle() == null) {
            charSequence = null;
        } else {
            charSequence = this.f16304b.mo19446f().mo24598m().getTitle().mo5927b();
        }
        ((AbstractC5586d) KoinJavaComponent.m268610a(AbstractC5586d.class)).mo22257a(str, charSequence);
    }

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
    /* renamed from: a */
    public void mo23347a(boolean z, boolean z2) {
        this.f16305c.setShow(z);
        if (z) {
            this.f16304b.mo22581a(true);
        } else {
            this.f16303a.mo22811a(m23370a(), z2);
            this.f16304b.mo22581a(false);
        }
        AbstractC5800b bVar = this.f16306d;
        if (bVar != null) {
            bVar.showChange(z);
        }
    }

    C5798b(aj ajVar, C5797a aVar, String str, int i) {
        this.f16305c = aVar;
        this.f16304b = ajVar;
        this.f16308f = str;
        this.f16309g = i;
    }
}
