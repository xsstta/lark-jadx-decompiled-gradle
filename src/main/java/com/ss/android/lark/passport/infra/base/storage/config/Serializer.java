package com.ss.android.lark.passport.infra.base.storage.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.google.gson.Gson;
import com.ss.android.lark.passport.infra.base.storage.key.Key;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u0000 \f*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\f\rJ%\u0010\u0003\u001a\u0004\u0018\u00018\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¢\u0006\u0002\u0010\bJ%\u0010\t\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0010\n\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/config/Serializer;", "T", "", "deserialize", "key", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "serialized", "", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Ljava/lang/String;)Ljava/lang/Object;", "serialize", "input", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Ljava/lang/Object;)Ljava/lang/String;", "Companion", "Factory", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.c.a.d */
public interface Serializer<T> {

    /* renamed from: a */
    public static final Companion f123140a = Companion.f123141a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0001\u0010\u000bH\u0002J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0001\u0010\u000bH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/config/Serializer$Companion;", "", "()V", "FAST_JSON_FACTORY", "Lcom/ss/android/lark/passport/infra/base/storage/config/Serializer$Factory;", "getFAST_JSON_FACTORY", "()Lcom/ss/android/lark/passport/infra/base/storage/config/Serializer$Factory;", "GSON_FACTORY", "getGSON_FACTORY", "newFastJsonSerializer", "Lcom/ss/android/lark/passport/infra/base/storage/config/Serializer;", "T", "newGsonSerializer", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.c.a.d$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f123141a;

        /* renamed from: b */
        private static final Factory f123142b;

        /* renamed from: c */
        private static final Factory f123143c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J%\u0010\u0002\u001a\u0004\u0018\u00018\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0007J%\u0010\b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/ss/android/lark/passport/infra/base/storage/config/Serializer$Companion$newFastJsonSerializer$1", "Lcom/ss/android/lark/passport/infra/base/storage/config/Serializer;", "deserialize", "key", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "serialized", "", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Ljava/lang/String;)Ljava/lang/Object;", "serialize", "input", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Ljava/lang/Object;)Ljava/lang/String;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.passport.infra.base.c.a.d$a$c */
        public static final class C49051c implements Serializer<T> {
            C49051c() {
            }

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Serializer
            /* renamed from: a */
            public T mo171236a(Key<T> aVar, String str) {
                Intrinsics.checkParameterIsNotNull(aVar, "key");
                Intrinsics.checkParameterIsNotNull(str, "serialized");
                return (T) JSON.parseObject(str, aVar.mo171119b(), new Feature[0]);
            }

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Serializer
            /* renamed from: a */
            public String mo171237a(Key<T> aVar, T t) {
                Intrinsics.checkParameterIsNotNull(aVar, "key");
                if (t == null) {
                    t = (T) "";
                }
                String jSONString = JSON.toJSONString(t);
                Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSON.toJSONString(input ?: \"\")");
                return jSONString;
            }
        }

        private Companion() {
        }

        /* renamed from: b */
        public final Factory mo171239b() {
            return f123143c;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/passport/infra/base/storage/config/Serializer$Companion$FAST_JSON_FACTORY$1", "Lcom/ss/android/lark/passport/infra/base/storage/config/Serializer$Factory;", "createSerializer", "Lcom/ss/android/lark/passport/infra/base/storage/config/Serializer;", "T", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.passport.infra.base.c.a.d$a$a */
        public static final class C49049a implements Factory {

            /* renamed from: a */
            final /* synthetic */ Companion f123144a;

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Serializer.Factory
            /* renamed from: a */
            public <T> Serializer<T> mo171241a() {
                return this.f123144a.mo171238a();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C49049a(Companion aVar) {
                this.f123144a = aVar;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/passport/infra/base/storage/config/Serializer$Companion$GSON_FACTORY$1", "Lcom/ss/android/lark/passport/infra/base/storage/config/Serializer$Factory;", "createSerializer", "Lcom/ss/android/lark/passport/infra/base/storage/config/Serializer;", "T", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.passport.infra.base.c.a.d$a$b */
        public static final class C49050b implements Factory {

            /* renamed from: a */
            final /* synthetic */ Companion f123145a;

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Serializer.Factory
            /* renamed from: a */
            public <T> Serializer<T> mo171241a() {
                return this.f123145a.mo171240c();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C49050b(Companion aVar) {
                this.f123145a = aVar;
            }
        }

        /* renamed from: a */
        public final <T> Serializer<T> mo171238a() {
            return new C49051c();
        }

        /* renamed from: c */
        public final <T> Serializer<T> mo171240c() {
            return new C49052d();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J%\u0010\u0004\u001a\u0004\u0018\u00018\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\tJ%\u0010\n\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"com/ss/android/lark/passport/infra/base/storage/config/Serializer$Companion$newGsonSerializer$1", "Lcom/ss/android/lark/passport/infra/base/storage/config/Serializer;", "GSON", "Lcom/google/gson/Gson;", "deserialize", "key", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "serialized", "", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Ljava/lang/String;)Ljava/lang/Object;", "serialize", "input", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Ljava/lang/Object;)Ljava/lang/String;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.passport.infra.base.c.a.d$a$d */
        public static final class C49052d implements Serializer<T> {

            /* renamed from: b */
            private final Gson f123146b = new Gson();

            C49052d() {
            }

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Serializer
            /* renamed from: a */
            public T mo171236a(Key<T> aVar, String str) {
                Intrinsics.checkParameterIsNotNull(aVar, "key");
                Intrinsics.checkParameterIsNotNull(str, "serialized");
                return (T) this.f123146b.fromJson(str, aVar.mo171119b());
            }

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Serializer
            /* renamed from: a */
            public String mo171237a(Key<T> aVar, T t) {
                Intrinsics.checkParameterIsNotNull(aVar, "key");
                Gson gson = this.f123146b;
                if (t == null) {
                    t = (T) "";
                }
                String json = gson.toJson((Object) t);
                Intrinsics.checkExpressionValueIsNotNull(json, "GSON.toJson(input ?: \"\")");
                return json;
            }
        }

        static {
            Companion aVar = new Companion();
            f123141a = aVar;
            f123142b = new C49049a(aVar);
            f123143c = new C49050b(aVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0001\u0010\u0004H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/config/Serializer$Factory;", "", "createSerializer", "Lcom/ss/android/lark/passport/infra/base/storage/config/Serializer;", "T", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.c.a.d$b */
    public interface Factory {
        /* renamed from: a */
        <T> Serializer<T> mo171241a();
    }

    /* renamed from: a */
    T mo171236a(Key<T> aVar, String str);

    /* renamed from: a */
    String mo171237a(Key<T> aVar, T t);
}
