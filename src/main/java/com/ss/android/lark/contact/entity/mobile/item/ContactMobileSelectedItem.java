package com.ss.android.lark.contact.entity.mobile.item;

import android.view.View;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.thirdshare.base.export.p2741c.AbstractC55713a;
import com.ss.android.lark.thirdshare.base.export.p2741c.C55719c;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57832h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/contact/entity/mobile/item/ContactMobileSelectedItem;", "Lcom/ss/android/lark/thirdshare/base/export/item/BaseItem;", "item", "Lcom/ss/android/lark/contact/entity/mobile/item/ContactMobileItem;", "consumer", "Lcom/ss/android/lark/utils/ApiUtils$Consumer;", "(Lcom/ss/android/lark/contact/entity/mobile/item/ContactMobileItem;Lcom/ss/android/lark/utils/ApiUtils$Consumer;)V", "getConsumer", "()Lcom/ss/android/lark/utils/ApiUtils$Consumer;", "getItem", "()Lcom/ss/android/lark/contact/entity/mobile/item/ContactMobileItem;", "bind", "", "holder", "Lcom/ss/android/lark/thirdshare/base/export/item/ItemViewHolder;", "position", "", "Companion", "core_contact_contact-entity_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.contact.entity.mobile.a.b */
public final class ContactMobileSelectedItem extends AbstractC55713a<ContactMobileSelectedItem> {

    /* renamed from: a */
    public static final Companion f91475a = new Companion(null);

    /* renamed from: b */
    private final ContactMobileItem f91476b;

    /* renamed from: c */
    private final ApiUtils.AbstractC57748a<ContactMobileItem> f91477c;

    @JvmStatic
    /* renamed from: a */
    public static final List<ContactMobileSelectedItem> m138410a(List<ContactMobileItem> list, ApiUtils.AbstractC57748a<ContactMobileItem> aVar) {
        return f91475a.mo130642a(list, aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/contact/entity/mobile/item/ContactMobileSelectedItem$Companion;", "", "()V", "getItems", "", "Lcom/ss/android/lark/contact/entity/mobile/item/ContactMobileSelectedItem;", "mobileBeans", "Lcom/ss/android/lark/contact/entity/mobile/item/ContactMobileItem;", "consumer", "Lcom/ss/android/lark/utils/ApiUtils$Consumer;", "core_contact_contact-entity_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.contact.entity.mobile.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final List<ContactMobileSelectedItem> mo130642a(List<ContactMobileItem> list, ApiUtils.AbstractC57748a<ContactMobileItem> aVar) {
            Intrinsics.checkParameterIsNotNull(list, "mobileBeans");
            Intrinsics.checkParameterIsNotNull(aVar, "consumer");
            if (list.isEmpty()) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            for (ContactMobileItem aVar2 : list) {
                arrayList.add(new ContactMobileSelectedItem(aVar2, aVar));
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public final ContactMobileItem mo130638a() {
        return this.f91476b;
    }

    /* renamed from: b */
    public final ApiUtils.AbstractC57748a<ContactMobileItem> mo130639b() {
        return this.f91477c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactMobileSelectedItem(ContactMobileItem aVar, ApiUtils.AbstractC57748a<ContactMobileItem> aVar2) {
        super(R.layout.contact_mobile_selected_item);
        Intrinsics.checkParameterIsNotNull(aVar, "item");
        Intrinsics.checkParameterIsNotNull(aVar2, "consumer");
        this.f91476b = aVar;
        this.f91477c = aVar2;
        mo189843a(new AbstractC55713a.AbstractC55716a<ContactMobileSelectedItem>(this) {
            /* class com.ss.android.lark.contact.entity.mobile.item.ContactMobileSelectedItem.C354071 */

            /* renamed from: a */
            final /* synthetic */ ContactMobileSelectedItem f91478a;

            {
                this.f91478a = r1;
            }

            /* renamed from: a */
            public final void mo130641a(C55719c cVar, ContactMobileSelectedItem bVar, int i) {
                Intrinsics.checkExpressionValueIsNotNull(bVar, "item");
                bVar.mo189849e().mo189855a(i, true);
                this.f91478a.mo130639b().consume(this.f91478a.mo130638a());
            }
        });
    }

    @Override // com.ss.android.lark.thirdshare.base.export.p2741c.AbstractC55713a
    /* renamed from: a */
    public void mo130630a(C55719c cVar, int i) {
        Intrinsics.checkParameterIsNotNull(cVar, "holder");
        View a = cVar.mo189863a(R.id.cmsiNameTv);
        Intrinsics.checkExpressionValueIsNotNull(a, "holder.findViewById<TextView>(R.id.cmsiNameTv)");
        ((TextView) a).setText(this.f91476b.mo130629a().getName());
        C57832h.m224490a(cVar.itemView);
    }
}
