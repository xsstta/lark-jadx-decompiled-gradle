package com.bytedance.ee.bear.drive.biz.cache.manual.model;

import java.io.Serializable;
import java.util.List;

public class ManualOfflineSyncDeletedTokenData implements Serializable {
    private static final long serialVersionUID = 1526287287577557136L;
    private List<Token> tokens;

    public static class Token implements Serializable {
        private String token;
        private int type;

        public String getToken() {
            return this.token;
        }

        public int getType() {
            return this.type;
        }

        public void setToken(String str) {
            this.token = str;
        }

        public void setType(int i) {
            this.type = i;
        }
    }

    public List<Token> getTokens() {
        return this.tokens;
    }

    public void setTokens(List<Token> list) {
        this.tokens = list;
    }
}
