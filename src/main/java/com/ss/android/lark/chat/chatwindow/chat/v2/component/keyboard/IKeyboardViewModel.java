package com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard;

import android.net.Uri;
import com.ss.android.lark.dependency.IStickerDependency;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.richtext.RichText;
import java.io.File;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J.\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH&J&\u0010\u0010\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH&J\u0016\u0010\u0012\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H&J0\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH&J \u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH&J \u0010\u001d\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0019H&¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/IKeyboardViewModel;", "", "sendFileMsg", "", "uri", "Landroid/net/Uri;", "files", "", "Ljava/io/File;", "sendImageMsg", "photos", "", "keepOrigin", "", "rootMsgId", "parentMsgId", "sendMediaMsg", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "sendNutFileMsg", "nutFileInfos", "Lcom/ss/android/lark/chatwindow/view/NutFileInfo;", "sendPostMsg", "title", "content", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "sendStickerMsg", "stickerFileInfo", "Lcom/ss/android/lark/dependency/IStickerDependency$StickerFileInfo;", "sendTextMsg", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.b */
public interface IKeyboardViewModel {
    void sendFileMsg(Uri uri);

    void sendFileMsg(List<? extends File> list);

    void sendImageMsg(List<String> list, boolean z, String str, String str2);

    void sendMediaMsg(List<? extends Photo> list, String str, String str2);

    void sendPostMsg(String str, String str2, RichText richText, String str3, String str4);

    void sendStickerMsg(IStickerDependency.StickerFileInfo stickerFileInfo, String str, String str2);

    void sendTextMsg(String str, String str2, RichText richText);
}
