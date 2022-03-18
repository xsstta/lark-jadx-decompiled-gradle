package com.ss.android.lark.ug.dyflow.steps.inviteguide.mvp;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.ug.dyflow.steps.inviteguide.mvp.IInviteGuideContract;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\tH\u0002J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/InviteGuideView;", "Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/IInviteGuideContract$IInviteGuideView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "viewDelegate", "Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/IInviteGuideContract$IInviteGuideView$IDelegate;", "create", "", "destroy", "init", "initListeners", "initViews", "setViewDelegate", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.steps.inviteguide.a.d */
public final class InviteGuideView extends FrameLayout implements IInviteGuideContract.IInviteGuideView {

    /* renamed from: a */
    public IInviteGuideContract.IInviteGuideView.IDelegate f141560a;

    /* renamed from: b */
    private HashMap f141561b;

    /* renamed from: a */
    public View mo195028a(int i) {
        if (this.f141561b == null) {
            this.f141561b = new HashMap();
        }
        View view = (View) this.f141561b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f141561b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m222963a();
    }

    /* renamed from: a */
    private final void m222963a() {
        View.inflate(getContext(), R.layout.flow_guide_invite, this);
        m222964b();
        m222965c();
    }

    /* renamed from: b */
    private final void m222964b() {
        CommonTitleBar commonTitleBar = (CommonTitleBar) mo195028a(R.id.flow_invite_guide_title);
        if (commonTitleBar != null) {
            commonTitleBar.setLeftClickListener(new View$OnClickListenerC57455a(this));
        }
        ((UDCheckBox) mo195028a(R.id.flow_invite_guide_email_check)).setOnCheckedChangeListener(new C57456b(this));
        TextView textView = (TextView) mo195028a(R.id.flow_invite_guide_add);
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC57457c(this));
        }
        TextView textView2 = (TextView) mo195028a(R.id.flow_invite_guide_skip);
        if (textView2 != null) {
            textView2.setOnClickListener(new View$OnClickListenerC57458d(this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0077, code lost:
        if (r0 != null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c3, code lost:
        if (r0 != null) goto L_0x00d4;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m222965c() {
        /*
        // Method dump skipped, instructions count: 358
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.ug.dyflow.steps.inviteguide.mvp.InviteGuideView.m222965c():void");
    }

    public void setViewDelegate(IInviteGuideContract.IInviteGuideView.IDelegate aVar) {
        this.f141560a = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/InviteGuideView$initListeners$2", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$OnCheckedChangeListener;", "onCheckedChanged", "", "buttonView", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "isChecked", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.inviteguide.a.d$b */
    public static final class C57456b implements UDCheckBox.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ InviteGuideView f141563a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57456b(InviteGuideView dVar) {
            this.f141563a = dVar;
        }

        @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.OnCheckedChangeListener
        public void onCheckedChanged(UDCheckBox uDCheckBox, boolean z) {
            Intrinsics.checkParameterIsNotNull(uDCheckBox, "buttonView");
            IInviteGuideContract.IInviteGuideView.IDelegate aVar = this.f141563a.f141560a;
            if (aVar != null) {
                aVar.mo195014a(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.inviteguide.a.d$a */
    public static final class View$OnClickListenerC57455a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteGuideView f141562a;

        View$OnClickListenerC57455a(InviteGuideView dVar) {
            this.f141562a = dVar;
        }

        public final void onClick(View view) {
            IInviteGuideContract.IInviteGuideView.IDelegate aVar = this.f141562a.f141560a;
            if (aVar != null) {
                aVar.mo195018d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.inviteguide.a.d$c */
    public static final class View$OnClickListenerC57457c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteGuideView f141564a;

        View$OnClickListenerC57457c(InviteGuideView dVar) {
            this.f141564a = dVar;
        }

        public final void onClick(View view) {
            IInviteGuideContract.IInviteGuideView.IDelegate aVar = this.f141564a.f141560a;
            if (aVar != null) {
                aVar.mo195016b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.inviteguide.a.d$d */
    public static final class View$OnClickListenerC57458d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteGuideView f141565a;

        View$OnClickListenerC57458d(InviteGuideView dVar) {
            this.f141565a = dVar;
        }

        public final void onClick(View view) {
            IInviteGuideContract.IInviteGuideView.IDelegate aVar = this.f141565a.f141560a;
            if (aVar != null) {
                aVar.mo195017c();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteGuideView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
