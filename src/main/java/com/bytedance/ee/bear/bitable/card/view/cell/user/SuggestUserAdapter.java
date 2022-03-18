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
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.C13596c;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.image.UDAvatar;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\fH\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\f2\n\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u001c\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016J\u0014\u0010\u001e\u001a\u00020\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u000e\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0005J\u000e\u0010\"\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007J\u0014\u0010#\u001a\u00020\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R.\u0010\b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/user/SuggestUserAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/bitable/card/view/cell/user/SuggestUserAdapter$SuggestUserViewHolder;", "()V", "enableMultipleSelect", "", "language", "", "onSelectedUsersChangeListener", "Lkotlin/Function1;", "", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/cell/UserEntity;", "", "getOnSelectedUsersChangeListener", "()Lkotlin/jvm/functions/Function1;", "setOnSelectedUsersChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "selectedUserList", "", "userList", "appendSelectedUsersIfNeed", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAllSuggestUsers", "list", "setEnableMultiSelect", "enable", "setLanguage", "setSelectedUsers", "SuggestUserViewHolder", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.user.d */
public final class SuggestUserAdapter extends RecyclerView.Adapter<SuggestUserViewHolder> {

    /* renamed from: a */
    public final List<UserEntity> f13912a = new ArrayList();

    /* renamed from: b */
    public boolean f13913b;

    /* renamed from: c */
    private List<UserEntity> f13914c = new ArrayList();

    /* renamed from: d */
    private String f13915d;

    /* renamed from: e */
    private Function1<? super List<? extends UserEntity>, Unit> f13916e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/user/SuggestUserAdapter$SuggestUserViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "rootView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/bitable/card/view/cell/user/SuggestUserAdapter;Landroid/view/View;)V", "avatarRIV", "Lcom/larksuite/component/universe_design/image/UDAvatar;", "getAvatarRIV", "()Lcom/larksuite/component/universe_design/image/UDAvatar;", "departmentTv", "Landroid/widget/TextView;", "getDepartmentTv", "()Landroid/widget/TextView;", "nameTv", "getNameTv", "getRootView", "()Landroid/view/View;", "selectCb", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "getSelectCb", "()Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "initView", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.user.d$a */
    public final class SuggestUserViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ SuggestUserAdapter f13917a;

        /* renamed from: b */
        private final UDAvatar f13918b;

        /* renamed from: c */
        private final TextView f13919c;

        /* renamed from: d */
        private final TextView f13920d;

        /* renamed from: e */
        private final UDCheckBox f13921e;

        /* renamed from: f */
        private final View f13922f;

        /* renamed from: a */
        public final UDAvatar mo18418a() {
            return this.f13918b;
        }

        /* renamed from: b */
        public final TextView mo18419b() {
            return this.f13919c;
        }

        /* renamed from: c */
        public final TextView mo18420c() {
            return this.f13920d;
        }

        /* renamed from: d */
        public final UDCheckBox mo18421d() {
            return this.f13921e;
        }

        /* renamed from: e */
        public final View mo18422e() {
            return this.f13922f;
        }

        /* renamed from: f */
        private final void m19527f() {
            C13747j.m55726a((View) this.f13918b, (int) R.color.bg_body);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SuggestUserViewHolder(SuggestUserAdapter dVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "rootView");
            this.f13917a = dVar;
            this.f13922f = view;
            View findViewById = view.findViewById(R.id.riv_suggest_user_avatar);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.….riv_suggest_user_avatar)");
            this.f13918b = (UDAvatar) findViewById;
            View findViewById2 = view.findViewById(R.id.tv_user_name);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.tv_user_name)");
            this.f13919c = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tv_user_department);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.tv_user_department)");
            this.f13920d = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.iv_select_user_checkbox);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.findViewById(R.….iv_select_user_checkbox)");
            this.f13921e = (UDCheckBox) findViewById4;
            m19527f();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.util.List<? extends com.bytedance.ee.bear.bitable.card.model.stmodel.cell.UserEntity>, kotlin.Unit>, kotlin.jvm.functions.Function1<java.util.List<? extends com.bytedance.ee.bear.bitable.card.model.stmodel.cell.UserEntity>, kotlin.Unit> */
    /* renamed from: a */
    public final Function1<List<? extends UserEntity>, Unit> mo18411a() {
        return this.f13916e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f13914c.size();
    }

    /* renamed from: b */
    private final void m19518b() {
        HashSet hashSet = CollectionsKt.toHashSet(this.f13914c);
        ArrayList arrayList = new ArrayList();
        for (T t : this.f13912a) {
            if (!hashSet.contains(t)) {
                arrayList.add(t);
            }
        }
        this.f13914c.addAll(arrayList);
    }

    /* renamed from: a */
    public final void mo18413a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "language");
        this.f13915d = str;
    }

    /* renamed from: a */
    public final void mo18415a(Function1<? super List<? extends UserEntity>, Unit> function1) {
        this.f13916e = function1;
    }

    /* renamed from: a */
    public final void mo18414a(List<? extends UserEntity> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f13912a.clear();
        this.f13912a.addAll(list);
        m19518b();
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public final void mo18417b(List<? extends UserEntity> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f13914c.clear();
        this.f13914c.addAll(list);
        m19518b();
        notifyDataSetChanged();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/user/SuggestUserAdapter$onCreateViewHolder$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.user.d$b */
    public static final class C4709b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ SuggestUserAdapter f13923a;

        /* renamed from: b */
        final /* synthetic */ SuggestUserViewHolder f13924b;

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
                if (this.f13923a.f13913b) {
                    arrayList.addAll(this.f13923a.f13912a);
                    if (this.f13924b.mo18421d().isChecked()) {
                        arrayList.remove(userEntity2);
                    } else {
                        arrayList.add(userEntity2);
                    }
                } else if (!this.f13924b.mo18421d().isChecked()) {
                    arrayList.add(userEntity2);
                }
                Function1<List<? extends UserEntity>, Unit> a = this.f13923a.mo18411a();
                if (a != null) {
                    a.invoke(arrayList);
                }
            }
        }

        C4709b(SuggestUserAdapter dVar, SuggestUserViewHolder aVar) {
            this.f13923a = dVar;
            this.f13924b = aVar;
        }
    }

    /* renamed from: a */
    public final void mo18416a(boolean z) {
        if (this.f13913b != z) {
            this.f13913b = z;
            if (!z && this.f13912a.size() > 1) {
                mo18414a(CollectionsKt.listOf(this.f13912a.get(0)));
            }
        }
    }

    /* renamed from: a */
    public SuggestUserViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bitable_suggest_user_list_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…list_item, parent, false)");
        SuggestUserViewHolder aVar = new SuggestUserViewHolder(this, inflate);
        aVar.mo18422e().setOnClickListener(new C4709b(this, aVar));
        aVar.mo18421d().setClickable(false);
        return aVar;
    }

    /* renamed from: a */
    public void onBindViewHolder(SuggestUserViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        String str = this.f13915d;
        if (str == null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
            str = locale.getLanguage();
        }
        this.f13915d = str;
        UserEntity userEntity = this.f13914c.get(i);
        aVar.mo18422e().setTag(userEntity);
        aVar.mo18419b().setText(C13596c.m55177a(this.f13915d, userEntity.getName(), userEntity.getEnName()));
        ((C2124f) ComponentCallbacks2C2115c.m9151c(aVar.mo18422e().getContext()).mo10414a(new C13664a(userEntity.getAvatarUrl())).mo11123a((int) R.drawable.facade_common_avatar_place_holder)).mo10399a((ImageView) aVar.mo18418a());
        aVar.mo18420c().setText(userEntity.getDepartment());
        aVar.mo18421d().setChecked(CollectionsKt.toSet(this.f13912a).contains(userEntity));
    }
}
