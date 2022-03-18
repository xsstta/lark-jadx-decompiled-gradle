package com.ss.android.lark.mail.impl.utils;

import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.C26280j;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: com.ss.android.lark.mail.impl.utils.e */
public class C43762e {
    /* renamed from: a */
    public static String m173474a(long j, boolean z) {
        LengthType lengthType;
        Date date = new Date(j);
        Options aVar = new Options();
        aVar.mo191599b(!z);
        aVar.mo191601c(false);
        aVar.mo191594a(TimePreciseness.MINUTE);
        aVar.mo191592a(DisplayPattern.RELATIVE);
        if (C26279i.m95164c(date)) {
            lengthType = LengthType.SHORT;
        } else {
            lengthType = LengthType.LONG;
        }
        aVar.mo191593a(lengthType);
        if (C26280j.m95173a(j)) {
            return TimeFormatUtils.m219287d(C41816b.m166115a().mo150132b(), date, aVar);
        }
        return TimeFormatUtils.m219289e(C41816b.m166115a().mo150132b(), date, aVar);
    }

    /* renamed from: a */
    public static String m173475a(Date date, boolean z) {
        LengthType lengthType;
        Options aVar = new Options();
        aVar.mo191599b(!z);
        aVar.mo191601c(false);
        aVar.mo191594a(TimePreciseness.MINUTE);
        if (C26279i.m95164c(date)) {
            lengthType = LengthType.SHORT;
        } else {
            lengthType = LengthType.LONG;
        }
        aVar.mo191593a(lengthType);
        if (C26279i.m95158b(date) == 0) {
            return TimeFormatUtils.m219287d(C41816b.m166115a().mo150132b(), date, aVar);
        }
        return TimeFormatUtils.m219292g(C41816b.m166115a().mo150132b(), date, aVar);
    }

    /* renamed from: a */
    public static String m173476a(Date date, boolean z, boolean z2) {
        LengthType lengthType;
        Options aVar = new Options();
        aVar.mo191599b(!z);
        aVar.mo191601c(false);
        aVar.mo191594a(TimePreciseness.MINUTE);
        aVar.mo191595a(TimeZone.getDefault().getID());
        aVar.mo191597a(z2);
        if (C26279i.m95164c(date)) {
            lengthType = LengthType.SHORT;
        } else {
            lengthType = LengthType.LONG;
        }
        aVar.mo191593a(lengthType);
        aVar.mo191592a(DisplayPattern.RELATIVE);
        return TimeFormatUtils.m219293h(C41816b.m166115a().mo150132b(), date, aVar);
    }
}
