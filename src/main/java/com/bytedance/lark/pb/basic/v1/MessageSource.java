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

public final class MessageSource extends Message<MessageSource, C15077a> {
    public static final ProtoAdapter<MessageSource> ADAPTER = new C15078b();
    public static final MessageSourceType DEFAULT_SOURCE_TYPE = MessageSourceType.COMMON_MESSAGE;
    private static final long serialVersionUID = 0;
    public final String source_id;
    public final MessageSourceType source_type;

    /* renamed from: com.bytedance.lark.pb.basic.v1.MessageSource$b */
    private static final class C15078b extends ProtoAdapter<MessageSource> {
        C15078b() {
            super(FieldEncoding.LENGTH_DELIMITED, MessageSource.class);
        }

        /* renamed from: a */
        public int encodedSize(MessageSource messageSource) {
            int i;
            int encodedSizeWithTag = MessageSourceType.ADAPTER.encodedSizeWithTag(1, messageSource.source_type);
            if (messageSource.source_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, messageSource.source_id);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + messageSource.unknownFields().size();
        }

        /* renamed from: a */
        public MessageSource decode(ProtoReader protoReader) throws IOException {
            C15077a aVar = new C15077a();
            aVar.f39946a = MessageSourceType.COMMON_MESSAGE;
            aVar.f39947b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f39946a = MessageSourceType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39947b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MessageSource messageSource) throws IOException {
            MessageSourceType.ADAPTER.encodeWithTag(protoWriter, 1, messageSource.source_type);
            if (messageSource.source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, messageSource.source_id);
            }
            protoWriter.writeBytes(messageSource.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.MessageSource$a */
    public static final class C15077a extends Message.Builder<MessageSource, C15077a> {

        /* renamed from: a */
        public MessageSourceType f39946a;

        /* renamed from: b */
        public String f39947b;

        /* renamed from: a */
        public MessageSource build() {
            MessageSourceType messageSourceType = this.f39946a;
            if (messageSourceType != null) {
                return new MessageSource(messageSourceType, this.f39947b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(messageSourceType, "source_type");
        }
    }

    @Override // com.squareup.wire.Message
    public C15077a newBuilder() {
        C15077a aVar = new C15077a();
        aVar.f39946a = this.source_type;
        aVar.f39947b = this.source_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "MessageSource");
        StringBuilder sb = new StringBuilder();
        sb.append(", source_type=");
        sb.append(this.source_type);
        if (this.source_id != null) {
            sb.append(", source_id=");
            sb.append(this.source_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MessageSource{");
        replace.append('}');
        return replace.toString();
    }

    public MessageSource(MessageSourceType messageSourceType, String str) {
        this(messageSourceType, str, ByteString.EMPTY);
    }

    public MessageSource(MessageSourceType messageSourceType, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.source_type = messageSourceType;
        this.source_id = str;
    }
}
