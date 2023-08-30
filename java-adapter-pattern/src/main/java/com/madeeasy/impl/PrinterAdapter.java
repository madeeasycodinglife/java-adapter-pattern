package com.madeeasy.impl;

import com.madeeasy.NewPrinter;
import com.madeeasy.OldPrinter;

public class PrinterAdapter implements NewPrinter {
    private OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void printDocument() {
        oldPrinter.print();
    }
}
