package com.bytedance.ee.bear.document.offline.sync.preloadexecutor;

import com.bytedance.apm.util.C3130n;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.ee.bear.document.offline.sync.preloadexecutor.d */
public class C6026d {

    /* renamed from: a */
    private AtomicInteger f16874a;

    /* renamed from: b */
    public int mo24334b() {
        AtomicInteger atomicInteger = this.f16874a;
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    /* renamed from: a */
    public boolean mo24332a() {
        boolean z;
        boolean z2 = false;
        if (!mo24333a(SubBlockType.IMAGE_DATA) || mo24335b(SubBlockType.IMAGE_DATA)) {
            z = true;
        } else {
            z = false;
        }
        if (mo24333a(SubBlockType.POLL_DATA)) {
            if (!z || !mo24335b(SubBlockType.POLL_DATA)) {
                z = false;
            } else {
                z = true;
            }
        }
        if (mo24333a(SubBlockType.COMMENTS_DATA)) {
            if (!z || !mo24335b(SubBlockType.COMMENTS_DATA)) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!mo24333a(SubBlockType.INNER_SHEET)) {
            return z;
        }
        if (z && mo24335b(SubBlockType.INNER_SHEET)) {
            z2 = true;
        }
        return z2;
    }

    public C6026d(int i) {
        this.f16874a = new AtomicInteger(i);
    }

    /* renamed from: a */
    public void mo24331a(int i) {
        AtomicInteger atomicInteger = this.f16874a;
        atomicInteger.set(i | atomicInteger.get());
    }

    /* renamed from: c */
    private Integer m24396c(SubBlockType subBlockType) {
        int i = 1;
        if (subBlockType != SubBlockType.IMAGE_DATA) {
            if (subBlockType == SubBlockType.POLL_DATA) {
                i = 4;
            } else if (subBlockType == SubBlockType.COMMENTS_DATA) {
                i = 16;
            } else if (subBlockType == SubBlockType.INNER_SHEET) {
                i = 64;
            }
        }
        return Integer.valueOf(i);
    }

    /* renamed from: a */
    public boolean mo24333a(SubBlockType subBlockType) {
        boolean z;
        int intValue = m24396c(subBlockType).intValue();
        if (intValue == (this.f16874a.get() & intValue)) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    /* renamed from: b */
    public boolean mo24335b(SubBlockType subBlockType) {
        boolean z;
        boolean z2;
        C3130n<Integer, Integer> d = m24397d(subBlockType);
        int intValue = d.f10052a.intValue();
        int intValue2 = d.f10053b.intValue();
        if (intValue == (this.f16874a.get() & intValue)) {
            z = true;
        } else {
            z = false;
        }
        if (intValue2 == (this.f16874a.get() & intValue2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private C3130n<Integer, Integer> m24397d(SubBlockType subBlockType) {
        if (subBlockType == SubBlockType.IMAGE_DATA) {
            return new C3130n<>(2, 3);
        }
        if (subBlockType == SubBlockType.POLL_DATA) {
            return new C3130n<>(8, 12);
        }
        if (subBlockType == SubBlockType.COMMENTS_DATA) {
            return new C3130n<>(32, 48);
        }
        if (subBlockType == SubBlockType.INNER_SHEET) {
            return new C3130n<>(Integer.valueOf((int) SmActions.ACTION_ONTHECALL_EXIT), 192);
        }
        return new C3130n<>(2, 3);
    }
}
