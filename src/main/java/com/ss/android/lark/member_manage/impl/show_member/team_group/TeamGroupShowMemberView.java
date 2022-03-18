package com.ss.android.lark.member_manage.impl.show_member.team_group;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.larksuite.component.ui.button.LKUIButton;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.impl.base.adapter.SelectPreviewAdapter;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.show_member.team_group.IBaseFragment;
import com.ss.android.lark.member_manage.impl.show_member.team_group.ITeamGroupShowMemberContract;
import com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.AllMemberFragment;
import com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.NonTeamMemberFragment;
import com.ss.android.lark.member_manage.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.p2932c.C58339d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.lucode.hackware.magicindicator.C69634c;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.C69619a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3483b.C69625a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69627a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\"\u0018\u0000 L2\u00020\u0001:\u0002LMB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\tH\u0016J\b\u0010)\u001a\u00020'H\u0016J\b\u0010*\u001a\u00020'H\u0016J\b\u0010+\u001a\u00020'H\u0002J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020'H\u0002J\b\u00101\u001a\u00020'H\u0002J\b\u00102\u001a\u00020'H\u0002J\b\u00103\u001a\u00020'H\u0002J\b\u00104\u001a\u00020'H\u0002J\b\u00105\u001a\u00020'H\u0002J\b\u00106\u001a\u00020'H\u0002J\u0010\u00107\u001a\u00020'2\u0006\u00108\u001a\u00020\u000fH\u0002J\"\u00109\u001a\u00020'2\u0006\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020\t2\b\u0010<\u001a\u0004\u0018\u00010/H\u0002J\b\u0010=\u001a\u00020'H\u0002J\b\u0010>\u001a\u00020'H\u0016J\u0010\u0010?\u001a\u00020'2\u0006\u00108\u001a\u00020\u000fH\u0016J\u0016\u0010@\u001a\u00020'2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020/0BH\u0016J\u0012\u0010C\u001a\u00020'2\b\u0010D\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010E\u001a\u00020'2\u0006\u00108\u001a\u00020\u000fH\u0016J\u0016\u0010F\u001a\u00020'2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020G0BH\u0002J\u0010\u0010H\u001a\u00020'2\u0006\u0010I\u001a\u00020JH\u0002J\u0016\u0010K\u001a\u00020'2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020G0BH\u0016R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0010\u0010!\u001a\u00020\"X\u0004¢\u0006\u0004\n\u0002\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberView;", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/ITeamGroupShowMemberContract$ITeamGroupShowMemberView;", "mContext", "Landroid/content/Context;", "mRootView", "Landroid/view/View;", "mDependency", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberView$Dependency;", "mIsThread", "", "mIsRemove", "(Landroid/content/Context;Landroid/view/View;Lcom/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberView$Dependency;ZZ)V", "mAdapter", "Lcom/ss/android/lark/member_manage/impl/base/adapter/SelectPreviewAdapter;", "mChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getMContext", "()Landroid/content/Context;", "getMDependency", "()Lcom/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberView$Dependency;", "mFragmentList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/IBaseFragment;", "Lkotlin/collections/ArrayList;", "mFragmentPagerAdapter", "Landroidx/fragment/app/FragmentPagerAdapter;", "getMIsRemove", "()Z", "mIsSelectable", "getMIsThread", "mRightButtonView", "getMRootView", "()Landroid/view/View;", "mSearchEditTextWatcher", "com/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberView$mSearchEditTextWatcher$1", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberView$mSearchEditTextWatcher$1;", "mViewDelegate", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/ITeamGroupShowMemberContract$ITeamGroupShowMemberView$ITeamGroupShowMemberDelegate;", "changeViewSelectableStatus", "", "isSelectable", "create", "destroy", "generateDialog", "getItemClickListener", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/IBaseFragment$ItemClickListener;", "className", "", "initConfirmBtn", "initRecyclerView", "initReduceTitle", "initRightButton", "initSearch", "initShowMemTitle", "initTitle", "initViewPager", "chat", "notifyItemChange", "id", "isSelected", "fragmentName", "onAddActionClicked", "reloadFirstPageMembers", "reloadTitle", "removeItems", "items", "", "setViewDelegate", "viewDelegateI", "showInitData", "updateAvatarRecycleView", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "updateCount", "count", "", "updateView", "Companion", "Dependency", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.e */
public final class TeamGroupShowMemberView implements ITeamGroupShowMemberContract.ITeamGroupShowMemberView {

    /* renamed from: d */
    public static final Companion f114506d = new Companion(null);

    /* renamed from: a */
    public final ArrayList<IBaseFragment> f114507a = new ArrayList<>();

    /* renamed from: b */
    public ITeamGroupShowMemberContract.ITeamGroupShowMemberView.ITeamGroupShowMemberDelegate f114508b;

    /* renamed from: c */
    public Chat f114509c;

    /* renamed from: e */
    private FragmentPagerAdapter f114510e;

    /* renamed from: f */
    private boolean f114511f;

    /* renamed from: g */
    private View f114512g;

    /* renamed from: h */
    private final SelectPreviewAdapter f114513h = new SelectPreviewAdapter();

    /* renamed from: i */
    private final C45255p f114514i = new C45255p(this);

    /* renamed from: j */
    private final Context f114515j;

    /* renamed from: k */
    private final View f114516k;

    /* renamed from: l */
    private final Dependency f114517l;

    /* renamed from: m */
    private final boolean f114518m;

    /* renamed from: n */
    private final boolean f114519n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberView$Dependency;", "", "addGroupMemberForResult", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isEdu", "", ShareHitPoint.f121868c, "", "finishActivity", "getFragmentManager", "Landroidx/fragment/app/FragmentManager;", "goGroupShareFromAddContact", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.e$b */
    public interface Dependency {
        /* renamed from: a */
        void mo159829a();

        /* renamed from: a */
        void mo159830a(Chat chat, String str);

        /* renamed from: a */
        void mo159831a(Chat chat, boolean z, String str);

        /* renamed from: b */
        FragmentManager mo159832b();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberView$Companion;", "", "()V", "INDICATOR_HEIGHT", "", "INDICATOR_TITLE_TEXT_SIZE", "KEY_SOURCE_MORE", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: j */
    private final void m179582j() {
        m179583k();
    }

    /* renamed from: d */
    public final Context mo159871d() {
        return this.f114515j;
    }

    /* renamed from: e */
    public final View mo159872e() {
        return this.f114516k;
    }

    /* renamed from: f */
    public final Dependency mo159873f() {
        return this.f114517l;
    }

    /* renamed from: g */
    public final boolean mo159874g() {
        return this.f114519n;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.e$c */
    public static final class C45241c implements C58339d.AbstractC58343b {

        /* renamed from: a */
        final /* synthetic */ TeamGroupShowMemberView f114520a;

        C45241c(TeamGroupShowMemberView eVar) {
            this.f114520a = eVar;
        }

        @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
        public final void onMenuItemClick() {
            this.f114520a.mo159869b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberView$initViewPager$1", "Landroidx/fragment/app/FragmentPagerAdapter;", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "position", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.e$m */
    public static final class C45251m extends FragmentPagerAdapter {

        /* renamed from: a */
        final /* synthetic */ TeamGroupShowMemberView f114531a;

        /* renamed from: b */
        final /* synthetic */ FragmentManager f114532b;

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f114531a.f114507a.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            return this.f114531a.f114507a.get(i).mo159813a();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45251m(TeamGroupShowMemberView eVar, FragmentManager fragmentManager, FragmentManager fragmentManager2) {
            super(fragmentManager2);
            this.f114531a = eVar;
            this.f114532b = fragmentManager;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberView$initViewPager$commonNavigatorAdapter$1", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/CommonNavigatorAdapter;", "getCount", "", "getIndicator", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/IPagerIndicator;", "context", "Landroid/content/Context;", "getTitleView", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/IPagerTitleView;", "i", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.e$o */
    public static final class C45253o extends AbstractC69621a {

        /* renamed from: a */
        final /* synthetic */ TeamGroupShowMemberView f114534a;

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public int mo16055a() {
            return this.f114534a.f114507a.size();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45253o(TeamGroupShowMemberView eVar) {
            this.f114534a = eVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.e$o$a */
        static final class View$OnClickListenerC45254a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C45253o f114535a;

            /* renamed from: b */
            final /* synthetic */ int f114536b;

            View$OnClickListenerC45254a(C45253o oVar, int i) {
                this.f114535a = oVar;
                this.f114536b = i;
            }

            public final void onClick(View view) {
                ViewPager viewPager = (ViewPager) this.f114535a.f114534a.mo159872e().findViewById(R.id.mGroupVp);
                Intrinsics.checkExpressionValueIsNotNull(viewPager, "mRootView.mGroupVp");
                viewPager.setCurrentItem(this.f114536b);
            }
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69623c mo16056a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            C69625a aVar = new C69625a(context);
            aVar.setColors(Integer.valueOf(UIUtils.getColor(this.f114534a.mo159871d(), R.color.primary_pri_500)));
            aVar.setMode(0);
            aVar.setLineHeight((float) UIHelper.dp2px(4.0f));
            aVar.setRoundRadius((float) UIHelper.dp2px(2.0f));
            aVar.setYOffset(-((float) UIHelper.dp2px(2.0f)));
            return aVar;
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69624d mo16057a(Context context, int i) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            C69627a aVar = new C69627a(context);
            aVar.setTextSize(14.0f);
            aVar.setNormalColor(UIUtils.getColor(this.f114534a.mo159871d(), R.color.text_title));
            aVar.setSelectedColor(UIUtils.getColor(this.f114534a.mo159871d(), R.color.function_info_500));
            aVar.setOnClickListener(new View$OnClickListenerC45254a(this, i));
            aVar.setText(UIUtils.getString(this.f114534a.mo159871d(), this.f114534a.f114507a.get(i).mo159818b()));
            return aVar;
        }
    }

    /* renamed from: h */
    private final void m179580h() {
        ((LKUIButton) this.f114516k.findViewById(R.id.mConfirmBtn)).setOnClickListener(new View$OnClickListenerC45243e(this));
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.ITeamGroupShowMemberContract.ITeamGroupShowMemberView
    /* renamed from: a */
    public void mo159847a() {
        Iterator<IBaseFragment> it = this.f114507a.iterator();
        while (it.hasNext()) {
            it.next().mo159819c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.e$d */
    public static final class C45242d implements C58339d.AbstractC58343b {

        /* renamed from: a */
        final /* synthetic */ TeamGroupShowMemberView f114521a;

        C45242d(TeamGroupShowMemberView eVar) {
            this.f114521a = eVar;
        }

        @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
        public final void onMenuItemClick() {
            String str;
            IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
            Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
            IGroupMemberManageModuleDependency.AbstractC44880c chatSettingDependency = a.getChatSettingDependency();
            Chat chat = this.f114521a.f114509c;
            if (chat == null || (str = chat.getId()) == null) {
                str = "";
            }
            chatSettingDependency.mo143813a(str, "list_more_mobile");
            ITeamGroupShowMemberContract.ITeamGroupShowMemberView.ITeamGroupShowMemberDelegate aVar = this.f114521a.f114508b;
            if (aVar != null) {
                aVar.mo159853a();
            }
        }
    }

    /* renamed from: i */
    private final void m179581i() {
        RecyclerView recyclerView = (RecyclerView) this.f114516k.findViewById(R.id.mHorizontalAvatarRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRootView.mHorizontalAvatarRecycleView");
        recyclerView.setAdapter(this.f114513h);
        TeamGroupShowMemberView$initRecyclerView$searchLayoutManager$1 teamGroupShowMemberView$initRecyclerView$searchLayoutManager$1 = new TeamGroupShowMemberView$initRecyclerView$searchLayoutManager$1(this, this.f114515j, 0, false);
        RecyclerView recyclerView2 = (RecyclerView) this.f114516k.findViewById(R.id.mHorizontalAvatarRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "mRootView.mHorizontalAvatarRecycleView");
        recyclerView2.setLayoutManager(teamGroupShowMemberView$initRecyclerView$searchLayoutManager$1);
        this.f114513h.mo159338a(new C45244f(this));
    }

    /* renamed from: k */
    private final void m179583k() {
        int i;
        if (this.f114518m) {
            i = R.string.Lark_Groups_member;
        } else {
            i = R.string.Lark_Legacy_GroupShowMemberTitle;
        }
        ((CommonTitleBar) this.f114516k.findViewById(R.id.mTitleBar)).setTitle(UIHelper.getString(i));
        ((CommonTitleBar) this.f114516k.findViewById(R.id.mTitleBar)).setLeftClickListener(new View$OnClickListenerC45250l(this));
        m179584l();
    }

    /* renamed from: m */
    private final void m179585m() {
        ((CommonTitleBar) this.f114516k.findViewById(R.id.mTitleBar)).setTitle(UIHelper.getString(R.string.Lark_Legacy_GroupReduceMemberTitle));
        ((CommonTitleBar) this.f114516k.findViewById(R.id.mTitleBar)).setLeftClickListener(new View$OnClickListenerC45245g(this));
        View view = this.f114512g;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: n */
    private final void m179586n() {
        ((ImageView) this.f114516k.findViewById(R.id.mSearchDeleteIv)).setOnClickListener(new View$OnClickListenerC45248j(this));
        EditText editText = (EditText) this.f114516k.findViewById(R.id.mSearchEt);
        Intrinsics.checkExpressionValueIsNotNull(editText, "mRootView.mSearchEt");
        editText.setOnFocusChangeListener(new View$OnFocusChangeListenerC45249k(this));
        ((EditText) this.f114516k.findViewById(R.id.mSearchEt)).addTextChangedListener(this.f114514i);
    }

    /* renamed from: b */
    public final void mo159869b() {
        Chat chat = this.f114509c;
        if (chat == null) {
            return;
        }
        if (chat.isSecret() || !chat.isCrossTenant()) {
            this.f114517l.mo159831a(chat, chat.isEdu(), "list_more_mobile");
        } else {
            this.f114517l.mo159830a(chat, "list_more_mobile");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m179584l() {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.member_manage.impl.show_member.team_group.TeamGroupShowMemberView.m179584l():void");
    }

    /* renamed from: c */
    public final void mo159870c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C58339d.C58341a(UIHelper.getString(R.string.Lark_Legacy_Add), new C45241c(this)));
        C58339d.C58341a a = new C58339d.C58341a(UIHelper.getString(R.string.Lark_Legacy_Remove), new C45242d(this)).mo197568a(R.color.function_danger_500);
        Intrinsics.checkExpressionValueIsNotNull(a, "DialogItem(UIHelper.getS…olor.function_danger_500)");
        arrayList.add(a);
        C58339d.m226198b(this.f114515j, arrayList, true);
    }

    /* renamed from: a */
    public void setViewDelegate(ITeamGroupShowMemberContract.ITeamGroupShowMemberView.ITeamGroupShowMemberDelegate aVar) {
        this.f114508b = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberView$initViewPager$2", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.e$n */
    public static final class C45252n implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        final /* synthetic */ TeamGroupShowMemberView f114533a;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45252n(TeamGroupShowMemberView eVar) {
            this.f114533a = eVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (this.f114533a.f114507a.get(i).mo159818b() == R.string.Lark_Group_OutsideDepartmentMember) {
                GroupHitPoint.f114612b.mo159959c();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberView$mSearchEditTextWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.e$p */
    public static final class C45255p implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ TeamGroupShowMemberView f114537a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45255p(TeamGroupShowMemberView eVar) {
            this.f114537a = eVar;
        }

        public void afterTextChanged(Editable editable) {
            int i;
            Intrinsics.checkParameterIsNotNull(editable, "s");
            String obj = editable.toString();
            ImageView imageView = (ImageView) this.f114537a.mo159872e().findViewById(R.id.mSearchDeleteIv);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "mRootView.mSearchDeleteIv");
            if (TextUtils.isEmpty(obj)) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
            Iterator<IBaseFragment> it = this.f114537a.f114507a.iterator();
            while (it.hasNext()) {
                it.next().mo159814a(obj);
            }
        }
    }

    /* renamed from: a */
    private final IBaseFragment.ItemClickListener m179576a(String str) {
        return new TeamGroupShowMemberView$getItemClickListener$1(this, str);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.e$e */
    public static final class View$OnClickListenerC45243e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamGroupShowMemberView f114522a;

        View$OnClickListenerC45243e(TeamGroupShowMemberView eVar) {
            this.f114522a = eVar;
        }

        public final void onClick(View view) {
            ITeamGroupShowMemberContract.ITeamGroupShowMemberView.ITeamGroupShowMemberDelegate aVar = this.f114522a.f114508b;
            if (aVar != null) {
                aVar.mo159856c();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberView$initRightButton$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.e$h */
    public static final class C45246h extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ TeamGroupShowMemberView f114525a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            super.performAction(view);
            this.f114525a.mo159869b();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45246h(TeamGroupShowMemberView eVar, String str, int i) {
            super(str, i);
            this.f114525a = eVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberView$initRightButton$2", "Lcom/ss/android/lark/ui/IActionTitlebar$ImageAction;", "performAction", "", "view", "Landroid/view/View;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.e$i */
    public static final class C45247i extends IActionTitlebar.C57573a {

        /* renamed from: a */
        final /* synthetic */ TeamGroupShowMemberView f114526a;

        /* renamed from: b */
        final /* synthetic */ Drawable f114527b;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            super.performAction(view);
            this.f114526a.mo159870c();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45247i(TeamGroupShowMemberView eVar, Drawable drawable, Drawable drawable2) {
            super(drawable2);
            this.f114526a = eVar;
            this.f114527b = drawable;
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.ITeamGroupShowMemberContract.ITeamGroupShowMemberView
    /* renamed from: b */
    public void mo159851b(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        this.f114509c = chat;
        m179583k();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.e$j */
    public static final class View$OnClickListenerC45248j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamGroupShowMemberView f114528a;

        View$OnClickListenerC45248j(TeamGroupShowMemberView eVar) {
            this.f114528a = eVar;
        }

        public final void onClick(View view) {
            EditText editText = (EditText) this.f114528a.mo159872e().findViewById(R.id.mSearchEt);
            Intrinsics.checkExpressionValueIsNotNull(editText, "mRootView.mSearchEt");
            editText.getText().clear();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.e$l */
    public static final class View$OnClickListenerC45250l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamGroupShowMemberView f114530a;

        View$OnClickListenerC45250l(TeamGroupShowMemberView eVar) {
            this.f114530a = eVar;
        }

        public final void onClick(View view) {
            KeyboardUtils.hideKeyboard(this.f114530a.mo159871d());
            this.f114530a.mo159873f().mo159829a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "kotlin.jvm.PlatformType", "onItemRemoved"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.e$f */
    public static final class C45244f implements SelectPreviewAdapter.AbstractC45042a {

        /* renamed from: a */
        final /* synthetic */ TeamGroupShowMemberView f114523a;

        C45244f(TeamGroupShowMemberView eVar) {
            this.f114523a = eVar;
        }

        @Override // com.ss.android.lark.member_manage.impl.base.adapter.SelectPreviewAdapter.AbstractC45042a
        /* renamed from: a */
        public final void mo159340a(C45084c cVar) {
            Intrinsics.checkExpressionValueIsNotNull(cVar, "it");
            cVar.mo159503b(false);
            ITeamGroupShowMemberContract.ITeamGroupShowMemberView.ITeamGroupShowMemberDelegate aVar = this.f114523a.f114508b;
            if (aVar != null) {
                aVar.mo159854a(cVar);
            }
            TeamGroupShowMemberView eVar = this.f114523a;
            String h = cVar.mo159513h();
            Intrinsics.checkExpressionValueIsNotNull(h, "it.id");
            eVar.mo159868a(h, false, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.e$g */
    public static final class View$OnClickListenerC45245g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamGroupShowMemberView f114524a;

        View$OnClickListenerC45245g(TeamGroupShowMemberView eVar) {
            this.f114524a = eVar;
        }

        public final void onClick(View view) {
            KeyboardUtils.hideKeyboard(this.f114524a.mo159871d());
            if (this.f114524a.mo159874g()) {
                this.f114524a.mo159873f().mo159829a();
                return;
            }
            ITeamGroupShowMemberContract.ITeamGroupShowMemberView.ITeamGroupShowMemberDelegate aVar = this.f114524a.f114508b;
            if (aVar != null) {
                aVar.mo159855b();
            }
        }
    }

    /* renamed from: a */
    private final void m179577a(int i) {
        int i2;
        LKUIButton lKUIButton = (LKUIButton) this.f114516k.findViewById(R.id.mConfirmBtn);
        Intrinsics.checkExpressionValueIsNotNull(lKUIButton, "mRootView.mConfirmBtn");
        if (i == 0) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        lKUIButton.setVisibility(i2);
        TextView textView = (TextView) this.f114516k.findViewById(R.id.mSelectCountTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.mSelectCountTv");
        textView.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_GroupSettingSelectedNumber, "number", String.valueOf(i)));
    }

    /* renamed from: c */
    private final void m179579c(List<? extends C45084c> list) {
        int i;
        List<? extends C45084c> list2 = list;
        this.f114513h.resetAll(list2);
        RecyclerView recyclerView = (RecyclerView) this.f114516k.findViewById(R.id.mHorizontalAvatarRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRootView.mHorizontalAvatarRecycleView");
        if (CollectionUtils.isEmpty(list2)) {
            i = 8;
        } else {
            i = 0;
        }
        recyclerView.setVisibility(i);
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.ITeamGroupShowMemberContract.ITeamGroupShowMemberView
    /* renamed from: a */
    public void mo159848a(Chat chat) {
        ITeamGroupShowMemberContract.ITeamGroupShowMemberView.ITeamGroupShowMemberDelegate aVar;
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        this.f114509c = chat;
        m179582j();
        m179581i();
        m179578c(chat);
        m179586n();
        m179580h();
        if (this.f114519n && (aVar = this.f114508b) != null) {
            aVar.mo159853a();
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.ITeamGroupShowMemberContract.ITeamGroupShowMemberView
    /* renamed from: b */
    public void mo159852b(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "items");
        Chat chat = this.f114509c;
        if (chat != null) {
            chat.setMemberCount(chat.getMemberCount() - list.size());
        }
        m179583k();
        ((EditText) this.f114516k.findViewById(R.id.mSearchEt)).removeTextChangedListener(this.f114514i);
        EditText editText = (EditText) this.f114516k.findViewById(R.id.mSearchEt);
        Intrinsics.checkExpressionValueIsNotNull(editText, "mRootView.mSearchEt");
        editText.getText().clear();
        ((EditText) this.f114516k.findViewById(R.id.mSearchEt)).addTextChangedListener(this.f114514i);
        ImageView imageView = (ImageView) this.f114516k.findViewById(R.id.mSearchDeleteIv);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "mRootView.mSearchDeleteIv");
        imageView.setVisibility(8);
        Iterator<IBaseFragment> it = this.f114507a.iterator();
        while (it.hasNext()) {
            it.next().mo159816a(list);
        }
    }

    /* renamed from: c */
    private final void m179578c(Chat chat) {
        this.f114507a.clear();
        ArrayList<IBaseFragment> arrayList = this.f114507a;
        AllMemberFragment.Companion aVar = AllMemberFragment.f114538a;
        String name = AllMemberFragment.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "AllMemberFragment::class.java.name");
        arrayList.add(aVar.mo159887a(chat, m179576a(name)));
        ArrayList<IBaseFragment> arrayList2 = this.f114507a;
        NonTeamMemberFragment.Companion aVar2 = NonTeamMemberFragment.f114579a;
        String name2 = NonTeamMemberFragment.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name2, "NonTeamMemberFragment::class.java.name");
        arrayList2.add(aVar2.mo159928a(chat, m179576a(name2)));
        FragmentManager b = this.f114517l.mo159832b();
        this.f114510e = new C45251m(this, b, b);
        ((ViewPager) this.f114516k.findViewById(R.id.mGroupVp)).addOnPageChangeListener(new C45252n(this));
        ViewPager viewPager = (ViewPager) this.f114516k.findViewById(R.id.mGroupVp);
        Intrinsics.checkExpressionValueIsNotNull(viewPager, "mRootView.mGroupVp");
        viewPager.setAdapter(this.f114510e);
        C69619a aVar3 = new C69619a(this.f114515j);
        aVar3.setAdjustMode(true);
        aVar3.setAdapter(new C45253o(this));
        MagicIndicator magicIndicator = (MagicIndicator) this.f114516k.findViewById(R.id.mIndicator);
        Intrinsics.checkExpressionValueIsNotNull(magicIndicator, "mRootView.mIndicator");
        magicIndicator.setNavigator(aVar3);
        C69634c.m267483a((MagicIndicator) this.f114516k.findViewById(R.id.mIndicator), (ViewPager) this.f114516k.findViewById(R.id.mGroupVp));
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.ITeamGroupShowMemberContract.ITeamGroupShowMemberView
    /* renamed from: a */
    public void mo159849a(List<? extends C45084c> list) {
        Intrinsics.checkParameterIsNotNull(list, "items");
        m179579c(list);
        m179577a(this.f114513h.getItemCount());
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.ITeamGroupShowMemberContract.ITeamGroupShowMemberView
    /* renamed from: a */
    public void mo159850a(boolean z) {
        if (z) {
            m179585m();
        } else {
            m179583k();
        }
        this.f114513h.clear();
        RecyclerView recyclerView = (RecyclerView) this.f114516k.findViewById(R.id.mHorizontalAvatarRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRootView.mHorizontalAvatarRecycleView");
        int i = 8;
        recyclerView.setVisibility(8);
        Iterator<IBaseFragment> it = this.f114507a.iterator();
        while (it.hasNext()) {
            it.next().mo159817a(z);
            this.f114511f = z;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f114516k.findViewById(R.id.mBottomLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "mRootView.mBottomLayout");
        if (z) {
            i = 0;
        }
        constraintLayout.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.e$k */
    public static final class View$OnFocusChangeListenerC45249k implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ TeamGroupShowMemberView f114529a;

        View$OnFocusChangeListenerC45249k(TeamGroupShowMemberView eVar) {
            this.f114529a = eVar;
        }

        public final void onFocusChange(View view, boolean z) {
            Object systemService = this.f114529a.mo159871d().getSystemService("input_method");
            if (systemService != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                if (z) {
                    inputMethodManager.showSoftInput((EditText) this.f114529a.mo159872e().findViewById(R.id.mSearchEt), 2);
                    return;
                }
                EditText editText = (EditText) this.f114529a.mo159872e().findViewById(R.id.mSearchEt);
                Intrinsics.checkExpressionValueIsNotNull(editText, "mRootView.mSearchEt");
                if (TextUtils.isEmpty(editText.getText())) {
                    EditText editText2 = (EditText) this.f114529a.mo159872e().findViewById(R.id.mSearchEt);
                    Intrinsics.checkExpressionValueIsNotNull(editText2, "mRootView.mSearchEt");
                    inputMethodManager.hideSoftInputFromWindow(editText2.getWindowToken(), 0);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    /* renamed from: a */
    public final void mo159868a(String str, boolean z, String str2) {
        Iterator<IBaseFragment> it = this.f114507a.iterator();
        while (it.hasNext()) {
            it.next().mo159815a(str, z);
        }
    }

    public TeamGroupShowMemberView(Context context, View view, Dependency bVar, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(view, "mRootView");
        Intrinsics.checkParameterIsNotNull(bVar, "mDependency");
        this.f114515j = context;
        this.f114516k = view;
        this.f114517l = bVar;
        this.f114518m = z;
        this.f114519n = z2;
    }
}
