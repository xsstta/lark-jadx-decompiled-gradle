package com.google.gson.internal.p999a;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: com.google.gson.internal.a.n */
public final class C22985n {

    /* renamed from: A */
    public static final TypeAdapter<String> f56767A;

    /* renamed from: B */
    public static final TypeAdapter<BigDecimal> f56768B = new TypeAdapter<BigDecimal>() {
        /* class com.google.gson.internal.p999a.C22985n.C229969 */

        /* renamed from: a */
        public BigDecimal read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigDecimal(jsonReader.nextString());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
            jsonWriter.value(bigDecimal);
        }
    };

    /* renamed from: C */
    public static final TypeAdapter<BigInteger> f56769C = new TypeAdapter<BigInteger>() {
        /* class com.google.gson.internal.p999a.C22985n.AnonymousClass10 */

        /* renamed from: a */
        public BigInteger read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigInteger(jsonReader.nextString());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
            jsonWriter.value(bigInteger);
        }
    };

    /* renamed from: D */
    public static final TypeAdapterFactory f56770D;

    /* renamed from: E */
    public static final TypeAdapter<StringBuilder> f56771E;

    /* renamed from: F */
    public static final TypeAdapterFactory f56772F;

    /* renamed from: G */
    public static final TypeAdapter<StringBuffer> f56773G;

    /* renamed from: H */
    public static final TypeAdapterFactory f56774H;

    /* renamed from: I */
    public static final TypeAdapter<URL> f56775I;

    /* renamed from: J */
    public static final TypeAdapterFactory f56776J;

    /* renamed from: K */
    public static final TypeAdapter<URI> f56777K;

    /* renamed from: L */
    public static final TypeAdapterFactory f56778L;

    /* renamed from: M */
    public static final TypeAdapter<InetAddress> f56779M;

    /* renamed from: N */
    public static final TypeAdapterFactory f56780N;

    /* renamed from: O */
    public static final TypeAdapter<UUID> f56781O;

    /* renamed from: P */
    public static final TypeAdapterFactory f56782P;

    /* renamed from: Q */
    public static final TypeAdapter<Currency> f56783Q;

    /* renamed from: R */
    public static final TypeAdapterFactory f56784R;

    /* renamed from: S */
    public static final TypeAdapterFactory f56785S = new TypeAdapterFactory() {
        /* class com.google.gson.internal.p999a.C22985n.AnonymousClass19 */

        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() != Timestamp.class) {
                return null;
            }
            final TypeAdapter<T> adapter = gson.getAdapter(Date.class);
            return new TypeAdapter<Timestamp>() {
                /* class com.google.gson.internal.p999a.C22985n.AnonymousClass19.C229871 */

                /* renamed from: a */
                public Timestamp read(JsonReader jsonReader) throws IOException {
                    Date date = (Date) adapter.read(jsonReader);
                    if (date != null) {
                        return new Timestamp(date.getTime());
                    }
                    return null;
                }

                /* renamed from: a */
                public void write(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
                    adapter.write(jsonWriter, timestamp);
                }
            };
        }
    };

    /* renamed from: T */
    public static final TypeAdapter<Calendar> f56786T;

    /* renamed from: U */
    public static final TypeAdapterFactory f56787U;

    /* renamed from: V */
    public static final TypeAdapter<Locale> f56788V;

    /* renamed from: W */
    public static final TypeAdapterFactory f56789W;

    /* renamed from: X */
    public static final TypeAdapter<JsonElement> f56790X;

    /* renamed from: Y */
    public static final TypeAdapterFactory f56791Y;

    /* renamed from: Z */
    public static final TypeAdapterFactory f56792Z = new TypeAdapterFactory() {
        /* class com.google.gson.internal.p999a.C22985n.AnonymousClass24 */

        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            Class<? super Object> rawType = typeToken.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new C22997a(rawType);
        }
    };

    /* renamed from: a */
    public static final TypeAdapter<Class> f56793a;

    /* renamed from: b */
    public static final TypeAdapterFactory f56794b;

    /* renamed from: c */
    public static final TypeAdapter<BitSet> f56795c;

    /* renamed from: d */
    public static final TypeAdapterFactory f56796d;

    /* renamed from: e */
    public static final TypeAdapter<Boolean> f56797e;

    /* renamed from: f */
    public static final TypeAdapter<Boolean> f56798f = new TypeAdapter<Boolean>() {
        /* class com.google.gson.internal.p999a.C22985n.AnonymousClass31 */

        /* renamed from: a */
        public Boolean read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Boolean.valueOf(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
            String str;
            if (bool == null) {
                str = "null";
            } else {
                str = bool.toString();
            }
            jsonWriter.value(str);
        }
    };

    /* renamed from: g */
    public static final TypeAdapterFactory f56799g;

    /* renamed from: h */
    public static final TypeAdapter<Number> f56800h;

    /* renamed from: i */
    public static final TypeAdapterFactory f56801i;

    /* renamed from: j */
    public static final TypeAdapter<Number> f56802j;

    /* renamed from: k */
    public static final TypeAdapterFactory f56803k;

    /* renamed from: l */
    public static final TypeAdapter<Number> f56804l;

    /* renamed from: m */
    public static final TypeAdapterFactory f56805m;

    /* renamed from: n */
    public static final TypeAdapter<AtomicInteger> f56806n;

    /* renamed from: o */
    public static final TypeAdapterFactory f56807o;

    /* renamed from: p */
    public static final TypeAdapter<AtomicBoolean> f56808p;

    /* renamed from: q */
    public static final TypeAdapterFactory f56809q;

    /* renamed from: r */
    public static final TypeAdapter<AtomicIntegerArray> f56810r;

    /* renamed from: s */
    public static final TypeAdapterFactory f56811s;

    /* renamed from: t */
    public static final TypeAdapter<Number> f56812t = new TypeAdapter<Number>() {
        /* class com.google.gson.internal.p999a.C22985n.C229903 */

        /* renamed from: a */
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Long.valueOf(jsonReader.nextLong());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    };

    /* renamed from: u */
    public static final TypeAdapter<Number> f56813u = new TypeAdapter<Number>() {
        /* class com.google.gson.internal.p999a.C22985n.C229914 */

        /* renamed from: a */
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Float.valueOf((float) jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    };

    /* renamed from: v */
    public static final TypeAdapter<Number> f56814v = new TypeAdapter<Number>() {
        /* class com.google.gson.internal.p999a.C22985n.C229925 */

        /* renamed from: a */
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Double.valueOf(jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    };

    /* renamed from: w */
    public static final TypeAdapter<Number> f56815w;

    /* renamed from: x */
    public static final TypeAdapterFactory f56816x;

    /* renamed from: y */
    public static final TypeAdapter<Character> f56817y;

    /* renamed from: z */
    public static final TypeAdapterFactory f56818z;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.a.n$30  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass30 {

        /* renamed from: a */
        static final /* synthetic */ int[] f56835a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 121
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.p999a.C22985n.AnonymousClass30.<clinit>():void");
        }
    }

    static {
        TypeAdapter<Class> nullSafe = new TypeAdapter<Class>() {
            /* class com.google.gson.internal.p999a.C22985n.C229861 */

            /* renamed from: a */
            public Class read(JsonReader jsonReader) throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            /* renamed from: a */
            public void write(JsonWriter jsonWriter, Class cls) throws IOException {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }
        }.nullSafe();
        f56793a = nullSafe;
        f56794b = m83361a(Class.class, nullSafe);
        TypeAdapter<BitSet> nullSafe2 = new TypeAdapter<BitSet>() {
            /* class com.google.gson.internal.p999a.C22985n.AnonymousClass12 */

            /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
                if (java.lang.Integer.parseInt(r1) != 0) goto L_0x0069;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
                if (r8.nextInt() != 0) goto L_0x0069;
             */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x006e A[SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.util.BitSet read(com.google.gson.stream.JsonReader r8) throws java.io.IOException {
                /*
                // Method dump skipped, instructions count: 121
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.p999a.C22985n.AnonymousClass12.read(com.google.gson.stream.JsonReader):java.util.BitSet");
            }

            /* renamed from: a */
            public void write(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
                jsonWriter.beginArray();
                int length = bitSet.length();
                for (int i = 0; i < length; i++) {
                    jsonWriter.value(bitSet.get(i) ? 1 : 0);
                }
                jsonWriter.endArray();
            }
        }.nullSafe();
        f56795c = nullSafe2;
        f56796d = m83361a(BitSet.class, nullSafe2);
        AnonymousClass23 r0 = new TypeAdapter<Boolean>() {
            /* class com.google.gson.internal.p999a.C22985n.AnonymousClass23 */

            /* renamed from: a */
            public Boolean read(JsonReader jsonReader) throws IOException {
                JsonToken peek = jsonReader.peek();
                if (peek == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                } else if (peek == JsonToken.STRING) {
                    return Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString()));
                } else {
                    return Boolean.valueOf(jsonReader.nextBoolean());
                }
            }

            /* renamed from: a */
            public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
                jsonWriter.value(bool);
            }
        };
        f56797e = r0;
        f56799g = m83362a(Boolean.TYPE, Boolean.class, r0);
        AnonymousClass32 r02 = new TypeAdapter<Number>() {
            /* class com.google.gson.internal.p999a.C22985n.AnonymousClass32 */

            /* renamed from: a */
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) jsonReader.nextInt());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }

            /* renamed from: a */
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        f56800h = r02;
        f56801i = m83362a(Byte.TYPE, Byte.class, r02);
        AnonymousClass33 r03 = new TypeAdapter<Number>() {
            /* class com.google.gson.internal.p999a.C22985n.AnonymousClass33 */

            /* renamed from: a */
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Short.valueOf((short) jsonReader.nextInt());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }

            /* renamed from: a */
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        f56802j = r03;
        f56803k = m83362a(Short.TYPE, Short.class, r03);
        AnonymousClass34 r04 = new TypeAdapter<Number>() {
            /* class com.google.gson.internal.p999a.C22985n.AnonymousClass34 */

            /* renamed from: a */
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Integer.valueOf(jsonReader.nextInt());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }

            /* renamed from: a */
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        f56804l = r04;
        f56805m = m83362a(Integer.TYPE, Integer.class, r04);
        TypeAdapter<AtomicInteger> nullSafe3 = new TypeAdapter<AtomicInteger>() {
            /* class com.google.gson.internal.p999a.C22985n.AnonymousClass35 */

            /* renamed from: a */
            public AtomicInteger read(JsonReader jsonReader) throws IOException {
                try {
                    return new AtomicInteger(jsonReader.nextInt());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }

            /* renamed from: a */
            public void write(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
                jsonWriter.value((long) atomicInteger.get());
            }
        }.nullSafe();
        f56806n = nullSafe3;
        f56807o = m83361a(AtomicInteger.class, nullSafe3);
        TypeAdapter<AtomicBoolean> nullSafe4 = new TypeAdapter<AtomicBoolean>() {
            /* class com.google.gson.internal.p999a.C22985n.AnonymousClass36 */

            /* renamed from: a */
            public AtomicBoolean read(JsonReader jsonReader) throws IOException {
                return new AtomicBoolean(jsonReader.nextBoolean());
            }

            /* renamed from: a */
            public void write(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
                jsonWriter.value(atomicBoolean.get());
            }
        }.nullSafe();
        f56808p = nullSafe4;
        f56809q = m83361a(AtomicBoolean.class, nullSafe4);
        TypeAdapter<AtomicIntegerArray> nullSafe5 = new TypeAdapter<AtomicIntegerArray>() {
            /* class com.google.gson.internal.p999a.C22985n.C229882 */

            /* renamed from: a */
            public AtomicIntegerArray read(JsonReader jsonReader) throws IOException {
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                    } catch (NumberFormatException e) {
                        throw new JsonSyntaxException(e);
                    }
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            }

            /* renamed from: a */
            public void write(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
                jsonWriter.beginArray();
                int length = atomicIntegerArray.length();
                for (int i = 0; i < length; i++) {
                    jsonWriter.value((long) atomicIntegerArray.get(i));
                }
                jsonWriter.endArray();
            }
        }.nullSafe();
        f56810r = nullSafe5;
        f56811s = m83361a(AtomicIntegerArray.class, nullSafe5);
        C229936 r05 = new TypeAdapter<Number>() {
            /* class com.google.gson.internal.p999a.C22985n.C229936 */

            /* renamed from: a */
            public Number read(JsonReader jsonReader) throws IOException {
                JsonToken peek = jsonReader.peek();
                int i = AnonymousClass30.f56835a[peek.ordinal()];
                if (i == 1 || i == 3) {
                    return new LazilyParsedNumber(jsonReader.nextString());
                }
                if (i == 4) {
                    jsonReader.nextNull();
                    return null;
                }
                throw new JsonSyntaxException("Expecting number, got: " + peek);
            }

            /* renamed from: a */
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        f56815w = r05;
        f56816x = m83361a(Number.class, r05);
        C229947 r06 = new TypeAdapter<Character>() {
            /* class com.google.gson.internal.p999a.C22985n.C229947 */

            /* renamed from: a */
            public Character read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                if (nextString.length() == 1) {
                    return Character.valueOf(nextString.charAt(0));
                }
                throw new JsonSyntaxException("Expecting character, got: " + nextString);
            }

            /* renamed from: a */
            public void write(JsonWriter jsonWriter, Character ch) throws IOException {
                String str;
                if (ch == null) {
                    str = null;
                } else {
                    str = String.valueOf(ch);
                }
                jsonWriter.value(str);
            }
        };
        f56817y = r06;
        f56818z = m83362a(Character.TYPE, Character.class, r06);
        C229958 r07 = new TypeAdapter<String>() {
            /* class com.google.gson.internal.p999a.C22985n.C229958 */

            /* renamed from: a */
            public String read(JsonReader jsonReader) throws IOException {
                JsonToken peek = jsonReader.peek();
                if (peek == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                } else if (peek == JsonToken.BOOLEAN) {
                    return Boolean.toString(jsonReader.nextBoolean());
                } else {
                    return jsonReader.nextString();
                }
            }

            /* renamed from: a */
            public void write(JsonWriter jsonWriter, String str) throws IOException {
                jsonWriter.value(str);
            }
        };
        f56767A = r07;
        f56770D = m83361a(String.class, r07);
        AnonymousClass11 r08 = new TypeAdapter<StringBuilder>() {
            /* class com.google.gson.internal.p999a.C22985n.AnonymousClass11 */

            /* renamed from: a */
            public StringBuilder read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new StringBuilder(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            /* renamed from: a */
            public void write(JsonWriter jsonWriter, StringBuilder sb) throws IOException {
                String str;
                if (sb == null) {
                    str = null;
                } else {
                    str = sb.toString();
                }
                jsonWriter.value(str);
            }
        };
        f56771E = r08;
        f56772F = m83361a(StringBuilder.class, r08);
        AnonymousClass13 r09 = new TypeAdapter<StringBuffer>() {
            /* class com.google.gson.internal.p999a.C22985n.AnonymousClass13 */

            /* renamed from: a */
            public StringBuffer read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new StringBuffer(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            /* renamed from: a */
            public void write(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
                String str;
                if (stringBuffer == null) {
                    str = null;
                } else {
                    str = stringBuffer.toString();
                }
                jsonWriter.value(str);
            }
        };
        f56773G = r09;
        f56774H = m83361a(StringBuffer.class, r09);
        AnonymousClass14 r010 = new TypeAdapter<URL>() {
            /* class com.google.gson.internal.p999a.C22985n.AnonymousClass14 */

            /* renamed from: a */
            public URL read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                if ("null".equals(nextString)) {
                    return null;
                }
                return new URL(nextString);
            }

            /* renamed from: a */
            public void write(JsonWriter jsonWriter, URL url) throws IOException {
                String str;
                if (url == null) {
                    str = null;
                } else {
                    str = url.toExternalForm();
                }
                jsonWriter.value(str);
            }
        };
        f56775I = r010;
        f56776J = m83361a(URL.class, r010);
        AnonymousClass15 r011 = new TypeAdapter<URI>() {
            /* class com.google.gson.internal.p999a.C22985n.AnonymousClass15 */

            /* renamed from: a */
            public URI read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    String nextString = jsonReader.nextString();
                    if ("null".equals(nextString)) {
                        return null;
                    }
                    return new URI(nextString);
                } catch (URISyntaxException e) {
                    throw new JsonIOException(e);
                }
            }

            /* renamed from: a */
            public void write(JsonWriter jsonWriter, URI uri) throws IOException {
                String str;
                if (uri == null) {
                    str = null;
                } else {
                    str = uri.toASCIIString();
                }
                jsonWriter.value(str);
            }
        };
        f56777K = r011;
        f56778L = m83361a(URI.class, r011);
        AnonymousClass16 r012 = new TypeAdapter<InetAddress>() {
            /* class com.google.gson.internal.p999a.C22985n.AnonymousClass16 */

            /* renamed from: a */
            public InetAddress read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return InetAddress.getByName(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            /* renamed from: a */
            public void write(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
                String str;
                if (inetAddress == null) {
                    str = null;
                } else {
                    str = inetAddress.getHostAddress();
                }
                jsonWriter.value(str);
            }
        };
        f56779M = r012;
        f56780N = m83363b(InetAddress.class, r012);
        AnonymousClass17 r013 = new TypeAdapter<UUID>() {
            /* class com.google.gson.internal.p999a.C22985n.AnonymousClass17 */

            /* renamed from: a */
            public UUID read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return UUID.fromString(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            /* renamed from: a */
            public void write(JsonWriter jsonWriter, UUID uuid) throws IOException {
                String str;
                if (uuid == null) {
                    str = null;
                } else {
                    str = uuid.toString();
                }
                jsonWriter.value(str);
            }
        };
        f56781O = r013;
        f56782P = m83361a(UUID.class, r013);
        TypeAdapter<Currency> nullSafe6 = new TypeAdapter<Currency>() {
            /* class com.google.gson.internal.p999a.C22985n.AnonymousClass18 */

            /* renamed from: a */
            public Currency read(JsonReader jsonReader) throws IOException {
                return Currency.getInstance(jsonReader.nextString());
            }

            /* renamed from: a */
            public void write(JsonWriter jsonWriter, Currency currency) throws IOException {
                jsonWriter.value(currency.getCurrencyCode());
            }
        }.nullSafe();
        f56783Q = nullSafe6;
        f56784R = m83361a(Currency.class, nullSafe6);
        AnonymousClass20 r014 = new TypeAdapter<Calendar>() {
            /* class com.google.gson.internal.p999a.C22985n.AnonymousClass20 */

            /* renamed from: a */
            public Calendar read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    String nextName = jsonReader.nextName();
                    int nextInt = jsonReader.nextInt();
                    if ("year".equals(nextName)) {
                        i = nextInt;
                    } else if ("month".equals(nextName)) {
                        i2 = nextInt;
                    } else if ("dayOfMonth".equals(nextName)) {
                        i3 = nextInt;
                    } else if ("hourOfDay".equals(nextName)) {
                        i4 = nextInt;
                    } else if ("minute".equals(nextName)) {
                        i5 = nextInt;
                    } else if ("second".equals(nextName)) {
                        i6 = nextInt;
                    }
                }
                jsonReader.endObject();
                return new GregorianCalendar(i, i2, i3, i4, i5, i6);
            }

            /* renamed from: a */
            public void write(JsonWriter jsonWriter, Calendar calendar) throws IOException {
                if (calendar == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginObject();
                jsonWriter.name("year");
                jsonWriter.value((long) calendar.get(1));
                jsonWriter.name("month");
                jsonWriter.value((long) calendar.get(2));
                jsonWriter.name("dayOfMonth");
                jsonWriter.value((long) calendar.get(5));
                jsonWriter.name("hourOfDay");
                jsonWriter.value((long) calendar.get(11));
                jsonWriter.name("minute");
                jsonWriter.value((long) calendar.get(12));
                jsonWriter.name("second");
                jsonWriter.value((long) calendar.get(13));
                jsonWriter.endObject();
            }
        };
        f56786T = r014;
        f56787U = m83364b(Calendar.class, GregorianCalendar.class, r014);
        AnonymousClass21 r015 = new TypeAdapter<Locale>() {
            /* class com.google.gson.internal.p999a.C22985n.AnonymousClass21 */

            /* renamed from: a */
            public Locale read(JsonReader jsonReader) throws IOException {
                String str;
                String str2;
                String str3 = null;
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                } else {
                    str = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str2 = stringTokenizer.nextToken();
                } else {
                    str2 = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str3 = stringTokenizer.nextToken();
                }
                if (str2 == null && str3 == null) {
                    return new Locale(str);
                }
                if (str3 == null) {
                    return new Locale(str, str2);
                }
                return new Locale(str, str2, str3);
            }

            /* renamed from: a */
            public void write(JsonWriter jsonWriter, Locale locale) throws IOException {
                String str;
                if (locale == null) {
                    str = null;
                } else {
                    str = locale.toString();
                }
                jsonWriter.value(str);
            }
        };
        f56788V = r015;
        f56789W = m83361a(Locale.class, r015);
        AnonymousClass22 r016 = new TypeAdapter<JsonElement>() {
            /* class com.google.gson.internal.p999a.C22985n.AnonymousClass22 */

            /* renamed from: a */
            public JsonElement read(JsonReader jsonReader) throws IOException {
                switch (AnonymousClass30.f56835a[jsonReader.peek().ordinal()]) {
                    case 1:
                        return new JsonPrimitive((Number) new LazilyParsedNumber(jsonReader.nextString()));
                    case 2:
                        return new JsonPrimitive(Boolean.valueOf(jsonReader.nextBoolean()));
                    case 3:
                        return new JsonPrimitive(jsonReader.nextString());
                    case 4:
                        jsonReader.nextNull();
                        return JsonNull.INSTANCE;
                    case 5:
                        JsonArray jsonArray = new JsonArray();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            jsonArray.add(read(jsonReader));
                        }
                        jsonReader.endArray();
                        return jsonArray;
                    case 6:
                        JsonObject jsonObject = new JsonObject();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            jsonObject.add(jsonReader.nextName(), read(jsonReader));
                        }
                        jsonReader.endObject();
                        return jsonObject;
                    default:
                        throw new IllegalArgumentException();
                }
            }

            /* renamed from: a */
            public void write(JsonWriter jsonWriter, JsonElement jsonElement) throws IOException {
                if (jsonElement == null || jsonElement.isJsonNull()) {
                    jsonWriter.nullValue();
                } else if (jsonElement.isJsonPrimitive()) {
                    JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                    if (asJsonPrimitive.isNumber()) {
                        jsonWriter.value(asJsonPrimitive.getAsNumber());
                    } else if (asJsonPrimitive.isBoolean()) {
                        jsonWriter.value(asJsonPrimitive.getAsBoolean());
                    } else {
                        jsonWriter.value(asJsonPrimitive.getAsString());
                    }
                } else if (jsonElement.isJsonArray()) {
                    jsonWriter.beginArray();
                    Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
                    while (it.hasNext()) {
                        write(jsonWriter, it.next());
                    }
                    jsonWriter.endArray();
                } else if (jsonElement.isJsonObject()) {
                    jsonWriter.beginObject();
                    for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                        jsonWriter.name(entry.getKey());
                        write(jsonWriter, entry.getValue());
                    }
                    jsonWriter.endObject();
                } else {
                    throw new IllegalArgumentException("Couldn't write " + jsonElement.getClass());
                }
            }
        };
        f56790X = r016;
        f56791Y = m83363b(JsonElement.class, r016);
    }

    /* renamed from: com.google.gson.internal.a.n$a */
    private static final class C22997a<T extends Enum<T>> extends TypeAdapter<T> {

        /* renamed from: a */
        private final Map<String, T> f56836a = new HashMap();

        /* renamed from: b */
        private final Map<T, String> f56837b = new HashMap();

        /* renamed from: a */
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return this.f56836a.get(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        public C22997a(Class<T> cls) {
            try {
                T[] enumConstants = cls.getEnumConstants();
                for (T t : enumConstants) {
                    String name = t.name();
                    SerializedName serializedName = (SerializedName) cls.getField(name).getAnnotation(SerializedName.class);
                    if (serializedName != null) {
                        name = serializedName.value();
                        for (String str : serializedName.alternate()) {
                            this.f56836a.put(str, t);
                        }
                    }
                    this.f56836a.put(name, t);
                    this.f56837b.put(t, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, T t) throws IOException {
            String str;
            if (t == null) {
                str = null;
            } else {
                str = this.f56837b.get(t);
            }
            jsonWriter.value(str);
        }
    }

    /* renamed from: a */
    public static <TT> TypeAdapterFactory m83360a(final TypeToken<TT> typeToken, final TypeAdapter<TT> typeAdapter) {
        return new TypeAdapterFactory() {
            /* class com.google.gson.internal.p999a.C22985n.AnonymousClass25 */

            @Override // com.google.gson.TypeAdapterFactory
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                if (typeToken.equals(typeToken)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    /* renamed from: b */
    public static <T1> TypeAdapterFactory m83363b(final Class<T1> cls, final TypeAdapter<T1> typeAdapter) {
        return new TypeAdapterFactory() {
            /* class com.google.gson.internal.p999a.C22985n.AnonymousClass29 */

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }

            @Override // com.google.gson.TypeAdapterFactory
            public <T2> TypeAdapter<T2> create(Gson gson, TypeToken<T2> typeToken) {
                final Class<? super T2> rawType = typeToken.getRawType();
                if (!cls.isAssignableFrom(rawType)) {
                    return null;
                }
                return new TypeAdapter<T1>() {
                    /* class com.google.gson.internal.p999a.C22985n.AnonymousClass29.C229891 */

                    @Override // com.google.gson.TypeAdapter
                    public T1 read(JsonReader jsonReader) throws IOException {
                        T1 t1 = (T1) typeAdapter.read(jsonReader);
                        if (t1 == null || rawType.isInstance(t1)) {
                            return t1;
                        }
                        throw new JsonSyntaxException("Expected a " + rawType.getName() + " but was " + t1.getClass().getName());
                    }

                    @Override // com.google.gson.TypeAdapter
                    public void write(JsonWriter jsonWriter, T1 t1) throws IOException {
                        typeAdapter.write(jsonWriter, t1);
                    }
                };
            }
        };
    }

    /* renamed from: a */
    public static <TT> TypeAdapterFactory m83361a(final Class<TT> cls, final TypeAdapter<TT> typeAdapter) {
        return new TypeAdapterFactory() {
            /* class com.google.gson.internal.p999a.C22985n.AnonymousClass26 */

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }

            @Override // com.google.gson.TypeAdapterFactory
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == cls) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    /* renamed from: b */
    public static <TT> TypeAdapterFactory m83364b(final Class<TT> cls, final Class<? extends TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new TypeAdapterFactory() {
            /* class com.google.gson.internal.p999a.C22985n.AnonymousClass28 */

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + typeAdapter + "]";
            }

            @Override // com.google.gson.TypeAdapterFactory
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    /* renamed from: a */
    public static <TT> TypeAdapterFactory m83362a(final Class<TT> cls, final Class<TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new TypeAdapterFactory() {
            /* class com.google.gson.internal.p999a.C22985n.AnonymousClass27 */

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }

            @Override // com.google.gson.TypeAdapterFactory
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }
}
