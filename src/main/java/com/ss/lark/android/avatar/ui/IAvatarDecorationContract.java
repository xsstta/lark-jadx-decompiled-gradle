package com.ss.lark.android.avatar.ui;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/lark/android/avatar/ui/IAvatarDecorationContract;", "", "IModel", "IView", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.avatar.ui.i */
public interface IAvatarDecorationContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H&¨\u0006\b"}, d2 = {"Lcom/ss/lark/android/avatar/ui/IAvatarDecorationContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "queryMiniApps", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.avatar.ui.i$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        void mo222683a(IGetDataCallback<List<String>> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bJ\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH&¨\u0006\f"}, d2 = {"Lcom/ss/lark/android/avatar/ui/IAvatarDecorationContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/lark/android/avatar/ui/IAvatarDecorationContract$IView$IViewDelegate;", "updateMiniApps", "", "list", "", "", "updatePreviewPhoto", "photoItem", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "IViewDelegate", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.avatar.ui.i$b */
    public interface IView extends com.larksuite.framework.mvp.IView<IViewDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ss/lark/android/avatar/ui/IAvatarDecorationContract$IView$IViewDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.avatar.ui.i$b$a */
        public interface IViewDelegate extends IView.IViewDelegate {
        }

        /* renamed from: a */
        void mo222659a(PhotoItem photoItem);

        /* renamed from: a */
        void mo222661a(List<String> list);
    }
}
