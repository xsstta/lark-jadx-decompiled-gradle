package com.tt.option.share;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;

/* renamed from: com.tt.option.share.b */
public interface AbstractC67678b {

    /* renamed from: com.tt.option.share.b$a */
    public interface AbstractC67679a {
        /* renamed from: a */
        void mo231837a(String str, AbstractC67684g gVar);
    }

    void getShareBaseInfo(String str, AbstractC67681d dVar, IAppContext iAppContext);

    void getShareToken(ShareInfoModel shareInfoModel, AbstractC67682e eVar);

    ShareInfoModel obtainShareInfo();

    AbstractC67679a obtainShareInfoCallback();
}
