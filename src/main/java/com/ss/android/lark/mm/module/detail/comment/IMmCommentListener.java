package com.ss.android.lark.mm.module.detail.comment;

import com.ss.android.lark.mm.module.detail.comment.model.MmComment;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingParagraph;
import com.ss.android.lark.mm.module.framework.IMmListener;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bH&J\b\u0010\t\u001a\u00020\u0003H&J0\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH&J4\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H&¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/comment/IMmCommentListener;", "Lcom/ss/android/lark/mm/module/framework/IMmListener;", "onChangeComments", "", "commentMap", "Ljava/util/HashMap;", "", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo;", "Lkotlin/collections/HashMap;", "onDismissComments", "onPostComment", "start", "", "end", "quote", "paragraph", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingParagraph;", "adapterPosition", "onViewComment", "locationPosition", "mentionCommentId", "mentionContentId", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.comment.c */
public interface IMmCommentListener extends IMmListener {
    /* renamed from: a */
    void mo161684a();

    /* renamed from: a */
    void mo161685a(int i, int i2, String str, MmMeetingParagraph mmMeetingParagraph, int i3);

    /* renamed from: a */
    void mo161686a(MmMeetingParagraph mmMeetingParagraph, int i, int i2, String str, String str2);

    /* renamed from: a */
    void mo161687a(HashMap<String, MmComment.MmCommentInfo> hashMap);
}
