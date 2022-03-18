package com.ss.lark.android.passport.biz.feature.applink_to_idp.p3220a;

import android.content.Context;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.lark.android.passport.biz.feature.applink_to_idp.p3220a.C64622d;

/* renamed from: com.ss.lark.android.passport.biz.feature.applink_to_idp.a.b */
public class C64613b extends AbstractC49021b<C64622d.AbstractC64623a, C64622d.AbstractC64624b, C64622d.AbstractC64624b.AbstractC64625a> {

    /* renamed from: d */
    private Context f163078d;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C64622d.AbstractC64624b.AbstractC64625a mo171180c() {
        return new C64614a();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        ((C64622d.AbstractC64624b) mo171181d()).mo223416a(((C64622d.AbstractC64623a) mo171182e()).mo223413g());
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.applink_to_idp.a.b$a */
    public class C64614a implements C64622d.AbstractC64624b.AbstractC64625a {
        public C64614a() {
        }
    }

    public C64613b(Context context, C64622d.AbstractC64623a aVar, C64622d.AbstractC64624b bVar, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        this.f163078d = context;
    }
}
