package com.ss.android.lark.forward.template;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.openplatform.v1.CardJsonToPBRequest;
import com.bytedance.lark.pb.openplatform.v1.CardJsonToPBResponse;
import com.bytedance.lark.pb.openplatform.v1.SendPreviewCardRequest;
import com.bytedance.lark.pb.openplatform.v1.SendPreviewCardResponse;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.template.ForwardEnhancedView;
import com.ss.android.lark.forward.p1898a.AbstractC38365a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.widget.richtext.C59029c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pl.droidsonroids.gif.GifImageView;

public class MessageCardEnhancedView implements ForwardEnhancedView {
    public static final Parcelable.Creator<MessageCardEnhancedView> CREATOR = new Parcelable.Creator<MessageCardEnhancedView>() {
        /* class com.ss.android.lark.forward.template.MessageCardEnhancedView.C384696 */

        /* renamed from: a */
        public MessageCardEnhancedView[] newArray(int i) {
            return new MessageCardEnhancedView[i];
        }

        /* renamed from: a */
        public MessageCardEnhancedView createFromParcel(Parcel parcel) {
            return new MessageCardEnhancedView(parcel);
        }
    };

    @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
    /* renamed from: a */
    public void mo140739a(Activity activity, ConstraintLayout constraintLayout, List<ForwardTarget> list, Bundle bundle) {
    }

    @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
    /* renamed from: a */
    public void mo140742a(List<ForwardTarget> list, GifImageView gifImageView, TextView textView, TextView textView2, TextView textView3, Bundle bundle) {
    }

    @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
    /* renamed from: b */
    public boolean mo140744b(List<ForwardTarget> list, Bundle bundle) {
        return false;
    }

    @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
    /* renamed from: c */
    public boolean mo140745c(List<ForwardTarget> list, Bundle bundle) {
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.forward.template.MessageCardEnhancedView$a */
    public enum EnumC38470a {
        NO_PARAMS(-1, "triggerCode or openChatIDs is required"),
        EXCEED_IDS(-2, "openChatIDs count exceed 10"),
        CARD_CONTENT_NULL(-3, "cardContent is null"),
        CARD_CONTENT_PARSE_FAILED(-4, "card json convert to pb error"),
        SEND_FAILED(-5, "System Error"),
        USER_CANCEL(-6, "user cancel send"),
        TRIGGER_CODE_INVALID(-7, "triggerCode is invalid"),
        SOME_IDS_INVALID(-8, "some part of openChatIDs are invalid"),
        UNKNOWN_ERROR(-9, "Unknown Error"),
        CHOOSE_CHAT_ERROR(-10, "choose chat error");
        
        public int code;
        public String msg;

        public int getCode() {
            return this.code;
        }

        public String getMsg() {
            return this.msg;
        }

        private EnumC38470a(int i, String str) {
            this.code = i;
            this.msg = str;
        }
    }

    public MessageCardEnhancedView() {
    }

    public MessageCardEnhancedView(Parcel parcel) {
    }

    @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
    /* renamed from: d */
    public boolean mo140746d(List<ForwardTarget> list, Bundle bundle) {
        return bundle.containsKey("cardJSON");
    }

    @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
    /* renamed from: a */
    public boolean mo140743a(List<ForwardTarget> list, Bundle bundle) {
        return bundle.containsKey("cardJSON");
    }

    /* renamed from: a */
    public List<C38471b> mo141089a(List<String> list, final String str) {
        if (CollectionUtils.isEmpty(list) || TextUtils.isEmpty(str)) {
            Log.m165389i("MessageCardEnhancedView", "send text message args invalid");
            return null;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        final List<C38471b> synchronizedList = Collections.synchronizedList(new LinkedList());
        C59029c.m229161b(str);
        for (final String str2 : list) {
            C38364a.m151054a().mo140442d().mo140483a(str2, str, (Map<String, String>) null, new IGetDataCallback<String>() {
                /* class com.ss.android.lark.forward.template.MessageCardEnhancedView.C384643 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    countDownLatch.countDown();
                    synchronizedList.add(new C38471b(str2, 0, null, str));
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("MessageCardEnhancedView", "send text message failed chatId=" + str2 + " err=" + errorResult.getDebugMsg());
                    countDownLatch.countDown();
                    synchronizedList.add(new C38471b(str2, errorResult.getErrorCode(), errorResult.getDebugMsg(), str));
                }
            });
        }
        try {
            countDownLatch.await(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Log.m165384e("MessageCardEnhancedView", "send text message failed", e);
        }
        return synchronizedList;
    }

    /* renamed from: a */
    public void mo141090a(Bundle bundle, int i, String str) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt("sendErrorCode", i);
        bundle2.putString("sendErrorMsg", str);
        bundle.putBundle("send_preview_card_response", bundle2);
    }

    @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
    /* renamed from: a */
    public void mo140740a(Activity activity, List<ForwardTarget> list, Bundle bundle, ForwardEnhancedView.AbstractC38392a aVar) {
        aVar.proceed();
    }

    /* renamed from: com.ss.android.lark.forward.template.MessageCardEnhancedView$b */
    public static class C38471b {

        /* renamed from: a */
        public String f98920a;

        /* renamed from: b */
        public int f98921b;

        /* renamed from: c */
        public String f98922c;

        /* renamed from: d */
        public String f98923d;

        public C38471b(String str, int i, String str2, String str3) {
            this.f98920a = str;
            this.f98921b = i;
            this.f98922c = str2;
            this.f98923d = str3;
        }
    }

    @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
    /* renamed from: a */
    public void mo140741a(final Activity activity, final List<ForwardTarget> list, final Bundle bundle, final ForwardEnhancedView.AbstractC38392a aVar, ForwardTemplate forwardTemplate) {
        if (list != null && list.size() != 0) {
            String string = bundle.getString("appId");
            if (TextUtils.isEmpty(string)) {
                Log.m165389i("MessageCardEnhancedView", "appId empty.");
                mo141090a(bundle, EnumC38470a.UNKNOWN_ERROR.code, EnumC38470a.UNKNOWN_ERROR.msg);
                return;
            }
            String string2 = bundle.getString("cardJSON");
            if (TextUtils.isEmpty(string2)) {
                Log.m165389i("MessageCardEnhancedView", "card json empty.");
                mo141090a(bundle, EnumC38470a.UNKNOWN_ERROR.code, EnumC38470a.UNKNOWN_ERROR.msg);
                return;
            }
            final boolean z = bundle.getBoolean("needLeaveMessage", false);
            SdkSender.asynSendRequestNonWrap(Command.CARD_JSON_TO_PB, new CardJsonToPBRequest.C18639a().mo64192b(string).mo64193c(list.get(0).mo140567b()).mo64190a(string2), new IGetDataCallback<CardJsonToPBResponse>() {
                /* class com.ss.android.lark.forward.template.MessageCardEnhancedView.C384654 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165389i("MessageCardEnhancedView", "CARD_JSON_TO_PB onError" + errorResult);
                    String displayMsg = errorResult.getDisplayMsg();
                    if (TextUtils.isEmpty(displayMsg)) {
                        displayMsg = errorResult.getDebugMsg();
                    }
                    MessageCardEnhancedView.this.mo141090a(bundle, errorResult.getErrorCode(), displayMsg);
                    aVar.proceed();
                }

                /* renamed from: a */
                public void onSuccess(CardJsonToPBResponse cardJsonToPBResponse) {
                    if (cardJsonToPBResponse == null) {
                        onError(new ErrorResult("response is null"));
                        aVar.proceed();
                        return;
                    }
                    bundle.putString("cardKey", cardJsonToPBResponse.card_key);
                    Log.m165389i("MessageCardEnhancedView", "CARD_JSON_TO_PB onSuccess：" + cardJsonToPBResponse.card_key);
                    CardContent cardContent = cardJsonToPBResponse.card_content;
                    if (cardContent == null) {
                        onError(new ErrorResult(EnumC38470a.CARD_CONTENT_NULL.code, EnumC38470a.CARD_CONTENT_NULL.msg));
                        aVar.proceed();
                        return;
                    }
                    try {
                        final CardContent decode = CardContent.ADAPTER.decode(CardContent.ADAPTER.encode(cardContent));
                        final LinkedList linkedList = new LinkedList();
                        final LinkedList linkedList2 = new LinkedList();
                        for (ForwardTarget forwardTarget : list) {
                            linkedList.add(C38364a.m151054a().mo140454p().mo140511a(forwardTarget.mo140569d(), -1, -1));
                            linkedList2.add(forwardTarget.mo140568c());
                        }
                        UICallbackExecutor.execute(new Runnable() {
                            /* class com.ss.android.lark.forward.template.MessageCardEnhancedView.C384654.RunnableC384661 */

                            public void run() {
                                String str;
                                C384671 r6 = new AbstractC38365a.AbstractC38377l() {
                                    /* class com.ss.android.lark.forward.template.MessageCardEnhancedView.C384654.RunnableC384661.C384671 */

                                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38377l
                                    /* renamed from: a */
                                    public void mo140512a(boolean z, boolean z2, String str) {
                                        if (!z2) {
                                            ArrayList arrayList = new ArrayList();
                                            for (ForwardTarget forwardTarget : list) {
                                                arrayList.add(forwardTarget.mo140567b());
                                            }
                                            MessageCardEnhancedView.this.mo141091a(arrayList, bundle.getString("cardKey"), bundle, aVar, str);
                                        }
                                    }
                                };
                                AbstractC38365a.AbstractC38375j o = C38364a.m151054a().mo140453o();
                                if (linkedList.size() <= 0) {
                                    Log.m165389i("MessageCardEnhancedView", "get chat avatar failed, invoke previewCard");
                                    o.mo140510a(activity, new ArrayList(), decode, z, r6);
                                } else if (linkedList.size() > 1) {
                                    Log.m165389i("MessageCardEnhancedView", "invoke previewCard");
                                    o.mo140510a(activity, linkedList, decode, z, r6);
                                } else {
                                    if (!linkedList2.isEmpty()) {
                                        str = (String) linkedList2.get(0);
                                    } else {
                                        str = "";
                                    }
                                    Log.m165389i("MessageCardEnhancedView", "get chat name :" + str + "invoke previewCard");
                                    o.mo140509a(activity, str, (String) linkedList.get(0), decode, z, r6);
                                }
                            }
                        });
                    } catch (IOException e) {
                        Log.m165384e("MessageCardEnhancedView", "IOException", e);
                        MessageCardEnhancedView.this.mo141090a(bundle, EnumC38470a.UNKNOWN_ERROR.code, e.getMessage());
                        aVar.proceed();
                    }
                }
            }, new SdkSender.IParser<CardJsonToPBResponse>() {
                /* class com.ss.android.lark.forward.template.MessageCardEnhancedView.C384685 */

                /* renamed from: a */
                public CardJsonToPBResponse parse(byte[] bArr) throws IOException {
                    return CardJsonToPBResponse.ADAPTER.decode(bArr);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo141091a(final List<String> list, String str, final Bundle bundle, final ForwardEnhancedView.AbstractC38392a aVar, final String str2) {
        Log.m165389i("MessageCardEnhancedView", "SEND_PREVIEW_CARD chatIds:" + list + " cardKey:" + str);
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str)) {
                mo141090a(bundle, EnumC38470a.SOME_IDS_INVALID.code, EnumC38470a.SOME_IDS_INVALID.msg);
            } else {
                mo141090a(bundle, EnumC38470a.CARD_CONTENT_PARSE_FAILED.code, EnumC38470a.CARD_CONTENT_PARSE_FAILED.msg);
            }
            aVar.proceed();
            return;
        }
        SdkSender.asynSendRequestNonWrap(Command.SEND_PREVIEW_CARD, new SendPreviewCardRequest.C18705a().mo64350a(list).mo64349a(str).mo64348a(SendPreviewCardRequest.SendCardVersion.v2), new IGetDataCallback<SendPreviewCardResponse>() {
            /* class com.ss.android.lark.forward.template.MessageCardEnhancedView.C384621 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("MessageCardEnhancedView", "SEND_PREVIEW_CARD onError" + errorResult);
                MessageCardEnhancedView.this.mo141090a(bundle, errorResult.getErrorCode(), errorResult.getDisplayMsg());
                aVar.proceed();
            }

            /* renamed from: a */
            public void onSuccess(SendPreviewCardResponse sendPreviewCardResponse) {
                if (sendPreviewCardResponse == null) {
                    onError(new ErrorResult("response is null"));
                    return;
                }
                Map<String, SendPreviewCardResponse.SendCardInfo> map = sendPreviewCardResponse.send_card_infos;
                if (map == null) {
                    onError(new ErrorResult("status is null"));
                    return;
                }
                JSONArray jSONArray = null;
                List<C38471b> a = !TextUtils.isEmpty(str2) ? MessageCardEnhancedView.this.mo141089a(list, str2) : null;
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray2 = null;
                    for (Map.Entry<String, SendPreviewCardResponse.SendCardInfo> entry : map.entrySet()) {
                        SendPreviewCardResponse.SendCardInfo value = entry.getValue();
                        if (value.status.intValue() < 0) {
                            if (jSONArray == null) {
                                jSONArray = new JSONArray();
                                jSONObject.put("failedChatIds", jSONArray);
                            }
                            jSONArray.put(value.open_chat_id);
                        }
                        if (jSONArray2 == null) {
                            jSONArray2 = new JSONArray();
                            jSONObject.put("sendCardInfo", jSONArray2);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("openChatId", value.open_chat_id);
                        jSONObject2.put("openMessageId", value.open_message_id);
                        jSONObject2.put(UpdateKey.STATUS, value.status);
                        jSONArray2.put(jSONObject2);
                    }
                    if (!CollectionUtils.isEmpty(a)) {
                        JSONArray jSONArray3 = new JSONArray();
                        JSONArray jSONArray4 = new JSONArray();
                        for (C38471b bVar : a) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(UpdateKey.STATUS, bVar.f98921b);
                            if (bVar.f98921b != 0) {
                                jSONObject3.put(UpdateKey.STATUS, -1);
                                jSONArray4.put(bVar.f98920a);
                            }
                            jSONObject3.put("openChatId", map.get(bVar.f98920a).open_chat_id);
                            jSONObject3.put("additionalMessage", str2);
                            jSONArray3.put(jSONObject3);
                        }
                        jSONObject.put("additionalMessageInfo", jSONArray3);
                        jSONObject.put("failedLeaveMessageChatIds", jSONArray4);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("send_card_infos_resp", jSONObject.toString());
                    bundle.putBundle("send_preview_card_response", bundle);
                    aVar.proceed();
                } catch (JSONException e) {
                    Log.m165384e("MessageCardEnhancedView", "process sendCardInfo", e);
                    onError(new ErrorResult("sendPreviewCardResp to json fail"));
                }
            }
        }, new SdkSender.IParser<SendPreviewCardResponse>() {
            /* class com.ss.android.lark.forward.template.MessageCardEnhancedView.C384632 */

            /* renamed from: a */
            public SendPreviewCardResponse parse(byte[] bArr) throws IOException {
                return SendPreviewCardResponse.ADAPTER.decode(bArr);
            }
        });
    }
}
