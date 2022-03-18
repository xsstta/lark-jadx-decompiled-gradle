package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ActionType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CollaborationExtendParam extends Message<CollaborationExtendParam, C16146a> {
    public static final ProtoAdapter<CollaborationExtendParam> ADAPTER = new C16147b();
    public static final ActionType DEFAULT_BUSINESS_SCENE = ActionType.UNKNOWN_ACTION;
    private static final long serialVersionUID = 0;
    public final ActionType business_scene;
    public final String in_chat_id;

    /* renamed from: com.bytedance.lark.pb.contact.v1.CollaborationExtendParam$b */
    private static final class C16147b extends ProtoAdapter<CollaborationExtendParam> {
        C16147b() {
            super(FieldEncoding.LENGTH_DELIMITED, CollaborationExtendParam.class);
        }

        /* renamed from: a */
        public int encodedSize(CollaborationExtendParam collaborationExtendParam) {
            int i;
            int i2 = 0;
            if (collaborationExtendParam.in_chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, collaborationExtendParam.in_chat_id);
            } else {
                i = 0;
            }
            if (collaborationExtendParam.business_scene != null) {
                i2 = ActionType.ADAPTER.encodedSizeWithTag(2, collaborationExtendParam.business_scene);
            }
            return i + i2 + collaborationExtendParam.unknownFields().size();
        }

        /* renamed from: a */
        public CollaborationExtendParam decode(ProtoReader protoReader) throws IOException {
            C16146a aVar = new C16146a();
            aVar.f42267a = "";
            aVar.f42268b = ActionType.UNKNOWN_ACTION;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42267a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f42268b = ActionType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CollaborationExtendParam collaborationExtendParam) throws IOException {
            if (collaborationExtendParam.in_chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, collaborationExtendParam.in_chat_id);
            }
            if (collaborationExtendParam.business_scene != null) {
                ActionType.ADAPTER.encodeWithTag(protoWriter, 2, collaborationExtendParam.business_scene);
            }
            protoWriter.writeBytes(collaborationExtendParam.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.CollaborationExtendParam$a */
    public static final class C16146a extends Message.Builder<CollaborationExtendParam, C16146a> {

        /* renamed from: a */
        public String f42267a;

        /* renamed from: b */
        public ActionType f42268b;

        /* renamed from: a */
        public CollaborationExtendParam build() {
            return new CollaborationExtendParam(this.f42267a, this.f42268b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16146a mo57952a(ActionType actionType) {
            this.f42268b = actionType;
            return this;
        }

        /* renamed from: a */
        public C16146a mo57953a(String str) {
            this.f42267a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16146a newBuilder() {
        C16146a aVar = new C16146a();
        aVar.f42267a = this.in_chat_id;
        aVar.f42268b = this.business_scene;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "CollaborationExtendParam");
        StringBuilder sb = new StringBuilder();
        if (this.in_chat_id != null) {
            sb.append(", in_chat_id=");
            sb.append(this.in_chat_id);
        }
        if (this.business_scene != null) {
            sb.append(", business_scene=");
            sb.append(this.business_scene);
        }
        StringBuilder replace = sb.replace(0, 2, "CollaborationExtendParam{");
        replace.append('}');
        return replace.toString();
    }

    public CollaborationExtendParam(String str, ActionType actionType) {
        this(str, actionType, ByteString.EMPTY);
    }

    public CollaborationExtendParam(String str, ActionType actionType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.in_chat_id = str;
        this.business_scene = actionType;
    }
}
