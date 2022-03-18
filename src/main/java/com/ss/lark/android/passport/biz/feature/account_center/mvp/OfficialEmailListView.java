package com.ss.lark.android.passport.biz.feature.account_center.mvp;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.larksuite.suite.R;
import com.ss.android.bytedcert.utils.C28441g;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.C49226y;
import com.ss.android.lark.passport.infra.widget.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.lark.android.passport.biz.feature.account_center.UserOperationCenterInfo;
import com.ss.lark.android.passport.biz.feature.account_center.mvp.IAccountCenterContract;
import com.ss.lark.android.passport.biz.widget.AccountCenterTeamItemView;
import java.util.List;
import java.util.Map;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69389f;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0002J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/OfficialEmailListView;", "Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/AccountCenterView;", "context", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "MATCH_EMAIL", "", "showAllList", "", "officialEmailList", "", "", "Lcom/ss/lark/android/passport/biz/feature/account_center/UserOperationCenterInfo$ResponseTenant;", "showView", "stepInfo", "Lcom/ss/lark/android/passport/biz/feature/account_center/UserOperationCenterInfo;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.account_center.a.e */
public final class OfficialEmailListView extends AccountCenterView {

    /* renamed from: d */
    private final String f163053d = "email";

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/lark/android/passport/biz/feature/account_center/mvp/OfficialEmailListView$showAllList$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.account_center.a.e$a */
    public static final class View$OnClickListenerC64593a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserOperationCenterInfo.ResponseTenant f163054a;

        /* renamed from: b */
        final /* synthetic */ OfficialEmailListView f163055b;

        /* renamed from: c */
        final /* synthetic */ Map.Entry f163056c;

        View$OnClickListenerC64593a(UserOperationCenterInfo.ResponseTenant responseTenant, OfficialEmailListView eVar, Map.Entry entry) {
            this.f163054a = responseTenant;
            this.f163055b = eVar;
            this.f163056c = entry;
        }

        public final void onClick(View view) {
            IAccountCenterContract.IView.Delegate d = this.f163055b.mo223336d();
            if (d != null) {
                d.mo223326a(this.f163054a.id);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OfficialEmailListView(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        Intrinsics.checkParameterIsNotNull(appCompatActivity, "context");
    }

    @Override // com.ss.lark.android.passport.biz.feature.account_center.mvp.AccountCenterView, com.ss.lark.android.passport.biz.feature.account_center.mvp.IAccountCenterContract.IView
    /* renamed from: a */
    public void mo223334a(UserOperationCenterInfo userOperationCenterInfo) {
        CommonTitleBar h = mo223340h();
        if (h != null) {
            h.setTitleText(mo223350r().getString(R.string.Lark_Passport_AddAccount_DirectJoinViaMailTitle));
        }
        if (userOperationCenterInfo != null) {
            Map<String, List<UserOperationCenterInfo.ResponseTenant>> map = userOperationCenterInfo.officialEmailList;
            Intrinsics.checkExpressionValueIsNotNull(map, "it.officialEmailList");
            m253827a(map);
            return;
        }
        this.f123085b.mo171471d("n_page_official_email_list", "stepInfo is null");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/ss/lark/android/passport/biz/feature/account_center/mvp/OfficialEmailListView$showAllList$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.account_center.a.e$b */
    public static final class C64594b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AccountCenterTeamItemView $button;
        final /* synthetic */ Map.Entry $officialList$inlined;
        final /* synthetic */ UserOperationCenterInfo.ResponseTenant $responseTenant;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ OfficialEmailListView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64594b(UserOperationCenterInfo.ResponseTenant responseTenant, AccountCenterTeamItemView aVar, Continuation cVar, OfficialEmailListView eVar, Map.Entry entry) {
            super(2, cVar);
            this.$responseTenant = responseTenant;
            this.$button = aVar;
            this.this$0 = eVar;
            this.$officialList$inlined = entry;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C64594b bVar = new C64594b(this.$responseTenant, this.$button, cVar, this.this$0, this.$officialList$inlined);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C64594b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                final Bitmap bitmap = (Bitmap) C69389f.m266835a(null, new Function2<CoroutineScope, Continuation<? super Bitmap>, Object>(this, null) {
                    /* class com.ss.lark.android.passport.biz.feature.account_center.mvp.OfficialEmailListView.C64594b.C645951 */
                    Object L$0;
                    int label;
                    private CoroutineScope p$;
                    final /* synthetic */ C64594b this$0;

                    {
                        this.this$0 = r1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                        Intrinsics.checkParameterIsNotNull(cVar, "completion");
                        C645951 r0 = 

                        /* renamed from: a */
                        private final void m253827a(Map<String, List<UserOperationCenterInfo.ResponseTenant>> map) {
                            for (Map.Entry<String, List<UserOperationCenterInfo.ResponseTenant>> entry : map.entrySet()) {
                                TextView textView = new TextView(mo223350r());
                                C49226y.m194061a(mo223350r(), textView, UIHelper.mustacheFormat((int) R.string.Lark_Passport_AddAccount_DirectJoinViaMailDesc, this.f163053d, entry.getKey()), null, this.f123085b);
                                textView.setTextColor(mo223350r().getResources().getColor(R.color.text_caption));
                                textView.setPadding((int) C28441g.m104234a(mo223350r(), mo223343k()), (int) C28441g.m104234a(mo223350r(), mo223344l()), (int) C28441g.m104234a(mo223350r(), mo223343k()), mo223342j());
                                LinearLayout e = mo223337e();
                                if (e != null) {
                                    e.addView(textView);
                                }
                                LinearLayout e2 = mo223337e();
                                if (e2 != null) {
                                    AccountCenterView.m253777a(this, e2, 0, 0, 0, 7, null);
                                }
                                int i = 0;
                                for (T t : entry.getValue()) {
                                    int i2 = i + 1;
                                    if (i < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    T t2 = t;
                                    AccountCenterTeamItemView aVar = new AccountCenterTeamItemView(mo223350r());
                                    String str = t2.name;
                                    Intrinsics.checkExpressionValueIsNotNull(str, "responseTenant.name");
                                    aVar.mo224639a(str, null);
                                    aVar.setOnClickListener(new View$OnClickListenerC64593a(t2, this, entry));
                                    LinearLayout e3 = mo223337e();
                                    if (e3 != null) {
                                        e3.addView(aVar);
                                    }
                                    if (i == entry.getValue().size() - 1) {
                                        LinearLayout e4 = mo223337e();
                                        if (e4 != null) {
                                            AccountCenterView.m253777a(this, e4, 0, 0, 0, 7, null);
                                        }
                                    } else {
                                        LinearLayout e5 = mo223337e();
                                        if (e5 != null) {
                                            AccountCenterView.m253777a(this, e5, C49154ag.m193828a(mo223350r(), mo223343k()), 0, 0, 6, null);
                                        }
                                    }
                                    Job unused = C69553g.m266944a(mo223346n(), Dispatchers.m266326d(), null, new C64594b(t2, aVar, null, this, entry), 2, null);
                                    i = i2;
                                }
                            }
                        }
                    }
