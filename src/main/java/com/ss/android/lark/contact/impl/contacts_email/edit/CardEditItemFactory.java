package com.ss.android.lark.contact.impl.contacts_email.edit;

import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.edittext.UDTextInputLayout;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.contact.impl.contacts_email.edit.widget.EditTextWithPrefix;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u001c2\u00020\u0001:\u0004\u0019\u001a\u001b\u001cB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\bH\u0002J\b\u0010\u0010\u001a\u00020\bH\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002J\b\u0010\u0012\u001a\u00020\bH\u0002J\b\u0010\u0013\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\bH\u0002J\b\u0010\u0015\u001a\u00020\bH\u0002J\u0006\u0010\u0016\u001a\u00020\u0004J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007`\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory;", "", "()V", "adapter", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory$CardEditAdapter;", "addItemActions", "Ljava/util/ArrayList;", "Lkotlin/reflect/KFunction0;", "", "Lkotlin/collections/ArrayList;", "editItemTouchListener", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory$CardEditItemHolder$IEditItemTouchListener;", "itemList", "", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory$CardEditItemData;", "appendCompany", "appendEmail", "appendExtra", "appendGroup", "appendName", "appendPhone", "appendTitle", "getAdapter", "getItemList", "touchListener", "CardEditAdapter", "CardEditItemData", "CardEditItemHolder", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.b */
public final class CardEditItemFactory {

    /* renamed from: a */
    public static final Companion f91903a = new Companion(null);

    /* renamed from: b */
    private final CardEditAdapter f91904b = new CardEditAdapter();

    /* renamed from: c */
    private CardEditItemHolder.IEditItemTouchListener f91905c;

    /* renamed from: d */
    private final List<CardEditItemData> f91906d = new ArrayList();

    /* renamed from: e */
    private ArrayList<KFunction<Unit>> f91907e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J1\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010\n\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010\u0005J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000e¨\u0006*"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory$CardEditItemData;", "", "itemIndex", "", "itemName", "", "isRequired", "", "maxLength", "(ILjava/lang/String;ZI)V", "errTip", "getErrTip", "()Ljava/lang/String;", "setErrTip", "(Ljava/lang/String;)V", "isFormatValid", "()Z", "setFormatValid", "(Z)V", "itemContent", "getItemContent", "setItemContent", "getItemIndex", "()I", "getItemName", "getMaxLength", "phonePrefix", "getPhonePrefix", "setPhonePrefix", "phoneRegionCode", "getPhoneRegionCode", "setPhoneRegionCode", "component1", "component2", "component3", "component4", "copy", "equals", "other", "tip", "hashCode", "toString", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.b$b */
    public static final class CardEditItemData {

        /* renamed from: a */
        private String f91910a;

        /* renamed from: b */
        private String f91911b;

        /* renamed from: c */
        private boolean f91912c = true;

        /* renamed from: d */
        private String f91913d;

        /* renamed from: e */
        private String f91914e;

        /* renamed from: f */
        private final int f91915f;

        /* renamed from: g */
        private final String f91916g;

        /* renamed from: h */
        private final boolean f91917h;

        /* renamed from: i */
        private final int f91918i;

        /* renamed from: a */
        public static /* synthetic */ CardEditItemData m139068a(CardEditItemData bVar, int i, String str, boolean z, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = bVar.f91915f;
            }
            if ((i3 & 2) != 0) {
                str = bVar.f91916g;
            }
            if ((i3 & 4) != 0) {
                z = bVar.f91917h;
            }
            if ((i3 & 8) != 0) {
                i2 = bVar.f91918i;
            }
            return bVar.mo131070a(i, str, z, i2);
        }

        /* renamed from: a */
        public final CardEditItemData mo131070a(int i, String str, boolean z, int i2) {
            Intrinsics.checkParameterIsNotNull(str, "itemName");
            return new CardEditItemData(i, str, z, i2);
        }

        public int hashCode() {
            int i = this.f91915f * 31;
            String str = this.f91916g;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            boolean z = this.f91917h;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            return ((hashCode + i2) * 31) + this.f91918i;
        }

        public String toString() {
            return "CardEditItemData(itemIndex=" + this.f91915f + ", itemName=" + this.f91916g + ", isRequired=" + this.f91917h + ", maxLength=" + this.f91918i + ")";
        }

        /* renamed from: a */
        public final String mo131071a() {
            return this.f91910a;
        }

        /* renamed from: b */
        public final String mo131074b() {
            return this.f91911b;
        }

        /* renamed from: d */
        public final String mo131079d() {
            return this.f91913d;
        }

        /* renamed from: e */
        public final String mo131080e() {
            return this.f91914e;
        }

        /* renamed from: f */
        public final int mo131082f() {
            return this.f91915f;
        }

        /* renamed from: g */
        public final String mo131083g() {
            return this.f91916g;
        }

        /* renamed from: h */
        public final boolean mo131084h() {
            return this.f91917h;
        }

        /* renamed from: i */
        public final int mo131086i() {
            return this.f91918i;
        }

        /* renamed from: c */
        public final boolean mo131077c() {
            return this.f91912c;
        }

        /* renamed from: c */
        public final void mo131076c(String str) {
            this.f91914e = str;
        }

        /* renamed from: a */
        public final void mo131072a(String str) {
            this.f91910a = str;
        }

        /* renamed from: b */
        public final void mo131075b(String str) {
            this.f91911b = str;
        }

        /* renamed from: d */
        public final CardEditItemData mo131078d(String str) {
            CardEditItemData bVar = this;
            bVar.f91913d = str;
            return bVar;
        }

        /* renamed from: a */
        public final void mo131073a(boolean z) {
            this.f91912c = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || (!Intrinsics.areEqual(obj.getClass(), CardEditItemData.class))) {
                return false;
            }
            if (this.f91915f == 3 && (!Intrinsics.areEqual(this.f91914e, ((CardEditItemData) obj).f91914e))) {
                return false;
            }
            CardEditItemData bVar = (CardEditItemData) obj;
            if (TextUtils.isEmpty(this.f91910a) && TextUtils.isEmpty(bVar.f91910a)) {
                return true;
            }
            return Intrinsics.areEqual(this.f91910a, bVar.f91910a);
        }

        public CardEditItemData(int i, String str, boolean z, int i2) {
            Intrinsics.checkParameterIsNotNull(str, "itemName");
            this.f91915f = i;
            this.f91916g = str;
            this.f91917h = z;
            this.f91918i = i2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory$Companion;", "", "()V", "CHINEA_PHONE_LENGTH", "", "DEFAULT_MAX_LENGTH", "EMAIL_MAX_LENGTH", "EXTRA_MAX_HEIGHT", "", "EXTRA_MAX_LENGTH", "NAME_MAX_LENGTH", "PHONE_MAX_LENGTH", "checkEmailFormatValid", "", "email", "", "isChinaPhoneLength", "phoneNumber", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.b$d */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo131096a(CharSequence charSequence) {
            Intrinsics.checkParameterIsNotNull(charSequence, "email");
            if (TextUtils.isEmpty(charSequence)) {
                return true;
            }
            return MailAddressValidator.f91926a.mo131119a(charSequence);
        }

        /* renamed from: a */
        public final boolean mo131097a(String str) {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            if (str == null || str.length() != 11) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: b */
    public final List<CardEditItemData> mo131056b() {
        return this.f91906d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000bJ\u0006\u0010\u0013\u001a\u00020\bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory$CardEditAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory$CardEditItemHolder;", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory$CardEditItemData;", "()V", "editItemTouchListener", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory$CardEditItemHolder$IEditItemTouchListener;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "touchListener", "updateItem", "itemIndex", "updateItemsError", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.b$a */
    public static final class CardEditAdapter extends LarkRecyclerViewBaseAdapter<CardEditItemHolder, CardEditItemData> {

        /* renamed from: a */
        private CardEditItemHolder.IEditItemTouchListener f91908a;

        /* renamed from: a */
        public final void mo131066a() {
            mo131067a(0);
            mo131067a(3);
            mo131067a(4);
        }

        /* renamed from: a */
        public final void mo131067a(int i) {
            notifyItemChanged(i);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.b$a$a */
        public static final class View$OnClickListenerC35534a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ CardEditItemHolder f91909a;

            View$OnClickListenerC35534a(CardEditItemHolder cVar) {
                this.f91909a = cVar;
            }

            public final void onClick(View view) {
                this.f91909a.itemView.requestFocus();
            }
        }

        /* renamed from: a */
        public final CardEditAdapter mo131064a(CardEditItemHolder.IEditItemTouchListener aVar) {
            CardEditAdapter aVar2 = this;
            aVar2.f91908a = aVar;
            return aVar2;
        }

        /* renamed from: a */
        public void onBindViewHolder(CardEditItemHolder cVar, int i) {
            Intrinsics.checkParameterIsNotNull(cVar, "holder");
            Object item = getItem(i);
            Intrinsics.checkExpressionValueIsNotNull(item, "getItem(position)");
            cVar.mo131089a((CardEditItemData) item);
            cVar.itemView.setOnClickListener(new View$OnClickListenerC35534a(cVar));
        }

        /* renamed from: a */
        public CardEditItemHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_edit_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
            return new CardEditItemHolder(inflate).mo131088a(this.f91908a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.b$e */
    static final /* synthetic */ class C35538e extends FunctionReference implements Function0<Unit> {
        C35538e(CardEditItemFactory bVar) {
            super(0, bVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "appendName";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(CardEditItemFactory.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "appendName()V";
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            ((CardEditItemFactory) this.receiver).mo131057c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.b$f */
    static final /* synthetic */ class C35539f extends FunctionReference implements Function0<Unit> {
        C35539f(CardEditItemFactory bVar) {
            super(0, bVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "appendCompany";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(CardEditItemFactory.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "appendCompany()V";
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            ((CardEditItemFactory) this.receiver).mo131058d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.b$g */
    static final /* synthetic */ class C35540g extends FunctionReference implements Function0<Unit> {
        C35540g(CardEditItemFactory bVar) {
            super(0, bVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "appendTitle";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(CardEditItemFactory.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "appendTitle()V";
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            ((CardEditItemFactory) this.receiver).mo131059e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.b$h */
    static final /* synthetic */ class C35541h extends FunctionReference implements Function0<Unit> {
        C35541h(CardEditItemFactory bVar) {
            super(0, bVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "appendPhone";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(CardEditItemFactory.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "appendPhone()V";
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            ((CardEditItemFactory) this.receiver).mo131060f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.b$i */
    static final /* synthetic */ class C35542i extends FunctionReference implements Function0<Unit> {
        C35542i(CardEditItemFactory bVar) {
            super(0, bVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "appendEmail";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(CardEditItemFactory.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "appendEmail()V";
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            ((CardEditItemFactory) this.receiver).mo131061g();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.b$j */
    static final /* synthetic */ class C35543j extends FunctionReference implements Function0<Unit> {
        C35543j(CardEditItemFactory bVar) {
            super(0, bVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "appendGroup";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(CardEditItemFactory.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "appendGroup()V";
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            ((CardEditItemFactory) this.receiver).mo131062h();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.b$k */
    static final /* synthetic */ class C35544k extends FunctionReference implements Function0<Unit> {
        C35544k(CardEditItemFactory bVar) {
            super(0, bVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "appendExtra";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(CardEditItemFactory.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "appendExtra()V";
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            ((CardEditItemFactory) this.receiver).mo131063i();
        }
    }

    /* renamed from: d */
    public final void mo131058d() {
        String string = UIHelper.getString(R.string.Lark_Contacts_ContactCardCompany);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…tacts_ContactCardCompany)");
        this.f91906d.add(1, new CardEditItemData(1, string, false, 64));
    }

    /* renamed from: e */
    public final void mo131059e() {
        String string = UIHelper.getString(R.string.Lark_Contacts_ContactCardRole);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…Contacts_ContactCardRole)");
        this.f91906d.add(2, new CardEditItemData(2, string, false, 64));
    }

    /* renamed from: h */
    public final void mo131062h() {
        String string = UIHelper.getString(R.string.Lark_Contacts_ContactCardTag);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…_Contacts_ContactCardTag)");
        this.f91906d.add(5, new CardEditItemData(5, string, false, 64));
    }

    /* renamed from: i */
    public final void mo131063i() {
        String string = UIHelper.getString(R.string.Lark_Contacts_ContactCardNotes);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…ontacts_ContactCardNotes)");
        this.f91906d.add(6, new CardEditItemData(6, string, false, 1000));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory$CardEditItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "editItemTouchListener", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory$CardEditItemHolder$IEditItemTouchListener;", "etItemView", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/widget/EditTextWithPrefix;", "inputLayout", "Lcom/larksuite/component/universe_design/edittext/UDTextInputLayout;", "getInputLayout", "()Lcom/larksuite/component/universe_design/edittext/UDTextInputLayout;", "setInputLayout", "(Lcom/larksuite/component/universe_design/edittext/UDTextInputLayout;)V", "bindEditView", "", "item", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory$CardEditItemData;", "bindExtraEditText", "bindInputRuleForEditText", "itemIndex", "", "bindPhonePrefix", "bindView", "checkFormatValid", "listener", "updateErrorTipView", "IEditItemTouchListener", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.b$c */
    public static final class CardEditItemHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public EditTextWithPrefix f91919a;

        /* renamed from: b */
        public IEditItemTouchListener f91920b;

        /* renamed from: c */
        private UDTextInputLayout f91921c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory$CardEditItemHolder$IEditItemTouchListener;", "", "onPhonePrefixClick", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.b$c$a */
        public interface IEditItemTouchListener {
            /* renamed from: a */
            void mo131091a();
        }

        /* renamed from: a */
        private final void m139084a() {
            this.f91919a.setSingleLine(false);
            this.f91919a.setGravity(0);
            this.f91919a.setTextAlignment(2);
            ViewGroup.LayoutParams layoutParams = this.f91919a.getLayoutParams();
            layoutParams.height = UIHelper.dp2px(120.0f);
            this.f91919a.setLayoutParams(layoutParams);
            this.f91919a.mo90928b(true);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory$CardEditItemHolder$bindEditView$watcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.b$c$c */
        public static final class C35536c implements TextWatcher {

            /* renamed from: a */
            final /* synthetic */ CardEditItemData f91924a;

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                Intrinsics.checkParameterIsNotNull(charSequence, "s");
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                Intrinsics.checkParameterIsNotNull(charSequence, "s");
            }

            C35536c(CardEditItemData bVar) {
                this.f91924a = bVar;
            }

            public void afterTextChanged(Editable editable) {
                Intrinsics.checkParameterIsNotNull(editable, "s");
                this.f91924a.mo131072a(editable.toString());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory$CardEditItemHolder$bindPhonePrefix$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.b$c$d */
        public static final class C35537d extends OnSingleClickListener {

            /* renamed from: a */
            final /* synthetic */ CardEditItemHolder f91925a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C35537d(CardEditItemHolder cVar) {
                this.f91925a = cVar;
            }

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                IEditItemTouchListener aVar = this.f91925a.f91920b;
                if (aVar != null) {
                    aVar.mo131091a();
                }
            }
        }

        /* renamed from: a */
        public final CardEditItemHolder mo131088a(IEditItemTouchListener aVar) {
            CardEditItemHolder cVar = this;
            cVar.f91920b = aVar;
            return cVar;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CardEditItemHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            UDTextInputLayout uDTextInputLayout = (UDTextInputLayout) view;
            this.f91921c = uDTextInputLayout;
            EditText editText = uDTextInputLayout.getEditText();
            if (editText != null) {
                this.f91919a = (EditTextWithPrefix) editText;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.contact.impl.contacts_email.edit.widget.EditTextWithPrefix");
        }

        /* renamed from: a */
        private final void m139085a(int i) {
            if (i == 3) {
                this.f91919a.setKeyListener(DigitsKeyListener.getInstance("0123456789"));
            } else if (i == 4) {
                this.f91919a.setInputType(32);
            }
        }

        /* renamed from: e */
        private final void m139088e(CardEditItemData bVar) {
            if (bVar.mo131082f() == 3) {
                this.f91919a.mo131136a(bVar.mo131074b(), new C35537d(this));
            } else {
                this.f91919a.mo131136a((String) null, (View.OnClickListener) null);
            }
        }

        /* renamed from: b */
        public final void mo131090b(CardEditItemData bVar) {
            boolean z;
            if (bVar.mo131082f() == 3) {
                z = CardEditItemFactory.f91903a.mo131097a(bVar.mo131071a());
            } else {
                z = CardEditItemFactory.f91903a.mo131096a((CharSequence) String.valueOf(this.f91919a.getText()));
            }
            bVar.mo131073a(z);
            m139086c(bVar);
        }

        /* renamed from: c */
        private final void m139086c(CardEditItemData bVar) {
            if (bVar.mo131082f() != 3 && bVar.mo131082f() != 4 && bVar.mo131082f() != 0) {
                this.f91921c.mo90946b("");
                this.f91919a.mo90935m();
            } else if (bVar.mo131077c()) {
                this.f91921c.mo90946b("");
                this.f91919a.mo90935m();
            } else {
                this.f91921c.mo90946b(bVar.mo131079d());
                this.f91919a.mo90934l();
            }
        }

        /* renamed from: a */
        public final void mo131089a(CardEditItemData bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "item");
            if (bVar.mo131084h()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bVar.mo131083g() + "*");
                spannableStringBuilder.setSpan(new ForegroundColorSpan(UIHelper.getColor(R.color.function_danger_500)), bVar.mo131083g().length(), bVar.mo131083g().length() + 1, 34);
                this.f91921c.mo90944a(spannableStringBuilder);
            } else {
                this.f91921c.mo90944a(bVar.mo131083g());
            }
            m139088e(bVar);
            m139086c(bVar);
            m139087d(bVar);
        }

        /* renamed from: d */
        private final void m139087d(CardEditItemData bVar) {
            int i;
            m139085a(bVar.mo131082f());
            this.f91919a.setText(bVar.mo131071a());
            this.f91919a.addTextChangedListener(new C35536c(bVar));
            this.f91919a.setOnFocusChangeListener(new View$OnFocusChangeListenerC35535b(this, bVar));
            this.f91919a.setHint(UIHelper.getString(R.string.Lark_Contacts_ContactCardPleaseEnter));
            this.f91919a.setHintTextColor(UIHelper.getColor(R.color.lkui_N500));
            EditTextWithPrefix editTextWithPrefix = this.f91919a;
            Editable text = editTextWithPrefix.getText();
            if (text != null) {
                i = text.length();
            } else {
                i = 0;
            }
            editTextWithPrefix.setSelection(i);
            if (bVar.mo131086i() > 0) {
                this.f91919a.mo90924a(bVar.mo131086i());
            }
            this.f91919a.setFilters(new InputFilter[]{new InputFilter.LengthFilter(bVar.mo131086i())});
            Integer num = 6;
            if (num.equals(Integer.valueOf(bVar.mo131082f()))) {
                m139084a();
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.b$c$b */
        public static final class View$OnFocusChangeListenerC35535b implements View.OnFocusChangeListener {

            /* renamed from: a */
            final /* synthetic */ CardEditItemHolder f91922a;

            /* renamed from: b */
            final /* synthetic */ CardEditItemData f91923b;

            View$OnFocusChangeListenerC35535b(CardEditItemHolder cVar, CardEditItemData bVar) {
                this.f91922a = cVar;
                this.f91923b = bVar;
            }

            public final void onFocusChange(View view, boolean z) {
                int f;
                if (!z && ((f = this.f91923b.mo131082f()) == 3 || f == 4)) {
                    this.f91922a.mo131090b(this.f91923b);
                }
                KeyboardUtils.hideKeyboard(this.f91922a.f91919a.getContext(), this.f91922a.f91919a);
            }
        }
    }

    /* renamed from: a */
    public final CardEditAdapter mo131054a() {
        Iterator<T> it = this.f91907e.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
        this.f91904b.mo131064a(this.f91905c);
        return this.f91904b;
    }

    /* renamed from: c */
    public final void mo131057c() {
        String string = UIHelper.getString(R.string.Lark_Contacts_ContactCardName);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…Contacts_ContactCardName)");
        this.f91906d.add(0, new CardEditItemData(0, string, true, 32).mo131078d(UIHelper.getString(R.string.Lark_Contacts_PlsEnterName)));
    }

    /* renamed from: f */
    public final void mo131060f() {
        String string = UIHelper.getString(R.string.Lark_Contacts_ContactCardMobile);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…ntacts_ContactCardMobile)");
        this.f91906d.add(3, new CardEditItemData(3, string, false, 11).mo131078d(UIHelper.getString(R.string.Lark_Contacts_PlsEnterValidMobileToast)));
    }

    /* renamed from: g */
    public final void mo131061g() {
        String string = UIHelper.getString(R.string.Lark_Contacts_ContactCardEmail);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…ontacts_ContactCardEmail)");
        this.f91906d.add(4, new CardEditItemData(4, string, false, 320).mo131078d(UIHelper.getString(R.string.Lark_Contacts_PlsEnterValidEmailToast)));
    }

    public CardEditItemFactory() {
        CardEditItemFactory bVar = this;
        this.f91907e = CollectionsKt.arrayListOf(new C35538e(bVar), new C35539f(bVar), new C35540g(bVar), new C35541h(bVar), new C35542i(bVar), new C35543j(bVar), new C35544k(bVar));
    }

    /* renamed from: a */
    public final CardEditItemFactory mo131055a(CardEditItemHolder.IEditItemTouchListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "touchListener");
        CardEditItemFactory bVar = this;
        bVar.f91905c = aVar;
        return bVar;
    }
}
