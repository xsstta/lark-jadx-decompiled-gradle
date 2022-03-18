package com.ss.android.lark.sticker.dto;

import com.bytedance.lark.pb.im.v1.PushStickerSetsRequest;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.sticker.p2714a.C55037l;
import java.util.List;

public class PushStickerSetsResponse {

    /* renamed from: a */
    private Operation f136032a;

    /* renamed from: b */
    private List<StickerSet> f136033b;

    /* renamed from: c */
    private long f136034c;

    public enum Operation {
        UNKNOWN(0),
        ADD(1),
        DELETE(2),
        REORDER(3);
        
        private int mValue;

        public int getNumber() {
            return this.mValue;
        }

        public static Operation valueOf(int i) {
            return forNumber(i);
        }

        public static Operation forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ADD;
            }
            if (i == 2) {
                return DELETE;
            }
            if (i != 3) {
                return null;
            }
            return REORDER;
        }

        private Operation(int i) {
            this.mValue = i;
        }
    }

    /* renamed from: a */
    public Operation mo187916a() {
        return this.f136032a;
    }

    /* renamed from: b */
    public List<StickerSet> mo187917b() {
        return this.f136033b;
    }

    /* renamed from: c */
    public long mo187918c() {
        return this.f136034c;
    }

    public PushStickerSetsResponse(PushStickerSetsRequest pushStickerSetsRequest) {
        m213808a(pushStickerSetsRequest);
    }

    /* renamed from: a */
    private void m213808a(PushStickerSetsRequest pushStickerSetsRequest) {
        if (pushStickerSetsRequest != null) {
            this.f136032a = Operation.forNumber(pushStickerSetsRequest.operation.getValue());
            this.f136033b = C55037l.m213713a(pushStickerSetsRequest.sticker_sets);
            this.f136034c = pushStickerSetsRequest.update_time.longValue();
        }
    }
}
