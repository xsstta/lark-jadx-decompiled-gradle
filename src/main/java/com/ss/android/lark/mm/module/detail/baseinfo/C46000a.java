package com.ss.android.lark.mm.module.detail.baseinfo;

import com.ss.android.lark.mm.module.share.model.SharePermission;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, d2 = {"getSelfPermission", "Lcom/ss/android/lark/mm/module/share/model/SharePermission;", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "mm_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.baseinfo.a */
public final class C46000a {
    /* renamed from: a */
    public static final SharePermission m182255a(MmBaseInfo mmBaseInfo) {
        if (mmBaseInfo == null) {
            return SharePermission.NONE;
        }
        if (mmBaseInfo.isOwner()) {
            return SharePermission.OWNER;
        }
        if (mmBaseInfo.isCanModify()) {
            return SharePermission.EDIT;
        }
        return SharePermission.VIEW;
    }
}
