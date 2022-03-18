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

public final class SetBlockEntityResponse extends Message<SetBlockEntityResponse, C15490a> {
    public static final ProtoAdapter<SetBlockEntityResponse> ADAPTER = new C15491b();
    public static final Integer DEFAULT_INSERTED_NUM = 0;
    public static final Integer DEFAULT_TOTAL_NUM = 0;
    public static final Integer DEFAULT_UPDATED_NUM = 0;
    private static final long serialVersionUID = 0;
    public final Integer inserted_num;
    public final Integer total_num;
    public final Integer updated_num;

    /* renamed from: com.bytedance.lark.pb.block.v1.SetBlockEntityResponse$b */
    private static final class C15491b extends ProtoAdapter<SetBlockEntityResponse> {
        C15491b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetBlockEntityResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetBlockEntityResponse setBlockEntityResponse) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, setBlockEntityResponse.total_num) + ProtoAdapter.INT32.encodedSizeWithTag(2, setBlockEntityResponse.inserted_num) + ProtoAdapter.INT32.encodedSizeWithTag(3, setBlockEntityResponse.updated_num) + setBlockEntityResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetBlockEntityResponse decode(ProtoReader protoReader) throws IOException {
            C15490a aVar = new C15490a();
            aVar.f40948a = 0;
            aVar.f40949b = 0;
            aVar.f40950c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40948a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f40949b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40950c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetBlockEntityResponse setBlockEntityResponse) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, setBlockEntityResponse.total_num);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, setBlockEntityResponse.inserted_num);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, setBlockEntityResponse.updated_num);
            protoWriter.writeBytes(setBlockEntityResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15490a newBuilder() {
        C15490a aVar = new C15490a();
        aVar.f40948a = this.total_num;
        aVar.f40949b = this.inserted_num;
        aVar.f40950c = this.updated_num;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.block.v1.SetBlockEntityResponse$a */
    public static final class C15490a extends Message.Builder<SetBlockEntityResponse, C15490a> {

        /* renamed from: a */
        public Integer f40948a;

        /* renamed from: b */
        public Integer f40949b;

        /* renamed from: c */
        public Integer f40950c;

        /* renamed from: a */
        public SetBlockEntityResponse build() {
            Integer num;
            Integer num2;
            Integer num3 = this.f40948a;
            if (num3 != null && (num = this.f40949b) != null && (num2 = this.f40950c) != null) {
                return new SetBlockEntityResponse(num3, num, num2, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num3, "total_num", this.f40949b, "inserted_num", this.f40950c, "updated_num");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("block", "SetBlockEntityResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", total_num=");
        sb.append(this.total_num);
        sb.append(", inserted_num=");
        sb.append(this.inserted_num);
        sb.append(", updated_num=");
        sb.append(this.updated_num);
        StringBuilder replace = sb.replace(0, 2, "SetBlockEntityResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetBlockEntityResponse(Integer num, Integer num2, Integer num3) {
        this(num, num2, num3, ByteString.EMPTY);
    }

    public SetBlockEntityResponse(Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.total_num = num;
        this.inserted_num = num2;
        this.updated_num = num3;
    }
}
