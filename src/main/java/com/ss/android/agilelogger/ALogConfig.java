package com.ss.android.agilelogger;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.agilelogger.utils.C27525a;

public class ALogConfig {
    private String bufferDirPath;
    private boolean compress;
    private Context context;
    private boolean enableOffloadInAllProcess;
    private boolean encrypt;
    private int level;
    private String logDirPath;
    private int logFileExpDays;
    private boolean mainThreadSpeedUp;
    private int maxDirSize;
    private boolean offloadMainThreadWrite;
    private int perSize;
    private String pubKey;

    private ALogConfig() {
    }

    public boolean enableOffloadInAllProcess() {
        return this.enableOffloadInAllProcess;
    }

    public String getBufferDirPath() {
        return this.bufferDirPath;
    }

    public Context getContext() {
        return this.context;
    }

    public int getLevel() {
        return this.level;
    }

    public String getLogDirPath() {
        return this.logDirPath;
    }

    public int getLogFileExpDays() {
        return this.logFileExpDays;
    }

    public int getMaxDirSize() {
        return this.maxDirSize;
    }

    public int getPerSize() {
        return this.perSize;
    }

    public String getPubKey() {
        return this.pubKey;
    }

    public boolean isCompress() {
        return this.compress;
    }

    public boolean isEncrypt() {
        return this.encrypt;
    }

    public boolean isMainThreadSpeedUp() {
        return this.mainThreadSpeedUp;
    }

    public boolean isOffloadMainThreadWrite() {
        return this.offloadMainThreadWrite;
    }

    /* renamed from: com.ss.android.agilelogger.ALogConfig$a */
    public static class C27504a {

        /* renamed from: a */
        private Context f68730a;

        /* renamed from: b */
        private int f68731b = 14;

        /* renamed from: c */
        private int f68732c = 20971520;

        /* renamed from: d */
        private int f68733d = 2097152;

        /* renamed from: e */
        private String f68734e;

        /* renamed from: f */
        private String f68735f;

        /* renamed from: g */
        private boolean f68736g = true;

        /* renamed from: h */
        private boolean f68737h = true;

        /* renamed from: i */
        private int f68738i = 3;

        /* renamed from: j */
        private String f68739j = "fecbb32b759120b672045f74edc41d159b6a426ffc863b9e0be9ad4be12824546f549959b838993a430344f15197221e87bd362298814c75f5068148b980306f";

        /* renamed from: k */
        private boolean f68740k = true;

        /* renamed from: l */
        private boolean f68741l;

        /* renamed from: m */
        private boolean f68742m;

        /* renamed from: a */
        public ALogConfig mo98126a() {
            String str;
            String str2;
            ALogConfig aLogConfig = new ALogConfig();
            aLogConfig.setContext(this.f68730a);
            aLogConfig.setLogFileExpDays(this.f68731b);
            aLogConfig.setMaxDirSize(this.f68732c);
            aLogConfig.setPerSize(this.f68733d);
            if (TextUtils.isEmpty(this.f68734e)) {
                str = C27525a.m100464b(this.f68730a);
            } else {
                str = this.f68734e;
            }
            aLogConfig.setBufferDirPath(str);
            if (TextUtils.isEmpty(this.f68735f)) {
                str2 = C27525a.m100463a(this.f68730a).getAbsolutePath();
            } else {
                str2 = this.f68735f;
            }
            aLogConfig.setLogDirPath(str2);
            aLogConfig.setCompress(this.f68736g);
            aLogConfig.setEncrypt(this.f68737h);
            aLogConfig.setLevel(this.f68738i);
            aLogConfig.setPubKey(this.f68739j);
            aLogConfig.setMainThreadSpeedUp(this.f68740k);
            aLogConfig.setOffloadMainThreadWrite(this.f68741l);
            aLogConfig.setEnableOffloadInAllProcess(this.f68742m);
            return aLogConfig;
        }

        /* renamed from: a */
        public C27504a mo98123a(int i) {
            this.f68732c = i;
            return this;
        }

        /* renamed from: b */
        public C27504a mo98127b(int i) {
            this.f68733d = i;
            return this;
        }

        /* renamed from: a */
        public C27504a mo98124a(String str) {
            this.f68735f = str;
            return this;
        }

        /* renamed from: b */
        public C27504a mo98128b(boolean z) {
            this.f68742m = z;
            return this;
        }

        /* renamed from: a */
        public C27504a mo98125a(boolean z) {
            this.f68741l = z;
            return this;
        }

        public C27504a(Context context) {
            if (context != null) {
                Context applicationContext = context.getApplicationContext();
                this.f68730a = applicationContext != null ? applicationContext : context;
                return;
            }
            throw new RuntimeException("context must not be null");
        }
    }

    public void setBufferDirPath(String str) {
        this.bufferDirPath = str;
    }

    public void setCompress(boolean z) {
        this.compress = z;
    }

    public void setContext(Context context2) {
        this.context = context2;
    }

    public void setEnableOffloadInAllProcess(boolean z) {
        this.enableOffloadInAllProcess = z;
    }

    public void setEncrypt(boolean z) {
        this.encrypt = z;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setLogDirPath(String str) {
        this.logDirPath = str;
    }

    public void setLogFileExpDays(int i) {
        this.logFileExpDays = i;
    }

    public void setMainThreadSpeedUp(boolean z) {
        this.mainThreadSpeedUp = z;
    }

    public void setMaxDirSize(int i) {
        this.maxDirSize = i;
    }

    public void setOffloadMainThreadWrite(boolean z) {
        this.offloadMainThreadWrite = z;
    }

    public void setPerSize(int i) {
        this.perSize = i;
    }

    public void setPubKey(String str) {
        this.pubKey = str;
    }
}
