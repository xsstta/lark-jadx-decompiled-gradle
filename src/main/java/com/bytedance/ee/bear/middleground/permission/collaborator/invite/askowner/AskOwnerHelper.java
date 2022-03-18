package com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.C5205f;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.AskOwnerParams;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.util.p702e.C13657b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u000f\u001a\u00020\u0004JF\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J0\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00150\fj\b\u0012\u0004\u0012\u00020\u0015`\u000e2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/AskOwnerHelper;", "", "()V", "ASK_OWNER_API_PATH", "", "askOwner", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "token", ShareHitPoint.f121869d, "", "invitedUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "notes", "askOwnerFlow", "netService", "Lcom/bytedance/ee/bear/contract/NetService;", "selectedUsers", "getOwnerList", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/AskOwnerParams$MembersBean;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.a */
public final class AskOwnerHelper {

    /* renamed from: a */
    public static final AskOwnerHelper f26081a = new AskOwnerHelper();

    private AskOwnerHelper() {
    }

    /* renamed from: a */
    private final ArrayList<AskOwnerParams.MembersBean> m40090a(ArrayList<UserInfo> arrayList) {
        ArrayList<AskOwnerParams.MembersBean> arrayList2 = new ArrayList<>();
        for (T t : arrayList) {
            AskOwnerParams.MembersBean membersBean = new AskOwnerParams.MembersBean();
            membersBean.setOwner_id(t.getId());
            membersBean.setOwner_type(Integer.valueOf(t.getOwnerType()));
            membersBean.setPermission(Integer.valueOf(t.getPermission()));
            arrayList2.add(membersBean);
        }
        return arrayList2;
    }

    /* renamed from: a */
    public final AbstractC68307f<SimpleRequestResult> mo36985a(String str, int i, ArrayList<UserInfo> arrayList, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(arrayList, "invitedUsers");
        Intrinsics.checkParameterIsNotNull(str2, "notes");
        new C10917c(new C10929e());
        if (!C13657b.m55421a(arrayList)) {
            return m40089a((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null), str, i, arrayList, str2);
        }
        AbstractC68307f<SimpleRequestResult> a = AbstractC68307f.m265084a(new Throwable("users is empty"));
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.error(Throwable(\"users is empty\"))");
        return a;
    }

    /* renamed from: a */
    private final AbstractC68307f<SimpleRequestResult> m40089a(NetService netService, String str, int i, ArrayList<UserInfo> arrayList, String str2) {
        NetService.C5077f fVar = new NetService.C5077f("/space/api/suite/permission/ask_owner/members/create/");
        fVar.mo20143a(1);
        AskOwnerParams askOwnerParams = new AskOwnerParams();
        askOwnerParams.setToken(str);
        askOwnerParams.setType(Integer.valueOf(i));
        askOwnerParams.setMembers(m40090a(arrayList));
        askOwnerParams.setRemark(str2);
        fVar.mo20153c(JSON.toJSONString(askOwnerParams));
        AbstractC68307f<SimpleRequestResult> a = netService.mo20117a(new C5205f()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "netService.createPuller<…           .pull(request)");
        return a;
    }
}
