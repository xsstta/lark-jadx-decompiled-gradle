package com.ss.android.lark.calendar.impl.features.meetingroom.form;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.adapter.ScheduleCustomizationAdapter;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.data.ResourceFormUIData;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.helper.MeetingRoomFormHelper;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.listener.IOptionListener;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u001aH\u0002J\b\u0010\u001d\u001a\u00020\u001aH\u0002J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\b\u0010\u001f\u001a\u00020\u001aH\u0002R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006 "}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/MeetingRoomFormView;", "", "fragment", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/MeetingRoomFormFragment;", "rootView", "Landroid/view/View;", "viewModelProviders", "Landroidx/lifecycle/ViewModelProvider;", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/MeetingRoomFormFragment;Landroid/view/View;Landroidx/lifecycle/ViewModelProvider;)V", "customizationAdapter", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/adapter/ScheduleCustomizationAdapter;", "getCustomizationAdapter", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/adapter/ScheduleCustomizationAdapter;", "setCustomizationAdapter", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/adapter/ScheduleCustomizationAdapter;)V", "getFragment", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/MeetingRoomFormFragment;", "getRootView", "()Landroid/view/View;", "viewModel", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/MeetingRoomFormViewModel;", "getViewModel", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/MeetingRoomFormViewModel;", "getViewModelProviders", "()Landroidx/lifecycle/ViewModelProvider;", "create", "", "initBottomAction", "initCustomizationRv", "initTopContainer", "initView", "showSaveNotifyDialog", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.b */
public final class MeetingRoomFormView {

    /* renamed from: a */
    private ScheduleCustomizationAdapter f82014a;

    /* renamed from: b */
    private final MeetingRoomFormFragment f82015b;

    /* renamed from: c */
    private final View f82016c;

    /* renamed from: d */
    private final C1144ai f82017d;

    /* renamed from: b */
    public final ScheduleCustomizationAdapter mo117063b() {
        return this.f82014a;
    }

    /* renamed from: c */
    public final void mo117064c() {
        m122012f();
    }

    /* renamed from: e */
    public final View mo117066e() {
        return this.f82016c;
    }

    /* renamed from: f */
    private final void m122012f() {
        m122015i();
        m122013g();
        m122014h();
    }

    /* renamed from: a */
    public final MeetingRoomFormViewModel mo117062a() {
        AbstractC1142af a = this.f82017d.mo6005a(MeetingRoomFormViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "viewModelProviders.get(M…ormViewModel::class.java)");
        return (MeetingRoomFormViewModel) a;
    }

    /* renamed from: d */
    public final void mo117065d() {
        Context context = this.f82015b.getContext();
        if (context != null) {
            new C25639g(context).mo89242c(C32634ae.m125182b(R.string.Calendar_Edit_UnSaveTip)).mo89224a(R.id.lkui_dialog_btn_left, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null).mo89224a(R.id.lkui_dialog_btn_right, R.string.Calendar_Common_Confirm, new DialogInterface$OnClickListenerC32090h(this)).mo89239c();
        }
    }

    /* renamed from: g */
    private final void m122013g() {
        this.f82014a = new ScheduleCustomizationAdapter(new C32087e(this));
        RecyclerView recyclerView = (RecyclerView) this.f82016c.findViewById(R.id.customizationRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.customizationRv");
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f82015b.getContext()));
        RecyclerView recyclerView2 = (RecyclerView) this.f82016c.findViewById(R.id.customizationRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.customizationRv");
        recyclerView2.setAdapter(this.f82014a);
        mo117062a().getFormListData().mo5923a(this.f82015b, new C32088f(this));
    }

    /* renamed from: h */
    private final void m122014h() {
        ((TextView) this.f82016c.findViewById(R.id.cancelTv)).setOnClickListener(new View$OnClickListenerC32080a(this));
        mo117062a().getContactIdLiveData().mo5923a(this.f82015b, new C32081b(this));
        mo117062a().getCanClickComplete().mo5923a(this.f82015b, new C32083c(this));
        mo117062a().getShowSaveNotifyDialog().mo5923a(this.f82015b, new C32086d(this));
    }

    /* renamed from: i */
    private final void m122015i() {
        TextView textView = (TextView) this.f82016c.findViewById(R.id.topScheduleTipTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.topScheduleTipTv");
        MeetingRoomFormHelper aVar = MeetingRoomFormHelper.f82028a;
        String a = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_MeetingRoom_CustomizedResevationFormContent, "mark", "*");
        if (a == null) {
            a = "";
        }
        textView.setText(aVar.mo117083a(a));
        ((CommonTitleBar) this.f82016c.findViewById(R.id.formTitleBar)).setLeftClickListener(new View$OnClickListenerC32089g(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.b$d */
    public static final class C32086d<T> implements AbstractC1178x<Object> {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomFormView f82023a;

        C32086d(MeetingRoomFormView bVar) {
            this.f82023a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1178x
        public final void onChanged(Object obj) {
            this.f82023a.mo117065d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/form/MeetingRoomFormView$initCustomizationRv$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/listener/IOptionListener;", "onEditInputCustomization", "", "customizationKey", "", "inputContent", "onEditOtherOptionInput", "onMultipleOptionSelected", "optionKey", "onSingleOptionSelected", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.b$e */
    public static final class C32087e implements IOptionListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomFormView f82024a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32087e(MeetingRoomFormView bVar) {
            this.f82024a = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.form.listener.IOptionListener
        /* renamed from: a */
        public void mo117073a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "customizationKey");
            Intrinsics.checkParameterIsNotNull(str2, "optionKey");
            this.f82024a.mo117062a().onMultipleOptionSelected(str, str2);
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.form.listener.IOptionListener
        /* renamed from: b */
        public void mo117074b(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "customizationKey");
            Intrinsics.checkParameterIsNotNull(str2, "optionKey");
            this.f82024a.mo117062a().onSingleOptionSelected(str, str2);
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.form.listener.IOptionListener
        /* renamed from: c */
        public void mo117075c(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "customizationKey");
            Intrinsics.checkParameterIsNotNull(str2, "inputContent");
            this.f82024a.mo117062a().onEditOtherOptionInput(str, str2);
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.form.listener.IOptionListener
        /* renamed from: d */
        public void mo117076d(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "customizationKey");
            Intrinsics.checkParameterIsNotNull(str2, "inputContent");
            this.f82024a.mo117062a().onEditInputCustomization(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.b$a */
    public static final class View$OnClickListenerC32080a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomFormView f82018a;

        View$OnClickListenerC32080a(MeetingRoomFormView bVar) {
            this.f82018a = bVar;
        }

        public final void onClick(View view) {
            this.f82018a.mo117062a().onCancelBtClicked();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.b$g */
    public static final class View$OnClickListenerC32089g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomFormView f82026a;

        View$OnClickListenerC32089g(MeetingRoomFormView bVar) {
            this.f82026a = bVar;
        }

        public final void onClick(View view) {
            this.f82026a.mo117062a().onBackPressed();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/data/ResourceFormUIData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.b$f */
    public static final class C32088f<T> implements AbstractC1178x<List<ResourceFormUIData>> {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomFormView f82025a;

        C32088f(MeetingRoomFormView bVar) {
            this.f82025a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(List<ResourceFormUIData> list) {
            ScheduleCustomizationAdapter b = this.f82025a.mo117063b();
            if (b != null) {
                b.mo117042a(new ArrayList(list));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.b$b */
    public static final class C32081b<T> implements AbstractC1178x<List<? extends Pair<? extends String, ? extends String>>> {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomFormView f82019a;

        C32081b(MeetingRoomFormView bVar) {
            this.f82019a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(List<Pair<String, String>> list) {
            boolean z;
            List<Pair<String, String>> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                TextView textView = (TextView) this.f82019a.mo117066e().findViewById(R.id.scheduleBottomTipTv);
                Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.scheduleBottomTipTv");
                textView.setVisibility(8);
                return;
            }
            TextView textView2 = (TextView) this.f82019a.mo117066e().findViewById(R.id.scheduleBottomTipTv);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.scheduleBottomTipTv");
            textView2.setVisibility(0);
            TextView textView3 = (TextView) this.f82019a.mo117066e().findViewById(R.id.scheduleBottomTipTv);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "rootView.scheduleBottomTipTv");
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
            TextView textView4 = (TextView) this.f82019a.mo117066e().findViewById(R.id.scheduleBottomTipTv);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "rootView.scheduleBottomTipTv");
            textView4.setHighlightColor(C32634ae.m125178a(R.color.lkui_transparent));
            TextView textView5 = (TextView) this.f82019a.mo117066e().findViewById(R.id.scheduleBottomTipTv);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "rootView.scheduleBottomTipTv");
            textView5.setText(MeetingRoomFormHelper.f82028a.mo117080a(list, new Function1<String, Unit>(this) {
                /* class com.ss.android.lark.calendar.impl.features.meetingroom.form.MeetingRoomFormView.C32081b.C320821 */
                final /* synthetic */ C32081b this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke(str);
                    return Unit.INSTANCE;
                }

                public final void invoke(String str) {
                    Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
                    this.this$0.f82019a.mo117066e().requestFocus();
                    this.this$0.f82019a.mo117062a().onClickContactName(str);
                }
            }));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.b$c */
    public static final class C32083c<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomFormView f82020a;

        C32083c(MeetingRoomFormView bVar) {
            this.f82020a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Drawable mutate;
            Drawable mutate2;
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                TextView textView = (TextView) this.f82020a.mo117066e().findViewById(R.id.completeTv);
                Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.completeTv");
                Drawable background = textView.getBackground();
                if (!(background == null || (mutate2 = background.mutate()) == null)) {
                    mutate2.setTint(C32634ae.m125178a(R.color.primary_pri_500));
                }
                ((TextView) this.f82020a.mo117066e().findViewById(R.id.completeTv)).setOnClickListener(new View.OnClickListener(this) {
                    /* class com.ss.android.lark.calendar.impl.features.meetingroom.form.MeetingRoomFormView.C32083c.View$OnClickListenerC320841 */

                    /* renamed from: a */
                    final /* synthetic */ C32083c f82021a;

                    {
                        this.f82021a = r1;
                    }

                    public final void onClick(View view) {
                        this.f82021a.f82020a.mo117062a().onCompleteBtClicked();
                    }
                });
                return;
            }
            ((TextView) this.f82020a.mo117066e().findViewById(R.id.completeTv)).setOnClickListener(View$OnClickListenerC320852.f82022a);
            TextView textView2 = (TextView) this.f82020a.mo117066e().findViewById(R.id.completeTv);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.completeTv");
            Drawable background2 = textView2.getBackground();
            if (background2 != null && (mutate = background2.mutate()) != null) {
                mutate.setTint(C32634ae.m125178a(R.color.ud_N400));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick", "com/ss/android/lark/calendar/impl/features/meetingroom/form/MeetingRoomFormView$showSaveNotifyDialog$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.b$h */
    public static final class DialogInterface$OnClickListenerC32090h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomFormView f82027a;

        DialogInterface$OnClickListenerC32090h(MeetingRoomFormView bVar) {
            this.f82027a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f82027a.mo117062a().onClickConfirmExitWithoutSave();
        }
    }

    public MeetingRoomFormView(MeetingRoomFormFragment aVar, View view, C1144ai aiVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "fragment");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(aiVar, "viewModelProviders");
        this.f82015b = aVar;
        this.f82016c = view;
        this.f82017d = aiVar;
    }
}
