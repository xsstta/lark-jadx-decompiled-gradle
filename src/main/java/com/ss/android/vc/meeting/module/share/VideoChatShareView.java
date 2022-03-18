package com.ss.android.vc.meeting.module.share;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.entity.chat.OpenChat;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.C57767ae;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ExtendedEditText;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60762k;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.dependency.AbstractC60892h;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.ShareCardResponse;
import com.ss.android.vc.entity.request.ShareVideoChatEntityRequest;
import com.ss.android.vc.entity.response.GetCalendarGuestEntity;
import com.ss.android.vc.entity.response.ay;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.share.IVideoChatShareContract;
import com.ss.android.vc.meeting.module.share.VideoChatShareListAdapter;
import com.ss.android.vc.meeting.module.share.VideoChatShareModel;
import com.ss.android.vc.meeting.module.share.p3162c.C62960b;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.statistics.event.ap;
import com.ss.android.vc.statistics.p3182c.C63726b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\f\u0018\u00002\u00020\u0001:\u0004Ç\u0001È\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rJ\n\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\b\u0010\u0001\u001a\u00030\u0001J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\n\u0010 \u0001\u001a\u00030\u0001H\u0002J\n\u0010¡\u0001\u001a\u00030\u0001H\u0016J\t\u0010¢\u0001\u001a\u00020\u000bH\u0016J\t\u0010£\u0001\u001a\u00020\u000bH\u0016J\u0011\u0010¤\u0001\u001a\u00020\u000b2\b\u0010¥\u0001\u001a\u00030¦\u0001J\b\u0010§\u0001\u001a\u00030\u0001J'\u0010¨\u0001\u001a\u00030\u00012\u001b\u0010©\u0001\u001a\u0016\u0012\u0005\u0012\u00030¦\u00010ª\u0001j\n\u0012\u0005\u0012\u00030¦\u0001`«\u0001H\u0016JI\u0010¬\u0001\u001a\u00030\u00012\u0019\u0010­\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u000f0ª\u0001j\t\u0012\u0004\u0012\u00020\u000f`«\u00012\u0019\u0010®\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u000f0ª\u0001j\t\u0012\u0004\u0012\u00020\u000f`«\u00012\t\u0010¯\u0001\u001a\u0004\u0018\u00010\u000fJ#\u0010°\u0001\u001a\u00030\u00012\u0007\u0010±\u0001\u001a\u00020-2\u0007\u0010²\u0001\u001a\u00020\u00152\u0007\u0010³\u0001\u001a\u00020\u000bJ\u0013\u0010´\u0001\u001a\u00030\u00012\u0007\u0010µ\u0001\u001a\u00020\u000bH\u0016J\u0013\u0010¶\u0001\u001a\u00030\u00012\u0007\u0010·\u0001\u001a\u00020nH\u0016J\n\u0010¸\u0001\u001a\u00030\u0001H\u0016J\u0013\u0010¹\u0001\u001a\u00030\u00012\u0007\u0010º\u0001\u001a\u00020\u000fH\u0016J\u001b\u0010»\u0001\u001a\u00030\u00012\u000f\u0010¼\u0001\u001a\n\u0012\u0005\u0012\u00030¦\u00010½\u0001H\u0016J\u001c\u0010¾\u0001\u001a\u00030\u00012\u0007\u0010¿\u0001\u001a\u00020\u000b2\u0007\u0010À\u0001\u001a\u00020\u0015H\u0016J\u001a\u0010Á\u0001\u001a\u00030\u00012\u0007\u0010Â\u0001\u001a\u00020\u00152\u0007\u0010Ã\u0001\u001a\u00020\u0015J\u001a\u0010Ä\u0001\u001a\u00030\u00012\u0007\u0010Å\u0001\u001a\u00020\u00052\u0007\u0010Æ\u0001\u001a\u00020\u0015R\u0014\u0010\u000e\u001a\u00020\u000fXD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\u001a\u0010$\u001a\u00020%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020-X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u000203X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u00108R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u00108R\u001a\u00109\u001a\u00020:X.¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0018\"\u0004\bG\u0010\u001aR\u001a\u0010H\u001a\u00020IX.¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u0010N\u001a\u00020OX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001a\u0010T\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u00108\"\u0004\bV\u0010WR\u001a\u0010X\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u00108\"\u0004\bZ\u0010WR\u001a\u0010[\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u00108\"\u0004\b]\u0010WR\u001a\u0010^\u001a\u00020_X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001a\u0010d\u001a\u00020IX.¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010K\"\u0004\bf\u0010MR\u001a\u0010g\u001a\u00020hX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001a\u0010m\u001a\u00020nX.¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u001a\u0010s\u001a\u00020tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\by\u0010zR\u001a\u0010{\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010\u0018\"\u0004\b}\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\u0018R\u001c\u0010\u001a\u00020\u0005X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\u0018\"\u0005\b\u0001\u0010\u001aR \u0010\u0001\u001a\u00030\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0001\u001a\u00020\u001cX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\u001e\"\u0005\b\u0001\u0010 R\u001d\u0010\u0001\u001a\u00020-X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010/\"\u0005\b\u0001\u00101R\u001d\u0010\u0001\u001a\u00020\u001cX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\u001e\"\u0005\b\u0001\u0010 R\u001d\u0010\u0001\u001a\u00020\u001cX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\u001e\"\u0005\b\u0001\u0010 ¨\u0006É\u0001"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/VideoChatShareView;", "Lcom/ss/android/vc/meeting/module/share/IVideoChatShareContract$IView;", "activity", "Landroid/app/Activity;", "rootView", "Landroid/view/View;", "dependency", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareView$ViewDependency;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "isRightInOutAnim", "", "isAuth", "(Landroid/app/Activity;Landroid/view/View;Lcom/ss/android/vc/meeting/module/share/VideoChatShareView$ViewDependency;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;ZZ)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getActivity", "()Landroid/app/Activity;", "activityLocYBottom", "", "bottomContainer", "getBottomContainer", "()Landroid/view/View;", "setBottomContainer", "(Landroid/view/View;)V", "cancelSearch", "Landroid/widget/TextView;", "getCancelSearch", "()Landroid/widget/TextView;", "setCancelSearch", "(Landroid/widget/TextView;)V", "clearSearch", "getClearSearch", "setClearSearch", "confirm", "Landroid/widget/Button;", "getConfirm", "()Landroid/widget/Button;", "setConfirm", "(Landroid/widget/Button;)V", "getDependency", "()Lcom/ss/android/vc/meeting/module/share/VideoChatShareView$ViewDependency;", "feedContainer", "Landroidx/recyclerview/widget/RecyclerView;", "getFeedContainer", "()Landroidx/recyclerview/widget/RecyclerView;", "setFeedContainer", "(Landroidx/recyclerview/widget/RecyclerView;)V", "gobackIcon", "Lcom/ss/android/vc/common/widget/IconFontView;", "getGobackIcon", "()Lcom/ss/android/vc/common/widget/IconFontView;", "setGobackIcon", "(Lcom/ss/android/vc/common/widget/IconFontView;)V", "()Z", "keyboardState", "Lcom/ss/android/vc/common/utils/SoftKeyboardState;", "getKeyboardState", "()Lcom/ss/android/vc/common/utils/SoftKeyboardState;", "setKeyboardState", "(Lcom/ss/android/vc/common/utils/SoftKeyboardState;)V", "listContainer", "Landroid/widget/FrameLayout;", "getListContainer", "()Landroid/widget/FrameLayout;", "setListContainer", "(Landroid/widget/FrameLayout;)V", "loadingLayout", "getLoadingLayout", "setLoadingLayout", "mAdapter", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareListAdapter;", "getMAdapter", "()Lcom/ss/android/vc/meeting/module/share/VideoChatShareListAdapter;", "setMAdapter", "(Lcom/ss/android/vc/meeting/module/share/VideoChatShareListAdapter;)V", "mClickListener", "Lcom/ss/android/vc/meeting/module/share/OnVideoChatShareItemClickListener;", "getMClickListener", "()Lcom/ss/android/vc/meeting/module/share/OnVideoChatShareItemClickListener;", "setMClickListener", "(Lcom/ss/android/vc/meeting/module/share/OnVideoChatShareItemClickListener;)V", "mIsLandscape", "getMIsLandscape", "setMIsLandscape", "(Z)V", "mKeyboardShown", "getMKeyboardShown", "setMKeyboardShown", "mLoadingCalendarGroupGuest", "getMLoadingCalendarGroupGuest", "setMLoadingCalendarGroupGuest", "mMeetingForwarder", "Lcom/ss/android/vc/meeting/module/share/shareconfirm/ShareMeetingConfirmDialogUtil$MeetingMessageForwarder;", "getMMeetingForwarder", "()Lcom/ss/android/vc/meeting/module/share/shareconfirm/ShareMeetingConfirmDialogUtil$MeetingMessageForwarder;", "setMMeetingForwarder", "(Lcom/ss/android/vc/meeting/module/share/shareconfirm/ShareMeetingConfirmDialogUtil$MeetingMessageForwarder;)V", "mSearchAdapter", "getMSearchAdapter", "setMSearchAdapter", "mSelectedItemsListener", "Lcom/ss/android/vc/meeting/module/share/VideoChatGetSelectedItemsListener;", "getMSelectedItemsListener", "()Lcom/ss/android/vc/meeting/module/share/VideoChatGetSelectedItemsListener;", "setMSelectedItemsListener", "(Lcom/ss/android/vc/meeting/module/share/VideoChatGetSelectedItemsListener;)V", "mViewDelegate", "Lcom/ss/android/vc/meeting/module/share/IVideoChatShareContract$IView$Delegate;", "getMViewDelegate", "()Lcom/ss/android/vc/meeting/module/share/IVideoChatShareContract$IView$Delegate;", "setMViewDelegate", "(Lcom/ss/android/vc/meeting/module/share/IVideoChatShareContract$IView$Delegate;)V", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "setMainHandler", "(Landroid/os/Handler;)V", "getMeeting", "()Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "paddingMask", "getPaddingMask", "setPaddingMask", "getRootView", "searchBar", "getSearchBar", "setSearchBar", "searchEditText", "Lcom/ss/android/lark/widget/ExtendedEditText;", "getSearchEditText", "()Lcom/ss/android/lark/widget/ExtendedEditText;", "setSearchEditText", "(Lcom/ss/android/lark/widget/ExtendedEditText;)V", "searchEmptyHint", "getSearchEmptyHint", "setSearchEmptyHint", "searchList", "getSearchList", "setSearchList", "selectCount", "getSelectCount", "setSelectCount", "titleView", "getTitleView", "setTitleView", "closeSearch", "", "create", "destroy", "dismissLoading", "hideKeyBoard", "initActivityLocYBottom", "initBottomBar", "initFeedRecyclerView", "initKeyBoardListener", "initSearchBar", "initSearchRecyclerView", "initViewsAsDesktop", "invalidate", "isReachListBottom", "isReachListTop", "isSelected", "item", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "requestCalendarGroupGuest", "resetAll", "feed", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "sendMeetingAndNote", "chatterIdList", "chatIdList", "noteText", "setDividerVisible", "listView", "lastItemPos", "hide", "setOrientation", "isLandscape", "setViewDelegate", "viewDelegate", "showLoading", "showSearchEmptyView", "key", "showSearchView", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "updateByKeyboard", "keyboardShown", "keyboardheight", "updateCurrentStatus", "p2pCount", "groupCount", "updateViewMarginBottom", "view", "toMargin", "ISearchResultCallback", "ViewDependency", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.share.h */
public final class VideoChatShareView implements IVideoChatShareContract.IView {

    /* renamed from: A */
    private OnVideoChatShareItemClickListener f158720A;

    /* renamed from: B */
    private VideoChatGetSelectedItemsListener f158721B;

    /* renamed from: C */
    private final Activity f158722C;

    /* renamed from: D */
    private final View f158723D;

    /* renamed from: E */
    private final ViewDependency f158724E;

    /* renamed from: F */
    private final C61303k f158725F;

    /* renamed from: G */
    private final boolean f158726G;

    /* renamed from: H */
    private final boolean f158727H;

    /* renamed from: a */
    public IVideoChatShareContract.IView.Delegate f158728a;

    /* renamed from: b */
    public VideoChatShareListAdapter f158729b;

    /* renamed from: c */
    public VideoChatShareListAdapter f158730c;

    /* renamed from: d */
    public C60762k f158731d;

    /* renamed from: e */
    public int f158732e;

    /* renamed from: f */
    private final String f158733f = "VideoChatShareView";

    /* renamed from: g */
    private boolean f158734g;

    /* renamed from: h */
    private boolean f158735h;

    /* renamed from: i */
    private Handler f158736i = new Handler(Looper.getMainLooper());

    /* renamed from: j */
    private boolean f158737j;

    /* renamed from: k */
    private Button f158738k;

    /* renamed from: l */
    private RecyclerView f158739l;

    /* renamed from: m */
    private View f158740m;

    /* renamed from: n */
    private ExtendedEditText f158741n;

    /* renamed from: o */
    private TextView f158742o;

    /* renamed from: p */
    private RecyclerView f158743p;

    /* renamed from: q */
    private TextView f158744q;

    /* renamed from: r */
    private View f158745r;

    /* renamed from: s */
    private TextView f158746s;

    /* renamed from: t */
    private View f158747t;

    /* renamed from: u */
    private View f158748u;

    /* renamed from: v */
    private FrameLayout f158749v;

    /* renamed from: w */
    private IconFontView f158750w;

    /* renamed from: x */
    private TextView f158751x;

    /* renamed from: y */
    private View f158752y;

    /* renamed from: z */
    private C62960b.AbstractC62964a f158753z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\b\u0010\u000e\u001a\u00020\u0003H&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/VideoChatShareView$ISearchResultCallback;", "", "onSearchEmpty", "", "searchKey", "", "onSearchError", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSearchKeyEmpty", "onSearchSuccess", "result", "", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "removeCloseSearch", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.h$a */
    public interface ISearchResultCallback {
        /* renamed from: a */
        void mo217657a();

        /* renamed from: a */
        void mo217658a(ErrorResult errorResult);

        /* renamed from: a */
        void mo217659a(String str);

        /* renamed from: a */
        void mo217660a(List<VideoChatShareItem> list);

        /* renamed from: b */
        void mo217661b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/VideoChatShareView$ViewDependency;", "", "dismissDialog", "", "showSelectedDialog", "selectedShareItems", "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "Lkotlin/collections/ArrayList;", "toggleKeyBoard", "show", "", "view", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.h$b */
    public interface ViewDependency {
        /* renamed from: a */
        void mo217654a();

        /* renamed from: a */
        void mo217655a(ArrayList<VideoChatShareItem> arrayList);

        /* renamed from: a */
        void mo217656a(boolean z, View view);
    }

    /* renamed from: f */
    public final String mo217673f() {
        return this.f158733f;
    }

    /* renamed from: i */
    public final boolean mo217676i() {
        return this.f158735h;
    }

    /* renamed from: j */
    public final ExtendedEditText mo217677j() {
        return this.f158741n;
    }

    /* renamed from: k */
    public final View mo217678k() {
        return this.f158745r;
    }

    /* renamed from: l */
    public final TextView mo217679l() {
        return this.f158746s;
    }

    /* renamed from: m */
    public final View mo217680m() {
        return this.f158747t;
    }

    /* renamed from: n */
    public final View mo217681n() {
        return this.f158752y;
    }

    /* renamed from: o */
    public final C62960b.AbstractC62964a mo217682o() {
        return this.f158753z;
    }

    /* renamed from: r */
    public final Activity mo217685r() {
        return this.f158722C;
    }

    /* renamed from: s */
    public final View mo217686s() {
        return this.f158723D;
    }

    /* renamed from: t */
    public final ViewDependency mo217687t() {
        return this.f158724E;
    }

    /* renamed from: u */
    public final C61303k mo217688u() {
        return this.f158725F;
    }

    /* renamed from: v */
    public final boolean mo217689v() {
        return this.f158727H;
    }

    /* renamed from: a */
    public final boolean mo217670a(VideoChatShareItem videoChatShareItem) {
        Intrinsics.checkParameterIsNotNull(videoChatShareItem, "item");
        IVideoChatShareContract.IView.Delegate aVar = this.f158728a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        Iterator<VideoChatShareItem> it = aVar.mo217539a().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            VideoChatShareItem next = it.next();
            if (Intrinsics.areEqual(next.getId(), videoChatShareItem.getId()) && next.getType() == videoChatShareItem.getType() && next.isSecret() == videoChatShareItem.isSecret()) {
                break;
            }
            i++;
        }
        if (i != -1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IView
    /* renamed from: a */
    public void mo217533a(List<VideoChatShareItem> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        IVideoChatShareContract.IView.Delegate aVar = this.f158728a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        if (aVar.mo217545c()) {
            this.f158743p.setVisibility(0);
            this.f158739l.setVisibility(8);
            this.f158742o.setVisibility(8);
            VideoChatShareListAdapter eVar = this.f158730c;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchAdapter");
            }
            eVar.mo217604a(list);
        }
    }

    @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IView
    /* renamed from: a */
    public void mo217534a(boolean z) {
        this.f158736i.postDelayed(new RunnableC63013v(this), 400);
        this.f158735h = z;
        if (this.f158734g) {
            this.f158724E.mo217656a(false, this.f158741n);
            this.f158736i.postDelayed(new RunnableC63014w(this), 500);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.h$v */
    static final class RunnableC63013v implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareView f158801a;

        RunnableC63013v(VideoChatShareView hVar) {
            this.f158801a = hVar;
        }

        public final void run() {
            this.f158801a.mo217683p();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/share/VideoChatShareView$mSelectedItemsListener$1", "Lcom/ss/android/vc/meeting/module/share/VideoChatGetSelectedItemsListener;", "getSelectedItems", "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "Lkotlin/collections/ArrayList;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.h$s */
    public static final class C63001s implements VideoChatGetSelectedItemsListener {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareView f158772a;

        @Override // com.ss.android.vc.meeting.module.share.VideoChatGetSelectedItemsListener
        /* renamed from: a */
        public ArrayList<VideoChatShareItem> mo217597a() {
            IVideoChatShareContract.IView.Delegate g = this.f158772a.mo217674g();
            if (g != null) {
                return g.mo217539a();
            }
            return null;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63001s(VideoChatShareView hVar) {
            this.f158772a = hVar;
        }
    }

    @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IView
    /* renamed from: c */
    public void mo217536c() {
        View view = this.f158748u;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IView
    /* renamed from: d */
    public void mo217537d() {
        View view = this.f158748u;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IView
    /* renamed from: e */
    public void mo217538e() {
        this.f158724E.mo217656a(false, this.f158741n);
    }

    /* renamed from: g */
    public final IVideoChatShareContract.IView.Delegate mo217674g() {
        IVideoChatShareContract.IView.Delegate aVar = this.f158728a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        return aVar;
    }

    /* renamed from: h */
    public final VideoChatShareListAdapter mo217675h() {
        VideoChatShareListAdapter eVar = this.f158729b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        return eVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/share/VideoChatShareView$sendMeetingAndNote$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/ShareCardResponse;", "onError", "", "err", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.h$u */
    public static final class C63009u implements AbstractC63598b<ShareCardResponse> {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareView f158795a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.share.h$u$b */
        public static final class RunnableC63012b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C63009u f158799a;

            /* renamed from: b */
            final /* synthetic */ ShareCardResponse f158800b;

            RunnableC63012b(C63009u uVar, ShareCardResponse shareCardResponse) {
                this.f158799a = uVar;
                this.f158800b = shareCardResponse;
            }

            public final void run() {
                ShareCardResponse.TargetUserPermissions targetUserPermissions;
                this.f158799a.f158795a.mo217687t().mo217654a();
                ShareCardResponse shareCardResponse = this.f158800b;
                if (shareCardResponse != null) {
                    targetUserPermissions = shareCardResponse.getTargetUserPermissions();
                } else {
                    targetUserPermissions = null;
                }
                if (targetUserPermissions == ShareCardResponse.TargetUserPermissions.ALL) {
                    C60738ac.m236023a((int) R.string.View_M_InvitationSent);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.share.h$u$a */
        public static final class RunnableC63010a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C63009u f158796a;

            /* renamed from: b */
            final /* synthetic */ String f158797b;

            RunnableC63010a(C63009u uVar, String str) {
                this.f158796a = uVar;
                this.f158797b = str;
            }

            public final void run() {
                this.f158796a.f158795a.mo217687t().mo217656a(false, this.f158796a.f158795a.mo217677j());
                if (this.f158796a.f158795a.mo217686s().getContext() != null) {
                    Context context = this.f158796a.f158795a.mo217686s().getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
                    UDDialogBuilder eVar = new UDDialogBuilder(context);
                    eVar.cancelable(true);
                    eVar.cancelOnTouchOutside(false);
                    eVar.onDismissListener(new DialogInterface.OnDismissListener(this) {
                        /* class com.ss.android.vc.meeting.module.share.VideoChatShareView.C63009u.RunnableC63010a.DialogInterface$OnDismissListenerC630111 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC63010a f158798a;

                        {
                            this.f158798a = r1;
                        }

                        public final void onDismiss(DialogInterface dialogInterface) {
                            this.f158798a.f158796a.f158795a.mo217687t().mo217654a();
                        }
                    });
                    String string = this.f158796a.f158795a.mo217686s().getResources().getString(R.string.View_M_FailedInvitation);
                    Intrinsics.checkExpressionValueIsNotNull(string, "rootView.resources.getSt….View_M_FailedInvitation)");
                    String str = this.f158797b;
                    Intrinsics.checkExpressionValueIsNotNull(str, "message");
                    String string2 = this.f158796a.f158795a.mo217686s().getResources().getString(R.string.View_G_OkButton);
                    Intrinsics.checkExpressionValueIsNotNull(string2, "rootView.resources.getSt…R.string.View_G_OkButton)");
                    ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(string)).titleGravity(1)).message(str)).messageGravity(8388611)).addActionButton(R.id.ud_dialog_btn_primary, string2, (DialogInterface.OnClickListener) null)).show();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63009u(VideoChatShareView hVar) {
            this.f158795a = hVar;
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            Boolean bool;
            String f = this.f158795a.mo217673f();
            C60700b.m235864f(f, "[shareVideoChat2]", "onError: " + eVar);
            if (eVar != null) {
                bool = Boolean.valueOf(eVar.f160600c);
            } else {
                bool = null;
            }
            if (bool == null) {
                Intrinsics.throwNpe();
            }
            if (!bool.booleanValue()) {
                C60738ac.m236023a((int) R.string.View_M_FailedShareLink);
            }
        }

        /* renamed from: a */
        public void onSuccess(ShareCardResponse shareCardResponse) {
            String str;
            boolean z;
            C60700b.m235851b(this.f158795a.mo217673f(), "[shareVideoChat]", "success");
            if (shareCardResponse == null || shareCardResponse.getBannedGroupIds() == null || shareCardResponse.getBannedGroupIds().size() <= 0) {
                C60735ab.m236001a(new RunnableC63012b(this, shareCardResponse));
                return;
            }
            AbstractC60892h chatDependency = VideoChatModuleDependency.getChatDependency();
            if (chatDependency != null) {
                StringBuilder sb = new StringBuilder();
                for (String str2 : shareCardResponse.getBannedGroupIds()) {
                    OpenChat chatById = chatDependency.getChatById(str2);
                    if (chatById != null && !TextUtils.isEmpty(chatById.getName())) {
                        sb.append(chatById.getName());
                        sb.append("、");
                    }
                }
                if (sb.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str = sb.substring(0, sb.length() - 1);
                    Intrinsics.checkExpressionValueIsNotNull(str, "sb.substring(0, sb.length - 1)");
                    HashMap hashMap = new HashMap();
                    hashMap.put("group_count", String.valueOf(shareCardResponse.getBannedGroupIds().size()));
                    hashMap.put("group_name", str);
                    UICallbackExecutor.execute(new RunnableC63010a(this, UIHelper.mustacheFormat((int) R.string.View_M_BannedFromPostingGroupCountGroupNameBraces, hashMap)));
                }
            }
            str = "";
            HashMap hashMap2 = new HashMap();
            hashMap2.put("group_count", String.valueOf(shareCardResponse.getBannedGroupIds().size()));
            hashMap2.put("group_name", str);
            UICallbackExecutor.execute(new RunnableC63010a(this, UIHelper.mustacheFormat((int) R.string.View_M_BannedFromPostingGroupCountGroupNameBraces, hashMap2)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.h$w */
    static final class RunnableC63014w implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareView f158802a;

        RunnableC63014w(VideoChatShareView hVar) {
            this.f158802a = hVar;
        }

        public final void run() {
            this.f158802a.mo217683p();
            this.f158802a.mo217687t().mo217656a(true, this.f158802a.mo217677j());
        }
    }

    /* renamed from: x */
    private final void m246631x() {
        C60762k kVar = new C60762k(this.f158723D);
        this.f158731d = kVar;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyboardState");
        }
        kVar.mo208369a(new C62987f(this));
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m246632y();
        m246633z();
        m246628A();
        m246629B();
        mo217683p();
        m246631x();
        m246630w();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f158736i.removeCallbacksAndMessages(null);
        C60762k kVar = this.f158731d;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyboardState");
        }
        if (kVar != null) {
            C60762k kVar2 = this.f158731d;
            if (kVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("keyboardState");
            }
            kVar2.mo208368a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/share/VideoChatShareView$requestCalendarGroupGuest$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/GetCalendarGuestEntity;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.h$t */
    public static final class C63002t implements AbstractC63598b<GetCalendarGuestEntity> {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareView f158773a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, d2 = {"<anonymous>", "", "run", "com/ss/android/vc/meeting/module/share/VideoChatShareView$requestCalendarGroupGuest$1$onSuccess$1$1$1", "com/ss/android/vc/meeting/module/share/VideoChatShareView$requestCalendarGroupGuest$1$$special$$inlined$forEach$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.share.h$t$a */
        public static final class RunnableC63003a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Ref.ObjectRef f158774a;

            /* renamed from: b */
            final /* synthetic */ Ref.ObjectRef f158775b;

            /* renamed from: c */
            final /* synthetic */ C63002t f158776c;

            /* renamed from: d */
            final /* synthetic */ GetCalendarGuestEntity f158777d;

            RunnableC63003a(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, C63002t tVar, GetCalendarGuestEntity getCalendarGuestEntity) {
                this.f158774a = objectRef;
                this.f158775b = objectRef2;
                this.f158776c = tVar;
                this.f158777d = getCalendarGuestEntity;
            }

            public final void run() {
                this.f158775b.element.add(this.f158774a.element);
                List<GetCalendarGuestEntity.C60950d> list = this.f158777d.f152577b;
                if (list != null && list.size() == this.f158775b.element.size()) {
                    this.f158776c.f158773a.mo217675h().mo217607b(this.f158775b.element);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, d2 = {"<anonymous>", "", "run", "com/ss/android/vc/meeting/module/share/VideoChatShareView$requestCalendarGroupGuest$1$onSuccess$1$1$3", "com/ss/android/vc/meeting/module/share/VideoChatShareView$requestCalendarGroupGuest$1$$special$$inlined$forEach$lambda$3"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.share.h$t$c */
        public static final class RunnableC63007c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Ref.ObjectRef f158787a;

            /* renamed from: b */
            final /* synthetic */ Ref.ObjectRef f158788b;

            /* renamed from: c */
            final /* synthetic */ C63002t f158789c;

            /* renamed from: d */
            final /* synthetic */ GetCalendarGuestEntity f158790d;

            RunnableC63007c(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, C63002t tVar, GetCalendarGuestEntity getCalendarGuestEntity) {
                this.f158787a = objectRef;
                this.f158788b = objectRef2;
                this.f158789c = tVar;
                this.f158790d = getCalendarGuestEntity;
            }

            public final void run() {
                this.f158788b.element.add(this.f158787a.element);
                List<GetCalendarGuestEntity.C60950d> list = this.f158790d.f152577b;
                if (list != null && list.size() == this.f158788b.element.size()) {
                    this.f158789c.f158773a.mo217675h().mo217607b(this.f158788b.element);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, d2 = {"<anonymous>", "", "run", "com/ss/android/vc/meeting/module/share/VideoChatShareView$requestCalendarGroupGuest$1$onSuccess$1$1$4", "com/ss/android/vc/meeting/module/share/VideoChatShareView$requestCalendarGroupGuest$1$$special$$inlined$forEach$lambda$4"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.share.h$t$d */
        public static final class RunnableC63008d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Ref.ObjectRef f158791a;

            /* renamed from: b */
            final /* synthetic */ Ref.ObjectRef f158792b;

            /* renamed from: c */
            final /* synthetic */ C63002t f158793c;

            /* renamed from: d */
            final /* synthetic */ GetCalendarGuestEntity f158794d;

            RunnableC63008d(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, C63002t tVar, GetCalendarGuestEntity getCalendarGuestEntity) {
                this.f158791a = objectRef;
                this.f158792b = objectRef2;
                this.f158793c = tVar;
                this.f158794d = getCalendarGuestEntity;
            }

            public final void run() {
                this.f158792b.element.add(this.f158791a.element);
                List<GetCalendarGuestEntity.C60950d> list = this.f158794d.f152577b;
                if (list != null && list.size() == this.f158792b.element.size()) {
                    this.f158793c.f158773a.mo217675h().mo217607b(this.f158792b.element);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63002t(VideoChatShareView hVar) {
            this.f158773a = hVar;
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            this.f158773a.mo217672c(false);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t¸\u0006\n"}, d2 = {"com/ss/android/vc/meeting/module/share/VideoChatShareView$requestCalendarGroupGuest$1$onSuccess$1$1$2", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/UserProfileEntity;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", "profileEntity", "lib_vc_suiteRelease", "com/ss/android/vc/meeting/module/share/VideoChatShareView$requestCalendarGroupGuest$1$$special$$inlined$forEach$lambda$2"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.share.h$t$b */
        public static final class C63004b implements AbstractC63598b<ay> {

            /* renamed from: a */
            final /* synthetic */ Ref.ObjectRef f158778a;

            /* renamed from: b */
            final /* synthetic */ GetCalendarGuestEntity.C60950d f158779b;

            /* renamed from: c */
            final /* synthetic */ Ref.ObjectRef f158780c;

            /* renamed from: d */
            final /* synthetic */ C63002t f158781d;

            /* renamed from: e */
            final /* synthetic */ GetCalendarGuestEntity f158782e;

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                ByteviewUser byteviewUser = this.f158779b.f152589a;
                Intrinsics.checkExpressionValueIsNotNull(byteviewUser, "it.user");
                String userId = byteviewUser.getUserId();
                Intrinsics.checkExpressionValueIsNotNull(userId, "it.user.userId");
                String str = this.f158779b.f152590b.f152586d;
                Intrinsics.checkExpressionValueIsNotNull(str, "it.larkUserInfo.userName");
                String str2 = this.f158779b.f152590b.f152585c;
                Intrinsics.checkExpressionValueIsNotNull(str2, "it.larkUserInfo.avatarKey");
                objectRef.element = (T) new VideoChatShareItem(userId, str, str2, "", ShareItemType.CALENDAR_GROUP_CHILD, false, null, null, false, false, false, 0, null, null, null, false, null, 130048, null);
                C60735ab.m236001a(new Runnable(this) {
                    /* class com.ss.android.vc.meeting.module.share.VideoChatShareView.C63002t.C63004b.RunnableC630062 */

                    /* renamed from: a */
                    final /* synthetic */ C63004b f158785a;

                    {
                        this.f158785a = r1;
                    }

                    public final void run() {
                        this.f158785a.f158780c.element.add(objectRef.element);
                        List<GetCalendarGuestEntity.C60950d> list = this.f158785a.f158782e.f152577b;
                        if (list != null && list.size() == this.f158785a.f158780c.element.size()) {
                            this.f158785a.f158781d.f158773a.mo217675h().mo217607b(this.f158785a.f158780c.element);
                        }
                    }
                });
            }

            /* renamed from: a */
            public void onSuccess(ay ayVar) {
                if (ayVar == null || TextUtils.isEmpty(ayVar.mo210121a())) {
                    this.f158778a.element = "";
                } else {
                    this.f158778a.element = (T) ayVar.mo210121a();
                }
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                ByteviewUser byteviewUser = this.f158779b.f152589a;
                Intrinsics.checkExpressionValueIsNotNull(byteviewUser, "it.user");
                String userId = byteviewUser.getUserId();
                Intrinsics.checkExpressionValueIsNotNull(userId, "it.user.userId");
                String str = this.f158779b.f152590b.f152586d;
                Intrinsics.checkExpressionValueIsNotNull(str, "it.larkUserInfo.userName");
                String str2 = this.f158779b.f152590b.f152585c;
                Intrinsics.checkExpressionValueIsNotNull(str2, "it.larkUserInfo.avatarKey");
                T t = this.f158778a.element;
                Intrinsics.checkExpressionValueIsNotNull(t, "desc");
                objectRef.element = (T) new VideoChatShareItem(userId, str, str2, t, ShareItemType.CALENDAR_GROUP_CHILD, false, null, null, false, false, false, 0, null, null, null, false, null, 130048, null);
                C60735ab.m236001a(new Runnable(this) {
                    /* class com.ss.android.vc.meeting.module.share.VideoChatShareView.C63002t.C63004b.RunnableC630051 */

                    /* renamed from: a */
                    final /* synthetic */ C63004b f158783a;

                    {
                        this.f158783a = r1;
                    }

                    public final void run() {
                        this.f158783a.f158780c.element.add(objectRef.element);
                        List<GetCalendarGuestEntity.C60950d> list = this.f158783a.f158782e.f152577b;
                        if (list != null && list.size() == this.f158783a.f158780c.element.size()) {
                            this.f158783a.f158781d.f158773a.mo217675h().mo217607b(this.f158783a.f158780c.element);
                        }
                    }
                });
            }

            C63004b(Ref.ObjectRef objectRef, GetCalendarGuestEntity.C60950d dVar, Ref.ObjectRef objectRef2, C63002t tVar, GetCalendarGuestEntity getCalendarGuestEntity) {
                this.f158778a = objectRef;
                this.f158779b = dVar;
                this.f158780c = objectRef2;
                this.f158781d = tVar;
                this.f158782e = getCalendarGuestEntity;
            }
        }

        /* renamed from: a */
        public void onSuccess(GetCalendarGuestEntity getCalendarGuestEntity) {
            ByteviewUser byteviewUser;
            this.f158773a.mo217672c(false);
            if (getCalendarGuestEntity != null) {
                GetCalendarGuestEntity.Status status = getCalendarGuestEntity.f152576a;
                Intrinsics.checkExpressionValueIsNotNull(status, "data.status");
                if (status == GetCalendarGuestEntity.Status.NO_PERMISSION) {
                    C60738ac.m236023a((int) R.string.View_G_GuestListHidden);
                } else if (status == GetCalendarGuestEntity.Status.NOT_IN_CALENDAR) {
                    C60738ac.m236023a((int) R.string.View_G_CanNotSeeGuestList);
                } else if (status == GetCalendarGuestEntity.Status.SUCCESS) {
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = (T) new ArrayList();
                    List<GetCalendarGuestEntity.C60950d> list = getCalendarGuestEntity.f152577b;
                    if (list != null) {
                        for (T t : list) {
                            if (t.f152591c != null && t.f152591c.f152594b != null) {
                                String str = t.f152591c.f152594b.f152588b + t.f152591c.f152594b.f152587a;
                                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                                String str2 = t.f152591c.f152593a;
                                Intrinsics.checkExpressionValueIsNotNull(str2, "it.roomUserInfo.fullName");
                                String str3 = t.f152591c.f152595c;
                                Intrinsics.checkExpressionValueIsNotNull(str3, "it.roomUserInfo.avatarKey");
                                objectRef2.element = (T) new VideoChatShareItem("", str2, str3, str, ShareItemType.CALENDAR_GROUP_CHILD, false, null, null, false, false, false, 0, null, null, null, false, null, 130048, null);
                                C60735ab.m236001a(new RunnableC63003a(objectRef2, objectRef, this, getCalendarGuestEntity));
                            } else if (t.f152590b != null) {
                                Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                                objectRef3.element = (T) t.f152590b.f152583a;
                                List list2 = null;
                                r3 = null;
                                String str4 = null;
                                if (t.f152590b.f152584b) {
                                    if (!(t == null || (byteviewUser = t.f152589a) == null)) {
                                        str4 = byteviewUser.getUserId();
                                    }
                                    VcBizSender.m249277f(str4, new C63004b(objectRef3, t, objectRef, this, getCalendarGuestEntity));
                                } else {
                                    AbstractC60892h chatDependency = VideoChatModuleDependency.getChatDependency();
                                    ByteviewUser byteviewUser2 = t.f152589a;
                                    Intrinsics.checkExpressionValueIsNotNull(byteviewUser2, "it.user");
                                    OpenChatter chatterById = chatDependency.getChatterById(byteviewUser2.getUserId());
                                    if (chatterById != null) {
                                        list2 = chatterById.getCustomStatus();
                                    }
                                    Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                                    ByteviewUser byteviewUser3 = t.f152589a;
                                    Intrinsics.checkExpressionValueIsNotNull(byteviewUser3, "it.user");
                                    String userId = byteviewUser3.getUserId();
                                    Intrinsics.checkExpressionValueIsNotNull(userId, "it.user.userId");
                                    String str5 = t.f152590b.f152586d;
                                    Intrinsics.checkExpressionValueIsNotNull(str5, "it.larkUserInfo.userName");
                                    String str6 = t.f152590b.f152585c;
                                    Intrinsics.checkExpressionValueIsNotNull(str6, "it.larkUserInfo.avatarKey");
                                    T t2 = objectRef3.element;
                                    Intrinsics.checkExpressionValueIsNotNull(t2, "desc");
                                    objectRef4.element = (T) new VideoChatShareItem(userId, str5, str6, t2, ShareItemType.CALENDAR_GROUP_CHILD, false, null, null, false, false, false, 0, null, null, null, false, list2, 64512, null);
                                    C60735ab.m236001a(new RunnableC63007c(objectRef4, objectRef, this, getCalendarGuestEntity));
                                }
                            } else if (t.f152592d != null) {
                                Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                                String valueOf = String.valueOf(t.f152592d.f152578a);
                                String str7 = t.f152592d.f152579b;
                                Intrinsics.checkExpressionValueIsNotNull(str7, "it.chatInfo.chatName");
                                String str8 = t.f152592d.f152582e;
                                Intrinsics.checkExpressionValueIsNotNull(str8, "it.chatInfo.avatarKey");
                                objectRef5.element = (T) new VideoChatShareItem(valueOf, str7, str8, "", ShareItemType.CALENDAR_GROUP_CHILD, false, null, null, false, false, false, 0, null, null, null, false, null, 130048, null);
                                C60735ab.m236001a(new RunnableC63008d(objectRef5, objectRef, this, getCalendarGuestEntity));
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IView
    /* renamed from: a */
    public void mo217530a() {
        IVideoChatShareContract.IView.Delegate aVar = this.f158728a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        int b = aVar.mo217544b();
        IVideoChatShareContract.IView.Delegate aVar2 = this.f158728a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        mo217665a(aVar2.mo217539a().size() - b, b);
        VideoChatShareListAdapter eVar = this.f158729b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        eVar.notifyDataSetChanged();
        VideoChatShareListAdapter eVar2 = this.f158730c;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchAdapter");
        }
        eVar2.notifyDataSetChanged();
    }

    @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IView
    /* renamed from: b */
    public void mo217535b() {
        IVideoChatShareContract.IView.Delegate aVar = this.f158728a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        aVar.mo217541a(VideoChatShareModel.DisplayMode.NORMAL);
        this.f158739l.setVisibility(0);
        this.f158743p.setVisibility(8);
        this.f158742o.setVisibility(8);
        this.f158741n.getText().clear();
        VideoChatShareListAdapter eVar = this.f158729b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        eVar.notifyDataSetChanged();
    }

    /* renamed from: p */
    public final void mo217683p() {
        View view;
        ViewGroup viewGroup;
        int[] iArr = new int[2];
        Activity activity = this.f158722C;
        int i = 0;
        if (activity == null || (viewGroup = (ViewGroup) activity.findViewById(16908290)) == null) {
            view = null;
        } else {
            view = viewGroup.getChildAt(0);
        }
        if (view != null) {
            view.getLocationOnScreen(iArr);
            i = view.getHeight();
        }
        this.f158732e = iArr[1] + i;
    }

    /* renamed from: q */
    public final void mo217684q() {
        if (!this.f158737j) {
            this.f158737j = true;
            IVideoChatShareContract.IView.Delegate aVar = this.f158728a;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
            }
            VcBizSender.m249302m(aVar.mo217546d()).mo219889a(new C63002t(this));
        }
    }

    /* renamed from: A */
    private final void m246628A() {
        RecyclerView recyclerView = this.f158743p;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f158723D.getContext(), 1, false));
        Context context = this.f158723D.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
        VideoChatShareListAdapter eVar = new VideoChatShareListAdapter(context, this, this.f158725F, this.f158727H, true);
        this.f158730c = eVar;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchAdapter");
        }
        recyclerView.setAdapter(eVar);
        VideoChatShareListAdapter eVar2 = this.f158730c;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchAdapter");
        }
        eVar2.mo217600a(this.f158720A);
        VideoChatShareListAdapter eVar3 = this.f158730c;
        if (eVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchAdapter");
        }
        eVar3.mo217601a(this.f158721B);
        recyclerView.addOnScrollListener(new C62994m(this));
        recyclerView.setVisibility(8);
        VideoChatShareListAdapter eVar4 = this.f158730c;
        if (eVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchAdapter");
        }
        eVar4.mo217602a(new C62995n(this, recyclerView));
    }

    /* renamed from: B */
    private final void m246629B() {
        Integer num;
        this.f158744q.setOnClickListener(new View$OnClickListenerC62984c(this));
        this.f158738k.setOnClickListener(new View$OnClickListenerC62985d(this));
        IVideoChatShareContract.IView.Delegate aVar = this.f158728a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        ArrayList<VideoChatShareItem> a = aVar.mo217539a();
        if (a != null) {
            num = Integer.valueOf(a.size());
        } else {
            num = null;
        }
        int intValue = num.intValue();
        IVideoChatShareContract.IView.Delegate aVar2 = this.f158728a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        int b = intValue - aVar2.mo217544b();
        IVideoChatShareContract.IView.Delegate aVar3 = this.f158728a;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        mo217665a(b, aVar3.mo217544b());
    }

    /* renamed from: w */
    private final void m246630w() {
        if (DesktopUtil.m144307b()) {
            this.f158750w.setVisibility(0);
            this.f158750w.setOnClickListener(new View$OnClickListenerC62996o(this));
            this.f158751x.setTextSize(2, 16.0f);
            this.f158751x.setGravity(17);
            this.f158751x.setLineSpacing(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            ViewGroup.LayoutParams layoutParams = this.f158751x.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.leftMargin = 0;
                layoutParams2.topMargin = UIHelper.dp2px(16.0f);
                this.f158747t.setBackground(C60773o.m236128f(R.drawable.vc_share_bottom_btn_background));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        this.f158750w.setVisibility(0);
        if (this.f158726G) {
            this.f158750w.setText(R.string.iconfont_icon_arrow_left);
        } else {
            this.f158750w.setText(R.string.iconfont_icon_close);
        }
        this.f158750w.setOnClickListener(new View$OnClickListenerC62997p(this));
    }

    /* renamed from: y */
    private final void m246632y() {
        this.f158740m.setOnClickListener(new View$OnClickListenerC62988g(this));
        this.f158741n.setOnFocusChangeListener(new View$OnFocusChangeListenerC62989h(this));
        this.f158741n.addTextChangedListener(new C62990i(this));
        this.f158745r.setOnClickListener(new View$OnClickListenerC62991j(this));
        this.f158746s.setOnClickListener(new View$OnClickListenerC62992k(this));
        this.f158752y.setOnClickListener(new View$OnClickListenerC62993l(this));
    }

    /* renamed from: z */
    private final void m246633z() {
        RecyclerView recyclerView = this.f158739l;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f158723D.getContext(), 1, false));
        Context context = this.f158723D.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
        VideoChatShareListAdapter eVar = new VideoChatShareListAdapter(context, this, this.f158725F, this.f158727H, false);
        this.f158729b = eVar;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        recyclerView.setAdapter(eVar);
        VideoChatShareListAdapter eVar2 = this.f158729b;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        eVar2.mo217600a(this.f158720A);
        VideoChatShareListAdapter eVar3 = this.f158729b;
        if (eVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        eVar3.mo217601a(this.f158721B);
        VideoChatShareListAdapter eVar4 = this.f158729b;
        if (eVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        eVar4.mo217602a(new C62986e(this, recyclerView));
    }

    /* renamed from: b */
    public final void mo217671b(boolean z) {
        this.f158734g = z;
    }

    /* renamed from: c */
    public final void mo217672c(boolean z) {
        this.f158737j = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/share/VideoChatShareView$initSearchBar$3", "Lcom/ss/android/lark/utils/SimpleTextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.h$i */
    public static final class C62990i extends C57767ae {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareView f158761a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62990i(VideoChatShareView hVar) {
            this.f158761a = hVar;
        }

        @Override // com.ss.android.lark.utils.C57767ae
        public void afterTextChanged(Editable editable) {
            super.afterTextChanged(editable);
            this.f158761a.mo217674g().mo217542a(String.valueOf(editable));
            if (C57782ag.m224241a(String.valueOf(editable))) {
                View k = this.f158761a.mo217678k();
                if (k != null) {
                    k.setVisibility(8);
                }
                this.f158761a.mo217681n().setVisibility(0);
                return;
            }
            View k2 = this.f158761a.mo217678k();
            if (k2 != null) {
                k2.setVisibility(0);
            }
            this.f158761a.mo217681n().setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/share/VideoChatShareView$initSearchRecyclerView$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.h$m */
    public static final class C62994m extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareView f158765a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62994m(VideoChatShareView hVar) {
            this.f158765a = hVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            this.f158765a.mo217687t().mo217656a(false, this.f158765a.mo217677j());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/share/VideoChatShareView$mClickListener$1", "Lcom/ss/android/vc/meeting/module/share/OnVideoChatShareItemClickListener;", "onItemClick", "", "item", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "position", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.h$q */
    public static final class C62998q implements OnVideoChatShareItemClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareView f158770a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62998q(VideoChatShareView hVar) {
            this.f158770a = hVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.share.h$q$a */
        static final class C62999a extends Lambda implements Function1<VideoChatShareItem, Boolean> {
            final /* synthetic */ VideoChatShareItem $item;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C62999a(VideoChatShareItem videoChatShareItem) {
                super(1);
                this.$item = videoChatShareItem;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Boolean invoke(VideoChatShareItem videoChatShareItem) {
                return Boolean.valueOf(invoke(videoChatShareItem));
            }

            public final boolean invoke(VideoChatShareItem videoChatShareItem) {
                Intrinsics.checkParameterIsNotNull(videoChatShareItem, "it");
                if (Intrinsics.areEqual(videoChatShareItem.getId(), this.$item.getId()) && videoChatShareItem.isSecret() == this.$item.isSecret() && videoChatShareItem.getType() == this.$item.getType()) {
                    return true;
                }
                return false;
            }
        }

        @Override // com.ss.android.vc.meeting.module.share.OnVideoChatShareItemClickListener
        /* renamed from: a */
        public void mo217588a(VideoChatShareItem videoChatShareItem, int i) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(videoChatShareItem, "item");
            ArrayList<VideoChatShareItem> a = this.f158770a.mo217674g().mo217539a();
            int b = this.f158770a.mo217674g().mo217544b();
            ArrayList<VideoChatShareItem> arrayList = a;
            Iterator<VideoChatShareItem> it = arrayList.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                VideoChatShareItem next = it.next();
                if (Intrinsics.areEqual(next.getId(), videoChatShareItem.getId()) && next.isSecret() == videoChatShareItem.isSecret() && next.getType() == videoChatShareItem.getType()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                a.add(new VideoChatShareItem(videoChatShareItem.getId(), videoChatShareItem.getName(), videoChatShareItem.getImageKey(), videoChatShareItem.getDesc(), videoChatShareItem.getType(), videoChatShareItem.isSecret(), videoChatShareItem.getHitTerms(), null, videoChatShareItem.isExternal(), videoChatShareItem.isLeave(), false, 0, null, null, null, false, videoChatShareItem.getCustomStatuses(), 64512, null));
                if (videoChatShareItem.getType() == ShareItemType.GROUP) {
                    b++;
                }
            } else {
                CollectionsKt.removeAll((List) arrayList, (Function1) new C62999a(videoChatShareItem));
                if (videoChatShareItem.getType() == ShareItemType.GROUP) {
                    b--;
                }
            }
            this.f158770a.mo217674g().mo217540a(b);
            this.f158770a.mo217665a(a.size() - b, b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/share/VideoChatShareView$mMeetingForwarder$1", "Lcom/ss/android/vc/meeting/module/share/shareconfirm/ShareMeetingConfirmDialogUtil$MeetingMessageForwarder;", "forwardToChat", "", "chatterIdList", "Ljava/util/ArrayList;", "", "chatIdList", "noteText", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.h$r */
    public static final class C63000r implements C62960b.AbstractC62964a {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareView f158771a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63000r(VideoChatShareView hVar) {
            this.f158771a = hVar;
        }

        @Override // com.ss.android.vc.meeting.module.share.p3162c.C62960b.AbstractC62964a
        /* renamed from: a */
        public void mo217596a(ArrayList<String> arrayList, ArrayList<String> arrayList2, String str) {
            Intrinsics.checkParameterIsNotNull(arrayList, "chatterIdList");
            Intrinsics.checkParameterIsNotNull(arrayList2, "chatIdList");
            Intrinsics.checkParameterIsNotNull(str, "noteText");
            this.f158771a.mo217669a(arrayList, arrayList2, str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.h$j */
    public static final class View$OnClickListenerC62991j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareView f158762a;

        View$OnClickListenerC62991j(VideoChatShareView hVar) {
            this.f158762a = hVar;
        }

        public final void onClick(View view) {
            this.f158762a.mo217677j().getText().clear();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.h$o */
    public static final class View$OnClickListenerC62996o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareView f158768a;

        View$OnClickListenerC62996o(VideoChatShareView hVar) {
            this.f158768a = hVar;
        }

        public final void onClick(View view) {
            this.f158768a.mo217687t().mo217654a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.h$p */
    public static final class View$OnClickListenerC62997p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareView f158769a;

        View$OnClickListenerC62997p(VideoChatShareView hVar) {
            this.f158769a = hVar;
        }

        public final void onClick(View view) {
            this.f158769a.mo217687t().mo217654a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.h$k */
    public static final class View$OnClickListenerC62992k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareView f158763a;

        View$OnClickListenerC62992k(VideoChatShareView hVar) {
            this.f158763a = hVar;
        }

        public final void onClick(View view) {
            this.f158763a.mo217677j().getText().clear();
            this.f158763a.mo217677j().clearFocus();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.h$c */
    public static final class View$OnClickListenerC62984c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareView f158754a;

        View$OnClickListenerC62984c(VideoChatShareView hVar) {
            this.f158754a = hVar;
        }

        public final void onClick(View view) {
            if (this.f158754a.mo217674g().mo217539a().size() > 0) {
                this.f158754a.mo217687t().mo217655a(this.f158754a.mo217674g().mo217539a());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/vc/meeting/module/share/VideoChatShareView$initFeedRecyclerView$1", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareListAdapter$IOnItemTouchListener;", "onPressed", "", "position", "", "onRelease", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.h$e */
    public static final class C62986e implements VideoChatShareListAdapter.IOnItemTouchListener {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareView f158756a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView f158757b;

        @Override // com.ss.android.vc.meeting.module.share.VideoChatShareListAdapter.IOnItemTouchListener
        /* renamed from: a */
        public void mo217616a(int i) {
            int i2 = i - 1;
            RecyclerView.LayoutManager layoutManager = this.f158757b.getLayoutManager();
            if (layoutManager == null) {
                throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            } else if (i2 >= ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition()) {
                this.f158756a.mo217667a(this.f158757b, i2, true);
            }
        }

        @Override // com.ss.android.vc.meeting.module.share.VideoChatShareListAdapter.IOnItemTouchListener
        /* renamed from: b */
        public void mo217617b(int i) {
            int i2 = i - 1;
            RecyclerView.LayoutManager layoutManager = this.f158757b.getLayoutManager();
            if (layoutManager == null) {
                throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            } else if (i2 >= ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition()) {
                this.f158756a.mo217667a(this.f158757b, i2, false);
            }
        }

        C62986e(VideoChatShareView hVar, RecyclerView recyclerView) {
            this.f158756a = hVar;
            this.f158757b = recyclerView;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.h$g */
    public static final class View$OnClickListenerC62988g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareView f158759a;

        View$OnClickListenerC62988g(VideoChatShareView hVar) {
            this.f158759a = hVar;
        }

        public final void onClick(View view) {
            this.f158759a.mo217677j().setFocusable(true);
            this.f158759a.mo217677j().setFocusableInTouchMode(true);
            this.f158759a.mo217677j().requestFocus();
            this.f158759a.mo217687t().mo217656a(true, this.f158759a.mo217677j());
            this.f158759a.mo217681n().setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.h$l */
    public static final class View$OnClickListenerC62993l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareView f158764a;

        View$OnClickListenerC62993l(VideoChatShareView hVar) {
            this.f158764a = hVar;
        }

        public final void onClick(View view) {
            this.f158764a.mo217677j().getText().clear();
            this.f158764a.mo217677j().clearFocus();
            this.f158764a.mo217681n().setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/vc/meeting/module/share/VideoChatShareView$initSearchRecyclerView$2", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareListAdapter$IOnItemTouchListener;", "onPressed", "", "position", "", "onRelease", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.h$n */
    public static final class C62995n implements VideoChatShareListAdapter.IOnItemTouchListener {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareView f158766a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView f158767b;

        @Override // com.ss.android.vc.meeting.module.share.VideoChatShareListAdapter.IOnItemTouchListener
        /* renamed from: a */
        public void mo217616a(int i) {
            int i2 = i - 1;
            RecyclerView.LayoutManager layoutManager = this.f158767b.getLayoutManager();
            if (layoutManager == null) {
                throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            } else if (i2 >= ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition()) {
                this.f158766a.mo217667a(this.f158767b, i2, true);
            }
        }

        @Override // com.ss.android.vc.meeting.module.share.VideoChatShareListAdapter.IOnItemTouchListener
        /* renamed from: b */
        public void mo217617b(int i) {
            int i2 = i - 1;
            RecyclerView.LayoutManager layoutManager = this.f158767b.getLayoutManager();
            if (layoutManager == null) {
                throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            } else if (i2 >= ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition()) {
                this.f158766a.mo217667a(this.f158767b, i2, false);
            }
        }

        C62995n(VideoChatShareView hVar, RecyclerView recyclerView) {
            this.f158766a = hVar;
            this.f158767b = recyclerView;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.h$d */
    public static final class View$OnClickListenerC62985d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareView f158755a;

        View$OnClickListenerC62985d(VideoChatShareView hVar) {
            this.f158755a = hVar;
        }

        public final void onClick(View view) {
            if (this.f158755a.mo217674g().mo217539a() != null) {
                ArrayList<VideoChatShareItem> arrayList = new ArrayList<>(this.f158755a.mo217674g().mo217539a());
                if (this.f158755a.mo217689v()) {
                    this.f158755a.mo217674g().mo217543a(arrayList);
                    return;
                }
                C62960b.m246542a(this.f158755a.mo217685r(), arrayList, this.f158755a.mo217682o(), this.f158755a.mo217688u().mo212056e());
                ap.m250027a(this.f158755a.mo217688u().mo212056e());
            }
        }
    }

    /* renamed from: a */
    public void setViewDelegate(IVideoChatShareContract.IView.Delegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewDelegate");
        this.f158728a = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        aVar.mo217539a();
    }

    @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IView
    /* renamed from: a */
    public void mo217531a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        IVideoChatShareContract.IView.Delegate aVar = this.f158728a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        if (aVar.mo217545c()) {
            this.f158742o.setVisibility(0);
            this.f158739l.setVisibility(8);
            this.f158743p.setVisibility(8);
        }
    }

    @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IView
    /* renamed from: a */
    public void mo217532a(ArrayList<VideoChatShareItem> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "feed");
        VideoChatShareListAdapter eVar = this.f158729b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        eVar.mo217604a(arrayList);
    }

    /* renamed from: a */
    public final void mo217666a(View view, int i) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i;
            view.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "focus", "", "onFocusChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.h$h */
    public static final class View$OnFocusChangeListenerC62989h implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareView f158760a;

        View$OnFocusChangeListenerC62989h(VideoChatShareView hVar) {
            this.f158760a = hVar;
        }

        public final void onFocusChange(View view, boolean z) {
            int i;
            this.f158760a.mo217687t().mo217656a(z, this.f158760a.mo217677j());
            TextView l = this.f158760a.mo217679l();
            int i2 = 0;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            l.setVisibility(i);
            View n = this.f158760a.mo217681n();
            if (!z) {
                i2 = 8;
            }
            n.setVisibility(i2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "isShown", "", "keyboardHeight", "", "onKeyboardStateChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.h$f */
    public static final class C62987f implements C60762k.AbstractC60764a {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareView f158758a;

        C62987f(VideoChatShareView hVar) {
            this.f158758a = hVar;
        }

        @Override // com.ss.android.vc.common.p3083e.C60762k.AbstractC60764a
        public final void onKeyboardStateChanged(boolean z, int i) {
            this.f158758a.mo217671b(z);
            if (!z || this.f158758a.mo217676i()) {
                VideoChatShareView hVar = this.f158758a;
                hVar.mo217666a(hVar.mo217680m(), 0);
                return;
            }
            int[] iArr = new int[2];
            this.f158758a.mo217680m().getLocationOnScreen(iArr);
            int height = iArr[1] - ((this.f158758a.f158732e - this.f158758a.mo217680m().getHeight()) - i);
            if (height > 0 && height < DeviceUtils.getScreenHeight(this.f158758a.mo217685r()) / 2) {
                VideoChatShareView hVar2 = this.f158758a;
                hVar2.mo217666a(hVar2.mo217680m(), height);
            }
        }
    }

    /* renamed from: a */
    public final void mo217665a(int i, int i2) {
        TextView textView = this.f158744q;
        StringBuilder sb = new StringBuilder();
        sb.append(UIHelper.getString(R.string.View_M_Selected));
        int i3 = i + i2;
        sb.append(i3);
        textView.setText(sb.toString());
        if (i3 > 0) {
            this.f158738k.setTextColor(this.f158722C.getResources().getColor(R.color.static_white));
            this.f158738k.setBackgroundResource(R.drawable.invite_dialog_invite_confirm_bt_selector);
            this.f158738k.setClickable(true);
            ColorStateList colorStateList = this.f158722C.getResources().getColorStateList(R.color.in_meeting_blue_text_selector);
            Intrinsics.checkExpressionValueIsNotNull(colorStateList, "activity.resources.getCo…eting_blue_text_selector)");
            this.f158744q.setTextColor(colorStateList);
            this.f158744q.setClickable(true);
            return;
        }
        this.f158738k.setTextColor(this.f158722C.getResources().getColor(R.color.udtoken_btn_pri_text_disabled));
        this.f158738k.setBackgroundResource(R.drawable.invite_dialog_invite_confirm_bt_disabled);
        this.f158738k.setClickable(false);
        this.f158744q.setTextColor(this.f158722C.getResources().getColor(R.color.primary_pri_300));
        this.f158744q.setClickable(false);
    }

    /* renamed from: a */
    public final void mo217667a(RecyclerView recyclerView, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "listView");
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
        if (findViewHolderForAdapterPosition != null && (findViewHolderForAdapterPosition instanceof VideoChatShareListAdapter.ViewHolder)) {
            ((VideoChatShareListAdapter.ViewHolder) findViewHolderForAdapterPosition).mo217619a(z);
        }
    }

    /* renamed from: a */
    public final void mo217669a(ArrayList<String> arrayList, ArrayList<String> arrayList2, String str) {
        Intrinsics.checkParameterIsNotNull(arrayList, "chatterIdList");
        Intrinsics.checkParameterIsNotNull(arrayList2, "chatIdList");
        IVideoChatShareContract.IView.Delegate aVar = this.f158728a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        String d = aVar.mo217546d();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("conference_id", d);
            C63726b.m249915a("vc_in_meeting_link_share", jSONObject, this.f158725F.mo212056e());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        VcBizSender.m249193a(d, arrayList, arrayList2, ShareVideoChatEntityRequest.ShareFrom.FROM_VC, str).mo219893b(new C63009u(this));
    }

    public VideoChatShareView(Activity activity, View view, ViewDependency bVar, C61303k kVar, boolean z, boolean z2) {
        String str;
        String str2;
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        this.f158722C = activity;
        this.f158723D = view;
        this.f158724E = bVar;
        this.f158725F = kVar;
        this.f158726G = z;
        this.f158727H = z2;
        View findViewById = view.findViewById(R.id.confirm);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.confirm)");
        this.f158738k = (Button) findViewById;
        View findViewById2 = view.findViewById(R.id.feed_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.feed_container)");
        this.f158739l = (RecyclerView) findViewById2;
        View findViewById3 = view.findViewById(R.id.search_bar);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.search_bar)");
        this.f158740m = findViewById3;
        View findViewById4 = view.findViewById(R.id.search_et);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.findViewById(R.id.search_et)");
        this.f158741n = (ExtendedEditText) findViewById4;
        View findViewById5 = view.findViewById(R.id.search_empty_hint);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "rootView.findViewById(R.id.search_empty_hint)");
        this.f158742o = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.search_list);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "rootView.findViewById(R.id.search_list)");
        this.f158743p = (RecyclerView) findViewById6;
        View findViewById7 = view.findViewById(R.id.select_count);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "rootView.findViewById(R.id.select_count)");
        this.f158744q = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.clear_search);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "rootView.findViewById(R.id.clear_search)");
        this.f158745r = findViewById8;
        View findViewById9 = view.findViewById(R.id.tv_invite_search_cancel);
        Intrinsics.checkExpressionValueIsNotNull(findViewById9, "rootView.findViewById(R.….tv_invite_search_cancel)");
        this.f158746s = (TextView) findViewById9;
        View findViewById10 = view.findViewById(R.id.bottom_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById10, "rootView.findViewById(R.id.bottom_container)");
        this.f158747t = findViewById10;
        View findViewById11 = view.findViewById(R.id.loading_Layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById11, "rootView.findViewById(R.id.loading_Layout)");
        this.f158748u = findViewById11;
        View findViewById12 = view.findViewById(R.id.fl_share_list_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById12, "rootView.findViewById(R.….fl_share_list_container)");
        this.f158749v = (FrameLayout) findViewById12;
        View findViewById13 = view.findViewById(R.id.share_dialog_go_back);
        Intrinsics.checkExpressionValueIsNotNull(findViewById13, "rootView.findViewById(R.id.share_dialog_go_back)");
        this.f158750w = (IconFontView) findViewById13;
        View findViewById14 = view.findViewById(R.id.share_title_view);
        Intrinsics.checkExpressionValueIsNotNull(findViewById14, "rootView.findViewById(R.id.share_title_view)");
        this.f158751x = (TextView) findViewById14;
        View findViewById15 = view.findViewById(R.id.share_padding_mask);
        Intrinsics.checkExpressionValueIsNotNull(findViewById15, "rootView.findViewById(R.id.share_padding_mask)");
        this.f158752y = findViewById15;
        this.f158732e = DeviceUtils.getScreenHeight(activity);
        TextView textView = this.f158751x;
        int i = R.string.View_M_Share;
        if (z2) {
            str = activity.getString(R.string.View_G_SelectContactsGroups);
        } else {
            str = activity.getString(R.string.View_M_Share);
        }
        textView.setText(str);
        ExtendedEditText extendedEditText = this.f158741n;
        if (z2) {
            str2 = activity.getString(R.string.View_G_SearchContactsGroups);
        } else {
            str2 = activity.getString(R.string.Lark_Legacy_Search);
        }
        extendedEditText.setHint(str2);
        this.f158738k.setText(activity.getString(z2 ? R.string.View_M_Save : i));
        this.f158753z = new C63000r(this);
        this.f158720A = new C62998q(this);
        this.f158721B = new C63001s(this);
    }
}
