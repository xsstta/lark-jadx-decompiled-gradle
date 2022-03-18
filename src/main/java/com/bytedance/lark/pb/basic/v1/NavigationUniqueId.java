package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class NavigationUniqueId extends Message<NavigationUniqueId, C15089a> {
    public static final ProtoAdapter<NavigationUniqueId> ADAPTER = new C15090b();
    public static final NavigationAppType DEFAULT_APP_TYPE = NavigationAppType.APP_TYPE_NATIVE;
    private static final long serialVersionUID = 0;
    public final NavigationAppType app_type;
    public final String id;

    /* renamed from: com.bytedance.lark.pb.basic.v1.NavigationUniqueId$b */
    private static final class C15090b extends ProtoAdapter<NavigationUniqueId> {
        C15090b() {
            super(FieldEncoding.LENGTH_DELIMITED, NavigationUniqueId.class);
        }

        /* renamed from: a */
        public int encodedSize(NavigationUniqueId navigationUniqueId) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, navigationUniqueId.id) + NavigationAppType.ADAPTER.encodedSizeWithTag(2, navigationUniqueId.app_type) + navigationUniqueId.unknownFields().size();
        }

        /* renamed from: a */
        public NavigationUniqueId decode(ProtoReader protoReader) throws IOException {
            C15089a aVar = new C15089a();
            aVar.f39973a = "";
            aVar.f39974b = NavigationAppType.APP_TYPE_NATIVE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39973a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f39974b = NavigationAppType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, NavigationUniqueId navigationUniqueId) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, navigationUniqueId.id);
            NavigationAppType.ADAPTER.encodeWithTag(protoWriter, 2, navigationUniqueId.app_type);
            protoWriter.writeBytes(navigationUniqueId.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15089a newBuilder() {
        C15089a aVar = new C15089a();
        aVar.f39973a = this.id;
        aVar.f39974b = this.app_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.NavigationUniqueId$a */
    public static final class C15089a extends Message.Builder<NavigationUniqueId, C15089a> {

        /* renamed from: a */
        public String f39973a;

        /* renamed from: b */
        public NavigationAppType f39974b;

        /* renamed from: a */
        public NavigationUniqueId build() {
            NavigationAppType navigationAppType;
            String str = this.f39973a;
            if (str != null && (navigationAppType = this.f39974b) != null) {
                return new NavigationUniqueId(str, navigationAppType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id", this.f39974b, "app_type");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "NavigationUniqueId");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", app_type=");
        sb.append(this.app_type);
        StringBuilder replace = sb.replace(0, 2, "NavigationUniqueId{");
        replace.append('}');
        return replace.toString();
    }

    public NavigationUniqueId(String str, NavigationAppType navigationAppType) {
        this(str, navigationAppType, ByteString.EMPTY);
    }

    public NavigationUniqueId(String str, NavigationAppType navigationAppType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.app_type = navigationAppType;
    }
}
