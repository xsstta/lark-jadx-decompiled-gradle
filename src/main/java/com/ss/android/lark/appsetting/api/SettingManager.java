package com.ss.android.lark.appsetting.api;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.appsetting.annotation.AppConfig;
import com.ss.android.lark.appsetting.api.utils.ReflectUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Scheduler;
import io.reactivex.functions.Consumer;
import io.reactivex.p3457e.C68296b;

public class SettingManager {

    /* renamed from: com.ss.android.lark.appsetting.api.SettingManager$a */
    private static class C29210a {

        /* renamed from: a */
        public static SettingManager f73145a = new SettingManager();
    }

    private SettingManager() {
    }

    public static SettingManager getInstance() {
        return C29210a.f73145a;
    }

    public String getString(Class<?> cls) {
        String innerGetString = innerGetString(cls);
        if (innerGetString == null) {
            return "";
        }
        return innerGetString;
    }

    private String innerGetString(Class<?> cls) {
        if (cls != null) {
            AppConfig a = C29219d.m107477a().mo103624a(cls);
            if (a == null) {
                Log.m165383e("SettingManager", "failed to get setting config, param clazz must be isAnnotationPresent by AppConfig Annotation.");
                return "";
            }
            return C29219d.m107477a().mo103626a(a.key(), a.needDiskCache());
        }
        Log.m165383e("SettingManager", "failed to get setting config, param clazz mustn't be null.");
        throw new IllegalArgumentException("param clazz is null.");
    }

    public boolean getBoolean(Class<?> cls) {
        return Boolean.valueOf(innerGetString(cls)).booleanValue();
    }

    public double getDouble(Class<?> cls) {
        String innerGetString = innerGetString(cls);
        try {
            return Double.parseDouble(innerGetString);
        } catch (NumberFormatException e) {
            Log.m165383e("SettingManager", "failed to parseDouble, value: " + innerGetString + ", e:" + e);
            return 0.0d;
        }
    }

    public int getInt(Class<?> cls) {
        String innerGetString = innerGetString(cls);
        try {
            return Integer.parseInt(innerGetString);
        } catch (NumberFormatException e) {
            Log.m165383e("SettingManager", "failed to parseInt, value: " + innerGetString + ", e:" + e);
            return 0;
        }
    }

    public <T> T get(Class<T> cls) {
        if (cls != null) {
            T t = (T) C29219d.m107477a().mo103625a(cls.getName());
            if (t != null) {
                return t;
            }
            String innerGetString = innerGetString(cls);
            if (TextUtils.isEmpty(innerGetString)) {
                Log.m165383e("SettingManager", "failed to get setting config, clazz:" + cls + ", value:" + innerGetString);
                return (T) ReflectUtils.f73164a.mo103621a(cls);
            }
            T t2 = (T) C29222e.m107485a(cls, innerGetString, C29219d.m107477a().mo103624a(cls).parse());
            C29219d.m107477a().mo103627a(cls.getName(), t2);
            return t2;
        }
        Log.m165383e("SettingManager", "failed to get setting config, param clazz mustn't be null.");
        throw new IllegalArgumentException("param clazz is null.");
    }

    static /* synthetic */ void lambda$get$1(IGetDataCallback iGetDataCallback, Object obj) throws Exception {
        if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(obj);
        }
    }

    static /* synthetic */ void lambda$getBoolean$7(IGetDataCallback iGetDataCallback, Boolean bool) throws Exception {
        if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(bool);
        }
    }

    static /* synthetic */ void lambda$getDouble$13(IGetDataCallback iGetDataCallback, Double d) throws Exception {
        if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(d);
        }
    }

    static /* synthetic */ void lambda$getInt$10(IGetDataCallback iGetDataCallback, Integer num) throws Exception {
        if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(num);
        }
    }

    static /* synthetic */ void lambda$getString$4(IGetDataCallback iGetDataCallback, String str) throws Exception {
        if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(str);
        }
    }

    static /* synthetic */ void lambda$get$2(IGetDataCallback iGetDataCallback, Throwable th) throws Exception {
        if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult(th.getMessage()));
        }
    }

    static /* synthetic */ void lambda$getBoolean$8(IGetDataCallback iGetDataCallback, Throwable th) throws Exception {
        if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult(th.getMessage()));
        }
    }

    static /* synthetic */ void lambda$getDouble$14(IGetDataCallback iGetDataCallback, Throwable th) throws Exception {
        if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult(th.getMessage()));
        }
    }

    static /* synthetic */ void lambda$getInt$11(IGetDataCallback iGetDataCallback, Throwable th) throws Exception {
        if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult(th.getMessage()));
        }
    }

    static /* synthetic */ void lambda$getString$5(IGetDataCallback iGetDataCallback, Throwable th) throws Exception {
        if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult(th.getMessage()));
        }
    }

    public <T> void get(Class<T> cls, IGetDataCallback<T> iGetDataCallback) {
        get(cls, LarkRxSchedulers.io(), LarkRxSchedulers.mainThread(), iGetDataCallback);
    }

    public void getBoolean(Class cls, IGetDataCallback<Boolean> iGetDataCallback) {
        get(cls, LarkRxSchedulers.io(), LarkRxSchedulers.mainThread(), iGetDataCallback);
    }

    public void getDouble(Class cls, IGetDataCallback<Double> iGetDataCallback) {
        get(cls, LarkRxSchedulers.io(), LarkRxSchedulers.mainThread(), iGetDataCallback);
    }

    public void getInt(Class cls, IGetDataCallback<Integer> iGetDataCallback) {
        get(cls, LarkRxSchedulers.io(), LarkRxSchedulers.mainThread(), iGetDataCallback);
    }

    public /* synthetic */ void lambda$get$0$SettingManager(Class cls, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(get(cls));
        observableEmitter.onComplete();
    }

    public /* synthetic */ void lambda$getBoolean$6$SettingManager(Class cls, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(Boolean.valueOf(getBoolean(cls)));
        observableEmitter.onComplete();
    }

    public /* synthetic */ void lambda$getDouble$12$SettingManager(Class cls, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(Double.valueOf(getDouble(cls)));
        observableEmitter.onComplete();
    }

    public /* synthetic */ void lambda$getInt$9$SettingManager(Class cls, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(Integer.valueOf(getInt(cls)));
        observableEmitter.onComplete();
    }

    public /* synthetic */ void lambda$getString$3$SettingManager(Class cls, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(getString(cls));
        observableEmitter.onComplete();
    }

    public void getString(Class cls, IGetDataCallback<String> iGetDataCallback) {
        get(cls, LarkRxSchedulers.io(), LarkRxSchedulers.mainThread(), iGetDataCallback);
    }

    public <T> void get(Class<T> cls, Scheduler scheduler, Scheduler scheduler2, IGetDataCallback<T> iGetDataCallback) {
        C68296b.create(new ObservableOnSubscribe(cls) {
            /* class com.ss.android.lark.appsetting.api.$$Lambda$SettingManager$6usb7X6Bl34WQtzOU7Ocmpzu2ak */
            public final /* synthetic */ Class f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                SettingManager.this.lambda$get$0$SettingManager(this.f$1, observableEmitter);
            }
        }).subscribeOn(scheduler).observeOn(scheduler2).subscribe(new Consumer() {
            /* class com.ss.android.lark.appsetting.api.$$Lambda$SettingManager$IkupUJTby3bkL5xyuBJ4bdfsyLM */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SettingManager.lambda$get$1(IGetDataCallback.this, obj);
            }
        }, new Consumer() {
            /* class com.ss.android.lark.appsetting.api.$$Lambda$SettingManager$hxWU80jQP_Zy9cxJYkUe0dMhOI */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SettingManager.lambda$get$2(IGetDataCallback.this, (Throwable) obj);
            }
        });
    }

    public void getBoolean(Class cls, Scheduler scheduler, Scheduler scheduler2, IGetDataCallback<Boolean> iGetDataCallback) {
        C68296b.create(new ObservableOnSubscribe(cls) {
            /* class com.ss.android.lark.appsetting.api.$$Lambda$SettingManager$jkHsIYJVGBpVf2436baPdQoZalA */
            public final /* synthetic */ Class f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                SettingManager.this.lambda$getBoolean$6$SettingManager(this.f$1, observableEmitter);
            }
        }).subscribeOn(scheduler).observeOn(scheduler2).subscribe(new Consumer() {
            /* class com.ss.android.lark.appsetting.api.$$Lambda$SettingManager$AWn49g1iIKi9jeZ2VdRnAt91QXg */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SettingManager.lambda$getBoolean$7(IGetDataCallback.this, (Boolean) obj);
            }
        }, new Consumer() {
            /* class com.ss.android.lark.appsetting.api.$$Lambda$SettingManager$bXQwyh858exPxjmzWq1e9E1vPA */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SettingManager.lambda$getBoolean$8(IGetDataCallback.this, (Throwable) obj);
            }
        });
    }

    public void getDouble(Class cls, Scheduler scheduler, Scheduler scheduler2, IGetDataCallback<Double> iGetDataCallback) {
        C68296b.create(new ObservableOnSubscribe(cls) {
            /* class com.ss.android.lark.appsetting.api.$$Lambda$SettingManager$rb3eNSaZ0tu_AYhGkErol_JhspI */
            public final /* synthetic */ Class f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                SettingManager.this.lambda$getDouble$12$SettingManager(this.f$1, observableEmitter);
            }
        }).subscribeOn(scheduler).observeOn(scheduler2).subscribe(new Consumer() {
            /* class com.ss.android.lark.appsetting.api.$$Lambda$SettingManager$lHMH0zl3oqQr5zDGWzcKRCfn5M */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SettingManager.lambda$getDouble$13(IGetDataCallback.this, (Double) obj);
            }
        }, new Consumer() {
            /* class com.ss.android.lark.appsetting.api.$$Lambda$SettingManager$KrHDZ9QlfwvDAZUtNuj5dn8YaE */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SettingManager.lambda$getDouble$14(IGetDataCallback.this, (Throwable) obj);
            }
        });
    }

    public void getInt(Class cls, Scheduler scheduler, Scheduler scheduler2, IGetDataCallback<Integer> iGetDataCallback) {
        C68296b.create(new ObservableOnSubscribe(cls) {
            /* class com.ss.android.lark.appsetting.api.$$Lambda$SettingManager$rYzjPeH9xk8TnRdwsyimCSnUpfM */
            public final /* synthetic */ Class f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                SettingManager.this.lambda$getInt$9$SettingManager(this.f$1, observableEmitter);
            }
        }).subscribeOn(scheduler).observeOn(scheduler2).subscribe(new Consumer() {
            /* class com.ss.android.lark.appsetting.api.$$Lambda$SettingManager$MGD8AwzZoRZK_PaUdnfSnFYcUU */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SettingManager.lambda$getInt$10(IGetDataCallback.this, (Integer) obj);
            }
        }, new Consumer() {
            /* class com.ss.android.lark.appsetting.api.$$Lambda$SettingManager$9cm4hApqANPpZ4bRgfp9wy3LJA */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SettingManager.lambda$getInt$11(IGetDataCallback.this, (Throwable) obj);
            }
        });
    }

    public void getString(Class cls, Scheduler scheduler, Scheduler scheduler2, IGetDataCallback<String> iGetDataCallback) {
        C68296b.create(new ObservableOnSubscribe(cls) {
            /* class com.ss.android.lark.appsetting.api.$$Lambda$SettingManager$5XOATp6UQfX5MEDaECQIDlqYg */
            public final /* synthetic */ Class f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                SettingManager.this.lambda$getString$3$SettingManager(this.f$1, observableEmitter);
            }
        }).subscribeOn(scheduler).observeOn(scheduler2).subscribe(new Consumer() {
            /* class com.ss.android.lark.appsetting.api.$$Lambda$SettingManager$nSgG9H8XzebZ6KSKVx6KSDGzDHk */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SettingManager.lambda$getString$4(IGetDataCallback.this, (String) obj);
            }
        }, new Consumer() {
            /* class com.ss.android.lark.appsetting.api.$$Lambda$SettingManager$vIGcvW3S3mBUBNwTogHGn2S9H3A */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SettingManager.lambda$getString$5(IGetDataCallback.this, (Throwable) obj);
            }
        });
    }
}
