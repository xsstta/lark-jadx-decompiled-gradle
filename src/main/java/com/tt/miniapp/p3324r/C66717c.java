package com.tt.miniapp.p3324r;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.he.jsbinding.JsContext;
import com.he.jsbinding.JsObject;
import com.tt.miniapp.falcon.p3285a.AbstractC66046a;
import com.tt.miniapp.falcon.p3285a.AbstractC66047b;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tt.miniapp.r.c */
public class C66717c {

    /* renamed from: a */
    private List<SoftReference<JsObject>> f168430a = new ArrayList();

    /* renamed from: b */
    private JsObject f168431b;

    /* renamed from: c */
    private JsContext f168432c;

    protected C66717c() {
    }

    /* renamed from: a */
    public AbstractC66047b mo231144a() {
        JsContext jsContext = this.f168432c;
        if (jsContext == null) {
            return null;
        }
        return jsContext.createObject();
    }

    /* renamed from: b */
    public void mo231148b() {
        List<SoftReference<JsObject>> list = this.f168430a;
        if (!(list == null || list.isEmpty())) {
            for (SoftReference<JsObject> softReference : this.f168430a) {
                JsObject jsObject = softReference.get();
                if (jsObject != null) {
                    try {
                        jsObject.release();
                    } catch (Exception unused) {
                        AppBrandLogger.m52829e("ApiJsExecuteContext", "object release failed");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public int mo231142a(String str) {
        return this.f168431b.getInt(str);
    }

    /* renamed from: b */
    public String mo231147b(String str) {
        return this.f168431b.getString(str);
    }

    /* renamed from: c */
    public boolean mo231149c(String str) {
        return this.f168431b.getBoolean(str);
    }

    /* renamed from: a */
    public AbstractC66046a mo231143a(int i) {
        JsContext jsContext = this.f168432c;
        if (jsContext == null) {
            return null;
        }
        return jsContext.createArray(i);
    }

    public C66717c(JsContext jsContext) {
        this.f168432c = jsContext;
    }

    public C66717c(JsObject jsObject) {
        this.f168431b = jsObject;
        this.f168432c = jsObject.getScopedContext();
    }

    /* renamed from: d */
    public AbstractC66046a mo231150d(String str) {
        try {
            JsObject jsObject = this.f168431b;
            if (jsObject != null) {
                JsObject object = jsObject.getObject(str);
                this.f168430a.add(new SoftReference<>(object));
                return object;
            }
            throw new RuntimeException("mApiParams is null");
        } catch (Exception e) {
            if ("not an object".equals(e.getMessage())) {
                AppBrandLogger.m52830i("ApiJsExecuteContext", "no this key :" + str);
                return null;
            }
            AppBrandLogger.m52829e("ApiJsExecuteContext", "prop is not exist", str, e);
            return null;
        }
    }

    /* renamed from: a */
    public <T> T mo231145a(AbstractC66046a aVar, int i, Class<T> cls) {
        if (cls == AbstractC66047b.class || cls == AbstractC66046a.class) {
            try {
                T t = (T) aVar.getObject(i);
                this.f168430a.add(new SoftReference<>(t));
                return t;
            } catch (Exception e) {
                AppBrandLogger.m52829e("ApiJsExecuteContext", "prop is not exist", e);
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

    /* renamed from: a */
    public <T> T mo231146a(AbstractC66047b bVar, String str, Class<T> cls) {
        if (cls == AbstractC66047b.class || cls == AbstractC66046a.class) {
            try {
                T t = (T) bVar.getObject(str);
                this.f168430a.add(new SoftReference<>(t));
                return t;
            } catch (Exception e) {
                AppBrandLogger.m52829e("ApiJsExecuteContext", "prop is not exist", e);
                return null;
            }
        } else if (cls == ByteBuffer.class) {
            try {
                AbstractC66047b object = bVar.getObject(str);
                this.f168430a.add(new SoftReference<>((JsObject) object));
                return (T) ByteBuffer.wrap(((JsObject) object).asBytes());
            } catch (Exception e2) {
                AppBrandLogger.m52829e("ApiJsExecuteContext", "prop is not exist", e2);
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
