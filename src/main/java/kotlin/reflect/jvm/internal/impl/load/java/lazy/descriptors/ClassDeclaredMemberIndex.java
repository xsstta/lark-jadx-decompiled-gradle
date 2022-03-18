package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.C69294l;
import kotlin.sequences.Sequence;

public class ClassDeclaredMemberIndex implements DeclaredMemberIndex {
    private final Map<Name, JavaField> fields;
    private final JavaClass jClass;
    public final Function1<JavaMember, Boolean> memberFilter;
    private final Function1<JavaMethod, Boolean> methodFilter;
    private final Map<Name, List<JavaMethod>> methods;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public Set<Name> getFieldNames() {
        Sequence a = C69294l.m266131a(CollectionsKt.asSequence(this.jClass.getFields()), (Function1) this.memberFilter);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator a2 = a.mo4717a();
        while (a2.hasNext()) {
            linkedHashSet.add(((JavaField) a2.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public Set<Name> getMethodNames() {
        Sequence a = C69294l.m266131a(CollectionsKt.asSequence(this.jClass.getMethods()), (Function1) this.methodFilter);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator a2 = a.mo4717a();
        while (a2.hasNext()) {
            linkedHashSet.add(((JavaMethod) a2.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public JavaField findFieldByName(Name name) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        return this.fields.get(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public Collection<JavaMethod> findMethodsByName(Name name) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        List<JavaMethod> list = this.methods.get(name);
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        return list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public ClassDeclaredMemberIndex(JavaClass javaClass, Function1<? super JavaMember, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(javaClass, "jClass");
        Intrinsics.checkParameterIsNotNull(function1, "memberFilter");
        this.jClass = javaClass;
        this.memberFilter = function1;
        ClassDeclaredMemberIndex$methodFilter$1 classDeclaredMemberIndex$methodFilter$1 = new ClassDeclaredMemberIndex$methodFilter$1(this);
        this.methodFilter = classDeclaredMemberIndex$methodFilter$1;
        Sequence a = C69294l.m266131a(CollectionsKt.asSequence(javaClass.getMethods()), (Function1) classDeclaredMemberIndex$methodFilter$1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator a2 = a.mo4717a();
        while (a2.hasNext()) {
            Object next = a2.next();
            Name name = ((JavaMethod) next).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next);
        }
        this.methods = linkedHashMap;
        Sequence a3 = C69294l.m266131a(CollectionsKt.asSequence(this.jClass.getFields()), (Function1) this.memberFilter);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator a4 = a3.mo4717a();
        while (a4.hasNext()) {
            Object next2 = a4.next();
            linkedHashMap2.put(((JavaField) next2).getName(), next2);
        }
        this.fields = linkedHashMap2;
    }
}
