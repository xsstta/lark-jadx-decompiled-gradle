package com.ss.android.lark.contact.entity.mobile.item;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.entity.api.ContactMobileApi;
import com.ss.android.lark.contact.entity.mobile.ContactMobileBean;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.inv.export.util.C40129q;
import com.ss.android.lark.thirdshare.base.export.p2741c.AbstractC55713a;
import com.ss.android.lark.thirdshare.base.export.p2741c.C55719c;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002+,B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B-\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0018\u0010'\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010(\u001a\u00020!H\u0002J\u0010\u0010)\u001a\u00020!2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u000e\u0010*\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u001cR\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\nX.¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/lark/contact/entity/mobile/item/ContactMobileItem;", "Lcom/ss/android/lark/thirdshare/base/export/item/BaseItem;", "()V", "bean", "Lcom/ss/android/lark/contact/entity/mobile/ContactMobileBean;", "chooseType", "Lcom/ss/android/lark/contact/entity/api/ContactMobileApi$ChooseType;", "onClickListener", "Lcom/ss/android/lark/contact/entity/mobile/item/ContactMobileItem$OnContactsBeanClickListener;", "selectedBeans", "", "(Lcom/ss/android/lark/contact/entity/mobile/ContactMobileBean;Lcom/ss/android/lark/contact/entity/api/ContactMobileApi$ChooseType;Lcom/ss/android/lark/contact/entity/mobile/item/ContactMobileItem$OnContactsBeanClickListener;Ljava/util/List;)V", "getBean", "()Lcom/ss/android/lark/contact/entity/mobile/ContactMobileBean;", "setBean", "(Lcom/ss/android/lark/contact/entity/mobile/ContactMobileBean;)V", "cmiAvatarIv", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView;", "cmiAvatarRl", "Landroid/widget/RelativeLayout;", "cmiAvatarTv", "Landroid/widget/TextView;", "cmiCb", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "cmiDataTv", "cmiLabelTv", "cmiNameTv", "isSelected", "", "label", "", "selectedItems", "bind", "", "holder", "Lcom/ss/android/lark/thirdshare/base/export/item/ItemViewHolder;", "position", "", "initView", "onViewRecycled", "setParamsForDesktop", "updateLabel", "updateSelected", "Companion", "OnContactsBeanClickListener", "core_contact_contact-entity_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.contact.entity.mobile.a.a */
public final class ContactMobileItem extends AbstractC55713a<ContactMobileItem> {

    /* renamed from: g */
    public static final Companion f91460g = new Companion(null);

    /* renamed from: a */
    public ContactMobileBean f91461a;

    /* renamed from: b */
    public ContactMobileApi.C35402a f91462b;

    /* renamed from: c */
    public OnContactsBeanClickListener f91463c;

    /* renamed from: d */
    public List<ContactMobileItem> f91464d;

    /* renamed from: e */
    public UDCheckBox f91465e;

    /* renamed from: f */
    public boolean f91466f;

    /* renamed from: l */
    private TextView f91467l;

    /* renamed from: m */
    private TextView f91468m;

    /* renamed from: n */
    private LKUIRoundedImageView f91469n;

    /* renamed from: o */
    private TextView f91470o;

    /* renamed from: p */
    private RelativeLayout f91471p;

    /* renamed from: q */
    private TextView f91472q;

    /* renamed from: r */
    private String f91473r;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/contact/entity/mobile/item/ContactMobileItem$OnContactsBeanClickListener;", "", "onMobileItemClicked", "", "item", "Lcom/ss/android/lark/contact/entity/mobile/item/ContactMobileItem;", "parentView", "Landroid/view/View;", "isChecked", "", "core_contact_contact-entity_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.contact.entity.mobile.a.a$b */
    public interface OnContactsBeanClickListener {
        /* renamed from: a */
        void mo130635a(ContactMobileItem aVar);

        /* renamed from: a */
        void mo130636a(ContactMobileItem aVar, View view, boolean z);
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<ContactMobileItem> m138396a(List<? extends ContactMobileBean> list, ContactMobileApi.C35402a aVar, OnContactsBeanClickListener bVar, List<ContactMobileItem> list2) {
        return f91460g.mo130634a(list, aVar, bVar, list2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/contact/entity/mobile/item/ContactMobileItem$Companion;", "", "()V", "MAX_SELECTED_COUNT", "", "getItems", "", "Lcom/ss/android/lark/contact/entity/mobile/item/ContactMobileItem;", "mobileBeans", "Lcom/ss/android/lark/contact/entity/mobile/ContactMobileBean;", "chooseType", "Lcom/ss/android/lark/contact/entity/api/ContactMobileApi$ChooseType;", "onClickListener", "Lcom/ss/android/lark/contact/entity/mobile/item/ContactMobileItem$OnContactsBeanClickListener;", "selectedBeans", "core_contact_contact-entity_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.contact.entity.mobile.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final List<ContactMobileItem> mo130634a(List<? extends ContactMobileBean> list, ContactMobileApi.C35402a aVar, OnContactsBeanClickListener bVar, List<ContactMobileItem> list2) {
            Intrinsics.checkParameterIsNotNull(aVar, "chooseType");
            Intrinsics.checkParameterIsNotNull(bVar, "onClickListener");
            Intrinsics.checkParameterIsNotNull(list2, "selectedBeans");
            if (list == null || list.isEmpty()) {
                return CollectionsKt.listOf(new ContactMobileItem());
            }
            ArrayList arrayList = new ArrayList();
            for (ContactMobileBean contactMobileBean : list) {
                arrayList.add(new ContactMobileItem(contactMobileBean, aVar, bVar, list2));
            }
            return arrayList;
        }
    }

    public ContactMobileItem() {
        super(R.layout.contact_mobile_empty);
    }

    /* renamed from: a */
    public final ContactMobileBean mo130629a() {
        ContactMobileBean contactMobileBean = this.f91461a;
        if (contactMobileBean == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bean");
        }
        return contactMobileBean;
    }

    /* renamed from: b */
    private final void m138399b() {
        RelativeLayout relativeLayout = this.f91471p;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cmiAvatarRl");
        }
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.height = UIHelper.dp2px(32.0f);
            layoutParams2.width = UIHelper.dp2px(32.0f);
            RelativeLayout relativeLayout2 = this.f91471p;
            if (relativeLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cmiAvatarRl");
            }
            relativeLayout2.setLayoutParams(layoutParams2);
            TextView[] textViewArr = new TextView[1];
            TextView textView = this.f91467l;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cmiNameTv");
            }
            textViewArr[0] = textView;
            DesktopUtil.m144299a(textViewArr);
            TextView[] textViewArr2 = new TextView[1];
            TextView textView2 = this.f91468m;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cmiDataTv");
            }
            textViewArr2[0] = textView2;
            DesktopUtil.m144306b(textViewArr2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    /* renamed from: a */
    public static final /* synthetic */ ContactMobileApi.C35402a m138395a(ContactMobileItem aVar) {
        ContactMobileApi.C35402a aVar2 = aVar.f91462b;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chooseType");
        }
        return aVar2;
    }

    /* renamed from: b */
    public static final /* synthetic */ UDCheckBox m138398b(ContactMobileItem aVar) {
        UDCheckBox uDCheckBox = aVar.f91465e;
        if (uDCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cmiCb");
        }
        return uDCheckBox;
    }

    /* renamed from: c */
    public static final /* synthetic */ List m138400c(ContactMobileItem aVar) {
        List<ContactMobileItem> list = aVar.f91464d;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectedItems");
        }
        return list;
    }

    /* renamed from: d */
    public static final /* synthetic */ OnContactsBeanClickListener m138401d(ContactMobileItem aVar) {
        OnContactsBeanClickListener bVar = aVar.f91463c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onClickListener");
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo130631a(String str) {
        this.f91473r = str;
        if (this.f137416h) {
            String str2 = str;
            if (TextUtils.isEmpty(str2)) {
                TextView textView = this.f91472q;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cmiLabelTv");
                }
                textView.setVisibility(8);
                return;
            }
            TextView textView2 = this.f91472q;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cmiLabelTv");
            }
            textView2.setVisibility(0);
            TextView textView3 = this.f91472q;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cmiLabelTv");
            }
            textView3.setText(str2);
        }
    }

    /* renamed from: a */
    public final void mo130632a(boolean z) {
        this.f91466f = z;
        if (this.f137416h) {
            UDCheckBox uDCheckBox = this.f91465e;
            if (uDCheckBox == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cmiCb");
            }
            uDCheckBox.setChecked(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.contact.entity.mobile.a.a$c */
    static final class View$OnClickListenerC35406c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ContactMobileItem f91474a;

        View$OnClickListenerC35406c(ContactMobileItem aVar) {
            this.f91474a = aVar;
        }

        public final void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            C40129q.m159107a(ViewUtils.m224142a(view));
            if (ContactMobileItem.m138395a(this.f91474a).mo130576c()) {
                if (ContactMobileItem.m138398b(this.f91474a).isChecked() || ContactMobileItem.m138400c(this.f91474a).size() < 50) {
                    ContactMobileItem.m138398b(this.f91474a).setChecked(!ContactMobileItem.m138398b(this.f91474a).isChecked());
                    ContactMobileItem aVar = this.f91474a;
                    aVar.f91466f = ContactMobileItem.m138398b(aVar).isChecked();
                    OnContactsBeanClickListener d = ContactMobileItem.m138401d(this.f91474a);
                    ContactMobileItem aVar2 = this.f91474a;
                    d.mo130636a(aVar2, view, ContactMobileItem.m138398b(aVar2).isChecked());
                    return;
                }
                ViewUtils.m224150a(UIHelper.mustacheFormat((int) R.string.Lark_Invitation_MembersBatchLimit, "LIMIT_NUMBER", String.valueOf(50)));
            } else if (ContactMobileItem.m138395a(this.f91474a).mo130577d()) {
                ContactMobileItem.m138401d(this.f91474a).mo130635a(this.f91474a);
            }
        }
    }

    /* renamed from: a */
    private final void m138397a(C55719c cVar) {
        View a = cVar.mo189863a(R.id.cmiNameTv);
        Intrinsics.checkExpressionValueIsNotNull(a, "holder.findViewById(R.id.cmiNameTv)");
        this.f91467l = (TextView) a;
        View a2 = cVar.mo189863a(R.id.cmiDataTv);
        Intrinsics.checkExpressionValueIsNotNull(a2, "holder.findViewById(R.id.cmiDataTv)");
        this.f91468m = (TextView) a2;
        View a3 = cVar.mo189863a(R.id.cmiAvatarIv);
        Intrinsics.checkExpressionValueIsNotNull(a3, "holder.findViewById(R.id.cmiAvatarIv)");
        this.f91469n = (LKUIRoundedImageView) a3;
        View a4 = cVar.mo189863a(R.id.cmiCb);
        Intrinsics.checkExpressionValueIsNotNull(a4, "holder.findViewById(R.id.cmiCb)");
        this.f91465e = (UDCheckBox) a4;
        View a5 = cVar.mo189863a(R.id.cmiAvatarTv);
        Intrinsics.checkExpressionValueIsNotNull(a5, "holder.findViewById(R.id.cmiAvatarTv)");
        this.f91470o = (TextView) a5;
        View a6 = cVar.mo189863a(R.id.cmiAvatarRl);
        Intrinsics.checkExpressionValueIsNotNull(a6, "holder.findViewById(R.id.cmiAvatarRl)");
        this.f91471p = (RelativeLayout) a6;
        View a7 = cVar.mo189863a(R.id.cmiLabelTv);
        Intrinsics.checkExpressionValueIsNotNull(a7, "holder.findViewById(R.id.cmiLabelTv)");
        this.f91472q = (TextView) a7;
        ContactMobileApi.C35402a aVar = this.f91462b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chooseType");
        }
        if (aVar.mo130577d()) {
            UDCheckBox uDCheckBox = this.f91465e;
            if (uDCheckBox == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cmiCb");
            }
            uDCheckBox.setVisibility(8);
            RelativeLayout relativeLayout = this.f91471p;
            if (relativeLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cmiAvatarRl");
            }
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            if (layoutParams != null) {
                ((RelativeLayout.LayoutParams) layoutParams).leftMargin = UIHelper.dp2px(16.0f);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
        } else {
            ContactMobileApi.C35402a aVar2 = this.f91462b;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chooseType");
            }
            if (aVar2.mo130576c()) {
                UDCheckBox uDCheckBox2 = this.f91465e;
                if (uDCheckBox2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cmiCb");
                }
                uDCheckBox2.setVisibility(0);
            }
        }
        m138399b();
    }

    @Override // com.ss.android.lark.thirdshare.base.export.p2741c.AbstractC55713a
    /* renamed from: b */
    public void mo130633b(C55719c cVar, int i) {
        Intrinsics.checkParameterIsNotNull(cVar, "holder");
        super.mo130633b(cVar, i);
        if (!mo189847c(R.layout.contact_mobile_empty)) {
            ContactMobileBean contactMobileBean = this.f91461a;
            if (contactMobileBean == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bean");
            }
            TextView textView = this.f91470o;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cmiAvatarTv");
            }
            LKUIRoundedImageView lKUIRoundedImageView = this.f91469n;
            if (lKUIRoundedImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cmiAvatarIv");
            }
            contactMobileBean.cancelLoadAvatar(textView, lKUIRoundedImageView);
        }
    }

    @Override // com.ss.android.lark.thirdshare.base.export.p2741c.AbstractC55713a
    /* renamed from: a */
    public void mo130630a(C55719c cVar, int i) {
        String str;
        Intrinsics.checkParameterIsNotNull(cVar, "holder");
        if (!mo189847c(R.layout.contact_mobile_empty)) {
            m138397a(cVar);
            TextView textView = this.f91467l;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cmiNameTv");
            }
            ContactMobileBean contactMobileBean = this.f91461a;
            if (contactMobileBean == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bean");
            }
            textView.setText(contactMobileBean.getName());
            TextView textView2 = this.f91468m;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cmiDataTv");
            }
            ContactMobileBean contactMobileBean2 = this.f91461a;
            if (contactMobileBean2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bean");
            }
            if (TextUtils.isEmpty(contactMobileBean2.getPhone())) {
                ContactMobileBean contactMobileBean3 = this.f91461a;
                if (contactMobileBean3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bean");
                }
                str = contactMobileBean3.getEmail();
            } else {
                ContactMobileBean contactMobileBean4 = this.f91461a;
                if (contactMobileBean4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bean");
                }
                str = contactMobileBean4.getPhone();
            }
            textView2.setText(str);
            ContactMobileBean contactMobileBean5 = this.f91461a;
            if (contactMobileBean5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bean");
            }
            TextView textView3 = this.f91470o;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cmiAvatarTv");
            }
            LKUIRoundedImageView lKUIRoundedImageView = this.f91469n;
            if (lKUIRoundedImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cmiAvatarIv");
            }
            contactMobileBean5.loadAvatar(textView3, lKUIRoundedImageView);
            ContactMobileApi.C35402a aVar = this.f91462b;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chooseType");
            }
            if (aVar.mo130576c()) {
                UDCheckBox uDCheckBox = this.f91465e;
                if (uDCheckBox == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cmiCb");
                }
                uDCheckBox.setClickable(false);
                mo130632a(this.f91466f);
            }
            mo130631a(this.f91473r);
            cVar.itemView.setOnClickListener(new View$OnClickListenerC35406c(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactMobileItem(ContactMobileBean contactMobileBean, ContactMobileApi.C35402a aVar, OnContactsBeanClickListener bVar, List<ContactMobileItem> list) {
        super(R.layout.contact_mobile_item);
        Intrinsics.checkParameterIsNotNull(contactMobileBean, "bean");
        Intrinsics.checkParameterIsNotNull(aVar, "chooseType");
        Intrinsics.checkParameterIsNotNull(bVar, "onClickListener");
        Intrinsics.checkParameterIsNotNull(list, "selectedBeans");
        this.f91461a = contactMobileBean;
        this.f91462b = aVar;
        this.f91463c = bVar;
        this.f91464d = list;
    }
}
