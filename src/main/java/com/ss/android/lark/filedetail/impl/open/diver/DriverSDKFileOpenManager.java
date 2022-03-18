package com.ss.android.lark.filedetail.impl.open.diver;

import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.basesdk.api.AbstractC4385i;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.LocalOpenEntity;
import com.bytedance.ee.bear.drivesdk.PreviewType;
import com.bytedance.ee.bear.drivesdk.action.ShowErrorPageAction;
import com.ss.android.lark.filedetail.FileDetailModule;
import com.ss.android.lark.filedetail.dto.FileDetailLaunchParams;
import com.ss.android.lark.filedetail.p1885a.AbstractC38197a;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/open/diver/DriverSDKFileOpenManager;", "", "()V", "mDriveSDK", "Lcom/bytedance/ee/bear/basesdk/api/IDriveSdk;", "mPreviewTasks", "Ljava/util/HashMap;", "", "Lcom/ss/android/lark/filedetail/impl/open/diver/PreviewTask;", "Lkotlin/collections/HashMap;", "checkAndInit", "", "execPreviewAction", "uniqueId", "action", "Lcom/bytedance/ee/bear/drivesdk/action/ShowErrorPageAction;", "getLocalPreviewFragment", "Landroidx/fragment/app/Fragment;", "localOpenEntity", "Lcom/bytedance/ee/bear/contract/drive/sdk/entity/open/LocalOpenEntity;", "open", "params", "Lcom/ss/android/lark/filedetail/dto/FileDetailLaunchParams;", "Companion", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.open.diver.b */
public final class DriverSDKFileOpenManager {

    /* renamed from: b */
    public static final Lazy f98356b = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C38307b.INSTANCE);

    /* renamed from: c */
    public static final Companion f98357c = new Companion(null);

    /* renamed from: a */
    public final HashMap<String, PreviewTask> f98358a;

    /* renamed from: d */
    private final AbstractC4385i f98359d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/open/diver/DriverSDKFileOpenManager$Companion;", "", "()V", "APP_ID", "", "TAG", "instance", "Lcom/ss/android/lark/filedetail/impl/open/diver/DriverSDKFileOpenManager;", "getInstance", "()Lcom/ss/android/lark/filedetail/impl/open/diver/DriverSDKFileOpenManager;", "instance$delegate", "Lkotlin/Lazy;", "canOpenByDriverSdk", "", "fileExtension", "isSecretChat", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.open.diver.b$a */
    public static final class Companion {
        /* renamed from: a */
        public final DriverSDKFileOpenManager mo140081a() {
            Lazy lazy = DriverSDKFileOpenManager.f98356b;
            Companion aVar = DriverSDKFileOpenManager.f98357c;
            return (DriverSDKFileOpenManager) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo140082a(String str, boolean z) {
            AbstractC4385i iVar;
            AbstractC38197a.AbstractC38204g featureConfigDependency;
            Intrinsics.checkParameterIsNotNull(str, "fileExtension");
            boolean z2 = false;
            if (z) {
                return false;
            }
            AbstractC38197a a = FileDetailModule.f97880b.mo139564a();
            if (a != null) {
                a.checkAndInitDoc();
            }
            AbstractC38197a a2 = FileDetailModule.f97880b.mo139564a();
            if (a2 != null && (featureConfigDependency = a2.getFeatureConfigDependency()) != null && featureConfigDependency.mo139624b()) {
                return true;
            }
            AbstractC38197a a3 = FileDetailModule.f97880b.mo139564a();
            PreviewType previewType = null;
            if (a3 != null) {
                iVar = a3.getDriveSdkWrapper();
            } else {
                iVar = null;
            }
            if (iVar != null) {
                previewType = iVar.mo17056a("1001", str);
            }
            if (previewType != PreviewType.UNSUPPORT) {
                z2 = true;
            }
            Log.m165389i("DriverSDKFileOpenManager", "support preview file?" + z2 + "  file Extension:" + str);
            return z2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/filedetail/impl/open/diver/DriverSDKFileOpenManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.open.diver.b$b */
    static final class C38307b extends Lambda implements Function0<DriverSDKFileOpenManager> {
        public static final C38307b INSTANCE = new C38307b();

        C38307b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DriverSDKFileOpenManager invoke() {
            return new DriverSDKFileOpenManager(null);
        }
    }

    /* renamed from: a */
    public final void mo140078a() {
        AbstractC38197a a = FileDetailModule.f97880b.mo139564a();
        if (a != null) {
            a.checkAndInitDoc();
        }
    }

    private DriverSDKFileOpenManager() {
        AbstractC4385i iVar;
        AbstractC38197a a = FileDetailModule.f97880b.mo139564a();
        if (a != null) {
            iVar = a.getDriveSdkWrapper();
        } else {
            iVar = null;
        }
        this.f98359d = iVar;
        this.f98358a = new HashMap<>();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/filedetail/impl/open/diver/DriverSDKFileOpenManager$open$1", "Lcom/ss/android/lark/filedetail/impl/open/diver/IPreviewLifecycleCallback;", "onClose", "", "onVisibleChange", "p0", "", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.open.diver.b$c */
    public static final class C38308c implements IPreviewLifecycleCallback {

        /* renamed from: a */
        final /* synthetic */ DriverSDKFileOpenManager f98360a;

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef f98361b;

        @Override // com.ss.android.lark.filedetail.impl.open.diver.IPreviewLifecycleCallback
        /* renamed from: a */
        public void mo140084a(boolean z) {
        }

        @Override // com.ss.android.lark.filedetail.impl.open.diver.IPreviewLifecycleCallback
        /* renamed from: a */
        public void mo140083a() {
            this.f98360a.f98358a.remove(this.f98361b.element.mo140097h().getFileContent().getKey());
            Log.m165389i("DriverSDKFileOpenManager", "task finish");
        }

        C38308c(DriverSDKFileOpenManager bVar, Ref.ObjectRef objectRef) {
            this.f98360a = bVar;
            this.f98361b = objectRef;
        }
    }

    public /* synthetic */ DriverSDKFileOpenManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final Fragment mo140077a(LocalOpenEntity localOpenEntity) {
        AbstractC4385i iVar;
        Intrinsics.checkParameterIsNotNull(localOpenEntity, "localOpenEntity");
        AbstractC38197a a = FileDetailModule.f97880b.mo139564a();
        if (a != null) {
            iVar = a.getDriveSdkWrapper();
        } else {
            iVar = null;
        }
        if (iVar != null) {
            return iVar.mo17055a(localOpenEntity);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo140079a(FileDetailLaunchParams fileDetailLaunchParams) {
        Intrinsics.checkParameterIsNotNull(fileDetailLaunchParams, "params");
        if (this.f98359d == null) {
            Log.m165383e("DriverSDKFileOpenManager", "mDriveSDK is null");
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) this.f98358a.get(fileDetailLaunchParams.getFileContent().getKey());
        if (objectRef.element == null) {
            Log.m165389i("DriverSDKFileOpenManager", "create task");
            objectRef.element = (T) new PreviewTask(this.f98359d, fileDetailLaunchParams);
            objectRef.element.mo140088a(new C38308c(this, objectRef));
            this.f98358a.put(fileDetailLaunchParams.getFileContent().getKey(), objectRef.element);
        }
        objectRef.element.mo140091b();
    }

    /* renamed from: a */
    public final void mo140080a(String str, ShowErrorPageAction showErrorPageAction) {
        AbstractC4385i driveSdkWrapper;
        Intrinsics.checkParameterIsNotNull(str, "uniqueId");
        Intrinsics.checkParameterIsNotNull(showErrorPageAction, "action");
        AbstractC38197a a = FileDetailModule.f97880b.mo139564a();
        if (a != null && (driveSdkWrapper = a.getDriveSdkWrapper()) != null) {
            driveSdkWrapper.mo17060a(str, showErrorPageAction);
        }
    }
}
