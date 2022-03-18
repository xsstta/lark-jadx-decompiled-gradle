package com.bytedance.ee.bear.more.view2.header;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.icon.IconInfo;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.icon.C7713a;
import com.bytedance.ee.bear.facade.common.icon.IconSize;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.more.MoreViewModel;
import com.bytedance.ee.bear.more.PageViewResult;
import com.bytedance.ee.bear.more.export.FolderMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.export.PageviewResult;
import com.bytedance.ee.bear.more.export.WikiMoreInfo;
import com.bytedance.ee.bear.p376e.p377a.AbstractC7588a;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p705h.C13666a;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 12\u00020\u0001:\u00011B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u001aH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010 \u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\u001eH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002J\b\u0010#\u001a\u00020\u001eH\u0002J\u0012\u0010$\u001a\u00020\u001e2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J&\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020(2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010/\u001a\u00020\u001eH\u0002J\u0012\u00100\u001a\u00020\u001e2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/bytedance/ee/bear/more/view2/header/MoreHeaderFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "()V", "delegate", "Lcom/bytedance/ee/bear/more/view2/header/IHeaderView;", "getDelegate", "()Lcom/bytedance/ee/bear/more/view2/header/IHeaderView;", "setDelegate", "(Lcom/bytedance/ee/bear/more/view2/header/IHeaderView;)V", "iconInfo", "Lcom/bytedance/ee/bear/contract/icon/IconInfo;", "pageViewResult", "Lcom/bytedance/ee/bear/more/PageViewResult;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/bytedance/ee/bear/more/MoreViewModel;", "wordCountResult", "Lcom/bytedance/ee/bear/more/export/PageviewResult;", "getMoreInfo", "Lcom/bytedance/ee/bear/more/export/IMoreInfo;", "getOwner", "", "getViewsCount", "getWordsCount", "initClose", "", "initDiyIcon", "initDocInfoText", "initIcon", "initNormalIcon", "initTitle", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setDocInfoText", "setIconInfo", "Companion", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.more.view2.a.b */
public final class MoreHeaderFragment extends C7667e {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f27677a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(MoreHeaderFragment.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;"))};

    /* renamed from: e */
    public static final Companion f27678e = new Companion(null);

    /* renamed from: b */
    public PageviewResult f27679b;

    /* renamed from: c */
    public PageViewResult f27680c;

    /* renamed from: d */
    public IconInfo f27681d;

    /* renamed from: f */
    private final Lazy f27682f = LazyKt.lazy(C10254f.INSTANCE);

    /* renamed from: g */
    private MoreViewModel f27683g;

    /* renamed from: h */
    private IHeaderView f27684h;

    /* renamed from: i */
    private HashMap f27685i;

    /* renamed from: a */
    public View mo39200a(int i) {
        if (this.f27685i == null) {
            this.f27685i = new HashMap();
        }
        View view = (View) this.f27685i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f27685i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public void mo39205c() {
        HashMap hashMap = this.f27685i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo39205c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/more/view2/header/MoreHeaderFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lcom/bytedance/ee/bear/more/view2/header/MoreHeaderFragment;", "activity", "Landroidx/fragment/app/FragmentActivity;", "args", "Landroid/os/Bundle;", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.view2.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MoreHeaderFragment mo39206a(FragmentActivity fragmentActivity, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            Fragment instantiate = Fragment.instantiate(fragmentActivity, MoreHeaderFragment.class.getName(), bundle);
            if (instantiate != null) {
                return (MoreHeaderFragment) instantiate;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.more.view2.header.MoreHeaderFragment");
        }
    }

    /* renamed from: a */
    public final IHeaderView mo39201a() {
        return this.f27684h;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.view2.a.b$f */
    static final class C10254f extends Lambda implements Function0<C10917c> {
        public static final C10254f INSTANCE = new C10254f();

        C10254f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    /* renamed from: d */
    private final IMoreInfo m42753d() {
        MoreViewModel fVar = this.f27683g;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return fVar.getMoreInfoLiveData().mo5927b();
    }

    /* renamed from: e */
    private final void m42754e() {
        if (C4211a.m17514a().mo16536a("spacekit.mobile.docs_diy_icon", false)) {
            m42756g();
        } else {
            m42757h();
        }
    }

    /* renamed from: f */
    private final void m42755f() {
        ((AppCompatImageView) mo39200a(R.id.close)).setOnClickListener(new C10250b(this));
    }

    /* renamed from: g */
    private final void m42756g() {
        MoreViewModel fVar = this.f27683g;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        IconInfo b = fVar.getIconInfoLiveData().mo5927b();
        this.f27681d = b;
        mo39202a(b);
        MoreViewModel fVar2 = this.f27683g;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        fVar2.getIconInfoLiveData().mo5923a(this, new C10251c(this));
    }

    /* renamed from: k */
    private final String m42760k() {
        Integer num;
        if (this.f27679b == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.Doc_Facade_WordsCount));
        PageviewResult pageviewResult = this.f27679b;
        if (pageviewResult != null) {
            num = Integer.valueOf(pageviewResult.getWordCount());
        } else {
            num = null;
        }
        sb.append(num);
        sb.append("  ");
        return sb.toString();
    }

    /* renamed from: l */
    private final String m42761l() {
        Integer num;
        if (this.f27680c == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.Doc_Facade_ReadingCount));
        PageViewResult pageViewResult = this.f27680c;
        if (pageViewResult != null) {
            num = Integer.valueOf(pageViewResult.pv);
        } else {
            num = null;
        }
        sb.append(num);
        sb.append("  ");
        return sb.toString();
    }

    /* renamed from: h */
    private final void m42757h() {
        int i;
        IMoreInfo d = m42753d();
        if (d != null) {
            int e = d.mo39036e();
            C8275a aVar = C8275a.f22377j;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.WIKI");
            if (e == aVar.mo32555b() || (d instanceof WikiMoreInfo)) {
                i = C7713a.m30840a(d.mo39057x(), d.mo39042i(), IconSize.SIZE_24);
            } else {
                C8275a aVar2 = C8275a.f22375h;
                Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.FILE");
                if (e == aVar2.mo32555b()) {
                    i = C7713a.m30842a(d.mo39038f(), IconSize.SIZE_24);
                } else if (!(d instanceof FolderMoreInfo) || !FolderVersion.Companion.mo32530b(d.mo39031c(), d.mo39009E())) {
                    i = C7713a.m30838a(e, IconSize.SIZE_24);
                } else {
                    i = C7713a.m30836a();
                }
            }
            ((LKUIRoundedImageView) mo39200a(R.id.icon)).setImageResource(i);
        }
    }

    /* renamed from: i */
    private final void m42758i() {
        String str;
        IMoreInfo d = m42753d();
        if (d != null) {
            TextView textView = (TextView) mo39200a(R.id.title);
            Intrinsics.checkExpressionValueIsNotNull(textView, "title");
            if (TextUtils.isEmpty(d.mo39042i())) {
                str = ((AbstractC8149a) KoinJavaComponent.m268613a(AbstractC8149a.class, null, null, 6, null)).mo31517c(getContext(), d.mo39036e());
            } else {
                str = d.mo39042i();
            }
            textView.setText(str);
        }
    }

    /* renamed from: o */
    private final String m42762o() {
        boolean z;
        String str;
        String str2;
        String str3;
        IMoreInfo d = m42753d();
        if (d == null) {
            return "";
        }
        int e = d.mo39036e();
        C8275a aVar = C8275a.f22370c;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FOLDER");
        boolean z2 = true;
        if (e == aVar.mo32555b()) {
            z = true;
        } else {
            z = false;
        }
        String c = C4484g.m18494b().mo17252c();
        String str4 = null;
        if (z) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                str3 = arguments.getString("owner_cn_name");
            } else {
                str3 = null;
            }
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                str4 = arguments2.getString("owner_en_name");
            }
            str = C13666a.m55443a(c, str3, str4);
        } else {
            PageViewResult pageViewResult = this.f27680c;
            if (pageViewResult != null) {
                str2 = pageViewResult.ownerName;
            } else {
                str2 = null;
            }
            PageViewResult pageViewResult2 = this.f27680c;
            if (pageViewResult2 != null) {
                str4 = pageViewResult2.ownerEnName;
            }
            str = C13666a.m55443a(c, str2, str4);
        }
        String str5 = str;
        if (!(str5 == null || str5.length() == 0)) {
            z2 = false;
        }
        if (z2) {
            return "";
        }
        String a = C10539a.m43639a(getContext(), R.string.Doc_More_Owner, "owner", str);
        Intrinsics.checkExpressionValueIsNotNull(a, "UIHelper.mustacheFormat(…ore_Owner, \"owner\", name)");
        return a;
    }

    /* renamed from: b */
    public final void mo39204b() {
        String str;
        IMoreInfo d = m42753d();
        if (d != null) {
            String o = m42762o();
            TextView textView = (TextView) mo39200a(R.id.info);
            Intrinsics.checkExpressionValueIsNotNull(textView, "info");
            int e = d.mo39036e();
            C8275a aVar = C8275a.f22371d;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
            if (e != aVar.mo32555b()) {
                C8275a aVar2 = C8275a.f22378k;
                Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.DOCX");
                if (e != aVar2.mo32555b()) {
                    C8275a aVar3 = C8275a.f22370c;
                    Intrinsics.checkExpressionValueIsNotNull(aVar3, "DocumentType.FOLDER");
                    if (e == aVar3.mo32555b()) {
                        str = o;
                    } else {
                        str = m42761l() + o;
                    }
                    textView.setText(str);
                }
            }
            str = m42760k() + m42761l() + o;
            textView.setText(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m42759j() {
        /*
        // Method dump skipped, instructions count: 173
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.more.view2.header.MoreHeaderFragment.m42759j():void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/more/view2/header/MoreHeaderFragment$initClose$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.view2.a.b$b */
    public static final class C10250b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ MoreHeaderFragment f27686a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10250b(MoreHeaderFragment bVar) {
            this.f27686a = bVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            IHeaderView a = this.f27686a.mo39201a();
            if (a != null) {
                a.mo39199f();
            }
        }
    }

    /* renamed from: a */
    public final void mo39203a(IHeaderView aVar) {
        this.f27684h = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/more/export/PageviewResult;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.view2.a.b$d */
    public static final class C10252d<T> implements AbstractC1178x<PageviewResult> {

        /* renamed from: a */
        final /* synthetic */ MoreHeaderFragment f27688a;

        C10252d(MoreHeaderFragment bVar) {
            this.f27688a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(PageviewResult pageviewResult) {
            this.f27688a.f27679b = pageviewResult;
            this.f27688a.mo39204b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/more/PageViewResult;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.view2.a.b$e */
    public static final class C10253e<T> implements AbstractC1178x<PageViewResult> {

        /* renamed from: a */
        final /* synthetic */ MoreHeaderFragment f27689a;

        C10253e(MoreHeaderFragment bVar) {
            this.f27689a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(PageViewResult pageViewResult) {
            this.f27689a.f27680c = pageViewResult;
            this.f27689a.mo39204b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/icon/IconInfo;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.view2.a.b$c */
    public static final class C10251c<T> implements AbstractC1178x<IconInfo> {

        /* renamed from: a */
        final /* synthetic */ MoreHeaderFragment f27687a;

        C10251c(MoreHeaderFragment bVar) {
            this.f27687a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(IconInfo iconInfo) {
            if (!Intrinsics.areEqual(this.f27687a.f27681d, iconInfo)) {
                this.f27687a.f27681d = iconInfo;
                this.f27687a.mo39202a(iconInfo);
            }
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        AbstractC1142af a = aj.m5366a(activity).mo6005a(MoreViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(ac…oreViewModel::class.java)");
        this.f27683g = (MoreViewModel) a;
    }

    /* renamed from: a */
    public final void mo39202a(IconInfo iconInfo) {
        if (iconInfo != null) {
            if (!(!IconInfo.isEmpty(iconInfo))) {
                iconInfo = null;
            }
            if (iconInfo != null) {
                IMoreInfo d = m42753d();
                if (d != null) {
                    ((AbstractC7588a) KoinJavaComponent.m268613a(AbstractC7588a.class, null, null, 6, null)).mo29856a(iconInfo.getKey(), iconInfo.getFs_unit(), C7713a.m30838a(d.mo39036e(), IconSize.SIZE_24), (LKUIRoundedImageView) mo39200a(R.id.icon), C4211a.m17514a().mo16536a("spacekit.mobile.docs_diy_icon", false));
                    return;
                }
                return;
            }
        }
        m42757h();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m42754e();
        m42755f();
        m42758i();
        m42759j();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.more_header_v2, viewGroup, false);
    }
}
