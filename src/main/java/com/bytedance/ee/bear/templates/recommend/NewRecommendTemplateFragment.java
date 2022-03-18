package com.bytedance.ee.bear.templates.recommend;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\"\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J$\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u000eH\u0016J\u001a\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/bytedance/ee/bear/templates/recommend/NewRecommendTemplateFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "()V", "isFolder", "", "isFromEmpty", "module", "", "parentToken", "presenter", "Lcom/bytedance/ee/bear/templates/recommend/NewRecommendTemplatePresenter;", "showTitleBg", "subModule", "initMVP", "", "rootView", "Landroid/view/View;", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.recommend.b */
public final class NewRecommendTemplateFragment extends C7667e {

    /* renamed from: a */
    public static final Companion f31212a = new Companion(null);

    /* renamed from: b */
    private String f31213b = "";

    /* renamed from: c */
    private String f31214c = "";

    /* renamed from: d */
    private String f31215d = "";

    /* renamed from: e */
    private boolean f31216e;

    /* renamed from: f */
    private boolean f31217f;

    /* renamed from: g */
    private boolean f31218g = true;

    /* renamed from: h */
    private NewRecommendTemplatePresenter f31219h;

    /* renamed from: i */
    private HashMap f31220i;

    @JvmStatic
    /* renamed from: a */
    public static final Fragment m48170a(Context context, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        return f31212a.mo44554a(context, str, str2, str3, z, z2, z3);
    }

    /* renamed from: a */
    public void mo44553a() {
        HashMap hashMap = this.f31220i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JF\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/templates/recommend/NewRecommendTemplateFragment$Companion;", "", "()V", "EXTRA_MODULE", "", "EXTRA_PARENT_TOKEN", "EXTRA_SHOW_TITLE_BG", "EXTRA_SUB_MODULE", "TAG", "newInstance", "Landroidx/fragment/app/Fragment;", "context", "Landroid/content/Context;", "parentToken", "module", "subModule", "isFolder", "", "isFromEmpty", "showTitleBg", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Fragment mo44554a(Context context, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Bundle bundle = new Bundle();
            if (str == null) {
                str = "";
            }
            bundle.putString("extra_parent_token", str);
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString("extra_module", str2);
            if (str3 == null) {
                str3 = "";
            }
            bundle.putString("extra_sub_module", str3);
            bundle.putBoolean("key_is_folder", z);
            bundle.putBoolean("key_is_from_empty", z2);
            bundle.putBoolean("extra_show_title_bg", z3);
            Fragment instantiate = Fragment.instantiate(context, NewRecommendTemplateFragment.class.getName(), bundle);
            Intrinsics.checkExpressionValueIsNotNull(instantiate, "Fragment.instantiate(con…:class.java.name, bundle)");
            return instantiate;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        NewRecommendTemplatePresenter dVar = this.f31219h;
        if (dVar != null) {
            dVar.destroy();
        }
        mo44553a();
    }

    /* renamed from: a */
    private final void m48171a(View view) {
        NewRecommendTemplateFragment bVar = this;
        NewRecommendTemplateModel cVar = new NewRecommendTemplateModel(bVar);
        Context context = getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
        NewRecommendTemplatePresenter dVar = new NewRecommendTemplatePresenter(cVar, new NewRecommendTemplateView(context, this, view, this.f31218g), bVar, this.f31214c, this.f31215d, this.f31213b, this.f31216e, this.f31217f);
        this.f31219h = dVar;
        if (dVar != null) {
            dVar.create();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("extra_parent_token", "");
            Intrinsics.checkExpressionValueIsNotNull(string, "it.getString(EXTRA_PARENT_TOKEN, \"\")");
            this.f31213b = string;
            String string2 = arguments.getString("extra_module", "");
            Intrinsics.checkExpressionValueIsNotNull(string2, "it.getString(EXTRA_MODULE, \"\")");
            this.f31214c = string2;
            String string3 = arguments.getString("extra_sub_module", "");
            Intrinsics.checkExpressionValueIsNotNull(string3, "it.getString(EXTRA_SUB_MODULE, \"\")");
            this.f31215d = string3;
            this.f31218g = arguments.getBoolean("extra_show_title_bg", true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m48171a(view);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C13479a.m54764b("NewRecommendTemplateFragment", "onActivityResult()...");
        NewRecommendTemplatePresenter dVar = this.f31219h;
        if (dVar != null) {
            dVar.mo44561a(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.recommend_template_fragment, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…agment, container, false)");
        return inflate;
    }
}
