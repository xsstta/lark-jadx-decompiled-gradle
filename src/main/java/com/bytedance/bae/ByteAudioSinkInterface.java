package com.bytedance.bae;

public interface ByteAudioSinkInterface {

    public interface ByteAudioAuxSink {
        void onMixingBegin(ByteAudioAuxStream byteAudioAuxStream);

        void onMixingEnd(ByteAudioAuxStream byteAudioAuxStream);

        int onPullAudioBufferToAuxStream(ByteAudioAuxStream byteAudioAuxStream, ByteAudioStreamBuffer byteAudioStreamBuffer);
    }

    public interface ByteAudioFilterSink {
        int onProcess(ByteAudioStreamBuffer byteAudioStreamBuffer);
    }

    public interface ByteAudioInputSink {
        int onPushAudioBufferFromStream(ByteAudioInputStream byteAudioInputStream, ByteAudioStreamBuffer byteAudioStreamBuffer);
    }

    public interface ByteAudioOutputSink {
        int onPullAudioBufferToStream(ByteAudioOutputStream byteAudioOutputStream, ByteAudioStreamBuffer byteAudioStreamBuffer);
    }
}
