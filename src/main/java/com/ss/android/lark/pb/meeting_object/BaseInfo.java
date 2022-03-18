package com.ss.android.lark.pb.meeting_object;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class BaseInfo extends Message<BaseInfo, C49845a> {
    public static final ProtoAdapter<BaseInfo> ADAPTER = new C49846b();
    private static final long serialVersionUID = 0;
    public final String mobject_token;
    public final MMPageType mpage_type;

    /* renamed from: com.ss.android.lark.pb.meeting_object.BaseInfo$b */
    private static final class C49846b extends ProtoAdapter<BaseInfo> {
        C49846b() {
            super(FieldEncoding.LENGTH_DELIMITED, BaseInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(BaseInfo baseInfo) {
            int i;
            int encodedSizeWithTag = MMPageType.ADAPTER.encodedSizeWithTag(1, baseInfo.mpage_type);
            if (baseInfo.mobject_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, baseInfo.mobject_token);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + baseInfo.unknownFields().size();
        }

        /* renamed from: a */
        public BaseInfo decode(ProtoReader protoReader) throws IOException {
            C49845a aVar = new C49845a();
            aVar.f124789b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f124788a = MMPageType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124789b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BaseInfo baseInfo) throws IOException {
            MMPageType.ADAPTER.encodeWithTag(protoWriter, 1, baseInfo.mpage_type);
            if (baseInfo.mobject_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, baseInfo.mobject_token);
            }
            protoWriter.writeBytes(baseInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.meeting_object.BaseInfo$a */
    public static final class C49845a extends Message.Builder<BaseInfo, C49845a> {

        /* renamed from: a */
        public MMPageType f124788a;

        /* renamed from: b */
        public String f124789b;

        /* renamed from: a */
        public BaseInfo build() {
            MMPageType mMPageType = this.f124788a;
            if (mMPageType != null) {
                return new BaseInfo(mMPageType, this.f124789b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(mMPageType, "mpage_type");
        }
    }

    @Override // com.squareup.wire.Message
    public C49845a newBuilder() {
        C49845a aVar = new C49845a();
        aVar.f124788a = this.mpage_type;
        aVar.f124789b = this.mobject_token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", page_type=");
        sb.append(this.mpage_type);
        if (this.mobject_token != null) {
            sb.append(", object_token=");
            sb.append(this.mobject_token);
        }
        StringBuilder replace = sb.replace(0, 2, "BaseInfo{");
        replace.append('}');
        return replace.toString();
    }

    public BaseInfo(MMPageType mMPageType, String str) {
        this(mMPageType, str, ByteString.EMPTY);
    }

    public BaseInfo(MMPageType mMPageType, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mpage_type = mMPageType;
        this.mobject_token = str;
    }
}
