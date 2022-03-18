package com.ss.android.lark.chat.service.impl;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.media.v1.GetPreviewVideoSourceRequest;
import com.bytedance.lark.pb.media.v1.GetPreviewVideoSourceResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.sdk.SdkSender;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/service/impl/PreviewVideoService;", "Lcom/ss/android/lark/chat/service/IPreviewVideoService;", "()V", "getPreviewVideoSource", "", "url", "", "useNet", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.service.impl.x */
public final class PreviewVideoService {

    /* renamed from: a */
    public static final PreviewVideoService f88580a = new PreviewVideoService();

    private PreviewVideoService() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.service.impl.x$a */
    static final class C34288a<T> implements SdkSender.IParser<String> {

        /* renamed from: a */
        public static final C34288a f88581a = new C34288a();

        C34288a() {
        }

        /* renamed from: a */
        public final String parse(byte[] bArr) {
            return GetPreviewVideoSourceResponse.ADAPTER.decode(bArr).video_src;
        }
    }

    /* renamed from: a */
    public void mo126836a(String str, boolean z, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.asynSendRequestNonWrap(Command.GET_PREVIEW_VIDEO_SOURCE, new GetPreviewVideoSourceRequest.C18250a().mo63238a(str).mo63237a(Boolean.valueOf(z)), iGetDataCallback, C34288a.f88581a);
    }
}
