package org.apache.commons.compress.archivers.zip;

import java.util.zip.ZipException;

/* renamed from: org.apache.commons.compress.archivers.zip.r */
public interface AbstractC69778r {
    byte[] getCentralDirectoryData();

    ZipShort getCentralDirectoryLength();

    ZipShort getHeaderId();

    byte[] getLocalFileDataData();

    ZipShort getLocalFileDataLength();

    void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException;

    void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException;
}
