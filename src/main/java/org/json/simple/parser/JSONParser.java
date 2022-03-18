package org.json.simple.parser;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONParser {
    private LinkedList handlerStatusStack;
    private Yylex lexer = new Yylex((Reader) null);
    private int status = 0;
    private Yytoken token = null;

    private List createArrayContainer(ContainerFactory containerFactory) {
        if (containerFactory == null) {
            return new JSONArray();
        }
        List creatArrayContainer = containerFactory.creatArrayContainer();
        return creatArrayContainer == null ? new JSONArray() : creatArrayContainer;
    }

    private Map createObjectContainer(ContainerFactory containerFactory) {
        if (containerFactory == null) {
            return new JSONObject();
        }
        Map createObjectContainer = containerFactory.createObjectContainer();
        return createObjectContainer == null ? new JSONObject() : createObjectContainer;
    }

    private void nextToken() throws ParseException, IOException {
        Yytoken yylex = this.lexer.yylex();
        this.token = yylex;
        if (yylex == null) {
            this.token = new Yytoken(-1, null);
        }
    }

    private int peekStatus(LinkedList linkedList) {
        if (linkedList.size() == 0) {
            return -1;
        }
        return ((Integer) linkedList.getFirst()).intValue();
    }

    public int getPosition() {
        return this.lexer.getPosition();
    }

    public Object parse(Reader reader) throws IOException, ParseException {
        return parse(reader, (ContainerFactory) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        if (r1 != 6) goto L_0x0033;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01a7 A[Catch:{ IOException -> 0x01d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01bb A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object parse(java.io.Reader r9, org.json.simple.parser.ContainerFactory r10) throws java.io.IOException, org.json.simple.parser.ParseException {
        /*
        // Method dump skipped, instructions count: 469
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.simple.parser.JSONParser.parse(java.io.Reader, org.json.simple.parser.ContainerFactory):java.lang.Object");
    }

    public Object parse(String str) throws ParseException {
        return parse(str, (ContainerFactory) null);
    }

    public Object parse(String str, ContainerFactory containerFactory) throws ParseException {
        try {
            return parse(new StringReader(str), containerFactory);
        } catch (IOException e) {
            throw new ParseException(-1, 2, e);
        }
    }

    public void parse(Reader reader, ContentHandler contentHandler) throws IOException, ParseException {
        parse(reader, contentHandler, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r0 != 6) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028 A[Catch:{ IOException -> 0x01f4, ParseException -> 0x01f0, RuntimeException -> 0x01ec, Error -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x002a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x014a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01b6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01dc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b A[Catch:{ IOException -> 0x01f4, ParseException -> 0x01f0, RuntimeException -> 0x01ec, Error -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b A[Catch:{ IOException -> 0x01f4, ParseException -> 0x01f0, RuntimeException -> 0x01ec, Error -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5 A[Catch:{ IOException -> 0x01f4, ParseException -> 0x01f0, RuntimeException -> 0x01ec, Error -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0101 A[Catch:{ IOException -> 0x01f4, ParseException -> 0x01f0, RuntimeException -> 0x01ec, Error -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0167 A[Catch:{ IOException -> 0x01f4, ParseException -> 0x01f0, RuntimeException -> 0x01ec, Error -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01c6 A[Catch:{ IOException -> 0x01f4, ParseException -> 0x01f0, RuntimeException -> 0x01ec, Error -> 0x01e8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void parse(java.io.Reader r8, org.json.simple.parser.ContentHandler r9, boolean r10) throws java.io.IOException, org.json.simple.parser.ParseException {
        /*
        // Method dump skipped, instructions count: 524
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.simple.parser.JSONParser.parse(java.io.Reader, org.json.simple.parser.ContentHandler, boolean):void");
    }

    public void parse(String str, ContentHandler contentHandler) throws ParseException {
        parse(str, contentHandler, false);
    }

    public void parse(String str, ContentHandler contentHandler, boolean z) throws ParseException {
        try {
            parse(new StringReader(str), contentHandler, z);
        } catch (IOException e) {
            throw new ParseException(-1, 2, e);
        }
    }

    public void reset() {
        this.token = null;
        this.status = 0;
        this.handlerStatusStack = null;
    }

    public void reset(Reader reader) {
        this.lexer.yyreset(reader);
        reset();
    }
}
