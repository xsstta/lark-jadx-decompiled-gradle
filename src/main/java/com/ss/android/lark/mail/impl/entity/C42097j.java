package com.ss.android.lark.mail.impl.entity;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.utils.C57782ag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: com.ss.android.lark.mail.impl.entity.j */
public class C42097j {

    /* renamed from: a */
    private List<MailDraft> f107095a;

    /* renamed from: b */
    private int f107096b;

    /* renamed from: c */
    private MailMessage f107097c;

    /* renamed from: a */
    public List<MailDraft> mo151950a() {
        return this.f107095a;
    }

    /* renamed from: f */
    public int mo151963f() {
        return this.f107096b;
    }

    /* renamed from: g */
    public MailMessage mo151964g() {
        return this.f107097c;
    }

    /* renamed from: b */
    public int mo151957b() {
        List<MailDraft> list = this.f107095a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: e */
    public void mo151961e() {
        if (!CollectionUtils.isEmpty(this.f107095a)) {
            this.f107095a.clear();
        }
    }

    /* renamed from: h */
    public boolean mo151965h() {
        List<MailDraft> list = this.f107095a;
        if (list == null || list.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public String mo151959c() {
        if (CollectionUtils.isEmpty(this.f107095a)) {
            return "";
        }
        return this.f107095a.get(0).mo151321a();
    }

    /* renamed from: d */
    public MailDraft mo151960d() {
        if (CollectionUtils.isEmpty(this.f107095a)) {
            return null;
        }
        return this.f107095a.get(0);
    }

    public int hashCode() {
        return Objects.hash(this.f107095a, this.f107097c);
    }

    /* renamed from: i */
    public boolean mo151967i() {
        MailMessage mailMessage = this.f107097c;
        if (mailMessage == null || TextUtils.isEmpty(mailMessage.mo151581b())) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public boolean mo151968j() {
        MailMessage mailMessage = this.f107097c;
        if (mailMessage == null || mailMessage.mo151559L() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo151951a(int i) {
        this.f107096b = i;
    }

    /* renamed from: a */
    public void mo151953a(MailMessage mailMessage) {
        this.f107097c = mailMessage;
    }

    /* renamed from: a */
    public void mo151954a(List<MailDraft> list) {
        ArrayList arrayList = new ArrayList();
        this.f107095a = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: b */
    public void mo151958b(String str) {
        if (mo151967i()) {
            this.f107097c.mo151602f(str);
        }
    }

    /* renamed from: c */
    private MailDraft m167991c(String str) {
        if (mo151965h() && !TextUtils.isEmpty(str)) {
            for (MailDraft mailDraft : this.f107095a) {
                if (str.equals(mailDraft.mo151321a())) {
                    return mailDraft;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo151952a(MailDraft mailDraft) {
        if (this.f107095a == null) {
            this.f107095a = new ArrayList();
        }
        if (mailDraft != null) {
            Iterator<MailDraft> it = this.f107095a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                MailDraft next = it.next();
                if (C57782ag.m224242a(next.mo151321a(), mailDraft.mo151321a())) {
                    this.f107095a.remove(next);
                    break;
                }
            }
            this.f107095a.add(mailDraft);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C42097j jVar = (C42097j) obj;
        if (!Objects.equals(this.f107095a, jVar.f107095a) || !Objects.equals(this.f107097c, jVar.f107097c)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo151955a(C42097j jVar) {
        MailDraft d = mo151960d();
        MailDraft d2 = jVar.mo151960d();
        if (d != null) {
            if (!d.equals(d2) || !TextUtils.equals(d.mo151352h(), d2.mo151352h())) {
                return true;
            }
            return false;
        } else if (d2 != null) {
            return !d2.equals(d);
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo151956a(String str) {
        MailDraft c = m167991c(str);
        if (c != null) {
            return this.f107095a.remove(c);
        }
        return false;
    }
}
