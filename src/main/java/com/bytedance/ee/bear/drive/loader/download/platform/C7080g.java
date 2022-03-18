package com.bytedance.ee.bear.drive.loader.download.platform;

import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.core.model.AbstractC6950d;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.IProcessor;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.NotSupportProcessor;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.SimilarFileProcessor;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.SourceFileProcessor;
import com.bytedance.ee.bear.drive.mimetype.C7096d;
import com.bytedance.ee.log.C13479a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.g */
public class C7080g {

    /* renamed from: a */
    private AbstractC7077d f19061a;

    C7080g(AbstractC7077d dVar) {
        this.f19061a = dVar;
    }

    /* renamed from: a */
    public IProcessor mo27682a(AbstractC6949c cVar, IDownloader.C7022a aVar) {
        return new NotSupportProcessor(new C7079f(cVar, aVar, this.f19061a));
    }

    /* renamed from: b */
    public IProcessor mo27684b(AbstractC6949c cVar, IDownloader.C7022a aVar) {
        return new SourceFileProcessor(new C7079f(cVar, aVar, this.f19061a));
    }

    /* renamed from: c */
    public IProcessor mo27685c(AbstractC6949c cVar, IDownloader.C7022a aVar) {
        return new SimilarFileProcessor(new C7079f(cVar, aVar, this.f19061a));
    }

    /* renamed from: a */
    private IProcessor m28169a(int i, C7079f fVar) {
        Class d = C7096d.m28351d(i);
        if (d == null) {
            return null;
        }
        try {
            Constructor declaredConstructor = d.getDeclaredConstructor(C7079f.class);
            declaredConstructor.setAccessible(true);
            return (IProcessor) declaredConstructor.newInstance(fVar);
        } catch (Exception e) {
            C13479a.m54758a("DrivePlatform_ProcessorCreator", "createProcessor failed, type: " + i + ", exp: " + e);
            return null;
        }
    }

    /* renamed from: a */
    public List<IProcessor> mo27683a(AbstractC6949c cVar, IDownloader.C7022a aVar, IProcessor iProcessor) {
        List<Integer> n = cVar.mo27398n();
        if (n == null) {
            n = new ArrayList<>(0);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : n) {
            int intValue = num.intValue();
            IProcessor a = m28169a(intValue, new C7079f(cVar, new AbstractC6950d.C6951a(C7096d.m28352e(intValue), C7096d.m28343a(intValue, cVar.mo27373c())), aVar, this.f19061a));
            if (a != null) {
                arrayList.add(a);
            }
        }
        if (arrayList.isEmpty() && iProcessor != null) {
            arrayList.add(iProcessor);
        }
        return arrayList;
    }
}
