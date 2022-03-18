package com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.C9890i;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar.ITopbarContract;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p712o.p713a.C13716b;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 12\u00020\u00012\u00020\u00022\u00020\u0003:\u00011B5\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0002\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J$\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010%\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\u00072\u0006\u0010&\u001a\u00020\u000bH\u0016J\u0010\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\tH\u0002J\u0010\u0010)\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010*\u001a\u00020\u00182\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u001d0,j\b\u0012\u0004\u0012\u00020\u001d`-H\u0016J\u0012\u0010.\u001a\u00020\u00182\b\u0010/\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u00100\u001a\u00020\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/TopbarView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/ITopbarContract$IView;", "Landroid/view/View$OnFocusChangeListener;", "Landroid/widget/TextView$OnEditorActionListener;", "context", "Landroid/app/Activity;", "rootView", "Landroid/view/View;", "title", "", "inviteDepEnable", "", "isBackArrow", "showKeyboard", "(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;ZZZ)V", "delegate", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/ITopbarContract$IView$IDelegate;", "disposable", "Lio/reactivex/disposables/Disposable;", "selectedUserAdapter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/SelectedUserAdapter;", "showKeyboardRunnable", "Ljava/lang/Runnable;", "create", "", "destroy", "hideSelectedUser", "onAddSelectedUser", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "onEditorAction", "v", "Landroid/widget/TextView;", "actionId", "", "event", "Landroid/view/KeyEvent;", "onFocusChange", "hasFocus", "onKeywordChange", "keyword", "onRemoveSelectedUser", "setSelectedUserList", "userInfos", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "setViewDelegate", "viewDelegate", "showSelectedUser", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.b.f */
public final class TopbarView implements View.OnFocusChangeListener, TextView.OnEditorActionListener, ITopbarContract.IView {

    /* renamed from: d */
    public static final Companion f26624d = new Companion(null);

    /* renamed from: a */
    public final C9890i f26625a = new C9890i();

    /* renamed from: b */
    public ITopbarContract.IView.IDelegate f26626b;

    /* renamed from: c */
    public final View f26627c;

    /* renamed from: e */
    private Disposable f26628e;

    /* renamed from: f */
    private Runnable f26629f = new RunnableC9869h(this);

    /* renamed from: g */
    private final Activity f26630g;

    /* renamed from: h */
    private final String f26631h;

    /* renamed from: i */
    private final boolean f26632i;

    /* renamed from: j */
    private final boolean f26633j;

    /* renamed from: k */
    private final boolean f26634k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/TopbarView$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.b.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.b.f$h */
    static final class RunnableC9869h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TopbarView f26641a;

        RunnableC9869h(TopbarView fVar) {
            this.f26641a = fVar;
        }

        public final void run() {
            ((SpaceEditText) this.f26641a.f26627c.findViewById(R.id.share_input_edit)).requestFocus();
            C10548d.m43703b((SpaceEditText) this.f26641a.f26627c.findViewById(R.id.share_input_edit));
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar.ITopbarContract.IView
    /* renamed from: a */
    public void mo37496a() {
        RecyclerView recyclerView = (RecyclerView) this.f26627c.findViewById(R.id.permSearchUserSelectedView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "selectedView");
        if (recyclerView.getVisibility() == 8) {
            recyclerView.setVisibility(0);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar.ITopbarContract.IView
    /* renamed from: b */
    public void mo37499b() {
        RecyclerView recyclerView = (RecyclerView) this.f26627c.findViewById(R.id.permSearchUserSelectedView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "selectedView");
        if (recyclerView.getVisibility() == 0) {
            recyclerView.setVisibility(8);
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        Disposable disposable;
        Disposable disposable2 = this.f26628e;
        if (!(disposable2 == null || disposable2.isDisposed() || (disposable = this.f26628e) == null)) {
            disposable.dispose();
        }
        ((SpaceEditText) this.f26627c.findViewById(R.id.share_input_edit)).removeCallbacks(this.f26629f);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        int i;
        int i2;
        if (this.f26633j) {
            i = R.drawable.ud_icon_left_outlined;
        } else {
            i = R.drawable.ud_icon_close_small_outlined;
        }
        ((ImageView) this.f26627c.findViewById(R.id.permSearchUserTitleBack)).setImageResource(i);
        ((ImageView) this.f26627c.findViewById(R.id.permSearchUserTitleBack)).setOnClickListener(new View$OnClickListenerC9863b(this));
        TextView textView = (TextView) this.f26627c.findViewById(R.id.permSearchUserTitle);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.permSearchUserTitle");
        textView.setText(this.f26631h);
        ((ImageView) this.f26627c.findViewById(R.id.share_search_clear_icon)).setOnClickListener(new View$OnClickListenerC9864c(this));
        SpaceEditText spaceEditText = (SpaceEditText) this.f26627c.findViewById(R.id.share_input_edit);
        Intrinsics.checkExpressionValueIsNotNull(spaceEditText, "rootView.share_input_edit");
        spaceEditText.setOnFocusChangeListener(this);
        ((SpaceEditText) this.f26627c.findViewById(R.id.share_input_edit)).setOnClickListener(new C9865d(this));
        if (this.f26632i) {
            i2 = R.string.Doc_Permission_AddUserHint;
        } else {
            i2 = R.string.Doc_Facade_CollaboratorsSearchHint;
        }
        ((SpaceEditText) this.f26627c.findViewById(R.id.share_input_edit)).setHint(i2);
        RecyclerView recyclerView = (RecyclerView) this.f26627c.findViewById(R.id.permSearchUserSelectedView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.permSearchUserSelectedView");
        recyclerView.setAdapter(this.f26625a);
        RecyclerView recyclerView2 = (RecyclerView) this.f26627c.findViewById(R.id.permSearchUserSelectedView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.permSearchUserSelectedView");
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.f26630g, 0, false));
        this.f26625a.mo70668a((BaseQuickAdapter.AbstractC20911a) new C9866e(this));
        this.f26628e = C13716b.m55614a((SpaceEditText) this.f26627c.findViewById(R.id.share_input_edit)).debounce(300, TimeUnit.MILLISECONDS, C11678b.m48480d()).observeOn(C11678b.m48481e()).subscribe(new C9867f(this), C9868g.f26640a);
        if (this.f26634k) {
            ((SpaceEditText) this.f26627c.findViewById(R.id.share_input_edit)).postDelayed(this.f26629f, 50);
        }
    }

    /* renamed from: a */
    public void setViewDelegate(ITopbarContract.IView.IDelegate aVar) {
        this.f26626b = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/TopbarView$create$3", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.b.f$d */
    public static final class C9865d extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ TopbarView f26637a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9865d(TopbarView fVar) {
            this.f26637a = fVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            ITopbarContract.IView.IDelegate aVar = this.f26637a.f26626b;
            if (aVar != null) {
                aVar.mo37506c();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.b.f$g */
    static final class C9868g<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C9868g f26640a = new C9868g();

        C9868g() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a("TopbarView", th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.b.f$b */
    static final class View$OnClickListenerC9863b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TopbarView f26635a;

        View$OnClickListenerC9863b(TopbarView fVar) {
            this.f26635a = fVar;
        }

        public final void onClick(View view) {
            ITopbarContract.IView.IDelegate aVar = this.f26635a.f26626b;
            if (aVar != null) {
                aVar.mo37501a();
            }
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar.ITopbarContract.IView
    /* renamed from: a */
    public void mo37498a(ArrayList<UserInfo> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "userInfos");
        this.f26625a.mo70690f(arrayList);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.b.f$c */
    static final class View$OnClickListenerC9864c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TopbarView f26636a;

        View$OnClickListenerC9864c(TopbarView fVar) {
            this.f26636a = fVar;
        }

        public final void onClick(View view) {
            ITopbarContract.IView.IDelegate aVar = this.f26636a.f26626b;
            if (aVar != null) {
                aVar.mo37505b();
            }
            ((SpaceEditText) this.f26636a.f26627c.findViewById(R.id.share_input_edit)).setText("");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "charSequence", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.b.f$f */
    static final class C9867f<T> implements Consumer<CharSequence> {

        /* renamed from: a */
        final /* synthetic */ TopbarView f26639a;

        C9867f(TopbarView fVar) {
            this.f26639a = fVar;
        }

        /* renamed from: a */
        public final void accept(CharSequence charSequence) {
            String str;
            TopbarView fVar = this.f26639a;
            if (charSequence == null || (str = charSequence.toString()) == null) {
                str = "";
            }
            fVar.mo37513a(str);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar.ITopbarContract.IView
    /* renamed from: a */
    public void mo37497a(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        this.f26625a.mo70676b(userInfo);
        ((RecyclerView) this.f26627c.findViewById(R.id.permSearchUserSelectedView)).scrollToPosition(this.f26625a.mo70673b().size() - 1);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar.ITopbarContract.IView
    /* renamed from: b */
    public void mo37500b(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        int indexOf = this.f26625a.mo70673b().indexOf(userInfo);
        if (indexOf >= 0 && indexOf < this.f26625a.mo70673b().size()) {
            this.f26625a.mo70682c(indexOf);
        }
    }

    /* renamed from: a */
    public final void mo37513a(String str) {
        int i;
        ITopbarContract.IView.IDelegate aVar = this.f26626b;
        if (aVar != null) {
            aVar.mo37503a(str);
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        ImageView imageView = (ImageView) this.f26627c.findViewById(R.id.share_search_clear_icon);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.share_search_clear_icon");
        if (isEmpty) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
    }

    public void onFocusChange(View view, boolean z) {
        ITopbarContract.IView.IDelegate aVar = this.f26626b;
        if (aVar != null) {
            aVar.mo37504a(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u000128\u0010\u0002\u001a4\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005*\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003¨\u0006\u00010\u0003¨\u0006\u00012\u000e\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\b0\b2\u0006\u0010\t\u001a\u00020\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "kotlin.jvm.PlatformType", "Lcom/chad/library/adapter/base/BaseViewHolder;", "<anonymous parameter 1>", "Landroid/view/View;", "position", "", "onItemClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.b.f$e */
    static final class C9866e implements BaseQuickAdapter.AbstractC20911a {

        /* renamed from: a */
        final /* synthetic */ TopbarView f26638a;

        C9866e(TopbarView fVar) {
            this.f26638a = fVar;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter.AbstractC20911a
        public final void onItemClick(BaseQuickAdapter<Object, C20923c> baseQuickAdapter, View view, int i) {
            ITopbarContract.IView.IDelegate aVar = this.f26638a.f26626b;
            if (aVar != null) {
                Object obj = this.f26638a.f26625a.mo70673b().get(i);
                Intrinsics.checkExpressionValueIsNotNull(obj, "selectedUserAdapter.data[position]");
                aVar.mo37502a((UserInfo) obj);
            }
        }
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3 && i != 6) {
            return false;
        }
        C10548d.m43696a((Context) this.f26630g);
        return true;
    }

    public TopbarView(Activity activity, View view, String str, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkParameterIsNotNull(activity, "context");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(str, "title");
        this.f26630g = activity;
        this.f26627c = view;
        this.f26631h = str;
        this.f26632i = z;
        this.f26633j = z2;
        this.f26634k = z3;
    }
}
