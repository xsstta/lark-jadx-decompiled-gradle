package com.ss.android.appcenter.business.tab.business.widget;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.aj;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.ref.card.C13518b;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.net.dto.BlockitInfo;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.tab.business.blockit.AbstractC27836c;
import com.ss.android.appcenter.business.tab.business.blockit.BlockitView;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a.C27907c;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a.C27909d;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27924d;
import com.ss.android.appcenter.business.tab.fragmentv3.component.header.CommonHeader;
import com.ss.android.appcenter.common.base.FunctionActivity;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.appcenter.common.view.CustomEditText;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27541f;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.StatusBarUtil;
import com.tt.miniapp.util.C67043j;

public class CardPreviewActivity extends FunctionActivity {

    /* renamed from: a */
    public BlockitView f69841a;

    /* renamed from: b */
    public String f69842b;

    /* renamed from: c */
    public String f69843c;

    /* renamed from: d */
    private String f69844d;

    /* renamed from: e */
    private EnumC27938a f69845e;

    /* renamed from: f */
    private BlockitInfo f69846f;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.appcenter.business.tab.business.widget.CardPreviewActivity$a */
    public enum EnumC27938a {
        WIDGET,
        BLOCK,
        BLOCK_DEMO
    }

    /* renamed from: a */
    public Context mo99590a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo98268a() {
        return super.getResources();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m101994a(this, context);
    }

    /* renamed from: b */
    public void mo99593b() {
        super.onStop();
    }

    /* renamed from: b */
    public void mo99594b(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public AssetManager mo99595c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m101988a(this, configuration);
    }

    public AssetManager getAssets() {
        return m101998c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m101989a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m101997b(this);
    }

    /* renamed from: a */
    public UDDialog mo99591a(final Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.workplace_preview_block_dialog_layout, (ViewGroup) null, false);
        final CustomEditText customEditText = (CustomEditText) inflate.findViewById(R.id.height_edit);
        customEditText.setHint(getString(R.string.OpenPlatform_Block_Px));
        if (!TextUtils.isEmpty(this.f69842b)) {
            customEditText.setText(this.f69842b);
        }
        DialogC25637f b = new C25639g(context).mo89236b(inflate).mo89246d(false).mo89248g(R.string.OpenPlatform_AppCenter_SettingsBttn).mo89252k(1).mo89243c(true).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_left).mo89268a(getString(R.string.OpenPlatform_AppCenter_Cancel)).mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.appcenter.business.tab.business.widget.CardPreviewActivity.DialogInterface$OnClickListenerC279373 */

            public void onClick(DialogInterface dialogInterface, int i) {
                CardPreviewActivity.m101990a(context, customEditText.getFocusView());
            }
        })).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_right).mo89268a(getString(R.string.AppDetail_Application_Mechanism_Confirm)).mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.appcenter.business.tab.business.widget.CardPreviewActivity.DialogInterface$OnClickListenerC279362 */

            public void onClick(DialogInterface dialogInterface, int i) {
                CardPreviewActivity.m101990a(context, customEditText.getFocusView());
                String editContent = customEditText.getEditContent();
                if (TextUtils.equals(editContent, "auto")) {
                    CardPreviewActivity.this.f69842b = editContent;
                    CardPreviewActivity.this.mo99592a(true, 0);
                    UserSP.getInstance().putString(CardPreviewActivity.this.f69843c, editContent);
                    return;
                }
                try {
                    int parseInt = Integer.parseInt(editContent);
                    if (parseInt <= 0) {
                        parseInt = C28209p.m103291a(150.0f);
                    }
                    CardPreviewActivity.this.f69842b = editContent;
                    CardPreviewActivity.this.mo99592a(false, parseInt);
                    UserSP.getInstance().putString(CardPreviewActivity.this.f69843c, editContent);
                } catch (NumberFormatException e) {
                    C28184h.m103247a("CardPreviewActivity", "invalid input:" + editContent, e);
                }
            }
        })).mo89233b();
        if (b.getWindow() != null) {
            b.getWindow().setDimAmount(0.3f);
        }
        b.show();
        showKeyboard(customEditText.getFocusView());
        return b;
    }

    /* renamed from: a */
    public void mo99592a(boolean z, int i) {
        this.f69841a.setAutoMode(z);
        if (!z) {
            this.f69841a.mo99216a(C28209p.m103291a((float) i));
        }
        this.f69841a.mo99261j();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m101996b(View view) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m101999c(View view) {
        mo99591a((Context) this);
    }

    /* renamed from: a */
    public static Resources m101989a(CardPreviewActivity cardPreviewActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(cardPreviewActivity);
        }
        return cardPreviewActivity.mo98268a();
    }

    /* renamed from: c */
    public static AssetManager m101998c(CardPreviewActivity cardPreviewActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(cardPreviewActivity);
        }
        return cardPreviewActivity.mo99595c();
    }

    public static void showKeyboard(View view) {
        if (view != null && view.getContext() != null) {
            view.postDelayed(new Runnable(view) {
                /* class com.ss.android.appcenter.business.tab.business.widget.$$Lambda$CardPreviewActivity$5yzuixmd4O6WFsYHtDg1x9rTMjw */
                public final /* synthetic */ View f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    CardPreviewActivity.m101993a(this.f$0);
                }
            }, 50);
        }
    }

    /* renamed from: b */
    public static void m101997b(CardPreviewActivity cardPreviewActivity) {
        cardPreviewActivity.mo99593b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CardPreviewActivity cardPreviewActivity2 = cardPreviewActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    cardPreviewActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.appcenter.common.base.BaseActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AppBrandLogger.m52828d("CardPreviewActivity", "onConfigurationChanged " + C67043j.m261272a(configuration));
    }

    /* renamed from: a */
    private void m101992a(Intent intent) {
        String stringExtra = intent.getStringExtra("url");
        this.f69844d = stringExtra;
        Uri parse = Uri.parse(stringExtra);
        if (parse.getQueryParameter("block_type_id") != null) {
            this.f69845e = EnumC27938a.BLOCK;
        } else if (parse.getHost().contains("block_demo")) {
            this.f69845e = EnumC27938a.BLOCK_DEMO;
        } else {
            this.f69845e = EnumC27938a.WIDGET;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.appcenter.common.base.BaseActivity, com.ss.android.appcenter.common.base.FunctionActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m101992a(getIntent());
        if (EnumC27938a.WIDGET == this.f69845e) {
            setContentView(R.layout.workplace_widget_preview_activity);
            m101995a((WidgetView) findViewById(R.id.widget));
        } else if (EnumC27938a.BLOCK == this.f69845e) {
            setContentView(R.layout.workplace_block_preview_activity);
            this.f69841a = (BlockitView) findViewById(R.id.blockit);
            StatusBarUtil.setTransparent(this);
            final ItemInfo itemInfo = new ItemInfo("123", "456");
            Uri parse = Uri.parse(this.f69844d);
            BlockitInfo blockitInfo = new BlockitInfo();
            this.f69846f = blockitInfo;
            blockitInfo.blockTypeId = parse.getQueryParameter("block_type_id");
            this.f69846f.blockId = "   ";
            this.f69846f.previewToken = parse.getQueryParameter("token");
            itemInfo.setAppId(parse.getQueryParameter("app_id"));
            this.f69841a.setBlockLogger(C27952c.m102076a().mo99660a("block_preview_log_key").mo99663a());
            itemInfo.setBlock(true);
            itemInfo.setBlock(this.f69846f);
            this.f69843c = "block_preview_cache_height" + C27548m.m100547m().mo98221e().mo98213b() + this.f69846f.blockTypeId;
            int a = C28209p.m103291a(150.0f);
            if (UserSP.getInstance().contains(this.f69843c)) {
                String string = UserSP.getInstance().getString(this.f69843c);
                if (TextUtils.equals(string, "auto")) {
                    this.f69841a.setAutoMode(true);
                    this.f69842b = string;
                } else {
                    try {
                        a = C28209p.m103291a((float) Integer.parseInt(string));
                        this.f69842b = string;
                    } catch (NumberFormatException e) {
                        C28184h.m103247a("CardPreviewActivity", "read cache error. height:" + string, e);
                    }
                }
            }
            this.f69841a.mo99220a(itemInfo, a, true, new CommonHeader.C28077b(), (CommonHeader) findViewById(R.id.blockit_template_header_outside), null);
            this.f69841a.mo99219a(getLifecycle());
            this.f69841a.setMenuListener(new AbstractC27836c() {
                /* class com.ss.android.appcenter.business.tab.business.widget.CardPreviewActivity.C279351 */

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m102007a() {
                }

                @Override // com.ss.android.appcenter.business.tab.business.blockit.AbstractC27836c
                public void open() {
                    C27907c.m101866a(CardPreviewActivity.this.f69841a, (FragmentActivity) CardPreviewActivity.this, itemInfo, false, false, 0, (C27909d.AbstractC27912a) $$Lambda$CardPreviewActivity$1$xD59WdY6N0qRDoTjUXkg0IZJcM.INSTANCE, (C27924d.AbstractC27927a) new C27924d.C27928b());
                }
            });
            AbstractC27541f i = C27548m.m100547m().mo98225i();
            if (i != null) {
                boolean a2 = i.mo98187a("openplatfrom.block.console_enable");
                AppBrandLogger.m52830i("CardPreviewActivity", "enable console " + a2);
                if (a2) {
                    new C27957f().mo99675b(this, "block_preview_log_key");
                }
            }
            findViewById(R.id.iv_setting).setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.appcenter.business.tab.business.widget.$$Lambda$CardPreviewActivity$ugSNurYl8Cm6Glnll4sGIYWTzwk */

                public final void onClick(View view) {
                    CardPreviewActivity.this.m101999c((CardPreviewActivity) view);
                }
            });
        } else {
            findViewById(16908290);
            getSupportFragmentManager().beginTransaction().add(16908290, CardDemoFragment.m102093a(this.f69844d)).commitNowAllowingStateLoss();
        }
        if (this.f69845e == EnumC27938a.BLOCK || this.f69845e == EnumC27938a.WIDGET) {
            findViewById(R.id.iv_close).setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.appcenter.business.tab.business.widget.$$Lambda$CardPreviewActivity$EoJJA7vKCEJ6jVLCwKaipkrP7rM */

                public final void onClick(View view) {
                    CardPreviewActivity.this.m101996b((CardPreviewActivity) view);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m101993a(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            view.requestFocus();
            inputMethodManager.showSoftInput(view, 0);
        }
    }

    /* renamed from: a */
    private void m101995a(WidgetView widgetView) {
        C27971l lVar = (C27971l) aj.m5366a(this).mo6005a(C27971l.class);
        lVar.init(false);
        widgetView.mo99622a("", "Widget Preview", "");
        widgetView.mo99621a(this.f69844d, this, this, lVar);
        widgetView.setBackground(C28209p.m103296a((Context) this, getResources().getDimensionPixelSize(R.dimen.workplace_block_shadow), (int) R.color.static_white, true));
        widgetView.setPadding(1, 1, 1, 1);
    }

    /* renamed from: a */
    public static void m101994a(CardPreviewActivity cardPreviewActivity, Context context) {
        cardPreviewActivity.mo99594b(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(cardPreviewActivity);
        }
    }

    /* renamed from: a */
    public static Context m101988a(CardPreviewActivity cardPreviewActivity, Configuration configuration) {
        Context a = cardPreviewActivity.mo99590a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m101990a(Context context, View view) {
        InputMethodManager inputMethodManager;
        if (context != null && view != null && (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: a */
    public static void m101991a(Context context, String str) {
        if (context != null) {
            C13518b.m54918a(context);
            Intent intent = new Intent(context, CardPreviewActivity.class);
            intent.putExtra("url", str);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            context.startActivity(intent);
        }
    }
}
