package com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view;

import android.content.Context;
import com.bytedance.ee.bear.contract.drive.DriveCommonConstants;
import com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.p337a.C6801a;
import com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.presenter.HandlerC6808b;
import com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6905a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.service.C10917c;
import com.larksuite.framework.thread.CoreThreadPool;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.c */
public class C6821c extends AbstractC6905a<AbstractC6814a> {

    /* renamed from: a */
    private HandlerC6808b f18549a;

    /* renamed from: b */
    private AbstractC7095c f18550b = C6920b.m27342f().mo27169d();

    /* renamed from: c */
    private C7130c f18551c = C6920b.m27342f().mo27166a();

    /* renamed from: d */
    private C10917c f18552d;

    /* renamed from: a */
    public AbstractC7095c mo26859a() {
        return this.f18550b;
    }

    /* renamed from: c */
    public void mo26863c() {
        HandlerC6808b bVar = this.f18549a;
        if (bVar != null) {
            bVar.mo26833h();
        }
    }

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6908d, com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6905a
    /* renamed from: f */
    public void mo25893f() {
        super.mo25893f();
        HandlerC6808b bVar = this.f18549a;
        if (bVar != null) {
            bVar.mo26832g();
            this.f18549a.mo26835i();
        }
    }

    /* renamed from: a */
    public void mo26860a(C6801a aVar) {
        HandlerC6808b bVar = this.f18549a;
        if (bVar != null) {
            bVar.mo26831f(aVar);
        }
    }

    /* renamed from: a */
    public void mo26861a(String str) {
        HandlerC6808b bVar = this.f18549a;
        if (bVar != null) {
            bVar.mo26817a(str);
        }
    }

    public C6821c(Context context, C10917c cVar) {
        super(context);
        this.f18552d = cVar;
    }

    /* renamed from: a */
    public void mo26862a(String str, String str2, DriveCommonConstants.DriveRustFgConfig driveRustFgConfig) {
        HandlerC6808b bVar = new HandlerC6808b(CoreThreadPool.getSerialTaskHandler().getLooper(), (AbstractC6822d) mo27154m(), this.f18552d, str, str2, driveRustFgConfig, this.f18551c);
        this.f18549a = bVar;
        bVar.mo26819b();
        this.f18549a.mo26830f();
    }
}
