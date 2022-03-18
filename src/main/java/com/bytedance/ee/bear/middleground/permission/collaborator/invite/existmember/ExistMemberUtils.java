package com.bytedance.ee.bear.middleground.permission.collaborator.invite.existmember;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010H\u0007J6\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/existmember/ExistMemberUtils;", "", "()V", "DOC_SEARCH_MEMBERS_EXIST", "", "FOLDER_SEARCH_MEMBERS_EXIST", "TAG", "getDocExistMember", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/existmember/ExistMemberResult;", "objToken", ShareHitPoint.f121869d, "", "members", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/existmember/Member;", "Lkotlin/collections/ArrayList;", "getFolderExistMember", "canReAdd", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.existmember.c */
public final class ExistMemberUtils {

    /* renamed from: a */
    public static final ExistMemberUtils f26203a = new ExistMemberUtils();

    private ExistMemberUtils() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/existmember/ExistMemberResult;", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.existmember.c$a */
    static final class C9714a<T, R> implements Function<Throwable, ExistMemberResult> {

        /* renamed from: a */
        public static final C9714a f26204a = new C9714a();

        C9714a() {
        }

        /* renamed from: a */
        public final ExistMemberResult apply(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            C13479a.m54758a("ExistMemberUtils", "getExistMember error: " + th);
            return new ExistMemberResult();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/existmember/ExistMemberResult;", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.existmember.c$b */
    static final class C9715b<T, R> implements Function<Throwable, ExistMemberResult> {

        /* renamed from: a */
        public static final C9715b f26205a = new C9715b();

        C9715b() {
        }

        /* renamed from: a */
        public final ExistMemberResult apply(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            C13479a.m54758a("ExistMemberUtils", "getExistMember error: " + th);
            return new ExistMemberResult();
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<ExistMemberResult> m40195a(String str, int i, ArrayList<Member> arrayList) {
        Intrinsics.checkParameterIsNotNull(str, "objToken");
        Intrinsics.checkParameterIsNotNull(arrayList, "members");
        NetService.C5077f fVar = new NetService.C5077f("/space/api/suite/permission/members/exist.v2/");
        fVar.mo20143a(1);
        fVar.mo20153c(JSON.toJSONString(new ExistMemberParam(i, str, arrayList)));
        AbstractC68307f<ExistMemberResult> f = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C9713b()).mo20141a(fVar).mo238029f(C9714a.f26204a);
        Intrinsics.checkExpressionValueIsNotNull(f, "KoinJavaComponent.get(Ne…esult()\n                }");
        return f;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<ExistMemberResult> m40196a(String str, boolean z, ArrayList<Member> arrayList) {
        Intrinsics.checkParameterIsNotNull(str, "objToken");
        Intrinsics.checkParameterIsNotNull(arrayList, "members");
        if (arrayList.isEmpty() || z) {
            AbstractC68307f<ExistMemberResult> a = AbstractC68307f.m265083a(new ExistMemberResult());
            Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.just(ExistMemberResult())");
            return a;
        }
        NetService.C5077f fVar = new NetService.C5077f("/space/api/suite/permission/space/collaborators/exist/");
        fVar.mo20143a(1);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) "token", (Object) str);
        JSONArray jSONArray = new JSONArray();
        Iterator<Member> it = arrayList.iterator();
        while (it.hasNext()) {
            Member next = it.next();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = jSONObject3;
            Intrinsics.checkExpressionValueIsNotNull(next, "member");
            jSONObject4.put((Object) "collaborator_id", (Object) next.getMemberId());
            jSONObject4.put((Object) "collaborator_type", (Object) Integer.valueOf(next.getMemberType()));
            jSONArray.add(jSONObject3);
        }
        jSONObject2.put((Object) "collaborators", (Object) jSONArray);
        fVar.mo20153c(jSONObject.toJSONString());
        AbstractC68307f<ExistMemberResult> f = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C9712a()).mo20141a(fVar).mo238029f(C9715b.f26205a);
        Intrinsics.checkExpressionValueIsNotNull(f, "KoinJavaComponent.get(Ne…esult()\n                }");
        return f;
    }
}
