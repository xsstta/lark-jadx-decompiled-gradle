package org.apache.commons.compress.archivers.zip;

import java.util.zip.ZipException;

public class Zip64RequiredException extends ZipException {
    private static final long serialVersionUID = 20110809;

    public Zip64RequiredException(String str) {
        super(str);
    }

    static String getEntryTooBigMessage(ZipArchiveEntry zipArchiveEntry) {
        return zipArchiveEntry.getName() + "'s size exceeds the limit of 4GByte.";
    }
}
