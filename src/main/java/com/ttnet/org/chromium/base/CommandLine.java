package com.ttnet.org.chromium.base;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public abstract class CommandLine {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final AtomicReference<CommandLine> sCommandLine = new AtomicReference<>();

    public static native void nativeAppendSwitch(String str);

    public static native void nativeAppendSwitchWithValue(String str, String str2);

    public static native void nativeAppendSwitchesAndArguments(String[] strArr);

    public static native String nativeGetSwitchValue(String str);

    public static native boolean nativeHasSwitch(String str);

    public static native void nativeInit(String[] strArr);

    public abstract void appendSwitch(String str);

    public abstract void appendSwitchWithValue(String str, String str2);

    public abstract void appendSwitchesAndArguments(String[] strArr);

    /* access modifiers changed from: protected */
    public void destroy() {
    }

    /* access modifiers changed from: protected */
    public abstract String[] getCommandLineArguments();

    public abstract String getSwitchValue(String str);

    public abstract boolean hasSwitch(String str);

    public boolean isNativeImplementation() {
        return false;
    }

    private CommandLine() {
    }

    private static class NativeCommandLine extends CommandLine {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* access modifiers changed from: protected */
        @Override // com.ttnet.org.chromium.base.CommandLine
        public String[] getCommandLineArguments() {
            return null;
        }

        @Override // com.ttnet.org.chromium.base.CommandLine
        public boolean isNativeImplementation() {
            return true;
        }

        /* access modifiers changed from: protected */
        @Override // com.ttnet.org.chromium.base.CommandLine
        public void destroy() {
            throw new IllegalStateException("Can't destroy native command line after startup");
        }

        @Override // com.ttnet.org.chromium.base.CommandLine
        public void appendSwitch(String str) {
            CommandLine.nativeAppendSwitch(str);
        }

        @Override // com.ttnet.org.chromium.base.CommandLine
        public void appendSwitchesAndArguments(String[] strArr) {
            CommandLine.nativeAppendSwitchesAndArguments(strArr);
        }

        public NativeCommandLine(String[] strArr) {
            super();
            CommandLine.nativeInit(strArr);
        }

        @Override // com.ttnet.org.chromium.base.CommandLine
        public String getSwitchValue(String str) {
            return CommandLine.nativeGetSwitchValue(str);
        }

        @Override // com.ttnet.org.chromium.base.CommandLine
        public boolean hasSwitch(String str) {
            return CommandLine.nativeHasSwitch(str);
        }

        @Override // com.ttnet.org.chromium.base.CommandLine
        public void appendSwitchWithValue(String str, String str2) {
            CommandLine.nativeAppendSwitchWithValue(str, str2);
        }
    }

    public static void reset() {
        setInstance(null);
    }

    /* access modifiers changed from: private */
    public static class JavaCommandLine extends CommandLine {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private ArrayList<String> mArgs;
        private int mArgsBegin;
        private HashMap<String, String> mSwitches = new HashMap<>();

        /* access modifiers changed from: protected */
        @Override // com.ttnet.org.chromium.base.CommandLine
        public String[] getCommandLineArguments() {
            ArrayList<String> arrayList = this.mArgs;
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }

        @Override // com.ttnet.org.chromium.base.CommandLine
        public void appendSwitch(String str) {
            appendSwitchWithValue(str, null);
        }

        @Override // com.ttnet.org.chromium.base.CommandLine
        public void appendSwitchesAndArguments(String[] strArr) {
            appendSwitchesInternal(strArr, 0);
        }

        @Override // com.ttnet.org.chromium.base.CommandLine
        public boolean hasSwitch(String str) {
            return this.mSwitches.containsKey(str);
        }

        @Override // com.ttnet.org.chromium.base.CommandLine
        public String getSwitchValue(String str) {
            String str2 = this.mSwitches.get(str);
            if (str2 == null || str2.isEmpty()) {
                return null;
            }
            return str2;
        }

        JavaCommandLine(String[] strArr) {
            super();
            ArrayList<String> arrayList = new ArrayList<>();
            this.mArgs = arrayList;
            this.mArgsBegin = 1;
            if (strArr == null || strArr.length == 0 || strArr[0] == null) {
                arrayList.add("");
                return;
            }
            arrayList.add(strArr[0]);
            appendSwitchesInternal(strArr, 1);
        }

        private void appendSwitchesInternal(String[] strArr, int i) {
            String str;
            boolean z = true;
            for (String str2 : strArr) {
                if (i > 0) {
                    i--;
                } else {
                    if (str2.equals("--")) {
                        z = false;
                    }
                    if (!z || !str2.startsWith("--")) {
                        this.mArgs.add(str2);
                    } else {
                        String[] split = str2.split(ContainerUtils.KEY_VALUE_DELIMITER, 2);
                        if (split.length > 1) {
                            str = split[1];
                        } else {
                            str = null;
                        }
                        appendSwitchWithValue(split[0].substring(2), str);
                    }
                }
            }
        }

        @Override // com.ttnet.org.chromium.base.CommandLine
        public void appendSwitchWithValue(String str, String str2) {
            String str3;
            HashMap<String, String> hashMap = this.mSwitches;
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
            hashMap.put(str, str3);
            String str4 = "--" + str;
            if (str2 != null && !str2.isEmpty()) {
                str4 = str4 + ContainerUtils.KEY_VALUE_DELIMITER + str2;
            }
            ArrayList<String> arrayList = this.mArgs;
            int i = this.mArgsBegin;
            this.mArgsBegin = i + 1;
            arrayList.add(i, str4);
        }
    }

    public static void enableNativeProxy() {
        sCommandLine.set(new NativeCommandLine(getJavaSwitchesOrNull()));
    }

    public static CommandLine getInstance() {
        return sCommandLine.get();
    }

    public static boolean isInitialized() {
        if (sCommandLine.get() != null) {
            return true;
        }
        return false;
    }

    public static String[] getJavaSwitchesOrNull() {
        CommandLine commandLine = sCommandLine.get();
        if (commandLine != null) {
            return commandLine.getCommandLineArguments();
        }
        return null;
    }

    public static void init(String[] strArr) {
        setInstance(new JavaCommandLine(strArr));
    }

    public static void initFromFile(String str) {
        String[] strArr;
        char[] readFileAsUtf8 = readFileAsUtf8(str);
        if (readFileAsUtf8 == null) {
            strArr = null;
        } else {
            strArr = tokenizeQuotedArguments(readFileAsUtf8);
        }
        init(strArr);
    }

    private static void setInstance(CommandLine commandLine) {
        CommandLine andSet = sCommandLine.getAndSet(commandLine);
        if (andSet != null) {
            andSet.destroy();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.addSuppressed(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static char[] readFileAsUtf8(java.lang.String r3) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ IOException -> 0x002a }
            r3.<init>(r0)     // Catch:{ IOException -> 0x002a }
            long r0 = r0.length()     // Catch:{ all -> 0x001e }
            int r1 = (int) r0     // Catch:{ all -> 0x001e }
            char[] r0 = new char[r1]     // Catch:{ all -> 0x001e }
            int r1 = r3.read(r0)     // Catch:{ all -> 0x001e }
            r2 = 0
            char[] r0 = java.util.Arrays.copyOfRange(r0, r2, r1)     // Catch:{ all -> 0x001e }
            r3.close()
            return r0
        L_0x001e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0025 }
            goto L_0x0029
        L_0x0025:
            r3 = move-exception
            r0.addSuppressed(r3)
        L_0x0029:
            throw r1
        L_0x002a:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.CommandLine.readFileAsUtf8(java.lang.String):char[]");
    }

    static String[] tokenizeQuotedArguments(char[] cArr) {
        if (cArr.length <= 65536) {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = null;
            char c = 0;
            for (char c2 : cArr) {
                if ((c == 0 && (c2 == '\'' || c2 == '\"')) || c2 == c) {
                    if (sb != null && sb.length() > 0 && sb.charAt(sb.length() - 1) == '\\') {
                        sb.setCharAt(sb.length() - 1, c2);
                    } else if (c == 0) {
                        c = c2;
                    } else {
                        c = 0;
                    }
                } else if (c != 0 || !Character.isWhitespace(c2)) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(c2);
                } else if (sb != null) {
                    arrayList.add(sb.toString());
                    sb = null;
                }
            }
            if (sb != null) {
                if (c != 0) {
                    Log.w("CommandLine", "Unterminated quoted string: " + ((Object) sb));
                }
                arrayList.add(sb.toString());
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        throw new RuntimeException("Flags file too big: " + cArr.length);
    }

    public String getSwitchValue(String str, String str2) {
        String switchValue = getSwitchValue(str);
        return TextUtils.isEmpty(switchValue) ? str2 : switchValue;
    }
}
