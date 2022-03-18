package com.bytedance.common.profilesdk.util;

import android.os.SystemClock;
import com.bytedance.common.profilesdk.deximage.Deximage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CmdUtils {
    private static void consumeInputStream(final InputStream inputStream) {
        Deximage.sExecutor.execute(new Runnable() {
            /* class com.bytedance.common.profilesdk.util.CmdUtils.RunnableC36251 */

            public void run() {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            Logger.m15163d("exec cmd info : " + readLine);
                        } else {
                            try {
                                bufferedReader.close();
                                return;
                            } catch (IOException e) {
                                e.printStackTrace();
                                return;
                            }
                        }
                    } catch (IOException e2) {
                        Logger.m15163d("execCmd consumeInputStream failed : " + e2);
                        bufferedReader.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                        throw th;
                    }
                }
            }
        });
    }

    public static Process exec(String[] strArr) throws IOException {
        return Runtime.getRuntime().exec(strArr);
    }

    public static boolean execCmd(String[] strArr) {
        long uptimeMillis;
        StringBuilder sb;
        if (strArr.length <= 0) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : strArr) {
            sb2.append(str);
            sb2.append(" ");
        }
        int i = -1;
        long uptimeMillis2 = SystemClock.uptimeMillis();
        try {
            Process exec = exec(strArr);
            InputStream errorStream = exec.getErrorStream();
            InputStream inputStream = exec.getInputStream();
            consumeInputStream(errorStream);
            consumeInputStream(inputStream);
            i = exec.waitFor();
            if (i != 0) {
                Logger.m15163d("Exec failed: " + Arrays.toString(strArr));
                uptimeMillis = SystemClock.uptimeMillis() - uptimeMillis2;
                sb = new StringBuilder();
                sb.append("Reture: ");
                sb.append(i);
                sb.append(" cmd: ");
                sb.append(sb2.toString());
                sb.append(uptimeMillis);
                sb.append("ms");
                Logger.m15163d(sb.toString());
                return false;
            }
            Logger.m15163d("Reture: " + i + " cmd: " + sb2.toString() + (SystemClock.uptimeMillis() - uptimeMillis2) + "ms");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            Logger.m15163d("Exec failed IOException: " + e.toString());
            uptimeMillis = SystemClock.uptimeMillis() - uptimeMillis2;
            sb = new StringBuilder();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
            Logger.m15163d("Exec failed InterruptedException: " + e2.toString());
            uptimeMillis = SystemClock.uptimeMillis() - uptimeMillis2;
            sb = new StringBuilder();
        } catch (Throwable th) {
            Logger.m15163d("Reture: " + -1 + " cmd: " + sb2.toString() + (SystemClock.uptimeMillis() - uptimeMillis2) + "ms");
            throw th;
        }
    }
}
