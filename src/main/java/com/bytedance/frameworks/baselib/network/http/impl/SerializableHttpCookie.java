package com.bytedance.frameworks.baselib.network.http.impl;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableHttpCookie implements Serializable {
    private static final String TAG = "SerializableHttpCookie";
    private static final long serialVersionUID = 6374381323722046732L;
    private transient C14010e cookie;
    private long whenCreated = System.currentTimeMillis();

    public C14010e getHttpCookie() {
        return this.cookie;
    }

    private boolean getHttpOnly() {
        return this.cookie.mo51608j();
    }

    public Long getWhenCreated() {
        return Long.valueOf(this.whenCreated);
    }

    public int hashCode() {
        return this.cookie.hashCode();
    }

    public String encode() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(this);
            return byteArrayToHexString(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            Log.d(TAG, "IOException in encodeCookie", e);
            return null;
        }
    }

    public boolean hasExpired() {
        long e = this.cookie.mo51599e();
        if (e != -1 && (System.currentTimeMillis() - this.whenCreated) / 1000 > e) {
            return true;
        }
        return false;
    }

    private void setHttpOnly(boolean z) {
        this.cookie.mo51594c(z);
    }

    public SerializableHttpCookie(C14010e eVar) {
        this.cookie = eVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C14010e) {
            return this.cookie.equals(obj);
        }
        if (obj instanceof SerializableHttpCookie) {
            return this.cookie.equals(((SerializableHttpCookie) obj).cookie);
        }
        return false;
    }

    private String byteArrayToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(i));
        }
        return sb.toString();
    }

    public static SerializableHttpCookie decode(String str) {
        try {
            return (SerializableHttpCookie) new ObjectInputStream(new ByteArrayInputStream(hexStringToByteArray(str))).readObject();
        } catch (IOException e) {
            Log.d(TAG, "IOException in decodeCookie", e);
            return null;
        } catch (ClassNotFoundException e2) {
            Log.d(TAG, "ClassNotFoundException in decodeCookie", e2);
            return null;
        }
    }

    private static byte[] hexStringToByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        C14010e eVar = new C14010e((String) objectInputStream.readObject(), (String) objectInputStream.readObject());
        this.cookie = eVar;
        eVar.mo51591b((String) objectInputStream.readObject());
        this.cookie.mo51593c((String) objectInputStream.readObject());
        this.cookie.mo51598d((String) objectInputStream.readObject());
        this.cookie.mo51587a(objectInputStream.readLong());
        this.cookie.mo51600e((String) objectInputStream.readObject());
        this.cookie.mo51603f((String) objectInputStream.readObject());
        this.cookie.mo51586a(objectInputStream.readInt());
        this.cookie.mo51592b(objectInputStream.readBoolean());
        this.cookie.mo51589a(objectInputStream.readBoolean());
        setHttpOnly(objectInputStream.readBoolean());
        this.whenCreated = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.cookie.mo51602f());
        objectOutputStream.writeObject(this.cookie.mo51609k());
        objectOutputStream.writeObject(this.cookie.mo51585a());
        objectOutputStream.writeObject(this.cookie.mo51590b());
        objectOutputStream.writeObject(this.cookie.mo51597d());
        objectOutputStream.writeLong(this.cookie.mo51599e());
        objectOutputStream.writeObject(this.cookie.mo51604g());
        objectOutputStream.writeObject(this.cookie.mo51605h());
        objectOutputStream.writeInt(this.cookie.mo51610l());
        objectOutputStream.writeBoolean(this.cookie.mo51607i());
        objectOutputStream.writeBoolean(this.cookie.mo51595c());
        objectOutputStream.writeBoolean(getHttpOnly());
        objectOutputStream.writeLong(this.whenCreated);
    }

    public static int getEffectivePort(String str, int i) {
        if (i != -1) {
            return i;
        }
        if ("http".equalsIgnoreCase(str)) {
            return 80;
        }
        if ("https".equalsIgnoreCase(str)) {
            return 443;
        }
        return -1;
    }
}
