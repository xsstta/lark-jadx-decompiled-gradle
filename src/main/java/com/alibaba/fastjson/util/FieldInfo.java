package com.alibaba.fastjson.util;

import com.alibaba.fastjson.JSONAware;
import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public class FieldInfo implements Comparable<FieldInfo> {
    public final String[] alternateNames;
    public final Class<?> declaringClass;
    public final Field field;
    public final boolean fieldAccess;
    private final JSONField fieldAnnotation;
    public final Class<?> fieldClass;
    public final boolean fieldTransient;
    public final Type fieldType;
    public final String format;
    public final boolean getOnly;
    public final boolean isEnum;
    public final Method method;
    private final JSONField methodAnnotation;
    public final String name;
    public final long nameHashCode;
    private int ordinal;
    public final int serialzeFeatures;

    public String toString() {
        return this.name;
    }

    public JSONField getAnnotation() {
        JSONField jSONField = this.fieldAnnotation;
        if (jSONField != null) {
            return jSONField;
        }
        return this.methodAnnotation;
    }

    public boolean equals(FieldInfo fieldInfo) {
        if (fieldInfo == this || compareTo(fieldInfo) == 0) {
            return true;
        }
        return false;
    }

    public int compareTo(FieldInfo fieldInfo) {
        int i = this.ordinal;
        int i2 = fieldInfo.ordinal;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return this.name.compareTo(fieldInfo.name);
    }

    public Object get(Object obj) throws IllegalAccessException, InvocationTargetException {
        if (this.fieldAccess) {
            return this.field.get(obj);
        }
        return this.method.invoke(obj, new Object[0]);
    }

    public void set(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        Method method2 = this.method;
        if (method2 != null) {
            method2.invoke(obj, obj2);
            return;
        }
        this.field.set(obj, obj2);
    }

    public static Type getFieldType(Class<?> cls, Type type, Type type2) {
        ParameterizedType parameterizedType;
        TypeVariable<Class<? super Object>>[] typeVariableArr;
        if (!(cls == null || type == null)) {
            if (type2 instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
                Type fieldType2 = getFieldType(cls, type, genericComponentType);
                if (genericComponentType != fieldType2) {
                    return Array.newInstance(TypeUtils.getClass(fieldType2), 0).getClass();
                }
                return type2;
            } else if (!TypeUtils.isGenericParamType(type)) {
                return type2;
            } else {
                if (type2 instanceof TypeVariable) {
                    ParameterizedType parameterizedType2 = (ParameterizedType) TypeUtils.getGenericParamType(type);
                    Class<?> cls2 = TypeUtils.getClass(parameterizedType2);
                    TypeVariable typeVariable = (TypeVariable) type2;
                    for (int i = 0; i < cls2.getTypeParameters().length; i++) {
                        if (cls2.getTypeParameters()[i].getName().equals(typeVariable.getName())) {
                            return parameterizedType2.getActualTypeArguments()[i];
                        }
                    }
                }
                if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType3 = (ParameterizedType) type2;
                    Type[] actualTypeArguments = parameterizedType3.getActualTypeArguments();
                    Type[] typeArr = null;
                    if (type instanceof ParameterizedType) {
                        parameterizedType = (ParameterizedType) type;
                        typeVariableArr = cls.getTypeParameters();
                    } else if (cls.getGenericSuperclass() instanceof ParameterizedType) {
                        parameterizedType = (ParameterizedType) cls.getGenericSuperclass();
                        typeVariableArr = cls.getSuperclass().getTypeParameters();
                    } else {
                        typeVariableArr = null;
                        parameterizedType = null;
                    }
                    boolean z = false;
                    for (int i2 = 0; i2 < actualTypeArguments.length && parameterizedType != null; i2++) {
                        Type type3 = actualTypeArguments[i2];
                        if (type3 instanceof TypeVariable) {
                            TypeVariable typeVariable2 = (TypeVariable) type3;
                            for (int i3 = 0; i3 < typeVariableArr.length; i3++) {
                                if (typeVariableArr[i3].getName().equals(typeVariable2.getName())) {
                                    if (typeArr == null) {
                                        typeArr = parameterizedType.getActualTypeArguments();
                                    }
                                    actualTypeArguments[i2] = typeArr[i3];
                                    z = true;
                                }
                            }
                        }
                    }
                    if (z) {
                        return new ParameterizedTypeImpl(actualTypeArguments, parameterizedType3.getOwnerType(), parameterizedType3.getRawType());
                    }
                }
            }
        }
        return type2;
    }

    public FieldInfo(String str, Class<?> cls, Class<?> cls2, Type type, Field field2, int i, int i2) {
        boolean z;
        this.name = str;
        this.declaringClass = cls;
        this.fieldClass = cls2;
        this.fieldType = type;
        this.field = field2;
        this.ordinal = i;
        this.serialzeFeatures = i2;
        boolean z2 = true;
        if (!cls2.isEnum() || JSONAware.class.isAssignableFrom(cls2)) {
            z = false;
        } else {
            z = true;
        }
        this.isEnum = z;
        this.fieldAnnotation = null;
        this.methodAnnotation = null;
        if (field2 != null) {
            int modifiers = field2.getModifiers();
            if ((modifiers & 1) == 0 && this.method != null) {
                z2 = false;
            }
            this.fieldAccess = z2;
            this.fieldTransient = Modifier.isTransient(modifiers);
        } else {
            this.fieldAccess = false;
            this.fieldTransient = false;
        }
        this.getOnly = false;
        long j = -3750763034362895579L;
        for (int i3 = 0; i3 < str.length(); i3++) {
            j = (j ^ ((long) str.charAt(i3))) * 1099511628211L;
        }
        this.nameHashCode = j;
        this.format = null;
        this.alternateNames = new String[0];
    }

    public FieldInfo(String str, Method method2, Field field2, Class<?> cls, Type type, int i, int i2, JSONField jSONField, JSONField jSONField2, boolean z) {
        String str2;
        Type type2;
        Class<?> cls2;
        Type type3;
        boolean z2;
        boolean z3;
        this.name = str;
        this.method = method2;
        this.field = field2;
        this.ordinal = i;
        this.methodAnnotation = jSONField;
        this.fieldAnnotation = jSONField2;
        this.serialzeFeatures = i2;
        JSONField annotation = getAnnotation();
        Type type4 = null;
        boolean z4 = false;
        if (annotation != null) {
            str2 = annotation.format();
            str2 = str2.trim().length() == 0 ? null : str2;
            this.alternateNames = annotation.alternateNames();
        } else {
            this.alternateNames = new String[0];
            str2 = null;
        }
        this.format = str2;
        if (field2 != null) {
            int modifiers = field2.getModifiers();
            if (method2 == null || ((modifiers & 1) != 0 && method2.getReturnType() == field2.getType())) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.fieldAccess = z2;
            if ((modifiers & SmActions.ACTION_ONTHECALL_EXIT) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.fieldTransient = z3;
        } else {
            this.fieldAccess = false;
            this.fieldTransient = false;
        }
        long j = -3750763034362895579L;
        for (int i3 = 0; i3 < str.length(); i3++) {
            j = (j ^ ((long) str.charAt(i3))) * 1099511628211L;
        }
        this.nameHashCode = j;
        if (method2 != null) {
            Class<?>[] parameterTypes = method2.getParameterTypes();
            if (parameterTypes.length == 1) {
                cls2 = parameterTypes[0];
                if (cls2 == Class.class || cls2 == String.class || cls2.isPrimitive() || !z) {
                    type2 = cls2;
                } else {
                    type2 = method2.getGenericParameterTypes()[0];
                }
                this.getOnly = false;
            } else {
                cls2 = method2.getReturnType();
                if (cls2 != Class.class && z) {
                    type2 = method2.getGenericReturnType();
                } else {
                    type2 = cls2;
                }
                this.getOnly = true;
            }
            this.declaringClass = method2.getDeclaringClass();
        } else {
            cls2 = field2.getType();
            if (cls2.isPrimitive() || cls2 == String.class || cls2.isEnum() || !z) {
                type3 = cls2;
            } else {
                type3 = field2.getGenericType();
            }
            this.declaringClass = field2.getDeclaringClass();
            this.getOnly = Modifier.isFinal(field2.getModifiers());
            type2 = type3;
        }
        if (cls != null && cls2 == Object.class && (type2 instanceof TypeVariable)) {
            TypeVariable typeVariable = (TypeVariable) type2;
            Type[] actualTypeArguments = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments() : null;
            Class<?> cls3 = cls;
            while (cls3 != null && cls3 != Object.class && cls3 != this.declaringClass) {
                Type genericSuperclass = cls3.getGenericSuperclass();
                if (genericSuperclass instanceof ParameterizedType) {
                    Type[] actualTypeArguments2 = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
                    TypeUtils.getArgument(actualTypeArguments2, cls3.getTypeParameters(), actualTypeArguments);
                    actualTypeArguments = actualTypeArguments2;
                }
                cls3 = cls3.getSuperclass();
            }
            if (actualTypeArguments != null) {
                TypeVariable<Class<?>>[] typeParameters = this.declaringClass.getTypeParameters();
                int i4 = 0;
                while (true) {
                    if (i4 >= typeParameters.length) {
                        break;
                    } else if (typeVariable.equals(typeParameters[i4])) {
                        type4 = actualTypeArguments[i4];
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            if (type4 != null) {
                this.fieldClass = TypeUtils.getClass(type4);
                this.fieldType = type4;
                if (cls2.isEnum() && !JSONAware.class.isAssignableFrom(cls2)) {
                    z4 = true;
                }
                this.isEnum = z4;
                return;
            }
        }
        if (!(type2 instanceof Class)) {
            Type fieldType2 = getFieldType(cls, type == null ? cls : type, type2);
            if (fieldType2 != type2) {
                if (fieldType2 instanceof ParameterizedType) {
                    cls2 = TypeUtils.getClass(fieldType2);
                } else if (fieldType2 instanceof Class) {
                    cls2 = TypeUtils.getClass(fieldType2);
                }
            }
            type2 = fieldType2;
        }
        this.fieldType = type2;
        this.fieldClass = cls2;
        if (!cls2.isArray() && cls2.isEnum() && !JSONAware.class.isAssignableFrom(cls2)) {
            z4 = true;
        }
        this.isEnum = z4;
    }
}
