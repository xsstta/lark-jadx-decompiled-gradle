package com.ss.ttvideoengine.source;

public interface Source {

    public static final class EncodeType {
    }

    public enum Type {
        DIRECT_URL_SOURCE,
        VID_PLAY_AUTH_TOKEN_SOURCE
    }

    Type type();

    String vid();
}
