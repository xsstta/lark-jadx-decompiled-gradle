package com.ss.android.lark.moments.impl.broadcast;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.ViewModelLazy;
import com.bytedance.lark.pb.moments.v1.Broadcast;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.impl.broadcast.BroadcastChooseDialog;
import com.ss.android.lark.moments.impl.broadcast.BroadcastTimePickerDialog;
import com.ss.android.lark.moments.impl.common.utils.C47282k;
import com.ss.android.lark.moments.impl.common.utils.TimeLabelUtils;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.dialog.CommonLoadingDialog;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 12\u00020\u0001:\u00011B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u0011H\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0011H\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0016J\b\u0010#\u001a\u00020\u001eH\u0002J\b\u0010$\u001a\u00020\u001eH\u0002J\b\u0010%\u001a\u00020\u001eH\u0002J\b\u0010&\u001a\u00020\u001eH\u0002J\b\u0010'\u001a\u00020\u001eH\u0002J\u0012\u0010(\u001a\u00020\u001e2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020\u001eH\u0014J\b\u0010,\u001a\u00020\u001eH\u0002J\b\u0010-\u001a\u00020\u001eH\u0002J\b\u0010.\u001a\u00020\u001eH\u0002J\u0010\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u0016H\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u0019\u0010\u001a¨\u00062"}, d2 = {"Lcom/ss/android/lark/moments/impl/broadcast/MomentsBroadcastEditActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "mBroadcastList", "Ljava/util/ArrayList;", "Lcom/bytedance/lark/pb/moments/v1/Broadcast;", "Lkotlin/collections/ArrayList;", "mEditBroadcast", "mLoadingDialog", "Lcom/ss/android/lark/widget/dialog/CommonLoadingDialog;", "getMLoadingDialog", "()Lcom/ss/android/lark/widget/dialog/CommonLoadingDialog;", "mLoadingDialog$delegate", "Lkotlin/Lazy;", "mPostId", "", "mReplaceBroadcastChoose", "", "mRightSureTV", "Landroid/widget/TextView;", "mSelectedPostId", "mTimeStamp", "", "mViewModel", "Lcom/ss/android/lark/moments/impl/broadcast/BroadcastEditViewModel;", "getMViewModel", "()Lcom/ss/android/lark/moments/impl/broadcast/BroadcastEditViewModel;", "mViewModel$delegate", "canSetBroadcast", "changeSureBtnStatus", "", "checkValid", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "initBroadcastEditor", "initReplaceLayout", "initTimePicker", "initTitleBar", "initViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "replaceBroadcast", "showReplaceDialog", "showTimePickerDialog", "updateEndTime", "time", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MomentsBroadcastEditActivity extends BaseFragmentActivity {

    /* renamed from: e */
    public static final Companion f119007e = new Companion(null);

    /* renamed from: a */
    public boolean f119008a = true;

    /* renamed from: b */
    public String f119009b = "";

    /* renamed from: c */
    public String f119010c = "";

    /* renamed from: d */
    public long f119011d;

    /* renamed from: f */
    private TextView f119012f;

    /* renamed from: g */
    private ArrayList<Broadcast> f119013g = new ArrayList<>();

    /* renamed from: h */
    private Broadcast f119014h;

    /* renamed from: i */
    private final Lazy f119015i = new ViewModelLazy(Reflection.getOrCreateKotlinClass(BroadcastEditViewModel.class), new MomentsBroadcastEditActivity$$special$$inlined$viewModels$2(this), new MomentsBroadcastEditActivity$$special$$inlined$viewModels$1(this));

    /* renamed from: j */
    private final Lazy f119016j = LazyKt.lazy(C47192h.INSTANCE);

    /* renamed from: k */
    private HashMap f119017k;

    /* renamed from: j */
    private final BroadcastEditViewModel m186986j() {
        return (BroadcastEditViewModel) this.f119015i.getValue();
    }

    /* renamed from: a */
    public Context mo165910a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public View mo165911a(int i) {
        if (this.f119017k == null) {
            this.f119017k = new HashMap();
        }
        View view = (View) this.f119017k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f119017k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final CommonLoadingDialog mo165912a() {
        return (CommonLoadingDialog) this.f119016j.getValue();
    }

    /* renamed from: a */
    public void mo165914a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m186983a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m186981a(this, configuration);
    }

    /* renamed from: g */
    public Resources mo165921g() {
        return super.getResources();
    }

    public AssetManager getAssets() {
        return m186985c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m186982a(this);
    }

    /* renamed from: h */
    public void mo165923h() {
        super.onStop();
    }

    /* renamed from: i */
    public AssetManager mo165924i() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m186984b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J4\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/moments/impl/broadcast/MomentsBroadcastEditActivity$Companion;", "", "()V", "EXTRA_KEY_BROADCAST_LIST", "", "EXTRA_KEY_EDIT_BROADCAST", "EXTRA_KEY_POST_ID", "INIT_DAY_DELAY", "", "LOG_TAG", "MAX_BROADCAST_LIMIT", "MAX_TITLE_LEN", "showReplaceBroadcastConfirmDialog", "", "context", "Landroid/content/Context;", "postId", "broadcastList", "", "Lcom/bytedance/lark/pb/moments/v1/Broadcast;", "startBroadcastEditActivity", "editBroadcast", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.MomentsBroadcastEditActivity$a */
    public static final class Companion {
        private Companion() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.broadcast.MomentsBroadcastEditActivity$a$a */
        static final class RunnableC47181a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Context f119018a;

            /* renamed from: b */
            final /* synthetic */ String f119019b;

            /* renamed from: c */
            final /* synthetic */ List f119020c;

            RunnableC47181a(Context context, String str, List list) {
                this.f119018a = context;
                this.f119019b = str;
                this.f119020c = list;
            }

            public final void run() {
                new C25639g(this.f119018a).mo89237b(UIHelper.getString(R.string.Lark_Moments_ReplaceTrendingPost_PopupTitle)).mo89242c(UIHelper.getString(R.string.Lark_Moments_ReplaceTrendingPost_PopupText)).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Community_Cancel, DialogInterface$OnClickListenerC471821.f119021a).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmTip, new DialogInterface.OnClickListener(this) {
                    /* class com.ss.android.lark.moments.impl.broadcast.MomentsBroadcastEditActivity.Companion.RunnableC47181a.DialogInterface$OnClickListenerC471832 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC47181a f119022a;

                    {
                        this.f119022a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Companion.m187006a(MomentsBroadcastEditActivity.f119007e, this.f119022a.f119018a, this.f119022a.f119019b, null, this.f119022a.f119020c, 4, null);
                        dialogInterface.dismiss();
                    }
                }).mo89239c();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo165926a(Context context, String str, List<Broadcast> list) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "postId");
            Intrinsics.checkParameterIsNotNull(list, "broadcastList");
            UICallbackExecutor.execute(new RunnableC47181a(context, str, list));
        }

        /* renamed from: a */
        public final void mo165925a(Context context, String str, Broadcast broadcast, List<Broadcast> list) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "postId");
            Intent intent = new Intent(context, MomentsBroadcastEditActivity.class);
            intent.putExtra("key_post_id", str);
            if (broadcast != null) {
                intent.putExtra("key_edit_broadcast", broadcast);
            }
            if (list != null) {
                intent.putExtra("key_broadcast_list", new ArrayList(list));
            }
            C47282k.m187257a(context, intent);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.lark.moments.impl.broadcast.MomentsBroadcastEditActivity$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ void m187006a(Companion aVar, Context context, String str, Broadcast broadcast, List list, int i, Object obj) {
            if ((i & 4) != 0) {
                broadcast = null;
            }
            if ((i & 8) != 0) {
                list = null;
            }
            aVar.mo165925a(context, str, broadcast, list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/broadcast/MomentsBroadcastEditActivity$initReplaceLayout$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.MomentsBroadcastEditActivity$c */
    public static final class C47185c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsBroadcastEditActivity f119024a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.broadcast.MomentsBroadcastEditActivity$c$a */
        static final class RunnableC47186a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C47185c f119025a;

            RunnableC47186a(C47185c cVar) {
                this.f119025a = cVar;
            }

            public final void run() {
                this.f119025a.f119024a.mo165915b();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47185c(MomentsBroadcastEditActivity momentsBroadcastEditActivity) {
            this.f119024a = momentsBroadcastEditActivity;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            if (KeyboardUtils.isSoftShowing(this.f119024a)) {
                KeyboardUtils.hideKeyboard(this.f119024a);
                UICallbackExecutor.executeDelayed(new RunnableC47186a(this), 500);
                return;
            }
            this.f119024a.mo165915b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/broadcast/MomentsBroadcastEditActivity$initTimePicker$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.MomentsBroadcastEditActivity$d */
    public static final class C47187d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsBroadcastEditActivity f119026a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.broadcast.MomentsBroadcastEditActivity$d$a */
        static final class RunnableC47188a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C47187d f119027a;

            RunnableC47188a(C47187d dVar) {
                this.f119027a = dVar;
            }

            public final void run() {
                this.f119027a.f119026a.mo165916c();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47187d(MomentsBroadcastEditActivity momentsBroadcastEditActivity) {
            this.f119026a = momentsBroadcastEditActivity;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            if (KeyboardUtils.isSoftShowing(this.f119026a)) {
                KeyboardUtils.hideKeyboard(this.f119026a);
                UICallbackExecutor.executeDelayed(new RunnableC47188a(this), 500);
                return;
            }
            this.f119026a.mo165916c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/widget/dialog/CommonLoadingDialog;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.MomentsBroadcastEditActivity$h */
    static final class C47192h extends Lambda implements Function0<CommonLoadingDialog> {
        public static final C47192h INSTANCE = new C47192h();

        C47192h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CommonLoadingDialog invoke() {
            return new CommonLoadingDialog();
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    /* renamed from: o */
    private final void m186991o() {
        m186986j().getReplaceResult().mo5923a(this, new C47191g(this));
    }

    /* renamed from: b */
    public final void mo165915b() {
        new BroadcastChooseDialog(this, this.f119013g, this.f119010c, new C47193i(this)).show();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        if (KeyboardUtils.isSoftShowing(this)) {
            KeyboardUtils.hideKeyboard(this);
        }
    }

    /* renamed from: l */
    private final void m186988l() {
        if (CollectionUtils.isEmpty(this.f119013g)) {
            RelativeLayout relativeLayout = (RelativeLayout) mo165911a(R.id.replace_layout);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "replace_layout");
            relativeLayout.setVisibility(8);
            return;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) mo165911a(R.id.replace_layout);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "replace_layout");
        relativeLayout2.setVisibility(0);
        this.f119008a = false;
        ((RelativeLayout) mo165911a(R.id.replace_layout)).setOnClickListener(new C47185c(this));
    }

    /* renamed from: n */
    private final void m186990n() {
        this.f119011d = TimeLabelUtils.f119256a.mo166219a(4).getTimeInMillis();
        Broadcast broadcast = this.f119014h;
        if (broadcast != null) {
            this.f119011d = broadcast.end_time_sec.longValue() * ((long) 1000);
        }
        mo165913a(this.f119011d);
        ((RelativeLayout) mo165911a(R.id.time_picker_layout)).setOnClickListener(new C47187d(this));
    }

    /* renamed from: c */
    public final void mo165916c() {
        new BroadcastTimePickerDialog(this, this.f119011d, new C47194j(this)).show();
    }

    /* renamed from: e */
    public final boolean mo165919e() {
        boolean z;
        EditText editText = (EditText) mo165911a(R.id.title_editor);
        Intrinsics.checkExpressionValueIsNotNull(editText, "title_editor");
        Editable text = editText.getText();
        Intrinsics.checkExpressionValueIsNotNull(text, "title_editor.text");
        if (text.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !this.f119008a) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo165920f() {
        EditText editText = (EditText) mo165911a(R.id.title_editor);
        Intrinsics.checkExpressionValueIsNotNull(editText, "title_editor");
        String obj = editText.getText().toString();
        mo165912a().show(this);
        m186986j().replaceBroadcast(this.f119009b, obj, this.f119011d / ((long) 1000), this.f119010c);
    }

    /* renamed from: k */
    private final boolean m186987k() {
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        Intrinsics.checkExpressionValueIsNotNull(extras, "intent.extras ?: return false");
        String string = extras.getString("key_post_id", "");
        Intrinsics.checkExpressionValueIsNotNull(string, "bundle.getString(EXTRA_KEY_POST_ID, \"\")");
        this.f119009b = string;
        Serializable serializable = extras.getSerializable("key_broadcast_list");
        if (serializable != null) {
            this.f119013g.addAll((ArrayList) serializable);
            this.f119008a = false;
        }
        Serializable serializable2 = extras.getSerializable("key_edit_broadcast");
        if (serializable2 == null) {
            return true;
        }
        this.f119014h = (Broadcast) serializable2;
        return true;
    }

    /* renamed from: m */
    private final void m186989m() {
        Broadcast broadcast = this.f119014h;
        if (broadcast != null) {
            ((EditText) mo165911a(R.id.title_editor)).setText(broadcast.title);
        }
        ((EditText) mo165911a(R.id.title_editor)).requestFocus();
        KeyboardUtils.showKeyboard((EditText) mo165911a(R.id.title_editor));
        ((EditText) mo165911a(R.id.title_editor)).addTextChangedListener(new C47184b(this));
        MomentsBroadcastEditActivity momentsBroadcastEditActivity = this;
        ((ImageView) mo165911a(R.id.replace_title_iv)).setImageDrawable(UDIconUtils.getIconDrawable(momentsBroadcastEditActivity, (int) R.drawable.ud_icon_right_outlined, UIHelper.getColor(R.color.icon_n3)));
        ((ImageView) mo165911a(R.id.end_time_iv)).setImageDrawable(UDIconUtils.getIconDrawable(momentsBroadcastEditActivity, (int) R.drawable.ud_icon_right_outlined, UIHelper.getColor(R.color.icon_n3)));
    }

    /* renamed from: d */
    public final void mo165918d() {
        if (mo165919e()) {
            TextView textView = this.f119012f;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRightSureTV");
            }
            textView.setEnabled(true);
            TextView textView2 = this.f119012f;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRightSureTV");
            }
            textView2.setTextColor(UIHelper.getColor(R.color.primary_pri_500));
            return;
        }
        TextView textView3 = this.f119012f;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRightSureTV");
        }
        textView3.setEnabled(false);
        TextView textView4 = this.f119012f;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRightSureTV");
        }
        textView4.setTextColor(UIHelper.getColor(R.color.text_disable));
    }

    /* renamed from: p */
    private final void m186992p() {
        int i;
        CommonTitleBar commonTitleBar = (CommonTitleBar) mo165911a(R.id.title_bar);
        if (this.f119014h != null) {
            i = R.string.Lark_Moments_DisplayInTrending_Title;
        } else if (!this.f119013g.isEmpty()) {
            i = R.string.Lark_Moments_ReplaceTrendingPost_Title;
        } else {
            i = R.string.Lark_Moments_PinToTrending_Title;
        }
        commonTitleBar.setTitle(i);
        commonTitleBar.setLeftText(CommonTitleBarConstants.Lark_Legacy_Cancel);
        commonTitleBar.setLeftImageDrawable(null);
        commonTitleBar.setLeftClickListener(new C47189e(this));
        TextView textView = new TextView(this);
        this.f119012f = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRightSureTV");
        }
        textView.setTextSize(1, 16.0f);
        TextView textView2 = this.f119012f;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRightSureTV");
        }
        textView2.setText(UIHelper.getString(R.string.Lark_Community_Confirm));
        mo165918d();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        TextView textView3 = this.f119012f;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRightSureTV");
        }
        ((CommonTitleBar) mo165911a(R.id.title_bar)).addAction(new C47190f(this, textView3), layoutParams);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/moments/impl/broadcast/MomentsBroadcastEditActivity$initBroadcastEditor$2", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.MomentsBroadcastEditActivity$b */
    public static final class C47184b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ MomentsBroadcastEditActivity f119023a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47184b(MomentsBroadcastEditActivity momentsBroadcastEditActivity) {
            this.f119023a = momentsBroadcastEditActivity;
        }

        public void afterTextChanged(Editable editable) {
            Intrinsics.checkParameterIsNotNull(editable, "s");
            this.f119023a.mo165918d();
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence != null && charSequence.length() > 30) {
                LKUIToast.show(this.f119023a, UIHelper.mustacheFormat((int) R.string.Lark_Community_MaximumCharacters, "titleNum", "30"));
                String str = charSequence.subSequence(0, i).toString() + charSequence.subSequence(i3 + i, charSequence.length()).toString();
                if (str.length() > 30) {
                    str = str.subSequence(0, 30).toString();
                }
                ((EditText) this.f119023a.mo165911a(R.id.title_editor)).setText(str);
                EditText editText = (EditText) this.f119023a.mo165911a(R.id.title_editor);
                Intrinsics.checkExpressionValueIsNotNull(editText, "title_editor");
                if (i > editText.getText().length() || i < 0) {
                    EditText editText2 = (EditText) this.f119023a.mo165911a(R.id.title_editor);
                    Intrinsics.checkExpressionValueIsNotNull(editText2, "title_editor");
                    ((EditText) this.f119023a.mo165911a(R.id.title_editor)).setSelection(editText2.getText().length());
                    return;
                }
                ((EditText) this.f119023a.mo165911a(R.id.title_editor)).setSelection(i);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/moments/impl/broadcast/MomentsBroadcastEditActivity$initTitleBar$1$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.MomentsBroadcastEditActivity$e */
    public static final class C47189e extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsBroadcastEditActivity f119028a;

        C47189e(MomentsBroadcastEditActivity momentsBroadcastEditActivity) {
            this.f119028a = momentsBroadcastEditActivity;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            if (KeyboardUtils.isSoftShowing(this.f119028a)) {
                KeyboardUtils.hideKeyboard(this.f119028a);
            }
            this.f119028a.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/broadcast/MomentsBroadcastEditActivity$showReplaceDialog$dialog$1", "Lcom/ss/android/lark/moments/impl/broadcast/BroadcastChooseDialog$OnBroadcastSelectedListener;", "onBroadcastSelected", "", "broadcast", "Lcom/bytedance/lark/pb/moments/v1/Broadcast;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.MomentsBroadcastEditActivity$i */
    public static final class C47193i implements BroadcastChooseDialog.OnBroadcastSelectedListener {

        /* renamed from: a */
        final /* synthetic */ MomentsBroadcastEditActivity f119031a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47193i(MomentsBroadcastEditActivity momentsBroadcastEditActivity) {
            this.f119031a = momentsBroadcastEditActivity;
        }

        @Override // com.ss.android.lark.moments.impl.broadcast.BroadcastChooseDialog.OnBroadcastSelectedListener
        /* renamed from: a */
        public void mo165936a(Broadcast broadcast) {
            Intrinsics.checkParameterIsNotNull(broadcast, "broadcast");
            Log.m165389i("MomentsBroadcastEditActivity", "onBroadcastSelected:" + broadcast.post_id);
            this.f119031a.f119008a = true;
            MomentsBroadcastEditActivity momentsBroadcastEditActivity = this.f119031a;
            String str = broadcast.post_id;
            Intrinsics.checkExpressionValueIsNotNull(str, "broadcast.post_id");
            momentsBroadcastEditActivity.f119010c = str;
            TextView textView = (TextView) this.f119031a.mo165911a(R.id.replace_title_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "replace_title_tv");
            textView.setText(broadcast.title);
            TextView textView2 = (TextView) this.f119031a.mo165911a(R.id.replace_title_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "replace_title_tv");
            ((TextView) this.f119031a.mo165911a(R.id.replace_title_tv)).setTextColor(UIUtils.getColor(textView2.getContext(), R.color.text_title));
            this.f119031a.mo165918d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/broadcast/MomentsBroadcastEditActivity$showTimePickerDialog$dialog$1", "Lcom/ss/android/lark/moments/impl/broadcast/BroadcastTimePickerDialog$OnTimeSelectedListener;", "onTimeSelected", "", "timeStamp", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.MomentsBroadcastEditActivity$j */
    public static final class C47194j implements BroadcastTimePickerDialog.OnTimeSelectedListener {

        /* renamed from: a */
        final /* synthetic */ MomentsBroadcastEditActivity f119032a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47194j(MomentsBroadcastEditActivity momentsBroadcastEditActivity) {
            this.f119032a = momentsBroadcastEditActivity;
        }

        @Override // com.ss.android.lark.moments.impl.broadcast.BroadcastTimePickerDialog.OnTimeSelectedListener
        /* renamed from: a */
        public void mo165937a(long j) {
            this.f119032a.f119011d = j;
            MomentsBroadcastEditActivity momentsBroadcastEditActivity = this.f119032a;
            momentsBroadcastEditActivity.mo165913a(momentsBroadcastEditActivity.f119011d);
            this.f119032a.mo165918d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/broadcast/MomentsBroadcastEditActivity$initTitleBar$sureAction$1", "Lcom/ss/android/lark/ui/IActionTitlebar$ViewAction;", "performAction", "", "view", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.MomentsBroadcastEditActivity$f */
    public static final class C47190f extends IActionTitlebar.C57575b {

        /* renamed from: a */
        final /* synthetic */ MomentsBroadcastEditActivity f119029a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            super.performAction(view);
            if (this.f119029a.mo165919e()) {
                this.f119029a.mo165920f();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47190f(MomentsBroadcastEditActivity momentsBroadcastEditActivity, View view) {
            super(view);
            this.f119029a = momentsBroadcastEditActivity;
        }
    }

    /* renamed from: a */
    public static Resources m186982a(MomentsBroadcastEditActivity momentsBroadcastEditActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsBroadcastEditActivity);
        }
        return momentsBroadcastEditActivity.mo165921g();
    }

    /* renamed from: c */
    public static AssetManager m186985c(MomentsBroadcastEditActivity momentsBroadcastEditActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsBroadcastEditActivity);
        }
        return momentsBroadcastEditActivity.mo165924i();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_moments_broadcast_edit);
        m186987k();
        m186992p();
        m186989m();
        m186990n();
        m186988l();
        m186991o();
    }

    /* renamed from: b */
    public static void m186984b(MomentsBroadcastEditActivity momentsBroadcastEditActivity) {
        momentsBroadcastEditActivity.mo165923h();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MomentsBroadcastEditActivity momentsBroadcastEditActivity2 = momentsBroadcastEditActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    momentsBroadcastEditActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "success", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.MomentsBroadcastEditActivity$g */
    public static final class C47191g<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsBroadcastEditActivity f119030a;

        C47191g(MomentsBroadcastEditActivity momentsBroadcastEditActivity) {
            this.f119030a = momentsBroadcastEditActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f119030a.mo165912a().dismiss();
            Intrinsics.checkExpressionValueIsNotNull(bool, "success");
            if (bool.booleanValue()) {
                Log.m165389i("MomentsBroadcastEditActivity", "set broadcast success, postId is:" + this.f119030a.f119009b);
                LKUIToast.show(this.f119030a, UIHelper.getString(R.string.Lark_Moments_AddedToTrendingRefresh_Toast));
                this.f119030a.finish();
                return;
            }
            Log.m165389i("MomentsBroadcastEditActivity", "set broadcast failed");
            LKUIToast.show(this.f119030a, UIHelper.getString(R.string.Lark_Moments_UnableToAddToTrendingTryAgain_Toast));
        }
    }

    /* renamed from: a */
    public final void mo165913a(long j) {
        String a = TimeLabelUtils.f119256a.mo166218a(this, j);
        TextView textView = (TextView) mo165911a(R.id.end_time_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "end_time_tv");
        textView.setText(a);
    }

    /* renamed from: a */
    public static void m186983a(MomentsBroadcastEditActivity momentsBroadcastEditActivity, Context context) {
        momentsBroadcastEditActivity.mo165914a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsBroadcastEditActivity);
        }
    }

    /* renamed from: a */
    public static Context m186981a(MomentsBroadcastEditActivity momentsBroadcastEditActivity, Configuration configuration) {
        Context a = momentsBroadcastEditActivity.mo165910a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
