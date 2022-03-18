package com.larksuite.framework.utils.file.direct;

import android.content.Context;
import android.os.Environment;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.framework.utils.file.FileAccessDependency;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.statistics.p3180a.C63690d;
import com.tt.frontendapiinterface.ApiHandler;
import java.io.File;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.am;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0006\u001b\u001c\u001d\u001e\u001f B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, d2 = {"Lcom/larksuite/framework/utils/file/direct/DirectFileAccess;", "", "()V", "TAG", "", "contextDependency", "Lcom/larksuite/framework/utils/file/FileAccessDependency$IContext;", "getContextDependency", "()Lcom/larksuite/framework/utils/file/FileAccessDependency$IContext;", "setContextDependency", "(Lcom/larksuite/framework/utils/file/FileAccessDependency$IContext;)V", "logDependency", "Lcom/larksuite/framework/utils/file/FileAccessDependency$ILogger;", "getLogDependency", "()Lcom/larksuite/framework/utils/file/FileAccessDependency$ILogger;", "generate", "Ljava/io/File;", "params", "Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$StorageParams;", "paramsBuilder", "Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$StorageParams$Builder;", "generateAppExternalPath", "generateAppInternalPath", "generateAppPath", "generateSharedPath", "isStorageStateAccepted", "", "InvalidPathTypeException", "NullContextException", "PathType", "ScopedStorage", "StorageLocation", "StorageParams", "utils_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DirectFileAccess {

    /* renamed from: a */
    public static final DirectFileAccess f64873a = new DirectFileAccess();

    /* renamed from: b */
    private static final FileAccessDependency.ILogger f64874b = new C26273b();

    /* renamed from: c */
    private static FileAccessDependency.IContext f64875c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$PathType;", "", "(Ljava/lang/String;I)V", "ROOT", "CACHE", "CODE_CACHE", "FILES", "utils_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum PathType {
        ROOT,
        CACHE,
        CODE_CACHE,
        FILES
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$ScopedStorage;", "", "(Ljava/lang/String;I)V", GrsBaseInfo.CountryCodeSource.APP, "SHARED", "utils_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ScopedStorage {
        APP,
        SHARED
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$StorageLocation;", "", "(Ljava/lang/String;I)V", "INTERNAL", "EXTERNAL", "utils_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum StorageLocation {
        INTERNAL,
        EXTERNAL
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u0000 32\u00020\u0001:\u000223Bi\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jm\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\tHÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00064"}, d2 = {"Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$StorageParams;", "", "scope", "Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$ScopedStorage;", "location", "Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$StorageLocation;", "pathType", "Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$PathType;", ShareHitPoint.f121869d, "", "context", "Landroid/content/Context;", "storageState", "", "log", "Lcom/larksuite/framework/utils/file/FileAccessDependency$ILogger;", "contextGet", "Lcom/larksuite/framework/utils/file/FileAccessDependency$IContext;", "(Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$ScopedStorage;Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$StorageLocation;Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$PathType;Ljava/lang/String;Landroid/content/Context;Ljava/util/Set;Lcom/larksuite/framework/utils/file/FileAccessDependency$ILogger;Lcom/larksuite/framework/utils/file/FileAccessDependency$IContext;)V", "getContext", "()Landroid/content/Context;", "getContextGet", "()Lcom/larksuite/framework/utils/file/FileAccessDependency$IContext;", "getLocation", "()Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$StorageLocation;", "getLog", "()Lcom/larksuite/framework/utils/file/FileAccessDependency$ILogger;", "getPathType", "()Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$PathType;", "getScope", "()Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$ScopedStorage;", "getStorageState", "()Ljava/util/Set;", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "Builder", "Companion", "utils_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.framework.utils.file.direct.DirectFileAccess$a */
    public static final class StorageParams {

        /* renamed from: a */
        public static final Companion f64876a = new Companion(null);

        /* renamed from: b */
        private final ScopedStorage f64877b;

        /* renamed from: c */
        private final StorageLocation f64878c;

        /* renamed from: d */
        private final PathType f64879d;

        /* renamed from: e */
        private final String f64880e;

        /* renamed from: f */
        private final Context f64881f;

        /* renamed from: g */
        private final Set<String> f64882g;

        /* renamed from: h */
        private final FileAccessDependency.ILogger f64883h;

        /* renamed from: i */
        private final FileAccessDependency.IContext f64884i;

        public StorageParams() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        /* renamed from: a */
        public static /* synthetic */ StorageParams m95111a(StorageParams aVar, ScopedStorage scopedStorage, StorageLocation storageLocation, PathType pathType, String str, Context context, Set set, FileAccessDependency.ILogger bVar, FileAccessDependency.IContext aVar2, int i, Object obj) {
            return aVar.mo93393a((i & 1) != 0 ? aVar.f64877b : scopedStorage, (i & 2) != 0 ? aVar.f64878c : storageLocation, (i & 4) != 0 ? aVar.f64879d : pathType, (i & 8) != 0 ? aVar.f64880e : str, (i & 16) != 0 ? aVar.f64881f : context, (i & 32) != 0 ? aVar.f64882g : set, (i & 64) != 0 ? aVar.f64883h : bVar, (i & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? aVar.f64884i : aVar2);
        }

        @JvmStatic
        /* renamed from: i */
        public static final Builder m95112i() {
            return f64876a.mo93408a();
        }

        /* renamed from: a */
        public final StorageParams mo93393a(ScopedStorage scopedStorage, StorageLocation storageLocation, PathType pathType, String str, Context context, Set<String> set, FileAccessDependency.ILogger bVar, FileAccessDependency.IContext aVar) {
            Intrinsics.checkParameterIsNotNull(set, "storageState");
            return new StorageParams(scopedStorage, storageLocation, pathType, str, context, set, bVar, aVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StorageParams)) {
                return false;
            }
            StorageParams aVar = (StorageParams) obj;
            return Intrinsics.areEqual(this.f64877b, aVar.f64877b) && Intrinsics.areEqual(this.f64878c, aVar.f64878c) && Intrinsics.areEqual(this.f64879d, aVar.f64879d) && Intrinsics.areEqual(this.f64880e, aVar.f64880e) && Intrinsics.areEqual(this.f64881f, aVar.f64881f) && Intrinsics.areEqual(this.f64882g, aVar.f64882g) && Intrinsics.areEqual(this.f64883h, aVar.f64883h) && Intrinsics.areEqual(this.f64884i, aVar.f64884i);
        }

        public int hashCode() {
            ScopedStorage scopedStorage = this.f64877b;
            int i = 0;
            int hashCode = (scopedStorage != null ? scopedStorage.hashCode() : 0) * 31;
            StorageLocation storageLocation = this.f64878c;
            int hashCode2 = (hashCode + (storageLocation != null ? storageLocation.hashCode() : 0)) * 31;
            PathType pathType = this.f64879d;
            int hashCode3 = (hashCode2 + (pathType != null ? pathType.hashCode() : 0)) * 31;
            String str = this.f64880e;
            int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
            Context context = this.f64881f;
            int hashCode5 = (hashCode4 + (context != null ? context.hashCode() : 0)) * 31;
            Set<String> set = this.f64882g;
            int hashCode6 = (hashCode5 + (set != null ? set.hashCode() : 0)) * 31;
            FileAccessDependency.ILogger bVar = this.f64883h;
            int hashCode7 = (hashCode6 + (bVar != null ? bVar.hashCode() : 0)) * 31;
            FileAccessDependency.IContext aVar = this.f64884i;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode7 + i;
        }

        public String toString() {
            return "StorageParams(scope=" + this.f64877b + ", location=" + this.f64878c + ", pathType=" + this.f64879d + ", type=" + this.f64880e + ", context=" + this.f64881f + ", storageState=" + this.f64882g + ", log=" + this.f64883h + ", contextGet=" + this.f64884i + ")";
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$StorageParams$Companion;", "", "()V", "newBuilder", "Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$StorageParams$Builder;", "utils_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.framework.utils.file.direct.DirectFileAccess$a$b */
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            /* renamed from: a */
            public final Builder mo93408a() {
                return new Builder();
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: a */
        public final ScopedStorage mo93392a() {
            return this.f64877b;
        }

        /* renamed from: b */
        public final StorageLocation mo93394b() {
            return this.f64878c;
        }

        /* renamed from: c */
        public final PathType mo93395c() {
            return this.f64879d;
        }

        /* renamed from: d */
        public final String mo93396d() {
            return this.f64880e;
        }

        /* renamed from: e */
        public final Context mo93397e() {
            return this.f64881f;
        }

        /* renamed from: f */
        public final Set<String> mo93399f() {
            return this.f64882g;
        }

        /* renamed from: g */
        public final FileAccessDependency.ILogger mo93400g() {
            return this.f64883h;
        }

        /* renamed from: h */
        public final FileAccessDependency.IContext mo93401h() {
            return this.f64884i;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u0014\u0010\u000f\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$StorageParams$Builder;", "", "()V", "context", "Landroid/content/Context;", "contextGet", "Lcom/larksuite/framework/utils/file/FileAccessDependency$IContext;", "location", "Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$StorageLocation;", "log", "Lcom/larksuite/framework/utils/file/FileAccessDependency$ILogger;", "pathType", "Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$PathType;", "scope", "Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$ScopedStorage;", "storageState", "", "", ShareHitPoint.f121869d, "build", "Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$StorageParams;", "setContext", "setContextGet", "setLocation", "setLog", "setPathType", "setScope", "setType", "utils_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.framework.utils.file.direct.DirectFileAccess$a$a */
        public static final class Builder {

            /* renamed from: a */
            private ScopedStorage f64885a = ScopedStorage.APP;

            /* renamed from: b */
            private StorageLocation f64886b = StorageLocation.INTERNAL;

            /* renamed from: c */
            private PathType f64887c = PathType.FILES;

            /* renamed from: d */
            private String f64888d;

            /* renamed from: e */
            private Context f64889e;

            /* renamed from: f */
            private Set<String> f64890f = am.m265686a("mounted");

            /* renamed from: g */
            private FileAccessDependency.ILogger f64891g = DirectFileAccess.f64873a.mo93390a();

            /* renamed from: h */
            private FileAccessDependency.IContext f64892h = DirectFileAccess.f64873a.mo93391b();

            /* renamed from: a */
            public final StorageParams mo93407a() {
                return new StorageParams(this.f64885a, this.f64886b, this.f64887c, this.f64888d, this.f64889e, this.f64890f, this.f64891g, this.f64892h);
            }

            /* renamed from: a */
            public final Builder mo93404a(Context context) {
                Builder aVar = this;
                aVar.f64889e = context;
                return aVar;
            }

            /* renamed from: a */
            public final Builder mo93405a(PathType pathType) {
                Builder aVar = this;
                aVar.f64887c = pathType;
                return aVar;
            }

            /* renamed from: a */
            public final Builder mo93406a(StorageLocation storageLocation) {
                Builder aVar = this;
                aVar.f64886b = storageLocation;
                return aVar;
            }
        }

        public StorageParams(ScopedStorage scopedStorage, StorageLocation storageLocation, PathType pathType, String str, Context context, Set<String> set, FileAccessDependency.ILogger bVar, FileAccessDependency.IContext aVar) {
            Intrinsics.checkParameterIsNotNull(set, "storageState");
            this.f64877b = scopedStorage;
            this.f64878c = storageLocation;
            this.f64879d = pathType;
            this.f64880e = str;
            this.f64881f = context;
            this.f64882g = set;
            this.f64883h = bVar;
            this.f64884i = aVar;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ StorageParams(com.larksuite.framework.utils.file.direct.DirectFileAccess.ScopedStorage r9, com.larksuite.framework.utils.file.direct.DirectFileAccess.StorageLocation r10, com.larksuite.framework.utils.file.direct.DirectFileAccess.PathType r11, java.lang.String r12, android.content.Context r13, java.util.Set r14, com.larksuite.framework.utils.file.FileAccessDependency.ILogger r15, com.larksuite.framework.utils.file.FileAccessDependency.IContext r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
            /*
                r8 = this;
                r0 = r17
                r1 = r0 & 1
                if (r1 == 0) goto L_0x0009
                com.larksuite.framework.utils.file.direct.DirectFileAccess$ScopedStorage r1 = com.larksuite.framework.utils.file.direct.DirectFileAccess.ScopedStorage.APP
                goto L_0x000a
            L_0x0009:
                r1 = r9
            L_0x000a:
                r2 = r0 & 2
                if (r2 == 0) goto L_0x0011
                com.larksuite.framework.utils.file.direct.DirectFileAccess$StorageLocation r2 = com.larksuite.framework.utils.file.direct.DirectFileAccess.StorageLocation.INTERNAL
                goto L_0x0012
            L_0x0011:
                r2 = r10
            L_0x0012:
                r3 = r0 & 4
                if (r3 == 0) goto L_0x0019
                com.larksuite.framework.utils.file.direct.DirectFileAccess$PathType r3 = com.larksuite.framework.utils.file.direct.DirectFileAccess.PathType.FILES
                goto L_0x001a
            L_0x0019:
                r3 = r11
            L_0x001a:
                r4 = r0 & 8
                r5 = 0
                if (r4 == 0) goto L_0x0023
                r4 = r5
                java.lang.String r4 = (java.lang.String) r4
                goto L_0x0024
            L_0x0023:
                r4 = r12
            L_0x0024:
                r6 = r0 & 16
                if (r6 == 0) goto L_0x002b
                android.content.Context r5 = (android.content.Context) r5
                goto L_0x002c
            L_0x002b:
                r5 = r13
            L_0x002c:
                r6 = r0 & 32
                if (r6 == 0) goto L_0x0037
                java.lang.String r6 = "mounted"
                java.util.Set r6 = kotlin.collections.am.m265686a(r6)
                goto L_0x0038
            L_0x0037:
                r6 = r14
            L_0x0038:
                r7 = r0 & 64
                if (r7 == 0) goto L_0x0043
                com.larksuite.framework.utils.file.direct.DirectFileAccess r7 = com.larksuite.framework.utils.file.direct.DirectFileAccess.f64873a
                com.larksuite.framework.utils.file.a$b r7 = r7.mo93390a()
                goto L_0x0044
            L_0x0043:
                r7 = r15
            L_0x0044:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x004f
                com.larksuite.framework.utils.file.direct.DirectFileAccess r0 = com.larksuite.framework.utils.file.direct.DirectFileAccess.f64873a
                com.larksuite.framework.utils.file.a$a r0 = r0.mo93391b()
                goto L_0x0051
            L_0x004f:
                r0 = r16
            L_0x0051:
                r9 = r8
                r10 = r1
                r11 = r2
                r12 = r3
                r13 = r4
                r14 = r5
                r15 = r6
                r16 = r7
                r17 = r0
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.utils.file.direct.DirectFileAccess.StorageParams.<init>(com.larksuite.framework.utils.file.direct.DirectFileAccess$ScopedStorage, com.larksuite.framework.utils.file.direct.DirectFileAccess$StorageLocation, com.larksuite.framework.utils.file.direct.DirectFileAccess$PathType, java.lang.String, android.content.Context, java.util.Set, com.larksuite.framework.utils.file.a$b, com.larksuite.framework.utils.file.a$a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0014\u0010\b\u001a\u00020\u00032\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/larksuite/framework/utils/file/direct/DirectFileAccess$logDependency$1", "Lcom/larksuite/framework/utils/file/FileAccessDependency$ILogger;", C63690d.f160779a, "", "tag", "", "message", "e", ApiHandler.API_CALLBACK_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "i", "utils_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.framework.utils.file.direct.DirectFileAccess$b */
    public static final class C26273b implements FileAccessDependency.ILogger {
        C26273b() {
        }

        @Override // com.larksuite.framework.utils.file.FileAccessDependency.ILogger
        /* renamed from: a */
        public void mo93388a(Exception exc) {
            Context context;
            Intrinsics.checkParameterIsNotNull(exc, ApiHandler.API_CALLBACK_EXCEPTION);
            FileAccessDependency.IContext b = DirectFileAccess.f64873a.mo93391b();
            if (b != null) {
                context = b.mo93387a();
            } else {
                context = null;
            }
            if (C26284k.m95185a(context)) {
                throw exc;
            }
        }

        @Override // com.larksuite.framework.utils.file.FileAccessDependency.ILogger
        /* renamed from: a */
        public void mo93389a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "tag");
            Intrinsics.checkParameterIsNotNull(str2, "message");
            Log.m165383e(str, str2);
        }
    }

    private DirectFileAccess() {
    }

    /* renamed from: a */
    public final FileAccessDependency.ILogger mo93390a() {
        return f64874b;
    }

    /* renamed from: b */
    public final FileAccessDependency.IContext mo93391b() {
        return f64875c;
    }

    /* renamed from: d */
    private final File m95106d(StorageParams aVar) {
        return AppInternalPathUtils.m95133a(aVar);
    }

    /* renamed from: e */
    private final File m95107e(StorageParams aVar) {
        return AppExternalPathUtils.m95129a(aVar);
    }

    @JvmStatic
    /* renamed from: a */
    public static final File m95102a(StorageParams.Builder aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "paramsBuilder");
        return m95103a(aVar.mo93407a());
    }

    /* renamed from: f */
    private final boolean m95108f(StorageParams aVar) {
        return aVar.mo93399f().contains(Environment.getExternalStorageState());
    }

    @JvmStatic
    /* renamed from: c */
    public static final File m95105c(StorageParams aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        DirectFileAccess directFileAccess = f64873a;
        if (!directFileAccess.m95108f(aVar)) {
            return directFileAccess.m95106d(aVar);
        }
        return SharedExternalPathUtils.f64899a.mo93410a(aVar.mo93396d());
    }

    @JvmStatic
    /* renamed from: a */
    public static final File m95103a(StorageParams aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        ScopedStorage a = aVar.mo93392a();
        if (a != null) {
            int i = C26276e.f64897a[a.ordinal()];
            if (i == 1) {
                return m95104b(aVar);
            }
            if (i == 2) {
                return m95105c(aVar);
            }
        }
        return m95103a(StorageParams.m95111a(aVar, ScopedStorage.APP, null, null, null, null, null, null, null, 254, null));
    }

    @JvmStatic
    /* renamed from: b */
    public static final File m95104b(StorageParams aVar) {
        Context context;
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        if (aVar.mo93397e() == null) {
            FileAccessDependency.IContext h = aVar.mo93401h();
            if (h != null) {
                context = h.mo93387a();
            } else {
                context = null;
            }
            FileAccessDependency.ILogger g = aVar.mo93400g();
            if (g != null) {
                g.mo93389a("DirectFileAccess", "context is null");
            }
            if (context == null) {
                return null;
            }
            FileAccessDependency.ILogger g2 = aVar.mo93400g();
            if (g2 != null) {
                g2.mo93388a(new NullContextException("DirectFileAccess", aVar));
            }
            return m95104b(StorageParams.m95111a(aVar, null, null, null, null, context, null, null, null, 239, null));
        }
        DirectFileAccess directFileAccess = f64873a;
        if (!directFileAccess.m95108f(aVar)) {
            return directFileAccess.m95106d(aVar);
        }
        StorageLocation b = aVar.mo93394b();
        if (b != null) {
            int i = C26276e.f64898b[b.ordinal()];
            if (i == 1) {
                return directFileAccess.m95106d(aVar);
            }
            if (i == 2) {
                return directFileAccess.m95107e(aVar);
            }
        }
        return directFileAccess.m95106d(aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$InvalidPathTypeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "tag", "", "params", "Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$StorageParams;", "(Ljava/lang/String;Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$StorageParams;)V", "utils_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class InvalidPathTypeException extends Exception {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public InvalidPathTypeException(String str, StorageParams aVar) {
            super(str + ": invalid path type: " + aVar.mo93395c());
            Intrinsics.checkParameterIsNotNull(str, "tag");
            Intrinsics.checkParameterIsNotNull(aVar, "params");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$NullContextException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "tag", "", "params", "Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$StorageParams;", "(Ljava/lang/String;Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$StorageParams;)V", "utils_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class NullContextException extends Exception {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NullContextException(String str, StorageParams aVar) {
            super(str + ": context is null, scope: " + aVar.mo93392a() + ", location: " + aVar.mo93394b());
            Intrinsics.checkParameterIsNotNull(str, "tag");
            Intrinsics.checkParameterIsNotNull(aVar, "params");
        }
    }
}
