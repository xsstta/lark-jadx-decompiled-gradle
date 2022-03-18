package com.bytedance.pipeline;

import com.bytedance.pipeline.AbstractC20237f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.pipeline.c */
public class C20234c {
    /* renamed from: a */
    public static <IN> AbstractC20233b<IN> m73894a(List<C20240h> list, AbstractC20237f fVar) {
        return m73895a(list, fVar, (AbstractC20235d) null);
    }

    /* renamed from: a */
    static <IN> AbstractC20233b<IN> m73893a(List<C20240h> list, AbstractC20233b bVar, AbstractC20235d dVar) {
        if (list != null) {
            C20243i iVar = (C20243i) bVar;
            AbstractC20237f fVar = iVar.mInterceptorFactory;
            if (fVar == null) {
                fVar = new AbstractC20237f.C20238a();
            }
            C20243i iVar2 = new C20243i(Collections.unmodifiableList(new ArrayList(list)), 0, fVar, dVar);
            iVar2.setBundleData(iVar.getBundleData());
            return iVar2;
        }
        throw new IllegalArgumentException("interceptors == null !");
    }

    /* renamed from: a */
    static <IN> AbstractC20233b<IN> m73895a(List<C20240h> list, AbstractC20237f fVar, AbstractC20235d dVar) {
        if (list != null) {
            if (fVar == null) {
                fVar = new AbstractC20237f.C20238a();
            }
            return new C20243i(Collections.unmodifiableList(new ArrayList(list)), 0, fVar, dVar);
        }
        throw new IllegalArgumentException("interceptors == null !");
    }
}
