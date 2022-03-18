package com.bytedance.ee.bear.service.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.service.remote.AbstractC10953b;
import com.bytedance.ee.log.C13479a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class RemoteObjWrapper<T extends AbstractC10953b> implements Parcelable {
    public static final Parcelable.Creator<RemoteObjWrapper> CREATOR = new Parcelable.Creator<RemoteObjWrapper>() {
        /* class com.bytedance.ee.bear.service.remote.RemoteObjWrapper.C109441 */

        /* renamed from: a */
        public RemoteObjWrapper[] newArray(int i) {
            return new RemoteObjWrapper[i];
        }

        /* renamed from: a */
        public RemoteObjWrapper createFromParcel(Parcel parcel) {
            return new RemoteObjWrapper(parcel);
        }
    };

    /* renamed from: a */
    private String f29431a;

    /* renamed from: b */
    private T f29432b;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public T mo41562a() {
        return this.f29432b;
    }

    protected RemoteObjWrapper(Parcel parcel) {
        String readString = parcel.readString();
        this.f29431a = readString;
        this.f29432b = m45463a(readString, parcel);
    }

    public RemoteObjWrapper(T t) {
        this.f29432b = t;
        this.f29431a = t.getClass().getName();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29431a);
        this.f29432b.mo41587a(parcel, i);
    }

    /* renamed from: a */
    private T m45463a(String str, Parcel parcel) {
        try {
            Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(Parcel.class);
            declaredConstructor.setAccessible(true);
            return (T) ((AbstractC10953b) declaredConstructor.newInstance(parcel));
        } catch (NoSuchMethodException e) {
            C13479a.m54769c("RemoteClassWrapper", "createInstance: error, class = " + str, e);
        } catch (IllegalAccessException e2) {
            C13479a.m54769c("RemoteClassWrapper", "createInstance: error, class = " + str, e2);
        } catch (InstantiationException e3) {
            C13479a.m54769c("RemoteClassWrapper", "createInstance: error, class = " + str, e3);
        } catch (InvocationTargetException e4) {
            C13479a.m54769c("RemoteClassWrapper", "createInstance: error, class = " + str, e4);
        } catch (ClassNotFoundException e5) {
            C13479a.m54769c("RemoteClassWrapper", "createInstance: error, class = " + str, e5);
        }
        return null;
    }
}
