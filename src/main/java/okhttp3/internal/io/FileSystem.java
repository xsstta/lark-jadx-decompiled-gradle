package okhttp3.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import okio.AbstractC69722t;
import okio.AbstractC69723u;
import okio.C69705k;

public interface FileSystem {
    public static final FileSystem SYSTEM = new FileSystem() {
        /* class okhttp3.internal.io.FileSystem.C696861 */

        @Override // okhttp3.internal.io.FileSystem
        public boolean exists(File file) {
            return file.exists();
        }

        @Override // okhttp3.internal.io.FileSystem
        public long size(File file) {
            return file.length();
        }

        @Override // okhttp3.internal.io.FileSystem
        public AbstractC69723u source(File file) throws FileNotFoundException {
            return C69705k.m267595a(file);
        }

        @Override // okhttp3.internal.io.FileSystem
        public AbstractC69722t appendingSink(File file) throws FileNotFoundException {
            try {
                return C69705k.m267602c(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C69705k.m267602c(file);
            }
        }

        @Override // okhttp3.internal.io.FileSystem
        public AbstractC69722t sink(File file) throws FileNotFoundException {
            try {
                return C69705k.m267599b(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C69705k.m267599b(file);
            }
        }

        @Override // okhttp3.internal.io.FileSystem
        public void delete(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
        }

        @Override // okhttp3.internal.io.FileSystem
        public void deleteContents(File file) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        deleteContents(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException("failed to delete " + file2);
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: " + file);
        }

        @Override // okhttp3.internal.io.FileSystem
        public void rename(File file, File file2) throws IOException {
            delete(file2);
            if (!file.renameTo(file2)) {
                throw new IOException("failed to rename " + file + " to " + file2);
            }
        }
    };

    AbstractC69722t appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    AbstractC69722t sink(File file) throws FileNotFoundException;

    long size(File file);

    AbstractC69723u source(File file) throws FileNotFoundException;
}
