package com.facebook.react.bridge;

import com.facebook.infer.annotation.C21045a;
import com.facebook.p946a.p949b.C20987c;
import com.facebook.p946a.p950c.C20988a;
import com.facebook.react.bridge.NativeModule;
import com.facebook.systrace.C21273a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JavaMethodWrapper implements NativeModule.NativeMethod {
    private static final ArgumentExtractor<ReadableArray> ARGUMENT_EXTRACTOR_ARRAY = new ArgumentExtractor<ReadableArray>() {
        /* class com.facebook.react.bridge.JavaMethodWrapper.C210856 */

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public ReadableArray extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return readableArray.getArray(i);
        }
    };
    private static final ArgumentExtractor<Boolean> ARGUMENT_EXTRACTOR_BOOLEAN = new ArgumentExtractor<Boolean>() {
        /* class com.facebook.react.bridge.JavaMethodWrapper.C210801 */

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Boolean extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Boolean.valueOf(readableArray.getBoolean(i));
        }
    };
    public static final ArgumentExtractor<Callback> ARGUMENT_EXTRACTOR_CALLBACK = new ArgumentExtractor<Callback>() {
        /* class com.facebook.react.bridge.JavaMethodWrapper.C210889 */

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Callback extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            if (readableArray.isNull(i)) {
                return null;
            }
            return new CallbackImpl(jSInstance, (int) readableArray.getDouble(i));
        }
    };
    private static final ArgumentExtractor<Double> ARGUMENT_EXTRACTOR_DOUBLE = new ArgumentExtractor<Double>() {
        /* class com.facebook.react.bridge.JavaMethodWrapper.C210812 */

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Double extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Double.valueOf(readableArray.getDouble(i));
        }
    };
    private static final ArgumentExtractor<Dynamic> ARGUMENT_EXTRACTOR_DYNAMIC = new ArgumentExtractor<Dynamic>() {
        /* class com.facebook.react.bridge.JavaMethodWrapper.C210867 */

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Dynamic extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return DynamicFromArray.create(readableArray, i);
        }
    };
    private static final ArgumentExtractor<Float> ARGUMENT_EXTRACTOR_FLOAT = new ArgumentExtractor<Float>() {
        /* class com.facebook.react.bridge.JavaMethodWrapper.C210823 */

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Float extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Float.valueOf((float) readableArray.getDouble(i));
        }
    };
    private static final ArgumentExtractor<Integer> ARGUMENT_EXTRACTOR_INTEGER = new ArgumentExtractor<Integer>() {
        /* class com.facebook.react.bridge.JavaMethodWrapper.C210834 */

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Integer extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Integer.valueOf((int) readableArray.getDouble(i));
        }
    };
    private static final ArgumentExtractor<ReadableMap> ARGUMENT_EXTRACTOR_MAP = new ArgumentExtractor<ReadableMap>() {
        /* class com.facebook.react.bridge.JavaMethodWrapper.C210878 */

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public ReadableMap extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return readableArray.getMap(i);
        }
    };
    private static final ArgumentExtractor<Promise> ARGUMENT_EXTRACTOR_PROMISE = new ArgumentExtractor<Promise>() {
        /* class com.facebook.react.bridge.JavaMethodWrapper.AnonymousClass10 */

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public int getJSArgumentsNeeded() {
            return 2;
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Promise extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return new PromiseImpl(JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableArray, i), JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableArray, i + 1));
        }
    };
    private static final ArgumentExtractor<String> ARGUMENT_EXTRACTOR_STRING = new ArgumentExtractor<String>() {
        /* class com.facebook.react.bridge.JavaMethodWrapper.C210845 */

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public String extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return readableArray.getString(i);
        }
    };
    private static final boolean DEBUG = C20987c.m76482a().mo71084a(C20988a.f51370d);
    private ArgumentExtractor[] mArgumentExtractors;
    private Object[] mArguments;
    private boolean mArgumentsProcessed;
    private int mJSArgumentsNeeded;
    private final Method mMethod;
    private final JavaModuleWrapper mModuleWrapper;
    private final int mParamLength;
    private final Class[] mParameterTypes;
    private String mSignature;
    private String mType = "async";

    /* access modifiers changed from: private */
    public static abstract class ArgumentExtractor<T> {
        public abstract T extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i);

        public int getJSArgumentsNeeded() {
            return 1;
        }

        private ArgumentExtractor() {
        }
    }

    public Method getMethod() {
        return this.mMethod;
    }

    @Override // com.facebook.react.bridge.NativeModule.NativeMethod
    public String getType() {
        return this.mType;
    }

    public String getSignature() {
        if (!this.mArgumentsProcessed) {
            processArguments();
        }
        return (String) C21045a.m76676a(this.mSignature);
    }

    private int calculateJSArgumentsNeeded() {
        int i = 0;
        for (ArgumentExtractor argumentExtractor : (ArgumentExtractor[]) C21045a.m76676a(this.mArgumentExtractors)) {
            i += argumentExtractor.getJSArgumentsNeeded();
        }
        return i;
    }

    private void processArguments() {
        if (!this.mArgumentsProcessed) {
            C21273a.AbstractC21275a a = C21273a.m77086a(0, "processArguments");
            a.mo72176a("method", this.mModuleWrapper.getName() + "." + this.mMethod.getName()).mo72177a();
            try {
                this.mArgumentsProcessed = true;
                this.mArgumentExtractors = buildArgumentExtractors(this.mParameterTypes);
                this.mSignature = buildSignature(this.mMethod, this.mParameterTypes, this.mType.equals("sync"));
                this.mArguments = new Object[this.mParameterTypes.length];
                this.mJSArgumentsNeeded = calculateJSArgumentsNeeded();
            } finally {
                C21273a.m77085a(0).mo72177a();
            }
        }
    }

    private static char returnTypeToChar(Class cls) {
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
            return 'S';
        }
        return 0;
    }

    private static char paramTypeToChar(Class cls) {
        char commonTypeToChar = commonTypeToChar(cls);
        if (commonTypeToChar != 0) {
            return commonTypeToChar;
        }
        if (cls == Callback.class) {
            return 'X';
        }
        if (cls == Promise.class) {
            return 'P';
        }
        if (cls == ReadableMap.class) {
            return 'M';
        }
        if (cls == ReadableArray.class) {
            return 'A';
        }
        if (cls == Dynamic.class) {
            return 'Y';
        }
        throw new RuntimeException("Got unknown param class: " + cls.getSimpleName());
    }

    private ArgumentExtractor[] buildArgumentExtractors(Class[] clsArr) {
        ArgumentExtractor[] argumentExtractorArr = new ArgumentExtractor[clsArr.length];
        for (int i = 0; i < clsArr.length; i += argumentExtractorArr[i].getJSArgumentsNeeded()) {
            Class cls = clsArr[i];
            if (cls == Boolean.class || cls == Boolean.TYPE) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_BOOLEAN;
            } else if (cls == Integer.class || cls == Integer.TYPE) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_INTEGER;
            } else if (cls == Double.class || cls == Double.TYPE) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_DOUBLE;
            } else if (cls == Float.class || cls == Float.TYPE) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_FLOAT;
            } else if (cls == String.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_STRING;
            } else if (cls == Callback.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_CALLBACK;
            } else if (cls == Promise.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_PROMISE;
                boolean z = true;
                if (i != clsArr.length - 1) {
                    z = false;
                }
                C21045a.m76679a(z, "Promise must be used as last parameter only");
            } else if (cls == ReadableMap.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_MAP;
            } else if (cls == ReadableArray.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_ARRAY;
            } else if (cls == Dynamic.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_DYNAMIC;
            } else {
                throw new RuntimeException("Got unknown argument class: " + cls.getSimpleName());
            }
        }
        return argumentExtractorArr;
    }

    private String getAffectedRange(int i, int i2) {
        if (i2 > 1) {
            return "" + i + "-" + ((i + i2) - 1);
        }
        return "" + i;
    }

    @Override // com.facebook.react.bridge.NativeModule.NativeMethod
    public void invoke(JSInstance jSInstance, ReadableArray readableArray) {
        String str = this.mModuleWrapper.getName() + "." + this.mMethod.getName();
        C21273a.m77086a(0, "callJavaModuleMethod").mo72176a("method", str).mo72177a();
        int i = 0;
        if (DEBUG) {
            C20987c.m76482a().mo71083a(C20988a.f51370d, "JS->Java: %s.%s()", this.mModuleWrapper.getName(), this.mMethod.getName());
        }
        try {
            if (!this.mArgumentsProcessed) {
                processArguments();
            }
            if (this.mArguments == null || this.mArgumentExtractors == null) {
                throw new Error("processArguments failed");
            } else if (this.mJSArgumentsNeeded == readableArray.size()) {
                int i2 = 0;
                while (true) {
                    try {
                        ArgumentExtractor[] argumentExtractorArr = this.mArgumentExtractors;
                        if (i < argumentExtractorArr.length) {
                            this.mArguments[i] = argumentExtractorArr[i].extractArgument(jSInstance, readableArray, i2);
                            i2 += this.mArgumentExtractors[i].getJSArgumentsNeeded();
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
                        throw new NativeArgumentsParseException(e4.getMessage() + " (constructing arguments for " + str + " at argument index " + getAffectedRange(i2, this.mArgumentExtractors[i].getJSArgumentsNeeded()) + ")", e4);
                    }
                }
            } else {
                throw new NativeArgumentsParseException(str + " got " + readableArray.size() + " arguments, expected " + this.mJSArgumentsNeeded);
            }
        } finally {
            C21273a.m77085a(0).mo72177a();
        }
    }

    public JavaMethodWrapper(JavaModuleWrapper javaModuleWrapper, Method method, boolean z) {
        this.mModuleWrapper = javaModuleWrapper;
        this.mMethod = method;
        method.setAccessible(true);
        Class<?>[] parameterTypes = method.getParameterTypes();
        this.mParameterTypes = parameterTypes;
        int length = parameterTypes.length;
        this.mParamLength = length;
        if (z) {
            this.mType = "sync";
        } else if (length > 0 && parameterTypes[length - 1] == Promise.class) {
            this.mType = "promise";
        }
    }

    private String buildSignature(Method method, Class[] clsArr, boolean z) {
        StringBuilder sb = new StringBuilder(clsArr.length + 2);
        if (z) {
            sb.append(returnTypeToChar(method.getReturnType()));
            sb.append('.');
        } else {
            sb.append("v.");
        }
        for (int i = 0; i < clsArr.length; i++) {
            Class cls = clsArr[i];
            if (cls == Promise.class) {
                boolean z2 = true;
                if (i != clsArr.length - 1) {
                    z2 = false;
                }
                C21045a.m76679a(z2, "Promise must be used as last parameter only");
            }
            sb.append(paramTypeToChar(cls));
        }
        return sb.toString();
    }
}
