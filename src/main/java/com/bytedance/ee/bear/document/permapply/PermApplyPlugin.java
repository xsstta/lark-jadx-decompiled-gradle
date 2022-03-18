package com.bytedance.ee.bear.document.permapply;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.document.DocumentMetadata;
import com.bytedance.ee.bear.document.DocumentPluginV2;
import com.bytedance.ee.bear.document.permission.PermissionData;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10159e;
import com.bytedance.ee.bear.share.export.OwnerInfo;
import com.bytedance.ee.util.p705h.C13666a;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/document/permapply/PermApplyPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPluginV2;", "()V", "isWiki2", "", "showNoPermission", "", "permissionData", "Lcom/bytedance/ee/bear/document/permission/PermissionData;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class PermApplyPlugin extends DocumentPluginV2 {
    private final boolean isWiki2() {
        DocumentMetadata documentMetadata = getDocumentMetadata();
        C8275a aVar = C8275a.f22377j;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.WIKI");
        if (!documentMetadata.isType(aVar)) {
            return false;
        }
        C4943e host = getHost();
        Intrinsics.checkExpressionValueIsNotNull(host, "host");
        return ((IWiki) KoinJavaComponent.m268613a(IWiki.class, null, null, 6, null)).mo21071c(host);
    }

    public final void showNoPermission(PermissionData permissionData) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        String str3;
        String reportJsonString;
        String str4;
        String reportJsonString2;
        Intrinsics.checkParameterIsNotNull(permissionData, "permissionData");
        if (isUIContainerAttached()) {
            View a = getUIContainer().mo19583a(R.id.contentOuterContainer);
            Intrinsics.checkExpressionValueIsNotNull(a, "uiContainer.findView(R.id.contentOuterContainer)");
            a.setVisibility(4);
            boolean isWiki2 = isWiki2();
            OwnerInfo owner = permissionData.getOwner();
            if (owner == null || (str = owner.getTenant_id()) == null) {
                str = "";
            }
            AccountService.Account f = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
            if (f == null || (str2 = f.f14592i) == null) {
                str2 = "";
            }
            String str5 = str;
            if (str5.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !TextUtils.equals(str5, str2)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (getDocumentMetadata().getOpenSource() == DocsOpenSource.vc) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean c = ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36640c().mo36637c();
            if (permissionData.getOwner() != null) {
                OwnerInfo owner2 = permissionData.getOwner();
                Intrinsics.checkExpressionValueIsNotNull(owner2, "permissionData.owner");
                if ((owner2.isAdmin_can_cross() || z2) && (!isWiki2 || z2 || c)) {
                    AbstractC10159e b = ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36639b();
                    FragmentManager fragmentManager = getFragmentManager();
                    ViewGroup d = getUIContainer().mo19598d(this);
                    Intrinsics.checkExpressionValueIsNotNull(d, "uiContainer.getPluginContainer(this)");
                    int id = d.getId();
                    String token = getDocumentMetadata().getToken();
                    C8275a d2 = C8275a.m34055d(getDocumentMetadata().getDocumentType());
                    String c2 = C4484g.m18494b().mo17252c();
                    OwnerInfo owner3 = permissionData.getOwner();
                    Intrinsics.checkExpressionValueIsNotNull(owner3, "permissionData.owner");
                    String name = owner3.getName();
                    OwnerInfo owner4 = permissionData.getOwner();
                    Intrinsics.checkExpressionValueIsNotNull(owner4, "permissionData.owner");
                    String a2 = C13666a.m55443a(c2, name, owner4.getEn_name());
                    boolean z4 = !z3;
                    DocumentMetadata documentMetadata = getDocumentMetadata();
                    C8275a aVar = C8275a.f22377j;
                    Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.WIKI");
                    boolean isType = documentMetadata.isType(aVar);
                    PermissionData.PublicPermissions publicPermissions = permissionData.getPublicPermissions();
                    if (publicPermissions == null || (reportJsonString2 = publicPermissions.getReportJsonString()) == null) {
                        str4 = "";
                    } else {
                        str4 = reportJsonString2;
                    }
                    b.mo36675a(fragmentManager, id, token, d2, a2, true, z4, "", z3, isType, "", "forbidden", str4);
                    return;
                }
            }
            AbstractC10159e b2 = ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36639b();
            FragmentManager fragmentManager2 = getFragmentManager();
            ViewGroup d3 = getUIContainer().mo19598d(this);
            Intrinsics.checkExpressionValueIsNotNull(d3, "uiContainer.getPluginContainer(this)");
            int id2 = d3.getId();
            if (isWiki2) {
                i = R.string.CreationMobile_Wiki_Permission_NoAccessPermission_Title;
            } else {
                i = R.string.Doc_Permission_AdminNotAuthorizeCross;
            }
            boolean z5 = !isWiki2;
            boolean z6 = !z3;
            String token2 = getDocumentMetadata().getToken();
            int documentTypeValue = getDocumentMetadata().getDocumentTypeValue();
            DocumentMetadata documentMetadata2 = getDocumentMetadata();
            C8275a aVar2 = C8275a.f22377j;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.WIKI");
            boolean isType2 = documentMetadata2.isType(aVar2);
            PermissionData.PublicPermissions publicPermissions2 = permissionData.getPublicPermissions();
            if (publicPermissions2 == null || (reportJsonString = publicPermissions2.getReportJsonString()) == null) {
                str3 = "";
            } else {
                str3 = reportJsonString;
            }
            b2.mo36676a(fragmentManager2, id2, true, i, z5, z6, token2, documentTypeValue, "", z3, isType2, "", "forbidden", str3);
        }
    }
}
