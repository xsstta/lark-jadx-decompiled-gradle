package com.ss.android.lark.filedetail.impl.open.diver;

import com.larksuite.framework.callback.AbstractC25968b;
import com.larksuite.framework.callback.UICallbackExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/open/diver/DownloadProgressCallbackWrap;", "Lcom/larksuite/framework/callback/CancelableCallback;", "Lcom/ss/android/lark/filedetail/impl/open/diver/IDownloadProgressCallback;", "callback", "(Lcom/ss/android/lark/filedetail/impl/open/diver/IDownloadProgressCallback;)V", "onUpdateProgress", "", "total", "", "curPos", "", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.open.diver.a */
public final class DownloadProgressCallbackWrap extends AbstractC25968b<IDownloadProgressCallback> implements IDownloadProgressCallback {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.open.diver.a$a */
    public static final class RunnableC38306a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DownloadProgressCallbackWrap f98353a;

        /* renamed from: b */
        final /* synthetic */ long f98354b;

        /* renamed from: c */
        final /* synthetic */ int f98355c;

        RunnableC38306a(DownloadProgressCallbackWrap aVar, long j, int i) {
            this.f98353a = aVar;
            this.f98354b = j;
            this.f98355c = i;
        }

        public final void run() {
            if (((IDownloadProgressCallback) this.f98353a.callback) != null) {
                ((IDownloadProgressCallback) this.f98353a.callback).mo140075a(this.f98354b, this.f98355c);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DownloadProgressCallbackWrap(IDownloadProgressCallback cVar) {
        super(cVar);
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
    }

    @Override // com.ss.android.lark.filedetail.impl.open.diver.IDownloadProgressCallback
    /* renamed from: a */
    public void mo140075a(long j, int i) {
        UICallbackExecutor.post(new RunnableC38306a(this, j, i));
    }
}
