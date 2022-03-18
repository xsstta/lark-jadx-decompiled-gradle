package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.moments_entities.AnonymousNickname;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PullNicknamesResponse extends Message<PullNicknamesResponse, C49940a> {
    public static final ProtoAdapter<PullNicknamesResponse> ADAPTER = new C49941b();
    private static final long serialVersionUID = 0;
    public final List<AnonymousNickname> mnickname_list;

    /* renamed from: com.ss.android.lark.pb.moments.PullNicknamesResponse$b */
    private static final class C49941b extends ProtoAdapter<PullNicknamesResponse> {
        C49941b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullNicknamesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullNicknamesResponse pullNicknamesResponse) {
            return AnonymousNickname.ADAPTER.asRepeated().encodedSizeWithTag(1, pullNicknamesResponse.mnickname_list) + pullNicknamesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullNicknamesResponse decode(ProtoReader protoReader) throws IOException {
            C49940a aVar = new C49940a();
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
                    aVar.f124948a.add(AnonymousNickname.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullNicknamesResponse pullNicknamesResponse) throws IOException {
            AnonymousNickname.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pullNicknamesResponse.mnickname_list);
            protoWriter.writeBytes(pullNicknamesResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments.PullNicknamesResponse$a */
    public static final class C49940a extends Message.Builder<PullNicknamesResponse, C49940a> {

        /* renamed from: a */
        public List<AnonymousNickname> f124948a = Internal.newMutableList();

        /* renamed from: a */
        public PullNicknamesResponse build() {
            return new PullNicknamesResponse(this.f124948a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49940a newBuilder() {
        C49940a aVar = new C49940a();
        aVar.f124948a = Internal.copyOf("mnickname_list", this.mnickname_list);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mnickname_list.isEmpty()) {
            sb.append(", nickname_list=");
            sb.append(this.mnickname_list);
        }
        StringBuilder replace = sb.replace(0, 2, "PullNicknamesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullNicknamesResponse(List<AnonymousNickname> list) {
        this(list, ByteString.EMPTY);
    }

    public PullNicknamesResponse(List<AnonymousNickname> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mnickname_list = Internal.immutableCopyOf("mnickname_list", list);
    }
}
