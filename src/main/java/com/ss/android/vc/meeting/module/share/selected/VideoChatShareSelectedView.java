package com.ss.android.vc.meeting.module.share.selected;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.meeting.module.share.VideoChatShareItem;
import com.ss.android.vc.meeting.module.share.selected.IVideoChatShareSelectedContract;
import com.ss.android.vc.meeting.module.share.selected.VideoChatShareSelectedPresenter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020-H\u0016J\u0006\u0010/\u001a\u00020-J\b\u00100\u001a\u00020-H\u0002J\b\u00101\u001a\u00020-H\u0002J\b\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u000203H\u0016J \u00105\u001a\u00020-2\u0016\u00106\u001a\u0012\u0012\u0004\u0012\u00020807j\b\u0012\u0004\u0012\u000208`9H\u0016J\u0010\u0010:\u001a\u00020-2\u0006\u0010;\u001a\u00020\u0016H\u0016J\u0018\u0010<\u001a\u00020-2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"¨\u0006@"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectedView;", "Lcom/ss/android/vc/meeting/module/share/selected/IVideoChatShareSelectedContract$IView;", "rootView", "Landroid/view/View;", "dependency", "Lcom/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectedPresenter$ViewDependency;", "(Landroid/view/View;Lcom/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectedPresenter$ViewDependency;)V", "getDependency", "()Lcom/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectedPresenter$ViewDependency;", "goBackIcon", "Lcom/ss/android/vc/common/widget/IconFontView;", "getGoBackIcon", "()Lcom/ss/android/vc/common/widget/IconFontView;", "setGoBackIcon", "(Lcom/ss/android/vc/common/widget/IconFontView;)V", "mAdapter", "Lcom/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectListAdapter;", "getMAdapter", "()Lcom/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectListAdapter;", "setMAdapter", "(Lcom/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectListAdapter;)V", "mViewDelegate", "Lcom/ss/android/vc/meeting/module/share/selected/IVideoChatShareSelectedContract$IView$Delegate;", "getMViewDelegate", "()Lcom/ss/android/vc/meeting/module/share/selected/IVideoChatShareSelectedContract$IView$Delegate;", "setMViewDelegate", "(Lcom/ss/android/vc/meeting/module/share/selected/IVideoChatShareSelectedContract$IView$Delegate;)V", "getRootView", "()Landroid/view/View;", "saveView", "Landroid/widget/TextView;", "getSaveView", "()Landroid/widget/TextView;", "setSaveView", "(Landroid/widget/TextView;)V", "selectedList", "Landroidx/recyclerview/widget/RecyclerView;", "getSelectedList", "()Landroidx/recyclerview/widget/RecyclerView;", "setSelectedList", "(Landroidx/recyclerview/widget/RecyclerView;)V", "titleView", "getTitleView", "setTitleView", "create", "", "destroy", "initRecyclerView", "initSaveView", "initTitleViewAsDesktop", "isReachListBottom", "", "isReachListTop", "notifyData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "Lkotlin/collections/ArrayList;", "setViewDelegate", "viewDelegate", "updateTitle", "p2pCount", "", "groupCount", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.share.a.g */
public final class VideoChatShareSelectedView implements IVideoChatShareSelectedContract.IView {

    /* renamed from: a */
    public IVideoChatShareSelectedContract.IView.Delegate f158589a;

    /* renamed from: b */
    public VideoChatShareSelectListAdapter f158590b;

    /* renamed from: c */
    private RecyclerView f158591c;

    /* renamed from: d */
    private TextView f158592d;

    /* renamed from: e */
    private TextView f158593e;

    /* renamed from: f */
    private IconFontView f158594f;

    /* renamed from: g */
    private final View f158595g;

    /* renamed from: h */
    private final VideoChatShareSelectedPresenter.ViewDependency f158596h;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: d */
    public final VideoChatShareSelectedPresenter.ViewDependency mo217584d() {
        return this.f158596h;
    }

    /* renamed from: f */
    private final void m246520f() {
        this.f158592d.setOnClickListener(new View$OnClickListenerC62951b(this));
    }

    /* renamed from: a */
    public final IVideoChatShareSelectedContract.IView.Delegate mo217580a() {
        IVideoChatShareSelectedContract.IView.Delegate aVar = this.f158589a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        return aVar;
    }

    /* renamed from: b */
    public final VideoChatShareSelectListAdapter mo217582b() {
        VideoChatShareSelectListAdapter cVar = this.f158590b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        return cVar;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m246520f();
        mo217583c();
        m246519e();
    }

    /* renamed from: e */
    private final void m246519e() {
        if (DesktopUtil.m144307b()) {
            this.f158594f.setVisibility(0);
            this.f158594f.setOnClickListener(new View$OnClickListenerC62952c(this));
            this.f158592d.setVisibility(8);
            this.f158593e.setTextSize(16.0f);
            ViewGroup.LayoutParams layoutParams = this.f158593e.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = UIHelper.dp2px(14.0f);
                layoutParams2.f2815g = 0;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        this.f158594f.setOnClickListener(new View$OnClickListenerC62953d(this));
    }

    /* renamed from: c */
    public final void mo217583c() {
        this.f158591c.setLayoutManager(new LinearLayoutManager(this.f158595g.getContext(), 1, false));
        Context context = this.f158595g.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
        IVideoChatShareSelectedContract.IView.Delegate aVar = this.f158589a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        VideoChatShareSelectListAdapter cVar = new VideoChatShareSelectListAdapter(context, aVar.mo217557c());
        this.f158590b = cVar;
        RecyclerView recyclerView = this.f158591c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        recyclerView.setAdapter(cVar);
        VideoChatShareSelectListAdapter cVar2 = this.f158590b;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        cVar2.mo217562a(new C62950a(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectedView$initRecyclerView$1", "Lcom/ss/android/vc/meeting/module/share/selected/OnVideoChatShareSelectedItemClickListener;", "onDelete", "", "item", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "position", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.a.g$a */
    public static final class C62950a implements OnVideoChatShareSelectedItemClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareSelectedView f158597a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62950a(VideoChatShareSelectedView gVar) {
            this.f158597a = gVar;
        }

        @Override // com.ss.android.vc.meeting.module.share.selected.OnVideoChatShareSelectedItemClickListener
        /* renamed from: a */
        public void mo217559a(VideoChatShareItem videoChatShareItem, int i) {
            Intrinsics.checkParameterIsNotNull(videoChatShareItem, "item");
            this.f158597a.mo217580a().mo217554a(videoChatShareItem, i);
            this.f158597a.mo217582b().notifyDataSetChanged();
            VideoChatShareSelectedView gVar = this.f158597a;
            gVar.mo217552a(gVar.mo217580a().mo217557c().size() - this.f158597a.mo217580a().mo217558d(), this.f158597a.mo217580a().mo217558d());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectedView$initTitleViewAsDesktop$1", "Landroid/view/View$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.a.g$c */
    public static final class View$OnClickListenerC62952c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareSelectedView f158599a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnClickListenerC62952c(VideoChatShareSelectedView gVar) {
            this.f158599a = gVar;
        }

        public void onClick(View view) {
            this.f158599a.mo217584d().mo217579a(this.f158599a.mo217580a().mo217555a(), this.f158599a.mo217580a().mo217556b());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectedView$initTitleViewAsDesktop$2", "Landroid/view/View$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.a.g$d */
    public static final class View$OnClickListenerC62953d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareSelectedView f158600a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnClickListenerC62953d(VideoChatShareSelectedView gVar) {
            this.f158600a = gVar;
        }

        public void onClick(View view) {
            this.f158600a.mo217584d().mo217578a();
        }
    }

    /* renamed from: a */
    public void setViewDelegate(IVideoChatShareSelectedContract.IView.Delegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewDelegate");
        this.f158589a = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.a.g$b */
    public static final class View$OnClickListenerC62951b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareSelectedView f158598a;

        View$OnClickListenerC62951b(VideoChatShareSelectedView gVar) {
            this.f158598a = gVar;
        }

        public final void onClick(View view) {
            this.f158598a.mo217584d().mo217579a(this.f158598a.mo217580a().mo217555a(), this.f158598a.mo217580a().mo217556b());
        }
    }

    @Override // com.ss.android.vc.meeting.module.share.selected.IVideoChatShareSelectedContract.IView
    /* renamed from: a */
    public void mo217553a(ArrayList<VideoChatShareItem> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        VideoChatShareSelectListAdapter cVar = this.f158590b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        cVar.mo217564a(arrayList);
    }

    @Override // com.ss.android.vc.meeting.module.share.selected.IVideoChatShareSelectedContract.IView
    /* renamed from: a */
    public void mo217552a(int i, int i2) {
        TextView textView = this.f158593e;
        textView.setText(UIHelper.getString(R.string.View_M_Selected) + (i + i2));
    }

    public VideoChatShareSelectedView(View view, VideoChatShareSelectedPresenter.ViewDependency bVar) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        this.f158595g = view;
        this.f158596h = bVar;
        View findViewById = view.findViewById(R.id.selectedlist);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.selectedlist)");
        this.f158591c = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.selected_save);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.selected_save)");
        this.f158592d = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.selected_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.selected_title)");
        this.f158593e = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.share_selected_dialog_go_back);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.findViewById(R.…_selected_dialog_go_back)");
        this.f158594f = (IconFontView) findViewById4;
    }
}
