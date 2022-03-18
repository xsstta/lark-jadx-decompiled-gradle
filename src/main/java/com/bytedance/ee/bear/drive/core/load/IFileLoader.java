package com.bytedance.ee.bear.drive.core.load;

import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.loader.model.InfoCode;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001:\u0002\f\rJ\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H'J\b\u0010\t\u001a\u00020\u0003H'J\b\u0010\n\u001a\u00020\u0003H'J\u0012\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/drive/core/load/IFileLoader;", "", "addLoadListener", "", "listener", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$LoadListener;", "load", "loadDirectly", "onAttach", "onDetach", "removeAllLoadListener", "removeLoadListener", "LoadListener", "SimpleLoadListener", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.core.c.b */
public interface IFileLoader {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J'\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0004\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u0001H\u0007H&¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$LoadListener;", "", "onFailed", "", "code", "Lcom/bytedance/ee/bear/drive/loader/model/ErrCode;", "onInfo", "I", "Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;Ljava/lang/Object;)V", "onProgress", "percent", "", "onSuccess", "previewFileModel", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/PreviewFileModel;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.core.c.b$a */
    public interface LoadListener {
        /* renamed from: a */
        void mo25760a(int i);

        /* renamed from: a */
        void mo25511a(ErrCode errCode);

        /* renamed from: a */
        <I> void mo25427a(InfoCode infoCode, I i);

        /* renamed from: a */
        void mo25512a(C7553d dVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J%\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u0001H\bH\u0016¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$SimpleLoadListener;", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$LoadListener;", "()V", "onFailed", "", "code", "Lcom/bytedance/ee/bear/drive/loader/model/ErrCode;", "onInfo", "T", "Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;Ljava/lang/Object;)V", "onProgress", "percent", "", "onSuccess", "previewFileModel", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/PreviewFileModel;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.core.c.b$b */
    public static class SimpleLoadListener implements LoadListener {
        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public void mo25760a(int i) {
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public void mo25511a(ErrCode errCode) {
            Intrinsics.checkParameterIsNotNull(errCode, "code");
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public <T> void mo25427a(InfoCode infoCode, T t) {
            Intrinsics.checkParameterIsNotNull(infoCode, "code");
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public void mo25512a(C7553d dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "previewFileModel");
        }
    }

    /* renamed from: a */
    void mo27297a(LoadListener aVar);

    /* renamed from: b */
    void mo27298b();

    /* renamed from: b */
    void mo27299b(LoadListener aVar);

    /* renamed from: c */
    void mo27300c();

    /* renamed from: d */
    void mo27301d();

    /* renamed from: e */
    void mo27302e();

    /* renamed from: f */
    void mo27307f();
}
