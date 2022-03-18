package com.ss.android.lark.filedetail;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.filedetail.dto.FileDetailLaunchParams;
import com.ss.android.lark.filedetail.dto.FolderManageLaunchParams;
import com.ss.android.lark.filedetail.impl.FileOpenDialogUtils;
import com.ss.android.lark.filedetail.impl.detail.FileDetailController;
import com.ss.android.lark.filedetail.impl.folder.manage.FolderManageActivity;
import com.ss.android.lark.filedetail.impl.folder.manage.FolderManageFragment;
import com.ss.android.lark.filedetail.impl.statistic.DriveHitPoint;
import com.ss.android.lark.filedetail.p1885a.AbstractC38197a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.navigation.Navigation;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0004\u0018\u0019\u001a\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\nJ.\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/filedetail/FileDetailModule;", "", "()V", "openFileMessageDetail", "", "params", "Lcom/ss/android/lark/filedetail/dto/FileDetailLaunchParams;", "openFolderManage", "context", "Landroid/content/Context;", "Lcom/ss/android/lark/filedetail/dto/FolderManageLaunchParams;", "openLKPFile", "file", "Ljava/io/File;", "mime", "", "fileKey", "openLocalFileDetail", "showResourceDeletedByAdminDialog", "isDeleted", "", "onDismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "uploadClickSaveCloudHitPoint", "Companion", "FileDetailFrom", "FolderManagerFrom", "NetworkType", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FileDetailModule {

    /* renamed from: a */
    public static AbstractC38197a f97879a;

    /* renamed from: b */
    public static final Companion f97880b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/filedetail/FileDetailModule$FileDetailFrom;", "", "Companion", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface FileDetailFrom {
        public static final Companion Companion = Companion.f97881a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/filedetail/FileDetailModule$FileDetailFrom$Companion;", "", "()V", "CHAT_HISTORY", "", "FAVORITES", "MAIN", "PIN", "SEARCH", "THREAD", "TODO", GrsBaseInfo.CountryCodeSource.UNKNOWN, "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.filedetail.FileDetailModule$FileDetailFrom$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f97881a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/filedetail/FileDetailModule$FolderManagerFrom;", "", "Companion", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface FolderManagerFrom {
        public static final Companion Companion = Companion.f97882a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/filedetail/FileDetailModule$FolderManagerFrom$Companion;", "", "()V", "CHAT", "", "CHAT_HISTORY", "CHAT_THREAD", "FAVORITES", "MERGE_FORWARD", "PIN", "SEARCH", "THREAD", "THREAD_REPLY", "THREAD_TAB", GrsBaseInfo.CountryCodeSource.UNKNOWN, "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.filedetail.FileDetailModule$FolderManagerFrom$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f97882a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0003J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/filedetail/FileDetailModule$NetworkType;", "", "value", "", "(Ljava/lang/String;II)V", "getNumber", "valueOf", "NO_INTERNET_CONNECTION", "CELLULAR_DATA_NETWORK", "WIFI", "Companion", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum NetworkType {
        NO_INTERNET_CONNECTION(1),
        CELLULAR_DATA_NETWORK(2),
        WIFI(3);
        
        public static final Companion Companion = new Companion(null);
        private final int value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/filedetail/FileDetailModule$NetworkType$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/filedetail/FileDetailModule$NetworkType;", "value", "", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.filedetail.FileDetailModule$NetworkType$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final NetworkType mo139563a(int i) {
                if (i == 1) {
                    return NetworkType.NO_INTERNET_CONNECTION;
                }
                if (i == 2) {
                    return NetworkType.CELLULAR_DATA_NETWORK;
                }
                if (i != 3) {
                    return null;
                }
                return NetworkType.WIFI;
            }
        }

        public final int getNumber() {
            return this.value;
        }

        public final NetworkType valueOf(int i) {
            return Companion.mo139563a(i);
        }

        private NetworkType(int i) {
            this.value = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rXT¢\u0006\u0002\n\u0000R*\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/filedetail/FileDetailModule$Companion;", "", "()V", "EXTRA_LAUNCH_PARAMS", "", "EXTRA_OPEN_PARAMS", "MENU_FLAG_ADD_TO_FAVORITES", "", "MENU_FLAG_ALL", "MENU_FLAG_FORWARD", "MENU_FLAG_SAVE_TO_DRIVE", "TAG", "UNINIT_JUMP_POSITION", "", "value", "Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency;", "dependency", "getDependency", "()Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency;", "setDependency", "(Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency;)V", "getFeatureGatingMap", "", "", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.FileDetailModule$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final AbstractC38197a mo139564a() {
            if (FileDetailModule.f97879a == null) {
                FileDetailModule.f97879a = (AbstractC38197a) ApiUtils.getApi(AbstractC38197a.class);
            }
            return FileDetailModule.f97879a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onOpenPage"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.FileDetailModule$b */
    static final class C38182b implements Navigation.AbstractC57856b {

        /* renamed from: a */
        final /* synthetic */ FolderManageLaunchParams f97883a;

        C38182b(FolderManageLaunchParams folderManageLaunchParams) {
            this.f97883a = folderManageLaunchParams;
        }

        @Override // com.ss.android.lark.utils.navigation.Navigation.AbstractC57856b
        public final void onOpenPage() {
            FolderManageFragment aVar = new FolderManageFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra.launch.params", this.f97883a);
            aVar.setArguments(bundle);
            C36512a.m144041a().mo134762a(aVar, new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b());
        }
    }

    /* renamed from: b */
    public final void mo139560b(FileDetailLaunchParams fileDetailLaunchParams) {
        Intrinsics.checkParameterIsNotNull(fileDetailLaunchParams, "params");
        FileDetailController.f98037a.mo139813b(fileDetailLaunchParams);
    }

    /* renamed from: a */
    public final void mo139558a(FileDetailLaunchParams fileDetailLaunchParams) {
        Intrinsics.checkParameterIsNotNull(fileDetailLaunchParams, "params");
        FileDetailController.f98037a.mo139811a(fileDetailLaunchParams);
    }

    /* renamed from: a */
    public final void mo139559a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "mime");
        DriveHitPoint.f98022a.mo139772a(str);
    }

    /* renamed from: a */
    public final void mo139556a(Context context, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        FileOpenDialogUtils.m150338a(context, z);
    }

    /* renamed from: a */
    public final void mo139554a(Context context, FolderManageLaunchParams folderManageLaunchParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(folderManageLaunchParams, "params");
        Navigation from = Navigation.from(context);
        Intrinsics.checkExpressionValueIsNotNull(from, "Navigation.from(context)");
        if (!DesktopUtil.m144301a(context)) {
            Intent intent = new Intent(context, FolderManageActivity.class);
            intent.putExtra("extra.launch.params", folderManageLaunchParams);
            from.openActivity(intent);
            return;
        }
        String qualifiedName = Reflection.getOrCreateKotlinClass(FolderManageActivity.class).getQualifiedName();
        if (qualifiedName == null) {
            Intrinsics.throwNpe();
        }
        from.openActivity(qualifiedName, new C38182b(folderManageLaunchParams));
    }

    /* renamed from: a */
    public final void mo139557a(Context context, boolean z, DialogInterface.OnDismissListener onDismissListener) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        FileOpenDialogUtils.m150339a(context, z, onDismissListener);
    }

    /* renamed from: a */
    public final void mo139555a(Context context, File file, String str, FileDetailLaunchParams fileDetailLaunchParams, String str2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(file, "file");
        Intrinsics.checkParameterIsNotNull(str, "mime");
        Intrinsics.checkParameterIsNotNull(fileDetailLaunchParams, "params");
        Intrinsics.checkParameterIsNotNull(str2, "fileKey");
        FileDetailController.f98037a.mo139810a(context, file, str, fileDetailLaunchParams, str2);
    }
}
