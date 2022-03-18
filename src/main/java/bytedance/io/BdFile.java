package bytedance.io;

import bytedance.io.exception.IllegalPathException;
import bytedance.p050a.C1673b;
import bytedance.p052c.C1681b;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.net.URI;
import java.util.ArrayList;

public class BdFile extends File {
    private static final C1673b fms = C1673b.m7425a();

    public BdFile getAbsoluteFile() {
        try {
            return new BdFile(getAbsolutePath());
        } catch (IllegalPathException e) {
            C1681b.m7445a(e.toString());
            return null;
        }
    }

    public String getParent() {
        String parent = super.getParent();
        if (parent == null) {
            return null;
        }
        try {
            return new BdFile(parent).getPath();
        } catch (IllegalPathException e) {
            C1681b.m7445a(e.toString());
            return null;
        }
    }

    public BdFile getParentFile() {
        String parent = super.getParent();
        if (parent == null) {
            return null;
        }
        try {
            return new BdFile(parent);
        } catch (IllegalPathException e) {
            C1681b.m7445a(e.toString());
            return null;
        }
    }

    public BdFile[] listFiles() {
        String[] list = list();
        if (list == null) {
            return null;
        }
        int length = list.length;
        BdFile[] bdFileArr = new BdFile[length];
        for (int i = 0; i < length; i++) {
            try {
                bdFileArr[i] = new BdFile(getPath(), list[i]);
            } catch (IllegalPathException e) {
                C1681b.m7445a(e.toString());
            }
        }
        return bdFileArr;
    }

    public BdFile(String str) throws IllegalPathException {
        super(fms.mo8555a(str));
    }

    public BdFile(URI uri) throws IllegalPathException {
        super(fms.mo8557a(uri));
    }

    @Override // java.io.File
    public BdFile[] listFiles(FileFilter fileFilter) {
        BdFile bdFile;
        String[] list = list();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            try {
                bdFile = new BdFile(getPath(), str);
            } catch (IllegalPathException e) {
                C1681b.m7445a(e.toString());
                bdFile = null;
            }
            if (fileFilter == null || fileFilter.accept(bdFile)) {
                arrayList.add(bdFile);
            }
        }
        return (BdFile[]) arrayList.toArray(new BdFile[arrayList.size()]);
    }

    @Override // java.io.File
    public BdFile[] listFiles(FilenameFilter filenameFilter) {
        String[] list = list();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (filenameFilter == null || filenameFilter.accept(this, str)) {
                try {
                    arrayList.add(new BdFile(getPath(), str));
                } catch (IllegalPathException e) {
                    C1681b.m7445a(e.toString());
                }
            }
        }
        return (BdFile[]) arrayList.toArray(new BdFile[arrayList.size()]);
    }

    public BdFile(File file, String str) throws IllegalPathException {
        super(fms.mo8554a(file, str));
    }

    public BdFile(String str, String str2) throws IllegalPathException {
        super(fms.mo8556a(str, str2));
    }
}
