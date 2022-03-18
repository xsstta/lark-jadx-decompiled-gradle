package com.larksuite.component.blockit.hashtag.add;

import com.google.firebase.messaging.Constants;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.component.blockit.hashtag.HashTagViewData;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/larksuite/component/blockit/hashtag/add/IAddHashTagContract;", "", "IModel", "IView", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.blockit.hashtag.add.e */
public interface IAddHashTagContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J(\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J.\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\bH&J0\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00110\bH&¨\u0006\u0012"}, d2 = {"Lcom/larksuite/component/blockit/hashtag/add/IAddHashTagContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "addTag", "", "tag", "", "context", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "createTag", "searchMentionTags", SearchIntents.EXTRA_QUERY, "userId", "", "Lcom/larksuite/component/blockit/hashtag/HashTagViewData;", "searchTags", "Lkotlin/Pair;", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.add.e$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        void mo86450a(String str, IGetDataCallback<Pair<Boolean, List<HashTagViewData>>> iGetDataCallback);

        /* renamed from: a */
        void mo86451a(String str, String str2, IGetDataCallback<List<HashTagViewData>> iGetDataCallback);

        /* renamed from: b */
        void mo86452b(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: c */
        void mo86453c(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014J\b\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J(\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u001a\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0015"}, d2 = {"Lcom/larksuite/component/blockit/hashtag/add/IAddHashTagContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/larksuite/component/blockit/hashtag/add/IAddHashTagContract$IView$Delegate;", "finish", "", "setInitData", "initData", "Lcom/larksuite/component/blockit/hashtag/add/InitData;", "setSearchData", SearchIntents.EXTRA_QUERY, "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/larksuite/component/blockit/hashtag/HashTagViewData;", "needCreate", "", "showToast", "message", "iconRes", "", "Delegate", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.add.e$b */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/larksuite/component/blockit/hashtag/add/IAddHashTagContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onAddHashTag", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/larksuite/component/blockit/hashtag/HashTagViewData;", "onCreateHashTag", "onDeleteSearchQuery", "onSearchHashTag", SearchIntents.EXTRA_QUERY, "", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.blockit.hashtag.add.e$b$b */
        public interface Delegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo86461a(HashTagViewData bVar);

            /* renamed from: a */
            void mo86462a(String str);

            /* renamed from: b */
            void mo86463b(HashTagViewData bVar);
        }

        /* renamed from: a */
        void mo86472a(InitData fVar);

        /* renamed from: a */
        void mo86474a(String str, int i);

        /* renamed from: a */
        void mo86475a(String str, List<HashTagViewData> list, boolean z);

        /* renamed from: b */
        void mo86476b();

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.blockit.hashtag.add.e$b$a */
        public static final class C24101a {
            /* renamed from: a */
            public static /* synthetic */ void m88006a(IView bVar, String str, int i, int i2, Object obj) {
                if (obj == null) {
                    if ((i2 & 2) != 0) {
                        i = 0;
                    }
                    bVar.mo86474a(str, i);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showToast");
            }
        }
    }
}
