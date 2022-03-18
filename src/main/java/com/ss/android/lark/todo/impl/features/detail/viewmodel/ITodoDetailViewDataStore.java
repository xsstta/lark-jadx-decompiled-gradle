package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import androidx.lifecycle.LiveData;
import com.bytedance.lark.pb.todo.v1.Record;
import com.ss.android.lark.todo.impl.features.detail.comment.ICommentViewDataStore;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.data.TodoToastUnit;
import com.ss.android.lark.todo.impl.framework.architecture.Event;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\bR\u001a\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\bR\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\bR\u0018\u0010\u0016\u001a\u00020\u0011X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\bR\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\bR\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\bR\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\bR\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\bR\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\bR\u0018\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\bR\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\bR\u0018\u00100\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\bR\u001e\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\r0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\bR\u0018\u00105\u001a\u00020\u0011X¦\u000e¢\u0006\f\u001a\u0004\b6\u0010\u0018\"\u0004\b7\u0010\u001aR\u0018\u00108\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\bR\u0018\u0010:\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\bR\u001e\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\r0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\bR\u001a\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\bR\u0018\u0010A\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\bR\u0018\u0010B\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\bR\u0018\u0010D\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\bR\u0018\u0010F\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\bR\u0018\u0010H\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\bR\u0018\u0010J\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\bR\u0018\u0010L\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\bR\u0018\u0010N\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\bR\u0018\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\bR\u0018\u0010S\u001a\b\u0012\u0004\u0012\u00020T0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010\bR\u0018\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\bX\u0010\bR\u0018\u0010Y\u001a\b\u0012\u0004\u0012\u00020.0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010\bR\u0018\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010\bR\u0018\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010\bR\u0018\u0010_\u001a\b\u0012\u0004\u0012\u00020(0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b`\u0010\bR\u0018\u0010a\u001a\b\u0012\u0004\u0012\u00020+0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\bb\u0010\bR\u0018\u0010c\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\bd\u0010\bR\u0018\u0010e\u001a\b\u0012\u0004\u0012\u00020.0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\bf\u0010\bR\u0018\u0010g\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\bh\u0010\bR\u0018\u0010i\u001a\b\u0012\u0004\u0012\u00020j0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\bk\u0010\bR\u0018\u0010l\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\bm\u0010\bR\u0018\u0010n\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\bo\u0010\bR\u0018\u0010p\u001a\b\u0012\u0004\u0012\u00020q0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\br\u0010\bR\u001e\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020u0t0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\bv\u0010\bR\u001e\u0010w\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060t0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\bx\u0010\bR\u0018\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\bz\u0010\b¨\u0006{"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITitleBarViewDataStore;", "Lcom/ss/android/lark/todo/impl/features/detail/comment/ICommentViewDataStore;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/IBottomViewDataStore;", "assigneeFragmentShowAdd", "Landroidx/lifecycle/LiveData;", "", "getAssigneeFragmentShowAdd", "()Landroidx/lifecycle/LiveData;", "assigneeMultiStrategy", "", "getAssigneeMultiStrategy", "assignees", "", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AssigneeBean;", "getAssignees", "chatIdForAddUser", "", "getChatIdForAddUser", "commentInsertAtTag", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AtChatterBean;", "getCommentInsertAtTag", "creatorId", "getCreatorId", "()Ljava/lang/String;", "setCreatorId", "(Ljava/lang/String;)V", "descriptionClearFocus", "getDescriptionClearFocus", "descriptionFragmentInsertAtTag", "getDescriptionFragmentInsertAtTag", "descriptionInfo", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DescriptionInfo;", "getDescriptionInfo", "descriptionInit", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DescriptionInit;", "getDescriptionInit", "descriptionInsertAtTag", "getDescriptionInsertAtTag", "descriptionPasteDoc", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DocPasteBean;", "getDescriptionPasteDoc", "descriptionPasteUrl", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/UrlPasteBean;", "getDescriptionPasteUrl", "descriptionShowRichText", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/RichTextShowBean;", "getDescriptionShowRichText", "followerFragmentShowAdd", "getFollowerFragmentShowAdd", "followers", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/FollowerBean;", "getFollowers", "guid", "getGuid", "setGuid", "historyHasMore", "getHistoryHasMore", "historyIsLoading", "getHistoryIsLoading", "historyRecords", "Lcom/bytedance/lark/pb/todo/v1/Record;", "getHistoryRecords", "initAtController", "getInitAtController", "isCreator", "keyboardSummaryClearFocus", "getKeyboardSummaryClearFocus", "keyboardSummaryRequestFocus", "getKeyboardSummaryRequestFocus", "needUpdateFollower", "getNeedUpdateFollower", "pageLoading", "getPageLoading", "showRevokeAssignee", "getShowRevokeAssignee", "summaryClearFocus", "getSummaryClearFocus", "summaryHideKeyboard", "getSummaryHideKeyboard", "summaryInfo", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/SummaryInfo;", "getSummaryInfo", "summaryInit", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/SummaryInit;", "getSummaryInit", "summaryInlineInfo", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/SummaryInlineInfo;", "getSummaryInlineInfo", "summaryInlineShowRichText", "getSummaryInlineShowRichText", "summaryInsertAtTag", "getSummaryInsertAtTag", "summaryKeyboardInsertAtTag", "getSummaryKeyboardInsertAtTag", "summaryPasteDoc", "getSummaryPasteDoc", "summaryPasteUrl", "getSummaryPasteUrl", "summaryRequestFocus", "getSummaryRequestFocus", "summaryShowRichText", "getSummaryShowRichText", "summaryStrikeThrough", "getSummaryStrikeThrough", "timeBean", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TimeBean;", "getTimeBean", "timeButtonShow", "getTimeButtonShow", "timeFragment", "getTimeFragment", "timeInfo", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TimeInfo;", "getTimeInfo", "toast", "Lcom/ss/android/lark/todo/impl/framework/architecture/Event;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/data/TodoToastUnit;", "getToast", "toastInfo", "getToastInfo", "toastStringResId", "getToastStringResId", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.q */
public interface ITodoDetailViewDataStore extends ICommentViewDataStore, IBottomViewDataStore, ITitleBarViewDataStore {
    LiveData<Integer> getAssigneeFragmentShowAdd();

    LiveData<Boolean> getAssigneeMultiStrategy();

    LiveData<List<AssigneeBean>> getAssignees();

    LiveData<AtChatterBean> getCommentInsertAtTag();

    String getCreatorId();

    LiveData<Boolean> getDescriptionClearFocus();

    LiveData<AtChatterBean> getDescriptionFragmentInsertAtTag();

    LiveData<DescriptionInfo> getDescriptionInfo();

    LiveData<DescriptionInit> getDescriptionInit();

    LiveData<AtChatterBean> getDescriptionInsertAtTag();

    LiveData<DocPasteBean> getDescriptionPasteDoc();

    LiveData<UrlPasteBean> getDescriptionPasteUrl();

    LiveData<RichTextShowBean> getDescriptionShowRichText();

    LiveData<Boolean> getFollowerFragmentShowAdd();

    LiveData<List<FollowerBean>> getFollowers();

    String getGuid();

    LiveData<Boolean> getHistoryHasMore();

    LiveData<Boolean> getHistoryIsLoading();

    LiveData<List<Record>> getHistoryRecords();

    LiveData<String> getInitAtController();

    LiveData<Boolean> getKeyboardSummaryClearFocus();

    LiveData<Boolean> getKeyboardSummaryRequestFocus();

    LiveData<Boolean> getShowRevokeAssignee();

    LiveData<Boolean> getSummaryClearFocus();

    LiveData<Boolean> getSummaryHideKeyboard();

    LiveData<SummaryInfo> getSummaryInfo();

    LiveData<SummaryInit> getSummaryInit();

    LiveData<SummaryInlineInfo> getSummaryInlineInfo();

    LiveData<RichTextShowBean> getSummaryInlineShowRichText();

    LiveData<AtChatterBean> getSummaryInsertAtTag();

    LiveData<AtChatterBean> getSummaryKeyboardInsertAtTag();

    LiveData<DocPasteBean> getSummaryPasteDoc();

    LiveData<UrlPasteBean> getSummaryPasteUrl();

    LiveData<Boolean> getSummaryRequestFocus();

    LiveData<RichTextShowBean> getSummaryShowRichText();

    LiveData<Boolean> getSummaryStrikeThrough();

    LiveData<TimeBean> getTimeBean();

    LiveData<Boolean> getTimeButtonShow();

    LiveData<Boolean> getTimeFragment();

    LiveData<TimeInfo> getTimeInfo();

    LiveData<Event<TodoToastUnit>> getToast();
}
