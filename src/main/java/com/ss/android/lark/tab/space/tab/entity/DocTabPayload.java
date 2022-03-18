package com.ss.android.lark.tab.space.tab.entity;

import android.text.TextUtils;
import com.bytedance.lark.pb.space.doc.v1.DocTabPayload;
import com.google.gson.Gson;
import com.ss.android.lark.log.Log;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/entity/DocTabPayload;", "Ljava/io/Serializable;", "key", "", "url", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getName", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class DocTabPayload implements Serializable {
    public static final Companion Companion = new Companion(null);
    private final String key;
    private final String name;
    private final String url;

    public static /* synthetic */ DocTabPayload copy$default(DocTabPayload docTabPayload, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = docTabPayload.key;
        }
        if ((i & 2) != 0) {
            str2 = docTabPayload.url;
        }
        if ((i & 4) != 0) {
            str3 = docTabPayload.name;
        }
        return docTabPayload.copy(str, str2, str3);
    }

    @JvmStatic
    public static final com.bytedance.lark.pb.space.doc.v1.DocTabPayload parsePbFromDocTabPayload(DocTabPayload docTabPayload) {
        return Companion.mo188717a(docTabPayload);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.name;
    }

    public final DocTabPayload copy(String str, String str2, String str3) {
        return new DocTabPayload(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocTabPayload)) {
            return false;
        }
        DocTabPayload docTabPayload = (DocTabPayload) obj;
        return Intrinsics.areEqual(this.key, docTabPayload.key) && Intrinsics.areEqual(this.url, docTabPayload.url) && Intrinsics.areEqual(this.name, docTabPayload.name);
    }

    public int hashCode() {
        String str = this.key;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.url;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.name;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "DocTabPayload(key=" + this.key + ", url=" + this.url + ", name=" + this.name + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0007J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/entity/DocTabPayload$Companion;", "", "()V", "KEY_KEY", "", "KEY_NAME", "KEY_URL", "TAG", "parseDocTabPayloadFromByteString", "Lcom/ss/android/lark/tab/space/tab/entity/DocTabPayload;", "payloadString", "Lokio/ByteString;", "parseDocTabPayloadFromJson", "jsonString", "parsePbFromDocTabPayload", "Lcom/bytedance/lark/pb/space/doc/v1/DocTabPayload;", "payload", "parsePbFromDocTabPayloadToJson", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.entity.DocTabPayload$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final com.bytedance.lark.pb.space.doc.v1.DocTabPayload mo188717a(DocTabPayload docTabPayload) {
            Intrinsics.checkParameterIsNotNull(docTabPayload, "payload");
            com.bytedance.lark.pb.space.doc.v1.DocTabPayload a = new DocTabPayload.C19245a().mo65681a(docTabPayload.getKey()).mo65683b(docTabPayload.getUrl()).mo65684c(docTabPayload.getName()).build();
            Intrinsics.checkExpressionValueIsNotNull(a, "com.bytedance.lark.pb.sp…\n                .build()");
            return a;
        }

        /* renamed from: b */
        public final String mo188719b(DocTabPayload docTabPayload) {
            Intrinsics.checkParameterIsNotNull(docTabPayload, "payload");
            JSONObject jSONObject = new JSONObject();
            String key = docTabPayload.getKey();
            if (key != null) {
                jSONObject.put("key", key);
            }
            String url = docTabPayload.getUrl();
            if (url != null) {
                jSONObject.put("url", url);
            }
            String name = docTabPayload.getName();
            if (name != null) {
                jSONObject.put("name", name);
            }
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkExpressionValueIsNotNull(jSONObject2, "json.toString()");
            return jSONObject2;
        }

        /* renamed from: a */
        public final DocTabPayload mo188718a(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                return (DocTabPayload) new Gson().fromJson(str, DocTabPayload.class);
            } catch (Exception e) {
                Log.m165383e("DocTabPayload", "parse DocTabPayload Json failed " + e.getMessage());
                return null;
            }
        }
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public DocTabPayload(String str, String str2, String str3) {
        this.key = str;
        this.url = str2;
        this.name = str3;
    }
}
