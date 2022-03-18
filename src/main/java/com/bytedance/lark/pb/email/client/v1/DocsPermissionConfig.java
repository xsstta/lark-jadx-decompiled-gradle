package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class DocsPermissionConfig extends Message<DocsPermissionConfig, C16606a> {
    public static final ProtoAdapter<DocsPermissionConfig> ADAPTER = new C16607b();
    public static final Action DEFAULT_ACTION = Action.KEEP;
    private static final long serialVersionUID = 0;
    public final Action action;
    public final String doc_url;

    public enum Action implements WireEnum {
        KEEP(0),
        READ(1),
        EDIT(2);
        
        public static final ProtoAdapter<Action> ADAPTER = ProtoAdapter.newEnumAdapter(Action.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            if (i == 0) {
                return KEEP;
            }
            if (i == 1) {
                return READ;
            }
            if (i != 2) {
                return null;
            }
            return EDIT;
        }

        private Action(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.DocsPermissionConfig$b */
    private static final class C16607b extends ProtoAdapter<DocsPermissionConfig> {
        C16607b() {
            super(FieldEncoding.LENGTH_DELIMITED, DocsPermissionConfig.class);
        }

        /* renamed from: a */
        public int encodedSize(DocsPermissionConfig docsPermissionConfig) {
            int i;
            int i2 = 0;
            if (docsPermissionConfig.doc_url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, docsPermissionConfig.doc_url);
            } else {
                i = 0;
            }
            if (docsPermissionConfig.action != null) {
                i2 = Action.ADAPTER.encodedSizeWithTag(2, docsPermissionConfig.action);
            }
            return i + i2 + docsPermissionConfig.unknownFields().size();
        }

        /* renamed from: a */
        public DocsPermissionConfig decode(ProtoReader protoReader) throws IOException {
            C16606a aVar = new C16606a();
            aVar.f42995a = "";
            aVar.f42996b = Action.KEEP;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42995a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f42996b = Action.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DocsPermissionConfig docsPermissionConfig) throws IOException {
            if (docsPermissionConfig.doc_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, docsPermissionConfig.doc_url);
            }
            if (docsPermissionConfig.action != null) {
                Action.ADAPTER.encodeWithTag(protoWriter, 2, docsPermissionConfig.action);
            }
            protoWriter.writeBytes(docsPermissionConfig.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.DocsPermissionConfig$a */
    public static final class C16606a extends Message.Builder<DocsPermissionConfig, C16606a> {

        /* renamed from: a */
        public String f42995a;

        /* renamed from: b */
        public Action f42996b;

        /* renamed from: a */
        public DocsPermissionConfig build() {
            return new DocsPermissionConfig(this.f42995a, this.f42996b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16606a newBuilder() {
        C16606a aVar = new C16606a();
        aVar.f42995a = this.doc_url;
        aVar.f42996b = this.action;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "DocsPermissionConfig");
        StringBuilder sb = new StringBuilder();
        if (this.doc_url != null) {
            sb.append(", doc_url=");
            sb.append(this.doc_url);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        StringBuilder replace = sb.replace(0, 2, "DocsPermissionConfig{");
        replace.append('}');
        return replace.toString();
    }

    public DocsPermissionConfig(String str, Action action2) {
        this(str, action2, ByteString.EMPTY);
    }

    public DocsPermissionConfig(String str, Action action2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.doc_url = str;
        this.action = action2;
    }
}
