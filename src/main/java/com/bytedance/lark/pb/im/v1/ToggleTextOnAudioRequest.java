package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ToggleTextOnAudioRequest extends Message<ToggleTextOnAudioRequest, C18093a> {
    public static final ProtoAdapter<ToggleTextOnAudioRequest> ADAPTER = new C18094b();
    public static final Boolean DEFAULT_HIDE_VOICE2TEXT = false;
    private static final long serialVersionUID = 0;
    public final Boolean hide_voice2text;
    public final String message_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.ToggleTextOnAudioRequest$b */
    private static final class C18094b extends ProtoAdapter<ToggleTextOnAudioRequest> {
        C18094b() {
            super(FieldEncoding.LENGTH_DELIMITED, ToggleTextOnAudioRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ToggleTextOnAudioRequest toggleTextOnAudioRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, toggleTextOnAudioRequest.message_id) + ProtoAdapter.BOOL.encodedSizeWithTag(2, toggleTextOnAudioRequest.hide_voice2text) + toggleTextOnAudioRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ToggleTextOnAudioRequest decode(ProtoReader protoReader) throws IOException {
            C18093a aVar = new C18093a();
            aVar.f45236a = "";
            aVar.f45237b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45236a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45237b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ToggleTextOnAudioRequest toggleTextOnAudioRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, toggleTextOnAudioRequest.message_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, toggleTextOnAudioRequest.hide_voice2text);
            protoWriter.writeBytes(toggleTextOnAudioRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18093a newBuilder() {
        C18093a aVar = new C18093a();
        aVar.f45236a = this.message_id;
        aVar.f45237b = this.hide_voice2text;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ToggleTextOnAudioRequest$a */
    public static final class C18093a extends Message.Builder<ToggleTextOnAudioRequest, C18093a> {

        /* renamed from: a */
        public String f45236a;

        /* renamed from: b */
        public Boolean f45237b;

        /* renamed from: a */
        public ToggleTextOnAudioRequest build() {
            Boolean bool;
            String str = this.f45236a;
            if (str != null && (bool = this.f45237b) != null) {
                return new ToggleTextOnAudioRequest(str, bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "message_id", this.f45237b, "hide_voice2text");
        }

        /* renamed from: a */
        public C18093a mo62777a(Boolean bool) {
            this.f45237b = bool;
            return this;
        }

        /* renamed from: a */
        public C18093a mo62778a(String str) {
            this.f45236a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "ToggleTextOnAudioRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", message_id=");
        sb.append(this.message_id);
        sb.append(", hide_voice2text=");
        sb.append(this.hide_voice2text);
        StringBuilder replace = sb.replace(0, 2, "ToggleTextOnAudioRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ToggleTextOnAudioRequest(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public ToggleTextOnAudioRequest(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.hide_voice2text = bool;
    }
}
