package com.lynx.tasm.common;

import com.lynx.tasm.C26906i;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.lynx.tasm.common.a */
public class C26872a {

    /* renamed from: a */
    public static final C26872a f66718a = new C26872a();

    /* renamed from: b */
    private static final boolean f66719b;

    /* renamed from: c */
    private static final Charset f66720c = Charset.forName("UTF8");

    /* renamed from: a */
    public void mo95653a(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.common.a$a */
    public static final class C26873a extends ByteArrayOutputStream {
        C26873a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public byte[] mo95655a() {
            return this.buf;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo95652a(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        m97687a(byteArrayOutputStream, obj, new HashSet<>());
    }

    static {
        boolean z;
        if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        f66719b = z;
    }

    /* renamed from: c */
    protected static byte[] m97693c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[m97690b(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: b */
    protected static int m97690b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            int i = byteBuffer.get() & 255;
            if (i < 254) {
                return i;
            }
            if (i == 254) {
                return byteBuffer.getChar();
            }
            return byteBuffer.getInt();
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo95654d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return mo95649a(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* renamed from: a */
    public Object mo95650a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            byteBuffer.order(ByteOrder.nativeOrder());
            Object d = mo95654d(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                return d;
            }
            throw new IllegalArgumentException("Message corrupted");
        } catch (IllegalArgumentException e) {
            LynxEnv.m96123e().mo94115t().mo11459a(new C26906i(e.toString(), -3));
            return null;
        }
    }

    /* renamed from: a */
    public ByteBuffer mo95651a(Object obj) {
        if (obj == null) {
            return null;
        }
        C26873a aVar = new C26873a();
        try {
            mo95652a(aVar, obj);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
            allocateDirect.put(aVar.mo95655a(), 0, aVar.size());
            return allocateDirect;
        } catch (IllegalArgumentException e) {
            LynxEnv.m96123e().mo94115t().mo11459a(new C26906i(e.toString(), -3));
            return null;
        }
    }

    /* renamed from: a */
    protected static void m97684a(ByteArrayOutputStream byteArrayOutputStream, double d) {
        m97686a(byteArrayOutputStream, Double.doubleToLongBits(d));
    }

    /* renamed from: a */
    protected static void m97688a(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        m97685a(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    protected static void m97685a(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (i < 254) {
            byteArrayOutputStream.write(i);
        } else if (i <= 65535) {
            byteArrayOutputStream.write(254);
            m97691b(byteArrayOutputStream, i);
        } else {
            byteArrayOutputStream.write(255);
            m97692c(byteArrayOutputStream, i);
        }
    }

    /* renamed from: b */
    protected static void m97691b(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (f66719b) {
            byteArrayOutputStream.write(i);
            byteArrayOutputStream.write(i >>> 8);
            return;
        }
        byteArrayOutputStream.write(i >>> 8);
        byteArrayOutputStream.write(i);
    }

    /* renamed from: d */
    protected static void m97694d(ByteArrayOutputStream byteArrayOutputStream, int i) {
        int size = byteArrayOutputStream.size() % i;
        if (size != 0) {
            for (int i2 = 0; i2 < i - size; i2++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    /* renamed from: a */
    protected static void m97689a(ByteBuffer byteBuffer, int i) {
        int position = byteBuffer.position() % i;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i) - position);
        }
    }

    /* renamed from: c */
    protected static void m97692c(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (f66719b) {
            byteArrayOutputStream.write(i);
            byteArrayOutputStream.write(i >>> 8);
            byteArrayOutputStream.write(i >>> 16);
            byteArrayOutputStream.write(i >>> 24);
            return;
        }
        byteArrayOutputStream.write(i >>> 24);
        byteArrayOutputStream.write(i >>> 16);
        byteArrayOutputStream.write(i >>> 8);
        byteArrayOutputStream.write(i);
    }

    /* renamed from: a */
    protected static void m97686a(ByteArrayOutputStream byteArrayOutputStream, long j) {
        if (f66719b) {
            byteArrayOutputStream.write((byte) ((int) j));
            byteArrayOutputStream.write((byte) ((int) (j >>> 8)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 16)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 24)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 32)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 40)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 48)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 56)));
            return;
        }
        byteArrayOutputStream.write((byte) ((int) (j >>> 56)));
        byteArrayOutputStream.write((byte) ((int) (j >>> 48)));
        byteArrayOutputStream.write((byte) ((int) (j >>> 40)));
        byteArrayOutputStream.write((byte) ((int) (j >>> 32)));
        byteArrayOutputStream.write((byte) ((int) (j >>> 24)));
        byteArrayOutputStream.write((byte) ((int) (j >>> 16)));
        byteArrayOutputStream.write((byte) ((int) (j >>> 8)));
        byteArrayOutputStream.write((byte) ((int) j));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo95649a(byte b, ByteBuffer byteBuffer) {
        int i = 0;
        switch (b) {
            case 0:
                return null;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case 5:
                m97689a(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case 6:
                return new String(m97693c(byteBuffer), f66720c);
            case 7:
                int b2 = m97690b(byteBuffer);
                ArrayList arrayList = new ArrayList(b2);
                while (i < b2) {
                    arrayList.add(mo95654d(byteBuffer));
                    i++;
                }
                return arrayList;
            case 8:
                int b3 = m97690b(byteBuffer);
                HashMap hashMap = new HashMap();
                while (i < b3) {
                    hashMap.put(mo95654d(byteBuffer), mo95654d(byteBuffer));
                    i++;
                }
                return hashMap;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
    }

    /* renamed from: a */
    private void m97687a(ByteArrayOutputStream byteArrayOutputStream, Object obj, HashSet<Object> hashSet) {
        int i;
        if (obj == null) {
            byteArrayOutputStream.write(0);
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                i = 1;
            } else {
                i = 2;
            }
            byteArrayOutputStream.write(i);
        } else if (obj instanceof Number) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                byteArrayOutputStream.write(3);
                m97692c(byteArrayOutputStream, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                byteArrayOutputStream.write(4);
                m97686a(byteArrayOutputStream, ((Long) obj).longValue());
            } else if ((obj instanceof Float) || (obj instanceof Double)) {
                byteArrayOutputStream.write(5);
                m97694d(byteArrayOutputStream, 8);
                m97684a(byteArrayOutputStream, ((Number) obj).doubleValue());
            } else {
                throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
            }
        } else if (obj instanceof String) {
            byteArrayOutputStream.write(6);
            m97688a(byteArrayOutputStream, ((String) obj).getBytes(f66720c));
        } else if (obj instanceof List) {
            List<Object> list = (List) obj;
            if (list.isEmpty() || !hashSet.contains(obj)) {
                hashSet.add(obj);
                byteArrayOutputStream.write(7);
                m97685a(byteArrayOutputStream, list.size());
                for (Object obj2 : list) {
                    m97687a(byteArrayOutputStream, obj2, hashSet);
                }
                hashSet.remove(obj);
                return;
            }
            byteArrayOutputStream.write(0);
            LLog.m96418a(new IllegalArgumentException("writeValue has cycle array!"));
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.isEmpty() || !hashSet.contains(obj)) {
                hashSet.add(obj);
                byteArrayOutputStream.write(8);
                m97685a(byteArrayOutputStream, map.size());
                for (Map.Entry entry : map.entrySet()) {
                    m97687a(byteArrayOutputStream, entry.getKey(), hashSet);
                    m97687a(byteArrayOutputStream, entry.getValue(), hashSet);
                }
                hashSet.remove(obj);
                return;
            }
            byteArrayOutputStream.write(0);
            LLog.m96418a(new IllegalArgumentException("writeValue has cycle dict!"));
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.length() <= 0 || !hashSet.contains(obj)) {
                hashSet.add(obj);
                byteArrayOutputStream.write(8);
                m97685a(byteArrayOutputStream, jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    m97687a(byteArrayOutputStream, next, hashSet);
                    m97687a(byteArrayOutputStream, jSONObject.opt(next), hashSet);
                }
                hashSet.remove(obj);
                return;
            }
            byteArrayOutputStream.write(0);
            LLog.m96418a(new IllegalArgumentException("writeValue has cycle JSONObject!"));
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            if (jSONArray.length() <= 0 || !hashSet.contains(obj)) {
                hashSet.add(obj);
                byteArrayOutputStream.write(7);
                m97685a(byteArrayOutputStream, jSONArray.length());
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    m97687a(byteArrayOutputStream, jSONArray.opt(i2), hashSet);
                }
                hashSet.remove(obj);
                return;
            }
            byteArrayOutputStream.write(0);
            LLog.m96418a(new IllegalArgumentException("writeValue has cycle JSONArray!"));
        } else if (obj instanceof byte[]) {
            byteArrayOutputStream.write(9);
            m97688a(byteArrayOutputStream, (byte[]) obj);
        } else {
            throw new IllegalArgumentException("Unsupported type: " + obj.getClass() + " value: " + obj);
        }
    }
}
