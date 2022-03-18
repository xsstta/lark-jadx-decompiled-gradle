package com.ss.android.lark.todo.impl.features.chatlist.mvvm;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1150b;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.todo.v1.ChatTodoInfo;
import com.bytedance.lark.pb.todo.v1.CustomComplete;
import com.bytedance.lark.pb.todo.v1.MarkTodoCompletedRequest;
import com.bytedance.lark.pb.todo.v1.ShareTodoMessageRequest;
import com.bytedance.lark.pb.todo.v1.ShareTodoMessageResponse;
import com.bytedance.lark.pb.todo.v1.Todo;
import com.bytedance.lark.pb.todo.v1.TodoAssignee;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.larksuite.component.blockit.entity.BlockTypeID;
import com.larksuite.component.blockit.entity.Domain;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.Subscribe;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.idependency.IChatModuleDependency;
import com.ss.android.lark.todo.dependency.idependency.ILoginDependency;
import com.ss.android.lark.todo.dependency.p2789a.AbstractC56259u;
import com.ss.android.lark.todo.impl.features.chatlist.helper.TodoChatListHelper;
import com.ss.android.lark.todo.impl.features.chatlist.service.TodoChatListService;
import com.ss.android.lark.todo.impl.features.chatlist.service.item.CompleteChatTodosData;
import com.ss.android.lark.todo.impl.features.chatlist.service.item.UnCompleteChatTodosData;
import com.ss.android.lark.todo.impl.features.common.helper.CustomCompleteHelper;
import com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper;
import com.ss.android.lark.todo.impl.features.common.helper.OperationToastHelper;
import com.ss.android.lark.todo.impl.features.detail.DetailEntrance;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoChatItem;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFetchStatus;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoListToastUnit;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoSceneType;
import com.ss.android.lark.todo.impl.framework.busevents.AddTodoEvent;
import com.ss.android.lark.todo.impl.framework.busevents.DeleteTodoEvent;
import com.ss.android.lark.todo.impl.framework.busevents.UpdateTodoEvent;
import com.ss.android.lark.todo.impl.framework.hitpoint.appreciable.TodoAppreciableHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.rustadapter.service.SdkResponse;
import com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.todo.impl.utils.VibrateUtil;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 ¤\u00012\u00020\u00012\u00020\u0002:\u0002¤\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020CH\u0002J\u0010\u0010T\u001a\u00020R2\u0006\u0010S\u001a\u00020CH\u0002J\u0010\u0010U\u001a\u00020R2\u0006\u0010V\u001a\u00020\u0015H\u0002J\u0010\u0010W\u001a\u00020R2\u0006\u0010V\u001a\u00020\u0015H\u0002J\u0010\u0010X\u001a\u00020R2\u0006\u0010Y\u001a\u00020\u0015H\u0002J\u0018\u0010Z\u001a\u00020R2\u0006\u0010[\u001a\u00020\b2\u0006\u0010S\u001a\u00020CH\u0016J\u0010\u0010\\\u001a\u00020R2\u0006\u0010S\u001a\u00020CH\u0002J\u0010\u0010]\u001a\u00020R2\u0006\u0010S\u001a\u00020CH\u0002J\u0010\u0010^\u001a\u00020R2\u0006\u0010_\u001a\u00020`H\u0016J\u0010\u0010a\u001a\u00020R2\u0006\u0010b\u001a\u00020\bH\u0016JL\u0010c\u001a\u00020R2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010f\u001a\u00020\u00182\u0016\u0010g\u001a\u0012\u0012\u0004\u0012\u00020\u00150hj\b\u0012\u0004\u0012\u00020\u0015`i2\u0006\u0010j\u001a\u00020kH\u0002J\u0018\u0010l\u001a\u00020R2\u0006\u0010m\u001a\u00020\b2\u0006\u0010n\u001a\u00020\bH\u0002J\b\u0010o\u001a\u00020\bH\u0016J\u0010\u0010p\u001a\u00020R2\u0006\u0010q\u001a\u00020rH\u0016J\b\u0010s\u001a\u00020RH\u0002J\b\u0010t\u001a\u00020RH\u0002J\u0018\u0010u\u001a\u00020R2\u0006\u0010v\u001a\u00020\u00182\u0006\u0010w\u001a\u00020kH\u0002J\u001a\u0010x\u001a\u00020\b2\u0006\u0010y\u001a\u00020z2\b\u0010{\u001a\u0004\u0018\u00010|H\u0016J\u0010\u0010}\u001a\u00020\b2\u0006\u0010w\u001a\u00020kH\u0002J\u0019\u0010~\u001a\u00020R2\u0006\u0010\u001a\u00020\b2\u0007\u0010\u0001\u001a\u00020-H\u0016J\u0018\u0010\u0001\u001a\u00020R2\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150NH\u0002J \u0010\u0001\u001a\u00020R2\u0006\u0010b\u001a\u00020\b2\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150NH\u0002J\u0013\u0010\u0001\u001a\u00020R2\b\u0010\u0001\u001a\u00030\u0001H\u0007J\t\u0010\u0001\u001a\u00020RH\u0014J\t\u0010\u0001\u001a\u00020RH\u0016J\u0013\u0010\u0001\u001a\u00020R2\b\u0010\u0001\u001a\u00030\u0001H\u0007J\u0013\u0010\u0001\u001a\u00020R2\b\u0010\u0001\u001a\u00030\u0001H\u0007J\u001a\u0010\u0001\u001a\u00020R2\u0006\u0010y\u001a\u00020z2\u0007\u0010\u0001\u001a\u00020CH\u0016JB\u0010\u0001\u001a\u00020R2\u0016\u0010\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00012\u0017\u0010\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0005\u0012\u00030\u0001\u0018\u00010\u00012\u0006\u0010w\u001a\u00020kH\u0002J\t\u0010\u0001\u001a\u00020RH\u0002J\t\u0010\u0001\u001a\u00020RH\u0016J\u0011\u0010\u0001\u001a\u00020R2\u0006\u0010S\u001a\u00020CH\u0016J\t\u0010\u0001\u001a\u00020RH\u0002J\t\u0010\u0001\u001a\u00020RH\u0002J\t\u0010\u0001\u001a\u00020RH\u0002J\u0018\u0010\u0001\u001a\u00020R2\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0019\u0010\u0001\u001a\u00020R2\u0006\u0010S\u001a\u00020C2\u0006\u0010j\u001a\u00020kH\u0002J\u0019\u0010 \u0001\u001a\u00020R2\u0006\u0010S\u001a\u00020C2\u0006\u0010j\u001a\u00020kH\u0002J\u001b\u0010¡\u0001\u001a\u00020R2\u0007\u0010¢\u0001\u001a\u0002042\u0007\u0010£\u0001\u001a\u00020\bH\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u000e\u0010\u0011\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u001dj\b\u0012\u0004\u0012\u00020\u0015`\u001eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0004¢\u0006\u0002\n\u0000R*\u00102\u001a\u001e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b03j\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b`5X\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0004¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010;\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u001dj\b\u0012\u0004\u0012\u00020\u0015`\u001eX\u0004¢\u0006\u0002\n\u0000R \u0010<\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\n\"\u0004\b>\u0010\fR \u0010?\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\n\"\u0004\bA\u0010\fR \u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\n\"\u0004\bE\u0010\fR \u0010F\u001a\b\u0012\u0004\u0012\u00020C0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\n\"\u0004\bH\u0010\fR \u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\n\"\u0004\bL\u0010\fR&\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0N0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\n\"\u0004\bP\u0010\f¨\u0006¥\u0001"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/chatlist/mvvm/TodoChatListViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lcom/ss/android/lark/todo/impl/features/chatlist/mvvm/ITodoChatListVIewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "canFetchMore", "Landroidx/lifecycle/MutableLiveData;", "", "getCanFetchMore", "()Landroidx/lifecycle/MutableLiveData;", "setCanFetchMore", "(Landroidx/lifecycle/MutableLiveData;)V", "dataFetchStatus", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFetchStatus;", "getDataFetchStatus", "setDataFetchStatus", "isGetCompleteData", "isGetUnCompleteData", "mAddedTodoItems", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/bytedance/lark/pb/todo/v1/ChatTodoInfo;", "mAddedTodoSet", "Ljava/util/concurrent/CopyOnWriteArraySet;", "", "mChatDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IChatModuleDependency;", "mChatIsThread", "mCompleteComparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "mCompletedPagingDateSet", "mCompletedPagingTodoDataList", "mHasMore", "getMHasMore", "()Z", "setMHasMore", "(Z)V", "mLastPageOffset", "", "getMLastPageOffset", "()J", "setMLastPageOffset", "(J)V", "mListItemsSet", "", "mLoginDependency", "Lcom/ss/android/lark/todo/dependency/idependency/ILoginDependency;", "mTimeFormatDependency", "Lcom/ss/android/lark/todo/dependency/idependency/ITimeFormatDependency;", "mTitleExpandState", "Ljava/util/HashMap;", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$ChatListTitleType;", "Lkotlin/collections/HashMap;", "mTodoChatId", "mUnCompleteAssignToMeData", "mUnCompleteAssignToMeSet", "mUnCompleteAssignToOtherData", "mUnCompleteAssignToOtherSet", "mUnCompleteComparator", "noTodoLabel", "getNoTodoLabel", "setNoTodoLabel", "scrollToListTop", "getScrollToListTop", "setScrollToListTop", "showActiveDialog", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem;", "getShowActiveDialog", "setShowActiveDialog", "showCompleteDialog", "getShowCompleteDialog", "setShowCompleteDialog", "showToast", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoListToastUnit;", "getShowToast", "setShowToast", "todoChatListItem", "", "getTodoChatListItem", "setTodoChatListItem", "activeTodoInMultiStrategy", "", "todoDisplayItem", "activeTodoOutMultiStrategy", "addAssignToMeList", "chatTodoInfo", "addAssignToOtherList", "addTodoIntoChatList", "chatTodo", "changeTodoCompleteStatus", "targetComplete", "completeTodoInMultiStrategy", "completeTodoOutMultiStrategy", "createTodo", "activity", "Landroid/app/Activity;", "fetchCompleteData", "isFirstPage", "generateCompletedItems", "originalDataSet", "originalList", "guid", "completedItems", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "todoResult", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "generateDisplayData", "isFetchData", "isNeedSortData", "getCanLoadMore", "initData", "intent", "Landroid/content/Intent;", "initMidTitleState", "initUnCompleteData", "insertAddedTodoChatInfo", "messageId", "todo", "isInCustomCompleteStrategy", "context", "Landroid/content/Context;", "customComplete", "Lcom/bytedance/lark/pb/todo/v1/CustomComplete$Action;", "isTodoRelativeToMe", "loadMoreTodoDatas", "isForceFetch", "totalItemCount", "mergeAndSortList", "todoList", "mergeCompleteData", "completeTodos", "onAddTodoEvent", "addTodoEvent", "Lcom/ss/android/lark/todo/impl/framework/busevents/AddTodoEvent;", "onCleared", "onConfirmDialogCancelClicked", "onDeleteTodoEvent", "deleteTodoEvent", "Lcom/ss/android/lark/todo/impl/framework/busevents/DeleteTodoEvent;", "onUpdateTodoEvent", "updateTodoEvent", "Lcom/ss/android/lark/todo/impl/framework/busevents/UpdateTodoEvent;", "openTodo", "item", "parseShareResult", "chatId2messageIds", "", "message2threads", "Lcom/bytedance/lark/pb/todo/v1/ShareTodoMessageResponse$Share2ThreadTarget;", "refreshDisplayList", "reloadFirstPageData", "setCompleted", "sortAssignToMeList", "sortAssignToOtherList", "sortCompletedList", "sortUnCompleteList", "dataList", "updateListAfterActive", "updateListAfterComplete", "updateTitleState", "titleType", "expand", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TodoChatListViewModel extends C1150b {
    public static final Companion Companion = new Companion(null);
    private C1177w<Boolean> canFetchMore = new C1177w<>();
    private C1177w<TodoFetchStatus> dataFetchStatus = new C1177w<>();
    public boolean isGetCompleteData;
    public boolean isGetUnCompleteData;
    private final CopyOnWriteArrayList<ChatTodoInfo> mAddedTodoItems = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArraySet<String> mAddedTodoSet = new CopyOnWriteArraySet<>();
    private final IChatModuleDependency mChatDependency = TodoDependencyHolder.f139242a.mo191730a().chatModuleDependency();
    private boolean mChatIsThread;
    private final Comparator<ChatTodoInfo> mCompleteComparator = C56314k.f139360a;
    private final CopyOnWriteArraySet<String> mCompletedPagingDateSet = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArrayList<ChatTodoInfo> mCompletedPagingTodoDataList = new CopyOnWriteArrayList<>();
    private boolean mHasMore = true;
    private long mLastPageOffset;
    private CopyOnWriteArraySet<Integer> mListItemsSet = new CopyOnWriteArraySet<>();
    private final ILoginDependency mLoginDependency = TodoDependencyHolder.f139242a.mo191730a().loginDependency();
    private final AbstractC56259u mTimeFormatDependency = TodoDependencyHolder.f139242a.mo191730a().timeFormatDependency();
    private HashMap<TodoDisplayItem.ChatListTitleType, Boolean> mTitleExpandState = new HashMap<>();
    public String mTodoChatId = "";
    public final CopyOnWriteArrayList<ChatTodoInfo> mUnCompleteAssignToMeData = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArraySet<String> mUnCompleteAssignToMeSet = new CopyOnWriteArraySet<>();
    public final CopyOnWriteArrayList<ChatTodoInfo> mUnCompleteAssignToOtherData = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArraySet<String> mUnCompleteAssignToOtherSet = new CopyOnWriteArraySet<>();
    private final Comparator<ChatTodoInfo> mUnCompleteComparator = C56315l.f139361a;
    private C1177w<Boolean> noTodoLabel = new C1177w<>();
    private C1177w<Boolean> scrollToListTop = new C1177w<>();
    private C1177w<TodoDisplayItem> showActiveDialog = new C1177w<>();
    private C1177w<TodoDisplayItem> showCompleteDialog = new C1177w<>();
    private C1177w<TodoListToastUnit> showToast = new C1177w<>();
    private C1177w<List<TodoDisplayItem>> todoChatListItem = new C1177w<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/chatlist/mvvm/TodoChatListViewModel$Companion;", "", "()V", "ALL_DAY_SECONDS", "", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1177w<Boolean> getCanFetchMore() {
        return this.canFetchMore;
    }

    public boolean getCanLoadMore() {
        return this.mHasMore;
    }

    public C1177w<TodoFetchStatus> getDataFetchStatus() {
        return this.dataFetchStatus;
    }

    public final boolean getMHasMore() {
        return this.mHasMore;
    }

    public final long getMLastPageOffset() {
        return this.mLastPageOffset;
    }

    public C1177w<Boolean> getNoTodoLabel() {
        return this.noTodoLabel;
    }

    public C1177w<Boolean> getScrollToListTop() {
        return this.scrollToListTop;
    }

    public C1177w<TodoDisplayItem> getShowActiveDialog() {
        return this.showActiveDialog;
    }

    public C1177w<TodoDisplayItem> getShowCompleteDialog() {
        return this.showCompleteDialog;
    }

    public C1177w<TodoListToastUnit> getShowToast() {
        return this.showToast;
    }

    public C1177w<List<TodoDisplayItem>> getTodoChatListItem() {
        return this.todoChatListItem;
    }

    public void onConfirmDialogCancelClicked() {
        refreshDisplayList();
    }

    private final void refreshDisplayList() {
        generateDisplayData(false, true);
    }

    private final void sortAssignToMeList() {
        sortUnCompleteList(this.mUnCompleteAssignToMeData);
    }

    private final void sortAssignToOtherList() {
        sortUnCompleteList(this.mUnCompleteAssignToOtherData);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        super.onCleared();
        EventBus.getDefault().unregister(this);
    }

    private final void initUnCompleteData() {
        TodoChatListService.f139313a.mo191828b(this.mTodoChatId, new C56312i(this, String.valueOf(new Date().getTime()), "getUnCompleteData"));
    }

    public void reloadFirstPageData() {
        getDataFetchStatus().mo5929b(TodoFetchStatus.LOADING);
        initUnCompleteData();
        fetchCompleteData(true);
    }

    private final void initMidTitleState() {
        this.mTitleExpandState.put(TodoDisplayItem.ChatListTitleType.ASSIGN_TO_ME, true);
        this.mTitleExpandState.put(TodoDisplayItem.ChatListTitleType.ASSIGN_OTHER, true);
        this.mTitleExpandState.put(TodoDisplayItem.ChatListTitleType.COMPLETED, false);
    }

    private final void sortCompletedList() {
        Object[] array = this.mCompletedPagingTodoDataList.toArray(new ChatTodoInfo[0]);
        if (array != null) {
            ChatTodoInfo[] chatTodoInfoArr = (ChatTodoInfo[]) array;
            List listOf = CollectionsKt.listOf((Object[]) ((ChatTodoInfo[]) Arrays.copyOf(chatTodoInfoArr, chatTodoInfoArr.length)));
            Collections.sort(listOf, this.mCompleteComparator);
            this.mCompletedPagingTodoDataList.clear();
            this.mCompletedPagingTodoDataList.addAll(listOf);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final void setMHasMore(boolean z) {
        this.mHasMore = z;
    }

    public final void setMLastPageOffset(long j) {
        this.mLastPageOffset = j;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/chatlist/mvvm/TodoChatListViewModel$isInCustomCompleteStrategy$1", "Lcom/ss/android/lark/todo/impl/features/common/helper/CustomCompleteHelper$ITipShowListener;", "showTipToast", "", "tipsStr", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel$j */
    public static final class C56313j implements CustomCompleteHelper.ITipShowListener {

        /* renamed from: a */
        final /* synthetic */ TodoChatListViewModel f139359a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56313j(TodoChatListViewModel todoChatListViewModel) {
            this.f139359a = todoChatListViewModel;
        }

        @Override // com.ss.android.lark.todo.impl.features.common.helper.CustomCompleteHelper.ITipShowListener
        /* renamed from: a */
        public void mo191923a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "tipsStr");
            this.f139359a.getShowToast().mo5926a(new TodoListToastUnit(0, OperationToastHelper.ToastType.PROMPT, str));
        }
    }

    public void setCanFetchMore(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.canFetchMore = wVar;
    }

    public void setDataFetchStatus(C1177w<TodoFetchStatus> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.dataFetchStatus = wVar;
    }

    public void setNoTodoLabel(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.noTodoLabel = wVar;
    }

    public void setScrollToListTop(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.scrollToListTop = wVar;
    }

    public void setShowActiveDialog(C1177w<TodoDisplayItem> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.showActiveDialog = wVar;
    }

    public void setShowCompleteDialog(C1177w<TodoDisplayItem> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.showCompleteDialog = wVar;
    }

    public void setShowToast(C1177w<TodoListToastUnit> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.showToast = wVar;
    }

    public void setTodoChatListItem(C1177w<List<TodoDisplayItem>> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.todoChatListItem = wVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/features/chatlist/mvvm/TodoChatListViewModel$createTodo$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "blockId", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel$g */
    public static final class C56310g implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ TodoChatListViewModel f139348a;

        /* renamed from: b */
        final /* synthetic */ Activity f139349b;

        /* renamed from: c */
        final /* synthetic */ String f139350c;

        /* renamed from: d */
        final /* synthetic */ String f139351d;

        /* renamed from: a */
        public void onSuccess(String str) {
            DetailEntrance.f139694a.mo192299a(this.f139349b, str, this.f139348a.mTodoChatId, TodoSceneType.CHAT_TODO_LIST);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("TodoChatListViewModel", LogMessageUtil.f139260a.mo191767a(this.f139350c, this.f139351d, "generateBlockIDFromLocal error!"));
        }

        C56310g(TodoChatListViewModel todoChatListViewModel, Activity activity, String str, String str2) {
            this.f139348a = todoChatListViewModel;
            this.f139349b = activity;
            this.f139350c = str;
            this.f139351d = str2;
        }
    }

    public final void addAssignToMeList(ChatTodoInfo chatTodoInfo) {
        Todo todo = chatTodoInfo.todo;
        if (todo != null) {
            Intrinsics.checkExpressionValueIsNotNull(todo, "chatTodoInfo.todo ?: return");
            if (!this.mUnCompleteAssignToMeSet.contains(todo.guid)) {
                this.mUnCompleteAssignToMeData.add(chatTodoInfo);
                this.mUnCompleteAssignToMeSet.add(todo.guid);
            }
        }
    }

    public final void addAssignToOtherList(ChatTodoInfo chatTodoInfo) {
        Todo todo = chatTodoInfo.todo;
        if (todo != null) {
            Intrinsics.checkExpressionValueIsNotNull(todo, "chatTodoInfo.todo ?: return");
            if (!this.mUnCompleteAssignToOtherSet.contains(todo.guid)) {
                this.mUnCompleteAssignToOtherData.add(chatTodoInfo);
                this.mUnCompleteAssignToOtherSet.add(todo.guid);
            }
        }
    }

    public void setCompleted(TodoDisplayItem todoDisplayItem) {
        Intrinsics.checkParameterIsNotNull(todoDisplayItem, "todoDisplayItem");
        VibrateUtil.f139263a.mo191785a();
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C56317n(this, todoDisplayItem, null), 3, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/features/chatlist/mvvm/TodoChatListViewModel$initUnCompleteData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/todo/impl/features/chatlist/service/item/UnCompleteChatTodosData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "unCompleteData", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel$i */
    public static final class C56312i implements IGetDataCallback<UnCompleteChatTodosData> {

        /* renamed from: a */
        final /* synthetic */ TodoChatListViewModel f139356a;

        /* renamed from: b */
        final /* synthetic */ String f139357b;

        /* renamed from: c */
        final /* synthetic */ String f139358c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("TodoChatListViewModel", LogMessageUtil.f139260a.mo191767a(this.f139357b, this.f139358c, "getUnCompleteData error!"));
            this.f139356a.getDataFetchStatus().mo5926a(TodoFetchStatus.FIRST_PAGE_FAILED);
        }

        /* renamed from: a */
        public void onSuccess(UnCompleteChatTodosData bVar) {
            List<ChatTodoInfo> b;
            List<ChatTodoInfo> a;
            if (!(bVar == null || (a = bVar.mo191838a()) == null)) {
                this.f139356a.mUnCompleteAssignToMeSet.clear();
                this.f139356a.mUnCompleteAssignToMeData.clear();
                for (T t : a) {
                    Todo todo = t.todo;
                    if (todo != null) {
                        Intrinsics.checkExpressionValueIsNotNull(todo, "chatTodoInfo.todo ?: return@forEach");
                        if (MultiCompleteHelper.f139390a.mo191979a(todo) > 0) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(t);
                            this.f139356a.mergeAndSortList(arrayList);
                        } else {
                            this.f139356a.addAssignToMeList(t);
                        }
                    }
                }
            }
            if (!(bVar == null || (b = bVar.mo191839b()) == null)) {
                this.f139356a.mUnCompleteAssignToOtherData.clear();
                for (T t2 : b) {
                    Todo todo2 = t2.todo;
                    if (todo2 != null) {
                        Intrinsics.checkExpressionValueIsNotNull(todo2, "chatTodoInfo.todo ?: return@forEach");
                        if (MultiCompleteHelper.f139390a.mo191979a(todo2) > 0) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(t2);
                            this.f139356a.mergeAndSortList(arrayList2);
                        } else {
                            this.f139356a.addAssignToOtherList(t2);
                        }
                    }
                }
            }
            this.f139356a.isGetUnCompleteData = true;
            this.f139356a.generateDisplayData(true, true);
        }

        C56312i(TodoChatListViewModel todoChatListViewModel, String str, String str2) {
            this.f139356a = todoChatListViewModel;
            this.f139357b = str;
            this.f139358c = str2;
        }
    }

    private final void addTodoIntoChatList(ChatTodoInfo chatTodoInfo) {
        Todo todo = chatTodoInfo.todo;
        if (todo != null) {
            Intrinsics.checkExpressionValueIsNotNull(todo, "chatTodo.todo ?: return");
            if (!this.mAddedTodoSet.contains(todo.guid)) {
                this.mAddedTodoItems.add(0, chatTodoInfo);
                this.mAddedTodoSet.add(todo.guid);
                refreshDisplayList();
                getScrollToListTop().mo5926a((Boolean) true);
            }
        }
    }

    private final void sortUnCompleteList(CopyOnWriteArrayList<ChatTodoInfo> copyOnWriteArrayList) {
        Object[] array = copyOnWriteArrayList.toArray(new ChatTodoInfo[0]);
        if (array != null) {
            ChatTodoInfo[] chatTodoInfoArr = (ChatTodoInfo[]) array;
            List listOf = CollectionsKt.listOf((Object[]) ((ChatTodoInfo[]) Arrays.copyOf(chatTodoInfoArr, chatTodoInfoArr.length)));
            Collections.sort(listOf, this.mUnCompleteComparator);
            copyOnWriteArrayList.clear();
            copyOnWriteArrayList.addAll(listOf);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final void activeTodoInMultiStrategy(TodoDisplayItem todoDisplayItem) {
        if (todoDisplayItem.mo193175k() != MultiCompleteHelper.MultiCompleteType.NOT_COMPLETE) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a());
            Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56305b(this, todoDisplayItem, arrayList, null), 2, null);
        }
    }

    public final void activeTodoOutMultiStrategy(TodoDisplayItem todoDisplayItem) {
        String str;
        TodoGeneralHitPoint aVar = TodoGeneralHitPoint.f141070a;
        String e = todoDisplayItem.mo193167e();
        TodoChatItem p = todoDisplayItem.mo193180p();
        if (p == null || (str = p.mo193200c()) == null) {
            str = "";
        }
        aVar.mo194178a(e, str, false, "done_task");
        TodoHitPoint.m221744b(todoDisplayItem.mo193167e());
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56306c(this, todoDisplayItem, null), 2, null);
    }

    public final void completeTodoInMultiStrategy(TodoDisplayItem todoDisplayItem) {
        if (todoDisplayItem.mo193175k() != MultiCompleteHelper.MultiCompleteType.NOT_COMPLETE) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a());
            Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56308e(this, todoDisplayItem, arrayList, null), 2, null);
        }
    }

    public final void completeTodoOutMultiStrategy(TodoDisplayItem todoDisplayItem) {
        String str;
        TodoGeneralHitPoint aVar = TodoGeneralHitPoint.f141070a;
        String e = todoDisplayItem.mo193167e();
        TodoChatItem p = todoDisplayItem.mo193180p();
        if (p == null || (str = p.mo193200c()) == null) {
            str = "";
        }
        aVar.mo194178a(e, str, true, "done_task");
        TodoHitPoint.m221731a(todoDisplayItem.mo193167e(), "chat_todo_list");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56309f(this, todoDisplayItem, null), 2, null);
    }

    public void createTodo(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        String valueOf = String.valueOf(new Date().getTime());
        TodoHitPoint.m221757j("chat_todo_list");
        TodoGeneralHitPoint.f141070a.mo194203g(this.mTodoChatId);
        TodoDependencyHolder.f139242a.mo191730a().blockitDependency().mo145367a(Domain.chat, this.mTodoChatId, BlockTypeID.CHAT, new C56310g(this, activity, valueOf, "generateBlockIDFromLocal"));
    }

    public void fetchCompleteData(boolean z) {
        if (!z) {
            TodoAppreciableHitPoint.f141058a.mo194168v();
        }
        TodoChatListService.f139313a.mo191826a(this.mTodoChatId, this.mLastPageOffset, new C56311h(this, z, String.valueOf(new Date().getTime()), "fetchCompleteData"));
    }

    @Subscribe
    public final void onAddTodoEvent(AddTodoEvent aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "addTodoEvent");
        TodoGeneralHitPoint.f141070a.mo194205h(this.mTodoChatId);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.mTodoChatId);
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56316m(this, aVar, arrayList, null), 2, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel$activeTodoOutMultiStrategy$1", mo239173f = "TodoChatListViewModel.kt", mo239174i = {0}, mo239175l = {710}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel$c */
    public static final class C56306c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TodoDisplayItem $todoDisplayItem;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoChatListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56306c(TodoChatListViewModel todoChatListViewModel, TodoDisplayItem todoDisplayItem, Continuation cVar) {
            super(2, cVar);
            this.this$0 = todoChatListViewModel;
            this.$todoDisplayItem = todoDisplayItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56306c cVar2 = new C56306c(this.this$0, this.$todoDisplayItem, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56306c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                String e = this.$todoDisplayItem.mo193167e();
                TodoSource x = this.$todoDisplayItem.mo193189x();
                MarkTodoCompletedRequest.Type type = MarkTodoCompletedRequest.Type.Todo;
                this.L$0 = ahVar;
                this.label = 1;
                obj = TodoRustCRUD.m221863a(fVar, e, false, x, type, null, this, 16, null);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkResponse bVar = (SdkResponse) obj;
            if (bVar.mo194251a() == null) {
                return Unit.INSTANCE;
            }
            this.this$0.updateListAfterActive(this.$todoDisplayItem, (Todo) bVar.mo194251a());
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel$completeTodoOutMultiStrategy$1", mo239173f = "TodoChatListViewModel.kt", mo239174i = {0}, mo239175l = {664}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel$f */
    public static final class C56309f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TodoDisplayItem $todoDisplayItem;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoChatListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56309f(TodoChatListViewModel todoChatListViewModel, TodoDisplayItem todoDisplayItem, Continuation cVar) {
            super(2, cVar);
            this.this$0 = todoChatListViewModel;
            this.$todoDisplayItem = todoDisplayItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56309f fVar = new C56309f(this.this$0, this.$todoDisplayItem, cVar);
            fVar.p$ = (CoroutineScope) obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56309f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                String e = this.$todoDisplayItem.mo193167e();
                this.L$0 = ahVar;
                this.label = 1;
                obj = TodoRustCRUD.m221863a(fVar, e, true, null, null, null, this, 28, null);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkResponse bVar = (SdkResponse) obj;
            if (bVar.mo194251a() == null) {
                return Unit.INSTANCE;
            }
            this.this$0.updateListAfterComplete(this.$todoDisplayItem, (Todo) bVar.mo194251a());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/features/chatlist/mvvm/TodoChatListViewModel$fetchCompleteData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/todo/impl/features/chatlist/service/item/CompleteChatTodosData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "dataUnComplete", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel$h */
    public static final class C56311h implements IGetDataCallback<CompleteChatTodosData> {

        /* renamed from: a */
        final /* synthetic */ TodoChatListViewModel f139352a;

        /* renamed from: b */
        final /* synthetic */ boolean f139353b;

        /* renamed from: c */
        final /* synthetic */ String f139354c;

        /* renamed from: d */
        final /* synthetic */ String f139355d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            LogMessageUtil cVar = LogMessageUtil.f139260a;
            String str = this.f139354c;
            String str2 = this.f139355d;
            Log.m165383e("TodoChatListViewModel", cVar.mo191767a(str, str2, "fetchCompleteData error! isFirstPage: " + this.f139353b));
            if (this.f139353b) {
                this.f139352a.getDataFetchStatus().mo5926a(TodoFetchStatus.FIRST_PAGE_FAILED);
                TodoAppreciableHitPoint.f141058a.mo194154i(errorResult);
                return;
            }
            this.f139352a.getDataFetchStatus().mo5926a(TodoFetchStatus.NEXT_PAGE_FAILED);
            TodoAppreciableHitPoint.f141058a.mo194156j(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(CompleteChatTodosData aVar) {
            int i;
            List<ChatTodoInfo> a;
            Long b;
            Boolean c;
            List<ChatTodoInfo> a2;
            if (!(aVar == null || (a2 = aVar.mo191832a()) == null)) {
                ArrayList arrayList = new ArrayList();
                ArrayList<ChatTodoInfo> arrayList2 = new ArrayList();
                for (T t : a2) {
                    if (MultiCompleteHelper.f139390a.mo191979a(t.todo) == 0) {
                        arrayList2.add(t);
                    } else {
                        arrayList.add(t);
                    }
                }
                this.f139352a.mergeCompleteData(this.f139353b, a2);
                for (ChatTodoInfo chatTodoInfo : arrayList2) {
                    Todo todo = chatTodoInfo.todo;
                    if (todo != null) {
                        Intrinsics.checkExpressionValueIsNotNull(todo, "chatTodoInfo.todo ?: return@forEach");
                        if (this.f139352a.isTodoRelativeToMe(todo)) {
                            this.f139352a.addAssignToMeList(chatTodoInfo);
                        } else {
                            this.f139352a.addAssignToOtherList(chatTodoInfo);
                        }
                    }
                }
            }
            if (!(aVar == null || (c = aVar.mo191834c()) == null)) {
                this.f139352a.setMHasMore(c.booleanValue());
            }
            if (!(aVar == null || (b = aVar.mo191833b()) == null)) {
                this.f139352a.setMLastPageOffset(b.longValue());
            }
            this.f139352a.isGetCompleteData = true;
            this.f139352a.generateDisplayData(true, true);
            if (!this.f139353b) {
                TodoAppreciableHitPoint aVar2 = TodoAppreciableHitPoint.f141058a;
                if (aVar == null || (a = aVar.mo191832a()) == null) {
                    i = 0;
                } else {
                    i = a.size();
                }
                aVar2.mo194145e(i);
            }
        }

        C56311h(TodoChatListViewModel todoChatListViewModel, boolean z, String str, String str2) {
            this.f139352a = todoChatListViewModel;
            this.f139353b = z;
            this.f139354c = str;
            this.f139355d = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel$onAddTodoEvent$1", mo239173f = "TodoChatListViewModel.kt", mo239174i = {0}, mo239175l = {545}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel$m */
    static final class C56316m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AddTodoEvent $addTodoEvent;
        final /* synthetic */ ArrayList $shareChatIds;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoChatListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56316m(TodoChatListViewModel todoChatListViewModel, AddTodoEvent aVar, ArrayList arrayList, Continuation cVar) {
            super(2, cVar);
            this.this$0 = todoChatListViewModel;
            this.$addTodoEvent = aVar;
            this.$shareChatIds = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56316m mVar = new C56316m(this.this$0, this.$addTodoEvent, this.$shareChatIds, cVar);
            mVar.p$ = (CoroutineScope) obj;
            return mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56316m) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                String str = this.$addTodoEvent.mo194120a().guid;
                Intrinsics.checkExpressionValueIsNotNull(str, "addTodoEvent.todo.guid");
                ShareTodoMessageRequest.ShareType shareType = ShareTodoMessageRequest.ShareType.CREATE;
                this.L$0 = ahVar;
                this.label = 1;
                obj = fVar.mo194308a(str, this.$shareChatIds, shareType, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ShareTodoMessageResponse shareTodoMessageResponse = (ShareTodoMessageResponse) obj;
            if (shareTodoMessageResponse != null) {
                this.this$0.parseShareResult(shareTodoMessageResponse.chat_id2message_ids, shareTodoMessageResponse.message2threads, this.$addTodoEvent.mo194120a());
            } else {
                this.this$0.getShowToast().mo5926a(new TodoListToastUnit(R.string.Todo_Task_FailToShare, OperationToastHelper.ToastType.FAIL, null, 4, null));
                this.this$0.insertAddedTodoChatInfo("", this.$addTodoEvent.mo194120a());
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel$setCompleted$1", mo239173f = "TodoChatListViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel$n */
    public static final class C56317n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TodoDisplayItem $todoDisplayItem;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoChatListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56317n(TodoChatListViewModel todoChatListViewModel, TodoDisplayItem todoDisplayItem, Continuation cVar) {
            super(2, cVar);
            this.this$0 = todoChatListViewModel;
            this.$todoDisplayItem = todoDisplayItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56317n nVar = new C56317n(this.this$0, this.$todoDisplayItem, cVar);
            nVar.p$ = (CoroutineScope) obj;
            return nVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56317n) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                if (this.$todoDisplayItem.mo193171h()) {
                    if (!MultiCompleteHelper.f139390a.mo191984a(this.$todoDisplayItem.mo193189x())) {
                        this.this$0.activeTodoOutMultiStrategy(this.$todoDisplayItem);
                    } else {
                        this.this$0.activeTodoInMultiStrategy(this.$todoDisplayItem);
                    }
                    return Unit.INSTANCE;
                }
                if (!MultiCompleteHelper.f139390a.mo191984a(this.$todoDisplayItem.mo193189x())) {
                    this.this$0.completeTodoOutMultiStrategy(this.$todoDisplayItem);
                } else {
                    this.this$0.completeTodoInMultiStrategy(this.$todoDisplayItem);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public void initData(Intent intent) {
        String string;
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        Bundle extras = intent.getExtras();
        String str = "";
        if (!(extras == null || (string = extras.getString("key_from_chat", str)) == null)) {
            str = string;
        }
        this.mTodoChatId = str;
        Bundle extras2 = intent.getExtras();
        boolean z = false;
        if (extras2 != null) {
            z = extras2.getBoolean("key_is_thread", false);
        }
        this.mChatIsThread = z;
        getDataFetchStatus().mo5929b(TodoFetchStatus.LOADING);
        initMidTitleState();
        initUnCompleteData();
        fetchCompleteData(true);
        TodoGeneralHitPoint.f141070a.mo194201f(this.mTodoChatId);
    }

    public final boolean isTodoRelativeToMe(Todo todo) {
        ArrayList arrayList;
        List<TodoAssignee> list = todo.assignees;
        if (list != null) {
            List<TodoAssignee> list2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().assignee_id);
            }
            arrayList = arrayList2;
        } else {
            arrayList = new ArrayList();
        }
        if (arrayList.contains(this.mLoginDependency.mo145411a()) || (Intrinsics.areEqual(todo.creator_id, this.mLoginDependency.mo145411a()) && arrayList.isEmpty())) {
            return true;
        }
        return false;
    }

    public final void mergeAndSortList(List<ChatTodoInfo> list) {
        String str;
        String str2;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Todo todo = list.get(i).todo;
            if (!(todo == null || (str = todo.guid) == null)) {
                if (!this.mCompletedPagingDateSet.contains(str)) {
                    this.mCompletedPagingDateSet.add(str);
                    this.mCompletedPagingTodoDataList.add(list.get(i));
                } else {
                    int size2 = this.mCompletedPagingTodoDataList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        Todo todo2 = this.mCompletedPagingTodoDataList.get(i2).todo;
                        if (todo2 != null) {
                            str2 = todo2.guid;
                        } else {
                            str2 = null;
                        }
                        if (Intrinsics.areEqual(str2, str)) {
                            this.mCompletedPagingTodoDataList.set(i2, list.get(i));
                        }
                    }
                }
            }
        }
        sortCompletedList();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel$activeTodoInMultiStrategy$1", mo239173f = "TodoChatListViewModel.kt", mo239174i = {0}, mo239175l = {694}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel$b */
    public static final class C56305b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ArrayList $operationList;
        final /* synthetic */ TodoDisplayItem $todoDisplayItem;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoChatListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56305b(TodoChatListViewModel todoChatListViewModel, TodoDisplayItem todoDisplayItem, ArrayList arrayList, Continuation cVar) {
            super(2, cVar);
            this.this$0 = todoChatListViewModel;
            this.$todoDisplayItem = todoDisplayItem;
            this.$operationList = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56305b bVar = new C56305b(this.this$0, this.$todoDisplayItem, this.$operationList, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56305b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                int i2 = C56322b.f139368b[this.$todoDisplayItem.mo193175k().ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        this.this$0.changeTodoCompleteStatus(false, this.$todoDisplayItem);
                    } else {
                        this.this$0.getShowActiveDialog().mo5926a(this.$todoDisplayItem);
                    }
                    return Unit.INSTANCE;
                }
                TodoGeneralHitPoint aVar = TodoGeneralHitPoint.f141070a;
                String e = this.$todoDisplayItem.mo193167e();
                TodoChatItem p = this.$todoDisplayItem.mo193180p();
                if (p == null || (str = p.mo193200c()) == null) {
                    str = "";
                }
                aVar.mo194178a(e, str, false, "done_my_task");
                this.L$0 = ahVar;
                this.label = 1;
                obj = TodoRustCRUD.f141115a.mo194311a(this.$todoDisplayItem.mo193167e(), false, this.$todoDisplayItem.mo193189x(), MarkTodoCompletedRequest.Type.USER, this.$operationList, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkResponse bVar = (SdkResponse) obj;
            if (bVar.mo194251a() == null) {
                return Unit.INSTANCE;
            }
            this.this$0.updateListAfterActive(this.$todoDisplayItem, (Todo) bVar.mo194251a());
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel$changeTodoCompleteStatus$1", mo239173f = "TodoChatListViewModel.kt", mo239174i = {0}, mo239175l = {772}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel$d */
    public static final class C56307d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $targetComplete;
        final /* synthetic */ TodoDisplayItem $todoDisplayItem;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoChatListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56307d(TodoChatListViewModel todoChatListViewModel, TodoDisplayItem todoDisplayItem, boolean z, Continuation cVar) {
            super(2, cVar);
            this.this$0 = todoChatListViewModel;
            this.$todoDisplayItem = todoDisplayItem;
            this.$targetComplete = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56307d dVar = new C56307d(this.this$0, this.$todoDisplayItem, this.$targetComplete, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56307d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            String str;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoGeneralHitPoint aVar = TodoGeneralHitPoint.f141070a;
                String e = this.$todoDisplayItem.mo193167e();
                TodoChatItem p = this.$todoDisplayItem.mo193180p();
                if (p == null || (str = p.mo193200c()) == null) {
                    str = "";
                }
                aVar.mo194178a(e, str, this.$targetComplete, "done_all_task");
                TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                String e2 = this.$todoDisplayItem.mo193167e();
                boolean z = this.$targetComplete;
                TodoSource x = this.$todoDisplayItem.mo193189x();
                MarkTodoCompletedRequest.Type type = MarkTodoCompletedRequest.Type.Todo;
                this.L$0 = ahVar;
                this.label = 1;
                obj2 = TodoRustCRUD.m221863a(fVar, e2, z, x, type, null, this, 16, null);
                if (obj2 == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkResponse bVar = (SdkResponse) obj2;
            if (bVar.mo194251a() == null) {
                return Unit.INSTANCE;
            }
            if (!this.$targetComplete) {
                this.this$0.updateListAfterActive(this.$todoDisplayItem, (Todo) bVar.mo194251a());
            } else {
                this.this$0.updateListAfterComplete(this.$todoDisplayItem, (Todo) bVar.mo194251a());
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel$completeTodoInMultiStrategy$1", mo239173f = "TodoChatListViewModel.kt", mo239174i = {0}, mo239175l = {648}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel$e */
    public static final class C56308e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ArrayList $operationList;
        final /* synthetic */ TodoDisplayItem $todoDisplayItem;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoChatListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56308e(TodoChatListViewModel todoChatListViewModel, TodoDisplayItem todoDisplayItem, ArrayList arrayList, Continuation cVar) {
            super(2, cVar);
            this.this$0 = todoChatListViewModel;
            this.$todoDisplayItem = todoDisplayItem;
            this.$operationList = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56308e eVar = new C56308e(this.this$0, this.$todoDisplayItem, this.$operationList, cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56308e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                int i2 = C56322b.f139367a[this.$todoDisplayItem.mo193175k().ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        this.this$0.changeTodoCompleteStatus(true, this.$todoDisplayItem);
                    } else {
                        this.this$0.getShowCompleteDialog().mo5926a(this.$todoDisplayItem);
                    }
                    return Unit.INSTANCE;
                }
                TodoGeneralHitPoint aVar = TodoGeneralHitPoint.f141070a;
                String e = this.$todoDisplayItem.mo193167e();
                TodoChatItem p = this.$todoDisplayItem.mo193180p();
                if (p == null || (str = p.mo193200c()) == null) {
                    str = "";
                }
                aVar.mo194178a(e, str, true, "done_my_task");
                this.L$0 = ahVar;
                this.label = 1;
                obj = TodoRustCRUD.f141115a.mo194311a(this.$todoDisplayItem.mo193167e(), true, this.$todoDisplayItem.mo193189x(), MarkTodoCompletedRequest.Type.USER, this.$operationList, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkResponse bVar = (SdkResponse) obj;
            if (bVar.mo194251a() == null) {
                return Unit.INSTANCE;
            }
            this.this$0.updateListAfterComplete(this.$todoDisplayItem, (Todo) bVar.mo194251a());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoChatListViewModel(Application application) {
        super(application);
        Intrinsics.checkParameterIsNotNull(application, "application");
        EventBus.getDefault().register(this);
    }

    @Subscribe
    public final void onDeleteTodoEvent(DeleteTodoEvent dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "deleteTodoEvent");
        String a = dVar.mo194125a();
        this.mAddedTodoSet.remove(a);
        CopyOnWriteArrayList<ChatTodoInfo> copyOnWriteArrayList = this.mAddedTodoItems;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            Todo todo = next.todo;
            if (todo != null) {
                str = todo.guid;
            }
            if (Intrinsics.areEqual(str, a)) {
                arrayList.add(next);
            }
        }
        copyOnWriteArrayList.removeAll(arrayList);
        this.mUnCompleteAssignToMeSet.remove(a);
        CopyOnWriteArrayList<ChatTodoInfo> copyOnWriteArrayList2 = this.mUnCompleteAssignToMeData;
        ArrayList arrayList2 = new ArrayList();
        for (T t : copyOnWriteArrayList2) {
            Todo todo2 = t.todo;
            if (Intrinsics.areEqual(todo2 != null ? todo2.guid : null, a)) {
                arrayList2.add(t);
            }
        }
        copyOnWriteArrayList2.removeAll(arrayList2);
        this.mUnCompleteAssignToOtherSet.remove(a);
        CopyOnWriteArrayList<ChatTodoInfo> copyOnWriteArrayList3 = this.mUnCompleteAssignToOtherData;
        ArrayList arrayList3 = new ArrayList();
        for (T t2 : copyOnWriteArrayList3) {
            Todo todo3 = t2.todo;
            if (Intrinsics.areEqual(todo3 != null ? todo3.guid : null, a)) {
                arrayList3.add(t2);
            }
        }
        copyOnWriteArrayList3.removeAll(arrayList3);
        this.mCompletedPagingDateSet.remove(a);
        CopyOnWriteArrayList<ChatTodoInfo> copyOnWriteArrayList4 = this.mCompletedPagingTodoDataList;
        ArrayList arrayList4 = new ArrayList();
        for (T t3 : copyOnWriteArrayList4) {
            Todo todo4 = t3.todo;
            if (Intrinsics.areEqual(todo4 != null ? todo4.guid : null, a)) {
                arrayList4.add(t3);
            }
        }
        copyOnWriteArrayList4.removeAll(arrayList4);
        refreshDisplayList();
    }

    @Subscribe
    public final void onUpdateTodoEvent(UpdateTodoEvent fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "updateTodoEvent");
        String str = fVar.mo194127a().guid;
        int size = this.mAddedTodoItems.size();
        int i = 0;
        while (true) {
            String str2 = null;
            if (i < size) {
                ChatTodoInfo chatTodoInfo = this.mAddedTodoItems.get(i);
                Todo todo = chatTodoInfo.todo;
                if (todo != null) {
                    str2 = todo.guid;
                }
                if (Intrinsics.areEqual(str2, str)) {
                    ChatTodoInfo a = chatTodoInfo.newBuilder().mo66196a(fVar.mo194127a()).build();
                    if (MultiCompleteHelper.f139390a.mo191979a(fVar.mo194127a()) > 0) {
                        this.mAddedTodoSet.remove(fVar.mo194127a().guid);
                        this.mAddedTodoItems.remove(i);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(a);
                        mergeAndSortList(arrayList);
                    } else {
                        this.mAddedTodoItems.set(i, a);
                    }
                    refreshDisplayList();
                    return;
                }
                i++;
            } else {
                int size2 = this.mUnCompleteAssignToMeData.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ChatTodoInfo chatTodoInfo2 = this.mUnCompleteAssignToMeData.get(i2);
                    Todo todo2 = chatTodoInfo2.todo;
                    if (Intrinsics.areEqual(todo2 != null ? todo2.guid : null, str)) {
                        ChatTodoInfo a2 = chatTodoInfo2.newBuilder().mo66196a(fVar.mo194127a()).build();
                        if (MultiCompleteHelper.f139390a.mo191979a(fVar.mo194127a()) > 0) {
                            this.mUnCompleteAssignToMeSet.remove(fVar.mo194127a().guid);
                            this.mUnCompleteAssignToMeData.remove(i2);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(a2);
                            mergeAndSortList(arrayList2);
                        } else if (isTodoRelativeToMe(fVar.mo194127a())) {
                            this.mUnCompleteAssignToMeData.set(i2, a2);
                        } else {
                            this.mUnCompleteAssignToMeSet.remove(fVar.mo194127a().guid);
                            this.mUnCompleteAssignToMeData.remove(i2);
                            Intrinsics.checkExpressionValueIsNotNull(a2, "todoChatInfo");
                            addAssignToOtherList(a2);
                        }
                        refreshDisplayList();
                        return;
                    }
                }
                int size3 = this.mUnCompleteAssignToOtherData.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ChatTodoInfo chatTodoInfo3 = this.mUnCompleteAssignToOtherData.get(i3);
                    Todo todo3 = chatTodoInfo3.todo;
                    if (Intrinsics.areEqual(todo3 != null ? todo3.guid : null, str)) {
                        ChatTodoInfo a3 = chatTodoInfo3.newBuilder().mo66196a(fVar.mo194127a()).build();
                        if (MultiCompleteHelper.f139390a.mo191979a(fVar.mo194127a()) > 0) {
                            this.mUnCompleteAssignToOtherSet.remove(fVar.mo194127a().guid);
                            this.mUnCompleteAssignToOtherData.remove(i3);
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(a3);
                            mergeAndSortList(arrayList3);
                        } else if (isTodoRelativeToMe(fVar.mo194127a())) {
                            this.mUnCompleteAssignToOtherSet.remove(fVar.mo194127a().guid);
                            this.mUnCompleteAssignToOtherData.remove(i3);
                            Intrinsics.checkExpressionValueIsNotNull(a3, "todoChatInfo");
                            addAssignToMeList(a3);
                        } else {
                            this.mUnCompleteAssignToOtherData.set(i3, a3);
                        }
                        refreshDisplayList();
                        return;
                    }
                }
                int size4 = this.mCompletedPagingTodoDataList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ChatTodoInfo chatTodoInfo4 = this.mCompletedPagingTodoDataList.get(i4);
                    Todo todo4 = chatTodoInfo4.todo;
                    if (Intrinsics.areEqual(todo4 != null ? todo4.guid : null, str)) {
                        ChatTodoInfo a4 = chatTodoInfo4.newBuilder().mo66196a(fVar.mo194127a()).build();
                        if (MultiCompleteHelper.f139390a.mo191979a(fVar.mo194127a()) > 0) {
                            this.mCompletedPagingTodoDataList.set(i4, a4);
                            sortCompletedList();
                        } else {
                            this.mCompletedPagingTodoDataList.remove(i4);
                            if (isTodoRelativeToMe(fVar.mo194127a())) {
                                Intrinsics.checkExpressionValueIsNotNull(a4, "todoChatInfo");
                                addAssignToMeList(a4);
                            } else {
                                Intrinsics.checkExpressionValueIsNotNull(a4, "todoChatInfo");
                                addAssignToOtherList(a4);
                            }
                        }
                        refreshDisplayList();
                        return;
                    }
                }
                return;
            }
        }
    }

    public final void mergeCompleteData(boolean z, List<ChatTodoInfo> list) {
        if (z) {
            this.mCompletedPagingDateSet.clear();
            this.mCompletedPagingTodoDataList.clear();
        }
        mergeAndSortList(list);
    }

    public void changeTodoCompleteStatus(boolean z, TodoDisplayItem todoDisplayItem) {
        Intrinsics.checkParameterIsNotNull(todoDisplayItem, "todoDisplayItem");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C56307d(this, todoDisplayItem, z, null), 3, null);
    }

    public boolean isInCustomCompleteStrategy(Context context, CustomComplete.Action action) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (action != null) {
            return CustomCompleteHelper.f139396a.mo191997a(context, action, new C56313j(this));
        }
        return false;
    }

    public void loadMoreTodoDatas(boolean z, int i) {
        if (z) {
            fetchCompleteData(false);
        } else if (!this.mListItemsSet.contains(Integer.valueOf(i))) {
            fetchCompleteData(false);
            this.mListItemsSet.add(Integer.valueOf(i));
        }
    }

    public void openTodo(Context context, TodoDisplayItem todoDisplayItem) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(todoDisplayItem, "item");
        DetailEntrance.m220107a(DetailEntrance.f139694a, context, todoDisplayItem.mo193167e(), false, this.mTodoChatId, (String) null, (String) null, (String) null, (int) SmEvents.EVENT_NE_RR, (Object) null);
        TodoHitPoint.m221748c("chat_todo_list", todoDisplayItem.mo193167e());
    }

    public final void updateListAfterComplete(TodoDisplayItem todoDisplayItem, Todo todo) {
        ArrayList<ChatTodoInfo> arrayList = new ArrayList<>();
        generateCompletedItems(this.mAddedTodoSet, this.mAddedTodoItems, todoDisplayItem.mo193167e(), arrayList, todo);
        generateCompletedItems(this.mUnCompleteAssignToMeSet, this.mUnCompleteAssignToMeData, todoDisplayItem.mo193167e(), arrayList, todo);
        generateCompletedItems(this.mUnCompleteAssignToOtherSet, this.mUnCompleteAssignToOtherData, todoDisplayItem.mo193167e(), arrayList, todo);
        mergeAndSortList(arrayList);
        this.mTitleExpandState.put(TodoDisplayItem.ChatListTitleType.COMPLETED, true);
        refreshDisplayList();
    }

    public void updateTitleState(TodoDisplayItem.ChatListTitleType chatListTitleType, boolean z) {
        Intrinsics.checkParameterIsNotNull(chatListTitleType, "titleType");
        this.mTitleExpandState.put(chatListTitleType, Boolean.valueOf(z));
        generateDisplayData(false, false);
        getCanFetchMore().mo5929b(this.mTitleExpandState.get(TodoDisplayItem.ChatListTitleType.COMPLETED));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "s1", "Lcom/bytedance/lark/pb/todo/v1/ChatTodoInfo;", "kotlin.jvm.PlatformType", "s2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel$k */
    static final class C56314k<T> implements Comparator<ChatTodoInfo> {

        /* renamed from: a */
        public static final C56314k f139360a = new C56314k();

        C56314k() {
        }

        /* renamed from: a */
        public final int compare(ChatTodoInfo chatTodoInfo, ChatTodoInfo chatTodoInfo2) {
            long j;
            long j2;
            int i;
            Long l;
            Long l2;
            Todo todo = chatTodoInfo.todo;
            if (todo == null || (l2 = todo.create_milli_time) == null) {
                j = 0;
            } else {
                j = l2.longValue();
            }
            Todo todo2 = chatTodoInfo2.todo;
            if (todo2 == null || (l = todo2.create_milli_time) == null) {
                j2 = 0;
            } else {
                j2 = l.longValue();
            }
            if (MultiCompleteHelper.f139390a.mo191979a(chatTodoInfo.todo) - MultiCompleteHelper.f139390a.mo191979a(chatTodoInfo2.todo) >= 0) {
                if (MultiCompleteHelper.f139390a.mo191979a(chatTodoInfo.todo) - MultiCompleteHelper.f139390a.mo191979a(chatTodoInfo2.todo) != 0 || j - j2 > 0) {
                    return -1;
                }
                if (i == 0) {
                    return 0;
                }
            }
            return 1;
        }
    }

    public final void generateDisplayData(boolean z, boolean z2) {
        if (this.isGetCompleteData && this.isGetUnCompleteData) {
            if (z2) {
                sortAssignToMeList();
                sortAssignToOtherList();
            }
            List<TodoDisplayItem> a = TodoChatListHelper.f139310a.mo191825a(ResUtil.f139261a.mo191776a(), this.mUnCompleteAssignToMeData, this.mUnCompleteAssignToOtherData, this.mCompletedPagingTodoDataList, this.mTimeFormatDependency.mo145434b(), this.mTitleExpandState, this.mAddedTodoItems, this.mTodoChatId, this.mChatIsThread);
            List<TodoDisplayItem> list = a;
            if (!list.isEmpty()) {
                a.get(a.size() - 1).mo193159a(true);
                a.get(0).mo193162b(true);
            }
            if (z) {
                getDataFetchStatus().mo5926a(TodoFetchStatus.SUCCESS);
            }
            getNoTodoLabel().mo5926a(Boolean.valueOf(CollectionUtils.isEmpty(list)));
            getTodoChatListItem().mo5926a(a);
            TodoAppreciableHitPoint.f141058a.mo194142d(a.size());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "s1", "Lcom/bytedance/lark/pb/todo/v1/ChatTodoInfo;", "kotlin.jvm.PlatformType", "s2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel$l */
    static final class C56315l<T> implements Comparator<ChatTodoInfo> {

        /* renamed from: a */
        public static final C56315l f139361a = new C56315l();

        C56315l() {
        }

        /* renamed from: a */
        public final int compare(ChatTodoInfo chatTodoInfo, ChatTodoInfo chatTodoInfo2) {
            long j;
            Boolean bool;
            long j2;
            long j3;
            long j4;
            Long l;
            Long l2;
            Long l3;
            Long l4;
            Todo todo = chatTodoInfo.todo;
            if (todo == null || (l4 = todo.due_time) == null) {
                j = 0;
            } else {
                j = l4.longValue();
            }
            long j5 = Long.MAX_VALUE;
            if (j == 0) {
                j = Long.MAX_VALUE;
            }
            Todo todo2 = chatTodoInfo.todo;
            Boolean bool2 = null;
            if (todo2 != null) {
                bool = todo2.is_all_day;
            } else {
                bool = null;
            }
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                j += (long) 86399;
            }
            Todo todo3 = chatTodoInfo2.todo;
            if (todo3 == null || (l3 = todo3.due_time) == null) {
                j2 = 0;
            } else {
                j2 = l3.longValue();
            }
            if (j2 != 0) {
                j5 = j2;
            }
            Todo todo4 = chatTodoInfo2.todo;
            if (todo4 != null) {
                bool2 = todo4.is_all_day;
            }
            if (Intrinsics.areEqual((Object) bool2, (Object) true)) {
                j5 += (long) 86399;
            }
            Todo todo5 = chatTodoInfo.todo;
            if (todo5 == null || (l2 = todo5.create_milli_time) == null) {
                j3 = 0;
            } else {
                j3 = l2.longValue();
            }
            Todo todo6 = chatTodoInfo2.todo;
            if (todo6 == null || (l = todo6.create_milli_time) == null) {
                j4 = 0;
            } else {
                j4 = l.longValue();
            }
            int i = ((j - j5) > 0 ? 1 : ((j - j5) == 0 ? 0 : -1));
            if (i >= 0) {
                if (i != 0) {
                    return 1;
                }
                int i2 = ((j3 - j4) > 0 ? 1 : ((j3 - j4) == 0 ? 0 : -1));
                if (i2 <= 0) {
                    if (i2 == 0) {
                        return 0;
                    }
                    return 1;
                }
            }
            return -1;
        }
    }

    public final void updateListAfterActive(TodoDisplayItem todoDisplayItem, Todo todo) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.mCompletedPagingTodoDataList.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            Todo todo2 = next.todo;
            if (todo2 != null) {
                str = todo2.guid;
            }
            if (Intrinsics.areEqual(str, todoDisplayItem.mo193167e())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = arrayList2;
        if (!arrayList3.isEmpty()) {
            this.mCompletedPagingTodoDataList.removeAll(arrayList3);
            CopyOnWriteArraySet<String> copyOnWriteArraySet = this.mCompletedPagingDateSet;
            ArrayList<ChatTodoInfo> arrayList4 = arrayList2;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
            for (ChatTodoInfo chatTodoInfo : arrayList4) {
                Todo todo3 = chatTodoInfo.todo;
                arrayList5.add(todo3 != null ? todo3.guid : null);
            }
            copyOnWriteArraySet.removeAll(arrayList5);
            ChatTodoInfo a = ((ChatTodoInfo) arrayList2.get(0)).newBuilder().mo66196a(todo).build();
            if (isTodoRelativeToMe(todo)) {
                Intrinsics.checkExpressionValueIsNotNull(a, "modifyChatTodoInfo");
                addAssignToMeList(a);
            } else {
                Intrinsics.checkExpressionValueIsNotNull(a, "modifyChatTodoInfo");
                addAssignToOtherList(a);
            }
            refreshDisplayList();
        }
    }

    public final void insertAddedTodoChatInfo(String str, Todo todo) {
        boolean z;
        Chatter b;
        int i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        Map<String, Message> a = TodoDependencyHolder.f139242a.mo191730a().chatModuleDependency().mo145372a(arrayList);
        boolean z2 = false;
        if (a == null || a.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z || !a.containsKey(str)) {
            ChatTodoInfo a2 = new ChatTodoInfo.C19455a().mo66199a("").mo66196a(todo).build();
            Intrinsics.checkExpressionValueIsNotNull(a2, "ChatTodoInfo.Builder().m…id(\"\").todo(todo).build()");
            addTodoIntoChatList(a2);
            if (str.length() > 0) {
                z2 = true;
            }
            if (z2) {
                getShowToast().mo5926a(new TodoListToastUnit(R.string.Todo_Task_FailToShare, OperationToastHelper.ToastType.FAIL, null, 4, null));
                return;
            }
            return;
        }
        Message message = a.get(str);
        if (message != null && (b = this.mChatDependency.mo145378b(this.mLoginDependency.mo145411a())) != null) {
            com.bytedance.lark.pb.basic.v1.Chatter a3 = new Chatter.C14823a().mo54420d(b.getLocalizedName()).mo54416a(b.getId()).mo54418b(b.getLocalizedName()).mo54414a(Chatter.Type.USER).mo54415a(Long.valueOf(b.getUpdateTime())).mo54419c(b.getNamePinyin()).build();
            ChatTodoInfo.C19455a a4 = new ChatTodoInfo.C19455a().mo66196a(todo);
            if (this.mChatIsThread) {
                str = message.getThreadId();
            }
            ChatTodoInfo.C19455a a5 = a4.mo66199a(str);
            if (this.mChatIsThread) {
                i = message.getThreadPosition();
            } else {
                i = message.getPosition();
            }
            ChatTodoInfo a6 = a5.mo66197a(Integer.valueOf(i)).mo66198a(Long.valueOf(message.getCreateTime())).mo66195a(a3).build();
            Intrinsics.checkExpressionValueIsNotNull(a6, "chatTodo");
            addTodoIntoChatList(a6);
        }
    }

    public final void parseShareResult(Map<String, String> map, Map<String, ShareTodoMessageResponse.Share2ThreadTarget> map2, Todo todo) {
        ArrayList arrayList;
        boolean z;
        ArrayList arrayList2 = null;
        if (map2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ShareTodoMessageResponse.Share2ThreadTarget> entry : map2.entrySet()) {
                if (Intrinsics.areEqual(entry.getValue().channel_id, this.mTodoChatId)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                arrayList3.add((String) entry2.getKey());
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        List list = arrayList;
        boolean z2 = true;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            insertAddedTodoChatInfo((String) arrayList.get(0), todo);
            return;
        }
        if (map != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, String> entry3 : map.entrySet()) {
                if (Intrinsics.areEqual(entry3.getKey(), this.mTodoChatId)) {
                    linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                }
            }
            ArrayList arrayList4 = new ArrayList(linkedHashMap2.size());
            for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                arrayList4.add((String) entry4.getValue());
            }
            arrayList2 = arrayList4;
        }
        ArrayList arrayList5 = arrayList2;
        if (arrayList5 != null && !arrayList5.isEmpty()) {
            z2 = false;
        }
        if (!z2) {
            insertAddedTodoChatInfo((String) arrayList2.get(0), todo);
        }
    }

    private final void generateCompletedItems(CopyOnWriteArraySet<String> copyOnWriteArraySet, CopyOnWriteArrayList<ChatTodoInfo> copyOnWriteArrayList, String str, ArrayList<ChatTodoInfo> arrayList, Todo todo) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            Todo todo2 = next.todo;
            if (todo2 != null) {
                str2 = todo2.guid;
            }
            if (Intrinsics.areEqual(str2, str)) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = arrayList3;
        if (!arrayList4.isEmpty()) {
            ArrayList<ChatTodoInfo> arrayList5 = arrayList3;
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
            for (ChatTodoInfo chatTodoInfo : arrayList5) {
                Todo todo3 = chatTodoInfo.todo;
                arrayList6.add(todo3 != null ? todo3.guid : null);
            }
            copyOnWriteArraySet.removeAll(arrayList6);
            copyOnWriteArrayList.removeAll(arrayList4);
            for (ChatTodoInfo chatTodoInfo2 : arrayList5) {
                arrayList.add(chatTodoInfo2.newBuilder().mo66196a(todo).build());
            }
        }
    }
}
