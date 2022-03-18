package com.ss.android.lark.todo.impl.features.mainview.mvvm;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C1138ae;
import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1150b;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import androidx.p011a.p012a.p015c.AbstractC0193a;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.lark.pb.todo.v1.ChangedTodoCollection;
import com.bytedance.lark.pb.todo.v1.CustomComplete;
import com.bytedance.lark.pb.todo.v1.MarkTodoCompletedRequest;
import com.bytedance.lark.pb.todo.v1.Todo;
import com.bytedance.lark.pb.todo.v1.TodoBadgeConfig;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.bytedance.lark.pb.todo.v1.TodoListViewSetting;
import com.bytedance.lark.pb.todo.v1.TodoSetting;
import com.bytedance.lark.pb.todo.v1.TodoSortType;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.p2789a.AbstractC56259u;
import com.ss.android.lark.todo.impl.features.badge.TodoBadgeManager;
import com.ss.android.lark.todo.impl.features.common.helper.CustomCompleteHelper;
import com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper;
import com.ss.android.lark.todo.impl.features.common.helper.OperationToastHelper;
import com.ss.android.lark.todo.impl.features.common.screenshot.helper.TodoMainLogHelper;
import com.ss.android.lark.todo.impl.features.common.share.entity.ShareEntity;
import com.ss.android.lark.todo.impl.features.common.share.entity.ShareStatus;
import com.ss.android.lark.todo.impl.features.common.share.helper.ShareProcess;
import com.ss.android.lark.todo.impl.features.mainview.entity.LoadTitleType;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFetchStatus;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoListData;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoListResult;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoListToastUnit;
import com.ss.android.lark.todo.impl.features.mainview.helper.TodoDisplayHelper;
import com.ss.android.lark.todo.impl.features.mainview.widget.sort.SortDialog;
import com.ss.android.lark.todo.impl.features.setting.TodoSettingService;
import com.ss.android.lark.todo.impl.framework.architecture.DataResult;
import com.ss.android.lark.todo.impl.framework.architecture.Event;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.rustadapter.push.entity.TodoChangeNotificationUnit;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.todo.impl.utils.VibrateUtil;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 Â\u00012\u00020\u00012\u00020\u0002:\u0002Â\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010d\u001a\u00020\u0010J\u000e\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020\u0010J\u000e\u0010h\u001a\u00020f2\u0006\u0010g\u001a\u00020\u0010J\b\u0010i\u001a\u00020fH\u0016J\u0010\u0010j\u001a\u00020f2\u0006\u0010k\u001a\u000200H\u0016J\u0018\u0010l\u001a\u00020f2\u0006\u0010m\u001a\u00020D2\u0006\u0010g\u001a\u00020\u0010H\u0016J\u0016\u0010n\u001a\u00020f2\u0006\u0010o\u001a\u00020\u00102\u0006\u0010k\u001a\u000200J\b\u0010p\u001a\u00020fH\u0002J\u0019\u0010q\u001a\u00020f2\u0006\u0010k\u001a\u000200H@ø\u0001\u0000¢\u0006\u0002\u0010rJ\u0019\u0010s\u001a\u00020f2\u0006\u0010k\u001a\u000200H@ø\u0001\u0000¢\u0006\u0002\u0010rJ\u0016\u0010t\u001a\u00020f2\u0006\u0010u\u001a\u00020\u00072\u0006\u0010v\u001a\u00020\u0010J\u0016\u0010w\u001a\u00020f2\u0006\u0010u\u001a\u00020\u00072\u0006\u0010x\u001a\u00020\u0007J\b\u0010y\u001a\u00020fH\u0002J\b\u0010z\u001a\u00020%H\u0016J\b\u0010{\u001a\u00020\u0017H\u0016J$\u0010|\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0\t2\u000e\u0010}\u001a\n\u0012\u0004\u0012\u00020\u0018\u00010~H\u0002J\u0010\u0010\u0001\u001a\u00020f2\u0007\u0010\u0001\u001a\u00020\u0010J%\u0010\u0001\u001a\u001e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u00100$j\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u0010`'H\u0002J\u0011\u0010\u0001\u001a\u00020\u00072\u0006\u0010*\u001a\u00020%H\u0002J\u0012\u0010\u0001\u001a\u00020f2\u0007\u0010\u0001\u001a\u00020\u0010H\u0016J%\u0010\u0001\u001a\u001e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u00100$j\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u0010`'H\u0002J\u0012\u0010\u0001\u001a\u00020f2\u0007\u0010\u0001\u001a\u00020\u0017H\u0016J\t\u0010\u0001\u001a\u00020fH\u0002J\t\u0010\u0001\u001a\u00020fH\u0016J\t\u0010\u0001\u001a\u00020\u0010H\u0016J\u001f\u0010\u0001\u001a\u00020\u00102\b\u0010\u0001\u001a\u00030\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J\t\u0010\u0001\u001a\u00020\u0010H\u0016J\t\u0010\u0001\u001a\u00020\u0010H\u0016J\t\u0010\u0001\u001a\u00020\u0010H\u0016J\t\u0010\u0001\u001a\u00020fH\u0016J\u0012\u0010\u0001\u001a\u00020f2\u0007\u0010\u0001\u001a\u00020\u0010H\u0002J\u0007\u0010\u0001\u001a\u00020fJ\u001b\u0010\u0001\u001a\u00020f2\u0007\u0010\u0001\u001a\u00020\u00102\u0007\u0010\u0001\u001a\u00020&H\u0016J\u0012\u0010\u0001\u001a\u00020f2\u0007\u0010\u0001\u001a\u00020\u0010H\u0002J\t\u0010\u0001\u001a\u00020fH\u0016J\u0011\u0010\u0001\u001a\u00020f2\u0006\u0010k\u001a\u000200H\u0016J\u000f\u0010\u0001\u001a\u00020f2\u0006\u0010u\u001a\u00020\u0007J\t\u0010\u0001\u001a\u00020fH\u0016J\u0013\u0010 \u0001\u001a\u00020f2\b\u0010¡\u0001\u001a\u00030¢\u0001H\u0016J\u0012\u0010£\u0001\u001a\u00020f2\u0007\u0010¤\u0001\u001a\u00020%H\u0016J\t\u0010¥\u0001\u001a\u00020fH\u0002J\u0011\u0010¦\u0001\u001a\u00020f2\u0006\u0010k\u001a\u000200H\u0016J\u0012\u0010§\u0001\u001a\u00030¨\u00012\u0006\u0010k\u001a\u000200H\u0002J\u001a\u0010,\u001a\u00020f2\u0007\u0010©\u0001\u001a\u00020%2\u0007\u0010ª\u0001\u001a\u00020\u0010H\u0016J6\u0010«\u0001\u001a\u00020f2\u0019\u0010¬\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u00070­\u0001j\t\u0012\u0004\u0012\u00020\u0007`®\u00012\u0007\u0010¯\u0001\u001a\u00020\u00072\u0007\u0010°\u0001\u001a\u00020\u0007H\u0016J\t\u0010±\u0001\u001a\u00020fH\u0002J\u001a\u0010²\u0001\u001a\u00020f2\u0007\u0010³\u0001\u001a\u00020&2\b\u0010¤\u0001\u001a\u00030´\u0001J\u0013\u0010µ\u0001\u001a\u00020f2\b\u0010¶\u0001\u001a\u00030·\u0001H\u0002J\u0012\u0010¸\u0001\u001a\u00020f2\u0007\u0010\u0001\u001a\u00020\u0017H\u0016J\u0019\u0010¹\u0001\u001a\u00020f2\u000e\u0010º\u0001\u001a\t\u0012\u0005\u0012\u00030·\u00010/H\u0016J\u0013\u0010»\u0001\u001a\u00020f2\b\u0010¡\u0001\u001a\u00030¢\u0001H\u0002J\u0013\u0010¼\u0001\u001a\u00020f2\b\u0010½\u0001\u001a\u00030¾\u0001H\u0016J\u0013\u0010¿\u0001\u001a\u00020f2\b\u0010À\u0001\u001a\u00030Á\u0001H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR<\u0010#\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$j\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&`'0\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001bR \u0010*\u001a\b\u0012\u0004\u0012\u00020%0\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010\u001bR\u000e\u0010-\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R&\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\f\"\u0004\b2\u0010\u000eR\u0011\u00103\u001a\u0002048F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u00107\u001a\u0002048F¢\u0006\u0006\u001a\u0004\b8\u00106R*\u00109\u001a\u001e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$j\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&`'X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010:\u001a\u0012\u0012\u0004\u0012\u00020&0;j\b\u0012\u0004\u0012\u00020&`<X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X\u0004¢\u0006\u0002\n\u0000R*\u0010A\u001a\u001e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020B0$j\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020B`'X\u0004¢\u0006\u0002\n\u0000RR\u0010C\u001aF\u0012\u0004\u0012\u00020%\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u00100$0$j*\u0012\u0004\u0012\u00020%\u0012 \u0012\u001e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u00100$j\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u0010`'`'X\u000e¢\u0006\u0002\n\u0000R \u0010E\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0019\"\u0004\bG\u0010\u001bR \u0010H\u001a\b\u0012\u0004\u0012\u00020\u00100\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0019\"\u0004\bJ\u0010\u001bR \u0010K\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0019\"\u0004\bM\u0010\u001bR&\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000O0\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0019\"\u0004\bQ\u0010\u001bR \u0010R\u001a\b\u0012\u0004\u0012\u00020S0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\f\"\u0004\bU\u0010\u000eR(\u0010V\u001a\u0010\u0012\f\u0012\n X*\u0004\u0018\u00010W0W0\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u0019\"\u0004\bZ\u0010\u001bR \u0010[\u001a\b\u0012\u0004\u0012\u0002000\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u0019\"\u0004\b]\u0010\u001bR \u0010^\u001a\b\u0012\u0004\u0012\u0002000\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u0019\"\u0004\b`\u0010\u001bR&\u0010a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0O0\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u0019\"\u0004\bc\u0010\u001b\u0002\u0004\n\u0002\b\u0019¨\u0006Ã\u0001"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lcom/ss/android/lark/todo/impl/features/mainview/mvvm/ITodoMainViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "addedTodoGuid", "", "badgeSettingUnit", "Landroidx/lifecycle/LiveData;", "Lcom/bytedance/lark/pb/todo/v1/TodoBadgeConfig;", "getBadgeSettingUnit", "()Landroidx/lifecycle/LiveData;", "setBadgeSettingUnit", "(Landroidx/lifecycle/LiveData;)V", "canLoadDocsDoingMore", "", "getCanLoadDocsDoingMore", "()Z", "canLoadDocsDoneMore", "getCanLoadDocsDoneMore", "currentViewSortTypeLV", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/SortDialog$SortType;", "getCurrentViewSortTypeLV", "()Landroidx/lifecycle/MutableLiveData;", "setCurrentViewSortTypeLV", "(Landroidx/lifecycle/MutableLiveData;)V", "dataFetchStatus", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFetchStatus;", "getDataFetchStatus", "setDataFetchStatus", "fetchFirstPage", "getFetchFirstPage", "setFetchFirstPage", "filterNumMapLv", "Ljava/util/HashMap;", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;", "", "Lkotlin/collections/HashMap;", "getFilterNumMapLv", "setFilterNumMapLv", "filterType", "getFilterType", "setFilterType", "isAddedScene", "items", "", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem;", "getItems", "setItems", "loadDocsDoingPagePosition", "", "getLoadDocsDoingPagePosition", "()J", "loadDocsDonePagePosition", "getLoadDocsDonePagePosition", "mFilterNumMap", "mListItemsSet", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "mTimeFormatDependency", "Lcom/ss/android/lark/todo/dependency/idependency/ITimeFormatDependency;", "mTodoMainModel", "Lcom/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainModel;", "mViewSortTypeMap", "Lcom/bytedance/lark/pb/todo/v1/TodoSortType;", "midTitleState", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$TitleType;", "moveToCreateItemLv", "getMoveToCreateItemLv", "setMoveToCreateItemLv", "noTodoLabel", "getNoTodoLabel", "setNoTodoLabel", "noTodoText", "getNoTodoText", "setNoTodoText", "openTodoEvent", "Lcom/ss/android/lark/todo/impl/framework/architecture/Event;", "getOpenTodoEvent", "setOpenTodoEvent", "operationToastUnit", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoListToastUnit;", "getOperationToastUnit", "setOperationToastUnit", "shareEntity", "Lcom/ss/android/lark/todo/impl/features/common/share/entity/ShareEntity;", "kotlin.jvm.PlatformType", "getShareEntity", "setShareEntity", "showActiveDialog", "getShowActiveDialog", "setShowActiveDialog", "showCompleteDialog", "getShowCompleteDialog", "setShowCompleteDialog", "toastUnit", "getToastUnit", "setToastUnit", "canLoadMore", "changeDocsDoingTitleState", "", "isExpand", "changeDocsDoneTitleState", "changeDueTimeSortType", "changeStatusTodo", "todoDisplayItem", "changeTitleState", "titleType", "changeTodoCompleteStatus", "isTargetComplete", "clearListItem", "clickCompleteInMultiStrategy", "(Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clickCompleteOutMultiStrategy", "completeDocsTodo", "todoGuid", "isComplete", "deleteDocsAssigneeTodo", "assignId", "getBadgeSetting", "getCurrentFilter", "getCurrentFilterSortType", "getDisplayTodosResult", "todosResult", "Lcom/ss/android/lark/todo/impl/framework/architecture/DataResult;", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoListResult;", "getDocsPagingItems", "isFetchFirstPage", "getDocsTitleStateMap", "getEmptyStrByFilterType", "getPagingItems", "getTitleStateMap", "handleBadgePush", "sortType", "initSortTypeMap", "initialData", "isCanLoadMore", "isInCustomCompleteStrategy", "context", "Landroid/content/Context;", "customComplete", "Lcom/bytedance/lark/pb/todo/v1/CustomComplete$Action;", "isNoTodoLabelShow", "isShowBadgeOverdue", "isShowBadgeToday", "loadAllTodo", "loadAllTodoDatas", "forceUpdate", "loadAllTodoViews", "loadMoreTodoDatas", "isForceFetch", "totalItemCount", "loadPagingDatas", "isFirstPage", "logTodoListOnScreenShot", "openTodo", "quitDocsTodo", "refreshListEndTime", "refreshListWithAddedTodo", "addedTodo", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "resetTitleStateByType", ShareHitPoint.f121869d, "resetTitleStateMap", "setCompleted", "setDocsCompleted", "Lkotlinx/coroutines/Job;", "targetFilterType", "isNeedLoadData", "shareTodo", "chatIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", Comment.f24093e, "guid", "showOperationSuccessToast", "showToastMessage", "stringId", "Lcom/ss/android/lark/todo/impl/features/common/helper/OperationToastHelper$ToastType;", "updateChildCountByType", "todoListView", "Lcom/bytedance/lark/pb/todo/v1/TodoListView;", "updateCurrentSortType", "updateTodoCountByPush", "viewList", "updateTodoFilterByAddTodo", "updateTodoListByPush", "pushData", "Lcom/ss/android/lark/todo/impl/rustadapter/push/entity/TodoChangeNotificationUnit;", "updateTodoSetting", "todoSetting", "Lcom/bytedance/lark/pb/todo/v1/TodoSetting;", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.f */
public final class TodoMainViewModel extends C1150b {
    public static final Companion Companion = new Companion(null);
    private String addedTodoGuid;
    private LiveData<TodoBadgeConfig> badgeSettingUnit;
    private C1177w<SortDialog.SortType> currentViewSortTypeLV;
    private C1177w<TodoFetchStatus> dataFetchStatus = new C1177w<>();
    private C1177w<Boolean> fetchFirstPage = new C1177w<>();
    private C1177w<HashMap<TodoFilterType, Integer>> filterNumMapLv = new C1177w<>();
    private C1177w<TodoFilterType> filterType = new C1177w<>();
    private boolean isAddedScene;
    private LiveData<List<TodoDisplayItem>> items;
    private final HashMap<TodoFilterType, Integer> mFilterNumMap = new HashMap<>();
    private HashSet<Integer> mListItemsSet;
    private final AbstractC56259u mTimeFormatDependency = TodoDependencyHolder.f139242a.mo191730a().timeFormatDependency();
    public final TodoMainModel mTodoMainModel;
    public final HashMap<TodoFilterType, TodoSortType> mViewSortTypeMap = new HashMap<>();
    private HashMap<TodoFilterType, HashMap<TodoDisplayItem.TitleType, Boolean>> midTitleState = new HashMap<>();
    private C1177w<String> moveToCreateItemLv = new C1177w<>();
    private C1177w<Boolean> noTodoLabel = new C1177w<>();
    private C1177w<String> noTodoText = new C1177w<>();
    private C1177w<Event<TodoDisplayItem>> openTodoEvent = new C1177w<>();
    private LiveData<TodoListToastUnit> operationToastUnit;
    private C1177w<ShareEntity> shareEntity;
    private C1177w<TodoDisplayItem> showActiveDialog;
    private C1177w<TodoDisplayItem> showCompleteDialog;
    private C1177w<Event<TodoListToastUnit>> toastUnit = new C1177w<>();

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, d2 = {"clickCompleteInMultiStrategy", "", "todoDisplayItem", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainViewModel", mo239173f = "TodoMainViewModel.kt", mo239174i = {0, 0, 0, 1, 1, 1}, mo239175l = {TTVideoEngine.PLAYER_OPTION_ENABEL_HARDWARE_DECODE_AUDIO, 426}, mo239176m = "clickCompleteInMultiStrategy", mo239177n = {"this", "todoDisplayItem", "operationList", "this", "todoDisplayItem", "operationList"}, mo239178s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.f$f */
    public static final class C56896f extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoMainViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56896f(TodoMainViewModel fVar, Continuation cVar) {
            super(cVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.clickCompleteInMultiStrategy(null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, d2 = {"clickCompleteOutMultiStrategy", "", "todoDisplayItem", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainViewModel", mo239173f = "TodoMainViewModel.kt", mo239174i = {0, 0, 1, 1}, mo239175l = {389, 396}, mo239176m = "clickCompleteOutMultiStrategy", mo239177n = {"this", "todoDisplayItem", "this", "todoDisplayItem"}, mo239178s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.f$g */
    public static final class C56897g extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoMainViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56897g(TodoMainViewModel fVar, Continuation cVar) {
            super(cVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.clickCompleteOutMultiStrategy(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainViewModel$Companion;", "", "()V", "FETCH_FIRST_PAGE_ERROR", "", "FETCH_NEXT_PAGE_ERROR", "TAG", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.f$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LiveData<TodoBadgeConfig> getBadgeSettingUnit() {
        return this.badgeSettingUnit;
    }

    public C1177w<SortDialog.SortType> getCurrentViewSortTypeLV() {
        return this.currentViewSortTypeLV;
    }

    public C1177w<TodoFetchStatus> getDataFetchStatus() {
        return this.dataFetchStatus;
    }

    public C1177w<Boolean> getFetchFirstPage() {
        return this.fetchFirstPage;
    }

    public C1177w<HashMap<TodoFilterType, Integer>> getFilterNumMapLv() {
        return this.filterNumMapLv;
    }

    public C1177w<TodoFilterType> getFilterType() {
        return this.filterType;
    }

    public LiveData<List<TodoDisplayItem>> getItems() {
        return this.items;
    }

    public C1177w<String> getMoveToCreateItemLv() {
        return this.moveToCreateItemLv;
    }

    public C1177w<Boolean> getNoTodoLabel() {
        return this.noTodoLabel;
    }

    public C1177w<String> getNoTodoText() {
        return this.noTodoText;
    }

    public C1177w<Event<TodoDisplayItem>> getOpenTodoEvent() {
        return this.openTodoEvent;
    }

    public LiveData<TodoListToastUnit> getOperationToastUnit() {
        return this.operationToastUnit;
    }

    public C1177w<ShareEntity> getShareEntity() {
        return this.shareEntity;
    }

    public C1177w<TodoDisplayItem> getShowActiveDialog() {
        return this.showActiveDialog;
    }

    public C1177w<TodoDisplayItem> getShowCompleteDialog() {
        return this.showCompleteDialog;
    }

    public C1177w<Event<TodoListToastUnit>> getToastUnit() {
        return this.toastUnit;
    }

    private final void clearListItem() {
        this.mListItemsSet.clear();
    }

    public void refreshListEndTime() {
        loadAllTodoDatas(false);
    }

    public void logTodoListOnScreenShot() {
        TodoMainLogHelper.f139386a.mo191963a(getCurrentFilter(), this.mFilterNumMap, "todo_tab");
    }

    public final void showOperationSuccessToast() {
        showToastMessage(R.string.Todo_CollabTask_Successful, OperationToastHelper.ToastType.SUCCESS);
    }

    private final void getBadgeSetting() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C56900j(this, null), 3, null);
    }

    private final HashMap<TodoDisplayItem.TitleType, Boolean> getDocsTitleStateMap() {
        HashMap<TodoDisplayItem.TitleType, Boolean> hashMap = new HashMap<>();
        HashMap<TodoDisplayItem.TitleType, Boolean> hashMap2 = hashMap;
        hashMap2.put(TodoDisplayItem.TitleType.DOING, true);
        hashMap2.put(TodoDisplayItem.TitleType.DONE, false);
        return hashMap;
    }

    public final boolean canLoadMore() {
        Boolean b = this.mTodoMainModel.mo193313b().mo5927b();
        if (b == null) {
            b = true;
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "mTodoMainModel.observeCanLoadMore().value ?: true");
        return b.booleanValue();
    }

    public final boolean getCanLoadDocsDoingMore() {
        Boolean b = this.mTodoMainModel.mo193330f().mo5927b();
        if (b == null) {
            b = true;
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "mTodoMainModel.observeCa…DoingMore().value ?: true");
        return b.booleanValue();
    }

    public final boolean getCanLoadDocsDoneMore() {
        Boolean b = this.mTodoMainModel.mo193328e().mo5927b();
        if (b == null) {
            b = true;
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "mTodoMainModel.observeCa…sDoneMore().value ?: true");
        return b.booleanValue();
    }

    public TodoFilterType getCurrentFilter() {
        TodoFilterType b = getFilterType().mo5927b();
        if (b == null) {
            b = TodoFilterType.ALL;
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "filterType.value ?: ALL");
        return b;
    }

    public final long getLoadDocsDoingPagePosition() {
        Long b = this.mTodoMainModel.mo193331g().mo5927b();
        if (b == null) {
            b = 0L;
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "mTodoMainModel.observeDo…agePosition().value ?: 0L");
        return b.longValue();
    }

    public final long getLoadDocsDonePagePosition() {
        Long b = this.mTodoMainModel.mo193332h().mo5927b();
        if (b == null) {
            b = 0L;
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "mTodoMainModel.observeDo…agePosition().value ?: 0L");
        return b.longValue();
    }

    public void initialData() {
        initSortTypeMap();
        getBadgeSetting();
        loadAllTodoViews();
        setFilterType(TodoFilterType.ALL, false);
        clearListItem();
        TodoHitPoint.m221730a("ongoing");
    }

    public boolean isCanLoadMore() {
        Boolean b = this.mTodoMainModel.mo193313b().mo5927b();
        if (b == null) {
            b = true;
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "mTodoMainModel.observeCanLoadMore().value ?: true");
        return b.booleanValue();
    }

    public boolean isNoTodoLabelShow() {
        Boolean b = getNoTodoLabel().mo5927b();
        if (b == null) {
            b = false;
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "noTodoLabel.value ?: false");
        return b.booleanValue();
    }

    public boolean isShowBadgeOverdue() {
        Boolean bool;
        TodoBadgeConfig b = getBadgeSettingUnit().mo5927b();
        if (b == null || (bool = b.enable) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isShowBadgeToday() {
        TodoBadgeConfig.BadgeType badgeType;
        if (isShowBadgeOverdue()) {
            TodoBadgeConfig b = getBadgeSettingUnit().mo5927b();
            if (b != null) {
                badgeType = b.type;
            } else {
                badgeType = null;
            }
            if (badgeType == TodoBadgeConfig.BadgeType.OVERDUE_AND_TODAY) {
                return true;
            }
        }
        return false;
    }

    public final void loadAllTodoViews() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C56906p(this, null), 3, null);
    }

    private final HashMap<TodoDisplayItem.TitleType, Boolean> getTitleStateMap() {
        HashMap<TodoDisplayItem.TitleType, Boolean> hashMap = new HashMap<>();
        HashMap<TodoDisplayItem.TitleType, Boolean> hashMap2 = hashMap;
        hashMap2.put(TodoDisplayItem.TitleType.OVER_DUE, true);
        hashMap2.put(TodoDisplayItem.TitleType.TODAY, true);
        hashMap2.put(TodoDisplayItem.TitleType.IN_WEEK, true);
        hashMap2.put(TodoDisplayItem.TitleType.OTHER, true);
        return hashMap;
    }

    public void changeDueTimeSortType() {
        if (getCurrentFilterSortType() == SortDialog.SortType.DUE_TIME) {
            this.midTitleState.put(getCurrentFilter(), getTitleStateMap());
            loadAllTodoDatas(false);
            return;
        }
        this.midTitleState.put(getCurrentFilter(), getTitleStateMap());
        updateCurrentSortType(SortDialog.SortType.DUE_TIME);
    }

    public SortDialog.SortType getCurrentFilterSortType() {
        if (getCurrentFilter() == TodoFilterType.COMPLETED) {
            return SortDialog.SortType.CREATE_TIME;
        }
        if (!this.mViewSortTypeMap.containsKey(getCurrentFilter())) {
            return SortDialog.SortType.DUE_TIME;
        }
        TodoSortType todoSortType = this.mViewSortTypeMap.get(getCurrentFilter());
        if (todoSortType == null) {
            todoSortType = TodoSortType.DUE_TIME;
        }
        Intrinsics.checkExpressionValueIsNotNull(todoSortType, "mViewSortTypeMap[getCurrentFilter()] ?: DUE_TIME");
        if (todoSortType == TodoSortType.DUE_TIME) {
            return SortDialog.SortType.DUE_TIME;
        }
        return SortDialog.SortType.CREATE_TIME;
    }

    public void loadAllTodo() {
        int i = C56913g.f140477k[getCurrentFilter().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            loadAllTodoDatas(true);
        } else if (i == 5) {
            Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C56904n(this, null), 3, null);
        }
    }

    private final void initSortTypeMap() {
        this.mViewSortTypeMap.put(TodoFilterType.ALL, TodoSortType.DUE_TIME);
        this.mViewSortTypeMap.put(TodoFilterType.ASSIGN_FROM_ME, TodoSortType.DUE_TIME);
        this.mViewSortTypeMap.put(TodoFilterType.ASSIGN_TO_ME, TodoSortType.DUE_TIME);
        this.mViewSortTypeMap.put(TodoFilterType.COMPLETED, TodoSortType.DUE_TIME);
        this.mViewSortTypeMap.put(TodoFilterType.FOLLOWED, TodoSortType.DUE_TIME);
        this.mViewSortTypeMap.put(TodoFilterType.FROM_DOCS, TodoSortType.DUE_TIME);
        resetTitleStateMap();
    }

    private final void resetTitleStateMap() {
        this.midTitleState.put(TodoFilterType.ALL, getTitleStateMap());
        this.midTitleState.put(TodoFilterType.ASSIGN_FROM_ME, getTitleStateMap());
        this.midTitleState.put(TodoFilterType.ASSIGN_TO_ME, getTitleStateMap());
        this.midTitleState.put(TodoFilterType.FOLLOWED, getTitleStateMap());
        this.midTitleState.put(TodoFilterType.FROM_DOCS, getDocsTitleStateMap());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainViewModel$isInCustomCompleteStrategy$1", "Lcom/ss/android/lark/todo/impl/features/common/helper/CustomCompleteHelper$ITipShowListener;", "showTipToast", "", "tipsStr", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.f$m */
    public static final class C56903m implements CustomCompleteHelper.ITipShowListener {

        /* renamed from: a */
        final /* synthetic */ TodoMainViewModel f140464a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56903m(TodoMainViewModel fVar) {
            this.f140464a = fVar;
        }

        @Override // com.ss.android.lark.todo.impl.features.common.helper.CustomCompleteHelper.ITipShowListener
        /* renamed from: a */
        public void mo191923a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "tipsStr");
            this.f140464a.getToastUnit().mo5926a(new Event<>(new TodoListToastUnit(0, OperationToastHelper.ToastType.PROMPT, str)));
        }
    }

    public void setBadgeSettingUnit(LiveData<TodoBadgeConfig> liveData) {
        Intrinsics.checkParameterIsNotNull(liveData, "<set-?>");
        this.badgeSettingUnit = liveData;
    }

    public void setCurrentViewSortTypeLV(C1177w<SortDialog.SortType> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.currentViewSortTypeLV = wVar;
    }

    public void setDataFetchStatus(C1177w<TodoFetchStatus> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.dataFetchStatus = wVar;
    }

    public void setFetchFirstPage(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.fetchFirstPage = wVar;
    }

    public void setFilterNumMapLv(C1177w<HashMap<TodoFilterType, Integer>> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.filterNumMapLv = wVar;
    }

    public void setFilterType(C1177w<TodoFilterType> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.filterType = wVar;
    }

    public void setItems(LiveData<List<TodoDisplayItem>> liveData) {
        Intrinsics.checkParameterIsNotNull(liveData, "<set-?>");
        this.items = liveData;
    }

    public void setMoveToCreateItemLv(C1177w<String> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.moveToCreateItemLv = wVar;
    }

    public void setNoTodoLabel(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.noTodoLabel = wVar;
    }

    public void setNoTodoText(C1177w<String> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.noTodoText = wVar;
    }

    public void setOpenTodoEvent(C1177w<Event<TodoDisplayItem>> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.openTodoEvent = wVar;
    }

    public void setOperationToastUnit(LiveData<TodoListToastUnit> liveData) {
        Intrinsics.checkParameterIsNotNull(liveData, "<set-?>");
        this.operationToastUnit = liveData;
    }

    public void setShareEntity(C1177w<ShareEntity> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.shareEntity = wVar;
    }

    public void setShowActiveDialog(C1177w<TodoDisplayItem> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.showActiveDialog = wVar;
    }

    public void setShowCompleteDialog(C1177w<TodoDisplayItem> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.showCompleteDialog = wVar;
    }

    public void setToastUnit(C1177w<Event<TodoListToastUnit>> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.toastUnit = wVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainViewModel$updateCurrentSortType$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "result", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.f$u */
    public static final class C56911u implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TodoMainViewModel f140465a;

        /* renamed from: b */
        final /* synthetic */ SortDialog.SortType f140466b;

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo193423a(bool.booleanValue());
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("TAG", "updateCurrentSortType Err");
            this.f140465a.showToastMessage(R.string.Todo_Task_FailedToSet, OperationToastHelper.ToastType.FAIL);
        }

        /* renamed from: a */
        public void mo193423a(boolean z) {
            TodoSortType todoSortType;
            this.f140465a.getCurrentViewSortTypeLV().mo5926a(this.f140466b);
            if (this.f140465a.mViewSortTypeMap.containsKey(this.f140465a.getCurrentFilter())) {
                HashMap<TodoFilterType, TodoSortType> hashMap = this.f140465a.mViewSortTypeMap;
                TodoFilterType currentFilter = this.f140465a.getCurrentFilter();
                if (this.f140466b == SortDialog.SortType.CREATE_TIME) {
                    todoSortType = TodoSortType.CREATE_TIME;
                } else {
                    todoSortType = TodoSortType.DUE_TIME;
                }
                hashMap.put(currentFilter, todoSortType);
            }
            if (this.f140465a.getCurrentFilter() == TodoFilterType.FROM_DOCS) {
                this.f140465a.setFilterType(TodoFilterType.FROM_DOCS, true);
            } else {
                this.f140465a.mTodoMainModel.mo193309a(this.f140466b, this.f140465a.getCurrentFilter());
            }
        }

        C56911u(TodoMainViewModel fVar, SortDialog.SortType sortType) {
            this.f140465a = fVar;
            this.f140466b = sortType;
        }
    }

    private final void loadPagingDatas(boolean z) {
        getFetchFirstPage().mo5929b(Boolean.valueOf(z));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00022\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0003H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "Landroidx/lifecycle/LiveData;", "Y", "X", "it", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Landroidx/lifecycle/LiveData;", "androidx/lifecycle/TransformationsKt$switchMap$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.f$a */
    public static final class C56892a<I, O> implements AbstractC0193a<DataResult<? extends TodoListResult>, LiveData<List<? extends TodoDisplayItem>>> {

        /* renamed from: a */
        final /* synthetic */ TodoMainViewModel f140463a;

        public C56892a(TodoMainViewModel fVar) {
            this.f140463a = fVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.ss.android.lark.todo.impl.features.mainview.mvvm.f */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final LiveData<List<? extends TodoDisplayItem>> apply(DataResult<? extends TodoListResult> aVar) {
            TodoMainViewModel fVar = this.f140463a;
            fVar.handleBadgePush(fVar.getCurrentFilterSortType());
            return this.f140463a.getDisplayTodosResult(aVar);
        }
    }

    public void changeStatusTodo(TodoDisplayItem todoDisplayItem) {
        Intrinsics.checkParameterIsNotNull(todoDisplayItem, "todoDisplayItem");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C56894d(this, todoDisplayItem, null), 3, null);
    }

    public void handleBadgePush(SortDialog.SortType sortType) {
        Intrinsics.checkParameterIsNotNull(sortType, "sortType");
        if (getCurrentFilter() == TodoFilterType.ALL && sortType == SortDialog.SortType.DUE_TIME) {
            TodoBadgeManager.f139264a.mo191793c();
        } else {
            TodoBadgeManager.f139264a.mo191790b();
        }
    }

    public final void loadAllTodoDatas(boolean z) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C56905o(this, z, null), 3, null);
    }

    public void openTodo(TodoDisplayItem todoDisplayItem) {
        Intrinsics.checkParameterIsNotNull(todoDisplayItem, "todoDisplayItem");
        getOpenTodoEvent().mo5929b(new Event<>(todoDisplayItem));
    }

    public final void quitDocsTodo(String str) {
        Intrinsics.checkParameterIsNotNull(str, "todoGuid");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C56907q(this, str, null), 3, null);
    }

    public void setCompleted(TodoDisplayItem todoDisplayItem) {
        Intrinsics.checkParameterIsNotNull(todoDisplayItem, "todoDisplayItem");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C56909s(this, todoDisplayItem, null), 3, null);
    }

    public final Job setDocsCompleted(TodoDisplayItem todoDisplayItem) {
        return C69553g.m266944a(C1143ag.m5356a(this), null, null, new C56910t(this, todoDisplayItem, null), 3, null);
    }

    public void updateTodoCountByPush(List<TodoListView> list) {
        Intrinsics.checkParameterIsNotNull(list, "viewList");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            updateChildCountByType(it.next());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainViewModel$changeDocsDoingTitleState$1", mo239173f = "TodoMainViewModel.kt", mo239174i = {0}, mo239175l = {697}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.f$c */
    public static final class C56893c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $showDone;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoMainViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56893c(TodoMainViewModel fVar, boolean z, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
            this.$showDone = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56893c cVar2 = new C56893c(this.this$0, this.$showDone, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56893c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoMainModel dVar = this.this$0.mTodoMainModel;
                boolean z = this.$showDone;
                TodoFilterType currentFilter = this.this$0.getCurrentFilter();
                this.L$0 = ahVar;
                this.label = 1;
                if (dVar.mo193305a(z, currentFilter, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainViewModel$completeDocsTodo$1", mo239173f = "TodoMainViewModel.kt", mo239174i = {0}, mo239175l = {747}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.f$h */
    public static final class C56898h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isComplete;
        final /* synthetic */ String $todoGuid;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoMainViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56898h(TodoMainViewModel fVar, String str, boolean z, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
            this.$todoGuid = str;
            this.$isComplete = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56898h hVar = new C56898h(this.this$0, this.$todoGuid, this.$isComplete, cVar);
            hVar.p$ = (CoroutineScope) obj;
            return hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56898h) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoMainModel dVar = this.this$0.mTodoMainModel;
                String str = this.$todoGuid;
                boolean z = this.$isComplete;
                TodoFilterType currentFilter = this.this$0.getCurrentFilter();
                this.L$0 = ahVar;
                this.label = 1;
                if (dVar.mo193317b(str, z, currentFilter, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainViewModel$deleteDocsAssigneeTodo$1", mo239173f = "TodoMainViewModel.kt", mo239174i = {0}, mo239175l = {753}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.f$i */
    public static final class C56899i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $assignId;
        final /* synthetic */ String $todoGuid;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoMainViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56899i(TodoMainViewModel fVar, String str, String str2, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
            this.$todoGuid = str;
            this.$assignId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56899i iVar = new C56899i(this.this$0, this.$todoGuid, this.$assignId, cVar);
            iVar.p$ = (CoroutineScope) obj;
            return iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56899i) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoMainModel dVar = this.this$0.mTodoMainModel;
                String str = this.$todoGuid;
                String str2 = this.$assignId;
                TodoFilterType currentFilter = this.this$0.getCurrentFilter();
                this.L$0 = ahVar;
                this.label = 1;
                if (dVar.mo193300a(str, str2, currentFilter, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainViewModel$getBadgeSetting$1", mo239173f = "TodoMainViewModel.kt", mo239174i = {0}, mo239175l = {729}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.f$j */
    public static final class C56900j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoMainViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56900j(TodoMainViewModel fVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56900j jVar = new C56900j(this.this$0, cVar);
            jVar.p$ = (CoroutineScope) obj;
            return jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56900j) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoMainModel dVar = this.this$0.mTodoMainModel;
                this.L$0 = ahVar;
                this.label = 1;
                if (dVar.mo193318b(this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainViewModel$loadAllTodo$1", mo239173f = "TodoMainViewModel.kt", mo239174i = {0}, mo239175l = {535}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.f$n */
    public static final class C56904n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoMainViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56904n(TodoMainViewModel fVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56904n nVar = new C56904n(this.this$0, cVar);
            nVar.p$ = (CoroutineScope) obj;
            return nVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56904n) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoMainModel dVar = this.this$0.mTodoMainModel;
                TodoFilterType currentFilter = this.this$0.getCurrentFilter();
                this.L$0 = ahVar;
                this.label = 1;
                if (dVar.mo193322c(currentFilter, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainViewModel$quitDocsTodo$1", mo239173f = "TodoMainViewModel.kt", mo239174i = {0}, mo239175l = {741}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.f$q */
    public static final class C56907q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $todoGuid;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoMainViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56907q(TodoMainViewModel fVar, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
            this.$todoGuid = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56907q qVar = new C56907q(this.this$0, this.$todoGuid, cVar);
            qVar.p$ = (CoroutineScope) obj;
            return qVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56907q) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoMainModel dVar = this.this$0.mTodoMainModel;
                String str = this.$todoGuid;
                TodoFilterType currentFilter = this.this$0.getCurrentFilter();
                this.L$0 = ahVar;
                this.label = 1;
                if (dVar.mo193323c(str, true, currentFilter, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainViewModel$refreshListWithAddedTodo$1", mo239173f = "TodoMainViewModel.kt", mo239174i = {0}, mo239175l = {560}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.f$r */
    public static final class C56908r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Todo $addedTodo;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoMainViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56908r(TodoMainViewModel fVar, Todo todo, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
            this.$addedTodo = todo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56908r rVar = new C56908r(this.this$0, this.$addedTodo, cVar);
            rVar.p$ = (CoroutineScope) obj;
            return rVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56908r) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoMainModel dVar = this.this$0.mTodoMainModel;
                Todo todo = this.$addedTodo;
                this.L$0 = ahVar;
                this.label = 1;
                if (dVar.mo193292a(todo, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    public final void changeDocsDoingTitleState(boolean z) {
        boolean z2;
        if (!z || !getCanLoadDocsDoingMore()) {
            this.mTodoMainModel.mo193333i().mo5926a(LoadTitleType.LOAD_NONE);
            z2 = true;
        } else {
            this.mTodoMainModel.mo193333i().mo5926a(LoadTitleType.LOAD_DOING);
            z2 = false;
        }
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C56893c(this, z2, null), 3, null);
    }

    public final void changeDocsDoneTitleState(boolean z) {
        if (!z || !getCanLoadDocsDoneMore()) {
            this.mTodoMainModel.mo193333i().mo5926a(LoadTitleType.LOAD_NONE);
        } else {
            this.mTodoMainModel.mo193333i().mo5926a(LoadTitleType.LOAD_DONE);
        }
        loadAllTodoDatas(false);
    }

    public final void getDocsPagingItems(boolean z) {
        if (getCurrentFilter() == TodoFilterType.FROM_DOCS && z) {
            this.midTitleState.put(TodoFilterType.FROM_DOCS, getDocsTitleStateMap());
            getDataFetchStatus().mo5929b(TodoFetchStatus.LOADING);
        }
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C56901k(this, z, null), 3, null);
    }

    public void getPagingItems(boolean z) {
        if (getCurrentFilter() == TodoFilterType.COMPLETED && z) {
            getDataFetchStatus().mo5929b(TodoFetchStatus.LOADING);
        }
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C56902l(this, z, null), 3, null);
    }

    public void refreshListWithAddedTodo(Todo todo) {
        Intrinsics.checkParameterIsNotNull(todo, "addedTodo");
        if (getCurrentFilter() != TodoFilterType.FROM_DOCS && getCurrentFilter() != TodoFilterType.COMPLETED) {
            updateTodoFilterByAddTodo(todo);
            this.isAddedScene = true;
            String str = todo.guid;
            Intrinsics.checkExpressionValueIsNotNull(str, "addedTodo.guid");
            this.addedTodoGuid = str;
            Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C56908r(this, todo, null), 3, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainViewModel$getPagingItems$1", mo239173f = "TodoMainViewModel.kt", mo239174i = {0, 1}, mo239175l = {SmEvents.EVENT_HB_NOTICE_DISCONNECT, 208}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch"}, mo239178s = {"L$0", "L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.f$l */
    public static final class C56902l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isFetchFirstPage;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoMainViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56902l(TodoMainViewModel fVar, boolean z, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
            this.$isFetchFirstPage = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56902l lVar = new C56902l(this.this$0, this.$isFetchFirstPage, cVar);
            lVar.p$ = (CoroutineScope) obj;
            return lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56902l) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                if (this.$isFetchFirstPage) {
                    TodoMainModel dVar = this.this$0.mTodoMainModel;
                    TodoFilterType currentFilter = this.this$0.getCurrentFilter();
                    this.L$0 = ahVar;
                    this.label = 1;
                    if (dVar.mo193297a(currentFilter, this) == a) {
                        return a;
                    }
                } else {
                    TodoMainModel dVar2 = this.this$0.mTodoMainModel;
                    TodoFilterType currentFilter2 = this.this$0.getCurrentFilter();
                    this.L$0 = ahVar;
                    this.label = 2;
                    if (dVar2.mo193314b(currentFilter2, this) == a) {
                        return a;
                    }
                    return Unit.INSTANCE;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else if (i == 2) {
                CoroutineScope ahVar3 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
                return Unit.INSTANCE;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainViewModel$loadAllTodoDatas$1", mo239173f = "TodoMainViewModel.kt", mo239174i = {0, 1}, mo239175l = {343, 345}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch"}, mo239178s = {"L$0", "L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.f$o */
    public static final class C56905o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $forceUpdate;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoMainViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56905o(TodoMainViewModel fVar, boolean z, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
            this.$forceUpdate = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56905o oVar = new C56905o(this.this$0, this.$forceUpdate, cVar);
            oVar.p$ = (CoroutineScope) obj;
            return oVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56905o) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                if (this.$forceUpdate) {
                    TodoMainModel dVar = this.this$0.mTodoMainModel;
                    TodoFilterType currentFilter = this.this$0.getCurrentFilter();
                    SortDialog.SortType currentFilterSortType = this.this$0.getCurrentFilterSortType();
                    this.L$0 = ahVar;
                    this.label = 1;
                    if (dVar.mo193296a(currentFilter, currentFilterSortType, this) == a) {
                        return a;
                    }
                } else {
                    TodoMainModel dVar2 = this.this$0.mTodoMainModel;
                    this.L$0 = ahVar;
                    this.label = 2;
                    if (dVar2.mo193324c(this) == a) {
                        return a;
                    }
                }
            } else if (i == 1 || i == 2) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainViewModel$setCompleted$1", mo239173f = "TodoMainViewModel.kt", mo239174i = {0, 1}, mo239175l = {374, 376}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch"}, mo239178s = {"L$0", "L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.f$s */
    public static final class C56909s extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TodoDisplayItem $todoDisplayItem;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoMainViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56909s(TodoMainViewModel fVar, TodoDisplayItem todoDisplayItem, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
            this.$todoDisplayItem = todoDisplayItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56909s sVar = new C56909s(this.this$0, this.$todoDisplayItem, cVar);
            sVar.p$ = (CoroutineScope) obj;
            return sVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56909s) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                VibrateUtil.f139263a.mo191785a();
                if (C56913g.f140472f[this.this$0.getCurrentFilter().ordinal()] == 1) {
                    this.this$0.setDocsCompleted(this.$todoDisplayItem);
                } else if (!MultiCompleteHelper.f139390a.mo191984a(this.$todoDisplayItem.mo193189x())) {
                    TodoMainViewModel fVar = this.this$0;
                    TodoDisplayItem todoDisplayItem = this.$todoDisplayItem;
                    this.L$0 = ahVar;
                    this.label = 1;
                    if (fVar.clickCompleteOutMultiStrategy(todoDisplayItem, this) == a) {
                        return a;
                    }
                } else {
                    TodoMainViewModel fVar2 = this.this$0;
                    TodoDisplayItem todoDisplayItem2 = this.$todoDisplayItem;
                    this.L$0 = ahVar;
                    this.label = 2;
                    if (fVar2.clickCompleteInMultiStrategy(todoDisplayItem2, this) == a) {
                        return a;
                    }
                }
            } else if (i == 1 || i == 2) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainViewModel$setDocsCompleted$1", mo239173f = "TodoMainViewModel.kt", mo239174i = {0}, mo239175l = {446}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.f$t */
    public static final class C56910t extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TodoDisplayItem $todoDisplayItem;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoMainViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56910t(TodoMainViewModel fVar, TodoDisplayItem todoDisplayItem, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
            this.$todoDisplayItem = todoDisplayItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56910t tVar = new C56910t(this.this$0, this.$todoDisplayItem, cVar);
            tVar.p$ = (CoroutineScope) obj;
            return tVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56910t) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                if (this.$todoDisplayItem.mo193171h()) {
                    TodoHitPoint.m221744b(this.$todoDisplayItem.mo193167e());
                } else {
                    TodoHitPoint.m221731a(this.$todoDisplayItem.mo193167e(), TodoHitPoint.m221741b(this.this$0.getCurrentFilter()));
                }
                TodoGeneralHitPoint.f141070a.mo194180a(this.$todoDisplayItem.mo193167e(), !this.$todoDisplayItem.mo193171h(), "done_task");
                TodoFilterType currentFilter = this.this$0.getCurrentFilter();
                this.L$0 = ahVar;
                this.label = 1;
                if (this.this$0.mTodoMainModel.mo193302a(this.$todoDisplayItem.mo193167e(), !this.$todoDisplayItem.mo193171h(), currentFilter, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainViewModel$updateTodoListByPush$1", mo239173f = "TodoMainViewModel.kt", mo239174i = {0}, mo239175l = {522}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.f$v */
    public static final class C56912v extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChangedTodoCollection $collection;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoMainViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56912v(TodoMainViewModel fVar, ChangedTodoCollection changedTodoCollection, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
            this.$collection = changedTodoCollection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56912v vVar = new C56912v(this.this$0, this.$collection, cVar);
            vVar.p$ = (CoroutineScope) obj;
            return vVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56912v) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoMainModel dVar = this.this$0.mTodoMainModel;
                List<String> list = this.$collection.added_todo_idents;
                Intrinsics.checkExpressionValueIsNotNull(list, "collection.added_todo_idents");
                List<String> list2 = this.$collection.updated_todo_idents;
                Intrinsics.checkExpressionValueIsNotNull(list2, "collection.updated_todo_idents");
                List<String> list3 = this.$collection.deleted_todo_idents;
                Intrinsics.checkExpressionValueIsNotNull(list3, "collection.deleted_todo_idents");
                TodoFilterType currentFilter = this.this$0.getCurrentFilter();
                this.L$0 = ahVar;
                this.label = 1;
                if (dVar.mo193303a(list, list2, list3, currentFilter, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    private final String getEmptyStrByFilterType(TodoFilterType todoFilterType) {
        switch (C56913g.f140467a[todoFilterType.ordinal()]) {
            case 1:
                return ResUtil.f139261a.mo191781c(R.string.Todo_Task_TaskEmpty);
            case 2:
                return ResUtil.f139261a.mo191781c(R.string.Todo_Task_AssignedTaskEmptyTip);
            case 3:
                return ResUtil.f139261a.mo191781c(R.string.Todo_Task_ReceivedTaskEmpty);
            case 4:
                return ResUtil.f139261a.mo191781c(R.string.Todo_Task_FinishedTaskEmpty);
            case 5:
                return ResUtil.f139261a.mo191781c(R.string.Todo_Task_FollowingTaskEmpty);
            case 6:
                return ResUtil.f139261a.mo191781c(R.string.Todo_Task_NoTaskFromDocsEmptyState);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public void resetTitleStateByType(TodoFilterType todoFilterType) {
        Intrinsics.checkParameterIsNotNull(todoFilterType, ShareHitPoint.f121869d);
        int i = C56913g.f140470d[todoFilterType.ordinal()];
        if (i == 1) {
            this.midTitleState.put(TodoFilterType.ALL, getTitleStateMap());
        } else if (i == 2) {
            this.midTitleState.put(TodoFilterType.ASSIGN_FROM_ME, getTitleStateMap());
        } else if (i == 3) {
            this.midTitleState.put(TodoFilterType.ASSIGN_TO_ME, getTitleStateMap());
        } else if (i == 4) {
            this.midTitleState.put(TodoFilterType.FOLLOWED, getTitleStateMap());
        } else if (i == 5) {
            this.midTitleState.put(TodoFilterType.FROM_DOCS, getDocsTitleStateMap());
        }
    }

    public final void updateChildCountByType(TodoListView todoListView) {
        TodoListView.Type type = todoListView.type;
        if (type != null) {
            int i = C56913g.f140471e[type.ordinal()];
            if (i == 1) {
                TodoFilterType todoFilterType = TodoFilterType.ALL;
                Integer num = todoListView.child_count;
                Intrinsics.checkExpressionValueIsNotNull(num, "todoListView.child_count");
                this.mFilterNumMap.put(todoFilterType, num);
            } else if (i == 2) {
                TodoFilterType todoFilterType2 = TodoFilterType.ASSIGN_FROM_ME;
                Integer num2 = todoListView.child_count;
                Intrinsics.checkExpressionValueIsNotNull(num2, "todoListView.child_count");
                this.mFilterNumMap.put(todoFilterType2, num2);
            } else if (i == 3) {
                TodoFilterType todoFilterType3 = TodoFilterType.ASSIGN_TO_ME;
                Integer num3 = todoListView.child_count;
                Intrinsics.checkExpressionValueIsNotNull(num3, "todoListView.child_count");
                this.mFilterNumMap.put(todoFilterType3, num3);
            } else if (i == 4) {
                TodoFilterType todoFilterType4 = TodoFilterType.FOLLOWED;
                Integer num4 = todoListView.child_count;
                Intrinsics.checkExpressionValueIsNotNull(num4, "todoListView.child_count");
                this.mFilterNumMap.put(todoFilterType4, num4);
            }
        }
        getFilterNumMapLv().mo5926a(this.mFilterNumMap);
    }

    public void updateCurrentSortType(SortDialog.SortType sortType) {
        TodoListView.Type type;
        TodoSortType todoSortType;
        Intrinsics.checkParameterIsNotNull(sortType, "sortType");
        if (getCurrentFilter() != TodoFilterType.COMPLETED) {
            switch (C56913g.f140478l[getCurrentFilter().ordinal()]) {
                case 1:
                    type = TodoListView.Type.ALL;
                    break;
                case 2:
                    type = TodoListView.Type.ASSIGN_FROM_ME;
                    break;
                case 3:
                    type = TodoListView.Type.ASSIGN_TO_ME;
                    break;
                case 4:
                    type = TodoListView.Type.COMPLETED;
                    break;
                case 5:
                    type = TodoListView.Type.FOLLOWED;
                    break;
                case 6:
                    type = TodoListView.Type.FROM_DOC;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (sortType == SortDialog.SortType.DUE_TIME) {
                todoSortType = TodoSortType.DUE_TIME;
            } else {
                todoSortType = TodoSortType.CREATE_TIME;
            }
            TodoListViewSetting todoListViewSetting = new TodoListViewSetting(type, todoSortType);
            TodoSettingService.Companion aVar = TodoSettingService.f141012a;
            UIGetDataCallback wrapAndAddGetDataCallback = new CallbackManager().wrapAndAddGetDataCallback(new C56911u(this, sortType));
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "CallbackManager().wrapAn…         }\n            })");
            aVar.mo194069a(todoListViewSetting, wrapAndAddGetDataCallback);
        }
    }

    public void updateTodoListByPush(TodoChangeNotificationUnit todoChangeNotificationUnit) {
        Intrinsics.checkParameterIsNotNull(todoChangeNotificationUnit, "pushData");
        Log.m165389i("TodoMainViewModel", LogMessageUtil.f139260a.mo191769b("updateTodoListByPush"));
        ChangedTodoCollection changedTodoCollection = todoChangeNotificationUnit.getChangedTodoCollection();
        if (changedTodoCollection != null) {
            int i = C56913g.f140476j[getCurrentFilter().ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                loadAllTodoDatas(true);
            } else if (i == 5) {
                Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C56912v(this, changedTodoCollection, null), 3, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainViewModel$changeStatusTodo$1", mo239173f = "TodoMainViewModel.kt", mo239174i = {0, 1, 2}, mo239175l = {453, 458, 462}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "$this$launch"}, mo239178s = {"L$0", "L$0", "L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.f$d */
    public static final class C56894d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TodoDisplayItem $todoDisplayItem;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoMainViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56894d(TodoMainViewModel fVar, TodoDisplayItem todoDisplayItem, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
            this.$todoDisplayItem = todoDisplayItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56894d dVar = new C56894d(this.this$0, this.$todoDisplayItem, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56894d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                int i2 = C56913g.f140475i[this.$todoDisplayItem.mo193179o().ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        TodoMainModel dVar = this.this$0.mTodoMainModel;
                        String e = this.$todoDisplayItem.mo193167e();
                        TodoSource x = this.$todoDisplayItem.mo193189x();
                        TodoFilterType currentFilter = this.this$0.getCurrentFilter();
                        this.L$0 = ahVar;
                        this.label = 2;
                        if (dVar.mo193299a(e, x, currentFilter, this) == a) {
                            return a;
                        }
                    } else if (i2 == 3) {
                        TodoMainModel dVar2 = this.this$0.mTodoMainModel;
                        String e2 = this.$todoDisplayItem.mo193167e();
                        TodoSource x2 = this.$todoDisplayItem.mo193189x();
                        TodoFilterType currentFilter2 = this.this$0.getCurrentFilter();
                        this.L$0 = ahVar;
                        this.label = 3;
                        if (dVar2.mo193316b(e2, x2, currentFilter2, this) == a) {
                            return a;
                        }
                    }
                    return Unit.INSTANCE;
                }
                TodoMainModel dVar3 = this.this$0.mTodoMainModel;
                String e3 = this.$todoDisplayItem.mo193167e();
                this.L$0 = ahVar;
                this.label = 1;
                if (dVar3.mo193301a(e3, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else if (i == 2 || i == 3) {
                CoroutineScope ahVar3 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
                return Unit.INSTANCE;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.showToastMessage(R.string.Todo_Task_TaskDeleted, OperationToastHelper.ToastType.SUCCESS);
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainViewModel$changeTodoCompleteStatus$1", mo239173f = "TodoMainViewModel.kt", mo239174i = {0, 1}, mo239175l = {763, 766}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch"}, mo239178s = {"L$0", "L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.f$e */
    public static final class C56895e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isTargetComplete;
        final /* synthetic */ TodoDisplayItem $todoDisplayItem;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoMainViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56895e(TodoMainViewModel fVar, TodoDisplayItem todoDisplayItem, boolean z, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
            this.$todoDisplayItem = todoDisplayItem;
            this.$isTargetComplete = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56895e eVar = new C56895e(this.this$0, this.$todoDisplayItem, this.$isTargetComplete, cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56895e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoGeneralHitPoint.f141070a.mo194180a(this.$todoDisplayItem.mo193167e(), this.$isTargetComplete, "done_all_task");
                if (!this.$isTargetComplete) {
                    this.L$0 = ahVar;
                    this.label = 1;
                    if (this.this$0.mTodoMainModel.mo193315b(this.$todoDisplayItem.mo193167e(), this.$todoDisplayItem.mo193189x(), MarkTodoCompletedRequest.Type.Todo, new ArrayList(), this) == a) {
                        return a;
                    }
                } else {
                    this.L$0 = ahVar;
                    this.label = 2;
                    if (this.this$0.mTodoMainModel.mo193298a(this.$todoDisplayItem.mo193167e(), this.$todoDisplayItem.mo193189x(), MarkTodoCompletedRequest.Type.Todo, new ArrayList(), this) == a) {
                        return a;
                    }
                }
            } else if (i == 1 || i == 2) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.showOperationSuccessToast();
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainViewModel$getDocsPagingItems$1", mo239173f = "TodoMainViewModel.kt", mo239174i = {0, 1}, mo239175l = {222, 224}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch"}, mo239178s = {"L$0", "L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.f$k */
    public static final class C56901k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isFetchFirstPage;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoMainViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56901k(TodoMainViewModel fVar, boolean z, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
            this.$isFetchFirstPage = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56901k kVar = new C56901k(this.this$0, this.$isFetchFirstPage, cVar);
            kVar.p$ = (CoroutineScope) obj;
            return kVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56901k) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                LoadTitleType b = this.this$0.mTodoMainModel.mo193333i().mo5927b();
                if (b != null && C56913g.f140468b[b.ordinal()] == 1) {
                    this.L$0 = ahVar;
                    this.label = 1;
                    if (this.this$0.mTodoMainModel.mo193294a(this.this$0.getCurrentFilter(), this.this$0.mViewSortTypeMap.get(TodoFilterType.FROM_DOCS), this) == a) {
                        return a;
                    }
                } else {
                    boolean z = this.$isFetchFirstPage;
                    this.L$0 = ahVar;
                    this.label = 2;
                    if (this.this$0.mTodoMainModel.mo193295a(this.this$0.getCurrentFilter(), this.this$0.mViewSortTypeMap.get(TodoFilterType.FROM_DOCS), z, this) == a) {
                        return a;
                    }
                }
            } else if (i == 1 || i == 2) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoMainViewModel(Application application) {
        super(application);
        Intrinsics.checkParameterIsNotNull(application, "application");
        TodoMainModel dVar = TodoMainModel.f140434a;
        this.mTodoMainModel = dVar;
        LiveData<List<TodoDisplayItem>> b = C1138ae.m5355b(dVar.mo193291a(), new C56892a(this));
        Intrinsics.checkExpressionValueIsNotNull(b, "Transformations.switchMap(this) { transform(it) }");
        this.items = b;
        this.operationToastUnit = dVar.mo193321c();
        this.badgeSettingUnit = dVar.mo193326d();
        this.shareEntity = new C1177w<>(new ShareEntity(ShareStatus.NO_LOADING, null, 2, null));
        this.currentViewSortTypeLV = new C1177w<>();
        this.showCompleteDialog = new C1177w<>();
        this.showActiveDialog = new C1177w<>();
        this.mListItemsSet = new HashSet<>();
        this.addedTodoGuid = "";
        initialData();
    }

    private final void updateTodoFilterByAddTodo(Todo todo) {
        TimeZone timeZone;
        TodoFilterType currentFilter = getCurrentFilter();
        if (currentFilter == TodoFilterType.ALL || currentFilter == TodoFilterType.ASSIGN_TO_ME || currentFilter == TodoFilterType.ASSIGN_FROM_ME) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            Boolean bool = todo.is_all_day;
            Intrinsics.checkExpressionValueIsNotNull(bool, "addedTodo.is_all_day");
            if (bool.booleanValue()) {
                timeZone = TimeZone.getTimeZone("UTC");
            } else {
                timeZone = TimeZone.getDefault();
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setTimeInMillis(todo.due_time.longValue() * ((long) 1000));
            Long l = todo.due_time;
            if (l == null || l.longValue() != 0) {
                TodoDisplayHelper aVar = TodoDisplayHelper.f140267a;
                Boolean bool2 = todo.is_all_day;
                Intrinsics.checkExpressionValueIsNotNull(bool2, "addedTodo.is_all_day");
                if (aVar.mo193136a(bool2.booleanValue(), gregorianCalendar2, gregorianCalendar)) {
                    changeTitleState(TodoDisplayItem.TitleType.OVER_DUE, true);
                    return;
                }
            }
            if (TodoDisplayHelper.f140267a.mo193135a(gregorianCalendar2, gregorianCalendar)) {
                changeTitleState(TodoDisplayItem.TitleType.TODAY, true);
            } else if (TodoDisplayHelper.f140267a.mo193137b(gregorianCalendar2, gregorianCalendar)) {
                changeTitleState(TodoDisplayItem.TitleType.IN_WEEK, true);
            } else {
                changeTitleState(TodoDisplayItem.TitleType.OTHER, true);
            }
        }
    }

    public void updateTodoSetting(TodoSetting todoSetting) {
        Intrinsics.checkParameterIsNotNull(todoSetting, "todoSetting");
        SortDialog.SortType currentFilterSortType = getCurrentFilterSortType();
        List<TodoListViewSetting> list = todoSetting.tab_view_settings;
        if (list != null) {
            for (T t : list) {
                TodoListView.Type type = t.view;
                if (type != null) {
                    int i = C56913g.f140479m[type.ordinal()];
                    if (i == 1) {
                        TodoFilterType todoFilterType = TodoFilterType.ALL;
                        TodoSortType todoSortType = t.sort_type;
                        Intrinsics.checkExpressionValueIsNotNull(todoSortType, "it.sort_type");
                        this.mViewSortTypeMap.put(todoFilterType, todoSortType);
                    } else if (i == 2) {
                        TodoFilterType todoFilterType2 = TodoFilterType.ASSIGN_FROM_ME;
                        TodoSortType todoSortType2 = t.sort_type;
                        Intrinsics.checkExpressionValueIsNotNull(todoSortType2, "it.sort_type");
                        this.mViewSortTypeMap.put(todoFilterType2, todoSortType2);
                    } else if (i == 3) {
                        TodoFilterType todoFilterType3 = TodoFilterType.ASSIGN_TO_ME;
                        TodoSortType todoSortType3 = t.sort_type;
                        Intrinsics.checkExpressionValueIsNotNull(todoSortType3, "it.sort_type");
                        this.mViewSortTypeMap.put(todoFilterType3, todoSortType3);
                    } else if (i == 4) {
                        TodoFilterType todoFilterType4 = TodoFilterType.COMPLETED;
                        TodoSortType todoSortType4 = t.sort_type;
                        Intrinsics.checkExpressionValueIsNotNull(todoSortType4, "it.sort_type");
                        this.mViewSortTypeMap.put(todoFilterType4, todoSortType4);
                    } else if (i == 5) {
                        TodoFilterType todoFilterType5 = TodoFilterType.FOLLOWED;
                        TodoSortType todoSortType5 = t.sort_type;
                        Intrinsics.checkExpressionValueIsNotNull(todoSortType5, "it.sort_type");
                        this.mViewSortTypeMap.put(todoFilterType5, todoSortType5);
                    }
                }
            }
        }
        SortDialog.SortType currentFilterSortType2 = getCurrentFilterSortType();
        if (!(getCurrentFilter() == TodoFilterType.COMPLETED || currentFilterSortType == currentFilterSortType2)) {
            getCurrentViewSortTypeLV().mo5926a(currentFilterSortType2);
            this.mTodoMainModel.mo193309a(currentFilterSortType2, getCurrentFilter());
        }
        TodoBadgeConfig todoBadgeConfig = todoSetting.badge_config;
        if (todoBadgeConfig != null) {
            this.mTodoMainModel.mo193326d().mo5926a(todoBadgeConfig);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainViewModel$loadAllTodoViews$1", mo239173f = "TodoMainViewModel.kt", mo239174i = {0}, mo239175l = {255}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.f$p */
    public static final class C56906p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoMainViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56906p(TodoMainViewModel fVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56906p pVar = new C56906p(this.this$0, cVar);
            pVar.p$ = (CoroutineScope) obj;
            return pVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56906p) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoMainModel dVar = this.this$0.mTodoMainModel;
                this.L$0 = ahVar;
                this.label = 1;
                obj = dVar.mo193304a(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            DataResult aVar = (DataResult) obj;
            if (aVar instanceof DataResult.DataSuccess) {
                DataResult.DataSuccess cVar = (DataResult.DataSuccess) aVar;
                if (cVar.mo194115a() != null) {
                    List<TodoListView> a2 = ((TodoListData) cVar.mo194115a()).mo193206a();
                    List<TodoListViewSetting> b = ((TodoListData) cVar.mo194115a()).mo193207b();
                    if (a2 != null) {
                        Iterator<T> it = a2.iterator();
                        while (it.hasNext()) {
                            this.this$0.updateChildCountByType(it.next());
                        }
                    }
                    if (b != null) {
                        for (T t : b) {
                            TodoListView.Type type = t.view;
                            if (type != null) {
                                switch (C56913g.f140469c[type.ordinal()]) {
                                    case 1:
                                        TodoFilterType todoFilterType = TodoFilterType.ALL;
                                        TodoSortType todoSortType = t.sort_type;
                                        Intrinsics.checkExpressionValueIsNotNull(todoSortType, "it.sort_type");
                                        this.this$0.mViewSortTypeMap.put(todoFilterType, todoSortType);
                                        continue;
                                    case 2:
                                        TodoFilterType todoFilterType2 = TodoFilterType.ASSIGN_FROM_ME;
                                        TodoSortType todoSortType2 = t.sort_type;
                                        Intrinsics.checkExpressionValueIsNotNull(todoSortType2, "it.sort_type");
                                        this.this$0.mViewSortTypeMap.put(todoFilterType2, todoSortType2);
                                        continue;
                                    case 3:
                                        TodoFilterType todoFilterType3 = TodoFilterType.ASSIGN_TO_ME;
                                        TodoSortType todoSortType3 = t.sort_type;
                                        Intrinsics.checkExpressionValueIsNotNull(todoSortType3, "it.sort_type");
                                        this.this$0.mViewSortTypeMap.put(todoFilterType3, todoSortType3);
                                        continue;
                                    case 4:
                                        TodoFilterType todoFilterType4 = TodoFilterType.COMPLETED;
                                        TodoSortType todoSortType4 = t.sort_type;
                                        Intrinsics.checkExpressionValueIsNotNull(todoSortType4, "it.sort_type");
                                        this.this$0.mViewSortTypeMap.put(todoFilterType4, todoSortType4);
                                        continue;
                                    case 5:
                                        TodoFilterType todoFilterType5 = TodoFilterType.FOLLOWED;
                                        TodoSortType todoSortType5 = t.sort_type;
                                        Intrinsics.checkExpressionValueIsNotNull(todoSortType5, "it.sort_type");
                                        this.this$0.mViewSortTypeMap.put(todoFilterType5, todoSortType5);
                                        continue;
                                    case 6:
                                        TodoFilterType todoFilterType6 = TodoFilterType.FROM_DOCS;
                                        TodoSortType todoSortType6 = t.sort_type;
                                        Intrinsics.checkExpressionValueIsNotNull(todoSortType6, "it.sort_type");
                                        this.this$0.mViewSortTypeMap.put(todoFilterType6, todoSortType6);
                                        continue;
                                }
                            }
                        }
                    }
                    if (!(this.this$0.getCurrentFilter() == TodoFilterType.COMPLETED || this.this$0.getCurrentFilter() == TodoFilterType.FROM_DOCS)) {
                        this.this$0.loadAllTodoDatas(true);
                        this.this$0.getCurrentViewSortTypeLV().mo5926a(this.this$0.getCurrentFilterSortType());
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final LiveData<List<TodoDisplayItem>> getDisplayTodosResult(DataResult<TodoListResult> aVar) {
        C1177w wVar = new C1177w();
        if (aVar == null) {
            Log.m165383e("TodoMainViewModel", "todo result is null");
            return wVar;
        }
        if (aVar instanceof DataResult.DataSuccess) {
            DataResult.DataSuccess cVar = (DataResult.DataSuccess) aVar;
            if (((TodoListResult) cVar.mo194115a()).mo193212b() != getCurrentFilter()) {
                Log.m165383e("TodoMainViewModel", "belongFilter cannot match current filter");
                return wVar;
            }
            List<TodoDisplayItem> a = TodoDisplayHelper.f140267a.mo193134a(ResUtil.f139261a.mo191776a(), ((TodoListResult) cVar.mo194115a()).mo193211a(), this.mTimeFormatDependency.mo145434b(), getCurrentFilter(), getCurrentFilterSortType(), this.midTitleState.get(getCurrentFilter()), isShowBadgeOverdue(), isShowBadgeToday());
            if ((!a.isEmpty()) && getCurrentFilterSortType() == SortDialog.SortType.CREATE_TIME) {
                a.get(a.size() - 1).mo193159a(true);
                a.get(0).mo193162b(true);
            }
            wVar.mo5929b(a);
            getDataFetchStatus().mo5929b(TodoFetchStatus.SUCCESS);
            getNoTodoLabel().mo5929b(Boolean.valueOf(CollectionUtils.isEmpty((Collection) wVar.mo5927b())));
            getNoTodoText().mo5929b(getEmptyStrByFilterType(getCurrentFilter()));
            if (this.isAddedScene) {
                getMoveToCreateItemLv().mo5926a(this.addedTodoGuid);
                this.isAddedScene = false;
            }
        } else if (aVar instanceof DataResult.DataError) {
            if (Intrinsics.areEqual(((DataResult.DataError) aVar).mo194112a().getMessage(), "fetch first page error")) {
                wVar.mo5929b(CollectionsKt.emptyList());
                getDataFetchStatus().mo5929b(TodoFetchStatus.FIRST_PAGE_FAILED);
            } else {
                getDataFetchStatus().mo5929b(TodoFetchStatus.NEXT_PAGE_FAILED);
            }
        }
        return wVar;
    }

    public final void changeTodoCompleteStatus(boolean z, TodoDisplayItem todoDisplayItem) {
        Intrinsics.checkParameterIsNotNull(todoDisplayItem, "todoDisplayItem");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C56895e(this, todoDisplayItem, z, null), 3, null);
    }

    public final void completeDocsTodo(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "todoGuid");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C56898h(this, str, z, null), 3, null);
    }

    public final void deleteDocsAssigneeTodo(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "todoGuid");
        Intrinsics.checkParameterIsNotNull(str2, "assignId");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C56899i(this, str, str2, null), 3, null);
    }

    public boolean isInCustomCompleteStrategy(Context context, CustomComplete.Action action) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (action != null) {
            return CustomCompleteHelper.f139396a.mo191997a(context, action, new C56903m(this));
        }
        return false;
    }

    public void loadMoreTodoDatas(boolean z, int i) {
        if (z) {
            loadPagingDatas(false);
        } else if (!this.mListItemsSet.contains(Integer.valueOf(i))) {
            loadPagingDatas(false);
            this.mListItemsSet.add(Integer.valueOf(i));
        }
    }

    public final void showToastMessage(int i, OperationToastHelper.ToastType toastType) {
        Intrinsics.checkParameterIsNotNull(toastType, ShareHitPoint.f121869d);
        getToastUnit().mo5926a(new Event<>(new TodoListToastUnit(i, toastType, null, 4, null)));
    }

    public void changeTitleState(TodoDisplayItem.TitleType titleType, boolean z) {
        Intrinsics.checkParameterIsNotNull(titleType, "titleType");
        HashMap<TodoDisplayItem.TitleType, Boolean> hashMap = this.midTitleState.get(getCurrentFilter());
        if (hashMap != null) {
            Intrinsics.checkExpressionValueIsNotNull(hashMap, "midTitleState[getCurrentFilter()] ?: return");
            hashMap.put(titleType, Boolean.valueOf(z));
            int i = C56913g.f140480n[titleType.ordinal()];
            if (i == 1) {
                changeDocsDoneTitleState(z);
            } else if (i != 2) {
                loadAllTodoDatas(false);
            } else {
                changeDocsDoingTitleState(z);
            }
        }
    }

    public void setFilterType(TodoFilterType todoFilterType, boolean z) {
        Intrinsics.checkParameterIsNotNull(todoFilterType, "targetFilterType");
        getFilterType().mo5929b(todoFilterType);
        getCurrentViewSortTypeLV().mo5926a(getCurrentFilterSortType());
        if (z) {
            if (getCurrentFilter() == TodoFilterType.COMPLETED || getCurrentFilter() == TodoFilterType.FROM_DOCS) {
                loadPagingDatas(true);
            } else {
                loadAllTodoDatas(true);
            }
        }
        handleBadgePush(getCurrentFilterSortType());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object clickCompleteOutMultiStrategy(com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
        // Method dump skipped, instructions count: 202
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainViewModel.clickCompleteOutMultiStrategy(com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object clickCompleteInMultiStrategy(com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
        // Method dump skipped, instructions count: 284
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainViewModel.clickCompleteInMultiStrategy(com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem, kotlin.coroutines.c):java.lang.Object");
    }

    public void shareTodo(ArrayList<String> arrayList, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(arrayList, "chatIds");
        Intrinsics.checkParameterIsNotNull(str, Comment.f24093e);
        Intrinsics.checkParameterIsNotNull(str2, "guid");
        ShareProcess.f139407a.mo192005a(getShareEntity(), arrayList, str, str2, C1143ag.m5356a(this));
    }
}
