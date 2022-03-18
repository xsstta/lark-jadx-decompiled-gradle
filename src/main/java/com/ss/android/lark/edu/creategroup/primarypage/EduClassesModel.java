package com.ss.android.lark.edu.creategroup.primarypage;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/edu/creategroup/primarypage/EduClassesModel;", "Landroidx/lifecycle/ViewModel;", "()V", ShareHitPoint.f121868c, "Lcom/ss/android/lark/edu/creategroup/primarypage/EduClassesSource;", "getSource", "()Lcom/ss/android/lark/edu/creategroup/primarypage/EduClassesSource;", "source$delegate", "Lkotlin/Lazy;", "createClassesData", "Companion", "ViewModelFactory", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.edu.creategroup.primarypage.e */
public final class EduClassesModel extends AbstractC1142af {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EduClassesModel.class), ShareHitPoint.f121868c, "getSource()Lcom/ss/android/lark/edu/creategroup/primarypage/EduClassesSource;"))};
    public static final Companion Companion = new Companion(null);
    private final Lazy source$delegate = LazyKt.lazy(new C36943c(this));

    @JvmStatic
    public static final EduClassesModel get(FragmentActivity fragmentActivity) {
        return Companion.mo136355a(fragmentActivity);
    }

    public final EduClassesSource getSource() {
        Lazy lazy = this.source$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (EduClassesSource) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/edu/creategroup/primarypage/EduClassesModel$Companion;", "", "()V", "get", "Lcom/ss/android/lark/edu/creategroup/primarypage/EduClassesModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.primarypage.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final EduClassesModel mo136355a(FragmentActivity fragmentActivity) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            AbstractC1142af a = new C1144ai(fragmentActivity, ViewModelFactory.f94970a).mo6005a(EduClassesModel.class);
            Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProvider(activi…ClassesModel::class.java)");
            return (EduClassesModel) a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u0002H\u0004\"\n\b\u0000\u0010\u0004*\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/edu/creategroup/primarypage/EduClassesModel$ViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.primarypage.e$b */
    public static final class ViewModelFactory implements C1144ai.AbstractC1146b {

        /* renamed from: a */
        public static final ViewModelFactory f94970a = new ViewModelFactory();

        private ViewModelFactory() {
        }

        @Override // androidx.lifecycle.C1144ai.AbstractC1146b
        public <T extends AbstractC1142af> T create(Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "modelClass");
            return cls.newInstance();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/edu/creategroup/primarypage/EduClassesSource;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.primarypage.e$c */
    static final class C36943c extends Lambda implements Function0<EduClassesSource> {
        final /* synthetic */ EduClassesModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36943c(EduClassesModel eVar) {
            super(0);
            this.this$0 = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final EduClassesSource invoke() {
            return this.this$0.createClassesData();
        }
    }

    public final EduClassesSource createClassesData() {
        return new EduClassesSource();
    }
}
