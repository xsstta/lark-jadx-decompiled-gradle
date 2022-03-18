package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class FocusInfo extends Message<FocusInfo, C17138a> {
    public static final ProtoAdapter<FocusInfo> ADAPTER = new C17139b();
    public static final Long DEFAULT_MESSAGE_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long message_id;

    /* renamed from: com.bytedance.lark.pb.feed.v1.FocusInfo$b */
    private static final class C17139b extends ProtoAdapter<FocusInfo> {
        C17139b() {
            super(FieldEncoding.LENGTH_DELIMITED, FocusInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(FocusInfo focusInfo) {
            int i;
            if (focusInfo.message_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, focusInfo.message_id);
            } else {
                i = 0;
            }
            return i + focusInfo.unknownFields().size();
        }

        /* renamed from: a */
        public FocusInfo decode(ProtoReader protoReader) throws IOException {
            C17138a aVar = new C17138a();
            aVar.f43886a = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43886a = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FocusInfo focusInfo) throws IOException {
            if (focusInfo.message_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, focusInfo.message_id);
            }
            protoWriter.writeBytes(focusInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.FocusInfo$a */
    public static final class C17138a extends Message.Builder<FocusInfo, C17138a> {

        /* renamed from: a */
        public Long f43886a;

        /* renamed from: a */
        public FocusInfo build() {
            return new FocusInfo(this.f43886a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17138a newBuilder() {
        C17138a aVar = new C17138a();
        aVar.f43886a = this.message_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "FocusInfo");
        StringBuilder sb = new StringBuilder();
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        StringBuilder replace = sb.replace(0, 2, "FocusInfo{");
        replace.append('}');
        return replace.toString();
    }

    public FocusInfo(Long l) {
        this(l, ByteString.EMPTY);
    }

    public FocusInfo(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = l;
    }
}
