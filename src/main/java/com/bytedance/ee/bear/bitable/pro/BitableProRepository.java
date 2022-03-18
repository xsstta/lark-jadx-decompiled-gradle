package com.bytedance.ee.bear.bitable.pro;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.TableSimpleInfo;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.C5205f;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ(\u0010\u000f\u001a\u00020\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0005j\b\u0012\u0004\u0012\u00020\u0012`\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012R\u000e\u0010\t\u001a\u00020\u0003XD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003XD¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003XD¢\u0006\u0002\n\u0000R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/bitable/pro/BitableProRepository;", "", "token", "", "tableList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/TableSimpleInfo;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "API_PATH_FETCH_ROLES", "API_PATH_UPDATE_ROLE", "TAG", "fetchRoleResult", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/bitable/pro/RoleResult;", "memberList2Json", "Lcom/alibaba/fastjson/JSONArray;", "userInfoList", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "removeUser", "removeMember", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "role", "Lcom/bytedance/ee/bear/bitable/pro/Role;", "userInfo", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.pro.d */
public final class BitableProRepository {

    /* renamed from: a */
    private final String f14205a = "BitableProRepository";

    /* renamed from: b */
    private final String f14206b = "/space/api/bitable/%s/roles";

    /* renamed from: c */
    private final String f14207c = "/space/api/bitable/roles/%s/update";

    /* renamed from: d */
    private final String f14208d;

    /* renamed from: e */
    private final ArrayList<TableSimpleInfo> f14209e;

    /* renamed from: a */
    public final AbstractC68307f<RoleResult> mo18941a() {
        StringCompanionObject mVar = StringCompanionObject.f173215a;
        String format = String.format(this.f14206b, Arrays.copyOf(new Object[]{this.f14208d}, 1));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        AbstractC68307f<RoleResult> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new BitableRoleResultParser(this.f14209e)).mo20141a(new NetService.C5077f(format));
        Intrinsics.checkExpressionValueIsNotNull(a, "netService.createPuller(…           .pull(request)");
        return a;
    }

    public BitableProRepository(String str, ArrayList<TableSimpleInfo> arrayList) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(arrayList, "tableList");
        this.f14208d = str;
        this.f14209e = arrayList;
    }

    /* renamed from: a */
    private final JSONArray m19966a(ArrayList<UserInfo> arrayList, UserInfo userInfo) {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<UserInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                UserInfo next = it.next();
                if (!Objects.equals(next, userInfo)) {
                    JSONObject jSONObject = new JSONObject();
                    Intrinsics.checkExpressionValueIsNotNull(next, "userInfo");
                    jSONObject.put((Object) "memberId", (Object) next.getId());
                    jSONObject.put((Object) "memberType", (Object) Integer.valueOf(next.getOwnerType()));
                    jSONArray.add(jSONObject);
                }
            }
        } catch (JSONException e) {
            C13479a.m54761a(this.f14205a, e);
        }
        return jSONArray;
    }

    /* renamed from: a */
    public final AbstractC68307f<SimpleRequestResult> mo18942a(Role role, UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(role, "role");
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        StringCompanionObject mVar = StringCompanionObject.f173215a;
        String format = String.format(this.f14207c, Arrays.copyOf(new Object[]{this.f14208d}, 1));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        NetService.C5077f fVar = new NetService.C5077f(format);
        fVar.mo20143a(1);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) "roleId", (Object) role.getRoleId());
        jSONObject2.put((Object) "members", (Object) m19966a(role.getMembers(), userInfo));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((Object) "baseRole", (Object) jSONObject);
        fVar.mo20153c(jSONObject3.toJSONString());
        AbstractC68307f<SimpleRequestResult> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C5205f()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…           .pull(request)");
        return a;
    }
}
