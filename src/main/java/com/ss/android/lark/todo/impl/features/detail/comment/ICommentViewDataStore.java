package com.ss.android.lark.todo.impl.features.detail.comment;

import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.lark.pb.todo.v1.TodoComment;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.RichTextShowBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0006R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0006R\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0006R\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0006R\u001e\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0006R\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0006R\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0006R&\u0010)\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001c\u0018\u00010*0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0006R\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0006R&\u0010/\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001c\u0018\u00010*0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0006R&\u00101\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000b\u0018\u00010*0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0006¨\u00063"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/ICommentViewDataStore;", "", "commentAtUserInfo", "Landroidx/lifecycle/LiveData;", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentAtUserInfo;", "getCommentAtUserInfo", "()Landroidx/lifecycle/LiveData;", "commentDraftLv", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentDraftInfo;", "getCommentDraftLv", "commentHasMore", "", "getCommentHasMore", "commentInitChatId", "", "getCommentInitChatId", "commentIsEmpty", "getCommentIsEmpty", "commentIsLoading", "getCommentIsLoading", "commentKeyboardVisible", "getCommentKeyboardVisible", "commentLoadingFailed", "getCommentLoadingFailed", "commentLoadingMore", "getCommentLoadingMore", "commentLv", "", "Lcom/bytedance/lark/pb/todo/v1/TodoComment;", "getCommentLv", "commentPanelInfo", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentPanelInfo;", "getCommentPanelInfo", "commentShowRichText", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/RichTextShowBean;", "getCommentShowRichText", "()Landroidx/lifecycle/MutableLiveData;", "creatorInfo", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CreatorInfo;", "getCreatorInfo", "editCommentInfo", "Lkotlin/Pair;", "", "getEditCommentInfo", "initComment", "getInitComment", "replyCommentInfo", "getReplyCommentInfo", "scrollToBottomOfComments", "getScrollToBottomOfComments", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.aa */
public interface ICommentViewDataStore {
    LiveData<CommentAtUserInfo> getCommentAtUserInfo();

    LiveData<CommentDraftInfo> getCommentDraftLv();

    LiveData<Boolean> getCommentHasMore();

    LiveData<String> getCommentInitChatId();

    LiveData<Boolean> getCommentIsEmpty();

    LiveData<Boolean> getCommentIsLoading();

    LiveData<Boolean> getCommentKeyboardVisible();

    LiveData<Boolean> getCommentLoadingFailed();

    LiveData<Boolean> getCommentLoadingMore();

    LiveData<List<TodoComment>> getCommentLv();

    LiveData<CommentPanelInfo> getCommentPanelInfo();

    C1177w<RichTextShowBean> getCommentShowRichText();

    LiveData<CreatorInfo> getCreatorInfo();

    LiveData<Pair<Integer, TodoComment>> getEditCommentInfo();

    LiveData<Pair<Integer, TodoComment>> getReplyCommentInfo();

    LiveData<Pair<Integer, Boolean>> getScrollToBottomOfComments();
}
