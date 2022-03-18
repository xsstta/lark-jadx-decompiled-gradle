package com.ss.android.lark.mm.module.participant;

import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.participant.c */
public final /* synthetic */ class C46586c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f117231a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f117232b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f117233c;

    static {
        int[] iArr = new int[ParticipantRepo.DataSource.values().length];
        f117231a = iArr;
        iArr[ParticipantRepo.DataSource.ParticipantsFirstPage.ordinal()] = 1;
        iArr[ParticipantRepo.DataSource.ParticipantsNextPage.ordinal()] = 2;
        iArr[ParticipantRepo.DataSource.ParticipantSuggestionFirstPage.ordinal()] = 3;
        iArr[ParticipantRepo.DataSource.ParticipantSuggestionNextPage.ordinal()] = 4;
        int[] iArr2 = new int[ParticipantRepo.DataSource.values().length];
        f117232b = iArr2;
        iArr2[ParticipantRepo.DataSource.ParticipantsFirstPage.ordinal()] = 1;
        iArr2[ParticipantRepo.DataSource.ParticipantSuggestionFirstPage.ordinal()] = 2;
        int[] iArr3 = new int[ParticipantRepo.DataSource.values().length];
        f117233c = iArr3;
        iArr3[ParticipantRepo.DataSource.ParticipantsFirstPage.ordinal()] = 1;
        iArr3[ParticipantRepo.DataSource.ParticipantSuggestionNextPage.ordinal()] = 2;
    }
}
