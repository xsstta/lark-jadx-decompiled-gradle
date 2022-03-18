package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class Action extends Message<Action, C49425a> {
    public static final ProtoAdapter<Action> ADAPTER = new C49426b();
    private static final long serialVersionUID = 0;
    public final String mapp_link;
    public final String micon_url;
    public final String micon_url_dark;
    public final String mname;

    /* renamed from: com.ss.android.lark.pb.ai.Action$b */
    private static final class C49426b extends ProtoAdapter<Action> {
        C49426b() {
            super(FieldEncoding.LENGTH_DELIMITED, Action.class);
        }

        /* renamed from: a */
        public int encodedSize(Action action) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, action.mname) + ProtoAdapter.STRING.encodedSizeWithTag(2, action.mapp_link) + ProtoAdapter.STRING.encodedSizeWithTag(3, action.micon_url) + ProtoAdapter.STRING.encodedSizeWithTag(4, action.micon_url_dark) + action.unknownFields().size();
        }

        /* renamed from: a */
        public Action decode(ProtoReader protoReader) throws IOException {
            C49425a aVar = new C49425a();
            aVar.f123967a = "";
            aVar.f123968b = "";
            aVar.f123969c = "";
            aVar.f123970d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f123967a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f123968b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f123969c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f123970d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Action action) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, action.mname);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, action.mapp_link);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, action.micon_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, action.micon_url_dark);
            protoWriter.writeBytes(action.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49425a newBuilder() {
        C49425a aVar = new C49425a();
        aVar.f123967a = this.mname;
        aVar.f123968b = this.mapp_link;
        aVar.f123969c = this.micon_url;
        aVar.f123970d = this.micon_url_dark;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", name=");
        sb.append(this.mname);
        sb.append(", app_link=");
        sb.append(this.mapp_link);
        sb.append(", icon_url=");
        sb.append(this.micon_url);
        sb.append(", icon_url_dark=");
        sb.append(this.micon_url_dark);
        StringBuilder replace = sb.replace(0, 2, "Action{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.ss.android.lark.pb.ai.Action$a */
    public static final class C49425a extends Message.Builder<Action, C49425a> {

        /* renamed from: a */
        public String f123967a;

        /* renamed from: b */
        public String f123968b;

        /* renamed from: c */
        public String f123969c;

        /* renamed from: d */
        public String f123970d;

        /* renamed from: a */
        public Action build() {
            String str;
            String str2;
            String str3;
            String str4 = this.f123967a;
            if (str4 != null && (str = this.f123968b) != null && (str2 = this.f123969c) != null && (str3 = this.f123970d) != null) {
                return new Action(str4, str, str2, str3, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str4, "mname", this.f123968b, "mapp_link", this.f123969c, "micon_url", this.f123970d, "micon_url_dark");
        }
    }

    public Action(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, ByteString.EMPTY);
    }

    public Action(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mname = str;
        this.mapp_link = str2;
        this.micon_url = str3;
        this.micon_url_dark = str4;
    }
}
