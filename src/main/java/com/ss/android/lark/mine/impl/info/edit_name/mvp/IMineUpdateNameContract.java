package com.ss.android.lark.mine.impl.info.edit_name.mvp;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/mine/impl/info/edit_name/mvp/IMineUpdateNameContract;", "", "IModel", "IView", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.info.edit_name.mvp.a */
public interface IMineUpdateNameContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mine/impl/info/edit_name/mvp/IMineUpdateNameContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "getMineName", "", "setMineName", "", "mineName", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.info.edit_name.mvp.a$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        String mo160970a();

        /* renamed from: a */
        void mo160971a(String str, IGetDataCallback<String> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nJ\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mine/impl/info/edit_name/mvp/IMineUpdateNameContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/mine/impl/info/edit_name/mvp/IMineUpdateNameContract$IView$Delegate;", "setMineNamResult", "", "mineName", "", "showMineName", "showToast", "content", "Delegate", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.info.edit_name.mvp.a$b */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mine/impl/info/edit_name/mvp/IMineUpdateNameContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onSetMineName", "", "mineName", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mine.impl.info.edit_name.mvp.a$b$a */
        public interface Delegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo160972a(String str);
        }

        /* renamed from: a */
        void mo160964a(String str);

        /* renamed from: b */
        void mo160966b(String str);

        /* renamed from: c */
        void mo160968c(String str);
    }
}
