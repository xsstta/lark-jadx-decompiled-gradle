package com.ss.android.lark.profile.v2.service;

import com.bytedance.lark.pb.contact.v2.GetNamecardProfileResponse;
import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.v2.service.a */
public final /* synthetic */ class C52915a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f130759a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f130760b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f130761c;

    static {
        int[] iArr = new int[GetUserProfileResponse.Field.FieldType.values().length];
        f130759a = iArr;
        iArr[GetUserProfileResponse.Field.FieldType.TEXT.ordinal()] = 1;
        iArr[GetUserProfileResponse.Field.FieldType.TEXT_LIST.ordinal()] = 2;
        iArr[GetUserProfileResponse.Field.FieldType.LINK.ordinal()] = 3;
        iArr[GetUserProfileResponse.Field.FieldType.LINK_LIST.ordinal()] = 4;
        iArr[GetUserProfileResponse.Field.FieldType.C_ALIAS.ordinal()] = 5;
        iArr[GetUserProfileResponse.Field.FieldType.C_DESCRIPTION.ordinal()] = 6;
        iArr[GetUserProfileResponse.Field.FieldType.S_DEPARTMENT.ordinal()] = 7;
        iArr[GetUserProfileResponse.Field.FieldType.S_PHONE_NUMBER.ordinal()] = 8;
        iArr[GetUserProfileResponse.Field.FieldType.S_FRIEND_LINK.ordinal()] = 9;
        int[] iArr2 = new int[GetUserProfileResponse.Field.FieldType.values().length];
        f130760b = iArr2;
        iArr2[GetUserProfileResponse.Field.FieldType.TEXT.ordinal()] = 1;
        iArr2[GetUserProfileResponse.Field.FieldType.TEXT_LIST.ordinal()] = 2;
        iArr2[GetUserProfileResponse.Field.FieldType.LINK.ordinal()] = 3;
        iArr2[GetUserProfileResponse.Field.FieldType.LINK_LIST.ordinal()] = 4;
        iArr2[GetUserProfileResponse.Field.FieldType.C_ALIAS.ordinal()] = 5;
        iArr2[GetUserProfileResponse.Field.FieldType.ALIAS_AND_MEMO.ordinal()] = 6;
        iArr2[GetUserProfileResponse.Field.FieldType.MEMO_DESCRIPTION.ordinal()] = 7;
        iArr2[GetUserProfileResponse.Field.FieldType.C_DESCRIPTION.ordinal()] = 8;
        iArr2[GetUserProfileResponse.Field.FieldType.S_DEPARTMENT.ordinal()] = 9;
        iArr2[GetUserProfileResponse.Field.FieldType.S_PHONE_NUMBER.ordinal()] = 10;
        iArr2[GetUserProfileResponse.Field.FieldType.S_FRIEND_LINK.ordinal()] = 11;
        int[] iArr3 = new int[GetNamecardProfileResponse.Field.FieldType.values().length];
        f130761c = iArr3;
        iArr3[GetNamecardProfileResponse.Field.FieldType.TEXT.ordinal()] = 1;
        iArr3[GetNamecardProfileResponse.Field.FieldType.LINK.ordinal()] = 2;
        iArr3[GetNamecardProfileResponse.Field.FieldType.PHONE.ordinal()] = 3;
    }
}
