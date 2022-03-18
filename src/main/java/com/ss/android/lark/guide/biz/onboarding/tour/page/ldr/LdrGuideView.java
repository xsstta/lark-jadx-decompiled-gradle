package com.ss.android.lark.guide.biz.onboarding.tour.page.ldr;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.mvp.C26034b;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.ILdrGuideContract;
import com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.entity.LdrServiceData;
import com.ss.android.lark.guide.statistics.OnboardingHitPoint;
import com.ss.android.lark.guide.statistics.OnboardingHitPointNew;
import com.ss.android.lark.inv.export.api.InvitationApi;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003!\"#B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\u0016\u0010\u001f\u001a\u00020\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrGuideView;", "Lcom/larksuite/framework/mvp/BaseView;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/ILdrGuideContract$ILdrView$IViewDelegate;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/ILdrGuideContract$ILdrView;", "context", "Landroid/content/Context;", "dependency", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrGuideView$ViewDependency;", "(Landroid/content/Context;Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrGuideView$ViewDependency;)V", "btnTv", "Landroid/widget/TextView;", "cardRv", "Landroidx/recyclerview/widget/RecyclerView;", "centerView", "Landroid/view/ViewGroup;", "hasService", "", "ldrServiceDataList", "", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/entity/LdrServiceData;", "rightAction", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "subTitle", "title", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "create", "", "initListeners", "initTitleBar", "initViews", "updateLdrData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Companion", "LDRBtnStateCallback", "ViewDependency", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.g */
public final class LdrGuideView extends C26034b<ILdrGuideContract.ILdrView.IViewDelegate> implements ILdrGuideContract.ILdrView {

    /* renamed from: f */
    public static final Companion f99221f = new Companion(null);

    /* renamed from: a */
    public TextView f99222a;

    /* renamed from: b */
    public RecyclerView f99223b;

    /* renamed from: c */
    public List<LdrServiceData> f99224c;

    /* renamed from: d */
    public boolean f99225d;

    /* renamed from: e */
    public final Context f99226e;

    /* renamed from: g */
    private CommonTitleBar f99227g;

    /* renamed from: h */
    private ViewGroup f99228h;

    /* renamed from: i */
    private TextView f99229i;

    /* renamed from: j */
    private TextView f99230j;

    /* renamed from: k */
    private IActionTitlebar.TextAction f99231k = new C38613f(this, UIHelper.getString(R.string.Lark_Guide_VideoSkip), R.color.primary_pri_500, 16);

    /* renamed from: l */
    private final ViewDependency f99232l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrGuideView$LDRBtnStateCallback;", "", "onBtnStateChanged", "", "enable", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.g$b */
    public interface LDRBtnStateCallback {
        /* renamed from: a */
        void mo141437a(boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\n\u0010\b\u001a\u0004\u0018\u00010\tH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrGuideView$ViewDependency;", "", "teamName", "", "getTeamName", "()Ljava/lang/String;", "hideBack", "", "rootView", "Landroid/view/View;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.g$c */
    public interface ViewDependency {
        /* renamed from: a */
        View mo141431a();

        /* renamed from: b */
        boolean mo141432b();

        /* renamed from: c */
        String mo141433c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrGuideView$Companion;", "", "()V", "toTeaEventList", "", "", "", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/entity/LdrServiceData;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List<String> mo141436a(Set<LdrServiceData> set) {
            List<String> list;
            if (set != null) {
                Set<LdrServiceData> set2 = set;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set2, 10));
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().mo141416f());
                }
                list = CollectionsKt.toList(arrayList);
            } else {
                list = null;
            }
            if (list != null) {
                return list;
            }
            return CollectionsKt.emptyList();
        }
    }

    @Override // com.larksuite.framework.mvp.C26034b, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m152338a();
    }

    /* renamed from: b */
    private final void m152339b() {
        TextView leftText;
        int i;
        CommonTitleBar commonTitleBar = this.f99227g;
        if (commonTitleBar != null && (leftText = commonTitleBar.getLeftText()) != null) {
            if (this.f99232l.mo141432b()) {
                i = 8;
            } else {
                i = 0;
            }
            leftText.setVisibility(i);
        }
    }

    /* renamed from: d */
    private final void m152340d() {
        CommonTitleBar commonTitleBar = this.f99227g;
        if (commonTitleBar != null) {
            commonTitleBar.setLeftClickListener(new View$OnClickListenerC38611d(this));
        }
        TextView textView = this.f99222a;
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC38612e(this));
        }
    }

    /* renamed from: a */
    private final void m152338a() {
        View a = this.f99232l.mo141431a();
        if (a != null) {
            this.f99227g = (CommonTitleBar) a.findViewById(R.id.guide_ldr_title_bar);
            this.f99228h = (ViewGroup) a.findViewById(R.id.guide_ldr_center);
            this.f99229i = (TextView) a.findViewById(R.id.guide_ldr_title);
            this.f99230j = (TextView) a.findViewById(R.id.guide_ldr_subtitle);
            this.f99222a = (TextView) a.findViewById(R.id.guide_ldr_btn);
            this.f99223b = (RecyclerView) a.findViewById(R.id.guide_ldr_card_rv);
            m152339b();
            m152340d();
            InvitationApi c = C40147z.m159163c();
            Intrinsics.checkExpressionValueIsNotNull(c, "InvUtils.getModule()");
            c.getDependency().bizReport(CollectionsKt.listOf("new_user_create_team_strong_guide"));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrGuideView$updateLdrData$1", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrGuideView$LDRBtnStateCallback;", "onBtnStateChanged", "", "enable", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.g$g */
    public static final class C38614g implements LDRBtnStateCallback {

        /* renamed from: a */
        final /* synthetic */ LdrGuideView f99236a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38614g(LdrGuideView gVar) {
            this.f99236a = gVar;
        }

        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.LdrGuideView.LDRBtnStateCallback
        /* renamed from: a */
        public void mo141437a(boolean z) {
            TextView textView = this.f99236a.f99222a;
            if (textView != null) {
                textView.setEnabled(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.g$d */
    public static final class View$OnClickListenerC38611d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LdrGuideView f99233a;

        View$OnClickListenerC38611d(LdrGuideView gVar) {
            this.f99233a = gVar;
        }

        public final void onClick(View view) {
            ((ILdrGuideContract.ILdrView.IViewDelegate) this.f99233a.mo92555c()).mo141403a();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ List m152337a(LdrGuideView gVar) {
        List<LdrServiceData> list = gVar.f99224c;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ldrServiceDataList");
        }
        return list;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrGuideView$rightAction$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.g$f */
    public static final class C38613f extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ LdrGuideView f99235a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            RecyclerView.Adapter adapter;
            Set<LdrServiceData> a;
            ((ILdrGuideContract.ILdrView.IViewDelegate) this.f99235a.mo92555c()).mo141405b();
            OnboardingHitPointNew onboardingHitPointNew = OnboardingHitPointNew.f99381a;
            OnboardingHitPointNew.OperatingActivitiesClickParam operatingActivitiesClickParam = OnboardingHitPointNew.OperatingActivitiesClickParam.SKIP;
            RecyclerView recyclerView = this.f99235a.f99223b;
            List<String> list = null;
            if (recyclerView != null) {
                adapter = recyclerView.getAdapter();
            } else {
                adapter = null;
            }
            LdrCardAdapter cVar = (LdrCardAdapter) adapter;
            if (!(cVar == null || (a = cVar.mo141421a()) == null)) {
                list = LdrGuideView.f99221f.mo141436a(a);
            }
            onboardingHitPointNew.mo141636a(operatingActivitiesClickParam, list);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38613f(LdrGuideView gVar, String str, int i, int i2) {
            super(str, i, i2);
            this.f99235a = gVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.g$e */
    public static final class View$OnClickListenerC38612e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LdrGuideView f99234a;

        View$OnClickListenerC38612e(LdrGuideView gVar) {
            this.f99234a = gVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
            if (r1 != null) goto L_0x004c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r5) {
            /*
            // Method dump skipped, instructions count: 225
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.LdrGuideView.View$OnClickListenerC38612e.onClick(android.view.View):void");
        }
    }

    @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.ILdrGuideContract.ILdrView
    /* renamed from: a */
    public void mo141402a(List<LdrServiceData> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f99224c = list;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ldrServiceDataList");
        }
        boolean z = !list.isEmpty();
        this.f99225d = z;
        if (z) {
            CommonTitleBar commonTitleBar = this.f99227g;
            if (commonTitleBar != null) {
                commonTitleBar.addAction(this.f99231k);
            }
            RecyclerView recyclerView = this.f99223b;
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            }
            RecyclerView recyclerView2 = this.f99223b;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new LinearLayoutManager(this.f99226e, 1, false));
            }
            RecyclerView recyclerView3 = this.f99223b;
            if (recyclerView3 != null) {
                List<LdrServiceData> list2 = this.f99224c;
                if (list2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ldrServiceDataList");
                }
                recyclerView3.setAdapter(new LdrCardAdapter(list2, new C38614g(this)));
            }
            TextView textView = this.f99229i;
            if (textView != null) {
                String c = this.f99232l.mo141433c();
                if (c == null) {
                    c = UIHelper.getString(R.string.Lark_App_Name);
                }
                textView.setText(UIHelper.mustacheFormat((int) R.string.Lark_Guide_Benefits1Title, "TEAM_NAME", c));
            }
            TextView textView2 = this.f99230j;
            if (textView2 != null) {
                textView2.setText(UIHelper.mustacheFormat((int) R.string.Lark_Guide_Benefits1SubTitle, "APP_DISPLAY_NAME", UIHelper.getString(R.string.Lark_App_Name)));
            }
            TextView textView3 = this.f99222a;
            if (textView3 != null) {
                textView3.setText(UIHelper.getString(R.string.Lark_Guide_Benefits1ButtonGet));
            }
        } else {
            RecyclerView recyclerView4 = this.f99223b;
            if (recyclerView4 != null) {
                recyclerView4.setVisibility(8);
            }
            TextView textView4 = this.f99229i;
            if (textView4 != null) {
                textView4.setText(UIHelper.getString(R.string.Lark_Guide_TeamCreate3SuccessTitle));
            }
            TextView textView5 = this.f99230j;
            if (textView5 != null) {
                textView5.setText(UIHelper.getString(R.string.Lark_Guide_TeamCreate3SuccessSubTitle));
            }
            TextView textView6 = this.f99222a;
            if (textView6 != null) {
                textView6.setText(UIHelper.getString(R.string.Lark_Guide_EnterNewTeam));
            }
        }
        ViewGroup viewGroup = this.f99228h;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        TextView textView7 = this.f99222a;
        if (textView7 != null) {
            textView7.setVisibility(0);
        }
        OnboardingHitPoint.f99379a.mo141625f(this.f99225d);
        OnboardingHitPointNew onboardingHitPointNew = OnboardingHitPointNew.f99381a;
        List<LdrServiceData> list3 = this.f99224c;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ldrServiceDataList");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            String f = it.next().mo141416f();
            if (f != null) {
                arrayList.add(f);
            }
        }
        onboardingHitPointNew.mo141637a(arrayList);
    }

    public LdrGuideView(Context context, ViewDependency cVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "dependency");
        this.f99226e = context;
        this.f99232l = cVar;
    }
}
