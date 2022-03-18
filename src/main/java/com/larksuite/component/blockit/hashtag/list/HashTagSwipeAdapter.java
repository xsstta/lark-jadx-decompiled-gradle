package com.larksuite.component.blockit.hashtag.list;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.blockit.entity.TagPermissionType;
import com.larksuite.component.blockit.hashtag.HashTagViewData;
import com.larksuite.component.blockit.hashtag.widget.AbstractC24124a;
import com.larksuite.component.blockit.hashtag.widget.SwipeLayout;
import com.larksuite.component.ui.tag.IconTag;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.component.ui.tag.TextTag;
import com.larksuite.component.ui.tag.v2.ITagEditor;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J\u0016\u0010\u001a\u001a\u00020\u00142\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001cR\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/larksuite/component/blockit/hashtag/list/HashTagSwipeAdapter;", "Lcom/larksuite/component/blockit/hashtag/widget/RecyclerSwipeAdapter;", "Lcom/larksuite/component/blockit/hashtag/list/HashTagViewHolder;", "mContext", "Landroid/content/Context;", "itemClickListener", "Lcom/larksuite/component/blockit/hashtag/list/HashTagSwipeAdapter$ItemClickListener;", "isSwipeEnable", "", "isDistinguishAuthorized", "(Landroid/content/Context;Lcom/larksuite/component/blockit/hashtag/list/HashTagSwipeAdapter$ItemClickListener;ZZ)V", "items", "Ljava/util/ArrayList;", "Lcom/larksuite/component/blockit/hashtag/HashTagViewData;", "getItem", "position", "", "getItemCount", "getSwipeLayoutResourceId", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "resetAll", "collection", "", "ItemClickListener", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.blockit.hashtag.list.e */
public final class HashTagSwipeAdapter extends AbstractC24124a<HashTagViewHolder> {

    /* renamed from: a */
    public final ItemClickListener f59608a;

    /* renamed from: c */
    private ArrayList<HashTagViewData> f59609c;

    /* renamed from: d */
    private final Context f59610d;

    /* renamed from: e */
    private final boolean f59611e;

    /* renamed from: f */
    private final boolean f59612f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/larksuite/component/blockit/hashtag/list/HashTagSwipeAdapter$ItemClickListener;", "", "onDeleteItemClicked", "", "position", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/larksuite/component/blockit/hashtag/HashTagViewData;", "onItemClicked", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.list.e$a */
    public interface ItemClickListener {
        /* renamed from: a */
        void mo86478a(int i, HashTagViewData bVar);

        /* renamed from: b */
        void mo86479b(int i, HashTagViewData bVar);
    }

    @Override // com.larksuite.component.blockit.hashtag.widget.AbstractC24126c
    /* renamed from: a */
    public int mo86534a(int i) {
        return R.id.swipeLayout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f59609c.size();
    }

    /* renamed from: b */
    private final HashTagViewData m88063b(int i) {
        HashTagViewData bVar = this.f59609c.get(i);
        Intrinsics.checkExpressionValueIsNotNull(bVar, "items[position]");
        return bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/larksuite/component/blockit/hashtag/list/HashTagSwipeAdapter$onBindViewHolder$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.list.e$b */
    public static final class C24112b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ HashTagSwipeAdapter f59613a;

        /* renamed from: b */
        final /* synthetic */ int f59614b;

        /* renamed from: c */
        final /* synthetic */ HashTagViewData f59615c;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f59613a.f59608a.mo86479b(this.f59614b, this.f59615c);
        }

        C24112b(HashTagSwipeAdapter eVar, int i, HashTagViewData bVar) {
            this.f59613a = eVar;
            this.f59614b = i;
            this.f59615c = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/larksuite/component/blockit/hashtag/list/HashTagSwipeAdapter$onBindViewHolder$6", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.list.e$c */
    public static final class C24113c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ HashTagSwipeAdapter f59616a;

        /* renamed from: b */
        final /* synthetic */ int f59617b;

        /* renamed from: c */
        final /* synthetic */ HashTagViewData f59618c;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f59616a.f59608a.mo86478a(this.f59617b, this.f59618c);
        }

        C24113c(HashTagSwipeAdapter eVar, int i, HashTagViewData bVar) {
            this.f59616a = eVar;
            this.f59617b = i;
            this.f59618c = bVar;
        }
    }

    /* renamed from: a */
    public final void mo86537a(List<HashTagViewData> list) {
        this.f59609c.clear();
        if (list != null) {
            this.f59609c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public HashTagViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f59610d).inflate(R.layout.item_hash_tag_layout, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(mCon…ag_layout, parent, false)");
        return new HashTagViewHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(HashTagViewHolder fVar, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(fVar, "holder");
        HashTagViewData b = m88063b(i);
        fVar.mo86540c().setSwipeEnabled(this.f59611e);
        fVar.mo86540c().setShowMode(SwipeLayout.ShowMode.LayDown);
        fVar.mo86541d().setOnClickListener(new C24112b(this, i, b));
        if (b.mo86494g()) {
            fVar.mo86541d().setBackgroundColor(this.f59610d.getResources().getColor(R.color.lkui_R500));
        } else {
            fVar.mo86541d().setBackgroundColor(this.f59610d.getResources().getColor(R.color.lkui_N400));
        }
        this.f59660b.mo86624a(fVar.itemView, i);
        LarkNameTag.Builder a = LarkNameTag.f62897a.mo90052a(this.f59610d);
        if (b.mo86500l()) {
            String a2 = C57582a.m223604a(this.f59610d, (int) R.string.Lark_Pano_CreatTopic);
            Intrinsics.checkExpressionValueIsNotNull(a2, "UiUtils.getString(mConte…ing.Lark_Pano_CreatTopic)");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a2 + " #" + b.mo86489c());
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f59610d.getResources().getColor(R.color.lkui_N500)), 0, a2.length(), 33);
            fVar.mo86538a().setText(spannableStringBuilder);
            fVar.mo86538a().setTextColor(UIUtils.getColor(this.f59610d, R.color.lkui_N900));
            fVar.mo86542e().setVisibility(8);
        } else {
            TextView a3 = fVar.mo86538a();
            a3.setText("#" + b.mo86489c());
            if (b.mo86498j() == TagPermissionType.Public.value()) {
                TextTag.Companion bVar = TextTag.f62987a;
                TextTag.Builder aVar = new TextTag.Builder();
                aVar.mo90139b(0);
                aVar.mo90143c(R.string.Lark_Pano_Tag_Public);
                aVar.mo90145d(R.color.lkui_B600);
                aVar.mo90147e(R.color.lkui_B100);
                LarkNameTag.Builder bVar2 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) a, aVar.mo90154l(), false, 2, (Object) null);
            }
            if (b.mo86499k().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                fVar.mo86542e().setVisibility(0);
                fVar.mo86542e().setText(b.mo86499k());
            }
            if (!this.f59612f) {
                fVar.mo86538a().setTextColor(UIUtils.getColor(this.f59610d, R.color.lkui_N900));
            } else if (b.mo86491e()) {
                fVar.mo86538a().setTextColor(UIUtils.getColor(this.f59610d, R.color.lkui_N500));
                TextTag.Companion bVar3 = TextTag.f62987a;
                TextTag.Builder aVar2 = new TextTag.Builder();
                aVar2.mo90139b(50);
                aVar2.mo90143c(R.string.Lark_Pano_HaveAdded);
                aVar2.mo90145d(R.color.lkui_N600);
                aVar2.mo90147e(R.color.lkui_N200);
                LarkNameTag.Builder bVar4 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) a, aVar2.mo90154l(), false, 2, (Object) null);
            } else if (b.mo86493f()) {
                fVar.mo86538a().setTextColor(UIUtils.getColor(this.f59610d, R.color.lkui_N900));
            } else {
                fVar.mo86538a().setTextColor(UIUtils.getColor(this.f59610d, R.color.lkui_N500));
                TextTag.Companion bVar5 = TextTag.f62987a;
                TextTag.Builder aVar3 = new TextTag.Builder();
                aVar3.mo90139b(50);
                aVar3.mo90143c(R.string.Lark_Pano_NoAccess);
                aVar3.mo90145d(R.color.lkui_N600);
                aVar3.mo90147e(R.color.lkui_N200);
                LarkNameTag.Builder bVar6 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) a, aVar3.mo90154l(), false, 2, (Object) null);
            }
            if (b.mo86490d()) {
                IconTag.Companion bVar7 = IconTag.f62887a;
                IconTag.Builder aVar4 = new IconTag.Builder();
                aVar4.mo89996b(100);
                aVar4.mo89998c(R.drawable.ic_svg_collect_hash_tag);
                LarkNameTag.Builder bVar8 = (LarkNameTag.Builder) ITagEditor.C25691a.m92165a((ITagEditor) a, aVar4.mo90001f(), false, 2, (Object) null);
            }
        }
        a.mo90027e().mo90004a(fVar.mo86538a());
        fVar.mo86539b().setOnClickListener(new C24113c(this, i, b));
    }

    public HashTagSwipeAdapter(Context context, ItemClickListener aVar, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(aVar, "itemClickListener");
        this.f59610d = context;
        this.f59608a = aVar;
        this.f59611e = z;
        this.f59612f = z2;
        this.f59609c = new ArrayList<>();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HashTagSwipeAdapter(Context context, ItemClickListener aVar, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, aVar, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2);
    }
}
