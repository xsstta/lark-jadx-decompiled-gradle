package com.ss.android.eventbus.collector;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.eventbus.BaseEventListener;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.Subscribe;
import com.ss.android.eventbus.ThreadMode;
import java.lang.reflect.Method;

public class CollectorReflectionImpl implements ICollector {
    @Override // com.ss.android.eventbus.collector.ICollector
    public void unRegister(Object obj) {
        EventBus.getDefault().unregister(obj);
    }

    @Override // com.ss.android.eventbus.collector.ICollector
    public void register(final Object obj) {
        if (obj != null) {
            Method[] declaredMethods = obj.getClass().getDeclaredMethods();
            for (final Method method : declaredMethods) {
                if (method.isAnnotationPresent(Subscribe.class)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    final ThreadMode threadMode = ((Subscribe) method.getAnnotation(Subscribe.class)).threadMode();
                    EventBus.getDefault().register(obj, parameterTypes[0].asSubclass(BaseEvent.class), new BaseEventListener() {
                        /* class com.ss.android.eventbus.collector.CollectorReflectionImpl.C284521 */

                        @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
                        public void onEvent(BaseEvent baseEvent) {
                            EventBus.getDefault().invokeEventHandler(obj, new BaseEventListener() {
                                /* class com.ss.android.eventbus.collector.CollectorReflectionImpl.C284521.C284531 */

                                @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
                                public void onEvent(BaseEvent baseEvent) {
                                    try {
                                        method.invoke(obj, baseEvent);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        RuntimeException runtimeException = new RuntimeException();
                                        runtimeException.initCause(e);
                                        throw runtimeException;
                                    }
                                }
                            }, baseEvent, threadMode);
                        }
                    }, threadMode);
                }
            }
        }
    }
}
