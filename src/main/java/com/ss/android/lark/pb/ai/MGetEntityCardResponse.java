package com.ss.android.lark.pb.ai;

import com.huawei.hms.location.LocationRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MGetEntityCardResponse extends Message<MGetEntityCardResponse, C49497a> {
    public static final ProtoAdapter<MGetEntityCardResponse> ADAPTER = new C49498b();
    public static final Integer DEFAULT_ERR_CODE = 0;
    private static final long serialVersionUID = 0;
    public final List<EntityCardData> mcards;
    public final Integer merr_code;
    public final String merr_msg;

    /* renamed from: com.ss.android.lark.pb.ai.MGetEntityCardResponse$b */
    private static final class C49498b extends ProtoAdapter<MGetEntityCardResponse> {
        C49498b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetEntityCardResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetEntityCardResponse mGetEntityCardResponse) {
            int i;
            int encodedSizeWithTag = EntityCardData.ADAPTER.asRepeated().encodedSizeWithTag(1, mGetEntityCardResponse.mcards);
            int i2 = 0;
            if (mGetEntityCardResponse.merr_code != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(LocationRequest.PRIORITY_HD_ACCURACY, mGetEntityCardResponse.merr_code);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (mGetEntityCardResponse.merr_msg != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(201, mGetEntityCardResponse.merr_msg);
            }
            return i3 + i2 + mGetEntityCardResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MGetEntityCardResponse decode(ProtoReader protoReader) throws IOException {
            C49497a aVar = new C49497a();
            aVar.f124095b = 0;
            aVar.f124096c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124094a.add(EntityCardData.ADAPTER.decode(protoReader));
                } else if (nextTag == 200) {
                    aVar.f124095b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 201) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124096c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetEntityCardResponse mGetEntityCardResponse) throws IOException {
            EntityCardData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mGetEntityCardResponse.mcards);
            if (mGetEntityCardResponse.merr_code != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, LocationRequest.PRIORITY_HD_ACCURACY, mGetEntityCardResponse.merr_code);
            }
            if (mGetEntityCardResponse.merr_msg != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 201, mGetEntityCardResponse.merr_msg);
            }
            protoWriter.writeBytes(mGetEntityCardResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.MGetEntityCardResponse$a */
    public static final class C49497a extends Message.Builder<MGetEntityCardResponse, C49497a> {

        /* renamed from: a */
        public List<EntityCardData> f124094a = Internal.newMutableList();

        /* renamed from: b */
        public Integer f124095b;

        /* renamed from: c */
        public String f124096c;

        /* renamed from: a */
        public MGetEntityCardResponse build() {
            return new MGetEntityCardResponse(this.f124094a, this.f124095b, this.f124096c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49497a newBuilder() {
        C49497a aVar = new C49497a();
        aVar.f124094a = Internal.copyOf("mcards", this.mcards);
        aVar.f124095b = this.merr_code;
        aVar.f124096c = this.merr_msg;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mcards.isEmpty()) {
            sb.append(", cards=");
            sb.append(this.mcards);
        }
        if (this.merr_code != null) {
            sb.append(", err_code=");
            sb.append(this.merr_code);
        }
        if (this.merr_msg != null) {
            sb.append(", err_msg=");
            sb.append(this.merr_msg);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetEntityCardResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MGetEntityCardResponse(List<EntityCardData> list, Integer num, String str) {
        this(list, num, str, ByteString.EMPTY);
    }

    public MGetEntityCardResponse(List<EntityCardData> list, Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcards = Internal.immutableCopyOf("mcards", list);
        this.merr_code = num;
        this.merr_msg = str;
    }
}
