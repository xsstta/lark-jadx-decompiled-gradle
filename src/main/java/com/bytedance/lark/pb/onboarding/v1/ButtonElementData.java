package com.bytedance.lark.pb.onboarding.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ButtonElementData extends Message<ButtonElementData, C18570a> {
    public static final ProtoAdapter<ButtonElementData> ADAPTER = new C18571b();
    private static final long serialVersionUID = 0;
    public final String text;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.ButtonElementData$b */
    private static final class C18571b extends ProtoAdapter<ButtonElementData> {
        C18571b() {
            super(FieldEncoding.LENGTH_DELIMITED, ButtonElementData.class);
        }

        /* renamed from: a */
        public int encodedSize(ButtonElementData buttonElementData) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, buttonElementData.text) + buttonElementData.unknownFields().size();
        }

        /* renamed from: a */
        public ButtonElementData decode(ProtoReader protoReader) throws IOException {
            C18570a aVar = new C18570a();
            aVar.f46067a = "";
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
                    aVar.f46067a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ButtonElementData buttonElementData) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, buttonElementData.text);
            protoWriter.writeBytes(buttonElementData.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.ButtonElementData$a */
    public static final class C18570a extends Message.Builder<ButtonElementData, C18570a> {

        /* renamed from: a */
        public String f46067a;

        /* renamed from: a */
        public ButtonElementData build() {
            String str = this.f46067a;
            if (str != null) {
                return new ButtonElementData(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "text");
        }

        /* renamed from: a */
        public C18570a mo64031a(String str) {
            this.f46067a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18570a newBuilder() {
        C18570a aVar = new C18570a();
        aVar.f46067a = this.text;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "ButtonElementData");
        StringBuilder sb = new StringBuilder();
        sb.append(", text=");
        sb.append(this.text);
        StringBuilder replace = sb.replace(0, 2, "ButtonElementData{");
        replace.append('}');
        return replace.toString();
    }

    public ButtonElementData(String str) {
        this(str, ByteString.EMPTY);
    }

    public ButtonElementData(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text = str;
    }
}
