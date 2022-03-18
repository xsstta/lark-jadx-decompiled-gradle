package com.bytedance.ee.bear.drive.core.load;

import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.core.load.listener.LoadListenerUIThreadAdapter;
import com.bytedance.ee.bear.drive.loader.model.InfoCode;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/drive/core/load/AbsFileLoader;", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader;", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "(Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;)V", "mInternalLoadListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$LoadListener;", "mListener", "Lcom/bytedance/ee/bear/drive/core/load/listener/LoadListenerUIThreadAdapter;", "getMListener", "()Lcom/bytedance/ee/bear/drive/core/load/listener/LoadListenerUIThreadAdapter;", "addLoadListener", "", "listener", "load", "onAttach", "onDetach", "removeAllLoadListener", "removeLoadListener", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.core.c.a */
public abstract class AbsFileLoader implements IFileLoader {

    /* renamed from: a */
    private final CopyOnWriteArrayList<IFileLoader.LoadListener> f18754a;

    /* renamed from: b */
    private final LoadListenerUIThreadAdapter f18755b;

    /* renamed from: c */
    private final DrivePluginHost f18756c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final LoadListenerUIThreadAdapter mo27296a() {
        return this.f18755b;
    }

    @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader
    /* renamed from: c */
    public void mo27300c() {
        this.f18754a.clear();
    }

    @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader
    /* renamed from: d */
    public void mo27301d() {
        this.f18755b.mo25427a(InfoCode.OnAttach, null);
    }

    @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader
    /* renamed from: e */
    public void mo27302e() {
        this.f18755b.mo25427a(InfoCode.OnDetach, null);
    }

    @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader
    /* renamed from: b */
    public void mo27298b() {
        C13479a.m54764b("DriveComponent", "load() start->" + getClass().getName());
        this.f18755b.mo25427a(InfoCode.LoadStart, null);
    }

    @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader
    /* renamed from: b */
    public void mo27299b(IFileLoader.LoadListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f18754a.remove(aVar);
    }

    public AbsFileLoader(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        this.f18756c = aVar;
        CopyOnWriteArrayList<IFileLoader.LoadListener> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f18754a = copyOnWriteArrayList;
        this.f18755b = new LoadListenerUIThreadAdapter(copyOnWriteArrayList);
    }

    @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader
    /* renamed from: a */
    public void mo27297a(IFileLoader.LoadListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        if (!this.f18754a.contains(aVar)) {
            this.f18754a.add(aVar);
        }
    }
}
