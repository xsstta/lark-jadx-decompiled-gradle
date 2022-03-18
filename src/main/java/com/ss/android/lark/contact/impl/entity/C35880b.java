package com.ss.android.lark.contact.impl.entity;

import com.bytedance.lark.pb.contact.v2.GetContactEntriesResponse;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.entity.b */
public final /* synthetic */ class C35880b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f92814a;

    static {
        int[] iArr = new int[GetContactEntriesResponse.Type.values().length];
        f92814a = iArr;
        iArr[GetContactEntriesResponse.Type.Organization.ordinal()] = 1;
        iArr[GetContactEntriesResponse.Type.ExternalContacts.ordinal()] = 2;
        iArr[GetContactEntriesResponse.Type.NewContacts.ordinal()] = 3;
        iArr[GetContactEntriesResponse.Type.ChatGroups.ordinal()] = 4;
        iArr[GetContactEntriesResponse.Type.HelpDesks.ordinal()] = 5;
        iArr[GetContactEntriesResponse.Type.EduContacts.ordinal()] = 6;
        iArr[GetContactEntriesResponse.Type.RelatedOrganizations.ordinal()] = 7;
        iArr[GetContactEntriesResponse.Type.SpecialFocus.ordinal()] = 8;
    }
}
