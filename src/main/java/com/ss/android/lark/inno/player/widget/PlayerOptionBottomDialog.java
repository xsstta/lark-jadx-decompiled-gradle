package com.ss.android.lark.inno.player.widget;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.widget.BaseDialog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J&\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/inno/player/widget/PlayerOptionBottomDialog;", "Lcom/ss/android/lark/mm/widget/BaseDialog;", "()V", "builder", "Lcom/ss/android/lark/inno/player/widget/PlayerOptionBottomDialog$Builder;", "(Lcom/ss/android/lark/inno/player/widget/PlayerOptionBottomDialog$Builder;)V", "getBuilder", "()Lcom/ss/android/lark/inno/player/widget/PlayerOptionBottomDialog$Builder;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "Builder", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.inno.player.widget.b */
public final class PlayerOptionBottomDialog extends BaseDialog {

    /* renamed from: c */
    private final Builder f100353c;

    /* renamed from: d */
    private HashMap f100354d;

    @Override // com.ss.android.lark.mm.widget.BaseDialog
    /* renamed from: a */
    public View mo142944a(int i) {
        if (this.f100354d == null) {
            this.f100354d = new HashMap();
        }
        View view = (View) this.f100354d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f100354d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.widget.BaseDialog
    /* renamed from: f */
    public void mo142945f() {
        HashMap hashMap = this.f100354d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.ss.android.lark.mm.widget.BaseDialog, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo142945f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b\u001eJ\r\u0010\u001f\u001a\u00020\u0000H\u0000¢\u0006\u0002\b R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lcom/ss/android/lark/inno/player/widget/PlayerOptionBottomDialog$Builder;", "", "()V", "itemClickListener", "Lcom/ss/android/lark/inno/player/widget/PlayerOptionBottomDialog$Builder$OnItemClickListener;", "getItemClickListener", "()Lcom/ss/android/lark/inno/player/widget/PlayerOptionBottomDialog$Builder$OnItemClickListener;", "setItemClickListener", "(Lcom/ss/android/lark/inno/player/widget/PlayerOptionBottomDialog$Builder$OnItemClickListener;)V", "items", "", "", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "selection", "", "getSelection", "()Ljava/lang/Integer;", "setSelection", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "title", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "build", "Lcom/ss/android/lark/inno/player/widget/PlayerOptionBottomDialog;", "build$mm_release", "copy", "copy$mm_release", "OnItemClickListener", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.inno.player.widget.b$a */
    public static final class Builder {

        /* renamed from: a */
        private String f100355a;

        /* renamed from: b */
        private List<String> f100356b;

        /* renamed from: c */
        private Integer f100357c;

        /* renamed from: d */
        private OnItemClickListener f100358d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/inno/player/widget/PlayerOptionBottomDialog$Builder$OnItemClickListener;", "", "onClick", "", "dialog", "Landroidx/fragment/app/DialogFragment;", "idx", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.inno.player.widget.b$a$a */
        public interface OnItemClickListener {
            void onClick(DialogInterface$OnCancelListenerC1021b bVar, int i);
        }

        /* renamed from: a */
        public final String mo142946a() {
            return this.f100355a;
        }

        /* renamed from: b */
        public final List<String> mo142951b() {
            return this.f100356b;
        }

        /* renamed from: c */
        public final Integer mo142952c() {
            return this.f100357c;
        }

        /* renamed from: d */
        public final OnItemClickListener mo142953d() {
            return this.f100358d;
        }

        /* renamed from: e */
        public final PlayerOptionBottomDialog mo142954e() {
            return new PlayerOptionBottomDialog(mo142955f());
        }

        /* renamed from: f */
        public final Builder mo142955f() {
            Builder aVar = new Builder();
            aVar.f100355a = this.f100355a;
            ArrayList arrayList = new ArrayList();
            aVar.f100356b = arrayList;
            List<String> list = this.f100356b;
            if (!(list == null || arrayList == null)) {
                arrayList.addAll(list);
            }
            aVar.f100357c = this.f100357c;
            aVar.f100358d = this.f100358d;
            return aVar;
        }

        /* renamed from: a */
        public final void mo142947a(OnItemClickListener aVar) {
            this.f100358d = aVar;
        }

        /* renamed from: a */
        public final void mo142948a(Integer num) {
            this.f100357c = num;
        }

        /* renamed from: a */
        public final void mo142949a(String str) {
            this.f100355a = str;
        }

        /* renamed from: a */
        public final void mo142950a(List<String> list) {
            this.f100356b = list;
        }
    }

    public PlayerOptionBottomDialog() {
        this(null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/inno/player/widget/PlayerOptionBottomDialog$onViewCreated$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.inno.player.widget.b$b */
    static final class View$OnClickListenerC39085b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PlayerOptionBottomDialog f100359a;

        View$OnClickListenerC39085b(PlayerOptionBottomDialog bVar) {
            this.f100359a = bVar;
        }

        public final void onClick(View view) {
            this.f100359a.mo5513b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/inno/player/widget/PlayerOptionBottomDialog$onViewCreated$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.inno.player.widget.b$c */
    static final class C39086c extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ Builder $b;
        final /* synthetic */ PlayerOptionBottomDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39086c(Builder aVar, PlayerOptionBottomDialog bVar) {
            super(1);
            this.$b = aVar;
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            Builder.OnItemClickListener d = this.$b.mo142953d();
            if (d != null) {
                d.onClick(this.this$0, i);
            }
        }
    }

    public PlayerOptionBottomDialog(Builder aVar) {
        this.f100353c = aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        Builder aVar = this.f100353c;
        if (aVar != null) {
            TextView textView = (TextView) mo142944a(R.id.tv_title);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tv_title");
            textView.setText(aVar.mo142946a());
            ((ImageView) mo142944a(R.id.iv_close)).setOnClickListener(new View$OnClickListenerC39085b(this));
            RecyclerView recyclerView = (RecyclerView) mo142944a(R.id.rv_list);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rv_list");
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
            Context requireContext = requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            PlayerOptionAdapter aVar2 = new PlayerOptionAdapter(requireContext);
            aVar2.mo142939a(aVar.mo142952c());
            aVar2.mo142940a(aVar.mo142951b());
            aVar2.mo142941a(new C39086c(aVar, this));
            RecyclerView recyclerView2 = (RecyclerView) mo142944a(R.id.rv_list);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rv_list");
            recyclerView2.setAdapter(aVar2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.mm_layout_player_option_dialog, viewGroup, false);
    }
}
