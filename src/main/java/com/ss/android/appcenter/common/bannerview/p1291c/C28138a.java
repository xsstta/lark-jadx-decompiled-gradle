package com.ss.android.appcenter.common.bannerview.p1291c;

import android.content.res.Resources;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;

/* renamed from: com.ss.android.appcenter.common.bannerview.c.a */
public class C28138a {
    /* renamed from: a */
    public static int m102969a(int i) {
        return ParticipantRepo.f117150c - (ParticipantRepo.f117150c % i);
    }

    /* renamed from: a */
    public static int m102968a(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    public static int m102970a(int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        return (i + i2) % i2;
    }
}
