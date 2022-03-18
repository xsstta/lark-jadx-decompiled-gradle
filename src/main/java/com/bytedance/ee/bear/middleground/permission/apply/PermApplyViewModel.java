package com.bytedance.ee.bear.middleground.permission.apply;

import android.app.Application;
import android.text.Spanned;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.permission.apply.ApplyDocPermPuller;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.util.p701d.C13615c;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 -2\u00020\u0001:\u0003-./B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(2\b\u0010*\u001a\u0004\u0018\u00010$J\u000e\u0010+\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u0007R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b \u0010!R\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00060"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/apply/PermApplyViewModel;", "Landroidx/lifecycle/ViewModel;", "params", "Lcom/bytedance/ee/bear/middleground/permission/apply/NoPermission;", "(Lcom/bytedance/ee/bear/middleground/permission/apply/NoPermission;)V", "_permType", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bytedance/ee/bear/middleground/permission/apply/PermApplyViewModel$PermType;", "get_permType", "()Landroidx/lifecycle/MutableLiveData;", "_permType$delegate", "Lkotlin/Lazy;", "appContext", "Landroid/app/Application;", "kotlin.jvm.PlatformType", "applyDocPermPuller", "Lcom/bytedance/ee/bear/middleground/permission/apply/ApplyDocPermPuller;", "getApplyDocPermPuller", "()Lcom/bytedance/ee/bear/middleground/permission/apply/ApplyDocPermPuller;", "applyDocPermPuller$delegate", "ownerText", "Landroid/text/Spanned;", "getOwnerText", "()Landroid/text/Spanned;", "getParams", "()Lcom/bytedance/ee/bear/middleground/permission/apply/NoPermission;", "permType", "Landroidx/lifecycle/LiveData;", "getPermType", "()Landroidx/lifecycle/LiveData;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "tipsText", "", "getTipsText", "()Ljava/lang/String;", "requestPerm", "Lio/reactivex/Flowable;", "", "msg", "setPermType", "", "Companion", "Factory", "PermType", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class PermApplyViewModel extends AbstractC1142af {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PermApplyViewModel.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PermApplyViewModel.class), "_permType", "get_permType()Landroidx/lifecycle/MutableLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PermApplyViewModel.class), "applyDocPermPuller", "getApplyDocPermPuller()Lcom/bytedance/ee/bear/middleground/permission/apply/ApplyDocPermPuller;"))};
    public static final Companion Companion = new Companion(null);
    private final Lazy _permType$delegate = LazyKt.lazy(C9549c.INSTANCE);
    private final Application appContext;
    private final Lazy applyDocPermPuller$delegate;
    private final Spanned ownerText;
    private final NoPermission params;
    private final Lazy serviceContext$delegate = LazyKt.lazy(C9552f.INSTANCE);
    private final String tipsText;

    @JvmStatic
    public static final PermApplyViewModel get(Fragment fragment, NoPermission noPermission) {
        return Companion.mo36604a(fragment, noPermission);
    }

    private final ApplyDocPermPuller getApplyDocPermPuller() {
        Lazy lazy = this.applyDocPermPuller$delegate;
        KProperty kProperty = $$delegatedProperties[2];
        return (ApplyDocPermPuller) lazy.getValue();
    }

    private final C10917c getServiceContext() {
        Lazy lazy = this.serviceContext$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (C10917c) lazy.getValue();
    }

    private final C1177w<PermType> get_permType() {
        Lazy lazy = this._permType$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (C1177w) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/apply/PermApplyViewModel$PermType;", "", "code", "", "(Ljava/lang/String;II)V", "getCode", "()I", "getText", "", "READ", "EDIT", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    public enum PermType {
        READ(1),
        EDIT(4);
        
        private final int code;

        public final int getCode() {
            return this.code;
        }

        public final String getText() {
            int i = this.code;
            if (i == 1) {
                String string = C13615c.f35773a.getString(R.string.Doc_Facade_ReadPermission);
                Intrinsics.checkExpressionValueIsNotNull(string, "ContextUtils.baseApplica…oc_Facade_ReadPermission)");
                return string;
            } else if (i != 4) {
                return "";
            } else {
                String string2 = C13615c.f35773a.getString(R.string.Doc_Facade_EditPermission);
                Intrinsics.checkExpressionValueIsNotNull(string2, "ContextUtils.baseApplica…oc_Facade_EditPermission)");
                return string2;
            }
        }

        private PermType(int i) {
            this.code = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/apply/PermApplyViewModel$Companion;", "", "()V", "get", "Lcom/bytedance/ee/bear/middleground/permission/apply/PermApplyViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "params", "Lcom/bytedance/ee/bear/middleground/permission/apply/NoPermission;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.PermApplyViewModel$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final PermApplyViewModel mo36604a(Fragment fragment, NoPermission noPermission) {
            Intrinsics.checkParameterIsNotNull(fragment, "fragment");
            Intrinsics.checkParameterIsNotNull(noPermission, "params");
            AbstractC1142af a = aj.m5365a(fragment, new Factory(noPermission)).mo6005a(PermApplyViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(fr…plyViewModel::class.java)");
            return (PermApplyViewModel) a;
        }
    }

    public final Spanned getOwnerText() {
        return this.ownerText;
    }

    public final NoPermission getParams() {
        return this.params;
    }

    public final String getTipsText() {
        return this.tipsText;
    }

    public final LiveData<PermType> getPermType() {
        return get_permType();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bytedance/ee/bear/middleground/permission/apply/PermApplyViewModel$PermType;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.PermApplyViewModel$c */
    static final class C9549c extends Lambda implements Function0<C1177w<PermType>> {
        public static final C9549c INSTANCE = new C9549c();

        C9549c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C1177w<PermType> invoke() {
            C1177w<PermType> wVar = new C1177w<>();
            wVar.mo5929b(PermType.READ);
            return wVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground/permission/apply/ApplyDocPermPuller;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.PermApplyViewModel$d */
    static final class C9550d extends Lambda implements Function0<ApplyDocPermPuller> {
        public static final C9550d INSTANCE = new C9550d();

        C9550d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ApplyDocPermPuller invoke() {
            return new ApplyDocPermPuller((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.PermApplyViewModel$f */
    static final class C9552f extends Lambda implements Function0<C10917c> {
        public static final C9552f INSTANCE = new C9552f();

        C9552f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J'\u0010\u0007\u001a\u0002H\b\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/apply/PermApplyViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "params", "Lcom/bytedance/ee/bear/middleground/permission/apply/NoPermission;", "(Lcom/bytedance/ee/bear/middleground/permission/apply/NoPermission;)V", "getParams", "()Lcom/bytedance/ee/bear/middleground/permission/apply/NoPermission;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.PermApplyViewModel$b */
    public static final class Factory implements C1144ai.AbstractC1146b {

        /* renamed from: a */
        private final NoPermission f25638a;

        public Factory(NoPermission noPermission) {
            Intrinsics.checkParameterIsNotNull(noPermission, "params");
            this.f25638a = noPermission;
        }

        @Override // androidx.lifecycle.C1144ai.AbstractC1146b
        public <T extends AbstractC1142af> T create(Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "modelClass");
            return cls.getConstructor(NoPermission.class).newInstance(this.f25638a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground/permission/apply/ApplyDocPermPuller$Result;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.PermApplyViewModel$e */
    static final class C9551e<T, R> implements Function<T, R> {

        /* renamed from: a */
        public static final C9551e f25639a = new C9551e();

        C9551e() {
        }

        /* renamed from: a */
        public final boolean mo36605a(ApplyDocPermPuller.Result result) {
            Intrinsics.checkParameterIsNotNull(result, "it");
            return true;
        }

        @Override // io.reactivex.functions.Function
        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo36605a((ApplyDocPermPuller.Result) obj));
        }
    }

    public final void setPermType(PermType permType) {
        Intrinsics.checkParameterIsNotNull(permType, "permType");
        get_permType().mo5929b(permType);
    }

    public final AbstractC68307f<Boolean> requestPerm(String str) {
        String valueOf;
        ApplyDocPermPuller applyDocPermPuller = getApplyDocPermPuller();
        String token = this.params.getToken();
        String documentType = this.params.getDocumentType();
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        PermType b = get_permType().mo5927b();
        if (!(b == null || (valueOf = String.valueOf(b.getCode())) == null)) {
            str2 = valueOf;
        }
        AbstractC68307f<Boolean> d = applyDocPermPuller.mo36701a(new ApplyDocPermPuller.Params(token, documentType, str, str2)).mo238020d(C9551e.f25639a);
        Intrinsics.checkExpressionValueIsNotNull(d, "applyDocPermPuller\n     …            .map { true }");
        return d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x00cf, code lost:
        if (r9 != null) goto L_0x00dd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PermApplyViewModel(com.bytedance.ee.bear.middleground.permission.apply.NoPermission r9) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.permission.apply.PermApplyViewModel.<init>(com.bytedance.ee.bear.middleground.permission.apply.NoPermission):void");
    }
}
