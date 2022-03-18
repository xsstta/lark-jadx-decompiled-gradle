package com.ss.android.openbusiness.bot.addsearch;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.AbstractC1178x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.p078b.p079a.C2048a;
import com.p078b.p079a.C2052c;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.openbusiness.AbstractC59446a;
import com.ss.android.openbusiness.C59480b;
import com.ss.android.openbusiness.activity.BaseActivity;
import com.ss.android.openbusiness.bot.BotViewItem;
import com.ss.android.openbusiness.bot.GroupBotConfig;
import com.ss.android.openbusiness.bot.net.data.Bot;
import com.ss.android.openbusiness.bot.net.data.C59538b;
import com.ss.android.openbusiness.p3006c.C59539a;
import com.ss.android.openbusiness.ui.StatusController;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 02\u00020\u0001:\u00010B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0004H\u0002J6\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001c2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001c2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\u0019H\u0002J\b\u0010$\u001a\u00020\u0019H\u0002J\b\u0010%\u001a\u00020\u0019H\u0002J\b\u0010&\u001a\u00020\u0019H\u0002J\u0012\u0010'\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\b\u0010*\u001a\u00020\u0019H\u0014J\b\u0010+\u001a\u00020\u0019H\u0002J\b\u0010,\u001a\u00020\u0019H\u0002J\b\u0010-\u001a\u00020\u0019H\u0002J\b\u0010.\u001a\u00020\u0019H\u0002J\b\u0010/\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ss/android/openbusiness/bot/addsearch/GroupBotAddSearchActivity;", "Lcom/ss/android/openbusiness/activity/BaseActivity;", "()V", "STATUS_SEARCH_FOCUS", "", "STATUS_SEARCH_NOTFOCUS", "STATUS_SEARCH_SEARCHING", "mAdapter", "Lcom/ss/android/openbusiness/bot/addsearch/GroupBotAddSearchAdapter;", "mChatId", "", "mCurrentData", "Lcom/ss/android/openbusiness/bot/net/data/Data;", "mCurrentQuery", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "mSearchText", "Landroid/widget/EditText;", "mSkeletonScreen", "Lcom/ethanhua/skeleton/RecyclerViewSkeletonScreen;", "mStatusController", "Lcom/ss/android/openbusiness/ui/StatusController;", "mViewModel", "Lcom/ss/android/openbusiness/bot/addsearch/AddSearchViewModel;", "changeSearchState", "", UpdateKey.STATUS, "convertData", "", "Lcom/ss/android/openbusiness/bot/BotViewItem;", "bots", "Lcom/ss/android/openbusiness/bot/net/data/Bot;", "recommend", "isSearch", "", "initData", "initStatus", "initView", "initViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "showContent", "showContentEmpty", "showError", "showGuide", "showLoading", "Companion", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class GroupBotAddSearchActivity extends BaseActivity {

    /* renamed from: l */
    public static final Companion f147722l = new Companion(null);

    /* renamed from: b */
    public GroupBotAddSearchAdapter f147723b;

    /* renamed from: c */
    public RecyclerView f147724c;

    /* renamed from: d */
    public AddSearchViewModel f147725d;

    /* renamed from: e */
    public EditText f147726e;

    /* renamed from: f */
    public String f147727f;

    /* renamed from: g */
    public C59538b f147728g;

    /* renamed from: h */
    public String f147729h = "";

    /* renamed from: i */
    public C2048a f147730i;

    /* renamed from: j */
    public final int f147731j;

    /* renamed from: k */
    public final int f147732k = 1;

    /* renamed from: m */
    private StatusController f147733m;

    /* renamed from: n */
    private final int f147734n = 2;

    /* renamed from: a */
    public Context mo202821a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo202824a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m230911a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m230909a(this, configuration);
    }

    /* renamed from: g */
    public Resources mo202830g() {
        return super.getResources();
    }

    public AssetManager getAssets() {
        return m230917g(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m230915e(this);
    }

    /* renamed from: h */
    public void mo202832h() {
        super.onStop();
    }

    /* renamed from: i */
    public AssetManager mo202833i() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m230916f(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/openbusiness/bot/addsearch/GroupBotAddSearchActivity$Companion;", "", "()V", "DATA_KEY_CHAT_ID", "", "startActivity", "", "context", "Landroid/content/Context;", "chatId", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.addsearch.GroupBotAddSearchActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo202834a(Context context, String str) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intent intent = new Intent(context, GroupBotAddSearchActivity.class);
            intent.putExtra("chatId", str);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            context.startActivity(intent);
        }
    }

    /* renamed from: e */
    public final void mo202828e() {
        StatusController statusController = this.f147733m;
        if (statusController != null) {
            statusController.mo203016a(StatusController.Status.LOADING);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/openbusiness/bot/addsearch/GroupBotAddSearchActivity$initStatus$1", "Lcom/ss/android/openbusiness/ui/StatusController$IStatusSwitch;", "switchOff", "", "switchOn", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.addsearch.GroupBotAddSearchActivity$b */
    public static final class C59506b implements StatusController.AbstractC59600b {

        /* renamed from: a */
        final /* synthetic */ GroupBotAddSearchActivity f147735a;

        @Override // com.ss.android.openbusiness.ui.StatusController.AbstractC59600b
        /* renamed from: b */
        public void mo202787b() {
            Log.m165389i(this.f147735a.f147658a, "hide skeleton");
            C2048a aVar = this.f147735a.f147730i;
            if (aVar != null) {
                aVar.mo10130b();
            }
        }

        @Override // com.ss.android.openbusiness.ui.StatusController.AbstractC59600b
        /* renamed from: a */
        public void mo202786a() {
            Log.m165389i(this.f147735a.f147658a, "show skeleton");
            GroupBotAddSearchActivity groupBotAddSearchActivity = this.f147735a;
            groupBotAddSearchActivity.f147730i = C2052c.m8960a(GroupBotAddSearchActivity.m230910a(groupBotAddSearchActivity)).mo10132a(GroupBotAddSearchActivity.m230912b(this.f147735a)).mo10139e(R.layout.openplatform_bot_skeleton_item).mo10131a(3).mo10133a(UIUtils.canShowSkeleton()).mo10134a();
            GroupBotAddSearchActivity.m230910a(this.f147735a).setVisibility(0);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59506b(GroupBotAddSearchActivity groupBotAddSearchActivity) {
            this.f147735a = groupBotAddSearchActivity;
        }
    }

    public GroupBotAddSearchActivity() {
        this.f147658a = "GroupBotAddSearchActivity";
    }

    /* renamed from: b */
    public final void mo202776b() {
        StatusController statusController = this.f147733m;
        if (statusController != null) {
            statusController.mo203016a(StatusController.Status.CONTENT);
        }
    }

    /* renamed from: c */
    public final void mo202825c() {
        StatusController statusController = this.f147733m;
        if (statusController != null) {
            statusController.mo203016a(StatusController.Status.EMPTY);
        }
    }

    /* renamed from: d */
    public final void mo202827d() {
        StatusController statusController = this.f147733m;
        if (statusController != null) {
            statusController.mo203016a(StatusController.Status.ERROR);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        super.onResume();
        Log.m165389i(this.f147658a, "resume request can add list");
        mo202823a(this.f147734n);
        String str = this.f147727f;
        if (str != null) {
            AddSearchViewModel aVar = this.f147725d;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            aVar.getCanAddBotList(str);
        }
    }

    /* renamed from: j */
    private final void m230918j() {
        Intent intent = getIntent();
        if (intent == null || !intent.hasExtra("chatId")) {
            Log.m165383e(this.f147658a, "no chat id passed");
            return;
        }
        this.f147727f = getIntent().getStringExtra("chatId");
        String str = this.f147658a;
        Log.m165389i(str, "chatId is: " + this.f147727f);
    }

    /* renamed from: k */
    private final void m230919k() {
        StatusController statusController = new StatusController(findViewById(R.id.rv_content), findViewById(R.id.cl_error_wrapper), new C59506b(this));
        this.f147733m = statusController;
        if (statusController != null) {
            statusController.mo203015a(findViewById(R.id.cl_empty_wrapper), StatusController.Status.EMPTY);
        }
        StatusController statusController2 = this.f147733m;
        if (statusController2 != null) {
            statusController2.mo203015a(findViewById(R.id.cl_guide_wrapper), StatusController.Status.GUIDE);
        }
        StatusController statusController3 = this.f147733m;
        if (statusController3 != null) {
            statusController3.mo203019a(true);
        }
    }

    /* renamed from: m */
    private final void m230921m() {
        mo202828e();
        Application application = getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "application");
        AddSearchViewModel aVar = new AddSearchViewModel(application);
        this.f147725d = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        GroupBotAddSearchActivity groupBotAddSearchActivity = this;
        aVar.getMAddMutableLiveData().mo5923a(groupBotAddSearchActivity, new C59514j(this));
        AddSearchViewModel aVar2 = this.f147725d;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        aVar2.getMSearchMutableLiveData().mo5923a(groupBotAddSearchActivity, new C59515k(this));
    }

    /* renamed from: f */
    public final void mo202829f() {
        StatusController statusController = this.f147733m;
        if (statusController != null) {
            statusController.mo203016a(StatusController.Status.GUIDE);
        }
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_GroupBot_NoSearchBots, "name", this.f147729h);
        View findViewById = findViewById(R.id.guide_tip_text);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById<TextView>(R.id.guide_tip_text)");
        ((TextView) findViewById).setText(mustacheFormat);
    }

    /* renamed from: l */
    private final void m230920l() {
        this.f147723b = new GroupBotAddSearchAdapter(this, this.f147727f);
        View findViewById = findViewById(R.id.rv_content);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.rv_content)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f147724c = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        RecyclerView recyclerView2 = this.f147724c;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        GroupBotAddSearchAdapter bVar = this.f147723b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        recyclerView2.setAdapter(bVar);
        View findViewById2 = findViewById(R.id.etSearchHashTag);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.etSearchHashTag)");
        EditText editText = (EditText) findViewById2;
        this.f147726e = editText;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchText");
        }
        editText.addTextChangedListener(new C59507c(this));
        EditText editText2 = this.f147726e;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchText");
        }
        editText2.setOnFocusChangeListener(new View$OnFocusChangeListenerC59508d(this));
        ((ImageView) findViewById(R.id.iv_back)).setOnClickListener(new View$OnClickListenerC59509e(this));
        ((TextView) findViewById(R.id.empty_tip_help)).setOnClickListener(new View$OnClickListenerC59510f(this));
        ((ImageView) findViewById(R.id.tv_tip)).setOnClickListener(new View$OnClickListenerC59511g(this));
        ((ImageView) findViewById(R.id.ivSearchDelete)).setOnClickListener(new View$OnClickListenerC59512h(this));
        ((TextView) findViewById(R.id.tv_retry)).setOnClickListener(new View$OnClickListenerC59513i(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/openbusiness/bot/addsearch/GroupBotAddSearchActivity$initView$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.addsearch.GroupBotAddSearchActivity$c */
    public static final class C59507c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ GroupBotAddSearchActivity f147736a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59507c(GroupBotAddSearchActivity groupBotAddSearchActivity) {
            this.f147736a = groupBotAddSearchActivity;
        }

        public void afterTextChanged(Editable editable) {
            boolean z;
            Integer num;
            List<Bot> a;
            C59539a.m231020a();
            String valueOf = String.valueOf(editable);
            String str = this.f147736a.f147658a;
            Log.m165389i(str, "search text change: " + valueOf);
            if (valueOf.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f147736a.f147729h = "";
                String str2 = this.f147736a.f147658a;
                StringBuilder sb = new StringBuilder();
                sb.append("search data empty, show init data ");
                C59538b bVar = this.f147736a.f147728g;
                if (bVar == null || (a = bVar.mo202922a()) == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(a.size());
                }
                sb.append(num);
                Log.m165389i(str2, sb.toString());
                GroupBotAddSearchActivity groupBotAddSearchActivity = this.f147736a;
                groupBotAddSearchActivity.mo202823a(groupBotAddSearchActivity.f147731j);
                return;
            }
            String str3 = this.f147736a.f147727f;
            if (str3 != null) {
                this.f147736a.f147729h = valueOf;
                String str4 = this.f147736a.f147658a;
                Log.m165389i(str4, "text change, search bot: " + valueOf);
                GroupBotAddSearchActivity groupBotAddSearchActivity2 = this.f147736a;
                groupBotAddSearchActivity2.mo202823a(groupBotAddSearchActivity2.f147732k);
                GroupBotAddSearchActivity.m230913c(this.f147736a).onSearch(valueOf, str3);
                return;
            }
            this.f147736a.f147729h = "";
            Log.m165383e(this.f147736a.f147658a, "text change, but chatId null");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.addsearch.GroupBotAddSearchActivity$e */
    public static final class View$OnClickListenerC59509e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupBotAddSearchActivity f147738a;

        View$OnClickListenerC59509e(GroupBotAddSearchActivity groupBotAddSearchActivity) {
            this.f147738a = groupBotAddSearchActivity;
        }

        public final void onClick(View view) {
            this.f147738a.finish();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ RecyclerView m230910a(GroupBotAddSearchActivity groupBotAddSearchActivity) {
        RecyclerView recyclerView = groupBotAddSearchActivity.f147724c;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        return recyclerView;
    }

    /* renamed from: b */
    public static final /* synthetic */ GroupBotAddSearchAdapter m230912b(GroupBotAddSearchActivity groupBotAddSearchActivity) {
        GroupBotAddSearchAdapter bVar = groupBotAddSearchActivity.f147723b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        return bVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ AddSearchViewModel m230913c(GroupBotAddSearchActivity groupBotAddSearchActivity) {
        AddSearchViewModel aVar = groupBotAddSearchActivity.f147725d;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        return aVar;
    }

    /* renamed from: d */
    public static final /* synthetic */ EditText m230914d(GroupBotAddSearchActivity groupBotAddSearchActivity) {
        EditText editText = groupBotAddSearchActivity.f147726e;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchText");
        }
        return editText;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.addsearch.GroupBotAddSearchActivity$h */
    public static final class View$OnClickListenerC59512h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupBotAddSearchActivity f147741a;

        View$OnClickListenerC59512h(GroupBotAddSearchActivity groupBotAddSearchActivity) {
            this.f147741a = groupBotAddSearchActivity;
        }

        public final void onClick(View view) {
            Log.m165389i(this.f147741a.f147658a, "clear search text");
            GroupBotAddSearchActivity.m230914d(this.f147741a).setText("");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.addsearch.GroupBotAddSearchActivity$i */
    public static final class View$OnClickListenerC59513i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupBotAddSearchActivity f147742a;

        View$OnClickListenerC59513i(GroupBotAddSearchActivity groupBotAddSearchActivity) {
            this.f147742a = groupBotAddSearchActivity;
        }

        public final void onClick(View view) {
            Log.m165389i(this.f147742a.f147658a, "retry load");
            String str = this.f147742a.f147727f;
            if (str != null) {
                this.f147742a.mo202828e();
                GroupBotAddSearchActivity.m230913c(this.f147742a).getCanAddBotList(str);
            }
        }
    }

    /* renamed from: e */
    public static Resources m230915e(GroupBotAddSearchActivity groupBotAddSearchActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupBotAddSearchActivity);
        }
        return groupBotAddSearchActivity.mo202830g();
    }

    /* renamed from: g */
    public static AssetManager m230917g(GroupBotAddSearchActivity groupBotAddSearchActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupBotAddSearchActivity);
        }
        return groupBotAddSearchActivity.mo202833i();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.openbusiness.activity.BaseActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.open_platform_bot_search);
        m230918j();
        m230920l();
        m230919k();
        m230921m();
    }

    /* renamed from: f */
    public static void m230916f(GroupBotAddSearchActivity groupBotAddSearchActivity) {
        groupBotAddSearchActivity.mo202832h();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            GroupBotAddSearchActivity groupBotAddSearchActivity2 = groupBotAddSearchActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    groupBotAddSearchActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.addsearch.GroupBotAddSearchActivity$f */
    public static final class View$OnClickListenerC59510f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupBotAddSearchActivity f147739a;

        View$OnClickListenerC59510f(GroupBotAddSearchActivity groupBotAddSearchActivity) {
            this.f147739a = groupBotAddSearchActivity;
        }

        public final void onClick(View view) {
            String str;
            GroupBotConfig groupBotConfig = (GroupBotConfig) SettingManager.getInstance().get(GroupBotConfig.class);
            if (groupBotConfig != null) {
                String str2 = this.f147739a.f147658a;
                StringBuilder sb = new StringBuilder();
                sb.append("empty tip click");
                if (groupBotConfig.f147720a != null) {
                    str = groupBotConfig.f147720a;
                } else {
                    str = " url is null";
                }
                sb.append(str);
                Log.m165389i(str2, sb.toString());
                AbstractC59446a a = C59480b.m230865a();
                Intrinsics.checkExpressionValueIsNotNull(view, "it");
                a.mo144873a(view.getContext(), groupBotConfig.f147720a, null, false, null, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.addsearch.GroupBotAddSearchActivity$g */
    public static final class View$OnClickListenerC59511g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupBotAddSearchActivity f147740a;

        View$OnClickListenerC59511g(GroupBotAddSearchActivity groupBotAddSearchActivity) {
            this.f147740a = groupBotAddSearchActivity;
        }

        public final void onClick(View view) {
            String str;
            GroupBotConfig groupBotConfig = (GroupBotConfig) SettingManager.getInstance().get(GroupBotConfig.class);
            if (groupBotConfig != null) {
                String str2 = this.f147740a.f147658a;
                StringBuilder sb = new StringBuilder();
                sb.append("empty tip click");
                if (groupBotConfig.f147720a != null) {
                    str = groupBotConfig.f147720a;
                } else {
                    str = " url is null";
                }
                sb.append(str);
                Log.m165389i(str2, sb.toString());
                AbstractC59446a a = C59480b.m230865a();
                Intrinsics.checkExpressionValueIsNotNull(view, "it");
                a.mo144873a(view.getContext(), groupBotConfig.f147720a, null, false, null, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/openbusiness/bot/net/data/Data;", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.addsearch.GroupBotAddSearchActivity$j */
    public static final class C59514j<T> implements AbstractC1178x<C59538b> {

        /* renamed from: a */
        final /* synthetic */ GroupBotAddSearchActivity f147743a;

        C59514j(GroupBotAddSearchActivity groupBotAddSearchActivity) {
            this.f147743a = groupBotAddSearchActivity;
        }

        /* renamed from: a */
        public final void onChanged(C59538b bVar) {
            Integer num;
            List<Bot> b;
            List<Bot> a;
            Log.m165389i(this.f147743a.f147658a, "receive can add list change");
            if (bVar != null) {
                GroupBotAddSearchActivity groupBotAddSearchActivity = this.f147743a;
                groupBotAddSearchActivity.f147728g = GroupBotAddSearchActivity.m230913c(groupBotAddSearchActivity).getMAddMutableLiveData().mo5927b();
                String str = this.f147743a.f147658a;
                StringBuilder sb = new StringBuilder();
                sb.append("save current list: ");
                C59538b bVar2 = this.f147743a.f147728g;
                if (bVar2 == null || (a = bVar2.mo202922a()) == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(a.size());
                }
                sb.append(num);
                Log.m165383e(str, sb.toString());
                List<Bot> a2 = bVar.mo202922a();
                if (!(a2 == null || (b = bVar.mo202923b()) == null)) {
                    C59539a.m231022a(a2.size(), b.size());
                }
                List<BotViewItem> a3 = this.f147743a.mo202822a(bVar.mo202922a(), bVar.mo202923b(), false);
                if (!a3.isEmpty()) {
                    Log.m165383e(this.f147743a.f147658a, "receive can add list change, convert list not empty, show content");
                    this.f147743a.mo202776b();
                    GroupBotAddSearchActivity.m230912b(this.f147743a).resetAll(a3);
                    return;
                }
                Log.m165383e(this.f147743a.f147658a, "receive can add list change, convert list  empty, show empty");
                this.f147743a.mo202825c();
                return;
            }
            Log.m165383e(this.f147743a.f147658a, "receive can add list change, list null, show error");
            this.f147743a.mo202827d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/openbusiness/bot/net/data/Data;", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.addsearch.GroupBotAddSearchActivity$k */
    public static final class C59515k<T> implements AbstractC1178x<C59538b> {

        /* renamed from: a */
        final /* synthetic */ GroupBotAddSearchActivity f147744a;

        C59515k(GroupBotAddSearchActivity groupBotAddSearchActivity) {
            this.f147744a = groupBotAddSearchActivity;
        }

        /* renamed from: a */
        public final void onChanged(C59538b bVar) {
            boolean z;
            int i;
            Log.m165389i(this.f147744a.f147658a, "receive search list change");
            GroupBotAddSearchActivity groupBotAddSearchActivity = this.f147744a;
            groupBotAddSearchActivity.mo202823a(groupBotAddSearchActivity.f147731j);
            if (bVar != null) {
                int i2 = 0;
                if (this.f147744a.f147729h.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    String str = this.f147744a.f147729h;
                    List<Bot> b = bVar.mo202923b();
                    if (b != null) {
                        i = b.size();
                    } else {
                        i = 0;
                    }
                    List<Bot> a = bVar.mo202922a();
                    if (a != null) {
                        i2 = a.size();
                    }
                    C59539a.m231025a(str, i, i2);
                    List<BotViewItem> a2 = this.f147744a.mo202822a(bVar.mo202922a(), bVar.mo202923b(), true);
                    if (!a2.isEmpty()) {
                        Log.m165383e(this.f147744a.f147658a, "receive search change, convert list not empty, show content");
                        this.f147744a.mo202776b();
                        GroupBotAddSearchActivity.m230912b(this.f147744a).resetAll(a2);
                        return;
                    }
                    Log.m165383e(this.f147744a.f147658a, "receive search change, convert list  empty, show empty");
                    this.f147744a.mo202829f();
                    return;
                }
                Log.m165389i(this.f147744a.f147658a, "query is already empty, drop this search");
                return;
            }
            Log.m165389i(this.f147744a.f147658a, "receive search list change, data null, show error");
            this.f147744a.mo202827d();
        }
    }

    /* renamed from: a */
    public final void mo202823a(int i) {
        List<Bot> list;
        boolean z;
        List<Bot> list2;
        ImageView imageView = (ImageView) findViewById(R.id.ivSearchDelete);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.ivProgress);
        EditText editText = (EditText) findViewById(R.id.etSearchHashTag);
        List<Bot> list3 = null;
        if (i == this.f147731j) {
            EditText editText2 = this.f147726e;
            if (editText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchText");
            }
            Editable text = editText2.getText();
            Intrinsics.checkExpressionValueIsNotNull(text, "mSearchText.text");
            if (text.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Intrinsics.checkExpressionValueIsNotNull(imageView, "delete");
                imageView.setVisibility(0);
                Intrinsics.checkExpressionValueIsNotNull(progressBar, "progress");
                progressBar.setVisibility(8);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(imageView, "delete");
            imageView.setVisibility(8);
            Intrinsics.checkExpressionValueIsNotNull(progressBar, "progress");
            progressBar.setVisibility(8);
            C59538b bVar = this.f147728g;
            if (bVar != null) {
                if (bVar != null) {
                    list2 = bVar.mo202922a();
                } else {
                    list2 = null;
                }
                C59538b bVar2 = this.f147728g;
                if (bVar2 != null) {
                    list3 = bVar2.mo202923b();
                }
                List<BotViewItem> a = mo202822a(list2, list3, false);
                mo202776b();
                GroupBotAddSearchAdapter bVar3 = this.f147723b;
                if (bVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                }
                bVar3.resetAll(a);
            }
        } else if (i == this.f147732k) {
            Intrinsics.checkExpressionValueIsNotNull(imageView, "delete");
            imageView.setVisibility(8);
            Intrinsics.checkExpressionValueIsNotNull(progressBar, "progress");
            progressBar.setVisibility(0);
        } else if (i == this.f147734n) {
            editText.clearFocus();
            Intrinsics.checkExpressionValueIsNotNull(editText, "searchText");
            editText.getText().clear();
            Intrinsics.checkExpressionValueIsNotNull(imageView, "delete");
            imageView.setVisibility(8);
            Intrinsics.checkExpressionValueIsNotNull(progressBar, "progress");
            progressBar.setVisibility(8);
            KeyboardUtils.hideKeyboard(editText.getContext());
            C59538b bVar4 = this.f147728g;
            if (bVar4 != null) {
                if (bVar4 != null) {
                    list = bVar4.mo202922a();
                } else {
                    list = null;
                }
                C59538b bVar5 = this.f147728g;
                if (bVar5 != null) {
                    list3 = bVar5.mo202923b();
                }
                List<BotViewItem> a2 = mo202822a(list, list3, false);
                mo202776b();
                GroupBotAddSearchAdapter bVar6 = this.f147723b;
                if (bVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                }
                bVar6.resetAll(a2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.addsearch.GroupBotAddSearchActivity$d */
    public static final class View$OnFocusChangeListenerC59508d implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ GroupBotAddSearchActivity f147737a;

        View$OnFocusChangeListenerC59508d(GroupBotAddSearchActivity groupBotAddSearchActivity) {
            this.f147737a = groupBotAddSearchActivity;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                KeyboardUtils.showKeyboard(GroupBotAddSearchActivity.m230914d(this.f147737a));
            } else {
                KeyboardUtils.hideKeyboard(GroupBotAddSearchActivity.m230914d(this.f147737a).getContext());
            }
        }
    }

    /* renamed from: a */
    public static void m230911a(GroupBotAddSearchActivity groupBotAddSearchActivity, Context context) {
        groupBotAddSearchActivity.mo202824a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupBotAddSearchActivity);
        }
    }

    /* renamed from: a */
    public static Context m230909a(GroupBotAddSearchActivity groupBotAddSearchActivity, Configuration configuration) {
        Context a = groupBotAddSearchActivity.mo202821a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public final List<BotViewItem> mo202822a(List<? extends Bot> list, List<? extends Bot> list2, boolean z) {
        ArrayList<Bot> arrayList;
        Log.m165389i(this.f147658a, "convert data");
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            for (T t : list) {
                if (TextUtils.isEmpty(t.mo202900d())) {
                    arrayList3.add(t);
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            for (Bot bot : arrayList) {
                BotViewItem botViewItem = new BotViewItem(1, null, null, 6, null);
                botViewItem.mo202899c(bot.mo202910j());
                botViewItem.mo202895a(bot.mo202908h());
                botViewItem.mo202896a(bot.mo202905f());
                botViewItem.mo202898b(bot.mo202907g());
                GroupBotAddSearchActivity groupBotAddSearchActivity = this;
                SpannableString a = C57782ag.m224234a(bot.mo202905f(), this.f147729h, ContextCompat.getColor(groupBotAddSearchActivity, R.color.primary_pri_500));
                Intrinsics.checkExpressionValueIsNotNull(a, "TextUtil.highColorText(i…R.color.primary_pri_500))");
                botViewItem.mo202812a(a);
                SpannableString a2 = C57782ag.m224234a(bot.mo202907g(), this.f147729h, ContextCompat.getColor(groupBotAddSearchActivity, R.color.primary_pri_500));
                Intrinsics.checkExpressionValueIsNotNull(a2, "TextUtil.highColorText(i…R.color.primary_pri_500))");
                botViewItem.mo202814b(a2);
                botViewItem.mo202894a(bot.mo202903e());
                botViewItem.mo202897a(bot.mo202909i());
                arrayList2.add(botViewItem);
            }
        }
        if (arrayList != null && arrayList.size() == 0 && z && (list2 == null || list2.size() != 0)) {
            Log.m165389i(this.f147658a, "add search recommend head");
            arrayList2.add(new BotViewItem(4, null, null, 6, null));
        } else if (list2 == null || list2.size() != 0) {
            Log.m165389i(this.f147658a, "add recommend divider");
            arrayList2.add(new BotViewItem(3, null, null, 6, null));
        }
        if (list2 != null) {
            for (T t2 : list2) {
                BotViewItem botViewItem2 = new BotViewItem(2, null, null, 6, null);
                botViewItem2.mo202896a(t2.mo202905f());
                GroupBotAddSearchActivity groupBotAddSearchActivity2 = this;
                SpannableString a3 = C57782ag.m224234a(t2.mo202905f(), this.f147729h, ContextCompat.getColor(groupBotAddSearchActivity2, R.color.primary_pri_500));
                Intrinsics.checkExpressionValueIsNotNull(a3, "TextUtil.highColorText(i…R.color.primary_pri_500))");
                botViewItem2.mo202812a(a3);
                botViewItem2.mo202901d(t2.mo202911k());
                botViewItem2.mo202895a(t2.mo202908h());
                botViewItem2.mo202898b(t2.mo202907g());
                SpannableString a4 = C57782ag.m224234a(t2.mo202907g(), this.f147729h, ContextCompat.getColor(groupBotAddSearchActivity2, R.color.primary_pri_500));
                Intrinsics.checkExpressionValueIsNotNull(a4, "TextUtil.highColorText(i…R.color.primary_pri_500))");
                botViewItem2.mo202814b(a4);
                botViewItem2.mo202904e(t2.mo202912l());
                botViewItem2.mo202906f(t2.mo202913m());
                botViewItem2.mo202894a(t2.mo202903e());
                arrayList2.add(botViewItem2);
            }
        }
        return arrayList2;
    }
}
