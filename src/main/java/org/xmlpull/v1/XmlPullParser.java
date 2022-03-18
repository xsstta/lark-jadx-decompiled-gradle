package org.xmlpull.v1;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public interface XmlPullParser {
    public static final String[] TYPES = {"START_DOCUMENT", "END_DOCUMENT", "START_TAG", "END_TAG", "TEXT", "CDSECT", "ENTITY_REF", "IGNORABLE_WHITESPACE", "PROCESSING_INSTRUCTION", "COMMENT", "DOCDECL"};

    int getAttributeCount();

    String getAttributeName(int i);

    String getAttributeNamespace(int i);

    String getAttributePrefix(int i);

    String getAttributeValue(int i);

    String getAttributeValue(String str, String str2);

    int getColumnNumber();

    int getDepth();

    int getEventType() throws XmlPullParserException;

    int getLineNumber();

    String getName();

    String getNamespace();

    String getPositionDescription();

    String getPrefix();

    String getText();

    boolean isEmptyElementTag() throws XmlPullParserException;

    int next() throws XmlPullParserException, IOException;

    int nextToken() throws XmlPullParserException, IOException;

    void require(int i, String str, String str2) throws XmlPullParserException, IOException;

    void setFeature(String str, boolean z) throws XmlPullParserException;

    void setInput(InputStream inputStream, String str) throws XmlPullParserException;

    void setInput(Reader reader) throws XmlPullParserException;
}
