package com.bytedance.ee.bear.middleground.permission.setting.manager;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.C5205f;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\u000e\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J2\u0010\u000f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J*\u0010\u0013\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J*\u0010\u0014\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J*\u0010\u0015\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J*\u0010\u0016\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J*\u0010\u0017\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\u0018\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\u0019\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\u001a\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\u001b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\u001c\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0003J\"\u0010 \u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010!\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\"\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010#\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010$\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010%\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010&\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J*\u0010'\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010)\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/manager/DocPublicPermissionManagerV2;", "Lcom/bytedance/ee/bear/middleground/permission/setting/manager/IDocPublicPermissionManager;", "()V", "OPERATOR_INVALID", "", "PUBLIC_PERMISSION_UPDATE", "", "TAG", "updateCommentWithEdit", "", "token", ShareHitPoint.f121869d, "callback", "Lcom/bytedance/ee/bear/middleground_permission_export/model/SimpleRequestCallback;", "updateCommentWithRead", "updateExternalAccess", "externalAccess", "", "permType", "updateLinkShareAnyoneEdit", "updateLinkShareAnyoneRead", "updateLinkShareClose", "updateLinkShareInternalEdit", "updateLinkShareInternalRead", "updateManagerCollaboratorAnyone", "updateManagerCollaboratorInternal", "updateManagerCollaboratorWithEdit", "updateManagerCollaboratorWithFA", "updateManagerCollaboratorWithRead", "updatePublicPermission", "params", "newEntity", "updateSecurityWithEdit", "updateSecurityWithFA", "updateSecurityWithRead", "updateShareAnyone", "updateShareExternalWithEdit", "updateShareExternalWithFA", "updateShareExternalWithRead", "updateShareInternal", "inviteExternal", "updateShareOnlyMe", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.f */
public final class DocPublicPermissionManagerV2 implements IDocPublicPermissionManager {

    /* renamed from: a */
    public static final DocPublicPermissionManagerV2 f27304a = new DocPublicPermissionManagerV2();

    private DocPublicPermissionManagerV2() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.f$a */
    public static final class C10111a<T> implements Consumer<SimpleRequestResult> {

        /* renamed from: a */
        final /* synthetic */ AbstractC10169g f27305a;

        /* renamed from: b */
        final /* synthetic */ int f27306b;

        C10111a(AbstractC10169g gVar, int i) {
            this.f27305a = gVar;
            this.f27306b = i;
        }

        /* renamed from: a */
        public final void accept(SimpleRequestResult simpleRequestResult) {
            C13479a.m54764b("DocPublicPermissionManagerV2", "updatePublicPermission succeed");
            this.f27305a.mo17111a(this.f27306b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.f$b */
    public static final class C10112b<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ AbstractC10169g f27307a;

        C10112b(AbstractC10169g gVar) {
            this.f27307a = gVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("DocPublicPermissionManagerV2", "updatePublicPermission error:", th);
            this.f27307a.mo17112a(th);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: a */
    public void mo38460a(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV2", "updateCommentEntity()...read");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "comment_entity", (Object) 1);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42063m(jSONString, 1, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: b */
    public void mo38464b(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV2", "updateCommentEntity()...edit");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "comment_entity", (Object) 2);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42063m(jSONString, 2, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: c */
    public void mo38466c(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV2", "updateSecurityEntity()...read");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "security_entity", (Object) 1);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42063m(jSONString, 1, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: d */
    public void mo38468d(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV2", "updateSecurityEntity()...edit");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "security_entity", (Object) 2);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42063m(jSONString, 2, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: e */
    public void mo38470e(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV2", "updateSecurityEntity()...fa");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "security_entity", (Object) 3);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42063m(jSONString, 3, gVar);
    }

    /* renamed from: f */
    public void mo38480f(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV2", "updateShareExternalEntity()...read");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "share_external_entity", (Object) 1);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42063m(jSONString, 1, gVar);
    }

    /* renamed from: g */
    public void mo38481g(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV2", "updateShareExternalEntity()...fa");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "share_external_entity", (Object) 3);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42063m(jSONString, 3, gVar);
    }

    /* renamed from: h */
    public void mo38482h(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV2", "updateManagerCollaborator()...internal");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "share_entity", (Object) 1);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42063m(jSONString, 1, gVar);
    }

    /* renamed from: i */
    public void mo38483i(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV2", "updateManagerCollaborator()...anyone");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "share_entity", (Object) 2);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42063m(jSONString, 2, gVar);
    }

    /* renamed from: j */
    public void mo38484j(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV2", "updateManagerCollaborator()...read");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "manage_collaborator_entity", (Object) 1);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42063m(jSONString, 1, gVar);
    }

    /* renamed from: k */
    public void mo38485k(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV2", "updateManagerCollaborator()...edit");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "manage_collaborator_entity", (Object) 2);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42063m(jSONString, 2, gVar);
    }

    /* renamed from: l */
    public void mo38486l(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV2", "updateManagerCollaborator()...fa");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "manage_collaborator_entity", (Object) 3);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42063m(jSONString, 3, gVar);
    }

    /* renamed from: m */
    private final void m42063m(String str, int i, AbstractC10169g gVar) {
        NetService.C5077f fVar = new NetService.C5077f("/api/suite/permission/public/update.v4/");
        fVar.mo20153c(str);
        fVar.mo20143a(1);
        gVar.mo17110a();
        NetService.AbstractC5075d a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C5205f());
        Intrinsics.checkExpressionValueIsNotNull(a, "netService.createPuller(…    SimpleResultParser())");
        a.mo20141a(fVar).mo237985a(C11678b.m48481e()).mo238001b(new C10111a(gVar, i), new C10112b(gVar));
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: a */
    public void mo38459a(String str, int i, int i2, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV2", "updateLinkShareEntity()...close");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "link_share_entity", (Object) 1);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("link_share_entity", (Object) Integer.valueOf(i2));
        jSONObject2.put((Object) "perm_type", (Object) jSONObject3);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42063m(jSONString, 1, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: b */
    public void mo38463b(String str, int i, int i2, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV2", "updateLinkShareEntity()...internal read");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "link_share_entity", (Object) 2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("link_share_entity", (Object) Integer.valueOf(i2));
        jSONObject2.put((Object) "perm_type", (Object) jSONObject3);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42063m(jSONString, 2, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: c */
    public void mo38465c(String str, int i, int i2, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV2", "updateLinkShareEntity()...internal edit");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "link_share_entity", (Object) 3);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("link_share_entity", (Object) Integer.valueOf(i2));
        jSONObject2.put((Object) "perm_type", (Object) jSONObject3);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42063m(jSONString, 3, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: d */
    public void mo38467d(String str, int i, int i2, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV2", "updateLinkShareEntity()...anyone read");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "link_share_entity", (Object) 4);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("link_share_entity", (Object) Integer.valueOf(i2));
        jSONObject2.put((Object) "perm_type", (Object) jSONObject3);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42063m(jSONString, 4, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: e */
    public void mo38469e(String str, int i, int i2, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV2", "updateLinkShareEntity()...anyone edit");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "link_share_entity", (Object) 5);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("link_share_entity", (Object) Integer.valueOf(i2));
        jSONObject2.put((Object) "perm_type", (Object) jSONObject3);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42063m(jSONString, 5, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: a */
    public void mo38461a(String str, int i, boolean z, int i2, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV2", "updateExternalAccess()...externalAccess=" + z);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "external_access_switch", (Object) Boolean.valueOf(z));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("external_access_switch", (Object) Integer.valueOf(i2));
        jSONObject2.put((Object) "perm_type", (Object) jSONObject3);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42063m(jSONString, 0, gVar);
    }
}
