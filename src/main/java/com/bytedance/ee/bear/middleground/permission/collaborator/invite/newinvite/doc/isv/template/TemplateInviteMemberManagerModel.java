package com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.doc.isv.template;

import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.doc.DocInviteMemberManagerModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJT\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b`\f2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/doc/isv/template/TemplateInviteMemberManagerModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/doc/DocInviteMemberManagerModel;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "model", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/ISelectedUserModel;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "(Lcom/bytedance/ee/bear/service/ServiceContext;Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/ISelectedUserModel;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;)V", "buildParams", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "selectedUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "notify", "", "isContainerPerm", "notes", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c.a.a.b */
public class TemplateInviteMemberManagerModel extends DocInviteMemberManagerModel {

    /* renamed from: c */
    private final DocPermSetInfo f25991c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TemplateInviteMemberManagerModel(C10917c cVar, ISelectedUserModel bVar, DocPermSetInfo docPermSetInfo) {
        super(cVar, bVar, docPermSetInfo);
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        Intrinsics.checkParameterIsNotNull(bVar, "model");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        this.f25991c = docPermSetInfo;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.doc.DocInviteMemberManagerModel
    /* renamed from: a */
    public HashMap<String, String> mo36932a(ArrayList<UserInfo> arrayList, boolean z, boolean z2, String str) {
        String str2;
        Intrinsics.checkParameterIsNotNull(arrayList, "selectedUsers");
        Intrinsics.checkParameterIsNotNull(str, "notes");
        HashMap<String, String> hashMap = new HashMap<>();
        HashMap<String, String> hashMap2 = hashMap;
        hashMap2.put("token", this.f25991c.mo38827c());
        hashMap2.put(ShareHitPoint.f121869d, String.valueOf(this.f25991c.mo38825b()));
        hashMap2.put("owners", mo36933a(arrayList));
        hashMap2.put("perm_type", String.valueOf(1));
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        hashMap2.put("notify_lark", str2);
        return hashMap;
    }
}
