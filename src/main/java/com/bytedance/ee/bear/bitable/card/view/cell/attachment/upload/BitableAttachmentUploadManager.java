package com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload;

import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.viewmodel.p268b.AbstractC4774b;
import com.bytedance.ee.bear.document.documentinfo.DocumentInfo;
import com.bytedance.ee.bear.document.offline.file.upload.AbstractC5948e;
import com.bytedance.ee.bear.document.offline.file.upload.C5945c;
import com.bytedance.ee.bear.document.offline.file.upload.FileUploadModel;
import com.bytedance.ee.bear.document.offline.file.upload.UploadResult;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.fileselector.bean.FileBean;
import com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a;
import com.bytedance.ee.bear.quoto.AbstractC10575k;
import com.bytedance.ee.bear.quoto.FullQuotoConfig;
import com.bytedance.ee.bear.quoto.SingleFileQuotaConfig;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 N2\u00020\u0001:\u0004NOPQB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJH\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0002J \u0010-\u001a\u00020)2\u0006\u0010 \u001a\u00020!2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\rH\u0002J\u0012\u00101\u001a\u0004\u0018\u00010\u000e2\b\u00102\u001a\u0004\u0018\u00010\rJ\"\u00103\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u000104j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`52\u0006\u0010&\u001a\u00020\rJ*\u00103\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u000104j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`52\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\rJ\u0006\u00106\u001a\u00020\u001dJ\u000e\u00107\u001a\u00020\u001d2\u0006\u00108\u001a\u00020\u0011J\u000e\u00109\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\u0013J\u000e\u0010;\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u0015J\u0016\u0010=\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020+2\u0006\u0010?\u001a\u00020+J\u0010\u0010@\u001a\u00020\u001d2\b\u00108\u001a\u0004\u0018\u00010\u0011J\u0010\u0010A\u001a\u00020\u001d2\b\u0010:\u001a\u0004\u0018\u00010\u0013J0\u0010B\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010C2\u0006\u0010E\u001a\u00020)2\u0006\u0010\"\u001a\u00020#2\u0006\u0010F\u001a\u00020\u00152\u0006\u0010G\u001a\u00020HH\u0002J\u000e\u0010I\u001a\u00020J2\u0006\u0010&\u001a\u00020\rJ@\u0010K\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u0010$\u001a\u00020%2\u0006\u0010L\u001a\u00020\r2\u0006\u0010M\u001a\u00020\r2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006R"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/upload/BitableAttachmentUploadManager;", "Landroidx/lifecycle/ViewModel;", "()V", "bitableCardDelegate", "Lcom/bytedance/ee/bear/bitable/card/view/IBitableCardDelegate;", "getBitableCardDelegate", "()Lcom/bytedance/ee/bear/bitable/card/view/IBitableCardDelegate;", "setBitableCardDelegate", "(Lcom/bytedance/ee/bear/bitable/card/view/IBitableCardDelegate;)V", "mCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "mFileTokenToEntityMap", "", "", "Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/upload/PendingUploadAttachmentEntity;", "mFileUploadStatusListeners", "", "Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/upload/BitableAttachmentUploadManager$FileUploadStatusListener;", "mOrientationControlListeners", "Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/upload/BitableAttachmentUploadManager$OrientationControlListener;", "mUploadAttachmentQueue", "Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/upload/UploadAttachmentEntity;", "operationUpdater", "Lcom/bytedance/ee/bear/bitable/card/viewmodel/update/IOperationUpdater;", "getOperationUpdater", "()Lcom/bytedance/ee/bear/bitable/card/viewmodel/update/IOperationUpdater;", "setOperationUpdater", "(Lcom/bytedance/ee/bear/bitable/card/viewmodel/update/IOperationUpdater;)V", "clearAllUploadTasks", "", "clearFileTokenToEntityMap", "constructAttachmentEntity", "media", "Lcom/bytedance/ee/bear/fileselector/bean/FileBean;", "file", "Ljava/io/File;", "targetTable", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/STTable;", "recordId", "fieldId", "fileUploadModel", "Lcom/bytedance/ee/bear/document/offline/file/upload/FileUploadModel;", "pendingUpload", "", "isCameraOnly", "constructFileUploadModel", "documentInfo", "Lcom/bytedance/ee/bear/document/documentinfo/DocumentInfo;", "baseId", "findPendingUploadAttachmentByFileToken", "fileToken", "findUploadingAttachmentList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "pauseAllUploadTasks", "registerFileUploadStatusListener", "fileUploadStatusListener", "registerOrientationControlListener", "orientationControlListener", "removeUploadTasks", "uploadAttachmentEntity", "shouldDisableLandscape", "disable", "isShowingCard", "unregisterFileUploadStatusListener", "unregisterOrientationControlListener", "uploadFile", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/document/offline/file/upload/UploadResult;", "uploadModel", "attachmentEntity", "fileUploadHelper", "Lcom/bytedance/ee/bear/document/offline/file/upload/IFileUploadHelper;", "uploadPendingMedia", "", "uploadSelectedMedia", "editFieldId", "editRecordId", "Companion", "FileUploadStatusListener", "OrientationControlListener", "UploadResultConsumer", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.a */
public final class BitableAttachmentUploadManager extends AbstractC1142af {
    public static final Companion Companion = new Companion(null);
    private AbstractC4712d bitableCardDelegate;
    private C68289a mCompositeDisposable = new C68289a();
    public Map<String, PendingUploadAttachmentEntity> mFileTokenToEntityMap = new ConcurrentHashMap();
    public List<FileUploadStatusListener> mFileUploadStatusListeners = new ArrayList();
    private List<OrientationControlListener> mOrientationControlListeners = new ArrayList();
    public final List<UploadAttachmentEntity> mUploadAttachmentQueue = new CopyOnWriteArrayList();
    private AbstractC4774b operationUpdater;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH&J,\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\rH&J$\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&J.\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H&¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/upload/BitableAttachmentUploadManager$FileUploadStatusListener;", "", "onUpdateProgress", "", "attachmentEntity", "Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/upload/UploadAttachmentEntity;", "editFieldId", "", "editRecordId", "progress", "", "onUploadFail", "errorCode", "", "onUploadStart", "onUploadSuccess", "fileToken", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.a$b */
    public interface FileUploadStatusListener {
        /* renamed from: a */
        void mo18011a(UploadAttachmentEntity uploadAttachmentEntity, String str, String str2);

        /* renamed from: a */
        void mo18012a(UploadAttachmentEntity uploadAttachmentEntity, String str, String str2, float f);

        /* renamed from: a */
        void mo18013a(UploadAttachmentEntity uploadAttachmentEntity, String str, String str2, int i);

        /* renamed from: a */
        void mo18014a(UploadAttachmentEntity uploadAttachmentEntity, String str, String str2, String str3);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/upload/BitableAttachmentUploadManager$OrientationControlListener;", "", "shouldDisableLandscape", "", "disable", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.a$c */
    public interface OrientationControlListener {
        void shouldDisableLandscape(boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/upload/BitableAttachmentUploadManager$Companion;", "", "()V", "ERROR_CODE_NETWORK_DISCONNECTED", "", "MAX_UPLOAD_SIZE_MB", "TAG", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final AbstractC4712d getBitableCardDelegate() {
        return this.bitableCardDelegate;
    }

    public final AbstractC4774b getOperationUpdater() {
        return this.operationUpdater;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.a$g */
    static final class C4579g implements AbstractC68309a {

        /* renamed from: a */
        final /* synthetic */ UploadAttachmentEntity f13535a;

        C4579g(UploadAttachmentEntity uploadAttachmentEntity) {
            this.f13535a = uploadAttachmentEntity;
        }

        @Override // io.reactivex.functions.AbstractC68309a
        public final void run() {
            ((PendingUploadAttachmentEntity) this.f13535a).setPendingUpload(true);
        }
    }

    public final void clearAllUploadTasks() {
        C13479a.m54772d("BitableAttachmentUploadManager", "clearAllUploadTasks()...");
        pauseAllUploadTasks();
        this.mUploadAttachmentQueue.clear();
    }

    public final void clearFileTokenToEntityMap() {
        C13479a.m54772d("BitableAttachmentUploadManager", "clearFileTokenToEntityMap()...");
        this.mFileTokenToEntityMap.clear();
    }

    public final void pauseAllUploadTasks() {
        C13479a.m54772d("BitableAttachmentUploadManager", "pauseAllUploadTasks()...");
        if (!this.mUploadAttachmentQueue.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = this.mUploadAttachmentQueue.iterator();
            while (it.hasNext()) {
                String uploadTaskKey = it.next().getUploadTaskKey();
                if (uploadTaskKey != null) {
                    arrayList.add(uploadTaskKey);
                }
            }
            ((AbstractC9349a) KoinJavaComponent.m268613a(AbstractC9349a.class, null, null, 6, null)).mo35617a(new String[arrayList.size()]);
        }
        this.mCompositeDisposable.mo237935a();
    }

    public final void setBitableCardDelegate(AbstractC4712d dVar) {
        this.bitableCardDelegate = dVar;
    }

    public final void setOperationUpdater(AbstractC4774b bVar) {
        this.operationUpdater = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.a$i */
    public static final class C4581i<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C4581i f13539a = new C4581i();

        C4581i() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a("BitableAttachmentUploadManager", th);
        }
    }

    public final PendingUploadAttachmentEntity findPendingUploadAttachmentByFileToken(String str) {
        if (str != null) {
            return this.mFileTokenToEntityMap.get(str);
        }
        return null;
    }

    public final void removeUploadTasks(UploadAttachmentEntity uploadAttachmentEntity) {
        Intrinsics.checkParameterIsNotNull(uploadAttachmentEntity, "uploadAttachmentEntity");
        this.mUploadAttachmentQueue.remove(uploadAttachmentEntity);
    }

    public final void registerFileUploadStatusListener(FileUploadStatusListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "fileUploadStatusListener");
        if (!this.mFileUploadStatusListeners.contains(bVar)) {
            this.mFileUploadStatusListeners.add(bVar);
        }
    }

    public final void registerOrientationControlListener(OrientationControlListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "orientationControlListener");
        if (!this.mOrientationControlListeners.contains(cVar)) {
            this.mOrientationControlListeners.add(cVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/attachment/upload/BitableAttachmentUploadManager$uploadFile$1", "Lcom/bytedance/ee/bear/document/offline/file/upload/IFileUploadHelper$FileUploadCallback;", "onUpdateProgress", "", "progress", "", "onUploadFinish", "key", "", "onUploadStart", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.a$e */
    public static final class C4577e implements AbstractC5948e.AbstractC5949a {

        /* renamed from: a */
        final /* synthetic */ BitableAttachmentUploadManager f13530a;

        /* renamed from: b */
        final /* synthetic */ UploadAttachmentEntity f13531b;

        @Override // com.bytedance.ee.bear.document.offline.file.upload.AbstractC5948e.AbstractC5949a
        /* renamed from: b */
        public void mo18064b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            C13479a.m54772d("BitableAttachmentUploadManager", "onUploadFinish()... key = " + str + ", editFieldId = " + this.f13531b.getFieldId() + ", editRecordId = " + this.f13531b.getRecordId());
        }

        @Override // com.bytedance.ee.bear.document.offline.file.upload.AbstractC5948e.AbstractC5949a
        /* renamed from: a */
        public void mo18062a(float f) {
            C13479a.m54772d("BitableAttachmentUploadManager", "onUpdateProgress()... progress = " + f + ", editFieldId = " + this.f13531b.getFieldId() + ", editRecordId = " + this.f13531b.getRecordId());
            this.f13531b.setUploadProgress((int) (((float) 100) * f));
            List<FileUploadStatusListener> list = this.f13530a.mFileUploadStatusListeners;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                UploadAttachmentEntity uploadAttachmentEntity = this.f13531b;
                it.next().mo18012a(uploadAttachmentEntity, uploadAttachmentEntity.getFieldId(), this.f13531b.getRecordId(), f);
                arrayList.add(Unit.INSTANCE);
            }
        }

        @Override // com.bytedance.ee.bear.document.offline.file.upload.AbstractC5948e.AbstractC5949a
        /* renamed from: a */
        public void mo18063a(String str) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(str, "key");
            C13479a.m54772d("BitableAttachmentUploadManager", "onUploadStart()... key = " + str + ", editFieldId = " + this.f13531b.getFieldId() + ", editRecordId = " + this.f13531b.getRecordId());
            this.f13531b.setUploadProgress(0);
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f13531b.setUploadTaskKey(str);
            }
            if (!this.f13530a.mUploadAttachmentQueue.contains(this.f13531b)) {
                this.f13530a.mUploadAttachmentQueue.add(0, this.f13531b);
            }
            List<FileUploadStatusListener> list = this.f13530a.mFileUploadStatusListeners;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                UploadAttachmentEntity uploadAttachmentEntity = this.f13531b;
                it.next().mo18011a(uploadAttachmentEntity, uploadAttachmentEntity.getFieldId(), this.f13531b.getRecordId());
                arrayList.add(Unit.INSTANCE);
            }
        }

        C4577e(BitableAttachmentUploadManager aVar, UploadAttachmentEntity uploadAttachmentEntity) {
            this.f13530a = aVar;
            this.f13531b = uploadAttachmentEntity;
        }
    }

    public final ArrayList<UploadAttachmentEntity> findUploadingAttachmentList(String str) {
        Intrinsics.checkParameterIsNotNull(str, "recordId");
        if (!(!this.mUploadAttachmentQueue.isEmpty())) {
            return null;
        }
        ArrayList<UploadAttachmentEntity> arrayList = new ArrayList<>();
        for (UploadAttachmentEntity uploadAttachmentEntity : this.mUploadAttachmentQueue) {
            if (TextUtils.equals(str, uploadAttachmentEntity.getRecordId())) {
                arrayList.add(uploadAttachmentEntity);
            }
        }
        return arrayList;
    }

    public final void unregisterFileUploadStatusListener(FileUploadStatusListener bVar) {
        if (CollectionsKt.contains(this.mFileUploadStatusListeners, bVar)) {
            List<FileUploadStatusListener> list = this.mFileUploadStatusListeners;
            if (list != null) {
                C69121n.m265986c(list).remove(bVar);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        }
    }

    public final void unregisterOrientationControlListener(OrientationControlListener cVar) {
        if (CollectionsKt.contains(this.mOrientationControlListeners, cVar)) {
            List<OrientationControlListener> list = this.mOrientationControlListeners;
            if (list != null) {
                C69121n.m265986c(list).remove(cVar);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00060\u0001R\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/attachment/upload/BitableAttachmentUploadManager$uploadPendingMedia$1$2", "Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/upload/BitableAttachmentUploadManager$UploadResultConsumer;", "Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/upload/BitableAttachmentUploadManager;", "accept", "", "result", "Lcom/bytedance/ee/bear/document/offline/file/upload/UploadResult;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.a$f */
    public static final class C4578f extends UploadResultConsumer {

        /* renamed from: b */
        final /* synthetic */ UploadAttachmentEntity f13532b;

        /* renamed from: c */
        final /* synthetic */ BitableAttachmentUploadManager f13533c;

        /* renamed from: d */
        final /* synthetic */ Ref.IntRef f13534d;

        /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: java.util.Map<java.lang.String, com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.PendingUploadAttachmentEntity> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.BitableAttachmentUploadManager.UploadResultConsumer
        /* renamed from: a */
        public void accept(UploadResult uploadResult) {
            Intrinsics.checkParameterIsNotNull(uploadResult, "result");
            super.accept(uploadResult);
            if (uploadResult.getCode() == 0) {
                this.f13533c.mUploadAttachmentQueue.remove(this.f13532b);
                String fileToken = uploadResult.getFileToken();
                if (fileToken != null) {
                    this.f13533c.mFileTokenToEntityMap.put(fileToken, this.f13532b);
                }
                AbstractC4774b operationUpdater = this.f13533c.getOperationUpdater();
                if (operationUpdater != null) {
                    C4535b table = ((PendingUploadAttachmentEntity) this.f13532b).getTable();
                    C4535b table2 = ((PendingUploadAttachmentEntity) this.f13532b).getTable();
                    String fieldId = ((PendingUploadAttachmentEntity) this.f13532b).getFieldId();
                    String recordId = ((PendingUploadAttachmentEntity) this.f13532b).getRecordId();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f13532b);
                    operationUpdater.mo18610a(table, table2, fieldId, recordId, "add", arrayList);
                    return;
                }
                return;
            }
            ((PendingUploadAttachmentEntity) this.f13532b).setPendingUpload(true);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4578f(UploadAttachmentEntity uploadAttachmentEntity, UploadAttachmentEntity uploadAttachmentEntity2, C4535b bVar, BitableAttachmentUploadManager aVar, Ref.IntRef intRef) {
            super(aVar, uploadAttachmentEntity2, bVar);
            this.f13532b = uploadAttachmentEntity;
            this.f13533c = aVar;
            this.f13534d = intRef;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00060\u0001R\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/attachment/upload/BitableAttachmentUploadManager$uploadSelectedMedia$2", "Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/upload/BitableAttachmentUploadManager$UploadResultConsumer;", "Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/upload/BitableAttachmentUploadManager;", "accept", "", "result", "Lcom/bytedance/ee/bear/document/offline/file/upload/UploadResult;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.a$h */
    public static final class C4580h extends UploadResultConsumer {

        /* renamed from: b */
        final /* synthetic */ BitableAttachmentUploadManager f13536b;

        /* renamed from: c */
        final /* synthetic */ UploadAttachmentEntity f13537c;

        /* renamed from: d */
        final /* synthetic */ C4535b f13538d;

        @Override // com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.BitableAttachmentUploadManager.UploadResultConsumer
        /* renamed from: a */
        public void accept(UploadResult uploadResult) {
            AbstractC4774b operationUpdater;
            Intrinsics.checkParameterIsNotNull(uploadResult, "result");
            this.f13536b.mUploadAttachmentQueue.remove(this.f13537c);
            super.accept(uploadResult);
            if (uploadResult.getCode() == 0 && (operationUpdater = this.f13536b.getOperationUpdater()) != null) {
                C4535b bVar = this.f13538d;
                String fieldId = this.f13537c.getFieldId();
                String recordId = this.f13537c.getRecordId();
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f13537c);
                operationUpdater.mo18610a(bVar, bVar, fieldId, recordId, "add", arrayList);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4580h(BitableAttachmentUploadManager aVar, UploadAttachmentEntity uploadAttachmentEntity, C4535b bVar, UploadAttachmentEntity uploadAttachmentEntity2, C4535b bVar2) {
            super(aVar, uploadAttachmentEntity2, bVar2);
            this.f13536b = aVar;
            this.f13537c = uploadAttachmentEntity;
            this.f13538d = bVar;
        }
    }

    public final int uploadPendingMedia(String str) {
        AbstractC68307f<UploadResult> b;
        Intrinsics.checkParameterIsNotNull(str, "recordId");
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 0;
        ArrayList<UploadAttachmentEntity> findUploadingAttachmentList = findUploadingAttachmentList(str);
        if (findUploadingAttachmentList != null) {
            ArrayList<UploadAttachmentEntity> arrayList = findUploadingAttachmentList;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (T t : arrayList) {
                if (t instanceof PendingUploadAttachmentEntity) {
                    T t2 = t;
                    if (t2.isPendingUpload()) {
                        intRef.element++;
                        t2.setPendingUpload(false);
                        FileUploadModel uploadModel = t2.getUploadModel();
                        Intrinsics.checkExpressionValueIsNotNull(uploadModel, "entity.uploadModel");
                        FileBean photo = t2.getPhoto();
                        Intrinsics.checkExpressionValueIsNotNull(photo, "entity.photo");
                        AbstractC68307f<UploadResult> uploadFile = uploadFile(uploadModel, new File(photo.getPath()), t, new C5945c());
                        if (!(uploadFile == null || (b = uploadFile.mo238008b(new C4579g(t))) == null)) {
                            C4535b table = t2.getTable();
                            Intrinsics.checkExpressionValueIsNotNull(table, "entity.table");
                            Disposable d = b.mo238018d(new C4578f(t, t, table, this, intRef));
                            if (d != null) {
                                this.mCompositeDisposable.mo237937a(d);
                            }
                        }
                    }
                }
                arrayList2.add(Unit.INSTANCE);
            }
        }
        return intRef.element;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/upload/BitableAttachmentUploadManager$UploadResultConsumer;", "Lio/reactivex/functions/Consumer;", "Lcom/bytedance/ee/bear/document/offline/file/upload/UploadResult;", "attachmentEntity", "Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/upload/UploadAttachmentEntity;", "targetTable", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/STTable;", "(Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/upload/BitableAttachmentUploadManager;Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/upload/UploadAttachmentEntity;Lcom/bytedance/ee/bear/bitable/card/model/stmodel/STTable;)V", "accept", "", "result", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.a$d */
    public class UploadResultConsumer implements Consumer<UploadResult> {

        /* renamed from: a */
        final /* synthetic */ BitableAttachmentUploadManager f13527a;

        /* renamed from: b */
        private final UploadAttachmentEntity f13528b;

        /* renamed from: c */
        private final C4535b f13529c;

        /* renamed from: a */
        public void accept(UploadResult uploadResult) {
            FragmentActivity f;
            Intrinsics.checkParameterIsNotNull(uploadResult, "result");
            if (uploadResult.getCode() == 0) {
                C13479a.m54764b("BitableAttachmentUploadManager", "onUploadSuccess()... editFieldId = " + this.f13528b.getFieldId() + ", editRecordId = " + this.f13528b.getRecordId());
                String fileToken = uploadResult.getFileToken();
                if (fileToken != null) {
                    this.f13528b.setAttachmentToken(fileToken);
                    this.f13528b.setId(fileToken);
                }
                List<FileUploadStatusListener> list = this.f13527a.mFileUploadStatusListeners;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    UploadAttachmentEntity uploadAttachmentEntity = this.f13528b;
                    it.next().mo18014a(uploadAttachmentEntity, uploadAttachmentEntity.getFieldId(), this.f13528b.getRecordId(), uploadResult.getFileToken());
                    arrayList.add(Unit.INSTANCE);
                }
                return;
            }
            C13479a.m54758a("BitableAttachmentUploadManager", "onUploadFail()... errorCode = " + uploadResult.getCode() + ",  editFieldId = " + this.f13528b.getFieldId() + ", editRecordId = " + this.f13528b.getRecordId());
            AbstractC4712d bitableCardDelegate = this.f13527a.getBitableCardDelegate();
            if (!(bitableCardDelegate == null || (f = bitableCardDelegate.mo17873f()) == null)) {
                if (uploadResult.getCode() == 11001 || uploadResult.getCode() == 13001) {
                    ((AbstractC10575k) KoinJavaComponent.m268613a(AbstractC10575k.class, null, null, 6, null)).mo40012a(f, FullQuotoConfig.UPLOAD);
                } else if (uploadResult.getCode() == 90001061 || uploadResult.getCode() == 90003061) {
                    ((AbstractC10575k) KoinJavaComponent.m268613a(AbstractC10575k.class, null, null, 6, null)).mo40013a(f, this.f13528b.getMountNodeToken(), this.f13528b.getMountPointType(), false);
                } else if (((AbstractC10575k) KoinJavaComponent.m268613a(AbstractC10575k.class, null, null, 6, null)).mo40015a(uploadResult.getCode())) {
                    ((AbstractC10575k) KoinJavaComponent.m268613a(AbstractC10575k.class, null, null, 6, null)).mo40011a(f, SingleFileQuotaConfig.UPLOAD, Long.valueOf(this.f13528b.getSize()));
                } else if (uploadResult.getCode() == 1007) {
                    Toast.showText(f, (int) R.string.Bitable_Field_NetworkError);
                } else {
                    Toast.showText(f, (int) R.string.Doc_Facade_UploadFail);
                }
            }
            List<FileUploadStatusListener> list2 = this.f13527a.mFileUploadStatusListeners;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                UploadAttachmentEntity uploadAttachmentEntity2 = this.f13528b;
                it2.next().mo18013a(uploadAttachmentEntity2, uploadAttachmentEntity2.getFieldId(), this.f13528b.getRecordId(), uploadResult.getCode());
                arrayList2.add(Unit.INSTANCE);
            }
        }

        public UploadResultConsumer(BitableAttachmentUploadManager aVar, UploadAttachmentEntity uploadAttachmentEntity, C4535b bVar) {
            Intrinsics.checkParameterIsNotNull(uploadAttachmentEntity, "attachmentEntity");
            Intrinsics.checkParameterIsNotNull(bVar, "targetTable");
            this.f13527a = aVar;
            this.f13528b = uploadAttachmentEntity;
            this.f13529c = bVar;
        }
    }

    public final void shouldDisableLandscape(boolean z, boolean z2) {
        boolean z3;
        if (z) {
            List<UploadAttachmentEntity> list = this.mUploadAttachmentQueue;
            if (list == null || list.isEmpty()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                return;
            }
        }
        if (z || !(true ^ this.mUploadAttachmentQueue.isEmpty()) || !z2) {
            for (OrientationControlListener cVar : this.mOrientationControlListeners) {
                cVar.shouldDisableLandscape(z);
            }
        }
    }

    public final ArrayList<UploadAttachmentEntity> findUploadingAttachmentList(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "recordId");
        Intrinsics.checkParameterIsNotNull(str2, "fieldId");
        if (!(!this.mUploadAttachmentQueue.isEmpty())) {
            return null;
        }
        ArrayList<UploadAttachmentEntity> arrayList = new ArrayList<>();
        for (UploadAttachmentEntity uploadAttachmentEntity : this.mUploadAttachmentQueue) {
            if (TextUtils.equals(str, uploadAttachmentEntity.getRecordId()) && TextUtils.equals(str2, uploadAttachmentEntity.getFieldId())) {
                arrayList.add(uploadAttachmentEntity);
            }
        }
        return arrayList;
    }

    private final FileUploadModel constructFileUploadModel(FileBean fileBean, DocumentInfo documentInfo, String str) {
        FileUploadModel fileUploadModel = new FileUploadModel();
        fileUploadModel.setUploadType(1);
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkExpressionValueIsNotNull(uuid, "UUID.randomUUID().toString()");
        fileUploadModel.setUuids(new String[]{uuid});
        StringBuilder sb = new StringBuilder();
        sb.append("docsource://com.bytedance.net/file/f/");
        sb.append(uuid);
        String path = fileBean.getPath();
        Intrinsics.checkExpressionValueIsNotNull(path, "media.path");
        String path2 = fileBean.getPath();
        Intrinsics.checkExpressionValueIsNotNull(path2, "media.path");
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) path2, ".", 0, false, 6, (Object) null);
        if (path != null) {
            String substring = path.substring(lastIndexOf$default);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            fileUploadModel.setFile_url(sb.toString());
            fileUploadModel.setDoc_url(documentInfo.getUrl());
            fileUploadModel.setToken(documentInfo.getObjToken());
            fileUploadModel.setContentType(fileBean.getMimeType());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("token", documentInfo.getObjToken());
            linkedHashMap.put("obj_type", String.valueOf(documentInfo.getType()));
            fileUploadModel.setMultiparts(linkedHashMap);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("mount_point", "bitable_file");
            linkedHashMap2.put("mount_node_token", str);
            linkedHashMap2.put("obj_type", String.valueOf(documentInfo.getType()));
            fileUploadModel.setUploadParams(linkedHashMap2);
            return fileUploadModel;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    private final AbstractC68307f<UploadResult> uploadFile(FileUploadModel fileUploadModel, File file, UploadAttachmentEntity uploadAttachmentEntity, AbstractC5948e eVar) {
        return eVar.mo18066a(fileUploadModel, false, file.getAbsolutePath(), fileUploadModel.getMultiparts(), null, null, new C4577e(this, uploadAttachmentEntity));
    }

    public final void uploadSelectedMedia(FileBean fileBean, DocumentInfo documentInfo, C4535b bVar, String str, String str2, boolean z, boolean z2) {
        C4580h hVar;
        C4582b bVar2;
        Disposable b;
        FragmentActivity f;
        Intrinsics.checkParameterIsNotNull(fileBean, "media");
        Intrinsics.checkParameterIsNotNull(bVar, "targetTable");
        Intrinsics.checkParameterIsNotNull(str, "editFieldId");
        Intrinsics.checkParameterIsNotNull(str2, "editRecordId");
        if (documentInfo == null) {
            AbstractC4712d dVar = this.bitableCardDelegate;
            if (dVar != null && (f = dVar.mo17873f()) != null) {
                Toast.showText(f, (int) R.string.Doc_Facade_UploadFail);
                return;
            }
            return;
        }
        File file = new File(fileBean.getPath());
        String a = bVar.mo17757a();
        Intrinsics.checkExpressionValueIsNotNull(a, "targetTable.baseId");
        FileUploadModel constructFileUploadModel = constructFileUploadModel(fileBean, documentInfo, a);
        UploadAttachmentEntity constructAttachmentEntity = constructAttachmentEntity(fileBean, file, bVar, str2, str, constructFileUploadModel, z, z2);
        if (z) {
            bVar2 = new C4582b();
            hVar = new UploadResultConsumer(this, constructAttachmentEntity, bVar);
        } else {
            hVar = new C4580h(this, constructAttachmentEntity, bVar, constructAttachmentEntity, bVar);
            bVar2 = new C5945c();
        }
        AbstractC68307f<UploadResult> uploadFile = uploadFile(constructFileUploadModel, file, constructAttachmentEntity, bVar2);
        if (uploadFile != null && (b = uploadFile.mo238001b(hVar, C4581i.f13539a)) != null) {
            this.mCompositeDisposable.mo237937a(b);
        }
    }

    private final UploadAttachmentEntity constructAttachmentEntity(FileBean fileBean, File file, C4535b bVar, String str, String str2, FileUploadModel fileUploadModel, boolean z, boolean z2) {
        PendingUploadAttachmentEntity pendingUploadAttachmentEntity;
        if (z) {
            PendingUploadAttachmentEntity pendingUploadAttachmentEntity2 = new PendingUploadAttachmentEntity();
            pendingUploadAttachmentEntity2.setPendingUpload(true);
            pendingUploadAttachmentEntity2.setUploadModel(fileUploadModel);
            pendingUploadAttachmentEntity2.setPhoto(fileBean);
            pendingUploadAttachmentEntity2.setTable(bVar);
            pendingUploadAttachmentEntity = pendingUploadAttachmentEntity2;
        } else {
            pendingUploadAttachmentEntity = new UploadAttachmentEntity();
        }
        pendingUploadAttachmentEntity.setMimeType(fileBean.getMimeType());
        pendingUploadAttachmentEntity.setName(file.getName());
        pendingUploadAttachmentEntity.setSize(file.length());
        pendingUploadAttachmentEntity.setWidth(fileBean.getWidth());
        pendingUploadAttachmentEntity.setHeight(fileBean.getHeight());
        pendingUploadAttachmentEntity.setMountPointType("bitable_file");
        pendingUploadAttachmentEntity.setMountNodeToken(bVar.mo17757a());
        pendingUploadAttachmentEntity.setRecordId(str);
        pendingUploadAttachmentEntity.setFieldId(str2);
        pendingUploadAttachmentEntity.setCameraOnly(z2);
        return pendingUploadAttachmentEntity;
    }
}
