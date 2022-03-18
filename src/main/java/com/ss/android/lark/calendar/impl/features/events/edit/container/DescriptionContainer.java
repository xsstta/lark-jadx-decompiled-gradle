package com.ss.android.lark.calendar.impl.features.events.edit.container;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.ee.bear.middleground.calendar.bean.WebEditorStyle;
import com.bytedance.ee.bear.middleground.calendar.editor.AbstractC8921a;
import com.bytedance.ee.bear.middleground.calendar.pool.WebEditorWrapper;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.common.widget.p1500b.C31164a;
import com.ss.android.lark.calendar.impl.features.events.edit.IEditContract;
import com.ss.android.lark.calendar.impl.features.events.edit.data.DescriptionShowData;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IHideFeatureListener;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.InterceptLinearLayout;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0006\u0010\u0017\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\fJ\u000e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0014J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"H\u0016R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/container/DescriptionContainer;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "TAG", "", "mDescWebEditor", "Lcom/bytedance/ee/bear/middleground/calendar/pool/WebEditorWrapper;", "mDetailItemListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/IDetailItemListener;", "mDocsInterceptor", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/InterceptLinearLayout;", "mHideFeatureListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/IHideFeatureListener;", "mIsEditable", "", "initDocWebView", "", "initListener", "initView", "onDestroy", "setDescription", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/DescriptionShowData;", "setDetailItemListener", "detailItemListener", "setOnHideListener", "hideFeatureListener", "setUnEditable", "setVisibility", "visibility", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DescriptionContainer extends RelativeLayout {

    /* renamed from: a */
    public final String f80098a;

    /* renamed from: b */
    public boolean f80099b;

    /* renamed from: c */
    public IHideFeatureListener f80100c;

    /* renamed from: d */
    public IDetailItemListener f80101d;

    /* renamed from: e */
    private InterceptLinearLayout f80102e;

    /* renamed from: f */
    private WebEditorWrapper f80103f;

    /* renamed from: g */
    private HashMap f80104g;

    public DescriptionContainer(Context context) {
        this(context, null, 2, null);
    }

    /* renamed from: a */
    public View mo114755a(int i) {
        if (this.f80104g == null) {
            this.f80104g = new HashMap();
        }
        View view = (View) this.f80104g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f80104g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onRenderProcessGone"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.DescriptionContainer$c */
    public static final class C31594c implements AbstractC8921a {

        /* renamed from: a */
        final /* synthetic */ DescriptionContainer f80107a;

        /* renamed from: b */
        final /* synthetic */ Context f80108b;

        C31594c(DescriptionContainer descriptionContainer, Context context) {
            this.f80107a = descriptionContainer;
            this.f80108b = context;
        }

        @Override // com.bytedance.ee.bear.middleground.calendar.editor.AbstractC8921a
        /* renamed from: a */
        public final void mo34221a() {
            Log.m165389i(this.f80107a.f80098a, C32673y.m125378d("Webview render process gone!"));
            Context context = this.f80108b;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: a */
    public final void mo114756a() {
        WebEditorWrapper webEditorWrapper = this.f80103f;
        if (webEditorWrapper != null) {
            webEditorWrapper.setRenderProcessListener(null);
        }
        WebEditorWrapper webEditorWrapper2 = this.f80103f;
        if (webEditorWrapper2 != null) {
            webEditorWrapper2.destroy();
        }
    }

    /* renamed from: c */
    private final void m119110c() {
        InterceptLinearLayout interceptLinearLayout = this.f80102e;
        if (interceptLinearLayout != null) {
            interceptLinearLayout.setClickInterceptListener(new View$OnClickListenerC31592a(this));
        }
        ((LinearLayout) mo114755a(R.id.ll_delete_container)).setOnClickListener(new View$OnClickListenerC31593b(this));
    }

    /* renamed from: b */
    public final void mo114757b() {
        this.f80099b = false;
        LinearLayout linearLayout = (LinearLayout) mo114755a(R.id.ll_delete_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "ll_delete_container");
        linearLayout.setVisibility(8);
        WebEditorStyle.C8917a aVar = new WebEditorStyle.C8917a();
        aVar.mo34206b(C32634ae.m125178a(R.color.text_placeholder));
        aVar.mo34207c(C32634ae.m125178a(R.color.bg_body));
        WebEditorWrapper webEditorWrapper = this.f80103f;
        if (webEditorWrapper != null) {
            webEditorWrapper.setCustomStyle(aVar.mo34205a());
        }
    }

    /* renamed from: d */
    private final void m119111d() {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        InterceptLinearLayout interceptLinearLayout = this.f80102e;
        if (interceptLinearLayout != null) {
            interceptLinearLayout.addView(this.f80103f, layoutParams);
        }
        LinearLayout linearLayout = (LinearLayout) mo114755a(R.id.ll_docs_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "ll_docs_container");
        boolean z = false;
        linearLayout.setVisibility(0);
        WebEditorStyle.C8917a aVar = new WebEditorStyle.C8917a();
        aVar.mo34206b(C32634ae.m125178a(R.color.text_title));
        aVar.mo34207c(C32634ae.m125178a(R.color.bg_body));
        WebEditorWrapper webEditorWrapper = this.f80103f;
        if (webEditorWrapper != null) {
            webEditorWrapper.setCustomStyle(aVar.mo34205a());
        }
        WebEditorWrapper webEditorWrapper2 = this.f80103f;
        if (webEditorWrapper2 != null) {
            webEditorWrapper2.setEditable(false);
        }
        ((LinearLayout) mo114755a(R.id.ll_docs_container)).addView(this.f80102e, layoutParams);
        String str = this.f80098a;
        StringBuilder sb = new StringBuilder();
        sb.append("initDocWebViewFG; mDescWebEditor is null: ");
        if (this.f80103f == null) {
            z = true;
        }
        sb.append(z);
        Log.m165389i(str, C32673y.m125377c(sb.toString()));
    }

    public final void setDetailItemListener(IDetailItemListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "detailItemListener");
        this.f80101d = bVar;
    }

    public final void setOnHideListener(IHideFeatureListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "hideFeatureListener");
        this.f80100c = cVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ IDetailItemListener m119107a(DescriptionContainer descriptionContainer) {
        IDetailItemListener bVar = descriptionContainer.f80101d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetailItemListener");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ IHideFeatureListener m119109b(DescriptionContainer descriptionContainer) {
        IHideFeatureListener cVar = descriptionContainer.f80100c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHideFeatureListener");
        }
        return cVar;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        IHideFeatureListener cVar = this.f80100c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHideFeatureListener");
        }
        cVar.mo114309a();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.DescriptionContainer$a */
    public static final class View$OnClickListenerC31592a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DescriptionContainer f80105a;

        View$OnClickListenerC31592a(DescriptionContainer descriptionContainer) {
            this.f80105a = descriptionContainer;
        }

        public final void onClick(View view) {
            if (this.f80105a.f80099b) {
                DescriptionContainer.m119107a(this.f80105a).mo114360a(17);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.DescriptionContainer$b */
    public static final class View$OnClickListenerC31593b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DescriptionContainer f80106a;

        View$OnClickListenerC31593b(DescriptionContainer descriptionContainer) {
            this.f80106a = descriptionContainer;
        }

        public final void onClick(View view) {
            this.f80106a.setVisibility(8);
            DescriptionContainer.m119109b(this.f80106a).mo114310a(17);
        }
    }

    /* renamed from: a */
    private final void m119108a(Context context) {
        LayoutInflater.from(getContext()).inflate(R.layout.view_event_description_container, this);
        this.f80102e = new InterceptLinearLayout(context);
        WebEditorWrapper b = C31164a.m116337a().mo112896b(getContext());
        this.f80103f = b;
        if (b != null) {
            b.setRenderProcessListener(new C31594c(this, context));
        }
    }

    public final void setDescription(DescriptionShowData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        boolean z = true;
        if (bVar.mo115073a() == IEditContract.DescriptionShowType.SHOW_DATA) {
            WebEditorWrapper webEditorWrapper = this.f80103f;
            if (webEditorWrapper != null) {
                webEditorWrapper.setData(bVar.mo115074b());
            }
            String str = this.f80098a;
            StringBuilder sb = new StringBuilder();
            sb.append("setData; mDescWebEditor is null: ");
            if (this.f80103f != null) {
                z = false;
            }
            sb.append(z);
            Log.m165389i(str, C32673y.m125377c(sb.toString()));
        } else if (bVar.mo115073a() == IEditContract.DescriptionShowType.SHOW_CONTENT) {
            WebEditorWrapper webEditorWrapper2 = this.f80103f;
            if (webEditorWrapper2 != null) {
                webEditorWrapper2.setContent(bVar.mo115074b());
            }
            String str2 = this.f80098a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("setContent; mDescWebEditor is null: ");
            if (this.f80103f != null) {
                z = false;
            }
            sb2.append(z);
            Log.m165389i(str2, C32673y.m125377c(sb2.toString()));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DescriptionContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f80098a = "DescriptionContainer";
        this.f80099b = true;
        m119108a(context);
        m119111d();
        m119110c();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DescriptionContainer(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
