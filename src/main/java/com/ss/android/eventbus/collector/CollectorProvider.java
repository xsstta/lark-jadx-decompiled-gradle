package com.ss.android.eventbus.collector;

public class CollectorProvider {
    private static final ICollector COMPILER_COLLECTOR;
    private static final ICollector DEFAULT_COLLECTOR;
    private static final ICollector REFLECTION_COLLECTOR = new CollectorReflectionImpl();

    public static ICollector getCompilerCollector() {
        return COMPILER_COLLECTOR;
    }

    public static ICollector getDefaultCollector() {
        return DEFAULT_COLLECTOR;
    }

    public static ICollector getReflectionCollector() {
        return REFLECTION_COLLECTOR;
    }

    static {
        CollectorCompileImpl collectorCompileImpl = new CollectorCompileImpl();
        COMPILER_COLLECTOR = collectorCompileImpl;
        DEFAULT_COLLECTOR = collectorCompileImpl;
    }
}
