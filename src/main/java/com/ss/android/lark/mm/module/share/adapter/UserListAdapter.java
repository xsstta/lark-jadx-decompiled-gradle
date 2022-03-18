package com.ss.android.lark.mm.module.share.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.module.share.model.SharePermission;
import com.ss.android.lark.mm.module.share.model.User;
import com.ss.android.lark.mm.module.share.user.UserListItemView;
import com.ss.android.lark.mm.module.share.utils.UserUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001!B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ=\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00172%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001c\u0010\u001a\u001a\u00020\u00142\n\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0019H\u0016J\u001c\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0019H\u0016R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R+\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/mm/module/share/adapter/UserListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/mm/module/share/adapter/UserListAdapter$ViewHolder;", "repoId", "", "isCheckEnabled", "", "allowExternalShare", "canTransfer", "selfPermission", "Lcom/ss/android/lark/mm/module/share/model/SharePermission;", "(Ljava/lang/String;ZZZLcom/ss/android/lark/mm/module/share/model/SharePermission;)V", "dataList", "", "Lcom/ss/android/lark/mm/module/share/model/User;", "onItemSelected", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "user", "", "bindData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.share.a.b */
public final class UserListAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public Function1<? super User, Unit> f118257a;

    /* renamed from: b */
    public final String f118258b;

    /* renamed from: c */
    public final boolean f118259c;

    /* renamed from: d */
    public final boolean f118260d;

    /* renamed from: e */
    public final boolean f118261e;

    /* renamed from: f */
    public final SharePermission f118262f;

    /* renamed from: g */
    private final List<User> f118263g = new ArrayList();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f118263g.size();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mm/module/share/adapter/UserListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lcom/ss/android/lark/mm/module/share/user/UserListItemView;", "(Lcom/ss/android/lark/mm/module/share/adapter/UserListAdapter;Lcom/ss/android/lark/mm/module/share/user/UserListItemView;)V", "getView", "()Lcom/ss/android/lark/mm/module/share/user/UserListItemView;", "bindData", "", "user", "Lcom/ss/android/lark/mm/module/share/model/User;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.a.b$a */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ UserListAdapter f118264a;

        /* renamed from: b */
        private final UserListItemView f118265b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.share.a.b$a$a */
        public static final class C46975a extends Lambda implements Function1<Boolean, Unit> {
            final /* synthetic */ User $user;
            final /* synthetic */ ViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46975a(ViewHolder aVar, User user) {
                super(1);
                this.this$0 = aVar;
                this.$user = user;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                Function1<? super User, Unit> function1 = this.this$0.f118264a.f118257a;
                if (function1 != null) {
                    function1.invoke(this.$user);
                }
            }
        }

        /* renamed from: a */
        public final void mo164962a(User user) {
            Intrinsics.checkParameterIsNotNull(user, "user");
            this.f118265b.setCheckEnabled(this.f118264a.f118259c);
            this.f118265b.setModifyEnabled(!this.f118264a.f118259c);
            this.f118265b.mo165253a(this.f118264a.f118258b, user, this.f118264a.f118260d, this.f118264a.f118261e, this.f118264a.f118262f, new C46975a(this, user));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(UserListAdapter bVar, UserListItemView userListItemView) {
            super(userListItemView);
            Intrinsics.checkParameterIsNotNull(userListItemView, "view");
            this.f118264a = bVar;
            this.f118265b = userListItemView;
        }
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Context context = viewGroup.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
        return new ViewHolder(this, new UserListItemView(context));
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        aVar.mo164962a(this.f118263g.get(i));
    }

    /* renamed from: a */
    public final void mo164961a(List<User> list, Function1<? super User, Unit> function1) {
        if (list != null) {
            this.f118257a = function1;
            if (UserUtil.f118275a.mo164967a(this.f118263g, list)) {
                Iterator<T> it = UserUtil.f118275a.mo164968b(this.f118263g, list).iterator();
                while (it.hasNext()) {
                    notifyItemChanged(it.next().intValue());
                }
                return;
            }
            this.f118263g.clear();
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                this.f118263g.add(User.copy$default(it2.next(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, 1048575, null));
            }
            notifyDataSetChanged();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mm.module.share.a.b */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m186015a(UserListAdapter bVar, List list, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        bVar.mo164961a(list, function1);
    }

    public UserListAdapter(String str, boolean z, boolean z2, boolean z3, SharePermission sharePermission) {
        Intrinsics.checkParameterIsNotNull(str, "repoId");
        Intrinsics.checkParameterIsNotNull(sharePermission, "selfPermission");
        this.f118258b = str;
        this.f118259c = z;
        this.f118260d = z2;
        this.f118261e = z3;
        this.f118262f = sharePermission;
    }
}
