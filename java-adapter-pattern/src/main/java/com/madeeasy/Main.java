package com.madeeasy;

import com.madeeasy.impl.OldDotMatrixPrinter;
import com.madeeasy.impl.PrinterAdapter;

public class Main {
    public static void main(String[] args) {
        OldPrinter oldPrinter = new OldDotMatrixPrinter();
        NewPrinter newPrinter = new PrinterAdapter(oldPrinter);
        newPrinter.printDocument();
    }
}