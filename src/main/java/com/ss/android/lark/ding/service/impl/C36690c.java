package com.ss.android.lark.ding.service.impl;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.Urgent;
import com.bytedance.lark.pb.im.v1.AckUrgentRequest;
import com.bytedance.lark.pb.im.v1.CreateUrgentRequest;
import com.bytedance.lark.pb.im.v1.CreateUrgentResponse;
import com.bytedance.lark.pb.im.v1.GetUnackUrgentsRequest;
import com.bytedance.lark.pb.im.v1.GetUnackUrgentsResponse;
import com.bytedance.lark.pb.im.v1.GetUrgentsAckStatusRequest;
import com.bytedance.lark.pb.im.v1.GetUrgentsAckStatusResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.chat.api.AbstractC32810b;
import com.ss.android.lark.chat.api.IChatParser;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.ding.C36618a;
import com.ss.android.lark.ding.entity.DingStatus;
import com.ss.android.lark.ding.service.AbstractC36677d;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.role.GetAdminPermissionInfoRequest;
import com.ss.android.lark.pb.role.GetAdminPermissionInfoResponse;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.ding.service.impl.c */
public class C36690c implements AbstractC36677d {

    /* renamed from: a */
    public AbstractC32810b f94320a;

    /* renamed from: b */
    public IChatParser f94321b;

    /* renamed from: com.ss.android.lark.ding.service.impl.c$a */
    private static final class C36697a {

        /* renamed from: a */
        public static final C36690c f94333a = new C36690c();
    }

    /* renamed from: a */
    public static C36690c m144778a() {
        return C36697a.f94333a;
    }

    private C36690c() {
        this.f94320a = C36618a.m144492a().mo135104i().mo135137b();
        this.f94321b = C36618a.m144492a().mo135104i().mo135124a();
    }

    /* renamed from: b */
    public void mo135300b(IGetDataCallback<List<C36758e>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_UNACK_URGENTS, new GetUnackUrgentsRequest.C17737a(), iGetDataCallback, new SdkSender.IParser<List<C36758e>>() {
            /* class com.ss.android.lark.ding.service.impl.C36690c.C366911 */

            /* renamed from: a */
            public List<C36758e> parse(byte[] bArr) throws IOException {
                GetUnackUrgentsResponse decode = GetUnackUrgentsResponse.ADAPTER.decode(bArr);
                ArrayList arrayList = new ArrayList();
                List<Urgent> list = decode.urgents;
                C14928Entity entity = decode.entity;
                Map<String, MessageInfo> a = C36690c.this.f94320a.mo120947a(entity);
                Map<String, Chat> chatMap = C36690c.this.f94321b.getChatMap(entity.chats);
                for (Urgent urgent : list) {
                    C36758e eVar = new C36758e(C36757d.m144998a(urgent));
                    MessageInfo messageInfo = a.get(urgent.message_id);
                    if (messageInfo == null || messageInfo.getMessageSender() == null) {
                        Log.m165382e("pulling urgent info but messageInfo is null: " + urgent.id);
                    } else {
                        eVar.mo135443a(messageInfo);
                        Channel channel = messageInfo.getMessage().getChannel();
                        eVar.mo135442a(chatMap.get(channel.getId()));
                        if (eVar.mo135449f() == null) {
                            Log.m165382e("pull urgent info but chat is null, channel: " + channel);
                        } else {
                            arrayList.add(eVar);
                        }
                    }
                }
                return arrayList;
            }
        });
    }

    @Override // com.ss.android.lark.ding.service.AbstractC36677d
    /* renamed from: a */
    public DingStatus mo135280a(final String str) {
        return (DingStatus) SdkSender.sendRequest(Command.GET_URGENTS_ACK_STATUS, new GetUrgentsAckStatusRequest.C17751a().mo61949a(Collections.singletonList(str)), new SdkSender.IParser<DingStatus>() {
            /* class com.ss.android.lark.ding.service.impl.C36690c.C366955 */

            /* renamed from: a */
            public DingStatus parse(byte[] bArr) throws IOException {
                return C36757d.m145000a(GetUrgentsAckStatusResponse.ADAPTER.decode(bArr), Collections.singletonList(str)).get(str);
            }
        });
    }

    @Override // com.ss.android.lark.ding.service.AbstractC36677d
    /* renamed from: a */
    public void mo135281a(final IGetDataCallback<Boolean> iGetDataCallback) {
        com.ss.android.lark.pb.improto.Command command = com.ss.android.lark.pb.improto.Command.GET_ADMIN_PERMISSION_INFO;
        GetAdminPermissionInfoRequest.C50002a aVar = new GetAdminPermissionInfoRequest.C50002a();
        C366966 r2 = new IGetDataCallback<GetAdminPermissionInfoResponse>() {
            /* class com.ss.android.lark.ding.service.impl.C36690c.C366966 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(GetAdminPermissionInfoResponse getAdminPermissionInfoResponse) {
                boolean z;
                if (getAdminPermissionInfoResponse == null) {
                    onError(new ErrorResult("response is null"));
                    return;
                }
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (getAdminPermissionInfoResponse.misDepartmentAdministrator.booleanValue() || getAdminPermissionInfoResponse.misSuperAdministrator.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                iGetDataCallback.onSuccess(Boolean.valueOf(z));
            }
        };
        ProtoAdapter<GetAdminPermissionInfoResponse> protoAdapter = GetAdminPermissionInfoResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.sendPassThroughRequest(command, aVar, r2, new SdkSender.IParser() {
            /* class com.ss.android.lark.ding.service.impl.$$Lambda$PIoc97RDoCt0HfdDPiWhWVyQEts */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (GetAdminPermissionInfoResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.ding.service.AbstractC36677d
    /* renamed from: a */
    public void mo135282a(final String str, IGetDataCallback<MessageInfo> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_UNACK_URGENTS, new GetUnackUrgentsRequest.C17737a(), iGetDataCallback, new SdkSender.IParser<MessageInfo>() {
            /* class com.ss.android.lark.ding.service.impl.C36690c.C366933 */

            /* renamed from: a */
            public MessageInfo parse(byte[] bArr) throws IOException {
                Urgent urgent;
                GetUnackUrgentsResponse decode = GetUnackUrgentsResponse.ADAPTER.decode(bArr);
                Iterator<Urgent> it = decode.urgents.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        urgent = null;
                        break;
                    }
                    urgent = it.next();
                    if (TextUtils.equals(urgent.id, str)) {
                        break;
                    }
                }
                if (urgent == null) {
                    return null;
                }
                return C36690c.this.f94320a.mo120947a(decode.entity).get(urgent.message_id);
            }
        });
    }

    /* renamed from: a */
    public void mo135299a(final String str, String str2, IGetDataCallback<String> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.ACK_URGENT, new AckUrgentRequest.C17280a().mo60722a(str2), iGetDataCallback, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.ding.service.impl.C36690c.C366944 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return str;
            }
        });
    }

    @Override // com.ss.android.lark.ding.service.AbstractC36677d
    /* renamed from: a */
    public void mo135283a(String str, List<String> list, int i, boolean z, IGetDataCallback<DingStatus> iGetDataCallback) {
        if (i == Urgent.Type.APP.getValue()) {
            mo135284a(str, list, null, i, z, iGetDataCallback);
        } else {
            mo135284a(str, null, list, i, z, iGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.ding.service.AbstractC36677d
    /* renamed from: a */
    public void mo135284a(final String str, List<String> list, List<String> list2, int i, boolean z, IGetDataCallback<DingStatus> iGetDataCallback) {
        CreateUrgentRequest.C17390a a = new CreateUrgentRequest.C17390a().mo61038a(str).mo61037a(Boolean.valueOf(z));
        ArrayList arrayList = new ArrayList();
        if (!CollectionUtils.isEmpty(list)) {
            arrayList.add(new CreateUrgentRequest.UrgentChatterGroup.C17388a().mo61031a(Urgent.Type.APP).mo61032a(list).build());
        }
        if (!CollectionUtils.isEmpty(list2) && (i == Urgent.Type.SMS.getValue() || i == Urgent.Type.PHONE.getValue())) {
            arrayList.add(new CreateUrgentRequest.UrgentChatterGroup.C17388a().mo61031a(Urgent.Type.fromValue(i)).mo61032a(list2).build());
        }
        a.mo61039a(arrayList);
        SdkSender.asynSendRequestNonWrap(Command.CREATE_URGENT, a, iGetDataCallback, new SdkSender.IParser<DingStatus>() {
            /* class com.ss.android.lark.ding.service.impl.C36690c.C366922 */

            /* renamed from: a */
            public DingStatus parse(byte[] bArr) throws IOException {
                CreateUrgentResponse decode = CreateUrgentResponse.ADAPTER.decode(bArr);
                DingStatus a = C36757d.m144999a(str, decode.success_chatter_ids);
                a.setInvisibleChatterIds(decode.invisible_chatter_ids);
                return a;
            }
        });
    }
}
