package com.ss.android.lark.keyboard.plugin.tool.face;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.image.api.AbstractC38817h;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&J\u001c\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eH&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eH&J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH&JH\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH&JP\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0003H&Jb\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00032\u0010\u0010 \u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010!H&J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e2\u0006\u0010#\u001a\u00020$H&J\b\u0010%\u001a\u00020\u000bH&J\u0010\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020(H&J\u0010\u0010)\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020*H&J\u0012\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\bH&J\u0018\u00101\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u00100\u001a\u00020\bH&J\u0010\u00102\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020/H&J\u0010\u00103\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020/H&J\u0010\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u0003H&J\b\u00106\u001a\u00020\u000bH&J\u0016\u00106\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00190\rH&J\u0010\u00107\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020(H&J\u0010\u00108\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020*H&J\u0010\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u0003H&J\u001e\u0010;\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rH&J.\u0010<\u001a\u00020\u000b2\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010>2\u0006\u0010?\u001a\u00020\u00192\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020@0\rH&¨\u0006A"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/face/IFaceDependency;", "", "getCurrentUserId", "", "getLocalStickerFileInfo", "Lcom/ss/android/lark/keyboard/plugin/tool/face/StickerFileInfo;", "stickerKey", "width", "", "height", "getLocalStickerSets", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/chat/entity/sticker/StickerSet;", "getLocalStickers", "Lcom/ss/android/lark/chat/entity/sticker/Sticker;", "getRecentEmojiList", "getStickers", "getWholeEmojiList", "loadSticker", "context", "Landroid/content/Context;", "permanent", "", "key", "view", "Landroid/widget/ImageView;", "placeholder", "errorRes", "path", "listener", "Lcom/ss/android/lark/image/api/RequestListener;", "parseActivityResult", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "preDownloadStickerSet", "registerStickerPushListener", "pushStickerSetListener", "Lcom/ss/android/lark/keyboard/plugin/tool/face/IPushStickerListener;", "registerStickerSetPushListener", "Lcom/ss/android/lark/keyboard/plugin/tool/face/IPushStickerSetListener;", "sendStickerMsg", "stickerFileInfo", "startLarkStickerManagerActivity", "activity", "Landroid/app/Activity;", "requestCode", "startSelectAddStickerActivity", "startStickerSetManagerActivity", "startStickerSetShopActivity", "statFaceSelectEvent", "faceTag", "syncReactionOrder", "unRegisterStickerPushListener", "unRegisterStickerSetPushListener", "updateLocalOrder", "reactionKey", "updateRecentEmojiOrder", "uploadStickers", "stickerUrls", "", "keepOrigin", "Lcom/ss/android/lark/keyboard/plugin/tool/face/UploadStickerResult;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.g */
public interface IFaceDependency {
    /* renamed from: a */
    C40964l mo127071a(String str, int i, int i2);

    /* renamed from: a */
    List<Sticker> mo127072a();

    /* renamed from: a */
    void mo127073a(Activity activity);

    /* renamed from: a */
    void mo127074a(Context context, int i);

    /* renamed from: a */
    void mo127075a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4);

    /* renamed from: a */
    void mo127076a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4, String str2);

    /* renamed from: a */
    void mo127077a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4, String str2, AbstractC38817h<?, ?> hVar);

    /* renamed from: a */
    void mo127078a(IGetDataCallback<List<StickerSet>> iGetDataCallback);

    /* renamed from: a */
    void mo127079a(IPushStickerListener hVar);

    /* renamed from: a */
    void mo127080a(IPushStickerSetListener iVar);

    /* renamed from: a */
    void mo127081a(C40964l lVar);

    /* renamed from: a */
    void mo127082a(String str);

    /* renamed from: a */
    void mo127083a(String str, IGetDataCallback<Integer> iGetDataCallback);

    /* renamed from: a */
    void mo127084a(List<String> list, boolean z, IGetDataCallback<C40966m> iGetDataCallback);

    /* renamed from: b */
    List<Sticker> mo127085b();

    /* renamed from: b */
    void mo127086b(Activity activity);

    /* renamed from: b */
    void mo127087b(IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: b */
    void mo127088b(IPushStickerListener hVar);

    /* renamed from: b */
    void mo127089b(IPushStickerSetListener iVar);

    /* renamed from: b */
    void mo127090b(String str);

    /* renamed from: c */
    void mo127091c();

    /* renamed from: d */
    String mo127092d();

    /* renamed from: e */
    List<String> mo127093e();

    /* renamed from: f */
    List<String> mo127094f();

    /* renamed from: g */
    void mo127095g();
}
