package com.bytedance.ee.bear.document.imageviewer.diagram;

import com.bytedance.ee.util.io.NonProguard;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/document/imageviewer/diagram/DiagramData;", "", "()V", "Base64Data", "RESULT", "SVGData", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DiagramData {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/bytedance/ee/bear/document/imageviewer/diagram/DiagramData$RESULT;", "", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    @Retention(RetentionPolicy.SOURCE)
    public @interface RESULT {
        public static final Companion Companion = Companion.f16392a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/document/imageviewer/diagram/DiagramData$RESULT$Companion;", "", "()V", "FAIL", "", "SUCCESS", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.document.imageviewer.diagram.DiagramData$RESULT$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f16392a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/document/imageviewer/diagram/DiagramData$Base64Data;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "base64String", "", "getBase64String", "()Ljava/lang/String;", "setBase64String", "(Ljava/lang/String;)V", "result", "result$annotations", "getResult", "setResult", "uuid", "getUuid", "setUuid", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class Base64Data implements NonProguard {
        private String base64String;
        private String result;
        private String uuid;

        public static /* synthetic */ void result$annotations() {
        }

        public final String getBase64String() {
            return this.base64String;
        }

        public final String getResult() {
            return this.result;
        }

        public final String getUuid() {
            return this.uuid;
        }

        public final void setBase64String(String str) {
            this.base64String = str;
        }

        public final void setResult(String str) {
            this.result = str;
        }

        public final void setUuid(String str) {
            this.uuid = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/document/imageviewer/diagram/DiagramData$SVGData;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "result", "", "result$annotations", "getResult", "()Ljava/lang/String;", "setResult", "(Ljava/lang/String;)V", "svgString", "getSvgString", "setSvgString", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class SVGData implements NonProguard {
        private String result;
        private String svgString;

        public static /* synthetic */ void result$annotations() {
        }

        public final String getResult() {
            return this.result;
        }

        public final String getSvgString() {
            return this.svgString;
        }

        public final void setResult(String str) {
            this.result = str;
        }

        public final void setSvgString(String str) {
            this.svgString = str;
        }
    }
}
