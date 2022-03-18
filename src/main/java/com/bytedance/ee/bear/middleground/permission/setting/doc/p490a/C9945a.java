package com.bytedance.ee.bear.middleground.permission.setting.doc.p490a;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.a.a */
public class C9945a extends C1144ai.C1148d {

    /* renamed from: a */
    private final DocPermSetInfo f26888a;

    private C9945a(DocPermSetInfo docPermSetInfo) {
        this.f26888a = docPermSetInfo;
    }

    /* renamed from: a */
    public static C1144ai.AbstractC1146b m41403a(DocPermSetInfo docPermSetInfo) {
        return new C9945a(docPermSetInfo);
    }

    @Override // androidx.lifecycle.C1144ai.C1148d, androidx.lifecycle.C1144ai.AbstractC1146b
    public <T extends AbstractC1142af> T create(Class<T> cls) {
        cls.getConstructors();
        try {
            return cls.getConstructor(DocPermSetInfo.class).newInstance(this.f26888a);
        } catch (InstantiationException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }
}
