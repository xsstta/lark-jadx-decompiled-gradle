package com.ss.android.vc.entity.request;

public class CreateDocEntityRequest {

    public enum CreateDocType {
        UNKNOWN(0),
        DOC(1),
        SHEET(2),
        BITABLE(7),
        MINDNOTE(10),
        FILE(11),
        SLIDE(14),
        WIKI(15),
        DOCX(21);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static CreateDocType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return DOC;
            }
            if (i == 2) {
                return SHEET;
            }
            if (i == 7) {
                return BITABLE;
            }
            if (i == 21) {
                return DOCX;
            }
            if (i == 10) {
                return MINDNOTE;
            }
            if (i == 11) {
                return FILE;
            }
            if (i == 14) {
                return SLIDE;
            }
            if (i != 15) {
                return null;
            }
            return WIKI;
        }

        private CreateDocType(int i) {
            this.value = i;
        }
    }
}
