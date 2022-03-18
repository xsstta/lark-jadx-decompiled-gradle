package com.tt.refer.impl.business.file;

import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.infra.file.Stats;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J$\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J&\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J&\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J&\u0010\r\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J&\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\u0016\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\u0017\u001a\u00020\u00182\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\u001a\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\u001b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\"\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J$\u0010\u001f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010 \u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J&\u0010!\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J&\u0010\"\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001e\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&JA\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010(\u001a\u0004\u0018\u00010&2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010)J$\u0010*\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010 \u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010+\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J&\u0010,\u001a\u00020\u00132\b\u0010-\u001a\u0004\u0018\u00010\u00052\b\u0010.\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J&\u0010/\u001a\u00020\u00132\b\u00100\u001a\u0004\u0018\u0001012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J&\u0010/\u001a\u00020\u00132\b\u00100\u001a\u0004\u0018\u00010$2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u00062"}, d2 = {"Lcom/tt/refer/impl/business/file/ITTFileService;", "", "canRead", "", "ttFile", "Lcom/tt/refer/impl/business/file/TTFile;", "context", "Lcom/tt/refer/impl/business/file/TTFileContext;", "canWrite", "isRemove", "copy", "from", "to", "copySystemFile", "file", "Ljava/io/File;", "inputStream", "Ljava/io/InputStream;", "decryptFile", "", "srcTTFile", "destTTFile", "exists", "getStat", "Lcom/larksuite/component/openplatform/core/plugin/infra/file/Stats;", "getSystemFile", "isDirectory", "isOverSizeLimit", "listDir", "", "", "mkDir", "recursive", "move", "moveSystemFile", "readFile", "", "position", "", "length", "threshold", "(Lcom/tt/refer/impl/business/file/TTFile;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/tt/refer/impl/business/file/TTFileContext;)[B", "rmDir", "rmFile", "unzip", "zipTTFile", "targetTTFile", "writeFile", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/nio/ByteBuffer;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.impl.business.file.d */
public interface ITTFileService {
    /* renamed from: a */
    void mo235599a(ByteBuffer byteBuffer, TTFile gVar, TTFileContext hVar) throws TTFileException;

    /* renamed from: a */
    void mo235600a(byte[] bArr, TTFile gVar, TTFileContext hVar) throws TTFileException;

    /* renamed from: a */
    boolean mo235602a(TTFile gVar, TTFile gVar2, TTFileContext hVar) throws TTFileException;

    /* renamed from: a */
    boolean mo235603a(TTFile gVar, TTFileContext hVar) throws TTFileException;

    /* renamed from: a */
    boolean mo235604a(TTFile gVar, boolean z, TTFileContext hVar) throws TTFileException;

    /* renamed from: a */
    boolean mo235605a(File file, TTFile gVar, TTFileContext hVar) throws TTFileException;

    /* renamed from: a */
    boolean mo235606a(InputStream inputStream, TTFile gVar, TTFileContext hVar) throws TTFileException;

    /* renamed from: a */
    byte[] mo235607a(TTFile gVar, Long l, Long l2, Long l3, TTFileContext hVar) throws TTFileException;

    /* renamed from: b */
    boolean mo235610b(TTFile gVar, TTFile gVar2, TTFileContext hVar) throws TTFileException;

    /* renamed from: b */
    boolean mo235611b(TTFile gVar, boolean z, TTFileContext hVar) throws TTFileException;

    /* renamed from: b */
    boolean mo235612b(File file, TTFile gVar, TTFileContext hVar) throws TTFileException;

    /* renamed from: b */
    byte[] mo235613b(TTFile gVar, TTFileContext hVar) throws TTFileException;

    /* renamed from: c */
    Stats mo235614c(TTFile gVar, TTFileContext hVar) throws TTFileException;

    /* renamed from: c */
    void mo235616c(TTFile gVar, TTFile gVar2, TTFileContext hVar) throws TTFileException;

    /* renamed from: c */
    boolean mo235617c(TTFile gVar, boolean z, TTFileContext hVar) throws TTFileException;

    /* renamed from: d */
    void mo235619d(TTFile gVar, TTFile gVar2, TTFileContext hVar) throws TTFileException;

    /* renamed from: d */
    boolean mo235620d(TTFile gVar, TTFileContext hVar) throws TTFileException;

    /* renamed from: e */
    List<String> mo235622e(TTFile gVar, TTFileContext hVar) throws TTFileException;

    /* renamed from: g */
    boolean mo235629g(TTFile gVar, TTFileContext hVar) throws TTFileException;

    /* renamed from: i */
    File mo235635i(TTFile gVar, TTFileContext hVar) throws TTFileException;
}
