package com.larksuite.component.blockit.hashtag.list;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/larksuite/component/blockit/hashtag/list/IHashTagListContract;", "", "IModel", "IView", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.blockit.hashtag.list.g */
public interface IHashTagListContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u001e\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\f"}, d2 = {"Lcom/larksuite/component/blockit/hashtag/list/IHashTagListContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "deleteTag", "", "tagId", "", "tagInstanceId", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/larksuite/component/blockit/hashtag/list/InitData;", "loadAddedHashTags", "blockId", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.list.g$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        void mo86514a(String str, IGetDataCallback<InitData> iGetDataCallback);

        /* renamed from: a */
        void mo86515a(String str, String str2, IGetDataCallback<InitData> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bJ\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&¨\u0006\f"}, d2 = {"Lcom/larksuite/component/blockit/hashtag/list/IHashTagListContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/larksuite/component/blockit/hashtag/list/IHashTagListContract$IView$Delegate;", "setInitData", "", "initData", "Lcom/larksuite/component/blockit/hashtag/list/InitData;", "showFailToast", "text", "", "showSuccToast", "Delegate", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.list.g$b */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/larksuite/component/blockit/hashtag/list/IHashTagListContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "getBlockTypeId", "", "onDeleteTag", "", "tagId", "tagInstanceId", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.blockit.hashtag.list.g$b$a */
        public interface Delegate extends IView.IViewDelegate {
            /* renamed from: a */
            String mo86522a();

            /* renamed from: a */
            void mo86523a(String str, String str2);
        }

        /* renamed from: a */
        void mo86528a(InitData hVar);

        /* renamed from: a */
        void mo86529a(String str);

        /* renamed from: b */
        void mo86530b(String str);
    }
}
