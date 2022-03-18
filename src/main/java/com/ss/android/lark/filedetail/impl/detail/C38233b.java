package com.ss.android.lark.filedetail.impl.detail;

import android.text.TextUtils;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.filedetail.FileDetailModule;
import com.ss.android.lark.filedetail.impl.statistic.FileHitPoint;
import com.ss.android.lark.filedetail.p1885a.AbstractC38197a;

/* renamed from: com.ss.android.lark.filedetail.impl.detail.b */
public class C38233b {

    /* renamed from: a */
    public static AbstractC38197a.AbstractC38199b f98042a = FileDetailModule.f97880b.mo139564a().getChatDependency();

    /* renamed from: a */
    public static String m150367a(long j) {
        switch ((int) j) {
            case 1:
                return "main";
            case 2:
                return "thread";
            case 3:
                return "chat_history";
            case 4:
                return "search";
            case 5:
                return "pin";
            case 6:
                return "favorites";
            default:
                return "";
        }
    }

    /* renamed from: a */
    public static void m150368a(final FileContent fileContent, final String str, final String str2) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.filedetail.impl.detail.C38233b.RunnableC382396 */

            public void run() {
                String str;
                Chat a = C38233b.f98042a.mo139599a(str);
                if (a != null) {
                    FileHitPoint.Companion aVar = FileHitPoint.f98024a;
                    String g = C26311p.m95287g(fileContent.getName());
                    Long valueOf = Long.valueOf(fileContent.getSize() / 1024);
                    if (a.getType() == Chat.Type.P2P) {
                        str = "single";
                    } else {
                        str = "group";
                    }
                    aVar.mo139784d(g, valueOf, str, str2);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m150369a(final String str, final FileContent fileContent, final int i) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.filedetail.impl.detail.C38233b.RunnableC382374 */

            public void run() {
                Chat a;
                String str;
                String a2 = C38233b.m150367a((long) i);
                if (!TextUtils.isEmpty(a2) && (a = C38233b.f98042a.mo139599a(str)) != null) {
                    FileHitPoint.Companion aVar = FileHitPoint.f98024a;
                    String g = C26311p.m95287g(fileContent.getName());
                    Long valueOf = Long.valueOf(fileContent.getSize() / 1024);
                    if (a.getType() == Chat.Type.P2P) {
                        str = "single";
                    } else {
                        str = "group";
                    }
                    aVar.mo139783c(g, valueOf, str, a2);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m150371a(final String str, final FileContent fileContent, final long j) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.filedetail.impl.detail.C38233b.RunnableC382341 */

            public void run() {
                Chat a;
                String str;
                String a2 = C38233b.m150367a(j);
                if (!TextUtils.isEmpty(a2) && (a = C38233b.f98042a.mo139599a(str)) != null) {
                    FileHitPoint.Companion aVar = FileHitPoint.f98024a;
                    String g = C26311p.m95287g(fileContent.getName());
                    Long valueOf = Long.valueOf(fileContent.getSize() / 1024);
                    if (a.getType() == Chat.Type.P2P) {
                        str = "single";
                    } else {
                        str = "group";
                    }
                    aVar.mo139781b(g, valueOf, str, a2);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m150373a(final String str, final FileContent fileContent, final boolean z) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.filedetail.impl.detail.C38233b.RunnableC382352 */

            public void run() {
                String str;
                String str2;
                Chat a = C38233b.f98042a.mo139599a(str);
                if (a != null) {
                    FileHitPoint.Companion aVar = FileHitPoint.f98024a;
                    String g = C26311p.m95287g(fileContent.getName());
                    Long valueOf = Long.valueOf(fileContent.getSize() / 1024);
                    if (a.getType() == Chat.Type.P2P) {
                        str = "single";
                    } else {
                        str = "group";
                    }
                    if (z) {
                        str2 = "T";
                    } else {
                        str2 = "F";
                    }
                    aVar.mo139778a(g, valueOf, str, str2);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m150370a(final String str, final FileContent fileContent, final int i, final String str2) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.filedetail.impl.detail.C38233b.RunnableC382385 */

            public void run() {
                Chat a;
                String str;
                String a2 = C38233b.m150367a((long) i);
                if (!TextUtils.isEmpty(a2) && (a = C38233b.f98042a.mo139599a(str)) != null) {
                    FileHitPoint.Companion aVar = FileHitPoint.f98024a;
                    String g = C26311p.m95287g(fileContent.getName());
                    Long valueOf = Long.valueOf(fileContent.getSize() / 1024);
                    if (a.getType() == Chat.Type.P2P) {
                        str = "single";
                    } else {
                        str = "group";
                    }
                    aVar.mo139782b(g, valueOf, str, str2, a2);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m150372a(final String str, final FileContent fileContent, final long j, FileDownloadState fileDownloadState, final String str2) {
        if (fileDownloadState == FileDownloadState.DOWNLOADING) {
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.filedetail.impl.detail.C38233b.RunnableC382363 */

                public void run() {
                    Chat a;
                    String str;
                    String a2 = C38233b.m150367a(j);
                    if (!TextUtils.isEmpty(a2) && (a = C38233b.f98042a.mo139599a(str)) != null) {
                        FileHitPoint.Companion aVar = FileHitPoint.f98024a;
                        String g = C26311p.m95287g(fileContent.getName());
                        Long valueOf = Long.valueOf(fileContent.getSize() / 1024);
                        if (a.getType() == Chat.Type.P2P) {
                            str = "single";
                        } else {
                            str = "group";
                        }
                        aVar.mo139779a(g, valueOf, str, str2, a2);
                    }
                }
            });
        }
    }
}
