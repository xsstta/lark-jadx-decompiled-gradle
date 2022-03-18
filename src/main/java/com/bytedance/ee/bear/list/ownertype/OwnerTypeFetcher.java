package com.bytedance.ee.bear.list.ownertype;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.dto.DocVersion;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J.\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0003R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/list/ownertype/OwnerTypeFetcher;", "", "()V", "API_ENTITY_INFO", "", "TAG", "fetchDocOwnerType", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/list/dto/DocVersion;", "objToken", ShareHitPoint.f121869d, "", "fetchFolderOwnerType", "Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "shareVersion", "isShareFolder", "", "fetchOwnerType", "Lcom/bytedance/ee/bear/list/ownertype/OwnerType;", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.list.ownertype.a */
public final class OwnerTypeFetcher {

    /* renamed from: a */
    public static final OwnerTypeFetcher f23442a = new OwnerTypeFetcher();

    private OwnerTypeFetcher() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/list/dto/DocVersion;", "t", "Lcom/bytedance/ee/bear/list/ownertype/OwnerType;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.ownertype.a$a */
    public static final class C8647a<T, R> implements Function<T, R> {

        /* renamed from: a */
        public static final C8647a f23443a = new C8647a();

        C8647a() {
        }

        /* renamed from: a */
        public final DocVersion apply(OwnerType ownerType) {
            Intrinsics.checkParameterIsNotNull(ownerType, "t");
            return new DocVersion(ownerType.getOwnerType());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/list/dto/DocVersion;", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.ownertype.a$b */
    public static final class C8648b<T, R> implements Function<Throwable, DocVersion> {

        /* renamed from: a */
        public static final C8648b f23444a = new C8648b();

        C8648b() {
        }

        /* renamed from: a */
        public final DocVersion apply(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            C13479a.m54759a("OwnerTypeFetcher", "fetchDocOwnerType()...", th);
            return new DocVersion(0);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "t", "Lcom/bytedance/ee/bear/list/ownertype/OwnerType;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.ownertype.a$c */
    public static final class C8649c<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ int f23445a;

        /* renamed from: b */
        final /* synthetic */ boolean f23446b;

        C8649c(int i, boolean z) {
            this.f23445a = i;
            this.f23446b = z;
        }

        /* renamed from: a */
        public final FolderVersion apply(OwnerType ownerType) {
            Intrinsics.checkParameterIsNotNull(ownerType, "t");
            return new FolderVersion(ownerType.getOwnerType(), this.f23445a, this.f23446b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.ownertype.a$d */
    public static final class C8650d<T, R> implements Function<Throwable, FolderVersion> {

        /* renamed from: a */
        final /* synthetic */ int f23447a;

        /* renamed from: b */
        final /* synthetic */ boolean f23448b;

        C8650d(int i, boolean z) {
            this.f23447a = i;
            this.f23448b = z;
        }

        /* renamed from: a */
        public final FolderVersion apply(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            C13479a.m54759a("OwnerTypeFetcher", "fetchFolderOwnerType()...", th);
            return new FolderVersion(0, this.f23447a, this.f23448b);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<DocVersion> m36177a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "objToken");
        AbstractC68307f<R> f = m36179b(str, i).mo238020d(C8647a.f23443a).mo238029f(C8648b.f23444a);
        Intrinsics.checkExpressionValueIsNotNull(f, "fetchOwnerType(objToken,…sion(0)\n                }");
        return f;
    }

    @JvmStatic
    /* renamed from: b */
    private static final AbstractC68307f<OwnerType> m36179b(String str, int i) {
        NetService.C5077f fVar = new NetService.C5077f("/space/api/explorer/v2/entity/info/");
        fVar.mo20143a(1);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) "obj_token", (Object) str);
        jSONObject2.put((Object) "obj_type", (Object) Integer.valueOf(i));
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((Object) "entities", (Object) jSONArray);
        fVar.mo20153c(jSONObject3.toJSONString());
        AbstractC68307f<OwnerType> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new OwnerTypeParser(i, str)).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "netService.createPuller(…           .pull(request)");
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<FolderVersion> m36178a(String str, int i, int i2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "objToken");
        AbstractC68307f<R> f = m36179b(str, i).mo238020d(new C8649c(i2, z)).mo238029f(new C8650d(i2, z));
        Intrinsics.checkExpressionValueIsNotNull(f, "fetchOwnerType(objToken,…Folder)\n                }");
        return f;
    }
}
