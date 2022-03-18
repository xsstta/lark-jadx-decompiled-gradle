package com.bytedance.ee.bear.middleground.permission.permission.doc;

import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.bear.middleground.permission.PermFGUtils;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000eJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000fJ\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000fJ\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000fJ\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000fJ\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000fH\u0002J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocPermissionExecutor;", "", "()V", "BATCH_DOC_USER_PERMISSION", "", "DOC_PUBLIC_PERMISSION", "DOC_PUBLIC_PERMISSION_V2", "DOC_USER_PERMISSION", "DOC_USER_PERMISSION_V2", "TAG", "batchDocUserPermission", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/middleground/permission/permission/doc/BatchDocUserPermission;", "objs", "", "", "requestDocPublicPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocPublicPermission;", "token", ShareHitPoint.f121869d, "requestDocPublicPermissionV1", "requestDocPublicPermissionV2", "requestDocUserPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocUserPermission;", "requestDocUserPermissionV1", "requestDocUserPermissionV2", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.b */
public final class DocPermissionExecutor {

    /* renamed from: a */
    public static final DocPermissionExecutor f26846a = new DocPermissionExecutor();

    private DocPermissionExecutor() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocPublicPermission;", "it", "Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocPublicPermission;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.b$a */
    public static final class C9929a<T, R> implements Function<T, R> {

        /* renamed from: a */
        public static final C9929a f26847a = new C9929a();

        C9929a() {
        }

        /* renamed from: a */
        public final IDocPublicPermission apply(DocPublicPermission docPublicPermission) {
            Intrinsics.checkParameterIsNotNull(docPublicPermission, "it");
            return docPublicPermission;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocPublicPermission;", "it", "Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocPublicPermissionV2;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.b$b */
    public static final class C9930b<T, R> implements Function<T, R> {

        /* renamed from: a */
        public static final C9930b f26848a = new C9930b();

        C9930b() {
        }

        /* renamed from: a */
        public final IDocPublicPermission apply(DocPublicPermissionV2 docPublicPermissionV2) {
            Intrinsics.checkParameterIsNotNull(docPublicPermissionV2, "it");
            return docPublicPermissionV2;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocUserPermission;", "it", "Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocUserPermission;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.b$c */
    public static final class C9931c<T, R> implements Function<T, R> {

        /* renamed from: a */
        public static final C9931c f26849a = new C9931c();

        C9931c() {
        }

        /* renamed from: a */
        public final IDocUserPermission apply(DocUserPermission docUserPermission) {
            Intrinsics.checkParameterIsNotNull(docUserPermission, "it");
            return docUserPermission;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocUserPermission;", "it", "Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocUserPermissionV2;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.b$d */
    public static final class C9932d<T, R> implements Function<T, R> {

        /* renamed from: a */
        public static final C9932d f26850a = new C9932d();

        C9932d() {
        }

        /* renamed from: a */
        public final IDocUserPermission apply(DocUserPermissionV2 docUserPermissionV2) {
            Intrinsics.checkParameterIsNotNull(docUserPermissionV2, "it");
            return docUserPermissionV2;
        }
    }

    /* renamed from: a */
    public final AbstractC68307f<BatchDocUserPermission> mo38084a(Map<String, Integer> map) {
        Intrinsics.checkParameterIsNotNull(map, "objs");
        NetService.C5077f fVar = new NetService.C5077f("/space/api/suite/permission/objects/");
        fVar.mo20143a(1);
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (Pair pair : MapsKt.toList(map)) {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = jSONObject2;
            jSONObject3.put((Object) "token", pair.getFirst());
            jSONObject3.put((Object) ShareHitPoint.f121869d, pair.getSecond());
            jSONArray.add(jSONObject2);
        }
        jSONObject.put((Object) "objs", (Object) jSONArray);
        fVar.mo20153c(jSONObject.toString());
        AbstractC68307f<BatchDocUserPermission> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new BatchDocUserPermissionParser()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…           .pull(request)");
        return a;
    }

    /* renamed from: a */
    public final AbstractC68307f<IDocUserPermission> mo38083a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        if (PermFGUtils.m39534c()) {
            return m41345f(str, i);
        }
        return m41344e(str, i);
    }

    /* renamed from: b */
    public final AbstractC68307f<IDocPublicPermission> mo38085b(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        boolean b = PermFGUtils.m39533b();
        Log.i("DocPermissionExecutor", "requestDocPublicPermission()... fg = " + b);
        if (b) {
            return mo38087d(str, i);
        }
        return mo38086c(str, i);
    }

    /* renamed from: e */
    private final AbstractC68307f<IDocUserPermission> m41344e(String str, int i) {
        StringCompanionObject mVar = StringCompanionObject.f173215a;
        String format = String.format("/api/suite/permission/user.v3/?token=%s&type=%d", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        AbstractC68307f<IDocUserPermission> d = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new DocUserPermissionParser()).mo20141a(new NetService.C5077f(format)).mo238020d(C9931c.f26849a);
        Intrinsics.checkExpressionValueIsNotNull(d, "KoinJavaComponent.get(Ne… result\n                }");
        return d;
    }

    /* renamed from: c */
    public final AbstractC68307f<IDocPublicPermission> mo38086c(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        StringCompanionObject mVar = StringCompanionObject.f173215a;
        String format = String.format("/api/suite/permission/public.v3/?token=%s&type=%d", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        AbstractC68307f<IDocPublicPermission> d = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new DocPublicPermissionParser()).mo20141a(new NetService.C5077f(format)).mo238020d(C9929a.f26847a);
        Intrinsics.checkExpressionValueIsNotNull(d, "KoinJavaComponent.get(Ne… result\n                }");
        return d;
    }

    /* renamed from: d */
    public final AbstractC68307f<IDocPublicPermission> mo38087d(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        StringCompanionObject mVar = StringCompanionObject.f173215a;
        String format = String.format("/api/suite/permission/public.v4/?token=%s&type=%d", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        AbstractC68307f<IDocPublicPermission> d = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new DocPublicPermissionParserV2()).mo20141a(new NetService.C5077f(format)).mo238020d(C9930b.f26848a);
        Intrinsics.checkExpressionValueIsNotNull(d, "KoinJavaComponent.get(Ne… result\n                }");
        return d;
    }

    /* renamed from: f */
    private final AbstractC68307f<IDocUserPermission> m41345f(String str, int i) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        ArrayList arrayListOf = CollectionsKt.arrayListOf("view", "edit", Comment.f24093e, "manage_collaborator", "manage_meta", "create_sub_node", "copy", "manage_history_record", "collect", "operate_from_dusbin", "operate_entity", "be_moved", "move_to", "move_from", "download", "print", "export", "manage_single_page_collaborator", "manage_single_page_meta", "invite_full_access", "invite_can_edit", "invite_can_view", "invite_single_page_full_access", "invite_single_page_can_edit", "invite_single_page_can_view");
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayListOf.iterator();
        while (it.hasNext()) {
            jSONArray.add((String) it.next());
        }
        jSONObject2.put((Object) "actions", (Object) jSONArray);
        NetService.C5077f fVar = new NetService.C5077f("/api/suite/permission/document/actions/state/");
        fVar.mo20153c(jSONObject.toJSONString());
        fVar.mo20143a(1);
        AbstractC68307f<IDocUserPermission> d = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new DocUserPermissionParserV2()).mo20141a(fVar).mo238020d(C9932d.f26850a);
        Intrinsics.checkExpressionValueIsNotNull(d, "KoinJavaComponent.get(Ne… result\n                }");
        return d;
    }
}
