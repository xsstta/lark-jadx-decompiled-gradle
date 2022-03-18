package com.ss.android.lark.chatsetting.impl.post;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.C1556v;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.ui.flowlayout.TagFlowLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.impl.post.IPostTypeSettingContract;
import com.ss.android.lark.chatsetting.impl.post.PostWhiteListAdapter;
import com.ss.android.lark.chatsetting.impl.statistics.setting.SettingHitPoint;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0016\u0018\u0000 ?2\u00020\u0001:\u0002?@B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020$H\u0016J\b\u0010'\u001a\u00020$H\u0002J(\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020*2\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020*0,j\b\u0012\u0004\u0012\u00020*`-H\u0016J \u0010.\u001a\u00020$2\u0006\u0010/\u001a\u0002002\u000e\u0010+\u001a\n\u0012\u0004\u0012\u000202\u0018\u000101H\u0016J\u0010\u00103\u001a\u00020$2\u0006\u0010/\u001a\u000200H\u0002J\u0018\u00104\u001a\u00020$2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u000202\u0018\u000101H\u0002J\b\u00105\u001a\u00020$H\u0002J\u0010\u00106\u001a\u00020$2\u0006\u00107\u001a\u00020\u001cH\u0016J\u0012\u00108\u001a\u00020$2\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\"\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020=2\u0006\u0010)\u001a\u00020*2\b\u0010>\u001a\u0004\u0018\u00010*H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0003X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/post/PostTypeSettingView;", "Lcom/ss/android/lark/chatsetting/impl/post/IPostTypeSettingContract$IView;", "rootView", "Landroid/view/View;", "dependency", "Lcom/ss/android/lark/chatsetting/impl/post/PostTypeSettingView$ViewDependency;", "(Landroid/view/View;Lcom/ss/android/lark/chatsetting/impl/post/PostTypeSettingView$ViewDependency;)V", "adapter", "Lcom/ss/android/lark/chatsetting/impl/post/PostWhiteListAdapter;", "adminCheckBox", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "adminLayout", "Landroid/view/ViewGroup;", "adminText", "Landroid/widget/TextView;", "anyoneCheckBox", "anyoneLayout", "anyoneText", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "itemClickListener", "com/ss/android/lark/chatsetting/impl/post/PostTypeSettingView$itemClickListener$1", "Lcom/ss/android/lark/chatsetting/impl/post/PostTypeSettingView$itemClickListener$1;", "root", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "viewDelegate", "Lcom/ss/android/lark/chatsetting/impl/post/IPostTypeSettingContract$IView$Delegate;", "whiteListCheckBox", "whiteListDivider", "whiteListLayout", "whiteListMember", "Lcom/larksuite/framework/ui/flowlayout/TagFlowLayout;", "whitePostDesc", "closePostSetting", "", "create", "destroy", "initListeners", "openEditWhiteList", "chatId", "", "whiteList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "refreshPostType", "postType", "Lcom/ss/android/lark/chat/entity/chat/Chat$PostType;", "", "Lcom/ss/android/lark/chatsetting/impl/post/PostWhiteListViewData;", "refreshState", "refreshWhiteList", "setParamsForDesktop", "setViewDelegate", "delegate", "showError", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "showProfile", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "chatName", "Companion", "ViewDependency", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.post.f */
public final class PostTypeSettingView implements IPostTypeSettingContract.IView {

    /* renamed from: c */
    public static final Companion f90472c = new Companion(null);

    /* renamed from: a */
    public IPostTypeSettingContract.IView.Delegate f90473a;

    /* renamed from: b */
    public final ViewDependency f90474b;

    /* renamed from: d */
    private final Context f90475d;

    /* renamed from: e */
    private ViewGroup f90476e;

    /* renamed from: f */
    private ViewGroup f90477f;

    /* renamed from: g */
    private ViewGroup f90478g;

    /* renamed from: h */
    private ViewGroup f90479h;

    /* renamed from: i */
    private TextView f90480i;

    /* renamed from: j */
    private TextView f90481j;

    /* renamed from: k */
    private UDCheckBox f90482k;

    /* renamed from: l */
    private UDCheckBox f90483l;

    /* renamed from: m */
    private UDCheckBox f90484m;

    /* renamed from: n */
    private TagFlowLayout f90485n;

    /* renamed from: o */
    private View f90486o;

    /* renamed from: p */
    private CommonTitleBar f90487p;

    /* renamed from: q */
    private TextView f90488q;

    /* renamed from: r */
    private PostWhiteListAdapter f90489r;

    /* renamed from: s */
    private final C35070h f90490s = new C35070h(this);

    /* renamed from: t */
    private final View f90491t;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J(\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00060\bj\b\u0012\u0004\u0012\u00020\u0006`\tH&J\"\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0006H&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/post/PostTypeSettingView$ViewDependency;", "", "closeCurrent", "", "openEditWhiteListPage", "chatId", "", "whiteList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "openProfile", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "chatName", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.post.f$b */
    public interface ViewDependency {
        /* renamed from: a */
        void mo129146a();

        /* renamed from: a */
        void mo129147a(Chatter chatter, String str, String str2);

        /* renamed from: a */
        void mo129148a(String str, ArrayList<String> arrayList);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/post/PostTypeSettingView$Companion;", "", "()V", "TAG", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.post.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.post.IPostTypeSettingContract.IView
    /* renamed from: a */
    public void mo129134a() {
        this.f90474b.mo129146a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chatsetting/impl/post/PostTypeSettingView$itemClickListener$1", "Lcom/ss/android/lark/chatsetting/impl/post/PostWhiteListAdapter$OnItemClickListener;", "onAvatarClick", "", BottomDialog.f17198f, "", "onEditWhiteListClick", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.post.f$h */
    public static final class C35070h implements PostWhiteListAdapter.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ PostTypeSettingView f90499a;

        @Override // com.ss.android.lark.chatsetting.impl.post.PostWhiteListAdapter.OnItemClickListener
        /* renamed from: a */
        public void mo129167a() {
            PostTypeSettingView.m136595a(this.f90499a).mo129139a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35070h(PostTypeSettingView fVar) {
            this.f90499a = fVar;
        }

        @Override // com.ss.android.lark.chatsetting.impl.post.PostWhiteListAdapter.OnItemClickListener
        /* renamed from: a */
        public void mo129168a(String str) {
            Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
            PostTypeSettingView.m136595a(this.f90499a).mo129141a(str);
        }
    }

    /* renamed from: b */
    private final void m136598b() {
        if (DesktopUtil.m144307b()) {
            CommonTitleBar commonTitleBar = this.f90487p;
            if (commonTitleBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleBar");
            }
            commonTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
            TextView[] textViewArr = new TextView[1];
            TextView textView = this.f90488q;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("whitePostDesc");
            }
            textViewArr[0] = textView;
            DesktopUtil.m144299a(textViewArr);
        }
    }

    /* renamed from: c */
    private final void m136599c() {
        ViewGroup viewGroup = this.f90477f;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("anyoneLayout");
        }
        viewGroup.setOnClickListener(new View$OnClickListenerC35066d(this));
        ViewGroup viewGroup2 = this.f90478g;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adminLayout");
        }
        viewGroup2.setOnClickListener(new View$OnClickListenerC35067e(this));
        ViewGroup viewGroup3 = this.f90479h;
        if (viewGroup3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("whiteListLayout");
        }
        viewGroup3.setOnClickListener(new View$OnClickListenerC35068f(this));
        CommonTitleBar commonTitleBar = this.f90487p;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar.setLeftClickListener(new View$OnClickListenerC35069g(this));
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        View findViewById = this.f90491t.findViewById(R.id.post_setting_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.post_setting_layout)");
        this.f90476e = (ViewGroup) findViewById;
        View findViewById2 = this.f90491t.findViewById(R.id.post_anyone_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.post_anyone_layout)");
        this.f90477f = (ViewGroup) findViewById2;
        ViewGroup viewGroup = this.f90476e;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("root");
        }
        View findViewById3 = viewGroup.findViewById(R.id.post_anyone_text);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "root.findViewById(R.id.post_anyone_text)");
        this.f90480i = (TextView) findViewById3;
        ViewGroup viewGroup2 = this.f90476e;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("root");
        }
        View findViewById4 = viewGroup2.findViewById(R.id.post_anyone_cb);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "root.findViewById(R.id.post_anyone_cb)");
        this.f90482k = (UDCheckBox) findViewById4;
        View findViewById5 = this.f90491t.findViewById(R.id.post_admin_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "rootView.findViewById(R.id.post_admin_layout)");
        this.f90478g = (ViewGroup) findViewById5;
        ViewGroup viewGroup3 = this.f90476e;
        if (viewGroup3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("root");
        }
        View findViewById6 = viewGroup3.findViewById(R.id.post_admin_text);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "root.findViewById(R.id.post_admin_text)");
        this.f90481j = (TextView) findViewById6;
        ViewGroup viewGroup4 = this.f90476e;
        if (viewGroup4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("root");
        }
        View findViewById7 = viewGroup4.findViewById(R.id.post_admin_cb);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "root.findViewById(R.id.post_admin_cb)");
        this.f90483l = (UDCheckBox) findViewById7;
        View findViewById8 = this.f90491t.findViewById(R.id.post_white_list_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "rootView.findViewById(R.id.post_white_list_layout)");
        this.f90479h = (ViewGroup) findViewById8;
        View findViewById9 = this.f90491t.findViewById(R.id.post_white_list_cb);
        Intrinsics.checkExpressionValueIsNotNull(findViewById9, "rootView.findViewById(R.id.post_white_list_cb)");
        this.f90484m = (UDCheckBox) findViewById9;
        View findViewById10 = this.f90491t.findViewById(R.id.post_setting_white_list_rv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById10, "rootView.findViewById(R.…st_setting_white_list_rv)");
        this.f90485n = (TagFlowLayout) findViewById10;
        View findViewById11 = this.f90491t.findViewById(R.id.post_white_list_divider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById11, "rootView.findViewById(R.….post_white_list_divider)");
        this.f90486o = findViewById11;
        View findViewById12 = this.f90491t.findViewById(R.id.title_bar);
        Intrinsics.checkExpressionValueIsNotNull(findViewById12, "rootView.findViewById(R.id.title_bar)");
        this.f90487p = (CommonTitleBar) findViewById12;
        View findViewById13 = this.f90491t.findViewById(R.id.post_setting_white_list);
        Intrinsics.checkExpressionValueIsNotNull(findViewById13, "rootView.findViewById(R.….post_setting_white_list)");
        this.f90488q = (TextView) findViewById13;
        IPostTypeSettingContract.IView.Delegate aVar = this.f90473a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewDelegate");
        }
        if (aVar.mo129143c()) {
            CommonTitleBar commonTitleBar = this.f90487p;
            if (commonTitleBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleBar");
            }
            commonTitleBar.setTitle(R.string.Lark_Groups_Settings_MsgRestriction_Title);
            TextView textView = this.f90480i;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("anyoneText");
            }
            textView.setText(UIHelper.getString(R.string.Lark_Group_Topic_GroupSettings_MsgRestriction_Default));
            TextView textView2 = this.f90481j;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adminText");
            }
            textView2.setText(UIHelper.getString(R.string.Lark_Legacy_OnlyGroupOwnerGroupAdminNewTopics));
            TextView textView3 = this.f90488q;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("whitePostDesc");
            }
            textView3.setText(C57582a.m223604a(this.f90491t.getContext(), (int) R.string.Lark_Group_Topic_GroupSettings_MsgRestriction_SelectedMember));
        } else {
            CommonTitleBar commonTitleBar2 = this.f90487p;
            if (commonTitleBar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleBar");
            }
            commonTitleBar2.setTitle(R.string.Lark_Group_GroupSettings_MsgRestriction_Title);
            TextView textView4 = this.f90480i;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("anyoneText");
            }
            textView4.setText(C57582a.m223604a(this.f90491t.getContext(), (int) R.string.Lark_Group_GroupSettings_MsgRestriction_Default));
            TextView textView5 = this.f90481j;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adminText");
            }
            textView5.setText(UIHelper.getString(R.string.Lark_Legacy_OnlyGOGASendMsg));
            TextView textView6 = this.f90488q;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("whitePostDesc");
            }
            textView6.setText(C57582a.m223604a(this.f90491t.getContext(), (int) R.string.Lark_Group_GroupSettings_MsgRestriction_SelectedMember));
        }
        CommonTitleBar commonTitleBar3 = this.f90487p;
        if (commonTitleBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar3.setLeftTextOnly(CommonTitleBarConstants.Lark_Legacy_Cancel);
        commonTitleBar3.addAction(new C35065c(UIHelper.getString(R.string.Lark_Legacy_Confirm), R.color.function_info_500, this));
        m136599c();
        m136596a(Chat.PostType.UNKNOWN_POST_TYPE);
        m136598b();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.post.f$g */
    public static final class View$OnClickListenerC35069g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PostTypeSettingView f90498a;

        View$OnClickListenerC35069g(PostTypeSettingView fVar) {
            this.f90498a = fVar;
        }

        public final void onClick(View view) {
            this.f90498a.f90474b.mo129146a();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IPostTypeSettingContract.IView.Delegate m136595a(PostTypeSettingView fVar) {
        IPostTypeSettingContract.IView.Delegate aVar = fVar.f90473a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewDelegate");
        }
        return aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/chatsetting/impl/post/PostTypeSettingView$create$1$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "LENGTH", "", "getLENGTH", "()J", "mLastClickTime", "performAction", "", "view", "Landroid/view/View;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.post.f$c */
    public static final class C35065c extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ PostTypeSettingView f90492a;

        /* renamed from: b */
        private long f90493b;

        /* renamed from: c */
        private final long f90494c = 1000;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f90493b = uptimeMillis;
            if (uptimeMillis - this.f90493b < this.f90494c) {
                Log.m165389i("PostTypeSettingView", "elapsedTime is short than " + this.f90494c + " ms");
                return;
            }
            PostTypeSettingView.m136595a(this.f90492a).mo129142b();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35065c(String str, int i, PostTypeSettingView fVar) {
            super(str, i);
            this.f90492a = fVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.post.f$d */
    public static final class View$OnClickListenerC35066d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PostTypeSettingView f90495a;

        View$OnClickListenerC35066d(PostTypeSettingView fVar) {
            this.f90495a = fVar;
        }

        public final void onClick(View view) {
            PostTypeSettingView.m136595a(this.f90495a).mo129140a(Chat.PostType.ANYONE);
            if (PostTypeSettingView.m136595a(this.f90495a).mo129143c()) {
                SettingHitPoint.f90520a.mo129271a(PostTypeSettingView.m136595a(this.f90495a).mo129144d(), "anyone", "group_topic");
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.post.f$e */
    public static final class View$OnClickListenerC35067e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PostTypeSettingView f90496a;

        View$OnClickListenerC35067e(PostTypeSettingView fVar) {
            this.f90496a = fVar;
        }

        public final void onClick(View view) {
            PostTypeSettingView.m136595a(this.f90496a).mo129140a(Chat.PostType.ONLY_ADMIN);
            if (PostTypeSettingView.m136595a(this.f90496a).mo129143c()) {
                SettingHitPoint.f90520a.mo129271a(PostTypeSettingView.m136595a(this.f90496a).mo129144d(), "only_admin", "group_topic");
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.post.f$f */
    public static final class View$OnClickListenerC35068f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PostTypeSettingView f90497a;

        View$OnClickListenerC35068f(PostTypeSettingView fVar) {
            this.f90497a = fVar;
        }

        public final void onClick(View view) {
            PostTypeSettingView.m136595a(this.f90497a).mo129140a(Chat.PostType.WHITE_LIST);
            if (PostTypeSettingView.m136595a(this.f90497a).mo129143c()) {
                SettingHitPoint.f90520a.mo129271a(PostTypeSettingView.m136595a(this.f90497a).mo129144d(), "only_certain", "group_topic");
            }
        }
    }

    /* renamed from: a */
    private final void m136597a(List<PostWhiteListViewData> list) {
        if (list != null) {
            Context context = this.f90475d;
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            this.f90489r = new PostWhiteListAdapter(context, this.f90490s, list);
            TagFlowLayout tagFlowLayout = this.f90485n;
            if (tagFlowLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("whiteListMember");
            }
            tagFlowLayout.setAdapter(this.f90489r);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.post.IPostTypeSettingContract.IView
    /* renamed from: a */
    public void mo129135a(ErrorResult errorResult) {
        if (errorResult == null || TextUtils.isEmpty(errorResult.getDisplayMsg())) {
            Context context = this.f90491t.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
            UDToast.show(context, (int) R.string.Lark_Legacy_ErrorMessageTip);
            return;
        }
        Context context2 = this.f90491t.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "rootView.context");
        String displayMsg = errorResult.getDisplayMsg();
        if (displayMsg == null) {
            displayMsg = "";
        }
        UDToast.show(context2, displayMsg);
    }

    /* renamed from: a */
    private final void m136596a(Chat.PostType postType) {
        boolean z;
        boolean z2;
        ViewGroup viewGroup = this.f90476e;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("root");
        }
        C1556v.m7130a(viewGroup);
        UDCheckBox uDCheckBox = this.f90482k;
        if (uDCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("anyoneCheckBox");
        }
        if (postType == Chat.PostType.ANYONE) {
            z = true;
        } else {
            z = false;
        }
        uDCheckBox.setChecked(z);
        UDCheckBox uDCheckBox2 = this.f90483l;
        if (uDCheckBox2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adminCheckBox");
        }
        if (postType == Chat.PostType.ONLY_ADMIN) {
            z2 = true;
        } else {
            z2 = false;
        }
        uDCheckBox2.setChecked(z2);
        if (postType == Chat.PostType.WHITE_LIST) {
            UDCheckBox uDCheckBox3 = this.f90484m;
            if (uDCheckBox3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("whiteListCheckBox");
            }
            uDCheckBox3.setChecked(true);
            TagFlowLayout tagFlowLayout = this.f90485n;
            if (tagFlowLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("whiteListMember");
            }
            tagFlowLayout.setVisibility(0);
            View view = this.f90486o;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("whiteListDivider");
            }
            view.setVisibility(0);
            if (this.f90489r == null) {
                Context context = this.f90491t.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
                this.f90489r = new PostWhiteListAdapter(context, this.f90490s, CollectionsKt.emptyList());
                TagFlowLayout tagFlowLayout2 = this.f90485n;
                if (tagFlowLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("whiteListMember");
                }
                tagFlowLayout2.setAdapter(this.f90489r);
            }
        } else {
            UDCheckBox uDCheckBox4 = this.f90484m;
            if (uDCheckBox4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("whiteListCheckBox");
            }
            uDCheckBox4.setChecked(false);
            TagFlowLayout tagFlowLayout3 = this.f90485n;
            if (tagFlowLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("whiteListMember");
            }
            Context context2 = this.f90491t.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "rootView.context");
            tagFlowLayout3.setAdapter(new PostWhiteListAdapter(context2, this.f90490s, CollectionsKt.emptyList()));
            TagFlowLayout tagFlowLayout4 = this.f90485n;
            if (tagFlowLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("whiteListMember");
            }
            tagFlowLayout4.setVisibility(8);
            View view2 = this.f90486o;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("whiteListDivider");
            }
            view2.setVisibility(8);
        }
        ViewGroup viewGroup2 = this.f90476e;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("root");
        }
        C1556v.m7132b(viewGroup2);
    }

    /* renamed from: a */
    public void setViewDelegate(IPostTypeSettingContract.IView.Delegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "delegate");
        this.f90473a = aVar;
    }

    public PostTypeSettingView(View view, ViewDependency bVar) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        this.f90491t = view;
        this.f90474b = bVar;
        this.f90475d = view.getContext();
    }

    @Override // com.ss.android.lark.chatsetting.impl.post.IPostTypeSettingContract.IView
    /* renamed from: a */
    public void mo129136a(Chat.PostType postType, List<PostWhiteListViewData> list) {
        Intrinsics.checkParameterIsNotNull(postType, "postType");
        m136596a(postType);
        if (postType == Chat.PostType.WHITE_LIST) {
            m136597a(list);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.post.IPostTypeSettingContract.IView
    /* renamed from: a */
    public void mo129138a(String str, ArrayList<String> arrayList) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(arrayList, "whiteList");
        this.f90474b.mo129148a(str, arrayList);
    }

    @Override // com.ss.android.lark.chatsetting.impl.post.IPostTypeSettingContract.IView
    /* renamed from: a */
    public void mo129137a(Chatter chatter, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(chatter, "chatter");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.f90474b.mo129147a(chatter, str, str2);
    }
}
