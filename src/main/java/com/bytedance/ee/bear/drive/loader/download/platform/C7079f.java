package com.bytedance.ee.bear.drive.loader.download.platform;

import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.core.model.AbstractC6950d;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.f */
public class C7079f {

    /* renamed from: a */
    private final AbstractC6949c f19057a;

    /* renamed from: b */
    private final AbstractC6950d.C6951a f19058b;

    /* renamed from: c */
    private final IDownloader.C7022a f19059c;

    /* renamed from: d */
    private final AbstractC7077d f19060d;

    /* renamed from: a */
    public AbstractC7077d mo27678a() {
        return this.f19060d;
    }

    /* renamed from: b */
    public AbstractC6949c mo27679b() {
        return this.f19057a;
    }

    /* renamed from: c */
    public AbstractC6950d.C6951a mo27680c() {
        return this.f19058b;
    }

    /* renamed from: d */
    public IDownloader.C7022a mo27681d() {
        return this.f19059c;
    }

    C7079f(AbstractC6949c cVar, IDownloader.C7022a aVar, AbstractC7077d dVar) {
        this.f19057a = cVar;
        this.f19059c = aVar;
        this.f19060d = dVar;
    }

    public C7079f(AbstractC6949c cVar, AbstractC6950d.C6951a aVar, IDownloader.C7022a aVar2, AbstractC7077d dVar) {
        this.f19057a = cVar;
        this.f19058b = aVar;
        this.f19059c = aVar2;
        this.f19060d = dVar;
    }
}
