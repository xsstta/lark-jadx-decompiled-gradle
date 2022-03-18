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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\r\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J2\u0010\u000e\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J*\u0010\u0012\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J*\u0010\u0013\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J*\u0010\u0014\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J*\u0010\u0015\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J*\u0010\u0016\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\u0017\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\u0018\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\u0019\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\u001a\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\u001b\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0003J\"\u0010\u001f\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010 \u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010!\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\"\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010#\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010$\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010%\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J*\u0010&\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010(\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/manager/DocPublicPermissionManagerV1;", "Lcom/bytedance/ee/bear/middleground/permission/setting/manager/IDocPublicPermissionManager;", "()V", "PUBLIC_PERMISSION_UPDATE", "", "TAG", "updateCommentWithEdit", "", "token", ShareHitPoint.f121869d, "", "callback", "Lcom/bytedance/ee/bear/middleground_permission_export/model/SimpleRequestCallback;", "updateCommentWithRead", "updateExternalAccess", "externalAccess", "", "permType", "updateLinkShareAnyoneEdit", "updateLinkShareAnyoneRead", "updateLinkShareClose", "updateLinkShareInternalEdit", "updateLinkShareInternalRead", "updateManagerCollaboratorAnyone", "updateManagerCollaboratorInternal", "updateManagerCollaboratorWithEdit", "updateManagerCollaboratorWithFA", "updateManagerCollaboratorWithRead", "updatePublicPermission", "params", "newEntity", "updateSecurityWithEdit", "updateSecurityWithFA", "updateSecurityWithRead", "updateShareAnyone", "updateShareExternalWithEdit", "updateShareExternalWithFA", "updateShareExternalWithRead", "updateShareInternal", "inviteExternal", "updateShareOnlyMe", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.e */
public final class DocPublicPermissionManagerV1 implements IDocPublicPermissionManager {

    /* renamed from: a */
    public static final DocPublicPermissionManagerV1 f27300a = new DocPublicPermissionManagerV1();

    private DocPublicPermissionManagerV1() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.e$a */
    public static final class C10109a<T> implements Consumer<SimpleRequestResult> {

        /* renamed from: a */
        final /* synthetic */ AbstractC10169g f27301a;

        /* renamed from: b */
        final /* synthetic */ int f27302b;

        C10109a(AbstractC10169g gVar, int i) {
            this.f27301a = gVar;
            this.f27302b = i;
        }

        /* renamed from: a */
        public final void accept(SimpleRequestResult simpleRequestResult) {
            C13479a.m54764b("DocPublicPermissionManagerV1", "updatePublicPermission succeed");
            this.f27301a.mo17111a(this.f27302b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.e$b */
    public static final class C10110b<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ AbstractC10169g f27303a;

        C10110b(AbstractC10169g gVar) {
            this.f27303a = gVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("DocPublicPermissionManagerV1", "updatePublicPermission error:", th);
            this.f27303a.mo17112a(th);
        }
    }

    /* renamed from: f */
    public void mo38476f(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV1", "updateShareEntity()...only me");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "share_entity", (Object) 0);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42046h(jSONString, 0, gVar);
    }

    /* renamed from: g */
    public void mo38477g(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV1", "updateShareEntity()...anyone");
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
        m42046h(jSONString, 2, gVar);
    }

    /* renamed from: h */
    private final void m42046h(String str, int i, AbstractC10169g gVar) {
        NetService.C5077f fVar = new NetService.C5077f("/api/suite/permission/public/update.v3/");
        fVar.mo20153c(str);
        fVar.mo20143a(1);
        gVar.mo17110a();
        NetService.AbstractC5075d a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C5205f());
        Intrinsics.checkExpressionValueIsNotNull(a, "netService.createPuller(…    SimpleResultParser())");
        a.mo20141a(fVar).mo237985a(C11678b.m48481e()).mo238001b(new C10109a(gVar, i), new C10110b(gVar));
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: a */
    public void mo38460a(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV1", "updateCommentEntity()...read");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "comment_entity", (Object) 0);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42046h(jSONString, 0, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: b */
    public void mo38464b(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV1", "updateCommentEntity()...edit");
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
        m42046h(jSONString, 1, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: c */
    public void mo38466c(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV1", "updateSecurityEntity()...read");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "security_entity", (Object) 0);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42046h(jSONString, 0, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: d */
    public void mo38468d(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV1", "updateSecurityEntity()...edit");
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
        m42046h(jSONString, 1, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: e */
    public void mo38470e(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV1", "updateSecurityEntity()...fa");
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
        m42046h(jSONString, 2, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: a */
    public void mo38459a(String str, int i, int i2, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV1", "updateLinkShareEntity()...close");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "link_share_entity", (Object) 0);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42046h(jSONString, 0, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: b */
    public void mo38463b(String str, int i, int i2, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV1", "updateLinkShareEntity()...internal read");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "link_share_entity", (Object) 1);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42046h(jSONString, 1, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: c */
    public void mo38465c(String str, int i, int i2, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV1", "updateLinkShareEntity()...internal edit");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "link_share_entity", (Object) 2);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42046h(jSONString, 2, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: d */
    public void mo38467d(String str, int i, int i2, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV1", "updateLinkShareEntity()...anyone read");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "link_share_entity", (Object) 3);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42046h(jSONString, 3, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: e */
    public void mo38469e(String str, int i, int i2, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV1", "updateLinkShareEntity()...anyone edit");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "link_share_entity", (Object) 4);
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42046h(jSONString, 4, gVar);
    }

    /* renamed from: a */
    public void mo38475a(String str, int i, boolean z, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV1", "updateShareEntity()...internal");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "share_entity", (Object) 1);
        jSONObject2.put((Object) "invite_external", (Object) Boolean.valueOf(z));
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42046h(jSONString, 1, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: a */
    public void mo38461a(String str, int i, boolean z, int i2, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        C13479a.m54764b("DocPublicPermissionManagerV1", "updateExternalAccess()...externalAccess=" + z);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "external_access", (Object) Boolean.valueOf(z));
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        m42046h(jSONString, 0, gVar);
    }
}
