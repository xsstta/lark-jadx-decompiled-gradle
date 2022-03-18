package com.bytedance.ee.bear.drive.core.load.listener;

import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.loader.model.InfoCode;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13748k;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J%\u0010\t\u001a\u00020\u0006\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0007\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u0001H\nH\u0016¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/drive/core/load/listener/LoadListenerUIThreadAdapter;", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$LoadListener;", "listeners", "", "(Ljava/util/List;)V", "onFailed", "", "code", "Lcom/bytedance/ee/bear/drive/loader/model/ErrCode;", "onInfo", "I", "Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;Ljava/lang/Object;)V", "onProgress", "percent", "", "onSuccess", "previewFileModel", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/PreviewFileModel;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.core.c.a.a */
public final class LoadListenerUIThreadAdapter implements IFileLoader.LoadListener {

    /* renamed from: a */
    public final List<IFileLoader.LoadListener> f18757a;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.core.c.a.a$a */
    public static final class RunnableC6942a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LoadListenerUIThreadAdapter f18758a;

        /* renamed from: b */
        final /* synthetic */ ErrCode f18759b;

        RunnableC6942a(LoadListenerUIThreadAdapter aVar, ErrCode errCode) {
            this.f18758a = aVar;
            this.f18759b = errCode;
        }

        public final void run() {
            for (IFileLoader.LoadListener aVar : this.f18758a.f18757a) {
                if (aVar != null) {
                    aVar.mo25511a(this.f18759b);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "I", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.core.c.a.a$b */
    public static final class RunnableC6943b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LoadListenerUIThreadAdapter f18760a;

        /* renamed from: b */
        final /* synthetic */ InfoCode f18761b;

        /* renamed from: c */
        final /* synthetic */ Object f18762c;

        RunnableC6943b(LoadListenerUIThreadAdapter aVar, InfoCode infoCode, Object obj) {
            this.f18760a = aVar;
            this.f18761b = infoCode;
            this.f18762c = obj;
        }

        public final void run() {
            for (IFileLoader.LoadListener aVar : this.f18760a.f18757a) {
                if (aVar != null) {
                    aVar.mo25427a(this.f18761b, this.f18762c);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.core.c.a.a$c */
    static final class RunnableC6944c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LoadListenerUIThreadAdapter f18763a;

        /* renamed from: b */
        final /* synthetic */ int f18764b;

        RunnableC6944c(LoadListenerUIThreadAdapter aVar, int i) {
            this.f18763a = aVar;
            this.f18764b = i;
        }

        public final void run() {
            for (IFileLoader.LoadListener aVar : this.f18763a.f18757a) {
                if (aVar != null) {
                    aVar.mo25760a(this.f18764b);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.core.c.a.a$d */
    public static final class RunnableC6945d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LoadListenerUIThreadAdapter f18765a;

        /* renamed from: b */
        final /* synthetic */ C7553d f18766b;

        RunnableC6945d(LoadListenerUIThreadAdapter aVar, C7553d dVar) {
            this.f18765a = aVar;
            this.f18766b = dVar;
        }

        public final void run() {
            for (IFileLoader.LoadListener aVar : this.f18765a.f18757a) {
                if (aVar != null) {
                    aVar.mo25512a(this.f18766b);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.bytedance.ee.bear.drive.core.c.b$a> */
    /* JADX WARN: Multi-variable type inference failed */
    public LoadListenerUIThreadAdapter(List<? extends IFileLoader.LoadListener> list) {
        Intrinsics.checkParameterIsNotNull(list, "listeners");
        this.f18757a = list;
    }

    @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
    /* renamed from: a */
    public void mo25512a(C7553d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "previewFileModel");
        C13479a.m54764b("DriveComponent", "load()#onSuccess");
        C13748k.m55732a(new RunnableC6945d(this, dVar));
    }

    @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
    /* renamed from: a */
    public void mo25760a(int i) {
        if (i == 0 || i == 100) {
            C13479a.m54764b("DriveComponent", "load()#onProgress=" + i);
        }
        C13748k.m55732a(new RunnableC6944c(this, i));
    }

    @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
    /* renamed from: a */
    public void mo25511a(ErrCode errCode) {
        Intrinsics.checkParameterIsNotNull(errCode, "code");
        C13479a.m54764b("DriveComponent", "load()#onFailed=" + errCode);
        C13748k.m55732a(new RunnableC6942a(this, errCode));
    }

    @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
    /* renamed from: a */
    public <I> void mo25427a(InfoCode infoCode, I i) {
        Intrinsics.checkParameterIsNotNull(infoCode, "code");
        C13479a.m54764b("DriveComponent", "load()#onInfo=" + infoCode);
        C13748k.m55732a(new RunnableC6943b(this, infoCode, i));
    }
}
