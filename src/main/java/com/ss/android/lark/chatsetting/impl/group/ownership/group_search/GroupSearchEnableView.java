package com.ss.android.lark.chatsetting.impl.group.ownership.group_search;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import butterknife.BindView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.ownership.group_search.IGroupSearchEnableContract;
import com.ss.android.lark.chatsetting.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.chatsetting.impl.statistics.ownership.OwnershipHitPointNew;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\u0018\u0000 V2\u00020\u0001:\u0002VWB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u0013H\u0002J\b\u0010F\u001a\u00020BH\u0016J\b\u0010G\u001a\u00020BH\u0016J\u001e\u0010H\u001a\u00020B2\u0006\u0010I\u001a\u00020J2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00070LH\u0016J\b\u0010M\u001a\u00020BH\u0016J\b\u0010N\u001a\u00020BH\u0002J\b\u0010O\u001a\u00020BH\u0002J\u0010\u0010P\u001a\u00020B2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0010\u0010Q\u001a\u00020B2\u0006\u0010R\u001a\u00020\tH\u0002J\u0012\u0010S\u001a\u00020B2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u0010\u0010T\u001a\u00020B2\u0006\u0010I\u001a\u00020JH\u0002J\u0012\u0010U\u001a\u00020B2\b\u0010I\u001a\u0004\u0018\u00010JH\u0016R\u000e\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001e\u0010!\u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001e\u0010$\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R\u001e\u0010'\u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\u001e\u0010*\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017R\u001e\u0010-\u001a\u00020.8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u00103\u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dR\u001e\u00106\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0015\"\u0004\b8\u0010\u0017R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001e\u00109\u001a\u00020:8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0010\u0010?\u001a\u0004\u0018\u00010@X\u000e¢\u0006\u0002\n\u0000¨\u0006X"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/GroupSearchEnableView;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/IGroupSearchEnableContract$IView;", "mContext", "Landroid/content/Context;", "mDependency", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/GroupSearchEnableView$IViewDependency;", "mChatId", "", "mIsThread", "", "(Landroid/content/Context;Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/GroupSearchEnableView$IViewDependency;Ljava/lang/String;Z)V", "isChecked", "mEnableBtn", "Lcom/larksuite/component/ui/button/LKUISwitchButton;", "getMEnableBtn", "()Lcom/larksuite/component/ui/button/LKUISwitchButton;", "setMEnableBtn", "(Lcom/larksuite/component/ui/button/LKUISwitchButton;)V", "mGroupDesc", "Landroid/widget/TextView;", "getMGroupDesc", "()Landroid/widget/TextView;", "setMGroupDesc", "(Landroid/widget/TextView;)V", "mGroupDescLayout", "Landroid/view/View;", "getMGroupDescLayout", "()Landroid/view/View;", "setMGroupDescLayout", "(Landroid/view/View;)V", "mGroupDescTitle", "getMGroupDescTitle", "setMGroupDescTitle", "mGroupInfoLayout", "getMGroupInfoLayout", "setMGroupInfoLayout", "mGroupName", "getMGroupName", "setMGroupName", "mGroupNameLayout", "getMGroupNameLayout", "setMGroupNameLayout", "mGroupNameTitle", "getMGroupNameTitle", "setMGroupNameTitle", "mGroupPhoto", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "getMGroupPhoto", "()Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "setMGroupPhoto", "(Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;)V", "mGroupPhotoLayout", "getMGroupPhotoLayout", "setMGroupPhotoLayout", "mGroupPhotoTitle", "getMGroupPhotoTitle", "setMGroupPhotoTitle", "mTitleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "getMTitleBar", "()Lcom/ss/android/lark/ui/CommonTitleBar;", "setMTitleBar", "(Lcom/ss/android/lark/ui/CommonTitleBar;)V", "viewDelegate", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/IGroupSearchEnableContract$IView$Delegate;", "addSuffixInTv", "", "preStringRes", "", "tv", "create", "destroy", "gotoAvatarPage", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "targetImagePaths", "", "handleBackPressed", "initGroupInfoLayout", "initTitleBar", "onConfirmBtnClicked", "sendRemindClickEvent", "isCancel", "setViewDelegate", "updateGroupInfo", "updateView", "Companion", "IViewDependency", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class GroupSearchEnableView implements IGroupSearchEnableContract.IView {

    /* renamed from: f */
    public static final Companion f89625f = new Companion(null);

    /* renamed from: a */
    public IGroupSearchEnableContract.IView.Delegate f89626a;

    /* renamed from: b */
    public boolean f89627b;

    /* renamed from: c */
    public final Context f89628c;

    /* renamed from: d */
    public final IViewDependency f89629d;

    /* renamed from: e */
    public final String f89630e;

    /* renamed from: g */
    private final boolean f89631g;
    @BindView(6787)
    public LKUISwitchButton mEnableBtn;
    @BindView(7642)
    public TextView mGroupDesc;
    @BindView(6980)
    public View mGroupDescLayout;
    @BindView(7624)
    public TextView mGroupDescTitle;
    @BindView(6765)
    public View mGroupInfoLayout;
    @BindView(7644)
    public TextView mGroupName;
    @BindView(7315)
    public View mGroupNameLayout;
    @BindView(7645)
    public TextView mGroupNameTitle;
    @BindView(6876)
    public LKUIRoundedImageView2 mGroupPhoto;
    @BindView(7316)
    public View mGroupPhotoLayout;
    @BindView(7647)
    public TextView mGroupPhotoTitle;
    @BindView(7600)
    public CommonTitleBar mTitleBar;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/GroupSearchEnableView$IViewDependency;", "", "enterCustomizeAvatarPage", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "gotoEditInfoActivity", "chatId", "", ShareHitPoint.f121869d, "", "gotoLastPage", "injectView", "view", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/IGroupSearchEnableContract$IView;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.group_search.GroupSearchEnableView$b */
    public interface IViewDependency {
        /* renamed from: a */
        void mo128160a();

        /* renamed from: a */
        void mo128161a(Chat chat);

        /* renamed from: a */
        void mo128162a(IGroupSearchEnableContract.IView bVar);

        /* renamed from: a */
        void mo128163a(String str, int i);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/GroupSearchEnableView$Companion;", "", "()V", "ONE_SPACE", "", "SUFFIX", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.group_search.GroupSearchEnableView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.group_search.IGroupSearchEnableContract.IView
    /* renamed from: c */
    public void mo128171c() {
        this.f89629d.mo128160a();
    }

    /* renamed from: a */
    public final LKUISwitchButton mo128164a() {
        LKUISwitchButton lKUISwitchButton = this.mEnableBtn;
        if (lKUISwitchButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEnableBtn");
        }
        return lKUISwitchButton;
    }

    /* renamed from: b */
    public final View mo128169b() {
        View view = this.mGroupInfoLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGroupInfoLayout");
        }
        return view;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f89629d.mo128162a(this);
        m134934d();
        m134935e();
    }

    /* renamed from: d */
    private final void m134934d() {
        CommonTitleBar commonTitleBar = this.mTitleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
        CommonTitleBar commonTitleBar2 = this.mTitleBar;
        if (commonTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar2.setTitle(R.string.Lark_Group_FindGroupViaSearchTitle);
        CommonTitleBar commonTitleBar3 = this.mTitleBar;
        if (commonTitleBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar3.setLeftClickListener(new View$OnClickListenerC34711g(this));
        CommonTitleBar commonTitleBar4 = this.mTitleBar;
        if (commonTitleBar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar4.addAction(new C34712h(this, UIUtils.getString(this.f89628c, R.string.Lark_Legacy_Confirm), R.color.function_info_500));
    }

    /* renamed from: e */
    private final void m134935e() {
        int i;
        int i2;
        LKUISwitchButton lKUISwitchButton = this.mEnableBtn;
        if (lKUISwitchButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEnableBtn");
        }
        lKUISwitchButton.setOnCheckedChangeListener(new C34707c(this));
        if (this.f89631g) {
            i = R.string.Lark_Groups_GroupName;
        } else {
            i = R.string.Lark_Legacy_GroupName;
        }
        TextView textView = this.mGroupNameTitle;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGroupNameTitle");
        }
        m134932a(i, textView);
        View view = this.mGroupNameLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGroupNameLayout");
        }
        view.setOnClickListener(new View$OnClickListenerC34708d(this));
        if (this.f89631g) {
            i2 = R.string.Lark_Groups_Description;
        } else {
            i2 = R.string.Lark_Legacy_GroupDescription;
        }
        TextView textView2 = this.mGroupDescTitle;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGroupDescTitle");
        }
        m134932a(i2, textView2);
        View view2 = this.mGroupDescLayout;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGroupDescLayout");
        }
        view2.setOnClickListener(new View$OnClickListenerC34709e(this));
        TextView textView3 = this.mGroupPhotoTitle;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGroupPhotoTitle");
        }
        textView3.setText(UIUtils.getString(this.f89628c, R.string.Lark_Legacy_GroupPhoto));
        View view3 = this.mGroupPhotoLayout;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGroupPhotoLayout");
        }
        view3.setOnClickListener(new View$OnClickListenerC34710f(this));
    }

    /* renamed from: a */
    public void setViewDelegate(IGroupSearchEnableContract.IView.Delegate aVar) {
        this.f89626a = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.group_search.GroupSearchEnableView$g */
    public static final class View$OnClickListenerC34711g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupSearchEnableView f89636a;

        View$OnClickListenerC34711g(GroupSearchEnableView groupSearchEnableView) {
            this.f89636a = groupSearchEnableView;
        }

        public final void onClick(View view) {
            this.f89636a.f89629d.mo128160a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/group_search/GroupSearchEnableView$onConfirmBtnClicked$4", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.group_search.GroupSearchEnableView$k */
    public static final class C34715k implements IGetDataCallback<Chat> {

        /* renamed from: a */
        final /* synthetic */ GroupSearchEnableView f89640a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34715k(GroupSearchEnableView groupSearchEnableView) {
            this.f89640a = groupSearchEnableView;
        }

        /* renamed from: a */
        public void onSuccess(Chat chat) {
            UDToast.build(this.f89640a.f89628c).mo91637a(R.string.Lark_Group_SavedToast).mo91641a(UDIconUtils.getIconDrawable(this.f89640a.f89628c, (int) R.drawable.ud_icon_yes_outlined, UIUtils.getColor(this.f89640a.f89628c, R.color.static_white)));
            this.f89640a.f89629d.mo128160a();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            String displayMsg = errorResult.getDisplayMsg(UIUtils.getString(this.f89640a.f89628c, R.string.Lark_Group_FailedToSaveToast));
            Context context = this.f89640a.f89628c;
            Intrinsics.checkExpressionValueIsNotNull(displayMsg, ApiHandler.API_CALLBACK_ERRMSG);
            UDToast.show(context, displayMsg);
            this.f89640a.f89629d.mo128160a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.group_search.GroupSearchEnableView$d */
    public static final class View$OnClickListenerC34708d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupSearchEnableView f89633a;

        View$OnClickListenerC34708d(GroupSearchEnableView groupSearchEnableView) {
            this.f89633a = groupSearchEnableView;
        }

        public final void onClick(View view) {
            this.f89633a.f89629d.mo128163a(this.f89633a.f89630e, 1);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.group_search.GroupSearchEnableView$e */
    public static final class View$OnClickListenerC34709e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupSearchEnableView f89634a;

        View$OnClickListenerC34709e(GroupSearchEnableView groupSearchEnableView) {
            this.f89634a = groupSearchEnableView;
        }

        public final void onClick(View view) {
            this.f89634a.f89629d.mo128163a(this.f89634a.f89630e, 2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.group_search.GroupSearchEnableView$f */
    public static final class View$OnClickListenerC34710f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupSearchEnableView f89635a;

        View$OnClickListenerC34710f(GroupSearchEnableView groupSearchEnableView) {
            this.f89635a = groupSearchEnableView;
        }

        public final void onClick(View view) {
            IGroupSearchEnableContract.IView.Delegate aVar = this.f89635a.f89626a;
            if (aVar != null) {
                aVar.mo128190a();
            }
        }
    }

    /* renamed from: b */
    public final void mo128170b(boolean z) {
        Chat d;
        String str;
        String str2;
        IGroupSearchEnableContract.IView.Delegate aVar = this.f89626a;
        if (aVar != null && (d = aVar.mo128194d()) != null) {
            if (z) {
                str = "cancel";
            } else {
                str = "confirm";
            }
            if (z) {
                str2 = "im_group_manage_view";
            } else {
                str2 = "im_chat_allow_to_be_searched_view";
            }
            OwnershipHitPointNew.f90531b.mo129302b(d, str, str2);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.group_search.IGroupSearchEnableContract.IView
    /* renamed from: a */
    public void mo128165a(Chat chat) {
        boolean z;
        boolean z2 = false;
        if (chat != null) {
            z = chat.isPublic();
        } else {
            z = false;
        }
        LKUISwitchButton lKUISwitchButton = this.mEnableBtn;
        if (lKUISwitchButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEnableBtn");
        }
        if (z || this.f89627b) {
            z2 = true;
        }
        lKUISwitchButton.setChecked(z2);
        if (chat != null) {
            m134933b(chat);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/group_search/GroupSearchEnableView$initTitleBar$2", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.group_search.GroupSearchEnableView$h */
    public static final class C34712h extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ GroupSearchEnableView f89637a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            Chat d;
            String str;
            Intrinsics.checkParameterIsNotNull(view, "view");
            IGroupSearchEnableContract.IView.Delegate aVar = this.f89637a.f89626a;
            if (!(aVar == null || (d = aVar.mo128194d()) == null)) {
                if (this.f89637a.mo128164a().isChecked()) {
                    str = "true";
                } else {
                    str = "false";
                }
                Pair[] pairArr = new Pair[3];
                int i = 0;
                pairArr[0] = TuplesKt.to("group_name_length", Integer.valueOf(d.getName().length()));
                String description = d.getDescription();
                if (description != null) {
                    i = description.length();
                }
                pairArr[1] = TuplesKt.to("group_description_length", Integer.valueOf(i));
                pairArr[2] = TuplesKt.to("is_allow_to_be_searched", str);
                OwnershipHitPointNew.f90531b.mo129303b(d, "confirm", "none", MapsKt.mapOf(pairArr));
            }
            GroupSearchEnableView groupSearchEnableView = this.f89637a;
            groupSearchEnableView.mo128168a(groupSearchEnableView.mo128164a().isChecked());
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34712h(GroupSearchEnableView groupSearchEnableView, String str, int i) {
            super(str, i);
            this.f89637a = groupSearchEnableView;
        }
    }

    /* renamed from: b */
    private final void m134933b(Chat chat) {
        int i;
        boolean z;
        String str;
        String str2;
        View view = this.mGroupInfoLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGroupInfoLayout");
        }
        boolean z2 = false;
        if (chat.isPublic() || this.f89627b) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        TextView textView = this.mGroupName;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGroupName");
        }
        String name = chat.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "chat.getName()");
        if (name.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = UIUtils.getString(this.f89628c, R.string.Lark_Group_EnterGroupName);
        } else {
            str = chat.getName();
        }
        textView.setText(str);
        TextView textView2 = this.mGroupDesc;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGroupDesc");
        }
        String description = chat.getDescription();
        if (description == null || description.length() == 0) {
            z2 = true;
        }
        if (z2) {
            str2 = UIUtils.getString(this.f89628c, R.string.Lark_Group_EnterGroupDesc);
        } else {
            str2 = chat.getDescription();
        }
        textView2.setText(str2);
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        AbstractC34461c.AbstractC34474m i2 = a.mo127279i();
        Context context = this.f89628c;
        String avatarKey = chat.getAvatarKey();
        String id = chat.getId();
        LKUIRoundedImageView2 lKUIRoundedImageView2 = this.mGroupPhoto;
        if (lKUIRoundedImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGroupPhoto");
        }
        i2.mo127409a(context, avatarKey, id, lKUIRoundedImageView2, UIHelper.dp2px(48.0f), UIHelper.dp2px(48.0f));
        OwnershipHitPointNew.f90531b.mo129298a(chat);
    }

    /* renamed from: a */
    public final void mo128168a(boolean z) {
        boolean z2;
        Chat d;
        IGroupSearchEnableContract.IView.Delegate aVar = this.f89626a;
        if (aVar == null || z != aVar.mo128193c()) {
            IGroupSearchEnableContract.IView.Delegate aVar2 = this.f89626a;
            if (aVar2 != null) {
                z2 = aVar2.mo128192b();
            } else {
                z2 = false;
            }
            if (!z || z2) {
                IGroupSearchEnableContract.IView.Delegate aVar3 = this.f89626a;
                if (aVar3 != null) {
                    aVar3.mo128191a(z, new C34715k(this));
                    return;
                }
                return;
            }
            ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f89628c).title(R.string.Lark_Group_FillInGroupDetailsDialogTitle)).message(R.string.Lark_Group_FillInGroupDetailsDialogDesc)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Group_FillInGroupDetailsDialogButton, new DialogInterface$OnClickListenerC34713i(this))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Group_ExitButton, new DialogInterface$OnClickListenerC34714j(this))).show();
            IGroupSearchEnableContract.IView.Delegate aVar4 = this.f89626a;
            if (aVar4 != null && (d = aVar4.mo128194d()) != null) {
                OwnershipHitPointNew.f90531b.mo129301b(d);
                return;
            }
            return;
        }
        this.f89629d.mo128160a();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.group_search.GroupSearchEnableView$i */
    public static final class DialogInterface$OnClickListenerC34713i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupSearchEnableView f89638a;

        DialogInterface$OnClickListenerC34713i(GroupSearchEnableView groupSearchEnableView) {
            this.f89638a = groupSearchEnableView;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f89638a.mo128170b(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.group_search.GroupSearchEnableView$j */
    public static final class DialogInterface$OnClickListenerC34714j implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupSearchEnableView f89639a;

        DialogInterface$OnClickListenerC34714j(GroupSearchEnableView groupSearchEnableView) {
            this.f89639a = groupSearchEnableView;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f89639a.mo128170b(true);
            this.f89639a.f89629d.mo128160a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.group_search.GroupSearchEnableView$c */
    public static final class C34707c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ GroupSearchEnableView f89632a;

        C34707c(GroupSearchEnableView groupSearchEnableView) {
            this.f89632a = groupSearchEnableView;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            int i;
            View b = this.f89632a.mo128169b();
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            b.setVisibility(i);
            this.f89632a.f89627b = z;
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.group_search.IGroupSearchEnableContract.IView
    /* renamed from: a */
    public void mo128166a(Chat chat, List<String> list) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Intrinsics.checkParameterIsNotNull(list, "targetImagePaths");
        GroupHitPoint.f90519a.mo129234e();
        GroupHitPoint.f90519a.mo129235e(chat);
        GroupHitPoint.f90519a.mo129259m();
        this.f89629d.mo128161a(chat);
    }

    /* renamed from: a */
    private final void m134932a(int i, TextView textView) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(UIUtils.getString(this.f89628c, i) + " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "*");
        spannableStringBuilder.setSpan(new ForegroundColorSpan(UIUtils.getColor(this.f89628c, R.color.function_danger_500)), length, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
    }

    public GroupSearchEnableView(Context context, IViewDependency bVar, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(bVar, "mDependency");
        Intrinsics.checkParameterIsNotNull(str, "mChatId");
        this.f89628c = context;
        this.f89629d = bVar;
        this.f89630e = str;
        this.f89631g = z;
    }
}
