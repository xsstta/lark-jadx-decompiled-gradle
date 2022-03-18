package com.bytedance.ee.bear.pathnavigationview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ee.bear.pathnavigationview.PathNavigationModel;
import com.bytedance.ee.util.p718t.C13749l;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u000f*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003:\u0002\u000f\u0010B\u0005¢\u0006\u0002\u0010\u0005J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/pathnavigationview/PathNavigationAdapter;", "M", "Lcom/bytedance/ee/bear/pathnavigationview/PathNavigationModel;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/bytedance/ee/bear/pathnavigationview/PathNavigationAdapter$NodeViewHolder;", "()V", "itemClickListener", "Lcom/bytedance/ee/bear/pathnavigationview/PathNodeClickListener;", "convert", "", "helper", "item", "(Lcom/bytedance/ee/bear/pathnavigationview/PathNavigationAdapter$NodeViewHolder;Lcom/bytedance/ee/bear/pathnavigationview/PathNavigationModel;)V", "setNodeClickListener", "listener", "Companion", "NodeViewHolder", "biz-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.k.a */
public final class PathNavigationAdapter<M extends PathNavigationModel> extends BaseQuickAdapter<M, NodeViewHolder> {

    /* renamed from: b */
    public static final Companion f21386b = new Companion(null);

    /* renamed from: a */
    public PathNodeClickListener<M> f21387a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/pathnavigationview/PathNavigationAdapter$Companion;", "", "()V", "SIDE_MARGIN_DP", "", "biz-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.k.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PathNavigationAdapter() {
        super((int) R.layout.biz_widget_path_navigation_item);
    }

    /* renamed from: a */
    public final void mo30862a(PathNodeClickListener<M> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f21387a = cVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/pathnavigationview/PathNavigationAdapter$NodeViewHolder;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "biz-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.k.a$b */
    public static final class NodeViewHolder extends C20923c {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NodeViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "M", "Lcom/bytedance/ee/bear/pathnavigationview/PathNavigationModel;", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.k.a$c */
    public static final class View$OnClickListenerC7956c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PathNavigationAdapter f21388a;

        /* renamed from: b */
        final /* synthetic */ boolean f21389b;

        /* renamed from: c */
        final /* synthetic */ int f21390c;

        /* renamed from: d */
        final /* synthetic */ PathNavigationModel f21391d;

        View$OnClickListenerC7956c(PathNavigationAdapter aVar, boolean z, int i, PathNavigationModel bVar) {
            this.f21388a = aVar;
            this.f21389b = z;
            this.f21390c = i;
            this.f21391d = bVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: com.bytedance.ee.bear.k.c<M extends com.bytedance.ee.bear.k.b> */
        /* JADX WARN: Multi-variable type inference failed */
        public final void onClick(View view) {
            if (!this.f21389b) {
                PathNavigationAdapter aVar = this.f21388a;
                aVar.mo70690f(aVar.mo70673b().subList(0, this.f21390c + 1));
                PathNodeClickListener<M> cVar = this.f21388a.f21387a;
                if (cVar != 0) {
                    cVar.mo30865a(this.f21390c, this.f21391d);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16806a(NodeViewHolder bVar, M m) {
        int i;
        int i2;
        Intrinsics.checkParameterIsNotNull(bVar, "helper");
        Intrinsics.checkParameterIsNotNull(m, "item");
        int indexOf = mo70673b().indexOf(m);
        boolean z = true;
        if (indexOf != mo70673b().size() - 1) {
            z = false;
        }
        if (z) {
            i = R.color.text_caption;
        } else {
            i = R.color.primary_pri_500;
        }
        View view = bVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "helper.itemView");
        int color = view.getResources().getColor(i);
        View view2 = bVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "helper.itemView");
        ((TextView) view2.findViewById(R.id.navigationNodeName)).setTextColor(color);
        View view3 = bVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "helper.itemView");
        ImageView imageView = (ImageView) view3.findViewById(R.id.navigationNodeNext);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "helper.itemView.navigationNodeNext");
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        imageView.setVisibility(i2);
        View view4 = bVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "helper.itemView");
        view4.setClickable(!z);
        View view5 = bVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "helper.itemView");
        TextView textView = (TextView) view5.findViewById(R.id.navigationNodeName);
        Intrinsics.checkExpressionValueIsNotNull(textView, "helper.itemView.navigationNodeName");
        textView.setText(m.mo30864a());
        bVar.itemView.setOnClickListener(new View$OnClickListenerC7956c(this, z, indexOf, m));
        if (indexOf == 0) {
            bVar.itemView.setPadding(C13749l.m55738a(16), 0, 0, 0);
        } else if (z) {
            bVar.itemView.setPadding(0, 0, C13749l.m55738a(16), 0);
        } else {
            bVar.itemView.setPadding(0, 0, 0, 0);
        }
    }
}
