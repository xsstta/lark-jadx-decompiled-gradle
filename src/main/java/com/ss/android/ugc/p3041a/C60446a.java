package com.ss.android.ugc.p3041a;

import com.ss.android.ugc.p3041a.C60447b;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: com.ss.android.ugc.a.a */
public class C60446a implements C60447b.AbstractC60449b {

    /* renamed from: a */
    private double f151031a = -1.0d;

    @Override // com.ss.android.ugc.p3041a.C60447b.AbstractC60449b
    /* renamed from: a */
    public double mo206934a(Queue<C60450c> queue, C60450c[] cVarArr) {
        return mo206935b(queue, cVarArr);
    }

    /* renamed from: b */
    public double mo206935b(Queue<C60450c> queue, C60450c[] cVarArr) {
        double d = -1.0d;
        if (queue.size() < 1) {
            return -1.0d;
        }
        queue.toArray(cVarArr);
        int i = 0;
        Arrays.sort(cVarArr, 0, queue.size());
        int size = queue.size();
        double d2 = 0.0d;
        for (int i2 = 0; i2 < size; i2++) {
            d2 += cVarArr[i2].f151045c;
        }
        double d3 = d2 / 2.0d;
        while (true) {
            if (i >= size) {
                break;
            }
            d3 -= cVarArr[i].f151045c;
            if (d3 <= 0.0d) {
                d = cVarArr[i].f151044b;
                break;
            }
            i++;
        }
        if (d >= 0.0d) {
            this.f151031a = d;
            return d;
        }
        throw new IllegalArgumentException();
    }
}
