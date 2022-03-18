package com.ss.android.lark.voip.service.impl.sodium;

import com.C1711a;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NaCl {
    private static final Logger LOGGER = Logger.getLogger(NaCl.class.getName());
    private static boolean sIsSoLoaded = false;

    /* access modifiers changed from: private */
    public static final class SingletonHolder {
        public static final Sodium SODIUM_INSTANCE = new Sodium();

        private SingletonHolder() {
        }
    }

    private NaCl() {
    }

    public static boolean isSoLoaded() {
        return sIsSoLoaded;
    }

    public static Sodium sodium() {
        if (!sIsSoLoaded) {
            try {
                String property = System.getProperty("java.library.path");
                Logger logger = LOGGER;
                Level level = Level.INFO;
                logger.log(level, "librarypath=" + property);
                C1711a.m7628a("bytertc-crypto");
                Sodium.sodium_init();
                sIsSoLoaded = true;
            } catch (Throwable th) {
                sIsSoLoaded = false;
                Logger logger2 = LOGGER;
                Level level2 = Level.INFO;
                logger2.log(level2, "load bytertc-crypto fail = " + th);
            }
        }
        return SingletonHolder.SODIUM_INSTANCE;
    }
}
