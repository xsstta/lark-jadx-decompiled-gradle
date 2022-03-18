package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.ss.android.lark.mail.impl.entity.AddressType;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.SendStatusDetail;
import com.ss.android.lark.pb.mailentities.Address;
import com.ss.android.lark.pb.mailentities.MailGroupType;
import com.ss.android.lark.pb.mailentities.MailSendStatusDetail;

/* renamed from: com.ss.android.lark.mail.impl.g.a.ac */
public class C42114ac extends C42128h<MailSendStatusDetail, SendStatusDetail> {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.g.a.ac$1 */
    public static /* synthetic */ class C421151 {

        /* renamed from: a */
        static final /* synthetic */ int[] f107147a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.pb.mailentities.Timestamp$Unit[] r0 = com.ss.android.lark.pb.mailentities.Timestamp.Unit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.p2168g.p2169a.C42114ac.C421151.f107147a = r0
                com.ss.android.lark.pb.mailentities.Timestamp$Unit r1 = com.ss.android.lark.pb.mailentities.Timestamp.Unit.S     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.p2168g.p2169a.C42114ac.C421151.f107147a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.pb.mailentities.Timestamp$Unit r1 = com.ss.android.lark.pb.mailentities.Timestamp.Unit.US     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.p2168g.p2169a.C42114ac.C421151.f107147a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.pb.mailentities.Timestamp$Unit r1 = com.ss.android.lark.pb.mailentities.Timestamp.Unit.NS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.mail.impl.p2168g.p2169a.C42114ac.C421151.f107147a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.pb.mailentities.Timestamp$Unit r1 = com.ss.android.lark.pb.mailentities.Timestamp.Unit.MS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.p2168g.p2169a.C42114ac.C421151.<clinit>():void");
        }
    }

    public C42114ac(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: b */
    public MailSendStatusDetail mo152040a(MailSendStatusDetail mailSendStatusDetail, SendStatusDetail sendStatusDetail) {
        super.mo152040a((Object) mailSendStatusDetail, (Object) sendStatusDetail);
        if (sendStatusDetail == null) {
            return null;
        }
        return new MailSendStatusDetail.C49823a().build();
    }

    /* renamed from: a */
    public SendStatusDetail mo152042b(MailSendStatusDetail mailSendStatusDetail, SendStatusDetail sendStatusDetail) {
        super.mo152042b((Object) mailSendStatusDetail, (Object) sendStatusDetail);
        if (mailSendStatusDetail == null) {
            return null;
        }
        SendStatusDetail.C42083a aVar = new SendStatusDetail.C42083a();
        if (mailSendStatusDetail.mrecipients != null) {
            MailAddress.C42062a aVar2 = new MailAddress.C42062a();
            aVar2.mo151209a(mailSendStatusDetail.mrecipients.mname);
            aVar2.mo151212b(mailSendStatusDetail.mrecipients.maddress);
            aVar2.mo151217g(mailSendStatusDetail.mrecipients.mdisplay_name);
            aVar2.mo151216f(String.valueOf(mailSendStatusDetail.mrecipients.mtenant_id));
            aVar2.mo151213c(String.valueOf(mailSendStatusDetail.mrecipients.mlark_entity_id));
            AddressType addressType = AddressType.UNKNOWN;
            if (mailSendStatusDetail.mrecipients.mmail_group_type != null) {
                addressType = mailSendStatusDetail.mrecipients.mmail_group_type == MailGroupType.NORMAL_MAIL_GROUP ? AddressType.ENTERPRISE_MAIL_GROUP : AddressType.GROUP;
            } else if (mailSendStatusDetail.mrecipients.mlark_entity_type != null) {
                if (mailSendStatusDetail.mrecipients.mlark_entity_type == Address.LarkEntityType.SHARED_MAILBOX) {
                    addressType = AddressType.SHARED_MAILBOX;
                } else if (mailSendStatusDetail.mrecipients.mlark_entity_type == Address.LarkEntityType.USER) {
                    addressType = AddressType.USER;
                }
            }
            aVar2.mo151207a(addressType);
            aVar.mo151777a(aVar2.mo151210a());
        }
        if (mailSendStatusDetail.mdetail_status != null) {
            aVar.mo151778a(SendStatusDetail.SendStatus.fromValue(mailSendStatusDetail.mdetail_status.getValue()));
        }
        if (mailSendStatusDetail.mlast_updated_time != null) {
            if (mailSendStatusDetail.mlast_updated_time.munit != null) {
                int i = C421151.f107147a[mailSendStatusDetail.mlast_updated_time.munit.ordinal()];
                if (i == 1) {
                    aVar.mo151776a(mailSendStatusDetail.mlast_updated_time.mvalue.longValue() * 1000);
                } else if (i == 2) {
                    aVar.mo151776a(mailSendStatusDetail.mlast_updated_time.mvalue.longValue() * 1000000);
                } else if (i != 3) {
                    aVar.mo151776a(mailSendStatusDetail.mlast_updated_time.mvalue.longValue());
                } else {
                    aVar.mo151776a(mailSendStatusDetail.mlast_updated_time.mvalue.longValue() * 1000000000);
                }
            } else {
                aVar.mo151776a(mailSendStatusDetail.mlast_updated_time.mvalue.longValue());
            }
        }
        return aVar.mo151779a();
    }
}
