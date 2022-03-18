package com.ss.android.lark.profile.func.v3.userprofile.fields.phone_number;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoBinderV3;
import com.ss.android.lark.profile.statistics.ProfileHitPoint;
import com.ss.android.lark.profile.statistics.UserProfileHitPointV3;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/phone_number/PhoneNumberItemBinderV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoBinderV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/phone_number/PhoneNumberItemViewDataV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/phone_number/IPhoneNumberDependencyV3;", "dependency", "(Lcom/ss/android/lark/profile/func/v3/userprofile/fields/phone_number/IPhoneNumberDependencyV3;)V", "bindData", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "isLast", "", "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.i.b */
public final class PhoneNumberItemBinderV3 extends BaseInfoBinderV3<PhoneNumberItemViewDataV3, IPhoneNumberDependencyV3> {

    /* renamed from: a */
    public static final Companion f130565a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/phone_number/PhoneNumberItemBinderV3$Companion;", "", "()V", "TAG", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.i.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoneNumberItemBinderV3(IPhoneNumberDependencyV3 aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.i.b$b */
    public static final class View$OnClickListenerC52790b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PhoneNumberItemBinderV3 f130566a;

        /* renamed from: b */
        final /* synthetic */ PhoneNumberItemViewDataV3 f130567b;

        View$OnClickListenerC52790b(PhoneNumberItemBinderV3 bVar, PhoneNumberItemViewDataV3 cVar) {
            this.f130566a = bVar;
            this.f130567b = cVar;
        }

        public final void onClick(View view) {
            ProfileHitPoint.m204730j();
            UserProfileHitPointV3.f130746c.mo180563a(this.f130567b.mo180256d());
            ((IPhoneNumberDependencyV3) this.f130566a.mo180255b()).mo180299b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.i.b$d */
    public static final class View$OnLongClickListenerC52792d implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ PhoneNumberItemBinderV3 f130570a;

        /* renamed from: b */
        final /* synthetic */ PhoneNumberItemViewDataV3 f130571b;

        View$OnLongClickListenerC52792d(PhoneNumberItemBinderV3 bVar, PhoneNumberItemViewDataV3 cVar) {
            this.f130570a = bVar;
            this.f130571b = cVar;
        }

        public final boolean onLongClick(View view) {
            String a = this.f130571b.mo180327a();
            if (a == null) {
                return true;
            }
            ((IPhoneNumberDependencyV3) this.f130570a.mo180255b()).mo180297a(a);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.i.b$c */
    public static final class View$OnClickListenerC52791c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PhoneNumberItemBinderV3 f130568a;

        /* renamed from: b */
        final /* synthetic */ PhoneNumberItemViewDataV3 f130569b;

        View$OnClickListenerC52791c(PhoneNumberItemBinderV3 bVar, PhoneNumberItemViewDataV3 cVar) {
            this.f130568a = bVar;
            this.f130569b = cVar;
        }

        public final void onClick(View view) {
            ProfileHitPoint.m204726g(this.f130569b.mo180331e());
            ProfileHitPoint.m204729i();
            String a = this.f130569b.mo180327a();
            if (a != null) {
                ((IPhoneNumberDependencyV3) this.f130568a.mo180255b()).mo180298a(a, this.f130569b.mo180330b());
            } else {
                Log.m165397w("PhoneNumberItemBinderV3", "the phone number is null!");
            }
        }
    }

    @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoBinderV3
    /* renamed from: a */
    public RecyclerView.ViewHolder mo180235a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mobile_item_v3_layout, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new PhoneNumberItemViewHolderV3(inflate);
    }

    /* renamed from: a */
    public void mo180237a(View view, PhoneNumberItemViewDataV3 cVar, boolean z) {
        int i;
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        TextView textView = (TextView) view.findViewById(R.id.tv_phone_name);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.tv_phone_name");
        mo180252a(textView, cVar.mo180254c());
        TextView textView2 = (TextView) view.findViewById(R.id.tv_show);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "view.tv_show");
        int i2 = 0;
        if (cVar.mo180330b()) {
            i = 0;
            i2 = 8;
        } else {
            i = C57582a.m223611b(((IPhoneNumberDependencyV3) mo180255b()).mo180100a(), (int) R.dimen.phone_number_text_view_margin_right);
        }
        textView2.setVisibility(i2);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_phone_value);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "view.tv_phone_value");
        ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, i, marginLayoutParams.bottomMargin);
            TextView textView4 = (TextView) view.findViewById(R.id.tv_phone_value);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "view.tv_phone_value");
            textView4.setText(cVar.mo180327a());
            ((TextView) view.findViewById(R.id.tv_show)).setOnClickListener(new View$OnClickListenerC52790b(this, cVar));
            view.setOnClickListener(new View$OnClickListenerC52791c(this, cVar));
            if (cVar.mo180330b()) {
                view.setOnLongClickListener(new View$OnLongClickListenerC52792d(this, cVar));
            }
            View findViewById = view.findViewById(R.id.line);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.line");
            mo180251a(findViewById, z);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
