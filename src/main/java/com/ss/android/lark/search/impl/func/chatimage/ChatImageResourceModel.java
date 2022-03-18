package com.ss.android.lark.search.impl.func.chatimage;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.media.MediaExtra;
import com.ss.android.lark.chat.entity.media.MediaImageSet;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.func.chatimage.IChatImageResourceContract;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.viewdata.ChatInsideSearchImageViewData;
import com.ss.android.lark.utils.C57881t;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J$\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J&\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0016J&\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0016J\u001e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00150\nH\u0016¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatimage/ChatImageResourceModel;", "Lcom/ss/android/lark/search/impl/func/chatimage/IChatImageResourceContract$IModel;", "()V", "create", "", "deleteMessageByIds", "messageIds", "", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "destroy", "downloadImage", "context", "Landroid/content/Context;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/search/impl/func/chatinside/detail/image/viewdata/ChatInsideSearchImageViewData;", "downloadVideo", "getChatById", "chatId", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.impl.func.chatimage.c */
public final class ChatImageResourceModel implements IChatImageResourceContract.IModel {
    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/search/impl/func/chatimage/ChatImageResourceModel$downloadVideo$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.chatimage.c$a */
    public static final class C53390a implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f131959a;

        C53390a(IGetDataCallback iGetDataCallback) {
            this.f131959a = iGetDataCallback;
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            this.f131959a.onSuccess(str);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f131959a.onError(errorResult);
        }
    }

    @Override // com.ss.android.lark.search.impl.func.chatimage.IChatImageResourceContract.IModel
    /* renamed from: a */
    public void mo182375a(String str, IGetDataCallback<Chat> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ISearchModuleDependency a = C53258a.m205939a();
        Intrinsics.checkExpressionValueIsNotNull(a, "SearchModule.getDependency()");
        a.mo181756f().mo181783a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.search.impl.func.chatimage.IChatImageResourceContract.IModel
    /* renamed from: a */
    public void mo182376a(List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(list, "messageIds");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ISearchModuleDependency a = C53258a.m205939a();
        Intrinsics.checkExpressionValueIsNotNull(a, "SearchModule.getDependency()");
        a.mo181756f().mo181796b(list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.search.impl.func.chatimage.IChatImageResourceContract.IModel
    /* renamed from: a */
    public void mo182374a(Context context, ChatInsideSearchImageViewData chatInsideSearchImageViewData, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(chatInsideSearchImageViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ImageSet imageSet = chatInsideSearchImageViewData.getImageSet();
        if (imageSet != null) {
            MediaImageSet mediaImageSet = (MediaImageSet) imageSet;
            MediaExtra mediaExtra = mediaImageSet.getMediaExtra();
            Intrinsics.checkExpressionValueIsNotNull(mediaExtra, "mediaExtra");
            String key = mediaExtra.getKey();
            String a = C57881t.m224618a(context, mediaExtra.getMime(), key);
            MessageIdentity messageIdentity = mediaImageSet.getMessageIdentity();
            ISearchModuleDependency a2 = C53258a.m205939a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "SearchModule.getDependency()");
            ISearchModuleDependency.AbstractC53323i q = a2.mo181768q();
            Intrinsics.checkExpressionValueIsNotNull(messageIdentity, "messageIdentity");
            q.mo181826a(context, messageIdentity.getMessageId(), messageIdentity.getSourceId(), messageIdentity.getChatId(), Message.SourceType.TYPE_FROM_MESSAGE.getNumber(), key, a, new C53390a(iGetDataCallback));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.media.MediaImageSet");
    }

    @Override // com.ss.android.lark.search.impl.func.chatimage.IChatImageResourceContract.IModel
    /* renamed from: b */
    public void mo182377b(Context context, ChatInsideSearchImageViewData chatInsideSearchImageViewData, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(chatInsideSearchImageViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ImageSet imageSet = chatInsideSearchImageViewData.getImageSet();
        ISearchModuleDependency a = C53258a.m205939a();
        Intrinsics.checkExpressionValueIsNotNull(a, "SearchModule.getDependency()");
        ISearchModuleDependency.AbstractC53314b r = a.mo181769r();
        Intrinsics.checkExpressionValueIsNotNull(imageSet, "imageSet");
        if (!r.mo181828a(imageSet.getKey(), true)) {
            iGetDataCallback.onError(new ErrorResult("authorization error"));
            return;
        }
        ISearchModuleDependency a2 = C53258a.m205939a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "SearchModule.getDependency()");
        a2.mo181769r().mo181827a(imageSet.getKey());
        String str = C57881t.m224651w(context) + System.currentTimeMillis();
        Image origin = imageSet.getOrigin();
        Intrinsics.checkExpressionValueIsNotNull(origin, "image");
        if (origin.getType() == Image.Type.ENCRYPTED) {
            ISearchModuleDependency a3 = C53258a.m205939a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "SearchModule.getDependency()");
            a3.mo181758g().mo181806a(context, str, new C38824b(origin.getKey()), origin.getWidth(), origin.getHeight(), iGetDataCallback);
            return;
        }
        ISearchModuleDependency a4 = C53258a.m205939a();
        Intrinsics.checkExpressionValueIsNotNull(a4, "SearchModule.getDependency()");
        a4.mo181758g().mo181806a(context, str, origin.getUrls().get(0), origin.getWidth(), origin.getHeight(), iGetDataCallback);
    }
}
