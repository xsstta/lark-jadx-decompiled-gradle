package org.apache.commons.net.ftp;

public enum FTPCmd {
    ABOR,
    ACCT,
    ALLO,
    APPE,
    CDUP,
    CWD,
    DELE,
    EPRT,
    EPSV,
    FEAT,
    HELP,
    LIST,
    MDTM,
    MFMT,
    MKD,
    MLSD,
    MLST,
    MODE,
    NLST,
    NOOP,
    PASS,
    PASV,
    PORT,
    PWD,
    QUIT,
    REIN,
    REST,
    RETR,
    RMD,
    RNFR,
    RNTO,
    SITE,
    SMNT,
    STAT,
    STOR,
    STOU,
    STRU,
    SYST,
    TYPE,
    USER;
    
    public static final FTPCmd ABORT;
    public static final FTPCmd ACCOUNT;
    public static final FTPCmd ALLOCATE;
    public static final FTPCmd APPEND;
    public static final FTPCmd CHANGE_TO_PARENT_DIRECTORY;
    public static final FTPCmd CHANGE_WORKING_DIRECTORY;
    public static final FTPCmd DATA_PORT;
    public static final FTPCmd DELETE;
    public static final FTPCmd FEATURES;
    public static final FTPCmd FILE_STRUCTURE;
    public static final FTPCmd GET_MOD_TIME;
    public static final FTPCmd LOGOUT;
    public static final FTPCmd MAKE_DIRECTORY;
    public static final FTPCmd MOD_TIME;
    public static final FTPCmd NAME_LIST;
    public static final FTPCmd PASSIVE;
    public static final FTPCmd PASSWORD;
    public static final FTPCmd PRINT_WORKING_DIRECTORY;
    public static final FTPCmd REINITIALIZE;
    public static final FTPCmd REMOVE_DIRECTORY;
    public static final FTPCmd RENAME_FROM;
    public static final FTPCmd RENAME_TO;
    public static final FTPCmd REPRESENTATION_TYPE;
    public static final FTPCmd RESTART;
    public static final FTPCmd RETRIEVE;
    public static final FTPCmd SET_MOD_TIME = MFMT;
    public static final FTPCmd SITE_PARAMETERS;
    public static final FTPCmd STATUS;
    public static final FTPCmd STORE;
    public static final FTPCmd STORE_UNIQUE;
    public static final FTPCmd STRUCTURE_MOUNT;
    public static final FTPCmd SYSTEM;
    public static final FTPCmd TRANSFER_MODE = MODE;
    public static final FTPCmd USERNAME;

    public final String getCommand() {
        return name();
    }

    static {
        FTPCmd fTPCmd;
        FTPCmd fTPCmd2;
        FTPCmd fTPCmd3;
        FTPCmd fTPCmd4;
        FTPCmd fTPCmd5;
        FTPCmd fTPCmd6;
        FTPCmd fTPCmd7;
        FTPCmd fTPCmd8;
        FTPCmd fTPCmd9;
        FTPCmd fTPCmd10;
        FTPCmd fTPCmd11;
        FTPCmd fTPCmd12;
        FTPCmd fTPCmd13;
        FTPCmd fTPCmd14;
        FTPCmd fTPCmd15;
        FTPCmd fTPCmd16;
        FTPCmd fTPCmd17;
        FTPCmd fTPCmd18;
        FTPCmd fTPCmd19;
        FTPCmd fTPCmd20;
        FTPCmd fTPCmd21;
        FTPCmd fTPCmd22;
        FTPCmd fTPCmd23;
        FTPCmd fTPCmd24;
        FTPCmd fTPCmd25;
        FTPCmd fTPCmd26;
        FTPCmd fTPCmd27;
        FTPCmd fTPCmd28;
        FTPCmd fTPCmd29;
        FTPCmd fTPCmd30;
        FTPCmd fTPCmd31;
        ABORT = fTPCmd;
        ACCOUNT = fTPCmd2;
        ALLOCATE = fTPCmd3;
        APPEND = fTPCmd4;
        CHANGE_TO_PARENT_DIRECTORY = fTPCmd5;
        CHANGE_WORKING_DIRECTORY = fTPCmd6;
        DATA_PORT = fTPCmd14;
        DELETE = fTPCmd7;
        FEATURES = fTPCmd8;
        FILE_STRUCTURE = fTPCmd28;
        GET_MOD_TIME = fTPCmd9;
        LOGOUT = fTPCmd16;
        MAKE_DIRECTORY = fTPCmd10;
        MOD_TIME = fTPCmd9;
        NAME_LIST = fTPCmd11;
        PASSIVE = fTPCmd13;
        PASSWORD = fTPCmd12;
        PRINT_WORKING_DIRECTORY = fTPCmd15;
        REINITIALIZE = fTPCmd17;
        REMOVE_DIRECTORY = fTPCmd20;
        RENAME_FROM = fTPCmd21;
        RENAME_TO = fTPCmd22;
        REPRESENTATION_TYPE = fTPCmd30;
        RESTART = fTPCmd18;
        RETRIEVE = fTPCmd19;
        SITE_PARAMETERS = fTPCmd23;
        STATUS = fTPCmd25;
        STORE = fTPCmd26;
        STORE_UNIQUE = fTPCmd27;
        STRUCTURE_MOUNT = fTPCmd24;
        SYSTEM = fTPCmd29;
        USERNAME = fTPCmd31;
    }
}
