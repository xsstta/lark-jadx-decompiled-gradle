package com.ss.android.lark.chat.chatwindow.chat.v2.plugin;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.blockit.C24062d;
import com.larksuite.component.blockit.entity.ActionType;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.entity.BlockExtra;
import com.larksuite.component.blockit.entity.BlockTypeID;
import com.larksuite.component.blockit.entity.Domain;
import com.larksuite.component.blockit.entity.richtext.MessageContentEntity;
import com.larksuite.component.blockit.entity.richtext.RichTextMessage;
import com.larksuite.component.blockit.entity.richtext.TextEntity;
import com.larksuite.component.blockit.entity.todo.MultiMessage;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.aj;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardTopExtendComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageCallbackHandler;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.utils.C34352r;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatwindow.C35212a;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.chatwindow.view.WindowDialogManager;
import com.ss.android.lark.chatwindow.view.selectline.FollowingSelectLine;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36495k;
import com.ss.android.lark.dependency.AbstractC36498n;
import com.ss.android.lark.dependency.AbstractC36508v;
import com.ss.android.lark.dependency.IChatSettingDependency;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.doc.entity.DocPermPair;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.dto.chat.GetMessageIdsByPositionResponse;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.guide.ui.config.TextBubbleConfig;
import com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38708a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.meego.C44855b;
import com.ss.android.lark.statistics.bulid_group.BuildGroupHitPoint;
import com.ss.android.lark.statistics.doc.DocHitPoint;
import com.ss.android.lark.statistics.multiselect.MultiSelectHitPoint;
import com.ss.android.lark.statistics.multiselect.MultiSelectHitPointNew;
import com.ss.android.lark.statistics.perf.PerfCreateGroupMonitor;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.C69043h;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0002;Y\u0018\u0000 \u00012\u00020\u0001:\u0004\u0001\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010J\u001a\u00020A2\u0006\u0010K\u001a\u00020LH\u0002J\b\u0010M\u001a\u00020AH\u0002J\b\u0010N\u001a\u00020AH\u0002J:\u0010O\u001a\u00020A2\u0006\u0010P\u001a\u00020\u00192\u000e\u0010Q\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001042\b\u0010R\u001a\u0004\u0018\u00010\u001b2\u000e\u0010S\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010TH\u0002J\u0010\u0010V\u001a\u00020A2\u0006\u0010W\u001a\u00020\u0019H\u0002J\r\u0010X\u001a\u00020YH\u0002¢\u0006\u0002\u0010ZJ\u0010\u0010[\u001a\u00020\u00192\u0006\u0010\\\u001a\u00020\u0019H\u0002J\u001c\u0010]\u001a\b\u0012\u0004\u0012\u00020\t042\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u001b04H\u0002J\u0010\u0010_\u001a\u00020\u001b2\u0006\u0010`\u001a\u00020aH\u0002J \u0010b\u001a\b\u0012\u0004\u0012\u00020\u001b0T2\u0010\u0010c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030d04H\u0002J\u001c\u0010e\u001a\b\u0012\u0004\u0012\u00020\u001b0T2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020\t04H\u0002J\"\u0010g\u001a\u00020A2\u0018\u0010h\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t04\u0012\u0004\u0012\u00020A0@H\u0002J\u001c\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00190T2\f\u0010j\u001a\b\u0012\u0004\u0012\u00020\t04H\u0002J\b\u0010k\u001a\u00020AH\u0002J\u001a\u0010l\u001a\u00020\u000b2\u0010\u0010m\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030d04H\u0002J\b\u0010n\u001a\u00020AH\u0002J\b\u0010o\u001a\u00020AH\u0002J\b\u0010p\u001a\u00020AH\u0002J\b\u0010q\u001a\u00020\u000bH\u0002J\u0010\u0010r\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020aH\u0002J\u0010\u0010s\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020aH\u0002J\u001e\u0010t\u001a\u00020\u000b2\f\u0010u\u001a\b\u0012\u0004\u0012\u00020\t042\u0006\u0010v\u001a\u00020wH\u0002J\u0010\u0010x\u001a\u00020\u000b2\u0006\u0010y\u001a\u00020'H\u0002J.\u0010z\u001a\b\u0012\u0004\u0012\u00020\t042\u0010\u0010{\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030d042\f\u0010|\u001a\b\u0012\u0004\u0012\u00020\u001b04H\u0002J\u0014\u0010}\u001a\u00020A2\f\u0010~\u001a\b\u0012\u0004\u0012\u00020\u001b04J\u0014\u0010\u001a\u00020A2\f\u0010~\u001a\b\u0012\u0004\u0012\u00020\u001b04J\t\u0010\u0001\u001a\u00020\u000bH\u0002JC\u0010\u0001\u001a\u00020A2\b\u0010\u0001\u001a\u00030\u00012\u000e\u0010Q\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001042\f\u0010~\u001a\b\u0012\u0004\u0012\u00020\u001b042\u0010\b\u0002\u0010S\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010TH\u0002J\u001b\u0010\u0001\u001a\u00020A2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0001\u001a\u00030\u0001H\u0016Jh\u0010\u0001\u001a\u00020A2\b\u0010\u0001\u001a\u00030\u00012\u000e\u0010Q\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001042\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b042\u0010\b\u0002\u0010S\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010T2\"\u0010\u0001\u001a\u001d\u0012\u0004\u0012\u00020\u001b\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0005\u0012\u00030\u00010\u00010\u0001H\u0002JS\u0010\u0001\u001a\u00020A2\b\u0010\u0001\u001a\u00030\u00012\u000e\u0010Q\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001042\f\u0010~\u001a\b\u0012\u0004\u0012\u00020\u001b042\u000e\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u0001042\u0010\b\u0002\u0010S\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010TH\u0002J\t\u0010\u0001\u001a\u00020AH\u0002J\t\u0010\u0001\u001a\u00020AH\u0002J\u0012\u0010\u0001\u001a\u00020A2\u0007\u0010\u0001\u001a\u00020\u001bH\u0002J\u0012\u0010\u0001\u001a\u00020A2\u0007\u0010\u0001\u001a\u00020\u001bH\u0002J\u0010\u0010\u0001\u001a\u00020A2\u0007\u0010\u0001\u001a\u00020\u001bJ\t\u0010\u0001\u001a\u00020AH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b\u001e\u0010\u001fR\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u00010/X\u000e¢\u0006\u0002\n\u0000R\u0016\u00103\u001a\n\u0012\u0004\u0012\u000205\u0018\u000104X\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u000109X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u00020;X\u000e¢\u0006\u0004\n\u0002\u0010<R\u000e\u0010=\u001a\u00020>X.¢\u0006\u0002\n\u0000R\"\u0010?\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t04\u0012\u0004\u0012\u00020A\u0018\u00010@X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010C\u001a\u00020D8BX\u0002¢\u0006\f\n\u0004\bG\u0010\u0015\u001a\u0004\bE\u0010FR\u000e\u0010H\u001a\u00020IX.¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/BaseChatPlugin;", "()V", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "chatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "followingSelectedMsgList", "", "Lcom/ss/android/lark/dto/chat/GetMessageIdsByPositionResponse$MessageTypeInfo;", "isPulledFollowingIds", "", "keyboardExtendComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardTopExtendComponent;", "keyboardListComponent", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent;", "loadingRunnable", "Ljava/lang/Runnable;", "getLoadingRunnable", "()Ljava/lang/Runnable;", "loadingRunnable$delegate", "Lkotlin/Lazy;", "mCurrentMode", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$ListMode;", "mCurrentRequestCode", "", "mDepartmentId", "", "mFollowingLineRect", "Landroid/graphics/Rect;", "getMFollowingLineRect", "()Landroid/graphics/Rect;", "mFollowingLineRect$delegate", "mFollowingSelectLine", "Lcom/ss/android/lark/chatwindow/view/selectline/FollowingSelectLine;", "mGroupBuilding", "mMessageListRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "mMultiProjectLayout", "Landroid/view/View;", "mMultiSelectActionLayout", "mMultiSelectCancelLayout", "mMultiSelectContainer", "mMultiSelectDeleteLayout", "mMultiSelectForwardLayout", "mMultiSelectSaveLayout", "mMultiSelectStub", "Landroid/view/ViewStub;", "mMultiTodoLayout", "mOneByOneForwardLayout", "mP2PBuildGroupStub", "mSelectEntityIds", "", "Lcom/ss/android/lark/chat/entity/chat/PickChatEntity;", "mSelectMessageCancel", "mSelectMessageContainer", "mSelectMessageOk", "Landroid/widget/TextView;", "mSelectedMessageChangeListener", "com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$mSelectedMessageChangeListener$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$mSelectedMessageChangeListener$1;", "messageListComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent;", "onPullFollowingIdsComplete", "Lkotlin/Function1;", "", "pullFollowingIdsComplete", "recyclerViewAdapterObserver", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "getRecyclerViewAdapterObserver", "()Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "recyclerViewAdapterObserver$delegate", "titleBarComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent;", "addFollowingSelectLineIfNeed", "rootView", "Landroid/widget/RelativeLayout;", "backToNormalMode", "changeFollowingLineVisibility", "changeToBuildGroupMode", "requestCode", "selectEntitiesId", "departmentId", "contactsToApply", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/contact/entity/Contact;", "changeToMultiSelectMode", "selectedPosition", "createRecyclerViewAdapterObserver", "com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$createRecyclerViewAdapterObserver$1", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$createRecyclerViewAdapterObserver$1;", "findFirstItemUnderMultiLine", "firstVisiblePos", "getFollowingMsgTypeInfosForIds", "ids", "getMessageTypeString", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "getSelectedMessageIds", "messageVOList", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "getSelectedMessageIdsByTypeInfo", "messageTypes", "getSelectedMessageTypeInfos", "callback", "getSelectedMessageTypes", "messageList", "gotoSelectChatterPage", "hasEnoughSelectableMsgs", "msgList", "initBuildGroupViewIfNeed", "initFollowingLine", "initMultiSelectViewIfNeed", "isFollowingSelectMessage", "isMessageTypeMultiActionable", "isMessageTypeMultiSaveable", "isSelectMessageValid", "selectedItems", "validChecker", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$IMessageValidChecker;", "isViewUnderMultiLine", "messageView", "margeSelectIds", "localMsgs", "followingIds", "multiDelete", "selectedMessageIds", "multiSave", "needShowFollowingSelectLine", "onConfirmP2PBuildGroup", "context", "Landroid/content/Context;", "onCreate", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "onCreateChatAndSyncMessages", "messageIds", "docsPermissions", "", "Lcom/ss/android/lark/doc/entity/DocPermPair$PermType;", "onP2PBuildGroup", "checkMessageInfoList", "Lcom/ss/android/lark/chat/entity/message/Message;", "registerAdapterDataObserver", "showOneByOneForwardGuide", "showToast", "msg", "showTooManyMessageDialog", "showUnSupportMultiSelectMessageDialog", "unregisterAdapterDataObserver", "Companion", "IMessageValidChecker", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i */
public final class MessageSelectPlugin extends BaseChatPlugin {

    /* renamed from: p */
    public static final Companion f86969p = new Companion(null);

    /* renamed from: A */
    private View f86970A;

    /* renamed from: B */
    private View f86971B;

    /* renamed from: C */
    private View f86972C;

    /* renamed from: D */
    private View f86973D;

    /* renamed from: E */
    private final Lazy f86974E = LazyKt.lazy(new C33781t(this));

    /* renamed from: F */
    private ViewStub f86975F;

    /* renamed from: G */
    private View f86976G;

    /* renamed from: H */
    private View f86977H;

    /* renamed from: I */
    private List<? extends PickChatEntity> f86978I;

    /* renamed from: J */
    private String f86979J;

    /* renamed from: K */
    private int f86980K = 7;

    /* renamed from: L */
    private final Lazy f86981L = LazyKt.lazy(new C33779s(this));

    /* renamed from: M */
    private final Lazy f86982M = LazyKt.lazy(new C33751ac(this));

    /* renamed from: a */
    public IMessageListComponent f86983a;

    /* renamed from: b */
    public Chat f86984b;

    /* renamed from: c */
    public RecyclerView f86985c;

    /* renamed from: d */
    public FollowingSelectLine f86986d;

    /* renamed from: e */
    public TextView f86987e;

    /* renamed from: f */
    public boolean f86988f;

    /* renamed from: g */
    public IMessageListComponent.ListMode f86989g = IMessageListComponent.ListMode.NORMAL;

    /* renamed from: h */
    public boolean f86990h;

    /* renamed from: l */
    public boolean f86991l;

    /* renamed from: m */
    public final List<GetMessageIdsByPositionResponse.MessageTypeInfo> f86992m = new ArrayList();

    /* renamed from: n */
    public Function1<? super List<GetMessageIdsByPositionResponse.MessageTypeInfo>, Unit> f86993n;

    /* renamed from: o */
    public C33782u f86994o = new C33782u(this);

    /* renamed from: q */
    private IKeyboardComponent f86995q;

    /* renamed from: r */
    private ITitlebarComponent f86996r;

    /* renamed from: s */
    private IKeyboardTopExtendComponent f86997s;

    /* renamed from: t */
    private IChatWindowApp f86998t;

    /* renamed from: u */
    private ViewStub f86999u;

    /* renamed from: v */
    private View f87000v;

    /* renamed from: w */
    private View f87001w;

    /* renamed from: x */
    private View f87002x;

    /* renamed from: y */
    private View f87003y;

    /* renamed from: z */
    private View f87004z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$IMessageValidChecker;", "", "isMessageValid", "", "message", "Lcom/ss/android/lark/dto/chat/GetMessageIdsByPositionResponse$MessageTypeInfo;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$b */
    public interface IMessageValidChecker {
        /* renamed from: a */
        boolean mo123798a(GetMessageIdsByPositionResponse.MessageTypeInfo aVar);
    }

    /* renamed from: l */
    private final Rect m130899l() {
        return (Rect) this.f86974E.getValue();
    }

    /* renamed from: m */
    private final RecyclerView.AdapterDataObserver m130900m() {
        return (RecyclerView.AdapterDataObserver) this.f86982M.getValue();
    }

    /* renamed from: b */
    public final Runnable mo123781b() {
        return (Runnable) this.f86981L.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$Companion;", "", "()V", "MULTI_SELECT_LIMIT", "", "MULTI_SELECT_LINE_MARGIN_TOP_DP", "", "SHOW_FOLLOWING_LINE_MSG_THRESHOLD", "SHOW_LOADING_TIME_THRESHOLD", "", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    /* renamed from: a */
    public void mo122114a(IChatWindowApp dVar, C35219b bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
        Intrinsics.checkParameterIsNotNull(bVar, "initData");
        super.mo122114a(dVar, bVar);
        Chat chat = bVar.f90956f;
        Intrinsics.checkExpressionValueIsNotNull(chat, "initData.chat");
        this.f86984b = chat;
        this.f86998t = dVar;
        this.f86983a = (IMessageListComponent) dVar.mo123122a(IMessageListComponent.class);
        this.f86995q = (IKeyboardComponent) dVar.mo123122a(IKeyboardComponent.class);
        this.f86996r = (ITitlebarComponent) dVar.mo123122a(ITitlebarComponent.class);
        this.f86997s = (IKeyboardTopExtendComponent) dVar.mo123122a(IKeyboardTopExtendComponent.class);
        dVar.mo123126a(new C33786y(this));
        IMessageListComponent iMessageListComponent = this.f86983a;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        if (iMessageListComponent != null) {
            iMessageListComponent.mo123312a(new C33787z(this));
        }
    }

    /* renamed from: a */
    public final void mo123775a(Context context, List<? extends PickChatEntity> list, List<String> list2, List<? extends Message> list3, ArrayList<Contact> arrayList) {
        HashMap hashMap = new HashMap();
        for (Message message : list3) {
            String id = message.getId();
            HashMap hashMap2 = new HashMap();
            if (message.isFromMe() && C34352r.m133230a(message)) {
                DocResult b = C34352r.m133234b(message);
                if (b == null) {
                    Intrinsics.throwNpe();
                }
                Doc doc = b.getDoc();
                Intrinsics.checkExpressionValueIsNotNull(doc, "docResult!!.doc");
                String url = doc.getUrl();
                Intrinsics.checkExpressionValueIsNotNull(url, "url");
                hashMap2.put(url, b);
            }
            if (!hashMap2.isEmpty()) {
                Intrinsics.checkExpressionValueIsNotNull(id, "msgId");
                hashMap.put(id, hashMap2);
            }
        }
        HashMap hashMap3 = hashMap;
        if (!hashMap3.isEmpty()) {
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36498n L = b2.mo134513L();
            if (context != null) {
                L.mo134672a((Activity) context, hashMap3, new C33750ab(this, context, list, list2, arrayList));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        mo123774a(context, list, list2, arrayList, new HashMap());
    }

    /* renamed from: a */
    public final void mo123774a(Context context, List<? extends PickChatEntity> list, List<String> list2, ArrayList<Contact> arrayList, Map<String, ? extends Map<String, ? extends DocPermPair.PermType>> map) {
        if (this.f86988f) {
            String string = UIHelper.getString(R.string.Lark_Legacy_P2pChatCreating);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…k_Legacy_P2pChatCreating)");
            mo123782b(string);
            return;
        }
        this.f86988f = true;
        UIGetDataCallback uIGetDataCallback = new UIGetDataCallback(new C33749aa(this, map));
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36495k M = b.mo134514M();
        ArrayList<Contact> arrayList2 = arrayList;
        Chat chat = this.f86984b;
        if (chat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chat");
        }
        M.mo134659a(context, list, arrayList2, chat.getId(), list2, map, uIGetDataCallback, true, this.f86980K == 7);
    }

    /* renamed from: a */
    public final void mo123776a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        WindowDialogManager.f91123a.mo129819a(new C25639g(mo122128i()).mo89242c(str).mo89225a(R.id.lkui_dialog_btn_right, UIHelper.getString(R.string.Lark_Legacy_ShareAlertOK), (DialogInterface.OnClickListener) null).mo89239c());
    }

    /* renamed from: a */
    public final boolean mo123779a(List<GetMessageIdsByPositionResponse.MessageTypeInfo> list, IMessageValidChecker bVar) {
        for (GetMessageIdsByPositionResponse.MessageTypeInfo aVar : list) {
            if (!bVar.mo123798a(aVar)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo123777a(Function1<? super List<GetMessageIdsByPositionResponse.MessageTypeInfo>, Unit> function1) {
        IMessageListComponent iMessageListComponent = this.f86983a;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        List<ChatMessageVO<?>> l = iMessageListComponent.mo123328l();
        if (!this.f86991l) {
            List<ChatMessageVO<?>> list = l;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (T t : list) {
                arrayList.add(new GetMessageIdsByPositionResponse.MessageTypeInfo(t.mo121681a(), t.mo121717y(), t.mo121710r()));
            }
            function1.invoke(arrayList);
        } else if (this.f86990h) {
            IMessageListComponent iMessageListComponent2 = this.f86983a;
            if (iMessageListComponent2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
            }
            function1.invoke(mo123770a(l, iMessageListComponent2.mo123329m()));
        } else {
            this.f86993n = new C33776q(this, function1, l);
        }
    }

    /* renamed from: a */
    public final boolean mo123778a(Message.Type type) {
        return C69043h.m265767b(new Message.Type[]{Message.Type.TEXT, Message.Type.POST, Message.Type.FILE, Message.Type.IMAGE, Message.Type.STICKER, Message.Type.CALENDAR, Message.Type.MEDIA, Message.Type.LOCATION, Message.Type.FOLDER, Message.Type.AUDIO}, type);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$createRecyclerViewAdapterObserver$1", "invoke", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$createRecyclerViewAdapterObserver$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$ac */
    static final class C33751ac extends Lambda implements Function0<C33775p> {
        final /* synthetic */ MessageSelectPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33751ac(MessageSelectPlugin iVar) {
            super(0);
            this.this$0 = iVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C33775p invoke() {
            return this.this$0.mo123790f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$changeToMultiSelectMode$2", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$OnTitlebarListener;", "onLeftClick", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$h */
    public static final class C33758h implements TitlebarComponent.OnTitlebarListener {

        /* renamed from: a */
        final /* synthetic */ MessageSelectPlugin f87021a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent.OnTitlebarListener
        /* renamed from: a */
        public void mo123157a() {
            this.f87021a.mo123787d();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33758h(MessageSelectPlugin iVar) {
            this.f87021a = iVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$createRecyclerViewAdapterObserver$1", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "onChanged", "", "onItemRangeChanged", "positionStart", "", "itemCount", "payload", "", "onItemRangeInserted", "onItemRangeMoved", "fromPosition", "toPosition", "onItemRangeRemoved", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$p */
    public static final class C33775p extends RecyclerView.AdapterDataObserver {

        /* renamed from: a */
        final /* synthetic */ MessageSelectPlugin f87034a;

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            this.f87034a.mo123791g();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33775p(MessageSelectPlugin iVar) {
            this.f87034a = iVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            this.f87034a.mo123791g();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            this.f87034a.mo123791g();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            this.f87034a.mo123791g();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            this.f87034a.mo123791g();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            this.f87034a.mo123791g();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J:\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0016¨\u0006\u0011"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$onCreate$2", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageCallbackHandler;", "onMergeForwardSuccess", "", "onMultiSelect", "adapterPosition", "", "onStartBuildGroup", "requestCode", "selectEntities", "", "Lcom/ss/android/lark/chat/entity/chat/PickChatEntity;", "departmentId", "", "contactsToApply", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/contact/entity/Contact;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$z */
    public static final class C33787z extends MessageCallbackHandler {

        /* renamed from: a */
        final /* synthetic */ MessageSelectPlugin f87048a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageCallbackHandler
        /* renamed from: a */
        public void mo123415a() {
            this.f87048a.mo123787d();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33787z(MessageSelectPlugin iVar) {
            this.f87048a = iVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageCallbackHandler, com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33121j
        /* renamed from: a */
        public void mo121935a(int i) {
            super.mo121935a(i);
            MultiSelectHitPointNew.f135853b.mo187667a(MessageSelectPlugin.m130892a(this.f87048a));
            MultiSelectHitPoint.f135851a.mo187655a();
            this.f87048a.mo123771a(i);
            this.f87048a.mo123792h();
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageCallbackHandler
        /* renamed from: a */
        public void mo123416a(int i, List<? extends PickChatEntity> list, String str, ArrayList<Contact> arrayList) {
            this.f87048a.mo123772a(i, list, str, arrayList);
        }
    }

    /* renamed from: f */
    public final C33775p mo123790f() {
        return new C33775p(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0005H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$onP2PBuildGroup$1", "Lcom/ss/android/lark/dependency/IDocDependency$IDocPermAuthCallback;", "onAuthConfirmed", "", "confirmedPermissions", "", "", "Lcom/ss/android/lark/doc/entity/DocPermPair$PermType;", "onCanceled", "onSkipped", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$ab */
    public static final class C33750ab implements AbstractC36498n.AbstractC36500b {

        /* renamed from: a */
        final /* synthetic */ MessageSelectPlugin f87007a;

        /* renamed from: b */
        final /* synthetic */ Context f87008b;

        /* renamed from: c */
        final /* synthetic */ List f87009c;

        /* renamed from: d */
        final /* synthetic */ List f87010d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f87011e;

        @Override // com.ss.android.lark.dependency.AbstractC36498n.AbstractC36500b
        /* renamed from: b */
        public void mo123796b() {
            TextView textView = this.f87007a.f86987e;
            if (textView != null) {
                textView.setEnabled(true);
            }
        }

        @Override // com.ss.android.lark.dependency.AbstractC36498n.AbstractC36500b
        /* renamed from: a */
        public void mo123794a() {
            this.f87007a.mo123774a(this.f87008b, this.f87009c, this.f87010d, this.f87011e, new HashMap());
        }

        @Override // com.ss.android.lark.dependency.AbstractC36498n.AbstractC36500b
        /* renamed from: a */
        public void mo123795a(Map<String, ? extends Map<String, ? extends DocPermPair.PermType>> map) {
            Intrinsics.checkParameterIsNotNull(map, "confirmedPermissions");
            this.f87007a.mo123774a(this.f87008b, this.f87009c, this.f87010d, this.f87011e, map);
        }

        C33750ab(MessageSelectPlugin iVar, Context context, List list, List list2, ArrayList arrayList) {
            this.f87007a = iVar;
            this.f87008b = context;
            this.f87009c = list;
            this.f87010d = list2;
            this.f87011e = arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/Runnable;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$s */
    static final class C33779s extends Lambda implements Function0<Runnable> {
        final /* synthetic */ MessageSelectPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33779s(MessageSelectPlugin iVar) {
            super(0);
            this.this$0 = iVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Runnable invoke() {
            return new Runnable(this) {
                /* class com.ss.android.lark.chat.chatwindow.chat.v2.plugin.MessageSelectPlugin.C33779s.RunnableC337801 */

                /* renamed from: a */
                final /* synthetic */ C33779s f87037a;

                {
                    this.f87037a = r1;
                }

                public final void run() {
                    LKUIToast.showLoading(this.f87037a.this$0.mo122128i(), (int) R.string.Lark_Legacy_Loading);
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$changeToBuildGroupMode$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$OnTitlebarListener;", "onLeftClick", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$c */
    public static final class C33753c implements TitlebarComponent.OnTitlebarListener {

        /* renamed from: a */
        final /* synthetic */ MessageSelectPlugin f87014a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent.OnTitlebarListener
        /* renamed from: a */
        public void mo123157a() {
            if (this.f87014a.f86989g == IMessageListComponent.ListMode.BUILD_GROUP) {
                this.f87014a.mo123789e();
            }
            this.f87014a.mo123787d();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33753c(MessageSelectPlugin iVar) {
            this.f87014a = iVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Rect;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$t */
    static final class C33781t extends Lambda implements Function0<Rect> {
        final /* synthetic */ MessageSelectPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33781t(MessageSelectPlugin iVar) {
            super(0);
            this.this$0 = iVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Rect invoke() {
            View lineView;
            Rect rect = new Rect();
            FollowingSelectLine followingSelectLine = this.this$0.f86986d;
            if (!(followingSelectLine == null || (lineView = followingSelectLine.getLineView()) == null)) {
                lineView.getGlobalVisibleRect(rect);
            }
            return rect;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$onCreate$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$IBackPressHandler;", "handleBack", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$y */
    public static final class C33786y implements IChatWindowApp.IBackPressHandler {

        /* renamed from: a */
        final /* synthetic */ MessageSelectPlugin f87047a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp.IBackPressHandler
        /* renamed from: a */
        public boolean mo123195a() {
            if (this.f87047a.f86989g == IMessageListComponent.ListMode.NORMAL) {
                return false;
            }
            if (this.f87047a.f86989g == IMessageListComponent.ListMode.BUILD_GROUP) {
                this.f87047a.mo123789e();
            }
            this.f87047a.mo123787d();
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33786y(MessageSelectPlugin iVar) {
            this.f87047a = iVar;
        }
    }

    /* renamed from: p */
    private final void m130903p() {
        mo123791g();
        this.f86991l = false;
        FollowingSelectLine followingSelectLine = this.f86986d;
        if (followingSelectLine != null) {
            followingSelectLine.setSelectTipClickListener(new C33777r(this));
        }
    }

    /* renamed from: q */
    private final void m130904q() {
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        if (this.f86989g == IMessageListComponent.ListMode.NORMAL && (recyclerView = this.f86985c) != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.registerAdapterDataObserver(m130900m());
        }
    }

    /* renamed from: r */
    private final void m130905r() {
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        if (this.f86989g != IMessageListComponent.ListMode.NORMAL && (recyclerView = this.f86985c) != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.unregisterAdapterDataObserver(m130900m());
        }
    }

    /* renamed from: c */
    public final boolean mo123785c() {
        IMessageListComponent iMessageListComponent = this.f86983a;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        return !iMessageListComponent.mo123329m().isEmpty();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$showOneByOneForwardGuide$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$ad */
    public static final class RunnableC33752ad implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TextBubbleConfig f87012a;

        /* renamed from: b */
        final /* synthetic */ MessageSelectPlugin f87013b;

        RunnableC33752ad(TextBubbleConfig kVar, MessageSelectPlugin iVar) {
            this.f87012a = kVar;
            this.f87013b = iVar;
        }

        public final void run() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36508v k = b.mo134583k();
            Context i = this.f87013b.mo122128i();
            if (i != null) {
                k.mo134721a("im_msg_one_by_one_forward", new C38708a((Activity) i, (AbstractC38707a) null, this.f87012a));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    /* renamed from: s */
    private final boolean m130906s() {
        int i;
        RecyclerView recyclerView = this.f86985c;
        int i2 = 0;
        if (recyclerView != null) {
            i = recyclerView.computeVerticalScrollRange();
        } else {
            i = 0;
        }
        RecyclerView recyclerView2 = this.f86985c;
        if (recyclerView2 != null) {
            i2 = recyclerView2.getHeight();
        }
        if (i > i2) {
            return true;
        }
        IMessageListComponent iMessageListComponent = this.f86983a;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        return m130898g(iMessageListComponent.mo123327k());
    }

    /* renamed from: g */
    public final void mo123791g() {
        if (this.f86986d != null) {
            if (m130906s()) {
                FollowingSelectLine followingSelectLine = this.f86986d;
                if (followingSelectLine != null) {
                    followingSelectLine.setVisibility(0);
                    return;
                }
                return;
            }
            FollowingSelectLine followingSelectLine2 = this.f86986d;
            if (followingSelectLine2 != null) {
                followingSelectLine2.setVisibility(8);
            }
        }
    }

    /* renamed from: n */
    private final void m130901n() {
        View view;
        View view2;
        IMessageListComponent iMessageListComponent = this.f86983a;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        RelativeLayout b = iMessageListComponent.mo123319b();
        if (b != null) {
            if (this.f86976G == null) {
                this.f86985c = (RecyclerView) b.findViewById(R.id.chat_message_list_view);
                ViewStub viewStub = (ViewStub) b.findViewById(R.id.chat_window_p2p_build_group_stub);
                this.f86975F = viewStub;
                if (viewStub != null) {
                    if (viewStub == null) {
                        Intrinsics.throwNpe();
                    }
                    view = viewStub.inflate();
                } else {
                    view = b.findViewById(R.id.p2p_build_group_container);
                }
                this.f86976G = view;
                TextView textView = null;
                if (view != null) {
                    view2 = view.findViewById(R.id.p2p_build_group_cancel);
                } else {
                    view2 = null;
                }
                this.f86977H = view2;
                View view3 = this.f86976G;
                if (view3 != null) {
                    textView = (TextView) view3.findViewById(R.id.p2p_build_group_ok);
                }
                this.f86987e = textView;
            }
            m130893a(b);
        }
    }

    /* renamed from: d */
    public final void mo123787d() {
        ITitlebarComponent bVar = this.f86996r;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBarComponent");
        }
        bVar.mo123686n();
        ITitlebarComponent bVar2 = this.f86996r;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBarComponent");
        }
        bVar2.mo123685m();
        IMessageListComponent iMessageListComponent = this.f86983a;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        iMessageListComponent.mo123307a(IMessageListComponent.ListMode.NORMAL, -1);
        IKeyboardComponent cVar = this.f86995q;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyboardListComponent");
        }
        cVar.mo121996n();
        m130905r();
        View view = this.f87000v;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.f86976G;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        FollowingSelectLine followingSelectLine = this.f86986d;
        if (followingSelectLine != null) {
            followingSelectLine.setVisibility(8);
        }
        FollowingSelectLine followingSelectLine2 = this.f86986d;
        if (followingSelectLine2 != null) {
            followingSelectLine2.setCurrentSelectCount(0);
        }
        this.f86992m.clear();
        this.f86989g = IMessageListComponent.ListMode.NORMAL;
        this.f86980K = 7;
    }

    /* renamed from: h */
    public final void mo123792h() {
        View view = this.f87002x;
        if (view != null && view.getVisibility() == 0 && (mo122128i() instanceof Activity)) {
            AnchorConfig anchorConfig = new AnchorConfig(view, AnchorConfig.AnchorGravity.TOP, null, 4, null);
            MaskConfig maskConfig = new MaskConfig(70, 2.0f, MaskConfig.ShapeType.RECTANGLE, null, null, 16, null);
            String string = UIHelper.getString(R.string.Lark_Chat_OneByOneForwardOnboardTip);
            Intrinsics.checkExpressionValueIsNotNull(string, "detail");
            view.post(new RunnableC33752ad(new TextBubbleConfig(anchorConfig, maskConfig, null, string), this));
        }
    }

    /* renamed from: e */
    public final void mo123789e() {
        int i = this.f86980K;
        if (i == 7) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36495k M = b.mo134514M();
            Context i2 = mo122128i();
            if (i2 != null) {
                Activity activity = (Activity) i2;
                BaseFragment k = mo122130k();
                Chat chat = this.f86984b;
                if (chat == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("chat");
                }
                String id = chat.getId();
                List<? extends PickChatEntity> list = this.f86978I;
                String str = this.f86979J;
                Chat chat2 = this.f86984b;
                if (chat2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("chat");
                }
                M.mo134658a(activity, k, id, list, str, false, chat2.isCrossTenant(), 7);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        } else if (i == 19) {
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            if (b2.an().mo134467a()) {
                Chat chat3 = this.f86984b;
                if (chat3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("chat");
                }
                if (chat3.isTeam()) {
                    return;
                }
            }
            AbstractC36474h b3 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
            IChatSettingDependency w = b3.mo134595w();
            Context i3 = mo122128i();
            if (i3 != null) {
                Activity activity2 = (Activity) i3;
                Chat chat4 = this.f86984b;
                if (chat4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("chat");
                }
                w.mo134352a(activity2, chat4, 19);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0174  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m130902o() {
        /*
        // Method dump skipped, instructions count: 383
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.MessageSelectPlugin.m130902o():void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$changeToMultiSelectMode$7", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$m */
    public static final class C33767m extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MessageSelectPlugin f87028a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "selectedMsgList", "", "Lcom/ss/android/lark/dto/chat/GetMessageIdsByPositionResponse$MessageTypeInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$m$a */
        static final class C33768a extends Lambda implements Function1<List<? extends GetMessageIdsByPositionResponse.MessageTypeInfo>, Unit> {
            final /* synthetic */ C33767m this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33768a(C33767m mVar) {
                super(1);
                this.this$0 = mVar;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$changeToMultiSelectMode$7$onSingleClick$1$isValid$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$IMessageValidChecker;", "isMessageValid", "", "message", "Lcom/ss/android/lark/dto/chat/GetMessageIdsByPositionResponse$MessageTypeInfo;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$m$a$a */
            public static final class C33769a implements IMessageValidChecker {

                /* renamed from: a */
                final /* synthetic */ C33768a f87029a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                C33769a(C33768a aVar) {
                    this.f87029a = aVar;
                }

                @Override // com.ss.android.lark.chat.chatwindow.chat.v2.plugin.MessageSelectPlugin.IMessageValidChecker
                /* renamed from: a */
                public boolean mo123798a(GetMessageIdsByPositionResponse.MessageTypeInfo aVar) {
                    Intrinsics.checkParameterIsNotNull(aVar, "message");
                    return this.f87029a.this$0.f87028a.mo123778a(aVar.mo136085b());
                }
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends GetMessageIdsByPositionResponse.MessageTypeInfo> list) {
                invoke((List<GetMessageIdsByPositionResponse.MessageTypeInfo>) list);
                return Unit.INSTANCE;
            }

            public final void invoke(List<GetMessageIdsByPositionResponse.MessageTypeInfo> list) {
                Intrinsics.checkParameterIsNotNull(list, "selectedMsgList");
                ArrayList<String> e = this.this$0.f87028a.mo123788e(list);
                if (CollectionUtils.isEmpty(e)) {
                    MessageSelectPlugin iVar = this.this$0.f87028a;
                    String string = UIHelper.getString(R.string.Lark_Legacy_MultiSelectCountMinLimit);
                    Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…MultiSelectCountMinLimit)");
                    iVar.mo123782b(string);
                    return;
                }
                MultiSelectHitPointNew.f135853b.mo187668a(MessageSelectPlugin.m130892a(this.this$0.f87028a), list, "multiselect_favorite", "none");
                if (this.this$0.f87028a.mo123779a(list, new C33769a(this))) {
                    MultiSelectHitPoint.f135851a.mo187661c(this.this$0.f87028a.mo123785c());
                    this.this$0.f87028a.mo123783b(e);
                    return;
                }
                MessageSelectPlugin iVar2 = this.this$0.f87028a;
                String string2 = UIHelper.getString(R.string.Lark_Legacy_MultiMergeSaveAlert);
                Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(R.str…gacy_MultiMergeSaveAlert)");
                iVar2.mo123776a(string2);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33767m(MessageSelectPlugin iVar) {
            this.f87028a = iVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f87028a.mo123777a(new C33768a(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$changeToMultiSelectMode$4", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$j */
    public static final class C33760j extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MessageSelectPlugin f87023a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "selectedMsgList", "", "Lcom/ss/android/lark/dto/chat/GetMessageIdsByPositionResponse$MessageTypeInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$j$a */
        static final class C33761a extends Lambda implements Function1<List<? extends GetMessageIdsByPositionResponse.MessageTypeInfo>, Unit> {
            final /* synthetic */ C33760j this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33761a(C33760j jVar) {
                super(1);
                this.this$0 = jVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends GetMessageIdsByPositionResponse.MessageTypeInfo> list) {
                invoke((List<GetMessageIdsByPositionResponse.MessageTypeInfo>) list);
                return Unit.INSTANCE;
            }

            public final void invoke(List<GetMessageIdsByPositionResponse.MessageTypeInfo> list) {
                Intrinsics.checkParameterIsNotNull(list, "selectedMsgList");
                if (CollectionUtils.isEmpty(list)) {
                    MessageSelectPlugin iVar = this.this$0.f87023a;
                    String string = UIHelper.getString(R.string.Lark_Legacy_MultiSelectCountMinLimit);
                    Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(strin…MultiSelectCountMinLimit)");
                    iVar.mo123782b(string);
                    return;
                }
                MultiSelectHitPointNew.f135853b.mo187668a(MessageSelectPlugin.m130892a(this.this$0.f87023a), list, "mergeforward", "public_multi_select_share_view");
                MultiSelectHitPoint.f135851a.mo187657a(this.this$0.f87023a.mo123785c());
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                b.mo134506E().mo134373a(this.this$0.f87023a.mo122128i(), this.this$0.f87023a.mo122130k(), MessageSelectPlugin.m130892a(this.this$0.f87023a), this.this$0.f87023a.mo123788e(list), 9, "click", "chat", false, "");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33760j(MessageSelectPlugin iVar) {
            this.f87023a = iVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f87023a.mo123777a(new C33761a(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$changeToMultiSelectMode$5", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$k */
    public static final class C33762k extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MessageSelectPlugin f87024a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "selectedMsgList", "", "Lcom/ss/android/lark/dto/chat/GetMessageIdsByPositionResponse$MessageTypeInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$k$a */
        static final class C33763a extends Lambda implements Function1<List<? extends GetMessageIdsByPositionResponse.MessageTypeInfo>, Unit> {
            final /* synthetic */ C33762k this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33763a(C33762k kVar) {
                super(1);
                this.this$0 = kVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends GetMessageIdsByPositionResponse.MessageTypeInfo> list) {
                invoke((List<GetMessageIdsByPositionResponse.MessageTypeInfo>) list);
                return Unit.INSTANCE;
            }

            public final void invoke(List<GetMessageIdsByPositionResponse.MessageTypeInfo> list) {
                Intrinsics.checkParameterIsNotNull(list, "selectedMsgList");
                if (CollectionUtils.isEmpty(list)) {
                    MessageSelectPlugin iVar = this.this$0.f87024a;
                    String string = UIHelper.getString(R.string.Lark_Legacy_MultiSelectCountMinLimit);
                    Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…MultiSelectCountMinLimit)");
                    iVar.mo123782b(string);
                    return;
                }
                MultiSelectHitPointNew.f135853b.mo187668a(MessageSelectPlugin.m130892a(this.this$0.f87024a), list, "onebyone_forward", "public_multi_select_share_view");
                MultiSelectHitPoint.f135851a.mo187659b(this.this$0.f87024a.mo123785c());
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                b.mo134506E().mo134372a(this.this$0.f87024a.mo122128i(), this.this$0.f87024a.mo122130k(), MessageSelectPlugin.m130892a(this.this$0.f87024a), this.this$0.f87024a.mo123788e(list), 9, "click", "chat", "");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33762k(MessageSelectPlugin iVar) {
            this.f87024a = iVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f87024a.mo123777a(new C33763a(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$changeToMultiSelectMode$6", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$l */
    public static final class C33764l extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MessageSelectPlugin f87025a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "selectedMsgList", "", "Lcom/ss/android/lark/dto/chat/GetMessageIdsByPositionResponse$MessageTypeInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$l$a */
        public static final class C33765a extends Lambda implements Function1<List<? extends GetMessageIdsByPositionResponse.MessageTypeInfo>, Unit> {
            final /* synthetic */ C33764l this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33765a(C33764l lVar) {
                super(1);
                this.this$0 = lVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends GetMessageIdsByPositionResponse.MessageTypeInfo> list) {
                invoke((List<GetMessageIdsByPositionResponse.MessageTypeInfo>) list);
                return Unit.INSTANCE;
            }

            public final void invoke(final List<GetMessageIdsByPositionResponse.MessageTypeInfo> list) {
                Intrinsics.checkParameterIsNotNull(list, "selectedMsgList");
                if (CollectionUtils.isEmpty(list)) {
                    MessageSelectPlugin iVar = this.this$0.f87025a;
                    String string = UIHelper.getString(R.string.Lark_Legacy_MultiSelectCountMinLimit);
                    Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…MultiSelectCountMinLimit)");
                    iVar.mo123782b(string);
                    return;
                }
                MultiSelectHitPointNew.f135853b.mo187668a(MessageSelectPlugin.m130892a(this.this$0.f87025a), list, "create_todo", "todo_create_view");
                MultiSelectHitPoint.f135851a.mo187656a(list.size(), this.this$0.f87025a.mo123785c());
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                b.ak().mo86324b(Domain.chat, MessageSelectPlugin.m130892a(this.this$0.f87025a).getId(), BlockTypeID.CHAT, new IGetDataCallback<String>(this) {
                    /* class com.ss.android.lark.chat.chatwindow.chat.v2.plugin.MessageSelectPlugin.C33764l.C33765a.C337661 */

                    /* renamed from: a */
                    final /* synthetic */ C33765a f87026a;

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Intrinsics.checkParameterIsNotNull(errorResult, "err");
                        Log.m165383e("MessageSelectPlugin", errorResult.toString());
                    }

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        Intrinsics.checkParameterIsNotNull(str, "blockId");
                        String str2 = "https://applink.feishu.cn/client/chat/open" + "?" + "chatId=" + MessageSelectPlugin.m130892a(this.f87026a.this$0.f87025a).getId();
                        Intrinsics.checkExpressionValueIsNotNull(str2, "appLinkBuilder.toString()");
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = jSONObject;
                        jSONObject2.put((Object) "chat_id", (Object) MessageSelectPlugin.m130892a(this.f87026a.this$0.f87025a).getId());
                        jSONObject2.put((Object) "is_public", (Object) Boolean.valueOf(MessageSelectPlugin.m130892a(this.f87026a.this$0.f87025a).isPublic()));
                        String jSONString = jSONObject.toJSONString();
                        AbstractC36474h b = C29990c.m110930b();
                        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                        BlockEntity a = b.ak().mo86315a(str, BlockTypeID.CHAT, str2, "", jSONString, "", "");
                        Intrinsics.checkExpressionValueIsNotNull(a, "ChatModuleInstanceHolder…, \"\", sourceMeta, \"\", \"\")");
                        RichText b2 = C59029c.m229161b(UIHelper.mustacheFormat((int) R.string.Todo_Task_FromChat, "Chat", MessageSelectPlugin.m130892a(this.f87026a.this$0.f87025a).getName()));
                        AbstractC36474h b3 = C29990c.m110930b();
                        Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
                        C24062d ak = b3.ak();
                        Context i = this.f87026a.this$0.f87025a.mo122128i();
                        ActionType actionType = ActionType.Todo;
                        BlockExtra blockExtra = new BlockExtra();
                        blockExtra.multiMessage = new MultiMessage();
                        blockExtra.multiMessage.chatId = MessageSelectPlugin.m130892a(this.f87026a.this$0.f87025a).getId();
                        blockExtra.multiMessage.messageIds = this.f87026a.this$0.f87025a.mo123788e(list);
                        blockExtra.sceneType = BlockExtra.SceneType.CHAT_MULTI;
                        blockExtra.richTextMessage = new RichTextMessage(Message.Type.UNKNOWN, new MessageContentEntity(new TextEntity(b2, null)));
                        ak.mo86317a(i, actionType, a, blockExtra);
                        this.f87026a.this$0.f87025a.mo123787d();
                    }

                    {
                        this.f87026a = r1;
                    }
                });
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33764l(MessageSelectPlugin iVar) {
            this.f87025a = iVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f87025a.mo123777a(new C33765a(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$changeToMultiSelectMode$8", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$n */
    public static final class C33770n extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MessageSelectPlugin f87030a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "selectedMsgList", "", "Lcom/ss/android/lark/dto/chat/GetMessageIdsByPositionResponse$MessageTypeInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$n$a */
        static final class C33771a extends Lambda implements Function1<List<? extends GetMessageIdsByPositionResponse.MessageTypeInfo>, Unit> {
            final /* synthetic */ C33770n this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33771a(C33770n nVar) {
                super(1);
                this.this$0 = nVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends GetMessageIdsByPositionResponse.MessageTypeInfo> list) {
                invoke((List<GetMessageIdsByPositionResponse.MessageTypeInfo>) list);
                return Unit.INSTANCE;
            }

            public final void invoke(List<GetMessageIdsByPositionResponse.MessageTypeInfo> list) {
                Intrinsics.checkParameterIsNotNull(list, "selectedMsgList");
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = (T) this.this$0.f87030a.mo123788e(list);
                if (CollectionUtils.isEmpty((Collection) objectRef.element)) {
                    MessageSelectPlugin iVar = this.this$0.f87030a;
                    String string = UIHelper.getString(R.string.Lark_Legacy_MultiSelectCountMinLimit);
                    Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…MultiSelectCountMinLimit)");
                    iVar.mo123782b(string);
                    return;
                }
                MultiSelectHitPointNew.f135853b.mo187668a(MessageSelectPlugin.m130892a(this.this$0.f87030a), list, "delete", "im_delete_confirm_view");
                MultiSelectHitPoint.f135851a.mo187663d(this.this$0.f87030a.mo123785c());
                C35212a.m137525a(this.this$0.f87030a.mo122128i(), new View.OnClickListener(this) {
                    /* class com.ss.android.lark.chat.chatwindow.chat.v2.plugin.MessageSelectPlugin.C33770n.C33771a.View$OnClickListenerC337721 */

                    /* renamed from: a */
                    final /* synthetic */ C33771a f87031a;

                    {
                        this.f87031a = r1;
                    }

                    public final void onClick(View view) {
                        MultiSelectHitPoint.f135851a.mo187662d();
                        this.f87031a.this$0.f87030a.mo123784c((List<String>) objectRef.element);
                    }
                });
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33770n(MessageSelectPlugin iVar) {
            this.f87030a = iVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f87030a.mo123777a(new C33771a(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$changeToMultiSelectMode$9", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$o */
    public static final class C33773o extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MessageSelectPlugin f87033a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "selectedMsgList", "", "Lcom/ss/android/lark/dto/chat/GetMessageIdsByPositionResponse$MessageTypeInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$o$a */
        static final class C33774a extends Lambda implements Function1<List<? extends GetMessageIdsByPositionResponse.MessageTypeInfo>, Unit> {
            final /* synthetic */ C33773o this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33774a(C33773o oVar) {
                super(1);
                this.this$0 = oVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends GetMessageIdsByPositionResponse.MessageTypeInfo> list) {
                invoke((List<GetMessageIdsByPositionResponse.MessageTypeInfo>) list);
                return Unit.INSTANCE;
            }

            public final void invoke(List<GetMessageIdsByPositionResponse.MessageTypeInfo> list) {
                Intrinsics.checkParameterIsNotNull(list, "selectedMsgList");
                ArrayList<String> e = this.this$0.f87033a.mo123788e(list);
                if (CollectionUtils.isEmpty(e)) {
                    MessageSelectPlugin iVar = this.this$0.f87033a;
                    String string = UIHelper.getString(R.string.Lark_Legacy_MultiSelectCountMinLimit);
                    Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…MultiSelectCountMinLimit)");
                    iVar.mo123782b(string);
                    return;
                }
                MultiSelectHitPointNew.f135853b.mo187668a(MessageSelectPlugin.m130892a(this.this$0.f87033a), list, "fast_action", "none");
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                AbstractC36474h.AbstractC36488n ai2 = b.ai();
                Context i = this.this$0.f87033a.mo122128i();
                if (i != null) {
                    ai2.mo134636a((Activity) i, MessageSelectPlugin.m130892a(this.this$0.f87033a).getId(), e, this.this$0.f87033a.mo123769a(list));
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33773o(MessageSelectPlugin iVar) {
            this.f87033a = iVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f87033a.mo123777a(new C33774a(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$initFollowingLine$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$r */
    public static final class C33777r extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MessageSelectPlugin f87035a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$initFollowingLine$1$onSingleClick$1", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "Lcom/ss/android/lark/dto/chat/GetMessageIdsByPositionResponse;", "onErrored", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccessed", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$r$a */
        public static final class C33778a extends UIGetDataCallback<GetMessageIdsByPositionResponse> {

            /* renamed from: a */
            final /* synthetic */ C33777r f87036a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C33778a(C33777r rVar) {
                this.f87036a = rVar;
            }

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165397w("ChatWindowLog", "quick select error, pull msg ids failed: " + errorResult.getDebugMsg());
                LKUIToast.cancelLoading();
                UICallbackExecutor.removeCallbacks(this.f87036a.f87035a.mo123781b());
                this.f87036a.f87035a.f86990h = true;
                Function1<? super List<GetMessageIdsByPositionResponse.MessageTypeInfo>, Unit> function1 = this.f87036a.f87035a.f86993n;
                if (function1 != null) {
                    function1.invoke(this.f87036a.f87035a.f86992m);
                }
            }

            /* renamed from: a */
            public void onSuccessed(GetMessageIdsByPositionResponse eVar) {
                Intrinsics.checkParameterIsNotNull(eVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                Log.m165379d("ChatWindowLog", "pull msg ids success, size: " + eVar.mo136083a().size());
                LKUIToast.cancelLoading();
                UICallbackExecutor.removeCallbacks(this.f87036a.f87035a.mo123781b());
                this.f87036a.f87035a.f86992m.clear();
                this.f87036a.f87035a.f86992m.addAll(eVar.mo136083a());
                IMessageListComponent b = MessageSelectPlugin.m130895b(this.f87036a.f87035a);
                List<GetMessageIdsByPositionResponse.MessageTypeInfo> a = eVar.mo136083a();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a, 10));
                Iterator<T> it = a.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().mo136084a());
                }
                b.mo123320b(arrayList);
                this.f87036a.f87035a.f86994o.mo123333a(eVar.mo136083a().size());
                this.f87036a.f87035a.f86990h = true;
                Function1<? super List<GetMessageIdsByPositionResponse.MessageTypeInfo>, Unit> function1 = this.f87036a.f87035a.f86993n;
                if (function1 != null) {
                    function1.invoke(this.f87036a.f87035a.f86992m);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33777r(MessageSelectPlugin iVar) {
            this.f87035a = iVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            RecyclerView.LayoutManager layoutManager;
            int i;
            Intrinsics.checkParameterIsNotNull(view, "v");
            RecyclerView recyclerView = this.f87035a.f86985c;
            if (recyclerView != null) {
                layoutManager = recyclerView.getLayoutManager();
            } else {
                layoutManager = null;
            }
            if (!(layoutManager instanceof LinearLayoutManager)) {
                layoutManager = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager != null) {
                i = linearLayoutManager.findFirstVisibleItemPosition();
            } else {
                i = -1;
            }
            int b = this.f87035a.mo123780b(i);
            int c = MessageSelectPlugin.m130895b(this.f87035a).mo123321c(b);
            if (b >= 0) {
                FollowingSelectLine followingSelectLine = this.f87035a.f86986d;
                if (followingSelectLine != null) {
                    followingSelectLine.setCurrentSelectCount(0);
                }
                MessageSelectPlugin.m130895b(this.f87035a).mo123304a(b, 100);
            }
            if (c >= 0) {
                this.f87035a.f86992m.clear();
                this.f87035a.f86991l = true;
                this.f87035a.f86990h = false;
                C32848e.m126401b().mo121256a(MessageSelectPlugin.m130892a(this.f87035a).getId(), c, 100, new C33778a(this));
                UICallbackExecutor.executeDelayed(this.f87035a.mo123781b(), 1000);
            }
            MultiSelectHitPointNew.f135853b.mo187668a(MessageSelectPlugin.m130892a(this.f87035a), null, "select_follow_msg", "none");
            MultiSelectHitPoint.f135851a.mo187665f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$changeToBuildGroupMode$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$d */
    public static final class C33754d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MessageSelectPlugin f87015a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33754d(MessageSelectPlugin iVar) {
            this.f87015a = iVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f87015a.mo123787d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$changeToMultiSelectMode$10", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$g */
    public static final class C33757g extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MessageSelectPlugin f87020a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33757g(MessageSelectPlugin iVar) {
            this.f87020a = iVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            C44855b.m177789a(MessageSelectPlugin.m130892a(this.f87020a), MessageSelectPlugin.m130895b(this.f87020a).mo123328l());
            this.f87020a.mo123787d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$i */
    public static final class View$OnClickListenerC33759i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MessageSelectPlugin f87022a;

        View$OnClickListenerC33759i(MessageSelectPlugin iVar) {
            this.f87022a = iVar;
        }

        public final void onClick(View view) {
            this.f87022a.mo123787d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/dto/chat/GetMessageIdsByPositionResponse$MessageTypeInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$q */
    public static final class C33776q extends Lambda implements Function1<List<? extends GetMessageIdsByPositionResponse.MessageTypeInfo>, Unit> {
        final /* synthetic */ Function1 $callback;
        final /* synthetic */ List $localSelectedMsgs;
        final /* synthetic */ MessageSelectPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33776q(MessageSelectPlugin iVar, Function1 function1, List list) {
            super(1);
            this.this$0 = iVar;
            this.$callback = function1;
            this.$localSelectedMsgs = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends GetMessageIdsByPositionResponse.MessageTypeInfo> list) {
            invoke((List<GetMessageIdsByPositionResponse.MessageTypeInfo>) list);
            return Unit.INSTANCE;
        }

        public final void invoke(List<GetMessageIdsByPositionResponse.MessageTypeInfo> list) {
            Intrinsics.checkParameterIsNotNull(list, "it");
            Function1 function1 = this.$callback;
            MessageSelectPlugin iVar = this.this$0;
            List<? extends ChatMessageVO<?>> list2 = this.$localSelectedMsgs;
            List<GetMessageIdsByPositionResponse.MessageTypeInfo> list3 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().mo136084a());
            }
            function1.invoke(iVar.mo123770a(list2, arrayList));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$mSelectedMessageChangeListener$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$ISelectedMessageChangeListener;", "onSelectedMessageChange", "", "selectedCount", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$u */
    public static final class C33782u implements IMessageListComponent.ISelectedMessageChangeListener {

        /* renamed from: a */
        final /* synthetic */ MessageSelectPlugin f87038a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33782u(MessageSelectPlugin iVar) {
            this.f87038a = iVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.ISelectedMessageChangeListener
        /* renamed from: a */
        public void mo123333a(int i) {
            String str;
            MessageSelectPlugin iVar = this.f87038a;
            int size = iVar.mo123770a(MessageSelectPlugin.m130895b(iVar).mo123328l(), MessageSelectPlugin.m130895b(this.f87038a).mo123329m()).size();
            FollowingSelectLine followingSelectLine = this.f87038a.f86986d;
            if (followingSelectLine != null) {
                followingSelectLine.setCurrentSelectCount(size);
            }
            if (this.f87038a.f86989g == IMessageListComponent.ListMode.BUILD_GROUP) {
                if (i == 0) {
                    str = "";
                } else {
                    StringCompanionObject mVar = StringCompanionObject.f173215a;
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
                    str = String.format(locale, "（%d）", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                    Intrinsics.checkExpressionValueIsNotNull(str, "java.lang.String.format(locale, format, *args)");
                }
                TextView textView = this.f87038a.f86987e;
                if (textView != null) {
                    textView.setText(UIHelper.getString(R.string.Lark_Legacy_ConfirmInfo) + str);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$multiDelete$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "Lcom/ss/android/lark/chat/entity/message/Message;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$v */
    public static final class C33783v implements IGetDataCallback<Map<String, ? extends Message>> {

        /* renamed from: a */
        final /* synthetic */ MessageSelectPlugin f87039a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33783v(MessageSelectPlugin iVar) {
            this.f87039a = iVar;
        }

        /* renamed from: a */
        public void onSuccess(Map<String, ? extends Message> map) {
            this.f87039a.mo123787d();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("ChatWindowLog", "multi delete message failed:");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$multiSave$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$w */
    public static final class C33784w implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MessageSelectPlugin f87040a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33784w(MessageSelectPlugin iVar) {
            this.f87040a = iVar;
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            MessageSelectPlugin iVar = this.f87040a;
            String string = UIHelper.getString(R.string.Lark_Legacy_CombineFavoriteSuccess);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…y_CombineFavoriteSuccess)");
            iVar.mo123782b(string);
            this.f87040a.mo123787d();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            MessageSelectPlugin iVar = this.f87040a;
            String displayMsg = errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_SaveBoxSaveFail));
            Intrinsics.checkExpressionValueIsNotNull(displayMsg, "err.getDisplayMsg(UIHelp…_Legacy_SaveBoxSaveFail))");
            iVar.mo123782b(displayMsg);
        }
    }

    /* renamed from: b */
    public final void mo123782b(String str) {
        LKUIToast.show(mo122128i(), str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$changeToMultiSelectMode$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$f */
    public static final class C33756f extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ MessageSelectPlugin f87019a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            super.performAction(view);
            MultiSelectHitPoint.f135851a.mo187664e();
            this.f87019a.mo123787d();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33756f(MessageSelectPlugin iVar, String str, int i) {
            super(str, i);
            this.f87019a = iVar;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Chat m130892a(MessageSelectPlugin iVar) {
        Chat chat = iVar.f86984b;
        if (chat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chat");
        }
        return chat;
    }

    /* renamed from: b */
    public static final /* synthetic */ IMessageListComponent m130895b(MessageSelectPlugin iVar) {
        IMessageListComponent iMessageListComponent = iVar.f86983a;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        return iMessageListComponent;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$onCreateChatAndSyncMessages$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chat", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$aa */
    public static final class C33749aa implements IGetDataCallback<Chat> {

        /* renamed from: a */
        final /* synthetic */ MessageSelectPlugin f87005a;

        /* renamed from: b */
        final /* synthetic */ Map f87006b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            TextView textView = this.f87005a.f86987e;
            if (textView != null) {
                textView.setEnabled(true);
            }
            this.f87005a.f86988f = false;
        }

        /* renamed from: a */
        public void onSuccess(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            int i = 0;
            this.f87005a.f86988f = false;
            int i2 = 0;
            for (Map map : this.f87006b.values()) {
                for (DocPermPair.PermType permType : map.values()) {
                    if (permType == DocPermPair.PermType.EDIT) {
                        i2++;
                    } else if (permType == DocPermPair.PermType.READ) {
                        i++;
                    }
                }
            }
            DocHitPoint.f135699a.mo187454a(i, i2);
            BuildGroupHitPoint.Companion aVar = BuildGroupHitPoint.f135647a;
            boolean isPublic = chat.isPublic();
            boolean isCrossTenant = chat.isCrossTenant();
            Chat.ChatMode chatMode = chat.getChatMode();
            Intrinsics.checkExpressionValueIsNotNull(chatMode, "chat.chatMode");
            aVar.mo187343a(isPublic, isCrossTenant, chatMode, chat.getMemberCount());
        }

        C33749aa(MessageSelectPlugin iVar, Map map) {
            this.f87005a = iVar;
            this.f87006b = map;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$onConfirmP2PBuildGroup$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/chat/entity/message/Message;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$x */
    public static final class C33785x implements IGetDataCallback<List<? extends Message>> {

        /* renamed from: a */
        final /* synthetic */ MessageSelectPlugin f87041a;

        /* renamed from: b */
        final /* synthetic */ Context f87042b;

        /* renamed from: c */
        final /* synthetic */ List f87043c;

        /* renamed from: d */
        final /* synthetic */ List f87044d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f87045e;

        /* renamed from: f */
        final /* synthetic */ List f87046f;

        /* renamed from: a */
        public void onSuccess(List<? extends Message> list) {
            Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f87041a.mo123775a(this.f87042b, this.f87043c, this.f87044d, list, this.f87045e);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            MessageSelectPlugin iVar = this.f87041a;
            Context context = this.f87042b;
            List<? extends PickChatEntity> list = this.f87043c;
            List<String> list2 = this.f87044d;
            List<AbstractC34006a> list3 = this.f87046f;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            for (AbstractC34006a aVar : list3) {
                arrayList.add(aVar.getMessage());
            }
            iVar.mo123775a(context, list, list2, arrayList, this.f87045e);
            Log.m165397w("ChatWindowLog", "pull message failed, " + errorResult.getDebugMsg());
        }

        C33785x(MessageSelectPlugin iVar, Context context, List list, List list2, ArrayList arrayList, List list3) {
            this.f87041a = iVar;
            this.f87042b = context;
            this.f87043c = list;
            this.f87044d = list2;
            this.f87045e = arrayList;
            this.f87046f = list3;
        }
    }

    /* renamed from: a */
    private final boolean m130894a(View view) {
        View findViewById = view.findViewById(R.id.choose_message_checkbox);
        if (findViewById == null) {
            return false;
        }
        Rect rect = new Rect();
        findViewById.getGlobalVisibleRect(rect);
        if (m130899l().bottom <= rect.bottom) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private final boolean m130898g(List<? extends ChatMessageVO<?>> list) {
        Iterator<? extends ChatMessageVO<?>> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((ChatMessageVO) it.next()).mo124245R()) {
                i++;
            }
            if (i >= 5) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final ArrayList<String> mo123786d(List<? extends ChatMessageVO<?>> list) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<? extends ChatMessageVO<?>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ChatMessageVO) it.next()).mo121681a());
        }
        return arrayList;
    }

    /* renamed from: e */
    public final ArrayList<String> mo123788e(List<GetMessageIdsByPositionResponse.MessageTypeInfo> list) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (GetMessageIdsByPositionResponse.MessageTypeInfo aVar : list) {
            arrayList.add(aVar.mo136084a());
        }
        return arrayList;
    }

    /* renamed from: c */
    private final void m130896c(String str) {
        WindowDialogManager.f91123a.mo129819a(new C25639g(mo122128i()).mo89237b(str).mo89238b(true).mo89251j(2).mo89225a(R.id.lkui_dialog_btn_right, UIHelper.getString(R.string.Lark_Legacy_ShareAlertOK), (DialogInterface.OnClickListener) null).mo89239c());
    }

    /* renamed from: f */
    private final List<GetMessageIdsByPositionResponse.MessageTypeInfo> m130897f(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (T t : this.f86992m) {
            if (list.contains(t.mo136084a())) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final ArrayList<Integer> mo123769a(List<GetMessageIdsByPositionResponse.MessageTypeInfo> list) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().mo136085b().getNumber()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final int mo123780b(int i) {
        RecyclerView.LayoutManager layoutManager;
        View findViewByPosition;
        RecyclerView recyclerView = this.f86985c;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (findViewByPosition = layoutManager.findViewByPosition(i)) != null) {
            Intrinsics.checkExpressionValueIsNotNull(findViewByPosition, "mMessageListRecyclerView…     ?: return currentPos");
            while (!m130894a(findViewByPosition)) {
                i++;
                RecyclerView recyclerView2 = this.f86985c;
                if (recyclerView2 != null) {
                    RecyclerView.LayoutManager layoutManager2 = recyclerView2.getLayoutManager();
                    if (layoutManager2 != null) {
                        findViewByPosition = layoutManager2.findViewByPosition(i);
                        if (findViewByPosition == null) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/MessageSelectPlugin$changeToBuildGroupMode$3", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.i$e */
    public static final class C33755e extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MessageSelectPlugin f87016a;

        /* renamed from: b */
        final /* synthetic */ List f87017b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f87018c;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            int i;
            ArrayList<String> d = this.f87016a.mo123786d(MessageSelectPlugin.m130895b(this.f87016a).mo123328l());
            MessageSelectPlugin iVar = this.f87016a;
            iVar.mo123773a(iVar.mo122128i(), this.f87017b, d, this.f87018c);
            boolean z = !d.contains(MessageSelectPlugin.m130892a(this.f87016a).getLastMessageId());
            BuildGroupHitPoint.Companion aVar = BuildGroupHitPoint.f135647a;
            if (CollectionUtils.isEmpty(d)) {
                i = 0;
            } else {
                i = d.size();
            }
            String id = MessageSelectPlugin.m130892a(this.f87016a).getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
            aVar.mo187342a(i, id, z);
        }

        C33755e(MessageSelectPlugin iVar, List list, ArrayList arrayList) {
            this.f87016a = iVar;
            this.f87017b = list;
            this.f87018c = arrayList;
        }
    }

    /* renamed from: a */
    private final void m130893a(RelativeLayout relativeLayout) {
        int i;
        if (this.f86986d == null) {
            FollowingSelectLine followingSelectLine = new FollowingSelectLine(mo122128i());
            followingSelectLine.setVisibility(8);
            followingSelectLine.setSelectLimit(100);
            this.f86986d = followingSelectLine;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
            ITitlebarComponent bVar = this.f86996r;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleBarComponent");
            }
            View i2 = bVar.mo123681i();
            if (i2 != null) {
                i = i2.getHeight();
            } else {
                i = 0;
            }
            layoutParams.topMargin = i + UIHelper.dp2px(48.0f);
            relativeLayout.addView(this.f86986d, layoutParams);
            mo123791g();
        }
    }

    /* renamed from: b */
    public final void mo123783b(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "selectedMessageIds");
        C33784w wVar = new C33784w(this);
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36474h.AbstractC36481g U = b.mo134522U();
        Chat chat = this.f86984b;
        if (chat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chat");
        }
        U.mo134621a(list, chat.getId(), "", (IGetDataCallback) mo122129j().wrapAndAddCallback(new UIGetDataCallback(wVar)));
    }

    /* renamed from: c */
    public final void mo123784c(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "selectedMessageIds");
        Log.m165389i("ChatWindowLog", "mutli delete msg: " + aj.m95015a(list, ","));
        C32848e.m126401b().mo121269b(list, (IGetDataCallback) mo122129j().wrapAndAddCallback(new UIGetDataCallback(new C33783v(this))));
    }

    /* renamed from: a */
    public final void mo123771a(int i) {
        m130902o();
        IKeyboardComponent cVar = this.f86995q;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyboardListComponent");
        }
        cVar.mo121995m();
        ITitlebarComponent bVar = this.f86996r;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBarComponent");
        }
        bVar.mo123684l();
        ITitlebarComponent bVar2 = this.f86996r;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBarComponent");
        }
        bVar2.mo123686n();
        if (!DesktopUtil.m144301a(mo122128i())) {
            ITitlebarComponent bVar3 = this.f86996r;
            if (bVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleBarComponent");
            }
            bVar3.mo123663a(0, new C33756f(this, UIHelper.getString(R.string.Lark_Legacy_CancelTitle), R.color.text_title));
        }
        ITitlebarComponent bVar4 = this.f86996r;
        if (bVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBarComponent");
        }
        bVar4.mo123669a(new C33758h(this));
        View view = this.f86973D;
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC33759i(this));
        }
        View view2 = this.f87001w;
        if (view2 != null) {
            view2.setOnClickListener(new C33760j(this));
        }
        View view3 = this.f87002x;
        if (view3 != null) {
            view3.setOnClickListener(new C33762k(this));
        }
        View view4 = this.f87003y;
        if (view4 != null) {
            view4.setOnClickListener(new C33764l(this));
        }
        View view5 = this.f86970A;
        if (view5 != null) {
            view5.setOnClickListener(new C33767m(this));
        }
        View view6 = this.f86971B;
        if (view6 != null) {
            view6.setOnClickListener(new C33770n(this));
        }
        View view7 = this.f86972C;
        if (view7 != null) {
            view7.setOnClickListener(new C33773o(this));
        }
        View view8 = this.f87004z;
        if (view8 != null) {
            view8.setOnClickListener(new C33757g(this));
        }
        IMessageListComponent iMessageListComponent = this.f86983a;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        iMessageListComponent.mo123311a(this.f86994o);
        m130904q();
        this.f86989g = IMessageListComponent.ListMode.MULTI_SELECT;
        IMessageListComponent iMessageListComponent2 = this.f86983a;
        if (iMessageListComponent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        iMessageListComponent2.mo123307a(IMessageListComponent.ListMode.MULTI_SELECT, i);
        View view9 = this.f87000v;
        if (view9 != null) {
            view9.setVisibility(0);
        }
        View view10 = this.f86976G;
        if (view10 != null) {
            view10.setVisibility(8);
        }
        m130903p();
    }

    /* renamed from: a */
    public final List<GetMessageIdsByPositionResponse.MessageTypeInfo> mo123770a(List<? extends ChatMessageVO<?>> list, List<String> list2) {
        HashSet hashSet = new HashSet();
        List<GetMessageIdsByPositionResponse.MessageTypeInfo> f = m130897f(list2);
        Iterator<? extends ChatMessageVO<?>> it = list.iterator();
        while (it.hasNext()) {
            ChatMessageVO cVar = (ChatMessageVO) it.next();
            hashSet.add(new GetMessageIdsByPositionResponse.MessageTypeInfo(cVar.mo121681a(), cVar.mo121717y(), cVar.mo121710r()));
        }
        for (GetMessageIdsByPositionResponse.MessageTypeInfo aVar : f) {
            if (!hashSet.contains(aVar)) {
                hashSet.add(aVar);
            }
        }
        return CollectionsKt.toList(hashSet);
    }

    /* renamed from: a */
    public final void mo123772a(int i, List<? extends PickChatEntity> list, String str, ArrayList<Contact> arrayList) {
        this.f86978I = list;
        this.f86979J = str;
        m130901n();
        m130903p();
        m130904q();
        View view = this.f86976G;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.f87000v;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        IKeyboardComponent cVar = this.f86995q;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyboardListComponent");
        }
        cVar.mo121995m();
        ITitlebarComponent bVar = this.f86996r;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBarComponent");
        }
        bVar.mo123684l();
        ITitlebarComponent bVar2 = this.f86996r;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBarComponent");
        }
        bVar2.mo123686n();
        ITitlebarComponent bVar3 = this.f86996r;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBarComponent");
        }
        bVar3.mo123669a(new C33753c(this));
        IMessageListComponent iMessageListComponent = this.f86983a;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        iMessageListComponent.mo123311a(this.f86994o);
        View view3 = this.f86977H;
        if (view3 != null) {
            view3.setOnClickListener(new C33754d(this));
        }
        TextView textView = this.f86987e;
        if (textView != null) {
            textView.setOnClickListener(new C33755e(this, list, arrayList));
        }
        this.f86989g = IMessageListComponent.ListMode.BUILD_GROUP;
        this.f86980K = i;
        IMessageListComponent iMessageListComponent2 = this.f86983a;
        if (iMessageListComponent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        iMessageListComponent2.mo123307a(IMessageListComponent.ListMode.BUILD_GROUP, -1);
    }

    /* renamed from: a */
    public final void mo123773a(Context context, List<? extends PickChatEntity> list, List<String> list2, ArrayList<Contact> arrayList) {
        PerfCreateGroupMonitor.m213516a("single_chat_to_group");
        if (list2.size() > 100) {
            String string = UIHelper.getString(R.string.Lark_Legacy_P2pBuildMaxCountTip);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…gacy_P2pBuildMaxCountTip)");
            m130896c(string);
            return;
        }
        TextView textView = this.f86987e;
        if (textView != null) {
            textView.setEnabled(false);
        }
        IMessageListComponent iMessageListComponent = this.f86983a;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        List<AbstractC34006a> a = iMessageListComponent.mo123303a((Collection<String>) list2);
        if (a.size() < list2.size()) {
            C32848e.m126401b().mo121102a(list2, new C33785x(this, context, list, list2, arrayList, a));
            return;
        }
        List<AbstractC34006a> list3 = a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().getMessage());
        }
        mo123775a(context, list, list2, arrayList2, arrayList);
    }
}
