package kotlin.reflect.jvm.internal.impl.renderer;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbbreviatedType;
import kotlin.reflect.jvm.internal.impl.types.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnresolvedType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.WrappedType;
import kotlin.text.StringsKt;

public final class DescriptorRendererImpl extends DescriptorRenderer implements DescriptorRendererOptions {
    private final Lazy functionTypeAnnotationsRenderer$delegate;
    private final Lazy functionTypeParameterTypesRenderer$delegate;
    private final DescriptorRendererOptionsImpl options;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[RenderingFormat.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[RenderingFormat.PLAIN.ordinal()] = 1;
            iArr[RenderingFormat.HTML.ordinal()] = 2;
            int[] iArr2 = new int[RenderingFormat.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[RenderingFormat.PLAIN.ordinal()] = 1;
            iArr2[RenderingFormat.HTML.ordinal()] = 2;
            int[] iArr3 = new int[RenderingFormat.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[RenderingFormat.PLAIN.ordinal()] = 1;
            iArr3[RenderingFormat.HTML.ordinal()] = 2;
            int[] iArr4 = new int[RenderingFormat.values().length];
            $EnumSwitchMapping$3 = iArr4;
            iArr4[RenderingFormat.PLAIN.ordinal()] = 1;
            iArr4[RenderingFormat.HTML.ordinal()] = 2;
            int[] iArr5 = new int[ParameterNameRenderingPolicy.values().length];
            $EnumSwitchMapping$4 = iArr5;
            iArr5[ParameterNameRenderingPolicy.ALL.ordinal()] = 1;
            iArr5[ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            iArr5[ParameterNameRenderingPolicy.NONE.ordinal()] = 3;
        }
    }

    private final DescriptorRendererImpl getFunctionTypeAnnotationsRenderer() {
        return (DescriptorRendererImpl) this.functionTypeAnnotationsRenderer$delegate.getValue();
    }

    private final DescriptorRenderer getFunctionTypeParameterTypesRenderer() {
        return (DescriptorRenderer) this.functionTypeParameterTypesRenderer$delegate.getValue();
    }

    public boolean getActualPropertiesInPrimaryConstructor() {
        return this.options.getActualPropertiesInPrimaryConstructor();
    }

    public boolean getAlwaysRenderModifiers() {
        return this.options.getAlwaysRenderModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return this.options.getAnnotationArgumentsRenderingPolicy();
    }

    public Function1<AnnotationDescriptor, Boolean> getAnnotationFilter() {
        return this.options.getAnnotationFilter();
    }

    public boolean getBoldOnlyForNamesInHtml() {
        return this.options.getBoldOnlyForNamesInHtml();
    }

    public boolean getClassWithPrimaryConstructor() {
        return this.options.getClassWithPrimaryConstructor();
    }

    public ClassifierNamePolicy getClassifierNamePolicy() {
        return this.options.getClassifierNamePolicy();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getDebugMode() {
        return this.options.getDebugMode();
    }

    public Function1<ValueParameterDescriptor, String> getDefaultParameterValueRenderer() {
        return this.options.getDefaultParameterValueRenderer();
    }

    public boolean getEachAnnotationOnNewLine() {
        return this.options.getEachAnnotationOnNewLine();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getEnhancedTypes() {
        return this.options.getEnhancedTypes();
    }

    public Set<FqName> getExcludedAnnotationClasses() {
        return this.options.getExcludedAnnotationClasses();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public Set<FqName> getExcludedTypeAnnotationClasses() {
        return this.options.getExcludedTypeAnnotationClasses();
    }

    public boolean getIncludeAdditionalModifiers() {
        return this.options.getIncludeAdditionalModifiers();
    }

    public boolean getIncludeAnnotationArguments() {
        return this.options.getIncludeAnnotationArguments();
    }

    public boolean getIncludeEmptyAnnotationArguments() {
        return this.options.getIncludeEmptyAnnotationArguments();
    }

    public boolean getIncludePropertyConstant() {
        return this.options.getIncludePropertyConstant();
    }

    public boolean getInformativeErrorType() {
        return this.options.getInformativeErrorType();
    }

    public Set<DescriptorRendererModifier> getModifiers() {
        return this.options.getModifiers();
    }

    public boolean getNormalizedVisibilities() {
        return this.options.getNormalizedVisibilities();
    }

    public OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return this.options.getOverrideRenderingPolicy();
    }

    public ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return this.options.getParameterNameRenderingPolicy();
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return this.options.getParameterNamesInFunctionalTypes();
    }

    public boolean getPresentableUnresolvedTypes() {
        return this.options.getPresentableUnresolvedTypes();
    }

    public PropertyAccessorRenderingPolicy getPropertyAccessorRenderingPolicy() {
        return this.options.getPropertyAccessorRenderingPolicy();
    }

    public boolean getReceiverAfterName() {
        return this.options.getReceiverAfterName();
    }

    public boolean getRenderCompanionObjectName() {
        return this.options.getRenderCompanionObjectName();
    }

    public boolean getRenderConstructorDelegation() {
        return this.options.getRenderConstructorDelegation();
    }

    public boolean getRenderConstructorKeyword() {
        return this.options.getRenderConstructorKeyword();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return this.options.getRenderDefaultAnnotationArguments();
    }

    public boolean getRenderDefaultModality() {
        return this.options.getRenderDefaultModality();
    }

    public boolean getRenderDefaultVisibility() {
        return this.options.getRenderDefaultVisibility();
    }

    public boolean getRenderPrimaryConstructorParametersAsProperties() {
        return this.options.getRenderPrimaryConstructorParametersAsProperties();
    }

    public boolean getRenderTypeExpansions() {
        return this.options.getRenderTypeExpansions();
    }

    public boolean getRenderUnabbreviatedType() {
        return this.options.getRenderUnabbreviatedType();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return this.options.getSecondaryConstructorsAsPrimary();
    }

    public boolean getStartFromDeclarationKeyword() {
        return this.options.getStartFromDeclarationKeyword();
    }

    public boolean getStartFromName() {
        return this.options.getStartFromName();
    }

    public RenderingFormat getTextFormat() {
        return this.options.getTextFormat();
    }

    public Function1<KotlinType, KotlinType> getTypeNormalizer() {
        return this.options.getTypeNormalizer();
    }

    public boolean getUninferredTypeParameterAsName() {
        return this.options.getUninferredTypeParameterAsName();
    }

    public boolean getUnitReturnType() {
        return this.options.getUnitReturnType();
    }

    public DescriptorRenderer.ValueParametersHandler getValueParametersHandler() {
        return this.options.getValueParametersHandler();
    }

    public boolean getVerbose() {
        return this.options.getVerbose();
    }

    public boolean getWithDefinedIn() {
        return this.options.getWithDefinedIn();
    }

    public boolean getWithSourceFileForTopLevel() {
        return this.options.getWithSourceFileForTopLevel();
    }

    public boolean getWithoutReturnType() {
        return this.options.getWithoutReturnType();
    }

    public boolean getWithoutSuperTypes() {
        return this.options.getWithoutSuperTypes();
    }

    public boolean getWithoutTypeParameters() {
        return this.options.getWithoutTypeParameters();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setAnnotationArgumentsRenderingPolicy(AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        Intrinsics.checkParameterIsNotNull(annotationArgumentsRenderingPolicy, "<set-?>");
        this.options.setAnnotationArgumentsRenderingPolicy(annotationArgumentsRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setClassifierNamePolicy(ClassifierNamePolicy classifierNamePolicy) {
        Intrinsics.checkParameterIsNotNull(classifierNamePolicy, "<set-?>");
        this.options.setClassifierNamePolicy(classifierNamePolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setDebugMode(boolean z) {
        this.options.setDebugMode(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setExcludedTypeAnnotationClasses(Set<FqName> set) {
        Intrinsics.checkParameterIsNotNull(set, "<set-?>");
        this.options.setExcludedTypeAnnotationClasses(set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setModifiers(Set<? extends DescriptorRendererModifier> set) {
        Intrinsics.checkParameterIsNotNull(set, "<set-?>");
        this.options.setModifiers(set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setParameterNameRenderingPolicy(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        Intrinsics.checkParameterIsNotNull(parameterNameRenderingPolicy, "<set-?>");
        this.options.setParameterNameRenderingPolicy(parameterNameRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setReceiverAfterName(boolean z) {
        this.options.setReceiverAfterName(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setRenderCompanionObjectName(boolean z) {
        this.options.setRenderCompanionObjectName(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setStartFromName(boolean z) {
        this.options.setStartFromName(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setTextFormat(RenderingFormat renderingFormat) {
        Intrinsics.checkParameterIsNotNull(renderingFormat, "<set-?>");
        this.options.setTextFormat(renderingFormat);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setVerbose(boolean z) {
        this.options.setVerbose(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithDefinedIn(boolean z) {
        this.options.setWithDefinedIn(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutSuperTypes(boolean z) {
        this.options.setWithoutSuperTypes(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutTypeParameters(boolean z) {
        this.options.setWithoutTypeParameters(z);
    }

    public final DescriptorRendererOptionsImpl getOptions() {
        return this.options;
    }

    private final String gt() {
        return escape(">");
    }

    private final String lt() {
        return escape("<");
    }

    private final String arrow() {
        int i = WhenMappings.$EnumSwitchMapping$2[getTextFormat().ordinal()];
        if (i == 1) {
            return escape("->");
        }
        if (i == 2) {
            return "&rarr;";
        }
        throw new NoWhenBranchMatchedException();
    }

    private final class RenderDeclarationDescriptorVisitor implements DeclarationDescriptorVisitor<Unit, StringBuilder> {

        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PropertyAccessorRenderingPolicy.values().length];
                $EnumSwitchMapping$0 = iArr;
                iArr[PropertyAccessorRenderingPolicy.PRETTY.ordinal()] = 1;
                iArr[PropertyAccessorRenderingPolicy.DEBUG.ordinal()] = 2;
                iArr[PropertyAccessorRenderingPolicy.NONE.ordinal()] = 3;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public RenderDeclarationDescriptorVisitor() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, java.lang.Object] */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitClassDescriptor(ClassDescriptor classDescriptor, StringBuilder sb) {
            visitClassDescriptor(classDescriptor, sb);
            return Unit.INSTANCE;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor, java.lang.Object] */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitConstructorDescriptor(ConstructorDescriptor constructorDescriptor, StringBuilder sb) {
            visitConstructorDescriptor(constructorDescriptor, sb);
            return Unit.INSTANCE;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.Object] */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitFunctionDescriptor(FunctionDescriptor functionDescriptor, StringBuilder sb) {
            visitFunctionDescriptor(functionDescriptor, sb);
            return Unit.INSTANCE;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor, java.lang.Object] */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitModuleDeclaration(ModuleDescriptor moduleDescriptor, StringBuilder sb) {
            visitModuleDeclaration(moduleDescriptor, sb);
            return Unit.INSTANCE;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor, java.lang.Object] */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPackageFragmentDescriptor(PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb) {
            visitPackageFragmentDescriptor(packageFragmentDescriptor, sb);
            return Unit.INSTANCE;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor, java.lang.Object] */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPackageViewDescriptor(PackageViewDescriptor packageViewDescriptor, StringBuilder sb) {
            visitPackageViewDescriptor(packageViewDescriptor, sb);
            return Unit.INSTANCE;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor, java.lang.Object] */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPropertyDescriptor(PropertyDescriptor propertyDescriptor, StringBuilder sb) {
            visitPropertyDescriptor(propertyDescriptor, sb);
            return Unit.INSTANCE;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor, java.lang.Object] */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPropertyGetterDescriptor(PropertyGetterDescriptor propertyGetterDescriptor, StringBuilder sb) {
            visitPropertyGetterDescriptor(propertyGetterDescriptor, sb);
            return Unit.INSTANCE;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor, java.lang.Object] */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPropertySetterDescriptor(PropertySetterDescriptor propertySetterDescriptor, StringBuilder sb) {
            visitPropertySetterDescriptor(propertySetterDescriptor, sb);
            return Unit.INSTANCE;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor, java.lang.Object] */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitReceiverParameterDescriptor(ReceiverParameterDescriptor receiverParameterDescriptor, StringBuilder sb) {
            visitReceiverParameterDescriptor(receiverParameterDescriptor, sb);
            return Unit.INSTANCE;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor, java.lang.Object] */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitTypeAliasDescriptor(TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb) {
            visitTypeAliasDescriptor(typeAliasDescriptor, sb);
            return Unit.INSTANCE;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, java.lang.Object] */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitTypeParameterDescriptor(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb) {
            visitTypeParameterDescriptor(typeParameterDescriptor, sb);
            return Unit.INSTANCE;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor, java.lang.Object] */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitValueParameterDescriptor(ValueParameterDescriptor valueParameterDescriptor, StringBuilder sb) {
            visitValueParameterDescriptor(valueParameterDescriptor, sb);
            return Unit.INSTANCE;
        }

        public void visitClassDescriptor(ClassDescriptor classDescriptor, StringBuilder sb) {
            Intrinsics.checkParameterIsNotNull(classDescriptor, "descriptor");
            Intrinsics.checkParameterIsNotNull(sb, "builder");
            DescriptorRendererImpl.this.renderClass(classDescriptor, sb);
        }

        public void visitConstructorDescriptor(ConstructorDescriptor constructorDescriptor, StringBuilder sb) {
            Intrinsics.checkParameterIsNotNull(constructorDescriptor, "constructorDescriptor");
            Intrinsics.checkParameterIsNotNull(sb, "builder");
            DescriptorRendererImpl.this.renderConstructor(constructorDescriptor, sb);
        }

        public void visitFunctionDescriptor(FunctionDescriptor functionDescriptor, StringBuilder sb) {
            Intrinsics.checkParameterIsNotNull(functionDescriptor, "descriptor");
            Intrinsics.checkParameterIsNotNull(sb, "builder");
            DescriptorRendererImpl.this.renderFunction(functionDescriptor, sb);
        }

        public void visitPackageFragmentDescriptor(PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb) {
            Intrinsics.checkParameterIsNotNull(packageFragmentDescriptor, "descriptor");
            Intrinsics.checkParameterIsNotNull(sb, "builder");
            DescriptorRendererImpl.this.renderPackageFragment(packageFragmentDescriptor, sb);
        }

        public void visitPackageViewDescriptor(PackageViewDescriptor packageViewDescriptor, StringBuilder sb) {
            Intrinsics.checkParameterIsNotNull(packageViewDescriptor, "descriptor");
            Intrinsics.checkParameterIsNotNull(sb, "builder");
            DescriptorRendererImpl.this.renderPackageView(packageViewDescriptor, sb);
        }

        public void visitPropertyDescriptor(PropertyDescriptor propertyDescriptor, StringBuilder sb) {
            Intrinsics.checkParameterIsNotNull(propertyDescriptor, "descriptor");
            Intrinsics.checkParameterIsNotNull(sb, "builder");
            DescriptorRendererImpl.this.renderProperty(propertyDescriptor, sb);
        }

        public void visitTypeAliasDescriptor(TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb) {
            Intrinsics.checkParameterIsNotNull(typeAliasDescriptor, "descriptor");
            Intrinsics.checkParameterIsNotNull(sb, "builder");
            DescriptorRendererImpl.this.renderTypeAlias(typeAliasDescriptor, sb);
        }

        public void visitModuleDeclaration(ModuleDescriptor moduleDescriptor, StringBuilder sb) {
            Intrinsics.checkParameterIsNotNull(moduleDescriptor, "descriptor");
            Intrinsics.checkParameterIsNotNull(sb, "builder");
            DescriptorRendererImpl.this.renderName(moduleDescriptor, sb, true);
        }

        public void visitPropertyGetterDescriptor(PropertyGetterDescriptor propertyGetterDescriptor, StringBuilder sb) {
            Intrinsics.checkParameterIsNotNull(propertyGetterDescriptor, "descriptor");
            Intrinsics.checkParameterIsNotNull(sb, "builder");
            visitPropertyAccessorDescriptor(propertyGetterDescriptor, sb, "getter");
        }

        public void visitPropertySetterDescriptor(PropertySetterDescriptor propertySetterDescriptor, StringBuilder sb) {
            Intrinsics.checkParameterIsNotNull(propertySetterDescriptor, "descriptor");
            Intrinsics.checkParameterIsNotNull(sb, "builder");
            visitPropertyAccessorDescriptor(propertySetterDescriptor, sb, "setter");
        }

        public void visitReceiverParameterDescriptor(ReceiverParameterDescriptor receiverParameterDescriptor, StringBuilder sb) {
            Intrinsics.checkParameterIsNotNull(receiverParameterDescriptor, "descriptor");
            Intrinsics.checkParameterIsNotNull(sb, "builder");
            sb.append(receiverParameterDescriptor.getName());
        }

        public void visitTypeParameterDescriptor(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb) {
            Intrinsics.checkParameterIsNotNull(typeParameterDescriptor, "descriptor");
            Intrinsics.checkParameterIsNotNull(sb, "builder");
            DescriptorRendererImpl.this.renderTypeParameter(typeParameterDescriptor, sb, true);
        }

        public void visitValueParameterDescriptor(ValueParameterDescriptor valueParameterDescriptor, StringBuilder sb) {
            Intrinsics.checkParameterIsNotNull(valueParameterDescriptor, "descriptor");
            Intrinsics.checkParameterIsNotNull(sb, "builder");
            DescriptorRendererImpl.this.renderValueParameter(valueParameterDescriptor, true, sb, true);
        }

        private final void visitPropertyAccessorDescriptor(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder sb, String str) {
            int i = WhenMappings.$EnumSwitchMapping$0[DescriptorRendererImpl.this.getPropertyAccessorRenderingPolicy().ordinal()];
            if (i == 1) {
                DescriptorRendererImpl.this.renderAccessorModifiers(propertyAccessorDescriptor, sb);
                sb.append(str + " for ");
                DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
                PropertyDescriptor correspondingProperty = propertyAccessorDescriptor.getCorrespondingProperty();
                Intrinsics.checkExpressionValueIsNotNull(correspondingProperty, "descriptor.correspondingProperty");
                descriptorRendererImpl.renderProperty(correspondingProperty, sb);
            } else if (i == 2) {
                visitFunctionDescriptor((FunctionDescriptor) propertyAccessorDescriptor, sb);
            }
        }
    }

    private final String escape(String str) {
        return getTextFormat().escape(str);
    }

    private final boolean overridesSomething(CallableMemberDescriptor callableMemberDescriptor) {
        return !callableMemberDescriptor.getOverriddenDescriptors().isEmpty();
    }

    private final String renderFqName(List<Name> list) {
        return escape(RenderingUtilsKt.renderFqName(list));
    }

    private final boolean hasModifiersOrAnnotations(KotlinType kotlinType) {
        if (FunctionTypesKt.isSuspendFunctionType(kotlinType) || !kotlinType.getAnnotations().isEmpty()) {
            return true;
        }
        return false;
    }

    private final void renderSpaceIfNeeded(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderFqName(FqNameUnsafe fqNameUnsafe) {
        Intrinsics.checkParameterIsNotNull(fqNameUnsafe, "fqName");
        List<Name> pathSegments = fqNameUnsafe.pathSegments();
        Intrinsics.checkExpressionValueIsNotNull(pathSegments, "fqName.pathSegments()");
        return renderFqName(pathSegments);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderTypeProjection(TypeProjection typeProjection) {
        Intrinsics.checkParameterIsNotNull(typeProjection, "typeProjection");
        StringBuilder sb = new StringBuilder();
        appendTypeProjections(sb, CollectionsKt.listOf(typeProjection));
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public DescriptorRendererImpl(DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        Intrinsics.checkParameterIsNotNull(descriptorRendererOptionsImpl, "options");
        this.options = descriptorRendererOptionsImpl;
        boolean isLocked = descriptorRendererOptionsImpl.isLocked();
        if (!_Assertions.f173221a || isLocked) {
            this.functionTypeAnnotationsRenderer$delegate = LazyKt.lazy(new DescriptorRendererImpl$functionTypeAnnotationsRenderer$2(this));
            this.functionTypeParameterTypesRenderer$delegate = LazyKt.lazy(new DescriptorRendererImpl$functionTypeParameterTypesRenderer$2(this));
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    private final String renderError(String str) {
        int i = WhenMappings.$EnumSwitchMapping$1[getTextFormat().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            return "<font color=red><b>" + str + "</b></font>";
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String renderKeyword(String str) {
        int i = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        } else if (getBoldOnlyForNamesInHtml()) {
            return str;
        } else {
            return "<b>" + str + "</b>";
        }
    }

    private final boolean shouldRenderAsPrettyFunctionType(KotlinType kotlinType) {
        boolean z;
        if (!FunctionTypesKt.isBuiltinFunctionalType(kotlinType)) {
            return false;
        }
        List<TypeProjection> arguments = kotlinType.getArguments();
        if (!(arguments instanceof Collection) || !arguments.isEmpty()) {
            Iterator<T> it = arguments.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().isStarProjection()) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return true;
        }
        return false;
    }

    private final boolean shouldRenderParameterNames(boolean z) {
        int i = WhenMappings.$EnumSwitchMapping$4[getParameterNameRenderingPolicy().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            } else if (!z) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String render(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkParameterIsNotNull(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        declarationDescriptor.accept(new RenderDeclarationDescriptorVisitor(), sb);
        if (getWithDefinedIn()) {
            appendDefinedIn(sb, declarationDescriptor);
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public String renderClassifierName(ClassifierDescriptor classifierDescriptor) {
        Intrinsics.checkParameterIsNotNull(classifierDescriptor, "klass");
        if (ErrorUtils.isError(classifierDescriptor)) {
            return classifierDescriptor.getTypeConstructor().toString();
        }
        return getClassifierNamePolicy().renderClassifier(classifierDescriptor, this);
    }

    public String renderMessage(String str) {
        Intrinsics.checkParameterIsNotNull(str, "message");
        int i = WhenMappings.$EnumSwitchMapping$3[getTextFormat().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            return "<i>" + str + "</i>";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderType(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, ShareHitPoint.f121869d);
        StringBuilder sb = new StringBuilder();
        renderNormalizedType(sb, getTypeNormalizer().invoke(kotlinType));
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public String renderTypeArguments(List<? extends TypeProjection> list) {
        Intrinsics.checkParameterIsNotNull(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(lt());
        appendTypeProjections(sb, list);
        sb.append(gt());
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private final Modality implicitModalityWithoutExtensions(MemberDescriptor memberDescriptor) {
        if (!(memberDescriptor instanceof ClassDescriptor)) {
            DeclarationDescriptor containingDeclaration = memberDescriptor.getContainingDeclaration();
            if (!(containingDeclaration instanceof ClassDescriptor)) {
                containingDeclaration = null;
            }
            ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
            if (classDescriptor == null) {
                return Modality.FINAL;
            }
            if (!(memberDescriptor instanceof CallableMemberDescriptor)) {
                return Modality.FINAL;
            }
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) memberDescriptor;
            Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
            Intrinsics.checkExpressionValueIsNotNull(overriddenDescriptors, "this.overriddenDescriptors");
            if ((!overriddenDescriptors.isEmpty()) && classDescriptor.getModality() != Modality.FINAL) {
                return Modality.OPEN;
            }
            if (classDescriptor.getKind() != ClassKind.INTERFACE || !(!Intrinsics.areEqual(callableMemberDescriptor.getVisibility(), Visibilities.PRIVATE))) {
                return Modality.FINAL;
            }
            if (callableMemberDescriptor.getModality() == Modality.ABSTRACT) {
                return Modality.ABSTRACT;
            }
            return Modality.OPEN;
        } else if (((ClassDescriptor) memberDescriptor).getKind() == ClassKind.INTERFACE) {
            return Modality.ABSTRACT;
        } else {
            return Modality.FINAL;
        }
    }

    public String renderTypeConstructor(TypeConstructor typeConstructor) {
        Intrinsics.checkParameterIsNotNull(typeConstructor, "typeConstructor");
        ClassifierDescriptor declarationDescriptor = typeConstructor.getDeclarationDescriptor();
        if ((declarationDescriptor instanceof TypeParameterDescriptor) || (declarationDescriptor instanceof ClassDescriptor) || (declarationDescriptor instanceof TypeAliasDescriptor)) {
            return renderClassifierName(declarationDescriptor);
        }
        if (declarationDescriptor == null) {
            return typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + declarationDescriptor.getClass()).toString());
    }

    public final String renderConstant(ConstantValue<?> constantValue) {
        if (constantValue instanceof ArrayValue) {
            return CollectionsKt.joinToString$default((Iterable) ((ArrayValue) constantValue).getValue(), ", ", "{", "}", 0, null, new DescriptorRendererImpl$renderConstant$1(this), 24, null);
        }
        if (constantValue instanceof AnnotationValue) {
            return StringsKt.removePrefix(DescriptorRenderer.renderAnnotation$default(this, (AnnotationDescriptor) ((AnnotationValue) constantValue).getValue(), null, 2, null), (CharSequence) "@");
        }
        if (!(constantValue instanceof KClassValue)) {
            return constantValue.toString();
        }
        KClassValue.Value value = (KClassValue.Value) ((KClassValue) constantValue).getValue();
        if (value instanceof KClassValue.Value.LocalClass) {
            return ((KClassValue.Value.LocalClass) value).getType() + "::class";
        } else if (value instanceof KClassValue.Value.NormalClass) {
            KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) value;
            String asString = normalClass.getClassId().asSingleFqName().asString();
            Intrinsics.checkExpressionValueIsNotNull(asString, "classValue.classId.asSingleFqName().asString()");
            for (int i = 0; i < normalClass.getArrayDimensions(); i++) {
                asString = "kotlin.Array<" + asString + '>';
            }
            return asString + "::class";
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final List<String> renderAndSortAnnotationArguments(AnnotationDescriptor annotationDescriptor) {
        String str;
        ClassConstructorDescriptor unsubstitutedPrimaryConstructor;
        List<ValueParameterDescriptor> valueParameters;
        Map<Name, ConstantValue<?>> allValueArguments = annotationDescriptor.getAllValueArguments();
        ArrayList arrayList = null;
        ClassDescriptor annotationClass = getRenderDefaultAnnotationArguments() ? DescriptorUtilsKt.getAnnotationClass(annotationDescriptor) : null;
        if (!(annotationClass == null || (unsubstitutedPrimaryConstructor = annotationClass.getUnsubstitutedPrimaryConstructor()) == null || (valueParameters = unsubstitutedPrimaryConstructor.getValueParameters()) == null)) {
            ArrayList arrayList2 = new ArrayList();
            for (T t : valueParameters) {
                if (t.declaresDefaultValue()) {
                    arrayList2.add(t);
                }
            }
            ArrayList<ValueParameterDescriptor> arrayList3 = arrayList2;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            for (ValueParameterDescriptor valueParameterDescriptor : arrayList3) {
                Intrinsics.checkExpressionValueIsNotNull(valueParameterDescriptor, "it");
                arrayList4.add(valueParameterDescriptor.getName());
            }
            arrayList = arrayList4;
        }
        if (arrayList == null) {
            arrayList = CollectionsKt.emptyList();
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj : arrayList) {
            if (!allValueArguments.containsKey((Name) obj)) {
                arrayList5.add(obj);
            }
        }
        ArrayList arrayList6 = arrayList5;
        ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
        Iterator it = arrayList6.iterator();
        while (it.hasNext()) {
            arrayList7.add(((Name) it.next()).asString() + " = ...");
        }
        ArrayList arrayList8 = arrayList7;
        Set<Map.Entry<Name, ConstantValue<?>>> entrySet = allValueArguments.entrySet();
        ArrayList arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(entrySet, 10));
        for (T t2 : entrySet) {
            Name name = (Name) t2.getKey();
            ConstantValue<?> constantValue = (ConstantValue) t2.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(name.asString());
            sb.append(" = ");
            if (!arrayList.contains(name)) {
                str = renderConstant(constantValue);
            } else {
                str = "...";
            }
            sb.append(str);
            arrayList9.add(sb.toString());
        }
        return CollectionsKt.sorted(CollectionsKt.plus((Collection) arrayList8, (Iterable) arrayList9));
    }

    public final void renderAccessorModifiers(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder sb) {
        renderMemberModifiers(propertyAccessorDescriptor, sb);
    }

    private final void renderClassKindPrefix(ClassDescriptor classDescriptor, StringBuilder sb) {
        sb.append(renderKeyword(DescriptorRenderer.Companion.getClassifierKindPrefix(classDescriptor)));
    }

    private final void renderSuspendModifier(FunctionDescriptor functionDescriptor, StringBuilder sb) {
        renderModifier(sb, functionDescriptor.isSuspend(), "suspend");
    }

    private final void appendTypeProjections(StringBuilder sb, List<? extends TypeProjection> list) {
        CollectionsKt.joinTo$default(list, sb, ", ", null, null, 0, null, new DescriptorRendererImpl$appendTypeProjections$1(this), 60, null);
    }

    public final void renderPackageFragment(PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb) {
        renderPackageHeader(packageFragmentDescriptor.getFqName(), "package-fragment", sb);
        if (getDebugMode()) {
            sb.append(" in ");
            renderName(packageFragmentDescriptor.getContainingDeclaration(), sb, false);
        }
    }

    public final void renderPackageView(PackageViewDescriptor packageViewDescriptor, StringBuilder sb) {
        renderPackageHeader(packageViewDescriptor.getFqName(), "package", sb);
        if (getDebugMode()) {
            sb.append(" in context of ");
            renderName(packageViewDescriptor.getModule(), sb, false);
        }
    }

    private final void renderAbbreviatedTypeExpansion(StringBuilder sb, AbbreviatedType abbreviatedType) {
        if (getTextFormat() == RenderingFormat.HTML) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* = ");
        renderNormalizedTypeAsIs(sb, abbreviatedType.getExpandedType());
        sb.append(" */");
        if (getTextFormat() == RenderingFormat.HTML) {
            sb.append("</i></font>");
        }
    }

    private final void renderInitializer(VariableDescriptor variableDescriptor, StringBuilder sb) {
        ConstantValue<?> compileTimeInitializer;
        if (getIncludePropertyConstant() && (compileTimeInitializer = variableDescriptor.getCompileTimeInitializer()) != null) {
            sb.append(" = ");
            Intrinsics.checkExpressionValueIsNotNull(compileTimeInitializer, "constant");
            sb.append(escape(renderConstant(compileTimeInitializer)));
        }
    }

    private final void renderMemberModifiers(MemberDescriptor memberDescriptor, StringBuilder sb) {
        boolean z;
        renderModifier(sb, memberDescriptor.isExternal(), "external");
        boolean z2 = true;
        if (!getModifiers().contains(DescriptorRendererModifier.EXPECT) || !memberDescriptor.isExpect()) {
            z = false;
        } else {
            z = true;
        }
        renderModifier(sb, z, "expect");
        if (!getModifiers().contains(DescriptorRendererModifier.ACTUAL) || !memberDescriptor.isActual()) {
            z2 = false;
        }
        renderModifier(sb, z2, "actual");
    }

    private final void renderModalityForCallable(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (DescriptorUtils.isTopLevelDeclaration(callableMemberDescriptor) && callableMemberDescriptor.getModality() == Modality.FINAL) {
            return;
        }
        if (getOverrideRenderingPolicy() != OverrideRenderingPolicy.RENDER_OVERRIDE || callableMemberDescriptor.getModality() != Modality.OPEN || !overridesSomething(callableMemberDescriptor)) {
            Modality modality = callableMemberDescriptor.getModality();
            Intrinsics.checkExpressionValueIsNotNull(modality, "callable.modality");
            renderModality(modality, sb, implicitModalityWithoutExtensions(callableMemberDescriptor));
        }
    }

    private final void renderNormalizedType(StringBuilder sb, KotlinType kotlinType) {
        UnwrappedType unwrap = kotlinType.unwrap();
        if (!(unwrap instanceof AbbreviatedType)) {
            unwrap = null;
        }
        AbbreviatedType abbreviatedType = (AbbreviatedType) unwrap;
        if (abbreviatedType == null) {
            renderNormalizedTypeAsIs(sb, kotlinType);
        } else if (getRenderTypeExpansions()) {
            renderNormalizedTypeAsIs(sb, abbreviatedType.getExpandedType());
        } else {
            renderNormalizedTypeAsIs(sb, abbreviatedType.getAbbreviation());
            if (getRenderUnabbreviatedType()) {
                renderAbbreviatedTypeExpansion(sb, abbreviatedType);
            }
        }
    }

    private final void renderNormalizedTypeAsIs(StringBuilder sb, KotlinType kotlinType) {
        if (!(kotlinType instanceof WrappedType) || !getDebugMode() || ((WrappedType) kotlinType).isComputed()) {
            UnwrappedType unwrap = kotlinType.unwrap();
            if (unwrap instanceof FlexibleType) {
                sb.append(((FlexibleType) unwrap).render(this, this));
            } else if (unwrap instanceof SimpleType) {
                renderSimpleType(sb, (SimpleType) unwrap);
            }
        } else {
            sb.append("<Not computed yet>");
        }
    }

    private final void renderOverride(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (getModifiers().contains(DescriptorRendererModifier.OVERRIDE) && overridesSomething(callableMemberDescriptor) && getOverrideRenderingPolicy() != OverrideRenderingPolicy.RENDER_OPEN) {
            renderModifier(sb, true, "override");
            if (getVerbose()) {
                sb.append("/*");
                sb.append(callableMemberDescriptor.getOverriddenDescriptors().size());
                sb.append("*/ ");
            }
        }
    }

    private final void renderReceiverAfterName(CallableDescriptor callableDescriptor, StringBuilder sb) {
        ReceiverParameterDescriptor extensionReceiverParameter;
        if (getReceiverAfterName() && (extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter()) != null) {
            sb.append(" on ");
            KotlinType type = extensionReceiverParameter.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "receiver.type");
            sb.append(renderType(type));
        }
    }

    private final void renderTypeParameterList(StringBuilder sb, List<? extends TypeParameterDescriptor> list) {
        Iterator<? extends TypeParameterDescriptor> it = list.iterator();
        while (it.hasNext()) {
            renderTypeParameter((TypeParameterDescriptor) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    private final boolean renderVisibility(Visibility visibility, StringBuilder sb) {
        if (!getModifiers().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        if (getNormalizedVisibilities()) {
            visibility = visibility.normalize();
        }
        if (!getRenderDefaultVisibility() && Intrinsics.areEqual(visibility, Visibilities.DEFAULT_VISIBILITY)) {
            return false;
        }
        sb.append(renderKeyword(visibility.getInternalDisplayName()));
        sb.append(" ");
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderName(Name name, boolean z) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        String escape = escape(RenderingUtilsKt.render(name));
        if (!getBoldOnlyForNamesInHtml() || getTextFormat() != RenderingFormat.HTML || !z) {
            return escape;
        }
        return "<b>" + escape + "</b>";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0032, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7 + '?', r8) == false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean differsOnlyInNullability(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r1 = "?"
            java.lang.String r2 = ""
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r8
            java.lang.String r0 = kotlin.text.StringsKt.replace$default(r0, r1, r2, r3, r4, r5)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)
            r1 = 0
            if (r0 != 0) goto L_0x0050
            r0 = 2
            r2 = 0
            java.lang.String r3 = "?"
            boolean r0 = kotlin.text.StringsKt.endsWith$default(r8, r3, r1, r0, r2)
            if (r0 == 0) goto L_0x0034
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r2 = 63
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r8)
            if (r0 != 0) goto L_0x0050
        L_0x0034:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 40
            r0.append(r2)
            r0.append(r7)
            java.lang.String r7 = ")?"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r8)
            if (r7 == 0) goto L_0x0051
        L_0x0050:
            r1 = 1
        L_0x0051:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.differsOnlyInNullability(java.lang.String, java.lang.String):boolean");
    }

    private final void renderCapturedTypeParametersIfRequired(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, StringBuilder sb) {
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        Intrinsics.checkExpressionValueIsNotNull(declaredTypeParameters, "classifier.declaredTypeParameters");
        TypeConstructor typeConstructor = classifierDescriptorWithTypeParameters.getTypeConstructor();
        Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "classifier.typeConstructor");
        List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        Intrinsics.checkExpressionValueIsNotNull(parameters, "classifier.typeConstructor.parameters");
        if (getVerbose() && classifierDescriptorWithTypeParameters.isInner() && parameters.size() > declaredTypeParameters.size()) {
            sb.append(" /*captured type parameters: ");
            renderTypeParameterList(sb, parameters.subList(declaredTypeParameters.size(), parameters.size()));
            sb.append("*/");
        }
    }

    private final void renderCompanionObjectName(DeclarationDescriptor declarationDescriptor, StringBuilder sb) {
        if (getRenderCompanionObjectName()) {
            if (getStartFromName()) {
                sb.append("companion object");
            }
            renderSpaceIfNeeded(sb);
            DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
            if (containingDeclaration != null) {
                sb.append("of ");
                Name name = containingDeclaration.getName();
                Intrinsics.checkExpressionValueIsNotNull(name, "containingDeclaration.name");
                sb.append(renderName(name, false));
            }
        }
        if (getVerbose() || (!Intrinsics.areEqual(declarationDescriptor.getName(), SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT))) {
            if (!getStartFromName()) {
                renderSpaceIfNeeded(sb);
            }
            Name name2 = declarationDescriptor.getName();
            Intrinsics.checkExpressionValueIsNotNull(name2, "descriptor.name");
            sb.append(renderName(name2, true));
        }
    }

    private final void renderDefaultType(StringBuilder sb, KotlinType kotlinType) {
        renderAnnotations$default(this, sb, kotlinType, null, 2, null);
        if (KotlinTypeKt.isError(kotlinType)) {
            if ((kotlinType instanceof UnresolvedType) && getPresentableUnresolvedTypes()) {
                sb.append(((UnresolvedType) kotlinType).getPresentableName());
            } else if (!(kotlinType instanceof ErrorType) || getInformativeErrorType()) {
                sb.append(kotlinType.getConstructor().toString());
            } else {
                sb.append(((ErrorType) kotlinType).getPresentableName());
            }
            sb.append(renderTypeArguments(kotlinType.getArguments()));
        } else {
            renderTypeConstructorAndArguments$default(this, sb, kotlinType, null, 2, null);
        }
        if (kotlinType.isMarkedNullable()) {
            sb.append("?");
        }
        if (SpecialTypesKt.isDefinitelyNotNullType(kotlinType)) {
            sb.append("!!");
        }
    }

    private final void renderMemberKind(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (getModifiers().contains(DescriptorRendererModifier.MEMBER_KIND) && getVerbose() && callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.DECLARATION) {
            sb.append("/*");
            String name = callableMemberDescriptor.getKind().name();
            if (name != null) {
                String lowerCase = name.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                sb.append(lowerCase);
                sb.append("*/ ");
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r3 != null) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void renderPossiblyInnerType(java.lang.StringBuilder r3, kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType r4) {
        /*
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType r0 = r4.getOuterType()
            if (r0 == 0) goto L_0x0026
            r2.renderPossiblyInnerType(r3, r0)
            r0 = 46
            r3.append(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters r0 = r4.getClassifierDescriptor()
            kotlin.reflect.jvm.internal.impl.name.Name r0 = r0.getName()
            java.lang.String r1 = "possiblyInnerType.classifierDescriptor.name"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 0
            java.lang.String r0 = r2.renderName(r0, r1)
            r3.append(r0)
            if (r3 == 0) goto L_0x0026
            goto L_0x003a
        L_0x0026:
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters r0 = r4.getClassifierDescriptor()
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r0 = r0.getTypeConstructor()
            java.lang.String r1 = "possiblyInnerType.classi…escriptor.typeConstructor"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.String r0 = r2.renderTypeConstructor(r0)
            r3.append(r0)
        L_0x003a:
            java.util.List r4 = r4.getArguments()
            java.lang.String r4 = r2.renderTypeArguments(r4)
            r3.append(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.renderPossiblyInnerType(java.lang.StringBuilder, kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType):void");
    }

    private final void renderReceiver(CallableDescriptor callableDescriptor, StringBuilder sb) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            renderAnnotations(sb, extensionReceiverParameter, AnnotationUseSiteTarget.RECEIVER);
            KotlinType type = extensionReceiverParameter.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "receiver.type");
            String renderType = renderType(type);
            if (shouldRenderAsPrettyFunctionType(type) && !TypeUtils.isNullableType(type)) {
                renderType = '(' + renderType + ')';
            }
            sb.append(renderType);
            sb.append(".");
        }
    }

    private final void renderSimpleType(StringBuilder sb, SimpleType simpleType) {
        if (!Intrinsics.areEqual(simpleType, TypeUtils.CANT_INFER_FUNCTION_PARAM_TYPE)) {
            SimpleType simpleType2 = simpleType;
            if (!TypeUtils.isDontCarePlaceholder(simpleType2)) {
                if (ErrorUtils.isUninferredParameter(simpleType2)) {
                    if (getUninferredTypeParameterAsName()) {
                        TypeConstructor constructor = simpleType.getConstructor();
                        if (constructor != null) {
                            TypeParameterDescriptor typeParameterDescriptor = ((ErrorUtils.UninferredParameterTypeConstructor) constructor).getTypeParameterDescriptor();
                            Intrinsics.checkExpressionValueIsNotNull(typeParameterDescriptor, "(type.constructor as Uni…).typeParameterDescriptor");
                            String name = typeParameterDescriptor.getName().toString();
                            Intrinsics.checkExpressionValueIsNotNull(name, "(type.constructor as Uni…escriptor.name.toString()");
                            sb.append(renderError(name));
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.ErrorUtils.UninferredParameterTypeConstructor");
                    }
                    sb.append("???");
                    return;
                } else if (KotlinTypeKt.isError(simpleType2)) {
                    renderDefaultType(sb, simpleType2);
                    return;
                } else if (shouldRenderAsPrettyFunctionType(simpleType2)) {
                    renderFunctionType(sb, simpleType2);
                    return;
                } else {
                    renderDefaultType(sb, simpleType2);
                    return;
                }
            }
        }
        sb.append("???");
    }

    private final void renderSuperTypes(ClassDescriptor classDescriptor, StringBuilder sb) {
        if (!getWithoutSuperTypes() && !KotlinBuiltIns.isNothing(classDescriptor.getDefaultType())) {
            TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
            Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "klass.typeConstructor");
            Collection<KotlinType> supertypes = typeConstructor.getSupertypes();
            Intrinsics.checkExpressionValueIsNotNull(supertypes, "klass.typeConstructor.supertypes");
            if (supertypes.isEmpty()) {
                return;
            }
            if (supertypes.size() != 1 || !KotlinBuiltIns.isAnyOrNullableAny(supertypes.iterator().next())) {
                renderSpaceIfNeeded(sb);
                sb.append(": ");
                CollectionsKt.joinTo$default(supertypes, sb, ", ", null, null, 0, null, new DescriptorRendererImpl$renderSuperTypes$1(this), 60, null);
            }
        }
    }

    public final void renderTypeAlias(TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb) {
        renderAnnotations$default(this, sb, typeAliasDescriptor, null, 2, null);
        Visibility visibility = typeAliasDescriptor.getVisibility();
        Intrinsics.checkExpressionValueIsNotNull(visibility, "typeAlias.visibility");
        renderVisibility(visibility, sb);
        renderMemberModifiers(typeAliasDescriptor, sb);
        sb.append(renderKeyword("typealias"));
        sb.append(" ");
        renderName(typeAliasDescriptor, sb, true);
        List<TypeParameterDescriptor> declaredTypeParameters = typeAliasDescriptor.getDeclaredTypeParameters();
        Intrinsics.checkExpressionValueIsNotNull(declaredTypeParameters, "typeAlias.declaredTypeParameters");
        renderTypeParameters(declaredTypeParameters, sb, false);
        renderCapturedTypeParametersIfRequired(typeAliasDescriptor, sb);
        sb.append(" = ");
        sb.append(renderType(typeAliasDescriptor.getUnderlyingType()));
    }

    private final void appendDefinedIn(StringBuilder sb, DeclarationDescriptor declarationDescriptor) {
        String str;
        if (!(declarationDescriptor instanceof PackageFragmentDescriptor) && !(declarationDescriptor instanceof PackageViewDescriptor)) {
            if (declarationDescriptor instanceof ModuleDescriptor) {
                sb.append(" is a module");
                return;
            }
            DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
            if (containingDeclaration != null && !(containingDeclaration instanceof ModuleDescriptor)) {
                sb.append(" ");
                sb.append(renderMessage("defined in"));
                sb.append(" ");
                FqNameUnsafe fqName = DescriptorUtils.getFqName(containingDeclaration);
                Intrinsics.checkExpressionValueIsNotNull(fqName, "DescriptorUtils.getFqName(containingDeclaration)");
                if (fqName.isRoot()) {
                    str = "root package";
                } else {
                    str = renderFqName(fqName);
                }
                sb.append(str);
                if (getWithSourceFileForTopLevel() && (containingDeclaration instanceof PackageFragmentDescriptor) && (declarationDescriptor instanceof DeclarationDescriptorWithSource)) {
                    SourceElement source = ((DeclarationDescriptorWithSource) declarationDescriptor).getSource();
                    Intrinsics.checkExpressionValueIsNotNull(source, "descriptor.source");
                    SourceFile containingFile = source.getContainingFile();
                    Intrinsics.checkExpressionValueIsNotNull(containingFile, "descriptor.source.containingFile");
                    String name = containingFile.getName();
                    if (name != null) {
                        sb.append(" ");
                        sb.append(renderMessage("in file"));
                        sb.append(" ");
                        sb.append(name);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void renderAdditionalModifiers(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r7, java.lang.StringBuilder r8) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.renderAdditionalModifiers(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.StringBuilder):void");
    }

    private final void renderPropertyAnnotations(PropertyDescriptor propertyDescriptor, StringBuilder sb) {
        if (getModifiers().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            renderAnnotations$default(this, sb, propertyDescriptor, null, 2, null);
            FieldDescriptor backingField = propertyDescriptor.getBackingField();
            if (backingField != null) {
                Intrinsics.checkExpressionValueIsNotNull(backingField, "it");
                renderAnnotations(sb, backingField, AnnotationUseSiteTarget.FIELD);
            }
            FieldDescriptor delegateField = propertyDescriptor.getDelegateField();
            if (delegateField != null) {
                Intrinsics.checkExpressionValueIsNotNull(delegateField, "it");
                renderAnnotations(sb, delegateField, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
            }
            if (getPropertyAccessorRenderingPolicy() == PropertyAccessorRenderingPolicy.NONE) {
                PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
                if (getter != null) {
                    Intrinsics.checkExpressionValueIsNotNull(getter, "it");
                    renderAnnotations(sb, getter, AnnotationUseSiteTarget.PROPERTY_GETTER);
                }
                PropertySetterDescriptor setter = propertyDescriptor.getSetter();
                if (setter != null) {
                    Intrinsics.checkExpressionValueIsNotNull(setter, "it");
                    renderAnnotations(sb, setter, AnnotationUseSiteTarget.PROPERTY_SETTER);
                    Intrinsics.checkExpressionValueIsNotNull(setter, "setter");
                    List<ValueParameterDescriptor> valueParameters = setter.getValueParameters();
                    Intrinsics.checkExpressionValueIsNotNull(valueParameters, "setter.valueParameters");
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.single((List) valueParameters);
                    Intrinsics.checkExpressionValueIsNotNull(valueParameterDescriptor, "it");
                    renderAnnotations(sb, valueParameterDescriptor, AnnotationUseSiteTarget.SETTER_PARAMETER);
                }
            }
        }
    }

    private final void renderWhereSuffix(List<? extends TypeParameterDescriptor> list, StringBuilder sb) {
        if (!getWithoutTypeParameters()) {
            ArrayList arrayList = new ArrayList(0);
            for (TypeParameterDescriptor typeParameterDescriptor : list) {
                List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
                Intrinsics.checkExpressionValueIsNotNull(upperBounds, "typeParameter.upperBounds");
                for (KotlinType kotlinType : CollectionsKt.drop(upperBounds, 1)) {
                    StringBuilder sb2 = new StringBuilder();
                    Name name = typeParameterDescriptor.getName();
                    Intrinsics.checkExpressionValueIsNotNull(name, "typeParameter.name");
                    sb2.append(renderName(name, false));
                    sb2.append(" : ");
                    Intrinsics.checkExpressionValueIsNotNull(kotlinType, "it");
                    sb2.append(renderType(kotlinType));
                    arrayList.add(sb2.toString());
                }
            }
            if (!arrayList.isEmpty()) {
                sb.append(" ");
                sb.append(renderKeyword("where"));
                sb.append(" ");
                CollectionsKt.joinTo$default(arrayList, sb, ", ", null, null, 0, null, null, SmActions.ACTION_CALLING_EXIT, null);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderAnnotation(AnnotationDescriptor annotationDescriptor, AnnotationUseSiteTarget annotationUseSiteTarget) {
        Intrinsics.checkParameterIsNotNull(annotationDescriptor, "annotation");
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (annotationUseSiteTarget != null) {
            sb.append(annotationUseSiteTarget.getRenderName() + ":");
        }
        KotlinType type = annotationDescriptor.getType();
        sb.append(renderType(type));
        if (getIncludeAnnotationArguments()) {
            List<String> renderAndSortAnnotationArguments = renderAndSortAnnotationArguments(annotationDescriptor);
            if (getIncludeEmptyAnnotationArguments() || (!renderAndSortAnnotationArguments.isEmpty())) {
                CollectionsKt.joinTo$default(renderAndSortAnnotationArguments, sb, ", ", "(", ")", 0, null, null, SmEvents.EVENT_NE_RR, null);
            }
        }
        if (getVerbose() && (KotlinTypeKt.isError(type) || (type.getConstructor().getDeclarationDescriptor() instanceof NotFoundClasses.MockClassDescriptor))) {
            sb.append(" /* annotation class not found */");
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void renderFunction(FunctionDescriptor functionDescriptor, StringBuilder sb) {
        String str;
        if (!getStartFromName()) {
            if (!getStartFromDeclarationKeyword()) {
                renderAnnotations$default(this, sb, functionDescriptor, null, 2, null);
                Visibility visibility = functionDescriptor.getVisibility();
                Intrinsics.checkExpressionValueIsNotNull(visibility, "function.visibility");
                renderVisibility(visibility, sb);
                FunctionDescriptor functionDescriptor2 = functionDescriptor;
                renderModalityForCallable(functionDescriptor2, sb);
                if (getIncludeAdditionalModifiers()) {
                    renderMemberModifiers(functionDescriptor, sb);
                }
                renderOverride(functionDescriptor2, sb);
                if (getIncludeAdditionalModifiers()) {
                    renderAdditionalModifiers(functionDescriptor, sb);
                } else {
                    renderSuspendModifier(functionDescriptor, sb);
                }
                renderMemberKind(functionDescriptor2, sb);
                if (getVerbose()) {
                    if (functionDescriptor.isHiddenToOvercomeSignatureClash()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (functionDescriptor.isHiddenForResolutionEverywhereBesideSupercalls()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(renderKeyword("fun"));
            sb.append(" ");
            List<TypeParameterDescriptor> typeParameters = functionDescriptor.getTypeParameters();
            Intrinsics.checkExpressionValueIsNotNull(typeParameters, "function.typeParameters");
            renderTypeParameters(typeParameters, sb, true);
            renderReceiver(functionDescriptor, sb);
        }
        renderName(functionDescriptor, sb, true);
        List<ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
        Intrinsics.checkExpressionValueIsNotNull(valueParameters, "function.valueParameters");
        renderValueParameters(valueParameters, functionDescriptor.hasSynthesizedParameterNames(), sb);
        renderReceiverAfterName(functionDescriptor, sb);
        KotlinType returnType = functionDescriptor.getReturnType();
        if (!getWithoutReturnType() && (getUnitReturnType() || returnType == null || !KotlinBuiltIns.isUnit(returnType))) {
            sb.append(": ");
            if (returnType == null) {
                str = "[NULL]";
            } else {
                str = renderType(returnType);
            }
            sb.append(str);
        }
        List<TypeParameterDescriptor> typeParameters2 = functionDescriptor.getTypeParameters();
        Intrinsics.checkExpressionValueIsNotNull(typeParameters2, "function.typeParameters");
        renderWhereSuffix(typeParameters2, sb);
    }

    public final void renderProperty(PropertyDescriptor propertyDescriptor, StringBuilder sb) {
        boolean z;
        if (!getStartFromName()) {
            if (!getStartFromDeclarationKeyword()) {
                renderPropertyAnnotations(propertyDescriptor, sb);
                Visibility visibility = propertyDescriptor.getVisibility();
                Intrinsics.checkExpressionValueIsNotNull(visibility, "property.visibility");
                renderVisibility(visibility, sb);
                boolean z2 = false;
                if (!getModifiers().contains(DescriptorRendererModifier.CONST) || !propertyDescriptor.isConst()) {
                    z = false;
                } else {
                    z = true;
                }
                renderModifier(sb, z, "const");
                renderMemberModifiers(propertyDescriptor, sb);
                PropertyDescriptor propertyDescriptor2 = propertyDescriptor;
                renderModalityForCallable(propertyDescriptor2, sb);
                renderOverride(propertyDescriptor2, sb);
                if (getModifiers().contains(DescriptorRendererModifier.LATEINIT) && propertyDescriptor.isLateInit()) {
                    z2 = true;
                }
                renderModifier(sb, z2, "lateinit");
                renderMemberKind(propertyDescriptor2, sb);
            }
            renderValVarPrefix$default(this, propertyDescriptor, sb, false, 4, null);
            List<TypeParameterDescriptor> typeParameters = propertyDescriptor.getTypeParameters();
            Intrinsics.checkExpressionValueIsNotNull(typeParameters, "property.typeParameters");
            renderTypeParameters(typeParameters, sb, true);
            renderReceiver(propertyDescriptor, sb);
        }
        renderName(propertyDescriptor, sb, true);
        sb.append(": ");
        KotlinType type = propertyDescriptor.getType();
        Intrinsics.checkExpressionValueIsNotNull(type, "property.type");
        sb.append(renderType(type));
        renderReceiverAfterName(propertyDescriptor, sb);
        renderInitializer(propertyDescriptor, sb);
        List<TypeParameterDescriptor> typeParameters2 = propertyDescriptor.getTypeParameters();
        Intrinsics.checkExpressionValueIsNotNull(typeParameters2, "property.typeParameters");
        renderWhereSuffix(typeParameters2, sb);
    }

    private final void renderFunctionType(StringBuilder sb, KotlinType kotlinType) {
        boolean z;
        boolean z2;
        Name name;
        boolean z3;
        int length = sb.length();
        renderAnnotations$default(getFunctionTypeAnnotationsRenderer(), sb, kotlinType, null, 2, null);
        boolean z4 = true;
        if (sb.length() != length) {
            z = true;
        } else {
            z = false;
        }
        boolean isSuspendFunctionType = FunctionTypesKt.isSuspendFunctionType(kotlinType);
        boolean isMarkedNullable = kotlinType.isMarkedNullable();
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
        if (isMarkedNullable || (z && receiverTypeFromFunctionType != null)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (isSuspendFunctionType) {
                sb.insert(length, '(');
            } else {
                if (z) {
                    StringBuilder sb2 = sb;
                    if (StringsKt.last(sb2) == ' ') {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (_Assertions.f173221a && !z3) {
                        throw new AssertionError("Assertion failed");
                    } else if (sb.charAt(StringsKt.getLastIndex(sb2) - 1) != ')') {
                        sb.insert(StringsKt.getLastIndex(sb2), "()");
                    }
                }
                sb.append("(");
            }
        }
        renderModifier(sb, isSuspendFunctionType, "suspend");
        if (receiverTypeFromFunctionType != null) {
            if ((!shouldRenderAsPrettyFunctionType(receiverTypeFromFunctionType) || receiverTypeFromFunctionType.isMarkedNullable()) && !hasModifiersOrAnnotations(receiverTypeFromFunctionType)) {
                z4 = false;
            }
            if (z4) {
                sb.append("(");
            }
            renderNormalizedType(sb, receiverTypeFromFunctionType);
            if (z4) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        int i = 0;
        for (T t : FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType)) {
            if (i > 0) {
                sb.append(", ");
            }
            if (getParameterNamesInFunctionalTypes()) {
                KotlinType type = t.getType();
                Intrinsics.checkExpressionValueIsNotNull(type, "typeProjection.type");
                name = FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type);
            } else {
                name = null;
            }
            if (name != null) {
                sb.append(renderName(name, false));
                sb.append(": ");
            }
            sb.append(getFunctionTypeParameterTypesRenderer().renderTypeProjection(t));
            i++;
        }
        sb.append(") ");
        sb.append(arrow());
        sb.append(" ");
        renderNormalizedType(sb, FunctionTypesKt.getReturnTypeFromFunctionType(kotlinType));
        if (z2) {
            sb.append(")");
        }
        if (isMarkedNullable) {
            sb.append("?");
        }
    }

    public final void renderClass(ClassDescriptor classDescriptor, StringBuilder sb) {
        boolean z;
        ClassConstructorDescriptor unsubstitutedPrimaryConstructor;
        boolean z2;
        boolean z3;
        boolean z4;
        if (classDescriptor.getKind() == ClassKind.ENUM_ENTRY) {
            z = true;
        } else {
            z = false;
        }
        if (!getStartFromName()) {
            renderAnnotations$default(this, sb, classDescriptor, null, 2, null);
            if (!z) {
                Visibility visibility = classDescriptor.getVisibility();
                Intrinsics.checkExpressionValueIsNotNull(visibility, "klass.visibility");
                renderVisibility(visibility, sb);
            }
            if (!(classDescriptor.getKind() == ClassKind.INTERFACE && classDescriptor.getModality() == Modality.ABSTRACT)) {
                ClassKind kind = classDescriptor.getKind();
                Intrinsics.checkExpressionValueIsNotNull(kind, "klass.kind");
                if (!kind.isSingleton() || classDescriptor.getModality() != Modality.FINAL) {
                    Modality modality = classDescriptor.getModality();
                    Intrinsics.checkExpressionValueIsNotNull(modality, "klass.modality");
                    renderModality(modality, sb, implicitModalityWithoutExtensions(classDescriptor));
                }
            }
            renderMemberModifiers(classDescriptor, sb);
            if (!getModifiers().contains(DescriptorRendererModifier.INNER) || !classDescriptor.isInner()) {
                z2 = false;
            } else {
                z2 = true;
            }
            renderModifier(sb, z2, "inner");
            if (!getModifiers().contains(DescriptorRendererModifier.DATA) || !classDescriptor.isData()) {
                z3 = false;
            } else {
                z3 = true;
            }
            renderModifier(sb, z3, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (!getModifiers().contains(DescriptorRendererModifier.INLINE) || !classDescriptor.isInline()) {
                z4 = false;
            } else {
                z4 = true;
            }
            renderModifier(sb, z4, "inline");
            renderClassKindPrefix(classDescriptor, sb);
        }
        ClassDescriptor classDescriptor2 = classDescriptor;
        if (!DescriptorUtils.isCompanionObject(classDescriptor2)) {
            if (!getStartFromName()) {
                renderSpaceIfNeeded(sb);
            }
            renderName(classDescriptor2, sb, true);
        } else {
            renderCompanionObjectName(classDescriptor2, sb);
        }
        if (!z) {
            List<TypeParameterDescriptor> declaredTypeParameters = classDescriptor.getDeclaredTypeParameters();
            Intrinsics.checkExpressionValueIsNotNull(declaredTypeParameters, "klass.declaredTypeParameters");
            renderTypeParameters(declaredTypeParameters, sb, false);
            renderCapturedTypeParametersIfRequired(classDescriptor, sb);
            ClassKind kind2 = classDescriptor.getKind();
            Intrinsics.checkExpressionValueIsNotNull(kind2, "klass.kind");
            if (!kind2.isSingleton() && getClassWithPrimaryConstructor() && (unsubstitutedPrimaryConstructor = classDescriptor.getUnsubstitutedPrimaryConstructor()) != null) {
                sb.append(" ");
                renderAnnotations$default(this, sb, unsubstitutedPrimaryConstructor, null, 2, null);
                Visibility visibility2 = unsubstitutedPrimaryConstructor.getVisibility();
                Intrinsics.checkExpressionValueIsNotNull(visibility2, "primaryConstructor.visibility");
                renderVisibility(visibility2, sb);
                sb.append(renderKeyword("constructor"));
                List<ValueParameterDescriptor> valueParameters = unsubstitutedPrimaryConstructor.getValueParameters();
                Intrinsics.checkExpressionValueIsNotNull(valueParameters, "primaryConstructor.valueParameters");
                renderValueParameters(valueParameters, unsubstitutedPrimaryConstructor.hasSynthesizedParameterNames(), sb);
            }
            renderSuperTypes(classDescriptor, sb);
            renderWhereSuffix(declaredTypeParameters, sb);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
        if (r0.getModality() != kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED) goto L_0x002d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void renderConstructor(kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor r18, java.lang.StringBuilder r19) {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.renderConstructor(kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor, java.lang.StringBuilder):void");
    }

    private final void renderModifier(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(renderKeyword(str));
            sb.append(" ");
        }
    }

    private final void renderTypeConstructorAndArguments(StringBuilder sb, KotlinType kotlinType, TypeConstructor typeConstructor) {
        PossiblyInnerType buildPossiblyInnerType = TypeParameterUtilsKt.buildPossiblyInnerType(kotlinType);
        if (buildPossiblyInnerType == null) {
            sb.append(renderTypeConstructor(typeConstructor));
            sb.append(renderTypeArguments(kotlinType.getArguments()));
            return;
        }
        renderPossiblyInnerType(sb, buildPossiblyInnerType);
    }

    private final void renderValVarPrefix(VariableDescriptor variableDescriptor, StringBuilder sb, boolean z) {
        String str;
        if (z || !(variableDescriptor instanceof ValueParameterDescriptor)) {
            if (variableDescriptor.isVar()) {
                str = "var";
            } else {
                str = "val";
            }
            sb.append(renderKeyword(str));
            sb.append(" ");
        }
    }

    public final void renderName(DeclarationDescriptor declarationDescriptor, StringBuilder sb, boolean z) {
        Name name = declarationDescriptor.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "descriptor.name");
        sb.append(renderName(name, z));
    }

    private final void renderModality(Modality modality, StringBuilder sb, Modality modality2) {
        if (getRenderDefaultModality() || modality != modality2) {
            boolean contains = getModifiers().contains(DescriptorRendererModifier.MODALITY);
            String name = modality.name();
            if (name != null) {
                String lowerCase = name.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                renderModifier(sb, contains, lowerCase);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }

    private final void renderPackageHeader(FqName fqName, String str, StringBuilder sb) {
        boolean z;
        sb.append(renderKeyword(str));
        FqNameUnsafe unsafe = fqName.toUnsafe();
        Intrinsics.checkExpressionValueIsNotNull(unsafe, "fqName.toUnsafe()");
        String renderFqName = renderFqName(unsafe);
        if (renderFqName.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sb.append(" ");
            sb.append(renderFqName);
        }
    }

    private final void renderTypeParameters(List<? extends TypeParameterDescriptor> list, StringBuilder sb, boolean z) {
        if (!getWithoutTypeParameters() && (!list.isEmpty())) {
            sb.append(lt());
            renderTypeParameterList(sb, list);
            sb.append(gt());
            if (z) {
                sb.append(" ");
            }
        }
    }

    private final void renderValueParameters(Collection<? extends ValueParameterDescriptor> collection, boolean z, StringBuilder sb) {
        boolean shouldRenderParameterNames = shouldRenderParameterNames(z);
        int size = collection.size();
        getValueParametersHandler().appendBeforeValueParameters(size, sb);
        int i = 0;
        for (T t : collection) {
            getValueParametersHandler().appendBeforeValueParameter(t, i, size, sb);
            renderValueParameter(t, shouldRenderParameterNames, sb, false);
            getValueParametersHandler().appendAfterValueParameter(t, i, size, sb);
            i++;
        }
        getValueParametersHandler().appendAfterValueParameters(size, sb);
    }

    private final void renderAnnotations(StringBuilder sb, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget) {
        Set<FqName> set;
        if (getModifiers().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            if (annotated instanceof KotlinType) {
                set = getExcludedTypeAnnotationClasses();
            } else {
                set = getExcludedAnnotationClasses();
            }
            Function1<AnnotationDescriptor, Boolean> annotationFilter = getAnnotationFilter();
            for (AnnotationDescriptor annotationDescriptor : annotated.getAnnotations()) {
                if (!CollectionsKt.contains(set, annotationDescriptor.getFqName()) && (annotationFilter == null || annotationFilter.invoke(annotationDescriptor).booleanValue())) {
                    sb.append(renderAnnotation(annotationDescriptor, annotationUseSiteTarget));
                    if (getEachAnnotationOnNewLine()) {
                        StringsKt.appendln(sb);
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    public final void renderTypeParameter(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb, boolean z) {
        boolean z2;
        if (z) {
            sb.append(lt());
        }
        if (getVerbose()) {
            sb.append("/*");
            sb.append(typeParameterDescriptor.getIndex());
            sb.append("*/ ");
        }
        renderModifier(sb, typeParameterDescriptor.isReified(), "reified");
        String label = typeParameterDescriptor.getVariance().getLabel();
        boolean z3 = true;
        if (label.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        renderModifier(sb, z2, label);
        renderAnnotations$default(this, sb, typeParameterDescriptor, null, 2, null);
        renderName(typeParameterDescriptor, sb, z);
        int size = typeParameterDescriptor.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            KotlinType next = typeParameterDescriptor.getUpperBounds().iterator().next();
            if (!KotlinBuiltIns.isDefaultBound(next)) {
                sb.append(" : ");
                Intrinsics.checkExpressionValueIsNotNull(next, "upperBound");
                sb.append(renderType(next));
            }
        } else if (z) {
            for (KotlinType kotlinType : typeParameterDescriptor.getUpperBounds()) {
                if (!KotlinBuiltIns.isDefaultBound(kotlinType)) {
                    if (z3) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    Intrinsics.checkExpressionValueIsNotNull(kotlinType, "upperBound");
                    sb.append(renderType(kotlinType));
                    z3 = false;
                }
            }
        }
        if (z) {
            sb.append(gt());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderFlexibleType(String str, String str2, KotlinBuiltIns kotlinBuiltIns) {
        Intrinsics.checkParameterIsNotNull(str, "lowerRendered");
        Intrinsics.checkParameterIsNotNull(str2, "upperRendered");
        Intrinsics.checkParameterIsNotNull(kotlinBuiltIns, "builtIns");
        if (!differsOnlyInNullability(str, str2)) {
            ClassifierNamePolicy classifierNamePolicy = getClassifierNamePolicy();
            ClassDescriptor collection = kotlinBuiltIns.getCollection();
            Intrinsics.checkExpressionValueIsNotNull(collection, "builtIns.collection");
            DescriptorRendererImpl descriptorRendererImpl = this;
            String substringBefore$default = StringsKt.substringBefore$default(classifierNamePolicy.renderClassifier(collection, descriptorRendererImpl), "Collection", (String) null, 2, (Object) null);
            String replacePrefixes = replacePrefixes(str, substringBefore$default + "Mutable", str2, substringBefore$default, substringBefore$default + '(' + "Mutable" + ')');
            if (replacePrefixes != null) {
                return replacePrefixes;
            }
            String replacePrefixes2 = replacePrefixes(str, substringBefore$default + "MutableMap.MutableEntry", str2, substringBefore$default + "Map.Entry", substringBefore$default + "(Mutable)Map.(Mutable)Entry");
            if (replacePrefixes2 != null) {
                return replacePrefixes2;
            }
            ClassifierNamePolicy classifierNamePolicy2 = getClassifierNamePolicy();
            ClassDescriptor array = kotlinBuiltIns.getArray();
            Intrinsics.checkExpressionValueIsNotNull(array, "builtIns.array");
            String substringBefore$default2 = StringsKt.substringBefore$default(classifierNamePolicy2.renderClassifier(array, descriptorRendererImpl), "Array", (String) null, 2, (Object) null);
            String replacePrefixes3 = replacePrefixes(str, substringBefore$default2 + escape("Array<"), str2, substringBefore$default2 + escape("Array<out "), substringBefore$default2 + escape("Array<(out) "));
            if (replacePrefixes3 != null) {
                return replacePrefixes3;
            }
            return '(' + str + ".." + str2 + ')';
        } else if (StringsKt.startsWith$default(str2, "(", false, 2, (Object) null)) {
            return '(' + str + ")!";
        } else {
            return str + '!';
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void renderValueParameter(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r10, boolean r11, java.lang.StringBuilder r12, boolean r13) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.renderValueParameter(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor, boolean, java.lang.StringBuilder, boolean):void");
    }

    private final void renderVariable(VariableDescriptor variableDescriptor, boolean z, StringBuilder sb, boolean z2, boolean z3) {
        VariableDescriptor variableDescriptor2;
        KotlinType kotlinType;
        boolean z4;
        KotlinType type = variableDescriptor.getType();
        Intrinsics.checkExpressionValueIsNotNull(type, "variable.type");
        KotlinType kotlinType2 = null;
        if (!(variableDescriptor instanceof ValueParameterDescriptor)) {
            variableDescriptor2 = null;
        } else {
            variableDescriptor2 = variableDescriptor;
        }
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) variableDescriptor2;
        if (valueParameterDescriptor != null) {
            kotlinType2 = valueParameterDescriptor.getVarargElementType();
        }
        if (kotlinType2 != null) {
            kotlinType = kotlinType2;
        } else {
            kotlinType = type;
        }
        if (kotlinType2 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        renderModifier(sb, z4, "vararg");
        if (z3 || (z2 && !getStartFromName())) {
            renderValVarPrefix(variableDescriptor, sb, z3);
        }
        if (z) {
            renderName(variableDescriptor, sb, z2);
            sb.append(": ");
        }
        sb.append(renderType(kotlinType));
        renderInitializer(variableDescriptor, sb);
        if (getVerbose() && kotlinType2 != null) {
            sb.append(" /*");
            sb.append(renderType(type));
            sb.append("*/");
        }
    }

    private final String replacePrefixes(String str, String str2, String str3, String str4, String str5) {
        if (StringsKt.startsWith$default(str, str2, false, 2, (Object) null) && StringsKt.startsWith$default(str3, str4, false, 2, (Object) null)) {
            int length = str2.length();
            if (str != null) {
                String substring = str.substring(length);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
                int length2 = str4.length();
                if (str3 != null) {
                    String substring2 = str3.substring(length2);
                    Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.String).substring(startIndex)");
                    String str6 = str5 + substring;
                    if (Intrinsics.areEqual(substring, substring2)) {
                        return str6;
                    }
                    if (differsOnlyInNullability(substring, substring2)) {
                        return str6 + '!';
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return null;
    }

    static /* synthetic */ void renderAnnotations$default(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget, int i, Object obj) {
        if ((i & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        descriptorRendererImpl.renderAnnotations(sb, annotated, annotationUseSiteTarget);
    }

    static /* synthetic */ void renderTypeConstructorAndArguments$default(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb, KotlinType kotlinType, TypeConstructor typeConstructor, int i, Object obj) {
        if ((i & 2) != 0) {
            typeConstructor = kotlinType.getConstructor();
        }
        descriptorRendererImpl.renderTypeConstructorAndArguments(sb, kotlinType, typeConstructor);
    }

    static /* synthetic */ void renderValVarPrefix$default(DescriptorRendererImpl descriptorRendererImpl, VariableDescriptor variableDescriptor, StringBuilder sb, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        descriptorRendererImpl.renderValVarPrefix(variableDescriptor, sb, z);
    }
}
