package com.bytedance.ee.bear.document.icon;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.contract.icon.IconInfo;
import com.bytedance.ee.bear.document.icon.DocIconNetResult;
import com.bytedance.ee.bear.p376e.p377a.AbstractC7588a;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J\u0014\u0010\u001a\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001cJ\u0010\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/bytedance/ee/bear/document/icon/IconImageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/document/icon/IconImageAdapter$ViewHolder;", "()V", "iconInfoList", "", "Lcom/bytedance/ee/bear/document/icon/DocIconNetResult$Icon;", "iconSelectCallback", "Lkotlin/Function1;", "", "getIconSelectCallback", "()Lkotlin/jvm/functions/Function1;", "setIconSelectCallback", "(Lkotlin/jvm/functions/Function1;)V", "noneKeyIconInfo", "selectedIconKey", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setIconList", "iconList", "", "setSelectedIcon", "icon", "Lcom/bytedance/ee/bear/contract/icon/IconInfo;", "ViewHolder", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.icon.b */
public final class IconImageAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    private List<DocIconNetResult.Icon> f16339a = new ArrayList();

    /* renamed from: b */
    private Function1<? super DocIconNetResult.Icon, Unit> f16340b;

    /* renamed from: c */
    private final DocIconNetResult.Icon f16341c;

    /* renamed from: d */
    private String f16342d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/document/icon/IconImageAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "setImageView", "(Landroid/widget/ImageView;)V", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.b$a */
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private ImageView f16343a;

        /* renamed from: a */
        public final ImageView mo23402a() {
            return this.f16343a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            View findViewById = view.findViewById(R.id.iv_icon_image);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.iv_icon_image)");
            this.f16343a = (ImageView) findViewById;
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.bytedance.ee.bear.document.icon.DocIconNetResult$Icon, kotlin.Unit>, kotlin.jvm.functions.Function1<com.bytedance.ee.bear.document.icon.DocIconNetResult$Icon, kotlin.Unit> */
    /* renamed from: a */
    public final Function1<DocIconNetResult.Icon, Unit> mo23397a() {
        return this.f16340b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f16339a.size();
    }

    public IconImageAdapter() {
        DocIconNetResult.Icon icon = new DocIconNetResult.Icon();
        icon.fs_unit = "";
        icon.key = "noneIconKey";
        icon.type = 2;
        this.f16341c = icon;
        this.f16342d = "noneIconKey";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/document/icon/IconImageAdapter$onCreateViewHolder$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.b$b */
    public static final class C5822b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ IconImageAdapter f16344a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5822b(IconImageAdapter bVar) {
            this.f16344a = bVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            Object obj;
            Function1<DocIconNetResult.Icon, Unit> a;
            DocIconNetResult.Icon icon = null;
            if (view != null) {
                obj = view.getTag();
            } else {
                obj = null;
            }
            if (obj instanceof DocIconNetResult.Icon) {
                icon = obj;
            }
            DocIconNetResult.Icon icon2 = icon;
            if (icon2 != null && (a = this.f16344a.mo23397a()) != null) {
                a.invoke(icon2);
            }
        }
    }

    /* renamed from: a */
    public final void mo23401a(Function1<? super DocIconNetResult.Icon, Unit> function1) {
        this.f16340b = function1;
    }

    /* renamed from: a */
    public final void mo23398a(IconInfo iconInfo) {
        String str;
        if (iconInfo == null || (str = iconInfo.getKey()) == null) {
            str = this.f16341c.key;
            Intrinsics.checkExpressionValueIsNotNull(str, "noneKeyIconInfo.key");
        }
        this.f16342d = str;
    }

    /* renamed from: a */
    public final void mo23400a(List<? extends DocIconNetResult.Icon> list) {
        Intrinsics.checkParameterIsNotNull(list, "iconList");
        this.f16339a.clear();
        this.f16339a.add(this.f16341c);
        this.f16339a.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.doc_icon_select_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        ViewHolder aVar = new ViewHolder(inflate);
        inflate.setOnClickListener(new C5822b(this));
        return aVar;
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        DocIconNetResult.Icon icon = this.f16339a.get(i);
        View view = aVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        view.setTag(icon);
        if (TextUtils.equals(this.f16341c.key, icon.key)) {
            aVar.mo23402a().setImageResource(R.drawable.icon_doc_removeicon_nor);
        } else {
            ((AbstractC7588a) KoinJavaComponent.m268613a(AbstractC7588a.class, null, null, 6, null)).mo29855a(icon.key, icon.fs_unit, R.drawable.icon_doc_addicon_placeholder, aVar.mo23402a());
        }
        View view2 = aVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
        view2.setSelected(TextUtils.equals(this.f16342d, icon.key));
    }
}
