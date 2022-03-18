package com.ss.android.lark.pb.dynamic_resource;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ConstantKeyImageData extends Message<ConstantKeyImageData, C49620a> {
    public static final ProtoAdapter<ConstantKeyImageData> ADAPTER = new C49621b();
    private static final long serialVersionUID = 0;
    public final String mdynamic_key;
    public final String mqr_code;
    public final ConstantKeyImageType mtype;

    /* renamed from: com.ss.android.lark.pb.dynamic_resource.ConstantKeyImageData$b */
    private static final class C49621b extends ProtoAdapter<ConstantKeyImageData> {
        C49621b() {
            super(FieldEncoding.LENGTH_DELIMITED, ConstantKeyImageData.class);
        }

        /* renamed from: a */
        public int encodedSize(ConstantKeyImageData constantKeyImageData) {
            int i;
            int encodedSizeWithTag = ConstantKeyImageType.ADAPTER.encodedSizeWithTag(1, constantKeyImageData.mtype);
            int i2 = 0;
            if (constantKeyImageData.mdynamic_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, constantKeyImageData.mdynamic_key);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (constantKeyImageData.mqr_code != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, constantKeyImageData.mqr_code);
            }
            return i3 + i2 + constantKeyImageData.unknownFields().size();
        }

        /* renamed from: a */
        public ConstantKeyImageData decode(ProtoReader protoReader) throws IOException {
            C49620a aVar = new C49620a();
            aVar.f124247b = "";
            aVar.f124248c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f124246a = ConstantKeyImageType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f124247b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124248c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ConstantKeyImageData constantKeyImageData) throws IOException {
            ConstantKeyImageType.ADAPTER.encodeWithTag(protoWriter, 1, constantKeyImageData.mtype);
            if (constantKeyImageData.mdynamic_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, constantKeyImageData.mdynamic_key);
            }
            if (constantKeyImageData.mqr_code != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, constantKeyImageData.mqr_code);
            }
            protoWriter.writeBytes(constantKeyImageData.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49620a newBuilder() {
        C49620a aVar = new C49620a();
        aVar.f124246a = this.mtype;
        aVar.f124247b = this.mdynamic_key;
        aVar.f124248c = this.mqr_code;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.dynamic_resource.ConstantKeyImageData$a */
    public static final class C49620a extends Message.Builder<ConstantKeyImageData, C49620a> {

        /* renamed from: a */
        public ConstantKeyImageType f124246a;

        /* renamed from: b */
        public String f124247b;

        /* renamed from: c */
        public String f124248c;

        /* renamed from: a */
        public ConstantKeyImageData build() {
            ConstantKeyImageType constantKeyImageType = this.f124246a;
            if (constantKeyImageType != null) {
                return new ConstantKeyImageData(constantKeyImageType, this.f124247b, this.f124248c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(constantKeyImageType, "mtype");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.mtype);
        if (this.mdynamic_key != null) {
            sb.append(", dynamic_key=");
            sb.append(this.mdynamic_key);
        }
        if (this.mqr_code != null) {
            sb.append(", qr_code=");
            sb.append(this.mqr_code);
        }
        StringBuilder replace = sb.replace(0, 2, "ConstantKeyImageData{");
        replace.append('}');
        return replace.toString();
    }

    public ConstantKeyImageData(ConstantKeyImageType constantKeyImageType, String str, String str2) {
        this(constantKeyImageType, str, str2, ByteString.EMPTY);
    }

    public ConstantKeyImageData(ConstantKeyImageType constantKeyImageType, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtype = constantKeyImageType;
        this.mdynamic_key = str;
        this.mqr_code = str2;
    }
}
