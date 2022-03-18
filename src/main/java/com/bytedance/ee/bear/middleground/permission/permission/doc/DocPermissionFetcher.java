package com.bytedance.ee.bear.middleground.permission.permission.doc;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission;
import com.bytedance.ee.bear.share.export.OwnerInfo;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\tJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\tJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\tJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocPermissionFetcher;", "", "()V", "batchDocUserPermission", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/middleground/permission/permission/doc/BatchDocUserPermission;", "objs", "", "", "", "fetchDocPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/DocPermission;", "token", ShareHitPoint.f121869d, "fetchDocPublicPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocPublicPermission;", "fetchDocUserPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocUserPermission;", "isPermissionDenied", "", "throwable", "", "resolveForbiddenUserPermission", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.c */
public final class DocPermissionFetcher {

    /* renamed from: a */
    public static final Companion f26851a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocPermissionFetcher$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo38094a(Throwable th) {
        return C5203d.m21235a(th, 4);
    }

    /* renamed from: a */
    public final AbstractC68307f<BatchDocUserPermission> mo38093a(Map<String, Integer> map) {
        Intrinsics.checkParameterIsNotNull(map, "objs");
        return DocPermissionExecutor.f26846a.mo38084a(map);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/FlowableEmitter;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocPublicPermission;", "subscribe"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.c$c */
    public static final class C9934c<T> implements AbstractC68324h<T> {

        /* renamed from: a */
        final /* synthetic */ DocPermissionFetcher f26853a;

        /* renamed from: b */
        final /* synthetic */ String f26854b;

        /* renamed from: c */
        final /* synthetic */ int f26855c;

        C9934c(DocPermissionFetcher cVar, String str, int i) {
            this.f26853a = cVar;
            this.f26854b = str;
            this.f26855c = i;
        }

        @Override // io.reactivex.AbstractC68324h
        public final void subscribe(final AbstractC68323g<IDocPublicPermission> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "emitter");
            DocPermissionExecutor.f26846a.mo38085b(this.f26854b, this.f26855c).mo238001b(new Consumer<IDocPublicPermission>() {
                /* class com.bytedance.ee.bear.middleground.permission.permission.doc.DocPermissionFetcher.C9934c.C99351 */

                /* renamed from: a */
                public final void accept(IDocPublicPermission iDocPublicPermission) {
                    if (!gVar.isCancelled()) {
                        gVar.onNext(iDocPublicPermission);
                    }
                }
            }, new Consumer<Throwable>(this) {
                /* class com.bytedance.ee.bear.middleground.permission.permission.doc.DocPermissionFetcher.C9934c.C99362 */

                /* renamed from: a */
                final /* synthetic */ C9934c f26857a;

                {
                    this.f26857a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: io.reactivex.g */
                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: a */
                public final void accept(Throwable th) {
                    if (!gVar.isCancelled()) {
                        DocPermissionFetcher cVar = this.f26857a.f26853a;
                        Intrinsics.checkExpressionValueIsNotNull(th, "it");
                        if (cVar.mo38094a(th)) {
                            gVar.onNext(new DocPublicPermission(0, 0, 0, 0, false, false, false, false, false, null, false, false, false, null, null, null, 65535, null));
                        } else {
                            gVar.onError(th);
                        }
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/FlowableEmitter;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocUserPermission;", "subscribe"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.c$d */
    public static final class C9937d<T> implements AbstractC68324h<T> {

        /* renamed from: a */
        final /* synthetic */ DocPermissionFetcher f26859a;

        /* renamed from: b */
        final /* synthetic */ String f26860b;

        /* renamed from: c */
        final /* synthetic */ int f26861c;

        C9937d(DocPermissionFetcher cVar, String str, int i) {
            this.f26859a = cVar;
            this.f26860b = str;
            this.f26861c = i;
        }

        @Override // io.reactivex.AbstractC68324h
        public final void subscribe(final AbstractC68323g<IDocUserPermission> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "emitter");
            DocPermissionExecutor.f26846a.mo38083a(this.f26860b, this.f26861c).mo238001b(new Consumer<IDocUserPermission>() {
                /* class com.bytedance.ee.bear.middleground.permission.permission.doc.DocPermissionFetcher.C9937d.C99381 */

                /* renamed from: a */
                public final void accept(IDocUserPermission iDocUserPermission) {
                    if (!gVar.isCancelled()) {
                        gVar.onNext(iDocUserPermission);
                    }
                }
            }, new Consumer<Throwable>(this) {
                /* class com.bytedance.ee.bear.middleground.permission.permission.doc.DocPermissionFetcher.C9937d.C99392 */

                /* renamed from: a */
                final /* synthetic */ C9937d f26863a;

                {
                    this.f26863a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: io.reactivex.g */
                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: a */
                public final void accept(Throwable th) {
                    if (!gVar.isCancelled()) {
                        DocPermissionFetcher cVar = this.f26863a.f26859a;
                        Intrinsics.checkExpressionValueIsNotNull(th, "it");
                        if (cVar.mo38094a(th)) {
                            gVar.onNext(this.f26863a.f26859a.mo38095b(th));
                        } else {
                            gVar.onError(th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final IDocUserPermission mo38095b(Throwable th) {
        DocUserPermission docUserPermission;
        if (th != null) {
            try {
                JSONObject jSONObject = new JSONObject(((NetService.ServerErrorException) th).getJson());
                docUserPermission = new DocUserPermission(0, jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).optInt("permission_status_code"), (OwnerInfo) JSON.parseObject(jSONObject.optJSONObject("meta").optString("owner"), OwnerInfo.class), null, 9, null);
            } catch (Exception e) {
                C13479a.m54758a("DocPermissionFetcher", "parse: " + e);
                docUserPermission = new DocUserPermission(0, 0, null, null, 15, null);
            }
            return docUserPermission;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.contract.NetService.ServerErrorException");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/DocPermission;", "userPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocUserPermission;", "publicPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocPublicPermission;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.c$b */
    public static final class C9933b<T1, T2, R> implements BiFunction<IDocUserPermission, IDocPublicPermission, DocPermission> {

        /* renamed from: a */
        public static final C9933b f26852a = new C9933b();

        C9933b() {
        }

        /* renamed from: a */
        public final DocPermission apply(IDocUserPermission iDocUserPermission, IDocPublicPermission iDocPublicPermission) {
            Intrinsics.checkParameterIsNotNull(iDocUserPermission, "userPermission");
            Intrinsics.checkParameterIsNotNull(iDocPublicPermission, "publicPermission");
            return new DocPermission(iDocUserPermission, iDocPublicPermission);
        }
    }

    /* renamed from: a */
    public final AbstractC68307f<DocPermission> mo38092a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        AbstractC68307f<DocPermission> a = AbstractC68307f.m265092a(mo38096b(str, i), mo38097c(str, i), C9933b.f26852a);
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.zip(userPermFlo…ssion)\n                })");
        return a;
    }

    /* renamed from: b */
    public final AbstractC68307f<IDocUserPermission> mo38096b(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        AbstractC68307f<IDocUserPermission> a = AbstractC68307f.m265080a(new C9937d(this, str, i), BackpressureStrategy.BUFFER);
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.create({ emitte…kpressureStrategy.BUFFER)");
        return a;
    }

    /* renamed from: c */
    public final AbstractC68307f<IDocPublicPermission> mo38097c(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        AbstractC68307f<IDocPublicPermission> a = AbstractC68307f.m265080a(new C9934c(this, str, i), BackpressureStrategy.BUFFER);
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.create({ emitte…kpressureStrategy.BUFFER)");
        return a;
    }
}
