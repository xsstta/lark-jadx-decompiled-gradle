package com.ss.android.lark.edu.creategroup.primarypage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.edu.dto.ClassInfo;
import com.ss.ttm.player.MediaPlayer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u001e2\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u001d\u001e\u001fB\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u001e\u0010\u0011\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0016J\u0018\u0010\u0017\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nH\u0002J\u0010\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\fH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/edu/creategroup/primarypage/EduClassInfoListAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Lcom/ss/android/lark/edu/creategroup/primarypage/EduClassInfoListAdapter$BaseViewHolder;", "Lcom/ss/android/lark/edu/dto/ClassInfo;", "()V", "headerView", "Landroid/view/View;", "addClassInfos", "", "list", "", "getItemCount", "", "getItemId", "", "position", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setClassInfos", "setHeaderView", "v", "validPos", "", "pos", "BaseViewHolder", "Companion", "HeaderViewHolder", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.edu.creategroup.primarypage.d */
public final class EduClassInfoListAdapter extends LarkRecyclerViewBaseAdapter<BaseViewHolder<? super ClassInfo>, ClassInfo> {

    /* renamed from: a */
    public static final Companion f94968a = new Companion(null);

    /* renamed from: b */
    private View f94969b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/edu/creategroup/primarypage/EduClassInfoListAdapter$Companion;", "", "()V", "TYPE_HEADER", "", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.primarypage.d$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public int getItemCount() {
        if (this.f94969b != null) {
            return this.items.size() + 1;
        }
        return this.items.size();
    }

    /* renamed from: a */
    public final void mo136350a(View view) {
        this.f94969b = view;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/edu/creategroup/primarypage/EduClassInfoListAdapter$BaseViewHolder;", "D", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "onBindData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)V", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.primarypage.d$a */
    public static abstract class BaseViewHolder<D> extends RecyclerView.ViewHolder {
        /* renamed from: a */
        public abstract void mo136334a(D d);

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BaseViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "v");
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/edu/creategroup/primarypage/EduClassInfoListAdapter$HeaderViewHolder;", "Lcom/ss/android/lark/edu/creategroup/primarypage/EduClassInfoListAdapter$BaseViewHolder;", "", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "onBindData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.primarypage.d$c */
    public static final class HeaderViewHolder extends BaseViewHolder<Object> {
        @Override // com.ss.android.lark.edu.creategroup.primarypage.EduClassInfoListAdapter.BaseViewHolder
        /* renamed from: a */
        public void mo136334a(Object obj) {
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HeaderViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "v");
        }
    }

    /* renamed from: a */
    private final boolean m145826a(int i) {
        int itemCount = getItemCount();
        if (i >= 0 && itemCount > i) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final void m145827b(List<? extends ClassInfo> list) {
        this.items.clear();
        if (list != null) {
            this.items.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        if (this.f94969b == null) {
            return super.getItemId(i);
        }
        if (i == 0) {
            return (long) Integer.valueOf((int) MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME).hashCode();
        }
        return super.getItemId(i - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f94969b == null) {
            return super.getItemViewType(i);
        }
        if (i == 0) {
            return MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME;
        }
        return super.getItemViewType(i - 1);
    }

    /* renamed from: a */
    public final void mo136352a(List<? extends ClassInfo> list) {
        if (list == null) {
            return;
        }
        if (this.items.isEmpty()) {
            m145827b(list);
            return;
        }
        int size = this.items.size();
        this.items.addAll(list);
        notifyItemRangeInserted(size, list.size());
    }

    /* renamed from: a */
    public BaseViewHolder<ClassInfo> onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i != 511 || (view = this.f94969b) == null) {
            return ClassInfoViewHolder.f94939a.mo136337a(viewGroup);
        }
        if (view == null) {
            Intrinsics.throwNpe();
        }
        return new HeaderViewHolder(view);
    }

    /* renamed from: a */
    public void onBindViewHolder(BaseViewHolder<? super ClassInfo> aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        if (m145826a(i)) {
            if (this.f94969b == null) {
                aVar.mo136334a(this.items.get(i));
            } else if (i == 0) {
                aVar.mo136334a(null);
            } else {
                aVar.mo136334a(this.items.get(i - 1));
            }
        }
    }
}
