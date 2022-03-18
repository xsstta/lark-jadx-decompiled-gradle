package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ActionExtraInfo extends Message<ActionExtraInfo, C49636a> {
    public static final ProtoAdapter<ActionExtraInfo> ADAPTER = new C49637b();
    public static final Long DEFAULT_ADMIN_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long madmin_id;
    public final String mparams;
    public final String murl;

    /* renamed from: com.ss.android.lark.pb.entities.ActionExtraInfo$b */
    private static final class C49637b extends ProtoAdapter<ActionExtraInfo> {
        C49637b() {
            super(FieldEncoding.LENGTH_DELIMITED, ActionExtraInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(ActionExtraInfo actionExtraInfo) {
            int i;
            int i2;
            int i3 = 0;
            if (actionExtraInfo.madmin_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, actionExtraInfo.madmin_id);
            } else {
                i = 0;
            }
            if (actionExtraInfo.murl != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, actionExtraInfo.murl);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (actionExtraInfo.mparams != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, actionExtraInfo.mparams);
            }
            return i4 + i3 + actionExtraInfo.unknownFields().size();
        }

        /* renamed from: a */
        public ActionExtraInfo decode(ProtoReader protoReader) throws IOException {
            C49636a aVar = new C49636a();
            aVar.f124281a = 0L;
            aVar.f124282b = "";
            aVar.f124283c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124281a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124282b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124283c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ActionExtraInfo actionExtraInfo) throws IOException {
            if (actionExtraInfo.madmin_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, actionExtraInfo.madmin_id);
            }
            if (actionExtraInfo.murl != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, actionExtraInfo.murl);
            }
            if (actionExtraInfo.mparams != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, actionExtraInfo.mparams);
            }
            protoWriter.writeBytes(actionExtraInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.ActionExtraInfo$a */
    public static final class C49636a extends Message.Builder<ActionExtraInfo, C49636a> {

        /* renamed from: a */
        public Long f124281a;

        /* renamed from: b */
        public String f124282b;

        /* renamed from: c */
        public String f124283c;

        /* renamed from: a */
        public ActionExtraInfo build() {
            return new ActionExtraInfo(this.f124281a, this.f124282b, this.f124283c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49636a newBuilder() {
        C49636a aVar = new C49636a();
        aVar.f124281a = this.madmin_id;
        aVar.f124282b = this.murl;
        aVar.f124283c = this.mparams;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.madmin_id != null) {
            sb.append(", admin_id=");
            sb.append(this.madmin_id);
        }
        if (this.murl != null) {
            sb.append(", url=");
            sb.append(this.murl);
        }
        if (this.mparams != null) {
            sb.append(", params=");
            sb.append(this.mparams);
        }
        StringBuilder replace = sb.replace(0, 2, "ActionExtraInfo{");
        replace.append('}');
        return replace.toString();
    }

    public ActionExtraInfo(Long l, String str, String str2) {
        this(l, str, str2, ByteString.EMPTY);
    }

    public ActionExtraInfo(Long l, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.madmin_id = l;
        this.murl = str;
        this.mparams = str2;
    }
}
