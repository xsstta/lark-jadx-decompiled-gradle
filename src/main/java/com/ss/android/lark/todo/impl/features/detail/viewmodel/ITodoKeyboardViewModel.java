package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import androidx.lifecycle.LiveData;
import com.ss.android.lark.widget.richtext.RichText;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u00010J\u0016\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001fH&J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\tH&J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%H&J\u0012\u0010&\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\u0003H&J \u0010(\u001a\u00020\u001d2\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020+0*j\b\u0012\u0004\u0012\u00020+`,H&J\b\u0010-\u001a\u00020\u001dH&J\b\u0010.\u001a\u00020\u001dH&J\b\u0010/\u001a\u00020\u001dH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0012X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0010R\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0010¨\u00061"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoKeyboardViewModel;", "", "chatIdForAddAssignee", "", "getChatIdForAddAssignee", "()Ljava/lang/String;", "setChatIdForAddAssignee", "(Ljava/lang/String;)V", "createFromMessageToolbar", "", "getCreateFromMessageToolbar", "()Z", "isShowCreateAndSend", "needUpdate", "Landroidx/lifecycle/LiveData;", "getNeedUpdate", "()Landroidx/lifecycle/LiveData;", "richTextSummary", "Lcom/ss/android/lark/widget/richtext/RichText;", "getRichTextSummary", "()Lcom/ss/android/lark/widget/richtext/RichText;", "setRichTextSummary", "(Lcom/ss/android/lark/widget/richtext/RichText;)V", "state", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoKeyboardViewModel$State;", "getState", "updateAssigneeFragment", "getUpdateAssigneeFragment", "addNewFollowers", "", "followerIds", "", "createKeyBoardTodo", "closeActivity", "insertDocIntoMap", "anchorId", "doc", "Lcom/ss/android/lark/doc/entity/Doc;", "isOutUser", "userId", "parseAssigneePickerData", "pickerData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "Lkotlin/collections/ArrayList;", "reset", "saveDraft", "updateTodo", "State", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface ITodoKeyboardViewModel {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoKeyboardViewModel$State;", "", "(Ljava/lang/String;I)V", "CreateSuccess", "DeleteSuccess", "Unknown", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum State {
        CreateSuccess,
        DeleteSuccess,
        Unknown
    }

    boolean getCreateFromMessageToolbar();

    RichText getRichTextSummary();

    LiveData<State> getState();

    boolean isShowCreateAndSend();

    void reset();

    void saveDraft();
}
