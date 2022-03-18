package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmBytecodeBinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;

public class ReadKotlinClassHeaderAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationVisitor {
    private static final Map<ClassId, KotlinClassHeader.Kind> HEADER_KINDS;
    private static final boolean IGNORE_OLD_METADATA = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
    public JvmBytecodeBinaryVersion bytecodeVersion;
    public String[] data;
    public int extraInt;
    public String extraString;
    public KotlinClassHeader.Kind headerKind;
    private String[] incompatibleData;
    public int[] metadataVersionArray;
    public String packageName;
    public String[] strings;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = ShareHitPoint.f121868c;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    public void visitEnd() {
    }

    private class KotlinMetadataArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "classLiteralValue";
            } else if (i == 7) {
                objArr[0] = "classId";
            } else if (i == 4) {
                objArr[0] = "enumClassId";
            } else if (i != 5) {
                objArr[0] = "name";
            } else {
                objArr[0] = "enumEntryName";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            switch (i) {
                case 2:
                    objArr[2] = "visitArray";
                    break;
                case 3:
                case 4:
                case 5:
                    objArr[2] = "visitEnum";
                    break;
                case 6:
                case 7:
                    objArr[2] = "visitAnnotation";
                    break;
                default:
                    objArr[2] = "visitClassLiteral";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(Name name, ClassId classId) {
            if (name == null) {
                $$$reportNull$$$0(6);
            }
            if (classId != null) {
                return null;
            }
            $$$reportNull$$$0(7);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitClassLiteral(Name name, ClassLiteralValue classLiteralValue) {
            if (name == null) {
                $$$reportNull$$$0(0);
            }
            if (classLiteralValue == null) {
                $$$reportNull$$$0(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnd() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnum(Name name, ClassId classId, Name name2) {
            if (name == null) {
                $$$reportNull$$$0(3);
            }
            if (classId == null) {
                $$$reportNull$$$0(4);
            }
            if (name2 == null) {
                $$$reportNull$$$0(5);
            }
        }

        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor dataArrayVisitor() {
            return new CollectStringArrayAnnotationVisitor() {
                /* class kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.KotlinMetadataArgumentVisitor.C691831 */

                private static /* synthetic */ void $$$reportNull$$$0(int i) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
                }

                /* access modifiers changed from: protected */
                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
                public void visitEnd(String[] strArr) {
                    if (strArr == null) {
                        $$$reportNull$$$0(0);
                    }
                    ReadKotlinClassHeaderAnnotationVisitor.this.data = strArr;
                }
            };
        }

        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor stringsArrayVisitor() {
            return new CollectStringArrayAnnotationVisitor() {
                /* class kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.KotlinMetadataArgumentVisitor.C691842 */

                private static /* synthetic */ void $$$reportNull$$$0(int i) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
                }

                /* access modifiers changed from: protected */
                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
                public void visitEnd(String[] strArr) {
                    if (strArr == null) {
                        $$$reportNull$$$0(0);
                    }
                    ReadKotlinClassHeaderAnnotationVisitor.this.strings = strArr;
                }
            };
        }

        private KotlinMetadataArgumentVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(Name name) {
            if (name == null) {
                $$$reportNull$$$0(2);
            }
            String asString = name.asString();
            if ("d1".equals(asString)) {
                return dataArrayVisitor();
            }
            if ("d2".equals(asString)) {
                return stringsArrayVisitor();
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visit(Name name, Object obj) {
            if (name != null) {
                String asString = name.asString();
                if ("k".equals(asString)) {
                    if (obj instanceof Integer) {
                        ReadKotlinClassHeaderAnnotationVisitor.this.headerKind = KotlinClassHeader.Kind.getById(((Integer) obj).intValue());
                    }
                } else if ("mv".equals(asString)) {
                    if (obj instanceof int[]) {
                        ReadKotlinClassHeaderAnnotationVisitor.this.metadataVersionArray = (int[]) obj;
                    }
                } else if ("bv".equals(asString)) {
                    if (obj instanceof int[]) {
                        ReadKotlinClassHeaderAnnotationVisitor.this.bytecodeVersion = new JvmBytecodeBinaryVersion((int[]) obj);
                    }
                } else if ("xs".equals(asString)) {
                    if (obj instanceof String) {
                        ReadKotlinClassHeaderAnnotationVisitor.this.extraString = (String) obj;
                    }
                } else if ("xi".equals(asString)) {
                    if (obj instanceof Integer) {
                        ReadKotlinClassHeaderAnnotationVisitor.this.extraInt = ((Integer) obj).intValue();
                    }
                } else if ("pn".equals(asString) && (obj instanceof String)) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.packageName = (String) obj;
                }
            }
        }
    }

    private class OldDeprecatedAnnotationArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "classLiteralValue";
            } else if (i == 7) {
                objArr[0] = "classId";
            } else if (i == 4) {
                objArr[0] = "enumClassId";
            } else if (i != 5) {
                objArr[0] = "name";
            } else {
                objArr[0] = "enumEntryName";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            switch (i) {
                case 2:
                    objArr[2] = "visitArray";
                    break;
                case 3:
                case 4:
                case 5:
                    objArr[2] = "visitEnum";
                    break;
                case 6:
                case 7:
                    objArr[2] = "visitAnnotation";
                    break;
                default:
                    objArr[2] = "visitClassLiteral";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(Name name, ClassId classId) {
            if (name == null) {
                $$$reportNull$$$0(6);
            }
            if (classId != null) {
                return null;
            }
            $$$reportNull$$$0(7);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitClassLiteral(Name name, ClassLiteralValue classLiteralValue) {
            if (name == null) {
                $$$reportNull$$$0(0);
            }
            if (classLiteralValue == null) {
                $$$reportNull$$$0(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnd() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnum(Name name, ClassId classId, Name name2) {
            if (name == null) {
                $$$reportNull$$$0(3);
            }
            if (classId == null) {
                $$$reportNull$$$0(4);
            }
            if (name2 == null) {
                $$$reportNull$$$0(5);
            }
        }

        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor dataArrayVisitor() {
            return new CollectStringArrayAnnotationVisitor() {
                /* class kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.OldDeprecatedAnnotationArgumentVisitor.C691851 */

                private static /* synthetic */ void $$$reportNull$$$0(int i) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
                }

                /* access modifiers changed from: protected */
                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
                public void visitEnd(String[] strArr) {
                    if (strArr == null) {
                        $$$reportNull$$$0(0);
                    }
                    ReadKotlinClassHeaderAnnotationVisitor.this.data = strArr;
                }
            };
        }

        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor stringsArrayVisitor() {
            return new CollectStringArrayAnnotationVisitor() {
                /* class kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.OldDeprecatedAnnotationArgumentVisitor.C691862 */

                private static /* synthetic */ void $$$reportNull$$$0(int i) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
                }

                /* access modifiers changed from: protected */
                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
                public void visitEnd(String[] strArr) {
                    if (strArr == null) {
                        $$$reportNull$$$0(0);
                    }
                    ReadKotlinClassHeaderAnnotationVisitor.this.strings = strArr;
                }
            };
        }

        private OldDeprecatedAnnotationArgumentVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(Name name) {
            if (name == null) {
                $$$reportNull$$$0(2);
            }
            String asString = name.asString();
            if (Constants.ScionAnalytics.MessageType.DATA_MESSAGE.equals(asString) || "filePartClassNames".equals(asString)) {
                return dataArrayVisitor();
            }
            if ("strings".equals(asString)) {
                return stringsArrayVisitor();
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visit(Name name, Object obj) {
            String str;
            if (name != null) {
                String asString = name.asString();
                if (HiAnalyticsConstant.HaKey.BI_KEY_VERSION.equals(asString)) {
                    if (obj instanceof int[]) {
                        int[] iArr = (int[]) obj;
                        ReadKotlinClassHeaderAnnotationVisitor.this.metadataVersionArray = iArr;
                        if (ReadKotlinClassHeaderAnnotationVisitor.this.bytecodeVersion == null) {
                            ReadKotlinClassHeaderAnnotationVisitor.this.bytecodeVersion = new JvmBytecodeBinaryVersion(iArr);
                        }
                    }
                } else if ("multifileClassName".equals(asString)) {
                    ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = ReadKotlinClassHeaderAnnotationVisitor.this;
                    if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        str = null;
                    }
                    readKotlinClassHeaderAnnotationVisitor.extraString = str;
                }
            }
        }
    }

    private static abstract class CollectStringArrayAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {
        private final List<String> strings = new ArrayList();

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumEntryName";
            } else if (i != 2) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classLiteralValue";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i != 2) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitClassLiteral";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visitClassLiteral(ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                $$$reportNull$$$0(2);
            }
        }

        /* access modifiers changed from: protected */
        public abstract void visitEnd(String[] strArr);

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visitEnum(ClassId classId, Name name) {
            if (classId == null) {
                $$$reportNull$$$0(0);
            }
            if (name == null) {
                $$$reportNull$$$0(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visitEnd() {
            visitEnd((String[]) this.strings.toArray(new String[0]));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visit(Object obj) {
            if (obj instanceof String) {
                this.strings.add((String) obj);
            }
        }
    }

    private boolean shouldHaveData() {
        if (this.headerKind == KotlinClassHeader.Kind.CLASS || this.headerKind == KotlinClassHeader.Kind.FILE_FACADE || this.headerKind == KotlinClassHeader.Kind.MULTIFILE_CLASS_PART) {
            return true;
        }
        return false;
    }

    static {
        HashMap hashMap = new HashMap();
        HEADER_KINDS = hashMap;
        hashMap.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader.Kind.CLASS);
        hashMap.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader.Kind.FILE_FACADE);
        hashMap.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader.Kind.MULTIFILE_CLASS);
        hashMap.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);
        hashMap.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader.Kind.SYNTHETIC_CLASS);
    }

    public KotlinClassHeader createHeader() {
        int[] iArr;
        boolean z;
        if (this.headerKind == null || (iArr = this.metadataVersionArray) == null) {
            return null;
        }
        if ((this.extraInt & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        JvmMetadataVersion jvmMetadataVersion = new JvmMetadataVersion(iArr, z);
        if (!jvmMetadataVersion.isCompatible()) {
            this.incompatibleData = this.data;
            this.data = null;
        } else if (shouldHaveData() && this.data == null) {
            return null;
        }
        KotlinClassHeader.Kind kind = this.headerKind;
        JvmBytecodeBinaryVersion jvmBytecodeBinaryVersion = this.bytecodeVersion;
        if (jvmBytecodeBinaryVersion == null) {
            jvmBytecodeBinaryVersion = JvmBytecodeBinaryVersion.INVALID_VERSION;
        }
        return new KotlinClassHeader(kind, jvmMetadataVersion, jvmBytecodeBinaryVersion, this.data, this.incompatibleData, this.strings, this.extraString, this.extraInt, this.packageName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(ClassId classId, SourceElement sourceElement) {
        KotlinClassHeader.Kind kind;
        if (classId == null) {
            $$$reportNull$$$0(0);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(1);
        }
        if (classId.asSingleFqName().equals(JvmAnnotationNames.METADATA_FQ_NAME)) {
            return new KotlinMetadataArgumentVisitor();
        }
        if (IGNORE_OLD_METADATA || this.headerKind != null || (kind = HEADER_KINDS.get(classId)) == null) {
            return null;
        }
        this.headerKind = kind;
        return new OldDeprecatedAnnotationArgumentVisitor();
    }
}
