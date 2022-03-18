package com.ss.android.lark.mail.impl.widget.time.multitimezone;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.utils.AbstractC44045a;
import com.ss.android.lark.mail.impl.widget.time.multitimezone.TimezoneAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u001a\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneVH;", "Lcom/ss/android/lark/mail/impl/widget/advrecyclerview/utils/AbstractSwipeableItemViewHolder;", "mView", "Landroid/view/View;", "(Landroid/view/View;)V", "bindItem", "", "itemData", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneItemData;", "clickListener", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimezoneAdapter$ItemClickListener;", "getSwipeableContainerView", "initListener", "initView", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.o */
public final class TimeZoneVH extends AbstractC44045a {

    /* renamed from: a */
    private final View f112069a;

    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.AbstractC44041h
    /* renamed from: a */
    public View mo153358a() {
        RelativeLayout relativeLayout = (RelativeLayout) this.f112069a.findViewById(R.id.frontViewContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "mView.frontViewContainer");
        return relativeLayout;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.o$a */
    public static final class View$OnClickListenerC44131a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TimezoneAdapter.ItemClickListener f112070a;

        /* renamed from: b */
        final /* synthetic */ TimeZoneItemData f112071b;

        View$OnClickListenerC44131a(TimezoneAdapter.ItemClickListener aVar, TimeZoneItemData iVar) {
            this.f112070a = aVar;
            this.f112071b = iVar;
        }

        public final void onClick(View view) {
            TimezoneAdapter.ItemClickListener aVar = this.f112070a;
            if (aVar != null) {
                aVar.mo157071a(this.f112071b);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeZoneVH(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "mView");
        this.f112069a = view;
    }

    /* renamed from: a */
    private final void m174944a(TimeZoneItemData iVar) {
        int i;
        boolean z;
        TextView textView = (TextView) this.f112069a.findViewById(R.id.timezoneNameTV);
        Intrinsics.checkExpressionValueIsNotNull(textView, "mView.timezoneNameTV");
        textView.setText(iVar.mo157047d());
        TextView textView2 = (TextView) this.f112069a.findViewById(R.id.timezoneOffsetTV);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "mView.timezoneOffsetTV");
        textView2.setText(TimeZoneUtils.m174943a(iVar.mo157048e()));
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.f112069a.findViewById(R.id.selectedIcon);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "mView.selectedIcon");
        if (iVar.mo157044a()) {
            i = 0;
        } else {
            i = 8;
        }
        appCompatImageView.setVisibility(i);
        ArrayList<String> b = iVar.mo157045b();
        ArrayList<String> arrayList = b;
        if (arrayList == null || arrayList.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String a = C43819s.m173684a((int) R.string.Calendar_Common_Comma);
            StringBuilder sb = new StringBuilder();
            sb.append(b.get(0));
            int size = b.size();
            for (int i2 = 1; i2 < size; i2++) {
                sb.append(a);
                sb.append(b.get(i2));
            }
            TextView textView3 = (TextView) this.f112069a.findViewById(R.id.includeCityLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "mView.includeCityLabel");
            textView3.setText(C43819s.m173686a(R.string.Calendar_Common_Includes, "itemName", sb.toString()));
            TextView textView4 = (TextView) this.f112069a.findViewById(R.id.includeCityLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "mView.includeCityLabel");
            textView4.setVisibility(0);
            return;
        }
        TextView textView5 = (TextView) this.f112069a.findViewById(R.id.includeCityLabel);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "mView.includeCityLabel");
        textView5.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo157072a(TimeZoneItemData iVar, TimezoneAdapter.ItemClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "itemData");
        m174944a(iVar);
        m174945b(iVar, aVar);
    }

    /* renamed from: b */
    private final void m174945b(TimeZoneItemData iVar, TimezoneAdapter.ItemClickListener aVar) {
        ((RelativeLayout) this.f112069a.findViewById(R.id.frontViewContainer)).setOnClickListener(new View$OnClickListenerC44131a(aVar, iVar));
    }
}
