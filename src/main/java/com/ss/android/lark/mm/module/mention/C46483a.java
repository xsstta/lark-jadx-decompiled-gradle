package com.ss.android.lark.mm.module.mention;

import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import java.util.ArrayDeque;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* renamed from: com.ss.android.lark.mm.module.mention.a */
public class C46483a implements Html.TagHandler, ContentHandler {

    /* renamed from: a */
    private final AbstractC46484a f117038a;

    /* renamed from: b */
    private ContentHandler f117039b;

    /* renamed from: c */
    private Editable f117040c;

    /* renamed from: d */
    private ArrayDeque<Boolean> f117041d = new ArrayDeque<>();

    /* renamed from: com.ss.android.lark.mm.module.mention.a$a */
    public interface AbstractC46484a {
        /* renamed from: a */
        boolean mo163357a(boolean z, String str, Editable editable, Attributes attributes);
    }

    @Override // org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        this.f117039b.endDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
        this.f117039b.startDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) throws SAXException {
        this.f117039b.endPrefixMapping(str);
    }

    public void setDocumentLocator(Locator locator) {
        this.f117039b.setDocumentLocator(locator);
    }

    @Override // org.xml.sax.ContentHandler
    public void skippedEntity(String str) throws SAXException {
        this.f117039b.skippedEntity(str);
    }

    public C46483a(AbstractC46484a aVar) {
        this.f117038a = aVar;
    }

    @Override // org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) throws SAXException {
        this.f117039b.processingInstruction(str, str2);
    }

    @Override // org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) throws SAXException {
        this.f117039b.startPrefixMapping(str, str2);
    }

    /* renamed from: a */
    public static Spanned m183845a(String str, AbstractC46484a aVar) {
        return Html.fromHtml(str, null, new C46483a(aVar));
    }

    /* renamed from: a */
    public static String m183846a(Attributes attributes, String str) {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (str.equals(attributes.getLocalName(i))) {
                return attributes.getValue(i);
            }
        }
        return null;
    }

    @Override // org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) throws SAXException {
        this.f117039b.characters(cArr, i, i2);
    }

    @Override // org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
        this.f117039b.ignorableWhitespace(cArr, i, i2);
    }

    @Override // org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        if (!this.f117041d.removeLast().booleanValue()) {
            this.f117039b.endElement(str, str2, str3);
        }
        this.f117038a.mo163357a(false, str2, this.f117040c, null);
    }

    public void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        if (this.f117039b == null) {
            this.f117040c = editable;
            this.f117039b = xMLReader.getContentHandler();
            xMLReader.setContentHandler(this);
            this.f117041d.addLast(Boolean.FALSE);
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        boolean a = this.f117038a.mo163357a(true, str2, this.f117040c, attributes);
        this.f117041d.addLast(Boolean.valueOf(a));
        if (!a) {
            this.f117039b.startElement(str, str2, str3, attributes);
        }
    }
}
