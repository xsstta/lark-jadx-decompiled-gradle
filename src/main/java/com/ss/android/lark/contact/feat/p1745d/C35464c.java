package com.ss.android.lark.contact.feat.p1745d;

import com.bytedance.lark.pb.basic.v1.ChatApplication;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.contact.v2.GetAddressBookContactListRequest;
import com.bytedance.lark.pb.contact.v2.GetAddressBookContactListResponse;
import com.bytedance.lark.pb.contact.v2.GetExternalContactListRequest;
import com.bytedance.lark.pb.contact.v2.GetExternalContactListResponse;
import com.bytedance.lark.pb.contact.v2.MGetUserInfoByCpsRequest;
import com.bytedance.lark.pb.contact.v2.MGetUserInfoByCpsResponse;
import com.bytedance.lark.pb.im.v1.ProcessChatApplicationRequest;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.contact.entity.mobile.ContactMobileBean;
import com.ss.android.lark.contact.entity.mobile.ContactsMobileFeishuInfo;
import com.ss.android.lark.contact.feat.entity.C35469b;
import com.ss.android.lark.contact.feat.entity.C35470c;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.feat.d.c */
public class C35464c {
    public static /* synthetic */ Boolean lambda$4t280oOlI3CKa5jhL70k8YEKKUM(byte[] bArr) {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ C35470c m138734c(byte[] bArr) throws IOException {
        return C35470c.m138747a(GetExternalContactListResponse.ADAPTER.decode(bArr));
    }

    /* renamed from: a */
    private static List<ContactMobileBean> m138727a(List<ContactMobileBean> list) {
        return list.subList(0, Math.min(list.size(), ContactDataUtils.m138722c()));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ List m138733b(byte[] bArr) throws IOException {
        MGetUserInfoByCpsResponse decode = MGetUserInfoByCpsResponse.ADAPTER.decode(bArr);
        ArrayList arrayList = new ArrayList();
        if (decode.cp_user_infos != null) {
            for (int i = 0; i < decode.cp_user_infos.size(); i++) {
                C35469b a = C35469b.m138744a(decode.cp_user_infos.get(i));
                if (a != null) {
                    arrayList.add(a);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m138728a(Boolean bool, IGetDataCallback<C35470c> iGetDataCallback) {
        m138731a(bool.booleanValue(), 0, 15000, iGetDataCallback);
    }

    /* renamed from: a */
    public static void m138729a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.PROCESS_CHAT_APPLICATION, new ProcessChatApplicationRequest.C17851a().mo62211a(str).mo62209a(ChatApplication.Status.AGREED), iGetDataCallback, $$Lambda$c$4t280oOlI3CKa5jhL70k8YEKKUM.INSTANCE);
    }

    /* renamed from: a */
    public static void m138730a(List<String> list, IGetDataCallback<List<C35469b>> iGetDataCallback) {
        if (list != null && !list.isEmpty()) {
            MGetUserInfoByCpsRequest.C16540a aVar = new MGetUserInfoByCpsRequest.C16540a();
            aVar.mo58883a(list);
            SdkSender.asynSendRequestNonWrap(Command.MGET_USER_INFO_BY_CPS, aVar, iGetDataCallback, $$Lambda$c$ohJ7K0uBEiTJFN9E_P_U3zE9C8s.INSTANCE);
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(new ArrayList());
        }
    }

    /* renamed from: a */
    public static void m138732a(boolean z, IGetDataCallback<ContactsMobileFeishuInfo> iGetDataCallback) {
        GetAddressBookContactListRequest.C16432a aVar = new GetAddressBookContactListRequest.C16432a();
        if (ContactDataUtils.m138721b()) {
            aVar.mo58637a(Long.valueOf(ContactDataUtils.m138718a()));
        }
        List<ContactMobileBean> a = C35466d.m138736a(3);
        if (a.isEmpty()) {
            iGetDataCallback.onSuccess(ContactsMobileFeishuInfo.f91479a.mo130648a());
            return;
        }
        List<ContactMobileBean> a2 = m138727a(a);
        aVar.mo58638a(C35466d.m138737a(a2));
        if (z) {
            aVar.mo58636a(SyncDataStrategy.LOCAL);
        }
        SdkSender.asynSendRequestNonWrap(Command.GET_ADDRESS_BOOK_CONTACT_LIST, aVar, iGetDataCallback, new SdkSender.IParser(z, a2) {
            /* class com.ss.android.lark.contact.feat.p1745d.$$Lambda$c$7zx8JGhJQc8HX9m0QYzn7DRiHZM */
            public final /* synthetic */ boolean f$0;
            public final /* synthetic */ List f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C35464c.m138725a(this.f$0, this.f$1, bArr);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ContactsMobileFeishuInfo m138725a(boolean z, List list, byte[] bArr) throws IOException {
        GetAddressBookContactListResponse decode = GetAddressBookContactListResponse.ADAPTER.decode(bArr);
        if (!z) {
            ContactDataUtils.m138719a(decode.new_timeline_mark.longValue());
        }
        return ContactsMobileFeishuInfo.f91479a.mo130649a(list, decode);
    }

    /* renamed from: a */
    public static void m138731a(boolean z, long j, long j2, final IGetDataCallback<C35470c> iGetDataCallback) {
        GetExternalContactListRequest.C16458a aVar = new GetExternalContactListRequest.C16458a();
        if (z) {
            aVar.mo58699a(SyncDataStrategy.LOCAL);
        } else {
            aVar.mo58699a(SyncDataStrategy.FORCE_SERVER);
        }
        aVar.mo58700a(Long.valueOf(j));
        if (j2 > 0) {
            aVar.mo58702b(Long.valueOf(j2));
        }
        $$Lambda$c$DoOiS0OsGKwVnoKJvsqmZs4lL4M r1 = $$Lambda$c$DoOiS0OsGKwVnoKJvsqmZs4lL4M.INSTANCE;
        SdkSender.asynSendRequestNonWrap(Command.GET_EXTERNAL_CONTACT_LIST, aVar, new IGetDataCallback<C35470c>() {
            /* class com.ss.android.lark.contact.feat.p1745d.C35464c.C354651 */

            /* renamed from: a */
            public void onSuccess(C35470c cVar) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(cVar);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        }, r1);
    }
}
