package com.bytedance.ee.bear.middleground.comment.input;

import android.graphics.Rect;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.at.AbstractC4230c;
import com.bytedance.ee.bear.at.AbstractC4242i;
import com.bytedance.ee.bear.at.C4227b;
import com.bytedance.ee.bear.at.C4233d;
import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.bear.bean.C4520c;
import com.bytedance.ee.bear.browser.plugin.C4957m;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.imageviewer.bean.ImageData;
import com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a;
import com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5180b;
import com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5188c;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.drive.AbstractC6317a;
import com.bytedance.ee.bear.facade.common.AbstractC7665c;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.AbstractC7710h;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.fileselector.FileSelectorManager;
import com.bytedance.ee.bear.fileselector.api.FileSelectConfig;
import com.bytedance.ee.bear.fileselector.api.SimpleFileSelectListener;
import com.bytedance.ee.bear.fileselector.bean.FileBean;
import com.bytedance.ee.bear.middleground.comment.C9185d;
import com.bytedance.ee.bear.middleground.comment.audio.AbstractC9037a;
import com.bytedance.ee.bear.middleground.comment.audio.MotionImageView;
import com.bytedance.ee.bear.middleground.comment.audio.RecordPanelView;
import com.bytedance.ee.bear.middleground.comment.audio.RecordViewModel;
import com.bytedance.ee.bear.middleground.comment.control.DataControl;
import com.bytedance.ee.bear.middleground.comment.control.ICommentListeners;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentInputRequest;
import com.bytedance.ee.bear.middleground.comment.input.ICommentInput;
import com.bytedance.ee.bear.middleground.comment.p445c.AbstractC9105b;
import com.bytedance.ee.bear.middleground.comment.p445c.AbstractC9106c;
import com.bytedance.ee.bear.middleground.comment.p447e.C9201a;
import com.bytedance.ee.bear.middleground.comment.uitls.CommentTo;
import com.bytedance.ee.bear.middleground.comment.uitls.Config;
import com.bytedance.ee.bear.middleground.comment.widget.CommentEditText;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.p526r.C10599b;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widget.AbstractC11774d;
import com.bytedance.ee.bear.widget.AtEditText;
import com.bytedance.ee.bear.widget.AtFinderView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.C13655e;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13748k;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ß\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\t\n\u0002\b\u0007*\u00017\u0018\u0000 \u00012\u00020\u0001:\u0002\u0001B\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012#\b\u0002\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00120\b\u0002\u0010\u0011\u001a*\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0015¢\u0006\u0002\u0010\u0019J\u0006\u0010O\u001a\u00020\u000eJ\b\u0010P\u001a\u00020\u000eH\u0002J\b\u0010Q\u001a\u00020\u000eH\u0002J\b\u0010R\u001a\u00020\u000eH\u0002J\b\u0010S\u001a\u00020\u000eH\u0002J\b\u0010T\u001a\u00020\u000eH\u0016J\u0010\u0010U\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020\u0015H\u0016J\u0010\u0010W\u001a\u00020\n2\u0006\u0010X\u001a\u00020YH\u0002J\b\u0010Z\u001a\u00020\u000eH\u0002J\u0010\u0010[\u001a\u00020\n2\u0006\u0010\\\u001a\u00020\u0017H\u0002J\u0016\u0010]\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000e0\tH\u0002J\u0016\u0010^\u001a\u00020\u000e2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020Y0\u0013H\u0002J\b\u0010`\u001a\u00020\u000eH\u0002J\b\u0010a\u001a\u00020\u0015H\u0002J\b\u0010b\u001a\u00020\u0015H\u0016J\u0010\u0010c\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020$H\u0002J\u0010\u0010e\u001a\u00020\u000e2\u0006\u0010f\u001a\u00020\u0017H\u0002J\u0010\u0010g\u001a\u00020\u000e2\u0006\u0010h\u001a\u00020\u0015H\u0002J\b\u0010i\u001a\u00020\u000eH\u0002J\u0018\u0010j\u001a\u00020\u000e2\u000e\u0010k\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0002J#\u0010l\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010m¢\u0006\u0002\bn2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020Y0\u0013H\u0002J\u0012\u0010o\u001a\u00020\u000e2\b\b\u0002\u0010p\u001a\u00020\u0015H\u0002J\b\u0010q\u001a\u00020\u000eH\u0002J\b\u0010r\u001a\u00020\u000eH\u0002J\b\u0010s\u001a\u00020\u000eH\u0002J\b\u0010t\u001a\u00020\u000eH\u0002J\b\u0010u\u001a\u00020\u000eH\u0002J\b\u0010v\u001a\u00020\u000eH\u0002J\b\u0010w\u001a\u00020\u000eH\u0002J\u0010\u0010x\u001a\u00020\u000e2\u0006\u0010y\u001a\u00020\nH\u0016J\b\u0010z\u001a\u00020\u000eH\u0002J\u0010\u0010{\u001a\u00020\u000e2\u0006\u0010|\u001a\u00020\u0015H\u0002J\u000e\u0010}\u001a\u00020\u000e2\u0006\u0010J\u001a\u00020\u0015J\b\u0010~\u001a\u00020\u000eH\u0002J\b\u0010\u001a\u00020\u000eH\u0002J$\u0010\u0001\u001a\u00020\u000e2\u0007\u0010\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020\u0015H\u0016J\t\u0010\u0001\u001a\u00020\u000eH\u0002J\t\u0010\u0001\u001a\u00020\u000eH\u0002J\u0015\u0010\u0001\u001a\u00020\u000e2\n\b\u0002\u0010\u0001\u001a\u00030\u0001H\u0002J\t\u0010\u0001\u001a\u00020\u000eH\u0002J\u0012\u0010\u0001\u001a\u00020\u000e2\u0007\u0010\u0001\u001a\u00020\u0015H\u0002J\u0012\u0010\u0001\u001a\u00020\u000e2\u0007\u0010\u0001\u001a\u00020\u0015H\u0002R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R)\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\tX\u0004¢\u0006\u0002\n\u0000R6\u0010\u0011\u001a*\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000e0\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u0010@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000e\u00100\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0015@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u00101\"\u0004\b2\u00103R\u000e\u00104\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u000207X\u0004¢\u0006\u0004\n\u0002\u00108R\u000e\u00109\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010;\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010<X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020=0?X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020AX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020CX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020FX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020HX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020LX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020NX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/input/InputComment;", "Lcom/bytedance/ee/bear/middleground/comment/input/ICommentInput;", "configComment", "Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;", "commentListeners", "Lcom/bytedance/ee/bear/middleground/comment/control/ICommentListeners;", "dataControl", "Lcom/bytedance/ee/bear/middleground/comment/control/DataControl;", "createCallBack", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "createId", "", "inputRequest", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentInputRequest;", "dismissCallback", "Lkotlin/Function4;", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "", "heightChange", "", "isFullScreen", "(Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;Lcom/bytedance/ee/bear/middleground/comment/control/ICommentListeners;Lcom/bytedance/ee/bear/middleground/comment/control/DataControl;Lkotlin/jvm/functions/Function1;Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentInputRequest;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Z)V", "areaView", "Landroid/widget/ImageView;", "atList", "Lcom/bytedance/ee/bear/widget/AtFinderView;", "atView", "backPress", "Lcom/bytedance/ee/bear/facade/common/BackPressHandler;", "commentEditText", "Lcom/bytedance/ee/bear/middleground/comment/widget/CommentEditText;", "contentView", "Landroid/view/View;", "divider1", "divider2", "flVoice", "Landroid/widget/FrameLayout;", "imageViewer", "Lcom/bytedance/ee/bear/contract/imageviewer/api/IImageViewer;", "value", "getInputRequest", "()Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentInputRequest;", "setInputRequest", "(Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentInputRequest;)V", "insertImageView", "()Z", "setFullScreen", "(Z)V", "isShowingImageViewer", "keyBoardHeight", "keyboardListener", "com/bytedance/ee/bear/middleground/comment/input/InputComment$keyboardListener$1", "Lcom/bytedance/ee/bear/middleground/comment/input/InputComment$keyboardListener$1;", "lastContentHeight", "lastLocation", "netLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "netStatus", "Landroidx/lifecycle/Observer;", "recordPanelView", "Lcom/bytedance/ee/bear/middleground/comment/audio/RecordPanelView;", "recordViewModel", "Lcom/bytedance/ee/bear/middleground/comment/audio/RecordViewModel;", "rootView", "selectedImageAdapter", "Lcom/bytedance/ee/bear/middleground/comment/image/CommentImageAdapter;", "selectedImageRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "sendView", "shouldCloseWindow", "viewModel", "Lcom/bytedance/ee/bear/middleground/comment/input/InputViewModel;", "voiceBtn", "Lcom/bytedance/ee/bear/middleground/comment/audio/MotionImageView;", "clearDirectionalReplyId", "clearSelectedCommentImages", "closeImageSelectorView", "closeImageViewer", "configInput", "destroy", "dismiss", "bySend", "encodeImgUrl", "fileBean", "Lcom/bytedance/ee/bear/fileselector/bean/FileBean;", "ensureRootViewPaddingBottom", "generateUUID", "id", "getVipCb", "handleSelectedImages", "selectedImages", "initDefaultData", "isRecording", "isShowing", "onHeightChanged", "v", "onKeyboardShow", "keyboardHeight", "onNetStatusChanged", "connect", "resetAllViewStatus", "resetSelectedCommentImages", "list", "saveToDb", "Lio/reactivex/Flowable;", "Lorg/jetbrains/annotations/Nullable;", "sendComment", "isAudio", "setAreaView", "setAreaViewVisible", "setAtView", "setFullClickIfNeed", "setInputConfig", "setInsertImageViewVisible", "setListener", "setRichText", "text", "setSelectedImageRecyclerViewVisible", "setSendViewStatus", "enabled", "setShouldCloseWindow", "setVoiceStatus", "setVoiceViewVisible", "show", "showRecordPanel", "showAt", "showKeyBoard", "showImageSelectorView", "showInputAndRecordPanel", "showKeyboardByEditText", "delayMills", "", "showOrHideRecordPanel", "switchEditTextStatus", "expand", "switchRecordUi", "recordVisible", "Companion", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.input.b */
public final class InputComment implements ICommentInput {

    /* renamed from: v */
    public static final int f24894v = C13655e.m55411a(100);

    /* renamed from: w */
    public static final Companion f24895w = new Companion(null);

    /* renamed from: A */
    private ImageView f24896A;

    /* renamed from: B */
    private AtFinderView f24897B;

    /* renamed from: C */
    private FrameLayout f24898C;

    /* renamed from: D */
    private View f24899D;

    /* renamed from: E */
    private View f24900E;

    /* renamed from: F */
    private RecyclerView f24901F;

    /* renamed from: G */
    private final C9201a f24902G;

    /* renamed from: H */
    private final C9270l f24903H;

    /* renamed from: I */
    private final AbstractC7666d f24904I;

    /* renamed from: J */
    private final Function1<Integer, Unit> f24905J;

    /* renamed from: a */
    public boolean f24906a;

    /* renamed from: b */
    public boolean f24907b;

    /* renamed from: c */
    public int f24908c;

    /* renamed from: d */
    public View f24909d;

    /* renamed from: e */
    public View f24910e;

    /* renamed from: f */
    public CommentEditText f24911f;

    /* renamed from: g */
    public ImageView f24912g;

    /* renamed from: h */
    public MotionImageView f24913h;

    /* renamed from: i */
    public RecordPanelView f24914i;

    /* renamed from: j */
    public RecordViewModel f24915j;

    /* renamed from: k */
    public ImageView f24916k;

    /* renamed from: l */
    public int f24917l;

    /* renamed from: m */
    public int f24918m;

    /* renamed from: n */
    public final InputViewModel f24919n;

    /* renamed from: o */
    public LiveData<ConnectionService.NetworkState> f24920o;

    /* renamed from: p */
    public final AbstractC1178x<ConnectionService.NetworkState> f24921p;

    /* renamed from: q */
    public AbstractC5179a f24922q;

    /* renamed from: r */
    public final Config f24923r;

    /* renamed from: s */
    public final ICommentListeners f24924s;

    /* renamed from: t */
    public final Function1<String, Unit> f24925t;

    /* renamed from: u */
    public final Function4<String, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>, Boolean, String, Unit> f24926u;

    /* renamed from: x */
    private CommentInputRequest f24927x;

    /* renamed from: y */
    private boolean f24928y;

    /* renamed from: z */
    private ImageView f24929z;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$v */
    public static final class View$OnClickListenerC9282v implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC9282v f24964a = new View$OnClickListenerC9282v();

        View$OnClickListenerC9282v() {
        }

        public final void onClick(View view) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/input/InputComment$Companion;", "", "()V", "MAX_COMMENT_IMAGE_COUNT", "", "MAX_IMAGE_SIZE", "SAFE_DISTANCE", "TAG", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/bytedance/ee/bear/middleground/comment/input/InputComment$initDefaultData$1", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$g */
    public static final class C9263g extends RecyclerView.AbstractC1335d {
        C9263g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkParameterIsNotNull(rect, "outRect");
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
            Intrinsics.checkParameterIsNotNull(state, "state");
            rect.right = C13749l.m55738a(3);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.input.ICommentInput
    /* renamed from: a */
    public CommentInputRequest mo35368a() {
        return this.f24927x;
    }

    /* renamed from: a */
    public final void mo35379a(List<? extends FileBean> list) {
        String str;
        C13479a.m54772d("InputComment", "Receive selected images. " + list);
        mo35386f();
        mo35377a(50L);
        if (this.f24919n.mo35450f().size() == 9) {
            Toast.showFailureText(this.f24923r.mo35279a(), C10539a.m43639a(this.f24923r.mo35279a(), R.string.CCM_Comment_Image_Limitedconut, "count", String.valueOf(9)));
            return;
        }
        boolean z = true;
        if (!list.isEmpty()) {
            if (list.size() + this.f24919n.mo35450f().size() > 9) {
                list = list.subList(0, 9 - this.f24919n.mo35450f().size());
            }
            List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> a = this.f24919n.mo35434a(list);
            this.f24902G.mo34919b(a);
            this.f24919n.mo35445b(a);
            mo35392j();
            Editable text = this.f24911f.getText();
            if (text == null || (str = text.toString()) == null) {
                str = "";
            }
            if (TextUtils.isEmpty(CommentTo.m38286e(str)) && !(!this.f24919n.mo35450f().isEmpty())) {
                z = false;
            }
            mo35384e(z);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.input.ICommentInput
    /* renamed from: a */
    public void mo35372a(boolean z, boolean z2, boolean z3) {
        C13479a.m54764b("InputComment", "show(), showRecordPanel: " + z + ", showAt: " + z2 + ", showKeyBoard: " + z3);
        m38372v();
        if (z2) {
            ImageView imageView = this.f24912g;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("atView");
            }
            imageView.performClick();
        }
        if (z) {
            m38370t();
        } else if (z3) {
            this.f24911f.postDelayed(new RunnableC9250ae(this), 50);
        } else {
            this.f24909d.setPadding(0, 0, 0, 0);
            this.f24906a = true;
        }
        this.f24911f.requestFocus();
        C13748k.m55732a(new RunnableC9251af(this));
        this.f24924s.mo34292P().invoke();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onCancel"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$ad */
    public static final class C9249ad implements AbstractC11774d {

        /* renamed from: a */
        final /* synthetic */ InputComment f24933a;

        C9249ad(InputComment bVar) {
            this.f24933a = bVar;
        }

        @Override // com.bytedance.ee.bear.widget.AbstractC11774d
        public final void onCancel() {
            this.f24933a.mo35391i();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/middleground/comment/input/InputComment$setListener$13", "Lcom/bytedance/ee/bear/middleground/comment/audio/RecordPanelView$RecordPanelOperationCallback;", "onRecordStatusChanged", "", "recording", "", "onSend", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$u */
    public static final class C9281u implements RecordPanelView.RecordPanelOperationCallback {

        /* renamed from: a */
        final /* synthetic */ InputComment f24963a;

        @Override // com.bytedance.ee.bear.middleground.comment.audio.RecordPanelView.RecordPanelOperationCallback
        /* renamed from: a */
        public void mo34574a() {
            this.f24963a.mo35387f(true);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9281u(InputComment bVar) {
            this.f24963a = bVar;
        }

        @Override // com.bytedance.ee.bear.middleground.comment.audio.RecordPanelView.RecordPanelOperationCallback
        /* renamed from: a */
        public void mo34575a(boolean z) {
            C13479a.m54764b("InputComment", "onRecordStatusChanged: " + z);
        }
    }

    /* renamed from: u */
    private final Function1<String, Unit> m38371u() {
        return new C9262f(this);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.input.ICommentInput
    /* renamed from: c */
    public void mo35375c() {
        this.f24919n.mo16330a();
    }

    /* renamed from: d */
    public boolean mo35383d() {
        return this.f24928y;
    }

    /* renamed from: l */
    public final void mo35394l() {
        this.f24919n.mo35439a("");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/comment/input/InputComment$setListener$12", "Lcom/bytedance/ee/bear/middleground/comment/image/CommentImageAdapter$OnClickItemListener;", "onClick", "", "imageItem", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$t */
    public static final class C9278t implements C9201a.AbstractC9202a {

        /* renamed from: a */
        final /* synthetic */ InputComment f24960a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/middleground/comment/input/InputComment$setListener$12$onClick$1", "Lcom/bytedance/ee/bear/contract/imageviewer/listener/ImageViewerStatusListener;", "onClose", "", "uuid", "", "onCreated", "onDestroy", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$t$a */
        public static final class C9279a implements AbstractC5188c {

            /* renamed from: a */
            final /* synthetic */ C9278t f24961a;

            @Override // com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5188c
            /* renamed from: a */
            public void mo20757a() {
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
            /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$t$a$a */
            static final class RunnableC9280a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C9279a f24962a;

                RunnableC9280a(C9279a aVar) {
                    this.f24962a = aVar;
                }

                public final void run() {
                    InputComment.m38358a(this.f24962a.f24961a.f24960a, 0, 1, (Object) null);
                }
            }

            @Override // com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5188c
            /* renamed from: b */
            public void mo20759b() {
                this.f24961a.f24960a.f24922q = null;
                this.f24961a.f24960a.f24907b = false;
                C13742g.m55705a(new RunnableC9280a(this));
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C9279a(C9278t tVar) {
                this.f24961a = tVar;
            }

            @Override // com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5188c
            /* renamed from: a */
            public void mo20758a(String str) {
                ((AbstractC5180b) KoinJavaComponent.m268613a(AbstractC5180b.class, null, null, 6, null)).mo20685b(this.f24961a.f24960a.f24923r.mo35279a().getSupportFragmentManager(), "InputComment");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9278t(InputComment bVar) {
            this.f24960a = bVar;
        }

        @Override // com.bytedance.ee.bear.middleground.comment.p447e.C9201a.AbstractC9202a
        /* renamed from: a */
        public void mo34525a(CommentBean.CommentDetail.ExtraEntity.CommentImageEntity commentImageEntity) {
            if (commentImageEntity != null) {
                ImageData b = this.f24960a.f24919n.mo35443b(commentImageEntity);
                if (this.f24960a.f24922q != null) {
                    AbstractC5179a aVar = this.f24960a.f24922q;
                    if (aVar != null) {
                        aVar.mo20675a(b);
                        return;
                    }
                    return;
                }
                C4957m a = C4957m.m20521a(R.anim.image_pager_enter_animation, R.anim.image_pager_exit_animation, R.anim.image_pager_enter_animation, R.anim.image_pager_exit_animation);
                this.f24960a.f24907b = true;
                this.f24960a.f24922q = ((AbstractC5180b) KoinJavaComponent.m268613a(AbstractC5180b.class, null, null, 6, null)).mo20683a(this.f24960a.f24923r.mo35279a(), this.f24960a.f24923r.mo35279a().getSupportFragmentManager(), a, b, "InputComment", this.f24960a.f24923r.mo35329h(), this.f24960a.f24923r.mo35332j().mo32555b());
                AbstractC5179a aVar2 = this.f24960a.f24922q;
                if (aVar2 != null) {
                    aVar2.mo20678a(new C9279a(this));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/comment/input/InputComment$setListener$7", "Lcom/bytedance/ee/bear/middleground/comment/audio/AbsMotionCallbackListener;", "onClick", "", "onLongPressed", "onPressFinished", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$ab */
    public static final class C9244ab extends AbstractC9037a {

        /* renamed from: c */
        final /* synthetic */ InputComment f24931c;

        @Override // com.bytedance.ee.bear.middleground.comment.audio.AbstractC9039c
        /* renamed from: b */
        public void mo34581b() {
            this.f24931c.f24915j.mo34598a(new C9245a(this));
        }

        @Override // com.bytedance.ee.bear.middleground.comment.audio.AbstractC9039c
        /* renamed from: c */
        public void mo34582c() {
            C13479a.m54764b("InputComment", "onLongPressed");
            this.f24931c.f24915j.mo34598a(new C9246b(this));
        }

        @Override // com.bytedance.ee.bear.middleground.comment.audio.AbstractC9039c
        /* renamed from: d */
        public void mo34583d() {
            C13479a.m54764b("InputComment", "onPressFinished");
            this.f24931c.f24915j.mo34605e();
            this.f24931c.mo35389g(false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9244ab(InputComment bVar) {
            this.f24931c = bVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$ab$a */
        static final class C9245a extends Lambda implements Function1<Boolean, Unit> {
            final /* synthetic */ C9244ab this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9245a(C9244ab abVar) {
                super(1);
                this.this$0 = abVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                if (!z) {
                    this.this$0.f24931c.mo35377a(50L);
                    return;
                }
                this.this$0.f24931c.f24923r.mo35325e().mo35304a(false);
                this.this$0.f24931c.mo35393k();
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$ab$b */
        public static final class C9246b extends Lambda implements Function1<Boolean, Unit> {
            final /* synthetic */ C9244ab this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9246b(C9244ab abVar) {
                super(1);
                this.this$0 = abVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                if (!z || !this.this$0.f24362b) {
                    this.this$0.f24931c.mo35377a(50L);
                    return;
                }
                this.this$0.f24931c.mo35389g(true);
                this.this$0.f24931c.f24923r.mo35325e().mo35304a(true);
                this.this$0.f24931c.f24911f.mo35489c();
                this.this$0.f24931c.f24915j.mo34599a(new Function3<String, Boolean, int[], Unit>(this) {
                    /* class com.bytedance.ee.bear.middleground.comment.input.InputComment.C9244ab.C9246b.C92471 */
                    final /* synthetic */ C9246b this$0;

                    {
                        this.this$0 = r1;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function3
                    public /* synthetic */ Unit invoke(String str, Boolean bool, int[] iArr) {
                        invoke(str, bool.booleanValue(), iArr);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(String str, boolean z, int[] iArr) {
                        Intrinsics.checkParameterIsNotNull(str, "str");
                        Intrinsics.checkParameterIsNotNull(iArr, "diffIndex");
                        this.this$0.this$0.f24931c.f24911f.mo35488a(str, z, iArr);
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onBackPressed"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$b */
    static final class C9258b implements AbstractC7666d {

        /* renamed from: a */
        final /* synthetic */ InputComment f24944a;

        C9258b(InputComment bVar) {
            this.f24944a = bVar;
        }

        @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
        public final boolean onBackPressed() {
            ICommentInput.C9239a.m38353a(this.f24944a, false, 1, null);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$d */
    public static final class RunnableC9260d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InputComment f24946a;

        RunnableC9260d(InputComment bVar) {
            this.f24946a = bVar;
        }

        public final void run() {
            LiveData<ConnectionService.NetworkState> liveData = this.f24946a.f24920o;
            if (liveData != null) {
                liveData.mo5928b(this.f24946a.f24921p);
            }
        }
    }

    /* renamed from: p */
    private final void m38366p() {
        AbstractC5179a aVar = this.f24922q;
        if (aVar != null) {
            aVar.mo20671a();
        }
        this.f24922q = null;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.input.ICommentInput
    /* renamed from: b */
    public boolean mo35374b() {
        if (this.f24909d.getParent() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo35385e() {
        return this.f24915j.mo34602b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$ae */
    static final class RunnableC9250ae implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InputComment f24934a;

        RunnableC9250ae(InputComment bVar) {
            this.f24934a = bVar;
        }

        public final void run() {
            C10548d.m43698a(this.f24934a.f24911f, new ShowInputResultReceiver(this.f24934a));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$ah */
    public static final class RunnableC9257ah implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InputComment f24943a;

        RunnableC9257ah(InputComment bVar) {
            this.f24943a = bVar;
        }

        public final void run() {
            C10548d.m43698a(this.f24943a.f24911f, new InputComment$showKeyboardByEditText$1$1(this, new Handler()));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$c */
    public static final class RunnableC9259c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InputComment f24945a;

        RunnableC9259c(InputComment bVar) {
            this.f24945a = bVar;
        }

        public final void run() {
            LiveData<ConnectionService.NetworkState> liveData = this.f24945a.f24920o;
            if (liveData != null) {
                liveData.mo5923a(this.f24945a.f24923r.mo35279a(), this.f24945a.f24921p);
            }
        }
    }

    /* renamed from: A */
    private final void m38355A() {
        int i;
        ImageView imageView = this.f24929z;
        if (this.f24919n.mo35454j() || !this.f24923r.mo35340r().mo35307a()) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: q */
    private final void m38367q() {
        if (this.f24909d.getPaddingBottom() == 0) {
            this.f24909d.setPadding(0, 0, 0, this.f24908c);
        }
    }

    /* renamed from: r */
    private final void m38368r() {
        if (mo35383d()) {
            this.f24909d.setOnClickListener(new View$OnClickListenerC9273o(this));
        } else {
            this.f24909d.setClickable(false);
        }
    }

    /* renamed from: s */
    private final void m38369s() {
        this.f24911f.setEnabled(true);
        this.f24914i.mo34563d();
        this.f24913h.setSelected(false);
    }

    /* renamed from: t */
    private final void m38370t() {
        this.f24906a = true;
        this.f24911f.setShowSoftInputOnFocus(false);
        this.f24911f.requestFocus();
        this.f24913h.mo34553a();
    }

    /* renamed from: x */
    private final void m38374x() {
        int i;
        if (this.f24923r.mo35340r().mo35309b()) {
            i = R.drawable.comment_icon_area_pressed;
        } else {
            i = R.drawable.comment_icon_area;
        }
        this.f24929z.setImageResource(i);
    }

    /* renamed from: y */
    private final void m38375y() {
        int i;
        FrameLayout frameLayout = this.f24898C;
        if (this.f24919n.mo35449e()) {
            i = 0;
        } else {
            i = 8;
        }
        frameLayout.setVisibility(i);
    }

    /* renamed from: z */
    private final void m38376z() {
        int i;
        ImageView imageView = this.f24916k;
        if (this.f24919n.mo35452h()) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: f */
    public final void mo35386f() {
        this.f24916k.setSelected(false);
        FileSelectorManager.Companion aVar = FileSelectorManager.f21081a;
        FragmentManager supportFragmentManager = this.f24923r.mo35279a().getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "configComment.activity.supportFragmentManager");
        aVar.mo30482a(supportFragmentManager, "InputComment");
    }

    /* renamed from: h */
    public final void mo35390h() {
        this.f24919n.mo35451g();
        this.f24902G.mo34914a(this.f24919n.mo35450f());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$af */
    public static final class RunnableC9251af implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InputComment f24935a;

        RunnableC9251af(InputComment bVar) {
            this.f24935a = bVar;
        }

        public final void run() {
            this.f24935a.f24915j.mo34604d().mo5922a(this.f24935a.f24923r.mo35279a());
            this.f24935a.f24915j.mo34604d().mo5923a(this.f24935a.f24923r.mo35279a(), new AbstractC1178x<String>(this) {
                /* class com.bytedance.ee.bear.middleground.comment.input.InputComment.RunnableC9251af.C92521 */

                /* renamed from: a */
                final /* synthetic */ RunnableC9251af f24936a;

                {
                    this.f24936a = r1;
                }

                /* renamed from: a */
                public final void onChanged(String str) {
                    if (str != null) {
                        this.f24936a.f24935a.f24914i.mo34557a();
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/comment/input/InputComment$initDefaultData$2", "Lcom/bytedance/ee/bear/widget/AtEditText$IEventPreImeListener;", "onEnterDown", "", "onPreImeListener", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$h */
    public static final class C9264h implements AtEditText.AbstractC11757a {

        /* renamed from: a */
        final /* synthetic */ InputComment f24947a;

        @Override // com.bytedance.ee.bear.widget.AtEditText.AbstractC11757a
        /* renamed from: b */
        public void mo35415b() {
        }

        @Override // com.bytedance.ee.bear.widget.AtEditText.AbstractC11757a
        /* renamed from: a */
        public boolean mo35414a() {
            AbstractC5179a aVar = this.f24947a.f24922q;
            if (aVar != null && aVar.t_()) {
                AbstractC5179a aVar2 = this.f24947a.f24922q;
                if (aVar2 != null) {
                    aVar2.mo20671a();
                }
                return true;
            } else if (!this.f24947a.f24916k.isSelected()) {
                return false;
            } else {
                this.f24947a.mo35386f();
                return false;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9264h(InputComment bVar) {
            this.f24947a = bVar;
        }
    }

    /* renamed from: m */
    private final void m38363m() {
        boolean z;
        ConnectionService d = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ConnectionServiceImp.getInstance()");
        ConnectionService.NetworkState b = d.mo20038b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.getInstance().networkState");
        boolean b2 = b.mo20041b();
        MotionImageView motionImageView = this.f24913h;
        if (!b2 || !this.f24923r.mo35346w()) {
            z = false;
        } else {
            z = true;
        }
        motionImageView.setEnabled(z);
    }

    /* renamed from: j */
    public final void mo35392j() {
        int i;
        RecyclerView recyclerView = this.f24901F;
        if (!this.f24919n.mo35453i() || !(!this.f24919n.mo35450f().isEmpty())) {
            i = 8;
        } else {
            i = 0;
        }
        recyclerView.setVisibility(i);
    }

    /* renamed from: v */
    private final void m38372v() {
        FragmentActivity a;
        Window window;
        View decorView;
        ViewGroup viewGroup;
        m38373w();
        this.f24923r.mo35336n().mo39924a(this.f24903H);
        this.f24920o = C5084ad.m20847d().mo20037a();
        C13748k.m55732a(new RunnableC9259c(this));
        ViewGroup viewGroup2 = (ViewGroup) this.f24909d.getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.f24909d);
        }
        Config fVar = this.f24923r;
        if (!(fVar == null || (a = fVar.mo35279a()) == null || (window = a.getWindow()) == null || (decorView = window.getDecorView()) == null || (viewGroup = (ViewGroup) decorView.findViewById(16908290)) == null)) {
            viewGroup.addView(this.f24909d);
        }
        this.f24909d.setPadding(0, 0, 0, this.f24908c);
        AbstractC7665c cVar = (AbstractC7665c) AbstractC7710h.C7711a.m30833a(this.f24923r.mo35279a(), AbstractC7665c.class);
        if (cVar != null) {
            cVar.mo30121a(this.f24904I);
        }
    }

    /* renamed from: i */
    public final void mo35391i() {
        AbstractC4230c atWindow = this.f24911f.getAtWindow();
        if (atWindow == null || !atWindow.mo16642b()) {
            ImageView imageView = this.f24912g;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("atView");
            }
            imageView.setSelected(true);
            this.f24911f.mo45000i();
            m38358a(this, 0, 1, (Object) null);
            mo35386f();
            return;
        }
        ImageView imageView2 = this.f24912g;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("atView");
        }
        imageView2.setSelected(false);
        AbstractC4230c atWindow2 = this.f24911f.getAtWindow();
        if (atWindow2 != null) {
            atWindow2.mo16646f();
        }
    }

    /* renamed from: k */
    public final void mo35393k() {
        RecordPanelView recordPanelView = this.f24914i;
        int i = 0;
        if (!recordPanelView.mo34565f()) {
            this.f24909d.setPadding(0, 0, 0, 0);
            this.f24914i.mo34563d();
            this.f24906a = false;
            C10548d.m43697a((View) this.f24911f);
            this.f24913h.setSelected(true);
            mo35386f();
            AbstractC4230c atWindow = this.f24911f.getAtWindow();
            if (atWindow != null && atWindow.mo16642b()) {
                ImageView imageView = this.f24912g;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("atView");
                }
                imageView.setSelected(false);
                AbstractC4230c atWindow2 = this.f24911f.getAtWindow();
                if (atWindow2 != null) {
                    atWindow2.mo16646f();
                }
            }
            m38362h(true);
        } else {
            this.f24909d.setPadding(0, 0, 0, this.f24908c);
            m38358a(this, 0, 1, (Object) null);
            this.f24915j.mo34605e();
            m38362h(false);
            i = 8;
        }
        recordPanelView.setVisibility(i);
    }

    /* renamed from: n */
    private final void m38364n() {
        this.f24919n.mo35437a(mo35368a());
        this.f24924s.mo34299a(this.f24909d);
        this.f24901F.setLayoutManager(new LinearLayoutManager(this.f24923r.mo35279a(), 0, false));
        this.f24901F.addItemDecoration(new C9263g());
        this.f24902G.mo34915a(this.f24919n.mo35452h());
        this.f24901F.setAdapter(this.f24902G);
        this.f24911f.setPreImeListener(new C9264h(this));
        mo35392j();
        m38373w();
        m38363m();
        FragmentActivity a = this.f24923r.mo35279a();
        AbstractC4242i a2 = C4227b.m17586a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AtModule.getDependency()");
        C4233d a3 = new C4233d(a, a2.mo16664c(), this.f24923r.mo35332j(), this.f24923r.mo35329h(), "part_comment", "part_comment").mo16655a(this.f24897B);
        a3.f12764m = ((AbstractC9105b) KoinJavaComponent.m268613a(AbstractC9105b.class, null, null, 6, null)).mo30708a();
        this.f24911f.mo44988a(a3);
        AbstractC4230c atWindow = this.f24911f.getAtWindow();
        if (atWindow != null) {
            atWindow.mo16629a(new C9265i(this));
        }
        AbstractC4230c atWindow2 = this.f24911f.getAtWindow();
        if (atWindow2 != null) {
            atWindow2.mo16646f();
        }
        AbstractC4230c atWindow3 = this.f24911f.getAtWindow();
        if (atWindow3 != null) {
            atWindow3.mo16640a(new C9266j(this));
        }
        this.f24911f.setOnPasteListener(new C9267k(this));
        AbstractC9106c a4 = C9185d.m37997a();
        if (a4 != null && a4.mo34729b()) {
            ImageView imageView = this.f24912g;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("atView");
            }
            imageView.setVisibility(8);
        }
        this.f24914i.mo34558a(this.f24911f);
    }

    /* renamed from: o */
    private final void m38365o() {
        float f;
        this.f24929z.setOnClickListener(new View$OnClickListenerC9275q(this));
        this.f24911f.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC9283w(this));
        this.f24911f.addTextChangedListener(new C9284x(this));
        m38368r();
        this.f24896A.setOnClickListener(new View$OnClickListenerC9286y(this));
        this.f24910e.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC9287z(this));
        this.f24911f.setOnClickListener(new View$OnClickListenerC9243aa(this));
        this.f24913h.setMotionCallbackListener(new C9244ab(this));
        ImageView imageView = this.f24912g;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("atView");
        }
        imageView.setOnClickListener(new View$OnClickListenerC9248ac(this));
        this.f24897B.setAtFinderViewDelegate(new C9249ad(this));
        boolean a = ((IAdminPermissionProxy) KoinJavaComponent.m268613a(IAdminPermissionProxy.class, null, null, 6, null)).mo36541a(this.f24923r.mo35332j().mo32555b(), this.f24923r.mo35329h());
        ImageView imageView2 = this.f24916k;
        if (a) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        imageView2.setAlpha(f);
        this.f24916k.setOnClickListener(new View$OnClickListenerC9276r(this, a));
        this.f24902G.mo34908a(new C9277s(this));
        this.f24902G.mo34907a(new C9278t(this));
        this.f24914i.setRecordPanelOperationCallback(new C9281u(this));
        this.f24910e.setOnClickListener(View$OnClickListenerC9282v.f24964a);
    }

    /* renamed from: g */
    public final void mo35388g() {
        if (this.f24916k.isSelected()) {
            mo35386f();
            return;
        }
        AbstractC4230c atWindow = this.f24911f.getAtWindow();
        if (atWindow != null && atWindow.mo16642b()) {
            ImageView imageView = this.f24912g;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("atView");
            }
            imageView.setSelected(false);
            AbstractC4230c atWindow2 = this.f24911f.getAtWindow();
            if (atWindow2 != null) {
                atWindow2.mo16646f();
            }
        }
        this.f24916k.setSelected(true);
        this.f24924s.mo34355v().invoke();
        m38367q();
        FileSelectConfig a = ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) FileSelectConfig.ccmAlbumBuilder().mo30472j(!this.f24923r.mo35337o()).mo30452d(9 - this.f24919n.mo35450f().size())).mo30473k(true).mo30453d(true)).mo30449b(false)).mo30463g(true)).mo30451c(true)).mo30459a(new C9253ag(this))).mo30455a();
        FragmentManager supportFragmentManager = this.f24923r.mo35279a().getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "configComment.activity\n …  .supportFragmentManager");
        Intrinsics.checkExpressionValueIsNotNull(a, "fileSelectConfig");
        FileSelectorManager.f21081a.mo30481a(this.f24923r.mo35279a(), supportFragmentManager, a, "InputComment");
    }

    /* renamed from: w */
    private final void m38373w() {
        String str;
        List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list;
        boolean z;
        String str2;
        String str3;
        int i;
        String obj;
        CommentBean.CommentDetail.ExtraEntity extraEntity;
        List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> image_list;
        this.f24908c = this.f24923r.mo35336n().mo39919a(this.f24923r.mo35279a().getRequestedOrientation());
        C13479a.m54764b("InputComment", "keyBoard height: " + this.f24908c);
        CommentEditText commentEditText = this.f24911f;
        if (this.f24923r.mo35333k() == 0 || this.f24919n.mo35455k()) {
            str = this.f24923r.mo35279a().getString(R.string.Doc_Doc_CommentDot);
        } else {
            str = this.f24923r.mo35279a().getString(R.string.Doc_Comment_ReplyCommentDot);
        }
        commentEditText.setHint(str);
        boolean isEmpty = TextUtils.isEmpty(this.f24919n.mo35444b().content);
        CommentBean.CommentDetail.ExtraEntity extraEntity2 = this.f24919n.mo35444b().extra;
        List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list2 = null;
        if (extraEntity2 != null) {
            list = extraEntity2.getImage_list();
        } else {
            list = null;
        }
        if (list == null || !((extraEntity = this.f24919n.mo35444b().extra) == null || (image_list = extraEntity.getImage_list()) == null || !image_list.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        boolean i2 = this.f24919n.mo35453i();
        String str4 = "";
        if ((i2 || !isEmpty) && (!i2 || !isEmpty || !z)) {
            if (TextUtils.isEmpty(mo35368a().directional_reply_id) || (!Intrinsics.areEqual(mo35368a().directional_reply_id, this.f24919n.mo35448d()))) {
                this.f24911f.setRichText(this.f24919n.mo35444b().content);
                if (i2) {
                    CommentBean.CommentDetail.ExtraEntity extraEntity3 = this.f24919n.mo35444b().extra;
                    if (extraEntity3 != null) {
                        list2 = extraEntity3.getImage_list();
                    }
                    m38361c(list2);
                }
            }
            mo35384e(true);
        } else {
            mo35384e(false);
            if (this.f24919n.mo35444b().canUseBlankContent) {
                this.f24911f.setText(str4);
                mo35390h();
            } else {
                this.f24919n.mo16331a(CommentTo.f24850a.mo35311a(this.f24911f, new C9274p(this, i2)));
            }
        }
        this.f24919n.mo35439a(mo35368a().directional_reply_id);
        m38375y();
        m38374x();
        m38355A();
        m38376z();
        mo35392j();
        CommentEditText commentEditText2 = this.f24911f;
        CharSequence hint = commentEditText2.getHint();
        if (!(hint == null || (obj = hint.toString()) == null)) {
            str4 = obj;
        }
        commentEditText2.setOriginHint(str4);
        if (this.f24919n.mo35444b().is_whole) {
            str2 = "full_comment";
        } else {
            str2 = "part_comment";
        }
        if (this.f24919n.mo35444b().is_whole) {
            str3 = "full_comment";
        } else {
            str3 = "part_comment";
        }
        int a = C10599b.m43898a(this.f24923r.mo35332j());
        if (!TextUtils.isEmpty(this.f24923r.mo35316A())) {
            i = 24;
        } else {
            i = a;
        }
        this.f24911f.mo44990a(new C4520c(this.f24923r.mo35329h(), i, str2, str3, this.f24923r.mo35316A()));
    }

    /* renamed from: d */
    public final void mo35382d(boolean z) {
        this.f24906a = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0017¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/middleground/comment/input/InputComment$showImageSelectorView$fileSelectConfig$1", "Lcom/bytedance/ee/bear/fileselector/api/SimpleFileSelectListener;", "onSelectFileBeanList", "", "fileList", "", "Lcom/bytedance/ee/bear/fileselector/bean/FileBean;", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$ag */
    public static final class C9253ag extends SimpleFileSelectListener {

        /* renamed from: a */
        final /* synthetic */ InputComment f24937a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$ag$c */
        static final class C9256c<T> implements Consumer<Throwable> {

            /* renamed from: a */
            public static final C9256c f24942a = new C9256c();

            C9256c() {
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                C13479a.m54759a("InputComment", "Failed to insertImages2Local...", th);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9253ag(InputComment bVar) {
            this.f24937a = bVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001¢\u0006\u0002\b\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "Lorg/jetbrains/annotations/Nullable;", "it", "", "Lcom/bytedance/ee/bear/fileselector/bean/FileBean;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$ag$a */
        static final class C9254a<T, R> implements Function<T, AbstractC70020b<? extends R>> {

            /* renamed from: a */
            final /* synthetic */ C9253ag f24938a;

            /* renamed from: b */
            final /* synthetic */ List f24939b;

            C9254a(C9253ag agVar, List list) {
                this.f24938a = agVar;
                this.f24939b = list;
            }

            /* renamed from: a */
            public final AbstractC68307f<Boolean> apply(List<? extends FileBean> list) {
                Intrinsics.checkParameterIsNotNull(list, "it");
                return this.f24938a.f24937a.mo35380b(this.f24939b);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$ag$b */
        static final class C9255b<T> implements Consumer<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C9253ag f24940a;

            /* renamed from: b */
            final /* synthetic */ List f24941b;

            C9255b(C9253ag agVar, List list) {
                this.f24940a = agVar;
                this.f24941b = list;
            }

            /* renamed from: a */
            public final void accept(Boolean bool) {
                C13479a.m54764b("InputComment", "saveImagesToLocal...");
                this.f24940a.f24937a.mo35379a(this.f24941b);
            }
        }

        @Override // com.bytedance.ee.bear.fileselector.api.IFileSelectListener, com.bytedance.ee.bear.fileselector.api.SimpleFileSelectListener
        /* renamed from: a */
        public void mo18019a(List<? extends FileBean> list) {
            Intrinsics.checkParameterIsNotNull(list, "fileList");
            AbstractC68307f.m265083a((Object) list).mo238014c(new C9254a(this, list)).mo238004b(C11678b.m48480d()).mo237985a(C11678b.m48481e()).mo238001b(new C9255b(this, list), C9256c.f24942a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/bytedance/ee/bear/middleground/comment/input/InputComment$setListener$3", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$x */
    public static final class C9284x implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ InputComment f24966a;

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$x$a */
        static final class C9285a extends Lambda implements Function1<String, Unit> {
            final /* synthetic */ C9284x this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9285a(C9284x xVar) {
                super(1);
                this.this$0 = xVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke(str);
                return Unit.INSTANCE;
            }

            public final void invoke(String str) {
                Intrinsics.checkParameterIsNotNull(str, "it");
                InputComment bVar = this.this$0.f24966a;
                boolean z = true;
                if (TextUtils.isEmpty(CommentTo.m38286e(str)) && !(!this.this$0.f24966a.f24919n.mo35450f().isEmpty())) {
                    z = false;
                }
                bVar.mo35384e(z);
                if (!TextUtils.isEmpty(str)) {
                    this.this$0.f24966a.f24924s.mo34282F().invoke("", str);
                }
                if (!this.this$0.f24966a.mo35385e()) {
                    this.this$0.f24966a.mo35368a().content = str;
                    this.this$0.f24966a.f24919n.mo35437a(this.this$0.f24966a.mo35368a());
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9284x(InputComment bVar) {
            this.f24966a = bVar;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f24966a.f24919n.mo16331a(CommentTo.f24850a.mo35311a(this.f24966a.f24911f, new C9285a(this)));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "content", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$e */
    public static final class C9261e extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ boolean $bySend;
        final /* synthetic */ InputComment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9261e(InputComment bVar, boolean z) {
            super(1);
            this.this$0 = bVar;
            this.$bySend = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            this.this$0.f24926u.invoke(str, this.this$0.f24919n.mo35450f(), Boolean.valueOf(this.$bySend), this.this$0.mo35368a().tmpCommentId);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$f */
    public static final class C9262f extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ InputComment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9262f(InputComment bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            if (str != null) {
                ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36639b().mo36669a(this.this$0.f24923r.mo35279a(), str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/middleground/comment/input/InputComment$initDefaultData$3", "Lcom/bytedance/ee/bear/at/AtWindow$ShowAtWindowListener;", "onFinderViewHeightChange", "", "windowHeight", "", "contentHeight", "onShowAtWindow", "isShow", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$i */
    public static final class C9265i implements AbstractC4230c.AbstractC4232b {

        /* renamed from: a */
        final /* synthetic */ InputComment f24948a;

        @Override // com.bytedance.ee.bear.at.AbstractC4230c.AbstractC4232b
        /* renamed from: a */
        public void mo16650a(int i, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9265i(InputComment bVar) {
            this.f24948a = bVar;
        }

        @Override // com.bytedance.ee.bear.at.AbstractC4230c.AbstractC4232b
        /* renamed from: a */
        public void mo16651a(boolean z) {
            if (!z) {
                InputComment.m38356a(this.f24948a).setSelected(false);
                return;
            }
            AbstractC10550f b = AbstractC10550f.AbstractC10551a.m43717b(this.f24948a.f24923r.mo35279a());
            Intrinsics.checkExpressionValueIsNotNull(b, "KeyboardHeightProvider.F…t(configComment.activity)");
            if (b.mo39934h() == 0) {
                this.f24948a.f24909d.setPadding(0, 0, 0, 0);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/bytedance/ee/bear/middleground/comment/input/InputComment$initDefaultData$4", "Lcom/bytedance/ee/bear/at/AtWindow$OnAtSelectedCallback;", "onExistResult", "", "keyword", "", "onSearchEmpty", "onSelectedAt", "at", "Lcom/bytedance/ee/bear/bean/At;", "fromToolbar", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$j */
    public static final class C9266j implements AbstractC4230c.AbstractC4231a {

        /* renamed from: a */
        final /* synthetic */ InputComment f24949a;

        @Override // com.bytedance.ee.bear.at.AbstractC4230c.AbstractC4231a
        /* renamed from: a */
        public void mo16648a(String str) {
        }

        @Override // com.bytedance.ee.bear.at.AbstractC4230c.AbstractC4231a
        /* renamed from: b */
        public void mo16649b(String str) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9266j(InputComment bVar) {
            this.f24949a = bVar;
        }

        @Override // com.bytedance.ee.bear.at.AbstractC4230c.AbstractC4231a
        /* renamed from: a */
        public void mo16647a(C4517a aVar, boolean z) {
            this.f24949a.f24911f.mo44989a(aVar);
            this.f24949a.f24924s.mo34328d().invoke(aVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/middleground/comment/input/InputComment$keyboardListener$1", "Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightObserver;", "onKeyboardHeightChanged", "", "khp", "Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightProvider;", "keyboardHeight", "", "orientation", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$l */
    public static final class C9270l implements AbstractC10549e {

        /* renamed from: a */
        final /* synthetic */ InputComment f24953a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9270l(InputComment bVar) {
            this.f24953a = bVar;
        }

        @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
        public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(fVar, "khp");
            C13479a.m54764b("InputComment", "keyboard change: " + i + ", " + "shouldCloseWindow: " + this.f24953a.f24906a + ", " + "insertImageView.isSelected: " + this.f24953a.f24916k.isSelected() + ", " + "isShowingImageViewer: " + this.f24953a.f24907b + ", " + "recordViewModel.checkingPermission: " + this.f24953a.f24915j.mo34603c());
            if (i > 0) {
                this.f24953a.f24908c = i;
                this.f24953a.f24909d.setPadding(0, 0, 0, this.f24953a.f24908c);
                this.f24953a.mo35376a(i);
            } else if (!this.f24953a.f24906a || this.f24953a.f24916k.isSelected() || this.f24953a.f24907b || this.f24953a.f24915j.mo34603c()) {
                this.f24953a.f24906a = true;
            } else {
                ICommentInput.C9239a.m38353a(this.f24953a, false, 1, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$p */
    public static final class C9274p extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ boolean $canShowImageList;
        final /* synthetic */ InputComment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9274p(InputComment bVar, boolean z) {
            super(1);
            this.this$0 = bVar;
            this.$canShowImageList = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            boolean z;
            CommentBean.CommentDetail.ExtraEntity extraEntity;
            Intrinsics.checkParameterIsNotNull(str, "it");
            this.this$0.mo35368a().content = str;
            boolean z2 = true;
            if (this.$canShowImageList) {
                CommentInputRequest a = this.this$0.mo35368a();
                if (!this.this$0.f24919n.mo35450f().isEmpty()) {
                    extraEntity = new CommentBean.CommentDetail.ExtraEntity();
                    extraEntity.setImage_list(new ArrayList());
                    extraEntity.getImage_list().addAll(this.this$0.f24919n.mo35450f());
                } else {
                    extraEntity = null;
                }
                a.extra = extraEntity;
            }
            this.this$0.f24919n.mo35437a(this.this$0.mo35368a());
            if (this.$canShowImageList) {
                InputComment bVar = this.this$0;
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && !(!this.this$0.f24919n.mo35450f().isEmpty())) {
                    z2 = false;
                }
                bVar.mo35384e(z2);
                return;
            }
            InputComment bVar2 = this.this$0;
            if (str.length() <= 0) {
                z2 = false;
            }
            bVar2.mo35384e(z2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/comment/input/InputComment$setListener$11", "Lcom/bytedance/ee/bear/middleground/comment/image/CommentImageAdapter$OnDeleteItemListener;", "onDelete", "", "imageItem", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$s */
    public static final class C9277s implements C9201a.AbstractC9203b {

        /* renamed from: a */
        final /* synthetic */ InputComment f24959a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9277s(InputComment bVar) {
            this.f24959a = bVar;
        }

        @Override // com.bytedance.ee.bear.middleground.comment.p447e.C9201a.AbstractC9203b
        /* renamed from: a */
        public void mo34920a(CommentBean.CommentDetail.ExtraEntity.CommentImageEntity commentImageEntity) {
            String str;
            if (commentImageEntity != null) {
                this.f24959a.f24919n.mo35436a(commentImageEntity);
                this.f24959a.mo35392j();
                InputComment bVar = this.f24959a;
                Editable text = bVar.f24911f.getText();
                if (text == null || (str = text.toString()) == null) {
                    str = "";
                }
                boolean z = true;
                if (TextUtils.isEmpty(CommentTo.m38286e(str)) && !(!this.f24959a.f24919n.mo35450f().isEmpty())) {
                    z = false;
                }
                bVar.mo35384e(z);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/middleground/comment/input/InputComment$setListener$2", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$w */
    public static final class View$OnAttachStateChangeListenerC9283w implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ InputComment f24965a;

        public void onViewDetachedFromWindow(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnAttachStateChangeListenerC9283w(InputComment bVar) {
            this.f24965a = bVar;
        }

        public void onViewAttachedToWindow(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f24965a.f24911f.setCursorVisible(false);
            this.f24965a.f24911f.setCursorVisible(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"com/bytedance/ee/bear/middleground/comment/input/InputComment$setListener$5", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", "v", "Landroid/view/View;", "left", "", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$z */
    public static final class View$OnLayoutChangeListenerC9287z implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ InputComment f24968a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnLayoutChangeListenerC9287z(InputComment bVar) {
            this.f24968a = bVar;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            if (this.f24968a.f24910e.getHeight() != 0) {
                int height = this.f24968a.f24910e.getHeight();
                this.f24968a.f24918m = height;
                this.f24968a.f24924s.mo34283G().invoke(Integer.valueOf(height));
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                if (this.f24968a.f24917l == 0 || this.f24968a.f24917l != iArr[1]) {
                    this.f24968a.f24917l = iArr[1];
                    if (C13655e.m55413b() - this.f24968a.f24917l > InputComment.f24894v) {
                        Iterator<T> it = this.f24968a.f24924s.mo34359z().iterator();
                        while (it.hasNext()) {
                            it.next().invoke(Integer.valueOf(iArr[1]), Boolean.valueOf(this.f24968a.mo35368a().isForWhole()));
                        }
                    }
                    this.f24968a.mo35378a(view);
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.input.ICommentInput
    /* renamed from: a */
    public void mo35371a(boolean z) {
        this.f24928y = z;
        m38368r();
    }

    /* renamed from: e */
    public final void mo35384e(boolean z) {
        this.f24896A.setEnabled(z);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$ac */
    public static final class View$OnClickListenerC9248ac implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InputComment f24932a;

        View$OnClickListenerC9248ac(InputComment bVar) {
            this.f24932a = bVar;
        }

        public final void onClick(View view) {
            C13479a.m54764b("InputComment", "at click");
            this.f24932a.mo35391i();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onPaste"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$k */
    public static final class C9267k implements AtEditText.AbstractC11758b {

        /* renamed from: a */
        final /* synthetic */ InputComment f24950a;

        C9267k(InputComment bVar) {
            this.f24950a = bVar;
        }

        @Override // com.bytedance.ee.bear.widget.AtEditText.AbstractC11758b
        /* renamed from: a */
        public final boolean mo18343a(final String str) {
            C13742g.m55705a(new Runnable(this) {
                /* class com.bytedance.ee.bear.middleground.comment.input.InputComment.C9267k.RunnableC92681 */

                /* renamed from: a */
                final /* synthetic */ C9267k f24951a;

                {
                    this.f24951a = r1;
                }

                public final void run() {
                    InputViewModel cVar = this.f24951a.f24950a.f24919n;
                    String str = str;
                    Intrinsics.checkExpressionValueIsNotNull(str, "it");
                    cVar.mo35441a(str, new Function2<BearUrl, MentionTitleResult, Unit>(this) {
                        /* class com.bytedance.ee.bear.middleground.comment.input.InputComment.C9267k.RunnableC92681.C92691 */
                        final /* synthetic */ RunnableC92681 this$0;

                        {
                            this.this$0 = r1;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(BearUrl bearUrl, MentionTitleResult mentionTitleResult) {
                            invoke(bearUrl, mentionTitleResult);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BearUrl bearUrl, MentionTitleResult mentionTitleResult) {
                            Intrinsics.checkParameterIsNotNull(bearUrl, "url");
                            if (this.this$0.f24951a.f24950a.mo35374b()) {
                                InputViewModel cVar = this.this$0.f24951a.f24950a.f24919n;
                                String str = str;
                                Intrinsics.checkExpressionValueIsNotNull(str, "it");
                                cVar.mo35440a(str, bearUrl, mentionTitleResult, this.this$0.f24951a.f24950a.f24911f);
                            }
                        }
                    });
                }
            });
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$o */
    public static final class View$OnClickListenerC9273o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InputComment f24955a;

        View$OnClickListenerC9273o(InputComment bVar) {
            this.f24955a = bVar;
        }

        public final void onClick(View view) {
            ICommentInput.C9239a.m38353a(this.f24955a, false, 1, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$q */
    public static final class View$OnClickListenerC9275q implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InputComment f24956a;

        View$OnClickListenerC9275q(InputComment bVar) {
            this.f24956a = bVar;
        }

        public final void onClick(View view) {
            this.f24956a.f24924s.mo34352s().invoke();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ImageView m38356a(InputComment bVar) {
        ImageView imageView = bVar.f24912g;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("atView");
        }
        return imageView;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$m */
    static final class C9271m<T> implements AbstractC1178x<ConnectionService.NetworkState> {

        /* renamed from: a */
        final /* synthetic */ InputComment f24954a;

        C9271m(InputComment bVar) {
            this.f24954a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(ConnectionService.NetworkState networkState) {
            boolean z = true;
            if (networkState == null || !networkState.mo20041b()) {
                z = false;
            }
            InputComment.m38356a(this.f24954a).setEnabled(z);
            this.f24954a.mo35381c(z);
        }
    }

    /* renamed from: b */
    private final String m38360b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(System.currentTimeMillis());
        return sb.toString();
    }

    /* renamed from: c */
    private final void m38361c(List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list) {
        this.f24919n.mo35446c(list);
        this.f24902G.mo34914a(this.f24919n.mo35450f());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$aa */
    public static final class View$OnClickListenerC9243aa implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InputComment f24930a;

        View$OnClickListenerC9243aa(InputComment bVar) {
            this.f24930a = bVar;
        }

        public final void onClick(View view) {
            if (this.f24930a.f24914i.getVisibility() == 0) {
                this.f24930a.f24923r.mo35325e().mo35301a("text_edit");
                this.f24930a.f24913h.mo34553a();
            } else {
                C10548d.m43703b(this.f24930a.f24911f);
                this.f24930a.mo35386f();
            }
            C13479a.m54764b("InputComment", "input click");
        }
    }

    /* renamed from: f */
    public final void mo35387f(boolean z) {
        mo35384e(false);
        m38369s();
        mo35373b(true);
        C13479a.m54764b("InputComment", "sendComment");
        this.f24919n.mo35438a(this.f24911f, new C9272n(this), z, m38371u());
    }

    /* renamed from: g */
    public final void mo35389g(boolean z) {
        ViewGroup.LayoutParams layoutParams = this.f24911f.getLayoutParams();
        if (z) {
            if (layoutParams != null) {
                layoutParams.height = (int) this.f24923r.mo35279a().getResources().getDimension(R.dimen.audio_edit_text_height);
            }
        } else if (layoutParams != null) {
            layoutParams.height = -2;
        }
        this.f24911f.requestLayout();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$r */
    public static final class View$OnClickListenerC9276r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InputComment f24957a;

        /* renamed from: b */
        final /* synthetic */ boolean f24958b;

        View$OnClickListenerC9276r(InputComment bVar, boolean z) {
            this.f24957a = bVar;
            this.f24958b = z;
        }

        public final void onClick(View view) {
            C13479a.m54764b("InputComment", "Click insertImage.");
            if (this.f24958b) {
                if (this.f24957a.f24916k.isSelected()) {
                    C10548d.m43703b(this.f24957a.f24911f);
                } else {
                    C10548d.m43696a(this.f24957a.f24909d.getContext());
                }
                this.f24957a.mo35388g();
                return;
            }
            Toast.showText(this.f24957a.f24923r.mo35279a(), (int) R.string.CreationMobile_ECM_AdminDisableToast);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$y */
    public static final class View$OnClickListenerC9286y implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InputComment f24967a;

        View$OnClickListenerC9286y(InputComment bVar) {
            this.f24967a = bVar;
        }

        public final void onClick(View view) {
            boolean z;
            if (!this.f24967a.f24919n.mo35447c()) {
                Editable text = this.f24967a.f24911f.getText();
                if (text == null || StringsKt.isBlank(text)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z || (!this.f24967a.f24919n.mo35450f().isEmpty())) {
                    this.f24967a.f24919n.mo35442a(true);
                    InputComment.m38359a(this.f24967a, false, 1, (Object) null);
                }
            }
        }
    }

    /* renamed from: a */
    private final String m38357a(FileBean fileBean) {
        String path = fileBean.getPath();
        Intrinsics.checkExpressionValueIsNotNull(path, "fileBean.path");
        StringBuilder sb = new StringBuilder();
        sb.append(((AbstractC6317a) KoinJavaComponent.m268613a(AbstractC6317a.class, null, null, 6, null)).mo20408a());
        sb.append(fileBean.getUuid());
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) path, ".", 0, false, 6, (Object) null);
        if (path != null) {
            String substring = path.substring(lastIndexOf$default);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            return sb.toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: b */
    public final AbstractC68307f<Boolean> mo35380b(List<? extends FileBean> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (FileBean fileBean : list) {
            fileBean.setUuid(m38360b(fileBean.getId()));
            String a = m38357a(fileBean);
            String path = fileBean.getPath();
            Intrinsics.checkExpressionValueIsNotNull(path, "fileBean.path");
            linkedHashMap.put(a, path);
            fileBean.setPath(a);
        }
        return ((AbstractC6317a) KoinJavaComponent.m268613a(AbstractC6317a.class, null, null, 6, null)).mo20407a(mo35368a().getDocUrl(), linkedHashMap);
    }

    /* renamed from: c */
    public final void mo35381c(boolean z) {
        boolean z2;
        RecordPanelView recordPanelView = this.f24914i;
        if (z || recordPanelView.getVisibility() != 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        recordPanelView.setEnabled(z2);
        m38363m();
        this.f24915j.mo34601b(z);
        if (!z) {
            this.f24911f.setEnabled(true);
            if (mo35385e()) {
                if (this.f24914i.mo34565f()) {
                    this.f24914i.mo34564e();
                } else {
                    this.f24915j.mo34605e();
                    this.f24911f.mo35490d();
                    this.f24915j.mo34606f();
                    mo35389g(false);
                }
            }
        }
        this.f24902G.mo34915a(z);
        this.f24916k.setEnabled(z);
    }

    /* renamed from: h */
    private final void m38362h(boolean z) {
        ViewGroup.LayoutParams layoutParams = this.f24899D.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ViewGroup.LayoutParams layoutParams3 = this.f24911f.getLayoutParams();
            if (layoutParams3 != null) {
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                m38363m();
                if (z) {
                    ImageView imageView = this.f24912g;
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("atView");
                    }
                    imageView.setVisibility(8);
                    this.f24913h.setVisibility(8);
                    this.f24896A.setVisibility(8);
                    this.f24929z.setVisibility(8);
                    this.f24916k.setVisibility(8);
                    this.f24901F.setVisibility(8);
                    layoutParams2.f2819k = 0;
                    layoutParams2.bottomMargin = (int) this.f24923r.mo35279a().getResources().getDimension(R.dimen.record_panel_height);
                    layoutParams2.f2816h = -1;
                    layoutParams4.f2816h = R.id.divider_1;
                    layoutParams4.f2818j = -1;
                    this.f24911f.setMinLines(6);
                } else {
                    layoutParams4.f2816h = -1;
                    layoutParams4.f2818j = R.id.rv_selected_image;
                    layoutParams2.f2816h = R.id.doc_comment_input;
                    layoutParams2.f2819k = -1;
                    layoutParams2.bottomMargin = 0;
                    this.f24911f.setMinLines(0);
                    m38369s();
                    ImageView imageView2 = this.f24912g;
                    if (imageView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("atView");
                    }
                    imageView2.setVisibility(0);
                    this.f24913h.setVisibility(0);
                    this.f24896A.setVisibility(0);
                    this.f24914i.setVisibility(8);
                    m38355A();
                    m38376z();
                    mo35392j();
                }
                AbstractC9106c a = C9185d.m37997a();
                if (a != null && a.mo34729b()) {
                    ImageView imageView3 = this.f24912g;
                    if (imageView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("atView");
                    }
                    imageView3.setVisibility(8);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    /* renamed from: a */
    public final void mo35376a(int i) {
        if (i > 0) {
            m38362h(false);
            this.f24915j.mo34605e();
        }
    }

    /* renamed from: a */
    public final void mo35377a(long j) {
        this.f24911f.postDelayed(new RunnableC9257ah(this), j);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.input.ICommentInput
    /* renamed from: b */
    public void mo35373b(boolean z) {
        AbstractC4230c atWindow;
        C13479a.m54764b("InputComment", "dismiss(), bySend: " + z);
        ViewGroup viewGroup = null;
        if (mo35374b() && !z) {
            this.f24923r.mo35325e().mo35302a("cancel_click", null, null, MapsKt.mutableMapOf(new Pair("is_full_comment_flag", String.valueOf(mo35368a().is_whole))));
        }
        AbstractC4230c atWindow2 = this.f24911f.getAtWindow();
        if (!(atWindow2 == null || !atWindow2.mo16642b() || (atWindow = this.f24911f.getAtWindow()) == null)) {
            atWindow.mo16645e();
        }
        m38366p();
        mo35386f();
        AbstractC7665c cVar = (AbstractC7665c) AbstractC7710h.C7711a.m30833a(this.f24923r.mo35279a(), AbstractC7665c.class);
        if (cVar != null) {
            cVar.mo30122b(this.f24904I);
        }
        this.f24919n.mo35442a(false);
        m38369s();
        this.f24918m = 0;
        this.f24917l = 0;
        this.f24906a = false;
        C10548d.m43697a(this.f24909d);
        this.f24923r.mo35336n().mo39928b(this.f24903H);
        C13748k.m55732a(new RunnableC9260d(this));
        this.f24909d.setPadding(0, 0, 0, 0);
        ViewParent parent = this.f24909d.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = parent;
        }
        ViewGroup viewGroup2 = viewGroup;
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.f24909d);
        }
        Iterator<T> it = this.f24924s.mo34359z().iterator();
        while (it.hasNext()) {
            it.next().invoke(0, Boolean.valueOf(mo35368a().isForWhole()));
        }
        if (this.f24919n.mo35454j() && !z) {
            C13479a.m54764b("InputComment", "isEditStatus, do not save edit content...");
            this.f24911f.setText("");
            mo35390h();
        }
        CommentTo.f24850a.mo35311a(this.f24911f, new C9261e(this, z));
        this.f24915j.mo34605e();
        this.f24914i.setVisibility(8);
        m38362h(false);
    }

    /* renamed from: a */
    public final void mo35378a(View view) {
        this.f24905J.invoke(Integer.valueOf(view.getBottom() - view.getTop()));
    }

    @Override // com.bytedance.ee.bear.middleground.comment.input.ICommentInput
    /* renamed from: a */
    public void mo35369a(CommentInputRequest commentInputRequest) {
        Intrinsics.checkParameterIsNotNull(commentInputRequest, "value");
        this.f24927x = commentInputRequest;
        this.f24919n.mo35437a(commentInputRequest);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.input.ICommentInput
    /* renamed from: a */
    public void mo35370a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        this.f24911f.setRichText(str);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "result", "", "createId", "", "reviewFail", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.b$n */
    public static final class C9272n extends Lambda implements Function3<Boolean, String, Boolean, Unit> {
        final /* synthetic */ InputComment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9272n(InputComment bVar) {
            super(3);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ Unit invoke(Boolean bool, String str, Boolean bool2) {
            invoke(bool.booleanValue(), str, bool2.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z, String str, boolean z2) {
            String str2;
            Intrinsics.checkParameterIsNotNull(str, "createId");
            boolean z3 = false;
            this.this$0.f24919n.mo35442a(false);
            if (z) {
                C13479a.m54764b("InputComment", "send comment success");
                Function2<String, Boolean, Unit> D = this.this$0.f24924s.mo34280D();
                Editable text = this.this$0.f24911f.getText();
                if (text == null || (str2 = text.toString()) == null) {
                    str2 = "";
                }
                D.invoke(str2, true);
                if (str.length() > 0) {
                    z3 = true;
                }
                if (z3) {
                    this.this$0.f24925t.invoke(str);
                }
            } else {
                this.this$0.f24919n.mo35435a(this.this$0.f24924s, z2);
            }
            this.this$0.mo35394l();
            this.this$0.mo35390h();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m38358a(InputComment bVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        bVar.mo35377a(j);
    }

    /* renamed from: a */
    static /* synthetic */ void m38359a(InputComment bVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        bVar.mo35387f(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.p<? super java.lang.String, ? super java.util.List<? extends com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean$CommentDetail$ExtraEntity$CommentImageEntity>, ? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public InputComment(Config fVar, ICommentListeners fVar2, DataControl cVar, Function1<? super String, Unit> function1, CommentInputRequest commentInputRequest, Function4<? super String, ? super List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>, ? super Boolean, ? super String, Unit> pVar, Function1<? super Integer, Unit> function12, boolean z) {
        Intrinsics.checkParameterIsNotNull(fVar, "configComment");
        Intrinsics.checkParameterIsNotNull(fVar2, "commentListeners");
        Intrinsics.checkParameterIsNotNull(cVar, "dataControl");
        Intrinsics.checkParameterIsNotNull(function1, "createCallBack");
        Intrinsics.checkParameterIsNotNull(commentInputRequest, "inputRequest");
        Intrinsics.checkParameterIsNotNull(pVar, "dismissCallback");
        Intrinsics.checkParameterIsNotNull(function12, "heightChange");
        this.f24923r = fVar;
        this.f24924s = fVar2;
        this.f24925t = function1;
        this.f24926u = pVar;
        this.f24905J = function12;
        this.f24927x = commentInputRequest;
        this.f24928y = z;
        this.f24915j = new RecordViewModel(fVar);
        this.f24902G = new C9201a(fVar.mo35279a());
        this.f24919n = new InputViewModel(fVar, cVar);
        this.f24921p = new C9271m(this);
        View inflate = LayoutInflater.from(fVar.mo35279a()).inflate(R.layout.comment_input_new2, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(conf…w2,\n                null)");
        this.f24909d = inflate;
        View findViewById = inflate.findViewById(R.id.content);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.content)");
        this.f24910e = findViewById;
        View findViewById2 = this.f24909d.findViewById(R.id.doc_comment_input);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.doc_comment_input)");
        this.f24911f = (CommentEditText) findViewById2;
        View findViewById3 = this.f24909d.findViewById(R.id.fl_voice);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.fl_voice)");
        this.f24898C = (FrameLayout) findViewById3;
        View findViewById4 = this.f24909d.findViewById(R.id.commentVoice);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.findViewById(R.id.commentVoice)");
        this.f24913h = (MotionImageView) findViewById4;
        View findViewById5 = this.f24909d.findViewById(R.id.doc_comment_at);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "rootView.findViewById(R.id.doc_comment_at)");
        this.f24912g = (ImageView) findViewById5;
        View findViewById6 = this.f24909d.findViewById(R.id.doc_comment_area);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "rootView.findViewById(R.id.doc_comment_area)");
        this.f24929z = (ImageView) findViewById6;
        View findViewById7 = this.f24909d.findViewById(R.id.doc_publish_btn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "rootView.findViewById(R.id.doc_publish_btn)");
        this.f24896A = (ImageView) findViewById7;
        View findViewById8 = this.f24909d.findViewById(R.id.atView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "rootView.findViewById(R.id.atView)");
        this.f24897B = (AtFinderView) findViewById8;
        View findViewById9 = this.f24909d.findViewById(R.id.divider_1);
        Intrinsics.checkExpressionValueIsNotNull(findViewById9, "rootView.findViewById(R.id.divider_1)");
        this.f24899D = findViewById9;
        View findViewById10 = this.f24909d.findViewById(R.id.divider_2);
        Intrinsics.checkExpressionValueIsNotNull(findViewById10, "rootView.findViewById(R.id.divider_2)");
        this.f24900E = findViewById10;
        View findViewById11 = this.f24909d.findViewById(R.id.doc_comment_insert_image);
        Intrinsics.checkExpressionValueIsNotNull(findViewById11, "rootView.findViewById(R.…doc_comment_insert_image)");
        this.f24916k = (ImageView) findViewById11;
        View findViewById12 = this.f24909d.findViewById(R.id.rv_selected_image);
        Intrinsics.checkExpressionValueIsNotNull(findViewById12, "rootView.findViewById(R.id.rv_selected_image)");
        this.f24901F = (RecyclerView) findViewById12;
        View findViewById13 = this.f24909d.findViewById(R.id.voiceWaveform);
        Intrinsics.checkExpressionValueIsNotNull(findViewById13, "rootView.findViewById(R.id.voiceWaveform)");
        RecordPanelView recordPanelView = (RecordPanelView) findViewById13;
        this.f24914i = recordPanelView;
        recordPanelView.setViewModel(this.f24915j);
        this.f24914i.setCommentAnalytic(fVar.mo35325e());
        if (fVar.mo35349z()) {
            C25649b.m91857a(this.f24911f, LarkFont.BODY0);
        }
        m38364n();
        m38365o();
        this.f24903H = new C9270l(this);
        this.f24904I = new C9258b(this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ InputComment(com.bytedance.ee.bear.middleground.comment.uitls.Config r12, com.bytedance.ee.bear.middleground.comment.control.ICommentListeners r13, com.bytedance.ee.bear.middleground.comment.control.DataControl r14, kotlin.jvm.functions.Function1 r15, com.bytedance.ee.bear.middleground.comment.export.bean.CommentInputRequest r16, kotlin.jvm.functions.Function4 r17, kotlin.jvm.functions.Function1 r18, boolean r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 8
            if (r1 == 0) goto L_0x000c
            com.bytedance.ee.bear.middleground.comment.input.b$1 r1 = com.bytedance.ee.bear.middleground.comment.input.InputComment.C92401.INSTANCE
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r6 = r1
            goto L_0x000d
        L_0x000c:
            r6 = r15
        L_0x000d:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0017
            com.bytedance.ee.bear.middleground.comment.input.b$2 r1 = com.bytedance.ee.bear.middleground.comment.input.InputComment.C92412.INSTANCE
            kotlin.jvm.functions.p r1 = (kotlin.jvm.functions.Function4) r1
            r8 = r1
            goto L_0x0019
        L_0x0017:
            r8 = r17
        L_0x0019:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0023
            com.bytedance.ee.bear.middleground.comment.input.b$3 r1 = com.bytedance.ee.bear.middleground.comment.input.InputComment.C92423.INSTANCE
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r9 = r1
            goto L_0x0025
        L_0x0023:
            r9 = r18
        L_0x0025:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x002c
            r0 = 1
            r10 = 1
            goto L_0x002e
        L_0x002c:
            r10 = r19
        L_0x002e:
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r7 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.comment.input.InputComment.<init>(com.bytedance.ee.bear.middleground.comment.g.f, com.bytedance.ee.bear.middleground.comment.b.f, com.bytedance.ee.bear.middleground.comment.b.c, kotlin.jvm.functions.Function1, com.bytedance.ee.bear.middleground.comment.export.bean.CommentInputRequest, kotlin.jvm.functions.p, kotlin.jvm.functions.Function1, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
