package com.bytedance.lark.pb.block.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SetBlockExtensionEntityResponse extends Message<SetBlockExtensionEntityResponse, C15494a> {
    public static final ProtoAdapter<SetBlockExtensionEntityResponse> ADAPTER = new C15495b();
    public static final Integer DEFAULT_INSERTED_NUM = 0;
    public static final Integer DEFAULT_TOTAL_NUM = 0;
    public static final Integer DEFAULT_UPDATED_NUM = 0;
    private static final long serialVersionUID = 0;
    public final Integer inserted_num;
    public final Integer total_num;
    public final Integer updated_num;

    /* renamed from: com.bytedance.lark.pb.block.v1.SetBlockExtensionEntityResponse$b */
    private static final class C15495b extends ProtoAdapter<SetBlockExtensionEntityResponse> {
        C15495b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetBlockExtensionEntityResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetBlockExtensionEntityResponse setBlockExtensionEntityResponse) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, setBlockExtensionEntityResponse.total_num) + ProtoAdapter.INT32.encodedSizeWithTag(2, setBlockExtensionEntityResponse.inserted_num) + ProtoAdapter.INT32.encodedSizeWithTag(3, setBlockExtensionEntityResponse.updated_num) + setBlockExtensionEntityResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetBlockExtensionEntityResponse decode(ProtoReader protoReader) throws IOException {
            C15494a aVar = new C15494a();
            aVar.f40952a = 0;
            aVar.f40953b = 0;
            aVar.f40954c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40952a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f40953b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40954c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetBlockExtensionEntityResponse setBlockExtensionEntityResponse) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, setBlockExtensionEntityResponse.total_num);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, setBlockExtensionEntityResponse.inserted_num);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, setBlockExtensionEntityResponse.updated_num);
            protoWriter.writeBytes(setBlockExtensionEntityResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15494a newBuilder() {
        C15494a aVar = new C15494a();
        aVar.f40952a = this.total_num;
        aVar.f40953b = this.inserted_num;
        aVar.f40954c = this.updated_num;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.block.v1.SetBlockExtensionEntityResponse$a */
    public static final class C15494a extends Message.Builder<SetBlockExtensionEntityResponse, C15494a> {

        /* renamed from: a */
        public Integer f40952a;

        /* renamed from: b */
        public Integer f40953b;

        /* renamed from: c */
        public Integer f40954c;

        /* renamed from: a */
        public SetBlockExtensionEntityResponse build() {
            Integer num;
            Integer num2;
            Integer num3 = this.f40952a;
            if (num3 != null && (num = this.f40953b) != null && (num2 = this.f40954c) != null) {
                return new SetBlockExtensionEntityResponse(num3, num, num2, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num3, "total_num", this.f40953b, "inserted_num", this.f40954c, "updated_num");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("block", "SetBlockExtensionEntityResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", total_num=");
        sb.append(this.total_num);
        sb.append(", inserted_num=");
        sb.append(this.inserted_num);
        sb.append(", updated_num=");
        sb.append(this.updated_num);
        StringBuilder replace = sb.replace(0, 2, "SetBlockExtensionEntityResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetBlockExtensionEntityResponse(Integer num, Integer num2, Integer num3) {
        this(num, num2, num3, ByteString.EMPTY);
    }

    public SetBlockExtensionEntityResponse(Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.total_num = num;
        this.inserted_num = num2;
        this.updated_num = num3;
    }
}
