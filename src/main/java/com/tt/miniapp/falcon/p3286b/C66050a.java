package com.tt.miniapp.falcon.p3286b;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.lark.falcon.engine.bridge.WritableMap;
import com.tt.miniapp.falcon.p3285a.AbstractC66046a;
import com.tt.miniapp.falcon.p3285a.AbstractC66047b;
import com.tt.miniapp.falcon.p3285a.C66048c;
import com.tt.miniapp.falcon.p3285a.C66049d;
import com.tt.miniapp.p3324r.C66717c;
import java.nio.ByteBuffer;

/* renamed from: com.tt.miniapp.falcon.b.a */
public class C66050a extends C66717c {

    /* renamed from: a */
    private C66049d f166715a;

    @Override // com.tt.miniapp.p3324r.C66717c
    /* renamed from: b */
    public void mo231148b() {
    }

    public C66050a() {
        this.f166715a = new C66049d();
    }

    @Override // com.tt.miniapp.p3324r.C66717c
    /* renamed from: a */
    public AbstractC66047b mo231144a() {
        return new C66049d();
    }

    @Override // com.tt.miniapp.p3324r.C66717c
    /* renamed from: a */
    public int mo231142a(String str) {
        return this.f166715a.getInt(str);
    }

    @Override // com.tt.miniapp.p3324r.C66717c
    /* renamed from: b */
    public String mo231147b(String str) {
        return this.f166715a.getString(str);
    }

    @Override // com.tt.miniapp.p3324r.C66717c
    /* renamed from: c */
    public boolean mo231149c(String str) {
        return this.f166715a.getBoolean(str);
    }

    @Override // com.tt.miniapp.p3324r.C66717c
    /* renamed from: a */
    public AbstractC66046a mo231143a(int i) {
        return new C66048c();
    }

    public C66050a(WritableMap writableMap) {
        this.f166715a = new C66049d(writableMap);
    }

    @Override // com.tt.miniapp.p3324r.C66717c
    /* renamed from: d */
    public AbstractC66046a mo231150d(String str) {
        try {
            C66049d dVar = this.f166715a;
            if (dVar != null) {
                return dVar.mo231138a(str);
            }
            throw new RuntimeException("mApiParams is null");
        } catch (Throwable th) {
            if ("not an object".equals(th.getMessage())) {
                AppBrandLogger.m52830i("FalconApiExecuteContext", "no this key :" + str);
            } else {
                AppBrandLogger.m52829e("FalconApiExecuteContext", "prop is not exist", str, th);
            }
            return null;
        }
    }

    @Override // com.tt.miniapp.p3324r.C66717c
    /* renamed from: a */
    public <T> T mo231145a(AbstractC66046a aVar, int i, Class<T> cls) {
        if (cls == AbstractC66047b.class) {
            try {
                return (T) aVar.getObject(i);
            } catch (Throwable th) {
                AppBrandLogger.m52829e("FalconApiExecuteContext", "prop is not exist", th);
                return null;
            }
        } else if (cls == AbstractC66046a.class) {
            try {
                return (T) aVar.mo81263a(i);
            } catch (Throwable th2) {
                AppBrandLogger.m52829e("FalconApiExecuteContext", "prop is not exist", th2);
                return null;
            }
        } else if (cls == Integer.class) {
            return (T) Integer.valueOf(aVar.getInt(i));
        } else {
            if (cls == Boolean.class) {
                return (T) Boolean.valueOf(aVar.getBoolean(i));
            }
            if (cls == String.class) {
                return (T) aVar.getString(i);
            }
            return null;
        }
    }

    @Override // com.tt.miniapp.p3324r.C66717c
    /* renamed from: a */
    public <T> T mo231146a(AbstractC66047b bVar, String str, Class<T> cls) {
        if (cls == AbstractC66047b.class) {
            try {
                return (T) bVar.getObject(str);
            } catch (Throwable th) {
                AppBrandLogger.m52829e("FalconApiExecuteContext", "prop is not exist", th);
                return null;
            }
        } else if (cls == AbstractC66046a.class) {
            if (!(bVar instanceof C66049d)) {
                return null;
            }
            try {
                return (T) ((C66049d) bVar).mo231138a(str);
            } catch (Throwable th2) {
                AppBrandLogger.m52829e("FalconApiExecuteContext", "prop is not exist", th2);
                return null;
            }
        } else if (cls == ByteBuffer.class) {
            if (!(bVar instanceof C66049d)) {
                return null;
            }
            try {
                return (T) ByteBuffer.wrap(((C66049d) bVar).mo231137a().getByteArray(str));
            } catch (Throwable th3) {
                AppBrandLogger.m52829e("FalconApiExecuteContext", "prop is not exist", th3);
                return null;
            }
        } else if (cls == Integer.class) {
            return (T) Integer.valueOf(bVar.getInt(str));
        } else {
            if (cls == Boolean.class) {
                return (T) Boolean.valueOf(bVar.getBoolean(str));
            }
            if (cls == String.class) {
                return (T) bVar.getString(str);
            }
            return null;
        }
    }
}
