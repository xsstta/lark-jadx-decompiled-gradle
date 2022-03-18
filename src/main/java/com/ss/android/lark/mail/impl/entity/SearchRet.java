package com.ss.android.lark.mail.impl.entity;

import android.text.Spannable;
import android.text.TextUtils;
import com.bytedance.lark.pb.email.client.v1.Label;
import com.bytedance.lark.pb.email.client.v1.MessagesSummary;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.p2168g.p2169a.C42130j;
import com.ss.android.lark.mail.impl.search.p2214a.C43254b;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.utils.C43819s;
import java.util.ArrayList;
import java.util.List;

public class SearchRet extends MailThread {

    /* renamed from: a */
    private final String f106989a = "SearchRet";

    /* renamed from: b */
    private boolean f106990b;

    /* renamed from: c */
    private boolean f106991c;

    /* renamed from: d */
    private Spannable f106992d;

    /* renamed from: e */
    private Spannable f106993e;

    /* renamed from: f */
    private Spannable f106994f;

    /* renamed from: g */
    private List<String> f106995g;

    /* renamed from: h */
    private String f106996h;

    /* renamed from: i */
    private String f106997i;

    /* renamed from: j */
    private List<String> f106998j;

    /* renamed from: k */
    private C42082a f106999k;

    /* renamed from: C */
    public Spannable mo151751C() {
        return this.f106992d;
    }

    /* renamed from: D */
    public Spannable mo151752D() {
        return this.f106993e;
    }

    /* renamed from: E */
    public Spannable mo151753E() {
        return this.f106994f;
    }

    /* renamed from: F */
    public boolean mo151754F() {
        return this.f106991c;
    }

    /* renamed from: G */
    public List<String> mo151755G() {
        return this.f106995g;
    }

    /* renamed from: H */
    public String mo151756H() {
        return this.f106996h;
    }

    /* renamed from: I */
    public String mo151757I() {
        return this.f106997i;
    }

    /* renamed from: K */
    public C42082a mo151759K() {
        return this.f106999k;
    }

    @Override // com.ss.android.lark.mail.impl.entity.MailThread
    /* renamed from: j */
    public boolean mo151715j() {
        return this.f106990b;
    }

    public SearchRet() {
    }

    /* renamed from: J */
    public String mo151758J() {
        MailLabelEntity mailLabelEntity;
        if (mo151756H() == null) {
            mailLabelEntity = null;
        } else {
            mailLabelEntity = C43374f.m172264f().mo155117c(mo151756H());
        }
        if (mailLabelEntity == null) {
            C43254b bVar = new C43254b();
            bVar.mo154859a(mo151756H());
            bVar.mo154860a(mo151755G());
            mailLabelEntity = (MailLabelEntity) bVar.mo154856a();
        }
        if (mailLabelEntity == null) {
            return null;
        }
        return mailLabelEntity.mo151528l();
    }

    /* renamed from: a */
    public void mo151760a(Spannable spannable) {
        this.f106992d = spannable;
    }

    /* renamed from: b */
    public void mo151761b(Spannable spannable) {
        this.f106993e = spannable;
    }

    /* renamed from: c */
    public void mo151762c(Spannable spannable) {
        this.f106994f = spannable;
    }

    /* renamed from: f */
    public void mo151763f(List<String> list) {
        this.f106995g = list;
    }

    /* renamed from: g */
    public void mo151764g(String str) {
        this.f106996h = str;
    }

    /* renamed from: h */
    public void mo151766h(String str) {
        this.f106997i = str;
    }

    /* renamed from: i */
    public void mo151768i(boolean z) {
        this.f106991c = z;
    }

    /* renamed from: com.ss.android.lark.mail.impl.entity.SearchRet$a */
    public class C42082a {

        /* renamed from: b */
        private int f107001b;

        public C42082a() {
        }

        /* renamed from: a */
        public void mo151769a(int i) {
            this.f107001b = i | this.f107001b;
        }

        /* renamed from: b */
        public boolean mo151770b(int i) {
            if ((i & this.f107001b) != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // com.ss.android.lark.mail.impl.entity.MailThread
    /* renamed from: a */
    public void mo151684a(boolean z) {
        this.f106990b = z;
    }

    /* renamed from: h */
    public void mo151767h(List<String> list) {
        this.f106998j = list;
    }

    /* renamed from: i */
    private List<MailLabelEntity> m167816i(List<Label> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(C42130j.m168150a().mo152079a(list.get(i)));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public void mo151765g(List<MailLabelEntity> list) {
        if (CollectionUtils.isEmpty(list)) {
            this.f106995g = new ArrayList();
            return;
        }
        this.f106995g = new ArrayList();
        for (MailLabelEntity mailLabelEntity : list) {
            if (mailLabelEntity == null || TextUtils.isEmpty(mailLabelEntity.mo151527k())) {
                Log.m165383e("SearchRet", "setLabelsByLabelEntityList invalid label entity");
            } else {
                this.f106995g.add(mailLabelEntity.mo151527k());
            }
        }
    }

    /* renamed from: a */
    private void m167815a(MessagesSummary messagesSummary, String str) {
        if (this.f106999k == null) {
            this.f106999k = new C42082a();
        }
        if (str != null) {
            String str2 = messagesSummary.msg_summary;
            if (str2 != null && str2.contains(str)) {
                this.f106999k.mo151769a(2);
            }
            for (String str3 : messagesSummary.attachment_name_list) {
                if (str3 != null && str3.contains(str)) {
                    this.f106999k.mo151769a(4);
                    if (!this.f106999k.mo151770b(2)) {
                        mo151761b(C43819s.m173682a(str3, str));
                        return;
                    }
                    return;
                }
            }
        }
    }

    public SearchRet(MessagesSummary messagesSummary, String str) {
        if (str != null) {
            mo151682a(messagesSummary.thread_id);
            mo151684a(messagesSummary.hasAttachment.booleanValue());
            mo151678a(messagesSummary.msgNum.longValue());
            mo151690b(messagesSummary.isRead.booleanValue());
            mo151762c(C43819s.m173682a(messagesSummary.from, str));
            mo151763f(messagesSummary.labels);
            mo151692c(messagesSummary.last_message_timestamp.longValue());
            mo151761b(C43819s.m173682a(messagesSummary.msg_summary, str));
            mo151760a(C43819s.m173682a(messagesSummary.subject, str));
            mo151768i(messagesSummary.hasDraft.booleanValue());
            mo151723r().addAll(m167816i(messagesSummary.label_items));
            mo151700d(messagesSummary.is_external.booleanValue());
            mo151694c(messagesSummary.actions);
            mo151705e(messagesSummary.isFlagged.booleanValue());
            mo151767h(messagesSummary.attachment_name_list);
            mo151764g(messagesSummary.folder);
            mo151766h(messagesSummary.message_id);
            m167815a(messagesSummary, str);
        }
    }
}
