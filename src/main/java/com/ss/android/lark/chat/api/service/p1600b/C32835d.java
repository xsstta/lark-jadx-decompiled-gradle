package com.ss.android.lark.chat.api.service.p1600b;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.contact.v1.DeleteChatterWorkStatusRequest;
import com.bytedance.lark.pb.contact.v1.GetBotsRequest;
import com.bytedance.lark.pb.contact.v1.GetBotsResponse;
import com.bytedance.lark.pb.contact.v1.GetUserUpdateNamePermissionRequest;
import com.bytedance.lark.pb.contact.v1.GetUserUpdateNamePermissionResponse;
import com.bytedance.lark.pb.contact.v1.MGetChattersRequest;
import com.bytedance.lark.pb.contact.v1.MGetChattersResponse;
import com.bytedance.lark.pb.contact.v1.SetChannelNicknameRequest;
import com.bytedance.lark.pb.contact.v1.SetChannelNicknameResponse;
import com.bytedance.lark.pb.contact.v1.SetChatterAliasRequest;
import com.bytedance.lark.pb.contact.v1.SetUserNameRequest;
import com.bytedance.lark.pb.contact.v1.SetUserNameResponse;
import com.bytedance.lark.pb.contact.v1.UpdateChatterRequest;
import com.bytedance.lark.pb.contact.v1.UpdateChatterResponse;
import com.bytedance.lark.pb.im.v1.GetChatChattersByIdsRequest;
import com.bytedance.lark.pb.im.v1.GetChatChattersByIdsResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.BotsResponse;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.chat.service.AbstractC34297l;
import com.ss.android.lark.chat.utils.SDKSendUtils;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2851u.p2852a.C57309d;
import com.ss.android.lark.p2851u.p2852a.C57314g;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.C57878s;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.lark.utils.rxjava.ReportErrorConsumer;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Scheduler;
import io.reactivex.functions.Consumer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.api.service.b.d */
public class C32835d implements AbstractC34297l {

    /* renamed from: a */
    public AbstractC36450aa f84320a;

    /* renamed from: b */
    private volatile Chatter f84321b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.api.service.b.d$a */
    public static final class C32847a {

        /* renamed from: a */
        public static final C32835d f84370a = new C32835d();
    }

    /* renamed from: c */
    public static C32835d m126323c() {
        return C32847a.f84370a;
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: a */
    public void mo121194a(Chatter chatter) {
        C57744a.m224104a().putString("chatter_info", C57878s.m224591a(chatter));
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: a */
    public void mo121195a(final String str) {
        mo121208b(str, new IGetDataCallback<Chatter>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.C328361 */

            /* renamed from: a */
            public void onSuccess(Chatter chatter) {
                C57744a.m224104a().putString("chatter_info", C57878s.m224591a(chatter));
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("ChatterService", "get login user : " + str + " error: " + errorResult.getMessage());
            }
        });
    }

    /* renamed from: a */
    public void mo121197a(String str, String str2, IGetDataCallback<ChatChatter> iGetDataCallback) {
        C57865c.m224574a(new C57865c.AbstractC57873d(str, str2) {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$d$x5V1f56qENKcVlho1pAeBbp_DQ */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return C32835d.this.m126324c(this.f$1, this.f$2);
            }
        }, new C57865c.AbstractC57871b() {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$d$3aCo5pFeaB4n2TGozcV_TDxitB8 */

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
            public final void consume(Object obj) {
                C32835d.m126321a(IGetDataCallback.this, (ChatChatter) obj);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: a */
    public void mo121196a(String str, final IGetDataCallback<OpenChatter> iGetDataCallback) {
        mo121208b(str, new IGetDataCallback<Chatter>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.AnonymousClass23 */

            /* renamed from: a */
            public void onSuccess(Chatter chatter) {
                iGetDataCallback.onSuccess(chatter);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: a */
    public void mo121200a(List<String> list, final IGetDataCallback<Map<String, Chatter>> iGetDataCallback) {
        mo121217d(list).subscribeOn(LarkRxSchedulers.io()).subscribe(new Consumer<Map<String, Chatter>>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.AnonymousClass24 */

            /* renamed from: a */
            public void accept(Map<String, Chatter> map) throws Exception {
                iGetDataCallback.onSuccess(map);
            }
        }, new ReportErrorConsumer() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.AnonymousClass25 */

            @Override // com.ss.android.lark.utils.rxjava.ReportErrorConsumer
            public void error(Throwable th) throws Exception {
                iGetDataCallback.onError(new ErrorResult(th.getMessage()));
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: b */
    public void mo121210b(List<String> list, IGetDataCallback<Map<String, Chatter>> iGetDataCallback) {
        if (CollectionUtils.isEmpty(list)) {
            iGetDataCallback.onSuccess(new HashMap());
        } else {
            SdkSender.asynSendRequestNonWrap(Command.MGET_CHATTERS, new MGetChattersRequest.C16324a().mo58370a(list).mo58369a((Boolean) true), iGetDataCallback, new SdkSender.IParser<Map<String, Chatter>>() {
                /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.AnonymousClass27 */

                /* renamed from: a */
                public Map<String, Chatter> parse(byte[] bArr) throws IOException {
                    return C32835d.m126320a(bArr);
                }
            });
        }
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: a */
    public void mo121201a(final boolean z, final IGetDataCallback<Chatter> iGetDataCallback) {
        C57865c.m224574a(new C57865c.AbstractC57873d<Chatter>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.C328426 */

            /* renamed from: a */
            public Chatter produce() {
                if (!z) {
                    return C32835d.this.mo121186a();
                }
                Chatter a = C32835d.this.mo121186a();
                String a2 = C32835d.this.f84320a.mo134394a();
                if (a == null || !TextUtils.equals(a.getId(), a2)) {
                    return C32835d.this.mo121203b(a2);
                }
                return a;
            }
        }, new C57865c.AbstractC57871b<Chatter>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.C328437 */

            /* renamed from: a */
            public void consume(Chatter chatter) {
                if (chatter != null) {
                    iGetDataCallback.onSuccess(chatter);
                } else {
                    iGetDataCallback.onError(new ErrorResult("Can't find target chatter!"));
                }
            }
        });
    }

    /* renamed from: a */
    public void mo121192a(IGetDataCallback<BotsResponse> iGetDataCallback, int i, int i2) {
        SdkSender.asynSendRequestNonWrap(Command.GET_BOTS, new GetBotsRequest.C16184a().mo58043a(Integer.valueOf(i)).mo58045b(Integer.valueOf(i2)), iGetDataCallback, new SdkSender.IParser<BotsResponse>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.AnonymousClass11 */

            /* renamed from: a */
            public BotsResponse parse(byte[] bArr) throws IOException {
                GetBotsResponse decode = GetBotsResponse.ADAPTER.decode(bArr);
                return new BotsResponse(C57314g.m222103a(decode.bots), decode.has_more.booleanValue());
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: a */
    public void mo121193a(Channel channel, String str, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SET_CHANNEL_NICKNAME, new SetChannelNicknameRequest.C16390a().mo58526a(C57309d.m222072a(channel)).mo58527a(str), iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.AnonymousClass13 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                SetChannelNicknameResponse.ADAPTER.decode(bArr);
                return true;
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: a */
    public void mo121198a(String str, String str2, final String str3, IGetDataCallback<String> iGetDataCallback) {
        SetChatterAliasRequest.C16394a aVar = new SetChatterAliasRequest.C16394a();
        String str4 = "";
        if (TextUtils.isEmpty(str)) {
            str = str4;
        }
        aVar.mo58536a(str);
        if (TextUtils.isEmpty(str2)) {
            str2 = str4;
        }
        aVar.mo58539c(str2);
        if (!TextUtils.isEmpty(str3)) {
            str4 = str3;
        }
        aVar.mo58538b(str4);
        SdkSender.asynSendRequestNonWrap(Command.SET_CHATTER_ALIAS, aVar, iGetDataCallback, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.AnonymousClass14 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return str3;
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: a */
    public void mo121199a(final String str, List<String> list, IGetDataCallback<Map<String, ChatChatter>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_CHAT_CHATTERS_BY_IDS, new GetChatChattersByIdsRequest.C17502a().mo61316a(str).mo61317a(list), iGetDataCallback, new SdkSender.IParser<Map<String, ChatChatter>>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.AnonymousClass17 */

            /* renamed from: a */
            public Map<String, ChatChatter> parse(byte[] bArr) throws IOException {
                return C57314g.m222100a(GetChatChattersByIdsResponse.ADAPTER.decode(bArr).entity, str).mo124896b();
            }
        });
    }

    private C32835d() {
        this.f84320a = C29990c.m110930b().mo134515N();
    }

    /* renamed from: d */
    private Chatter m126325d() {
        Log.m165389i("ChatterService", "getLoginUser");
        if (!C26252ad.m94993b(C29990c.m110930b().mo134528a())) {
            return m126327e();
        }
        if (this.f84321b == null) {
            this.f84321b = m126327e();
        }
        return this.f84321b;
    }

    /* renamed from: e */
    private Chatter m126327e() {
        String string = C57744a.m224104a().getString("chatter_info");
        Chatter chatter = (Chatter) C57878s.m224590a(string, Chatter.class);
        if (chatter == null) {
            Log.m165383e("ChatterService", "loadChatter, parseJson failed, data is:" + string);
        }
        return chatter;
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: a */
    public Chatter mo121186a() {
        Log.m165389i("ChatterService", "get LoginChatter");
        String a = this.f84320a.mo134394a();
        if (TextUtils.isEmpty(a)) {
            Log.m165383e("ChatterService", "get LoginChatter, userId is null");
            return null;
        }
        Chatter c = mo121211c(a);
        if (c != null) {
            return c;
        }
        return m126325d();
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: b */
    public void mo121206b() {
        SdkSender.asynSendRequestNonWrap(Command.DELETE_CHATTER_WORK_STATUS, new DeleteChatterWorkStatusRequest.C16160a(), null, new SdkSender.IParser() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.AnonymousClass19 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return null;
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: b */
    public void mo121207b(IGetDataCallback<BotsResponse> iGetDataCallback) {
        mo121192a(iGetDataCallback, 0, 20);
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: a */
    public void mo121190a(final IGetDataCallback<Chatter> iGetDataCallback) {
        C57865c.m224574a(new C57865c.AbstractC57873d<Chatter>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.C328404 */

            /* renamed from: a */
            public Chatter produce() {
                return C32835d.this.mo121186a();
            }
        }, new C57865c.AbstractC57871b<Chatter>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.C328415 */

            /* renamed from: a */
            public void consume(Chatter chatter) {
                if (chatter != null) {
                    iGetDataCallback.onSuccess(chatter);
                } else {
                    iGetDataCallback.onError(new ErrorResult("Can't find target chatter!"));
                }
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: c */
    public void mo121214c(IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_USER_UPDATE_NAME_PERMISSION, new GetUserUpdateNamePermissionRequest.C16306a(), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.AnonymousClass20 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                return GetUserUpdateNamePermissionResponse.ADAPTER.decode(bArr).enable;
            }
        });
    }

    /* renamed from: d */
    public Observable<Map<String, Chatter>> mo121217d(final List<String> list) {
        return Observable.create(new ObservableOnSubscribe<Map<String, Chatter>>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.AnonymousClass26 */

            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(final ObservableEmitter<Map<String, Chatter>> observableEmitter) throws Exception {
                ArrayList arrayList = new ArrayList(list);
                final Map<String, Chatter> c = C32835d.this.mo121213c(arrayList);
                Iterator<Chatter> it = c.values().iterator();
                while (it.hasNext()) {
                    Chatter next = it.next();
                    if (next == null || next.getType() == Chatter.ChatterType.UNKNOWN) {
                        it.remove();
                    }
                }
                arrayList.removeAll(c.keySet());
                if (arrayList.isEmpty()) {
                    observableEmitter.onNext(c);
                } else {
                    C32835d.this.mo121216c(arrayList, new IGetDataCallback<Map<String, Chatter>>() {
                        /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.AnonymousClass26.C328381 */

                        /* renamed from: a */
                        public void onSuccess(Map<String, Chatter> map) {
                            c.putAll(map);
                            observableEmitter.onNext(c);
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            observableEmitter.onError(errorResult.getException());
                        }
                    });
                }
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: c */
    public Chatter mo121211c(String str) {
        Map<String, Chatter> c = mo121213c(Collections.singletonList(str));
        if (c == null) {
            return null;
        }
        return c.get(str);
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: d */
    public void mo121218d(String str) {
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_CHATTER, new UpdateChatterRequest.C16406a().mo58569c(str), null, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.AnonymousClass10 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                UpdateChatterResponse decode = UpdateChatterResponse.ADAPTER.decode(bArr);
                boolean isEmpty = TextUtils.isEmpty(decode.message);
                if (!isEmpty) {
                    Log.m165397w("ChatterService", "updateTimeZone msg : " + decode.message);
                }
                return Boolean.valueOf(isEmpty);
            }
        });
    }

    /* renamed from: a */
    public static Map<String, Chatter> m126320a(byte[] bArr) throws IOException {
        return C57314g.m222106b(MGetChattersResponse.ADAPTER.decode(bArr).entity).mo124894a();
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: b */
    public Chatter mo121203b(String str) {
        Map<String, Chatter> b;
        SDKSendUtils.m133260a();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Chatter c = mo121211c(str);
        if (c != null || (b = mo121205b(Collections.singletonList(str))) == null) {
            return c;
        }
        return b.get(str);
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: c */
    public Map<String, Chatter> mo121213c(List<String> list) {
        if (CollectionUtils.isEmpty(list)) {
            return new HashMap();
        }
        SDKSendUtils.m133260a();
        Map<String, Chatter> map = (Map) SdkSender.syncSend(Command.MGET_CHATTERS, new MGetChattersRequest.C16324a().mo58370a(list), new SdkSender.IParser<Map<String, Chatter>>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.C328372 */

            /* renamed from: a */
            public Map<String, Chatter> parse(byte[] bArr) throws IOException {
                return C57314g.m222104a(MGetChattersResponse.ADAPTER.decode(bArr).entity);
            }
        });
        if (map == null) {
            return new HashMap(0);
        }
        return map;
    }

    /* renamed from: e */
    public ChatChatter mo121220e(String str) {
        Log.m165389i("ChatterService", "get LoginChatChatter");
        String a = this.f84320a.mo134394a();
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        ChatChatter b = mo121202b(str, a);
        if (b != null) {
            return b;
        }
        try {
            return new ChatChatter(m126325d());
        } catch (Exception e) {
            e.printStackTrace();
            return b;
        }
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: b */
    public Map<String, Chatter> mo121205b(List<String> list) {
        SDKSendUtils.m133260a();
        return (Map) SdkSender.sendRequest(Command.MGET_CHATTERS, new MGetChattersRequest.C16324a().mo58370a(list), new SdkSender.IParser<Map<String, Chatter>>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.AnonymousClass15 */

            /* renamed from: a */
            public Map<String, Chatter> parse(byte[] bArr) throws IOException {
                return C32835d.m126320a(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: a */
    public Chatter mo121187a(boolean z) {
        if (!z) {
            return mo121186a();
        }
        Chatter a = mo121186a();
        String a2 = this.f84320a.mo134394a();
        if (a == null || !TextUtils.equals(a.getId(), a2)) {
            return mo121203b(a2);
        }
        return a;
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: a */
    public Map<String, Chatter> mo121189a(List<String> list) {
        Map<String, Chatter> b;
        ArrayList arrayList = new ArrayList(list);
        Map<String, Chatter> c = mo121213c(arrayList);
        arrayList.removeAll(c.keySet());
        if (arrayList.isEmpty() || (b = mo121205b(arrayList)) == null) {
            return c;
        }
        c.putAll(b);
        return c;
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: a */
    public void mo121191a(IGetDataCallback<BotsResponse> iGetDataCallback, int i) {
        mo121192a(iGetDataCallback, i, 20);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Map m126319a(String str, byte[] bArr) throws IOException {
        return C57314g.m222100a(GetChatChattersByIdsResponse.ADAPTER.decode(bArr).entity, str).mo124896b();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Map m126322b(String str, byte[] bArr) throws IOException {
        return C57314g.m222100a(GetChatChattersByIdsResponse.ADAPTER.decode(bArr).entity, str).mo124896b();
    }

    @Override // com.ss.android.lark.chat.service.AbstractC34297l
    /* renamed from: b */
    public ChatChatter mo121202b(String str, String str2) {
        Map<String, ChatChatter> b = mo121204b(str, Collections.singletonList(str2));
        if (b == null) {
            return null;
        }
        return b.get(str2);
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: c */
    public Map<String, ChatChatter> mo121212c(String str, List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        Map<String, ChatChatter> b = mo121204b(str, arrayList);
        arrayList.removeAll(b.keySet());
        if (arrayList.isEmpty()) {
            return b;
        }
        Map<String, ChatChatter> d = m126326d(str, arrayList);
        if (CollectionUtils.isNotEmpty(d)) {
            b.putAll(d);
        }
        return b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m126321a(IGetDataCallback iGetDataCallback, ChatChatter chatChatter) {
        if (chatChatter != null) {
            iGetDataCallback.onSuccess(chatChatter);
        } else {
            iGetDataCallback.onError(new ErrorResult("Can't find target chatter!"));
        }
    }

    /* renamed from: d */
    private Map<String, ChatChatter> m126326d(String str, List<String> list) {
        HashMap hashMap = new HashMap();
        if (CollectionUtils.isEmpty(list)) {
            return hashMap;
        }
        SDKSendUtils.m133260a();
        return (Map) SdkSender.sendRequest(Command.GET_CHAT_CHATTERS_BY_IDS, new GetChatChattersByIdsRequest.C17502a().mo61317a(list).mo61316a(str), new SdkSender.IParser(str) {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$d$FsoaUE6iqRA1N2Oxl9ZwgzyBEk */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C32835d.m126319a(this.f$0, bArr);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: a */
    public ChatChatter m126324c(String str, String str2) {
        Map<String, ChatChatter> a;
        SDKSendUtils.m133260a();
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        ChatChatter b = mo121202b(str, str2);
        if (b != null || (a = mo121188a(str, Collections.singletonList(str2))) == null) {
            return b;
        }
        return a.get(str2);
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: b */
    public Map<String, ChatChatter> mo121204b(final String str, List<String> list) {
        if (CollectionUtils.isEmpty(list)) {
            return new HashMap();
        }
        SDKSendUtils.m133260a();
        Map<String, ChatChatter> map = (Map) SdkSender.syncSend(Command.GET_CHAT_CHATTERS_BY_IDS, new GetChatChattersByIdsRequest.C17502a().mo61316a(str).mo61317a(list), new SdkSender.IParser<Map<String, ChatChatter>>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.C328393 */

            /* renamed from: a */
            public Map<String, ChatChatter> parse(byte[] bArr) throws IOException {
                return C57314g.m222100a(GetChatChattersByIdsResponse.ADAPTER.decode(bArr).entity, str).mo124896b();
            }
        });
        if (map == null) {
            return new HashMap(0);
        }
        return map;
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: c */
    public void mo121215c(String str, final IGetDataCallback<Chatter> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_CHATTER, new UpdateChatterRequest.C16406a().mo58568b(str), new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.C328448 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (iGetDataCallback != null && bool != null && bool.booleanValue()) {
                    final String a = C32835d.this.f84320a.mo134394a();
                    C32835d.this.mo121216c(Collections.singletonList(a), new IGetDataCallback<Map<String, Chatter>>() {
                        /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.C328448.C328451 */

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            iGetDataCallback.onError(errorResult);
                        }

                        /* renamed from: a */
                        public void onSuccess(Map<String, Chatter> map) {
                            if (CollectionUtils.isNotEmpty(map)) {
                                iGetDataCallback.onSuccess(map.get(a));
                                return;
                            }
                            iGetDataCallback.onError(new ErrorResult("updateMineAvatar pull chatter fail!"));
                        }
                    });
                }
            }
        }, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.C328469 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                return Boolean.valueOf(TextUtils.isEmpty(UpdateChatterResponse.ADAPTER.decode(bArr).message));
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: d */
    public void mo121219d(String str, IGetDataCallback<String> iGetDataCallback) {
        SetUserNameRequest.C16400a aVar = new SetUserNameRequest.C16400a();
        aVar.f42662a = str;
        SdkSender.asynSendRequestNonWrap(Command.SET_USER_NAME, aVar, iGetDataCallback, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.AnonymousClass21 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return SetUserNameResponse.ADAPTER.decode(bArr).name;
            }
        });
    }

    /* renamed from: c */
    public void mo121216c(List<String> list, IGetDataCallback<Map<String, Chatter>> iGetDataCallback) {
        if (CollectionUtils.isEmpty(list)) {
            iGetDataCallback.onSuccess(new HashMap());
        } else {
            SdkSender.asynSendRequestNonWrap(Command.MGET_CHATTERS, new MGetChattersRequest.C16324a().mo58370a(list).mo58369a((Boolean) true), iGetDataCallback, new SdkSender.IParser<Map<String, Chatter>>() {
                /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.AnonymousClass18 */

                /* renamed from: a */
                public Map<String, Chatter> parse(byte[] bArr) throws IOException {
                    return C32835d.m126320a(bArr);
                }
            });
        }
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: a */
    public Map<String, ChatChatter> mo121188a(final String str, List<String> list) {
        SDKSendUtils.m133260a();
        return (Map) SdkSender.sendRequest(Command.GET_CHAT_CHATTERS_BY_IDS, new GetChatChattersByIdsRequest.C17502a().mo61316a(str).mo61317a(list), new SdkSender.IParser<Map<String, ChatChatter>>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.AnonymousClass16 */

            /* renamed from: a */
            public Map<String, ChatChatter> parse(byte[] bArr) throws IOException {
                return C57314g.m222100a(GetChatChattersByIdsResponse.ADAPTER.decode(bArr).entity, str).mo124896b();
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32901c
    /* renamed from: b */
    public void mo121208b(final String str, final IGetDataCallback<Chatter> iGetDataCallback) {
        boolean z;
        Scheduler scheduler;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            z = true;
        } else {
            z = false;
        }
        Observable subscribeOn = mo121217d(Collections.singletonList(str)).subscribeOn(LarkRxSchedulers.io());
        if (z) {
            scheduler = LarkRxSchedulers.mainThread();
        } else {
            scheduler = LarkRxSchedulers.io();
        }
        subscribeOn.observeOn(scheduler).subscribe(new Consumer<Map<String, Chatter>>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.AnonymousClass12 */

            /* renamed from: a */
            public void accept(Map<String, Chatter> map) throws Exception {
                Chatter chatter = map.get(str);
                if (C32835d.this.f84320a.mo134403f() || chatter != null) {
                    iGetDataCallback.onSuccess(chatter);
                } else {
                    iGetDataCallback.onError(new ErrorResult("Can't find target chatter!"));
                }
            }
        }, new ReportErrorConsumer() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32835d.AnonymousClass22 */

            @Override // com.ss.android.lark.utils.rxjava.ReportErrorConsumer
            public void error(Throwable th) throws Exception {
                iGetDataCallback.onError(new ErrorResult(th.getMessage()));
            }
        });
    }

    /* renamed from: b */
    public void mo121209b(String str, List<String> list, IGetDataCallback<Map<String, ChatChatter>> iGetDataCallback) {
        if (!CollectionUtils.isEmpty(list)) {
            SdkSender.asynSendRequestNonWrap(Command.GET_CHAT_CHATTERS_BY_IDS, new GetChatChattersByIdsRequest.C17502a().mo61316a(str).mo61317a(list).mo61315a(SyncDataStrategy.FORCE_SERVER), iGetDataCallback, new SdkSender.IParser(str) {
                /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$d$HQse5a6czVjmA4ChuSe7SChqHOY */
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public final Object parse(byte[] bArr) {
                    return C32835d.m126322b(this.f$0, bArr);
                }
            });
        }
    }
}
