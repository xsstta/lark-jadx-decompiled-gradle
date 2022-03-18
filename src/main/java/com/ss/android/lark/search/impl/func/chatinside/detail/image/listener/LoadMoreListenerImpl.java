package com.ss.android.lark.search.impl.func.chatinside.detail.image.listener;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.impl.func.chatinside.common.C53412a;
import com.ss.android.lark.search.impl.hitpoint.SearchHitPoint;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnLoadMoreListener;
import java.util.List;

public class LoadMoreListenerImpl implements OnLoadMoreListener {
    private final String mChatId;

    private void addScrollNextPicBrowserHitPoint() {
        C53412a.m206845a(this.mChatId, new IGetDataCallback<String>() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.image.listener.LoadMoreListenerImpl.C534972 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                SearchHitPoint.f131886a.mo182024d(str);
            }
        });
    }

    private void addScrollPrePicBrowserHitPoint() {
        C53412a.m206845a(this.mChatId, new IGetDataCallback<String>() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.image.listener.LoadMoreListenerImpl.C534961 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                SearchHitPoint.f131886a.mo182023c(str);
            }
        });
    }

    public LoadMoreListenerImpl(String str) {
        this.mChatId = str;
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.callback.OnLoadMoreListener
    public List<ImageSet> onLoadLeft(String str) {
        addScrollPrePicBrowserHitPoint();
        return C53258a.m205939a().mo181756f().mo181790b(this.mChatId, str, 10);
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.callback.OnLoadMoreListener
    public List<ImageSet> onLoadRight(String str) {
        addScrollNextPicBrowserHitPoint();
        return C53258a.m205939a().mo181756f().mo181797c(this.mChatId, str, 10);
    }
}
