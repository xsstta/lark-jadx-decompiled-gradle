package com.larksuite.framework.apiplugin.common;

import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;

public class OpenPlatform {

    public static final class CopySystemFileRequest extends C25920a {
        @JSONField(name = "destTTPath")
        @LKRequiredParam
        public String mDestTTPath;
        @JSONField(name = "srcPath")
        @LKRequiredParam
        public String mSrcPath;
        @JSONField(name = "tag")
        @LKRequiredParam
        public String mTag;
    }

    public static final class CopySystemFileResponse extends C25921b {
        @JSONField(name = "success")
        public boolean mSuccess;
    }

    public static final class GetSystemFileRequest extends C25920a {
        @JSONField(name = "ttFilePath")
        @LKRequiredParam
        public String mTTFilePath;
        @JSONField(name = "tag")
        @LKRequiredParam
        public String mTag;
    }

    public static final class GetSystemFileResponse extends C25921b {
        @JSONField(name = "filePath")
        public String mFilePath;
    }

    public static class OpenSchemaAsyncHandlerRequest extends C25920a {
        @JSONField(name = "external")
        public boolean mExternal;
        @JSONField(name = "schema")
        @LKRequiredParam
        public String mSchema;
    }

    public static class OpenSchemaAsyncHandlerResponse extends C25921b {
    }

    public static class Requests {

        public static class ConvertFilePathToTTFile extends C25920a {
            @JSONField(name = "filePath")
            @LKRequiredParam
            public String mFilePath;
        }

        public static class GetTempDirPath extends C25920a {
        }

        public static class LinkTrace extends C25920a {
            @JSONField(name = "linkTraceId")
            @LKRequiredParam
            public String mLinkTraceId;
            @JSONField(name = "originTrace")
            @LKRequiredParam
            public String mOriginTrace;
        }

        public static class OnActivityResult extends C25920a {
            @JSONField(name = "requestCode")
            public int mRequestCode;
            @JSONField(name = "resultCode")
            public int mResultCode;
        }
    }

    public static class Responses {

        public static class ConvertFilePathToTTFile extends C25921b {
            @JSONField(name = "ttFilePath")
            public String mTTFilePath;
        }

        public static class GetTempDirPath extends C25921b {
            @JSONField(name = "tempDirPath")
            public String mTempDirPath;
        }

        public static class LinkTrace extends C25921b {
        }
    }
}
