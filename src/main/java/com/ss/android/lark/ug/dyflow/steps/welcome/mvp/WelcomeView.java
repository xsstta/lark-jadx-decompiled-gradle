package com.ss.android.lark.ug.dyflow.steps.welcome.mvp;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.ug.common.PreventDoubleClickListener;
import com.ss.android.lark.ug.dyflow.steps.welcome.mvp.IWelcomeContract;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\tH\u0002J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/welcome/mvp/WelcomeView;", "Landroid/widget/FrameLayout;", "Lcom/ss/android/lark/ug/dyflow/steps/welcome/mvp/IWelcomeContract$IWelcomeView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "viewDelegate", "Lcom/ss/android/lark/ug/dyflow/steps/welcome/mvp/IWelcomeContract$IWelcomeView$IDelegate;", "create", "", "destroy", "findViews", "init", "initListener", "setViewDelegate", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.steps.welcome.a.d */
public final class WelcomeView extends FrameLayout implements IWelcomeContract.IWelcomeView {

    /* renamed from: a */
    public IWelcomeContract.IWelcomeView.IDelegate f141648a;

    /* renamed from: b */
    private HashMap f141649b;

    /* renamed from: a */
    public View mo195120a(int i) {
        if (this.f141649b == null) {
            this.f141649b = new HashMap();
        }
        View view = (View) this.f141649b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f141649b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m223126a();
    }

    /* renamed from: a */
    private final void m223126a() {
        View.inflate(getContext(), R.layout.flow_welcome, this);
        m223127b();
        m223128c();
    }

    /* renamed from: c */
    private final void m223128c() {
        TextView textView = (TextView) mo195120a(R.id.welcome_explore);
        if (textView != null) {
            textView.setOnClickListener(new C57478a(this));
        }
        TextView textView2 = (TextView) mo195120a(R.id.welcome_addition);
        if (textView2 != null) {
            textView2.setOnClickListener(new C57479b(this));
        }
    }

    /* renamed from: b */
    private final void m223127b() {
        String h;
        TextView textView;
        String e;
        TextView textView2;
        String d;
        TextView textView3;
        ImageView imageView;
        String str;
        TextView textView4 = (TextView) mo195120a(R.id.welcome_title);
        String str2 = null;
        if (textView4 != null) {
            IWelcomeContract.IWelcomeView.IDelegate aVar = this.f141648a;
            if (aVar != null) {
                str = aVar.mo195113c();
            } else {
                str = null;
            }
            textView4.setText(str);
        }
        IWelcomeContract.IWelcomeView.IDelegate aVar2 = this.f141648a;
        if (!(aVar2 == null || aVar2.mo195116f() == null || (imageView = (ImageView) mo195120a(R.id.welcome_emoji)) == null)) {
            imageView.setVisibility(0);
        }
        IWelcomeContract.IWelcomeView.IDelegate aVar3 = this.f141648a;
        if (!(aVar3 == null || (d = aVar3.mo195114d()) == null || (textView3 = (TextView) mo195120a(R.id.welcome_subtitle)) == null)) {
            textView3.setVisibility(0);
            textView3.setText(d);
        }
        IWelcomeContract.IWelcomeView.IDelegate aVar4 = this.f141648a;
        if (!(aVar4 == null || (e = aVar4.mo195115e()) == null || (textView2 = (TextView) mo195120a(R.id.welcome_detail)) == null)) {
            textView2.setVisibility(0);
            textView2.setText(e);
        }
        TextView textView5 = (TextView) mo195120a(R.id.welcome_explore);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "welcome_explore");
        IWelcomeContract.IWelcomeView.IDelegate aVar5 = this.f141648a;
        if (aVar5 != null) {
            str2 = aVar5.mo195117g();
        }
        textView5.setText(str2);
        IWelcomeContract.IWelcomeView.IDelegate aVar6 = this.f141648a;
        if (aVar6 != null && (h = aVar6.mo195118h()) != null && (textView = (TextView) mo195120a(R.id.welcome_addition)) != null) {
            textView.setVisibility(0);
            textView.setText(h);
        }
    }

    public void setViewDelegate(IWelcomeContract.IWelcomeView.IDelegate aVar) {
        this.f141648a = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/ug/dyflow/steps/welcome/mvp/WelcomeView$initListener$1", "Lcom/ss/android/lark/ug/common/PreventDoubleClickListener;", "performClick", "", "v", "Landroid/view/View;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.welcome.a.d$a */
    public static final class C57478a extends PreventDoubleClickListener {

        /* renamed from: b */
        final /* synthetic */ WelcomeView f141650b;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57478a(WelcomeView dVar) {
            this.f141650b = dVar;
        }

        @Override // com.ss.android.lark.ug.common.PreventDoubleClickListener
        /* renamed from: a */
        public void mo194687a(View view) {
            IWelcomeContract.IWelcomeView.IDelegate aVar = this.f141650b.f141648a;
            if (aVar != null) {
                aVar.mo195111a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/ug/dyflow/steps/welcome/mvp/WelcomeView$initListener$2", "Lcom/ss/android/lark/ug/common/PreventDoubleClickListener;", "performClick", "", "v", "Landroid/view/View;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.welcome.a.d$b */
    public static final class C57479b extends PreventDoubleClickListener {

        /* renamed from: b */
        final /* synthetic */ WelcomeView f141651b;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57479b(WelcomeView dVar) {
            this.f141651b = dVar;
        }

        @Override // com.ss.android.lark.ug.common.PreventDoubleClickListener
        /* renamed from: a */
        public void mo194687a(View view) {
            IWelcomeContract.IWelcomeView.IDelegate aVar = this.f141651b.f141648a;
            if (aVar != null) {
                aVar.mo195112b();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WelcomeView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
