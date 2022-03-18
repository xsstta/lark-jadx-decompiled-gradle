package com.ss.android.lark.mm.module.share.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.mm.module.share.model.User;
import com.ss.android.lark.mm.p2288b.C45853e;
import com.ss.android.lark.mm.widget.avatar.Avatar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\b2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/mm/module/share/adapter/ThumbnailListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/mm/module/share/adapter/ThumbnailListAdapter$ViewHolder;", "()V", "dataList", "", "Lcom/ss/android/lark/mm/module/share/model/User;", "bindData", "", "userList", "", "scrollToEnd", "Lkotlin/Function0;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.share.a.a */
public final class ThumbnailListAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    private List<User> f118254a;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<User> list = this.f118254a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mm/module/share/adapter/ThumbnailListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lcom/ss/android/lark/mm/widget/avatar/Avatar;", "(Lcom/ss/android/lark/mm/module/share/adapter/ThumbnailListAdapter;Lcom/ss/android/lark/mm/widget/avatar/Avatar;)V", "getView", "()Lcom/ss/android/lark/mm/widget/avatar/Avatar;", "bindData", "", "result", "Lcom/ss/android/lark/mm/module/share/model/User;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.a.a$a */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ ThumbnailListAdapter f118255a;

        /* renamed from: b */
        private final Avatar f118256b;

        /* renamed from: a */
        public final void mo164958a(User user) {
            Intrinsics.checkParameterIsNotNull(user, "result");
            C45853e.m181659a(this.f118256b, user.getUserId(), user.getAvatarUrl(), user.getAvatarKey());
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-2, -2);
            layoutParams.leftMargin = UIUtils.dp2px(this.f118256b.getContext(), 16.0f);
            layoutParams.rightMargin = 0;
            int dp2px = UIUtils.dp2px(this.f118256b.getContext(), 8.0f);
            layoutParams.topMargin = dp2px;
            layoutParams.bottomMargin = dp2px;
            this.f118256b.setLayoutParams(layoutParams);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(ThumbnailListAdapter aVar, Avatar avatar) {
            super(avatar);
            Intrinsics.checkParameterIsNotNull(avatar, "view");
            this.f118255a = aVar;
            this.f118256b = avatar;
        }
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Context context = viewGroup.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
        Avatar avatar = new Avatar(context);
        avatar.setAvatarSize(-4);
        return new ViewHolder(this, avatar);
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        List<User> list = this.f118254a;
        if (list != null) {
            aVar.mo164958a(list.get(i));
        }
    }

    /* renamed from: a */
    public final void mo164957a(List<User> list, Function0<Unit> function0) {
        T t;
        T t2;
        T t3;
        Intrinsics.checkParameterIsNotNull(list, "userList");
        Intrinsics.checkParameterIsNotNull(function0, "scrollToEnd");
        List<User> list2 = this.f118254a;
        if (list2 == null) {
            ArrayList arrayList = new ArrayList();
            this.f118254a = arrayList;
            if (arrayList != null) {
                arrayList.addAll(list);
            }
            notifyDataSetChanged();
            return;
        }
        if (list2 != null) {
            int i = 0;
            for (T t4 : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                T t5 = t4;
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t3 = null;
                        break;
                    }
                    t3 = it.next();
                    if (Intrinsics.areEqual(t3.getUserId(), t5.getUserId())) {
                        break;
                    }
                }
                if (t3 == null) {
                    list2.remove(i);
                    notifyItemRemoved(i);
                    return;
                }
                i = i2;
            }
        }
        List<User> list3 = this.f118254a;
        if (list3 != null) {
            for (T t6 : list) {
                List<User> list4 = this.f118254a;
                if (list4 != null) {
                    Iterator<T> it2 = list4.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t2 = null;
                            break;
                        }
                        t2 = it2.next();
                        if (Intrinsics.areEqual(t2.getUserId(), t6.getUserId())) {
                            break;
                        }
                    }
                    t = t2;
                } else {
                    t = null;
                }
                if (t == null) {
                    list3.add(t6);
                    notifyItemInserted(list3.size() - 1);
                    function0.invoke();
                }
            }
        }
    }
}
