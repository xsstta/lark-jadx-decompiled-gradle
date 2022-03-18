package com.bytedance.ee.bear.service.remote;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.log.C13479a;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.service.remote.g */
public class C10962g {

    /* renamed from: a */
    private final Parcel f29466a;

    /* renamed from: a */
    public Object mo41599a() {
        return mo41600a(getClass().getClassLoader());
    }

    public C10962g(Parcel parcel) {
        this.f29466a = parcel;
    }

    /* renamed from: a */
    public void mo41601a(Object obj) {
        this.f29466a.writeString(obj.getClass().getName());
        if (obj instanceof AbstractC10953b) {
            new RemoteObjWrapper((AbstractC10953b) obj).writeToParcel(this.f29466a, 0);
        } else if (obj instanceof Map) {
            this.f29466a.writeMap((Map) obj);
        } else if (obj instanceof List) {
            this.f29466a.writeList((List) obj);
        } else if (obj instanceof Boolean) {
            this.f29466a.writeInt(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Character) {
            this.f29466a.writeInt(((Character) obj).charValue());
        } else if (obj instanceof Byte) {
            this.f29466a.writeByte(((Byte) obj).byteValue());
        } else if (obj instanceof Short) {
            this.f29466a.writeInt(((Short) obj).shortValue());
        } else if (obj instanceof Integer) {
            this.f29466a.writeInt(((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            this.f29466a.writeLong(((Long) obj).longValue());
        } else if (obj instanceof Float) {
            this.f29466a.writeFloat(((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            this.f29466a.writeDouble(((Double) obj).doubleValue());
        } else if (obj instanceof String) {
            this.f29466a.writeString((String) obj);
        } else if (obj instanceof IBinder) {
            this.f29466a.writeStrongBinder((IBinder) obj);
        } else if (obj instanceof Parcelable) {
            this.f29466a.writeParcelable((Parcelable) obj, 1);
        } else {
            throw new IllegalArgumentException("Wrong argument in Parameter Type");
        }
    }

    /* renamed from: a */
    public Object mo41600a(ClassLoader classLoader) {
        boolean z = true;
        try {
            Class<?> cls = Class.forName(this.f29466a.readString(), true, classLoader);
            if (AbstractC10953b.class.isAssignableFrom(cls)) {
                return new RemoteObjWrapper(this.f29466a).mo41562a();
            }
            if (Map.class.isAssignableFrom(cls)) {
                return this.f29466a.readHashMap(classLoader);
            }
            if (List.class.isAssignableFrom(cls)) {
                return this.f29466a.readArrayList(classLoader);
            }
            if (Boolean.class.isAssignableFrom(cls)) {
                if (this.f29466a.readInt() <= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } else if (Character.class.isAssignableFrom(cls)) {
                return Integer.valueOf(this.f29466a.readInt());
            } else {
                if (Byte.class.isAssignableFrom(cls)) {
                    return Byte.valueOf(this.f29466a.readByte());
                }
                if (Short.class.isAssignableFrom(cls)) {
                    return Integer.valueOf(this.f29466a.readInt());
                }
                if (Integer.class.isAssignableFrom(cls)) {
                    return Integer.valueOf(this.f29466a.readInt());
                }
                if (Long.class.isAssignableFrom(cls)) {
                    return Long.valueOf(this.f29466a.readLong());
                }
                if (Float.class.isAssignableFrom(cls)) {
                    return Float.valueOf(this.f29466a.readFloat());
                }
                if (Double.class.isAssignableFrom(cls)) {
                    return Double.valueOf(this.f29466a.readDouble());
                }
                if (String.class.isAssignableFrom(cls)) {
                    return this.f29466a.readString();
                }
                if (IBinder.class.isAssignableFrom(cls)) {
                    return this.f29466a.readStrongBinder();
                }
                if (Parcelable.class.isAssignableFrom(cls)) {
                    return this.f29466a.readParcelable(classLoader);
                }
                throw new IllegalArgumentException("Wrong argument in Parameter Type");
            }
        } catch (ClassNotFoundException e) {
            C13479a.m54759a("TypeParcel", "read:get class type error ", e);
            return null;
        }
    }
}
