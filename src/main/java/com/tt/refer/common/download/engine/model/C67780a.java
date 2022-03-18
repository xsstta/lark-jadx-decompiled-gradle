package com.tt.refer.common.download.engine.model;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.refer.common.download.engine.model.DownloadBean;
import com.tt.refer.common.download.engine.p3421c.AbstractC67762a;
import com.tt.refer.common.download.engine.p3423d.AbstractC67775c;

/* renamed from: com.tt.refer.common.download.engine.model.a */
public class C67780a<B extends DownloadBean> {

    /* renamed from: a */
    public AbstractC67762a<B> f170704a;

    /* renamed from: b */
    private String f170705b;

    /* renamed from: c */
    private int f170706c;

    /* renamed from: d */
    private int f170707d;

    /* renamed from: e */
    private AbstractC67775c<B> f170708e;

    /* renamed from: a */
    public String mo235243a() {
        return this.f170705b;
    }

    /* renamed from: b */
    public int mo235246b() {
        return this.f170706c;
    }

    /* renamed from: c */
    public int mo235248c() {
        return this.f170707d;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("TaskBean:");
        stringBuffer.append("id:");
        stringBuffer.append(mo235243a());
        stringBuffer.append("priority:");
        stringBuffer.append(this.f170707d);
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public void mo235244a(int i) {
        this.f170706c = i;
    }

    /* renamed from: b */
    public void mo235247b(int i) {
        this.f170707d = i;
    }

    /* renamed from: a */
    public void mo235245a(AbstractC67775c<B> cVar) {
        this.f170708e = cVar;
    }

    public C67780a(String str, int i) {
        this.f170706c = i;
        this.f170705b = str;
        AppBrandLogger.m52830i("DownloadTaskManager-XBean", str, ">> init status = ", Integer.valueOf(i));
    }
}
