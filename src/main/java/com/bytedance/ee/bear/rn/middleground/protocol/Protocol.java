package com.bytedance.ee.bear.rn.middleground.protocol;

import com.bytedance.ee.bear.rn.middleground.protocol.Protocol.Body;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0002 !B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H&J\u0013\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000¢\u0006\u0002\u0010\tJ\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\fJ\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0012R\u001e\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "T", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body;", "", "()V", "mBody", "getMBody", "()Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body;", "setMBody", "(Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body;)V", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body;", "mHeader", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity$Header;", "getMHeader", "()Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity$Header;", "setMHeader", "(Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity$Header;)V", "mIdentifier", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity$Identifier;", "getMIdentifier", "()Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity$Identifier;", "setMIdentifier", "(Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity$Identifier;)V", "getJsonString", "", "setBody", "", "body", "setHeader", "header", "setIdentifier", "identifier", "Body", "Entity", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public abstract class Protocol<T extends Body> {

    /* renamed from: a */
    private T f28709a;

    /* renamed from: b */
    private Entity.Identifier f28710b;

    /* renamed from: c */
    private Entity.Header f28711c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity;", "Empty", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public interface Body extends Entity {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body$Empty;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body;", "()V", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class Empty implements Body {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity;", "Ljava/io/Serializable;", "Base", "Data", "Extra", "Header", "Identifier", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public interface Entity extends Serializable {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity$Base;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity;", "business", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity$Data;", "(Ljava/lang/String;Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity$Data;)V", "getBusiness", "()Ljava/lang/String;", "getData", "()Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity$Data;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class Base implements Entity {
            private final String business;
            private final Data data;

            public static /* synthetic */ Base copy$default(Base base, String str, Data data2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = base.business;
                }
                if ((i & 2) != 0) {
                    data2 = base.data;
                }
                return base.copy(str, data2);
            }

            public final String component1() {
                return this.business;
            }

            public final Data component2() {
                return this.data;
            }

            public final Base copy(String str, Data data2) {
                Intrinsics.checkParameterIsNotNull(str, "business");
                Intrinsics.checkParameterIsNotNull(data2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                return new Base(str, data2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Base)) {
                    return false;
                }
                Base base = (Base) obj;
                return Intrinsics.areEqual(this.business, base.business) && Intrinsics.areEqual(this.data, base.data);
            }

            public int hashCode() {
                String str = this.business;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                Data data2 = this.data;
                if (data2 != null) {
                    i = data2.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                return "Base(business=" + this.business + ", data=" + this.data + ")";
            }

            public final String getBusiness() {
                return this.business;
            }

            public final Data getData() {
                return this.data;
            }

            public Base(String str, Data data2) {
                Intrinsics.checkParameterIsNotNull(str, "business");
                Intrinsics.checkParameterIsNotNull(data2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                this.business = str;
                this.data = data2;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity$Data;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity;", "operation", "", "header", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity$Header;", "identifier", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity$Identifier;", "body", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body;", "extra", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity$Extra;", "(Ljava/lang/String;Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity$Header;Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity$Identifier;Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body;Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity$Extra;)V", "getBody", "()Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body;", "getExtra", "()Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity$Extra;", "getHeader", "()Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity$Header;", "getIdentifier", "()Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity$Identifier;", "getOperation", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class Data implements Entity {
            private final Body body;
            private final Extra extra;
            private final Header header;
            private final Identifier identifier;
            private final String operation;

            public Data() {
                this(null, null, null, null, null, 31, null);
            }

            public static /* synthetic */ Data copy$default(Data data, String str, Header header2, Identifier identifier2, Body body2, Extra extra2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = data.operation;
                }
                if ((i & 2) != 0) {
                    header2 = data.header;
                }
                if ((i & 4) != 0) {
                    identifier2 = data.identifier;
                }
                if ((i & 8) != 0) {
                    body2 = data.body;
                }
                if ((i & 16) != 0) {
                    extra2 = data.extra;
                }
                return data.copy(str, header2, identifier2, body2, extra2);
            }

            public final String component1() {
                return this.operation;
            }

            public final Header component2() {
                return this.header;
            }

            public final Identifier component3() {
                return this.identifier;
            }

            public final Body component4() {
                return this.body;
            }

            public final Extra component5() {
                return this.extra;
            }

            public final Data copy(String str, Header header2, Identifier identifier2, Body body2, Extra extra2) {
                return new Data(str, header2, identifier2, body2, extra2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Data)) {
                    return false;
                }
                Data data = (Data) obj;
                return Intrinsics.areEqual(this.operation, data.operation) && Intrinsics.areEqual(this.header, data.header) && Intrinsics.areEqual(this.identifier, data.identifier) && Intrinsics.areEqual(this.body, data.body) && Intrinsics.areEqual(this.extra, data.extra);
            }

            public int hashCode() {
                String str = this.operation;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                Header header2 = this.header;
                int hashCode2 = (hashCode + (header2 != null ? header2.hashCode() : 0)) * 31;
                Identifier identifier2 = this.identifier;
                int hashCode3 = (hashCode2 + (identifier2 != null ? identifier2.hashCode() : 0)) * 31;
                Body body2 = this.body;
                int hashCode4 = (hashCode3 + (body2 != null ? body2.hashCode() : 0)) * 31;
                Extra extra2 = this.extra;
                if (extra2 != null) {
                    i = extra2.hashCode();
                }
                return hashCode4 + i;
            }

            public String toString() {
                return "Data(operation=" + this.operation + ", header=" + this.header + ", identifier=" + this.identifier + ", body=" + this.body + ", extra=" + this.extra + ")";
            }

            public final Body getBody() {
                return this.body;
            }

            public final Extra getExtra() {
                return this.extra;
            }

            public final Header getHeader() {
                return this.header;
            }

            public final Identifier getIdentifier() {
                return this.identifier;
            }

            public final String getOperation() {
                return this.operation;
            }

            public Data(String str, Header header2, Identifier identifier2, Body body2, Extra extra2) {
                this.operation = str;
                this.header = header2;
                this.identifier = identifier2;
                this.body = body2;
                this.extra = extra2;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Data(String str, Header header2, Identifier identifier2, Body body2, Extra extra2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : header2, (i & 4) != 0 ? null : identifier2, (i & 8) != 0 ? null : body2, (i & 16) != 0 ? null : extra2);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity$Extra;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity;", ShareHitPoint.f121869d, "", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class Extra implements Entity {
            private final String type;

            public Extra() {
                this(null, 1, null);
            }

            public static /* synthetic */ Extra copy$default(Extra extra, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = extra.type;
                }
                return extra.copy(str);
            }

            public final String component1() {
                return this.type;
            }

            public final Extra copy(String str) {
                Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
                return new Extra(str);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof Extra) && Intrinsics.areEqual(this.type, ((Extra) obj).type);
                }
                return true;
            }

            public int hashCode() {
                String str = this.type;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                return "Extra(type=" + this.type + ")";
            }

            public final String getType() {
                return this.type;
            }

            public Extra(String str) {
                Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
                this.type = str;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Extra(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity$Header;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity;", "requestId", "", "(Ljava/lang/String;)V", "getRequestId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class Header implements Entity {
            private final String requestId;

            public Header() {
                this(null, 1, null);
            }

            public static /* synthetic */ Header copy$default(Header header, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = header.requestId;
                }
                return header.copy(str);
            }

            public final String component1() {
                return this.requestId;
            }

            public final Header copy(String str) {
                Intrinsics.checkParameterIsNotNull(str, "requestId");
                return new Header(str);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof Header) && Intrinsics.areEqual(this.requestId, ((Header) obj).requestId);
                }
                return true;
            }

            public int hashCode() {
                String str = this.requestId;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                return "Header(requestId=" + this.requestId + ")";
            }

            public final String getRequestId() {
                return this.requestId;
            }

            public Header(String str) {
                Intrinsics.checkParameterIsNotNull(str, "requestId");
                this.requestId = str;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Header(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity$Identifier;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Entity;", ShareHitPoint.f121869d, "", "token", "", "owner", "", "appId", "(ILjava/lang/String;ZLjava/lang/String;)V", "getAppId", "()Ljava/lang/String;", "getOwner", "()Z", "getToken", "getType", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class Identifier implements Entity {
            private final String appId;
            private final boolean owner;
            private final String token;
            private final int type;

            public static /* synthetic */ Identifier copy$default(Identifier identifier, int i, String str, boolean z, String str2, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = identifier.type;
                }
                if ((i2 & 2) != 0) {
                    str = identifier.token;
                }
                if ((i2 & 4) != 0) {
                    z = identifier.owner;
                }
                if ((i2 & 8) != 0) {
                    str2 = identifier.appId;
                }
                return identifier.copy(i, str, z, str2);
            }

            public final int component1() {
                return this.type;
            }

            public final String component2() {
                return this.token;
            }

            public final boolean component3() {
                return this.owner;
            }

            public final String component4() {
                return this.appId;
            }

            public final Identifier copy(int i, String str, boolean z, String str2) {
                Intrinsics.checkParameterIsNotNull(str, "token");
                return new Identifier(i, str, z, str2);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Identifier) {
                        Identifier identifier = (Identifier) obj;
                        if ((this.type == identifier.type) && Intrinsics.areEqual(this.token, identifier.token)) {
                            if (!(this.owner == identifier.owner) || !Intrinsics.areEqual(this.appId, identifier.appId)) {
                                return false;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                int i = this.type * 31;
                String str = this.token;
                int i2 = 0;
                int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
                boolean z = this.owner;
                if (z) {
                    z = true;
                }
                int i3 = z ? 1 : 0;
                int i4 = z ? 1 : 0;
                int i5 = z ? 1 : 0;
                int i6 = (hashCode + i3) * 31;
                String str2 = this.appId;
                if (str2 != null) {
                    i2 = str2.hashCode();
                }
                return i6 + i2;
            }

            public String toString() {
                return "Identifier(type=" + this.type + ", token=" + this.token + ", owner=" + this.owner + ", appId=" + this.appId + ")";
            }

            public final String getAppId() {
                return this.appId;
            }

            public final boolean getOwner() {
                return this.owner;
            }

            public final String getToken() {
                return this.token;
            }

            public final int getType() {
                return this.type;
            }

            public Identifier(int i, String str, boolean z, String str2) {
                Intrinsics.checkParameterIsNotNull(str, "token");
                this.type = i;
                this.token = str;
                this.owner = z;
                this.appId = str2;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Identifier(int i, String str, boolean z, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, str, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? "" : str2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final T mo40562b() {
        return this.f28709a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Entity.Identifier mo40563c() {
        return this.f28710b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Entity.Header mo40564d() {
        return this.f28711c;
    }

    /* renamed from: a */
    public final void mo40559a(T t) {
        Intrinsics.checkParameterIsNotNull(t, "body");
        this.f28709a = t;
    }

    /* renamed from: a */
    public final void mo40560a(Entity.Header header) {
        Intrinsics.checkParameterIsNotNull(header, "header");
        this.f28711c = header;
    }

    /* renamed from: a */
    public final void mo40561a(Entity.Identifier identifier) {
        Intrinsics.checkParameterIsNotNull(identifier, "identifier");
        this.f28710b = identifier;
    }
}
