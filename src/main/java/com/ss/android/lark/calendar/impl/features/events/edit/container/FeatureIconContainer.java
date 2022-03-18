package com.ss.android.lark.calendar.impl.features.events.edit.container;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FeatureIconContainer extends LinearLayout implements View.OnClickListener {

    /* renamed from: a */
    public IDetailItemListener f80109a;

    /* renamed from: b */
    private HashMap f80110b;

    public FeatureIconContainer(Context context) {
        this(context, null, 2, null);
    }

    /* renamed from: d */
    public View mo114768d(int i) {
        if (this.f80110b == null) {
            this.f80110b = new HashMap();
        }
        View view = (View) this.f80110b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f80110b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0080  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m119117a() {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.edit.container.FeatureIconContainer.m119117a():void");
    }

    public final void setDetailItemListener(IDetailItemListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "detailItemListener");
        this.f80109a = bVar;
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.FeatureIconContainer$a */
    public static final class View$OnClickListenerC31595a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeatureIconContainer f80111a;

        View$OnClickListenerC31595a(FeatureIconContainer featureIconContainer) {
            this.f80111a = featureIconContainer;
        }

        public final void onClick(View view) {
            FeatureIconContainer.m119116a(this.f80111a).mo114368c();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IDetailItemListener m119116a(FeatureIconContainer featureIconContainer) {
        IDetailItemListener bVar = featureIconContainer.f80109a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetailItemListener");
        }
        return bVar;
    }

    /* renamed from: c */
    public final void mo114767c(int i) {
        if (i == 0 || i == 1) {
            TextView textView = (TextView) mo114768d(R.id.tv_event_delete);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tv_event_delete");
            textView.setText(C32634ae.m125182b(R.string.Calendar_Common_Discard));
        } else if (i == 2) {
            TextView textView2 = (TextView) mo114768d(R.id.tv_event_delete);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tv_event_delete");
            textView2.setText(C32634ae.m125182b(R.string.Calendar_DetailsPage_DeleteEvent_Button));
        }
    }

    /* renamed from: a */
    private final void m119118a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.view_event_feature_container, this);
        FeatureIconContainer featureIconContainer = this;
        ((LinearLayout) mo114768d(R.id.ll_location)).setOnClickListener(featureIconContainer);
        ((LinearLayout) mo114768d(R.id.ll_reminder)).setOnClickListener(featureIconContainer);
        ((LinearLayout) mo114768d(R.id.ll_meeting_room)).setOnClickListener(featureIconContainer);
        ((LinearLayout) mo114768d(R.id.ll_repeat)).setOnClickListener(featureIconContainer);
        ((LinearLayout) mo114768d(R.id.ll_description)).setOnClickListener(featureIconContainer);
        ((LinearLayout) mo114768d(R.id.ll_delete)).setOnClickListener(new View$OnClickListenerC31595a(this));
    }

    public void onClick(View view) {
        Intrinsics.checkParameterIsNotNull(view, "v");
        int id = view.getId();
        if (id == R.id.ll_reminder) {
            IDetailItemListener bVar = this.f80109a;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDetailItemListener");
            }
            bVar.mo114360a(13);
        } else if (id == R.id.ll_location) {
            IDetailItemListener bVar2 = this.f80109a;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDetailItemListener");
            }
            bVar2.mo114365b();
        } else if (id == R.id.ll_meeting_room) {
            IDetailItemListener bVar3 = this.f80109a;
            if (bVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDetailItemListener");
            }
            bVar3.mo114360a(10);
        } else if (id == R.id.ll_repeat) {
            IDetailItemListener bVar4 = this.f80109a;
            if (bVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDetailItemListener");
            }
            bVar4.mo114360a(14);
        } else if (id == R.id.ll_description) {
            IDetailItemListener bVar5 = this.f80109a;
            if (bVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDetailItemListener");
            }
            bVar5.mo114360a(17);
        }
    }

    /* renamed from: b */
    public final void mo114766b(int i) {
        switch (i) {
            case 10:
                LinearLayout linearLayout = (LinearLayout) mo114768d(R.id.ll_meeting_room);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "ll_meeting_room");
                linearLayout.setVisibility(0);
                break;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                LinearLayout linearLayout2 = (LinearLayout) mo114768d(R.id.ll_location);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "ll_location");
                linearLayout2.setVisibility(0);
                break;
            case 13:
                LinearLayout linearLayout3 = (LinearLayout) mo114768d(R.id.ll_reminder);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "ll_reminder");
                linearLayout3.setVisibility(0);
                break;
            case 14:
                LinearLayout linearLayout4 = (LinearLayout) mo114768d(R.id.ll_repeat);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "ll_repeat");
                linearLayout4.setVisibility(0);
                break;
            case 17:
                LinearLayout linearLayout5 = (LinearLayout) mo114768d(R.id.ll_description);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "ll_description");
                linearLayout5.setVisibility(0);
                break;
            case 18:
                LinearLayout linearLayout6 = (LinearLayout) mo114768d(R.id.ll_delete);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout6, "ll_delete");
                linearLayout6.setVisibility(0);
                break;
        }
        m119117a();
    }

    /* renamed from: a */
    public final void mo114764a(int i) {
        if (i == 10) {
            LinearLayout linearLayout = (LinearLayout) mo114768d(R.id.ll_meeting_room);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "ll_meeting_room");
            linearLayout.setVisibility(8);
        } else if (i != 17) {
            switch (i) {
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    LinearLayout linearLayout2 = (LinearLayout) mo114768d(R.id.ll_location);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "ll_location");
                    linearLayout2.setVisibility(8);
                    break;
                case 13:
                    LinearLayout linearLayout3 = (LinearLayout) mo114768d(R.id.ll_reminder);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "ll_reminder");
                    linearLayout3.setVisibility(8);
                    break;
                case 14:
                    LinearLayout linearLayout4 = (LinearLayout) mo114768d(R.id.ll_repeat);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "ll_repeat");
                    linearLayout4.setVisibility(8);
                    break;
            }
        } else {
            LinearLayout linearLayout5 = (LinearLayout) mo114768d(R.id.ll_description);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "ll_description");
            linearLayout5.setVisibility(8);
        }
        m119117a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeatureIconContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m119118a(context);
    }

    /* renamed from: a */
    public final void mo114765a(int i, boolean z, View.OnClickListener onClickListener) {
        switch (i) {
            case 10:
                LinearLayout linearLayout = (LinearLayout) mo114768d(R.id.ll_meeting_room);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "ll_meeting_room");
                linearLayout.setClickable(z);
                return;
            case 11:
            case 15:
            case 16:
            default:
                return;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                LinearLayout linearLayout2 = (LinearLayout) mo114768d(R.id.ll_location);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "ll_location");
                linearLayout2.setClickable(z);
                return;
            case 13:
                LinearLayout linearLayout3 = (LinearLayout) mo114768d(R.id.ll_reminder);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "ll_reminder");
                linearLayout3.setClickable(z);
                return;
            case 14:
                if (!z) {
                    ((TextView) mo114768d(R.id.iv_event_repeat_text)).setTextColor(C32634ae.m125178a(R.color.text_disable));
                    Context context = getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "context");
                    Context context2 = getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                    ((ImageView) mo114768d(R.id.iv_event_repeat_icon)).setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_repeat_outlined, UDColorUtils.getColor(context2, R.color.text_disable)));
                    ((LinearLayout) mo114768d(R.id.ll_repeat)).setOnClickListener(onClickListener);
                    return;
                }
                ((TextView) mo114768d(R.id.iv_event_repeat_text)).setTextColor(C32634ae.m125178a(R.color.text_caption));
                Context context3 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context3, "context");
                Context context4 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context4, "context");
                ((ImageView) mo114768d(R.id.iv_event_repeat_icon)).setImageDrawable(UDIconUtils.getIconDrawable(context3, (int) R.drawable.ud_icon_repeat_outlined, UDColorUtils.getColor(context4, R.color.icon_n2)));
                ((LinearLayout) mo114768d(R.id.ll_repeat)).setOnClickListener(this);
                return;
            case 17:
                LinearLayout linearLayout4 = (LinearLayout) mo114768d(R.id.ll_description);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "ll_description");
                linearLayout4.setClickable(z);
                return;
            case 18:
                LinearLayout linearLayout5 = (LinearLayout) mo114768d(R.id.ll_delete);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "ll_delete");
                linearLayout5.setClickable(z);
                return;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeatureIconContainer(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: a */
    public static /* synthetic */ void m119119a(FeatureIconContainer featureIconContainer, int i, boolean z, View.OnClickListener onClickListener, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            onClickListener = null;
        }
        featureIconContainer.mo114765a(i, z, onClickListener);
    }
}
