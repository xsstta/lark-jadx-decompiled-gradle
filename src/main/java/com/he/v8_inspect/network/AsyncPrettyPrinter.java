package com.he.v8_inspect.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public interface AsyncPrettyPrinter {
    PrettyPrinterDisplayType getPrettifiedType();

    void printTo(PrintWriter printWriter, InputStream inputStream) throws IOException;
}
