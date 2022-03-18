package com.bytedance.ee.bear.bitable.card.view.cell.user;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.UserEntity;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.C13596c;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.component.universe_design.image.UDAvatar;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\f2\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014H\u0016J\u000e\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0005J\u000e\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007J\u0014\u0010\u001f\u001a\u00020\f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R.\u0010\b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/user/SelectedUserAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/bitable/card/view/cell/user/SelectedUserAdapter$SelectedUserViewHolder;", "()V", "enableMultipleSelect", "", "language", "", "onSelectedUsersChangeListener", "Lkotlin/Function1;", "", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/cell/UserEntity;", "", "getOnSelectedUsersChangeListener", "()Lkotlin/jvm/functions/Function1;", "setOnSelectedUsersChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "userList", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setEnableMultiSelect", "enable", "setLanguage", "setSelectedUsers", "list", "SelectedUserViewHolder", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.user.c */
public final class SelectedUserAdapter extends RecyclerView.Adapter<SelectedUserViewHolder> {

    /* renamed from: a */
    public List<UserEntity> f13902a = new ArrayList();

    /* renamed from: b */
    private String f13903b;

    /* renamed from: c */
    private boolean f13904c;

    /* renamed from: d */
    private Function1<? super List<? extends UserEntity>, Unit> f13905d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/user/SelectedUserAdapter$SelectedUserViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "rootView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/bitable/card/view/cell/user/SelectedUserAdapter;Landroid/view/View;)V", "avatarRIV", "Lcom/larksuite/component/universe_design/image/UDAvatar;", "getAvatarRIV", "()Lcom/larksuite/component/universe_design/image/UDAvatar;", "nameTv", "Landroid/widget/TextView;", "getNameTv", "()Landroid/widget/TextView;", "removeBtn", "Landroid/widget/ImageView;", "getRemoveBtn", "()Landroid/widget/ImageView;", "getRootView", "()Landroid/view/View;", "initView", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.user.c$a */
    public final class SelectedUserViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ SelectedUserAdapter f13906a;

        /* renamed from: b */
        private final UDAvatar f13907b;

        /* renamed from: c */
        private final TextView f13908c;

        /* renamed from: d */
        private final ImageView f13909d;

        /* renamed from: e */
        private final View f13910e;

        /* renamed from: a */
        public final UDAvatar mo18406a() {
            return this.f13907b;
        }

        /* renamed from: b */
        public final TextView mo18407b() {
            return this.f13908c;
        }

        /* renamed from: c */
        public final ImageView mo18408c() {
            return this.f13909d;
        }

        /* renamed from: d */
        public final View mo18409d() {
            return this.f13910e;
        }

        /* renamed from: e */
        private final void m19511e() {
            C13747j.m55726a((View) this.f13907b, (int) R.color.icon_n1);
            C13747j.m55726a((View) this.f13909d, (int) R.color.icon_n1);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SelectedUserViewHolder(SelectedUserAdapter cVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "rootView");
            this.f13906a = cVar;
            this.f13910e = view;
            View findViewById = view.findViewById(R.id.riv_selected_user_avatar);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.…riv_selected_user_avatar)");
            this.f13907b = (UDAvatar) findViewById;
            View findViewById2 = view.findViewById(R.id.tv_selected_user_name);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.tv_selected_user_name)");
            this.f13908c = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.iv_remove_selected_user);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.….iv_remove_selected_user)");
            this.f13909d = (ImageView) findViewById3;
            m19511e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/user/SelectedUserAdapter$onCreateViewHolder$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.user.c$c */
    public static final class C4708c extends AbstractView$OnClickListenerC11839e {
        C4708c() {
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            Object obj;
            if (view != null) {
                obj = view.getTag();
            } else {
                obj = null;
            }
            if (!(obj instanceof UserEntity)) {
                obj = null;
            }
            UserEntity userEntity = (UserEntity) obj;
            if (userEntity != null) {
                ((AbstractC5586d) KoinJavaComponent.m268613a(AbstractC5586d.class, null, null, 6, null)).mo22257a(userEntity.getUserId(), "");
            }
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.util.List<? extends com.bytedance.ee.bear.bitable.card.model.stmodel.cell.UserEntity>, kotlin.Unit>, kotlin.jvm.functions.Function1<java.util.List<? extends com.bytedance.ee.bear.bitable.card.model.stmodel.cell.UserEntity>, kotlin.Unit> */
    /* renamed from: a */
    public final Function1<List<? extends UserEntity>, Unit> mo18400a() {
        return this.f13905d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f13902a.size();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/user/SelectedUserAdapter$onCreateViewHolder$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.user.c$b */
    public static final class C4707b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ SelectedUserAdapter f13911a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4707b(SelectedUserAdapter cVar) {
            this.f13911a = cVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            Object obj;
            UserEntity userEntity = null;
            if (view != null) {
                obj = view.getTag();
            } else {
                obj = null;
            }
            if (obj instanceof UserEntity) {
                userEntity = obj;
            }
            UserEntity userEntity2 = userEntity;
            if (userEntity2 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f13911a.f13902a);
                arrayList.remove(userEntity2);
                Function1<List<? extends UserEntity>, Unit> a = this.f13911a.mo18400a();
                if (a != null) {
                    a.invoke(arrayList);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo18402a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "language");
        this.f13903b = str;
    }

    /* renamed from: a */
    public final void mo18404a(Function1<? super List<? extends UserEntity>, Unit> function1) {
        this.f13905d = function1;
    }

    /* renamed from: a */
    public final void mo18403a(List<? extends UserEntity> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f13902a.clear();
        this.f13902a.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo18405a(boolean z) {
        if (this.f13904c != z) {
            this.f13904c = z;
            if (!z && this.f13902a.size() > 1) {
                mo18403a(CollectionsKt.listOf(this.f13902a.get(0)));
            }
        }
    }

    /* renamed from: a */
    public SelectedUserViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bitable_selected_user_list_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…list_item, parent, false)");
        SelectedUserViewHolder aVar = new SelectedUserViewHolder(this, inflate);
        aVar.mo18408c().setOnClickListener(new C4707b(this));
        aVar.mo18409d().setOnClickListener(new C4708c());
        return aVar;
    }

    /* renamed from: a */
    public void onBindViewHolder(SelectedUserViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        String str = this.f13903b;
        if (str == null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
            str = locale.getLanguage();
        }
        this.f13903b = str;
        UserEntity userEntity = this.f13902a.get(i);
        aVar.mo18409d().setTag(userEntity);
        aVar.mo18408c().setTag(userEntity);
        aVar.mo18407b().setText(C13596c.m55177a(this.f13903b, userEntity.getName(), userEntity.getEnName()));
        ((C2124f) ComponentCallbacks2C2115c.m9151c(aVar.mo18409d().getContext()).mo10414a(new C13664a(userEntity.getAvatarUrl())).mo11123a((int) R.drawable.facade_common_avatar_place_holder)).mo10399a((ImageView) aVar.mo18406a());
    }
}
