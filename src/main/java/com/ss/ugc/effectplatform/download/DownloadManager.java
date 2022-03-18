package com.ss.ugc.effectplatform.download;

import bytekn.foundation.concurrent.clock.DefaultClock;
import bytekn.foundation.io.file.IOException;
import bytekn.foundation.logger.Logger;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ugc.effectplatform.bridge.network.HTTPMethod;
import com.ss.ugc.effectplatform.bridge.network.INetworkClient;
import com.ss.ugc.effectplatform.bridge.network.NetRequest;
import com.ss.ugc.effectplatform.bridge.network.NetResponse;
import com.ss.ugc.effectplatform.exception.CurrentEditingException;
import com.ss.ugc.effectplatform.exception.MD5Exception;
import com.ss.ugc.effectplatform.exception.NetException;
import com.ss.ugc.effectplatform.exception.UnzipException;
import com.ss.ugc.effectplatform.exception.UrlNotExistException;
import com.ss.ugc.effectplatform.util.FileUtils;
import com.ss.ugc.effectplatform.util.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0010H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/ugc/effectplatform/download/DownloadManager;", "", "networkClient", "Lcom/ss/ugc/effectplatform/bridge/network/INetworkClient;", "writeDisk", "Lcom/ss/ugc/effectplatform/download/IWriteDisk;", "unZipper", "Lcom/ss/ugc/effectplatform/download/IUnZipper;", "downloadType", "Lcom/ss/ugc/effectplatform/download/DownloadType;", "(Lcom/ss/ugc/effectplatform/bridge/network/INetworkClient;Lcom/ss/ugc/effectplatform/download/IWriteDisk;Lcom/ss/ugc/effectplatform/download/IUnZipper;Lcom/ss/ugc/effectplatform/download/DownloadType;)V", "checkDownloadUrlValid", "", "downloadUrl", "", "download", "", "listener", "Lcom/ss/ugc/effectplatform/download/DownloadListener;", "printLog", "", "stepStr", "costMills", "Builder", "Companion", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.download.d */
public final class DownloadManager {

    /* renamed from: a */
    public static final Companion f164891a = new Companion(null);

    /* renamed from: b */
    private INetworkClient f164892b;

    /* renamed from: c */
    private IWriteDisk f164893c;

    /* renamed from: d */
    private IUnZipper f164894d;

    /* renamed from: e */
    private DownloadType f164895e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/ugc/effectplatform/download/DownloadManager$Companion;", "", "()V", "TAG", "", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.download.d$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\nR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/ugc/effectplatform/download/DownloadManager$Builder;", "", "()V", "downloadType", "Lcom/ss/ugc/effectplatform/download/DownloadType;", "networkClient", "Lcom/ss/ugc/effectplatform/bridge/network/INetworkClient;", "unZipper", "Lcom/ss/ugc/effectplatform/download/IUnZipper;", "writeDisk", "Lcom/ss/ugc/effectplatform/download/IWriteDisk;", "build", "Lcom/ss/ugc/effectplatform/download/DownloadManager;", "setDownloadType", "setNetworkClient", "setUnZipper", "setWriteDisk", "cacheStrategy", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.download.d$a */
    public static final class Builder {

        /* renamed from: a */
        public IWriteDisk f164896a;

        /* renamed from: b */
        public INetworkClient f164897b;

        /* renamed from: c */
        private DownloadType f164898c;

        /* renamed from: d */
        private IUnZipper f164899d;

        /* renamed from: a */
        public final DownloadManager mo227775a() {
            Builder aVar = this;
            if (aVar.f164897b == null) {
                throw new IllegalArgumentException("networkClient is required to setup!");
            } else if (aVar.f164896a != null) {
                INetworkClient cVar = this.f164897b;
                if (cVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("networkClient");
                }
                IWriteDisk iVar = this.f164896a;
                if (iVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("writeDisk");
                }
                return new DownloadManager(cVar, iVar, this.f164899d, this.f164898c, null);
            } else {
                throw new IllegalArgumentException("cacheStrategy is required to setup!");
            }
        }

        /* renamed from: a */
        public final Builder mo227772a(DownloadType downloadType) {
            Builder aVar = this;
            aVar.f164898c = downloadType;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo227771a(INetworkClient cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "networkClient");
            Builder aVar = this;
            aVar.f164897b = cVar;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo227773a(IUnZipper hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "unZipper");
            Builder aVar = this;
            aVar.f164899d = hVar;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo227774a(IWriteDisk iVar) {
            Intrinsics.checkParameterIsNotNull(iVar, "cacheStrategy");
            Builder aVar = this;
            aVar.f164896a = iVar;
            return aVar;
        }
    }

    /* renamed from: a */
    private final boolean m256789a(String str) {
        return !TextUtils.f165135a.mo228357a(str);
    }

    /* renamed from: a */
    private final void m256788a(String str, long j) {
        String str2;
        Logger bVar = Logger.f5760a;
        StringBuilder sb = new StringBuilder();
        DownloadType downloadType = this.f164895e;
        if (downloadType != null) {
            str2 = downloadType.name();
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append("-->");
        sb.append(str);
        sb.append(" , cost ");
        sb.append(j);
        sb.append(" mills.");
        bVar.mo8662a("DownloadManager", sb.toString());
    }

    /* renamed from: a */
    public final long mo227770a(String str, DownloadListener cVar) {
        Intrinsics.checkParameterIsNotNull(str, "downloadUrl");
        Logger.f5760a.mo8662a("DownloadManager", "downloadUrl=" + str + " start");
        DownloadResult eVar = new DownloadResult();
        long a = DefaultClock.f5722a.mo8623a();
        if (m256789a(str)) {
            if (cVar != null) {
                cVar.mo227766a();
            }
            NetResponse eVar2 = null;
            try {
                eVar2 = this.f164892b.mo207366a(new NetRequest(str, HTTPMethod.GET, null, null, null, false, 28, null));
            } catch (Exception e) {
                eVar.mo227778a(new NetException(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, Reflection.getOrCreateKotlinClass(e.getClass()).getQualifiedName() + ':' + e.getMessage()));
            }
            if (eVar2 == null || eVar2.mo227746a() != 200) {
                eVar.mo227777a(DefaultClock.f5722a.mo8623a() - a);
                if (eVar2 != null) {
                    int a2 = eVar2.mo227746a();
                    String d = eVar2.mo227749d();
                    if (d == null) {
                        d = "status code is " + eVar2.mo227746a();
                    }
                    eVar.mo227778a(new NetException(a2, d));
                }
                m256788a("fetchFromNetwork failed! url: " + str, eVar.mo227776a());
                if (cVar != null) {
                    cVar.mo227768a(eVar);
                }
                return -1;
            }
            eVar.mo227780b(DefaultClock.f5722a.mo8623a() - a);
            m256788a("fetchInputStream success! url: " + str, eVar.mo227779b());
            long a3 = DefaultClock.f5722a.mo8623a();
            try {
                String a4 = this.f164893c.mo227769a(new ByteReadFileInputStream(eVar2.mo227747b()), eVar2.mo227748c(), cVar);
                if (a4 == null) {
                    return -1;
                }
                long a5 = FileUtils.f165113a.mo228318a(a4);
                eVar.mo227786e(a5);
                eVar.mo227782c(DefaultClock.f5722a.mo8623a() - a3);
                if (a5 > 0) {
                    m256788a("writeToDisk success! url: " + str, eVar.mo227781c());
                    IUnZipper hVar = this.f164894d;
                    if (hVar == null) {
                        eVar.mo227777a(DefaultClock.f5722a.mo8623a() - a);
                        m256788a("unnecessary to unzip, download success", eVar.mo227776a());
                        if (cVar != null) {
                            cVar.mo227768a(eVar);
                        }
                        return a5;
                    }
                    long a6 = DefaultClock.f5722a.mo8623a();
                    try {
                        boolean a7 = hVar.mo227789a(a4);
                        eVar.mo227784d(DefaultClock.f5722a.mo8623a() - a6);
                        eVar.mo227777a(DefaultClock.f5722a.mo8623a() - a);
                        if (a7) {
                            m256788a("unzip success! url: " + str, eVar.mo227783d());
                            m256788a("download success! url: " + str, eVar.mo227776a());
                            if (cVar != null) {
                                cVar.mo227768a(eVar);
                            }
                            return a5;
                        }
                        eVar.mo227778a(new UnzipException("unzip file failed!"));
                        m256788a("unzip failed! url: " + str, eVar.mo227783d());
                        m256788a("download failed! url: " + str, eVar.mo227776a());
                        if (cVar == null) {
                            return -1;
                        }
                        cVar.mo227768a(eVar);
                        return -1;
                    } catch (Exception e2) {
                        if ((e2 instanceof MD5Exception) || (e2 instanceof CurrentEditingException) || (e2 instanceof IOException) || (e2 instanceof UnzipException)) {
                            throw e2;
                        }
                        throw new UnzipException(Reflection.getOrCreateKotlinClass(e2.getClass()).getQualifiedName() + ':' + e2.getMessage());
                    }
                } else {
                    m256788a("writeToDisk failed! url: " + str, eVar.mo227781c());
                    eVar.mo227777a(DefaultClock.f5722a.mo8623a() - a);
                    eVar.mo227778a(new IOException("write file to disk failed!"));
                    if (cVar != null) {
                        cVar.mo227768a(eVar);
                    }
                    return a5;
                }
            } catch (Exception e3) {
                if ((e3 instanceof MD5Exception) || (e3 instanceof CurrentEditingException) || (e3 instanceof IOException)) {
                    throw e3;
                }
                throw new IOException(Reflection.getOrCreateKotlinClass(e3.getClass()).getQualifiedName() + ':' + e3.getMessage());
            }
        } else {
            eVar.mo227777a(DefaultClock.f5722a.mo8623a() - a);
            eVar.mo227778a(new UrlNotExistException("invalid url"));
            m256788a("download failed! url: " + str, eVar.mo227776a());
            if (cVar != null) {
                cVar.mo227768a(eVar);
            }
            return -1;
        }
    }

    private DownloadManager(INetworkClient cVar, IWriteDisk iVar, IUnZipper hVar, DownloadType downloadType) {
        this.f164892b = cVar;
        this.f164893c = iVar;
        this.f164894d = hVar;
        this.f164895e = downloadType;
    }

    public /* synthetic */ DownloadManager(INetworkClient cVar, IWriteDisk iVar, IUnZipper hVar, DownloadType downloadType, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, iVar, hVar, downloadType);
    }
}
