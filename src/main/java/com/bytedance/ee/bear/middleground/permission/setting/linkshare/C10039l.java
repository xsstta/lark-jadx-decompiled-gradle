package com.bytedance.ee.bear.middleground.permission.setting.linkshare;

import android.content.Context;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.form.IBitableSharePublicPermission;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13616d;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.l */
public class C10039l {
    /* renamed from: a */
    public static int m41785a(IBitableSharePublicPermission iBitableSharePublicPermission) {
        if (iBitableSharePublicPermission.isLinkShareInternalEdit()) {
            return 10;
        }
        if (iBitableSharePublicPermission.isLinkShareAnyoneEdit()) {
            return 11;
        }
        return 9;
    }

    /* renamed from: b */
    public static LinkShareItem m41787b(Context context, int i) {
        String str = "";
        switch (i) {
            case 9:
                str = context.getString(R.string.Bitable_Form_InvitedCollaboratorCanFillIn);
                break;
            case 10:
                str = context.getString(R.string.Bitable_Form_InternalUserCanFillIn);
                break;
            case 11:
                str = context.getString(R.string.Bitable_Form_AnyoneCanFillIn);
                break;
            default:
                C13479a.m54758a("LinkShareHelper", "getLinkShareItem(): not recognition type = " + i);
                if (C13616d.m55263b()) {
                    throw new IllegalArgumentException("error type = " + i);
                }
                break;
        }
        return new LinkShareItem(i, str, str);
    }

    /* renamed from: a */
    public static LinkShareItem m41786a(Context context, int i) {
        String str;
        String str2 = "";
        switch (i) {
            case 1:
                str = context.getString(R.string.Doc_Share_CloseLinkDes);
                break;
            case 2:
                str = context.getString(R.string.Doc_Share_NotOwnerCloseTitle);
                break;
            case 3:
                str2 = C10539a.m43639a(context, R.string.Doc_Share_OrgTitle, "rightName", context.getString(R.string.Doc_Share_LinkCanView));
                str = str2;
                break;
            case 4:
                str2 = C10539a.m43639a(context, R.string.Doc_Share_OrgTitle, "rightName", context.getString(R.string.Doc_Share_LinkCanEdit));
                str = str2;
                break;
            case 5:
                str2 = C10539a.m43639a(context, R.string.Doc_Share_KnownLinkTitle, "rightName", context.getString(R.string.Doc_Share_LinkCanView));
                str = context.getString(R.string.Doc_Share_KnownLinkCanReadDes);
                break;
            case 6:
                str2 = C10539a.m43639a(context, R.string.Doc_Share_KnownLinkTitle, "rightName", context.getString(R.string.Doc_Share_LinkCanEdit));
                str = context.getString(R.string.Doc_Share_KnownLinkCanEditDes);
                break;
            case 7:
                str2 = C10539a.m43639a(context, R.string.Doc_Share_KnownLinkTitle, "rightName", context.getString(R.string.Doc_Share_LinkCanView));
                str = context.getString(R.string.Doc_Share_AnyKnownLinkCanReadDes);
                break;
            case 8:
                str2 = C10539a.m43639a(context, R.string.Doc_Share_KnownLinkTitle, "rightName", context.getString(R.string.Doc_Share_LinkCanEdit));
                str = context.getString(R.string.Doc_Share_AnyKnownLinkCanEditDes);
                break;
            default:
                C13479a.m54758a("LinkShareHelper", "getLinkShareItem(): not recognition type = " + i);
                if (C13616d.m55263b()) {
                    throw new IllegalArgumentException("error type = " + i);
                }
                str = str2;
                break;
        }
        return new LinkShareItem(i, str2, str);
    }

    /* renamed from: c */
    public static LinkShareItem m41788c(Context context, int i) {
        String str;
        String str2 = "";
        if (i == 1) {
            str = context.getString(R.string.Doc_Share_CloseLinkDes);
        } else if (i != 2) {
            if (i == 3) {
                str2 = C10539a.m43639a(context, R.string.Doc_Share_OrgTitle, "rightName", context.getString(R.string.Doc_Share_LinkCanVisit));
            } else if (i == 4) {
                str2 = C10539a.m43639a(context, R.string.Doc_Share_OrgTitle, "rightName", context.getString(R.string.Doc_Share_LinkCanEdit));
            } else if (i == 5 || i == 7) {
                str2 = C10539a.m43639a(context, R.string.Doc_Share_KnownLinkTitle, "rightName", context.getString(R.string.Doc_Share_LinkCanVisit));
                str = context.getString(R.string.Doc_Share_KnownLinkCanVisitDes);
            } else {
                C13479a.m54758a("LinkShareHelper", "getLinkShareItem(): not recognition type = " + i);
                if (C13616d.m55263b()) {
                    throw new IllegalArgumentException("error type = " + i);
                }
            }
            str = str2;
        } else {
            str = context.getString(R.string.Doc_Share_NotOwnerCloseTitle);
        }
        return new LinkShareItem(i, str2, str);
    }

    /* renamed from: a */
    public static int m41784a(IDocPublicPermission iDocPublicPermission, boolean z, boolean z2) {
        if (!(!iDocPublicPermission.isLinkShareClose())) {
            if (z) {
                return 1;
            }
            return 2;
        } else if (!z2 || !z) {
            if (iDocPublicPermission.isLinkShareAnyoneEdit()) {
                return 6;
            }
            if (iDocPublicPermission.isLinkShareAnyoneRead()) {
                return 5;
            }
            if (iDocPublicPermission.isLinkShareInternalEdit()) {
                return 4;
            }
            if (iDocPublicPermission.isLinkShareInternalRead()) {
                return 3;
            }
            return 0;
        } else if (iDocPublicPermission.isLinkShareAnyoneEdit()) {
            return 8;
        } else {
            return 7;
        }
    }

    /* renamed from: a */
    public static int m41783a(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        if (i > ShareFolderPublicPermission.getLinkShareClosePerm()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            if (z) {
                return 1;
            }
            return 2;
        } else if (z2 && z) {
            return 7;
        } else {
            if (i == ShareFolderPublicPermission.getLinkShareAnyonePerm(z3)) {
                return 5;
            }
            if (i == ShareFolderPublicPermission.getLinkShareInternalEditPerm()) {
                return 4;
            }
            if (i == ShareFolderPublicPermission.getLinkShareInternalReadPerm()) {
                return 3;
            }
            return 0;
        }
    }
}
