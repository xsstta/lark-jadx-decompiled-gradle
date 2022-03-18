package com.ss.android.lark.sticker.api.custom;

import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.sticker.p2714a.C55037l;
import java.util.List;

public class PushCustomizedStickersRequest {

    /* renamed from: a */
    private Operation f136020a;

    /* renamed from: b */
    private List<Sticker> f136021b;

    /* renamed from: c */
    private long f136022c;

    public enum Operation {
        ADD(1),
        DELETE(2),
        MODIFY(3);
        
        private int mValue;

        public int getNumber() {
            return this.mValue;
        }

        public static Operation valueOf(int i) {
            return forNumber(i);
        }

        public static Operation forNumber(int i) {
            if (i == 1) {
                return ADD;
            }
            if (i == 2) {
                return DELETE;
            }
            if (i != 3) {
                return null;
            }
            return MODIFY;
        }

        private Operation(int i) {
            this.mValue = i;
        }
    }

    /* renamed from: a */
    public List<Sticker> mo187897a() {
        return this.f136021b;
    }

    public PushCustomizedStickersRequest(com.bytedance.lark.pb.im.v1.PushCustomizedStickersRequest pushCustomizedStickersRequest) {
        m213751a(pushCustomizedStickersRequest);
    }

    /* renamed from: a */
    private void m213751a(com.bytedance.lark.pb.im.v1.PushCustomizedStickersRequest pushCustomizedStickersRequest) {
        if (pushCustomizedStickersRequest != null) {
            this.f136020a = Operation.forNumber(pushCustomizedStickersRequest.operation.getValue());
            this.f136021b = C55037l.m213714b(pushCustomizedStickersRequest.stickers);
            this.f136022c = pushCustomizedStickersRequest.update_time.longValue();
        }
    }
}
