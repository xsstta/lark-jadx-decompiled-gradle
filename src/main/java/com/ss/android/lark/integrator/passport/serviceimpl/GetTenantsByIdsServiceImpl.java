package com.ss.android.lark.integrator.passport.serviceimpl;

import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.contact.v1.MGetTenantsRequest;
import com.bytedance.lark.pb.contact.v1.MGetTenantsResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.passport.signinsdk_api.entity.Tenant;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49393f;
import com.ss.android.lark.sdk.SdkSender;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ClaymoreImpl(AbstractC49393f.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u001a\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\f\u0018\u00010\u000bH\u0016J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\f2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\f2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/integrator/passport/serviceimpl/GetTenantsByIdsServiceImpl;", "Lcom/ss/android/lark/passport/signinsdk_api/interfaces/IGetTenantsByIdsService;", "()V", "asyncGetTenantsByIds", "", "ids", "", "", "shouldAuth", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "getTenantsByIds", "Lcom/ss/android/lark/passport/signinsdk_api/entity/Tenant;", "parseTenantFromPb", "pbTenant", "Lcom/bytedance/lark/pb/basic/v1/Tenant;", "syncGetTenantsByIds", "passport_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class GetTenantsByIdsServiceImpl implements AbstractC49393f {
    public Map<String, Tenant> syncGetTenantsByIds(List<String> list) {
        Map<String, Tenant> map = (Map) SdkSender.syncSend(Command.MGET_TENANTS, new MGetTenantsRequest.C16328a().mo58380a(list).mo58379a((Boolean) false), new C39992c(this));
        if (map != null) {
            return map;
        }
        return new HashMap();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.passport.serviceimpl.GetTenantsByIdsServiceImpl$a */
    static final class C39990a<T> implements SdkSender.IParser<Map<String, ? extends String>> {

        /* renamed from: a */
        public static final C39990a f101717a = new C39990a();

        C39990a() {
        }

        /* renamed from: a */
        public final Map<String, String> parse(byte[] bArr) {
            HashMap hashMap = new HashMap();
            C14928Entity entity = MGetTenantsResponse.ADAPTER.decode(bArr).entity;
            if (entity != null) {
                for (String str : entity.tenants.keySet()) {
                    com.bytedance.lark.pb.basic.v1.Tenant tenant = entity.tenants.get(str);
                    Intrinsics.checkExpressionValueIsNotNull(str, "key");
                    if (tenant == null) {
                        Intrinsics.throwNpe();
                    }
                    String str2 = tenant.name;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "pbTenant!!.name");
                    hashMap.put(str, str2);
                }
            }
            return hashMap;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "Lcom/ss/android/lark/passport/signinsdk_api/entity/Tenant;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.passport.serviceimpl.GetTenantsByIdsServiceImpl$b */
    static final class C39991b<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        final /* synthetic */ GetTenantsByIdsServiceImpl f101718a;

        /* renamed from: b */
        final /* synthetic */ Map f101719b;

        C39991b(GetTenantsByIdsServiceImpl getTenantsByIdsServiceImpl, Map map) {
            this.f101718a = getTenantsByIdsServiceImpl;
            this.f101719b = map;
        }

        /* renamed from: a */
        public final Map<String, Tenant> parse(byte[] bArr) {
            HashMap hashMap = new HashMap();
            C14928Entity entity = MGetTenantsResponse.ADAPTER.decode(bArr).entity;
            if (entity != null) {
                for (String str : entity.tenants.keySet()) {
                    Tenant parseTenantFromPb = this.f101718a.parseTenantFromPb(entity.tenants.get(str));
                    if (parseTenantFromPb != null) {
                        Intrinsics.checkExpressionValueIsNotNull(str, "key");
                        hashMap.put(str, parseTenantFromPb);
                    }
                }
            }
            this.f101719b.putAll(hashMap);
            return this.f101719b;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "Lcom/ss/android/lark/passport/signinsdk_api/entity/Tenant;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.passport.serviceimpl.GetTenantsByIdsServiceImpl$c */
    public static final class C39992c<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        final /* synthetic */ GetTenantsByIdsServiceImpl f101720a;

        C39992c(GetTenantsByIdsServiceImpl getTenantsByIdsServiceImpl) {
            this.f101720a = getTenantsByIdsServiceImpl;
        }

        /* renamed from: a */
        public final Map<String, Tenant> parse(byte[] bArr) {
            HashMap hashMap = new HashMap();
            C14928Entity entity = MGetTenantsResponse.ADAPTER.decode(bArr).entity;
            if (entity != null) {
                for (String str : entity.tenants.keySet()) {
                    Tenant parseTenantFromPb = this.f101720a.parseTenantFromPb(entity.tenants.get(str));
                    if (parseTenantFromPb != null) {
                        Intrinsics.checkExpressionValueIsNotNull(str, "key");
                        hashMap.put(str, parseTenantFromPb);
                    }
                }
            }
            return hashMap;
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49393f
    public Map<String, Tenant> getTenantsByIds(List<String> list) {
        Map map;
        HashMap hashMap = new HashMap();
        hashMap.putAll(syncGetTenantsByIds(list));
        if (CollectionUtils.isNotEmpty(list) && (map = (Map) SdkSender.sendRequest(Command.MGET_TENANTS, new MGetTenantsRequest.C16328a().mo58380a(list).mo58379a((Boolean) true), new C39991b(this, hashMap))) != null && !CollectionUtils.isEmpty(map)) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public final Tenant parseTenantFromPb(com.bytedance.lark.pb.basic.v1.Tenant tenant) {
        Tenant tenant2 = new Tenant();
        if (tenant == null) {
            return null;
        }
        tenant2.setAddress(tenant.address);
        tenant2.setContactEmail(tenant.contact_email);
        tenant2.setContactMobile(tenant.contact_mobile);
        tenant2.setContactName(tenant.contact_name);
        tenant2.setDomain(tenant.domain);
        tenant2.setIconUrl(tenant.icon_url);
        tenant2.setId(tenant.id);
        tenant2.setName(tenant.name);
        tenant2.setPostCode(tenant.post_code);
        tenant2.setRemark(tenant.remark);
        tenant2.setTelephone(tenant.telephone);
        tenant2.setUnitLeague(tenant.unit_league);
        return tenant2;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49393f
    public void asyncGetTenantsByIds(List<String> list, boolean z, IGetDataCallback<Map<String, String>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.MGET_TENANTS, new MGetTenantsRequest.C16328a().mo58380a(list).mo58379a(Boolean.valueOf(z)), iGetDataCallback, C39990a.f101717a);
    }
}
