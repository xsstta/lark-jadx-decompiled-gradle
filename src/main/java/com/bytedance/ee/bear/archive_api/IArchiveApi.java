package com.bytedance.ee.bear.archive_api;

import com.bytedance.ee.bear.libarchive.ArchiveEntry;
import java.io.IOException;
import java.util.List;

public interface IArchiveApi {
    int extractAll(String str, String str2, String str3) throws IOException;

    int extractEntry(String str, String str2, String str3, String str4) throws IOException;

    List<ArchiveEntry> getFileList(String str) throws IOException;

    boolean isEncrypted(String str) throws IOException;
}
