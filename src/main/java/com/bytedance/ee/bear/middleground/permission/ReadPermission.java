package com.bytedance.ee.bear.middleground.permission;

import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.permission.permission.doc.BatchDocUserPermission;
import com.bytedance.ee.bear.middleground.permission.permission.doc.DocPermissionFetcher;
import com.bytedance.ee.bear.middleground.permission.permission.doc.DocUserPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.PermissionDataV2;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 %2\u00020\u0001:\u0002%&B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001e\u0010\u0004\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00060\u0005¢\u0006\u0002\u0010\nJ\u0014\u0010\u0014\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J2\u0010\u001a\u001a\u00020\t2\u0018\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0003H\u0002J\u0006\u0010!\u001a\u00020\tJ\u0016\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0003R)\u0010\u0004\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/ReadPermission;", "", ShareHitPoint.f121868c, "", "callback", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function1;", "", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/PermissionDataV2;", "", "(Ljava/lang/String;Ljava/lang/ref/WeakReference;)V", "getCallback", "()Ljava/lang/ref/WeakReference;", "fg", "", "permissionListenerMap", "", "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "getSource", "()Ljava/lang/String;", "addReadPermissionListener", "files", "Lcom/bytedance/ee/bear/middleground/permission/ReadPermission$FileInfo;", "call", "resultPer", "Lcom/bytedance/ee/bear/middleground/permission/permission/doc/BatchDocUserPermission;", "callError", "resultPers", "", "Lkotlin/Pair;", "", "code", "errorMessage", "clearAll", "removeReadPermissionListener", "documentType", "objToken", "Companion", "FileInfo", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.f */
public final class ReadPermission {

    /* renamed from: a */
    public static final List<ReadPermission> f26795a = new ArrayList();

    /* renamed from: b */
    public static final List<Pair<String, Integer>> f26796b = new ArrayList();

    /* renamed from: c */
    public static long f26797c;

    /* renamed from: d */
    public static final Lazy f26798d = LazyKt.lazy(C9911c.INSTANCE);

    /* renamed from: e */
    public static final Function0<Unit> f26799e = C9910b.INSTANCE;

    /* renamed from: f */
    public static final Companion f26800f = new Companion(null);

    /* renamed from: k */
    private static final Map<String, PermissionDataV2> f26801k = new LinkedHashMap();

    /* renamed from: l */
    private static final Map<String, List<ReadPermission>> f26802l = new LinkedHashMap();

    /* renamed from: g */
    private final Map<String, C8275a> f26803g = new LinkedHashMap();

    /* renamed from: h */
    private final boolean f26804h = C4211a.m17514a().mo16536a("spacekit.mobile.use_permission_manager", false);

    /* renamed from: i */
    private final String f26805i;

    /* renamed from: j */
    private final WeakReference<Function1<List<PermissionDataV2>, Unit>> f26806j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR \u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u0011X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R \u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00190\u00180\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/ReadPermission$Companion;", "", "()V", "TAG", "", "fetchDelayRunnable", "Lkotlin/Function0;", "", "lastRequestTime", "", "mPermissionExecutor", "Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocPermissionFetcher;", "getMPermissionExecutor", "()Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocPermissionFetcher;", "mPermissionExecutor$delegate", "Lkotlin/Lazy;", "objTokenSource", "", "", "Lcom/bytedance/ee/bear/middleground/permission/ReadPermission;", "permissionCacheMap", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/PermissionDataV2;", "readPermissions", "requestCache", "Lkotlin/Pair;", "", "fetchPermission", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.f$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ KProperty[] f26807a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "mPermissionExecutor", "getMPermissionExecutor()Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocPermissionFetcher;"))};

        /* renamed from: b */
        private final DocPermissionFetcher m41225b() {
            Lazy lazy = ReadPermission.f26798d;
            Companion aVar = ReadPermission.f26800f;
            KProperty kProperty = f26807a[0];
            return (DocPermissionFetcher) lazy.getValue();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.ee.bear.middleground.permission.h] */
        /* JADX WARN: Type inference failed for: r1v2, types: [com.bytedance.ee.bear.middleground.permission.h] */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo37724a() {
            /*
            // Method dump skipped, instructions count: 119
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.permission.ReadPermission.Companion.mo37724a():void");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "per", "Lcom/bytedance/ee/bear/middleground/permission/permission/doc/BatchDocUserPermission;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.f$a$a */
        public static final class C9908a<T> implements Consumer<BatchDocUserPermission> {

            /* renamed from: a */
            public static final C9908a f26808a = new C9908a();

            C9908a() {
            }

            /* renamed from: a */
            public final void accept(BatchDocUserPermission batchDocUserPermission) {
                Iterator<T> it = ReadPermission.f26795a.iterator();
                while (it.hasNext()) {
                    Intrinsics.checkExpressionValueIsNotNull(batchDocUserPermission, "per");
                    it.next().mo37721a(batchDocUserPermission);
                }
                ReadPermission.f26800f.mo37724a();
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.f$a$b */
        public static final class C9909b<T> implements Consumer<Throwable> {

            /* renamed from: a */
            final /* synthetic */ List f26809a;

            C9909b(List list) {
                this.f26809a = list;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                int i;
                String str;
                String str2;
                C13479a.m54761a("ReadPermission", th);
                boolean z = th instanceof NetService.ServerErrorException;
                if (z) {
                    i = ((NetService.ServerErrorException) th).getCode();
                } else if (th instanceof NetService.HttpErrorException) {
                    i = ((NetService.HttpErrorException) th).getCode();
                } else {
                    i = -1;
                }
                if (z) {
                    str = ((NetService.ServerErrorException) th).getMsg();
                } else if (th instanceof NetService.HttpErrorException) {
                    str = ((NetService.HttpErrorException) th).getHttpStr();
                } else {
                    str = th.getMessage();
                }
                for (T t : ReadPermission.f26795a) {
                    List<Pair<String, Integer>> list = this.f26809a;
                    if (str != null) {
                        str2 = str;
                    } else {
                        str2 = "";
                    }
                    t.mo37723a(list, i, str2);
                }
                ReadPermission.f26800f.mo37724a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/ReadPermission$FileInfo;", "", "documentType", "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "objToken", "", "(Lcom/bytedance/ee/bear/list/dto/DocumentType;Ljava/lang/String;)V", "getDocumentType", "()Lcom/bytedance/ee/bear/list/dto/DocumentType;", "getObjToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.f$d */
    public static final class FileInfo {

        /* renamed from: a */
        private final C8275a f26810a;

        /* renamed from: b */
        private final String f26811b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FileInfo)) {
                return false;
            }
            FileInfo dVar = (FileInfo) obj;
            return Intrinsics.areEqual(this.f26810a, dVar.f26810a) && Intrinsics.areEqual(this.f26811b, dVar.f26811b);
        }

        public int hashCode() {
            C8275a aVar = this.f26810a;
            int i = 0;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            String str = this.f26811b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "FileInfo(documentType=" + this.f26810a + ", objToken=" + this.f26811b + ")";
        }

        /* renamed from: a */
        public final C8275a mo37727a() {
            return this.f26810a;
        }

        /* renamed from: b */
        public final String mo37728b() {
            return this.f26811b;
        }

        public FileInfo(C8275a aVar, String str) {
            Intrinsics.checkParameterIsNotNull(aVar, "documentType");
            Intrinsics.checkParameterIsNotNull(str, "objToken");
            this.f26810a = aVar;
            this.f26811b = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocPermissionFetcher;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.f$c */
    static final class C9911c extends Lambda implements Function0<DocPermissionFetcher> {
        public static final C9911c INSTANCE = new C9911c();

        C9911c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DocPermissionFetcher invoke() {
            return new DocPermissionFetcher();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.f$b */
    static final class C9910b extends Lambda implements Function0<Unit> {
        public static final C9910b INSTANCE = new C9910b();

        C9910b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            ReadPermission.f26800f.mo37724a();
        }
    }

    /* renamed from: a */
    public final void mo37719a() {
        boolean z;
        C13479a.m54764b("ReadPermission", "clearAll: " + this.f26805i);
        for (Map.Entry<String, C8275a> entry : this.f26803g.entrySet()) {
            List<ReadPermission> list = f26802l.get(entry.getKey());
            if (list != null) {
                list.remove(this);
            }
            List<ReadPermission> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f26801k.remove(entry.getKey());
            }
        }
        this.f26803g.clear();
        f26795a.remove(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v11, resolved type: java.util.Map<java.lang.String, com.bytedance.ee.bear.middleground_permission_export.model.doc.PermissionDataV2> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo37721a(BatchDocUserPermission batchDocUserPermission) {
        Function1<List<PermissionDataV2>, Unit> function1;
        int i;
        ArrayList arrayList = new ArrayList();
        Map<String, Integer> perms = batchDocUserPermission.getPerms();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Integer> entry : perms.entrySet()) {
            if (this.f26803g.containsKey(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            PermissionDataV2 permissionDataV2 = new PermissionDataV2();
            permissionDataV2.setToken((String) entry2.getKey());
            permissionDataV2.setPermission(((Number) entry2.getValue()).intValue());
            Integer num = batchDocUserPermission.getPermissionV2().get(entry2.getKey());
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            permissionDataV2.setPermission_v2(i);
            permissionDataV2.setReadAble(DocUserPermission.Companion.mo38035a(permissionDataV2.getPermission_v2()));
            f26801k.put(entry2.getKey(), permissionDataV2);
            arrayList.add(permissionDataV2);
        }
        if ((!arrayList.isEmpty()) && (function1 = this.f26806j.get()) != null) {
            function1.invoke(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.bytedance.ee.bear.middleground.permission.g] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37722a(java.util.List<com.bytedance.ee.bear.middleground.permission.ReadPermission.FileInfo> r8) {
        /*
        // Method dump skipped, instructions count: 270
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.permission.ReadPermission.mo37722a(java.util.List):void");
    }

    public ReadPermission(String str, WeakReference<Function1<List<PermissionDataV2>, Unit>> weakReference) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(weakReference, "callback");
        this.f26805i = str;
        this.f26806j = weakReference;
        f26795a.add(this);
    }

    /* renamed from: a */
    public final void mo37720a(C8275a aVar, String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(aVar, "documentType");
        Intrinsics.checkParameterIsNotNull(str, "objToken");
        this.f26803g.remove(str);
        if (this.f26803g.isEmpty()) {
            List<ReadPermission> list = f26802l.get(str);
            if (list != null) {
                list.remove(this);
            }
            List<ReadPermission> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f26801k.remove(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo37723a(List<Pair<String, Integer>> list, int i, String str) {
        Function1<List<PermissionDataV2>, Unit> function1;
        ArrayList arrayList = new ArrayList();
        for (Pair<String, Integer> pair : list) {
            PermissionDataV2 permissionDataV2 = new PermissionDataV2();
            permissionDataV2.setToken(pair.getFirst());
            permissionDataV2.setCode(i);
            permissionDataV2.setMessage(str);
            permissionDataV2.setPermission(0);
            permissionDataV2.setPermission_v2(0);
            permissionDataV2.setReadAble(false);
            arrayList.add(permissionDataV2);
        }
        if ((!arrayList.isEmpty()) && (function1 = this.f26806j.get()) != null) {
            function1.invoke(arrayList);
        }
    }
}
