package org.apache.commons.compress.archivers.dump;

public final class DumpArchiveConstants {

    public enum COMPRESSION_TYPE {
        ZLIB(0),
        BZLIB(1),
        LZO(2);
        
        int code;

        public static COMPRESSION_TYPE find(int i) {
            COMPRESSION_TYPE[] values = values();
            for (COMPRESSION_TYPE compression_type : values) {
                if (compression_type.code == i) {
                    return compression_type;
                }
            }
            return null;
        }

        private COMPRESSION_TYPE(int i) {
            this.code = i;
        }
    }

    public enum SEGMENT_TYPE {
        TAPE(1),
        INODE(2),
        BITS(3),
        ADDR(4),
        END(5),
        CLRI(6);
        
        int code;

        public static SEGMENT_TYPE find(int i) {
            SEGMENT_TYPE[] values = values();
            for (SEGMENT_TYPE segment_type : values) {
                if (segment_type.code == i) {
                    return segment_type;
                }
            }
            return null;
        }

        private SEGMENT_TYPE(int i) {
            this.code = i;
        }
    }
}
