package com.ss.android.lark.todo.impl.features.detail.assignee.add.mvvm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.ViewModelLazy;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.widget.BasePicker;
import com.ss.android.lark.search.widget.ChatterPicker;
import com.ss.android.lark.search.widget.business.ContactsSelectorBusiness;
import com.ss.android.lark.search.widget.params.ChatterPickerParams;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.utils.SearchCommonUtils;
import com.ss.android.lark.todo.impl.features.detail.assignee.add.adapter.AssigneeRecommendAdapter;
import com.ss.android.lark.todo.impl.features.detail.assignee.add.adapter.RecommendItem;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\b\u0010\u0019\u001a\u00020\u0013H\u0002J\b\u0010\u001a\u001a\u00020\u0013H\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0016J\u0012\u0010\u001d\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u0013H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/mvvm/TodoAssigneeAddActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "mAssigneeChatId", "", "mConfirmText", "mRecommendAdapter", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/adapter/AssigneeRecommendAdapter;", "mSelectedIds", "Ljava/util/ArrayList;", "mViewModel", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/mvvm/TodoAssigneeAddViewModel;", "getMViewModel", "()Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/mvvm/TodoAssigneeAddViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "requestCode", "", "bindAdapterLv", "", "bindTitleLv", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "initAdapter", "initChatterPicker", "initObserver", "initTitleBar", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setResult", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TodoAssigneeAddActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public AssigneeRecommendAdapter f139574a;

    /* renamed from: b */
    public final ArrayList<String> f139575b = new ArrayList<>();

    /* renamed from: c */
    public String f139576c;

    /* renamed from: d */
    public String f139577d = (UIHelper.getString(R.string.Lark_Legacy_ConfirmDone) + "(0)");

    /* renamed from: e */
    private final Lazy f139578e = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TodoAssigneeAddViewModel.class), new TodoAssigneeAddActivity$$special$$inlined$viewModels$2(this), new TodoAssigneeAddActivity$$special$$inlined$viewModels$1(this));

    /* renamed from: f */
    private int f139579f = 2;

    /* renamed from: g */
    private HashMap f139580g;

    /* renamed from: a */
    public Context mo192184a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public View mo192185a(int i) {
        if (this.f139580g == null) {
            this.f139580g = new HashMap();
        }
        View view = (View) this.f139580g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f139580g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final TodoAssigneeAddViewModel mo192186a() {
        return (TodoAssigneeAddViewModel) this.f139578e.getValue();
    }

    /* renamed from: a */
    public void mo192187a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m219980a(this, context);
    }

    /* renamed from: c */
    public Resources mo192189c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m219978a(this, configuration);
    }

    /* renamed from: d */
    public void mo192191d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo192192e() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m219982c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m219979a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m219981b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/assignee/add/mvvm/TodoAssigneeAddActivity$initChatterPicker$1$3", "Lcom/ss/android/lark/search/widget/BasePicker$IViewDependency;", "getActivity", "Landroid/app/Activity;", "getFragmentManager", "Landroidx/fragment/app/FragmentManager;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.add.mvvm.TodoAssigneeAddActivity$f */
    public static final class C56442f implements BasePicker.IViewDependency {

        /* renamed from: a */
        final /* synthetic */ TodoAssigneeAddActivity f139586a;

        @Override // com.ss.android.lark.search.widget.BasePicker.IViewDependency
        /* renamed from: b */
        public Activity mo110056b() {
            return this.f139586a;
        }

        @Override // com.ss.android.lark.search.widget.BasePicker.IViewDependency
        /* renamed from: c */
        public FragmentManager mo110057c() {
            return this.f139586a.getSupportFragmentManager();
        }

        C56442f(TodoAssigneeAddActivity todoAssigneeAddActivity) {
            this.f139586a = todoAssigneeAddActivity;
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/assignee/add/mvvm/TodoAssigneeAddActivity$initChatterPicker$1$1", "Lcom/ss/android/lark/search/widget/BasePicker$OnPickerParamsLoader;", "Lcom/ss/android/lark/search/widget/params/ChatterPickerParams;", "onLoadPickerParams", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.add.mvvm.TodoAssigneeAddActivity$d */
    public static final class C56440d implements BasePicker.OnPickerParamsLoader<ChatterPickerParams> {

        /* renamed from: a */
        final /* synthetic */ TodoAssigneeAddActivity f139584a;

        /* renamed from: a */
        public ChatterPickerParams onLoadPickerParams() {
            return new ChatterPickerParams.Builder().mo183676h(true).mo183678j(false).mo183664b(this.f139584a.f139575b).mo183675g();
        }

        C56440d(TodoAssigneeAddActivity todoAssigneeAddActivity) {
            this.f139584a = todoAssigneeAddActivity;
        }
    }

    /* renamed from: f */
    private final void m219983f() {
        mo192186a().getFinishLv().mo5923a(this, new C56443g(this));
    }

    /* renamed from: g */
    private final void m219984g() {
        boolean z;
        if (this.f139579f == 4) {
            z = true;
        } else {
            z = false;
        }
        this.f139574a = new AssigneeRecommendAdapter(z, new C56439c(this));
        m219985h();
    }

    /* renamed from: h */
    private final void m219985h() {
        mo192186a().getShowDataLv().mo5923a(this, new C56437a(this));
    }

    /* renamed from: j */
    private final void m219987j() {
        mo192186a().getChosenMembersLv().mo5923a(this, new C56438b(this));
    }

    /* renamed from: b */
    public final void mo192188b() {
        Intent intent = new Intent();
        intent.putExtra("add_assignee_chosen_data", mo192186a().getChosenMembers());
        setResult(-1, intent);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        if (((ChatterPicker) mo192185a(R.id.todo_chatter_picker)).mo183501f()) {
            finish();
        }
    }

    /* renamed from: i */
    private final void m219986i() {
        boolean z;
        ((CommonTitleBar) mo192185a(R.id.title_bar)).setLeftText(CommonTitleBarConstants.Lark_Legacy_Cancel);
        ((CommonTitleBar) mo192185a(R.id.title_bar)).setLeftImageDrawable(null);
        ((CommonTitleBar) mo192185a(R.id.title_bar)).setLeftClickListener(new View$OnClickListenerC56444h(this));
        if (this.f139579f == 3) {
            ((CommonTitleBar) mo192185a(R.id.title_bar)).setTitle(ResUtil.f139261a.mo191781c(R.string.Todo_Task_AddFollower));
        } else {
            ((CommonTitleBar) mo192185a(R.id.title_bar)).setTitle(ResUtil.f139261a.mo191781c(R.string.Todo_Task_AddAssignee));
        }
        CommonTitleBar commonTitleBar = (CommonTitleBar) mo192185a(R.id.title_bar);
        if (this.f139579f != 4) {
            z = true;
        } else {
            z = false;
        }
        commonTitleBar.setRightVisible(z);
        ((CommonTitleBar) mo192185a(R.id.title_bar)).addAction(new C56445i(this, this.f139577d));
        m219987j();
    }

    /* renamed from: k */
    private final void m219988k() {
        boolean z;
        ChatterPicker chatterPicker = (ChatterPicker) mo192185a(R.id.todo_chatter_picker);
        if (this.f139579f != 4) {
            z = true;
        } else {
            z = false;
        }
        ChatterPicker chatterPicker2 = (ChatterPicker) ((ChatterPicker) chatterPicker.mo183604p(z)).mo183561a(new C56440d(this));
        ContactsSelectorBusiness aVar = new ContactsSelectorBusiness();
        AssigneeRecommendAdapter aVar2 = this.f139574a;
        if (aVar2 != null) {
            ChatterPicker chatterPicker3 = (ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) chatterPicker2.mo183479a(aVar.mo183644a(aVar2))).mo183496d(true)).mo183559a(new C56441e(this))).mo183560a(new C56442f(this));
            ((ChatterPicker) mo192185a(R.id.todo_chatter_picker)).mo183483a();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<*>");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/assignee/add/mvvm/TodoAssigneeAddActivity$initAdapter$1", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/adapter/AssigneeRecommendAdapter$IRecommendItemClickListener;", "onRecommendItemClicked", "", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "isCurrentChecked", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.add.mvvm.TodoAssigneeAddActivity$c */
    public static final class C56439c implements AssigneeRecommendAdapter.IRecommendItemClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoAssigneeAddActivity f139583a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56439c(TodoAssigneeAddActivity todoAssigneeAddActivity) {
            this.f139583a = todoAssigneeAddActivity;
        }

        @Override // com.ss.android.lark.todo.impl.features.detail.assignee.add.adapter.AssigneeRecommendAdapter.IRecommendItemClickListener
        /* renamed from: a */
        public void mo192181a(Chatter chatter, boolean z) {
            boolean z2;
            String str;
            if (chatter != null) {
                SearchChatterInfo a = SearchCommonUtils.m209224a(chatter);
                if (z) {
                    SearchChatterInfo searchChatterInfo = a;
                    this.f139583a.mo192186a().removeChatter(searchChatterInfo);
                    ((ChatterPicker) this.f139583a.mo192185a(R.id.todo_chatter_picker)).mo183572b(searchChatterInfo);
                    return;
                }
                String str2 = this.f139583a.f139576c;
                if (str2 == null || str2.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    str = "center";
                } else {
                    str = "im";
                }
                TodoHitPoint.m221750d("suggest", str);
                SearchChatterInfo searchChatterInfo2 = a;
                this.f139583a.mo192186a().addChatter(searchChatterInfo2);
                ((ChatterPicker) this.f139583a.mo192185a(R.id.todo_chatter_picker)).mo183568a(searchChatterInfo2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0016¨\u0006\u000e¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/assignee/add/mvvm/TodoAssigneeAddActivity$initChatterPicker$1$2", "Lcom/ss/android/lark/search/widget/BasePicker$IOnPickNotify;", "onChanged", "", "ids", "", "", "infoList", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "onDeSelected", "id", "info", "onSelected", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.add.mvvm.TodoAssigneeAddActivity$e */
    public static final class C56441e extends BasePicker.IOnPickNotify {

        /* renamed from: a */
        final /* synthetic */ TodoAssigneeAddActivity f139585a;

        @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
        /* renamed from: a */
        public void mo110051a(List<String> list, List<SearchBaseInfo> list2) {
            Intrinsics.checkParameterIsNotNull(list, "ids");
            Intrinsics.checkParameterIsNotNull(list2, "infoList");
        }

        C56441e(TodoAssigneeAddActivity todoAssigneeAddActivity) {
            this.f139585a = todoAssigneeAddActivity;
        }

        @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
        /* renamed from: b */
        public void mo110052b(String str, SearchBaseInfo searchBaseInfo) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, "info");
            this.f139585a.mo192186a().removeChatter(searchBaseInfo);
            AssigneeRecommendAdapter aVar = this.f139585a.f139574a;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            }
        }

        @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
        /* renamed from: a */
        public void mo110050a(String str, SearchBaseInfo searchBaseInfo) {
            boolean z;
            String str2;
            Intrinsics.checkParameterIsNotNull(str, "id");
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, "info");
            String str3 = this.f139585a.f139576c;
            if (str3 == null || str3.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str2 = "center";
            } else {
                str2 = "im";
            }
            TodoHitPoint.m221750d("search", str2);
            this.f139585a.mo192186a().addChatter(searchBaseInfo);
            AssigneeRecommendAdapter aVar = this.f139585a.f139574a;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.add.mvvm.TodoAssigneeAddActivity$h */
    public static final class View$OnClickListenerC56444h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoAssigneeAddActivity f139588a;

        View$OnClickListenerC56444h(TodoAssigneeAddActivity todoAssigneeAddActivity) {
            this.f139588a = todoAssigneeAddActivity;
        }

        public final void onClick(View view) {
            this.f139588a.onBackPressed();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "datas", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/adapter/RecommendItem;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.add.mvvm.TodoAssigneeAddActivity$a */
    public static final class C56437a<T> implements AbstractC1178x<ArrayList<RecommendItem>> {

        /* renamed from: a */
        final /* synthetic */ TodoAssigneeAddActivity f139581a;

        C56437a(TodoAssigneeAddActivity todoAssigneeAddActivity) {
            this.f139581a = todoAssigneeAddActivity;
        }

        /* renamed from: a */
        public final void onChanged(ArrayList<RecommendItem> arrayList) {
            AssigneeRecommendAdapter aVar = this.f139581a.f139574a;
            if (aVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(arrayList, "datas");
                aVar.mo192180a(arrayList);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "result", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.add.mvvm.TodoAssigneeAddActivity$g */
    public static final class C56443g<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TodoAssigneeAddActivity f139587a;

        C56443g(TodoAssigneeAddActivity todoAssigneeAddActivity) {
            this.f139587a = todoAssigneeAddActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "result");
            if (bool.booleanValue()) {
                this.f139587a.mo192188b();
                this.f139587a.finish();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/assignee/add/mvvm/TodoAssigneeAddActivity$initTitleBar$2", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.add.mvvm.TodoAssigneeAddActivity$i */
    public static final class C56445i extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ TodoAssigneeAddActivity f139589a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            KeyboardUtils.hideKeyboard(this.f139589a);
            this.f139589a.mo192188b();
            this.f139589a.finish();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56445i(TodoAssigneeAddActivity todoAssigneeAddActivity, String str) {
            super(str);
            this.f139589a = todoAssigneeAddActivity;
        }
    }

    /* renamed from: a */
    public static Resources m219979a(TodoAssigneeAddActivity todoAssigneeAddActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(todoAssigneeAddActivity);
        }
        return todoAssigneeAddActivity.mo192189c();
    }

    /* renamed from: c */
    public static AssetManager m219982c(TodoAssigneeAddActivity todoAssigneeAddActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(todoAssigneeAddActivity);
        }
        return todoAssigneeAddActivity.mo192192e();
    }

    /* renamed from: b */
    public static void m219981b(TodoAssigneeAddActivity todoAssigneeAddActivity) {
        todoAssigneeAddActivity.mo192191d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TodoAssigneeAddActivity todoAssigneeAddActivity2 = todoAssigneeAddActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    todoAssigneeAddActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "members", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.add.mvvm.TodoAssigneeAddActivity$b */
    public static final class C56438b<T> implements AbstractC1178x<ArrayList<SearchBaseInfo>> {

        /* renamed from: a */
        final /* synthetic */ TodoAssigneeAddActivity f139582a;

        C56438b(TodoAssigneeAddActivity todoAssigneeAddActivity) {
            this.f139582a = todoAssigneeAddActivity;
        }

        /* renamed from: a */
        public final void onChanged(ArrayList<SearchBaseInfo> arrayList) {
            int i;
            TodoAssigneeAddActivity todoAssigneeAddActivity = this.f139582a;
            todoAssigneeAddActivity.f139577d = UIHelper.getString(R.string.Lark_Legacy_ConfirmDone).toString() + "(" + arrayList.size() + ")";
            CommonTitleBar commonTitleBar = (CommonTitleBar) this.f139582a.mo192185a(R.id.title_bar);
            String str = this.f139582a.f139577d;
            ResUtil eVar = ResUtil.f139261a;
            if (arrayList.size() > 0) {
                i = R.color.primary_pri_500;
            } else {
                i = R.color.primary_pri_300;
            }
            int a = eVar.mo191775a(i);
            boolean z = false;
            commonTitleBar.setRightText(0, str, a);
            CommonTitleBar commonTitleBar2 = (CommonTitleBar) this.f139582a.mo192185a(R.id.title_bar);
            Intrinsics.checkExpressionValueIsNotNull(commonTitleBar2, "title_bar");
            TextView rightText = commonTitleBar2.getRightText();
            Intrinsics.checkExpressionValueIsNotNull(rightText, "title_bar.rightText");
            if (arrayList.size() > 0) {
                z = true;
            }
            rightText.setClickable(z);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        setContentView(R.layout.todo_assignee_add_fragment);
        ArrayList arrayList = (ArrayList) getIntent().getSerializableExtra("add_assignee_selected_ids");
        if (arrayList != null) {
            this.f139575b.addAll(arrayList);
        }
        this.f139576c = (String) getIntent().getSerializableExtra("add_assignee_is_chat_id");
        this.f139579f = getIntent().getIntExtra("add_todo_user_request_code", 2);
        m219984g();
        m219986i();
        m219988k();
        m219983f();
        TodoAssigneeAddViewModel a = mo192186a();
        String str = this.f139576c;
        ArrayList<String> arrayList2 = this.f139575b;
        if (this.f139579f == 4) {
            z = true;
        } else {
            z = false;
        }
        a.initData(str, arrayList2, z);
    }

    /* renamed from: a */
    public static void m219980a(TodoAssigneeAddActivity todoAssigneeAddActivity, Context context) {
        todoAssigneeAddActivity.mo192187a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(todoAssigneeAddActivity);
        }
    }

    /* renamed from: a */
    public static Context m219978a(TodoAssigneeAddActivity todoAssigneeAddActivity, Configuration configuration) {
        Context a = todoAssigneeAddActivity.mo192184a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
