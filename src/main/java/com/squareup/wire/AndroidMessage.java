package com.squareup.wire;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.io.IOException;
import java.lang.reflect.Array;
import okio.ByteString;

public abstract class AndroidMessage<M extends Message<M, B>, B extends Message.Builder<M, B>> extends Message<M, B> implements Parcelable {
    public final int describeContents() {
        return 0;
    }

    private static final class ProtoAdapterCreator<M> implements Parcelable.Creator<M> {
        private final ProtoAdapter<M> adapter;

        ProtoAdapterCreator(ProtoAdapter<M> protoAdapter) {
            this.adapter = protoAdapter;
        }

        @Override // android.os.Parcelable.Creator
        public M[] newArray(int i) {
            return (M[]) ((Object[]) Array.newInstance(this.adapter.javaType, i));
        }

        @Override // android.os.Parcelable.Creator
        public M createFromParcel(Parcel parcel) {
            try {
                return this.adapter.decode(parcel.createByteArray());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static <E> Parcelable.Creator<E> newCreator(ProtoAdapter<E> protoAdapter) {
        return new ProtoAdapterCreator(protoAdapter);
    }

    protected AndroidMessage(ProtoAdapter<M> protoAdapter, ByteString byteString) {
        super(protoAdapter, byteString);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(encode());
    }
}
