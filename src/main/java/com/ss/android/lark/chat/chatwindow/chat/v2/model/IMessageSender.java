package com.ss.android.lark.chat.chatwindow.chat.v2.model;

import android.net.Uri;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chatwindow.view.NutFileInfo;
import com.ss.android.lark.dependency.IStickerDependency;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.richtext.RichText;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH&J0\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H&J.\u0010\u0013\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H&J\u0016\u0010\u0019\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bH&J&\u0010\u001c\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00112\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H&J\u0016\u0010\u001e\u001a\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0011H&J0\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H&J \u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H&J \u0010)\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%H&J*\u0010*\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006+"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/IMessageSender;", "", "sendAudioMsg", "", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "fileName", "", "cid", "duration", "", "sendAudioTextMsg", "text", "sendFileMsg", "uri", "Landroid/net/Uri;", "files", "", "Ljava/io/File;", "sendImageMsg", "photos", "keepOrigin", "", "rootMsgId", "parentMsgId", "sendLogMsg", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "sendMediaMsg", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "sendNutFileMsg", "nutFileInfos", "Lcom/ss/android/lark/chatwindow/view/NutFileInfo;", "sendPostMsg", "title", "content", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "sendStickerMsg", "stickerFileInfo", "Lcom/ss/android/lark/dependency/IStickerDependency$StickerFileInfo;", "sendTextMsg", "startAudioRecord", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.b.a */
public interface IMessageSender {
    /* renamed from: a */
    Message mo123005a(String str, String str2, String str3, String str4);

    /* renamed from: a */
    void mo123006a(Uri uri);

    /* renamed from: a */
    void mo123007a(IGetDataCallback<Unit> iGetDataCallback);

    /* renamed from: a */
    void mo123008a(Message message, String str, String str2, int i);

    /* renamed from: a */
    void mo123009a(Message message, String str, String str2, String str3, int i);

    /* renamed from: a */
    void mo123010a(IStickerDependency.StickerFileInfo stickerFileInfo, String str, String str2);

    /* renamed from: a */
    void mo123011a(String str, String str2, RichText richText);

    /* renamed from: a */
    void mo123012a(String str, String str2, RichText richText, String str3, String str4);

    /* renamed from: a */
    void mo123013a(List<? extends File> list);

    /* renamed from: a */
    void mo123014a(List<? extends Photo> list, String str, String str2);

    /* renamed from: a */
    void mo123015a(List<String> list, boolean z, String str, String str2);

    /* renamed from: b */
    void mo123016b(List<? extends NutFileInfo> list);
}
