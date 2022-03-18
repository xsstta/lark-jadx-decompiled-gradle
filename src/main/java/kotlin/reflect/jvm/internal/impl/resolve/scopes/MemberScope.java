package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.am;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;

public interface MemberScope extends ResolutionScope {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class DefaultImpls {
        public static void recordLookup(MemberScope memberScope, Name name, LookupLocation lookupLocation) {
            Intrinsics.checkParameterIsNotNull(name, "name");
            Intrinsics.checkParameterIsNotNull(lookupLocation, "location");
            ResolutionScope.DefaultImpls.recordLookup(memberScope, name, lookupLocation);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    Collection<? extends SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation);

    Collection<? extends PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation);

    Set<Name> getFunctionNames();

    Set<Name> getVariableNames();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Function1<Name, Boolean> ALL_NAME_FILTER = MemberScope$Companion$ALL_NAME_FILTER$1.INSTANCE;

        private Companion() {
        }

        public final Function1<Name, Boolean> getALL_NAME_FILTER() {
            return ALL_NAME_FILTER;
        }
    }

    public static final class Empty extends MemberScopeImpl {
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
        public Set<Name> getFunctionNames() {
            return am.m265687a();
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
        public Set<Name> getVariableNames() {
            return am.m265687a();
        }
    }
}
