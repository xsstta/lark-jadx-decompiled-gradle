package com.ss.android.lark.contact.impl.contacts_email;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.blockit.hashtag.widget.AbstractC24124a;
import com.larksuite.component.blockit.hashtag.widget.SwipeLayout;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.tag.UDTagsDrawable;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.impl.contacts_email.entity.BusinessCardViewData;
import com.ss.android.lark.contact.impl.contacts_email.mvp.BusinessCardViewHolder;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\bJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\u0018\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0018H\u0016J\u000e\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u000bJ\u0014\u0010'\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014J\u0016\u0010(\u001a\u00020\u00122\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u0014R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006-"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/BusinessCardsAdapter;", "Lcom/larksuite/component/blockit/hashtag/widget/RecyclerSwipeAdapter;", "Lcom/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardViewHolder;", "mShowSelect", "", "mIsMultiSelect", "(ZZ)V", "itemClickListener", "Lcom/ss/android/lark/contact/impl/contacts_email/BusinessCardsAdapter$ICardItemClickListener;", "items", "", "Lcom/ss/android/lark/contact/impl/contacts_email/entity/BusinessCardViewData;", "mContext", "Landroid/content/Context;", "getMIsMultiSelect", "()Z", "getMShowSelect", "addAll", "", "list", "", "cardItemClickListener", "listener", "getItemCount", "", "getItemList", "getSwipeLayoutResourceId", "position", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "remove", "card", "resetAll", "updateSelectedMember", "mSelectedMemberList", "", "Companion", "ICardItemClickListener", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_email.a */
public final class BusinessCardsAdapter extends AbstractC24124a<BusinessCardViewHolder> {

    /* renamed from: d */
    public static final Companion f91841d = new Companion(null);

    /* renamed from: a */
    public ICardItemClickListener f91842a;

    /* renamed from: c */
    public final List<BusinessCardViewData> f91843c;

    /* renamed from: e */
    private Context f91844e;

    /* renamed from: f */
    private final boolean f91845f;

    /* renamed from: g */
    private final boolean f91846g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/BusinessCardsAdapter$ICardItemClickListener;", "", "onDeleteClick", "", "card", "Lcom/ss/android/lark/contact/impl/contacts_email/entity/BusinessCardViewData;", "onItemClicked", "", "isChecked", "position", "", "startProfileActivity", "cardId", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.a$b */
    public interface ICardItemClickListener {
        /* renamed from: a */
        void mo130992a(BusinessCardViewData aVar);

        /* renamed from: a */
        void mo130993a(String str);

        /* renamed from: a */
        boolean mo130994a(BusinessCardViewData aVar, boolean z, int i);
    }

    public BusinessCardsAdapter() {
        this(false, false, 3, null);
    }

    @Override // com.larksuite.component.blockit.hashtag.widget.AbstractC24126c
    /* renamed from: a */
    public int mo86534a(int i) {
        return R.id.sl_root;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/BusinessCardsAdapter$Companion;", "", "()V", "avatarSize", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final List<BusinessCardViewData> mo130988c() {
        return this.f91843c;
    }

    /* renamed from: d */
    public final boolean mo130990d() {
        return this.f91845f;
    }

    /* renamed from: e */
    public final boolean mo130991e() {
        return this.f91846g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f91843c.size();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/contacts_email/BusinessCardsAdapter$onBindViewHolder$4", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.a$d */
    public static final class C35530d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ BusinessCardsAdapter f91850a;

        /* renamed from: b */
        final /* synthetic */ BusinessCardViewData f91851b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            ICardItemClickListener bVar = this.f91850a.f91842a;
            if (bVar != null) {
                bVar.mo130992a(this.f91851b);
            }
        }

        C35530d(BusinessCardsAdapter aVar, BusinessCardViewData aVar2) {
            this.f91850a = aVar;
            this.f91851b = aVar2;
        }
    }

    /* renamed from: a */
    public final BusinessCardsAdapter mo130982a(ICardItemClickListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        BusinessCardsAdapter aVar = this;
        aVar.f91842a = bVar;
        return aVar;
    }

    /* renamed from: a */
    public final void mo130984a(BusinessCardViewData aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "card");
        if (this.f91843c.contains(aVar)) {
            int indexOf = this.f91843c.indexOf(aVar);
            this.f91843c.remove(aVar);
            notifyItemRemoved(indexOf);
        }
    }

    /* renamed from: b */
    public final void mo130987b(List<BusinessCardViewData> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        List<BusinessCardViewData> list2 = list;
        if (!list2.isEmpty()) {
            this.f91843c.addAll(list2);
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        Context context = recyclerView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "recyclerView.context");
        this.f91844e = context;
    }

    /* renamed from: c */
    public final void mo130989c(List<String> list) {
        String str;
        if (list != null) {
            for (BusinessCardViewData aVar : mo130988c()) {
                if (!StringsKt.isBlank(aVar.mo130995a())) {
                    str = aVar.mo130995a();
                } else {
                    str = aVar.mo131004e();
                }
                aVar.mo130997a(list.contains(str));
            }
            mo86621a();
        }
    }

    /* renamed from: a */
    public final void mo130986a(List<BusinessCardViewData> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f91843c.clear();
        List<BusinessCardViewData> list2 = list;
        if (!CollectionUtils.isEmpty(list2)) {
            this.f91843c.addAll(list2);
        }
        notifyDataSetChanged();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/contacts_email/BusinessCardsAdapter$onBindViewHolder$3", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.a$c */
    public static final class C35529c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ BusinessCardsAdapter f91847a;

        /* renamed from: b */
        final /* synthetic */ BusinessCardViewData f91848b;

        /* renamed from: c */
        final /* synthetic */ BusinessCardViewHolder f91849c;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            if (this.f91847a.mo130990d()) {
                ICardItemClickListener bVar = this.f91847a.f91842a;
                if (bVar != null) {
                    BusinessCardViewData aVar = this.f91848b;
                    if (!bVar.mo130994a(aVar, !aVar.mo131006f(), this.f91847a.f91843c.indexOf(this.f91848b))) {
                        return;
                    }
                }
                this.f91849c.mo131145e().setChecked(!this.f91849c.mo131145e().isChecked());
                this.f91848b.mo130997a(this.f91849c.mo131145e().isChecked());
                if (!this.f91847a.mo130991e()) {
                    for (BusinessCardViewData aVar2 : this.f91847a.f91843c) {
                        if (aVar2.mo131006f()) {
                            aVar2.mo130997a(false);
                        }
                    }
                    return;
                }
                return;
            }
            ICardItemClickListener bVar2 = this.f91847a.f91842a;
            if (bVar2 != null) {
                bVar2.mo130993a(this.f91848b.mo130995a());
            }
        }

        C35529c(BusinessCardsAdapter aVar, BusinessCardViewData aVar2, BusinessCardViewHolder businessCardViewHolder) {
            this.f91847a = aVar;
            this.f91848b = aVar2;
            this.f91849c = businessCardViewHolder;
        }
    }

    public BusinessCardsAdapter(boolean z, boolean z2) {
        this.f91845f = z;
        this.f91846g = z2;
        this.f91843c = new ArrayList();
    }

    /* renamed from: a */
    public BusinessCardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Context context = this.f91844e;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f91845f) {
            i2 = R.layout.business_card_selector_item;
        } else {
            i2 = R.layout.business_card_item;
        }
        View inflate = from.inflate(i2, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new BusinessCardViewHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(BusinessCardViewHolder businessCardViewHolder, int i) {
        int i2;
        Intrinsics.checkParameterIsNotNull(businessCardViewHolder, "holder");
        BusinessCardViewData aVar = this.f91843c.get(i);
        String b = aVar.mo130998b();
        String c = aVar.mo131000c();
        businessCardViewHolder.mo131143c().setText(b);
        if (this.f91845f) {
            TextView d = businessCardViewHolder.mo131144d();
            if (!StringsKt.isBlank(aVar.mo131004e())) {
                c = aVar.mo131004e();
            }
            d.setText(c);
            Context context = this.f91844e;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            UDTagsDrawable.Builder bVar = new UDTagsDrawable.Builder(context);
            Context context2 = this.f91844e;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            UDTagsDrawable i3 = bVar.mo91384a(new UDTagsDrawable.TagModel.Builder(context2).mo91418a(UIHelper.getString(R.string.Lark_Contacts_ContactCards)).mo91417a(UDTagsDrawable.TagColorSet.BLUE).mo91427g()).mo91398i();
            if (i3 != null) {
                i3.mo91369a(businessCardViewHolder.mo131143c());
            }
        } else {
            businessCardViewHolder.mo131144d().setText(c);
        }
        TextView d2 = businessCardViewHolder.mo131144d();
        int i4 = 8;
        if (TextUtils.isEmpty(businessCardViewHolder.mo131144d().getText())) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        d2.setVisibility(i2);
        int dp2px = UIHelper.dp2px(40.0f);
        if (!TextUtils.isEmpty(aVar.mo131002d())) {
            AvatarImage build = AvatarImage.Builder.obtain(aVar.mo131002d(), aVar.mo130995a(), dp2px, dp2px).build();
            Context context3 = this.f91844e;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            ImageLoader.with(context3).load(build).override(dp2px, dp2px).into(businessCardViewHolder.mo131142b());
        }
        SwipeLayout swipeLayout = businessCardViewHolder.slRoot;
        if (swipeLayout != null) {
            swipeLayout.setShowMode(SwipeLayout.ShowMode.LayDown);
            this.f59660b.mo86624a(businessCardViewHolder.itemView, i);
        }
        businessCardViewHolder.mo131141a().setOnClickListener(new C35529c(this, aVar, businessCardViewHolder));
        UDCheckBox e = businessCardViewHolder.mo131145e();
        if (this.f91845f && this.f91846g) {
            i4 = 0;
        }
        e.setVisibility(i4);
        if (this.f91845f) {
            businessCardViewHolder.mo131145e().setChecked(aVar.mo131006f());
            businessCardViewHolder.mo131145e().setEnabled(!TextUtils.isEmpty(aVar.mo131004e()));
        }
        TextView textView = businessCardViewHolder.deleteView;
        if (textView != null) {
            textView.setOnClickListener(new C35530d(this, aVar));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BusinessCardsAdapter(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
