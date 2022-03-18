package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class TransExtra extends Message<TransExtra, C49738a> {
    public static final ProtoAdapter<TransExtra> ADAPTER = new C49739b();
    private static final long serialVersionUID = 0;
    public final String mreceiver_device_id;
    public final String msender_device_id;
    public final TransStatus mstatus;

    /* renamed from: com.ss.android.lark.pb.entities.TransExtra$b */
    private static final class C49739b extends ProtoAdapter<TransExtra> {
        C49739b() {
            super(FieldEncoding.LENGTH_DELIMITED, TransExtra.class);
        }

        /* renamed from: a */
        public int encodedSize(TransExtra transExtra) {
            int i;
            int i2;
            int i3 = 0;
            if (transExtra.mstatus != null) {
                i = TransStatus.ADAPTER.encodedSizeWithTag(1, transExtra.mstatus);
            } else {
                i = 0;
            }
            if (transExtra.msender_device_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, transExtra.msender_device_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (transExtra.mreceiver_device_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, transExtra.mreceiver_device_id);
            }
            return i4 + i3 + transExtra.unknownFields().size();
        }

        /* renamed from: a */
        public TransExtra decode(ProtoReader protoReader) throws IOException {
            C49738a aVar = new C49738a();
            aVar.f124573b = "";
            aVar.f124574c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f124572a = TransStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f124573b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124574c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TransExtra transExtra) throws IOException {
            if (transExtra.mstatus != null) {
                TransStatus.ADAPTER.encodeWithTag(protoWriter, 1, transExtra.mstatus);
            }
            if (transExtra.msender_device_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, transExtra.msender_device_id);
            }
            if (transExtra.mreceiver_device_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, transExtra.mreceiver_device_id);
            }
            protoWriter.writeBytes(transExtra.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.TransExtra$a */
    public static final class C49738a extends Message.Builder<TransExtra, C49738a> {

        /* renamed from: a */
        public TransStatus f124572a;

        /* renamed from: b */
        public String f124573b;

        /* renamed from: c */
        public String f124574c;

        /* renamed from: a */
        public TransExtra build() {
            return new TransExtra(this.f124572a, this.f124573b, this.f124574c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49738a newBuilder() {
        C49738a aVar = new C49738a();
        aVar.f124572a = this.mstatus;
        aVar.f124573b = this.msender_device_id;
        aVar.f124574c = this.mreceiver_device_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mstatus != null) {
            sb.append(", status=");
            sb.append(this.mstatus);
        }
        if (this.msender_device_id != null) {
            sb.append(", sender_device_id=");
            sb.append(this.msender_device_id);
        }
        if (this.mreceiver_device_id != null) {
            sb.append(", receiver_device_id=");
            sb.append(this.mreceiver_device_id);
        }
        StringBuilder replace = sb.replace(0, 2, "TransExtra{");
        replace.append('}');
        return replace.toString();
    }

    public TransExtra(TransStatus transStatus, String str, String str2) {
        this(transStatus, str, str2, ByteString.EMPTY);
    }

    public TransExtra(TransStatus transStatus, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mstatus = transStatus;
        this.msender_device_id = str;
        this.mreceiver_device_id = str2;
    }
}
