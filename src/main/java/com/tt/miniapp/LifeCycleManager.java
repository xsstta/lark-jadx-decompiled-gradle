package com.tt.miniapp;

import com.tt.miniapp.AppbrandServiceManager;
import com.tt.miniapphost.entity.AppInfoEntity;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LifeCycleManager extends AppbrandServiceManager.ServiceBase {
    private List<Listener> mListeners = new ArrayList();

    public enum LifeCycleEvent {
        ON_APP_CREATE,
        ON_APP_START_LAUNCHING,
        ON_APP_INFO_INITED,
        ON_APP_SHOW,
        ON_APP_HIDE,
        ON_APP_INSTALL_SUCCESS,
        ON_SUB_APP_INSTALL_SUCCESS
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface LifecycleInterest {
        LifeCycleEvent[] value();
    }

    public synchronized void notifyAppCreate() {
        notifyEventLocked(LifeCycleEvent.ON_APP_CREATE, null);
    }

    public synchronized void notifyAppHide() {
        notifyEventLocked(LifeCycleEvent.ON_APP_HIDE, null);
    }

    public synchronized void notifyAppShow() {
        notifyEventLocked(LifeCycleEvent.ON_APP_SHOW, null);
    }

    public synchronized void notifyAppStartLaunching() {
        notifyEventLocked(LifeCycleEvent.ON_APP_START_LAUNCHING, null);
    }

    public synchronized void notifyMiniAppInstallSuccess() {
        notifyEventLocked(LifeCycleEvent.ON_APP_INSTALL_SUCCESS, null);
    }

    LifeCycleManager(AppbrandApplicationImpl appbrandApplicationImpl) {
        super(appbrandApplicationImpl);
    }

    public synchronized void addLifeCycleListener(AppbrandServiceManager.ServiceBase serviceBase) {
        this.mListeners.add(new Listener(serviceBase));
    }

    public synchronized void notifyAppInfoInited(AppInfoEntity appInfoEntity) {
        notifyEventLocked(LifeCycleEvent.ON_APP_INFO_INITED, appInfoEntity);
    }

    public synchronized void notifyMiniSubAppInstallSuccess(String str) {
        notifyEventLocked(LifeCycleEvent.ON_SUB_APP_INSTALL_SUCCESS, str);
    }

    public synchronized void removeLifeCycleListener(AppbrandServiceManager.ServiceBase serviceBase) {
        Iterator<Listener> it = this.mListeners.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mOwner == serviceBase) {
                    it.remove();
                    break;
                }
            } else {
                break;
            }
        }
    }

    public void checkMethod(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length;
        if (length != 0) {
            if (!parameterTypes[0].equals(LifeCycleEvent.class)) {
                throw new IllegalArgumentException("LifecycleInterest注解的方法要么无参数，要么第一个参数必须为LifeCycleEvent类型");
            } else if (length > 2) {
                throw new UnsupportedOperationException("LifecycleInterest注解的方法最多只能有两个参数");
            }
        }
    }

    private void notifyEventLocked(LifeCycleEvent lifeCycleEvent, Object obj) {
        for (Listener listener : this.mListeners) {
            Method method = listener.mInterestMethods[lifeCycleEvent.ordinal()];
            if (method != null) {
                int length = method.getParameterTypes().length;
                if (length == 0) {
                    try {
                        method.invoke(listener.mOwner, new Object[0]);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                } else if (length == 1) {
                    method.invoke(listener.mOwner, lifeCycleEvent);
                } else {
                    method.invoke(listener.mOwner, lifeCycleEvent, obj);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public class Listener {
        Method[] mInterestMethods = new Method[LifeCycleEvent.values().length];
        Object mOwner;

        Listener(Object obj) {
            this.mOwner = obj;
            Method[] methods = this.mOwner.getClass().getMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(LifecycleInterest.class)) {
                    LifeCycleEvent[] value = ((LifecycleInterest) method.getAnnotation(LifecycleInterest.class)).value();
                    for (LifeCycleEvent lifeCycleEvent : value) {
                        if (this.mInterestMethods[lifeCycleEvent.ordinal()] == null) {
                            LifeCycleManager.this.checkMethod(method);
                            this.mInterestMethods[lifeCycleEvent.ordinal()] = method;
                        } else {
                            throw new IllegalStateException("超过一个方法注解了相同的事件, " + lifeCycleEvent.name() + "class: \"" + obj.getClass().getSimpleName() + "\", method: \"" + this.mInterestMethods[lifeCycleEvent.ordinal()] + "\" 和 \"" + method + "\"");
                        }
                    }
                    continue;
                }
            }
        }
    }
}
