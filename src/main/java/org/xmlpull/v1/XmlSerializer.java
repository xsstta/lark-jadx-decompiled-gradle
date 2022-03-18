package org.xmlpull.v1;

import java.io.IOException;
import java.io.OutputStream;

public interface XmlSerializer {
    XmlSerializer attribute(String str, String str2, String str3) throws IOException, IllegalArgumentException, IllegalStateException;

    void endDocument() throws IOException, IllegalArgumentException, IllegalStateException;

    XmlSerializer endTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException;

    void setOutput(OutputStream outputStream, String str) throws IOException, IllegalArgumentException, IllegalStateException;

    void startDocument(String str, Boolean bool) throws IOException, IllegalArgumentException, IllegalStateException;

    XmlSerializer startTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException;
}
