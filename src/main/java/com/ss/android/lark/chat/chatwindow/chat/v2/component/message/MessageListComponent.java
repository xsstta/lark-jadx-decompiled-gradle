package com.ss.android.lark.chat.chatwindow.chat.v2.component.message;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.C1177w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.TodoOperationContent;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.blockit.entity.ActionType;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.entity.BlockExtra;
import com.larksuite.component.blockit.entity.BlockTypeID;
import com.larksuite.component.blockit.entity.Domain;
import com.larksuite.component.blockit.entity.richtext.CommonEntity;
import com.larksuite.component.blockit.entity.richtext.MessageContentEntity;
import com.larksuite.component.blockit.entity.richtext.PostEntity;
import com.larksuite.component.blockit.entity.richtext.RichTextMessage;
import com.larksuite.component.blockit.entity.richtext.TextEntity;
import com.larksuite.component.blockit.entity.todo.MultiMessage;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.ui.layout.LKUIRelativeLayout;
import com.larksuite.component.ui.layout.plus.PerMonitorRenderLKUIPlus;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.ui.StableLinearLayoutManager;
import com.larksuite.framework.utils.C26325y;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.im.api.BotTipsContent;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.OpenApp;
import com.ss.android.lark.biz.im.extension.ActionContext;
import com.ss.android.lark.chat.api.AbstractC32812c;
import com.ss.android.lark.chat.base.model.p1602a.C32920b;
import com.ss.android.lark.chat.base.view.recycleview.ItemShineManager;
import com.ss.android.lark.chat.base.view.vo.message.AudioContentVO;
import com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.chatwindow.chat.AbstractC33244i;
import com.ss.android.lark.chat.chatwindow.chat.C33086b;
import com.ss.android.lark.chat.chatwindow.chat.C33234e;
import com.ss.android.lark.chat.chatwindow.chat.C33238g;
import com.ss.android.lark.chat.chatwindow.chat.C33247j;
import com.ss.android.lark.chat.chatwindow.chat.C33256m;
import com.ss.android.lark.chat.chatwindow.chat.C33415n;
import com.ss.android.lark.chat.chatwindow.chat.C33418p;
import com.ss.android.lark.chat.chatwindow.chat.C33423r;
import com.ss.android.lark.chat.chatwindow.chat.menu.IMessageMenuProvider;
import com.ss.android.lark.chat.chatwindow.chat.menu.MenuProviderHandlerHub;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.AudioMessageNewCell;
import com.ss.android.lark.chat.chatwindow.chat.message.C33328c;
import com.ss.android.lark.chat.chatwindow.chat.message.ImageMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.SystemMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33296f;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33302l;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.C33292b;
import com.ss.android.lark.chat.chatwindow.chat.message.text.PostMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.text.TextMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.model.C33400c;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33120i;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33128q;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.WidgetViewModelKeyManager;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListResultHandler;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.util.ChatTabFgUtil;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1638a.C33427a;
import com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.CardContent;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.entity.message.content.TodoContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.p1660e.C33973b;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chat.utils.C34349o;
import com.ss.android.lark.chat.utils.C34350p;
import com.ss.android.lark.chat.utils.C34353s;
import com.ss.android.lark.chat.utils.C34378x;
import com.ss.android.lark.chat.utils.C34381y;
import com.ss.android.lark.chat.utils.EditImageUtils;
import com.ss.android.lark.chat.utils.MessagePositionUtils;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;
import com.ss.android.lark.chatthread.C35121d;
import com.ss.android.lark.chatwindow.AbstractC35250i;
import com.ss.android.lark.chatwindow.C35212a;
import com.ss.android.lark.chatwindow.C35228b;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35221d;
import com.ss.android.lark.chatwindow.statistics.ChatWindowHitPoint;
import com.ss.android.lark.chatwindow.view.WindowDialogManager;
import com.ss.android.lark.chatwindow.view.firsttip.C35287c;
import com.ss.android.lark.chatwindow.view.photo_preview.ChatAlbumClickListenerImpl;
import com.ss.android.lark.chatwindow.view.photo_preview.DialogMenuClickListenerImpl;
import com.ss.android.lark.chatwindow.view.photo_preview.LoadMoreListenerImpl;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.dependency.AbstractC36459ag;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36495k;
import com.ss.android.lark.dependency.AbstractC36497m;
import com.ss.android.lark.dependency.AbstractC36503q;
import com.ss.android.lark.dependency.AbstractC36505s;
import com.ss.android.lark.dependency.AbstractC36507u;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.dto.group.GroupRecallEntity;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1786d.C36443k;
import com.ss.android.lark.p1820e.C36913c;
import com.ss.android.lark.p1820e.p1821a.C36894a;
import com.ss.android.lark.statistics.buzz.BuzzHitPoint;
import com.ss.android.lark.statistics.chat.ChatHitPoint;
import com.ss.android.lark.statistics.p2701o.C54970a;
import com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor;
import com.ss.android.lark.statistics.perf.PerfCreateGroupMonitor;
import com.ss.android.lark.statistics.redpacket.RedPacketHitPoint;
import com.ss.android.lark.threadmergeforward.ThreadMergeForwardLauncher;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.C57852m;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.utils.statistics.PerfLog;
import com.ss.android.lark.widget.ILifeCycleEventObserve;
import com.ss.android.lark.widget.photo_picker.animation.activity_transition.ActivityTransitionLauncher;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.C58984d;
import com.ss.android.lark.widget.recyclerview.C58996h;
import com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC58999a;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.Image;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 Û\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002Û\u0002B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020\u001aH\u0016J\u0010\u0010_\u001a\u00020]2\u0006\u0010^\u001a\u00020,H\u0016J\u0010\u0010`\u001a\u00020]2\u0006\u0010a\u001a\u000201H\u0016J\u0010\u0010b\u001a\u00020]2\u0006\u0010c\u001a\u00020dH\u0016J\u0010\u0010e\u001a\u00020]2\u0006\u0010^\u001a\u00020;H\u0016J\u0010\u0010f\u001a\u00020]2\u0006\u0010^\u001a\u00020?H\u0016J\u001a\u0010g\u001a\u00020]2\u0010\u0010^\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030(0hH\u0016J\u0010\u0010i\u001a\u00020]2\u0006\u0010^\u001a\u00020GH\u0016J\u0010\u0010j\u001a\u00020]2\u0006\u0010^\u001a\u00020UH\u0016J\u0014\u0010k\u001a\u00020]2\n\u0010l\u001a\u0006\u0012\u0002\b\u00030mH\u0002J\"\u0010n\u001a\u00020]2\u0018\u0010o\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020r\u0012\u0004\u0012\u00020s0q0pH\u0016J\b\u0010t\u001a\u00020!H\u0016J\u0006\u0010u\u001a\u00020]J\u0010\u0010v\u001a\u00020]2\u0006\u0010w\u001a\u00020\u0015H\u0016J\u001e\u0010v\u001a\u00020]2\u0006\u0010w\u001a\u00020\u00152\f\u0010x\u001a\b\u0012\u0004\u0012\u00020]0yH\u0016J\u0018\u0010z\u001a\u00020]2\u0006\u0010{\u001a\u00020#2\u0006\u0010|\u001a\u00020\u0015H\u0016J\b\u0010}\u001a\u00020!H\u0002J\b\u0010~\u001a\u00020]H\u0002J\u0011\u0010\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020rH\u0002J\t\u0010\u0001\u001a\u00020]H\u0002J\u0012\u0010\u0001\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020rH\u0002J\t\u0010\u0001\u001a\u00020]H\u0016J\u0013\u0010\u0001\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030(0pH\u0016J\u0014\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\u0014\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0014\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0014\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0002J%\u0010\u0001\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020r2\u0011\u0010\u0001\u001a\f\u0012\u0005\u0012\u00030\u0001\u0018\u00010\u0001H\u0016J\f\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0002J\u0013\u0010\u0001\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030(0pH\u0016J\t\u0010\u0001\u001a\u00020\u0015H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020r0pH\u0016J\t\u0010\u0001\u001a\u00020\u0015H\u0002J\t\u0010\u0001\u001a\u00020\u0015H\u0016J\r\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030/H\u0016J\u000b\u0010\u0001\u001a\u0004\u0018\u000103H\u0016J\f\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J\u0014\u0010\u0001\u001a\u0004\u0018\u00010s2\u0007\u0010 \u0001\u001a\u00020rH\u0016J\u001f\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00020s0p2\u000e\u0010¢\u0001\u001a\t\u0012\u0004\u0012\u00020r0£\u0001H\u0016J\u0012\u0010¤\u0001\u001a\u00020\u00152\u0007\u0010¥\u0001\u001a\u00020\u0015H\u0016J\f\u0010¦\u0001\u001a\u0005\u0018\u00010§\u0001H\u0016J\u0013\u0010¨\u0001\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030(0pH\u0016J\t\u0010©\u0001\u001a\u00020\u0015H\u0002J\u0014\u0010ª\u0001\u001a\u00030«\u00012\b\u0010¬\u0001\u001a\u00030­\u0001H\u0002J\t\u0010®\u0001\u001a\u00020]H\u0016J\t\u0010¯\u0001\u001a\u00020]H\u0002JN\u0010°\u0001\u001a\u00020]2\u0007\u0010±\u0001\u001a\u00020\u00152\u0010\u0010²\u0001\u001a\u000b\u0012\u0005\u0012\u00030³\u0001\u0018\u00010p2\t\u0010´\u0001\u001a\u0004\u0018\u00010r2\u001d\u0010µ\u0001\u001a\u0018\u0012\u0005\u0012\u00030¶\u0001\u0018\u00010\u0019j\u000b\u0012\u0005\u0012\u00030¶\u0001\u0018\u0001`\u001bH\u0016J\u0015\u0010·\u0001\u001a\u00020]2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0002J\t\u0010¸\u0001\u001a\u00020]H\u0002J\u0013\u0010¹\u0001\u001a\u00020]2\b\u0010º\u0001\u001a\u00030»\u0001H\u0002J\t\u0010¼\u0001\u001a\u00020]H\u0002J\u0013\u0010½\u0001\u001a\u00020]2\b\u0010¾\u0001\u001a\u00030»\u0001H\u0002J\t\u0010¿\u0001\u001a\u00020]H\u0002J\t\u0010À\u0001\u001a\u00020]H\u0002J\u0015\u0010Á\u0001\u001a\u00020!2\n\u0010¬\u0001\u001a\u0005\u0018\u00010­\u0001H\u0002J\t\u0010Â\u0001\u001a\u00020!H\u0016J\t\u0010Ã\u0001\u001a\u00020!H\u0002J\u0015\u0010Ä\u0001\u001a\u00020]2\n\u0010¬\u0001\u001a\u0005\u0018\u00010­\u0001H\u0002J\t\u0010Å\u0001\u001a\u00020!H\u0002J\u0012\u0010Æ\u0001\u001a\u00020]2\u0007\u0010Ç\u0001\u001a\u00020rH\u0016J'\u0010È\u0001\u001a\u00020]2\u0007\u0010±\u0001\u001a\u00020\u00152\u0007\u0010É\u0001\u001a\u00020\u00152\n\u0010Ê\u0001\u001a\u0005\u0018\u00010Ë\u0001H\u0016J\u0012\u0010Ì\u0001\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020rH\u0016J\u0012\u0010Í\u0001\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020rH\u0016J\u0015\u0010Î\u0001\u001a\u00020!2\n\u0010Ï\u0001\u001a\u0005\u0018\u00010Ð\u0001H\u0016J\t\u0010Ñ\u0001\u001a\u00020]H\u0016J\u0012\u0010Ò\u0001\u001a\u00020]2\u0007\u0010Ó\u0001\u001a\u00020\u0015H\u0016J\u0012\u0010Ô\u0001\u001a\u00020]2\u0007\u0010Õ\u0001\u001a\u00020rH\u0016J3\u0010Ö\u0001\u001a\u00020]2\n\u0010×\u0001\u001a\u0005\u0018\u00010Ø\u00012\u0010\u0010Ù\u0001\u001a\u000b\u0012\u0005\u0012\u00030Ú\u0001\u0018\u00010\u000e2\n\u0010Û\u0001\u001a\u0005\u0018\u00010Ú\u0001H\u0016J\u001e\u0010Ü\u0001\u001a\u00020]2\t\u0010\u0001\u001a\u0004\u0018\u00010r2\b\u0010Ý\u0001\u001a\u00030Þ\u0001H\u0016J\u001e\u0010ß\u0001\u001a\u00020]2\t\u0010\u0001\u001a\u0004\u0018\u00010r2\b\u0010Ý\u0001\u001a\u00030Þ\u0001H\u0016J@\u0010à\u0001\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020r2\u0017\u0010á\u0001\u001a\u0012\u0012\u0004\u0012\u00020r0\u0019j\b\u0012\u0004\u0012\u00020r`\u001b2\u0013\u0010x\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020r0\u000e0\u0001H\u0016J>\u0010â\u0001\u001a\u00020]2\t\u0010\u0001\u001a\u0004\u0018\u00010r2\u0010\u0010ã\u0001\u001a\u000b\u0012\u0005\u0012\u00030ä\u0001\u0018\u00010\u000e2\u0016\u0010x\u001a\u0012\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ä\u00010p\u0018\u00010\u0001H\u0016J\u0012\u0010å\u0001\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020rH\u0016J\u0012\u0010æ\u0001\u001a\u00020]2\u0007\u0010Õ\u0001\u001a\u00020rH\u0016J\t\u0010ç\u0001\u001a\u00020]H\u0016J\t\u0010è\u0001\u001a\u00020]H\u0016J\u0012\u0010é\u0001\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020rH\u0016J\u0012\u0010ê\u0001\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020rH\u0016J\u001c\u0010ë\u0001\u001a\u00020]2\b\u0010ì\u0001\u001a\u00030í\u00012\u0007\u0010î\u0001\u001a\u00020!H\u0016J\u0012\u0010ï\u0001\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020rH\u0016J\u001b\u0010ð\u0001\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020r2\u0007\u0010ñ\u0001\u001a\u00020\u0015H\u0016J\u0012\u0010ò\u0001\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020rH\u0016J\u0018\u0010ó\u0001\u001a\b\u0012\u0004\u0012\u00020r0\u000e2\u0007\u0010ô\u0001\u001a\u00020\u0015H\u0016JF\u0010õ\u0001\u001a\u00020]2\n\u0010ö\u0001\u001a\u0005\u0018\u00010Ø\u00012\n\u0010÷\u0001\u001a\u0005\u0018\u00010ø\u00012\b\u0010ù\u0001\u001a\u00030í\u00012\u0007\u0010ú\u0001\u001a\u00020!2\u0007\u0010î\u0001\u001a\u00020!2\u0007\u0010û\u0001\u001a\u00020\u0015H\u0016J\u0012\u0010ü\u0001\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020rH\u0016J\t\u0010ý\u0001\u001a\u00020]H\u0016J\u0012\u0010þ\u0001\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020rH\u0016J\u0012\u0010ÿ\u0001\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020rH\u0016J\u0012\u0010\u0002\u001a\u00020]2\u0007\u0010\u0002\u001a\u00020\u0015H\u0016J\u0012\u0010\u0002\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020rH\u0016J\u0012\u0010\u0002\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020rH\u0016J\t\u0010\u0002\u001a\u00020]H\u0016J\u001b\u0010\u0002\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020r2\u0007\u0010\u0002\u001a\u00020!H\u0016J\u0012\u0010\u0002\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020rH\u0016J*\u0010\u0002\u001a\u00020]2\n\u0010ö\u0001\u001a\u0005\u0018\u00010Ø\u00012\n\u0010ì\u0001\u001a\u0005\u0018\u00010í\u00012\u0007\u0010ú\u0001\u001a\u00020!H\u0016J\u001b\u0010\u0002\u001a\u00020]2\u0007\u0010\u0002\u001a\u00020r2\u0007\u0010\u0001\u001a\u00020rH\u0016J)\u0010\u0002\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020r2\t\u0010\u0002\u001a\u0004\u0018\u00010r2\n\u0010\u0002\u001a\u0005\u0018\u00010\u0002H\u0016J \u0010\u0002\u001a\u00020]2\u0015\u0010\u0002\u001a\u0010\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030\u00020\u0002H\u0016J+\u0010\u0002\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020r2\u0017\u0010á\u0001\u001a\u0012\u0012\u0004\u0012\u00020r0\u0019j\b\u0012\u0004\u0012\u00020r`\u001bH\u0016J&\u0010\u0002\u001a\u00020]2\t\u0010\u0001\u001a\u0004\u0018\u00010r2\u0010\u0010\u0002\u001a\u000b\u0012\u0005\u0012\u00030ä\u0001\u0018\u00010\u000eH\u0016J\u0012\u0010\u0002\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020rH\u0016J\u001b\u0010\u0002\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020r2\u0007\u0010\u0002\u001a\u00020\u0015H\u0016J\t\u0010\u0002\u001a\u00020]H\u0016J\u0012\u0010\u0002\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020rH\u0016J\u0012\u0010\u0002\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020rH\u0016J\u0012\u0010\u0002\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020rH\u0016J\u0014\u0010\u0002\u001a\u00020]2\t\u0010\u0001\u001a\u0004\u0018\u00010rH\u0016J\u0012\u0010\u0002\u001a\u00020]2\u0007\u0010\u0002\u001a\u00020!H\u0016J\t\u0010\u0002\u001a\u00020]H\u0016J\u0012\u0010 \u0002\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020rH\u0016J\u0012\u0010¡\u0002\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020rH\u0016J\u001b\u0010¢\u0002\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020r2\u0007\u0010£\u0002\u001a\u00020\u0015H\u0016J\u001d\u0010¤\u0002\u001a\u00020]2\t\u0010\u0001\u001a\u0004\u0018\u00010r2\u0007\u0010¥\u0002\u001a\u00020!H\u0016JO\u0010¦\u0002\u001a\u00020]\"\u0019\b\u0000\u0010§\u0002*\u0012\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030\u0002\u0018\u00010\u00022\b\u0010ö\u0001\u001a\u00030Ø\u00012\b\u0010¨\u0002\u001a\u00030©\u00022\u0015\u0010ª\u0002\u001a\u0010\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030\u00020\u0002H\u0016J\u0014\u0010«\u0002\u001a\u00020]2\t\u0010\u0001\u001a\u0004\u0018\u00010rH\u0016J\t\u0010¬\u0002\u001a\u00020]H\u0016J'\u0010­\u0002\u001a\u00020]2\b\u0010ö\u0001\u001a\u00030Ø\u00012\u0012\u0010®\u0002\u001a\r\u0012\t\u0012\u0007\u0012\u0002\b\u00030¯\u00020(H\u0016J0\u0010°\u0002\u001a\u00020]2\u0007\u0010±\u0002\u001a\u00020r2\u0007\u0010\u0001\u001a\u00020r2\u0007\u0010\u0002\u001a\u00020r2\n\u0010\u0002\u001a\u0005\u0018\u00010\u0002H\u0016J\u001d\u0010²\u0002\u001a\u00020]2\t\u0010\u0001\u001a\u0004\u0018\u00010r2\u0007\u0010£\u0002\u001a\u00020\u0015H\u0016J\u001d\u0010³\u0002\u001a\u00020]2\u0012\u0010´\u0002\u001a\r\u0012\t\u0012\u0007\u0012\u0002\b\u00030\u00020pH\u0002J\t\u0010µ\u0002\u001a\u00020]H\u0016J\u0012\u0010¶\u0002\u001a\u00020]2\u0007\u0010·\u0002\u001a\u00020\u0015H\u0002J/\u0010¸\u0002\u001a\u00020]2\u0007\u0010£\u0002\u001a\u00020\u00152\u0007\u0010¹\u0002\u001a\u00020!2\u0007\u0010º\u0002\u001a\u00020\u00152\t\u0010x\u001a\u0005\u0018\u00010»\u0002H\u0016J$\u0010¼\u0002\u001a\u00020]2\u0007\u0010½\u0002\u001a\u00020\u00152\u0007\u0010¹\u0002\u001a\u00020!2\t\u0010x\u001a\u0005\u0018\u00010»\u0002J\t\u0010¾\u0002\u001a\u00020]H\u0016J\t\u0010¿\u0002\u001a\u00020]H\u0002J/\u0010À\u0002\u001a\u00020]2\u0007\u0010Á\u0002\u001a\u00020\u00152\u0007\u0010Â\u0002\u001a\u00020!2\u0007\u0010Ã\u0002\u001a\u00020!2\t\u0010^\u001a\u0005\u0018\u00010Ä\u0002H\u0016J\u0018\u0010Å\u0002\u001a\u00020]2\r\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020r0pH\u0016J\u001b\u0010Æ\u0002\u001a\u00020]2\u0007\u0010£\u0002\u001a\u00020\u00152\u0007\u0010Ç\u0002\u001a\u00020\u0015H\u0016J\u001f\u0010È\u0002\u001a\u00020]2\t\u0010É\u0002\u001a\u0004\u0018\u00010r2\t\u0010\u0002\u001a\u0004\u0018\u00010rH\u0016J\u0013\u0010Ê\u0002\u001a\u00020]2\b\u0010Ë\u0002\u001a\u00030Ì\u0002H\u0016J\t\u0010Í\u0002\u001a\u00020]H\u0002J\u0010\u0010Î\u0002\u001a\u00020]2\u0007\u0010\u0001\u001a\u00020rJ\t\u0010Ï\u0002\u001a\u00020]H\u0002J\u0012\u0010Ð\u0002\u001a\u00020]2\u0007\u0010Ç\u0001\u001a\u00020rH\u0002J)\u0010Ñ\u0002\u001a\u00020]2\u0007\u0010¥\u0002\u001a\u00020!2\n\u0010Ò\u0002\u001a\u0005\u0018\u00010«\u00012\t\u0010^\u001a\u0005\u0018\u00010Ó\u0002H\u0016J\u0013\u0010Ô\u0002\u001a\u00020]2\b\u0010Õ\u0002\u001a\u00030\u0001H\u0002J)\u0010Ö\u0002\u001a\u00020]2\u000e\u0010×\u0002\u001a\t\u0012\u0004\u0012\u00020r0Ø\u00022\u000e\u0010Ù\u0002\u001a\t\u0012\u0004\u0012\u00020s0Ú\u0002H\u0016R!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030(\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010+\u001a\u0012\u0012\u0004\u0012\u00020,0\u0019j\b\u0012\u0004\u0012\u00020,`\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001d0/X\u0004¢\u0006\u0002\n\u0000R\u001e\u00100\u001a\u0012\u0012\u0004\u0012\u0002010\u0019j\b\u0012\u0004\u0012\u000201`\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u000e¢\u0006\u0002\n\u0000R\u001c\u00104\u001a\u0004\u0018\u000105X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001e\u0010:\u001a\u0012\u0012\u0004\u0012\u00020;0\u0019j\b\u0012\u0004\u0012\u00020;`\u001bX\u000e¢\u0006\u0002\n\u0000R \u0010<\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030(\u0012\u0004\u0012\u00020\u001d\u0018\u00010=X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010>\u001a\u0012\u0012\u0004\u0012\u00020?0\u0019j\b\u0012\u0004\u0012\u00020?`\u001bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010@\u001a\u0004\u0018\u00010AX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001e\u0010F\u001a\u0012\u0012\u0004\u0012\u00020G0\u0019j\b\u0012\u0004\u0012\u00020G`\u001bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010H\u001a\u0004\u0018\u00010IX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001c\u0010N\u001a\u0004\u0018\u00010OX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001e\u0010T\u001a\u0012\u0012\u0004\u0012\u00020U0\u0019j\b\u0012\u0004\u0012\u00020U`\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010V\u001a\u0004\u0018\u00010WX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020YX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010Z\u001a\u0004\u0018\u00010[X\u000e¢\u0006\u0002\n\u0000¨\u0006Ü\u0002"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/menu/handler/IMenuHandlerHub;", "Lcom/ss/android/lark/chat/chatwindow/chat/message/callbacks/MessageCallbackHub;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListResultHandler$IMessageListResultHandler;", "mContext", "Landroidx/fragment/app/FragmentActivity;", "hostVM", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageDependenceViewModel;", "messageListComponentDependency", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$MessageListComponentDependency;", "(Landroidx/fragment/app/FragmentActivity;Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageDependenceViewModel;Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$MessageListComponentDependency;)V", "callbacks", "", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$IListComponentCallbacks;", "getCallbacks", "()Ljava/util/List;", "callbacks$delegate", "Lkotlin/Lazy;", "layoutId", "", "getLayoutId", "()I", "mAudioPlayerModeListeners", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$OnAudioPlayerModeListener;", "Lkotlin/collections/ArrayList;", "mChatAdapter", "Lcom/ss/android/lark/chat/chatwindow/chat/ChatAdapter;", "mClosePageDialog", "Lcom/larksuite/component/ui/dialog/LKUIDialog;", "mCompleteStatics", "", "mCurrentListMode", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$ListMode;", "mFeatureGatingDependency", "Lcom/ss/android/lark/dependency/IFeatureGatingDependency;", "mItemDetector", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/widget/RecyclerViewItemDetector;", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "mItemShineManager", "Lcom/ss/android/lark/chat/base/view/recycleview/ItemShineManager;", "mKeyboardTipListenerList", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$IKeyboardTipChangeListener;", "mListReady", "mListScroller", "Lcom/ss/android/lark/chat/chatwindow/chat/MessageListScroller;", "mMessageCallbackHandlerList", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageCallbackHandler;", "mMessageContext", "Lcom/ss/android/lark/chat/chatwindow/chat/ChatWindowContext;", "mMessageRV", "Lcom/ss/android/lark/widget/recyclerview/PointRecoderRecyclerView;", "getMMessageRV", "()Lcom/ss/android/lark/widget/recyclerview/PointRecoderRecyclerView;", "setMMessageRV", "(Lcom/ss/android/lark/widget/recyclerview/PointRecoderRecyclerView;)V", "mMessageTipChangeListener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$IMessageTipChangeListener;", "mMultiSelector", "Lcom/ss/android/lark/widget/recyclerview/MultiSelector;", "mNewMessageArrivedListenerList", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$INewMessageArrivedListener;", "mP2pChatterDeactivatedTipTV", "Landroid/widget/TextView;", "getMP2pChatterDeactivatedTipTV", "()Landroid/widget/TextView;", "setMP2pChatterDeactivatedTipTV", "(Landroid/widget/TextView;)V", "mPendingScrollListeners", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "mPtrFrame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "getMPtrFrame", "()Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "setMPtrFrame", "(Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;)V", "mRootLayout", "Lcom/larksuite/component/ui/layout/LKUIRelativeLayout;", "getMRootLayout", "()Lcom/larksuite/component/ui/layout/LKUIRelativeLayout;", "setMRootLayout", "(Lcom/larksuite/component/ui/layout/LKUIRelativeLayout;)V", "mSelectedMessageListener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$ISelectedMessageChangeListener;", "mViewModel", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListViewModel;", "menuProviderHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/menu/MenuProviderHandlerHub;", "resultHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListResultHandler;", "addAudioPlayModeChangeListener", "", "listener", "addKeyboardTipChangeListener", "addMessageCallbackHandler", "handler", "addMessageMenuProvider", "menuProvider", "Lcom/ss/android/lark/chat/chatwindow/chat/menu/IMessageMenuProvider;", "addMessageSelectModeChangeListener", "addNewMessageArrivedListener", "addOnItemDetectedListener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/widget/RecyclerViewItemDetector$ItemDetectListener;", "addOnScrollListener", "addSelectedMessageChangeListener", "appendReEditMessage", "contentVO", "Lcom/ss/android/lark/chat/base/view/vo/message/BaseTextContentVO;", "batchUpdateMsg", "patchProviderList", "", "Lcom/ss/android/lark/chatbase/BasePageStore$PatchProvider;", "", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "canLoadMore", "cancelAnim", "changeListBottomMargin", "height", "callback", "Lkotlin/Function0;", "changeListMode", "mode", "selectedPosition", "checkBotAvailable", "checkToAutoLoadMore", "checkToSendRedPacketHitPoint", "messageId", "closePage", "closePageWithConfirmDialog", "msg", "ensureLastPageDataLoaded", "getAllMsg", "getBotDeleteUseText", "Landroid/text/SpannableStringBuilder;", "openApp", "Lcom/ss/android/lark/biz/im/api/OpenApp;", "getBotOfflineUseText", "getBotStopUseText", "getBotUserInvisibleText", "getBotUserInvisibleTextCanApply", "getBotUserInvisibleTextCanNotApply", "getChatChatter", "chatId", "dataCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/dto/chat/ChatChatterResponse;", "getCurrentChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getCurrentPageMsg", "getFirstCompletelyVisibleMsgPos", "getFollowingSelectMessageIds", "getLastItemPositionOnScreen", "getLastVisibleMsgPos", "getListScroller", "getMessageContext", "getMessagesRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMsgById", "id", "getMsgListByIds", "ids", "", "getMsgPosByAdapterPos", "adapterPos", "getRootLayout", "Landroid/widget/RelativeLayout;", "getSelectedMsgList", "getTabHeight", "getTodoCreateSummary", "", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "gotoP2PBuildGroupSelectChatter", "initAdapter", "initBuildGroupState", "requestCode", "selectEntities", "Lcom/ss/android/lark/chat/entity/chat/PickChatEntity;", "showDepartmentId", "contacts", "Lcom/ss/android/lark/contact/entity/Contact;", "initDeactivatedTipTV", "initItemDetector", "initMessageContext", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "initMessageList", "initMessageListWithInitData", "it", "initPullToRefresh", "initRootView", "interceptStickerBeforeForward", "isLastItemShown", "isOtherDismission", "logStickerForward", "needShowDeactiviedTip", "onActionHandleAsyncStart", "msgId", "onActivityResult", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onAddSticker", "onAuditedFailed", "onAvatarLongClick", "chatterVO", "Lcom/ss/android/lark/chat/vo/ChatChatterVO;", "onBannerHide", "onBannerShow", "bannerHeight", "onCancelUploadClick", "messageCid", "onCardImageClick", "imageView", "Landroid/view/View;", "cardImags", "Lcom/ss/android/lark/widget/richtext/Image;", "clickedImageItem", "onCellEndBind", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "onCellStartBind", "onCheckChatterInChat", "chatterIds", "onCheckMembersInChat", "entities", "Lcom/ss/android/lark/dto/group/GroupRecallEntity;", "onClosePreview", "onContinueUploadClick", "onCreate", "onDestroy", "onDingMessage", "onDownloadFileBtnClick", "onEditClicked", "photoItem", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "isClickTranslated", "onFileClick", "onFolderClick", "topicTabType", "onForward", "onGetAudioMessageCids", "startPosition", "onImageClick", "itemView", "locationInfo", "Lcom/ss/android/lark/widget/photo_picker/animation/activity_transition/ActivityTransitionLauncher$LocationInfo;", "selectPhoItem", "isMutePlay", "fromType", "onInvalidGroupShare", "onMergeForwardSuccess", "onMessageBurned", "onMessageRead", "onMultiSelect", "adapterPosition", "onOnlineReviewFileClick", "onOpenLKPFileBtnClick", "onPause", "onPinMessage", "isAdd", "onPlay", "onPreMediaClick", "onPrepareAudio", "audioKey", "onPreviewFileInDrive", "sourceId", "sourceType", "Lcom/ss/android/lark/chat/entity/message/Message$SourceType;", "onReEdit", "messageVO", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "onRecallChatters", "onRecallMembers", "entityList", "onReplyAreaClick", "onReplyMessage", "onResume", "onRetrySendMessage", "onSaveFavorite", "onShowMoreClick", "onShowTranslatePreview", "onStartPhoneCallSysClick", "recallOrCallBack", "onStop", "onStopDownloadFileBtnClick", "onThreadMergeForwardClick", "onTodoClick", "position", "onToggleAudioTextClick", "shown", "onTranslate", "M", "hiveHolder", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveHolder;", "translatableMessageVO", "onTranslateFeedbackClick", "onTranslateSettingClick", "onTranslateShowOriginClick", "textMessageVO", "Lcom/ss/android/lark/chat/base/view/vo/message/TranslatableContentVO;", "onUploadToDriveSpaceBtnClick", "fileKey", "onViewMessageInChat", "readMessage", "intervalMessages", "refreshMessageList", "scrollAfterInitLoad", "initialPosition", "scrollItemToCenter", "smooth", "animStyle", "Lcom/ss/android/lark/chat/chatwindow/chat/MessageListScroller$ScrollCallback;", "scrollToBottom", "delay", "scrollToBottomIfNeed", "scrollToNewMessage", "scrollToPosition", "newPosition", "showAnim", "toBottom", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$OnLoadMessageStatusListener;", "selectMsgByMsgIds", "selectMsgFromPosition", "limit", "sendUserSignRequest", "description", "serialExecute", "runnable", "Ljava/lang/Runnable;", "showPinSideGuide", "showTooManyMessageDialog", "statisticPerf", "stopBurnMsgAudio", "updateKeyboardTip", "tipContent", "Landroid/view/View$OnClickListener;", "updateListDecoration", "messageRV", "updateMsg", "key", "Lcom/ss/android/lark/chatbase/BasePageStore$ItemTwoKey;", "updater", "Lcom/ss/android/lark/chatbase/model/PageStore$IItemPatch;", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class MessageListComponent extends Widget implements AbstractC33120i, AbstractC33296f, IMessageListComponent, MessageListResultHandler.IMessageListResultHandler {

    /* renamed from: o */
    public static boolean f86468o = true;

    /* renamed from: p */
    public static boolean f86469p = true;

    /* renamed from: q */
    public static final Companion f86470q = new Companion(null);

    /* renamed from: A */
    private RecyclerViewItemDetector<ChatMessageVO<?>> f86471A;

    /* renamed from: B */
    private ArrayList<MessageCallbackHandler> f86472B = new ArrayList<>();

    /* renamed from: C */
    private ArrayList<IMessageListComponent.IMessageTipChangeListener> f86473C = new ArrayList<>();

    /* renamed from: D */
    private ArrayList<IMessageListComponent.IKeyboardTipChangeListener> f86474D = new ArrayList<>();

    /* renamed from: E */
    private MessageListResultHandler f86475E;

    /* renamed from: F */
    private DialogC25637f f86476F;

    /* renamed from: G */
    private final AbstractC36503q f86477G;

    /* renamed from: H */
    private MenuProviderHandlerHub f86478H;

    /* renamed from: I */
    private final IMessageDependenceViewModel f86479I;

    /* renamed from: a */
    public boolean f86480a;

    /* renamed from: b */
    public MessageListViewModel f86481b;

    /* renamed from: c */
    public final C33086b f86482c = new C33086b();

    /* renamed from: d */
    public C58984d<ChatMessageVO<?>, C33086b> f86483d;

    /* renamed from: e */
    public final C33247j<C33086b> f86484e = new C33247j<>();

    /* renamed from: g */
    public C33234e f86485g;

    /* renamed from: h */
    public boolean f86486h;

    /* renamed from: i */
    public ArrayList<IMessageListComponent.INewMessageArrivedListener> f86487i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<IMessageListComponent.ISelectedMessageChangeListener> f86488j = new ArrayList<>();

    /* renamed from: k */
    public IMessageListComponent.ListMode f86489k = IMessageListComponent.ListMode.NORMAL;

    /* renamed from: l */
    public ItemShineManager<?> f86490l;

    /* renamed from: m */
    public final FragmentActivity f86491m;

    /* renamed from: n */
    public final IMessageListComponent.MessageListComponentDependency f86492n;

    /* renamed from: t */
    private PointRecoderRecyclerView f86493t;

    /* renamed from: u */
    private TextView f86494u;

    /* renamed from: v */
    private LKUIPtrFrameLayout f86495v;

    /* renamed from: w */
    private LKUIRelativeLayout f86496w;

    /* renamed from: x */
    private final Lazy f86497x = LazyKt.lazy(C33572b.INSTANCE);

    /* renamed from: y */
    private final ArrayList<IMessageListComponent.OnAudioPlayerModeListener> f86498y = new ArrayList<>();

    /* renamed from: z */
    private final ArrayList<RecyclerView.OnScrollListener> f86499z = new ArrayList<>();

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent
    /* renamed from: a */
    public List<IMessageListComponent.IListComponentCallbacks> mo121968a() {
        return (List) this.f86497x.getValue();
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33128q
    /* renamed from: a */
    public /* synthetic */ void mo122318a(View view, AbsMessageVO aVar) {
        AbstractC33128q.CC.$default$a(this, view, aVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.view.menu.handler.IViewInChatMenuHandler
    /* renamed from: c */
    public void mo123352c(String str, int i) {
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: d */
    public int mo121986d() {
        return R.layout.chat_window_component_message_list;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33307q
    /* renamed from: r */
    public void mo122779r(String str) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent$Companion;", "", "()V", "AUTO_LOAD_MESSAGE_THRESHOLD", "", "MAX_SYNC_MESSAGE_COUNT", "RELOCATE_MSG_DELAY_IN_MILLS", "", "sIsFirstStartAfterInitApp", "", "getSIsFirstStartAfterInitApp", "()Z", "setSIsFirstStartAfterInitApp", "(Z)V", "sIsFirstStartForLoadNextPage", "getSIsFirstStartForLoadNextPage", "setSIsFirstStartForLoadNextPage", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final boolean mo123372a() {
            return MessageListComponent.f86469p;
        }

        /* renamed from: a */
        public final void mo123371a(boolean z) {
            MessageListComponent.f86469p = z;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent$initRootView$1", "Lcom/larksuite/component/ui/layout/plus/PerMonitorRenderLKUIPlus$MonitorCallback;", "onBeginRender", "", "onEndRender", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$ad */
    public static final class C33564ad implements PerMonitorRenderLKUIPlus.MonitorCallback {
        C33564ad() {
        }

        @Override // com.larksuite.component.ui.layout.plus.PerMonitorRenderLKUIPlus.MonitorCallback
        /* renamed from: a */
        public void mo89750a() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134577e().mo120974e();
        }

        @Override // com.larksuite.component.ui.layout.plus.PerMonitorRenderLKUIPlus.MonitorCallback
        /* renamed from: b */
        public void mo89751b() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134577e().mo120975f();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    public C33234e aq_() {
        return this.f86485g;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: i */
    public C33247j<?> mo123325i() {
        return this.f86484e;
    }

    /* renamed from: p */
    public final PointRecoderRecyclerView mo123358p() {
        return this.f86493t;
    }

    /* renamed from: s */
    public final LKUIPtrFrameLayout mo123359s() {
        return this.f86495v;
    }

    /* renamed from: t */
    public final LKUIRelativeLayout mo123360t() {
        return this.f86496w;
    }

    /* renamed from: a */
    public void mo121971a(IMessageListComponent.IListComponentCallbacks cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        IMessageListComponent.C33555a.m130088a(this, cVar);
    }

    /* renamed from: a */
    public final void mo123348a(C35219b bVar) {
        C1177w<List<ChatMessageVO<?>>> messageList;
        C1177w<Boolean> needRelocateMessage;
        C1177w<List<MessageInfo>> newMessageItems;
        C1177w<String> closePageInfo;
        C1177w<String> dialogInfo;
        C1177w<String> toastInfo;
        C1177w<ChatChatter> p2pChatterLiveData;
        C1177w<ChatChatter> selfChatterLiveData;
        C1177w<Chat> currentChat;
        m130128b(bVar);
        m130118T();
        Chat chat = bVar.f90956f;
        Intrinsics.checkExpressionValueIsNotNull(chat, "it.chat");
        ChatChatter chatChatter = bVar.f90958h;
        Intrinsics.checkExpressionValueIsNotNull(chatChatter, "it.self");
        MessageListModelFactory eVar = new MessageListModelFactory(this.f86491m, chat, chatChatter, bVar.f90957g, bVar.f90953c, this.f86492n);
        Object o = mo141195o();
        if (o != null) {
            MessageListViewModel gVar = (MessageListViewModel) new C1144ai((Fragment) o, eVar).mo6006a(WidgetViewModelKeyManager.f86344a.mo123198a(MessageListViewModel.class), MessageListViewModel.class);
            this.f86481b = gVar;
            if (gVar != null) {
                C32920b from = C32920b.from(this.f86491m);
                Intrinsics.checkExpressionValueIsNotNull(from, "ActionDispatcher.from(mContext)");
                gVar.setActionDispatch(from);
            }
            MessageListViewModel gVar2 = this.f86481b;
            if (gVar2 != null) {
                gVar2.setScreenItemProvider(new C33590s(this));
            }
            m130125a(bVar.f90960j);
            this.f86475E = new MessageListResultHandler(this);
            MessageListViewModel gVar3 = this.f86481b;
            if (!(gVar3 == null || (currentChat = gVar3.getCurrentChat()) == null)) {
                currentChat.mo5923a(this, new C33592u(this));
            }
            MessageListViewModel gVar4 = this.f86481b;
            if (!(gVar4 == null || (selfChatterLiveData = gVar4.getSelfChatterLiveData()) == null)) {
                selfChatterLiveData.mo5923a(this, new C33593v(this));
            }
            MessageListViewModel gVar5 = this.f86481b;
            if (!(gVar5 == null || (p2pChatterLiveData = gVar5.getP2pChatterLiveData()) == null)) {
                p2pChatterLiveData.mo5923a(this, new C33594w(this));
            }
            MessageListViewModel gVar6 = this.f86481b;
            if (!(gVar6 == null || (toastInfo = gVar6.getToastInfo()) == null)) {
                toastInfo.mo5923a(this, new C33595x(this));
            }
            MessageListViewModel gVar7 = this.f86481b;
            if (!(gVar7 == null || (dialogInfo = gVar7.getDialogInfo()) == null)) {
                dialogInfo.mo5923a(this, new C33596y(this));
            }
            MessageListViewModel gVar8 = this.f86481b;
            if (!(gVar8 == null || (closePageInfo = gVar8.getClosePageInfo()) == null)) {
                closePageInfo.mo5923a(this, new C33597z(this));
            }
            MessageListViewModel gVar9 = this.f86481b;
            if (!(gVar9 == null || (newMessageItems = gVar9.getNewMessageItems()) == null)) {
                newMessageItems.mo5923a(this, new C33557aa(this));
            }
            MessageListViewModel gVar10 = this.f86481b;
            if (!(gVar10 == null || (needRelocateMessage = gVar10.getNeedRelocateMessage()) == null)) {
                C33427a.m129533a(needRelocateMessage, this, new C33558ab(this, bVar));
            }
            MessageListViewModel gVar11 = this.f86481b;
            if (!(gVar11 == null || (messageList = gVar11.getMessageList()) == null)) {
                messageList.mo5923a(this, new C33591t(this, bVar));
            }
            MessageListViewModel gVar12 = this.f86481b;
            if (gVar12 != null) {
                gVar12.loadFirstPage(bVar.f90964n);
            }
            PerfLog.end("message_list_init_with_data", "");
            PointRecoderRecyclerView pointRecoderRecyclerView = this.f86493t;
            if (pointRecoderRecyclerView != null) {
                m130124a((RecyclerView) pointRecoderRecyclerView);
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: a */
    public void mo123305a(int i, boolean z, boolean z2, IMessageListComponent.OnLoadMessageStatusListener iVar) {
        MessageListViewModel gVar = this.f86481b;
        if (gVar == null) {
            return;
        }
        if (!gVar.containsPosition(i)) {
            if (iVar != null) {
                iVar.mo122144a();
            }
            gVar.loadSpecialPage(i, new UIGetDataCallback(new ar(this, i, z2, iVar)));
        } else if (z2) {
            mo123344a(0, true, (C33247j.AbstractC33251c) null);
        } else {
            mo123343a(i, true, 1, (C33247j.AbstractC33251c) null);
        }
    }

    /* renamed from: a */
    public void mo123343a(int i, boolean z, int i2, C33247j.AbstractC33251c cVar) {
        C33256m mVar = new C33256m(i);
        this.f86484e.mo122596a(new C33247j.C33250b().mo122605a(mVar).mo122609b(150).mo122607a(z).mo122604a(17).mo122606a(new ap(this, i2, mVar, cVar)).mo122608a());
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: a */
    public void mo123311a(IMessageListComponent.ISelectedMessageChangeListener fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "listener");
        if (!this.f86488j.contains(fVar)) {
            this.f86488j.add(fVar);
        }
    }

    /* renamed from: a */
    public void mo123345a(RecyclerView.OnScrollListener onScrollListener) {
        Intrinsics.checkParameterIsNotNull(onScrollListener, "listener");
        PointRecoderRecyclerView pointRecoderRecyclerView = this.f86493t;
        if (pointRecoderRecyclerView == null) {
            this.f86499z.add(onScrollListener);
        } else if (pointRecoderRecyclerView != null) {
            pointRecoderRecyclerView.addOnScrollListener(onScrollListener);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: a */
    public void mo123310a(IMessageListComponent.INewMessageArrivedListener eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "listener");
        this.f86487i.add(eVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: a */
    public void mo123312a(MessageCallbackHandler cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "handler");
        this.f86472B.add(cVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: a */
    public void mo123313a(RecyclerViewItemDetector.ItemDetectListener<ChatMessageVO<?>> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        RecyclerViewItemDetector<ChatMessageVO<?>> bVar = this.f86471A;
        if (bVar != null) {
            bVar.mo123935a(cVar);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListResultHandler.IMessageListResultHandler, com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: a */
    public void mo123314a(AbstractC34417b.AbstractC34421c<String> cVar, AbstractC34432b.AbstractC34434b<AbstractC34006a> bVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "key");
        Intrinsics.checkParameterIsNotNull(bVar, "updater");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            gVar.updateMsg(cVar, bVar);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: a */
    public void mo123316a(List<? extends AbstractC34417b.AbstractC34426h<String, AbstractC34006a>> list) {
        Intrinsics.checkParameterIsNotNull(list, "patchProviderList");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            gVar.batchUpdateMsg(list);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: a */
    public void mo123315a(Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(runnable, "runnable");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            gVar.executeMessage(runnable);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33132u
    /* renamed from: b */
    public void mo121941b(String str, boolean z) {
        Iterator<T> it = this.f86472B.iterator();
        while (it.hasNext()) {
            it.next().mo121941b(str, z);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33126o
    /* renamed from: a */
    public void mo121938a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        ak akVar = new ak(this, i);
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            gVar.getReplyInfo(str, new UIGetDataCallback(akVar));
        }
        m130134y(str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.block.MessageUserInfoBlock.AbstractC33319a
    /* renamed from: a */
    public void mo122810a(String str, String str2) {
        String str3 = str;
        boolean z = false;
        if (!(str3 == null || str3.length() == 0)) {
            String str4 = str2;
            if (str4 == null || str4.length() == 0) {
                z = true;
            }
            if (!z) {
                MessageListViewModel gVar = this.f86481b;
                if (gVar != null) {
                    gVar.sendSignRequest(str, str2);
                    return;
                }
                return;
            }
        }
        Log.m165389i("ChatWindowLog", "personal sign is null or userId is null");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: a */
    public void mo123307a(IMessageListComponent.ListMode listMode, int i) {
        int i2;
        C58984d<ChatMessageVO<?>, C33086b> dVar;
        Intrinsics.checkParameterIsNotNull(listMode, "mode");
        this.f86489k = listMode;
        Iterator<T> it = this.f86473C.iterator();
        while (true) {
            boolean z = true;
            i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (listMode != IMessageListComponent.ListMode.MULTI_SELECT) {
                z = false;
            }
            next.mo122151a(z);
        }
        if (listMode == IMessageListComponent.ListMode.NORMAL) {
            C58984d<ChatMessageVO<?>, C33086b> dVar2 = this.f86483d;
            if (dVar2 != null) {
                dVar2.mo200103a(false);
            }
            C33234e eVar = this.f86485g;
            if (eVar != null) {
                eVar.mo122536b();
            }
            TextView textView = this.f86494u;
            if (textView != null) {
                if (!m130119U()) {
                    i2 = 8;
                }
                textView.setVisibility(i2);
                return;
            }
            return;
        }
        C58984d<ChatMessageVO<?>, C33086b> dVar3 = this.f86483d;
        if (dVar3 != null) {
            dVar3.mo200103a(true);
        }
        if (i >= 0 && (dVar = this.f86483d) != null) {
            dVar.mo200098a(i);
        }
        TextView textView2 = this.f86494u;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: a */
    public void mo123317a(boolean z, CharSequence charSequence, View.OnClickListener onClickListener) {
        TextView textView = this.f86494u;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 8);
        }
        Iterator<T> it = this.f86474D.iterator();
        while (it.hasNext()) {
            it.next().mo123332a(z);
        }
        TextView textView2 = this.f86494u;
        if (textView2 != null) {
            textView2.setOnClickListener(onClickListener);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            TextView textView3 = this.f86494u;
            if (textView3 != null) {
                textView3.setText(charSequence);
            }
            TextView textView4 = this.f86494u;
            if (textView4 != null) {
                textView4.setHighlightColor(UIHelper.getColor(R.color.color_transparent));
            }
            TextView textView5 = this.f86494u;
            if (textView5 != null) {
                textView5.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        this.f86492n.mo123151a(z);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: a */
    public void mo123306a(IMessageMenuProvider cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "menuProvider");
        this.f86478H.mo122257a(cVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: b */
    public void mo123320b(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "ids");
        C33234e eVar = this.f86485g;
        if (eVar != null) {
            eVar.mo122532a(list);
        }
    }

    /* renamed from: a */
    public void mo123347a(IMessageListComponent.OnAudioPlayerModeListener hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "listener");
        this.f86498y.add(hVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: a */
    public void mo123308a(IMessageListComponent.IKeyboardTipChangeListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f86474D.add(bVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: a */
    public void mo123309a(IMessageListComponent.IMessageTipChangeListener dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "listener");
        this.f86473C.add(dVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33123l
    /* renamed from: a */
    public void mo121939a(String str, boolean z) {
        MessageInfo messageInfoById;
        Chat G;
        MessageListViewModel gVar;
        C1177w<ChatChatter> selfChatterLiveData;
        ChatChatter b;
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        MessageListViewModel gVar2 = this.f86481b;
        if (gVar2 != null && (messageInfoById = gVar2.getMessageInfoById(str)) != null && (G = mo123339G()) != null && (gVar = this.f86481b) != null && (selfChatterLiveData = gVar.getSelfChatterLiveData()) != null && (b = selfChatterLiveData.mo5927b()) != null) {
            Intrinsics.checkExpressionValueIsNotNull(b, "mViewModel?.selfChatterLiveData?.value ?: return");
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            b2.mo134509H().mo134431a(this.f86491m, messageInfoById, G, b, new C33568ah(this, G));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33297g
    /* renamed from: a */
    public boolean mo122762a(C33973b bVar) {
        if (bVar != null) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            if (!b.mo134515N().mo134398a(bVar.mo124202c())) {
                String f = bVar.mo124212f();
                Chat G = mo123339G();
                if (G != null) {
                    if (G.isP2PChat()) {
                        f = bVar.mo124208e();
                    }
                    IMessageListComponent.MessageListComponentDependency gVar = this.f86492n;
                    String c = bVar.mo124202c();
                    Intrinsics.checkExpressionValueIsNotNull(c, "chatterVO.id");
                    Intrinsics.checkExpressionValueIsNotNull(f, "name");
                    return gVar.mo123152a(c, f, false);
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33298h
    /* renamed from: a */
    public void mo122763a(String str, Message.Type type) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134577e().mo120953a(type.getNumber(), str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33303m
    /* renamed from: a */
    public void mo122775a(boolean z) {
        C1177w<ChatChatter> p2pChatterLiveData;
        ChatChatter b;
        if (z) {
            ChatWindowHitPoint.m137638a();
        } else {
            ChatWindowHitPoint.m137640b();
        }
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null && (p2pChatterLiveData = gVar.getP2pChatterLiveData()) != null && (b = p2pChatterLiveData.mo5927b()) != null) {
            Intrinsics.checkExpressionValueIsNotNull(b, "mViewModel?.p2pChatterLiveData?.value ?: return");
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            b2.mo134525X().mo134640a((Activity) this.f86491m, b.getId());
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33301k
    /* renamed from: a */
    public void mo122773a(View view, PhotoItem photoItem, boolean z) {
        Scene scene;
        if (photoItem != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(photoItem);
            Chat G = mo123339G();
            if (G != null) {
                if (G.isSecret()) {
                    scene = Scene.SecretChat;
                } else {
                    scene = Scene.Chat;
                }
                String id = G.getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "currentChat.getId()");
                C29990c.m110930b().mo134542a(this.f86491m, arrayList, 0, view, null, !G.isSecret(), false, false, z, false, false, G.isSecret(), true, null, null, new ChatAlbumClickListenerImpl(id, G.isThread()), scene, 4);
            }
        }
    }

    @Override // com.ss.android.lark.chat.utils.C34365w.AbstractC34377a
    /* renamed from: a */
    public void mo123350a(String str, List<GroupRecallEntity> list, IGetDataCallback<List<GroupRecallEntity>> iGetDataCallback) {
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            gVar.onCheckMembersInChat(str, list, iGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.chat.export.ui.p1671a.AbstractC34027a
    /* renamed from: a */
    public void mo122832a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msgId");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            gVar.registerImmediateMsg(str);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.view.menu.handler.IEditImageMenuHandler
    /* renamed from: a */
    public void mo121937a(PhotoItem photoItem, boolean z) {
        int a;
        PhotoItem photoItem2;
        Chat G;
        MessageIdentity messageIdentity;
        String messageId;
        Intrinsics.checkParameterIsNotNull(photoItem, "photoItem");
        String str = "";
        if (!(photoItem.getMessageIdentity() == null || (messageIdentity = photoItem.getMessageIdentity()) == null || (messageId = messageIdentity.getMessageId()) == null)) {
            str = messageId;
        }
        MessageListViewModel gVar = this.f86481b;
        List<PhotoItem> a2 = C58659h.m227513a(gVar != null ? gVar.getAllImage(str, z) : null);
        if (!CollectionUtils.isEmpty(a2) && (a = C34353s.m133238a(a2, photoItem)) != -1 && a < a2.size() && (photoItem2 = a2.get(a)) != null && (G = mo123339G()) != null) {
            EditImageUtils.m133181a(this.f86491m, photoItem2, this.f86492n.mo123156e(), !G.isSecret(), !G.isSecret());
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33301k
    /* renamed from: a */
    public void mo122772a(View view, ActivityTransitionLauncher.LocationInfo locationInfo, PhotoItem photoItem, boolean z, boolean z2, int i) {
        Scene scene;
        boolean z3;
        MessageIdentity messageIdentity;
        String messageId;
        Intrinsics.checkParameterIsNotNull(photoItem, "selectPhoItem");
        String str = "";
        if (!(photoItem.getMessageIdentity() == null || (messageIdentity = photoItem.getMessageIdentity()) == null || (messageId = messageIdentity.getMessageId()) == null)) {
            str = messageId;
        }
        MessageListViewModel gVar = this.f86481b;
        List<PhotoItem> a = C58659h.m227513a(gVar != null ? gVar.getAllImage(str, z2) : null);
        if (!CollectionUtils.isEmpty(a)) {
            int a2 = C34353s.m133238a(a, photoItem);
            Chat G = mo123339G();
            if (G != null) {
                if (G.isSecret()) {
                    scene = Scene.SecretChat;
                } else {
                    scene = Scene.Chat;
                }
                String id = G.getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "currentChat.getId()");
                LoadMoreListenerImpl loadMoreListenerImpl = new LoadMoreListenerImpl(id);
                DialogMenuClickListenerImpl dialogMenuClickListenerImpl = new DialogMenuClickListenerImpl(id);
                if (!G.isSecret()) {
                    AbstractC36474h b = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                    if (b.mo134586n().mo134685a("translate.message.image.viewer.enable")) {
                        z3 = true;
                        C29990c.m110930b().mo134542a(this.f86491m, a, a2, view, locationInfo, !G.isSecret(), true, !G.isSecret(), z, true, z3, G.isSecret(), !G.isSecret(), dialogMenuClickListenerImpl, loadMoreListenerImpl, new ChatAlbumClickListenerImpl(id, G.isThread()), scene, i);
                    }
                }
                z3 = false;
                C29990c.m110930b().mo134542a(this.f86491m, a, a2, view, locationInfo, !G.isSecret(), true, !G.isSecret(), z, true, z3, G.isSecret(), !G.isSecret(), dialogMenuClickListenerImpl, loadMoreListenerImpl, new ChatAlbumClickListenerImpl(id, G.isThread()), scene, i);
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33295e
    /* renamed from: a */
    public void mo122761a(AbsMessageVO<? extends ContentVO<?>> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "messageVO");
        C35221d a = this.f86492n.mo123147a();
        String str = a.f90970b;
        String str2 = a.f90969a;
        boolean z = TextUtils.isEmpty(a.f90970b) && TextUtils.isEmpty(a.f90969a);
        ContentVO g = aVar.mo121699g();
        if (g instanceof BaseTextContentVO) {
            if (TextUtils.isEmpty(aVar.mo121700h())) {
                m130126a((BaseTextContentVO) g);
            } else if (!z || !C26325y.m95336b(aVar.mo121701i(), str) || !C26325y.m95336b(aVar.mo121700h(), str2)) {
                MessageListViewModel gVar = this.f86481b;
                if (gVar != null) {
                    gVar.getReEditReplyInfo(aVar.mo121681a(), new UIGetDataCallback(new aj(this)));
                }
            } else {
                m130126a((BaseTextContentVO) g);
            }
        }
    }

    @Override // com.ss.android.lark.chat.utils.C34365w.AbstractC34377a
    /* renamed from: a */
    public void mo123349a(String str, List<GroupRecallEntity> list) {
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            MessageListViewModel.recallMembers$default(gVar, str, null, list, 2, null);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33307q
    /* renamed from: a */
    public void mo122778a(View view, ChatMessageVO<TranslatableContentVO<?>> cVar) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(cVar, "textMessageVO");
        Iterator<T> it = this.f86472B.iterator();
        while (it.hasNext()) {
            it.next().mo122778a(view, cVar);
        }
    }

    @Override // com.ss.android.lark.chat.export.ui.p1671a.AbstractC34027a
    /* renamed from: a */
    public void mo122830a(View view, List<Image> list, Image image) {
        new C33292b(this.f86491m, Scene.Chat).mo122757a(view, list, image);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33133v
    /* renamed from: a */
    public <M extends AbsMessageVO<? extends ContentVO<?>>> void mo122321a(View view, AbstractC59010e eVar, AbsMessageVO<? extends ContentVO<?>> aVar) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(eVar, "hiveHolder");
        Intrinsics.checkParameterIsNotNull(aVar, "translatableMessageVO");
        Iterator<T> it = this.f86472B.iterator();
        while (it.hasNext()) {
            it.next().mo122321a(view, eVar, aVar);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: a */
    public void mo122766a(String str, String str2, String str3, Message.SourceType sourceType) {
        Intrinsics.checkParameterIsNotNull(str, "fileKey");
        Intrinsics.checkParameterIsNotNull(str2, "messageId");
        Intrinsics.checkParameterIsNotNull(str3, "sourceId");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            gVar.uploadToDriveSpace(str, str2, str3, sourceType);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: a */
    public void mo122765a(String str, String str2, Message.SourceType sourceType) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            gVar.getPreviewDriveUrl(str, str2, sourceType, new UIGetDataCallback(new C33569ai(this)));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.text.C33377a.AbstractC33380a
    /* renamed from: a */
    public void mo122890a(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            gVar.getChatchatters(str, iGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListResultHandler.IMessageListResultHandler
    /* renamed from: a */
    public void mo123342a(int i, List<? extends PickChatEntity> list, String str, ArrayList<Contact> arrayList) {
        Iterator<T> it = this.f86472B.iterator();
        while (it.hasNext()) {
            it.next().mo123416a(i, list, str, arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\f\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent$initAdapter$clickHandlerDependency$1", "Lcom/ss/android/lark/chat/chatwindow/chat/MessageCellClickHandler$Dependency;", "getFragment", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "getMessageInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "messageId", "", "getOnMediaClickListener", "Lcom/ss/android/lark/chat/chatwindow/chat/message/callbacks/OnMediaClickListener;", "getP2pChatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "getPageType", "Lcom/ss/android/lark/biz/im/extension/ActionContext$PageType;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$n */
    public static final class C33585n implements AbstractC33244i.AbstractC33246a {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86557a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.AbstractC33244i.AbstractC33246a
        /* renamed from: b */
        public AbstractC33302l mo122588b() {
            return this.f86557a;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.AbstractC33244i.AbstractC33246a
        /* renamed from: c */
        public Chatter mo122589c() {
            ChatChatter chatChatter;
            C1177w<ChatChatter> p2pChatterLiveData;
            MessageListViewModel gVar = this.f86557a.f86481b;
            if (gVar == null || (p2pChatterLiveData = gVar.getP2pChatterLiveData()) == null) {
                chatChatter = null;
            } else {
                chatChatter = p2pChatterLiveData.mo5927b();
            }
            return chatChatter;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.AbstractC33244i.AbstractC33246a
        /* renamed from: a */
        public ActionContext.PageType mo122586a() {
            Chat G = this.f86557a.mo123339G();
            if (G == null) {
                return ActionContext.PageType.NORMAL_SINGLE_CHAT;
            }
            if (G.isSecret()) {
                if (G.isGroup()) {
                    return ActionContext.PageType.SECRET_GROUP_CHAT;
                }
                return ActionContext.PageType.SECRET_SINGLE_CHAT;
            } else if (G.isGroup()) {
                return ActionContext.PageType.NORMAL_GROUP_CHAT;
            } else {
                return ActionContext.PageType.NORMAL_SINGLE_CHAT;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33585n(MessageListComponent messageListComponent) {
            this.f86557a = messageListComponent;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.AbstractC33244i.AbstractC33246a
        /* renamed from: a */
        public MessageInfo mo122587a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "messageId");
            MessageListViewModel gVar = this.f86557a.f86481b;
            if (gVar != null) {
                return gVar.getMessageInfoById(str);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "getLastItemPosition"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$s */
    public static final class C33590s implements C33400c.AbstractC33402a {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86562a;

        C33590s(MessageListComponent messageListComponent) {
            this.f86562a = messageListComponent;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.model.C33400c.AbstractC33402a
        /* renamed from: a */
        public final int mo122956a() {
            return this.f86562a.mo123363v();
        }
    }

    /* renamed from: H */
    public final void mo123340H() {
        ItemShineManager<?> itemShineManager = this.f86490l;
        if (itemShineManager != null) {
            itemShineManager.mo121644c();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: b */
    public RelativeLayout mo123319b() {
        return this.f86496w;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: c */
    public RecyclerView mo121985c() {
        return this.f86493t;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent
    /* renamed from: h */
    public boolean mo121990h() {
        return IMessageListComponent.C33555a.m130089a(this);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: n */
    public void mo123330n() {
        this.f86482c.notifyDataSetChanged();
    }

    /* renamed from: z */
    public final void mo123370z() {
        this.f86492n.mo123155d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent$initPullToRefresh$1", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "checkCanDoRefresh", "header", "onLoadMoreBegin", "", "onRefreshBegin", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$ac */
    public static final class C33560ac extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86504a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0017\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent$initPullToRefresh$1$onLoadMoreBegin$1", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "", "onErrored", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccessed", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lkotlin/Unit;)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$ac$a */
        public static final class C33561a extends UIGetDataCallback<Unit> {

            /* renamed from: a */
            final /* synthetic */ C33560ac f86505a;

            /* renamed from: b */
            final /* synthetic */ boolean f86506b;

            /* renamed from: c */
            final /* synthetic */ long f86507c;

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$ac$a$a */
            public static final class RunnableC33562a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C33561a f86508a;

                RunnableC33562a(C33561a aVar) {
                    this.f86508a = aVar;
                }

                public final void run() {
                    LKUIPtrFrameLayout s = this.f86508a.f86505a.f86504a.mo123359s();
                    if (s != null) {
                        s.refreshComplete();
                    }
                }
            }

            /* renamed from: a */
            public void onSuccessed(Unit unit) {
                String str;
                ChatChatter chatChatter;
                C1177w<ChatChatter> p2pChatterLiveData;
                UICallbackExecutor.executeDelayed(new RunnableC33562a(this), 100);
                ChatHitPoint.f135648a.mo187359a(this.f86506b, MessageListComponent.f86470q.mo123372a(), System.currentTimeMillis() - this.f86507c);
                int i = 0;
                MessageListComponent.f86470q.mo123371a(false);
                Chat G = this.f86505a.f86504a.mo123339G();
                if (G != null) {
                    str = G.getId();
                } else {
                    str = null;
                }
                if (G != null) {
                    i = G.getMemberCount();
                }
                MessageListViewModel gVar = this.f86505a.f86504a.f86481b;
                if (gVar == null || (p2pChatterLiveData = gVar.getP2pChatterLiveData()) == null) {
                    chatChatter = null;
                } else {
                    chatChatter = p2pChatterLiveData.mo5927b();
                }
                PerfChatPerformanceMonitor.m213459a(str, i, C34339g.m133165a(G, chatChatter), null);
            }

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                String str;
                C1177w<ChatChatter> p2pChatterLiveData;
                LKUIPtrFrameLayout s = this.f86505a.f86504a.mo123359s();
                if (s != null) {
                    s.refreshComplete();
                }
                ChatHitPoint.f135648a.mo187359a(this.f86506b, MessageListComponent.f86470q.mo123372a(), System.currentTimeMillis() - this.f86507c);
                int i = 0;
                MessageListComponent.f86470q.mo123371a(false);
                Chat G = this.f86505a.f86504a.mo123339G();
                ChatChatter chatChatter = null;
                if (G != null) {
                    str = G.getId();
                } else {
                    str = null;
                }
                if (G != null) {
                    i = G.getMemberCount();
                }
                MessageListViewModel gVar = this.f86505a.f86504a.f86481b;
                if (!(gVar == null || (p2pChatterLiveData = gVar.getP2pChatterLiveData()) == null)) {
                    chatChatter = p2pChatterLiveData.mo5927b();
                }
                PerfChatPerformanceMonitor.m213459a(str, i, C34339g.m133165a(G, chatChatter), errorResult);
            }

            C33561a(C33560ac acVar, boolean z, long j) {
                this.f86505a = acVar;
                this.f86506b = z;
                this.f86507c = j;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0017\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent$initPullToRefresh$1$onRefreshBegin$1", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "", "onErrored", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccessed", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lkotlin/Unit;)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$ac$b */
        public static final class C33563b extends UIGetDataCallback<Unit> {

            /* renamed from: a */
            final /* synthetic */ C33560ac f86509a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C33563b(C33560ac acVar) {
                this.f86509a = acVar;
            }

            /* renamed from: a */
            public void onSuccessed(Unit unit) {
                String str;
                int i;
                ChatChatter chatChatter;
                C1177w<ChatChatter> p2pChatterLiveData;
                LKUIPtrFrameLayout s = this.f86509a.f86504a.mo123359s();
                if (s != null) {
                    s.refreshComplete();
                }
                Chat G = this.f86509a.f86504a.mo123339G();
                if (G != null) {
                    str = G.getId();
                } else {
                    str = null;
                }
                if (G != null) {
                    i = G.getMemberCount();
                } else {
                    i = 0;
                }
                MessageListViewModel gVar = this.f86509a.f86504a.f86481b;
                if (gVar == null || (p2pChatterLiveData = gVar.getP2pChatterLiveData()) == null) {
                    chatChatter = null;
                } else {
                    chatChatter = p2pChatterLiveData.mo5927b();
                }
                PerfChatPerformanceMonitor.m213459a(str, i, C34339g.m133165a(G, chatChatter), null);
            }

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                String str;
                int i;
                C1177w<ChatChatter> p2pChatterLiveData;
                LKUIPtrFrameLayout s = this.f86509a.f86504a.mo123359s();
                if (s != null) {
                    s.refreshComplete();
                }
                Chat G = this.f86509a.f86504a.mo123339G();
                ChatChatter chatChatter = null;
                if (G != null) {
                    str = G.getId();
                } else {
                    str = null;
                }
                if (G != null) {
                    i = G.getMemberCount();
                } else {
                    i = 0;
                }
                MessageListViewModel gVar = this.f86509a.f86504a.f86481b;
                if (!(gVar == null || (p2pChatterLiveData = gVar.getP2pChatterLiveData()) == null)) {
                    chatChatter = p2pChatterLiveData.mo5927b();
                }
                PerfChatPerformanceMonitor.m213459a(str, i, C34339g.m133165a(G, chatChatter), errorResult);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33560ac(MessageListComponent messageListComponent) {
            this.f86504a = messageListComponent;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = !lKUIPtrFrameLayout.isAutoRefresh();
            PerfChatPerformanceMonitor.m213464a(true, Boolean.valueOf(z));
            MessageListViewModel gVar = this.f86504a.f86481b;
            if (gVar != null) {
                gVar.loadNextPage(new C33561a(this, z, currentTimeMillis));
            }
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            PerfChatPerformanceMonitor.m213464a(false, Boolean.valueOf(!lKUIPtrFrameLayout.isAutoRefresh()));
            MessageListViewModel gVar = this.f86504a.f86481b;
            if (gVar != null) {
                gVar.loadPrePage(new C33563b(this));
            }
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            Intrinsics.checkParameterIsNotNull(view, "content");
            Intrinsics.checkParameterIsNotNull(view2, "footer");
            MessageListViewModel gVar = this.f86504a.f86481b;
            if (gVar != null) {
                z = gVar.canLoadMore();
            } else {
                z = false;
            }
            if (!z || !super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2)) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler, com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler
        public boolean checkCanDoRefresh(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            Intrinsics.checkParameterIsNotNull(view, "content");
            Intrinsics.checkParameterIsNotNull(view2, "header");
            MessageListViewModel gVar = this.f86504a.f86481b;
            if (gVar != null) {
                z = gVar.canLoadPre();
            } else {
                z = false;
            }
            if (!z || !super.checkCanDoRefresh(lKUIPtrFrameLayout, view, view2)) {
                return false;
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "hasPrePage"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$ae */
    public static final class C33565ae implements C33238g.AbstractC33239a {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86510a;

        C33565ae(MessageListComponent messageListComponent) {
            this.f86510a = messageListComponent;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.C33238g.AbstractC33239a
        /* renamed from: a */
        public final boolean mo122572a() {
            MessageListViewModel gVar = this.f86510a.f86481b;
            if (gVar != null) {
                return gVar.canLoadPre();
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent$onStop$1", "Lcom/ss/android/lark/chat/utils/MessagePositionUtils$IMessagePosInfo;", "itemCount", "", "getItemCount", "()I", "getItemByPosition", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "pos", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class al implements MessagePositionUtils.IMessagePosInfo {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86519a;

        @Override // com.ss.android.lark.chat.utils.MessagePositionUtils.IMessagePosInfo
        /* renamed from: a */
        public int mo123385a() {
            return this.f86519a.f86482c.getItemCount();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        al(MessageListComponent messageListComponent) {
            this.f86519a = messageListComponent;
        }

        @Override // com.ss.android.lark.chat.utils.MessagePositionUtils.IMessagePosInfo
        /* renamed from: a */
        public AbsMessageVO<?> mo123386a(int i) {
            ChatMessageVO b = this.f86519a.f86482c.mo31276a(i);
            Intrinsics.checkExpressionValueIsNotNull(b, "mChatAdapter.getItem(pos)");
            return b;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "hasPrePage"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class as implements C33238g.AbstractC33239a {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86539a;

        as(MessageListComponent messageListComponent) {
            this.f86539a = messageListComponent;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.C33238g.AbstractC33239a
        /* renamed from: a */
        public final boolean mo122572a() {
            MessageListViewModel gVar = this.f86539a.f86481b;
            if (gVar != null) {
                return gVar.canLoadPre();
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$IListComponentCallbacks;", "Lkotlin/collections/ArrayList;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$b */
    static final class C33572b extends Lambda implements Function0<ArrayList<IMessageListComponent.IListComponentCallbacks>> {
        public static final C33572b INSTANCE = new C33572b();

        C33572b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayList<IMessageListComponent.IListComponentCallbacks> invoke() {
            return new ArrayList<>();
        }
    }

    /* renamed from: D */
    public final void mo123336D() {
        View b = this.f86492n.mo123153b();
        if (b != null) {
            C35287c.m137805a(b);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: k */
    public List<ChatMessageVO<?>> mo123327k() {
        List<ChatMessageVO<?>> a = this.f86482c.mo122242a();
        Intrinsics.checkExpressionValueIsNotNull(a, "mChatAdapter.datas");
        return a;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: m */
    public List<String> mo123329m() {
        List<String> a;
        C33234e eVar = this.f86485g;
        if (eVar == null || (a = eVar.mo122525a()) == null) {
            return CollectionsKt.emptyList();
        }
        return a;
    }

    /* renamed from: w */
    public void mo123365w() {
        if (C58996h.m228982d(this.f86493t)) {
            mo123344a(0, false, (C33247j.AbstractC33251c) null);
        }
    }

    /* renamed from: x */
    public final void mo123367x() {
        UICallbackExecutor.executeDelayed(new RunnableC33573c(this), 100);
    }

    /* renamed from: O */
    private final void m130113O() {
        PerMonitorRenderLKUIPlus perMonitorRenderLKUIPlus;
        LKUIRelativeLayout lKUIRelativeLayout = this.f86496w;
        if (lKUIRelativeLayout != null && (perMonitorRenderLKUIPlus = (PerMonitorRenderLKUIPlus) lKUIRelativeLayout.registerPlus(PerMonitorRenderLKUIPlus.class)) != null) {
            perMonitorRenderLKUIPlus.setMonitorCallback(new C33564ad());
        }
    }

    /* renamed from: R */
    private final int m130116R() {
        Chat G = mo123339G();
        if (G == null || !ChatTabFgUtil.f86815a.mo123637a(G)) {
            return 0;
        }
        return UIHelper.dp2px((float) 50);
    }

    /* renamed from: U */
    private final boolean m130119U() {
        if (m130123Y() || !m130120V()) {
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private final boolean m130120V() {
        OpenApp openApp;
        C33234e eVar = this.f86485g;
        if (eVar != null) {
            openApp = eVar.mo122556t();
        } else {
            openApp = null;
        }
        if (openApp == null || openApp.getState() == null || openApp.getState() == OpenApp.State.USABLE) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private final SpannableStringBuilder m130121W() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        return new SpannableStringBuilder(b.mo134590r().mo134492e(this.f86491m));
    }

    /* renamed from: Y */
    private final boolean m130123Y() {
        ChatChatter chatChatter;
        C1177w<ChatChatter> p2pChatterLiveData;
        MessageListViewModel gVar = this.f86481b;
        if (gVar == null || (p2pChatterLiveData = gVar.getP2pChatterLiveData()) == null) {
            chatChatter = null;
        } else {
            chatChatter = p2pChatterLiveData.mo5927b();
        }
        if (chatChatter == null || !chatChatter.isDimission()) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public void mo123334B() {
        C33576f fVar = new C33576f(this);
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            gVar.ensureLastPageDataLoaded(new UIGetDataCallback(fVar));
        }
    }

    /* renamed from: C */
    public void mo123335C() {
        int itemDecorationCount;
        PointRecoderRecyclerView pointRecoderRecyclerView;
        PointRecoderRecyclerView pointRecoderRecyclerView2 = this.f86493t;
        if (pointRecoderRecyclerView2 != null && (itemDecorationCount = pointRecoderRecyclerView2.getItemDecorationCount()) >= 1 && (pointRecoderRecyclerView = this.f86493t) != null) {
            pointRecoderRecyclerView.removeItemDecorationAt(itemDecorationCount - 1);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListResultHandler.IMessageListResultHandler
    /* renamed from: E */
    public void mo123337E() {
        Iterator<T> it = this.f86472B.iterator();
        while (it.hasNext()) {
            it.next().mo123415a();
        }
    }

    /* renamed from: G */
    public final Chat mo123339G() {
        C1177w<Chat> currentChat;
        MessageListViewModel gVar = this.f86481b;
        if (gVar == null || (currentChat = gVar.getCurrentChat()) == null) {
            return null;
        }
        return currentChat.mo5927b();
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: f */
    public boolean mo123323f() {
        MessageListViewModel gVar = this.f86481b;
        if (gVar == null) {
            return true;
        }
        if (gVar.canLoadMore() || !C58996h.m228982d(this.f86493t)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: g */
    public boolean mo123324g() {
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            return gVar.canLoadMore();
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: l */
    public List<ChatMessageVO<?>> mo123328l() {
        List<ChatMessageVO<?>> a;
        C58984d<ChatMessageVO<?>, C33086b> dVar = this.f86483d;
        if (dVar == null || (a = dVar.mo200097a()) == null) {
            return new ArrayList();
        }
        return a;
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    public void onStop() {
        super.onStop();
        MessagePositionUtils.m133220a(mo123339G(), this.f86493t, new al(this));
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: q */
    public void mo122000q() {
        super.mo122000q();
        Log.m165389i("ChatWindowLog", "onPause");
        this.f86484e.mo122597a(false);
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: u */
    public void mo123361u() {
        super.mo123361u();
        Log.m165389i("ChatWindowLog", "onResume");
        this.f86484e.mo122597a(true);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent$initAdapter$2", "Lcom/ss/android/lark/widget/recyclerview/MultiSelector$SelectListener;", "onSelectedChanged", "", "onStatusChanged", "selectable", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$k */
    public static final class C33581k implements C58984d.AbstractC58986b {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86551a;

        @Override // com.ss.android.lark.widget.recyclerview.C58984d.AbstractC58986b
        /* renamed from: a */
        public void mo31264a(boolean z) {
        }

        @Override // com.ss.android.lark.widget.recyclerview.C58984d.AbstractC58986b
        /* renamed from: a */
        public void mo31263a() {
            for (T t : this.f86551a.f86488j) {
                C58984d<ChatMessageVO<?>, C33086b> dVar = this.f86551a.f86483d;
                if (dVar == null) {
                    Intrinsics.throwNpe();
                }
                t.mo123333a(dVar.mo200104b());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33581k(MessageListComponent messageListComponent) {
            this.f86551a = messageListComponent;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "needShowTip"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$r */
    public static final class C33589r implements C33418p.AbstractC33419a {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86561a;

        C33589r(MessageListComponent messageListComponent) {
            this.f86561a = messageListComponent;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.C33418p.AbstractC33419a
        /* renamed from: a */
        public final boolean mo122985a() {
            boolean z;
            MessageListViewModel gVar;
            C1177w<Chat> currentChat;
            Chat b;
            MessageListViewModel gVar2 = this.f86561a.f86481b;
            if (gVar2 != null) {
                z = gVar2.canLoadMore();
            } else {
                z = true;
            }
            if (z || (gVar = this.f86561a.f86481b) == null || (currentChat = gVar.getCurrentChat()) == null || (b = currentChat.mo5927b()) == null || !b.isSecret()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: P */
    private final void m130114P() {
        LKUIPtrFrameLayout lKUIPtrFrameLayout = this.f86495v;
        if (lKUIPtrFrameLayout != null) {
            lKUIPtrFrameLayout.setKeepHeaderWhenRefresh(true);
        }
        LKUIPtrFrameLayout lKUIPtrFrameLayout2 = this.f86495v;
        if (lKUIPtrFrameLayout2 != null) {
            lKUIPtrFrameLayout2.setForceBackWhenComplete(true);
        }
        LKUIPtrFrameLayout lKUIPtrFrameLayout3 = this.f86495v;
        if (lKUIPtrFrameLayout3 != null) {
            lKUIPtrFrameLayout3.disableWhenHorizontalMove(true);
        }
        LKUIPtrFrameLayout lKUIPtrFrameLayout4 = this.f86495v;
        if (lKUIPtrFrameLayout4 != null) {
            lKUIPtrFrameLayout4.setEnableScrollContentAfterLoad(true);
        }
        LKUIPtrFrameLayout lKUIPtrFrameLayout5 = this.f86495v;
        if (lKUIPtrFrameLayout5 != null) {
            lKUIPtrFrameLayout5.setPtrHandler(new C33560ac(this));
        }
    }

    /* renamed from: S */
    private final void m130117S() {
        PointRecoderRecyclerView pointRecoderRecyclerView = this.f86493t;
        if (pointRecoderRecyclerView == null) {
            Intrinsics.throwNpe();
        }
        RecyclerViewItemDetector<ChatMessageVO<?>> bVar = new RecyclerViewItemDetector<>(pointRecoderRecyclerView, this.f86482c, new C33586o(this));
        this.f86471A = bVar;
        if (bVar != null) {
            bVar.mo123935a(new C33587p(this));
        }
        RecyclerViewItemDetector<ChatMessageVO<?>> bVar2 = this.f86471A;
        if (bVar2 != null) {
            bVar2.mo123938b();
        }
    }

    /* renamed from: X */
    private final SpannableStringBuilder m130122X() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        String a = b.mo134590r().mo134487a(this.f86491m);
        Intrinsics.checkExpressionValueIsNotNull(a, "msg");
        int length = a.length() - 1;
        if (a != null) {
            String substring = a.substring(0, length);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return new SpannableStringBuilder(substring);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListResultHandler.IMessageListResultHandler
    /* renamed from: F */
    public void mo123338F() {
        Chat G = mo123339G();
        if (G != null) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36495k M = b.mo134514M();
            FragmentActivity fragmentActivity = this.f86491m;
            Object o = mo141195o();
            if (o != null) {
                M.mo134658a(fragmentActivity, (BaseFragment) o, G.getId(), null, null, G.isSecret(), G.isCrossTenant(), 7);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.base.fragment.BaseFragment");
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: j */
    public List<ChatMessageVO<?>> mo123326j() {
        RecyclerView.LayoutManager layoutManager;
        try {
            PointRecoderRecyclerView pointRecoderRecyclerView = this.f86493t;
            if (pointRecoderRecyclerView != null) {
                layoutManager = pointRecoderRecyclerView.getLayoutManager();
            } else {
                layoutManager = null;
            }
            if (layoutManager != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                List<ChatMessageVO<?>> a = this.f86482c.mo122243a(linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition(), true);
                Intrinsics.checkExpressionValueIsNotNull(a, "mChatAdapter.getIntervalMessages(start, end, true)");
                return a;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        } catch (NullPointerException unused) {
            return new ArrayList();
        }
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: r */
    public void mo122001r() {
        super.mo122001r();
        RecyclerViewItemDetector<ChatMessageVO<?>> bVar = this.f86471A;
        if (bVar != null) {
            bVar.mo123939c();
        }
        this.f86471A = null;
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            gVar.destroy();
        }
        C33247j<C33086b> jVar = this.f86484e;
        if (jVar != null) {
            jVar.mo122590a();
        }
        f86468o = false;
        f86469p = false;
        ItemShineManager<?> itemShineManager = this.f86490l;
        if (itemShineManager != null) {
            itemShineManager.mo121645d();
        }
        this.f86490l = null;
    }

    /* renamed from: v */
    public final int mo123363v() {
        List<ChatMessageVO<?>> j = mo123326j();
        for (int size = j.size() - 1; size >= 0; size--) {
            ChatMessageVO<?> cVar = j.get(size);
            if ((cVar instanceof ChatMessageVO) && !cVar.ai()) {
                return cVar.mo121717y();
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$c */
    public static final class RunnableC33573c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86540a;

        RunnableC33573c(MessageListComponent messageListComponent) {
            this.f86540a = messageListComponent;
        }

        public final void run() {
            RecyclerView.LayoutManager layoutManager;
            boolean z;
            PointRecoderRecyclerView p = this.f86540a.mo123358p();
            if (p != null) {
                layoutManager = p.getLayoutManager();
            } else {
                layoutManager = null;
            }
            if (layoutManager != null) {
                if (this.f86540a.f86482c.getItemCount() - ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition() < 10) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && this.f86540a.f86481b != null) {
                    MessageListViewModel gVar = this.f86540a.f86481b;
                    if (gVar == null) {
                        Intrinsics.throwNpe();
                    }
                    if (gVar.canLoadMore()) {
                        Log.m165389i("ChatWindowLog", "autoLoadMore");
                        LKUIPtrFrameLayout s = this.f86540a.mo123359s();
                        if (s != null) {
                            s.autoLoadMore();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
    }

    /* renamed from: T */
    private final void m130118T() {
        this.f86482c.mo200127a(C57852m.m224554a(this.f86491m));
        C33580j jVar = new C33580j(this, this.f86482c);
        this.f86483d = jVar;
        if (jVar != null) {
            jVar.mo200101a((C58984d.AbstractC58986b) new C33581k(this));
        }
        C33234e eVar = this.f86485g;
        if (eVar != null) {
            eVar.mo122530a(this.f86483d);
        }
        C33585n nVar = new C33585n(this);
        MessageListComponent messageListComponent = this;
        C33583m mVar = new C33583m(this, nVar, this.f86493t, this.f86485g, messageListComponent, nVar);
        this.f86478H.mo122328a(mVar);
        C33328c.m129034a(this.f86485g, mVar, messageListComponent, this).mo122820a(this.f86482c, new C33582l(this));
    }

    public final void ap_() {
        ChatChatter chatChatter;
        C1177w<ChatChatter> p2pChatterLiveData;
        Chat G = mo123339G();
        if (G != null) {
            MessageListViewModel gVar = this.f86481b;
            if (gVar == null || (p2pChatterLiveData = gVar.getP2pChatterLiveData()) == null) {
                chatChatter = null;
            } else {
                chatChatter = p2pChatterLiveData.mo5927b();
            }
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC32812c e = b.mo134577e();
            Context applicationContext = this.f86491m.getApplicationContext();
            ChatBundle.ChatType a = C34339g.m133165a(G, chatChatter);
            if (a != null) {
                e.mo120979j();
                e.mo120956a(applicationContext, a.value, G.isCrossTenant(), G.getMemberCount(), f86468o);
                PerfCreateGroupMonitor.m213515a();
                PerfChatPerformanceMonitor.m213461a(G.getId(), a);
                f86468o = false;
            }
            C36443k.m143598a(applicationContext).mo134323c();
            this.f86492n.mo123149a(ILifeCycleEventObserve.Event.FIRST_CONTENT_SHOWED);
            PerfLog.end("chat_show_message_list", "");
            PerfLog.end("open_chat", "");
        }
    }

    /* renamed from: y */
    public final void mo123369y() {
        this.f86484e.mo122596a(new C33247j.C33250b().mo122605a(new C33415n()).mo122604a(48).mo122606a(new aq(this)).mo122608a());
    }

    /* renamed from: Q */
    private final void m130115Q() {
        PointRecoderRecyclerView pointRecoderRecyclerView = this.f86493t;
        if (pointRecoderRecyclerView == null) {
            Intrinsics.throwNpe();
        }
        StableLinearLayoutManager stableLinearLayoutManager = new StableLinearLayoutManager((Context) this.f86491m, 1, false, true);
        stableLinearLayoutManager.setRecycleChildrenOnDetach(true);
        stableLinearLayoutManager.setStackFromEnd(false);
        pointRecoderRecyclerView.setLayoutManager(stableLinearLayoutManager);
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        recycledViewPool.setMaxRecycledViews(TextMessageCell.class.hashCode(), 8);
        recycledViewPool.setMaxRecycledViews(ImageMessageCell.class.hashCode(), 4);
        recycledViewPool.setMaxRecycledViews(AudioMessageNewCell.class.hashCode(), 8);
        recycledViewPool.setMaxRecycledViews(PostMessageCell.class.hashCode(), 4);
        recycledViewPool.setMaxRecycledViews(SystemMessageCell.class.hashCode(), 8);
        pointRecoderRecyclerView.setRecycledViewPool(recycledViewPool);
        pointRecoderRecyclerView.setTouchViewListener(new C33588q(this));
        C58996h.m228978b(pointRecoderRecyclerView);
        pointRecoderRecyclerView.addItemDecoration(new C33423r(this.f86482c));
        pointRecoderRecyclerView.addItemDecoration(new C33418p(new C33589r(this)));
        Iterator<T> it = this.f86499z.iterator();
        while (it.hasNext()) {
            pointRecoderRecyclerView.addOnScrollListener(it.next());
        }
        this.f86499z.clear();
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        PerfLog.start("message_list_init", "");
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134577e().mo120969c(true);
        View K = mo141184K();
        if (K == null) {
            Intrinsics.throwNpe();
        }
        PointRecoderRecyclerView pointRecoderRecyclerView = (PointRecoderRecyclerView) K.findViewById(R.id.chat_message_list_view);
        this.f86493t = pointRecoderRecyclerView;
        if (pointRecoderRecyclerView != null) {
            pointRecoderRecyclerView.mo200036a(MapsKt.mapOf(TuplesKt.to("biz", Integer.valueOf(Biz.Messenger.getValue())), TuplesKt.to("scene", Integer.valueOf(Scene.Chat.getValue()))));
        }
        View K2 = mo141184K();
        if (K2 == null) {
            Intrinsics.throwNpe();
        }
        this.f86495v = (LKUIPtrFrameLayout) K2.findViewById(R.id.chat_ptr_layout);
        View K3 = mo141184K();
        if (K3 == null) {
            Intrinsics.throwNpe();
        }
        this.f86496w = (LKUIRelativeLayout) K3.findViewById(R.id.message_list_root);
        View K4 = mo141184K();
        if (K4 == null) {
            Intrinsics.throwNpe();
        }
        this.f86494u = (TextView) K4.findViewById(R.id.chat_window_p2p_chatter_is_deactivied_tip);
        m130113O();
        m130114P();
        m130115Q();
        m130117S();
        AbstractC36474h b2 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
        b2.mo134577e().mo120969c(false);
        C33427a.m129533a(this.f86479I.getInitData(), this, new C33566af(this));
        PerfLog.end("message_list_init", "");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent$onOnlineReviewFileClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "docUrl", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$ag */
    public static final class C33567ag implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86512a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33567ag(MessageListComponent messageListComponent) {
            this.f86512a = messageListComponent;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("ChatWindowLog", errorResult.toString());
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134593u().mo134331a(this.f86512a.f86491m, str, 2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent$onPreviewFileInDrive$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "url", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$ai */
    public static final class C33569ai implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86515a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33569ai(MessageListComponent messageListComponent) {
            this.f86515a = messageListComponent;
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134593u().mo134331a(this.f86515a.f86491m, str, 2);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("ChatWindowLog", "preview File in drive fail: " + errorResult.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent$onReEdit$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chatwindow/model/data/ReplyInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "replyInfo", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class aj implements IGetDataCallback<C35221d> {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86516a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        aj(MessageListComponent messageListComponent) {
            this.f86516a = messageListComponent;
        }

        /* renamed from: a */
        public void onSuccess(C35221d dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "replyInfo");
            this.f86516a.f86492n.mo123148a(dVar, true, false);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("ChatWindowLog", errorResult.toString());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "scrolledPosition", "", "onScrollFinish", "com/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent$scrollAfterInitLoad$2$1"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class an implements C33247j.AbstractC33251c {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86525a;

        an(MessageListComponent messageListComponent) {
            this.f86525a = messageListComponent;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.C33247j.AbstractC33251c
        /* renamed from: a */
        public final void mo122610a(int i) {
            if (i < 0) {
                this.f86525a.mo123369y();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent$ensureLastPageDataLoaded$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "position", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$f */
    public static final class C33576f implements IGetDataCallback<Integer> {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86543a;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33576f(MessageListComponent messageListComponent) {
            this.f86543a = messageListComponent;
        }

        /* renamed from: a */
        public void mo123394a(int i) {
            this.f86543a.mo123343a(i, false, -1, (C33247j.AbstractC33251c) null);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Integer num) {
            mo123394a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent$initItemDetector$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/widget/RecyclerViewItemDetector$ItemDataProvider;", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "getItem", "position", "", "getKey", "", "item", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$o */
    public static final class C33586o implements RecyclerViewItemDetector.ItemDataProvider<ChatMessageVO<?>> {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86558a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33586o(MessageListComponent messageListComponent) {
            this.f86558a = messageListComponent;
        }

        /* renamed from: a */
        public String mo123406a(ChatMessageVO<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "item");
            return cVar.mo121681a();
        }

        /* renamed from: a */
        public ChatMessageVO<?> mo123407b(int i) {
            if (i < 0 || i >= this.f86558a.f86482c.getItemCount()) {
                return null;
            }
            return this.f86558a.f86482c.mo31276a(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001J\u001a\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J \u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent$initItemDetector$2", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/widget/RecyclerViewItemDetector$ItemDetectListener;", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "onItemDetected", "", "itemList", "", "onReachToBottom", "onScrollPassed", "scrolled", "", "scrolledStartIndex", "", "scrolledEndIndex", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$p */
    public static final class C33587p implements RecyclerViewItemDetector.ItemDetectListener<ChatMessageVO<?>> {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86559a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.ItemDetectListener
        /* renamed from: a */
        public void mo122146a() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33587p(MessageListComponent messageListComponent) {
            this.f86559a = messageListComponent;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.ItemDetectListener
        /* renamed from: a */
        public void mo122147a(List<? extends ChatMessageVO<?>> list) {
            Intrinsics.checkParameterIsNotNull(list, "itemList");
            if (!this.f86559a.f86480a) {
                this.f86559a.f86480a = true;
                this.f86559a.ap_();
            }
            this.f86559a.mo123353c(list);
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.ItemDetectListener
        /* renamed from: a */
        public void mo122148a(boolean z, int i, int i2) {
            LKUIPtrFrameLayout s;
            LKUIPtrFrameLayout s2;
            MessageListViewModel gVar = this.f86559a.f86481b;
            if (gVar != null) {
                if (gVar.canLoadMore() && i2 >= this.f86559a.f86482c.getItemCount() - 5 && (s2 = this.f86559a.mo123359s()) != null) {
                    s2.autoLoadMore();
                }
                if (gVar.canLoadPre() && i <= 5 && z && (s = this.f86559a.mo123359s()) != null) {
                    s.autoRefresh();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent$onTodoClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "blockId", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class am implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86520a;

        /* renamed from: b */
        final /* synthetic */ Chat f86521b;

        /* renamed from: c */
        final /* synthetic */ Message f86522c;

        /* renamed from: d */
        final /* synthetic */ String f86523d;

        /* renamed from: e */
        final /* synthetic */ String f86524e;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("ChatWindowLog", errorResult.getDebugMsg());
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            String str2;
            Intrinsics.checkParameterIsNotNull(str, "blockId");
            StringBuilder sb = new StringBuilder();
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            if (b.mo134575c()) {
                str2 = "https://applink.larksuite.com/client/chat/open";
            } else {
                str2 = "https://applink.feishu.cn/client/chat/open";
            }
            sb.append(str2);
            sb.append("?");
            sb.append("chatId=");
            sb.append(this.f86521b.getId());
            sb.append("&position=");
            sb.append(this.f86522c.getPosition());
            String sb2 = sb.toString();
            Intrinsics.checkExpressionValueIsNotNull(sb2, "java.lang.StringBuilder(…             }.toString()");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("chat_id", (Object) this.f86521b.getId());
            jSONObject.put("is_public", (Object) Boolean.valueOf(this.f86521b.isPublic()));
            jSONObject.put("message_id", (Object) this.f86523d);
            String jSONString = jSONObject.toJSONString();
            LKUIRelativeLayout t = this.f86520a.mo123360t();
            if (t != null) {
                KeyboardUtils.hideKeyboard(t.getContext(), t);
            }
            CharSequence a = this.f86520a.mo123341a(this.f86522c);
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            BlockEntity a2 = b2.ak().mo86315a(str, BlockTypeID.MESSAGE, sb2, "", jSONString, "", a.toString());
            Intrinsics.checkExpressionValueIsNotNull(a2, "ChatModuleInstanceHolder…, \"\", summary.toString())");
            Message.Type type = this.f86522c.getType();
            if (type != null) {
                int i = C33598d.f86572b[type.ordinal()];
                if (i == 1) {
                    Content content = this.f86522c.getContent();
                    Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<TextContent>()");
                    TextContent textContent = (TextContent) content;
                    RichText richText = textContent.getRichText();
                    Map<String, Doc> docEntityMap = textContent.getDocEntityMap();
                    AbstractC36474h b3 = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
                    ActionType actionType = ActionType.Todo;
                    BlockExtra blockExtra = new BlockExtra();
                    blockExtra.richTextMessage = new RichTextMessage(Message.Type.TEXT, new MessageContentEntity(new TextEntity(richText, docEntityMap)));
                    blockExtra.parentMsgSenderId = this.f86524e;
                    b3.ak().mo86317a(this.f86520a.f86491m, actionType, a2, blockExtra);
                    return;
                } else if (i == 2) {
                    Content content2 = this.f86522c.getContent();
                    Intrinsics.checkExpressionValueIsNotNull(content2, "message.getContent<PostContent>()");
                    PostContent postContent = (PostContent) content2;
                    String title = postContent.getTitle();
                    RichText richText2 = postContent.getRichText();
                    Map<String, Doc> docEntityMap2 = postContent.getDocEntityMap();
                    AbstractC36474h b4 = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b4, "ChatModuleInstanceHolder.getDependency()");
                    ActionType actionType2 = ActionType.Todo;
                    BlockExtra blockExtra2 = new BlockExtra();
                    blockExtra2.richTextMessage = new RichTextMessage(Message.Type.POST, new MessageContentEntity(new PostEntity(title, richText2, docEntityMap2)));
                    blockExtra2.parentMsgSenderId = this.f86524e;
                    b4.ak().mo86317a(this.f86520a.f86491m, actionType2, a2, blockExtra2);
                    return;
                } else if (i == 3 || i == 4) {
                    TextEntity textEntity = new TextEntity(C59029c.m229161b(UIHelper.mustacheFormat((int) R.string.Todo_Task_FromChat, "Chat", this.f86521b.getName())), null);
                    AbstractC36474h b5 = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b5, "ChatModuleInstanceHolder.getDependency()");
                    ActionType actionType3 = ActionType.Todo;
                    BlockExtra blockExtra3 = new BlockExtra();
                    blockExtra3.multiMessage = new MultiMessage();
                    blockExtra3.multiMessage.chatId = this.f86521b.getId();
                    blockExtra3.multiMessage.messageIds = CollectionsKt.listOf(this.f86523d);
                    Message.Type type2 = this.f86522c.getType();
                    Intrinsics.checkExpressionValueIsNotNull(type2, "message.type");
                    blockExtra3.richTextMessage = new RichTextMessage(type2, new MessageContentEntity(textEntity));
                    blockExtra3.parentMsgSenderId = this.f86524e;
                    b5.ak().mo86317a(this.f86520a.f86491m, actionType3, a2, blockExtra3);
                    return;
                } else if (i == 5) {
                    RichText b6 = C59029c.m229161b(UIHelper.mustacheFormat((int) R.string.Todo_Task_FromChat, "Chat", this.f86521b.getName()));
                    AbstractC36474h b7 = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b7, "ChatModuleInstanceHolder.getDependency()");
                    ActionType actionType4 = ActionType.Todo;
                    BlockExtra blockExtra4 = new BlockExtra();
                    blockExtra4.richTextMessage = new RichTextMessage(Message.Type.MERGE_FORWARD, new MessageContentEntity(new CommonEntity(this.f86523d, this.f86521b.getId()), new TextEntity(b6, null)));
                    blockExtra4.parentMsgSenderId = this.f86524e;
                    b7.ak().mo86317a(this.f86520a.f86491m, actionType4, a2, blockExtra4);
                    return;
                }
            }
            RichText b8 = C59029c.m229161b(a.toString());
            AbstractC36474h b9 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b9, "ChatModuleInstanceHolder.getDependency()");
            ActionType actionType5 = ActionType.Todo;
            BlockExtra blockExtra5 = new BlockExtra();
            blockExtra5.multiMessage = new MultiMessage();
            blockExtra5.multiMessage.chatId = this.f86521b.getId();
            blockExtra5.multiMessage.messageIds = CollectionsKt.listOf(this.f86523d);
            Message.Type type3 = this.f86522c.getType();
            Intrinsics.checkExpressionValueIsNotNull(type3, "message.type");
            blockExtra5.richTextMessage = new RichTextMessage(type3, new MessageContentEntity(new TextEntity(b8, null)));
            blockExtra5.parentMsgSenderId = this.f86524e;
            b9.ak().mo86317a(this.f86520a.f86491m, actionType5, a2, blockExtra5);
        }

        am(MessageListComponent messageListComponent, Chat chat, Message message, String str, String str2) {
            this.f86520a = messageListComponent;
            this.f86521b = chat;
            this.f86522c = message;
            this.f86523d = str;
            this.f86524e = str2;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "t", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$v */
    public static final class C33593v<T> implements AbstractC1178x<ChatChatter> {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86566a;

        C33593v(MessageListComponent messageListComponent) {
            this.f86566a = messageListComponent;
        }

        /* renamed from: a */
        public final void onChanged(ChatChatter chatChatter) {
            C33234e eVar = this.f86566a.f86485g;
            if (eVar != null) {
                eVar.mo122529a(chatChatter);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "msg", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$x */
    public static final class C33595x<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86568a;

        C33595x(MessageListComponent messageListComponent) {
            this.f86568a = messageListComponent;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            LKUIToast.show(this.f86568a.f86491m, str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "msg", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$y */
    public static final class C33596y<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86569a;

        C33596y(MessageListComponent messageListComponent) {
            this.f86569a = messageListComponent;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            C35212a.m137531a(this.f86569a.f86491m, (String) null, str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "msg", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$z */
    public static final class C33597z<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86570a;

        C33597z(MessageListComponent messageListComponent) {
            this.f86570a = messageListComponent;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            MessageListComponent messageListComponent = this.f86570a;
            Intrinsics.checkExpressionValueIsNotNull(str, "msg");
            messageListComponent.mo123366w(str);
        }
    }

    /* renamed from: b */
    private final SpannableStringBuilder m130127b(OpenApp openApp) {
        if (openApp.canApplyVisibility()) {
            return m130130c(openApp);
        }
        return m130122X();
    }

    /* renamed from: c */
    public final void mo123353c(List<? extends AbsMessageVO<?>> list) {
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            gVar.readMessage(list);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33113b
    public void e_(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            gVar.deleteUrlPreview(str);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33306p, com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33129r
    /* renamed from: f */
    public void mo121946f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            gVar.addSticker(str);
        }
    }

    @Override // com.ss.android.lark.chat.utils.C34365w.AbstractC34377a
    public void f_(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            gVar.invalidGroupShare(str);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.block.MessageStatusBlock.AbstractC33313a
    /* renamed from: g */
    public void mo122797g(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            gVar.retrySendMessage(str);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33291a
    /* renamed from: i */
    public void mo122756i(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            gVar.handleShowMoreTextClick(str);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33294d
    /* renamed from: j */
    public void mo122760j(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            gVar.readFileMsg(str);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33302l
    /* renamed from: p */
    public void mo122774p(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageCid");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            gVar.cancelUploadMediaMsg(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "messageList", "", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$aa */
    public static final class C33557aa<T> implements AbstractC1178x<List<? extends MessageInfo>> {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86500a;

        C33557aa(MessageListComponent messageListComponent) {
            this.f86500a = messageListComponent;
        }

        /* renamed from: a */
        public final void onChanged(List<? extends MessageInfo> list) {
            Iterator<T> it = this.f86500a.f86487i.iterator();
            while (it.hasNext()) {
                Intrinsics.checkExpressionValueIsNotNull(list, "messageList");
                it.next().mo122149a(list);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "t", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$ab */
    public static final class C33558ab<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86501a;

        /* renamed from: b */
        final /* synthetic */ C35219b f86502b;

        C33558ab(MessageListComponent messageListComponent, C35219b bVar) {
            this.f86501a = messageListComponent;
            this.f86502b = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                UICallbackExecutor.executeDelayed(new Runnable(this) {
                    /* class com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent.C33558ab.RunnableC335591 */

                    /* renamed from: a */
                    final /* synthetic */ C33558ab f86503a;

                    {
                        this.f86503a = r1;
                    }

                    public final void run() {
                        this.f86503a.f86501a.mo123305a(this.f86503a.f86502b.f90953c, true, true, (IMessageListComponent.OnLoadMessageStatusListener) null);
                    }
                }, 500);
                Log.m165389i("ChatWindowLog", "Need relocate message after first load!");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent$onReplyMessage$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chatwindow/model/data/ReplyInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "replyInfo", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class ak implements IGetDataCallback<C35221d> {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86517a;

        /* renamed from: b */
        final /* synthetic */ int f86518b;

        /* renamed from: a */
        public void onSuccess(C35221d dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "replyInfo");
            dVar.f90973e = this.f86518b;
            this.f86517a.f86492n.mo123148a(dVar, false, false);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("ChatWindowLog", "on reply item error:" + errorResult);
        }

        ak(MessageListComponent messageListComponent, int i) {
            this.f86517a = messageListComponent;
            this.f86518b = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0017\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent$scrollToPosition$1$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lkotlin/Unit;)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class ar implements IGetDataCallback<Unit> {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86535a;

        /* renamed from: b */
        final /* synthetic */ int f86536b;

        /* renamed from: c */
        final /* synthetic */ boolean f86537c;

        /* renamed from: d */
        final /* synthetic */ IMessageListComponent.OnLoadMessageStatusListener f86538d;

        /* renamed from: a */
        public void onSuccess(Unit unit) {
            IMessageListComponent.OnLoadMessageStatusListener iVar = this.f86538d;
            if (iVar != null) {
                iVar.mo122145b();
            }
            if (this.f86537c) {
                this.f86535a.mo123344a(150, false, (C33247j.AbstractC33251c) null);
            } else {
                this.f86535a.mo123343a(this.f86536b, false, 1, (C33247j.AbstractC33251c) null);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            IMessageListComponent.OnLoadMessageStatusListener iVar = this.f86538d;
            if (iVar != null) {
                iVar.mo122145b();
            }
            Log.m165383e("ChatWindowLog", "load spec pos msg failed");
        }

        ar(MessageListComponent messageListComponent, int i, boolean z, IMessageListComponent.OnLoadMessageStatusListener iVar) {
            this.f86535a = messageListComponent;
            this.f86536b = i;
            this.f86537c = z;
            this.f86538d = iVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/widget/recyclerview/hive/HiveAdapter;", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$l */
    public static final class C33582l<T> implements C57865c.AbstractC57871b<AbstractView$OnClickListenerC58999a<Object>> {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86552a;

        C33582l(MessageListComponent messageListComponent) {
            this.f86552a = messageListComponent;
        }

        /* renamed from: a */
        public final void consume(AbstractView$OnClickListenerC58999a<?> aVar) {
            PointRecoderRecyclerView p = this.f86552a.mo123358p();
            if (p != null) {
                p.setAdapter(aVar);
            }
            this.f86552a.f86484e.mo122595a(this.f86552a.mo123358p());
        }
    }

    /* renamed from: c */
    private final void m130131c(Message message) {
        StickerContent stickerContent;
        if (message != null && message.getType() == Message.Type.STICKER && (stickerContent = (StickerContent) message.getContent()) != null) {
            Intrinsics.checkExpressionValueIsNotNull(stickerContent, "message.getContent<StickerContent>() ?: return");
            ChatWindowHitPoint.m137639a("1");
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33121j
    /* renamed from: a */
    public void mo121935a(int i) {
        Iterator<T> it = this.f86472B.iterator();
        while (it.hasNext()) {
            it.next().mo121935a(i);
        }
    }

    /* renamed from: e */
    public void mo123356e(int i) {
        PointRecoderRecyclerView pointRecoderRecyclerView = this.f86493t;
        if (pointRecoderRecyclerView != null) {
            pointRecoderRecyclerView.addItemDecoration(new C33238g(i, new C33565ae(this)));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: k */
    public void mo122767k(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            gVar.convertOfficeToDocUrl(str, new UIGetDataCallback(new C33567ag(this)));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: m */
    public void mo122769m(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            gVar.stopDownloadFile(str);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33307q
    /* renamed from: s */
    public void mo122780s(String str) {
        Iterator<T> it = this.f86472B.iterator();
        while (it.hasNext()) {
            it.next().mo122780s(str);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: t */
    public AbstractC34006a mo123331t(String str) {
        MessageInfo messageInfo;
        Intrinsics.checkParameterIsNotNull(str, "id");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            messageInfo = gVar.getMessageInfoById(str);
        } else {
            messageInfo = null;
        }
        return messageInfo;
    }

    /* renamed from: x */
    public void mo123368x(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            gVar.onAuditedFailed(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$af */
    static final class C33566af<T> implements AbstractC1178x<C35219b> {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86511a;

        C33566af(MessageListComponent messageListComponent) {
            this.f86511a = messageListComponent;
        }

        /* renamed from: a */
        public final void onChanged(C35219b bVar) {
            PerfLog.start("message_list_init_with_data", "");
            if (bVar == null) {
                Log.m165383e("ChatWindowLog", "initData is null, skip init");
                return;
            }
            try {
                this.f86511a.mo123348a(bVar);
            } catch (Exception e) {
                Exception exc = e;
                Log.m165385e("ChatWindowLog", "init messageList crash", exc, true);
                throw exc;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "scrolledPosition", "", "onScrollFinish"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class aq implements C33247j.AbstractC33251c {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86534a;

        aq(MessageListComponent messageListComponent) {
            this.f86534a = messageListComponent;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.C33247j.AbstractC33251c
        /* renamed from: a */
        public final void mo122610a(int i) {
            if (i < 0) {
                Log.m165389i("ChatWindowLog", "scroll to new message failed, change to bottom");
                this.f86534a.f86484e.mo122593a(0, false);
                return;
            }
            Log.m165389i("ChatWindowLog", "scroll to new message success: " + i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent$getBotDeleteUseText$clickableSpan$1", "Lcom/ss/android/lark/chatwindow/SysContentNameClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$g */
    public static final class C33577g extends AbstractC35250i {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86544a;

        /* renamed from: b */
        final /* synthetic */ OpenApp f86545b;

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
            ChatBundle.C29590a aVar = new ChatBundle.C29590a();
            BotTipsContent botTips = this.f86545b.getBotTips();
            Intrinsics.checkExpressionValueIsNotNull(botTips, "openApp.botTips");
            C35228b.m137564a().mo121114a(this.f86544a.f86491m, aVar.mo105931b(botTips.getAdminId()).mo105929a());
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33577g(MessageListComponent messageListComponent, OpenApp openApp, Context context) {
            super(context);
            this.f86544a = messageListComponent;
            this.f86545b = openApp;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent$getBotStopUseText$clickableSpan$1", "Lcom/ss/android/lark/chatwindow/SysContentNameClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$h */
    public static final class C33578h extends AbstractC35250i {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86546a;

        /* renamed from: b */
        final /* synthetic */ OpenApp f86547b;

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
            ChatBundle.C29590a aVar = new ChatBundle.C29590a();
            BotTipsContent botTips = this.f86547b.getBotTips();
            Intrinsics.checkExpressionValueIsNotNull(botTips, "openApp.botTips");
            C35228b.m137564a().mo121114a(this.f86546a.f86491m, aVar.mo105931b(botTips.getAdminId()).mo105929a());
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33578h(MessageListComponent messageListComponent, OpenApp openApp, Context context) {
            super(context);
            this.f86546a = messageListComponent;
            this.f86547b = openApp;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent$getBotUserInvisibleTextCanApply$clickableSpan$1", "Lcom/ss/android/lark/chatwindow/SysContentNameClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$i */
    public static final class C33579i extends AbstractC35250i {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86548a;

        /* renamed from: b */
        final /* synthetic */ OpenApp f86549b;

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134590r().mo134488a(this.f86548a.f86491m, this.f86549b.getBotId(), this.f86549b.getBotId(), this.f86549b.getName());
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33579i(MessageListComponent messageListComponent, OpenApp openApp, Context context) {
            super(context);
            this.f86548a = messageListComponent;
            this.f86549b = openApp;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0014\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent$initAdapter$1", "Lcom/ss/android/lark/widget/recyclerview/MultiSelector;", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "Lcom/ss/android/lark/chat/chatwindow/chat/ChatAdapter;", "isItemSelectable", "", "item", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$j */
    public static final class C33580j extends C58984d<ChatMessageVO<?>, C33086b> {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86550a;

        /* renamed from: a */
        public boolean mo123399a(ChatMessageVO<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "item");
            if (super.mo123399a((Object) cVar)) {
                if (this.f86550a.f86489k == IMessageListComponent.ListMode.BUILD_GROUP && cVar.mo124244Q()) {
                    return true;
                }
                if (this.f86550a.f86489k != IMessageListComponent.ListMode.MULTI_SELECT || !cVar.mo124245R()) {
                    return false;
                }
                return true;
            }
            return false;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33580j(MessageListComponent messageListComponent, RecyclerView.Adapter adapter) {
            super(adapter);
            this.f86550a = messageListComponent;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "t", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$u */
    public static final class C33592u<T> implements AbstractC1178x<Chat> {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86565a;

        C33592u(MessageListComponent messageListComponent) {
            this.f86565a = messageListComponent;
        }

        /* renamed from: a */
        public final void onChanged(Chat chat) {
            for (IMessageListComponent.IListComponentCallbacks cVar : this.f86565a.mo121968a()) {
                if (chat == null) {
                    Intrinsics.throwNpe();
                }
                cVar.mo122153a(chat);
            }
            C33234e eVar = this.f86565a.f86485g;
            if (eVar != null) {
                eVar.mo122528a(chat);
            }
            this.f86565a.mo123367x();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "t", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$w */
    public static final class C33594w<T> implements AbstractC1178x<ChatChatter> {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86567a;

        C33594w(MessageListComponent messageListComponent) {
            this.f86567a = messageListComponent;
        }

        /* renamed from: a */
        public final void onChanged(ChatChatter chatChatter) {
            for (IMessageListComponent.IListComponentCallbacks cVar : this.f86567a.mo121968a()) {
                if (chatChatter != null) {
                    cVar.mo122154a(chatChatter);
                }
            }
            C33234e eVar = this.f86567a.f86485g;
            if (eVar != null) {
                eVar.mo122537b(chatChatter);
            }
        }
    }

    /* renamed from: a */
    private final void m130124a(RecyclerView recyclerView) {
        int dimens = UIHelper.getDimens(R.dimen.title_height);
        int R = m130116R();
        this.f86484e.mo122591a((dimens * 2) + R);
        recyclerView.addItemDecoration(new C33238g(dimens + R, new as(this)));
    }

    /* renamed from: b */
    private final void m130128b(C35219b bVar) {
        C33234e eVar = new C33234e(this.f86491m);
        this.f86485g = eVar;
        if (eVar != null) {
            eVar.mo122528a(bVar.f90956f);
        }
        C33234e eVar2 = this.f86485g;
        if (eVar2 != null) {
            eVar2.mo122529a(bVar.f90958h);
        }
        C33234e eVar3 = this.f86485g;
        if (eVar3 != null) {
            eVar3.mo122537b(bVar.f90957g);
        }
        C33234e eVar4 = this.f86485g;
        if (eVar4 != null) {
            eVar4.mo122527a(bVar.f90960j);
        }
    }

    /* renamed from: y */
    private final void m130134y(String str) {
        MessageInfo messageInfo;
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            messageInfo = gVar.getMessageInfoById(str);
        } else {
            messageInfo = null;
        }
        if (messageInfo != null) {
            Message message = messageInfo.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo!!.getMessage()");
            if (message.getType() == Message.Type.RED_PACKET) {
                RedPacketHitPoint.f135904a.mo187706b();
            }
        }
    }

    /* renamed from: z */
    private final void m130135z(String str) {
        C36913c a = C36913c.m145732a(this.f86491m);
        Intrinsics.checkExpressionValueIsNotNull(a, "audioPlayer");
        C36913c.AbstractC36916a c = a.mo136290c();
        if (c != null && TextUtils.equals(c.mo122667e(), str) && C36894a.m145605a().mo136202a(c.mo122664b())) {
            C36894a.m145605a().mo136207d();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: c */
    public int mo123321c(int i) {
        if (i < 0 || i >= this.f86482c.getItemCount()) {
            return -1;
        }
        return this.f86482c.mo31276a(i).mo121717y();
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33127p
    /* renamed from: e */
    public void mo121944e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            gVar.putMessagesInSaveBox(CollectionsKt.listOf(str));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.block.MessageStatusBlock.AbstractC33313a
    /* renamed from: h */
    public void mo122798h(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        Log.m165389i("ChatWindowLog", "bruned msg: " + str);
        m130135z(str);
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            gVar.burnMsg(str);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: l */
    public void mo122768l(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            gVar.downloadFile(this.f86491m, str);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: n */
    public void mo122770n(String str) {
        MessageInfo messageInfoById;
        Chat G;
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null && (messageInfoById = gVar.getMessageInfoById(str)) != null && (G = mo123339G()) != null) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134520S().mo134700a(this.f86491m, messageInfoById.getMessage(), G.isSecret());
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33305o
    /* renamed from: q */
    public void mo122776q(String str) {
        MessageInfo messageInfoById;
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null && (messageInfoById = gVar.getMessageInfoById(str)) != null) {
            C35121d.m137108a(this.f86491m, messageInfoById.getMessageSender(), messageInfoById);
            ChatHitPoint.Companion aVar = ChatHitPoint.f135648a;
            C33234e eVar = this.f86485g;
            if (eVar != null) {
                z = eVar.mo122546j();
            } else {
                z = false;
            }
            aVar.mo187355a("replyCount", z);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.view.message.callbacks.OnThreadMergeForwardClickListener
    /* renamed from: u */
    public void mo123362u(String str) {
        MessageInfo messageInfoById;
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null && (messageInfoById = gVar.getMessageInfoById(str)) != null) {
            Message a = C34350p.m133211a(messageInfoById);
            Intrinsics.checkExpressionValueIsNotNull(a, "message");
            ThreadMergeForwardLauncher.f138288a.mo190745a(this.f86491m, str, a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent$initAdapter$clickHandler$1", "Lcom/ss/android/lark/chat/chatwindow/chat/MessageCellClickHandler;", "onCellClick", "", "cell", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveCell;", "hiveHolder", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveHolder;", "item", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$m */
    public static final class C33583m extends AbstractC33244i {

        /* renamed from: f */
        final /* synthetic */ MessageListComponent f86553f;

        /* renamed from: g */
        final /* synthetic */ AbstractC33244i.AbstractC33246a f86554g;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "count", "", "onTick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$m$a */
        public static final class C33584a implements C34378x.AbstractC34379a {

            /* renamed from: a */
            final /* synthetic */ C33583m f86555a;

            /* renamed from: b */
            final /* synthetic */ ChatMessageVO f86556b;

            C33584a(C33583m mVar, ChatMessageVO cVar) {
                this.f86555a = mVar;
                this.f86556b = cVar;
            }

            @Override // com.ss.android.lark.chat.utils.C34378x.AbstractC34379a
            public final void onTick(int i) {
                MessageInfo messageInfo;
                if (i == 1) {
                    C34381y.m133311a("ChatWindowLog", "click :" + this.f86556b.mo121681a());
                } else if (i == 3) {
                    MessageListViewModel gVar = this.f86555a.f86553f.f86481b;
                    if (gVar != null) {
                        messageInfo = gVar.getMessageInfoById(this.f86556b.mo121681a());
                    } else {
                        messageInfo = null;
                    }
                    if (messageInfo != null) {
                        C34381y.m133311a("ChatWindowLog", "click 3:" + messageInfo);
                    }
                }
            }
        }

        /* renamed from: g */
        public void mo123401e(AbstractC59004b<?, ?> bVar, AbstractC59010e eVar, ChatMessageVO<?> cVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "hiveHolder");
            Intrinsics.checkParameterIsNotNull(cVar, "item");
            C58984d<ChatMessageVO<?>, C33086b> dVar = this.f86553f.f86483d;
            if (dVar == null) {
                Intrinsics.throwNpe();
            }
            if (dVar.mo200107c()) {
                C58984d<ChatMessageVO<?>, C33086b> dVar2 = this.f86553f.f86483d;
                if (dVar2 == null) {
                    Intrinsics.throwNpe();
                }
                if (dVar2.mo123399a(cVar)) {
                    C33234e eVar2 = this.f86553f.f86485g;
                    if (eVar2 != null) {
                        eVar2.mo122531a(cVar.mo121681a());
                    }
                    C58984d<ChatMessageVO<?>, C33086b> dVar3 = this.f86553f.f86483d;
                    if (dVar3 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (!dVar3.mo200106b(cVar)) {
                        C58984d<ChatMessageVO<?>, C33086b> dVar4 = this.f86553f.f86483d;
                        if (dVar4 == null) {
                            Intrinsics.throwNpe();
                        }
                        if (dVar4.mo200104b() >= 100) {
                            MessageListComponent messageListComponent = this.f86553f;
                            String string = UIHelper.getString(R.string.Lark_Legacy_MultiSelectTooManyMessagesTips);
                            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…electTooManyMessagesTips)");
                            messageListComponent.mo123364v(string);
                            return;
                        }
                    }
                    C58984d<ChatMessageVO<?>, C33086b> dVar5 = this.f86553f.f86483d;
                    if (dVar5 == null) {
                        Intrinsics.throwNpe();
                    }
                    dVar5.mo200098a(eVar.mo200148l());
                    return;
                }
                return;
            }
            MessageListViewModel gVar = this.f86553f.f86481b;
            if (gVar != null) {
                gVar.toggleItemShowTime(cVar.mo121681a());
            }
            C34378x.m133309a().mo126949a(new C33584a(this, cVar));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33583m(MessageListComponent messageListComponent, AbstractC33244i.AbstractC33246a aVar, RecyclerView recyclerView, AbstractC33342d dVar, AbstractC33120i iVar, AbstractC33244i.AbstractC33246a aVar2) {
            super(recyclerView, dVar, iVar, aVar2);
            this.f86553f = messageListComponent;
            this.f86554g = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent$onPinMessage$1", "Lcom/ss/android/lark/dependency/IPinDependency$IPinActionListener;", "onPin", "", "isAdded", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$ah */
    public static final class C33568ah implements AbstractC36459ag.AbstractC36460a {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86513a;

        /* renamed from: b */
        final /* synthetic */ Chat f86514b;

        @Override // com.ss.android.lark.dependency.AbstractC36459ag.AbstractC36460a
        public void onPin(boolean z) {
            if (!z) {
                C54970a.m213419a(13, true);
            }
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            if (b.ab().mo134600a("pin.sidebar") && z && !this.f86514b.isSuper()) {
                int i = UserSP.getInstance().getInt("key_has_add_pin_times", 0) + 1;
                UserSP.getInstance().putInt("key_has_add_pin_times", i);
                AbstractC36474h b2 = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
                boolean b3 = b2.mo134583k().mo134722b("all_view_pin");
                if (i == 1 && b3) {
                    this.f86513a.mo123336D();
                }
            }
        }

        C33568ah(MessageListComponent messageListComponent, Chat chat) {
            this.f86513a = messageListComponent;
            this.f86514b = chat;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "scrolledPosition", "", "onScrollFinish"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class ao implements C33247j.AbstractC33251c {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86526a;

        /* renamed from: b */
        final /* synthetic */ C33256m f86527b;

        ao(MessageListComponent messageListComponent, C33256m mVar) {
            this.f86526a = messageListComponent;
            this.f86527b = mVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.C33247j.AbstractC33251c
        /* renamed from: a */
        public final void mo122610a(int i) {
            if (i >= 0) {
                Log.m165389i("ChatWindowLog", "init scroll to position center: " + i);
                ItemShineManager<?> itemShineManager = this.f86526a.f86490l;
                if (itemShineManager != null) {
                    itemShineManager.mo121644c();
                }
                MessageListComponent messageListComponent = this.f86526a;
                messageListComponent.f86490l = new ItemShineManager(messageListComponent.mo123358p(), this.f86527b, C335701.f86528a).mo121642a(1).mo121641a();
                ItemShineManager<?> itemShineManager2 = this.f86526a.f86490l;
                if (itemShineManager2 != null) {
                    itemShineManager2.mo121643b();
                    return;
                }
                return;
            }
            this.f86526a.f86484e.mo122593a(0, false);
            Log.m165389i("ChatWindowLog", "init scroll to position failed, change to bottom");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "scrolledPosition", "", "onScrollFinish"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class ap implements C33247j.AbstractC33251c {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86529a;

        /* renamed from: b */
        final /* synthetic */ int f86530b;

        /* renamed from: c */
        final /* synthetic */ C33256m f86531c;

        /* renamed from: d */
        final /* synthetic */ C33247j.AbstractC33251c f86532d;

        ap(MessageListComponent messageListComponent, int i, C33256m mVar, C33247j.AbstractC33251c cVar) {
            this.f86529a = messageListComponent;
            this.f86530b = i;
            this.f86531c = mVar;
            this.f86532d = cVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.C33247j.AbstractC33251c
        /* renamed from: a */
        public final void mo122610a(int i) {
            if (i >= 0 && this.f86530b != -1) {
                ItemShineManager<?> itemShineManager = this.f86529a.f86490l;
                if (itemShineManager != null) {
                    itemShineManager.mo121644c();
                }
                MessageListComponent messageListComponent = this.f86529a;
                messageListComponent.f86490l = new ItemShineManager(messageListComponent.mo123358p(), this.f86531c, C335711.f86533a).mo121642a(this.f86530b).mo121641a();
                ItemShineManager<?> itemShineManager2 = this.f86529a.f86490l;
                if (itemShineManager2 != null) {
                    itemShineManager2.mo121643b();
                }
            }
            C33247j.AbstractC33251c cVar = this.f86532d;
            if (cVar != null) {
                cVar.mo122610a(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004 \u0005*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "list", "", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$t */
    public static final class C33591t<T> implements AbstractC1178x<List<? extends ChatMessageVO<?>>> {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86563a;

        /* renamed from: b */
        final /* synthetic */ C35219b f86564b;

        C33591t(MessageListComponent messageListComponent, C35219b bVar) {
            this.f86563a = messageListComponent;
            this.f86564b = bVar;
        }

        /* renamed from: a */
        public final void onChanged(List<? extends ChatMessageVO<?>> list) {
            PerfLog.start("chat_show_message_list", "");
            this.f86563a.f86482c.mo122244a((List<ChatMessageVO>) list);
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134577e().mo120977h();
            if (!this.f86563a.f86486h) {
                this.f86563a.f86486h = true;
                this.f86563a.mo123354d(this.f86564b.f90953c);
                for (IMessageListComponent.IListComponentCallbacks cVar : this.f86563a.mo121968a()) {
                    cVar.mo122152a();
                }
            }
        }
    }

    /* renamed from: a */
    private final void m130125a(OpenApp openApp) {
        OpenApp.State state = null;
        String str = null;
        boolean z = true;
        if (!m130120V()) {
            if (openApp == null) {
                Intrinsics.throwNpe();
            }
            OpenApp.State state2 = openApp.getState();
            if (state2 != null) {
                int i = C33598d.f86571a[state2.ordinal()];
                if (i == 1) {
                    str = m130121W();
                } else if (i == 2) {
                    str = m130127b(openApp);
                } else if (i == 3) {
                    str = m130132d(openApp);
                }
            }
            str = m130133e(openApp);
        } else if (m130123Y()) {
            str = UIUtils.getString(this.f86491m, R.string.Lark_Legacy_ChatterResignPermissionMask);
        } else {
            z = false;
        }
        mo123317a(z, str, (View.OnClickListener) null);
        if (openApp != null) {
            state = openApp.getState();
        }
        if (state == OpenApp.State.USER_INVISIBLE) {
            ChatHitPoint.f135648a.mo187365d();
        }
    }

    /* renamed from: b */
    private final boolean m130129b(Message message) {
        StickerContent stickerContent;
        if (message == null) {
            return true;
        }
        if (message.getType() != Message.Type.STICKER || (stickerContent = (StickerContent) message.getContent()) == null) {
            return false;
        }
        Intrinsics.checkExpressionValueIsNotNull(stickerContent, "message.getContent<Stick…ontent>() ?: return false");
        if (stickerContent.isPaid()) {
            return false;
        }
        LKUIToast.show(this.f86491m, (int) R.string.Lark_Chat_StickerPackNeedBuy);
        return true;
    }

    /* renamed from: c */
    private final SpannableStringBuilder m130130c(OpenApp openApp) {
        C33579i iVar = new C33579i(this, openApp, this.f86491m);
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        String a = b.mo134590r().mo134487a(this.f86491m);
        AbstractC36474h b2 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
        String b3 = b2.mo134590r().mo134489b(this.f86491m);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a + b3);
        int length = a.length();
        spannableStringBuilder.setSpan(iVar, length, b3.length() + length, 17);
        return spannableStringBuilder;
    }

    /* renamed from: d */
    private final SpannableStringBuilder m130132d(OpenApp openApp) {
        C33577g gVar = new C33577g(this, openApp, this.f86491m);
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        String d = b.mo134590r().mo134491d(this.f86491m);
        StringBuilder sb = new StringBuilder("@");
        if (openApp.getBotTips() != null) {
            BotTipsContent botTips = openApp.getBotTips();
            Intrinsics.checkExpressionValueIsNotNull(botTips, "openApp.botTips");
            sb.append(botTips.getAdminName());
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "sb.toString()");
        String mustacheFormat = UIHelper.mustacheFormat(d, "user_name", sb2);
        String str = mustacheFormat;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "tip");
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, sb2, 0, false, 6, (Object) null);
        spannableStringBuilder.setSpan(gVar, indexOf$default, sb2.length() + indexOf$default, 17);
        return spannableStringBuilder;
    }

    /* renamed from: e */
    private final SpannableStringBuilder m130133e(OpenApp openApp) {
        C33578h hVar = new C33578h(this, openApp, this.f86491m);
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        String c = b.mo134590r().mo134490c(this.f86491m);
        StringBuilder sb = new StringBuilder("@");
        if (openApp.getBotTips() != null) {
            BotTipsContent botTips = openApp.getBotTips();
            Intrinsics.checkExpressionValueIsNotNull(botTips, "openApp.botTips");
            sb.append(botTips.getAdminName());
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "sb.toString()");
        String mustacheFormat = UIHelper.mustacheFormat(c, "user_name", sb2);
        String str = mustacheFormat;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "tip");
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, sb2, 0, false, 6, (Object) null);
        spannableStringBuilder.setSpan(hVar, indexOf$default, sb2.length() + indexOf$default, 17);
        return spannableStringBuilder;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33300j
    /* renamed from: o */
    public void mo122771o(String str) {
        MessageInfo messageInfoById;
        Chat G;
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null && (messageInfoById = gVar.getMessageInfoById(str)) != null && (G = mo123339G()) != null) {
            Message message = messageInfoById.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
            if (message.getType() == Message.Type.FILE) {
                Message message2 = messageInfoById.getMessage();
                Intrinsics.checkExpressionValueIsNotNull(message2, "messageInfo.getMessage()");
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                AbstractC36505s S = b.mo134520S();
                boolean isSecret = G.isSecret();
                Intrinsics.checkExpressionValueIsNotNull(S, "fileDetailDependency");
                S.mo134701a(this.f86491m, message2, isSecret, S.mo134696a());
            }
        }
    }

    /* renamed from: v */
    public final void mo123364v(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        WindowDialogManager.f91123a.mo129819a(new C25639g(this.f86491m).mo89237b(str).mo89238b(true).mo89251j(2).mo89225a(R.id.lkui_dialog_btn_right, UIHelper.getString(R.string.Lark_Legacy_ShareAlertOK), (DialogInterface.OnClickListener) null).mo89239c());
    }

    /* renamed from: w */
    public final void mo123366w(String str) {
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            mo123370z();
            return;
        }
        DialogC25637f fVar = this.f86476F;
        if (fVar != null) {
            if (fVar == null) {
                Intrinsics.throwNpe();
            }
            if (fVar.isShowing()) {
                return;
            }
        }
        DialogC25637f c = new C25639g(this.f86491m).mo89237b(str2).mo89238b(true).mo89251j(3).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmTip, new DialogInterface$OnClickListenerC33574d(this)).mo89246d(false).mo89239c();
        this.f86476F = c;
        if (c != null) {
            c.setOnKeyListener(new DialogInterface$OnKeyListenerC33575e(this));
        }
    }

    /* renamed from: a */
    private final void m130126a(BaseTextContentVO<?> baseTextContentVO) {
        String str;
        RichText richText;
        String str2 = null;
        RichText richText2 = null;
        if (baseTextContentVO instanceof PostContentVO) {
            richText = baseTextContentVO.mo121772a();
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            Context a = b.mo134528a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatModuleInstanceHolder.getDependency().context");
            str = ((PostContentVO) baseTextContentVO).mo121877a(a);
        } else {
            richText2 = baseTextContentVO.mo121772a();
            str = str2;
            richText = richText2;
        }
        this.f86492n.mo123150a(richText2, str, richText);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33293c
    /* renamed from: b */
    public List<String> mo122758b(int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f86482c.mo122242a());
        if (!CollectionUtils.isEmpty(arrayList2)) {
            int size = arrayList2.size();
            while (true) {
                i++;
                if (i >= size) {
                    break;
                }
                ChatMessageVO cVar = (ChatMessageVO) arrayList2.get(i);
                if (cVar == null) {
                    Intrinsics.throwNpe();
                }
                if ((cVar.mo121699g() instanceof AudioContentVO) && cVar.mo121702j() < 2 && !cVar.mo121695c()) {
                    arrayList.add(cVar.mo121696d());
                }
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33117f
    /* renamed from: c */
    public void mo121942c(String str) {
        MessageInfo messageInfoById;
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null && (messageInfoById = gVar.getMessageInfoById(str)) != null) {
            Message message = messageInfoById.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
            if (!m130129b(message)) {
                m130131c(message);
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                b.mo134506E().mo134371a(this.f86491m, message, "click", "chat", "");
            }
        }
    }

    /* renamed from: d */
    public final void mo123354d(int i) {
        Chat chat;
        Chat n;
        int itemCount = this.f86482c.getItemCount();
        Log.m165389i("ChatWindowLog", "scrollAfterInitLoad : " + i + ", size:" + itemCount);
        if (i >= 0) {
            Log.m165389i("ChatWindowLog", "init pos > 0, try to scroll");
            C33256m mVar = new C33256m(i);
            this.f86484e.mo122596a(new C33247j.C33250b().mo122605a(mVar).mo122604a(17).mo122606a(new ao(this, mVar)).mo122607a(true).mo122608a());
            return;
        }
        C33234e eVar = this.f86485g;
        if (eVar != null) {
            chat = eVar.mo122550n();
        } else {
            chat = null;
        }
        if (C34339g.m133171e(chat) == Chat.MessagePosition.NEWEST_UNREAD) {
            Log.m165389i("ChatWindowLog", "init scroll to newest unread : bottom");
            this.f86484e.mo122593a(0, false);
            return;
        }
        Log.m165389i("ChatWindowLog", "init scroll to last unread ");
        C33234e eVar2 = this.f86485g;
        if (eVar2 != null && (n = eVar2.mo122550n()) != null) {
            if (n.getRecentReadPosition() > -1) {
                Log.m165389i("ChatWindowLog", "init scroll to recent read position : " + n.getRecentReadOffset());
                this.f86484e.mo122596a(new C33247j.C33250b().mo122605a(new C33256m(n.getRecentReadPosition())).mo122603a(n.getRecentReadOffset()).mo122606a(new an(this)).mo122608a());
                return;
            }
            mo123369y();
        }
    }

    /* renamed from: a */
    public final CharSequence mo123341a(Message message) {
        CardContent.Type type;
        String str;
        String string;
        TodoOperationContent.Type type2;
        TodoOperationContent cardContentData;
        TodoOperationContent cardContentData2;
        String a = C34349o.m133202a((Context) this.f86491m, message, false, true, false);
        Message.Type type3 = message.getType();
        if (type3 != null) {
            int i = C33598d.f86573c[type3.ordinal()];
            Object obj = null;
            if (i == 1) {
                Content content = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<CardContent>()");
                CardContent cardContent = (CardContent) content;
                if (cardContent != null) {
                    type = cardContent.getType();
                } else {
                    type = null;
                }
                if (type != CardContent.Type.VOTE) {
                    CardContent.CardHeader cardHeader = cardContent.getCardHeader();
                    if (cardHeader != null) {
                        str = cardHeader.getTitle();
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        CardContent.CardHeader cardHeader2 = cardContent.getCardHeader();
                        if (cardHeader2 != null) {
                            obj = cardHeader2.getTitle();
                        }
                        a = (CharSequence) obj;
                    } else {
                        string = UIHelper.getString(R.string.Lark_Legacy_MessagePoCard);
                    }
                }
            } else if (i == 2) {
                a = UIHelper.mustacheFormat((int) R.string.Calendar_CreateTaskFromEvent_TaskTitle, "title", C34349o.m133206a(message).toString());
            } else if (i == 3) {
                Content content2 = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content2, "message.getContent<TodoContent>()");
                TodoContent todoContent = (TodoContent) content2;
                if (todoContent == null || (cardContentData2 = todoContent.getCardContentData()) == null) {
                    type2 = null;
                } else {
                    type2 = cardContentData2.operation_type;
                }
                if (type2 == TodoOperationContent.Type.DAILY_REMIND) {
                    if (!(todoContent == null || (cardContentData = todoContent.getCardContentData()) == null)) {
                        obj = cardContentData.operation_type;
                    }
                    if (obj == TodoOperationContent.Type.DAILY_REMIND) {
                        if (this.f86477G.mo134685a("todo.remind.expand_scope")) {
                            string = UIHelper.getString(R.string.Todo_Task_RecentTodoTask);
                        } else {
                            string = UIHelper.getString(R.string.Todo_BotNotification_DailyNotificationTitle);
                        }
                    }
                }
            }
            a = string;
        }
        Intrinsics.checkExpressionValueIsNotNull(a, "summary");
        return a;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33116e
    /* renamed from: b */
    public void mo121940b(String str) {
        MessageInfo messageInfoById;
        Chat G;
        ChatChatter chatChatter;
        C1177w<ChatChatter> p2pChatterLiveData;
        boolean z;
        C1177w<ChatChatter> p2pChatterLiveData2;
        ChatChatter b;
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null && (messageInfoById = gVar.getMessageInfoById(str)) != null && (G = mo123339G()) != null) {
            BuzzHitPoint.Companion aVar = BuzzHitPoint.f135698a;
            Message message = messageInfoById.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
            Message.Type type = message.getType();
            boolean z2 = false;
            if (G.isP2PChat()) {
                MessageListViewModel gVar2 = this.f86481b;
                if (gVar2 == null || (p2pChatterLiveData2 = gVar2.getP2pChatterLiveData()) == null || (b = p2pChatterLiveData2.mo5927b()) == null) {
                    z = false;
                } else {
                    z = b.isBot();
                }
                if (z) {
                    z2 = true;
                }
            }
            aVar.mo187452a(str, type, G, z2);
            if (G.getType() != Chat.Type.P2P) {
                AbstractC36474h b2 = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
                AbstractC36507u T = b2.mo134521T();
                FragmentActivity fragmentActivity = this.f86491m;
                Object o = mo141195o();
                if (o != null) {
                    T.mo134713a(fragmentActivity, (C36516a) o, G.getId(), str, 6);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.desktopmode.app.DesktopCompatFragment<*>");
            } else if (m130123Y()) {
                LKUIToast.show(this.f86491m, UIHelper.getString(R.string.Lark_Legacy_ChatterResignPermissionUrgent));
            } else {
                MessageListViewModel gVar3 = this.f86481b;
                if (gVar3 == null || (p2pChatterLiveData = gVar3.getP2pChatterLiveData()) == null) {
                    chatChatter = null;
                } else {
                    chatChatter = p2pChatterLiveData.mo5927b();
                }
                if (chatChatter != null) {
                    AbstractC36474h b3 = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
                    AbstractC36497m J = b3.mo134511J();
                    FragmentActivity fragmentActivity2 = this.f86491m;
                    Object o2 = mo141195o();
                    if (o2 != null) {
                        J.mo134663a(fragmentActivity2, (C36516a) o2, messageInfoById.getMessage(), chatChatter, 6);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.desktopmode.app.DesktopCompatFragment<*>");
                }
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33124m
    /* renamed from: d */
    public void mo121943d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        C36894a a = C36894a.m145605a();
        Intrinsics.checkExpressionValueIsNotNull(a, "audioPlayer");
        if (a.mo136217n() == 1) {
            a.mo136209f();
            Iterator<T> it = this.f86498y.iterator();
            while (it.hasNext()) {
                it.next().mo123159a(false);
            }
            return;
        }
        a.mo136208e();
        Iterator<T> it2 = this.f86498y.iterator();
        while (it2.hasNext()) {
            it2.next().mo123159a(true);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: a */
    public List<AbstractC34006a> mo123303a(Collection<String> collection) {
        List<MessageInfo> list;
        Intrinsics.checkParameterIsNotNull(collection, "ids");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null) {
            list = gVar.getMessageInfoByIds(collection);
        } else {
            list = null;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog1", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$d */
    public static final class DialogInterface$OnClickListenerC33574d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86541a;

        DialogInterface$OnClickListenerC33574d(MessageListComponent messageListComponent) {
            this.f86541a = messageListComponent;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f86541a.mo123370z();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "x", "", "y", "onTouchiew"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$q */
    public static final class C33588q implements PointRecoderRecyclerView.AbstractC58964a {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86560a;

        C33588q(MessageListComponent messageListComponent) {
            this.f86560a = messageListComponent;
        }

        @Override // com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView.AbstractC58964a
        public final void onTouchiew(float f, float f2) {
            C33234e eVar = this.f86560a.f86485g;
            if (eVar != null) {
                eVar.mo122526a((int) f2);
            }
            ItemShineManager<?> itemShineManager = this.f86560a.f86490l;
            if (itemShineManager != null) {
                itemShineManager.mo121644c();
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33298h
    /* renamed from: b */
    public void mo122764b(String str, Message.Type type) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134577e().mo120962b(type.getNumber(), str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.view.message.callbacks.OnFolderClickListener
    /* renamed from: d */
    public void mo123355d(String str, int i) {
        MessageInfo messageInfoById;
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null && (messageInfoById = gVar.getMessageInfoById(str)) != null) {
            Message message = messageInfoById.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
            if (message.getType() == Message.Type.FOLDER) {
                Message message2 = messageInfoById.getMessage();
                Intrinsics.checkExpressionValueIsNotNull(message2, "messageInfo.getMessage()");
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                b.mo134520S().mo134697a(this.f86491m, message2, 0);
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33130s
    /* renamed from: b */
    public void mo122319b(String str, int i) {
        MessageInfo messageInfoById;
        Chat G;
        String str2;
        ChatChatter messageSender;
        Chatter chatter;
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        MessageListViewModel gVar = this.f86481b;
        if (gVar != null && (messageInfoById = gVar.getMessageInfoById(str)) != null && (G = mo123339G()) != null) {
            Message message = messageInfoById.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
            MessageInfo parentMessageInfo = messageInfoById.getParentMessageInfo();
            if (parentMessageInfo == null || (messageSender = parentMessageInfo.getMessageSender()) == null || (chatter = messageSender.getChatter()) == null || (str2 = chatter.getId()) == null) {
                str2 = "";
            }
            Intrinsics.checkExpressionValueIsNotNull(str2, "messageInfo.parentMessag…getId()\n            ?: \"\"");
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.ak().mo86324b(Domain.message, str, BlockTypeID.MESSAGE, new am(this, G, message, str, str2));
            ChatHitPoint.f135648a.mo187368e(str);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent
    /* renamed from: a */
    public void mo123304a(int i, int i2) {
        C58984d<ChatMessageVO<?>, C33086b> dVar = this.f86483d;
        if (dVar == null || dVar.mo200107c()) {
            C33234e eVar = this.f86485g;
            if (eVar != null) {
                eVar.mo122536b();
            }
            C58984d<ChatMessageVO<?>, C33086b> dVar2 = this.f86483d;
            if (dVar2 != null) {
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                int itemCount = this.f86482c.getItemCount();
                while (i < itemCount) {
                    if (dVar2.mo123399a(this.f86482c.mo31276a(i))) {
                        arrayList.add(this.f86482c.mo31276a(i));
                        i3++;
                    }
                    if (i3 >= i2) {
                        break;
                    }
                    i++;
                }
                dVar2.mo200102a(arrayList);
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33293c
    /* renamed from: b */
    public void mo122759b(String str, String str2) {
        MessageListViewModel gVar;
        Intrinsics.checkParameterIsNotNull(str, "audioKey");
        Intrinsics.checkParameterIsNotNull(str2, "messageId");
        Chat G = mo123339G();
        if (G != null && (gVar = this.f86481b) != null) {
            gVar.prepareAudioData(str, str2, G.isSecret());
        }
    }

    /* renamed from: a */
    public final void mo123344a(int i, boolean z, C33247j.AbstractC33251c cVar) {
        this.f86484e.mo122594a(i, z, cVar);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onKey"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent$e */
    public static final class DialogInterface$OnKeyListenerC33575e implements DialogInterface.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ MessageListComponent f86542a;

        DialogInterface$OnKeyListenerC33575e(MessageListComponent messageListComponent) {
            this.f86542a = messageListComponent;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i != 4) {
                return true;
            }
            this.f86542a.mo123370z();
            return true;
        }
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        MessageListResultHandler fVar = this.f86475E;
        if (fVar != null) {
            fVar.mo123417a(i, i2, intent);
        }
    }

    public MessageListComponent(FragmentActivity fragmentActivity, IMessageDependenceViewModel aVar, IMessageListComponent.MessageListComponentDependency gVar) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "mContext");
        Intrinsics.checkParameterIsNotNull(aVar, "hostVM");
        Intrinsics.checkParameterIsNotNull(gVar, "messageListComponentDependency");
        this.f86491m = fragmentActivity;
        this.f86479I = aVar;
        this.f86492n = gVar;
        AbstractC36503q n = C29990c.m110930b().mo134586n();
        Intrinsics.checkExpressionValueIsNotNull(n, "ChatModuleInstanceHolder…FeatureGatingDependency()");
        this.f86477G = n;
        this.f86478H = new MenuProviderHandlerHub();
    }
}
