package com.ss.android.lark.chat.service;

import com.bytedance.lark.pb.im.v1.SendSpeechRecognitionResponse;
import com.bytedance.lark.pb.im.v1.ToggleTextOnAudioResponse;
import com.bytedance.lark.pb.media.v1.UploadAudioDataResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.api.service.IMessageService;
import com.ss.android.lark.chat.core.model.entity.ChatMessageResponse;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.chat.entity.message.AbstractC34011b;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.SendStatus;
import com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback;
import com.ss.android.lark.dto.chat.GetMessageIdsByPositionResponse;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;

public interface IInnerMessageService extends IMessageService {

    @Retention(RetentionPolicy.SOURCE)
    public @interface SpeechRecognitionAction {
    }

    /* renamed from: a */
    ChatMessageResponse mo121247a(String str, List<Integer> list);

    /* renamed from: a */
    String mo121249a(String str, String str2, String str3, String str4);

    /* renamed from: a */
    void mo121251a(Channel channel, int i, int i2, boolean z);

    /* renamed from: a */
    <T extends AbstractC34011b, C extends MonitorMessageSendCallback> void mo121254a(T t, C c);

    /* renamed from: a */
    void mo121256a(String str, int i, int i2, IGetDataCallback<GetMessageIdsByPositionResponse> iGetDataCallback);

    /* renamed from: a */
    void mo121257a(String str, int i, String str2, String str3, byte[] bArr, int i2, int i3, String str4, boolean z, String str5, IGetDataCallback<SendSpeechRecognitionResponse> iGetDataCallback);

    /* renamed from: a */
    void mo121258a(String str, int i, byte[] bArr, boolean z, boolean z2, String str2, IGetDataCallback<UploadAudioDataResponse> iGetDataCallback);

    /* renamed from: a */
    void mo121259a(String str, SendStatus sendStatus);

    /* renamed from: a */
    void mo121260a(String str, String str2, int i, String str3, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    boolean mo121261a(long j, long j2, String str);

    /* renamed from: b */
    void mo121264b(Message.C34004a aVar, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: b */
    <T extends AbstractC34011b, C extends MonitorMessageSendCallback> void mo121267b(T t, C c);

    /* renamed from: b */
    void mo121268b(String str, boolean z, IGetDataCallback<ToggleTextOnAudioResponse> iGetDataCallback);

    /* renamed from: b */
    void mo121269b(List<String> list, IGetDataCallback<Map<String, Message>> iGetDataCallback);

    /* renamed from: c */
    void mo121270c(List<IMessageService.C32815a> list, IGetDataCallback<List<IMessageService.C32815a>> iGetDataCallback);

    /* renamed from: e */
    void mo121272e(String str);
}
