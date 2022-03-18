package com.ss.android.lark.profile.func.user_profile.mvp;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDBaseListDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.component.universe_design.emptystate.UDEmptyState;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.func.profile_setting.ProfileSettingInitData;
import com.ss.android.lark.profile.func.user_profile.action.ActionBtnBinder;
import com.ss.android.lark.profile.func.user_profile.action.ActionBtnViewData;
import com.ss.android.lark.profile.func.user_profile.action.IActionBtnDependency;
import com.ss.android.lark.profile.func.user_profile.header.HeaderBinder;
import com.ss.android.lark.profile.func.user_profile.header.IHeaderBinderDependency;
import com.ss.android.lark.profile.func.user_profile.infos.BaseInfoViewData;
import com.ss.android.lark.profile.func.user_profile.infos.BinderPool;
import com.ss.android.lark.profile.func.user_profile.infos.InfoAdapter;
import com.ss.android.lark.profile.func.user_profile.infos.alias.AliasItemBinder;
import com.ss.android.lark.profile.func.user_profile.infos.alias.AliasItemViewData;
import com.ss.android.lark.profile.func.user_profile.infos.alias.IAliasItemDependency;
import com.ss.android.lark.profile.func.user_profile.infos.department.DepartmentItemListDataSource;
import com.ss.android.lark.profile.func.user_profile.infos.department.DepartmentNameItemBinder;
import com.ss.android.lark.profile.func.user_profile.infos.link.ILinkDependency;
import com.ss.android.lark.profile.func.user_profile.infos.link.LinkItemBinder;
import com.ss.android.lark.profile.func.user_profile.infos.link.LinkItemViewData;
import com.ss.android.lark.profile.func.user_profile.infos.list.LinkItemListDataSource;
import com.ss.android.lark.profile.func.user_profile.infos.list.LinkListItemBinder;
import com.ss.android.lark.profile.func.user_profile.infos.list.TextItemListDataSource;
import com.ss.android.lark.profile.func.user_profile.infos.list.TextListItemBinder;
import com.ss.android.lark.profile.func.user_profile.infos.listinfos.InfoListItemBinder;
import com.ss.android.lark.profile.func.user_profile.infos.phone_number.IPhoneNumberDependency;
import com.ss.android.lark.profile.func.user_profile.infos.phone_number.PhoneNumberItemBinder;
import com.ss.android.lark.profile.func.user_profile.infos.phone_number.PhoneNumberItemViewData;
import com.ss.android.lark.profile.func.user_profile.infos.status.IStatusDependency;
import com.ss.android.lark.profile.func.user_profile.infos.status.StatusItemBinder;
import com.ss.android.lark.profile.func.user_profile.infos.status.StatusItemViewData;
import com.ss.android.lark.profile.func.user_profile.infos.text.ITextDependency;
import com.ss.android.lark.profile.func.user_profile.infos.text.TextItemBinder;
import com.ss.android.lark.profile.func.user_profile.infos.text.TextItemViewData;
import com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract;
import com.ss.android.lark.profile.statistics.ProfileHitPoint;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.p2932c.C58329a;
import com.ss.android.lark.widget.p2932c.C58333b;
import com.ss.android.lark.widget.p2932c.C58339d;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00012\u00020\u0001:\u0004\u0001\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020\u00172\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020\u00172\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020\u0017H\u0002J\b\u00109\u001a\u00020\u0017H\u0002J\b\u0010:\u001a\u00020\u0017H\u0002J\b\u0010;\u001a\u00020\u0017H\u0002J\u0018\u0010<\u001a\u00020\u00172\u0006\u0010=\u001a\u00020\u00192\u0006\u0010>\u001a\u00020\u0019H\u0016J\u0018\u0010?\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u00192\u0006\u0010@\u001a\u00020AH\u0016J\"\u0010B\u001a\u00020\u00172\u0006\u0010=\u001a\u00020\u00192\b\u0010C\u001a\u0004\u0018\u00010\u00192\u0006\u0010D\u001a\u00020\u0003H\u0016J\"\u0010E\u001a\u00020\u00172\u0006\u0010=\u001a\u00020\u00192\b\u0010C\u001a\u0004\u0018\u00010\u00192\u0006\u0010D\u001a\u00020\u0003H\u0016J\u0010\u0010F\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u0019H\u0016J\u0010\u0010G\u001a\u00020\u00172\u0006\u0010H\u001a\u00020\u0019H\u0016J\u0010\u0010I\u001a\u00020\u00172\u0006\u0010J\u001a\u00020\u0019H\u0016J\u0010\u0010K\u001a\u00020\u00172\u0006\u0010L\u001a\u00020\u0015H\u0016J\b\u0010M\u001a\u00020\u0017H\u0016J\u0018\u0010N\u001a\u00020\u00172\u0006\u0010O\u001a\u00020P2\u0006\u0010@\u001a\u00020AH\u0016J\u0018\u0010Q\u001a\u00020\u00172\u0006\u0010R\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010S\u001a\u00020\u00172\u0006\u0010R\u001a\u00020\u00192\u0006\u0010T\u001a\u00020UH\u0016J\b\u0010V\u001a\u00020\u0017H\u0002J\b\u0010W\u001a\u00020\u0017H\u0016J\b\u0010X\u001a\u00020\u0017H\u0016J\b\u0010Y\u001a\u00020\u0017H\u0016J(\u0010Z\u001a\u00020\u00172\u0006\u0010[\u001a\u00020U2\u0006\u0010\\\u001a\u00020U2\u0006\u0010]\u001a\u00020U2\u0006\u0010^\u001a\u00020UH\u0016J\b\u0010_\u001a\u00020\u0017H\u0002J(\u0010`\u001a\u00020\u00172\u0006\u0010a\u001a\u00020\u00032\u0006\u0010b\u001a\u00020U2\u0006\u0010c\u001a\u00020U2\u0006\u0010d\u001a\u00020UH\u0016J\u0010\u0010e\u001a\u00020\u00172\u0006\u0010f\u001a\u000207H\u0016J\u0010\u0010e\u001a\u00020\u00172\u0006\u0010g\u001a\u00020\u0019H\u0016J\u0010\u0010h\u001a\u00020\u00172\u0006\u0010i\u001a\u00020jH\u0016JF\u0010k\u001a\u00020\u00172\b\u0010>\u001a\u0004\u0018\u00010\u00192\b\u0010l\u001a\u0004\u0018\u00010\u00192\b\u0010H\u001a\u0004\u0018\u00010\u00192\u0006\u0010R\u001a\u00020\u00192\u0006\u0010m\u001a\u00020A2\u0006\u0010n\u001a\u00020U2\u0006\u0010o\u001a\u00020UH\u0016J0\u0010p\u001a\u00020\u00172\b\u0010>\u001a\u0004\u0018\u00010\u00192\b\u0010R\u001a\u0004\u0018\u00010\u00192\b\u0010l\u001a\u0004\u0018\u00010\u00192\b\u0010q\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010r\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u0019H\u0016J\u0010\u0010s\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u0019H\u0016J\u0010\u0010t\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u0019H\u0016J$\u0010u\u001a\u00020\u00172\b\u0010v\u001a\u0004\u0018\u00010\u00192\b\u0010w\u001a\u0004\u0018\u00010\u00192\u0006\u0010m\u001a\u00020AH\u0016J\u0010\u0010x\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u0019H\u0016J\u0010\u0010y\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u0019H\u0016J\u0010\u0010z\u001a\u00020\u00172\u0006\u0010{\u001a\u00020|H\u0016J\u0010\u0010}\u001a\u00020\u00172\u0006\u0010~\u001a\u00020H\u0016J\u0013\u0010\u0001\u001a\u00020\u00172\b\u0010\u0001\u001a\u00030\u0001H\u0016R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfileView;", "Lcom/ss/android/lark/profile/func/user_profile/mvp/IUserProfileContract$IView;", "mRootView", "Landroid/view/View;", "mActivity", "Landroid/app/Activity;", "mViewDependency", "Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfileView$ViewDependency;", "(Landroid/view/View;Landroid/app/Activity;Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfileView$ViewDependency;)V", "mActionBtnBinder", "Lcom/ss/android/lark/profile/func/user_profile/action/ActionBtnBinder;", "mBrowserModule", "Lcom/ss/android/lark/profile/dependency/IProfileModuleDependency$IBrowserDependency;", "mHeaderBinder", "Lcom/ss/android/lark/profile/func/user_profile/header/HeaderBinder;", "mHeaderRootView", "Landroid/view/ViewGroup;", "mInfoAdapter", "Lcom/ss/android/lark/profile/func/user_profile/infos/InfoAdapter;", "mTitleRightIV", "mViewDelegate", "Lcom/ss/android/lark/profile/func/user_profile/mvp/IUserProfileContract$IView$IDelegate;", "callUser", "", "phoneNumber", "", "create", "destroy", "finish", "getActionBtnDependency", "Lcom/ss/android/lark/profile/func/user_profile/action/IActionBtnDependency;", "getAliasItemDependency", "Lcom/ss/android/lark/profile/func/user_profile/infos/alias/IAliasItemDependency;", "getBinderPool", "Lcom/ss/android/lark/profile/func/user_profile/infos/BinderPool;", "getDepartmentItemDependency", "Lcom/ss/android/lark/profile/func/user_profile/infos/department/IDepartmentDependency;", "getHeaderDependency", "Lcom/ss/android/lark/profile/func/user_profile/header/IHeaderBinderDependency;", "getLinkItemDependency", "Lcom/ss/android/lark/profile/func/user_profile/infos/link/ILinkDependency;", "getPhoneNumberItemDependency", "Lcom/ss/android/lark/profile/func/user_profile/infos/phone_number/IPhoneNumberDependency;", "getStatusItemDependency", "Lcom/ss/android/lark/profile/func/user_profile/infos/status/IStatusDependency;", "getTextItemDependency", "Lcom/ss/android/lark/profile/func/user_profile/infos/text/ITextDependency;", "go2ProfileSetting", "profileSettingInitData", "Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingInitData;", "go2ProfileShare", "content", "Lcom/ss/android/lark/chat/entity/message/content/ProfileContent;", "handleVcLauncherError", "error", "", "initActionBtn", "initHeader", "initInfos", "initTitleBar", "onMineAvatarUpdate", "avatarKey", "userId", "openChat", "contactSource", "Lcom/ss/android/lark/biz/core/api/ContactSource;", "openCommonAvatar", "entityId", "view", "openLoginUserAvatar", "openPhoneQueryAmountEditPage", "openSecretChat", "chatId", "openUrl", "url", "setViewDelegate", "viewDelegate", "showAddedToast", "showApplyCollabDialog", "contact", "Lcom/ss/android/lark/contact/entity/Contact;", "showCallConfirmDialog", "userName", "showCreateSecretConfirmDialog", "isExternal", "", "showDeleteNameCardDialog", "showEmptyPage", "showLoadDataError", "showNameCardEditorMenu", "showPhoneCallSelectMenu", "showEnterprisePhoneCall", "showPhoneCall", "showEmergencyCall", "showVoiceCall", "showShowPhoneNumberConfirm", "showTitleBarRightClickMenu", "anchorView", "isShowPhoneCallTimeSet", "isShowReport", "isShowShareProfile", "showToast", "msgId", "msg", "showUserInfo", "viewData", "Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfileViewData;", "startAddContactPage", "token", ShareHitPoint.f121868c, "isHasTenantCertification", "isTenantCertification", "startAliasEditorActivity", "alias", "startEmergencyCall", "startEnterprisePhoneCall", "startQueryPhoneNumber", "startReasonRequestEditActivity", "friendRequestToken", "fromChatId", "startVideoChat", "startVoiceCall", "updateActionBtn", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/profile/func/user_profile/action/ActionBtnViewData;", "updateHeader", "headerViewData", "Lcom/ss/android/lark/profile/func/user_profile/header/HeaderViewData;", "updateInfo", "baseViewData", "Lcom/ss/android/lark/profile/func/user_profile/infos/BaseInfoViewData;", "Companion", "ViewDependency", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.b.d */
public final class UserProfileView implements IUserProfileContract.IView {

    /* renamed from: e */
    public static final Companion f130103e = new Companion(null);

    /* renamed from: a */
    public IUserProfileContract.IView.IDelegate f130104a;

    /* renamed from: b */
    public final IProfileModuleDependency.AbstractC52245b f130105b;

    /* renamed from: c */
    public final Activity f130106c;

    /* renamed from: d */
    public final ViewDependency f130107d;

    /* renamed from: f */
    private HeaderBinder f130108f;

    /* renamed from: g */
    private ActionBtnBinder f130109g;

    /* renamed from: h */
    private ViewGroup f130110h;

    /* renamed from: i */
    private InfoAdapter f130111i;

    /* renamed from: j */
    private View f130112j;

    /* renamed from: k */
    private final View f130113k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\rH&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H&J\"\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0016H&J\"\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0005H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0005H&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0005H&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0005H&J\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u0011H&JF\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u00052\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&H&J0\u0010(\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010#\u001a\u0004\u0018\u00010\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0005H&J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0005H&J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0005H&J$\u0010-\u001a\u00020\u00032\b\u0010.\u001a\u0004\u0018\u00010\u00052\b\u0010/\u001a\u0004\u0018\u00010\u00052\u0006\u0010$\u001a\u00020\u0011H&J\u0018\u00100\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u00101\u001a\u000202H&J\u0018\u00103\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u00104\u001a\u000202H&¨\u00065"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfileView$ViewDependency;", "", "callUser", "", "phoneNumber", "", "copy2Clipboard", "content", "finishActivity", "go2ProfileSetting", "profileSettingInitData", "Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingInitData;", "go2ProfileShare", "Lcom/ss/android/lark/chat/entity/message/content/ProfileContent;", "openChat", "userId", "contactSource", "Lcom/ss/android/lark/biz/core/api/ContactSource;", "openCommonAvatar", "avatarKey", "entityId", "view", "Landroid/view/View;", "openLoginUserAvatar", "openPhoneQueryAmountEditPage", "openRouterActivity", "url", "openSecretChat", "chatId", "openUrl", "showApplyCollabDialog", "contact", "Lcom/ss/android/lark/contact/entity/Contact;", "startAddContactPage", "token", "userName", ShareHitPoint.f121868c, "isHasTenantCertification", "", "isTenantCertification", "startAliasEditorActivity", "alias", "startEmergencyCall", "startEnterprisePhoneCall", "startQueryPhoneNumber", "startReasonRequestEditActivity", "friendRequestToken", "fromChatId", "startVideoChat", "launcherCallback", "Lcom/ss/android/lark/profile/dependency/IProfileModuleDependency$IVCLaunchCallback;", "startVoiceCall", "launchCallback", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.d$b */
    public interface ViewDependency {
        /* renamed from: a */
        void mo179569a();

        /* renamed from: a */
        void mo179570a(ProfileContent profileContent);

        /* renamed from: a */
        void mo179571a(Contact contact, ContactSource contactSource);

        /* renamed from: a */
        void mo179572a(ProfileSettingInitData profileSettingInitData);

        /* renamed from: a */
        void mo179573a(String str);

        /* renamed from: a */
        void mo179574a(String str, ContactSource contactSource);

        /* renamed from: a */
        void mo179575a(String str, IProfileModuleDependency.IVCLaunchCallback iVCLaunchCallback);

        /* renamed from: a */
        void mo179576a(String str, String str2, View view);

        /* renamed from: a */
        void mo179577a(String str, String str2, ContactSource contactSource);

        /* renamed from: a */
        void mo179578a(String str, String str2, String str3, String str4);

        /* renamed from: a */
        void mo179579a(String str, String str2, String str3, String str4, ContactSource contactSource, boolean z, boolean z2);

        /* renamed from: b */
        void mo179580b(String str);

        /* renamed from: b */
        void mo179581b(String str, IProfileModuleDependency.IVCLaunchCallback iVCLaunchCallback);

        /* renamed from: b */
        void mo179582b(String str, String str2, View view);

        /* renamed from: c */
        void mo179583c(String str);

        /* renamed from: d */
        void mo179584d(String str);

        /* renamed from: e */
        void mo179585e(String str);

        /* renamed from: f */
        void mo179586f(String str);

        /* renamed from: g */
        void mo179587g(String str);

        /* renamed from: h */
        void mo179588h(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.d$t */
    static final class C52600t implements C58339d.AbstractC58343b {

        /* renamed from: a */
        public static final C52600t f130132a = new C52600t();

        C52600t() {
        }

        @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
        public final void onMenuItemClick() {
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfileView$Companion;", "", "()V", "TAG", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: a */
    public void mo179668a(UserProfileViewData eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "viewData");
        RelativeLayout relativeLayout = (RelativeLayout) this.f130113k.findViewById(R.id.mPlaceholder);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "mRootView.mPlaceholder");
        int i = 8;
        relativeLayout.setVisibility(8);
        HeaderBinder aVar = this.f130108f;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderBinder");
        }
        ViewGroup viewGroup = this.f130110h;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderRootView");
        }
        aVar.mo179592a((View) viewGroup, eVar.mo179784b());
        View view = this.f130112j;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleRightIV");
        }
        if (eVar.mo179787e().mo179788a()) {
            i = 0;
        }
        view.setVisibility(i);
        ((CommonTitleBar) this.f130113k.findViewById(R.id.mTitleBar)).setLeftVisible(eVar.mo179787e().mo179789b());
        ActionBtnBinder aVar2 = this.f130109g;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActionBtnBinder");
        }
        aVar2.mo179592a(this.f130113k, eVar.mo179786d());
        if (!eVar.mo179783a()) {
            CommonRecyclerView commonRecyclerView = (CommonRecyclerView) this.f130113k.findViewById(R.id.mInfoRv);
            Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView, "mRootView.mInfoRv");
            commonRecyclerView.setVisibility(0);
            InfoAdapter dVar = this.f130111i;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInfoAdapter");
            }
            dVar.mo179877a(eVar.mo179784b().mo179794c());
            InfoAdapter dVar2 = this.f130111i;
            if (dVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInfoAdapter");
            }
            dVar2.resetAll(eVar.mo179785c());
            return;
        }
        mo179687e();
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: a */
    public void mo179669a(BaseInfoViewData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "baseViewData");
        InfoAdapter dVar = this.f130111i;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfoAdapter");
        }
        if (CollectionUtils.isNotEmpty(dVar.getItems())) {
            int i = 0;
            InfoAdapter dVar2 = this.f130111i;
            if (dVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInfoAdapter");
            }
            int size = dVar2.getItems().size();
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                }
                InfoAdapter dVar3 = this.f130111i;
                if (dVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInfoAdapter");
                }
                if (TextUtils.equals(((BaseInfoViewData) dVar3.getItems().get(i)).mo179590d(), bVar.mo179590d())) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                InfoAdapter dVar4 = this.f130111i;
                if (dVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInfoAdapter");
                }
                dVar4.getItems().set(i, bVar);
                InfoAdapter dVar5 = this.f130111i;
                if (dVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInfoAdapter");
                }
                dVar5.notifyItemChanged(i);
                return;
            }
            return;
        }
        InfoAdapter dVar6 = this.f130111i;
        if (dVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfoAdapter");
        }
        dVar6.add(bVar);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: a */
    public void mo179675a(String str, String str2, String str3, String str4) {
        this.f130107d.mo179578a(str, str2, str3, str4);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: a */
    public void mo179673a(String str, String str2, View view) {
        Intrinsics.checkParameterIsNotNull(str, "avatarKey");
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f130107d.mo179576a(str, str2, view);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: a */
    public void mo179671a(String str, ContactSource contactSource) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(contactSource, "contactSource");
        this.f130107d.mo179574a(str, contactSource);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: a */
    public void mo179670a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.f130107d.mo179573a(str);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: a */
    public void mo179677a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "userName");
        UDDialogBuilder eVar = new UDDialogBuilder(this.f130106c);
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_SecretCreateConfirmNotice, "name", str);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…Notice, \"name\", userName)");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.message(mustacheFormat)).addActionButton(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null)).addActionButton(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmTip, new DialogInterface$OnClickListenerC52592l(this, z))).show();
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: a */
    public void mo179678a(boolean z, boolean z2, boolean z3, boolean z4) {
        String str;
        ArrayList arrayList = new ArrayList();
        C58329a j = new C58329a.C58331a().mo197551d(R.color.line_divider_default).mo197546a(UIUtils.getString(this.f130106c, R.string.Lark_View_OfficePhonePaid)).mo197550c(R.color.text_title).mo197548b(R.color.icon_n1).mo197544a(R.drawable.ud_icon_officephone_outlined).mo197545a(new C52596p(this)).mo197558j();
        Intrinsics.checkExpressionValueIsNotNull(j, "Builder().setDividerColo…\n                .build()");
        C58329a aVar = j;
        C58329a j2 = new C58329a.C58331a().mo197551d(R.color.line_divider_default).mo197546a(UIUtils.getString(this.f130106c, R.string.Lark_View_VoiceCallName)).mo197550c(R.color.text_title).mo197548b(R.color.icon_n1).mo197544a(R.drawable.ud_icon_call_outlined).mo197545a(new C52598r(this)).mo197558j();
        Intrinsics.checkExpressionValueIsNotNull(j2, "Builder().setDividerColo…   }\n            .build()");
        C58329a aVar2 = j2;
        if (z) {
            str = UIHelper.getString(R.string.Lark_View_SelfPhoneHere);
        } else {
            str = UIHelper.getString(R.string.Lark_Legacy_StartPhoneCall);
        }
        C58329a j3 = new C58329a.C58331a().mo197551d(R.color.line_divider_default).mo197546a(str).mo197550c(R.color.text_title).mo197548b(R.color.icon_n1).mo197544a(R.drawable.ud_icon_phone_outlined).mo197545a(new C52597q(this)).mo197558j();
        Intrinsics.checkExpressionValueIsNotNull(j3, "Builder().setDividerColo…   }\n            .build()");
        C58329a aVar3 = j3;
        C58329a j4 = new C58329a.C58331a().mo197551d(R.color.line_divider_default).mo197546a(UIHelper.getString(R.string.Lark_Legacy_UrgentCallEntrance)).mo197550c(R.color.function_danger_500).mo197548b(R.color.function_danger_500).mo197544a(R.drawable.ud_icon_alarm_outlined).mo197545a(new C52595o(this)).mo197558j();
        Intrinsics.checkExpressionValueIsNotNull(j4, "Builder().setDividerColo…   }\n            .build()");
        C58329a aVar4 = j4;
        if (z) {
            arrayList.add(aVar);
        }
        if (z2) {
            arrayList.add(aVar3);
        }
        if (z4) {
            arrayList.add(aVar2);
        }
        if (z3) {
            arrayList.add(aVar4);
        }
        C58339d.m226198b(this.f130106c, arrayList, true);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: a */
    public void mo179674a(String str, String str2, ContactSource contactSource) {
        Intrinsics.checkParameterIsNotNull(contactSource, ShareHitPoint.f121868c);
        this.f130107d.mo179577a(str, str2, contactSource);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: a */
    public void mo179676a(String str, String str2, String str3, String str4, ContactSource contactSource, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str4, "userName");
        Intrinsics.checkParameterIsNotNull(contactSource, ShareHitPoint.f121868c);
        this.f130107d.mo179579a(str2, str, str3, str4, contactSource, z, z2);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: a */
    public void mo179672a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "userName");
        Intrinsics.checkParameterIsNotNull(str2, "phoneNumber");
        ProfileHitPoint.m204731k();
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        d.mo133584n().mo133664a(this.f130106c, str, str2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/profile/func/user_profile/mvp/UserProfileView$getActionBtnDependency$1", "Lcom/ss/android/lark/profile/func/user_profile/action/IActionBtnDependency;", "getContext", "Landroid/content/Context;", "onAcceptBtnClick", "", "onAddContactBtnClick", "onAddNameCardBtnClick", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.d$c */
    public static final class C52583c implements IActionBtnDependency {

        /* renamed from: a */
        final /* synthetic */ UserProfileView f130114a;

        @Override // com.ss.android.lark.profile.func.user_profile.base.IBinderDependency
        /* renamed from: d */
        public Context mo179591d() {
            return this.f130114a.f130106c;
        }

        @Override // com.ss.android.lark.profile.func.user_profile.action.IActionBtnDependency
        /* renamed from: a */
        public void mo179610a() {
            UserProfileView.m203730a(this.f130114a).mo179716l();
        }

        @Override // com.ss.android.lark.profile.func.user_profile.action.IActionBtnDependency
        /* renamed from: b */
        public void mo179611b() {
            UserProfileView.m203730a(this.f130114a).mo179695a((Context) this.f130114a.f130106c);
        }

        @Override // com.ss.android.lark.profile.func.user_profile.action.IActionBtnDependency
        /* renamed from: c */
        public void mo179612c() {
            UserProfileView.m203730a(this.f130114a).mo179705c(this.f130114a.f130106c);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52583c(UserProfileView dVar) {
            this.f130114a = dVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/profile/func/user_profile/mvp/UserProfileView$getAliasItemDependency$1", "Lcom/ss/android/lark/profile/func/user_profile/infos/alias/IAliasItemDependency;", "getContext", "Landroid/content/Context;", "onAliasItemClick", "", "alias", "", "onAliasItemLongClick", "content", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.d$d */
    public static final class C52584d implements IAliasItemDependency {

        /* renamed from: a */
        final /* synthetic */ UserProfileView f130115a;

        @Override // com.ss.android.lark.profile.func.user_profile.base.IBinderDependency
        /* renamed from: d */
        public Context mo179591d() {
            return this.f130115a.f130106c;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52584d(UserProfileView dVar) {
            this.f130115a = dVar;
        }

        @Override // com.ss.android.lark.profile.func.user_profile.infos.alias.IAliasItemDependency
        /* renamed from: a */
        public void mo179756a(String str) {
            UserProfileView.m203730a(this.f130115a).mo179698a(str);
        }

        @Override // com.ss.android.lark.profile.func.user_profile.infos.alias.IAliasItemDependency
        /* renamed from: b */
        public void mo179757b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            this.f130115a.f130107d.mo179588h(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\u0012\u0010\u0015\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0016"}, d2 = {"com/ss/android/lark/profile/func/user_profile/mvp/UserProfileView$getHeaderDependency$1", "Lcom/ss/android/lark/profile/func/user_profile/header/IHeaderBinderDependency;", "getContext", "Landroid/content/Context;", "onApplyAuth", "", "msg", "", "onAvatarClick", "avatarKey", "view", "Landroid/view/View;", "onCtaChatClick", "onCtaCryptoChatClick", "onCtaLinkClick", "url", "onCtaPhoneClick", "onCtaShareUserCardClick", "onCtaVideoClick", "onGuideClick", "onMessageClickHitPoint", "onTenantCertificationClick", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.d$e */
    public static final class C52585e implements IHeaderBinderDependency {

        /* renamed from: a */
        final /* synthetic */ UserProfileView f130116a;

        @Override // com.ss.android.lark.profile.func.user_profile.base.IBinderDependency
        /* renamed from: d */
        public Context mo179591d() {
            return this.f130116a.f130106c;
        }

        @Override // com.ss.android.lark.profile.func.user_profile.header.IHeaderBinderDependency
        /* renamed from: a */
        public void mo179758a() {
            UserProfileView.m203730a(this.f130116a).mo179693a();
        }

        @Override // com.ss.android.lark.profile.func.user_profile.header.IHeaderBinderDependency
        /* renamed from: b */
        public void mo179761b() {
            UserProfileView.m203730a(this.f130116a).mo179701b();
        }

        @Override // com.ss.android.lark.profile.func.user_profile.header.IHeaderBinderDependency
        /* renamed from: c */
        public void mo179763c() {
            UserProfileView.m203730a(this.f130116a).mo179704c();
        }

        @Override // com.ss.android.lark.profile.func.user_profile.header.IHeaderBinderDependency
        /* renamed from: e */
        public void mo179764e() {
            UserProfileView.m203730a(this.f130116a).mo179707d();
        }

        @Override // com.ss.android.lark.profile.func.user_profile.header.IHeaderBinderDependency
        /* renamed from: f */
        public void mo179765f() {
            UserProfileView.m203730a(this.f130116a).mo179715k();
        }

        @Override // com.ss.android.lark.profile.func.user_profile.header.IHeaderBinderDependency
        /* renamed from: g */
        public void mo179766g() {
            UserProfileView.m203730a(this.f130116a).mo179706c("all_profile_nonfriend_chatcta");
        }

        @Override // com.ss.android.lark.profile.func.user_profile.header.IHeaderBinderDependency
        /* renamed from: h */
        public void mo179767h() {
            UserProfileView.m203730a(this.f130116a).mo179718n();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52585e(UserProfileView dVar) {
            this.f130116a = dVar;
        }

        @Override // com.ss.android.lark.profile.func.user_profile.header.IHeaderBinderDependency
        /* renamed from: a */
        public void mo179759a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            this.f130116a.f130107d.mo179587g(str);
        }

        @Override // com.ss.android.lark.profile.func.user_profile.header.IHeaderBinderDependency
        /* renamed from: b */
        public void mo179762b(String str) {
            IProfileModuleDependency.AbstractC52245b bVar = this.f130116a.f130105b;
            IProfileModuleDependency d = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
            bVar.openUrl(d.mo133562b(), str);
        }

        @Override // com.ss.android.lark.profile.func.user_profile.header.IHeaderBinderDependency
        /* renamed from: a */
        public void mo179760a(String str, View view) {
            Intrinsics.checkParameterIsNotNull(str, "avatarKey");
            Intrinsics.checkParameterIsNotNull(view, "view");
            UserProfileView.m203730a(this.f130116a).mo179696a(this.f130116a.f130106c, str, view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/profile/func/user_profile/mvp/UserProfileView$getLinkItemDependency$1", "Lcom/ss/android/lark/profile/func/user_profile/infos/link/ILinkDependency;", "getContext", "Landroid/content/Context;", "onItemClick", "", "url", "", ShareHitPoint.f121869d, "onItemLongClick", "content", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.d$f */
    public static final class C52586f implements ILinkDependency {

        /* renamed from: a */
        final /* synthetic */ UserProfileView f130117a;

        @Override // com.ss.android.lark.profile.func.user_profile.base.IBinderDependency
        /* renamed from: d */
        public Context mo179591d() {
            return this.f130117a.f130106c;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52586f(UserProfileView dVar) {
            this.f130117a = dVar;
        }

        @Override // com.ss.android.lark.profile.func.user_profile.infos.link.ILinkDependency
        /* renamed from: a */
        public void mo179768a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            this.f130117a.f130107d.mo179588h(str);
        }

        @Override // com.ss.android.lark.profile.func.user_profile.infos.link.ILinkDependency
        /* renamed from: a */
        public void mo179769a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            this.f130117a.f130107d.mo179587g(str);
            UserProfileView.m203730a(this.f130117a).mo179708d(str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/profile/func/user_profile/mvp/UserProfileView$getPhoneNumberItemDependency$1", "Lcom/ss/android/lark/profile/func/user_profile/infos/phone_number/IPhoneNumberDependency;", "getContext", "Landroid/content/Context;", "onItemClick", "", "phoneNumber", "", "isCompleted", "", "onLongClickItem", "content", "onShowClick", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.d$g */
    public static final class C52587g implements IPhoneNumberDependency {

        /* renamed from: a */
        final /* synthetic */ UserProfileView f130118a;

        @Override // com.ss.android.lark.profile.func.user_profile.infos.phone_number.IPhoneNumberDependency
        /* renamed from: a */
        public void mo179770a() {
            this.f130118a.mo179754f();
        }

        @Override // com.ss.android.lark.profile.func.user_profile.base.IBinderDependency
        /* renamed from: d */
        public Context mo179591d() {
            return this.f130118a.f130106c;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52587g(UserProfileView dVar) {
            this.f130118a = dVar;
        }

        @Override // com.ss.android.lark.profile.func.user_profile.infos.phone_number.IPhoneNumberDependency
        /* renamed from: a */
        public void mo179771a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            this.f130118a.f130107d.mo179588h(str);
        }

        @Override // com.ss.android.lark.profile.func.user_profile.infos.phone_number.IPhoneNumberDependency
        /* renamed from: a */
        public void mo179772a(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "phoneNumber");
            UserProfileView.m203730a(this.f130118a).mo179699a(str, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/profile/func/user_profile/mvp/UserProfileView$getStatusItemDependency$1", "Lcom/ss/android/lark/profile/func/user_profile/infos/status/IStatusDependency;", "getContext", "Landroid/content/Context;", "getRecogniseSpansResult", "", "description", "", "onPhoneNumberClick", "phoneNumber", "onURLClick", "url", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.d$h */
    public static final class C52588h implements IStatusDependency {

        /* renamed from: a */
        final /* synthetic */ UserProfileView f130119a;

        @Override // com.ss.android.lark.profile.func.user_profile.base.IBinderDependency
        /* renamed from: d */
        public Context mo179591d() {
            return this.f130119a.f130106c;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52588h(UserProfileView dVar) {
            this.f130119a = dVar;
        }

        @Override // com.ss.android.lark.profile.func.user_profile.infos.status.IStatusDependency
        /* renamed from: a */
        public void mo179773a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            this.f130119a.f130107d.mo179585e(str);
        }

        @Override // com.ss.android.lark.profile.func.user_profile.infos.status.IStatusDependency
        /* renamed from: c */
        public void mo179775c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "description");
            UserProfileView.m203730a(this.f130119a).mo179703b(str);
        }

        @Override // com.ss.android.lark.profile.func.user_profile.infos.status.IStatusDependency
        /* renamed from: b */
        public void mo179774b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "phoneNumber");
            IProfileModuleDependency d = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
            d.mo133584n().mo133665a((Context) this.f130119a.f130106c, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/profile/func/user_profile/mvp/UserProfileView$getTextItemDependency$1", "Lcom/ss/android/lark/profile/func/user_profile/infos/text/ITextDependency;", "getContext", "Landroid/content/Context;", "onTextItemLongClick", "", "content", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.d$i */
    public static final class C52589i implements ITextDependency {

        /* renamed from: a */
        final /* synthetic */ UserProfileView f130120a;

        @Override // com.ss.android.lark.profile.func.user_profile.base.IBinderDependency
        /* renamed from: d */
        public Context mo179591d() {
            return this.f130120a.f130106c;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52589i(UserProfileView dVar) {
            this.f130120a = dVar;
        }

        @Override // com.ss.android.lark.profile.func.user_profile.infos.text.ITextDependency
        /* renamed from: a */
        public void mo179776a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            this.f130120a.f130107d.mo179588h(str);
        }
    }

    /* renamed from: m */
    private final IHeaderBinderDependency m203736m() {
        return new C52585e(this);
    }

    /* renamed from: n */
    private final ITextDependency m203737n() {
        return new C52589i(this);
    }

    /* renamed from: o */
    private final IAliasItemDependency m203738o() {
        return new C52584d(this);
    }

    /* renamed from: p */
    private final ILinkDependency m203739p() {
        return new C52586f(this);
    }

    /* renamed from: q */
    private final IStatusDependency m203740q() {
        return new C52588h(this);
    }

    /* renamed from: r */
    private final IPhoneNumberDependency m203741r() {
        return new C52587g(this);
    }

    /* renamed from: s */
    private final IActionBtnDependency m203742s() {
        return new C52583c(this);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: a */
    public void mo179661a() {
        this.f130107d.mo179569a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.d$o */
    static final class C52595o implements C58339d.AbstractC58343b {

        /* renamed from: a */
        final /* synthetic */ UserProfileView f130127a;

        C52595o(UserProfileView dVar) {
            this.f130127a = dVar;
        }

        @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
        public final void onMenuItemClick() {
            UserProfileView.m203730a(this.f130127a).mo179712h();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.d$p */
    static final class C52596p implements C58339d.AbstractC58343b {

        /* renamed from: a */
        final /* synthetic */ UserProfileView f130128a;

        C52596p(UserProfileView dVar) {
            this.f130128a = dVar;
        }

        @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
        public final void onMenuItemClick() {
            ProfileHitPoint.m204710b();
            UserProfileView.m203730a(this.f130128a).mo179710f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.d$q */
    static final class C52597q implements C58339d.AbstractC58343b {

        /* renamed from: a */
        final /* synthetic */ UserProfileView f130129a;

        C52597q(UserProfileView dVar) {
            this.f130129a = dVar;
        }

        @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
        public final void onMenuItemClick() {
            ProfileHitPoint.m204714c();
            UserProfileView.m203730a(this.f130129a).mo179711g();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.d$r */
    static final class C52598r implements C58339d.AbstractC58343b {

        /* renamed from: a */
        final /* synthetic */ UserProfileView f130130a;

        C52598r(UserProfileView dVar) {
            this.f130130a = dVar;
        }

        @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
        public final void onMenuItemClick() {
            ProfileHitPoint.m204695a();
            UserProfileView.m203730a(this.f130130a).mo179709e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.d$u */
    static final class C52601u implements C58339d.AbstractC58343b {

        /* renamed from: a */
        final /* synthetic */ UserProfileView f130133a;

        C52601u(UserProfileView dVar) {
            this.f130133a = dVar;
        }

        @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
        public final void onMenuItemClick() {
            UserProfileView.m203730a(this.f130133a).mo179713i();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.d$v */
    static final class C52602v implements C58339d.AbstractC58343b {

        /* renamed from: a */
        final /* synthetic */ UserProfileView f130134a;

        C52602v(UserProfileView dVar) {
            this.f130134a = dVar;
        }

        @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
        public final void onMenuItemClick() {
            UserProfileView.m203730a(this.f130134a).mo179714j();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.d$w */
    static final class C52603w implements C58339d.AbstractC58343b {

        /* renamed from: a */
        final /* synthetic */ UserProfileView f130135a;

        C52603w(UserProfileView dVar) {
            this.f130135a = dVar;
        }

        @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
        public final void onMenuItemClick() {
            UserProfileView.m203730a(this.f130135a).mo179715k();
        }
    }

    /* renamed from: k */
    private final void m203734k() {
        this.f130109g = new ActionBtnBinder(m203742s());
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: c */
    public void mo179683c() {
        LKUIToast.show(this.f130106c, (int) R.string.Lark_NewContacts_AcceptedContactRequestToast);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        if (DesktopUtil.m144301a((Context) this.f130106c)) {
            this.f130113k.setBackgroundResource(R.color.bg_body);
        }
        m203731h();
        m203732i();
        m203733j();
        m203734k();
    }

    /* renamed from: f */
    public final void mo179754f() {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f130106c).message(R.string.Lark_Profile_PhoneV7)).addActionButton(R.id.lkui_dialog_btn_left, R.string.Lark_Profile_PhoneV8, (DialogInterface.OnClickListener) null)).addActionButton(R.id.lkui_dialog_btn_right, R.string.Lark_Profile_PhoneV9, new DialogInterface$OnClickListenerC52599s(this))).show();
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: d */
    public void mo179685d() {
        CommonRecyclerView commonRecyclerView = (CommonRecyclerView) this.f130113k.findViewById(R.id.mInfoRv);
        Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView, "mRootView.mInfoRv");
        commonRecyclerView.setVisibility(8);
        TextView textView = (TextView) this.f130113k.findViewById(R.id.mFriendRequestBtn);
        Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.mFriendRequestBtn");
        textView.setVisibility(8);
        RelativeLayout relativeLayout = (RelativeLayout) this.f130113k.findViewById(R.id.mPlaceholder);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "mRootView.mPlaceholder");
        relativeLayout.setVisibility(0);
        RelativeLayout relativeLayout2 = (RelativeLayout) this.f130113k.findViewById(R.id.mPlaceholder);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "mRootView.mPlaceholder");
        ((UDEmptyState) relativeLayout2.findViewById(R.id.mEmptyStateView)).setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_negative_load_failed));
        RelativeLayout relativeLayout3 = (RelativeLayout) this.f130113k.findViewById(R.id.mPlaceholder);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout3, "mRootView.mPlaceholder");
        ((UDEmptyState) relativeLayout3.findViewById(R.id.mEmptyStateView)).setDesc(UIHelper.getString(R.string.Lark_Profile_FailedToLoadTryAgainLater));
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: e */
    public void mo179687e() {
        CommonRecyclerView commonRecyclerView = (CommonRecyclerView) this.f130113k.findViewById(R.id.mInfoRv);
        Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView, "mRootView.mInfoRv");
        commonRecyclerView.setVisibility(8);
        TextView textView = (TextView) this.f130113k.findViewById(R.id.mFriendRequestBtn);
        Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.mFriendRequestBtn");
        textView.setVisibility(8);
        RelativeLayout relativeLayout = (RelativeLayout) this.f130113k.findViewById(R.id.mPlaceholder);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "mRootView.mPlaceholder");
        relativeLayout.setVisibility(0);
        RelativeLayout relativeLayout2 = (RelativeLayout) this.f130113k.findViewById(R.id.mPlaceholder);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "mRootView.mPlaceholder");
        ((UDEmptyState) relativeLayout2.findViewById(R.id.mEmptyStateView)).setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_positive_no_data));
        RelativeLayout relativeLayout3 = (RelativeLayout) this.f130113k.findViewById(R.id.mPlaceholder);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout3, "mRootView.mPlaceholder");
        ((UDEmptyState) relativeLayout3.findViewById(R.id.mEmptyStateView)).setDesc(UIHelper.getString(R.string.Lark_NewContacts_ProfileNoInfo));
    }

    /* renamed from: g */
    public final void mo179755g() {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f130106c).title(R.string.Lark_Contacts_DeleteContactCardConfirmation)).titleBold(true)).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90706b(R.string.Lark_Contacts_Delete).mo90710d(R.color.function_danger_500).mo90703a(new DialogInterface$OnClickListenerC52593m(this)))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Contacts_Cancel, (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: h */
    private final void m203731h() {
        ((CommonTitleBar) this.f130113k.findViewById(R.id.mTitleBar)).setLeftImageDrawable(UIUtils.getDrawable(this.f130106c, 2131231034));
        ((CommonTitleBar) this.f130113k.findViewById(R.id.mTitleBar)).setLeftClickListener(new View$OnClickListenerC52590j(this));
        ((CommonTitleBar) this.f130113k.findViewById(R.id.mTitleBar)).setBackgroundColor(UIUtils.getColor(this.f130106c, R.color.lkui_transparent));
        ((CommonTitleBar) this.f130113k.findViewById(R.id.mTitleBar)).setDividerVisible(false);
        ((CommonTitleBar) this.f130113k.findViewById(R.id.mTitleBar)).setRightImage(UIUtils.getDrawable(this.f130106c, R.drawable.ic_svg_more));
        if (!DesktopUtil.m144301a((Context) this.f130106c)) {
            StatusBarUtil.setTransparentForImageView(this.f130106c, (CommonTitleBar) this.f130113k.findViewById(R.id.mTitleBar));
        }
        View rightView = ((CommonTitleBar) this.f130113k.findViewById(R.id.mTitleBar)).getRightView(0);
        if (rightView != null) {
            ImageView imageView = (ImageView) rightView;
            this.f130112j = imageView;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleRightIV");
            }
            imageView.setOnClickListener(new View$OnClickListenerC52591k(this));
            View view = this.f130112j;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleRightIV");
            }
            view.setVisibility(8);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
    }

    /* renamed from: i */
    private final void m203732i() {
        if (DesktopUtil.m144301a((Context) this.f130106c)) {
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.f130113k.findViewById(R.id.mToolBarLayout);
            Intrinsics.checkExpressionValueIsNotNull(collapsingToolbarLayout, "mRootView.mToolBarLayout");
            collapsingToolbarLayout.setVisibility(8);
            FrameLayout frameLayout = (FrameLayout) this.f130113k.findViewById(R.id.mDestopProfileHeaderContainer);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mRootView.mDestopProfileHeaderContainer");
            frameLayout.setVisibility(0);
            FrameLayout frameLayout2 = (FrameLayout) this.f130113k.findViewById(R.id.mDestopProfileHeaderContainer);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "mRootView.mDestopProfileHeaderContainer");
            this.f130110h = frameLayout2;
        } else {
            CollapsingToolbarLayout collapsingToolbarLayout2 = (CollapsingToolbarLayout) this.f130113k.findViewById(R.id.mToolBarLayout);
            Intrinsics.checkExpressionValueIsNotNull(collapsingToolbarLayout2, "mRootView.mToolBarLayout");
            collapsingToolbarLayout2.setVisibility(0);
            FrameLayout frameLayout3 = (FrameLayout) this.f130113k.findViewById(R.id.mDestopProfileHeaderContainer);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout3, "mRootView.mDestopProfileHeaderContainer");
            frameLayout3.setVisibility(8);
            CollapsingToolbarLayout collapsingToolbarLayout3 = (CollapsingToolbarLayout) this.f130113k.findViewById(R.id.mToolBarLayout);
            Intrinsics.checkExpressionValueIsNotNull(collapsingToolbarLayout3, "mRootView.mToolBarLayout");
            this.f130110h = collapsingToolbarLayout3;
        }
        HeaderBinder aVar = new HeaderBinder(m203736m());
        this.f130108f = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderBinder");
        }
        ViewGroup viewGroup = this.f130110h;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderRootView");
        }
        aVar.mo179809a(viewGroup);
    }

    /* renamed from: j */
    private final void m203733j() {
        CommonRecyclerView commonRecyclerView = (CommonRecyclerView) this.f130113k.findViewById(R.id.mInfoRv);
        Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView, "mRootView.mInfoRv");
        commonRecyclerView.setLayoutManager(new LinearLayoutManager(this.f130106c, 1, false));
        this.f130111i = new InfoAdapter(this.f130106c, m203735l());
        CommonRecyclerView commonRecyclerView2 = (CommonRecyclerView) this.f130113k.findViewById(R.id.mInfoRv);
        Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView2, "mRootView.mInfoRv");
        InfoAdapter dVar = this.f130111i;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfoAdapter");
        }
        commonRecyclerView2.setAdapter(dVar);
        ((CommonRecyclerView) this.f130113k.findViewById(R.id.mInfoRv)).mo200036a(MapsKt.mapOf(TuplesKt.to("biz", Integer.valueOf(Biz.Messenger.getValue())), TuplesKt.to("scene", Integer.valueOf(Scene.Profile.getValue()))));
        if (DesktopUtil.m144301a((Context) this.f130106c)) {
            int dp2px = UIHelper.dp2px(10.0f);
            ((CommonRecyclerView) this.f130113k.findViewById(R.id.mInfoRv)).setPadding(0, dp2px, 0, dp2px);
        }
    }

    /* renamed from: l */
    private final BinderPool m203735l() {
        BinderPool cVar = new BinderPool();
        String name = TextItemViewData.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "TextItemViewData::class.java.name");
        cVar.mo179869a(name, new TextItemBinder(m203737n()));
        String name2 = AliasItemViewData.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name2, "AliasItemViewData::class.java.name");
        cVar.mo179869a(name2, new AliasItemBinder(m203738o()));
        String name3 = LinkItemViewData.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name3, "LinkItemViewData::class.java.name");
        cVar.mo179869a(name3, new LinkItemBinder(m203739p()));
        String name4 = StatusItemViewData.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name4, "StatusItemViewData::class.java.name");
        cVar.mo179869a(name4, new StatusItemBinder(m203740q()));
        String name5 = PhoneNumberItemViewData.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name5, "PhoneNumberItemViewData::class.java.name");
        cVar.mo179869a(name5, new PhoneNumberItemBinder(m203741r()));
        String name6 = DepartmentItemListDataSource.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name6, "DepartmentItemListDataSource::class.java.name");
        cVar.mo179869a(name6, new InfoListItemBinder(new DepartmentNameItemBinder(m203737n())));
        String name7 = TextItemListDataSource.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name7, "TextItemListDataSource::class.java.name");
        cVar.mo179869a(name7, new InfoListItemBinder(new TextListItemBinder(m203737n())));
        String name8 = LinkItemListDataSource.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name8, "LinkItemListDataSource::class.java.name");
        cVar.mo179869a(name8, new InfoListItemBinder(new LinkListItemBinder(m203739p())));
        return cVar;
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: b */
    public void mo179679b() {
        UDActionPanelBuilder aVar = new UDActionPanelBuilder(this.f130106c);
        String string = UIUtils.getString(this.f130106c, R.string.Lark_Contacts_Edit);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(mActiv…tring.Lark_Contacts_Edit)");
        String string2 = UIUtils.getString(this.f130106c, R.string.Lark_Contacts_Delete);
        Intrinsics.checkExpressionValueIsNotNull(string2, "UIUtils.getString(mActiv…ing.Lark_Contacts_Delete)");
        UDBaseListDialogBuilder.ListItem[] aVarArr = {new UDBaseListDialogBuilder.ListItemBuilder(string).mo90889c(), new UDBaseListDialogBuilder.ListItemBuilder(string2).mo90888b(R.color.function_danger_500).mo90889c()};
        String string3 = UIUtils.getString(this.f130106c, R.string.Lark_Legacy_Cancel);
        Intrinsics.checkExpressionValueIsNotNull(string3, "UIUtils.getString(mActiv…tring.Lark_Legacy_Cancel)");
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) aVar.mo90873b(CollectionsKt.listOf((Object[]) aVarArr))).mo90869a(new C52594n(this))).addActionButton(R.id.ud_dialog_btn_cancel, string3, (DialogInterface.OnClickListener) null)).show();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.d$j */
    public static final class View$OnClickListenerC52590j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserProfileView f130121a;

        View$OnClickListenerC52590j(UserProfileView dVar) {
            this.f130121a = dVar;
        }

        public final void onClick(View view) {
            this.f130121a.f130107d.mo179569a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/profile/func/user_profile/mvp/UserProfileView$showNameCardEditorMenu$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.d$n */
    public static final class C52594n implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ UserProfileView f130126a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52594n(UserProfileView dVar) {
            this.f130126a = dVar;
        }

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            if (i == 0) {
                UserProfileView.m203730a(this.f130126a).mo179702b(this.f130126a.f130106c);
            } else if (i == 1) {
                this.f130126a.mo179755g();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onError"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.d$x */
    static final class C52604x implements IProfileModuleDependency.IVCLaunchCallback {

        /* renamed from: a */
        final /* synthetic */ UserProfileView f130136a;

        C52604x(UserProfileView dVar) {
            this.f130136a = dVar;
        }

        @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.IVCLaunchCallback
        /* renamed from: a */
        public final void mo178828a(int i) {
            this.f130136a.mo179753b(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onError"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.d$y */
    static final class C52605y implements IProfileModuleDependency.IVCLaunchCallback {

        /* renamed from: a */
        final /* synthetic */ UserProfileView f130137a;

        C52605y(UserProfileView dVar) {
            this.f130137a = dVar;
        }

        @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.IVCLaunchCallback
        /* renamed from: a */
        public final void mo178828a(int i) {
            this.f130137a.mo179753b(i);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IUserProfileContract.IView.IDelegate m203730a(UserProfileView dVar) {
        IUserProfileContract.IView.IDelegate aVar = dVar.f130104a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        return aVar;
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: b */
    public void mo179680b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        LKUIToast.show(this.f130106c, str);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: d */
    public void mo179686d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        this.f130107d.mo179580b(str);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: e */
    public void mo179688e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        this.f130107d.mo179583c(str);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: f */
    public void mo179689f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        this.f130107d.mo179584d(str);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: h */
    public void mo179691h(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        this.f130107d.mo179585e(str);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: i */
    public void mo179692i(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        this.f130107d.mo179586f(str);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.d$k */
    public static final class View$OnClickListenerC52591k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserProfileView f130122a;

        View$OnClickListenerC52591k(UserProfileView dVar) {
            this.f130122a = dVar;
        }

        public final void onClick(View view) {
            ProfileHitPoint.m204737q();
            IUserProfileContract.IView.IDelegate a = UserProfileView.m203730a(this.f130122a);
            Intrinsics.checkExpressionValueIsNotNull(view, "v");
            a.mo179697a(view);
        }
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: a */
    public void mo179662a(int i) {
        String string = UIUtils.getString(this.f130106c, i);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(mActivity, msgId)");
        mo179680b(string);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: c */
    public void mo179684c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        this.f130107d.mo179575a(str, new C52605y(this));
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: g */
    public void mo179690g(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        this.f130107d.mo179581b(str, new C52604x(this));
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: a */
    public void mo179664a(ProfileContent profileContent) {
        Intrinsics.checkParameterIsNotNull(profileContent, "content");
        this.f130107d.mo179570a(profileContent);
    }

    /* renamed from: b */
    public final void mo179753b(int i) {
        if (i == 2) {
            IUserProfileContract.IView.IDelegate aVar = this.f130104a;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
            }
            aVar.mo179717m();
        } else if (i == 1) {
            LKUIToast.show((Context) this.f130106c, (int) R.drawable.ic_toast_deny, (int) R.string.Lark_NewContacts_BlockedOthersUnableToXToastGeneral);
        } else if (i == 3) {
            LKUIToast.show((Context) this.f130106c, (int) R.drawable.ic_toast_deny, (int) R.string.Lark_NewContacts_BlockedUnableToXToastGeneral);
        }
        Log.m165383e("UserProfileView", String.valueOf(i));
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: a */
    public void mo179666a(ProfileSettingInitData profileSettingInitData) {
        Intrinsics.checkParameterIsNotNull(profileSettingInitData, "profileSettingInitData");
        this.f130107d.mo179572a(profileSettingInitData);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: a */
    public void mo179667a(ActionBtnViewData actionBtnViewData) {
        Intrinsics.checkParameterIsNotNull(actionBtnViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        ActionBtnBinder aVar = this.f130109g;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActionBtnBinder");
        }
        aVar.mo179592a(this.f130113k, actionBtnViewData);
    }

    /* renamed from: a */
    public void setViewDelegate(IUserProfileContract.IView.IDelegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewDelegate");
        this.f130104a = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.d$l */
    static final class DialogInterface$OnClickListenerC52592l implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserProfileView f130123a;

        /* renamed from: b */
        final /* synthetic */ boolean f130124b;

        DialogInterface$OnClickListenerC52592l(UserProfileView dVar, boolean z) {
            this.f130123a = dVar;
            this.f130124b = z;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            UserProfileView dVar = this.f130123a;
            ProfileHitPoint.m204719d(this.f130124b);
            UserProfileView.m203730a(dVar).mo179700a(true);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.d$m */
    public static final class DialogInterface$OnClickListenerC52593m implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserProfileView f130125a;

        DialogInterface$OnClickListenerC52593m(UserProfileView dVar) {
            this.f130125a = dVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            IUserProfileContract.IView.IDelegate a = UserProfileView.m203730a(this.f130125a);
            if (a != null) {
                a.mo179719o();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.d$s */
    public static final class DialogInterface$OnClickListenerC52599s implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserProfileView f130131a;

        DialogInterface$OnClickListenerC52599s(UserProfileView dVar) {
            this.f130131a = dVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            UserProfileView.m203730a(this.f130131a).mo179694a(this.f130131a.f130106c);
        }
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: b */
    public void mo179681b(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "avatarKey");
        Intrinsics.checkParameterIsNotNull(str2, "userId");
        HeaderBinder aVar = this.f130108f;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderBinder");
        }
        aVar.mo179811a(str, str2);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: a */
    public void mo179665a(Contact contact, ContactSource contactSource) {
        Intrinsics.checkParameterIsNotNull(contact, "contact");
        Intrinsics.checkParameterIsNotNull(contactSource, "contactSource");
        this.f130107d.mo179571a(contact, contactSource);
    }

    public UserProfileView(View view, Activity activity, ViewDependency bVar) {
        Intrinsics.checkParameterIsNotNull(view, "mRootView");
        Intrinsics.checkParameterIsNotNull(activity, "mActivity");
        Intrinsics.checkParameterIsNotNull(bVar, "mViewDependency");
        this.f130113k = view;
        this.f130106c = activity;
        this.f130107d = bVar;
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        IProfileModuleDependency.AbstractC52245b t = d.mo133590t();
        Intrinsics.checkExpressionValueIsNotNull(t, "ProfileModule.getDependency().browserDependency");
        this.f130105b = t;
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: b */
    public void mo179682b(String str, String str2, View view) {
        Intrinsics.checkParameterIsNotNull(str, "avatarKey");
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f130107d.mo179582b(str, str2, view);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView
    /* renamed from: a */
    public void mo179663a(View view, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkParameterIsNotNull(view, "anchorView");
        ArrayList arrayList = new ArrayList();
        C58329a j = new C58329a.C58331a().mo197551d(R.color.lkui_N300).mo197546a(UIUtils.getString(this.f130106c, R.string.Lark_Legacy_ShareUserCard)).mo197550c(R.color.lkui_N900).mo197545a(new C52603w(this)).mo197558j();
        Intrinsics.checkExpressionValueIsNotNull(j, "Builder().setDividerColo…() }\n            .build()");
        C58329a aVar = j;
        C58329a j2 = new C58329a.C58331a().mo197551d(R.color.lkui_N300).mo197546a(UIUtils.getString(this.f130106c, R.string.Lark_Legacy_ApplicationPhoneCallTimeSetEnter)).mo197550c(R.color.lkui_N900).mo197545a(new C52601u(this)).mo197558j();
        Intrinsics.checkExpressionValueIsNotNull(j2, "Builder().setDividerColo…() }\n            .build()");
        C58329a aVar2 = j2;
        C58329a j3 = new C58329a.C58331a().mo197551d(R.color.lkui_N300).mo197546a(UIUtils.getString(this.f130106c, R.string.Lark_Chat_Report)).mo197550c(R.color.lkui_N900).mo197545a(new C52602v(this)).mo197558j();
        Intrinsics.checkExpressionValueIsNotNull(j3, "Builder().setDividerColo…() }\n            .build()");
        C58329a aVar3 = j3;
        C58329a j4 = new C58329a.C58331a().mo197551d(R.color.lkui_N300).mo197546a(UIUtils.getString(this.f130106c, R.string.Lark_Legacy_Cancel)).mo197550c(R.color.lkui_N900).mo197545a(C52600t.f130132a).mo197558j();
        j4.mo197568a(R.color.lkui_N900).mo197573c(R.color.lkui_N300);
        if (z3) {
            arrayList.add(aVar);
        }
        if (z) {
            arrayList.add(aVar2);
        }
        if (z2) {
            arrayList.add(aVar3);
        }
        Intrinsics.checkExpressionValueIsNotNull(j4, "cancelItem");
        arrayList.add(j4);
        if (arrayList.size() >= 2) {
            if (!DesktopUtil.m144301a((Context) this.f130106c)) {
                C58339d.m226198b(this.f130106c, arrayList, false);
            } else if (arrayList.size() > 1) {
                C58333b.m226183a(this.f130106c, view, arrayList.subList(0, arrayList.size() - 1));
            }
        }
    }
}
