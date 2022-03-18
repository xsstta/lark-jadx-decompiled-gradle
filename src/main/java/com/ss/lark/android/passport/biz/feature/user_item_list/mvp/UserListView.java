package com.ss.lark.android.passport.biz.feature.user_item_list.mvp;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.p042i.p043a.p044a.C1106i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.entity.ButtonInfo;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.entity.RegisterItem;
import com.ss.lark.android.passport.biz.entity.UserItem;
import com.ss.lark.android.passport.biz.entity.UserItemGroup;
import com.ss.lark.android.passport.biz.entity.UserItemListStep;
import com.ss.lark.android.passport.biz.feature.join_team.join_way.CreateWayDialogFragment;
import com.ss.lark.android.passport.biz.feature.user_item_list.UserItemGroupAdapter;
import com.ss.lark.android.passport.biz.feature.user_item_list.UserItemWrapper;
import com.ss.lark.android.passport.biz.feature.user_item_list.UserListStatisticsHelper;
import com.ss.lark.android.passport.biz.feature.user_item_list.mvp.C65112a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ,2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0001,B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0016J\u0012\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010!\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010#\u001a\u00020\u001aH\u0016J\u0012\u0010$\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010(H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/user_item_list/mvp/UserListView;", "Lcom/ss/android/lark/passport/infra/base/architecture/mvp/BaseView;", "Lcom/ss/lark/android/passport/biz/feature/user_item_list/mvp/UserListContract$IView$Delegate;", "Lcom/ss/lark/android/passport/biz/feature/user_item_list/mvp/UserListContract$IView;", "mContext", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "mLlFooter", "Landroid/widget/LinearLayout;", "mTvButtonBottom", "Landroid/widget/TextView;", "mTvJoin", "Landroidx/appcompat/widget/AppCompatTextView;", "mTvRegister", "mTvTextBottom", "mTvTitle", "mUserAdapter", "Lcom/ss/lark/android/passport/biz/feature/user_item_list/UserItemGroupAdapter;", "getMUserAdapter", "()Lcom/ss/lark/android/passport/biz/feature/user_item_list/UserItemGroupAdapter;", "mUserAdapter$delegate", "Lkotlin/Lazy;", "mViewDelegate", "rvUserList", "Landroidx/recyclerview/widget/RecyclerView;", "create", "", "destroy", "getUniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "hideLoadingView", "setUniContext", "uniContext", "setViewDelegate", "viewDelegate", "showLoadingView", "showView", "stepInfo", "Lcom/ss/lark/android/passport/biz/entity/UserItemListStep;", "wrapperGroupList", "", "Lcom/ss/lark/android/passport/biz/feature/user_item_list/UserItemWrapper;", "groupList", "Lcom/ss/lark/android/passport/biz/entity/UserItemGroup;", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UserListView extends AbstractC49023c<C65112a.AbstractC65114b.AbstractC65115a> implements C65112a.AbstractC65114b {

    /* renamed from: e */
    public static final Companion f163991e = new Companion(null);

    /* renamed from: c */
    public C65112a.AbstractC65114b.AbstractC65115a f163992c;

    /* renamed from: d */
    public final Activity f163993d;

    /* renamed from: f */
    private final Lazy f163994f = LazyKt.lazy(new C65108b(this));
    @BindView(6672)
    public LinearLayout mLlFooter;
    @BindView(7181)
    public TextView mTvButtonBottom;
    @BindView(7196)
    public AppCompatTextView mTvJoin;
    @BindView(7205)
    public AppCompatTextView mTvRegister;
    @BindView(7213)
    public TextView mTvTextBottom;
    @BindView(7215)
    public TextView mTvTitle;
    @BindView(6945)
    public RecyclerView rvUserList;

    /* renamed from: f */
    private final UserItemGroupAdapter m255719f() {
        return (UserItemGroupAdapter) this.f163994f.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/user_item_list/mvp/UserListView$Companion;", "", "()V", "DEFAULT_ICON_SIZE_IN_DP", "", "TAG", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.user_item_list.mvp.UserListView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: c */
    public UniContext mo171187c() {
        return this.f123084a;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        ButterKnife.bind(this, this.f163993d);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f163992c = null;
    }

    @Override // com.ss.lark.android.passport.biz.feature.user_item_list.mvp.C65112a.AbstractC65114b
    /* renamed from: d */
    public void mo224288d() {
        Activity activity = this.f163993d;
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).mo171141m();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.user_item_list.mvp.C65112a.AbstractC65114b
    /* renamed from: e */
    public void mo224289e() {
        Activity activity = this.f163993d;
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).mo171143o();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/lark/android/passport/biz/feature/user_item_list/UserItemGroupAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.user_item_list.mvp.UserListView$b */
    static final class C65108b extends Lambda implements Function0<UserItemGroupAdapter> {
        final /* synthetic */ UserListView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65108b(UserListView userListView) {
            super(0);
            this.this$0 = userListView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final UserItemGroupAdapter invoke() {
            return new UserItemGroupAdapter(this.this$0.f163993d, new UserItemGroupAdapter.UserItemListener(this) {
                /* class com.ss.lark.android.passport.biz.feature.user_item_list.mvp.UserListView.C65108b.C651091 */

                /* renamed from: a */
                final /* synthetic */ C65108b f163995a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f163995a = r1;
                }

                @Override // com.ss.lark.android.passport.biz.feature.user_item_list.UserItemGroupAdapter.UserItemListener
                /* renamed from: a */
                public void mo224281a(UserItem userItem) {
                    C65112a.AbstractC65114b.AbstractC65115a aVar = this.f163995a.this$0.f163992c;
                    if (aVar != null) {
                        aVar.mo224298a(userItem);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: a */
    public void mo171186a(UniContext uniContext) {
        this.f123084a = uniContext;
    }

    public UserListView(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "mContext");
        this.f163993d = activity;
    }

    /* renamed from: a */
    public void mo171188a(C65112a.AbstractC65114b.AbstractC65115a aVar) {
        this.f163992c = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/lark/android/passport/biz/feature/user_item_list/mvp/UserListView$showView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.user_item_list.mvp.UserListView$c */
    static final class View$OnClickListenerC65110c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserListView f163996a;

        /* renamed from: b */
        final /* synthetic */ UserItemListStep f163997b;

        /* renamed from: c */
        final /* synthetic */ Ref.BooleanRef f163998c;

        /* renamed from: d */
        final /* synthetic */ Ref.BooleanRef f163999d;

        View$OnClickListenerC65110c(UserListView userListView, UserItemListStep userItemListStep, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2) {
            this.f163996a = userListView;
            this.f163997b = userItemListStep;
            this.f163998c = booleanRef;
            this.f163999d = booleanRef2;
        }

        public final void onClick(View view) {
            if (this.f163998c.element) {
                UserListStatisticsHelper.m255715c(this.f163997b.flowType, UserListStatisticsHelper.m255713a(this.f163997b));
            }
            C49092f.m193529a(this.f163996a.f163993d, this.f163997b.joinButton.next, RouterScene.ALL.value, this.f163996a.f123084a, this.f163996a.f123085b, (AbstractC49336a) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/lark/android/passport/biz/feature/user_item_list/mvp/UserListView$showView$2$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.user_item_list.mvp.UserListView$d */
    static final class View$OnClickListenerC65111d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserListView f164000a;

        /* renamed from: b */
        final /* synthetic */ UserItemListStep f164001b;

        /* renamed from: c */
        final /* synthetic */ Ref.BooleanRef f164002c;

        /* renamed from: d */
        final /* synthetic */ Ref.ObjectRef f164003d;

        View$OnClickListenerC65111d(UserListView userListView, UserItemListStep userItemListStep, Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef) {
            this.f164000a = userListView;
            this.f164001b = userItemListStep;
            this.f164002c = booleanRef;
            this.f164003d = objectRef;
        }

        public final void onClick(View view) {
            if (this.f164003d.element == null) {
                UserListStatisticsHelper.m255716d(this.f164001b.flowType, UserListStatisticsHelper.m255713a(this.f164001b));
                C65112a.AbstractC65114b.AbstractC65115a aVar = this.f164000a.f163992c;
                if (aVar != null) {
                    aVar.mo224297a();
                }
            } else if (this.f164001b.registerItem != null) {
                CreateWayDialogFragment.Companion aVar2 = CreateWayDialogFragment.f163416d;
                RegisterItem registerItem = this.f164001b.registerItem;
                if (registerItem == null) {
                    Intrinsics.throwNpe();
                }
                CreateWayDialogFragment a = aVar2.mo223708a(registerItem, this.f164000a.f123084a, this.f164001b.flowType);
                Activity activity = this.f164000a.f163993d;
                if (activity != null) {
                    a.mo5511a(((FragmentActivity) activity).getSupportFragmentManager(), "register way");
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            } else {
                UserListStatisticsHelper.m255717e(this.f164001b.flowType, UserListStatisticsHelper.m255713a(this.f164001b));
                C49092f.m193529a(this.f164000a.f163993d, this.f164001b.registerButton.next, RouterScene.ALL.value, this.f164000a.f123084a, this.f164000a.f123085b, (AbstractC49336a) null);
            }
        }
    }

    /* renamed from: a */
    private final List<UserItemWrapper> m255718a(List<? extends UserItemGroup> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            List<? extends UserItemGroup> list2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (T t : list2) {
                if (!TextUtils.isEmpty(t.subTitle)) {
                    arrayList.add(new UserItemWrapper(t.subTitle, null, 1));
                }
                List<UserItem> list3 = t.userList;
                Intrinsics.checkExpressionValueIsNotNull(list3, "it.userList");
                List<UserItem> list4 = list3;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                Iterator<T> it = list4.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new UserItemWrapper("", it.next(), 0));
                }
                arrayList2.add(Boolean.valueOf(arrayList.addAll(arrayList3)));
            }
        }
        return arrayList;
    }

    @Override // com.ss.lark.android.passport.biz.feature.user_item_list.mvp.C65112a.AbstractC65114b
    /* renamed from: a */
    public void mo224286a(UserItemListStep userItemListStep) {
        List<UserItemGroup> list;
        String str;
        String str2;
        String str3;
        String str4;
        if (userItemListStep != null) {
            list = userItemListStep.groupList;
        } else {
            list = null;
        }
        if (list != null && userItemListStep.groupList.size() != 0) {
            TextView textView = this.mTvTitle;
            if (textView != null) {
                textView.setText(userItemListStep.title);
            }
            RecyclerView recyclerView = this.rvUserList;
            if (recyclerView != null) {
                recyclerView.setAdapter(m255719f());
            }
            RecyclerView recyclerView2 = this.rvUserList;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new LinearLayoutManager(this.f163993d));
            }
            m255719f().mo224278a(m255718a(userItemListStep.groupList));
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            T t = (T) null;
            objectRef.element = t;
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = false;
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            booleanRef2.element = false;
            if (userItemListStep.joinButton != null && userItemListStep.registerButton != null) {
                LinearLayout linearLayout = this.mLlFooter;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                TextView textView2 = this.mTvButtonBottom;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                TextView textView3 = this.mTvTextBottom;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                objectRef.element = (T) this.mTvJoin;
                t = (T) this.mTvRegister;
                booleanRef2.element = true;
                booleanRef.element = true;
            } else if (userItemListStep.joinButton != null && userItemListStep.registerButton == null) {
                LinearLayout linearLayout2 = this.mLlFooter;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                TextView textView4 = this.mTvButtonBottom;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
                TextView textView5 = this.mTvTextBottom;
                if (textView5 != null) {
                    textView5.setVisibility(0);
                }
                objectRef.element = (T) this.mTvTextBottom;
            } else if (userItemListStep.joinButton != null || userItemListStep.registerButton == null) {
                LinearLayout linearLayout3 = this.mLlFooter;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                }
                TextView textView6 = this.mTvButtonBottom;
                if (textView6 != null) {
                    textView6.setVisibility(8);
                }
                TextView textView7 = this.mTvTextBottom;
                if (textView7 != null) {
                    textView7.setVisibility(8);
                }
            } else {
                LinearLayout linearLayout4 = this.mLlFooter;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(8);
                }
                TextView textView8 = this.mTvButtonBottom;
                if (textView8 != null) {
                    textView8.setVisibility(0);
                }
                TextView textView9 = this.mTvTextBottom;
                if (textView9 != null) {
                    textView9.setVisibility(8);
                }
                t = (T) this.mTvButtonBottom;
            }
            T t2 = objectRef.element;
            if (t2 != null) {
                ButtonInfo buttonInfo = userItemListStep.joinButton;
                if (buttonInfo != null && (str4 = buttonInfo.text) != null) {
                    str3 = str4;
                }
                t2.setText(str3);
                t2.setOnClickListener(new View$OnClickListenerC65110c(this, userItemListStep, booleanRef2, booleanRef));
                if (booleanRef.element) {
                    t2.setCompoundDrawablesWithIntrinsicBounds(C1106i.m5238a(this.f163993d.getResources(), (int) R.drawable.ic_svg_join_team, this.f163993d.getTheme()), null, null, null);
                } else {
                    t2.setCompoundDrawables(null, null, null, null);
                }
            }
            if (t != null) {
                ButtonInfo buttonInfo2 = userItemListStep.registerButton;
                if (buttonInfo2 != null && (str2 = buttonInfo2.text) != null) {
                    str = str2;
                }
                t.setText(str);
                if (booleanRef.element) {
                    t.setCompoundDrawablesWithIntrinsicBounds(C1106i.m5238a(this.f163993d.getResources(), (int) R.drawable.ic_svg_create_brand_new, this.f163993d.getTheme()), null, null, null);
                } else {
                    t.setCompoundDrawables(null, null, null, null);
                }
                t.setOnClickListener(new View$OnClickListenerC65111d(this, userItemListStep, booleanRef, objectRef));
            }
        }
    }
}
