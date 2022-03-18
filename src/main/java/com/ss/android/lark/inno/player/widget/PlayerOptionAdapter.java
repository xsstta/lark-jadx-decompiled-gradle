package com.ss.android.lark.inno.player.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\b\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0011\u001a\u00020\nH\u0016J\u001c\u0010\u0012\u001a\u00020\u000b2\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\nH\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\nH\u0016J\u001a\u0010\u0017\u001a\u00020\u000b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tJ\u0018\u0010\u0019\u001a\u00020\u000b2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001bH\u0007J\u0015\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u001eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006 "}, d2 = {"Lcom/ss/android/lark/inno/player/widget/PlayerOptionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/inno/player/widget/PlayerOptionAdapter$VH;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "itemClickListener", "Lkotlin/Function1;", "", "", "items", "", "", "selection", "Ljava/lang/Integer;", "getItemCount", "onBindViewHolder", "p0", "p1", "onCreateViewHolder", "Landroid/view/ViewGroup;", "setItemClickListener", "listener", "setItems", "i", "", "setSelection", "s", "(Ljava/lang/Integer;)V", "VH", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.inno.player.widget.a */
public final class PlayerOptionAdapter extends RecyclerView.Adapter<VH> {

    /* renamed from: a */
    public Function1<? super Integer, Unit> f100346a;

    /* renamed from: b */
    private Integer f100347b;

    /* renamed from: c */
    private final List<String> f100348c = new ArrayList();

    /* renamed from: d */
    private final Context f100349d;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f100348c.size();
    }

    /* renamed from: a */
    public final void mo142941a(Function1<? super Integer, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "listener");
        this.f100346a = function1;
    }

    public PlayerOptionAdapter(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f100349d = context;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/inno/player/widget/PlayerOptionAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ss/android/lark/inno/player/widget/PlayerOptionAdapter;Landroid/view/View;)V", "bindData", "", "content", "", "idx", "", "selected", "", "bindData$mm_release", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.inno.player.widget.a$a */
    public final class VH extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ PlayerOptionAdapter f100350a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.inno.player.widget.a$a$a */
        public static final class View$OnClickListenerC39084a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ VH f100351a;

            /* renamed from: b */
            final /* synthetic */ int f100352b;

            View$OnClickListenerC39084a(VH aVar, int i) {
                this.f100351a = aVar;
                this.f100352b = i;
            }

            public final void onClick(View view) {
                this.f100351a.f100350a.mo142939a(Integer.valueOf(this.f100352b));
                Function1<? super Integer, Unit> function1 = this.f100351a.f100350a.f100346a;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(this.f100352b));
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public VH(PlayerOptionAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f100350a = aVar;
        }

        /* renamed from: a */
        public final void mo142942a(String str, int i, boolean z) {
            int i2;
            Intrinsics.checkParameterIsNotNull(str, "content");
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(R.id.tv_text);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.tv_text");
            textView.setText(str);
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            ImageView imageView = (ImageView) view2.findViewById(R.id.iv_done);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.iv_done");
            if (z) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            imageView.setVisibility(i2);
            this.itemView.setOnClickListener(new View$OnClickListenerC39084a(this, i));
        }
    }

    /* renamed from: a */
    public final void mo142939a(Integer num) {
        if (!Intrinsics.areEqual(this.f100347b, num)) {
            Integer num2 = this.f100347b;
            this.f100347b = num;
            if (num2 != null) {
                notifyItemChanged(num2.intValue());
            }
            if (num != null) {
                notifyItemChanged(num.intValue());
            }
        }
    }

    /* renamed from: a */
    public final void mo142940a(List<String> list) {
        this.f100348c.clear();
        if (list != null) {
            this.f100348c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "p0");
        View inflate = LayoutInflater.from(this.f100349d).inflate(R.layout.mm_item_player_option_diloag, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new VH(this, inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(VH aVar, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(aVar, "p0");
        String str = this.f100348c.get(i);
        Integer num = this.f100347b;
        if (num != null && num.intValue() == i) {
            z = true;
        } else {
            z = false;
        }
        aVar.mo142942a(str, i, z);
    }
}
