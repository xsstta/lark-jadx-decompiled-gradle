package com.ss.ttvideoengine.source;

import com.ss.ttvideoengine.source.Source;
import java.util.Objects;

public class VidPlayAuthTokenSource implements Source {
    public final String encodeType;
    public final String playAuthToken;
    public final String vid;

    public static class Builder {
        public String encodeType;
        public String playAuthToken;
        public String vid;

        public Builder() {
        }

        public VidPlayAuthTokenSource build() {
            Objects.requireNonNull(this.vid, "vid is null");
            Objects.requireNonNull(this.playAuthToken, "playAuthToken is null");
            return new VidPlayAuthTokenSource(this);
        }

        public Builder setEncodeType(String str) {
            this.encodeType = str;
            return this;
        }

        public Builder setPlayAuthToken(String str) {
            Objects.requireNonNull(str, "playAuthToken is null");
            this.playAuthToken = str;
            return this;
        }

        public Builder setVid(String str) {
            Objects.requireNonNull(str, "vid is null");
            this.vid = str;
            return this;
        }

        public Builder(VidPlayAuthTokenSource vidPlayAuthTokenSource) {
            this.vid = vidPlayAuthTokenSource.vid;
            this.playAuthToken = vidPlayAuthTokenSource.playAuthToken;
            this.encodeType = vidPlayAuthTokenSource.encodeType;
        }
    }

    public String encodeType() {
        return this.encodeType;
    }

    public String playAuthToken() {
        return this.playAuthToken;
    }

    @Override // com.ss.ttvideoengine.source.Source
    public Source.Type type() {
        return Source.Type.VID_PLAY_AUTH_TOKEN_SOURCE;
    }

    @Override // com.ss.ttvideoengine.source.Source
    public String vid() {
        return this.vid;
    }

    public String toString() {
        return "VidPlayAuthTokenSource{vid='" + this.vid + '\'' + ", playAuthToken='" + this.playAuthToken + '\'' + ", encodeType='" + this.encodeType + '\'' + '}';
    }

    private VidPlayAuthTokenSource(Builder builder) {
        this.vid = builder.vid;
        this.playAuthToken = builder.playAuthToken;
        this.encodeType = builder.encodeType;
    }
}
