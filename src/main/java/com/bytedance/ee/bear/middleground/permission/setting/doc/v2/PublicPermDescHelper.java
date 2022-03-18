package com.bytedance.ee.bear.middleground.permission.setting.doc.v2;

import android.content.Context;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.p522q.C10539a;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/PublicPermDescHelper;", "", "()V", "getCollaboratorManagerDesc", "", "context", "Landroid/content/Context;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "getCollaboratorManagerEditDesc", "getCollaboratorManagerFaDesc", "isV2", "", "getCollaboratorManagerReadDesc", "getCommentDesc", "getCommentEditDesc", "getCommentReadDesc", "getSecurityDesc", "getSecurityEditDesc", "getSecurityFaDesc", "getSecurityReadDesc", "getShareSwitchDesc", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.j */
public final class PublicPermDescHelper {

    /* renamed from: a */
    public static final PublicPermDescHelper f27061a = new PublicPermDescHelper();

    private PublicPermDescHelper() {
    }

    /* renamed from: a */
    public final String mo38257a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String string = context.getString(R.string.CreationMobile_ECM_Permission_view);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…bile_ECM_Permission_view)");
        String a = C10539a.m43639a(context, R.string.CreationMobile_ECM_Permission_AddCollaborator_option, "permission_type", string);
        Intrinsics.checkExpressionValueIsNotNull(a, "UIHelper.mustacheFormat(… \"permission_type\", type)");
        return a;
    }

    /* renamed from: b */
    public final String mo38260b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String string = context.getString(R.string.CreationMobile_ECM_Permission_edit);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…bile_ECM_Permission_edit)");
        String a = C10539a.m43639a(context, R.string.CreationMobile_ECM_Permission_AddCollaborator_option, "permission_type", string);
        Intrinsics.checkExpressionValueIsNotNull(a, "UIHelper.mustacheFormat(… \"permission_type\", type)");
        return a;
    }

    /* renamed from: c */
    public final String mo38263c(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String string = context.getString(R.string.CreationMobile_ECM_Permission_view);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…bile_ECM_Permission_view)");
        String a = C10539a.m43639a(context, R.string.CreationMobile_ECM_Permission_Comment_option, "permission_type", string);
        Intrinsics.checkExpressionValueIsNotNull(a, "UIHelper.mustacheFormat(… \"permission_type\", type)");
        return a;
    }

    /* renamed from: d */
    public final String mo38265d(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String string = context.getString(R.string.CreationMobile_ECM_Permission_edit);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…bile_ECM_Permission_edit)");
        String a = C10539a.m43639a(context, R.string.CreationMobile_ECM_Permission_Comment_option, "permission_type", string);
        Intrinsics.checkExpressionValueIsNotNull(a, "UIHelper.mustacheFormat(… \"permission_type\", type)");
        return a;
    }

    /* renamed from: e */
    public final String mo38267e(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String string = context.getString(R.string.CreationMobile_ECM_Permission_view);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…bile_ECM_Permission_view)");
        String a = C10539a.m43639a(context, R.string.CreationMobile_ECM_Permission_Comment_option, "permission_type", string);
        Intrinsics.checkExpressionValueIsNotNull(a, "UIHelper.mustacheFormat(… \"permission_type\", type)");
        return a;
    }

    /* renamed from: f */
    public final String mo38268f(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String string = context.getString(R.string.CreationMobile_ECM_Permission_edit);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…bile_ECM_Permission_edit)");
        String a = C10539a.m43639a(context, R.string.CreationMobile_ECM_Permission_Comment_option, "permission_type", string);
        Intrinsics.checkExpressionValueIsNotNull(a, "UIHelper.mustacheFormat(… \"permission_type\", type)");
        return a;
    }

    /* renamed from: a */
    public final String mo38258a(Context context, DocPermSetInfo docPermSetInfo) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        if (docPermSetInfo.mo38816Y()) {
            String string = context.getString(R.string.CreationMobile_ECM_Permission_External_FullAccess);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…sion_External_FullAccess)");
            return string;
        }
        String string2 = context.getString(R.string.CreationMobile_ECM_Permission_External_OnlyMe);
        Intrinsics.checkExpressionValueIsNotNull(string2, "context.getString(R.stri…rmission_External_OnlyMe)");
        return string2;
    }

    /* renamed from: b */
    public final String mo38261b(Context context, DocPermSetInfo docPermSetInfo) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        if (docPermSetInfo.mo38804M()) {
            return mo38257a(context);
        }
        if (docPermSetInfo.mo38805N()) {
            return mo38260b(context);
        }
        return mo38259a(context, docPermSetInfo.mo38816Y());
    }

    /* renamed from: c */
    public final String mo38264c(Context context, DocPermSetInfo docPermSetInfo) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        if (docPermSetInfo.mo38809R()) {
            return mo38263c(context);
        }
        if (docPermSetInfo.mo38810S()) {
            return mo38265d(context);
        }
        return mo38262b(context, docPermSetInfo.mo38816Y());
    }

    /* renamed from: d */
    public final String mo38266d(Context context, DocPermSetInfo docPermSetInfo) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        if (docPermSetInfo.mo38807P()) {
            return mo38267e(context);
        }
        return mo38268f(context);
    }

    /* renamed from: a */
    public final String mo38259a(Context context, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (z) {
            String string = context.getString(R.string.CreationMobile_ECM_Permission_fullaccess);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…CM_Permission_fullaccess)");
            String a = C10539a.m43639a(context, R.string.CreationMobile_ECM_Permission_AddCollaborator_option, "permission_type", string);
            Intrinsics.checkExpressionValueIsNotNull(a, "UIHelper.mustacheFormat(… \"permission_type\", type)");
            return a;
        }
        String string2 = context.getString(R.string.CreationMobile_ECM_Permission_OnlyMe);
        Intrinsics.checkExpressionValueIsNotNull(string2, "context.getString(R.stri…le_ECM_Permission_OnlyMe)");
        return string2;
    }

    /* renamed from: b */
    public final String mo38262b(Context context, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (z) {
            String string = context.getString(R.string.CreationMobile_ECM_Permission_fullaccess);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…CM_Permission_fullaccess)");
            String a = C10539a.m43639a(context, R.string.CreationMobile_ECM_Permission_Comment_option, "permission_type", string);
            Intrinsics.checkExpressionValueIsNotNull(a, "UIHelper.mustacheFormat(… \"permission_type\", type)");
            return a;
        }
        String string2 = context.getString(R.string.CreationMobile_ECM_Permission_OnlyMe);
        Intrinsics.checkExpressionValueIsNotNull(string2, "context.getString(R.stri…le_ECM_Permission_OnlyMe)");
        return string2;
    }
}
