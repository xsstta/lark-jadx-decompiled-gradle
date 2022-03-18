package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class TransferFolderInfo extends Message<TransferFolderInfo, C18290a> {
    public static final ProtoAdapter<TransferFolderInfo> ADAPTER = new C18291b();
    public static final Integer DEFAULT_TOTAL_NUMBER = 0;
    public static final Integer DEFAULT_TRANSFERRED_NUMBER = 0;
    private static final long serialVersionUID = 0;
    public final Integer total_number;
    public final Integer transferred_number;

    /* renamed from: com.bytedance.lark.pb.media.v1.TransferFolderInfo$b */
    private static final class C18291b extends ProtoAdapter<TransferFolderInfo> {
        C18291b() {
            super(FieldEncoding.LENGTH_DELIMITED, TransferFolderInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(TransferFolderInfo transferFolderInfo) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, transferFolderInfo.total_number) + ProtoAdapter.INT32.encodedSizeWithTag(2, transferFolderInfo.transferred_number) + transferFolderInfo.unknownFields().size();
        }

        /* renamed from: a */
        public TransferFolderInfo decode(ProtoReader protoReader) throws IOException {
            C18290a aVar = new C18290a();
            aVar.f45583a = 0;
            aVar.f45584b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45583a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45584b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TransferFolderInfo transferFolderInfo) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, transferFolderInfo.total_number);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, transferFolderInfo.transferred_number);
            protoWriter.writeBytes(transferFolderInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18290a newBuilder() {
        C18290a aVar = new C18290a();
        aVar.f45583a = this.total_number;
        aVar.f45584b = this.transferred_number;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.TransferFolderInfo$a */
    public static final class C18290a extends Message.Builder<TransferFolderInfo, C18290a> {

        /* renamed from: a */
        public Integer f45583a;

        /* renamed from: b */
        public Integer f45584b;

        /* renamed from: a */
        public TransferFolderInfo build() {
            Integer num;
            Integer num2 = this.f45583a;
            if (num2 != null && (num = this.f45584b) != null) {
                return new TransferFolderInfo(num2, num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num2, "total_number", this.f45584b, "transferred_number");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "TransferFolderInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", total_number=");
        sb.append(this.total_number);
        sb.append(", transferred_number=");
        sb.append(this.transferred_number);
        StringBuilder replace = sb.replace(0, 2, "TransferFolderInfo{");
        replace.append('}');
        return replace.toString();
    }

    public TransferFolderInfo(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public TransferFolderInfo(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.total_number = num;
        this.transferred_number = num2;
    }
}
