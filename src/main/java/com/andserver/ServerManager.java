package com.andserver;

import android.content.Context;

public class ServerManager {
    public void startServer(Context context) {
    }

    private static final class HOLDER {
        public static final ServerManager INSTANCE = new ServerManager();

        private HOLDER() {
        }
    }

    public static ServerManager getInstance() {
        return HOLDER.INSTANCE;
    }
}
