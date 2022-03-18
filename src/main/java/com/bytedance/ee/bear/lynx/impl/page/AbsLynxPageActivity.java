package com.bytedance.ee.bear.lynx.impl.page;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.lynx.api.CCMLynxCardView;
import com.bytedance.ee.bear.lynx.impl.route.RouterAbilityProvider;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.p3519d.C70039b;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0006\u0010\u0012\u001a\u00020\u000eJ\u0006\u0010\u0013\u001a\u00020\u000eJ\b\u0010\u0014\u001a\u00020\u000eH\u0014J\u0012\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH$J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001aH$J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH$J\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001aH$J\u0006\u0010\u001f\u001a\u00020\u000eJ\u0006\u0010 \u001a\u00020\u000eR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/page/AbsLynxPageActivity;", "Lcom/bytedance/ee/bear/facade/common/BaseActivity;", "Lcom/bytedance/ee/bear/lynx/impl/route/RouterAbilityProvider;", "()V", "ccmLynxCardView", "Lcom/bytedance/ee/bear/lynx/api/CCMLynxCardView;", "contentContainer", "Landroid/widget/FrameLayout;", "titleContainer", "uri", "Landroid/net/Uri;", "checkFieldInitIsValid", "", "close", "", "getBid", "", "getContainerId", "hideError", "hideLoading", "onDestroy", "onDoCreate", "savedInstanceState", "Landroid/os/Bundle;", "onHideError", "errorContainer", "Landroid/view/ViewGroup;", "onHideLoading", "loadingContainer", "onShowError", "onShowLoading", "showError", "showLoading", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public abstract class AbsLynxPageActivity extends BaseActivity implements RouterAbilityProvider {

    /* renamed from: a */
    private Uri f23800a;

    /* renamed from: b */
    private FrameLayout f23801b;

    /* renamed from: c */
    private FrameLayout f23802c;

    /* renamed from: d */
    private CCMLynxCardView f23803d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo33954a(ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo33956b(ViewGroup viewGroup);

    @Override // com.bytedance.ee.bear.lynx.impl.route.RouterAbilityProvider
    /* renamed from: c */
    public void mo33906c() {
        finish();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/koin/core/parameter/DefinitionParameters;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.page.AbsLynxPageActivity$a */
    static final class C8845a extends Lambda implements Function0<DefinitionParameters> {
        final /* synthetic */ AbsLynxPageActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8845a(AbsLynxPageActivity absLynxPageActivity) {
            super(0);
            this.this$0 = absLynxPageActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DefinitionParameters invoke() {
            return C70039b.m268661a(this.this$0);
        }
    }

    /* renamed from: d */
    private final boolean mo33960d() {
        if (this.f23800a == null || this.f23802c == null || this.f23803d == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo33953a() {
        FrameLayout frameLayout = this.f23802c;
        if (frameLayout != null) {
            mo33954a(frameLayout);
        }
    }

    /* renamed from: b */
    public final void mo33955b() {
        FrameLayout frameLayout = this.f23802c;
        if (frameLayout != null) {
            mo33956b(frameLayout);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.LifeCycleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        super.onDestroy();
        CCMLynxCardView cCMLynxCardView = this.f23803d;
        if (cCMLynxCardView != null) {
            cCMLynxCardView.mo33878b();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        Object obj;
        String str;
        Bundle extras;
        Uri data;
        super.mo16851a(bundle);
        Intent intent = getIntent();
        if (!(intent == null || (data = intent.getData()) == null)) {
            this.f23800a = data;
        }
        setContentView(R.layout.lynx_activity_page_layout);
        this.f23801b = (FrameLayout) findViewById(R.id.lynx_title_container);
        this.f23802c = (FrameLayout) findViewById(R.id.lynx_content_container);
        HashMap hashMap = null;
        this.f23803d = (CCMLynxCardView) KoinJavaComponent.m268613a(CCMLynxCardView.class, null, new C8845a(this), 2, null);
        if (!mo33960d()) {
            finish();
            return;
        }
        Intent intent2 = getIntent();
        if (intent2 == null || (extras = intent2.getExtras()) == null) {
            obj = null;
        } else {
            obj = extras.get("template-data-bundle-key");
        }
        if (obj instanceof HashMap) {
            hashMap = obj;
        }
        HashMap hashMap2 = hashMap;
        CCMLynxCardView cCMLynxCardView = this.f23803d;
        if (cCMLynxCardView != null) {
            FrameLayout frameLayout = this.f23802c;
            if (frameLayout == null) {
                Intrinsics.throwNpe();
            }
            FrameLayout frameLayout2 = frameLayout;
            Uri uri = this.f23800a;
            if (uri == null || (str = uri.toString()) == null) {
                str = "";
            }
            cCMLynxCardView.mo33876a(frameLayout2, str, hashMap2, new ViewGroup.LayoutParams(-1, -1));
        }
    }
}
