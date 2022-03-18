package com.ss.android.eventbus;

import android.util.Log;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
public class EventBusInternal {
    private static volatile EventBusInternal defaultBus;
    private Map<Class, List<BaseEventListener>> mEventListenerMap = new ConcurrentHashMap();

    private EventBusInternal() {
    }

    public static EventBusInternal getDefault() {
        if (defaultBus == null) {
            synchronized (EventBusInternal.class) {
                if (defaultBus == null) {
                    defaultBus = new EventBusInternal();
                }
            }
        }
        return defaultBus;
    }

    public <T extends BaseEvent> void register(BaseEventListener<T> baseEventListener) {
        register(getRawType(baseEventListener), baseEventListener);
    }

    public <T extends BaseEvent> void trigger(T t) {
        trigger(t.getClass(), t);
    }

    public <T extends BaseEvent> void unregister(BaseEventListener<T> baseEventListener) {
        unregister(getRawType(baseEventListener), baseEventListener);
    }

    public static Class<?> getRawType(BaseEventListener<?> baseEventListener) {
        return (Class) ((ParameterizedType) baseEventListener.getClass().getGenericInterfaces()[0]).getActualTypeArguments()[0];
    }

    public <T extends BaseEvent> void register(Class<T> cls, BaseEventListener<T> baseEventListener) {
        List<BaseEventListener> list = this.mEventListenerMap.get(cls);
        if (list == null) {
            list = new LinkedList<>();
            this.mEventListenerMap.put(cls, list);
        }
        if (list.indexOf(baseEventListener) != -1) {
            Log.e("EventBus", "listener already exist,do not register again: " + baseEventListener);
            return;
        }
        list.add(baseEventListener);
    }

    public <T extends BaseEvent> void trigger(Class<T> cls, T t) {
        List<BaseEventListener> list = this.mEventListenerMap.get(cls);
        if (!(list == null || list.isEmpty())) {
            for (BaseEventListener baseEventListener : new ArrayList(list)) {
                if (baseEventListener == null || baseEventListener.isDestory()) {
                    Log.e("EventBus", "listener is destroy, can not be triggered!");
                } else {
                    baseEventListener.onEvent(t);
                }
            }
        }
    }

    public <T extends BaseEvent> void unregister(Class<T> cls, BaseEventListener<T> baseEventListener) {
        List<BaseEventListener> list = this.mEventListenerMap.get(cls);
        if (list == null || !list.contains(baseEventListener)) {
            Log.e("EventBus", "listener not exist, can not unregister: " + baseEventListener);
            return;
        }
        list.remove(baseEventListener);
        baseEventListener.setDestory(true);
    }
}
