package com.ss.android.lark.create.groupchat.impl.type.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.create.groupchat.dto.CreateGroupMode;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import com.ss.android.lark.create.groupchat.impl.statistics.GroupHitPoint;
import com.ss.android.lark.create.groupchat.impl.type.fragment.ITypeSelectorContract;
import com.ss.android.lark.create.groupchat.impl.util.GroupFGUtils;
import com.ss.android.lark.create.groupchat.impl.util.Utils;
import com.ss.android.lark.create.groupchat.impl.widget.GroupModeSelector;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002IJB\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020(H\u0016J\u0012\u0010*\u001a\u00020+2\b\b\u0001\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u000200H\u0016J0\u00101\u001a\u00020(2\u0006\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u00020\u00152\u0006\u00106\u001a\u000207H\u0016J\u0006\u00108\u001a\u00020(J\u0012\u00109\u001a\u00020(2\b\u0010:\u001a\u0004\u0018\u00010\fH\u0016J\u001c\u0010;\u001a\u00020(2\b\b\u0001\u0010<\u001a\u00020-2\b\b\u0001\u0010=\u001a\u00020-H\u0002J\u0012\u0010>\u001a\u00020(2\b\u0010?\u001a\u0004\u0018\u00010@H\u0002J\u0010\u0010A\u001a\u00020(2\u0006\u0010B\u001a\u00020CH\u0002J\u0010\u0010D\u001a\u00020(2\u0006\u00102\u001a\u00020\u0015H\u0002J\u0010\u0010E\u001a\u00020(2\u0006\u00102\u001a\u00020\u0015H\u0002J\b\u0010F\u001a\u00020(H\u0002J\b\u0010G\u001a\u00020(H\u0002J\u0010\u0010H\u001a\u00020(2\u0006\u00102\u001a\u00020\u0015H\u0002R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\n \u0010*\u0004\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u00120\u0012X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0010*\u0004\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u0010*\u0004\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u0010*\u0004\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u0010*\u0004\u0018\u00010\u00120\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n \u0010*\u0004\u0018\u00010\u001d0\u001dX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n \u0010*\u0004\u0018\u00010\u001f0\u001fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\n \u0010*\u0004\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n \u0010*\u0004\u0018\u00010\u001f0\u001fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\n \u0010*\u0004\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n \u0010*\u0004\u0018\u00010$0$X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006K"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/type/fragment/TypeSelectorFragmentView;", "Lcom/ss/android/lark/create/groupchat/impl/type/fragment/ITypeSelectorContract$IView;", "context", "Landroid/content/Context;", "rootView", "Landroid/view/View;", "dependency", "Lcom/ss/android/lark/create/groupchat/impl/type/fragment/TypeSelectorFragmentView$ViewDependency;", "(Landroid/content/Context;Landroid/view/View;Lcom/ss/android/lark/create/groupchat/impl/type/fragment/TypeSelectorFragmentView$ViewDependency;)V", "getContext", "()Landroid/content/Context;", "delegate", "Lcom/ss/android/lark/create/groupchat/impl/type/fragment/ITypeSelectorContract$IView$Delegate;", "getDependency", "()Lcom/ss/android/lark/create/groupchat/impl/type/fragment/TypeSelectorFragmentView$ViewDependency;", "mGroupTypeSelectLayout", "kotlin.jvm.PlatformType", "mGroupTypeTipTv", "Landroid/widget/TextView;", "mGroupTypeTopLine", "mHasMultiEntity", "", "mInfoTypeLayout", "mInfoTypeTipLine", "mInfoTypeTipView", "mIsCrossWithKa", "mIsExternal", "mIsPublic", "mModeSelector", "Lcom/ss/android/lark/create/groupchat/impl/widget/GroupModeSelector;", "mPrivateCheckedIv", "Landroid/widget/ImageView;", "mPrivateTypeLayout", "mPublicCheckedIv", "mPublicTypeLayout", "mTitleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "getRootView", "()Landroid/view/View;", "create", "", "destroy", "getExampleDrawable", "Landroid/graphics/Bitmap;", "layoutId", "", "go2NextPage", "groupCreateInfo", "Lcom/ss/android/lark/create/groupchat/dto/GroupCreateInfo;", "initView", "isPublic", "isCrossTenant", "isCrossWithKa", "hasMultiEntity", "chatMode", "Lcom/ss/android/lark/create/groupchat/dto/CreateGroupMode;", "onGroupTypeSelectComplete", "setViewDelegate", "viewDelegate", "showCreatePublicGroupDialog", "contentResId", "confirmResId", "showCreateSecretGroupDialog", "callBack", "Lcom/ss/android/lark/create/groupchat/impl/widget/GroupModeSelector$OnStatusChangeListener;", "switchChatUIMode", "mode", "Lcom/ss/android/lark/create/groupchat/impl/type/fragment/TypeSelectorFragmentView$ChatUIMode;", "updateChatUI", "updateGroupType", "updatePublicGroupStatus", "updateTopicGroup", "updateUI", "ChatUIMode", "ViewDependency", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.type.a.f */
public final class TypeSelectorFragmentView implements ITypeSelectorContract.IView {

    /* renamed from: a */
    public final GroupModeSelector f93909a;

    /* renamed from: b */
    public boolean f93910b;

    /* renamed from: c */
    public boolean f93911c;

    /* renamed from: d */
    public boolean f93912d;

    /* renamed from: e */
    private final CommonTitleBar f93913e;

    /* renamed from: f */
    private final View f93914f;

    /* renamed from: g */
    private final View f93915g;

    /* renamed from: h */
    private final TextView f93916h;

    /* renamed from: i */
    private final ImageView f93917i;

    /* renamed from: j */
    private final ImageView f93918j;

    /* renamed from: k */
    private final View f93919k;

    /* renamed from: l */
    private final View f93920l;

    /* renamed from: m */
    private final TextView f93921m;

    /* renamed from: n */
    private final View f93922n;

    /* renamed from: o */
    private final View f93923o;

    /* renamed from: p */
    private boolean f93924p;

    /* renamed from: q */
    private ITypeSelectorContract.IView.Delegate f93925q;

    /* renamed from: r */
    private final Context f93926r;

    /* renamed from: s */
    private final View f93927s;

    /* renamed from: t */
    private final ViewDependency f93928t;

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/type/fragment/TypeSelectorFragmentView$ChatUIMode;", "", "(Ljava/lang/String;I)V", "NORMAL", "NORMAL_NO_TITLE", "ONLY", "DISMISS", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.type.a.f$a */
    public enum ChatUIMode {
        NORMAL,
        NORMAL_NO_TITLE,
        ONLY,
        DISMISS
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/type/fragment/TypeSelectorFragmentView$ViewDependency;", "", "finish", "", "goToNextPage", "groupCreateInfo", "Lcom/ss/android/lark/create/groupchat/dto/GroupCreateInfo;", "openThreadTabShowGuide", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.type.a.f$b */
    public interface ViewDependency {
        /* renamed from: a */
        void mo134239a(GroupCreateInfo groupCreateInfo);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: c */
    public final Context mo134253c() {
        return this.f93926r;
    }

    /* renamed from: d */
    public final View mo134254d() {
        return this.f93927s;
    }

    @Override // com.ss.android.lark.create.groupchat.impl.type.fragment.ITypeSelectorContract.IView
    /* renamed from: a */
    public void mo134242a(boolean z, boolean z2, boolean z3, boolean z4, CreateGroupMode createGroupMode) {
        GroupModeSelector.SelectedStatus selectedStatus;
        Intrinsics.checkParameterIsNotNull(createGroupMode, "chatMode");
        this.f93911c = z2;
        this.f93912d = z3;
        this.f93924p = z4;
        mo134251a(z);
        this.f93913e.setLeftClickListener(new View$OnClickListenerC36402c(this));
        this.f93919k.setOnClickListener(new View$OnClickListenerC36403d(this));
        this.f93920l.setOnClickListener(new View$OnClickListenerC36404e(this));
        this.f93909a.setMOnClickListener(new C36405f(this, z4));
        GroupModeSelector groupModeSelector = this.f93909a;
        int i = C36408g.f93940c[createGroupMode.ordinal()];
        if (i == 1) {
            selectedStatus = GroupModeSelector.SelectedStatus.LEFT_SELECTED;
        } else if (i == 2) {
            selectedStatus = GroupModeSelector.SelectedStatus.RIGHT_SELECTED;
        } else if (i == 3) {
            selectedStatus = GroupModeSelector.SelectedStatus.MIDDLE_SELECTED;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        groupModeSelector.mo134269b(selectedStatus);
        Utils.f93572a.mo133838b(this.f93926r);
    }

    /* renamed from: e */
    private final void m143527e() {
        this.f93909a.mo134267a(GroupModeSelector.SelectedStatus.MIDDLE_SELECTED, 0);
    }

    /* renamed from: b */
    public final void mo134252b() {
        GroupHitPoint.f93889a.mo134219j();
        GroupHitPoint.f93889a.mo134213d();
        if (this.f93909a.getStatus() == GroupModeSelector.SelectedStatus.RIGHT_SELECTED) {
            this.f93909a.mo134269b(GroupModeSelector.SelectedStatus.LEFT_SELECTED);
        }
        mo134251a(true);
    }

    /* renamed from: a */
    public final void mo134247a() {
        CreateGroupMode createGroupMode;
        ITypeSelectorContract.IView.Delegate aVar = this.f93925q;
        if (aVar != null) {
            boolean z = this.f93910b;
            int i = C36408g.f93938a[this.f93909a.getStatus().ordinal()];
            if (i == 1) {
                createGroupMode = CreateGroupMode.CONVERSATION_MODE;
            } else if (i == 2) {
                createGroupMode = CreateGroupMode.TOPIC_MODE;
            } else if (i == 3) {
                createGroupMode = CreateGroupMode.SECRET_MODE;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            aVar.mo134243a(z, createGroupMode);
        }
        GroupHitPoint.f93889a.mo134213d();
    }

    /* renamed from: a */
    public void setViewDelegate(ITypeSelectorContract.IView.Delegate aVar) {
        this.f93925q = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.type.a.f$c */
    static final class View$OnClickListenerC36402c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TypeSelectorFragmentView f93930a;

        View$OnClickListenerC36402c(TypeSelectorFragmentView fVar) {
            this.f93930a = fVar;
        }

        public final void onClick(View view) {
            this.f93930a.mo134247a();
        }
    }

    /* renamed from: c */
    private final void m143526c(boolean z) {
        ChatUIMode aVar = ChatUIMode.NORMAL;
        if (!GroupFGUtils.m142836a()) {
            aVar = ChatUIMode.NORMAL_NO_TITLE;
        }
        m143524a(aVar);
    }

    @Override // com.ss.android.lark.create.groupchat.impl.type.fragment.ITypeSelectorContract.IView
    /* renamed from: a */
    public void mo134241a(GroupCreateInfo groupCreateInfo) {
        Intrinsics.checkParameterIsNotNull(groupCreateInfo, "groupCreateInfo");
        this.f93928t.mo134239a(groupCreateInfo);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.type.a.f$d */
    static final class View$OnClickListenerC36403d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TypeSelectorFragmentView f93931a;

        View$OnClickListenerC36403d(TypeSelectorFragmentView fVar) {
            this.f93931a = fVar;
        }

        public final void onClick(View view) {
            if (this.f93931a.f93910b) {
                GroupHitPoint.f93889a.mo134218i();
                this.f93931a.mo134251a(false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/create/groupchat/impl/type/fragment/TypeSelectorFragmentView$initView$4", "Lcom/ss/android/lark/create/groupchat/impl/widget/GroupModeSelector$OnStatusChangeListener;", "onBeforeChangeStatus", "", UpdateKey.STATUS, "Lcom/ss/android/lark/create/groupchat/impl/widget/GroupModeSelector$SelectedStatus;", "onChange", "", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.type.a.f$f */
    public static final class C36405f implements GroupModeSelector.OnStatusChangeListener {

        /* renamed from: a */
        final /* synthetic */ TypeSelectorFragmentView f93933a;

        /* renamed from: b */
        final /* synthetic */ boolean f93934b;

        @Override // com.ss.android.lark.create.groupchat.impl.widget.GroupModeSelector.OnStatusChangeListener
        /* renamed from: a */
        public boolean mo134258a(GroupModeSelector.SelectedStatus selectedStatus) {
            Intrinsics.checkParameterIsNotNull(selectedStatus, UpdateKey.STATUS);
            if (selectedStatus != GroupModeSelector.SelectedStatus.RIGHT_SELECTED || !this.f93934b) {
                return false;
            }
            this.f93933a.mo134250a(this);
            return true;
        }

        @Override // com.ss.android.lark.create.groupchat.impl.widget.GroupModeSelector.OnStatusChangeListener
        /* renamed from: b */
        public void mo134259b(GroupModeSelector.SelectedStatus selectedStatus) {
            Intrinsics.checkParameterIsNotNull(selectedStatus, UpdateKey.STATUS);
            int i = C36408g.f93939b[selectedStatus.ordinal()];
            if (i == 1) {
                TextView textView = (TextView) this.f93933a.mo134254d().findViewById(R.id.modeTipsTv);
                Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.modeTipsTv");
                textView.setText(UIUtils.getString(this.f93933a.mo134253c(), R.string.Lark_Group_CreateGroup_Mode_Default_Description));
                ((ImageView) this.f93933a.mo134254d().findViewById(R.id.mExample_iv)).setImageBitmap(this.f93933a.mo134246a(R.layout.chat_example_layout));
                GroupHitPoint.f93889a.mo134215f();
            } else if (i == 2) {
                TextView textView2 = (TextView) this.f93933a.mo134254d().findViewById(R.id.modeTipsTv);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.modeTipsTv");
                textView2.setText(UIUtils.getString(this.f93933a.mo134253c(), R.string.Lark_Group_CreateGroup_Mode_Topic_Description));
                ((ImageView) this.f93933a.mo134254d().findViewById(R.id.mExample_iv)).setImageBitmap(this.f93933a.mo134246a(R.layout.thread_chat_layout));
                GroupHitPoint.f93889a.mo134216g();
            } else if (i == 3) {
                TextView textView3 = (TextView) this.f93933a.mo134254d().findViewById(R.id.modeTipsTv);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "rootView.modeTipsTv");
                textView3.setText(UIUtils.getString(this.f93933a.mo134253c(), R.string.Lark_Group_CreateGroup_Mode_Secret_Description));
                ((ImageView) this.f93933a.mo134254d().findViewById(R.id.mExample_iv)).setImageBitmap(this.f93933a.mo134246a(R.layout.secret_chat_layout));
                GroupHitPoint.f93889a.mo134217h();
            }
        }

        C36405f(TypeSelectorFragmentView fVar, boolean z) {
            this.f93933a = fVar;
            this.f93934b = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.type.a.f$e */
    static final class View$OnClickListenerC36404e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TypeSelectorFragmentView f93932a;

        View$OnClickListenerC36404e(TypeSelectorFragmentView fVar) {
            this.f93932a = fVar;
        }

        public final void onClick(View view) {
            if (!this.f93932a.f93910b) {
                if (this.f93932a.f93912d) {
                    this.f93932a.mo134248a(R.string.Lark_Group_SwitchPublicPrivateDialogContentConnectGroup, R.string.Lark_General_Switch);
                } else if (this.f93932a.f93911c) {
                    this.f93932a.mo134248a(R.string.Lark_Chat_Create_Group_Switch_Type_PublicChatAddExternalUser_ErrorAlter, R.string.Lark_Chat_Create_Group_Switch_Type_PublicChatAddExternalUser_ErrorAlter_Confirm);
                } else {
                    this.f93932a.mo134252b();
                }
            }
        }
    }

    /* renamed from: b */
    private final void m143525b(boolean z) {
        this.f93910b = z;
        if (GroupFGUtils.m142836a()) {
            this.f93913e.setTitle(UIHelper.getString(R.string.Lark_Group_CreateGroup_GroupType), true);
            View view = this.f93914f;
            Intrinsics.checkExpressionValueIsNotNull(view, "mGroupTypeSelectLayout");
            view.setVisibility(0);
        } else {
            this.f93913e.setTitle(UIHelper.getString(R.string.Lark_Group_CreateGroup_Mode_Title), true);
            View view2 = this.f93914f;
            Intrinsics.checkExpressionValueIsNotNull(view2, "mGroupTypeSelectLayout");
            view2.setVisibility(8);
            this.f93910b = false;
        }
        if (z) {
            ImageView imageView = this.f93918j;
            Intrinsics.checkExpressionValueIsNotNull(imageView, "mPublicCheckedIv");
            imageView.setVisibility(0);
            ImageView imageView2 = this.f93917i;
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "mPrivateCheckedIv");
            imageView2.setVisibility(4);
            return;
        }
        ImageView imageView3 = this.f93917i;
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "mPrivateCheckedIv");
        imageView3.setVisibility(0);
        ImageView imageView4 = this.f93918j;
        Intrinsics.checkExpressionValueIsNotNull(imageView4, "mPublicCheckedIv");
        imageView4.setVisibility(4);
    }

    /* renamed from: a */
    public final Bitmap mo134246a(int i) {
        LayoutInflater from = LayoutInflater.from(this.f93926r);
        View view = this.f93927s;
        if (view != null) {
            View inflate = from.inflate(i, (ViewGroup) view, false);
            int dimens = UIUtils.getDimens(this.f93926r, R.dimen.example_layout_width);
            int dimens2 = UIUtils.getDimens(this.f93926r, R.dimen.example_layout_height);
            inflate.measure(View.MeasureSpec.makeMeasureSpec(dimens, 1073741824), View.MeasureSpec.makeMeasureSpec(dimens2, 1073741824));
            inflate.layout(0, 0, dimens, dimens2);
            Bitmap createBitmap = Bitmap.createBitmap(dimens, dimens2, Bitmap.Config.ARGB_8888);
            inflate.draw(new Canvas(createBitmap));
            Intrinsics.checkExpressionValueIsNotNull(createBitmap, "bitmap");
            return createBitmap;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: a */
    private final void m143524a(ChatUIMode aVar) {
        int i = C36408g.f93941d[aVar.ordinal()];
        if (i == 1) {
            TextView textView = this.f93916h;
            Intrinsics.checkExpressionValueIsNotNull(textView, "mGroupTypeTipTv");
            textView.setVisibility(0);
            TextView textView2 = this.f93921m;
            Intrinsics.checkExpressionValueIsNotNull(textView2, "mInfoTypeTipView");
            textView2.setVisibility(0);
            View view = this.f93922n;
            Intrinsics.checkExpressionValueIsNotNull(view, "mInfoTypeTipLine");
            view.setVisibility(0);
            View view2 = this.f93923o;
            Intrinsics.checkExpressionValueIsNotNull(view2, "mInfoTypeLayout");
            view2.setVisibility(0);
            TextView textView3 = this.f93921m;
            Intrinsics.checkExpressionValueIsNotNull(textView3, "mInfoTypeTipView");
            textView3.setText(UIUtils.getString(this.f93926r, R.string.Lark_Group_CreateGroup_Mode_Title));
            GroupModeSelector groupModeSelector = this.f93909a;
            Intrinsics.checkExpressionValueIsNotNull(groupModeSelector, "mModeSelector");
            groupModeSelector.setVisibility(0);
            this.f93909a.mo134267a(GroupModeSelector.SelectedStatus.LEFT_SELECTED, 0);
        } else if (i == 2) {
            TextView textView4 = this.f93916h;
            Intrinsics.checkExpressionValueIsNotNull(textView4, "mGroupTypeTipTv");
            textView4.setVisibility(0);
            TextView textView5 = this.f93921m;
            Intrinsics.checkExpressionValueIsNotNull(textView5, "mInfoTypeTipView");
            textView5.setVisibility(8);
            View view3 = this.f93922n;
            Intrinsics.checkExpressionValueIsNotNull(view3, "mInfoTypeTipLine");
            view3.setVisibility(8);
            View view4 = this.f93923o;
            Intrinsics.checkExpressionValueIsNotNull(view4, "mInfoTypeLayout");
            view4.setVisibility(0);
            GroupModeSelector groupModeSelector2 = this.f93909a;
            Intrinsics.checkExpressionValueIsNotNull(groupModeSelector2, "mModeSelector");
            groupModeSelector2.setVisibility(0);
            this.f93909a.mo134267a(GroupModeSelector.SelectedStatus.LEFT_SELECTED, 0);
        } else if (i == 3) {
            TextView textView6 = this.f93916h;
            Intrinsics.checkExpressionValueIsNotNull(textView6, "mGroupTypeTipTv");
            textView6.setVisibility(0);
            TextView textView7 = this.f93921m;
            Intrinsics.checkExpressionValueIsNotNull(textView7, "mInfoTypeTipView");
            textView7.setVisibility(0);
            View view5 = this.f93922n;
            Intrinsics.checkExpressionValueIsNotNull(view5, "mInfoTypeTipLine");
            view5.setVisibility(0);
            View view6 = this.f93923o;
            Intrinsics.checkExpressionValueIsNotNull(view6, "mInfoTypeLayout");
            view6.setVisibility(0);
            TextView textView8 = this.f93921m;
            Intrinsics.checkExpressionValueIsNotNull(textView8, "mInfoTypeTipView");
            textView8.setText(UIUtils.getString(this.f93926r, R.string.Lark_Group_CreateGroupChatMode));
            GroupModeSelector groupModeSelector3 = this.f93909a;
            Intrinsics.checkExpressionValueIsNotNull(groupModeSelector3, "mModeSelector");
            groupModeSelector3.setVisibility(8);
            this.f93909a.mo134267a(GroupModeSelector.SelectedStatus.LEFT_SELECTED, 8);
        } else if (i == 4) {
            View view7 = this.f93915g;
            Intrinsics.checkExpressionValueIsNotNull(view7, "mGroupTypeTopLine");
            view7.setVisibility(0);
            TextView textView9 = this.f93916h;
            Intrinsics.checkExpressionValueIsNotNull(textView9, "mGroupTypeTipTv");
            textView9.setVisibility(8);
            TextView textView10 = this.f93921m;
            Intrinsics.checkExpressionValueIsNotNull(textView10, "mInfoTypeTipView");
            textView10.setVisibility(8);
            View view8 = this.f93922n;
            Intrinsics.checkExpressionValueIsNotNull(view8, "mInfoTypeTipLine");
            view8.setVisibility(8);
            View view9 = this.f93923o;
            Intrinsics.checkExpressionValueIsNotNull(view9, "mInfoTypeLayout");
            view9.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo134250a(GroupModeSelector.OnStatusChangeListener bVar) {
        new C25639g(this.f93926r).mo89254m(R.string.Lark_Group_SecretChatGroupInviteDisabled).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_right).mo89269b(R.string.Lark_Legacy_Confirm).mo89267a(new DialogInterface$OnClickListenerC36407h(this, bVar))).mo89239c();
    }

    /* renamed from: a */
    public final void mo134251a(boolean z) {
        m143525b(z);
        if (!GroupCreateFgUtils.f93898a.mo134236a() || z) {
            this.f93909a.mo134267a(GroupModeSelector.SelectedStatus.RIGHT_SELECTED, 8);
        } else {
            this.f93909a.mo134267a(GroupModeSelector.SelectedStatus.RIGHT_SELECTED, 0);
        }
        m143527e();
        m143526c(z);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.type.a.f$g */
    public static final class DialogInterface$OnClickListenerC36406g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TypeSelectorFragmentView f93935a;

        DialogInterface$OnClickListenerC36406g(TypeSelectorFragmentView fVar) {
            this.f93935a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f93935a.mo134252b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.type.a.f$h */
    public static final class DialogInterface$OnClickListenerC36407h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TypeSelectorFragmentView f93936a;

        /* renamed from: b */
        final /* synthetic */ GroupModeSelector.OnStatusChangeListener f93937b;

        DialogInterface$OnClickListenerC36407h(TypeSelectorFragmentView fVar, GroupModeSelector.OnStatusChangeListener bVar) {
            this.f93936a = fVar;
            this.f93937b = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f93936a.f93909a.mo134269b(GroupModeSelector.SelectedStatus.RIGHT_SELECTED);
            GroupModeSelector.OnStatusChangeListener bVar = this.f93937b;
            if (bVar != null) {
                bVar.mo134259b(GroupModeSelector.SelectedStatus.RIGHT_SELECTED);
            }
        }
    }

    /* renamed from: a */
    public final void mo134248a(int i, int i2) {
        new C25639g(this.f93926r).mo89254m(i).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Chat_Create_Group_Switch_Type_PublicChatAddExternalUser_ErrorAlter_Cancel, (DialogInterface.OnClickListener) null).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_right).mo89269b(i2).mo89267a(new DialogInterface$OnClickListenerC36406g(this))).mo89239c();
    }

    public TypeSelectorFragmentView(Context context, View view, ViewDependency bVar) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        this.f93926r = context;
        this.f93927s = view;
        this.f93928t = bVar;
        this.f93909a = (GroupModeSelector) view.findViewById(R.id.modeSelector);
        this.f93913e = (CommonTitleBar) view.findViewById(R.id.titlebar);
        this.f93914f = view.findViewById(R.id.group_type_select_layout);
        this.f93915g = view.findViewById(R.id.group_type_top_line);
        this.f93916h = (TextView) view.findViewById(R.id.group_type_tip_tv);
        this.f93917i = (ImageView) view.findViewById(R.id.privateCheckedIv);
        this.f93918j = (ImageView) view.findViewById(R.id.publicCheckedIv);
        this.f93919k = view.findViewById(R.id.group_type_private_layout);
        this.f93920l = view.findViewById(R.id.group_type_public_layout);
        this.f93921m = (TextView) view.findViewById(R.id.info_type_tip_tv);
        this.f93922n = view.findViewById(R.id.info_type_tip_divider_line);
        this.f93923o = view.findViewById(R.id.info_type_layout);
    }
}
