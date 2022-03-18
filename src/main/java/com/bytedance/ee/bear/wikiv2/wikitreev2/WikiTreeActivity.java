package com.bytedance.ee.bear.wikiv2.wikitreev2;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.wikiv2.report.WikiDevReportV2;
import com.bytedance.ee.bear.wikiv2.wikitreev2.create.WikiCreateToFragment;
import com.bytedance.ee.bear.wikiv2.wikitreev2.main.WikiTreeFragment;
import com.bytedance.ee.bear.wikiv2.wikitreev2.makecopy.WikiMakeCopyFragment;
import com.bytedance.ee.bear.wikiv2.wikitreev2.move.WikiMovToFragment;
import com.bytedance.ee.bear.wikiv2.wikitreev2.shortcut.WikiShortcutToFragment;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\rH\u0002J\"\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u0011\u001a\u00020\bH\u0014J\u0012\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0012\u0010\u0015\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0014J\u0017\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/WikiTreeActivity;", "Lcom/bytedance/ee/bear/facade/common/BaseActivity;", "()V", "contract", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/WikiTreeActivityContract;", "contractName", "", "fragmentActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "init", "intent", "onActivityResult", "onDestroy", "onDoCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "provideTypeFragment", "Landroidx/fragment/app/Fragment;", "mode", "(Ljava/lang/Integer;)Landroidx/fragment/app/Fragment;", "setupContent", "Companion", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
public class WikiTreeActivity extends BaseActivity {

    /* renamed from: a */
    public static final Companion f33251a = new Companion(null);

    /* renamed from: b */
    private final String f33252b;

    /* renamed from: c */
    private WikiTreeActivityContract f33253c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/WikiTreeActivity$Companion;", "", "()V", "TAG", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.WikiTreeActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.LifeCycleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        super.onDestroy();
    }

    public WikiTreeActivity() {
        String name = WikiTreeActivityContract.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "WikiTreeActivityContract::class.java.name");
        this.f33252b = name;
    }

    /* renamed from: a */
    private final void mo47233a() {
        WikiTreeActivityContract wikiTreeActivityContract = this.f33253c;
        if (wikiTreeActivityContract == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contract");
        }
        Fragment a = m51550a(Integer.valueOf(wikiTreeActivityContract.getPageMode()));
        Bundle bundle = new Bundle();
        String str = this.f33252b;
        WikiTreeActivityContract wikiTreeActivityContract2 = this.f33253c;
        if (wikiTreeActivityContract2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contract");
        }
        bundle.putParcelable(str, wikiTreeActivityContract2);
        a.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.wiki_tree_activity_container, a, a.getClass().getSimpleName()).commitAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            m51553a(intent);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        setContentView(R.layout.wiki_tree_activity_v2);
        if (bundle == null) {
            Intent intent = getIntent();
            Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
            m51553a(intent);
        }
    }

    /* renamed from: a */
    private final Fragment m51550a(Integer num) {
        if (num != null && num.intValue() == 1) {
            return new WikiCreateToFragment();
        }
        if (num != null && num.intValue() == 2) {
            return new WikiMovToFragment();
        }
        if (num != null && num.intValue() == 3) {
            return new WikiShortcutToFragment();
        }
        if (num != null && num.intValue() == 4) {
            return new WikiMakeCopyFragment();
        }
        return new WikiTreeFragment();
    }

    /* renamed from: a */
    private final void m51553a(Intent intent) {
        WikiTreeActivityContract wikiTreeActivityContract = (WikiTreeActivityContract) intent.getParcelableExtra(this.f33252b);
        if (wikiTreeActivityContract == null) {
            C13479a.m54775e("Wiki_WikiTreeActivity", "init. invalid contract! return. ");
            finish();
            return;
        }
        this.f33253c = wikiTreeActivityContract;
        StringBuilder sb = new StringBuilder();
        sb.append("init. mode: ");
        WikiTreeActivityContract wikiTreeActivityContract2 = this.f33253c;
        if (wikiTreeActivityContract2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contract");
        }
        sb.append(wikiTreeActivityContract2.getPageMode());
        C13479a.m54764b("Wiki_WikiTreeActivity", sb.toString());
        WikiDevReportV2.f32880a = Long.valueOf(System.currentTimeMillis());
        mo47233a();
    }

    /* renamed from: a */
    private final void m51552a(int i, int i2, Intent intent) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
        for (Fragment fragment : supportFragmentManager.getFragments()) {
            fragment.onActivityResult(i, i2, intent);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity, com.bytedance.ee.bear.facade.common.BaseCommonActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        StringBuilder sb = new StringBuilder();
        sb.append("onActivityResult. mode: ");
        WikiTreeActivityContract wikiTreeActivityContract = this.f33253c;
        if (wikiTreeActivityContract == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contract");
        }
        sb.append(wikiTreeActivityContract.getPageMode());
        sb.append(", requestCode: ");
        sb.append(i);
        sb.append(", resultCode: ");
        sb.append(i2);
        C13479a.m54764b("Wiki_WikiTreeActivity", sb.toString());
        m51552a(i, i2, intent);
    }
}
