package com.ss.android.lark.chat.api.service.impl;

import android.util.ArrayMap;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.PreviewEntityPair;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.im.v1.GetMessagePreviewsRequest;
import com.bytedance.lark.pb.im.v1.GetMessagePreviewsResponse;
import com.bytedance.lark.pb.im.v1.PutUrlPreviewActionRequest;
import com.bytedance.lark.pb.url.v1.GetUrlPreviewRequest;
import com.bytedance.lark.pb.url.v1.GetUrlPreviewResponse;
import com.bytedance.lark.pb.url.v1.MGetUrlPreviewRequest;
import com.bytedance.lark.pb.url.v1.MGetUrlPreviewResponse;
import com.bytedance.lark.pb.url.v1.UrlPreviewSourceType;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.chat.api.service.IPreviewService;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.chat.preview.entity.UrlPreViewEntries;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.parser.internal.ModelParserPreview;
import com.ss.android.lark.pb.url_preview.PullUrlPreviewChattersListRequest;
import com.ss.android.lark.pb.url_preview.PullUrlPreviewChattersListResponse;
import com.ss.android.lark.sdk.SdkSender;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002JF\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00060\fH\u0016J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0016J<\u0010\u0013\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00150\u0014\u0018\u00010\u00142\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0014H\u0016J4\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072 \u0010\u000b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u001a0\u0011H\u0016¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/chat/api/service/impl/PreviewService;", "Lcom/ss/android/lark/chat/api/service/IPreviewService;", "()V", "getUrlPreViewEntityList", "", "sourceIdList", "", "", "sourceTextMD5List", "syncDataStrategy", "Lcom/bytedance/lark/pb/basic/v1/SyncDataStrategy;", "callback", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "Lcom/ss/android/lark/chat/preview/entity/UrlPreViewEntries;", "putUrlPreviewAction", "request", "Lcom/ss/android/lark/chat/api/service/IPreviewService$UrlPreviewActionRequest;", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "syncGetMessagePreview", "", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "messagePreviewMap", "syncPullUrlPreviewChattersList", "previewId", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.api.service.b.h */
public final class PreviewService implements IPreviewService {

    /* renamed from: a */
    public static final Lazy f84463a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C32874b.INSTANCE);

    /* renamed from: b */
    public static final Companion f84464b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/api/service/impl/PreviewService$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/lark/chat/api/service/impl/PreviewService;", "getInstance", "()Lcom/ss/android/lark/chat/api/service/impl/PreviewService;", "instance$delegate", "Lkotlin/Lazy;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.b.h$a */
    public static final class Companion {
        /* renamed from: a */
        public final PreviewService mo121338a() {
            Lazy lazy = PreviewService.f84463a;
            Companion aVar = PreviewService.f84464b;
            return (PreviewService) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u00020\u0001J,\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chat/api/service/impl/PreviewService$syncGetMessagePreview$sdkResult$1", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "", "", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.b.h$f */
    public static final class C32878f implements SdkSender.IParser<Map<String, ? extends Map<String, ? extends UrlPreviewEntity>>> {
        C32878f() {
        }

        /* renamed from: a */
        public Map<String, Map<String, UrlPreviewEntity>> parse(byte[] bArr) {
            HashMap hashMap = new HashMap();
            Map<String, PreviewEntityPair> map = GetMessagePreviewsResponse.ADAPTER.decode(bArr).preview_entities;
            Intrinsics.checkExpressionValueIsNotNull(map, "pbResponse.preview_entities");
            for (Map.Entry<String, PreviewEntityPair> entry : map.entrySet()) {
                ArrayMap arrayMap = new ArrayMap();
                Map<String, com.bytedance.lark.pb.basic.v1.UrlPreviewEntity> map2 = entry.getValue().preview_entity;
                Intrinsics.checkExpressionValueIsNotNull(map2, "entry.value.preview_entity");
                for (Map.Entry<String, com.bytedance.lark.pb.basic.v1.UrlPreviewEntity> entry2 : map2.entrySet()) {
                    com.bytedance.lark.pb.basic.v1.UrlPreviewEntity value = entry2.getValue();
                    Intrinsics.checkExpressionValueIsNotNull(value, "innerEntry.value");
                    UrlPreviewEntity a = ModelParserPreview.m222175a(value);
                    if (a != null) {
                        arrayMap.put(entry2.getKey(), a);
                    }
                }
                hashMap.put(entry.getKey(), arrayMap);
            }
            return hashMap;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/api/service/impl/PreviewService$syncPullUrlPreviewChattersList$2", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/ss/android/lark/pb/url_preview/PullUrlPreviewChattersListResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.b.h$h */
    public static final class C32880h implements SdkSender.IParser<PullUrlPreviewChattersListResponse> {
        C32880h() {
        }

        /* renamed from: a */
        public PullUrlPreviewChattersListResponse parse(byte[] bArr) {
            PullUrlPreviewChattersListResponse decode = PullUrlPreviewChattersListResponse.ADAPTER.decode(bArr);
            Intrinsics.checkExpressionValueIsNotNull(decode, "PullUrlPreviewChattersLi…onse.ADAPTER.decode(data)");
            return decode;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/api/service/impl/PreviewService;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.b.h$b */
    static final class C32874b extends Lambda implements Function0<PreviewService> {
        public static final C32874b INSTANCE = new C32874b();

        C32874b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PreviewService invoke() {
            return new PreviewService();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/api/service/impl/PreviewService$getUrlPreViewEntityList$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/url/v1/MGetUrlPreviewResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "mGetUrlPreviewResponse", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.b.h$c */
    public static final class C32875c implements IGetDataCallback<MGetUrlPreviewResponse> {

        /* renamed from: a */
        final /* synthetic */ UIGetDataCallback f84465a;

        C32875c(UIGetDataCallback uIGetDataCallback) {
            this.f84465a = uIGetDataCallback;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f84465a.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(MGetUrlPreviewResponse mGetUrlPreviewResponse) {
            Intrinsics.checkParameterIsNotNull(mGetUrlPreviewResponse, "mGetUrlPreviewResponse");
            if (mGetUrlPreviewResponse.resps.size() > 0) {
                ArrayList arrayList = new ArrayList(mGetUrlPreviewResponse.resps.size());
                List<GetUrlPreviewResponse> list = mGetUrlPreviewResponse.resps;
                Intrinsics.checkExpressionValueIsNotNull(list, "mGetUrlPreviewResponse.resps");
                for (T t : list) {
                    Intrinsics.checkExpressionValueIsNotNull(t, "getUrlPreviewResponse");
                    arrayList.add(ModelParserPreview.m222176a((GetUrlPreviewResponse) t));
                }
                this.f84465a.onSuccess(arrayList);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/api/service/impl/PreviewService$syncPullUrlPreviewChattersList$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pb/url_preview/PullUrlPreviewChattersListResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.b.h$g */
    public static final class C32879g implements IGetDataCallback<PullUrlPreviewChattersListResponse> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f84468a;

        C32879g(IGetDataCallback iGetDataCallback) {
            this.f84468a = iGetDataCallback;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f84468a.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(PullUrlPreviewChattersListResponse pullUrlPreviewChattersListResponse) {
            List<String> list;
            if (pullUrlPreviewChattersListResponse != null) {
                list = pullUrlPreviewChattersListResponse.mchatter_ids;
            } else {
                list = null;
            }
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f84468a.onSuccess(arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/url/v1/MGetUrlPreviewResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.b.h$d */
    static final class C32876d<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C32876d f84466a = new C32876d();

        C32876d() {
        }

        /* renamed from: a */
        public final MGetUrlPreviewResponse parse(byte[] bArr) {
            return MGetUrlPreviewResponse.ADAPTER.decode(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.b.h$e */
    static final class C32877e<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C32877e f84467a = new C32877e();

        C32877e() {
        }

        /* renamed from: a */
        public final boolean mo121341a(byte[] bArr) {
            return true;
        }

        @Override // com.ss.android.lark.sdk.SdkSender.IParser
        public /* synthetic */ Object parse(byte[] bArr) {
            return Boolean.valueOf(mo121341a(bArr));
        }
    }

    /* renamed from: a */
    public Map<String, Map<String, UrlPreviewEntity>> mo121334a(Map<String, ? extends List<String>> map) {
        Intrinsics.checkParameterIsNotNull(map, "messagePreviewMap");
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), new GetMessagePreviewsRequest.PreviewPair.C17621a().mo61629a((List) entry.getValue()).build());
        }
        SdkSender.C53233d syncSendMayError = SdkSender.syncSendMayError(Command.GET_MESSAGE_PREVIEWS, new GetMessagePreviewsRequest.C17623a().mo61635a(hashMap).mo61634a(SyncDataStrategy.TRY_LOCAL), new C32878f());
        if (syncSendMayError.f131573b == null) {
            return syncSendMayError.f131572a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("fetch message preview failed ");
        ErrorResult errorResult = syncSendMayError.f131573b;
        Intrinsics.checkExpressionValueIsNotNull(errorResult, "sdkResult.error");
        sb.append(errorResult.getDisplayMsg());
        Log.m165383e("PreviewService", sb.toString());
        return null;
    }

    @Override // com.ss.android.lark.chat.api.service.IPreviewService
    /* renamed from: a */
    public void mo121336a(String str, IGetDataCallback<ArrayList<String>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.sendPassThroughRequest(com.ss.android.lark.pb.improto.Command.PULL_URL_PREVIEW_CHATTERS_LIST, new PullUrlPreviewChattersListRequest.C50176a().mo174194a(str), new C32879g(iGetDataCallback), new C32880h());
    }

    @Override // com.ss.android.lark.chat.api.service.IPreviewService
    /* renamed from: a */
    public void mo121335a(IPreviewService.UrlPreviewActionRequest aVar, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(aVar, "request");
        if (aVar.mo121395c() != null && aVar.mo121394b() != null && aVar.mo121393a() != null) {
            SdkSender.asynSendRequestNonWrap(Command.PUT_URL_PREVIEW_ACTION, new PutUrlPreviewActionRequest.C17987a().mo62504c(aVar.mo121395c()).mo62503b(aVar.mo121394b()).mo62501a(aVar.mo121393a()), iGetDataCallback, C32877e.f84467a);
        }
    }

    /* renamed from: a */
    public void mo121337a(List<String> list, List<String> list2, SyncDataStrategy syncDataStrategy, UIGetDataCallback<List<UrlPreViewEntries>> uIGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(list, "sourceIdList");
        Intrinsics.checkParameterIsNotNull(list2, "sourceTextMD5List");
        Intrinsics.checkParameterIsNotNull(syncDataStrategy, "syncDataStrategy");
        Intrinsics.checkParameterIsNotNull(uIGetDataCallback, "callback");
        ArrayList arrayList = new ArrayList();
        int min = Math.min(list2.size(), list.size());
        for (int i = 0; i < min; i++) {
            arrayList.add(new GetUrlPreviewRequest(list.get(i), UrlPreviewSourceType.PERSONAL_SIG, list2.get(i)));
        }
        SdkSender.asynSendRequestNonWrap(Command.MGET_URL_PREVIEW, new MGetUrlPreviewRequest(arrayList, syncDataStrategy).newBuilder(), new C32875c(uIGetDataCallback), C32876d.f84466a);
    }
}
