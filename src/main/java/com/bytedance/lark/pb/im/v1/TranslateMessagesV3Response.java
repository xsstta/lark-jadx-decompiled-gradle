package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.MessageSource;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class TranslateMessagesV3Response extends Message<TranslateMessagesV3Response, C18107a> {
    public static final ProtoAdapter<TranslateMessagesV3Response> ADAPTER = new C18108b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entities;
    public final List<String> message_ids;
    public final List<MessageSource> message_sources;
    public final List<TranslateError> translate_errors;
    public final List<String> translated_message_ids;

    /* renamed from: com.bytedance.lark.pb.im.v1.TranslateMessagesV3Response$b */
    private static final class C18108b extends ProtoAdapter<TranslateMessagesV3Response> {
        C18108b() {
            super(FieldEncoding.LENGTH_DELIMITED, TranslateMessagesV3Response.class);
        }

        /* renamed from: a */
        public int encodedSize(TranslateMessagesV3Response translateMessagesV3Response) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, translateMessagesV3Response.message_ids) + MessageSource.ADAPTER.asRepeated().encodedSizeWithTag(2, translateMessagesV3Response.message_sources) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, translateMessagesV3Response.translated_message_ids) + C14928Entity.ADAPTER.encodedSizeWithTag(4, translateMessagesV3Response.entities) + TranslateError.ADAPTER.asRepeated().encodedSizeWithTag(5, translateMessagesV3Response.translate_errors) + translateMessagesV3Response.unknownFields().size();
        }

        /* renamed from: a */
        public TranslateMessagesV3Response decode(ProtoReader protoReader) throws IOException {
            C18107a aVar = new C18107a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45254a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f45255b.add(MessageSource.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f45256c.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 4) {
                    aVar.f45257d = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45258e.add(TranslateError.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TranslateMessagesV3Response translateMessagesV3Response) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, translateMessagesV3Response.message_ids);
            MessageSource.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, translateMessagesV3Response.message_sources);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, translateMessagesV3Response.translated_message_ids);
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 4, translateMessagesV3Response.entities);
            TranslateError.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, translateMessagesV3Response.translate_errors);
            protoWriter.writeBytes(translateMessagesV3Response.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.TranslateMessagesV3Response$a */
    public static final class C18107a extends Message.Builder<TranslateMessagesV3Response, C18107a> {

        /* renamed from: a */
        public List<String> f45254a = Internal.newMutableList();

        /* renamed from: b */
        public List<MessageSource> f45255b = Internal.newMutableList();

        /* renamed from: c */
        public List<String> f45256c = Internal.newMutableList();

        /* renamed from: d */
        public C14928Entity f45257d;

        /* renamed from: e */
        public List<TranslateError> f45258e = Internal.newMutableList();

        /* renamed from: a */
        public TranslateMessagesV3Response build() {
            C14928Entity entity = this.f45257d;
            if (entity != null) {
                return new TranslateMessagesV3Response(this.f45254a, this.f45255b, this.f45256c, entity, this.f45258e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entities");
        }
    }

    @Override // com.squareup.wire.Message
    public C18107a newBuilder() {
        C18107a aVar = new C18107a();
        aVar.f45254a = Internal.copyOf("message_ids", this.message_ids);
        aVar.f45255b = Internal.copyOf("message_sources", this.message_sources);
        aVar.f45256c = Internal.copyOf("translated_message_ids", this.translated_message_ids);
        aVar.f45257d = this.entities;
        aVar.f45258e = Internal.copyOf("translate_errors", this.translate_errors);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "TranslateMessagesV3Response");
        StringBuilder sb = new StringBuilder();
        if (!this.message_ids.isEmpty()) {
            sb.append(", message_ids=");
            sb.append(this.message_ids);
        }
        if (!this.message_sources.isEmpty()) {
            sb.append(", message_sources=");
            sb.append(this.message_sources);
        }
        if (!this.translated_message_ids.isEmpty()) {
            sb.append(", translated_message_ids=");
            sb.append(this.translated_message_ids);
        }
        sb.append(", entities=");
        sb.append(this.entities);
        if (!this.translate_errors.isEmpty()) {
            sb.append(", translate_errors=");
            sb.append(this.translate_errors);
        }
        StringBuilder replace = sb.replace(0, 2, "TranslateMessagesV3Response{");
        replace.append('}');
        return replace.toString();
    }

    public TranslateMessagesV3Response(List<String> list, List<MessageSource> list2, List<String> list3, C14928Entity entity, List<TranslateError> list4) {
        this(list, list2, list3, entity, list4, ByteString.EMPTY);
    }

    public TranslateMessagesV3Response(List<String> list, List<MessageSource> list2, List<String> list3, C14928Entity entity, List<TranslateError> list4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_ids = Internal.immutableCopyOf("message_ids", list);
        this.message_sources = Internal.immutableCopyOf("message_sources", list2);
        this.translated_message_ids = Internal.immutableCopyOf("translated_message_ids", list3);
        this.entities = entity;
        this.translate_errors = Internal.immutableCopyOf("translate_errors", list4);
    }
}
