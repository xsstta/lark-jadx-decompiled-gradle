package com.ss.android.lark.chatsetting.impl.statistics.ownership;

import com.ss.android.lark.chat.entity.chat.Chat;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.statistics.ownership.a */
public final /* synthetic */ class C35076a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f90527a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f90528b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f90529c;

    static {
        int[] iArr = new int[Chat.PostType.values().length];
        f90527a = iArr;
        iArr[Chat.PostType.WHITE_LIST.ordinal()] = 1;
        iArr[Chat.PostType.ONLY_ADMIN.ordinal()] = 2;
        int[] iArr2 = new int[Chat.GroupMailSendPermissionType.values().length];
        f90528b = iArr2;
        iArr2[Chat.GroupMailSendPermissionType.ANYONE.ordinal()] = 1;
        iArr2[Chat.GroupMailSendPermissionType.ONLY_ADMIN.ordinal()] = 2;
        iArr2[Chat.GroupMailSendPermissionType.ONLY_MEMBER.ordinal()] = 3;
        iArr2[Chat.GroupMailSendPermissionType.ONLY_TENANT.ordinal()] = 4;
        int[] iArr3 = new int[Chat.SystemMessageVisible.values().length];
        f90529c = iArr3;
        iArr3[Chat.SystemMessageVisible.ALL_MEMBERS.ordinal()] = 1;
        iArr3[Chat.SystemMessageVisible.ONLY_OWNER.ordinal()] = 2;
        iArr3[Chat.SystemMessageVisible.NOT_ANYONE.ordinal()] = 3;
    }
}
