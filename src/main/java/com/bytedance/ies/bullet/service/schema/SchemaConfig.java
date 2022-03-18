package com.bytedance.ies.bullet.service.schema;

import com.bytedance.ies.bullet.service.base.ISchemaConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000bB3\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ies/bullet/service/schema/SchemaConfig;", "Lcom/bytedance/ies/bullet/service/base/ISchemaConfig;", "_scheme", "", "_prefixList", "", "_prefixListMethod", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "getPrefixList", "getScheme", "Builder", "x-schema_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.schema.b */
public final class SchemaConfig implements ISchemaConfig {

    /* renamed from: a */
    private final String f37961a;

    /* renamed from: b */
    private final List<String> f37962b;

    /* renamed from: c */
    private final Function0<List<String>> f37963c;

    @Override // com.bytedance.ies.bullet.service.base.ISchemaConfig
    /* renamed from: a */
    public List<String> mo52668a() {
        List<String> invoke;
        Function0<List<String>> function0 = this.f37963c;
        if (function0 == null || (invoke = function0.invoke()) == null) {
            return this.f37962b;
        }
        return invoke;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\u000b\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\fJ\u001a\u0010\r\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0007J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ies/bullet/service/schema/SchemaConfig$Builder;", "", "()V", "prefixList", "", "", "prefixListMethod", "Lkotlin/Function0;", "scheme", "build", "Lcom/bytedance/ies/bullet/service/schema/SchemaConfig;", "setPrefixList", "", "setPrefixListMethod", "method", "setScheme", "x-schema_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.service.schema.b$a */
    public static final class Builder {

        /* renamed from: a */
        private String f37964a = "unknown";

        /* renamed from: b */
        private List<String> f37965b = new ArrayList();

        /* renamed from: c */
        private Function0<? extends List<String>> f37966c;

        /* renamed from: a */
        public final SchemaConfig mo52807a() {
            return new SchemaConfig(this.f37964a, this.f37965b, this.f37966c, null);
        }

        /* renamed from: a */
        public final Builder mo52805a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "scheme");
            Builder aVar = this;
            aVar.f37964a = str;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo52806a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "prefixList");
            Builder aVar = this;
            aVar.f37965b.addAll(list);
            return aVar;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    private SchemaConfig(String str, List<String> list, Function0<? extends List<String>> function0) {
        this.f37961a = str;
        this.f37962b = list;
        this.f37963c = function0;
    }

    public /* synthetic */ SchemaConfig(String str, List list, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, function0);
    }
}
