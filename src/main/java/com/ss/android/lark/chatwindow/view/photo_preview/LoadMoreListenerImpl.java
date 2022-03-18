package com.ss.android.lark.chatwindow.view.photo_preview;

import com.ss.android.lark.biz.im.api.ImageHistoryResponse;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnLoadMoreListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LoadMoreListenerImpl implements OnLoadMoreListener {
    private String mChatId;

    public LoadMoreListenerImpl(String str) {
        this.mChatId = str;
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.callback.OnLoadMoreListener
    public List<ImageSet> onLoadLeft(String str) {
        ImageHistoryResponse a = C32821b.m126120a().mo120984a(this.mChatId, str, ImageHistoryResponse.Direction.BEFORE, (List<ImageHistoryResponse.ResourceType>) null, 10);
        if (a == null) {
            return new ArrayList();
        }
        List<ImageSet> imageSetList = a.getImageSetList();
        Collections.reverse(imageSetList);
        return imageSetList;
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.callback.OnLoadMoreListener
    public List<ImageSet> onLoadRight(String str) {
        ImageHistoryResponse a = C32821b.m126120a().mo120984a(this.mChatId, str, ImageHistoryResponse.Direction.AFTER, (List<ImageHistoryResponse.ResourceType>) null, 10);
        if (a == null) {
            return new ArrayList();
        }
        List<ImageSet> imageSetList = a.getImageSetList();
        Collections.reverse(imageSetList);
        return imageSetList;
    }
}
