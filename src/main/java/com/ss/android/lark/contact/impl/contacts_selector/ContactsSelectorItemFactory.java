package com.ss.android.lark.contact.impl.contacts_selector;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.AbstractC29565l;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0003)*+B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0005J\b\u0010\u0014\u001a\u00020\u0007H\u0002J\b\u0010\u0015\u001a\u00020\u0007H\u0002J\b\u0010\u0016\u001a\u00020\u0007H\u0002J\b\u0010\u0017\u001a\u00020\u0007H\u0002J\b\u0010\u0018\u001a\u00020\u0007H\u0002J\b\u0010\u0019\u001a\u00020\u0007H\u0002J\b\u0010\u001a\u001a\u00020\u0007H\u0002J\b\u0010\u001b\u001a\u00020\u0007H\u0002J\b\u0010\u001c\u001a\u00020\u0007H\u0002J\b\u0010\u001d\u001a\u00020\u0011H\u0002J\u0006\u0010\u001e\u001a\u00020\u0007J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u000eJ\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0016\u0010&\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010'\u001a\u00020\u000eJ\u0006\u0010(\u001a\u00020\tR \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorItemFactory;", "", "()V", "actions", "", "", "Lkotlin/reflect/KFunction0;", "", "adapter", "Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorItemFactory$DefaultContactsAdapter;", "clickHandler", "Lcom/ss/android/lark/biz/core/api/IContactsSelectorController$IOnClickListener;", "executeFlag", "foldDividers", "", "itemList", "", "Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorItemFactory$ContactsItemData;", "actionFlags", "actionFlag", "appendEmailContacts", "appendExistGroupItem", "appendExternalContacts", "appendMineGroupItem", "appendNewContacts", "appendOnCall", "appendOwnerGroupItem", "appendRobot", "appendSpecialFocus", "appendTrustParty", "clearItemList", "handler", "createTrustPartView", "Landroid/view/View;", "context", "Landroid/content/Context;", "fold", "generateItemList", "getTrustPartyView", "needItemDivider", "toAdapter", "ContactsItemData", "ContactsItemHolder", "DefaultContactsAdapter", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c */
public final class ContactsSelectorItemFactory {

    /* renamed from: a */
    public AbstractC29565l.AbstractC29566a f92436a;

    /* renamed from: b */
    private boolean f92437b;

    /* renamed from: c */
    private final List<ContactsItemData> f92438c = new ArrayList();

    /* renamed from: d */
    private final DefaultContactsAdapter f92439d = new DefaultContactsAdapter();

    /* renamed from: e */
    private int f92440e;

    /* renamed from: f */
    private Map<Integer, ? extends KFunction<Unit>> f92441f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0007*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0007*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0007*\u0004\u0018\u00010\u000e0\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorItemFactory$ContactsItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "badge", "Lcom/larksuite/component/ui/imageview/LKUIBadgeView;", "kotlin.jvm.PlatformType", "divider", "dividerLineEnd", "dividerLineHead", "icon", "Landroid/widget/ImageView;", "text", "Landroid/widget/TextView;", "bindBadge", "", "item", "Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorItemFactory$ContactsItemData;", "bindDivider", "position", "", "bindText", "bindTrustPartyView", "bindView", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$b */
    public static final class ContactsItemHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public static final Companion f92450a = new Companion(null);

        /* renamed from: b */
        private final ImageView f92451b;

        /* renamed from: c */
        private final TextView f92452c;

        /* renamed from: d */
        private final LKUIBadgeView f92453d;

        /* renamed from: e */
        private final View f92454e;

        /* renamed from: f */
        private final View f92455f;

        /* renamed from: g */
        private final View f92456g;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorItemFactory$ContactsItemHolder$Companion;", "", "()V", "POSITION_FIRST", "", "POSITION_LAST", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$b$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorItemFactory$ContactsItemHolder$bindView$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$b$c */
        public static final class C35744c extends OnSingleClickListener {

            /* renamed from: a */
            final /* synthetic */ ContactsItemData f92458a;

            C35744c(ContactsItemData aVar) {
                this.f92458a = aVar;
            }

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                Function0<Unit> h = this.f92458a.mo131626h();
                if (h != null) {
                    h.invoke();
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$b$b */
        public static final class View$OnClickListenerC35743b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ ContactsItemData f92457a;

            View$OnClickListenerC35743b(ContactsItemData aVar) {
                this.f92457a = aVar;
            }

            public final void onClick(View view) {
                Function0<Unit> h = this.f92457a.mo131626h();
                if (h != null) {
                    h.invoke();
                }
            }
        }

        /* renamed from: b */
        private final void m139960b(ContactsItemData aVar) {
            this.f92452c.setText(aVar.mo131622d());
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ContactsItemHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f92451b = (ImageView) view.findViewById(R.id.iv_icon);
            this.f92452c = (TextView) view.findViewById(R.id.tv_item);
            this.f92453d = (LKUIBadgeView) view.findViewById(R.id.contacts_new_badge);
            this.f92454e = view.findViewById(R.id.item_divider);
            this.f92455f = view.findViewById(R.id.divider_line_head);
            this.f92456g = view.findViewById(R.id.divider_line_end);
        }

        /* renamed from: c */
        private final void m139962c(ContactsItemData aVar) {
            int i;
            String str;
            if (!aVar.mo131625g() || aVar.mo131618a() <= 0) {
                LKUIBadgeView lKUIBadgeView = this.f92453d;
                Intrinsics.checkExpressionValueIsNotNull(lKUIBadgeView, "badge");
                lKUIBadgeView.setVisibility(8);
                return;
            }
            LKUIBadgeView lKUIBadgeView2 = this.f92453d;
            Intrinsics.checkExpressionValueIsNotNull(lKUIBadgeView2, "badge");
            lKUIBadgeView2.setVisibility(0);
            int a = aVar.mo131618a();
            if (a < 10) {
                i = R.drawable.badge_orange_single_count_bg_no_stroke;
            } else {
                i = R.drawable.badge_orange_multi_count_bg_no_stroke;
            }
            if (a < 99) {
                str = String.valueOf(a);
            } else {
                str = "99+";
            }
            this.f92453d.mo89322b(i).mo89319a((String) null).mo89319a(str).mo89320a();
        }

        /* renamed from: a */
        public final void mo131627a(ContactsItemData aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "item");
            Drawable drawable = UIHelper.getDrawable(aVar.mo131620b());
            if (drawable != null) {
                drawable.mutate();
            }
            if (drawable != null) {
                drawable.setTint(UIHelper.getColor(aVar.mo131621c()));
            }
            this.f92451b.setImageDrawable(drawable);
            m139960b(aVar);
            m139962c(aVar);
            this.itemView.setOnClickListener(new View$OnClickListenerC35743b(aVar));
            View view = this.f92454e;
            Intrinsics.checkExpressionValueIsNotNull(view, "divider");
            view.setVisibility(8);
            View view2 = this.f92455f;
            Intrinsics.checkExpressionValueIsNotNull(view2, "dividerLineHead");
            view2.setVisibility(0);
            View view3 = this.f92456g;
            Intrinsics.checkExpressionValueIsNotNull(view3, "dividerLineEnd");
            view3.setVisibility(0);
        }

        /* renamed from: a */
        public final void mo131628a(ContactsItemData aVar, int i) {
            Intrinsics.checkParameterIsNotNull(aVar, "item");
            Drawable drawable = UIHelper.getDrawable(aVar.mo131620b());
            if (drawable != null) {
                drawable.mutate();
            }
            if (drawable != null) {
                drawable.setTint(UIHelper.getColor(aVar.mo131621c()));
            }
            this.f92451b.setImageDrawable(drawable);
            m139960b(aVar);
            m139962c(aVar);
            m139961b(aVar, i);
            this.itemView.setOnClickListener(new C35744c(aVar));
        }

        /* renamed from: b */
        private final void m139961b(ContactsItemData aVar, int i) {
            if ((i & 1) == 1) {
                View view = this.f92455f;
                Intrinsics.checkExpressionValueIsNotNull(view, "dividerLineHead");
                view.setVisibility(0);
            } else {
                View view2 = this.f92455f;
                Intrinsics.checkExpressionValueIsNotNull(view2, "dividerLineHead");
                view2.setVisibility(8);
            }
            if (aVar.mo131624f()) {
                View view3 = this.f92456g;
                Intrinsics.checkExpressionValueIsNotNull(view3, "dividerLineEnd");
                view3.setVisibility(0);
                View view4 = this.f92454e;
                Intrinsics.checkExpressionValueIsNotNull(view4, "divider");
                view4.setVisibility(0);
                return;
            }
            View view5 = this.f92456g;
            Intrinsics.checkExpressionValueIsNotNull(view5, "dividerLineEnd");
            view5.setVisibility(8);
            View view6 = this.f92454e;
            Intrinsics.checkExpressionValueIsNotNull(view6, "divider");
            view6.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001BO\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorItemFactory$ContactsItemData;", "", "iconId", "", "iconTintColor", "textId", "order", "showDivider", "", "observeBadgeCount", "onClick", "Lkotlin/Function0;", "", "(IIIIZZLkotlin/jvm/functions/Function0;)V", "badgeCount", "getBadgeCount", "()I", "setBadgeCount", "(I)V", "getIconId", "getIconTintColor", "getObserveBadgeCount", "()Z", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getOrder", "getShowDivider", "getTextId", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$a */
    public static final class ContactsItemData {

        /* renamed from: a */
        private int f92442a;

        /* renamed from: b */
        private final int f92443b;

        /* renamed from: c */
        private final int f92444c;

        /* renamed from: d */
        private final int f92445d;

        /* renamed from: e */
        private final int f92446e;

        /* renamed from: f */
        private final boolean f92447f;

        /* renamed from: g */
        private final boolean f92448g;

        /* renamed from: h */
        private final Function0<Unit> f92449h;

        /* renamed from: a */
        public final int mo131618a() {
            return this.f92442a;
        }

        /* renamed from: b */
        public final int mo131620b() {
            return this.f92443b;
        }

        /* renamed from: c */
        public final int mo131621c() {
            return this.f92444c;
        }

        /* renamed from: d */
        public final int mo131622d() {
            return this.f92445d;
        }

        /* renamed from: e */
        public final int mo131623e() {
            return this.f92446e;
        }

        /* renamed from: f */
        public final boolean mo131624f() {
            return this.f92447f;
        }

        /* renamed from: g */
        public final boolean mo131625g() {
            return this.f92448g;
        }

        /* renamed from: h */
        public final Function0<Unit> mo131626h() {
            return this.f92449h;
        }

        /* renamed from: a */
        public final void mo131619a(int i) {
            this.f92442a = i;
        }

        public ContactsItemData(int i, int i2, int i3, int i4, boolean z, boolean z2, Function0<Unit> function0) {
            this.f92443b = i;
            this.f92444c = i2;
            this.f92445d = i3;
            this.f92446e = i4;
            this.f92447f = z;
            this.f92448g = z2;
            this.f92449h = function0;
            this.f92442a = -1;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ ContactsItemData(int r10, int r11, int r12, int r13, boolean r14, boolean r15, kotlin.jvm.functions.Function0 r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
            /*
                r9 = this;
                r0 = r17 & 32
                if (r0 == 0) goto L_0x0007
                r0 = 0
                r7 = 0
                goto L_0x0008
            L_0x0007:
                r7 = r15
            L_0x0008:
                r0 = r17 & 64
                if (r0 == 0) goto L_0x0011
                r0 = 0
                kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
                r8 = r0
                goto L_0x0013
            L_0x0011:
                r8 = r16
            L_0x0013:
                r1 = r9
                r2 = r10
                r3 = r11
                r4 = r12
                r5 = r13
                r6 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.contact.impl.contacts_selector.ContactsSelectorItemFactory.ContactsItemData.<init>(int, int, int, int, boolean, boolean, kotlin.jvm.functions.Function0, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007H\u0016J\u0014\u0010\u001c\u001a\u00020\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001eR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorItemFactory$DefaultContactsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorItemFactory$ContactsItemHolder;", "()V", "badgeListenerMap", "", "Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorItemFactory$ContactsItemData;", "", "expandLastDividerLine", "", "getExpandLastDividerLine", "()Z", "setExpandLastDividerLine", "(Z)V", "listContactItems", "", "getItemCount", "isPreviousHasDivider", "position", "notifyBadgeUpdate", "", "badgeCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "list", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$c */
    public static final class DefaultContactsAdapter extends RecyclerView.Adapter<ContactsItemHolder> {

        /* renamed from: a */
        private boolean f92459a = true;

        /* renamed from: b */
        private final List<ContactsItemData> f92460b = new ArrayList();

        /* renamed from: c */
        private final Map<ContactsItemData, Integer> f92461c = new LinkedHashMap();

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f92460b.size();
        }

        /* renamed from: a */
        public final void mo131634a(boolean z) {
            this.f92459a = z;
        }

        /* renamed from: b */
        private final boolean m139965b(int i) {
            ContactsItemData aVar = (ContactsItemData) CollectionsKt.getOrNull(this.f92460b, i - 1);
            if (aVar != null) {
                return aVar.mo131624f();
            }
            return false;
        }

        /* renamed from: a */
        public final void mo131631a(int i) {
            for (Map.Entry<ContactsItemData, Integer> entry : this.f92461c.entrySet()) {
                entry.getValue().intValue();
                entry.getKey().mo131619a(i);
            }
            notifyDataSetChanged();
        }

        /* renamed from: a */
        public final void mo131633a(List<ContactsItemData> list) {
            Intrinsics.checkParameterIsNotNull(list, "list");
            this.f92460b.clear();
            this.f92460b.addAll(CollectionsKt.sortedWith(list, new C35745a()));
            this.f92461c.clear();
            int size = this.f92460b.size();
            for (int i = 0; i < size; i++) {
                if (this.f92460b.get(i).mo131625g()) {
                    this.f92461c.put(this.f92460b.get(i), Integer.valueOf(i));
                }
            }
            notifyDataSetChanged();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$c$a */
        public static final class C35745a<T> implements Comparator<T> {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(t.mo131623e()), Integer.valueOf(t2.mo131623e()));
            }
        }

        /* renamed from: a */
        public ContactsItemHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.options_common_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            return new ContactsItemHolder(inflate);
        }

        /* renamed from: a */
        public void onBindViewHolder(ContactsItemHolder bVar, int i) {
            int i2;
            Intrinsics.checkParameterIsNotNull(bVar, "holder");
            if (i == 0 || m139965b(i)) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (i == this.f92460b.size() - 1 && this.f92459a) {
                i2 |= 2;
            }
            bVar.mo131628a(this.f92460b.get(i), i2);
        }
    }

    /* renamed from: l */
    public final void mo131617l() {
        this.f92438c.clear();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$d */
    static final /* synthetic */ class C35746d extends FunctionReference implements Function0<Unit> {
        C35746d(ContactsSelectorItemFactory cVar) {
            super(0, cVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "appendRobot";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(ContactsSelectorItemFactory.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "appendRobot()V";
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            ((ContactsSelectorItemFactory) this.receiver).mo131611f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$e */
    static final /* synthetic */ class C35747e extends FunctionReference implements Function0<Unit> {
        C35747e(ContactsSelectorItemFactory cVar) {
            super(0, cVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "appendExternalContacts";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(ContactsSelectorItemFactory.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "appendExternalContacts()V";
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            ((ContactsSelectorItemFactory) this.receiver).mo131613h();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$f */
    static final /* synthetic */ class C35748f extends FunctionReference implements Function0<Unit> {
        C35748f(ContactsSelectorItemFactory cVar) {
            super(0, cVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "appendMineGroupItem";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(ContactsSelectorItemFactory.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "appendMineGroupItem()V";
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            ((ContactsSelectorItemFactory) this.receiver).mo131608c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$g */
    static final /* synthetic */ class C35749g extends FunctionReference implements Function0<Unit> {
        C35749g(ContactsSelectorItemFactory cVar) {
            super(0, cVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "appendNewContacts";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(ContactsSelectorItemFactory.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "appendNewContacts()V";
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            ((ContactsSelectorItemFactory) this.receiver).mo131616k();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$h */
    static final /* synthetic */ class C35750h extends FunctionReference implements Function0<Unit> {
        C35750h(ContactsSelectorItemFactory cVar) {
            super(0, cVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "appendExistGroupItem";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(ContactsSelectorItemFactory.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "appendExistGroupItem()V";
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            ((ContactsSelectorItemFactory) this.receiver).mo131610e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$i */
    static final /* synthetic */ class C35751i extends FunctionReference implements Function0<Unit> {
        C35751i(ContactsSelectorItemFactory cVar) {
            super(0, cVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "appendOwnerGroupItem";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(ContactsSelectorItemFactory.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "appendOwnerGroupItem()V";
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            ((ContactsSelectorItemFactory) this.receiver).mo131609d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$j */
    static final /* synthetic */ class C35752j extends FunctionReference implements Function0<Unit> {
        C35752j(ContactsSelectorItemFactory cVar) {
            super(0, cVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "appendOnCall";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(ContactsSelectorItemFactory.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "appendOnCall()V";
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            ((ContactsSelectorItemFactory) this.receiver).mo131612g();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$k */
    static final /* synthetic */ class C35753k extends FunctionReference implements Function0<Unit> {
        C35753k(ContactsSelectorItemFactory cVar) {
            super(0, cVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "appendSpecialFocus";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(ContactsSelectorItemFactory.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "appendSpecialFocus()V";
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            ((ContactsSelectorItemFactory) this.receiver).mo131615j();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$l */
    static final /* synthetic */ class C35754l extends FunctionReference implements Function0<Unit> {
        C35754l(ContactsSelectorItemFactory cVar) {
            super(0, cVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "appendEmailContacts";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(ContactsSelectorItemFactory.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "appendEmailContacts()V";
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            ((ContactsSelectorItemFactory) this.receiver).mo131614i();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$m */
    public static final class C35755m extends Lambda implements Function0<Unit> {
        final /* synthetic */ ContactsSelectorItemFactory this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35755m(ContactsSelectorItemFactory cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            AbstractC29565l.AbstractC29566a aVar = this.this$0.f92436a;
            if (aVar != null) {
                aVar.mo102958f();
            }
            ContactHitPoint.m140802f("email");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$n */
    public static final class C35756n extends Lambda implements Function0<Unit> {
        final /* synthetic */ ContactsSelectorItemFactory this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35756n(ContactsSelectorItemFactory cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            AbstractC29565l.AbstractC29566a aVar = this.this$0.f92436a;
            if (aVar != null) {
                aVar.mo102954b();
            }
            ContactHitPoint.m140787a("groups");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$r */
    public static final class C35760r extends Lambda implements Function0<Unit> {
        final /* synthetic */ ContactsSelectorItemFactory this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35760r(ContactsSelectorItemFactory cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            AbstractC29565l.AbstractC29566a aVar = this.this$0.f92436a;
            if (aVar != null) {
                aVar.mo102956d();
            }
            ContactHitPoint.m140787a("oncalls");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$s */
    public static final class C35761s extends Lambda implements Function0<Unit> {
        final /* synthetic */ ContactsSelectorItemFactory this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35761s(ContactsSelectorItemFactory cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            AbstractC29565l.AbstractC29566a aVar = this.this$0.f92436a;
            if (aVar != null) {
                aVar.mo102960h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$t */
    public static final class C35762t extends Lambda implements Function0<Unit> {
        final /* synthetic */ ContactsSelectorItemFactory this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35762t(ContactsSelectorItemFactory cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            AbstractC29565l.AbstractC29566a aVar = this.this$0.f92436a;
            if (aVar != null) {
                aVar.mo102955c();
            }
            ContactHitPoint.m140787a("bots");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$u */
    public static final class C35763u extends Lambda implements Function0<Unit> {
        final /* synthetic */ ContactsSelectorItemFactory this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35763u(ContactsSelectorItemFactory cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            AbstractC29565l.AbstractC29566a aVar = this.this$0.f92436a;
            if (aVar != null) {
                aVar.mo102959g();
            }
            ContactHitPoint.m140802f("special_attention");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$v */
    public static final class C35764v extends Lambda implements Function0<Unit> {
        final /* synthetic */ ContactsSelectorItemFactory this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35764v(ContactsSelectorItemFactory cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            AbstractC29565l.AbstractC29566a aVar = this.this$0.f92436a;
            if (aVar != null) {
                aVar.mo102961i();
            }
            ContactHitPoint.m140815p();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$o */
    public static final class C35757o extends Lambda implements Function0<Unit> {
        final /* synthetic */ ContactsSelectorItemFactory this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35757o(ContactsSelectorItemFactory cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            AbstractC29565l.AbstractC29566a aVar = this.this$0.f92436a;
            if (aVar != null) {
                aVar.mo102957e();
            }
            ContactHitPoint.m140787a("external");
            ContactHitPoint.m140802f("external");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$p */
    public static final class C35758p extends Lambda implements Function0<Unit> {
        final /* synthetic */ ContactsSelectorItemFactory this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35758p(ContactsSelectorItemFactory cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            AbstractC29565l.AbstractC29566a aVar = this.this$0.f92436a;
            if (aVar != null) {
                aVar.mo102954b();
            }
            ContactHitPoint.m140787a("groups");
            ContactHitPoint.m140802f("group");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.c$q */
    public static final class C35759q extends Lambda implements Function0<Unit> {
        final /* synthetic */ ContactsSelectorItemFactory this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35759q(ContactsSelectorItemFactory cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            AbstractC29565l.AbstractC29566a aVar = this.this$0.f92436a;
            if (aVar != null) {
                aVar.mo102951a();
            }
            ContactHitPoint.m140787a("newcontact");
            ContactHitPoint.m140802f("new");
        }
    }

    /* renamed from: m */
    private final ContactsItemData m139934m() {
        return new ContactsItemData(R.drawable.ud_icon_trustparty_outlined, R.color.ud_P500, R.string.Lark_B2B_TrustedParties, 0, true, false, new C35764v(this));
    }

    /* renamed from: d */
    public final void mo131609d() {
        this.f92438c.add(new ContactsItemData(R.drawable.ud_icon_group_outlined, R.color.ud_G500, R.string.Lark_Groups_MyGroups, -1, false, false, new C35761s(this)));
    }

    /* renamed from: b */
    public final List<ContactsItemData> mo131607b() {
        KFunction bVar;
        this.f92438c.clear();
        Iterator<T> it = this.f92441f.keySet().iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if ((this.f92440e & intValue) == intValue && (bVar = (KFunction) this.f92441f.get(Integer.valueOf(intValue))) != null) {
                Unit unit = (Unit) ((Function0) bVar).invoke();
            }
        }
        return this.f92438c;
    }

    /* renamed from: c */
    public final void mo131608c() {
        this.f92438c.add(new ContactsItemData(R.drawable.ud_icon_group_outlined, R.color.ud_G500, R.string.Lark_Legacy_MyGroup, 3, !this.f92437b, false, new C35758p(this)));
    }

    /* renamed from: e */
    public final void mo131610e() {
        this.f92438c.add(new ContactsItemData(R.drawable.ud_icon_group_outlined, R.color.ud_G500, R.string.Lark_Legacy_CreateGroupChatSelectGroup, 0, !this.f92437b, false, new C35756n(this)));
    }

    /* renamed from: f */
    public final void mo131611f() {
        this.f92438c.add(new ContactsItemData(R.drawable.ud_icon_robot_outlined, R.color.ud_Y500, R.string.Lark_Legacy_StructureRobot, 5, false, false, new C35762t(this), 32, null));
    }

    /* renamed from: g */
    public final void mo131612g() {
        ContactsItemData aVar = new ContactsItemData(R.drawable.ud_icon_helpdesk_outlined, R.color.function_danger_500, R.string.Lark_HelpDesk_HelpDeskTitle, 4, false, false, new C35760r(this), 32, null);
        AbstractC35361b.AbstractC35369h u = C35358a.m138143a().mo130176u();
        Intrinsics.checkExpressionValueIsNotNull(u, "ContactModule.getDepende…().getDynamicDependency()");
        if (u.mo130207a()) {
            this.f92438c.add(aVar);
        }
    }

    /* renamed from: h */
    public final void mo131613h() {
        this.f92438c.add(new ContactsItemData(R.drawable.ud_icon_external_outlined, R.color.ud_I500, R.string.Lark_Legacy_StructureExternal, 1, false, false, new C35757o(this), 32, null));
    }

    /* renamed from: i */
    public final void mo131614i() {
        this.f92438c.add(new ContactsItemData(R.drawable.ud_icon_mail_contact_outlined, R.color.ud_O500, R.string.Lark_Contacts_ContactCards, 2, true, false, new C35755m(this), 32, null));
    }

    /* renamed from: j */
    public final void mo131615j() {
        this.f92438c.add(new ContactsItemData(R.drawable.ud_icon_special_attention_outlined, R.color.ud_Y500, R.string.Lark_Legacy_SpecialRemindMember, 2, true, false, new C35763u(this), 32, null));
    }

    /* renamed from: k */
    public final void mo131616k() {
        this.f92438c.add(new ContactsItemData(R.drawable.ud_icon_member_new_outlined, R.color.ud_B500, R.string.Lark_Legacy_ContactsNew, 1, !this.f92437b, true, new C35759q(this)));
    }

    public ContactsSelectorItemFactory() {
        ContactsSelectorItemFactory cVar = this;
        this.f92441f = MapsKt.mapOf(TuplesKt.to(4, new C35746d(cVar)), TuplesKt.to(16, new C35747e(cVar)), TuplesKt.to(2, new C35748f(cVar)), TuplesKt.to(1, new C35749g(cVar)), TuplesKt.to(32, new C35750h(cVar)), TuplesKt.to(64, new C35751i(cVar)), TuplesKt.to(8, new C35752j(cVar)), TuplesKt.to(Integer.valueOf((int) DynamicModule.f58006b), new C35753k(cVar)), TuplesKt.to(Integer.valueOf((int) SmActions.ACTION_ONTHECALL_EXIT), new C35754l(cVar)));
    }

    /* renamed from: a */
    public final DefaultContactsAdapter mo131603a() {
        KFunction bVar;
        Iterator<T> it = this.f92441f.keySet().iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if ((this.f92440e & intValue) == intValue && (bVar = (KFunction) this.f92441f.get(Integer.valueOf(intValue))) != null) {
                Unit unit = (Unit) ((Function0) bVar).invoke();
            }
        }
        this.f92439d.mo131633a(this.f92438c);
        return this.f92439d;
    }

    /* renamed from: a */
    public final ContactsSelectorItemFactory mo131604a(int i) {
        ContactsSelectorItemFactory cVar = this;
        cVar.f92440e = i;
        return cVar;
    }

    /* renamed from: a */
    public final ContactsSelectorItemFactory mo131605a(AbstractC29565l.AbstractC29566a aVar) {
        ContactsSelectorItemFactory cVar = this;
        cVar.f92436a = aVar;
        return cVar;
    }

    /* renamed from: a */
    public final ContactsSelectorItemFactory mo131606a(boolean z) {
        ContactsSelectorItemFactory cVar = this;
        cVar.f92437b = z;
        return cVar;
    }

    /* renamed from: a */
    private final View m139933a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.options_common_item, (ViewGroup) null, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…common_item, null, false)");
        ContactsItemHolder bVar = new ContactsItemHolder(inflate);
        bVar.mo131627a(m139934m());
        View view = bVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        return view;
    }

    /* renamed from: a */
    public final View mo131602a(Context context, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.addView(m139933a(context), new ViewGroup.LayoutParams(-1, -2));
        if (z) {
            View view = new View(context);
            view.setBackgroundColor(ContextCompat.getColor(context, R.color.bg_base));
            linearLayout.addView(view, new LinearLayout.LayoutParams(-1, (int) C25653b.m91892a(context, 8.0f)));
        }
        return linearLayout;
    }
}
