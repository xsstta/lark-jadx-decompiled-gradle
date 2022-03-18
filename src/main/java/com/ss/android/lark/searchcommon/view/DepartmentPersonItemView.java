package com.ss.android.lark.searchcommon.view;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.ui.list.C25676a;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import com.ss.android.lark.searchcommon.view.avataritem.AvatarItemView;
import com.ss.android.lark.searchcommon.view.avataritem.userduty.UserDutyBinder;
import com.ss.android.lark.searchcommon.view.avataritem.userduty.UserDutyModel;
import com.ss.android.lark.widget.duty.UserDutyLinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u000e\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/DepartmentPersonItemView;", "Lcom/ss/android/lark/searchcommon/view/avataritem/AvatarItemView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "compositeComponentDelegate", "Lcom/larksuite/component/ui/list/CompositeComponentDelegate;", "(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/larksuite/component/ui/list/CompositeComponentDelegate;)V", "userDuty", "Lcom/ss/android/lark/widget/duty/UserDutyLinearLayout;", "addUserDutyLayout", "", "registerUserDutyModelBinder", "model", "Lcom/ss/android/lark/searchcommon/view/avataritem/userduty/UserDutyModel;", "Companion", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DepartmentPersonItemView extends AvatarItemView {

    /* renamed from: a */
    public static final Companion f133420a = new Companion(null);

    /* renamed from: e */
    private UserDutyLinearLayout f133421e;

    public DepartmentPersonItemView(Context context) {
        this(context, null, 0, null, 14, null);
    }

    public DepartmentPersonItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
    }

    public DepartmentPersonItemView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 8, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/DepartmentPersonItemView$Companion;", "", "()V", "DIVIDER_WIDTH", "", "DUTY_MIN_WIDTH", "FONT_SIZE_IN_DP", "LAYOUT_MARGIN_8", "TAG_MODE_ALIGN_RIGHT", "", "TAG_MODE_TEXT_END", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.DepartmentPersonItemView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: i */
    private final void m209255i() {
        UserDutyLinearLayout userDutyLinearLayout = this.f133421e;
        if (userDutyLinearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userDuty");
        }
        mo184674a(UserDutyModel.class, userDutyLinearLayout.getClass(), UserDutyBinder.f133550a);
    }

    /* renamed from: h */
    private final void m209254h() {
        UserDutyLinearLayout userDutyLinearLayout = new UserDutyLinearLayout(getContext());
        userDutyLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        userDutyLinearLayout.setVisibility(8);
        ((LinearLayout) findViewById(R.id.avatar_item_subtitle_container)).addView(userDutyLinearLayout);
        this.f133421e = userDutyLinearLayout;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.DepartmentPersonItemView$b */
    static final class C53959b extends Lambda implements Function0<Unit> {
        final /* synthetic */ TextView $dutyTextView;
        final /* synthetic */ TextView $sectionTextView;
        final /* synthetic */ LinearLayout $subTitleContainer;
        final /* synthetic */ DepartmentPersonItemView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53959b(DepartmentPersonItemView departmentPersonItemView, LinearLayout linearLayout, TextView textView, TextView textView2) {
            super(0);
            this.this$0 = departmentPersonItemView;
            this.$subTitleContainer = linearLayout;
            this.$sectionTextView = textView;
            this.$dutyTextView = textView2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            Context context = this.this$0.getContext();
            LinearLayout linearLayout = this.$subTitleContainer;
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "subTitleContainer");
            int b = C25653b.m91896b(context, (float) linearLayout.getWidth());
            Paint paint = new Paint(1);
            paint.setTextSize(C25653b.m91892a(this.this$0.getContext(), 12.0f));
            Context context2 = this.this$0.getContext();
            TextView textView = this.$sectionTextView;
            Intrinsics.checkExpressionValueIsNotNull(textView, "sectionTextView");
            int b2 = C25653b.m91896b(context2, paint.measureText(textView.getText().toString()));
            Paint paint2 = new Paint(1);
            paint2.setTextSize(C25653b.m91892a(this.this$0.getContext(), 12.0f));
            Context context3 = this.this$0.getContext();
            TextView textView2 = this.$dutyTextView;
            Intrinsics.checkExpressionValueIsNotNull(textView2, "dutyTextView");
            int b3 = C25653b.m91896b(context3, paint2.measureText(textView2.getText().toString()));
            float f = (float) b2;
            float f2 = f + 8.0f + 1.0f + 8.0f;
            float f3 = (float) b3;
            float f4 = (float) b;
            int i = ((f2 + f3) > f4 ? 1 : ((f2 + f3) == f4 ? 0 : -1));
            if (i > 0 && f3 <= 60.0f && b3 > 0) {
                TextView textView3 = this.$dutyTextView;
                Intrinsics.checkExpressionValueIsNotNull(textView3, "dutyTextView");
                textView3.setWidth(((int) C25653b.m91892a(this.this$0.getContext(), f3)) + 1);
                TextView textView4 = this.$sectionTextView;
                Intrinsics.checkExpressionValueIsNotNull(textView4, "sectionTextView");
                textView4.setWidth(((int) C25653b.m91892a(this.this$0.getContext(), ((((float) (b - b3)) - 8.0f) - 1.0f) - 8.0f)) - 1);
            } else if (i > 0 && f2 + 60.0f > f4 && f3 > 60.0f && b2 > 0) {
                TextView textView5 = this.$dutyTextView;
                Intrinsics.checkExpressionValueIsNotNull(textView5, "dutyTextView");
                textView5.setWidth((int) C25653b.m91892a(this.this$0.getContext(), 60.0f));
                TextView textView6 = this.$sectionTextView;
                Intrinsics.checkExpressionValueIsNotNull(textView6, "sectionTextView");
                textView6.setWidth((int) C25653b.m91892a(this.this$0.getContext(), (((f4 - 60.0f) - 8.0f) - 1.0f) - 8.0f));
            } else if (17.0f + f3 <= f4 || f2 + 60.0f >= f4 || b2 <= 0) {
                TextView textView7 = this.$dutyTextView;
                Intrinsics.checkExpressionValueIsNotNull(textView7, "dutyTextView");
                textView7.setWidth(((int) C25653b.m91892a(this.this$0.getContext(), f3)) + 1);
                TextView textView8 = this.$sectionTextView;
                Intrinsics.checkExpressionValueIsNotNull(textView8, "sectionTextView");
                textView8.setWidth(((int) C25653b.m91892a(this.this$0.getContext(), f)) + 1);
            } else {
                TextView textView9 = this.$dutyTextView;
                Intrinsics.checkExpressionValueIsNotNull(textView9, "dutyTextView");
                textView9.setWidth(((int) C25653b.m91892a(this.this$0.getContext(), ((((float) (b - b2)) - 8.0f) - 1.0f) - 8.0f)) - 1);
                TextView textView10 = this.$sectionTextView;
                Intrinsics.checkExpressionValueIsNotNull(textView10, "sectionTextView");
                textView10.setWidth(((int) C25653b.m91892a(this.this$0.getContext(), f)) + 1);
            }
        }
    }

    /* renamed from: a */
    public final void mo184578a(UserDutyModel bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "model");
        C25676a compositeComponentDelegate = getCompositeComponentDelegate();
        Class<?> cls = getClass();
        UserDutyLinearLayout userDutyLinearLayout = this.f133421e;
        if (userDutyLinearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userDuty");
        }
        compositeComponentDelegate.mo89817a((Class<? extends Object>) cls, (View) userDutyLinearLayout, (Object) bVar);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.avatar_item_subtitle_container);
        linearLayout.post(new RunnableC53976b(new C53959b(this, linearLayout, (TextView) findViewById(R.id.tv_section), (TextView) findViewById(R.id.tv_duty))));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentPersonItemView(Context context, AttributeSet attributeSet, int i, C25676a aVar) {
        super(context, attributeSet, i, aVar);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "compositeComponentDelegate");
        m209254h();
        m209255i();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DepartmentPersonItemView(Context context, AttributeSet attributeSet, int i, C25676a aVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? new C25676a() : aVar);
    }
}
