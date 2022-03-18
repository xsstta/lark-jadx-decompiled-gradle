package com.ss.android.lark.widget.photo_picker.gallery.callback;

import com.ss.android.lark.chat.entity.image.ImageSet;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u001c\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/gallery/callback/OnLoadMoreListener;", "Ljava/io/Serializable;", "onLoadLeft", "", "Lcom/ss/android/lark/chat/entity/image/ImageSet;", "messageId", "", "onLoadRight", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface OnLoadMoreListener extends Serializable {
    List<ImageSet> onLoadLeft(String str);

    List<ImageSet> onLoadRight(String str);
}
