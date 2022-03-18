package com.bytedance.ee.bear.middleground.comment.control;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.util.C0844e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.facade.common.AbstractC7665c;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.AbstractC7710h;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground.comment.C9185d;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.bear.middleground.comment.cell.ResolveCell;
import com.bytedance.ee.bear.middleground.comment.cell.RetryCell;
import com.bytedance.ee.bear.middleground.comment.detail.DetailComment;
import com.bytedance.ee.bear.middleground.comment.export.Action;
import com.bytedance.ee.bear.middleground.comment.export.ICardAdapter;
import com.bytedance.ee.bear.middleground.comment.export.bean.C9221b;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentInputRequest;
import com.bytedance.ee.bear.middleground.comment.export.bean.DataEntity;
import com.bytedance.ee.bear.middleground.comment.export.bean.Reaction;
import com.bytedance.ee.bear.middleground.comment.p443a.C8969a;
import com.bytedance.ee.bear.middleground.comment.p445c.AbstractC9106c;
import com.bytedance.ee.bear.middleground.comment.p449g.C9232e;
import com.bytedance.ee.bear.middleground.comment.reaction.ReactionDataEntity;
import com.bytedance.ee.bear.middleground.comment.translate.CommentTranslate;
import com.bytedance.ee.bear.middleground.comment.uitls.Config;
import com.bytedance.ee.bear.middleground.comment.uitls.ReactionHelper;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.p398i.C7827a;
import com.bytedance.ee.bear.p398i.C7834f;
import com.bytedance.ee.bear.p398i.C7838i;
import com.bytedance.ee.bear.p519p.AbstractC10460a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.deviceinfo.C13653a;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p718t.C13749l;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.suite.R;
import com.ss.android.lark.reaction.widget.detailwindow.C53002b;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import com.ss.android.lark.reaction.widget.flowlayout.p2562a.C53061a;
import com.ss.android.lark.reaction.widget.flowlayout.p2562a.C53062b;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import com.ss.android.lark.reaction.widget.panel.C53085d;
import com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00012\u00020\u0001:\u0004\u0001\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ&\u0010H\u001a\u00020%2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0004J\u0018\u0010M\u001a\u00020%2\u0006\u0010N\u001a\u00020O2\u0006\u0010\u0013\u001a\u00020PH\u0016J\u0018\u0010Q\u001a\u00020%2\u0006\u0010N\u001a\u00020O2\u0006\u0010R\u001a\u00020SH\u0016J\u0016\u0010T\u001a\u00020%2\u0006\u0010N\u001a\u00020O2\u0006\u0010R\u001a\u00020SJ\u0016\u0010U\u001a\u00020%2\u0006\u0010N\u001a\u00020O2\u0006\u0010R\u001a\u00020SJ.\u0010V\u001a\u00020%2\u0006\u0010N\u001a\u00020O2\u0006\u0010W\u001a\u00020P2\u0006\u0010R\u001a\u00020S2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0004J*\u0010X\u001a\u00020%2\u0006\u0010N\u001a\u00020O2\u0006\u0010Y\u001a\u00020?2\u0006\u0010\u0013\u001a\u00020P2\b\u0010Z\u001a\u0004\u0018\u00010JH\u0016J \u0010[\u001a\u00020%2\u0006\u0010\\\u001a\u00020]2\u0006\u0010\u0013\u001a\u00020P2\u0006\u0010Y\u001a\u00020?H\u0016J\u0018\u0010^\u001a\u00020%2\u0006\u0010_\u001a\u00020?2\u0006\u0010B\u001a\u00020?H\u0016J\b\u0010`\u001a\u00020%H\u0016J¥\u0001\u0010a\u001a\u00020%2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010_\u001a\u00020?2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020P0+2\u0006\u0010c\u001a\u00020L2 \u0010a\u001a\u001c\u0012\u0004\u0012\u00020?\u0012\f\u0012\n\u0012\u0004\u0012\u00020e\u0018\u00010@\u0012\u0004\u0012\u00020%0d2\u000e\b\u0002\u0010f\u001a\b\u0012\u0004\u0012\u00020%0$2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010h\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010j\u001a\u0004\u0018\u00010SH\u0002¢\u0006\u0002\u0010kJX\u0010l\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020P2\u0006\u0010N\u001a\u00020O2\b\u0010g\u001a\u0004\u0018\u00010?2\u0006\u0010j\u001a\u00020S2\b\u0010i\u001a\u0004\u0018\u00010?2\b\u0010h\u001a\u0004\u0018\u00010?2\u0018\u0010m\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010o\u0012\u0006\u0012\u0004\u0018\u00010o\u0018\u00010nH\u0016J\u000e\u0010p\u001a\u00020%2\u0006\u0010q\u001a\u00020rJ\n\u0010s\u001a\u0004\u0018\u00010?H\u0016J\u001c\u0010t\u001a\u00020L2\b\u0010B\u001a\u0004\u0018\u00010?2\b\u0010Y\u001a\u0004\u0018\u00010?H\u0002J\b\u0010u\u001a\u00020%H\u0016J\u0010\u0010v\u001a\u00020L2\u0006\u0010\u0013\u001a\u00020PH\u0004J\b\u0010w\u001a\u00020LH\u0016J\b\u0010c\u001a\u00020LH\u0016J\u0010\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u00020{H\u0016J\u0016\u0010|\u001a\u00020%2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020?0@H\u0016J0\u0010~\u001a\u00020%2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010_\u001a\u00020?2\u0006\u0010c\u001a\u00020L2\u000e\b\u0002\u0010f\u001a\b\u0012\u0004\u0012\u00020%0$H\u0003J\u0018\u0010~\u001a\u00020%2\u0006\u0010_\u001a\u00020?2\u0006\u0010c\u001a\u00020LH\u0016J\u0010\u001a\u00020%2\u0007\u0010\u0001\u001a\u00020?2\u000f\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010@2\b\u0010g\u001a\u0004\u0018\u00010?2\u0006\u0010_\u001a\u00020?2\u0006\u0010B\u001a\u00020?2\b\u0010i\u001a\u0004\u0018\u00010?2\b\u0010h\u001a\u0004\u0018\u00010?2\t\u0010\u0001\u001a\u0004\u0018\u00010?2\b\u0010R\u001a\u0004\u0018\u00010?2\u0018\u0010m\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010o\u0012\u0006\u0012\u0004\u0018\u00010o\u0018\u00010nH\u0016JM\u0010\u0001\u001a\u00020%2\u0007\u0010\u0001\u001a\u00020?2\u000f\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010@2\u0006\u0010_\u001a\u00020?2\u0006\u0010B\u001a\u00020?2\u0018\u0010m\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010o\u0012\u0006\u0012\u0004\u0018\u00010o\u0018\u00010nH\u0016JW\u0010\u0001\u001a\u00020%2\u0007\u0010\u0001\u001a\u00020?2\u000f\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010@2\u0006\u0010_\u001a\u00020?2\u0006\u0010B\u001a\u00020?2\b\u0010R\u001a\u0004\u0018\u00010?2\u0018\u0010m\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010o\u0012\u0006\u0012\u0004\u0018\u00010o\u0018\u00010nH\u0016J\u0011\u0010\u0001\u001a\u00020%2\u0006\u00107\u001a\u000208H\u0016J)\u0010\u0001\u001a\u00020%2\u0006\u0010I\u001a\u00020J2\u0006\u0010W\u001a\u00020P2\u0006\u0010N\u001a\u00020O2\u0006\u0010R\u001a\u00020SH\u0016J\u0019\u0010\u0001\u001a\u00020%2\u0006\u0010_\u001a\u00020?2\u0006\u0010B\u001a\u00020?H\u0016J \u0010\u0001\u001a\u00020%2\u0006\u0010B\u001a\u00020?2\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020A0@H\u0016J\u0014\u0010\u0001\u001a\u00020%2\t\u0010\u0001\u001a\u0004\u0018\u00010?H\u0016J\u001d\u0010\u0001\u001a\u000b\u0012\u0004\u0012\u00020?\u0018\u00010\u0001*\t\u0012\u0004\u0012\u00020?0\u0001H\u0002R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u000e¢\u0006\u0002\n\u0000R \u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R \u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00101\u001a\u0004\u0018\u000102X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u000208X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R \u0010=\u001a\u0014\u0012\u0004\u0012\u00020?\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0@0>X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010B\u001a\u0004\u0018\u00010?X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0010\u0010G\u001a\u0004\u0018\u00010?X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/control/CommentFunction;", "Lcom/bytedance/ee/bear/middleground/comment/control/ICommentFunction;", "config", "Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;", "commentListeners", "Lcom/bytedance/ee/bear/middleground/comment/control/ICommentListeners;", "dataControl", "Lcom/bytedance/ee/bear/middleground/comment/control/DataControl;", "(Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;Lcom/bytedance/ee/bear/middleground/comment/control/ICommentListeners;Lcom/bytedance/ee/bear/middleground/comment/control/DataControl;)V", "backPress", "Lcom/bytedance/ee/bear/facade/common/BackPressHandler;", "getBackPress", "()Lcom/bytedance/ee/bear/facade/common/BackPressHandler;", "backPressDispatcher", "Lcom/bytedance/ee/bear/facade/common/BackPressDispatcher;", "getBackPressDispatcher", "()Lcom/bytedance/ee/bear/facade/common/BackPressDispatcher;", "setBackPressDispatcher", "(Lcom/bytedance/ee/bear/facade/common/BackPressDispatcher;)V", "commentDetail", "Lcom/bytedance/ee/bear/middleground/comment/detail/DetailComment;", "getCommentListeners", "()Lcom/bytedance/ee/bear/middleground/comment/control/ICommentListeners;", "getConfig", "()Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;", "confirmDialog", "Landroid/app/Dialog;", "getConfirmDialog", "()Landroid/app/Dialog;", "setConfirmDialog", "(Landroid/app/Dialog;)V", "getDataControl", "()Lcom/bytedance/ee/bear/middleground/comment/control/DataControl;", "lastCloseReaction", "", "mUpdateWholeListener", "Lkotlin/Function0;", "", "getMUpdateWholeListener", "()Lkotlin/jvm/functions/Function0;", "setMUpdateWholeListener", "(Lkotlin/jvm/functions/Function0;)V", "operationMenuList", "", "Lcom/ss/android/lark/reaction/widget/panel/ReactionPanelMenuItem;", "getOperationMenuList", "()Ljava/util/List;", "setOperationMenuList", "(Ljava/util/List;)V", "popupWindow", "Landroid/widget/PopupWindow;", "getPopupWindow", "()Landroid/widget/PopupWindow;", "setPopupWindow", "(Landroid/widget/PopupWindow;)V", "positionY", "", "getPositionY", "()F", "setPositionY", "(F)V", "reactionData", "", "", "", "Lcom/ss/android/lark/reaction/widget/flowlayout/bean/ReactionFlowLayoutViewModel;", "replyId", "getReplyId", "()Ljava/lang/String;", "setReplyId", "(Ljava/lang/String;)V", "selfUserId", "addCopyItem", "view", "Landroid/view/View;", "copy", "", "addDeleteItem", "cardAdapter", "Lcom/bytedance/ee/bear/middleground/comment/export/ICardAdapter;", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail;", "addEditItem", "position", "", "addReplyItem", "addResolveItem", "addTranslateItem", "item", "clickReaction", "reactionKey", "itemView", "clickReactionDetail", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "deleteComment", "commentId", "dismissReaction", "edit", "commentRecord", "isWhole", "Lkotlin/Function2;", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "updateWhole", "quote", "parentToken", "parentType", "retryType", "(Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;Lcom/bytedance/ee/bear/middleground/comment/control/ICommentListeners;Lcom/bytedance/ee/bear/middleground/comment/control/DataControl;Ljava/lang/String;Ljava/util/List;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "editCommentByReviewFail", "bizParams", "", "", "getPermission", "permissionCallback", "Lcom/bytedance/ee/bear/middleground/comment/control/IGetPermissionCallback;", "getShowingReactionReplyId", "hasReaction", "hideReactionPanel", "isOwner", "isShowingReaction", "linkClick", "Lcom/bytedance/ee/bear/span/AbsSpan$ISpanClickListener;", "callback", "Lcom/bytedance/ee/bear/middleground/comment/cell/LinkClickCell$ClickCallBack;", "readMessage", "messageId", "resolve", "retryCreateComment", "content", "list", "localCommentId", "retryEditComment", "retryRelpyComment", "setTouchPositionY", "showReaction", "translate", "updateReactionData", "reactions", "updateReactionDetail", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "checkReactionResult", "Lio/reactivex/Flowable;", "AbsReactionClickListener", "Companion", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.b.b */
public class CommentFunction implements ICommentFunction {

    /* renamed from: c */
    public static final Companion f24389c = new Companion(null);

    /* renamed from: a */
    public DetailComment f24390a;

    /* renamed from: b */
    public long f24391b;

    /* renamed from: d */
    private List<C53085d> f24392d = new ArrayList();

    /* renamed from: e */
    private String f24393e;

    /* renamed from: f */
    private float f24394f;

    /* renamed from: g */
    private Function0<Unit> f24395g;

    /* renamed from: h */
    private PopupWindow f24396h;

    /* renamed from: i */
    private AbstractC7665c f24397i;

    /* renamed from: j */
    private String f24398j;

    /* renamed from: k */
    private Dialog f24399k;

    /* renamed from: l */
    private final AbstractC7666d f24400l;

    /* renamed from: m */
    private final Map<String, List<C53061a>> f24401m;

    /* renamed from: n */
    private final Config f24402n;

    /* renamed from: o */
    private final ICommentListeners f24403o;

    /* renamed from: p */
    private final DataControl f24404p;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/control/CommentFunction$AbsReactionClickListener;", "Lcom/ss/android/lark/reaction/widget/panel/ReactionPanelFacade$ReactionClickListener;", "()V", "onReactionClick", "", "reactionKey", "", "reactionSource", "", "onShowLessBtnClick", "onShowMoreBtnClick", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$a */
    public static abstract class AbsReactionClickListener implements ReactionPanelFacade.AbstractC53072b {
        @Override // com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade.AbstractC53072b
        /* renamed from: a */
        public void mo22763a() {
        }

        @Override // com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade.AbstractC53072b
        /* renamed from: b */
        public void mo22765b() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$ac */
    static final class C9051ac extends Lambda implements Function0<Unit> {
        public static final C9051ac INSTANCE = new C9051ac();

        C9051ac() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$ad */
    public static final class C9052ad extends Lambda implements Function0<Unit> {
        public static final C9052ad INSTANCE = new C9052ad();

        C9052ad() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$x */
    public static final class C9093x extends Lambda implements Function0<Unit> {
        public static final C9093x INSTANCE = new C9093x();

        C9093x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/control/CommentFunction$Companion;", "", "()V", "TAG", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final List<C53085d> mo34628a() {
        return this.f24392d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final float mo34647b() {
        return this.f24394f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Function0<Unit> mo34651c() {
        return this.f24395g;
    }

    /* renamed from: d */
    public final PopupWindow mo34653d() {
        return this.f24396h;
    }

    /* renamed from: e */
    public final AbstractC7665c mo34654e() {
        return this.f24397i;
    }

    /* renamed from: f */
    public final AbstractC7666d mo34655f() {
        return this.f24400l;
    }

    /* renamed from: l */
    public final Config mo34661l() {
        return this.f24402n;
    }

    /* renamed from: m */
    public final ICommentListeners mo34662m() {
        return this.f24403o;
    }

    /* renamed from: n */
    public final DataControl mo34663n() {
        return this.f24404p;
    }

    /* renamed from: a */
    public final void mo34634a(AbstractC7665c cVar) {
        this.f24397i = cVar;
    }

    /* renamed from: a */
    public final void mo34639a(String str) {
        this.f24398j = str;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentFunction
    /* renamed from: a */
    public void mo34645a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "messageId");
        C13479a.m54764b("AbsCommentFunction", "readMessage");
        this.f24403o.mo34296T().invoke(list);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentFunction
    /* renamed from: a */
    public void mo34640a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        Intrinsics.checkParameterIsNotNull(str2, "replyId");
        this.f24404p.mo34715d(str, str2);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentFunction
    /* renamed from: a */
    public void mo34625a(CommentBean.CommentDetail commentDetail, ICardAdapter iCardAdapter, String str, int i, String str2, String str3, Map<Object, ? extends Object> map) {
        Intrinsics.checkParameterIsNotNull(commentDetail, "commentDetail");
        Intrinsics.checkParameterIsNotNull(iCardAdapter, "cardAdapter");
        C9049aa aaVar = new C9049aa(commentDetail);
        C9050ab abVar = new C9050ab(this);
        String reply_id = commentDetail.getReply_id();
        Intrinsics.checkExpressionValueIsNotNull(reply_id, "commentDetail.reply_id");
        List<CommentBean.CommentDetail> last3Item = iCardAdapter.getLast3Item(reply_id);
        if (last3Item.size() != 0) {
            m37637a(this.f24402n, this.f24403o, this.f24404p, iCardAdapter.getCommentId(commentDetail), last3Item, mo34659j(), aaVar, abVar, str, str3, str2, Integer.valueOf(i));
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentFunction
    /* renamed from: a */
    public void mo34644a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        this.f24399k = new ResolveCell().mo34415a(this.f24402n, this.f24404p, str, z);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentFunction
    /* renamed from: a */
    public void mo34642a(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map<Object, ? extends Object> map) {
        Intrinsics.checkParameterIsNotNull(str, "content");
        Intrinsics.checkParameterIsNotNull(str3, "commentId");
        Intrinsics.checkParameterIsNotNull(str4, "replyId");
        RetryCell.f24184a.mo34420a(this.f24404p, str, list, str2, str3, str4, str5, str6, str7, str8, map);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentFunction
    /* renamed from: a */
    public void mo34643a(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, String str2, String str3, String str4, Map<Object, ? extends Object> map) {
        Intrinsics.checkParameterIsNotNull(str, "content");
        Intrinsics.checkParameterIsNotNull(str2, "commentId");
        Intrinsics.checkParameterIsNotNull(str3, "replyId");
        RetryCell.f24184a.mo34421a(this.f24404p, str, list, str2, str3, str4, map);
    }

    /* renamed from: a */
    public void mo34636a(ICardAdapter iCardAdapter, CommentBean.CommentDetail commentDetail) {
        Intrinsics.checkParameterIsNotNull(iCardAdapter, "cardAdapter");
        Intrinsics.checkParameterIsNotNull(commentDetail, "commentDetail");
        this.f24392d.add(new C53085d(C13615c.f35773a.getString(R.string.Doc_Facade_Delete), ReactionHelper.f24886a.mo35350a("DELETE"), new C9067d(this, iCardAdapter, commentDetail)));
    }

    /* renamed from: a */
    public void mo34624a(ICardAdapter iCardAdapter, int i) {
        Intrinsics.checkParameterIsNotNull(iCardAdapter, "cardAdapter");
        this.f24392d.add(new C53085d(C13615c.f35773a.getString(R.string.Doc_Facade_Edit), ReactionHelper.f24886a.mo35350a("EDIT"), new C9068e(this, iCardAdapter.getData().get(i), iCardAdapter, iCardAdapter.findReplyIdByPosition(i))));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo34646a(CommentBean.CommentDetail commentDetail) {
        Intrinsics.checkParameterIsNotNull(commentDetail, "commentDetail");
        return TextUtils.equals(commentDetail.getUser_id(), this.f24393e) || TextUtils.equals(commentDetail.getUser_id(), C9185d.m37997a().mo34731d());
    }

    /* renamed from: a */
    public final void mo34635a(IGetPermissionCallback gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "permissionCallback");
        gVar.mo34667a(new C9221b(this.f24402n.mo35335m().mo17183a(), this.f24402n.mo35335m().mo17184b()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo34637a(ICardAdapter iCardAdapter, CommentBean.CommentDetail commentDetail, int i, List<C53085d> list) {
        String str;
        Intrinsics.checkParameterIsNotNull(iCardAdapter, "cardAdapter");
        Intrinsics.checkParameterIsNotNull(commentDetail, "item");
        Intrinsics.checkParameterIsNotNull(list, "operationMenuList");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = false;
        if (CommentTranslate.f24837a.mo35295d(this.f24402n.mo35342t(), commentDetail)) {
            booleanRef.element = true;
            str = C13615c.f35773a.getString(R.string.Doc_Comment_OriginalTitle);
        } else if (CommentTranslate.f24837a.mo35296e(this.f24402n.mo35342t(), commentDetail)) {
            str = C13615c.f35773a.getString(R.string.Doc_Comment_PackUpTranslation);
        } else {
            str = C13615c.f35773a.getString(R.string.Doc_Comment_Translate_Str);
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "if (CommentTranslate.rea…_Translate_Str)\n        }");
        list.add(new C53085d(str, ReactionHelper.f24886a.mo35350a("TRANSLATE"), new C9073h(this, booleanRef, commentDetail, iCardAdapter, i)));
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentFunction
    /* renamed from: a */
    public void mo34638a(ICardAdapter iCardAdapter, String str, CommentBean.CommentDetail commentDetail, View view) {
        Intrinsics.checkParameterIsNotNull(iCardAdapter, "cardAdapter");
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        Intrinsics.checkParameterIsNotNull(commentDetail, "commentDetail");
        if (commentDetail.getReactionFlowData() == null) {
            C13479a.m54764b("AbsCommentFunction", "clickReaction: reactions data is null");
            return;
        }
        if (!m37638c(commentDetail.getReply_id(), str)) {
            ar.m20936a().mo41508c(ak.class).mo238020d(new C9082o(str)).mo238001b(C9083p.f24466a, C9084q.f24467a);
            if (TextUtils.isEmpty(commentDetail.getReaction_type()) || TextUtils.isEmpty(commentDetail.getReferKey())) {
                C13479a.m54758a("AbsCommentFunction", "clickReaction: failed :commentDetail.referType = " + commentDetail.getReaction_type() + ",commentDetail.referKey = " + commentDetail.getReferKey());
            } else {
                DataControl cVar = this.f24404p;
                String referKey = commentDetail.getReferKey();
                Intrinsics.checkExpressionValueIsNotNull(referKey, "commentDetail.referKey");
                AbstractC68307f<String> a = m37633a(cVar.mo34695a(referKey, str));
                if (a != null) {
                    a.mo238001b(new C9080m(this, str, iCardAdapter, commentDetail, view), new C9081n(str));
                }
            }
        } else if (TextUtils.isEmpty(commentDetail.getReaction_type()) || TextUtils.isEmpty(commentDetail.getReferKey())) {
            C13479a.m54758a("AbsCommentFunction", "clickReaction: failed :commentDetail.referType = " + commentDetail.getReaction_type() + ",commentDetail.referKey = " + commentDetail.getReferKey());
        } else {
            DataControl cVar2 = this.f24404p;
            String referKey2 = commentDetail.getReferKey();
            Intrinsics.checkExpressionValueIsNotNull(referKey2, "commentDetail.referKey");
            cVar2.mo34709b(referKey2, str).mo238001b(new C9078k(this, str, iCardAdapter, commentDetail), new C9079l(this, str));
        }
        String reply_id = commentDetail.getReply_id();
        Intrinsics.checkExpressionValueIsNotNull(reply_id, "commentDetail.reply_id");
        List<C53061a> reactionFlowData = commentDetail.getReactionFlowData();
        Intrinsics.checkExpressionValueIsNotNull(reactionFlowData, "commentDetail.reactionFlowData");
        mo34641a(reply_id, reactionFlowData);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentFunction
    /* renamed from: a */
    public void mo34633a(FragmentManager fragmentManager, CommentBean.CommentDetail commentDetail, String str) {
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fragmentManager");
        Intrinsics.checkParameterIsNotNull(commentDetail, "commentDetail");
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        if (TextUtils.isEmpty(commentDetail.getReaction_type()) || TextUtils.isEmpty(commentDetail.getReferKey())) {
            C13479a.m54758a("AbsCommentFunction", "clickReactionDetail failed:commentDetail.referType = " + commentDetail.getReaction_type() + ",commentDetail.referKey = " + commentDetail.getReferKey());
            return;
        }
        AbstractC9106c a = C9185d.m37997a();
        Intrinsics.checkExpressionValueIsNotNull(a, "CommentServiceImpl.getCommentService()");
        if (a.mo34729b()) {
            C13479a.m54764b("AbsCommentFunction", "clickReactionDetail is guest");
            return;
        }
        if (!commentDetail.isFull()) {
            DataControl cVar = this.f24404p;
            String reaction_type = commentDetail.getReaction_type();
            Intrinsics.checkExpressionValueIsNotNull(reaction_type, "commentDetail.reaction_type");
            String referKey = commentDetail.getReferKey();
            Intrinsics.checkExpressionValueIsNotNull(referKey, "commentDetail.referKey");
            cVar.mo34713c(reaction_type, referKey).mo238001b(new C9085r(this, str), new C9086s(str));
        }
        C53002b a2 = C53002b.m205273a(commentDetail.getReactionDetailData(), str);
        a2.mo181046a(new C9087t(this));
        a2.mo181043a(new DialogInterface$OnDismissListenerC9088u(this));
        a2.mo5511a(fragmentManager, "REACTION_DETAIL");
        DataControl cVar2 = this.f24404p;
        String reaction_type2 = commentDetail.getReaction_type();
        Intrinsics.checkExpressionValueIsNotNull(reaction_type2, "commentDetail.reaction_type");
        String referKey2 = commentDetail.getReferKey();
        Intrinsics.checkExpressionValueIsNotNull(referKey2, "commentDetail.referKey");
        cVar2.mo34694a(1, reaction_type2, referKey2).mo238001b(C9091v.f24475a, C9092w.f24476a);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentFunction
    /* renamed from: a */
    public void mo34641a(String str, List<? extends C53061a> list) {
        Intrinsics.checkParameterIsNotNull(str, "replyId");
        Intrinsics.checkParameterIsNotNull(list, "reactions");
        this.f24401m.put(str, list);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentFunction
    /* renamed from: k */
    public void mo34660k() {
        this.f24400l.onBackPressed();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/middleground/comment/control/CommentFunction$addEditItem$editItem$1", "Lcom/ss/android/lark/reaction/widget/panel/ReactionPanelMenuItem$DialogItemClickListener;", "onMenuItemClick", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$e */
    public static final class C9068e implements C53085d.AbstractC53086a {

        /* renamed from: a */
        final /* synthetic */ CommentFunction f24434a;

        /* renamed from: b */
        final /* synthetic */ CommentBean.CommentDetail f24435b;

        /* renamed from: c */
        final /* synthetic */ ICardAdapter f24436c;

        /* renamed from: d */
        final /* synthetic */ String f24437d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$e$b */
        static final class C9070b extends Lambda implements Function0<Unit> {
            final /* synthetic */ C9068e this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9070b(C9068e eVar) {
                super(0);
                this.this$0 = eVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                this.this$0.f24434a.mo34651c().invoke();
            }
        }

        @Override // com.ss.android.lark.reaction.widget.panel.C53085d.AbstractC53086a
        public void onMenuItemClick() {
            C9069a aVar = new C9069a(this);
            C9070b bVar = new C9070b(this);
            List<CommentBean.CommentDetail> last3Item = this.f24436c.getLast3Item(this.f24437d);
            if (last3Item.size() != 0) {
                this.f24434a.mo34661l().mo35325e().mo35302a("edit_click", this.f24436c.getCommentId(this.f24435b), this.f24437d, null);
                CommentFunction bVar2 = this.f24434a;
                CommentFunction.m37635a(bVar2, bVar2.mo34661l(), this.f24434a.mo34662m(), this.f24434a.mo34663n(), this.f24436c.getCommentId(this.f24435b), last3Item, this.f24434a.mo34659j(), aVar, bVar, null, null, null, null, 3840, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$e$a */
        static final class C9069a extends Lambda implements Function2<String, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>, Unit> {
            final /* synthetic */ C9068e this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9069a(C9068e eVar) {
                super(2);
                this.this$0 = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list) {
                invoke(str, list);
                return Unit.INSTANCE;
            }

            public final void invoke(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list) {
                Intrinsics.checkParameterIsNotNull(str, "<anonymous parameter 0>");
                this.this$0.f24435b.setEditStatus(false);
            }
        }

        C9068e(CommentFunction bVar, CommentBean.CommentDetail commentDetail, ICardAdapter iCardAdapter, String str) {
            this.f24434a = bVar;
            this.f24435b = commentDetail;
            this.f24436c = iCardAdapter;
            this.f24437d = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$ab */
    static final class C9050ab extends Lambda implements Function0<Unit> {
        final /* synthetic */ CommentFunction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9050ab(CommentFunction bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo34651c().invoke();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$ag */
    public static final class C9055ag implements AbstractC68309a {

        /* renamed from: a */
        final /* synthetic */ boolean f24409a;

        /* renamed from: b */
        final /* synthetic */ Function0 f24410b;

        C9055ag(boolean z, Function0 function0) {
            this.f24409a = z;
            this.f24410b = function0;
        }

        @Override // io.reactivex.functions.AbstractC68309a
        public final void run() {
            if (this.f24409a) {
                this.f24410b.invoke();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$z */
    public static final class C9095z extends Lambda implements Function0<Unit> {
        final /* synthetic */ CommentFunction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9095z(CommentFunction bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            DetailComment bVar = this.this$0.f24390a;
            if (bVar != null) {
                bVar.mo34892b();
            }
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentFunction
    /* renamed from: g */
    public void mo34656g() {
        PopupWindow popupWindow = this.f24396h;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        Dialog dialog = this.f24399k;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentFunction
    /* renamed from: i */
    public String mo34658i() {
        if (mo34657h()) {
            return this.f24398j;
        }
        return null;
    }

    /* renamed from: j */
    public boolean mo34659j() {
        if (this.f24402n.mo35333k() == 0) {
            return true;
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/middleground/comment/control/CommentFunction$addDeleteItem$deleteItem$1", "Lcom/ss/android/lark/reaction/widget/panel/ReactionPanelMenuItem$DialogItemClickListener;", "onMenuItemClick", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$d */
    public static final class C9067d implements C53085d.AbstractC53086a {

        /* renamed from: a */
        final /* synthetic */ CommentFunction f24431a;

        /* renamed from: b */
        final /* synthetic */ ICardAdapter f24432b;

        /* renamed from: c */
        final /* synthetic */ CommentBean.CommentDetail f24433c;

        @Override // com.ss.android.lark.reaction.widget.panel.C53085d.AbstractC53086a
        public void onMenuItemClick() {
            CommentFunction bVar = this.f24431a;
            String commentId = this.f24432b.getCommentId(this.f24433c);
            String reply_id = this.f24433c.getReply_id();
            Intrinsics.checkExpressionValueIsNotNull(reply_id, "commentDetail.reply_id");
            bVar.mo34650b(commentId, reply_id);
        }

        C9067d(CommentFunction bVar, ICardAdapter iCardAdapter, CommentBean.CommentDetail commentDetail) {
            this.f24431a = bVar;
            this.f24432b = iCardAdapter;
            this.f24433c = commentDetail;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$g */
    public static final class C9072g implements C53085d.AbstractC53086a {

        /* renamed from: a */
        final /* synthetic */ CommentFunction f24441a;

        /* renamed from: b */
        final /* synthetic */ ICardAdapter f24442b;

        /* renamed from: c */
        final /* synthetic */ CommentBean.CommentDetail f24443c;

        C9072g(CommentFunction bVar, ICardAdapter iCardAdapter, CommentBean.CommentDetail commentDetail) {
            this.f24441a = bVar;
            this.f24442b = iCardAdapter;
            this.f24443c = commentDetail;
        }

        @Override // com.ss.android.lark.reaction.widget.panel.C53085d.AbstractC53086a
        public final void onMenuItemClick() {
            CommentFunction bVar = this.f24441a;
            CommentFunction.m37634a(bVar, bVar.mo34663n(), this.f24442b.getCommentId(this.f24443c), this.f24443c.isWholeComment(), (Function0) null, 8, (Object) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onBackPressed"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$i */
    static final class C9076i implements AbstractC7666d {

        /* renamed from: a */
        final /* synthetic */ CommentFunction f24451a;

        C9076i(CommentFunction bVar) {
            this.f24451a = bVar;
        }

        @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
        public final boolean onBackPressed() {
            PopupWindow d = this.f24451a.mo34653d();
            if (d == null || !d.isShowing()) {
                return false;
            }
            PopupWindow d2 = this.f24451a.mo34653d();
            if (d2 != null) {
                d2.dismiss();
            }
            return true;
        }
    }

    /* renamed from: h */
    public boolean mo34657h() {
        PopupWindow popupWindow = this.f24396h;
        if (popupWindow != null && popupWindow.isShowing()) {
            return true;
        }
        Dialog dialog = this.f24399k;
        if (dialog == null || !dialog.isShowing()) {
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/middleground/comment/control/CommentFunction$addCopyItem$copyItem$1", "Lcom/ss/android/lark/reaction/widget/panel/ReactionPanelMenuItem$DialogItemClickListener;", "onMenuItemClick", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$c */
    public static final class C9066c implements C53085d.AbstractC53086a {

        /* renamed from: a */
        final /* synthetic */ CommentFunction f24427a;

        /* renamed from: b */
        final /* synthetic */ boolean f24428b;

        /* renamed from: c */
        final /* synthetic */ TextView f24429c;

        /* renamed from: d */
        final /* synthetic */ boolean f24430d;

        @Override // com.ss.android.lark.reaction.widget.panel.C53085d.AbstractC53086a
        public void onMenuItemClick() {
            if (!this.f24428b) {
                Toast.showText(this.f24429c.getContext(), (int) R.string.CreationMobile_ECM_AdminDisableToast);
            } else if (!this.f24430d) {
                Toast.showFailureText(this.f24429c.getContext(), (int) R.string.Doc_Comment_CopyFailed);
            } else {
                String replace = new Regex("<doc.at.~#_%=`>").replace(this.f24429c.getText().toString(), "");
                this.f24427a.mo34662m().mo34279C().invoke(replace);
                ClipData newPlainText = ClipData.newPlainText(null, replace);
                Object systemService = this.f24429c.getContext().getSystemService("clipboard");
                if (systemService != null) {
                    ((ClipboardManager) systemService).setPrimaryClip(newPlainText);
                    Toast.showSuccessText(this.f24429c.getContext(), this.f24429c.getContext().getString(R.string.Doc_Comment_CopySuccess), 0);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ClipboardManager");
            }
        }

        C9066c(CommentFunction bVar, boolean z, TextView textView, boolean z2) {
            this.f24427a = bVar;
            this.f24428b = z;
            this.f24429c = textView;
            this.f24430d = z2;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$f */
    public static final class C9071f implements C53085d.AbstractC53086a {

        /* renamed from: a */
        final /* synthetic */ CommentFunction f24438a;

        /* renamed from: b */
        final /* synthetic */ CommentBean.CommentDetail f24439b;

        /* renamed from: c */
        final /* synthetic */ ICardAdapter f24440c;

        C9071f(CommentFunction bVar, CommentBean.CommentDetail commentDetail, ICardAdapter iCardAdapter) {
            this.f24438a = bVar;
            this.f24439b = commentDetail;
            this.f24440c = iCardAdapter;
        }

        @Override // com.ss.android.lark.reaction.widget.panel.C53085d.AbstractC53086a
        public final void onMenuItemClick() {
            String str = "@" + this.f24439b.getName();
            int i = 0;
            C4517a a = new C4517a.C4518a().mo17391a(0).mo17395b(str.length()).mo17398c(0).mo17392a(this.f24439b.getUser_id()).mo17399c(str).mo17394a();
            String str2 = new C7834f().apply(new C7827a(str, new C4517a[]{a}, new C7838i[0])) + " ";
            CommentInputRequest commentInputRequest = new CommentInputRequest();
            commentInputRequest.comment_id = this.f24439b.getComment_id();
            commentInputRequest.is_whole = this.f24439b.isWholeComment();
            commentInputRequest.show_comment_image = this.f24438a.mo34661l().mo35348y();
            commentInputRequest.show_insert_image = this.f24438a.mo34661l().mo35347x();
            commentInputRequest.doc_url = this.f24438a.mo34661l().mo35331i();
            commentInputRequest.keyboard_pop = true;
            commentInputRequest.show_voice = true;
            if (!this.f24439b.isWholeComment()) {
                i = 2;
            }
            commentInputRequest.type = i;
            commentInputRequest.canUseBlankContent = true;
            commentInputRequest.directional_reply_id = this.f24439b.getReply_id();
            commentInputRequest.content = str2;
            commentInputRequest.bizParams = this.f24440c.getBizParam();
            this.f24438a.mo34661l().mo35325e().mo35302a("addition_click", this.f24439b.getComment_id(), this.f24439b.getReply_id(), null);
            this.f24438a.mo34662m().mo34290N().invoke(commentInputRequest);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$h */
    public static final class C9073h implements C53085d.AbstractC53086a {

        /* renamed from: a */
        final /* synthetic */ CommentFunction f24444a;

        /* renamed from: b */
        final /* synthetic */ Ref.BooleanRef f24445b;

        /* renamed from: c */
        final /* synthetic */ CommentBean.CommentDetail f24446c;

        /* renamed from: d */
        final /* synthetic */ ICardAdapter f24447d;

        /* renamed from: e */
        final /* synthetic */ int f24448e;

        C9073h(CommentFunction bVar, Ref.BooleanRef booleanRef, CommentBean.CommentDetail commentDetail, ICardAdapter iCardAdapter, int i) {
            this.f24444a = bVar;
            this.f24445b = booleanRef;
            this.f24446c = commentDetail;
            this.f24447d = iCardAdapter;
            this.f24448e = i;
        }

        @Override // com.ss.android.lark.reaction.widget.panel.C53085d.AbstractC53086a
        public final void onMenuItemClick() {
            RecyclerView.Adapter adapter = null;
            if (this.f24445b.element) {
                CommentTranslate.f24837a.mo35291a().put(this.f24446c.getReply_id(), true);
                ICardAdapter iCardAdapter = this.f24447d;
                if (!(iCardAdapter instanceof RecyclerView.Adapter)) {
                    iCardAdapter = null;
                }
                RecyclerView.Adapter adapter2 = (RecyclerView.Adapter) iCardAdapter;
                if (adapter2 != null) {
                    adapter2.notifyItemChanged(this.f24448e);
                }
                this.f24444a.mo34661l().mo35325e().mo35302a("cancel_translate_click", this.f24447d.getCommentId(this.f24446c), this.f24446c.getReply_id(), null);
            } else if (CommentTranslate.f24837a.mo35296e(this.f24444a.mo34661l().mo35342t(), this.f24446c)) {
                CommentTranslate.f24837a.mo35291a().put(this.f24446c.getReply_id(), Boolean.valueOf(true ^ Intrinsics.areEqual((Object) CommentTranslate.f24837a.mo35291a().get(this.f24446c.getReply_id()), (Object) true)));
                ICardAdapter iCardAdapter2 = this.f24447d;
                if (!(iCardAdapter2 instanceof RecyclerView.Adapter)) {
                    iCardAdapter2 = null;
                }
                RecyclerView.Adapter adapter3 = (RecyclerView.Adapter) iCardAdapter2;
                if (adapter3 != null) {
                    adapter3.notifyItemChanged(this.f24448e);
                }
                this.f24444a.mo34661l().mo35325e().mo35302a("cancel_translate_click", this.f24447d.getCommentId(this.f24446c), this.f24446c.getReply_id(), null);
            } else if (TextUtils.isEmpty(this.f24446c.getTranslate_content())) {
                DataControl n = this.f24444a.mo34663n();
                String commentId = this.f24447d.getCommentId(this.f24446c);
                String reply_id = this.f24446c.getReply_id();
                Intrinsics.checkExpressionValueIsNotNull(reply_id, "item.reply_id");
                n.mo34715d(commentId, reply_id).mo238001b(new Consumer<String>(this) {
                    /* class com.bytedance.ee.bear.middleground.comment.control.CommentFunction.C9073h.C90741 */

                    /* renamed from: a */
                    final /* synthetic */ C9073h f24449a;

                    {
                        this.f24449a = r1;
                    }

                    /* renamed from: a */
                    public final void accept(String str) {
                        DataControl n = this.f24449a.f24444a.mo34663n();
                        Intrinsics.checkExpressionValueIsNotNull(str, "it");
                        n.mo34705a(str, Action.TRANSLATE);
                    }
                }, C90752.f24450a);
            } else {
                CommentTranslate.f24837a.mo35291a().remove(this.f24446c.getReply_id());
                ICardAdapter iCardAdapter3 = this.f24447d;
                if (iCardAdapter3 instanceof RecyclerView.Adapter) {
                    adapter = iCardAdapter3;
                }
                RecyclerView.Adapter adapter4 = adapter;
                if (adapter4 != null) {
                    adapter4.notifyItemChanged(this.f24448e);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/comment/control/CommentFunction$showReaction$1", "Lcom/bytedance/ee/bear/middleground/comment/control/IGetPermissionCallback;", "onGetPermissionResult", "", "permission", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentPermission;", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$ah */
    public static final class C9056ah implements IGetPermissionCallback {

        /* renamed from: a */
        final /* synthetic */ CommentFunction f24411a;

        /* renamed from: b */
        final /* synthetic */ ICardAdapter f24412b;

        /* renamed from: c */
        final /* synthetic */ int f24413c;

        /* renamed from: d */
        final /* synthetic */ CommentBean.CommentDetail f24414d;

        /* renamed from: e */
        final /* synthetic */ View f24415e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$ah$d */
        static final class C9065d<T> implements Consumer<Throwable> {

            /* renamed from: a */
            public static final C9065d f24426a = new C9065d();

            C9065d() {
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                C13479a.m54759a("AbsCommentFunction", "showReaction fail:", th);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "e", "Lio/reactivex/FlowableEmitter;", "Lcom/ss/android/lark/reaction/widget/panel/ReactionPanelFacade$Builder;", "kotlin.jvm.PlatformType", "subscribe"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$ah$a */
        static final class C9057a<T> implements AbstractC68324h<T> {

            /* renamed from: a */
            final /* synthetic */ C9056ah f24416a;

            C9057a(C9056ah ahVar) {
                this.f24416a = ahVar;
            }

            @Override // io.reactivex.AbstractC68324h
            public final void subscribe(AbstractC68323g<ReactionPanelFacade.C53071a> gVar) {
                Intrinsics.checkParameterIsNotNull(gVar, "e");
                gVar.onNext(new ReactionPanelFacade.C53071a(this.f24416a.f24415e).mo181310a(false).mo181315c(this.f24416a.f24411a.mo34628a()));
                gVar.onComplete();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/ss/android/lark/reaction/widget/panel/ReactionPanelFacade$Builder;", "kotlin.jvm.PlatformType", "build", "apply"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$ah$b */
        static final class C9058b<T, R> implements Function<T, AbstractC70020b<? extends R>> {

            /* renamed from: a */
            final /* synthetic */ C9056ah f24417a;

            /* renamed from: b */
            final /* synthetic */ C9221b f24418b;

            C9058b(C9056ah ahVar, C9221b bVar) {
                this.f24417a = ahVar;
                this.f24418b = bVar;
            }

            /* renamed from: a */
            public final AbstractC68307f<ReactionPanelFacade.C53071a> apply(final ReactionPanelFacade.C53071a aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "build");
                if (!this.f24417a.f24411a.mo34661l().mo35341s() || !this.f24418b.mo35256b()) {
                    return AbstractC68307f.m265083a(aVar);
                }
                return ar.m20936a().mo41508c(ak.class).mo238020d(C90591.f24419a).mo238020d(new Function<T, R>(this) {
                    /* class com.bytedance.ee.bear.middleground.comment.control.CommentFunction.C9056ah.C9058b.C90602 */

                    /* renamed from: a */
                    final /* synthetic */ C9058b f24420a;

                    {
                        this.f24420a = r1;
                    }

                    /* renamed from: a */
                    public final ReactionPanelFacade.C53071a apply(C0844e<List<String>, List<String>> eVar) {
                        Intrinsics.checkParameterIsNotNull(eVar, "hostService");
                        aVar.mo181309a((List<String>) eVar.f3317a).mo181313b(eVar.f3318b).mo181308a(new AbsReactionClickListener(this) {
                            /* class com.bytedance.ee.bear.middleground.comment.control.CommentFunction.C9056ah.C9058b.C90602.C90611 */

                            /* renamed from: a */
                            final /* synthetic */ C90602 f24422a;

                            /* JADX WARN: Incorrect args count in method signature: ()V */
                            {
                                this.f24422a = r1;
                            }

                            @Override // com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade.AbstractC53072b
                            /* renamed from: a */
                            public void mo22764a(String str, int i) {
                                Intrinsics.checkParameterIsNotNull(str, "reactionKey");
                                this.f24422a.f24420a.f24417a.f24411a.mo34638a(this.f24422a.f24420a.f24417a.f24412b, str, this.f24422a.f24420a.f24417a.f24414d, this.f24422a.f24420a.f24417a.f24415e);
                            }
                        });
                        return aVar;
                    }
                });
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "builder", "Lcom/ss/android/lark/reaction/widget/panel/ReactionPanelFacade$Builder;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$ah$c */
        static final class C9062c<T> implements Consumer<ReactionPanelFacade.C53071a> {

            /* renamed from: a */
            final /* synthetic */ C9056ah f24423a;

            C9062c(C9056ah ahVar) {
                this.f24423a = ahVar;
            }

            /* renamed from: a */
            public final void accept(ReactionPanelFacade.C53071a aVar) {
                ReactionPanelFacade a = aVar.mo181311a();
                a.mo181302a(new PopupWindow.OnDismissListener(this) {
                    /* class com.bytedance.ee.bear.middleground.comment.control.CommentFunction.C9056ah.C9062c.C90631 */

                    /* renamed from: a */
                    final /* synthetic */ C9062c f24424a;

                    {
                        this.f24424a = r1;
                    }

                    public final void onDismiss() {
                        AbstractC7665c e = this.f24424a.f24423a.f24411a.mo34654e();
                        if (e != null) {
                            e.mo30122b(this.f24424a.f24423a.f24411a.mo34655f());
                        }
                    }
                });
                this.f24423a.f24411a.mo34632a(a.mo181299a(false, 81, 0, ((int) (((float) C52990a.m205238c(C13615c.f35773a)) - this.f24423a.f24411a.mo34647b())) + C13749l.m55738a(20)));
                PopupWindow d = this.f24423a.f24411a.mo34653d();
                if (d != null) {
                    d.setOnDismissListener(new PopupWindow.OnDismissListener(this) {
                        /* class com.bytedance.ee.bear.middleground.comment.control.CommentFunction.C9056ah.C9062c.C90642 */

                        /* renamed from: a */
                        final /* synthetic */ C9062c f24425a;

                        {
                            this.f24425a = r1;
                        }

                        public final void onDismiss() {
                            this.f24425a.f24423a.f24411a.f24391b = System.currentTimeMillis();
                        }
                    });
                }
                this.f24423a.f24411a.mo34634a((AbstractC7665c) AbstractC7710h.C7711a.m30833a(this.f24423a.f24411a.mo34661l().mo35279a(), AbstractC7665c.class));
                AbstractC7665c e = this.f24423a.f24411a.mo34654e();
                if (e != null) {
                    e.mo30121a(this.f24423a.f24411a.mo34655f());
                }
                this.f24423a.f24411a.mo34661l().mo35325e().mo35303a("show_reaction_panel", null, this.f24423a.f24412b.getCommentId(this.f24423a.f24414d), this.f24423a.f24414d.getReply_id(), false);
            }
        }

        @Override // com.bytedance.ee.bear.middleground.comment.control.IGetPermissionCallback
        /* renamed from: a */
        public void mo34667a(C9221b bVar) {
            boolean z;
            AbstractC9106c a;
            Intrinsics.checkParameterIsNotNull(bVar, "permission");
            Resources resources = this.f24411a.mo34661l().mo35279a().getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "config.activity.resources");
            if (resources.getConfiguration().orientation != 2 || C13653a.m55399c(this.f24411a.mo34661l().mo35279a())) {
                z = true;
            } else {
                z = false;
            }
            if (bVar.mo35256b() && z && ((a = C9185d.m37997a()) == null || !a.mo34729b())) {
                this.f24411a.mo34652c(this.f24412b, this.f24413c);
            }
            if (this.f24414d.isWholeComment()) {
                this.f24411a.mo34648b(this.f24412b, this.f24413c);
            }
            if (!TextUtils.isEmpty(this.f24414d.getContent())) {
                this.f24411a.mo34631a(this.f24415e, bVar.mo35255a(), this.f24411a.mo34628a());
            }
            if (this.f24411a.mo34646a(this.f24414d) && bVar.mo35256b() && z) {
                ICommentListeners m = this.f24411a.mo34662m();
                if (m != null) {
                    ((Comment) m).mo34298a(this.f24413c);
                    this.f24411a.mo34624a(this.f24412b, this.f24413c);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground.comment.Comment");
                }
            }
            if (CommentTranslate.f24837a.mo35295d(this.f24411a.mo34661l().mo35342t(), this.f24414d) || CommentTranslate.f24837a.mo35296e(this.f24411a.mo34661l().mo35342t(), this.f24414d) || CommentTranslate.f24837a.mo35294c(this.f24411a.mo34661l().mo35342t(), this.f24414d)) {
                CommentFunction bVar2 = this.f24411a;
                bVar2.mo34637a(this.f24412b, this.f24414d, this.f24413c, bVar2.mo34628a());
            }
            if (this.f24411a.mo34646a(this.f24414d) && this.f24411a.mo34661l().mo35335m().mo17186d()) {
                this.f24411a.mo34636a(this.f24412b, this.f24414d);
            }
            if (bVar.mo35256b() && this.f24411a.mo34659j()) {
                this.f24411a.mo34648b(this.f24412b, this.f24413c);
            }
            if (!this.f24411a.mo34628a().isEmpty() || (this.f24411a.mo34661l().mo35341s() && bVar.mo35256b())) {
                this.f24411a.mo34639a(this.f24414d.getReply_id());
                AbstractC68307f.m265080a(new C9057a(this), BackpressureStrategy.BUFFER).mo238014c(new C9058b(this, bVar)).mo237985a(C11678b.m48481e()).mo238001b(new C9062c(this), C9065d.f24426a);
            }
        }

        C9056ah(CommentFunction bVar, ICardAdapter iCardAdapter, int i, CommentBean.CommentDetail commentDetail, View view) {
            this.f24411a = bVar;
            this.f24412b = iCardAdapter;
            this.f24413c = i;
            this.f24414d = commentDetail;
            this.f24415e = view;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$af */
    public static final class C9054af<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C9054af f24408a = new C9054af();

        C9054af() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a("AbsCommentFunction", th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "s", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$p */
    public static final class C9083p<T> implements Consumer<String> {

        /* renamed from: a */
        public static final C9083p f24466a = new C9083p();

        C9083p() {
        }

        /* renamed from: a */
        public final void accept(String str) {
            C13479a.m54772d("AbsCommentFunction", "hostService updateOrder success ");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$q */
    public static final class C9084q<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C9084q f24467a = new C9084q();

        C9084q() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("AbsCommentFunction", "hostService updateOrder fail", th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$v */
    static final class C9091v<T> implements Consumer<String> {

        /* renamed from: a */
        public static final C9091v f24475a = new C9091v();

        C9091v() {
        }

        /* renamed from: a */
        public final void accept(String str) {
            C13479a.m54764b("AbsCommentFunction", "setDetailPanelStatus: status1 succeed!");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$w */
    static final class C9092w<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C9092w f24476a = new C9092w();

        C9092w() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("AbsCommentFunction", "setDetailPanelStatus: status1 failed!", th);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentFunction
    /* renamed from: a */
    public void mo34629a(float f) {
        this.f24394f = f;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "hostService", "Lcom/bytedance/ee/bear/contract/HostService;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$o */
    public static final class C9082o<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ String f24465a;

        C9082o(String str) {
            this.f24465a = str;
        }

        /* renamed from: a */
        public final String apply(ak akVar) {
            Intrinsics.checkParameterIsNotNull(akVar, "hostService");
            akVar.updateOrder(this.f24465a);
            return "";
        }
    }

    /* renamed from: a */
    private final AbstractC68307f<String> m37633a(AbstractC68307f<String> fVar) {
        return fVar.mo238020d(C9077j.f24452a);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$ae */
    public static final class C9053ae<T> implements Consumer<String> {

        /* renamed from: a */
        final /* synthetic */ boolean f24405a;

        /* renamed from: b */
        final /* synthetic */ Function0 f24406b;

        /* renamed from: c */
        final /* synthetic */ DataControl f24407c;

        C9053ae(boolean z, Function0 function0, DataControl cVar) {
            this.f24405a = z;
            this.f24406b = function0;
            this.f24407c = cVar;
        }

        /* renamed from: a */
        public final void accept(String str) {
            if (this.f24405a) {
                this.f24406b.invoke();
            }
            DataControl cVar = this.f24407c;
            Intrinsics.checkExpressionValueIsNotNull(str, "it");
            cVar.mo34705a(str, Action.RESOLVE);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$n */
    public static final class C9081n<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ String f24464a;

        C9081n(String str) {
            this.f24464a = str;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("AbsCommentFunction", "add Reaction: " + this.f24464a + " failed!", th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$s */
    static final class C9086s<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ String f24470a;

        C9086s(String str) {
            this.f24470a = str;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("AbsCommentFunction", "get ReactionDetail: " + this.f24470a + " exception!", th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "userId", "", "kotlin.jvm.PlatformType", "onItemClicked"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$t */
    static final class C9087t implements C53002b.AbstractC53005b {

        /* renamed from: a */
        final /* synthetic */ CommentFunction f24471a;

        C9087t(CommentFunction bVar) {
            this.f24471a = bVar;
        }

        @Override // com.ss.android.lark.reaction.widget.detailwindow.C53002b.AbstractC53005b
        public final void onItemClicked(String str) {
            Function1<String, Unit> function1;
            ICommentListeners m = this.f24471a.mo34662m();
            if (m != null) {
                function1 = m.mo34289M();
            } else {
                function1 = null;
            }
            function1.invoke(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$u */
    static final class DialogInterface$OnDismissListenerC9088u implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ CommentFunction f24472a;

        DialogInterface$OnDismissListenerC9088u(CommentFunction bVar) {
            this.f24472a = bVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f24472a.mo34663n().mo34694a(0, "", "").mo238001b(C90891.f24473a, C90902.f24474a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$j */
    public static final class C9077j<T, R> implements Function<T, R> {

        /* renamed from: a */
        public static final C9077j f24452a = new C9077j();

        C9077j() {
        }

        /* renamed from: a */
        public final String apply(String str) {
            ReactionDataEntity.Entity.BodyEntity body;
            Integer code;
            Intrinsics.checkParameterIsNotNull(str, "it");
            ReactionDataEntity.Entity data = ((ReactionDataEntity) JSON.parseObject(str, ReactionDataEntity.class)).getData();
            if (data != null && (body = data.getBody()) != null && (code = body.getCode()) != null && code.intValue() == 0) {
                return "success";
            }
            throw new RuntimeException(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$k */
    public static final class C9078k<T> implements Consumer<String> {

        /* renamed from: a */
        final /* synthetic */ CommentFunction f24453a;

        /* renamed from: b */
        final /* synthetic */ String f24454b;

        /* renamed from: c */
        final /* synthetic */ ICardAdapter f24455c;

        /* renamed from: d */
        final /* synthetic */ CommentBean.CommentDetail f24456d;

        C9078k(CommentFunction bVar, String str, ICardAdapter iCardAdapter, CommentBean.CommentDetail commentDetail) {
            this.f24453a = bVar;
            this.f24454b = str;
            this.f24455c = iCardAdapter;
            this.f24456d = commentDetail;
        }

        /* renamed from: a */
        public final void accept(String str) {
            this.f24453a.mo34661l().mo35325e().mo35302a("cancel_reaction_comment", this.f24455c.getCommentId(this.f24456d), this.f24456d.getReply_id(), MapsKt.mutableMapOf(new Pair("emoji", this.f24454b)));
            C13479a.m54764b("AbsCommentFunction", "delete Reaction: " + this.f24454b + " succeed!");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$l */
    public static final class C9079l<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ CommentFunction f24457a;

        /* renamed from: b */
        final /* synthetic */ String f24458b;

        C9079l(CommentFunction bVar, String str) {
            this.f24457a = bVar;
            this.f24458b = str;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Toast.showText(this.f24457a.mo34661l().mo35279a(), "delete Reaction: " + this.f24458b + "failed!!", 0);
            C13479a.m54759a("AbsCommentFunction", "delete Reaction: " + this.f24458b + " failed!", th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$m */
    public static final class C9080m<T> implements Consumer<String> {

        /* renamed from: a */
        final /* synthetic */ CommentFunction f24459a;

        /* renamed from: b */
        final /* synthetic */ String f24460b;

        /* renamed from: c */
        final /* synthetic */ ICardAdapter f24461c;

        /* renamed from: d */
        final /* synthetic */ CommentBean.CommentDetail f24462d;

        /* renamed from: e */
        final /* synthetic */ View f24463e;

        C9080m(CommentFunction bVar, String str, ICardAdapter iCardAdapter, CommentBean.CommentDetail commentDetail, View view) {
            this.f24459a = bVar;
            this.f24460b = str;
            this.f24461c = iCardAdapter;
            this.f24462d = commentDetail;
            this.f24463e = view;
        }

        /* renamed from: a */
        public final void accept(String str) {
            this.f24459a.mo34661l().mo35325e().mo35302a("reaction_comment", this.f24461c.getCommentId(this.f24462d), this.f24462d.getReply_id(), MapsKt.mutableMapOf(new Pair("emoji", this.f24460b)));
            View view = this.f24463e;
            if (view != null) {
                this.f24459a.mo34662m().mo34291O().invoke(view);
            }
            C13479a.m54764b("AbsCommentFunction", "add Reaction: " + this.f24460b + " succeed!");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$r */
    static final class C9085r<T> implements Consumer<String> {

        /* renamed from: a */
        final /* synthetic */ CommentFunction f24468a;

        /* renamed from: b */
        final /* synthetic */ String f24469b;

        C9085r(CommentFunction bVar, String str) {
            this.f24468a = bVar;
            this.f24469b = str;
        }

        /* renamed from: a */
        public final void accept(String str) {
            int i;
            DataEntity.C9219Entity data;
            DataEntity.C9219Entity.BodyEntity body;
            DataEntity dataEntity = (DataEntity) JSON.parseObject(str, DataEntity.class);
            if (dataEntity == null || (data = dataEntity.getData()) == null || (body = data.getBody()) == null) {
                i = -1;
            } else {
                i = body.getCode();
            }
            if (i == 0) {
                CommentFunction bVar = this.f24468a;
                Intrinsics.checkExpressionValueIsNotNull(dataEntity, "result");
                DataEntity.C9219Entity data2 = dataEntity.getData();
                Intrinsics.checkExpressionValueIsNotNull(data2, "result.data");
                DataEntity.C9219Entity.BodyEntity body2 = data2.getBody();
                Intrinsics.checkExpressionValueIsNotNull(body2, "result.data.body");
                bVar.mo34649b(body2.getData());
                C13479a.m54764b("AbsCommentFunction", "get ReactionDetail: " + this.f24469b + " succeed!");
                return;
            }
            C13479a.m54758a("AbsCommentFunction", "get ReactionDetail: " + this.f24469b + " failed! result = " + str);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentFunction
    /* renamed from: b */
    public void mo34649b(String str) {
        Boolean bool;
        if (TextUtils.isEmpty(str)) {
            C13479a.m54764b("AbsCommentFunction", "updateReactionDetail: data isEmpty");
            return;
        }
        Fragment findFragmentByTag = this.f24402n.mo35279a().getSupportFragmentManager().findFragmentByTag("REACTION_DETAIL");
        if (findFragmentByTag == null || !findFragmentByTag.isResumed()) {
            StringBuilder sb = new StringBuilder();
            sb.append("handle(): detailFragment is ");
            if (findFragmentByTag != null) {
                bool = Boolean.valueOf(findFragmentByTag.isResumed());
            } else {
                bool = null;
            }
            sb.append(bool);
            C13479a.m54764b("AbsCommentFunction", sb.toString());
            return;
        }
        try {
            List<ReactionDetailViewModel> a = ReactionHelper.f24886a.mo35351a(JSON.parseArray(str, Reaction.class));
            C13479a.m54764b("AbsCommentFunction", "updateReactionDetail: " + str);
            ((C53002b) findFragmentByTag).mo181047a(a);
        } catch (Exception e) {
            C13479a.m54765b("AbsCommentFunction", "updateReactionDetail:", e);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentFunction
    /* renamed from: a */
    public AbstractC10460a.AbstractC10461a mo34627a(C8969a.AbstractC8970a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        FragmentActivity a = this.f24402n.mo35279a();
        AbstractC9106c a2 = C9185d.m37997a();
        boolean z = true;
        if (a2 == null || !a2.mo34729b()) {
            z = false;
        }
        C8969a aVar2 = new C8969a(a, z);
        aVar2.mo34411a(aVar);
        return aVar2;
    }

    /* renamed from: a */
    public final void mo34632a(PopupWindow popupWindow) {
        this.f24396h = popupWindow;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$aa */
    static final class C9049aa extends Lambda implements Function2<String, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>, Unit> {
        final /* synthetic */ CommentBean.CommentDetail $commentDetail;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9049aa(CommentBean.CommentDetail commentDetail) {
            super(2);
            this.$commentDetail = commentDetail;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list) {
            invoke(str, list);
            return Unit.INSTANCE;
        }

        public final void invoke(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list) {
            Intrinsics.checkParameterIsNotNull(str, "<anonymous parameter 0>");
            this.$commentDetail.setEditStatus(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "content", "", "images", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.b$y */
    public static final class C9094y extends Lambda implements Function2<String, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>, Unit> {
        final /* synthetic */ ICommentListeners $commentListeners;
        final /* synthetic */ Function2 $edit;
        final /* synthetic */ boolean $isWhole;
        final /* synthetic */ Function0 $updateWhole;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9094y(boolean z, Function0 function0, ICommentListeners fVar, Function2 kVar) {
            super(2);
            this.$isWhole = z;
            this.$updateWhole = function0;
            this.$commentListeners = fVar;
            this.$edit = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list) {
            invoke(str, list);
            return Unit.INSTANCE;
        }

        public final void invoke(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            if (this.$isWhole) {
                this.$updateWhole.invoke();
            }
            this.$commentListeners.mo34288L().invoke(false);
            this.$edit.invoke(str, list);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentFunction
    /* renamed from: b */
    public void mo34650b(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        Intrinsics.checkParameterIsNotNull(str2, "replyId");
        this.f24399k = RetryCell.f24184a.mo34419a(this.f24402n, this.f24404p, str, str2);
    }

    /* renamed from: b */
    public final void mo34648b(ICardAdapter iCardAdapter, int i) {
        Intrinsics.checkParameterIsNotNull(iCardAdapter, "cardAdapter");
        this.f24392d.add(new C53085d(C13615c.f35773a.getString(R.string.Doc_Facade_Resolve), ReactionHelper.f24886a.mo35350a("RESOLVE"), new C9072g(this, iCardAdapter, iCardAdapter.getData().get(i))));
    }

    /* renamed from: c */
    public final void mo34652c(ICardAdapter iCardAdapter, int i) {
        Intrinsics.checkParameterIsNotNull(iCardAdapter, "cardAdapter");
        this.f24392d.add(new C53085d(C13615c.f35773a.getText(R.string.Doc_Comment_Reaction_Reply).toString(), ReactionHelper.f24886a.mo35350a("REPLY"), new C9071f(this, iCardAdapter.getData().get(i), iCardAdapter)));
    }

    /* renamed from: c */
    private final boolean m37638c(String str, String str2) {
        List<C53061a> list = this.f24401m.get(str);
        if (list != null && !list.isEmpty()) {
            for (T t : list) {
                if (TextUtils.equals(str2, t.f131133a)) {
                    List<C53062b> list2 = t.f131135c;
                    Intrinsics.checkExpressionValueIsNotNull(list2, "it.userInfoList");
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        if (TextUtils.equals(it.next().f131136a, this.f24393e)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    public CommentFunction(Config fVar, ICommentListeners fVar2, DataControl cVar) {
        String str;
        Intrinsics.checkParameterIsNotNull(fVar, "config");
        Intrinsics.checkParameterIsNotNull(fVar2, "commentListeners");
        Intrinsics.checkParameterIsNotNull(cVar, "dataControl");
        this.f24402n = fVar;
        this.f24403o = fVar2;
        this.f24404p = cVar;
        AbstractC9106c a = C9185d.m37997a();
        if (a != null) {
            str = a.mo34730c();
        } else {
            str = null;
        }
        this.f24393e = str;
        this.f24395g = C9051ac.INSTANCE;
        this.f24400l = new C9076i(this);
        this.f24401m = new LinkedHashMap();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo34631a(View view, boolean z, List<C53085d> list) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(list, "operationMenuList");
        View findViewById = view.findViewById(R.id.tv_content);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.tv_content)");
        list.add(new C53085d(C13615c.f35773a.getString(R.string.Doc_Comment_Copy), ReactionHelper.f24886a.mo35350a("COPY"), new C9066c(this, ((IAdminPermissionProxy) KoinJavaComponent.m268613a(IAdminPermissionProxy.class, null, null, 6, null)).mo36545d(this.f24402n.mo35332j().mo32555b(), this.f24402n.mo35329h()), (TextView) findViewById, z)));
    }

    /* renamed from: a */
    private final void m37636a(DataControl cVar, String str, boolean z, Function0<Unit> function0) {
        AbstractC68307f a = C9232e.m38293a(cVar.mo34700a(str, z), null, 1, null);
        if (a != null) {
            a.mo237978a(new C9053ae(z, function0, cVar), C9054af.f24408a, new C9055ag(z, function0));
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentFunction
    /* renamed from: a */
    public void mo34630a(View view, CommentBean.CommentDetail commentDetail, ICardAdapter iCardAdapter, int i) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(commentDetail, "item");
        Intrinsics.checkParameterIsNotNull(iCardAdapter, "cardAdapter");
        if (System.currentTimeMillis() - this.f24391b >= ((long) 100)) {
            this.f24392d.clear();
            mo34635a(new C9056ah(this, iCardAdapter, i, commentDetail, view));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.ee.bear.middleground.comment.b.b */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static /* synthetic */ void m37634a(CommentFunction bVar, DataControl cVar, String str, boolean z, Function0 function0, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                function0 = C9052ad.INSTANCE;
            }
            bVar.m37636a(cVar, str, z, function0);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve");
    }

    /* renamed from: a */
    private final void m37637a(Config fVar, ICommentListeners fVar2, DataControl cVar, String str, List<CommentBean.CommentDetail> list, boolean z, Function2<? super String, ? super List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>, Unit> kVar, Function0<Unit> function0, String str2, String str3, String str4, Integer num) {
        List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list2;
        CommentFunction bVar = this;
        String content = list.get(0).getContent();
        Intrinsics.checkExpressionValueIsNotNull(content, "commentRecord[0].content");
        CommentBean.CommentDetail.ExtraEntity extra = list.get(0).getExtra();
        if (extra != null) {
            list2 = extra.getImage_list();
        } else {
            list2 = null;
        }
        DetailComment bVar2 = new DetailComment(fVar, fVar2, cVar, bVar, str, list, content, list2, new C9094y(z, function0, fVar2, kVar), new C9095z(this), null, str2, str3, str4, num, 1024, null);
        this.f24390a = bVar2;
        if (bVar2 != null) {
            bVar2.mo34891a();
        }
        fVar2.mo34288L().invoke(true);
    }

    /* renamed from: a */
    static /* synthetic */ void m37635a(CommentFunction bVar, Config fVar, ICommentListeners fVar2, DataControl cVar, String str, List list, boolean z, Function2 kVar, Function0 function0, String str2, String str3, String str4, Integer num, int i, Object obj) {
        C9093x xVar;
        String str5;
        String str6;
        String str7;
        Integer num2;
        if (obj == null) {
            if ((i & SmActions.ACTION_ONTHECALL_EXIT) != 0) {
                xVar = C9093x.INSTANCE;
            } else {
                xVar = function0;
            }
            if ((i & DynamicModule.f58006b) != 0) {
                str5 = null;
            } else {
                str5 = str2;
            }
            if ((i & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0) {
                str6 = null;
            } else {
                str6 = str3;
            }
            if ((i & 1024) != 0) {
                str7 = null;
            } else {
                str7 = str4;
            }
            if ((i & 2048) != 0) {
                num2 = null;
            } else {
                num2 = num;
            }
            bVar.m37637a(fVar, fVar2, cVar, str, list, z, kVar, xVar, str5, str6, str7, num2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: edit");
    }
}
