package com.ss.android.lark.chatsetting.impl.group.info.time;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.chatsetting.impl.group.info.time.GroupShareTimeAdapter;
import com.ss.android.lark.chatsetting.impl.group.info.time.IView;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00010B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020$H\u0016J\b\u0010'\u001a\u00020$H\u0002J\b\u0010(\u001a\u00020$H\u0002J\u001e\u0010)\u001a\u00020$2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010-\u001a\u00020\u0015H\u0016J\u0012\u0010.\u001a\u00020$2\b\u0010/\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\rR\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00061"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeView;", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/IView;", "fragment", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeFragment;", "viewDependency", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeView$IViewDependency;", "chatId", "", "sourceType", "(Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeFragment;Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeView$IViewDependency;Ljava/lang/String;Ljava/lang/String;)V", "activity", "Landroid/app/Activity;", "getChatId", "()Ljava/lang/String;", "getFragment", "()Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeFragment;", "setFragment", "(Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeFragment;)V", "mAdapter", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeAdapter;", "mCurSelectedType", "", "mViewDelegate", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/IView$Delegate;", "getSourceType", "timeHintTv", "Landroid/widget/TextView;", "timeRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "getViewDependency", "()Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeView$IViewDependency;", "setViewDependency", "(Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeView$IViewDependency;)V", "create", "", "destroy", "gotoLastPage", "initRecyclerView", "initView", "setData", "list", "", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeBean;", ShareHitPoint.f121869d, "setViewDelegate", "viewDelegate", "IViewDependency", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.info.time.f */
public final class GroupShareTimeView implements IView {

    /* renamed from: a */
    public IView.Delegate f89524a;

    /* renamed from: b */
    public int f89525b = 3;

    /* renamed from: c */
    private RecyclerView f89526c;

    /* renamed from: d */
    private Activity f89527d;

    /* renamed from: e */
    private GroupShareTimeAdapter f89528e;

    /* renamed from: f */
    private CommonTitleBar f89529f;

    /* renamed from: g */
    private TextView f89530g;

    /* renamed from: h */
    private GroupShareTimeFragment f89531h;

    /* renamed from: i */
    private IViewDependency f89532i;

    /* renamed from: j */
    private final String f89533j;

    /* renamed from: k */
    private final String f89534k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeView$IViewDependency;", "", "gotoLastPage", "", "selectedType", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.time.f$a */
    public interface IViewDependency {
        /* renamed from: a */
        void mo128057a(int i);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: b */
    public final String mo128068b() {
        return this.f89533j;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.time.IView
    /* renamed from: a */
    public void mo128065a() {
        this.f89532i.mo128057a(this.f89525b);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        FragmentActivity activity = this.f89531h.getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        this.f89527d = activity;
        m134795c();
    }

    /* renamed from: c */
    private final void m134795c() {
        String str;
        CommonTitleBar commonTitleBar = (CommonTitleBar) this.f89531h.mo128054a(R.id.title_bar);
        Intrinsics.checkExpressionValueIsNotNull(commonTitleBar, "fragment.title_bar");
        this.f89529f = commonTitleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar.setLeftClickListener(new View$OnClickListenerC34684c(this));
        TextView textView = (TextView) this.f89531h.mo128054a(R.id.time_hint_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "fragment.time_hint_tv");
        this.f89530g = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeHintTv");
        }
        if (TextUtils.equals("qrcode", this.f89534k)) {
            str = UIHelper.getString(R.string.Lark_NewSettings_ValidOnlyForQRCode);
        } else {
            str = UIHelper.getString(R.string.Lark_NewSettings_ValidOnlyForLink);
        }
        textView.setText(str);
        m134796d();
    }

    /* renamed from: d */
    private final void m134796d() {
        CommonRecyclerView commonRecyclerView = (CommonRecyclerView) this.f89531h.mo128054a(R.id.time_recyclerview);
        Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView, "fragment.time_recyclerview");
        CommonRecyclerView commonRecyclerView2 = commonRecyclerView;
        this.f89526c = commonRecyclerView2;
        if (commonRecyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeRecyclerView");
        }
        commonRecyclerView2.setLayoutManager(new LinearLayoutManager(this.f89531h.getActivity(), 1, false));
        GroupShareTimeAdapter aVar = new GroupShareTimeAdapter();
        this.f89528e = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        aVar.mo128040a(new C34683b(this));
        RecyclerView recyclerView = this.f89526c;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeRecyclerView");
        }
        GroupShareTimeAdapter aVar2 = this.f89528e;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        recyclerView.setAdapter(aVar2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeView$initRecyclerView$1", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeAdapter$OnItemSelectListener;", "onItemSelect", "", "item", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeBean;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.time.f$b */
    public static final class C34683b implements GroupShareTimeAdapter.OnItemSelectListener {

        /* renamed from: a */
        final /* synthetic */ GroupShareTimeView f89535a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34683b(GroupShareTimeView fVar) {
            this.f89535a = fVar;
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.info.time.GroupShareTimeAdapter.OnItemSelectListener
        /* renamed from: a */
        public void mo128042a(GroupShareTimeBean bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "item");
            GroupShareTimeView.m134794a(this.f89535a).mo128064a(this.f89535a.mo128068b(), bVar);
            this.f89535a.f89525b = bVar.mo128049b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.time.f$c */
    public static final class View$OnClickListenerC34684c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupShareTimeView f89536a;

        View$OnClickListenerC34684c(GroupShareTimeView fVar) {
            this.f89536a = fVar;
        }

        public final void onClick(View view) {
            this.f89536a.mo128065a();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IView.Delegate m134794a(GroupShareTimeView fVar) {
        IView.Delegate aVar = fVar.f89524a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        return aVar;
    }

    /* renamed from: a */
    public void setViewDelegate(IView.Delegate aVar) {
        if (aVar != null) {
            this.f89524a = aVar;
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.time.IView
    /* renamed from: a */
    public void mo128067a(List<GroupShareTimeBean> list, int i) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        GroupShareTimeAdapter aVar = this.f89528e;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        aVar.resetAll(list);
        this.f89525b = i;
    }

    public GroupShareTimeView(GroupShareTimeFragment cVar, IViewDependency aVar, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(cVar, "fragment");
        Intrinsics.checkParameterIsNotNull(aVar, "viewDependency");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(str2, "sourceType");
        this.f89531h = cVar;
        this.f89532i = aVar;
        this.f89533j = str;
        this.f89534k = str2;
    }
}
