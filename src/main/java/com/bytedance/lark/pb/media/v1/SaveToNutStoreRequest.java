package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Message;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SaveToNutStoreRequest extends Message<SaveToNutStoreRequest, C18288a> {
    public static final ProtoAdapter<SaveToNutStoreRequest> ADAPTER = new C18289b();
    public static final Message.SourceType DEFAULT_SOURCE_TYPE = Message.SourceType.TYPE_FROM_UNKONWN;
    private static final long serialVersionUID = 0;
    public final String file_key;
    public final String message_id;
    public final String source_id;
    public final Message.SourceType source_type;

    /* renamed from: com.bytedance.lark.pb.media.v1.SaveToNutStoreRequest$b */
    private static final class C18289b extends ProtoAdapter<SaveToNutStoreRequest> {
        C18289b() {
            super(FieldEncoding.LENGTH_DELIMITED, SaveToNutStoreRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SaveToNutStoreRequest saveToNutStoreRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, saveToNutStoreRequest.message_id);
            int i3 = 0;
            if (saveToNutStoreRequest.source_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, saveToNutStoreRequest.source_id);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (saveToNutStoreRequest.source_type != null) {
                i2 = Message.SourceType.ADAPTER.encodedSizeWithTag(3, saveToNutStoreRequest.source_type);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (saveToNutStoreRequest.file_key != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, saveToNutStoreRequest.file_key);
            }
            return i5 + i3 + saveToNutStoreRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SaveToNutStoreRequest decode(ProtoReader protoReader) throws IOException {
            C18288a aVar = new C18288a();
            aVar.f45579a = "";
            aVar.f45580b = "";
            aVar.f45581c = Message.SourceType.TYPE_FROM_UNKONWN;
            aVar.f45582d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45579a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45580b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f45581c = Message.SourceType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45582d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SaveToNutStoreRequest saveToNutStoreRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, saveToNutStoreRequest.message_id);
            if (saveToNutStoreRequest.source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, saveToNutStoreRequest.source_id);
            }
            if (saveToNutStoreRequest.source_type != null) {
                Message.SourceType.ADAPTER.encodeWithTag(protoWriter, 3, saveToNutStoreRequest.source_type);
            }
            if (saveToNutStoreRequest.file_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, saveToNutStoreRequest.file_key);
            }
            protoWriter.writeBytes(saveToNutStoreRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18288a newBuilder() {
        C18288a aVar = new C18288a();
        aVar.f45579a = this.message_id;
        aVar.f45580b = this.source_id;
        aVar.f45581c = this.source_type;
        aVar.f45582d = this.file_key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.SaveToNutStoreRequest$a */
    public static final class C18288a extends Message.Builder<SaveToNutStoreRequest, C18288a> {

        /* renamed from: a */
        public String f45579a;

        /* renamed from: b */
        public String f45580b;

        /* renamed from: c */
        public Message.SourceType f45581c;

        /* renamed from: d */
        public String f45582d;

        /* renamed from: a */
        public SaveToNutStoreRequest build() {
            String str = this.f45579a;
            if (str != null) {
                return new SaveToNutStoreRequest(str, this.f45580b, this.f45581c, this.f45582d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "message_id");
        }

        /* renamed from: a */
        public C18288a mo63333a(Message.SourceType sourceType) {
            this.f45581c = sourceType;
            return this;
        }

        /* renamed from: b */
        public C18288a mo63336b(String str) {
            this.f45580b = str;
            return this;
        }

        /* renamed from: c */
        public C18288a mo63337c(String str) {
            this.f45582d = str;
            return this;
        }

        /* renamed from: a */
        public C18288a mo63334a(String str) {
            this.f45579a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "SaveToNutStoreRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", message_id=");
        sb.append(this.message_id);
        if (this.source_id != null) {
            sb.append(", source_id=");
            sb.append(this.source_id);
        }
        if (this.source_type != null) {
            sb.append(", source_type=");
            sb.append(this.source_type);
        }
        if (this.file_key != null) {
            sb.append(", file_key=");
            sb.append(this.file_key);
        }
        StringBuilder replace = sb.replace(0, 2, "SaveToNutStoreRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SaveToNutStoreRequest(String str, String str2, Message.SourceType sourceType, String str3) {
        this(str, str2, sourceType, str3, ByteString.EMPTY);
    }

    public SaveToNutStoreRequest(String str, String str2, Message.SourceType sourceType, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.source_id = str2;
        this.source_type = sourceType;
        this.file_key = str3;
    }
}
