package com.ss.android.lark.mm.module.record.detail.menu;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.menu.MmMenu;
import com.ss.android.lark.mm.module.detail.menu.MmMenuType;
import com.ss.android.lark.mm.module.record.detail.menu.RecordMenu;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.mm.widget.BaseDialog;
import com.ss.android.lark.mm.widget.BoldTextView;
import com.ss.android.lark.mm.widget.MmMenuView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\tH\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/menu/RecordMenuDialog;", "Lcom/ss/android/lark/mm/widget/BaseDialog;", "url", "", "dependency", "Lcom/ss/android/lark/mm/module/record/detail/menu/RecordMenu$IMenuDependency;", "(Ljava/lang/String;Lcom/ss/android/lark/mm/module/record/detail/menu/RecordMenu$IMenuDependency;)V", "exitTranslate", "Lkotlin/Function0;", "", "getExitTranslate", "()Lkotlin/jvm/functions/Function0;", "setExitTranslate", "(Lkotlin/jvm/functions/Function0;)V", "startTranslate", "getStartTranslate", "setStartTranslate", "getUrl", "()Ljava/lang/String;", "initRecyclerView", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "MoreAdapter", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.detail.menu.c */
public final class RecordMenuDialog extends BaseDialog {

    /* renamed from: c */
    private Function0<Unit> f118093c;

    /* renamed from: d */
    private Function0<Unit> f118094d;

    /* renamed from: e */
    private final String f118095e;

    /* renamed from: f */
    private final RecordMenu.IMenuDependency f118096f;

    /* renamed from: g */
    private HashMap f118097g;

    @Override // com.ss.android.lark.mm.widget.BaseDialog
    /* renamed from: a */
    public View mo142944a(int i) {
        if (this.f118097g == null) {
            this.f118097g = new HashMap();
        }
        View view = (View) this.f118097g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f118097g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.widget.BaseDialog
    /* renamed from: f */
    public void mo142945f() {
        HashMap hashMap = this.f118097g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.ss.android.lark.mm.widget.BaseDialog, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo142945f();
    }

    /* renamed from: g */
    public final Function0<Unit> mo164722g() {
        return this.f118093c;
    }

    /* renamed from: h */
    public final Function0<Unit> mo164723h() {
        return this.f118094d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/menu/RecordMenuDialog$MoreAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "items", "", "Lcom/ss/android/lark/mm/module/detail/menu/MmMenu;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "update", "menuList", "", "MoreViewHolder", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.menu.c$a */
    public static final class MoreAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* renamed from: a */
        private final List<MmMenu> f118098a = new ArrayList();

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f118098a.size();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/menu/RecordMenuDialog$MoreAdapter$MoreViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lcom/ss/android/lark/mm/widget/MmMenuView;", "(Lcom/ss/android/lark/mm/widget/MmMenuView;)V", "menuView", "bindData", "", "menu", "Lcom/ss/android/lark/mm/module/detail/menu/MmMenu;", "isLastPosition", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.record.detail.menu.c$a$a */
        public static final class MoreViewHolder extends RecyclerView.ViewHolder {

            /* renamed from: a */
            private MmMenuView f118099a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public MoreViewHolder(MmMenuView mmMenuView) {
                super(mmMenuView);
                Intrinsics.checkParameterIsNotNull(mmMenuView, "view");
                this.f118099a = mmMenuView;
            }

            /* renamed from: a */
            public final void mo164725a(MmMenu cVar, boolean z) {
                Intrinsics.checkParameterIsNotNull(cVar, "menu");
                this.f118099a.mo165617a(cVar, z, "record_menu");
            }
        }

        /* renamed from: a */
        public final void mo164724a(List<MmMenu> list) {
            Intrinsics.checkParameterIsNotNull(list, "menuList");
            this.f118098a.clear();
            this.f118098a.addAll(list);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            Context context = viewGroup.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
            return new MoreViewHolder(new MmMenuView(context));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
            if (viewHolder instanceof MoreViewHolder) {
                MoreViewHolder aVar = (MoreViewHolder) viewHolder;
                MmMenu cVar = this.f118098a.get(i);
                boolean z = true;
                if (i != getItemCount() - 1) {
                    z = false;
                }
                aVar.mo164725a(cVar, z);
            }
        }
    }

    /* renamed from: i */
    private final void m185796i() {
        RecyclerView recyclerView = (RecyclerView) mo142944a(R.id.rvMenu);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvMenu");
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView2 = (RecyclerView) mo142944a(R.id.rvMenu);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rvMenu");
        recyclerView2.setAdapter(new MoreAdapter());
        ArrayList arrayList = new ArrayList();
        MmBaseInfo a = this.f118096f.mo164713a();
        C47084f fVar = new C47084f(a.getMeetingId(), true, a.getObjectToken(), a.getObjectType(), a.isCanModify());
        arrayList.add(RecordMenu.f118091a.mo164712a(MmMenuType.Share, this, this.f118095e, this.f118096f, fVar));
        arrayList.add(RecordMenu.f118091a.mo164712a(MmMenuType.Translate, this, this.f118095e, this.f118096f, fVar));
        RecyclerView recyclerView3 = (RecyclerView) mo142944a(R.id.rvMenu);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "rvMenu");
        RecyclerView.Adapter adapter = recyclerView3.getAdapter();
        if (adapter != null) {
            ((MoreAdapter) adapter).mo164724a(arrayList);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.mm.module.record.detail.menu.RecordMenuDialog.MoreAdapter");
    }

    /* renamed from: a */
    public final void mo164720a(Function0<Unit> function0) {
        this.f118093c = function0;
    }

    /* renamed from: b */
    public final void mo164721b(Function0<Unit> function0) {
        this.f118094d = function0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.menu.c$b */
    static final class C46910b extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ RecordMenuDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46910b(RecordMenuDialog cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            this.this$0.mo5513b();
        }
    }

    public RecordMenuDialog(String str, RecordMenu.IMenuDependency aVar) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f118095e = str;
        this.f118096f = aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        BoldTextView boldTextView = (BoldTextView) mo142944a(R.id.tvTopic);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvTopic");
        boldTextView.setText(this.f118096f.mo164713a().getTopic());
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo142944a(R.id.close);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "close");
        C47110e.m186573a(appCompatImageView, new C46910b(this));
        m185796i();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.mm_dialog_record_menu, viewGroup, false);
    }
}
