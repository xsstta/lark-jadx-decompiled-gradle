package com.lark.falcon.engine.bridge;

import com.lark.falcon.engine.base.C23952a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JavaMethodWrapper {
    private static final AbstractC23961a<ReadableArray> ARGUMENT_EXTRACTOR_ARRAY = new AbstractC23961a<ReadableArray>() {
        /* class com.lark.falcon.engine.bridge.JavaMethodWrapper.C239586 */

        /* renamed from: a */
        public ReadableArray mo85976b(ReadableArray readableArray, int i) {
            return readableArray.getArray(i);
        }
    };
    private static final AbstractC23961a<Boolean> ARGUMENT_EXTRACTOR_BOOLEAN = new AbstractC23961a<Boolean>() {
        /* class com.lark.falcon.engine.bridge.JavaMethodWrapper.C239531 */

        /* renamed from: a */
        public Boolean mo85976b(ReadableArray readableArray, int i) {
            return Boolean.valueOf(readableArray.getBoolean(i));
        }
    };
    private static final AbstractC23961a<Double> ARGUMENT_EXTRACTOR_DOUBLE = new AbstractC23961a<Double>() {
        /* class com.lark.falcon.engine.bridge.JavaMethodWrapper.C239542 */

        /* renamed from: a */
        public Double mo85976b(ReadableArray readableArray, int i) {
            return Double.valueOf(readableArray.getDouble(i));
        }
    };
    private static final AbstractC23961a<AbstractC23967a> ARGUMENT_EXTRACTOR_DYNAMIC = new AbstractC23961a<AbstractC23967a>() {
        /* class com.lark.falcon.engine.bridge.JavaMethodWrapper.C239597 */

        /* renamed from: a */
        public AbstractC23967a mo85976b(ReadableArray readableArray, int i) {
            return C23968b.m87614a(readableArray, i);
        }
    };
    private static final AbstractC23961a<Float> ARGUMENT_EXTRACTOR_FLOAT = new AbstractC23961a<Float>() {
        /* class com.lark.falcon.engine.bridge.JavaMethodWrapper.C239553 */

        /* renamed from: a */
        public Float mo85976b(ReadableArray readableArray, int i) {
            return Float.valueOf((float) readableArray.getDouble(i));
        }
    };
    private static final AbstractC23961a<Integer> ARGUMENT_EXTRACTOR_INTEGER = new AbstractC23961a<Integer>() {
        /* class com.lark.falcon.engine.bridge.JavaMethodWrapper.C239564 */

        /* renamed from: a */
        public Integer mo85976b(ReadableArray readableArray, int i) {
            return Integer.valueOf((int) readableArray.getDouble(i));
        }
    };
    private static final AbstractC23961a<ReadableMap> ARGUMENT_EXTRACTOR_MAP = new AbstractC23961a<ReadableMap>() {
        /* class com.lark.falcon.engine.bridge.JavaMethodWrapper.C239608 */

        /* renamed from: a */
        public ReadableMap mo85976b(ReadableArray readableArray, int i) {
            return readableArray.getMap(i);
        }
    };
    private static final AbstractC23961a<String> ARGUMENT_EXTRACTOR_STRING = new AbstractC23961a<String>() {
        /* class com.lark.falcon.engine.bridge.JavaMethodWrapper.C239575 */

        /* renamed from: a */
        public String mo85976b(ReadableArray readableArray, int i) {
            return readableArray.getString(i);
        }
    };
    private AbstractC23961a[] mArgumentExtractors;
    private Object[] mArguments;
    private boolean mArgumentsProcessed;
    private int mJSArgumentsNeeded;
    private final Method mMethod;
    private final JavaModuleWrapper mModuleWrapper;
    private final int mParamLength;
    private final Class[] mParameterTypes;
    private String mSignature;
    private String mType = "";

    public String getType() {
        return null;
    }

    /* renamed from: com.lark.falcon.engine.bridge.JavaMethodWrapper$a */
    private static abstract class AbstractC23961a<T> {
        /* renamed from: a */
        public int mo85984a() {
            return 1;
        }

        /* renamed from: b */
        public abstract T mo85976b(ReadableArray readableArray, int i);

        private AbstractC23961a() {
        }
    }

    public Method getMethod() {
        return this.mMethod;
    }

    public String getSignature() {
        if (!this.mArgumentsProcessed) {
            processArguments();
        }
        return (String) C23952a.m87592a(this.mSignature);
    }

    private int calculateJSArgumentsNeeded() {
        int i = 0;
        for (AbstractC23961a aVar : (AbstractC23961a[]) C23952a.m87592a(this.mArgumentExtractors)) {
            i += aVar.mo85984a();
        }
        return i;
    }

    private void processArguments() {
        if (!this.mArgumentsProcessed) {
            this.mArgumentsProcessed = true;
            this.mSignature = buildSignature(this.mMethod, this.mParameterTypes, true);
        }
    }

    private static char paramTypeToChar(Class cls) {
        char commonTypeToChar = commonTypeToChar(cls);
        if (commonTypeToChar != 0) {
            return commonTypeToChar;
        }
        if (cls == ReadableMap.class) {
            return 'M';
        }
        if (cls == ReadableArray.class) {
            return 'A';
        }
        if (cls == AbstractC23967a.class) {
            return 'Y';
        }
        throw new RuntimeException("Got unknown param class: " + cls.getSimpleName());
    }

    public static char returnTypeToChar(Class cls) {
        char commonTypeToChar = commonTypeToChar(cls);
        if (commonTypeToChar != 0) {
            return commonTypeToChar;
        }
        if (cls == Void.TYPE) {
            return 'v';
        }
        if (cls == WritableMap.class) {
            return 'M';
        }
        if (cls == WritableArray.class) {
            return 'A';
        }
        throw new RuntimeException("Got unknown return class: " + cls.getSimpleName());
    }

    private static char commonTypeToChar(Class cls) {
        if (cls == Boolean.TYPE) {
            return 'z';
        }
        if (cls == Boolean.class) {
            return 'Z';
        }
        if (cls == Integer.TYPE) {
            return 'i';
        }
        if (cls == Integer.class) {
            return 'I';
        }
        if (cls == Short.TYPE) {
            return 's';
        }
        if (cls == Short.class) {
            return 'S';
        }
        if (cls == Double.TYPE) {
            return 'd';
        }
        if (cls == Double.class) {
            return 'D';
        }
        if (cls == Float.TYPE) {
            return 'f';
        }
        if (cls == Float.class) {
            return 'F';
        }
        if (cls == String.class) {
            return 'T';
        }
        if (cls == Byte.TYPE) {
            return 'b';
        }
        if (cls == Byte.class) {
            return 'B';
        }
        if (cls == Long.TYPE) {
            return 'l';
        }
        if (cls == Long.class) {
            return 'L';
        }
        if (cls == byte[].class) {
            return 'a';
        }
        return 0;
    }

    private AbstractC23961a[] buildArgumentExtractors(Class[] clsArr) {
        AbstractC23961a[] aVarArr = new AbstractC23961a[clsArr.length];
        for (int i = 0; i < clsArr.length; i += aVarArr[i].mo85984a()) {
            Class cls = clsArr[i];
            if (cls == Boolean.class || cls == Boolean.TYPE) {
                aVarArr[i] = ARGUMENT_EXTRACTOR_BOOLEAN;
            } else if (cls == Integer.class || cls == Integer.TYPE) {
                aVarArr[i] = ARGUMENT_EXTRACTOR_INTEGER;
            } else if (cls == Double.class || cls == Double.TYPE) {
                aVarArr[i] = ARGUMENT_EXTRACTOR_DOUBLE;
            } else if (cls == Float.class || cls == Float.TYPE) {
                aVarArr[i] = ARGUMENT_EXTRACTOR_FLOAT;
            } else if (cls == String.class) {
                aVarArr[i] = ARGUMENT_EXTRACTOR_STRING;
            } else if (cls == ReadableMap.class) {
                aVarArr[i] = ARGUMENT_EXTRACTOR_MAP;
            } else if (cls == ReadableArray.class) {
                aVarArr[i] = ARGUMENT_EXTRACTOR_ARRAY;
            } else if (cls == AbstractC23967a.class) {
                aVarArr[i] = ARGUMENT_EXTRACTOR_DYNAMIC;
            } else {
                throw new RuntimeException("Got unknown argument class: " + cls.getSimpleName());
            }
        }
        return aVarArr;
    }

    public void invoke(ReadableArray readableArray) {
        String str = this.mModuleWrapper.getName() + "." + this.mMethod.getName();
        if (!this.mArgumentsProcessed) {
            processArguments();
        }
        if (this.mArguments == null || this.mArgumentExtractors == null) {
            throw new Error("processArguments failed");
        } else if (this.mJSArgumentsNeeded == readableArray.size()) {
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    AbstractC23961a[] aVarArr = this.mArgumentExtractors;
                    if (i < aVarArr.length) {
                        this.mArguments[i] = aVarArr[i].mo85976b(readableArray, i2);
                        i2 += this.mArgumentExtractors[i].mo85984a();
                        i++;
                    } else {
                        try {
                            this.mMethod.invoke(this.mModuleWrapper.getModule(), this.mArguments);
                            return;
                        } catch (IllegalArgumentException e) {
                            throw new RuntimeException("Could not invoke " + str, e);
                        } catch (IllegalAccessException e2) {
                            throw new RuntimeException("Could not invoke " + str, e2);
                        } catch (InvocationTargetException e3) {
                            if (e3.getCause() instanceof RuntimeException) {
                                throw ((RuntimeException) e3.getCause());
                            }
                            throw new RuntimeException("Could not invoke " + str, e3);
                        }
                    }
                } catch (UnexpectedNativeTypeException e4) {
                    throw new NativeArgumentsParseException(e4.getMessage() + " (constructing arguments for " + str + " at argument index " + getAffectedRange(i2, this.mArgumentExtractors[i].mo85984a()) + ")", e4);
                }
            }
        } else {
            throw new NativeArgumentsParseException(str + " got " + readableArray.size() + " arguments, expected " + this.mJSArgumentsNeeded);
        }
    }

    public JavaMethodWrapper(JavaModuleWrapper javaModuleWrapper, Method method) {
        this.mModuleWrapper = javaModuleWrapper;
        this.mMethod = method;
        method.setAccessible(true);
        Class<?>[] parameterTypes = method.getParameterTypes();
        this.mParameterTypes = parameterTypes;
        this.mParamLength = parameterTypes.length;
    }

    private String getAffectedRange(int i, int i2) {
        if (i2 > 1) {
            return "" + i + "-" + ((i + i2) - 1);
        }
        return "" + i;
    }

    private String buildSignature(Method method, Class[] clsArr, boolean z) {
        StringBuilder sb = new StringBuilder(clsArr.length + 2);
        if (z) {
            sb.append(returnTypeToChar(method.getReturnType()));
            sb.append('.');
        } else {
            sb.append("v.");
        }
        for (Class cls : clsArr) {
            sb.append(paramTypeToChar(cls));
        }
        return sb.toString();
    }
}
