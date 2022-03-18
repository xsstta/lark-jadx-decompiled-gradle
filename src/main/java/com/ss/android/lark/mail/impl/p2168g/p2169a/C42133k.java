package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.Message;
import com.ss.android.lark.mail.impl.entity.MailMessageDeliveryState;

/* renamed from: com.ss.android.lark.mail.impl.g.a.k */
public class C42133k extends C42128h<Message.DeliveryState, MailMessageDeliveryState> {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.g.a.k$1 */
    public static /* synthetic */ class C421341 {

        /* renamed from: a */
        static final /* synthetic */ int[] f107178a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 121
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.p2168g.p2169a.C42133k.C421341.<clinit>():void");
        }
    }

    public C42133k(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public MailMessageDeliveryState mo152042b(Message.DeliveryState deliveryState, MailMessageDeliveryState mailMessageDeliveryState) {
        if (mailMessageDeliveryState == null) {
            mailMessageDeliveryState = new MailMessageDeliveryState();
        }
        switch (C421341.f107178a[deliveryState.ordinal()]) {
            case 1:
                mailMessageDeliveryState.mo151633a(5);
                break;
            case 2:
                mailMessageDeliveryState.mo151633a(2);
                break;
            case 3:
                mailMessageDeliveryState.mo151633a(1);
                break;
            case 4:
                mailMessageDeliveryState.mo151633a(6);
                break;
            case 5:
                mailMessageDeliveryState.mo151633a(4);
                break;
            case 6:
                mailMessageDeliveryState.mo151633a(3);
                break;
            case 7:
                mailMessageDeliveryState.mo151633a(7);
                break;
            case 8:
                mailMessageDeliveryState.mo151633a(8);
                break;
            case 9:
                mailMessageDeliveryState.mo151633a(9);
                break;
            case 10:
                mailMessageDeliveryState.mo151633a(10);
                break;
            default:
                mailMessageDeliveryState.mo151633a(0);
                break;
        }
        return mailMessageDeliveryState;
    }

    /* renamed from: b */
    public Message.DeliveryState mo152040a(Message.DeliveryState deliveryState, MailMessageDeliveryState mailMessageDeliveryState) {
        super.mo152040a((Object) deliveryState, (Object) mailMessageDeliveryState);
        switch (mailMessageDeliveryState.mo151632a()) {
            case 1:
                return Message.DeliveryState.TO_SEND;
            case 2:
                return Message.DeliveryState.SENDING;
            case 3:
                return Message.DeliveryState.DELIVERED;
            case 4:
                return Message.DeliveryState.RECEIVED;
            case 5:
                return Message.DeliveryState.DRAFT;
            case 6:
                return Message.DeliveryState.SEND_ERROR;
            case 7:
                return Message.DeliveryState.SENT_TO_SELF;
            case 8:
                return Message.DeliveryState.RECALL;
            case 9:
                return Message.DeliveryState.PENDING;
            case 10:
                return Message.DeliveryState.SCHEDULED;
            default:
                return Message.DeliveryState.UNKNOWN_DELIVERY_STATE;
        }
    }
}
