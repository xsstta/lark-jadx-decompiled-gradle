package com.ss.android.photoeditor.ve.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.ttve.utils.C60275a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001f\u001a\u00020\tH\u0016J\u0006\u0010 \u001a\u00020\tJ\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\tH\u0016J\u0018\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\tH\u0016J\u000e\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\tR\u0014\u0010\b\u001a\u00020\tXD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/photoeditor/ve/view/ColorListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/photoeditor/ve/view/ColorViewHolder;", "context", "Landroid/content/Context;", "colorArray", "", "(Landroid/content/Context;[I)V", "DEFAULT_POSITOIN", "", "getDEFAULT_POSITOIN", "()I", "getColorArray", "()[I", "setColorArray", "([I)V", "colorMargin", "", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "layoutId", "getLayoutId", "onColorSelectedListener", "Lcom/ss/android/photoeditor/ve/view/OnColorSelectedListener;", "getOnColorSelectedListener", "()Lcom/ss/android/photoeditor/ve/view/OnColorSelectedListener;", "setOnColorSelectedListener", "(Lcom/ss/android/photoeditor/ve/view/OnColorSelectedListener;)V", "selectedIndex", "getItemCount", "getSelectIndex", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setSelectIndex", "selectIndex", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.photoeditor.ve.view.a */
public final class ColorListAdapter extends RecyclerView.Adapter<ColorViewHolder> {

    /* renamed from: a */
    public int f149464a = this.f149465b;

    /* renamed from: b */
    private final int f149465b;

    /* renamed from: c */
    private OnColorSelectedListener f149466c;

    /* renamed from: d */
    private final int f149467d = R.layout.color_item_view;

    /* renamed from: e */
    private float f149468e;

    /* renamed from: f */
    private Context f149469f;

    /* renamed from: g */
    private int[] f149470g;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f149470g.length;
    }

    /* renamed from: a */
    public final OnColorSelectedListener mo204165a() {
        return this.f149466c;
    }

    /* renamed from: a */
    public final void mo204166a(int i) {
        this.f149464a = i;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo204168a(OnColorSelectedListener cVar) {
        this.f149466c = cVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.view.a$a */
    public static final class View$OnClickListenerC59956a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ColorListAdapter f149471a;

        /* renamed from: b */
        final /* synthetic */ ColorViewHolder f149472b;

        View$OnClickListenerC59956a(ColorListAdapter aVar, ColorViewHolder bVar) {
            this.f149471a = aVar;
            this.f149472b = bVar;
        }

        public final void onClick(View view) {
            int i = this.f149471a.f149464a;
            this.f149471a.f149464a = this.f149472b.getAdapterPosition();
            this.f149471a.notifyItemChanged(i);
            ColorListAdapter aVar = this.f149471a;
            aVar.notifyItemChanged(aVar.f149464a);
            OnColorSelectedListener a = this.f149471a.mo204165a();
            if (a != null) {
                a.mo204010a(this.f149472b.getAdapterPosition());
            }
        }
    }

    /* renamed from: a */
    public ColorViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f149467d, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new ColorViewHolder(inflate);
    }

    public ColorListAdapter(Context context, int[] iArr) {
        Intrinsics.checkParameterIsNotNull(iArr, "colorArray");
        this.f149469f = context;
        this.f149470g = iArr;
        this.f149468e = C60275a.m234185a(context, 10.0f);
        float f = (float) 7;
        if (((((float) C60275a.m234186a(this.f149469f)) - C60275a.m234185a(this.f149469f, 40.0f)) - C60275a.m234185a(this.f149469f, 68.0f)) - (C60275a.m234185a(this.f149469f, 36.0f) * f) < ((float) 0)) {
            this.f149468e = (((((float) C60275a.m234186a(this.f149469f)) - C60275a.m234185a(this.f149469f, 40.0f)) - C60275a.m234185a(this.f149469f, 68.0f)) - (C60275a.m234185a(this.f149469f, 26.0f) * f)) / f;
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(ColorViewHolder bVar, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        if (i >= 0 && i < this.f149470g.length) {
            View view = bVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = (int) this.f149468e;
                if (this.f149464a == i) {
                    z = true;
                } else {
                    z = false;
                }
                bVar.mo204171a(this.f149470g[i]);
                bVar.itemView.setOnClickListener(new View$OnClickListenerC59956a(this, bVar));
                bVar.mo204170a().setSelected(z);
                bVar.mo204172b();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }
}
