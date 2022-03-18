package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.DocEntity;
import com.bytedance.lark.pb.basic.v1.PreviewEntityPair;
import com.bytedance.lark.pb.basic.v1.RichContent;
import com.bytedance.lark.pb.basic.v1.UrlPreviewHangPoint;
import com.bytedance.lark.pb.todo.v1.DraftScene;
import com.bytedance.lark.pb.todo.v1.Record;
import com.bytedance.lark.pb.todo.v1.Todo;
import com.bytedance.lark.pb.todo.v1.TodoAssignee;
import com.bytedance.lark.pb.todo.v1.TodoComment;
import com.bytedance.lark.pb.todo.v1.TodoFollower;
import com.bytedance.lark.pb.todo.v1.TodoItemPermission;
import com.bytedance.lark.pb.todo.v1.TodoOrigin;
import com.bytedance.lark.pb.todo.v1.TodoReferResource;
import com.bytedance.lark.pb.todo.v1.TodoReminder;
import com.bytedance.lark.pb.todo.v1.TodoSetting;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.bytedance.lark.pb.todo.v1.TodoSourceBlock;
import com.bytedance.lark.pb.todo.v1.TodoSourceHref;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.component.blockit.entity.BlockExtra;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.section.utils.MutableLiveDataPlus;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.ao;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.preview.NetUrlPreviewEntity;
import com.ss.android.lark.chat.entity.preview.Url;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.common.screenshot.helper.TodoDetailLogHelper;
import com.ss.android.lark.todo.impl.features.common.share.entity.ShareEntity;
import com.ss.android.lark.todo.impl.features.common.share.helper.ShareProcess;
import com.ss.android.lark.todo.impl.features.detail.comment.CommentAtUserInfo;
import com.ss.android.lark.todo.impl.features.detail.comment.CommentDraftInfo;
import com.ss.android.lark.todo.impl.features.detail.comment.CommentPanelInfo;
import com.ss.android.lark.todo.impl.features.detail.comment.CreatorInfo;
import com.ss.android.lark.todo.impl.features.detail.helper.richtext.ParserUrlPreviewHelper;
import com.ss.android.lark.todo.impl.features.detail.p2809b.p2810a.C56472a;
import com.ss.android.lark.todo.impl.features.detail.p2809b.p2810a.C56473b;
import com.ss.android.lark.todo.impl.features.detail.p2809b.p2810a.C56478e;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoKeyboardViewModel;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.data.TodoToastUnit;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoSceneType;
import com.ss.android.lark.todo.impl.features.setting.TodoSettingService;
import com.ss.android.lark.todo.impl.features.setting.data.TodoSettingData;
import com.ss.android.lark.todo.impl.framework.architecture.Event;
import com.ss.android.lark.todo.impl.framework.busevents.DeleteTodoEvent;
import com.ss.android.lark.todo.impl.framework.busevents.QuitTodoEvent;
import com.ss.android.lark.todo.impl.framework.busevents.UpdateTodoEvent;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.rustadapter.push.TodoPushHandleCallBack;
import com.ss.android.lark.todo.impl.rustadapter.push.TodoPushProcess;
import com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD;
import com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCommon;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import com.ss.android.lark.widget.richtext.C59031e;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.bl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000È\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u0000 Ù\u00032\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002Ù\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001d\u0010\u0003\u001a\u00030\u00032\u0007\u0010\u0003\u001a\u00020\u001fH@ø\u0001\u0000¢\u0006\u0003\u0010\u0003J7\u0010\u0003\u001a\u00030\u00032\r\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b2\u0007\u0010\u0003\u001a\u00020\n2\t\b\u0002\u0010\u0003\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0003\u0010\u0003J\u0019\u0010\u0003\u001a\u00030\u00032\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001bH\u0016J,\u0010\u0003\u001a\u00030\u00032\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b2\u0007\u0010\u0003\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0003\u0010\u0003J\n\u0010\u0003\u001a\u00030á\u0002H\u0002J\u0015\u0010\u0003\u001a\u00030\u00032\t\b\u0002\u0010\u0003\u001a\u00020\nH\u0002J\n\u0010\u0003\u001a\u00030\u0003H\u0002J\u0013\u0010\u0003\u001a\u00030\u00032\u0007\u0010\u0003\u001a\u00020\nH\u0016J\b\u0010\u0003\u001a\u00030\u0003J\u0011\u0010\u0003\u001a\u00030\u00032\u0007\u0010\u0003\u001a\u00020\nJ\u001c\u0010\u0003\u001a\u00030\u00032\u0007\u0010\u0003\u001a\u00020\n2\u0007\u0010\u0003\u001a\u00020\nH\u0002J\n\u0010\u0003\u001a\u00030\u0003H\u0016J\u0016\u0010\u0003\u001a\u00030\u00032\n\u0010\u0003\u001a\u0005\u0018\u00010ø\u0001H\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u001c2\u0007\u0010 \u0003\u001a\u00020\u001fH\u0016J\u000b\u0010¡\u0003\u001a\u0004\u0018\u00010\u001fH\u0016J\n\u0010¢\u0003\u001a\u00030\u0003H\u0002J\n\u0010£\u0003\u001a\u00030\u0003H\u0002J\n\u0010¤\u0003\u001a\u00030\u0003H\u0002J\n\u0010¥\u0003\u001a\u00030\u0003H\u0002J\u0015\u0010¦\u0003\u001a\u0005\u0018\u00010§\u00032\u0007\u0010 \u0003\u001a\u00020\u001fH\u0016J\u0013\u0010¨\u0003\u001a\u00030\u00032\u0007\u0010\u0003\u001a\u00020\u001fH\u0002JC\u0010©\u0003\u001a\u00030\u00032\n\u0010ª\u0003\u001a\u0005\u0018\u00010ø\u00012+\u0010«\u0003\u001a&\u0012\u0004\u0012\u00020\u001f\u0012\u0005\u0012\u00030\u0001\u0018\u00010\u0001j\u0012\u0012\u0004\u0012\u00020\u001f\u0012\u0005\u0012\u00030\u0001\u0018\u0001`\u0001H\u0002J\n\u0010¬\u0003\u001a\u00030­\u0003H\u0002J\n\u0010®\u0003\u001a\u00030\u0003H\u0002J\n\u0010¯\u0003\u001a\u00030\u0003H\u0002J\n\u0010°\u0003\u001a\u00030\u0003H\u0002J\n\u0010±\u0003\u001a\u00030\u0003H\u0002J\u001d\u0010²\u0003\u001a\u00030\u00032\u0007\u0010³\u0003\u001a\u00020\u001f2\b\u0010´\u0003\u001a\u00030\u0001H\u0016J\u001d\u0010µ\u0003\u001a\u00030\u00032\u0007\u0010³\u0003\u001a\u00020\u001f2\b\u0010´\u0003\u001a\u00030\u0001H\u0016J\u001d\u0010¶\u0003\u001a\u00030\u00032\u0007\u0010³\u0003\u001a\u00020\u001f2\b\u0010·\u0003\u001a\u00030\u0003H\u0016J\u001d\u0010¸\u0003\u001a\u00030\u00032\u0007\u0010³\u0003\u001a\u00020\u001f2\b\u0010·\u0003\u001a\u00030\u0003H\u0016J\t\u0010¹\u0003\u001a\u00020\nH\u0002J\t\u0010º\u0003\u001a\u00020\nH\u0016J\t\u0010»\u0003\u001a\u00020\nH\u0016J\u0007\u0010¼\u0003\u001a\u00020\nJ\u0014\u0010½\u0003\u001a\u00020\n2\t\u0010 \u0003\u001a\u0004\u0018\u00010\u001fH\u0016J\u0007\u0010¾\u0003\u001a\u00020\nJ\t\u0010¿\u0003\u001a\u00020\nH\u0016J\t\u0010À\u0003\u001a\u00020\nH\u0002J\n\u0010Á\u0003\u001a\u00030\u0003H\u0016J\n\u0010Â\u0003\u001a\u00030\u0003H\u0002J\n\u0010Ã\u0003\u001a\u00030\u0003H\u0014J'\u0010Ä\u0003\u001a\u00030\u00032\u001b\u0010Å\u0003\u001a\u0016\u0012\u0005\u0012\u00030Æ\u00030\u0001j\n\u0012\u0005\u0012\u00030Æ\u0003`\u0001H\u0016J\n\u0010Ç\u0003\u001a\u00030\u0003H\u0016J\u0019\u0010È\u0003\u001a\u00030\u00032\r\u0010Å\u0003\u001a\b\u0012\u0004\u0012\u00020]0\\H\u0016J\n\u0010É\u0003\u001a\u00030\u0003H\u0002J\u0014\u0010Ê\u0003\u001a\u00030\u0003H@ø\u0001\u0000¢\u0006\u0003\u0010Ë\u0003J\n\u0010Ì\u0003\u001a\u00030\u0003H\u0016J\n\u0010Í\u0003\u001a\u00030\u0003H\u0002J\n\u0010Î\u0003\u001a\u00030\u0003H\u0016J.\u0010Ï\u0003\u001a\u00030\u00032\u0019\u0010Ð\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u001f0\u0001j\t\u0012\u0004\u0012\u00020\u001f`\u00012\u0007\u0010Ñ\u0003\u001a\u00020\u001fH\u0016J\u0013\u0010Ò\u0003\u001a\u00030\u00032\u0007\u0010Ó\u0003\u001a\u00020\nH\u0016J\n\u0010Ô\u0003\u001a\u00030\u0003H\u0002J\n\u0010Õ\u0003\u001a\u00030\u0003H\u0002J\n\u0010Ö\u0003\u001a\u00030\u0003H\u0016J\u0016\u0010×\u0003\u001a\u0005\u0018\u00010ï\u0001H@ø\u0001\u0000¢\u0006\u0003\u0010Ë\u0003J\n\u0010Ø\u0003\u001a\u00030\u0003H\u0002R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R(\u0010(\u001a\u0004\u0018\u00010\u001f2\b\u0010'\u001a\u0004\u0018\u00010\u001f8V@VX\u000e¢\u0006\f\u001a\u0004\b)\u0010!\"\u0004\b*\u0010#R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0017R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0017R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\fR\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\fR\u000e\u00103\u001a\u000204X\u0004¢\u0006\u0002\n\u0000R\u0014\u00105\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u00108\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b9\u00107R\u0014\u0010:\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b;\u00107R\u0014\u0010<\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b=\u00107R\u0010\u0010>\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010?\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010!\"\u0004\bA\u0010#R\u001c\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\t8VX\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\fR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\fR\u001c\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010\fR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010\fR\u001c\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010\fR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020O0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010\fR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010\fR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010\fR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010\fR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\n0\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010\u0017R\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010\fR&\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0\\0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\f\"\u0004\b_\u0010\u000eR\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020a0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010\fR \u0010c\u001a\b\u0012\u0004\u0012\u00020d0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\f\"\u0004\bf\u0010\u000eR\u0014\u0010g\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\bh\u00107R\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010\u0017R\u0018\u0010k\u001a\u00060lj\u0002`m8BX\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u001c\u0010p\u001a\u00020\u001f8VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010!\"\u0004\br\u0010#R\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020t0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010\fR\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\bw\u0010\fR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020O0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010\fR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020{0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b|\u0010\fR\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020~0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\fR\u001c\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020O0\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\fR\u001d\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\fR$\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010\tX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\f\"\u0005\b\u0001\u0010\u000eR\u001c\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020d0\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\fR!\u0010\u0001\u001a\u00030\u00018FX\u0002¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R3\u0010\u0001\u001a&\u0012\u0004\u0012\u00020\u001f\u0012\u0005\u0012\u00030\u0001\u0018\u00010\u0001j\u0012\u0012\u0004\u0012\u00020\u001f\u0012\u0005\u0012\u00030\u0001\u0018\u0001`\u0001X\u000e¢\u0006\u0002\n\u0000R3\u0010\u0001\u001a&\u0012\u0004\u0012\u00020\u001f\u0012\u0005\u0012\u00030\u0001\u0018\u00010\u0001j\u0012\u0012\u0004\u0012\u00020\u001f\u0012\u0005\u0012\u00030\u0001\u0018\u0001`\u0001X\u000e¢\u0006\u0002\n\u0000R+\u0010\u0001\u001a\u0017\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020]\u0018\u00010\u00010\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\fR\u001c\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u0014X\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\u0017R)\u0010\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u001f0\u0001j\t\u0012\u0004\u0012\u00020\u001f`\u00018VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u001e\u0010 \u0001\u001a\t\u0012\u0005\u0012\u00030¡\u00010\\8VX\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001R#\u0010¤\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¥\u00010\u001b0\u0014X\u0004¢\u0006\t\n\u0000\u001a\u0005\b¦\u0001\u0010\u0017R\u001d\u0010§\u0001\u001a\u00020\u001fX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¨\u0001\u0010!\"\u0005\b©\u0001\u0010#R\u001e\u0010ª\u0001\u001a\u00020\nX\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b«\u0001\u00107\"\u0006\b¬\u0001\u0010­\u0001R\u001c\u0010®\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\b¯\u0001\u0010\fR\u001c\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u0014X\u0004¢\u0006\t\n\u0000\u001a\u0005\b±\u0001\u0010\u0017R#\u0010²\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030³\u00010\u001b0\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\b´\u0001\u0010\fR%\u0010µ\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\tX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¶\u0001\u0010\f\"\u0005\b·\u0001\u0010\u000eR\u001c\u0010¸\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u0014X\u0004¢\u0006\t\n\u0000\u001a\u0005\b¹\u0001\u0010\u0017R\u0016\u0010º\u0001\u001a\u00020\n8VX\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u00107R\u001e\u0010»\u0001\u001a\u00020\nX\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b»\u0001\u00107\"\u0006\b¼\u0001\u0010­\u0001R\u001e\u0010½\u0001\u001a\u00020\nX\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b½\u0001\u00107\"\u0006\b¾\u0001\u0010­\u0001R\u001e\u0010¿\u0001\u001a\u00020\nX\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b¿\u0001\u00107\"\u0006\bÀ\u0001\u0010­\u0001R\u001c\u0010Á\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u0014X\u0004¢\u0006\t\n\u0000\u001a\u0005\bÁ\u0001\u0010\u0017R\u0016\u0010Â\u0001\u001a\u00020\n8VX\u0004¢\u0006\u0007\u001a\u0005\bÂ\u0001\u00107R\u0016\u0010Ã\u0001\u001a\u00020\n8VX\u0004¢\u0006\u0007\u001a\u0005\bÃ\u0001\u00107R\u000f\u0010Ä\u0001\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010Å\u0001\u001a\u00020\nX\u000e¢\u0006\u0011\n\u0000\u001a\u0005\bÅ\u0001\u00107\"\u0006\bÆ\u0001\u0010­\u0001R\u001e\u0010Ç\u0001\u001a\u00020\nX\u000e¢\u0006\u0011\n\u0000\u001a\u0005\bÇ\u0001\u00107\"\u0006\bÈ\u0001\u0010­\u0001R\u000f\u0010É\u0001\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010Ê\u0001\u001a\u00020\nX\u000e¢\u0006\u0011\n\u0000\u001a\u0005\bÊ\u0001\u00107\"\u0006\bË\u0001\u0010­\u0001R\u0016\u0010Ì\u0001\u001a\u00020\n8VX\u0004¢\u0006\u0007\u001a\u0005\bÌ\u0001\u00107R\u001e\u0010Í\u0001\u001a\u00020\nX\u000e¢\u0006\u0011\n\u0000\u001a\u0005\bÍ\u0001\u00107\"\u0006\bÎ\u0001\u0010­\u0001R\u001c\u0010Ï\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\bÐ\u0001\u0010\fR\u001c\u0010Ñ\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\bÒ\u0001\u0010\fR\u001c\u0010Ó\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\t\n\u0000\u001a\u0005\bÔ\u0001\u0010\u0017R$\u0010Õ\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u0014X\u000e¢\u0006\u0011\n\u0000\u001a\u0005\bÖ\u0001\u0010\u0017\"\u0006\b×\u0001\u0010Ø\u0001R\u0012\u0010Ù\u0001\u001a\u0005\u0018\u00010Ú\u0001X\u000e¢\u0006\u0002\n\u0000R\u001f\u0010Û\u0001\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÜ\u0001\u0010!\"\u0005\bÝ\u0001\u0010#R\u0012\u0010Þ\u0001\u001a\u0005\u0018\u00010ß\u0001X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010à\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u0014X\u0004¢\u0006\t\n\u0000\u001a\u0005\bá\u0001\u0010\u0017R\u001c\u0010â\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\t\n\u0000\u001a\u0005\bã\u0001\u0010\u0017R\u0017\u0010ä\u0001\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u000f\u0010å\u0001\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R#\u0010æ\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bç\u0001\u0010\f\"\u0005\bè\u0001\u0010\u000eR\u001c\u0010é\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\bê\u0001\u0010\fR\u001c\u0010ë\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\bì\u0001\u0010\fR\u001c\u0010í\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\bî\u0001\u0010\fR+\u0010ð\u0001\u001a\u00030ï\u00012\u0007\u0010'\u001a\u00030ï\u0001@FX\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bñ\u0001\u0010ò\u0001\"\u0006\bó\u0001\u0010ô\u0001R\u001c\u0010õ\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\bö\u0001\u0010\fR\u0012\u0010÷\u0001\u001a\u0005\u0018\u00010ø\u0001X\u000e¢\u0006\u0002\n\u0000R-\u0010ù\u0001\u001a\u0004\u0018\u00010\u001f2\b\u0010'\u001a\u0004\u0018\u00010\u001f8V@VX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bú\u0001\u0010!\"\u0005\bû\u0001\u0010#R$\u0010ü\u0001\u001a\t\u0012\u0005\u0012\u00030ý\u00010\tX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bþ\u0001\u0010\f\"\u0005\bÿ\u0001\u0010\u000eR+\u0010\u0002\u001a\u0017\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020]\u0018\u00010\u00010\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0002\u0010\fR\u0012\u0010\u0002\u001a\u0005\u0018\u00010ø\u0001X\u000e¢\u0006\u0002\n\u0000R/\u0010\u0002\u001a\u0005\u0018\u00010ø\u00012\t\u0010'\u001a\u0005\u0018\u00010ø\u00018V@VX\u000e¢\u0006\u0010\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R\u0012\u0010\u0002\u001a\u0005\u0018\u00010ø\u0001X\u000e¢\u0006\u0002\n\u0000R/\u0010\u0002\u001a\u0005\u0018\u00010ø\u00012\t\u0010'\u001a\u0005\u0018\u00010ø\u00018V@VX\u000e¢\u0006\u0010\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R$\u0010\u0002\u001a\t\u0012\u0005\u0012\u00030\u00010\tX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0002\u0010\f\"\u0005\b\u0002\u0010\u000eR/\u0010\u0002\u001a\u0005\u0018\u00010ø\u00012\t\u0010'\u001a\u0005\u0018\u00010ø\u00018V@VX\u000e¢\u0006\u0010\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R\u0012\u0010\u0002\u001a\u0005\u0018\u00010ø\u0001X\u000e¢\u0006\u0002\n\u0000R)\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001b0\tX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0002\u0010\f\"\u0005\b\u0002\u0010\u000eR2\u0010\u0002\u001a\u0017\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n\u0018\u00010\u00010\tX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0002\u0010\f\"\u0005\b\u0002\u0010\u000eR$\u0010\u0002\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0015\n\u0003\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R$\u0010\u0002\u001a\t\u0012\u0005\u0012\u00030 \u00020\tX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¡\u0002\u0010\f\"\u0005\b¢\u0002\u0010\u000eR\u001c\u0010£\u0002\u001a\b\u0012\u0004\u0012\u00020\n0\u0014X\u0004¢\u0006\t\n\u0000\u001a\u0005\b¤\u0002\u0010\u0017R#\u0010¥\u0002\u001a\b\u0012\u0004\u0012\u00020\u00150\tX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¦\u0002\u0010\f\"\u0005\b§\u0002\u0010\u000eR\u001c\u0010¨\u0002\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\b©\u0002\u0010\fR\u001d\u0010ª\u0002\u001a\t\u0012\u0005\u0012\u00030«\u00020\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\b¬\u0002\u0010\fR\u001c\u0010­\u0002\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\b®\u0002\u0010\fR\u001c\u0010¯\u0002\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\b°\u0002\u0010\fR\u001d\u0010±\u0002\u001a\t\u0012\u0005\u0012\u00030²\u00020\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\b³\u0002\u0010\fR\u001d\u0010´\u0002\u001a\t\u0012\u0005\u0012\u00030µ\u00020\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\b¶\u0002\u0010\fR\u001d\u0010·\u0002\u001a\t\u0012\u0005\u0012\u00030¸\u00020\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\b¹\u0002\u0010\fR\u001c\u0010º\u0002\u001a\b\u0012\u0004\u0012\u00020d0\u0014X\u0004¢\u0006\t\n\u0000\u001a\u0005\b»\u0002\u0010\u0017R#\u0010¼\u0002\u001a\b\u0012\u0004\u0012\u00020O0\tX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b½\u0002\u0010\f\"\u0005\b¾\u0002\u0010\u000eR#\u0010¿\u0002\u001a\b\u0012\u0004\u0012\u00020O0\tX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÀ\u0002\u0010\f\"\u0005\bÁ\u0002\u0010\u000eR\u001d\u0010Â\u0002\u001a\t\u0012\u0005\u0012\u00030\u00010\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\bÃ\u0002\u0010\fR$\u0010Ä\u0002\u001a\t\u0012\u0005\u0012\u00030\u00010\tX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÅ\u0002\u0010\f\"\u0005\bÆ\u0002\u0010\u000eR\u001c\u0010Ç\u0002\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\bÈ\u0002\u0010\fR\u001c\u0010É\u0002\u001a\b\u0012\u0004\u0012\u00020d0\u0014X\u0004¢\u0006\t\n\u0000\u001a\u0005\bÊ\u0002\u0010\u0017R\u001c\u0010Ë\u0002\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\bÌ\u0002\u0010\fR\u001d\u0010Í\u0002\u001a\t\u0012\u0005\u0012\u00030Î\u00020\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\bÏ\u0002\u0010\fR\u001c\u0010Ð\u0002\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\bÑ\u0002\u0010\fR\u001c\u0010Ò\u0002\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\bÓ\u0002\u0010\fR\u001d\u0010Ô\u0002\u001a\t\u0012\u0005\u0012\u00030Õ\u00020\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\bÖ\u0002\u0010\fR$\u0010×\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030Ù\u00020Ø\u00020\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\bÚ\u0002\u0010\fR#\u0010Û\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00150Ø\u00020\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\bÜ\u0002\u0010\fR#\u0010Ý\u0002\u001a\b\u0012\u0004\u0012\u00020\u00150\tX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÞ\u0002\u0010\f\"\u0005\bß\u0002\u0010\u000eR \u0010à\u0002\u001a\u00030á\u0002X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bâ\u0002\u0010ã\u0002\"\u0006\bä\u0002\u0010å\u0002R\u001a\u0010æ\u0002\u001a\u0005\u0018\u00010ç\u00028VX\u0004¢\u0006\b\u001a\u0006\bè\u0002\u0010é\u0002R\u001a\u0010ê\u0002\u001a\u0005\u0018\u00010ë\u00028VX\u0004¢\u0006\b\u001a\u0006\bì\u0002\u0010í\u0002R\u0012\u0010î\u0002\u001a\u0005\u0018\u00010ý\u0001X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010ï\u0002\u001a\u0005\u0018\u00010ð\u0002X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010ñ\u0002\u001a\u0005\u0018\u00010ò\u00028VX\u0004¢\u0006\b\u001a\u0006\bó\u0002\u0010ô\u0002R\u001a\u0010õ\u0002\u001a\u0005\u0018\u00010ö\u00028VX\u0004¢\u0006\b\u001a\u0006\b÷\u0002\u0010ø\u0002R#\u0010ù\u0002\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bú\u0002\u0010\f\"\u0005\bû\u0002\u0010\u000eR#\u0010ü\u0002\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bý\u0002\u0010\f\"\u0005\bþ\u0002\u0010\u000eR!\u0010ÿ\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u001f0\u0001j\t\u0012\u0004\u0012\u00020\u001f`\u0001X\u000e¢\u0006\u0002\n\u0000R!\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u001f0\u0001j\t\u0012\u0004\u0012\u00020\u001f`\u0001X\u000e¢\u0006\u0002\n\u0000R3\u0010\u0003\u001a&\u0012\u0004\u0012\u00020\u001f\u0012\u0005\u0012\u00030\u0003\u0018\u00010\u0001j\u0012\u0012\u0004\u0012\u00020\u001f\u0012\u0005\u0012\u00030\u0003\u0018\u0001`\u0001X\u000e¢\u0006\u0002\n\u0000R3\u0010\u0003\u001a&\u0012\u0004\u0012\u00020\u001f\u0012\u0005\u0012\u00030\u0003\u0018\u00010\u0001j\u0012\u0012\u0004\u0012\u00020\u001f\u0012\u0005\u0012\u00030\u0003\u0018\u0001`\u0001X\u000e¢\u0006\u0002\n\u0000R\u001f\u0010\u0003\u001a\u00020\n8BX\u0002¢\u0006\u000f\n\u0006\b\u0003\u0010\u0001\u001a\u0005\b\u0003\u00107R3\u0010\u0003\u001a&\u0012\u0004\u0012\u00020\u001f\u0012\u0005\u0012\u00030\u0003\u0018\u00010\u0001j\u0012\u0012\u0004\u0012\u00020\u001f\u0012\u0005\u0012\u00030\u0003\u0018\u0001`\u0001X\u000e¢\u0006\u0002\n\u0000R3\u0010\u0003\u001a&\u0012\u0004\u0012\u00020\u001f\u0012\u0005\u0012\u00030\u0003\u0018\u00010\u0001j\u0012\u0012\u0004\u0012\u00020\u001f\u0012\u0005\u0012\u00030\u0003\u0018\u0001`\u0001X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006Ú\u0003"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewModel;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoKeyboardViewModel;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "intent", "Landroid/content/Intent;", "(Landroid/content/Intent;)V", "activityFinished", "Landroidx/lifecycle/MutableLiveData;", "", "getActivityFinished", "()Landroidx/lifecycle/MutableLiveData;", "setActivityFinished", "(Landroidx/lifecycle/MutableLiveData;)V", "allUsersCompletedDialog", "getAllUsersCompletedDialog", "allUsersUnCompletedDialog", "getAllUsersUnCompletedDialog", "assigneeFragmentShowAdd", "Lcom/larksuite/framework/section/utils/MutableLiveDataPlus;", "", "getAssigneeFragmentShowAdd", "()Lcom/larksuite/framework/section/utils/MutableLiveDataPlus;", "assigneeMultiStrategy", "getAssigneeMultiStrategy", "assignees", "", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AssigneeBean;", "getAssignees", "authId", "", "getAuthId", "()Ljava/lang/String;", "setAuthId", "(Ljava/lang/String;)V", "authScene", "getAuthScene", "setAuthScene", "value", "blockId", "getBlockId", "setBlockId", "bottomButtonState", "getBottomButtonState", "bottomButtonVisible", "getBottomButtonVisible", "bottomHasDraft", "getBottomHasDraft", "bottomUnFollowDialog", "getBottomUnFollowDialog", "callbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "canComplete", "getCanComplete", "()Z", "canDelete", "getCanDelete", "canQuit", "getCanQuit", "canRead", "getCanRead", "chatId", "chatIdForAddAssignee", "getChatIdForAddAssignee", "setChatIdForAddAssignee", "chatIdForAddUser", "getChatIdForAddUser", "commentAtUserInfo", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentAtUserInfo;", "getCommentAtUserInfo", "commentDraftLv", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentDraftInfo;", "getCommentDraftLv", "commentHasMore", "getCommentHasMore", "commentInitChatId", "getCommentInitChatId", "commentInsertAtTag", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AtChatterBean;", "getCommentInsertAtTag", "commentIsEmpty", "getCommentIsEmpty", "commentIsLoading", "getCommentIsLoading", "commentKeyboardVisible", "getCommentKeyboardVisible", "commentLoadingFailed", "getCommentLoadingFailed", "commentLoadingMore", "getCommentLoadingMore", "commentLv", "", "Lcom/bytedance/lark/pb/todo/v1/TodoComment;", "getCommentLv", "setCommentLv", "commentPanelInfo", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentPanelInfo;", "getCommentPanelInfo", "commentShowRichText", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/RichTextShowBean;", "getCommentShowRichText", "setCommentShowRichText", "createFromMessageToolbar", "getCreateFromMessageToolbar", "createIconState", "getCreateIconState", "createTodoScene", "Lcom/bytedance/lark/pb/todo/v1/DraftScene$Scene;", "Lcom/ss/android/lark/todo/impl/rustadapter/CreateTodoScene;", "getCreateTodoScene", "()Lcom/bytedance/lark/pb/todo/v1/DraftScene$Scene;", "creatorId", "getCreatorId", "setCreatorId", "creatorInfo", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CreatorInfo;", "getCreatorInfo", "descriptionClearFocus", "getDescriptionClearFocus", "descriptionFragmentInsertAtTag", "getDescriptionFragmentInsertAtTag", "descriptionInfo", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DescriptionInfo;", "getDescriptionInfo", "descriptionInit", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DescriptionInit;", "getDescriptionInit", "descriptionInsertAtTag", "getDescriptionInsertAtTag", "descriptionPasteDoc", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DocPasteBean;", "getDescriptionPasteDoc", "descriptionPasteUrl", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/UrlPasteBean;", "getDescriptionPasteUrl", "setDescriptionPasteUrl", "descriptionShowRichText", "getDescriptionShowRichText", "dispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "dispatcher$delegate", "Lkotlin/Lazy;", "docEntityD", "Ljava/util/HashMap;", "Lcom/ss/android/lark/doc/entity/Doc;", "Lkotlin/collections/HashMap;", "docEntityT", "editCommentInfo", "Lkotlin/Pair;", "getEditCommentInfo", "followerFragmentShowAdd", "getFollowerFragmentShowAdd", "followerIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getFollowerIds", "()Ljava/util/ArrayList;", "followerList", "Lcom/bytedance/lark/pb/todo/v1/TodoFollower;", "getFollowerList", "()Ljava/util/List;", "followers", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/FollowerBean;", "getFollowers", "guid", "getGuid", "setGuid", "hasValidTodo", "getHasValidTodo", "setHasValidTodo", "(Z)V", "historyHasMore", "getHistoryHasMore", "historyIsLoading", "getHistoryIsLoading", "historyRecords", "Lcom/bytedance/lark/pb/todo/v1/Record;", "getHistoryRecords", "initAtController", "getInitAtController", "setInitAtController", "initComment", "getInitComment", "isComplete", "isCreateFromMessage", "setCreateFromMessage", "isCreateFromMultiMessage", "setCreateFromMultiMessage", "isCreateTodo", "setCreateTodo", "isCreator", "isDeleted", "isEditable", "isFinishAfterCreate", "isFromTodoTab", "setFromTodoTab", "isInLineSummaryChanged", "setInLineSummaryChanged", "isMultiStrategyFg", "isShouldFastCreate", "setShouldFastCreate", "isShowCreateAndSend", "isSummaryChanged", "setSummaryChanged", "keyboardSummaryClearFocus", "getKeyboardSummaryClearFocus", "keyboardSummaryRequestFocus", "getKeyboardSummaryRequestFocus", "leftIconState", "getLeftIconState", "loading", "getLoading", "setLoading", "(Lcom/larksuite/framework/section/utils/MutableLiveDataPlus;)V", "mTodoSettingPushNotification", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "messageId", "getMessageId", "setMessageId", "messageSceneType", "Lcom/larksuite/component/blockit/entity/BlockExtra$SceneType;", "moreIconShow", "getMoreIconShow", "moreIconState", "getMoreIconState", "multiMessageList", "needMergeMessage", "needUpdate", "getNeedUpdate", "setNeedUpdate", "needUpdateAssignee", "getNeedUpdateAssignee", "needUpdateBottom", "getNeedUpdateBottom", "needUpdateFollower", "getNeedUpdateFollower", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "oldTodo", "getOldTodo", "()Lcom/bytedance/lark/pb/todo/v1/Todo;", "setOldTodo", "(Lcom/bytedance/lark/pb/todo/v1/Todo;)V", "pageLoading", "getPageLoading", "preRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "referResourceId", "getReferResourceId", "setReferResourceId", "referResourceLv", "Lcom/bytedance/lark/pb/todo/v1/TodoReferResource;", "getReferResourceLv", "setReferResourceLv", "replyCommentInfo", "getReplyCommentInfo", "richTextC", "richTextComment", "getRichTextComment", "()Lcom/ss/android/lark/widget/richtext/RichText;", "setRichTextComment", "(Lcom/ss/android/lark/widget/richtext/RichText;)V", "richTextD", "richTextDescription", "getRichTextDescription", "setRichTextDescription", "richTextDocDescriptionLv2", "getRichTextDocDescriptionLv2", "setRichTextDocDescriptionLv2", "richTextSummary", "getRichTextSummary", "setRichTextSummary", "richTextT", "richTextUrlDescriptionLv2", "getRichTextUrlDescriptionLv2", "setRichTextUrlDescriptionLv2", "scrollToBottomOfComments", "getScrollToBottomOfComments", "setScrollToBottomOfComments", "selfDisplayCompleteOrigin", "getSelfDisplayCompleteOrigin", "()Ljava/lang/Boolean;", "setSelfDisplayCompleteOrigin", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "shareEntity", "Lcom/ss/android/lark/todo/impl/features/common/share/entity/ShareEntity;", "getShareEntity", "setShareEntity", "shareIconShow", "getShareIconShow", "showRemoveReminderDialog", "getShowRemoveReminderDialog", "setShowRemoveReminderDialog", "showRevokeAssignee", "getShowRevokeAssignee", "state", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoKeyboardViewModel$State;", "getState", "summaryClearFocus", "getSummaryClearFocus", "summaryHideKeyboard", "getSummaryHideKeyboard", "summaryInfo", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/SummaryInfo;", "getSummaryInfo", "summaryInit", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/SummaryInit;", "getSummaryInit", "summaryInlineInfo", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/SummaryInlineInfo;", "getSummaryInlineInfo", "summaryInlineShowRichText", "getSummaryInlineShowRichText", "summaryInsertAtTag", "getSummaryInsertAtTag", "setSummaryInsertAtTag", "summaryKeyboardInsertAtTag", "getSummaryKeyboardInsertAtTag", "setSummaryKeyboardInsertAtTag", "summaryPasteDoc", "getSummaryPasteDoc", "summaryPasteUrl", "getSummaryPasteUrl", "setSummaryPasteUrl", "summaryRequestFocus", "getSummaryRequestFocus", "summaryShowRichText", "getSummaryShowRichText", "summaryStrikeThrough", "getSummaryStrikeThrough", "timeBean", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TimeBean;", "getTimeBean", "timeButtonShow", "getTimeButtonShow", "timeFragment", "getTimeFragment", "timeInfo", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TimeInfo;", "getTimeInfo", "toast", "Lcom/ss/android/lark/todo/impl/framework/architecture/Event;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/data/TodoToastUnit;", "getToast", "toastInfo", "getToastInfo", "toastStringResId", "getToastStringResId", "setToastStringResId", "todoBuilder", "Lcom/bytedance/lark/pb/todo/v1/Todo$Builder;", "getTodoBuilder", "()Lcom/bytedance/lark/pb/todo/v1/Todo$Builder;", "setTodoBuilder", "(Lcom/bytedance/lark/pb/todo/v1/Todo$Builder;)V", "todoItemPermission", "Lcom/bytedance/lark/pb/todo/v1/TodoItemPermission;", "getTodoItemPermission", "()Lcom/bytedance/lark/pb/todo/v1/TodoItemPermission;", "todoOrigin", "Lcom/bytedance/lark/pb/todo/v1/TodoOrigin;", "getTodoOrigin", "()Lcom/bytedance/lark/pb/todo/v1/TodoOrigin;", "todoReferResource", "todoSceneType", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoSceneType;", "todoSource", "Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "getTodoSource", "()Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "todoSourceHref", "Lcom/bytedance/lark/pb/todo/v1/TodoSourceHref;", "getTodoSourceHref", "()Lcom/bytedance/lark/pb/todo/v1/TodoSourceHref;", "updateAssigneeFragment", "getUpdateAssigneeFragment", "setUpdateAssigneeFragment", "updateFollowerFragment", "getUpdateFollowerFragment", "setUpdateFollowerFragment", "urlFakePreviewIdsD", "urlFakePreviewIdsT", "urlHangPointsD", "Lcom/bytedance/lark/pb/basic/v1/UrlPreviewHangPoint;", "urlHangPointsT", "urlPreviewEnable", "getUrlPreviewEnable", "urlPreviewEnable$delegate", "urlPreviewsD", "Lcom/ss/android/lark/chat/entity/preview/NetUrlPreviewEntity;", "urlPreviewsT", "addAssigneesFromAtUsers", "", "parentMsgSenderId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addNewAssignees", "assigneeIds", "isUserAdded", "fastCreate", "(Ljava/util/List;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addNewFollowers", "(Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "basicTodoBuilder", "checkAtUserInAssignees", "checkHasReferResource", "createKeyBoardTodo", "closeActivity", "createTodo", "shareToChat", "deleteTodo", "generateAnchorFromMessage", "richText", "getAssigneeBean", "userId", "getCreateChatId", "getReferResource", "getRemoteSettingData", "getShareTodo", "getTodo", "getTodoAssignee", "Lcom/bytedance/lark/pb/todo/v1/TodoAssignee;", "handleCreateFromMessage", "handleFromMessage", "text", "docEntityMap", "initReminder", "Lcom/bytedance/lark/pb/todo/v1/TodoReminder;", "initRichTextForEdit", "initRichTextForEditDescription", "initRichTextForEditTitle", "initTodoSetting", "insertDocIntoDescriptionMap", "id", "doc", "insertDocIntoMap", "insertUrlIntoDescriptionMap", "urlPreview", "insertUrlIntoMap", "isChatCreateAndSend", "isChatKeyboardCreateTodo", "isFollowed", "isFromDoc", "isOutUser", "isSelfCreator", "judgeCanEdit", "judgeCanQuite", "logTodoDetailOnScreenShot", "mergeMessage", "onCleared", "parseAssigneePickerData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "quitTodo", "refreshComment", "registerTodoSettingPush", "replaceAtUsersToRealName", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reset", "restoreDraft", "saveDraft", "shareTodo", "chatIds", Comment.f24093e, "toastPrompt", "forceCommonToast", "unRegisterTodoSettingPush", "updateSelfPermissionForEdit", "updateTodo", "updateTodoMayError", "updateTodoRichText", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad */
public class TodoDetailModel extends AbstractC1142af implements ITodoKeyboardViewModel, ITodoDetailViewDataStore, ITodoDetailViewModel {
    public static final Companion Companion = new Companion(null);
    private C1177w<Boolean> activityFinished = new C1177w<>(false);
    private final C1177w<Boolean> allUsersCompletedDialog;
    private final C1177w<Boolean> allUsersUnCompletedDialog;
    private final MutableLiveDataPlus<Integer> assigneeFragmentShowAdd;
    private final MutableLiveDataPlus<Boolean> assigneeMultiStrategy;
    private final MutableLiveDataPlus<List<AssigneeBean>> assignees;
    private String authId;
    private String authScene;
    private final MutableLiveDataPlus<Integer> bottomButtonState;
    private final MutableLiveDataPlus<Boolean> bottomButtonVisible;
    private final C1177w<Boolean> bottomHasDraft;
    private final C1177w<Boolean> bottomUnFollowDialog;
    private final CallbackManager callbackManager;
    public String chatId;
    private String chatIdForAddAssignee;
    private final C1177w<CommentAtUserInfo> commentAtUserInfo;
    private final C1177w<CommentDraftInfo> commentDraftLv;
    private final C1177w<Boolean> commentHasMore;
    private final C1177w<String> commentInitChatId;
    private final C1177w<AtChatterBean> commentInsertAtTag;
    private final C1177w<Boolean> commentIsEmpty;
    private final C1177w<Boolean> commentIsLoading;
    private final C1177w<Boolean> commentKeyboardVisible;
    private final MutableLiveDataPlus<Boolean> commentLoadingFailed;
    private final C1177w<Boolean> commentLoadingMore;
    private C1177w<List<TodoComment>> commentLv;
    private final C1177w<CommentPanelInfo> commentPanelInfo;
    private C1177w<RichTextShowBean> commentShowRichText;
    private final MutableLiveDataPlus<Integer> createIconState;
    private String creatorId;
    private final C1177w<CreatorInfo> creatorInfo;
    private final C1177w<Boolean> descriptionClearFocus;
    private final C1177w<AtChatterBean> descriptionFragmentInsertAtTag;
    private final C1177w<DescriptionInfo> descriptionInfo;
    private final C1177w<DescriptionInit> descriptionInit;
    private final C1177w<AtChatterBean> descriptionInsertAtTag;
    private final C1177w<DocPasteBean> descriptionPasteDoc;
    private C1177w<UrlPasteBean> descriptionPasteUrl;
    private final C1177w<RichTextShowBean> descriptionShowRichText;
    private final Lazy dispatcher$delegate;
    public HashMap<String, Doc> docEntityD;
    private HashMap<String, Doc> docEntityT;
    private final C1177w<Pair<Integer, TodoComment>> editCommentInfo;
    private final MutableLiveDataPlus<Boolean> followerFragmentShowAdd;
    private final MutableLiveDataPlus<List<FollowerBean>> followers;
    private String guid;
    private boolean hasValidTodo;
    private final C1177w<Boolean> historyHasMore;
    private final MutableLiveDataPlus<Boolean> historyIsLoading;
    private final C1177w<List<Record>> historyRecords;
    private C1177w<String> initAtController;
    private final MutableLiveDataPlus<Boolean> initComment;
    private boolean isCreateFromMessage;
    private boolean isCreateFromMultiMessage;
    private boolean isCreateTodo;
    private final MutableLiveDataPlus<Boolean> isCreator;
    public boolean isFinishAfterCreate;
    private boolean isFromTodoTab;
    private boolean isInLineSummaryChanged;
    public final boolean isMultiStrategyFg;
    private boolean isShouldFastCreate;
    private boolean isSummaryChanged;
    private final C1177w<Boolean> keyboardSummaryClearFocus;
    private final C1177w<Boolean> keyboardSummaryRequestFocus;
    private final MutableLiveDataPlus<Integer> leftIconState;
    private MutableLiveDataPlus<Boolean> loading = new MutableLiveDataPlus<>();
    private TodoPushHandleCallBack mTodoSettingPushNotification;
    private String messageId;
    public BlockExtra.SceneType messageSceneType;
    private final MutableLiveDataPlus<Boolean> moreIconShow;
    private final MutableLiveDataPlus<Integer> moreIconState;
    public List<String> multiMessageList;
    public boolean needMergeMessage;
    private C1177w<Boolean> needUpdate = new C1177w<>(false);
    private final C1177w<Boolean> needUpdateAssignee = new C1177w<>(false);
    private final C1177w<Boolean> needUpdateBottom;
    private final C1177w<Boolean> needUpdateFollower;
    private Todo oldTodo;
    private final C1177w<Boolean> pageLoading;
    public RichText preRichText;
    private String referResourceId;
    private C1177w<TodoReferResource> referResourceLv;
    private final C1177w<Pair<Integer, TodoComment>> replyCommentInfo;
    private RichText richTextC;
    public RichText richTextD;
    private C1177w<Doc> richTextDocDescriptionLv2;
    public RichText richTextT;
    private C1177w<List<String>> richTextUrlDescriptionLv2;
    private C1177w<Pair<Integer, Boolean>> scrollToBottomOfComments;
    private Boolean selfDisplayCompleteOrigin;
    private C1177w<ShareEntity> shareEntity;
    private final MutableLiveDataPlus<Boolean> shareIconShow;
    private C1177w<Integer> showRemoveReminderDialog;
    private final C1177w<Boolean> showRevokeAssignee;
    private final C1177w<ITodoKeyboardViewModel.State> state = new C1177w<>(ITodoKeyboardViewModel.State.Unknown);
    private final C1177w<Boolean> summaryClearFocus;
    private final C1177w<Boolean> summaryHideKeyboard;
    private final C1177w<SummaryInfo> summaryInfo;
    private final C1177w<SummaryInit> summaryInit;
    private final C1177w<SummaryInlineInfo> summaryInlineInfo;
    private final MutableLiveDataPlus<RichTextShowBean> summaryInlineShowRichText;
    private C1177w<AtChatterBean> summaryInsertAtTag;
    private C1177w<AtChatterBean> summaryKeyboardInsertAtTag;
    private final C1177w<DocPasteBean> summaryPasteDoc;
    private C1177w<UrlPasteBean> summaryPasteUrl;
    private final C1177w<Boolean> summaryRequestFocus;
    private final MutableLiveDataPlus<RichTextShowBean> summaryShowRichText;
    private final C1177w<Boolean> summaryStrikeThrough;
    private final C1177w<TimeBean> timeBean;
    private final C1177w<Boolean> timeButtonShow;
    private final C1177w<Boolean> timeFragment;
    private final C1177w<TimeInfo> timeInfo;
    private final C1177w<Event<TodoToastUnit>> toast;
    private final C1177w<Event<Integer>> toastInfo;
    private C1177w<Integer> toastStringResId = new C1177w<>();
    private Todo.C19637a todoBuilder;
    public TodoReferResource todoReferResource;
    public TodoSceneType todoSceneType;
    private C1177w<Boolean> updateAssigneeFragment = new C1177w<>();
    private C1177w<Boolean> updateFollowerFragment = new C1177w<>();
    private ArrayList<String> urlFakePreviewIdsD;
    private ArrayList<String> urlFakePreviewIdsT;
    private HashMap<String, UrlPreviewHangPoint> urlHangPointsD;
    private HashMap<String, UrlPreviewHangPoint> urlHangPointsT;
    private final Lazy urlPreviewEnable$delegate;
    private HashMap<String, NetUrlPreviewEntity> urlPreviewsD;
    private HashMap<String, NetUrlPreviewEntity> urlPreviewsT;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, d2 = {"addAssigneesFromAtUsers", "", "parentMsgSenderId", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel", mo239173f = "TodoDetailModel.kt", mo239174i = {0, 0, 0, 0}, mo239175l = {645}, mo239176m = "addAssigneesFromAtUsers", mo239177n = {"this", "parentMsgSenderId", "atIds", "atUserIds"}, mo239178s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$c */
    public static final class C56742c extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoDetailModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56742c(TodoDetailModel adVar, Continuation cVar) {
            super(cVar);
            this.this$0 = adVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.addAssigneesFromAtUsers(null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH@"}, d2 = {"addNewAssignees", "", "assigneeIds", "", "", "isUserAdded", "", "fastCreate", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel", mo239173f = "TodoDetailModel.kt", mo239174i = {0, 0, 0, 0}, mo239175l = {983}, mo239176m = "addNewAssignees", mo239177n = {"this", "assigneeIds", "isUserAdded", "fastCreate"}, mo239178s = {"L$0", "L$1", "Z$0", "Z$1"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$d */
    public static final class C56743d extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoDetailModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56743d(TodoDetailModel adVar, Continuation cVar) {
            super(cVar);
            this.this$0 = adVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.addNewAssignees(null, false, false, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH@"}, d2 = {"addNewFollowers", "", "followerIds", "", "", "isUserAdded", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel", mo239173f = "TodoDetailModel.kt", mo239174i = {0, 0, 0}, mo239175l = {1007}, mo239176m = "addNewFollowers", mo239177n = {"this", "followerIds", "isUserAdded"}, mo239178s = {"L$0", "L$1", "Z$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$g */
    public static final class C56746g extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoDetailModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56746g(TodoDetailModel adVar, Continuation cVar) {
            super(cVar);
            this.this$0 = adVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.addNewFollowers(null, false, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"replaceAtUsersToRealName", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel", mo239173f = "TodoDetailModel.kt", mo239174i = {0, 0, 0}, mo239175l = {664}, mo239176m = "replaceAtUsersToRealName", mo239177n = {"this", "atIds", "atUserIds"}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$u */
    public static final class C56760u extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoDetailModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56760u(TodoDetailModel adVar, Continuation cVar) {
            super(cVar);
            this.this$0 = adVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.replaceAtUsersToRealName(this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H@"}, d2 = {"updateTodoMayError", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/bytedance/lark/pb/todo/v1/Todo;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel", mo239173f = "TodoDetailModel.kt", mo239174i = {0}, mo239175l = {847}, mo239176m = "updateTodoMayError", mo239177n = {"this"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$z */
    public static final class C56765z extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoDetailModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56765z(TodoDetailModel adVar, Continuation cVar) {
            super(cVar);
            this.this$0 = adVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.updateTodoMayError(this);
        }
    }

    private final void checkAtUserInAssignees(boolean z) {
    }

    private final boolean getUrlPreviewEnable() {
        return ((Boolean) this.urlPreviewEnable$delegate.getValue()).booleanValue();
    }

    public final ExecutorCoroutineDispatcher getDispatcher() {
        return (ExecutorCoroutineDispatcher) this.dispatcher$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel$Companion;", "", "()V", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel$registerTodoSettingPush$1", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "onPush", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$t */
    public static final class C56759t implements TodoPushHandleCallBack {
        C56759t() {
        }

        @Override // com.ss.android.lark.todo.impl.rustadapter.push.TodoPushHandleCallBack
        /* renamed from: a */
        public void mo191795a(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("TodoDetailModel", LogMessageUtil.f139260a.mo191769b("todo_setting_push"));
            Object obj = jSONObject.get("todo_setting_push");
            if (obj != null) {
                Intrinsics.checkExpressionValueIsNotNull(obj, "data[TodoPushConstants.K…S_TODO_SETTING] ?: return");
                if (obj instanceof TodoSetting) {
                    TodoSettingData aVar = TodoSettingData.f141010a;
                    Integer num = ((TodoSetting) obj).due_reminder_offset;
                    Intrinsics.checkExpressionValueIsNotNull(num, "pushData.due_reminder_offset");
                    aVar.mo194068a(num.intValue());
                }
            }
        }
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    public C1177w<Boolean> getActivityFinished() {
        return this.activityFinished;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.IBottomViewDataStore
    public C1177w<Boolean> getAllUsersCompletedDialog() {
        return this.allUsersCompletedDialog;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.IBottomViewDataStore
    public C1177w<Boolean> getAllUsersUnCompletedDialog() {
        return this.allUsersUnCompletedDialog;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public MutableLiveDataPlus<Integer> getAssigneeFragmentShowAdd() {
        return this.assigneeFragmentShowAdd;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public MutableLiveDataPlus<Boolean> getAssigneeMultiStrategy() {
        return this.assigneeMultiStrategy;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public MutableLiveDataPlus<List<AssigneeBean>> getAssignees() {
        return this.assignees;
    }

    public String getAuthId() {
        return this.authId;
    }

    public String getAuthScene() {
        return this.authScene;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.IBottomViewDataStore
    public MutableLiveDataPlus<Integer> getBottomButtonState() {
        return this.bottomButtonState;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.IBottomViewDataStore
    public MutableLiveDataPlus<Boolean> getBottomButtonVisible() {
        return this.bottomButtonVisible;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.IBottomViewDataStore
    public C1177w<Boolean> getBottomHasDraft() {
        return this.bottomHasDraft;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.IBottomViewDataStore
    public C1177w<Boolean> getBottomUnFollowDialog() {
        return this.bottomUnFollowDialog;
    }

    public String getChatIdForAddAssignee() {
        return this.chatIdForAddAssignee;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.comment.ICommentViewDataStore
    public C1177w<CommentAtUserInfo> getCommentAtUserInfo() {
        return this.commentAtUserInfo;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.comment.ICommentViewDataStore
    public C1177w<CommentDraftInfo> getCommentDraftLv() {
        return this.commentDraftLv;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.comment.ICommentViewDataStore
    public C1177w<Boolean> getCommentHasMore() {
        return this.commentHasMore;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.comment.ICommentViewDataStore
    public C1177w<String> getCommentInitChatId() {
        return this.commentInitChatId;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<AtChatterBean> getCommentInsertAtTag() {
        return this.commentInsertAtTag;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.comment.ICommentViewDataStore
    public C1177w<Boolean> getCommentIsEmpty() {
        return this.commentIsEmpty;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.comment.ICommentViewDataStore
    public C1177w<Boolean> getCommentIsLoading() {
        return this.commentIsLoading;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.comment.ICommentViewDataStore
    public C1177w<Boolean> getCommentKeyboardVisible() {
        return this.commentKeyboardVisible;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.comment.ICommentViewDataStore
    public MutableLiveDataPlus<Boolean> getCommentLoadingFailed() {
        return this.commentLoadingFailed;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.comment.ICommentViewDataStore
    public C1177w<Boolean> getCommentLoadingMore() {
        return this.commentLoadingMore;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.comment.ICommentViewDataStore
    public C1177w<List<TodoComment>> getCommentLv() {
        return this.commentLv;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.comment.ICommentViewDataStore
    public C1177w<CommentPanelInfo> getCommentPanelInfo() {
        return this.commentPanelInfo;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.comment.ICommentViewDataStore
    public C1177w<RichTextShowBean> getCommentShowRichText() {
        return this.commentShowRichText;
    }

    public String getCreateChatId() {
        return this.chatId;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITitleBarViewDataStore
    public MutableLiveDataPlus<Integer> getCreateIconState() {
        return this.createIconState;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.comment.ICommentViewDataStore
    public C1177w<CreatorInfo> getCreatorInfo() {
        return this.creatorInfo;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<Boolean> getDescriptionClearFocus() {
        return this.descriptionClearFocus;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<AtChatterBean> getDescriptionFragmentInsertAtTag() {
        return this.descriptionFragmentInsertAtTag;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<DescriptionInfo> getDescriptionInfo() {
        return this.descriptionInfo;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<DescriptionInit> getDescriptionInit() {
        return this.descriptionInit;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<AtChatterBean> getDescriptionInsertAtTag() {
        return this.descriptionInsertAtTag;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<DocPasteBean> getDescriptionPasteDoc() {
        return this.descriptionPasteDoc;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<UrlPasteBean> getDescriptionPasteUrl() {
        return this.descriptionPasteUrl;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<RichTextShowBean> getDescriptionShowRichText() {
        return this.descriptionShowRichText;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.comment.ICommentViewDataStore
    public C1177w<Pair<Integer, TodoComment>> getEditCommentInfo() {
        return this.editCommentInfo;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public MutableLiveDataPlus<Boolean> getFollowerFragmentShowAdd() {
        return this.followerFragmentShowAdd;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public MutableLiveDataPlus<List<FollowerBean>> getFollowers() {
        return this.followers;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel, com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public String getGuid() {
        return this.guid;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    public boolean getHasValidTodo() {
        return this.hasValidTodo;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<Boolean> getHistoryHasMore() {
        return this.historyHasMore;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public MutableLiveDataPlus<Boolean> getHistoryIsLoading() {
        return this.historyIsLoading;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<List<Record>> getHistoryRecords() {
        return this.historyRecords;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<String> getInitAtController() {
        return this.initAtController;
    }

    public MutableLiveDataPlus<Boolean> getInitComment() {
        return this.initComment;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<Boolean> getKeyboardSummaryClearFocus() {
        return this.keyboardSummaryClearFocus;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<Boolean> getKeyboardSummaryRequestFocus() {
        return this.keyboardSummaryRequestFocus;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITitleBarViewDataStore
    public MutableLiveDataPlus<Integer> getLeftIconState() {
        return this.leftIconState;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    public MutableLiveDataPlus<Boolean> getLoading() {
        return this.loading;
    }

    public String getMessageId() {
        return this.messageId;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITitleBarViewDataStore
    public MutableLiveDataPlus<Boolean> getMoreIconShow() {
        return this.moreIconShow;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITitleBarViewDataStore
    public MutableLiveDataPlus<Integer> getMoreIconState() {
        return this.moreIconState;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    public C1177w<Boolean> getNeedUpdate() {
        return this.needUpdate;
    }

    public C1177w<Boolean> getNeedUpdateAssignee() {
        return this.needUpdateAssignee;
    }

    public C1177w<Boolean> getNeedUpdateBottom() {
        return this.needUpdateBottom;
    }

    public C1177w<Boolean> getNeedUpdateFollower() {
        return this.needUpdateFollower;
    }

    public final Todo getOldTodo() {
        return this.oldTodo;
    }

    public C1177w<Boolean> getPageLoading() {
        return this.pageLoading;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    public C1177w<TodoReferResource> getReferResourceLv() {
        return this.referResourceLv;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.comment.ICommentViewDataStore
    public C1177w<Pair<Integer, TodoComment>> getReplyCommentInfo() {
        return this.replyCommentInfo;
    }

    public C1177w<Doc> getRichTextDocDescriptionLv2() {
        return this.richTextDocDescriptionLv2;
    }

    public C1177w<List<String>> getRichTextUrlDescriptionLv2() {
        return this.richTextUrlDescriptionLv2;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.comment.ICommentViewDataStore
    public C1177w<Pair<Integer, Boolean>> getScrollToBottomOfComments() {
        return this.scrollToBottomOfComments;
    }

    public final Boolean getSelfDisplayCompleteOrigin() {
        return this.selfDisplayCompleteOrigin;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    public C1177w<ShareEntity> getShareEntity() {
        return this.shareEntity;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITitleBarViewDataStore
    public MutableLiveDataPlus<Boolean> getShareIconShow() {
        return this.shareIconShow;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITitleBarViewDataStore
    public C1177w<Integer> getShowRemoveReminderDialog() {
        return this.showRemoveReminderDialog;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<Boolean> getShowRevokeAssignee() {
        return this.showRevokeAssignee;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoKeyboardViewModel
    public C1177w<ITodoKeyboardViewModel.State> getState() {
        return this.state;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<Boolean> getSummaryClearFocus() {
        return this.summaryClearFocus;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<Boolean> getSummaryHideKeyboard() {
        return this.summaryHideKeyboard;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<SummaryInfo> getSummaryInfo() {
        return this.summaryInfo;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<SummaryInit> getSummaryInit() {
        return this.summaryInit;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<SummaryInlineInfo> getSummaryInlineInfo() {
        return this.summaryInlineInfo;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public MutableLiveDataPlus<RichTextShowBean> getSummaryInlineShowRichText() {
        return this.summaryInlineShowRichText;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<AtChatterBean> getSummaryInsertAtTag() {
        return this.summaryInsertAtTag;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<AtChatterBean> getSummaryKeyboardInsertAtTag() {
        return this.summaryKeyboardInsertAtTag;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<DocPasteBean> getSummaryPasteDoc() {
        return this.summaryPasteDoc;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<UrlPasteBean> getSummaryPasteUrl() {
        return this.summaryPasteUrl;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<Boolean> getSummaryRequestFocus() {
        return this.summaryRequestFocus;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public MutableLiveDataPlus<RichTextShowBean> getSummaryShowRichText() {
        return this.summaryShowRichText;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<Boolean> getSummaryStrikeThrough() {
        return this.summaryStrikeThrough;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<TimeBean> getTimeBean() {
        return this.timeBean;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<Boolean> getTimeButtonShow() {
        return this.timeButtonShow;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<Boolean> getTimeFragment() {
        return this.timeFragment;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<TimeInfo> getTimeInfo() {
        return this.timeInfo;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public C1177w<Event<TodoToastUnit>> getToast() {
        return this.toast;
    }

    public C1177w<Event<Integer>> getToastInfo() {
        return this.toastInfo;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    public C1177w<Integer> getToastStringResId() {
        return this.toastStringResId;
    }

    public final Todo.C19637a getTodoBuilder() {
        return this.todoBuilder;
    }

    public C1177w<Boolean> getUpdateAssigneeFragment() {
        return this.updateAssigneeFragment;
    }

    public C1177w<Boolean> getUpdateFollowerFragment() {
        return this.updateFollowerFragment;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    public boolean isCreateFromMessage() {
        return this.isCreateFromMessage;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    public boolean isCreateFromMultiMessage() {
        return this.isCreateFromMultiMessage;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    public boolean isCreateTodo() {
        return this.isCreateTodo;
    }

    public MutableLiveDataPlus<Boolean> isCreator() {
        return this.isCreator;
    }

    public boolean isFromTodoTab() {
        return this.isFromTodoTab;
    }

    public final boolean isInLineSummaryChanged() {
        return this.isInLineSummaryChanged;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    public boolean isShouldFastCreate() {
        return this.isShouldFastCreate;
    }

    public final boolean isSummaryChanged() {
        return this.isSummaryChanged;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel$1$12"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$a */
    static final class RunnableC56740a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f140148a;

        /* renamed from: b */
        final /* synthetic */ TodoDetailModel f140149b;

        RunnableC56740a(String str, TodoDetailModel adVar) {
            this.f140148a = str;
            this.f140149b = adVar;
        }

        public final void run() {
            this.f140149b.handleCreateFromMessage(this.f140148a);
        }
    }

    private final void initRichTextForEdit() {
        initRichTextForEditTitle();
        initRichTextForEditDescription();
    }

    private final void initTodoSetting() {
        registerTodoSettingPush();
        getRemoteSettingData();
    }

    public boolean getCanQuit() {
        return judgeCanQuite();
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoKeyboardViewModel
    public boolean getCreateFromMessageToolbar() {
        return isChatKeyboardCreateTodo();
    }

    public TodoItemPermission getTodoItemPermission() {
        return this.todoBuilder.f48031m;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    public TodoOrigin getTodoOrigin() {
        return this.todoBuilder.f48016C;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    public TodoSource getTodoSource() {
        return this.todoBuilder.f48024f;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    public TodoSourceHref getTodoSourceHref() {
        return this.todoBuilder.f48015B;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoKeyboardViewModel
    public boolean isShowCreateAndSend() {
        return isChatCreateAndSend();
    }

    private final void unRegisterTodoSettingPush() {
        TodoPushHandleCallBack bVar = this.mTodoSettingPushNotification;
        if (bVar != null) {
            TodoPushProcess.f141135a.mo194372b(Command.PUSH_TODO_SETTING_CHANGE_NOTIFICATION, bVar);
        }
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    public boolean getCanRead() {
        Boolean bool = this.todoBuilder.f48031m.is_readable;
        Intrinsics.checkExpressionValueIsNotNull(bool, "todoBuilder.self_permission.is_readable");
        return bool.booleanValue();
    }

    public C1177w<String> getChatIdForAddUser() {
        return new C1177w<>(getChatIdForAddAssignee());
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore
    public String getCreatorId() {
        String str = this.todoBuilder.f48035q;
        if (str != null) {
            return str;
        }
        return "";
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    public String getReferResourceId() {
        List<String> list = this.todoBuilder.f48043y;
        Intrinsics.checkExpressionValueIsNotNull(list, "todoBuilder.refer_resource_ids");
        return (String) CollectionsKt.firstOrNull((List) list);
    }

    public RichText getRichTextComment() {
        C56478e.m220171b(this.richTextC, null);
        return this.richTextC;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        super.onCleared();
        this.callbackManager.cancelCallbacks();
        unRegisterTodoSettingPush();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$aa */
    static final class C56741aa extends Lambda implements Function0<Boolean> {
        public static final C56741aa INSTANCE = new C56741aa();

        C56741aa() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return TodoDependencyHolder.f139242a.mo191731b().mo191933f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$k */
    static final class C56750k extends Lambda implements Function0<ExecutorCoroutineDispatcher> {
        public static final C56750k INSTANCE = new C56750k();

        C56750k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ExecutorCoroutineDispatcher invoke() {
            ExecutorService newSerialIODensityThreadPool = CoreThreadPool.getDefault().newSerialIODensityThreadPool("lk-todo-detail");
            Intrinsics.checkExpressionValueIsNotNull(newSerialIODensityThreadPool, "CoreThreadPool.getDefaul…eadPool(\"lk-todo-detail\")");
            return bl.m266382a(newSerialIODensityThreadPool);
        }
    }

    private final void getReferResource() {
        String referResourceId2 = getReferResourceId();
        if (referResourceId2 != null) {
            Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56751l(referResourceId2, null, this), 2, null);
        }
    }

    private final void getShareTodo() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56753n(this, null), 2, null);
    }

    private final void getTodo() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56754o(this, null), 2, null);
    }

    private final boolean isChatCreateAndSend() {
        if (this.todoSceneType == TodoSceneType.MESSAGE_TOOLBAR || this.todoSceneType == TodoSceneType.INPUT_BOX || this.todoSceneType == TodoSceneType.CHAT_TODO_LIST) {
            return true;
        }
        return false;
    }

    private final void mergeMessage() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56756q(this, null), 2, null);
    }

    private final void registerTodoSettingPush() {
        this.mTodoSettingPushNotification = new C56759t();
        TodoPushProcess.f141135a.mo194371a(Command.PUSH_TODO_SETTING_CHANGE_NOTIFICATION, this.mTodoSettingPushNotification);
    }

    private final void updateSelfPermissionForEdit() {
        this.todoBuilder.f48031m = new TodoItemPermission.C19653a().mo66673a(false).mo66675b(false).mo66676c(false).build();
    }

    public final void checkHasReferResource() {
        String str;
        List<String> list;
        Todo todo = this.oldTodo;
        if (todo == null || (list = todo.refer_resource_ids) == null) {
            str = null;
        } else {
            str = (String) CollectionsKt.firstOrNull((List) list);
        }
        setReferResourceId(str);
        getReferResource();
    }

    public void deleteTodo() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56749j(this, null), 2, null);
    }

    public RichText getRichTextDescription() {
        C56478e.m220171b(this.richTextD, this.docEntityD);
        C56478e.m220170a(this.richTextT, this.urlHangPointsD, this.urlPreviewsD);
        return this.richTextD;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoKeyboardViewModel
    public RichText getRichTextSummary() {
        C56478e.m220171b(this.richTextT, this.docEntityT);
        C56478e.m220170a(this.richTextT, this.urlHangPointsT, this.urlPreviewsT);
        return this.richTextT;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    public boolean isChatKeyboardCreateTodo() {
        if (this.todoSceneType == TodoSceneType.MESSAGE_TOOLBAR || this.todoSceneType == TodoSceneType.INPUT_BOX) {
            return true;
        }
        return false;
    }

    public boolean isComplete() {
        if (this.todoBuilder.f48033o.longValue() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    public boolean isDeleted() {
        if (this.todoBuilder.f48034p.longValue() > 0) {
            return true;
        }
        return false;
    }

    public final boolean isFromDoc() {
        TodoSource todoSource = this.todoBuilder.f48024f;
        if (todoSource != null && C56766ae.f140154c[todoSource.ordinal()] == 1) {
            return true;
        }
        return false;
    }

    public final boolean isSelfCreator() {
        if (isCreateTodo()) {
            return true;
        }
        return Intrinsics.areEqual(TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a(), this.todoBuilder.f48035q);
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    public void logTodoDetailOnScreenShot() {
        TodoDetailLogHelper aVar = TodoDetailLogHelper.f139384a;
        Todo a = this.todoBuilder.build();
        Intrinsics.checkExpressionValueIsNotNull(a, "todoBuilder.build()");
        TodoDetailLogHelper.m219752a(aVar, a, "todo_detail", null, 4, null);
    }

    public void quitTodo() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56758s(this, null), 2, null);
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoKeyboardViewModel
    public void reset() {
        this.todoBuilder = basicTodoBuilder();
        RichText richText = null;
        this.richTextD = richText;
        this.richTextT = richText;
        HashMap<String, Doc> hashMap = null;
        this.docEntityD = hashMap;
        this.docEntityT = hashMap;
    }

    private final void getRemoteSettingData() {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("TodoDetailModel", LogMessageUtil.f139260a.mo191770b(valueOf, "getTodoSetting", new String[0]));
        TodoSettingService.f141012a.mo194071a(new C56752m(valueOf, "getTodoSetting"));
    }

    private final TodoReminder initReminder() {
        TodoReminder a = new TodoReminder.C19665a().mo66705a(Long.valueOf((long) TodoSettingData.f141010a.mo194067a())).mo66704a(TodoReminder.Type.RELATIVE).build();
        Intrinsics.checkExpressionValueIsNotNull(a, "TodoReminder.Builder()\n …\n                .build()");
        return a;
    }

    private final void restoreDraft() {
        if ((isShouldFastCreate() || isChatKeyboardCreateTodo()) && getCreateTodoScene() != DraftScene.Scene.UNKNOWN_SCENE) {
            Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56762w(this, null), 2, null);
        }
    }

    public final void createTodo() {
        boolean z;
        if (isCreateFromMessage() || isCreateFromMultiMessage()) {
            z = false;
        } else {
            z = true;
        }
        createTodo(z);
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    public String getBlockId() {
        TodoOrigin.Type type;
        if (this.todoBuilder.f48016C == null || (type = this.todoBuilder.f48016C.type) == null) {
            return null;
        }
        int i = C56766ae.f140152a[type.ordinal()];
        if (i == 1) {
            return this.todoBuilder.f48025g;
        }
        if (i != 2) {
            return null;
        }
        return this.todoBuilder.f48016C.block.id;
    }

    public boolean getCanComplete() {
        Boolean bool = this.todoBuilder.f48031m.is_editable;
        Intrinsics.checkExpressionValueIsNotNull(bool, "todoBuilder.self_permission.is_editable");
        if ((bool.booleanValue() || judgeCanEdit()) && !isDeleted()) {
            return true;
        }
        return false;
    }

    public boolean getCanDelete() {
        if (!Intrinsics.areEqual(TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a(), this.todoBuilder.f48035q) || isDeleted()) {
            return false;
        }
        return true;
    }

    public ArrayList<String> getFollowerIds() {
        List<TodoFollower> followerList = getFollowerList();
        ArrayList<String> arrayList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(followerList, 10));
        Iterator<T> it = followerList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().follower_id);
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    public boolean isEditable() {
        Boolean bool = this.todoBuilder.f48031m.is_editable;
        Intrinsics.checkExpressionValueIsNotNull(bool, "todoBuilder.self_permission.is_editable");
        if ((bool.booleanValue() || judgeCanEdit()) && !isDeleted()) {
            return true;
        }
        return false;
    }

    public boolean isFollowed() {
        String a = TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a();
        List<TodoFollower> followerList = getFollowerList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(followerList, 10));
        Iterator<T> it = followerList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().follower_id);
        }
        return arrayList.contains(a);
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoKeyboardViewModel, com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    public void saveDraft() {
        if ((isShouldFastCreate() || isChatKeyboardCreateTodo()) && getCreateTodoScene() != DraftScene.Scene.UNKNOWN_SCENE) {
            Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56763x(this, null), 2, null);
        }
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    public void updateTodo() {
        if (!isCreateTodo()) {
            Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56764y(this, null), 2, null);
        }
    }

    private final Todo.C19637a basicTodoBuilder() {
        Todo.C19637a aVar = new Todo.C19637a();
        aVar.f48019a = "";
        aVar.f48028j = 0L;
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        aVar.f48029k = timeZone.getID();
        aVar.f48030l = false;
        aVar.f48023e = CollectionsKt.mutableListOf(initReminder());
        aVar.f48033o = 0L;
        aVar.f48034p = 0L;
        aVar.f48031m = new TodoItemPermission.C19653a().mo66673a(true).mo66675b(true).mo66676c(true).build();
        return aVar;
    }

    private final void initRichTextForEditDescription() {
        com.bytedance.lark.pb.basic.v1.RichText richText;
        DocEntity docEntity;
        Map<String, UrlPreviewHangPoint> map;
        RichContent richContent = this.todoBuilder.f48014A;
        PreviewEntityPair previewEntityPair = null;
        if (richContent != null) {
            richText = richContent.rich_text;
        } else {
            richText = null;
        }
        RichText a = C56473b.m220117a(richText);
        Intrinsics.checkExpressionValueIsNotNull(a, "text");
        RichText.RichTextElements elements = a.getElements();
        RichContent richContent2 = this.todoBuilder.f48014A;
        if (richContent2 != null) {
            docEntity = richContent2.doc_entity;
        } else {
            docEntity = null;
        }
        HashMap<String, Doc> a2 = C56472a.m220113a(elements, docEntity);
        RichText a3 = C56478e.m220168a(this.todoBuilder.f48014A);
        if (!C59035h.m229210a(a3)) {
            this.richTextD = new RichText(a3);
        }
        this.docEntityD = a2;
        RichContent richContent3 = this.todoBuilder.f48014A;
        if (richContent3 != null) {
            map = richContent3.url_preview_hang_points;
        } else {
            map = null;
        }
        this.urlHangPointsD = ParserUrlPreviewHelper.m220167b(map);
        RichContent richContent4 = this.todoBuilder.f48014A;
        if (richContent4 != null) {
            previewEntityPair = richContent4.url_preview_entities;
        }
        this.urlPreviewsD = ParserUrlPreviewHelper.m220166a(previewEntityPair);
    }

    private final void initRichTextForEditTitle() {
        com.bytedance.lark.pb.basic.v1.RichText richText;
        DocEntity docEntity;
        Map<String, UrlPreviewHangPoint> map;
        RichContent richContent = this.todoBuilder.f48042x;
        PreviewEntityPair previewEntityPair = null;
        if (richContent != null) {
            richText = richContent.rich_text;
        } else {
            richText = null;
        }
        RichText a = C56473b.m220117a(richText);
        Intrinsics.checkExpressionValueIsNotNull(a, "text");
        RichText.RichTextElements elements = a.getElements();
        RichContent richContent2 = this.todoBuilder.f48042x;
        if (richContent2 != null) {
            docEntity = richContent2.doc_entity;
        } else {
            docEntity = null;
        }
        HashMap<String, Doc> a2 = C56472a.m220113a(elements, docEntity);
        RichText a3 = C56478e.m220168a(this.todoBuilder.f48042x);
        if (!C59035h.m229210a(a3)) {
            this.richTextT = new RichText(a3);
        }
        this.docEntityT = a2;
        RichContent richContent3 = this.todoBuilder.f48042x;
        if (richContent3 != null) {
            map = richContent3.url_preview_hang_points;
        } else {
            map = null;
        }
        this.urlHangPointsT = ParserUrlPreviewHelper.m220167b(map);
        RichContent richContent4 = this.todoBuilder.f48042x;
        if (richContent4 != null) {
            previewEntityPair = richContent4.url_preview_entities;
        }
        this.urlPreviewsT = ParserUrlPreviewHelper.m220166a(previewEntityPair);
    }

    private final boolean judgeCanQuite() {
        String a = TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a();
        List<TodoAssignee> list = this.todoBuilder.f48032n;
        Intrinsics.checkExpressionValueIsNotNull(list, "todoBuilder.assignees");
        List<TodoAssignee> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().assignee_id);
        }
        if (arrayList.contains(a)) {
            return true;
        }
        return false;
    }

    public final DraftScene.Scene getCreateTodoScene() {
        TodoSceneType todoSceneType2 = this.todoSceneType;
        if (todoSceneType2 == null) {
            return DraftScene.Scene.UNKNOWN_SCENE;
        }
        switch (C56766ae.f140155d[todoSceneType2.ordinal()]) {
            case 1:
                return DraftScene.Scene.CHAT;
            case 2:
                return DraftScene.Scene.CHAT;
            case 3:
                return DraftScene.Scene.CHAT;
            case 4:
                return DraftScene.Scene.CHAT;
            case 5:
                return DraftScene.Scene.CHAT;
            case 6:
                return DraftScene.Scene.CHAT_SIDEBAR;
            case 7:
                return DraftScene.Scene.TODO_CENTER;
            case 8:
                return DraftScene.Scene.TODO_CENTER;
            case 9:
                return DraftScene.Scene.TODO_CENTER;
            case 10:
                return DraftScene.Scene.TODO_CENTER;
            case 11:
                return DraftScene.Scene.TODO_CENTER;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return DraftScene.Scene.TODO_CENTER;
            case 13:
                return DraftScene.Scene.UNKNOWN_SCENE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public List<TodoFollower> getFollowerList() {
        ArrayList arrayList = new ArrayList(this.todoBuilder.f48044z);
        String a = TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a();
        ArrayList<TodoFollower> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (TodoFollower todoFollower : arrayList2) {
            arrayList3.add(todoFollower.follower_id);
        }
        ArrayList arrayList4 = arrayList3;
        if (arrayList4.contains(a)) {
            int indexOf = arrayList4.indexOf(a);
            arrayList.remove(indexOf);
            arrayList.add(0, (TodoFollower) arrayList.get(indexOf));
        }
        return arrayList;
    }

    public boolean judgeCanEdit() {
        String a = TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a();
        if (Intrinsics.areEqual(a, this.todoBuilder.f48035q)) {
            return true;
        }
        List<TodoAssignee> list = this.todoBuilder.f48032n;
        Intrinsics.checkExpressionValueIsNotNull(list, "todoBuilder.assignees");
        List<TodoAssignee> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().assignee_id);
        }
        if (arrayList.contains(a)) {
            return true;
        }
        return false;
    }

    public final void updateTodoRichText() {
        HashMap<String, UrlPreviewHangPoint> hashMap;
        HashMap<String, UrlPreviewHangPoint> hashMap2;
        Todo.C19637a aVar = this.todoBuilder;
        RichContent.C15157a a = new RichContent.C15157a().mo55253a(C56473b.m220114a(this.richTextT)).mo55251a(C56472a.m220112a(this.docEntityT));
        HashMap<String, UrlPreviewHangPoint> hashMap3 = this.urlHangPointsT;
        if (hashMap3 != null) {
            hashMap = hashMap3;
        } else {
            hashMap = MapsKt.emptyMap();
        }
        aVar.f48042x = a.mo55255a(hashMap).mo55252a(ParserUrlPreviewHelper.m220165a(this.urlPreviewsT)).mo55254a(this.urlFakePreviewIdsT).build();
        Todo.C19637a aVar2 = this.todoBuilder;
        RichContent.C15157a a2 = new RichContent.C15157a().mo55253a(C56473b.m220114a(this.richTextD)).mo55251a(C56472a.m220112a(this.docEntityD));
        HashMap<String, UrlPreviewHangPoint> hashMap4 = this.urlHangPointsD;
        if (hashMap4 != null) {
            hashMap2 = hashMap4;
        } else {
            hashMap2 = MapsKt.emptyMap();
        }
        aVar2.f48014A = a2.mo55255a(hashMap2).mo55252a(ParserUrlPreviewHelper.m220165a(this.urlPreviewsD)).mo55254a(this.urlFakePreviewIdsD).build();
    }

    public void setAuthId(String str) {
        this.authId = str;
    }

    public void setAuthScene(String str) {
        this.authScene = str;
    }

    public void setChatIdForAddAssignee(String str) {
        this.chatIdForAddAssignee = str;
    }

    public void setCreateFromMessage(boolean z) {
        this.isCreateFromMessage = z;
    }

    public void setCreateFromMultiMessage(boolean z) {
        this.isCreateFromMultiMessage = z;
    }

    public void setCreateTodo(boolean z) {
        this.isCreateTodo = z;
    }

    public void setFromTodoTab(boolean z) {
        this.isFromTodoTab = z;
    }

    public void setHasValidTodo(boolean z) {
        this.hasValidTodo = z;
    }

    public final void setInLineSummaryChanged(boolean z) {
        this.isInLineSummaryChanged = z;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setRichTextComment(RichText richText) {
        this.richTextC = richText;
    }

    public void setRichTextDescription(RichText richText) {
        this.richTextD = richText;
    }

    public void setRichTextSummary(RichText richText) {
        this.richTextT = richText;
    }

    public final void setSelfDisplayCompleteOrigin(Boolean bool) {
        this.selfDisplayCompleteOrigin = bool;
    }

    public void setShouldFastCreate(boolean z) {
        this.isShouldFastCreate = z;
    }

    public final void setSummaryChanged(boolean z) {
        this.isSummaryChanged = z;
    }

    public void setActivityFinished(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.activityFinished = wVar;
    }

    public void setCommentLv(C1177w<List<TodoComment>> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.commentLv = wVar;
    }

    public void setCommentShowRichText(C1177w<RichTextShowBean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.commentShowRichText = wVar;
    }

    public void setCreatorId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.creatorId = str;
    }

    public void setDescriptionPasteUrl(C1177w<UrlPasteBean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.descriptionPasteUrl = wVar;
    }

    public void setGuid(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.guid = str;
    }

    public void setInitAtController(C1177w<String> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.initAtController = wVar;
    }

    public void setLoading(MutableLiveDataPlus<Boolean> eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "<set-?>");
        this.loading = eVar;
    }

    public void setNeedUpdate(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.needUpdate = wVar;
    }

    public void setReferResourceLv(C1177w<TodoReferResource> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.referResourceLv = wVar;
    }

    public void setRichTextDocDescriptionLv2(C1177w<Doc> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.richTextDocDescriptionLv2 = wVar;
    }

    public void setRichTextUrlDescriptionLv2(C1177w<List<String>> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.richTextUrlDescriptionLv2 = wVar;
    }

    public void setScrollToBottomOfComments(C1177w<Pair<Integer, Boolean>> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.scrollToBottomOfComments = wVar;
    }

    public void setShareEntity(C1177w<ShareEntity> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.shareEntity = wVar;
    }

    public void setShowRemoveReminderDialog(C1177w<Integer> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.showRemoveReminderDialog = wVar;
    }

    public void setSummaryInsertAtTag(C1177w<AtChatterBean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.summaryInsertAtTag = wVar;
    }

    public void setSummaryKeyboardInsertAtTag(C1177w<AtChatterBean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.summaryKeyboardInsertAtTag = wVar;
    }

    public void setSummaryPasteUrl(C1177w<UrlPasteBean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.summaryPasteUrl = wVar;
    }

    public void setToastStringResId(C1177w<Integer> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.toastStringResId = wVar;
    }

    public final void setTodoBuilder(Todo.C19637a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "<set-?>");
        this.todoBuilder = aVar;
    }

    public void setUpdateAssigneeFragment(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.updateAssigneeFragment = wVar;
    }

    public void setUpdateFollowerFragment(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.updateFollowerFragment = wVar;
    }

    public void refreshComment(List<TodoComment> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        getCommentLv().mo5926a(list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel$getRemoteSettingData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/todo/v1/TodoSetting;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "setting", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$m */
    public static final class C56752m implements IGetDataCallback<TodoSetting> {

        /* renamed from: a */
        final /* synthetic */ String f140150a;

        /* renamed from: b */
        final /* synthetic */ String f140151b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("TodoDetailModel", LogMessageUtil.f139260a.mo191766a(this.f140150a, this.f140151b, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(TodoSetting todoSetting) {
            Log.m165389i("TodoDetailModel", LogMessageUtil.f139260a.mo191768a(this.f140150a, this.f140151b, new String[0]));
            if (todoSetting != null) {
                TodoSettingData aVar = TodoSettingData.f141010a;
                Integer num = todoSetting.due_reminder_offset;
                Intrinsics.checkExpressionValueIsNotNull(num, "it.due_reminder_offset");
                aVar.mo194068a(num.intValue());
            }
        }

        C56752m(String str, String str2) {
            this.f140150a = str;
            this.f140151b = str2;
        }
    }

    public void addNewFollowers(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "followerIds");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56745f(this, list, null), 2, null);
    }

    public void createKeyBoardTodo(boolean z) {
        TodoGeneralHitPoint.f141070a.mo194181a(C59031e.m229185c(this.richTextT));
        createTodo(isChatKeyboardCreateTodo(), z);
    }

    public final void handleCreateFromMessage(String str) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56755p(this, str, null), 2, null);
    }

    public void parseAssigneePickerData(ArrayList<SearchBaseInfo> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56757r(this, arrayList, null), 2, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/lark/pb/todo/v1/TodoAssignee;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel$addNewAssignees$assignees$1", mo239173f = "TodoDetailModel.kt", mo239174i = {0}, mo239175l = {984}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$e */
    public static final class C56744e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends TodoAssignee>>, Object> {
        final /* synthetic */ List $assigneeIds;
        Object L$0;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56744e(List list, Continuation cVar) {
            super(2, cVar);
            this.$assigneeIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56744e eVar = new C56744e(this.$assigneeIds, cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super List<? extends TodoAssignee>> cVar) {
            return ((C56744e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoRustCommon gVar = TodoRustCommon.f141116a;
                List<String> list = this.$assigneeIds;
                this.L$0 = ahVar;
                this.label = 1;
                obj = gVar.mo194355a(list, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/lark/pb/todo/v1/TodoAssignee;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel$addNewFollowers$assignees$1", mo239173f = "TodoDetailModel.kt", mo239174i = {0}, mo239175l = {1008}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$h */
    public static final class C56747h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends TodoAssignee>>, Object> {
        final /* synthetic */ List $followerIds;
        Object L$0;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56747h(List list, Continuation cVar) {
            super(2, cVar);
            this.$followerIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56747h hVar = new C56747h(this.$followerIds, cVar);
            hVar.p$ = (CoroutineScope) obj;
            return hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super List<? extends TodoAssignee>> cVar) {
            return ((C56747h) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoRustCommon gVar = TodoRustCommon.f141116a;
                List<String> list = this.$followerIds;
                this.L$0 = ahVar;
                this.label = 1;
                obj = gVar.mo194355a(list, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001*\u00020\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel$replaceAtUsersToRealName$chatterMap$1", mo239173f = "TodoDetailModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$v */
    public static final class C56761v extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends Chatter>>, Object> {
        final /* synthetic */ ArrayList $atUserIds;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56761v(ArrayList arrayList, Continuation cVar) {
            super(2, cVar);
            this.$atUserIds = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56761v vVar = new C56761v(this.$atUserIds, cVar);
            vVar.p$ = (CoroutineScope) obj;
            return vVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Map<String, ? extends Chatter>> cVar) {
            return ((C56761v) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                return TodoDependencyHolder.f139242a.mo191730a().chatModuleDependency().mo145380b(this.$atUserIds);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public void setBlockId(String str) {
        this.todoBuilder.f48016C = new TodoOrigin.C19659a().mo66688a(TodoOrigin.Type.BLOCK).mo66689a(new TodoSourceBlock.C19669a().mo66714a(str).build()).build();
    }

    public final void setOldTodo(Todo todo) {
        String str;
        Intrinsics.checkParameterIsNotNull(todo, "value");
        Todo.C19637a newBuilder = todo.newBuilder();
        Intrinsics.checkExpressionValueIsNotNull(newBuilder, "value.newBuilder()");
        this.todoBuilder = newBuilder;
        TodoSourceHref todoSourceHref = this.oldTodo.source_href;
        if (todoSourceHref != null) {
            str = todoSourceHref.url;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            this.todoBuilder.mo66621a(this.oldTodo.source_href);
        }
        initRichTextForEdit();
        Todo a = this.todoBuilder.build();
        Intrinsics.checkExpressionValueIsNotNull(a, "todoBuilder.build()");
        this.oldTodo = a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        if (r3.todoBuilder.mo66625b(kotlin.collections.CollectionsKt.mutableListOf(r4)) != null) goto L_0x0028;
     */
    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setReferResourceId(java.lang.String r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0015
            com.bytedance.lark.pb.todo.v1.Todo$a r0 = r3.todoBuilder
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            r1[r2] = r4
            java.util.List r1 = kotlin.collections.CollectionsKt.mutableListOf(r1)
            com.bytedance.lark.pb.todo.v1.Todo$a r0 = r0.mo66625b(r1)
            if (r0 == 0) goto L_0x0015
            goto L_0x0028
        L_0x0015:
            r0 = r3
            com.ss.android.lark.todo.impl.features.detail.viewmodel.ad r0 = (com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel) r0
            com.bytedance.lark.pb.todo.v1.Todo$a r0 = r3.todoBuilder
            java.util.List<java.lang.String> r0 = r0.f48043y
            java.lang.String r1 = r3.getReferResourceId()
            r0.remove(r1)
            com.bytedance.lark.pb.todo.v1.Todo$a r1 = r3.todoBuilder
            r1.mo66625b(r0)
        L_0x0028:
            r3.referResourceId = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel.setReferResourceId(java.lang.String):void");
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    public void toastPrompt(boolean z) {
        if (this.todoBuilder.f48024f != TodoSource.DOC || z) {
            getToast().mo5926a(new Event<>(new TodoToastUnit(R.string.Todo_Task_NoEditAccess, 4, null, 4, null)));
        } else {
            getToast().mo5926a(new Event<>(new TodoToastUnit(R.string.Todo_Task_UnableEditTaskFromDocs, 4, null, 4, null)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel$addNewFollowers$1", mo239173f = "TodoDetailModel.kt", mo239174i = {0}, mo239175l = {890}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$f */
    static final class C56745f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List $followerIds;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoDetailModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56745f(TodoDetailModel adVar, List list, Continuation cVar) {
            super(2, cVar);
            this.this$0 = adVar;
            this.$followerIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56745f fVar = new C56745f(this.this$0, this.$followerIds, cVar);
            fVar.p$ = (CoroutineScope) obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56745f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoDetailModel adVar = this.this$0;
                List<String> list = this.$followerIds;
                this.L$0 = ahVar;
                this.label = 1;
                if (adVar.addNewFollowers(list, false, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.getUpdateFollowerFragment().mo5926a(C69089a.m265837a(true));
            this.this$0.getNeedUpdate().mo5926a(C69089a.m265837a(true));
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel$getReferResource$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$l */
    public static final class C56751l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $id;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoDetailModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56751l(String str, Continuation cVar, TodoDetailModel adVar) {
            super(2, cVar);
            this.$id = str;
            this.this$0 = adVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56751l lVar = new C56751l(this.$id, cVar, this.this$0);
            lVar.p$ = (CoroutineScope) obj;
            return lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56751l) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                String str = this.$id;
                this.L$0 = ahVar;
                this.label = 1;
                obj = fVar.mo194316d(str, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TodoReferResource todoReferResource = (TodoReferResource) obj;
            if (todoReferResource != null) {
                this.this$0.todoReferResource = todoReferResource;
                this.this$0.getReferResourceLv().mo5926a(this.this$0.todoReferResource);
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel$handleCreateFromMessage$1", mo239173f = "TodoDetailModel.kt", mo239174i = {0, 1}, mo239175l = {600, 601}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch"}, mo239178s = {"L$0", "L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$p */
    public static final class C56755p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $parentMsgSenderId;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoDetailModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56755p(TodoDetailModel adVar, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = adVar;
            this.$parentMsgSenderId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56755p pVar = new C56755p(this.this$0, this.$parentMsgSenderId, cVar);
            pVar.p$ = (CoroutineScope) obj;
            return pVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56755p) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope ahVar;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                ahVar = this.p$;
                TodoDetailModel adVar = this.this$0;
                this.L$0 = ahVar;
                this.label = 1;
                if (adVar.replaceAtUsersToRealName(this) == a) {
                    return a;
                }
            } else if (i == 1) {
                ahVar = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else if (i == 2) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
                this.this$0.getNeedUpdate().mo5926a(C69089a.m265837a(true));
                return Unit.INSTANCE;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TodoDetailModel adVar2 = this.this$0;
            String str = this.$parentMsgSenderId;
            this.L$0 = ahVar;
            this.label = 2;
            if (adVar2.addAssigneesFromAtUsers(str, this) == a) {
                return a;
            }
            this.this$0.getNeedUpdate().mo5926a(C69089a.m265837a(true));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel$parseAssigneePickerData$1", mo239173f = "TodoDetailModel.kt", mo239174i = {0}, mo239175l = {882}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$r */
    static final class C56757r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ArrayList $data;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoDetailModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56757r(TodoDetailModel adVar, ArrayList arrayList, Continuation cVar) {
            super(2, cVar);
            this.this$0 = adVar;
            this.$data = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56757r rVar = new C56757r(this.this$0, this.$data, cVar);
            rVar.p$ = (CoroutineScope) obj;
            return rVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56757r) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoDetailModel adVar = this.this$0;
                ArrayList<SearchBaseInfo> arrayList = this.$data;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                for (SearchBaseInfo searchBaseInfo : arrayList) {
                    arrayList2.add(searchBaseInfo.getId());
                }
                this.L$0 = ahVar;
                this.label = 1;
                if (TodoDetailModel.addNewAssignees$default(adVar, arrayList2, true, false, this, 4, null) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.getUpdateAssigneeFragment().mo5926a(C69089a.m265837a(true));
            this.this$0.getNeedUpdate().mo5926a(C69089a.m265837a(true));
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel$updateTodo$1", mo239173f = "TodoDetailModel.kt", mo239174i = {0}, mo239175l = {839}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$y */
    public static final class C56764y extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoDetailModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56764y(TodoDetailModel adVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = adVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56764y yVar = new C56764y(this.this$0, cVar);
            yVar.p$ = (CoroutineScope) obj;
            return yVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56764y) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                this.this$0.updateTodoRichText();
                TodoDetailModel adVar = this.this$0;
                this.L$0 = ahVar;
                this.label = 1;
                obj = adVar.updateTodoMayError(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Todo todo = (Todo) obj;
            if (todo != null) {
                this.this$0.setOldTodo(todo);
                EventBus.getDefault().trigger(new UpdateTodoEvent(todo));
            }
            return Unit.INSTANCE;
        }
    }

    public final void createTodo(boolean z) {
        TodoGeneralHitPoint.f141070a.mo194182a(C59031e.m229185c(this.richTextT), !C59035h.m229210a(this.richTextD), C59031e.m229185c(this.richTextD), C56473b.m220120a(this.richTextD, this.docEntityD));
        createTodo(isChatKeyboardCreateTodo(), true);
    }

    public AssigneeBean getAssigneeBean(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        List<AssigneeBean> b = getAssignees().mo5927b();
        if (b != null) {
            ArrayList arrayList = new ArrayList();
            for (T t : b) {
                if (Intrinsics.areEqual(t.mo192757a(), str)) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (!arrayList2.isEmpty()) {
                return (AssigneeBean) arrayList2.get(0);
            }
        }
        return null;
    }

    public TodoAssignee getTodoAssignee(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        List<TodoAssignee> list = this.todoBuilder.f48032n;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (Intrinsics.areEqual(t.assignee_id, str)) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (!arrayList2.isEmpty()) {
                return (TodoAssignee) arrayList2.get(0);
            }
        }
        return null;
    }

    public boolean isOutUser(String str) {
        boolean areEqual = Intrinsics.areEqual(this.todoBuilder.f48035q, str);
        List<TodoAssignee> list = this.todoBuilder.f48032n;
        Intrinsics.checkExpressionValueIsNotNull(list, "todoBuilder.assignees");
        List<TodoAssignee> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().assignee_id);
        }
        boolean contains = arrayList.contains(str);
        List<TodoFollower> followerList = getFollowerList();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(followerList, 10));
        Iterator<T> it2 = followerList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().follower_id);
        }
        boolean contains2 = arrayList2.contains(str);
        if (areEqual || contains || contains2) {
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel$deleteTodo$1", mo239173f = "TodoDetailModel.kt", mo239174i = {0}, mo239175l = {804}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$j */
    static final class C56749j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoDetailModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56749j(TodoDetailModel adVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = adVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56749j jVar = new C56749j(this.this$0, cVar);
            jVar.p$ = (CoroutineScope) obj;
            return jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56749j) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                String guid = this.this$0.getGuid();
                this.L$0 = ahVar;
                this.label = 1;
                obj = fVar.mo194315c(guid, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!((Boolean) obj).booleanValue()) {
                this.this$0.getToast().mo5926a(new Event<>(new TodoToastUnit(R.string.Todo_common_ActionFailedTryAgainLater, 2, null, 4, null)));
            } else {
                EventBus.getDefault().trigger(new DeleteTodoEvent(this.this$0.getGuid()));
                this.this$0.getState().mo5926a(ITodoKeyboardViewModel.State.DeleteSuccess);
                this.this$0.getToastStringResId().mo5926a(C69089a.m265839a((int) R.string.Todo_common_DeletedSuccessfully));
                this.this$0.getActivityFinished().mo5926a(C69089a.m265837a(true));
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel$getShareTodo$1", mo239173f = "TodoDetailModel.kt", mo239174i = {0, 1}, mo239175l = {742, 750}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch"}, mo239178s = {"L$0", "L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$n */
    public static final class C56753n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoDetailModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56753n(TodoDetailModel adVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = adVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56753n nVar = new C56753n(this.this$0, cVar);
            nVar.p$ = (CoroutineScope) obj;
            return nVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56753n) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x00a6  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00dd  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
            // Method dump skipped, instructions count: 237
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel.C56753n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel$getTodo$1", mo239173f = "TodoDetailModel.kt", mo239174i = {0, 1}, mo239175l = {765, 773}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch"}, mo239178s = {"L$0", "L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$o */
    public static final class C56754o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoDetailModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56754o(TodoDetailModel adVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = adVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56754o oVar = new C56754o(this.this$0, cVar);
            oVar.p$ = (CoroutineScope) obj;
            return oVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56754o) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00c7  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
            // Method dump skipped, instructions count: 215
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel.C56754o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel$mergeMessage$1", mo239173f = "TodoDetailModel.kt", mo239174i = {0, 1, 1, 1}, mo239175l = {610, 619}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "it", "msgIds"}, mo239178s = {"L$0", "L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$q */
    public static final class C56756q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoDetailModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56756q(TodoDetailModel adVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = adVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56756q qVar = new C56756q(this.this$0, cVar);
            qVar.p$ = (CoroutineScope) obj;
            return qVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56756q) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:39:0x00b5  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
            // Method dump skipped, instructions count: 214
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel.C56756q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel$quitTodo$1", mo239173f = "TodoDetailModel.kt", mo239174i = {0}, mo239175l = {820}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$s */
    static final class C56758s extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoDetailModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56758s(TodoDetailModel adVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = adVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56758s sVar = new C56758s(this.this$0, cVar);
            sVar.p$ = (CoroutineScope) obj;
            return sVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56758s) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i;
            Object a = C69086a.m265828a();
            int i2 = this.label;
            if (i2 == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                String guid = this.this$0.getGuid();
                TodoSource todoSource = this.this$0.getTodoBuilder().f48024f;
                this.L$0 = ahVar;
                this.label = 1;
                obj = fVar.mo194305a(guid, todoSource, this);
                if (obj == a) {
                    return a;
                }
            } else if (i2 == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) obj).booleanValue()) {
                TodoGeneralHitPoint.m221669a(this.this$0.getGuid(), "leave_task", false, 4, null);
                EventBus.getDefault().trigger(new QuitTodoEvent(this.this$0.getGuid()));
                this.this$0.getToastStringResId().mo5926a(C69089a.m265839a((int) R.string.Todo_Task_LeaveTaskConfirmToast));
                this.this$0.getActivityFinished().mo5926a(C69089a.m265837a(true));
            } else {
                if (this.this$0.getTodoBuilder().f48024f == TodoSource.OAPI) {
                    i = R.string.Todo_Tasks_APICantExit;
                } else {
                    i = R.string.Todo_common_ActionFailedTryAgainLater;
                }
                this.this$0.getToast().mo5926a(new Event<>(new TodoToastUnit(i, 2, null, 4, null)));
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel$restoreDraft$1", mo239173f = "TodoDetailModel.kt", mo239174i = {0}, mo239175l = {952}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$w */
    public static final class C56762w extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoDetailModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56762w(TodoDetailModel adVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = adVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56762w wVar = new C56762w(this.this$0, cVar);
            wVar.p$ = (CoroutineScope) obj;
            return wVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56762w) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                DraftScene.Scene createTodoScene = this.this$0.getCreateTodoScene();
                String str = this.this$0.chatId;
                if (str == null) {
                    str = "";
                }
                this.L$0 = ahVar;
                this.label = 1;
                obj = fVar.mo194301a(createTodoScene, str, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Todo todo = (Todo) obj;
            if (todo != null) {
                this.this$0.setOldTodo(todo);
                this.this$0.getTodoBuilder().f48035q = TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a();
                this.this$0.getNeedUpdate().mo5926a(C69089a.m265837a(true));
                this.this$0.checkHasReferResource();
            } else {
                RichText richText = this.this$0.preRichText;
                if (richText != null) {
                    this.this$0.richTextT = richText;
                    this.this$0.getSummaryShowRichText().mo5926a(new RichTextShowBean(this.this$0.richTextT, true, true));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel$saveDraft$1", mo239173f = "TodoDetailModel.kt", mo239174i = {0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, mo239175l = {927, 939, 942}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "emptyTitle", "emptyDescription", "emptyAssignee", "emptyFollower", "$this$launch", "emptyTitle", "emptyDescription", "emptyAssignee", "emptyFollower"}, mo239178s = {"L$0", "L$0", "Z$0", "Z$1", "Z$2", "Z$3", "L$0", "Z$0", "Z$1", "Z$2", "Z$3"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$x */
    static final class C56763x extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        boolean Z$0;
        boolean Z$1;
        boolean Z$2;
        boolean Z$3;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoDetailModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56763x(TodoDetailModel adVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = adVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56763x xVar = new C56763x(this.this$0, cVar);
            xVar.p$ = (CoroutineScope) obj;
            return xVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56763x) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            Object a = C69086a.m265828a();
            int i = this.label;
            boolean z2 = true;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                String str = "";
                if (this.this$0.isFinishAfterCreate) {
                    TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                    DraftScene.Scene createTodoScene = this.this$0.getCreateTodoScene();
                    String str2 = this.this$0.chatId;
                    if (str2 != null) {
                        str = str2;
                    }
                    this.L$0 = ahVar;
                    this.label = 1;
                    if (fVar.mo194313b(createTodoScene, str, this) == a) {
                        return a;
                    }
                } else {
                    boolean a2 = C59035h.m229210a(this.this$0.richTextT);
                    boolean a3 = C59035h.m229210a(this.this$0.richTextD);
                    Long l = this.this$0.getTodoBuilder().f48028j;
                    if (l != null && l.longValue() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean isEmpty = this.this$0.getTodoBuilder().f48032n.isEmpty();
                    boolean isEmpty2 = this.this$0.getTodoBuilder().f48044z.isEmpty();
                    if (!a2 || !a3 || !z || !isEmpty || !isEmpty2) {
                        z2 = false;
                    }
                    if (z2) {
                        TodoRustCRUD fVar2 = TodoRustCRUD.f141115a;
                        DraftScene.Scene createTodoScene2 = this.this$0.getCreateTodoScene();
                        String str3 = this.this$0.chatId;
                        if (str3 != null) {
                            str = str3;
                        }
                        this.L$0 = ahVar;
                        this.Z$0 = a2;
                        this.Z$1 = a3;
                        this.Z$2 = isEmpty;
                        this.Z$3 = isEmpty2;
                        this.label = 2;
                        if (fVar2.mo194313b(createTodoScene2, str, this) == a) {
                            return a;
                        }
                    } else {
                        this.this$0.updateTodoRichText();
                        TodoRustCRUD fVar3 = TodoRustCRUD.f141115a;
                        DraftScene.Scene createTodoScene3 = this.this$0.getCreateTodoScene();
                        String str4 = this.this$0.chatId;
                        if (str4 != null) {
                            str = str4;
                        }
                        Todo a4 = this.this$0.getTodoBuilder().build();
                        Intrinsics.checkExpressionValueIsNotNull(a4, "todoBuilder.build()");
                        this.L$0 = ahVar;
                        this.Z$0 = a2;
                        this.Z$1 = a3;
                        this.Z$2 = isEmpty;
                        this.Z$3 = isEmpty2;
                        this.label = 3;
                        if (fVar3.mo194300a(createTodoScene3, str, a4, this) == a) {
                            return a;
                        }
                    }
                    return Unit.INSTANCE;
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
            return Unit.INSTANCE;
        }
    }

    private final void generateAnchorFromMessage(RichText richText) {
        RichText.RichTextElements elements;
        Map<String, RichTextElement> dictionary;
        if (getUrlPreviewEnable()) {
            if (!(richText == null || (elements = richText.getElements()) == null || (dictionary = elements.getDictionary()) == null)) {
                for (Map.Entry<String, RichTextElement> entry : dictionary.entrySet()) {
                    String key = entry.getKey();
                    RichTextElement value = entry.getValue();
                    if (value != null && (value.getProperty() instanceof RichTextElement.AnchorProperty)) {
                        RichTextElement.AnchorProperty anchorProperty = (RichTextElement.AnchorProperty) value.getProperty();
                        Intrinsics.checkExpressionValueIsNotNull(anchorProperty, "anchorProperty");
                        if (!TextUtils.isEmpty(anchorProperty.getDisplayTitle()) && !TextUtils.isEmpty(anchorProperty.getIconKey()) && !TextUtils.isEmpty(anchorProperty.getContent())) {
                            String uuid = ao.m95038a().toString();
                            Intrinsics.checkExpressionValueIsNotNull(uuid, "UUIDUtil.randomUUID().toString()");
                            NetUrlPreviewEntity netUrlPreviewEntity = new NetUrlPreviewEntity(anchorProperty.getIconKey(), anchorProperty.getDisplayTitle(), null, 0, null, "", uuid, new Url(anchorProperty.getContent(), "", "", "", ""), MapsKt.emptyMap());
                            Intrinsics.checkExpressionValueIsNotNull(key, "id");
                            insertUrlIntoMap(key, netUrlPreviewEntity);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object updateTodoMayError(kotlin.coroutines.Continuation<? super com.bytedance.lark.pb.todo.v1.Todo> r7) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel.updateTodoMayError(kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel$createTodo$1", mo239173f = "TodoDetailModel.kt", mo239174i = {0, 1, 1, 1}, mo239175l = {303, 326}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "it", "todo"}, mo239178s = {"L$0", "L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ad$i */
    public static final class C56748i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $closeActivity;
        final /* synthetic */ boolean $shareToChat;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoDetailModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56748i(TodoDetailModel adVar, boolean z, boolean z2, Continuation cVar) {
            super(2, cVar);
            this.this$0 = adVar;
            this.$shareToChat = z;
            this.$closeActivity = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56748i iVar = new C56748i(this.this$0, this.$shareToChat, this.$closeActivity, cVar);
            iVar.p$ = (CoroutineScope) obj;
            return iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56748i) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:50:0x019f  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x01b1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
            // Method dump skipped, instructions count: 454
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel.C56748i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object replaceAtUsersToRealName(kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
        // Method dump skipped, instructions count: 303
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel.replaceAtUsersToRealName(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x04ca  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x04e6  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x04f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TodoDetailModel(android.content.Intent r9) {
        /*
        // Method dump skipped, instructions count: 1419
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel.<init>(android.content.Intent):void");
    }

    private final void createTodo(boolean z, boolean z2) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56748i(this, z, z2, null), 2, null);
    }

    private final void handleFromMessage(RichText richText, HashMap<String, Doc> hashMap) {
        C56478e.m220169a(richText, hashMap);
        if (!C59035h.m229210a(richText)) {
            this.richTextT = new RichText(richText);
            generateAnchorFromMessage(richText);
        }
        this.docEntityT = hashMap;
    }

    public void insertDocIntoDescriptionMap(String str, Doc doc) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(doc, "doc");
        if (this.docEntityD == null) {
            this.docEntityD = new HashMap<>();
        }
        HashMap<String, Doc> hashMap = this.docEntityD;
        if (hashMap != null) {
            hashMap.put(str, doc);
        }
    }

    public void insertDocIntoMap(String str, Doc doc) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(doc, "doc");
        if (this.docEntityT == null) {
            this.docEntityT = new HashMap<>();
        }
        HashMap<String, Doc> hashMap = this.docEntityT;
        if (hashMap != null) {
            hashMap.put(str, doc);
        }
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewModel
    public void shareTodo(ArrayList<String> arrayList, String str) {
        Intrinsics.checkParameterIsNotNull(arrayList, "chatIds");
        Intrinsics.checkParameterIsNotNull(str, Comment.f24093e);
        ShareProcess.f139407a.mo192005a(getShareEntity(), arrayList, str, getGuid(), C1143ag.m5356a(this));
    }

    public void insertUrlIntoDescriptionMap(String str, NetUrlPreviewEntity netUrlPreviewEntity) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(netUrlPreviewEntity, "urlPreview");
        if (this.urlHangPointsD == null) {
            this.urlHangPointsD = new HashMap<>();
        }
        String previewId = netUrlPreviewEntity.getPreviewId();
        if (TextUtils.isEmpty(previewId)) {
            previewId = ao.m95038a().toString();
            Intrinsics.checkExpressionValueIsNotNull(previewId, "UUIDUtil.randomUUID().toString()");
        }
        HashMap<String, UrlPreviewHangPoint> hashMap = this.urlHangPointsD;
        if (hashMap != null) {
            UrlPreviewHangPoint.C15430a b = new UrlPreviewHangPoint.C15430a().mo55959b(previewId);
            Url url = netUrlPreviewEntity.getUrl();
            if (url != null) {
                str2 = url.getUrl();
            } else {
                str2 = null;
            }
            hashMap.put(str, b.mo55957a(str2).mo55956a((Boolean) false).build());
        }
        if (this.urlPreviewsD == null) {
            this.urlPreviewsD = new HashMap<>();
        }
        HashMap<String, NetUrlPreviewEntity> hashMap2 = this.urlPreviewsD;
        if (hashMap2 != null) {
            hashMap2.put(previewId, netUrlPreviewEntity);
        }
        this.urlFakePreviewIdsT.add(previewId);
    }

    public void insertUrlIntoMap(String str, NetUrlPreviewEntity netUrlPreviewEntity) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(netUrlPreviewEntity, "urlPreview");
        if (this.urlHangPointsT == null) {
            this.urlHangPointsT = new HashMap<>();
        }
        String previewId = netUrlPreviewEntity.getPreviewId();
        if (TextUtils.isEmpty(previewId)) {
            previewId = ao.m95038a().toString();
            Intrinsics.checkExpressionValueIsNotNull(previewId, "UUIDUtil.randomUUID().toString()");
        }
        HashMap<String, UrlPreviewHangPoint> hashMap = this.urlHangPointsT;
        if (hashMap != null) {
            UrlPreviewHangPoint.C15430a b = new UrlPreviewHangPoint.C15430a().mo55959b(previewId);
            Url url = netUrlPreviewEntity.getUrl();
            if (url != null) {
                str2 = url.getUrl();
            } else {
                str2 = null;
            }
            hashMap.put(str, b.mo55957a(str2).mo55956a((Boolean) false).build());
        }
        if (this.urlPreviewsT == null) {
            this.urlPreviewsT = new HashMap<>();
        }
        HashMap<String, NetUrlPreviewEntity> hashMap2 = this.urlPreviewsT;
        if (hashMap2 != null) {
            hashMap2.put(previewId, netUrlPreviewEntity);
        }
        this.urlFakePreviewIdsT.add(previewId);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object addAssigneesFromAtUsers(java.lang.String r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel.addAssigneesFromAtUsers(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object addNewFollowers(java.util.List<java.lang.String> r13, boolean r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel.addNewFollowers(java.util.List, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    static /* synthetic */ void checkAtUserInAssignees$default(TodoDetailModel adVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            adVar.checkAtUserInAssignees(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkAtUserInAssignees");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object addNewAssignees(java.util.List<java.lang.String> r7, boolean r8, boolean r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
        // Method dump skipped, instructions count: 228
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel.addNewAssignees(java.util.List, boolean, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    static /* synthetic */ Object addNewAssignees$default(TodoDetailModel adVar, List list, boolean z, boolean z2, Continuation cVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z2 = false;
            }
            return adVar.addNewAssignees(list, z, z2, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addNewAssignees");
    }
}
