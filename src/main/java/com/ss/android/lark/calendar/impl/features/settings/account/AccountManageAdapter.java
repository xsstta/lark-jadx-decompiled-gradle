package com.ss.android.lark.calendar.impl.features.settings.account;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.impl.features.local.C31934h;
import com.ss.android.lark.calendar.impl.features.settings.account.AccountManageContract;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32493l;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004$%&'B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015H\u0016J\u0014\u0010 \u001a\u00020\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0010\u0010\"\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010\u0011R*\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006("}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewDelegate", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageContract$IAccountManageView$ViewDelegate;", "(Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageContract$IAccountManageView$ViewDelegate;)V", "localAccountMap", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "mContext", "Landroid/content/Context;", "mDataList", "", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;", "mOnItemClickListener", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageAdapter$OnItemClickListener;", "getViewDelegate", "()Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageContract$IAccountManageView$ViewDelegate;", "getItemCount", "", "getItemViewType", "position", "getLocalAccVisibility", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCalendars", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setOnItemClickListener", "onItemClickListener", "AccountViewHolder", "ImportEntranceViewHolder", "OnItemClickListener", "TitleViewHolder", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.b */
public final class AccountManageAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public HashMap<String, Boolean> f83026a = new HashMap<>();

    /* renamed from: b */
    public Context f83027b;

    /* renamed from: c */
    public OnItemClickListener f83028c;

    /* renamed from: d */
    private List<AccountDataListItem> f83029d = new ArrayList();

    /* renamed from: e */
    private final AccountManageContract.IAccountManageView.ViewDelegate f83030e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageAdapter$OnItemClickListener;", "", "onBindGoogleCalendarClickListener", "", "view", "Landroid/view/View;", "onImportExchangeCalendarClick", "onImportLocalCalendarClick", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.b$c */
    public interface OnItemClickListener {
        /* renamed from: a */
        void mo118421a();

        /* renamed from: a */
        void mo118422a(View view);

        /* renamed from: b */
        void mo118423b();
    }

    /* renamed from: a */
    public final AccountManageContract.IAccountManageView.ViewDelegate mo118412a() {
        return this.f83030e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f83029d.size();
    }

    /* renamed from: b */
    private final void m123677b() {
        boolean z;
        this.f83026a.clear();
        C31934h a = C31934h.m121506a();
        Intrinsics.checkExpressionValueIsNotNull(a, "LocalSettingManager.getInstance()");
        Map<String, Boolean> c = a.mo116563c();
        for (String str : c.keySet()) {
            Boolean bool = c.get(str);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            Intrinsics.checkExpressionValueIsNotNull(str, "localName");
            this.f83026a.put(str, Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    public final void mo118413a(OnItemClickListener cVar) {
        this.f83028c = cVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageAdapter$AccountViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageAdapter;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.b$a */
    public final class AccountViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ AccountManageAdapter f83031a;

        /* renamed from: b */
        private final View f83032b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.b$a$a */
        public static final class View$OnClickListenerC32401a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ AccountViewHolder f83033a;

            /* renamed from: b */
            final /* synthetic */ AccountDataListItem f83034b;

            View$OnClickListenerC32401a(AccountViewHolder aVar, AccountDataListItem aVar2) {
                this.f83033a = aVar;
                this.f83034b = aVar2;
            }

            public final void onClick(View view) {
                this.f83033a.f83031a.mo118412a().mo118432a(this.f83034b);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.b$a$b */
        public static final class View$OnClickListenerC32402b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ AccountViewHolder f83035a;

            /* renamed from: b */
            final /* synthetic */ AccountDataListItem f83036b;

            View$OnClickListenerC32402b(AccountViewHolder aVar, AccountDataListItem aVar2) {
                this.f83035a = aVar;
                this.f83036b = aVar2;
            }

            public final void onClick(View view) {
                this.f83035a.f83031a.mo118412a().mo118432a(this.f83036b);
            }
        }

        /* renamed from: a */
        public final void mo118415a(AccountDataListItem aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (aVar.mo118409e()) {
                ((ImageView) this.f83032b.findViewById(R.id.calendarIcon)).setImageResource(R.drawable.ud_icon_google_colorful);
                ImageView imageView = (ImageView) this.f83032b.findViewById(R.id.arrow);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "view.arrow");
                imageView.setVisibility(0);
                UDSwitch uDSwitch = (UDSwitch) this.f83032b.findViewById(R.id.switchBtn);
                Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "view.switchBtn");
                uDSwitch.setVisibility(8);
                this.f83032b.setClickable(true);
                this.f83032b.setOnClickListener(new View$OnClickListenerC32401a(this, aVar));
            } else if (aVar.mo118408d()) {
                ((ImageView) this.f83032b.findViewById(R.id.calendarIcon)).setImageResource(R.drawable.ud_icon_exchange_colorful);
                ImageView imageView2 = (ImageView) this.f83032b.findViewById(R.id.arrow);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "view.arrow");
                imageView2.setVisibility(0);
                UDSwitch uDSwitch2 = (UDSwitch) this.f83032b.findViewById(R.id.switchBtn);
                Intrinsics.checkExpressionValueIsNotNull(uDSwitch2, "view.switchBtn");
                uDSwitch2.setVisibility(8);
                this.f83032b.setClickable(true);
                this.f83032b.setOnClickListener(new View$OnClickListenerC32402b(this, aVar));
            } else if (aVar.mo118410f()) {
                LinearLayout linearLayout = (LinearLayout) this.f83032b.findViewById(R.id.container);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "view.container");
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.height = UIUtils.dp2px(this.f83031a.f83027b, 52.0f);
                    LinearLayout linearLayout2 = (LinearLayout) this.f83032b.findViewById(R.id.container);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "view.container");
                    linearLayout2.setLayoutParams(layoutParams2);
                    TextView textView = (TextView) this.f83032b.findViewById(R.id.tvSendMail);
                    Intrinsics.checkExpressionValueIsNotNull(textView, "view.tvSendMail");
                    textView.setVisibility(8);
                    this.f83032b.setClickable(false);
                    ((ImageView) this.f83032b.findViewById(R.id.calendarIcon)).setImageResource(R.drawable.ud_icon_phone_colorful);
                    Boolean bool = this.f83031a.f83026a.get(aVar.mo118403b());
                    if (bool == null) {
                        bool = false;
                    }
                    Intrinsics.checkExpressionValueIsNotNull(bool, "localAccountMap[data.title] ?: false");
                    boolean booleanValue = bool.booleanValue();
                    UDSwitch uDSwitch3 = (UDSwitch) this.f83032b.findViewById(R.id.switchBtn);
                    Intrinsics.checkExpressionValueIsNotNull(uDSwitch3, "view.switchBtn");
                    uDSwitch3.setChecked(booleanValue);
                    ((UDSwitch) this.f83032b.findViewById(R.id.switchBtn)).setOnCheckedChangeListener(new C32403c(aVar));
                    ImageView imageView3 = (ImageView) this.f83032b.findViewById(R.id.arrow);
                    Intrinsics.checkExpressionValueIsNotNull(imageView3, "view.arrow");
                    imageView3.setVisibility(8);
                    UDSwitch uDSwitch4 = (UDSwitch) this.f83032b.findViewById(R.id.switchBtn);
                    Intrinsics.checkExpressionValueIsNotNull(uDSwitch4, "view.switchBtn");
                    uDSwitch4.setVisibility(0);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            }
            TextView textView2 = (TextView) this.f83032b.findViewById(R.id.tvAccount);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "view.tvAccount");
            textView2.setText(aVar.mo118403b());
            int g = aVar.mo118411g();
            if (g == 0) {
                View findViewById = this.f83032b.findViewById(R.id.accItemDivider);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.accItemDivider");
                findViewById.setVisibility(0);
                this.f83032b.setBackground(C32634ae.m125184d(R.drawable.calendar_setting_item_bg_top_r10_selector));
            } else if (g == 2) {
                View findViewById2 = this.f83032b.findViewById(R.id.accItemDivider);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.accItemDivider");
                findViewById2.setVisibility(8);
                this.f83032b.setBackground(C32634ae.m125184d(R.drawable.calendar_setting_item_bg_bottom_r10_selector));
            } else if (g != 3) {
                View findViewById3 = this.f83032b.findViewById(R.id.accItemDivider);
                Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.accItemDivider");
                findViewById3.setVisibility(0);
                this.f83032b.setBackground(C32634ae.m125184d(R.drawable.unsubscribe_item_bg_selector));
            } else {
                View findViewById4 = this.f83032b.findViewById(R.id.accItemDivider);
                Intrinsics.checkExpressionValueIsNotNull(findViewById4, "view.accItemDivider");
                findViewById4.setVisibility(8);
                this.f83032b.setBackground(C32634ae.m125184d(R.drawable.calendar_setting_item_bg_r10_selector));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AccountViewHolder(AccountManageAdapter bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f83031a = bVar;
            this.f83032b = view;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.b$a$c */
        public static final class C32403c implements CompoundButton.OnCheckedChangeListener {

            /* renamed from: a */
            final /* synthetic */ AccountDataListItem f83037a;

            C32403c(AccountDataListItem aVar) {
                this.f83037a = aVar;
            }

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                String str;
                C31934h.m121506a().mo116559a(this.f83037a.mo118403b(), z);
                EventBus.getDefault().trigger(new C32493l());
                if (z) {
                    str = "on";
                } else {
                    str = "off";
                }
                GeneralHitPoint.m124246f(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo118414a(List<AccountDataListItem> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f83029d = list;
        m123677b();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f83029d.get(i).mo118406c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageAdapter$TitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageAdapter;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bind", "", "title", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.b$d */
    public final class TitleViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ AccountManageAdapter f83042a;

        /* renamed from: b */
        private final View f83043b;

        /* renamed from: a */
        public final void mo118424a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "title");
            TextView textView = (TextView) this.f83043b.findViewById(R.id.accountTitle);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.accountTitle");
            textView.setText(str);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TitleViewHolder(AccountManageAdapter bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f83042a = bVar;
            this.f83043b = view;
        }
    }

    public AccountManageAdapter(AccountManageContract.IAccountManageView.ViewDelegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewDelegate");
        this.f83030e = aVar;
        m123677b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageAdapter$ImportEntranceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageAdapter;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.b$b */
    public final class ImportEntranceViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ AccountManageAdapter f83038a;

        /* renamed from: b */
        private final View f83039b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.b$b$a */
        public static final class View$OnClickListenerC32404a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ ImportEntranceViewHolder f83040a;

            /* renamed from: b */
            final /* synthetic */ AccountDataListItem f83041b;

            View$OnClickListenerC32404a(ImportEntranceViewHolder bVar, AccountDataListItem aVar) {
                this.f83040a = bVar;
                this.f83041b = aVar;
            }

            public final void onClick(View view) {
                OnItemClickListener cVar;
                int c = this.f83041b.mo118406c();
                if (c == 2) {
                    GeneralHitPoint.f83331a.mo118715B("exchange");
                    OnItemClickListener cVar2 = this.f83040a.f83038a.f83028c;
                    if (cVar2 != null) {
                        cVar2.mo118421a();
                    }
                } else if (c == 4 && (cVar = this.f83040a.f83038a.f83028c) != null) {
                    cVar.mo118423b();
                }
            }
        }

        /* renamed from: a */
        public final void mo118419a(AccountDataListItem aVar) {
            OnItemClickListener cVar;
            Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f83039b.setOnClickListener(new View$OnClickListenerC32404a(this, aVar));
            if (aVar.mo118406c() == 3 && (cVar = this.f83038a.f83028c) != null) {
                cVar.mo118422a(this.f83039b);
            }
            if (aVar.mo118411g() == 2) {
                this.f83039b.setBackground(C32634ae.m125184d(R.drawable.calendar_setting_item_bg_bottom_r10_selector));
            } else {
                this.f83039b.setBackground(C32634ae.m125184d(R.drawable.calendar_setting_item_bg_r10_selector));
            }
            TextView textView = (TextView) this.f83039b.findViewById(R.id.addLabelTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.addLabelTv");
            textView.setText(C32634ae.m125182b(R.string.Calendar_GoogleCal_ImportCalendars));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ImportEntranceViewHolder(AccountManageAdapter bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f83038a = bVar;
            this.f83039b = view;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (viewHolder instanceof ImportEntranceViewHolder) {
            ((ImportEntranceViewHolder) viewHolder).mo118419a(this.f83029d.get(i));
        } else if (viewHolder instanceof AccountViewHolder) {
            ((AccountViewHolder) viewHolder).mo118415a(this.f83029d.get(i));
        } else if (viewHolder instanceof TitleViewHolder) {
            ((TitleViewHolder) viewHolder).mo118424a(this.f83029d.get(i).mo118403b());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        this.f83027b = viewGroup.getContext();
        if (i == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.calendar_account_item_title, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            return new TitleViewHolder(this, inflate);
        } else if (i == 2 || i == 3 || i == 4) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.calendar_account_item_import, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate2, "view");
            return new ImportEntranceViewHolder(this, inflate2);
        } else {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.calendar_account_item_account, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate3, "view");
            return new AccountViewHolder(this, inflate3);
        }
    }
}
