package com.ss.android.lark.mine.impl.index.v2.title;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.StatusEffectiveInterval;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.framework.utils.ak;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.entity.chatter.WorkStatus;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.dto.C45427e;
import com.ss.android.lark.mine.dto.TenantCertificationInfo;
import com.ss.android.lark.mine.impl.custom_status.C45616s;
import com.ss.android.lark.mine.impl.custom_status.CustomStatusUIUtils;
import com.ss.android.lark.mine.impl.custom_status.statistics.UserCustomStatusHitPoint;
import com.ss.android.lark.mine.impl.index.v2.container.HostViewModel;
import com.ss.android.lark.mine.impl.statistics.MineHitPoint;
import com.ss.android.lark.mine.impl.statistics.setting.EditProfileHitPoint;
import com.ss.android.lark.mine.impl.statistics.setting.WorkStatusHitPoint;
import com.ss.android.lark.mine.impl.statistics.zen.ZenHitPoint;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.lark.ui.C57605g;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.UserStatusHelper;
import com.ss.android.lark.widget.drawable.TenantCertificationDrawable;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.p2931b.C58324b;
import com.ss.android.lark.widget.status.UserStatusLinearLayout;
import com.ss.android.lark.widget.status.UserStatusTextView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00012\u00020\u00012\u00020\u0002:\u0004\u0001\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010}\u001a\u00020OH\u0002J\u001d\u0010~\u001a\u000202\b\u0010\u0001\u001a\u00030\u00012\t\u0010\u0001\u001a\u0004\u0018\u00010JH\u0002J\t\u0010\u0001\u001a\u00020H\u0002J\t\u0010\u0001\u001a\u00020H\u0016J\t\u0010\u0001\u001a\u00020H\u0002J\t\u0010\u0001\u001a\u00020H\u0002J\t\u0010\u0001\u001a\u00020H\u0016J\t\u0010\u0001\u001a\u00020\u000fH\u0002J\u0014\u0010\u0001\u001a\u000202\t\u0010\u0001\u001a\u0004\u0018\u00010JH\u0002J\t\u0010\u0001\u001a\u00020H\u0016J\t\u0010\u0001\u001a\u00020H\u0002J0\u0010\u0001\u001a\u000202\b\u0010\u0001\u001a\u00030\u00012\t\u0010\u0001\u001a\u0004\u0018\u00010_2\u0007\u0010\u0001\u001a\u00020\t2\u0007\u0010\u0001\u001a\u00020\tH\u0002J\u0013\u0010\u0001\u001a\u000202\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010\u0001\u001a\u000202\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u001a\u0010\u0001\u001a\u000202\u000f\u0010\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u0001H\u0002J\u0012\u0010\u0001\u001a\u000202\u0007\u0010\u0001\u001a\u00020\u000fH\u0002R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001f\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020!8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010\u0015R#\u0010,\u001a\n .*\u0004\u0018\u00010-0-8BX\u0002¢\u0006\f\n\u0004\b1\u0010\u001b\u001a\u0004\b/\u00100R#\u00102\u001a\n .*\u0004\u0018\u000103038BX\u0002¢\u0006\f\n\u0004\b6\u0010\u001b\u001a\u0004\b4\u00105R\u001e\u00107\u001a\u0002088\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010=\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0013\"\u0004\b?\u0010\u0015R\u001e\u0010@\u001a\u00020A8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001e\u0010F\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0013\"\u0004\bH\u0010\u0015R\u0010\u0010I\u001a\u0004\u0018\u00010JX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010K\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0013\"\u0004\bM\u0010\u0015R\u001b\u0010N\u001a\u00020O8BX\u0002¢\u0006\f\n\u0004\bR\u0010\u001b\u001a\u0004\bP\u0010QR\u000e\u0010S\u001a\u00020TX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010U\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u0013\"\u0004\bW\u0010\u0015R\u001e\u0010X\u001a\u00020Y8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001e\u0010^\u001a\u00020_8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010d\u001a\u00020e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u001e\u0010j\u001a\u00020Y8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010[\"\u0004\bl\u0010]R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bm\u0010nR\u001e\u0010o\u001a\u00020_8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010a\"\u0004\bq\u0010cR\u001e\u0010r\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u0013\"\u0004\bt\u0010\u0015R\u001e\u0010u\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u0013\"\u0004\bw\u0010\u0015R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010x\u001a\u00020y8BX\u0002¢\u0006\f\n\u0004\b|\u0010\u001b\u001a\u0004\bz\u0010{¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/title/TitleView;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "Lcom/ss/android/lark/mine/impl/index/v2/title/IMineTitle;", "mContext", "Landroid/app/Activity;", "rootView", "Landroid/view/View;", "map", "", "", "Landroidx/lifecycle/ViewModel;", "viewDependency", "Lcom/ss/android/lark/mine/impl/index/v2/title/TitleView$IViewDependency;", "(Landroid/app/Activity;Landroid/view/View;Ljava/util/Map;Lcom/ss/android/lark/mine/impl/index/v2/title/TitleView$IViewDependency;)V", "canShowTip", "", "emptyStatus", "Landroid/widget/TextView;", "getEmptyStatus", "()Landroid/widget/TextView;", "setEmptyStatus", "(Landroid/widget/TextView;)V", "hostVM", "Lcom/ss/android/lark/mine/impl/index/v2/container/HostViewModel;", "getHostVM", "()Lcom/ss/android/lark/mine/impl/index/v2/container/HostViewModel;", "hostVM$delegate", "Lkotlin/Lazy;", "isPersonalStatusEnable", "()Z", "isPersonalStatusEnable$delegate", "isTipAnchorViewVisible", "mAvatarIV", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "getMAvatarIV", "()Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "setMAvatarIV", "(Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;)V", "mAvatarSize", "getMContext", "()Landroid/app/Activity;", "mDepartmentTV", "getMDepartmentTV", "setMDepartmentTV", "mFeatureGatingDependency", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IFeatureGatingDependency;", "kotlin.jvm.PlatformType", "getMFeatureGatingDependency", "()Lcom/ss/android/lark/mine/dependency/IMineDependency$IFeatureGatingDependency;", "mFeatureGatingDependency$delegate", "mGuideDependency", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IGuideDependency;", "getMGuideDependency", "()Lcom/ss/android/lark/mine/dependency/IMineDependency$IGuideDependency;", "mGuideDependency$delegate", "mNameContainer", "Landroid/view/ViewGroup;", "getMNameContainer", "()Landroid/view/ViewGroup;", "setMNameContainer", "(Landroid/view/ViewGroup;)V", "mNameTV", "getMNameTV", "setMNameTV", "mStatus", "Lcom/ss/android/lark/widget/status/UserStatusLinearLayout;", "getMStatus", "()Lcom/ss/android/lark/widget/status/UserStatusLinearLayout;", "setMStatus", "(Lcom/ss/android/lark/widget/status/UserStatusLinearLayout;)V", "mTenantCertification", "getMTenantCertification", "setMTenantCertification", "mTenantCertificationInfo", "Lcom/ss/android/lark/mine/dto/TenantCertificationInfo;", "mTenantDesc", "getMTenantDesc", "setMTenantDesc", "mTipWindow", "Lcom/ss/android/lark/ui/LarkUIPopupWindow;", "getMTipWindow", "()Lcom/ss/android/lark/ui/LarkUIPopupWindow;", "mTipWindow$delegate", "mType", "Lcom/ss/android/lark/chat/entity/chatter/ChatterDescription$Type;", "mWorkStatusTV", "getMWorkStatusTV", "setMWorkStatusTV", "mZenSetting", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getMZenSetting", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setMZenSetting", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "mZenSettingIcon", "Landroid/widget/ImageView;", "getMZenSettingIcon", "()Landroid/widget/ImageView;", "setMZenSettingIcon", "(Landroid/widget/ImageView;)V", "personalStatusGroup", "Landroidx/constraintlayout/widget/Group;", "getPersonalStatusGroup", "()Landroidx/constraintlayout/widget/Group;", "setPersonalStatusGroup", "(Landroidx/constraintlayout/widget/Group;)V", "personalStatusLayout", "getPersonalStatusLayout", "setPersonalStatusLayout", "getRootView", "()Landroid/view/View;", "statusAvatar", "getStatusAvatar", "setStatusAvatar", "statusEndTime", "getStatusEndTime", "setStatusEndTime", "statusTitle", "getStatusTitle", "setStatusTitle", "viewModel", "Lcom/ss/android/lark/mine/impl/index/v2/title/TitleViewModel;", "getViewModel", "()Lcom/ss/android/lark/mine/impl/index/v2/title/TitleViewModel;", "viewModel$delegate", "createPopupWindow", "createTenantNameSpan", "", "tenantName", "", "tenantCertificationInfo", "hideTenantCertificationInfo", "hideTips", "initAndShowHintTipView", "initView", "onCreate", "shouldShowWorkStatusHint", "showTenantCertificationInfo", "showTips", "showWorkStatusHintIfNeed", "updateMineAvatar", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "imageView", "width", "height", "updateMineName", "updateMineProfile", "mineProfile", "Lcom/ss/android/lark/mine/dto/MineProfile;", "updateTenantInfo", "tenantInfos", "", "Lcom/ss/android/lark/passport/signinsdk_api/account/TenantInfo;", "updateZenSettingView", "isInZenMode", "Companion", "IViewDependency", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TitleView extends Widget {

    /* renamed from: e */
    public static final Companion f115476e = new Companion(null);

    /* renamed from: q */
    private static final String f115477q = f115477q;

    /* renamed from: t */
    private static final int f115478t = (-UIHelper.dp2px(5.0f));

    /* renamed from: u */
    private static final int f115479u = UIHelper.dp2px(7.5f);

    /* renamed from: a */
    public final int f115480a;

    /* renamed from: b */
    public ChatterDescription.Type f115481b = ChatterDescription.Type.DEFAULT;

    /* renamed from: c */
    public final Map<Integer, AbstractC1142af> f115482c;

    /* renamed from: d */
    public final IViewDependency f115483d;
    @BindView(7888)
    public TextView emptyStatus;

    /* renamed from: f */
    private final Lazy f115484f = LazyKt.lazy(new C45740c(this));

    /* renamed from: g */
    private final Lazy f115485g = LazyKt.lazy(new C45762x(this));

    /* renamed from: h */
    private boolean f115486h;

    /* renamed from: i */
    private boolean f115487i;

    /* renamed from: j */
    private final Lazy f115488j = LazyKt.lazy(C45760v.INSTANCE);

    /* renamed from: k */
    private final Lazy f115489k = LazyKt.lazy(C45759u.INSTANCE);

    /* renamed from: l */
    private final Lazy f115490l = LazyKt.lazy(new C45761w(this));

    /* renamed from: m */
    private TenantCertificationInfo f115491m;
    @BindView(6681)
    public LKUIRoundedImageView2 mAvatarIV;
    @BindView(6880)
    public TextView mDepartmentTV;
    @BindView(7440)
    public ViewGroup mNameContainer;
    @BindView(7439)
    public TextView mNameTV;
    @BindView(7818)
    public UserStatusLinearLayout mStatus;
    @BindView(7868)
    public TextView mTenantCertification;
    @BindView(7869)
    public TextView mTenantDesc;
    @BindView(8182)
    public TextView mWorkStatusTV;
    @BindView(6928)
    public ConstraintLayout mZenSetting;
    @BindView(6929)
    public ImageView mZenSettingIcon;

    /* renamed from: n */
    private final Lazy f115492n = LazyKt.lazy(C45758t.INSTANCE);

    /* renamed from: o */
    private final Activity f115493o;

    /* renamed from: p */
    private final View f115494p;
    @BindView(7055)
    public Group personalStatusGroup;
    @BindView(7235)
    public ConstraintLayout personalStatusLayout;
    @BindView(7819)
    public ImageView statusAvatar;
    @BindView(7917)
    public TextView statusEndTime;
    @BindView(7948)
    public TextView statusTitle;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH&J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0006H&J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\nH&J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/title/TitleView$IViewDependency;", "", "isFragmentAdd", "", "()Z", "gotoPreviewAvatar", "", "context", "Landroid/content/Context;", "avatarKey", "", "entityId", "avatarView", "Landroid/widget/ImageView;", "gotoStatusSet", "chatterDescription", "Lcom/ss/android/lark/chat/entity/chatter/ChatterDescription;", "onClickDeleteWorkStatus", "openMineInfoPage", "openTenantCertificationUrl", "url", "openUserCustomStatusHomePage", "openZenSettingActivity", "mContext", "Landroid/app/Activity;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleView$b */
    public interface IViewDependency {
        /* renamed from: a */
        void mo160880a();

        /* renamed from: a */
        void mo160881a(Activity activity);

        /* renamed from: a */
        void mo160882a(Context context);

        /* renamed from: a */
        void mo160883a(Context context, ChatterDescription chatterDescription);

        /* renamed from: b */
        void mo160884b(Context context);

        /* renamed from: b */
        boolean mo160885b();
    }

    /* renamed from: t */
    private final HostViewModel m181288t() {
        return (HostViewModel) this.f115484f.getValue();
    }

    /* renamed from: v */
    private final TitleViewModel m181289v() {
        return (TitleViewModel) this.f115485g.getValue();
    }

    /* renamed from: w */
    private final C57605g m181290w() {
        return (C57605g) this.f115490l.getValue();
    }

    /* renamed from: x */
    private final boolean m181291x() {
        return ((Boolean) this.f115492n.getValue()).booleanValue();
    }

    /* renamed from: k */
    public final AbstractC45399a.AbstractC45406g mo160915k() {
        return (AbstractC45399a.AbstractC45406g) this.f115488j.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/title/TitleView$Companion;", "", "()V", "AVATAR_SIZE_IN_DP", "", "AVATAR_SIZE_OLD_IN_DP", "CUSTOM_STATUS_GUIDE_KEY", "", "POPUP_WINDOW_WIDTH_IN_DP", "SHOW_TIP_X_OFFSET", "SHOW_TIP_Y_OFFSET", "TAG", "USER_STATUS_TEXT_SIZE_IN_SP", "USER_STATUS_TOUCH_EXPAND_SIZE_IN_DP", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: s */
    public final Activity mo160920s() {
        return this.f115493o;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/ui/LarkUIPopupWindow;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleView$w */
    static final class C45761w extends Lambda implements Function0<C57605g> {
        final /* synthetic */ TitleView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45761w(TitleView titleView) {
            super(0);
            this.this$0 = titleView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C57605g invoke() {
            return this.this$0.mo160917m();
        }
    }

    /* renamed from: n */
    public void mo160918n() {
        this.f115486h = true;
        m181293z();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onDismiss"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleView$d */
    public static final class C45741d implements PopupWindow.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ TitleView f115495a;

        C45741d(TitleView titleView) {
            this.f115495a = titleView;
        }

        public final void onDismiss() {
            this.f115495a.mo160915k().mo133468a("all_on_leave_status");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IFeatureGatingDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleView$u */
    static final class C45759u extends Lambda implements Function0<AbstractC45399a.AbstractC45405f> {
        public static final C45759u INSTANCE = new C45759u();

        C45759u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC45399a.AbstractC45405f invoke() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            return a.mo133451j();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IGuideDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleView$v */
    static final class C45760v extends Lambda implements Function0<AbstractC45399a.AbstractC45406g> {
        public static final C45760v INSTANCE = new C45760v();

        C45760v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC45399a.AbstractC45406g invoke() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            return a.mo133445d();
        }
    }

    /* renamed from: C */
    private final boolean m181286C() {
        return mo160915k().mo133469b("all_on_leave_status");
    }

    /* renamed from: a */
    public final LKUIRoundedImageView2 mo160902a() {
        LKUIRoundedImageView2 lKUIRoundedImageView2 = this.mAvatarIV;
        if (lKUIRoundedImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAvatarIV");
        }
        return lKUIRoundedImageView2;
    }

    /* renamed from: b */
    public final UserStatusLinearLayout mo160909b() {
        UserStatusLinearLayout userStatusLinearLayout = this.mStatus;
        if (userStatusLinearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatus");
        }
        return userStatusLinearLayout;
    }

    /* renamed from: c */
    public final TextView mo121985c() {
        TextView textView = this.mWorkStatusTV;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWorkStatusTV");
        }
        return textView;
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        ButterKnife.bind(this, this.f115494p);
        m181292y();
    }

    /* renamed from: f */
    public final TextView mo160910f() {
        TextView textView = this.emptyStatus;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emptyStatus");
        }
        return textView;
    }

    /* renamed from: g */
    public final Group mo160911g() {
        Group group = this.personalStatusGroup;
        if (group == null) {
            Intrinsics.throwUninitializedPropertyAccessException("personalStatusGroup");
        }
        return group;
    }

    /* renamed from: h */
    public final TextView mo160912h() {
        TextView textView = this.statusTitle;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusTitle");
        }
        return textView;
    }

    /* renamed from: i */
    public final ImageView mo160913i() {
        ImageView imageView = this.statusAvatar;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusAvatar");
        }
        return imageView;
    }

    /* renamed from: j */
    public final TextView mo160914j() {
        TextView textView = this.statusEndTime;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusEndTime");
        }
        return textView;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/impl/index/v2/container/HostViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleView$c */
    static final class C45740c extends Lambda implements Function0<HostViewModel> {
        final /* synthetic */ TitleView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45740c(TitleView titleView) {
            super(0);
            this.this$0 = titleView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final HostViewModel invoke() {
            AbstractC1142af afVar = this.this$0.f115482c.get(0);
            if (afVar != null) {
                return (HostViewModel) afVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.mine.impl.index.v2.container.HostViewModel");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleView$t */
    static final class C45758t extends Lambda implements Function0<Boolean> {
        public static final C45758t INSTANCE = new C45758t();

        C45758t() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return C37239a.m146648b().mo136951a("lark.core.status.5.0");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/impl/index/v2/title/TitleViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleView$x */
    static final class C45762x extends Lambda implements Function0<TitleViewModel> {
        final /* synthetic */ TitleView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45762x(TitleView titleView) {
            super(0);
            this.this$0 = titleView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TitleViewModel invoke() {
            AbstractC1142af afVar = this.this$0.f115482c.get(1);
            if (afVar != null) {
                return (TitleViewModel) afVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.mine.impl.index.v2.title.TitleViewModel");
        }
    }

    /* renamed from: z */
    private final void m181293z() {
        if (m181286C() && this.f115487i && this.f115486h) {
            m181285B();
        }
    }

    /* renamed from: p */
    public void mo160919p() {
        if (m181290w().mo195588b()) {
            m181290w().mo195586a().dismiss();
        }
    }

    /* renamed from: l */
    public final void mo160916l() {
        this.f115491m = null;
        AbstractC45399a a = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
        String h = a.mo133449h();
        if (TextUtils.isEmpty(h)) {
            TextView textView = this.mTenantDesc;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTenantDesc");
            }
            textView.setVisibility(4);
            return;
        }
        TextView textView2 = this.mTenantDesc;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTenantDesc");
        }
        textView2.setVisibility(0);
        TextView textView3 = this.mTenantDesc;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTenantDesc");
        }
        textView3.setText(h);
    }

    /* renamed from: m */
    public final C57605g mo160917m() {
        C57605g gVar = new C57605g(this.f115493o);
        View a = gVar.mo195585a(R.layout.common_blue_tip_layout, UIHelper.dp2px((float) 270), -2, new ColorDrawable(0));
        PopupWindow a2 = gVar.mo195586a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "popupWindow.popupWindow");
        a2.setAnimationStyle(R.style.PopUpWindowEnterExitAnimation);
        ((TextView) a.findViewById(R.id.text)).setText(R.string.Lark_Legacy_WorkStatusHint);
        return gVar;
    }

    /* renamed from: B */
    private final void m181285B() {
        if (!m181290w().mo195588b()) {
            TextView textView = this.mWorkStatusTV;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWorkStatusTV");
            }
            if (textView.getVisibility() == 0) {
                C57605g w = m181290w();
                TextView textView2 = this.mWorkStatusTV;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mWorkStatusTV");
                }
                w.mo195587a(textView2, new C57605g.C57606a(8), f115478t, f115479u);
            }
            m181290w().mo195586a().setOnDismissListener(new C45741d(this));
        }
    }

    /* renamed from: y */
    private final void m181292y() {
        LKUIRoundedImageView2 lKUIRoundedImageView2 = this.mAvatarIV;
        if (lKUIRoundedImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAvatarIV");
        }
        lKUIRoundedImageView2.setOnClickListener(new C45742e(this));
        TextView textView = this.mTenantDesc;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTenantDesc");
        }
        textView.setOnClickListener(new View$OnClickListenerC45751m(this));
        TitleView titleView = this;
        m181289v().getChatter().mo5923a(titleView, new C45752n(this));
        m181289v().isLeanMode().mo5923a(titleView, new C45753o(this));
        View$OnClickListenerC45757s sVar = new View$OnClickListenerC45757s(this);
        ViewGroup viewGroup = this.mNameContainer;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNameContainer");
        }
        viewGroup.setOnClickListener(sVar);
        m181289v().getChatter().mo5923a(titleView, new C45754p(this));
        m181289v().getProfileInfo().mo5923a(titleView, new C45755q(this));
        m181289v().getTenantCertificationInfo().mo5923a(titleView, new C45756r(this));
        UserStatusLinearLayout userStatusLinearLayout = this.mStatus;
        if (userStatusLinearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatus");
        }
        UserStatusTextView userStatusTextView = (UserStatusTextView) userStatusLinearLayout.findViewById(R.id.tv_desc);
        userStatusTextView.setEmojiconSize(UIHelper.dp2px(16.0f));
        userStatusTextView.setMinHeight(UIHelper.dp2px(16.0f));
        UserStatusLinearLayout userStatusLinearLayout2 = this.mStatus;
        if (userStatusLinearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatus");
        }
        userStatusLinearLayout2.setTextSize(14);
        userStatusLinearLayout2.setTextColor(ContextCompat.getColor(userStatusLinearLayout2.getContext(), R.color.text_placeholder));
        userStatusLinearLayout2.mo201158b(0, 0, UIHelper.dp2px(4.0f), 0);
        userStatusLinearLayout2.setGravity(16);
        userStatusLinearLayout2.mo201153a(this.f115493o.getDrawable(R.drawable.ud_icon_edit_outlined));
        userStatusLinearLayout2.setUrlOrPhoneColor(UIUtils.getColor(userStatusLinearLayout2.getContext(), R.color.text_placeholder));
        UserStatusLinearLayout userStatusLinearLayout3 = this.mStatus;
        if (userStatusLinearLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatus");
        }
        userStatusLinearLayout3.setOnClickListener(new C45743f(this));
        UserStatusLinearLayout userStatusLinearLayout4 = this.mStatus;
        if (userStatusLinearLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatus");
        }
        ak.m95026a(userStatusLinearLayout4, UIHelper.dp2px((float) 8));
        TextView textView2 = this.mWorkStatusTV;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWorkStatusTV");
        }
        textView2.setOnClickListener(new View$OnClickListenerC45744g(this));
        TextView textView3 = this.mWorkStatusTV;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWorkStatusTV");
        }
        ak.m95026a(textView3, UIHelper.dp2px(3.0f));
        if (m181291x()) {
            ConstraintLayout constraintLayout = this.mZenSetting;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mZenSetting");
            }
            constraintLayout.setVisibility(8);
            ConstraintLayout constraintLayout2 = this.personalStatusLayout;
            if (constraintLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("personalStatusLayout");
            }
            constraintLayout2.setVisibility(0);
        } else {
            ConstraintLayout constraintLayout3 = this.mZenSetting;
            if (constraintLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mZenSetting");
            }
            constraintLayout3.setVisibility(0);
            ConstraintLayout constraintLayout4 = this.personalStatusLayout;
            if (constraintLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("personalStatusLayout");
            }
            constraintLayout4.setVisibility(8);
        }
        ConstraintLayout constraintLayout5 = this.mZenSetting;
        if (constraintLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mZenSetting");
        }
        constraintLayout5.setOnClickListener(new C45746h(this));
        ConstraintLayout constraintLayout6 = this.personalStatusLayout;
        if (constraintLayout6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("personalStatusLayout");
        }
        constraintLayout6.setOnClickListener(new View$OnClickListenerC45747i(this));
        m181289v().getUserStatus().mo5923a(titleView, new C45748j(this));
        m181289v().isInZenSetting().mo5923a(titleView, new C45749k(this));
        m181288t().getTenentInfos().mo5923a(titleView, new C45750l(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/title/TitleView$initView$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "view", "Landroid/view/View;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleView$e */
    public static final class C45742e extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ TitleView f115496a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45742e(TitleView titleView) {
            this.f115496a = titleView;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f115496a.f115483d.mo160882a((Context) this.f115496a.mo160920s());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/title/TitleView$initView$10", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleView$f */
    public static final class C45743f extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ TitleView f115497a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45743f(TitleView titleView) {
            this.f115497a = titleView;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f115497a.f115483d.mo160883a(this.f115497a.mo160920s(), new ChatterDescription(this.f115497a.mo160909b().getUserStatus(), this.f115497a.f115481b));
            MineHitPoint.m181467a(UpdateKey.STATUS);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/title/TitleView$initView$12", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleView$h */
    public static final class C45746h extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ TitleView f115500a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45746h(TitleView titleView) {
            this.f115500a = titleView;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f115500a.f115483d.mo160881a(this.f115500a.mo160920s());
            ZenHitPoint.m181481a();
            MineHitPoint.m181467a("do_not_disturb");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleView$k */
    public static final class C45749k<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TitleView f115503a;

        C45749k(TitleView titleView) {
            this.f115503a = titleView;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            TitleView titleView = this.f115503a;
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            titleView.mo160908a(bool.booleanValue());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/passport/signinsdk_api/account/TenantInfo;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleView$l */
    public static final class C45750l<T> implements AbstractC1178x<List<TenantInfo>> {

        /* renamed from: a */
        final /* synthetic */ TitleView f115504a;

        C45750l(TitleView titleView) {
            this.f115504a = titleView;
        }

        /* renamed from: a */
        public final void onChanged(List<TenantInfo> list) {
            TitleView titleView = this.f115504a;
            Intrinsics.checkExpressionValueIsNotNull(list, "it");
            titleView.mo160907a(list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleView$m */
    public static final class View$OnClickListenerC45751m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TitleView f115505a;

        View$OnClickListenerC45751m(TitleView titleView) {
            this.f115505a = titleView;
        }

        public final void onClick(View view) {
            this.f115505a.f115483d.mo160882a((Context) this.f115505a.mo160920s());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleView$p */
    public static final class C45754p<T> implements AbstractC1178x<Chatter> {

        /* renamed from: a */
        final /* synthetic */ TitleView f115508a;

        C45754p(TitleView titleView) {
            this.f115508a = titleView;
        }

        /* renamed from: a */
        public final void onChanged(Chatter chatter) {
            TitleView titleView = this.f115508a;
            Intrinsics.checkExpressionValueIsNotNull(chatter, "it");
            titleView.mo160903a(chatter);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mine/dto/MineProfile;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleView$q */
    public static final class C45755q<T> implements AbstractC1178x<C45427e> {

        /* renamed from: a */
        final /* synthetic */ TitleView f115509a;

        C45755q(TitleView titleView) {
            this.f115509a = titleView;
        }

        /* renamed from: a */
        public final void onChanged(C45427e eVar) {
            TitleView titleView = this.f115509a;
            Intrinsics.checkExpressionValueIsNotNull(eVar, "it");
            titleView.mo160905a(eVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleView$i */
    public static final class View$OnClickListenerC45747i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TitleView f115501a;

        View$OnClickListenerC45747i(TitleView titleView) {
            this.f115501a = titleView;
        }

        public final void onClick(View view) {
            this.f115501a.f115483d.mo160884b(this.f115501a.mo160920s());
            UserCustomStatusHitPoint.f115066a.mo160400a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleView$n */
    public static final class C45752n<T> implements AbstractC1178x<Chatter> {

        /* renamed from: a */
        final /* synthetic */ TitleView f115506a;

        C45752n(TitleView titleView) {
            this.f115506a = titleView;
        }

        /* renamed from: a */
        public final void onChanged(Chatter chatter) {
            TitleView titleView = this.f115506a;
            Intrinsics.checkExpressionValueIsNotNull(chatter, "it");
            titleView.mo160904a(chatter, this.f115506a.mo160902a(), this.f115506a.f115480a, this.f115506a.f115480a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "result", "Lkotlin/Result;", "Lcom/ss/android/lark/mine/dto/TenantCertificationInfo;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleView$r */
    public static final class C45756r<T> implements AbstractC1178x<Result<? extends TenantCertificationInfo>> {

        /* renamed from: a */
        final /* synthetic */ TitleView f115510a;

        C45756r(TitleView titleView) {
            this.f115510a = titleView;
        }

        /* renamed from: a */
        public final void onChanged(Result<? extends TenantCertificationInfo> result) {
            Object r3 = result.m271578unboximpl();
            if (Result.m271576isSuccessimpl(r3)) {
                this.f115510a.mo160906a((TenantCertificationInfo) r3);
            }
            if (Result.m271572exceptionOrNullimpl(r3) != null) {
                this.f115510a.mo160916l();
            }
        }
    }

    /* renamed from: a */
    public final void mo160903a(Chatter chatter) {
        AbstractC45399a a = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
        String a2 = a.mo133459r().mo133505a(chatter);
        TextView textView = this.mNameTV;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNameTV");
        }
        textView.setText(a2);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleView$g */
    public static final class View$OnClickListenerC45744g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TitleView f115498a;

        View$OnClickListenerC45744g(TitleView titleView) {
            this.f115498a = titleView;
        }

        public final void onClick(View view) {
            new C25639g(this.f115498a.mo160920s()).mo89248g(R.string.Lark_Legacy_DeleteWorkStatusTitle).mo89238b(true).mo89254m(R.string.Lark_Legacy_WorkStatusDeleteTip).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_CancelTip, (DialogInterface.OnClickListener) null).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmInfo, new DialogInterface.OnClickListener(this) {
                /* class com.ss.android.lark.mine.impl.index.v2.title.TitleView.View$OnClickListenerC45744g.DialogInterface$OnClickListenerC457451 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC45744g f115499a;

                {
                    this.f115499a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f115499a.f115498a.f115483d.mo160880a();
                    this.f115499a.f115498a.mo121985c().setVisibility(8);
                    WorkStatusHitPoint.f115576a.mo161023a();
                }
            }).mo89239c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleView$o */
    public static final class C45753o<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TitleView f115507a;

        C45753o(TitleView titleView) {
            this.f115507a = titleView;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                this.f115507a.mo160902a().setBorderWidthInDp(3.0f);
                this.f115507a.mo160902a().setBorderColor(UIUtils.getColor(this.f115507a.mo160920s(), R.color.lkui_B500));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleView$s */
    public static final class View$OnClickListenerC45757s implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TitleView f115511a;

        View$OnClickListenerC45757s(TitleView titleView) {
            this.f115511a = titleView;
        }

        public final void onClick(View view) {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            if (a.mo133451j().mo133481a("lark.all.change.name")) {
                EditProfileHitPoint.f115575a.mo161018a();
            }
            this.f115511a.f115483d.mo160882a((Context) this.f115511a.mo160920s());
            MineHitPoint.m181467a("personal_link");
        }
    }

    /* renamed from: a */
    public final void mo160908a(boolean z) {
        Drawable drawable;
        if (z) {
            Activity activity = this.f115493o;
            drawable = UDIconUtils.getIconDrawable(activity, (int) R.drawable.ud_icon_alerts_off_filled, UIUtils.getColor(activity, R.color.ud_R500));
        } else {
            Activity activity2 = this.f115493o;
            drawable = UDIconUtils.getIconDrawable(activity2, (int) R.drawable.ud_icon_bell_filled, UIUtils.getColor(activity2, R.color.icon_n3));
        }
        ImageView imageView = this.mZenSettingIcon;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mZenSettingIcon");
        }
        imageView.setImageDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/lark/pb/basic/v1/Chatter$ChatterCustomStatus;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleView$j */
    public static final class C45748j<T> implements AbstractC1178x<Chatter.ChatterCustomStatus> {

        /* renamed from: a */
        final /* synthetic */ TitleView f115502a;

        C45748j(TitleView titleView) {
            this.f115502a = titleView;
        }

        /* renamed from: a */
        public final void onChanged(Chatter.ChatterCustomStatus chatterCustomStatus) {
            if (chatterCustomStatus == null) {
                Drawable drawable = UIUtils.getDrawable(this.f115502a.mo160920s(), R.drawable.ud_icon_add_outlined);
                drawable.setBounds(0, 0, CustomStatusUIUtils.f115068a.mo160434a(14), CustomStatusUIUtils.f115068a.mo160434a(14));
                TextView f = this.f115502a.mo160910f();
                AbstractC45399a a = C45421b.m180420a();
                Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
                if (a.mo133445d().mo133469b("all_im_status_setting")) {
                    f.setTextColor(UIUtils.getColor(this.f115502a.mo160920s(), R.color.primary_pri_500));
                    drawable.setTint(UIUtils.getColor(this.f115502a.mo160920s(), R.color.primary_pri_500));
                    f.setCompoundDrawablePadding(CustomStatusUIUtils.f115068a.mo160434a(2));
                    f.setCompoundDrawables(drawable, null, null, null);
                    f.setBackground(UIUtils.getDrawable(this.f115502a.mo160920s(), R.drawable.bg_empty_status_selector));
                } else {
                    f.setTextColor(UIUtils.getColor(this.f115502a.mo160920s(), R.color.text_caption));
                    drawable.setTint(UIUtils.getColor(this.f115502a.mo160920s(), R.color.icon_n2));
                    f.setCompoundDrawablePadding(CustomStatusUIUtils.f115068a.mo160434a(2));
                    f.setCompoundDrawables(drawable, null, null, null);
                    f.setBackground(UIUtils.getDrawable(this.f115502a.mo160920s(), R.drawable.icon_do_not_disturb_bg_selector));
                }
                this.f115502a.mo160910f().setVisibility(0);
                this.f115502a.mo160911g().setVisibility(8);
                return;
            }
            this.f115502a.mo160910f().setVisibility(8);
            this.f115502a.mo160911g().setVisibility(0);
            C52977a.m205190a().mo180995a(this.f115502a.mo160913i(), chatterCustomStatus.icon_key);
            this.f115502a.mo160912h().setText(chatterCustomStatus.title);
            StatusEffectiveInterval statusEffectiveInterval = chatterCustomStatus.effective_interval;
            if (statusEffectiveInterval != null) {
                Boolean bool = statusEffectiveInterval.is_show_end_time;
                Intrinsics.checkExpressionValueIsNotNull(bool, "interval.is_show_end_time");
                if (bool.booleanValue()) {
                    TextView j = this.f115502a.mo160914j();
                    Long l = statusEffectiveInterval.end_time;
                    Intrinsics.checkExpressionValueIsNotNull(l, "interval.end_time");
                    j.setText(UIHelper.mustacheFormat((int) R.string.Lark_Profile_UntilTime, "time", C45616s.m180942a(l.longValue(), this.f115502a.mo160920s())));
                    return;
                }
                this.f115502a.mo160914j().setText(UIUtils.getString(this.f115502a.mo160920s(), R.string.Lark_Profile_StatusEndTimeTillMeetingEnds_Option));
                return;
            }
            this.f115502a.mo160914j().setText("");
        }
    }

    /* renamed from: a */
    public final void mo160905a(C45427e eVar) {
        if (this.f115483d.mo160885b()) {
            String a = eVar.mo160297a();
            String b = eVar.mo160301b();
            if (TextUtils.isEmpty(a)) {
                a = b;
            }
            TextView textView = this.mDepartmentTV;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDepartmentTV");
            }
            textView.setText(a);
            ChatterDescription d = eVar.mo160305d();
            String str = d.description;
            if (!TextUtils.isEmpty(str) || d.type != ChatterDescription.Type.DEFAULT) {
                ChatterDescription.Type type = d.type;
                Intrinsics.checkExpressionValueIsNotNull(type, "description.type");
                this.f115481b = type;
                UserStatusLinearLayout userStatusLinearLayout = this.mStatus;
                if (userStatusLinearLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mStatus");
                }
                userStatusLinearLayout.setNeedToRecognize(true);
                UserStatusLinearLayout userStatusLinearLayout2 = this.mStatus;
                if (userStatusLinearLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mStatus");
                }
                AbstractC45399a a2 = C45421b.m180420a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "MineModule.getDependency()");
                AbstractC45399a.AbstractC45410k q = a2.mo133458q();
                Intrinsics.checkExpressionValueIsNotNull(q, "MineModule.getDependency().loginDependency");
                String e = q.mo133504e();
                UserStatusHelper a3 = UserStatusHelper.m224138a();
                ChatterDescription.Type type2 = d.type;
                Intrinsics.checkExpressionValueIsNotNull(type2, "description.type");
                userStatusLinearLayout2.mo201156a(str, e, UIUtils.getDrawable(this.f115493o, a3.mo195998a(type2.getNumber())), false);
            } else {
                UserStatusLinearLayout userStatusLinearLayout3 = this.mStatus;
                if (userStatusLinearLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mStatus");
                }
                userStatusLinearLayout3.mo201153a(this.f115493o.getDrawable(R.drawable.ud_icon_edit_outlined));
                this.f115481b = ChatterDescription.Type.DEFAULT;
            }
            WorkStatus c = eVar.mo160303c();
            if (WorkStatus.isInvalid(c)) {
                TextView textView2 = this.mWorkStatusTV;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mWorkStatusTV");
                }
                textView2.setVisibility(8);
                return;
            }
            TextView textView3 = this.mWorkStatusTV;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWorkStatusTV");
            }
            textView3.setVisibility(0);
            TextView textView4 = this.mWorkStatusTV;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWorkStatusTV");
            }
            textView4.setText(c.getDisplayTextWithDuration(this.f115493o));
            this.f115487i = true;
            m181293z();
        }
    }

    /* renamed from: a */
    public final void mo160906a(TenantCertificationInfo gVar) {
        this.f115491m = gVar;
        AbstractC45399a a = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
        String h = a.mo133449h();
        String str = h;
        if (TextUtils.isEmpty(str)) {
            TextView textView = this.mTenantDesc;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTenantDesc");
            }
            textView.setVisibility(4);
            return;
        }
        TextView textView2 = this.mTenantDesc;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTenantDesc");
        }
        textView2.setVisibility(0);
        if (gVar == null || !gVar.mo160312a()) {
            TextView textView3 = this.mTenantDesc;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTenantDesc");
            }
            textView3.setText(str);
            return;
        }
        Intrinsics.checkExpressionValueIsNotNull(h, "tenantName");
        m181287a(h, gVar);
    }

    /* renamed from: a */
    public final void mo160907a(List<? extends TenantInfo> list) {
        TenantInfo tenantInfo = null;
        Iterator<? extends TenantInfo> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TenantInfo tenantInfo2 = (TenantInfo) it.next();
            if (tenantInfo2 != null && tenantInfo2.isCurrentUser()) {
                tenantInfo = tenantInfo2;
                break;
            }
        }
        if (tenantInfo != null) {
            String tenantName = tenantInfo.getTenantName();
            String str = tenantName;
            if (TextUtils.isEmpty(str)) {
                TextView textView = this.mTenantDesc;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTenantDesc");
                }
                textView.setVisibility(4);
                return;
            }
            TextView textView2 = this.mTenantDesc;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTenantDesc");
            }
            textView2.setVisibility(0);
            TenantCertificationInfo gVar = this.f115491m;
            if (gVar == null || !gVar.mo160312a()) {
                TextView textView3 = this.mTenantDesc;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTenantDesc");
                }
                textView3.setText(str);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(tenantName, "tenantName");
            m181287a(tenantName, this.f115491m);
        }
    }

    /* renamed from: a */
    private final void m181287a(String str, TenantCertificationInfo gVar) {
        C58324b bVar;
        if (gVar != null) {
            SpannableStringBuilder append = new SpannableStringBuilder(str).append((CharSequence) "$");
            boolean b = gVar.mo160313b();
            if (b) {
                Activity activity = this.f115493o;
                Drawable drawable = UIUtils.getDrawable(activity, R.drawable.mine_tenant_certification_icon);
                String string = UIHelper.getString(R.string.Lark_FeishuCertif_Verif);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(string.Lark_FeishuCertif_Verif)");
                bVar = new C58324b(new TenantCertificationDrawable(activity, drawable, string, UIUtils.getColor(this.f115493o, R.color.udtoken_tag_bg_turquoise), UIUtils.getColor(this.f115493o, R.color.udtoken_tag_text_s_turquoise)));
            } else if (!b) {
                String string2 = UIHelper.getString(R.string.Lark_FeishuCertif_Unverif);
                Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(strin…ark_FeishuCertif_Unverif)");
                bVar = new C58324b(new TenantCertificationDrawable(this.f115493o, null, string2, UIUtils.getColor(this.f115493o, R.color.udtoken_tag_neutral_bg_normal), UIUtils.getColor(this.f115493o, R.color.udtoken_tag_neutral_text_normal)));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            append.setSpan(bVar, append.length() - 1, append.length(), 34);
            TextView textView = this.mTenantDesc;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTenantDesc");
            }
            textView.setText(append);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Map<java.lang.Integer, ? extends androidx.lifecycle.af> */
    /* JADX WARN: Multi-variable type inference failed */
    public TitleView(Activity activity, View view, Map<Integer, ? extends AbstractC1142af> map, IViewDependency bVar) {
        Intrinsics.checkParameterIsNotNull(activity, "mContext");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(map, "map");
        Intrinsics.checkParameterIsNotNull(bVar, "viewDependency");
        this.f115493o = activity;
        this.f115494p = view;
        this.f115482c = map;
        this.f115483d = bVar;
    }

    /* renamed from: a */
    public final void mo160904a(com.ss.android.lark.chat.entity.chatter.Chatter chatter, ImageView imageView, int i, int i2) {
        if (DesktopUtil.m144301a((Context) this.f115493o)) {
            ImageLoader.with(this.f115493o).load(AvatarImage.Builder.obtain(chatter.getAvatarKey(), chatter.getId(), i, i2).quality(100).build()).into(imageView);
            return;
        }
        ImageLoader.with(this.f115493o).load(AvatarImage.Builder.obtain(chatter.getAvatarKey(), chatter.getId(), i, i2).build()).override(i, i2).into(imageView);
    }
}
