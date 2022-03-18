package com.ss.android.lark.search.impl.func.chatimage;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.viewdata.ChatInsideSearchImageViewData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatimage/IChatImageResourceContract;", "", "IModel", "IView", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.impl.func.chatimage.f */
public interface IChatImageResourceContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J&\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH&J&\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH&J\u001e\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00120\bH&¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatimage/IChatImageResourceContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "deleteMessageByIds", "", "messageIds", "", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "downloadImage", "context", "Landroid/content/Context;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/search/impl/func/chatinside/detail/image/viewdata/ChatInsideSearchImageViewData;", "downloadVideo", "getChatById", "chatId", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.chatimage.f$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        void mo182374a(Context context, ChatInsideSearchImageViewData chatInsideSearchImageViewData, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo182375a(String str, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo182376a(List<String> list, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: b */
        void mo182377b(Context context, ChatInsideSearchImageViewData chatInsideSearchImageViewData, IGetDataCallback<String> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dJ0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0012\u0010\u0011\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\fH&J\"\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\b\b\u0001\u0010\u0012\u001a\u00020\fH&J\u0012\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\fH&J0\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0016\u0010\u0018\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\u0019H&J\b\u0010\u001a\u001a\u00020\u0004H&J\u0012\u0010\u001b\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\fH&J\u0012\u0010\u001c\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\fH&¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatimage/IChatImageResourceContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/search/impl/func/chatimage/IChatImageResourceContract$IView$Delegate;", "forwardMessage", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "messageIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "requestCode", "", "getContext", "Landroid/content/Context;", "isSelectStatus", "", "loadFail", "stringId", "loadPartSuccess", "requestSucceedCount", "requestFailedCount", "loadSuccess", "mergeForwardMessage", "removeItems", "", "resetItemSelectStatus", "showLoading", "showToast", "Delegate", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.chatimage.f$b */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H&J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH&J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatimage/IChatImageResourceContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onDelete", "", "selectMessageIds", "", "", "onDownload", "selectItems", "Lcom/ss/android/lark/search/impl/func/chatinside/detail/image/viewdata/ChatInsideSearchImageViewData;", "onForward", "Ljava/util/ArrayList;", "onMergeForward", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.impl.func.chatimage.f$b$a */
        public interface Delegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo182388a(ArrayList<String> arrayList);

            /* renamed from: a */
            void mo182389a(List<? extends ChatInsideSearchImageViewData> list);

            /* renamed from: b */
            void mo182390b(ArrayList<String> arrayList);

            /* renamed from: b */
            void mo182391b(List<String> list);
        }

        /* renamed from: a */
        void mo182400a(int i);

        /* renamed from: a */
        void mo182401a(int i, int i2, int i3);

        /* renamed from: a */
        void mo182402a(Chat chat, ArrayList<String> arrayList, int i);

        /* renamed from: a */
        void mo182404a(List<String> list);

        /* renamed from: b */
        void mo182406b();

        /* renamed from: b */
        void mo182407b(int i);

        /* renamed from: b */
        void mo182408b(Chat chat, ArrayList<String> arrayList, int i);

        /* renamed from: b */
        void mo182409b(boolean z);

        /* renamed from: c */
        Context mo182410c();

        /* renamed from: c */
        void mo182411c(int i);

        /* renamed from: d */
        void mo182412d(int i);
    }
}
