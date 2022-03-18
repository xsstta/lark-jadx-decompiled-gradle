package com.ss.android.lark.album;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.album.IChatAlbumContract;
import com.ss.android.lark.album.image.ChatImageViewData;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.media.MediaExtra;
import com.ss.android.lark.chat.entity.media.MediaImageSet;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.dependency.AbstractC36473g;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36501o;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.utils.C57881t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J$\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J&\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0016J&\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0016J\u001e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00150\nH\u0016¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/album/ChatAlbumModel;", "Lcom/ss/android/lark/album/IChatAlbumContract$IModel;", "()V", "create", "", "deleteMessageByIds", "messageIds", "", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "destroy", "downloadImage", "context", "Landroid/content/Context;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/album/image/ChatImageViewData;", "downloadVideo", "getChatById", "chatId", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.album.c */
public final class ChatAlbumModel implements IChatAlbumContract.IModel {

    /* renamed from: a */
    public static final int f72066a = 1;

    /* renamed from: b */
    public static final int f72067b = 2;

    /* renamed from: c */
    public static final Companion f72068c = new Companion(null);

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/album/ChatAlbumModel$Companion;", "", "()V", "ERROR_CODE_AUTHORIZATION", "", "getERROR_CODE_AUTHORIZATION", "()I", "ERROR_CODE_FILE_EXITS", "getERROR_CODE_FILE_EXITS", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.album.c$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo101916a() {
            return ChatAlbumModel.f72066a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\u00062\u0016\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/album/ChatAlbumModel$deleteMessageByIds$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "Lcom/ss/android/lark/chat/entity/message/Message;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "stringMessageMap", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.album.c$b */
    public static final class C28643b implements IGetDataCallback<Map<String, ? extends Message>> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f72069a;

        C28643b(IGetDataCallback iGetDataCallback) {
            this.f72069a = iGetDataCallback;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            IGetDataCallback iGetDataCallback = this.f72069a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }

        /* renamed from: a */
        public void onSuccess(Map<String, ? extends Message> map) {
            Intrinsics.checkParameterIsNotNull(map, "stringMessageMap");
            IGetDataCallback iGetDataCallback = this.f72069a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/album/ChatAlbumModel$downloadVideo$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.album.c$c */
    public static final class C28644c implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f72070a;

        C28644c(IGetDataCallback iGetDataCallback) {
            this.f72070a = iGetDataCallback;
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            this.f72070a.onSuccess(str);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f72070a.onError(errorResult);
        }
    }

    @Override // com.ss.android.lark.album.IChatAlbumContract.IModel
    /* renamed from: a */
    public void mo101913a(String str, IGetDataCallback<Chat> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C32821b.m126120a().mo120994a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.album.IChatAlbumContract.IModel
    /* renamed from: a */
    public void mo101914a(List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(list, "messageIds");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C32848e.m126401b().mo121269b(list, new C28643b(iGetDataCallback));
    }

    @Override // com.ss.android.lark.album.IChatAlbumContract.IModel
    /* renamed from: a */
    public void mo101912a(Context context, ChatImageViewData chatImageViewData, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(chatImageViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ImageSet imageSet = chatImageViewData.getImageSet();
        if (imageSet != null) {
            MediaImageSet mediaImageSet = (MediaImageSet) imageSet;
            MediaExtra mediaExtra = mediaImageSet.getMediaExtra();
            Intrinsics.checkExpressionValueIsNotNull(mediaExtra, "mediaExtra");
            String key = mediaExtra.getKey();
            String a = C57881t.m224618a(context, mediaExtra.getMime(), key);
            if (C26311p.m95290j(a)) {
                iGetDataCallback.onError(new ErrorResult(f72067b));
                return;
            }
            MessageIdentity messageIdentity = mediaImageSet.getMessageIdentity();
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36501o s = b.mo134591s();
            Intrinsics.checkExpressionValueIsNotNull(messageIdentity, "messageIdentity");
            s.mo134681b(context, messageIdentity.getMessageId(), messageIdentity.getSourceId(), messageIdentity.getChatId(), Message.SourceType.TYPE_FROM_MESSAGE.getNumber(), key, a, new C28644c(iGetDataCallback), null);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.media.MediaImageSet");
    }

    @Override // com.ss.android.lark.album.IChatAlbumContract.IModel
    /* renamed from: b */
    public void mo101915b(Context context, ChatImageViewData chatImageViewData, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(chatImageViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ImageSet imageSet = chatImageViewData.getImageSet();
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36473g v = b.mo134594v();
        Intrinsics.checkExpressionValueIsNotNull(imageSet, "imageSet");
        if (!v.mo134497a(imageSet.getKey(), true)) {
            iGetDataCallback.onError(new ErrorResult(f72066a));
            return;
        }
        AbstractC36474h b2 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
        b2.mo134594v().mo134500b(imageSet.getKey());
        String str = C57881t.m224651w(context) + System.currentTimeMillis();
        Image origin = imageSet.getOrigin();
        Intrinsics.checkExpressionValueIsNotNull(origin, "image");
        if (origin.getType() == Image.Type.ENCRYPTED) {
            AbstractC36474h b3 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
            b3.mo134597y().mo134737a(context, str, new C38824b(origin.getKey()), origin.getWidth(), origin.getHeight(), iGetDataCallback);
            return;
        }
        AbstractC36474h b4 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b4, "ChatModuleInstanceHolder.getDependency()");
        b4.mo134597y().mo134737a(context, str, origin.getUrls().get(0), origin.getWidth(), origin.getHeight(), iGetDataCallback);
    }
}
