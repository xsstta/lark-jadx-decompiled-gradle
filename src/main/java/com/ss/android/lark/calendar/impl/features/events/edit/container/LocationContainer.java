package com.ss.android.lark.calendar.impl.features.events.edit.container;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.AppendItemLinearLayout;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IHideFeatureListener;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0014J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\nJ\u0006\u0010\u0014\u001a\u00020\u000eJ\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/container/LocationContainer;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/AppendItemLinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mDetailItemListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/IDetailItemListener;", "mHideFeatureListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/IHideFeatureListener;", "mIsEditable", "", "initListener", "", "initView", "setDetailItemListener", "detailItemListener", "setOnHideListener", "hideFeatureListener", "setUnEditable", "setVisibility", "visibility", "", "showLocationText", "locationName", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LocationContainer extends AppendItemLinearLayout {

    /* renamed from: a */
    public IDetailItemListener f80112a;

    /* renamed from: b */
    public IHideFeatureListener f80113b;

    /* renamed from: c */
    public boolean f80114c;

    /* renamed from: d */
    private HashMap f80115d;

    public LocationContainer(Context context) {
        this(context, null, 2, null);
    }

    /* renamed from: a */
    public View mo114772a(int i) {
        if (this.f80115d == null) {
            this.f80115d = new HashMap();
        }
        View view = (View) this.f80115d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f80115d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public final void mo114774b() {
        this.f80114c = false;
        LinearLayout linearLayout = (LinearLayout) mo114772a(R.id.ll_delete_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "ll_delete_container");
        linearLayout.setVisibility(8);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        ((TextView) mo114772a(R.id.tv_event_location)).setTextColor(context.getResources().getColor(R.color.lkui_N500));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.events.edit.AppendItemLinearLayout
    /* renamed from: a */
    public void mo114260a() {
        ((ImageView) mo114772a(R.id.iv_location_icon)).setOnClickListener(new View$OnClickListenerC31596a(this));
        ((TextView) mo114772a(R.id.tv_event_location)).setOnClickListener(new View$OnClickListenerC31597b(this));
        ((LinearLayout) mo114772a(R.id.ll_delete_container)).setOnClickListener(new View$OnClickListenerC31598c(this));
    }

    public final void setDetailItemListener(IDetailItemListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "detailItemListener");
        this.f80112a = bVar;
    }

    public final void setOnHideListener(IHideFeatureListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "hideFeatureListener");
        this.f80113b = cVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.LocationContainer$a */
    static final class View$OnClickListenerC31596a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LocationContainer f80116a;

        View$OnClickListenerC31596a(LocationContainer locationContainer) {
            this.f80116a = locationContainer;
        }

        public final void onClick(View view) {
            if (this.f80116a.f80114c) {
                LocationContainer.m119125a(this.f80116a).mo114365b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.LocationContainer$b */
    static final class View$OnClickListenerC31597b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LocationContainer f80117a;

        View$OnClickListenerC31597b(LocationContainer locationContainer) {
            this.f80117a = locationContainer;
        }

        public final void onClick(View view) {
            if (this.f80117a.f80114c) {
                LocationContainer.m119125a(this.f80117a).mo114365b();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IDetailItemListener m119125a(LocationContainer locationContainer) {
        IDetailItemListener bVar = locationContainer.f80112a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetailItemListener");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ IHideFeatureListener m119126b(LocationContainer locationContainer) {
        IHideFeatureListener cVar = locationContainer.f80113b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHideFeatureListener");
        }
        return cVar;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        IHideFeatureListener cVar = this.f80113b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHideFeatureListener");
        }
        cVar.mo114309a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.LocationContainer$c */
    static final class View$OnClickListenerC31598c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LocationContainer f80118a;

        View$OnClickListenerC31598c(LocationContainer locationContainer) {
            this.f80118a = locationContainer;
        }

        public final void onClick(View view) {
            this.f80118a.setVisibility(8);
            LocationContainer.m119126b(this.f80118a).mo114310a(12);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.events.edit.AppendItemLinearLayout
    /* renamed from: a */
    public void mo114261a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        super.mo114261a(context);
        LayoutInflater.from(context).inflate(R.layout.view_event_location_container, this);
    }

    /* renamed from: a */
    public final void mo114773a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "locationName");
        TextView textView = (TextView) mo114772a(R.id.tv_event_location);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tv_event_location");
        textView.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocationContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f80114c = true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocationContainer(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
