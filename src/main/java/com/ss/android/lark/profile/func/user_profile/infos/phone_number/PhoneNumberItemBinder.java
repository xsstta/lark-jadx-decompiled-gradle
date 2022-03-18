package com.ss.android.lark.profile.func.user_profile.infos.phone_number;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.func.user_profile.infos.BaseInfoBinder;
import com.ss.android.lark.profile.statistics.ProfileHitPoint;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/phone_number/PhoneNumberItemBinder;", "Lcom/ss/android/lark/profile/func/user_profile/infos/BaseInfoBinder;", "Lcom/ss/android/lark/profile/func/user_profile/infos/phone_number/PhoneNumberItemViewData;", "Lcom/ss/android/lark/profile/func/user_profile/infos/phone_number/IPhoneNumberDependency;", "dependency", "(Lcom/ss/android/lark/profile/func/user_profile/infos/phone_number/IPhoneNumberDependency;)V", "binderData", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.infos.e.b */
public final class PhoneNumberItemBinder extends BaseInfoBinder<PhoneNumberItemViewData, IPhoneNumberDependency> {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.e.b$a */
    public static final class View$OnClickListenerC52639a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PhoneNumberItemBinder f130306a;

        View$OnClickListenerC52639a(PhoneNumberItemBinder bVar) {
            this.f130306a = bVar;
        }

        public final void onClick(View view) {
            ProfileHitPoint.m204730j();
            ((IPhoneNumberDependency) this.f130306a.mo179589a()).mo179770a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoneNumberItemBinder(IPhoneNumberDependency aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.e.b$c */
    public static final class View$OnLongClickListenerC52641c implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ PhoneNumberItemBinder f130309a;

        /* renamed from: b */
        final /* synthetic */ PhoneNumberItemViewData f130310b;

        View$OnLongClickListenerC52641c(PhoneNumberItemBinder bVar, PhoneNumberItemViewData cVar) {
            this.f130309a = bVar;
            this.f130310b = cVar;
        }

        public final boolean onLongClick(View view) {
            String b = this.f130310b.mo179909b();
            if (b == null) {
                return true;
            }
            ((IPhoneNumberDependency) this.f130309a.mo179589a()).mo179771a(b);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.e.b$b */
    public static final class View$OnClickListenerC52640b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PhoneNumberItemBinder f130307a;

        /* renamed from: b */
        final /* synthetic */ PhoneNumberItemViewData f130308b;

        View$OnClickListenerC52640b(PhoneNumberItemBinder bVar, PhoneNumberItemViewData cVar) {
            this.f130307a = bVar;
            this.f130308b = cVar;
        }

        public final void onClick(View view) {
            ProfileHitPoint.m204726g(this.f130308b.mo179911e());
            ProfileHitPoint.m204729i();
            String b = this.f130308b.mo179909b();
            if (b != null) {
                ((IPhoneNumberDependency) this.f130307a.mo179589a()).mo179772a(b, this.f130308b.mo179910c());
            } else {
                Log.m165397w("UserProfileView", "UserProfileView the phone number is null!");
            }
        }
    }

    @Override // com.ss.android.lark.profile.func.user_profile.infos.BaseInfoBinder
    /* renamed from: a */
    public RecyclerView.ViewHolder mo179842a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(((IPhoneNumberDependency) mo179589a()).mo179591d()).inflate(R.layout.mobile_item_layout, viewGroup, false);
        if (DesktopUtil.m144301a(((IPhoneNumberDependency) mo179589a()).mo179591d())) {
            Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
            View findViewById = inflate.findViewById(R.id.mLine);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.mLine");
            TextView textView = (TextView) inflate.findViewById(R.id.mTypeNameTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.mTypeNameTv");
            mo179843a(inflate, findViewById, textView);
        }
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new PhoneNumberItemViewHolder(inflate);
    }

    /* renamed from: a */
    public void mo179592a(View view, PhoneNumberItemViewData cVar) {
        int i;
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        TextView textView = (TextView) view.findViewById(R.id.mTypeNameTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.mTypeNameTv");
        mo179844a(textView, cVar.mo179856a());
        TextView textView2 = (TextView) view.findViewById(R.id.mShowTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "view.mShowTv");
        int i2 = 0;
        if (cVar.mo179910c()) {
            i = 0;
            i2 = 8;
        } else {
            i = C57582a.m223611b(((IPhoneNumberDependency) mo179589a()).mo179591d(), (int) R.dimen.phone_number_text_view_margin_right);
        }
        textView2.setVisibility(i2);
        TextView textView3 = (TextView) view.findViewById(R.id.mPhoneNumberTv);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "view.mPhoneNumberTv");
        ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, i, marginLayoutParams.bottomMargin);
            TextView textView4 = (TextView) view.findViewById(R.id.mPhoneNumberTv);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "view.mPhoneNumberTv");
            textView4.setText(cVar.mo179909b());
            ((TextView) view.findViewById(R.id.mShowTv)).setOnClickListener(new View$OnClickListenerC52639a(this));
            view.setOnClickListener(new View$OnClickListenerC52640b(this, cVar));
            if (cVar.mo179910c()) {
                view.setOnLongClickListener(new View$OnLongClickListenerC52641c(this, cVar));
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
